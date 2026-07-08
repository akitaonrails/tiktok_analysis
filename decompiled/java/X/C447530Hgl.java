package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushConfig;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushUITemplate;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import kotlin.Pair;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Hgl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C447530Hgl {
    public static final C447530Hgl LIZ = new C447530Hgl();
    public static final C557050Lt1 LIZIZ = new C557050Lt1(false);
    public static volatile boolean LIZJ;

    public static void LIZ(Context context) {
        C1908480zlO.LIZIZ.LJ(new InterfaceC19330810jy() { // from class: X.0Hgm
            @Override // X.InterfaceC19330810jy
            public final int[] LIZJ() {
                return new int[]{2422};
            }

            @Override // X.InterfaceC19330810jy
            public final boolean LIZLLL(InnerPushMessage innerPushMessage) {
                return false;
            }

            @Override // X.InterfaceC19330810jy
            public final boolean LJFF(InnerPushMessage innerPushMessage) {
                return true;
            }

            @Override // X.InterfaceC19330810jy
            public final boolean LJI(InnerPushMessage innerPushMessage) {
                return true;
            }

            @Override // X.InterfaceC19330810jy
            public final C20663815tU LJIIIZ(C20663515tR c20663515tR, InnerPushMessage innerPushMessage) {
                return null;
            }

            @Override // X.InterfaceC19330810jy
            public final boolean LIZ(int i, InnerPushMessage innerPushMessage) {
                try {
                    if (!C447530Hgl.LIZJ) {
                        C447530Hgl.LIZJ = true;
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.putOpt("enter_from", "i.e.: homepage_hot");
                        jSONObject.putOpt("enter_method", "click_manage");
                        C20684815ws.LJIJ("in_app_push_click", jSONObject);
                        return false;
                    }
                    return false;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    return false;
                }
            }
        });
        C384050F3z c384050F3z = new C384050F3z();
        Integer numValueOf = Integer.valueOf(R.attr.a0g);
        c384050F3z.LIZIZ = numValueOf;
        c384050F3z.LJFF = numValueOf;
        c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
        c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(24));
        Drawable drawableLIZ = c384050F3z.LIZ(context);
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        c419910GdJ.LIZ = R.raw.icon_a_rectangle_fill;
        c419910GdJ.LJ = Integer.valueOf(R.attr.b_);
        new C19323510in(2422, "inner_app_languague_match_system", new InnerPushConfig(0L, null, 0, null, 5), new InnerPushUITemplate(0, null, 0, 0, 0, 0, null, null, null, null, null, null, null, Collections.singletonList(C426750GoL.LJIILIIL(c419910GdJ.LIZ(context), drawableLIZ)), null, 48, 48, 0.0f, 0.5f, null, 20, 20, null, false, -3, 3, null, 0, 0, 0, Boolean.FALSE, 0, 0, 0, 0, 0, null, null, context.getString(2131826950), null, 2, null, 3, context.getString(2131826951), null, 36, 48, 4, 0, null, null, 0.5f, null, true, 0, null, null, "aweme://display/setting?enter_from=in_app_push&enter_method=click_manage", 12, null, null, null, null, null, 0), C2097608Jq.LJIIJ(new Pair("business_tag", "infra")), null, 396).LIZIZ();
    }
}
