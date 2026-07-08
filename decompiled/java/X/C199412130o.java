package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.protobuf.k0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: X.130o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C199412130o extends k0 implements InterfaceC199411130n {
    public static final C199412130o LLILZ;
    public static final C199414130q LLILZIL;
    public static final long serialVersionUID = 0;
    public int LLILLJJLI;
    public byte LLILLL;
    public volatile Object defaultValue_;
    public volatile Object extendee_;
    public volatile Object jsonName_;
    public int label_;
    public volatile Object name_;
    public int number_;
    public int oneofIndex_;
    public C131Y options_;
    public boolean proto3Optional_;
    public volatile Object typeName_;
    public int type_;

    /* JADX WARN: Type inference failed for: r0v2, types: [X.130q] */
    static {
        C19373810qu.LIZ(EnumC19373110qn.PUBLIC, "FieldDescriptorProto");
        LLILZ = new C199412130o();
        LLILZIL = new AbstractC19925812xk<C199412130o>() { // from class: X.130q
            @Override // X.InterfaceC19925712xj
            public final Object LIZIZ(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) throws C19926612xs {
                C199413130p c199413130pNewBuilder = C199412130o.newBuilder();
                try {
                    c199413130pNewBuilder.LJJI(abstractC19927312xz, c19926312xp);
                    return c199413130pNewBuilder.buildPartial();
                } catch (C19918012wU e) {
                    TryCatchGuardChecker.doCheck(e);
                    C19926612xs c19926612xsAsInvalidProtocolBufferException = e.asInvalidProtocolBufferException();
                    c19926612xsAsInvalidProtocolBufferException.setUnfinishedMessage(c199413130pNewBuilder.buildPartial());
                    throw c19926612xsAsInvalidProtocolBufferException;
                } catch (C19926612xs e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    e2.setUnfinishedMessage(c199413130pNewBuilder.buildPartial());
                    throw e2;
                } catch (IOException e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    C19926612xs c19926612xs = new C19926612xs(e3);
                    c19926612xs.setUnfinishedMessage(c199413130pNewBuilder.buildPartial());
                    throw c19926612xs;
                }
            }
        };
    }

    public static C199413130p newBuilder() {
        return LLILZ.toBuilder();
    }

    @Override // com.google.protobuf.k0
    public final C19935812zM LJI() {
        C19935812zM c19935812zM = C131K.LJIILIIL;
        c19935812zM.LIZ(C199412130o.class, C199413130p.class);
        return c19935812zM;
    }

    public String getDefaultValue() {
        Object obj = this.defaultValue_;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC19922812xG abstractC19922812xG = (AbstractC19922812xG) obj;
        String stringUtf8 = abstractC19922812xG.toStringUtf8();
        if (abstractC19922812xG.isValidUtf8()) {
            this.defaultValue_ = stringUtf8;
        }
        return stringUtf8;
    }

    public AbstractC19922812xG getDefaultValueBytes() {
        Object obj = this.defaultValue_;
        if (!(obj instanceof String)) {
            return (AbstractC19922812xG) obj;
        }
        AbstractC19922812xG abstractC19922812xGCopyFromUtf8 = AbstractC19922812xG.copyFromUtf8((String) obj);
        this.defaultValue_ = abstractC19922812xGCopyFromUtf8;
        return abstractC19922812xGCopyFromUtf8;
    }

    public String getExtendee() {
        Object obj = this.extendee_;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC19922812xG abstractC19922812xG = (AbstractC19922812xG) obj;
        String stringUtf8 = abstractC19922812xG.toStringUtf8();
        if (abstractC19922812xG.isValidUtf8()) {
            this.extendee_ = stringUtf8;
        }
        return stringUtf8;
    }

    public AbstractC19922812xG getExtendeeBytes() {
        Object obj = this.extendee_;
        if (!(obj instanceof String)) {
            return (AbstractC19922812xG) obj;
        }
        AbstractC19922812xG abstractC19922812xGCopyFromUtf8 = AbstractC19922812xG.copyFromUtf8((String) obj);
        this.extendee_ = abstractC19922812xGCopyFromUtf8;
        return abstractC19922812xGCopyFromUtf8;
    }

    public String getJsonName() {
        Object obj = this.jsonName_;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC19922812xG abstractC19922812xG = (AbstractC19922812xG) obj;
        String stringUtf8 = abstractC19922812xG.toStringUtf8();
        if (abstractC19922812xG.isValidUtf8()) {
            this.jsonName_ = stringUtf8;
        }
        return stringUtf8;
    }

    public AbstractC19922812xG getJsonNameBytes() {
        Object obj = this.jsonName_;
        if (!(obj instanceof String)) {
            return (AbstractC19922812xG) obj;
        }
        AbstractC19922812xG abstractC19922812xGCopyFromUtf8 = AbstractC19922812xG.copyFromUtf8((String) obj);
        this.jsonName_ = abstractC19922812xGCopyFromUtf8;
        return abstractC19922812xGCopyFromUtf8;
    }

    public C130F getLabel() {
        C130F c130fForNumber = C130F.forNumber(this.label_);
        return c130fForNumber == null ? C130F.LABEL_OPTIONAL : c130fForNumber;
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

    public C131Y getOptions() {
        C131Y c131y = this.options_;
        return c131y == null ? C131Y.getDefaultInstance() : c131y;
    }

    public InterfaceC199415130r getOptionsOrBuilder() {
        C131Y c131y = this.options_;
        return c131y == null ? C131Y.getDefaultInstance() : c131y;
    }

    @Override // com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19925612xi
    public int getSerializedSize() {
        int i = this.LL;
        if (i != -1) {
            return i;
        }
        int iLJ = (this.LLILLJJLI & 1) != 0 ? 0 + k0.LJ(1, this.name_) : 0;
        if ((this.LLILLJJLI & 32) != 0) {
            iLJ += k0.LJ(2, this.extendee_);
        }
        if ((this.LLILLJJLI & 2) != 0) {
            iLJ += AbstractC19928912yF.LJFF(3, this.number_);
        }
        if ((this.LLILLJJLI & 4) != 0) {
            iLJ += AbstractC19928912yF.LJ(4, this.label_);
        }
        if ((this.LLILLJJLI & 8) != 0) {
            iLJ += AbstractC19928912yF.LJ(5, this.type_);
        }
        if ((this.LLILLJJLI & 16) != 0) {
            iLJ += k0.LJ(6, this.typeName_);
        }
        if ((this.LLILLJJLI & 64) != 0) {
            iLJ += k0.LJ(7, this.defaultValue_);
        }
        if ((this.LLILLJJLI & 512) != 0) {
            iLJ += AbstractC19928912yF.LJII(8, getOptions());
        }
        if ((this.LLILLJJLI & 128) != 0) {
            iLJ += AbstractC19928912yF.LJFF(9, this.oneofIndex_);
        }
        if ((this.LLILLJJLI & 256) != 0) {
            iLJ += k0.LJ(10, this.jsonName_);
        }
        if ((this.LLILLJJLI & 1024) != 0) {
            iLJ += AbstractC19928912yF.LIZIZ(17);
        }
        int serializedSize = iLJ + getUnknownFields().getSerializedSize();
        this.LL = serializedSize;
        return serializedSize;
    }

    public C130D getType() {
        C130D c130dForNumber = C130D.forNumber(this.type_);
        return c130dForNumber == null ? C130D.TYPE_DOUBLE : c130dForNumber;
    }

    public String getTypeName() {
        Object obj = this.typeName_;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC19922812xG abstractC19922812xG = (AbstractC19922812xG) obj;
        String stringUtf8 = abstractC19922812xG.toStringUtf8();
        if (abstractC19922812xG.isValidUtf8()) {
            this.typeName_ = stringUtf8;
        }
        return stringUtf8;
    }

    public AbstractC19922812xG getTypeNameBytes() {
        Object obj = this.typeName_;
        if (!(obj instanceof String)) {
            return (AbstractC19922812xG) obj;
        }
        AbstractC19922812xG abstractC19922812xGCopyFromUtf8 = AbstractC19922812xG.copyFromUtf8((String) obj);
        this.typeName_ = abstractC19922812xGCopyFromUtf8;
        return abstractC19922812xGCopyFromUtf8;
    }

    public boolean hasDefaultValue() {
        return (this.LLILLJJLI & 64) != 0;
    }

    public boolean hasExtendee() {
        return (this.LLILLJJLI & 32) != 0;
    }

    public boolean hasJsonName() {
        return (this.LLILLJJLI & 256) != 0;
    }

    public boolean hasLabel() {
        return (this.LLILLJJLI & 4) != 0;
    }

    public boolean hasName() {
        return (this.LLILLJJLI & 1) != 0;
    }

    public boolean hasNumber() {
        return (this.LLILLJJLI & 2) != 0;
    }

    public boolean hasOneofIndex() {
        return (this.LLILLJJLI & 128) != 0;
    }

    public boolean hasOptions() {
        return (this.LLILLJJLI & 512) != 0;
    }

    public boolean hasProto3Optional() {
        return (this.LLILLJJLI & 1024) != 0;
    }

    public boolean hasType() {
        return (this.LLILLJJLI & 8) != 0;
    }

    public boolean hasTypeName() {
        return (this.LLILLJJLI & 16) != 0;
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
        if (hasNumber()) {
            iHashCode = (((iHashCode * 37) + 3) * 53) + getNumber();
        }
        if (hasLabel()) {
            iHashCode = (((iHashCode * 37) + 4) * 53) + this.label_;
        }
        if (hasType()) {
            iHashCode = (((iHashCode * 37) + 5) * 53) + this.type_;
        }
        if (hasTypeName()) {
            iHashCode = (((iHashCode * 37) + 6) * 53) + getTypeName().hashCode();
        }
        if (hasExtendee()) {
            iHashCode = (((iHashCode * 37) + 2) * 53) + getExtendee().hashCode();
        }
        if (hasDefaultValue()) {
            iHashCode = (((iHashCode * 37) + 7) * 53) + getDefaultValue().hashCode();
        }
        if (hasOneofIndex()) {
            iHashCode = (((iHashCode * 37) + 9) * 53) + getOneofIndex();
        }
        if (hasJsonName()) {
            iHashCode = (((iHashCode * 37) + 10) * 53) + getJsonName().hashCode();
        }
        if (hasOptions()) {
            iHashCode = (((iHashCode * 37) + 8) * 53) + getOptions().hashCode();
        }
        if (hasProto3Optional()) {
            iHashCode = (((iHashCode * 37) + 17) * 53) + C19922012x8.LIZIZ(getProto3Optional());
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
        if (!hasOptions() || getOptions().isInitialized()) {
            this.LLILLL = (byte) 1;
            return true;
        }
        this.LLILLL = (byte) 0;
        return false;
    }

    @Override // com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19925612xi
    public C199413130p toBuilder() {
        if (this == LLILZ) {
            return new C199413130p();
        }
        C199413130p c199413130p = new C199413130p();
        c199413130p.LJIL(this);
        return c199413130p;
    }

    public C199412130o() {
        this.name_ = "";
        this.label_ = 1;
        this.type_ = 1;
        this.typeName_ = "";
        this.extendee_ = "";
        this.defaultValue_ = "";
        this.jsonName_ = "";
        this.LLILLL = (byte) -1;
        this.name_ = "";
        this.label_ = 1;
        this.type_ = 1;
        this.typeName_ = "";
        this.extendee_ = "";
        this.defaultValue_ = "";
        this.jsonName_ = "";
    }

    public static C199412130o getDefaultInstance() {
        return LLILZ;
    }

    public static final AnonymousClass1301 getDescriptor() {
        return C131K.LJIIL;
    }

    public static InterfaceC19925712xj<C199412130o> parser() {
        return LLILZIL;
    }

    public int getNumber() {
        return this.number_;
    }

    public int getOneofIndex() {
        return this.oneofIndex_;
    }

    @Override // com.google.protobuf.k0, X.InterfaceC19925612xi
    public InterfaceC19925712xj<C199412130o> getParserForType() {
        return LLILZIL;
    }

    public boolean getProto3Optional() {
        return this.proto3Optional_;
    }

    @Override // com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19916512wF
    public C199412130o getDefaultInstanceForType() {
        return LLILZ;
    }

    @Override // com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19925612xi
    public C199413130p newBuilderForType() {
        return newBuilder();
    }

    public C199412130o(AbstractC19933512yz abstractC19933512yz) {
        super(abstractC19933512yz);
        this.name_ = "";
        this.label_ = 1;
        this.type_ = 1;
        this.typeName_ = "";
        this.extendee_ = "";
        this.defaultValue_ = "";
        this.jsonName_ = "";
        this.LLILLL = (byte) -1;
    }

    public static C199413130p newBuilder(C199412130o c199412130o) {
        C199413130p builder = LLILZ.toBuilder();
        builder.LJIL(c199412130o);
        return builder;
    }

    public static C199412130o parseDelimitedFrom(InputStream inputStream) {
        return (C199412130o) k0.LJIIIIZZ(LLILZIL, inputStream);
    }

    public static C199412130o parseFrom(AbstractC19922812xG abstractC19922812xG) {
        return (C199412130o) LLILZIL.LJFF(abstractC19922812xG);
    }

    @Override // X.AbstractC19932312yn
    public final InterfaceC19931912yj LIZLLL(InterfaceC19935412zI interfaceC19935412zI) {
        return new C199413130p(interfaceC19935412zI);
    }

    @Override // X.AbstractC19932312yn
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C199412130o)) {
            return super.equals(obj);
        }
        C199412130o c199412130o = (C199412130o) obj;
        if (hasName() != c199412130o.hasName()) {
            return false;
        }
        if ((hasName() && !getName().equals(c199412130o.getName())) || hasNumber() != c199412130o.hasNumber()) {
            return false;
        }
        if ((hasNumber() && getNumber() != c199412130o.getNumber()) || hasLabel() != c199412130o.hasLabel()) {
            return false;
        }
        if ((hasLabel() && this.label_ != c199412130o.label_) || hasType() != c199412130o.hasType()) {
            return false;
        }
        if ((hasType() && this.type_ != c199412130o.type_) || hasTypeName() != c199412130o.hasTypeName()) {
            return false;
        }
        if ((hasTypeName() && !getTypeName().equals(c199412130o.getTypeName())) || hasExtendee() != c199412130o.hasExtendee()) {
            return false;
        }
        if ((hasExtendee() && !getExtendee().equals(c199412130o.getExtendee())) || hasDefaultValue() != c199412130o.hasDefaultValue()) {
            return false;
        }
        if ((hasDefaultValue() && !getDefaultValue().equals(c199412130o.getDefaultValue())) || hasOneofIndex() != c199412130o.hasOneofIndex()) {
            return false;
        }
        if ((hasOneofIndex() && getOneofIndex() != c199412130o.getOneofIndex()) || hasJsonName() != c199412130o.hasJsonName()) {
            return false;
        }
        if ((hasJsonName() && !getJsonName().equals(c199412130o.getJsonName())) || hasOptions() != c199412130o.hasOptions()) {
            return false;
        }
        if ((hasOptions() && !getOptions().equals(c199412130o.getOptions())) || hasProto3Optional() != c199412130o.hasProto3Optional()) {
            return false;
        }
        if ((!hasProto3Optional() || getProto3Optional() == c199412130o.getProto3Optional()) && getUnknownFields().equals(c199412130o.getUnknownFields())) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19925612xi
    public void writeTo(AbstractC19928912yF abstractC19928912yF) {
        if ((this.LLILLJJLI & 1) != 0) {
            k0.LJIILJJIL(abstractC19928912yF, 1, this.name_);
        }
        if ((this.LLILLJJLI & 32) != 0) {
            k0.LJIILJJIL(abstractC19928912yF, 2, this.extendee_);
        }
        if ((this.LLILLJJLI & 2) != 0) {
            abstractC19928912yF.LJJII(3, this.number_);
        }
        if ((this.LLILLJJLI & 4) != 0) {
            abstractC19928912yF.LJJII(4, this.label_);
        }
        if ((this.LLILLJJLI & 8) != 0) {
            abstractC19928912yF.LJJII(5, this.type_);
        }
        if ((this.LLILLJJLI & 16) != 0) {
            k0.LJIILJJIL(abstractC19928912yF, 6, this.typeName_);
        }
        if ((this.LLILLJJLI & 64) != 0) {
            k0.LJIILJJIL(abstractC19928912yF, 7, this.defaultValue_);
        }
        if ((this.LLILLJJLI & 512) != 0) {
            abstractC19928912yF.LJJIIJ(8, getOptions());
        }
        if ((this.LLILLJJLI & 128) != 0) {
            abstractC19928912yF.LJJII(9, this.oneofIndex_);
        }
        if ((this.LLILLJJLI & 256) != 0) {
            k0.LJIILJJIL(abstractC19928912yF, 10, this.jsonName_);
        }
        if ((this.LLILLJJLI & 1024) != 0) {
            abstractC19928912yF.LJIIZILJ(17, this.proto3Optional_);
        }
        getUnknownFields().writeTo(abstractC19928912yF);
    }

    public static C199412130o parseFrom(AbstractC19927312xz abstractC19927312xz) {
        return (C199412130o) k0.LJIIJ(LLILZIL, abstractC19927312xz);
    }

    public static C199412130o parseFrom(InputStream inputStream) {
        return (C199412130o) k0.LJIIL(LLILZIL, inputStream);
    }

    public static C199412130o parseFrom(ByteBuffer byteBuffer) {
        return (C199412130o) LLILZIL.LJIIIZ(byteBuffer);
    }

    public static C199412130o parseFrom(byte[] bArr) {
        return (C199412130o) LLILZIL.LJIIJJI(bArr);
    }

    public static C199412130o parseDelimitedFrom(InputStream inputStream, C19926312xp c19926312xp) {
        return (C199412130o) k0.LJIIIZ(LLILZIL, inputStream, c19926312xp);
    }

    public static C199412130o parseFrom(byte[] bArr, C19926312xp c19926312xp) {
        C199414130q c199414130q = LLILZIL;
        c199414130q.getClass();
        InterfaceC19925612xi interfaceC19925612xiLJIILJJIL = c199414130q.LJIILJJIL(bArr, bArr.length, c19926312xp);
        AbstractC19925812xk.LIZJ(interfaceC19925612xiLJIILJJIL);
        return (C199412130o) interfaceC19925612xiLJIILJJIL;
    }

    public static C199412130o parseFrom(AbstractC19922812xG abstractC19922812xG, C19926312xp c19926312xp) {
        return LLILZIL.LIZ(abstractC19922812xG, c19926312xp);
    }

    public static C199412130o parseFrom(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) {
        return (C199412130o) k0.LJIIJJI(LLILZIL, abstractC19927312xz, c19926312xp);
    }

    public static C199412130o parseFrom(InputStream inputStream, C19926312xp c19926312xp) {
        return (C199412130o) k0.LJIILIIL(LLILZIL, inputStream, c19926312xp);
    }

    public static C199412130o parseFrom(ByteBuffer byteBuffer, C19926312xp c19926312xp) {
        return LLILZIL.LJIIJ(byteBuffer, c19926312xp);
    }
}
