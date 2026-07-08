package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.protobuf.k0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: X.132P, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C132P extends k0 implements InterfaceC199475132z {
    public static final C132P LLILZ;
    public static final C199457132h LLILZIL;
    public static final long serialVersionUID = 0;
    public int LLILLJJLI;
    public byte LLILLL;
    public volatile Object name_;
    public C132C options_;

    /* JADX WARN: Type inference failed for: r0v2, types: [X.132h] */
    static {
        C19373810qu.LIZ(EnumC19373110qn.PUBLIC, "OneofDescriptorProto");
        LLILZ = new C132P();
        LLILZIL = new AbstractC19925812xk<C132P>() { // from class: X.132h
            @Override // X.InterfaceC19925712xj
            public final Object LIZIZ(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) throws C19926612xs {
                C132T c132tNewBuilder = C132P.newBuilder();
                try {
                    c132tNewBuilder.LJJI(abstractC19927312xz, c19926312xp);
                    return c132tNewBuilder.buildPartial();
                } catch (C19918012wU e) {
                    TryCatchGuardChecker.doCheck(e);
                    C19926612xs c19926612xsAsInvalidProtocolBufferException = e.asInvalidProtocolBufferException();
                    c19926612xsAsInvalidProtocolBufferException.setUnfinishedMessage(c132tNewBuilder.buildPartial());
                    throw c19926612xsAsInvalidProtocolBufferException;
                } catch (C19926612xs e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    e2.setUnfinishedMessage(c132tNewBuilder.buildPartial());
                    throw e2;
                } catch (IOException e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    C19926612xs c19926612xs = new C19926612xs(e3);
                    c19926612xs.setUnfinishedMessage(c132tNewBuilder.buildPartial());
                    throw c19926612xs;
                }
            }
        };
    }

    public static C132T newBuilder() {
        return LLILZ.toBuilder();
    }

    @Override // com.google.protobuf.k0
    public final C19935812zM LJI() {
        C19935812zM c19935812zM = C131K.LJIILL;
        c19935812zM.LIZ(C132P.class, C132T.class);
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

    public C132C getOptions() {
        C132C c132c = this.options_;
        return c132c == null ? C132C.getDefaultInstance() : c132c;
    }

    public InterfaceC199470132u getOptionsOrBuilder() {
        C132C c132c = this.options_;
        return c132c == null ? C132C.getDefaultInstance() : c132c;
    }

    @Override // com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19925612xi
    public int getSerializedSize() {
        int i = this.LL;
        if (i != -1) {
            return i;
        }
        int iLJ = (this.LLILLJJLI & 1) != 0 ? 0 + k0.LJ(1, this.name_) : 0;
        if ((this.LLILLJJLI & 2) != 0) {
            iLJ += AbstractC19928912yF.LJII(2, getOptions());
        }
        int serializedSize = iLJ + getUnknownFields().getSerializedSize();
        this.LL = serializedSize;
        return serializedSize;
    }

    public boolean hasName() {
        return (this.LLILLJJLI & 1) != 0;
    }

    public boolean hasOptions() {
        return (this.LLILLJJLI & 2) != 0;
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
        if (hasOptions()) {
            iHashCode = (((iHashCode * 37) + 2) * 53) + getOptions().hashCode();
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
    public C132T toBuilder() {
        if (this == LLILZ) {
            return new C132T();
        }
        C132T c132t = new C132T();
        c132t.LJIL(this);
        return c132t;
    }

    public C132P() {
        this.name_ = "";
        this.LLILLL = (byte) -1;
        this.name_ = "";
    }

    public static C132P getDefaultInstance() {
        return LLILZ;
    }

    public static final AnonymousClass1301 getDescriptor() {
        return C131K.LJIILJJIL;
    }

    public static InterfaceC19925712xj<C132P> parser() {
        return LLILZIL;
    }

    @Override // com.google.protobuf.k0, X.InterfaceC19925612xi
    public InterfaceC19925712xj<C132P> getParserForType() {
        return LLILZIL;
    }

    @Override // com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19916512wF
    public C132P getDefaultInstanceForType() {
        return LLILZ;
    }

    @Override // com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19925612xi
    public C132T newBuilderForType() {
        return newBuilder();
    }

    public C132P(AbstractC19933512yz abstractC19933512yz) {
        super(abstractC19933512yz);
        this.name_ = "";
        this.LLILLL = (byte) -1;
    }

    public static C132T newBuilder(C132P c132p) {
        C132T builder = LLILZ.toBuilder();
        builder.LJIL(c132p);
        return builder;
    }

    public static C132P parseDelimitedFrom(InputStream inputStream) {
        return (C132P) k0.LJIIIIZZ(LLILZIL, inputStream);
    }

    public static C132P parseFrom(AbstractC19922812xG abstractC19922812xG) {
        return (C132P) LLILZIL.LJFF(abstractC19922812xG);
    }

    @Override // X.AbstractC19932312yn
    public final InterfaceC19931912yj LIZLLL(InterfaceC19935412zI interfaceC19935412zI) {
        return new C132T(interfaceC19935412zI);
    }

    @Override // X.AbstractC19932312yn
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C132P)) {
            return super.equals(obj);
        }
        C132P c132p = (C132P) obj;
        if (hasName() != c132p.hasName()) {
            return false;
        }
        if ((hasName() && !getName().equals(c132p.getName())) || hasOptions() != c132p.hasOptions()) {
            return false;
        }
        if ((!hasOptions() || getOptions().equals(c132p.getOptions())) && getUnknownFields().equals(c132p.getUnknownFields())) {
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
            abstractC19928912yF.LJJIIJ(2, getOptions());
        }
        getUnknownFields().writeTo(abstractC19928912yF);
    }

    public static C132P parseFrom(AbstractC19927312xz abstractC19927312xz) {
        return (C132P) k0.LJIIJ(LLILZIL, abstractC19927312xz);
    }

    public static C132P parseFrom(InputStream inputStream) {
        return (C132P) k0.LJIIL(LLILZIL, inputStream);
    }

    public static C132P parseFrom(ByteBuffer byteBuffer) {
        return (C132P) LLILZIL.LJIIIZ(byteBuffer);
    }

    public static C132P parseFrom(byte[] bArr) {
        return (C132P) LLILZIL.LJIIJJI(bArr);
    }

    public static C132P parseDelimitedFrom(InputStream inputStream, C19926312xp c19926312xp) {
        return (C132P) k0.LJIIIZ(LLILZIL, inputStream, c19926312xp);
    }

    public static C132P parseFrom(byte[] bArr, C19926312xp c19926312xp) {
        C199457132h c199457132h = LLILZIL;
        c199457132h.getClass();
        InterfaceC19925612xi interfaceC19925612xiLJIILJJIL = c199457132h.LJIILJJIL(bArr, bArr.length, c19926312xp);
        AbstractC19925812xk.LIZJ(interfaceC19925612xiLJIILJJIL);
        return (C132P) interfaceC19925612xiLJIILJJIL;
    }

    public static C132P parseFrom(AbstractC19922812xG abstractC19922812xG, C19926312xp c19926312xp) {
        return LLILZIL.LIZ(abstractC19922812xG, c19926312xp);
    }

    public static C132P parseFrom(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) {
        return (C132P) k0.LJIIJJI(LLILZIL, abstractC19927312xz, c19926312xp);
    }

    public static C132P parseFrom(InputStream inputStream, C19926312xp c19926312xp) {
        return (C132P) k0.LJIILIIL(LLILZIL, inputStream, c19926312xp);
    }

    public static C132P parseFrom(ByteBuffer byteBuffer, C19926312xp c19926312xp) {
        return LLILZIL.LJIIJ(byteBuffer, c19926312xp);
    }
}
