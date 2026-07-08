package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.reused.ReusedAssem;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0SbX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C724570SbX extends C09AY implements Function0<C724560SbW> {
    public final /* synthetic */ ReusedAssem<RECEIVER> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C724570SbX(ReusedAssem<RECEIVER> reusedAssem) {
        super(0);
        this.LL = reusedAssem;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0SbW] */
    @Override // kotlin.jvm.functions.Function0
    public final C724560SbW invoke() {
        final ReusedAssem<RECEIVER> reusedAssem = this.LL;
        return new LifecycleOwner() { // from class: X.0SbW
            @Override // androidx.lifecycle.LifecycleOwner
            public final Lifecycle getLifecycle() {
                return reusedAssem.fo();
            }
        };
    }
}
