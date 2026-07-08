package X;

import Y.ALAdapterS8S0300000_18;
import Y.AUListenerS225S0200000_18;
import android.animation.ValueAnimator;
import android.view.animation.DecelerateInterpolator;
import com.google.android.material.appbar.AppBarLayout$Behavior;
import com.ss.android.ugc.aweme.ecommerce.mix.view.ECBaseMixContainerFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS597S0100000_18;
import njp.a;

/* JADX INFO: renamed from: X.0gsg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mix.view.ECBaseMixContainerFragment$smoothScroll$1", f = "ECBaseMixContainerFragment.kt", l = {386}, m = "invokeSuspend")
public final class C1182640gsg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ AppBarLayout$Behavior LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ long LLILZLL;
    public final /* synthetic */ ECBaseMixContainerFragment<C1161750gKz> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1182640gsg(AppBarLayout$Behavior appBarLayout$Behavior, int i, long j, ECBaseMixContainerFragment<C1161750gKz> eCBaseMixContainerFragment, InterfaceC1364105Vn<? super C1182640gsg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = appBarLayout$Behavior;
        this.LLILZIL = i;
        this.LLILZLL = j;
        this.LLIZ = eCBaseMixContainerFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1182640gsg c1182640gsg = new C1182640gsg(this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
        c1182640gsg.LLILLL = obj;
        return c1182640gsg;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ECBaseMixContainerFragment@e0ba.smoothScroll$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLL;
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.LLILZ.getTopAndBottomOffset(), -this.LLILZIL);
            long j = this.LLILZLL;
            AppBarLayout$Behavior appBarLayout$Behavior = this.LLILZ;
            ECBaseMixContainerFragment<C1161750gKz> eCBaseMixContainerFragment = this.LLIZ;
            valueAnimatorOfInt.setDuration(j);
            valueAnimatorOfInt.setInterpolator(new DecelerateInterpolator());
            valueAnimatorOfInt.addUpdateListener(new AUListenerS225S0200000_18(appBarLayout$Behavior, eCBaseMixContainerFragment, 1));
            this.LLILLL = interfaceC497601wk;
            this.LL = valueAnimatorOfInt;
            this.LLILLJJLI = 1;
            C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(this));
            c2252611DEt.LJIJJ();
            valueAnimatorOfInt.addListener(new ALAdapterS8S0300000_18(c2252611DEt, valueAnimatorOfInt, interfaceC497601wk, 1));
            c2252611DEt.LJJII(new AwS597S0100000_18(valueAnimatorOfInt, 937));
            valueAnimatorOfInt.start();
            Object objLJIJ = c2252611DEt.LJIJ();
            if (objLJIJ == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (objLJIJ == objLJFF) {
                C1C7U.LIZIZ("ECBaseMixContainerFragment@e0ba.smoothScroll$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ECBaseMixContainerFragment@e0ba.smoothScroll$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
