package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.protobuf.k0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: X.132S, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C132S extends k0 implements AnonymousClass1327 {
    public static final C132S LLILZ;
    public static final C199461132l LLILZIL;
    public static final long serialVersionUID = 0;
    public int LLILLJJLI;
    public byte LLILLL;
    public volatile Object fullName_;
    public int number_;
    public boolean repeated_;
    public boolean reserved_;
    public volatile Object type_;

    /* JADX WARN: Type inference failed for: r0v2, types: [X.132l] */
    static {
        C19373810qu.LIZ(EnumC19373110qn.PUBLIC, "Declaration");
        LLILZ = new C132S();
        LLILZIL = new AbstractC19925812xk<C132S>() { // from class: X.132l
            @Override // X.InterfaceC19925712xj
            public final Object LIZIZ(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) throws C19926612xs {
                C132W c132wNewBuilder = C132S.newBuilder();
                try {
                    c132wNewBuilder.LJIL(abstractC19927312xz, c19926312xp);
                    return c132wNewBuilder.buildPartial();
                } catch (C19918012wU e) {
                    TryCatchGuardChecker.doCheck(e);
                    C19926612xs c19926612xsAsInvalidProtocolBufferException = e.asInvalidProtocolBufferException();
                    c19926612xsAsInvalidProtocolBufferException.setUnfinishedMessage(c132wNewBuilder.buildPartial());
                    throw c19926612xsAsInvalidProtocolBufferException;
                } catch (C19926612xs e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    e2.setUnfinishedMessage(c132wNewBuilder.buildPartial());
                    throw e2;
                } catch (IOException e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    C19926612xs c19926612xs = new C19926612xs(e3);
                    c19926612xs.setUnfinishedMessage(c132wNewBuilder.buildPartial());
                    throw c19926612xs;
                }
            }
        };
    }

    public static C132W newBuilder() {
        return LLILZ.toBuilder();
    }

    @Override // com.google.protobuf.k0
    public final C19935812zM LJI() {
        C19935812zM c19935812zM = C131K.LJIIJJI;
        c19935812zM.LIZ(C132S.class, C132W.class);
        return c19935812zM;
    }

    public String getFullName() {
        Object obj = this.fullName_;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC19922812xG abstractC19922812xG = (AbstractC19922812xG) obj;
        String stringUtf8 = abstractC19922812xG.toStringUtf8();
        if (abstractC19922812xG.isValidUtf8()) {
            this.fullName_ = stringUtf8;
        }
        return stringUtf8;
    }

    public AbstractC19922812xG getFullNameBytes() {
        Object obj = this.fullName_;
        if (!(obj instanceof String)) {
            return (AbstractC19922812xG) obj;
        }
        AbstractC19922812xG abstractC19922812xGCopyFromUtf8 = AbstractC19922812xG.copyFromUtf8((String) obj);
        this.fullName_ = abstractC19922812xGCopyFromUtf8;
        return abstractC19922812xGCopyFromUtf8;
    }

    @Override // com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19925612xi
    public int getSerializedSize() {
        int i = this.LL;
        if (i != -1) {
            return i;
        }
        int iLJFF = (this.LLILLJJLI & 1) != 0 ? 0 + AbstractC19928912yF.LJFF(1, this.number_) : 0;
        if ((this.LLILLJJLI & 2) != 0) {
            iLJFF += k0.LJ(2, this.fullName_);
        }
        if ((this.LLILLJJLI & 4) != 0) {
            iLJFF += k0.LJ(3, this.type_);
        }
        if ((this.LLILLJJLI & 8) != 0) {
            iLJFF += AbstractC19928912yF.LIZIZ(5);
        }
        if ((this.LLILLJJLI & 16) != 0) {
            iLJFF += AbstractC19928912yF.LIZIZ(6);
        }
        int serializedSize = iLJFF + getUnknownFields().getSerializedSize();
        this.LL = serializedSize;
        return serializedSize;
    }

    public String getType() {
        Object obj = this.type_;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC19922812xG abstractC19922812xG = (AbstractC19922812xG) obj;
        String stringUtf8 = abstractC19922812xG.toStringUtf8();
        if (abstractC19922812xG.isValidUtf8()) {
            this.type_ = stringUtf8;
        }
        return stringUtf8;
    }

    public AbstractC19922812xG getTypeBytes() {
        Object obj = this.type_;
        if (!(obj instanceof String)) {
            return (AbstractC19922812xG) obj;
        }
        AbstractC19922812xG abstractC19922812xGCopyFromUtf8 = AbstractC19922812xG.copyFromUtf8((String) obj);
        this.type_ = abstractC19922812xGCopyFromUtf8;
        return abstractC19922812xGCopyFromUtf8;
    }

    public boolean hasFullName() {
        return (this.LLILLJJLI & 2) != 0;
    }

    public boolean hasNumber() {
        return (this.LLILLJJLI & 1) != 0;
    }

    public boolean hasRepeated() {
        return (this.LLILLJJLI & 16) != 0;
    }

    public boolean hasReserved() {
        return (this.LLILLJJLI & 8) != 0;
    }

    public boolean hasType() {
        return (this.LLILLJJLI & 4) != 0;
    }

    @Override // X.AbstractC19932312yn
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = 779 + getDescriptor().hashCode();
        if (hasNumber()) {
            iHashCode = (((iHashCode * 37) + 1) * 53) + getNumber();
        }
        if (hasFullName()) {
            iHashCode = (((iHashCode * 37) + 2) * 53) + getFullName().hashCode();
        }
        if (hasType()) {
            iHashCode = (((iHashCode * 37) + 3) * 53) + getType().hashCode();
        }
        if (hasReserved()) {
            iHashCode = (((iHashCode * 37) + 5) * 53) + C19922012x8.LIZIZ(getReserved());
        }
        if (hasRepeated()) {
            iHashCode = (((iHashCode * 37) + 6) * 53) + C19922012x8.LIZIZ(getRepeated());
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
        this.LLILLL = (byte) 1;
        return true;
    }

    @Override // com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19925612xi
    public C132W toBuilder() {
        if (this == LLILZ) {
            return new C132W();
        }
        C132W c132w = new C132W();
        c132w.LJIJJLI(this);
        return c132w;
    }

    public C132S() {
        this.fullName_ = "";
        this.type_ = "";
        this.LLILLL = (byte) -1;
        this.fullName_ = "";
        this.type_ = "";
    }

    public static C132S getDefaultInstance() {
        return LLILZ;
    }

    public static final AnonymousClass1301 getDescriptor() {
        return C131K.LJIIJ;
    }

    public static InterfaceC19925712xj<C132S> parser() {
        return LLILZIL;
    }

    public int getNumber() {
        return this.number_;
    }

    @Override // com.google.protobuf.k0, X.InterfaceC19925612xi
    public InterfaceC19925712xj<C132S> getParserForType() {
        return LLILZIL;
    }

    public boolean getRepeated() {
        return this.repeated_;
    }

    public boolean getReserved() {
        return this.reserved_;
    }

    @Override // com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19916512wF
    public C132S getDefaultInstanceForType() {
        return LLILZ;
    }

    @Override // com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19925612xi
    public C132W newBuilderForType() {
        return newBuilder();
    }

    public C132S(AbstractC19933512yz abstractC19933512yz) {
        super(abstractC19933512yz);
        this.fullName_ = "";
        this.type_ = "";
        this.LLILLL = (byte) -1;
    }

    public static C132W newBuilder(C132S c132s) {
        C132W builder = LLILZ.toBuilder();
        builder.LJIJJLI(c132s);
        return builder;
    }

    public static C132S parseDelimitedFrom(InputStream inputStream) {
        return (C132S) k0.LJIIIIZZ(LLILZIL, inputStream);
    }

    public static C132S parseFrom(AbstractC19922812xG abstractC19922812xG) {
        return (C132S) LLILZIL.LJFF(abstractC19922812xG);
    }

    @Override // X.AbstractC19932312yn
    public final InterfaceC19931912yj LIZLLL(InterfaceC19935412zI interfaceC19935412zI) {
        return new C132W(interfaceC19935412zI);
    }

    @Override // X.AbstractC19932312yn
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C132S)) {
            return super.equals(obj);
        }
        C132S c132s = (C132S) obj;
        if (hasNumber() != c132s.hasNumber()) {
            return false;
        }
        if ((hasNumber() && getNumber() != c132s.getNumber()) || hasFullName() != c132s.hasFullName()) {
            return false;
        }
        if ((hasFullName() && !getFullName().equals(c132s.getFullName())) || hasType() != c132s.hasType()) {
            return false;
        }
        if ((hasType() && !getType().equals(c132s.getType())) || hasReserved() != c132s.hasReserved()) {
            return false;
        }
        if ((hasReserved() && getReserved() != c132s.getReserved()) || hasRepeated() != c132s.hasRepeated()) {
            return false;
        }
        if ((!hasRepeated() || getRepeated() == c132s.getRepeated()) && getUnknownFields().equals(c132s.getUnknownFields())) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19925612xi
    public void writeTo(AbstractC19928912yF abstractC19928912yF) {
        if ((this.LLILLJJLI & 1) != 0) {
            abstractC19928912yF.LJJII(1, this.number_);
        }
        if ((this.LLILLJJLI & 2) != 0) {
            k0.LJIILJJIL(abstractC19928912yF, 2, this.fullName_);
        }
        if ((this.LLILLJJLI & 4) != 0) {
            k0.LJIILJJIL(abstractC19928912yF, 3, this.type_);
        }
        if ((this.LLILLJJLI & 8) != 0) {
            abstractC19928912yF.LJIIZILJ(5, this.reserved_);
        }
        if ((this.LLILLJJLI & 16) != 0) {
            abstractC19928912yF.LJIIZILJ(6, this.repeated_);
        }
        getUnknownFields().writeTo(abstractC19928912yF);
    }

    public static C132S parseFrom(AbstractC19927312xz abstractC19927312xz) {
        return (C132S) k0.LJIIJ(LLILZIL, abstractC19927312xz);
    }

    public static C132S parseFrom(InputStream inputStream) {
        return (C132S) k0.LJIIL(LLILZIL, inputStream);
    }

    public static C132S parseFrom(ByteBuffer byteBuffer) {
        return (C132S) LLILZIL.LJIIIZ(byteBuffer);
    }

    public static C132S parseFrom(byte[] bArr) {
        return (C132S) LLILZIL.LJIIJJI(bArr);
    }

    public static C132S parseDelimitedFrom(InputStream inputStream, C19926312xp c19926312xp) {
        return (C132S) k0.LJIIIZ(LLILZIL, inputStream, c19926312xp);
    }

    public static C132S parseFrom(byte[] bArr, C19926312xp c19926312xp) {
        C199461132l c199461132l = LLILZIL;
        c199461132l.getClass();
        InterfaceC19925612xi interfaceC19925612xiLJIILJJIL = c199461132l.LJIILJJIL(bArr, bArr.length, c19926312xp);
        AbstractC19925812xk.LIZJ(interfaceC19925612xiLJIILJJIL);
        return (C132S) interfaceC19925612xiLJIILJJIL;
    }

    public static C132S parseFrom(AbstractC19922812xG abstractC19922812xG, C19926312xp c19926312xp) {
        return LLILZIL.LIZ(abstractC19922812xG, c19926312xp);
    }

    public static C132S parseFrom(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) {
        return (C132S) k0.LJIIJJI(LLILZIL, abstractC19927312xz, c19926312xp);
    }

    public static C132S parseFrom(InputStream inputStream, C19926312xp c19926312xp) {
        return (C132S) k0.LJIILIIL(LLILZIL, inputStream, c19926312xp);
    }

    public static C132S parseFrom(ByteBuffer byteBuffer, C19926312xp c19926312xp) {
        return LLILZIL.LJIIJ(byteBuffer, c19926312xp);
    }
}
