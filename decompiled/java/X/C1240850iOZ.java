package X;

import com.ss.android.ugc.aweme.affinity.model.SocialAffinityItem;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.mixsearch.MixSearchServiceImpl;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;
import njp.a;

/* JADX INFO: renamed from: X.0iOZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.mixsearch.MixSearchServiceImpl$searchLocal$2", f = "MixSearchServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C1240850iOZ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C316810CbP>, Object> {
    public final /* synthetic */ MixSearchServiceImpl LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ Comparator<C1240900iOe> LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1240850iOZ(MixSearchServiceImpl mixSearchServiceImpl, long j, Comparator<C1240900iOe> comparator, String str, InterfaceC1364105Vn<? super C1240850iOZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = mixSearchServiceImpl;
        this.LLILLJJLI = j;
        this.LLILLL = comparator;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1240850iOZ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1240900iOe c1240900iOe;
        double d;
        double d2;
        double d3;
        C1C7U.LIZ("MixSearchServiceImpl@ff6.searchLocal$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        MixSearchServiceImpl mixSearchServiceImpl = this.LL;
        List<IMUser> list = mixSearchServiceImpl.LIZ;
        String str = this.LLILZ;
        ArrayList arrayList = new ArrayList();
        for (IMUser iMUser : (ArrayList) list) {
            for (Map.Entry entry : C2097608Jq.LJIIIIZZ(new Pair(EnumC1220880hsM.USERNAME, iMUser.getDisplayId()), new Pair(EnumC1220880hsM.NICKNAME, iMUser.getNickName()), new Pair(EnumC1220880hsM.ALIAS, C1247000iYU.LIZ(iMUser))).entrySet()) {
                EnumC1220880hsM enumC1220880hsM = (EnumC1220880hsM) entry.getKey();
                String str2 = (String) entry.getValue();
                if (C123100dR.LIZ(str2)) {
                    C1385650mA7 c1385650mA7 = (C1385650mA7) mixSearchServiceImpl.LIZLLL.getValue();
                    EnumC1240860iOa enumC1240860iOa = EnumC1240860iOa.PREFIX;
                    C1369340ljo c1369340ljoLIZ = c1385650mA7.LIZ(str, str2, enumC1240860iOa);
                    if (c1369340ljoLIZ.LIZ > 0.0d) {
                        IMUser.Companion.getClass();
                        User userLJII = C2201941BFw.LJII(iMUser);
                        int typeValue = enumC1220880hsM.getTypeValue();
                        int iOrdinal = enumC1240860iOa.ordinal();
                        List<IntRange> list2 = c1369340ljoLIZ.LIZIZ;
                        SocialAffinityItem socialAffinityItem = (SocialAffinityItem) ((LinkedHashMap) mixSearchServiceImpl.LIZIZ).get(iMUser.getUid());
                        if (socialAffinityItem != null) {
                            d = socialAffinityItem.score;
                        } else {
                            d = 0.0d;
                        }
                        c1240900iOe = new C1240900iOe(userLJII, typeValue, iOrdinal, list2, d);
                    } else {
                        C1385650mA7 c1385650mA72 = (C1385650mA7) mixSearchServiceImpl.LIZLLL.getValue();
                        EnumC1240860iOa enumC1240860iOa2 = EnumC1240860iOa.POST_DELIMITER;
                        C1369340ljo c1369340ljoLIZ2 = c1385650mA72.LIZ(str, str2, enumC1240860iOa2);
                        if (c1369340ljoLIZ2.LIZ > 0.0d) {
                            IMUser.Companion.getClass();
                            User userLJII2 = C2201941BFw.LJII(iMUser);
                            int typeValue2 = enumC1220880hsM.getTypeValue();
                            int iOrdinal2 = enumC1240860iOa2.ordinal();
                            List<IntRange> list3 = c1369340ljoLIZ2.LIZIZ;
                            SocialAffinityItem socialAffinityItem2 = (SocialAffinityItem) ((LinkedHashMap) mixSearchServiceImpl.LIZIZ).get(iMUser.getUid());
                            if (socialAffinityItem2 != null) {
                                d2 = socialAffinityItem2.score;
                            } else {
                                d2 = 0.0d;
                            }
                            c1240900iOe = new C1240900iOe(userLJII2, typeValue2, iOrdinal2, list3, d2);
                        } else if (str.length() >= 3) {
                            C1385650mA7 c1385650mA73 = (C1385650mA7) mixSearchServiceImpl.LIZLLL.getValue();
                            EnumC1240860iOa enumC1240860iOa3 = EnumC1240860iOa.SUBSTRING;
                            C1369340ljo c1369340ljoLIZ3 = c1385650mA73.LIZ(str, str2, enumC1240860iOa3);
                            if (c1369340ljoLIZ3.LIZ > 0.0d) {
                                IMUser.Companion.getClass();
                                User userLJII3 = C2201941BFw.LJII(iMUser);
                                int typeValue3 = enumC1220880hsM.getTypeValue();
                                int iOrdinal3 = enumC1240860iOa3.ordinal();
                                List<IntRange> list4 = c1369340ljoLIZ3.LIZIZ;
                                SocialAffinityItem socialAffinityItem3 = (SocialAffinityItem) ((LinkedHashMap) mixSearchServiceImpl.LIZIZ).get(iMUser.getUid());
                                if (socialAffinityItem3 != null) {
                                    d3 = socialAffinityItem3.score;
                                } else {
                                    d3 = 0.0d;
                                }
                                c1240900iOe = new C1240900iOe(userLJII3, typeValue3, iOrdinal3, list4, d3);
                            }
                        } else {
                            continue;
                        }
                    }
                    arrayList.add(c1240900iOe);
                }
            }
        }
        C316810CbP c316810CbP = new C316810CbP(this.LLILZ, C13LP.LJLLLL(this.LLILLL, arrayList), (System.nanoTime() - this.LLILLJJLI) / 1000000.0d, ((System.nanoTime() - this.LLILLJJLI) - r2) / 1000000.0d);
        C1C7U.LIZIZ("MixSearchServiceImpl@ff6.searchLocal$2");
        return c316810CbP;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C316810CbP> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
