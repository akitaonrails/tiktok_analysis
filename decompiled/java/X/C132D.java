package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.protobuf.k0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.132D, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C132D extends AbstractC19933412yy<C132D> implements InterfaceC199471132v {
    public static final C132D LLILZ;
    public static final C199460132k LLILZIL;
    public static final long serialVersionUID = 0;
    public int LLILLJJLI;
    public byte LLILLL;
    public boolean deprecated_;
    public C199437131n features_;
    public List<C132O> uninterpretedOption_;

    /* JADX WARN: Type inference failed for: r0v2, types: [X.132k] */
    static {
        C19373810qu.LIZ(EnumC19373110qn.PUBLIC, "ServiceOptions");
        LLILZ = new C132D();
        LLILZIL = new AbstractC19925812xk<C132D>() { // from class: X.132k
            @Override // X.InterfaceC19925712xj
            public final Object LIZIZ(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) throws C19926612xs {
                C132G c132gNewBuilder = C132D.newBuilder();
                try {
                    c132gNewBuilder.LJJIIZ(abstractC19927312xz, c19926312xp);
                    return c132gNewBuilder.buildPartial();
                } catch (C19918012wU e) {
                    TryCatchGuardChecker.doCheck(e);
                    C19926612xs c19926612xsAsInvalidProtocolBufferException = e.asInvalidProtocolBufferException();
                    c19926612xsAsInvalidProtocolBufferException.setUnfinishedMessage(c132gNewBuilder.buildPartial());
                    throw c19926612xsAsInvalidProtocolBufferException;
                } catch (C19926612xs e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    e2.setUnfinishedMessage(c132gNewBuilder.buildPartial());
                    throw e2;
                } catch (IOException e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    C19926612xs c19926612xs = new C19926612xs(e3);
                    c19926612xs.setUnfinishedMessage(c132gNewBuilder.buildPartial());
                    throw c19926612xs;
                }
            }
        };
    }

    public static C132G newBuilder() {
        return LLILZ.toBuilder();
    }

    @Override // com.google.protobuf.k0
    public final C19935812zM LJI() {
        C19935812zM c19935812zM = C131K.LJJJJ;
        c19935812zM.LIZ(C132D.class, C132G.class);
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
        int iLIZIZ = (this.LLILLJJLI & 2) != 0 ? AbstractC19928912yF.LIZIZ(33) : 0;
        if ((this.LLILLJJLI & 1) != 0) {
            iLIZIZ += AbstractC19928912yF.LJII(34, getFeatures());
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
        return (this.LLILLJJLI & 2) != 0;
    }

    public boolean hasFeatures() {
        return (this.LLILLJJLI & 1) != 0;
    }

    @Override // X.AbstractC19932312yn
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = 779 + getDescriptor().hashCode();
        if (hasFeatures()) {
            iHashCode = (((iHashCode * 37) + 34) * 53) + getFeatures().hashCode();
        }
        if (hasDeprecated()) {
            iHashCode = (((iHashCode * 37) + 33) * 53) + C19922012x8.LIZIZ(getDeprecated());
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
    public C132G toBuilder() {
        if (this == LLILZ) {
            return new C132G();
        }
        C132G c132g = new C132G();
        c132g.LJJIIJZLJL(this);
        return c132g;
    }

    public C132D() {
        this.LLILLL = (byte) -1;
        this.uninterpretedOption_ = Collections.emptyList();
    }

    public static C132D getDefaultInstance() {
        return LLILZ;
    }

    public static final AnonymousClass1301 getDescriptor() {
        return C131K.LJJJIL;
    }

    public static InterfaceC19925712xj<C132D> parser() {
        return LLILZIL;
    }

    public boolean getDeprecated() {
        return this.deprecated_;
    }

    @Override // com.google.protobuf.k0, X.InterfaceC19925612xi
    public InterfaceC19925712xj<C132D> getParserForType() {
        return LLILZIL;
    }

    public List<C132O> getUninterpretedOptionList() {
        return this.uninterpretedOption_;
    }

    public List<? extends AnonymousClass1331> getUninterpretedOptionOrBuilderList() {
        return this.uninterpretedOption_;
    }

    @Override // X.AbstractC19933412yy, com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19916512wF
    public C132D getDefaultInstanceForType() {
        return LLILZ;
    }

    @Override // X.AbstractC19933412yy, com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19925612xi
    public C132G newBuilderForType() {
        return newBuilder();
    }

    public C132D(AbstractC19933312yx abstractC19933312yx) {
        super(abstractC19933312yx);
        this.LLILLL = (byte) -1;
    }

    public static C132G newBuilder(C132D c132d) {
        C132G builder = LLILZ.toBuilder();
        builder.LJJIIJZLJL(c132d);
        return builder;
    }

    public static C132D parseDelimitedFrom(InputStream inputStream) {
        return (C132D) k0.LJIIIIZZ(LLILZIL, inputStream);
    }

    public static C132D parseFrom(AbstractC19922812xG abstractC19922812xG) {
        return (C132D) LLILZIL.LJFF(abstractC19922812xG);
    }

    @Override // X.AbstractC19932312yn
    public final InterfaceC19931912yj LIZLLL(InterfaceC19935412zI interfaceC19935412zI) {
        return new C132G(interfaceC19935412zI);
    }

    @Override // X.AbstractC19932312yn
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C132D)) {
            return super.equals(obj);
        }
        C132D c132d = (C132D) obj;
        if (hasFeatures() != c132d.hasFeatures()) {
            return false;
        }
        if ((hasFeatures() && !getFeatures().equals(c132d.getFeatures())) || hasDeprecated() != c132d.hasDeprecated()) {
            return false;
        }
        if ((!hasDeprecated() || getDeprecated() == c132d.getDeprecated()) && getUninterpretedOptionList().equals(c132d.getUninterpretedOptionList()) && getUnknownFields().equals(c132d.getUnknownFields()) && LJIJ().equals(c132d.LJIJ())) {
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
        if ((this.LLILLJJLI & 2) != 0) {
            abstractC19928912yF.LJIIZILJ(33, this.deprecated_);
        }
        if ((this.LLILLJJLI & 1) != 0) {
            abstractC19928912yF.LJJIIJ(34, getFeatures());
        }
        for (int i = 0; i < this.uninterpretedOption_.size(); i++) {
            abstractC19928912yF.LJJIIJ(999, (InterfaceC19925612xi) ListProtector.get(this.uninterpretedOption_, i));
        }
        c131aLJIJI.LIZ(536870912, abstractC19928912yF);
        getUnknownFields().writeTo(abstractC19928912yF);
    }

    public static C132D parseFrom(AbstractC19927312xz abstractC19927312xz) {
        return (C132D) k0.LJIIJ(LLILZIL, abstractC19927312xz);
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

    public static C132D parseFrom(InputStream inputStream) {
        return (C132D) k0.LJIIL(LLILZIL, inputStream);
    }

    public static C132D parseFrom(ByteBuffer byteBuffer) {
        return (C132D) LLILZIL.LJIIIZ(byteBuffer);
    }

    public static C132D parseFrom(byte[] bArr) {
        return (C132D) LLILZIL.LJIIJJI(bArr);
    }

    public static C132D parseDelimitedFrom(InputStream inputStream, C19926312xp c19926312xp) {
        return (C132D) k0.LJIIIZ(LLILZIL, inputStream, c19926312xp);
    }

    public static C132D parseFrom(byte[] bArr, C19926312xp c19926312xp) {
        C199460132k c199460132k = LLILZIL;
        c199460132k.getClass();
        InterfaceC19925612xi interfaceC19925612xiLJIILJJIL = c199460132k.LJIILJJIL(bArr, bArr.length, c19926312xp);
        AbstractC19925812xk.LIZJ(interfaceC19925612xiLJIILJJIL);
        return (C132D) interfaceC19925612xiLJIILJJIL;
    }

    @Override // X.AbstractC19933412yy
    public Object getExtension(AbstractC19933212yw abstractC19933212yw, int i) {
        return getExtension((AbstractC19925412xg) abstractC19933212yw, i);
    }

    public static C132D parseFrom(AbstractC19922812xG abstractC19922812xG, C19926312xp c19926312xp) {
        return LLILZIL.LIZ(abstractC19922812xG, c19926312xp);
    }

    @Override // X.AbstractC19933412yy
    public Object getExtension(C19933612z0 c19933612z0, int i) {
        return getExtension((AbstractC19925412xg) c19933612z0, i);
    }

    public static C132D parseFrom(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) {
        return (C132D) k0.LJIIJJI(LLILZIL, abstractC19927312xz, c19926312xp);
    }

    public static C132D parseFrom(InputStream inputStream, C19926312xp c19926312xp) {
        return (C132D) k0.LJIILIIL(LLILZIL, inputStream, c19926312xp);
    }

    public static C132D parseFrom(ByteBuffer byteBuffer, C19926312xp c19926312xp) {
        return LLILZIL.LJIIJ(byteBuffer, c19926312xp);
    }
}
