package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.protobuf.k0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: X.132V, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C132V extends k0 implements InterfaceC199431131h {
    public static final C132V LLILZ;
    public static final C199467132r LLILZIL;
    public static final long serialVersionUID = 0;
    public int LLILLJJLI;
    public byte LLILLL;
    public int edition_;
    public volatile Object value_;

    /* JADX WARN: Type inference failed for: r0v2, types: [X.132r] */
    static {
        C19373810qu.LIZ(EnumC19373110qn.PUBLIC, "EditionDefault");
        LLILZ = new C132V();
        LLILZIL = new AbstractC19925812xk<C132V>() { // from class: X.132r
            @Override // X.InterfaceC19925712xj
            public final Object LIZIZ(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) throws C19926612xs {
                C199450132a c199450132aNewBuilder = C132V.newBuilder();
                try {
                    c199450132aNewBuilder.LJIL(abstractC19927312xz, c19926312xp);
                    return c199450132aNewBuilder.buildPartial();
                } catch (C19918012wU e) {
                    TryCatchGuardChecker.doCheck(e);
                    C19926612xs c19926612xsAsInvalidProtocolBufferException = e.asInvalidProtocolBufferException();
                    c19926612xsAsInvalidProtocolBufferException.setUnfinishedMessage(c199450132aNewBuilder.buildPartial());
                    throw c19926612xsAsInvalidProtocolBufferException;
                } catch (C19926612xs e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    e2.setUnfinishedMessage(c199450132aNewBuilder.buildPartial());
                    throw e2;
                } catch (IOException e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    C19926612xs c19926612xs = new C19926612xs(e3);
                    c19926612xs.setUnfinishedMessage(c199450132aNewBuilder.buildPartial());
                    throw c19926612xs;
                }
            }
        };
    }

    public static C199450132a newBuilder() {
        return LLILZ.toBuilder();
    }

    @Override // com.google.protobuf.k0
    public final C19935812zM LJI() {
        C19935812zM c19935812zM = C131K.LJJIJIIJI;
        c19935812zM.LIZ(C132V.class, C199450132a.class);
        return c19935812zM;
    }

    public C130B getEdition() {
        C130B c130bForNumber = C130B.forNumber(this.edition_);
        return c130bForNumber == null ? C130B.EDITION_UNKNOWN : c130bForNumber;
    }

    @Override // com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19925612xi
    public int getSerializedSize() {
        int i = this.LL;
        if (i != -1) {
            return i;
        }
        int iLJ = (this.LLILLJJLI & 2) != 0 ? 0 + k0.LJ(2, this.value_) : 0;
        if ((this.LLILLJJLI & 1) != 0) {
            iLJ += AbstractC19928912yF.LJ(3, this.edition_);
        }
        int serializedSize = iLJ + getUnknownFields().getSerializedSize();
        this.LL = serializedSize;
        return serializedSize;
    }

    public String getValue() {
        Object obj = this.value_;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC19922812xG abstractC19922812xG = (AbstractC19922812xG) obj;
        String stringUtf8 = abstractC19922812xG.toStringUtf8();
        if (abstractC19922812xG.isValidUtf8()) {
            this.value_ = stringUtf8;
        }
        return stringUtf8;
    }

    public AbstractC19922812xG getValueBytes() {
        Object obj = this.value_;
        if (!(obj instanceof String)) {
            return (AbstractC19922812xG) obj;
        }
        AbstractC19922812xG abstractC19922812xGCopyFromUtf8 = AbstractC19922812xG.copyFromUtf8((String) obj);
        this.value_ = abstractC19922812xGCopyFromUtf8;
        return abstractC19922812xGCopyFromUtf8;
    }

    public boolean hasEdition() {
        return (this.LLILLJJLI & 1) != 0;
    }

    public boolean hasValue() {
        return (this.LLILLJJLI & 2) != 0;
    }

    @Override // X.AbstractC19932312yn
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = 779 + getDescriptor().hashCode();
        if (hasEdition()) {
            iHashCode = (((iHashCode * 37) + 3) * 53) + this.edition_;
        }
        if (hasValue()) {
            iHashCode = (((iHashCode * 37) + 2) * 53) + getValue().hashCode();
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
    public C199450132a toBuilder() {
        if (this == LLILZ) {
            return new C199450132a();
        }
        C199450132a c199450132a = new C199450132a();
        c199450132a.LJIJJLI(this);
        return c199450132a;
    }

    public C132V() {
        this.value_ = "";
        this.LLILLL = (byte) -1;
        this.value_ = "";
    }

    public static C132V getDefaultInstance() {
        return LLILZ;
    }

    public static final AnonymousClass1301 getDescriptor() {
        return C131K.LJJIJ;
    }

    public static InterfaceC19925712xj<C132V> parser() {
        return LLILZIL;
    }

    @Override // com.google.protobuf.k0, X.InterfaceC19925612xi
    public InterfaceC19925712xj<C132V> getParserForType() {
        return LLILZIL;
    }

    @Override // com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19916512wF
    public C132V getDefaultInstanceForType() {
        return LLILZ;
    }

    @Override // com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19925612xi
    public C199450132a newBuilderForType() {
        return newBuilder();
    }

    public C132V(AbstractC19933512yz abstractC19933512yz) {
        super(abstractC19933512yz);
        this.value_ = "";
        this.LLILLL = (byte) -1;
    }

    public static C199450132a newBuilder(C132V c132v) {
        C199450132a builder = LLILZ.toBuilder();
        builder.LJIJJLI(c132v);
        return builder;
    }

    public static C132V parseDelimitedFrom(InputStream inputStream) {
        return (C132V) k0.LJIIIIZZ(LLILZIL, inputStream);
    }

    public static C132V parseFrom(AbstractC19922812xG abstractC19922812xG) {
        return (C132V) LLILZIL.LJFF(abstractC19922812xG);
    }

    @Override // X.AbstractC19932312yn
    public final InterfaceC19931912yj LIZLLL(InterfaceC19935412zI interfaceC19935412zI) {
        return new C199450132a(interfaceC19935412zI);
    }

    @Override // X.AbstractC19932312yn
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C132V)) {
            return super.equals(obj);
        }
        C132V c132v = (C132V) obj;
        if (hasEdition() != c132v.hasEdition()) {
            return false;
        }
        if ((hasEdition() && this.edition_ != c132v.edition_) || hasValue() != c132v.hasValue()) {
            return false;
        }
        if ((!hasValue() || getValue().equals(c132v.getValue())) && getUnknownFields().equals(c132v.getUnknownFields())) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19925612xi
    public void writeTo(AbstractC19928912yF abstractC19928912yF) {
        if ((this.LLILLJJLI & 2) != 0) {
            k0.LJIILJJIL(abstractC19928912yF, 2, this.value_);
        }
        if ((this.LLILLJJLI & 1) != 0) {
            abstractC19928912yF.LJJII(3, this.edition_);
        }
        getUnknownFields().writeTo(abstractC19928912yF);
    }

    public static C132V parseFrom(AbstractC19927312xz abstractC19927312xz) {
        return (C132V) k0.LJIIJ(LLILZIL, abstractC19927312xz);
    }

    public static C132V parseFrom(InputStream inputStream) {
        return (C132V) k0.LJIIL(LLILZIL, inputStream);
    }

    public static C132V parseFrom(ByteBuffer byteBuffer) {
        return (C132V) LLILZIL.LJIIIZ(byteBuffer);
    }

    public static C132V parseFrom(byte[] bArr) {
        return (C132V) LLILZIL.LJIIJJI(bArr);
    }

    public static C132V parseDelimitedFrom(InputStream inputStream, C19926312xp c19926312xp) {
        return (C132V) k0.LJIIIZ(LLILZIL, inputStream, c19926312xp);
    }

    public static C132V parseFrom(byte[] bArr, C19926312xp c19926312xp) {
        C199467132r c199467132r = LLILZIL;
        c199467132r.getClass();
        InterfaceC19925612xi interfaceC19925612xiLJIILJJIL = c199467132r.LJIILJJIL(bArr, bArr.length, c19926312xp);
        AbstractC19925812xk.LIZJ(interfaceC19925612xiLJIILJJIL);
        return (C132V) interfaceC19925612xiLJIILJJIL;
    }

    public static C132V parseFrom(AbstractC19922812xG abstractC19922812xG, C19926312xp c19926312xp) {
        return LLILZIL.LIZ(abstractC19922812xG, c19926312xp);
    }

    public static C132V parseFrom(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) {
        return (C132V) k0.LJIIJJI(LLILZIL, abstractC19927312xz, c19926312xp);
    }

    public static C132V parseFrom(InputStream inputStream, C19926312xp c19926312xp) {
        return (C132V) k0.LJIILIIL(LLILZIL, inputStream, c19926312xp);
    }

    public static C132V parseFrom(ByteBuffer byteBuffer, C19926312xp c19926312xp) {
        return LLILZIL.LJIIJ(byteBuffer, c19926312xp);
    }
}
