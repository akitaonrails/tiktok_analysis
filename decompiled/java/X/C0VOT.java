package X;

import android.content.SharedPreferences;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttvideoengine.download.DownloaderTaskThread;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import fyo.e;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: renamed from: X.0VOT, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VOT {
    public static final C0VOT LJIIIIZZ = new C0VOT();
    public final long LIZIZ;
    public C0VOH LJI;
    public final DownloaderTaskThread LJII = new DownloaderTaskThread();
    public final ArrayList<C0VOV> LIZJ = new ArrayList<>();
    public final ArrayList<Long> LJFF = new ArrayList<>();
    public final ArrayList<C0VOV> LIZLLL = new ArrayList<>();
    public final ArrayList<C0VOV> LJ = new ArrayList<>();
    public final long LIZ = 1;

    /* JADX WARN: Removed duplicated region for block: B:46:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0160 A[Catch: all -> 0x0176, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0176, blocks: (B:32:0x00b4, B:84:0x0160), top: B:103:0x00b4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ() {
        /*
            Method dump skipped, instruction units count: 413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0VOT.LIZ():void");
    }

    public C0VOT() {
        this.LIZIZ = 1073741824L;
        this.LIZIZ = 1073741824L;
    }

    public static ArrayList LJ(String str) {
        ArrayList arrayList = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            String[] strArrSplit = str.split(",");
            if (strArrSplit != null && strArrSplit.length > 0) {
                ArrayList arrayList2 = new ArrayList();
                try {
                    for (String str2 : strArrSplit) {
                        if (!TextUtils.isEmpty(str2)) {
                            arrayList2.add(str2);
                        }
                    }
                    return arrayList2;
                } catch (Throwable th) {
                    th = th;
                    arrayList = arrayList2;
                    TryCatchGuardChecker.doCheck(th);
                    int i = C2187451AjH.LIZ;
                    TTVideoEngineLog.d(th);
                    return arrayList;
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
        return arrayList;
    }

    public final void LIZJ(C0VOV c0vov) {
        if (!this.LJ.contains(c0vov)) {
            this.LJ.add(c0vov);
        }
        if (this.LIZLLL.contains(c0vov)) {
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[downloader] resume task. is waiting,  task = ");
            sbLIZ.append(c0vov.toString());
            C1471660oOq.LIZJ("TTVideoEngine.Downloader", C2188811AlT.LIZIZ(sbLIZ));
            this.LIZLLL.remove(c0vov);
        }
    }

    public final boolean LIZLLL(C0VOV c0vov) {
        int i;
        if (this.LJ.size() < this.LIZ || (this.LJ.contains(c0vov) && ((i = c0vov.LJFF) == 3 || i == 5))) {
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[downloader] get free size, size = ");
            sbLIZ.append(-1L);
            sbLIZ.append(", limite = ");
            sbLIZ.append(this.LIZIZ);
            C1471660oOq.LIZJ("TTVideoEngine.Downloader", C2188811AlT.LIZIZ(sbLIZ));
            if (-1 > this.LIZIZ) {
                return true;
            }
            c0vov.LJI(new e("kTTVideoErrorDomainDownload", -9947, 0, "available size is less than 1073741824 M"));
            return false;
        }
        c0vov.LJIIIIZZ(1);
        if (!this.LIZLLL.contains(c0vov)) {
            this.LIZLLL.add(c0vov);
        }
        int i3 = C2187451AjH.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("[downloader] task is waiting, task info ");
        sbLIZ2.append(c0vov.toString());
        TTVideoEngineLog.d("TTVideoEngine.Downloader", C2188811AlT.LIZIZ(sbLIZ2));
        return false;
    }

    public final void LIZIZ(C0VOV c0vov, e eVar) {
        if (c0vov.LJIIJ && !c0vov.LJIIJJI) {
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[downloader] task did finished, info = ");
            sbLIZ.append(c0vov.toString());
            TTVideoEngineLog.d("TTVideoEngine.Downloader", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        if (eVar != null) {
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("[downloader] error info ");
            sbLIZ2.append(eVar.toString());
            TTVideoEngineLog.d("TTVideoEngine.Downloader", C2188811AlT.LIZIZ(sbLIZ2));
        }
        c0vov.LJIIJ = true;
        C0V1E c0v1e = new C0V1E();
        c0v1e.LIZ = c0vov;
        c0v1e.LIZIZ = new ArrayList<>(this.LIZJ);
        ArrayList arrayList = new ArrayList();
        arrayList.add(this);
        arrayList.add(c0v1e);
        DownloaderTaskThread downloaderTaskThread = this.LJII;
        if (downloaderTaskThread.LIZIZ != null && downloaderTaskThread.LIZ != null) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 11;
            messageObtain.obj = arrayList;
            C786410Ut5.LJLJJL(downloaderTaskThread.LIZIZ, messageObtain);
        }
        int i3 = C2187451AjH.LIZ;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("[downloader] task complete, task info = ");
        sbLIZ3.append(c0vov.toString());
        TTVideoEngineLog.d("TTVideoEngine.Downloader", C2188811AlT.LIZIZ(sbLIZ3));
        if (this.LJ.contains(c0vov)) {
            this.LJ.remove(c0vov);
        }
        if (this.LJ.size() >= this.LIZ) {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("[downloader] running task count is ");
            sbLIZ4.append(this.LJ.size());
            sbLIZ4.append(" max count is ");
            sbLIZ4.append(this.LIZ);
            TTVideoEngineLog.d("TTVideoEngine.Downloader", C2188811AlT.LIZIZ(sbLIZ4));
            return;
        }
        if (this.LIZLLL.size() < 1) {
            TTVideoEngineLog.d("TTVideoEngine.Downloader", "[downloader] waiting task is empty");
            return;
        }
        C0VOV c0vov2 = (C0VOV) ListProtector.get(this.LIZLLL, 0);
        this.LIZLLL.remove(c0vov2);
        c0vov2.LJII();
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("[downloader] auto resume waiting task: ");
        sbLIZ5.append(c0vov2.toString());
        TTVideoEngineLog.d("TTVideoEngine.Downloader", C2188811AlT.LIZIZ(sbLIZ5));
    }

    public final void LJFF(C0VOV c0vov, ArrayList<C0VOV> arrayList) {
        ArrayList arrayList2 = new ArrayList();
        for (C0VOV c0vov2 : arrayList) {
            if (!arrayList2.contains(Long.valueOf(c0vov2.LIZIZ))) {
                arrayList2.add(Long.valueOf(c0vov2.LIZIZ));
            }
        }
        Collections.sort(arrayList2);
        StringBuilder sb = new StringBuilder(arrayList2.size());
        for (int i = 0; i < arrayList2.size(); i++) {
            sb.append(ListProtector.get(arrayList2, i));
            if (i < arrayList2.size() - 1) {
                sb.append(",");
            }
        }
        String string = sb.toString();
        this.LJI.LIZLLL("index", string);
        SharedPreferences.Editor editorEdit = C810670Vr7.LIZJ(null, 0, "TTVideoEngine_download_index_v01").edit();
        editorEdit.putString("index", string);
        editorEdit.commit();
        String strJ3 = C786410Ut5.J3(c0vov.LIZJ());
        String strValueOf = String.valueOf(c0vov.LIZIZ);
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[downloader] write task. key ");
        sbLIZ.append(strValueOf);
        sbLIZ.append(" value: ");
        sbLIZ.append(strJ3);
        C1471660oOq.LIZJ("TTVideoEngine.Downloader", C2188811AlT.LIZIZ(sbLIZ));
        if (arrayList.contains(c0vov)) {
            if (!this.LJI.LIZLLL(strValueOf, strJ3)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("[downloader] save task fail, videoid = ");
                sbLIZ2.append(c0vov.LJIIL);
                sbLIZ2.append(" taskIdentifier = ");
                sbLIZ2.append(c0vov.LIZIZ);
                C1471660oOq.LIZIZ("TTVideoEngine.Downloader", C2188811AlT.LIZIZ(sbLIZ2));
                c0vov.LJI(new e("kTTVideoErrorDomainDownload", -9949, -1, strJ3));
                return;
            }
            return;
        }
        if (this.LJI.LIZJ(strValueOf)) {
            return;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("[downloader] remove task fail, videoid = ");
        sbLIZ3.append(c0vov.LJIIL);
        sbLIZ3.append(" taskIdentifier = ");
        sbLIZ3.append(c0vov.LIZIZ);
        C1471660oOq.LIZIZ("TTVideoEngine.Downloader", C2188811AlT.LIZIZ(sbLIZ3));
        c0vov.LJI(new e("kTTVideoErrorDomainDownload", -9949, -1, strJ3));
    }
}
