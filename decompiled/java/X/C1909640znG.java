package X;

import com.ss.android.ugc.aweme.im.common.model.ChatUserSetting;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0znG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1909640znG extends C09AY implements Function0<C1909630znF> {
    public C1909640znG() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final C1909630znF invoke() {
        return new InterfaceC315700CZc() { // from class: X.0znF
            @Override // X.InterfaceC315700CZc
            public final void LIZ(int i, int i2, int i3) {
                C1906130zhb.LIZ().LIZ.edit().putString("chat_user_setting", C051M.LJ(new ChatUserSetting(i, i2, i3), false)).apply();
            }

            @Override // X.InterfaceC315700CZc
            public final Object LIZIZ(int i, String str, String str2, String str3, InterfaceC1364105Vn interfaceC1364105Vn) {
                Object objAcknowledgeNoticeRead = C1477105qL.LIZJ().acknowledgeNoticeRead(str, str2, i, str3, null, interfaceC1364105Vn);
                if (objAcknowledgeNoticeRead == C099R.LJFF()) {
                    return objAcknowledgeNoticeRead;
                }
                return Unit.LIZ;
            }
        };
    }
}
