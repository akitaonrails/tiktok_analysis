package X;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import webcast.data.multi_guest_play.Playbook;

/* JADX INFO: renamed from: X.14u5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20412714u5 extends C09AY implements Function1<View, Unit> {
    public final /* synthetic */ C20412014ty LL;
    public final /* synthetic */ Playbook LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20412714u5(C20412014ty c20412014ty, Playbook playbook) {
        super(1);
        this.LL = c20412014ty;
        this.LLILLJJLI = playbook;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        this.LL.LL.LIZ(this.LLILLJJLI, true);
        return Unit.LIZ;
    }
}
