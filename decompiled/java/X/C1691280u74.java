package X;

import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS604S0100000_25;

/* JADX INFO: renamed from: X.0u74, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1691280u74 extends AbstractC20055413dY implements InterfaceC1697440uH0, InterfaceC1691370u7D, InterfaceC20052813d8 {
    public static final C1691350u7B LLJJIJIIJIL = new InterfaceC1691390u7F() { // from class: X.0u7B
        @Override // X.InterfaceC1691390u7F
        public final boolean LIZ() {
            return false;
        }
    };
    public InterfaceC1691320u78 LLJJ;
    public C1690570u5v LLJJI;
    public boolean LLJJIII;
    public EnumC1684030tvN LLJJIJI;

    @Override // X.InterfaceC20052813d8
    public final /* synthetic */ int LIZLLL(InterfaceC1676350tiz interfaceC1676350tiz, InterfaceC1676340tiy interfaceC1676340tiy, int i) {
        return C1696140uEu.LIZJ(this, interfaceC1676350tiz, interfaceC1676340tiy, i);
    }

    @Override // X.InterfaceC20052813d8
    public final /* synthetic */ int LJIIL(InterfaceC1676350tiz interfaceC1676350tiz, InterfaceC1676340tiy interfaceC1676340tiy, int i) {
        return C1696140uEu.LIZ(this, interfaceC1676350tiz, interfaceC1676340tiy, i);
    }

    @Override // X.InterfaceC20052813d8
    public final /* synthetic */ int LJIJJLI(InterfaceC1676350tiz interfaceC1676350tiz, InterfaceC1676340tiy interfaceC1676340tiy, int i) {
        return C1696140uEu.LIZLLL(this, interfaceC1676350tiz, interfaceC1676340tiy, i);
    }

    @Override // X.InterfaceC20052813d8
    public final /* synthetic */ int LJIL(InterfaceC1676350tiz interfaceC1676350tiz, InterfaceC1676340tiy interfaceC1676340tiy, int i) {
        return C1696140uEu.LIZIZ(this, interfaceC1676350tiz, interfaceC1676340tiy, i);
    }

    @Override // X.InterfaceC1682880ttW
    public final /* synthetic */ Object LJLJJLL(C1691310u77 c1691310u77) {
        return C1697420uGy.LIZ(this, c1691310u77);
    }

    @Override // X.InterfaceC1697440uH0
    public final AbstractC1691420u7I LJJL() {
        Pair pair = new Pair(C1691340u7A.LIZ, this);
        C1691290u75 c1691290u75 = new C1691290u75((AbstractC1691330u79) pair.getFirst());
        Object first = pair.getFirst();
        Object second = pair.getSecond();
        if (first != c1691290u75.LIZ) {
            C1696250uF5.LIZIZ("Check failed.");
        }
        ((C13FE) c1691290u75.LIZIZ).setValue(second);
        return c1691290u75;
    }

    public final boolean LLJJI(int i) {
        if (i == 1) {
            return false;
        }
        if (i != 2) {
            if (i == 5) {
                return this.LLJJIII;
            }
            if (i == 6) {
                if (this.LLJJIII) {
                    return false;
                }
                return true;
            }
            if (i == 3) {
                int i2 = C1691260u72.LIZ[C20052513d5.LJFF(this).LLJJL.ordinal()];
                if (i2 != 1) {
                    if (i2 == 2) {
                        if (this.LLJJIII) {
                            return false;
                        }
                        return true;
                    }
                    throw new C1954807lC();
                }
                return this.LLJJIII;
            }
            if (i == 4) {
                int i3 = C1691260u72.LIZ[C20052513d5.LJFF(this).LLJJL.ordinal()];
                if (i3 != 1) {
                    if (i3 == 2) {
                        return this.LLJJIII;
                    }
                    throw new C1954807lC();
                }
                if (this.LLJJIII) {
                    return false;
                }
                return true;
            }
            "Lazy list does not support beyond bounds layout for the specified direction".toString();
            throw new IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction");
        }
        return true;
    }

    @Override // X.InterfaceC1691370u7D
    public final <T> T LJJLJLI(final int i, Function1<? super InterfaceC1691390u7F, ? extends T> function1) {
        int iLIZIZ;
        if (this.LLJJ.getItemCount() > 0 && this.LLJJ.LIZLLL() && this.LLJILLL) {
            if (LLJJI(i)) {
                iLIZIZ = this.LLJJ.LIZ();
            } else {
                iLIZIZ = this.LLJJ.LIZIZ();
            }
            final C259800zU c259800zU = new C259800zU();
            C1690570u5v c1690570u5v = this.LLJJI;
            c1690570u5v.getClass();
            T t = (T) new C1690580u5w(iLIZIZ, iLIZIZ);
            c1690570u5v.LIZ.LIZLLL(t);
            c259800zU.element = t;
            int iLIZJ = this.LLJJ.LIZJ() * 2;
            int itemCount = this.LLJJ.getItemCount();
            if (iLIZJ > itemCount) {
                iLIZJ = itemCount;
            }
            T tInvoke = null;
            int i2 = 0;
            while (LLJJ((C1690580u5w) c259800zU.element, i) && i2 < iLIZJ) {
                C1690580u5w c1690580u5w = (C1690580u5w) c259800zU.element;
                int i3 = c1690580u5w.LIZ;
                int i4 = c1690580u5w.LIZIZ;
                if (LLJJI(i)) {
                    i4++;
                } else {
                    i3--;
                }
                C1690570u5v c1690570u5v2 = this.LLJJI;
                c1690570u5v2.getClass();
                T t2 = (T) new C1690580u5w(i3, i4);
                c1690570u5v2.LIZ.LIZLLL(t2);
                this.LLJJI.LIZ.LJIIL(c259800zU.element);
                c259800zU.element = t2;
                i2++;
                C20052513d5.LJFF(this).LJIIL();
                tInvoke = function1.invoke(new InterfaceC1691390u7F() { // from class: X.0u73
                    @Override // X.InterfaceC1691390u7F
                    public final boolean LIZ() {
                        return this.LIZ.LLJJ(c259800zU.element, i);
                    }
                });
                if (tInvoke != null) {
                    break;
                }
            }
            this.LLJJI.LIZ.LJIIL(c259800zU.element);
            C20052513d5.LJFF(this).LJIIL();
            return tInvoke;
        }
        return function1.invoke(LLJJIJIIJIL);
    }

    public final boolean LLJJ(C1690580u5w c1690580u5w, int i) {
        if (i != 5 && i != 6) {
            if (i != 3 && i != 4) {
                if (i != 1 && i != 2) {
                    "Lazy list does not support beyond bounds layout for the specified direction".toString();
                    throw new IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction");
                }
            } else if (this.LLJJIJI == EnumC1684030tvN.Vertical) {
                return false;
            }
        } else if (this.LLJJIJI == EnumC1684030tvN.Horizontal) {
            return false;
        }
        if (LLJJI(i)) {
            if (c1690580u5w.LIZIZ < this.LLJJ.getItemCount() - 1) {
                return true;
            }
            return false;
        }
        if (c1690580u5w.LIZ > 0) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC20052813d8
    public final InterfaceC1690350u5Z LJIILL(InterfaceC1689940u4u interfaceC1689940u4u, InterfaceC1673370teB interfaceC1673370teB, long j) {
        AbstractC1686530tzP abstractC1686530tzPLJJJJZ = interfaceC1673370teB.LJJJJZ(j);
        return interfaceC1689940u4u.LJLJJL(abstractC1686530tzPLJJJJZ.LL, abstractC1686530tzPLJJJJZ.LLILLJJLI, C2097608Jq.LJ(), new AwS604S0100000_25(abstractC1686530tzPLJJJJZ, 785));
    }

    public C1691280u74(InterfaceC1691320u78 interfaceC1691320u78, C1690570u5v c1690570u5v, boolean z, EnumC1684030tvN enumC1684030tvN) {
        this.LLJJ = interfaceC1691320u78;
        this.LLJJI = c1690570u5v;
        this.LLJJIII = z;
        this.LLJJIJI = enumC1684030tvN;
    }
}
