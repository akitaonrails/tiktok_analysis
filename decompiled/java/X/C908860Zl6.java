package X;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Zl6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C908860Zl6 implements InterfaceC901690ZYx {
    public final String LL;
    public final String LLILLJJLI;
    public final C419910GdJ LLILLL;
    public final C908850Zl5 LLILZ;
    public final InterfaceC908930ZlD LLILZIL;
    public final Function1<C908560Zkc, Unit> LLILZLL;
    public final Function1<C908560Zkc, Unit> LLIZ;
    public final Map<String, String> LLIZLLLIL;

    public C908860Zl6() {
        throw null;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return C908880Zl8.LIZIZ(this.LL, this.LLILLJJLI, Integer.valueOf(this.LLILLL.LIZ), this.LLILZ.LIZ);
    }

    @Override // X.InterfaceC901690ZYx
    public final Function1<C908560Zkc, Unit> LJIILJJIL() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC901690ZYx
    public final Map<String, String> LLIILII() {
        return this.LLIZLLLIL;
    }

    @Override // X.InterfaceC901690ZYx
    public final String LLILLIZIL() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC901690ZYx
    public final Function1<C908560Zkc, Unit> LLJJIII() {
        return this.LLIZ;
    }

    @Override // X.InterfaceC901690ZYx
    public final InterfaceC908930ZlD getAction() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C908860Zl6)) {
            return false;
        }
        C908860Zl6 c908860Zl6 = (C908860Zl6) interfaceC1891350zJl;
        if (!Intrinsics.LJFF(this.LLILZ.LIZ, c908860Zl6.LLILZ.LIZ) || this.LLILLL.LIZ != c908860Zl6.LLILLL.LIZ) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C908860Zl6)) {
            return false;
        }
        return Intrinsics.LJFF(this.LL, ((C908860Zl6) interfaceC1891350zJl).LL);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C908860Zl6)) {
            return false;
        }
        InterfaceC1891350zJl interfaceC1891350zJl = (InterfaceC1891350zJl) obj;
        if (!areItemTheSame(interfaceC1891350zJl) || !areContentsTheSame(interfaceC1891350zJl)) {
            return false;
        }
        return true;
    }

    public C908860Zl6(String str, String str2, C419910GdJ c419910GdJ, C908850Zl5 c908850Zl5, InterfaceC908930ZlD interfaceC908930ZlD, Map map) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = c419910GdJ;
        this.LLILZ = c908850Zl5;
        this.LLILZIL = interfaceC908930ZlD;
        this.LLILZLL = null;
        this.LLIZ = null;
        this.LLIZLLLIL = map;
    }
}
