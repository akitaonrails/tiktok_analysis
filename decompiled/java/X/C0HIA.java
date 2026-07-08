package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HIA, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HIA implements InterfaceC1891350zJl {
    public final Aweme LL;
    public final boolean LLILLJJLI;
    public final boolean LLILLL;
    public final Function1<Aweme, Unit> LLILZ;
    public final String LLILZIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0HIA)) {
            return false;
        }
        C0HIA c0hia = (C0HIA) obj;
        return Intrinsics.LJFF(this.LL, c0hia.LL) && this.LLILLJJLI == c0hia.LLILLJJLI && this.LLILLL == c0hia.LLILLL && Intrinsics.LJFF(this.LLILZ, c0hia.LLILZ);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LL.hashCode() * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31;
        Function1<Aweme, Unit> function1 = this.LLILZ;
        return iHashCode + (function1 == null ? 0 : function1.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BotSharePostAwemeItem(aweme=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", selected=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", showMaxCapMask=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", onClick=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C0HIA) {
            C0HIA c0hia = (C0HIA) interfaceC1891350zJl;
            if (Intrinsics.LJFF(c0hia.LLILZIL, this.LLILZIL) && c0hia.LLILLJJLI == this.LLILLJJLI && c0hia.LLILLL == this.LLILLL) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if ((interfaceC1891350zJl instanceof C0HIA) && Intrinsics.LJFF(((C0HIA) interfaceC1891350zJl).LLILZIL, this.LLILZIL)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C0HIA) {
            C0HIA c0hia = (C0HIA) interfaceC1891350zJl;
            if (Intrinsics.LJFF(c0hia.LLILZIL, this.LLILZIL)) {
                if (c0hia.LLILLJJLI != this.LLILLJJLI || c0hia.LLILLL != this.LLILLL) {
                    return "payload_selection";
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public C0HIA(Aweme aweme, boolean z, boolean z2, C0ZEJ c0zej) {
        this.LL = aweme;
        this.LLILLJJLI = z;
        this.LLILLL = z2;
        this.LLILZ = c0zej;
        String aid = aweme.getAid();
        this.LLILZIL = aid == null ? "" : aid;
    }
}
