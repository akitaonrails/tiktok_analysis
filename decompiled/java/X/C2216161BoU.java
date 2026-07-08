package X;

import android.app.Application;
import com.bytedance.ies.nleeditor.NLE;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ttve.nativePort.TEImageInterface;
import com.ss.android.ttve.nativePort.TENativeLibsLoader;
import com.ss.android.ugc.effectmanager.DownloadableModelSupport;
import com.ss.android.ugc.effectmanager.DownloadableModelSupportLibraryLoader;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: X.1BoU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2216161BoU {
    public static volatile C2216161BoU LJFF;
    public static volatile boolean LJI;
    public Application LIZ;
    public volatile InterfaceC20011413Ro LIZIZ;
    public final ReentrantLock LIZJ;
    public final Gson LIZLLL;
    public final C2208671BcP LJ;

    public final void LIZIZ(C2216151BoT c2216151BoT) {
        C823920WTu c823920WTu = C823920WTu.LIZIZ;
        C201955140j.LJIILJJIL(c823920WTu, "VESDKLoader initVESDK start");
        if (!LJI) {
            try {
                this.LIZJ.lock();
                if (!LJI) {
                    C13V8 c13v8LIZ = C13V8.LJ.LIZ(this.LIZ);
                    TENativeLibsLoader.setLibraryLoad((InterfaceC2109808Oi) c13v8LIZ.LIZJ.getValue());
                    NLE.INSTANCE.setLibraryLoader(new C2112708Pl((InterfaceC2109808Oi) c13v8LIZ.LIZJ.getValue()));
                    DownloadableModelSupport.setLibraryLoader((DownloadableModelSupportLibraryLoader) c13v8LIZ.LIZLLL.getValue());
                    if (C0C64.LJIILLIIL().LJIIIZ(31744, "enable_ve_hook", true, false)) {
                        C790290UzL.LIZ.storeBoolean("key_ve_hook_switch", true);
                        C790290UzL.LIZ();
                    }
                    LIZJ(DownloadableModelSupport.getInstance().getResourceFinder(), c2216151BoT);
                    C08OA.LIZ(this.LIZ);
                    TEImageInterface.queryMediadata(false, false, "", Boolean.TRUE);
                    LJI = true;
                }
                this.LIZJ.unlock();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                this.LIZJ.unlock();
                throw th;
            }
        }
        C201955140j.LJIILJJIL(c823920WTu, "VESDKLoader initVESDK end");
    }

    /* JADX WARN: Removed duplicated region for block: B:139:0x031e A[Catch: all -> 0x03f9, TryCatch #0 {, blocks: (B:4:0x0022, B:8:0x0029, B:10:0x0049, B:12:0x0057, B:13:0x005c, B:15:0x0069, B:17:0x0077, B:18:0x0084, B:20:0x00a5, B:21:0x00a8, B:23:0x00b5, B:24:0x00bc, B:26:0x00e6, B:28:0x0110, B:33:0x0125, B:35:0x0129, B:36:0x012c, B:38:0x0149, B:39:0x015b, B:41:0x0165, B:43:0x0172, B:45:0x0176, B:46:0x0181, B:49:0x0190, B:51:0x0194, B:54:0x019e, B:56:0x01ab, B:58:0x01af, B:59:0x01ba, B:62:0x01c4, B:64:0x01c8, B:67:0x01d2, B:69:0x01dc, B:71:0x01e3, B:72:0x01e7, B:74:0x01ed, B:76:0x01f7, B:77:0x01fb, B:79:0x0205, B:81:0x020e, B:82:0x0212, B:84:0x0219, B:86:0x0223, B:102:0x026b, B:104:0x0275, B:105:0x0279, B:107:0x0283, B:109:0x028d, B:111:0x0294, B:112:0x0298, B:114:0x029c, B:116:0x02a6, B:117:0x02aa, B:119:0x02b4, B:124:0x02de, B:131:0x02f8, B:133:0x0302, B:134:0x0306, B:136:0x0310, B:137:0x0314, B:139:0x031e, B:141:0x0343, B:143:0x034b, B:145:0x0398, B:147:0x039e, B:148:0x03a6, B:153:0x03b9, B:154:0x03c0, B:125:0x02e3, B:155:0x03c1, B:156:0x03c8, B:121:0x02bb, B:122:0x02ce, B:157:0x03c9, B:158:0x03d0, B:159:0x03d1, B:160:0x03d8, B:87:0x0228, B:161:0x03d9, B:162:0x03e0, B:88:0x0236, B:90:0x0244, B:96:0x0253, B:163:0x03e1, B:164:0x03e8, B:66:0x01ce, B:53:0x019a, B:165:0x03e9, B:166:0x03f0, B:32:0x0122, B:167:0x03f1, B:168:0x03f8, B:31:0x011d), top: B:172:0x0022, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x03b9 A[Catch: all -> 0x03f9, TRY_ENTER, TryCatch #0 {, blocks: (B:4:0x0022, B:8:0x0029, B:10:0x0049, B:12:0x0057, B:13:0x005c, B:15:0x0069, B:17:0x0077, B:18:0x0084, B:20:0x00a5, B:21:0x00a8, B:23:0x00b5, B:24:0x00bc, B:26:0x00e6, B:28:0x0110, B:33:0x0125, B:35:0x0129, B:36:0x012c, B:38:0x0149, B:39:0x015b, B:41:0x0165, B:43:0x0172, B:45:0x0176, B:46:0x0181, B:49:0x0190, B:51:0x0194, B:54:0x019e, B:56:0x01ab, B:58:0x01af, B:59:0x01ba, B:62:0x01c4, B:64:0x01c8, B:67:0x01d2, B:69:0x01dc, B:71:0x01e3, B:72:0x01e7, B:74:0x01ed, B:76:0x01f7, B:77:0x01fb, B:79:0x0205, B:81:0x020e, B:82:0x0212, B:84:0x0219, B:86:0x0223, B:102:0x026b, B:104:0x0275, B:105:0x0279, B:107:0x0283, B:109:0x028d, B:111:0x0294, B:112:0x0298, B:114:0x029c, B:116:0x02a6, B:117:0x02aa, B:119:0x02b4, B:124:0x02de, B:131:0x02f8, B:133:0x0302, B:134:0x0306, B:136:0x0310, B:137:0x0314, B:139:0x031e, B:141:0x0343, B:143:0x034b, B:145:0x0398, B:147:0x039e, B:148:0x03a6, B:153:0x03b9, B:154:0x03c0, B:125:0x02e3, B:155:0x03c1, B:156:0x03c8, B:121:0x02bb, B:122:0x02ce, B:157:0x03c9, B:158:0x03d0, B:159:0x03d1, B:160:0x03d8, B:87:0x0228, B:161:0x03d9, B:162:0x03e0, B:88:0x0236, B:90:0x0244, B:96:0x0253, B:163:0x03e1, B:164:0x03e8, B:66:0x01ce, B:53:0x019a, B:165:0x03e9, B:166:0x03f0, B:32:0x0122, B:167:0x03f1, B:168:0x03f8, B:31:0x011d), top: B:172:0x0022, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03d9 A[Catch: all -> 0x03f9, TryCatch #0 {, blocks: (B:4:0x0022, B:8:0x0029, B:10:0x0049, B:12:0x0057, B:13:0x005c, B:15:0x0069, B:17:0x0077, B:18:0x0084, B:20:0x00a5, B:21:0x00a8, B:23:0x00b5, B:24:0x00bc, B:26:0x00e6, B:28:0x0110, B:33:0x0125, B:35:0x0129, B:36:0x012c, B:38:0x0149, B:39:0x015b, B:41:0x0165, B:43:0x0172, B:45:0x0176, B:46:0x0181, B:49:0x0190, B:51:0x0194, B:54:0x019e, B:56:0x01ab, B:58:0x01af, B:59:0x01ba, B:62:0x01c4, B:64:0x01c8, B:67:0x01d2, B:69:0x01dc, B:71:0x01e3, B:72:0x01e7, B:74:0x01ed, B:76:0x01f7, B:77:0x01fb, B:79:0x0205, B:81:0x020e, B:82:0x0212, B:84:0x0219, B:86:0x0223, B:102:0x026b, B:104:0x0275, B:105:0x0279, B:107:0x0283, B:109:0x028d, B:111:0x0294, B:112:0x0298, B:114:0x029c, B:116:0x02a6, B:117:0x02aa, B:119:0x02b4, B:124:0x02de, B:131:0x02f8, B:133:0x0302, B:134:0x0306, B:136:0x0310, B:137:0x0314, B:139:0x031e, B:141:0x0343, B:143:0x034b, B:145:0x0398, B:147:0x039e, B:148:0x03a6, B:153:0x03b9, B:154:0x03c0, B:125:0x02e3, B:155:0x03c1, B:156:0x03c8, B:121:0x02bb, B:122:0x02ce, B:157:0x03c9, B:158:0x03d0, B:159:0x03d1, B:160:0x03d8, B:87:0x0228, B:161:0x03d9, B:162:0x03e0, B:88:0x0236, B:90:0x0244, B:96:0x0253, B:163:0x03e1, B:164:0x03e8, B:66:0x01ce, B:53:0x019a, B:165:0x03e9, B:166:0x03f0, B:32:0x0122, B:167:0x03f1, B:168:0x03f8, B:31:0x011d), top: B:172:0x0022, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0205 A[Catch: all -> 0x03f9, TryCatch #0 {, blocks: (B:4:0x0022, B:8:0x0029, B:10:0x0049, B:12:0x0057, B:13:0x005c, B:15:0x0069, B:17:0x0077, B:18:0x0084, B:20:0x00a5, B:21:0x00a8, B:23:0x00b5, B:24:0x00bc, B:26:0x00e6, B:28:0x0110, B:33:0x0125, B:35:0x0129, B:36:0x012c, B:38:0x0149, B:39:0x015b, B:41:0x0165, B:43:0x0172, B:45:0x0176, B:46:0x0181, B:49:0x0190, B:51:0x0194, B:54:0x019e, B:56:0x01ab, B:58:0x01af, B:59:0x01ba, B:62:0x01c4, B:64:0x01c8, B:67:0x01d2, B:69:0x01dc, B:71:0x01e3, B:72:0x01e7, B:74:0x01ed, B:76:0x01f7, B:77:0x01fb, B:79:0x0205, B:81:0x020e, B:82:0x0212, B:84:0x0219, B:86:0x0223, B:102:0x026b, B:104:0x0275, B:105:0x0279, B:107:0x0283, B:109:0x028d, B:111:0x0294, B:112:0x0298, B:114:0x029c, B:116:0x02a6, B:117:0x02aa, B:119:0x02b4, B:124:0x02de, B:131:0x02f8, B:133:0x0302, B:134:0x0306, B:136:0x0310, B:137:0x0314, B:139:0x031e, B:141:0x0343, B:143:0x034b, B:145:0x0398, B:147:0x039e, B:148:0x03a6, B:153:0x03b9, B:154:0x03c0, B:125:0x02e3, B:155:0x03c1, B:156:0x03c8, B:121:0x02bb, B:122:0x02ce, B:157:0x03c9, B:158:0x03d0, B:159:0x03d1, B:160:0x03d8, B:87:0x0228, B:161:0x03d9, B:162:0x03e0, B:88:0x0236, B:90:0x0244, B:96:0x0253, B:163:0x03e1, B:164:0x03e8, B:66:0x01ce, B:53:0x019a, B:165:0x03e9, B:166:0x03f0, B:32:0x0122, B:167:0x03f1, B:168:0x03f8, B:31:0x011d), top: B:172:0x0022, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0250  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(com.ss.android.ugc.effectmanager.DownloadableModelSupportResourceFinder r16, X.C2216151BoT r17) {
        /*
            Method dump skipped, instruction units count: 1020
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2216161BoU.LIZJ(com.ss.android.ugc.effectmanager.DownloadableModelSupportResourceFinder, X.1BoT):void");
    }

    public C2216161BoU(Application application, Gson gson, C2208671BcP c2208671BcP) {
        C2216141BoS c2216141BoS = C2216141BoS.LIZ;
        this.LIZJ = new ReentrantLock();
        this.LIZIZ = c2216141BoS;
        this.LIZLLL = gson;
        this.LJ = c2208671BcP;
        this.LIZ = application;
        C0CHQ.LIZ().getApplicationService().getClass();
    }

    public static C2216161BoU LIZ(Application application, Gson gson, C2208671BcP c2208671BcP) {
        if (LJFF == null) {
            synchronized (C2216161BoU.class) {
                try {
                    if (LJFF == null) {
                        LJFF = new C2216161BoU(application, gson, c2208671BcP);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LJFF;
    }
}
