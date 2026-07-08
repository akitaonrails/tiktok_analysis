package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreModelKt;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicSurfaceViewMediaLayerSettings;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;
import tikcast.linkmic.common.MultiGuestSpotExtra;
import tikcast.linkmic.common.MultiGuestSpotNonSeiExtra;
import tikcast.linkmic.common.PosIdentity;

/* JADX INFO: renamed from: X.1AZe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2181481AZe implements InterfaceC2228261CJc, InterfaceC21615019iW, C0UUV {
    public final Context LL;
    public final InterfaceC2182091Aad LLILLJJLI;
    public final InterfaceC2181771Aa7 LLILLL;
    public final String LLILZ;
    public final HashMap<Long, ViewGroup> LLILZIL;
    public final HashMap<Long, C2182161Aak> LLILZLL;
    public InterfaceC2181691AZz LLIZ;
    public FrameLayout LLIZLLLIL;
    public C21614919iV LLJ;
    public long LLJI;
    public long LLJIJIL;
    public FrameLayout LLJILJIL;
    public boolean LLJILJILJ;
    public final C01GW LLJILLL;
    public WeakReference<View> LLJJ;
    public WeakReference<View> LLJJI;
    public Object LLJJIII;

    @Override // X.C0UUV
    public final boolean LIZ() {
        return this.LLILLL.LJJIIZ();
    }

    @Override // X.InterfaceC21615019iW
    public final List<C2181741Aa4> LIZIZ() {
        C2181961AaQ c2181961AaQ;
        List<C2181741Aa4> list;
        List<C2181741Aa4> listLLIIII;
        C2182171Aal c2182171AalLJIJJ = this.LLILLL.LJIJJ();
        return (c2182171AalLJIJJ == null || (c2181961AaQ = c2182171AalLJIJJ.LIZ) == null || (list = c2181961AaQ.LIZLLL) == null || (listLLIIII = C13LP.LLIIII(list)) == null) ? C13BV.INSTANCE : listLLIIII;
    }

    @Override // X.InterfaceC2228261CJc
    public final long LIZJ() {
        C963800bBi c963800bBi = new C963800bBi(this, this.LL);
        c963800bBi.setId(R.id.ysf);
        this.LLILZIL.put(Long.valueOf(C1283930jW3.LIZIZ(c963800bBi)), c963800bBi);
        return C1283930jW3.LIZIZ(c963800bBi);
    }

    @Override // X.InterfaceC2228261CJc
    public final long LJIIIIZZ() {
        FrameLayout c21614919iV = this.LLJILJIL;
        if (c21614919iV == null && (c21614919iV = this.LLJ) == null) {
            c21614919iV = new C21614919iV(this, this.LL);
            c21614919iV.setId(R.id.yse);
            c21614919iV.setWillNotDraw(false);
            c21614919iV.setLayoutDirection(0);
            this.LLJ = null;
        }
        C786410Ut5.LJJJJIZL(c21614919iV);
        Collection<ViewGroup> collectionValues = this.LLILZIL.values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            if (((View) obj).getId() == R.id.yse) {
                arrayList.add(obj);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            this.LLILZIL.remove(Long.valueOf(C1283930jW3.LIZIZ(it2.next())));
        }
        this.LLILZIL.put(Long.valueOf(C1283930jW3.LIZIZ(c21614919iV)), c21614919iV);
        return C1283930jW3.LIZIZ(c21614919iV);
    }

    @Override // X.InterfaceC21615019iW
    public final C1AZU LJIIIZ() {
        return this.LLILLL.LLIIII();
    }

    public final void LJIIL() {
        String str;
        WeakReference<View> weakReference = this.LLJJ;
        View view = weakReference != null ? weakReference.get() : null;
        try {
            if (view == null) {
                View viewFindViewById = LJIJJLI().findViewById(R.id.ysj);
                if (viewFindViewById != null) {
                    C500260Jjc.LJJJLL(viewFindViewById);
                }
                String str2 = this.LLILZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("addSingleRenderViewToUIIfNeed: singleRenderView:");
                sbLIZ.append((String) null);
                sbLIZ.append(", result:");
                sbLIZ.append("single render view is null");
                C20441214yg.LIZIZ(str2, C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
            if (Intrinsics.LJFF(view.getParent(), LJIJJLI())) {
                str = "single render view has been added to render layer";
            } else {
                str = "add single render view to render layer";
                C500260Jjc.LJJJLL(view);
                view.setId(R.id.ysj);
                LJIJJLI().addView(view, LJIJJ(), new FrameLayout.LayoutParams(-1, -1));
            }
            String str3 = this.LLILZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("addSingleRenderViewToUIIfNeed: singleRenderView:");
            sbLIZ2.append(C500260Jjc.LJIIL(view));
            sbLIZ2.append(", result:");
            sbLIZ2.append(str);
            C20441214yg.LIZIZ(str3, C2188811AlT.LIZIZ(sbLIZ2));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            String str4 = this.LLILZ;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("addSingleRenderViewToUIIfNeed: singleRenderView:");
            sbLIZ3.append(view != null ? C500260Jjc.LJIIL(view) : null);
            sbLIZ3.append(", result:");
            sbLIZ3.append("");
            C20441214yg.LIZIZ(str4, C2188811AlT.LIZIZ(sbLIZ3));
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00ce A[PHI: r0 r1 r3
      0x00ce: PHI (r0v21 java.lang.StringBuilder) = (r0v7 java.lang.StringBuilder), (r0v24 java.lang.StringBuilder) binds: [B:27:0x00cc, B:11:0x0025] A[DONT_GENERATE, DONT_INLINE]
      0x00ce: PHI (r1v7 java.lang.String) = (r1v2 java.lang.String), (r1v9 java.lang.String) binds: [B:27:0x00cc, B:11:0x0025] A[DONT_GENERATE, DONT_INLINE]
      0x00ce: PHI (r3v5 java.lang.String) = (r3v2 java.lang.String), (r3v7 java.lang.String) binds: [B:27:0x00cc, B:11:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILIIL() {
        /*
            Method dump skipped, instruction units count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2181481AZe.LJIILIIL():void");
    }

    public final void LJIILJJIL() {
        Rect rect;
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            for (Map.Entry<Long, C2182161Aak> entry : this.LLILZLL.entrySet()) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("instance_id", entry.getKey().longValue());
                jSONObject2.put("window_view_id", entry.getValue().LIZ);
                jSONObject2.put("instance", C500260Jjc.LJIIJJI(entry.getValue().LIZIZ));
                jSONArray.put(jSONObject2);
            }
            jSONObject.put("render_view_list", jSONArray);
            JSONArray jSONArray2 = new JSONArray();
            jSONObject.put("items", jSONArray2);
            boolean z = true;
            boolean z2 = !this.LLILLJJLI.LJJJI();
            jSONObject.put("is_single_view", !z2);
            boolean z3 = this.LLJILJILJ;
            jSONObject.put("enable_render_layer", z3);
            Iterator<T> it2 = this.LLILZLL.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry2 = (Map.Entry) it2.next();
                ViewGroup viewGroup = this.LLILZIL.get(Long.valueOf(((C2182161Aak) entry2.getValue()).LIZ));
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("render_view", ((Number) entry2.getKey()).longValue());
                jSONObject3.put("container_view", viewGroup != null ? C500260Jjc.LJIIL(viewGroup) : null);
                jSONArray2.put(jSONObject3);
                if (viewGroup != null) {
                    ViewGroup viewGroupLJIJJLI = z3 ? LJIJJLI() : viewGroup;
                    jSONObject3.put("parent", C500260Jjc.LJIIL(viewGroupLJIJJLI));
                    View viewLJIILJJIL = ((C2182161Aak) entry2.getValue()).LIZIZ.LJIILJJIL();
                    if (!Intrinsics.LJFF(viewLJIILJJIL != null ? viewLJIILJJIL.getParent() : null, viewGroupLJIJJLI)) {
                        ((C2182161Aak) entry2.getValue()).LIZIZ.LJIIJ();
                        boolean z4 = ((C2182161Aak) entry2.getValue()).LIZIZ.LJIJ() > 0;
                        if (LinkMicSurfaceViewMediaLayerSettings.INSTANCE.getValue() && this.LLILLJJLI.LJJJI() && ((C2182161Aak) entry2.getValue()).LIZIZ.LJIILIIL()) {
                            jSONObject3.put("media_overlay", z);
                            z4 = true;
                        }
                        ((C2182161Aak) entry2.getValue()).LIZIZ.LJIIZILJ(viewGroupLJIJJLI, ((C2182161Aak) entry2.getValue()).LIZIZ.LJIJ(), z4, z2);
                    }
                    if (!(viewGroup instanceof C963800bBi) || (rect = ((C963800bBi) viewGroup).getOriginRect()) == null) {
                        rect = new Rect(C2181511AZh.LJIIIZ(viewGroup.getLayoutParams()), C2181511AZh.LJIILIIL(viewGroup.getLayoutParams()), C2181511AZh.LJIIIZ(viewGroup.getLayoutParams()) + viewGroup.getLayoutParams().width, C2181511AZh.LJIILIIL(viewGroup.getLayoutParams()) + viewGroup.getLayoutParams().height);
                    }
                    if (!z3) {
                        rect = new Rect(0, 0, rect.width(), rect.height());
                    }
                    ((C2182161Aak) entry2.getValue()).LIZIZ.LJIILLIIL(rect);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append('[');
                    sbLIZ.append(rect.left);
                    sbLIZ.append(", ");
                    sbLIZ.append(rect.top);
                    sbLIZ.append(", ");
                    sbLIZ.append(rect.right);
                    sbLIZ.append(", ");
                    sbLIZ.append(rect.bottom);
                    sbLIZ.append(']');
                    jSONObject3.put("rect", C2188811AlT.LIZIZ(sbLIZ));
                }
                ((C2182161Aak) entry2.getValue()).LIZIZ.setVisible(!this.LLILLJJLI.LJJJI() || (LinkCoreModelKt.currentUserIsAnchor() && ((C2182161Aak) entry2.getValue()).LIZIZ.LJIILIIL()));
                jSONObject3.put("visible", z2);
                z = true;
            }
            String str = this.LLILZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("adjustRenderViewLayerIfNeed, result:");
            sbLIZ2.append(jSONObject);
            C20441214yg.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ2));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            String str2 = this.LLILZ;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("adjustRenderViewLayerIfNeed, result:");
            sbLIZ3.append(jSONObject);
            C20441214yg.LIZIZ(str2, C2188811AlT.LIZIZ(sbLIZ3));
            throw th;
        }
    }

    public final FrameLayout LJIILLIIL() {
        FrameLayout frameLayout = this.LLJILJIL;
        return frameLayout == null ? this.LLJ : frameLayout;
    }

    public final FrameLayout LJIJJLI() {
        return (FrameLayout) this.LLJILLL.getValue();
    }

    public final int LJIJJ() {
        FrameLayout frameLayoutLJIILLIIL = LJIILLIIL();
        if (frameLayoutLJIILLIIL == null) {
            return 0;
        }
        return Math.min(0, frameLayoutLJIILLIIL.getChildCount());
    }

    public final int LJIL() {
        int iLJIJJ = LJIJJ();
        FrameLayout frameLayoutLJIILLIIL = LJIILLIIL();
        if (frameLayoutLJIILLIIL == null) {
            return iLJIJJ;
        }
        if (Intrinsics.LJFF(LJIJJLI().getParent(), frameLayoutLJIILLIIL)) {
            iLJIJJ++;
        }
        return Math.min(iLJIJJ, frameLayoutLJIILLIIL.getChildCount());
    }

    public final int LJJ() {
        WeakReference<View> weakReference;
        View view;
        int iLJIL = LJIL();
        FrameLayout frameLayoutLJIILLIIL = LJIILLIIL();
        if (frameLayoutLJIILLIIL == null || (weakReference = this.LLJJI) == null || (view = weakReference.get()) == null) {
            return iLJIL;
        }
        if (Intrinsics.LJFF(view.getParent(), frameLayoutLJIILLIIL)) {
            iLJIL++;
        }
        return Math.min(iLJIL, frameLayoutLJIILLIIL.getChildCount());
    }

    public final void LJJIFFI() {
        String strLIZIZ;
        FrameLayout frameLayoutLJIILLIIL = LJIILLIIL();
        String str = "";
        if (frameLayoutLJIILLIIL == null) {
            String str2 = this.LLILZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("initRenderViewLayer, layoutContainer:");
            sbLIZ.append((String) null);
            sbLIZ.append(", result:");
            sbLIZ.append("layout container is null");
            C20441214yg.LIZIZ(str2, C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        try {
            int iLJIJJ = LJIJJ();
            if (Intrinsics.LJFF(LJIJJLI().getParent(), frameLayoutLJIILLIIL)) {
                int iIndexOfChild = frameLayoutLJIILLIIL.indexOfChild(LJIJJLI());
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("render view layer index: ");
                sbLIZ2.append(iIndexOfChild);
                sbLIZ2.append(", base index: ");
                sbLIZ2.append(iLJIJJ);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                if (iIndexOfChild > iLJIJJ) {
                    C500260Jjc.LJJJLL(LJIJJLI());
                    frameLayoutLJIILLIIL.addView(LJIJJLI(), iLJIJJ);
                }
            } else {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("add render view layer to layout container, base index: ");
                sbLIZ3.append(iLJIJJ);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                C500260Jjc.LJJJLL(LJIJJLI());
                frameLayoutLJIILLIIL.addView(LJIJJLI(), iLJIJJ);
            }
            str = strLIZIZ + ", enableRenderLayer: " + this.LLJILJILJ + ", singleViewModeV2: " + this.LLILLJJLI.LJJJI();
            C500260Jjc.LJLJLJ(LJIJJLI(), this.LLJILJILJ || this.LLILLJJLI.LJJJI());
            String str3 = this.LLILZ;
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("initRenderViewLayer, layoutContainer:");
            sbLIZ4.append(C500260Jjc.LJIIL(frameLayoutLJIILLIIL));
            sbLIZ4.append(", result:");
            sbLIZ4.append(str);
            C20441214yg.LIZIZ(str3, C2188811AlT.LIZIZ(sbLIZ4));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            String str4 = this.LLILZ;
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("initRenderViewLayer, layoutContainer:");
            sbLIZ5.append(frameLayoutLJIILLIIL != null ? C500260Jjc.LJIIL(frameLayoutLJIILLIIL) : null);
            sbLIZ5.append(", result:");
            sbLIZ5.append(str);
            C20441214yg.LIZIZ(str4, C2188811AlT.LIZIZ(sbLIZ5));
            throw th;
        }
    }

    public static String LJIIZILJ(View view) {
        PosIdentity posIdentity;
        String str;
        View view2;
        String str2;
        if (view instanceof C963800bBi) {
            Iterator<View> it2 = new C09RD((ViewGroup) view).iterator();
            do {
                C09RE c09re = (C09RE) it2;
                if (c09re.hasNext()) {
                    view2 = (View) c09re.next();
                }
            } while (!(view2 instanceof C957020b0m));
            PosIdentity posIdentity2 = ((C957020b0m) view2).getPosIdentity();
            if (posIdentity2 == null || (str2 = posIdentity2.value) == null) {
                return "";
            }
            return str2;
        }
        if ((view instanceof C957020b0m) && (posIdentity = ((C957020b0m) view).getPosIdentity()) != null && (str = posIdentity.value) != null) {
            return str;
        }
        return "";
    }

    public static int LJIJI(View view) {
        Integer num;
        Object tag = view.getTag(R.id.ysc);
        if ((tag instanceof Integer) && (num = (Integer) tag) != null) {
            return num.intValue();
        }
        return -1;
    }

    public static int LJJI(View view) {
        Integer num;
        Object tag = view.getTag(R.id.ysb);
        if ((tag instanceof Integer) && (num = (Integer) tag) != null) {
            return num.intValue();
        }
        return -1;
    }

    @Override // X.InterfaceC21615019iW
    public final C21614719iT LJIIJ(long j) {
        ViewGroup viewGroup = this.LLILZIL.get(Long.valueOf(j));
        if (viewGroup != null) {
            int iLJIJI = LJIJI(viewGroup);
            if (iLJIJI < 0) {
                iLJIJI = 0;
            }
            return new C21614719iT(iLJIJI, viewGroup);
        }
        return null;
    }

    public final void LJIIJJI(ViewGroup viewGroup) {
        HashMap<Long, ViewGroup> map = this.LLILZIL;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<Long, ViewGroup> entry : map.entrySet()) {
            if (entry.getValue().getId() == viewGroup.getId()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it2 = linkedHashMap.entrySet().iterator();
        while (it2.hasNext()) {
            this.LLILZIL.remove(((Map.Entry) it2.next()).getKey());
        }
        long jLIZIZ = C1283930jW3.LIZIZ(viewGroup);
        this.LLILZIL.put(Long.valueOf(jLIZIZ), viewGroup);
        this.LLJI = jLIZIZ;
    }

    public final C957020b0m LJIILL(C2181741Aa4 c2181741Aa4) {
        MultiGuestSpotExtra multiGuestSpotExtraLJIIIZ;
        MultiGuestSpotNonSeiExtra multiGuestSpotNonSeiExtraLJIIJ;
        int iLJIJI;
        Object next;
        C957020b0m c957020b0m;
        long j = c2181741Aa4.LIZIZ;
        C2182241Aas c2182241Aas = c2181741Aa4.LIZLLL;
        String str = c2181741Aa4.LIZ;
        PosIdentity posIdentityLJI = C1282000jSw.LJI(c2181741Aa4.LJIIIIZZ);
        String str2 = c2181741Aa4.LIZJ;
        C1CWQ c1cwq = c2181741Aa4.LJFF;
        C1CXJ c1cxj = c2181741Aa4.LJI;
        String str3 = c2181741Aa4.LJIIJJI.LIZ;
        if (str3 != null) {
            C973010bQZ c973010bQZ = C973010bQZ.LIZ;
            multiGuestSpotExtraLJIIIZ = C973010bQZ.LJIIIZ(str3);
        } else {
            multiGuestSpotExtraLJIIIZ = null;
        }
        C2182121Aag c2182121Aag = c2181741Aa4.LJIIJJI;
        String str4 = c2182121Aag.LIZIZ;
        String str5 = c2182121Aag.LIZJ;
        if (str5 != null) {
            C973010bQZ c973010bQZ2 = C973010bQZ.LIZ;
            multiGuestSpotNonSeiExtraLJIIJ = C973010bQZ.LJIIJ(str5);
        } else {
            multiGuestSpotNonSeiExtraLJIIJ = null;
        }
        boolean z = c2181741Aa4.LJIIJ;
        boolean z2 = c2181741Aa4.LJIIIZ;
        long j2 = c2181741Aa4.LJII;
        ViewGroup viewGroup = this.LLILZIL.get(Long.valueOf(c2182241Aas.LIZ));
        if (viewGroup == null) {
            return null;
        }
        Rect rectLJI = C2181511AZh.LJI(viewGroup.getLayoutParams());
        if (!C1283930jW3.LIZJ(rectLJI)) {
            C1283980jW8 c1283980jW8 = c2182241Aas.LIZIZ;
            rectLJI = new Rect((int) c1283980jW8.LIZ, (int) c1283980jW8.LIZIZ, (int) c1283980jW8.LIZJ, (int) c1283980jW8.LIZLLL);
        }
        if (LJIJI(viewGroup) >= 0) {
            iLJIJI = LJIJI(viewGroup);
        } else {
            iLJIJI = (int) c2182241Aas.LIZIZ.LJ;
        }
        C915830ZwL c915830ZwL = new C915830ZwL(iLJIJI, rectLJI);
        Iterator<View> it2 = new C09RD(viewGroup).iterator();
        while (true) {
            C09RE c09re = (C09RE) it2;
            if (c09re.hasNext()) {
                next = c09re.next();
                if (next instanceof C957020b0m) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        if ((next instanceof C957020b0m) && (c957020b0m = (C957020b0m) next) != null) {
            c957020b0m.setSpotId(j);
            c957020b0m.setIdentity(str);
            c957020b0m.setWinState(C2181511AZh.LIZ(c1cwq));
            c957020b0m.setOnlineState(C2181511AZh.LIZLLL(c1cxj));
            c957020b0m.setPosIdentity(posIdentityLJI);
            c957020b0m.setContentLinkMicId(str2);
            c957020b0m.setMultiGuestExtra(multiGuestSpotExtraLJIIIZ);
            c957020b0m.setCohostSpotExtra(str4);
            c957020b0m.setMultiGuestNoSeiExtra(multiGuestSpotNonSeiExtraLJIIJ);
            c957020b0m.setShapeDescriptor(c915830ZwL);
            c957020b0m.setAnchor(z);
            c957020b0m.setSelf(z2);
            c957020b0m.setZOrder(j2);
            return c957020b0m;
        }
        C957020b0m c957020b0m2 = new C957020b0m(j, str, posIdentityLJI, str2, C2181511AZh.LIZ(c1cwq), C2181511AZh.LIZLLL(c1cxj), multiGuestSpotExtraLJIIIZ, multiGuestSpotNonSeiExtraLJIIJ, str4, c915830ZwL, z, z2, j2, this.LL);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c957020b0m2);
        c957020b0m2.setLayoutParams(layoutParams);
        viewGroup.addView(c957020b0m2);
        return c957020b0m2;
    }

    public final InterfaceC2181691AZz LJIJ(String str) {
        Object next;
        Iterator<T> it2 = this.LLILZLL.values().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(((C2182161Aak) next).LIZIZ.getLinkMicId(), str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C2182161Aak c2182161Aak = (C2182161Aak) next;
        if (c2182161Aak == null) {
            return null;
        }
        return c2182161Aak.LIZIZ;
    }

    public final boolean LJJII(View view) {
        if (view.getParent() == null || C1283930jW3.LIZIZ(view) == this.LLJI) {
            return false;
        }
        FrameLayout frameLayout = this.LLJILJIL;
        if (frameLayout != null && C1283930jW3.LIZIZ(view) == C1283930jW3.LIZIZ(frameLayout) && this.LLJIJIL != 0) {
            return false;
        }
        return true;
    }

    public final void LJJIII(C2177681AKo c2177681AKo) {
        String str = this.LLILZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onRTCView, linkMicId: ");
        sbLIZ.append(c2177681AKo.LIZIZ);
        sbLIZ.append(", rtcView:");
        sbLIZ.append(C500260Jjc.LJIIL(c2177681AKo.LIZ));
        C20441214yg.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ));
        C2182161Aak c2182161Aak = this.LLILZLL.get(Long.valueOf(c2177681AKo.hashCode()));
        if (c2182161Aak == null) {
            this.LLILZLL.put(Long.valueOf(c2177681AKo.hashCode()), new C2182161Aak(c2177681AKo));
        } else {
            c2182161Aak.LIZIZ = c2177681AKo;
        }
    }

    public final void LJJIIJ(String str) {
        try {
            ViewGroup viewGroup = this.LLILZIL.get(Long.valueOf(C1283930jW3.LIZIZ(LJIILLIIL())));
            if (viewGroup != null) {
                List<View> listLJJII = C09RB.LJJII(new C1133920fc6(C09RB.LJIIIZ(new C09RD(viewGroup), new C2181991AaT()), new Comparator() { // from class: X.1Aa8
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        this.LL.getClass();
                        Integer numValueOf = Integer.valueOf(C2181481AZe.LJJI((View) t));
                        this.LL.getClass();
                        return C20085613iQ.LIZIZ(numValueOf, Integer.valueOf(C2181481AZe.LJJI((View) t2)));
                    }
                }));
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(this.LLILZ);
                sbLIZ.append("_sorted");
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                StringBuilder sb = new StringBuilder();
                sb.append("resortChildView: source=");
                sb.append(str);
                sb.append(", ");
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJJII, 10));
                for (View view : listLJJII) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("instance", view.hashCode());
                    jSONObject.put("l", C2181511AZh.LJIIIZ(view.getLayoutParams()));
                    jSONObject.put("t", C2181511AZh.LJIILIIL(view.getLayoutParams()));
                    jSONObject.put("w", view.getWidth());
                    jSONObject.put("h", view.getHeight());
                    jSONObject.put("z", LJJI(view));
                    jSONObject.put("pos_identity", LJIIZILJ(view));
                    arrayList.add(jSONObject);
                }
                sb.append(arrayList);
                C20441214yg.LJIIIZ(strLIZIZ, sb.toString());
                List listLJJII2 = C09RB.LJJII(C09RB.LJIIIZ(new C09RD(viewGroup), new C2182001AaU()));
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(this.LLILZ);
                sbLIZ2.append("_unsort");
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(listLJJII2, 10));
                Iterator it2 = listLJJII2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(Integer.valueOf(((View) it2.next()).hashCode()));
                }
                C20441214yg.LJIIIZ(strLIZIZ2, String.valueOf(arrayList2));
                if (!Intrinsics.LJFF(listLJJII, listLJJII2)) {
                    int iLJJ = LJJ();
                    int i = 0;
                    for (Object obj : listLJJII) {
                        int i2 = i + 1;
                        if (i >= 0) {
                            View view2 = (View) obj;
                            LJJIIZI(LJJI(view2), view2);
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append(this.LLILZ);
                            sbLIZ3.append("_removeAdd");
                            C20441214yg.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ3), String.valueOf(view2.hashCode()));
                            C500260Jjc.LJJJLL(view2);
                            viewGroup.addView(view2, i + iLJJ);
                            i = i2;
                        } else {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                    }
                } else {
                    for (View view3 : listLJJII) {
                        LJJIIZI(LJJI(view3), view3);
                    }
                }
                List listLJJII3 = C09RB.LJJII(C09RB.LJIIIZ(new C09RD(viewGroup), new C2181981AaS()));
                String str2 = this.LLILZ + "_result";
                ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(listLJJII3, 10));
                Iterator it3 = listLJJII3.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(Integer.valueOf(((View) it3.next()).hashCode()));
                }
                C20441214yg.LJIIIZ(str2, String.valueOf(arrayList3));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append(this.LLILZ);
            sbLIZ4.append("_resorted");
            C20441214yg.LJFF(C2188811AlT.LIZIZ(sbLIZ4), String.valueOf(th.getMessage()), th);
        }
    }

    public final void LJJIIJZLJL(InterfaceC2181691AZz interfaceC2181691AZz) {
        String str = this.LLILZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setAnchorSelfRenderView, linkMicId: ");
        sbLIZ.append(interfaceC2181691AZz.getLinkMicId());
        sbLIZ.append(", rtcView:");
        sbLIZ.append(C500260Jjc.LJIIL(interfaceC2181691AZz.LJIILJJIL()));
        C20441214yg.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ));
        C2182161Aak c2182161Aak = this.LLILZLL.get(Long.valueOf(interfaceC2181691AZz.hashCode()));
        if (c2182161Aak == null) {
            this.LLILZLL.put(Long.valueOf(interfaceC2181691AZz.hashCode()), new C2182161Aak(interfaceC2181691AZz));
        } else {
            c2182161Aak.LIZIZ = interfaceC2181691AZz;
        }
        this.LLIZ = interfaceC2181691AZz;
    }

    public final void LJJIIZ(FrameLayout frameLayout) {
        FrameLayout frameLayout2 = this.LLJILJIL;
        long jLIZIZ = 0;
        if (frameLayout2 != null) {
            if (LJJII(frameLayout2)) {
                C500260Jjc.LJJJLL(frameLayout2);
            }
            this.LLJILJIL = null;
            this.LLJIJIL = 0L;
        }
        this.LLJILJIL = frameLayout;
        if (frameLayout != null) {
            ViewParent parent = frameLayout.getParent();
            if (parent != null) {
                jLIZIZ = C1283930jW3.LIZIZ(parent);
            }
            this.LLJIJIL = jLIZIZ;
            frameLayout.setLayoutDirection(0);
        }
    }

    @Override // X.InterfaceC2228261CJc
    public final void LIZLLL(long j, long j2) {
        String strLJIIL;
        InterfaceC2181691AZz interfaceC2181691AZz;
        String str = this.LLILZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("removeChild, parent:");
        ViewGroup viewGroup = this.LLILZIL.get(Long.valueOf(j));
        View viewLJIILJJIL = null;
        if (viewGroup != null) {
            strLJIIL = C500260Jjc.LJIIL(viewGroup);
        } else {
            strLJIIL = null;
        }
        sbLIZ.append(strLJIIL);
        sbLIZ.append(", child:");
        ViewGroup viewGroup2 = this.LLILZIL.get(Long.valueOf(j2));
        if (viewGroup2 != null) {
            viewLJIILJJIL = viewGroup2;
        } else {
            C2182161Aak c2182161Aak = this.LLILZLL.get(Long.valueOf(j2));
            if (c2182161Aak != null && (interfaceC2181691AZz = c2182161Aak.LIZIZ) != null) {
                viewLJIILJJIL = interfaceC2181691AZz.LJIILJJIL();
            }
        }
        sbLIZ.append(C500260Jjc.LJIIL(viewLJIILJJIL));
        C20441214yg.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ));
        ViewGroup viewGroup3 = this.LLILZIL.get(Long.valueOf(j));
        if (viewGroup3 != null) {
            ViewGroup viewGroup4 = this.LLILZIL.get(Long.valueOf(j2));
            if (viewGroup4 != null && LJJII(viewGroup4)) {
                C786410Ut5.LJJJLZIJ(viewGroup4, viewGroup3);
            }
            C2182161Aak c2182161Aak2 = this.LLILZLL.get(Long.valueOf(j2));
            if (c2182161Aak2 != null) {
                c2182161Aak2.LIZ = 0L;
                c2182161Aak2.LIZIZ.LJIIJ();
            }
        }
    }

    @Override // X.InterfaceC2228261CJc
    public final void LJ(long j, String str) {
        C2182161Aak c2182161Aak;
        InterfaceC2181691AZz interfaceC2181691AZz;
        String str2 = this.LLILZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("releaseContainer, id: ");
        sbLIZ.append(j);
        sbLIZ.append(", view:");
        ViewGroup viewGroupLJIILJJIL = this.LLILZIL.get(Long.valueOf(j));
        String strLJIIL = null;
        if (viewGroupLJIILJJIL != null || ((c2182161Aak = this.LLILZLL.get(Long.valueOf(j))) != null && (interfaceC2181691AZz = c2182161Aak.LIZIZ) != null && (viewGroupLJIILJJIL = interfaceC2181691AZz.LJIILJJIL()) != null)) {
            strLJIIL = C500260Jjc.LJIIL(viewGroupLJIILJJIL);
        }
        sbLIZ.append(strLJIIL);
        sbLIZ.append(", source:");
        sbLIZ.append(str);
        C20441214yg.LJ(str2, C2188811AlT.LIZIZ(sbLIZ));
        ViewGroup viewGroupRemove = this.LLILZIL.remove(Long.valueOf(j));
        if (viewGroupRemove != null && LJJII(viewGroupRemove)) {
            C500260Jjc.LJJJLL(viewGroupRemove);
        }
        C2182161Aak c2182161AakRemove = this.LLILZLL.remove(Long.valueOf(j));
        if (c2182161AakRemove != null) {
            c2182161AakRemove.LIZ = 0L;
            c2182161AakRemove.LIZIZ.LJIIJ();
            c2182161AakRemove.LIZIZ.LJIIJJI();
        }
    }

    @Override // X.InterfaceC2228261CJc
    public final void LJI(String str, List list) {
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            LJ(((Number) it2.next()).longValue(), str);
        }
    }

    public final void LJJIIZI(int i, View view) {
        boolean z;
        Boolean boolValueOf;
        Object next;
        ViewGroup viewGroup;
        boolean z2;
        String strLJIIL;
        int iHashCode;
        ViewParent parent;
        Iterator<T> it2 = this.LLILZLL.values().iterator();
        while (true) {
            z = false;
            boolValueOf = null;
            if (it2.hasNext()) {
                next = it2.next();
                if (((C2182161Aak) next).LIZ == view.hashCode()) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C2182161Aak c2182161Aak = (C2182161Aak) next;
        if (c2182161Aak != null) {
            View viewLJIILJJIL = c2182161Aak.LIZIZ.LJIILJJIL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LLILZ);
            sbLIZ.append("_updateSurfaceZOrder1");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("view: ");
            sbLIZ2.append(C500260Jjc.LJIIL(view));
            sbLIZ2.append(", renderView: ");
            if (viewLJIILJJIL != null) {
                strLJIIL = C500260Jjc.LJIIL(viewLJIILJJIL);
            } else {
                strLJIIL = null;
            }
            sbLIZ2.append(strLJIIL);
            sbLIZ2.append(", z:");
            sbLIZ2.append(i);
            sbLIZ2.append(", renderViewParent:");
            if (viewLJIILJJIL != null && (parent = viewLJIILJJIL.getParent()) != null) {
                iHashCode = parent.hashCode();
            } else {
                iHashCode = 0;
            }
            sbLIZ2.append(iHashCode);
            sbLIZ2.append(", isAttachWindow:");
            if (viewLJIILJJIL != null) {
                boolValueOf = Boolean.valueOf(viewLJIILJJIL.isAttachedToWindow());
            }
            sbLIZ2.append(boolValueOf);
            sbLIZ2.append(" ,singleViewMode:");
            sbLIZ2.append(this.LLILLJJLI.LJJJI());
            C20441214yg.LJIIIZ(strLIZIZ, C2188811AlT.LIZIZ(sbLIZ2));
            InterfaceC2181691AZz interfaceC2181691AZz = c2182161Aak.LIZIZ;
            if (i > 0) {
                z = true;
            }
            interfaceC2181691AZz.LJIILL(z);
            if (LinkMicSurfaceViewMediaLayerSettings.INSTANCE.getValue() && this.LLILLJJLI.LJJJI() && c2182161Aak.LIZIZ.LJIILIIL()) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(this.LLILZ);
                sbLIZ3.append("_updateSurfaceZOrder1");
                C20441214yg.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ3), "setMediaOverlay to true");
                c2182161Aak.LIZIZ.LJIILL(true);
                return;
            }
            return;
        }
        if (!(view instanceof ViewGroup) || (viewGroup = (ViewGroup) view) == null) {
            return;
        }
        Iterator<View> it3 = new C09RD(viewGroup).iterator();
        while (true) {
            C09RE c09re = (C09RE) it3;
            if (!c09re.hasNext()) {
                return;
            }
            View view2 = (View) c09re.next();
            if (view2 instanceof SurfaceView) {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append(this.LLILZ);
                sbLIZ4.append("_updateSurfaceZOrder2");
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ4);
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("view: ");
                sbLIZ5.append(view.hashCode());
                sbLIZ5.append(", renderView: ");
                sbLIZ5.append(view2.hashCode());
                sbLIZ5.append(", z:");
                sbLIZ5.append(i);
                sbLIZ5.append(", isAttachWindow:");
                SurfaceView surfaceView = (SurfaceView) view2;
                sbLIZ5.append(surfaceView.isAttachedToWindow());
                C20441214yg.LJIIIZ(strLIZIZ2, C2188811AlT.LIZIZ(sbLIZ5));
                if (i > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                surfaceView.setZOrderMediaOverlay(z2);
            }
        }
    }

    @Override // X.InterfaceC2228261CJc
    public final void LJFF(long j, C1283980jW8 c1283980jW8, long j2) {
        String strLJIIL;
        boolean z;
        ViewGroup viewGroup;
        boolean z2;
        boolean z3;
        boolean z4;
        Rect rect;
        boolean z5;
        ViewParent parent;
        boolean z6;
        C2182161Aak c2182161Aak;
        InterfaceC2181691AZz interfaceC2181691AZz;
        try {
            C1283980jW8 c1283980jW8LIZ = C1283930jW3.LIZ(c1283980jW8);
            String str = this.LLILZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updateContainerFrame, container:");
            ViewGroup viewGroupLJIILJJIL = this.LLILZIL.get(Long.valueOf(j));
            if (viewGroupLJIILJJIL != null || ((c2182161Aak = this.LLILZLL.get(Long.valueOf(j))) != null && (interfaceC2181691AZz = c2182161Aak.LIZIZ) != null && (viewGroupLJIILJJIL = interfaceC2181691AZz.LJIILJJIL()) != null)) {
                strLJIIL = C500260Jjc.LJIIL(viewGroupLJIILJJIL);
            } else {
                strLJIIL = null;
            }
            sbLIZ.append(strLJIIL);
            sbLIZ.append(", frame:");
            sbLIZ.append(C2181511AZh.LJIIJ(c1283980jW8LIZ));
            sbLIZ.append(", zOrder:");
            sbLIZ.append(j2);
            C20441214yg.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ));
            FrameLayout frameLayoutLJIILLIIL = LJIILLIIL();
            ViewGroup viewGroup2 = this.LLILZIL.get(Long.valueOf(j));
            if (viewGroup2 != null) {
                if (Intrinsics.LJFF(viewGroup2, frameLayoutLJIILLIIL)) {
                    if (viewGroup2.getParent() instanceof ConstraintLayout) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) viewGroup2.getParent();
                        C19MB c19mb = new C19MB();
                        c19mb.LJII(constraintLayout);
                        int iLIZLLL = C1283930jW3.LIZLLL(c1283980jW8LIZ.LIZ);
                        int iLIZLLL2 = C1283930jW3.LIZLLL(c1283980jW8LIZ.LIZIZ);
                        int iLIZLLL3 = C1283930jW3.LIZLLL(c1283980jW8LIZ.LIZJ - c1283980jW8LIZ.LIZ);
                        int iLIZLLL4 = C1283930jW3.LIZLLL(c1283980jW8LIZ.LIZLLL - c1283980jW8LIZ.LIZIZ);
                        c19mb.LJIIIZ(viewGroup2.getId(), 6, 0, 6, iLIZLLL);
                        c19mb.LJIIIZ(viewGroup2.getId(), 7, 0, 7, 0);
                        c19mb.LJJII(0.0f, viewGroup2.getId());
                        c19mb.LJIIIZ(viewGroup2.getId(), 3, 0, 3, iLIZLLL2);
                        c19mb.LJIIIZ(viewGroup2.getId(), 4, 0, 4, 0);
                        c19mb.LJJIIZ(0.0f, viewGroup2.getId());
                        c19mb.LJIILL(viewGroup2.getId(), iLIZLLL3);
                        c19mb.LJIIJJI(viewGroup2.getId(), iLIZLLL4);
                        c19mb.LIZIZ(constraintLayout);
                    } else {
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C1283930jW3.LIZLLL(c1283980jW8LIZ.LIZJ - c1283980jW8LIZ.LIZ), C1283930jW3.LIZLLL(c1283980jW8LIZ.LIZLLL - c1283980jW8LIZ.LIZIZ));
                        layoutParams.leftMargin = C1283930jW3.LIZLLL(c1283980jW8LIZ.LIZ);
                        layoutParams.topMargin = C1283930jW3.LIZLLL(c1283980jW8LIZ.LIZIZ);
                        C786410Ut5.X5(layoutParams, viewGroup2);
                    }
                } else {
                    FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(C1283930jW3.LIZLLL(c1283980jW8LIZ.LIZJ - c1283980jW8LIZ.LIZ), C1283930jW3.LIZLLL(c1283980jW8LIZ.LIZLLL - c1283980jW8LIZ.LIZIZ));
                    layoutParams2.leftMargin = C1283930jW3.LIZLLL(c1283980jW8LIZ.LIZ);
                    layoutParams2.topMargin = C1283930jW3.LIZLLL(c1283980jW8LIZ.LIZIZ);
                    C786410Ut5.X5(layoutParams2, viewGroup2);
                }
                if (viewGroup2 instanceof C963800bBi) {
                    ((C963800bBi) viewGroup2).LLILLJJLI = new Rect((int) c1283980jW8LIZ.LIZ, (int) c1283980jW8LIZ.LIZIZ, (int) c1283980jW8LIZ.LIZJ, (int) c1283980jW8LIZ.LIZLLL);
                }
                C951770asJ.LIZ((int) c1283980jW8LIZ.LJ, viewGroup2);
                if (LJJI(viewGroup2) >= 0 && ((int) j2) != LJJI(viewGroup2)) {
                    z = true;
                } else {
                    z = false;
                }
                viewGroup2.setTag(R.id.ysc, Integer.valueOf((int) c1283980jW8LIZ.LJ));
                viewGroup2.setTag(R.id.ysb, Integer.valueOf((int) j2));
            } else {
                z = false;
            }
            C2182161Aak c2182161Aak2 = this.LLILZLL.get(Long.valueOf(j));
            if (c2182161Aak2 != null) {
                int i = (int) j2;
                if (c2182161Aak2.LIZIZ.LJIJ() != i) {
                    z = true;
                }
                c2182161Aak2.LIZIZ.LJIJI(i);
                if (frameLayoutLJIILLIIL == null) {
                    viewGroup = null;
                } else {
                    viewGroup = (ViewGroup) frameLayoutLJIILLIIL.findViewById(R.id.ysg);
                }
                if (!this.LLILLJJLI.LJJJI()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                InterfaceC2181691AZz interfaceC2181691AZz2 = c2182161Aak2.LIZIZ;
                boolean zLJJJI = this.LLILLJJLI.LJJJI();
                boolean zLJIILIIL = c2182161Aak2.LIZIZ.LJIILIIL();
                if (!zLJJJI || (LinkCoreModelKt.currentUserIsAnchor() && zLJIILIIL)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                interfaceC2181691AZz2.setVisible(z3);
                if (viewGroup != null && this.LLJILJILJ) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                ViewGroup viewGroup3 = this.LLILZIL.get(Long.valueOf(c2182161Aak2.LIZ));
                if (!z4) {
                    viewGroup = viewGroup3;
                }
                if (viewGroup != null) {
                    View viewLJIILJJIL = c2182161Aak2.LIZIZ.LJIILJJIL();
                    if (viewLJIILJJIL != null) {
                        parent = viewLJIILJJIL.getParent();
                    } else {
                        parent = null;
                    }
                    if (!Intrinsics.LJFF(parent, viewGroup)) {
                        c2182161Aak2.LIZIZ.LJIILJJIL();
                        InterfaceC2181691AZz interfaceC2181691AZz3 = c2182161Aak2.LIZIZ;
                        if (j2 > 0) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        interfaceC2181691AZz3.LJIIZILJ(viewGroup, i, z6, z2);
                    }
                }
                if (z4) {
                    ViewGroup viewGroup4 = this.LLILZIL.get(Long.valueOf(c2182161Aak2.LIZ));
                    if (viewGroup4 != null) {
                        if (viewGroup4 instanceof C963800bBi) {
                            rect = ((C963800bBi) viewGroup4).getOriginRect();
                            if (rect == null) {
                                rect = new Rect(C2181511AZh.LJIIIZ(((C963800bBi) viewGroup4).getLayoutParams()), C2181511AZh.LJIILIIL(((C963800bBi) viewGroup4).getLayoutParams()), C2181511AZh.LJIIIZ(((C963800bBi) viewGroup4).getLayoutParams()) + ((C963800bBi) viewGroup4).getLayoutParams().width, C2181511AZh.LJIILIIL(((C963800bBi) viewGroup4).getLayoutParams()) + ((C963800bBi) viewGroup4).getLayoutParams().height);
                            }
                        } else {
                            rect = new Rect(C2181511AZh.LJIIIZ(viewGroup4.getLayoutParams()), C2181511AZh.LJIILIIL(viewGroup4.getLayoutParams()), C2181511AZh.LJIIIZ(viewGroup4.getLayoutParams()) + viewGroup4.getLayoutParams().width, C2181511AZh.LJIILIIL(viewGroup4.getLayoutParams()) + viewGroup4.getLayoutParams().height);
                        }
                    } else {
                        rect = new Rect(C1283930jW3.LIZLLL(c1283980jW8LIZ.LIZ), C1283930jW3.LIZLLL(c1283980jW8LIZ.LIZIZ), C1283930jW3.LIZLLL(c1283980jW8LIZ.LIZJ), C1283930jW3.LIZLLL(c1283980jW8LIZ.LIZLLL));
                        String str2 = this.LLILZ;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("updateContainerFrame, using default rect for render view in renderLayer, ");
                        sbLIZ2.append(rect);
                        C20441214yg.LJ(str2, C2188811AlT.LIZIZ(sbLIZ2));
                    }
                } else {
                    rect = new Rect(C1283930jW3.LIZLLL(c1283980jW8LIZ.LIZ), C1283930jW3.LIZLLL(c1283980jW8LIZ.LIZIZ), C1283930jW3.LIZLLL(c1283980jW8LIZ.LIZJ), C1283930jW3.LIZLLL(c1283980jW8LIZ.LIZLLL));
                }
                if (z) {
                    InterfaceC2181691AZz interfaceC2181691AZz4 = c2182161Aak2.LIZIZ;
                    if (j2 > 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    interfaceC2181691AZz4.LJIILL(z5);
                }
                if (LinkMicSurfaceViewMediaLayerSettings.INSTANCE.getValue() && this.LLILLJJLI.LJJJI() && c2182161Aak2.LIZIZ.LJIILIIL()) {
                    c2182161Aak2.LIZIZ.LJIILL(true);
                }
                c2182161Aak2.LIZIZ.LJIILLIIL(rect);
                c2182161Aak2.LIZIZ.LJIIL((int) c1283980jW8LIZ.LJ);
                this.LLILLJJLI.LJJJJL(c2182161Aak2.LIZIZ.getLinkMicId(), (float) (c1283980jW8LIZ.LJ / ((double) C1283930jW3.LIZLLL(c1283980jW8LIZ.LIZJ - c1283980jW8LIZ.LIZ))), c2182161Aak2.LIZIZ.LJIILIIL());
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            String str3 = this.LLILZ;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("updateContainerFrame exception: ");
            sbLIZ3.append(th.getMessage());
            C20441214yg.LJFF(str3, C2188811AlT.LIZIZ(sbLIZ3), th);
        }
    }

    @Override // X.InterfaceC2228261CJc
    public final void LJII(long j, long j2, long j3) {
        String strLJIIL;
        String strLJIIL2;
        boolean z;
        int iMin;
        C2182161Aak c2182161Aak;
        InterfaceC2181691AZz interfaceC2181691AZz;
        try {
            String str = this.LLILZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("addChild, parent:");
            ViewGroup viewGroup = this.LLILZIL.get(Long.valueOf(j));
            ViewGroup viewGroup2 = null;
            if (viewGroup != null) {
                strLJIIL = C500260Jjc.LJIIL(viewGroup);
            } else {
                strLJIIL = null;
            }
            sbLIZ.append(strLJIIL);
            sbLIZ.append(", child:");
            ViewGroup viewGroupLJIILJJIL = this.LLILZIL.get(Long.valueOf(j2));
            if (viewGroupLJIILJJIL != null || ((c2182161Aak = this.LLILZLL.get(Long.valueOf(j2))) != null && (interfaceC2181691AZz = c2182161Aak.LIZIZ) != null && (viewGroupLJIILJJIL = interfaceC2181691AZz.LJIILJJIL()) != null)) {
                strLJIIL2 = C500260Jjc.LJIIL(viewGroupLJIILJJIL);
            } else {
                strLJIIL2 = null;
            }
            sbLIZ.append(strLJIIL2);
            sbLIZ.append(", zOrder:");
            sbLIZ.append(j3);
            C20441214yg.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ));
            ViewGroup viewGroup3 = this.LLILZIL.get(Long.valueOf(j));
            if (viewGroup3 != null) {
                FrameLayout frameLayoutLJIILLIIL = LJIILLIIL();
                if (frameLayoutLJIILLIIL != null) {
                    viewGroup2 = (ViewGroup) frameLayoutLJIILLIIL.findViewById(R.id.ysg);
                }
                ViewGroup viewGroup4 = this.LLILZIL.get(Long.valueOf(j2));
                boolean z2 = false;
                if (viewGroup4 != null) {
                    if (Intrinsics.LJFF(viewGroup4, frameLayoutLJIILLIIL)) {
                        if (viewGroup4.getId() == -1) {
                            viewGroup4.setId(R.id.yse);
                        }
                        if (!Intrinsics.LJFF(viewGroup4.getParent(), viewGroup3)) {
                            C500260Jjc.LJJJLL(viewGroup4);
                            viewGroup3.addView(viewGroup4);
                        }
                        viewGroup4.setTag(R.id.ysb, Integer.valueOf((int) j3));
                        LJJIFFI();
                        LJIIL();
                        LJIILJJIL();
                        LJIILIIL();
                    } else {
                        C500260Jjc.LJJJLL(viewGroup4);
                        int i = (int) j3;
                        viewGroup4.setTag(R.id.ysb, Integer.valueOf(i));
                        if (viewGroup2 != null) {
                            FrameLayout frameLayoutLJIILLIIL2 = LJIILLIIL();
                            if (frameLayoutLJIILLIIL2 == null) {
                                iMin = 0;
                            } else {
                                iMin = Math.min(LJJ() + i, frameLayoutLJIILLIIL2.getChildCount());
                            }
                            viewGroup3.addView(viewGroup4, iMin);
                        } else {
                            viewGroup3.addView(viewGroup4);
                        }
                    }
                }
                C2182161Aak c2182161Aak2 = this.LLILZLL.get(Long.valueOf(j2));
                if (c2182161Aak2 != null) {
                    c2182161Aak2.LIZ = j;
                    if (viewGroup2 != null && this.LLJILJILJ) {
                        viewGroup3 = viewGroup2;
                    }
                    if (!this.LLILLJJLI.LJJJI()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    InterfaceC2181691AZz interfaceC2181691AZz2 = c2182161Aak2.LIZIZ;
                    int i2 = (int) j3;
                    if (LJJI(viewGroup3) > 0) {
                        z2 = true;
                    }
                    interfaceC2181691AZz2.LJIIZILJ(viewGroup3, i2, z2, z);
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(this.LLILZ);
            sbLIZ2.append("_addChild");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("add child exception: ");
            sbLIZ3.append(e.getMessage());
            C20441214yg.LJFF(strLIZIZ, C2188811AlT.LIZIZ(sbLIZ3), e);
        }
    }

    public C2181481AZe(int i, Context context, InterfaceC2182091Aad interfaceC2182091Aad, InterfaceC2181771Aa7 interfaceC2181771Aa7) {
        this.LL = context;
        this.LLILLJJLI = interfaceC2182091Aad;
        this.LLILLL = interfaceC2181771Aa7;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C1283930jW3.LJI(i));
        sbLIZ.append("LayoutViewProviderImpl");
        this.LLILZ = C2188811AlT.LIZIZ(sbLIZ);
        this.LLILZIL = new HashMap<>();
        this.LLILZLL = new HashMap<>();
        C21614919iV c21614919iV = new C21614919iV(this, context);
        c21614919iV.setId(R.id.yse);
        c21614919iV.setWillNotDraw(false);
        c21614919iV.setLayoutDirection(0);
        this.LLJ = c21614919iV;
        this.LLJILLL = C452501pT.LIZIZ(new C2181751Aa5(this));
    }
}
