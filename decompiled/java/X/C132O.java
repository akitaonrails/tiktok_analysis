package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.protobuf.k0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.132O, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C132O extends k0 implements AnonymousClass1331 {
    public static final C132O LLILZ;
    public static final C199465132p LLILZIL;
    public static final long serialVersionUID = 0;
    public int LLILLJJLI;
    public byte LLILLL;
    public volatile Object aggregateValue_;
    public double doubleValue_;
    public volatile Object identifierValue_;
    public List<C132U> name_;
    public long negativeIntValue_;
    public long positiveIntValue_;
    public AbstractC19922812xG stringValue_;

    /* JADX WARN: Type inference failed for: r0v2, types: [X.132p] */
    static {
        C19373810qu.LIZ(EnumC19373110qn.PUBLIC, "UninterpretedOption");
        LLILZ = new C132O();
        LLILZIL = new AbstractC19925812xk<C132O>() { // from class: X.132p
            @Override // X.InterfaceC19925712xj
            public final Object LIZIZ(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) throws C19926612xs {
                C132N c132nNewBuilder = C132O.newBuilder();
                try {
                    c132nNewBuilder.LJIL(abstractC19927312xz, c19926312xp);
                    return c132nNewBuilder.buildPartial();
                } catch (C19918012wU e) {
                    TryCatchGuardChecker.doCheck(e);
                    C19926612xs c19926612xsAsInvalidProtocolBufferException = e.asInvalidProtocolBufferException();
                    c19926612xsAsInvalidProtocolBufferException.setUnfinishedMessage(c132nNewBuilder.buildPartial());
                    throw c19926612xsAsInvalidProtocolBufferException;
                } catch (C19926612xs e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    e2.setUnfinishedMessage(c132nNewBuilder.buildPartial());
                    throw e2;
                } catch (IOException e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    C19926612xs c19926612xs = new C19926612xs(e3);
                    c19926612xs.setUnfinishedMessage(c132nNewBuilder.buildPartial());
                    throw c19926612xs;
                }
            }
        };
    }

    public static C132N newBuilder() {
        return LLILZ.toBuilder();
    }

    @Override // com.google.protobuf.k0
    public final C19935812zM LJI() {
        C19935812zM c19935812zM = C131K.LJJJJJL;
        c19935812zM.LIZ(C132O.class, C132N.class);
        return c19935812zM;
    }

    public String getAggregateValue() {
        Object obj = this.aggregateValue_;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC19922812xG abstractC19922812xG = (AbstractC19922812xG) obj;
        String stringUtf8 = abstractC19922812xG.toStringUtf8();
        if (abstractC19922812xG.isValidUtf8()) {
            this.aggregateValue_ = stringUtf8;
        }
        return stringUtf8;
    }

    public AbstractC19922812xG getAggregateValueBytes() {
        Object obj = this.aggregateValue_;
        if (!(obj instanceof String)) {
            return (AbstractC19922812xG) obj;
        }
        AbstractC19922812xG abstractC19922812xGCopyFromUtf8 = AbstractC19922812xG.copyFromUtf8((String) obj);
        this.aggregateValue_ = abstractC19922812xGCopyFromUtf8;
        return abstractC19922812xGCopyFromUtf8;
    }

    public String getIdentifierValue() {
        Object obj = this.identifierValue_;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC19922812xG abstractC19922812xG = (AbstractC19922812xG) obj;
        String stringUtf8 = abstractC19922812xG.toStringUtf8();
        if (abstractC19922812xG.isValidUtf8()) {
            this.identifierValue_ = stringUtf8;
        }
        return stringUtf8;
    }

    public AbstractC19922812xG getIdentifierValueBytes() {
        Object obj = this.identifierValue_;
        if (!(obj instanceof String)) {
            return (AbstractC19922812xG) obj;
        }
        AbstractC19922812xG abstractC19922812xGCopyFromUtf8 = AbstractC19922812xG.copyFromUtf8((String) obj);
        this.identifierValue_ = abstractC19922812xGCopyFromUtf8;
        return abstractC19922812xGCopyFromUtf8;
    }

    public int getNameCount() {
        return this.name_.size();
    }

    @Override // com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19925612xi
    public int getSerializedSize() {
        int i = this.LL;
        if (i != -1) {
            return i;
        }
        int iLJ = 0;
        for (int i2 = 0; i2 < this.name_.size(); i2++) {
            iLJ += AbstractC19928912yF.LJII(2, (InterfaceC19925612xi) ListProtector.get(this.name_, i2));
        }
        if ((this.LLILLJJLI & 1) != 0) {
            iLJ += k0.LJ(3, this.identifierValue_);
        }
        if ((this.LLILLJJLI & 2) != 0) {
            iLJ += AbstractC19928912yF.LJIIL(4) + AbstractC19928912yF.LJIILJJIL(this.positiveIntValue_);
        }
        if ((this.LLILLJJLI & 4) != 0) {
            iLJ += AbstractC19928912yF.LJIIL(5) + AbstractC19928912yF.LJIILJJIL(this.negativeIntValue_);
        }
        if ((this.LLILLJJLI & 8) != 0) {
            iLJ += AbstractC19928912yF.LJIIL(6) + 8;
        }
        if ((this.LLILLJJLI & 16) != 0) {
            iLJ += AbstractC19928912yF.LIZJ(7, this.stringValue_);
        }
        if ((this.LLILLJJLI & 32) != 0) {
            iLJ += k0.LJ(8, this.aggregateValue_);
        }
        int serializedSize = iLJ + getUnknownFields().getSerializedSize();
        this.LL = serializedSize;
        return serializedSize;
    }

    public boolean hasAggregateValue() {
        return (this.LLILLJJLI & 32) != 0;
    }

    public boolean hasDoubleValue() {
        return (this.LLILLJJLI & 8) != 0;
    }

    public boolean hasIdentifierValue() {
        return (this.LLILLJJLI & 1) != 0;
    }

    public boolean hasNegativeIntValue() {
        return (this.LLILLJJLI & 4) != 0;
    }

    public boolean hasPositiveIntValue() {
        return (this.LLILLJJLI & 2) != 0;
    }

    public boolean hasStringValue() {
        return (this.LLILLJJLI & 16) != 0;
    }

    @Override // X.AbstractC19932312yn
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = 779 + getDescriptor().hashCode();
        if (getNameCount() > 0) {
            iHashCode = (((iHashCode * 37) + 2) * 53) + getNameList().hashCode();
        }
        if (hasIdentifierValue()) {
            iHashCode = (((iHashCode * 37) + 3) * 53) + getIdentifierValue().hashCode();
        }
        if (hasPositiveIntValue()) {
            iHashCode = (((iHashCode * 37) + 4) * 53) + C19922012x8.LIZJ(getPositiveIntValue());
        }
        if (hasNegativeIntValue()) {
            iHashCode = (((iHashCode * 37) + 5) * 53) + C19922012x8.LIZJ(getNegativeIntValue());
        }
        if (hasDoubleValue()) {
            iHashCode = (((iHashCode * 37) + 6) * 53) + C19922012x8.LIZJ(Double.doubleToLongBits(getDoubleValue()));
        }
        if (hasStringValue()) {
            iHashCode = (((iHashCode * 37) + 7) * 53) + getStringValue().hashCode();
        }
        if (hasAggregateValue()) {
            iHashCode = (((iHashCode * 37) + 8) * 53) + getAggregateValue().hashCode();
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
        for (int i = 0; i < getNameCount(); i++) {
            if (!getName(i).isInitialized()) {
                this.LLILLL = (byte) 0;
                return false;
            }
        }
        this.LLILLL = (byte) 1;
        return true;
    }

    @Override // com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19925612xi
    public C132N toBuilder() {
        if (this == LLILZ) {
            return new C132N();
        }
        C132N c132n = new C132N();
        c132n.LJIJJLI(this);
        return c132n;
    }

    public C132O() {
        this.identifierValue_ = "";
        AbstractC19922812xG abstractC19922812xG = AbstractC19922812xG.EMPTY;
        this.stringValue_ = abstractC19922812xG;
        this.aggregateValue_ = "";
        this.LLILLL = (byte) -1;
        this.name_ = Collections.emptyList();
        this.identifierValue_ = "";
        this.stringValue_ = abstractC19922812xG;
        this.aggregateValue_ = "";
    }

    public static C132O getDefaultInstance() {
        return LLILZ;
    }

    public static final AnonymousClass1301 getDescriptor() {
        return C131K.LJJJJJ;
    }

    public static InterfaceC19925712xj<C132O> parser() {
        return LLILZIL;
    }

    public double getDoubleValue() {
        return this.doubleValue_;
    }

    public List<C132U> getNameList() {
        return this.name_;
    }

    public List<? extends InterfaceC199473132x> getNameOrBuilderList() {
        return this.name_;
    }

    public long getNegativeIntValue() {
        return this.negativeIntValue_;
    }

    @Override // com.google.protobuf.k0, X.InterfaceC19925612xi
    public InterfaceC19925712xj<C132O> getParserForType() {
        return LLILZIL;
    }

    public long getPositiveIntValue() {
        return this.positiveIntValue_;
    }

    public AbstractC19922812xG getStringValue() {
        return this.stringValue_;
    }

    @Override // com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19916512wF
    public C132O getDefaultInstanceForType() {
        return LLILZ;
    }

    @Override // com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19925612xi
    public C132N newBuilderForType() {
        return newBuilder();
    }

    public C132O(AbstractC19933512yz abstractC19933512yz) {
        super(abstractC19933512yz);
        this.identifierValue_ = "";
        this.stringValue_ = AbstractC19922812xG.EMPTY;
        this.aggregateValue_ = "";
        this.LLILLL = (byte) -1;
    }

    public static C132N newBuilder(C132O c132o) {
        C132N builder = LLILZ.toBuilder();
        builder.LJIJJLI(c132o);
        return builder;
    }

    public static C132O parseDelimitedFrom(InputStream inputStream) {
        return (C132O) k0.LJIIIIZZ(LLILZIL, inputStream);
    }

    public static C132O parseFrom(AbstractC19922812xG abstractC19922812xG) {
        return (C132O) LLILZIL.LJFF(abstractC19922812xG);
    }

    @Override // X.AbstractC19932312yn
    public final InterfaceC19931912yj LIZLLL(InterfaceC19935412zI interfaceC19935412zI) {
        return new C132N(interfaceC19935412zI);
    }

    @Override // X.AbstractC19932312yn
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C132O)) {
            return super.equals(obj);
        }
        C132O c132o = (C132O) obj;
        if (!getNameList().equals(c132o.getNameList()) || hasIdentifierValue() != c132o.hasIdentifierValue()) {
            return false;
        }
        if ((hasIdentifierValue() && !getIdentifierValue().equals(c132o.getIdentifierValue())) || hasPositiveIntValue() != c132o.hasPositiveIntValue()) {
            return false;
        }
        if ((hasPositiveIntValue() && getPositiveIntValue() != c132o.getPositiveIntValue()) || hasNegativeIntValue() != c132o.hasNegativeIntValue()) {
            return false;
        }
        if ((hasNegativeIntValue() && getNegativeIntValue() != c132o.getNegativeIntValue()) || hasDoubleValue() != c132o.hasDoubleValue()) {
            return false;
        }
        if ((hasDoubleValue() && Double.doubleToLongBits(getDoubleValue()) != Double.doubleToLongBits(c132o.getDoubleValue())) || hasStringValue() != c132o.hasStringValue()) {
            return false;
        }
        if ((hasStringValue() && !getStringValue().equals(c132o.getStringValue())) || hasAggregateValue() != c132o.hasAggregateValue()) {
            return false;
        }
        if ((!hasAggregateValue() || getAggregateValue().equals(c132o.getAggregateValue())) && getUnknownFields().equals(c132o.getUnknownFields())) {
            return true;
        }
        return false;
    }

    public C132U getName(int i) {
        return (C132U) ListProtector.get(this.name_, i);
    }

    public InterfaceC199473132x getNameOrBuilder(int i) {
        return (InterfaceC199473132x) ListProtector.get(this.name_, i);
    }

    @Override // com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19925612xi
    public void writeTo(AbstractC19928912yF abstractC19928912yF) {
        for (int i = 0; i < this.name_.size(); i++) {
            abstractC19928912yF.LJJIIJ(2, (InterfaceC19925612xi) ListProtector.get(this.name_, i));
        }
        if ((this.LLILLJJLI & 1) != 0) {
            k0.LJIILJJIL(abstractC19928912yF, 3, this.identifierValue_);
        }
        if ((this.LLILLJJLI & 2) != 0) {
            abstractC19928912yF.LJJIJLIJ(4, this.positiveIntValue_);
        }
        if ((this.LLILLJJLI & 4) != 0) {
            abstractC19928912yF.LJJIJLIJ(5, this.negativeIntValue_);
        }
        if ((this.LLILLJJLI & 8) != 0) {
            double d = this.doubleValue_;
            abstractC19928912yF.getClass();
            abstractC19928912yF.LJJ(6, Double.doubleToRawLongBits(d));
        }
        if ((this.LLILLJJLI & 16) != 0) {
            abstractC19928912yF.LJIJI(7, this.stringValue_);
        }
        if ((this.LLILLJJLI & 32) != 0) {
            k0.LJIILJJIL(abstractC19928912yF, 8, this.aggregateValue_);
        }
        getUnknownFields().writeTo(abstractC19928912yF);
    }

    public static C132O parseFrom(AbstractC19927312xz abstractC19927312xz) {
        return (C132O) k0.LJIIJ(LLILZIL, abstractC19927312xz);
    }

    public static C132O parseFrom(InputStream inputStream) {
        return (C132O) k0.LJIIL(LLILZIL, inputStream);
    }

    public static C132O parseFrom(ByteBuffer byteBuffer) {
        return (C132O) LLILZIL.LJIIIZ(byteBuffer);
    }

    public static C132O parseFrom(byte[] bArr) {
        return (C132O) LLILZIL.LJIIJJI(bArr);
    }

    public static C132O parseDelimitedFrom(InputStream inputStream, C19926312xp c19926312xp) {
        return (C132O) k0.LJIIIZ(LLILZIL, inputStream, c19926312xp);
    }

    public static C132O parseFrom(byte[] bArr, C19926312xp c19926312xp) {
        C199465132p c199465132p = LLILZIL;
        c199465132p.getClass();
        InterfaceC19925612xi interfaceC19925612xiLJIILJJIL = c199465132p.LJIILJJIL(bArr, bArr.length, c19926312xp);
        AbstractC19925812xk.LIZJ(interfaceC19925612xiLJIILJJIL);
        return (C132O) interfaceC19925612xiLJIILJJIL;
    }

    public static C132O parseFrom(AbstractC19922812xG abstractC19922812xG, C19926312xp c19926312xp) {
        return LLILZIL.LIZ(abstractC19922812xG, c19926312xp);
    }

    public static C132O parseFrom(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) {
        return (C132O) k0.LJIIJJI(LLILZIL, abstractC19927312xz, c19926312xp);
    }

    public static C132O parseFrom(InputStream inputStream, C19926312xp c19926312xp) {
        return (C132O) k0.LJIILIIL(LLILZIL, inputStream, c19926312xp);
    }

    public static C132O parseFrom(ByteBuffer byteBuffer, C19926312xp c19926312xp) {
        return LLILZIL.LJIIJ(byteBuffer, c19926312xp);
    }
}
