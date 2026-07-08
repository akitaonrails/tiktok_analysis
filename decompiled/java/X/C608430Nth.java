package X;

import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Nth, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C608430Nth implements InterfaceC658750Psf {
    public final /* synthetic */ Aweme LL;
    public final /* synthetic */ String LLILLJJLI;

    @Override // X.InterfaceC658750Psf
    public final void Ck(final JSONObject jSONObject) {
        final Aweme aweme = this.LL;
        final String str = this.LLILLJJLI;
        Runnable runnable = new Runnable() { // from class: X.0Nte
            /* JADX WARN: Multi-variable type inference failed */
            public final void LIZ() {
                int i;
                UrlModel avatarThumb;
                String strOptString;
                JSONObject jSONObject2 = jSONObject;
                boolean zOptBoolean = jSONObject2 != null ? jSONObject2.optBoolean("isSuccess") : 0;
                JSONObject jSONObject3 = jSONObject;
                int iOptInt = jSONObject3 != null ? jSONObject3.optInt("from") : 0;
                JSONObject jSONObject4 = jSONObject;
                String strLJZL = (jSONObject4 == null || (strOptString = jSONObject4.optString("err_msg")) == null) ? null : C13LN.LJZL(35, strOptString);
                boolean z = iOptInt == -1;
                C608450Ntj c608450Ntj = C608450Ntj.LIZ;
                Aweme aweme2 = aweme;
                c608450Ntj.getClass();
                if (C608450Ntj.LIZIZ(aweme2)) {
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
                        sbLIZ.append("avatar_image_download_status=");
                        sbLIZ.append(map);
                        c2276471E8n.LIZIZ("common_feed", "FeedFiledMobForServerUtil", C2188811AlT.LIZIZ(sbLIZ));
                        C20684815ws.LJIILLIIL("avatar_image_download_status", map);
                    }
                }
                String str3 = str;
                boolean z2 = zOptBoolean != 0 && C608450Ntj.LIZIZ(aweme);
                Aweme aweme4 = aweme;
                if (aweme4 != null) {
                    C0NET c0net2 = C0NET.LIZ;
                    String aid2 = aweme4.getAid();
                    c0net2.getClass();
                    boolean zLJIIIIZZ2 = C0NET.LJIIIIZZ(aid2);
                    C2344009Gk c2344009Gk2 = new C2344009Gk();
                    c2344009Gk2.LJIIIIZZ("enter_from", str3);
                    c2344009Gk2.LIZJ(zLJIIIIZZ2 ? 1 : 0, "cache");
                    if (z2) {
                        i = 0;
                    } else {
                        User author = aweme4.getAuthor();
                        ImageUrlModel imageUrlModelLIZ = (author == null || (avatarThumb = author.getAvatarThumb()) == null) ? null : C438710HIf.LIZ(avatarThumb);
                        if (aweme4.getAuthor() == null) {
                            i = 2;
                        } else {
                            User author2 = aweme4.getAuthor();
                            i = C2105908Mv.LIZ(author2 != null ? author2.getUid() : null) ? 3 : (aweme4.getAuthor().getAvatarThumb() == null || imageUrlModelLIZ == null || imageUrlModelLIZ.isEmpty()) ? 4 : z ? 5 : 1;
                        }
                    }
                    c2344009Gk2.LIZJ(i, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
                    c2344009Gk2.LIZJ(aweme4.isAd() ? 1 : 0, "is_ad");
                    c2344009Gk2.LJIIIIZZ("aid", aweme4.getAid());
                    LogPbBean logPbBean2 = aweme4.getLogPbBean();
                    c2344009Gk2.LJIIIIZZ("log_id", logPbBean2 != null ? logPbBean2.getImprId() : null);
                    c2344009Gk2.LIZJ(aweme4.getAwemeType(), "aweme_type");
                    Map<String, String> map2 = c2344009Gk2.LIZ;
                    C2276471E8n c2276471E8n2 = C2276471E8n.LIZIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("avatar_show=");
                    sbLIZ2.append(map2);
                    c2276471E8n2.LIZIZ("common_feed", "FeedFiledMobForServerUtil", C2188811AlT.LIZIZ(sbLIZ2));
                    C20684815ws.LJIILLIIL("avatar_show", map2);
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("FeedFiledMobForServerUtil@c896.getAvatarImageLoadListener$1$onImageSensibleLoaded$reportRunnable$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("FeedFiledMobForServerUtil@c896.getAvatarImageLoadListener$1$onImageSensibleLoaded$reportRunnable$1");
            }
        };
        if (((Boolean) C309500CBg.LIZ.getValue()).booleanValue()) {
            C20684815ws.LJFF().execute(runnable);
        } else {
            runnable.run();
        }
    }

    public C608430Nth(Aweme aweme, String str) {
        this.LL = aweme;
        this.LLILLJJLI = str;
    }

    @Override // X.InterfaceC658750Psf
    public final void onImageLoaded(boolean z, String str, JSONObject jSONObject) {
        String aid;
        if (C0BSQ.LIZ && !z) {
            Aweme aweme = this.LL;
            if (aweme != null) {
                aid = aweme.getAid();
            } else {
                aid = null;
            }
            C720650SOp.LIZ(aid, "user_avatar", jSONObject);
        }
    }
}
