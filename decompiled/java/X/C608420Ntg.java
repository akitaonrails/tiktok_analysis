package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Ntg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C608420Ntg implements InterfaceC658750Psf {
    public final /* synthetic */ Aweme LL;
    public final /* synthetic */ String LLILLJJLI;

    @Override // X.InterfaceC658750Psf
    public final void onImageLoaded(boolean z, String str, JSONObject jSONObject) {
    }

    @Override // X.InterfaceC658750Psf
    public final void Ck(final JSONObject jSONObject) {
        final Aweme aweme = this.LL;
        final String str = this.LLILLJJLI;
        Runnable runnable = new Runnable() { // from class: X.0Ntf
            /* JADX WARN: Multi-variable type inference failed */
            public final void LIZ() {
                String strOptString;
                JSONObject jSONObject2 = jSONObject;
                boolean z = false;
                boolean zOptBoolean = jSONObject2 != null ? jSONObject2.optBoolean("isSuccess") : 0;
                JSONObject jSONObject3 = jSONObject;
                int iOptInt = jSONObject3 != null ? jSONObject3.optInt("from") : 0;
                JSONObject jSONObject4 = jSONObject;
                String strLJZL = (jSONObject4 == null || (strOptString = jSONObject4.optString("err_msg")) == null) ? null : C13LN.LJZL(35, strOptString);
                boolean z2 = iOptInt == -1;
                C608450Ntj c608450Ntj = C608450Ntj.LIZ;
                Aweme aweme2 = aweme;
                c608450Ntj.getClass();
                if (C608450Ntj.LIZLLL(aweme2)) {
                    String str2 = str;
                    Aweme aweme3 = aweme;
                    if (aweme3 != null && aweme3.getAid() != null) {
                        C0NET c0net = C0NET.LIZ;
                        String aid = aweme3.getAid();
                        c0net.getClass();
                        boolean zLJIIIIZZ = C0NET.LJIIIIZZ(aid);
                        C2344009Gk c2344009Gk = new C2344009Gk();
                        c2344009Gk.LJIIIIZZ("enter_from", str2);
                        c2344009Gk.LIZJ(zLJIIIIZZ ? 1 : 0, "cache");
                        c2344009Gk.LIZJ(!zOptBoolean, "is_success");
                        c2344009Gk.LIZJ(iOptInt, "image_cdn_hit");
                        c2344009Gk.LIZJ(aweme3.isAd() ? 1 : 0, "is_ad");
                        c2344009Gk.LJIIIIZZ("aid", aweme3.getAid());
                        LogPbBean logPbBean = aweme3.getLogPbBean();
                        c2344009Gk.LJIIIIZZ("log_id", logPbBean != null ? logPbBean.getImprId() : null);
                        c2344009Gk.LIZJ(aweme3.getAwemeType(), "aweme_type");
                        c2344009Gk.LJIIIIZZ("err_msg", strLJZL);
                        Map<String, String> map = c2344009Gk.LIZ;
                        C2276471E8n c2276471E8n = C2276471E8n.LIZIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("music_turntable_image_download_status=");
                        sbLIZ.append(map);
                        c2276471E8n.LIZIZ("common_feed", "FeedFiledMobForServerUtil", C2188811AlT.LIZIZ(sbLIZ));
                        C20684815ws.LJIILLIIL("music_turntable_image_download_status", map);
                    }
                }
                String str3 = str;
                if (zOptBoolean != 0 && C608450Ntj.LIZLLL(aweme)) {
                    z = true;
                }
                C608450Ntj.LJFF(str3, z, aweme, z2, true);
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("FeedFiledMobForServerUtil@c896.getMusicCoverImageLoadListener$1$onImageSensibleLoaded$reportRunnable$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("FeedFiledMobForServerUtil@c896.getMusicCoverImageLoadListener$1$onImageSensibleLoaded$reportRunnable$1");
            }
        };
        if (((Boolean) C309500CBg.LIZ.getValue()).booleanValue()) {
            C20684815ws.LJFF().execute(runnable);
        } else {
            runnable.run();
        }
    }

    public C608420Ntg(Aweme aweme, String str) {
        this.LL = aweme;
        this.LLILLJJLI = str;
    }
}
