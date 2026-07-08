package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.protobuf.k0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.1315, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class AnonymousClass1315 extends AbstractC19933412yy<AnonymousClass1315> implements InterfaceC199417130t {
    public static final AnonymousClass1315 LLILLL;
    public static final AnonymousClass1318 LLILZ;
    public static final long serialVersionUID = 0;
    public byte LLILLJJLI;
    public List<AnonymousClass1316> location_;

    /* JADX WARN: Type inference failed for: r0v2, types: [X.1318] */
    static {
        C19373810qu.LIZ(EnumC19373110qn.PUBLIC, "SourceCodeInfo");
        LLILLL = new AnonymousClass1315();
        LLILZ = new AbstractC19925812xk<AnonymousClass1315>() { // from class: X.1318
            @Override // X.InterfaceC19925712xj
            public final Object LIZIZ(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) throws C19926612xs {
                AnonymousClass1314 anonymousClass1314NewBuilder = AnonymousClass1315.newBuilder();
                try {
                    anonymousClass1314NewBuilder.LJJIIJ(abstractC19927312xz, c19926312xp);
                    return anonymousClass1314NewBuilder.buildPartial();
                } catch (C19918012wU e) {
                    TryCatchGuardChecker.doCheck(e);
                    C19926612xs c19926612xsAsInvalidProtocolBufferException = e.asInvalidProtocolBufferException();
                    c19926612xsAsInvalidProtocolBufferException.setUnfinishedMessage(anonymousClass1314NewBuilder.buildPartial());
                    throw c19926612xsAsInvalidProtocolBufferException;
                } catch (C19926612xs e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    e2.setUnfinishedMessage(anonymousClass1314NewBuilder.buildPartial());
                    throw e2;
                } catch (IOException e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    C19926612xs c19926612xs = new C19926612xs(e3);
                    c19926612xs.setUnfinishedMessage(anonymousClass1314NewBuilder.buildPartial());
                    throw c19926612xs;
                }
            }
        };
    }

    public static AnonymousClass1314 newBuilder() {
        return LLILLL.toBuilder();
    }

    @Override // com.google.protobuf.k0
    public final C19935812zM LJI() {
        C19935812zM c19935812zM = C131K.LJJLIIIIJ;
        c19935812zM.LIZ(AnonymousClass1315.class, AnonymousClass1314.class);
        return c19935812zM;
    }

    public int getLocationCount() {
        return this.location_.size();
    }

    @Override // com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19925612xi
    public int getSerializedSize() {
        int i = this.LL;
        if (i != -1) {
            return i;
        }
        int iLJII = 0;
        for (int i2 = 0; i2 < this.location_.size(); i2++) {
            iLJII += AbstractC19928912yF.LJII(1, (InterfaceC19925612xi) ListProtector.get(this.location_, i2));
        }
        int iLJIILLIIL = iLJII + LJIILLIIL() + getUnknownFields().getSerializedSize();
        this.LL = iLJIILLIIL;
        return iLJIILLIIL;
    }

    @Override // X.AbstractC19932312yn
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = 779 + getDescriptor().hashCode();
        if (getLocationCount() > 0) {
            iHashCode = (((iHashCode * 37) + 1) * 53) + getLocationList().hashCode();
        }
        int iLIZJ = (AbstractC19932312yn.LIZJ(iHashCode, LJIJ()) * 29) + getUnknownFields().hashCode();
        this.memoizedHashCode = iLIZJ;
        return iLIZJ;
    }

    @Override // X.AbstractC19933412yy, com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19916512wF
    public final boolean isInitialized() {
        byte b = this.LLILLJJLI;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (LJIILL()) {
            this.LLILLJJLI = (byte) 1;
            return true;
        }
        this.LLILLJJLI = (byte) 0;
        return false;
    }

    @Override // X.AbstractC19933412yy, com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19925612xi
    public AnonymousClass1314 toBuilder() {
        if (this == LLILLL) {
            return new AnonymousClass1314();
        }
        AnonymousClass1314 anonymousClass1314 = new AnonymousClass1314();
        anonymousClass1314.LJJIII(this);
        return anonymousClass1314;
    }

    public AnonymousClass1315() {
        this.LLILLJJLI = (byte) -1;
        this.location_ = Collections.emptyList();
    }

    public static AnonymousClass1315 getDefaultInstance() {
        return LLILLL;
    }

    public static final AnonymousClass1301 getDescriptor() {
        return C131K.LJJLI;
    }

    public static InterfaceC19925712xj<AnonymousClass1315> parser() {
        return LLILZ;
    }

    public List<AnonymousClass1316> getLocationList() {
        return this.location_;
    }

    public List<? extends C131B> getLocationOrBuilderList() {
        return this.location_;
    }

    @Override // com.google.protobuf.k0, X.InterfaceC19925612xi
    public InterfaceC19925712xj<AnonymousClass1315> getParserForType() {
        return LLILZ;
    }

    @Override // X.AbstractC19933412yy, com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19916512wF
    public AnonymousClass1315 getDefaultInstanceForType() {
        return LLILLL;
    }

    @Override // X.AbstractC19933412yy, com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19925612xi
    public AnonymousClass1314 newBuilderForType() {
        return newBuilder();
    }

    public AnonymousClass1315(AbstractC19933312yx abstractC19933312yx) {
        super(abstractC19933312yx);
        this.LLILLJJLI = (byte) -1;
    }

    public static AnonymousClass1314 newBuilder(AnonymousClass1315 anonymousClass1315) {
        AnonymousClass1314 builder = LLILLL.toBuilder();
        builder.LJJIII(anonymousClass1315);
        return builder;
    }

    public static AnonymousClass1315 parseDelimitedFrom(InputStream inputStream) {
        return (AnonymousClass1315) k0.LJIIIIZZ(LLILZ, inputStream);
    }

    public static AnonymousClass1315 parseFrom(AbstractC19922812xG abstractC19922812xG) {
        return (AnonymousClass1315) LLILZ.LJFF(abstractC19922812xG);
    }

    @Override // X.AbstractC19932312yn
    public final InterfaceC19931912yj LIZLLL(InterfaceC19935412zI interfaceC19935412zI) {
        return new AnonymousClass1314(interfaceC19935412zI);
    }

    @Override // X.AbstractC19932312yn
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AnonymousClass1315)) {
            return super.equals(obj);
        }
        AnonymousClass1315 anonymousClass1315 = (AnonymousClass1315) obj;
        if (getLocationList().equals(anonymousClass1315.getLocationList()) && getUnknownFields().equals(anonymousClass1315.getUnknownFields()) && LJIJ().equals(anonymousClass1315.LJIJ())) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC19933412yy
    public Object getExtension(AbstractC19933212yw abstractC19933212yw) {
        return getExtension((AbstractC19925412xg) abstractC19933212yw);
    }

    @Override // X.AbstractC19933412yy
    public int getExtensionCount(AbstractC19933212yw abstractC19933212yw) {
        return getExtensionCount((AbstractC19925412xg) abstractC19933212yw);
    }

    public AnonymousClass1316 getLocation(int i) {
        return (AnonymousClass1316) ListProtector.get(this.location_, i);
    }

    public C131B getLocationOrBuilder(int i) {
        return (C131B) ListProtector.get(this.location_, i);
    }

    @Override // X.AbstractC19933412yy
    public boolean hasExtension(AbstractC19933212yw abstractC19933212yw) {
        return hasExtension((AbstractC19925412xg) abstractC19933212yw);
    }

    @Override // com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19925612xi
    public void writeTo(AbstractC19928912yF abstractC19928912yF) {
        C131A c131aLJIJI = LJIJI();
        for (int i = 0; i < this.location_.size(); i++) {
            abstractC19928912yF.LJJIIJ(1, (InterfaceC19925612xi) ListProtector.get(this.location_, i));
        }
        c131aLJIJI.LIZ(536000001, abstractC19928912yF);
        getUnknownFields().writeTo(abstractC19928912yF);
    }

    public static AnonymousClass1315 parseFrom(AbstractC19927312xz abstractC19927312xz) {
        return (AnonymousClass1315) k0.LJIIJ(LLILZ, abstractC19927312xz);
    }

    @Override // X.AbstractC19933412yy
    public Object getExtension(C19933612z0 c19933612z0) {
        return getExtension((AbstractC19925412xg) c19933612z0);
    }

    @Override // X.AbstractC19933412yy
    public int getExtensionCount(C19933612z0 c19933612z0) {
        return getExtensionCount((AbstractC19925412xg) c19933612z0);
    }

    @Override // X.AbstractC19933412yy
    public boolean hasExtension(C19933612z0 c19933612z0) {
        return hasExtension((AbstractC19925412xg) c19933612z0);
    }

    public static AnonymousClass1315 parseFrom(InputStream inputStream) {
        return (AnonymousClass1315) k0.LJIIL(LLILZ, inputStream);
    }

    public static AnonymousClass1315 parseFrom(ByteBuffer byteBuffer) {
        return (AnonymousClass1315) LLILZ.LJIIIZ(byteBuffer);
    }

    public static AnonymousClass1315 parseFrom(byte[] bArr) {
        return (AnonymousClass1315) LLILZ.LJIIJJI(bArr);
    }

    public static AnonymousClass1315 parseDelimitedFrom(InputStream inputStream, C19926312xp c19926312xp) {
        return (AnonymousClass1315) k0.LJIIIZ(LLILZ, inputStream, c19926312xp);
    }

    public static AnonymousClass1315 parseFrom(byte[] bArr, C19926312xp c19926312xp) {
        AnonymousClass1318 anonymousClass1318 = LLILZ;
        anonymousClass1318.getClass();
        InterfaceC19925612xi interfaceC19925612xiLJIILJJIL = anonymousClass1318.LJIILJJIL(bArr, bArr.length, c19926312xp);
        AbstractC19925812xk.LIZJ(interfaceC19925612xiLJIILJJIL);
        return (AnonymousClass1315) interfaceC19925612xiLJIILJJIL;
    }

    @Override // X.AbstractC19933412yy
    public Object getExtension(AbstractC19933212yw abstractC19933212yw, int i) {
        return getExtension((AbstractC19925412xg) abstractC19933212yw, i);
    }

    public static AnonymousClass1315 parseFrom(AbstractC19922812xG abstractC19922812xG, C19926312xp c19926312xp) {
        return LLILZ.LIZ(abstractC19922812xG, c19926312xp);
    }

    @Override // X.AbstractC19933412yy
    public Object getExtension(C19933612z0 c19933612z0, int i) {
        return getExtension((AbstractC19925412xg) c19933612z0, i);
    }

    public static AnonymousClass1315 parseFrom(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) {
        return (AnonymousClass1315) k0.LJIIJJI(LLILZ, abstractC19927312xz, c19926312xp);
    }

    public static AnonymousClass1315 parseFrom(InputStream inputStream, C19926312xp c19926312xp) {
        return (AnonymousClass1315) k0.LJIILIIL(LLILZ, inputStream, c19926312xp);
    }

    public static AnonymousClass1315 parseFrom(ByteBuffer byteBuffer, C19926312xp c19926312xp) {
        return LLILZ.LJIIJ(byteBuffer, c19926312xp);
    }
}
