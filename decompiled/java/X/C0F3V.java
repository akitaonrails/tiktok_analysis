package X;

import com.bytedance.ies.nle.editor_jni.NLEMediaUtil;
import com.bytedance.ies.nle.editor_jni.VecString;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0F3V, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene$preloadVEVideoInfo$1", f = "MvChoosePhotoScene.kt", l = {}, m = "invokeSuspend")
public final class C0F3V extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ TikTokMediaModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0F3V(TikTokMediaModel tikTokMediaModel, InterfaceC1364105Vn<? super C0F3V> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = tikTokMediaModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0F3V(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MvChoosePhotoScene@c985.preloadVEVideoInfo$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0FGC.LIZ(2);
        NLEMediaUtil.preloadMediaInfo(new VecString(C1697810uHb.LJ(this.LL.LJFF())), null);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MvChoosePhotoScene@c985.preloadVEVideoInfo$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
