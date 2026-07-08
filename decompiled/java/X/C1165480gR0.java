package X;

import Y.ACListenerS32S1300000_26;
import Y.ARunnableS118S0100000_18;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.forest.model.RequestParams;
import com.bytedance.lynx.hybrid.service.IResourceServiceX;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.pipo.stellar.base.card.MynaViewData;
import com.bytedance.pipo.stellar.base.model.prop.StellarActionDO;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.tiktok.myna.render.render.MynaTemplateProtocol;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS227S0300000_18;
import kotlin.jvm.internal.AwS31S0200100_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0gR0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1165480gR0 extends AbstractC1720840usk<MynaViewData> {
    public boolean LLILZ = true;
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 2601));

    @Override // X.AbstractC1720840usk
    public final int LJ() {
        return R.layout.ady;
    }

    public final void LJIIIZ() {
        View view = this.LLILLJJLI;
        if (view != null) {
            HandlerHook.viewPost(view, new ARunnableS118S0100000_18(this, 76));
        }
    }

    public static void LJIIIIZZ(String str) {
        C1716310ulR c1716310ulR = C1716310ulR.LIZ;
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("step", "myna_render"), new Pair("error", str));
        c1716310ulR.getClass();
        C1716310ulR.LIZLLL("rd_pipo_stellar_render", mapLJIIIIZZ);
    }

    public final void LJI(Map<String, StellarActionDO> map) {
        ViewGroup viewGroup;
        View childAt;
        C21325918cz c21325918czLIZIZ;
        AbstractC21333318eB<?> abstractC21333318eBLJII;
        View view;
        if (!map.isEmpty() && (viewGroup = (ViewGroup) this.LLILZIL.getValue()) != null && (childAt = viewGroup.getChildAt(0)) != null) {
            for (Map.Entry<String, StellarActionDO> entry : map.entrySet()) {
                String key = entry.getKey();
                StellarActionDO value = entry.getValue();
                InterfaceC1338020kvI interfaceC1338020kvILJI = C1337990kvF.LJI(childAt);
                if (interfaceC1338020kvILJI != null && (c21325918czLIZIZ = interfaceC1338020kvILJI.LIZIZ()) != null && (abstractC21333318eBLJII = c21325918czLIZIZ.LJII(key)) != null && (view = abstractC21333318eBLJII.getView()) != null) {
                    C786410Ut5.I7(new ACListenerS32S1300000_26(this, key, value, view, 2), view);
                }
            }
        }
    }

    public static C1162640gMQ LJII(String str, String str2) {
        C1162640gMQ c1162640gMQ = new C1162640gMQ("pipo_stellar", str2);
        c1162640gMQ.LIZIZ = (MynaTemplateProtocol) GsonProtectorUtils.fromJson(C7740030o.LIZ().getGson(), str, MynaTemplateProtocol.class);
        c1162640gMQ.LIZLLL = new InterfaceC1168310gVZ() { // from class: X.0gQe
            @Override // X.InterfaceC1168310gVZ
            public final AbstractC21333318eB LIZ(C21325918cz c21325918cz, String str3) {
                return null;
            }

            @Override // X.InterfaceC1168310gVZ
            public final JSONObject LIZIZ() {
                return null;
            }

            @Override // X.InterfaceC1168310gVZ
            public final InterfaceC1321110kU1 LIZJ() {
                return null;
            }

            @Override // X.InterfaceC1168310gVZ
            public final Map<String, Object> LIZLLL() {
                return null;
            }

            @Override // X.InterfaceC1168310gVZ
            public final String LJ(String str3) {
                return null;
            }

            @Override // X.InterfaceC1168310gVZ
            public final InterfaceC1321540kUi LJFF() {
                return null;
            }

            @Override // X.InterfaceC1168310gVZ
            public final Typeface LJI(int i, String str3, boolean z) {
                return null;
            }

            @Override // X.InterfaceC1168310gVZ
            public final Object LJII() {
                return null;
            }

            @Override // X.InterfaceC1168310gVZ
            public final boolean LJIIIIZZ() {
                return false;
            }

            @Override // X.InterfaceC1168310gVZ
            public final void LJIIIZ() {
            }

            @Override // X.InterfaceC1168310gVZ
            public final void LJIIJJI() {
            }

            @Override // X.InterfaceC1168310gVZ
            public final void LJIIL() {
            }

            @Override // X.InterfaceC1168310gVZ
            public final C1168340gVc LJIIJ() {
                C1168340gVc c1168340gVc = C1168340gVc.LIZJ;
                return C1168330gVb.LIZ(750.0f, 1.0f, 1.0f);
            }
        };
        return c1162640gMQ;
    }

    public static void LJIIJ(View view, MynaViewData mynaViewData) {
        boolean z;
        Integer skeletonHeightMode;
        View viewFindViewById = view.findViewById(R.id.p05);
        if (viewFindViewById != null) {
            C786410Ut5.LJLLLLLL(0, viewFindViewById);
        }
        if (mynaViewData != null && (skeletonHeightMode = mynaViewData.getSkeletonHeightMode()) != null && skeletonHeightMode.intValue() == 2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            View viewFindViewById2 = view.findViewById(R.id.vf4);
            if (viewFindViewById2 != null) {
                C786410Ut5.LJLLLLLL(0, viewFindViewById2);
            }
            View viewFindViewById3 = view.findViewById(R.id.vf5);
            if (viewFindViewById3 != null) {
                C786410Ut5.LJLLLLLL(0, viewFindViewById3);
            }
        } else {
            View viewFindViewById4 = view.findViewById(R.id.vf4);
            if (viewFindViewById4 != null) {
                C786410Ut5.LJLLLLLL(0, viewFindViewById4);
            }
            View viewFindViewById5 = view.findViewById(R.id.vf5);
            if (viewFindViewById5 != null) {
                C786410Ut5.LJLLLLLL(8, viewFindViewById5);
            }
        }
        AbstractC20628015ni abstractC20628015ni = (AbstractC20628015ni) view.findViewById(R.id.vf3);
        if (abstractC20628015ni != null) {
            abstractC20628015ni.setLoading(true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [X.0q1M, kotlin.jvm.internal.DefaultConstructorMarker] */
    /* JADX WARN: Type inference failed for: r9v13 */
    @Override // X.AbstractC1720840usk
    public final void LJFF(View view, MynaViewData mynaViewData, EnumC1720670usT enumC1720670usT) {
        String schema;
        String templateString;
        boolean z;
        Object c098200Yq;
        Object obj;
        Map<String, Object> mapLJ;
        MynaViewData mynaViewData2 = mynaViewData;
        super.LJFF(view, mynaViewData2, enumC1720670usT);
        String templateUrl = mynaViewData2.getTemplateUrl();
        int i = 1;
        if ((templateUrl == null || templateUrl.length() == 0) && (((schema = mynaViewData2.getSchema()) == null || schema.length() == 0) && ((templateString = mynaViewData2.getTemplateString()) == null || templateString.length() == 0))) {
            LJIIIZ();
            LJIIIIZZ("myna_card_data_is_empty");
            return;
        }
        String templateString2 = mynaViewData2.getTemplateString();
        if (templateString2 != null && templateString2.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        Object objFetchResourceAsyncIfNeed = 0;
        C21326518d5 c21326518d5 = null;
        Object c098200Yq2 = null;
        if (!z) {
            View viewFindViewById = view.findViewById(R.id.p05);
            if (viewFindViewById != null) {
                C786410Ut5.LJLLLLLL(8, viewFindViewById);
            }
            String templateString3 = mynaViewData2.getTemplateString();
            if (templateString3 == null) {
                return;
            }
            try {
                C1162640gMQ c1162640gMQLJII = LJII(templateString3, toString());
                long jCurrentTimeMillis = System.currentTimeMillis();
                String data = mynaViewData2.getData();
                if (data != null && data.length() > 0) {
                    mapLJ = C116600cO.LIZIZ(new JSONObject(data));
                } else {
                    mapLJ = C2097608Jq.LJ();
                }
                FrameLayout frameLayout = (FrameLayout) this.LLILZIL.getValue();
                if (frameLayout != null) {
                    C1162990gMz c1162990gMzLIZ = C1162650gMR.LIZ(frameLayout.getContext(), c1162640gMQLJII, mapLJ, new AwS31S0200100_18(this, mynaViewData2, jCurrentTimeMillis, 1));
                    C21326518d5 c21326518d52 = c1162990gMzLIZ.LIZLLL;
                    if (c21326518d52 != null) {
                        c21326518d5 = c21326518d52;
                    }
                    frameLayout.addView(c21326518d5.LIZIZ);
                    c098200Yq2 = new C1162670gMT(c1162990gMzLIZ);
                }
                C189200o6.m2constructorimpl(c098200Yq2);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq2 = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq2);
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq2);
            if (thM5exceptionOrNullimpl == null) {
                return;
            }
            LJIIIIZZ(String.valueOf(thM5exceptionOrNullimpl));
            return;
        }
        String templateUrl2 = mynaViewData2.getTemplateUrl();
        if (templateUrl2 != null && templateUrl2.length() != 0) {
            LJIIJ(view, mynaViewData2);
            String templateUrl3 = mynaViewData2.getTemplateUrl();
            if (templateUrl3 == null) {
                return;
            }
            try {
                JSONArray jSONArray = C1533710q0v.LIZ;
                IResourceServiceX iResourceServiceXLIZIZ = C1533710q0v.LIZIZ(null, false);
                if (iResourceServiceXLIZIZ != null) {
                    RequestParams requestParams = new RequestParams(objFetchResourceAsyncIfNeed, i, objFetchResourceAsyncIfNeed);
                    requestParams.consumeType = byte[].class;
                    objFetchResourceAsyncIfNeed = iResourceServiceXLIZIZ.fetchResourceAsyncIfNeed(templateUrl3, requestParams, new AwS227S0300000_18(this, mynaViewData2, view, 59));
                }
                C189200o6.m2constructorimpl(objFetchResourceAsyncIfNeed);
                obj = objFetchResourceAsyncIfNeed;
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                Object c098200Yq3 = new C098200Yq(th2);
                C189200o6.m2constructorimpl(c098200Yq3);
                obj = c098200Yq3;
            }
            if (C189200o6.m5exceptionOrNullimpl(obj) == null) {
                return;
            }
            LJIIIZ();
            LJIIIIZZ("render_fetch_exception");
            return;
        }
        LJIIJ(view, mynaViewData2);
        String schema2 = mynaViewData2.getSchema();
        if (schema2 == null) {
            return;
        }
        try {
            C1DFH c1dfh = C0PEM.LIZ;
            c098200Yq = C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C1165240gQc(this, schema2, mynaViewData2, view, null), 3);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
            c098200Yq = new C098200Yq(th3);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) == null) {
            return;
        }
        LJIIIZ();
        LJIIIIZZ("render_schema_exception");
    }
}
