package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.protobuf.k0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: X.132U, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C132U extends k0 implements InterfaceC199473132x {
    public static final C132U LLILZ;
    public static final C199466132q LLILZIL;
    public static final long serialVersionUID = 0;
    public int LLILLJJLI;
    public byte LLILLL;
    public boolean isExtension_;
    public volatile Object namePart_;

    /* JADX WARN: Type inference failed for: r0v2, types: [X.132q] */
    static {
        C19373810qu.LIZ(EnumC19373110qn.PUBLIC, "NamePart");
        LLILZ = new C132U();
        LLILZIL = new AbstractC19925812xk<C132U>() { // from class: X.132q
            @Override // X.InterfaceC19925712xj
            public final Object LIZIZ(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) throws C19926612xs {
                C199451132b c199451132bNewBuilder = C132U.newBuilder();
                try {
                    c199451132bNewBuilder.LJIL(abstractC19927312xz, c19926312xp);
                    return c199451132bNewBuilder.buildPartial();
                } catch (C19918012wU e) {
                    TryCatchGuardChecker.doCheck(e);
                    C19926612xs c19926612xsAsInvalidProtocolBufferException = e.asInvalidProtocolBufferException();
                    c19926612xsAsInvalidProtocolBufferException.setUnfinishedMessage(c199451132bNewBuilder.buildPartial());
                    throw c19926612xsAsInvalidProtocolBufferException;
                } catch (C19926612xs e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    e2.setUnfinishedMessage(c199451132bNewBuilder.buildPartial());
                    throw e2;
                } catch (IOException e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    C19926612xs c19926612xs = new C19926612xs(e3);
                    c19926612xs.setUnfinishedMessage(c199451132bNewBuilder.buildPartial());
                    throw c19926612xs;
                }
            }
        };
    }

    public static C199451132b newBuilder() {
        return LLILZ.toBuilder();
    }

    @Override // com.google.protobuf.k0
    public final C19935812zM LJI() {
        C19935812zM c19935812zM = C131K.LJJJJLI;
        c19935812zM.LIZ(C132U.class, C199451132b.class);
        return c19935812zM;
    }

    public String getNamePart() {
        Object obj = this.namePart_;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC19922812xG abstractC19922812xG = (AbstractC19922812xG) obj;
        String stringUtf8 = abstractC19922812xG.toStringUtf8();
        if (abstractC19922812xG.isValidUtf8()) {
            this.namePart_ = stringUtf8;
        }
        return stringUtf8;
    }

    public AbstractC19922812xG getNamePartBytes() {
        Object obj = this.namePart_;
        if (!(obj instanceof String)) {
            return (AbstractC19922812xG) obj;
        }
        AbstractC19922812xG abstractC19922812xGCopyFromUtf8 = AbstractC19922812xG.copyFromUtf8((String) obj);
        this.namePart_ = abstractC19922812xGCopyFromUtf8;
        return abstractC19922812xGCopyFromUtf8;
    }

    @Override // com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19925612xi
    public int getSerializedSize() {
        int i = this.LL;
        if (i != -1) {
            return i;
        }
        int iLJ = (this.LLILLJJLI & 1) != 0 ? 0 + k0.LJ(1, this.namePart_) : 0;
        if ((this.LLILLJJLI & 2) != 0) {
            iLJ += AbstractC19928912yF.LIZIZ(2);
        }
        int serializedSize = iLJ + getUnknownFields().getSerializedSize();
        this.LL = serializedSize;
        return serializedSize;
    }

    public boolean hasIsExtension() {
        return (this.LLILLJJLI & 2) != 0;
    }

    public boolean hasNamePart() {
        return (this.LLILLJJLI & 1) != 0;
    }

    @Override // X.AbstractC19932312yn
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = 779 + getDescriptor().hashCode();
        if (hasNamePart()) {
            iHashCode = (((iHashCode * 37) + 1) * 53) + getNamePart().hashCode();
        }
        if (hasIsExtension()) {
            iHashCode = (((iHashCode * 37) + 2) * 53) + C19922012x8.LIZIZ(getIsExtension());
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
        if (!hasNamePart()) {
            this.LLILLL = (byte) 0;
            return false;
        }
        if (hasIsExtension()) {
            this.LLILLL = (byte) 1;
            return true;
        }
        this.LLILLL = (byte) 0;
        return false;
    }

    @Override // com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19925612xi
    public C199451132b toBuilder() {
        if (this == LLILZ) {
            return new C199451132b();
        }
        C199451132b c199451132b = new C199451132b();
        c199451132b.LJIJJLI(this);
        return c199451132b;
    }

    public C132U() {
        this.namePart_ = "";
        this.LLILLL = (byte) -1;
        this.namePart_ = "";
    }

    public static C132U getDefaultInstance() {
        return LLILZ;
    }

    public static final AnonymousClass1301 getDescriptor() {
        return C131K.LJJJJL;
    }

    public static InterfaceC19925712xj<C132U> parser() {
        return LLILZIL;
    }

    public boolean getIsExtension() {
        return this.isExtension_;
    }

    @Override // com.google.protobuf.k0, X.InterfaceC19925612xi
    public InterfaceC19925712xj<C132U> getParserForType() {
        return LLILZIL;
    }

    @Override // com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19916512wF
    public C132U getDefaultInstanceForType() {
        return LLILZ;
    }

    @Override // com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19925612xi
    public C199451132b newBuilderForType() {
        return newBuilder();
    }

    public C132U(AbstractC19933512yz abstractC19933512yz) {
        super(abstractC19933512yz);
        this.namePart_ = "";
        this.LLILLL = (byte) -1;
    }

    public static C199451132b newBuilder(C132U c132u) {
        C199451132b builder = LLILZ.toBuilder();
        builder.LJIJJLI(c132u);
        return builder;
    }

    public static C132U parseDelimitedFrom(InputStream inputStream) {
        return (C132U) k0.LJIIIIZZ(LLILZIL, inputStream);
    }

    public static C132U parseFrom(AbstractC19922812xG abstractC19922812xG) {
        return (C132U) LLILZIL.LJFF(abstractC19922812xG);
    }

    @Override // X.AbstractC19932312yn
    public final InterfaceC19931912yj LIZLLL(InterfaceC19935412zI interfaceC19935412zI) {
        return new C199451132b(interfaceC19935412zI);
    }

    @Override // X.AbstractC19932312yn
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C132U)) {
            return super.equals(obj);
        }
        C132U c132u = (C132U) obj;
        if (hasNamePart() != c132u.hasNamePart()) {
            return false;
        }
        if ((hasNamePart() && !getNamePart().equals(c132u.getNamePart())) || hasIsExtension() != c132u.hasIsExtension()) {
            return false;
        }
        if ((!hasIsExtension() || getIsExtension() == c132u.getIsExtension()) && getUnknownFields().equals(c132u.getUnknownFields())) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19925612xi
    public void writeTo(AbstractC19928912yF abstractC19928912yF) {
        if ((this.LLILLJJLI & 1) != 0) {
            k0.LJIILJJIL(abstractC19928912yF, 1, this.namePart_);
        }
        if ((this.LLILLJJLI & 2) != 0) {
            abstractC19928912yF.LJIIZILJ(2, this.isExtension_);
        }
        getUnknownFields().writeTo(abstractC19928912yF);
    }

    public static C132U parseFrom(AbstractC19927312xz abstractC19927312xz) {
        return (C132U) k0.LJIIJ(LLILZIL, abstractC19927312xz);
    }

    public static C132U parseFrom(InputStream inputStream) {
        return (C132U) k0.LJIIL(LLILZIL, inputStream);
    }

    public static C132U parseFrom(ByteBuffer byteBuffer) {
        return (C132U) LLILZIL.LJIIIZ(byteBuffer);
    }

    public static C132U parseFrom(byte[] bArr) {
        return (C132U) LLILZIL.LJIIJJI(bArr);
    }

    public static C132U parseDelimitedFrom(InputStream inputStream, C19926312xp c19926312xp) {
        return (C132U) k0.LJIIIZ(LLILZIL, inputStream, c19926312xp);
    }

    public static C132U parseFrom(byte[] bArr, C19926312xp c19926312xp) {
        C199466132q c199466132q = LLILZIL;
        c199466132q.getClass();
        InterfaceC19925612xi interfaceC19925612xiLJIILJJIL = c199466132q.LJIILJJIL(bArr, bArr.length, c19926312xp);
        AbstractC19925812xk.LIZJ(interfaceC19925612xiLJIILJJIL);
        return (C132U) interfaceC19925612xiLJIILJJIL;
    }

    public static C132U parseFrom(AbstractC19922812xG abstractC19922812xG, C19926312xp c19926312xp) {
        return LLILZIL.LIZ(abstractC19922812xG, c19926312xp);
    }

    public static C132U parseFrom(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) {
        return (C132U) k0.LJIIJJI(LLILZIL, abstractC19927312xz, c19926312xp);
    }

    public static C132U parseFrom(InputStream inputStream, C19926312xp c19926312xp) {
        return (C132U) k0.LJIILIIL(LLILZIL, inputStream, c19926312xp);
    }

    public static C132U parseFrom(ByteBuffer byteBuffer, C19926312xp c19926312xp) {
        return LLILZIL.LJIIJ(byteBuffer, c19926312xp);
    }
}
