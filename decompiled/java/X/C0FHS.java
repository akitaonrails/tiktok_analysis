package X;

import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.editSticker.text.font.TextFontStyleData;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextFontModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextMotionData;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.ss.android.ugc.effectmanager.effect.model.EffectKt;
import ge.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS119S1100000_5;
import kotlin.jvm.internal.AwS20S0001000_5;
import kotlin.jvm.internal.AwS53S1000000_2;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.AwS74S1300000_5;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0FHS, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FHS extends i<InterfaceC385920FBe, C0FOP, C387490FHf, C387450FHb> implements InterfaceC379610EuV, InterfaceC385920FBe {
    public static final C387480FHe LLJJL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJLIIIJLLLLLLLZ;
    public final boolean LLJILJILJ;
    public final C1DRG LLJILLL;
    public String LLJJ;
    public String LLJJI;
    public List<TextFontStyleData> LLJJIII;
    public final InterfaceC1731706qJ LLJJIJI;
    public int LLJJIJIIJIL;
    public C0FHQ LLJJIJIL;
    public TextStickerModel LLJJJ;
    public EnumC371580EhY LLJJJIL;
    public C09AE LLJJJJ;
    public final Function0<C387490FHf> LLJJJJJIL;
    public final Function0<C387450FHb> LLJJJJLIIL;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0FHe] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0FHS.class, "textMobService", "getTextMobService()Lcom/ss/android/ugc/aweme/tools/sticker/core/text/ITextStickerMobService;", 0);
        C13LE.LIZ.getClass();
        LLJJLIIIJLLLLLLLZ = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJJL = new Object() { // from class: X.0FHe
        };
    }

    public final void LLILZLL() {
        i3(AFwS234S0000000_5.get$arr$(128));
        P4(true, false);
    }

    public final void d6() {
        if (C2281551ESb.LIZIZ.LJJIJ()) {
            C1627000sRO.LIZIZ(C1664590tQ1.LJII(this), false);
        }
    }

    @Override // X.InterfaceC385920FBe
    public void la1() {
        i3(AFwS234S0000000_5.get$arr$(127));
        C09AE c09ae = this.LLJJJJ;
        if (c09ae != null) {
            c09ae.LIZIZ(null);
        }
    }

    public final C0FGR v5() {
        return (C0FGR) this.LLJJIJI.getValue(this, LLJJLIIIJLLLLLLLZ[0]);
    }

    private final void K4() {
        C0FGS c0fgs;
        List<C0FGT> list;
        C0FGT c0fgt;
        Effect effect;
        List<C0FGS> list2 = T2().LIZIZ;
        if (list2 == null || (c0fgs = (C0FGS) C13LP.LJJJLL(list2)) == null || (list = c0fgs.LIZ) == null || (c0fgt = (C0FGT) C13LP.LJJJLL(list)) == null || (effect = c0fgt.LIZ) == null) {
            return;
        }
        C387180FGa c387180FGa = new C387180FGa(effect.getEffectId(), effect.getResourceId());
        i3(new AwS584S0100000_5(c387180FGa, 198));
        TextFontStyleData textFontStyleDataD5 = d5(c387180FGa);
        if (textFontStyleDataD5 != null) {
            D5(this, textFontStyleDataD5, true);
        }
    }

    private final String n5() {
        C0FGS c0fgs;
        Integer num = T2().LIZLLL;
        int iIntValue = num != null ? num.intValue() : 0;
        List<C0FGS> list = T2().LIZIZ;
        if (list == null || (c0fgs = (C0FGS) C13LP.LJJJLZIJ(iIntValue, list)) == null) {
            return null;
        }
        return c0fgs.LIZIZ;
    }

    @Override // X.InterfaceC385920FBe
    public void r00() {
        show();
        i3(AFwS234S0000000_5.get$arr$(129));
        List<C0FGS> list = T2().LIZIZ;
        if (list == null || list.isEmpty()) {
            P4(false, false);
        } else {
            S5(T2(), true);
        }
    }

    @Override // X.InterfaceC385920FBe
    public void r4() {
        S5(T2(), true);
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJILLL;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C387490FHf> o2() {
        return this.LLJJJJJIL;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C387450FHb> w2() {
        return this.LLJJJJLIIL;
    }

    private final C387180FGa U5(List<C0FGS> list) {
        boolean z;
        Object next;
        Effect effect;
        String resourceId;
        String str = this.LLJJJ.getFontModel().fontId;
        if (str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        String effectId = null;
        if (z) {
            String str2 = this.LLJJJ.getFontModel().fontResId;
            if (str2.length() != 0) {
                effectId = str2;
            }
            return new C387180FGa(str, effectId);
        }
        String str3 = this.LLJJJ.getFontModel().fontResId;
        if (str3.length() > 0) {
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                Iterator<C0FGS> it2 = list.iterator();
                while (it2.hasNext()) {
                    C19719612Di.LJJI(it2.next().LIZ, arrayList);
                }
                Iterator it3 = arrayList.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        next = it3.next();
                        Effect effect2 = ((C0FGT) next).LIZ;
                        if (effect2 != null) {
                            resourceId = effect2.getResourceId();
                        } else {
                            resourceId = null;
                        }
                        if (Intrinsics.LJFF(resourceId, str3)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                C0FGT c0fgt = (C0FGT) next;
                if (c0fgt != null && (effect = c0fgt.LIZ) != null) {
                    effectId = effect.getEffectId();
                }
            }
            return new C387180FGa(effectId, str3);
        }
        return new C387180FGa(null, null);
    }

    private final TextFontStyleData d5(C387180FGa c387180FGa) {
        TextFontStyleData next;
        Iterator<TextFontStyleData> it2 = this.LLJJIII.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                TextFontStyleData textFontStyleData = next;
                if (Intrinsics.LJFF(textFontStyleData.LJ.getEffectId(), c387180FGa.LIZ) || Intrinsics.LJFF(EffectKt.expectedMd5(textFontStyleData.LJ), c387180FGa.LIZ) || Intrinsics.LJFF(textFontStyleData.LJ.getResourceId(), c387180FGa.LIZIZ)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        return next;
    }

    private final TextFontStyleData k5(Effect effect) {
        TextFontStyleData textFontStyleData = null;
        if (effect == null) {
            return null;
        }
        Iterator<TextFontStyleData> it2 = this.LLJJIII.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            TextFontStyleData next = it2.next();
            if (Intrinsics.LJFF(next.LJ.getExtra(), effect.getExtra())) {
                textFontStyleData = next;
                break;
            }
        }
        return textFontStyleData;
    }

    private final boolean x5(TextFontStyleData textFontStyleData) {
        if (C0FI2.LJJI(textFontStyleData.fileName) != null) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC385920FBe
    public void GE(TextStickerModel textStickerModel) {
        if (textStickerModel.getFontModel().fontId.length() == 0) {
            List<C0FGS> list = T2().LIZIZ;
            if (list != null && !list.isEmpty()) {
                K4();
            } else {
                P4(false, true);
            }
        }
    }

    @Override // X.InterfaceC385920FBe
    public void LJJLIIIJJIZ(TextStickerModel textStickerModel) {
        this.LLJJJ = textStickerModel;
        S5(T2(), false);
    }

    @Override // X.InterfaceC385920FBe
    public void Pw(C0FHQ c0fhq) {
        this.LLJJIJIL = c0fhq;
    }

    @Override // X.InterfaceC385920FBe
    public void V0(int i) {
        i3(new AwS20S0001000_5(i, 8));
    }

    @Override // X.InterfaceC385920FBe
    public void Y0(EnumC371580EhY enumC371580EhY) {
        this.LLJJJIL = enumC371580EhY;
        EnumC371580EhY enumC371580EhY2 = EnumC371580EhY.SHOW;
        if (enumC371580EhY == enumC371580EhY2) {
            i3(AFwS234S0000000_5.get$arr$(130));
        } else {
            if (T2().LIZ != enumC371580EhY2) {
                return;
            }
            i3(AFwS234S0000000_5.get$arr$(131));
            i3(AFwS234S0000000_5.get$arr$(132));
        }
    }

    public final void onPageSelected(int i) {
        String str;
        C0FGZ c0fgz;
        i3(new AwS20S0001000_5(i, 9));
        if (t5(this.LLJJJ.getFontModel().fontCategoryId, T2().LIZIZ) == i) {
            r4();
        }
        C0FGR c0fgrV5 = v5();
        if (c0fgrV5 != null) {
            List<C0FGZ> list = T2().LIZJ;
            if (list != null && (c0fgz = (C0FGZ) C13LP.LJJJLZIJ(i, list)) != null) {
                str = c0fgz.LIZ;
            } else {
                str = null;
            }
            c0fgrV5.LJIJJ(str, "font_pager");
        }
    }

    private final void O4(TextFontStyleData textFontStyleData, final C0FGT c0fgt) {
        String panel;
        Effect effect = textFontStyleData.LJ;
        if (effect != null && (panel = effect.getPanel()) != null) {
            C0FI2 c0fi2LJIJJLI = C0FI2.LJIJJLI(panel);
            C1664590tQ1.LJII(this);
            C15O7.LIZJ(new C0FHX(System.currentTimeMillis(), new C0FID() { // from class: X.0FHR
                @Override // X.C0FID
                public final void LIZJ() {
                    this.LL.d6();
                }

                @Override // X.C0FID
                public final void LIZLLL(TextFontStyleData textFontStyleData2, boolean z) {
                    if (textFontStyleData2 != null) {
                        C0FHS.D5(this.LL, textFontStyleData2, false);
                        if (C2281551ESb.LIZIZ.LJJIJ()) {
                            this.LL.i3(new AwS584S0100000_5(c0fgt, 200));
                            return;
                        }
                        return;
                    }
                    this.LL.d6();
                }
            }, c0fi2LJIJJLI, textFontStyleData, new C0FIA() { // from class: X.0FHd
                @Override // X.C0FIA
                public final void LIZ(TextMotionData textMotionData) {
                }

                @Override // X.C0FIA
                public final void LIZIZ() {
                }

                @Override // X.C0FIA
                public final void LJ() {
                }

                @Override // X.C0FIA
                public final void onFail() {
                }
            }, Boolean.valueOf(!C298130BmN.LIZ())));
        }
    }

    private final void P4(boolean z, boolean z2) {
        if (z) {
            C0FI2.LJJJI();
        }
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
        C1DFH c1dfh = C0PEM.LIZ;
        C099G c099gLIZIZ = C23250099c.LIZIZ(lifecycleScope, c1dfh, null, new C0FHW(this, null), 2);
        if (!this.LLJILJILJ) {
            C09AE c09ae = this.LLJJJJ;
            if (c09ae != null) {
                c09ae.LIZIZ(null);
            }
            i3(AFwS234S0000000_5.get$arr$(125));
            this.LLJJJJ = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), c1dfh, null, new C0FHU(this, c099gLIZIZ, z2, null), 2);
            return;
        }
        C099G c099gLIZIZ2 = C23250099c.LIZIZ(LifecycleOwnerKt.getLifecycleScope(this), c1dfh, null, new C0FHV(this, null), 2);
        C09AE c09ae2 = this.LLJJJJ;
        if (c09ae2 != null) {
            c09ae2.LIZIZ(null);
        }
        i3(AFwS234S0000000_5.get$arr$(126));
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), c1dfh, null, new C0FHT(c099gLIZIZ, c099gLIZIZ2, this, z2, null), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void S5(X.C387490FHf r7, boolean r8) {
        /*
            r6 = this;
            java.util.List<X.0FGS> r0 = r7.LIZIZ
            if (r0 == 0) goto L54
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L54
            java.util.List<X.0FGS> r0 = r7.LIZIZ
            X.0FGa r3 = r6.U5(r0)
            java.lang.String r5 = r3.LIZ
            java.lang.String r4 = r3.LIZIZ
            com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel r0 = r6.LLJJJ
            com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextFontModel r0 = r0.getFontModel()
            java.lang.String r1 = r0.fontCategoryId
            java.util.List<X.0FGS> r0 = r7.LIZIZ
            int r2 = r6.t5(r1, r0)
            java.lang.Integer r0 = r7.LIZLLL
            if (r0 == 0) goto L4a
            int r0 = r0.intValue()
            if (r2 != r0) goto L4a
            X.0FGa r0 = r7.LJ
            r1 = 0
            if (r0 == 0) goto L48
            java.lang.String r0 = r0.LIZ
        L33:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r5, r0)
            if (r0 != 0) goto L45
            X.0FGa r0 = r7.LJ
            if (r0 == 0) goto L3f
            java.lang.String r1 = r0.LIZIZ
        L3f:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r4, r1)
            if (r0 == 0) goto L4a
        L45:
            if (r8 != 0) goto L4a
            return
        L48:
            r0 = r1
            goto L33
        L4a:
            kotlin.jvm.internal.AwS113S0101000_5 r1 = new kotlin.jvm.internal.AwS113S0101000_5
            r0 = 1
            r1.<init>(r2, r3, r0)
            r6.i3(r1)
            return
        L54:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0FHS.S5(X.0FHf, boolean):void");
    }

    private final int t5(String str, List<C0FGS> list) {
        int iIntValue;
        if (list != null) {
            Iterator<C0FGS> it2 = list.iterator();
            int i = 0;
            while (true) {
                if (it2.hasNext()) {
                    if (Intrinsics.LJFF(it2.next().LIZIZ, str)) {
                        break;
                    }
                    i++;
                } else {
                    i = -1;
                    break;
                }
            }
            Integer numValueOf = Integer.valueOf(i);
            if (numValueOf == null || (iIntValue = numValueOf.intValue()) < 0) {
                return 0;
            }
            return iIntValue;
        }
        return 0;
    }

    public final List<C0FGS> C5(List<C0FGS> list, List<C0FGS> list2) {
        InterfaceC387380FGu interfaceC387380FGu;
        if (C0FJL.LIZ()) {
            final String appLanguage = C0CHQ.LIZ().getAppLanguage();
            interfaceC387380FGu = new InterfaceC387380FGu(appLanguage) { // from class: X.0FHP
                public final String LIZ;

                {
                    this.LIZ = appLanguage;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r8v0, types: [java.util.ArrayList, java.util.Collection] */
                /* JADX WARN: Type inference failed for: r8v1, types: [java.util.List] */
                /* JADX WARN: Type inference failed for: r8v2 */
                @Override // X.InterfaceC387380FGu
                public final List<C0FGS> LIZ(List<C0FGS> list3, List<C0FGS> list4) {
                    String extra;
                    String extra2;
                    String lowerCase = this.LIZ.toLowerCase(Locale.ROOT);
                    C0FGS c0fgs = (C0FGS) C0FJK.LIZ(lowerCase, list3, AFwS234S0000000_5.get$arr$(123));
                    if (c0fgs == null) {
                        return list4;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    ArrayList arrayList = new ArrayList();
                    for (C0FGT c0fgt : c0fgs.LIZ) {
                        Effect effect = c0fgt.LIZ;
                        if (effect != null && (extra2 = effect.getExtra()) != null) {
                            try {
                                JSONObject jSONObject = new JSONObject(extra2);
                                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("original_panel_category");
                                int i = 0;
                                if (jSONArrayOptJSONArray != null) {
                                    int length = jSONArrayOptJSONArray.length();
                                    for (int i2 = 0; i2 < length; i2++) {
                                        String string = JSONArrayProtectorUtils.getString(jSONArrayOptJSONArray, i2);
                                        Object arrayList2 = linkedHashMap2.get(string);
                                        if (arrayList2 == null) {
                                            arrayList2 = new ArrayList();
                                            linkedHashMap2.put(string, arrayList2);
                                        }
                                        ((List) arrayList2).add(c0fgt);
                                    }
                                }
                                JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("font_language");
                                if (jSONArrayOptJSONArray2 != null) {
                                    int length2 = jSONArrayOptJSONArray2.length();
                                    while (true) {
                                        if (i >= length2) {
                                            break;
                                        }
                                        if (Intrinsics.LJFF(JSONArrayProtectorUtils.getString(jSONArrayOptJSONArray2, i).toLowerCase(Locale.ROOT), lowerCase)) {
                                            arrayList.add(c0fgt);
                                            break;
                                        }
                                        i++;
                                    }
                                }
                                C189200o6.m2constructorimpl(Unit.LIZ);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                C189200o6.m2constructorimpl(new C098200Yq(th));
                            }
                        }
                    }
                    for (C0FGS c0fgs2 : list4) {
                        List<C0FGT> list5 = c0fgs2.LIZ;
                        HashSet hashSet = new HashSet();
                        ?? arrayList3 = new ArrayList();
                        for (C0FGT c0fgt2 : list5) {
                            Effect effect2 = c0fgt2.LIZ;
                            if (effect2 != null) {
                                extra = effect2.getExtra();
                            } else {
                                extra = null;
                            }
                            if (hashSet.add(extra)) {
                                arrayList3.add(c0fgt2);
                            }
                        }
                        List list6 = (List) linkedHashMap2.get(c0fgs2.LIZIZ);
                        if (list6 != null) {
                            list6.addAll(arrayList3);
                            arrayList3 = list6;
                        }
                        String str = c0fgs2.LIZIZ;
                        linkedHashMap.put(str, new C0FGS(arrayList3, str, c0fgs2.LIZJ, c0fgs2.LIZLLL));
                    }
                    ArrayList arrayList4 = new ArrayList(linkedHashMap.values());
                    if ((!arrayList4.isEmpty()) && (!arrayList.isEmpty())) {
                        ListProtector.add(arrayList4, 1, new C0FGS(arrayList, c0fgs.LIZIZ, c0fgs.LIZJ, c0fgs.LIZLLL));
                    }
                    return arrayList4;
                }
            };
        } else {
            interfaceC387380FGu = new InterfaceC387380FGu() { // from class: X.0FGf
                @Override // X.InterfaceC387380FGu
                public final List<C0FGS> LIZ(List<C0FGS> list3, List<C0FGS> list4) {
                    List<C0FGT> list5;
                    String extra;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (C0FGS c0fgs : list4) {
                        linkedHashMap.put(c0fgs.LIZIZ, c0fgs);
                    }
                    ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list3, 10));
                    for (C0FGS c0fgs2 : list3) {
                        ArrayList arrayList2 = new ArrayList(c0fgs2.LIZ);
                        C0FGS c0fgs3 = (C0FGS) linkedHashMap.get(c0fgs2.LIZIZ);
                        if (c0fgs3 != null && (list5 = c0fgs3.LIZ) != null) {
                            arrayList2.addAll(list5);
                            HashSet hashSet = new HashSet();
                            ArrayList arrayList3 = new ArrayList();
                            for (Object obj : arrayList2) {
                                Effect effect = ((C0FGT) obj).LIZ;
                                if (effect != null) {
                                    extra = effect.getExtra();
                                } else {
                                    extra = null;
                                }
                                if (hashSet.add(extra)) {
                                    arrayList3.add(obj);
                                }
                            }
                        }
                        arrayList.add(new C0FGS(arrayList2, c0fgs2.LIZIZ, c0fgs2.LIZJ, c0fgs2.LIZLLL));
                    }
                    return arrayList;
                }
            };
        }
        return interfaceC387380FGu.LIZ(list, list2);
    }

    public final void F4(List<C0FGS> list, boolean z) {
        C387180FGa c387180FGaU5;
        TextFontStyleData textFontStyleDataD5;
        Effect effect;
        String effectId;
        List<C0FGT> list2;
        C0FGT c0fgt;
        if (list.isEmpty()) {
            i3(AFwS234S0000000_5.get$arr$(124));
            return;
        }
        if (z) {
            C0FGS c0fgs = (C0FGS) C13LP.LJJJLL(list);
            String resourceId = null;
            if (c0fgs != null && (list2 = c0fgs.LIZ) != null && (c0fgt = (C0FGT) C13LP.LJJJLL(list2)) != null) {
                effect = c0fgt.LIZ;
            } else {
                effect = null;
            }
            if (effect != null) {
                effectId = effect.getEffectId();
                resourceId = effect.getResourceId();
            } else {
                effectId = null;
            }
            c387180FGaU5 = new C387180FGa(effectId, resourceId);
        } else {
            c387180FGaU5 = U5(list);
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (C0FGS c0fgs2 : list) {
            arrayList.add(new C0FGZ(c0fgs2.LIZIZ, c0fgs2.LIZJ, c0fgs2.LIZLLL));
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (hashSet.add(((C0FGZ) obj).LIZ)) {
                arrayList2.add(obj);
            }
        }
        i3(new AwS584S0100000_5(C387490FHf.LIZ(T2(), null, list, arrayList2, Integer.valueOf(t5(this.LLJJJ.getFontModel().fontCategoryId, list)), c387180FGaU5, false, false, null, null, null, null, 0, 3969), 197));
        if (z && (textFontStyleDataD5 = d5(c387180FGaU5)) != null) {
            D5(this, textFontStyleDataD5, true);
        }
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [X.0FHN] */
    public final Object Z4(final String str, InterfaceC1364105Vn<? super List<C0FGS>> interfaceC1364105Vn) {
        final C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        final C0FI2 c0fi2LJIJJLI = C0FI2.LJIJJLI(str);
        final ?? r9 = new C0FHO() { // from class: X.0FHN
            @Override // X.C0FHO
            public final void accept(Object obj, Object obj2) {
                List<C0FGS> list = (List) obj;
                this.LIZ.LLJJIII.addAll((Collection) obj2);
                InterfaceC20236714Gf<List<C0FGS>> interfaceC20236714Gf = c2252611DEt;
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                for (C0FGS c0fgs : list) {
                    arrayList.add(new C0FGS(new ArrayList(c0fgs.LIZ), c0fgs.LIZIZ, c0fgs.LIZJ, c0fgs.LIZLLL));
                }
                interfaceC20236714Gf.LJJIFFI(new AwS53S1000000_2(str, 9), arrayList);
            }
        };
        final Boolean boolValueOf = Boolean.valueOf(!C298130BmN.LIZ());
        final long jCurrentTimeMillis = System.currentTimeMillis();
        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi(CreativeToolsPluginService.class);
        if (creativeToolsPluginService != null && !C289560BWo.LIZ()) {
            creativeToolsPluginService.LIZ();
        }
        C196909122h.LIZ().LJI(c0fi2LJIJJLI.LIZ, false, new IFetchEffectChannelListener() { // from class: X.0FHg
            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
            public final void onFail(ExceptionResult exceptionResult) {
                C1465490oEt c1465490oEt = C1465490oEt.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("fetchCategoryFontData fail err: ");
                sbLIZ.append(exceptionResult.getMsg());
                C201955140j.LJII(c1465490oEt, C2188811AlT.LIZIZ(sbLIZ));
                C0LAB c0lab = new C0LAB();
                c0lab.LJ("type", "tool_performance_edit_font_list_fetch_time");
                c0lab.LIZIZ(System.currentTimeMillis() - jCurrentTimeMillis, "totaltime");
                C20684815ws.LJIILLIIL("tool_performance_operation_cost_time", c0lab.LIZ);
                C2281251EQx.LIZ.LJII("text", "", "", false);
                C0FHO c0fho = r9;
                if (c0fho != null) {
                    c0fho.accept(Collections.emptyList(), new ArrayList(c0fi2LJIJJLI.LIZIZ.values()));
                }
            }

            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final void onSuccess(EffectChannelResponse effectChannelResponse) {
                EffectChannelResponse effectChannelResponse2 = effectChannelResponse;
                C0LAB c0lab = new C0LAB();
                c0lab.LJ("type", "tool_performance_edit_font_list_fetch_time");
                c0lab.LIZIZ(System.currentTimeMillis() - jCurrentTimeMillis, "totaltime");
                C20684815ws.LJIILLIIL("tool_performance_operation_cost_time", c0lab.LIZ);
                String str2 = c0fi2LJIJJLI.LIZ;
                ArrayList arrayList = new ArrayList();
                for (EffectCategoryResponse effectCategoryResponse : effectChannelResponse2.getCategoryResponseList()) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator<Effect> it2 = effectCategoryResponse.getTotalEffects().iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(new C0FGT(it2.next(), str2, false, EnumC1641420soe.NOT_DOWNLOAD, 0, null));
                    }
                    arrayList.add(new C0FGS(arrayList2, effectCategoryResponse.getKey(), effectCategoryResponse.getName(), effectCategoryResponse.getExtra()));
                }
                C1465490oEt c1465490oEt = C1465490oEt.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("TextEditFontListAbility -> fetchCategoryFontData -> onSuccess: categoryList.size = ");
                sbLIZ.append(arrayList.size());
                C201955140j.LJII(c1465490oEt, C2188811AlT.LIZIZ(sbLIZ));
                c0fi2LJIJJLI.LJJJ(effectChannelResponse2, boolValueOf);
                C0FHO c0fho = r9;
                if (c0fho != null) {
                    c0fho.accept(arrayList, new ArrayList(c0fi2LJIJJLI.LIZIZ.values()));
                }
            }
        });
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLJIJ;
    }

    public C0FHS(boolean z, C19A3 c19a3, C1DRG c1drg) {
        super(c19a3);
        this.LLJILJILJ = z;
        this.LLJILLL = c1drg;
        this.LLJJ = "editor_pro_font_panel";
        this.LLJJI = C196909122h.LIZIZ().LIZ;
        this.LLJJIII = new CopyOnWriteArrayList();
        this.LLJJIJI = C1664770tQJ.LIZIZ(getDiContainer(), C0FGR.class, null);
        this.LLJJIJIIJIL = 1;
        this.LLJJJ = new TextStickerModel(null, null, null, null, null, 0, 0, 0, 0.0f, null, false, false, false, false, false, null, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, false, null, null, false, false, null, null, null, null, null, null, false, false, null, false, false, false, null, -1, 65535, null);
        this.LLJJJIL = EnumC371580EhY.HIDE;
        this.LLJJJJJIL = AFwS191S0000000_5.get$arr$(79);
        this.LLJJJJLIIL = new AwS549S0100000_5(this, 186);
    }

    public static final void D5(C0FHS c0fhs, TextFontStyleData textFontStyleData, boolean z) {
        int i;
        String effectId;
        String resource_id;
        String panel;
        String str;
        boolean z2;
        boolean z3;
        int mode;
        String strN5 = c0fhs.n5();
        if (c0fhs.LLJJJ.getFontModel().fontId.length() == 0) {
            if (C0F8Y.LJIIIIZZ(c0fhs.LLJJJ)) {
                i = 22;
            } else {
                i = 28;
            }
        } else {
            i = c0fhs.LLJJJ.getFontModel().fontSize;
        }
        Effect effect = textFontStyleData.LJ;
        String str2 = "";
        if (effect == null || (effectId = effect.getEffectId()) == null) {
            effectId = "";
        }
        Effect effect2 = textFontStyleData.LJ;
        if (effect2 == null || (resource_id = effect2.getResource_id()) == null) {
            resource_id = "";
        }
        Effect effect3 = textFontStyleData.LJ;
        if (effect3 == null || (panel = effect3.getPanel()) == null) {
            panel = "";
        }
        String str3 = textFontStyleData.fontName;
        if (str3 == null) {
            str3 = "";
        }
        if (strN5 == null) {
            str = "trending";
        } else {
            str = strN5;
        }
        String str4 = textFontStyleData.title;
        if (str4 == null) {
            str4 = "";
        }
        String str5 = textFontStyleData.fileName;
        if (str5 == null) {
            str5 = "";
        }
        String str6 = textFontStyleData.LIZ;
        if (str6 != null) {
            str2 = str6;
        }
        if (textFontStyleData.enableBgColor == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (textFontStyleData.enableMaskBlurLightColor == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        TextFontModel textFontModel = new TextFontModel(effectId, resource_id, panel, str, str3, str4, i, 0, str5, str2, z2, z3, false, 0, 12416, null);
        C118300cf c118300cf = new C118300cf();
        if (textFontModel.enableMaskBlurLightColor) {
            mode = 5;
        } else {
            mode = c0fhs.LLJJJ.getMode();
        }
        c118300cf.element = mode;
        if (c0fhs.LLJJJ.getTextStyle() == null) {
            if (textFontModel.enableMaskBlurLightColor) {
                if (c0fhs.LLJJJ.getMode() != 5) {
                    c0fhs.LLJJIJIIJIL = c0fhs.LLJJJ.getMode();
                }
                c118300cf.element = 5;
            } else if (c0fhs.LLJJJ.getFontModel().enableMaskBlurLightColor) {
                c118300cf.element = c0fhs.LLJJIJIIJIL;
                c0fhs.LLJJIJIIJIL = 1;
            }
        } else if (!z) {
            c118300cf.element = 1;
        }
        C01TT.LIZLLL(new AwS74S1300000_5(c0fhs, textFontModel, c118300cf, strN5, 1));
    }

    private final void H5(int i, int i2, C0FGT c0fgt) {
        TextFontStyleData textFontStyleDataK5 = k5(c0fgt.LIZ);
        if (textFontStyleDataK5 == null) {
            return;
        }
        i3(new AwS584S0100000_5(c0fgt, 199));
        if (x5(textFontStyleDataK5)) {
            D5(this, textFontStyleDataK5, false);
        } else {
            O4(textFontStyleDataK5, c0fgt);
        }
    }

    private final void N5(int i, int i2, C0FGT c0fgt) {
        TextFontStyleData textFontStyleDataK5 = k5(c0fgt.LIZ);
        if (textFontStyleDataK5 == null) {
            return;
        }
        Effect effect = c0fgt.LIZ;
        String effectId = null;
        if (effect != null) {
            effectId = effect.getEffectId();
        }
        if (x5(textFontStyleDataK5)) {
            D5(this, textFontStyleDataK5, false);
            i3(new AwS119S1100000_5(effectId, c0fgt, 2));
            return;
        }
        if (C0BNE.LIZ()) {
            C1661300tKi.LIZ.getClass();
            if (!C1661300tKi.LIZIZ()) {
                d6();
                return;
            }
        }
        O4(textFontStyleDataK5, c0fgt);
    }

    public final void M5(int i, int i2, C0FGT c0fgt) {
        if (C2281551ESb.LIZIZ.LJJIJ()) {
            N5(i, i2, c0fgt);
        } else {
            H5(i, i2, c0fgt);
        }
    }

    public final void R5(int i, int i2, C0FGT c0fgt) {
        C0FGR c0fgrV5;
        String resourceId;
        String str;
        C0FGZ c0fgz;
        if (this.LLJJJIL != EnumC371580EhY.SHOW && (c0fgrV5 = v5()) != null) {
            Effect effect = c0fgt.LIZ;
            String panel = null;
            if (effect != null) {
                resourceId = effect.getResourceId();
            } else {
                resourceId = null;
            }
            List<C0FGZ> list = T2().LIZJ;
            if (list != null && (c0fgz = (C0FGZ) C13LP.LJJJLZIJ(i, list)) != null) {
                str = c0fgz.LIZ;
            } else {
                str = null;
            }
            Effect effect2 = c0fgt.LIZ;
            if (effect2 != null) {
                panel = effect2.getPanel();
            }
            c0fgrV5.LJIIIZ(resourceId, str, panel);
        }
    }
}
