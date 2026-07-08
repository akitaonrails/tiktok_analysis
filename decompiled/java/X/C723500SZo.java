package X;

import androidx.lifecycle.LifecycleRegistry;
import com.bytedance.assem.arch.reused.ReusedAssem;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0SZo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C723500SZo extends C09AY implements Function0<LifecycleRegistry> {
    public final /* synthetic */ ReusedAssem<RECEIVER> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C723500SZo(ReusedAssem<RECEIVER> reusedAssem) {
        super(0);
        this.LL = reusedAssem;
    }

    @Override // kotlin.jvm.functions.Function0
    public final LifecycleRegistry invoke() {
        return new LifecycleRegistry(this.LL.m128do());
    }
}
