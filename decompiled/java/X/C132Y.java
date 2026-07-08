package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.protobuf.k0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: X.132Y, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C132Y extends k0 implements C131G {
    public static final C132Y LLILZ;
    public static final C199456132g LLILZIL;
    public static final long serialVersionUID = 0;
    public int LLILLJJLI;
    public byte LLILLL;
    public int end_;
    public int start_;

    /* JADX WARN: Type inference failed for: r0v2, types: [X.132g] */
    static {
        C19373810qu.LIZ(EnumC19373110qn.PUBLIC, "EnumReservedRange");
        LLILZ = new C132Y();
        LLILZIL = new AbstractC19925812xk<C132Y>() { // from class: X.132g
            @Override // X.InterfaceC19925712xj
            public final Object LIZIZ(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) throws C19926612xs {
                C199453132d c199453132dNewBuilder = C132Y.newBuilder();
                try {
                    c199453132dNewBuilder.LJIJJLI(abstractC19927312xz, c19926312xp);
                    return c199453132dNewBuilder.buildPartial();
                } catch (C19918012wU e) {
                    TryCatchGuardChecker.doCheck(e);
                    C19926612xs c19926612xsAsInvalidProtocolBufferException = e.asInvalidProtocolBufferException();
                    c19926612xsAsInvalidProtocolBufferException.setUnfinishedMessage(c199453132dNewBuilder.buildPartial());
                    throw c19926612xsAsInvalidProtocolBufferException;
                } catch (C19926612xs e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    e2.setUnfinishedMessage(c199453132dNewBuilder.buildPartial());
                    throw e2;
                } catch (IOException e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    C19926612xs c19926612xs = new C19926612xs(e3);
                    c19926612xs.setUnfinishedMessage(c199453132dNewBuilder.buildPartial());
                    throw c19926612xs;
                }
            }
        };
    }

    public static C199453132d newBuilder() {
        return LLILZ.toBuilder();
    }

    @Override // com.google.protobuf.k0
    public final C19935812zM LJI() {
        C19935812zM c19935812zM = C131K.LJIJI;
        c19935812zM.LIZ(C132Y.class, C199453132d.class);
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
    public C199453132d toBuilder() {
        if (this == LLILZ) {
            return new C199453132d();
        }
        C199453132d c199453132d = new C199453132d();
        c199453132d.LJIL(this);
        return c199453132d;
    }

    public C132Y() {
        this.LLILLL = (byte) -1;
    }

    public static C132Y getDefaultInstance() {
        return LLILZ;
    }

    public static final AnonymousClass1301 getDescriptor() {
        return C131K.LJIJ;
    }

    public static InterfaceC19925712xj<C132Y> parser() {
        return LLILZIL;
    }

    public int getEnd() {
        return this.end_;
    }

    @Override // com.google.protobuf.k0, X.InterfaceC19925612xi
    public InterfaceC19925712xj<C132Y> getParserForType() {
        return LLILZIL;
    }

    public int getStart() {
        return this.start_;
    }

    @Override // com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19916512wF
    public C132Y getDefaultInstanceForType() {
        return LLILZ;
    }

    @Override // com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19925612xi
    public C199453132d newBuilderForType() {
        return newBuilder();
    }

    public C132Y(AbstractC19933512yz abstractC19933512yz) {
        super(abstractC19933512yz);
        this.LLILLL = (byte) -1;
    }

    public static C199453132d newBuilder(C132Y c132y) {
        C199453132d builder = LLILZ.toBuilder();
        builder.LJIL(c132y);
        return builder;
    }

    public static C132Y parseDelimitedFrom(InputStream inputStream) {
        return (C132Y) k0.LJIIIIZZ(LLILZIL, inputStream);
    }

    public static C132Y parseFrom(AbstractC19922812xG abstractC19922812xG) {
        return (C132Y) LLILZIL.LJFF(abstractC19922812xG);
    }

    @Override // X.AbstractC19932312yn
    public final InterfaceC19931912yj LIZLLL(InterfaceC19935412zI interfaceC19935412zI) {
        return new C199453132d(interfaceC19935412zI);
    }

    @Override // X.AbstractC19932312yn
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C132Y)) {
            return super.equals(obj);
        }
        C132Y c132y = (C132Y) obj;
        if (hasStart() != c132y.hasStart()) {
            return false;
        }
        if ((hasStart() && getStart() != c132y.getStart()) || hasEnd() != c132y.hasEnd()) {
            return false;
        }
        if ((!hasEnd() || getEnd() == c132y.getEnd()) && getUnknownFields().equals(c132y.getUnknownFields())) {
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

    public static C132Y parseFrom(AbstractC19927312xz abstractC19927312xz) {
        return (C132Y) k0.LJIIJ(LLILZIL, abstractC19927312xz);
    }

    public static C132Y parseFrom(InputStream inputStream) {
        return (C132Y) k0.LJIIL(LLILZIL, inputStream);
    }

    public static C132Y parseFrom(ByteBuffer byteBuffer) {
        return (C132Y) LLILZIL.LJIIIZ(byteBuffer);
    }

    public static C132Y parseFrom(byte[] bArr) {
        return (C132Y) LLILZIL.LJIIJJI(bArr);
    }

    public static C132Y parseDelimitedFrom(InputStream inputStream, C19926312xp c19926312xp) {
        return (C132Y) k0.LJIIIZ(LLILZIL, inputStream, c19926312xp);
    }

    public static C132Y parseFrom(byte[] bArr, C19926312xp c19926312xp) {
        C199456132g c199456132g = LLILZIL;
        c199456132g.getClass();
        InterfaceC19925612xi interfaceC19925612xiLJIILJJIL = c199456132g.LJIILJJIL(bArr, bArr.length, c19926312xp);
        AbstractC19925812xk.LIZJ(interfaceC19925612xiLJIILJJIL);
        return (C132Y) interfaceC19925612xiLJIILJJIL;
    }

    public static C132Y parseFrom(AbstractC19922812xG abstractC19922812xG, C19926312xp c19926312xp) {
        return LLILZIL.LIZ(abstractC19922812xG, c19926312xp);
    }

    public static C132Y parseFrom(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) {
        return (C132Y) k0.LJIIJJI(LLILZIL, abstractC19927312xz, c19926312xp);
    }

    public static C132Y parseFrom(InputStream inputStream, C19926312xp c19926312xp) {
        return (C132Y) k0.LJIILIIL(LLILZIL, inputStream, c19926312xp);
    }

    public static C132Y parseFrom(ByteBuffer byteBuffer, C19926312xp c19926312xp) {
        return LLILZIL.LJIIJ(byteBuffer, c19926312xp);
    }
}
