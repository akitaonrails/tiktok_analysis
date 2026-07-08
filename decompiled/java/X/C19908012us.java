package X;

import X.AbstractC19907912ur;
import X.C19908012us;

/* JADX INFO: renamed from: X.12us, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C19908012us<MessageType extends AbstractC19907912ur<MessageType, BuilderType>, BuilderType extends C19908012us<MessageType, BuilderType>> extends AbstractC19900812ti<MessageType, BuilderType> {
    public final AbstractC19907912ur LL;
    public AbstractC19907912ur LLILLJJLI;

    public final MessageType LIZJ() {
        if (!this.LLILLJJLI.LJIIIIZZ()) {
            return (MessageType) this.LLILLJJLI;
        }
        this.LLILLJJLI.LJ();
        return (MessageType) this.LLILLJJLI;
    }

    public final void LIZLLL() {
        if (this.LLILLJJLI.LJIIIIZZ()) {
            return;
        }
        LJ();
    }

    public final void LJ() {
        AbstractC19907912ur abstractC19907912ur = (AbstractC19907912ur) this.LL.LJIIJ(4);
        C19908912v1.LIZJ.LIZ(abstractC19907912ur.getClass()).LIZLLL(abstractC19907912ur, this.LLILLJJLI);
        this.LLILLJJLI = abstractC19907912ur;
    }

    @Override // X.InterfaceC19900612tg
    public final boolean LJIILLIIL() {
        return AbstractC19907912ur.LJIIIZ(this.LLILLJJLI, false);
    }

    public final Object clone() {
        C19908012us c19908012us = (C19908012us) this.LL.LJIIJ(5);
        c19908012us.LLILLJJLI = LIZJ();
        return c19908012us;
    }

    public final MessageType LIZIZ() {
        MessageType messagetype = (MessageType) LIZJ();
        messagetype.getClass();
        if (AbstractC19907912ur.LJIIIZ(messagetype, true)) {
            return messagetype;
        }
        throw new C19901512tp(messagetype);
    }

    public C19908012us(MessageType messagetype) {
        this.LL = messagetype;
        if (!messagetype.LJIIIIZZ()) {
            this.LLILLJJLI = (AbstractC19907912ur) messagetype.LJIIJ(4);
            return;
        }
        throw new IllegalArgumentException("Default instance must be immutable.");
    }
}
