package X;

import X.AbstractC19933312yx;
import X.AbstractC19933412yy;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.protobuf.k0;
import com.google.protobuf.y;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: X.12yx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC19933312yx<MessageT extends AbstractC19933412yy<MessageT>, BuilderT extends AbstractC19933312yx<MessageT, BuilderT>> extends AbstractC19933512yz<BuilderT> implements InterfaceC19933912z3<MessageT> {
    public C19928712yD<C19939112zt> LLILZIL;

    public final void LJIJJ() {
        if (this.LLILZIL == null) {
            C19928612yC<?> c19928612yC = C19928612yC.LIZLLL;
            this.LLILZIL = new C19928712yD<>(0);
        }
    }

    public final boolean LJIJJLI() {
        C19928712yD<C19939112zt> c19928712yD = this.LLILZIL;
        return c19928712yD == null || c19928712yD.LJII();
    }

    @Override // X.AbstractC19933512yz, X.InterfaceC19933112yv
    public final Map<C19939112zt, Object> getAllFields() {
        Map<C19939112zt, Object> mapLJIIJ = LJIIJ();
        C19928712yD<C19939112zt> c19928712yD = this.LLILZIL;
        if (c19928712yD != null) {
            ((TreeMap) mapLJIIJ).putAll(c19928712yD.LJ());
        }
        return Collections.unmodifiableMap(mapLJIIJ);
    }

    public AbstractC19933312yx() {
    }

    public AbstractC19933312yx(InterfaceC19935412zI interfaceC19935412zI) {
        super(interfaceC19935412zI);
    }

    private void LJJI(C19939112zt c19939112zt) {
        if (c19939112zt.LLJIJIL == getDescriptorForType()) {
        } else {
            throw new IllegalArgumentException("FieldDescriptor does not match message type.");
        }
    }

    public final void LJIL(AbstractC19933412yy<?> abstractC19933412yy) {
        if (abstractC19933412yy.extensions != null) {
            LJIJJ();
            this.LLILZIL.LJIIIIZZ(abstractC19933412yy.extensions);
            LJIILLIIL();
        }
    }

    public final void LJJIFFI(AbstractC19933212yw<MessageT, ?> abstractC19933212yw) {
        if (abstractC19933212yw.LIZJ().LLJIJIL == getDescriptorForType()) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Extension is for type \"");
        sbLIZ.append(abstractC19933212yw.LIZJ().LLJIJIL.LLILZ);
        sbLIZ.append("\" which does not match message type \"");
        sbLIZ.append(getDescriptorForType().LLILZ);
        sbLIZ.append("\".");
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.AbstractC19933512yz, X.AbstractC19931812yi, X.InterfaceC19931912yj
    public final InterfaceC19931912yj LJJZ(C19939112zt c19939112zt) {
        if (c19939112zt.LJJIII()) {
            LJJI(c19939112zt);
            if (c19939112zt.LJIJJ() == EnumC19937812zg.MESSAGE) {
                LJIJJ();
                Object objLJFF = this.LLILZIL.LJFF(c19939112zt);
                if (objLJFF == null) {
                    C19932412yo c19932412yo = new C19932412yo(c19939112zt.LJIJJLI());
                    this.LLILZIL.LJIILIIL(c19939112zt, c19932412yo);
                    LJIILLIIL();
                    return c19932412yo;
                }
                if (objLJFF instanceof InterfaceC19931912yj) {
                    return (InterfaceC19931912yj) objLJFF;
                }
                if (objLJFF instanceof InterfaceC19930912yZ) {
                    InterfaceC19931912yj builder = ((InterfaceC19930912yZ) objLJFF).toBuilder();
                    this.LLILZIL.LJIILIIL(c19939112zt, builder);
                    LJIILLIIL();
                    return builder;
                }
                throw new UnsupportedOperationException("getRepeatedFieldBuilder() called on a non-Message type.");
            }
            throw new UnsupportedOperationException("getFieldBuilder() called on a non-Message type.");
        }
        return super.LJJZ(c19939112zt);
    }

    @Override // X.AbstractC19933512yz, X.InterfaceC19931912yj
    public final InterfaceC19931912yj LLFFF(C19939112zt c19939112zt) {
        if (c19939112zt.LJJIII()) {
            return new C19932412yo(c19939112zt.LJIJJLI());
        }
        return super.LLFFF(c19939112zt);
    }

    @Override // X.InterfaceC19933912z3
    public final <T> T getExtension(AbstractC19925412xg<? extends MessageT, T> abstractC19925412xg) {
        Object objLJIIJJI;
        AbstractC19933212yw<MessageT, ?> abstractC19933212ywCheckNotLite = k0.checkNotLite(abstractC19925412xg);
        LJJIFFI(abstractC19933212ywCheckNotLite);
        C19939112zt c19939112ztLIZJ = abstractC19933212ywCheckNotLite.LIZJ();
        C19928712yD<C19939112zt> c19928712yD = this.LLILZIL;
        if (c19928712yD != null && (objLJIIJJI = C19928712yD.LJIIJJI(c19939112ztLIZJ, c19928712yD.LJFF(c19939112ztLIZJ), true)) != null) {
            return (T) abstractC19933212ywCheckNotLite.LIZIZ(objLJIIJJI);
        }
        if (c19939112ztLIZJ.LJJLJ()) {
            return (T) Collections.emptyList();
        }
        if (c19939112ztLIZJ.LJIJJ() == EnumC19937812zg.MESSAGE) {
            return (T) abstractC19933212ywCheckNotLite.LIZLLL();
        }
        return (T) abstractC19933212ywCheckNotLite.LIZIZ(c19939112ztLIZJ.LJIIZILJ());
    }

    @Override // X.InterfaceC19933912z3
    public final <T> int getExtensionCount(AbstractC19925412xg<? extends MessageT, List<T>> abstractC19925412xg) {
        AbstractC19933212yw<MessageT, ?> abstractC19933212ywCheckNotLite = k0.checkNotLite(abstractC19925412xg);
        LJJIFFI(abstractC19933212ywCheckNotLite);
        C19939112zt c19939112ztLIZJ = abstractC19933212ywCheckNotLite.LIZJ();
        C19928712yD<C19939112zt> c19928712yD = this.LLILZIL;
        if (c19928712yD == null) {
            return 0;
        }
        c19928712yD.getClass();
        if (c19939112ztLIZJ.LJJLJ()) {
            Object objLJFF = c19928712yD.LJFF(c19939112ztLIZJ);
            if (objLJFF == null) {
                return 0;
            }
            return ((List) objLJFF).size();
        }
        throw new IllegalArgumentException("getRepeatedFieldCount() can only be called on repeated fields.");
    }

    @Override // X.AbstractC19933512yz, X.InterfaceC19933112yv
    public final Object getField(C19939112zt c19939112zt) {
        Object objLJIIJJI;
        if (c19939112zt.LJJIII()) {
            LJJI(c19939112zt);
            C19928712yD<C19939112zt> c19928712yD = this.LLILZIL;
            if (c19928712yD != null && (objLJIIJJI = C19928712yD.LJIIJJI(c19939112zt, c19928712yD.LJFF(c19939112zt), true)) != null) {
                return objLJIIJJI;
            }
            if (c19939112zt.LJIJJ() == EnumC19937812zg.MESSAGE) {
                return C19932512yp.LJ(c19939112zt.LJIJJLI());
            }
            return c19939112zt.LJIIZILJ();
        }
        return super.getField(c19939112zt);
    }

    @Override // X.InterfaceC19933912z3
    public final <T> boolean hasExtension(AbstractC19925412xg<? extends MessageT, T> abstractC19925412xg) {
        AbstractC19933212yw<MessageT, ?> abstractC19933212ywCheckNotLite = k0.checkNotLite(abstractC19925412xg);
        LJJIFFI(abstractC19933212ywCheckNotLite);
        C19928712yD<C19939112zt> c19928712yD = this.LLILZIL;
        if (c19928712yD != null && c19928712yD.LJI(abstractC19933212ywCheckNotLite.LIZJ())) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC19933512yz, X.InterfaceC19933112yv
    public final boolean hasField(C19939112zt c19939112zt) {
        if (c19939112zt.LJJIII()) {
            LJJI(c19939112zt);
            C19928712yD<C19939112zt> c19928712yD = this.LLILZIL;
            if (c19928712yD != null && c19928712yD.LJI(c19939112zt)) {
                return true;
            }
            return false;
        }
        return super.hasField(c19939112zt);
    }

    @Override // X.AbstractC19933512yz
    public final AbstractC19933512yz LJIIIIZZ(C19939112zt c19939112zt, Object obj) {
        if (c19939112zt.LJJIII()) {
            LJJI(c19939112zt);
            LJIJJ();
            this.LLILZIL.LIZ(c19939112zt, obj);
            LJIILLIIL();
            return this;
        }
        super.LJIIIIZZ(c19939112zt, obj);
        return this;
    }

    @Override // X.AbstractC19933512yz, X.InterfaceC19931912yj
    public final InterfaceC19931912yj LJIIZILJ(C19939112zt c19939112zt, Object obj) {
        if (c19939112zt.LJJIII()) {
            LJJI(c19939112zt);
            LJIJJ();
            this.LLILZIL.LJIILIIL(c19939112zt, obj);
            LJIILLIIL();
            return this;
        }
        super.LJIJI(c19939112zt, obj);
        return this;
    }

    @Override // X.AbstractC19933512yz
    public final AbstractC19933512yz LJIJI(C19939112zt c19939112zt, Object obj) {
        if (c19939112zt.LJJIII()) {
            LJJI(c19939112zt);
            LJIJJ();
            this.LLILZIL.LJIILIIL(c19939112zt, obj);
            LJIILLIIL();
            return this;
        }
        super.LJIJI(c19939112zt, obj);
        return this;
    }

    @Override // X.AbstractC19933512yz, X.InterfaceC19931912yj
    public final InterfaceC19931912yj LJJ(C19939112zt c19939112zt, Object obj) {
        if (c19939112zt.LJJIII()) {
            LJJI(c19939112zt);
            LJIJJ();
            this.LLILZIL.LIZ(c19939112zt, obj);
            LJIILLIIL();
            return this;
        }
        super.LJIIIIZZ(c19939112zt, obj);
        return this;
    }

    @Override // X.InterfaceC19933912z3
    public final <T> T getExtension(AbstractC19925412xg<? extends MessageT, List<T>> abstractC19925412xg, int i) {
        AbstractC19933212yw<MessageT, ?> abstractC19933212ywCheckNotLite = k0.checkNotLite(abstractC19925412xg);
        LJJIFFI(abstractC19933212ywCheckNotLite);
        C19939112zt c19939112ztLIZJ = abstractC19933212ywCheckNotLite.LIZJ();
        C19928712yD<C19939112zt> c19928712yD = this.LLILZIL;
        if (c19928712yD != null) {
            if (c19928712yD.LIZLLL) {
                c19928712yD.LIZLLL();
            }
            if (c19939112ztLIZJ.LJJLJ()) {
                Object objLJFF = c19928712yD.LJFF(c19939112ztLIZJ);
                if (objLJFF != null) {
                    return (T) abstractC19933212ywCheckNotLite.LJ(C19928712yD.LJIIJ(ListProtector.get((List) objLJFF, i), true));
                }
                throw new IndexOutOfBoundsException();
            }
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // X.AbstractC19933512yz
    public final boolean LJIJ(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp, int i) {
        LJIJJ();
        abstractC19927312xz.getClass();
        C19927512y1 c19927512y1LIZIZ = LIZIZ();
        AnonymousClass1301 descriptorForType = getDescriptorForType();
        final C19928712yD<C19939112zt> c19928712yD = this.LLILZIL;
        return C19932112yl.LIZJ(abstractC19927312xz, c19927512y1LIZIZ, c19926312xp, descriptorForType, new InterfaceC19932912yt(c19928712yD) { // from class: X.12yq
            public final C19928712yD<C19939112zt> LIZ;

            @Override // X.InterfaceC19932912yt
            public final EnumC19934612zA getContainerType() {
                return EnumC19934612zA.EXTENSION_SET;
            }

            {
                this.LIZ = c19928712yD;
            }

            @Override // X.InterfaceC19932912yt
            public final EnumC19934712zB LIZJ(C19939112zt c19939112zt) {
                if (c19939112zt.LJJIJIIJIL()) {
                    return EnumC19934712zB.STRICT;
                }
                return EnumC19934712zB.LOOSE;
            }

            @Override // X.InterfaceC19932912yt
            public final boolean hasField(C19939112zt c19939112zt) {
                return this.LIZ.LJI(c19939112zt);
            }

            @Override // X.InterfaceC19932912yt
            public final InterfaceC19932912yt LJIIZILJ(C19939112zt c19939112zt, Object obj) {
                this.LIZ.LJIILIIL(c19939112zt, obj);
                return this;
            }

            @Override // X.InterfaceC19932912yt
            public final InterfaceC19932912yt LJJ(C19939112zt c19939112zt, Object obj) {
                this.LIZ.LIZ(c19939112zt, obj);
                return this;
            }

            @Override // X.InterfaceC19932912yt
            public final C19930612yW LIZIZ(y yVar, AnonymousClass1301 anonymousClass1301, int i2) {
                return yVar.LJFF.get(new C19930812yY(anonymousClass1301, i2));
            }

            @Override // X.InterfaceC19932912yt
            public final void LIZ(AbstractC19927312xz abstractC19927312xz2, C19926312xp c19926312xp2, C19939112zt c19939112zt, InterfaceC19930912yZ interfaceC19930912yZ) {
                InterfaceC19928112y7 builder;
                if (!c19939112zt.LJJLJ()) {
                    if (this.LIZ.LJI(c19939112zt)) {
                        Object objLJFF = this.LIZ.LJFF(c19939112zt);
                        if (objLJFF instanceof InterfaceC19928112y7) {
                            builder = (InterfaceC19928112y7) objLJFF;
                        } else {
                            builder = ((InterfaceC19925612xi) objLJFF).toBuilder();
                            this.LIZ.LJIILIIL(c19939112zt, builder);
                        }
                        abstractC19927312xz2.LJIJJ(c19939112zt.getNumber(), builder, c19926312xp2);
                        return;
                    }
                    InterfaceC19931912yj interfaceC19931912yjNewBuilderForType = interfaceC19930912yZ.newBuilderForType();
                    abstractC19927312xz2.LJIJJ(c19939112zt.getNumber(), interfaceC19931912yjNewBuilderForType, c19926312xp2);
                    LJIIZILJ(c19939112zt, interfaceC19931912yjNewBuilderForType);
                    return;
                }
                InterfaceC19931912yj interfaceC19931912yjNewBuilderForType2 = interfaceC19930912yZ.newBuilderForType();
                abstractC19927312xz2.LJIJJ(c19939112zt.getNumber(), interfaceC19931912yjNewBuilderForType2, c19926312xp2);
                LJJ(c19939112zt, interfaceC19931912yjNewBuilderForType2.buildPartial());
            }

            @Override // X.InterfaceC19932912yt
            public final InterfaceC19930912yZ LIZLLL(AbstractC19922812xG abstractC19922812xG, C19926312xp c19926312xp2, C19939112zt c19939112zt, InterfaceC19930912yZ interfaceC19930912yZ) {
                InterfaceC19930912yZ interfaceC19930912yZ2;
                InterfaceC19931912yj interfaceC19931912yjNewBuilderForType = interfaceC19930912yZ.newBuilderForType();
                if (!c19939112zt.LJJLJ() && (interfaceC19930912yZ2 = (InterfaceC19930912yZ) C19928712yD.LJIIJJI(c19939112zt, this.LIZ.LJFF(c19939112zt), true)) != null) {
                    interfaceC19931912yjNewBuilderForType.LJJIL(interfaceC19930912yZ2);
                }
                interfaceC19931912yjNewBuilderForType.LJJLIIIJ(abstractC19922812xG, c19926312xp2);
                return interfaceC19931912yjNewBuilderForType.buildPartial();
            }

            @Override // X.InterfaceC19932912yt
            public final void LJ(AbstractC19927312xz abstractC19927312xz2, C19926312xp c19926312xp2, C19939112zt c19939112zt, InterfaceC19930912yZ interfaceC19930912yZ) {
                InterfaceC19928112y7 builder;
                if (!c19939112zt.LJJLJ()) {
                    if (this.LIZ.LJI(c19939112zt)) {
                        Object objLJFF = this.LIZ.LJFF(c19939112zt);
                        if (objLJFF instanceof InterfaceC19928112y7) {
                            builder = (InterfaceC19928112y7) objLJFF;
                        } else {
                            builder = ((InterfaceC19925612xi) objLJFF).toBuilder();
                            this.LIZ.LJIILIIL(c19939112zt, builder);
                        }
                        abstractC19927312xz2.LJJI(builder, c19926312xp2);
                        return;
                    }
                    InterfaceC19931912yj interfaceC19931912yjNewBuilderForType = interfaceC19930912yZ.newBuilderForType();
                    abstractC19927312xz2.LJJI(interfaceC19931912yjNewBuilderForType, c19926312xp2);
                    LJIIZILJ(c19939112zt, interfaceC19931912yjNewBuilderForType);
                    return;
                }
                InterfaceC19931912yj interfaceC19931912yjNewBuilderForType2 = interfaceC19930912yZ.newBuilderForType();
                abstractC19927312xz2.LJJI(interfaceC19931912yjNewBuilderForType2, c19926312xp2);
                LJJ(c19939112zt, interfaceC19931912yjNewBuilderForType2.buildPartial());
            }
        }, i);
    }
}
