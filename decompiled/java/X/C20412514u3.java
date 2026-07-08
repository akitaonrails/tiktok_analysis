package X;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import webcast.data.multi_guest_play.Playbook;

/* JADX INFO: renamed from: X.14u3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20412514u3 extends C09AY implements Function1<View, Unit> {
    public final /* synthetic */ C20412014ty LL;
    public final /* synthetic */ Playbook LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20412514u3(C20412014ty c20412014ty, Playbook playbook) {
        super(1);
        this.LL = c20412014ty;
        this.LLILLJJLI = playbook;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        C20412014ty c20412014ty = this.LL;
        InterfaceC20412914u7 interfaceC20412914u7 = c20412014ty.LL;
        Playbook playbook = this.LLILLJJLI;
        interfaceC20412914u7.LIZIZ(playbook, new C20412114tz(c20412014ty, playbook));
        return Unit.LIZ;
    }
}
