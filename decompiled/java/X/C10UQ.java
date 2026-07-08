package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.ss.android.ugc.aweme.account.appdiff.IDramaNujService;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: renamed from: X.10UQ, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10UQ {
    public boolean LIZ;
    public Uri LIZIZ;
    public C10US LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public String LIZJ = "";
    public String LJI = "";
    public final String[] LJII = {"ug/ads"};

    public final Intent LIZ() {
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        String path;
        Uri uri = this.LIZIZ;
        if (uri == null) {
            return null;
        }
        if ("webview".equalsIgnoreCase(uri.getHost()) && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(this.LIZIZ, "url")) != null && (path = UriProtector.parse(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter).getPath()) != null) {
            for (String str : this.LJII) {
                if (path.contains(str)) {
                    String string = UriProtector.parse(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter).buildUpon().appendQueryParameter("is_ddl", "1").build().toString();
                    Uri.Builder builderClearQuery = this.LIZIZ.buildUpon().clearQuery();
                    builderClearQuery.appendQueryParameter("url", string);
                    for (String str2 : UriProtector.getQueryParameterNames(this.LIZIZ)) {
                        if (!"url".equals(str2)) {
                            builderClearQuery.appendQueryParameter(str2, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(this.LIZIZ, str2));
                        }
                    }
                    this.LIZIZ = builderClearQuery.build();
                }
            }
        }
        Intent intent = new Intent();
        intent.setData(this.LIZIZ);
        intent.setFlags(268435456);
        intent.putExtra("dl_from", this.LJI);
        intent.putExtra("is_ddl", true);
        if (C10ZH.LIZIZ.LJJI(this.LIZJ)) {
            intent.putExtra("is_from_self", true);
        }
        return intent;
    }

    public final void LIZJ() {
        Uri uri = this.LIZIZ;
        if (uri == null || this.LJ || this.LJFF) {
            return;
        }
        C10SW c10sw = C10SW.LIZ;
        c10sw.LJII(uri);
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        Intent intentLIZ = LIZ();
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(contextLIZ, intentLIZ, "Context_startActivity_1");
        C1701330uNH.LIZ(intentLIZ, contextLIZ);
        C2204961BRm.LJJJJJL(contextLIZ, intentLIZ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP+8apPdkhYe1BVaHoVb0XjDXfJvfdOxuqYKtC0=", null));
        c10sw.LJIIIIZZ();
        this.LJ = true;
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public void onEvent(C0DNB c0dnb) {
        if (this.LIZ) {
            LIZJ();
            this.LIZ = false;
        }
    }

    public final void LIZIZ(Uri uri, String str, String str2) {
        IDramaNujService.LIZ.getClass();
        C1574190r4D.LIZIZ.getValue().LIZ();
        this.LIZIZ = uri;
        this.LIZJ = str;
        this.LJI = str2;
        C10R5 c10r5 = C10R5.LJIIIIZZ;
        if (!C10RS.LIZ().LIZ) {
            C10TM c10tm = new C10TM();
            c10tm.LIZ = LIZ();
            C1440005kM.LIZ(c10tm);
            this.LJFF = true;
            if (this.LIZIZ != null) {
                C2241008qG c2241008qG = new C2241008qG();
                c2241008qG.LIZ.put("url", this.LIZIZ.toString());
                c2241008qG.LIZ.put("ddl_from", str2);
                C20684815ws.LJIJ("ddl_deliver_to_nuj", c2241008qG.LJ());
                return;
            }
            return;
        }
        Uri uri2 = this.LIZIZ;
        if (uri2 != null) {
            boolean zEquals = "normal".equals(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri2, "awedp_require_login"));
            this.LIZ = zEquals;
            if (zEquals) {
                EventBus.LIZLLL().LJIJJ(this);
                return;
            }
        }
        LIZJ();
    }
}
