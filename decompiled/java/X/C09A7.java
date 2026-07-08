package X;

import Y.AObjectS160S0000000_3;
import Y.AObjectS358S0200000_3;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.09A7, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09A7 implements CoroutineContext, Serializable {
    public final CoroutineContext LL;
    public final CoroutineContext.Element LLILLJJLI;

    private final int LJI() {
        int i = 2;
        C09A7 c09a7 = this;
        while (true) {
            CoroutineContext coroutineContext = c09a7.LL;
            if (!(coroutineContext instanceof C09A7) || (c09a7 = (C09A7) coroutineContext) == null) {
                break;
            }
            i++;
        }
        return i;
    }

    public int hashCode() {
        return this.LL.hashCode() + this.LLILLJJLI.hashCode();
    }

    private final Object writeReplace() {
        int iLJI = LJI();
        final CoroutineContext[] coroutineContextArr = new CoroutineContext[iLJI];
        C118300cf c118300cf = new C118300cf();
        fold(Unit.LIZ, new AObjectS358S0200000_3(coroutineContextArr, c118300cf, 0));
        if (c118300cf.element == iLJI) {
            return new Serializable(coroutineContextArr) { // from class: X.09A8
                public static final C09A9 LLILLJJLI = new Object() { // from class: X.09A9
                };
                public static final long serialVersionUID = 0;
                public final CoroutineContext[] LL;

                private final Object readResolve() {
                    CoroutineContext[] coroutineContextArr2 = this.LL;
                    CoroutineContext coroutineContextPlus = C23271099x.INSTANCE;
                    for (CoroutineContext coroutineContext : coroutineContextArr2) {
                        coroutineContextPlus = coroutineContextPlus.plus(coroutineContext);
                    }
                    return coroutineContextPlus;
                }

                {
                    this.LL = coroutineContextArr;
                }
            };
        }
        throw new IllegalStateException("Check failed.");
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('[');
        sbLIZ.append((String) fold("", new AObjectS160S0000000_3(1)));
        sbLIZ.append(']');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    private final boolean LIZJ(CoroutineContext.Element element) {
        return Intrinsics.LJFF(get(element.getKey()), element);
    }

    private final boolean LJ(C09A7 c09a7) {
        while (LIZJ(c09a7.LLILLJJLI)) {
            CoroutineContext coroutineContext = c09a7.LL;
            if (coroutineContext instanceof C09A7) {
                c09a7 = (C09A7) coroutineContext;
            } else {
                return LIZJ((CoroutineContext.Element) coroutineContext);
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C09A7) {
                C09A7 c09a7 = (C09A7) obj;
                if (c09a7.LJI() == LJI() && c09a7.LJ(this)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public <E extends CoroutineContext.Element> E get(InterfaceC23272099y<E> interfaceC23272099y) {
        C09A7 c09a7 = this;
        while (true) {
            E e = (E) c09a7.LLILLJJLI.get(interfaceC23272099y);
            if (e != null) {
                return e;
            }
            CoroutineContext coroutineContext = c09a7.LL;
            if (coroutineContext instanceof C09A7) {
                c09a7 = (C09A7) coroutineContext;
            } else {
                return (E) coroutineContext.get(interfaceC23272099y);
            }
        }
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(InterfaceC23272099y<?> interfaceC23272099y) {
        if (this.LLILLJJLI.get(interfaceC23272099y) != null) {
            return this.LL;
        }
        CoroutineContext coroutineContextMinusKey = this.LL.minusKey(interfaceC23272099y);
        if (coroutineContextMinusKey == this.LL) {
            return this;
        }
        if (coroutineContextMinusKey == C23271099x.INSTANCE) {
            return this.LLILLJJLI;
        }
        return new C09A7(coroutineContextMinusKey, this.LLILLJJLI);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext plus(CoroutineContext coroutineContext) {
        return C09A6.LIZIZ(this, coroutineContext);
    }

    public C09A7(CoroutineContext coroutineContext, CoroutineContext.Element element) {
        this.LL = coroutineContext;
        this.LLILLJJLI = element;
    }

    public static final String LJIIIIZZ(String str, CoroutineContext.Element element) {
        if (str.length() == 0) {
            return element.toString();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(", ");
        sbLIZ.append(element);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public <R> R fold(R r, Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return function2.invoke((Object) this.LL.fold(r, function2), this.LLILLJJLI);
    }

    public static final Unit LJIIIZ(CoroutineContext[] coroutineContextArr, C118300cf c118300cf, Unit unit, CoroutineContext.Element element) {
        int i = c118300cf.element;
        c118300cf.element = i + 1;
        coroutineContextArr[i] = element;
        return Unit.LIZ;
    }
}
