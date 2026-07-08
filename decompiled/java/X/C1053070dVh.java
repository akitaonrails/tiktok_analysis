package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.profile.impl.ad.ProfileFeedAdsFeedWatchEvent;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.AwS101S1000000_16;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: renamed from: X.0dVh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@InterfaceC1003940cES(service = {InterfaceC1053190dVt.class})
public final class C1053070dVh implements InterfaceC1053190dVt {
    public static final C1053170dVr LLJJJJJIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJLIIL;
    public static final C01GW<Boolean> LLJJL;
    public final InterfaceC1053120dVm LL;
    public int LLILZ;
    public String LLILZIL;
    public boolean LLILZLL;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public int LLJJIJIIJIL;
    public final C997320c3m LLILLJJLI = new C997320c3m(AFwS252S0000000_16.get$arr$(447));
    public final C997320c3m LLILLL = new C997320c3m(AFwS252S0000000_16.get$arr$(446));
    public int LLIZ = -1;
    public int LLIZLLLIL = -1;
    public int LLJ = -1;
    public int LLJI = -1;
    public int LLJILJILJ = -1;
    public String LLJILLL = "";
    public int LLJJ = -1;
    public final Set<String> LLJJI = new LinkedHashSet();
    public Set<String> LLJJIII = new LinkedHashSet();
    public Set<String> LLJJIJI = new LinkedHashSet();
    public String LLJJIJIL = "";
    public final C01GW LLJJJ = C452501pT.LIZIZ(new AwS560S0100000_16(this, 687));
    public final C01GW LLJJJIL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 688));
    public final C1034750d29 LLJJJJ = new C1034750d29(new Object[0]);

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0dVr] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1053070dVh.class, "listModel", "getListModel()Lcom/ss/android/ugc/aweme/common/presenter/BaseListModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJJLIIL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C1053070dVh.class, "author", "getAuthor()Lcom/ss/android/ugc/aweme/profile/model/User;", 0)};
        LLJJJJJIL = new Object() { // from class: X.0dVr
        };
        LLJJL = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(142));
    }

    public final User LJFF() {
        C997320c3m c997320c3m = this.LLILLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJLIIL;
        return (User) c997320c3m.LIZ(this);
    }

    public final AbstractC1255880imo<Aweme, ?> LJI() {
        C997320c3m c997320c3m = this.LLILLJJLI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJLIIL;
        return (AbstractC1255880imo) c997320c3m.LIZ(this);
    }

    @Override // X.InterfaceC1053190dVt
    public final void fn() {
        int i = this.LLIZLLLIL;
        if (i != -1) {
            this.LLIZLLLIL = i - 1;
        }
        if (this.LLJILJIL) {
            return;
        }
        this.LLJI--;
    }

    @Override // X.InterfaceC1010530cP5
    public final /* bridge */ /* synthetic */ InterfaceC1053120dVm Mh() {
        return this.LL;
    }

    @Override // X.InterfaceC1037910d7F
    public final void initialize() {
        C1010170cOV.LIZJ(this);
    }

    public C1053070dVh(C1216340hl2 c1216340hl2) {
        this.LL = c1216340hl2;
    }

    public static final void LJIIIIZZ(String str) {
        new AwS101S1000000_16(str, 1);
        LLJJJJJIL.getClass();
        LLJJL.getValue().booleanValue();
    }

    @Override // X.InterfaceC1053190dVt
    public final void C3(List<? extends Aweme> list) {
        int i;
        String uid;
        List<Aweme> items;
        if (!((Boolean) this.LLJJJIL.getValue()).booleanValue() || !this.LLJILJIL) {
            return;
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<? extends Aweme> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().getAid());
        }
        AbstractC1255880imo<Aweme, ?> abstractC1255880imoLJI = LJI();
        if (abstractC1255880imoLJI != null && (items = abstractC1255880imoLJI.getItems()) != null) {
            Iterator<Aweme> it3 = items.iterator();
            i = 0;
            while (it3.hasNext()) {
                if (Intrinsics.LJFF(it3.next().getAid(), ((Aweme) ListProtector.get(list, 0)).getAid())) {
                    break;
                } else {
                    i++;
                }
            }
            i = -1;
        } else {
            i = -1;
        }
        String strLIZIZ = LIZIZ(0, 2, i);
        LJIIIIZZ("onLoadMoreSuccess, recentItems is " + strLIZIZ);
        User userLJFF = LJFF();
        if (userLJFF == null || (uid = userLJFF.getUid()) == null) {
            uid = "";
        }
        LIZJ(2, uid, strLIZIZ, 0, arrayList);
    }

    public final void LJIIIZ(List<? extends Aweme> list) {
        for (Aweme aweme : (ArrayList) list) {
            C1034750d29 c1034750d29 = this.LLJJJJ;
            C1053100dVk.LIZ.getClass();
            c1034750d29.logAd(C1053100dVk.LIZLLL, new AwS595S0100000_16(aweme, 77));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1053190dVt
    public final void je0(AbstractC1255880imo<Aweme, ?> abstractC1255880imo) {
        Integer numValueOf;
        Integer numValueOf2;
        Integer numValueOf3;
        Integer numValueOf4;
        int size;
        int size2;
        int size3;
        int size4;
        int size5;
        StringBuilder sb = new StringBuilder("on exit inner feed start: aweme size = ");
        List items = abstractC1255880imo.getItems();
        if (items != null) {
            numValueOf = Integer.valueOf(items.size());
        } else {
            numValueOf = null;
        }
        sb.append(numValueOf);
        sb.append(", ad size = ");
        List items2 = abstractC1255880imo.getItems();
        if (items2 != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : items2) {
                if (AwemeExtKt.isAdTraffic((Aweme) obj)) {
                    arrayList.add(obj);
                }
            }
            numValueOf2 = Integer.valueOf(arrayList.size());
        } else {
            numValueOf2 = null;
        }
        sb.append(numValueOf2);
        LJIIIIZZ(sb.toString());
        List items3 = abstractC1255880imo.getItems();
        if (items3 != null) {
            ArrayList arrayList2 = new ArrayList(items3);
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : arrayList2) {
                if (AwemeExtKt.isAdTraffic((Aweme) obj2)) {
                    arrayList3.add(obj2);
                }
            }
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                abstractC1255880imo.deleteItem(it2.next());
            }
        }
        StringBuilder sb2 = new StringBuilder("on exit inner feed end: aweme size = ");
        List items4 = abstractC1255880imo.getItems();
        if (items4 != null) {
            numValueOf3 = Integer.valueOf(items4.size());
        } else {
            numValueOf3 = null;
        }
        sb2.append(numValueOf3);
        sb2.append(", ad size = ");
        List items5 = abstractC1255880imo.getItems();
        if (items5 != null) {
            ArrayList arrayList4 = new ArrayList();
            for (Object obj3 : items5) {
                if (AwemeExtKt.isAdTraffic((Aweme) obj3)) {
                    arrayList4.add(obj3);
                }
            }
            numValueOf4 = Integer.valueOf(arrayList4.size());
        } else {
            numValueOf4 = null;
        }
        sb2.append(numValueOf4);
        LJIIIIZZ(sb2.toString());
        this.LLILZIL = null;
        C1034750d29 c1034750d29 = this.LLJJJJ;
        ProfileFeedAdsFeedWatchEvent profileFeedAdsFeedWatchEvent = new ProfileFeedAdsFeedWatchEvent();
        Set<String> set = this.LLJJI;
        if (set != null) {
            size = set.size();
        } else {
            size = 0;
        }
        profileFeedAdsFeedWatchEvent.LJI(Integer.valueOf(size), "count");
        Set<String> set2 = this.LLJJIJI;
        if (set2 != null) {
            size2 = set2.size();
        } else {
            size2 = 0;
        }
        profileFeedAdsFeedWatchEvent.LJI(Integer.valueOf(size2), "up_count");
        Set<String> set3 = this.LLJJIII;
        if (set3 != null) {
            size3 = set3.size();
        } else {
            size3 = 0;
        }
        profileFeedAdsFeedWatchEvent.LJI(Integer.valueOf(size3), "down_count");
        c1034750d29.logWithEvent(profileFeedAdsFeedWatchEvent);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("profile_feed_ads_feed_watch, upCount = ");
        Set<String> set4 = this.LLJJIJI;
        if (set4 != null) {
            size4 = set4.size();
        } else {
            size4 = 0;
        }
        sbLIZ.append(size4);
        sbLIZ.append(", downCount = ");
        Set<String> set5 = this.LLJJIII;
        if (set5 != null) {
            size5 = set5.size();
        } else {
            size5 = 0;
        }
        sbLIZ.append(size5);
        LJIIIIZZ(C2188811AlT.LIZIZ(sbLIZ));
        Set<String> set6 = this.LLJJIJI;
        if (set6 != null) {
            set6.clear();
        }
        Set<String> set7 = this.LLJJIII;
        if (set7 != null) {
            set7.clear();
        }
        this.LLJJIJI = null;
        this.LLJJIII = null;
        this.LLJJ = -1;
        this.LLJILJILJ = -1;
        this.LLJILLL = "";
        this.LLJJIJIL = "";
        EventBus.LIZLLL().LJJI(this);
        for (Class cls : C1010170cOV.LIZ(this)) {
            C1010170cOV.LIZ.LIZJ.remove(cls);
            C1010170cOV.LIZIZ.LIZJ.remove(cls);
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onDetailQuit(C1565800qqg c1565800qqg) {
        Integer numValueOf;
        Integer numValueOf2;
        Integer numValueOf3;
        List<Aweme> items;
        List<Aweme> items2;
        List<Aweme> items3;
        List<Aweme> items4;
        List<Aweme> items5;
        List<Aweme> items6;
        this.LLILZLL = true;
        StringBuilder sb = new StringBuilder("on detail quit start: aweme size = ");
        AbstractC1255880imo<Aweme, ?> abstractC1255880imoLJI = LJI();
        Integer numValueOf4 = null;
        if (abstractC1255880imoLJI != null && (items6 = abstractC1255880imoLJI.getItems()) != null) {
            numValueOf = Integer.valueOf(items6.size());
        } else {
            numValueOf = null;
        }
        sb.append(numValueOf);
        sb.append(", ad size = ");
        AbstractC1255880imo<Aweme, ?> abstractC1255880imoLJI2 = LJI();
        if (abstractC1255880imoLJI2 != null && (items5 = abstractC1255880imoLJI2.getItems()) != null) {
            ArrayList arrayList = new ArrayList();
            for (Aweme aweme : items5) {
                if (AwemeExtKt.isAdTraffic(aweme)) {
                    arrayList.add(aweme);
                }
            }
            numValueOf2 = Integer.valueOf(arrayList.size());
        } else {
            numValueOf2 = null;
        }
        sb.append(numValueOf2);
        LJIIIIZZ(sb.toString());
        AbstractC1255880imo<Aweme, ?> abstractC1255880imoLJI3 = LJI();
        if (abstractC1255880imoLJI3 != null && (items3 = abstractC1255880imoLJI3.getItems()) != null) {
            ArrayList arrayList2 = new ArrayList(items3);
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : arrayList2) {
                if (AwemeExtKt.isAdTraffic((Aweme) obj)) {
                    arrayList3.add(obj);
                }
            }
            for (Object obj2 : arrayList3) {
                AbstractC1255880imo<Aweme, ?> abstractC1255880imoLJI4 = LJI();
                if (abstractC1255880imoLJI4 != null && (items4 = abstractC1255880imoLJI4.getItems()) != null) {
                    items4.remove(obj2);
                }
            }
        }
        StringBuilder sb2 = new StringBuilder("on detail quit end: aweme size = ");
        AbstractC1255880imo<Aweme, ?> abstractC1255880imoLJI5 = LJI();
        if (abstractC1255880imoLJI5 != null && (items2 = abstractC1255880imoLJI5.getItems()) != null) {
            numValueOf3 = Integer.valueOf(items2.size());
        } else {
            numValueOf3 = null;
        }
        sb2.append(numValueOf3);
        sb2.append(", ad size = ");
        AbstractC1255880imo<Aweme, ?> abstractC1255880imoLJI6 = LJI();
        if (abstractC1255880imoLJI6 != null && (items = abstractC1255880imoLJI6.getItems()) != null) {
            ArrayList arrayList4 = new ArrayList();
            for (Aweme aweme2 : items) {
                if (AwemeExtKt.isAdTraffic(aweme2)) {
                    arrayList4.add(aweme2);
                }
            }
            numValueOf4 = Integer.valueOf(arrayList4.size());
        }
        sb2.append(numValueOf4);
        LJIIIIZZ(sb2.toString());
    }

    @Override // X.InterfaceC1053190dVt
    public final void H4(int i, Aweme aweme) {
        int i2;
        String string;
        Set<String> set;
        String strLIZIZ;
        List<Aweme> items;
        List<Aweme> items2;
        Long adId;
        if (aweme == null) {
            return;
        }
        if (Intrinsics.LJFF(aweme.getAid(), this.LLJILLL) && ((this.LLJIJIL || this.LLJILJIL) && ((Boolean) this.LLJJJIL.getValue()).booleanValue())) {
            return;
        }
        int i3 = this.LLJILJILJ;
        int i4 = 0;
        if (i > i3) {
            i2 = 0;
        } else if (i < i3) {
            i2 = 1;
        } else {
            i2 = -1;
        }
        this.LLJJ = i2;
        if (!Intrinsics.LJFF(((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID(), AwemeExtKt.getAuthorUid(aweme))) {
            C1019400cdO.LJII(aweme, "profile_feed");
        }
        if (AwemeExtKt.isAdTraffic(aweme)) {
            this.LLILZ = 0;
        } else {
            this.LLILZ++;
        }
        String aid = aweme.getAid();
        String str = "";
        if (aid == null) {
            aid = "";
        }
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd == null || (adId = awemeRawAd.getAdId()) == null || (string = adId.toString()) == null) {
            string = "";
        }
        Set<String> set2 = this.LLJJI;
        if (set2 != null) {
            set2.add(aid);
        }
        int i5 = this.LLJJ;
        if (i5 == 0) {
            Set<String> set3 = this.LLJJIII;
            if (set3 != null) {
                String aid2 = aweme.getAid();
                if (aid2 != null) {
                    str = aid2;
                }
                set3.add(str);
            }
        } else if (i5 == 1 && (set = this.LLJJIJI) != null) {
            String aid3 = aweme.getAid();
            if (aid3 != null) {
                str = aid3;
            }
            set.add(str);
        }
        this.LLJILLL = aid;
        this.LLJILJILJ = i;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onViewHolderSelected, aid = ");
        sbLIZ.append(aid);
        sbLIZ.append(", adID = ");
        sbLIZ.append(string);
        sbLIZ.append(", topBorder = ");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", bottomBorder = ");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", position is ");
        sbLIZ.append(i);
        LJIIIIZZ(C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC1034730d27 interfaceC1034730d27 = (InterfaceC1034730d27) C1010170cOV.LIZIZ(InterfaceC1034730d27.class);
        if (interfaceC1034730d27 != null) {
            interfaceC1034730d27.hA0(aid);
        }
        boolean zIsEmpty = TextUtils.isEmpty(this.LLJJIJIL);
        if (!TextUtils.isEmpty(string)) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(this.LLJJIJIL);
            sbLIZ2.append(',');
            sbLIZ2.append(i);
            sbLIZ2.append(':');
            sbLIZ2.append(aid);
            sbLIZ2.append('_');
            sbLIZ2.append(string);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        } else {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(this.LLJJIJIL);
            sbLIZ3.append(',');
            sbLIZ3.append(i);
            sbLIZ3.append(':');
            sbLIZ3.append(aid);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
        }
        this.LLJJIJIL = strLIZIZ;
        if (zIsEmpty) {
            try {
                this.LLJJIJIL = strLIZIZ.substring(1);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1AF0.LJ(e);
            }
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("onViewHolderSelected, recentItems is ");
        sbLIZ4.append(this.LLJJIJIL);
        LJIIIIZZ(C2188811AlT.LIZIZ(sbLIZ4));
        if (((Boolean) this.LLJJJ.getValue()).booleanValue()) {
            AbstractC1255880imo<Aweme, ?> abstractC1255880imoLJI = LJI();
            if (abstractC1255880imoLJI != null && (items2 = abstractC1255880imoLJI.getItems()) != null && i >= 0 && i < items2.size()) {
                Iterator<Aweme> it2 = items2.iterator();
                while (it2.hasNext()) {
                    if (Intrinsics.LJFF(it2.next().getAid(), this.LLILZIL)) {
                        if (i4 >= 0 && i4 - i <= 0) {
                            LIZ(1, LJFF(), aweme.getAid(), abstractC1255880imoLJI);
                            return;
                        }
                        return;
                    }
                    i4++;
                }
                return;
            }
            return;
        }
        if (!((Boolean) this.LLJJJIL.getValue()).booleanValue()) {
            return;
        }
        int i6 = this.LLJJ;
        AbstractC1255880imo<Aweme, ?> abstractC1255880imoLJI2 = LJI();
        if (abstractC1255880imoLJI2 == null || (items = abstractC1255880imoLJI2.getItems()) == null || i < 0 || i >= items.size() || i6 == -1) {
            return;
        }
        if (i6 == 0) {
            int i7 = this.LLIZLLLIL;
            if (i7 == -1) {
                return;
            }
            if (this.LLJILJIL) {
                if (i != i7 - 3) {
                    return;
                }
            } else {
                int i8 = this.LLJI;
                if (i > i7 || i8 > i) {
                    return;
                }
            }
            LIZ(2, LJFF(), aweme.getAid(), abstractC1255880imoLJI2);
            return;
        }
        if (i6 != 1) {
            return;
        }
        if (this.LLJIJIL) {
            if (i != this.LLIZ + 3) {
                return;
            }
        } else {
            int i9 = this.LLIZ;
            if (i > this.LLJ || i9 > i) {
                return;
            }
        }
        LIZ(3, LJFF(), aweme.getAid(), abstractC1255880imoLJI2);
    }

    @Override // X.InterfaceC1053190dVt
    public final void jO2(AbstractC1255880imo<Aweme, ?> abstractC1255880imo, String str) {
        int size;
        Integer numValueOf;
        int i;
        String str2;
        int size2;
        int i2 = 0;
        this.LLILZLL = false;
        List<Aweme> items = abstractC1255880imo.getItems();
        if (items != null) {
            size = items.size();
        } else {
            size = 0;
        }
        this.LLJJIJIIJIL = size;
        C1019510cdZ c1019510cdZLIZJ = C1019400cdO.LIZJ();
        c1019510cdZLIZJ.LIZJ = -1;
        c1019510cdZLIZJ.LIZLLL = -1;
        c1019510cdZLIZJ.LJ = 0;
        c1019510cdZLIZJ.LJFF = 0;
        c1019510cdZLIZJ.LJII.clear();
        c1019510cdZLIZJ.LJIIIIZZ.clear();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("enter feed size = ");
        List<Aweme> items2 = abstractC1255880imo.getItems();
        if (items2 != null) {
            numValueOf = Integer.valueOf(items2.size());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        LJIIIIZZ(C2188811AlT.LIZIZ(sbLIZ));
        if (((Boolean) this.LLJJJ.getValue()).booleanValue()) {
            LIZ(0, LJFF(), str, abstractC1255880imo);
        }
        List<Aweme> items3 = abstractC1255880imo.getItems();
        if (items3 != null) {
            Iterator<Aweme> it2 = items3.iterator();
            i = 0;
            while (it2.hasNext()) {
                if (Intrinsics.LJFF(it2.next().getAid(), str)) {
                    break;
                } else {
                    i++;
                }
            }
            i = -1;
        } else {
            i = -1;
        }
        this.LLJILJILJ = i;
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        this.LLJILLL = str2;
        List<Aweme> items4 = abstractC1255880imo.getItems();
        if (items4 != null) {
            Iterator<Aweme> it3 = items4.iterator();
            int i3 = 0;
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                if (Intrinsics.LJFF(it3.next().getAid(), str)) {
                    if (i3 != -1) {
                        if (i3 != 0) {
                            i2 = i3 - 1;
                        }
                        this.LLIZ = i2;
                        if (i3 == items4.size() - 1) {
                            size2 = items4.size() - 1;
                        } else {
                            size2 = i3 + 1;
                        }
                        this.LLIZLLLIL = size2;
                        this.LLJ = this.LLIZ + 3;
                        this.LLJI = size2 - 3;
                    }
                } else {
                    i3++;
                }
            }
        }
        EventBus.LIZLLL().LJIJJ(this);
    }

    public final String LIZIZ(int i, int i2, int i3) {
        List<Aweme> items;
        String string;
        Long adId;
        String string2;
        Long adId2;
        String strLIZIZ = this.LLJJIJIL;
        AbstractC1255880imo<Aweme, ?> abstractC1255880imoLJI = LJI();
        if (abstractC1255880imoLJI != null && (items = abstractC1255880imoLJI.getItems()) != null) {
            if (i2 == 0) {
                return strLIZIZ;
            }
            if (i != 0) {
                if (i == 1) {
                    int i4 = this.LLJILJILJ - 1;
                    int i5 = this.LLIZ + 1;
                    if (i5 < 0) {
                        i5 = 0;
                    }
                    if (i5 <= i4) {
                        while (i4 < items.size()) {
                            Aweme aweme = (Aweme) ListProtector.get(items, i4);
                            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                            if (awemeRawAd == null || (adId2 = awemeRawAd.getAdId()) == null || (string2 = adId2.toString()) == null) {
                                string2 = "";
                            }
                            String aid = aweme.getAid();
                            if (aid == null) {
                                aid = "";
                            }
                            if (!TextUtils.isEmpty(string2)) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append(strLIZIZ);
                                sbLIZ.append(',');
                                sbLIZ.append(i4);
                                sbLIZ.append(':');
                                sbLIZ.append(aid);
                                sbLIZ.append('_');
                                sbLIZ.append(string2);
                                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                            } else {
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append(strLIZIZ);
                                sbLIZ2.append(',');
                                sbLIZ2.append(i4);
                                sbLIZ2.append(':');
                                sbLIZ2.append(aid);
                                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                            }
                            if (i4 != i5) {
                                i4--;
                                if (i4 < 0) {
                                    break;
                                }
                            }
                        }
                        return strLIZIZ;
                    }
                }
            } else {
                for (int i6 = this.LLJILJILJ + 1; i6 < i3; i6++) {
                    if (i6 >= 0 && i6 < items.size()) {
                        Aweme aweme2 = (Aweme) ListProtector.get(items, i6);
                        AwemeRawAd awemeRawAd2 = aweme2.getAwemeRawAd();
                        if (awemeRawAd2 == null || (adId = awemeRawAd2.getAdId()) == null || (string = adId.toString()) == null) {
                            string = "";
                        }
                        String aid2 = aweme2.getAid();
                        if (aid2 == null) {
                            aid2 = "";
                        }
                        if (!TextUtils.isEmpty(string)) {
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append(strLIZIZ);
                            sbLIZ3.append(',');
                            sbLIZ3.append(i6);
                            sbLIZ3.append(':');
                            sbLIZ3.append(aid2);
                            sbLIZ3.append('_');
                            sbLIZ3.append(string);
                            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                        } else {
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append(strLIZIZ);
                            sbLIZ4.append(',');
                            sbLIZ4.append(i6);
                            sbLIZ4.append(':');
                            sbLIZ4.append(aid2);
                            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ4);
                        }
                    } else {
                        return strLIZIZ;
                    }
                }
            }
        }
        return strLIZIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(int r22, com.ss.android.ugc.aweme.profile.model.User r23, java.lang.String r24, X.AbstractC1255880imo<com.ss.android.ugc.aweme.feed.model.Aweme, ?> r25) {
        /*
            Method dump skipped, instruction units count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1053070dVh.LIZ(int, com.ss.android.ugc.aweme.profile.model.User, java.lang.String, X.0imo):void");
    }

    public final void LIZJ(int i, String str, String str2, int i2, List list) {
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ.plus(C23118094a.LIZ())), null, null, new C1053080dVi(this, list, i, str, i2, str2, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(int r24, int r25, java.lang.String r26, java.lang.String r27, java.util.List r28, X.InterfaceC1364105Vn r29) {
        /*
            Method dump skipped, instruction units count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1053070dVh.LIZLLL(int, int, java.lang.String, java.lang.String, java.util.List, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0016  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List LJ(int r7, int r8, java.util.List r9, int r10, int r11, int r12) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1053070dVh.LJ(int, int, java.util.List, int, int, int):java.util.List");
    }
}
