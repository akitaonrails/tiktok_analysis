package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.protobuf.k0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.130f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C199403130f extends k0 implements InterfaceC199409130l {
    public static final C199403130f LLILZ;
    public static final C130L LLILZIL;
    public static final long serialVersionUID = 0;
    public int LLILLJJLI;
    public byte LLILLL;
    public List<C131C> enumType_;
    public List<C199419130v> extensionRange_;
    public List<C199412130o> extension_;
    public List<C199412130o> field_;
    public volatile Object name_;
    public List<C199403130f> nestedType_;
    public List<C132P> oneofDecl_;
    public C131P options_;
    public C19920612wu reservedName_;
    public List<C132X> reservedRange_;
    public int visibility_;

    /* JADX WARN: Type inference failed for: r0v2, types: [X.130L] */
    static {
        C19373810qu.LIZ(EnumC19373110qn.PUBLIC, "DescriptorProto");
        LLILZ = new C199403130f();
        LLILZIL = new AbstractC19925812xk<C199403130f>() { // from class: X.130L
            @Override // X.InterfaceC19925712xj
            public final Object LIZIZ(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) throws C19926612xs {
                C199404130g c199404130gNewBuilder = C199403130f.newBuilder();
                try {
                    c199404130gNewBuilder.LJJIJ(abstractC19927312xz, c19926312xp);
                    return c199404130gNewBuilder.buildPartial();
                } catch (C19918012wU e) {
                    TryCatchGuardChecker.doCheck(e);
                    C19926612xs c19926612xsAsInvalidProtocolBufferException = e.asInvalidProtocolBufferException();
                    c19926612xsAsInvalidProtocolBufferException.setUnfinishedMessage(c199404130gNewBuilder.buildPartial());
                    throw c19926612xsAsInvalidProtocolBufferException;
                } catch (C19926612xs e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    e2.setUnfinishedMessage(c199404130gNewBuilder.buildPartial());
                    throw e2;
                } catch (IOException e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    C19926612xs c19926612xs = new C19926612xs(e3);
                    c19926612xs.setUnfinishedMessage(c199404130gNewBuilder.buildPartial());
                    throw c19926612xs;
                }
            }
        };
    }

    public static C199404130g newBuilder() {
        return LLILZ.toBuilder();
    }

    @Override // com.google.protobuf.k0
    public final C19935812zM LJI() {
        C19935812zM c19935812zM = C131K.LIZLLL;
        c19935812zM.LIZ(C199403130f.class, C199404130g.class);
        return c19935812zM;
    }

    public int getEnumTypeCount() {
        return this.enumType_.size();
    }

    public int getExtensionCount() {
        return this.extension_.size();
    }

    public int getExtensionRangeCount() {
        return this.extensionRange_.size();
    }

    public int getFieldCount() {
        return this.field_.size();
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

    public int getNestedTypeCount() {
        return this.nestedType_.size();
    }

    public int getOneofDeclCount() {
        return this.oneofDecl_.size();
    }

    public C131P getOptions() {
        C131P c131p = this.options_;
        return c131p == null ? C131P.getDefaultInstance() : c131p;
    }

    public C131M getOptionsOrBuilder() {
        C131P c131p = this.options_;
        return c131p == null ? C131P.getDefaultInstance() : c131p;
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
        for (int i2 = 0; i2 < this.field_.size(); i2++) {
            iLJ += AbstractC19928912yF.LJII(2, (InterfaceC19925612xi) ListProtector.get(this.field_, i2));
        }
        for (int i3 = 0; i3 < this.nestedType_.size(); i3++) {
            iLJ += AbstractC19928912yF.LJII(3, (InterfaceC19925612xi) ListProtector.get(this.nestedType_, i3));
        }
        for (int i4 = 0; i4 < this.enumType_.size(); i4++) {
            iLJ += AbstractC19928912yF.LJII(4, (InterfaceC19925612xi) ListProtector.get(this.enumType_, i4));
        }
        for (int i5 = 0; i5 < this.extensionRange_.size(); i5++) {
            iLJ += AbstractC19928912yF.LJII(5, (InterfaceC19925612xi) ListProtector.get(this.extensionRange_, i5));
        }
        for (int i6 = 0; i6 < this.extension_.size(); i6++) {
            iLJ += AbstractC19928912yF.LJII(6, (InterfaceC19925612xi) ListProtector.get(this.extension_, i6));
        }
        if ((this.LLILLJJLI & 2) != 0) {
            iLJ += AbstractC19928912yF.LJII(7, getOptions());
        }
        for (int i7 = 0; i7 < this.oneofDecl_.size(); i7++) {
            iLJ += AbstractC19928912yF.LJII(8, (InterfaceC19925612xi) ListProtector.get(this.oneofDecl_, i7));
        }
        for (int i8 = 0; i8 < this.reservedRange_.size(); i8++) {
            iLJ += AbstractC19928912yF.LJII(9, (InterfaceC19925612xi) ListProtector.get(this.reservedRange_, i8));
        }
        int iLJFF = 0;
        for (int i9 = 0; i9 < this.reservedName_.size(); i9++) {
            iLJFF += k0.LJFF(this.reservedName_.LJJJLL(i9));
        }
        int size = iLJ + iLJFF + m91getReservedNameList().size();
        if ((this.LLILLJJLI & 4) != 0) {
            size += AbstractC19928912yF.LJ(11, this.visibility_);
        }
        int serializedSize = size + getUnknownFields().getSerializedSize();
        this.LL = serializedSize;
        return serializedSize;
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
        if (getFieldCount() > 0) {
            iHashCode = (((iHashCode * 37) + 2) * 53) + getFieldList().hashCode();
        }
        if (getExtensionCount() > 0) {
            iHashCode = (((iHashCode * 37) + 6) * 53) + getExtensionList().hashCode();
        }
        if (getNestedTypeCount() > 0) {
            iHashCode = (((iHashCode * 37) + 3) * 53) + getNestedTypeList().hashCode();
        }
        if (getEnumTypeCount() > 0) {
            iHashCode = (((iHashCode * 37) + 4) * 53) + getEnumTypeList().hashCode();
        }
        if (getExtensionRangeCount() > 0) {
            iHashCode = (((iHashCode * 37) + 5) * 53) + getExtensionRangeList().hashCode();
        }
        if (getOneofDeclCount() > 0) {
            iHashCode = (((iHashCode * 37) + 8) * 53) + getOneofDeclList().hashCode();
        }
        if (hasOptions()) {
            iHashCode = (((iHashCode * 37) + 7) * 53) + getOptions().hashCode();
        }
        if (getReservedRangeCount() > 0) {
            iHashCode = (((iHashCode * 37) + 9) * 53) + getReservedRangeList().hashCode();
        }
        if (getReservedNameCount() > 0) {
            iHashCode = (((iHashCode * 37) + 10) * 53) + m91getReservedNameList().hashCode();
        }
        if (hasVisibility()) {
            iHashCode = (((iHashCode * 37) + 11) * 53) + this.visibility_;
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
        for (int i = 0; i < getFieldCount(); i++) {
            if (!getField(i).isInitialized()) {
                this.LLILLL = (byte) 0;
                return false;
            }
        }
        for (int i2 = 0; i2 < getExtensionCount(); i2++) {
            if (!getExtension(i2).isInitialized()) {
                this.LLILLL = (byte) 0;
                return false;
            }
        }
        for (int i3 = 0; i3 < getNestedTypeCount(); i3++) {
            if (!getNestedType(i3).isInitialized()) {
                this.LLILLL = (byte) 0;
                return false;
            }
        }
        for (int i4 = 0; i4 < getEnumTypeCount(); i4++) {
            if (!getEnumType(i4).isInitialized()) {
                this.LLILLL = (byte) 0;
                return false;
            }
        }
        for (int i5 = 0; i5 < getExtensionRangeCount(); i5++) {
            if (!getExtensionRange(i5).isInitialized()) {
                this.LLILLL = (byte) 0;
                return false;
            }
        }
        for (int i6 = 0; i6 < getOneofDeclCount(); i6++) {
            if (!getOneofDecl(i6).isInitialized()) {
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
    public C199404130g toBuilder() {
        if (this == LLILZ) {
            return new C199404130g();
        }
        C199404130g c199404130g = new C199404130g();
        c199404130g.LJJIJIIJIL(this);
        return c199404130g;
    }

    public C199403130f() {
        this.name_ = "";
        C19920612wu c19920612wu = C19920612wu.LLILLL;
        this.reservedName_ = c19920612wu;
        this.visibility_ = 0;
        this.LLILLL = (byte) -1;
        this.name_ = "";
        this.field_ = Collections.emptyList();
        this.extension_ = Collections.emptyList();
        this.nestedType_ = Collections.emptyList();
        this.enumType_ = Collections.emptyList();
        this.extensionRange_ = Collections.emptyList();
        this.oneofDecl_ = Collections.emptyList();
        this.reservedRange_ = Collections.emptyList();
        this.reservedName_ = c19920612wu;
        this.visibility_ = 0;
    }

    public static C199403130f getDefaultInstance() {
        return LLILZ;
    }

    public static final AnonymousClass1301 getDescriptor() {
        return C131K.LIZJ;
    }

    public static InterfaceC19925712xj<C199403130f> parser() {
        return LLILZIL;
    }

    public List<C131C> getEnumTypeList() {
        return this.enumType_;
    }

    public List<? extends InterfaceC199410130m> getEnumTypeOrBuilderList() {
        return this.enumType_;
    }

    public List<C199412130o> getExtensionList() {
        return this.extension_;
    }

    public List<? extends InterfaceC199411130n> getExtensionOrBuilderList() {
        return this.extension_;
    }

    public List<C199419130v> getExtensionRangeList() {
        return this.extensionRange_;
    }

    public List<? extends InterfaceC199407130j> getExtensionRangeOrBuilderList() {
        return this.extensionRange_;
    }

    public List<C199412130o> getFieldList() {
        return this.field_;
    }

    public List<? extends InterfaceC199411130n> getFieldOrBuilderList() {
        return this.field_;
    }

    public List<C199403130f> getNestedTypeList() {
        return this.nestedType_;
    }

    public List<? extends InterfaceC199409130l> getNestedTypeOrBuilderList() {
        return this.nestedType_;
    }

    public List<C132P> getOneofDeclList() {
        return this.oneofDecl_;
    }

    public List<? extends InterfaceC199475132z> getOneofDeclOrBuilderList() {
        return this.oneofDecl_;
    }

    @Override // com.google.protobuf.k0, X.InterfaceC19925612xi
    public InterfaceC19925712xj<C199403130f> getParserForType() {
        return LLILZIL;
    }

    public List<C132X> getReservedRangeList() {
        return this.reservedRange_;
    }

    public List<? extends InterfaceC199408130k> getReservedRangeOrBuilderList() {
        return this.reservedRange_;
    }

    /* JADX INFO: renamed from: getReservedNameList, reason: merged with bridge method [inline-methods] */
    public InterfaceC1554550qYX m91getReservedNameList() {
        return this.reservedName_;
    }

    @Override // com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19916512wF
    public C199403130f getDefaultInstanceForType() {
        return LLILZ;
    }

    @Override // com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19925612xi
    public C199404130g newBuilderForType() {
        return newBuilder();
    }

    public C199403130f(AbstractC19933512yz abstractC19933512yz) {
        super(abstractC19933512yz);
        this.name_ = "";
        this.reservedName_ = C19920612wu.LLILLL;
        this.visibility_ = 0;
        this.LLILLL = (byte) -1;
    }

    public static C199404130g newBuilder(C199403130f c199403130f) {
        C199404130g builder = LLILZ.toBuilder();
        builder.LJJIJIIJIL(c199403130f);
        return builder;
    }

    public static C199403130f parseDelimitedFrom(InputStream inputStream) {
        return (C199403130f) k0.LJIIIIZZ(LLILZIL, inputStream);
    }

    public static C199403130f parseFrom(AbstractC19922812xG abstractC19922812xG) {
        return (C199403130f) LLILZIL.LJFF(abstractC19922812xG);
    }

    @Override // X.AbstractC19932312yn
    public final InterfaceC19931912yj LIZLLL(InterfaceC19935412zI interfaceC19935412zI) {
        return new C199404130g(interfaceC19935412zI);
    }

    @Override // X.AbstractC19932312yn
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C199403130f)) {
            return super.equals(obj);
        }
        C199403130f c199403130f = (C199403130f) obj;
        if (hasName() != c199403130f.hasName()) {
            return false;
        }
        if ((hasName() && !getName().equals(c199403130f.getName())) || !getFieldList().equals(c199403130f.getFieldList()) || !getExtensionList().equals(c199403130f.getExtensionList()) || !getNestedTypeList().equals(c199403130f.getNestedTypeList()) || !getEnumTypeList().equals(c199403130f.getEnumTypeList()) || !getExtensionRangeList().equals(c199403130f.getExtensionRangeList()) || !getOneofDeclList().equals(c199403130f.getOneofDeclList()) || hasOptions() != c199403130f.hasOptions()) {
            return false;
        }
        if ((hasOptions() && !getOptions().equals(c199403130f.getOptions())) || !getReservedRangeList().equals(c199403130f.getReservedRangeList()) || !m91getReservedNameList().equals(c199403130f.m91getReservedNameList()) || hasVisibility() != c199403130f.hasVisibility()) {
            return false;
        }
        if ((!hasVisibility() || this.visibility_ == c199403130f.visibility_) && getUnknownFields().equals(c199403130f.getUnknownFields())) {
            return true;
        }
        return false;
    }

    public C131C getEnumType(int i) {
        return (C131C) ListProtector.get(this.enumType_, i);
    }

    public InterfaceC199410130m getEnumTypeOrBuilder(int i) {
        return (InterfaceC199410130m) ListProtector.get(this.enumType_, i);
    }

    public C199412130o getExtension(int i) {
        return (C199412130o) ListProtector.get(this.extension_, i);
    }

    public InterfaceC199411130n getExtensionOrBuilder(int i) {
        return (InterfaceC199411130n) ListProtector.get(this.extension_, i);
    }

    public C199419130v getExtensionRange(int i) {
        return (C199419130v) ListProtector.get(this.extensionRange_, i);
    }

    public InterfaceC199407130j getExtensionRangeOrBuilder(int i) {
        return (InterfaceC199407130j) ListProtector.get(this.extensionRange_, i);
    }

    public C199412130o getField(int i) {
        return (C199412130o) ListProtector.get(this.field_, i);
    }

    public InterfaceC199411130n getFieldOrBuilder(int i) {
        return (InterfaceC199411130n) ListProtector.get(this.field_, i);
    }

    public C199403130f getNestedType(int i) {
        return (C199403130f) ListProtector.get(this.nestedType_, i);
    }

    public InterfaceC199409130l getNestedTypeOrBuilder(int i) {
        return (InterfaceC199409130l) ListProtector.get(this.nestedType_, i);
    }

    public C132P getOneofDecl(int i) {
        return (C132P) ListProtector.get(this.oneofDecl_, i);
    }

    public InterfaceC199475132z getOneofDeclOrBuilder(int i) {
        return (InterfaceC199475132z) ListProtector.get(this.oneofDecl_, i);
    }

    public String getReservedName(int i) {
        return this.reservedName_.get(i);
    }

    public AbstractC19922812xG getReservedNameBytes(int i) {
        return this.reservedName_.LJFF(i);
    }

    public C132X getReservedRange(int i) {
        return (C132X) ListProtector.get(this.reservedRange_, i);
    }

    public InterfaceC199408130k getReservedRangeOrBuilder(int i) {
        return (InterfaceC199408130k) ListProtector.get(this.reservedRange_, i);
    }

    @Override // com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19925612xi
    public void writeTo(AbstractC19928912yF abstractC19928912yF) {
        if ((this.LLILLJJLI & 1) != 0) {
            k0.LJIILJJIL(abstractC19928912yF, 1, this.name_);
        }
        for (int i = 0; i < this.field_.size(); i++) {
            abstractC19928912yF.LJJIIJ(2, (InterfaceC19925612xi) ListProtector.get(this.field_, i));
        }
        for (int i2 = 0; i2 < this.nestedType_.size(); i2++) {
            abstractC19928912yF.LJJIIJ(3, (InterfaceC19925612xi) ListProtector.get(this.nestedType_, i2));
        }
        for (int i3 = 0; i3 < this.enumType_.size(); i3++) {
            abstractC19928912yF.LJJIIJ(4, (InterfaceC19925612xi) ListProtector.get(this.enumType_, i3));
        }
        for (int i4 = 0; i4 < this.extensionRange_.size(); i4++) {
            abstractC19928912yF.LJJIIJ(5, (InterfaceC19925612xi) ListProtector.get(this.extensionRange_, i4));
        }
        for (int i5 = 0; i5 < this.extension_.size(); i5++) {
            abstractC19928912yF.LJJIIJ(6, (InterfaceC19925612xi) ListProtector.get(this.extension_, i5));
        }
        if ((this.LLILLJJLI & 2) != 0) {
            abstractC19928912yF.LJJIIJ(7, getOptions());
        }
        for (int i6 = 0; i6 < this.oneofDecl_.size(); i6++) {
            abstractC19928912yF.LJJIIJ(8, (InterfaceC19925612xi) ListProtector.get(this.oneofDecl_, i6));
        }
        for (int i7 = 0; i7 < this.reservedRange_.size(); i7++) {
            abstractC19928912yF.LJJIIJ(9, (InterfaceC19925612xi) ListProtector.get(this.reservedRange_, i7));
        }
        for (int i8 = 0; i8 < this.reservedName_.size(); i8++) {
            k0.LJIILJJIL(abstractC19928912yF, 10, this.reservedName_.LJJJLL(i8));
        }
        if ((this.LLILLJJLI & 4) != 0) {
            abstractC19928912yF.LJJII(11, this.visibility_);
        }
        getUnknownFields().writeTo(abstractC19928912yF);
    }

    public static C199403130f parseFrom(AbstractC19927312xz abstractC19927312xz) {
        return (C199403130f) k0.LJIIJ(LLILZIL, abstractC19927312xz);
    }

    public static C199403130f parseFrom(InputStream inputStream) {
        return (C199403130f) k0.LJIIL(LLILZIL, inputStream);
    }

    public static C199403130f parseFrom(ByteBuffer byteBuffer) {
        return (C199403130f) LLILZIL.LJIIIZ(byteBuffer);
    }

    public static C199403130f parseFrom(byte[] bArr) {
        return (C199403130f) LLILZIL.LJIIJJI(bArr);
    }

    public static C199403130f parseDelimitedFrom(InputStream inputStream, C19926312xp c19926312xp) {
        return (C199403130f) k0.LJIIIZ(LLILZIL, inputStream, c19926312xp);
    }

    public static C199403130f parseFrom(byte[] bArr, C19926312xp c19926312xp) {
        C130L c130l = LLILZIL;
        c130l.getClass();
        InterfaceC19925612xi interfaceC19925612xiLJIILJJIL = c130l.LJIILJJIL(bArr, bArr.length, c19926312xp);
        AbstractC19925812xk.LIZJ(interfaceC19925612xiLJIILJJIL);
        return (C199403130f) interfaceC19925612xiLJIILJJIL;
    }

    public static C199403130f parseFrom(AbstractC19922812xG abstractC19922812xG, C19926312xp c19926312xp) {
        return LLILZIL.LIZ(abstractC19922812xG, c19926312xp);
    }

    public static C199403130f parseFrom(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) {
        return (C199403130f) k0.LJIIJJI(LLILZIL, abstractC19927312xz, c19926312xp);
    }

    public static C199403130f parseFrom(InputStream inputStream, C19926312xp c19926312xp) {
        return (C199403130f) k0.LJIILIIL(LLILZIL, inputStream, c19926312xp);
    }

    public static C199403130f parseFrom(ByteBuffer byteBuffer, C19926312xp c19926312xp) {
        return LLILZIL.LJIIJ(byteBuffer, c19926312xp);
    }
}
