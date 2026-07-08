package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.protobuf.k0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.132E, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C132E extends AbstractC19933412yy<C132E> implements C131N {
    public static final C132E LLILZ;
    public static final C199468132s LLILZIL;
    public static final long serialVersionUID = 0;
    public int LLILLJJLI;
    public byte LLILLL;
    public boolean ccEnableArenas_;
    public boolean ccGenericServices_;
    public volatile Object csharpNamespace_;
    public boolean deprecated_;
    public C199437131n features_;
    public volatile Object goPackage_;
    public boolean javaGenerateEqualsAndHash_;
    public boolean javaGenericServices_;
    public boolean javaMultipleFiles_;
    public volatile Object javaOuterClassname_;
    public volatile Object javaPackage_;
    public boolean javaStringCheckUtf8_;
    public volatile Object objcClassPrefix_;
    public int optimizeFor_;
    public volatile Object phpClassPrefix_;
    public volatile Object phpMetadataNamespace_;
    public volatile Object phpNamespace_;
    public boolean pyGenericServices_;
    public volatile Object rubyPackage_;
    public volatile Object swiftPrefix_;
    public List<C132O> uninterpretedOption_;

    /* JADX WARN: Type inference failed for: r0v2, types: [X.132s] */
    static {
        C19373810qu.LIZ(EnumC19373110qn.PUBLIC, "FileOptions");
        LLILZ = new C132E();
        LLILZIL = new AbstractC19925812xk<C132E>() { // from class: X.132s
            @Override // X.InterfaceC19925712xj
            public final Object LIZIZ(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) throws C19926612xs {
                C132F c132fNewBuilder = C132E.newBuilder();
                try {
                    c132fNewBuilder.LJJIIZ(abstractC19927312xz, c19926312xp);
                    return c132fNewBuilder.buildPartial();
                } catch (C19918012wU e) {
                    TryCatchGuardChecker.doCheck(e);
                    C19926612xs c19926612xsAsInvalidProtocolBufferException = e.asInvalidProtocolBufferException();
                    c19926612xsAsInvalidProtocolBufferException.setUnfinishedMessage(c132fNewBuilder.buildPartial());
                    throw c19926612xsAsInvalidProtocolBufferException;
                } catch (C19926612xs e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    e2.setUnfinishedMessage(c132fNewBuilder.buildPartial());
                    throw e2;
                } catch (IOException e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    C19926612xs c19926612xs = new C19926612xs(e3);
                    c19926612xs.setUnfinishedMessage(c132fNewBuilder.buildPartial());
                    throw c19926612xs;
                }
            }
        };
    }

    public static C132F newBuilder() {
        return LLILZ.toBuilder();
    }

    @Override // com.google.protobuf.k0
    public final C19935812zM LJI() {
        C19935812zM c19935812zM = C131K.LJJIII;
        c19935812zM.LIZ(C132E.class, C132F.class);
        return c19935812zM;
    }

    public String getCsharpNamespace() {
        Object obj = this.csharpNamespace_;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC19922812xG abstractC19922812xG = (AbstractC19922812xG) obj;
        String stringUtf8 = abstractC19922812xG.toStringUtf8();
        if (abstractC19922812xG.isValidUtf8()) {
            this.csharpNamespace_ = stringUtf8;
        }
        return stringUtf8;
    }

    public AbstractC19922812xG getCsharpNamespaceBytes() {
        Object obj = this.csharpNamespace_;
        if (!(obj instanceof String)) {
            return (AbstractC19922812xG) obj;
        }
        AbstractC19922812xG abstractC19922812xGCopyFromUtf8 = AbstractC19922812xG.copyFromUtf8((String) obj);
        this.csharpNamespace_ = abstractC19922812xGCopyFromUtf8;
        return abstractC19922812xGCopyFromUtf8;
    }

    public C199437131n getFeatures() {
        C199437131n c199437131n = this.features_;
        return c199437131n == null ? C199437131n.getDefaultInstance() : c199437131n;
    }

    public AnonymousClass1326 getFeaturesOrBuilder() {
        C199437131n c199437131n = this.features_;
        return c199437131n == null ? C199437131n.getDefaultInstance() : c199437131n;
    }

    public String getGoPackage() {
        Object obj = this.goPackage_;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC19922812xG abstractC19922812xG = (AbstractC19922812xG) obj;
        String stringUtf8 = abstractC19922812xG.toStringUtf8();
        if (abstractC19922812xG.isValidUtf8()) {
            this.goPackage_ = stringUtf8;
        }
        return stringUtf8;
    }

    public AbstractC19922812xG getGoPackageBytes() {
        Object obj = this.goPackage_;
        if (!(obj instanceof String)) {
            return (AbstractC19922812xG) obj;
        }
        AbstractC19922812xG abstractC19922812xGCopyFromUtf8 = AbstractC19922812xG.copyFromUtf8((String) obj);
        this.goPackage_ = abstractC19922812xGCopyFromUtf8;
        return abstractC19922812xGCopyFromUtf8;
    }

    public String getJavaOuterClassname() {
        Object obj = this.javaOuterClassname_;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC19922812xG abstractC19922812xG = (AbstractC19922812xG) obj;
        String stringUtf8 = abstractC19922812xG.toStringUtf8();
        if (abstractC19922812xG.isValidUtf8()) {
            this.javaOuterClassname_ = stringUtf8;
        }
        return stringUtf8;
    }

    public AbstractC19922812xG getJavaOuterClassnameBytes() {
        Object obj = this.javaOuterClassname_;
        if (!(obj instanceof String)) {
            return (AbstractC19922812xG) obj;
        }
        AbstractC19922812xG abstractC19922812xGCopyFromUtf8 = AbstractC19922812xG.copyFromUtf8((String) obj);
        this.javaOuterClassname_ = abstractC19922812xGCopyFromUtf8;
        return abstractC19922812xGCopyFromUtf8;
    }

    public String getJavaPackage() {
        Object obj = this.javaPackage_;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC19922812xG abstractC19922812xG = (AbstractC19922812xG) obj;
        String stringUtf8 = abstractC19922812xG.toStringUtf8();
        if (abstractC19922812xG.isValidUtf8()) {
            this.javaPackage_ = stringUtf8;
        }
        return stringUtf8;
    }

    public AbstractC19922812xG getJavaPackageBytes() {
        Object obj = this.javaPackage_;
        if (!(obj instanceof String)) {
            return (AbstractC19922812xG) obj;
        }
        AbstractC19922812xG abstractC19922812xGCopyFromUtf8 = AbstractC19922812xG.copyFromUtf8((String) obj);
        this.javaPackage_ = abstractC19922812xGCopyFromUtf8;
        return abstractC19922812xGCopyFromUtf8;
    }

    public String getObjcClassPrefix() {
        Object obj = this.objcClassPrefix_;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC19922812xG abstractC19922812xG = (AbstractC19922812xG) obj;
        String stringUtf8 = abstractC19922812xG.toStringUtf8();
        if (abstractC19922812xG.isValidUtf8()) {
            this.objcClassPrefix_ = stringUtf8;
        }
        return stringUtf8;
    }

    public AbstractC19922812xG getObjcClassPrefixBytes() {
        Object obj = this.objcClassPrefix_;
        if (!(obj instanceof String)) {
            return (AbstractC19922812xG) obj;
        }
        AbstractC19922812xG abstractC19922812xGCopyFromUtf8 = AbstractC19922812xG.copyFromUtf8((String) obj);
        this.objcClassPrefix_ = abstractC19922812xGCopyFromUtf8;
        return abstractC19922812xGCopyFromUtf8;
    }

    public AnonymousClass1321 getOptimizeFor() {
        AnonymousClass1321 anonymousClass1321ForNumber = AnonymousClass1321.forNumber(this.optimizeFor_);
        return anonymousClass1321ForNumber == null ? AnonymousClass1321.SPEED : anonymousClass1321ForNumber;
    }

    public String getPhpClassPrefix() {
        Object obj = this.phpClassPrefix_;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC19922812xG abstractC19922812xG = (AbstractC19922812xG) obj;
        String stringUtf8 = abstractC19922812xG.toStringUtf8();
        if (abstractC19922812xG.isValidUtf8()) {
            this.phpClassPrefix_ = stringUtf8;
        }
        return stringUtf8;
    }

    public AbstractC19922812xG getPhpClassPrefixBytes() {
        Object obj = this.phpClassPrefix_;
        if (!(obj instanceof String)) {
            return (AbstractC19922812xG) obj;
        }
        AbstractC19922812xG abstractC19922812xGCopyFromUtf8 = AbstractC19922812xG.copyFromUtf8((String) obj);
        this.phpClassPrefix_ = abstractC19922812xGCopyFromUtf8;
        return abstractC19922812xGCopyFromUtf8;
    }

    public String getPhpMetadataNamespace() {
        Object obj = this.phpMetadataNamespace_;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC19922812xG abstractC19922812xG = (AbstractC19922812xG) obj;
        String stringUtf8 = abstractC19922812xG.toStringUtf8();
        if (abstractC19922812xG.isValidUtf8()) {
            this.phpMetadataNamespace_ = stringUtf8;
        }
        return stringUtf8;
    }

    public AbstractC19922812xG getPhpMetadataNamespaceBytes() {
        Object obj = this.phpMetadataNamespace_;
        if (!(obj instanceof String)) {
            return (AbstractC19922812xG) obj;
        }
        AbstractC19922812xG abstractC19922812xGCopyFromUtf8 = AbstractC19922812xG.copyFromUtf8((String) obj);
        this.phpMetadataNamespace_ = abstractC19922812xGCopyFromUtf8;
        return abstractC19922812xGCopyFromUtf8;
    }

    public String getPhpNamespace() {
        Object obj = this.phpNamespace_;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC19922812xG abstractC19922812xG = (AbstractC19922812xG) obj;
        String stringUtf8 = abstractC19922812xG.toStringUtf8();
        if (abstractC19922812xG.isValidUtf8()) {
            this.phpNamespace_ = stringUtf8;
        }
        return stringUtf8;
    }

    public AbstractC19922812xG getPhpNamespaceBytes() {
        Object obj = this.phpNamespace_;
        if (!(obj instanceof String)) {
            return (AbstractC19922812xG) obj;
        }
        AbstractC19922812xG abstractC19922812xGCopyFromUtf8 = AbstractC19922812xG.copyFromUtf8((String) obj);
        this.phpNamespace_ = abstractC19922812xGCopyFromUtf8;
        return abstractC19922812xGCopyFromUtf8;
    }

    public String getRubyPackage() {
        Object obj = this.rubyPackage_;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC19922812xG abstractC19922812xG = (AbstractC19922812xG) obj;
        String stringUtf8 = abstractC19922812xG.toStringUtf8();
        if (abstractC19922812xG.isValidUtf8()) {
            this.rubyPackage_ = stringUtf8;
        }
        return stringUtf8;
    }

    public AbstractC19922812xG getRubyPackageBytes() {
        Object obj = this.rubyPackage_;
        if (!(obj instanceof String)) {
            return (AbstractC19922812xG) obj;
        }
        AbstractC19922812xG abstractC19922812xGCopyFromUtf8 = AbstractC19922812xG.copyFromUtf8((String) obj);
        this.rubyPackage_ = abstractC19922812xGCopyFromUtf8;
        return abstractC19922812xGCopyFromUtf8;
    }

    @Override // com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19925612xi
    public int getSerializedSize() {
        int i = this.LL;
        if (i != -1) {
            return i;
        }
        int iLJ = (this.LLILLJJLI & 1) != 0 ? k0.LJ(1, this.javaPackage_) : 0;
        if ((this.LLILLJJLI & 2) != 0) {
            iLJ += k0.LJ(8, this.javaOuterClassname_);
        }
        if ((this.LLILLJJLI & 32) != 0) {
            iLJ += AbstractC19928912yF.LJ(9, this.optimizeFor_);
        }
        if ((this.LLILLJJLI & 4) != 0) {
            iLJ += AbstractC19928912yF.LIZIZ(10);
        }
        if ((this.LLILLJJLI & 64) != 0) {
            iLJ += k0.LJ(11, this.goPackage_);
        }
        if ((this.LLILLJJLI & 128) != 0) {
            iLJ += AbstractC19928912yF.LIZIZ(16);
        }
        if ((this.LLILLJJLI & 256) != 0) {
            iLJ += AbstractC19928912yF.LIZIZ(17);
        }
        if ((this.LLILLJJLI & 512) != 0) {
            iLJ += AbstractC19928912yF.LIZIZ(18);
        }
        if ((this.LLILLJJLI & 8) != 0) {
            iLJ += AbstractC19928912yF.LIZIZ(20);
        }
        if ((this.LLILLJJLI & 1024) != 0) {
            iLJ += AbstractC19928912yF.LIZIZ(23);
        }
        if ((this.LLILLJJLI & 16) != 0) {
            iLJ += AbstractC19928912yF.LIZIZ(27);
        }
        if ((this.LLILLJJLI & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            iLJ += AbstractC19928912yF.LIZIZ(31);
        }
        if ((this.LLILLJJLI & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            iLJ += k0.LJ(36, this.objcClassPrefix_);
        }
        if ((this.LLILLJJLI & 8192) != 0) {
            iLJ += k0.LJ(37, this.csharpNamespace_);
        }
        if ((this.LLILLJJLI & 16384) != 0) {
            iLJ += k0.LJ(39, this.swiftPrefix_);
        }
        if ((this.LLILLJJLI & 32768) != 0) {
            iLJ += k0.LJ(40, this.phpClassPrefix_);
        }
        if ((this.LLILLJJLI & 65536) != 0) {
            iLJ += k0.LJ(41, this.phpNamespace_);
        }
        if ((this.LLILLJJLI & 131072) != 0) {
            iLJ += k0.LJ(44, this.phpMetadataNamespace_);
        }
        if ((this.LLILLJJLI & 262144) != 0) {
            iLJ += k0.LJ(45, this.rubyPackage_);
        }
        if ((this.LLILLJJLI & 524288) != 0) {
            iLJ += AbstractC19928912yF.LJII(50, getFeatures());
        }
        for (int i2 = 0; i2 < this.uninterpretedOption_.size(); i2++) {
            iLJ += AbstractC19928912yF.LJII(999, (InterfaceC19925612xi) ListProtector.get(this.uninterpretedOption_, i2));
        }
        int iLJIILLIIL = iLJ + LJIILLIIL() + getUnknownFields().getSerializedSize();
        this.LL = iLJIILLIIL;
        return iLJIILLIIL;
    }

    public String getSwiftPrefix() {
        Object obj = this.swiftPrefix_;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC19922812xG abstractC19922812xG = (AbstractC19922812xG) obj;
        String stringUtf8 = abstractC19922812xG.toStringUtf8();
        if (abstractC19922812xG.isValidUtf8()) {
            this.swiftPrefix_ = stringUtf8;
        }
        return stringUtf8;
    }

    public AbstractC19922812xG getSwiftPrefixBytes() {
        Object obj = this.swiftPrefix_;
        if (!(obj instanceof String)) {
            return (AbstractC19922812xG) obj;
        }
        AbstractC19922812xG abstractC19922812xGCopyFromUtf8 = AbstractC19922812xG.copyFromUtf8((String) obj);
        this.swiftPrefix_ = abstractC19922812xGCopyFromUtf8;
        return abstractC19922812xGCopyFromUtf8;
    }

    public int getUninterpretedOptionCount() {
        return this.uninterpretedOption_.size();
    }

    public boolean hasCcEnableArenas() {
        return (this.LLILLJJLI & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0;
    }

    public boolean hasCcGenericServices() {
        return (this.LLILLJJLI & 128) != 0;
    }

    public boolean hasCsharpNamespace() {
        return (this.LLILLJJLI & 8192) != 0;
    }

    public boolean hasDeprecated() {
        return (this.LLILLJJLI & 1024) != 0;
    }

    public boolean hasFeatures() {
        return (this.LLILLJJLI & 524288) != 0;
    }

    public boolean hasGoPackage() {
        return (this.LLILLJJLI & 64) != 0;
    }

    public boolean hasJavaGenerateEqualsAndHash() {
        return (this.LLILLJJLI & 8) != 0;
    }

    public boolean hasJavaGenericServices() {
        return (this.LLILLJJLI & 256) != 0;
    }

    public boolean hasJavaMultipleFiles() {
        return (this.LLILLJJLI & 4) != 0;
    }

    public boolean hasJavaOuterClassname() {
        return (this.LLILLJJLI & 2) != 0;
    }

    public boolean hasJavaPackage() {
        return (this.LLILLJJLI & 1) != 0;
    }

    public boolean hasJavaStringCheckUtf8() {
        return (this.LLILLJJLI & 16) != 0;
    }

    public boolean hasObjcClassPrefix() {
        return (this.LLILLJJLI & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0;
    }

    public boolean hasOptimizeFor() {
        return (this.LLILLJJLI & 32) != 0;
    }

    public boolean hasPhpClassPrefix() {
        return (this.LLILLJJLI & 32768) != 0;
    }

    public boolean hasPhpMetadataNamespace() {
        return (this.LLILLJJLI & 131072) != 0;
    }

    public boolean hasPhpNamespace() {
        return (this.LLILLJJLI & 65536) != 0;
    }

    public boolean hasPyGenericServices() {
        return (this.LLILLJJLI & 512) != 0;
    }

    public boolean hasRubyPackage() {
        return (this.LLILLJJLI & 262144) != 0;
    }

    public boolean hasSwiftPrefix() {
        return (this.LLILLJJLI & 16384) != 0;
    }

    @Override // X.AbstractC19932312yn
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = 779 + getDescriptor().hashCode();
        if (hasJavaPackage()) {
            iHashCode = (((iHashCode * 37) + 1) * 53) + getJavaPackage().hashCode();
        }
        if (hasJavaOuterClassname()) {
            iHashCode = (((iHashCode * 37) + 8) * 53) + getJavaOuterClassname().hashCode();
        }
        if (hasJavaMultipleFiles()) {
            iHashCode = (((iHashCode * 37) + 10) * 53) + C19922012x8.LIZIZ(getJavaMultipleFiles());
        }
        if (hasJavaGenerateEqualsAndHash()) {
            iHashCode = (((iHashCode * 37) + 20) * 53) + C19922012x8.LIZIZ(getJavaGenerateEqualsAndHash());
        }
        if (hasJavaStringCheckUtf8()) {
            iHashCode = (((iHashCode * 37) + 27) * 53) + C19922012x8.LIZIZ(getJavaStringCheckUtf8());
        }
        if (hasOptimizeFor()) {
            iHashCode = (((iHashCode * 37) + 9) * 53) + this.optimizeFor_;
        }
        if (hasGoPackage()) {
            iHashCode = (((iHashCode * 37) + 11) * 53) + getGoPackage().hashCode();
        }
        if (hasCcGenericServices()) {
            iHashCode = (((iHashCode * 37) + 16) * 53) + C19922012x8.LIZIZ(getCcGenericServices());
        }
        if (hasJavaGenericServices()) {
            iHashCode = (((iHashCode * 37) + 17) * 53) + C19922012x8.LIZIZ(getJavaGenericServices());
        }
        if (hasPyGenericServices()) {
            iHashCode = (((iHashCode * 37) + 18) * 53) + C19922012x8.LIZIZ(getPyGenericServices());
        }
        if (hasDeprecated()) {
            iHashCode = (((iHashCode * 37) + 23) * 53) + C19922012x8.LIZIZ(getDeprecated());
        }
        if (hasCcEnableArenas()) {
            iHashCode = (((iHashCode * 37) + 31) * 53) + C19922012x8.LIZIZ(getCcEnableArenas());
        }
        if (hasObjcClassPrefix()) {
            iHashCode = (((iHashCode * 37) + 36) * 53) + getObjcClassPrefix().hashCode();
        }
        if (hasCsharpNamespace()) {
            iHashCode = (((iHashCode * 37) + 37) * 53) + getCsharpNamespace().hashCode();
        }
        if (hasSwiftPrefix()) {
            iHashCode = (((iHashCode * 37) + 39) * 53) + getSwiftPrefix().hashCode();
        }
        if (hasPhpClassPrefix()) {
            iHashCode = (((iHashCode * 37) + 40) * 53) + getPhpClassPrefix().hashCode();
        }
        if (hasPhpNamespace()) {
            iHashCode = (((iHashCode * 37) + 41) * 53) + getPhpNamespace().hashCode();
        }
        if (hasPhpMetadataNamespace()) {
            iHashCode = (((iHashCode * 37) + 44) * 53) + getPhpMetadataNamespace().hashCode();
        }
        if (hasRubyPackage()) {
            iHashCode = (((iHashCode * 37) + 45) * 53) + getRubyPackage().hashCode();
        }
        if (hasFeatures()) {
            iHashCode = (((iHashCode * 37) + 50) * 53) + getFeatures().hashCode();
        }
        if (getUninterpretedOptionCount() > 0) {
            iHashCode = (((iHashCode * 37) + 999) * 53) + getUninterpretedOptionList().hashCode();
        }
        int iLIZJ = (AbstractC19932312yn.LIZJ(iHashCode, LJIJ()) * 29) + getUnknownFields().hashCode();
        this.memoizedHashCode = iLIZJ;
        return iLIZJ;
    }

    @Override // X.AbstractC19933412yy, com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19916512wF
    public final boolean isInitialized() {
        byte b = this.LLILLL;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (hasFeatures() && !getFeatures().isInitialized()) {
            this.LLILLL = (byte) 0;
            return false;
        }
        for (int i = 0; i < getUninterpretedOptionCount(); i++) {
            if (!getUninterpretedOption(i).isInitialized()) {
                this.LLILLL = (byte) 0;
                return false;
            }
        }
        if (LJIILL()) {
            this.LLILLL = (byte) 1;
            return true;
        }
        this.LLILLL = (byte) 0;
        return false;
    }

    @Override // X.AbstractC19933412yy, com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19925612xi
    public C132F toBuilder() {
        if (this == LLILZ) {
            return new C132F();
        }
        C132F c132f = new C132F();
        c132f.LJJIIJZLJL(this);
        return c132f;
    }

    public C132E() {
        this.javaPackage_ = "";
        this.javaOuterClassname_ = "";
        this.optimizeFor_ = 1;
        this.goPackage_ = "";
        this.ccEnableArenas_ = true;
        this.objcClassPrefix_ = "";
        this.csharpNamespace_ = "";
        this.swiftPrefix_ = "";
        this.phpClassPrefix_ = "";
        this.phpNamespace_ = "";
        this.phpMetadataNamespace_ = "";
        this.rubyPackage_ = "";
        this.LLILLL = (byte) -1;
        this.javaPackage_ = "";
        this.javaOuterClassname_ = "";
        this.optimizeFor_ = 1;
        this.goPackage_ = "";
        this.ccEnableArenas_ = true;
        this.objcClassPrefix_ = "";
        this.csharpNamespace_ = "";
        this.swiftPrefix_ = "";
        this.phpClassPrefix_ = "";
        this.phpNamespace_ = "";
        this.phpMetadataNamespace_ = "";
        this.rubyPackage_ = "";
        this.uninterpretedOption_ = Collections.emptyList();
    }

    public static C132E getDefaultInstance() {
        return LLILZ;
    }

    public static final AnonymousClass1301 getDescriptor() {
        return C131K.LJJII;
    }

    public static InterfaceC19925712xj<C132E> parser() {
        return LLILZIL;
    }

    public boolean getCcEnableArenas() {
        return this.ccEnableArenas_;
    }

    public boolean getCcGenericServices() {
        return this.ccGenericServices_;
    }

    public boolean getDeprecated() {
        return this.deprecated_;
    }

    public boolean getJavaGenerateEqualsAndHash() {
        return this.javaGenerateEqualsAndHash_;
    }

    public boolean getJavaGenericServices() {
        return this.javaGenericServices_;
    }

    public boolean getJavaMultipleFiles() {
        return this.javaMultipleFiles_;
    }

    public boolean getJavaStringCheckUtf8() {
        return this.javaStringCheckUtf8_;
    }

    @Override // com.google.protobuf.k0, X.InterfaceC19925612xi
    public InterfaceC19925712xj<C132E> getParserForType() {
        return LLILZIL;
    }

    public boolean getPyGenericServices() {
        return this.pyGenericServices_;
    }

    public List<C132O> getUninterpretedOptionList() {
        return this.uninterpretedOption_;
    }

    public List<? extends AnonymousClass1331> getUninterpretedOptionOrBuilderList() {
        return this.uninterpretedOption_;
    }

    @Override // X.AbstractC19933412yy, com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19916512wF
    public C132E getDefaultInstanceForType() {
        return LLILZ;
    }

    @Override // X.AbstractC19933412yy, com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19925612xi
    public C132F newBuilderForType() {
        return newBuilder();
    }

    public C132E(AbstractC19933312yx abstractC19933312yx) {
        super(abstractC19933312yx);
        this.javaPackage_ = "";
        this.javaOuterClassname_ = "";
        this.optimizeFor_ = 1;
        this.goPackage_ = "";
        this.ccEnableArenas_ = true;
        this.objcClassPrefix_ = "";
        this.csharpNamespace_ = "";
        this.swiftPrefix_ = "";
        this.phpClassPrefix_ = "";
        this.phpNamespace_ = "";
        this.phpMetadataNamespace_ = "";
        this.rubyPackage_ = "";
        this.LLILLL = (byte) -1;
    }

    public static C132F newBuilder(C132E c132e) {
        C132F builder = LLILZ.toBuilder();
        builder.LJJIIJZLJL(c132e);
        return builder;
    }

    public static C132E parseDelimitedFrom(InputStream inputStream) {
        return (C132E) k0.LJIIIIZZ(LLILZIL, inputStream);
    }

    public static C132E parseFrom(AbstractC19922812xG abstractC19922812xG) {
        return (C132E) LLILZIL.LJFF(abstractC19922812xG);
    }

    @Override // X.AbstractC19932312yn
    public final InterfaceC19931912yj LIZLLL(InterfaceC19935412zI interfaceC19935412zI) {
        return new C132F(interfaceC19935412zI);
    }

    @Override // X.AbstractC19932312yn
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C132E)) {
            return super.equals(obj);
        }
        C132E c132e = (C132E) obj;
        if (hasJavaPackage() != c132e.hasJavaPackage()) {
            return false;
        }
        if ((hasJavaPackage() && !getJavaPackage().equals(c132e.getJavaPackage())) || hasJavaOuterClassname() != c132e.hasJavaOuterClassname()) {
            return false;
        }
        if ((hasJavaOuterClassname() && !getJavaOuterClassname().equals(c132e.getJavaOuterClassname())) || hasJavaMultipleFiles() != c132e.hasJavaMultipleFiles()) {
            return false;
        }
        if ((hasJavaMultipleFiles() && getJavaMultipleFiles() != c132e.getJavaMultipleFiles()) || hasJavaGenerateEqualsAndHash() != c132e.hasJavaGenerateEqualsAndHash()) {
            return false;
        }
        if ((hasJavaGenerateEqualsAndHash() && getJavaGenerateEqualsAndHash() != c132e.getJavaGenerateEqualsAndHash()) || hasJavaStringCheckUtf8() != c132e.hasJavaStringCheckUtf8()) {
            return false;
        }
        if ((hasJavaStringCheckUtf8() && getJavaStringCheckUtf8() != c132e.getJavaStringCheckUtf8()) || hasOptimizeFor() != c132e.hasOptimizeFor()) {
            return false;
        }
        if ((hasOptimizeFor() && this.optimizeFor_ != c132e.optimizeFor_) || hasGoPackage() != c132e.hasGoPackage()) {
            return false;
        }
        if ((hasGoPackage() && !getGoPackage().equals(c132e.getGoPackage())) || hasCcGenericServices() != c132e.hasCcGenericServices()) {
            return false;
        }
        if ((hasCcGenericServices() && getCcGenericServices() != c132e.getCcGenericServices()) || hasJavaGenericServices() != c132e.hasJavaGenericServices()) {
            return false;
        }
        if ((hasJavaGenericServices() && getJavaGenericServices() != c132e.getJavaGenericServices()) || hasPyGenericServices() != c132e.hasPyGenericServices()) {
            return false;
        }
        if ((hasPyGenericServices() && getPyGenericServices() != c132e.getPyGenericServices()) || hasDeprecated() != c132e.hasDeprecated()) {
            return false;
        }
        if ((hasDeprecated() && getDeprecated() != c132e.getDeprecated()) || hasCcEnableArenas() != c132e.hasCcEnableArenas()) {
            return false;
        }
        if ((hasCcEnableArenas() && getCcEnableArenas() != c132e.getCcEnableArenas()) || hasObjcClassPrefix() != c132e.hasObjcClassPrefix()) {
            return false;
        }
        if ((hasObjcClassPrefix() && !getObjcClassPrefix().equals(c132e.getObjcClassPrefix())) || hasCsharpNamespace() != c132e.hasCsharpNamespace()) {
            return false;
        }
        if ((hasCsharpNamespace() && !getCsharpNamespace().equals(c132e.getCsharpNamespace())) || hasSwiftPrefix() != c132e.hasSwiftPrefix()) {
            return false;
        }
        if ((hasSwiftPrefix() && !getSwiftPrefix().equals(c132e.getSwiftPrefix())) || hasPhpClassPrefix() != c132e.hasPhpClassPrefix()) {
            return false;
        }
        if ((hasPhpClassPrefix() && !getPhpClassPrefix().equals(c132e.getPhpClassPrefix())) || hasPhpNamespace() != c132e.hasPhpNamespace()) {
            return false;
        }
        if ((hasPhpNamespace() && !getPhpNamespace().equals(c132e.getPhpNamespace())) || hasPhpMetadataNamespace() != c132e.hasPhpMetadataNamespace()) {
            return false;
        }
        if ((hasPhpMetadataNamespace() && !getPhpMetadataNamespace().equals(c132e.getPhpMetadataNamespace())) || hasRubyPackage() != c132e.hasRubyPackage()) {
            return false;
        }
        if ((hasRubyPackage() && !getRubyPackage().equals(c132e.getRubyPackage())) || hasFeatures() != c132e.hasFeatures()) {
            return false;
        }
        if ((!hasFeatures() || getFeatures().equals(c132e.getFeatures())) && getUninterpretedOptionList().equals(c132e.getUninterpretedOptionList()) && getUnknownFields().equals(c132e.getUnknownFields()) && LJIJ().equals(c132e.LJIJ())) {
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

    public C132O getUninterpretedOption(int i) {
        return (C132O) ListProtector.get(this.uninterpretedOption_, i);
    }

    public AnonymousClass1331 getUninterpretedOptionOrBuilder(int i) {
        return (AnonymousClass1331) ListProtector.get(this.uninterpretedOption_, i);
    }

    @Override // X.AbstractC19933412yy
    public boolean hasExtension(AbstractC19933212yw abstractC19933212yw) {
        return hasExtension((AbstractC19925412xg) abstractC19933212yw);
    }

    @Override // com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19925612xi
    public void writeTo(AbstractC19928912yF abstractC19928912yF) {
        C131A c131aLJIJI = LJIJI();
        if ((this.LLILLJJLI & 1) != 0) {
            k0.LJIILJJIL(abstractC19928912yF, 1, this.javaPackage_);
        }
        if ((this.LLILLJJLI & 2) != 0) {
            k0.LJIILJJIL(abstractC19928912yF, 8, this.javaOuterClassname_);
        }
        if ((this.LLILLJJLI & 32) != 0) {
            abstractC19928912yF.LJJII(9, this.optimizeFor_);
        }
        if ((this.LLILLJJLI & 4) != 0) {
            abstractC19928912yF.LJIIZILJ(10, this.javaMultipleFiles_);
        }
        if ((this.LLILLJJLI & 64) != 0) {
            k0.LJIILJJIL(abstractC19928912yF, 11, this.goPackage_);
        }
        if ((this.LLILLJJLI & 128) != 0) {
            abstractC19928912yF.LJIIZILJ(16, this.ccGenericServices_);
        }
        if ((this.LLILLJJLI & 256) != 0) {
            abstractC19928912yF.LJIIZILJ(17, this.javaGenericServices_);
        }
        if ((this.LLILLJJLI & 512) != 0) {
            abstractC19928912yF.LJIIZILJ(18, this.pyGenericServices_);
        }
        if ((this.LLILLJJLI & 8) != 0) {
            abstractC19928912yF.LJIIZILJ(20, this.javaGenerateEqualsAndHash_);
        }
        if ((this.LLILLJJLI & 1024) != 0) {
            abstractC19928912yF.LJIIZILJ(23, this.deprecated_);
        }
        if ((this.LLILLJJLI & 16) != 0) {
            abstractC19928912yF.LJIIZILJ(27, this.javaStringCheckUtf8_);
        }
        if ((this.LLILLJJLI & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            abstractC19928912yF.LJIIZILJ(31, this.ccEnableArenas_);
        }
        if ((this.LLILLJJLI & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            k0.LJIILJJIL(abstractC19928912yF, 36, this.objcClassPrefix_);
        }
        if ((this.LLILLJJLI & 8192) != 0) {
            k0.LJIILJJIL(abstractC19928912yF, 37, this.csharpNamespace_);
        }
        if ((this.LLILLJJLI & 16384) != 0) {
            k0.LJIILJJIL(abstractC19928912yF, 39, this.swiftPrefix_);
        }
        if ((this.LLILLJJLI & 32768) != 0) {
            k0.LJIILJJIL(abstractC19928912yF, 40, this.phpClassPrefix_);
        }
        if ((this.LLILLJJLI & 65536) != 0) {
            k0.LJIILJJIL(abstractC19928912yF, 41, this.phpNamespace_);
        }
        if ((this.LLILLJJLI & 131072) != 0) {
            k0.LJIILJJIL(abstractC19928912yF, 44, this.phpMetadataNamespace_);
        }
        if ((this.LLILLJJLI & 262144) != 0) {
            k0.LJIILJJIL(abstractC19928912yF, 45, this.rubyPackage_);
        }
        if ((this.LLILLJJLI & 524288) != 0) {
            abstractC19928912yF.LJJIIJ(50, getFeatures());
        }
        for (int i = 0; i < this.uninterpretedOption_.size(); i++) {
            abstractC19928912yF.LJJIIJ(999, (InterfaceC19925612xi) ListProtector.get(this.uninterpretedOption_, i));
        }
        c131aLJIJI.LIZ(536870912, abstractC19928912yF);
        getUnknownFields().writeTo(abstractC19928912yF);
    }

    public static C132E parseFrom(AbstractC19927312xz abstractC19927312xz) {
        return (C132E) k0.LJIIJ(LLILZIL, abstractC19927312xz);
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

    public static C132E parseFrom(InputStream inputStream) {
        return (C132E) k0.LJIIL(LLILZIL, inputStream);
    }

    public static C132E parseFrom(ByteBuffer byteBuffer) {
        return (C132E) LLILZIL.LJIIIZ(byteBuffer);
    }

    public static C132E parseFrom(byte[] bArr) {
        return (C132E) LLILZIL.LJIIJJI(bArr);
    }

    public static C132E parseDelimitedFrom(InputStream inputStream, C19926312xp c19926312xp) {
        return (C132E) k0.LJIIIZ(LLILZIL, inputStream, c19926312xp);
    }

    public static C132E parseFrom(byte[] bArr, C19926312xp c19926312xp) {
        C199468132s c199468132s = LLILZIL;
        c199468132s.getClass();
        InterfaceC19925612xi interfaceC19925612xiLJIILJJIL = c199468132s.LJIILJJIL(bArr, bArr.length, c19926312xp);
        AbstractC19925812xk.LIZJ(interfaceC19925612xiLJIILJJIL);
        return (C132E) interfaceC19925612xiLJIILJJIL;
    }

    @Override // X.AbstractC19933412yy
    public Object getExtension(AbstractC19933212yw abstractC19933212yw, int i) {
        return getExtension((AbstractC19925412xg) abstractC19933212yw, i);
    }

    public static C132E parseFrom(AbstractC19922812xG abstractC19922812xG, C19926312xp c19926312xp) {
        return LLILZIL.LIZ(abstractC19922812xG, c19926312xp);
    }

    @Override // X.AbstractC19933412yy
    public Object getExtension(C19933612z0 c19933612z0, int i) {
        return getExtension((AbstractC19925412xg) c19933612z0, i);
    }

    public static C132E parseFrom(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) {
        return (C132E) k0.LJIIJJI(LLILZIL, abstractC19927312xz, c19926312xp);
    }

    public static C132E parseFrom(InputStream inputStream, C19926312xp c19926312xp) {
        return (C132E) k0.LJIILIIL(LLILZIL, inputStream, c19926312xp);
    }

    public static C132E parseFrom(ByteBuffer byteBuffer, C19926312xp c19926312xp) {
        return LLILZIL.LJIIJ(byteBuffer, c19926312xp);
    }
}
