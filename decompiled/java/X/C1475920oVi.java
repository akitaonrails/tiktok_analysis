package X;

import Y.ARunnableS92S0200000_23;
import com.ss.android.ugc.aweme.video.preload.enginepreloader.EnginePreloader;
import com.ss.mediakit.medialoader.LoaderEventInfo;
import com.ss.mediakit.medialoader.LoaderListener;

/* JADX INFO: renamed from: X.0oVi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1475920oVi implements LoaderListener {
    public final /* synthetic */ EnginePreloader LIZ;

    public C1475920oVi(EnginePreloader enginePreloader) {
        this.LIZ = enginePreloader;
    }

    @Override // com.ss.mediakit.medialoader.LoaderListener
    public final void onLoaderTaskCancel(LoaderEventInfo loaderEventInfo) {
        C786410Ut5.LJJZZIII(C1475000oUE.LJ, new ARunnableS92S0200000_23(loaderEventInfo, this, 33));
    }

    @Override // com.ss.mediakit.medialoader.LoaderListener
    public final void onLoaderTaskCompleted(LoaderEventInfo loaderEventInfo) {
        C786410Ut5.LJJZZIII(C1475000oUE.LJ, new ARunnableS92S0200000_23(loaderEventInfo, this, 32));
    }

    @Override // com.ss.mediakit.medialoader.LoaderListener
    public final void onLoaderTaskStart(LoaderEventInfo loaderEventInfo) {
        C786410Ut5.LJJZZIII(C1475000oUE.LJ, new ARunnableS92S0200000_23(loaderEventInfo, this, 31));
    }
}
