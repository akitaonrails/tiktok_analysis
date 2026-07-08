package X;

import X.AbstractC19933412yy;
import com.google.protobuf.k0;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.12yy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC19933412yy<MessageT extends AbstractC19933412yy<MessageT>> extends k0 implements InterfaceC19933912z3<MessageT> {
    public static final long serialVersionUID = 1;
    public final C19928612yC<C19939112zt> extensions;

    @Override // com.google.protobuf.k0, X.InterfaceC19933112yv
    public Map<C19939112zt, Object> getAllFields() {
        Map<C19939112zt, Object> allFieldsMutable = getAllFieldsMutable(false);
        allFieldsMutable.putAll(LJIJ());
        return Collections.unmodifiableMap(allFieldsMutable);
    }

    @Override // com.google.protobuf.k0
    public Map<C19939112zt, Object> getAllFieldsRaw() {
        Map<C19939112zt, Object> allFieldsMutable = getAllFieldsMutable(false);
        allFieldsMutable.putAll(LJIJ());
        return Collections.unmodifiableMap(allFieldsMutable);
    }

    @Override // com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19916512wF
    public abstract /* synthetic */ InterfaceC19930912yZ getDefaultInstanceForType();

    @Override // com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19925612xi
    public abstract /* synthetic */ InterfaceC19931912yj newBuilderForType();

    @Override // com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19925612xi
    public abstract /* synthetic */ InterfaceC19931912yj toBuilder();

    public final boolean LJIILL() {
        return this.extensions.LJIILLIIL();
    }

    public final int LJIILLIIL() {
        return this.extensions.LJIILIIL();
    }

    public final Map<C19939112zt, Object> LJIJ() {
        return this.extensions.LJII();
    }

    public final C131A LJIJI() {
        return this.extensions.LJIILL() ? new C131A() { // from class: X.12zE
            @Override // X.C131A
            public final void LIZ(int i, AbstractC19928912yF abstractC19928912yF) {
            }
        } : new C131A(this) { // from class: X.12yO
            public final Iterator<Map.Entry<C19939112zt, Object>> LIZ;
            public Map.Entry<C19939112zt, Object> LIZIZ;
            public final boolean LIZJ;

            {
                Iterator itLJIJI = this.extensions.LJIJI();
                this.LIZ = itLJIJI;
                if (itLJIJI.hasNext()) {
                    this.LIZIZ = (Map.Entry) itLJIJI.next();
                }
                this.LIZJ = false;
            }

            @Override // X.C131A
            public final void LIZ(int i, AbstractC19928912yF abstractC19928912yF) {
                while (true) {
                    Map.Entry<C19939112zt, Object> entry = this.LIZIZ;
                    if (entry != null && entry.getKey().getNumber() < i) {
                        C19939112zt key = this.LIZIZ.getKey();
                        if (this.LIZJ && key.LJJJIL() == AnonymousClass1332.MESSAGE && !key.LJJLJ()) {
                            if (this.LIZIZ instanceof C19926012xm) {
                                abstractC19928912yF.LJJIIZI(key.getNumber(), ((C19926012xm) this.LIZIZ).LL.getValue().LIZJ());
                            } else {
                                abstractC19928912yF.LJJIIZ(key.getNumber(), (InterfaceC19925612xi) this.LIZIZ.getValue());
                            }
                        } else {
                            C19928612yC.LJJII(key, this.LIZIZ.getValue(), abstractC19928912yF);
                        }
                        if (this.LIZ.hasNext()) {
                            this.LIZIZ = this.LIZ.next();
                        } else {
                            this.LIZIZ = null;
                        }
                    } else {
                        return;
                    }
                }
            }
        };
    }

    public final Iterator<C19935512zJ> extensionsIterator() {
        final C19928612yC<C19939112zt> c19928612yC = this.extensions;
        return new Iterator<C19935512zJ>(c19928612yC) { // from class: X.12z2
            public final Iterator<Map.Entry<C19939112zt, Object>> LL;

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.LL.hasNext();
            }

            /* JADX WARN: Type inference failed for: r1v0, types: [X.12zJ] */
            @Override // java.util.Iterator
            public final C19935512zJ next() {
                Map.Entry<C19939112zt, Object> next = this.LL.next();
                next.getKey();
                return new Object(next.getValue()) { // from class: X.12zJ
                    public final Object LIZ;

                    {
                        this.LIZ = obj;
                    }
                };
            }

            {
                this.LL = c19928612yC.LJIJI();
            }
        };
    }

    public AbstractC19933412yy() {
        this.extensions = new C19928612yC<>();
    }

    @Override // com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19916512wF
    public /* bridge */ /* synthetic */ InterfaceC19925612xi getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19916512wF
    public boolean isInitialized() {
        return super.isInitialized() && LJIILL();
    }

    @Override // com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19925612xi
    public /* bridge */ /* synthetic */ InterfaceC19928112y7 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.k0, X.AbstractC19932312yn, X.InterfaceC19925612xi
    public /* bridge */ /* synthetic */ InterfaceC19928112y7 toBuilder() {
        return toBuilder();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC19933412yy(AbstractC19933312yx<MessageT, ?> abstractC19933312yx) {
        C19928612yC<C19939112zt> c19928612yCLIZIZ;
        super(abstractC19933312yx);
        C19928712yD<C19939112zt> c19928712yD = abstractC19933312yx.LLILZIL;
        if (c19928712yD == null) {
            c19928612yCLIZIZ = C19928612yC.LIZLLL;
        } else {
            c19928612yCLIZIZ = c19928712yD.LIZIZ(true);
        }
        this.extensions = c19928612yCLIZIZ;
    }

    private void LJIJJ(C19939112zt c19939112zt) {
        if (c19939112zt.LLJIJIL == getDescriptorForType()) {
        } else {
            throw new IllegalArgumentException("FieldDescriptor does not match message type.");
        }
    }

    public final void LJIJJLI(C19939112zt c19939112zt) {
        if (c19939112zt.LLJIJIL == getDescriptorForType()) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Extension is for type \"");
        sbLIZ.append(c19939112zt.LLJIJIL.LLILZ);
        sbLIZ.append("\" which does not match message type \"");
        sbLIZ.append(getDescriptorForType().LLILZ);
        sbLIZ.append("\".");
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC19933912z3
    public final <T> T getExtension(AbstractC19925412xg<? extends MessageT, T> abstractC19925412xg) {
        T t;
        AbstractC19933212yw abstractC19933212ywCheckNotLite = k0.checkNotLite(abstractC19925412xg);
        C19939112zt c19939112ztLIZJ = abstractC19933212ywCheckNotLite.LIZJ();
        LJIJJLI(c19939112ztLIZJ);
        Object objLJIIIIZZ = this.extensions.LJIIIIZZ(c19939112ztLIZJ);
        if (objLJIIIIZZ == null) {
            if (c19939112ztLIZJ.LJJLJ()) {
                t = (T) C19888012re.LLILZIL;
            } else if (c19939112ztLIZJ.LJIJJ() == EnumC19937812zg.MESSAGE) {
                t = (T) abstractC19933212ywCheckNotLite.LIZLLL();
            } else {
                t = (T) abstractC19933212ywCheckNotLite.LIZIZ(c19939112ztLIZJ.LJIIZILJ());
            }
        } else {
            t = (T) abstractC19933212ywCheckNotLite.LIZIZ(objLJIIIIZZ);
        }
        Object obj = this.extensions.LIZ.get(c19939112ztLIZJ);
        if ((obj instanceof C19926112xn) && ((C19925912xl) obj).LJ) {
            this.LL = -1;
        }
        return t;
    }

    @Override // X.InterfaceC19933912z3
    public final <T> int getExtensionCount(AbstractC19925412xg<? extends MessageT, List<T>> abstractC19925412xg) {
        C19939112zt c19939112ztLIZJ = k0.checkNotLite(abstractC19925412xg).LIZJ();
        LJIJJLI(c19939112ztLIZJ);
        return this.extensions.LJIIL(c19939112ztLIZJ);
    }

    @Override // com.google.protobuf.k0, X.InterfaceC19933112yv
    public Object getField(C19939112zt c19939112zt) {
        if (c19939112zt.LJJIII()) {
            LJIJJ(c19939112zt);
            Object objLJIIIIZZ = this.extensions.LJIIIIZZ(c19939112zt);
            if (objLJIIIIZZ == null) {
                if (c19939112zt.LJJLJ()) {
                    return Collections.emptyList();
                }
                if (c19939112zt.LJIJJ() == EnumC19937812zg.MESSAGE) {
                    return C19932512yp.LJ(c19939112zt.LJIJJLI());
                }
                return c19939112zt.LJIIZILJ();
            }
            return objLJIIIIZZ;
        }
        return super.getField(c19939112zt);
    }

    @Override // com.google.protobuf.k0
    public int getRepeatedFieldCount(C19939112zt c19939112zt) {
        if (c19939112zt.LJJIII()) {
            LJIJJ(c19939112zt);
            return this.extensions.LJIIL(c19939112zt);
        }
        return super.getRepeatedFieldCount(c19939112zt);
    }

    @Override // X.InterfaceC19933912z3
    public final <T> boolean hasExtension(AbstractC19925412xg<? extends MessageT, T> abstractC19925412xg) {
        C19939112zt c19939112ztLIZJ = k0.checkNotLite(abstractC19925412xg).LIZJ();
        LJIJJLI(c19939112ztLIZJ);
        return this.extensions.LJIILJJIL(c19939112ztLIZJ);
    }

    @Override // com.google.protobuf.k0, X.InterfaceC19933112yv
    public boolean hasField(C19939112zt c19939112zt) {
        if (c19939112zt.LJJIII()) {
            LJIJJ(c19939112zt);
            return this.extensions.LJIILJJIL(c19939112zt);
        }
        return super.hasField(c19939112zt);
    }

    public Object getExtension(AbstractC19933212yw abstractC19933212yw) {
        return getExtension((AbstractC19925412xg) abstractC19933212yw);
    }

    public int getExtensionCount(AbstractC19933212yw abstractC19933212yw) {
        return getExtensionCount((AbstractC19925412xg) abstractC19933212yw);
    }

    public boolean hasExtension(AbstractC19933212yw abstractC19933212yw) {
        return hasExtension((AbstractC19925412xg) abstractC19933212yw);
    }

    public Object getExtension(C19933612z0 c19933612z0) {
        return getExtension((AbstractC19925412xg) c19933612z0);
    }

    public int getExtensionCount(C19933612z0 c19933612z0) {
        return getExtensionCount((AbstractC19925412xg) c19933612z0);
    }

    public boolean hasExtension(C19933612z0 c19933612z0) {
        return hasExtension((AbstractC19925412xg) c19933612z0);
    }

    @Override // X.InterfaceC19933912z3
    public final <T> T getExtension(AbstractC19925412xg<? extends MessageT, List<T>> abstractC19925412xg, int i) {
        AbstractC19933212yw abstractC19933212ywCheckNotLite = k0.checkNotLite(abstractC19925412xg);
        C19939112zt c19939112ztLIZJ = abstractC19933212ywCheckNotLite.LIZJ();
        LJIJJLI(c19939112ztLIZJ);
        return (T) abstractC19933212ywCheckNotLite.LJ(this.extensions.LJIIJJI(c19939112ztLIZJ, i));
    }

    @Override // com.google.protobuf.k0
    public Object getRepeatedField(C19939112zt c19939112zt, int i) {
        if (c19939112zt.LJJIII()) {
            LJIJJ(c19939112zt);
            return this.extensions.LJIIJJI(c19939112zt, i);
        }
        return super.getRepeatedField(c19939112zt, i);
    }

    public Object getExtension(AbstractC19933212yw abstractC19933212yw, int i) {
        return getExtension((AbstractC19925412xg) abstractC19933212yw, i);
    }

    public Object getExtension(C19933612z0 c19933612z0, int i) {
        return getExtension((AbstractC19925412xg) c19933612z0, i);
    }
}
