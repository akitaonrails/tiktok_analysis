package X;

import X.InterfaceC19925612xi;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: X.12xk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC19925812xk<MessageType extends InterfaceC19925612xi> implements InterfaceC19925712xj<MessageType> {
    public static final C19926312xp LIZ = C19926312xp.LIZ();

    public static void LIZJ(InterfaceC19925612xi interfaceC19925612xi) {
        C19918012wU c19918012wU;
        if (interfaceC19925612xi != null && !interfaceC19925612xi.isInitialized()) {
            if (interfaceC19925612xi instanceof AbstractC19924812xa) {
                c19918012wU = ((AbstractC19924812xa) interfaceC19925612xi).newUninitializedMessageException();
            } else {
                c19918012wU = new C19918012wU(interfaceC19925612xi);
            }
            C19926612xs c19926612xsAsInvalidProtocolBufferException = c19918012wU.asInvalidProtocolBufferException();
            c19926612xsAsInvalidProtocolBufferException.setUnfinishedMessage(interfaceC19925612xi);
            throw c19926612xsAsInvalidProtocolBufferException;
        }
    }

    public final InterfaceC19925612xi LIZLLL(InputStream inputStream) {
        return LJ(inputStream, LIZ);
    }

    public final InterfaceC19925612xi LJFF(AbstractC19922812xG abstractC19922812xG) {
        return LIZ(abstractC19922812xG, LIZ);
    }

    public final InterfaceC19925612xi LJII(AbstractC19927312xz abstractC19927312xz) {
        MessageType messagetypeLIZIZ = LIZIZ(abstractC19927312xz, LIZ);
        LIZJ(messagetypeLIZIZ);
        return messagetypeLIZIZ;
    }

    public final InterfaceC19925612xi LJIIIIZZ(InputStream inputStream) throws C19926612xs {
        C19926312xp c19926312xp = LIZ;
        AbstractC19927312xz abstractC19927312xzLJIIIZ = AbstractC19927312xz.LJIIIZ(inputStream);
        MessageType messagetypeLIZIZ = LIZIZ(abstractC19927312xzLJIIIZ, c19926312xp);
        try {
            abstractC19927312xzLJIIIZ.LIZ(0);
            LIZJ(messagetypeLIZIZ);
            return messagetypeLIZIZ;
        } catch (C19926612xs e) {
            TryCatchGuardChecker.doCheck(e);
            e.setUnfinishedMessage(messagetypeLIZIZ);
            throw e;
        }
    }

    public final InterfaceC19925612xi LJIIIZ(ByteBuffer byteBuffer) {
        return LJIIJ(byteBuffer, LIZ);
    }

    public final InterfaceC19925612xi LJIIJJI(byte[] bArr) {
        InterfaceC19925612xi interfaceC19925612xiLJIILJJIL = LJIILJJIL(bArr, bArr.length, LIZ);
        LIZJ(interfaceC19925612xiLJIILJJIL);
        return interfaceC19925612xiLJIILJJIL;
    }

    public final MessageType LJ(InputStream inputStream, C19926312xp c19926312xp) throws C19926612xs {
        MessageType messagetypeLIZIZ;
        try {
            int i = inputStream.read();
            if (i != -1) {
                AbstractC19927312xz abstractC19927312xzLJIIIZ = AbstractC19927312xz.LJIIIZ(new C133M(inputStream, AbstractC19927312xz.LJJIIJ(inputStream, i)));
                messagetypeLIZIZ = LIZIZ(abstractC19927312xzLJIIIZ, c19926312xp);
                try {
                    abstractC19927312xzLJIIIZ.LIZ(0);
                } catch (C19926612xs e) {
                    TryCatchGuardChecker.doCheck(e);
                    e.setUnfinishedMessage(messagetypeLIZIZ);
                    throw e;
                }
            } else {
                messagetypeLIZIZ = null;
            }
            LIZJ(messagetypeLIZIZ);
            return messagetypeLIZIZ;
        } catch (IOException e2) {
            TryCatchGuardChecker.doCheck(e2);
            throw new C19926612xs(e2);
        }
    }

    @Override // X.InterfaceC19925712xj
    /* JADX INFO: renamed from: LJI, reason: merged with bridge method [inline-methods] */
    public final MessageType LIZ(AbstractC19922812xG abstractC19922812xG, C19926312xp c19926312xp) throws C19926612xs {
        try {
            AbstractC19927312xz abstractC19927312xzNewCodedInput = abstractC19922812xG.newCodedInput();
            MessageType messagetypeLIZIZ = LIZIZ(abstractC19927312xzNewCodedInput, c19926312xp);
            try {
                abstractC19927312xzNewCodedInput.LIZ(0);
                LIZJ(messagetypeLIZIZ);
                return messagetypeLIZIZ;
            } catch (C19926612xs e) {
                TryCatchGuardChecker.doCheck(e);
                e.setUnfinishedMessage(messagetypeLIZIZ);
                throw e;
            }
        } catch (C19926612xs e2) {
            TryCatchGuardChecker.doCheck(e2);
            throw e2;
        }
    }

    public final MessageType LJIIJ(ByteBuffer byteBuffer, C19926312xp c19926312xp) throws C19926612xs {
        try {
            AbstractC19927312xz abstractC19927312xzLJIIJ = AbstractC19927312xz.LJIIJ(byteBuffer, false);
            MessageType messagetypeLIZIZ = LIZIZ(abstractC19927312xzLJIIJ, c19926312xp);
            try {
                abstractC19927312xzLJIIJ.LIZ(0);
                LIZJ(messagetypeLIZIZ);
                return messagetypeLIZIZ;
            } catch (C19926612xs e) {
                TryCatchGuardChecker.doCheck(e);
                e.setUnfinishedMessage(messagetypeLIZIZ);
                throw e;
            }
        } catch (C19926612xs e2) {
            TryCatchGuardChecker.doCheck(e2);
            throw e2;
        }
    }

    public final InterfaceC19925612xi LJIIL(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) {
        MessageType messagetypeLIZIZ = LIZIZ(abstractC19927312xz, c19926312xp);
        LIZJ(messagetypeLIZIZ);
        return messagetypeLIZIZ;
    }

    public final InterfaceC19925612xi LJIILIIL(InputStream inputStream, C19926312xp c19926312xp) throws C19926612xs {
        AbstractC19927312xz abstractC19927312xzLJIIIZ = AbstractC19927312xz.LJIIIZ(inputStream);
        MessageType messagetypeLIZIZ = LIZIZ(abstractC19927312xzLJIIIZ, c19926312xp);
        try {
            abstractC19927312xzLJIIIZ.LIZ(0);
            LIZJ(messagetypeLIZIZ);
            return messagetypeLIZIZ;
        } catch (C19926612xs e) {
            TryCatchGuardChecker.doCheck(e);
            e.setUnfinishedMessage(messagetypeLIZIZ);
            throw e;
        }
    }

    public InterfaceC19925612xi LJIILJJIL(byte[] bArr, int i, C19926312xp c19926312xp) {
        try {
            C19927212xy c19927212xyLJIIIIZZ = AbstractC19927312xz.LJIIIIZZ(bArr, 0, i, false);
            MessageType messagetypeLIZIZ = LIZIZ(c19927212xyLJIIIIZZ, c19926312xp);
            try {
                c19927212xyLJIIIIZZ.LIZ(0);
                return messagetypeLIZIZ;
            } catch (C19926612xs e) {
                TryCatchGuardChecker.doCheck(e);
                e.setUnfinishedMessage(messagetypeLIZIZ);
                throw e;
            }
        } catch (C19926612xs e2) {
            TryCatchGuardChecker.doCheck(e2);
            throw e2;
        }
    }
}
