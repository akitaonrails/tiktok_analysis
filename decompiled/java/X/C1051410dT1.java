package X;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.web.jsbridge.IESJsBridge;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.tasm.LynxView;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.web.context.AdSparkHybridContext;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0dT1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1051410dT1 {
    public static final C1051410dT1 LIZ = new C1051410dT1();

    public static void LJ(final InterfaceC1541990qEH interfaceC1541990qEH, Bundle bundle, InterfaceC1020440cf4 interfaceC1020440cf4) {
        final View viewE1;
        EnumC1062400dkk enumC1062400dkk;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        final C1051660dTQ c1051660dTQ = (C1051660dTQ) interfaceC1541990qEH.getHybridContext().LJFF(C1051660dTQ.class);
        if (c1051660dTQ == null) {
            c1051660dTQ = new C1051660dTQ();
        }
        interfaceC1541990qEH.getHybridContext().LJJ(C1051660dTQ.class, c1051660dTQ);
        final C1075770e6J c1075770e6J = (C1075770e6J) interfaceC1541990qEH.getHybridContext().LJFF(C1075770e6J.class);
        if (c1075770e6J == null || (viewE1 = interfaceC1541990qEH.e1()) == null) {
            return;
        }
        c1051660dTQ.LIZIZ = interfaceC1541990qEH.getHybridContext();
        c1051660dTQ.LJ(Context.class, viewE1.getContext());
        c1051660dTQ.LJ(View.class, viewE1);
        C1051230dSj c1051230dSj = (C1051230dSj) interfaceC1541990qEH.getHybridContext().LJFF(C1051230dSj.class);
        if (c1051230dSj != null && (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = c1051230dSj.LIZ.get()) != null) {
            c1051660dTQ.LJ(SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.class, sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB);
        }
        if (viewE1 instanceof WebView) {
            c1051660dTQ.LJ(IESJsBridge.class, new IESJsBridge((WebView) viewE1));
        }
        c1051660dTQ.LIZJ(Bundle.class, bundle);
        AbstractC1047270dML abstractC1047270dML = new AbstractC1047270dML() { // from class: X.0dMO
            @Override // X.AbstractC1047270dML, X.InterfaceC1028200cra
            public final Uri LIZJ() {
                Uri uriLIZ;
                InterfaceC1531560pxS interfaceC1531560pxS = interfaceC1541990qEH.getHybridContext().hybridParams;
                if (interfaceC1531560pxS != null && (uriLIZ = interfaceC1531560pxS.LIZ()) != null) {
                    return uriLIZ;
                }
                C1537480q70 hybridContext = interfaceC1541990qEH.getHybridContext();
                String strLJIJI = null;
                if ((hybridContext instanceof SparkContext) && hybridContext != null) {
                    strLJIJI = hybridContext.LJIJI();
                }
                return UriProtector.parse(strLJIJI);
            }

            @Override // X.InterfaceC1028200cra
            public final EnumC1054630dYD LJ() {
                return viewE1 instanceof LynxView ? EnumC1054630dYD.LYNX : EnumC1054630dYD.WEB;
            }

            @Override // X.AbstractC1047270dML, X.InterfaceC1028200cra
            public final C1047290dMN getSessionInfo() {
                String str;
                C1537480q70 c1537480q70 = c1051660dTQ.LIZIZ;
                if (c1537480q70 == null || (str = c1537480q70.containerId) == null) {
                    str = "";
                }
                return new C1047290dMN(str);
            }

            @Override // X.AbstractC1047270dML, X.InterfaceC1028200cra
            public void onEvent(InterfaceC1047320dMQ interfaceC1047320dMQ) {
                c1075770e6J.sendEvent(interfaceC1047320dMQ.getName(), (JSONObject) interfaceC1047320dMQ.getParams());
            }
        };
        c1051660dTQ.LIZJ(InterfaceC1028200cra.class, abstractC1047270dML);
        interfaceC1541990qEH.getHybridContext().LJJ(InterfaceC1028200cra.class, abstractC1047270dML);
        if (interfaceC1020440cf4 != null) {
            List<InterfaceC1051730dTX> listLIZ = interfaceC1020440cf4.LIZ(c1051660dTQ);
            if (listLIZ != null) {
                for (final InterfaceC1051730dTX interfaceC1051730dTX : listLIZ) {
                    if (!C1544000qHW.LJIIZILJ) {
                        C650250Pex c650250Pex = new C650250Pex();
                        c650250Pex.LIZ = interfaceC1051730dTX.getName();
                        C1051410dT1 c1051410dT1 = LIZ;
                        EnumC1051570dTH access = interfaceC1051730dTX.getAccess();
                        c1051410dT1.getClass();
                        int i = C1051430dT3.LIZ[access.ordinal()];
                        if (i != 1) {
                            if (i == 2 || i != 3) {
                                enumC1062400dkk = EnumC1062400dkk.PUBLIC;
                            } else {
                                enumC1062400dkk = EnumC1062400dkk.PROTECT;
                            }
                        } else {
                            enumC1062400dkk = EnumC1062400dkk.PRIVATE;
                        }
                        c650250Pex.LIZIZ = enumC1062400dkk;
                        interfaceC1051730dTX.getNeedCallback();
                        c650250Pex.LIZLLL = new C1543340qGS() { // from class: X.0dTb
                            @Override // X.C1543340qGS
                            public final void LIZLLL() {
                                interfaceC1051730dTX.release();
                            }

                            @Override // X.C1543340qGS
                            public final void LIZIZ(Object obj, final C1543350qGT c1543350qGT) {
                                JSONObject jSONObject;
                                if (!(obj instanceof String)) {
                                    return;
                                }
                                try {
                                    jSONObject = new JSONObject((String) obj);
                                } catch (Exception e) {
                                    TryCatchGuardChecker.doCheck(e);
                                    C1AF0.LJ(e);
                                    if (Intrinsics.LJFF(a0.LJLIIIL((String) obj).toString(), "")) {
                                        jSONObject = new JSONObject();
                                    } else {
                                        c1543350qGT.LIZ(-1, null, "params illegal, params = " + ((String) obj));
                                        return;
                                    }
                                }
                                interfaceC1051730dTX.handle(jSONObject, new InterfaceC1058710den() { // from class: X.0dTd
                                    @Override // X.InterfaceC1058710den
                                    public final void LIZ(JSONObject jSONObject2) {
                                        c1543350qGT.LIZ(1, jSONObject2, "success");
                                    }

                                    @Override // X.InterfaceC1058710den
                                    public final void onError(int i2, String str) {
                                        c1543350qGT.LIZ(i2, null, str);
                                    }

                                    @Override // X.InterfaceC1058710den
                                    public final void LIZIZ(int i2, String str, JSONObject jSONObject2) {
                                        c1543350qGT.LIZ(i2, jSONObject2, str);
                                    }
                                });
                            }
                        };
                        c1075770e6J.LJIILJJIL(c650250Pex);
                    }
                }
            }
            List<Class<? extends InterfaceC1063710dmr>> listLIZIZ = interfaceC1020440cf4.LIZIZ();
            if (listLIZIZ != null) {
                Iterator<Class<? extends InterfaceC1063710dmr>> it2 = listLIZIZ.iterator();
                while (it2.hasNext()) {
                    C1543490qGh.LIZIZ(it2.next(), null, 6);
                }
            }
        }
    }

    public final C1051220dSi LIZJ(Context context, String str, Bundle bundle, String str2, AbstractC1542100qES abstractC1542100qES, InterfaceC1020440cf4 interfaceC1020440cf4, String str3, C1051340dSu c1051340dSu) {
        getClass();
        AdSparkHybridContext adSparkHybridContextLIZ = LIZ(context, str, str2, bundle, interfaceC1020440cf4, str3, null, null, null, false, c1051340dSu);
        adSparkHybridContextLIZ.LJJLJ(abstractC1542100qES);
        C1541950qED.LIZJ.getClass();
        return new C1051220dSi(adSparkHybridContextLIZ, new C1541950qED(context, adSparkHybridContextLIZ).LIZ(false));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.commercialize.hybrid.api.web.context.AdSparkHybridContext LIZ(final android.content.Context r3, java.lang.String r4, final java.lang.String r5, final android.os.Bundle r6, final X.InterfaceC1020440cf4 r7, java.lang.String r8, X.InterfaceC2217701Bqy r9, X.InterfaceC1892990zMP r10, X.InterfaceC1056670dbV r11, boolean r12, X.C1051340dSu r13) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1051410dT1.LIZ(android.content.Context, java.lang.String, java.lang.String, android.os.Bundle, X.0cf4, java.lang.String, X.1Bqy, X.0zMP, X.0dbV, boolean, X.0dSu):com.ss.android.ugc.aweme.commercialize.hybrid.api.web.context.AdSparkHybridContext");
    }

    public static AdSparkHybridContext LIZLLL(C1051410dT1 c1051410dT1, Context context, String str, String str2, Bundle bundle, InterfaceC1020440cf4 interfaceC1020440cf4, String str3, InterfaceC2217701Bqy interfaceC2217701Bqy, InterfaceC1892990zMP interfaceC1892990zMP, InterfaceC1056670dbV interfaceC1056670dbV, InterfaceC1051480dT8 interfaceC1051480dT8, boolean z, int i) {
        Object obj;
        InterfaceC1057870ddR interfaceC1057870ddRLIZJ;
        boolean z2 = z;
        InterfaceC1051480dT8 interfaceC1051480dT82 = interfaceC1051480dT8;
        InterfaceC1056670dbV interfaceC1056670dbV2 = interfaceC1056670dbV;
        if ((i & 256) != 0) {
            interfaceC1056670dbV2 = null;
        }
        if ((i & 512) != 0) {
            interfaceC1051480dT82 = null;
        }
        if ((i & 1024) != 0) {
            z2 = false;
        }
        c1051410dT1.getClass();
        c1051410dT1.getClass();
        AdSparkHybridContext adSparkHybridContextLIZ = LIZ(context, str, str2, bundle, interfaceC1020440cf4, str3, interfaceC2217701Bqy, interfaceC1892990zMP, interfaceC1056670dbV2, z2, null);
        if (interfaceC1020440cf4 != null && (interfaceC1057870ddRLIZJ = interfaceC1020440cf4.LIZJ(adSparkHybridContextLIZ, context, str, bundle)) != null) {
            adSparkHybridContextLIZ.LJJ(InterfaceC1057870ddR.class, interfaceC1057870ddRLIZJ);
        }
        if (bundle != null) {
            for (String str4 : bundle.keySet()) {
                if (!Intrinsics.LJFF("url", str4)) {
                    try {
                        obj = bundle.get(str4);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        obj = null;
                    } catch (OutOfMemoryError e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        obj = null;
                    }
                    if (obj instanceof Boolean) {
                        adSparkHybridContextLIZ.LJJL(str4, ((Boolean) obj).booleanValue());
                    } else if (obj instanceof Double) {
                        adSparkHybridContextLIZ.LJJJLL(((Number) obj).doubleValue(), str4);
                    } else if (obj instanceof Integer) {
                        adSparkHybridContextLIZ.LJJJLZIJ(((Number) obj).intValue(), str4);
                    } else if (obj instanceof String) {
                        adSparkHybridContextLIZ.LJJJZ(str4, (String) obj);
                    }
                }
            }
        }
        if (interfaceC1051480dT82 != null) {
            adSparkHybridContextLIZ.LJJLIIIJJIZ(new C1077430e8z(interfaceC1051480dT82, 0));
        }
        C1541950qED.LIZJ.getClass();
        new C1541950qED(context, adSparkHybridContextLIZ).LIZIZ();
        return adSparkHybridContextLIZ;
    }
}
