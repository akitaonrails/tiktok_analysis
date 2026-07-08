package X;

import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.AwS582S0100000_3;

/* JADX INFO: renamed from: X.0FWF, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FWF {
    public final Context LIZ;
    public final LifecycleOwner LIZIZ;

    public C0FWF(Context context, C1664680tQA<C0FWH> c1664680tQA, LifecycleOwner lifecycleOwner) {
        this.LIZ = context;
        this.LIZIZ = lifecycleOwner;
        c1664680tQA.LIZ(new C2217381BqS() { // from class: X.0FWG
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0FWH) obj).LIZ;
            }
        }).LJIIIZ(lifecycleOwner, Lifecycle.State.STARTED, new AwS582S0100000_3(this, 75));
    }
}
