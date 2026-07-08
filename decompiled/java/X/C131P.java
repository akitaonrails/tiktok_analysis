package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.protobuf.k0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.131P, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C131P extends AbstractC19933412yy<C131P> implements C131M {
    public static final C131P LLILZ;
    public static final C199416130s LLILZIL;
    public static final long serialVersionUID = 0;
    public int LLILLJJLI;
    public byte LLILLL;
    public boolean deprecatedLegacyJsonFieldConflicts_;
    public boolean deprecated_;
    public C199437131n features_;
    public boolean mapEntry_;
    public boolean messageSetWireFormat_;
    public boolean noStandardDescriptorAccessor_;
    public List<C132O> uninterpretedOption_;

    /* JADX WARN: Type inference failed for: r0v2, types: [X.130s] */
    static {
        C19373810qu.LIZ(EnumC19373110qn.PUBLIC, "MessageOptions");
        LLILZ = new C131P();
        LLILZIL = new AbstractC19925812xk<C131P>() { // from class: X.130s
            @Override // X.InterfaceC19925712xj
            public final Object LIZIZ(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) throws C19926612xs {
                C131Q c131qNewBuilder = C131P.newBuilder();
                try {
                    c131qNewBuilder.LJJIIZ(abstractC19927312xz, c19926312xp);
                    return c131qNewBuilder.buildPartial();
                } catch (C19918012wU e) {
                    TryCatchGuardChecker.doCheck(e);
                    C19926612xs c19926612xsAsInvalidProtocolBufferException = e.asInvalidProtocolBufferException();
                    c19926612xsAsInvalidProtocolBufferException.setUnfinishedMessage(c131qNewBuilder.buildPartial());
                    throw c19926612xsAsInvalidProtocolBufferException;
                } catch (C19926612xs e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    e2.setUnfinishedMessage(c131qNewBuilder.buildPartial());
                    throw e2;
                } catch (IOException e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    C19926612xs c19926612xs = new C19926612xs(e3);
                    c19926612xs.setUnfinishedMessage(c131qNewBuilder.buildPartial());
                    throw c19926612xs;
                }
            }
        };
    }

    public static C131Q newBuilder() {
        return LLILZ.toBuilder();
    }

    @Override // com.google.protobuf.k0
    public final C19935812zM LJI() {
        C19935812zM c19935812zM = C131K.LJJIIJZLJL;
        c19935812zM.LIZ(C131P.class, C131Q.class);
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
        int iLIZIZ = (this.LLILLJJLI & 1) != 0 ? AbstractC19928912yF.LIZIZ(1) : 0;
        if ((this.LLILLJJLI & 2) != 0) {
            iLIZIZ += AbstractC19928912yF.LIZIZ(2);
        }
        if ((this.LLILLJJLI & 4) != 0) {
            iLIZIZ += AbstractC19928912yF.LIZIZ(3);
        }
        if ((this.LLILLJJLI & 8) != 0) {
            iLIZIZ += AbstractC19928912yF.LIZIZ(7);
        }
        if ((this.LLILLJJLI & 16) != 0) {
            iLIZIZ += AbstractC19928912yF.LIZIZ(11);
        }
        if ((this.LLILLJJLI & 32) != 0) {
            iLIZIZ += AbstractC19928912yF.LJII(12, getFeatures());
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
        return (this.LLILLJJLI & 4) != 0;
    }

    public boolean hasDeprecatedLegacyJsonFieldConflicts() {
        return (this.LLILLJJLI & 16) != 0;
    }

    public boolean hasFeatures() {
        return (this.LLILLJJLI & 32) != 0;
    }

    public boolean hasMapEntry() {
        return (this.LLILLJJLI & 8) != 0;
    }

    public boolean hasMessageSetWireFormat() {
        return (this.LLILLJJLI & 1) != 0;
    }

    public boolean hasNoStandardDescriptorAccessor() {
        return (this.LLILLJJLI & 2) != 0;
    }

    @Override // X.AbstractC19932312yn
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = 779 + getDescriptor().hashCode();
        if (hasMessageSetWireFormat()) {
            iHashCode = (((iHashCode * 37) + 1) * 53) + C19922012x8.LIZIZ(getMessageSetWireFormat());
        }
        if (hasNoStandardDescriptorAccessor()) {
            iHashCode = (((iHashCode * 37) + 2) * 53) + C19922012x8.LIZIZ(getNoStandardDescriptorAccessor());
        }
        if (hasDeprecated()) {
            iHashCode = (((iHashCode * 37) + 3) * 53) + C19922012x8.LIZIZ(getDeprecated());
        }
        if (hasMapEntry()) {
            iHashCode = (((iHashCode * 37) + 7) * 53) + C19922012x8.LIZIZ(getMapEntry());
        }
        if (hasDeprecatedLegacyJsonFieldConflicts()) {
            iHashCode = (((iHashCode * 37) + 11) * 53) + C19922012x8.LIZIZ(getDeprecatedLegacyJsonFieldConflicts());
        }
        if (hasFeatures()) {
            iHashCode = (((iHashCode * 37) + 12) * 53) + getFeatures().hashCode();
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
    public C131Q toBuilder() {
        if (this == LLILZ) {
            return new C131Q();
        }
        C131Q c131q = new C131Q();
        c131q.LJJIIJZLJL(this);
        return c131q;
    }

    public C131P() {
        this.LLILLL = (byte) -1;
        this.uninterpretedOption_ = Collections.emptyList();
    }

    public static C131P getDefaultInstance() {
        return LLILZ;
    }

    public static final AnonymousClass1301 getDescriptor() {
        return C131K.LJJIIJ;
    }

    public static InterfaceC19925712xj<C131P> parser() {
        return LLILZIL;
    }

    public boolean getDeprecated() {
        return this.deprecated_;
    }

    public boolean getDeprecatedLegacyJsonFieldConflicts() {
        return this.deprecatedLegacyJsonFieldConflicts_;
    }

    public boolean getMapEntry() {
        return this.mapEntry_;
    }

    public boolean getMessageSetWireFormat() {
        return this.messageSetWireFormat_;
    }

    public boolean getNoStandardDescriptorAccessor() {
        return this.noStandardDescriptorAccessor_;
    }

    @Override // com.google.protobuf.k0, X.InterfaceC19925612xi
    public InterfaceC19925712xj<C131P> getParserForType() {
        return LLILZIL;
    }

    public List<C132O> getUninterpretedOptionList() {
        return this.uninterpretedOption_;
    }

    public List<? extends AnonymousClass1331> getUninterpretedOptionOrBuilderList() {
        return this.uninterpretedOption_;
    }

    @Override // X.AbstractC19933412yy, com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19916512wF
    public C131P getDefaultInstanceForType() {
        return LLILZ;
    }

    @Override // X.AbstractC19933412yy, com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19925612xi
    public C131Q newBuilderForType() {
        return newBuilder();
    }

    public C131P(AbstractC19933312yx abstractC19933312yx) {
        super(abstractC19933312yx);
        this.LLILLL = (byte) -1;
    }

    public static C131Q newBuilder(C131P c131p) {
        C131Q builder = LLILZ.toBuilder();
        builder.LJJIIJZLJL(c131p);
        return builder;
    }

    public static C131P parseDelimitedFrom(InputStream inputStream) {
        return (C131P) k0.LJIIIIZZ(LLILZIL, inputStream);
    }

    public static C131P parseFrom(AbstractC19922812xG abstractC19922812xG) {
        return (C131P) LLILZIL.LJFF(abstractC19922812xG);
    }

    @Override // X.AbstractC19932312yn
    public final InterfaceC19931912yj LIZLLL(InterfaceC19935412zI interfaceC19935412zI) {
        return new C131Q(interfaceC19935412zI);
    }

    @Override // X.AbstractC19932312yn
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C131P)) {
            return super.equals(obj);
        }
        C131P c131p = (C131P) obj;
        if (hasMessageSetWireFormat() != c131p.hasMessageSetWireFormat()) {
            return false;
        }
        if ((hasMessageSetWireFormat() && getMessageSetWireFormat() != c131p.getMessageSetWireFormat()) || hasNoStandardDescriptorAccessor() != c131p.hasNoStandardDescriptorAccessor()) {
            return false;
        }
        if ((hasNoStandardDescriptorAccessor() && getNoStandardDescriptorAccessor() != c131p.getNoStandardDescriptorAccessor()) || hasDeprecated() != c131p.hasDeprecated()) {
            return false;
        }
        if ((hasDeprecated() && getDeprecated() != c131p.getDeprecated()) || hasMapEntry() != c131p.hasMapEntry()) {
            return false;
        }
        if ((hasMapEntry() && getMapEntry() != c131p.getMapEntry()) || hasDeprecatedLegacyJsonFieldConflicts() != c131p.hasDeprecatedLegacyJsonFieldConflicts()) {
            return false;
        }
        if ((hasDeprecatedLegacyJsonFieldConflicts() && getDeprecatedLegacyJsonFieldConflicts() != c131p.getDeprecatedLegacyJsonFieldConflicts()) || hasFeatures() != c131p.hasFeatures()) {
            return false;
        }
        if ((!hasFeatures() || getFeatures().equals(c131p.getFeatures())) && getUninterpretedOptionList().equals(c131p.getUninterpretedOptionList()) && getUnknownFields().equals(c131p.getUnknownFields()) && LJIJ().equals(c131p.LJIJ())) {
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
            abstractC19928912yF.LJIIZILJ(1, this.messageSetWireFormat_);
        }
        if ((this.LLILLJJLI & 2) != 0) {
            abstractC19928912yF.LJIIZILJ(2, this.noStandardDescriptorAccessor_);
        }
        if ((this.LLILLJJLI & 4) != 0) {
            abstractC19928912yF.LJIIZILJ(3, this.deprecated_);
        }
        if ((this.LLILLJJLI & 8) != 0) {
            abstractC19928912yF.LJIIZILJ(7, this.mapEntry_);
        }
        if ((this.LLILLJJLI & 16) != 0) {
            abstractC19928912yF.LJIIZILJ(11, this.deprecatedLegacyJsonFieldConflicts_);
        }
        if ((this.LLILLJJLI & 32) != 0) {
            abstractC19928912yF.LJJIIJ(12, getFeatures());
        }
        for (int i = 0; i < this.uninterpretedOption_.size(); i++) {
            abstractC19928912yF.LJJIIJ(999, (InterfaceC19925612xi) ListProtector.get(this.uninterpretedOption_, i));
        }
        c131aLJIJI.LIZ(536870912, abstractC19928912yF);
        getUnknownFields().writeTo(abstractC19928912yF);
    }

    public static C131P parseFrom(AbstractC19927312xz abstractC19927312xz) {
        return (C131P) k0.LJIIJ(LLILZIL, abstractC19927312xz);
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

    public static C131P parseFrom(InputStream inputStream) {
        return (C131P) k0.LJIIL(LLILZIL, inputStream);
    }

    public static C131P parseFrom(ByteBuffer byteBuffer) {
        return (C131P) LLILZIL.LJIIIZ(byteBuffer);
    }

    public static C131P parseFrom(byte[] bArr) {
        return (C131P) LLILZIL.LJIIJJI(bArr);
    }

    public static C131P parseDelimitedFrom(InputStream inputStream, C19926312xp c19926312xp) {
        return (C131P) k0.LJIIIZ(LLILZIL, inputStream, c19926312xp);
    }

    public static C131P parseFrom(byte[] bArr, C19926312xp c19926312xp) {
        C199416130s c199416130s = LLILZIL;
        c199416130s.getClass();
        InterfaceC19925612xi interfaceC19925612xiLJIILJJIL = c199416130s.LJIILJJIL(bArr, bArr.length, c19926312xp);
        AbstractC19925812xk.LIZJ(interfaceC19925612xiLJIILJJIL);
        return (C131P) interfaceC19925612xiLJIILJJIL;
    }

    @Override // X.AbstractC19933412yy
    public Object getExtension(AbstractC19933212yw abstractC19933212yw, int i) {
        return getExtension((AbstractC19925412xg) abstractC19933212yw, i);
    }

    public static C131P parseFrom(AbstractC19922812xG abstractC19922812xG, C19926312xp c19926312xp) {
        return LLILZIL.LIZ(abstractC19922812xG, c19926312xp);
    }

    @Override // X.AbstractC19933412yy
    public Object getExtension(C19933612z0 c19933612z0, int i) {
        return getExtension((AbstractC19925412xg) c19933612z0, i);
    }

    public static C131P parseFrom(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) {
        return (C131P) k0.LJIIJJI(LLILZIL, abstractC19927312xz, c19926312xp);
    }

    public static C131P parseFrom(InputStream inputStream, C19926312xp c19926312xp) {
        return (C131P) k0.LJIILIIL(LLILZIL, inputStream, c19926312xp);
    }

    public static C131P parseFrom(ByteBuffer byteBuffer, C19926312xp c19926312xp) {
        return LLILZIL.LJIIJ(byteBuffer, c19926312xp);
    }
}
