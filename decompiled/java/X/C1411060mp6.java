package X;

import com.bytedance.android.livesdk.chatroom.api.SMBOptInStep;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0mp6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1411060mp6 extends C09AY implements Function1<SMBOptInStep, CharSequence> {
    public C1411060mp6() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final CharSequence invoke(SMBOptInStep sMBOptInStep) {
        SMBOptInStep sMBOptInStep2 = sMBOptInStep;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(sMBOptInStep2.type);
        sbLIZ.append('=');
        sbLIZ.append(sMBOptInStep2.isCompleted);
        sbLIZ.append('=');
        sbLIZ.append(sMBOptInStep2.isMandatory);
        sbLIZ.append('=');
        sbLIZ.append(sMBOptInStep2.skuId);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
