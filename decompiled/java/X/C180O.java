package X;

import android.content.Context;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.CreatorProductListLynxConfigSettings;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.common.api.ToggleCompliance;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.text.u;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.180O, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C180O {
    public static final Set<Integer> LJI = new LinkedHashSet();
    public static final C01GW<C180W> LJII = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(607));
    public Context LIZ;
    public String LIZIZ;
    public final Long LIZJ;
    public boolean LIZLLL;
    public int LJ;
    public ToggleCompliance LJFF;

    public final String LIZJ() {
        Uri.Builder builderBuildUpon = UriProtector.parse(u.LJJIFFI(u.LJJIFFI(u.LJJIFFI(CreatorProductListLynxConfigSettings.LIZ(), "_roomId_", CardStruct.IStatusCode.DEFAULT, false), "_isLiving_", "false", false), "_liveStatus_", "before_live", false)).buildUpon();
        LIZIZ(builderBuildUpon);
        return builderBuildUpon.build().toString();
    }

    public final String LIZLLL() {
        C180W c180wLIZ = C180Y.LIZ();
        C758970Tpv c758970TpvLIZ = c180wLIZ != null ? c180wLIZ.LIZ() : null;
        ToggleCompliance toggleCompliance = this.LJFF;
        int i = 2;
        boolean z = false;
        if (c758970TpvLIZ != null) {
            boolean z2 = c758970TpvLIZ.LIZ;
            if (z2 && c758970TpvLIZ.LIZIZ) {
                i = 3;
            } else if (!c758970TpvLIZ.LIZIZ) {
                i = z2 ? 1 : 0;
            }
            return String.valueOf(i);
        }
        if (toggleCompliance == null) {
            int i2 = this.LJ;
            if (1 <= i2 && i2 < 3) {
                z = true;
            }
            return String.valueOf(z);
        }
        boolean z3 = toggleCompliance.bcSwitchOn;
        if (z3 && toggleCompliance.boSwitchOn) {
            i = 3;
        } else if (!toggleCompliance.boSwitchOn) {
            i = z3 ? 1 : 0;
        }
        return String.valueOf(i);
    }

    public final String LIZ(String str) {
        Uri.Builder builderBuildUpon = UriProtector.parse(str).buildUpon();
        LIZIZ(builderBuildUpon);
        return builderBuildUpon.build().toString();
    }

    public final void LIZIZ(Uri.Builder builder) {
        int i = this.LJ;
        if (i >= 0 && i < 3 && this.LIZIZ != null) {
            builder.appendQueryParameter("toggle", LIZLLL());
            builder.appendQueryParameter("self_sale", String.valueOf(this.LIZLLL));
        }
    }

    public final void LJ(String str) {
        this.LIZIZ = str;
        C180W c180wLIZ = C180Y.LIZ();
        if (c180wLIZ != null) {
            c180wLIZ.init();
        }
        C180W c180wLIZ2 = C180Y.LIZ();
        if (c180wLIZ2 != null) {
            c180wLIZ2.LIZIZ(new AwS576S0100000_32(this, 638));
        }
        C180W c180wLIZ3 = C180Y.LIZ();
        if (c180wLIZ3 != null) {
            new AwS591S0100000_12(this, 954);
            c180wLIZ3.LIZLLL();
        }
        String str2 = this.LIZIZ;
        if (str2 != null) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C2126308Ur.LIZIZ), null, null, new C180P(str2, this, null), 3);
        }
    }

    public static void LJFF(String str, String str2) {
        try {
            C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("EVENT_ORIGIN_FEATURE", "TEMAI");
            jSONObject.put("page_name", "live_take_page");
            jSONObject.put("popup_name", "live_brand_content_toggle");
            if (str2 != null) {
                jSONObject.put("action_type", str2);
            }
            c1507790pL7.getClass();
            C1507790pL7.LIZLLL(str, jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public C180O(Context context, Long l, int i, int i2) {
        context = (i2 & 1) != 0 ? null : context;
        l = (i2 & 4) != 0 ? null : l;
        this.LIZ = context;
        this.LIZIZ = null;
        this.LIZJ = l;
        this.LIZLLL = true;
        this.LJ = 3;
        LJI.add(Integer.valueOf(i));
    }
}
