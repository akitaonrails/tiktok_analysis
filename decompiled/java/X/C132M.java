package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.protobuf.k0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.132M, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C132M extends k0 implements InterfaceC19933112yv {
    public static final C132M LLILZ;
    public static final C199463132n LLILZIL;
    public static final long serialVersionUID = 0;
    public int LLILLJJLI;
    public byte LLILLL;
    public List<C132Q> defaults_;
    public int maximumEdition_;
    public int minimumEdition_;

    /* JADX WARN: Type inference failed for: r0v2, types: [X.132n] */
    static {
        C19373810qu.LIZ(EnumC19373110qn.PUBLIC, "FeatureSetDefaults");
        LLILZ = new C132M();
        LLILZIL = new AbstractC19925812xk<C132M>() { // from class: X.132n
            @Override // X.InterfaceC19925712xj
            public final Object LIZIZ(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) throws C19926612xs {
                C132L c132lNewBuilder = C132M.newBuilder();
                try {
                    c132lNewBuilder.LJIL(abstractC19927312xz, c19926312xp);
                    return c132lNewBuilder.buildPartial();
                } catch (C19918012wU e) {
                    TryCatchGuardChecker.doCheck(e);
                    C19926612xs c19926612xsAsInvalidProtocolBufferException = e.asInvalidProtocolBufferException();
                    c19926612xsAsInvalidProtocolBufferException.setUnfinishedMessage(c132lNewBuilder.buildPartial());
                    throw c19926612xsAsInvalidProtocolBufferException;
                } catch (C19926612xs e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    e2.setUnfinishedMessage(c132lNewBuilder.buildPartial());
                    throw e2;
                } catch (IOException e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    C19926612xs c19926612xs = new C19926612xs(e3);
                    c19926612xs.setUnfinishedMessage(c132lNewBuilder.buildPartial());
                    throw c19926612xs;
                }
            }
        };
    }

    public static C132L newBuilder() {
        return LLILZ.toBuilder();
    }

    @Override // com.google.protobuf.k0
    public final C19935812zM LJI() {
        C19935812zM c19935812zM = C131K.LJJJLZIJ;
        c19935812zM.LIZ(C132M.class, C132L.class);
        return c19935812zM;
    }

    public int getDefaultsCount() {
        return this.defaults_.size();
    }

    public C130B getMaximumEdition() {
        C130B c130bForNumber = C130B.forNumber(this.maximumEdition_);
        return c130bForNumber == null ? C130B.EDITION_UNKNOWN : c130bForNumber;
    }

    public C130B getMinimumEdition() {
        C130B c130bForNumber = C130B.forNumber(this.minimumEdition_);
        return c130bForNumber == null ? C130B.EDITION_UNKNOWN : c130bForNumber;
    }

    @Override // com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19925612xi
    public int getSerializedSize() {
        int i = this.LL;
        if (i != -1) {
            return i;
        }
        int iLJ = 0;
        for (int i2 = 0; i2 < this.defaults_.size(); i2++) {
            iLJ += AbstractC19928912yF.LJII(1, (InterfaceC19925612xi) ListProtector.get(this.defaults_, i2));
        }
        if ((this.LLILLJJLI & 1) != 0) {
            iLJ += AbstractC19928912yF.LJ(4, this.minimumEdition_);
        }
        if ((this.LLILLJJLI & 2) != 0) {
            iLJ += AbstractC19928912yF.LJ(5, this.maximumEdition_);
        }
        int serializedSize = iLJ + getUnknownFields().getSerializedSize();
        this.LL = serializedSize;
        return serializedSize;
    }

    public boolean hasMaximumEdition() {
        return (this.LLILLJJLI & 2) != 0;
    }

    public boolean hasMinimumEdition() {
        return (this.LLILLJJLI & 1) != 0;
    }

    @Override // X.AbstractC19932312yn
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = 779 + getDescriptor().hashCode();
        if (getDefaultsCount() > 0) {
            iHashCode = (((iHashCode * 37) + 1) * 53) + getDefaultsList().hashCode();
        }
        if (hasMinimumEdition()) {
            iHashCode = (((iHashCode * 37) + 4) * 53) + this.minimumEdition_;
        }
        if (hasMaximumEdition()) {
            iHashCode = (((iHashCode * 37) + 5) * 53) + this.maximumEdition_;
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
        for (int i = 0; i < getDefaultsCount(); i++) {
            if (!getDefaults(i).isInitialized()) {
                this.LLILLL = (byte) 0;
                return false;
            }
        }
        this.LLILLL = (byte) 1;
        return true;
    }

    @Override // com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19925612xi
    public C132L toBuilder() {
        if (this == LLILZ) {
            return new C132L();
        }
        C132L c132l = new C132L();
        c132l.LJIJJLI(this);
        return c132l;
    }

    public C132M() {
        this.LLILLL = (byte) -1;
        this.defaults_ = Collections.emptyList();
        this.minimumEdition_ = 0;
        this.maximumEdition_ = 0;
    }

    public static C132M getDefaultInstance() {
        return LLILZ;
    }

    public static final AnonymousClass1301 getDescriptor() {
        return C131K.LJJJLL;
    }

    public static InterfaceC19925712xj<C132M> parser() {
        return LLILZIL;
    }

    public List<C132Q> getDefaultsList() {
        return this.defaults_;
    }

    public List<? extends InterfaceC199472132w> getDefaultsOrBuilderList() {
        return this.defaults_;
    }

    @Override // com.google.protobuf.k0, X.InterfaceC19925612xi
    public InterfaceC19925712xj<C132M> getParserForType() {
        return LLILZIL;
    }

    @Override // com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19916512wF
    public C132M getDefaultInstanceForType() {
        return LLILZ;
    }

    @Override // com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19925612xi
    public C132L newBuilderForType() {
        return newBuilder();
    }

    public C132M(AbstractC19933512yz abstractC19933512yz) {
        super(abstractC19933512yz);
        this.LLILLL = (byte) -1;
    }

    public static C132L newBuilder(C132M c132m) {
        C132L builder = LLILZ.toBuilder();
        builder.LJIJJLI(c132m);
        return builder;
    }

    public static C132M parseDelimitedFrom(InputStream inputStream) {
        return (C132M) k0.LJIIIIZZ(LLILZIL, inputStream);
    }

    public static C132M parseFrom(AbstractC19922812xG abstractC19922812xG) {
        return (C132M) LLILZIL.LJFF(abstractC19922812xG);
    }

    @Override // X.AbstractC19932312yn
    public final InterfaceC19931912yj LIZLLL(InterfaceC19935412zI interfaceC19935412zI) {
        return new C132L(interfaceC19935412zI);
    }

    @Override // X.AbstractC19932312yn
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C132M)) {
            return super.equals(obj);
        }
        C132M c132m = (C132M) obj;
        if (!getDefaultsList().equals(c132m.getDefaultsList()) || hasMinimumEdition() != c132m.hasMinimumEdition()) {
            return false;
        }
        if ((hasMinimumEdition() && this.minimumEdition_ != c132m.minimumEdition_) || hasMaximumEdition() != c132m.hasMaximumEdition()) {
            return false;
        }
        if ((!hasMaximumEdition() || this.maximumEdition_ == c132m.maximumEdition_) && getUnknownFields().equals(c132m.getUnknownFields())) {
            return true;
        }
        return false;
    }

    public C132Q getDefaults(int i) {
        return (C132Q) ListProtector.get(this.defaults_, i);
    }

    public InterfaceC199472132w getDefaultsOrBuilder(int i) {
        return (InterfaceC199472132w) ListProtector.get(this.defaults_, i);
    }

    @Override // com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19925612xi
    public void writeTo(AbstractC19928912yF abstractC19928912yF) {
        for (int i = 0; i < this.defaults_.size(); i++) {
            abstractC19928912yF.LJJIIJ(1, (InterfaceC19925612xi) ListProtector.get(this.defaults_, i));
        }
        if ((this.LLILLJJLI & 1) != 0) {
            abstractC19928912yF.LJJII(4, this.minimumEdition_);
        }
        if ((this.LLILLJJLI & 2) != 0) {
            abstractC19928912yF.LJJII(5, this.maximumEdition_);
        }
        getUnknownFields().writeTo(abstractC19928912yF);
    }

    public static C132M parseFrom(AbstractC19927312xz abstractC19927312xz) {
        return (C132M) k0.LJIIJ(LLILZIL, abstractC19927312xz);
    }

    public static C132M parseFrom(InputStream inputStream) {
        return (C132M) k0.LJIIL(LLILZIL, inputStream);
    }

    public static C132M parseFrom(ByteBuffer byteBuffer) {
        return (C132M) LLILZIL.LJIIIZ(byteBuffer);
    }

    public static C132M parseFrom(byte[] bArr) {
        return (C132M) LLILZIL.LJIIJJI(bArr);
    }

    public static C132M parseDelimitedFrom(InputStream inputStream, C19926312xp c19926312xp) {
        return (C132M) k0.LJIIIZ(LLILZIL, inputStream, c19926312xp);
    }

    public static C132M parseFrom(byte[] bArr, C19926312xp c19926312xp) {
        C199463132n c199463132n = LLILZIL;
        c199463132n.getClass();
        InterfaceC19925612xi interfaceC19925612xiLJIILJJIL = c199463132n.LJIILJJIL(bArr, bArr.length, c19926312xp);
        AbstractC19925812xk.LIZJ(interfaceC19925612xiLJIILJJIL);
        return (C132M) interfaceC19925612xiLJIILJJIL;
    }

    public static C132M parseFrom(AbstractC19922812xG abstractC19922812xG, C19926312xp c19926312xp) {
        return LLILZIL.LIZ(abstractC19922812xG, c19926312xp);
    }

    public static C132M parseFrom(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) {
        return (C132M) k0.LJIIJJI(LLILZIL, abstractC19927312xz, c19926312xp);
    }

    public static C132M parseFrom(InputStream inputStream, C19926312xp c19926312xp) {
        return (C132M) k0.LJIILIIL(LLILZIL, inputStream, c19926312xp);
    }

    public static C132M parseFrom(ByteBuffer byteBuffer, C19926312xp c19926312xp) {
        return LLILZIL.LJIIJ(byteBuffer, c19926312xp);
    }
}
