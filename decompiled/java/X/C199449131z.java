package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.protobuf.k0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.131z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C199449131z extends AbstractC19933412yy<C199449131z> implements InterfaceC199421130x {
    public static final C199449131z LLILZ;
    public static final AnonymousClass1322 LLILZIL;
    public static final long serialVersionUID = 0;
    public int LLILLJJLI;
    public byte LLILLL;
    public List<C132S> declaration_;
    public C199437131n features_;
    public List<C132O> uninterpretedOption_;
    public int verification_;

    /* JADX WARN: Type inference failed for: r0v2, types: [X.1322] */
    static {
        C19373810qu.LIZ(EnumC19373110qn.PUBLIC, "ExtensionRangeOptions");
        LLILZ = new C199449131z();
        LLILZIL = new AbstractC19925812xk<C199449131z>() { // from class: X.1322
            @Override // X.InterfaceC19925712xj
            public final Object LIZIZ(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) throws C19926612xs {
                AnonymousClass1320 anonymousClass1320NewBuilder = C199449131z.newBuilder();
                try {
                    anonymousClass1320NewBuilder.LJJIIZ(abstractC19927312xz, c19926312xp);
                    return anonymousClass1320NewBuilder.buildPartial();
                } catch (C19918012wU e) {
                    TryCatchGuardChecker.doCheck(e);
                    C19926612xs c19926612xsAsInvalidProtocolBufferException = e.asInvalidProtocolBufferException();
                    c19926612xsAsInvalidProtocolBufferException.setUnfinishedMessage(anonymousClass1320NewBuilder.buildPartial());
                    throw c19926612xsAsInvalidProtocolBufferException;
                } catch (C19926612xs e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    e2.setUnfinishedMessage(anonymousClass1320NewBuilder.buildPartial());
                    throw e2;
                } catch (IOException e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    C19926612xs c19926612xs = new C19926612xs(e3);
                    c19926612xs.setUnfinishedMessage(anonymousClass1320NewBuilder.buildPartial());
                    throw c19926612xs;
                }
            }
        };
    }

    public static AnonymousClass1320 newBuilder() {
        return LLILZ.toBuilder();
    }

    @Override // com.google.protobuf.k0
    public final C19935812zM LJI() {
        C19935812zM c19935812zM = C131K.LJIIIZ;
        c19935812zM.LIZ(C199449131z.class, AnonymousClass1320.class);
        return c19935812zM;
    }

    public int getDeclarationCount() {
        return this.declaration_.size();
    }

    public C199437131n getFeatures() {
        C199437131n c199437131n = this.features_;
        return c199437131n == null ? C199437131n.getDefaultInstance() : c199437131n;
    }

    public AnonymousClass1326 getFeaturesOrBuilder() {
        C199437131n c199437131n = this.features_;
        return c199437131n == null ? C199437131n.getDefaultInstance() : c199437131n;
    }

    @Override // com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19925612xi
    public int getSerializedSize() {
        int i = this.LL;
        if (i != -1) {
            return i;
        }
        int iLJII = 0;
        for (int i2 = 0; i2 < this.declaration_.size(); i2++) {
            iLJII += AbstractC19928912yF.LJII(2, (InterfaceC19925612xi) ListProtector.get(this.declaration_, i2));
        }
        if ((this.LLILLJJLI & 2) != 0) {
            iLJII += AbstractC19928912yF.LJ(3, this.verification_);
        }
        if ((this.LLILLJJLI & 1) != 0) {
            iLJII += AbstractC19928912yF.LJII(50, getFeatures());
        }
        for (int i3 = 0; i3 < this.uninterpretedOption_.size(); i3++) {
            iLJII += AbstractC19928912yF.LJII(999, (InterfaceC19925612xi) ListProtector.get(this.uninterpretedOption_, i3));
        }
        int iLJIILLIIL = iLJII + LJIILLIIL() + getUnknownFields().getSerializedSize();
        this.LL = iLJIILLIIL;
        return iLJIILLIIL;
    }

    public int getUninterpretedOptionCount() {
        return this.uninterpretedOption_.size();
    }

    public EnumC199448131y getVerification() {
        EnumC199448131y enumC199448131yForNumber = EnumC199448131y.forNumber(this.verification_);
        return enumC199448131yForNumber == null ? EnumC199448131y.UNVERIFIED : enumC199448131yForNumber;
    }

    public boolean hasFeatures() {
        return (this.LLILLJJLI & 1) != 0;
    }

    public boolean hasVerification() {
        return (this.LLILLJJLI & 2) != 0;
    }

    @Override // X.AbstractC19932312yn
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = 779 + getDescriptor().hashCode();
        if (getUninterpretedOptionCount() > 0) {
            iHashCode = (((iHashCode * 37) + 999) * 53) + getUninterpretedOptionList().hashCode();
        }
        if (getDeclarationCount() > 0) {
            iHashCode = (((iHashCode * 37) + 2) * 53) + getDeclarationList().hashCode();
        }
        if (hasFeatures()) {
            iHashCode = (((iHashCode * 37) + 50) * 53) + getFeatures().hashCode();
        }
        if (hasVerification()) {
            iHashCode = (((iHashCode * 37) + 3) * 53) + this.verification_;
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
        for (int i = 0; i < getUninterpretedOptionCount(); i++) {
            if (!getUninterpretedOption(i).isInitialized()) {
                this.LLILLL = (byte) 0;
                return false;
            }
        }
        if (hasFeatures() && !getFeatures().isInitialized()) {
            this.LLILLL = (byte) 0;
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
    public AnonymousClass1320 toBuilder() {
        if (this == LLILZ) {
            return new AnonymousClass1320();
        }
        AnonymousClass1320 anonymousClass1320 = new AnonymousClass1320();
        anonymousClass1320.LJJIIZI(this);
        return anonymousClass1320;
    }

    public C199449131z() {
        this.verification_ = 1;
        this.LLILLL = (byte) -1;
        this.uninterpretedOption_ = Collections.emptyList();
        this.declaration_ = Collections.emptyList();
        this.verification_ = 1;
    }

    public static C199449131z getDefaultInstance() {
        return LLILZ;
    }

    public static final AnonymousClass1301 getDescriptor() {
        return C131K.LJIIIIZZ;
    }

    public static InterfaceC19925712xj<C199449131z> parser() {
        return LLILZIL;
    }

    public List<C132S> getDeclarationList() {
        return this.declaration_;
    }

    public List<? extends AnonymousClass1327> getDeclarationOrBuilderList() {
        return this.declaration_;
    }

    @Override // com.google.protobuf.k0, X.InterfaceC19925612xi
    public InterfaceC19925712xj<C199449131z> getParserForType() {
        return LLILZIL;
    }

    public List<C132O> getUninterpretedOptionList() {
        return this.uninterpretedOption_;
    }

    public List<? extends AnonymousClass1331> getUninterpretedOptionOrBuilderList() {
        return this.uninterpretedOption_;
    }

    @Override // X.AbstractC19933412yy, com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19916512wF
    public C199449131z getDefaultInstanceForType() {
        return LLILZ;
    }

    @Override // X.AbstractC19933412yy, com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19925612xi
    public AnonymousClass1320 newBuilderForType() {
        return newBuilder();
    }

    public C199449131z(AbstractC19933312yx abstractC19933312yx) {
        super(abstractC19933312yx);
        this.verification_ = 1;
        this.LLILLL = (byte) -1;
    }

    public static AnonymousClass1320 newBuilder(C199449131z c199449131z) {
        AnonymousClass1320 builder = LLILZ.toBuilder();
        builder.LJJIIZI(c199449131z);
        return builder;
    }

    public static C199449131z parseDelimitedFrom(InputStream inputStream) {
        return (C199449131z) k0.LJIIIIZZ(LLILZIL, inputStream);
    }

    public static C199449131z parseFrom(AbstractC19922812xG abstractC19922812xG) {
        return (C199449131z) LLILZIL.LJFF(abstractC19922812xG);
    }

    @Override // X.AbstractC19932312yn
    public final InterfaceC19931912yj LIZLLL(InterfaceC19935412zI interfaceC19935412zI) {
        return new AnonymousClass1320(interfaceC19935412zI);
    }

    @Override // X.AbstractC19932312yn
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C199449131z)) {
            return super.equals(obj);
        }
        C199449131z c199449131z = (C199449131z) obj;
        if (!getUninterpretedOptionList().equals(c199449131z.getUninterpretedOptionList()) || !getDeclarationList().equals(c199449131z.getDeclarationList()) || hasFeatures() != c199449131z.hasFeatures()) {
            return false;
        }
        if ((hasFeatures() && !getFeatures().equals(c199449131z.getFeatures())) || hasVerification() != c199449131z.hasVerification()) {
            return false;
        }
        if ((!hasVerification() || this.verification_ == c199449131z.verification_) && getUnknownFields().equals(c199449131z.getUnknownFields()) && LJIJ().equals(c199449131z.LJIJ())) {
            return true;
        }
        return false;
    }

    public C132S getDeclaration(int i) {
        return (C132S) ListProtector.get(this.declaration_, i);
    }

    public AnonymousClass1327 getDeclarationOrBuilder(int i) {
        return (AnonymousClass1327) ListProtector.get(this.declaration_, i);
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
        for (int i = 0; i < this.declaration_.size(); i++) {
            abstractC19928912yF.LJJIIJ(2, (InterfaceC19925612xi) ListProtector.get(this.declaration_, i));
        }
        if ((this.LLILLJJLI & 2) != 0) {
            abstractC19928912yF.LJJII(3, this.verification_);
        }
        if ((this.LLILLJJLI & 1) != 0) {
            abstractC19928912yF.LJJIIJ(50, getFeatures());
        }
        for (int i2 = 0; i2 < this.uninterpretedOption_.size(); i2++) {
            abstractC19928912yF.LJJIIJ(999, (InterfaceC19925612xi) ListProtector.get(this.uninterpretedOption_, i2));
        }
        c131aLJIJI.LIZ(536870912, abstractC19928912yF);
        getUnknownFields().writeTo(abstractC19928912yF);
    }

    public static C199449131z parseFrom(AbstractC19927312xz abstractC19927312xz) {
        return (C199449131z) k0.LJIIJ(LLILZIL, abstractC19927312xz);
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

    public static C199449131z parseFrom(InputStream inputStream) {
        return (C199449131z) k0.LJIIL(LLILZIL, inputStream);
    }

    public static C199449131z parseFrom(ByteBuffer byteBuffer) {
        return (C199449131z) LLILZIL.LJIIIZ(byteBuffer);
    }

    public static C199449131z parseFrom(byte[] bArr) {
        return (C199449131z) LLILZIL.LJIIJJI(bArr);
    }

    public static C199449131z parseDelimitedFrom(InputStream inputStream, C19926312xp c19926312xp) {
        return (C199449131z) k0.LJIIIZ(LLILZIL, inputStream, c19926312xp);
    }

    public static C199449131z parseFrom(byte[] bArr, C19926312xp c19926312xp) {
        AnonymousClass1322 anonymousClass1322 = LLILZIL;
        anonymousClass1322.getClass();
        InterfaceC19925612xi interfaceC19925612xiLJIILJJIL = anonymousClass1322.LJIILJJIL(bArr, bArr.length, c19926312xp);
        AbstractC19925812xk.LIZJ(interfaceC19925612xiLJIILJJIL);
        return (C199449131z) interfaceC19925612xiLJIILJJIL;
    }

    @Override // X.AbstractC19933412yy
    public Object getExtension(AbstractC19933212yw abstractC19933212yw, int i) {
        return getExtension((AbstractC19925412xg) abstractC19933212yw, i);
    }

    public static C199449131z parseFrom(AbstractC19922812xG abstractC19922812xG, C19926312xp c19926312xp) {
        return LLILZIL.LIZ(abstractC19922812xG, c19926312xp);
    }

    @Override // X.AbstractC19933412yy
    public Object getExtension(C19933612z0 c19933612z0, int i) {
        return getExtension((AbstractC19925412xg) c19933612z0, i);
    }

    public static C199449131z parseFrom(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) {
        return (C199449131z) k0.LJIIJJI(LLILZIL, abstractC19927312xz, c19926312xp);
    }

    public static C199449131z parseFrom(InputStream inputStream, C19926312xp c19926312xp) {
        return (C199449131z) k0.LJIILIIL(LLILZIL, inputStream, c19926312xp);
    }

    public static C199449131z parseFrom(ByteBuffer byteBuffer, C19926312xp c19926312xp) {
        return LLILZIL.LJIIJ(byteBuffer, c19926312xp);
    }
}
