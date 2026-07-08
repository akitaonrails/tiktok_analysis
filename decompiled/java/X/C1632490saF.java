package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;
import kotlin.jvm.internal.AFwS214S0000000_25;
import lth.o;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0saF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1632490saF implements InterfaceC1411260mpQ {
    public final InterfaceC1650230t2r LIZ;

    @Override // X.InterfaceC1411260mpQ
    public final String LIZIZ() {
        return "NICK";
    }

    @Override // X.InterfaceC1411260mpQ
    public final boolean LIZLLL() {
        return true;
    }

    @Override // X.InterfaceC1411260mpQ
    public final InterfaceC1650230t2r getCameraApiComponent() {
        return this.LIZ;
    }

    public C1632490saF(InterfaceC1650230t2r interfaceC1650230t2r) {
        this.LIZ = interfaceC1650230t2r;
    }

    @Override // X.InterfaceC1411260mpQ
    public final void LIZ(int i, String str) throws JSONException {
        UrlModel avatarThumb;
        Object objLJJLIIIJL;
        List<String> urlList;
        List<String> urlList2;
        if (!o.LJIIZILJ.isLogin()) {
            C371410EhH.LIZJ(AFwS214S0000000_25.get$arr$(568));
            return;
        }
        C19292410dm currentUser = C0CHQ.LIZ().getAccountService().getCurrentUser();
        if (currentUser != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("interface", "NICK");
            jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, 0);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("handle", currentUser.getUniqueId());
            jSONObject2.put("nickname", currentUser.getNickname());
            UrlModel avatarMedium = currentUser.getAvatarMedium();
            if ((avatarMedium == null || (urlList2 = avatarMedium.getUrlList()) == null || (objLJJLIIIJL = C13LP.LJJLIIIJL(urlList2)) == null) && ((avatarThumb = currentUser.getAvatarThumb()) == null || (urlList = avatarThumb.getUrlList()) == null || (objLJJLIIIJL = C13LP.LJJLIIIJL(urlList)) == null)) {
                objLJJLIIIJL = "";
            }
            jSONObject2.put("avatar_path", objLJJLIIIJL);
            jSONObject.put("body", jSONObject2);
            C1411250mpP.LIZIZ(this, i, C786410Ut5.J3(jSONObject));
            return;
        }
        C201955140j.LIZIZ("EffectUserInfoHandler", "handleEffectMessage::currentUser is null");
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("interface", "NICK");
        jSONObject3.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, 1);
        C1411250mpP.LIZIZ(this, i, C786410Ut5.J3(jSONObject3));
    }

    @Override // X.InterfaceC1411260mpQ
    public final boolean LIZJ(int i, int i2, int i3, String str) {
        return C1411250mpP.LIZ(this, i, i2, i3, str);
    }
}
