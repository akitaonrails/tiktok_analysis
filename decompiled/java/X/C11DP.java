package X;

import androidx.lifecycle.LifecycleOwner;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS605S0100000_26;

/* JADX INFO: renamed from: X.11DP, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public abstract class C11DP<T> extends AbstractC1755430vmX implements C11DO<T> {
    public final C11DR<T> LLILLJJLI;

    public final List<T> LLLII() {
        return this.LLILLJJLI.LJFF;
    }

    @Override // X.AbstractC438050HFr
    public final int getBasicItemCount() {
        return this.LLILLJJLI.LJFF.size();
    }

    @Override // X.AbstractC683510QrV, X.AbstractC438050HFr, X.AbstractC21673619ry
    public final int getItemCount() {
        return super.getItemCount();
    }

    @Override // X.C11DO
    public final C11DR<T> LLILZIL() {
        return this.LLILLJJLI;
    }

    @Override // X.C11DO
    public final void LLII(List<? extends T> list, Function0<Unit> function0) {
        C11DT.LIZ(this, list, function0);
    }

    public final T LLLIIIIL(int i, boolean z) {
        return this.LLILLJJLI.LIZ(i, z);
    }

    public C11DP(LifecycleOwner lifecycleOwner, AbstractC339510DSr<T> abstractC339510DSr, InterfaceC19464611Dg interfaceC19464611Dg) {
        C11DQ c11dq;
        if (interfaceC19464611Dg != null) {
            c11dq = new C11DQ(interfaceC19464611Dg, true, 10);
        } else {
            c11dq = null;
        }
        new C19463211Cs(abstractC339510DSr);
        C11DU c11du = new C11DU(abstractC339510DSr, null);
        super(lifecycleOwner);
        this.LLILLJJLI = new C11DR<>(new C19464711Dh(this, new AwS605S0100000_26(this, (C11DP<Object>) 938)), c11du, c11dq);
    }

    /* JADX WARN: Incorrect type for immutable var: ssa=X.11ho, code=X.0DSr<T>, for r3v0, types: [X.11ho] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C11DP(androidx.lifecycle.LifecycleOwner r2, X.AbstractC339510DSr<T> r3, int r4) {
        /*
            r1 = this;
            r0 = r4 & 2
            if (r0 == 0) goto L9
            X.0DKj r3 = new X.0DKj
            r3.<init>()
        L9:
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11DP.<init>(androidx.lifecycle.LifecycleOwner, X.11ho, int):void");
    }
}
