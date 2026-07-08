package X;

import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.status_message.ModeChangeEntity;
import com.bytedance.im.core.proto.status_message.StatusMessage;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.AwS6S0201100_14;

/* JADX INFO: renamed from: X.0Y5s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C868620Y5s implements InterfaceC868830Y6n {
    public final C0YEM LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final C0Y82 LIZLLL;
    public final int LJ;
    public final long LJFF;

    @Override // X.InterfaceC868830Y6n
    public final C0Y7K LIZIZ(MessageBody messageBody, StatusMessage statusMessage, int i) throws Throwable {
        long jLongValue;
        AwS6S0201100_14 awS6S0201100_14;
        C868780Y6i.LJIILJJIL(this.LIZ.LIZLLL(), "ConvModeUpdater", "change push mode", 4);
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            Long l = ModeChangeEntity.ADAPTER.decode(statusMessage.entity).conversation_short_id;
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            C0Y8T c0y8tLJIJ = this.LIZ.LJIIZILJ().LIZIZ().LIZIZ().LJIIJJI().LJIJ(jLongValue, false);
            if (c0y8tLJIJ == null) {
                C868780Y6i.LJIILJJIL(this.LIZ.LIZLLL(), "ConvModeUpdater", "conversation not found, skip", 4);
                return new C0Y3A(EnumC868890Y6t.ENTITY_MISSING, "Conversation not found, skip", (Integer) null, 12);
            }
            if (this.LIZ.LJIIIZ().LJJLIIIIJ.LJIILIIL.isEnabled()) {
                awS6S0201100_14 = new AwS6S0201100_14(this, messageBody, jCurrentTimeMillis, i, 0);
            } else {
                awS6S0201100_14 = null;
            }
            this.LIZ.LJIIZILJ().LIZLLL().LJI().LJIILJJIL(i, c0y8tLJIJ, awS6S0201100_14);
            this.LIZ.LJIIZILJ().getDomain().LIZJ().LLIIJLIL(i, 12, null, null, false);
            return new C867630Y1x(null);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.LIZ.LIZLLL().LJIIIIZZ("ConvModeUpdater", "change push mode", e);
            return new C0Y3A(EnumC868890Y6t.CLIENT_ERROR, e.getMessage(), (Integer) null, 12);
        }
    }

    public C868620Y5s(int i, int i2, long j, C0YEM c0yem, C0Y82 c0y82, String str) {
        this.LIZ = c0yem;
        this.LIZIZ = i;
        this.LIZJ = str;
        this.LIZLLL = c0y82;
        this.LJ = i2;
        this.LJFF = j;
    }
}
