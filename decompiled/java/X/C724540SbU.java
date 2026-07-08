package X;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0SbU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C724540SbU extends C09AY implements Function0<LifecycleRegistry> {
    public final /* synthetic */ C724430SbJ LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C724540SbU(C724430SbJ c724430SbJ) {
        super(0);
        this.LL = c724430SbJ;
    }

    @Override // kotlin.jvm.functions.Function0
    public final LifecycleRegistry invoke() {
        return new LifecycleRegistry((LifecycleOwner) this.LL.LLILLL.getValue());
    }
}
