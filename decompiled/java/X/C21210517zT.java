package X;

import Y.ARunnableS132S0100000_32;
import android.view.ViewPropertyAnimator;
import com.bytedance.mt.protector.impl.string2number.CastDoubleProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS576S0100000_32;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.17zT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21210517zT extends AbstractC1911210zpn implements InterfaceC21210317zR {
    public long LL;
    public boolean LLILLJJLI;
    public Map<String, ? extends Object> LLILLL;
    public final boolean LLILZ;
    public final Function0<Unit> LLILZIL;
    public boolean LLILZLL;
    public long LLIZ;
    public long LLIZLLLIL;
    public Map<String, ? extends Object> LLJ = C2097608Jq.LJ();
    public boolean LLJI;
    public boolean LLJIJIL;

    public final JSONObject LJJJJL() {
        String string;
        JSONObject jSONObject = new JSONObject();
        if (this.LLILZ) {
            this.LLILLJJLI = true;
        }
        try {
            LJJJLZIJ(jSONObject, this.LLILLL);
            LJJJLZIJ(jSONObject, this.LLJ);
            jSONObject.remove("lynx_timing_info");
            Object objOpt = jSONObject.opt("start_to_now");
            if (objOpt == null || (string = objOpt.toString()) == null) {
                string = CardStruct.IStatusCode.DEFAULT;
            }
            double d = CastDoubleProtector.parseDouble(string);
            long j = this.LLIZLLLIL;
            long j2 = this.LLIZ;
            long j3 = j - j2;
            long j4 = this.LL;
            long j5 = j - j4;
            long j6 = j2 - j4;
            double dMax = this.LLILLJJLI ? Math.max(j5, d) : Math.max(j6, d);
            jSONObject.put("animation_duration", j3);
            jSONObject.put("start_to_show", dMax);
            jSONObject.put("click_to_animation_start", j6);
            jSONObject.put("click_to_animation_end", j5);
            jSONObject.put("have_container_animation", this.LLILLJJLI);
            jSONObject.put("native_preload", this.LLILZ ? 1 : 0);
            C189200o6.m2constructorimpl(jSONObject);
            return jSONObject;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return jSONObject;
        }
    }

    public final void LJJJZ() throws JSONException {
        if (this.LLILZLL) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LL;
        JSONObject jSONObjectLJJJJL = LJJJJL();
        jSONObjectLJJJJL.put("click_to_close", jCurrentTimeMillis);
        C1507790pL7.LIZ.getClass();
        C1507790pL7.LIZLLL("tiktokec_rd_live_meaningful_rendered_shop_bag_exception", jSONObjectLJJJJL);
        this.LLILZLL = true;
    }

    public final void LJJZ() {
        if (!this.LLILZLL && this.LLJIJIL && this.LLJI) {
            C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
            JSONObject jSONObjectLJJJJL = LJJJJL();
            c1507790pL7.getClass();
            C1507790pL7.LIZLLL("tiktokec_rd_live_meaningful_rendered_shop_bag", jSONObjectLJJJJL);
            this.LLILZLL = true;
        }
    }

    @Override // X.InterfaceC21210317zR
    public final void LIZ() {
        this.LLIZLLLIL = System.currentTimeMillis();
        this.LLJIJIL = true;
        LJJZ();
    }

    @Override // X.InterfaceC21210317zR
    public final void LIZIZ() {
        this.LLIZ = System.currentTimeMillis();
    }

    @Override // X.InterfaceC21210317zR
    public final void onHide() throws JSONException {
        LJJJZ();
    }

    @Override // X.AbstractC1911210zpn
    public final void LJJIJL(ViewPropertyAnimator viewPropertyAnimator) {
        viewPropertyAnimator.withStartAction(new ARunnableS132S0100000_32(this, 14));
        if (!this.LLJIJIL && !this.LLILZLL) {
            viewPropertyAnimator.withEndAction(new ARunnableS132S0100000_32(this, 15));
        }
    }

    public static void LJJJLZIJ(JSONObject jSONObject, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            try {
                C189200o6.m2constructorimpl(jSONObject.put((String) entry.getKey(), entry.getValue()));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
    }

    public C21210517zT(long j, boolean z, Map map, boolean z2, AwS576S0100000_32 awS576S0100000_32) {
        this.LL = j;
        this.LLILLJJLI = z;
        this.LLILLL = map;
        this.LLILZ = z2;
        this.LLILZIL = awS576S0100000_32;
    }
}
