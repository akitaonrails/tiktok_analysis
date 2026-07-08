package X;

import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lRs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C1358220lRs implements InterfaceC1891350zJl {
    public final String LL;
    public final UpvoteStruct LLILLJJLI;
    public final C1358240lRu LLILLL;
    public final C1358260lRw LLILZ;

    public boolean LIZ(C1358220lRs c1358220lRs) {
        return Intrinsics.LJFF(this.LL, c1358220lRs.LL);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C1358220lRs)) {
            return false;
        }
        C1358220lRs c1358220lRs = (C1358220lRs) interfaceC1891350zJl;
        if (!LIZ(c1358220lRs)) {
            return false;
        }
        C1358240lRu c1358240lRu = this.LLILLL;
        boolean z = c1358240lRu.LIZJ;
        C1358240lRu c1358240lRu2 = c1358220lRs.LLILLL;
        if (z != c1358240lRu2.LIZJ || c1358240lRu.LIZLLL != c1358240lRu2.LIZLLL || !Intrinsics.LJFF(c1358240lRu.LJ, c1358240lRu2.LJ)) {
            return false;
        }
        C1358240lRu c1358240lRu3 = this.LLILLL;
        long j = c1358240lRu3.LJI;
        C1358240lRu c1358240lRu4 = c1358220lRs.LLILLL;
        if (j != c1358240lRu4.LJI || c1358240lRu3.LJII != c1358240lRu4.LJII) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1891350zJl
    public boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        String uid;
        boolean z;
        String uid2 = null;
        if (!(interfaceC1891350zJl instanceof C1358220lRs)) {
            return null;
        }
        C1358220lRs c1358220lRs = (C1358220lRs) interfaceC1891350zJl;
        boolean z2 = true;
        boolean z3 = !Intrinsics.LJFF(this.LLILLL.LJ, c1358220lRs.LLILLL.LJ);
        User user = this.LLILLL.LIZ;
        if (user != null) {
            uid = user.getUid();
        } else {
            uid = null;
        }
        User user2 = c1358220lRs.LLILLL.LIZ;
        if (user2 != null) {
            uid2 = user2.getUid();
        }
        Intrinsics.LJFF(uid, uid2);
        Intrinsics.LJFF(this.LLILLL.LJFF, c1358220lRs.LLILLL.LJFF);
        C1358240lRu c1358240lRu = this.LLILLL;
        long j = c1358240lRu.LJI;
        C1358240lRu c1358240lRu2 = c1358220lRs.LLILLL;
        if (j != c1358240lRu2.LJI) {
            z = true;
        } else {
            z = false;
        }
        if (c1358240lRu.LJII == c1358240lRu2.LJII) {
            z2 = false;
        }
        return new C1358250lRv(z3, z, z2);
    }

    public C1358220lRs(String str, UpvoteStruct upvoteStruct, C1358240lRu c1358240lRu) {
        C1358260lRw c1358260lRw = new C1358260lRw();
        this.LL = str;
        this.LLILLJJLI = upvoteStruct;
        this.LLILLL = c1358240lRu;
        this.LLILZ = c1358260lRw;
    }
}
