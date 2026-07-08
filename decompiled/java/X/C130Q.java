package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.protobuf.k0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: X.130Q, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C130Q extends k0 implements InterfaceC19933112yv {
    public static final C130Q LLILZ;
    public static final AnonymousClass1308 LLILZIL;
    public static final long serialVersionUID = 0;
    public int LLILLJJLI;
    public byte LLILLL;
    public boolean largeEnum_;
    public boolean legacyClosedEnum_;
    public int nestInFileClass_;
    public boolean useOldOuterClassnameDefault_;
    public int utf8Validation_;

    /* JADX WARN: Type inference failed for: r0v2, types: [X.1308] */
    static {
        C19373810qu.LIZ(EnumC19373110qn.PUBLIC, "JavaFeatures");
        LLILZ = new C130Q();
        LLILZIL = new AbstractC19925812xk<C130Q>() { // from class: X.1308
            @Override // X.InterfaceC19925712xj
            public final Object LIZIZ(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) throws C19926612xs {
                C130R c130rNewBuilder = C130Q.newBuilder();
                try {
                    c130rNewBuilder.LJIL(abstractC19927312xz, c19926312xp);
                    return c130rNewBuilder.buildPartial();
                } catch (C19918012wU e) {
                    TryCatchGuardChecker.doCheck(e);
                    C19926612xs c19926612xsAsInvalidProtocolBufferException = e.asInvalidProtocolBufferException();
                    c19926612xsAsInvalidProtocolBufferException.setUnfinishedMessage(c130rNewBuilder.buildPartial());
                    throw c19926612xsAsInvalidProtocolBufferException;
                } catch (C19926612xs e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    e2.setUnfinishedMessage(c130rNewBuilder.buildPartial());
                    throw e2;
                } catch (IOException e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    C19926612xs c19926612xs = new C19926612xs(e3);
                    c19926612xs.setUnfinishedMessage(c130rNewBuilder.buildPartial());
                    throw c19926612xs;
                }
            }
        };
    }

    public static C130R newBuilder() {
        return LLILZ.toBuilder();
    }

    @Override // com.google.protobuf.k0
    public final C19935812zM LJI() {
        C19935812zM c19935812zM = AnonymousClass1307.LIZJ;
        c19935812zM.LIZ(C130Q.class, C130R.class);
        return c19935812zM;
    }

    public C130S getNestInFileClass() {
        C130S c130sForNumber = C130S.forNumber(this.nestInFileClass_);
        return c130sForNumber == null ? C130S.NEST_IN_FILE_CLASS_UNKNOWN : c130sForNumber;
    }

    @Override // com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19925612xi
    public int getSerializedSize() {
        int i = this.LL;
        if (i != -1) {
            return i;
        }
        int iLIZIZ = (this.LLILLJJLI & 1) != 0 ? 0 + AbstractC19928912yF.LIZIZ(1) : 0;
        if ((this.LLILLJJLI & 2) != 0) {
            iLIZIZ += AbstractC19928912yF.LJ(2, this.utf8Validation_);
        }
        if ((this.LLILLJJLI & 4) != 0) {
            iLIZIZ += AbstractC19928912yF.LIZIZ(3);
        }
        if ((this.LLILLJJLI & 8) != 0) {
            iLIZIZ += AbstractC19928912yF.LIZIZ(4);
        }
        if ((this.LLILLJJLI & 16) != 0) {
            iLIZIZ += AbstractC19928912yF.LJ(5, this.nestInFileClass_);
        }
        int serializedSize = iLIZIZ + getUnknownFields().getSerializedSize();
        this.LL = serializedSize;
        return serializedSize;
    }

    public C130O getUtf8Validation() {
        C130O c130oForNumber = C130O.forNumber(this.utf8Validation_);
        return c130oForNumber == null ? C130O.UTF8_VALIDATION_UNKNOWN : c130oForNumber;
    }

    public boolean hasLargeEnum() {
        return (this.LLILLJJLI & 4) != 0;
    }

    public boolean hasLegacyClosedEnum() {
        return (this.LLILLJJLI & 1) != 0;
    }

    public boolean hasNestInFileClass() {
        return (this.LLILLJJLI & 16) != 0;
    }

    public boolean hasUseOldOuterClassnameDefault() {
        return (this.LLILLJJLI & 8) != 0;
    }

    public boolean hasUtf8Validation() {
        return (this.LLILLJJLI & 2) != 0;
    }

    @Override // X.AbstractC19932312yn
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = 779 + getDescriptor().hashCode();
        if (hasLegacyClosedEnum()) {
            iHashCode = (((iHashCode * 37) + 1) * 53) + C19922012x8.LIZIZ(getLegacyClosedEnum());
        }
        if (hasUtf8Validation()) {
            iHashCode = (((iHashCode * 37) + 2) * 53) + this.utf8Validation_;
        }
        if (hasLargeEnum()) {
            iHashCode = (((iHashCode * 37) + 3) * 53) + C19922012x8.LIZIZ(getLargeEnum());
        }
        if (hasUseOldOuterClassnameDefault()) {
            iHashCode = (((iHashCode * 37) + 4) * 53) + C19922012x8.LIZIZ(getUseOldOuterClassnameDefault());
        }
        if (hasNestInFileClass()) {
            iHashCode = (((iHashCode * 37) + 5) * 53) + this.nestInFileClass_;
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
    public C130R toBuilder() {
        if (this == LLILZ) {
            return new C130R();
        }
        C130R c130r = new C130R();
        c130r.LJIJJLI(this);
        return c130r;
    }

    public C130Q() {
        this.LLILLL = (byte) -1;
    }

    public static C130Q getDefaultInstance() {
        return LLILZ;
    }

    public static final AnonymousClass1301 getDescriptor() {
        return AnonymousClass1307.LIZIZ;
    }

    public static InterfaceC19925712xj<C130Q> parser() {
        return LLILZIL;
    }

    public boolean getLargeEnum() {
        return this.largeEnum_;
    }

    public boolean getLegacyClosedEnum() {
        return this.legacyClosedEnum_;
    }

    @Override // com.google.protobuf.k0, X.InterfaceC19925612xi
    public InterfaceC19925712xj<C130Q> getParserForType() {
        return LLILZIL;
    }

    public boolean getUseOldOuterClassnameDefault() {
        return this.useOldOuterClassnameDefault_;
    }

    @Override // com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19916512wF
    public C130Q getDefaultInstanceForType() {
        return LLILZ;
    }

    @Override // com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19925612xi
    public C130R newBuilderForType() {
        return newBuilder();
    }

    public C130Q(AbstractC19933512yz abstractC19933512yz) {
        super(abstractC19933512yz);
        this.LLILLL = (byte) -1;
    }

    public static C130R newBuilder(C130Q c130q) {
        C130R builder = LLILZ.toBuilder();
        builder.LJIJJLI(c130q);
        return builder;
    }

    public static C130Q parseDelimitedFrom(InputStream inputStream) {
        return (C130Q) k0.LJIIIIZZ(LLILZIL, inputStream);
    }

    public static C130Q parseFrom(AbstractC19922812xG abstractC19922812xG) {
        return (C130Q) LLILZIL.LJFF(abstractC19922812xG);
    }

    @Override // X.AbstractC19932312yn
    public final InterfaceC19931912yj LIZLLL(InterfaceC19935412zI interfaceC19935412zI) {
        return new C130R(interfaceC19935412zI);
    }

    @Override // X.AbstractC19932312yn
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C130Q)) {
            return super.equals(obj);
        }
        C130Q c130q = (C130Q) obj;
        if (hasLegacyClosedEnum() != c130q.hasLegacyClosedEnum()) {
            return false;
        }
        if ((hasLegacyClosedEnum() && getLegacyClosedEnum() != c130q.getLegacyClosedEnum()) || hasUtf8Validation() != c130q.hasUtf8Validation()) {
            return false;
        }
        if ((hasUtf8Validation() && this.utf8Validation_ != c130q.utf8Validation_) || hasLargeEnum() != c130q.hasLargeEnum()) {
            return false;
        }
        if ((hasLargeEnum() && getLargeEnum() != c130q.getLargeEnum()) || hasUseOldOuterClassnameDefault() != c130q.hasUseOldOuterClassnameDefault()) {
            return false;
        }
        if ((hasUseOldOuterClassnameDefault() && getUseOldOuterClassnameDefault() != c130q.getUseOldOuterClassnameDefault()) || hasNestInFileClass() != c130q.hasNestInFileClass()) {
            return false;
        }
        if ((!hasNestInFileClass() || this.nestInFileClass_ == c130q.nestInFileClass_) && getUnknownFields().equals(c130q.getUnknownFields())) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19925612xi
    public void writeTo(AbstractC19928912yF abstractC19928912yF) {
        if ((this.LLILLJJLI & 1) != 0) {
            abstractC19928912yF.LJIIZILJ(1, this.legacyClosedEnum_);
        }
        if ((this.LLILLJJLI & 2) != 0) {
            abstractC19928912yF.LJJII(2, this.utf8Validation_);
        }
        if ((this.LLILLJJLI & 4) != 0) {
            abstractC19928912yF.LJIIZILJ(3, this.largeEnum_);
        }
        if ((this.LLILLJJLI & 8) != 0) {
            abstractC19928912yF.LJIIZILJ(4, this.useOldOuterClassnameDefault_);
        }
        if ((this.LLILLJJLI & 16) != 0) {
            abstractC19928912yF.LJJII(5, this.nestInFileClass_);
        }
        getUnknownFields().writeTo(abstractC19928912yF);
    }

    public static C130Q parseFrom(AbstractC19927312xz abstractC19927312xz) {
        return (C130Q) k0.LJIIJ(LLILZIL, abstractC19927312xz);
    }

    public static C130Q parseFrom(InputStream inputStream) {
        return (C130Q) k0.LJIIL(LLILZIL, inputStream);
    }

    public static C130Q parseFrom(ByteBuffer byteBuffer) {
        return (C130Q) LLILZIL.LJIIIZ(byteBuffer);
    }

    public static C130Q parseFrom(byte[] bArr) {
        return (C130Q) LLILZIL.LJIIJJI(bArr);
    }

    public static C130Q parseDelimitedFrom(InputStream inputStream, C19926312xp c19926312xp) {
        return (C130Q) k0.LJIIIZ(LLILZIL, inputStream, c19926312xp);
    }

    public static C130Q parseFrom(byte[] bArr, C19926312xp c19926312xp) {
        AnonymousClass1308 anonymousClass1308 = LLILZIL;
        anonymousClass1308.getClass();
        InterfaceC19925612xi interfaceC19925612xiLJIILJJIL = anonymousClass1308.LJIILJJIL(bArr, bArr.length, c19926312xp);
        AbstractC19925812xk.LIZJ(interfaceC19925612xiLJIILJJIL);
        return (C130Q) interfaceC19925612xiLJIILJJIL;
    }

    public static C130Q parseFrom(AbstractC19922812xG abstractC19922812xG, C19926312xp c19926312xp) {
        return LLILZIL.LIZ(abstractC19922812xG, c19926312xp);
    }

    public static C130Q parseFrom(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) {
        return (C130Q) k0.LJIIJJI(LLILZIL, abstractC19927312xz, c19926312xp);
    }

    public static C130Q parseFrom(InputStream inputStream, C19926312xp c19926312xp) {
        return (C130Q) k0.LJIILIIL(LLILZIL, inputStream, c19926312xp);
    }

    public static C130Q parseFrom(ByteBuffer byteBuffer, C19926312xp c19926312xp) {
        return LLILZIL.LJIIJ(byteBuffer, c19926312xp);
    }
}
