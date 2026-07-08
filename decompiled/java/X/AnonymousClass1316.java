package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.protobuf.k0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: renamed from: X.1316, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class AnonymousClass1316 extends k0 implements C131B {
    public static final AnonymousClass1316 LLILZLL;
    public static final AnonymousClass1319 LLIZ;
    public static final long serialVersionUID = 0;
    public int LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public byte LLILZIL;
    public volatile Object leadingComments_;
    public C19920612wu leadingDetachedComments_;
    public InterfaceC19922412xC path_;
    public InterfaceC19922412xC span_;
    public volatile Object trailingComments_;

    /* JADX WARN: Type inference failed for: r0v2, types: [X.1319] */
    static {
        C19373810qu.LIZ(EnumC19373110qn.PUBLIC, "Location");
        LLILZLL = new AnonymousClass1316();
        LLIZ = new AbstractC19925812xk<AnonymousClass1316>() { // from class: X.1319
            @Override // X.InterfaceC19925712xj
            public final Object LIZIZ(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) throws C19926612xs {
                AnonymousClass1317 anonymousClass1317NewBuilder = AnonymousClass1316.newBuilder();
                try {
                    anonymousClass1317NewBuilder.LJJIFFI(abstractC19927312xz, c19926312xp);
                    return anonymousClass1317NewBuilder.buildPartial();
                } catch (C19918012wU e) {
                    TryCatchGuardChecker.doCheck(e);
                    C19926612xs c19926612xsAsInvalidProtocolBufferException = e.asInvalidProtocolBufferException();
                    c19926612xsAsInvalidProtocolBufferException.setUnfinishedMessage(anonymousClass1317NewBuilder.buildPartial());
                    throw c19926612xsAsInvalidProtocolBufferException;
                } catch (C19926612xs e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    e2.setUnfinishedMessage(anonymousClass1317NewBuilder.buildPartial());
                    throw e2;
                } catch (IOException e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    C19926612xs c19926612xs = new C19926612xs(e3);
                    c19926612xs.setUnfinishedMessage(anonymousClass1317NewBuilder.buildPartial());
                    throw c19926612xs;
                }
            }
        };
    }

    public static AnonymousClass1317 newBuilder() {
        return LLILZLL.toBuilder();
    }

    @Override // com.google.protobuf.k0
    public final C19935812zM LJI() {
        C19935812zM c19935812zM = C131K.LJJLIIIJILLIZJL;
        c19935812zM.LIZ(AnonymousClass1316.class, AnonymousClass1317.class);
        return c19935812zM;
    }

    public String getLeadingComments() {
        Object obj = this.leadingComments_;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC19922812xG abstractC19922812xG = (AbstractC19922812xG) obj;
        String stringUtf8 = abstractC19922812xG.toStringUtf8();
        if (abstractC19922812xG.isValidUtf8()) {
            this.leadingComments_ = stringUtf8;
        }
        return stringUtf8;
    }

    public AbstractC19922812xG getLeadingCommentsBytes() {
        Object obj = this.leadingComments_;
        if (!(obj instanceof String)) {
            return (AbstractC19922812xG) obj;
        }
        AbstractC19922812xG abstractC19922812xGCopyFromUtf8 = AbstractC19922812xG.copyFromUtf8((String) obj);
        this.leadingComments_ = abstractC19922812xGCopyFromUtf8;
        return abstractC19922812xGCopyFromUtf8;
    }

    public int getLeadingDetachedCommentsCount() {
        return this.leadingDetachedComments_.size();
    }

    public int getPathCount() {
        return this.path_.size();
    }

    @Override // com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19925612xi
    public int getSerializedSize() {
        int i = this.LL;
        if (i != -1) {
            return i;
        }
        int iLJIILJJIL = 0;
        for (int i2 = 0; i2 < this.path_.size(); i2++) {
            iLJIILJJIL += AbstractC19928912yF.LJIILJJIL(this.path_.getInt(i2));
        }
        int iLJIILJJIL2 = iLJIILJJIL;
        if (!getPathList().isEmpty()) {
            iLJIILJJIL2 = iLJIILJJIL + 1 + AbstractC19928912yF.LJIILJJIL(iLJIILJJIL);
        }
        this.LLILLL = iLJIILJJIL;
        int iLJIILJJIL3 = 0;
        for (int i3 = 0; i3 < this.span_.size(); i3++) {
            iLJIILJJIL3 += AbstractC19928912yF.LJIILJJIL(this.span_.getInt(i3));
        }
        int iLJ = iLJIILJJIL2 + iLJIILJJIL3;
        if (!getSpanList().isEmpty()) {
            iLJ = iLJ + 1 + AbstractC19928912yF.LJIILJJIL(iLJIILJJIL3);
        }
        this.LLILZ = iLJIILJJIL3;
        if ((this.LLILLJJLI & 1) != 0) {
            iLJ += k0.LJ(3, this.leadingComments_);
        }
        if ((this.LLILLJJLI & 2) != 0) {
            iLJ += k0.LJ(4, this.trailingComments_);
        }
        int iLJFF = 0;
        for (int i4 = 0; i4 < this.leadingDetachedComments_.size(); i4++) {
            iLJFF += k0.LJFF(this.leadingDetachedComments_.LJJJLL(i4));
        }
        int size = iLJ + iLJFF + m92getLeadingDetachedCommentsList().size() + getUnknownFields().getSerializedSize();
        this.LL = size;
        return size;
    }

    public int getSpanCount() {
        return this.span_.size();
    }

    public String getTrailingComments() {
        Object obj = this.trailingComments_;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC19922812xG abstractC19922812xG = (AbstractC19922812xG) obj;
        String stringUtf8 = abstractC19922812xG.toStringUtf8();
        if (abstractC19922812xG.isValidUtf8()) {
            this.trailingComments_ = stringUtf8;
        }
        return stringUtf8;
    }

    public AbstractC19922812xG getTrailingCommentsBytes() {
        Object obj = this.trailingComments_;
        if (!(obj instanceof String)) {
            return (AbstractC19922812xG) obj;
        }
        AbstractC19922812xG abstractC19922812xGCopyFromUtf8 = AbstractC19922812xG.copyFromUtf8((String) obj);
        this.trailingComments_ = abstractC19922812xGCopyFromUtf8;
        return abstractC19922812xGCopyFromUtf8;
    }

    public boolean hasLeadingComments() {
        return (this.LLILLJJLI & 1) != 0;
    }

    public boolean hasTrailingComments() {
        return (this.LLILLJJLI & 2) != 0;
    }

    @Override // X.AbstractC19932312yn
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = 779 + getDescriptor().hashCode();
        if (getPathCount() > 0) {
            iHashCode = (((iHashCode * 37) + 1) * 53) + getPathList().hashCode();
        }
        if (getSpanCount() > 0) {
            iHashCode = (((iHashCode * 37) + 2) * 53) + getSpanList().hashCode();
        }
        if (hasLeadingComments()) {
            iHashCode = (((iHashCode * 37) + 3) * 53) + getLeadingComments().hashCode();
        }
        if (hasTrailingComments()) {
            iHashCode = (((iHashCode * 37) + 4) * 53) + getTrailingComments().hashCode();
        }
        if (getLeadingDetachedCommentsCount() > 0) {
            iHashCode = (((iHashCode * 37) + 6) * 53) + m92getLeadingDetachedCommentsList().hashCode();
        }
        int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19916512wF
    public final boolean isInitialized() {
        byte b = this.LLILZIL;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.LLILZIL = (byte) 1;
        return true;
    }

    @Override // com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19925612xi
    public AnonymousClass1317 toBuilder() {
        if (this == LLILZLL) {
            return new AnonymousClass1317();
        }
        AnonymousClass1317 anonymousClass1317 = new AnonymousClass1317();
        anonymousClass1317.LJJI(this);
        return anonymousClass1317;
    }

    public AnonymousClass1316() {
        C19889012ro c19889012ro = C19889012ro.LLILZIL;
        this.path_ = c19889012ro;
        this.LLILLL = -1;
        this.span_ = c19889012ro;
        this.LLILZ = -1;
        this.leadingComments_ = "";
        this.trailingComments_ = "";
        C19920612wu c19920612wu = C19920612wu.LLILLL;
        this.leadingDetachedComments_ = c19920612wu;
        this.LLILZIL = (byte) -1;
        this.path_ = c19889012ro;
        this.span_ = c19889012ro;
        this.leadingComments_ = "";
        this.trailingComments_ = "";
        this.leadingDetachedComments_ = c19920612wu;
    }

    public static AnonymousClass1316 getDefaultInstance() {
        return LLILZLL;
    }

    public static final AnonymousClass1301 getDescriptor() {
        return C131K.LJJLIIIJ;
    }

    public static InterfaceC19925712xj<AnonymousClass1316> parser() {
        return LLIZ;
    }

    @Override // com.google.protobuf.k0, X.InterfaceC19925612xi
    public InterfaceC19925712xj<AnonymousClass1316> getParserForType() {
        return LLIZ;
    }

    public List<Integer> getPathList() {
        return this.path_;
    }

    public List<Integer> getSpanList() {
        return this.span_;
    }

    /* JADX INFO: renamed from: getLeadingDetachedCommentsList, reason: merged with bridge method [inline-methods] */
    public InterfaceC1554550qYX m92getLeadingDetachedCommentsList() {
        return this.leadingDetachedComments_;
    }

    @Override // com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19916512wF
    public AnonymousClass1316 getDefaultInstanceForType() {
        return LLILZLL;
    }

    @Override // com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19925612xi
    public AnonymousClass1317 newBuilderForType() {
        return newBuilder();
    }

    public AnonymousClass1316(AbstractC19933512yz abstractC19933512yz) {
        super(abstractC19933512yz);
        C19889012ro c19889012ro = C19889012ro.LLILZIL;
        this.path_ = c19889012ro;
        this.LLILLL = -1;
        this.span_ = c19889012ro;
        this.LLILZ = -1;
        this.leadingComments_ = "";
        this.trailingComments_ = "";
        this.leadingDetachedComments_ = C19920612wu.LLILLL;
        this.LLILZIL = (byte) -1;
    }

    public static AnonymousClass1317 newBuilder(AnonymousClass1316 anonymousClass1316) {
        AnonymousClass1317 builder = LLILZLL.toBuilder();
        builder.LJJI(anonymousClass1316);
        return builder;
    }

    public static AnonymousClass1316 parseDelimitedFrom(InputStream inputStream) {
        return (AnonymousClass1316) k0.LJIIIIZZ(LLIZ, inputStream);
    }

    public static AnonymousClass1316 parseFrom(AbstractC19922812xG abstractC19922812xG) {
        return (AnonymousClass1316) LLIZ.LJFF(abstractC19922812xG);
    }

    @Override // X.AbstractC19932312yn
    public final InterfaceC19931912yj LIZLLL(InterfaceC19935412zI interfaceC19935412zI) {
        return new AnonymousClass1317(interfaceC19935412zI);
    }

    @Override // X.AbstractC19932312yn
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AnonymousClass1316)) {
            return super.equals(obj);
        }
        AnonymousClass1316 anonymousClass1316 = (AnonymousClass1316) obj;
        if (!getPathList().equals(anonymousClass1316.getPathList()) || !getSpanList().equals(anonymousClass1316.getSpanList()) || hasLeadingComments() != anonymousClass1316.hasLeadingComments()) {
            return false;
        }
        if ((hasLeadingComments() && !getLeadingComments().equals(anonymousClass1316.getLeadingComments())) || hasTrailingComments() != anonymousClass1316.hasTrailingComments()) {
            return false;
        }
        if ((!hasTrailingComments() || getTrailingComments().equals(anonymousClass1316.getTrailingComments())) && m92getLeadingDetachedCommentsList().equals(anonymousClass1316.m92getLeadingDetachedCommentsList()) && getUnknownFields().equals(anonymousClass1316.getUnknownFields())) {
            return true;
        }
        return false;
    }

    public String getLeadingDetachedComments(int i) {
        return this.leadingDetachedComments_.get(i);
    }

    public AbstractC19922812xG getLeadingDetachedCommentsBytes(int i) {
        return this.leadingDetachedComments_.LJFF(i);
    }

    public int getPath(int i) {
        return this.path_.getInt(i);
    }

    public int getSpan(int i) {
        return this.span_.getInt(i);
    }

    @Override // com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19925612xi
    public void writeTo(AbstractC19928912yF abstractC19928912yF) {
        getSerializedSize();
        if (getPathList().size() > 0) {
            abstractC19928912yF.LJJIJL(10);
            abstractC19928912yF.LJJIJL(this.LLILLL);
        }
        for (int i = 0; i < this.path_.size(); i++) {
            abstractC19928912yF.LJJIII(this.path_.getInt(i));
        }
        if (getSpanList().size() > 0) {
            abstractC19928912yF.LJJIJL(18);
            abstractC19928912yF.LJJIJL(this.LLILZ);
        }
        for (int i2 = 0; i2 < this.span_.size(); i2++) {
            abstractC19928912yF.LJJIII(this.span_.getInt(i2));
        }
        if ((this.LLILLJJLI & 1) != 0) {
            k0.LJIILJJIL(abstractC19928912yF, 3, this.leadingComments_);
        }
        if ((this.LLILLJJLI & 2) != 0) {
            k0.LJIILJJIL(abstractC19928912yF, 4, this.trailingComments_);
        }
        for (int i3 = 0; i3 < this.leadingDetachedComments_.size(); i3++) {
            k0.LJIILJJIL(abstractC19928912yF, 6, this.leadingDetachedComments_.LJJJLL(i3));
        }
        getUnknownFields().writeTo(abstractC19928912yF);
    }

    public static AnonymousClass1316 parseFrom(AbstractC19927312xz abstractC19927312xz) {
        return (AnonymousClass1316) k0.LJIIJ(LLIZ, abstractC19927312xz);
    }

    public static AnonymousClass1316 parseFrom(InputStream inputStream) {
        return (AnonymousClass1316) k0.LJIIL(LLIZ, inputStream);
    }

    public static AnonymousClass1316 parseFrom(ByteBuffer byteBuffer) {
        return (AnonymousClass1316) LLIZ.LJIIIZ(byteBuffer);
    }

    public static AnonymousClass1316 parseFrom(byte[] bArr) {
        return (AnonymousClass1316) LLIZ.LJIIJJI(bArr);
    }

    public static AnonymousClass1316 parseDelimitedFrom(InputStream inputStream, C19926312xp c19926312xp) {
        return (AnonymousClass1316) k0.LJIIIZ(LLIZ, inputStream, c19926312xp);
    }

    public static AnonymousClass1316 parseFrom(byte[] bArr, C19926312xp c19926312xp) {
        AnonymousClass1319 anonymousClass1319 = LLIZ;
        anonymousClass1319.getClass();
        InterfaceC19925612xi interfaceC19925612xiLJIILJJIL = anonymousClass1319.LJIILJJIL(bArr, bArr.length, c19926312xp);
        AbstractC19925812xk.LIZJ(interfaceC19925612xiLJIILJJIL);
        return (AnonymousClass1316) interfaceC19925612xiLJIILJJIL;
    }

    public static AnonymousClass1316 parseFrom(AbstractC19922812xG abstractC19922812xG, C19926312xp c19926312xp) {
        return LLIZ.LIZ(abstractC19922812xG, c19926312xp);
    }

    public static AnonymousClass1316 parseFrom(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) {
        return (AnonymousClass1316) k0.LJIIJJI(LLIZ, abstractC19927312xz, c19926312xp);
    }

    public static AnonymousClass1316 parseFrom(InputStream inputStream, C19926312xp c19926312xp) {
        return (AnonymousClass1316) k0.LJIILIIL(LLIZ, inputStream, c19926312xp);
    }

    public static AnonymousClass1316 parseFrom(ByteBuffer byteBuffer, C19926312xp c19926312xp) {
        return LLIZ.LJIIJ(byteBuffer, c19926312xp);
    }
}
