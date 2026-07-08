package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0iyS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1263100iyS {
    public static final <T> List<T> LIZ(AbstractC1264080j02<T> abstractC1264080j02) {
        if (abstractC1264080j02 instanceof C1265700j2e) {
            return ((C1265700j2e) abstractC1264080j02).LIZLLL;
        }
        if (abstractC1264080j02 instanceof C1264120j06) {
            return ((C1264120j06) abstractC1264080j02).LIZIZ;
        }
        if ((abstractC1264080j02 instanceof C1264100j04) || (abstractC1264080j02 instanceof C1264110j05)) {
            return null;
        }
        throw new C1954807lC();
    }

    public static final List<C1261860iwS> LIZIZ(List<? extends InterfaceC1262230ix3> list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : (ArrayList) list) {
            InterfaceC1262230ix3 interfaceC1262230ix3 = (InterfaceC1262230ix3) obj;
            if ((interfaceC1262230ix3 instanceof C1261860iwS) && C1260990iv3.LIZJ((C1261860iwS) interfaceC1262230ix3)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final <T> AbstractC316870CbV<T> LIZJ(AbstractC1264080j02<?> abstractC1264080j02) {
        if (abstractC1264080j02 instanceof C1264120j06) {
            return C317290CcB.LIZIZ(AbstractC316870CbV.LIZ);
        }
        if (abstractC1264080j02 instanceof C1264100j04) {
            C317290CcB c317290CcB = AbstractC316870CbV.LIZ;
            Exception exc = new Exception(((C1264100j04) abstractC1264080j02).LIZIZ);
            c317290CcB.getClass();
            return new C316650Cb9(exc);
        }
        if (abstractC1264080j02 instanceof C1265700j2e) {
            C317290CcB c317290CcB2 = AbstractC316870CbV.LIZ;
            Object obj = ((C1265700j2e) abstractC1264080j02).LIZJ;
            if (obj == null) {
                obj = null;
            }
            return C317290CcB.LJ(c317290CcB2, null, obj, null, 5);
        }
        if (abstractC1264080j02 instanceof C1264110j05) {
            AbstractC316870CbV.LIZ.getClass();
            return new C316880CbW("");
        }
        throw new C1954807lC();
    }

    public static final String LIZLLL(List<? extends EnumC1070410dxf> list) {
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<? extends EnumC1070410dxf> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(Integer.valueOf(it2.next().getValue()));
        }
        return C13LP.LJJLIIIJ(arrayList, ",", e3.e, e3.f, 0, null, null, 56);
    }

    public static final C123800dY LJ(C1261860iwS c1261860iwS) {
        C123800dY c123800dY = new C123800dY();
        String uid = c1261860iwS.getUid();
        if (uid == null) {
            uid = "";
        }
        c123800dY.setUid(uid);
        c123800dY.setNickname(c1261860iwS.getNickname());
        c123800dY.setAvatar168(c1261860iwS.getAvatar168());
        c123800dY.setAvatar300(c1261860iwS.getAvatar300());
        c123800dY.setFollowStatus(c1261860iwS.getFollowStatus());
        c123800dY.setFollowerStatus(c1261860iwS.getFollowerStatus());
        c123800dY.setMatchedFriendStruct(c1261860iwS.getMatchedFriendStruct());
        c123800dY.isBlock = c1261860iwS.isBlock;
        c123800dY.setPrivateAccount(c1261860iwS.isAccuratePrivateAccount());
        return c123800dY;
    }

    public static final List<C1261860iwS> LJFF(List<C1261860iwS> list, Set<String> set, String str, int i) {
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        for (C1261860iwS c1261860iwS : list) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                C1261860iwS c1261860iwS2 = c1261860iwS;
                if (!set.contains(c1261860iwS2.getUid())) {
                    set.add(c1261860iwS2.getUid());
                    c1261860iwS2.setRequestId(str);
                    c1261860iwS2.setImprOrder(i2 + i);
                    arrayList.add(c1261860iwS2);
                }
                i2 = i3;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        return arrayList;
    }
}
