package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.protobuf.k0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: X.130v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C199419130v extends k0 implements InterfaceC199407130j {
    public static final C199419130v LLILZ;
    public static final C130H LLILZIL;
    public static final long serialVersionUID = 0;
    public int LLILLJJLI;
    public byte LLILLL;
    public int end_;
    public C199449131z options_;
    public int start_;

    /* JADX WARN: Type inference failed for: r0v2, types: [X.130H] */
    static {
        C19373810qu.LIZ(EnumC19373110qn.PUBLIC, "ExtensionRange");
        LLILZ = new C199419130v();
        LLILZIL = new AbstractC19925812xk<C199419130v>() { // from class: X.130H
            @Override // X.InterfaceC19925712xj
            public final Object LIZIZ(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) throws C19926612xs {
                C199420130w c199420130wNewBuilder = C199419130v.newBuilder();
                try {
                    c199420130wNewBuilder.LJIL(abstractC19927312xz, c19926312xp);
                    return c199420130wNewBuilder.buildPartial();
                } catch (C19918012wU e) {
                    TryCatchGuardChecker.doCheck(e);
                    C19926612xs c19926612xsAsInvalidProtocolBufferException = e.asInvalidProtocolBufferException();
                    c19926612xsAsInvalidProtocolBufferException.setUnfinishedMessage(c199420130wNewBuilder.buildPartial());
                    throw c19926612xsAsInvalidProtocolBufferException;
                } catch (C19926612xs e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    e2.setUnfinishedMessage(c199420130wNewBuilder.buildPartial());
                    throw e2;
                } catch (IOException e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    C19926612xs c19926612xs = new C19926612xs(e3);
                    c19926612xs.setUnfinishedMessage(c199420130wNewBuilder.buildPartial());
                    throw c19926612xs;
                }
            }
        };
    }

    public static C199420130w newBuilder() {
        return LLILZ.toBuilder();
    }

    @Override // com.google.protobuf.k0
    public final C19935812zM LJI() {
        C19935812zM c19935812zM = C131K.LJFF;
        c19935812zM.LIZ(C199419130v.class, C199420130w.class);
        return c19935812zM;
    }

    public C199449131z getOptions() {
        C199449131z c199449131z = this.options_;
        return c199449131z == null ? C199449131z.getDefaultInstance() : c199449131z;
    }

    public InterfaceC199421130x getOptionsOrBuilder() {
        C199449131z c199449131z = this.options_;
        return c199449131z == null ? C199449131z.getDefaultInstance() : c199449131z;
    }

    @Override // com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19925612xi
    public int getSerializedSize() {
        int i = this.LL;
        if (i != -1) {
            return i;
        }
        int iLJFF = (this.LLILLJJLI & 1) != 0 ? 0 + AbstractC19928912yF.LJFF(1, this.start_) : 0;
        if ((this.LLILLJJLI & 2) != 0) {
            iLJFF += AbstractC19928912yF.LJFF(2, this.end_);
        }
        if ((this.LLILLJJLI & 4) != 0) {
            iLJFF += AbstractC19928912yF.LJII(3, getOptions());
        }
        int serializedSize = iLJFF + getUnknownFields().getSerializedSize();
        this.LL = serializedSize;
        return serializedSize;
    }

    public boolean hasEnd() {
        return (this.LLILLJJLI & 2) != 0;
    }

    public boolean hasOptions() {
        return (this.LLILLJJLI & 4) != 0;
    }

    public boolean hasStart() {
        return (this.LLILLJJLI & 1) != 0;
    }

    @Override // X.AbstractC19932312yn
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = 779 + getDescriptor().hashCode();
        if (hasStart()) {
            iHashCode = (((iHashCode * 37) + 1) * 53) + getStart();
        }
        if (hasEnd()) {
            iHashCode = (((iHashCode * 37) + 2) * 53) + getEnd();
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
    public C199420130w toBuilder() {
        if (this == LLILZ) {
            return new C199420130w();
        }
        C199420130w c199420130w = new C199420130w();
        c199420130w.LJJIFFI(this);
        return c199420130w;
    }

    public C199419130v() {
        this.LLILLL = (byte) -1;
    }

    public static C199419130v getDefaultInstance() {
        return LLILZ;
    }

    public static final AnonymousClass1301 getDescriptor() {
        return C131K.LJ;
    }

    public static InterfaceC19925712xj<C199419130v> parser() {
        return LLILZIL;
    }

    public int getEnd() {
        return this.end_;
    }

    @Override // com.google.protobuf.k0, X.InterfaceC19925612xi
    public InterfaceC19925712xj<C199419130v> getParserForType() {
        return LLILZIL;
    }

    public int getStart() {
        return this.start_;
    }

    @Override // com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19916512wF
    public C199419130v getDefaultInstanceForType() {
        return LLILZ;
    }

    @Override // com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19925612xi
    public C199420130w newBuilderForType() {
        return newBuilder();
    }

    public C199419130v(AbstractC19933512yz abstractC19933512yz) {
        super(abstractC19933512yz);
        this.LLILLL = (byte) -1;
    }

    public static C199420130w newBuilder(C199419130v c199419130v) {
        C199420130w builder = LLILZ.toBuilder();
        builder.LJJIFFI(c199419130v);
        return builder;
    }

    public static C199419130v parseDelimitedFrom(InputStream inputStream) {
        return (C199419130v) k0.LJIIIIZZ(LLILZIL, inputStream);
    }

    public static C199419130v parseFrom(AbstractC19922812xG abstractC19922812xG) {
        return (C199419130v) LLILZIL.LJFF(abstractC19922812xG);
    }

    @Override // X.AbstractC19932312yn
    public final InterfaceC19931912yj LIZLLL(InterfaceC19935412zI interfaceC19935412zI) {
        return new C199420130w(interfaceC19935412zI);
    }

    @Override // X.AbstractC19932312yn
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C199419130v)) {
            return super.equals(obj);
        }
        C199419130v c199419130v = (C199419130v) obj;
        if (hasStart() != c199419130v.hasStart()) {
            return false;
        }
        if ((hasStart() && getStart() != c199419130v.getStart()) || hasEnd() != c199419130v.hasEnd()) {
            return false;
        }
        if ((hasEnd() && getEnd() != c199419130v.getEnd()) || hasOptions() != c199419130v.hasOptions()) {
            return false;
        }
        if ((!hasOptions() || getOptions().equals(c199419130v.getOptions())) && getUnknownFields().equals(c199419130v.getUnknownFields())) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19925612xi
    public void writeTo(AbstractC19928912yF abstractC19928912yF) {
        if ((this.LLILLJJLI & 1) != 0) {
            abstractC19928912yF.LJJII(1, this.start_);
        }
        if ((this.LLILLJJLI & 2) != 0) {
            abstractC19928912yF.LJJII(2, this.end_);
        }
        if ((this.LLILLJJLI & 4) != 0) {
            abstractC19928912yF.LJJIIJ(3, getOptions());
        }
        getUnknownFields().writeTo(abstractC19928912yF);
    }

    public static C199419130v parseFrom(AbstractC19927312xz abstractC19927312xz) {
        return (C199419130v) k0.LJIIJ(LLILZIL, abstractC19927312xz);
    }

    public static C199419130v parseFrom(InputStream inputStream) {
        return (C199419130v) k0.LJIIL(LLILZIL, inputStream);
    }

    public static C199419130v parseFrom(ByteBuffer byteBuffer) {
        return (C199419130v) LLILZIL.LJIIIZ(byteBuffer);
    }

    public static C199419130v parseFrom(byte[] bArr) {
        return (C199419130v) LLILZIL.LJIIJJI(bArr);
    }

    public static C199419130v parseDelimitedFrom(InputStream inputStream, C19926312xp c19926312xp) {
        return (C199419130v) k0.LJIIIZ(LLILZIL, inputStream, c19926312xp);
    }

    public static C199419130v parseFrom(byte[] bArr, C19926312xp c19926312xp) {
        C130H c130h = LLILZIL;
        c130h.getClass();
        InterfaceC19925612xi interfaceC19925612xiLJIILJJIL = c130h.LJIILJJIL(bArr, bArr.length, c19926312xp);
        AbstractC19925812xk.LIZJ(interfaceC19925612xiLJIILJJIL);
        return (C199419130v) interfaceC19925612xiLJIILJJIL;
    }

    public static C199419130v parseFrom(AbstractC19922812xG abstractC19922812xG, C19926312xp c19926312xp) {
        return LLILZIL.LIZ(abstractC19922812xG, c19926312xp);
    }

    public static C199419130v parseFrom(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) {
        return (C199419130v) k0.LJIIJJI(LLILZIL, abstractC19927312xz, c19926312xp);
    }

    public static C199419130v parseFrom(InputStream inputStream, C19926312xp c19926312xp) {
        return (C199419130v) k0.LJIILIIL(LLILZIL, inputStream, c19926312xp);
    }

    public static C199419130v parseFrom(ByteBuffer byteBuffer, C19926312xp c19926312xp) {
        return LLILZIL.LJIIJ(byteBuffer, c19926312xp);
    }
}
