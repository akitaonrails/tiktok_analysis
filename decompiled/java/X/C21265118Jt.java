package X;

import android.content.Context;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.nita.memory.MemoryManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.18Jt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21265118Jt extends C09AY implements Function0<Unit> {
    public final /* synthetic */ LifecycleObserver LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ InterfaceC21263418Jc LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21265118Jt(GenericLifecycleObserver genericLifecycleObserver, int i, Context context, InterfaceC21263418Jc interfaceC21263418Jc) {
        super(0);
        this.LL = genericLifecycleObserver;
        this.LLILLJJLI = i;
        this.LLILLL = context;
        this.LLILZ = interfaceC21263418Jc;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (((LifecycleOwner) this.LLILLL).getLifecycle().getCurrentState().compareTo(Lifecycle.State.DESTROYED) > 0) {
            ((LifecycleOwner) this.LLILLL).getLifecycle().addObserver(this.LL);
        } else {
            MemoryManager memoryManager = MemoryManager.LLJIJIL;
            int i = this.LLILLJJLI;
            Context context = this.LLILLL;
            memoryManager.getClass();
            MemoryManager.LJIIJ(i, context);
        }
        return Unit.LIZ;
    }
}
