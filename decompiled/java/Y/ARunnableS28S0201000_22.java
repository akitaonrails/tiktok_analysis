package Y;

import X.C0FPT;
import X.C0MJ9;
import X.C1398350mUb;
import X.C1412860ms0;
import X.C1415640mwU;
import X.C1417220mz2;
import X.C1417310mzB;
import X.C1417330mzD;
import X.C1417360mzG;
import X.C1417710mzp;
import X.C1427070nEv;
import X.C1427080nEw;
import X.C1427210nF9;
import X.C1453160nv0;
import X.C1453170nv1;
import X.C1461800o8w;
import X.C1462760oAU;
import X.C1C7U;
import X.C201955140j;
import X.C2188811AlT;
import X.InterfaceC1417440mzO;
import X.InterfaceC1437705jz;
import X.InterfaceC1446740nke;
import android.view.View;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.android.ugc.aweme.autocut.s;
import com.ss.android.ugc.aweme.creative.model.AutoCutMediaModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutThemeData;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.gamora.editor.mixediting.resource.utils.MixAssetDownloader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AwS388S0200000_22;
import kotlin.jvm.internal.AwS72S1000000_22;
import nv7.c0;

/* JADX INFO: loaded from: classes23.dex */
public class ARunnableS28S0201000_22 implements Runnable {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        boolean z;
        InterfaceC1417440mzO interfaceC1417440mzOMc;
        Boolean boolValueOf;
        C1417330mzD c1417330mzD = (C1417330mzD) this.l0;
        C1417310mzB c1417310mzB = c1417330mzD.LLLLZ;
        if (c1417310mzB != null) {
            int i = this.i2;
            C0MJ9 c0mj9 = (C0MJ9) this.l1;
            if (c1417310mzB.LIZIZ()) {
                boolean z2 = false;
                c1417330mzD.Fz(c1417310mzB, false);
                C1417310mzB c1417310mzB2 = c1417330mzD.LLLLZLLLI.get(new Pair(Integer.valueOf(c1417310mzB.LIZIZ), c1417310mzB.LIZ));
                if (c1417310mzB2 != null && c1417310mzB2.LJII != null) {
                    c1417310mzB.LJII = c1417310mzB2.LJII;
                }
                NLEModel nLEModel = c1417310mzB.LJII;
                if (nLEModel == null || !c1417330mzD.Kc(nLEModel)) {
                    z = false;
                } else {
                    z = true;
                    String str = c1417310mzB.LJIIIZ;
                    if (str != null && (interfaceC1417440mzOMc = c1417330mzD.mc()) != null && (boolValueOf = Boolean.valueOf(interfaceC1417440mzOMc.QH(str))) != null && boolValueOf.booleanValue()) {
                        z2 = true;
                    }
                }
                AutoCutThemeData autoCutThemeDataLJJIII = s.LJJIII(c1417310mzB.LIZIZ, c1417330mzD.Na().creativeModel.autoCutModel, c1417310mzB.LIZ);
                if (nLEModel == null || autoCutThemeDataLJJIII == null || !z || z2) {
                    if (c1417330mzD.Yc(i, c0mj9)) {
                        LIZIZ$1(c1417330mzD, c1417310mzB);
                        return;
                    }
                    return;
                }
                C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("EditAutoCutComponent#requestThemeData: AI template request done, templateId=");
                sbLIZ.append(autoCutThemeDataLJJIII.templateId);
                sbLIZ.append(", startAITasks");
                C201955140j.LJIILJJIL(c1398350mUb, C2188811AlT.LIZIZ(sbLIZ));
                InterfaceC1417440mzO interfaceC1417440mzOMc2 = c1417330mzD.mc();
                if (interfaceC1417440mzOMc2 != null) {
                    interfaceC1417440mzOMc2.HO1(autoCutThemeDataLJJIII, nLEModel, new AwS388S0200000_22(c1417330mzD, c1417310mzB, 29), c1417330mzD.P6(c1417310mzB.LIZIZ, c1417310mzB.LIZ), c1417330mzD.S6(autoCutThemeDataLJJIII, c1417330mzD.LLLLZLLIL), c1417330mzD.N6(autoCutThemeDataLJJIII, nLEModel, c1417330mzD.LLLLZLLIL, c1417310mzB.LIZIZ, c1417310mzB.LIZ));
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$2() {
        /*
            r12 = this;
            java.lang.Object r0 = r12.l0
            X.0nAv r0 = (X.C1424590nAv) r0
            X.0nBD r6 = r0.LLLLLJLJLL()
            int r7 = r12.i2
            r8 = 0
            r9 = 0
            java.lang.Object r5 = r12.l0
            X.0nAv r5 = (X.C1424590nAv) r5
            java.lang.Object r2 = r12.l1
            java.util.Map r2 = (java.util.Map) r2
            androidx.viewpager.widget.ViewPager r0 = r5.LLJZIJLIL
            if (r0 == 0) goto L94
            int r1 = r0.getCurrentItem()
            X.0nBD r0 = r5.LLLLLJLJLL()
            com.ss.android.ugc.aweme.tools.mvtemplate.core.TemplateCategoryData r4 = r0.LJJIJIL(r1)
            if (r4 == 0) goto L94
            java.lang.Object r0 = r2.get(r4)
            kotlin.Pair r0 = (kotlin.Pair) r0
            if (r0 == 0) goto L94
            java.lang.Object r3 = r0.getSecond()
            java.util.List r3 = (java.util.List) r3
            if (r3 == 0) goto L94
            X.0nBD r5 = r5.LLLLLJLJLL()
            java.util.HashMap<java.lang.String, X.0nBL> r1 = r5.LLIZLLLIL
            java.lang.String r0 = r4.key
            java.lang.Object r0 = r1.get(r0)
            X.0nBL r0 = (X.C1424850nBL) r0
            if (r0 == 0) goto L53
            X.0nBS r0 = r0.LLJJLIIIJLLLLLLLZ
            java.util.List<X.0n2r> r0 = r0.LLIZ
            boolean r10 = X.C1423860n9k.LIZ(r3, r0)
        L4e:
            r11 = 6
            X.C1424770nBD.LJJIL(r6, r7, r8, r9, r10, r11)
            return
        L53:
            java.util.List<com.ss.android.ugc.aweme.tools.mvtemplate.core.TemplateCategoryData> r1 = r5.LLIZ
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L61
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L61
        L5f:
            r10 = 1
            goto L4e
        L61:
            java.util.Iterator r2 = r1.iterator()
        L65:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L5f
            java.lang.Object r0 = r2.next()
            com.ss.android.ugc.aweme.tools.mvtemplate.core.TemplateCategoryData r0 = (com.ss.android.ugc.aweme.tools.mvtemplate.core.TemplateCategoryData) r0
            java.lang.String r1 = r0.key
            java.lang.String r0 = r4.key
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L65
            java.util.Map<com.ss.android.ugc.aweme.tools.mvtemplate.core.TemplateCategoryData, kotlin.Pair<X.0n8B, java.util.List<X.0n2r>>> r0 = r5.LLJ
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            java.lang.Object r0 = r0.get(r4)
            kotlin.Pair r0 = (kotlin.Pair) r0
            if (r0 == 0) goto L94
            java.lang.Object r0 = r0.getSecond()
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L94
            boolean r10 = X.C1423860n9k.LIZ(r3, r0)
            goto L4e
        L94:
            r10 = 0
            goto L4e
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS28S0201000_22.LIZ$2():void");
    }

    public final void LIZ$3() {
        LinkedList<Pair<C1412860ms0, InterfaceC1437705jz<C1412860ms0>>> linkedList = ((MixAssetDownloader) this.l0).LLILZ;
        C1412860ms0 c1412860ms0 = (C1412860ms0) this.l1;
        ArrayList arrayList = new ArrayList();
        for (Pair<C1412860ms0, InterfaceC1437705jz<C1412860ms0>> pair : linkedList) {
            if (MixAssetDownloader.LJII(pair.getFirst(), c1412860ms0)) {
                arrayList.add(pair);
            }
        }
        int i = this.i2;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((InterfaceC1437705jz) ((Pair) it2.next()).getSecond()).onProgress(i);
        }
    }

    public final void LIZ$4() {
        if (((C1415640mwU) this.l0).getParent() == null) {
            ((Function0) this.l1).invoke();
            return;
        }
        View viewFindViewByPosition = ((C1415640mwU) this.l0).LLILLL.findViewByPosition(this.i2);
        if (viewFindViewByPosition == null) {
            ((Function0) this.l1).invoke();
            return;
        }
        C1415640mwU c1415640mwU = (C1415640mwU) this.l0;
        int[] iArrLIZJ = c1415640mwU.LL.LIZJ(c1415640mwU.LLILLL, viewFindViewByPosition);
        if (iArrLIZJ != null) {
            C1415640mwU c1415640mwU2 = (C1415640mwU) this.l0;
            int i = iArrLIZJ[0];
            if (i != 0 || iArrLIZJ[1] != 0) {
                c1415640mwU2.scrollBy(i, iArrLIZJ[1]);
            }
        }
        ((Function0) this.l1).invoke();
    }

    public static final void run$0(ARunnableS28S0201000_22 aRunnableS28S0201000_22) {
        boolean zLIZ;
        C1C7U.LIZ("EffectSearchResultListAdapter@4e28.onBindViewHolder$1");
        try {
            C1427070nEv c1427070nEv = ((C1427210nF9) aRunnableS28S0201000_22.l0).LLILZLL;
            if (c1427070nEv != null) {
                c1427070nEv.LJI(aRunnableS28S0201000_22.i2, ((C1427080nEw) aRunnableS28S0201000_22.l1).LIZ);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EffectSearchResultListAdapter@4e28.onBindViewHolder$1");
    }

    public static final void run$1(ARunnableS28S0201000_22 aRunnableS28S0201000_22) {
        boolean zLIZ;
        C1C7U.LIZ("ImageEditThumbnailComponent@c2a7.subscribeAiCoverInsertEvent$1$1$1$1");
        try {
            ((C1461800o8w) aRunnableS28S0201000_22.l0).gP0(aRunnableS28S0201000_22.i2);
            ((C1462760oAU) aRunnableS28S0201000_22.l1).LLFFF(aRunnableS28S0201000_22.i2, false);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ImageEditThumbnailComponent@c2a7.subscribeAiCoverInsertEvent$1$1$1$1");
    }

    public static final void run$2(ARunnableS28S0201000_22 aRunnableS28S0201000_22) {
        boolean zLIZ;
        C1C7U.LIZ("EditAutoCutComponent@9215.processSuccessResult$1");
        try {
            aRunnableS28S0201000_22.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EditAutoCutComponent@9215.processSuccessResult$1");
    }

    public static final void run$3(ARunnableS28S0201000_22 aRunnableS28S0201000_22) {
        boolean zLIZ;
        C1C7U.LIZ("MultiColTemplateScene@5338.initObservers$8$3");
        try {
            aRunnableS28S0201000_22.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MultiColTemplateScene@5338.initObservers$8$3");
    }

    public static final void run$4(ARunnableS28S0201000_22 aRunnableS28S0201000_22) {
        boolean zLIZ;
        C1C7U.LIZ("MixAssetDownloader@efb0.getWrappedCallback$1$onProgress$1");
        try {
            aRunnableS28S0201000_22.LIZ$3();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MixAssetDownloader@efb0.getWrappedCallback$1$onProgress$1");
    }

    public static final void run$5(ARunnableS28S0201000_22 aRunnableS28S0201000_22) {
        boolean zLIZ;
        C1C7U.LIZ("MixEditingMaterialRecyclerView@ed07.snapScrollToPosition$2");
        try {
            aRunnableS28S0201000_22.LIZ$4();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MixEditingMaterialRecyclerView@ed07.snapScrollToPosition$2");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZIZ$1(C1417330mzD c1417330mzD, C1417310mzB c1417310mzB) {
        Integer numValueOf;
        String strLIZ;
        String musicId = null;
        int i = 0;
        C1417330mzD.O4(c1417330mzD, c1417310mzB, false, false);
        if (c1417330mzD.LLLLLLLZIL) {
            InterfaceC1446740nke interfaceC1446740nkeJY0 = c1417330mzD.JY0();
            int iO8 = c1417330mzD.o8();
            int iYb = c1417330mzD.yb();
            int iTb = c1417330mzD.tb();
            int iXb = c1417330mzD.xb();
            c0.LIZ.n2();
            i = 0;
            C1453160nv0 c1453160nv0LIZIZ = C1453170nv1.LIZIZ(iO8, iYb, iTb, iXb, false, false, 1984);
            c1453160nv0LIZIZ.LJIIIZ = 0L;
            c1453160nv0LIZIZ.LJIIJ = Boolean.TRUE;
            c1453160nv0LIZIZ.LJIILL = C1417220mz2.LIZ(c1417330mzD.Na());
            c1453160nv0LIZIZ.LJIIL = AFwS210S0000000_22.get$arr$(123);
            interfaceC1446740nkeJY0.aM0(c1453160nv0LIZIZ);
        }
        c1417330mzD.T6();
        String strNc = c1417330mzD.nc(c1417310mzB.LIZIZ, c1417310mzB.LIZ);
        if (strNc != null) {
            c1417330mzD.i3(new AwS72S1000000_22(strNc, 2));
        }
        boolean z = true;
        c1417330mzD.ag(true);
        c1417330mzD.U5();
        c1417330mzD.ze(true);
        long jLIZLLL = C1417710mzp.LIZLLL(c1417330mzD.LLZLI);
        List<AutoCutMediaModel> list = c1417330mzD.LLLLZLLIL;
        String str = c1417330mzD.Na().mShootWay;
        String creationId = c1417330mzD.Na().getCreationId();
        int i2 = c1417310mzB.LIZJ;
        String str2 = c1417310mzB.LJIIIZ;
        String str3 = c1417310mzB.LJIIJ;
        Set<String> set = c1417310mzB.LJIILIIL;
        if (set != null) {
            numValueOf = Integer.valueOf(set.size());
        } else {
            numValueOf = null;
        }
        NLEModel nLEModel = c1417310mzB.LJII;
        if (nLEModel != null) {
            strLIZ = C0FPT.LIZ(nLEModel);
        } else {
            strLIZ = null;
        }
        C1417710mzp.LJJIJIIJIL(i, i2, 134, jLIZLLL, numValueOf, null, str, creationId, str2, str3, strLIZ, list, true, i);
        long jLIZLLL2 = C1417710mzp.LIZLLL(c1417330mzD.LLZLI);
        List<AutoCutMediaModel> list2 = c1417330mzD.LLLLZLLIL;
        String str4 = c1417330mzD.Na().mShootWay;
        String creationId2 = c1417330mzD.Na().getCreationId();
        String str5 = c1417310mzB.LJIIIZ;
        String str6 = c1417310mzB.LJIIJ;
        int i3 = c1417310mzB.LIZJ;
        AVMusic aVMusic = c1417310mzB.LJ;
        if (aVMusic != null) {
            musicId = aVMusic.getMusicId();
        }
        String str7 = c1417330mzD.LLZZJLIL;
        if (str7 == null || str7.length() <= 0) {
            z = false;
        }
        C1417710mzp.LJJIJIL(i, i3, jLIZLLL2, Integer.MIN_VALUE, null, str4, creationId2, str5, str6, musicId, list2, true, z);
        C1417360mzG c1417360mzG = c1417330mzD.b;
        if (c1417360mzG != null) {
            c1417360mzG.LIZIZ();
        }
        s sVar = s.LIZ;
        AutoCutModel autoCutModel = c1417330mzD.Na().creativeModel.autoCutModel;
        NLEModel nLEModel2 = c1417310mzB.LJII;
        sVar.getClass();
        s.LJJLIL(autoCutModel, nLEModel2);
    }

    public ARunnableS28S0201000_22(Object obj, Object obj2, int i, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.l1 = obj2;
        this.i2 = i;
    }
}
