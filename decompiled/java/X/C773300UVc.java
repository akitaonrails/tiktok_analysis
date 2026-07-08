package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import kotlin.Unit;
import webcast.api.room.DeviceSignalInfo;

/* JADX INFO: renamed from: X.0UVc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C773300UVc {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;
    public AnonymousClass0956 LJ;
    public final C557050Lt1 LJFF;
    public long LJI;
    public final C0UWA LJII;
    public final C563400M7u LJIIIIZZ;
    public long LJIIIZ;
    public final C01GW LJIIJ;
    public final C01GW LJIIJJI;
    public boolean LJIIL;

    public final boolean LIZ() {
        return (this.LIZIZ || this.LIZ) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C773300UVc() {
        /*
            r5 = this;
            r5.<init>()
            com.bytedance.android.livesdk.broadcast.setting.TnsSignalReportSetting r2 = com.bytedance.android.livesdk.broadcast.setting.TnsSignalReportSetting.INSTANCE
            boolean r0 = r2.enable()
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L5e
            com.ss.android.ugc.effectmanager.common.ConcurrentHashSet<X.0U3Q> r0 = X.C0U3P.LIZ
            X.0U3Q r0 = X.C0U3Q.COMMERCE
            boolean r0 = X.C0U3P.LIZIZ(r0)
            if (r0 == 0) goto L5e
            r0 = 1
        L18:
            r5.LIZ = r0
            boolean r0 = r2.forceEnable()
            r5.LIZIZ = r0
            long r0 = r2.reportInterval()
            r5.LIZJ = r0
            long r0 = r2.reportNewInterval()
            r5.LIZLLL = r0
            X.0Lt1 r0 = new X.0Lt1
            r0.<init>(r4)
            r5.LJFF = r0
            X.0UWA r2 = new X.0UWA
            r0 = 0
            r2.<init>(r0)
            r5.LJII = r2
            X.0M7u r0 = new X.0M7u
            r0.<init>(r4)
            r5.LJIIIIZZ = r0
            r0 = 266(0x10a, float:3.73E-43)
            kotlin.jvm.internal.AFwS199S0000000_12 r0 = kotlin.jvm.internal.AFwS199S0000000_12.get$arr$(r0)
            X.01GW r0 = X.C292401Bi.LIZ(r0)
            r5.LJIIJ = r0
            r0 = 265(0x109, float:3.71E-43)
            kotlin.jvm.internal.AFwS199S0000000_12 r0 = kotlin.jvm.internal.AFwS199S0000000_12.get$arr$(r0)
            X.01GW r0 = X.C292401Bi.LIZ(r0)
            r5.LJIIJJI = r0
            r5.LJIIL = r3
            return
        L5e:
            r0 = 0
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C773300UVc.<init>():void");
    }

    public final void LIZIZ(DeviceSignalInfo deviceSignalInfo) {
        int iLIZJ = this.LJIIIIZZ.LIZJ();
        if (iLIZJ != 0) {
            List<DeviceSignalInfo.CaptchaResult> list = deviceSignalInfo.captchaResult;
            DeviceSignalInfo.CaptchaResult captchaResult = new DeviceSignalInfo.CaptchaResult();
            captchaResult.recordTime = this.LJIIIZ;
            int i = 1;
            if (iLIZJ != 1) {
                i = 0;
            }
            captchaResult.isCaptchaFailed = i;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("captchaStatusInfo: recordTime: ");
            sbLIZ.append(captchaResult.recordTime);
            sbLIZ.append(",isCaptchaFailed: ");
            sbLIZ.append(captchaResult.isCaptchaFailed);
            C20441214yg.LIZIZ("DeviceSignalInfo", C2188811AlT.LIZIZ(sbLIZ));
            list.add(captchaResult);
        }
    }

    public final void LIZJ(DeviceSignalInfo deviceSignalInfo) {
        List<DeviceSignalInfo.ScreenClick> list = deviceSignalInfo.screenClick;
        DeviceSignalInfo.ScreenClick screenClick = new DeviceSignalInfo.ScreenClick();
        screenClick.frontScreenClicks = this.LJII.LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("frontScreenClicks=");
        sbLIZ.append(screenClick.frontScreenClicks);
        C20441214yg.LIZIZ("DeviceSignalInfo", C2188811AlT.LIZIZ(sbLIZ));
        list.add(screenClick);
    }

    public final void LJ(boolean z) {
        DeviceSignalInfo deviceSignalInfo = new DeviceSignalInfo();
        try {
            LIZIZ(deviceSignalInfo);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        if (!z) {
            try {
                ((C773310UVd) this.LJIIJ.getValue()).LIZ(deviceSignalInfo);
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                C189200o6.m2constructorimpl(new C098200Yq(th2));
            }
            try {
                ((C2187041Aic) this.LJIIJJI.getValue()).LIZ(deviceSignalInfo);
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
                C189200o6.m2constructorimpl(new C098200Yq(th3));
            }
            try {
                LIZJ(deviceSignalInfo);
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th4) {
                TryCatchGuardChecker.doCheck(th4);
                C189200o6.m2constructorimpl(new C098200Yq(th4));
            }
        }
        C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C0UVX(this, deviceSignalInfo, null), 2);
    }

    public final void LIZLLL(boolean z, boolean z2) {
        int i;
        if (LIZ()) {
            return;
        }
        C563400M7u c563400M7u = this.LJIIIIZZ;
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        c563400M7u.LJ(i);
        this.LJIIIZ = System.currentTimeMillis();
        if (z2) {
            C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C0UVY(this, null), 2);
        }
    }
}
