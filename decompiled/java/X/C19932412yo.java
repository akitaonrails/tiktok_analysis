package X;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.12yo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19932412yo extends AbstractC19931812yi<C19932412yo> {
    public final AnonymousClass1301 LL;
    public final C19928712yD<C19939112zt> LLILLJJLI;
    public final C19939112zt[] LLILLL;
    public C19927612y2 LLILZ;

    public /* synthetic */ C19932412yo() {
        throw null;
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19928112y7
    /* JADX INFO: renamed from: LJIIIZ, reason: merged with bridge method [inline-methods] */
    public final C19932512yp buildPartial() {
        if (this.LL.LJIJJLI().getMapEntry()) {
            for (C19939112zt c19939112zt : this.LL.LJIJJ()) {
                if (c19939112zt.LJJIIZ() && !this.LLILLJJLI.LJI(c19939112zt)) {
                    if (c19939112zt.LJIJJ() == EnumC19937812zg.MESSAGE) {
                        this.LLILLJJLI.LJIILIIL(c19939112zt, C19932512yp.LJ(c19939112zt.LJIJJLI()));
                    } else {
                        this.LLILLJJLI.LJIILIIL(c19939112zt, c19939112zt.LJIIZILJ());
                    }
                }
            }
        }
        AnonymousClass1301 anonymousClass1301 = this.LL;
        C19928612yC<T> c19928612yCLIZIZ = this.LLILLJJLI.LIZIZ(true);
        C19939112zt[] c19939112ztArr = this.LLILLL;
        return new C19932512yp(anonymousClass1301, c19928612yCLIZIZ, (C19939112zt[]) Arrays.copyOf(c19939112ztArr, c19939112ztArr.length), this.LLILZ);
    }

    @Override // X.AbstractC19931812yi, X.AbstractC19924512xX
    /* JADX INFO: renamed from: LJIIJ, reason: merged with bridge method [inline-methods] */
    public final C19932412yo mo79clone() {
        C19932412yo c19932412yo = new C19932412yo(this.LL);
        c19932412yo.LLILLJJLI.LJIIIIZZ(this.LLILLJJLI.LIZIZ(false));
        C19927612y2 c19927612y2 = this.LLILZ;
        C19927612y2 c19927612y22 = c19932412yo.LLILZ;
        C19927612y2 c19927612y23 = C19927612y2.LLILLJJLI;
        C19927512y1 c19927512y1 = new C19927512y1();
        c19927512y1.LJFF(c19927612y22);
        c19927512y1.LJFF(c19927612y2);
        c19932412yo.LLILZ = c19927512y1.build();
        C19939112zt[] c19939112ztArr = this.LLILLL;
        System.arraycopy(c19939112ztArr, 0, c19932412yo.LLILLL, 0, c19939112ztArr.length);
        return c19932412yo;
    }

    @Override // X.InterfaceC19933112yv
    public final Map<C19939112zt, Object> getAllFields() {
        return this.LLILLJJLI.LJ();
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19916512wF
    public final InterfaceC19925612xi getDefaultInstanceForType() {
        return C19932512yp.LJ(this.LL);
    }

    @Override // X.InterfaceC19916512wF
    public final boolean isInitialized() {
        for (C19939112zt c19939112zt : this.LL.LJIJJ()) {
            if (c19939112zt.LJJIJ() && !this.LLILLJJLI.LJI(c19939112zt)) {
                return false;
            }
        }
        return this.LLILLJJLI.LJII();
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19928112y7
    /* JADX INFO: renamed from: LJIIIIZZ, reason: merged with bridge method [inline-methods] */
    public final C19932512yp build() {
        if (isInitialized()) {
            return buildPartial();
        }
        AnonymousClass1301 anonymousClass1301 = this.LL;
        C19928612yC<T> c19928612yCLIZIZ = this.LLILLJJLI.LIZIZ(false);
        C19939112zt[] c19939112ztArr = this.LLILLL;
        throw AbstractC19931812yi.LJI(new C19932512yp(anonymousClass1301, c19928612yCLIZIZ, (C19939112zt[]) Arrays.copyOf(c19939112ztArr, c19939112ztArr.length), this.LLILZ));
    }

    @Override // X.InterfaceC19931912yj, X.InterfaceC19933112yv
    public final AnonymousClass1301 getDescriptorForType() {
        return this.LL;
    }

    @Override // X.InterfaceC19933112yv
    public final C19927612y2 getUnknownFields() {
        return this.LLILZ;
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19916512wF
    public final InterfaceC19930912yZ getDefaultInstanceForType() {
        return C19932512yp.LJ(this.LL);
    }

    public C19932412yo(AnonymousClass1301 anonymousClass1301) {
        this.LL = anonymousClass1301;
        C19928612yC<?> c19928612yC = C19928612yC.LIZLLL;
        this.LLILLJJLI = new C19928712yD<>(0);
        this.LLILZ = C19927612y2.LLILLJJLI;
        this.LLILLL = new C19939112zt[anonymousClass1301.LLILLJJLI.getOneofDeclCount()];
    }

    @Override // X.AbstractC19931812yi
    public final /* bridge */ /* synthetic */ AbstractC19931812yi LJ(InterfaceC19930912yZ interfaceC19930912yZ) {
        LJIIJJI(interfaceC19930912yZ);
        return this;
    }

    @Override // X.AbstractC19931812yi
    public final void LJFF(C19927612y2 c19927612y2) {
        C19927612y2 c19927612y22 = this.LLILZ;
        C19927612y2 c19927612y23 = C19927612y2.LLILLJJLI;
        C19927512y1 c19927512y1 = new C19927512y1();
        c19927512y1.LJFF(c19927612y22);
        c19927512y1.LJFF(c19927612y2);
        this.LLILZ = c19927512y1.build();
    }

    public final C19932412yo LJIIJJI(InterfaceC19930912yZ interfaceC19930912yZ) {
        if (interfaceC19930912yZ instanceof C19932512yp) {
            C19932512yp c19932512yp = (C19932512yp) interfaceC19930912yZ;
            if (c19932512yp.LLILLJJLI == this.LL) {
                this.LLILLJJLI.LJIIIIZZ(c19932512yp.LLILLL);
                C19927612y2 c19927612y2 = c19932512yp.LLILZIL;
                C19927612y2 c19927612y22 = this.LLILZ;
                C19927612y2 c19927612y23 = C19927612y2.LLILLJJLI;
                C19927512y1 c19927512y1 = new C19927512y1();
                c19927512y1.LJFF(c19927612y22);
                c19927512y1.LJFF(c19927612y2);
                this.LLILZ = c19927512y1.build();
                int i = 0;
                while (true) {
                    C19939112zt[] c19939112ztArr = this.LLILLL;
                    if (i < c19939112ztArr.length) {
                        C19939112zt c19939112zt = c19939112ztArr[i];
                        if (c19939112zt == null) {
                            c19939112ztArr[i] = c19932512yp.LLILZ[i];
                        } else {
                            C19939112zt c19939112zt2 = c19932512yp.LLILZ[i];
                            if (c19939112zt2 != null && c19939112zt != c19939112zt2) {
                                this.LLILLJJLI.LIZJ(c19939112zt);
                                this.LLILLL[i] = c19932512yp.LLILZ[i];
                            }
                        }
                        i++;
                    } else {
                        return this;
                    }
                }
            } else {
                throw new IllegalArgumentException("mergeFrom(Message) can only merge messages of the same type.");
            }
        } else {
            super.LJ(interfaceC19930912yZ);
            return this;
        }
    }

    public final void LJIIL(C19939112zt c19939112zt) {
        if (c19939112zt.LLJIJIL == this.LL) {
        } else {
            throw new IllegalArgumentException("FieldDescriptor does not match message type.");
        }
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19931912yj
    public final /* bridge */ /* synthetic */ InterfaceC19931912yj LJJIL(InterfaceC19930912yZ interfaceC19930912yZ) {
        LJIIJJI(interfaceC19930912yZ);
        return this;
    }

    @Override // X.InterfaceC19931912yj
    public final InterfaceC19931912yj LJJL(C19927612y2 c19927612y2) {
        this.LLILZ = c19927612y2;
        return this;
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19931912yj
    public final InterfaceC19931912yj LJJZ(C19939112zt c19939112zt) {
        InterfaceC19931912yj builder;
        LJIIL(c19939112zt);
        if (!c19939112zt.LJJIIJ()) {
            if (c19939112zt.LJIJJ() == EnumC19937812zg.MESSAGE) {
                Object objLJFF = this.LLILLJJLI.LJFF(c19939112zt);
                if (objLJFF == null) {
                    builder = new C19932412yo(c19939112zt.LJIJJLI());
                } else if (objLJFF instanceof InterfaceC19931912yj) {
                    builder = (InterfaceC19931912yj) objLJFF;
                } else {
                    if (objLJFF instanceof C19926112xn) {
                        objLJFF = ((C19926112xn) objLJFF).LIZLLL();
                    }
                    if (objLJFF instanceof InterfaceC19930912yZ) {
                        builder = ((InterfaceC19930912yZ) objLJFF).toBuilder();
                    } else {
                        throw new IllegalArgumentException(C786410Ut5.j4("Cannot convert %s to Message.Builder", new Object[]{objLJFF.getClass()}));
                    }
                }
                this.LLILLJJLI.LJIILIIL(c19939112zt, builder);
                return builder;
            }
            throw new UnsupportedOperationException("getFieldBuilder() called on a non-Message type.");
        }
        throw new UnsupportedOperationException("Nested builder not supported for map fields.");
    }

    @Override // X.InterfaceC19931912yj
    public final InterfaceC19931912yj LLFFF(C19939112zt c19939112zt) {
        LJIIL(c19939112zt);
        if (c19939112zt.LJIJJ() == EnumC19937812zg.MESSAGE) {
            return new C19932412yo(c19939112zt.LJIJJLI());
        }
        throw new IllegalArgumentException("newBuilderForField is only valid for fields with message type.");
    }

    @Override // X.InterfaceC19933112yv
    public final Object getField(C19939112zt c19939112zt) {
        LJIIL(c19939112zt);
        Object objLJIIJJI = C19928712yD.LJIIJJI(c19939112zt, this.LLILLJJLI.LJFF(c19939112zt), true);
        if (objLJIIJJI == null) {
            if (c19939112zt.LJJLJ()) {
                return Collections.emptyList();
            }
            if (c19939112zt.LJIJJ() == EnumC19937812zg.MESSAGE) {
                return C19932512yp.LJ(c19939112zt.LJIJJLI());
            }
            return c19939112zt.LJIIZILJ();
        }
        return objLJIIJJI;
    }

    @Override // X.InterfaceC19933112yv
    public final boolean hasField(C19939112zt c19939112zt) {
        LJIIL(c19939112zt);
        return this.LLILLJJLI.LJI(c19939112zt);
    }

    public static void LJIILIIL(C19939112zt c19939112zt, Object obj) {
        int i = C19934112z5.LIZ[c19939112zt.LJJI().ordinal()];
        if (i != 1) {
            if (i == 2 && (obj instanceof InterfaceC19931912yj)) {
                throw new IllegalArgumentException(C786410Ut5.j4("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(c19939112zt.getNumber()), c19939112zt.LJJIJL().getJavaType(), obj.getClass().getName()}));
            }
        } else {
            obj.getClass();
            if (!(obj instanceof C199423130z)) {
                throw new IllegalArgumentException("DynamicMessage should use EnumValueDescriptor to set Enum Value.");
            }
        }
    }

    @Override // X.InterfaceC19931912yj
    public final InterfaceC19931912yj LJIIZILJ(C19939112zt c19939112zt, Object obj) {
        LJIIL(c19939112zt);
        if (c19939112zt.LJJLJ()) {
            Iterator it2 = ((List) obj).iterator();
            while (it2.hasNext()) {
                LJIILIIL(c19939112zt, it2.next());
            }
        } else {
            LJIILIIL(c19939112zt, obj);
        }
        C19939212zu c19939212zu = c19939112zt.LLJILJIL;
        if (c19939212zu != null) {
            int i = c19939212zu.LLILLJJLI;
            C19939112zt c19939112zt2 = this.LLILLL[i];
            if (c19939112zt2 != null && c19939112zt2 != c19939112zt) {
                this.LLILLJJLI.LIZJ(c19939112zt2);
            }
            this.LLILLL[i] = c19939112zt;
        } else if (!c19939112zt.LJJII() && (!c19939112zt.LJJLJ() ? obj.equals(c19939112zt.LJIIZILJ()) : ((List) obj).isEmpty())) {
            this.LLILLJJLI.LIZJ(c19939112zt);
            return this;
        }
        this.LLILLJJLI.LJIILIIL(c19939112zt, obj);
        return this;
    }

    @Override // X.InterfaceC19931912yj
    public final InterfaceC19931912yj LJJ(C19939112zt c19939112zt, Object obj) {
        LJIIL(c19939112zt);
        LJIILIIL(c19939112zt, obj);
        this.LLILLJJLI.LIZ(c19939112zt, obj);
        return this;
    }
}
