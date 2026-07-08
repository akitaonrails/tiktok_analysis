package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.protobuf.k0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: X.131J, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C131J extends k0 implements C131H {
    public static final C131J LLILZ;
    public static final AnonymousClass1313 LLILZIL;
    public static final long serialVersionUID = 0;
    public int LLILLJJLI;
    public byte LLILLL;
    public volatile Object name_;
    public int number_;
    public C131X options_;

    /* JADX WARN: Type inference failed for: r0v2, types: [X.1313] */
    static {
        C19373810qu.LIZ(EnumC19373110qn.PUBLIC, "EnumValueDescriptorProto");
        LLILZ = new C131J();
        LLILZIL = new AbstractC19925812xk<C131J>() { // from class: X.1313
            @Override // X.InterfaceC19925712xj
            public final Object LIZIZ(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) throws C19926612xs {
                C131I c131iNewBuilder = C131J.newBuilder();
                try {
                    c131iNewBuilder.LJIL(abstractC19927312xz, c19926312xp);
                    return c131iNewBuilder.buildPartial();
                } catch (C19918012wU e) {
                    TryCatchGuardChecker.doCheck(e);
                    C19926612xs c19926612xsAsInvalidProtocolBufferException = e.asInvalidProtocolBufferException();
                    c19926612xsAsInvalidProtocolBufferException.setUnfinishedMessage(c131iNewBuilder.buildPartial());
                    throw c19926612xsAsInvalidProtocolBufferException;
                } catch (C19926612xs e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    e2.setUnfinishedMessage(c131iNewBuilder.buildPartial());
                    throw e2;
                } catch (IOException e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    C19926612xs c19926612xs = new C19926612xs(e3);
                    c19926612xs.setUnfinishedMessage(c131iNewBuilder.buildPartial());
                    throw c19926612xs;
                }
            }
        };
    }

    public static C131I newBuilder() {
        return LLILZ.toBuilder();
    }

    @Override // com.google.protobuf.k0
    public final C19935812zM LJI() {
        C19935812zM c19935812zM = C131K.LJIJJLI;
        c19935812zM.LIZ(C131J.class, C131I.class);
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

    public C131X getOptions() {
        C131X c131x = this.options_;
        return c131x == null ? C131X.getDefaultInstance() : c131x;
    }

    public C131L getOptionsOrBuilder() {
        C131X c131x = this.options_;
        return c131x == null ? C131X.getDefaultInstance() : c131x;
    }

    @Override // com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19925612xi
    public int getSerializedSize() {
        int i = this.LL;
        if (i != -1) {
            return i;
        }
        int iLJ = (this.LLILLJJLI & 1) != 0 ? 0 + k0.LJ(1, this.name_) : 0;
        if ((this.LLILLJJLI & 2) != 0) {
            iLJ += AbstractC19928912yF.LJFF(2, this.number_);
        }
        if ((this.LLILLJJLI & 4) != 0) {
            iLJ += AbstractC19928912yF.LJII(3, getOptions());
        }
        int serializedSize = iLJ + getUnknownFields().getSerializedSize();
        this.LL = serializedSize;
        return serializedSize;
    }

    public boolean hasName() {
        return (this.LLILLJJLI & 1) != 0;
    }

    public boolean hasNumber() {
        return (this.LLILLJJLI & 2) != 0;
    }

    public boolean hasOptions() {
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
        if (hasNumber()) {
            iHashCode = (((iHashCode * 37) + 2) * 53) + getNumber();
        }
        if (hasOptions()) {
            iHashCode = (((iHashCode * 37) + 3) * 53) + getOptions().hashCode();
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
    public C131I toBuilder() {
        if (this == LLILZ) {
            return new C131I();
        }
        C131I c131i = new C131I();
        c131i.LJJI(this);
        return c131i;
    }

    public C131J() {
        this.name_ = "";
        this.LLILLL = (byte) -1;
        this.name_ = "";
    }

    public static C131J getDefaultInstance() {
        return LLILZ;
    }

    public static final AnonymousClass1301 getDescriptor() {
        return C131K.LJIJJ;
    }

    public static InterfaceC19925712xj<C131J> parser() {
        return LLILZIL;
    }

    public int getNumber() {
        return this.number_;
    }

    @Override // com.google.protobuf.k0, X.InterfaceC19925612xi
    public InterfaceC19925712xj<C131J> getParserForType() {
        return LLILZIL;
    }

    @Override // com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19916512wF
    public C131J getDefaultInstanceForType() {
        return LLILZ;
    }

    @Override // com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19925612xi
    public C131I newBuilderForType() {
        return newBuilder();
    }

    public C131J(AbstractC19933512yz abstractC19933512yz) {
        super(abstractC19933512yz);
        this.name_ = "";
        this.LLILLL = (byte) -1;
    }

    public static C131I newBuilder(C131J c131j) {
        C131I builder = LLILZ.toBuilder();
        builder.LJJI(c131j);
        return builder;
    }

    public static C131J parseDelimitedFrom(InputStream inputStream) {
        return (C131J) k0.LJIIIIZZ(LLILZIL, inputStream);
    }

    public static C131J parseFrom(AbstractC19922812xG abstractC19922812xG) {
        return (C131J) LLILZIL.LJFF(abstractC19922812xG);
    }

    @Override // X.AbstractC19932312yn
    public final InterfaceC19931912yj LIZLLL(InterfaceC19935412zI interfaceC19935412zI) {
        return new C131I(interfaceC19935412zI);
    }

    @Override // X.AbstractC19932312yn
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C131J)) {
            return super.equals(obj);
        }
        C131J c131j = (C131J) obj;
        if (hasName() != c131j.hasName()) {
            return false;
        }
        if ((hasName() && !getName().equals(c131j.getName())) || hasNumber() != c131j.hasNumber()) {
            return false;
        }
        if ((hasNumber() && getNumber() != c131j.getNumber()) || hasOptions() != c131j.hasOptions()) {
            return false;
        }
        if ((!hasOptions() || getOptions().equals(c131j.getOptions())) && getUnknownFields().equals(c131j.getUnknownFields())) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19925612xi
    public void writeTo(AbstractC19928912yF abstractC19928912yF) {
        if ((this.LLILLJJLI & 1) != 0) {
            k0.LJIILJJIL(abstractC19928912yF, 1, this.name_);
        }
        if ((this.LLILLJJLI & 2) != 0) {
            abstractC19928912yF.LJJII(2, this.number_);
        }
        if ((this.LLILLJJLI & 4) != 0) {
            abstractC19928912yF.LJJIIJ(3, getOptions());
        }
        getUnknownFields().writeTo(abstractC19928912yF);
    }

    public static C131J parseFrom(AbstractC19927312xz abstractC19927312xz) {
        return (C131J) k0.LJIIJ(LLILZIL, abstractC19927312xz);
    }

    public static C131J parseFrom(InputStream inputStream) {
        return (C131J) k0.LJIIL(LLILZIL, inputStream);
    }

    public static C131J parseFrom(ByteBuffer byteBuffer) {
        return (C131J) LLILZIL.LJIIIZ(byteBuffer);
    }

    public static C131J parseFrom(byte[] bArr) {
        return (C131J) LLILZIL.LJIIJJI(bArr);
    }

    public static C131J parseDelimitedFrom(InputStream inputStream, C19926312xp c19926312xp) {
        return (C131J) k0.LJIIIZ(LLILZIL, inputStream, c19926312xp);
    }

    public static C131J parseFrom(byte[] bArr, C19926312xp c19926312xp) {
        AnonymousClass1313 anonymousClass1313 = LLILZIL;
        anonymousClass1313.getClass();
        InterfaceC19925612xi interfaceC19925612xiLJIILJJIL = anonymousClass1313.LJIILJJIL(bArr, bArr.length, c19926312xp);
        AbstractC19925812xk.LIZJ(interfaceC19925612xiLJIILJJIL);
        return (C131J) interfaceC19925612xiLJIILJJIL;
    }

    public static C131J parseFrom(AbstractC19922812xG abstractC19922812xG, C19926312xp c19926312xp) {
        return LLILZIL.LIZ(abstractC19922812xG, c19926312xp);
    }

    public static C131J parseFrom(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) {
        return (C131J) k0.LJIIJJI(LLILZIL, abstractC19927312xz, c19926312xp);
    }

    public static C131J parseFrom(InputStream inputStream, C19926312xp c19926312xp) {
        return (C131J) k0.LJIILIIL(LLILZIL, inputStream, c19926312xp);
    }

    public static C131J parseFrom(ByteBuffer byteBuffer, C19926312xp c19926312xp) {
        return LLILZIL.LJIIJ(byteBuffer, c19926312xp);
    }
}
