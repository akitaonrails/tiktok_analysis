package X;

import Y.ARunnableS126S0100000_26;
import android.text.TextUtils;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.k;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.mixmall.container.ECMMKContainerController;
import com.ss.android.ugc.aweme.ecommerce.mixmall.container.ECMMKViewModel;
import com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.page.ECMixMallItemInfoDTO;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.AwS76S1000000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wEG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1772620wEG {
    public final C1772650wEJ LIZ;
    public final ECMMKViewModel LIZIZ;
    public final Map<String, List<Function2<C1772690wEN, C1771590wCb, Unit>>> LIZJ;
    public final List<Function2<C1773780wG8, C1771590wCb, Unit>> LIZLLL;
    public final List<Function1<C1772630wEH, Unit>> LJ;
    public C1772630wEH LJFF = new C1772630wEH();
    public volatile C1772630wEH LJI;
    public final C2252331DDr LJII;
    public C1773080wF0 LJIIIIZZ;
    public final C01GW LJIIIZ;
    public final C01GW LJIIJ;
    public final C01GW LJIIJJI;

    public final void LJIIJJI() {
        List<? extends AbstractC1773210wFD> list;
        AbstractC1773210wFD abstractC1773210wFD;
        List<Function2<C1772690wEN, C1771590wCb, Unit>> list2;
        List<C1772690wEN> list3;
        C1773710wG1 c1773710wG1LIZIZ = this.LJFF.LIZIZ();
        C1772690wEN c1772690wEN = (c1773710wG1LIZIZ == null || (list3 = c1773710wG1LIZIZ.LJJIII) == null) ? null : (C1772690wEN) ListProtector.get(list3, c1773710wG1LIZIZ.LJJ);
        Integer num = C1771440wCM.LIZLLL().feedFirstStepItemCount;
        int iIntValue = num != null ? num.intValue() : 4;
        if (c1772690wEN == null || (list = c1772690wEN.LIZJ) == null || (abstractC1773210wFD = (AbstractC1773210wFD) C13LP.LJJJLZIJ(Math.min(iIntValue - 1, list.size() - 1), list)) == null || !abstractC1773210wFD.LJIJ || (list2 = this.LIZJ.get(c1772690wEN.LIZLLL)) == null) {
            return;
        }
        Iterator<Function2<C1772690wEN, C1771590wCb, Unit>> it2 = list2.iterator();
        while (it2.hasNext()) {
            it2.next().invoke(c1772690wEN, null);
        }
    }

    public static void LJIILLIIL(C1772690wEN c1772690wEN) {
        int i = 0;
        for (AbstractC1773210wFD abstractC1773210wFD : c1772690wEN.LIZJ) {
            int i2 = i + 1;
            if (i >= 0) {
                AbstractC1773210wFD abstractC1773210wFD2 = abstractC1773210wFD;
                abstractC1773210wFD2.LJII.LIZIZ.LJIIJJI = i2;
                abstractC1773210wFD2.LJI.put("item_order", Integer.valueOf(i2));
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }

    public final void LIZ(C1773060wEy c1773060wEy) {
        C1772690wEN c1772690wENLIZLLL;
        if (c1773060wEy.LIZIZ.isEmpty() || (c1772690wENLIZLLL = LIZLLL(c1773060wEy.LIZ.LIZ)) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(c1772690wENLIZLLL.LIZJ);
        Iterator<String> it2 = c1773060wEy.LIZIZ.iterator();
        while (it2.hasNext()) {
            C19719612Di.LJJIIJ(arrayList, new AwS76S1000000_26(it2.next(), 46), true);
        }
        c1772690wENLIZLLL.LIZJ = arrayList;
        LJIILLIIL(c1772690wENLIZLLL);
        List<Function2<C1772690wEN, C1771590wCb, Unit>> list = this.LIZJ.get(c1772690wENLIZLLL.LIZLLL);
        if (list != null) {
            Iterator<Function2<C1772690wEN, C1771590wCb, Unit>> it3 = list.iterator();
            while (it3.hasNext()) {
                it3.next().invoke(c1772690wENLIZLLL, c1773060wEy.LIZ);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1773080wF0 LIZIZ(X.C1772630wEH r8) {
        /*
            r7 = this;
            java.lang.String r0 = r8.LJIIL
            r4 = 0
            if (r0 == 0) goto L6
            return r4
        L6:
            X.0wG1 r0 = r8.LIZIZ()
            if (r0 == 0) goto L8e
            java.util.List<X.0wEN> r1 = r0.LJJIII
            if (r1 == 0) goto L8e
            int r0 = r0.LJJ
            java.lang.Object r2 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r1, r0)
            X.0wEN r2 = (X.C1772690wEN) r2
            if (r2 == 0) goto L8f
            java.util.List<? extends X.0wFD> r3 = r2.LIZJ
        L1c:
            com.ss.android.ugc.aweme.ecommerce.mixmall.container.ECMMKViewModel r0 = r7.LIZIZ
            com.ss.android.ugc.aweme.ecommerce.mixmall.container.ECMMKContainerController r0 = r0.LLILLL
            if (r0 == 0) goto L8c
            X.0Nfh r6 = r0.LLILZLL
            if (r6 == 0) goto L8c
            java.lang.String r5 = "bff_page_tab"
            X.0Nfe r1 = X.EnumC599720Nfe.NATIVE
            java.util.Map r0 = X.C2097608Jq.LJ()
            java.lang.Object r1 = r6.LIZLLL(r5, r1, r0)
        L32:
            boolean r0 = r1 instanceof java.lang.Boolean
            if (r0 != 0) goto L37
            r1 = r4
        L37:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L8a
            r1 = 5
        L40:
            if (r3 == 0) goto L88
            int r0 = r3.size()
            if (r0 <= r1) goto L88
            r0 = 0
            kotlin.ranges.IntRange r0 = X.C13LZ.LJIILJJIL(r0, r1)
            java.util.List r0 = X.C13LP.LJLLILLLL(r3, r0)
        L51:
            if (r2 == 0) goto L5c
            if (r0 != 0) goto L5a
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5a:
            r2.LIZJ = r0
        L5c:
            X.0Nfo r2 = X.C599820Nfo.LIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "doCropFetchData: fullItemList.size: "
            r1.append(r0)
            if (r3 == 0) goto L71
            int r0 = r3.size()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
        L71:
            r1.append(r4)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            r2.getClass()
            java.lang.String r0 = "wyxxxxxxxxx"
            X.C599820Nfo.LIZ(r0, r1)
            X.0wF0 r1 = new X.0wF0
            X.0wFP r0 = r8.LJ
            r1.<init>(r3, r0)
            return r1
        L88:
            r0 = r3
            goto L51
        L8a:
            r1 = 4
            goto L40
        L8c:
            r1 = r4
            goto L32
        L8e:
            r2 = r4
        L8f:
            r3 = r4
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1772620wEG.LIZIZ(X.0wEH):X.0wF0");
    }

    public final void LIZJ(C1772140wDU c1772140wDU) {
        String str = c1772140wDU.LIZ.LJFF;
        if (Intrinsics.LJFF(str, "prefetch_cache")) {
            this.LIZIZ.wQ2(new C1772730wER(EnumC1772960wEo.CACHE, null, null, 30));
        } else if (Intrinsics.LJFF(str, "first_fetch")) {
            this.LIZIZ.wQ2(new C1772730wER(EnumC1772960wEo.FETCH, null, null, 30));
        } else {
            this.LIZIZ.wQ2(new C1772730wER(EnumC1772960wEo.OTHER, null, null, 30));
        }
    }

    public final C1772690wEN LIZLLL(String str) {
        List<C1772690wEN> list;
        C1772630wEH c1772630wEH = this.LJFF;
        if (str != null && !Intrinsics.LJFF(str, "default_tab_id")) {
            C1773710wG1 c1773710wG1LIZIZ = c1772630wEH.LIZIZ();
            C1772690wEN c1772690wEN = null;
            if (c1773710wG1LIZIZ == null || (list = c1773710wG1LIZIZ.LJJIII) == null) {
                return null;
            }
            Iterator<C1772690wEN> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                C1772690wEN next = it2.next();
                if (Intrinsics.LJFF(next.LIZLLL, str)) {
                    c1772690wEN = next;
                    break;
                }
            }
            return c1772690wEN;
        }
        return c1772630wEH.LIZLLL;
    }

    public final void LJ(C1773050wEx c1773050wEx) {
        List<C1772690wEN> list;
        C1772690wEN next;
        C1772690wEN c1772690wEN;
        ECMixMallItemInfoDTO eCMixMallItemInfoDTO;
        C1772630wEH c1772630wEH = this.LJFF;
        if (c1773050wEx.LIZ.LIZ == null) {
            c1772690wEN = c1772630wEH.LIZLLL;
        } else {
            C1773710wG1 c1773710wG1LIZIZ = c1772630wEH.LIZIZ();
            if (c1773710wG1LIZIZ != null && (list = c1773710wG1LIZIZ.LJJIII) != null) {
                Iterator<C1772690wEN> it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (Intrinsics.LJFF(next.LIZLLL, c1773050wEx.LIZ.LIZ)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                c1772690wEN = next;
            } else {
                return;
            }
        }
        if (c1772690wEN != null) {
            ArrayList arrayList = new ArrayList(c1772690wEN.LIZJ);
            for (AbstractC1773210wFD abstractC1773210wFD : c1773050wEx.LIZJ) {
                Map<String, ECMixMallItemInfoDTO> map = this.LJFF.LJI;
                if (map != null) {
                    eCMixMallItemInfoDTO = map.get(abstractC1773210wFD.LJIIJJI());
                } else {
                    eCMixMallItemInfoDTO = null;
                }
                abstractC1773210wFD.LJIIIZ = eCMixMallItemInfoDTO;
            }
            int i = c1773050wEx.LIZIZ;
            int size = arrayList.size();
            if (i > size) {
                i = size;
            }
            arrayList.addAll(i, c1773050wEx.LIZJ);
            c1772690wEN.LIZJ = arrayList;
            LJIILLIIL(c1772690wEN);
            List<Function2<C1772690wEN, C1771590wCb, Unit>> list2 = this.LIZJ.get(c1772690wEN.LIZLLL);
            if (list2 != null) {
                Iterator<Function2<C1772690wEN, C1771590wCb, Unit>> it3 = list2.iterator();
                while (it3.hasNext()) {
                    it3.next().invoke(c1772690wEN, c1773050wEx.LIZ);
                }
            }
            C1772880wEg.LJ(EnumC1771830wCz.LOAD_MORE, c1773050wEx.LIZ.LIZ, c1773050wEx.LIZJ);
        }
    }

    public final void LJFF(EnumC1772960wEo enumC1772960wEo) {
        C1773020wEu.LIZ.getClass();
        if (C1773020wEu.LIZ()) {
            LJIIJJI();
        }
        this.LIZ.LJIIL.LJJ = enumC1772960wEo;
        C1091940eWO.LIZIZ(((Number) this.LJIIIZ.getValue()).longValue(), new ARunnableS126S0100000_26(this, 112));
    }

    public final void LJI(C1772220wDc c1772220wDc) {
        C1772690wEN c1772690wEN;
        List<C1772690wEN> list;
        C1772690wEN c1772690wEN2 = c1772220wDc.LIZIZ;
        C1772630wEH c1772630wEH = this.LJFF;
        C1773710wG1 c1773710wG1LIZIZ = c1772630wEH.LIZIZ();
        C1772690wEN c1772690wEN3 = null;
        if (c1773710wG1LIZIZ != null && (list = c1773710wG1LIZIZ.LJJIII) != null) {
            Iterator<C1772690wEN> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                C1772690wEN next = it2.next();
                if (Intrinsics.LJFF(next.LIZLLL, c1772220wDc.LIZ.LIZ)) {
                    c1772690wEN3 = next;
                    break;
                }
            }
            c1772690wEN = c1772690wEN3;
        } else {
            c1772690wEN = c1772630wEH.LIZLLL;
        }
        if (c1772690wEN == null) {
            return;
        }
        if (!TextUtils.isEmpty(c1772690wEN.LJIIIIZZ) && !Intrinsics.LJFF(c1772690wEN2.LJIIIIZZ, c1772690wEN.LJIIIIZZ)) {
            C1771980wDE.LJIIIIZZ(c1772220wDc.LIZLLL, c1772690wEN, c1772690wEN2);
            C1771980wDE.LIZIZ(C1771990wDF.LJFF, c1772220wDc.LIZ);
        } else {
            ArrayList arrayList = new ArrayList(c1772690wEN.LIZJ);
            boolean zLJJIIJ = C19719612Di.LJJIIJ(arrayList, AFwS268S0000000_26.get$arr$(701), true);
            Iterator<? extends AbstractC1773210wFD> it3 = c1772690wEN2.LIZJ.iterator();
            while (it3.hasNext()) {
                it3.next().LJII.LIZIZ.LIZ = c1772690wEN;
            }
            arrayList.addAll(c1772690wEN2.LIZJ);
            c1772690wEN.LIZJ = arrayList;
            c1772690wEN.LJFF = c1772690wEN2.LJFF;
            c1772690wEN.LJ = c1772690wEN2.LJ;
            c1772690wEN.LJIIIIZZ = c1772690wEN2.LJIIIIZZ;
            c1772690wEN.LJIIIZ = c1772690wEN2.LJIIIZ;
            if (zLJJIIJ) {
                C1772720wEQ c1772720wEQ = new C1772720wEQ(0);
                c1772720wEQ.LJIJ(c1772690wEN);
                arrayList.add(c1772720wEQ);
            }
        }
        List<Function2<C1772690wEN, C1771590wCb, Unit>> list2 = this.LIZJ.get(c1772690wEN.LIZLLL);
        if (list2 != null) {
            Iterator<Function2<C1772690wEN, C1771590wCb, Unit>> it4 = list2.iterator();
            while (it4.hasNext()) {
                it4.next().invoke(c1772690wEN, c1772220wDc.LIZ);
            }
        }
    }

    public final void LJII(C1772190wDZ c1772190wDZ) {
        C1772690wEN c1772690wEN;
        C1772720wEQ c1772720wEQ;
        List<C1772690wEN> list;
        C1772690wEN next;
        C1772630wEH c1772630wEH = this.LJFF;
        C1773710wG1 c1773710wG1LIZIZ = c1772630wEH.LIZIZ();
        if (c1773710wG1LIZIZ != null && (list = c1773710wG1LIZIZ.LJJIII) != null) {
            Iterator<C1772690wEN> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(next.LIZLLL, c1772190wDZ.LIZ.LIZ)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            c1772690wEN = next;
        } else {
            c1772690wEN = c1772630wEH.LIZLLL;
        }
        if (c1772690wEN == null) {
            return;
        }
        Object objLJJLIIIJL = C13LP.LJJLIIIJL(c1772690wEN.LIZJ);
        if ((objLJJLIIIJL instanceof C1772720wEQ) && (c1772720wEQ = (C1772720wEQ) objLJJLIIIJL) != null) {
            c1772720wEQ.LJJ = 2;
        }
        List<Function2<C1772690wEN, C1771590wCb, Unit>> list2 = this.LIZJ.get(c1772690wEN.LIZLLL);
        if (list2 != null) {
            Iterator<Function2<C1772690wEN, C1771590wCb, Unit>> it3 = list2.iterator();
            while (it3.hasNext()) {
                it3.next().invoke(c1772690wEN, c1772190wDZ.LIZ);
            }
        }
    }

    public final void LJIIJ(C1771590wCb c1771590wCb) {
        Integer numValueOf;
        C1772690wEN c1772690wEN;
        List<Function2<C1772690wEN, C1771590wCb, Unit>> list;
        List<C1772690wEN> list2;
        List<? extends AbstractC1773210wFD> arrayList;
        List<AbstractC1773210wFD> list3;
        C599820Nfo c599820Nfo = C599820Nfo.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("resetCropData fullItemList size: ");
        C1773080wF0 c1773080wF0 = this.LJIIIIZZ;
        C1773330wFP c1773330wFP = null;
        if (c1773080wF0 != null && (list3 = c1773080wF0.LIZ) != null) {
            numValueOf = Integer.valueOf(list3.size());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        C2188811AlT.LIZIZ(sbLIZ);
        c599820Nfo.getClass();
        C599820Nfo.LIZIZ();
        C1773080wF0 c1773080wF02 = this.LJIIIIZZ;
        if (c1773080wF02 != null && c1773080wF02.LIZ != null) {
            C1773710wG1 c1773710wG1LIZIZ = this.LJFF.LIZIZ();
            if (c1773710wG1LIZIZ != null && (list2 = c1773710wG1LIZIZ.LJJIII) != null) {
                c1772690wEN = (C1772690wEN) ListProtector.get(list2, c1773710wG1LIZIZ.LJJ);
                if (c1772690wEN != null) {
                    C1773080wF0 c1773080wF03 = this.LJIIIIZZ;
                    if (c1773080wF03 == null || (arrayList = c1773080wF03.LIZ) == null) {
                        arrayList = new ArrayList<>();
                    }
                    c1772690wEN.LIZJ = arrayList;
                }
            } else {
                c1772690wEN = null;
            }
            C1772630wEH c1772630wEH = this.LJFF;
            C1773080wF0 c1773080wF04 = this.LJIIIIZZ;
            if (c1773080wF04 != null) {
                c1773330wFP = c1773080wF04.LIZIZ;
            }
            c1772630wEH.LJ = c1773330wFP;
            if (c1772690wEN != null && (list = this.LIZJ.get(c1772690wEN.LIZLLL)) != null) {
                Iterator<Function2<C1772690wEN, C1771590wCb, Unit>> it2 = list.iterator();
                while (it2.hasNext()) {
                    it2.next().invoke(c1772690wEN, c1771590wCb);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:172:0x02f6 A[PHI: r8
      0x02f6: PHI (r8v2 X.0wEN) = (r8v1 X.0wEN), (r8v1 X.0wEN), (r8v1 X.0wEN), (r8v5 X.0wEN), (r8v5 X.0wEN) binds: [B:156:0x02c3, B:163:0x02d9, B:167:0x02e6, B:169:0x02f0, B:171:0x02f4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0306  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILIIL(X.C1772140wDU r15) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 1027
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1772620wEG.LJIILIIL(X.0wDU):void");
    }

    public final void LJIILJJIL(C1772150wDV c1772150wDV) {
        List<C1772690wEN> list;
        C1772690wEN c1772690wEN;
        C1773710wG1 c1773710wG1LIZIZ;
        List<C1772690wEN> list2;
        C1772690wEN c1772690wEN2;
        C1772630wEH c1772630wEH = this.LJFF;
        C1772630wEH c1772630wEH2 = c1772150wDV.LIZIZ;
        C1773710wG1 c1773710wG1LIZIZ2 = c1772630wEH.LIZIZ();
        if (c1773710wG1LIZIZ2 != null && (list = c1773710wG1LIZIZ2.LJJIII) != null && (c1772690wEN = (C1772690wEN) C13LP.LJJJLZIJ(c1773710wG1LIZIZ2.LJJ, list)) != null && (!c1772690wEN.LIZJ.isEmpty()) && (c1773710wG1LIZIZ = c1772630wEH2.LIZIZ()) != null && (list2 = c1773710wG1LIZIZ.LJJIII) != null && (c1772690wEN2 = (C1772690wEN) C13LP.LJJJLZIJ(c1773710wG1LIZIZ.LJJ, list2)) != null) {
            if (!TextUtils.isEmpty(c1772690wEN.LJIIIIZZ) && !Intrinsics.LJFF(c1772690wEN2.LJIIIIZZ, c1772690wEN.LJIIIIZZ)) {
                C1771980wDE.LJIIIIZZ(c1772150wDV.LIZIZ, c1772690wEN, c1772690wEN2);
                C1771980wDE.LIZIZ(C1771990wDF.LJFF, c1772150wDV.LIZ);
            } else {
                c1772690wEN.LJII = null;
                if (true ^ c1772690wEN2.LIZJ.isEmpty()) {
                    c1772690wEN.LIZJ = c1772690wEN2.LIZJ;
                } else {
                    return;
                }
            }
            C1772880wEg.LJ(EnumC1771830wCz.REFRESH, c1772150wDV.LIZ.LIZ, c1772690wEN.LIZJ);
            List<Function2<C1772690wEN, C1771590wCb, Unit>> list3 = this.LIZJ.get(c1772690wEN.LIZLLL);
            if (list3 != null) {
                Iterator<Function2<C1772690wEN, C1771590wCb, Unit>> it2 = list3.iterator();
                while (it2.hasNext()) {
                    it2.next().invoke(c1772690wEN, c1772150wDV.LIZ);
                }
            }
        }
    }

    public final void LJIILL(AbstractC1772230wDd abstractC1772230wDd) {
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this.LIZIZ), null, null, new C863020XtM(this, abstractC1772230wDd, null), 3);
    }

    public final void LJIIIIZZ(boolean z, AbstractC1772230wDd abstractC1772230wDd) {
        InterfaceC606320NqI interfaceC606320NqI;
        int i;
        InterfaceC606320NqI interfaceC606320NqI2;
        Integer num;
        String str;
        n nVar;
        if (z) {
            C1774130wGh.LIZ.getClass();
            if (!C1774130wGh.LIZ().enableNoLoadMoreEvent) {
                ECMMKContainerController eCMMKContainerController = this.LIZIZ.LLILLL;
                if (eCMMKContainerController != null && (interfaceC606320NqI2 = eCMMKContainerController.LLILZIL) != null) {
                    if (abstractC1772230wDd instanceof C1772220wDc) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        C1772220wDc c1772220wDc = (C1772220wDc) abstractC1772230wDd;
                        Response<n> response = c1772220wDc.LIZJ;
                        if (response != null && (nVar = response.data) != null) {
                            linkedHashMap.put("data", GsonProtectorUtils.fromJson(C1772540wE8.LLILLL.getValue(), (k) nVar, Map.class));
                        }
                        Response<n> response2 = c1772220wDc.LIZJ;
                        if (response2 != null && (str = response2.message) != null) {
                            linkedHashMap.put("message", str);
                        }
                        Response<n> response3 = c1772220wDc.LIZJ;
                        if (response3 != null) {
                            linkedHashMap.put("code", Integer.valueOf(response3.code));
                        }
                        Response<n> response4 = c1772220wDc.LIZJ;
                        if (response4 != null && (num = response4.chunkIndex) != null) {
                            linkedHashMap.put("chunk_index", Integer.valueOf(num.intValue()));
                        }
                        Pair[] pairArr = new Pair[2];
                        String str2 = abstractC1772230wDd.LIZ.LIZ;
                        if (str2 == null) {
                            str2 = CardStruct.IStatusCode.DEFAULT;
                        }
                        pairArr[0] = new Pair("tab_id", str2);
                        pairArr[1] = new Pair("data", linkedHashMap);
                        interfaceC606320NqI2.LIZLLL("ec_mix_mall_loadmore_api_success", C2097608Jq.LJIIJ(pairArr), null, false);
                    }
                } else {
                    C599820Nfo.LIZ.getClass();
                    C599820Nfo.LIZIZ();
                }
            }
        }
        ECMMKContainerController eCMMKContainerController2 = this.LIZIZ.LLILLL;
        if (eCMMKContainerController2 != null && (interfaceC606320NqI = eCMMKContainerController2.LLILZIL) != null) {
            if (!(abstractC1772230wDd instanceof C1772220wDc) && !(abstractC1772230wDd instanceof C1772190wDZ)) {
                return;
            }
            String str3 = abstractC1772230wDd.LIZ.LIZ;
            if (str3 != null) {
                if (z) {
                    i = 1;
                } else {
                    i = 2;
                }
                interfaceC606320NqI.LIZLLL("ec_mix_mall_loadmore_state_change", C2097608Jq.LJIIJ(new Pair("tab_id", str3), new Pair("state", Integer.valueOf(i)), new Pair("reason", abstractC1772230wDd.LIZ.LJI)), null, false);
                return;
            }
            return;
        }
        C599820Nfo.LIZ.getClass();
        C599820Nfo.LIZIZ();
    }

    public final void LJIIL(C1772140wDU c1772140wDU, C1772750wET c1772750wET) {
        List<? extends AbstractC1773210wFD> list;
        List<? extends AbstractC1773210wFD> list2;
        C1772670wEL c1772670wELLJII;
        List<C1772690wEN> list3;
        C1772690wEN c1772690wEN;
        C1772630wEH c1772630wEH = c1772140wDU.LIZIZ;
        C1773780wG8 c1773780wG8 = c1772630wEH.LIZJ;
        List<? extends AbstractC1773210wFD> list4 = null;
        if (c1773780wG8 != null) {
            list = c1773780wG8.LIZLLL;
        } else {
            list = null;
        }
        C1772690wEN c1772690wEN2 = c1772630wEH.LIZLLL;
        if (c1772690wEN2 != null) {
            list2 = c1772690wEN2.LIZJ;
        } else {
            list2 = null;
        }
        C1773710wG1 c1773710wG1LIZIZ = c1772630wEH.LIZIZ();
        if (c1773710wG1LIZIZ != null && (list3 = c1773710wG1LIZIZ.LJJIII) != null && (c1772690wEN = (C1772690wEN) ListProtector.get(list3, c1773710wG1LIZIZ.LJJ)) != null) {
            list4 = c1772690wEN.LIZJ;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (list != null) {
            arrayList.addAll(list);
        }
        if (list2 != null) {
            arrayList2.addAll(list2);
        }
        if (list4 != null) {
            arrayList2.addAll(list4);
        }
        String str = c1772140wDU.LIZ.LJFF;
        if (Intrinsics.LJFF(str, "prefetch_cache")) {
            c1772750wET.LJJIFFI = c1772630wEH.LIZ;
            this.LIZIZ.zQ2(new C1772730wER(EnumC1772960wEo.CACHE, arrayList, arrayList2, 24), c1772750wET);
        } else {
            if (Intrinsics.LJFF(str, "first_fetch")) {
                ECMMKContainerController eCMMKContainerController = this.LIZIZ.LLILLL;
                if (eCMMKContainerController != null && (c1772670wELLJII = eCMMKContainerController.LJII()) != null && c1772670wELLJII.LIZIZ) {
                    return;
                }
                c1772750wET.LJJII = c1772630wEH.LIZ;
                this.LIZIZ.zQ2(new C1772730wER(EnumC1772960wEo.FETCH, arrayList, arrayList2, c1772630wEH.LJIIL, c1772630wEH.LJIILIIL), c1772750wET);
                return;
            }
            this.LIZIZ.zQ2(new C1772730wER(EnumC1772960wEo.OTHER, arrayList, arrayList2, c1772630wEH.LJIIL, c1772630wEH.LJIILIIL), c1772750wET);
        }
    }

    public final void LJIIIZ(boolean z, AbstractC1772230wDd abstractC1772230wDd, boolean z2) {
        if (z2) {
            return;
        }
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this.LIZIZ), C0PEM.LIZJ, null, new C1772090wDP(z, this, abstractC1772230wDd, null), 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1772620wEG(C1772650wEJ c1772650wEJ, ECMMKViewModel eCMMKViewModel, Map<String, ? extends List<Function2<C1772690wEN, C1771590wCb, Unit>>> map, List<? extends Function2<? super C1773780wG8, ? super C1771590wCb, Unit>> list, List<? extends Function1<? super C1772630wEH, Unit>> list2) {
        ECMMKContainerController eCMMKContainerController;
        C1772650wEJ c1772650wEJ2;
        AbstractC1772270wDh abstractC1772270wDh;
        C18Z6 bodyList;
        this.LIZ = c1772650wEJ;
        this.LIZIZ = eCMMKViewModel;
        this.LIZJ = map;
        this.LIZLLL = list;
        this.LJ = list2;
        C2252331DDr c2252331DDrLIZIZ = C09IR.LIZIZ(0, 0, null, 7);
        this.LJII = c2252331DDrLIZIZ;
        this.LJIIIZ = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(500));
        this.LJIIJ = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(499));
        this.LJIIJJI = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(501));
        AwS605S0100000_26 awS605S0100000_26 = new AwS605S0100000_26(this, 781);
        C09IC.LJJI(ViewModelKt.getViewModelScope(eCMMKViewModel), new C861640Xr8(new C1772210wDb(this, null), c2252331DDrLIZIZ));
        C1773020wEu.LIZ.getClass();
        Integer num = C1773020wEu.LIZIZ().enableFeedDynamicHeight;
        if (num != null && num.intValue() == 2 && (eCMMKContainerController = eCMMKViewModel.LLILLL) != null && (c1772650wEJ2 = eCMMKContainerController.LL) != null && (abstractC1772270wDh = c1772650wEJ2.LJ) != null && (bodyList = abstractC1772270wDh.getBodyList()) != null) {
            bodyList.LJ(awS605S0100000_26);
        }
    }
}
