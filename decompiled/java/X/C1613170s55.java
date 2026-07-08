package X;

import com.ss.android.ugc.aweme.model.PaidCollectionEpisode;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0s55, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1613170s55 implements InterfaceC1891350zJl {
    public final List<PaidCollectionEpisode> LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final int LLILZ;
    public final String LLILZIL;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PaidContentPanelListItem(panelList=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", creatorUid=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", currentPlayingAid=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", shortCutNum=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", lastDramaAid=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        int iHashCode = this.LLILLL.hashCode();
        String str = this.LLILZIL;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C1613170s55) {
            C1613170s55 c1613170s55 = (C1613170s55) interfaceC1891350zJl;
            if (Intrinsics.LJFF(this.LLILLL, c1613170s55.LLILLL) && Intrinsics.LJFF(this.LLILZIL, c1613170s55.LLILZIL)) {
                return true;
            }
            return false;
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C1613170s55) {
            return true;
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1613170s55) {
            InterfaceC1891350zJl interfaceC1891350zJl = (InterfaceC1891350zJl) obj;
            if (areItemTheSame(interfaceC1891350zJl) && areContentsTheSame(interfaceC1891350zJl)) {
                return true;
            }
            return false;
        }
        return super.equals(obj);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        boolean z;
        if (interfaceC1891350zJl instanceof C1613170s55) {
            C1613170s55 c1613170s55 = (C1613170s55) interfaceC1891350zJl;
            if (Intrinsics.LJFF(this.LLILLL, c1613170s55.LLILLL) && Intrinsics.LJFF(this.LLILZIL, c1613170s55.LLILZIL)) {
                z = false;
            } else {
                z = true;
            }
            return new C1614430s77(z);
        }
        return null;
    }

    public C1613170s55(int i, String str, String str2, String str3, List list) {
        this.LL = list;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = i;
        this.LLILZIL = str3;
    }
}
