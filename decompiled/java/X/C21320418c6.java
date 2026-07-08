package X;

import android.content.Context;
import android.graphics.Typeface;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.forest.Forest;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.18c6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21320418c6 {
    public static final C21320418c6 LIZ = new C21320418c6();
    public static final C1300780jxE LIZIZ = new C1300780jxE();
    public static final AtomicBoolean LIZJ = new AtomicBoolean(false);

    public final synchronized void LIZ() {
        AtomicBoolean atomicBoolean = LIZJ;
        if (!atomicBoolean.get()) {
            C1168270gVV.LIZ.LJIIJJI(new InterfaceC1168310gVZ() { // from class: X.0kvL
                @Override // X.InterfaceC1168310gVZ
                public final Map<String, Object> LIZLLL() {
                    return null;
                }

                @Override // X.InterfaceC1168310gVZ
                public final InterfaceC1321540kUi LJFF() {
                    return null;
                }

                @Override // X.InterfaceC1168310gVZ
                public final Object LJII() {
                    return null;
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
                public final JSONObject LIZIZ() {
                    Object c098200Yq;
                    try {
                        C1338330kvn.LIZ.getClass();
                        c098200Yq = new JSONObject(((n) C1338330kvn.LIZJ.getValue()).toString());
                        C189200o6.m2constructorimpl(c098200Yq);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    if (C189200o6.m7isFailureimpl(c098200Yq)) {
                        c098200Yq = null;
                    }
                    return (JSONObject) c098200Yq;
                }

                @Override // X.InterfaceC1168310gVZ
                public final InterfaceC1321110kU1 LIZJ() {
                    return new C1326010kbv("pdp");
                }

                @Override // X.InterfaceC1168310gVZ
                public final C1168340gVc LJIIJ() {
                    C1168340gVc c1168340gVc = C1168340gVc.LIZJ;
                    return C1168330gVb.LIZIZ(false);
                }

                @Override // X.InterfaceC1168310gVZ
                public final boolean LJIIIIZZ() {
                    IECommerceHostService iECommerceHostService;
                    IECommerceHostService iECommerceHostService2;
                    if (C034S.LIZ()) {
                        C1120604Zw.LIZ.LIZ();
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
                        C1AQS.LIZJ(jElapsedRealtime, 1, IApplicationDependencyService.class.getName(), iECommerceHostService != null ? iECommerceHostService.getClass().getName() : null, iECommerceHostService != null);
                    } else {
                        C1120604Zw.LIZ.LIZ();
                        iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
                    }
                    if (((IApplicationDependencyService) iECommerceHostService).isOffline()) {
                        return true;
                    }
                    if (C034S.LIZ()) {
                        C1120604Zw.LIZ.LIZ();
                        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                        iECommerceHostService2 = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
                        C1AQS.LIZJ(jElapsedRealtime2, 1, IApplicationDependencyService.class.getName(), iECommerceHostService2 != null ? iECommerceHostService2.getClass().getName() : null, iECommerceHostService2 != null);
                    } else {
                        C1120604Zw.LIZ.LIZ();
                        iECommerceHostService2 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
                    }
                    return ((IApplicationDependencyService) iECommerceHostService2).isRegressionTest();
                }

                @Override // X.InterfaceC1168310gVZ
                public final String LJ(String str) {
                    boolean z;
                    Object c098200Yq;
                    Object obj;
                    Object c098200Yq2;
                    boolean z2 = true;
                    if (str.length() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        if (str.length() != 0) {
                            z2 = false;
                        }
                        Object obj2 = null;
                        if (!z2) {
                            String str2 = (String) ((ConcurrentHashMap) C1957207la.LIZ.getValue()).get(str);
                            if (str2 == null) {
                                try {
                                    c098200Yq2 = C1942307jB.LIZIZ(UriProtector.parse(str), "url");
                                    if (c098200Yq2 == null) {
                                        c098200Yq2 = str;
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
                                str2 = (String) c098200Yq2;
                                if (str2 == null) {
                                    str2 = str;
                                }
                                ((ConcurrentHashMap) C1957207la.LIZ.getValue()).put(str, str2);
                            }
                            str = str2;
                        }
                        String str3 = (String) ((ConcurrentHashMap) C1957207la.LIZIZ.getValue()).get(str);
                        if (str3 != null) {
                            return str3;
                        }
                        try {
                            C1533510q0b c1533510q0bLIZ = C1957207la.LIZ(str);
                            if (c1533510q0bLIZ == null || (c098200Yq = c1533510q0bLIZ.LIZIZ) == null) {
                                c098200Yq = "";
                            }
                            C189200o6.m2constructorimpl(c098200Yq);
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                            c098200Yq = new C098200Yq(th2);
                            C189200o6.m2constructorimpl(c098200Yq);
                        }
                        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) C1957207la.LIZIZ.getValue();
                        if (C189200o6.m7isFailureimpl(c098200Yq)) {
                            obj = null;
                        } else {
                            obj = c098200Yq;
                        }
                        if (obj == null) {
                            obj = "";
                        }
                        concurrentHashMap.put(str, obj);
                        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                            obj2 = c098200Yq;
                        }
                        String str4 = (String) obj2;
                        if (str4 != null) {
                            return str4;
                        }
                    }
                    return "";
                }

                @Override // X.InterfaceC1168310gVZ
                public final AbstractC21333318eB LIZ(final C21325918cz c21325918cz, String str) {
                    if (Intrinsics.LJFF(str, "image")) {
                        if (c21325918cz.LIZ.LJJJJL) {
                            return new C1321390kUT(c21325918cz);
                        }
                        return new C1322980kX2(c21325918cz);
                    }
                    if (Intrinsics.LJFF(str, "ec-rich-text")) {
                        return new AbstractC21333318eB<C03DH>(c21325918cz) { // from class: X.0w3d
                            public ECRichText LLZZJLIL;
                            public Integer LLZZLLIL;

                            @Override // X.AbstractC21333318eB
                            public final View LJJJLZIJ(Context context) {
                                return new TuxTextView(context) { // from class: X.03DH
                                    {
                                        setId(TextView.generateViewId());
                                        setGravity(8388627);
                                        setEllipsize(TextUtils.TruncateAt.END);
                                        setTuxFont(61);
                                        setTextColorRes(R.attr.a1i);
                                    }
                                };
                            }

                            @Override // X.AbstractC21333318eB
                            public final void LJJLIIIJILLIZJL(Map<String, ? extends Object> map) {
                                Object c098200Yq;
                                Iterator<Map.Entry<String, ? extends Object>> it2 = map.entrySet().iterator();
                                boolean z = false;
                                boolean z2 = false;
                                while (true) {
                                    ECRichText eCRichText = null;
                                    Object obj = null;
                                    eCRichText = null;
                                    if (!it2.hasNext()) {
                                        break;
                                    }
                                    Map.Entry<String, ? extends Object> next = it2.next();
                                    Object value = next.getValue();
                                    String key = next.getKey();
                                    if (Intrinsics.LJFF(key, "content")) {
                                        if (value != null) {
                                            if (value instanceof String) {
                                                eCRichText = (ECRichText) C309390CAv.LIZ((String) value, ECRichText.class);
                                            } else if (value instanceof Map) {
                                                try {
                                                    c098200Yq = (ECRichText) C309390CAv.LIZ(C1741890vQh.LJIIIIZZ(value), ECRichText.class);
                                                    C189200o6.m2constructorimpl(c098200Yq);
                                                } catch (Throwable th) {
                                                    TryCatchGuardChecker.doCheck(th);
                                                    c098200Yq = new C098200Yq(th);
                                                    C189200o6.m2constructorimpl(c098200Yq);
                                                }
                                                if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                                                    obj = c098200Yq;
                                                }
                                                eCRichText = (ECRichText) obj;
                                            }
                                        }
                                        if (!Intrinsics.LJFF(eCRichText, this.LLZZJLIL)) {
                                            this.LLZZJLIL = eCRichText;
                                            z = true;
                                        }
                                    } else if (Intrinsics.LJFF(key, "line_num")) {
                                        Integer numLIZIZ = C051Y.LIZIZ(value);
                                        if (!Intrinsics.LJFF(numLIZIZ, this.LLZZLLIL)) {
                                            this.LLZZLLIL = numLIZIZ;
                                            z2 = true;
                                        }
                                    }
                                }
                                if (z || z2) {
                                    C03DH view = getView();
                                    ECRichText eCRichText2 = this.LLZZJLIL;
                                    Integer num = this.LLZZLLIL;
                                    if (eCRichText2 != null) {
                                        view.getClass();
                                        if (num != null) {
                                            int iIntValue = num.intValue();
                                            if (iIntValue <= 0) {
                                                view.setMaxLines(Integer.MAX_VALUE);
                                            } else {
                                                view.setMaxLines(iIntValue);
                                            }
                                        }
                                        C03C8.LIZJ(view, eCRichText2, "sea_ec_myna_richtext", null);
                                        return;
                                    }
                                    view.setText("");
                                }
                            }

                            @Override // X.AbstractC21333318eB
                            public final /* bridge */ /* synthetic */ void LJJJLIIL(View view) {
                            }
                        };
                    }
                    return null;
                }

                @Override // X.InterfaceC1168310gVZ
                public final Typeface LJI(int i, String str, boolean z) {
                    C21320418c6.LIZIZ.getClass();
                    return C1300780jxE.LIZIZ(str);
                }
            }, "sea_pdp");
            C21322218cO c21322218cO = C21322218cO.LIZ;
            C1123804aS.LIZ.getClass();
            C01GW c01gw = C1123804aS.LIZLLL;
            Forest forest = (Forest) c01gw.getValue();
            c21322218cO.getClass();
            C21322218cO.LJIIIZ("sea_pdp", "tiktok_ecom_sea_pdp", forest);
            C21322218cO.LJIIIZ("sea_pdp", "tiktok_ecom_sea_pdp_popup", (Forest) c01gw.getValue());
            atomicBoolean.set(true);
        }
    }
}
