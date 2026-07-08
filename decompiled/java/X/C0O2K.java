package X;

import com.ss.android.ugc.aweme.addyours.model.AddYoursTopic;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0O2K, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0O2K implements InterfaceC1891350zJl {
    public final int LL;
    public final AddYoursTopic LLILLJJLI;
    public final boolean LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0O2K)) {
            return false;
        }
        C0O2K c0o2k = (C0O2K) obj;
        return this.LL == c0o2k.LL && Intrinsics.LJFF(this.LLILLJJLI, c0o2k.LLILLJJLI) && this.LLILLL == c0o2k.LLILLL;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return (((this.LL * 31) + this.LLILLJJLI.hashCode()) * 31) + C786410Ut5.Z2(this.LLILLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AddYoursHubItem(hubSubType=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", addYoursTopic=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", isMe=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        String aid;
        if (interfaceC1891350zJl instanceof C0O2K) {
            C0O2K c0o2k = (C0O2K) interfaceC1891350zJl;
            if (Intrinsics.LJFF(this.LLILLJJLI.getTopicId(), c0o2k.LLILLJJLI.getTopicId())) {
                Aweme video = this.LLILLJJLI.getVideo();
                String aid2 = null;
                if (video != null) {
                    aid = video.getAid();
                } else {
                    aid = null;
                }
                Aweme video2 = c0o2k.LLILLJJLI.getVideo();
                if (video2 != null) {
                    aid2 = video2.getAid();
                }
                if (Intrinsics.LJFF(aid, aid2)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public C0O2K(int i, AddYoursTopic addYoursTopic, boolean z) {
        this.LL = i;
        this.LLILLJJLI = addYoursTopic;
        this.LLILLL = z;
    }
}
