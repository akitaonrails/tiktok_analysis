package X;

import X.AbstractC19899612tW;
import X.AbstractC19899712tX;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;

/* JADX INFO: renamed from: X.12tX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC19899712tX<MessageType extends AbstractC19899612tW<MessageType, BuilderType>, BuilderType extends AbstractC19899712tX<MessageType, BuilderType>> extends AbstractC19899812tY<MessageType, BuilderType> {
    public final MessageType LL;
    public MessageType LLILLJJLI;

    @Override // X.InterfaceC19900412te
    public final boolean LJIIIIZZ() {
        return AbstractC19899612tW.LJIJ(this.LLILLJJLI, false);
    }

    public final AbstractC19899612tW LJIIIZ() {
        if (!this.LLILLJJLI.LJJ()) {
            return this.LLILLJJLI;
        }
        this.LLILLJJLI.LJIJJLI();
        return this.LLILLJJLI;
    }

    public final void LJIIJ() {
        if (this.LLILLJJLI.LJJ()) {
            return;
        }
        MessageType messagetype = (MessageType) this.LL.LJIILL(4);
        MessageType messagetype2 = this.LLILLJJLI;
        C19902512tz c19902512tz = C19902512tz.LIZJ;
        c19902512tz.getClass();
        c19902512tz.LIZ(messagetype.getClass()).LJI(messagetype, messagetype2);
        this.LLILLJJLI = messagetype;
    }

    public final /* synthetic */ Object clone() {
        AbstractC19899712tX abstractC19899712tX = (AbstractC19899712tX) this.LL.LJIILL(5);
        abstractC19899712tX.LLILLJJLI = (MessageType) LJIIIZ();
        return abstractC19899712tX;
    }

    public final AbstractC19899612tW LJI() {
        final AbstractC19899612tW abstractC19899612tWLJIIIZ = LJIIIZ();
        abstractC19899612tWLJIIIZ.getClass();
        if (AbstractC19899612tW.LJIJ(abstractC19899612tWLJIIIZ, true)) {
            return abstractC19899612tWLJIIIZ;
        }
        throw new RuntimeException(abstractC19899612tWLJIIIZ) { // from class: X.12tZ
            {
                super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
            }
        };
    }

    public AbstractC19899712tX(MessageType messagetype) {
        this.LL = messagetype;
        if (!messagetype.LJJ()) {
            this.LLILLJJLI = (MessageType) messagetype.LJIILL(4);
            return;
        }
        throw new IllegalArgumentException("Default instance must be immutable.");
    }

    public final BuilderType LJFF(MessageType messagetype) {
        if (this.LL.equals(messagetype)) {
            return this;
        }
        if (!this.LLILLJJLI.LJJ()) {
            MessageType messagetype2 = (MessageType) this.LL.LJIILL(4);
            MessageType messagetype3 = this.LLILLJJLI;
            C19902512tz c19902512tz = C19902512tz.LIZJ;
            c19902512tz.getClass();
            c19902512tz.LIZ(messagetype2.getClass()).LJI(messagetype2, messagetype3);
            this.LLILLJJLI = messagetype2;
        }
        MessageType messagetype4 = this.LLILLJJLI;
        C19902512tz c19902512tz2 = C19902512tz.LIZJ;
        c19902512tz2.getClass();
        c19902512tz2.LIZ(messagetype4.getClass()).LJI(messagetype4, messagetype);
        return this;
    }

    public final void LJIIJJI(byte[] bArr, int i, C19853712m7 c19853712m7) throws C19903212u6 {
        if (!this.LLILLJJLI.LJJ()) {
            MessageType messagetype = (MessageType) this.LL.LJIILL(4);
            MessageType messagetype2 = this.LLILLJJLI;
            C19902512tz c19902512tz = C19902512tz.LIZJ;
            c19902512tz.getClass();
            c19902512tz.LIZ(messagetype.getClass()).LJI(messagetype, messagetype2);
            this.LLILLJJLI = messagetype;
        }
        try {
            C19902512tz c19902512tz2 = C19902512tz.LIZJ;
            MessageType messagetype3 = this.LLILLJJLI;
            c19902512tz2.getClass();
            c19902512tz2.LIZ(messagetype3.getClass()).LJFF(this.LLILLJJLI, bArr, 0, i, new C19903812uC(c19853712m7));
        } catch (C19903212u6 e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (IOException e2) {
            TryCatchGuardChecker.doCheck(e2);
            throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
        } catch (IndexOutOfBoundsException e3) {
            TryCatchGuardChecker.doCheck(e3);
            throw C19903212u6.LIZLLL();
        }
    }
}
