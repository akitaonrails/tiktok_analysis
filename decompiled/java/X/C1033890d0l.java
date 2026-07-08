package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.commercialize.amazoncheckoutad.AmazonAdRealtimeInfoResult;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AwS595S0100000_16;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0d0l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1033890d0l extends AbstractC1033980d0u {
    public AnonymousClass0956 LLILZ;
    public AmazonAdRealtimeInfoResult LLILZIL;
    public final Set<C1033970d0t> LLILZLL;
    public final Set<C1033970d0t> LLIZ;

    public final void LJIILL() {
        this.LLILZLL.clear();
        this.LLIZ.clear();
        AnonymousClass0956 anonymousClass0956 = this.LLILZ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLILZIL = null;
    }

    @Override // X.AbstractC1033980d0u
    public final void LJI() {
        super.LJI();
        LJIILL();
    }

    @Override // X.AbstractC1033980d0u
    public final void LIZLLL() {
        LJIILL();
    }

    public C1033890d0l(InterfaceC1034260d1M interfaceC1034260d1M) {
        super(interfaceC1034260d1M);
        this.LLILZLL = new LinkedHashSet();
        this.LLIZ = new LinkedHashSet();
    }

    @Override // X.AbstractC1033980d0u
    public final void LJ(Aweme aweme) {
        if (!C1017070cZd.LJJLJ(aweme)) {
            return;
        }
        LJIILL();
        this.LLILZ = C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0SCQ(aweme, new AwS595S0100000_16(this, 279), null), 3);
    }

    @Override // X.AbstractC1033980d0u
    public final void LJIIIIZZ(int i) {
        JSONObject jSONObject;
        C1033970d0t c1033970d0tLIZIZ = LIZIZ(i);
        if (c1033970d0tLIZIZ == null) {
            return;
        }
        AmazonAdRealtimeInfoResult amazonAdRealtimeInfoResult = this.LLILZIL;
        if (amazonAdRealtimeInfoResult != null && (jSONObject = amazonAdRealtimeInfoResult.adInfoJsonObject) != null) {
            LJIILJJIL(c1033970d0tLIZIZ, jSONObject);
        } else {
            this.LLIZ.add(c1033970d0tLIZIZ);
        }
    }

    public final void LJIILJJIL(C1033970d0t c1033970d0t, JSONObject jSONObject) {
        if (this.LLILZLL.contains(c1033970d0t)) {
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("event", "amazon_product_info_event");
        jSONObject2.put("data", jSONObject);
        c1033970d0t.LIZJ.LJIIZILJ(new C0SCL(jSONObject2));
        this.LLILZLL.add(c1033970d0t);
    }
}
