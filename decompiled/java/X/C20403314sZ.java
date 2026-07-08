package X;

import androidx.lifecycle.Observer;
import kotlin.jvm.functions.Function0;
import webcast.data.multi_guest_play.ActivePlaybook;

/* JADX INFO: renamed from: X.14sZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20403314sZ extends C09AY implements Function0<Observer<ActivePlaybook>> {
    public final /* synthetic */ C20394514r9 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20403314sZ(C20394514r9 c20394514r9) {
        super(0);
        this.LL = c20394514r9;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Observer<ActivePlaybook> invoke() {
        final C20394514r9 c20394514r9 = this.LL;
        return new Observer() { // from class: X.14sc
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                c20394514r9.LJIIIZ((ActivePlaybook) obj);
            }
        };
    }
}
