package X;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0H4o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C435160H4o implements InterfaceC1891350zJl {
    public final int LL;
    public final int LLILLJJLI;
    public final Function0<Unit> LLILLL;
    public final Function1<View, Unit> LLILZ;

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public /* synthetic */ C435160H4o(int i, int i2, Function0 function0) {
        this(i, i2, function0, new C435180H4q());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C435160H4o(int i, int i2, Function0<Unit> function0, Function1<? super View, Unit> function1) {
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = function0;
        this.LLILZ = function1;
    }
}
