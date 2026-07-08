package X;

import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: renamed from: X.0V4v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C791950V4v {
    public boolean LIZ;
    public long LIZIZ;
    public boolean LIZJ;
    public long LIZLLL;
    public final boolean LJ;
    public final float LJFF;
    public final C0V53 LJI;
    public final boolean LJII;
    public final boolean LJIIIIZZ;
    public final boolean LJIIIZ;
    public final boolean LJIIJ;
    public final boolean LJIIJJI;
    public final boolean LJIIL;
    public final boolean LJIILIIL;
    public final int LJIILJJIL;
    public final C792780V8a LJIILL;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ApmInitConfig{mCacheBufferCount=");
        sbLIZ.append(LSPassThroughRecordSizeConfig.DEFAULT);
        sbLIZ.append(", isReportCacheException=");
        sbLIZ.append(false);
        sbLIZ.append(", mViewIdmonitorPageSwitch=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", mMaxValidPageLoadTimeMs=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", mMaxValidLaunchTimeMs=");
        sbLIZ.append(15000L);
        sbLIZ.append(", mTraceListener=");
        sbLIZ.append((Object) null);
        sbLIZ.append(", mReportEvilMethodSwitch=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", mEvilMethodThresholdMs=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", mLimitEvilMethodDepth=");
        sbLIZ.append(false);
        sbLIZ.append(", mFullFpsTracer=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", mActivityFps=");
        sbLIZ.append(false);
        sbLIZ.append(", mFpsTeaSampleRate=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", mBinderMonitor=");
        sbLIZ.append(false);
        sbLIZ.append(", mTraceExtraFlag=");
        sbLIZ.append(0);
        sbLIZ.append(", mTraceExtraCollectTimeMs=");
        sbLIZ.append(30000L);
        sbLIZ.append(", mActivityLeakDetectConfig=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", mIgnoreNetMonitorUserAgentLabel='");
        sbLIZ.append((String) null);
        sbLIZ.append('\'');
        sbLIZ.append(", mProcessName='");
        sbLIZ.append((String) null);
        sbLIZ.append('\'');
        sbLIZ.append(", mEnableDeviceInfoOnPerfData=");
        sbLIZ.append(false);
        sbLIZ.append(", mLaunchConfig=");
        sbLIZ.append((Object) null);
        sbLIZ.append(", mSupportMultiFrameRate=");
        sbLIZ.append(false);
        sbLIZ.append(", mEnableStorageCollector=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", mEnableCpuAllocOpt=");
        sbLIZ.append(false);
        sbLIZ.append(", mEnableFrameCostOpt=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", mEnableLooperOpt=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(", mEnableLooperDeepOpt=");
        sbLIZ.append(this.LJIIJ);
        sbLIZ.append(", mEnableFpsListenerOpt=");
        sbLIZ.append(this.LJIIJJI);
        sbLIZ.append(", mEnableObserverDetect=");
        sbLIZ.append(0);
        sbLIZ.append(", mSoLoadPriority=");
        sbLIZ.append(this.LJIILJJIL);
        sbLIZ.append(", mAlogUploadStrategy=");
        sbLIZ.append(this.LJIILL);
        sbLIZ.append(", mOptLooperMonitor=");
        sbLIZ.append(false);
        sbLIZ.append(", mHttpService=");
        sbLIZ.append((Object) null);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C791950V4v(C791980V4y c791980V4y) {
        this.LIZ = c791980V4y.LIZ;
        this.LIZIZ = c791980V4y.LIZIZ;
        this.LIZJ = c791980V4y.LIZJ;
        this.LIZLLL = c791980V4y.LIZLLL;
        this.LJ = c791980V4y.LJ;
        this.LJI = c791980V4y.LJFF;
        C792400V6o.LIZIZ = false;
        C792190V5t.LIZ = C792400V6o.LJIIIIZZ();
        C792400V6o.LIZJ = false;
        this.LJIILL = c791980V4y.LJIILJJIL;
        this.LJII = c791980V4y.LJI;
        this.LJFF = c791980V4y.LJIILL;
        this.LJIIIZ = c791980V4y.LJII;
        this.LJIIJ = c791980V4y.LJIIIIZZ;
        this.LJIIJJI = c791980V4y.LJIIIZ;
        this.LJIIIIZZ = c791980V4y.LJIIJ;
        this.LJIILIIL = c791980V4y.LJIIL;
        this.LJIIL = c791980V4y.LJIIJJI;
        this.LJIILJJIL = c791980V4y.LJIILIIL;
    }
}
