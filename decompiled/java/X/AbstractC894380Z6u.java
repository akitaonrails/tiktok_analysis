package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.refactor.viewmodel.BaseActionViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Z6u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public abstract class AbstractC894380Z6u<VM extends BaseActionViewModel<?>> implements InterfaceC111300bX {
    public final InterfaceC2172841A1y LL;
    public final Function0<Boolean> LLILLJJLI;
    public final Function2<VM, Activity, Unit> LLILLL;
    public final Function2<VM, InterfaceC893080Z1u, Unit> LLILZ;
    public final Function1<VM, Unit> LLILZIL;
    public final Function1<VM, Unit> LLILZLL;

    public Function0<Boolean> LIZ() {
        return this.LLILLJJLI;
    }

    public Function2<VM, Activity, Unit> LIZIZ() {
        return this.LLILLL;
    }

    public Function1<VM, Unit> LIZJ() {
        return this.LLILZLL;
    }

    public Function1<VM, Unit> LIZLLL() {
        return this.LLILZIL;
    }

    public InterfaceC2172841A1y LJ() {
        return this.LL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC894380Z6u(InterfaceC2172841A1y interfaceC2172841A1y, Function0<Boolean> function0, Function2<? super VM, ? super Activity, Unit> function2, Function2<? super VM, ? super InterfaceC893080Z1u, Unit> function22, Function1<? super VM, Unit> function1, Function1<? super VM, Unit> function12) {
        this.LL = interfaceC2172841A1y;
        this.LLILLJJLI = function0;
        this.LLILLL = function2;
        this.LLILZ = function22;
        this.LLILZIL = function1;
        this.LLILZLL = function12;
    }
}
