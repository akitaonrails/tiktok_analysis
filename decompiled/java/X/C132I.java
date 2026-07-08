package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.protobuf.k0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.132I, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C132I extends k0 implements AnonymousClass1330 {
    public static final C132I LLILZ;
    public static final C199459132j LLILZIL;
    public static final long serialVersionUID = 0;
    public int LLILLJJLI;
    public byte LLILLL;
    public List<C132J> method_;
    public volatile Object name_;
    public C132D options_;

    /* JADX WARN: Type inference failed for: r0v2, types: [X.132j] */
    static {
        C19373810qu.LIZ(EnumC19373110qn.PUBLIC, "ServiceDescriptorProto");
        LLILZ = new C132I();
        LLILZIL = new AbstractC19925812xk<C132I>() { // from class: X.132j
            @Override // X.InterfaceC19925712xj
            public final Object LIZIZ(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) throws C19926612xs {
                C132H c132hNewBuilder = C132I.newBuilder();
                try {
                    c132hNewBuilder.LJJIFFI(abstractC19927312xz, c19926312xp);
                    return c132hNewBuilder.buildPartial();
                } catch (C19918012wU e) {
                    TryCatchGuardChecker.doCheck(e);
                    C19926612xs c19926612xsAsInvalidProtocolBufferException = e.asInvalidProtocolBufferException();
                    c19926612xsAsInvalidProtocolBufferException.setUnfinishedMessage(c132hNewBuilder.buildPartial());
                    throw c19926612xsAsInvalidProtocolBufferException;
                } catch (C19926612xs e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    e2.setUnfinishedMessage(c132hNewBuilder.buildPartial());
                    throw e2;
                } catch (IOException e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    C19926612xs c19926612xs = new C19926612xs(e3);
                    c19926612xs.setUnfinishedMessage(c132hNewBuilder.buildPartial());
                    throw c19926612xs;
                }
            }
        };
    }

    public static C132H newBuilder() {
        return LLILZ.toBuilder();
    }

    @Override // com.google.protobuf.k0
    public final C19935812zM LJI() {
        C19935812zM c19935812zM = C131K.LJJ;
        c19935812zM.LIZ(C132I.class, C132H.class);
        return c19935812zM;
    }

    public int getMethodCount() {
        return this.method_.size();
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

    public C132D getOptions() {
        C132D c132d = this.options_;
        return c132d == null ? C132D.getDefaultInstance() : c132d;
    }

    public InterfaceC199471132v getOptionsOrBuilder() {
        C132D c132d = this.options_;
        return c132d == null ? C132D.getDefaultInstance() : c132d;
    }

    @Override // com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19925612xi
    public int getSerializedSize() {
        int i = this.LL;
        if (i != -1) {
            return i;
        }
        int iLJ = (this.LLILLJJLI & 1) != 0 ? k0.LJ(1, this.name_) : 0;
        for (int i2 = 0; i2 < this.method_.size(); i2++) {
            iLJ += AbstractC19928912yF.LJII(2, (InterfaceC19925612xi) ListProtector.get(this.method_, i2));
        }
        if ((this.LLILLJJLI & 2) != 0) {
            iLJ += AbstractC19928912yF.LJII(3, getOptions());
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
        if (getMethodCount() > 0) {
            iHashCode = (((iHashCode * 37) + 2) * 53) + getMethodList().hashCode();
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
        for (int i = 0; i < getMethodCount(); i++) {
            if (!getMethod(i).isInitialized()) {
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
    public C132H toBuilder() {
        if (this == LLILZ) {
            return new C132H();
        }
        C132H c132h = new C132H();
        c132h.LJJI(this);
        return c132h;
    }

    public C132I() {
        this.name_ = "";
        this.LLILLL = (byte) -1;
        this.name_ = "";
        this.method_ = Collections.emptyList();
    }

    public static C132I getDefaultInstance() {
        return LLILZ;
    }

    public static final AnonymousClass1301 getDescriptor() {
        return C131K.LJIL;
    }

    public static InterfaceC19925712xj<C132I> parser() {
        return LLILZIL;
    }

    public List<C132J> getMethodList() {
        return this.method_;
    }

    public List<? extends InterfaceC199474132y> getMethodOrBuilderList() {
        return this.method_;
    }

    @Override // com.google.protobuf.k0, X.InterfaceC19925612xi
    public InterfaceC19925712xj<C132I> getParserForType() {
        return LLILZIL;
    }

    @Override // com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19916512wF
    public C132I getDefaultInstanceForType() {
        return LLILZ;
    }

    @Override // com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19925612xi
    public C132H newBuilderForType() {
        return newBuilder();
    }

    public C132I(AbstractC19933512yz abstractC19933512yz) {
        super(abstractC19933512yz);
        this.name_ = "";
        this.LLILLL = (byte) -1;
    }

    public static C132H newBuilder(C132I c132i) {
        C132H builder = LLILZ.toBuilder();
        builder.LJJI(c132i);
        return builder;
    }

    public static C132I parseDelimitedFrom(InputStream inputStream) {
        return (C132I) k0.LJIIIIZZ(LLILZIL, inputStream);
    }

    public static C132I parseFrom(AbstractC19922812xG abstractC19922812xG) {
        return (C132I) LLILZIL.LJFF(abstractC19922812xG);
    }

    @Override // X.AbstractC19932312yn
    public final InterfaceC19931912yj LIZLLL(InterfaceC19935412zI interfaceC19935412zI) {
        return new C132H(interfaceC19935412zI);
    }

    @Override // X.AbstractC19932312yn
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C132I)) {
            return super.equals(obj);
        }
        C132I c132i = (C132I) obj;
        if (hasName() != c132i.hasName()) {
            return false;
        }
        if ((hasName() && !getName().equals(c132i.getName())) || !getMethodList().equals(c132i.getMethodList()) || hasOptions() != c132i.hasOptions()) {
            return false;
        }
        if ((!hasOptions() || getOptions().equals(c132i.getOptions())) && getUnknownFields().equals(c132i.getUnknownFields())) {
            return true;
        }
        return false;
    }

    public C132J getMethod(int i) {
        return (C132J) ListProtector.get(this.method_, i);
    }

    public InterfaceC199474132y getMethodOrBuilder(int i) {
        return (InterfaceC199474132y) ListProtector.get(this.method_, i);
    }

    @Override // com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19925612xi
    public void writeTo(AbstractC19928912yF abstractC19928912yF) {
        if ((this.LLILLJJLI & 1) != 0) {
            k0.LJIILJJIL(abstractC19928912yF, 1, this.name_);
        }
        for (int i = 0; i < this.method_.size(); i++) {
            abstractC19928912yF.LJJIIJ(2, (InterfaceC19925612xi) ListProtector.get(this.method_, i));
        }
        if ((this.LLILLJJLI & 2) != 0) {
            abstractC19928912yF.LJJIIJ(3, getOptions());
        }
        getUnknownFields().writeTo(abstractC19928912yF);
    }

    public static C132I parseFrom(AbstractC19927312xz abstractC19927312xz) {
        return (C132I) k0.LJIIJ(LLILZIL, abstractC19927312xz);
    }

    public static C132I parseFrom(InputStream inputStream) {
        return (C132I) k0.LJIIL(LLILZIL, inputStream);
    }

    public static C132I parseFrom(ByteBuffer byteBuffer) {
        return (C132I) LLILZIL.LJIIIZ(byteBuffer);
    }

    public static C132I parseFrom(byte[] bArr) {
        return (C132I) LLILZIL.LJIIJJI(bArr);
    }

    public static C132I parseDelimitedFrom(InputStream inputStream, C19926312xp c19926312xp) {
        return (C132I) k0.LJIIIZ(LLILZIL, inputStream, c19926312xp);
    }

    public static C132I parseFrom(byte[] bArr, C19926312xp c19926312xp) {
        C199459132j c199459132j = LLILZIL;
        c199459132j.getClass();
        InterfaceC19925612xi interfaceC19925612xiLJIILJJIL = c199459132j.LJIILJJIL(bArr, bArr.length, c19926312xp);
        AbstractC19925812xk.LIZJ(interfaceC19925612xiLJIILJJIL);
        return (C132I) interfaceC19925612xiLJIILJJIL;
    }

    public static C132I parseFrom(AbstractC19922812xG abstractC19922812xG, C19926312xp c19926312xp) {
        return LLILZIL.LIZ(abstractC19922812xG, c19926312xp);
    }

    public static C132I parseFrom(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) {
        return (C132I) k0.LJIIJJI(LLILZIL, abstractC19927312xz, c19926312xp);
    }

    public static C132I parseFrom(InputStream inputStream, C19926312xp c19926312xp) {
        return (C132I) k0.LJIILIIL(LLILZIL, inputStream, c19926312xp);
    }

    public static C132I parseFrom(ByteBuffer byteBuffer, C19926312xp c19926312xp) {
        return LLILZIL.LJIIJ(byteBuffer, c19926312xp);
    }
}
