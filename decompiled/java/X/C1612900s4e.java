package X;

import com.ss.android.ugc.aweme.model.PaidCollectionEpisode;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0s4e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1612900s4e implements InterfaceC1891350zJl {
    public final PaidCollectionEpisode LL;
    public final String LLILLJJLI;
    public final boolean LLILLL;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PaidContentSquareVideoPowerItem(episode=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", creatorUid=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", isPlaying=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return this.LL.num + C786410Ut5.Z2(this.LLILLL) + this.LL.seqId;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C1612900s4e) {
            C1612900s4e c1612900s4e = (C1612900s4e) interfaceC1891350zJl;
            PaidCollectionEpisode paidCollectionEpisode = c1612900s4e.LL;
            int i = paidCollectionEpisode.num;
            PaidCollectionEpisode paidCollectionEpisode2 = this.LL;
            if (i == paidCollectionEpisode2.num && c1612900s4e.LLILLL == this.LLILLL && paidCollectionEpisode.seqId == paidCollectionEpisode2.seqId) {
                return true;
            }
            return false;
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C1612900s4e) {
            PaidCollectionEpisode paidCollectionEpisode = ((C1612900s4e) interfaceC1891350zJl).LL;
            int i = paidCollectionEpisode.num;
            PaidCollectionEpisode paidCollectionEpisode2 = this.LL;
            if (i == paidCollectionEpisode2.num && paidCollectionEpisode.seqId == paidCollectionEpisode2.seqId) {
                return true;
            }
            return false;
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1612900s4e) {
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
        if (interfaceC1891350zJl instanceof C1612900s4e) {
            return new Object() { // from class: X.0s78
            };
        }
        return null;
    }

    public C1612900s4e(PaidCollectionEpisode paidCollectionEpisode, String str, boolean z) {
        this.LL = paidCollectionEpisode;
        this.LLILLJJLI = str;
        this.LLILLL = z;
    }
}
