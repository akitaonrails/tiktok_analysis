package X;

import android.animation.ValueAnimator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Hp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatroom.common.titlebar.SingleTitleBarCenterAssem$subscribeToJumpAvatarWhenTyping$1$2", f = "SingleTitleBarCenterAssem.kt", l = {730}, m = "invokeSuspend")
public final class C1327905Hp extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C01GW<ValueAnimator> LLILLJJLI;
    public final /* synthetic */ C05YD<Integer> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1327905Hp(C01GW<? extends ValueAnimator> c01gw, C05YD<Integer> c05yd, InterfaceC1364105Vn<? super C1327905Hp> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c01gw;
        this.LLILLL = c05yd;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1327905Hp(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SingleTitleBarCenterAssem@32f.subscribeToJumpAvatarWhenTyping$1$2");
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
            ValueAnimator value = this.LLILLJJLI.getValue();
            C05YD<Integer> c05yd = this.LLILLL;
            this.LL = 1;
            if (C1590306Kn.LIZIZ(value, c05yd, this) == objLJFF) {
                C1C7U.LIZIZ("SingleTitleBarCenterAssem@32f.subscribeToJumpAvatarWhenTyping$1$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SingleTitleBarCenterAssem@32f.subscribeToJumpAvatarWhenTyping$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
