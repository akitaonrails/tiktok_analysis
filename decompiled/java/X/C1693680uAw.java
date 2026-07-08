package X;

import kotlin.jvm.internal.AwS569S0100000_25;

/* JADX INFO: renamed from: X.0uAw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final /* synthetic */ class C1693680uAw {
    public static InterfaceC1693670uAv LIZ(InterfaceC1693670uAv interfaceC1693670uAv, InterfaceC1693670uAv interfaceC1693670uAv2) {
        if (interfaceC1693670uAv2 instanceof C1693620uAq) {
            if (interfaceC1693670uAv instanceof C1693620uAq) {
                AbstractC1682800ttO abstractC1682800ttO = ((C1693620uAq) interfaceC1693670uAv2).LIZIZ;
                float fLIZ = interfaceC1693670uAv2.LIZ();
                AwS569S0100000_25 awS569S0100000_25 = new AwS569S0100000_25(interfaceC1693670uAv, 846);
                if (Float.isNaN(fLIZ)) {
                    fLIZ = ((Number) awS569S0100000_25.invoke()).floatValue();
                }
                return new C1693620uAq(abstractC1682800ttO, fLIZ);
            }
            if (!(interfaceC1693670uAv instanceof C1693620uAq)) {
                return interfaceC1693670uAv2;
            }
        } else if (interfaceC1693670uAv instanceof C1693620uAq) {
            return interfaceC1693670uAv;
        }
        return interfaceC1693670uAv2.LIZLLL(new AwS569S0100000_25(interfaceC1693670uAv, 847));
    }
}
