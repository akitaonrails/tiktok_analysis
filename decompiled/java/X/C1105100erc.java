package X;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0erc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final /* synthetic */ class C1105100erc extends C2217421BqW implements InterfaceC1631620sYq<InterfaceC1541990qEH, String, Object, Unit> {
    public C1105100erc(C1105110erd c1105110erd) {
        super(3, c1105110erd, C1105110erd.class, "handleSparkEventToLive", "handleSparkEventToLive(Lcom/bytedance/lynx/hybrid/base/IKitView;Ljava/lang/String;Ljava/lang/Object;)V", 0);
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(InterfaceC1541990qEH interfaceC1541990qEH, String str, Object obj) throws JSONException {
        InterfaceC1541990qEH interfaceC1541990qEH2 = interfaceC1541990qEH;
        this.receiver.getClass();
        if (Intrinsics.LJFF(str, "containerMaskTapped")) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("container_id", interfaceC1541990qEH2.getHybridContext().containerId);
            C389001fE.LIZ("container_popupTapSpace", jSONObject, System.currentTimeMillis(), false);
        }
        return Unit.LIZ;
    }
}
