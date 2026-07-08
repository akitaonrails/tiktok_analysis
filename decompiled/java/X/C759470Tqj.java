package X;

import android.content.Context;
import android.net.Uri;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.security.ThirdPartyBizCert;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastDoubleProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.pipo.IPipoContainerService;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Tqj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C759470Tqj {
    public static final C759470Tqj LIZ = new C759470Tqj();

    public static SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LIZ(Context context, C759410Tqd c759410Tqd, final C759450Tqh c759450Tqh) {
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        try {
            Uri uriLIZLLL = C759510Tqn.LIZLLL(c759410Tqd.LIZIZ, "stellar_create_spark_view");
            if (uriLIZLLL != null && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uriLIZLLL, "initial_height")) != null) {
                c759410Tqd.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(CastDoubleProtector.parseDouble(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter))));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
        }
        final SparkContext sparkContext = new SparkContext();
        sparkContext.LJJLIIJ(c759410Tqd.LIZIZ);
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("pipo_stella_with_third", true)) {
            sparkContext.bizCert = new ThirdPartyBizCert(402681856);
        }
        String str = sparkContext.containerId;
        c759410Tqd.LIZLLL = str;
        if (str != null) {
            c759450Tqh.LIZLLL(new InterfaceC759720Tr8() { // from class: X.0Tr9
                public long LIZ = -1;
                public String LIZIZ = "";

                @Override // X.InterfaceC759720Tr8
                public final void LIZ(WebView webView, String str2) throws JSONException {
                    this.LIZ = System.currentTimeMillis();
                    if (str2 != null) {
                        C759450Tqh c759450Tqh2 = c759450Tqh;
                        this.LIZIZ = str2;
                        C759740TrA.LIZJ(str2, "init", 0L, null, null, null, null, c759450Tqh2.LJII, 252);
                    }
                }

                @Override // X.InterfaceC759720Tr8
                public final void LIZIZ(long j, boolean z) throws JSONException {
                    if (z) {
                        String str2 = this.LIZIZ;
                        Function1<? super JSONObject, Unit> function1 = c759450Tqh.LJII;
                        JSONObject jSONObject = new JSONObject();
                        C759740TrA.LIZ(jSONObject, function1);
                        C759740TrA.LIZIZ(-1, str2, jSONObject);
                        jSONObject.put("error_code", "-1");
                        jSONObject.put("error_msg", "blank");
                        jSONObject.put("error_type", "blank");
                        jSONObject.put("retried_times", -1);
                        C1725270uzt.LJ(C1725270uzt.LIZ, "rd_pipo_stellar_web_error", jSONObject, null, 12);
                    }
                }

                @Override // X.InterfaceC759720Tr8
                public final void onPageFinished(WebView webView, String str2) {
                    try {
                        boolean zLJFF = Intrinsics.LJFF(sparkContext.templateResData.optString("res_from", ""), "gecko");
                        if (str2 != null) {
                            C759450Tqh c759450Tqh2 = c759450Tqh;
                            C759740TrA.LIZJ(str2, "finish", System.currentTimeMillis() - this.LIZ, Integer.valueOf(zLJFF ? 1 : 0), 1, null, null, c759450Tqh2.LJII, 224);
                        }
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        C1AF0.LJ(th2);
                    }
                }

                @Override // X.InterfaceC759720Tr8
                public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                    String string;
                    if (webResourceRequest != null) {
                        try {
                            Uri url = webResourceRequest.getUrl();
                            if (url != null) {
                                C759450Tqh c759450Tqh2 = c759450Tqh;
                                String string2 = url.toString();
                                long jCurrentTimeMillis = System.currentTimeMillis() - this.LIZ;
                                String string3 = null;
                                if (webResourceError != null) {
                                    string = Integer.valueOf(webResourceError.getErrorCode()).toString();
                                    CharSequence description = webResourceError.getDescription();
                                    if (description != null) {
                                        string3 = description.toString();
                                    }
                                } else {
                                    string = null;
                                }
                                C759740TrA.LIZJ(string2, "finish", jCurrentTimeMillis, null, 0, string, string3, c759450Tqh2.LJII, 136);
                            }
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                            C1AF0.LJ(th2);
                        }
                    }
                }

                @Override // X.InterfaceC759720Tr8
                public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                    Integer numValueOf;
                    String reasonPhrase;
                    if (webResourceRequest != null) {
                        try {
                            Uri url = webResourceRequest.getUrl();
                            if (url != null) {
                                C759450Tqh c759450Tqh2 = c759450Tqh;
                                String string = url.toString();
                                long jCurrentTimeMillis = System.currentTimeMillis() - this.LIZ;
                                if (webResourceResponse != null) {
                                    numValueOf = Integer.valueOf(webResourceResponse.getStatusCode());
                                } else {
                                    numValueOf = null;
                                }
                                String strValueOf = String.valueOf(numValueOf);
                                if (webResourceResponse == null || (reasonPhrase = webResourceResponse.getReasonPhrase()) == null) {
                                    reasonPhrase = null;
                                }
                                C759740TrA.LIZJ(string, "finish", jCurrentTimeMillis, null, 0, strValueOf, reasonPhrase, c759450Tqh2.LJII, 136);
                            }
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                            C1AF0.LJ(th2);
                        }
                    }
                }
            });
            ((IPipoContainerService) ServiceManager.get().getService(IPipoContainerService.class)).LIZ(str, new InterfaceC759720Tr8() { // from class: X.0Tr7
                @Override // X.InterfaceC759720Tr8
                public final void LIZ(WebView webView, String str2) {
                    Iterator<InterfaceC759720Tr8> it2 = c759450Tqh.LJIIIIZZ.iterator();
                    while (it2.hasNext()) {
                        it2.next().LIZ(webView, str2);
                    }
                }

                @Override // X.InterfaceC759720Tr8
                public final void LIZIZ(long j, boolean z) {
                    Iterator<InterfaceC759720Tr8> it2 = c759450Tqh.LJIIIIZZ.iterator();
                    while (it2.hasNext()) {
                        it2.next().LIZIZ(j, z);
                    }
                }

                @Override // X.InterfaceC759720Tr8
                public final void onPageFinished(WebView webView, String str2) {
                    Iterator<InterfaceC759720Tr8> it2 = c759450Tqh.LJIIIIZZ.iterator();
                    while (it2.hasNext()) {
                        it2.next().onPageFinished(webView, str2);
                    }
                }

                @Override // X.InterfaceC759720Tr8
                public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                    Iterator<InterfaceC759720Tr8> it2 = c759450Tqh.LJIIIIZZ.iterator();
                    while (it2.hasNext()) {
                        it2.next().onReceivedError(webView, webResourceRequest, webResourceError);
                    }
                }

                @Override // X.InterfaceC759720Tr8
                public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                    Iterator<InterfaceC759720Tr8> it2 = c759450Tqh.LJIIIIZZ.iterator();
                    while (it2.hasNext()) {
                        it2.next().onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                    }
                }
            });
        }
        C1541950qED.LIZJ.getClass();
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ = new C1541950qED(context, sparkContext).LIZ(false);
        C786410Ut5.C6(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ, new RecyclerView.LayoutParams(-1, c759410Tqd.LIZJ));
        return sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ;
    }
}
