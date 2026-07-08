package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.059f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatroom.common.titlebar.SingleTitleBarCenterAssem$subscribeToJumpAvatarWhenTyping$1$1", f = "SingleTitleBarCenterAssem.kt", l = {}, m = "invokeSuspend")
public final class C13061059f extends C09AX implements Function2<Integer, InterfaceC1364105Vn<? super Boolean>, Object> {
    public /* synthetic */ int LL;

    public C13061059f(InterfaceC1364105Vn<? super C13061059f> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C13061059f c13061059f = new C13061059f(interfaceC1364105Vn);
        c13061059f.LL = ((Number) obj).intValue();
        return c13061059f;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C1C7U.LIZ("SingleTitleBarCenterAssem@32f.subscribeToJumpAvatarWhenTyping$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL > 0) {
            z = true;
        } else {
            z = false;
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        C1C7U.LIZIZ("SingleTitleBarCenterAssem@32f.subscribeToJumpAvatarWhenTyping$1$1");
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Integer num, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(Integer.valueOf(num.intValue()), interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
