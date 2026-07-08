package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.protobuf.k0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: X.130U, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C130U extends k0 implements InterfaceC19933112yv {
    public static final C130U LLILLL;
    public static final C130W LLILZ;
    public static final long serialVersionUID = 0;
    public byte LLILLJJLI;

    /* JADX WARN: Type inference failed for: r0v2, types: [X.130W] */
    static {
        C19373810qu.LIZ(EnumC19373110qn.PUBLIC, "NestInFileClassFeature");
        LLILLL = new C130U();
        LLILZ = new AbstractC19925812xk<C130U>() { // from class: X.130W
            @Override // X.InterfaceC19925712xj
            public final Object LIZIZ(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) throws C19926612xs {
                C130V c130vNewBuilder = C130U.newBuilder();
                try {
                    c130vNewBuilder.LJIL(abstractC19927312xz, c19926312xp);
                    return c130vNewBuilder.buildPartial();
                } catch (C19918012wU e) {
                    TryCatchGuardChecker.doCheck(e);
                    C19926612xs c19926612xsAsInvalidProtocolBufferException = e.asInvalidProtocolBufferException();
                    c19926612xsAsInvalidProtocolBufferException.setUnfinishedMessage(c130vNewBuilder.buildPartial());
                    throw c19926612xsAsInvalidProtocolBufferException;
                } catch (C19926612xs e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    e2.setUnfinishedMessage(c130vNewBuilder.buildPartial());
                    throw e2;
                } catch (IOException e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    C19926612xs c19926612xs = new C19926612xs(e3);
                    c19926612xs.setUnfinishedMessage(c130vNewBuilder.buildPartial());
                    throw c19926612xs;
                }
            }
        };
    }

    public static C130V newBuilder() {
        return LLILLL.toBuilder();
    }

    @Override // com.google.protobuf.k0
    public final C19935812zM LJI() {
        C19935812zM c19935812zM = AnonymousClass1307.LJ;
        c19935812zM.LIZ(C130U.class, C130V.class);
        return c19935812zM;
    }

    @Override // com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19925612xi
    public int getSerializedSize() {
        int i = this.LL;
        if (i != -1) {
            return i;
        }
        int serializedSize = getUnknownFields().getSerializedSize();
        this.LL = serializedSize;
        return serializedSize;
    }

    @Override // X.AbstractC19932312yn
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((779 + getDescriptor().hashCode()) * 29) + getUnknownFields().hashCode();
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19916512wF
    public final boolean isInitialized() {
        byte b = this.LLILLJJLI;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.LLILLJJLI = (byte) 1;
        return true;
    }

    @Override // com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19925612xi
    public C130V toBuilder() {
        if (this == LLILLL) {
            return new C130V();
        }
        C130V c130v = new C130V();
        c130v.LJIJJLI(this);
        return c130v;
    }

    public C130U() {
        this.LLILLJJLI = (byte) -1;
    }

    public static C130U getDefaultInstance() {
        return LLILLL;
    }

    public static final AnonymousClass1301 getDescriptor() {
        return AnonymousClass1307.LIZLLL;
    }

    public static InterfaceC19925712xj<C130U> parser() {
        return LLILZ;
    }

    @Override // com.google.protobuf.k0, X.InterfaceC19925612xi
    public InterfaceC19925712xj<C130U> getParserForType() {
        return LLILZ;
    }

    @Override // com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19916512wF
    public C130U getDefaultInstanceForType() {
        return LLILLL;
    }

    @Override // com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19925612xi
    public C130V newBuilderForType() {
        return newBuilder();
    }

    public C130U(AbstractC19933512yz abstractC19933512yz) {
        super(abstractC19933512yz);
        this.LLILLJJLI = (byte) -1;
    }

    public static C130V newBuilder(C130U c130u) {
        C130V builder = LLILLL.toBuilder();
        builder.LJIJJLI(c130u);
        return builder;
    }

    public static C130U parseDelimitedFrom(InputStream inputStream) {
        return (C130U) k0.LJIIIIZZ(LLILZ, inputStream);
    }

    public static C130U parseFrom(AbstractC19922812xG abstractC19922812xG) {
        return (C130U) LLILZ.LJFF(abstractC19922812xG);
    }

    @Override // X.AbstractC19932312yn
    public final InterfaceC19931912yj LIZLLL(InterfaceC19935412zI interfaceC19935412zI) {
        return new C130V(interfaceC19935412zI);
    }

    @Override // X.AbstractC19932312yn
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C130U)) {
            return super.equals(obj);
        }
        if (getUnknownFields().equals(((k0) obj).getUnknownFields())) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19925612xi
    public void writeTo(AbstractC19928912yF abstractC19928912yF) {
        getUnknownFields().writeTo(abstractC19928912yF);
    }

    public static C130U parseFrom(AbstractC19927312xz abstractC19927312xz) {
        return (C130U) k0.LJIIJ(LLILZ, abstractC19927312xz);
    }

    public static C130U parseFrom(InputStream inputStream) {
        return (C130U) k0.LJIIL(LLILZ, inputStream);
    }

    public static C130U parseFrom(ByteBuffer byteBuffer) {
        return (C130U) LLILZ.LJIIIZ(byteBuffer);
    }

    public static C130U parseFrom(byte[] bArr) {
        return (C130U) LLILZ.LJIIJJI(bArr);
    }

    public static C130U parseDelimitedFrom(InputStream inputStream, C19926312xp c19926312xp) {
        return (C130U) k0.LJIIIZ(LLILZ, inputStream, c19926312xp);
    }

    public static C130U parseFrom(byte[] bArr, C19926312xp c19926312xp) {
        C130W c130w = LLILZ;
        c130w.getClass();
        InterfaceC19925612xi interfaceC19925612xiLJIILJJIL = c130w.LJIILJJIL(bArr, bArr.length, c19926312xp);
        AbstractC19925812xk.LIZJ(interfaceC19925612xiLJIILJJIL);
        return (C130U) interfaceC19925612xiLJIILJJIL;
    }

    public static C130U parseFrom(AbstractC19922812xG abstractC19922812xG, C19926312xp c19926312xp) {
        return LLILZ.LIZ(abstractC19922812xG, c19926312xp);
    }

    public static C130U parseFrom(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) {
        return (C130U) k0.LJIIJJI(LLILZ, abstractC19927312xz, c19926312xp);
    }

    public static C130U parseFrom(InputStream inputStream, C19926312xp c19926312xp) {
        return (C130U) k0.LJIILIIL(LLILZ, inputStream, c19926312xp);
    }

    public static C130U parseFrom(ByteBuffer byteBuffer, C19926312xp c19926312xp) {
        return LLILZ.LJIIJ(byteBuffer, c19926312xp);
    }
}
