package X;

import com.ss.android.vesdk.VEUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0MUp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.external.ui.RecordServiceBaseImpl$startStripMusicPreview$videoInfo$1", f = "RecordServiceBaseImpl.kt", l = {}, m = "invokeSuspend")
public final class C569330MUp extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super VEUtils.VEVideoFileInfo>, Object> {
    public final /* synthetic */ String LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C569330MUp(String str, InterfaceC1364105Vn<? super C569330MUp> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C569330MUp(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RecordServiceBaseImpl@d40c.startStripMusicPreview$videoInfo$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        VEUtils.VEVideoFileInfo videoFileInfo = VEUtils.getVideoFileInfo(this.LL);
        if (videoFileInfo != null) {
            C1C7U.LIZIZ("RecordServiceBaseImpl@d40c.startStripMusicPreview$videoInfo$1");
            return videoFileInfo;
        }
        throw new RuntimeException("videoInfo fail");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super VEUtils.VEVideoFileInfo> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
