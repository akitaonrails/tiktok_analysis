package X;

import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.livepin.GameLivePartnershipPinCard;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.livepin.GameLivePartnershipPinCardModel;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0z3I, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1881140z3I extends C09AY implements Function1<InterfaceC1883030z6L, Unit> {
    public final /* synthetic */ JSONObject LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1881140z3I(JSONObject jSONObject) {
        super(1);
        this.LL = jSONObject;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC1883030z6L interfaceC1883030z6L) throws JSONException {
        GameLivePartnershipPinCardModel gameLivePartnershipPinCardModel;
        Integer num;
        InterfaceC1541990qEH kitView;
        InterfaceC1883030z6L interfaceC1883030z6L2 = interfaceC1883030z6L;
        if (interfaceC1883030z6L2 instanceof GameLivePartnershipPinCard) {
            GameLivePartnershipPinCard gameLivePartnershipPinCard = (GameLivePartnershipPinCard) interfaceC1883030z6L2;
            JSONObject jSONObject = this.LL;
            if (gameLivePartnershipPinCard.LLJILJILJ == 2 && (gameLivePartnershipPinCardModel = (GameLivePartnershipPinCardModel) gameLivePartnershipPinCard.LLILZIL) != null && (num = gameLivePartnershipPinCardModel.pinCardType) != null) {
                int iIntValue = num.intValue();
                JSONObject jSONObjectLJJJJZI = gameLivePartnershipPinCard.LJJJJZI();
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    jSONObjectLJJJJZI.put(next, jSONObject.get(next));
                }
                SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLJJJJZ = gameLivePartnershipPinCard.LJJJJZ(iIntValue);
                if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLJJJJZ != null && (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLJJJJZ.getKitView()) != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("{\"initial_data\":");
                    sbLIZ.append(jSONObjectLJJJJZI);
                    sbLIZ.append('}');
                    kitView.d1(C2188811AlT.LIZIZ(sbLIZ));
                }
            }
        }
        return Unit.LIZ;
    }
}
