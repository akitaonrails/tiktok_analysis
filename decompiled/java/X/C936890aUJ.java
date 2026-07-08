package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.ability.LinkMicAbilityManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0aUJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C936890aUJ extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C937020aUW LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C936890aUJ(C937020aUW c937020aUW) {
        super(0);
        this.LL = c937020aUW;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C915140ZvE.LIZ();
        EnumC936960aUQ enumC936960aUQ = EnumC936960aUQ.GUEST_SHOWDOWN;
        this.LL.getClass();
        C932160aMg.LJFF(enumC936960aUQ, "click", EnumC937290aUx.MULTI_TOOL, false, 0);
        this.LL.LLILLL.xh();
        C937020aUW c937020aUW = this.LL;
        c937020aUW.getClass();
        LinkMicAbilityManager.LJIIIZ.getClass();
        InterfaceC941720ac6 interfaceC941720ac6LIZIZ = C941700ac4.LIZIZ();
        C500260Jjc.LJJIFFI(interfaceC941720ac6LIZIZ != null ? Boolean.valueOf(interfaceC941720ac6LIZIZ.LIZJ("guest_showdown", new C936880aUI(c937020aUW), null)) : null);
        return Unit.LIZ;
    }
}
