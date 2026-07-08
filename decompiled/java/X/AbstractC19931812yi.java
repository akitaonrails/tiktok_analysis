package X;

import X.AbstractC19931812yi;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.protobuf.y;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.12yi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC19931812yi<BuilderType extends AbstractC19931812yi<BuilderType>> extends AbstractC19924512xX implements InterfaceC19931912yj {
    @Override // X.AbstractC19924512xX
    /* JADX INFO: renamed from: LIZ, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public BuilderType mo79clone() {
        throw new UnsupportedOperationException("clone() should be implemented in subclasses.");
    }

    public C19927512y1 LIZIZ() {
        C19927612y2 unknownFields = getUnknownFields();
        C19927612y2 c19927612y2 = C19927612y2.LLILLJJLI;
        C19927512y1 c19927512y1 = new C19927512y1();
        c19927512y1.LJFF(unknownFields);
        return c19927512y1;
    }

    @Override // X.InterfaceC19928112y7
    public /* bridge */ /* synthetic */ InterfaceC19925612xi build() {
        return build();
    }

    @Override // X.InterfaceC19928112y7
    public /* bridge */ /* synthetic */ InterfaceC19925612xi buildPartial() {
        return buildPartial();
    }

    @Override // X.InterfaceC19916512wF
    public /* bridge */ /* synthetic */ InterfaceC19925612xi getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final String toString() {
        return C19932212ym.LIZ().LIZLLL(this);
    }

    public static C19918012wU LJI(InterfaceC19930912yZ interfaceC19930912yZ) {
        ArrayList arrayList = new ArrayList();
        C19932112yl.LIZ(interfaceC19930912yZ, "", arrayList);
        return new C19918012wU(arrayList);
    }

    public BuilderType LJ(InterfaceC19930912yZ interfaceC19930912yZ) {
        Map<C19939112zt, Object> allFields = interfaceC19930912yZ.getAllFields();
        if (interfaceC19930912yZ.getDescriptorForType() == getDescriptorForType()) {
            for (Map.Entry<C19939112zt, Object> entry : allFields.entrySet()) {
                C19939112zt key = entry.getKey();
                if (key.LJJLJ()) {
                    Iterator it2 = ((List) entry.getValue()).iterator();
                    while (it2.hasNext()) {
                        LJJ(key, it2.next());
                    }
                } else if (key.LJIJJ() == EnumC19937812zg.MESSAGE) {
                    InterfaceC19930912yZ interfaceC19930912yZ2 = (InterfaceC19930912yZ) getField(key);
                    if (interfaceC19930912yZ2 == interfaceC19930912yZ2.getDefaultInstanceForType()) {
                        LJIIZILJ(key, entry.getValue());
                    } else {
                        InterfaceC19931912yj interfaceC19931912yjNewBuilderForType = interfaceC19930912yZ2.newBuilderForType();
                        interfaceC19931912yjNewBuilderForType.LJJIL(interfaceC19930912yZ2);
                        interfaceC19931912yjNewBuilderForType.LJJIL((InterfaceC19930912yZ) entry.getValue());
                        LJIIZILJ(key, interfaceC19931912yjNewBuilderForType.build());
                    }
                } else {
                    LJIIZILJ(key, entry.getValue());
                }
            }
            LJFF(interfaceC19930912yZ.getUnknownFields());
            return this;
        }
        throw new IllegalArgumentException("mergeFrom(Message) can only merge messages of the same type.");
    }

    public void LJFF(C19927612y2 c19927612y2) {
        C19927612y2 unknownFields = getUnknownFields();
        C19927612y2 c19927612y22 = C19927612y2.LLILLJJLI;
        C19927512y1 c19927512y1 = new C19927512y1();
        c19927512y1.LJFF(unknownFields);
        c19927512y1.LJFF(c19927612y2);
        LJJL(c19927512y1.build());
    }

    public void LJII(C19927512y1 c19927512y1) {
        LJJL(c19927512y1.build());
    }

    @Override // X.InterfaceC19931912yj
    public /* bridge */ /* synthetic */ InterfaceC19931912yj LJJIL(InterfaceC19930912yZ interfaceC19930912yZ) {
        LJ(interfaceC19930912yZ);
        return this;
    }

    @Override // X.InterfaceC19931912yj
    public InterfaceC19931912yj LJJZ(C19939112zt c19939112zt) {
        throw new UnsupportedOperationException("getFieldBuilder() called on an unsupported message type.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC19924512xX
    public final AbstractC19924512xX internalMergeFrom(AbstractC19924812xa abstractC19924812xa) {
        LJ((InterfaceC19930912yZ) abstractC19924812xa);
        return this;
    }

    @Override // X.AbstractC19924512xX
    public final AbstractC19924512xX mergeFrom(AbstractC19927312xz abstractC19927312xz) {
        LIZLLL(abstractC19927312xz, y.LJII);
        return this;
    }

    @Override // X.AbstractC19924512xX
    /* JADX INFO: renamed from: mergeFrom */
    public final InterfaceC19928112y7 mo82mergeFrom(AbstractC19927312xz abstractC19927312xz) {
        LIZLLL(abstractC19927312xz, y.LJII);
        return this;
    }

    @Override // X.AbstractC19924512xX
    public final AbstractC19924512xX mergeFrom(AbstractC19922812xG abstractC19922812xG) {
        super.mergeFrom(abstractC19922812xG);
        return this;
    }

    @Override // X.AbstractC19924512xX
    public final AbstractC19924512xX mergeFrom(InputStream inputStream) {
        super.mergeFrom(inputStream);
        return this;
    }

    @Override // X.AbstractC19924512xX, X.InterfaceC19928112y7
    public final AbstractC19924512xX mergeFrom(byte[] bArr) {
        super.mergeFrom(bArr);
        return this;
    }

    @Override // X.AbstractC19924512xX
    /* JADX INFO: renamed from: mergeFrom */
    public final InterfaceC19928112y7 mo80mergeFrom(AbstractC19922812xG abstractC19922812xG) {
        super.mergeFrom(abstractC19922812xG);
        return this;
    }

    @Override // X.AbstractC19924512xX
    /* JADX INFO: renamed from: mergeFrom */
    public final InterfaceC19928112y7 mo83mergeFrom(InputStream inputStream) {
        super.mergeFrom(inputStream);
        return this;
    }

    @Override // X.AbstractC19924512xX, X.InterfaceC19928112y7
    public final InterfaceC19928112y7 mergeFrom(byte[] bArr) {
        super.mergeFrom(bArr);
        return this;
    }

    public final BuilderType LIZJ(AbstractC19922812xG abstractC19922812xG, C19926312xp c19926312xp) {
        super.mergeFrom(abstractC19922812xG, c19926312xp);
        return this;
    }

    public BuilderType LIZLLL(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) {
        int iLJJIJIL;
        abstractC19927312xz.getClass();
        C19927512y1 c19927512y1LIZIZ = LIZIZ();
        InterfaceC19932912yt interfaceC19932912yt = new InterfaceC19932912yt(this) { // from class: X.12yk
            public final InterfaceC19931912yj LIZ;
            public boolean LIZIZ = true;

            @Override // X.InterfaceC19932912yt
            public final EnumC19934612zA getContainerType() {
                return EnumC19934612zA.MESSAGE;
            }

            {
                this.LIZ = this;
            }

            @Override // X.InterfaceC19932912yt
            public final EnumC19934712zB LIZJ(C19939112zt c19939112zt) {
                if (c19939112zt.LJJIJIIJIL()) {
                    return EnumC19934712zB.STRICT;
                }
                if (!c19939112zt.LJJLJ() && (this.LIZ instanceof AbstractC19933512yz)) {
                    return EnumC19934712zB.LAZY;
                }
                return EnumC19934712zB.LOOSE;
            }

            public final InterfaceC19931912yj LJFF(C19939112zt c19939112zt) {
                if (this.LIZIZ) {
                    try {
                        return this.LIZ.LJJZ(c19939112zt);
                    } catch (UnsupportedOperationException e) {
                        TryCatchGuardChecker.doCheck(e);
                        this.LIZIZ = false;
                        return null;
                    }
                }
                return null;
            }

            @Override // X.InterfaceC19932912yt
            public final boolean hasField(C19939112zt c19939112zt) {
                return this.LIZ.hasField(c19939112zt);
            }

            public final InterfaceC19931912yj LJI(C19939112zt c19939112zt, InterfaceC19930912yZ interfaceC19930912yZ) {
                if (interfaceC19930912yZ != null) {
                    return interfaceC19930912yZ.newBuilderForType();
                }
                return this.LIZ.LLFFF(c19939112zt);
            }

            @Override // X.InterfaceC19932912yt
            public final InterfaceC19932912yt LJIIZILJ(C19939112zt c19939112zt, Object obj) {
                if (!c19939112zt.LJJLJ() && (obj instanceof InterfaceC19928112y7)) {
                    if (obj != LJFF(c19939112zt)) {
                        this.LIZ.LJIIZILJ(c19939112zt, ((InterfaceC19928112y7) obj).buildPartial());
                    }
                    return this;
                }
                this.LIZ.LJIIZILJ(c19939112zt, obj);
                return this;
            }

            @Override // X.InterfaceC19932912yt
            public final InterfaceC19932912yt LJJ(C19939112zt c19939112zt, Object obj) {
                if (obj instanceof InterfaceC19928112y7) {
                    obj = ((InterfaceC19928112y7) obj).buildPartial();
                }
                this.LIZ.LJJ(c19939112zt, obj);
                return this;
            }

            @Override // X.InterfaceC19932912yt
            public final C19930612yW LIZIZ(y yVar, AnonymousClass1301 anonymousClass1301, int i) {
                return yVar.LJFF.get(new C19930812yY(anonymousClass1301, i));
            }

            @Override // X.InterfaceC19932912yt
            public final void LIZ(AbstractC19927312xz abstractC19927312xz2, C19926312xp c19926312xp2, C19939112zt c19939112zt, InterfaceC19930912yZ interfaceC19930912yZ) {
                InterfaceC19931912yj interfaceC19931912yjLJI;
                if (!c19939112zt.LJJLJ()) {
                    if (hasField(c19939112zt)) {
                        InterfaceC19931912yj interfaceC19931912yjLJFF = LJFF(c19939112zt);
                        if (interfaceC19931912yjLJFF != null) {
                            abstractC19927312xz2.LJIJJ(c19939112zt.getNumber(), interfaceC19931912yjLJFF, c19926312xp2);
                            return;
                        } else {
                            interfaceC19931912yjLJI = LJI(c19939112zt, interfaceC19930912yZ);
                            interfaceC19931912yjLJI.LJJIL((InterfaceC19930912yZ) this.LIZ.getField(c19939112zt));
                        }
                    } else {
                        interfaceC19931912yjLJI = LJI(c19939112zt, interfaceC19930912yZ);
                    }
                    abstractC19927312xz2.LJIJJ(c19939112zt.getNumber(), interfaceC19931912yjLJI, c19926312xp2);
                    LJIIZILJ(c19939112zt, interfaceC19931912yjLJI.buildPartial());
                    return;
                }
                InterfaceC19931912yj interfaceC19931912yjLJI2 = LJI(c19939112zt, interfaceC19930912yZ);
                abstractC19927312xz2.LJIJJ(c19939112zt.getNumber(), interfaceC19931912yjLJI2, c19926312xp2);
                LJJ(c19939112zt, interfaceC19931912yjLJI2.buildPartial());
            }

            @Override // X.InterfaceC19932912yt
            public final InterfaceC19930912yZ LIZLLL(AbstractC19922812xG abstractC19922812xG, C19926312xp c19926312xp2, C19939112zt c19939112zt, InterfaceC19930912yZ interfaceC19930912yZ) {
                InterfaceC19931912yj interfaceC19931912yjLLFFF;
                InterfaceC19930912yZ interfaceC19930912yZ2;
                if (interfaceC19930912yZ != null) {
                    interfaceC19931912yjLLFFF = interfaceC19930912yZ.newBuilderForType();
                } else {
                    interfaceC19931912yjLLFFF = this.LIZ.LLFFF(c19939112zt);
                }
                if (!c19939112zt.LJJLJ() && (interfaceC19930912yZ2 = (InterfaceC19930912yZ) this.LIZ.getField(c19939112zt)) != null) {
                    interfaceC19931912yjLLFFF.LJJIL(interfaceC19930912yZ2);
                }
                interfaceC19931912yjLLFFF.LJJLIIIJ(abstractC19922812xG, c19926312xp2);
                return interfaceC19931912yjLLFFF.buildPartial();
            }

            @Override // X.InterfaceC19932912yt
            public final void LJ(AbstractC19927312xz abstractC19927312xz2, C19926312xp c19926312xp2, C19939112zt c19939112zt, InterfaceC19930912yZ interfaceC19930912yZ) {
                InterfaceC19931912yj interfaceC19931912yjLJI;
                if (!c19939112zt.LJJLJ()) {
                    if (hasField(c19939112zt)) {
                        InterfaceC19931912yj interfaceC19931912yjLJFF = LJFF(c19939112zt);
                        if (interfaceC19931912yjLJFF != null) {
                            abstractC19927312xz2.LJJI(interfaceC19931912yjLJFF, c19926312xp2);
                            return;
                        } else {
                            interfaceC19931912yjLJI = LJI(c19939112zt, interfaceC19930912yZ);
                            interfaceC19931912yjLJI.LJJIL((InterfaceC19930912yZ) this.LIZ.getField(c19939112zt));
                        }
                    } else {
                        interfaceC19931912yjLJI = LJI(c19939112zt, interfaceC19930912yZ);
                    }
                    abstractC19927312xz2.LJJI(interfaceC19931912yjLJI, c19926312xp2);
                    LJIIZILJ(c19939112zt, interfaceC19931912yjLJI.buildPartial());
                    return;
                }
                InterfaceC19931912yj interfaceC19931912yjLJI2 = LJI(c19939112zt, interfaceC19930912yZ);
                abstractC19927312xz2.LJJI(interfaceC19931912yjLJI2, c19926312xp2);
                LJJ(c19939112zt, interfaceC19931912yjLJI2.buildPartial());
            }
        };
        AnonymousClass1301 descriptorForType = getDescriptorForType();
        do {
            iLJJIJIL = abstractC19927312xz.LJJIJIL();
            if (iLJJIJIL == 0) {
                break;
            }
        } while (C19932112yl.LIZJ(abstractC19927312xz, c19927512y1LIZIZ, c19926312xp, descriptorForType, interfaceC19932912yt, iLJJIJIL));
        if (c19927512y1LIZIZ != null) {
            LJII(c19927512y1LIZIZ);
        }
        return this;
    }

    @Override // X.InterfaceC19931912yj
    public final /* bridge */ /* synthetic */ AbstractC19931812yi LJJLIIIJ(AbstractC19922812xG abstractC19922812xG, C19926312xp c19926312xp) {
        LIZJ(abstractC19922812xG, c19926312xp);
        return this;
    }

    @Override // X.AbstractC19924512xX
    public final /* bridge */ /* synthetic */ AbstractC19924512xX mergeFrom(AbstractC19922812xG abstractC19922812xG, C19926312xp c19926312xp) {
        LIZJ(abstractC19922812xG, c19926312xp);
        return this;
    }

    @Override // X.AbstractC19924512xX, X.InterfaceC19928112y7
    public /* bridge */ /* synthetic */ AbstractC19924512xX mergeFrom(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) {
        LIZLLL(abstractC19927312xz, c19926312xp);
        return this;
    }

    @Override // X.AbstractC19924512xX
    public final AbstractC19924512xX mergeFrom(InputStream inputStream, C19926312xp c19926312xp) {
        super.mergeFrom(inputStream, c19926312xp);
        return this;
    }

    @Override // X.AbstractC19924512xX
    public final AbstractC19924512xX mergeFrom(byte[] bArr, C19926312xp c19926312xp) {
        super.mergeFrom(bArr, c19926312xp);
        return this;
    }

    @Override // X.AbstractC19924512xX
    /* JADX INFO: renamed from: mergeFrom */
    public final /* bridge */ /* synthetic */ InterfaceC19928112y7 mo81mergeFrom(AbstractC19922812xG abstractC19922812xG, C19926312xp c19926312xp) {
        LIZJ(abstractC19922812xG, c19926312xp);
        return this;
    }

    @Override // X.AbstractC19924512xX, X.InterfaceC19928112y7
    public /* bridge */ /* synthetic */ InterfaceC19928112y7 mergeFrom(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) {
        LIZLLL(abstractC19927312xz, c19926312xp);
        return this;
    }

    @Override // X.AbstractC19924512xX
    /* JADX INFO: renamed from: mergeFrom */
    public final InterfaceC19928112y7 mo84mergeFrom(InputStream inputStream, C19926312xp c19926312xp) {
        super.mergeFrom(inputStream, c19926312xp);
        return this;
    }

    @Override // X.AbstractC19924512xX
    /* JADX INFO: renamed from: mergeFrom */
    public final InterfaceC19928112y7 mo87mergeFrom(byte[] bArr, C19926312xp c19926312xp) {
        super.mergeFrom(bArr, c19926312xp);
        return this;
    }

    @Override // X.AbstractC19924512xX
    public final AbstractC19924512xX mergeFrom(byte[] bArr, int i, int i2) {
        super.mergeFrom(bArr, i, i2);
        return this;
    }

    @Override // X.AbstractC19924512xX
    /* JADX INFO: renamed from: mergeFrom */
    public final InterfaceC19928112y7 mo85mergeFrom(byte[] bArr, int i, int i2) {
        super.mergeFrom(bArr, i, i2);
        return this;
    }

    @Override // X.AbstractC19924512xX
    public final AbstractC19924512xX mergeFrom(byte[] bArr, int i, int i2, C19926312xp c19926312xp) {
        super.mergeFrom(bArr, i, i2, c19926312xp);
        return this;
    }

    @Override // X.AbstractC19924512xX
    /* JADX INFO: renamed from: mergeFrom */
    public final InterfaceC19928112y7 mo86mergeFrom(byte[] bArr, int i, int i2, C19926312xp c19926312xp) {
        super.mergeFrom(bArr, i, i2, c19926312xp);
        return this;
    }
}
