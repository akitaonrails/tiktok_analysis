package X;

import X.AbstractC19933512yz;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: X.12yz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC19933512yz<BuilderT extends AbstractC19933512yz<BuilderT>> extends AbstractC19931812yi<BuilderT> {
    public final InterfaceC19935412zI LL;
    public AbstractC19933512yz<BuilderT>.a LLILLJJLI;
    public boolean LLILLL;
    public InterfaceC19916512wF LLILZ = C19927612y2.LLILLJJLI;

    /* JADX INFO: renamed from: X.12yz$a */
    public class a implements InterfaceC19935412zI {
        @Override // X.InterfaceC19935412zI
        public final void LIZ() {
            AbstractC19933512yz.this.LJIILLIIL();
        }

        public a() {
        }
    }

    public abstract C19935812zM LJIIL();

    @Override // X.AbstractC19931812yi
    public final C19927512y1 LIZIZ() {
        InterfaceC19916512wF interfaceC19916512wF = this.LLILZ;
        if (interfaceC19916512wF instanceof C19927612y2) {
            C19927612y2 c19927612y2 = (C19927612y2) interfaceC19916512wF;
            c19927612y2.getClass();
            C19927512y1 c19927512y1 = new C19927512y1();
            c19927512y1.LJFF(c19927612y2);
            this.LLILZ = c19927512y1;
        }
        LJIILLIIL();
        return (C19927512y1) this.LLILZ;
    }

    public final Map<C19939112zt, Object> LJIIJ() {
        TreeMap treeMap = new TreeMap();
        List<C19939112zt> listLJIJJ = LJIIL().LIZ.LJIJJ();
        int i = 0;
        while (i < listLJIJJ.size()) {
            C19939112zt c19939112ztLIZLLL = (C19939112zt) ListProtector.get(listLJIJJ, i);
            C19939212zu c19939212zu = c19939112ztLIZLLL.LLJILJIL;
            if (c19939212zu != null) {
                i += c19939212zu.LLILZLL - 1;
                if (LJIIL().LIZJ(c19939212zu).LIZ(this)) {
                    c19939112ztLIZLLL = LJIIL().LIZJ(c19939212zu).LIZLLL(this);
                    treeMap.put(c19939112ztLIZLLL, getField(c19939112ztLIZLLL));
                }
            } else if (c19939112ztLIZLLL.LJJLJ()) {
                List list = (List) getField(c19939112ztLIZLLL);
                if (!list.isEmpty()) {
                    treeMap.put(c19939112ztLIZLLL, list);
                }
            } else if (hasField(c19939112ztLIZLLL)) {
                treeMap.put(c19939112ztLIZLLL, getField(c19939112ztLIZLLL));
            }
            i++;
        }
        return treeMap;
    }

    public final a LJIIJJI() {
        if (this.LLILLJJLI == null) {
            this.LLILLJJLI = new a();
        }
        return this.LLILLJJLI;
    }

    public final void LJIILL() {
        if (this.LL != null) {
            this.LLILLL = true;
        }
    }

    public final void LJIILLIIL() {
        InterfaceC19935412zI interfaceC19935412zI;
        if (!this.LLILLL || (interfaceC19935412zI = this.LL) == null) {
            return;
        }
        interfaceC19935412zI.LIZ();
        this.LLILLL = false;
    }

    @Override // X.InterfaceC19933112yv
    public final C19927612y2 getUnknownFields() {
        InterfaceC19916512wF interfaceC19916512wF = this.LLILZ;
        return interfaceC19916512wF instanceof C19927612y2 ? (C19927612y2) interfaceC19916512wF : ((C19927512y1) interfaceC19916512wF).build();
    }

    public AbstractC19933512yz() {
    }

    @Override // X.AbstractC19931812yi, X.AbstractC19924512xX
    /* JADX INFO: renamed from: LJIIIZ, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final BuilderT mo79clone() {
        BuilderT buildert = (BuilderT) getDefaultInstanceForType().newBuilderForType();
        buildert.LJ(buildPartial());
        return buildert;
    }

    public Map<C19939112zt, Object> getAllFields() {
        return Collections.unmodifiableMap(LJIIJ());
    }

    @Override // X.InterfaceC19931912yj, X.InterfaceC19933112yv
    public AnonymousClass1301 getDescriptorForType() {
        return LJIIL().LIZ;
    }

    @Override // X.InterfaceC19916512wF
    public boolean isInitialized() {
        for (C19939112zt c19939112zt : getDescriptorForType().LJIJJ()) {
            if (c19939112zt.LJJIJ() && !hasField(c19939112zt)) {
                return false;
            }
            if (c19939112zt.LJIJJ() == EnumC19937812zg.MESSAGE) {
                if (c19939112zt.LJJLJ()) {
                    Iterator it2 = ((List) getField(c19939112zt)).iterator();
                    while (it2.hasNext()) {
                        if (!((InterfaceC19916512wF) it2.next()).isInitialized()) {
                            return false;
                        }
                    }
                } else if (hasField(c19939112zt) && !((InterfaceC19916512wF) getField(c19939112zt)).isInitialized()) {
                    return false;
                }
            }
        }
        return true;
    }

    public AbstractC19933512yz(InterfaceC19935412zI interfaceC19935412zI) {
        this.LL = interfaceC19935412zI;
    }

    @Override // X.AbstractC19931812yi
    public final void LJII(C19927512y1 c19927512y1) {
        this.LLILZ = c19927512y1;
        LJIILLIIL();
    }

    @Override // X.AbstractC19931812yi
    /* JADX INFO: renamed from: LJIILIIL, reason: merged with bridge method [inline-methods] */
    public final void LJFF(C19927612y2 c19927612y2) {
        C19927612y2 c19927612y22 = C19927612y2.LLILLJJLI;
        if (c19927612y22.equals(c19927612y2)) {
            return;
        }
        if (c19927612y22.equals(this.LLILZ)) {
            this.LLILZ = c19927612y2;
            LJIILLIIL();
        } else {
            LIZIZ().LJFF(c19927612y2);
            LJIILLIIL();
        }
    }

    @Override // X.InterfaceC19931912yj
    public final InterfaceC19931912yj LJJL(C19927612y2 c19927612y2) {
        this.LLILZ = c19927612y2;
        LJIILLIIL();
        return this;
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19931912yj
    public InterfaceC19931912yj LJJZ(C19939112zt c19939112zt) {
        return LJIIL().LIZIZ(c19939112zt).LJII(this);
    }

    public InterfaceC19931912yj LLFFF(C19939112zt c19939112zt) {
        return LJIIL().LIZIZ(c19939112zt).LJI();
    }

    public Object getField(C19939112zt c19939112zt) {
        Object objLIZLLL = LJIIL().LIZIZ(c19939112zt).LIZLLL(this);
        if (c19939112zt.LJJLJ()) {
            return Collections.unmodifiableList((List) objLIZLLL);
        }
        return objLIZLLL;
    }

    public boolean hasField(C19939112zt c19939112zt) {
        return LJIIL().LIZIZ(c19939112zt).LIZ(this);
    }

    public BuilderT LJIIIIZZ(C19939112zt c19939112zt, Object obj) {
        LJIIL().LIZIZ(c19939112zt).LJIIJ(this, obj);
        return this;
    }

    public final void LJIILJJIL(int i, int i2) {
        LIZIZ().LJI(i, i2);
    }

    public /* bridge */ /* synthetic */ InterfaceC19931912yj LJIIZILJ(C19939112zt c19939112zt, Object obj) {
        LJIJI(c19939112zt, obj);
        return this;
    }

    public BuilderT LJIJI(C19939112zt c19939112zt, Object obj) {
        LJIIL().LIZIZ(c19939112zt).LJIIIIZZ(this, obj);
        return this;
    }

    public /* bridge */ /* synthetic */ InterfaceC19931912yj LJJ(C19939112zt c19939112zt, Object obj) {
        LJIIIIZZ(c19939112zt, obj);
        return this;
    }

    public boolean LJIJ(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp, int i) {
        abstractC19927312xz.getClass();
        return LIZIZ().LIZLLL(i, abstractC19927312xz);
    }
}
