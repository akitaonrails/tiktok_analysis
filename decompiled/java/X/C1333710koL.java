package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0koL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1333710koL extends C09AY implements Function0<InterfaceC1330810kjf> {
    public C1333710koL() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0kjf, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC1330810kjf invoke() {
        ?? value = C1334400kpS.LJIJ.getValue();
        return value == 0 ? new InterfaceC1330810kjf() { // from class: X.0koV
            @Override // X.InterfaceC1330810kjf
            public final int LIZ() {
                return 0;
            }

            @Override // X.InterfaceC1330810kjf
            public final boolean enable() {
                return false;
            }
        } : value;
    }
}
