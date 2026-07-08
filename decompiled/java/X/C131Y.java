package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.protobuf.k0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.131Y, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C131Y extends AbstractC19933412yy<C131Y> implements InterfaceC199415130r {
    public static final C131Y LLILZ;
    public static final C199418130u LLILZIL;
    public static final long serialVersionUID = 0;
    public static final InterfaceC19922112x9<C130I> targets_converter_;
    public int LLILLJJLI;
    public byte LLILLL;
    public int ctype_;
    public boolean debugRedact_;
    public boolean deprecated_;
    public List<C132V> editionDefaults_;
    public C199433131j featureSupport_;
    public C199437131n features_;
    public int jstype_;
    public boolean lazy_;
    public boolean packed_;
    public int retention_;
    public InterfaceC19922412xC targets_;
    public List<C132O> uninterpretedOption_;
    public boolean unverifiedLazy_;
    public boolean weak_;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.130u] */
    static {
        C19373810qu.LIZ(EnumC19373110qn.PUBLIC, "FieldOptions");
        targets_converter_ = new InterfaceC19922112x9<C130I>() { // from class: X.130K
        };
        LLILZ = new C131Y();
        LLILZIL = new AbstractC19925812xk<C131Y>() { // from class: X.130u
            @Override // X.InterfaceC19925712xj
            public final Object LIZIZ(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) throws C19926612xs {
                C131Z c131zNewBuilder = C131Y.newBuilder();
                try {
                    c131zNewBuilder.LJJIJIIJI(abstractC19927312xz, c19926312xp);
                    return c131zNewBuilder.buildPartial();
                } catch (C19918012wU e) {
                    TryCatchGuardChecker.doCheck(e);
                    C19926612xs c19926612xsAsInvalidProtocolBufferException = e.asInvalidProtocolBufferException();
                    c19926612xsAsInvalidProtocolBufferException.setUnfinishedMessage(c131zNewBuilder.buildPartial());
                    throw c19926612xsAsInvalidProtocolBufferException;
                } catch (C19926612xs e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    e2.setUnfinishedMessage(c131zNewBuilder.buildPartial());
                    throw e2;
                } catch (IOException e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    C19926612xs c19926612xs = new C19926612xs(e3);
                    c19926612xs.setUnfinishedMessage(c131zNewBuilder.buildPartial());
                    throw c19926612xs;
                }
            }
        };
    }

    public static C131Z newBuilder() {
        return LLILZ.toBuilder();
    }

    @Override // com.google.protobuf.k0
    public final C19935812zM LJI() {
        C19935812zM c19935812zM = C131K.LJJIIZI;
        c19935812zM.LIZ(C131Y.class, C131Z.class);
        return c19935812zM;
    }

    public EnumC199424131a getCtype() {
        EnumC199424131a enumC199424131aForNumber = EnumC199424131a.forNumber(this.ctype_);
        return enumC199424131aForNumber == null ? EnumC199424131a.STRING : enumC199424131aForNumber;
    }

    public int getEditionDefaultsCount() {
        return this.editionDefaults_.size();
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

    public EnumC199425131b getJstype() {
        EnumC199425131b enumC199425131bForNumber = EnumC199425131b.forNumber(this.jstype_);
        return enumC199425131bForNumber == null ? EnumC199425131b.JS_NORMAL : enumC199425131bForNumber;
    }

    public EnumC199426131c getRetention() {
        EnumC199426131c enumC199426131cForNumber = EnumC199426131c.forNumber(this.retention_);
        return enumC199426131cForNumber == null ? EnumC199426131c.RETENTION_UNKNOWN : enumC199426131cForNumber;
    }

    @Override // com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19925612xi
    public int getSerializedSize() {
        int i = this.LL;
        if (i != -1) {
            return i;
        }
        int iLJ = (this.LLILLJJLI & 1) != 0 ? AbstractC19928912yF.LJ(1, this.ctype_) : 0;
        if ((this.LLILLJJLI & 2) != 0) {
            iLJ += AbstractC19928912yF.LIZIZ(2);
        }
        if ((this.LLILLJJLI & 32) != 0) {
            iLJ += AbstractC19928912yF.LIZIZ(3);
        }
        if ((this.LLILLJJLI & 8) != 0) {
            iLJ += AbstractC19928912yF.LIZIZ(5);
        }
        if ((this.LLILLJJLI & 4) != 0) {
            iLJ += AbstractC19928912yF.LJ(6, this.jstype_);
        }
        if ((this.LLILLJJLI & 64) != 0) {
            iLJ += AbstractC19928912yF.LIZIZ(10);
        }
        if ((this.LLILLJJLI & 16) != 0) {
            iLJ += AbstractC19928912yF.LIZIZ(15);
        }
        if ((this.LLILLJJLI & 128) != 0) {
            iLJ += AbstractC19928912yF.LIZIZ(16);
        }
        if ((this.LLILLJJLI & 256) != 0) {
            iLJ += AbstractC19928912yF.LJ(17, this.retention_);
        }
        int iLJIILJJIL = 0;
        for (int i2 = 0; i2 < this.targets_.size(); i2++) {
            iLJIILJJIL += AbstractC19928912yF.LJIILJJIL(this.targets_.getInt(i2));
        }
        int size = iLJ + iLJIILJJIL + (this.targets_.size() * 2);
        for (int i3 = 0; i3 < this.editionDefaults_.size(); i3++) {
            size += AbstractC19928912yF.LJII(20, (InterfaceC19925612xi) ListProtector.get(this.editionDefaults_, i3));
        }
        if ((this.LLILLJJLI & 512) != 0) {
            size += AbstractC19928912yF.LJII(21, getFeatures());
        }
        if ((this.LLILLJJLI & 1024) != 0) {
            size += AbstractC19928912yF.LJII(22, getFeatureSupport());
        }
        for (int i4 = 0; i4 < this.uninterpretedOption_.size(); i4++) {
            size += AbstractC19928912yF.LJII(999, (InterfaceC19925612xi) ListProtector.get(this.uninterpretedOption_, i4));
        }
        int iLJIILLIIL = size + LJIILLIIL() + getUnknownFields().getSerializedSize();
        this.LL = iLJIILLIIL;
        return iLJIILLIIL;
    }

    public int getTargetsCount() {
        return this.targets_.size();
    }

    public List<C130I> getTargetsList() {
        final InterfaceC19922412xC interfaceC19922412xC = this.targets_;
        final InterfaceC19922112x9<C130I> interfaceC19922112x9 = targets_converter_;
        return new AbstractList<T>(interfaceC19922412xC, interfaceC19922112x9) { // from class: X.12xB
            public final InterfaceC19922412xC LL;
            public final InterfaceC19922112x9<T> LLILLJJLI;

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public final int size() {
                return this.LL.size();
            }

            @Override // java.util.AbstractList, java.util.List
            public final T get(int i) {
                InterfaceC19922112x9<T> interfaceC19922112x92 = this.LLILLJJLI;
                int i2 = this.LL.getInt(i);
                interfaceC19922112x92.getClass();
                T t = (T) C130I.forNumber(i2);
                if (t == null) {
                    return (T) C130I.TARGET_TYPE_UNKNOWN;
                }
                return t;
            }

            {
                this.LL = interfaceC19922412xC;
                this.LLILLJJLI = interfaceC19922112x9;
            }
        };
    }

    public int getUninterpretedOptionCount() {
        return this.uninterpretedOption_.size();
    }

    public boolean hasCtype() {
        return (this.LLILLJJLI & 1) != 0;
    }

    public boolean hasDebugRedact() {
        return (this.LLILLJJLI & 128) != 0;
    }

    public boolean hasDeprecated() {
        return (this.LLILLJJLI & 32) != 0;
    }

    public boolean hasFeatureSupport() {
        return (this.LLILLJJLI & 1024) != 0;
    }

    public boolean hasFeatures() {
        return (this.LLILLJJLI & 512) != 0;
    }

    public boolean hasJstype() {
        return (this.LLILLJJLI & 4) != 0;
    }

    public boolean hasLazy() {
        return (this.LLILLJJLI & 8) != 0;
    }

    public boolean hasPacked() {
        return (this.LLILLJJLI & 2) != 0;
    }

    public boolean hasRetention() {
        return (this.LLILLJJLI & 256) != 0;
    }

    public boolean hasUnverifiedLazy() {
        return (this.LLILLJJLI & 16) != 0;
    }

    public boolean hasWeak() {
        return (this.LLILLJJLI & 64) != 0;
    }

    @Override // X.AbstractC19932312yn
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = 779 + getDescriptor().hashCode();
        if (hasCtype()) {
            iHashCode = (((iHashCode * 37) + 1) * 53) + this.ctype_;
        }
        if (hasPacked()) {
            iHashCode = (((iHashCode * 37) + 2) * 53) + C19922012x8.LIZIZ(getPacked());
        }
        if (hasJstype()) {
            iHashCode = (((iHashCode * 37) + 6) * 53) + this.jstype_;
        }
        if (hasLazy()) {
            iHashCode = (((iHashCode * 37) + 5) * 53) + C19922012x8.LIZIZ(getLazy());
        }
        if (hasUnverifiedLazy()) {
            iHashCode = (((iHashCode * 37) + 15) * 53) + C19922012x8.LIZIZ(getUnverifiedLazy());
        }
        if (hasDeprecated()) {
            iHashCode = (((iHashCode * 37) + 3) * 53) + C19922012x8.LIZIZ(getDeprecated());
        }
        if (hasWeak()) {
            iHashCode = (((iHashCode * 37) + 10) * 53) + C19922012x8.LIZIZ(getWeak());
        }
        if (hasDebugRedact()) {
            iHashCode = (((iHashCode * 37) + 16) * 53) + C19922012x8.LIZIZ(getDebugRedact());
        }
        if (hasRetention()) {
            iHashCode = (((iHashCode * 37) + 17) * 53) + this.retention_;
        }
        if (getTargetsCount() > 0) {
            iHashCode = (((iHashCode * 37) + 19) * 53) + this.targets_.hashCode();
        }
        if (getEditionDefaultsCount() > 0) {
            iHashCode = (((iHashCode * 37) + 20) * 53) + getEditionDefaultsList().hashCode();
        }
        if (hasFeatures()) {
            iHashCode = (((iHashCode * 37) + 21) * 53) + getFeatures().hashCode();
        }
        if (hasFeatureSupport()) {
            iHashCode = (((iHashCode * 37) + 22) * 53) + getFeatureSupport().hashCode();
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
    public C131Z toBuilder() {
        if (this == LLILZ) {
            return new C131Z();
        }
        C131Z c131z = new C131Z();
        c131z.LJJIJ(this);
        return c131z;
    }

    public C131Y() {
        C19889012ro c19889012ro = C19889012ro.LLILZIL;
        this.LLILLL = (byte) -1;
        this.ctype_ = 0;
        this.jstype_ = 0;
        this.retention_ = 0;
        this.targets_ = c19889012ro;
        this.editionDefaults_ = Collections.emptyList();
        this.uninterpretedOption_ = Collections.emptyList();
    }

    public static C131Y getDefaultInstance() {
        return LLILZ;
    }

    public static final AnonymousClass1301 getDescriptor() {
        return C131K.LJJIIZ;
    }

    public static InterfaceC19925712xj<C131Y> parser() {
        return LLILZIL;
    }

    public boolean getDebugRedact() {
        return this.debugRedact_;
    }

    public boolean getDeprecated() {
        return this.deprecated_;
    }

    public List<C132V> getEditionDefaultsList() {
        return this.editionDefaults_;
    }

    public List<? extends InterfaceC199431131h> getEditionDefaultsOrBuilderList() {
        return this.editionDefaults_;
    }

    public boolean getLazy() {
        return this.lazy_;
    }

    public boolean getPacked() {
        return this.packed_;
    }

    @Override // com.google.protobuf.k0, X.InterfaceC19925612xi
    public InterfaceC19925712xj<C131Y> getParserForType() {
        return LLILZIL;
    }

    public List<C132O> getUninterpretedOptionList() {
        return this.uninterpretedOption_;
    }

    public List<? extends AnonymousClass1331> getUninterpretedOptionOrBuilderList() {
        return this.uninterpretedOption_;
    }

    public boolean getUnverifiedLazy() {
        return this.unverifiedLazy_;
    }

    public boolean getWeak() {
        return this.weak_;
    }

    @Override // X.AbstractC19933412yy, com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19916512wF
    public C131Y getDefaultInstanceForType() {
        return LLILZ;
    }

    @Override // X.AbstractC19933412yy, com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19925612xi
    public C131Z newBuilderForType() {
        return newBuilder();
    }

    public C131Y(AbstractC19933312yx abstractC19933312yx) {
        super(abstractC19933312yx);
        this.targets_ = C19889012ro.LLILZIL;
        this.LLILLL = (byte) -1;
    }

    public static C131Z newBuilder(C131Y c131y) {
        C131Z builder = LLILZ.toBuilder();
        builder.LJJIJ(c131y);
        return builder;
    }

    public static C131Y parseDelimitedFrom(InputStream inputStream) {
        return (C131Y) k0.LJIIIIZZ(LLILZIL, inputStream);
    }

    public static C131Y parseFrom(AbstractC19922812xG abstractC19922812xG) {
        return (C131Y) LLILZIL.LJFF(abstractC19922812xG);
    }

    @Override // X.AbstractC19932312yn
    public final InterfaceC19931912yj LIZLLL(InterfaceC19935412zI interfaceC19935412zI) {
        return new C131Z(interfaceC19935412zI);
    }

    @Override // X.AbstractC19932312yn
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C131Y)) {
            return super.equals(obj);
        }
        C131Y c131y = (C131Y) obj;
        if (hasCtype() != c131y.hasCtype()) {
            return false;
        }
        if ((hasCtype() && this.ctype_ != c131y.ctype_) || hasPacked() != c131y.hasPacked()) {
            return false;
        }
        if ((hasPacked() && getPacked() != c131y.getPacked()) || hasJstype() != c131y.hasJstype()) {
            return false;
        }
        if ((hasJstype() && this.jstype_ != c131y.jstype_) || hasLazy() != c131y.hasLazy()) {
            return false;
        }
        if ((hasLazy() && getLazy() != c131y.getLazy()) || hasUnverifiedLazy() != c131y.hasUnverifiedLazy()) {
            return false;
        }
        if ((hasUnverifiedLazy() && getUnverifiedLazy() != c131y.getUnverifiedLazy()) || hasDeprecated() != c131y.hasDeprecated()) {
            return false;
        }
        if ((hasDeprecated() && getDeprecated() != c131y.getDeprecated()) || hasWeak() != c131y.hasWeak()) {
            return false;
        }
        if ((hasWeak() && getWeak() != c131y.getWeak()) || hasDebugRedact() != c131y.hasDebugRedact()) {
            return false;
        }
        if ((hasDebugRedact() && getDebugRedact() != c131y.getDebugRedact()) || hasRetention() != c131y.hasRetention()) {
            return false;
        }
        if ((hasRetention() && this.retention_ != c131y.retention_) || !this.targets_.equals(c131y.targets_) || !getEditionDefaultsList().equals(c131y.getEditionDefaultsList()) || hasFeatures() != c131y.hasFeatures()) {
            return false;
        }
        if ((hasFeatures() && !getFeatures().equals(c131y.getFeatures())) || hasFeatureSupport() != c131y.hasFeatureSupport()) {
            return false;
        }
        if ((!hasFeatureSupport() || getFeatureSupport().equals(c131y.getFeatureSupport())) && getUninterpretedOptionList().equals(c131y.getUninterpretedOptionList()) && getUnknownFields().equals(c131y.getUnknownFields()) && LJIJ().equals(c131y.LJIJ())) {
            return true;
        }
        return false;
    }

    public C132V getEditionDefaults(int i) {
        return (C132V) ListProtector.get(this.editionDefaults_, i);
    }

    public InterfaceC199431131h getEditionDefaultsOrBuilder(int i) {
        return (InterfaceC199431131h) ListProtector.get(this.editionDefaults_, i);
    }

    @Override // X.AbstractC19933412yy
    public Object getExtension(AbstractC19933212yw abstractC19933212yw) {
        return getExtension((AbstractC19925412xg) abstractC19933212yw);
    }

    @Override // X.AbstractC19933412yy
    public int getExtensionCount(AbstractC19933212yw abstractC19933212yw) {
        return getExtensionCount((AbstractC19925412xg) abstractC19933212yw);
    }

    public C130I getTargets(int i) {
        InterfaceC19922112x9<C130I> interfaceC19922112x9 = targets_converter_;
        int i2 = this.targets_.getInt(i);
        interfaceC19922112x9.getClass();
        C130I c130iForNumber = C130I.forNumber(i2);
        if (c130iForNumber == null) {
            return C130I.TARGET_TYPE_UNKNOWN;
        }
        return c130iForNumber;
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
            abstractC19928912yF.LJJII(1, this.ctype_);
        }
        if ((this.LLILLJJLI & 2) != 0) {
            abstractC19928912yF.LJIIZILJ(2, this.packed_);
        }
        if ((this.LLILLJJLI & 32) != 0) {
            abstractC19928912yF.LJIIZILJ(3, this.deprecated_);
        }
        if ((this.LLILLJJLI & 8) != 0) {
            abstractC19928912yF.LJIIZILJ(5, this.lazy_);
        }
        if ((this.LLILLJJLI & 4) != 0) {
            abstractC19928912yF.LJJII(6, this.jstype_);
        }
        if ((this.LLILLJJLI & 64) != 0) {
            abstractC19928912yF.LJIIZILJ(10, this.weak_);
        }
        if ((this.LLILLJJLI & 16) != 0) {
            abstractC19928912yF.LJIIZILJ(15, this.unverifiedLazy_);
        }
        if ((this.LLILLJJLI & 128) != 0) {
            abstractC19928912yF.LJIIZILJ(16, this.debugRedact_);
        }
        if ((this.LLILLJJLI & 256) != 0) {
            abstractC19928912yF.LJJII(17, this.retention_);
        }
        for (int i = 0; i < this.targets_.size(); i++) {
            abstractC19928912yF.LJJII(19, this.targets_.getInt(i));
        }
        for (int i2 = 0; i2 < this.editionDefaults_.size(); i2++) {
            abstractC19928912yF.LJJIIJ(20, (InterfaceC19925612xi) ListProtector.get(this.editionDefaults_, i2));
        }
        if ((this.LLILLJJLI & 512) != 0) {
            abstractC19928912yF.LJJIIJ(21, getFeatures());
        }
        if ((this.LLILLJJLI & 1024) != 0) {
            abstractC19928912yF.LJJIIJ(22, getFeatureSupport());
        }
        for (int i3 = 0; i3 < this.uninterpretedOption_.size(); i3++) {
            abstractC19928912yF.LJJIIJ(999, (InterfaceC19925612xi) ListProtector.get(this.uninterpretedOption_, i3));
        }
        c131aLJIJI.LIZ(536870912, abstractC19928912yF);
        getUnknownFields().writeTo(abstractC19928912yF);
    }

    public static C131Y parseFrom(AbstractC19927312xz abstractC19927312xz) {
        return (C131Y) k0.LJIIJ(LLILZIL, abstractC19927312xz);
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

    public static C131Y parseFrom(InputStream inputStream) {
        return (C131Y) k0.LJIIL(LLILZIL, inputStream);
    }

    public static C131Y parseFrom(ByteBuffer byteBuffer) {
        return (C131Y) LLILZIL.LJIIIZ(byteBuffer);
    }

    public static C131Y parseFrom(byte[] bArr) {
        return (C131Y) LLILZIL.LJIIJJI(bArr);
    }

    public static C131Y parseDelimitedFrom(InputStream inputStream, C19926312xp c19926312xp) {
        return (C131Y) k0.LJIIIZ(LLILZIL, inputStream, c19926312xp);
    }

    public static C131Y parseFrom(byte[] bArr, C19926312xp c19926312xp) {
        C199418130u c199418130u = LLILZIL;
        c199418130u.getClass();
        InterfaceC19925612xi interfaceC19925612xiLJIILJJIL = c199418130u.LJIILJJIL(bArr, bArr.length, c19926312xp);
        AbstractC19925812xk.LIZJ(interfaceC19925612xiLJIILJJIL);
        return (C131Y) interfaceC19925612xiLJIILJJIL;
    }

    @Override // X.AbstractC19933412yy
    public Object getExtension(AbstractC19933212yw abstractC19933212yw, int i) {
        return getExtension((AbstractC19925412xg) abstractC19933212yw, i);
    }

    public static C131Y parseFrom(AbstractC19922812xG abstractC19922812xG, C19926312xp c19926312xp) {
        return LLILZIL.LIZ(abstractC19922812xG, c19926312xp);
    }

    @Override // X.AbstractC19933412yy
    public Object getExtension(C19933612z0 c19933612z0, int i) {
        return getExtension((AbstractC19925412xg) c19933612z0, i);
    }

    public static C131Y parseFrom(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) {
        return (C131Y) k0.LJIIJJI(LLILZIL, abstractC19927312xz, c19926312xp);
    }

    public static C131Y parseFrom(InputStream inputStream, C19926312xp c19926312xp) {
        return (C131Y) k0.LJIILIIL(LLILZIL, inputStream, c19926312xp);
    }

    public static C131Y parseFrom(ByteBuffer byteBuffer, C19926312xp c19926312xp) {
        return LLILZIL.LJIIJ(byteBuffer, c19926312xp);
    }
}
