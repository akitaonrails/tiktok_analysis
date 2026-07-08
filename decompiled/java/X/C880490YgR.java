package X;

import com.ss.android.ugc.aweme.inbox.filter.FilterTabType;
import java.util.Collections;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0YgR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C880490YgR implements InterfaceC879750YfF {
    public static final Set<EnumC880480YgQ> LLILLL;
    public static final Set<FilterTabType> LLILZ;
    public static final Set<EnumC880480YgQ> LLILZIL;
    public static final Set<FilterTabType> LLILZLL;
    public static final Set<EnumC880480YgQ> LLIZ;
    public final FilterTabType LL;
    public final Set<EnumC880480YgQ> LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C880490YgR)) {
            return false;
        }
        C880490YgR c880490YgR = (C880490YgR) obj;
        return this.LL == c880490YgR.LL && Intrinsics.LJFF(this.LLILLJJLI, c880490YgR.LLILLJJLI);
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ConversationFilterArgsIdentifier(tabType=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", filterOptions=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    static {
        new C880370YgF();
        EnumC880480YgQ enumC880480YgQ = EnumC880480YgQ.BUSINESS;
        EnumC880480YgQ enumC880480YgQ2 = EnumC880480YgQ.HIGH_LEVEL_MEMBER;
        EnumC880480YgQ enumC880480YgQ3 = EnumC880480YgQ.LONG_TIME_FOLLOWER;
        EnumC880480YgQ enumC880480YgQ4 = EnumC880480YgQ.WITH_MUTUAL_FRIEND;
        EnumC880480YgQ enumC880480YgQ5 = EnumC880480YgQ.BUYER;
        LLILLL = C13LQ.LJLIIL(new EnumC880480YgQ[]{EnumC880480YgQ.FOLLOWING, enumC880480YgQ, EnumC880480YgQ.CREATOR, EnumC880480YgQ.SUBSCRIBER, enumC880480YgQ2, enumC880480YgQ3, EnumC880480YgQ.ONE_WAY_FOLLOWER, enumC880480YgQ4, enumC880480YgQ5});
        LLILZ = C13LQ.LJLIIL(new FilterTabType[]{FilterTabType.FOLLOWING, FilterTabType.BUSINESS, FilterTabType.CREATOR, FilterTabType.SUBSCRIBER, FilterTabType.HIGH_LEVEL_MEMBER, FilterTabType.LONG_TIME_FOLLOWER, FilterTabType.ONE_WAY_FOLLOWER, FilterTabType.WITH_MUTUAL_FRIEND, FilterTabType.BUYER});
        LLILZIL = C13LQ.LJLIIL(new EnumC880480YgQ[]{enumC880480YgQ, enumC880480YgQ3, enumC880480YgQ2, enumC880480YgQ4, enumC880480YgQ5});
        LLILZLL = Collections.singleton(FilterTabType.UNREAD);
        LLIZ = Collections.singleton(EnumC880480YgQ.UNREAD);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C880490YgR(FilterTabType filterTabType, Set<? extends EnumC880480YgQ> set) {
        this.LL = filterTabType;
        this.LLILLJJLI = set;
    }
}
