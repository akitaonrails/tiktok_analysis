package X;

import com.bytedance.android.live.publicscreen.impl.caption.CaptionTextWidgetV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Jh2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.live.publicscreen.impl.caption.CaptionTextWidgetV2$onLoad$3$3", f = "CaptionTextWidgetV2.kt", l = {247}, m = "invokeSuspend")
public final class C498660Jh2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ CaptionTextWidgetV2 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C498660Jh2(CaptionTextWidgetV2 captionTextWidgetV2, InterfaceC1364105Vn<? super C498660Jh2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = captionTextWidgetV2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C498660Jh2(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CaptionTextWidgetV2@12b5.onLoad$3$3");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(1000L, this) == objLJFF) {
                C1C7U.LIZIZ("CaptionTextWidgetV2@12b5.onLoad$3$3");
                return objLJFF;
            }
        }
        C1113800f5e c1113800f5e = C1113800f5e.LIZ;
        C785230UrB c785230UrB = new C785230UrB(EnumC1102750enp.SHARE.getView(this.LLILLJJLI.dataChannel));
        c785230UrB.LIZLLL(2131842689);
        c785230UrB.LJIILL = new InterfaceC254600ye() { // from class: X.0Jh3
            @Override // X.InterfaceC254600ye
            public final void onShow() {
                InterfaceC1106030et7.t6.LJFF(Boolean.TRUE);
            }
        };
        c1113800f5e.LJ(new C785270UrF(c785230UrB), EnumC1120860fH2.CAPTION, this.LLILLJJLI.dataChannel);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CaptionTextWidgetV2@12b5.onLoad$3$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
