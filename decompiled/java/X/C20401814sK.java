package X;

import androidx.lifecycle.Observer;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import webcast.data.multi_guest_play.Playbook;

/* JADX INFO: renamed from: X.14sK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20401814sK extends C09AY implements Function0<Observer<List<? extends Playbook>>> {
    public final /* synthetic */ C20394514r9 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20401814sK(C20394514r9 c20394514r9) {
        super(0);
        this.LL = c20394514r9;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Observer<List<? extends Playbook>> invoke() {
        final C20394514r9 c20394514r9 = this.LL;
        return new Observer() { // from class: X.14sL
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                C20394514r9 c20394514r92 = c20394514r9;
                if (c20394514r92.LLJJIII) {
                    c20394514r92.LLJJIII = false;
                    return;
                }
                Function2<List<Playbook>, String, Unit> function2 = c20394514r92.LLILZLL;
                if (obj == null) {
                    obj = C13BV.INSTANCE;
                }
                function2.invoke((List<Playbook>) obj, "recommendPlaybookListObserver");
            }
        };
    }
}
