package X;

import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.Pair;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0zJ0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1890880zJ0 {
    public static void LIZ(C1331670kl3 c1331670kl3, final String str, final String str2) {
        if (((Number) C0ALQ.LIZ.getValue()).intValue() == 1) {
            final InterfaceC658750Psf interfaceC658750Psf = c1331670kl3.LJJJIL;
            c1331670kl3.LJJJIL = new InterfaceC658750Psf(str, str2, interfaceC658750Psf) { // from class: X.0zIz
                public final String LL;
                public final String LLILLJJLI;
                public final InterfaceC658750Psf LLILLL;

                @Override // X.InterfaceC658750Psf
                public final void Ck(JSONObject jSONObject) {
                    boolean z;
                    String str3;
                    InterfaceC658750Psf interfaceC658750Psf2 = this.LLILLL;
                    if (interfaceC658750Psf2 != null) {
                        interfaceC658750Psf2.Ck(jSONObject);
                    }
                    if (jSONObject.optBoolean("isSuccess")) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C1890890zJ1 c1890890zJ1 = new Object() { // from class: X.0zJ1
                    };
                    String str4 = this.LL;
                    String str5 = this.LLILLJJLI;
                    c1890890zJ1.getClass();
                    Pair[] pairArr = new Pair[4];
                    pairArr[0] = new Pair("tag", str4);
                    pairArr[1] = new Pair(Scene.SCENE_SERVICE, str5);
                    if (z) {
                        str3 = "1";
                    } else {
                        str3 = CardStruct.IStatusCode.DEFAULT;
                    }
                    pairArr[2] = new Pair(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str3);
                    String str6 = C0NBD.LIZ;
                    if (str6 == null) {
                        str6 = "";
                    }
                    pairArr[3] = new Pair("inbox_session_id", str6);
                    C20684815ws.LJIILLIIL("notice_image_monitor", C2097608Jq.LJIIJ(pairArr));
                }

                {
                    this.LL = str;
                    this.LLILLJJLI = str2;
                    this.LLILLL = interfaceC658750Psf;
                }

                @Override // X.InterfaceC658750Psf
                public final void onImageLoaded(boolean z, String str3, JSONObject jSONObject) {
                    InterfaceC658750Psf interfaceC658750Psf2 = this.LLILLL;
                    if (interfaceC658750Psf2 != null) {
                        interfaceC658750Psf2.onImageLoaded(z, str3, jSONObject);
                    }
                }
            };
        }
    }
}
