package X;

import Y.AObjectS245S0100000_22;
import android.app.Activity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import com.bytedance.als.LiveEvent;
import com.bytedance.als.h0;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.component.a;
import com.ss.android.ugc.aweme.tools.mvtemplate.core.TemplateCategoryData;
import com.ss.android.ugc.aweme.tools.mvtemplate.core.TemplateTabCacheAsset;
import com.ss.android.ugc.aweme.tools.mvtemplate.core.TemplateTabCacheData;
import com.ss.android.ugc.aweme.tools.mvtemplate.search.datasource.TemplateSearchNetApi;
import ge.i;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AFwS261S0000000_22;
import kotlin.jvm.internal.AwS19S0111000_22;
import kotlin.jvm.internal.AwS1S0110001_22;
import kotlin.jvm.internal.AwS231S0300000_22;
import kotlin.jvm.internal.AwS35S0001000_22;
import kotlin.jvm.internal.AwS35S0010000_22;
import kotlin.jvm.internal.AwS423S0200000_22;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS601S0100000_22;
import kotlin.jvm.internal.Intrinsics;
import nv7.c0;

/* JADX INFO: renamed from: X.0n8K, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1422980n8K extends i<InterfaceC1425500nCO, C1424590nAv, C1424470nAj, C1422210n75> implements InterfaceC1425500nCO {
    public static final C1423030n8P LLLII = new Object() { // from class: X.0n8P
    };
    public static final int LLLIIII = 8;
    public final C19A3 LLJILJILJ;
    public final boolean LLJILLL;
    public final C1DRG LLJJ;
    public final C1DRG LLJJI;
    public final ShortVideoContext LLJJIII;
    public final InterfaceC1422570n7f LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C0MGL LLJJIJIL;
    public final InterfaceC1648020szI LLJJJ;
    public final C01GW LLJJJIL;
    public final InterfaceC1422310n7F LLJJJJ;
    public final C01GW LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public boolean LLJJL;
    public final Map<TemplateCategoryData, Long> LLJJLIIIJLLLLLLLZ;
    public final C1423020n8O LLJL;
    public List<C1419590n2r> LLJLIL;
    public C1422960n8I LLJLILLLLZIIL;
    public final C01GW LLJLL;
    public final Function0<C1424470nAj> LLJLLIL;
    public final C560530Lyd<Unit> LLJLLL;
    public final C1422180n72 LLJZ;
    public final Function0<C1422210n75> LLJZIJLIL;
    public boolean LLL;
    public boolean LLLF;
    public InterfaceC524950KiL LLLFF;
    public final C1423000n8M LLLFFI;
    public final C1466570oGd LLLFZ;
    public View LLLI;

    @Override // X.InterfaceC1425500nCO
    public void QB2() {
        this.LLLF = true;
        i3(AFwS261S0000000_22.get$arr$(321));
    }

    private final void F4() {
        i3(AFwS261S0000000_22.get$arr$(320));
    }

    private final void N5() {
        List<TemplateCategoryData> listT;
        TemplateCategoryData next;
        List<C1419590n2r> listPE;
        InterfaceC1422570n7f interfaceC1422570n7f = this.LLJJIJI;
        if (interfaceC1422570n7f == null || (listT = interfaceC1422570n7f.t()) == null) {
            return;
        }
        Iterator<TemplateCategoryData> it2 = listT.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next.isDefault) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        TemplateCategoryData templateCategoryData = next;
        if ((templateCategoryData == null && (templateCategoryData = (TemplateCategoryData) C13LP.LJJJLL(listT)) == null) || (listPE = this.LLJJIJI.PE(templateCategoryData)) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (C1419590n2r c1419590n2r : listPE) {
            if (!c1419590n2r.LIZ.getBusiness_extra().is_pin()) {
                arrayList.add(c1419590n2r);
            }
        }
        Set<C1422430n7R> setPf0 = this.LLJJIJI.pf0();
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(setPf0, 10));
        Iterator<T> it3 = setPf0.iterator();
        while (it3.hasNext()) {
            arrayList2.add(((C1422430n7R) it3.next()).LIZIZ.LIZ.getAsset_id());
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList) {
            if (!arrayList2.contains(((C1419590n2r) obj).LIZ.getAsset_id())) {
                arrayList3.add(obj);
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : arrayList3) {
            C1419590n2r c1419590n2r2 = (C1419590n2r) obj2;
            if (hashSet.add(Integer.valueOf(c1419590n2r2.LIZJ + c1419590n2r2.LIZLLL))) {
                arrayList4.add(obj2);
            }
        }
        ArrayList<C1419590n2r> arrayList5 = new ArrayList(arrayList4);
        int iLIZ = C1337770kut.LIZ();
        C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MultiColTemplateUIComponent updateCacheData: assetList: size = ");
        sbLIZ.append(arrayList.size());
        sbLIZ.append(": ");
        sbLIZ.append(C13LP.LJJLIIIJ(arrayList, null, null, null, 0, null, AFwS261S0000000_22.get$arr$(324), 31));
        sbLIZ.append("\nunShownAssetList: size = ");
        sbLIZ.append(arrayList5.size());
        sbLIZ.append(": ");
        sbLIZ.append(C13LP.LJJLIIIJ(arrayList5, null, null, null, 0, null, AFwS261S0000000_22.get$arr$(325), 31));
        sbLIZ.append("\nshownAssetIdSet: size = ");
        sbLIZ.append(arrayList2.size());
        sbLIZ.append(": ");
        sbLIZ.append(C13LP.LJJLIIIJ(arrayList2, null, null, null, 0, null, null, 63));
        sbLIZ.append('\n');
        C201955140j.LIZJ(c1398350mUb, C2188811AlT.LIZIZ(sbLIZ));
        if (arrayList5.size() <= iLIZ) {
            int size = iLIZ - arrayList5.size();
            ArrayList arrayList6 = new ArrayList();
            for (Object obj3 : arrayList) {
                C1419590n2r c1419590n2r3 = (C1419590n2r) obj3;
                if (arrayList2.contains(c1419590n2r3.LIZ.getAsset_id())) {
                    ArrayList arrayList7 = new ArrayList(C15438062q.LJIJJ(arrayList5, 10));
                    for (C1419590n2r c1419590n2r4 : arrayList5) {
                        arrayList7.add(Integer.valueOf(c1419590n2r4.LIZJ + c1419590n2r4.LIZLLL));
                    }
                    if (!arrayList7.contains(Integer.valueOf(c1419590n2r3.LIZJ + c1419590n2r3.LIZLLL))) {
                        arrayList6.add(obj3);
                    }
                }
            }
            HashSet hashSet2 = new HashSet();
            ArrayList arrayList8 = new ArrayList();
            for (Object obj4 : arrayList6) {
                C1419590n2r c1419590n2r5 = (C1419590n2r) obj4;
                if (hashSet2.add(Integer.valueOf(c1419590n2r5.LIZJ + c1419590n2r5.LIZLLL))) {
                    arrayList8.add(obj4);
                }
            }
            if (size <= arrayList8.size()) {
                arrayList5.addAll(arrayList8.subList(0, size));
            } else {
                arrayList5.addAll(arrayList8);
            }
        }
        C201955140j.LIZJ(C1398350mUb.LIZIZ, "MultiColTemplateUIComponent updateCacheData: unShownAssetList: size = " + arrayList5.size() + ": " + C13LP.LJJLIIIJ(arrayList5, null, null, null, 0, null, AFwS261S0000000_22.get$arr$(326), 31) + "\ndefaultCategoryPinAssetList: size = " + this.LLJLIL.size() + ": " + C13LP.LJJLIIIJ(this.LLJLIL, null, null, null, 0, null, AFwS261S0000000_22.get$arr$(327), 31) + '\n');
        C1423020n8O c1423020n8O = this.LLJL;
        String str = templateCategoryData.key;
        ArrayList arrayList9 = new ArrayList(C15438062q.LJIJJ(arrayList5, 10));
        for (C1419590n2r c1419590n2r6 : arrayList5) {
            arrayList9.add(new TemplateTabCacheAsset(c1419590n2r6.LIZJ, c1419590n2r6.LIZLLL));
        }
        List<C1419590n2r> list = this.LLJLIL;
        ArrayList arrayList10 = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (C1419590n2r c1419590n2r7 : list) {
            arrayList10.add(new TemplateTabCacheAsset(c1419590n2r7.LIZJ, c1419590n2r7.LIZLLL));
        }
        c1423020n8O.getClass();
        C1398350mUb c1398350mUb2 = C1398350mUb.LIZIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("TemplateTabDataCacheKeva updateCache: categoryKey = ");
        sbLIZ2.append(str);
        sbLIZ2.append("\nassets = ");
        sbLIZ2.append(C13LP.LJJLIIIJ(arrayList9, null, null, null, 0, null, AFwS261S0000000_22.get$arr$(334), 31));
        sbLIZ2.append("\npinAssets = ");
        sbLIZ2.append(C13LP.LJJLIIIJ(arrayList10, null, null, null, 0, null, AFwS261S0000000_22.get$arr$(335), 31));
        C201955140j.LIZJ(c1398350mUb2, C2188811AlT.LIZIZ(sbLIZ2));
        c1423020n8O.LIZ.storeString(str, GsonProtectorUtils.toJson(C7740030o.LIZ().getGson(), new TemplateTabCacheData(arrayList9, arrayList10, System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT))));
    }

    private final InterfaceC1422770n7z P4() {
        return (InterfaceC1422770n7z) this.LLJJJIL.getValue();
    }

    private final a getPlanCUIApiComponent() {
        return (a) this.LLJJIJIIJIL.getValue();
    }

    private final boolean k5() {
        return ((Boolean) this.LLJLL.getValue()).booleanValue();
    }

    @Override // X.InterfaceC1425500nCO
    public void Ax1() {
        i3(AFwS261S0000000_22.get$arr$(323));
    }

    public final void E5() {
        if (this.LLLF) {
            return;
        }
        i3(new AwS35S0001000_22(C497820Jfg.LIZJ(C0CHQ.LIZ), 30));
        if (!C1462920oAk.LIZLLL()) {
            i3(new AwS35S0001000_22(C0LEO.LIZIZ(), 32));
            return;
        }
        c0.LIZ.getClass();
        C1660590tJZ c1660590tJZ = c0.LJFF;
        if (c1660590tJZ != null) {
            i3(new AwS35S0001000_22(C1660590tJZ.LJFF() + c1660590tJZ.LIZIZ(), 31));
        }
    }

    public final void K4() {
        C0L0E c0l0e = C0L0E.LIZ;
        Activity activityRequireActivity = this.LLJILJILJ.requireActivity();
        ShortVideoContext shortVideoContext = this.LLJJIII;
        C19A3 c19a3 = this.LLJILJILJ;
        c0l0e.getClass();
        C0L0E.LIZ(activityRequireActivity, shortVideoContext, c19a3);
        C1419580n2q c1419580n2q = C1419580n2q.LIZ;
        ShortVideoContext shortVideoContext2 = this.LLJJIII;
        c1419580n2q.getClass();
        C1419580n2q.LIZ(shortVideoContext2);
    }

    @Override // X.InterfaceC1425500nCO
    public void LJJJJLI() {
        i3(AFwS261S0000000_22.get$arr$(322));
    }

    public final InterfaceC1422590n7h T4() {
        return (InterfaceC1422590n7h) this.LLJJJJJIL.getValue();
    }

    @Override // ge.i, X.InterfaceC1455500nym
    public void show() {
        List<TemplateCategoryData> listT;
        InterfaceC524950KiL interfaceC524950KiL;
        this.LLJJLIIIJLLLLLLLZ.put(null, Long.valueOf(System.currentTimeMillis()));
        if (T2().LJIILL != EnumC994860bzo.EDITOR_TAB && (interfaceC524950KiL = this.LLLFF) != null) {
            interfaceC524950KiL.kF(this.LLLFFI);
        }
        d5();
        super.show();
        InterfaceC1422570n7f interfaceC1422570n7f = this.LLJJIJI;
        if (interfaceC1422570n7f == null || (listT = interfaceC1422570n7f.t()) == null || !listT.isEmpty() || this.LLJJIJI.yG1()) {
            return;
        }
        F4();
        this.LLJJIJI.zp1(false, this.LLJJIII.creativeModel.templateSchemaData.landingSubTab, C1337770kut.LIZ(), false, null);
    }

    public final void t5() {
        this.LLJLLL.LJIIJ(Unit.LIZ);
    }

    private final boolean CJ1() {
        C385670FAf<C443120HZe<Boolean, C1419590n2r, Float>> c385670FAfQx1;
        C443120HZe<Boolean, C1419590n2r, Float> c443120HZeLIZJ;
        InterfaceC1422770n7z interfaceC1422770n7zP4 = P4();
        return (interfaceC1422770n7zP4 == null || (c385670FAfQx1 = interfaceC1422770n7zP4.qx1()) == null || (c443120HZeLIZJ = c385670FAfQx1.LIZJ()) == null || !c443120HZeLIZJ.getFirst().booleanValue()) ? false : true;
    }

    private final void Z4() {
        C1422960n8I c1422960n8I;
        InterfaceC816210W0d<TemplateSearchNetApi> interfaceC816210W0dUA;
        InterfaceC1422570n7f interfaceC1422570n7f;
        if (k5() && this.LLJLILLLLZIIL == null) {
            InterfaceC1422570n7f interfaceC1422570n7f2 = this.LLJJIJI;
            this.LLJLILLLLZIIL = interfaceC1422570n7f2 != null ? interfaceC1422570n7f2.AB1() : null;
            InterfaceC1422590n7h interfaceC1422590n7hT4 = T4();
            if (interfaceC1422590n7hT4 != null && (interfaceC816210W0dUA = interfaceC1422590n7hT4.UA()) != null && (interfaceC1422570n7f = this.LLJJIJI) != null) {
                interfaceC1422570n7f.mO2(interfaceC816210W0dUA);
            }
            if (C298960Bni.LIZ() || (c1422960n8I = this.LLJLILLLLZIIL) == null) {
                return;
            }
            int i = c1422960n8I.LJII + 1;
            c1422960n8I.LJII = i;
            if (i == 1) {
                c1422960n8I.LIZ();
            }
        }
    }

    private final void registerObservers() {
        h0 h0Var;
        LiveEvent<Integer> liveEventCX0;
        C385670FAf<C443120HZe<Boolean, C1419590n2r, Float>> c385670FAfQx1;
        C385670FAf<C1419590n2r> c385670FAfVO1;
        LiveEvent<C1422880n8A> liveEventWo;
        C385670FAf<TemplateCategoryData> c385670FAfHv;
        C385670FAf<Map<TemplateCategoryData, Pair<C1422890n8B, List<C1419590n2r>>>> c385670FAfJb2;
        C385670FAf<List<TemplateCategoryData>> c385670FAfXe;
        C385670FAf<Boolean> c385670FAfVa;
        a planCUIApiComponent = getPlanCUIApiComponent();
        if (planCUIApiComponent != null && (c385670FAfVa = planCUIApiComponent.va()) != null) {
            c385670FAfVa.LIZ(this, new AObjectS245S0100000_22(this, 278));
        }
        InterfaceC1422570n7f interfaceC1422570n7f = this.LLJJIJI;
        if (interfaceC1422570n7f != null && (c385670FAfXe = interfaceC1422570n7f.xe()) != null) {
            c385670FAfXe.LIZ(this, new AObjectS245S0100000_22(this, 279));
        }
        InterfaceC1422570n7f interfaceC1422570n7f2 = this.LLJJIJI;
        if (interfaceC1422570n7f2 != null && (c385670FAfJb2 = interfaceC1422570n7f2.Jb2()) != null) {
            c385670FAfJb2.LIZ(this, new InterfaceC1441305kZ() { // from class: X.0n4f
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    C1422890n8B c1422890n8B;
                    List list;
                    Map map = (Map) obj;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : map.entrySet()) {
                        if (((TemplateCategoryData) entry.getKey()).isDefault) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    ArrayList arrayList = new ArrayList(linkedHashMap.size());
                    Iterator it2 = linkedHashMap.entrySet().iterator();
                    while (it2.hasNext()) {
                        arrayList.add(((Map.Entry) it2.next()).getValue());
                    }
                    Pair pair = (Pair) C13LP.LJJJLL(arrayList);
                    if (pair != null) {
                        c1422890n8B = (C1422890n8B) pair.getFirst();
                    } else {
                        c1422890n8B = null;
                    }
                    if (c1422890n8B != null && (c1422890n8B.LIZJ || c1422890n8B.LJ)) {
                        this.LL.LLJJL = true;
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    for (Map.Entry entry2 : map.entrySet()) {
                        if (((TemplateCategoryData) entry2.getKey()).isDefault) {
                            linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(linkedHashMap2.size());
                    Iterator it3 = linkedHashMap2.entrySet().iterator();
                    while (it3.hasNext()) {
                        arrayList2.add(((Map.Entry) it3.next()).getValue());
                    }
                    Pair pair2 = (Pair) C13LP.LJJJLL(arrayList2);
                    if (pair2 != null && (list = (List) pair2.getSecond()) != null) {
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj2 : list) {
                            C1419590n2r c1419590n2r = (C1419590n2r) obj2;
                            if (c1419590n2r.LIZJ == 0 && c1419590n2r.LIZ.getBusiness_extra().is_pin()) {
                                arrayList3.add(obj2);
                            }
                        }
                        C1422980n8K c1422980n8K = this.LL;
                        if (!arrayList3.isEmpty()) {
                            HashSet hashSet = new HashSet();
                            ArrayList arrayList4 = new ArrayList();
                            for (Object obj3 : arrayList3) {
                                if (hashSet.add(Integer.valueOf(((C1419590n2r) obj3).LIZLLL))) {
                                    arrayList4.add(obj3);
                                }
                            }
                            c1422980n8K.LLJLIL = arrayList4;
                        }
                    }
                    C01TT.LIZLLL(new AwS423S0200000_22(this.LL, (C1422980n8K) map, (Map<TemplateCategoryData, ? extends Pair<C1422890n8B, ? extends List<C1419590n2r>>>) 102));
                }
            });
        }
        InterfaceC1422570n7f interfaceC1422570n7f3 = this.LLJJIJI;
        if (interfaceC1422570n7f3 != null && (c385670FAfHv = interfaceC1422570n7f3.Hv()) != null) {
            c385670FAfHv.LIZ(this, new AObjectS245S0100000_22(this, 280));
        }
        InterfaceC1422570n7f interfaceC1422570n7f4 = this.LLJJIJI;
        if (interfaceC1422570n7f4 != null && (liveEventWo = interfaceC1422570n7f4.wo()) != null) {
            liveEventWo.LJII(this, Lifecycle.State.RESUMED, new AObjectS245S0100000_22(this, 281));
        }
        InterfaceC1422570n7f interfaceC1422570n7f5 = this.LLJJIJI;
        if (interfaceC1422570n7f5 != null && (c385670FAfVO1 = interfaceC1422570n7f5.vO1()) != null) {
            c385670FAfVO1.LIZ(this, new AObjectS245S0100000_22(this, 282));
        }
        InterfaceC1422770n7z interfaceC1422770n7zP4 = P4();
        if (interfaceC1422770n7zP4 != null && (c385670FAfQx1 = interfaceC1422770n7zP4.qx1()) != null) {
            c385670FAfQx1.LIZ(this, new AObjectS245S0100000_22(this, 283));
        }
        InterfaceC1422570n7f interfaceC1422570n7f6 = this.LLJJIJI;
        if (interfaceC1422570n7f6 != null && (liveEventCX0 = interfaceC1422570n7f6.CX0()) != null) {
            liveEventCX0.LJII(this, Lifecycle.State.RESUMED, new AObjectS245S0100000_22(this, 284));
        }
        C1422960n8I c1422960n8I = this.LLJLILLLLZIIL;
        if (c1422960n8I == null || (h0Var = c1422960n8I.LJ) == null) {
            return;
        }
        h0Var.LIZ(this, new AObjectS245S0100000_22(this, 277));
    }

    public final void H5() {
        F4();
        InterfaceC1422570n7f interfaceC1422570n7f = this.LLJJIJI;
        if (interfaceC1422570n7f != null) {
            interfaceC1422570n7f.zp1(false, this.LLJJIII.creativeModel.templateSchemaData.landingSubTab, C1337770kut.LIZ(), true, null);
        }
    }

    @Override // ge.i, X.InterfaceC1455500nym
    public void hide() {
        super.hide();
        InterfaceC524950KiL interfaceC524950KiL = this.LLLFF;
        if (interfaceC524950KiL != null) {
            interfaceC524950KiL.b8(this.LLLFFI);
        }
    }

    @Override // ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        this.LLLFF = C0MWZ.LIZ(this.LLJILJILJ);
        Z4();
        registerObservers();
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        C1422960n8I c1422960n8I;
        int i;
        super.onDestroy();
        if (!k5() || C298960Bni.LIZ() || (c1422960n8I = this.LLJLILLLLZIIL) == null || (i = c1422960n8I.LJII) <= 0) {
            return;
        }
        int i2 = i - 1;
        c1422960n8I.LJII = i2;
        if (i2 == 0) {
            AnonymousClass0956 anonymousClass0956 = c1422960n8I.LJI;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            c1422960n8I.LJI = null;
            h0<C1422970n8J> h0Var = c1422960n8I.LIZLLL;
            C1422970n8J c1422970n8JLIZJ = h0Var.LIZJ();
            h0Var.LJFF(new C1422970n8J(c1422970n8JLIZJ.LIZIZ, c1422970n8JLIZJ.LIZJ, null, c1422970n8JLIZJ.LJFF, false, c1422970n8JLIZJ.LIZ));
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onPause() {
        super.onPause();
        if (((Boolean) C283150B7x.LIZ.getValue()).booleanValue()) {
            N5();
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onResume() {
        InterfaceC816210W0d<TemplateSearchNetApi> interfaceC816210W0dUA;
        InterfaceC1422570n7f interfaceC1422570n7f;
        super.onResume();
        InterfaceC1422590n7h interfaceC1422590n7hT4 = T4();
        if (interfaceC1422590n7hT4 == null || (interfaceC816210W0dUA = interfaceC1422590n7hT4.UA()) == null || (interfaceC1422570n7f = this.LLJJIJI) == null) {
            return;
        }
        interfaceC1422570n7f.mO2(interfaceC816210W0dUA);
    }

    private final void d5() {
        E5();
    }

    public C560530Lyd<Unit> O4() {
        return this.LLJLLL;
    }

    @Override // X.InterfaceC1425500nCO
    public /* bridge */ /* synthetic */ LiveEvent Un() {
        return this.LLJLLL;
    }

    @Override // X.InterfaceC1425500nCO
    public void jd() {
        K4();
    }

    @Override // X.InterfaceC1425500nCO
    public View ks1() {
        return this.LLLI;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C1424470nAj> o2() {
        return this.LLJLLIL;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C1422210n75> w2() {
        return this.LLJZIJLIL;
    }

    public final void C5(View view) {
        this.LLLI = view;
    }

    @Override // X.InterfaceC1425500nCO
    public void DM2(boolean z) {
        i3(new AwS35S0010000_22(z, 32));
    }

    public final void H4(TemplateCategoryData templateCategoryData) {
        i3(new AwS601S0100000_22(templateCategoryData, 819));
    }

    public final void Il2(String str) {
        String strLIZ;
        InterfaceC1648020szI interfaceC1648020szI = this.LLJJJ;
        if (interfaceC1648020szI != null && (strLIZ = C1428460nHA.LIZ(interfaceC1648020szI)) != null && (C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_normal_enter_template_tab", true) == 2 || C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_normal_enter_template_tab", true) == 1 || Intrinsics.LJFF(this.LLJJIII.creativeModel.templateSchemaData.templateBackCamera, "1"))) {
            this.LLJJJ.setCurrentTab(strLIZ, true, 0, true);
            return;
        }
        C0MGL c0mgl = this.LLJJIJIL;
        if (c0mgl != null) {
            c0mgl.yp0(str, System.currentTimeMillis());
        }
    }

    @Override // X.InterfaceC1425500nCO
    public void Yj1(C1424830nBJ c1424830nBJ) {
        i3(new AwS601S0100000_22(c1424830nBJ, 820));
    }

    @Override // X.InterfaceC1425500nCO
    public void fJ(boolean z) {
        i3(new AwS35S0010000_22(z, 33));
    }

    @Override // X.InterfaceC1425500nCO
    public void hK0(boolean z) {
        i3(new AwS35S0010000_22(z, 31));
    }

    @Override // X.InterfaceC1425500nCO
    public void mX0(boolean z) {
        D5(4, z);
    }

    public final void n5(TemplateCategoryData templateCategoryData) {
        this.LLJJLIIIJLLLLLLLZ.put(templateCategoryData, Long.valueOf(System.currentTimeMillis()));
        i3(new AwS601S0100000_22(templateCategoryData, 821));
        InterfaceC1422570n7f interfaceC1422570n7f = this.LLJJIJI;
        if (interfaceC1422570n7f != null) {
            List<TemplateCategoryData> listT = interfaceC1422570n7f.t();
            Iterator<TemplateCategoryData> it2 = listT.iterator();
            int i = 0;
            while (it2.hasNext()) {
                if (Intrinsics.LJFF(it2.next(), templateCategoryData)) {
                    if (i >= 0 && i < listT.size()) {
                        if ((!templateCategoryData.isDefault || !interfaceC1422570n7f.yG1()) && interfaceC1422570n7f.s92(templateCategoryData, false, false, false, 0, C1337770kut.LIZ())) {
                            ShortVideoContext shortVideoContext = this.LLJJIII;
                            C1419580n2q.LJIILL("initialize", templateCategoryData, shortVideoContext.shootWay, shortVideoContext.getCreationId(), false);
                            H4(templateCategoryData);
                        }
                        String str = this.LLJJIII.creativeModel.templateSchemaData.landingSubTab;
                        if (str == null || str.length() == 0) {
                            if (i > 0) {
                                TemplateCategoryData templateCategoryData2 = (TemplateCategoryData) ListProtector.get(listT, i - 1);
                                if ((!templateCategoryData2.isDefault || !interfaceC1422570n7f.yG1()) && interfaceC1422570n7f.s92(templateCategoryData2, false, false, true, 0, C1337770kut.LIZ())) {
                                    ShortVideoContext shortVideoContext2 = this.LLJJIII;
                                    C1419580n2q.LJIILL("initialize", templateCategoryData2, shortVideoContext2.shootWay, shortVideoContext2.getCreationId(), true);
                                    H4(templateCategoryData2);
                                }
                            }
                            int i2 = i + 1;
                            if (i2 < listT.size()) {
                                TemplateCategoryData templateCategoryData3 = (TemplateCategoryData) ListProtector.get(listT, i2);
                                if ((!templateCategoryData3.isDefault || !interfaceC1422570n7f.yG1()) && interfaceC1422570n7f.s92(templateCategoryData3, false, false, true, 0, C1337770kut.LIZ())) {
                                    ShortVideoContext shortVideoContext3 = this.LLJJIII;
                                    C1419580n2q.LJIILL("initialize", templateCategoryData3, shortVideoContext3.shootWay, shortVideoContext3.getCreationId(), true);
                                    H4(templateCategoryData3);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                i++;
            }
        }
    }

    @Override // X.InterfaceC1425500nCO
    public void vX0(C16FB c16fb) {
        i3(new AwS601S0100000_22(c16fb, 818));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x5(com.ss.android.ugc.aweme.tools.mvtemplate.core.TemplateCategoryData r5) {
        /*
            r4 = this;
            if (r5 != 0) goto L23
            X.0n7f r0 = r4.LLJJIJI
            if (r0 == 0) goto L2a
            boolean r0 = r0.dy2()
            r3 = 1
            if (r0 != r3) goto L2a
        Ld:
            X.0n72 r2 = r4.LLJZ
            java.util.Map<com.ss.android.ugc.aweme.tools.mvtemplate.core.TemplateCategoryData, java.lang.Long> r0 = r2.LJ
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            java.lang.Object r0 = r0.get(r5)
            if (r0 == 0) goto L22
            kotlin.jvm.internal.AwS73S0210000_22 r1 = new kotlin.jvm.internal.AwS73S0210000_22
            r0 = 4
            r1.<init>(r2, r5, r3, r0)
            r2.LJFF(r1)
        L22:
            return
        L23:
            boolean r0 = r5.isDefault
            if (r0 == 0) goto L2a
            boolean r3 = r4.LLJJL
            goto Ld
        L2a:
            r3 = 0
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1422980n8K.x5(com.ss.android.ugc.aweme.tools.mvtemplate.core.TemplateCategoryData):void");
    }

    public final void D5(int i, boolean z) {
        C1422480n7W c1422480n7W = C1422480n7W.LIZ;
        ShortVideoContext shortVideoContext = this.LLJJIII;
        c1422480n7W.getClass();
        C1422480n7W.LIZJ(shortVideoContext, z, i);
        InterfaceC1422590n7h interfaceC1422590n7hT4 = T4();
        if (interfaceC1422590n7hT4 != null) {
            interfaceC1422590n7hT4.qp1(null, new AwS601S0100000_22(this, 822), new AwS19S0111000_22(this, z, i, 1));
        }
    }

    public final void M5(TemplateCategoryData templateCategoryData, String str) {
        TemplateCategoryData templateCategoryDataY8;
        if (templateCategoryData == null) {
            return;
        }
        InterfaceC1422570n7f interfaceC1422570n7f = this.LLJJIJI;
        if (interfaceC1422570n7f != null && (templateCategoryDataY8 = interfaceC1422570n7f.Y8()) != null) {
            C1419580n2q c1419580n2q = C1419580n2q.LIZ;
            ShortVideoContext shortVideoContext = this.LLJJIII;
            c1419580n2q.getClass();
            C1419580n2q.LIZIZ(shortVideoContext, templateCategoryDataY8, templateCategoryData, str);
        }
        InterfaceC1422570n7f interfaceC1422570n7f2 = this.LLJJIJI;
        if (interfaceC1422570n7f2 != null && interfaceC1422570n7f2.t().contains(templateCategoryData)) {
            interfaceC1422570n7f2.pG1(templateCategoryData);
        }
    }

    @Override // X.InterfaceC1425500nCO
    public void s52(float f, int i) {
        i3(new C1422990n8L(f, i));
    }

    @Override // X.InterfaceC1425500nCO
    public void gc2(EnumC994860bzo enumC994860bzo, Pair<? extends FrameLayout, ? extends SmartImageView> pair, C1424760nBC c1424760nBC) {
        i3(new AwS231S0300000_22(enumC994860bzo, pair, c1424760nBC, 36));
    }

    public final void v5(boolean z, C1419590n2r c1419590n2r, float f) {
        InterfaceC524950KiL interfaceC524950KiL;
        i3(new AwS1S0110001_22(z, c1419590n2r, f, 1));
        if (z) {
            InterfaceC524950KiL interfaceC524950KiL2 = this.LLLFF;
            if (interfaceC524950KiL2 != null) {
                interfaceC524950KiL2.b8(this.LLLFFI);
                return;
            }
            return;
        }
        if (c1419590n2r == null || T2().LJIILL == EnumC994860bzo.EDITOR_TAB || (interfaceC524950KiL = this.LLLFF) == null) {
            return;
        }
        interfaceC524950KiL.kF(this.LLLFFI);
    }

    /* JADX WARN: Type inference failed for: r0v26, types: [X.0n8M] */
    public C1422980n8K(C19A3 c19a3, boolean z, C1DRG c1drg, C1DRG c1drg2, ShortVideoContext shortVideoContext) {
        super(c19a3);
        this.LLJILJILJ = c19a3;
        this.LLJILLL = z;
        this.LLJJ = c1drg;
        this.LLJJI = c1drg2;
        this.LLJJIII = shortVideoContext;
        InterfaceC1422570n7f interfaceC1422570n7f = (InterfaceC1422570n7f) c1drg.LJIIL(null, InterfaceC1422570n7f.class);
        if (interfaceC1422570n7f == null) {
            if (c1drg2 != null) {
                interfaceC1422570n7f = (InterfaceC1422570n7f) c1drg2.LJIIL(null, InterfaceC1422570n7f.class);
            } else {
                interfaceC1422570n7f = null;
            }
        }
        this.LLJJIJI = interfaceC1422570n7f;
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 1027));
        C0MGL c0mgl = (C0MGL) c1drg.LJIIL(null, C0MGL.class);
        if (c0mgl == null) {
            if (c1drg2 != null) {
                c0mgl = (C0MGL) c1drg2.LJIIL(null, C0MGL.class);
            } else {
                c0mgl = null;
            }
        }
        this.LLJJIJIL = c0mgl;
        InterfaceC1648020szI interfaceC1648020szI = (InterfaceC1648020szI) c1drg.LJIIL(null, InterfaceC1648020szI.class);
        if (interfaceC1648020szI == null) {
            if (c1drg2 != null) {
                interfaceC1648020szI = (InterfaceC1648020szI) c1drg2.LJIIL(null, InterfaceC1648020szI.class);
            } else {
                interfaceC1648020szI = null;
            }
        }
        this.LLJJJ = interfaceC1648020szI;
        this.LLJJJIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 1025));
        InterfaceC1422310n7F interfaceC1422310n7F = c1drg2 != null ? (InterfaceC1422310n7F) c1drg2.LJIIL(null, InterfaceC1422310n7F.class) : null;
        this.LLJJJJ = interfaceC1422310n7F;
        this.LLJJJJJIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 1026));
        this.LLJJJJLIIL = true;
        this.LLJJLIIIJLLLLLLLZ = new LinkedHashMap();
        this.LLJL = new C1423020n8O();
        this.LLJLIL = C13BV.INSTANCE;
        this.LLJLL = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(453));
        this.LLJLLIL = new AwS566S0100000_22(this, 1022);
        this.LLJLLL = new C560530Lyd<>();
        this.LLJZ = new C1422180n72(interfaceC1422570n7f, P4(), interfaceC1422310n7F, new AwS566S0100000_22(this, 1024));
        this.LLJZIJLIL = new AwS566S0100000_22(this, 1023);
        this.LLLFFI = new InterfaceC362610EJn() { // from class: X.0n8M
            @Override // X.InterfaceC362610EJn
            public final boolean onKeyDown(int i, KeyEvent keyEvent) {
                InterfaceC1422590n7h interfaceC1422590n7hT4;
                if (i != 4 || ((interfaceC1422590n7hT4 = this.LL.T4()) != null && interfaceC1422590n7hT4.zM1())) {
                    return false;
                }
                C1422980n8K c1422980n8K = this.LL;
                View view = c1422980n8K.LLJILJILJ.mView;
                if (view != null) {
                    c1422980n8K.LLLFZ.onClick(view);
                }
                return true;
            }
        };
        this.LLLFZ = new C1466570oGd(this, 31);
    }
}
