package X;

import java.util.List;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0V4t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C791930V4t {
    public List<String> LIZ;
    public List<String> LIZIZ;
    public List<String> LIZJ;
    public final C0V5O LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public final long LJII;
    public final boolean LJIIIIZZ;
    public final boolean LJIIIZ;
    public final boolean LJIIJ;
    public final JSONObject LJIIJJI;
    public final InterfaceC792440V6s LJIIL;
    public final InterfaceC792020V5c LJIILIIL;
    public final Set<C0V58> LJIILJJIL;
    public final long LJIILL;
    public final C0V5M LJIILLIIL;
    public final C0V5P LJIIZILJ;
    public final C0V5W LJIJ;
    public final String LJIJI;
    public final C804360Vgw LJIJJ;
    public final C0VBD LJIJJLI;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ApmStartConfig{mSlardarConfigUrls=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", mDefaultLogReportUrls=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", mExceptionLogReportUrls=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", mMemoryReachTopListener=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", mWithExceptionTrafficDetect=");
        sbLIZ.append(false);
        sbLIZ.append(", mEnableTrafficDetect=");
        sbLIZ.append(true);
        sbLIZ.append(", mWithWebViewTrafficDetect=");
        sbLIZ.append(false);
        sbLIZ.append(", mWithBlockDetect=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", mEnableBlockOnlySampled=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", mWithSeriousBlockDetect=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", mBlockThresholdMs=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", mWithTemperatureDetect=");
        sbLIZ.append(false);
        sbLIZ.append(", mWithDiskSampleBeforeCollect=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", mWithBatteryDetect=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(", mForceUpdateSlardarSetting=");
        sbLIZ.append(this.LJIIJ);
        sbLIZ.append(", mEnableMultiProcessRequestSetting=");
        sbLIZ.append(false);
        sbLIZ.append(", mNetMonitorWithDisconnected=");
        sbLIZ.append(false);
        sbLIZ.append(", mHeader=");
        sbLIZ.append(this.LJIIJJI);
        sbLIZ.append(", mDynamicParams=");
        sbLIZ.append(this.LJIIL);
        sbLIZ.append(", mQueryParams=");
        sbLIZ.append(this.LJIILIIL);
        sbLIZ.append(", mWidgets=");
        sbLIZ.append(this.LJIILJJIL);
        sbLIZ.append(", mDelayNetRequestSeconds=");
        sbLIZ.append(this.LJIILL);
        sbLIZ.append(", mApmStartListener=");
        sbLIZ.append(this.LJIILLIIL);
        sbLIZ.append(", mApmLogListener=");
        sbLIZ.append(this.LJIIZILJ);
        sbLIZ.append(", mStorageCheckListener=");
        sbLIZ.append((Object) null);
        sbLIZ.append(", mExecutor=");
        sbLIZ.append((Object) null);
        sbLIZ.append(", mEncryptor=");
        sbLIZ.append(this.LJIJ);
        sbLIZ.append(", mAlogFilesDir='");
        sbLIZ.append(this.LJIJI);
        sbLIZ.append('\'');
        sbLIZ.append(", mCallback=");
        sbLIZ.append((Object) null);
        sbLIZ.append(", mNtpTimeService=");
        sbLIZ.append((Object) null);
        sbLIZ.append(", provider=");
        sbLIZ.append((Object) null);
        sbLIZ.append(", mDeviceInfoBridge=");
        sbLIZ.append(this.LJIJJ);
        sbLIZ.append(", mInterceptor=");
        sbLIZ.append((Object) null);
        sbLIZ.append(", mEventJsonInterceptor=");
        sbLIZ.append(this.LJIJJLI);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C791930V4t(C791940V4u c791940V4u) {
        this.LJIIJJI = c791940V4u.LJIIJ;
        this.LJIIJ = c791940V4u.LIZ;
        this.LJIIL = c791940V4u.LJIIJJI;
        this.LIZ = c791940V4u.LJII;
        this.LJ = c791940V4u.LIZIZ;
        this.LJFF = c791940V4u.LIZJ;
        this.LJI = c791940V4u.LIZLLL;
        this.LJII = c791940V4u.LJ;
        this.LJIIIZ = c791940V4u.LJI;
        this.LJIILJJIL = c791940V4u.LJIIL;
        this.LIZIZ = c791940V4u.LJIIIIZZ;
        this.LIZJ = c791940V4u.LJIIIZ;
        this.LJIILL = c791940V4u.LJIILIIL;
        this.LJIIIIZZ = c791940V4u.LJFF;
        this.LJIIZILJ = c791940V4u.LJIILL;
        this.LJIILLIIL = c791940V4u.LJIILJJIL;
        this.LIZLLL = c791940V4u.LJIIZILJ;
        this.LJIJ = c791940V4u.LJIJ;
        this.LJIJI = c791940V4u.LJIJJ;
        this.LJIILIIL = c791940V4u.LJIILLIIL;
        this.LJIJJ = c791940V4u.LJIJJLI;
        this.LJIJJLI = c791940V4u.LJIL;
        C0V5N c0v5n = c791940V4u.LJIJI;
        C0V5B.LIZIZ = c0v5n;
        if (c0v5n != null) {
            C0V5B.LIZ = true;
        }
    }
}
