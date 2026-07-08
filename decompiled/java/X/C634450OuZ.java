package X;

import com.ss.android.ugc.aweme.api.component.interaction.CommerceInteractionComponent;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0OuZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.api.component.interaction.CommerceInteractionComponentExtKt$handleNotInterestedEvent$2", f = "CommerceInteractionComponentExt.kt", l = {}, m = "invokeSuspend")
public final class C634450OuZ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ CommerceInteractionComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C634450OuZ(CommerceInteractionComponent commerceInteractionComponent, InterfaceC1364105Vn<? super C634450OuZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = commerceInteractionComponent;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C634450OuZ(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CommerceInteractionComponentExtKt@db3d.handleNotInterestedEvent$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C2277881EDy.LIZIZ.disLikeAweme(((VideoItemParams) C631370Opb.LIZ(this.LL)).getAweme(), C737370SwB.LIZ("homepage_hot"), "", 0, 0);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CommerceInteractionComponentExtKt@db3d.handleNotInterestedEvent$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
