package X;

import Y.AfS193S0100000_24;
import com.ss.android.ugc.aweme.explore.data.ExplorePostItem;
import com.ss.android.ugc.aweme.explore.data.ExploreRelatedAwemeList;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.explore.ExploreClientExtra;
import com.ss.android.ugc.aweme.music.model.RelatedAweme;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AFwS264S0000000_24;

/* JADX INFO: renamed from: X.0sCO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1617700sCO {
    public static final C1617700sCO LIZ = new C1617700sCO();
    public static final int LIZIZ;
    public static final C01GW LIZJ;
    public static volatile boolean LIZLLL;
    public static final Map<String, C05XL<Unit>> LJ;

    static {
        LIZIZ = C20530315Vd.LIZ().enable ? 6 : 1;
        LIZJ = C452501pT.LIZ(EnumC452301pR.NONE, AFwS213S0000000_24.get$arr$(656));
        LJ = new LinkedHashMap();
    }

    public static List LIZ(Aweme aweme, Long l) {
        C01GW c01gw = LIZJ;
        List list = (List) ((HashMap) c01gw.getValue()).get(aweme.getAid());
        if (list != null) {
            C19719612Di.LJJIIJ(list, AFwS264S0000000_24.get$arr$(749), true);
            if (!list.isEmpty()) {
                ((HashMap) c01gw.getValue()).put(aweme.getAid(), new ArrayList());
                return list;
            }
        }
        List listSingletonList = Collections.singletonList(new C1617730sCR(aweme.getAid(), aweme.getAwemeType()));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listSingletonList) {
            if (((C1617730sCR) obj).LIZIZ != 150) {
                arrayList.add(obj);
            }
        }
        if (!LIZLLL && !arrayList.isEmpty() && !C0B1Y.LIZ()) {
            LIZLLL = true;
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                LJ.put(((C1617730sCR) it2.next()).LIZ, C090F.LIZIZ());
            }
            System.currentTimeMillis();
            C11JN c11jnLIZLLL = C15UV.LIZLLL(arrayList, LIZIZ, 1, l);
            if (c11jnLIZLLL != null) {
                c11jnLIZLLL.LJL(C11S5.LIZ()).LJJJLZIJ(C11S5.LIZ()).LJJLL(new C09JN() { // from class: X.0sCP
                    @Override // X.C09JN
                    public final void accept(Object obj2) {
                        List<? extends RelatedAweme> list2;
                        C1C7U.LIZ("ExploreInnerCacheManager@a9c3.request$2");
                        ExploreRelatedAwemeList exploreRelatedAwemeList = (ExploreRelatedAwemeList) obj2;
                        C1617700sCO c1617700sCO = C1617700sCO.LIZ;
                        C1617700sCO.LIZLLL = false;
                        if (exploreRelatedAwemeList != null && (list2 = exploreRelatedAwemeList.relatedAwemes) != null) {
                            for (RelatedAweme relatedAweme : list2) {
                                List<Aweme> list3 = relatedAweme.awemeList;
                                if (list3 != null) {
                                    Iterator<Aweme> it3 = list3.iterator();
                                    while (it3.hasNext()) {
                                        AwemeBizExtKt.setExploreClientExtra(it3.next(), new ExploreClientExtra(1, null, true));
                                    }
                                    C1617700sCO c1617700sCO2 = C1617700sCO.LIZ;
                                    HashMap map = (HashMap) C1617700sCO.LIZJ.getValue();
                                    String str = relatedAweme.relatedAid;
                                    ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list3, 10));
                                    Iterator<Aweme> it4 = list3.iterator();
                                    while (it4.hasNext()) {
                                        arrayList2.add(new ExplorePostItem(it4.next()));
                                    }
                                    map.put(str, new ArrayList(arrayList2));
                                }
                                Map<String, C05XL<Unit>> map2 = C1617700sCO.LJ;
                                C05XL c05xl = (C05XL) ((LinkedHashMap) map2).get(relatedAweme.relatedAid);
                                if (c05xl != null) {
                                    c05xl.LJIIZILJ(Unit.LIZ);
                                }
                                map2.remove(relatedAweme.relatedAid);
                            }
                        }
                        C1C7U.LIZIZ("ExploreInnerCacheManager@a9c3.request$2");
                    }
                }, new AfS193S0100000_24(arrayList, 50));
            }
        }
        return C13BV.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(java.lang.String r6, X.InterfaceC1364105Vn<? super java.lang.Boolean> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C1617690sCN
            if (r0 == 0) goto L50
            r4 = r7
            X.0sCN r4 = (X.C1617690sCN) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L50
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L27
            if (r0 != r1) goto L56
            X.C155000ia.LIZIZ(r3)
        L22:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            return r0
        L27:
            X.C155000ia.LIZIZ(r3)
            if (r6 == 0) goto L64
            int r0 = r6.length()
            if (r0 == 0) goto L64
            boolean r0 = X.C1617700sCO.LIZLLL
            if (r0 != 0) goto L3b
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            return r0
        L3b:
            java.util.Map<java.lang.String, X.05XL<kotlin.Unit>> r0 = X.C1617700sCO.LJ
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            java.lang.Object r0 = r0.get(r6)
            X.0957 r0 = (X.AnonymousClass0957) r0
            if (r0 == 0) goto L5e
            r4.LLILLL = r1
            java.lang.Object r0 = r0.LJLIIIL(r4)
            if (r0 != r2) goto L22
            return r2
        L50:
            X.0sCN r4 = new X.0sCN
            r4.<init>(r5, r7)
            goto L12
        L56:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L5e:
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L64:
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1617700sCO.LIZIZ(java.lang.String, X.05Vn):java.lang.Object");
    }
}
