package X;

import com.ss.android.ugc.aweme.creative.model.ailive.AILivePhotoModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0oDW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.edit.toolbar.impl.AiLiveStoryToolbarHandler$1$5", f = "AiLiveStoryToolbarHandler.kt", l = {}, m = "invokeSuspend")
public final class C1464640oDW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1464660oDY LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1464640oDW(C1464660oDY c1464660oDY, InterfaceC1364105Vn<? super C1464640oDW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1464660oDY;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1464640oDW(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AiLiveStoryToolbarHandler@db9d.<init>$1$5");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        AILivePhotoModel aILivePhotoModel = this.LL.LJFF().getAILivePhotoModel();
        if (aILivePhotoModel.LJIIIIZZ() || (aILivePhotoModel.lastFailProgressModel != null && aILivePhotoModel.LJFF())) {
            C1464660oDY c1464660oDY = this.LL;
            InterfaceC1455680nz4 interfaceC1455680nz4 = (InterfaceC1455680nz4) c1464660oDY.LLILZIL.getValue(c1464660oDY, C1464660oDY.LLJILJIL[3]);
            if (interfaceC1455680nz4 != null) {
                interfaceC1455680nz4.Oq2();
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AiLiveStoryToolbarHandler@db9d.<init>$1$5");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
