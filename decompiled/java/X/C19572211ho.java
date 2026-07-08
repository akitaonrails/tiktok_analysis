package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.11ho, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19572211ho extends AbstractC339510DSr<InterfaceC1891350zJl> {
    @Override // X.AbstractC339510DSr
    public final boolean LIZ(InterfaceC1891350zJl interfaceC1891350zJl, InterfaceC1891350zJl interfaceC1891350zJl2) {
        InterfaceC1891350zJl interfaceC1891350zJl3 = interfaceC1891350zJl;
        InterfaceC1891350zJl interfaceC1891350zJl4 = interfaceC1891350zJl2;
        if ((interfaceC1891350zJl3 instanceof C993750by1) && (interfaceC1891350zJl4 instanceof C993750by1)) {
            if (((C993750by1) interfaceC1891350zJl3).LL == ((C993750by1) interfaceC1891350zJl4).LL) {
                return true;
            }
            return false;
        }
        if ((interfaceC1891350zJl3 instanceof C1265420j2C) && (interfaceC1891350zJl4 instanceof C1265420j2C)) {
            C1265420j2C c1265420j2C = (C1265420j2C) interfaceC1891350zJl3;
            C1265420j2C c1265420j2C2 = (C1265420j2C) interfaceC1891350zJl4;
            if (c1265420j2C.LL == c1265420j2C2.LL && Intrinsics.LJFF(c1265420j2C.LLILLJJLI, c1265420j2C2.LLILLJJLI)) {
                return true;
            }
            return false;
        }
        if ((interfaceC1891350zJl3 instanceof C1782830wUj) && (interfaceC1891350zJl4 instanceof C1782830wUj) && ((C1782830wUj) interfaceC1891350zJl3).LL == ((C1782830wUj) interfaceC1891350zJl4).LL) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC339510DSr
    public final boolean LIZIZ(InterfaceC1891350zJl interfaceC1891350zJl, InterfaceC1891350zJl interfaceC1891350zJl2) {
        InterfaceC1891350zJl interfaceC1891350zJl3 = interfaceC1891350zJl;
        InterfaceC1891350zJl interfaceC1891350zJl4 = interfaceC1891350zJl2;
        if ((interfaceC1891350zJl3 instanceof C993750by1) && (interfaceC1891350zJl4 instanceof C993750by1)) {
            if (((C993750by1) interfaceC1891350zJl3).LL == ((C993750by1) interfaceC1891350zJl4).LL) {
                return true;
            }
            return false;
        }
        if ((interfaceC1891350zJl3 instanceof C1265420j2C) && (interfaceC1891350zJl4 instanceof C1265420j2C)) {
            C1265420j2C c1265420j2C = (C1265420j2C) interfaceC1891350zJl3;
            C1265420j2C c1265420j2C2 = (C1265420j2C) interfaceC1891350zJl4;
            if (c1265420j2C.LL == c1265420j2C2.LL && Intrinsics.LJFF(c1265420j2C.LLILLJJLI.getUid(), c1265420j2C2.LLILLJJLI.getUid())) {
                return true;
            }
            return false;
        }
        if ((interfaceC1891350zJl3 instanceof C1782830wUj) && (interfaceC1891350zJl4 instanceof C1782830wUj) && ((C1782830wUj) interfaceC1891350zJl3).LL == ((C1782830wUj) interfaceC1891350zJl4).LL) {
            return true;
        }
        return false;
    }
}
