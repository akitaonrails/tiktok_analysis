package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0UlB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C781510UlB implements C0UV1 {
    public final /* synthetic */ Function1<Integer, Unit> LIZ;
    public final /* synthetic */ int LIZIZ;
    public final /* synthetic */ Function0<Unit> LIZJ;

    @Override // X.C0UV1
    public final void onSuccess() {
        this.LIZ.invoke(Integer.valueOf(this.LIZIZ));
    }

    public C781510UlB(int i, Function0 function0, Function1 function1) {
        this.LIZ = function1;
        this.LIZIZ = i;
        this.LIZJ = function0;
    }
}
