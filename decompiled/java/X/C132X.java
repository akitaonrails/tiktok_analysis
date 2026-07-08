package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.protobuf.k0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: X.132X, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C132X extends k0 implements InterfaceC199408130k {
    public static final C132X LLILZ;
    public static final C199455132f LLILZIL;
    public static final long serialVersionUID = 0;
    public int LLILLJJLI;
    public byte LLILLL;
    public int end_;
    public int start_;

    /* JADX WARN: Type inference failed for: r0v2, types: [X.132f] */
    static {
        C19373810qu.LIZ(EnumC19373110qn.PUBLIC, "ReservedRange");
        LLILZ = new C132X();
        LLILZIL = new AbstractC19925812xk<C132X>() { // from class: X.132f
            @Override // X.InterfaceC19925712xj
            public final Object LIZIZ(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) throws C19926612xs {
                C199452132c c199452132cNewBuilder = C132X.newBuilder();
                try {
                    c199452132cNewBuilder.LJIJJLI(abstractC19927312xz, c19926312xp);
                    return c199452132cNewBuilder.buildPartial();
                } catch (C19918012wU e) {
                    TryCatchGuardChecker.doCheck(e);
                    C19926612xs c19926612xsAsInvalidProtocolBufferException = e.asInvalidProtocolBufferException();
                    c19926612xsAsInvalidProtocolBufferException.setUnfinishedMessage(c199452132cNewBuilder.buildPartial());
                    throw c19926612xsAsInvalidProtocolBufferException;
                } catch (C19926612xs e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    e2.setUnfinishedMessage(c199452132cNewBuilder.buildPartial());
                    throw e2;
                } catch (IOException e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    C19926612xs c19926612xs = new C19926612xs(e3);
                    c19926612xs.setUnfinishedMessage(c199452132cNewBuilder.buildPartial());
                    throw c19926612xs;
                }
            }
        };
    }

    public static C199452132c newBuilder() {
        return LLILZ.toBuilder();
    }

    @Override // com.google.protobuf.k0
    public final C19935812zM LJI() {
        C19935812zM c19935812zM = C131K.LJII;
        c19935812zM.LIZ(C132X.class, C199452132c.class);
        return c19935812zM;
    }

    @Override // com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19925612xi
    public int getSerializedSize() {
        int i = this.LL;
        if (i != -1) {
            return i;
        }
        int iLJFF = (this.LLILLJJLI & 1) != 0 ? 0 + AbstractC19928912yF.LJFF(1, this.start_) : 0;
        if ((this.LLILLJJLI & 2) != 0) {
            iLJFF += AbstractC19928912yF.LJFF(2, this.end_);
        }
        int serializedSize = iLJFF + getUnknownFields().getSerializedSize();
        this.LL = serializedSize;
        return serializedSize;
    }

    public boolean hasEnd() {
        return (this.LLILLJJLI & 2) != 0;
    }

    public boolean hasStart() {
        return (this.LLILLJJLI & 1) != 0;
    }

    @Override // X.AbstractC19932312yn
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = 779 + getDescriptor().hashCode();
        if (hasStart()) {
            iHashCode = (((iHashCode * 37) + 1) * 53) + getStart();
        }
        if (hasEnd()) {
            iHashCode = (((iHashCode * 37) + 2) * 53) + getEnd();
        }
        int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19916512wF
    public final boolean isInitialized() {
        byte b = this.LLILLL;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.LLILLL = (byte) 1;
        return true;
    }

    @Override // com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19925612xi
    public C199452132c toBuilder() {
        if (this == LLILZ) {
            return new C199452132c();
        }
        C199452132c c199452132c = new C199452132c();
        c199452132c.LJIL(this);
        return c199452132c;
    }

    public C132X() {
        this.LLILLL = (byte) -1;
    }

    public static C132X getDefaultInstance() {
        return LLILZ;
    }

    public static final AnonymousClass1301 getDescriptor() {
        return C131K.LJI;
    }

    public static InterfaceC19925712xj<C132X> parser() {
        return LLILZIL;
    }

    public int getEnd() {
        return this.end_;
    }

    @Override // com.google.protobuf.k0, X.InterfaceC19925612xi
    public InterfaceC19925712xj<C132X> getParserForType() {
        return LLILZIL;
    }

    public int getStart() {
        return this.start_;
    }

    @Override // com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19916512wF
    public C132X getDefaultInstanceForType() {
        return LLILZ;
    }

    @Override // com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19925612xi
    public C199452132c newBuilderForType() {
        return newBuilder();
    }

    public C132X(AbstractC19933512yz abstractC19933512yz) {
        super(abstractC19933512yz);
        this.LLILLL = (byte) -1;
    }

    public static C199452132c newBuilder(C132X c132x) {
        C199452132c builder = LLILZ.toBuilder();
        builder.LJIL(c132x);
        return builder;
    }

    public static C132X parseDelimitedFrom(InputStream inputStream) {
        return (C132X) k0.LJIIIIZZ(LLILZIL, inputStream);
    }

    public static C132X parseFrom(AbstractC19922812xG abstractC19922812xG) {
        return (C132X) LLILZIL.LJFF(abstractC19922812xG);
    }

    @Override // X.AbstractC19932312yn
    public final InterfaceC19931912yj LIZLLL(InterfaceC19935412zI interfaceC19935412zI) {
        return new C199452132c(interfaceC19935412zI);
    }

    @Override // X.AbstractC19932312yn
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C132X)) {
            return super.equals(obj);
        }
        C132X c132x = (C132X) obj;
        if (hasStart() != c132x.hasStart()) {
            return false;
        }
        if ((hasStart() && getStart() != c132x.getStart()) || hasEnd() != c132x.hasEnd()) {
            return false;
        }
        if ((!hasEnd() || getEnd() == c132x.getEnd()) && getUnknownFields().equals(c132x.getUnknownFields())) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19925612xi
    public void writeTo(AbstractC19928912yF abstractC19928912yF) {
        if ((this.LLILLJJLI & 1) != 0) {
            abstractC19928912yF.LJJII(1, this.start_);
        }
        if ((this.LLILLJJLI & 2) != 0) {
            abstractC19928912yF.LJJII(2, this.end_);
        }
        getUnknownFields().writeTo(abstractC19928912yF);
    }

    public static C132X parseFrom(AbstractC19927312xz abstractC19927312xz) {
        return (C132X) k0.LJIIJ(LLILZIL, abstractC19927312xz);
    }

    public static C132X parseFrom(InputStream inputStream) {
        return (C132X) k0.LJIIL(LLILZIL, inputStream);
    }

    public static C132X parseFrom(ByteBuffer byteBuffer) {
        return (C132X) LLILZIL.LJIIIZ(byteBuffer);
    }

    public static C132X parseFrom(byte[] bArr) {
        return (C132X) LLILZIL.LJIIJJI(bArr);
    }

    public static C132X parseDelimitedFrom(InputStream inputStream, C19926312xp c19926312xp) {
        return (C132X) k0.LJIIIZ(LLILZIL, inputStream, c19926312xp);
    }

    public static C132X parseFrom(byte[] bArr, C19926312xp c19926312xp) {
        C199455132f c199455132f = LLILZIL;
        c199455132f.getClass();
        InterfaceC19925612xi interfaceC19925612xiLJIILJJIL = c199455132f.LJIILJJIL(bArr, bArr.length, c19926312xp);
        AbstractC19925812xk.LIZJ(interfaceC19925612xiLJIILJJIL);
        return (C132X) interfaceC19925612xiLJIILJJIL;
    }

    public static C132X parseFrom(AbstractC19922812xG abstractC19922812xG, C19926312xp c19926312xp) {
        return LLILZIL.LIZ(abstractC19922812xG, c19926312xp);
    }

    public static C132X parseFrom(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) {
        return (C132X) k0.LJIIJJI(LLILZIL, abstractC19927312xz, c19926312xp);
    }

    public static C132X parseFrom(InputStream inputStream, C19926312xp c19926312xp) {
        return (C132X) k0.LJIILIIL(LLILZIL, inputStream, c19926312xp);
    }

    public static C132X parseFrom(ByteBuffer byteBuffer, C19926312xp c19926312xp) {
        return LLILZIL.LJIIJ(byteBuffer, c19926312xp);
    }
}
