package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.protobuf.k0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: X.132Z, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C132Z extends k0 implements InterfaceC19933112yv {
    public static final C132Z LLILLL;
    public static final C199462132m LLILZ;
    public static final long serialVersionUID = 0;
    public byte LLILLJJLI;

    /* JADX WARN: Type inference failed for: r0v2, types: [X.132m] */
    static {
        C19373810qu.LIZ(EnumC19373110qn.PUBLIC, "VisibilityFeature");
        LLILLL = new C132Z();
        LLILZ = new AbstractC19925812xk<C132Z>() { // from class: X.132m
            @Override // X.InterfaceC19925712xj
            public final Object LIZIZ(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) throws C19926612xs {
                C199454132e c199454132eNewBuilder = C132Z.newBuilder();
                try {
                    c199454132eNewBuilder.LJIL(abstractC19927312xz, c19926312xp);
                    return c199454132eNewBuilder.buildPartial();
                } catch (C19918012wU e) {
                    TryCatchGuardChecker.doCheck(e);
                    C19926612xs c19926612xsAsInvalidProtocolBufferException = e.asInvalidProtocolBufferException();
                    c19926612xsAsInvalidProtocolBufferException.setUnfinishedMessage(c199454132eNewBuilder.buildPartial());
                    throw c19926612xsAsInvalidProtocolBufferException;
                } catch (C19926612xs e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    e2.setUnfinishedMessage(c199454132eNewBuilder.buildPartial());
                    throw e2;
                } catch (IOException e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    C19926612xs c19926612xs = new C19926612xs(e3);
                    c19926612xs.setUnfinishedMessage(c199454132eNewBuilder.buildPartial());
                    throw c19926612xs;
                }
            }
        };
    }

    public static C199454132e newBuilder() {
        return LLILLL.toBuilder();
    }

    @Override // com.google.protobuf.k0
    public final C19935812zM LJI() {
        C19935812zM c19935812zM = C131K.LJJJLIIL;
        c19935812zM.LIZ(C132Z.class, C199454132e.class);
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
    public C199454132e toBuilder() {
        if (this == LLILLL) {
            return new C199454132e();
        }
        C199454132e c199454132e = new C199454132e();
        c199454132e.LJIJJLI(this);
        return c199454132e;
    }

    public C132Z() {
        this.LLILLJJLI = (byte) -1;
    }

    public static C132Z getDefaultInstance() {
        return LLILLL;
    }

    public static final AnonymousClass1301 getDescriptor() {
        return C131K.LJJJJZI;
    }

    public static InterfaceC19925712xj<C132Z> parser() {
        return LLILZ;
    }

    @Override // com.google.protobuf.k0, X.InterfaceC19925612xi
    public InterfaceC19925712xj<C132Z> getParserForType() {
        return LLILZ;
    }

    @Override // com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19916512wF
    public C132Z getDefaultInstanceForType() {
        return LLILLL;
    }

    @Override // com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19925612xi
    public C199454132e newBuilderForType() {
        return newBuilder();
    }

    public C132Z(AbstractC19933512yz abstractC19933512yz) {
        super(abstractC19933512yz);
        this.LLILLJJLI = (byte) -1;
    }

    public static C199454132e newBuilder(C132Z c132z) {
        C199454132e builder = LLILLL.toBuilder();
        builder.LJIJJLI(c132z);
        return builder;
    }

    public static C132Z parseDelimitedFrom(InputStream inputStream) {
        return (C132Z) k0.LJIIIIZZ(LLILZ, inputStream);
    }

    public static C132Z parseFrom(AbstractC19922812xG abstractC19922812xG) {
        return (C132Z) LLILZ.LJFF(abstractC19922812xG);
    }

    @Override // X.AbstractC19932312yn
    public final InterfaceC19931912yj LIZLLL(InterfaceC19935412zI interfaceC19935412zI) {
        return new C199454132e(interfaceC19935412zI);
    }

    @Override // X.AbstractC19932312yn
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C132Z)) {
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

    public static C132Z parseFrom(AbstractC19927312xz abstractC19927312xz) {
        return (C132Z) k0.LJIIJ(LLILZ, abstractC19927312xz);
    }

    public static C132Z parseFrom(InputStream inputStream) {
        return (C132Z) k0.LJIIL(LLILZ, inputStream);
    }

    public static C132Z parseFrom(ByteBuffer byteBuffer) {
        return (C132Z) LLILZ.LJIIIZ(byteBuffer);
    }

    public static C132Z parseFrom(byte[] bArr) {
        return (C132Z) LLILZ.LJIIJJI(bArr);
    }

    public static C132Z parseDelimitedFrom(InputStream inputStream, C19926312xp c19926312xp) {
        return (C132Z) k0.LJIIIZ(LLILZ, inputStream, c19926312xp);
    }

    public static C132Z parseFrom(byte[] bArr, C19926312xp c19926312xp) {
        C199462132m c199462132m = LLILZ;
        c199462132m.getClass();
        InterfaceC19925612xi interfaceC19925612xiLJIILJJIL = c199462132m.LJIILJJIL(bArr, bArr.length, c19926312xp);
        AbstractC19925812xk.LIZJ(interfaceC19925612xiLJIILJJIL);
        return (C132Z) interfaceC19925612xiLJIILJJIL;
    }

    public static C132Z parseFrom(AbstractC19922812xG abstractC19922812xG, C19926312xp c19926312xp) {
        return LLILZ.LIZ(abstractC19922812xG, c19926312xp);
    }

    public static C132Z parseFrom(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) {
        return (C132Z) k0.LJIIJJI(LLILZ, abstractC19927312xz, c19926312xp);
    }

    public static C132Z parseFrom(InputStream inputStream, C19926312xp c19926312xp) {
        return (C132Z) k0.LJIILIIL(LLILZ, inputStream, c19926312xp);
    }

    public static C132Z parseFrom(ByteBuffer byteBuffer, C19926312xp c19926312xp) {
        return LLILZ.LJIIJ(byteBuffer, c19926312xp);
    }
}
