package X;

import com.ss.android.ugc.aweme.im.message.content.SystemContent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06XO, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06XO implements InterfaceC1891350zJl {
    public final C06XP LL;
    public final C1622006Ws<SystemContent> LLILLJJLI;
    public final C1622306Wv LLILLL;
    public final float LLILZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C06XO)) {
            return false;
        }
        C06XO c06xo = (C06XO) obj;
        return Intrinsics.LJFF(this.LL, c06xo.LL) && Intrinsics.LJFF(this.LLILLJJLI, c06xo.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c06xo.LLILLL) && Float.compare(this.LLILZ, c06xo.LLILZ) == 0;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SystemNoticePowerItem(message=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", content=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", customUI=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", bottomMarginInDp=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        C1622006Ws<SystemContent> c1622006Ws = this.LLILLJJLI;
        if (c1622006Ws != null) {
            c1622006Ws.getClass();
        }
        int i = iHashCode * 31;
        C1622306Wv c1622306Wv = this.LLILLL;
        return ((i + (c1622306Wv != null ? c1622306Wv.hashCode() : 0)) * 31) + Float.floatToIntBits(this.LLILZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        C06XO c06xo;
        SystemContent systemContent;
        SystemContent.Key[] template;
        if (interfaceC1891350zJl instanceof C06XO) {
            c06xo = (C06XO) interfaceC1891350zJl;
        } else {
            c06xo = null;
        }
        if (c06xo == null || !Intrinsics.LJFF(this.LLILLL, c06xo.LLILLL) || this.LLILZ != c06xo.LLILZ) {
            return false;
        }
        C1622006Ws<SystemContent> c1622006Ws = this.LLILLJJLI;
        if (c1622006Ws != null && (systemContent = c1622006Ws.LIZ) != null && (template = systemContent.getTemplate()) != null) {
            for (SystemContent.Key key : template) {
                if (key.getActionDismissConditions() != null) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        C06XO c06xo;
        C06XP c06xp = this.LL;
        C06XP c06xp2 = null;
        if ((interfaceC1891350zJl instanceof C06XO) && (c06xo = (C06XO) interfaceC1891350zJl) != null) {
            c06xp2 = c06xo.LL;
        }
        return Intrinsics.LJFF(c06xp, c06xp2);
    }

    public C06XO(C06XP c06xp, C1622006Ws<SystemContent> c1622006Ws, C1622306Wv c1622306Wv, float f) {
        this.LL = c06xp;
        this.LLILLJJLI = c1622006Ws;
        this.LLILLL = c1622306Wv;
        this.LLILZ = f;
    }
}
