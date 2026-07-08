package X;

import com.ss.android.ugc.tiktok.tns.commentsafety.creator.caremode.topguide.CreatorCareModePopView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05D7, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.tiktok.tns.commentsafety.creator.caremode.topguide.CreatorCareModePopView$show$1$1", f = "CreatorCareModePopView.kt", l = {}, m = "invokeSuspend")
public final class C05D7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ CreatorCareModePopView LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05D7(CreatorCareModePopView creatorCareModePopView, InterfaceC1364105Vn<? super C05D7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = creatorCareModePopView;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05D7(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CreatorCareModePopView@9ba6.show$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LJJIIJZLJL();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CreatorCareModePopView@9ba6.show$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
