package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.protobuf.k0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: X.131n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C199437131n extends AbstractC19933412yy<C199437131n> implements AnonymousClass1326 {
    public static final C199437131n LLILZ;
    public static final C199442131s LLILZIL;
    public static final long serialVersionUID = 0;
    public int LLILLJJLI;
    public byte LLILLL;
    public int defaultSymbolVisibility_;
    public int enforceNamingStyle_;
    public int enumType_;
    public int fieldPresence_;
    public int jsonFormat_;
    public int messageEncoding_;
    public int repeatedFieldEncoding_;
    public int utf8Validation_;

    /* JADX WARN: Type inference failed for: r0v2, types: [X.131s] */
    static {
        C19373810qu.LIZ(EnumC19373110qn.PUBLIC, "FeatureSet");
        LLILZ = new C199437131n();
        LLILZIL = new AbstractC19925812xk<C199437131n>() { // from class: X.131s
            @Override // X.InterfaceC19925712xj
            public final Object LIZIZ(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) throws C19926612xs {
                C199436131m c199436131mNewBuilder = C199437131n.newBuilder();
                try {
                    c199436131mNewBuilder.LJJIIJZLJL(abstractC19927312xz, c19926312xp);
                    return c199436131mNewBuilder.buildPartial();
                } catch (C19918012wU e) {
                    TryCatchGuardChecker.doCheck(e);
                    C19926612xs c19926612xsAsInvalidProtocolBufferException = e.asInvalidProtocolBufferException();
                    c19926612xsAsInvalidProtocolBufferException.setUnfinishedMessage(c199436131mNewBuilder.buildPartial());
                    throw c19926612xsAsInvalidProtocolBufferException;
                } catch (C19926612xs e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    e2.setUnfinishedMessage(c199436131mNewBuilder.buildPartial());
                    throw e2;
                } catch (IOException e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    C19926612xs c19926612xs = new C19926612xs(e3);
                    c19926612xs.setUnfinishedMessage(c199436131mNewBuilder.buildPartial());
                    throw c19926612xs;
                }
            }
        };
    }

    public static C199436131m newBuilder() {
        return LLILZ.toBuilder();
    }

    @Override // com.google.protobuf.k0
    public final C19935812zM LJI() {
        C19935812zM c19935812zM = C131K.LJJJJZ;
        c19935812zM.LIZ(C199437131n.class, C199436131m.class);
        return c19935812zM;
    }

    public EnumC199441131r getDefaultSymbolVisibility() {
        EnumC199441131r enumC199441131rForNumber = EnumC199441131r.forNumber(this.defaultSymbolVisibility_);
        return enumC199441131rForNumber == null ? EnumC199441131r.DEFAULT_SYMBOL_VISIBILITY_UNKNOWN : enumC199441131rForNumber;
    }

    public EnumC199439131p getEnforceNamingStyle() {
        EnumC199439131p enumC199439131pForNumber = EnumC199439131p.forNumber(this.enforceNamingStyle_);
        return enumC199439131pForNumber == null ? EnumC199439131p.ENFORCE_NAMING_STYLE_UNKNOWN : enumC199439131pForNumber;
    }

    public EnumC199438131o getEnumType() {
        EnumC199438131o enumC199438131oForNumber = EnumC199438131o.forNumber(this.enumType_);
        return enumC199438131oForNumber == null ? EnumC199438131o.ENUM_TYPE_UNKNOWN : enumC199438131oForNumber;
    }

    public C130Z getFieldPresence() {
        C130Z c130zForNumber = C130Z.forNumber(this.fieldPresence_);
        return c130zForNumber == null ? C130Z.FIELD_PRESENCE_UNKNOWN : c130zForNumber;
    }

    public EnumC199440131q getJsonFormat() {
        EnumC199440131q enumC199440131qForNumber = EnumC199440131q.forNumber(this.jsonFormat_);
        return enumC199440131qForNumber == null ? EnumC199440131q.JSON_FORMAT_UNKNOWN : enumC199440131qForNumber;
    }

    public EnumC199399130b getMessageEncoding() {
        EnumC199399130b enumC199399130bForNumber = EnumC199399130b.forNumber(this.messageEncoding_);
        return enumC199399130bForNumber == null ? EnumC199399130b.MESSAGE_ENCODING_UNKNOWN : enumC199399130bForNumber;
    }

    public C131R getRepeatedFieldEncoding() {
        C131R c131rForNumber = C131R.forNumber(this.repeatedFieldEncoding_);
        return c131rForNumber == null ? C131R.REPEATED_FIELD_ENCODING_UNKNOWN : c131rForNumber;
    }

    @Override // com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19925612xi
    public int getSerializedSize() {
        int i = this.LL;
        if (i != -1) {
            return i;
        }
        int iLJ = (this.LLILLJJLI & 1) != 0 ? 0 + AbstractC19928912yF.LJ(1, this.fieldPresence_) : 0;
        if ((this.LLILLJJLI & 2) != 0) {
            iLJ += AbstractC19928912yF.LJ(2, this.enumType_);
        }
        if ((this.LLILLJJLI & 4) != 0) {
            iLJ += AbstractC19928912yF.LJ(3, this.repeatedFieldEncoding_);
        }
        if ((this.LLILLJJLI & 8) != 0) {
            iLJ += AbstractC19928912yF.LJ(4, this.utf8Validation_);
        }
        if ((this.LLILLJJLI & 16) != 0) {
            iLJ += AbstractC19928912yF.LJ(5, this.messageEncoding_);
        }
        if ((this.LLILLJJLI & 32) != 0) {
            iLJ += AbstractC19928912yF.LJ(6, this.jsonFormat_);
        }
        if ((this.LLILLJJLI & 64) != 0) {
            iLJ += AbstractC19928912yF.LJ(7, this.enforceNamingStyle_);
        }
        if ((this.LLILLJJLI & 128) != 0) {
            iLJ += AbstractC19928912yF.LJ(8, this.defaultSymbolVisibility_);
        }
        int iLJIILLIIL = iLJ + LJIILLIIL() + getUnknownFields().getSerializedSize();
        this.LL = iLJIILLIIL;
        return iLJIILLIIL;
    }

    public C130X getUtf8Validation() {
        C130X c130xForNumber = C130X.forNumber(this.utf8Validation_);
        return c130xForNumber == null ? C130X.UTF8_VALIDATION_UNKNOWN : c130xForNumber;
    }

    public boolean hasDefaultSymbolVisibility() {
        return (this.LLILLJJLI & 128) != 0;
    }

    public boolean hasEnforceNamingStyle() {
        return (this.LLILLJJLI & 64) != 0;
    }

    public boolean hasEnumType() {
        return (this.LLILLJJLI & 2) != 0;
    }

    public boolean hasFieldPresence() {
        return (this.LLILLJJLI & 1) != 0;
    }

    public boolean hasJsonFormat() {
        return (this.LLILLJJLI & 32) != 0;
    }

    public boolean hasMessageEncoding() {
        return (this.LLILLJJLI & 16) != 0;
    }

    public boolean hasRepeatedFieldEncoding() {
        return (this.LLILLJJLI & 4) != 0;
    }

    public boolean hasUtf8Validation() {
        return (this.LLILLJJLI & 8) != 0;
    }

    @Override // X.AbstractC19932312yn
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = 779 + getDescriptor().hashCode();
        if (hasFieldPresence()) {
            iHashCode = (((iHashCode * 37) + 1) * 53) + this.fieldPresence_;
        }
        if (hasEnumType()) {
            iHashCode = (((iHashCode * 37) + 2) * 53) + this.enumType_;
        }
        if (hasRepeatedFieldEncoding()) {
            iHashCode = (((iHashCode * 37) + 3) * 53) + this.repeatedFieldEncoding_;
        }
        if (hasUtf8Validation()) {
            iHashCode = (((iHashCode * 37) + 4) * 53) + this.utf8Validation_;
        }
        if (hasMessageEncoding()) {
            iHashCode = (((iHashCode * 37) + 5) * 53) + this.messageEncoding_;
        }
        if (hasJsonFormat()) {
            iHashCode = (((iHashCode * 37) + 6) * 53) + this.jsonFormat_;
        }
        if (hasEnforceNamingStyle()) {
            iHashCode = (((iHashCode * 37) + 7) * 53) + this.enforceNamingStyle_;
        }
        if (hasDefaultSymbolVisibility()) {
            iHashCode = (((iHashCode * 37) + 8) * 53) + this.defaultSymbolVisibility_;
        }
        int iLIZJ = (AbstractC19932312yn.LIZJ(iHashCode, LJIJ()) * 29) + getUnknownFields().hashCode();
        this.memoizedHashCode = iLIZJ;
        return iLIZJ;
    }

    @Override // X.AbstractC19933412yy, com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19916512wF
    public final boolean isInitialized() {
        byte b = this.LLILLL;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (LJIILL()) {
            this.LLILLL = (byte) 1;
            return true;
        }
        this.LLILLL = (byte) 0;
        return false;
    }

    @Override // X.AbstractC19933412yy, com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19925612xi
    public C199436131m toBuilder() {
        if (this == LLILZ) {
            return new C199436131m();
        }
        C199436131m c199436131m = new C199436131m();
        c199436131m.LJJIIJ(this);
        return c199436131m;
    }

    public C199437131n() {
        this.LLILLL = (byte) -1;
    }

    public static C199437131n getDefaultInstance() {
        return LLILZ;
    }

    public static final AnonymousClass1301 getDescriptor() {
        return C131K.LJJJJLL;
    }

    public static InterfaceC19925712xj<C199437131n> parser() {
        return LLILZIL;
    }

    @Override // com.google.protobuf.k0, X.InterfaceC19925612xi
    public InterfaceC19925712xj<C199437131n> getParserForType() {
        return LLILZIL;
    }

    @Override // X.AbstractC19933412yy, com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19916512wF
    public C199437131n getDefaultInstanceForType() {
        return LLILZ;
    }

    @Override // X.AbstractC19933412yy, com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19925612xi
    public C199436131m newBuilderForType() {
        return newBuilder();
    }

    public C199437131n(AbstractC19933312yx abstractC19933312yx) {
        super(abstractC19933312yx);
        this.LLILLL = (byte) -1;
    }

    public static C199436131m newBuilder(C199437131n c199437131n) {
        C199436131m builder = LLILZ.toBuilder();
        builder.LJJIIJ(c199437131n);
        return builder;
    }

    public static C199437131n parseDelimitedFrom(InputStream inputStream) {
        return (C199437131n) k0.LJIIIIZZ(LLILZIL, inputStream);
    }

    public static C199437131n parseFrom(AbstractC19922812xG abstractC19922812xG) {
        return (C199437131n) LLILZIL.LJFF(abstractC19922812xG);
    }

    @Override // X.AbstractC19932312yn
    public final InterfaceC19931912yj LIZLLL(InterfaceC19935412zI interfaceC19935412zI) {
        return new C199436131m(interfaceC19935412zI);
    }

    @Override // X.AbstractC19932312yn
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C199437131n)) {
            return super.equals(obj);
        }
        C199437131n c199437131n = (C199437131n) obj;
        if (hasFieldPresence() != c199437131n.hasFieldPresence()) {
            return false;
        }
        if ((hasFieldPresence() && this.fieldPresence_ != c199437131n.fieldPresence_) || hasEnumType() != c199437131n.hasEnumType()) {
            return false;
        }
        if ((hasEnumType() && this.enumType_ != c199437131n.enumType_) || hasRepeatedFieldEncoding() != c199437131n.hasRepeatedFieldEncoding()) {
            return false;
        }
        if ((hasRepeatedFieldEncoding() && this.repeatedFieldEncoding_ != c199437131n.repeatedFieldEncoding_) || hasUtf8Validation() != c199437131n.hasUtf8Validation()) {
            return false;
        }
        if ((hasUtf8Validation() && this.utf8Validation_ != c199437131n.utf8Validation_) || hasMessageEncoding() != c199437131n.hasMessageEncoding()) {
            return false;
        }
        if ((hasMessageEncoding() && this.messageEncoding_ != c199437131n.messageEncoding_) || hasJsonFormat() != c199437131n.hasJsonFormat()) {
            return false;
        }
        if ((hasJsonFormat() && this.jsonFormat_ != c199437131n.jsonFormat_) || hasEnforceNamingStyle() != c199437131n.hasEnforceNamingStyle()) {
            return false;
        }
        if ((hasEnforceNamingStyle() && this.enforceNamingStyle_ != c199437131n.enforceNamingStyle_) || hasDefaultSymbolVisibility() != c199437131n.hasDefaultSymbolVisibility()) {
            return false;
        }
        if ((!hasDefaultSymbolVisibility() || this.defaultSymbolVisibility_ == c199437131n.defaultSymbolVisibility_) && getUnknownFields().equals(c199437131n.getUnknownFields()) && LJIJ().equals(c199437131n.LJIJ())) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC19933412yy
    public Object getExtension(AbstractC19933212yw abstractC19933212yw) {
        return getExtension((AbstractC19925412xg) abstractC19933212yw);
    }

    @Override // X.AbstractC19933412yy
    public int getExtensionCount(AbstractC19933212yw abstractC19933212yw) {
        return getExtensionCount((AbstractC19925412xg) abstractC19933212yw);
    }

    @Override // X.AbstractC19933412yy
    public boolean hasExtension(AbstractC19933212yw abstractC19933212yw) {
        return hasExtension((AbstractC19925412xg) abstractC19933212yw);
    }

    @Override // com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19925612xi
    public void writeTo(AbstractC19928912yF abstractC19928912yF) {
        C131A c131aLJIJI = LJIJI();
        if ((this.LLILLJJLI & 1) != 0) {
            abstractC19928912yF.LJJII(1, this.fieldPresence_);
        }
        if ((this.LLILLJJLI & 2) != 0) {
            abstractC19928912yF.LJJII(2, this.enumType_);
        }
        if ((this.LLILLJJLI & 4) != 0) {
            abstractC19928912yF.LJJII(3, this.repeatedFieldEncoding_);
        }
        if ((this.LLILLJJLI & 8) != 0) {
            abstractC19928912yF.LJJII(4, this.utf8Validation_);
        }
        if ((this.LLILLJJLI & 16) != 0) {
            abstractC19928912yF.LJJII(5, this.messageEncoding_);
        }
        if ((this.LLILLJJLI & 32) != 0) {
            abstractC19928912yF.LJJII(6, this.jsonFormat_);
        }
        if ((this.LLILLJJLI & 64) != 0) {
            abstractC19928912yF.LJJII(7, this.enforceNamingStyle_);
        }
        if ((this.LLILLJJLI & 128) != 0) {
            abstractC19928912yF.LJJII(8, this.defaultSymbolVisibility_);
        }
        c131aLJIJI.LIZ(10001, abstractC19928912yF);
        getUnknownFields().writeTo(abstractC19928912yF);
    }

    public static C199437131n parseFrom(AbstractC19927312xz abstractC19927312xz) {
        return (C199437131n) k0.LJIIJ(LLILZIL, abstractC19927312xz);
    }

    @Override // X.AbstractC19933412yy
    public Object getExtension(C19933612z0 c19933612z0) {
        return getExtension((AbstractC19925412xg) c19933612z0);
    }

    @Override // X.AbstractC19933412yy
    public int getExtensionCount(C19933612z0 c19933612z0) {
        return getExtensionCount((AbstractC19925412xg) c19933612z0);
    }

    @Override // X.AbstractC19933412yy
    public boolean hasExtension(C19933612z0 c19933612z0) {
        return hasExtension((AbstractC19925412xg) c19933612z0);
    }

    public static C199437131n parseFrom(InputStream inputStream) {
        return (C199437131n) k0.LJIIL(LLILZIL, inputStream);
    }

    public static C199437131n parseFrom(ByteBuffer byteBuffer) {
        return (C199437131n) LLILZIL.LJIIIZ(byteBuffer);
    }

    public static C199437131n parseFrom(byte[] bArr) {
        return (C199437131n) LLILZIL.LJIIJJI(bArr);
    }

    public static C199437131n parseDelimitedFrom(InputStream inputStream, C19926312xp c19926312xp) {
        return (C199437131n) k0.LJIIIZ(LLILZIL, inputStream, c19926312xp);
    }

    public static C199437131n parseFrom(byte[] bArr, C19926312xp c19926312xp) {
        C199442131s c199442131s = LLILZIL;
        c199442131s.getClass();
        InterfaceC19925612xi interfaceC19925612xiLJIILJJIL = c199442131s.LJIILJJIL(bArr, bArr.length, c19926312xp);
        AbstractC19925812xk.LIZJ(interfaceC19925612xiLJIILJJIL);
        return (C199437131n) interfaceC19925612xiLJIILJJIL;
    }

    @Override // X.AbstractC19933412yy
    public Object getExtension(AbstractC19933212yw abstractC19933212yw, int i) {
        return getExtension((AbstractC19925412xg) abstractC19933212yw, i);
    }

    public static C199437131n parseFrom(AbstractC19922812xG abstractC19922812xG, C19926312xp c19926312xp) {
        return LLILZIL.LIZ(abstractC19922812xG, c19926312xp);
    }

    @Override // X.AbstractC19933412yy
    public Object getExtension(C19933612z0 c19933612z0, int i) {
        return getExtension((AbstractC19925412xg) c19933612z0, i);
    }

    public static C199437131n parseFrom(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) {
        return (C199437131n) k0.LJIIJJI(LLILZIL, abstractC19927312xz, c19926312xp);
    }

    public static C199437131n parseFrom(InputStream inputStream, C19926312xp c19926312xp) {
        return (C199437131n) k0.LJIILIIL(LLILZIL, inputStream, c19926312xp);
    }

    public static C199437131n parseFrom(ByteBuffer byteBuffer, C19926312xp c19926312xp) {
        return LLILZIL.LJIIJ(byteBuffer, c19926312xp);
    }
}
