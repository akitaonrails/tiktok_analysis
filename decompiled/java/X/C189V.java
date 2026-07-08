package X;

import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.bytedance.hybrid.spark.SparkContext;
import com.lynx.tasm.LynxViewClient;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.message.template.card.dynamic.DynamicInfoComponent;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.189V, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C189V implements C18SR {
    public static boolean LJIILL;
    public final ViewGroup LIZ;
    public final C189W LIZIZ;
    public final Function0<Unit> LIZJ;
    public final Float LIZLLL;
    public final Function0<Unit> LJ;
    public boolean LJFF;
    public InterfaceC1541990qEH LJI;
    public C869590Y9l LJIIIIZZ;
    public DynamicInfoComponent LJIIIZ;
    public Integer LJIIL;
    public String LJII = "";
    public final ConcurrentHashMap<String, String> LJIIJ = new ConcurrentHashMap<>();
    public final ViewTreeObserverOnWindowFocusChangeListenerC20575115fB LJIIJJI = new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: X.15fB
        @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
        public final void onWindowFocusChanged(boolean z) {
            InterfaceC1541990qEH interfaceC1541990qEH;
            View viewE1;
            if (z && (interfaceC1541990qEH = this.LL.LJI) != null && (viewE1 = interfaceC1541990qEH.e1()) != null) {
                viewE1.requestLayout();
            }
        }
    };
    public final C20574815f8 LJIILIIL = new LynxViewClient() { // from class: X.15f8
        @Override // com.lynx.tasm.LynxViewClient
        public final void LJII() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onDataUpdated(");
            InterfaceC1541990qEH interfaceC1541990qEH = this.LL.LJI;
            sbLIZ.append(interfaceC1541990qEH != null ? interfaceC1541990qEH.hashCode() : 0);
            sbLIZ.append(", ");
            sbLIZ.append(this.LL.LJII);
            sbLIZ.append(')');
            C2188811AlT.LIZIZ(sbLIZ);
        }

        @Override // com.lynx.tasm.LynxViewClient
        public final void LJIIJ() {
            View viewE1;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onFirstScreen(");
            InterfaceC1541990qEH interfaceC1541990qEH = this.LL.LJI;
            sbLIZ.append(interfaceC1541990qEH != null ? interfaceC1541990qEH.hashCode() : 0);
            sbLIZ.append(", ");
            sbLIZ.append(this.LL.LJII);
            sbLIZ.append(')');
            C2188811AlT.LIZIZ(sbLIZ);
            InterfaceC1541990qEH interfaceC1541990qEH2 = this.LL.LJI;
            if (interfaceC1541990qEH2 == null || (viewE1 = interfaceC1541990qEH2.e1()) == null) {
                return;
            }
            C189V c189v = this.LL;
            c189v.LJIIIIZZ(viewE1);
            c189v.LJFF(viewE1);
        }

        @Override // com.lynx.tasm.LynxViewClient
        public final void LJIJ() {
            View viewE1;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onPageUpdate(");
            InterfaceC1541990qEH interfaceC1541990qEH = this.LL.LJI;
            sbLIZ.append(interfaceC1541990qEH != null ? interfaceC1541990qEH.hashCode() : 0);
            sbLIZ.append(", ");
            sbLIZ.append(this.LL.LJII);
            sbLIZ.append(')');
            C2188811AlT.LIZIZ(sbLIZ);
            InterfaceC1541990qEH interfaceC1541990qEH2 = this.LL.LJI;
            if (interfaceC1541990qEH2 == null || (viewE1 = interfaceC1541990qEH2.e1()) == null) {
                return;
            }
            C189V c189v = this.LL;
            c189v.LJIIIIZZ(viewE1);
            c189v.LJFF(viewE1);
        }

        @Override // com.lynx.tasm.LynxViewClient
        public final void LJJIIZI() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onUpdateDataWithoutChange(");
            InterfaceC1541990qEH interfaceC1541990qEH = this.LL.LJI;
            sbLIZ.append(interfaceC1541990qEH != null ? interfaceC1541990qEH.hashCode() : 0);
            sbLIZ.append(", ");
            sbLIZ.append(this.LL.LJII);
            sbLIZ.append(')');
            C2188811AlT.LIZIZ(sbLIZ);
        }

        @Override // com.lynx.tasm.LynxViewClient
        public final void onTimingSetup(Map<String, Object> map) {
            Object obj;
            int iHashCode;
            Map map2;
            Object obj2 = null;
            if (map != null) {
                obj = map.get("setup_timing");
            } else {
                obj = null;
            }
            if ((obj instanceof Map) && (map2 = (Map) obj) != null) {
                Object obj3 = map2.get("draw_end");
                if (obj3 instanceof Long) {
                    obj2 = obj3;
                }
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onTimingSetup(");
            InterfaceC1541990qEH interfaceC1541990qEH = this.LL.LJI;
            if (interfaceC1541990qEH != null) {
                iHashCode = interfaceC1541990qEH.hashCode();
            } else {
                iHashCode = 0;
            }
            sbLIZ.append(iHashCode);
            sbLIZ.append(", ");
            sbLIZ.append(this.LL.LJII);
            sbLIZ.append(") drawEnd=");
            sbLIZ.append(obj2);
            C2188811AlT.LIZIZ(sbLIZ);
        }

        @Override // com.lynx.tasm.LynxViewClient
        public final void LJJIIZ(String str, Map map, Map map2) {
            int iHashCode;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onTimingUpdate(");
            InterfaceC1541990qEH interfaceC1541990qEH = this.LL.LJI;
            if (interfaceC1541990qEH != null) {
                iHashCode = interfaceC1541990qEH.hashCode();
            } else {
                iHashCode = 0;
            }
            sbLIZ.append(iHashCode);
            sbLIZ.append(", ");
            sbLIZ.append(this.LL.LJII);
            sbLIZ.append(')');
            C2188811AlT.LIZIZ(sbLIZ);
        }
    };
    public final C20575515fF LJIILJJIL = new AbstractC1538740q92() { // from class: X.15fF
        public long LLILLJJLI;

        {
            super(0);
            this.LLILLJJLI = -1L;
        }

        @Override // X.AbstractC1537870q7d
        public final void LJLIIIL(InterfaceC1541990qEH interfaceC1541990qEH) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onLoadFinish(");
            sbLIZ.append(hashCode());
            sbLIZ.append(", ");
            sbLIZ.append(this.LLILLL.LJII);
            sbLIZ.append(')');
            C2188811AlT.LIZIZ(sbLIZ);
            if (this.LLILLJJLI != -1 && this.LLILLL.LIZIZ()) {
                LJLJL(true, SystemClock.elapsedRealtime() - this.LLILLJJLI, 0);
            }
            this.LLILLJJLI = -1L;
        }

        @Override // X.AbstractC1537870q7d
        public final void LJLIIL(InterfaceC1541990qEH interfaceC1541990qEH, String str) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onLoadStart(");
            sbLIZ.append(hashCode());
            sbLIZ.append(", ");
            sbLIZ.append(this.LLILLL.LJII);
            sbLIZ.append(')');
            C2188811AlT.LIZIZ(sbLIZ);
            this.LLILLJJLI = SystemClock.elapsedRealtime();
        }

        @Override // X.AbstractC1537870q7d
        public final void LJL(InterfaceC1541990qEH interfaceC1541990qEH, String str, C1542120qEU c1542120qEU) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onLoadFailed(");
            sbLIZ.append(hashCode());
            sbLIZ.append(", ");
            sbLIZ.append(this.LLILLL.LJII);
            sbLIZ.append(") hybridKitError=");
            sbLIZ.append(c1542120qEU.LIZ());
            C2188811AlT.LIZIZ(sbLIZ);
            this.LLILLL.LIZJ.invoke();
            if (this.LLILLJJLI != -1) {
                LJLJL(false, SystemClock.elapsedRealtime() - this.LLILLJJLI, c1542120qEU.LIZ);
            }
            this.LLILLJJLI = -1L;
        }

        public final void LJLJL(boolean z, long j, Integer num) {
            int iHashCode;
            String str;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onLoadedEvent(");
            InterfaceC1541990qEH interfaceC1541990qEH = this.LLILLL.LJI;
            if (interfaceC1541990qEH != null) {
                iHashCode = interfaceC1541990qEH.hashCode();
            } else {
                iHashCode = 0;
            }
            sbLIZ.append(iHashCode);
            sbLIZ.append(", ");
            sbLIZ.append(this.LLILLL.LJII);
            sbLIZ.append(") duration=");
            sbLIZ.append(j);
            sbLIZ.append(" isSuccess=");
            sbLIZ.append(z);
            C2188811AlT.LIZIZ(sbLIZ);
            C0I0B.LJFF.LIZIZ();
            C13DA c13da = new C13DA();
            c13da.put("load_duration", String.valueOf(j));
            if (z) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            c13da.put("load_status", str);
            c13da.put("error_code", String.valueOf(num));
            C20684815ws.LJIILLIIL("dm_lynx_load_duration", c13da.build());
        }
    };

    public final boolean equals(Object obj) {
        return this == obj;
    }

    @Override // X.C18SR
    public final boolean LIZIZ() {
        InterfaceC1541990qEH interfaceC1541990qEH = this.LJI;
        C1537720q7O c1537720q7O = interfaceC1541990qEH instanceof C1537720q7O ? (C1537720q7O) interfaceC1541990qEH : null;
        return c1537720q7O != null && c1537720q7O.LIZIZ();
    }

    @Override // X.C18SR
    public final void LIZLLL() {
        C1537480q70 hybridContext;
        String strLJIJI;
        C1537720q7O c1537720q7O;
        View viewE1;
        ViewGroup viewGroup;
        if (!this.LIZIZ.LIZJ) {
            InterfaceC1541990qEH interfaceC1541990qEH = this.LJI;
            if (interfaceC1541990qEH != null) {
                interfaceC1541990qEH.LLD(true);
                return;
            }
            return;
        }
        if (!LJIILL) {
            C1546500qLY c1546500qLY = C1546560qLe.LIZ;
            C1546510qLZ c1546510qLZ = new C1546510qLZ();
            c1546510qLZ.LIZLLL = this.LIZIZ.LIZLLL;
            c1546510qLZ.LJFF = "dm_dynamic_card";
            Boolean bool = Boolean.FALSE;
            c1546500qLY.getClass();
            C1546500qLY.LJI(c1546510qLZ, bool);
            LJIILL = true;
        }
        InterfaceC1541990qEH interfaceC1541990qEH2 = this.LJI;
        if (interfaceC1541990qEH2 == null || (hybridContext = interfaceC1541990qEH2.getHybridContext()) == null || (strLJIJI = hybridContext.LJIJI()) == null) {
            return;
        }
        InterfaceC1541990qEH interfaceC1541990qEH3 = this.LJI;
        if (!(interfaceC1541990qEH3 instanceof C1537720q7O) || (c1537720q7O = (C1537720q7O) interfaceC1541990qEH3) == null) {
            return;
        }
        C1546560qLe.LIZ.getClass();
        if (!C1546500qLY.LIZ(strLJIJI, "dm_dynamic_card", c1537720q7O)) {
            InterfaceC1541990qEH interfaceC1541990qEH4 = this.LJI;
            if (interfaceC1541990qEH4 != null) {
                interfaceC1541990qEH4.LLD(true);
                return;
            }
            return;
        }
        JSONArray jSONArray = C1533710q0v.LIZ;
        C1533710q0v.LIZ(hybridContext);
        LJI(hybridContext);
        InterfaceC1541990qEH interfaceC1541990qEH5 = this.LJI;
        if (interfaceC1541990qEH5 == null || (viewE1 = interfaceC1541990qEH5.e1()) == null) {
            return;
        }
        viewE1.getViewTreeObserver().removeOnWindowFocusChangeListener(this.LJIIJJI);
        ViewParent parent = viewE1.getParent();
        if (!(parent instanceof ViewGroup) || (viewGroup = (ViewGroup) parent) == null) {
            return;
        }
        C786410Ut5.LJJJLZIJ(viewE1, viewGroup);
    }

    public final int hashCode() {
        InterfaceC1541990qEH interfaceC1541990qEH = this.LJI;
        if (interfaceC1541990qEH != null) {
            return interfaceC1541990qEH.hashCode();
        }
        return 0;
    }

    @Override // X.C18SR
    public final boolean LIZJ() {
        return this.LJFF;
    }

    public static void LJI(C1537480q70 c1537480q70) {
        C1537910q7h c1537910q7h;
        CopyOnWriteArrayList<LynxViewClient> copyOnWriteArrayList;
        c1537480q70.LJJIII(AbstractC1539010q9T.class);
        c1537480q70.LJJIII(AbstractC1542200qEc.class);
        InterfaceC1531560pxS interfaceC1531560pxS = c1537480q70.hybridParams;
        if ((interfaceC1531560pxS instanceof C1537910q7h) && (c1537910q7h = (C1537910q7h) interfaceC1531560pxS) != null && (copyOnWriteArrayList = c1537910q7h.LJJJIL) != null) {
            C19719612Di.LJJIIJ(copyOnWriteArrayList, AFwS276S0000000_31.get$arr$(328), true);
        }
    }

    public final void LJFF(View view) {
        ViewGroup.LayoutParams layoutParams;
        Integer numValueOf;
        if (LIZIZ()) {
            Float f = this.LIZLLL;
            if (f != null) {
                float fFloatValue = f.floatValue();
                if (this.LJIIL != null) {
                    numValueOf = Integer.valueOf((int) (r0.intValue() * fFloatValue));
                } else {
                    numValueOf = null;
                }
                if (!Intrinsics.LJFF(numValueOf, Integer.valueOf(view.getHeight()))) {
                    view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("setWrapByRatio(");
                    sbLIZ.append(fFloatValue);
                    sbLIZ.append("), width=");
                    sbLIZ.append(Integer.valueOf(view.getMeasuredWidth()));
                    sbLIZ.append(", height=");
                    sbLIZ.append(Integer.valueOf(view.getMeasuredHeight()));
                    C2188811AlT.LIZIZ(sbLIZ);
                    ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                    if (layoutParams2 != null) {
                        this.LJIIL = Integer.valueOf(view.getMeasuredHeight());
                        layoutParams2.width = (int) (view.getMeasuredWidth() * fFloatValue);
                        layoutParams2.height = (int) (view.getMeasuredHeight() * fFloatValue);
                        C786410Ut5.W5(view, layoutParams2);
                        Function0<Unit> function0 = this.LJ;
                        if (function0 != null) {
                            function0.invoke();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
            if ((layoutParams3 != null && layoutParams3.width == -2 && layoutParams3.height == -2) || (layoutParams = view.getLayoutParams()) == null) {
                return;
            }
            layoutParams.width = -2;
            layoutParams.height = -2;
            C786410Ut5.W5(view, layoutParams);
        }
    }

    public final void LJIIIIZZ(View view) {
        C869590Y9l c869590Y9l;
        Map mapLIZ;
        int width = view.getWidth();
        int height = view.getHeight();
        if (width == 0 || height == 0 || (c869590Y9l = this.LJIIIIZZ) == null || (mapLIZ = C900710ZVd.LIZ(width, height, c869590Y9l)) == null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onMeasureUpdate(");
        sbLIZ.append(view.hashCode());
        sbLIZ.append(", ");
        sbLIZ.append(this.LJII);
        sbLIZ.append(") width=");
        sbLIZ.append(width);
        sbLIZ.append(" height=");
        sbLIZ.append(height);
        C2188811AlT.LIZIZ(sbLIZ);
        C0YNY.LIZ(InterfaceC874680YTa.LIZ).LIZIZ().LJFF(Collections.singletonList(new Pair(c869590Y9l, mapLIZ)), false, new C0Y3I("DynamicCardKitView update cached width/height"));
    }

    @Override // X.C18SR
    public final void setVisibility(boolean z) {
        View viewE1;
        int i;
        InterfaceC1541990qEH interfaceC1541990qEH = this.LJI;
        if (interfaceC1541990qEH != null && (viewE1 = interfaceC1541990qEH.e1()) != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, viewE1);
        }
    }

    @Override // X.C18SR
    public final void updateData(Map<String, String> map) {
        Object tag;
        View viewE1;
        View viewE12;
        View viewE13;
        InterfaceC1541990qEH interfaceC1541990qEH = this.LJI;
        Object obj = null;
        if (interfaceC1541990qEH != null && (viewE13 = interfaceC1541990qEH.e1()) != null) {
            tag = viewE13.getTag(R.id.xh);
        } else {
            tag = null;
        }
        if (tag instanceof Map) {
            obj = tag;
        }
        if (Intrinsics.LJFF(obj, map)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updateData(");
            sbLIZ.append(hashCode());
            sbLIZ.append(", ");
            sbLIZ.append(this.LJII);
            sbLIZ.append(") onShow");
            C2188811AlT.LIZIZ(sbLIZ);
            InterfaceC1541990qEH interfaceC1541990qEH2 = this.LJI;
            if (interfaceC1541990qEH2 != null) {
                interfaceC1541990qEH2.onShow();
            }
            InterfaceC1541990qEH interfaceC1541990qEH3 = this.LJI;
            if (interfaceC1541990qEH3 != null && (viewE12 = interfaceC1541990qEH3.e1()) != null) {
                LJFF(viewE12);
                return;
            }
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("updateData(");
        sbLIZ2.append(hashCode());
        sbLIZ2.append(", ");
        sbLIZ2.append(this.LJII);
        sbLIZ2.append(") updateData");
        C2188811AlT.LIZIZ(sbLIZ2);
        InterfaceC1541990qEH interfaceC1541990qEH4 = this.LJI;
        if (interfaceC1541990qEH4 != null) {
            interfaceC1541990qEH4.updateData(map);
        }
        InterfaceC1541990qEH interfaceC1541990qEH5 = this.LJI;
        if (interfaceC1541990qEH5 == null || (viewE1 = interfaceC1541990qEH5.e1()) == null) {
            return;
        }
        viewE1.setTag(R.id.xh, map);
    }

    @Override // X.C18SR
    public final void LIZ(String str, JSONObject jSONObject) {
        InterfaceC1541990qEH interfaceC1541990qEH = this.LJI;
        if (interfaceC1541990qEH != null) {
            interfaceC1541990qEH.LIZ(str, jSONObject);
        }
    }

    public static final void LJII(SparkContext sparkContext, final C189V c189v, final Map<String, String> map) {
        c189v.getClass();
        LJI(sparkContext);
        sparkContext.LJJIJIIJIL(c189v.LJIILJJIL);
        InterfaceC1531560pxS interfaceC1531560pxS = sparkContext.hybridParams;
        if (interfaceC1531560pxS instanceof C1537910q7h) {
            C1537910q7h c1537910q7h = (C1537910q7h) interfaceC1531560pxS;
            if (c1537910q7h != null) {
                c1537910q7h.LJIIIIZZ(new C1309990kC5(c189v.LJIILIIL));
            }
        } else {
            sparkContext.LJJJJZ(new AbstractC1539010q9T() { // from class: X.15fA
                @Override // X.AbstractC1539010q9T, X.InterfaceC1057870ddR
                public final void LJJJLL(InterfaceC1531560pxS interfaceC1531560pxS2) {
                    if (!(interfaceC1531560pxS2 instanceof C1537910q7h)) {
                        return;
                    }
                    C1537910q7h c1537910q7h2 = (C1537910q7h) interfaceC1531560pxS2;
                    c1537910q7h2.LJIJJ = TemplateData.LJII(map);
                    C189V c189v2 = c189v;
                    c189v2.getClass();
                    c1537910q7h2.LJIIIIZZ(new C1309990kC5(c189v2.LJIILIIL));
                }
            });
        }
        sparkContext.shortLinkUrlCacheMap = c189v.LJIIJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01e2  */
    @Override // X.C18SR
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(java.lang.String r8, java.util.Map<java.lang.String, java.lang.String> r9, X.C869590Y9l r10, com.ss.android.ugc.aweme.im.message.template.card.dynamic.DynamicInfoComponent r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 592
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C189V.LJ(java.lang.String, java.util.Map, X.0Y9l, com.ss.android.ugc.aweme.im.message.template.card.dynamic.DynamicInfoComponent):void");
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.15fB] */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.15f8] */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.15fF] */
    public C189V(ViewGroup viewGroup, C189W c189w, Function0<Unit> function0, Float f, Function0<Unit> function02) {
        this.LIZ = viewGroup;
        this.LIZIZ = c189w;
        this.LIZJ = function0;
        this.LIZLLL = f;
        this.LJ = function02;
    }
}
