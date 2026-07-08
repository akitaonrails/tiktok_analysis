package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: X.16D7, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C16D7 extends C16DE {
    public int LJII;
    public String LJIIIIZZ;

    public C16D7() {
        super(C16DB.CLOSING);
        this.LJIIIIZZ = "";
        LJIIIIZZ();
        this.LJII = LSPassThroughRecordSizeConfig.DEFAULT;
        LJIIIIZZ();
    }

    @Override // X.C16D8, X.C16DG
    public final ByteBuffer LIZIZ() {
        return this.LJII == 1005 ? ByteBuffer.allocate(0) : this.LIZJ;
    }

    public final void LJIIIIZZ() {
        byte[] bytes = this.LJIIIIZZ.getBytes(StandardCharsets.UTF_8);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.putInt(this.LJII);
        byteBufferAllocate.position(2);
        ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(bytes.length + 2);
        byteBufferAllocate2.put(byteBufferAllocate);
        byteBufferAllocate2.put(bytes);
        byteBufferAllocate2.rewind();
        this.LIZJ = byteBufferAllocate2;
    }

    @Override // X.C16DE, X.C16D8
    public final void LJI() throws C16DI {
        super.LJI();
        if (this.LJII == 1007 && this.LJIIIIZZ.isEmpty()) {
            throw new C16DI(1007, "Received text is no valid utf8 string!");
        }
        if (this.LJII == 1005 && this.LJIIIIZZ.length() > 0) {
            throw new C16DI(1002, "A close frame must have a closecode if it has a reason");
        }
        int i = this.LJII;
        if (i <= 1015) {
            if (i != 1006 && i != 1015 && i != 1005) {
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("closecode must not be sent over the wire: ");
            sbLIZ.append(this.LJII);
            throw new C16DK(C2188811AlT.LIZIZ(sbLIZ));
        }
        if (i < 3000) {
            throw new C16DI(1002, "Trying to send an illegal close code!");
        }
        if (i <= 4999 && i >= 1000 && i != 1004) {
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("closecode must not be sent over the wire: ");
        sbLIZ2.append(this.LJII);
        throw new C16DK(C2188811AlT.LIZIZ(sbLIZ2));
    }

    @Override // X.C16D8
    public final int hashCode() {
        int iHashCode = ((super.hashCode() * 31) + this.LJII) * 31;
        String str = this.LJIIIIZZ;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // X.C16D8
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(super.toString());
        sbLIZ.append("code: ");
        sbLIZ.append(this.LJII);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C16D8
    public final void LJII(ByteBuffer byteBuffer) {
        this.LJII = 1005;
        this.LJIIIIZZ = "";
        byteBuffer.mark();
        if (byteBuffer.remaining() == 0) {
            this.LJII = LSPassThroughRecordSizeConfig.DEFAULT;
            return;
        }
        if (byteBuffer.remaining() == 1) {
            this.LJII = 1002;
            return;
        }
        if (byteBuffer.remaining() >= 2) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
            byteBufferAllocate.position(2);
            byteBufferAllocate.putShort(byteBuffer.getShort());
            byteBufferAllocate.position(0);
            this.LJII = byteBufferAllocate.getInt();
        }
        byteBuffer.reset();
        try {
            int iPosition = byteBuffer.position();
            try {
                try {
                    byteBuffer.position(byteBuffer.position() + 2);
                    this.LJIIIIZZ = C1336120ksE.LIZIZ(byteBuffer);
                    byteBuffer.position(iPosition);
                } catch (IllegalArgumentException e) {
                    TryCatchGuardChecker.doCheck(e);
                    throw new C16DI(1007);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                byteBuffer.position(iPosition);
                throw th;
            }
        } catch (C16DI e2) {
            TryCatchGuardChecker.doCheck(e2);
            this.LJII = 1007;
            this.LJIIIIZZ = null;
        }
    }

    @Override // X.C16D8
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C16D7.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        C16D7 c16d7 = (C16D7) obj;
        if (this.LJII != c16d7.LJII) {
            return false;
        }
        String str = this.LJIIIIZZ;
        String str2 = c16d7.LJIIIIZZ;
        if (str != null) {
            return str.equals(str2);
        }
        if (str2 == null) {
            return true;
        }
        return false;
    }
}
