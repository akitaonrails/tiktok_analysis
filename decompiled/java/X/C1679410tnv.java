package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tnv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1679410tnv extends AbstractC20055413dY implements InterfaceC20051413cu {
    public Function1<? super InterfaceC1679420tnw, Unit> LLJJ;
    public InterfaceC1679420tnw LLJJI;

    public C1679410tnv(Function1<? super InterfaceC1679420tnw, Unit> function1) {
        this.LLJJ = function1;
    }

    @Override // X.InterfaceC20051413cu
    public final void LLIIIZ(EnumC20061113eT enumC20061113eT) {
        if (!Intrinsics.LJFF(this.LLJJI, enumC20061113eT)) {
            this.LLJJI = enumC20061113eT;
            this.LLJJ.invoke(enumC20061113eT);
        }
    }
}
