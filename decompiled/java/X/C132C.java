package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.protobuf.k0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.132C, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C132C extends AbstractC19933412yy<C132C> implements InterfaceC199470132u {
    public static final C132C LLILZ;
    public static final C199458132i LLILZIL;
    public static final long serialVersionUID = 0;
    public int LLILLJJLI;
    public byte LLILLL;
    public C199437131n features_;
    public List<C132O> uninterpretedOption_;

    /* JADX WARN: Type inference failed for: r0v2, types: [X.132i] */
    static {
        C19373810qu.LIZ(EnumC19373110qn.PUBLIC, "OneofOptions");
        LLILZ = new C132C();
        LLILZIL = new AbstractC19925812xk<C132C>() { // from class: X.132i
            @Override // X.InterfaceC19925712xj
            public final Object LIZIZ(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) throws C19926612xs {
                C132B c132bNewBuilder = C132C.newBuilder();
                try {
                    c132bNewBuilder.LJJIIZ(abstractC19927312xz, c19926312xp);
                    return c132bNewBuilder.buildPartial();
                } catch (C19918012wU e) {
                    TryCatchGuardChecker.doCheck(e);
                    C19926612xs c19926612xsAsInvalidProtocolBufferException = e.asInvalidProtocolBufferException();
                    c19926612xsAsInvalidProtocolBufferException.setUnfinishedMessage(c132bNewBuilder.buildPartial());
                    throw c19926612xsAsInvalidProtocolBufferException;
                } catch (C19926612xs e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    e2.setUnfinishedMessage(c132bNewBuilder.buildPartial());
                    throw e2;
                } catch (IOException e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    C19926612xs c19926612xs = new C19926612xs(e3);
                    c19926612xs.setUnfinishedMessage(c132bNewBuilder.buildPartial());
                    throw c19926612xs;
                }
            }
        };
    }

    public static C132B newBuilder() {
        return LLILZ.toBuilder();
    }

    @Override // com.google.protobuf.k0
    public final C19935812zM LJI() {
        C19935812zM c19935812zM = C131K.LJJIJLIJ;
        c19935812zM.LIZ(C132C.class, C132B.class);
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
        int iLJII = (this.LLILLJJLI & 1) != 0 ? AbstractC19928912yF.LJII(1, getFeatures()) : 0;
        for (int i2 = 0; i2 < this.uninterpretedOption_.size(); i2++) {
            iLJII += AbstractC19928912yF.LJII(999, (InterfaceC19925612xi) ListProtector.get(this.uninterpretedOption_, i2));
        }
        int iLJIILLIIL = iLJII + LJIILLIIL() + getUnknownFields().getSerializedSize();
        this.LL = iLJIILLIIL;
        return iLJIILLIIL;
    }

    public int getUninterpretedOptionCount() {
        return this.uninterpretedOption_.size();
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
            iHashCode = (((iHashCode * 37) + 1) * 53) + getFeatures().hashCode();
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
    public C132B toBuilder() {
        if (this == LLILZ) {
            return new C132B();
        }
        C132B c132b = new C132B();
        c132b.LJJIIJZLJL(this);
        return c132b;
    }

    public C132C() {
        this.LLILLL = (byte) -1;
        this.uninterpretedOption_ = Collections.emptyList();
    }

    public static C132C getDefaultInstance() {
        return LLILZ;
    }

    public static final AnonymousClass1301 getDescriptor() {
        return C131K.LJJIJL;
    }

    public static InterfaceC19925712xj<C132C> parser() {
        return LLILZIL;
    }

    @Override // com.google.protobuf.k0, X.InterfaceC19925612xi
    public InterfaceC19925712xj<C132C> getParserForType() {
        return LLILZIL;
    }

    public List<C132O> getUninterpretedOptionList() {
        return this.uninterpretedOption_;
    }

    public List<? extends AnonymousClass1331> getUninterpretedOptionOrBuilderList() {
        return this.uninterpretedOption_;
    }

    @Override // X.AbstractC19933412yy, com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19916512wF
    public C132C getDefaultInstanceForType() {
        return LLILZ;
    }

    @Override // X.AbstractC19933412yy, com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19925612xi
    public C132B newBuilderForType() {
        return newBuilder();
    }

    public C132C(AbstractC19933312yx abstractC19933312yx) {
        super(abstractC19933312yx);
        this.LLILLL = (byte) -1;
    }

    public static C132B newBuilder(C132C c132c) {
        C132B builder = LLILZ.toBuilder();
        builder.LJJIIJZLJL(c132c);
        return builder;
    }

    public static C132C parseDelimitedFrom(InputStream inputStream) {
        return (C132C) k0.LJIIIIZZ(LLILZIL, inputStream);
    }

    public static C132C parseFrom(AbstractC19922812xG abstractC19922812xG) {
        return (C132C) LLILZIL.LJFF(abstractC19922812xG);
    }

    @Override // X.AbstractC19932312yn
    public final InterfaceC19931912yj LIZLLL(InterfaceC19935412zI interfaceC19935412zI) {
        return new C132B(interfaceC19935412zI);
    }

    @Override // X.AbstractC19932312yn
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C132C)) {
            return super.equals(obj);
        }
        C132C c132c = (C132C) obj;
        if (hasFeatures() != c132c.hasFeatures()) {
            return false;
        }
        if ((!hasFeatures() || getFeatures().equals(c132c.getFeatures())) && getUninterpretedOptionList().equals(c132c.getUninterpretedOptionList()) && getUnknownFields().equals(c132c.getUnknownFields()) && LJIJ().equals(c132c.LJIJ())) {
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
            abstractC19928912yF.LJJIIJ(1, getFeatures());
        }
        for (int i = 0; i < this.uninterpretedOption_.size(); i++) {
            abstractC19928912yF.LJJIIJ(999, (InterfaceC19925612xi) ListProtector.get(this.uninterpretedOption_, i));
        }
        c131aLJIJI.LIZ(536870912, abstractC19928912yF);
        getUnknownFields().writeTo(abstractC19928912yF);
    }

    public static C132C parseFrom(AbstractC19927312xz abstractC19927312xz) {
        return (C132C) k0.LJIIJ(LLILZIL, abstractC19927312xz);
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

    public static C132C parseFrom(InputStream inputStream) {
        return (C132C) k0.LJIIL(LLILZIL, inputStream);
    }

    public static C132C parseFrom(ByteBuffer byteBuffer) {
        return (C132C) LLILZIL.LJIIIZ(byteBuffer);
    }

    public static C132C parseFrom(byte[] bArr) {
        return (C132C) LLILZIL.LJIIJJI(bArr);
    }

    public static C132C parseDelimitedFrom(InputStream inputStream, C19926312xp c19926312xp) {
        return (C132C) k0.LJIIIZ(LLILZIL, inputStream, c19926312xp);
    }

    public static C132C parseFrom(byte[] bArr, C19926312xp c19926312xp) {
        C199458132i c199458132i = LLILZIL;
        c199458132i.getClass();
        InterfaceC19925612xi interfaceC19925612xiLJIILJJIL = c199458132i.LJIILJJIL(bArr, bArr.length, c19926312xp);
        AbstractC19925812xk.LIZJ(interfaceC19925612xiLJIILJJIL);
        return (C132C) interfaceC19925612xiLJIILJJIL;
    }

    @Override // X.AbstractC19933412yy
    public Object getExtension(AbstractC19933212yw abstractC19933212yw, int i) {
        return getExtension((AbstractC19925412xg) abstractC19933212yw, i);
    }

    public static C132C parseFrom(AbstractC19922812xG abstractC19922812xG, C19926312xp c19926312xp) {
        return LLILZIL.LIZ(abstractC19922812xG, c19926312xp);
    }

    @Override // X.AbstractC19933412yy
    public Object getExtension(C19933612z0 c19933612z0, int i) {
        return getExtension((AbstractC19925412xg) c19933612z0, i);
    }

    public static C132C parseFrom(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) {
        return (C132C) k0.LJIIJJI(LLILZIL, abstractC19927312xz, c19926312xp);
    }

    public static C132C parseFrom(InputStream inputStream, C19926312xp c19926312xp) {
        return (C132C) k0.LJIILIIL(LLILZIL, inputStream, c19926312xp);
    }

    public static C132C parseFrom(ByteBuffer byteBuffer, C19926312xp c19926312xp) {
        return LLILZIL.LJIIJ(byteBuffer, c19926312xp);
    }
}
