package X;

import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0fGL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.broadcaster.duringlive.slot.quickproduct.QuickProductSlot$onCreate$3$1", f = "QuickProductSlot.kt", l = {}, m = "invokeSuspend")
public final class C1120430fGL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C14GT LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1120430fGL(C14GT c14gt, InterfaceC1364105Vn<? super C1120430fGL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c14gt;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1120430fGL(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Unit unit;
        C1C7U.LIZ("QuickProductSlot@467f.onCreate$3$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Room room = this.LL.LLJIJIL;
        if (room != null) {
            try {
                C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("room_id", room.getId());
                jSONObject.put("author_id", room.getOwnerUserId());
                jSONObject.put("anchor_id", room.getOwnerUserId());
                if (room.getOwner() != null) {
                    jSONObject.put("follow_status", room.getOwner().followStatus.longValue());
                }
                Hashtag hashtag = room.hashtag;
                if (hashtag != null) {
                    jSONObject.put("hashtag_id", hashtag.id);
                    jSONObject.put("hashtag_type", room.hashtag.title);
                }
                jSONObject.put("EVENT_ORIGIN_FEATURE", "TEMAI");
                c1507790pL7.getClass();
                C1507790pL7.LIZLLL("tiktokec_light_product_add_click", jSONObject);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            unit = Unit.LIZ;
        } else {
            unit = null;
        }
        C1C7U.LIZIZ("QuickProductSlot@467f.onCreate$3$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
