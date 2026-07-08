package X;

import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.core.AssemContainerBridge;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Sb1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C724250Sb1 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C19EG LL;
    public final /* synthetic */ LifecycleOwner LLILLJJLI;
    public final /* synthetic */ AssemContainerBridge LLILLL;
    public final /* synthetic */ Intent LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ Bundle LLILZLL;
    public final /* synthetic */ InterfaceC1631620sYq<Integer, Integer, Intent, Unit> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C724250Sb1(C19EG c19eg, LifecycleOwner lifecycleOwner, AssemContainerBridge assemContainerBridge, Intent intent, int i, Bundle bundle, InterfaceC1631620sYq<? super Integer, ? super Integer, ? super Intent, Unit> interfaceC1631620sYq) {
        super(0);
        this.LL = c19eg;
        this.LLILLJJLI = lifecycleOwner;
        this.LLILLL = assemContainerBridge;
        this.LLILZ = intent;
        this.LLILZIL = i;
        this.LLILZLL = bundle;
        this.LLIZ = interfaceC1631620sYq;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() throws Throwable {
        C19EG c19eg = this.LL;
        LifecycleOwner lifecycleOwner = this.LLILLJJLI;
        if (C0RUZ.LIZ(c19eg) && lifecycleOwner.getLifecycle().getCurrentState() != Lifecycle.State.DESTROYED) {
            C2204961BRm.LLLIL(this.LLILLL, this.LLILLJJLI, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, new C0WZX("dzBzEgAjS8/YVFkiQFyFdYMFRnha5bggw7RoQixeieIRVlGzD5PJ6mGXEr5s2g==", null));
        }
        return Unit.LIZ;
    }
}
