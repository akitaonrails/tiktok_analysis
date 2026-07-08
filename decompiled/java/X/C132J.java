package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.protobuf.k0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: X.132J, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C132J extends k0 implements InterfaceC199474132y {
    public static final C132J LLILZ;
    public static final C199469132t LLILZIL;
    public static final long serialVersionUID = 0;
    public int LLILLJJLI;
    public byte LLILLL;
    public boolean clientStreaming_;
    public volatile Object inputType_;
    public volatile Object name_;
    public AnonymousClass1328 options_;
    public volatile Object outputType_;
    public boolean serverStreaming_;

    /* JADX WARN: Type inference failed for: r0v2, types: [X.132t] */
    static {
        C19373810qu.LIZ(EnumC19373110qn.PUBLIC, "MethodDescriptorProto");
        LLILZ = new C132J();
        LLILZIL = new AbstractC19925812xk<C132J>() { // from class: X.132t
            @Override // X.InterfaceC19925712xj
            public final Object LIZIZ(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) throws C19926612xs {
                C132K c132kNewBuilder = C132J.newBuilder();
                try {
                    c132kNewBuilder.LJJI(abstractC19927312xz, c19926312xp);
                    return c132kNewBuilder.buildPartial();
                } catch (C19918012wU e) {
                    TryCatchGuardChecker.doCheck(e);
                    C19926612xs c19926612xsAsInvalidProtocolBufferException = e.asInvalidProtocolBufferException();
                    c19926612xsAsInvalidProtocolBufferException.setUnfinishedMessage(c132kNewBuilder.buildPartial());
                    throw c19926612xsAsInvalidProtocolBufferException;
                } catch (C19926612xs e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    e2.setUnfinishedMessage(c132kNewBuilder.buildPartial());
                    throw e2;
                } catch (IOException e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    C19926612xs c19926612xs = new C19926612xs(e3);
                    c19926612xs.setUnfinishedMessage(c132kNewBuilder.buildPartial());
                    throw c19926612xs;
                }
            }
        };
    }

    public static C132K newBuilder() {
        return LLILZ.toBuilder();
    }

    @Override // com.google.protobuf.k0
    public final C19935812zM LJI() {
        C19935812zM c19935812zM = C131K.LJJIFFI;
        c19935812zM.LIZ(C132J.class, C132K.class);
        return c19935812zM;
    }

    public String getInputType() {
        Object obj = this.inputType_;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC19922812xG abstractC19922812xG = (AbstractC19922812xG) obj;
        String stringUtf8 = abstractC19922812xG.toStringUtf8();
        if (abstractC19922812xG.isValidUtf8()) {
            this.inputType_ = stringUtf8;
        }
        return stringUtf8;
    }

    public AbstractC19922812xG getInputTypeBytes() {
        Object obj = this.inputType_;
        if (!(obj instanceof String)) {
            return (AbstractC19922812xG) obj;
        }
        AbstractC19922812xG abstractC19922812xGCopyFromUtf8 = AbstractC19922812xG.copyFromUtf8((String) obj);
        this.inputType_ = abstractC19922812xGCopyFromUtf8;
        return abstractC19922812xGCopyFromUtf8;
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

    public AnonymousClass1328 getOptions() {
        AnonymousClass1328 anonymousClass1328 = this.options_;
        return anonymousClass1328 == null ? AnonymousClass1328.getDefaultInstance() : anonymousClass1328;
    }

    public C131O getOptionsOrBuilder() {
        AnonymousClass1328 anonymousClass1328 = this.options_;
        return anonymousClass1328 == null ? AnonymousClass1328.getDefaultInstance() : anonymousClass1328;
    }

    public String getOutputType() {
        Object obj = this.outputType_;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC19922812xG abstractC19922812xG = (AbstractC19922812xG) obj;
        String stringUtf8 = abstractC19922812xG.toStringUtf8();
        if (abstractC19922812xG.isValidUtf8()) {
            this.outputType_ = stringUtf8;
        }
        return stringUtf8;
    }

    public AbstractC19922812xG getOutputTypeBytes() {
        Object obj = this.outputType_;
        if (!(obj instanceof String)) {
            return (AbstractC19922812xG) obj;
        }
        AbstractC19922812xG abstractC19922812xGCopyFromUtf8 = AbstractC19922812xG.copyFromUtf8((String) obj);
        this.outputType_ = abstractC19922812xGCopyFromUtf8;
        return abstractC19922812xGCopyFromUtf8;
    }

    @Override // com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19925612xi
    public int getSerializedSize() {
        int i = this.LL;
        if (i != -1) {
            return i;
        }
        int iLJ = (this.LLILLJJLI & 1) != 0 ? 0 + k0.LJ(1, this.name_) : 0;
        if ((this.LLILLJJLI & 2) != 0) {
            iLJ += k0.LJ(2, this.inputType_);
        }
        if ((this.LLILLJJLI & 4) != 0) {
            iLJ += k0.LJ(3, this.outputType_);
        }
        if ((this.LLILLJJLI & 8) != 0) {
            iLJ += AbstractC19928912yF.LJII(4, getOptions());
        }
        if ((this.LLILLJJLI & 16) != 0) {
            iLJ += AbstractC19928912yF.LIZIZ(5);
        }
        if ((this.LLILLJJLI & 32) != 0) {
            iLJ += AbstractC19928912yF.LIZIZ(6);
        }
        int serializedSize = iLJ + getUnknownFields().getSerializedSize();
        this.LL = serializedSize;
        return serializedSize;
    }

    public boolean hasClientStreaming() {
        return (this.LLILLJJLI & 16) != 0;
    }

    public boolean hasInputType() {
        return (this.LLILLJJLI & 2) != 0;
    }

    public boolean hasName() {
        return (this.LLILLJJLI & 1) != 0;
    }

    public boolean hasOptions() {
        return (this.LLILLJJLI & 8) != 0;
    }

    public boolean hasOutputType() {
        return (this.LLILLJJLI & 4) != 0;
    }

    public boolean hasServerStreaming() {
        return (this.LLILLJJLI & 32) != 0;
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
        if (hasInputType()) {
            iHashCode = (((iHashCode * 37) + 2) * 53) + getInputType().hashCode();
        }
        if (hasOutputType()) {
            iHashCode = (((iHashCode * 37) + 3) * 53) + getOutputType().hashCode();
        }
        if (hasOptions()) {
            iHashCode = (((iHashCode * 37) + 4) * 53) + getOptions().hashCode();
        }
        if (hasClientStreaming()) {
            iHashCode = (((iHashCode * 37) + 5) * 53) + C19922012x8.LIZIZ(getClientStreaming());
        }
        if (hasServerStreaming()) {
            iHashCode = (((iHashCode * 37) + 6) * 53) + C19922012x8.LIZIZ(getServerStreaming());
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
    public C132K toBuilder() {
        if (this == LLILZ) {
            return new C132K();
        }
        C132K c132k = new C132K();
        c132k.LJIL(this);
        return c132k;
    }

    public C132J() {
        this.name_ = "";
        this.inputType_ = "";
        this.outputType_ = "";
        this.LLILLL = (byte) -1;
        this.name_ = "";
        this.inputType_ = "";
        this.outputType_ = "";
    }

    public static C132J getDefaultInstance() {
        return LLILZ;
    }

    public static final AnonymousClass1301 getDescriptor() {
        return C131K.LJJI;
    }

    public static InterfaceC19925712xj<C132J> parser() {
        return LLILZIL;
    }

    public boolean getClientStreaming() {
        return this.clientStreaming_;
    }

    @Override // com.google.protobuf.k0, X.InterfaceC19925612xi
    public InterfaceC19925712xj<C132J> getParserForType() {
        return LLILZIL;
    }

    public boolean getServerStreaming() {
        return this.serverStreaming_;
    }

    @Override // com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19916512wF
    public C132J getDefaultInstanceForType() {
        return LLILZ;
    }

    @Override // com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19925612xi
    public C132K newBuilderForType() {
        return newBuilder();
    }

    public C132J(AbstractC19933512yz abstractC19933512yz) {
        super(abstractC19933512yz);
        this.name_ = "";
        this.inputType_ = "";
        this.outputType_ = "";
        this.LLILLL = (byte) -1;
    }

    public static C132K newBuilder(C132J c132j) {
        C132K builder = LLILZ.toBuilder();
        builder.LJIL(c132j);
        return builder;
    }

    public static C132J parseDelimitedFrom(InputStream inputStream) {
        return (C132J) k0.LJIIIIZZ(LLILZIL, inputStream);
    }

    public static C132J parseFrom(AbstractC19922812xG abstractC19922812xG) {
        return (C132J) LLILZIL.LJFF(abstractC19922812xG);
    }

    @Override // X.AbstractC19932312yn
    public final InterfaceC19931912yj LIZLLL(InterfaceC19935412zI interfaceC19935412zI) {
        return new C132K(interfaceC19935412zI);
    }

    @Override // X.AbstractC19932312yn
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C132J)) {
            return super.equals(obj);
        }
        C132J c132j = (C132J) obj;
        if (hasName() != c132j.hasName()) {
            return false;
        }
        if ((hasName() && !getName().equals(c132j.getName())) || hasInputType() != c132j.hasInputType()) {
            return false;
        }
        if ((hasInputType() && !getInputType().equals(c132j.getInputType())) || hasOutputType() != c132j.hasOutputType()) {
            return false;
        }
        if ((hasOutputType() && !getOutputType().equals(c132j.getOutputType())) || hasOptions() != c132j.hasOptions()) {
            return false;
        }
        if ((hasOptions() && !getOptions().equals(c132j.getOptions())) || hasClientStreaming() != c132j.hasClientStreaming()) {
            return false;
        }
        if ((hasClientStreaming() && getClientStreaming() != c132j.getClientStreaming()) || hasServerStreaming() != c132j.hasServerStreaming()) {
            return false;
        }
        if ((!hasServerStreaming() || getServerStreaming() == c132j.getServerStreaming()) && getUnknownFields().equals(c132j.getUnknownFields())) {
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
            k0.LJIILJJIL(abstractC19928912yF, 2, this.inputType_);
        }
        if ((this.LLILLJJLI & 4) != 0) {
            k0.LJIILJJIL(abstractC19928912yF, 3, this.outputType_);
        }
        if ((this.LLILLJJLI & 8) != 0) {
            abstractC19928912yF.LJJIIJ(4, getOptions());
        }
        if ((this.LLILLJJLI & 16) != 0) {
            abstractC19928912yF.LJIIZILJ(5, this.clientStreaming_);
        }
        if ((this.LLILLJJLI & 32) != 0) {
            abstractC19928912yF.LJIIZILJ(6, this.serverStreaming_);
        }
        getUnknownFields().writeTo(abstractC19928912yF);
    }

    public static C132J parseFrom(AbstractC19927312xz abstractC19927312xz) {
        return (C132J) k0.LJIIJ(LLILZIL, abstractC19927312xz);
    }

    public static C132J parseFrom(InputStream inputStream) {
        return (C132J) k0.LJIIL(LLILZIL, inputStream);
    }

    public static C132J parseFrom(ByteBuffer byteBuffer) {
        return (C132J) LLILZIL.LJIIIZ(byteBuffer);
    }

    public static C132J parseFrom(byte[] bArr) {
        return (C132J) LLILZIL.LJIIJJI(bArr);
    }

    public static C132J parseDelimitedFrom(InputStream inputStream, C19926312xp c19926312xp) {
        return (C132J) k0.LJIIIZ(LLILZIL, inputStream, c19926312xp);
    }

    public static C132J parseFrom(byte[] bArr, C19926312xp c19926312xp) {
        C199469132t c199469132t = LLILZIL;
        c199469132t.getClass();
        InterfaceC19925612xi interfaceC19925612xiLJIILJJIL = c199469132t.LJIILJJIL(bArr, bArr.length, c19926312xp);
        AbstractC19925812xk.LIZJ(interfaceC19925612xiLJIILJJIL);
        return (C132J) interfaceC19925612xiLJIILJJIL;
    }

    public static C132J parseFrom(AbstractC19922812xG abstractC19922812xG, C19926312xp c19926312xp) {
        return LLILZIL.LIZ(abstractC19922812xG, c19926312xp);
    }

    public static C132J parseFrom(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) {
        return (C132J) k0.LJIIJJI(LLILZIL, abstractC19927312xz, c19926312xp);
    }

    public static C132J parseFrom(InputStream inputStream, C19926312xp c19926312xp) {
        return (C132J) k0.LJIILIIL(LLILZIL, inputStream, c19926312xp);
    }

    public static C132J parseFrom(ByteBuffer byteBuffer, C19926312xp c19926312xp) {
        return LLILZIL.LJIIJ(byteBuffer, c19926312xp);
    }
}
