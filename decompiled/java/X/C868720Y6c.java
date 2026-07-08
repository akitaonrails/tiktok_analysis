package X;

import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.status_message.MultiPushModeChangeValue;
import com.bytedance.im.core.proto.status_message.StatusMessage;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import kotlin.jvm.internal.AwS6S0201100_14;

/* JADX INFO: renamed from: X.0Y6c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C868720Y6c implements InterfaceC868830Y6n {
    public final C0YEM LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public final C0Y82 LIZLLL;
    public final int LJ;
    public final long LJFF;

    @Override // X.InterfaceC868830Y6n
    public final C0Y7K LIZIZ(MessageBody messageBody, StatusMessage statusMessage, int i) {
        AwS6S0201100_14 awS6S0201100_14;
        long jCurrentTimeMillis = System.currentTimeMillis();
        C868780Y6i.LJIILJJIL(this.LIZ.LIZLLL(), "MultiPushModeChangeUpdater", "multi push change push mode", 4);
        try {
            List list = MultiPushModeChangeValue.ADAPTER.decode(statusMessage.value).conversation_ids;
            if (list == null) {
                list = C13BV.INSTANCE;
            }
            if (this.LIZ.LJIIIZ().LJJLIIIIJ.LJIILIIL.isEnabled()) {
                awS6S0201100_14 = new AwS6S0201100_14(this, messageBody, jCurrentTimeMillis, i, 1);
            } else {
                awS6S0201100_14 = null;
            }
            this.LIZ.LJIIZILJ().LIZLLL().LJI().LJIIL(list, EnumC1477205qM.UNKNOWN, awS6S0201100_14);
            this.LIZ.LJIIZILJ().getDomain().LIZJ().LLIIJLIL(0, 12, null, null, false);
            return new C867630Y1x(null);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.LIZ.LIZLLL().LJIIIIZZ("MultiPushModeChangeUpdater", "multi push change push mode", e);
            return new C0Y3A(EnumC868890Y6t.CLIENT_ERROR, e.getMessage(), (Integer) null, 12);
        }
    }

    public C868720Y6c(int i, int i2, long j, C0YEM c0yem, C0Y82 c0y82, String str) {
        this.LIZ = c0yem;
        this.LIZIZ = str;
        this.LIZJ = i;
        this.LIZLLL = c0y82;
        this.LJ = i2;
        this.LJFF = j;
    }
}
