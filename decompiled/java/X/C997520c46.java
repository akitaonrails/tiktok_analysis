package X;

import com.ss.android.ugc.aweme.IAnoleManager;
import com.ss.android.ugc.aweme.api.component.interaction.CommerceInteractionComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0c46, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class C997520c46 extends C2217421BqW implements Function0<Unit> {
    public C997520c46(Object obj) {
        super(0, obj, CommerceInteractionComponent.class, "ttplusPaymentFinish", "ttplusPaymentFinish$commercialize_feed_impl_release()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        IAnoleManager iAnoleManagerRi;
        InterfaceC1008930cMV interfaceC1008930cMVIp = ((CommerceInteractionComponent) this.receiver).ip();
        if (interfaceC1008930cMVIp != null && (iAnoleManagerRi = interfaceC1008930cMVIp.Ri()) != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ttplusLynxPaymentFinish", 1);
            iAnoleManagerRi.LJIIZILJ(new C0SCL(jSONObject));
        }
        return Unit.LIZ;
    }
}
