package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.avatarloader.api.IMAvatarLoaderApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.contact.ContactFeature;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushUITemplate;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ZKZ, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZKZ {
    public static final C0ZKZ LIZ = new C0ZKZ();

    public static void LIZ(final InnerPushMessage innerPushMessage, List list, C427870Gq9 c427870Gq9) {
        InnerPushUITemplate uiTemplate;
        String uid;
        IMUser iMUserLJ;
        UrlModel avatarThumb;
        List<String> urlList;
        User user;
        if (innerPushMessage != null && (uiTemplate = innerPushMessage.getUiTemplate()) != null) {
            InterfaceC658750Psf interfaceC658750Psf = new InterfaceC658750Psf() { // from class: X.0ZKb
                @Override // X.InterfaceC658750Psf
                public final void onImageLoaded(boolean z, String str, JSONObject jSONObject) {
                }

                @Override // X.InterfaceC658750Psf
                public final void Ck(JSONObject jSONObject) {
                    boolean zOptBoolean = jSONObject.optBoolean("isSuccess", false);
                    String strOptString = jSONObject.optString("scene_tag");
                    a0.LJJLJLI(strOptString, "-", strOptString);
                    innerPushMessage.getTracker().LJIILIIL = zOptBoolean ? 1 : 0;
                    innerPushMessage.getTracker().LJII = jSONObject.optLong("duration", -1L);
                    innerPushMessage.getTracker().LJIIJ = jSONObject.optInt("from", -1);
                }
            };
            List<User> list2 = uiTemplate.fromUsers;
            if (list2 == null || (user = (User) ListProtector.get(list2, 0)) == null || (uid = user.getUid()) == null) {
                uid = "";
            }
            if (((Boolean) C1865980yeq.LIZIZ.getValue()).booleanValue()) {
                ContactFeature contactFeatureLIZ = ContactFeature.LIZ.LIZ();
                if (contactFeatureLIZ != null && (iMUserLJ = contactFeatureLIZ.LJ(uid, "im_local_db")) != null && (avatarThumb = iMUserLJ.getAvatarThumb()) != null && (urlList = avatarThumb.getUrlList()) != null) {
                    list = urlList;
                } else if (list == null) {
                    return;
                }
                C1331670kl3 c1331670kl3LJIIJ = C1331660kl2.LJIIJ(new C03IT(list));
                c1331670kl3LJIIJ.LJJ(c427870Gq9);
                c1331670kl3LJIIJ.LIZLLL("singleHeadAvatar");
                c1331670kl3LJIIJ.LJJJIL = interfaceC658750Psf;
                C786410Ut5.h3(c1331670kl3LJIIJ);
                return;
            }
            if (((Boolean) C1865980yeq.LIZJ.getValue()).booleanValue()) {
                final long jCurrentTimeMillis = System.currentTimeMillis();
                IMAvatarLoaderApi.LIZ.getClass();
                C0ZKG c0zkgLIZJ = C04TK.LIZIZ.LIZJ(c427870Gq9, "inner_push");
                UrlModel urlModel = new UrlModel();
                urlModel.setUrlList(list);
                c0zkgLIZJ.LIZIZ(uid, urlModel, new C0ZKF(0, 0, 0, 0, 0, new C0ZK1() { // from class: X.0ZKa
                    @Override // X.C0ZK1
                    public final void LIZ() {
                    }

                    @Override // X.C0ZK1
                    public final void LIZIZ() {
                        innerPushMessage.getTracker().LJIILIIL = 0;
                    }

                    @Override // X.C0ZK1
                    public final void LIZJ(int i, String str, boolean z) {
                        innerPushMessage.getTracker().LJIILIIL = 1;
                        innerPushMessage.getTracker().LJII = System.currentTimeMillis() - jCurrentTimeMillis;
                        innerPushMessage.getTracker().LJIIJ = 2;
                    }
                }, 95));
                return;
            }
            UrlModel urlModel2 = new UrlModel();
            urlModel2.setUrlList(list);
            C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(urlModel2));
            c1331670kl3LJIIIIZZ.LJJ(c427870Gq9);
            c1331670kl3LJIIIIZZ.LIZLLL("singleHeadAvatar");
            c1331670kl3LJIIIIZZ.LJJJIL = interfaceC658750Psf;
            C786410Ut5.h3(c1331670kl3LJIIIIZZ);
        }
    }
}
