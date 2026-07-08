package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.protobuf.k0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.130d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C199401130d extends k0 implements InterfaceC19933112yv {
    public static final C199401130d LLILZ;
    public static final C130A LLILZIL;
    public static final long serialVersionUID = 0;
    public int LLILLJJLI;
    public byte LLILLL;
    public C19920612wu dependency_;
    public int edition_;
    public List<C131C> enumType_;
    public List<C199412130o> extension_;
    public List<C199403130f> messageType_;
    public volatile Object name_;
    public C19920612wu optionDependency_;
    public C132E options_;
    public volatile Object package_;
    public InterfaceC19922412xC publicDependency_;
    public List<C132I> service_;
    public AnonymousClass1315 sourceCodeInfo_;
    public volatile Object syntax_;
    public InterfaceC19922412xC weakDependency_;

    /* JADX WARN: Type inference failed for: r0v2, types: [X.130A] */
    static {
        C19373810qu.LIZ(EnumC19373110qn.PUBLIC, "FileDescriptorProto");
        LLILZ = new C199401130d();
        LLILZIL = new AbstractC19925812xk<C199401130d>() { // from class: X.130A
            @Override // X.InterfaceC19925712xj
            public final Object LIZIZ(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) throws C19926612xs {
                C199402130e c199402130eNewBuilder = C199401130d.newBuilder();
                try {
                    c199402130eNewBuilder.LJJIJ(abstractC19927312xz, c19926312xp);
                    return c199402130eNewBuilder.buildPartial();
                } catch (C19918012wU e) {
                    TryCatchGuardChecker.doCheck(e);
                    C19926612xs c19926612xsAsInvalidProtocolBufferException = e.asInvalidProtocolBufferException();
                    c19926612xsAsInvalidProtocolBufferException.setUnfinishedMessage(c199402130eNewBuilder.buildPartial());
                    throw c19926612xsAsInvalidProtocolBufferException;
                } catch (C19926612xs e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    e2.setUnfinishedMessage(c199402130eNewBuilder.buildPartial());
                    throw e2;
                } catch (IOException e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    C19926612xs c19926612xs = new C19926612xs(e3);
                    c19926612xs.setUnfinishedMessage(c199402130eNewBuilder.buildPartial());
                    throw c19926612xs;
                }
            }
        };
    }

    public static C199402130e newBuilder() {
        return LLILZ.toBuilder();
    }

    @Override // com.google.protobuf.k0
    public final C19935812zM LJI() {
        C19935812zM c19935812zM = C131K.LIZIZ;
        c19935812zM.LIZ(C199401130d.class, C199402130e.class);
        return c19935812zM;
    }

    public int getDependencyCount() {
        return this.dependency_.size();
    }

    public C130B getEdition() {
        C130B c130bForNumber = C130B.forNumber(this.edition_);
        return c130bForNumber == null ? C130B.EDITION_UNKNOWN : c130bForNumber;
    }

    public int getEnumTypeCount() {
        return this.enumType_.size();
    }

    public int getExtensionCount() {
        return this.extension_.size();
    }

    public int getMessageTypeCount() {
        return this.messageType_.size();
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

    public int getOptionDependencyCount() {
        return this.optionDependency_.size();
    }

    public C132E getOptions() {
        C132E c132e = this.options_;
        return c132e == null ? C132E.getDefaultInstance() : c132e;
    }

    public C131N getOptionsOrBuilder() {
        C132E c132e = this.options_;
        return c132e == null ? C132E.getDefaultInstance() : c132e;
    }

    public String getPackage() {
        Object obj = this.package_;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC19922812xG abstractC19922812xG = (AbstractC19922812xG) obj;
        String stringUtf8 = abstractC19922812xG.toStringUtf8();
        if (abstractC19922812xG.isValidUtf8()) {
            this.package_ = stringUtf8;
        }
        return stringUtf8;
    }

    public AbstractC19922812xG getPackageBytes() {
        Object obj = this.package_;
        if (!(obj instanceof String)) {
            return (AbstractC19922812xG) obj;
        }
        AbstractC19922812xG abstractC19922812xGCopyFromUtf8 = AbstractC19922812xG.copyFromUtf8((String) obj);
        this.package_ = abstractC19922812xGCopyFromUtf8;
        return abstractC19922812xGCopyFromUtf8;
    }

    public int getPublicDependencyCount() {
        return this.publicDependency_.size();
    }

    @Override // com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19925612xi
    public int getSerializedSize() {
        int i = this.LL;
        if (i != -1) {
            return i;
        }
        int iLJ = (this.LLILLJJLI & 1) != 0 ? k0.LJ(1, this.name_) : 0;
        if ((this.LLILLJJLI & 2) != 0) {
            iLJ += k0.LJ(2, this.package_);
        }
        int iLJFF = 0;
        for (int i2 = 0; i2 < this.dependency_.size(); i2++) {
            iLJFF += k0.LJFF(this.dependency_.LJJJLL(i2));
        }
        int size = iLJ + iLJFF + m89getDependencyList().size();
        for (int i3 = 0; i3 < this.messageType_.size(); i3++) {
            size += AbstractC19928912yF.LJII(4, (InterfaceC19925612xi) ListProtector.get(this.messageType_, i3));
        }
        for (int i4 = 0; i4 < this.enumType_.size(); i4++) {
            size += AbstractC19928912yF.LJII(5, (InterfaceC19925612xi) ListProtector.get(this.enumType_, i4));
        }
        for (int i5 = 0; i5 < this.service_.size(); i5++) {
            size += AbstractC19928912yF.LJII(6, (InterfaceC19925612xi) ListProtector.get(this.service_, i5));
        }
        for (int i6 = 0; i6 < this.extension_.size(); i6++) {
            size += AbstractC19928912yF.LJII(7, (InterfaceC19925612xi) ListProtector.get(this.extension_, i6));
        }
        if ((this.LLILLJJLI & 4) != 0) {
            size += AbstractC19928912yF.LJII(8, getOptions());
        }
        if ((this.LLILLJJLI & 8) != 0) {
            size += AbstractC19928912yF.LJII(9, getSourceCodeInfo());
        }
        int iLJIILJJIL = 0;
        for (int i7 = 0; i7 < this.publicDependency_.size(); i7++) {
            iLJIILJJIL += AbstractC19928912yF.LJIILJJIL(this.publicDependency_.getInt(i7));
        }
        int size2 = size + iLJIILJJIL + getPublicDependencyList().size();
        int iLJIILJJIL2 = 0;
        for (int i8 = 0; i8 < this.weakDependency_.size(); i8++) {
            iLJIILJJIL2 += AbstractC19928912yF.LJIILJJIL(this.weakDependency_.getInt(i8));
        }
        int size3 = size2 + iLJIILJJIL2 + getWeakDependencyList().size();
        if ((this.LLILLJJLI & 16) != 0) {
            size3 += k0.LJ(12, this.syntax_);
        }
        if ((this.LLILLJJLI & 32) != 0) {
            size3 += AbstractC19928912yF.LJ(14, this.edition_);
        }
        int iLJFF2 = 0;
        for (int i9 = 0; i9 < this.optionDependency_.size(); i9++) {
            iLJFF2 += k0.LJFF(this.optionDependency_.LJJJLL(i9));
        }
        int size4 = size3 + iLJFF2 + m90getOptionDependencyList().size() + getUnknownFields().getSerializedSize();
        this.LL = size4;
        return size4;
    }

    public int getServiceCount() {
        return this.service_.size();
    }

    public AnonymousClass1315 getSourceCodeInfo() {
        AnonymousClass1315 anonymousClass1315 = this.sourceCodeInfo_;
        return anonymousClass1315 == null ? AnonymousClass1315.getDefaultInstance() : anonymousClass1315;
    }

    public InterfaceC199417130t getSourceCodeInfoOrBuilder() {
        AnonymousClass1315 anonymousClass1315 = this.sourceCodeInfo_;
        return anonymousClass1315 == null ? AnonymousClass1315.getDefaultInstance() : anonymousClass1315;
    }

    public String getSyntax() {
        Object obj = this.syntax_;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC19922812xG abstractC19922812xG = (AbstractC19922812xG) obj;
        String stringUtf8 = abstractC19922812xG.toStringUtf8();
        if (abstractC19922812xG.isValidUtf8()) {
            this.syntax_ = stringUtf8;
        }
        return stringUtf8;
    }

    public AbstractC19922812xG getSyntaxBytes() {
        Object obj = this.syntax_;
        if (!(obj instanceof String)) {
            return (AbstractC19922812xG) obj;
        }
        AbstractC19922812xG abstractC19922812xGCopyFromUtf8 = AbstractC19922812xG.copyFromUtf8((String) obj);
        this.syntax_ = abstractC19922812xGCopyFromUtf8;
        return abstractC19922812xGCopyFromUtf8;
    }

    public int getWeakDependencyCount() {
        return this.weakDependency_.size();
    }

    public boolean hasEdition() {
        return (this.LLILLJJLI & 32) != 0;
    }

    public boolean hasName() {
        return (this.LLILLJJLI & 1) != 0;
    }

    public boolean hasOptions() {
        return (this.LLILLJJLI & 4) != 0;
    }

    public boolean hasPackage() {
        return (this.LLILLJJLI & 2) != 0;
    }

    public boolean hasSourceCodeInfo() {
        return (this.LLILLJJLI & 8) != 0;
    }

    public boolean hasSyntax() {
        return (this.LLILLJJLI & 16) != 0;
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
        if (hasPackage()) {
            iHashCode = (((iHashCode * 37) + 2) * 53) + getPackage().hashCode();
        }
        if (getDependencyCount() > 0) {
            iHashCode = (((iHashCode * 37) + 3) * 53) + m89getDependencyList().hashCode();
        }
        if (getPublicDependencyCount() > 0) {
            iHashCode = (((iHashCode * 37) + 10) * 53) + getPublicDependencyList().hashCode();
        }
        if (getWeakDependencyCount() > 0) {
            iHashCode = (((iHashCode * 37) + 11) * 53) + getWeakDependencyList().hashCode();
        }
        if (getOptionDependencyCount() > 0) {
            iHashCode = (((iHashCode * 37) + 15) * 53) + m90getOptionDependencyList().hashCode();
        }
        if (getMessageTypeCount() > 0) {
            iHashCode = (((iHashCode * 37) + 4) * 53) + getMessageTypeList().hashCode();
        }
        if (getEnumTypeCount() > 0) {
            iHashCode = (((iHashCode * 37) + 5) * 53) + getEnumTypeList().hashCode();
        }
        if (getServiceCount() > 0) {
            iHashCode = (((iHashCode * 37) + 6) * 53) + getServiceList().hashCode();
        }
        if (getExtensionCount() > 0) {
            iHashCode = (((iHashCode * 37) + 7) * 53) + getExtensionList().hashCode();
        }
        if (hasOptions()) {
            iHashCode = (((iHashCode * 37) + 8) * 53) + getOptions().hashCode();
        }
        if (hasSourceCodeInfo()) {
            iHashCode = (((iHashCode * 37) + 9) * 53) + getSourceCodeInfo().hashCode();
        }
        if (hasSyntax()) {
            iHashCode = (((iHashCode * 37) + 12) * 53) + getSyntax().hashCode();
        }
        if (hasEdition()) {
            iHashCode = (((iHashCode * 37) + 14) * 53) + this.edition_;
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
        for (int i = 0; i < getMessageTypeCount(); i++) {
            if (!getMessageType(i).isInitialized()) {
                this.LLILLL = (byte) 0;
                return false;
            }
        }
        for (int i2 = 0; i2 < getEnumTypeCount(); i2++) {
            if (!getEnumType(i2).isInitialized()) {
                this.LLILLL = (byte) 0;
                return false;
            }
        }
        for (int i3 = 0; i3 < getServiceCount(); i3++) {
            if (!getService(i3).isInitialized()) {
                this.LLILLL = (byte) 0;
                return false;
            }
        }
        for (int i4 = 0; i4 < getExtensionCount(); i4++) {
            if (!getExtension(i4).isInitialized()) {
                this.LLILLL = (byte) 0;
                return false;
            }
        }
        if (hasOptions() && !getOptions().isInitialized()) {
            this.LLILLL = (byte) 0;
            return false;
        }
        if (!hasSourceCodeInfo() || getSourceCodeInfo().isInitialized()) {
            this.LLILLL = (byte) 1;
            return true;
        }
        this.LLILLL = (byte) 0;
        return false;
    }

    @Override // com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19925612xi
    public C199402130e toBuilder() {
        if (this == LLILZ) {
            return new C199402130e();
        }
        C199402130e c199402130e = new C199402130e();
        c199402130e.LJJIIZI(this);
        return c199402130e;
    }

    public C199401130d() {
        this.name_ = "";
        this.package_ = "";
        C19920612wu c19920612wu = C19920612wu.LLILLL;
        this.dependency_ = c19920612wu;
        C19889012ro c19889012ro = C19889012ro.LLILZIL;
        this.publicDependency_ = c19889012ro;
        this.weakDependency_ = c19889012ro;
        this.optionDependency_ = c19920612wu;
        this.syntax_ = "";
        this.edition_ = 0;
        this.LLILLL = (byte) -1;
        this.name_ = "";
        this.package_ = "";
        this.dependency_ = c19920612wu;
        this.publicDependency_ = c19889012ro;
        this.weakDependency_ = c19889012ro;
        this.optionDependency_ = c19920612wu;
        this.messageType_ = Collections.emptyList();
        this.enumType_ = Collections.emptyList();
        this.service_ = Collections.emptyList();
        this.extension_ = Collections.emptyList();
        this.syntax_ = "";
        this.edition_ = 0;
    }

    public static C199401130d getDefaultInstance() {
        return LLILZ;
    }

    public static final AnonymousClass1301 getDescriptor() {
        return C131K.LIZ;
    }

    public static InterfaceC19925712xj<C199401130d> parser() {
        return LLILZIL;
    }

    public List<C131C> getEnumTypeList() {
        return this.enumType_;
    }

    public List<? extends InterfaceC199410130m> getEnumTypeOrBuilderList() {
        return this.enumType_;
    }

    public List<C199412130o> getExtensionList() {
        return this.extension_;
    }

    public List<? extends InterfaceC199411130n> getExtensionOrBuilderList() {
        return this.extension_;
    }

    public List<C199403130f> getMessageTypeList() {
        return this.messageType_;
    }

    public List<? extends InterfaceC199409130l> getMessageTypeOrBuilderList() {
        return this.messageType_;
    }

    @Override // com.google.protobuf.k0, X.InterfaceC19925612xi
    public InterfaceC19925712xj<C199401130d> getParserForType() {
        return LLILZIL;
    }

    public List<Integer> getPublicDependencyList() {
        return this.publicDependency_;
    }

    public List<C132I> getServiceList() {
        return this.service_;
    }

    public List<? extends AnonymousClass1330> getServiceOrBuilderList() {
        return this.service_;
    }

    public List<Integer> getWeakDependencyList() {
        return this.weakDependency_;
    }

    /* JADX INFO: renamed from: getDependencyList, reason: merged with bridge method [inline-methods] */
    public InterfaceC1554550qYX m89getDependencyList() {
        return this.dependency_;
    }

    /* JADX INFO: renamed from: getOptionDependencyList, reason: merged with bridge method [inline-methods] */
    public InterfaceC1554550qYX m90getOptionDependencyList() {
        return this.optionDependency_;
    }

    @Override // com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19916512wF
    public C199401130d getDefaultInstanceForType() {
        return LLILZ;
    }

    @Override // com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19925612xi
    public C199402130e newBuilderForType() {
        return newBuilder();
    }

    public C199401130d(AbstractC19933512yz abstractC19933512yz) {
        super(abstractC19933512yz);
        this.name_ = "";
        this.package_ = "";
        C19920612wu c19920612wu = C19920612wu.LLILLL;
        this.dependency_ = c19920612wu;
        C19889012ro c19889012ro = C19889012ro.LLILZIL;
        this.publicDependency_ = c19889012ro;
        this.weakDependency_ = c19889012ro;
        this.optionDependency_ = c19920612wu;
        this.syntax_ = "";
        this.edition_ = 0;
        this.LLILLL = (byte) -1;
    }

    public static C199402130e newBuilder(C199401130d c199401130d) {
        C199402130e builder = LLILZ.toBuilder();
        builder.LJJIIZI(c199401130d);
        return builder;
    }

    public static C199401130d parseDelimitedFrom(InputStream inputStream) {
        return (C199401130d) k0.LJIIIIZZ(LLILZIL, inputStream);
    }

    public static C199401130d parseFrom(AbstractC19922812xG abstractC19922812xG) {
        return (C199401130d) LLILZIL.LJFF(abstractC19922812xG);
    }

    @Override // X.AbstractC19932312yn
    public final InterfaceC19931912yj LIZLLL(InterfaceC19935412zI interfaceC19935412zI) {
        return new C199402130e(interfaceC19935412zI);
    }

    @Override // X.AbstractC19932312yn
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C199401130d)) {
            return super.equals(obj);
        }
        C199401130d c199401130d = (C199401130d) obj;
        if (hasName() != c199401130d.hasName()) {
            return false;
        }
        if ((hasName() && !getName().equals(c199401130d.getName())) || hasPackage() != c199401130d.hasPackage()) {
            return false;
        }
        if ((hasPackage() && !getPackage().equals(c199401130d.getPackage())) || !m89getDependencyList().equals(c199401130d.m89getDependencyList()) || !getPublicDependencyList().equals(c199401130d.getPublicDependencyList()) || !getWeakDependencyList().equals(c199401130d.getWeakDependencyList()) || !m90getOptionDependencyList().equals(c199401130d.m90getOptionDependencyList()) || !getMessageTypeList().equals(c199401130d.getMessageTypeList()) || !getEnumTypeList().equals(c199401130d.getEnumTypeList()) || !getServiceList().equals(c199401130d.getServiceList()) || !getExtensionList().equals(c199401130d.getExtensionList()) || hasOptions() != c199401130d.hasOptions()) {
            return false;
        }
        if ((hasOptions() && !getOptions().equals(c199401130d.getOptions())) || hasSourceCodeInfo() != c199401130d.hasSourceCodeInfo()) {
            return false;
        }
        if ((hasSourceCodeInfo() && !getSourceCodeInfo().equals(c199401130d.getSourceCodeInfo())) || hasSyntax() != c199401130d.hasSyntax()) {
            return false;
        }
        if ((hasSyntax() && !getSyntax().equals(c199401130d.getSyntax())) || hasEdition() != c199401130d.hasEdition()) {
            return false;
        }
        if ((!hasEdition() || this.edition_ == c199401130d.edition_) && getUnknownFields().equals(c199401130d.getUnknownFields())) {
            return true;
        }
        return false;
    }

    public String getDependency(int i) {
        return this.dependency_.get(i);
    }

    public AbstractC19922812xG getDependencyBytes(int i) {
        return this.dependency_.LJFF(i);
    }

    public C131C getEnumType(int i) {
        return (C131C) ListProtector.get(this.enumType_, i);
    }

    public InterfaceC199410130m getEnumTypeOrBuilder(int i) {
        return (InterfaceC199410130m) ListProtector.get(this.enumType_, i);
    }

    public C199412130o getExtension(int i) {
        return (C199412130o) ListProtector.get(this.extension_, i);
    }

    public InterfaceC199411130n getExtensionOrBuilder(int i) {
        return (InterfaceC199411130n) ListProtector.get(this.extension_, i);
    }

    public C199403130f getMessageType(int i) {
        return (C199403130f) ListProtector.get(this.messageType_, i);
    }

    public InterfaceC199409130l getMessageTypeOrBuilder(int i) {
        return (InterfaceC199409130l) ListProtector.get(this.messageType_, i);
    }

    public String getOptionDependency(int i) {
        return this.optionDependency_.get(i);
    }

    public AbstractC19922812xG getOptionDependencyBytes(int i) {
        return this.optionDependency_.LJFF(i);
    }

    public int getPublicDependency(int i) {
        return this.publicDependency_.getInt(i);
    }

    public C132I getService(int i) {
        return (C132I) ListProtector.get(this.service_, i);
    }

    public AnonymousClass1330 getServiceOrBuilder(int i) {
        return (AnonymousClass1330) ListProtector.get(this.service_, i);
    }

    public int getWeakDependency(int i) {
        return this.weakDependency_.getInt(i);
    }

    @Override // com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19925612xi
    public void writeTo(AbstractC19928912yF abstractC19928912yF) {
        if ((this.LLILLJJLI & 1) != 0) {
            k0.LJIILJJIL(abstractC19928912yF, 1, this.name_);
        }
        if ((this.LLILLJJLI & 2) != 0) {
            k0.LJIILJJIL(abstractC19928912yF, 2, this.package_);
        }
        for (int i = 0; i < this.dependency_.size(); i++) {
            k0.LJIILJJIL(abstractC19928912yF, 3, this.dependency_.LJJJLL(i));
        }
        for (int i2 = 0; i2 < this.messageType_.size(); i2++) {
            abstractC19928912yF.LJJIIJ(4, (InterfaceC19925612xi) ListProtector.get(this.messageType_, i2));
        }
        for (int i3 = 0; i3 < this.enumType_.size(); i3++) {
            abstractC19928912yF.LJJIIJ(5, (InterfaceC19925612xi) ListProtector.get(this.enumType_, i3));
        }
        for (int i4 = 0; i4 < this.service_.size(); i4++) {
            abstractC19928912yF.LJJIIJ(6, (InterfaceC19925612xi) ListProtector.get(this.service_, i4));
        }
        for (int i5 = 0; i5 < this.extension_.size(); i5++) {
            abstractC19928912yF.LJJIIJ(7, (InterfaceC19925612xi) ListProtector.get(this.extension_, i5));
        }
        if ((this.LLILLJJLI & 4) != 0) {
            abstractC19928912yF.LJJIIJ(8, getOptions());
        }
        if ((this.LLILLJJLI & 8) != 0) {
            abstractC19928912yF.LJJIIJ(9, getSourceCodeInfo());
        }
        for (int i6 = 0; i6 < this.publicDependency_.size(); i6++) {
            abstractC19928912yF.LJJII(10, this.publicDependency_.getInt(i6));
        }
        for (int i7 = 0; i7 < this.weakDependency_.size(); i7++) {
            abstractC19928912yF.LJJII(11, this.weakDependency_.getInt(i7));
        }
        if ((this.LLILLJJLI & 16) != 0) {
            k0.LJIILJJIL(abstractC19928912yF, 12, this.syntax_);
        }
        if ((this.LLILLJJLI & 32) != 0) {
            abstractC19928912yF.LJJII(14, this.edition_);
        }
        for (int i8 = 0; i8 < this.optionDependency_.size(); i8++) {
            k0.LJIILJJIL(abstractC19928912yF, 15, this.optionDependency_.LJJJLL(i8));
        }
        getUnknownFields().writeTo(abstractC19928912yF);
    }

    public static C199401130d parseFrom(AbstractC19927312xz abstractC19927312xz) {
        return (C199401130d) k0.LJIIJ(LLILZIL, abstractC19927312xz);
    }

    public static C199401130d parseFrom(InputStream inputStream) {
        return (C199401130d) k0.LJIIL(LLILZIL, inputStream);
    }

    public static C199401130d parseFrom(ByteBuffer byteBuffer) {
        return (C199401130d) LLILZIL.LJIIIZ(byteBuffer);
    }

    public static C199401130d parseFrom(byte[] bArr) {
        return (C199401130d) LLILZIL.LJIIJJI(bArr);
    }

    public static C199401130d parseDelimitedFrom(InputStream inputStream, C19926312xp c19926312xp) {
        return (C199401130d) k0.LJIIIZ(LLILZIL, inputStream, c19926312xp);
    }

    public static C199401130d parseFrom(byte[] bArr, C19926312xp c19926312xp) {
        C130A c130a = LLILZIL;
        c130a.getClass();
        InterfaceC19925612xi interfaceC19925612xiLJIILJJIL = c130a.LJIILJJIL(bArr, bArr.length, c19926312xp);
        AbstractC19925812xk.LIZJ(interfaceC19925612xiLJIILJJIL);
        return (C199401130d) interfaceC19925612xiLJIILJJIL;
    }

    public static C199401130d parseFrom(AbstractC19922812xG abstractC19922812xG, C19926312xp c19926312xp) {
        return LLILZIL.LIZ(abstractC19922812xG, c19926312xp);
    }

    public static C199401130d parseFrom(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) {
        return (C199401130d) k0.LJIIJJI(LLILZIL, abstractC19927312xz, c19926312xp);
    }

    public static C199401130d parseFrom(InputStream inputStream, C19926312xp c19926312xp) {
        return (C199401130d) k0.LJIILIIL(LLILZIL, inputStream, c19926312xp);
    }

    public static C199401130d parseFrom(ByteBuffer byteBuffer, C19926312xp c19926312xp) {
        return LLILZIL.LJIIJ(byteBuffer, c19926312xp);
    }
}
