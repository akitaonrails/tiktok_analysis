package X;

import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.gamora.recorder.greenscreen.e0;
import com.ss.android.vesdk.VEUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0miS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.greenscreen.RecordGreenScreenUIComponent$recordStickerMaterialPickerEventListener$2$1$onVideoMaterialApply$1", f = "RecordGreenScreenComponent.kt", l = {}, m = "invokeSuspend")
public final class C1406940miS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ e0 LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1406940miS(String str, e0 e0Var, String str2, InterfaceC1364105Vn<? super C1406940miS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = e0Var;
        this.LLILLL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1406940miS(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RecordGreenScreenUIComponent@2733.recordStickerMaterialPickerEventListener$2$1$onVideoMaterialApply$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL.length() == 0) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("RecordGreenScreenUIComponent@2733.recordStickerMaterialPickerEventListener$2$1$onVideoMaterialApply$1");
            return unit;
        }
        VEUtils.VEVideoFileInfo videoFileInfo = VEUtils.getVideoFileInfo(this.LL);
        if (videoFileInfo != null) {
            int i = videoFileInfo.duration;
            e0 e0Var = this.LLILLJJLI;
            String str = this.LLILLL;
            C1403460mcq c1403460mcq = C1403460mcq.LIZ;
            ShortVideoContext shortVideoContext = e0Var.getShortVideoContext();
            c1403460mcq.getClass();
            C1403460mcq.LIZIZ(shortVideoContext, "video", i, str);
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("RecordGreenScreenUIComponent@2733.recordStickerMaterialPickerEventListener$2$1$onVideoMaterialApply$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
