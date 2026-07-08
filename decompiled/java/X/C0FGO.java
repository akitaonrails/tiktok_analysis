package X;

import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStyleData;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStyleModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import ge.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS20S0001000_5;
import kotlin.jvm.internal.AwS371S0200000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0FGO, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FGO extends i<InterfaceC385960FBi, C0FOX, C387490FHf, C0FGX> implements InterfaceC379610EuV, InterfaceC385960FBi {
    public static final C387200FGc LLJL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLIL;
    public static final int LLJLILLLLZIIL;
    public final C19A3 LLJILJILJ;
    public final C1DRG LLJILLL;
    public final boolean LLJJ;
    public final InterfaceC1731706qJ LLJJI;
    public final InterfaceC1731706qJ LLJJIII;
    public InterfaceC387190FGb LLJJIJI;
    public TextStickerModel LLJJIJIIJIL;
    public EnumC371580EhY LLJJIJIL;
    public C09AE LLJJJ;
    public C09AE LLJJJIL;
    public List<C0FGS> LLJJJJ;
    public List<C0FGZ> LLJJJJJIL;
    public final Function0<C387490FHf> LLJJJJLIIL;
    public final Function0<C0FGX> LLJJL;
    public C365600EVa LLJJLIIIJLLLLLLLZ;

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0FGc] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0FGO.class, "textResourceService", "getTextResourceService()Lcom/ss/android/ugc/aweme/tools/sticker/core/text/resource/TextResourceRepository;", 0);
        C13LE.LIZ.getClass();
        LLJLIL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C0FGO.class, "textMobService", "getTextMobService()Lcom/ss/android/ugc/aweme/tools/sticker/core/text/ITextStickerMobService;", 0)};
        LLJL = new Object() { // from class: X.0FGc
        };
        LLJLILLLLZIIL = 8;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void F4() {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0FGO.F4():void");
    }

    @Override // X.InterfaceC385960FBi
    public void Kj0() {
        i3(AFwS234S0000000_5.get$arr$(91));
        C09AE c09ae = this.LLJJJ;
        if (c09ae != null) {
            c09ae.LIZIZ(null);
        }
        C09AE c09ae2 = this.LLJJJIL;
        if (c09ae2 != null) {
            c09ae2.LIZIZ(null);
        }
    }

    public final void LLILZLL() {
        i3(AFwS234S0000000_5.get$arr$(92));
        H4();
    }

    public final C0FGR Z4() {
        return (C0FGR) this.LLJJIII.getValue(this, LLJLIL[1]);
    }

    public final C0FDM d5() {
        return (C0FDM) this.LLJJI.getValue(this, LLJLIL[0]);
    }

    @Override // X.InterfaceC385960FBi
    public void r4() {
        List<C0FGS> list = this.LLJJJJ;
        if (list == null || list.isEmpty()) {
            return;
        }
        TextStyleModel textStyle = this.LLJJIJIIJIL.getTextStyle();
        int iT4 = T4(textStyle != null ? textStyle.styleCategoryId : null, this.LLJJJJ);
        TextStyleModel textStyle2 = this.LLJJIJIIJIL.getTextStyle();
        i3(new C0FGN(this, textStyle2 != null ? textStyle2.styleId : null, iT4));
    }

    private final void H4() {
        List<C0FGS> list = T2().LIZIZ;
        if (list == null || list.isEmpty()) {
            C09AE c09ae = this.LLJJJ;
            if (c09ae != null) {
                c09ae.LIZIZ(null);
            }
            i3(AFwS234S0000000_5.get$arr$(89));
            this.LLJJJ = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), C0PEM.LIZ, null, new C0FGK(this, null), 2);
        }
    }

    private final String P4() {
        C0FGS c0fgs;
        Integer num = T2().LIZLLL;
        int iIntValue = num != null ? num.intValue() : 0;
        List<C0FGS> list = T2().LIZIZ;
        if (list == null || (c0fgs = (C0FGS) C13LP.LJJJLZIJ(iIntValue, list)) == null) {
            return null;
        }
        return c0fgs.LIZIZ;
    }

    @Override // X.InterfaceC385960FBi
    public void ST1() {
        show();
        i3(AFwS234S0000000_5.get$arr$(95));
        List<C0FGS> list = T2().LIZIZ;
        if (list == null || list.isEmpty()) {
            H4();
        } else {
            r4();
        }
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJILLL;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C387490FHf> o2() {
        return this.LLJJJJLIIL;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C0FGX> w2() {
        return this.LLJJL;
    }

    public final List<C0FGZ> K4(List<C0FGZ> list) {
        ArrayList arrayList = null;
        if (list != null) {
            arrayList = new ArrayList();
            for (C0FGZ c0fgz : list) {
                C0FGZ c0fgz2 = c0fgz;
                List<C0FGS> list2 = this.LLJJJJ;
                if (list2 != null) {
                    Iterator<C0FGS> it2 = list2.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            C0FGS next = it2.next();
                            if (Intrinsics.LJFF(next.LIZIZ, c0fgz2.LIZ)) {
                                if (next != null) {
                                    arrayList.add(c0fgz);
                                }
                            }
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    @Override // X.InterfaceC385960FBi
    public void LJJLIIIJJIZ(TextStickerModel textStickerModel) {
        TextStickerModel textStickerModel2 = this.LLJJIJIIJIL;
        this.LLJJIJIIJIL = textStickerModel;
        if (textStickerModel.getBaseStickerModel().getId() != C364540EQy.LIZ(textStickerModel2)) {
            r4();
        }
    }

    public final List<C0FGS> O4(List<C0FGS> list) {
        boolean z;
        Object c098200Yq;
        boolean zLJFF;
        Object c098200Yq2;
        ArrayList arrayList = new ArrayList();
        List<String> list2 = C1845207Ko.LIZ;
        List<String> list3 = (List) C0C64.LJIILLIIL().LJJII(List.class, null, "studio_editor_pro_text_style_panel_category_filter_list", true);
        if (list3 == null || list3.isEmpty()) {
            list3 = C1845207Ko.LIZ;
        }
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            for (C0FGS c0fgs : list) {
                if (!list3.contains(c0fgs.LIZIZ)) {
                    arrayList2.add(c0fgs);
                }
            }
            ArrayList<C0FGS> arrayList3 = new ArrayList();
            for (Object obj : arrayList2) {
                C0FGS c0fgs2 = (C0FGS) obj;
                if (this.LLJJ) {
                    try {
                        String str = c0fgs2.LIZLLL;
                        if (str != null) {
                            c098200Yq2 = Boolean.valueOf(new JSONObject(new JSONObject(str).optString("category_strategy")).optBoolean("V1"));
                        } else {
                            c098200Yq2 = null;
                        }
                        C189200o6.m2constructorimpl(c098200Yq2);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq2 = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq2);
                    }
                    if (C189200o6.m7isFailureimpl(c098200Yq2)) {
                        c098200Yq2 = null;
                    }
                    zLJFF = Intrinsics.LJFF(c098200Yq2, Boolean.TRUE);
                } else {
                    try {
                        String str2 = c0fgs2.LIZLLL;
                        if (str2 != null) {
                            c098200Yq = Boolean.valueOf(new JSONObject(new JSONObject(str2).optString("category_strategy")).optBoolean("V0"));
                        } else {
                            c098200Yq = null;
                        }
                        C189200o6.m2constructorimpl(c098200Yq);
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        c098200Yq = new C098200Yq(th2);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    if (C189200o6.m7isFailureimpl(c098200Yq)) {
                        c098200Yq = null;
                    }
                    zLJFF = Intrinsics.LJFF(c098200Yq, Boolean.TRUE);
                }
                if (zLJFF) {
                    arrayList3.add(obj);
                }
            }
            for (C0FGS c0fgs3 : arrayList3) {
                List<C0FGT> list4 = c0fgs3.LIZ;
                ArrayList arrayList4 = new ArrayList();
                for (C0FGT c0fgt : list4) {
                    if (C362890EKp.LIZ(c0fgt.LIZ) && !this.LLJJ) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        arrayList4.add(c0fgt);
                    }
                }
                if (!arrayList4.isEmpty()) {
                    arrayList.add(new C0FGS(arrayList4, c0fgs3.LIZIZ, c0fgs3.LIZJ, c0fgs3.LIZLLL));
                }
            }
        }
        return arrayList;
    }

    @Override // X.InterfaceC385960FBi
    public void V0(int i) {
        i3(new AwS20S0001000_5(i, 7));
    }

    @Override // X.InterfaceC385960FBi
    public void Y0(EnumC371580EhY enumC371580EhY) {
        this.LLJJIJIL = enumC371580EhY;
        EnumC371580EhY enumC371580EhY2 = EnumC371580EhY.SHOW;
        if (enumC371580EhY == enumC371580EhY2) {
            i3(AFwS234S0000000_5.get$arr$(96));
        } else {
            if (T2().LIZ != enumC371580EhY2) {
                return;
            }
            i3(AFwS234S0000000_5.get$arr$(97));
            i3(AFwS234S0000000_5.get$arr$(98));
        }
    }

    @Override // X.InterfaceC385960FBi
    public void iy0(InterfaceC387190FGb interfaceC387190FGb) {
        this.LLJJIJI = interfaceC387190FGb;
    }

    public final void onPageSelected(int i) {
        String str;
        C0FGZ c0fgz;
        String str2;
        i3(new AwS20S0001000_5(i, 6));
        TextStyleModel textStyle = this.LLJJIJIIJIL.getTextStyle();
        String str3 = null;
        if (textStyle != null) {
            str = textStyle.styleCategoryId;
        } else {
            str = null;
        }
        int iT4 = T4(str, T2().LIZIZ);
        TextStyleModel textStyle2 = this.LLJJIJIIJIL.getTextStyle();
        if (textStyle2 != null && (str2 = textStyle2.styleCategoryId) != null && str2.length() != 0 && iT4 == i) {
            r4();
        }
        C0FGR c0fgrZ4 = Z4();
        if (c0fgrZ4 != null) {
            List<C0FGZ> list = T2().LIZJ;
            if (list != null && (c0fgz = (C0FGZ) C13LP.LJJJLZIJ(i, list)) != null) {
                str3 = c0fgz.LIZ;
            }
            c0fgrZ4.LJIJJ(str3, "style_pager");
        }
    }

    private final int T4(String str, List<C0FGS> list) {
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

    /* JADX WARN: Removed duplicated region for block: B:49:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t5(X.C0FGT r22, int r23) {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0FGO.t5(X.0FGT, int):void");
    }

    public C0FGO(C19A3 c19a3, C1DRG c1drg, boolean z) {
        super(c19a3);
        this.LLJILJILJ = c19a3;
        this.LLJILLL = c1drg;
        this.LLJJ = z;
        this.LLJJI = C1664770tQJ.LIZIZ(getDiContainer(), C0FDM.class, null);
        this.LLJJIII = C1664770tQJ.LIZIZ(getDiContainer(), C0FGR.class, null);
        this.LLJJIJIIJIL = new TextStickerModel(null, null, null, null, null, 0, 0, 0, 0.0f, null, false, false, false, false, false, null, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, false, null, null, false, false, null, null, null, null, null, null, false, false, null, false, false, false, null, -1, 65535, null);
        this.LLJJIJIL = EnumC371580EhY.HIDE;
        this.LLJJJJLIIL = AFwS191S0000000_5.get$arr$(69);
        this.LLJJL = new AwS549S0100000_5(this, 148);
    }

    public final void k5(int i, int i2, C0FGT c0fgt) {
        String str;
        boolean z;
        boolean z2;
        C0FDM c0fdmD5;
        C09AE c09ae = this.LLJJJIL;
        if (c09ae != null) {
            c09ae.LIZIZ(null);
        }
        C365600EVa c365600EVa = this.LLJJLIIIJLLLLLLLZ;
        if (c365600EVa != null) {
            c365600EVa.LIZIZ();
        }
        this.LLJJLIIIJLLLLLLLZ = null;
        Effect effect = c0fgt.LIZ;
        if (effect == null) {
            return;
        }
        TextStyleData textStyleData = (TextStyleData) C362890EKp.LIZIZ(effect, TextStyleData.class);
        if (textStyleData == null || (str = textStyleData.fontResId) == null) {
            str = "";
        }
        Effect effect2 = c0fgt.LJFF;
        C0FDM c0fdmD52 = d5();
        if (c0fdmD52 != null && c0fdmD52.LIZ.LJIJJLI(effect)) {
            z = true;
        } else {
            z = false;
        }
        if (str.length() <= 0 || ((c0fdmD5 = d5()) != null && effect2 != null && c0fdmD5.LIZ.LJIJJLI(effect2))) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && z2) {
            t5(c0fgt, i);
            return;
        }
        C365600EVa c365600EVa2 = new C365600EVa();
        this.LLJJLIIIJLLLLLLLZ = c365600EVa2;
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        c365600EVa2.LIZ(new AwS371S0200000_5(this, effect, 21), C2296808zG.LIZ(abstractC2238408pq));
        this.LLJJJIL = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), abstractC2238408pq, null, new C0FGL(str, this, c0fgt, i, z, effect, z2, effect2, null), 2);
    }

    public final void n5(int i, int i2, C0FGT c0fgt) {
        C0FGR c0fgrZ4;
        String resourceId;
        C0FGZ c0fgz;
        if (this.LLJJIJIL != EnumC371580EhY.SHOW && (c0fgrZ4 = Z4()) != null) {
            Effect effect = c0fgt.LIZ;
            String str = null;
            if (effect != null) {
                resourceId = effect.getResourceId();
            } else {
                resourceId = null;
            }
            List<C0FGZ> list = T2().LIZJ;
            if (list != null && (c0fgz = (C0FGZ) C13LP.LJJJLZIJ(i, list)) != null) {
                str = c0fgz.LIZ;
            }
            c0fgrZ4.LJIILLIIL(resourceId, str);
        }
    }
}
