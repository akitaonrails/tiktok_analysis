package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.protobuf.k0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.1328, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class AnonymousClass1328 extends AbstractC19933412yy<AnonymousClass1328> implements C131O {
    public static final AnonymousClass1328 LLILZ;
    public static final C132A LLILZIL;
    public static final long serialVersionUID = 0;
    public int LLILLJJLI;
    public byte LLILLL;
    public boolean deprecated_;
    public C199437131n features_;
    public int idempotencyLevel_;
    public List<C132O> uninterpretedOption_;

    /* JADX WARN: Type inference failed for: r0v2, types: [X.132A] */
    static {
        C19373810qu.LIZ(EnumC19373110qn.PUBLIC, "MethodOptions");
        LLILZ = new AnonymousClass1328();
        LLILZIL = new AbstractC19925812xk<AnonymousClass1328>() { // from class: X.132A
            @Override // X.InterfaceC19925712xj
            public final Object LIZIZ(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) throws C19926612xs {
                AnonymousClass1329 anonymousClass1329NewBuilder = AnonymousClass1328.newBuilder();
                try {
                    anonymousClass1329NewBuilder.LJJIIZ(abstractC19927312xz, c19926312xp);
                    return anonymousClass1329NewBuilder.buildPartial();
                } catch (C19918012wU e) {
                    TryCatchGuardChecker.doCheck(e);
                    C19926612xs c19926612xsAsInvalidProtocolBufferException = e.asInvalidProtocolBufferException();
                    c19926612xsAsInvalidProtocolBufferException.setUnfinishedMessage(anonymousClass1329NewBuilder.buildPartial());
                    throw c19926612xsAsInvalidProtocolBufferException;
                } catch (C19926612xs e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    e2.setUnfinishedMessage(anonymousClass1329NewBuilder.buildPartial());
                    throw e2;
                } catch (IOException e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    C19926612xs c19926612xs = new C19926612xs(e3);
                    c19926612xs.setUnfinishedMessage(anonymousClass1329NewBuilder.buildPartial());
                    throw c19926612xs;
                }
            }
        };
    }

    public static AnonymousClass1329 newBuilder() {
        return LLILZ.toBuilder();
    }

    @Override // com.google.protobuf.k0
    public final C19935812zM LJI() {
        C19935812zM c19935812zM = C131K.LJJJJIZL;
        c19935812zM.LIZ(AnonymousClass1328.class, AnonymousClass1329.class);
        return c19935812zM;
    }

    public C199437131n getFeatures() {
        C199437131n c199437131n = this.features_;
        return c199437131n == null ? C199437131n.getDefaultInstance() : c199437131n;
    }

    public AnonymousClass1326 getFeaturesOrBuilder() {
        C199437131n c199437131n = this.features_;
        return c199437131n == null ? C199437131n.getDefaultInstance() : c199437131n;
    }

    public EnumC199447131x getIdempotencyLevel() {
        EnumC199447131x enumC199447131xForNumber = EnumC199447131x.forNumber(this.idempotencyLevel_);
        return enumC199447131xForNumber == null ? EnumC199447131x.IDEMPOTENCY_UNKNOWN : enumC199447131xForNumber;
    }

    @Override // com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19925612xi
    public int getSerializedSize() {
        int i = this.LL;
        if (i != -1) {
            return i;
        }
        int iLIZIZ = (this.LLILLJJLI & 1) != 0 ? AbstractC19928912yF.LIZIZ(33) : 0;
        if ((this.LLILLJJLI & 2) != 0) {
            iLIZIZ += AbstractC19928912yF.LJ(34, this.idempotencyLevel_);
        }
        if ((this.LLILLJJLI & 4) != 0) {
            iLIZIZ += AbstractC19928912yF.LJII(35, getFeatures());
        }
        for (int i2 = 0; i2 < this.uninterpretedOption_.size(); i2++) {
            iLIZIZ += AbstractC19928912yF.LJII(999, (InterfaceC19925612xi) ListProtector.get(this.uninterpretedOption_, i2));
        }
        int iLJIILLIIL = iLIZIZ + LJIILLIIL() + getUnknownFields().getSerializedSize();
        this.LL = iLJIILLIIL;
        return iLJIILLIIL;
    }

    public int getUninterpretedOptionCount() {
        return this.uninterpretedOption_.size();
    }

    public boolean hasDeprecated() {
        return (this.LLILLJJLI & 1) != 0;
    }

    public boolean hasFeatures() {
        return (this.LLILLJJLI & 4) != 0;
    }

    public boolean hasIdempotencyLevel() {
        return (this.LLILLJJLI & 2) != 0;
    }

    @Override // X.AbstractC19932312yn
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = 779 + getDescriptor().hashCode();
        if (hasDeprecated()) {
            iHashCode = (((iHashCode * 37) + 33) * 53) + C19922012x8.LIZIZ(getDeprecated());
        }
        if (hasIdempotencyLevel()) {
            iHashCode = (((iHashCode * 37) + 34) * 53) + this.idempotencyLevel_;
        }
        if (hasFeatures()) {
            iHashCode = (((iHashCode * 37) + 35) * 53) + getFeatures().hashCode();
        }
        if (getUninterpretedOptionCount() > 0) {
            iHashCode = (((iHashCode * 37) + 999) * 53) + getUninterpretedOptionList().hashCode();
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
        if (hasFeatures() && !getFeatures().isInitialized()) {
            this.LLILLL = (byte) 0;
            return false;
        }
        for (int i = 0; i < getUninterpretedOptionCount(); i++) {
            if (!getUninterpretedOption(i).isInitialized()) {
                this.LLILLL = (byte) 0;
                return false;
            }
        }
        if (LJIILL()) {
            this.LLILLL = (byte) 1;
            return true;
        }
        this.LLILLL = (byte) 0;
        return false;
    }

    @Override // X.AbstractC19933412yy, com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19925612xi
    public AnonymousClass1329 toBuilder() {
        if (this == LLILZ) {
            return new AnonymousClass1329();
        }
        AnonymousClass1329 anonymousClass1329 = new AnonymousClass1329();
        anonymousClass1329.LJJIIJZLJL(this);
        return anonymousClass1329;
    }

    public AnonymousClass1328() {
        this.LLILLL = (byte) -1;
        this.uninterpretedOption_ = Collections.emptyList();
    }

    public static AnonymousClass1328 getDefaultInstance() {
        return LLILZ;
    }

    public static final AnonymousClass1301 getDescriptor() {
        return C131K.LJJJJI;
    }

    public static InterfaceC19925712xj<AnonymousClass1328> parser() {
        return LLILZIL;
    }

    public boolean getDeprecated() {
        return this.deprecated_;
    }

    @Override // com.google.protobuf.k0, X.InterfaceC19925612xi
    public InterfaceC19925712xj<AnonymousClass1328> getParserForType() {
        return LLILZIL;
    }

    public List<C132O> getUninterpretedOptionList() {
        return this.uninterpretedOption_;
    }

    public List<? extends AnonymousClass1331> getUninterpretedOptionOrBuilderList() {
        return this.uninterpretedOption_;
    }

    @Override // X.AbstractC19933412yy, com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19916512wF
    public AnonymousClass1328 getDefaultInstanceForType() {
        return LLILZ;
    }

    @Override // X.AbstractC19933412yy, com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19925612xi
    public AnonymousClass1329 newBuilderForType() {
        return newBuilder();
    }

    public AnonymousClass1328(AbstractC19933312yx abstractC19933312yx) {
        super(abstractC19933312yx);
        this.LLILLL = (byte) -1;
    }

    public static AnonymousClass1329 newBuilder(AnonymousClass1328 anonymousClass1328) {
        AnonymousClass1329 builder = LLILZ.toBuilder();
        builder.LJJIIJZLJL(anonymousClass1328);
        return builder;
    }

    public static AnonymousClass1328 parseDelimitedFrom(InputStream inputStream) {
        return (AnonymousClass1328) k0.LJIIIIZZ(LLILZIL, inputStream);
    }

    public static AnonymousClass1328 parseFrom(AbstractC19922812xG abstractC19922812xG) {
        return (AnonymousClass1328) LLILZIL.LJFF(abstractC19922812xG);
    }

    @Override // X.AbstractC19932312yn
    public final InterfaceC19931912yj LIZLLL(InterfaceC19935412zI interfaceC19935412zI) {
        return new AnonymousClass1329(interfaceC19935412zI);
    }

    @Override // X.AbstractC19932312yn
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AnonymousClass1328)) {
            return super.equals(obj);
        }
        AnonymousClass1328 anonymousClass1328 = (AnonymousClass1328) obj;
        if (hasDeprecated() != anonymousClass1328.hasDeprecated()) {
            return false;
        }
        if ((hasDeprecated() && getDeprecated() != anonymousClass1328.getDeprecated()) || hasIdempotencyLevel() != anonymousClass1328.hasIdempotencyLevel()) {
            return false;
        }
        if ((hasIdempotencyLevel() && this.idempotencyLevel_ != anonymousClass1328.idempotencyLevel_) || hasFeatures() != anonymousClass1328.hasFeatures()) {
            return false;
        }
        if ((!hasFeatures() || getFeatures().equals(anonymousClass1328.getFeatures())) && getUninterpretedOptionList().equals(anonymousClass1328.getUninterpretedOptionList()) && getUnknownFields().equals(anonymousClass1328.getUnknownFields()) && LJIJ().equals(anonymousClass1328.LJIJ())) {
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

    public C132O getUninterpretedOption(int i) {
        return (C132O) ListProtector.get(this.uninterpretedOption_, i);
    }

    public AnonymousClass1331 getUninterpretedOptionOrBuilder(int i) {
        return (AnonymousClass1331) ListProtector.get(this.uninterpretedOption_, i);
    }

    @Override // X.AbstractC19933412yy
    public boolean hasExtension(AbstractC19933212yw abstractC19933212yw) {
        return hasExtension((AbstractC19925412xg) abstractC19933212yw);
    }

    @Override // com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19925612xi
    public void writeTo(AbstractC19928912yF abstractC19928912yF) {
        C131A c131aLJIJI = LJIJI();
        if ((this.LLILLJJLI & 1) != 0) {
            abstractC19928912yF.LJIIZILJ(33, this.deprecated_);
        }
        if ((this.LLILLJJLI & 2) != 0) {
            abstractC19928912yF.LJJII(34, this.idempotencyLevel_);
        }
        if ((this.LLILLJJLI & 4) != 0) {
            abstractC19928912yF.LJJIIJ(35, getFeatures());
        }
        for (int i = 0; i < this.uninterpretedOption_.size(); i++) {
            abstractC19928912yF.LJJIIJ(999, (InterfaceC19925612xi) ListProtector.get(this.uninterpretedOption_, i));
        }
        c131aLJIJI.LIZ(536870912, abstractC19928912yF);
        getUnknownFields().writeTo(abstractC19928912yF);
    }

    public static AnonymousClass1328 parseFrom(AbstractC19927312xz abstractC19927312xz) {
        return (AnonymousClass1328) k0.LJIIJ(LLILZIL, abstractC19927312xz);
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

    public static AnonymousClass1328 parseFrom(InputStream inputStream) {
        return (AnonymousClass1328) k0.LJIIL(LLILZIL, inputStream);
    }

    public static AnonymousClass1328 parseFrom(ByteBuffer byteBuffer) {
        return (AnonymousClass1328) LLILZIL.LJIIIZ(byteBuffer);
    }

    public static AnonymousClass1328 parseFrom(byte[] bArr) {
        return (AnonymousClass1328) LLILZIL.LJIIJJI(bArr);
    }

    public static AnonymousClass1328 parseDelimitedFrom(InputStream inputStream, C19926312xp c19926312xp) {
        return (AnonymousClass1328) k0.LJIIIZ(LLILZIL, inputStream, c19926312xp);
    }

    public static AnonymousClass1328 parseFrom(byte[] bArr, C19926312xp c19926312xp) {
        C132A c132a = LLILZIL;
        c132a.getClass();
        InterfaceC19925612xi interfaceC19925612xiLJIILJJIL = c132a.LJIILJJIL(bArr, bArr.length, c19926312xp);
        AbstractC19925812xk.LIZJ(interfaceC19925612xiLJIILJJIL);
        return (AnonymousClass1328) interfaceC19925612xiLJIILJJIL;
    }

    @Override // X.AbstractC19933412yy
    public Object getExtension(AbstractC19933212yw abstractC19933212yw, int i) {
        return getExtension((AbstractC19925412xg) abstractC19933212yw, i);
    }

    public static AnonymousClass1328 parseFrom(AbstractC19922812xG abstractC19922812xG, C19926312xp c19926312xp) {
        return LLILZIL.LIZ(abstractC19922812xG, c19926312xp);
    }

    @Override // X.AbstractC19933412yy
    public Object getExtension(C19933612z0 c19933612z0, int i) {
        return getExtension((AbstractC19925412xg) c19933612z0, i);
    }

    public static AnonymousClass1328 parseFrom(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) {
        return (AnonymousClass1328) k0.LJIIJJI(LLILZIL, abstractC19927312xz, c19926312xp);
    }

    public static AnonymousClass1328 parseFrom(InputStream inputStream, C19926312xp c19926312xp) {
        return (AnonymousClass1328) k0.LJIILIIL(LLILZIL, inputStream, c19926312xp);
    }

    public static AnonymousClass1328 parseFrom(ByteBuffer byteBuffer, C19926312xp c19926312xp) {
        return LLILZIL.LJIIJ(byteBuffer, c19926312xp);
    }
}
