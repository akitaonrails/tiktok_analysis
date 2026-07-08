package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import webcast.data.multi_guest_play.Playbook;

/* JADX INFO: renamed from: X.14tz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20412114tz extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C20412014ty LL;
    public final /* synthetic */ Playbook LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20412114tz(C20412014ty c20412014ty, Playbook playbook) {
        super(0);
        this.LL = c20412014ty;
        this.LLILLJJLI = playbook;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C20412014ty c20412014ty = this.LL;
        Playbook playbook = this.LLILLJJLI;
        c20412014ty.LLILZIL.setText(C497740JfY.LJIJI(2131854124));
        C500260Jjc.LJLIIIL(500L, c20412014ty.LLILZ, new C20412714u5(c20412014ty, playbook));
        this.LL.LL.LIZ(this.LLILLJJLI, false);
        return Unit.LIZ;
    }
}
