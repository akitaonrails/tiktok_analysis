package X;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS286S0000000_3;
import kotlin.jvm.internal.AFwS341S0000000_19;

/* JADX INFO: renamed from: X.11TF, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11TF<K, V, K1, V1> extends C11TH<K, V, K1, V1> {
    public Function2<? super K, ? super V, ? extends K1> LIZIZ;
    public InterfaceC1631620sYq<? super K, ? super V, ? super V1, ? extends V1> LIZJ;

    public C11TF() {
        this(0);
    }

    public /* synthetic */ C11TF(int i) {
        this(AFwS286S0000000_3.get$arr$(9), AFwS341S0000000_19.get$arr$(4));
    }

    public C11TF(Function2<? super K, ? super V, ? extends K1> function2, InterfaceC1631620sYq<? super K, ? super V, ? super V1, ? extends V1> interfaceC1631620sYq) {
        this.LIZIZ = function2;
        this.LIZJ = interfaceC1631620sYq;
    }
}
