package X;

import android.view.MotionEvent;
import android.view.View;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS631S0100000_17;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.11HH, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final /* synthetic */ class C11HH implements C11HI, InterfaceC1635506an {
    public final /* synthetic */ Function2 LL;

    public C11HH(AwS631S0100000_17 awS631S0100000_17) {
        this.LL = awS631S0100000_17;
    }

    @Override // X.C11HI
    public final /* synthetic */ void LIZ(MotionEvent motionEvent, View view) {
        this.LL.invoke(view, motionEvent);
    }

    @Override // X.InterfaceC1635506an
    public final InterfaceC1451105m9<?> getFunctionDelegate() {
        return this.LL;
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C11HI) || !(obj instanceof InterfaceC1635506an)) {
            return false;
        }
        return Intrinsics.LJFF(this.LL, ((InterfaceC1635506an) obj).getFunctionDelegate());
    }
}
