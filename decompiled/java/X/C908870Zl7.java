package X;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Zl7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C908870Zl7 implements InterfaceC901690ZYx {
    public final String LL;
    public final String LLILLJJLI;
    public final C908850Zl5 LLILLL;
    public final InterfaceC908930ZlD LLILZ;
    public final Function1<C908560Zkc, Unit> LLILZIL;
    public final Function1<C908560Zkc, Unit> LLILZLL;
    public final Map<String, String> LLIZ;

    public C908870Zl7() {
        throw null;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return C908880Zl8.LIZ(this.LL, this.LLILLJJLI);
    }

    @Override // X.InterfaceC901690ZYx
    public final Function1<C908560Zkc, Unit> LJIILJJIL() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC901690ZYx
    public final Map<String, String> LLIILII() {
        return this.LLIZ;
    }

    @Override // X.InterfaceC901690ZYx
    public final String LLILLIZIL() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC901690ZYx
    public final Function1<C908560Zkc, Unit> LLJJIII() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC901690ZYx
    public final InterfaceC908930ZlD getAction() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C908870Zl7)) {
            return false;
        }
        return Intrinsics.LJFF(this.LLILLL.LIZ, ((C908870Zl7) interfaceC1891350zJl).LLILLL.LIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C908870Zl7)) {
            return false;
        }
        return Intrinsics.LJFF(this.LL, ((C908870Zl7) interfaceC1891350zJl).LL);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C908870Zl7)) {
            return false;
        }
        InterfaceC1891350zJl interfaceC1891350zJl = (InterfaceC1891350zJl) obj;
        if (!areItemTheSame(interfaceC1891350zJl) || !areContentsTheSame(interfaceC1891350zJl)) {
            return false;
        }
        return true;
    }

    public C908870Zl7(String str, String str2, C908850Zl5 c908850Zl5, C459950I1x c459950I1x, Map map) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = c908850Zl5;
        this.LLILZ = c459950I1x;
        this.LLILZIL = null;
        this.LLILZLL = null;
        this.LLIZ = map;
    }
}
