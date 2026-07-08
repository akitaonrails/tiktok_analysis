package X;

import X.AbstractC1361510lXB;
import X.C164B;
import Y.AkS108S1100000_31;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeoutException;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS209S0000000_21;

/* JADX INFO: renamed from: X.163A, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public abstract class C163A<ITEM, T extends C164B, C extends AbstractC1361510lXB<ITEM, T>> {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(428));
    public final Handler LIZIZ = C161N.LIZIZ.LLIILII();
    public final ConcurrentHashMap<String, C11NZ<Boolean>> LIZJ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, C11RK<Boolean>> LIZLLL = new ConcurrentHashMap<>();

    public boolean LIZ(ITEM item, String str, C162U c162u, EnumC207100162g enumC207100162g, InterfaceC1389740mGi interfaceC1389740mGi) {
        return false;
    }

    public abstract C LIZJ();

    public abstract EnumC207100162g LIZLLL(ITEM item);

    public abstract String LJ(ITEM item);

    public abstract String LJFF();

    public void LJIIIIZZ(ITEM item, T t, C162U c162u) {
    }

    public void LJIIIZ(ITEM item, String str, Throwable th) {
    }

    public InterfaceC1389740mGi LJIIJ(boolean z, ITEM item, String str, String str2, EnumC207100162g enumC207100162g) {
        return null;
    }

    public abstract C11NZ<Boolean> LJIILJJIL(ITEM item, C162U c162u, String str, InterfaceC1389740mGi interfaceC1389740mGi, String str2);

    public final T LJI(ITEM item, String str) {
        return (T) LIZJ().LIZLLL(item, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C11NZ LJII(String str, boolean z, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it2 = ((ArrayList) list).iterator();
        while (it2.hasNext()) {
            arrayList.add(LJIILL(z, it2.next(), null, str, true));
        }
        return C11NZ.LJLL(arrayList, new InterfaceC1487280oo2() { // from class: X.00DW
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                Object[] objArr = (Object[]) obj;
                int length = objArr.length;
                boolean z2 = false;
                int i = 0;
                while (true) {
                    if (i < length) {
                        if (!((Boolean) objArr[i]).booleanValue()) {
                            break;
                        }
                        i++;
                    } else {
                        z2 = true;
                        break;
                    }
                }
                return Boolean.valueOf(z2);
            }
        });
    }

    public final boolean LIZIZ(ITEM item, String str, C162U c162u, EnumC207100162g enumC207100162g) {
        C164B c164bLJI = LJI(item, str);
        if (c164bLJI == null) {
            return false;
        }
        LJIIIIZZ(item, c164bLJI, c162u);
        Integer numC5 = c164bLJI.c5();
        boolean zA5 = c164bLJI.a5();
        String strB5 = c164bLJI.b5();
        if (strB5 == null) {
            strB5 = "client";
        }
        LJIILIIL(this, enumC207100162g, c162u, numC5, zA5, null, strB5, null, null, c164bLJI.getVariant(), 416);
        return true;
    }

    public final C11NZ<Boolean> LJIILL(boolean z, final ITEM item, final C162U c162u, final String str, final boolean z2) {
        final String strLLIIZ = C161N.LIZIZ.LLIIZ();
        final String strLIZIZ = LIZJ().LIZIZ(item, strLLIIZ);
        AbstractC1604130rqV abstractC1604130rqV = (AbstractC1604130rqV) this.LIZ.getValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LJFF());
        sbLIZ.append(" translate: isFromPreload: ");
        sbLIZ.append(z);
        sbLIZ.append(" enterFrom: ");
        sbLIZ.append(str);
        sbLIZ.append(" hotFlow: ");
        sbLIZ.append(z2);
        sbLIZ.append(" targetLang: ");
        sbLIZ.append(strLLIIZ);
        sbLIZ.append(" key: ");
        sbLIZ.append(strLIZIZ);
        abstractC1604130rqV.LJ(C2188811AlT.LIZIZ(sbLIZ));
        C11NZ<Boolean> c11nz = this.LIZJ.get(strLIZIZ);
        if (c11nz != null) {
            if (!z && C0SKG.LIZ.enablePrefetchJoinRetry) {
                final boolean z3 = false;
                return c11nz.LJJL(new InterfaceC1487280oo2(this) { // from class: X.163e
                    public final /* synthetic */ C163A<ITEM, T, C> LL;

                    {
                        this.LL = this;
                    }

                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    @Override // X.InterfaceC1487280oo2
                    public final Object apply(Object obj) {
                        return this.LL.LJIILL(z3, item, c162u, str, z2);
                    }
                });
            }
            return c11nz;
        }
        final EnumC207100162g enumC207100162gLIZLLL = LIZLLL(item);
        if (LIZIZ(item, strLLIIZ, c162u, enumC207100162gLIZLLL)) {
            return C11NZ.LJJJJZ(Boolean.TRUE);
        }
        final InterfaceC1389740mGi interfaceC1389740mGiLJIIJ = LJIIJ(z, item, str, strLLIIZ, enumC207100162gLIZLLL);
        if (LIZ(item, strLLIIZ, c162u, enumC207100162gLIZLLL, interfaceC1389740mGiLJIIJ)) {
            return C11NZ.LJJJJZ(Boolean.TRUE);
        }
        final int i = 0;
        C11JN c11jnLJJIJIIJI = LJIILJJIL(item, c162u, strLLIIZ, interfaceC1389740mGiLJIIJ, str).LJJJJZI(new AkS108S1100000_31(this, strLIZIZ, 1)).LJJIIZ(new InterfaceC781210Ukh(this, strLIZIZ, i) { // from class: X.16HU
            public final int $t;
            public Object l1;
            public String s0;

            @Override // X.InterfaceC781210Ukh
            public final void run() {
                switch (this.$t) {
                    case 0:
                        run$0(this);
                        break;
                    case 1:
                        run$1(this);
                        break;
                }
            }

            public static final void run$0(C16HU c16hu) {
                ((C163A) c16hu.l1).LIZJ.remove(c16hu.s0);
                C11RK<Boolean> c11rkRemove = ((C163A) c16hu.l1).LIZLLL.remove(c16hu.s0);
                if (c11rkRemove != null) {
                    c11rkRemove.onNext(Boolean.FALSE);
                    c11rkRemove.onComplete();
                }
            }

            public static final void run$1(C16HU c16hu) {
                ((C163A) c16hu.l1).LIZJ.remove(c16hu.s0);
                C11RK<Boolean> c11rkRemove = ((C163A) c16hu.l1).LIZLLL.remove(c16hu.s0);
                if (c11rkRemove != null) {
                    c11rkRemove.onNext(Boolean.FALSE);
                    c11rkRemove.onComplete();
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.$t = i;
                this.l1 = this;
                this.s0 = strLIZIZ;
            }
        }).LJJIJIIJI(new C09JN(this) { // from class: X.163H
            public final /* synthetic */ C163A<ITEM, T, C> LL;

            {
                this.LL = this;
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // X.C09JN
            public final void accept(Object obj) {
                Pair pair;
                C1C7U.LIZ("TranslationRepo@c3d5.translate$request$3");
                Throwable th = (Throwable) obj;
                String str2 = "";
                if (th instanceof C0XIR) {
                    C163W c163w = C163W.SERVER_ERROR;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("server error status code: ");
                    String strValueOf = String.valueOf(((C23112093u) th).getErrorCode());
                    if (strValueOf != null) {
                        str2 = strValueOf;
                    }
                    sbLIZ2.append(str2);
                    pair = new Pair(c163w, C2188811AlT.LIZIZ(sbLIZ2));
                } else if (th instanceof C1494450ozb) {
                    pair = new Pair(C163W.NETWORK_ERROR, "network error msg: NetworkNotAvailable");
                } else if (th instanceof C1494690ozz) {
                    C163W c163w2 = C163W.NETWORK_ERROR;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("network error msg: Cronet Error with http code - ");
                    String strValueOf2 = String.valueOf(((C1494690ozz) th).getStatusCode());
                    if (strValueOf2 != null) {
                        str2 = strValueOf2;
                    }
                    sbLIZ3.append(str2);
                    pair = new Pair(c163w2, C2188811AlT.LIZIZ(sbLIZ3));
                } else if (th instanceof TimeoutException) {
                    pair = new Pair(C163W.NETWORK_ERROR, "network error msg: timeout");
                } else {
                    C163W c163w3 = C163W.CLIENT_ERROR;
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("network error msg: unknown error ");
                    sbLIZ4.append(th);
                    pair = new Pair(c163w3, C2188811AlT.LIZIZ(sbLIZ4));
                }
                C163W c163w4 = (C163W) pair.getFirst();
                String str3 = (String) pair.getSecond();
                Object obj2 = this.LL;
                EnumC207100162g enumC207100162g = enumC207100162gLIZLLL;
                C162U c162u2 = c162u;
                InterfaceC1389740mGi interfaceC1389740mGi = interfaceC1389740mGiLJIIJ;
                obj2.getClass();
                C163A.LJIIJJI(enumC207100162g, c162u2, str3, c163w4, interfaceC1389740mGi, null, null, null, null);
                this.LL.LJIIIZ(item, strLLIIZ, th);
                this.LL.LIZJ.remove(strLIZIZ);
                C11RK<Boolean> c11rkRemove = this.LL.LIZLLL.remove(strLIZIZ);
                if (c11rkRemove != null) {
                    c11rkRemove.onNext(Boolean.FALSE);
                    c11rkRemove.onComplete();
                }
                C1C7U.LIZIZ("TranslationRepo@c3d5.translate$request$3");
            }
        });
        final int i2 = 1;
        C11NZ<Boolean> c11nzLJJIIJZLJL = c11jnLJJIJIIJI.LJJIIJZLJL(new InterfaceC781210Ukh(this, strLIZIZ, i2) { // from class: X.16HU
            public final int $t;
            public Object l1;
            public String s0;

            @Override // X.InterfaceC781210Ukh
            public final void run() {
                switch (this.$t) {
                    case 0:
                        run$0(this);
                        break;
                    case 1:
                        run$1(this);
                        break;
                }
            }

            public static final void run$0(C16HU c16hu) {
                ((C163A) c16hu.l1).LIZJ.remove(c16hu.s0);
                C11RK<Boolean> c11rkRemove = ((C163A) c16hu.l1).LIZLLL.remove(c16hu.s0);
                if (c11rkRemove != null) {
                    c11rkRemove.onNext(Boolean.FALSE);
                    c11rkRemove.onComplete();
                }
            }

            public static final void run$1(C16HU c16hu) {
                ((C163A) c16hu.l1).LIZJ.remove(c16hu.s0);
                C11RK<Boolean> c11rkRemove = ((C163A) c16hu.l1).LIZLLL.remove(c16hu.s0);
                if (c11rkRemove != null) {
                    c11rkRemove.onNext(Boolean.FALSE);
                    c11rkRemove.onComplete();
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.$t = i2;
                this.l1 = this;
                this.s0 = strLIZIZ;
            }
        });
        if (z2) {
            c11nzLJJIIJZLJL = c11nzLJJIIJZLJL.LJJLIIIJJI().LJLLLL();
        }
        this.LIZJ.put(strLIZIZ, c11nzLJJIIJZLJL);
        return c11nzLJJIIJZLJL;
    }

    public static void LJIIJJI(EnumC207100162g enumC207100162g, C162U c162u, String str, C163W c163w, InterfaceC1389740mGi interfaceC1389740mGi, String str2, Integer num, Integer num2, String str3) {
        if (c162u != null) {
            c162u.LIZIZ(enumC207100162g, false, false, null, str, Integer.valueOf(c163w.getErrorCode()), str2, num, num2, str3, null, null, null, null);
        }
        if (interfaceC1389740mGi != null) {
            interfaceC1389740mGi.LIZ(false, Integer.valueOf(c163w.getErrorCode()), str, str2, num, num2);
        }
    }

    public static void LJIILIIL(C163A c163a, EnumC207100162g enumC207100162g, C162U c162u, Integer num, boolean z, InterfaceC1389740mGi interfaceC1389740mGi, String str, Integer num2, Integer num3, String str2, int i) {
        Integer num4 = num3;
        Integer num5 = num2;
        String str3 = str;
        InterfaceC1389740mGi interfaceC1389740mGi2 = interfaceC1389740mGi;
        boolean z2 = z;
        if ((i & 16) != 0) {
            z2 = false;
        }
        String str4 = null;
        if ((i & 32) != 0) {
            interfaceC1389740mGi2 = null;
        }
        if ((i & 64) != 0) {
            str3 = null;
        }
        if ((i & 128) != 0) {
            num5 = null;
        }
        if ((i & 256) != 0) {
            num4 = null;
        }
        if ((i & 512) == 0) {
            str4 = str2;
        }
        c163a.getClass();
        if (c162u != null) {
            c162u.LIZIZ(enumC207100162g, true, z2, num, null, null, str3, num5, num4, str4, null, null, null, null);
        }
        if (interfaceC1389740mGi2 != null) {
            interfaceC1389740mGi2.LIZ(true, null, null, str3, num5, num4);
        }
    }
}
