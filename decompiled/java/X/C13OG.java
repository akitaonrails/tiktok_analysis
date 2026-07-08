package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel;
import com.ss.ugc.effectplatform.model.net.PanelInfoResponse;
import com.ss.ugc.effectplatform.task.Version;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS431S0200000_30;
import kotlin.jvm.internal.AwS574S0100000_30;

/* JADX INFO: renamed from: X.13OG, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13OG extends AbstractC20000013Ne {
    public final C13RD LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final boolean LIZLLL;
    public final String LJ;
    public final int LJFF;
    public final int LJI;
    public final int LJII;

    @Override // X.AbstractC20000013Ne
    public final void execute() {
        CategoryEffectModel category_effects;
        String str;
        String strLJIILIIL = C13OQ.LJIILIIL(this.LJI, this.LJFF, this.LIZ.LJ, this.LIZIZ, this.LJII, this.LIZLLL, this.LJ);
        InterfaceC20004513Ox interfaceC20004513Ox = this.LIZ.LJJIFFI;
        C20008813Qo c20008813QoLJIILIIL = interfaceC20004513Ox != null ? interfaceC20004513Ox.LJIILIIL(strLJIILIIL) : null;
        C13SS c13ss = C13SS.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("read panel cache key: ");
        sbLIZ.append(strLJIILIIL);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c13ss.getClass();
        C13SS.LIZ("effect_request_chine_tag", strLIZIZ);
        if (c20008813QoLJIILIIL == null) {
            LIZ(new C1662010tLr(10004));
            return;
        }
        try {
            try {
                String strLJIIIZ = C13SB.LJIIIZ(c20008813QoLJIILIIL);
                C13R7 c13r7 = this.LIZ.LJIJI;
                panelInfoResponse = c13r7 != null ? (PanelInfoResponse) c13r7.LIZ.convertJsonToObj(strLJIIIZ, PanelInfoResponse.class) : null;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("read panel cache json result: ");
                sbLIZ2.append(strLJIIIZ);
                C13SS.LIZ("effect_request_chine_tag", C2188811AlT.LIZIZ(sbLIZ2));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C13SS c13ss2 = C13SS.LIZ;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("Json Parse Exception: ");
                sbLIZ3.append(e);
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
                c13ss2.getClass();
                C13SS.LIZIZ("FetchPanelInfoCacheTask", strLIZIZ2, null);
            }
            C13SB.LIZIZ(c20008813QoLJIILIIL);
            if (panelInfoResponse == null || !panelInfoResponse.checkValue()) {
                LIZ(new C1662010tLr(10004));
                return;
            }
            PanelInfoModel data = panelInfoResponse.getData();
            if (data != null) {
                C13RD c13rd = this.LIZ;
                if (c13rd.LJJJ == 2) {
                    C13OH c13oh = Version.Companion;
                    String strLJIILL = C13OQ.LJIILL(this.LIZIZ);
                    c13oh.getClass();
                    Version versionLIZ = C13OH.LIZ(c13rd, strLJIILL);
                    C13LD c13ld = C13LD.LIZ;
                    C13RD c13rd2 = this.LIZ;
                    String str2 = this.LIZIZ;
                    if (versionLIZ == null || (str = versionLIZ.logId) == null) {
                        str = "";
                    }
                    C13LD.LJ(c13ld, c13rd2, str2, data, false, str, 8);
                }
                CategoryEffectModel categoryEffectModel = data.getCategoryEffectModel();
                if (categoryEffectModel != null) {
                    categoryEffectModel.setCache(true);
                }
                PanelInfoModel data2 = panelInfoResponse.getData();
                if (data2 != null && (category_effects = data2.getCategory_effects()) != null) {
                    List<Effect> category_effects2 = category_effects.getCategory_effects();
                    ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(category_effects2, 10));
                    Iterator<Effect> it2 = category_effects2.iterator();
                    while (it2.hasNext()) {
                        Effect effect = new Effect(it2.next());
                        effect.set_cached_data(true);
                        arrayList.add(effect);
                    }
                    category_effects.setCategory_effects(arrayList);
                    List<Effect> collection = category_effects.getCollection();
                    ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(collection, 10));
                    Iterator<Effect> it3 = collection.iterator();
                    while (it3.hasNext()) {
                        Effect effect2 = new Effect(it3.next());
                        effect2.set_cached_data(true);
                        arrayList2.add(effect2);
                    }
                    category_effects.setCollection(arrayList2);
                    List<Effect> bind_effects = category_effects.getBind_effects();
                    ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(bind_effects, 10));
                    Iterator<Effect> it4 = bind_effects.iterator();
                    while (it4.hasNext()) {
                        Effect effect3 = new Effect(it4.next());
                        effect3.set_cached_data(true);
                        arrayList3.add(effect3);
                    }
                    category_effects.setBind_effects(arrayList3);
                }
                runOnMainThread(new AwS431S0200000_30(this, data, 76));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C13SB.LIZIZ(c20008813QoLJIILIIL);
            throw th;
        }
    }

    @Override // X.AbstractC20000013Ne
    public final void onCancel() {
        runOnMainThread(new AwS574S0100000_30(this, 293));
    }

    public final void LIZ(C1662010tLr c1662010tLr) {
        C13SS c13ss = C13SS.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Failed: ");
        sbLIZ.append(c1662010tLr);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c13ss.getClass();
        C13SS.LIZIZ("FetchPanelInfoCacheTask", strLIZIZ, null);
        runOnMainThread(new AwS431S0200000_30(this, c1662010tLr, 28));
    }

    public C13OG(C13RD c13rd, String str, String str2, boolean z, String str3, int i, int i2, int i3) {
        super(str2, null);
        this.LIZ = c13rd;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = z;
        this.LJ = str3;
        this.LJFF = i;
        this.LJI = i2;
        this.LJII = i3;
    }
}
