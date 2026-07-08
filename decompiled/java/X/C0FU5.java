package X;

import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0FU5, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FU5 {
    public static final int LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(0.5d)));
    public final Context LIZ;
    public final C1664680tQA<C0FU3> LIZIZ;
    public final LifecycleOwner LIZJ;
    public C0P0T LIZLLL;
    public C0FU1 LJ;
    public long LJFF;

    static {
        C814420VxA.LIZIZ(C418440Gaw.LIZIZ(104));
    }

    public C0FU5(Context context, C1664680tQA<C0FU3> c1664680tQA, LifecycleOwner lifecycleOwner) {
        this.LIZ = context;
        this.LIZIZ = c1664680tQA;
        this.LIZJ = lifecycleOwner;
        c1664680tQA.LIZ(new C2217381BqS() { // from class: X.0FU8
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C0FU3) obj).LIZIZ);
            }
        }).LJIIIZ(lifecycleOwner, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 845));
    }
}
