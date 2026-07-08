package X;

import android.app.Activity;
import android.content.Context;
import android.webkit.WebView;
import com.bytedance.hybrid.spark.SparkContext;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.log.IAdWebEventLogger;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS130S1100000_16;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0d74, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1037800d74 extends C09AY implements Function0<C1029770cu7> {
    public final /* synthetic */ C1037780d72 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1037800d74(C1037780d72 c1037780d72) {
        super(0);
        this.LL = c1037780d72;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0cu7] */
    @Override // kotlin.jvm.functions.Function0
    public final C1029770cu7 invoke() {
        final C1037870d7B c1037870d7B = this.LL.LLJIJIL;
        return new InterfaceC996520c2U(c1037870d7B) { // from class: X.0cu7
            public final C01GW LL = C452501pT.LIZIZ(new C07L6());

            @Override // X.InterfaceC1037760d70
            public final void Fd1(SparkContext sparkContext) {
            }

            @Override // X.InterfaceC1037760d70
            public final void Ou(SparkContext sparkContext, Context context) {
            }

            @Override // X.InterfaceC1037760d70
            public final void Ox0(JSONObject jSONObject, SparkContext sparkContext) {
            }

            @Override // X.InterfaceC1037760d70
            public final void Yi0(int i, List<? extends Aweme> list) {
            }

            @Override // X.InterfaceC1037760d70
            public final void cT(C1035880d3y c1035880d3y, WebView webView, SparkContext sparkContext) {
            }

            @Override // X.InterfaceC1037760d70
            public final void gz1(C0SCL c0scl, SparkContext sparkContext) {
            }

            @Override // X.InterfaceC1037760d70
            public final void hv(SparkContext sparkContext, int i, String str) {
            }

            @Override // X.InterfaceC1037910d7F
            public final void initialize() {
            }

            @Override // X.InterfaceC1037760d70
            public final void mf1(C1035880d3y c1035880d3y, WebView webView, SparkContext sparkContext) {
            }

            @Override // X.InterfaceC1037760d70
            public final void r3(Aweme aweme) {
            }

            @Override // X.InterfaceC1037760d70
            public final void tU(C1035880d3y c1035880d3y, SparkContext sparkContext) {
            }

            @Override // X.InterfaceC1037760d70
            public final void vE0(String str, InterfaceC1041500dD2 interfaceC1041500dD2, boolean z, AwemeRawAd awemeRawAd, String str2, String str3, String str4) {
            }

            @Override // X.InterfaceC1037760d70
            public final void wK1(SparkContext sparkContext, String str) {
            }

            @Override // X.InterfaceC1037760d70
            public final void z82(String str, String str2, InterfaceC1041500dD2 interfaceC1041500dD2, SparkContext sparkContext) {
            }

            public static String LIZ(String str) {
                int iHashCode;
                Activity activityLJFF = C2214201BlK.LJFF();
                if (activityLJFF != null) {
                    iHashCode = activityLJFF.hashCode();
                } else {
                    iHashCode = 0;
                }
                String strValueOf = String.valueOf(iHashCode);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(strValueOf);
                sbLIZ.append('-');
                sbLIZ.append(str);
                return C08HM.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
            }

            @Override // X.InterfaceC1037760d70
            public final void TQ1(Aweme aweme) {
                Map map;
                String awemeRawAdIdStr = AwemeExtKt.getAwemeRawAdIdStr(aweme);
                if (awemeRawAdIdStr != null && awemeRawAdIdStr.length() != 0 && (map = (Map) ((Map) this.LL.getValue()).remove(awemeRawAdIdStr)) != null) {
                    for (C1029790cu9 c1029790cu9 : map.values()) {
                        InterfaceC1029800cuA interfaceC1029800cuA = c1029790cu9.LIZ;
                        if (interfaceC1029800cuA != null) {
                            interfaceC1029800cuA.LIZ();
                        }
                        c1029790cu9.LIZ = null;
                        c1029790cu9.LJFF = null;
                    }
                }
            }

            public final C1029790cu9 LIZIZ(String str, String str2) {
                String strLIZ = LIZ(str2);
                Map map = (Map) ((Map) this.LL.getValue()).get(str);
                if (map != null) {
                    return (C1029790cu9) map.get(strLIZ);
                }
                return null;
            }

            @Override // X.InterfaceC996520c2U
            public final void Um2(String str, String str2) {
                String logExtra;
                C1029790cu9 c1029790cu9LIZIZ = LIZIZ(str, str2);
                if (c1029790cu9LIZIZ == null) {
                    return;
                }
                c1029790cu9LIZIZ.LJ = true;
                AwemeRawAd awemeRawAd = c1029790cu9LIZIZ.LJFF;
                if (awemeRawAd != null) {
                    logExtra = awemeRawAd.getLogExtra();
                } else {
                    logExtra = null;
                }
                InterfaceC1009950cO9 interfaceC1009950cO9 = (InterfaceC1009950cO9) ServiceManager.get().getService(IAdWebEventLogger.class);
                C1043510dGH.LIZ.getClass();
                interfaceC1009950cO9.logAd(C1043510dGH.LJIIL, str, logExtra, null, new AwS130S1100000_16(c1029790cu9LIZIZ, str2, 24));
                if (c1029790cu9LIZIZ.LJII) {
                    LIZJ(str, str2, logExtra, c1029790cu9LIZIZ.LIZIZ.ordinal(), 0L, c1029790cu9LIZIZ.LIZLLL, c1029790cu9LIZIZ.LJI, c1029790cu9LIZIZ.LIZJ);
                }
            }

            @Override // X.InterfaceC996520c2U
            public final boolean MY0(int i, String str, String str2) {
                InterfaceC1029800cuA interfaceC1029800cuA;
                C1029790cu9 c1029790cu9LIZIZ = LIZIZ(str, str2);
                if (c1029790cu9LIZIZ == null || i != 1 || (interfaceC1029800cuA = c1029790cu9LIZIZ.LIZ) == null) {
                    return false;
                }
                interfaceC1029800cuA.show();
                return true;
            }

            @Override // X.InterfaceC996520c2U
            public final void yq1(AwemeRawAd awemeRawAd, String str, C1028290crj c1028290crj) {
                String creativeIdStr;
                if (awemeRawAd == null || (creativeIdStr = awemeRawAd.getCreativeIdStr()) == null) {
                    return;
                }
                C1029790cu9 c1029790cu9LIZIZ = LIZIZ(creativeIdStr, str);
                if (c1029790cu9LIZIZ == null) {
                    String creativeIdStr2 = awemeRawAd.getCreativeIdStr();
                    if (creativeIdStr2 == null) {
                        creativeIdStr2 = "";
                    }
                    Map map = (Map) this.LL.getValue();
                    Object linkedHashMap = map.get(creativeIdStr2);
                    if (linkedHashMap == null) {
                        linkedHashMap = new LinkedHashMap();
                        map.put(creativeIdStr2, linkedHashMap);
                    }
                    Map map2 = (Map) linkedHashMap;
                    String strLIZ = LIZ(str);
                    Object obj = map2.get(strLIZ);
                    Object obj2 = obj;
                    if (obj == null) {
                        C1029790cu9 c1029790cu9 = new C1029790cu9();
                        c1029790cu9.LJFF = awemeRawAd;
                        map2.put(strLIZ, c1029790cu9);
                        obj2 = c1029790cu9;
                    }
                    c1029790cu9LIZIZ = (C1029790cu9) obj2;
                }
                if (c1029790cu9LIZIZ.LIZ == null) {
                    c1029790cu9LIZIZ.LIZ = c1028290crj;
                    c1028290crj.LIZIZ();
                }
            }

            @Override // X.InterfaceC996520c2U
            public final void ck0(int i, String str, String str2, String str3, String str4, boolean z) {
                String logExtra;
                EnumC995370c0d enumC995370c0d;
                C1029790cu9 c1029790cu9LIZIZ = LIZIZ(str, str2);
                if (c1029790cu9LIZIZ == null || c1029790cu9LIZIZ.LJII) {
                    return;
                }
                boolean z2 = c1029790cu9LIZIZ.LJ;
                if (!z2) {
                    if (z) {
                        enumC995370c0d = EnumC995370c0d.RENDER_SUCCESS;
                    } else {
                        enumC995370c0d = EnumC995370c0d.FAIL;
                    }
                    c1029790cu9LIZIZ.LIZIZ = enumC995370c0d;
                }
                c1029790cu9LIZIZ.LJII = true;
                c1029790cu9LIZIZ.LIZJ = i;
                c1029790cu9LIZIZ.LIZLLL = str3;
                c1029790cu9LIZIZ.LJI = str4;
                if (z2) {
                    long jCurrentTimeMillis = System.currentTimeMillis() - 0;
                    AwemeRawAd awemeRawAd = c1029790cu9LIZIZ.LJFF;
                    if (awemeRawAd == null || (logExtra = awemeRawAd.getLogExtra()) == null) {
                        logExtra = "";
                    }
                    LIZJ(str, str2, logExtra, c1029790cu9LIZIZ.LIZIZ.ordinal(), jCurrentTimeMillis, str3, str4, i);
                }
            }

            public static void LIZJ(String str, String str2, String str3, int i, long j, String str4, String str5, int i2) {
                InterfaceC1009950cO9 interfaceC1009950cO9 = (InterfaceC1009950cO9) ServiceManager.get().getService(IAdWebEventLogger.class);
                C1043510dGH.LIZ.getClass();
                interfaceC1009950cO9.logAd(C1043510dGH.LJIILIIL, str, str3, null, new C1029780cu8(i, str2, j, i2, str4, str5));
            }
        };
    }
}
