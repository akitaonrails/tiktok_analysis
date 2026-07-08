package X;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS211S0300000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Zl3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C908830Zl3 implements InterfaceC908890Zl9 {
    public final String LL;
    public final String LLILLJJLI;
    public final C908840Zl4 LLILLL;
    public final C908850Zl5 LLILZ;
    public final InterfaceC908930ZlD LLILZIL;
    public final Function1<C908560Zkc, Unit> LLILZLL;
    public final Function1<C908560Zkc, Unit> LLIZ;
    public final Map<String, String> LLIZLLLIL;

    public C908830Zl3() {
        throw null;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BusinessChatRemoteIconItem(buttonId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", buttonName=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", remoteIcon=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", title=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", action=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", onClick=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", onDisplay=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", eventTrackingExt=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return C908880Zl8.LIZIZ(this.LL, this.LLILLJJLI, this.LLILZ.LIZ, this.LLILLL.LIZ);
    }

    @Override // X.InterfaceC901690ZYx
    public final Function1<C908560Zkc, Unit> LJIILJJIL() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC908890Zl9
    public final C908840Zl4 LJLI() {
        return this.LLILLL;
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

    @Override // X.InterfaceC908890Zl9
    public final C908850Zl5 getTitle() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C908830Zl3)) {
            return false;
        }
        C908830Zl3 c908830Zl3 = (C908830Zl3) interfaceC1891350zJl;
        if (!Intrinsics.LJFF(this.LLILZ.LIZ, c908830Zl3.LLILZ.LIZ) || !Intrinsics.LJFF(this.LLILLL.LIZ, c908830Zl3.LLILLL.LIZ)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C908830Zl3)) {
            return false;
        }
        return Intrinsics.LJFF(this.LL, ((C908830Zl3) interfaceC1891350zJl).LL);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C908830Zl3)) {
            return false;
        }
        InterfaceC1891350zJl interfaceC1891350zJl = (InterfaceC1891350zJl) obj;
        if (!areItemTheSame(interfaceC1891350zJl) || !areContentsTheSame(interfaceC1891350zJl)) {
            return false;
        }
        return true;
    }

    public C908830Zl3(String str, String str2, C908840Zl4 c908840Zl4, C908850Zl5 c908850Zl5, InterfaceC908930ZlD interfaceC908930ZlD, AwS211S0300000_2 awS211S0300000_2, Map map) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = c908840Zl4;
        this.LLILZ = c908850Zl5;
        this.LLILZIL = interfaceC908930ZlD;
        this.LLILZLL = awS211S0300000_2;
        this.LLIZ = null;
        this.LLIZLLLIL = map;
    }
}
