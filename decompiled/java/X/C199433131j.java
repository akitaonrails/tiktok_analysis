package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.protobuf.k0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: X.131j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C199433131j extends k0 implements InterfaceC199432131i {
    public static final C199433131j LLILZ;
    public static final C199435131l LLILZIL;
    public static final long serialVersionUID = 0;
    public int LLILLJJLI;
    public byte LLILLL;
    public volatile Object deprecationWarning_;
    public int editionDeprecated_;
    public int editionIntroduced_;
    public int editionRemoved_;

    /* JADX WARN: Type inference failed for: r0v2, types: [X.131l] */
    static {
        C19373810qu.LIZ(EnumC19373110qn.PUBLIC, "FeatureSupport");
        LLILZ = new C199433131j();
        LLILZIL = new AbstractC19925812xk<C199433131j>() { // from class: X.131l
            @Override // X.InterfaceC19925712xj
            public final Object LIZIZ(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) throws C19926612xs {
                C199434131k c199434131kNewBuilder = C199433131j.newBuilder();
                try {
                    c199434131kNewBuilder.LJIL(abstractC19927312xz, c19926312xp);
                    return c199434131kNewBuilder.buildPartial();
                } catch (C19918012wU e) {
                    TryCatchGuardChecker.doCheck(e);
                    C19926612xs c19926612xsAsInvalidProtocolBufferException = e.asInvalidProtocolBufferException();
                    c19926612xsAsInvalidProtocolBufferException.setUnfinishedMessage(c199434131kNewBuilder.buildPartial());
                    throw c19926612xsAsInvalidProtocolBufferException;
                } catch (C19926612xs e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    e2.setUnfinishedMessage(c199434131kNewBuilder.buildPartial());
                    throw e2;
                } catch (IOException e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    C19926612xs c19926612xs = new C19926612xs(e3);
                    c19926612xs.setUnfinishedMessage(c199434131kNewBuilder.buildPartial());
                    throw c19926612xs;
                }
            }
        };
    }

    public static C199434131k newBuilder() {
        return LLILZ.toBuilder();
    }

    @Override // com.google.protobuf.k0
    public final C19935812zM LJI() {
        C19935812zM c19935812zM = C131K.LJJIJIL;
        c19935812zM.LIZ(C199433131j.class, C199434131k.class);
        return c19935812zM;
    }

    public String getDeprecationWarning() {
        Object obj = this.deprecationWarning_;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC19922812xG abstractC19922812xG = (AbstractC19922812xG) obj;
        String stringUtf8 = abstractC19922812xG.toStringUtf8();
        if (abstractC19922812xG.isValidUtf8()) {
            this.deprecationWarning_ = stringUtf8;
        }
        return stringUtf8;
    }

    public AbstractC19922812xG getDeprecationWarningBytes() {
        Object obj = this.deprecationWarning_;
        if (!(obj instanceof String)) {
            return (AbstractC19922812xG) obj;
        }
        AbstractC19922812xG abstractC19922812xGCopyFromUtf8 = AbstractC19922812xG.copyFromUtf8((String) obj);
        this.deprecationWarning_ = abstractC19922812xGCopyFromUtf8;
        return abstractC19922812xGCopyFromUtf8;
    }

    public C130B getEditionDeprecated() {
        C130B c130bForNumber = C130B.forNumber(this.editionDeprecated_);
        return c130bForNumber == null ? C130B.EDITION_UNKNOWN : c130bForNumber;
    }

    public C130B getEditionIntroduced() {
        C130B c130bForNumber = C130B.forNumber(this.editionIntroduced_);
        return c130bForNumber == null ? C130B.EDITION_UNKNOWN : c130bForNumber;
    }

    public C130B getEditionRemoved() {
        C130B c130bForNumber = C130B.forNumber(this.editionRemoved_);
        return c130bForNumber == null ? C130B.EDITION_UNKNOWN : c130bForNumber;
    }

    @Override // com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19925612xi
    public int getSerializedSize() {
        int i = this.LL;
        if (i != -1) {
            return i;
        }
        int iLJ = (this.LLILLJJLI & 1) != 0 ? 0 + AbstractC19928912yF.LJ(1, this.editionIntroduced_) : 0;
        if ((this.LLILLJJLI & 2) != 0) {
            iLJ += AbstractC19928912yF.LJ(2, this.editionDeprecated_);
        }
        if ((this.LLILLJJLI & 4) != 0) {
            iLJ += k0.LJ(3, this.deprecationWarning_);
        }
        if ((this.LLILLJJLI & 8) != 0) {
            iLJ += AbstractC19928912yF.LJ(4, this.editionRemoved_);
        }
        int serializedSize = iLJ + getUnknownFields().getSerializedSize();
        this.LL = serializedSize;
        return serializedSize;
    }

    public boolean hasDeprecationWarning() {
        return (this.LLILLJJLI & 4) != 0;
    }

    public boolean hasEditionDeprecated() {
        return (this.LLILLJJLI & 2) != 0;
    }

    public boolean hasEditionIntroduced() {
        return (this.LLILLJJLI & 1) != 0;
    }

    public boolean hasEditionRemoved() {
        return (this.LLILLJJLI & 8) != 0;
    }

    @Override // X.AbstractC19932312yn
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = 779 + getDescriptor().hashCode();
        if (hasEditionIntroduced()) {
            iHashCode = (((iHashCode * 37) + 1) * 53) + this.editionIntroduced_;
        }
        if (hasEditionDeprecated()) {
            iHashCode = (((iHashCode * 37) + 2) * 53) + this.editionDeprecated_;
        }
        if (hasDeprecationWarning()) {
            iHashCode = (((iHashCode * 37) + 3) * 53) + getDeprecationWarning().hashCode();
        }
        if (hasEditionRemoved()) {
            iHashCode = (((iHashCode * 37) + 4) * 53) + this.editionRemoved_;
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
    public C199434131k toBuilder() {
        if (this == LLILZ) {
            return new C199434131k();
        }
        C199434131k c199434131k = new C199434131k();
        c199434131k.LJIJJLI(this);
        return c199434131k;
    }

    public C199433131j() {
        this.deprecationWarning_ = "";
        this.LLILLL = (byte) -1;
        this.deprecationWarning_ = "";
    }

    public static C199433131j getDefaultInstance() {
        return LLILZ;
    }

    public static final AnonymousClass1301 getDescriptor() {
        return C131K.LJJIJIIJIL;
    }

    public static InterfaceC19925712xj<C199433131j> parser() {
        return LLILZIL;
    }

    @Override // com.google.protobuf.k0, X.InterfaceC19925612xi
    public InterfaceC19925712xj<C199433131j> getParserForType() {
        return LLILZIL;
    }

    @Override // com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19916512wF
    public C199433131j getDefaultInstanceForType() {
        return LLILZ;
    }

    @Override // com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19925612xi
    public C199434131k newBuilderForType() {
        return newBuilder();
    }

    public C199433131j(AbstractC19933512yz abstractC19933512yz) {
        super(abstractC19933512yz);
        this.deprecationWarning_ = "";
        this.LLILLL = (byte) -1;
    }

    public static C199434131k newBuilder(C199433131j c199433131j) {
        C199434131k builder = LLILZ.toBuilder();
        builder.LJIJJLI(c199433131j);
        return builder;
    }

    public static C199433131j parseDelimitedFrom(InputStream inputStream) {
        return (C199433131j) k0.LJIIIIZZ(LLILZIL, inputStream);
    }

    public static C199433131j parseFrom(AbstractC19922812xG abstractC19922812xG) {
        return (C199433131j) LLILZIL.LJFF(abstractC19922812xG);
    }

    @Override // X.AbstractC19932312yn
    public final InterfaceC19931912yj LIZLLL(InterfaceC19935412zI interfaceC19935412zI) {
        return new C199434131k(interfaceC19935412zI);
    }

    @Override // X.AbstractC19932312yn
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C199433131j)) {
            return super.equals(obj);
        }
        C199433131j c199433131j = (C199433131j) obj;
        if (hasEditionIntroduced() != c199433131j.hasEditionIntroduced()) {
            return false;
        }
        if ((hasEditionIntroduced() && this.editionIntroduced_ != c199433131j.editionIntroduced_) || hasEditionDeprecated() != c199433131j.hasEditionDeprecated()) {
            return false;
        }
        if ((hasEditionDeprecated() && this.editionDeprecated_ != c199433131j.editionDeprecated_) || hasDeprecationWarning() != c199433131j.hasDeprecationWarning()) {
            return false;
        }
        if ((hasDeprecationWarning() && !getDeprecationWarning().equals(c199433131j.getDeprecationWarning())) || hasEditionRemoved() != c199433131j.hasEditionRemoved()) {
            return false;
        }
        if ((!hasEditionRemoved() || this.editionRemoved_ == c199433131j.editionRemoved_) && getUnknownFields().equals(c199433131j.getUnknownFields())) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19925612xi
    public void writeTo(AbstractC19928912yF abstractC19928912yF) {
        if ((this.LLILLJJLI & 1) != 0) {
            abstractC19928912yF.LJJII(1, this.editionIntroduced_);
        }
        if ((this.LLILLJJLI & 2) != 0) {
            abstractC19928912yF.LJJII(2, this.editionDeprecated_);
        }
        if ((this.LLILLJJLI & 4) != 0) {
            k0.LJIILJJIL(abstractC19928912yF, 3, this.deprecationWarning_);
        }
        if ((this.LLILLJJLI & 8) != 0) {
            abstractC19928912yF.LJJII(4, this.editionRemoved_);
        }
        getUnknownFields().writeTo(abstractC19928912yF);
    }

    public static C199433131j parseFrom(AbstractC19927312xz abstractC19927312xz) {
        return (C199433131j) k0.LJIIJ(LLILZIL, abstractC19927312xz);
    }

    public static C199433131j parseFrom(InputStream inputStream) {
        return (C199433131j) k0.LJIIL(LLILZIL, inputStream);
    }

    public static C199433131j parseFrom(ByteBuffer byteBuffer) {
        return (C199433131j) LLILZIL.LJIIIZ(byteBuffer);
    }

    public static C199433131j parseFrom(byte[] bArr) {
        return (C199433131j) LLILZIL.LJIIJJI(bArr);
    }

    public static C199433131j parseDelimitedFrom(InputStream inputStream, C19926312xp c19926312xp) {
        return (C199433131j) k0.LJIIIZ(LLILZIL, inputStream, c19926312xp);
    }

    public static C199433131j parseFrom(byte[] bArr, C19926312xp c19926312xp) {
        C199435131l c199435131l = LLILZIL;
        c199435131l.getClass();
        InterfaceC19925612xi interfaceC19925612xiLJIILJJIL = c199435131l.LJIILJJIL(bArr, bArr.length, c19926312xp);
        AbstractC19925812xk.LIZJ(interfaceC19925612xiLJIILJJIL);
        return (C199433131j) interfaceC19925612xiLJIILJJIL;
    }

    public static C199433131j parseFrom(AbstractC19922812xG abstractC19922812xG, C19926312xp c19926312xp) {
        return LLILZIL.LIZ(abstractC19922812xG, c19926312xp);
    }

    public static C199433131j parseFrom(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) {
        return (C199433131j) k0.LJIIJJI(LLILZIL, abstractC19927312xz, c19926312xp);
    }

    public static C199433131j parseFrom(InputStream inputStream, C19926312xp c19926312xp) {
        return (C199433131j) k0.LJIILIIL(LLILZIL, inputStream, c19926312xp);
    }

    public static C199433131j parseFrom(ByteBuffer byteBuffer, C19926312xp c19926312xp) {
        return LLILZIL.LJIIJ(byteBuffer, c19926312xp);
    }
}
