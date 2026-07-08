package X;

import com.ss.android.ugc.aweme.setting.serverpush.model.PushOffReasonsData;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.14ch, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20304914ch implements InterfaceC0148002o {
    public final List<C20696015yg> LL;
    public final AbstractC1623806Xk<Boolean> LLILLJJLI;
    public final C291001Au<Integer> LLILLL;
    public final EnumC1244190iTx LLILZ;
    public final EnumC2007407tg LLILZIL;
    public final C20305614co LLILZLL;
    public final C291001Au<Unit> LLIZ;
    public final Pair<String, PushOffReasonsData> LLIZLLLIL;

    public C20304914ch() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20304914ch)) {
            return false;
        }
        C20304914ch c20304914ch = (C20304914ch) obj;
        return Intrinsics.LJFF(this.LL, c20304914ch.LL) && Intrinsics.LJFF(this.LLILLJJLI, c20304914ch.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c20304914ch.LLILLL) && this.LLILZ == c20304914ch.LLILZ && this.LLILZIL == c20304914ch.LLILZIL && Intrinsics.LJFF(this.LLILZLL, c20304914ch.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c20304914ch.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c20304914ch.LLIZLLLIL);
    }

    public final int hashCode() {
        int iHashCode = ((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31;
        C291001Au<Integer> c291001Au = this.LLILLL;
        int iHashCode2 = (iHashCode + (c291001Au == null ? 0 : c291001Au.hashCode())) * 31;
        EnumC1244190iTx enumC1244190iTx = this.LLILZ;
        int iHashCode3 = (iHashCode2 + (enumC1244190iTx == null ? 0 : enumC1244190iTx.hashCode())) * 31;
        EnumC2007407tg enumC2007407tg = this.LLILZIL;
        int iHashCode4 = (iHashCode3 + (enumC2007407tg == null ? 0 : enumC2007407tg.hashCode())) * 31;
        C20305614co c20305614co = this.LLILZLL;
        int iHashCode5 = (iHashCode4 + (c20305614co == null ? 0 : c20305614co.hashCode())) * 31;
        C291001Au<Unit> c291001Au2 = this.LLIZ;
        int iHashCode6 = (iHashCode5 + (c291001Au2 == null ? 0 : c291001Au2.hashCode())) * 31;
        Pair<String, PushOffReasonsData> pair = this.LLIZLLLIL;
        return iHashCode6 + (pair != null ? pair.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PushSettingsLoginState(dynamicUISettings=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", loadingState=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", toastString=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", emailCheckerState=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", smsCheckerState=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", bottomRadiosChangeState=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", voiceCallRadioRequestFinished=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", pushOffReasonsData=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C20304914ch(int i) {
        this(C13BV.INSTANCE, C491101vh.LIZ, null, null, null, null, null, null);
    }

    public C20304914ch(List<C20696015yg> list, AbstractC1623806Xk<Boolean> abstractC1623806Xk, C291001Au<Integer> c291001Au, EnumC1244190iTx enumC1244190iTx, EnumC2007407tg enumC2007407tg, C20305614co c20305614co, C291001Au<Unit> c291001Au2, Pair<String, PushOffReasonsData> pair) {
        this.LL = list;
        this.LLILLJJLI = abstractC1623806Xk;
        this.LLILLL = c291001Au;
        this.LLILZ = enumC1244190iTx;
        this.LLILZIL = enumC2007407tg;
        this.LLILZLL = c20305614co;
        this.LLIZ = c291001Au2;
        this.LLIZLLLIL = pair;
    }

    public static C20304914ch LIZ(C20304914ch c20304914ch, List list, AbstractC1623806Xk abstractC1623806Xk, C291001Au c291001Au, EnumC1244190iTx enumC1244190iTx, EnumC2007407tg enumC2007407tg, C20305614co c20305614co, C291001Au c291001Au2, Pair pair, int i) {
        Pair pair2 = pair;
        C291001Au c291001Au3 = c291001Au2;
        C20305614co c20305614co2 = c20305614co;
        EnumC2007407tg enumC2007407tg2 = enumC2007407tg;
        EnumC1244190iTx enumC1244190iTx2 = enumC1244190iTx;
        C291001Au c291001Au4 = c291001Au;
        AbstractC1623806Xk abstractC1623806Xk2 = abstractC1623806Xk;
        List list2 = list;
        if ((i & 1) != 0) {
            list2 = c20304914ch.LL;
        }
        if ((i & 2) != 0) {
            abstractC1623806Xk2 = c20304914ch.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c291001Au4 = c20304914ch.LLILLL;
        }
        if ((i & 8) != 0) {
            enumC1244190iTx2 = c20304914ch.LLILZ;
        }
        if ((i & 16) != 0) {
            enumC2007407tg2 = c20304914ch.LLILZIL;
        }
        if ((i & 32) != 0) {
            c20305614co2 = c20304914ch.LLILZLL;
        }
        if ((i & 64) != 0) {
            c291001Au3 = c20304914ch.LLIZ;
        }
        if ((i & 128) != 0) {
            pair2 = c20304914ch.LLIZLLLIL;
        }
        c20304914ch.getClass();
        return new C20304914ch(list2, abstractC1623806Xk2, c291001Au4, enumC1244190iTx2, enumC2007407tg2, c20305614co2, c291001Au3, pair2);
    }
}
