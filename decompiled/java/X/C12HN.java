package X;

import android.util.Log;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.ss.android.ugc.aweme.beauty.ComposerBeautyExtra;
import com.ss.android.ugc.aweme.beauty.ComposerBeautyExtraBeautify;
import com.ss.android.ugc.aweme.dependence.beauty.data.BeautifyInfo;
import com.ss.android.ugc.aweme.dependence.beauty.data.BeautyComposerInfo;
import com.ss.android.ugc.aweme.dependence.beauty.data.ComposerBeautyBuriedInfo;
import com.ss.android.ugc.aweme.dependence.beauty.data.MBeautyStateInfo;
import com.ss.android.ugc.aweme.dependence.beauty.utils.SafeMutableLiveData;
import com.ss.android.ugc.aweme.discover.model.Banner;
import com.ss.android.ugc.aweme.shortvideo.beauty.BeautifyUesTabInfo;
import com.ss.android.ugc.aweme.shortvideo.beauty.BeautifyUsedInfo;
import com.ss.android.ugc.aweme.shortvideo.beauty.BeautyMetadata;
import com.ss.android.ugc.aweme.tools.beauty.BeautyCategory;
import com.ss.android.ugc.aweme.tools.beauty.BeautyCategoryExtra;
import com.ss.android.ugc.aweme.tools.beauty.env.BeautyContext;
import com.ss.android.ugc.aweme.tools.beauty.service.BeautyFilterConfig;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AwS124S0400000_29;
import kotlin.jvm.internal.AwS145S0110000_29;
import kotlin.jvm.internal.AwS157S0400000_29;
import kotlin.jvm.internal.AwS430S0200000_29;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.12HN, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12HN implements C12I9 {
    public final C12HT LIZ;
    public final BeautyFilterConfig LIZIZ;
    public final Gson LIZJ;
    public Function1<? super Boolean, Unit> LIZLLL;
    public String LJ;
    public final C19729912Hh LJFF = new C19729912Hh();
    public volatile List<BeautyCategory> LJI = new ArrayList();
    public final SafeMutableLiveData<Boolean> LJII = new SafeMutableLiveData<>();
    public final SafeMutableLiveData<Boolean> LJIIIIZZ = new SafeMutableLiveData<>();
    public final SafeMutableLiveData<List<BeautyComposerInfo>> LJIIIZ = new SafeMutableLiveData<>();
    public final C12HU<BeautyComposerInfo> LJIIJ = new C12HU<>();
    public final C560530Lyd<ArrayList<BeautyComposerInfo>> LJIIJJI = new C560530Lyd<>();
    public final Map<String, C12HU<BeautyComposerInfo>> LJIIL = new LinkedHashMap();
    public final C01GW LJIILIIL;
    public final SafeMutableLiveData<List<ComposerBeauty>> LJIILJJIL;
    public final C19570611hY LJIILL;
    public C12JP LJIILLIIL;
    public final SafeMutableLiveData<Integer> LJIIZILJ;
    public final SafeMutableLiveData<Map<String, Integer>> LJIJ;
    public final SafeMutableLiveData<C1499920p8Q<ComposerBeauty>> LJIJI;
    public C12H6 LJIJJ;
    public final List<BeautifyUesTabInfo> LJIJJLI;
    public final C01GW LJIL;
    public final C01GW LJJ;
    public final C01GW LJJI;
    public final C19729312Hb LJJIFFI;
    public final C19730612Ho LJJII;
    public boolean LJJIII;
    public final C054G LJJIIJ;
    public EnumC19731112Ht LJJIIJZLJL;
    public List<BeautyCategory> LJJIIZ;
    public boolean LJJIIZI;
    public final SafeMutableLiveData<List<BeautyComposerInfo>> LJJIJ;
    public final C12HH LJJIJIIJI;

    @Override // X.C12I9
    public final synchronized void Be() {
        if (C306770C0t.LIZ()) {
            LJJIIZI(false, true);
        } else {
            LJJIIZI(false, false);
        }
    }

    @Override // X.C12I9
    public final void Re() {
    }

    @Override // X.C12I9
    public final void Ue() {
    }

    @Override // X.C12I9
    public final void kf() {
        this.LJIILLIIL = null;
    }

    @Override // X.C12I9
    public final void qe() {
    }

    @Override // X.C12I9
    public final void ze() {
    }

    @Override // X.C12I9
    public final String Ae() {
        String str = this.LJ;
        return str == null ? "" : str;
    }

    @Override // X.C12I9
    public final void Ce() {
        boolean z;
        C013C c013c = new C013C();
        List<BeautyCategory> list = this.LJI;
        ArrayList arrayList = new ArrayList();
        for (BeautyCategory beautyCategory : list) {
            if (beautyCategory.getBeautyCategoryExtra().exclusive) {
                arrayList.add(beautyCategory);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            z = true;
            if (!it2.hasNext()) {
                break;
            }
            if (((ComposerBeauty) C13LP.LJJJLL(((BeautyCategory) it2.next()).getBeautyList())) != null) {
                c013c.element = !r0.getSelected();
            }
        }
        boolean z2 = c013c.element;
        C013C c013c2 = new C013C();
        Iterator<BeautyCategory> it3 = this.LJI.iterator();
        while (it3.hasNext()) {
            List<ComposerBeauty> beautyList = it3.next().getBeautyList();
            ArrayList arrayList2 = new ArrayList();
            for (ComposerBeauty composerBeauty : beautyList) {
                ComposerBeauty composerBeauty2 = composerBeauty;
                if (composerBeauty2.isCollectionType() && composerBeauty2.getEnable()) {
                    arrayList2.add(composerBeauty);
                }
            }
            Iterator it4 = arrayList2.iterator();
            while (it4.hasNext()) {
                List<ComposerBeauty> childList = ((ComposerBeauty) it4.next()).getChildList();
                if (childList != null) {
                    for (ComposerBeauty composerBeauty3 : childList) {
                        if (!c013c2.element && composerBeauty3.getProgressValue() != 0 && composerBeauty3.getEnable() && composerBeauty3.getSelected() && !composerBeauty3.getExtra().isNone()) {
                            c013c2.element = true;
                        }
                    }
                }
            }
        }
        boolean z3 = c013c2.element;
        Iterator<BeautyCategory> it5 = this.LJI.iterator();
        boolean z4 = false;
        while (it5.hasNext()) {
            for (ComposerBeauty composerBeauty4 : it5.next().getBeautyList()) {
                if (composerBeauty4.isBeautyMode()) {
                    List<ComposerBeauty> childList2 = composerBeauty4.getChildList();
                    if (childList2 != null) {
                        Iterator<ComposerBeauty> it6 = childList2.iterator();
                        boolean z5 = false;
                        while (it6.hasNext()) {
                            if (LJIIIIZZ(it6.next())) {
                                z5 = true;
                            }
                        }
                        if (z5) {
                            z4 = true;
                        }
                    }
                } else if (LJIIIIZZ(composerBeauty4)) {
                    z4 = true;
                }
            }
        }
        if (!z2 && ((!z3 && !z4) || !LIZIZ())) {
            z = false;
        }
        C0CNO.LIZLLL(0L, new AwS145S0110000_29(z, this, 5));
    }

    @Override // X.C12I9
    public final void Ie() {
        Iterator<BeautyCategory> it2 = this.LJI.iterator();
        while (it2.hasNext()) {
            for (ComposerBeauty composerBeauty : it2.next().getBeautyList()) {
                composerBeauty.setEnable(true);
                if (composerBeauty.isBeautyMode()) {
                    List<ComposerBeauty> childList = composerBeauty.getChildList();
                    if (childList != null) {
                        Iterator<ComposerBeauty> it3 = childList.iterator();
                        while (it3.hasNext()) {
                            it3.next();
                            LJIL(composerBeauty, this);
                        }
                    }
                } else {
                    LJIL(composerBeauty, this);
                }
            }
        }
    }

    @Override // X.C12I9
    public final MBeautyStateInfo Ke() {
        BeautyContext beautyContext = BeautyContext.INSTANCE;
        if (beautyContext.useMInstantBeauty()) {
            return new MBeautyStateInfo(beautyContext.getBeautificationMode() == 1 ? 1 : 0, 1);
        }
        return new MBeautyStateInfo(0, 0);
    }

    @Override // X.C12I9
    public final boolean LIZIZ() {
        return this.LIZ.LIZIZ();
    }

    @Override // X.C12I9
    public final BeautyCategory LIZJ() {
        BeautyCategory next;
        Iterator<BeautyCategory> it2 = this.LJI.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (a0.LJJIIZI(next.getCategoryResponse().getKey(), "beauty", false)) {
                break;
            }
        }
        return next;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00ab A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0039 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C12HU<com.ss.android.ugc.aweme.dependence.beauty.data.BeautyComposerInfo> LJIIJ() {
        /*
            r11 = this;
            java.util.List<com.ss.android.ugc.aweme.tools.beauty.BeautyCategory> r0 = r11.LJI
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r3 = r0.iterator()
        Lb:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L2e
            java.lang.Object r2 = r3.next()
            r0 = r2
            com.ss.android.ugc.aweme.tools.beauty.BeautyCategory r0 = (com.ss.android.ugc.aweme.tools.beauty.BeautyCategory) r0
            com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse r0 = r0.getCategoryResponse()
            java.lang.String r1 = r0.getId()
            com.ss.android.ugc.aweme.tools.beauty.service.BeautyFilterConfig r0 = r11.LIZIZ
            boolean r0 = r0.beautySwitchStatus
            boolean r0 = r11.oe(r1, r0)
            if (r0 == 0) goto Lb
            r5.add(r2)
            goto Lb
        L2e:
            X.12HU r4 = new X.12HU
            r4.<init>()
            X.12HU<com.ss.android.ugc.aweme.dependence.beauty.data.BeautyComposerInfo> r0 = r11.LJIIJ
            java.util.Iterator r10 = r0.iterator()
        L39:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto Lc6
            java.lang.Object r3 = r10.next()
            r6 = r3
            com.ss.android.ugc.aweme.dependence.beauty.data.BeautyComposerInfo r6 = (com.ss.android.ugc.aweme.dependence.beauty.data.BeautyComposerInfo) r6
            java.lang.String r1 = r6.nodePath
            java.lang.String r0 = "EFFECT_ID_TYPE_FILTER"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto Lab
            java.util.Iterator r9 = r5.iterator()
        L54:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L39
            java.lang.Object r0 = r9.next()
            com.ss.android.ugc.aweme.tools.beauty.BeautyCategory r0 = (com.ss.android.ugc.aweme.tools.beauty.BeautyCategory) r0
            java.util.List r0 = r0.getBeautyList()
            java.util.Iterator r8 = r0.iterator()
        L68:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L54
            java.lang.Object r2 = r8.next()
            com.ss.android.ugc.aweme.beauty.ComposerBeauty r2 = (com.ss.android.ugc.aweme.beauty.ComposerBeauty) r2
            boolean r0 = r2.isCollectionType()
            if (r0 == 0) goto Lb1
            java.util.List r0 = r2.getChildList()
            if (r0 == 0) goto L68
            java.util.Iterator r7 = r0.iterator()
        L84:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto Laf
            java.lang.Object r2 = r7.next()
            r0 = r2
            com.ss.android.ugc.aweme.beauty.ComposerBeauty r0 = (com.ss.android.ugc.aweme.beauty.ComposerBeauty) r0
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = r0.getEffect()
            java.lang.String r1 = r0.getEffectId()
            java.lang.String r0 = r6.effectId
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L84
        La1:
            com.ss.android.ugc.aweme.beauty.ComposerBeauty r2 = (com.ss.android.ugc.aweme.beauty.ComposerBeauty) r2
            if (r2 == 0) goto L68
            boolean r0 = r11.LJIJ(r2)
        La9:
            if (r0 == 0) goto L39
        Lab:
            r4.add(r3)
            goto L39
        Laf:
            r2 = 0
            goto La1
        Lb1:
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = r2.getEffect()
            java.lang.String r1 = r0.getEffectId()
            java.lang.String r0 = r6.effectId
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L68
            boolean r0 = r11.LJIJ(r2)
            goto La9
        Lc6:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12HN.LJIIJ():X.12HU");
    }

    public final BeautifyUsedInfo LJIILIIL() {
        return (BeautifyUsedInfo) this.LJIL.getValue();
    }

    public final C12HR LJIILJJIL() {
        return (C12HR) this.LJJI.getValue();
    }

    public final void LJIJJ() {
        if (C2281551ESb.LIZIZ.LIZLLL()) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C12HD(this, null), 3);
            return;
        }
        BeautyFilterConfig beautyFilterConfig = this.LIZIZ;
        C19730912Hr c19730912Hr = beautyFilterConfig.dataConfig.LIZ;
        if (c19730912Hr != null) {
            this.LJJII.getClass();
            List<BeautyCategory> listLIZ = C19730612Ho.LIZ(c19730912Hr, beautyFilterConfig);
            C19570511hX.LIZIZ("assign allData from generateFromLocalSource");
            LJJ(listLIZ);
            this.LJJIII = true;
        }
    }

    @Override // X.C12I9
    public final boolean Le() {
        return this.LIZ.ke();
    }

    @Override // X.C12I9
    public final ComposerBeautyBuriedInfo Ne() {
        BeautyContext beautyContext = BeautyContext.INSTANCE;
        int i = 0;
        if (beautyContext.useMInstantBeauty()) {
            return new ComposerBeautyBuriedInfo(beautyContext.getBeautificationMode() == 1 ? 1 : 0, 1, 0, Collections.emptyList());
        }
        if (this.LJJIII) {
            return new ComposerBeautyBuriedInfo(0, 0, 0, null, 12, null);
        }
        C118300cf c118300cf = new C118300cf();
        C118300cf c118300cf2 = new C118300cf();
        ArrayList arrayList = new ArrayList();
        AwS124S0400000_29 awS124S0400000_29 = new AwS124S0400000_29(arrayList, (ArrayList<BeautifyInfo>) this, (C12HN) c118300cf2, c118300cf, (C118300cf) 2);
        for (BeautyCategory beautyCategory : this.LJI) {
            if (beautyCategory.getBeautyCategoryExtra().exclusive) {
                Iterator<ComposerBeauty> it2 = beautyCategory.getBeautyList().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        ComposerBeauty next = it2.next();
                        if (next.getSelected()) {
                            if (next != null) {
                                awS124S0400000_29.invoke(next);
                            }
                        }
                    }
                }
            } else {
                for (ComposerBeauty composerBeauty : beautyCategory.getBeautyList()) {
                    if (composerBeauty.isCollectionType()) {
                        List<ComposerBeauty> childList = composerBeauty.getChildList();
                        if (childList != null) {
                            Iterator<ComposerBeauty> it3 = childList.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    ComposerBeauty next2 = it3.next();
                                    if (next2.getSelected()) {
                                        if (next2 != null) {
                                            awS124S0400000_29.invoke(next2);
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        awS124S0400000_29.invoke(composerBeauty);
                    }
                }
            }
        }
        if (!LIZIZ()) {
            c118300cf.element = 2;
        }
        int i2 = c118300cf.element;
        InterfaceC1663190tNl interfaceC1663190tNlUseComposer = BeautyContext.INSTANCE.useComposer();
        if (interfaceC1663190tNlUseComposer != null) {
            interfaceC1663190tNlUseComposer.LIZ();
            i = 1;
        }
        return new ComposerBeautyBuriedInfo(i2, i, c118300cf2.element, arrayList);
    }

    @Override // X.C12I9
    public final void Oe() {
        BeautyCategory next;
        Iterator<BeautyCategory> it2 = this.LJI.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (a0.LJJIIZI(next.getCategoryResponse().getKey(), "beauty", false)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        BeautyCategory beautyCategory = next;
        if (beautyCategory != null) {
            for (ComposerBeauty composerBeauty : beautyCategory.getBeautyList()) {
                composerBeauty.setSelected(false);
                composerBeauty.setEnable(false);
            }
        }
    }

    @Override // X.C12I9
    public final ComposerBeauty Qe() {
        ComposerBeauty composerBeauty;
        BeautyCategory next;
        Iterator<BeautyCategory> it2 = this.LJI.iterator();
        while (true) {
            composerBeauty = null;
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (a0.LJJIIZI(next.getCategoryResponse().getKey(), "makeup", false)) {
                break;
            }
        }
        BeautyCategory beautyCategory = next;
        if (beautyCategory == null) {
            return null;
        }
        Iterator<ComposerBeauty> it3 = beautyCategory.getBeautyList().iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            ComposerBeauty next2 = it3.next();
            if (next2.getSelected()) {
                composerBeauty = next2;
                break;
            }
        }
        return composerBeauty;
    }

    @Override // X.C12I9
    public final List<ComposerBeauty> We() {
        List<BeautyCategory> list = this.LJI;
        AwS608S0100000_29 awS608S0100000_29 = new AwS608S0100000_29(this, 579);
        List<ComposerBeauty> listLIZJ = C12HP.LIZJ(list);
        ArrayList arrayList = new ArrayList();
        for (Object obj : (ArrayList) listLIZJ) {
            if (((Boolean) awS608S0100000_29.invoke(obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // X.C12I9
    public final boolean ef() {
        List<BeautyCategory> listLJIJ = this.LIZ.LJIJ();
        if (listLJIJ != null) {
            return this.LJIJJ.LIZJ(this.LIZIZ, listLJIJ);
        }
        return false;
    }

    @Override // X.C12I9
    public final BeautyMetadata le() {
        ComposerBeauty next;
        ComposerBeautyExtra extra;
        BeautyMetadata beautyMetadata = new BeautyMetadata();
        ArrayList arrayList = new ArrayList();
        for (BeautyCategory beautyCategory : this.LJI) {
            if (!beautyCategory.getBeautyList().isEmpty() && this.LIZ.oe(beautyCategory.getCategoryResponse().getId(), this.LIZIZ.beautySwitchStatus)) {
                ComposerBeauty composerBeauty = null;
                if (beautyCategory.getBeautyCategoryExtra().exclusive) {
                    Iterator<ComposerBeauty> it2 = beautyCategory.getBeautyList().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        next = it2.next();
                        ComposerBeauty composerBeauty2 = next;
                        if (composerBeauty2.getSelected() && composerBeauty2.getEnable()) {
                            if (next == null) {
                                break;
                            }
                        }
                    }
                    Iterator<ComposerBeauty> it3 = beautyCategory.getBeautyList().iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            next = it3.next();
                            if (next.getExtra().isNone()) {
                                if (next != null) {
                                }
                            }
                        }
                    }
                    arrayList.add(next);
                } else {
                    Iterator<ComposerBeauty> it4 = beautyCategory.getBeautyList().iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            break;
                        }
                        ComposerBeauty next2 = it4.next();
                        ComposerBeauty composerBeauty3 = next2;
                        if (composerBeauty3.getSelected() && composerBeauty3.getEnable()) {
                            composerBeauty = next2;
                            break;
                        }
                    }
                    ComposerBeauty composerBeauty4 = composerBeauty;
                    if (composerBeauty4 == null || (extra = composerBeauty4.getExtra()) == null || !extra.isNone()) {
                        List<ComposerBeauty> beautyList = beautyCategory.getBeautyList();
                        ArrayList<ComposerBeauty> arrayList2 = new ArrayList();
                        for (ComposerBeauty composerBeauty5 : beautyList) {
                            if (composerBeauty5.getEnable()) {
                                arrayList2.add(composerBeauty5);
                            }
                        }
                        for (ComposerBeauty composerBeauty6 : arrayList2) {
                            if (composerBeauty6.isCollectionType()) {
                                List<ComposerBeauty> childList = composerBeauty6.getChildList();
                                if (childList != null) {
                                    arrayList.addAll(childList);
                                }
                            } else {
                                arrayList.add(composerBeauty6);
                            }
                        }
                    } else {
                        arrayList.add(composerBeauty4);
                    }
                }
            }
        }
        beautyMetadata.setBeautyName(C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, AFwS273S0000000_29.get$arr$(334), 30));
        beautyMetadata.setBeautyStrength(C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, new AwS608S0100000_29(this, 580), 30));
        beautyMetadata.setBeautyId(C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, AFwS273S0000000_29.get$arr$(335), 30));
        beautyMetadata.setBeautyRes(C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, AFwS273S0000000_29.get$arr$(336), 30));
        return beautyMetadata;
    }

    @Override // X.C12I9
    public final void pe() {
        this.LIZ.pe();
    }

    @Override // X.C12I9
    public final void release() {
        this.LJIILL.LIZJ().LJ().clear();
        if (((Boolean) C0AZX.LIZ.getValue()).booleanValue()) {
            C13SS.LIZ.getClass();
            C13SS.LIZ("MEMORY_LEAK", "beauty source release");
            this.LIZLLL = null;
        }
    }

    @Override // X.C12I9
    public final void xe() {
        BeautyCategory next;
        boolean z;
        if (this.LIZ.LJIIIIZZ()) {
            Iterator<BeautyCategory> it2 = this.LJI.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it2.next();
                    if (a0.LJJIIZI(next.getCategoryResponse().getKey(), "beauty", false)) {
                        break;
                    }
                }
            }
            BeautyCategory beautyCategory = next;
            if (beautyCategory != null) {
                Iterator<ComposerBeauty> it3 = beautyCategory.getBeautyList().iterator();
                while (it3.hasNext()) {
                    if (it3.next().getDefaultProgress() != 0) {
                        z = true;
                        break;
                    }
                }
                z = false;
            } else {
                z = false;
            }
            if (!C0C64.LJIILLIIL().LJIIIZ(31744, "creative_tools_beauty_fix_all_switch_state", true, true)) {
                this.LIZ.LIZLLL(z);
                if (!z) {
                    Oe();
                }
            } else if (!z) {
                this.LIZ.LIZLLL(false);
                Oe();
            }
            this.LIZ.LJIJI();
        }
    }

    public static boolean LJJIIJ() {
        boolean z = false;
        if (C255880A1a.LIZ() && C0C64.LJIILLIIL().LJIIIZ(31744, "studio_beauty_first_frame_bundle_beauty_fallback_optimization_v2", true, false) && BeautyContext.INSTANCE.useMInstantBeauty()) {
            z = true;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LJT sendRequest: not valid panel useMInstantBeauty=");
        sbLIZ.append(BeautyContext.INSTANCE.useMInstantBeauty());
        sbLIZ.append(", canSkipFallback=");
        sbLIZ.append(z);
        C19570511hX.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
        return z;
    }

    public final void LJJIIJZLJL() {
        if (C255880A1a.LIZ()) {
            C19570511hX.LIZJ("LJT sendRequest: categoryResponseList is empty, load bundle beauty");
            LJIJI(false);
        }
    }

    @Override // X.C12I9
    public final C12HU Pe() {
        return LJIIJ();
    }

    @Override // X.C12I9
    public final SafeMutableLiveData<List<ComposerBeauty>> Ee() {
        return this.LJIILJJIL;
    }

    @Override // X.C12I9
    public final SafeMutableLiveData<Map<String, Integer>> He() {
        return this.LJIJ;
    }

    @Override // X.C12I9
    public final List<BeautyCategory> LIZ() {
        return this.LJJIIZ;
    }

    @Override // X.C12I9
    public final SafeMutableLiveData<List<BeautyComposerInfo>> LJ() {
        return this.LJIIIZ;
    }

    @Override // X.C12I9
    public final Map<String, C12HU<BeautyComposerInfo>> Me() {
        return this.LJIIL;
    }

    @Override // X.C12I9
    public final EnumC19731112Ht Se() {
        return this.LJJIIJZLJL;
    }

    @Override // X.C12I9
    public final SafeMutableLiveData<C1499920p8Q<ComposerBeauty>> Te() {
        return this.LJIJI;
    }

    @Override // X.C12I9
    public final C560530Lyd<ArrayList<BeautyComposerInfo>> Ve() {
        return this.LJIIJJI;
    }

    @Override // X.C12I9
    public final C19570611hY Ye() {
        return this.LJIILL;
    }

    @Override // X.C12I9
    public final BeautyFilterConfig df() {
        return this.LIZIZ;
    }

    @Override // X.C12I9
    /* JADX INFO: renamed from: if, reason: not valid java name */
    public final SafeMutableLiveData<List<BeautyComposerInfo>> mo73if() {
        return this.LJJIJ;
    }

    @Override // X.C12I9
    public final SafeMutableLiveData<Integer> mf() {
        return this.LJIIZILJ;
    }

    @Override // X.C12I9
    public final List<BeautyCategory> ne() {
        return this.LJI;
    }

    @Override // X.C12I9
    public final C12HU<BeautyComposerInfo> ue() {
        return this.LJIIJ;
    }

    @Override // X.C12I9
    public final SafeMutableLiveData<Boolean> we() {
        return this.LJII;
    }

    public static boolean LJIIIIZZ(ComposerBeauty composerBeauty) {
        C013C c013c = new C013C();
        boolean zIsCollectionType = composerBeauty.isCollectionType();
        if (zIsCollectionType) {
            List<ComposerBeauty> childList = composerBeauty.getChildList();
            if (childList != null) {
                for (ComposerBeauty composerBeauty2 : childList) {
                    if (composerBeauty2.getParentId() == null && composerBeauty2.getDefaultProgress() != 0 && !composerBeauty2.getCategoryExclusive() && composerBeauty2.getEnable()) {
                        c013c.element = true;
                    }
                }
            }
        } else if (!zIsCollectionType) {
            if (composerBeauty.getParentId() == null && composerBeauty.getDefaultProgress() != 0 && !composerBeauty.getCategoryExclusive() && composerBeauty.getEnable()) {
                c013c.element = true;
            }
        } else {
            throw new C1954807lC();
        }
        return c013c.element;
    }

    public static final void LJIIIZ(ComposerBeauty composerBeauty) {
        composerBeauty.setSelected(false);
        composerBeauty.setShowDot(false);
        composerBeauty.setAdd2Nodes(false);
        composerBeauty.setProgressValue(0);
        composerBeauty.setEnable(true);
    }

    public static void LJIJJLI(boolean z) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C2248008rO(z, null), 3);
    }

    public static final void LJJIFFI(List<ComposerBeauty> list) {
        ComposerBeauty next;
        Iterator<ComposerBeauty> it2 = list.iterator();
        do {
            next = null;
            if (!it2.hasNext()) {
                break;
            } else {
                next = it2.next();
            }
        } while (!next.getExtra().getDefault());
        ComposerBeauty composerBeauty = next;
        if (composerBeauty != null) {
            composerBeauty.setSelected(true);
        } else {
            if (!(!list.isEmpty())) {
                return;
            }
            ((ComposerBeauty) ListProtector.get(list, 0)).setSelected(true);
        }
    }

    public static final void LJJII(List<BeautyCategory> list) {
        BeautyCategory next;
        Iterator<BeautyCategory> it2 = list.iterator();
        do {
            next = null;
            if (!it2.hasNext()) {
                break;
            } else {
                next = it2.next();
            }
        } while (!next.getBeautyCategoryExtra().f82default);
        BeautyCategory beautyCategory = next;
        if (beautyCategory != null) {
            beautyCategory.setSelected(true);
        } else {
            if (!(!list.isEmpty())) {
                return;
            }
            ((BeautyCategory) ListProtector.get(list, 0)).setSelected(true);
        }
    }

    @Override // X.C12I9
    public final void Ge(BeautyCategory beautyCategory) {
        this.LIZ.LJIIZILJ(this.LJJIIJZLJL, beautyCategory.getCategoryResponse().getId());
        this.LJ = beautyCategory.getCategoryResponse().getName();
    }

    @Override // X.C12I9
    public final boolean Je(ComposerBeauty composerBeauty) {
        if (!composerBeauty.getExtra().isNone() && !LJIILL(composerBeauty).LIZJ.booleanValue()) {
            return false;
        }
        return true;
    }

    @Override // X.C12I9
    public final void LIZLLL(boolean z) {
        this.LIZ.LIZLLL(z);
    }

    public final boolean LJFF(ComposerBeauty composerBeauty) {
        if (composerBeauty.getExtra().getDisableCache() && !this.LIZIZ.autoApplyBeauty) {
            return false;
        }
        return true;
    }

    public final boolean LJI(ComposerBeauty composerBeauty) {
        if (composerBeauty.isCollectionType()) {
            List<ComposerBeauty> childList = composerBeauty.getChildList();
            if (childList == null || childList.isEmpty()) {
                return true;
            }
            Iterator<ComposerBeauty> it2 = childList.iterator();
            while (it2.hasNext()) {
                if (!LJII(it2.next(), this)) {
                    return false;
                }
            }
            return true;
        }
        return LJII(composerBeauty, this);
    }

    public final C1634100scq<Integer, Integer, Boolean> LJIILL(ComposerBeauty composerBeauty) {
        int i;
        boolean z;
        List<ComposerBeautyExtraBeautify.ItemsBean> items = composerBeauty.getBeautifyExtra().getItems();
        int i2 = 0;
        if (items != null && !items.isEmpty()) {
            C12I4 c12i4LIZIZ = C12I3.LIZIZ(new C12I4(((ComposerBeautyExtraBeautify.ItemsBean) ListProtector.get(items, 0)).doubleDirection, ((ComposerBeautyExtraBeautify.ItemsBean) ListProtector.get(items, 0)).max, ((ComposerBeautyExtraBeautify.ItemsBean) ListProtector.get(items, 0)).min, gf(composerBeauty, ((ComposerBeautyExtraBeautify.ItemsBean) ListProtector.get(items, 0)).tag, ((ComposerBeautyExtraBeautify.ItemsBean) ListProtector.get(items, 0)).value), 0, ((ComposerBeautyExtraBeautify.ItemsBean) ListProtector.get(items, 0)).value, 1676));
            composerBeauty.setDefaultProgress(c12i4LIZIZ.LJFF);
            i2 = c12i4LIZIZ.LJFF;
            i = c12i4LIZIZ.LIZIZ;
            z = c12i4LIZIZ.LJI;
        } else {
            i = 0;
            z = false;
        }
        return new C1634100scq<>(Integer.valueOf(i2), Integer.valueOf(i), Boolean.valueOf(z));
    }

    public final synchronized void LJIILLIIL(EnumC19731112Ht enumC19731112Ht) {
        ArrayList arrayList = new ArrayList();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LJT initComposerNodes: start. allData size is ");
        sbLIZ.append(this.LJJIIZ.size());
        C19570511hX.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
        for (BeautyCategory beautyCategory : this.LJJIIZ) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("LJT initComposerNodes: add ");
            sbLIZ2.append(beautyCategory.getCategoryResponse().getName());
            sbLIZ2.append("(panelType=");
            sbLIZ2.append(beautyCategory.getBeautyCategoryExtra().panelType);
            sbLIZ2.append(", genderFlag=");
            sbLIZ2.append(enumC19731112Ht.getFlag());
            sbLIZ2.append(") to result");
            C19570511hX.LIZIZ(C2188811AlT.LIZIZ(sbLIZ2));
            if (Intrinsics.LJFF(beautyCategory.getBeautyCategoryExtra().panelType, enumC19731112Ht.getFlag()) || Intrinsics.LJFF(beautyCategory.getBeautyCategoryExtra().panelType, EnumC19731112Ht.ALL.getFlag())) {
                arrayList.add(beautyCategory);
            }
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("LJT initComposerNodes: allData size is ");
        sbLIZ3.append(this.LJJIIZ.size());
        sbLIZ3.append(", result size is ");
        sbLIZ3.append(arrayList.size());
        C19570511hX.LIZIZ(C2188811AlT.LIZIZ(sbLIZ3));
        if (Intrinsics.LJFF(this.LJI, arrayList)) {
            return;
        }
        this.LJI = arrayList;
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("LJT initComposerNodes: assign result to panelData. result=");
        sbLIZ4.append(arrayList);
        C19570511hX.LIZIZ(C2188811AlT.LIZIZ(sbLIZ4));
        C12HI.LIZ(this.LJIIIIZZ, Boolean.TRUE);
        C23250099c.LIZLLL(this.LJJIIJ, null, null, new C12HQ(this, arrayList, null), 3);
    }

    public final boolean LJIIZILJ(int i) {
        List<BeautyCategory> listLJIJ = this.LIZ.LJIJ();
        if (listLJIJ == null || listLJIJ.isEmpty()) {
            return false;
        }
        if ((listLJIJ instanceof Collection) && listLJIJ.isEmpty()) {
            return false;
        }
        Iterator<BeautyCategory> it2 = listLJIJ.iterator();
        while (it2.hasNext()) {
            if (C12HP.LJIIIIZZ(it2.next().getBeautyCategoryExtra().abGroup) == i) {
                return true;
            }
        }
        return false;
    }

    public final boolean LJIJ(ComposerBeauty composerBeauty) {
        boolean zLJIJJLI = true;
        if (C2281551ESb.LIZIZ.LJIIZILJ()) {
            zLJIJJLI = this.LJIILL.LJ(composerBeauty, true);
        } else {
            C19570611hY c19570611hY = this.LJIILL;
            c19570611hY.getClass();
            if (!C19731012Hs.LJIIIIZZ.contains(composerBeauty.getEffect().getEffectId()) && !composerBeauty.isLocalItem()) {
                zLJIJJLI = c19570611hY.LIZ.LJIJJLI(composerBeauty.getEffect());
            }
        }
        if (!zLJIJJLI) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("isDownloaded: ");
            sbLIZ.append(zLJIJJLI);
            sbLIZ.append(",effect= ");
            sbLIZ.append(composerBeauty.getEffect());
            C19570511hX.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        }
        return zLJIJJLI;
    }

    public final void LJIJI(boolean z) {
        if (LJJIIJ() && (!z || !C0C64.LJIILLIIL().LJIIIZ(31744, "creative_tools_beauty_fix_bug", true, true))) {
            return;
        }
        if (C2281551ESb.LIZIZ.LJJIIZ() && Intrinsics.LJFF(this.LIZ.LIZJ(), "")) {
            C12HT c12ht = this.LIZ;
            C23250099c.LIZLLL(C817503Hh.LL, C2107608Nm.LIZ, null, new C1001630cAj(new AwS608S0100000_29(this, 581), c12ht, null), 2);
            return;
        }
        C23250099c.LIZLLL(C817503Hh.LL, C2107608Nm.LIZ, null, new C12HA(this, null), 2);
    }

    public final void LJJ(List<BeautyCategory> list) {
        this.LJJIIZ = list;
        Keva keva = C12HK.LIZ;
        String string = C12HK.LIZ.getString("key_last_gender", this.LIZIZ.defaultGender.getFlag());
        EnumC19731112Ht enumC19731112Ht = EnumC19731112Ht.FEMALE;
        if (!Intrinsics.LJFF(string, enumC19731112Ht.getFlag())) {
            enumC19731112Ht = EnumC19731112Ht.MALE;
            if (!Intrinsics.LJFF(string, enumC19731112Ht.getFlag())) {
                enumC19731112Ht = this.LIZIZ.defaultGender;
            }
        }
        De(false, enumC19731112Ht);
    }

    public final void LJJIIZ(ComposerBeauty composerBeauty) {
        C1499920p8Q<ComposerBeauty> value = this.LJIJI.getValue();
        if (value != null) {
            value.add(composerBeauty);
        }
        SafeMutableLiveData<C1499920p8Q<ComposerBeauty>> safeMutableLiveData = this.LJIJI;
        C12HI.LIZ(safeMutableLiveData, safeMutableLiveData.getValue());
    }

    public final void LJJIJ(ComposerBeauty composerBeauty) {
        if (this.LIZIZ.beautyDownloadToThread) {
            C0CNO.LIZ(C15O7.LJI, new AwS430S0200000_29(composerBeauty, this, 81));
        } else {
            C0CNO.LIZLLL(0L, new AwS430S0200000_29(composerBeauty, this, 82));
        }
    }

    public final void LJJIJIIJI(ComposerBeauty composerBeauty) {
        String effectId = composerBeauty.getEffect().getEffectId();
        int iLIZIZ = this.LJIILL.LIZIZ(composerBeauty, false);
        Map<String, Integer> value = this.LJIJ.getValue();
        if (value != null) {
            value.put(effectId, Integer.valueOf(iLIZIZ));
        }
        Iterator<BeautyCategory> it2 = this.LJI.iterator();
        while (it2.hasNext()) {
            for (ComposerBeauty composerBeauty2 : it2.next().getBeautyList()) {
                if (composerBeauty2.isCollectionType()) {
                    List<ComposerBeauty> childList = composerBeauty2.getChildList();
                    if (childList != null) {
                        for (ComposerBeauty composerBeauty3 : childList) {
                            int iLIZIZ2 = this.LJIILL.LIZIZ(composerBeauty3, false);
                            if (composerBeauty3.getDownloadState() != iLIZIZ2) {
                                composerBeauty3.setDownloadState(iLIZIZ2);
                                if (value != null) {
                                    value.put(composerBeauty3.getEffect().getEffectId(), Integer.valueOf(iLIZIZ2));
                                }
                            }
                        }
                    }
                } else {
                    int iLIZIZ3 = this.LJIILL.LIZIZ(composerBeauty2, false);
                    if (composerBeauty2.getDownloadState() != iLIZIZ3) {
                        composerBeauty2.setDownloadState(iLIZIZ3);
                        if (value != null) {
                            value.put(composerBeauty2.getEffect().getEffectId(), Integer.valueOf(iLIZIZ3));
                        }
                    }
                }
            }
        }
        if (value != null) {
            if (this.LIZIZ.beautyDownloadToThread) {
                this.LJIJ.postValue(value);
            } else {
                this.LJIJ.setValue(value);
            }
        }
    }

    @Override // X.C12I9
    public final void Ze(boolean z) {
        this.LIZ.LJFF(z);
    }

    @Override // X.C12I9
    public final void cf(ComposerBeauty composerBeauty) {
        if (!this.LJIILL.LIZLLL(composerBeauty, false)) {
            C19570611hY c19570611hY = this.LJIILL;
            C19570211hU c19570211hU = new C19570211hU(composerBeauty);
            C12HH c12hh = this.LJJIJIIJI;
            C19568211hA<C19570211hU, Void> c19568211hALIZJ = c19570611hY.LIZJ();
            c19568211hALIZJ.getClass();
            c19568211hALIZJ.LJIIIIZZ(new AwS157S0400000_29((Object) c19570211hU, (Object) null, (Function0<? extends Object>) c12hh, (InterfaceC19568511hD<Object, Object>) c19568211hALIZJ, (C19568211hA<Object, Object>) 14));
            C19570611hY c19570611hY2 = this.LJIILL;
            c19570611hY2.LIZJ().LIZLLL(new C19570211hU(composerBeauty), null);
        }
    }

    @Override // X.C12I9
    public final void ff(C787110UuD c787110UuD) {
        C12HR c12hrLJIILJJIL = LJIILJJIL();
        synchronized (c12hrLJIILJJIL) {
            try {
                c12hrLJIILJJIL.LIZJ.add(c787110UuD);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        c12hrLJIILJJIL.LIZLLL();
    }

    @Override // X.C12I9
    public final void hf(ComposerBeauty composerBeauty) {
        this.LIZ.LJIILIIL(composerBeauty, this.LJJIIJZLJL);
        Ce();
    }

    @Override // X.C12I9
    public final void jf(ComposerBeauty composerBeauty) {
        LJJIII(composerBeauty, false);
    }

    @Override // X.C12I9
    public final String lf(ComposerBeauty composerBeauty) {
        return this.LIZ.LJ(composerBeauty, this.LJJIIJZLJL);
    }

    @Override // X.C12I9
    public final boolean nf(ComposerBeauty composerBeauty) {
        if (composerBeauty.isBeautyMode()) {
            List<ComposerBeauty> childList = composerBeauty.getChildList();
            if (childList != null) {
                Iterator<ComposerBeauty> it2 = childList.iterator();
                boolean z = true;
                while (it2.hasNext()) {
                    if (!LJI(it2.next())) {
                        z = false;
                    }
                }
                if (!z) {
                    return false;
                }
                return true;
            }
            return true;
        }
        if (!LJI(composerBeauty)) {
            return false;
        }
        return true;
    }

    @Override // X.C12I9
    public final void te(ComposerBeauty composerBeauty) {
        this.LIZ.LJIIJJI(composerBeauty, this.LJJIIJZLJL);
    }

    @Override // X.C12I9
    public final void ye(C787110UuD c787110UuD) {
        C12HR c12hrLJIILJJIL = LJIILJJIL();
        synchronized (c12hrLJIILJJIL) {
            try {
                c12hrLJIILJJIL.LIZJ.remove(c787110UuD);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        c12hrLJIILJJIL.LIZLLL();
    }

    public static final boolean LJII(ComposerBeauty composerBeauty, C12HN c12hn) {
        List<ComposerBeautyExtraBeautify.ItemsBean> items = composerBeauty.getBeautifyExtra().getItems();
        if (items == null || items.isEmpty()) {
            return true;
        }
        for (ComposerBeautyExtraBeautify.ItemsBean itemsBean : items) {
            if (C814420VxA.LIZIZ(c12hn.gf(composerBeauty, itemsBean.tag, itemsBean.value) * 100) != itemsBean.value * 100) {
                return false;
            }
        }
        return true;
    }

    public static final void LJIL(ComposerBeauty composerBeauty, C12HN c12hn) {
        ComposerBeauty next;
        boolean zIsCollectionType = composerBeauty.isCollectionType();
        if (zIsCollectionType) {
            List<ComposerBeauty> childList = composerBeauty.getChildList();
            if (childList != null) {
                Iterator<ComposerBeauty> it2 = childList.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (next.getSelected()) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                ComposerBeauty composerBeauty2 = next;
                if (composerBeauty2 != null) {
                    c12hn.LJJIII(composerBeauty2, false);
                    return;
                }
                return;
            }
            return;
        }
        if (!zIsCollectionType) {
            c12hn.LJJIII(composerBeauty, false);
            return;
        }
        throw new C1954807lC();
    }

    public static final void LJJI(C12HN c12hn, List<ComposerBeauty> list) {
        ComposerBeauty next;
        Iterator<ComposerBeauty> it2 = list.iterator();
        do {
            next = null;
            if (!it2.hasNext()) {
                break;
            } else {
                next = it2.next();
            }
        } while (!next.getExtra().getDefault());
        ComposerBeauty composerBeauty = next;
        if (composerBeauty != null) {
            composerBeauty.setSelected(true);
            c12hn.LJJIII(composerBeauty, false);
            c12hn.te(composerBeauty);
        } else {
            if (!(!list.isEmpty())) {
                return;
            }
            ((ComposerBeauty) ListProtector.get(list, 0)).setSelected(true);
            c12hn.LJJIII((ComposerBeauty) ListProtector.get(list, 0), false);
            c12hn.te((ComposerBeauty) ListProtector.get(list, 0));
        }
    }

    @Override // X.C12I9
    public final synchronized void De(boolean z, EnumC19731112Ht enumC19731112Ht) {
        int iLJIILLIIL;
        if (this.LIZIZ.isConvertKey()) {
            Keva keva = C12HK.LIZ;
            C12HK.LIZ(this.LJJIIZ);
        }
        if (!this.LJIJJ.LIZJ(this.LIZIZ, this.LJJIIZ)) {
            return;
        }
        if (z && enumC19731112Ht == EnumC19731112Ht.FEMALE && (iLJIILLIIL = this.LIZ.LJIILLIIL()) < 3) {
            this.LIZ.LJIIJ(iLJIILLIIL + 1);
        }
        if (!this.LJJIIZI && this.LJJIIJZLJL == enumC19731112Ht && this.LJJIII) {
            C19570511hX.LIZIZ("initPanelData not firstInit and useLocalBeauty, return");
            return;
        }
        this.LJJIIZI = false;
        this.LJJIIJZLJL = enumC19731112Ht;
        LJIILJJIL().LIZLLL = enumC19731112Ht;
        LJIILJJIL().LIZJ();
        Keva keva2 = C12HK.LIZ;
        C12HK.LIZ.storeString("key_last_gender", this.LJJIIJZLJL.getFlag());
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("initPanelData curGender:");
        sbLIZ.append(this.LJJIIJZLJL.getFlag());
        C19570511hX.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
        LJIILLIIL(enumC19731112Ht);
    }

    public final void LJJIII(ComposerBeauty composerBeauty, boolean z) {
        boolean zLIZIZ;
        if (C12HP.LIZLLL(composerBeauty) && !Je(composerBeauty) && composerBeauty.getEnable()) {
            ComposerBeauty composerBeautyLIZIZ = C12HP.LIZIZ(composerBeauty, this.LJI);
            if (composerBeautyLIZIZ != null) {
                if (z) {
                    zLIZIZ = false;
                } else {
                    zLIZIZ = LIZIZ();
                }
                composerBeautyLIZIZ.setShowDot(zLIZIZ);
            }
            composerBeauty.setShowDot(false);
            return;
        }
        if (!C12HP.LJFF(composerBeauty) && !Je(composerBeauty) && composerBeauty.getEnable()) {
            ComposerBeauty composerBeautyLIZIZ2 = C12HP.LIZIZ(composerBeauty, this.LJI);
            if (composerBeautyLIZIZ2 != null) {
                composerBeautyLIZIZ2.setShowDot(false);
            }
            composerBeauty.setShowDot(!z);
            return;
        }
        ComposerBeauty composerBeautyLIZIZ3 = C12HP.LIZIZ(composerBeauty, this.LJI);
        if (composerBeautyLIZIZ3 != null) {
            composerBeautyLIZIZ3.setShowDot(false);
        }
        composerBeauty.setShowDot(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.util.ArrayList] */
    public final void LJJIIZI(boolean z, boolean z2) {
        C12HU<BeautyComposerInfo> c12huLJIIJ;
        BeautyCategory next;
        List<ComposerBeauty> listEmptyList;
        ?? SingletonList;
        Function1<? super Function0<Unit>, Boolean> function1;
        if (!z && (function1 = this.LIZIZ.updateComposerNodesInterceptor) != null && function1.invoke(new AwS573S0100000_29(this, 841)).booleanValue()) {
            C19570511hX.LIZIZ("[BeautySource#updateComposerNodesActual] intercepted");
            return;
        }
        if (z2) {
            C12HU<BeautyComposerInfo> c12huLJIIJ2 = LJIIJ();
            c12huLJIIJ = new C12HU<>();
            Iterator<BeautyCategory> it2 = this.LJI.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (a0.LJJIIZI(next.getCategoryResponse().getKey(), "beauty", false)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            BeautyCategory beautyCategory = next;
            if (beautyCategory == null || (listEmptyList = beautyCategory.getBeautyList()) == null) {
                listEmptyList = Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (ComposerBeauty composerBeauty : listEmptyList) {
                if (composerBeauty.isCollectionType()) {
                    List<ComposerBeauty> childList = composerBeauty.getChildList();
                    if (childList != null) {
                        SingletonList = new ArrayList(C15438062q.LJIJJ(childList, 10));
                        Iterator<ComposerBeauty> it3 = childList.iterator();
                        while (it3.hasNext()) {
                            SingletonList.add(it3.next().getEffect().getEffectId());
                        }
                    } else {
                        SingletonList = Collections.emptyList();
                    }
                } else {
                    SingletonList = Collections.singletonList(composerBeauty.getEffect().getEffectId());
                }
                C19719612Di.LJJI(SingletonList, arrayList);
            }
            Set setLLIIIZ = C13LP.LLIIIZ(arrayList);
            setLLIIIZ.addAll(C19731012Hs.LJIIIIZZ);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[copyApplyComposerNodesWithFilterOut] beautyCategory=");
            sbLIZ.append(beautyCategory);
            sbLIZ.append(" nodes=");
            sbLIZ.append(c12huLJIIJ2);
            C19570511hX.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
            if (!LIZIZ()) {
                ArrayList arrayList2 = new ArrayList();
                for (BeautyComposerInfo beautyComposerInfo : c12huLJIIJ2) {
                    BeautyComposerInfo beautyComposerInfo2 = beautyComposerInfo;
                    if (!setLLIIIZ.contains(beautyComposerInfo2.effectId) && !Intrinsics.LJFF(beautyComposerInfo2.nodePath, "EFFECT_ID_TYPE_FILTER")) {
                        arrayList2.add(beautyComposerInfo);
                    }
                }
                c12huLJIIJ.addAll(arrayList2);
            } else {
                ArrayList arrayList3 = new ArrayList();
                for (BeautyComposerInfo beautyComposerInfo3 : c12huLJIIJ2) {
                    BeautyComposerInfo beautyComposerInfo4 = beautyComposerInfo3;
                    if (setLLIIIZ.contains(beautyComposerInfo4.effectId)) {
                        String str = beautyComposerInfo4.nodePath;
                        if (Intrinsics.LIZLLL(C2327809Ae.LJIIIIZZ(a0.LJJLJLI(str, ":", str)), 0.0f)) {
                        }
                    }
                    arrayList3.add(beautyComposerInfo3);
                }
                c12huLJIIJ.addAll(arrayList3);
            }
        } else {
            c12huLJIIJ = LJIIJ();
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("[BeautySource#updateComposerNodesActual] isCloseOrReset=");
        sbLIZ2.append(z);
        sbLIZ2.append(" filterOutBeautyComposers=");
        sbLIZ2.append(z2);
        sbLIZ2.append(" nodes=");
        sbLIZ2.append(c12huLJIIJ);
        C19570511hX.LIZIZ(C2188811AlT.LIZIZ(sbLIZ2));
        C12HI.LIZ(this.LJIIIZ, c12huLJIIJ);
        Fe(true, false, null);
    }

    public final List<BeautyComposerInfo> LJJIJIIJIL(ComposerBeauty composerBeauty, C19570211hU c19570211hU) {
        boolean zLJFF;
        ArrayList arrayList = new ArrayList();
        if (Intrinsics.LJFF(c19570211hU.LIZIZ, composerBeauty.getEffect().getUnzipPath()) && !Je(composerBeauty) && this.LJIILL.LIZLLL(composerBeauty, false) && C12HP.LJ(composerBeauty)) {
            if (C12HP.LJI(composerBeauty)) {
                zLJFF = composerBeauty.getSelected();
            } else {
                zLJFF = LJFF(composerBeauty);
            }
            if (zLJFF) {
                List<BeautyComposerInfo> listXe = Xe(composerBeauty, false, false, false);
                if (!listXe.isEmpty()) {
                    composerBeauty.setAdd2Nodes(true);
                    C12HW.LIZ(this, new C19729212Ha(listXe));
                    arrayList.addAll(listXe);
                    LJJIIZ(composerBeauty);
                    this.LIZ.LJII(composerBeauty.needFaceDetect());
                }
            }
        }
        return arrayList;
    }

    @Override // X.C12I9
    public final void af(boolean z, boolean z2) {
        ComposerBeauty next;
        Iterator<BeautyCategory> it2 = this.LJI.iterator();
        while (it2.hasNext()) {
            for (ComposerBeauty composerBeauty : it2.next().getBeautyList()) {
                if (!z2) {
                    composerBeauty.setSelected(false);
                }
                composerBeauty.setEnable(z2);
                boolean zIsCollectionType = composerBeauty.isCollectionType();
                if (zIsCollectionType) {
                    List<ComposerBeauty> childList = composerBeauty.getChildList();
                    if (childList != null) {
                        Iterator<ComposerBeauty> it3 = childList.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                next = it3.next();
                                if (next.getSelected()) {
                                    break;
                                }
                            } else {
                                next = null;
                                break;
                            }
                        }
                        ComposerBeauty composerBeauty2 = next;
                        if (composerBeauty2 != null) {
                            LJJIII(composerBeauty2, z);
                        }
                    }
                } else if (!zIsCollectionType) {
                    LJJIII(composerBeauty, z);
                } else {
                    throw new C1954807lC();
                }
            }
        }
    }

    @Override // X.C12I9
    public final void bf(AwS573S0100000_29 awS573S0100000_29, C12IE c12ie) {
        C19729912Hh c19729912Hh = this.LJFF;
        C054G c054g = this.LJJIIJ;
        AnonymousClass0956 anonymousClass0956 = c19729912Hh.LIZ;
        if (anonymousClass0956 != null && !anonymousClass0956.isCancelled()) {
            anonymousClass0956.LIZIZ(null);
        }
        c19729912Hh.LIZ = C23250099c.LIZLLL(c054g, null, null, new C314020CSq(this, awS573S0100000_29, this, c12ie, null), 3);
    }

    @Override // X.C12I9
    public final void me(String str, boolean z) {
        this.LIZ.me(str, z);
    }

    @Override // X.C12I9
    public final boolean oe(String str, boolean z) {
        return this.LIZ.oe(str, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0049  */
    @Override // X.C12I9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void re(X.C19729512Hd r12, X.C12IG r13) {
        /*
            r11 = this;
            r0 = 137927(0x21ac7, float:1.93277E-40)
            boolean r3 = com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJI(r0)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "sendRequest start. panel:"
            r1.append(r0)
            java.lang.String r0 = r12.LIZ
            r1.append(r0)
            java.lang.String r0 = " abGroup:"
            r1.append(r0)
            int r0 = r12.LIZJ
            r1.append(r0)
            java.lang.String r0 = " useCheckUpdateMergedApi:"
            r1.append(r0)
            boolean r0 = r12.LIZIZ
            r1.append(r0)
            java.lang.String r0 = " useServerFilter:"
            r1.append(r0)
            boolean r0 = r12.LIZLLL
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C19570511hX.LIZIZ(r0)
            com.ss.android.ugc.aweme.tools.beauty.env.BeautyContext r0 = com.ss.android.ugc.aweme.tools.beauty.env.BeautyContext.INSTANCE
            android.content.Context r0 = r0.getContext()
            r9 = 1
            if (r0 == 0) goto L49
            boolean r0 = X.C790050Uyx.LIZ(r0)     // Catch: java.lang.Exception -> L5f
            if (r0 != 0) goto L7a
        L49:
            int r0 = r12.LIZJ
            boolean r0 = r11.LJIIZILJ(r0)
            if (r0 != 0) goto L7a
            java.lang.String r0 = "LJT sendRequest: no network and cached abGroup matched, loadBundleBeauty directly"
            X.C19570511hX.LIZIZ(r0)
            r11.LJIJI(r9)
            if (r3 == 0) goto L5e
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()
        L5e:
            return
        L5f:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "isNetworkAvailable error, "
            r1.append(r0)
            java.lang.String r0 = android.util.Log.getStackTraceString(r2)
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C19570511hX.LIZ(r0)
        L7a:
            X.0C64 r2 = X.C0C64.LJIILLIIL()
            java.lang.String r1 = "creative_tools_beauty_fix_bug"
            r0 = 31744(0x7c00, float:4.4483E-41)
            boolean r0 = r2.LJIIIZ(r0, r1, r9, r9)
            if (r0 == 0) goto Lbb
            int r0 = r12.LIZJ
            boolean r0 = r11.LJIIZILJ(r0)
            if (r0 != 0) goto Lbb
            X.12HT r0 = r11.LIZ
            boolean r0 = r0.LJIIIZ()
            if (r0 != 0) goto L9d
            X.12HT r0 = r11.LIZ
            r0.LJIILJJIL()
        L9d:
            X.01GW r0 = r11.LJIILIIL
            java.lang.Object r4 = r0.getValue()
            X.0sev r4 = (X.InterfaceC1635390sev) r4
            java.lang.String r5 = r12.LIZ
            boolean r6 = r12.LIZIZ
            int r7 = r12.LIZJ
            boolean r8 = r12.LIZLLL
            X.12HB r10 = new X.12HB
            r10.<init>(r11, r12, r13)
            X.C1635120seU.LJIIIIZZ(r4, r5, r6, r7, r8, r9, r10)
            if (r3 == 0) goto Lba
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()
        Lba:
            return
        Lbb:
            boolean r9 = r12.LJ
            goto L9d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12HN.re(X.12Hd, X.12IG):void");
    }

    @Override // X.C12I9
    public final void ve(ComposerBeauty composerBeauty, InterfaceC19729612He interfaceC19729612He) {
        ArrayList arrayList;
        BeautyCategory next;
        ComposerBeauty composerBeautyLIZIZ;
        List<ComposerBeauty> childList;
        boolean z = false;
        if (this.LJIILL.LIZLLL(composerBeauty, false) && C12HP.LJ(composerBeauty)) {
            if (!C12HP.LJI(composerBeauty) || composerBeauty.getSelected()) {
                List listXe = Xe(composerBeauty, false, false, false);
                if (C12HP.LJI(composerBeauty)) {
                    List<BeautyCategory> list = this.LJI;
                    Object obj = null;
                    if (!C12HP.LJI(composerBeauty)) {
                        arrayList = new ArrayList();
                    } else if (composerBeauty.isBeautyMode()) {
                        arrayList = new ArrayList();
                        if (list != null) {
                            for (BeautyCategory beautyCategory : list) {
                                Iterator<ComposerBeauty> it2 = beautyCategory.getBeautyList().iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        ComposerBeauty next2 = it2.next();
                                        if (Intrinsics.LJFF(next2, composerBeauty)) {
                                            if (next2 != null) {
                                                arrayList.addAll(beautyCategory.getBeautyList());
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else if (C12HP.LIZLLL(composerBeauty)) {
                        arrayList = new ArrayList();
                        if (C12HP.LIZLLL(composerBeauty) && (composerBeautyLIZIZ = C12HP.LIZIZ(composerBeauty, list)) != null && (childList = composerBeautyLIZIZ.getChildList()) != null && (!childList.isEmpty())) {
                            arrayList.addAll(childList);
                        }
                    } else if (C12HP.LJFF(composerBeauty)) {
                        arrayList = new ArrayList();
                        if (C12HP.LJFF(composerBeauty) && list != null) {
                            Iterator<BeautyCategory> it3 = list.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    next = it3.next();
                                    if (Intrinsics.LJFF(next.getCategoryResponse().getId(), composerBeauty.getCategoryId())) {
                                        break;
                                    }
                                } else {
                                    next = null;
                                    break;
                                }
                            }
                            BeautyCategory beautyCategory2 = next;
                            if (beautyCategory2 != null) {
                                arrayList.addAll(beautyCategory2.getBeautyList());
                            }
                        }
                    } else {
                        arrayList = new ArrayList();
                    }
                    if (!arrayList.isEmpty()) {
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it4 = arrayList.iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                break;
                            }
                            Object next3 = it4.next();
                            ComposerBeauty composerBeauty2 = (ComposerBeauty) next3;
                            if (composerBeauty2.getAdd2Nodes() && !Intrinsics.LJFF(composerBeauty2, composerBeauty)) {
                                obj = next3;
                                break;
                            }
                        }
                        ComposerBeauty composerBeauty3 = (ComposerBeauty) obj;
                        if (composerBeauty3 != null) {
                            composerBeauty3.setAdd2Nodes(false);
                            ye(new C787110UuD(composerBeauty.getEffect().getEffectId(), 1));
                            arrayList2.addAll(Xe(composerBeauty3, false, false, true));
                            C1499920p8Q<ComposerBeauty> value = this.LJIJI.getValue();
                            if (value != null) {
                                value.remove(composerBeauty3);
                            }
                        }
                        composerBeauty.setAdd2Nodes(true);
                        ff(new C787110UuD(composerBeauty.getEffect().getEffectId(), 1));
                        interfaceC19729612He.LIZ(arrayList2, listXe);
                        C12HW.LIZ(this, new C12HY(arrayList2, listXe));
                        LJJIIZ(composerBeauty);
                        this.LIZ.LJII(composerBeauty.needFaceDetect());
                    }
                } else {
                    composerBeauty.setAdd2Nodes(true);
                    ff(new C787110UuD(composerBeauty.getEffect().getEffectId(), 1));
                    interfaceC19729612He.LIZIZ(listXe);
                    C12HW.LIZ(this, new C19729212Ha(listXe));
                    LJJIIZ(composerBeauty);
                    this.LIZ.LJII(composerBeauty.needFaceDetect());
                }
                Function1<? super Boolean, Unit> function1 = this.LIZLLL;
                if (function1 != null && C12HP.LJFF(composerBeauty)) {
                    List<ComposerBeautyExtraBeautify.ItemsBean> items = composerBeauty.getBeautifyExtra().getItems();
                    if (items == null || items.isEmpty()) {
                        z = true;
                    }
                    function1.invoke(Boolean.valueOf(z));
                }
            }
        }
    }

    public static final void LJIIL(ComposerBeauty composerBeauty, C12HN c12hn, List<ComposerBeauty> list) {
        if (!c12hn.Xe(composerBeauty, false, false, false).isEmpty()) {
            ((ArrayList) list).add(composerBeauty);
        }
    }

    @Override // X.C12I9
    public final BeautifyUsedInfo Fe(boolean z, boolean z2, Function1 function1) {
        if (z2) {
            ((ArrayList) this.LJIJJLI).clear();
        }
        if (z && this.LIZIZ.beautyMobAddConfig) {
            C23250099c.LIZLLL(this.LJJIIJ, C0PEM.LIZJ, null, new C12HL(this, function1, null), 2);
        }
        BeautifyUsedInfo beautifyUsedInfoLJIILIIL = LJIILIIL();
        beautifyUsedInfoLJIILIIL.getClass();
        ArrayList arrayList = new ArrayList();
        ArrayList<BeautifyUesTabInfo> arrayList2 = new ArrayList();
        arrayList2.addAll(beautifyUsedInfoLJIILIIL.info);
        for (BeautifyUesTabInfo beautifyUesTabInfo : arrayList2) {
            arrayList.add(new BeautifyUesTabInfo(beautifyUesTabInfo.tabName, beautifyUesTabInfo.categoryName, beautifyUesTabInfo.categoryDiy, beautifyUesTabInfo.parentNameList, beautifyUesTabInfo.parentValueList));
        }
        return new BeautifyUsedInfo(arrayList);
    }

    @Override // X.C12I9
    public final float gf(ComposerBeauty composerBeauty, String str, float f) {
        return this.LIZ.LJIIL(composerBeauty, this.LJJIIJZLJL, str, f);
    }

    @Override // X.C12I9
    public final void se(ComposerBeauty composerBeauty, String str, float f) {
        this.LIZ.LJI(composerBeauty, this.LJJIIJZLJL, str, f);
        LJIILL(composerBeauty);
        Ce();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0100  */
    @Override // X.C12I9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.ss.android.ugc.aweme.dependence.beauty.data.BeautyComposerInfo> Xe(com.ss.android.ugc.aweme.beauty.ComposerBeauty r19, boolean r20, boolean r21, boolean r22) {
        /*
            Method dump skipped, instruction units count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12HN.Xe(com.ss.android.ugc.aweme.beauty.ComposerBeauty, boolean, boolean, boolean):java.util.List");
    }

    /* JADX WARN: Type inference failed for: r0v39, types: [X.12HH] */
    public C12HN(C12HT c12ht, BeautyFilterConfig beautyFilterConfig, Gson gson, Function0<? extends InterfaceC1635390sev> function0, Function1<? super Boolean, Unit> function1) {
        Map<String, Integer> c830490Whz;
        this.LIZ = c12ht;
        this.LIZIZ = beautyFilterConfig;
        this.LIZJ = gson;
        this.LIZLLL = function1;
        C01GW c01gwLIZ = C452501pT.LIZ(EnumC452301pR.SYNCHRONIZED, new AwS573S0100000_29(function0, (Function0<? extends Banner>) 840));
        this.LJIILIIL = c01gwLIZ;
        this.LJIILJJIL = new SafeMutableLiveData<>();
        this.LJIILL = new C19570611hY((InterfaceC1635390sev) c01gwLIZ.getValue());
        this.LJIIZILJ = new SafeMutableLiveData<>();
        SafeMutableLiveData<Map<String, Integer>> safeMutableLiveData = new SafeMutableLiveData<>();
        if (beautyFilterConfig.beautyDownloadToThread) {
            c830490Whz = new ConcurrentHashMap<>();
        } else {
            c830490Whz = new C830490Whz<>();
        }
        safeMutableLiveData.setValue(c830490Whz);
        this.LJIJ = safeMutableLiveData;
        this.LJIJI = new SafeMutableLiveData<>();
        this.LJIJJ = new C12HS();
        this.LJIJJLI = new ArrayList();
        this.LJIL = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(323));
        this.LJJ = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(324));
        this.LJJI = C452501pT.LIZIZ(new AwS573S0100000_29(this, 839));
        this.LJJIFFI = new C19729312Hb();
        this.LJJII = new C19730612Ho();
        this.LJJIII = true;
        C1DFK c1dfkLIZ = C23118094a.LIZ();
        this.LJJIIJ = C2296808zG.LIZ(C2107608Nm.LIZ.plus(c1dfkLIZ).plus(new C19775412Yu(CoroutineExceptionHandler.LJJLIL, 0)));
        this.LJJIIJZLJL = EnumC19731112Ht.FEMALE;
        this.LJJIIZ = new ArrayList();
        LJIILJJIL().LIZLLL = this.LJJIIJZLJL;
        if (!C255880A1a.LIZ()) {
            LJIJI(false);
        }
        this.LJJIIZI = true;
        this.LJJIJ = new SafeMutableLiveData<>();
        this.LJJIJIIJI = new InterfaceC19568511hD<C19570211hU, Void>() { // from class: X.12HH
            @Override // X.InterfaceC19568511hD
            public final void LIZJ(C19570211hU c19570211hU) {
                this.LIZ.LJJIJ(c19570211hU.LIZ);
            }

            @Override // X.InterfaceC19568511hD
            public final void LIZIZ(C19570211hU c19570211hU, Void r10) {
                C19570211hU c19570211hU2 = c19570211hU;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("[downloadEffects] success effect: ");
                sbLIZ.append(c19570211hU2.LIZ.getEffect());
                C19570511hX.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
                this.LIZ.LJJIJ(c19570211hU2.LIZ);
                ArrayList arrayList = new ArrayList();
                List<BeautyCategory> list = this.LIZ.LJI;
                C12HN c12hn = this.LIZ;
                Iterator<BeautyCategory> it2 = list.iterator();
                while (it2.hasNext()) {
                    for (ComposerBeauty composerBeauty : it2.next().getBeautyList()) {
                        if (composerBeauty.isCollectionType()) {
                            List<ComposerBeauty> childList = composerBeauty.getChildList();
                            if (childList != null) {
                                for (ComposerBeauty composerBeauty2 : childList) {
                                    arrayList.addAll(c12hn.LJJIJIIJIL(composerBeauty2, c19570211hU2));
                                    if (Intrinsics.LJFF(composerBeauty2.getEffect().getUnzipPath(), c19570211hU2.LIZ.getEffect().getUnzipPath())) {
                                        C12HI.LIZ(c12hn.LJIILJJIL, Collections.singletonList(composerBeauty2));
                                    }
                                }
                            }
                        } else {
                            arrayList.addAll(c12hn.LJJIJIIJIL(composerBeauty, c19570211hU2));
                            if (Intrinsics.LJFF(composerBeauty.getEffect().getUnzipPath(), c19570211hU2.LIZ.getEffect().getUnzipPath())) {
                                C12HI.LIZ(c12hn.LJIILJJIL, Collections.singletonList(composerBeauty));
                            }
                        }
                    }
                }
                C12HI.LIZ(this.LIZ.LJJIJ, arrayList);
            }

            @Override // X.InterfaceC19568511hD
            public final void LIZ(C19570211hU c19570211hU, Integer num, String str, Exception exc) {
                C19570211hU c19570211hU2 = c19570211hU;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("[downloadEffects] failed effect: ");
                sbLIZ.append(c19570211hU2.LIZ.getEffect());
                sbLIZ.append(", code: ");
                sbLIZ.append(num);
                sbLIZ.append(", msg: ");
                sbLIZ.append(str);
                sbLIZ.append(", exception: ");
                sbLIZ.append(Log.getStackTraceString(exc));
                C19570511hX.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                this.LIZ.LJJIJ(c19570211hU2.LIZ);
            }
        };
    }

    public final ComposerBeauty LJIIJJI(Effect effect, String str, boolean z, String str2, String str3, String str4, BeautyCategoryExtra beautyCategoryExtra) {
        boolean z2;
        String beautify;
        if (1 == effect.getEffectType()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            ArrayList arrayList = new ArrayList();
            List<Effect> childEffects = effect.getChildEffects();
            if (childEffects != null) {
                Iterator<Effect> it2 = childEffects.iterator();
                while (it2.hasNext()) {
                    ComposerBeauty composerBeautyLJIIJJI = LJIIJJI(it2.next(), str, z, effect.getEffectId(), effect.getName(), effect.getResourceId(), beautyCategoryExtra);
                    if (composerBeautyLJIIJJI != null) {
                        arrayList.add(composerBeautyLJIIJJI);
                    }
                }
            }
            ComposerBeauty composerBeauty = new ComposerBeauty(effect, new ComposerBeautyExtra(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, false, null, null, false, false, 0, null, null, null, 16777215, null), new ComposerBeautyExtraBeautify(null, null, 3, null), str, z, true, null, null, null, arrayList, false, false, false, 0, 0, false, false, false, 0, 0, 0, beautyCategoryExtra, false, 6290880, null);
            if (!C2281551ESb.LIZIZ.LJIIZILJ()) {
                composerBeauty.setDownloadState(this.LJIILL.LIZIZ(composerBeauty, false));
                return composerBeauty;
            }
            composerBeauty.setDownloadStateLazy(new AwS430S0200000_29(composerBeauty, this, 79));
            return composerBeauty;
        }
        String extra = effect.getExtra();
        if (extra != null && extra.length() != 0) {
            try {
                ComposerBeautyExtra composerBeautyExtra = (ComposerBeautyExtra) this.LIZJ.LJII(effect.getExtra(), ComposerBeautyExtra.class);
                if (composerBeautyExtra != null) {
                    String str5 = this.LIZIZ.extraJson;
                    if (!Intrinsics.LJFF(str5, "beautify") && Intrinsics.LJFF(str5, "beautyConfig")) {
                        beautify = composerBeautyExtra.getBeautyConfig();
                    } else {
                        beautify = composerBeautyExtra.getBeautify();
                    }
                    if (beautify != null && beautify.length() != 0) {
                        try {
                            ComposerBeautyExtraBeautify composerBeautyExtraBeautify = (ComposerBeautyExtraBeautify) this.LIZJ.LJII(beautify, ComposerBeautyExtraBeautify.class);
                            if (composerBeautyExtraBeautify != null) {
                                Function1<? super ComposerBeautyExtraBeautify, Unit> function1 = this.LIZIZ.getChildrenInitBeautyValueVBlock;
                                if (function1 != null) {
                                    function1.invoke(composerBeautyExtraBeautify);
                                }
                                ComposerBeauty composerBeauty2 = new ComposerBeauty(effect, composerBeautyExtra, composerBeautyExtraBeautify, str, z, false, str2, str3, str4, null, false, false, false, 0, 0, false, false, false, 0, 0, 0, beautyCategoryExtra, false, 6290944, null);
                                if (!C2281551ESb.LIZIZ.LJIIZILJ()) {
                                    composerBeauty2.setDownloadState(this.LJIILL.LIZIZ(composerBeauty2, false));
                                    return composerBeauty2;
                                }
                                composerBeauty2.setDownloadStateLazy(new AwS430S0200000_29(composerBeauty2, this, 80));
                                return composerBeauty2;
                            }
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("parseComposerBeautyExtraBeautify , ");
                            sbLIZ.append(Log.getStackTraceString(e));
                            C19570511hX.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                        }
                    }
                    return null;
                }
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("parseComposerBeautyExtra ,");
                sbLIZ2.append(Log.getStackTraceString(e2));
                C19570511hX.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
            }
        }
        return null;
    }
}
