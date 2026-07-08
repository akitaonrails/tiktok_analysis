package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.protobuf.k0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.131T, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C131T extends AbstractC19933412yy<C131T> implements C131F {
    public static final C131T LLILZ;
    public static final C131V LLILZIL;
    public static final long serialVersionUID = 0;
    public int LLILLJJLI;
    public byte LLILLL;
    public boolean allowAlias_;
    public boolean deprecatedLegacyJsonFieldConflicts_;
    public boolean deprecated_;
    public C199437131n features_;
    public List<C132O> uninterpretedOption_;

    /* JADX WARN: Type inference failed for: r0v2, types: [X.131V] */
    static {
        C19373810qu.LIZ(EnumC19373110qn.PUBLIC, "EnumOptions");
        LLILZ = new C131T();
        LLILZIL = new AbstractC19925812xk<C131T>() { // from class: X.131V
            @Override // X.InterfaceC19925712xj
            public final Object LIZIZ(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) throws C19926612xs {
                C131U c131uNewBuilder = C131T.newBuilder();
                try {
                    c131uNewBuilder.LJJIIJZLJL(abstractC19927312xz, c19926312xp);
                    return c131uNewBuilder.buildPartial();
                } catch (C19918012wU e) {
                    TryCatchGuardChecker.doCheck(e);
                    C19926612xs c19926612xsAsInvalidProtocolBufferException = e.asInvalidProtocolBufferException();
                    c19926612xsAsInvalidProtocolBufferException.setUnfinishedMessage(c131uNewBuilder.buildPartial());
                    throw c19926612xsAsInvalidProtocolBufferException;
                } catch (C19926612xs e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    e2.setUnfinishedMessage(c131uNewBuilder.buildPartial());
                    throw e2;
                } catch (IOException e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    C19926612xs c19926612xs = new C19926612xs(e3);
                    c19926612xs.setUnfinishedMessage(c131uNewBuilder.buildPartial());
                    throw c19926612xs;
                }
            }
        };
    }

    public static C131U newBuilder() {
        return LLILZ.toBuilder();
    }

    @Override // com.google.protobuf.k0
    public final C19935812zM LJI() {
        C19935812zM c19935812zM = C131K.LJJIZ;
        c19935812zM.LIZ(C131T.class, C131U.class);
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

    @Override // com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19925612xi
    public int getSerializedSize() {
        int i = this.LL;
        if (i != -1) {
            return i;
        }
        int iLIZIZ = (this.LLILLJJLI & 1) != 0 ? AbstractC19928912yF.LIZIZ(2) : 0;
        if ((2 & this.LLILLJJLI) != 0) {
            iLIZIZ += AbstractC19928912yF.LIZIZ(3);
        }
        if ((this.LLILLJJLI & 4) != 0) {
            iLIZIZ += AbstractC19928912yF.LIZIZ(6);
        }
        if ((this.LLILLJJLI & 8) != 0) {
            iLIZIZ += AbstractC19928912yF.LJII(7, getFeatures());
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

    public boolean hasAllowAlias() {
        return (this.LLILLJJLI & 1) != 0;
    }

    public boolean hasDeprecated() {
        return (this.LLILLJJLI & 2) != 0;
    }

    public boolean hasDeprecatedLegacyJsonFieldConflicts() {
        return (this.LLILLJJLI & 4) != 0;
    }

    public boolean hasFeatures() {
        return (this.LLILLJJLI & 8) != 0;
    }

    @Override // X.AbstractC19932312yn
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = 779 + getDescriptor().hashCode();
        if (hasAllowAlias()) {
            iHashCode = (((iHashCode * 37) + 2) * 53) + C19922012x8.LIZIZ(getAllowAlias());
        }
        if (hasDeprecated()) {
            iHashCode = (((iHashCode * 37) + 3) * 53) + C19922012x8.LIZIZ(getDeprecated());
        }
        if (hasDeprecatedLegacyJsonFieldConflicts()) {
            iHashCode = (((iHashCode * 37) + 6) * 53) + C19922012x8.LIZIZ(getDeprecatedLegacyJsonFieldConflicts());
        }
        if (hasFeatures()) {
            iHashCode = (((iHashCode * 37) + 7) * 53) + getFeatures().hashCode();
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
    public C131U toBuilder() {
        if (this == LLILZ) {
            return new C131U();
        }
        C131U c131u = new C131U();
        c131u.LJJIIZ(this);
        return c131u;
    }

    public C131T() {
        this.LLILLL = (byte) -1;
        this.uninterpretedOption_ = Collections.emptyList();
    }

    public static C131T getDefaultInstance() {
        return LLILZ;
    }

    public static final AnonymousClass1301 getDescriptor() {
        return C131K.LJJIL;
    }

    public static InterfaceC19925712xj<C131T> parser() {
        return LLILZIL;
    }

    public boolean getAllowAlias() {
        return this.allowAlias_;
    }

    public boolean getDeprecated() {
        return this.deprecated_;
    }

    public boolean getDeprecatedLegacyJsonFieldConflicts() {
        return this.deprecatedLegacyJsonFieldConflicts_;
    }

    @Override // com.google.protobuf.k0, X.InterfaceC19925612xi
    public InterfaceC19925712xj<C131T> getParserForType() {
        return LLILZIL;
    }

    public List<C132O> getUninterpretedOptionList() {
        return this.uninterpretedOption_;
    }

    public List<? extends AnonymousClass1331> getUninterpretedOptionOrBuilderList() {
        return this.uninterpretedOption_;
    }

    @Override // X.AbstractC19933412yy, com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19916512wF
    public C131T getDefaultInstanceForType() {
        return LLILZ;
    }

    @Override // X.AbstractC19933412yy, com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19925612xi
    public C131U newBuilderForType() {
        return newBuilder();
    }

    public C131T(AbstractC19933312yx abstractC19933312yx) {
        super(abstractC19933312yx);
        this.LLILLL = (byte) -1;
    }

    public static C131U newBuilder(C131T c131t) {
        C131U builder = LLILZ.toBuilder();
        builder.LJJIIZ(c131t);
        return builder;
    }

    public static C131T parseDelimitedFrom(InputStream inputStream) {
        return (C131T) k0.LJIIIIZZ(LLILZIL, inputStream);
    }

    public static C131T parseFrom(AbstractC19922812xG abstractC19922812xG) {
        return (C131T) LLILZIL.LJFF(abstractC19922812xG);
    }

    @Override // X.AbstractC19932312yn
    public final InterfaceC19931912yj LIZLLL(InterfaceC19935412zI interfaceC19935412zI) {
        return new C131U(interfaceC19935412zI);
    }

    @Override // X.AbstractC19932312yn
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C131T)) {
            return super.equals(obj);
        }
        C131T c131t = (C131T) obj;
        if (hasAllowAlias() != c131t.hasAllowAlias()) {
            return false;
        }
        if ((hasAllowAlias() && getAllowAlias() != c131t.getAllowAlias()) || hasDeprecated() != c131t.hasDeprecated()) {
            return false;
        }
        if ((hasDeprecated() && getDeprecated() != c131t.getDeprecated()) || hasDeprecatedLegacyJsonFieldConflicts() != c131t.hasDeprecatedLegacyJsonFieldConflicts()) {
            return false;
        }
        if ((hasDeprecatedLegacyJsonFieldConflicts() && getDeprecatedLegacyJsonFieldConflicts() != c131t.getDeprecatedLegacyJsonFieldConflicts()) || hasFeatures() != c131t.hasFeatures()) {
            return false;
        }
        if ((!hasFeatures() || getFeatures().equals(c131t.getFeatures())) && getUninterpretedOptionList().equals(c131t.getUninterpretedOptionList()) && getUnknownFields().equals(c131t.getUnknownFields()) && LJIJ().equals(c131t.LJIJ())) {
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
            abstractC19928912yF.LJIIZILJ(2, this.allowAlias_);
        }
        if ((this.LLILLJJLI & 2) != 0) {
            abstractC19928912yF.LJIIZILJ(3, this.deprecated_);
        }
        if ((this.LLILLJJLI & 4) != 0) {
            abstractC19928912yF.LJIIZILJ(6, this.deprecatedLegacyJsonFieldConflicts_);
        }
        if ((this.LLILLJJLI & 8) != 0) {
            abstractC19928912yF.LJJIIJ(7, getFeatures());
        }
        for (int i = 0; i < this.uninterpretedOption_.size(); i++) {
            abstractC19928912yF.LJJIIJ(999, (InterfaceC19925612xi) ListProtector.get(this.uninterpretedOption_, i));
        }
        c131aLJIJI.LIZ(536870912, abstractC19928912yF);
        getUnknownFields().writeTo(abstractC19928912yF);
    }

    public static C131T parseFrom(AbstractC19927312xz abstractC19927312xz) {
        return (C131T) k0.LJIIJ(LLILZIL, abstractC19927312xz);
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

    public static C131T parseFrom(InputStream inputStream) {
        return (C131T) k0.LJIIL(LLILZIL, inputStream);
    }

    public static C131T parseFrom(ByteBuffer byteBuffer) {
        return (C131T) LLILZIL.LJIIIZ(byteBuffer);
    }

    public static C131T parseFrom(byte[] bArr) {
        return (C131T) LLILZIL.LJIIJJI(bArr);
    }

    public static C131T parseDelimitedFrom(InputStream inputStream, C19926312xp c19926312xp) {
        return (C131T) k0.LJIIIZ(LLILZIL, inputStream, c19926312xp);
    }

    public static C131T parseFrom(byte[] bArr, C19926312xp c19926312xp) {
        C131V c131v = LLILZIL;
        c131v.getClass();
        InterfaceC19925612xi interfaceC19925612xiLJIILJJIL = c131v.LJIILJJIL(bArr, bArr.length, c19926312xp);
        AbstractC19925812xk.LIZJ(interfaceC19925612xiLJIILJJIL);
        return (C131T) interfaceC19925612xiLJIILJJIL;
    }

    @Override // X.AbstractC19933412yy
    public Object getExtension(AbstractC19933212yw abstractC19933212yw, int i) {
        return getExtension((AbstractC19925412xg) abstractC19933212yw, i);
    }

    public static C131T parseFrom(AbstractC19922812xG abstractC19922812xG, C19926312xp c19926312xp) {
        return LLILZIL.LIZ(abstractC19922812xG, c19926312xp);
    }

    @Override // X.AbstractC19933412yy
    public Object getExtension(C19933612z0 c19933612z0, int i) {
        return getExtension((AbstractC19925412xg) c19933612z0, i);
    }

    public static C131T parseFrom(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) {
        return (C131T) k0.LJIIJJI(LLILZIL, abstractC19927312xz, c19926312xp);
    }

    public static C131T parseFrom(InputStream inputStream, C19926312xp c19926312xp) {
        return (C131T) k0.LJIILIIL(LLILZIL, inputStream, c19926312xp);
    }

    public static C131T parseFrom(ByteBuffer byteBuffer, C19926312xp c19926312xp) {
        return LLILZIL.LJIIJ(byteBuffer, c19926312xp);
    }
}
