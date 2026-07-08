package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.13f2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20064613f2 extends AbstractC20055413dY implements InterfaceC20051113cr {
    public boolean LLJJ;
    public final boolean LLJJI;
    public Function1<? super InterfaceC1692460u8y, Unit> LLJJIII;

    @Override // X.InterfaceC20051113cr
    public final boolean LJJJJ() {
        return this.LLJJI;
    }

    @Override // X.InterfaceC20051113cr
    public final boolean LLIIJI() {
        return this.LLJJ;
    }

    @Override // X.InterfaceC20051113cr
    public final void LLF(InterfaceC1692460u8y interfaceC1692460u8y) {
        this.LLJJIII.invoke(interfaceC1692460u8y);
    }

    public C20064613f2(Function1 function1, boolean z, boolean z2) {
        this.LLJJ = z;
        this.LLJJI = z2;
        this.LLJJIII = function1;
    }
}
