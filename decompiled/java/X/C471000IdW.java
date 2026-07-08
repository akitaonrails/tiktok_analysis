package X;

import Y.AkS156S0000000_7;
import Y.AkS471S0100000_7;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.android.livesdk.feed.tab.api.FeedTabApi;
import com.bytedance.android.livesdk.model.ItemTab;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.l;
import com.google.gson.o;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0IdW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C471000IdW {
    public static volatile C471000IdW LJI;
    public FeedTabApi LIZ;
    public final C471060Idc LIZIZ = new Object() { // from class: X.0Idc
    };
    public List<ItemTab> LIZJ;
    public List<ItemTab> LIZLLL;
    public String LJ;
    public Keva LJFF;

    public static List LIZIZ() {
        ArrayList arrayList = new ArrayList(1);
        ItemTab itemTab = new ItemTab();
        itemTab.setId(1L);
        itemTab.setName("Top LIVEs");
        if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isOffline() || ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isLiveInhouse()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("https://");
            C1515210pX5.LIZLLL().getClass();
            sbLIZ.append(C1515210pX5.LIZJ());
            sbLIZ.append("/webcast/feed/?content_type=0&style=2&channel_id=21&debug=true");
            itemTab.setUrl(C2188811AlT.LIZIZ(sbLIZ));
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("https://");
            C1515210pX5.LIZLLL().getClass();
            sbLIZ2.append(C1515210pX5.LIZJ());
            sbLIZ2.append("/webcast/feed/?content_type=0&style=2&channel_id=21");
            itemTab.setUrl(C2188811AlT.LIZIZ(sbLIZ2));
        }
        itemTab.setStyle(2);
        arrayList.add(itemTab);
        return arrayList;
    }

    public static C471000IdW LJ() {
        if (LJI == null) {
            synchronized (C471000IdW.class) {
                try {
                    if (LJI == null) {
                        LJI = new C471000IdW();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LJI;
    }

    public final List<ItemTab> LIZJ() {
        if (TextUtils.equals("homepage_hot", C466640IRq.LIZJ().LIZLLL())) {
            return LIZLLL();
        }
        synchronized (this) {
            if (!LJI(this.LIZJ)) {
                List<ItemTab> list = (List) LJII(new TypeToken<List<ItemTab>>() { // from class: X.0IdY
                }, "ttlive_tabs_cache");
                this.LIZJ = list;
                if (!LJI(list)) {
                    this.LIZJ = LIZIZ();
                }
            }
        }
        return new ArrayList(this.LIZJ);
    }

    public final List<ItemTab> LIZLLL() {
        if (!LJI(this.LIZLLL)) {
            this.LIZLLL = (List) LJII(new TypeToken<List<ItemTab>>() { // from class: X.0IdX
            }, "ttlive_tabs_cache_fyp");
        }
        if (LJI(this.LIZLLL)) {
            return new ArrayList(this.LIZLLL);
        }
        return null;
    }

    public final C11ON LJIIIIZZ() {
        if (this.LIZ == null) {
            C480460Ism.LIZ().getClass();
            this.LIZ = (FeedTabApi) C480460Ism.LIZLLL(FeedTabApi.class);
        }
        return this.LIZ.queryTab(2).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJJJZI(new AkS156S0000000_7(5)).LJJJJZI(new AkS471S0100000_7(this, 4));
    }

    public static boolean LJFF(List<ItemTab> list) {
        if (!LJI(list)) {
            return false;
        }
        for (ItemTab itemTab : list) {
            if (itemTab == null || !itemTab.isItemValid()) {
                return false;
            }
        }
        return true;
    }

    public static boolean LJI(List<ItemTab> list) {
        if (list != null && !list.isEmpty()) {
            return true;
        }
        return false;
    }

    public final void LIZ(List<ItemTab> list) {
        ItemTab next;
        if (list != null && !list.isEmpty()) {
            Iterator<ItemTab> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (next != null && next.getId() == 1) {
                        break;
                    }
                } else {
                    next = (ItemTab) ListProtector.get(list, 0);
                    break;
                }
            }
            if (C497740JfY.LJII() == null) {
                return;
            }
            this.LJ = next.getName();
            if (this.LJFF == null) {
                this.LJFF = KevaImpl.getRepo("live_tab_type_repo", 0);
            }
            this.LJFF.storeString("ttlive_live_tab_type", next.getName());
        }
    }

    public final synchronized boolean LJIIIZ(List<ItemTab> list) {
        try {
            String json = GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, list);
            if (C497740JfY.LJII() != null) {
                SharedPreferences.Editor editorEdit = C810670Vr7.LIZJ(C497740JfY.LJII(), 0, "ttlive_tabs_cache_fyp").edit();
                editorEdit.putString("tabs", json);
                C1499900p8O.LIZ(editorEdit);
            }
        } catch (l e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJFF("BaseLocalFeedTabDataSource", "writeToSP: ", e);
        }
        if (list != null && !list.isEmpty() && LJFF(list)) {
            C471060Idc c471060Idc = this.LIZIZ;
            List<ItemTab> list2 = this.LIZLLL;
            c471060Idc.getClass();
            if (list != list2) {
                if (list2 != null && list.size() == list2.size()) {
                    for (int i = 0; i < list.size(); i++) {
                        Object obj = ListProtector.get(list, i);
                        Object obj2 = ListProtector.get(list2, i);
                        if (obj == null) {
                            if (obj2 == null) {
                            }
                        } else if (obj2 != null && obj.equals(obj2)) {
                        }
                    }
                }
                this.LIZLLL = new ArrayList(list);
                return true;
            }
            return false;
        }
        this.LIZLLL = null;
        return false;
    }

    public static Object LJII(TypeToken typeToken, String str) {
        if (C497740JfY.LJII() == null) {
            return null;
        }
        String string = C810670Vr7.LIZJ(C497740JfY.LJII(), 0, str).getString("tabs", "");
        if (C2093608Ic.LJ(string)) {
            return null;
        }
        try {
            return C2348809Ig.LJ(string, typeToken.getType());
        } catch (o e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJII(e);
            return null;
        }
    }
}
