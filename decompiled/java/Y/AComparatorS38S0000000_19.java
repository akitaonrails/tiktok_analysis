package Y;

import X.C1226100i0m;
import X.C1240110iNN;
import X.C1240120iNO;
import X.C1240520iO2;
import X.C1240530iO3;
import X.C1240550iO5;
import X.C20085613iQ;
import X.InterfaceC1240540iO4;
import X.InterfaceC1248530iax;
import com.ss.android.ugc.aweme.im.common.model.BaseContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.profile.business.ur.school.findschoolfriends.FindSchoolFriendsTabProtocol;
import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public class AComparatorS38S0000000_19 implements Comparator {
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
            default:
                return 0;
        }
    }

    public AComparatorS38S0000000_19(int i) {
        this.$t = i;
    }

    public static final int compare$0(AComparatorS38S0000000_19 aComparatorS38S0000000_19, Object obj, Object obj2) {
        long j;
        InterfaceC1240540iO4 interfaceC1240540iO4 = ((C1240530iO3) obj2).LL;
        long j2 = 0;
        if (interfaceC1240540iO4 instanceof C1240120iNO) {
            j = ((C1240120iNO) interfaceC1240540iO4).LJIIJJI;
        } else if (interfaceC1240540iO4 instanceof C1240110iNN) {
            j = ((C1240110iNN) interfaceC1240540iO4).LJIIJJI;
        } else {
            j = 0;
        }
        Long lValueOf = Long.valueOf(j);
        InterfaceC1240540iO4 interfaceC1240540iO42 = ((C1240530iO3) obj).LL;
        if (interfaceC1240540iO42 instanceof C1240120iNO) {
            j2 = ((C1240120iNO) interfaceC1240540iO42).LJIIJJI;
        } else if (interfaceC1240540iO42 instanceof C1240110iNN) {
            j2 = ((C1240110iNN) interfaceC1240540iO42).LJIIJJI;
        }
        return C20085613iQ.LIZIZ(lValueOf, Long.valueOf(j2));
    }

    public static final int compare$1(AComparatorS38S0000000_19 aComparatorS38S0000000_19, Object obj, Object obj2) {
        C1240530iO3 c1240530iO3 = (C1240530iO3) obj2;
        C1240520iO2 c1240520iO2 = ((C1240530iO3) obj).LLILLJJLI;
        if (c1240520iO2 == null) {
            return 1;
        }
        C1240520iO2 c1240520iO22 = c1240530iO3.LLILLJJLI;
        if (c1240520iO22 != null) {
            int iLIZ = c1240520iO2.LIZ;
            int iLIZ2 = c1240520iO22.LIZ;
            if (iLIZ == iLIZ2) {
                int i = c1240520iO2.LIZIZ;
                if (i != 0 && i != 2 && i != 5) {
                    iLIZ = 1;
                } else {
                    iLIZ = 0;
                }
                int i2 = c1240520iO22.LIZIZ;
                if (i2 != 0 && i2 != 2 && i2 != 5) {
                    iLIZ2 = 1;
                } else {
                    iLIZ2 = 0;
                }
                if (iLIZ == iLIZ2) {
                    iLIZ = C1240550iO5.LIZ(c1240520iO2.LIZLLL, c1240520iO2.LIZJ, c1240520iO2.LJ);
                    iLIZ2 = C1240550iO5.LIZ(c1240520iO22.LIZLLL, c1240520iO22.LIZJ, c1240520iO22.LJ);
                    if (iLIZ == iLIZ2) {
                        long j = c1240520iO2.LJFF;
                        long j2 = c1240520iO22.LJFF;
                        if (j <= j2) {
                            if (j < j2) {
                                return 1;
                            }
                            return 0;
                        }
                        return -1;
                    }
                }
            }
            return iLIZ - iLIZ2;
        }
        return -1;
    }

    public static final int compare$2(AComparatorS38S0000000_19 aComparatorS38S0000000_19, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(((FindSchoolFriendsTabProtocol) obj).LIZLLL(), ((FindSchoolFriendsTabProtocol) obj2).LIZLLL());
    }

    public static final int compare$3(AComparatorS38S0000000_19 aComparatorS38S0000000_19, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((InterfaceC1248530iax) obj).a()), Integer.valueOf(((InterfaceC1248530iax) obj2).a()));
    }

    public static final int compare$4(AComparatorS38S0000000_19 aComparatorS38S0000000_19, Object obj, Object obj2) {
        String uid = ((BaseContact) obj).getUid();
        String str = "";
        if (uid == null) {
            uid = "";
        }
        Boolean boolValueOf = Boolean.valueOf(!C1226100i0m.LIZIZ(uid));
        String uid2 = ((BaseContact) obj2).getUid();
        if (uid2 != null) {
            str = uid2;
        }
        return C20085613iQ.LIZIZ(boolValueOf, Boolean.valueOf(!C1226100i0m.LIZIZ(str)));
    }

    public static final int compare$5(AComparatorS38S0000000_19 aComparatorS38S0000000_19, Object obj, Object obj2) {
        boolean zLJFF;
        MatchedFriendStruct matchedFriendStruct = ((User) obj).getMatchedFriendStruct();
        boolean zLJFF2 = false;
        if (matchedFriendStruct != null) {
            zLJFF = Intrinsics.LJFF(matchedFriendStruct.isNewMaF(), Boolean.TRUE);
        } else {
            zLJFF = false;
        }
        Boolean boolValueOf = Boolean.valueOf(!zLJFF);
        MatchedFriendStruct matchedFriendStruct2 = ((User) obj2).getMatchedFriendStruct();
        if (matchedFriendStruct2 != null) {
            zLJFF2 = Intrinsics.LJFF(matchedFriendStruct2.isNewMaF(), Boolean.TRUE);
        }
        return C20085613iQ.LIZIZ(boolValueOf, Boolean.valueOf(!zLJFF2));
    }

    public static final int compare$6(AComparatorS38S0000000_19 aComparatorS38S0000000_19, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((IMUser) obj2).getFollowStatus()), Integer.valueOf(((IMUser) obj).getFollowStatus()));
    }
}
