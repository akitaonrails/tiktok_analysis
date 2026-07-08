package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0YgV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C880530YgV implements InterfaceC879790YfJ {
    public static final Set<EnumC880570YgZ> LIZ;
    public static final Set<EnumC880520YgU> LIZIZ;
    public static final Set<EnumC880570YgZ> LIZJ;
    public static final Set<EnumC880520YgU> LIZLLL;
    public static final Set<EnumC880570YgZ> LJ;

    static {
        new C880380YgG();
        LIZ = C13LQ.LJLIIL(new EnumC880570YgZ[]{EnumC880570YgZ.ALL_BUSINESS, EnumC880570YgZ.ALL_FOLLOWER, EnumC880570YgZ.ALL_CREATORS, EnumC880570YgZ.ALL_OTHER});
        EnumC880520YgU enumC880520YgU = EnumC880520YgU.BUSINESS;
        EnumC880520YgU enumC880520YgU2 = EnumC880520YgU.SUBSCRIBER;
        EnumC880520YgU enumC880520YgU3 = EnumC880520YgU.HIGH_LEVEL_MEMBER;
        EnumC880520YgU enumC880520YgU4 = EnumC880520YgU.LONG_TIME_FOLLOWER;
        EnumC880520YgU enumC880520YgU5 = EnumC880520YgU.WITH_MUTUAL_FRIEND;
        EnumC880520YgU enumC880520YgU6 = EnumC880520YgU.NEW_FOLLOWER;
        LIZIZ = C13LQ.LJLIIL(new EnumC880520YgU[]{enumC880520YgU, EnumC880520YgU.CREATOR, enumC880520YgU2, enumC880520YgU3, enumC880520YgU4, EnumC880520YgU.ONE_WAY_FOLLOWER, enumC880520YgU5, enumC880520YgU6});
        EnumC880570YgZ enumC880570YgZ = EnumC880570YgZ.BUSINESS_SHOP_SELLERS;
        EnumC880570YgZ enumC880570YgZ2 = EnumC880570YgZ.BUSINESS_CREATOR_NETWORKS;
        EnumC880570YgZ enumC880570YgZ3 = EnumC880570YgZ.FOLLOWER_SUBSCRIBER;
        EnumC880570YgZ enumC880570YgZ4 = EnumC880570YgZ.FOLLOWER_HIGH_LEVEL_MEMBER;
        EnumC880570YgZ enumC880570YgZ5 = EnumC880570YgZ.FOLLOWER_LONG_TIME_FOLLOWER;
        EnumC880570YgZ enumC880570YgZ6 = EnumC880570YgZ.OTHER_VERIFIED_ACCOUNT;
        LIZJ = C13LQ.LJLIIL(new EnumC880570YgZ[]{enumC880570YgZ, enumC880570YgZ2, enumC880570YgZ3, enumC880570YgZ4, enumC880570YgZ5, EnumC880570YgZ.CREATORS_WITH_FOLLOWERS_RANGE_10K_50K, EnumC880570YgZ.CREATORS_WITH_FOLLOWERS_RANGE_50K_100K, EnumC880570YgZ.CREATORS_WITH_FOLLOWERS_RANGE_100K_1M, EnumC880570YgZ.CREATORS_WITH_FOLLOWERS_MORE_THAN_1M, enumC880570YgZ6});
        LIZLLL = C13LQ.LJLIIL(new EnumC880520YgU[]{enumC880520YgU, enumC880520YgU2, enumC880520YgU3, enumC880520YgU4, enumC880520YgU5, enumC880520YgU6});
        LJ = C13LQ.LJLIIL(new EnumC880570YgZ[]{enumC880570YgZ, enumC880570YgZ2, enumC880570YgZ3, enumC880570YgZ4, enumC880570YgZ5, enumC880570YgZ6});
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC879790YfJ
    public final C880700Ygm LIZ(Collection<? extends C879540Yeu<?>> collection, InterfaceC879770YfH interfaceC879770YfH, String str) {
        C0Y8T c0y8t;
        Object obj;
        if (!(interfaceC879770YfH instanceof C879740YfE)) {
            return new C880700Ygm(collection, C13BV.INSTANCE);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : collection) {
            C879540Yeu c879540Yeu = (C879540Yeu) obj2;
            if (C13LP.LJJJJ(c879540Yeu.LIZ, C1697810uHb.LJIIJJI(C1709506mj.INSTANCE, C878900Yds.INSTANCE))) {
                T t = c879540Yeu.LIZJ;
                IMUser iMUser = null;
                if (t instanceof C0Y8T) {
                    c0y8t = (C0Y8T) t;
                } else {
                    c0y8t = null;
                }
                C1490405sU<?> c1490405sU = c879540Yeu.LIZLLL.get(C1718806oE.LIZ);
                if (c1490405sU != null) {
                    obj = c1490405sU.LIZIZ;
                } else {
                    obj = null;
                }
                if (obj instanceof IMUser) {
                    iMUser = (IMUser) obj;
                }
                if (C880380YgG.LIZ(((C879740YfE) interfaceC879770YfH).LIZIZ, c0y8t, iMUser, 8)) {
                    arrayList.add(obj2);
                }
            }
            arrayList2.add(obj2);
        }
        Pair pair = new Pair(arrayList, arrayList2);
        return new C880700Ygm((Collection) pair.getFirst(), (Collection) pair.getSecond());
    }
}
