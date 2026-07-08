package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.protobuf.k0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.131X, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C131X extends AbstractC19933412yy<C131X> implements C131L {
    public static final C131X LLILZ;
    public static final C199427131d LLILZIL;
    public static final long serialVersionUID = 0;
    public int LLILLJJLI;
    public byte LLILLL;
    public boolean debugRedact_;
    public boolean deprecated_;
    public C199433131j featureSupport_;
    public C199437131n features_;
    public List<C132O> uninterpretedOption_;

    /* JADX WARN: Type inference failed for: r0v2, types: [X.131d] */
    static {
        C19373810qu.LIZ(EnumC19373110qn.PUBLIC, "EnumValueOptions");
        LLILZ = new C131X();
        LLILZIL = new AbstractC19925812xk<C131X>() { // from class: X.131d
            @Override // X.InterfaceC19925712xj
            public final Object LIZIZ(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) throws C19926612xs {
                C131W c131wNewBuilder = C131X.newBuilder();
                try {
                    c131wNewBuilder.LJJIIZ(abstractC19927312xz, c19926312xp);
                    return c131wNewBuilder.buildPartial();
                } catch (C19918012wU e) {
                    TryCatchGuardChecker.doCheck(e);
                    C19926612xs c19926612xsAsInvalidProtocolBufferException = e.asInvalidProtocolBufferException();
                    c19926612xsAsInvalidProtocolBufferException.setUnfinishedMessage(c131wNewBuilder.buildPartial());
                    throw c19926612xsAsInvalidProtocolBufferException;
                } catch (C19926612xs e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    e2.setUnfinishedMessage(c131wNewBuilder.buildPartial());
                    throw e2;
                } catch (IOException e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    C19926612xs c19926612xs = new C19926612xs(e3);
                    c19926612xs.setUnfinishedMessage(c131wNewBuilder.buildPartial());
                    throw c19926612xs;
                }
            }
        };
    }

    public static C131W newBuilder() {
        return LLILZ.toBuilder();
    }

    @Override // com.google.protobuf.k0
    public final C19935812zM LJI() {
        C19935812zM c19935812zM = C131K.LJJJI;
        c19935812zM.LIZ(C131X.class, C131W.class);
        return c19935812zM;
    }

    public C199433131j getFeatureSupport() {
        C199433131j c199433131j = this.featureSupport_;
        return c199433131j == null ? C199433131j.getDefaultInstance() : c199433131j;
    }

    public InterfaceC199432131i getFeatureSupportOrBuilder() {
        C199433131j c199433131j = this.featureSupport_;
        return c199433131j == null ? C199433131j.getDefaultInstance() : c199433131j;
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
        int iLIZIZ = (this.LLILLJJLI & 1) != 0 ? AbstractC19928912yF.LIZIZ(1) : 0;
        if ((this.LLILLJJLI & 2) != 0) {
            iLIZIZ += AbstractC19928912yF.LJII(2, getFeatures());
        }
        if ((this.LLILLJJLI & 4) != 0) {
            iLIZIZ += AbstractC19928912yF.LIZIZ(3);
        }
        if ((this.LLILLJJLI & 8) != 0) {
            iLIZIZ += AbstractC19928912yF.LJII(4, getFeatureSupport());
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

    public boolean hasDebugRedact() {
        return (this.LLILLJJLI & 4) != 0;
    }

    public boolean hasDeprecated() {
        return (this.LLILLJJLI & 1) != 0;
    }

    public boolean hasFeatureSupport() {
        return (this.LLILLJJLI & 8) != 0;
    }

    public boolean hasFeatures() {
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
            iHashCode = (((iHashCode * 37) + 1) * 53) + C19922012x8.LIZIZ(getDeprecated());
        }
        if (hasFeatures()) {
            iHashCode = (((iHashCode * 37) + 2) * 53) + getFeatures().hashCode();
        }
        if (hasDebugRedact()) {
            iHashCode = (((iHashCode * 37) + 3) * 53) + C19922012x8.LIZIZ(getDebugRedact());
        }
        if (hasFeatureSupport()) {
            iHashCode = (((iHashCode * 37) + 4) * 53) + getFeatureSupport().hashCode();
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
    public C131W toBuilder() {
        if (this == LLILZ) {
            return new C131W();
        }
        C131W c131w = new C131W();
        c131w.LJJIIZI(this);
        return c131w;
    }

    public C131X() {
        this.LLILLL = (byte) -1;
        this.uninterpretedOption_ = Collections.emptyList();
    }

    public static C131X getDefaultInstance() {
        return LLILZ;
    }

    public static final AnonymousClass1301 getDescriptor() {
        return C131K.LJJJ;
    }

    public static InterfaceC19925712xj<C131X> parser() {
        return LLILZIL;
    }

    public boolean getDebugRedact() {
        return this.debugRedact_;
    }

    public boolean getDeprecated() {
        return this.deprecated_;
    }

    @Override // com.google.protobuf.k0, X.InterfaceC19925612xi
    public InterfaceC19925712xj<C131X> getParserForType() {
        return LLILZIL;
    }

    public List<C132O> getUninterpretedOptionList() {
        return this.uninterpretedOption_;
    }

    public List<? extends AnonymousClass1331> getUninterpretedOptionOrBuilderList() {
        return this.uninterpretedOption_;
    }

    @Override // X.AbstractC19933412yy, com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19916512wF
    public C131X getDefaultInstanceForType() {
        return LLILZ;
    }

    @Override // X.AbstractC19933412yy, com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19925612xi
    public C131W newBuilderForType() {
        return newBuilder();
    }

    public C131X(AbstractC19933312yx abstractC19933312yx) {
        super(abstractC19933312yx);
        this.LLILLL = (byte) -1;
    }

    public static C131W newBuilder(C131X c131x) {
        C131W builder = LLILZ.toBuilder();
        builder.LJJIIZI(c131x);
        return builder;
    }

    public static C131X parseDelimitedFrom(InputStream inputStream) {
        return (C131X) k0.LJIIIIZZ(LLILZIL, inputStream);
    }

    public static C131X parseFrom(AbstractC19922812xG abstractC19922812xG) {
        return (C131X) LLILZIL.LJFF(abstractC19922812xG);
    }

    @Override // X.AbstractC19932312yn
    public final InterfaceC19931912yj LIZLLL(InterfaceC19935412zI interfaceC19935412zI) {
        return new C131W(interfaceC19935412zI);
    }

    @Override // X.AbstractC19932312yn
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C131X)) {
            return super.equals(obj);
        }
        C131X c131x = (C131X) obj;
        if (hasDeprecated() != c131x.hasDeprecated()) {
            return false;
        }
        if ((hasDeprecated() && getDeprecated() != c131x.getDeprecated()) || hasFeatures() != c131x.hasFeatures()) {
            return false;
        }
        if ((hasFeatures() && !getFeatures().equals(c131x.getFeatures())) || hasDebugRedact() != c131x.hasDebugRedact()) {
            return false;
        }
        if ((hasDebugRedact() && getDebugRedact() != c131x.getDebugRedact()) || hasFeatureSupport() != c131x.hasFeatureSupport()) {
            return false;
        }
        if ((!hasFeatureSupport() || getFeatureSupport().equals(c131x.getFeatureSupport())) && getUninterpretedOptionList().equals(c131x.getUninterpretedOptionList()) && getUnknownFields().equals(c131x.getUnknownFields()) && LJIJ().equals(c131x.LJIJ())) {
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
            abstractC19928912yF.LJIIZILJ(1, this.deprecated_);
        }
        if ((this.LLILLJJLI & 2) != 0) {
            abstractC19928912yF.LJJIIJ(2, getFeatures());
        }
        if ((this.LLILLJJLI & 4) != 0) {
            abstractC19928912yF.LJIIZILJ(3, this.debugRedact_);
        }
        if ((this.LLILLJJLI & 8) != 0) {
            abstractC19928912yF.LJJIIJ(4, getFeatureSupport());
        }
        for (int i = 0; i < this.uninterpretedOption_.size(); i++) {
            abstractC19928912yF.LJJIIJ(999, (InterfaceC19925612xi) ListProtector.get(this.uninterpretedOption_, i));
        }
        c131aLJIJI.LIZ(536870912, abstractC19928912yF);
        getUnknownFields().writeTo(abstractC19928912yF);
    }

    public static C131X parseFrom(AbstractC19927312xz abstractC19927312xz) {
        return (C131X) k0.LJIIJ(LLILZIL, abstractC19927312xz);
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

    public static C131X parseFrom(InputStream inputStream) {
        return (C131X) k0.LJIIL(LLILZIL, inputStream);
    }

    public static C131X parseFrom(ByteBuffer byteBuffer) {
        return (C131X) LLILZIL.LJIIIZ(byteBuffer);
    }

    public static C131X parseFrom(byte[] bArr) {
        return (C131X) LLILZIL.LJIIJJI(bArr);
    }

    public static C131X parseDelimitedFrom(InputStream inputStream, C19926312xp c19926312xp) {
        return (C131X) k0.LJIIIZ(LLILZIL, inputStream, c19926312xp);
    }

    public static C131X parseFrom(byte[] bArr, C19926312xp c19926312xp) {
        C199427131d c199427131d = LLILZIL;
        c199427131d.getClass();
        InterfaceC19925612xi interfaceC19925612xiLJIILJJIL = c199427131d.LJIILJJIL(bArr, bArr.length, c19926312xp);
        AbstractC19925812xk.LIZJ(interfaceC19925612xiLJIILJJIL);
        return (C131X) interfaceC19925612xiLJIILJJIL;
    }

    @Override // X.AbstractC19933412yy
    public Object getExtension(AbstractC19933212yw abstractC19933212yw, int i) {
        return getExtension((AbstractC19925412xg) abstractC19933212yw, i);
    }

    public static C131X parseFrom(AbstractC19922812xG abstractC19922812xG, C19926312xp c19926312xp) {
        return LLILZIL.LIZ(abstractC19922812xG, c19926312xp);
    }

    @Override // X.AbstractC19933412yy
    public Object getExtension(C19933612z0 c19933612z0, int i) {
        return getExtension((AbstractC19925412xg) c19933612z0, i);
    }

    public static C131X parseFrom(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) {
        return (C131X) k0.LJIIJJI(LLILZIL, abstractC19927312xz, c19926312xp);
    }

    public static C131X parseFrom(InputStream inputStream, C19926312xp c19926312xp) {
        return (C131X) k0.LJIILIIL(LLILZIL, inputStream, c19926312xp);
    }

    public static C131X parseFrom(ByteBuffer byteBuffer, C19926312xp c19926312xp) {
        return LLILZIL.LJIIJ(byteBuffer, c19926312xp);
    }
}
