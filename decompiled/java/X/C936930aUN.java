package X;

import com.bytedance.android.live.uikit.reddot.RedDotExtensionKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0aUN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C936930aUN extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C937020aUW LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C936930aUN(C937020aUW c937020aUW) {
        super(0);
        this.LL = c937020aUW;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.LLILLL.xh();
        C937020aUW c937020aUW = this.LL;
        c937020aUW.getClass();
        C915980Zwa.LIZLLL().BT1(EnumC937290aUx.MULTI_TOOL, false, EnumC919090a1b.CLICK, false);
        if (C931810aM7.LIZJ(C930540aK4.LIZJ())) {
            RedDotExtensionKt.LIZ(C0UX6.MULTI_GUEST_TEXT_BANNER_RED_DOT);
            C500260Jjc.LJLJLJ(c937020aUW.LLJILLL, false);
        }
        C937020aUW.N5("notice_board", new C936860aUG(c937020aUW));
        return Unit.LIZ;
    }
}
