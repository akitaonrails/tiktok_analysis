package Y;

import X.AbstractC1110800f0o;
import X.C0U3O;
import X.C0U5B;
import X.C0U5E;
import X.C0U5F;
import X.C0UFE;
import X.C1109770ez9;
import X.C1111350f1h;
import X.C1161920gLG;
import X.C207209166l;
import X.C760300Ts4;
import com.bytedance.android.live.effect.bgeffect.BgEffectViewModel;
import com.bytedance.android.live.pin.PinMessageViewModel;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS221S0300000_12;
import kotlin.jvm.internal.AwS47S0500000_12;

/* JADX INFO: loaded from: classes13.dex */
public class AObjectS12S0600000_12 implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS12S0600000_12 aObjectS12S0600000_12, Object obj) {
        C0U3O c0u3o = (C0U3O) obj;
        LiveEffect liveEffect = (LiveEffect) aObjectS12S0600000_12.l0;
        c0u3o.LIZLLL(new AwS221S0300000_12((C0U5F) aObjectS12S0600000_12.l2, (C0U5B) aObjectS12S0600000_12.l1, liveEffect, 8));
        c0u3o.LJFF(new AwS47S0500000_12((LiveEffect) aObjectS12S0600000_12.l0, (C207209166l) aObjectS12S0600000_12.l3, (C0U5B) aObjectS12S0600000_12.l1, (C0U5F) aObjectS12S0600000_12.l2, (BgEffectViewModel) aObjectS12S0600000_12.l4, 1));
        c0u3o.LIZJ(new AwS221S0300000_12((C0U5F) aObjectS12S0600000_12.l2, (C0U5B) aObjectS12S0600000_12.l1, (LiveEffect) aObjectS12S0600000_12.l0, 9));
        c0u3o.LIZIZ(new C0U5E((LiveEffect) aObjectS12S0600000_12.l0, (C0U5B) aObjectS12S0600000_12.l1, (C0U5F) aObjectS12S0600000_12.l2, (DataChannel) aObjectS12S0600000_12.l5));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AObjectS12S0600000_12 aObjectS12S0600000_12, Object obj) {
        C760300Ts4 c760300Ts4 = (C760300Ts4) aObjectS12S0600000_12.l0;
        PinMessageViewModel pinMessageViewModel = (PinMessageViewModel) aObjectS12S0600000_12.l1;
        C1109770ez9 c1109770ez9 = (C1109770ez9) aObjectS12S0600000_12.l2;
        DataChannel dataChannel = (DataChannel) aObjectS12S0600000_12.l3;
        C1111350f1h c1111350f1h = (C1111350f1h) aObjectS12S0600000_12.l4;
        AbstractC1110800f0o abstractC1110800f0o = (AbstractC1110800f0o) aObjectS12S0600000_12.l5;
        c760300Ts4.getClass();
        if (pinMessageViewModel != null && c1109770ez9 != null) {
            C760300Ts4.LIZ(dataChannel, c1109770ez9, pinMessageViewModel, c1111350f1h);
            if (obj != C0UFE.ON) {
                return Unit.LIZ;
            }
            ((IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class)).ol2(c1109770ez9, abstractC1110800f0o.LJIL);
        }
        return Unit.LIZ;
    }

    public AObjectS12S0600000_12(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
        this.l4 = obj5;
        this.l5 = obj6;
    }
}
