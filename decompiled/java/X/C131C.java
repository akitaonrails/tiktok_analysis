package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.protobuf.k0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.131C, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C131C extends k0 implements InterfaceC199410130m {
    public static final C131C LLILZ;
    public static final C131E LLILZIL;
    public static final long serialVersionUID = 0;
    public int LLILLJJLI;
    public byte LLILLL;
    public volatile Object name_;
    public C131T options_;
    public C19920612wu reservedName_;
    public List<C132Y> reservedRange_;
    public List<C131J> value_;
    public int visibility_;

    /* JADX WARN: Type inference failed for: r0v2, types: [X.131E] */
    static {
        C19373810qu.LIZ(EnumC19373110qn.PUBLIC, "EnumDescriptorProto");
        LLILZ = new C131C();
        LLILZIL = new AbstractC19925812xk<C131C>() { // from class: X.131E
            @Override // X.InterfaceC19925712xj
            public final Object LIZIZ(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) throws C19926612xs {
                C131D c131dNewBuilder = C131C.newBuilder();
                try {
                    c131dNewBuilder.LJJIFFI(abstractC19927312xz, c19926312xp);
                    return c131dNewBuilder.buildPartial();
                } catch (C19918012wU e) {
                    TryCatchGuardChecker.doCheck(e);
                    C19926612xs c19926612xsAsInvalidProtocolBufferException = e.asInvalidProtocolBufferException();
                    c19926612xsAsInvalidProtocolBufferException.setUnfinishedMessage(c131dNewBuilder.buildPartial());
                    throw c19926612xsAsInvalidProtocolBufferException;
                } catch (C19926612xs e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    e2.setUnfinishedMessage(c131dNewBuilder.buildPartial());
                    throw e2;
                } catch (IOException e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    C19926612xs c19926612xs = new C19926612xs(e3);
                    c19926612xs.setUnfinishedMessage(c131dNewBuilder.buildPartial());
                    throw c19926612xs;
                }
            }
        };
    }

    public static C131D newBuilder() {
        return LLILZ.toBuilder();
    }

    @Override // com.google.protobuf.k0
    public final C19935812zM LJI() {
        C19935812zM c19935812zM = C131K.LJIIZILJ;
        c19935812zM.LIZ(C131C.class, C131D.class);
        return c19935812zM;
    }

    public String getName() {
        Object obj = this.name_;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC19922812xG abstractC19922812xG = (AbstractC19922812xG) obj;
        String stringUtf8 = abstractC19922812xG.toStringUtf8();
        if (abstractC19922812xG.isValidUtf8()) {
            this.name_ = stringUtf8;
        }
        return stringUtf8;
    }

    public AbstractC19922812xG getNameBytes() {
        Object obj = this.name_;
        if (!(obj instanceof String)) {
            return (AbstractC19922812xG) obj;
        }
        AbstractC19922812xG abstractC19922812xGCopyFromUtf8 = AbstractC19922812xG.copyFromUtf8((String) obj);
        this.name_ = abstractC19922812xGCopyFromUtf8;
        return abstractC19922812xGCopyFromUtf8;
    }

    public C131T getOptions() {
        C131T c131t = this.options_;
        return c131t == null ? C131T.getDefaultInstance() : c131t;
    }

    public C131F getOptionsOrBuilder() {
        C131T c131t = this.options_;
        return c131t == null ? C131T.getDefaultInstance() : c131t;
    }

    public int getReservedNameCount() {
        return this.reservedName_.size();
    }

    public int getReservedRangeCount() {
        return this.reservedRange_.size();
    }

    @Override // com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19925612xi
    public int getSerializedSize() {
        int i = this.LL;
        if (i != -1) {
            return i;
        }
        int iLJ = (this.LLILLJJLI & 1) != 0 ? k0.LJ(1, this.name_) : 0;
        for (int i2 = 0; i2 < this.value_.size(); i2++) {
            iLJ += AbstractC19928912yF.LJII(2, (InterfaceC19925612xi) ListProtector.get(this.value_, i2));
        }
        if ((this.LLILLJJLI & 2) != 0) {
            iLJ += AbstractC19928912yF.LJII(3, getOptions());
        }
        for (int i3 = 0; i3 < this.reservedRange_.size(); i3++) {
            iLJ += AbstractC19928912yF.LJII(4, (InterfaceC19925612xi) ListProtector.get(this.reservedRange_, i3));
        }
        int iLJFF = 0;
        for (int i4 = 0; i4 < this.reservedName_.size(); i4++) {
            iLJFF += k0.LJFF(this.reservedName_.LJJJLL(i4));
        }
        int size = iLJ + iLJFF + m93getReservedNameList().size();
        if ((this.LLILLJJLI & 4) != 0) {
            size += AbstractC19928912yF.LJ(6, this.visibility_);
        }
        int serializedSize = size + getUnknownFields().getSerializedSize();
        this.LL = serializedSize;
        return serializedSize;
    }

    public int getValueCount() {
        return this.value_.size();
    }

    public EnumC199405130h getVisibility() {
        EnumC199405130h enumC199405130hForNumber = EnumC199405130h.forNumber(this.visibility_);
        return enumC199405130hForNumber == null ? EnumC199405130h.VISIBILITY_UNSET : enumC199405130hForNumber;
    }

    public boolean hasName() {
        return (this.LLILLJJLI & 1) != 0;
    }

    public boolean hasOptions() {
        return (this.LLILLJJLI & 2) != 0;
    }

    public boolean hasVisibility() {
        return (this.LLILLJJLI & 4) != 0;
    }

    @Override // X.AbstractC19932312yn
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = 779 + getDescriptor().hashCode();
        if (hasName()) {
            iHashCode = (((iHashCode * 37) + 1) * 53) + getName().hashCode();
        }
        if (getValueCount() > 0) {
            iHashCode = (((iHashCode * 37) + 2) * 53) + getValueList().hashCode();
        }
        if (hasOptions()) {
            iHashCode = (((iHashCode * 37) + 3) * 53) + getOptions().hashCode();
        }
        if (getReservedRangeCount() > 0) {
            iHashCode = (((iHashCode * 37) + 4) * 53) + getReservedRangeList().hashCode();
        }
        if (getReservedNameCount() > 0) {
            iHashCode = (((iHashCode * 37) + 5) * 53) + m93getReservedNameList().hashCode();
        }
        if (hasVisibility()) {
            iHashCode = (((iHashCode * 37) + 6) * 53) + this.visibility_;
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
        for (int i = 0; i < getValueCount(); i++) {
            if (!getValue(i).isInitialized()) {
                this.LLILLL = (byte) 0;
                return false;
            }
        }
        if (!hasOptions() || getOptions().isInitialized()) {
            this.LLILLL = (byte) 1;
            return true;
        }
        this.LLILLL = (byte) 0;
        return false;
    }

    @Override // com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19925612xi
    public C131D toBuilder() {
        if (this == LLILZ) {
            return new C131D();
        }
        C131D c131d = new C131D();
        c131d.LJJII(this);
        return c131d;
    }

    public C131C() {
        this.name_ = "";
        C19920612wu c19920612wu = C19920612wu.LLILLL;
        this.reservedName_ = c19920612wu;
        this.visibility_ = 0;
        this.LLILLL = (byte) -1;
        this.name_ = "";
        this.value_ = Collections.emptyList();
        this.reservedRange_ = Collections.emptyList();
        this.reservedName_ = c19920612wu;
        this.visibility_ = 0;
    }

    public static C131C getDefaultInstance() {
        return LLILZ;
    }

    public static final AnonymousClass1301 getDescriptor() {
        return C131K.LJIILLIIL;
    }

    public static InterfaceC19925712xj<C131C> parser() {
        return LLILZIL;
    }

    @Override // com.google.protobuf.k0, X.InterfaceC19925612xi
    public InterfaceC19925712xj<C131C> getParserForType() {
        return LLILZIL;
    }

    public List<C132Y> getReservedRangeList() {
        return this.reservedRange_;
    }

    public List<? extends C131G> getReservedRangeOrBuilderList() {
        return this.reservedRange_;
    }

    public List<C131J> getValueList() {
        return this.value_;
    }

    public List<? extends C131H> getValueOrBuilderList() {
        return this.value_;
    }

    /* JADX INFO: renamed from: getReservedNameList, reason: merged with bridge method [inline-methods] */
    public InterfaceC1554550qYX m93getReservedNameList() {
        return this.reservedName_;
    }

    @Override // com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19916512wF
    public C131C getDefaultInstanceForType() {
        return LLILZ;
    }

    @Override // com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19925612xi
    public C131D newBuilderForType() {
        return newBuilder();
    }

    public C131C(AbstractC19933512yz abstractC19933512yz) {
        super(abstractC19933512yz);
        this.name_ = "";
        this.reservedName_ = C19920612wu.LLILLL;
        this.visibility_ = 0;
        this.LLILLL = (byte) -1;
    }

    public static C131D newBuilder(C131C c131c) {
        C131D builder = LLILZ.toBuilder();
        builder.LJJII(c131c);
        return builder;
    }

    public static C131C parseDelimitedFrom(InputStream inputStream) {
        return (C131C) k0.LJIIIIZZ(LLILZIL, inputStream);
    }

    public static C131C parseFrom(AbstractC19922812xG abstractC19922812xG) {
        return (C131C) LLILZIL.LJFF(abstractC19922812xG);
    }

    @Override // X.AbstractC19932312yn
    public final InterfaceC19931912yj LIZLLL(InterfaceC19935412zI interfaceC19935412zI) {
        return new C131D(interfaceC19935412zI);
    }

    @Override // X.AbstractC19932312yn
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C131C)) {
            return super.equals(obj);
        }
        C131C c131c = (C131C) obj;
        if (hasName() != c131c.hasName()) {
            return false;
        }
        if ((hasName() && !getName().equals(c131c.getName())) || !getValueList().equals(c131c.getValueList()) || hasOptions() != c131c.hasOptions()) {
            return false;
        }
        if ((hasOptions() && !getOptions().equals(c131c.getOptions())) || !getReservedRangeList().equals(c131c.getReservedRangeList()) || !m93getReservedNameList().equals(c131c.m93getReservedNameList()) || hasVisibility() != c131c.hasVisibility()) {
            return false;
        }
        if ((!hasVisibility() || this.visibility_ == c131c.visibility_) && getUnknownFields().equals(c131c.getUnknownFields())) {
            return true;
        }
        return false;
    }

    public String getReservedName(int i) {
        return this.reservedName_.get(i);
    }

    public AbstractC19922812xG getReservedNameBytes(int i) {
        return this.reservedName_.LJFF(i);
    }

    public C132Y getReservedRange(int i) {
        return (C132Y) ListProtector.get(this.reservedRange_, i);
    }

    public C131G getReservedRangeOrBuilder(int i) {
        return (C131G) ListProtector.get(this.reservedRange_, i);
    }

    public C131J getValue(int i) {
        return (C131J) ListProtector.get(this.value_, i);
    }

    public C131H getValueOrBuilder(int i) {
        return (C131H) ListProtector.get(this.value_, i);
    }

    @Override // com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19925612xi
    public void writeTo(AbstractC19928912yF abstractC19928912yF) {
        if ((this.LLILLJJLI & 1) != 0) {
            k0.LJIILJJIL(abstractC19928912yF, 1, this.name_);
        }
        for (int i = 0; i < this.value_.size(); i++) {
            abstractC19928912yF.LJJIIJ(2, (InterfaceC19925612xi) ListProtector.get(this.value_, i));
        }
        if ((this.LLILLJJLI & 2) != 0) {
            abstractC19928912yF.LJJIIJ(3, getOptions());
        }
        for (int i2 = 0; i2 < this.reservedRange_.size(); i2++) {
            abstractC19928912yF.LJJIIJ(4, (InterfaceC19925612xi) ListProtector.get(this.reservedRange_, i2));
        }
        for (int i3 = 0; i3 < this.reservedName_.size(); i3++) {
            k0.LJIILJJIL(abstractC19928912yF, 5, this.reservedName_.LJJJLL(i3));
        }
        if ((this.LLILLJJLI & 4) != 0) {
            abstractC19928912yF.LJJII(6, this.visibility_);
        }
        getUnknownFields().writeTo(abstractC19928912yF);
    }

    public static C131C parseFrom(AbstractC19927312xz abstractC19927312xz) {
        return (C131C) k0.LJIIJ(LLILZIL, abstractC19927312xz);
    }

    public static C131C parseFrom(InputStream inputStream) {
        return (C131C) k0.LJIIL(LLILZIL, inputStream);
    }

    public static C131C parseFrom(ByteBuffer byteBuffer) {
        return (C131C) LLILZIL.LJIIIZ(byteBuffer);
    }

    public static C131C parseFrom(byte[] bArr) {
        return (C131C) LLILZIL.LJIIJJI(bArr);
    }

    public static C131C parseDelimitedFrom(InputStream inputStream, C19926312xp c19926312xp) {
        return (C131C) k0.LJIIIZ(LLILZIL, inputStream, c19926312xp);
    }

    public static C131C parseFrom(byte[] bArr, C19926312xp c19926312xp) {
        C131E c131e = LLILZIL;
        c131e.getClass();
        InterfaceC19925612xi interfaceC19925612xiLJIILJJIL = c131e.LJIILJJIL(bArr, bArr.length, c19926312xp);
        AbstractC19925812xk.LIZJ(interfaceC19925612xiLJIILJJIL);
        return (C131C) interfaceC19925612xiLJIILJJIL;
    }

    public static C131C parseFrom(AbstractC19922812xG abstractC19922812xG, C19926312xp c19926312xp) {
        return LLILZIL.LIZ(abstractC19922812xG, c19926312xp);
    }

    public static C131C parseFrom(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) {
        return (C131C) k0.LJIIJJI(LLILZIL, abstractC19927312xz, c19926312xp);
    }

    public static C131C parseFrom(InputStream inputStream, C19926312xp c19926312xp) {
        return (C131C) k0.LJIILIIL(LLILZIL, inputStream, c19926312xp);
    }

    public static C131C parseFrom(ByteBuffer byteBuffer, C19926312xp c19926312xp) {
        return LLILZIL.LJIIJ(byteBuffer, c19926312xp);
    }
}
