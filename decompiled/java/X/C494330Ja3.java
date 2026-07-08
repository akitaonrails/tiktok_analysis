package X;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.livesdk.dataChannel.PreviewSubOnlyLiveGuidanceChannel;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Ja3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C494330Ja3 implements InterfaceC492700JTw {
    public final String LIZ;
    public final boolean LIZIZ;
    public C20515215Pi LIZJ;

    @Override // X.InterfaceC492700JTw
    public final void LIZIZ() {
        C20515215Pi c20515215Pi = this.LIZJ;
        if (c20515215Pi != null) {
            c20515215Pi.LIZIZ();
        }
        this.LIZJ = null;
    }

    public C494330Ja3(String str, boolean z) {
        this.LIZ = str;
        this.LIZIZ = z;
    }

    @Override // X.InterfaceC492700JTw
    public final void LIZ(Fragment fragment, C492730JTz c492730JTz) {
        int i;
        C20515215Pi c20515215Pi = new C20515215Pi(fragment);
        final Context context = fragment.getContext();
        if (context != null) {
            if (this.LIZIZ) {
                i = 2131856625;
            } else {
                i = 2131844241;
            }
            c20515215Pi.LIZ.LJFF = C497740JfY.LJIJI(i);
            c20515215Pi.LIZ.LJI = C497740JfY.LJIJI(2131844240);
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(88));
            C1057450dcl c1057450dcl = c20515215Pi.LIZ;
            c1057450dcl.LJII = iLIZIZ;
            c1057450dcl.LJIIJ = 2;
            C492690JTv c492690JTv = new C492690JTv(this, c492730JTz);
            C1057450dcl c1057450dcl2 = c20515215Pi.LIZ;
            c1057450dcl2.LJIILJJIL = c492690JTv;
            c1057450dcl2.LIZJ = false;
            c1057450dcl2.LJIILIIL = new View.OnClickListener() { // from class: X.0JU3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) throws JSONException {
                    C494330Ja3 c494330Ja3 = this.LL;
                    Context context2 = context;
                    c494330Ja3.getClass();
                    DataChannelGlobal.LLILZ.HQ2(PreviewSubOnlyLiveGuidanceChannel.class, Boolean.TRUE);
                    Map<String, String> mapLIZ = C0KPJ.df.LIZ();
                    if (mapLIZ == null) {
                        mapLIZ = new HashMap<>();
                    }
                    C493830JYf c493830JYfLIZ = C0JYR.LIZ(mapLIZ);
                    C494680Jac.LJIJJLI(c493830JYfLIZ.LJ, c493830JYfLIZ.LJFF);
                    if (!Intrinsics.LJFF(c494330Ja3.LIZ, "live_take_page")) {
                        Uri.Builder builderBuildUpon = UriProtector.parse("sslocal://openShoot?enter_from=direct_shoot&tab=live").buildUpon();
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("request_page", "live_end_page");
                        ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(context2, builderBuildUpon.appendQueryParameter("source_params", C786410Ut5.J3(jSONObject)).toString());
                    }
                    C784440Upu.LIZ().LIZIZ(new C0JU4(0));
                    C19EG c19egLIZIZ = C1388190mED.LIZIZ(context2);
                    if (c19egLIZIZ != null) {
                        c19egLIZIZ.finish();
                    }
                    this.LL.LIZIZ();
                    this.LL.getClass();
                    String strValueOf = String.valueOf(UserService.getInstance().user().getCurrentUserId());
                    EnumC492660JTs enumC492660JTs = EnumC492660JTs.START;
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_start_sub_only_live_guidance_click");
                    c474500IjALIZ.LJIL();
                    c474500IjALIZ.LJJII(strValueOf, "anchor_id");
                    c474500IjALIZ.LJJII(enumC492660JTs, "click_type");
                    c474500IjALIZ.LIZ();
                }
            };
            c20515215Pi.LIZLLL();
            String strValueOf = String.valueOf(UserService.getInstance().user().getCurrentUserId());
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_start_sub_only_live_guidance_show");
            c474500IjALIZ.LJIL();
            c474500IjALIZ.LJJII(strValueOf, "anchor_id");
            c474500IjALIZ.LIZ();
        }
        this.LIZJ = c20515215Pi;
    }
}
