package X;

import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.starlight.nodes.StarlightNode;
import com.ss.android.ugc.aweme.nimblecard.tako.context.NimbleTemplateContext;
import com.ss.android.ugc.aweme.nimblecard.tako.model.ConditionNode;
import com.ss.android.ugc.aweme.nimblecard.tako.model.TemplateData;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.14Ne, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC20254814Ne<V_TYPE extends ViewGroup> extends C14NT<V_TYPE> implements InterfaceC689530R2x {
    public final List<TemplateData> LJIIL;
    public List<TemplateData> LJIILIIL;
    public final List<C14NX> LJIILJJIL;
    public Map<Integer, Pair<ConditionNode, C14NX>> LJIILL;
    public Map<String, ? extends Object> LJIILLIIL;

    @Override // X.InterfaceC689530R2x
    public final void LJIJ() {
    }

    @Override // X.InterfaceC689530R2x
    public final List<C14NX> LIZ() {
        return this.LJIILJJIL;
    }

    public AbstractC20254814Ne(NimbleTemplateContext nimbleTemplateContext) {
        super(nimbleTemplateContext);
        this.LJIIL = new ArrayList();
        this.LJIILJJIL = new ArrayList();
        this.LJIILL = new LinkedHashMap();
    }

    @Override // X.C14NT, X.C14NX
    public void LJII(TemplateData templateData) {
        ArrayList arrayList;
        final List list;
        final List list2;
        List<TemplateData> list3;
        List<TemplateData> list4;
        super.LJII(templateData);
        List<TemplateData> list5 = this.LJIIL;
        if (list5 != null) {
            ((ArrayList) list5).clear();
        }
        if (templateData != null && (list3 = templateData.children) != null && (list4 = this.LJIIL) != null) {
            ((ArrayList) list4).addAll(list3);
        }
        if (!C14NV.LIZ(templateData)) {
            List<TemplateData> list6 = this.LJIIL;
            final ViewGroup viewGroup = (ViewGroup) getView();
            if (list6 != null) {
                arrayList = new ArrayList();
                for (Object obj : (ArrayList) list6) {
                    if (!Intrinsics.LJFF(((TemplateData) obj).type, "If")) {
                        arrayList.add(obj);
                    }
                }
            } else {
                arrayList = null;
            }
            if (viewGroup.getChildCount() != 0 && viewGroup.getChildCount() != 0 && !Intrinsics.LJFF(this.LJIILIIL, arrayList)) {
                final List list7 = this.LJIILIIL;
                try {
                    try {
                        if (list7 == null) {
                            list7 = C13BV.INSTANCE;
                        }
                        if (arrayList != null) {
                            list = arrayList;
                        } else {
                            list = C13BV.INSTANCE;
                        }
                        C21341918fZ c21341918fZLIZ = C21342318fd.LIZ(new AbstractC21342018fa(list7, list) { // from class: X.14Ng
                            public final List<TemplateData> LIZ;
                            public final List<TemplateData> LIZIZ;

                            @Override // X.AbstractC21342018fa
                            public final int LIZLLL() {
                                return this.LIZIZ.size();
                            }

                            @Override // X.AbstractC21342018fa
                            public final int LJ() {
                                return this.LIZ.size();
                            }

                            {
                                this.LIZ = list7;
                                this.LIZIZ = list;
                            }

                            @Override // X.AbstractC21342018fa
                            public final boolean LIZ(int i, int i2) {
                                if (ListProtector.get(this.LIZ, i) == ListProtector.get(this.LIZIZ, i2)) {
                                    return true;
                                }
                                return false;
                            }

                            @Override // X.AbstractC21342018fa
                            public final boolean LIZIZ(int i, int i2) {
                                return Intrinsics.LJFF(((TemplateData) ListProtector.get(this.LIZ, i)).type, ((TemplateData) ListProtector.get(this.LIZIZ, i2)).type);
                            }
                        }, false);
                        if (arrayList == null) {
                            list2 = C13BV.INSTANCE;
                        } else {
                            list2 = arrayList;
                        }
                        c21341918fZLIZ.LIZIZ(new InterfaceC1891370zJn() { // from class: X.14Nf
                            @Override // X.InterfaceC1891370zJn
                            public final void LLJJJJJIL(int i, int i2, Object obj2) {
                            }

                            @Override // X.InterfaceC1891370zJn
                            public final void LJZL(int i, int i2) {
                                int i3 = i2 + i;
                                while (i < i3) {
                                    this.LJJIIZ(viewGroup, this.LIZ.LIZJ(((TemplateData) ListProtector.get(list2, i)).type), i);
                                    i++;
                                }
                            }

                            @Override // X.InterfaceC1891370zJn
                            public final void LLI(int i, int i2) {
                                throw new UnsupportedOperationException("no support move");
                            }

                            @Override // X.InterfaceC1891370zJn
                            public final void LLIZLLLIL(int i, int i2) {
                                int i3 = (i2 + i) - 1;
                                if (i > i3) {
                                    return;
                                }
                                while (true) {
                                    this.LJJIJIIJIL(i3, viewGroup);
                                    if (i3 != i) {
                                        i3--;
                                    } else {
                                        return;
                                    }
                                }
                            }
                        });
                    } catch (IndexOutOfBoundsException e) {
                        TryCatchGuardChecker.doCheck(e);
                        LJJIJIIJI(viewGroup);
                    }
                    LJJIJ(viewGroup, arrayList);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    LJJIJ(viewGroup, arrayList);
                    throw th;
                }
            } else {
                LJJIJ(viewGroup, arrayList);
            }
            this.LJIILIIL = arrayList;
        }
    }

    @Override // X.InterfaceC689530R2x
    public final void LJIIL(C14NW c14nw) {
        List<TemplateData> list;
        int iIndexOf;
        int iIndexOf2 = ((ArrayList) this.LJIILJJIL).indexOf(c14nw);
        if (iIndexOf2 > -1) {
            TemplateData templateData = c14nw.LJIILIIL;
            if (templateData != null && (list = this.LJIIL) != null && (iIndexOf = ((ArrayList) list).indexOf(templateData)) >= 0) {
                List<TemplateData> list2 = this.LJIIL;
                if (list2 != null) {
                    ListProtector.remove(list2, iIndexOf);
                }
                LJJIJIL(iIndexOf, -1);
            } else {
                List<TemplateData> list3 = this.LJIIL;
                if (list3 != null) {
                    C19719512Dh.LIZ(list3).remove(templateData);
                }
            }
            LJJIJIIJIL(iIndexOf2, getView());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0587  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x058a  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0591  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0641  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0644  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0673  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:399:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0227  */
    @Override // X.C14NT
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIIJZLJL(boolean r13) {
        /*
            Method dump skipped, instruction units count: 1831
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC20254814Ne.LJJIIJZLJL(boolean):void");
    }

    public final void LJJIJIIJI(ViewGroup viewGroup) {
        if (this.LIZIZ.LIZ() == 0) {
            return;
        }
        for (int iLIZ = this.LIZIZ.LIZ() - 1; -1 < iLIZ; iLIZ--) {
            this.LIZIZ.LIZJ(iLIZ);
        }
        C786410Ut5.LJJJJI(viewGroup);
        for (C14NX c14nx : this.LJIILJJIL) {
            c14nx.LJI(null);
            c14nx.LJIIIZ();
        }
        ((ArrayList) this.LJIILJJIL).clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020 A[PHI: r1 r11
      0x0020: PHI (r1v17 java.util.List) = (r1v50 java.util.List), (r1v51 java.util.List) binds: [B:9:0x001e, B:7:0x001a] A[DONT_GENERATE, DONT_INLINE]
      0x0020: PHI (r11v16 com.ss.android.ugc.aweme.nimblecard.tako.model.LoopVariables) = 
      (r11v19 com.ss.android.ugc.aweme.nimblecard.tako.model.LoopVariables)
      (r11v20 com.ss.android.ugc.aweme.nimblecard.tako.model.LoopVariables)
     binds: [B:9:0x001e, B:7:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c8 A[PHI: r1 r11
      0x00c8: PHI (r1v49 java.util.List) = (r1v17 java.util.List), (r1v50 java.util.List) binds: [B:11:0x0022, B:9:0x001e] A[DONT_GENERATE, DONT_INLINE]
      0x00c8: PHI (r11v18 com.ss.android.ugc.aweme.nimblecard.tako.model.LoopVariables) = 
      (r11v16 com.ss.android.ugc.aweme.nimblecard.tako.model.LoopVariables)
      (r11v19 com.ss.android.ugc.aweme.nimblecard.tako.model.LoopVariables)
     binds: [B:11:0x0022, B:9:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x010d  */
    @Override // X.C14NT
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIFFI(java.util.Map<java.lang.String, ? extends java.lang.Object> r18, X.C14NF r19) {
        /*
            Method dump skipped, instruction units count: 800
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC20254814Ne.LJJIFFI(java.util.Map, X.14NF):void");
    }

    public final int LJJIIZI(ConditionNode conditionNode, int i) {
        Object second;
        int i2 = 0;
        for (Object obj : (ArrayList) this.LJIILJJIL) {
            Pair pair = (Pair) ((LinkedHashMap) this.LJIILL).get(Integer.valueOf(i));
            Object first = null;
            if (pair != null) {
                second = pair.getSecond();
            } else {
                second = null;
            }
            if (Intrinsics.LJFF(second, obj)) {
                Pair pair2 = (Pair) ((LinkedHashMap) this.LJIILL).get(Integer.valueOf(i));
                if (pair2 != null) {
                    first = pair2.getFirst();
                }
                if (Intrinsics.LJFF(first, conditionNode)) {
                    return i2;
                }
            }
            i2++;
        }
        return -1;
    }

    public final void LJJIJ(ViewGroup viewGroup, List<TemplateData> list) {
        TemplateData templateData;
        if (viewGroup.getChildCount() == 0 && list != null) {
            for (TemplateData templateData2 : list) {
                if (!Intrinsics.LJFF(templateData2.type, "If")) {
                    LJJIIZ(viewGroup, this.LIZ.LIZJ(templateData2.type), -1);
                }
            }
        }
        int i = 0;
        for (Object obj : (ArrayList) this.LJIILJJIL) {
            int i2 = i + 1;
            if (i >= 0) {
                C14NX c14nx = (C14NX) obj;
                if (list != null && (templateData = (TemplateData) ListProtector.get(list, i)) != null) {
                    c14nx.LJII(templateData);
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }

    public final void LJJIJIIJIL(int i, ViewGroup viewGroup) {
        C14NX c14nx = (C14NX) C13LP.LJJJLZIJ(i, this.LJIILJJIL);
        C786410Ut5.LJJLIL(i, viewGroup);
        C14NX c14nx2 = (C14NX) C13LP.LJJJLZIJ(i, this.LJIILJJIL);
        if (c14nx2 != null) {
            c14nx2.LJI(null);
        }
        ListProtector.remove(this.LJIILJJIL, i);
        this.LIZIZ.LIZJ(i);
        if (c14nx != null) {
            c14nx.LJIIIZ();
        }
    }

    public final void LJJIJIL(int i, int i2) {
        int i3;
        if (i2 != 0 && !this.LJIILL.isEmpty()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<Integer, Pair<ConditionNode, C14NX>> entry : this.LJIILL.entrySet()) {
                int iIntValue = entry.getKey().intValue();
                Pair<ConditionNode, C14NX> value = entry.getValue();
                if (i2 <= 0 ? iIntValue > i : iIntValue >= i) {
                    i3 = iIntValue + i2;
                } else {
                    i3 = iIntValue;
                }
                if (i2 >= 0 || iIntValue != i) {
                    linkedHashMap.put(Integer.valueOf(i3), value);
                }
            }
            this.LJIILL = linkedHashMap;
        }
    }

    @Override // X.InterfaceC689530R2x
    public final void LJIJJLI(ViewGroup viewGroup, C14NW c14nw, int i) {
        TemplateData templateData;
        List<TemplateData> list = this.LJIIL;
        int size = 0;
        if ((list == null || !C13LP.LJJJJ(c14nw.LJIILIIL, list)) && (templateData = c14nw.LJIILIIL) != null) {
            if (i < 0) {
                List<TemplateData> list2 = this.LJIIL;
                if (list2 != null) {
                    size = ((ArrayList) list2).size();
                }
            } else {
                size = i;
            }
            List<TemplateData> list3 = this.LJIIL;
            if (list3 != null) {
                ListProtector.add(list3, size, templateData);
            }
            LJJIJIL(size, 1);
        }
        LJJIIZ(viewGroup, c14nw, i);
    }

    public final void LJJIIZ(ViewGroup viewGroup, C14NX c14nx, int i) {
        int size = i;
        if (viewGroup == null) {
            viewGroup = getView();
        }
        if (size < 0) {
            size = ((ArrayList) this.LJIILJJIL).size();
        }
        ListProtector.add(this.LJIILJJIL, size, c14nx);
        C14O8 c14o8 = this.LIZIZ;
        c14o8.LIZ.LJI = null;
        C14O8 c14o8LJFF = c14nx.LJFF();
        StarlightNode starlightNode = c14o8.LIZ;
        StarlightNode starlightNode2 = c14o8LJFF.LIZ;
        starlightNode.getClass();
        if (starlightNode2.LJ == null) {
            if (starlightNode.LIZLLL == null) {
                starlightNode.LIZLLL = new ArrayList();
            }
            if (size == -1) {
                ((ArrayList) starlightNode.LIZLLL).add(starlightNode2);
            } else {
                ListProtector.add(starlightNode.LIZLLL, size, starlightNode2);
            }
            starlightNode2.LJ = starlightNode;
            starlightNode.nativeInsertChild(starlightNode.LIZ, starlightNode2.LIZ, size);
            ListProtector.add(c14o8.LIZIZ, size, c14o8LJFF);
            c14nx.LJI(this);
            viewGroup.addView(c14nx.getView(), size);
            return;
        }
        throw new IllegalStateException("Child already has a parent, it must be removed first.");
    }

    @Override // X.C14NT, X.C14NX
    public final void LJIJI(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        if (getView().getVisibility() == 8) {
            return;
        }
        super.LJIJI(i, i2, i3, i4);
        for (C14NX c14nx : (ArrayList) this.LJIILJJIL) {
            float f4 = 0;
            float[] fArr = c14nx.LJFF().LIZ.LIZJ;
            float f5 = 0.0f;
            if (fArr != null) {
                f = fArr[2];
            } else {
                f = 0.0f;
            }
            int i5 = (int) (f + f4);
            float[] fArr2 = c14nx.LJFF().LIZ.LIZJ;
            if (fArr2 != null) {
                f2 = fArr2[3];
            } else {
                f2 = 0.0f;
            }
            int i6 = (int) (f4 + f2);
            float[] fArr3 = c14nx.LJFF().LIZ.LIZJ;
            if (fArr3 != null) {
                f3 = fArr3[0];
            } else {
                f3 = 0.0f;
            }
            int i7 = ((int) f3) + i5;
            float[] fArr4 = c14nx.LJFF().LIZ.LIZJ;
            if (fArr4 != null) {
                f5 = fArr4[1];
            }
            c14nx.LJIJI(i5, i6, i7, ((int) f5) + i6);
        }
    }
}
