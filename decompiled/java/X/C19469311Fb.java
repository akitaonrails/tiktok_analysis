package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.live.alphaplayer.model.DataSource;
import com.ss.android.ugc.aweme.vibefeed.model.VideoFileModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.11Fb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
@C09DV(c = "com.ss.android.ugc.aweme.vibefeed.feed.interact.digg.VibeDiggResManagerImpl$obtainDataSource$2", f = "VibeDiggResManagerImpl.kt", l = {}, m = "invokeSuspend")
public final class C19469311Fb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super DataSource>, Object> {
    public final /* synthetic */ C1389510mGL LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19469311Fb(C1389510mGL c1389510mGL, InterfaceC1364105Vn<? super C19469311Fb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1389510mGL;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C19469311Fb(this.LL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super DataSource> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("VibeDiggResManagerImpl@524d.obtainDataSource$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            this.LL.getClass();
            String strLIZIZ = C1389510mGL.LIZIZ("/heart_3d/config.json");
            this.LL.getClass();
            String strLIZIZ2 = C1389510mGL.LIZIZ("/heart_3d/output.mp4");
            if (strLIZIZ != null && strLIZIZ2 != null) {
                this.LL.getClass();
                String strLIZLLL = C1389510mGL.LIZLLL(strLIZIZ);
                C1227904rF.LIZ.getClass();
                VideoFileModel videoFileModel = (VideoFileModel) C1227904rF.LIZIZ(strLIZLLL, VideoFileModel.class);
                if (videoFileModel == null) {
                    C1C7U.LIZIZ("VibeDiggResManagerImpl@524d.obtainDataSource$2");
                    return null;
                }
                DataSource dataSource = new DataSource();
                VideoFileModel.Item item = videoFileModel.portrait;
                if (item != null) {
                    DataSource.DataInfo dataInfo = new DataSource.DataInfo(strLIZIZ2);
                    dataInfo.setScaleType(item.align);
                    dataInfo.setVersion(item.version);
                    dataInfo.setTotalFrame(item.totalFrame);
                    dataInfo.setMasks(item.masks);
                    dataInfo.setVideoWidth(item.videoWidth);
                    dataInfo.setVideoHeight(item.videoHeight);
                    dataInfo.setActualWidth(item.actualWidth);
                    dataInfo.setActualHeight(item.actualHeight);
                    dataInfo.setAlphaArea(item.alphaFrame);
                    dataInfo.setLayers(item.LIZ());
                    dataInfo.setRgbArea(item.rgbFrame);
                    dataSource.setPortraitDataInfo(dataInfo);
                }
                C1C7U.LIZIZ("VibeDiggResManagerImpl@524d.obtainDataSource$2");
                return dataSource;
            }
            C1C7U.LIZIZ("VibeDiggResManagerImpl@524d.obtainDataSource$2");
            return null;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1C7U.LIZIZ("VibeDiggResManagerImpl@524d.obtainDataSource$2");
            return null;
        }
    }
}
