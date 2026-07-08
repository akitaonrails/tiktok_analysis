package X;

import X.InterfaceC593520NPq;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS252S0000000_16;

/* JADX INFO: renamed from: X.0dW0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1053260dW0<ENUM extends InterfaceC593520NPq<TYPE_OUT>, TYPE_OUT> implements InterfaceC1023650ckF<ENUM, TYPE_OUT> {
    public final String LIZ;
    public final Function1<C1196804mE, ENUM> LIZIZ;

    @Override // X.InterfaceC1023650ckF
    public final boolean LIZJ() {
        return false;
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
        InterfaceC593520NPq interfaceC593520NPq = (InterfaceC593520NPq) obj;
        if (interfaceC593520NPq != null) {
            return interfaceC593520NPq.getParamValue();
        }
        return null;
    }

    public C1053260dW0(String str, AFwS252S0000000_16 aFwS252S0000000_16) {
        this.LIZ = str;
        this.LIZIZ = aFwS252S0000000_16;
    }
}
