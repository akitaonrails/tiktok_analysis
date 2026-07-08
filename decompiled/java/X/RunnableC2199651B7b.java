package X;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.exception.DownloadHttpException;
import com.ss.android.socialbase.downloader.exception.DownloadOnlyWifiException;
import com.ss.android.socialbase.downloader.exception.DownloadOutOfSpaceException;
import com.ss.android.socialbase.downloader.exception.DownloadPauseReserveWifiException;
import com.ss.android.socialbase.downloader.exception.DownloadRetryNeedlessException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import com.ss.android.socialbase.downloader.model.HttpHeader;
import com.ss.android.socialbase.downloader.network.DeviceBandwidthSampler;
import com.ss.android.socialbase.downloader.service.IDownloadIdGeneratorService;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.SSLHandshakeException;

/* JADX INFO: renamed from: X.1B7b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class RunnableC2199651B7b implements Runnable, InterfaceC2200111B8v {
    public static final String LLJLLL = RunnableC2199651B7b.class.getSimpleName();
    public Future LL;
    public final DownloadTask LLILLJJLI;
    public volatile boolean LLILLL;
    public AtomicInteger LLILZ;
    public volatile C2199741B7k LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public final AtomicBoolean LLJ;
    public final InterfaceC2199141B5c LLJIJIL;
    public final DownloadInfo LLJILJIL;
    public final C1B7V LLJILJILJ;
    public volatile BaseException LLJILLL;
    public C1B8V LLJJ;
    public InterfaceC2199921B8c LLJJI;
    public final InterfaceC2199321B5u LLJJIII;
    public final InterfaceC2199481B6k LLJJIJI;
    public boolean LLJJIJIL;
    public boolean LLJJJ;
    public String LLJJJIL;
    public String LLJJJJ;
    public boolean LLJJJJJIL;
    public long LLJJJJLIIL;
    public long LLJJL;
    public final C2199751B7l LLJJLIIIJLLLLLLLZ;
    public final C1490870otp LLJL;
    public final C1498750p6X LLJLIL;
    public int LLJLL;
    public volatile C2199711B7h LLJLLIL;
    public volatile C1B7U LLJI = C1B7U.RUN_STATUS_NONE;
    public volatile int LLJJIJIIJIL = 5;
    public boolean LLJLILLLLZIIL = true;

    public final boolean LIZIZ() {
        if (this.LLJILJIL.isChunked()) {
            DownloadInfo downloadInfo = this.LLJILJIL;
            downloadInfo.setTotalBytes(downloadInfo.getCurBytes());
        }
        if (C1490830otl.LIZ()) {
            String str = LLJLLL;
            int id = this.LLJILJIL.getId();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("GetCurBytes: ");
            sbLIZ.append(this.LLJILJIL.getCurBytes());
            sbLIZ.append(" getTotalBytes: ");
            sbLIZ.append(this.LLJILJIL.getTotalBytes());
            C1490830otl.LIZLLL(id, str, "checkCompletedByteValid", C2188811AlT.LIZIZ(sbLIZ));
        }
        if (this.LLJILJIL.getCurBytes() > 0 && (this.LLJILJIL.isIgnoreDataVerify() || (this.LLJILJIL.getTotalBytes() > 0 && this.LLJILJIL.getCurBytes() == this.LLJILJIL.getTotalBytes()))) {
            return true;
        }
        this.LLJILJIL.setByteInvalidRetryStatus(C1B7Z.BYTE_INVALID_RETRY_STATUS_RESTART);
        this.LLJILJIL.reset();
        this.LLJIJIL.updateDownloadInfo(this.LLJILJIL);
        this.LLJIJIL.LJJJZ(this.LLJILJIL.getId());
        C2199671B7d.LJ(this.LLJILJIL, true);
        return false;
    }

    public final void LIZLLL() throws C1B8T, BaseException {
        C1B7G c1b7gLJIILIIL;
        int id = this.LLJILJIL.getId();
        DownloadInfo downloadInfo = this.LLJILJIL;
        Context context = C2199681B7e.LIZ;
        int iGenerate = ((IDownloadIdGeneratorService) C1B82.LIZ(IDownloadIdGeneratorService.class)).generate(downloadInfo);
        if (this.LLJJLIIIJLLLLLLLZ.LJIIIIZZ("opt_file_exist_check", 0) == 1) {
            if (!TextUtils.isEmpty(this.LLJILJIL.getMd5()) && this.LLJILJIL.isDownloaded() && !this.LLJILJIL.isExpiredRedownload() && !this.LLJJJJJIL) {
                throw new BaseException(1009, "file has downloaded");
            }
        } else if (this.LLJILJIL.isDownloaded() && !this.LLJILJIL.isExpiredRedownload() && !this.LLJJJJJIL) {
            throw new BaseException(1009, "file has downloaded");
        }
        DownloadInfo downloadInfo2 = this.LLJIJIL.getDownloadInfo(iGenerate);
        if (downloadInfo2 == null || (c1b7gLJIILIIL = C2199681B7e.LJIILIIL()) == null || downloadInfo2.getId() == id || !downloadInfo2.equalsTask(this.LLJILJIL)) {
            return;
        }
        if (c1b7gLJIILIIL.LJIILJJIL(downloadInfo2.getId())) {
            this.LLJIJIL.LJIIIIZZ(id);
            throw new BaseException(1025, "another same task is downloading");
        }
        C2199671B7d.LJ(this.LLJILJIL, true);
        this.LLJIJIL.LJIIIIZZ(iGenerate);
        String str = C2199661B7c.LIZ;
        if (downloadInfo2.isFileDataValid()) {
            this.LLJILJIL.copyFromCacheData(downloadInfo2, false);
            this.LLJIJIL.updateDownloadInfo(this.LLJILJIL);
            throw new C1B8T("retry task because id generator changed");
        }
    }

    public final void LJII() throws BaseException {
        if (TextUtils.isEmpty(this.LLJILJIL.getSavePath())) {
            throw new BaseException(1028, "download savePath can not be empty");
        }
        if (TextUtils.isEmpty(this.LLJILJIL.getName())) {
            throw new BaseException(1029, "download name can not be empty");
        }
        C2199881B7y c2199881B7y = new C2199881B7y(this.LLJILJIL.getSavePath(), this.LLJILJIL.getName(), true, true);
        int i = 0;
        if (c2199881B7y.LIZ.LIZIZ() == -1) {
            LJIIL();
            this.LLJIJIL.LJIIIIZZ(this.LLJILJIL.getId());
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("download savePath error:");
            sbLIZ.append(this.LLJILJIL.getSavePath());
            sbLIZ.append(" extra:");
            sbLIZ.append(c2199881B7y.getExtraMsg());
            throw new BaseException(1081, C2188811AlT.LIZIZ(sbLIZ));
        }
        int iLIZIZ = c2199881B7y.LIZ.LIZIZ();
        if (iLIZIZ == 2 || iLIZIZ == 3 || iLIZIZ == 4 || iLIZIZ == 5) {
            return;
        }
        C0VSJ c0vsj = new C0VSJ(this.LLJILJIL.getSavePath());
        if (c0vsj.exists()) {
            if (c0vsj.isDirectory()) {
                return;
            }
            DownloadInfo downloadInfo = this.LLJILJIL;
            if (downloadInfo != null) {
                i = C2199751B7l.LJFF(downloadInfo.getId(), null).LJIIIIZZ("optimize_save_path", 0) != 1 ? 0 : 1;
            }
            if (i == 0) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("download savePath is not a directory:");
                sbLIZ2.append(this.LLJILJIL.getSavePath());
                throw new BaseException(1031, C2188811AlT.LIZIZ(sbLIZ2));
            }
            c0vsj.delete();
            if (c0vsj.mkdirs() || c0vsj.exists()) {
                return;
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("download savePath is not directory:path=");
            sbLIZ3.append(this.LLJILJIL.getSavePath());
            throw new BaseException(1031, C2188811AlT.LIZIZ(sbLIZ3));
        }
        if (c0vsj.mkdirs() || c0vsj.exists()) {
            return;
        }
        if (C2199751B7l.LJFF(this.LLJILJIL.getId(), null).LJIIIIZZ("opt_mkdir_failed", 0) != 1) {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("download savePath directory can not created:");
            sbLIZ4.append(this.LLJILJIL.getSavePath());
            throw new BaseException(1030, C2188811AlT.LIZIZ(sbLIZ4));
        }
        do {
            int i2 = i + 1;
            if (i < 3) {
                try {
                    Thread.sleep(10L);
                    i = i2;
                } catch (InterruptedException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            if (c0vsj.exists()) {
                return;
            }
            if (C2199671B7d.LJIIIIZZ(this.LLJILJIL.getSavePath()) < 16384) {
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("download savePath directory can not created:");
                sbLIZ5.append(this.LLJILJIL.getSavePath());
                throw new BaseException(1006, C2188811AlT.LIZIZ(sbLIZ5));
            }
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append("download savePath directory can not created:");
            sbLIZ6.append(this.LLJILJIL.getSavePath());
            throw new BaseException(1030, C2188811AlT.LIZIZ(sbLIZ6));
        } while (!c0vsj.mkdirs());
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x0195, code lost:
    
        if (r12.LLJJLIIIJLLLLLLLZ.LJI("fix_file_exist_update_download_info", false) != false) goto L91;
     */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x018b: IF  (r11 I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) == (0 ??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:95:0x01a3 (LINE:395), block:B:87:0x018b */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x018d: IF  (r7 I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) == (0 ??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:91:0x0197 (LINE:397), block:B:88:0x018d */
    /* JADX WARN: Removed duplicated region for block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0146 A[Catch: all -> 0x0184, TryCatch #2 {all -> 0x0184, blocks: (B:64:0x013f, B:66:0x0146, B:68:0x014a, B:81:0x0180, B:82:0x0183), top: B:98:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0166  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIZ() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC2199651B7b.LJIIIZ():void");
    }

    public final void LJIIJ() {
        DownloadInfo downloadInfo = this.LLJILJIL;
        String str = C2199661B7c.LIZ;
        long curBytes = (downloadInfo == null || !downloadInfo.isFileDataValid()) ? 0L : downloadInfo.getCurBytes();
        long curBytes2 = this.LLJILJIL.getCurBytes();
        String str2 = LLJLLL;
        if (curBytes != curBytes2 && C1490830otl.LIZ()) {
            int id = this.LLJILJIL.getId();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Offset:");
            sbLIZ.append(curBytes);
            sbLIZ.append(" curBytes: ");
            sbLIZ.append(curBytes2);
            C1490830otl.LIZLLL(id, str2, "checkTaskCanResume", C2188811AlT.LIZIZ(sbLIZ));
        }
        this.LLJILJIL.setCurBytes(curBytes);
        boolean z = curBytes > 0;
        this.LLILZLL = z;
        if (z || this.LLJJJJJIL) {
            return;
        }
        if (C1490830otl.LIZ()) {
            C1490830otl.LIZLLL(this.LLJILJIL.getId(), str2, "checkTaskCanResume", "deleteAllDownloadFiles");
        }
        this.LLJIJIL.LJJJZ(this.LLJILJIL.getId());
        C2199671B7d.LJ(this.LLJILJIL, true);
    }

    public final void LJIIJJI() throws DownloadRetryNeedlessException {
        if (this.LLJJLIIIJLLLLLLLZ.LJIIIIZZ("opt_network_check", 0) != 1 && this.LLJILJIL.isOnlyWifi()) {
            Context contextLJFF = C2199681B7e.LJFF();
            String str = C2199661B7c.LIZ;
            if (contextLJFF == null || TextUtils.isEmpty("android.permission.ACCESS_NETWORK_STATE") || contextLJFF.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0) {
                throw new DownloadRetryNeedlessException(1019, C786410Ut5.j4("download task need permission:%s", new Object[]{"android.permission.ACCESS_NETWORK_STATE"}));
            }
        }
        if (DeviceBandwidthSampler.LJFF != 1) {
            if (this.LLJILJIL.isOnlyWifi()) {
                DeviceBandwidthSampler.LJFF();
                if (DeviceBandwidthSampler.LIZJ()) {
                    throw new DownloadOnlyWifiException();
                }
            }
            if (this.LLJILJIL.isDownloadFromReserveWifi() && this.LLJILJIL.isPauseReserveOnWifi()) {
                DeviceBandwidthSampler.LJFF();
                if (DeviceBandwidthSampler.LIZJ()) {
                    throw new DownloadPauseReserveWifiException();
                }
            }
        }
    }

    public final void LJIILIIL() {
        InterfaceC2199921B8c interfaceC2199921B8c = this.LLJJI;
        if (interfaceC2199921B8c != null) {
            interfaceC2199921B8c.cancel();
            this.LLJJI = null;
        }
        C1B8V c1b8v = this.LLJJ;
        if (c1b8v != null) {
            c1b8v.end();
            this.LLJJ = null;
        }
    }

    public final void LJIILJJIL() {
        List<InterfaceC2199951B8f> list = C2199681B7e.LJJJI;
        synchronized (list) {
            try {
                for (InterfaceC2199951B8f interfaceC2199951B8f : (ArrayList) list) {
                    if (interfaceC2199951B8f != null) {
                        interfaceC2199951B8f.onStart();
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        try {
            DeviceBandwidthSampler.LIZIZ().LIZLLL();
            LJJIJL();
            DeviceBandwidthSampler.LIZIZ().LJ();
            C2199681B7e.LJJI(this.LLILLJJLI);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            DeviceBandwidthSampler.LIZIZ().LJ();
            throw th2;
        }
    }

    public final boolean LJIJI() {
        if (this.LLJI == C1B7U.RUN_STATUS_ERROR) {
            this.LLJILJILJ.LJI(this.LLJILLL);
            return true;
        }
        if (this.LLJI == C1B7U.RUN_STATUS_CANCELED) {
            this.LLJILJILJ.LJIIL(-4, null, true);
            return true;
        }
        if (this.LLJI == C1B7U.RUN_STATUS_PAUSE) {
            this.LLJILJILJ.LJIIIIZZ();
            return true;
        }
        if (this.LLJI == C1B7U.RUN_STATUS_END_RIGHT_NOW) {
            try {
                this.LLJILJILJ.LIZLLL();
                return true;
            } catch (BaseException e) {
                TryCatchGuardChecker.doCheck(e);
                this.LLJILJILJ.LJI(e);
                return true;
            }
        }
        if (this.LLJI == C1B7U.RUN_STATUS_END_FOR_FILE_EXIST) {
            try {
                this.LLJILJILJ.LJ(this.LLJJJIL, this.LLJJJJ);
                return true;
            } catch (BaseException e2) {
                TryCatchGuardChecker.doCheck(e2);
                this.LLJILJILJ.LJI(e2);
                return true;
            }
        }
        if (this.LLJI == C1B7U.RUN_STATUS_ALL_CHUNK_RETRY_WITH_RESET) {
            this.LLJILJILJ.LJIIIZ(this.LLJILLL, false);
            return false;
        }
        if (this.LLJI == C1B7U.RUN_STATUS_WAITING_ASYNC_HANDLER) {
            return true;
        }
        C1B7U c1b7u = this.LLJI;
        C1B7U c1b7u2 = C1B7U.RUN_STATUS_RETRY_DELAY;
        if (c1b7u == c1b7u2 && (this.LLJILJIL.getCurBytes() <= 0 || this.LLJILJIL.getCurBytes() != this.LLJILJIL.getTotalBytes())) {
            this.LLJI = C1B7U.RUN_STATUS_NONE;
            return this.LLJI == c1b7u2;
        }
        try {
            if (!LIZIZ()) {
                return false;
            }
            this.LLJILJILJ.LJFF();
            C1B8A.LIZ().scheduleRetryWhenHasTaskSucceed();
            return true;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LJJIIZI(new BaseException(1008, C2199671B7d.LJIIL("doTaskStatusHandle onComplete", th)));
            return true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0258 A[Catch: all -> 0x0408, TryCatch #6 {all -> 0x0408, blocks: (B:112:0x0232, B:114:0x0258, B:116:0x025d, B:118:0x0263, B:119:0x0275, B:121:0x0279, B:123:0x0281, B:187:0x038e, B:188:0x03b6, B:128:0x02a2, B:130:0x02c8, B:132:0x02d0, B:134:0x02d8, B:136:0x02de, B:138:0x02e8, B:139:0x02eb, B:142:0x02f5, B:146:0x0306, B:194:0x03e1, B:195:0x03e5, B:184:0x035d, B:186:0x0383, B:202:0x03f6, B:144:0x0301), top: B:226:0x0232, outer: #11, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02c8 A[Catch: all -> 0x0408, TryCatch #6 {all -> 0x0408, blocks: (B:112:0x0232, B:114:0x0258, B:116:0x025d, B:118:0x0263, B:119:0x0275, B:121:0x0279, B:123:0x0281, B:187:0x038e, B:188:0x03b6, B:128:0x02a2, B:130:0x02c8, B:132:0x02d0, B:134:0x02d8, B:136:0x02de, B:138:0x02e8, B:139:0x02eb, B:142:0x02f5, B:146:0x0306, B:194:0x03e1, B:195:0x03e5, B:184:0x035d, B:186:0x0383, B:202:0x03f6, B:144:0x0301), top: B:226:0x0232, outer: #11, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x03fc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:250:0x03fc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:270:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v79, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v87 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJJ() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1058
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC2199651B7b.LJIJJ():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIJJLI() {
        /*
            Method dump skipped, instruction units count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC2199651B7b.LJIJJLI():boolean");
    }

    public final void LJIL() {
        C1B7H c1b7h;
        boolean z = (this.LLJI == C1B7U.RUN_STATUS_PAUSE || this.LLJI == C1B7U.RUN_STATUS_CANCELED) ? false : true;
        boolean zLIZ = C1490830otl.LIZ();
        String str = LLJLLL;
        if (zLIZ) {
            int id = this.LLJILJIL.getId();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("RunStatus: ");
            sbLIZ.append(this.LLJI);
            C1490830otl.LIZLLL(id, str, "endDownloadRunnable", C2188811AlT.LIZIZ(sbLIZ));
        }
        try {
            if (!LJIJI() && 0 == 0) {
                this.LLJJIJIL = true;
                if (C1490830otl.LIZ()) {
                    C1490830otl.LIZLLL(this.LLJILJIL.getId(), str, "endDownloadRunnable", "Jump to restart");
                    return;
                }
                return;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            if (e instanceof BaseException) {
                this.LLJILJILJ.LJI((BaseException) e);
            } else {
                this.LLJILJILJ.LJI(new BaseException(1046, e));
            }
        }
        this.LLJ.set(false);
        if (z) {
            try {
                if (C2199681B7e.LJIILIIL() == null || (c1b7h = C1B7J.LJIIJJI) == null) {
                    return;
                }
                Iterator it2 = ((ConcurrentHashMap) c1b7h.LIZ).entrySet().iterator();
                while (it2.hasNext()) {
                    if (((Map.Entry) it2.next()).getValue() == this) {
                        it2.remove();
                        return;
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                InterfaceC2199431B6f monitorDepend = this.LLILLJJLI.getMonitorDepend();
                DownloadInfo downloadInfo = this.LLJILJIL;
                BaseException baseException = new BaseException(1014, C2199671B7d.LJIIL("removeDownloadRunnable", th));
                DownloadInfo downloadInfo2 = this.LLJILJIL;
                C2199691B7f.LJIIIIZZ(monitorDepend, downloadInfo, baseException, downloadInfo2 != null ? downloadInfo2.getStatus() : 0);
            }
        }
    }

    public final boolean LJJIIZ() {
        return this.LLJI == C1B7U.RUN_STATUS_CANCELED || this.LLJI == C1B7U.RUN_STATUS_PAUSE;
    }

    public final void LJJIJIIJIL() {
        if (this.LLJILJIL.getChunkCount() > 1) {
            this.LLJILJIL.reset();
            this.LLJIJIL.updateDownloadInfo(this.LLJILJIL);
            C2199671B7d.LJ(this.LLJILJIL, true);
        }
    }

    public final void LJJIJIL() {
        if (C2199751B7l.LJFF(this.LLJILJIL.getId(), null).LJIIIIZZ("reset_retain_retry_times", 0) != 1 || this.LLJLL >= 3) {
            return;
        }
        this.LLILZ.set(this.LLJILJIL.isBackUpUrlUsed() ? this.LLJILJIL.getBackUpUrlRetryCount() : this.LLJILJIL.getRetryCount());
        this.LLJLL++;
    }

    public final void LJJIJL() throws Throwable {
        Process.setThreadPriority(10);
        C1B7V c1b7v = this.LLJILJILJ;
        if (!c1b7v.LIZJ.canSkipStatusHandler()) {
            c1b7v.LIZLLL.LJJIJ(c1b7v.LIZJ.getId());
            c1b7v.LJIIL(1, null, true);
        }
        try {
            DownloadInfo downloadInfo = this.LLJILJIL;
            if (downloadInfo != null && this.LLJJL > 0) {
                downloadInfo.increaseDownloadPrepareTime(System.currentTimeMillis() - this.LLJJL);
            }
        } catch (Throwable e) {
        }
        try {
            InterfaceC2199461B6i interceptor = this.LLILLJJLI.getInterceptor();
            if (interceptor != null) {
                if (interceptor.LIZ()) {
                    C1B7V c1b7v2 = this.LLJILJILJ;
                    c1b7v2.LIZJ.setStatus(-7);
                    try {
                        c1b7v2.LIZLLL.LJJIIJ(c1b7v2.LIZJ.getId());
                    } catch (SQLiteException e2) {
                    }
                    c1b7v2.LJIIL(-7, null, true);
                    return;
                }
            }
        } finally {
            try {
            } finally {
            }
        }
        int status = this.LLJILJIL.getStatus();
        if (status != 1 && !this.LLJILJIL.canSkipStatusHandler()) {
            if (status != -2 && status != -4) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("The download Task can't start, because its status is not prepare:");
                sbLIZ.append(status);
                LJJIIZI(new BaseException(LSPassThroughRecordSizeConfig.DEFAULT, C2188811AlT.LIZIZ(sbLIZ)));
            }
            InterfaceC2199431B6f monitorDepend = this.LLILLJJLI.getMonitorDepend();
            DownloadInfo downloadInfo2 = this.LLJILJIL;
            BaseException baseException = new BaseException(1003, "task status is invalid");
            DownloadInfo downloadInfo3 = this.LLJILJIL;
            C2199691B7f.LJIIIIZZ(monitorDepend, downloadInfo2, baseException, downloadInfo3 != null ? downloadInfo3.getStatus() : 0);
            return;
        }
        boolean zLJ = LJ();
        String str = LLJLLL;
        if (zLJ) {
            if (C1490830otl.LIZ()) {
                C1490830otl.LIZLLL(this.LLJILJIL.getId(), str, "runInner", "Stop Download");
                return;
            }
            return;
        }
        while (true) {
            LJIJJ();
            if (!this.LLJJIJIL) {
                return;
            }
            if (this.LLJJIJIIJIL > 0) {
                this.LLJJIJIIJIL--;
            } else {
                if (this.LLJILJIL.getCurBytes() != this.LLJILJIL.getTotalBytes()) {
                    if (C1490830otl.LIZ()) {
                        int id = this.LLJILJIL.getId();
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("ErrorBytesLog:");
                        sbLIZ2.append(this.LLJILJIL.getErrorBytesLog());
                        C1490830otl.LIZLLL(id, str, "runInner", C2188811AlT.LIZIZ(sbLIZ2));
                    }
                    C1B7V c1b7v3 = this.LLJILJILJ;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("current bytes is not equals to total bytes, bytes invalid retry status is : ");
                    sbLIZ3.append(this.LLJILJIL.getByteInvalidRetryStatus());
                    c1b7v3.LJI(new DownloadRetryNeedlessException(1027, C2188811AlT.LIZIZ(sbLIZ3)));
                    return;
                }
                if (this.LLJILJIL.getCurBytes() <= 0) {
                    if (C1490830otl.LIZ()) {
                        int id2 = this.LLJILJIL.getId();
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("ErrorBytesLog:");
                        sbLIZ4.append(this.LLJILJIL.getErrorBytesLog());
                        C1490830otl.LIZLLL(id2, str, "runInner", C2188811AlT.LIZIZ(sbLIZ4));
                    }
                    C1B7V c1b7v4 = this.LLJILJILJ;
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append("curBytes is 0, bytes invalid retry status is : ");
                    sbLIZ5.append(this.LLJILJIL.getByteInvalidRetryStatus());
                    c1b7v4.LJI(new DownloadRetryNeedlessException(1026, C2188811AlT.LIZIZ(sbLIZ5)));
                    return;
                }
                if (this.LLJILJIL.getTotalBytes() <= 0) {
                    if (C1490830otl.LIZ()) {
                        int id3 = this.LLJILJIL.getId();
                        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                        sbLIZ6.append("ErrorBytesLog:");
                        sbLIZ6.append(this.LLJILJIL.getErrorBytesLog());
                        C1490830otl.LIZLLL(id3, str, "runInner", C2188811AlT.LIZIZ(sbLIZ6));
                    }
                    C1B7V c1b7v5 = this.LLJILJILJ;
                    StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                    sbLIZ7.append("TotalBytes is 0, bytes invalid retry status is : ");
                    sbLIZ7.append(this.LLJILJIL.getByteInvalidRetryStatus());
                    c1b7v5.LJI(new DownloadRetryNeedlessException(1044, C2188811AlT.LIZIZ(sbLIZ7)));
                    return;
                }
            }
        }
    }

    public final void LJJIL() {
        DownloadInfo downloadInfo = this.LLJILJIL;
        if (downloadInfo == null) {
            return;
        }
        int retryCount = downloadInfo.getRetryCount() - this.LLJILJIL.getCurRetryTime();
        if (retryCount < 0) {
            retryCount = 0;
        }
        AtomicInteger atomicInteger = this.LLILZ;
        if (atomicInteger == null) {
            this.LLILZ = new AtomicInteger(retryCount);
        } else {
            atomicInteger.set(retryCount);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("DownloadRunnable@c233.run");
        try {
            LJIILJJIL();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("DownloadRunnable@c233.run");
    }

    public final boolean LJ() {
        if (!LJJIIZ() && this.LLJILJIL.getStatus() != -2) {
            return false;
        }
        if (LJJIIZ()) {
            return true;
        }
        if (this.LLJILJIL.getStatus() == -2) {
            this.LLJI = C1B7U.RUN_STATUS_PAUSE;
            return true;
        }
        if (this.LLJILJIL.getStatus() != -4) {
            return true;
        }
        this.LLJI = C1B7U.RUN_STATUS_CANCELED;
        return true;
    }

    public final void LJIIL() {
        if (C1490830otl.LIZ()) {
            String str = LLJLLL;
            int id = this.LLJILJIL.getId();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Trace:");
            sbLIZ.append(Log.getStackTraceString(new Throwable()));
            C1490830otl.LIZLLL(id, str, "clearCurrentDownloadData", C2188811AlT.LIZIZ(sbLIZ));
        }
        try {
            this.LLJIJIL.LJJJZ(this.LLJILJIL.getId());
            C2199671B7d.LJ(this.LLJILJIL, true);
            this.LLILZLL = false;
            this.LLJILJIL.resetDataForEtagEndure("");
            this.LLJIJIL.updateDownloadInfo(this.LLJILJIL);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public final void LJJ() {
        if (C1490830otl.LIZ()) {
            C1490830otl.LIZLLL(this.LLJILJIL.getId(), LLJLLL, "finishWithFileExist", "File exits");
        }
        if (C2199751B7l.LJFF.LJI("fix_end_for_file_exist_error", true)) {
            if (this.LLJJJJ.equals(this.LLJILJIL.getName())) {
                this.LLJI = C1B7U.RUN_STATUS_END_RIGHT_NOW;
            } else {
                this.LLJI = C1B7U.RUN_STATUS_END_FOR_FILE_EXIST;
            }
        } else if (this.LLJJJJ.equals(this.LLJILJIL.getTargetFilePath())) {
            this.LLJI = C1B7U.RUN_STATUS_END_RIGHT_NOW;
        } else {
            this.LLJI = C1B7U.RUN_STATUS_END_FOR_FILE_EXIST;
        }
        this.LLJILJIL.setCacheExistsInDownloading(true);
    }

    public static boolean LIZJ(DownloadInfo downloadInfo) {
        try {
            Context context = C2199681B7e.LIZ;
        } finally {
            try {
            } catch (Throwable th) {
            }
        }
        downloadInfo.setInterceptFlag(0);
        return false;
    }

    public final boolean LIZ(BaseException baseException) {
        if (this.LLJLLIL != null && C2199671B7d.LJJ(baseException) && this.LLILZ.get() < this.LLJILJIL.getRetryCount()) {
            return false;
        }
        String str = C2199661B7c.LIZ;
        if (baseException instanceof DownloadHttpException) {
            DownloadHttpException downloadHttpException = (DownloadHttpException) baseException;
            if (downloadHttpException.getHttpStatusCode() == 412 || downloadHttpException.getHttpStatusCode() == 416) {
                if (!this.LLILLL) {
                    C2199671B7d.LJ(this.LLJILJIL, true);
                    this.LLILLL = true;
                }
                return true;
            }
        }
        if (baseException.getErrorCode() == 1083) {
            return false;
        }
        if (this.LLJL.LIZ(baseException)) {
            return true;
        }
        AtomicInteger atomicInteger = this.LLILZ;
        if (((atomicInteger == null || atomicInteger.get() <= 0) && !this.LLJILJIL.hasNextBackupUrl() && ((baseException.getErrorCode() != 1011 && (baseException.getCause() == null || !(baseException.getCause() instanceof SSLHandshakeException))) || !this.LLJILJIL.canReplaceHttpForRetry())) || (baseException instanceof DownloadRetryNeedlessException)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:87|6|7|(9:9|10|(1:12)|13|(0)(4:15|(3:17|(1:19)(1:20)|21)|22|(4:24|(4:26|(1:28)|29|(2:31|53)(2:32|33))|54|(3:56|(0)|59))(2:34|(1:36)(4:37|(1:39)|40|41)))|83|60|77|78)(2:42|(4:44|(1:46)|47|48)(2:49|(2:51|52)))|58|59|83|60|77|78) */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0187, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0188, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1);
        r11 = r26.LLJILJIL.getId();
        r3 = X.C2188811AlT.LIZ();
        r3.append("Exception: ");
        r3.append(r1.toString());
        r3.append(" mustSetLength: ");
        r3.append(r2);
        X.C1490830otl.LJ(r11, r23, "checkSpaceOverflow", X.C2188811AlT.LIZIZ(r3));
        r3 = 1040;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01b6, code lost:
    
        if (r4 >= r27) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01c2, code lost:
    
        r24.LL.LJ(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01ca, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01fc, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01fd, code lost:
    
        if (r2 != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0204, code lost:
    
        throw new com.ss.android.socialbase.downloader.exception.BaseException(1040, r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ(long r27) throws com.ss.android.socialbase.downloader.exception.BaseException {
        /*
            Method dump skipped, instruction units count: 541
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC2199651B7b.LJIIIIZZ(long):void");
    }

    public final List<HttpHeader> LJJI(long j) {
        List<HttpHeader> extraHeaders = this.LLJILJIL.getExtraHeaders();
        List<HttpHeader> listLIZ = C2199661B7c.LIZ(j, this.LLJILJIL.getEndOffset(), this.LLJILJIL.geteTag(), extraHeaders);
        if (this.LLJILJIL.isExpiredRedownload() && this.LLJJJJJIL && this.LLJILJIL.getLastModified() != null) {
            ArrayList arrayList = (ArrayList) listLIZ;
            arrayList.add(new HttpHeader("if-modified-since", this.LLJILJIL.getLastModified()));
            arrayList.add(new HttpHeader("download-tc21-1-15", "download-tc21-1-15"));
            if (C1490830otl.LIZ()) {
                String str = LLJLLL;
                int id = this.LLJILJIL.getId();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("LastModified: ");
                sbLIZ.append(this.LLJILJIL.getLastModified());
                C1490830otl.LIZLLL(id, str, "getExtraHeaders", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        ((ArrayList) listLIZ).add(new HttpHeader("extra_download_id", String.valueOf(this.LLJILJIL.getId())));
        return listLIZ;
    }

    public final boolean LJJIIJ(BaseException baseException) {
        this.LLJLIL.LIZ(baseException);
        if (this.LLJL.LIZ(baseException)) {
            this.LLJL.LIZIZ();
            this.LLJILJIL.setCurNetworkRetryCount(this.LLJL.LJIIIIZZ);
            return false;
        }
        AtomicInteger atomicInteger = this.LLILZ;
        boolean z = true;
        if (atomicInteger != null) {
            if (atomicInteger.get() <= 0 || baseException.getErrorCode() == 1070) {
                if (this.LLJILJIL.trySwitchToNextBackupUrl()) {
                    this.LLILZ.set(this.LLJILJIL.getBackUpUrlRetryCount());
                    this.LLJILJIL.updateCurRetryTime(this.LLILZ.get());
                } else if ((baseException.getErrorCode() == 1011 || (baseException.getCause() != null && (baseException.getCause() instanceof SSLHandshakeException))) && this.LLJILJIL.canReplaceHttpForRetry()) {
                    this.LLILZ.set(this.LLJILJIL.getRetryCount());
                    this.LLJILJIL.updateCurRetryTime(this.LLILZ.get());
                    this.LLJILJIL.setHttpsToHttpRetryUsed(true);
                } else {
                    LJJIIZI(new BaseException(baseException.getErrorCode(), C786410Ut5.k4(Locale.US, "retry for exception, but current retry time : %s , retry Time %d all used, last error is %s", new Object[]{String.valueOf(this.LLILZ), Integer.valueOf(this.LLJILJIL.getRetryCount()), baseException.getErrorMessage()})));
                    return true;
                }
                z = false;
            }
            if (this.LLJI != C1B7U.RUN_STATUS_RETRY_DELAY && z) {
                this.LLJILJIL.updateCurRetryTime(this.LLILZ.decrementAndGet());
            }
            return false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("retry for exception, but retain retry time is null, last error is :");
        sbLIZ.append(baseException.getErrorMessage());
        LJJIIZI(new BaseException(1043, C2188811AlT.LIZIZ(sbLIZ)));
        return true;
    }

    public final void LJJIIZI(BaseException baseException) {
        this.LLJI = C1B7U.RUN_STATUS_ERROR;
        this.LLJILLL = baseException;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJJIJ(long r18) throws com.ss.android.socialbase.downloader.exception.DownloadOutOfSpaceException {
        /*
            Method dump skipped, instruction units count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC2199651B7b.LJJIJ(long):boolean");
    }

    public final EnumC844180X9s LJJIJIIJI(BaseException baseException) {
        long totalBytes;
        long avaliableSpaceBytes;
        this.LLJILLL = baseException;
        this.LLJILJIL.increaseCurBytes(0L);
        this.LLJIJIL.updateDownloadInfo(this.LLJILJIL);
        if (LJJIIZ()) {
            return EnumC844180X9s.RETURN;
        }
        boolean z = false;
        if (baseException.getErrorCode() == 1047) {
            if (this.LLJJIII != null && !this.LLJILJIL.isForbiddenRetryed()) {
                C1B7T c1b7t = new C1B7T() { // from class: X.1B7S
                    @Override // X.InterfaceC2199261B5o
                    public final void LJJIZ(List<String> list) {
                        boolean z2 = true;
                        if (list != null && !list.isEmpty()) {
                            this.LIZ = true;
                        }
                        RunnableC2199651B7b runnableC2199651B7b = this.LIZIZ;
                        runnableC2199651B7b.getClass();
                        if (list != null && !list.isEmpty()) {
                            DownloadInfo downloadInfo = runnableC2199651B7b.LLJILJIL;
                            if (runnableC2199651B7b.LLJI != C1B7U.RUN_STATUS_WAITING_ASYNC_HANDLER) {
                                z2 = false;
                            }
                            downloadInfo.setForbiddenBackupUrls(list, z2);
                            C1B7G c1b7gLJIILIIL = C2199681B7e.LJIILIIL();
                            if (c1b7gLJIILIIL != null) {
                                c1b7gLJIILIIL.LJIJJ(runnableC2199651B7b.LLJILJIL.getId());
                            }
                        }
                    }
                };
                boolean zLIZ = ((C2199301B5s) this.LLJJIII).LIZ(c1b7t);
                this.LLJILJIL.setForbiddenRetryed();
                if (zLIZ && !c1b7t.LIZ) {
                    this.LLJILJILJ.LIZJ();
                    this.LLJI = C1B7U.RUN_STATUS_WAITING_ASYNC_HANDLER;
                    return EnumC844180X9s.RETURN;
                }
            } else if (LJJIIJ(baseException)) {
                return EnumC844180X9s.RETURN;
            }
        } else if (C2199671B7d.LJIJJ(baseException)) {
            if (this.LLJJIJI == null) {
                LJJIIZI(baseException);
                return EnumC844180X9s.RETURN;
            }
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            InterfaceC2199451B6h interfaceC2199451B6h = new InterfaceC2199451B6h() { // from class: X.1B7K
                @Override // X.InterfaceC2199451B6h
                public final void LJJJLZIJ() {
                    C1B7G c1b7gLJIILIIL;
                    synchronized (this.LIZIZ) {
                        try {
                            atomicBoolean.set(true);
                            RunnableC2199651B7b runnableC2199651B7b = this.LIZIZ;
                            if (!runnableC2199651B7b.LJ() && (c1b7gLJIILIIL = C2199681B7e.LJIILIIL()) != null) {
                                c1b7gLJIILIIL.LJIJJ(runnableC2199651B7b.LLJILJIL.getId());
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }
            };
            if (baseException instanceof DownloadOutOfSpaceException) {
                DownloadOutOfSpaceException downloadOutOfSpaceException = (DownloadOutOfSpaceException) baseException;
                avaliableSpaceBytes = downloadOutOfSpaceException.getAvaliableSpaceBytes();
                totalBytes = downloadOutOfSpaceException.getRequiredSpaceBytes();
            } else {
                totalBytes = this.LLJILJIL.getTotalBytes();
                avaliableSpaceBytes = -1;
            }
            synchronized (this) {
                try {
                    if (((C2199381B6a) this.LLJJIJI).LIZ(avaliableSpaceBytes, totalBytes, interfaceC2199451B6h)) {
                        if (!C2199751B7l.LJFF(this.LLJILJIL.getId(), null).LJI("not_delete_when_clean_space", false)) {
                            LIZIZ();
                        }
                        if (!atomicBoolean.get()) {
                            C1B7U c1b7u = this.LLJI;
                            C1B7U c1b7u2 = C1B7U.RUN_STATUS_WAITING_ASYNC_HANDLER;
                            if (c1b7u != c1b7u2) {
                                this.LLJI = c1b7u2;
                                this.LLJILJILJ.LIZJ();
                            }
                            return EnumC844180X9s.RETURN;
                        }
                        if (LJJIIJ(baseException)) {
                            return EnumC844180X9s.RETURN;
                        }
                    } else {
                        if (this.LLJI == C1B7U.RUN_STATUS_WAITING_ASYNC_HANDLER) {
                            return EnumC844180X9s.RETURN;
                        }
                        LJJIIZI(baseException);
                        return EnumC844180X9s.RETURN;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        } else if (LJJIIJ(baseException)) {
            return EnumC844180X9s.RETURN;
        }
        C1B7V c1b7v = this.LLJILJILJ;
        C1B7U c1b7u3 = this.LLJI;
        C1B7U c1b7u4 = C1B7U.RUN_STATUS_RETRY_DELAY;
        if (c1b7u3 == c1b7u4) {
            z = true;
        }
        c1b7v.LJIIIZ(baseException, z);
        if (this.LLJI == c1b7u4) {
            return EnumC844180X9s.RETURN;
        }
        return EnumC844180X9s.CONTINUE;
    }

    public final void LJJIJLIJ(C1B8V c1b8v) {
        String strLIZIZ;
        if (c1b8v != null) {
            try {
                int iLIZ = c1b8v.LIZ();
                this.LLJILJIL.setHttpStatusCode(iLIZ);
                this.LLJILJIL.setHttpStatusMessage(C2273781DzE.LIZ(iLIZ));
                List<String> accessHttpHeaderKeys = this.LLJILJIL.getAccessHttpHeaderKeys();
                if (accessHttpHeaderKeys != null && !accessHttpHeaderKeys.isEmpty()) {
                    HashMap map = new HashMap();
                    for (String str : accessHttpHeaderKeys) {
                        if (str != null && (strLIZIZ = c1b8v.LIZIZ(str)) != null) {
                            map.put(str, strLIZIZ);
                        }
                    }
                    if (!map.isEmpty()) {
                        this.LLJILJIL.setHttpHeaders(map);
                        return;
                    }
                    return;
                }
                return;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        this.LLJILJIL.setHttpStatusCode(-1);
        this.LLJILJIL.setHttpStatusMessage("");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public RunnableC2199651B7b(com.ss.android.socialbase.downloader.model.DownloadTask r6, com.ss.android.socialbase.downloader.thread.WeakDownloadHandler r7) {
        /*
            r5 = this;
            r5.<init>()
            X.1B7U r0 = X.C1B7U.RUN_STATUS_NONE
            r5.LLJI = r0
            r0 = 5
            r5.LLJJIJIIJIL = r0
            r3 = 1
            r5.LLJLILLLLZIIL = r3
            r5.LLILLJJLI = r6
            r2 = 0
            if (r6 == 0) goto L85
            com.ss.android.socialbase.downloader.model.DownloadInfo r4 = r6.getDownloadInfo()
            r5.LLJILJIL = r4
            X.1B5u r0 = r6.getForbiddenHandler()
            r5.LLJJIII = r0
            X.1B6k r0 = r6.getDiskSpaceHandler()
            r5.LLJJIJI = r0
            X.1B6j r0 = r6.getRetryDelayTimeCalculator()
            if (r0 != 0) goto L3f
            com.ss.android.socialbase.downloader.model.DownloadInfo r0 = r6.getDownloadInfo()
            if (r0 == 0) goto L6f
            java.lang.String r1 = r0.getRetryDelayTimeArray()
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L6f
            X.07rC r0 = new X.07rC
            r0.<init>(r1)
        L3f:
            int r0 = r4.getId()
            X.1B7l r0 = X.C2199751B7l.LJFF(r0, r2)
            r5.LLJJLIIIJLLLLLLLZ = r0
            X.0otp r0 = new X.0otp
            r0.<init>(r4)
            r5.LLJL = r0
            X.0p6X r0 = new X.0p6X
            r0.<init>(r4)
            r5.LLJLIL = r0
        L57:
            r5.LJJIL()
            X.1B5c r0 = X.C2199681B7e.LJIIJJI()
            r5.LLJIJIL = r0
            X.1B7V r0 = new X.1B7V
            r0.<init>(r6, r7)
            r5.LLJILJILJ = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r3)
            r5.LLJ = r0
            return
        L6f:
            X.1B8i r0 = X.C2199681B7e.LJIL
            if (r0 != 0) goto L82
            java.lang.Class<X.1B7e> r1 = X.C2199681B7e.class
            monitor-enter(r1)
            X.1B8i r0 = X.C2199681B7e.LJIL     // Catch: java.lang.Throwable -> L98
            if (r0 != 0) goto L81
            X.1B8i r0 = new X.1B8i     // Catch: java.lang.Throwable -> L98
            r0.<init>()     // Catch: java.lang.Throwable -> L98
            X.C2199681B7e.LJIL = r0     // Catch: java.lang.Throwable -> L98
        L81:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L98
        L82:
            android.content.Context r0 = X.C2199681B7e.LIZ
            goto L3f
        L85:
            X.1B7l r0 = X.C2199751B7l.LJFF
            r5.LLJJLIIIJLLLLLLLZ = r0
            X.0otp r0 = new X.0otp
            r0.<init>(r2)
            r5.LLJL = r0
            X.0p6X r0 = new X.0p6X
            r0.<init>(r2)
            r5.LLJLIL = r0
            goto L57
        L98:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L98
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L98
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC2199651B7b.<init>(com.ss.android.socialbase.downloader.model.DownloadTask, com.ss.android.socialbase.downloader.thread.WeakDownloadHandler):void");
    }

    public static final void LJFF(int i, long j) {
        if (j > 0 && i > 0 && j > i) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Current Bytes:");
            sbLIZ.append(j);
            sbLIZ.append("Limit bytes:");
            sbLIZ.append(i);
            throw new BaseException(1088, C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0062 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIZILJ(java.lang.String r14, java.util.List<com.ss.android.socialbase.downloader.model.HttpHeader> r15) throws com.ss.android.socialbase.downloader.exception.BaseException {
        /*
            Method dump skipped, instruction units count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC2199651B7b.LJIIZILJ(java.lang.String, java.util.List):void");
    }

    public final void LJJII(String str, String str2) throws C1B8T {
        this.LLJIJIL.LJJJZ(this.LLJILJIL.getId());
        C2199671B7d.LJ(this.LLJILJIL, true);
        this.LLILZLL = false;
        this.LLJJJJJIL = false;
        this.LLJILJIL.resetDataForEtagEndure(str);
        this.LLJIJIL.updateDownloadInfo(this.LLJILJIL);
        throw new C1B8T(str2);
    }

    public final void LJIJ(long j, String str, List list) throws BaseException {
        boolean z;
        C2199841B7u c2199841B7uLIZ;
        boolean zLJI = MethodIDManager.LJI(137834);
        if (this.LLJILJIL.getChunkCount() == 1 && (c2199841B7uLIZ = C2199901B8a.LIZ.LIZ(str, list)) != null) {
            this.LLJJI = c2199841B7uLIZ;
            this.LLJILJIL.setPreconnectLevel(1);
        }
        if (this.LLJJI == null && !this.LLJJJ && this.LLJILJIL.isHeadConnectionAvailable()) {
            try {
                int iLJIIIIZZ = this.LLJJLIIIJLLLLLLLZ.LJIIIIZZ("net_lib_strategy", 0);
                if (this.LLJJLIIIJLLLLLLLZ.LJIIIIZZ("monitor_download_connect", 0) > 0) {
                    z = true;
                } else {
                    z = false;
                }
                this.LLJJI = C2199681B7e.LIZLLL(str, list, iLJIIIIZZ, z, this.LLJILJIL);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                this.LLJILJIL.setHeadConnectionException(C2199671B7d.LJIILLIIL(th));
            }
        }
        InterfaceC2199921B8c interfaceC2199921B8c = this.LLJJI;
        if (interfaceC2199921B8c != null) {
            try {
                LJJIFFI(str, interfaceC2199921B8c, j);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                String str2 = C2199661B7c.LIZ;
                if ((th2 instanceof BaseException) && th2.getErrorCode() == 1083) {
                    if (zLJI) {
                        MethodIDManager.LJ();
                    }
                    throw th2;
                }
                this.LLJJJ = true;
            }
        }
        if (this.LLJJI == null || this.LLJJJ) {
            LJIIZILJ(str, list);
            LJJIFFI(str, this.LLJJ, j);
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:159:0x03e5 A[Catch: all -> 0x0520, 1B8T -> 0x052b, BaseException -> 0x0530, TryCatch #2 {1B8T -> 0x052b, BaseException -> 0x0530, all -> 0x0520, blocks: (B:5:0x000d, B:7:0x0028, B:9:0x002e, B:10:0x0033, B:17:0x004f, B:20:0x0075, B:21:0x0103, B:23:0x0107, B:25:0x0114, B:26:0x0119, B:28:0x0121, B:30:0x0134, B:31:0x014b, B:34:0x0155, B:36:0x0159, B:50:0x01b7, B:41:0x0166, B:54:0x01cb, B:60:0x01e3, B:62:0x01e9, B:63:0x01f4, B:52:0x01c3, B:43:0x0172, B:45:0x0178, B:46:0x0199, B:48:0x01a3, B:49:0x01b6, B:57:0x01d7, B:58:0x01e0, B:66:0x0202, B:68:0x020a, B:70:0x0216, B:72:0x021c, B:73:0x0227, B:74:0x022d, B:75:0x022e, B:77:0x0234, B:78:0x0239, B:80:0x0245, B:82:0x0249, B:84:0x024f, B:86:0x0259, B:87:0x025f, B:89:0x0263, B:90:0x0268, B:91:0x0269, B:94:0x0273, B:98:0x027b, B:100:0x0287, B:102:0x0291, B:106:0x02d1, B:107:0x02e6, B:104:0x02a1, B:105:0x02d0, B:108:0x02e7, B:109:0x02f0, B:110:0x02f1, B:113:0x02f7, B:115:0x02fb, B:116:0x0301, B:117:0x0302, B:118:0x0309, B:119:0x030a, B:121:0x0312, B:122:0x031a, B:126:0x0326, B:128:0x032e, B:129:0x0335, B:130:0x0336, B:132:0x0342, B:133:0x034c, B:139:0x035c, B:141:0x0360, B:142:0x0367, B:145:0x0376, B:147:0x0382, B:148:0x039b, B:150:0x03a1, B:152:0x03ac, B:154:0x03b6, B:155:0x03cf, B:157:0x03db, B:170:0x0426, B:172:0x0432, B:174:0x043c, B:176:0x0446, B:178:0x044a, B:179:0x0450, B:184:0x0484, B:185:0x048b, B:186:0x048c, B:189:0x0493, B:191:0x049d, B:193:0x04b1, B:195:0x04bb, B:196:0x04e0, B:197:0x04e1, B:159:0x03e5, B:161:0x03ef, B:163:0x03f9, B:165:0x0403, B:167:0x0413, B:169:0x041f, B:180:0x0451, B:199:0x04f0, B:200:0x051f, B:181:0x0462, B:183:0x0469, B:144:0x036a), top: B:210:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0492 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0493 A[Catch: all -> 0x0520, 1B8T -> 0x052b, BaseException -> 0x0530, TryCatch #2 {1B8T -> 0x052b, BaseException -> 0x0530, all -> 0x0520, blocks: (B:5:0x000d, B:7:0x0028, B:9:0x002e, B:10:0x0033, B:17:0x004f, B:20:0x0075, B:21:0x0103, B:23:0x0107, B:25:0x0114, B:26:0x0119, B:28:0x0121, B:30:0x0134, B:31:0x014b, B:34:0x0155, B:36:0x0159, B:50:0x01b7, B:41:0x0166, B:54:0x01cb, B:60:0x01e3, B:62:0x01e9, B:63:0x01f4, B:52:0x01c3, B:43:0x0172, B:45:0x0178, B:46:0x0199, B:48:0x01a3, B:49:0x01b6, B:57:0x01d7, B:58:0x01e0, B:66:0x0202, B:68:0x020a, B:70:0x0216, B:72:0x021c, B:73:0x0227, B:74:0x022d, B:75:0x022e, B:77:0x0234, B:78:0x0239, B:80:0x0245, B:82:0x0249, B:84:0x024f, B:86:0x0259, B:87:0x025f, B:89:0x0263, B:90:0x0268, B:91:0x0269, B:94:0x0273, B:98:0x027b, B:100:0x0287, B:102:0x0291, B:106:0x02d1, B:107:0x02e6, B:104:0x02a1, B:105:0x02d0, B:108:0x02e7, B:109:0x02f0, B:110:0x02f1, B:113:0x02f7, B:115:0x02fb, B:116:0x0301, B:117:0x0302, B:118:0x0309, B:119:0x030a, B:121:0x0312, B:122:0x031a, B:126:0x0326, B:128:0x032e, B:129:0x0335, B:130:0x0336, B:132:0x0342, B:133:0x034c, B:139:0x035c, B:141:0x0360, B:142:0x0367, B:145:0x0376, B:147:0x0382, B:148:0x039b, B:150:0x03a1, B:152:0x03ac, B:154:0x03b6, B:155:0x03cf, B:157:0x03db, B:170:0x0426, B:172:0x0432, B:174:0x043c, B:176:0x0446, B:178:0x044a, B:179:0x0450, B:184:0x0484, B:185:0x048b, B:186:0x048c, B:189:0x0493, B:191:0x049d, B:193:0x04b1, B:195:0x04bb, B:196:0x04e0, B:197:0x04e1, B:159:0x03e5, B:161:0x03ef, B:163:0x03f9, B:165:0x0403, B:167:0x0413, B:169:0x041f, B:180:0x0451, B:199:0x04f0, B:200:0x051f, B:181:0x0462, B:183:0x0469, B:144:0x036a), top: B:210:0x000d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIFFI(java.lang.String r21, X.InterfaceC2199921B8c r22, long r23) {
        /*
            Method dump skipped, instruction units count: 1333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC2199651B7b.LJJIFFI(java.lang.String, X.1B8c, long):void");
    }

    public final boolean LJJIIJZLJL(int i, String str, String str2) {
        if (i == 412) {
            return true;
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !str.equals(str2) && (this.LLIZLLLIL || this.LLIZ)) {
            return true;
        }
        if ((i == 201 || i == 416) && this.LLJILJIL.getCurBytes() > 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:228:0x042a A[Catch: all -> 0x0567, TryCatch #7 {all -> 0x0567, blocks: (B:264:0x0493, B:266:0x04c4, B:289:0x0560, B:290:0x0566, B:226:0x0402, B:228:0x042a, B:229:0x0431, B:255:0x047b, B:256:0x0481, B:258:0x0483, B:259:0x048d), top: B:320:0x00b1, inners: #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x04c4 A[Catch: all -> 0x0567, TryCatch #7 {all -> 0x0567, blocks: (B:264:0x0493, B:266:0x04c4, B:289:0x0560, B:290:0x0566, B:226:0x0402, B:228:0x042a, B:229:0x0431, B:255:0x047b, B:256:0x0481, B:258:0x0483, B:259:0x048d), top: B:320:0x00b1, inners: #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:331:0x047b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0166 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0265 A[EDGE_INSN: B:376:0x0265->B:128:0x0265 BREAK  A[LOOP:1: B:325:0x0141->B:382:0x0141], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x015c A[Catch: BaseException -> 0x03a5, all -> 0x03c7, TRY_LEAVE, TryCatch #28 {all -> 0x03c7, blocks: (B:54:0x0141, B:57:0x0146, B:60:0x0150, B:62:0x0154, B:64:0x015c, B:65:0x0160), top: B:325:0x0141 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0174  */
    /* JADX WARN: Type inference failed for: r0v183, types: [java.io.Closeable[]] */
    /* JADX WARN: Type inference failed for: r0v70, types: [java.io.Closeable[]] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.io.Closeable[]] */
    /* JADX WARN: Type inference failed for: r1v35, types: [java.io.Closeable[]] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.io.Closeable[]] */
    /* JADX WARN: Type inference failed for: r7v0, types: [X.1B8V] */
    /* JADX WARN: Type inference failed for: r7v1, types: [int] */
    /* JADX WARN: Type inference failed for: r7v10, types: [int] */
    /* JADX WARN: Type inference failed for: r7v11, types: [int] */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [int] */
    /* JADX WARN: Type inference failed for: r7v4, types: [int] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0, types: [long] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r8v13, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v0, types: [X.1B7k] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIII(long r41, long r43, java.lang.String r45, X.C1B8V r46) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1538
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC2199651B7b.LJJIII(long, long, java.lang.String, X.1B8V):void");
    }
}
