package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleRegistry;
import com.bytedance.assem.arch.reused.ReusedAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0SbL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C724450SbL extends C09AY implements Function0<Unit> {
    public final /* synthetic */ ReusedAssem<C03H5> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C724450SbL(ReusedAssem<C03H5> reusedAssem) {
        super(0);
        this.LL = reusedAssem;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C724430SbJ c724430SbJ = this.LL.LLJILJILJ;
        if (c724430SbJ != null) {
            ((LifecycleRegistry) c724430SbJ.LLILZ.getValue()).handleLifecycleEvent(Lifecycle.Event.ON_STOP);
        }
        return Unit.LIZ;
    }
}
