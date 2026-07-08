package X;

import android.view.View;
import android.view.ViewTreeObserver;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.template.media.protocol.DMCameraSideMessageStatusReusedSkeletonUISlot;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS372S0200000_6;
import kotlin.jvm.internal.AwS407S0200000_6;
import njp.a;

/* JADX INFO: renamed from: X.0Hbv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.template.media.protocol.DMCameraSideMessageStatusReusedSkeletonUISlot$showAddToStoryGuide$1", f = "DMCameraSideMessageStatusReusedSkeletonUISlot.kt", l = {192}, m = "invokeSuspend")
public final class C444530Hbv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C259800zU<C0P0T> LLILLJJLI;
    public final /* synthetic */ DMCameraSideMessageStatusReusedSkeletonUISlot LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C444530Hbv(C259800zU<C0P0T> c259800zU, DMCameraSideMessageStatusReusedSkeletonUISlot dMCameraSideMessageStatusReusedSkeletonUISlot, int i, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener, InterfaceC1364105Vn<? super C444530Hbv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c259800zU;
        this.LLILLL = dMCameraSideMessageStatusReusedSkeletonUISlot;
        this.LLILZ = i;
        this.LLILZIL = onGlobalLayoutListener;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C444530Hbv(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Type inference failed for: r0v19, types: [T, X.0P0T] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DMCameraSideMessageStatusReusedSkeletonUISlot@d5ae.showAddToStoryGuide$1");
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
            if (AnonymousClass0958.LIZIZ(1500L, this) == objLJFF) {
                C1C7U.LIZIZ("DMCameraSideMessageStatusReusedSkeletonUISlot@d5ae.showAddToStoryGuide$1");
                return objLJFF;
            }
        }
        C259800zU<C0P0T> c259800zU = this.LLILLJJLI;
        C450720Hlu c450720Hlu = new C450720Hlu(this.LLILLL.Jp().getContext());
        View viewJp = this.LLILLL.Jp();
        C1391600mJi c1391600mJi = c450720Hlu.LLILLJJLI;
        c1391600mJi.LIZIZ = viewJp;
        c1391600mJi.LIZLLL = EnumC1235690iGF.BOTTOM;
        c450720Hlu.LLILZ = this.LLILLL.Jp().getContext().getText(2131824840);
        c450720Hlu.LJI(C960203pA.LIZ(R.attr.uj, this.LLILLL.Jp().getContext()));
        c450720Hlu.LJ(new AwS407S0200000_6(this.LLILLL, this.LLILZIL, 75));
        c450720Hlu.LIZJ(new AwS372S0200000_6(this.LLILLL, this.LLILZIL, 68));
        c259800zU.element = c450720Hlu.LIZIZ();
        this.LLILLJJLI.element.show();
        ((Keva) this.LLILLL.LLLILZLLLI.getValue()).storeInt("show_count", this.LLILZ + 1);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DMCameraSideMessageStatusReusedSkeletonUISlot@d5ae.showAddToStoryGuide$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
