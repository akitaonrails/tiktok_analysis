package X;

import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0SQA, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SQA extends C0SQC {
    public final User LL;
    public final C0SPY LLILLJJLI;
    public final Set<String> LLILLL;

    @Override // X.C0SQC, X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C0SQA) {
            return Intrinsics.LJFF(((C0SQA) interfaceC1891350zJl).LL.getUid(), this.LL.getUid());
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return interfaceC1891350zJl instanceof C0SQA;
    }

    public C0SQA(User user, C0SPY c0spy, Set<String> set) {
        this.LL = user;
        this.LLILLJJLI = c0spy;
        this.LLILLL = set;
    }
}
