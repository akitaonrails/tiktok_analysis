package X;

import android.content.Context;
import android.net.Uri;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0dbd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public abstract class AbstractC1056750dbd implements InterfaceC1048350dO5, WeakHandler.IHandler {
    public C2203531BLz LL;
    public WeakReference<Context> LLILLJJLI;
    public List<String> LLILLL;
    public List<String> LLILZ;

    public boolean LJ() {
        return false;
    }

    public final void onDestroy() {
        this.LLILLJJLI = null;
        C2203531BLz c2203531BLz = this.LL;
        if (c2203531BLz != null) {
            c2203531BLz.LIZ();
            this.LL = null;
        }
        C07PV c07pvLIZ = C07PV.LIZ();
        List<Object> list = c07pvLIZ.LIZ;
        if (list == null || ((ArrayList) list).isEmpty()) {
            return;
        }
        ((ArrayList) c07pvLIZ.LIZ).remove(this);
    }

    public List<String> LIZJ() {
        if (this.LLILLL == null) {
            this.LLILLL = new ArrayList();
        }
        this.LLILLL.add("openConfig");
        this.LLILLL.add("config");
        this.LLILLL.add("appInfo");
        this.LLILLL.add("close");
        this.LLILLL.add("gallery");
        this.LLILLL.add("toggleGalleryBars");
        this.LLILLL.add("slideShow");
        this.LLILLL.add("relatedShow");
        this.LLILLL.add("toast");
        this.LLILLL.add("slideDownload");
        this.LLILLL.add("requestChangeOrientation");
        this.LLILLL.add("adInfo");
        return this.LLILLL;
    }

    public AbstractC1056750dbd(Context context) {
        new WeakHandler(this);
        new JSONArray();
        this.LLILLJJLI = new WeakReference<>(context);
        C07PV c07pvLIZ = C07PV.LIZ();
        if (c07pvLIZ.LIZ == null) {
            c07pvLIZ.LIZ = new ArrayList();
        }
        if (!((ArrayList) c07pvLIZ.LIZ).contains(this)) {
            ((ArrayList) c07pvLIZ.LIZ).add(this);
        }
    }

    @Override // X.InterfaceC1048350dO5
    public void LIZIZ(JSONObject jSONObject) throws JSONException {
        if (TextUtils.equals(null, "1") && !TextUtils.isEmpty(null)) {
            JSONObject jSONObject2 = new JSONObject((String) null);
            Iterator<String> itKeys = jSONObject2.keys();
            while (itKeys.hasNext()) {
                try {
                    String next = itKeys.next();
                    jSONObject.put(next, jSONObject2.opt(next));
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    return;
                }
            }
            return;
        }
        jSONObject.put("cid", 0L);
        jSONObject.put("group_id", 0L);
        jSONObject.put("ad_type", 0);
        jSONObject.put("log_extra", (Object) null);
        jSONObject.put("download_url", (Object) null);
        jSONObject.put("package_name", (Object) null);
        jSONObject.put("app_name", (Object) null);
        jSONObject.put("code", 0);
        jSONObject.put("land_page_data", (Object) null);
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        long j;
        JSONObject jSONObject;
        if (message.what == 1) {
            try {
                if (HandlerHook.getMessageObj(message.obj) instanceof Uri) {
                    Uri uri = (Uri) HandlerHook.getMessageObj(message.obj);
                    if ("log_event".equals(uri.getHost())) {
                        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "category");
                        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "tag");
                        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "label");
                        long j2 = 0;
                        try {
                            j = CastLongProtector.parseLong(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "value"));
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            j = 0;
                        }
                        try {
                            j2 = CastLongProtector.parseLong(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "ext_value"));
                        } catch (Exception e2) {
                            TryCatchGuardChecker.doCheck(e2);
                        }
                        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "extra");
                        if (!C2093608Ic.LJ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4)) {
                            try {
                                jSONObject = new JSONObject(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4);
                            } catch (Exception e3) {
                                TryCatchGuardChecker.doCheck(e3);
                                jSONObject = null;
                            }
                        } else {
                            jSONObject = null;
                        }
                        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 != null && strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 != null) {
                            C1022820ciu c1022820ciuLJ = C2184171Adz.LJ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3, String.valueOf(j), "", String.valueOf(j2));
                            if (jSONObject != null) {
                                Iterator<String> itKeys = jSONObject.keys();
                                while (itKeys.hasNext()) {
                                    String next = itKeys.next();
                                    c1022820ciuLJ.LIZJ(jSONObject.opt(next), next);
                                }
                            }
                            c1022820ciuLJ.LJIIIIZZ();
                        }
                        if (C2184171Adz.LIZJ()) {
                            C810650Vr5.LIZIZ(this.LLILLJJLI.get(), strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3, j, j2, jSONObject);
                            return;
                        }
                        if (C2184171Adz.LIZIZ()) {
                            if (jSONObject == null) {
                                try {
                                    jSONObject = new JSONObject();
                                } catch (JSONException e4) {
                                    TryCatchGuardChecker.doCheck(e4);
                                }
                            }
                            jSONObject.put("_ad_staging_flag", "1");
                            C810650Vr5.LIZIZ(this.LLILLJJLI.get(), strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3, j, j2, jSONObject);
                        }
                    }
                }
            } catch (Exception e5) {
                TryCatchGuardChecker.doCheck(e5);
            }
        }
    }

    public List<String> LIZLLL(List<String> list, boolean z) {
        if (this.LLILZ == null) {
            this.LLILZ = new ArrayList();
        }
        return this.LLILZ;
    }
}
