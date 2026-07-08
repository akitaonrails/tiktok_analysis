package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Sbb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C724610Sbb extends C09AY implements Function0<C724620Sbc> {
    public final /* synthetic */ C724430SbJ LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C724610Sbb(C724430SbJ c724430SbJ) {
        super(0);
        this.LL = c724430SbJ;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0Sbc] */
    @Override // kotlin.jvm.functions.Function0
    public final C724620Sbc invoke() {
        final C724430SbJ c724430SbJ = this.LL;
        return new InterfaceC724630Sbd() { // from class: X.0Sbc
            @Override // X.InterfaceC736810SvH
            public final LifecycleOwner getActualLifecycleOwner() {
                return this;
            }

            @Override // androidx.lifecycle.LifecycleOwner
            public final Lifecycle getLifecycle() {
                return (Lifecycle) c724430SbJ.LLILZ.getValue();
            }
        };
    }
}
