package X;

import X.InterfaceC593520NPq;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0dW1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1053270dW1<ENUM extends InterfaceC593520NPq<TYPE_OUT>, TYPE_OUT> implements InterfaceC1023650ckF<ENUM, TYPE_OUT> {
    public final String LIZ;
    public final Function1<C1196804mE, ENUM> LIZIZ;

    @Override // X.InterfaceC1023650ckF
    public final boolean LIZJ() {
        return true;
    }

    @Override // X.InterfaceC1023650ckF
    public final Function1<C1196804mE, ENUM> LIZIZ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC1023650ckF
    public final String getName() {
        return this.LIZ;
    }

    @Override // X.InterfaceC1023650ckF
    public final Object LIZ(Object obj) {
        return ((InterfaceC593520NPq) obj).getParamValue();
    }

    public C1053270dW1(String str, Function1 function1) {
        this.LIZ = str;
        this.LIZIZ = function1;
    }
}
