package X;

import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.13J7, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final /* synthetic */ class C13J7 extends C2217421BqW implements Function2<InterfaceC19983313Gt, Integer, Boolean> {
    public C13J7(Object obj) {
        super(2, obj, C13JA.class, "readIfAbsent", "readIfAbsent(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Boolean invoke(InterfaceC19983313Gt interfaceC19983313Gt, Integer num) {
        boolean z;
        InterfaceC19983313Gt interfaceC19983313Gt2 = interfaceC19983313Gt;
        int iIntValue = num.intValue();
        C13JA c13ja = (C13JA) this.receiver;
        c13ja.getClass();
        if (!interfaceC19983313Gt2.LJIIIZ(iIntValue) && interfaceC19983313Gt2.LJIIIIZZ(iIntValue).LIZ()) {
            z = true;
        } else {
            z = false;
        }
        c13ja.LIZIZ = z;
        return Boolean.valueOf(z);
    }
}
