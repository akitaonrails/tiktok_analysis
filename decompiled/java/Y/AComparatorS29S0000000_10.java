package Y;

import X.C1261050iv9;
import X.C161300jb;
import X.C20085613iQ;
import X.C678630Qjd;
import X.InterfaceC211600ri;
import X.InterfaceC648270Pbl;
import com.ss.android.ugc.aweme.inbox.search.data.items.InboxSearchRecentStoreItem;
import com.ss.android.ugc.aweme.search.arch.v2.docker.components.querycorrect.Position;
import java.util.Comparator;

/* JADX INFO: loaded from: classes11.dex */
public class AComparatorS29S0000000_10 implements Comparator {
    public final int $t;

    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        switch (this.$t) {
            case 0:
                return compare$0(this, t, t2);
            case 1:
                return compare$1(this, t, t2);
            case 2:
                return compare$2(this, t, t2);
            case 3:
                return compare$3(this, t, t2);
            case 4:
                return compare$4(this, t, t2);
            case 5:
                return compare$5(this, t, t2);
            case 6:
                return compare$6(this, t, t2);
            case 7:
                return compare$7(this, t, t2);
            default:
                return 0;
        }
    }

    public AComparatorS29S0000000_10(int i) {
        this.$t = i;
    }

    public static final int compare$0(AComparatorS29S0000000_10 aComparatorS29S0000000_10, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((Position) obj).begin), Integer.valueOf(((Position) obj2).begin));
    }

    public static final int compare$1(AComparatorS29S0000000_10 aComparatorS29S0000000_10, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((InboxSearchRecentStoreItem) obj2).searchTime), Long.valueOf(((InboxSearchRecentStoreItem) obj).searchTime));
    }

    public static final int compare$2(AComparatorS29S0000000_10 aComparatorS29S0000000_10, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(obj.getClass().getName(), obj2.getClass().getName());
    }

    public static final int compare$3(AComparatorS29S0000000_10 aComparatorS29S0000000_10, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((Position) obj).begin), Integer.valueOf(((Position) obj2).begin));
    }

    public static final int compare$4(AComparatorS29S0000000_10 aComparatorS29S0000000_10, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((C1261050iv9) obj2).LL.getFollowerStatus()), Integer.valueOf(((C1261050iv9) obj).LL.getFollowerStatus()));
    }

    public static final int compare$5(AComparatorS29S0000000_10 aComparatorS29S0000000_10, Object obj, Object obj2) {
        Integer numValueOf;
        InterfaceC211600ri interfaceC211600ri;
        InterfaceC211600ri interfaceC211600ri2;
        InterfaceC648270Pbl interfaceC648270Pbl = (InterfaceC648270Pbl) obj;
        Integer numValueOf2 = null;
        if ((interfaceC648270Pbl instanceof InterfaceC211600ri) && (interfaceC211600ri2 = (InterfaceC211600ri) interfaceC648270Pbl) != null) {
            numValueOf = Integer.valueOf(C161300jb.LIZIZ(interfaceC211600ri2));
        } else {
            numValueOf = null;
        }
        InterfaceC648270Pbl interfaceC648270Pbl2 = (InterfaceC648270Pbl) obj2;
        if ((interfaceC648270Pbl2 instanceof InterfaceC211600ri) && (interfaceC211600ri = (InterfaceC211600ri) interfaceC648270Pbl2) != null) {
            numValueOf2 = Integer.valueOf(C161300jb.LIZIZ(interfaceC211600ri));
        }
        return C20085613iQ.LIZIZ(numValueOf, numValueOf2);
    }

    public static final int compare$6(AComparatorS29S0000000_10 aComparatorS29S0000000_10, Object obj, Object obj2) {
        Integer numValueOf;
        InterfaceC211600ri interfaceC211600ri;
        InterfaceC211600ri interfaceC211600ri2;
        InterfaceC648270Pbl interfaceC648270Pbl = (InterfaceC648270Pbl) obj;
        Integer numValueOf2 = null;
        if ((interfaceC648270Pbl instanceof InterfaceC211600ri) && (interfaceC211600ri2 = (InterfaceC211600ri) interfaceC648270Pbl) != null) {
            numValueOf = Integer.valueOf(C161300jb.LIZIZ(interfaceC211600ri2));
        } else {
            numValueOf = null;
        }
        InterfaceC648270Pbl interfaceC648270Pbl2 = (InterfaceC648270Pbl) obj2;
        if ((interfaceC648270Pbl2 instanceof InterfaceC211600ri) && (interfaceC211600ri = (InterfaceC211600ri) interfaceC648270Pbl2) != null) {
            numValueOf2 = Integer.valueOf(C161300jb.LIZIZ(interfaceC211600ri));
        }
        return C20085613iQ.LIZIZ(numValueOf, numValueOf2);
    }

    public static final int compare$7(AComparatorS29S0000000_10 aComparatorS29S0000000_10, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((C678630Qjd) obj).LIZJ), Integer.valueOf(((C678630Qjd) obj2).LIZJ));
    }
}
