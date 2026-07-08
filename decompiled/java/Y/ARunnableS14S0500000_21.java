package Y;

import X.AbstractC1057520dcs;
import X.C1350840lFy;
import X.C1378750lyz;
import X.C1385440m9m;
import X.C1385450m9n;
import X.C1C7U;
import X.InterfaceC1057540dcu;
import X.InterfaceC1058330deB;
import X.InterfaceC1058350deD;
import X.InterfaceC1378550lyf;
import X.InterfaceC1484830ok5;
import X.InterfaceC1877250yx1;
import X.InterfaceC634840OvC;
import Y.AkS326S0200000_19;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.comment.model.CommentLivePhotoInfoModel;
import com.ss.android.ugc.aweme.comment.photocomment.CommentInnerPhotoAssem;
import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import com.ss.android.ugc.aweme.im.message.template.service.SendMessageEventParcel;
import com.ss.android.ugc.aweme.im.message.template.service.SendMessageTemplateTask;
import com.ss.android.ugc.aweme.im.service.analytics.ILogger;
import com.ss.android.ugc.aweme.internalshare.api.IInternalShareApi;
import com.ss.android.ugc.aweme.minis.model.ContentPbResponse;
import com.ss.android.ugc.aweme.minis.model.NetworkResponse;
import com.ss.android.ugc.aweme.minis.page.main.fragment.ShareSheetPanelFragment;
import com.ss.android.ugc.aweme.minis.page.main.morepanel.model.MinisSharePackageModel;
import com.ss.android.ugc.aweme.minis.page.main.morepanel.repo.MinisSharePackage;
import com.ss.android.ugc.aweme.minis.request.IMetaServiceApi;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.Pair;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes22.dex */
public class ARunnableS14S0500000_21 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

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
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        C1385450m9n c1385450m9n = (C1385450m9n) this.l0;
        final JSONObject jSONObject = (JSONObject) this.l1;
        c1385450m9n.getClass();
        InterfaceC1058350deD interfaceC1058350deD = new InterfaceC1058350deD() { // from class: X.0dcr
            @Override // com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel
            public final Map<String, Object> convert() {
                return null;
            }

            @Override // X.InterfaceC1058350deD
            public final String getClientKey() {
                return jSONObject.optString("clientKey");
            }

            @Override // X.InterfaceC1058350deD
            public final String getImageUrl() {
                return jSONObject.optString("imageUrl");
            }

            @Override // X.InterfaceC1058350deD
            public final String getOpenid() {
                return jSONObject.optString("openid");
            }

            @Override // X.InterfaceC1058350deD
            public final String getPath() {
                return jSONObject.optString("path");
            }

            @Override // X.InterfaceC1058350deD
            public final Map<String, Object> getQueryParams() {
                if (jSONObject.optJSONObject("queryParams") == null) {
                    return null;
                }
                C1543800qHC c1543800qHC = C1543800qHC.LIZ;
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("queryParams");
                c1543800qHC.getClass();
                Map mapLIZIZ = C1543800qHC.LIZIZ(jSONObjectOptJSONObject);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : mapLIZIZ.entrySet()) {
                    if (entry.getValue() != null) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                return linkedHashMap;
            }

            @Override // X.InterfaceC1058350deD
            public final String getSubtitle() {
                return jSONObject.optString("subtitle");
            }

            @Override // X.InterfaceC1058350deD
            public final Number getTemplateType() {
                return Integer.valueOf(jSONObject.optInt("templateType"));
            }

            @Override // X.InterfaceC1058350deD
            public final String getTitle() {
                return jSONObject.optString("title");
            }

            @Override // com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel
            public final JSONObject toJSON() {
                return new JSONObject();
            }

            @Override // com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel
            public final List<String> provideParamList() {
                return C13BV.INSTANCE;
            }
        };
        C1378750lyz c1378750lyz = new C1378750lyz();
        final Activity activity = (Activity) this.l2;
        final InterfaceC1877250yx1 interfaceC1877250yx1 = (InterfaceC1877250yx1) this.l3;
        c1378750lyz.setBridgeContext(new InterfaceC634840OvC() { // from class: X.0m9s
            @Override // X.InterfaceC634840OvC
            public final C1543410qGZ LIZJ() {
                return null;
            }

            @Override // X.InterfaceC634840OvC
            public final String getContainerID() {
                return "";
            }

            @Override // X.InterfaceC634840OvC
            public final View getView() {
                return null;
            }

            @Override // X.InterfaceC634840OvC
            public final void sendEvent(String str, JSONObject jSONObject2) {
            }

            @Override // X.InterfaceC634840OvC
            public final Activity LIZLLL() {
                return activity;
            }

            @Override // X.InterfaceC634840OvC
            public final Context getContext() {
                return activity;
            }

            @Override // X.InterfaceC634840OvC
            public final <T> T LIZIZ(Class<T> cls) {
                if (InterfaceC1877240yx0.class.isAssignableFrom(cls)) {
                    final InterfaceC1877250yx1 interfaceC1877250yx12 = interfaceC1877250yx1;
                    return cls.cast(new InterfaceC1877240yx0() { // from class: X.0m9u
                        @Override // X.InterfaceC1877240yx0
                        public final InterfaceC1877250yx1 LIZ() {
                            return interfaceC1877250yx12;
                        }
                    });
                }
                return null;
            }
        });
        final C1385450m9n c1385450m9n2 = (C1385450m9n) this.l0;
        final Number number = (Number) this.l4;
        c1378750lyz.LIZJ(interfaceC1058350deD, new CompletionBlock<InterfaceC1058330deB>() { // from class: X.0m9k
            @Override // com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock
            public final /* bridge */ /* synthetic */ void onRawSuccess(XBaseResultModel xBaseResultModel) {
            }

            @Override // com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock
            public final void onSuccess(XBaseResultModel xBaseResultModel, String str) throws JSONException {
                C1385450m9n c1385450m9n3 = c1385450m9n2;
                Number number2 = number;
                c1385450m9n3.getClass();
                c1385450m9n3.LJFF(number2, new JSONObject());
            }

            @Override // com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock
            public final void onFailure(int i, String str, XBaseResultModel xBaseResultModel) throws JSONException {
                C1385450m9n c1385450m9n3 = c1385450m9n2;
                Number number2 = number;
                c1385450m9n3.getClass();
                c1385450m9n3.LJ(number2, new JSONObject());
            }
        });
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.0lyy, X.0qPp] */
    public final void LIZ$1() {
        C1385440m9m c1385440m9m = (C1385440m9m) this.l0;
        final JSONObject jSONObject = (JSONObject) this.l1;
        c1385440m9m.getClass();
        InterfaceC1057540dcu interfaceC1057540dcu = new InterfaceC1057540dcu() { // from class: X.0dcq
            @Override // com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel
            public final Map<String, Object> convert() {
                return null;
            }

            @Override // X.InterfaceC1057540dcu
            public final String getClientKey() {
                return jSONObject.optString("clientKey");
            }

            @Override // X.InterfaceC1057540dcu
            public final String getPath() {
                return jSONObject.optString("path");
            }

            @Override // X.InterfaceC1057540dcu
            public final String getPreviewImageUrl() {
                return jSONObject.optString("previewImageUrl");
            }

            @Override // X.InterfaceC1057540dcu
            public final Map<String, Object> getQueryParams() {
                if (jSONObject.optJSONObject("queryParams") == null) {
                    return null;
                }
                C1543800qHC c1543800qHC = C1543800qHC.LIZ;
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("queryParams");
                c1543800qHC.getClass();
                Map mapLIZIZ = C1543800qHC.LIZIZ(jSONObjectOptJSONObject);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : mapLIZIZ.entrySet()) {
                    if (entry.getValue() != null) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                return linkedHashMap;
            }

            @Override // X.InterfaceC1057540dcu
            public final String getSubtitle() {
                return jSONObject.optString("subtitle");
            }

            @Override // X.InterfaceC1057540dcu
            public final Number getTemplateType() {
                return Integer.valueOf(jSONObject.optInt("templateType"));
            }

            @Override // X.InterfaceC1057540dcu
            public final String getTitle() {
                return jSONObject.optString("title");
            }

            @Override // com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel
            public final JSONObject toJSON() {
                return new JSONObject();
            }

            @Override // com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel
            public final List<String> provideParamList() {
                return C13BV.INSTANCE;
            }
        };
        ?? r3 = new AbstractC1057520dcs() { // from class: X.0lyy
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v9, types: [T, com.ss.android.ugc.aweme.minis.model.NetworkResponse] */
            public final void LIZJ(InterfaceC1057540dcu interfaceC1057540dcu2, final CompletionBlock completionBlock) {
                final InterfaceC1877250yx1 interfaceC1877250yx1LIZ;
                Integer numValueOf;
                String strLJJLIIIJ;
                Object kitView;
                T url;
                WebView webView;
                int iIntValue;
                String str;
                int i;
                T tLJ;
                Set<Map.Entry<String, Object>> setEntrySet;
                InterfaceC1877240yx0 interfaceC1877240yx0;
                InterfaceC1395520mQ2 interfaceC1395520mQ2LJFF = C2195221Avo.LJFF();
                InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
                String containerID = null;
                if (interfaceC634840OvC != null && (interfaceC1877240yx0 = (InterfaceC1877240yx0) interfaceC634840OvC.LIZIZ(InterfaceC1877240yx0.class)) != null) {
                    interfaceC1877250yx1LIZ = interfaceC1877240yx0.LIZ();
                } else {
                    interfaceC1877250yx1LIZ = null;
                }
                if (interfaceC1395520mQ2LJFF != null && interfaceC1057540dcu2 != null) {
                    String title = interfaceC1057540dcu2.getTitle();
                    String subtitle = interfaceC1057540dcu2.getSubtitle();
                    String previewImageUrl = interfaceC1057540dcu2.getPreviewImageUrl();
                    String clientKey = interfaceC1057540dcu2.getClientKey();
                    Map<String, Object> queryParams = interfaceC1057540dcu2.getQueryParams();
                    Number templateType = interfaceC1057540dcu2.getTemplateType();
                    if (templateType != null) {
                        numValueOf = Integer.valueOf(templateType.intValue());
                    } else {
                        numValueOf = null;
                    }
                    final C1378610lyl c1378610lyl = new C1378610lyl(numValueOf, title, subtitle, previewImageUrl, clientKey, queryParams);
                    final Activity activityLIZLLL = C2195221Avo.LIZLLL();
                    String str2 = c1378610lyl.LIZLLL;
                    if (str2 == null || str2.length() == 0) {
                        c1378610lyl.LIZLLL = C2195221Avo.LIZ();
                    }
                    if (queryParams != null && (setEntrySet = queryParams.entrySet()) != null) {
                        strLJJLIIIJ = C13LP.LJJLIIIJ(setEntrySet, "&", "", "", 0, null, null, 56);
                    } else {
                        strLJJLIIIJ = null;
                    }
                    final C259800zU c259800zU = new C259800zU();
                    c259800zU.element = "";
                    if (C2197221Az2.LIZ(c1378610lyl.LIZLLL)) {
                        if (interfaceC1877250yx1LIZ != null) {
                            tLJ = interfaceC1877250yx1LIZ.LJ();
                        } else {
                            tLJ = 0;
                        }
                        c259800zU.element = tLJ;
                    } else {
                        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLJII = C2195221Avo.LJII();
                        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLJII != null) {
                            kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLJII.getKitView();
                        } else {
                            kitView = null;
                        }
                        if ((kitView instanceof WebKitView) && (webView = (WebView) kitView) != null) {
                            url = webView.getUrl();
                        } else {
                            url = 0;
                        }
                        c259800zU.element = url;
                    }
                    String str3 = c1378610lyl.LIZLLL;
                    String str4 = (String) c259800zU.element;
                    if (numValueOf != null) {
                        iIntValue = numValueOf.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    String path = interfaceC1057540dcu2.getPath();
                    C259800zU c259800zU2 = new C259800zU();
                    c259800zU2.element = new NetworkResponse(null, -1, false, null, false, null, null);
                    if (previewImageUrl != null) {
                        containerID = str4;
                    }
                    if (C2197221Az2.LIZ(str3)) {
                        str = "mini_game";
                    } else {
                        str = "short_drama";
                    }
                    LinkedHashMap linkedHashMapLJII = C2097608Jq.LJII(new Pair("minisID", str3), new Pair("collectionID", containerID), new Pair("minisType", str));
                    IMetaServiceApi.LIZ.getClass();
                    IMetaServiceApi iMetaServiceApiLIZ = C1232860iBg.LIZ();
                    C1227904rF.LIZ.getClass();
                    String strLJI = C1227904rF.LJI(linkedHashMapLJII);
                    if (previewImageUrl == null) {
                        i = 0;
                    } else {
                        i = 1;
                    }
                    AbstractC19484711Kz.LJIJJ(iMetaServiceApiLIZ.getContentPbForDMShare(str3, title, subtitle, str4, previewImageUrl, strLJJLIIIJ, strLJI, i, iIntValue, path)).LJIIZILJ(new AkS326S0200000_19(this, c259800zU2, 8)).LJJI(new InterfaceC1487280oo2() { // from class: X.01XL
                        @Override // X.InterfaceC1487280oo2
                        public final Object apply(Object obj) {
                            String string;
                            Throwable th = (Throwable) obj;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("fetchContentPbForDMShare, error occurred, cause:");
                            Throwable cause = th.getCause();
                            if (cause != null) {
                                string = cause.toString();
                            } else {
                                string = null;
                            }
                            sbLIZ.append(string);
                            C2188811AlT.LIZIZ(sbLIZ);
                            return AbstractC19484711Kz.LJIILLIIL(th);
                        }
                    }).LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LIZ(new InterfaceC19474811He<NetworkResponse<ContentPbResponse>>() { // from class: X.0lyW
                        @Override // X.InterfaceC19474811He
                        public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
                        }

                        @Override // X.InterfaceC19474811He
                        public final void onError(Throwable th) {
                            String containerID2;
                            InterfaceC634840OvC interfaceC634840OvC2 = this.LL.IBridgeSdkContext;
                            if (interfaceC634840OvC2 != null) {
                                containerID2 = interfaceC634840OvC2.getContainerID();
                            } else {
                                containerID2 = null;
                            }
                            InterfaceC1378550lyf interfaceC1378550lyf = (InterfaceC1378550lyf) C1909107dp.LIZJ(InterfaceC1378550lyf.class, containerID2);
                            interfaceC1378550lyf.setSuccess(Boolean.FALSE);
                            interfaceC1378550lyf.setErrorCode(Integer.valueOf(C2252408s6.LIZIZ(th)));
                            interfaceC1378550lyf.setErrorMsg(th.getMessage());
                            completionBlock.onFailure(0, "current page container not minis", interfaceC1378550lyf);
                            Activity activity = activityLIZLLL;
                            if (activity != null) {
                                C1389890mGx c1389890mGx = new C1389890mGx(activity);
                                c1389890mGx.LJIIJ(activity.getString(2131824894));
                                c1389890mGx.LJFF(R.raw.icon_info_circle_fill);
                                c1389890mGx.LJIIJJI();
                            }
                        }

                        @Override // X.InterfaceC19474811He
                        public final void onSuccess(NetworkResponse<ContentPbResponse> networkResponse) throws JSONException {
                            Context context;
                            final Activity activityLIZ;
                            String str5;
                            String str6;
                            String ttoclid;
                            BaseTemplate baseTemplateLIZIZ;
                            String str7;
                            SharePackage sharePackage;
                            NetworkResponse<ContentPbResponse> networkResponse2 = networkResponse;
                            InterfaceC634840OvC interfaceC634840OvC2 = this.LL.IBridgeSdkContext;
                            if (interfaceC634840OvC2 != null && (context = interfaceC634840OvC2.getContext()) != null && (activityLIZ = C085T.LIZ(context)) != null) {
                                C1378610lyl c1378610lyl2 = c1378610lyl;
                                C259800zU<String> c259800zU3 = c259800zU;
                                InterfaceC1877250yx1 interfaceC1877250yx1 = interfaceC1877250yx1LIZ;
                                final C1378740lyy c1378740lyy = this.LL;
                                final CompletionBlock<InterfaceC1378550lyf> completionBlock2 = completionBlock;
                                C1378820lz6 c1378820lz6 = C1378820lz6.LIZ;
                                String str8 = c1378610lyl2.LIZLLL;
                                String str9 = c1378610lyl2.LIZ;
                                String str10 = c1378610lyl2.LIZIZ;
                                String str11 = c259800zU3.element;
                                ContentPbResponse contentPbResponse = networkResponse2.data;
                                List list = null;
                                if (contentPbResponse != null) {
                                    str5 = contentPbResponse.scene;
                                    str6 = contentPbResponse.contentPb;
                                } else {
                                    str5 = null;
                                    str6 = null;
                                }
                                String str12 = c1378610lyl2.LIZJ;
                                if (interfaceC1877250yx1 != null) {
                                    ttoclid = interfaceC1877250yx1.getTtoclid();
                                } else {
                                    ttoclid = null;
                                }
                                c1378820lz6.getClass();
                                Map mapLIZJ = C2097908Jt.LIZJ(new Pair("CLIENT_KEY", str8));
                                if (str6 != null && (baseTemplateLIZIZ = C2241931Cox.LIZIZ(2000, str6)) != null) {
                                    SendMessageEventParcel sendMessageEventParcel = new SendMessageEventParcel("game_page", null, null, null, null, C105700ad.LIZIZ(mapLIZJ), 30);
                                    if (str5 == null) {
                                        str5 = "minis_share_card";
                                    }
                                    SendMessageTemplateTask sendMessageTemplateTask = new SendMessageTemplateTask(str5, baseTemplateLIZIZ, sendMessageEventParcel, list, false, 24);
                                    C1378140ly0 c1378140ly0 = MinisSharePackage.Companion;
                                    String str13 = "";
                                    if (str8 == null) {
                                        str7 = "";
                                    } else {
                                        str7 = str8;
                                    }
                                    if (str9 == null) {
                                        str9 = "";
                                    }
                                    if (str10 == null) {
                                        str10 = "";
                                    }
                                    if (str11 == null) {
                                        str11 = "";
                                    }
                                    Bundle bundle = C1378820lz6.LIZIZ;
                                    bundle.putInt("show_tips_until_cancel", 1);
                                    C786410Ut5.LJJJI("panel_source", "share_friend_list_panel", bundle);
                                    C786410Ut5.LJJJI("enter_from", "game_page", bundle);
                                    C786410Ut5.LJJIZ(bundle, "video_cover", C0I98.LJIILIIL(str12));
                                    if (str8 != null) {
                                        str13 = str8;
                                    }
                                    C786410Ut5.LJJJI("minis_id", str13, bundle);
                                    C786410Ut5.LJJJI("minis_type", "mini_game", bundle);
                                    C786410Ut5.LJJJI("minis_enter_from", "game_page", bundle);
                                    C786410Ut5.LJJJI("minis_content_type", "game", bundle);
                                    C786410Ut5.LJJJI("content_type", "minis", bundle);
                                    C786410Ut5.LJJJI("enter_method", "minis_game_share", bundle);
                                    C786410Ut5.LJJJI("minis_ttoclid", ttoclid, bundle);
                                    C786410Ut5.LJJJI("panel_level", "1", bundle);
                                    bundle.putBoolean("force_not_inbox", true);
                                    C1370940lmO c1370940lmOLJIIIIZZ = new C1378590lyj(new MinisSharePackageModel(str7, bundle, str9, str10, str11)).LJIIIIZZ();
                                    c1370940lmOLJIIIIZZ.LIZ = "minis";
                                    c1370940lmOLJIIIIZZ.LJIIIIZZ = sendMessageTemplateTask;
                                    MinisSharePackage minisSharePackage = new MinisSharePackage(c1370940lmOLJIIIIZZ);
                                    c1378140ly0.getClass();
                                    C1371600lnS c1371600lnS = new C1371600lnS();
                                    c1371600lnS.LJJIIJ = minisSharePackage;
                                    C1371590lnR c1371590lnR = new C1371590lnR(c1371600lnS);
                                    c1371590lnR.LJJJJL = Boolean.TRUE;
                                    BaseSharePackage baseSharePackage = c1371590lnR.LJIJJ;
                                    if (baseSharePackage != null && (baseSharePackage instanceof SharePackage) && (sharePackage = (SharePackage) baseSharePackage) != null) {
                                        C786410Ut5.LJJJI("cancel_toast", "false", sharePackage.extras);
                                        JSONObject jSONObject2 = new JSONObject();
                                        jSONObject2.put("biz_container_type", "minis_game_share");
                                        C20684815ws.LJIJ("ttsocial_share_game_more_panel_show", jSONObject2);
                                        IInternalShareApi.LIZ.getClass();
                                        InterfaceC1364710lcL interfaceC1364710lcLLIZIZ = C1370970lmR.LIZ().LIZIZ();
                                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                                        c1378740lyy.getClass();
                                        interfaceC1364710lcLLIZIZ.LJFF(activityLIZ, sharePackage, null, linkedHashSet, false, null, false, null, false, true, null, false, false, new AbstractC1363040lZe() { // from class: X.0lyX
                                            @Override // X.InterfaceC1362600lYw
                                            public final void LJFF(SharePackage sharePackage2) {
                                            }

                                            @Override // X.InterfaceC1362900lZQ
                                            public final void LJIIIZ() {
                                            }

                                            @Override // X.AbstractC1363040lZe, X.InterfaceC1362600lYw
                                            public final void LJIILIIL() {
                                                Context context2 = activityLIZ;
                                                if (context2 != null) {
                                                    String str14 = ShareSheetPanelFragment._pnsPageId;
                                                    C1378440lyU.LIZ(context2);
                                                }
                                            }

                                            @Override // X.InterfaceC1362600lYw
                                            public final void LJIIL(SharePackage sharePackage2) {
                                                String containerID2;
                                                InterfaceC634840OvC interfaceC634840OvC3 = c1378740lyy.IBridgeSdkContext;
                                                if (interfaceC634840OvC3 != null) {
                                                    containerID2 = interfaceC634840OvC3.getContainerID();
                                                } else {
                                                    containerID2 = null;
                                                }
                                                InterfaceC1378550lyf interfaceC1378550lyf = (InterfaceC1378550lyf) C1909107dp.LIZJ(InterfaceC1378550lyf.class, containerID2);
                                                interfaceC1378550lyf.setSuccess(Boolean.TRUE);
                                                completionBlock2.onSuccess(interfaceC1378550lyf, "success");
                                                Context context2 = activityLIZ;
                                                if (context2 != null) {
                                                    String str14 = ShareSheetPanelFragment._pnsPageId;
                                                    C1378440lyU.LIZ(context2);
                                                }
                                            }

                                            /* JADX WARN: Removed duplicated region for block: B:21:0x008e  */
                                            @Override // X.AbstractC1363040lZe
                                            /*
                                                Code decompiled incorrectly, please refer to instructions dump.
                                                To view partially-correct add '--show-bad-code' argument
                                            */
                                            public final void LJIILL(com.ss.android.ugc.aweme.sharer.model.SharePackage r25, boolean r26, java.util.List<? extends com.ss.android.ugc.aweme.im.contacts.api.model.IMContact> r27) {
                                                /*
                                                    Method dump skipped, instruction units count: 212
                                                    To view this dump add '--comments-level debug' option
                                                */
                                                throw new UnsupportedOperationException("Method not decompiled: X.C1378470lyX.LJIILL(com.ss.android.ugc.aweme.sharer.model.SharePackage, boolean, java.util.List):void");
                                            }
                                        });
                                        ILogger iLogger = (ILogger) C2108408Nu.LIZ.LIZIZ(ILogger.class);
                                        if (iLogger != null) {
                                            iLogger.LJ(sharePackage, "minis_share_panel", C0I0B.LJFF.LIZIZ());
                                        }
                                    }
                                }
                            }
                        }
                    });
                } else {
                    InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
                    if (interfaceC634840OvC2 != null) {
                        containerID = interfaceC634840OvC2.getContainerID();
                    }
                    InterfaceC1378550lyf interfaceC1378550lyf = (InterfaceC1378550lyf) C1909107dp.LIZJ(InterfaceC1378550lyf.class, containerID);
                    interfaceC1378550lyf.setSuccess(Boolean.FALSE);
                    completionBlock.onFailure(0, "current page container not minis", interfaceC1378550lyf);
                }
                int i2 = C2187451AjH.LIZ;
                Objects.toString(interfaceC1057540dcu2);
            }

            @Override // X.AbstractC1549150qPp
            public final /* bridge */ /* synthetic */ void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
                LIZJ((InterfaceC1057540dcu) xBaseParamModel, completionBlock);
            }
        };
        final Activity activity = (Activity) this.l2;
        final InterfaceC1877250yx1 interfaceC1877250yx1 = (InterfaceC1877250yx1) this.l3;
        r3.setBridgeContext(new InterfaceC634840OvC() { // from class: X.0m9t
            @Override // X.InterfaceC634840OvC
            public final C1543410qGZ LIZJ() {
                return null;
            }

            @Override // X.InterfaceC634840OvC
            public final String getContainerID() {
                return "";
            }

            @Override // X.InterfaceC634840OvC
            public final View getView() {
                return null;
            }

            @Override // X.InterfaceC634840OvC
            public final void sendEvent(String str, JSONObject jSONObject2) {
            }

            @Override // X.InterfaceC634840OvC
            public final Activity LIZLLL() {
                return activity;
            }

            @Override // X.InterfaceC634840OvC
            public final Context getContext() {
                return activity;
            }

            @Override // X.InterfaceC634840OvC
            public final <T> T LIZIZ(Class<T> cls) {
                if (InterfaceC1877240yx0.class.isAssignableFrom(cls)) {
                    final InterfaceC1877250yx1 interfaceC1877250yx12 = interfaceC1877250yx1;
                    return cls.cast(new InterfaceC1877240yx0() { // from class: X.0m9v
                        @Override // X.InterfaceC1877240yx0
                        public final InterfaceC1877250yx1 LIZ() {
                            return interfaceC1877250yx12;
                        }
                    });
                }
                return null;
            }
        });
        final C1385440m9m c1385440m9m2 = (C1385440m9m) this.l0;
        final Number number = (Number) this.l4;
        r3.LIZJ(interfaceC1057540dcu, new CompletionBlock<InterfaceC1378550lyf>() { // from class: X.0m9l
            @Override // com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock
            public final /* bridge */ /* synthetic */ void onRawSuccess(XBaseResultModel xBaseResultModel) {
            }

            @Override // com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock
            public final void onSuccess(XBaseResultModel xBaseResultModel, String str) throws JSONException {
                C1385440m9m c1385440m9m3 = c1385440m9m2;
                Number number2 = number;
                c1385440m9m3.getClass();
                c1385440m9m3.LJFF(number2, C1385440m9m.LJII((InterfaceC1378550lyf) xBaseResultModel));
            }

            @Override // com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock
            public final void onFailure(int i, String str, XBaseResultModel xBaseResultModel) throws JSONException {
                C1385440m9m c1385440m9m3 = c1385440m9m2;
                Number number2 = number;
                c1385440m9m3.getClass();
                c1385440m9m3.LJ(number2, C1385440m9m.LJII((InterfaceC1378550lyf) xBaseResultModel));
            }
        });
    }

    public static final void run$0(ARunnableS14S0500000_21 aRunnableS14S0500000_21) {
        boolean zLIZ;
        C1C7U.LIZ("CommentInnerPhotoAssem@eb60.tryStartLivePhoto$setPlayerContainer$1$2");
        try {
            ((CommentInnerPhotoAssem) aRunnableS14S0500000_21.l0).Ap();
            CommentInnerPhotoAssem.yp((CommentInnerPhotoAssem) aRunnableS14S0500000_21.l0, (InterfaceC1484830ok5) aRunnableS14S0500000_21.l1, (C1350840lFy) aRunnableS14S0500000_21.l2, (CommentLivePhotoInfoModel) aRunnableS14S0500000_21.l3, (FrameLayout) aRunnableS14S0500000_21.l4);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CommentInnerPhotoAssem@eb60.tryStartLivePhoto$setPlayerContainer$1$2");
    }

    public static final void run$1(ARunnableS14S0500000_21 aRunnableS14S0500000_21) {
        boolean zLIZ;
        C1C7U.LIZ("MinisShareToUserMethodNative@6d96.handle$1");
        try {
            aRunnableS14S0500000_21.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MinisShareToUserMethodNative@6d96.handle$1");
    }

    public static final void run$2(ARunnableS14S0500000_21 aRunnableS14S0500000_21) {
        boolean zLIZ;
        C1C7U.LIZ("MinisShareAppMessageMethodNative@5cd9.handle$1");
        try {
            aRunnableS14S0500000_21.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MinisShareAppMessageMethodNative@5cd9.handle$1");
    }

    public ARunnableS14S0500000_21(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
        this.l4 = obj5;
    }
}
