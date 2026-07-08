package X;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0kek, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1327760kek extends AbstractC1328840kgU<C1323050kX9<AbstractC1327750kej>, C1323050kX9<AbstractC1327750kej>> {
    public final InterfaceC1325690kbP LIZJ;
    public final String LIZLLL;
    public final InterfaceC1291910jiv LJ;
    public final InterfaceC1327930kf1 LJFF;
    public boolean LJI;
    public C1323050kX9<AbstractC1327750kej> LJII;
    public int LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public final /* synthetic */ C1327790ken LJIIJJI;

    public final void LJIIL() {
        boolean zLJIIZILJ;
        synchronized (this) {
            try {
                this.LJIIJ = false;
                zLJIIZILJ = LJIIZILJ();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (zLJIIZILJ) {
            this.LJIIJJI.LIZJ.execute(new C1327840kes(this, EnumC1331380kka.getIntPriorityValue(this.LJFF.getPriority())));
        }
    }

    public final boolean LJIILIIL() {
        synchronized (this) {
            try {
                if (this.LJI) {
                    return false;
                }
                C1323050kX9<AbstractC1327750kej> c1323050kX9 = this.LJII;
                this.LJII = null;
                this.LJI = true;
                C1323050kX9.LJII(c1323050kX9);
                return true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final synchronized boolean LJIIZILJ() {
        if (this.LJI || !this.LJIIIZ || this.LJIIJ || !C1323050kX9.LJIJJ(this.LJII)) {
            return false;
        }
        this.LJIIJ = true;
        return true;
    }

    @Override // X.AbstractC1328840kgU, X.AbstractC1327820keq
    public final void LJFF() {
        if (LJIILIIL()) {
            this.LIZIZ.LIZIZ();
        }
    }

    @Override // X.AbstractC1328840kgU, X.AbstractC1327820keq
    public final void LJI(Throwable th) {
        if (LJIILIIL()) {
            this.LIZIZ.onFailure(th);
        }
    }

    public final float LJIIJJI(Bitmap bitmap) {
        InterfaceC1327930kf1 interfaceC1327930kf1;
        View viewLJFF;
        if (bitmap == null || (interfaceC1327930kf1 = this.LJFF) == null || interfaceC1327930kf1.LJFF() == null) {
            return 1.0f;
        }
        int width = this.LJFF.LJFF().LJJIL;
        int height = this.LJFF.LJFF().LJJIZ;
        if (width <= 0 || height <= 0) {
            C1322050kVX c1322050kVX = this.LJFF.LJFF().LJJ;
            if (c1322050kVX != null && (viewLJFF = c1322050kVX.LJFF()) != null && viewLJFF.getWidth() > 0 && viewLJFF.getHeight() > 0) {
                width = viewLJFF.getWidth();
                height = viewLJFF.getHeight();
            }
            if (width <= 0 || height <= 0) {
                return 1.0f;
            }
        }
        float fMax = Math.max((width * 1.0f) / bitmap.getWidth(), (height * 1.0f) / bitmap.getHeight());
        if (fMax <= 1.0f) {
            return 1.0f;
        }
        if (fMax <= 1.1f) {
            return 1.1f;
        }
        if (fMax <= 1.2f) {
            return 1.2f;
        }
        if (fMax <= 1.3f) {
            return 1.3f;
        }
        if (fMax <= 1.4f) {
            return 1.4f;
        }
        if (fMax <= 1.5f) {
            return 1.5f;
        }
        return 2.0f;
    }

    @Override // X.AbstractC1327820keq
    public final void LJII(int i, Object obj) {
        C1323050kX9 c1323050kX9 = (C1323050kX9) obj;
        if (!C1323050kX9.LJIJJ(c1323050kX9)) {
            if (AbstractC1327820keq.LIZLLL(i)) {
                LJIILL(null, i);
                return;
            }
            return;
        }
        synchronized (this) {
            try {
                if (!this.LJI) {
                    C1323050kX9<AbstractC1327750kej> c1323050kX92 = this.LJII;
                    this.LJII = C1323050kX9.LJFF(c1323050kX9);
                    this.LJIIIIZZ = i;
                    this.LJIIIZ = true;
                    boolean zLJIIZILJ = LJIIZILJ();
                    C1323050kX9.LJII(c1323050kX92);
                    if (!zLJIIZILJ) {
                        return;
                    }
                    this.LJIIJJI.LIZJ.execute(new C1327840kes(this, EnumC1331380kka.getIntPriorityValue(this.LJFF.getPriority())));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void LJIILJJIL(C1323050kX9<AbstractC1327750kej> c1323050kX9, int i) throws Throwable {
        Map mapUnmodifiableMap;
        C1323050kX9<AbstractC1327750kej> c1323050kX9LJIILLIIL;
        C1322350kW1.LIZIZ(C1323050kX9.LJIJJ(c1323050kX9));
        if (!(c1323050kX9.get() instanceof C1325120kaU)) {
            LJIILL(c1323050kX9, i);
            return;
        }
        HashMap map = new HashMap();
        this.LIZJ.LJI(this.LIZLLL, "PostprocessorProducer");
        C1323050kX9<AbstractC1327750kej> c1323050kX92 = null;
        Map<String, String> mapUnmodifiableMap2 = null;
        c1323050kX92 = null;
        try {
            try {
                c1323050kX9LJIILLIIL = LJIILLIIL(c1323050kX9.get(), map);
            } catch (Throwable th) {
                th = th;
            }
            try {
                InterfaceC1325690kbP interfaceC1325690kbP = this.LIZJ;
                String str = this.LIZLLL;
                InterfaceC1291910jiv interfaceC1291910jiv = this.LJ;
                if (interfaceC1325690kbP.LJIIJ(str)) {
                    map.put("Postprocessor", interfaceC1291910jiv.getName());
                    mapUnmodifiableMap2 = Collections.unmodifiableMap(map);
                }
                interfaceC1325690kbP.LIZIZ(str, "PostprocessorProducer", mapUnmodifiableMap2);
                LJIILL(c1323050kX9LJIILLIIL, i);
                C1323050kX9.LJII(c1323050kX9LJIILLIIL);
            } catch (Throwable th2) {
                th = th2;
                c1323050kX92 = c1323050kX9LJIILLIIL;
                TryCatchGuardChecker.doCheck(th);
                C1323050kX9.LJII(c1323050kX92);
                throw th;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            InterfaceC1325690kbP interfaceC1325690kbP2 = this.LIZJ;
            String str2 = this.LIZLLL;
            InterfaceC1291910jiv interfaceC1291910jiv2 = this.LJ;
            try {
                if (!interfaceC1325690kbP2.LJIIJ(str2)) {
                    mapUnmodifiableMap = null;
                } else {
                    map.put("Postprocessor", interfaceC1291910jiv2.getName());
                    mapUnmodifiableMap = Collections.unmodifiableMap(map);
                }
                interfaceC1325690kbP2.LIZ(str2, e, "PostprocessorProducer", mapUnmodifiableMap);
                if (LJIILIIL()) {
                    this.LIZIZ.onFailure(e);
                }
            } catch (Throwable th3) {
                th = th3;
                TryCatchGuardChecker.doCheck(th);
                C1323050kX9.LJII(c1323050kX92);
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void LJIILL(C1323050kX9<AbstractC1327750kej> c1323050kX9, int i) {
        boolean z;
        if (!AbstractC1327820keq.LIZLLL(i)) {
            synchronized (this) {
                z = this.LJI;
            }
            if (z) {
                return;
            }
        } else if (!LJIILIIL()) {
            return;
        }
        this.LIZIZ.LIZJ(i, c1323050kX9);
    }

    public final C1323050kX9<AbstractC1327750kej> LJIILLIIL(AbstractC1327750kej abstractC1327750kej, Map<String, String> map) {
        C1323050kX9<Bitmap> c1323050kX9Process;
        int i;
        C1325120kaU c1325120kaU = (C1325120kaU) abstractC1327750kej;
        Bitmap underlyingBitmap = c1325120kaU.getUnderlyingBitmap();
        try {
            InterfaceC1291910jiv interfaceC1291910jiv = this.LJ;
            if (interfaceC1291910jiv instanceof AbstractC1291220jho) {
                if (interfaceC1291910jiv != null && "SRPostProcessor".equalsIgnoreCase(interfaceC1291910jiv.getName())) {
                    float fLJIIJJI = LJIIJJI(underlyingBitmap);
                    Map<String, String> map2 = c1325120kaU.mExtraMap;
                    if (map2 != null) {
                        ((HashMap) map).putAll(map2);
                    }
                    ((HashMap) map).put("sr_stretch", String.valueOf(fLJIIJJI));
                    c1323050kX9Process = ((AbstractC1291220jho) this.LJ).process(underlyingBitmap, this.LJIIJJI.LIZIZ, map);
                } else {
                    c1323050kX9Process = ((AbstractC1291220jho) this.LJ).process(underlyingBitmap, this.LJIIJJI.LIZIZ, map);
                }
            } else {
                c1323050kX9Process = interfaceC1291910jiv.process(underlyingBitmap, this.LJIIJJI.LIZIZ);
            }
            int i2 = c1325120kaU.mRotationAngle;
            int i3 = c1325120kaU.mExifOrientation;
            Rect regionToDecode = c1325120kaU.getRegionToDecode();
            Rect smartCrop = c1325120kaU.getSmartCrop();
            int sampleSize = c1325120kaU.getSampleSize();
            if (abstractC1327750kej.isRequestInternet) {
                i = 0;
            } else if (abstractC1327750kej.isHitDiskCache) {
                i = 2;
            } else if (abstractC1327750kej.isHitEncodeMemoryCache) {
                i = 1;
            } else if (abstractC1327750kej.isHitBitmapMemoryCache) {
                i = 3;
            } else {
                i = -1;
            }
            try {
                C1323050kX9<AbstractC1327750kej> c1323050kX9LJIJJLI = C1323050kX9.LJIJJLI(new C1325120kaU(c1323050kX9Process, abstractC1327750kej.getQualityInfo(), i2, i3, regionToDecode, smartCrop, sampleSize, abstractC1327750kej.getImageFormat(), i, map));
                C1323050kX9.LJII(c1323050kX9Process);
                return c1323050kX9LJIJJLI;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1323050kX9.LJII(c1323050kX9Process);
                throw th;
            }
        } catch (OutOfMemoryError e) {
            TryCatchGuardChecker.doCheck(e);
            C1303660k1s c1303660k1s = new C1303660k1s(e);
            c1303660k1s.context = this.LJFF.LJFF();
            throw c1303660k1s;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1327760kek(C1327790ken c1327790ken, InterfaceC1328020kfA<C1323050kX9<AbstractC1327750kej>> interfaceC1328020kfA, InterfaceC1325690kbP interfaceC1325690kbP, String str, InterfaceC1291910jiv interfaceC1291910jiv, InterfaceC1327930kf1 interfaceC1327930kf1) {
        super(interfaceC1328020kfA);
        this.LJIIJJI = c1327790ken;
        this.LIZJ = interfaceC1325690kbP;
        this.LIZLLL = str;
        this.LJ = interfaceC1291910jiv;
        this.LJFF = interfaceC1327930kf1;
        interfaceC1327930kf1.LJ(new C1330860kjk() { // from class: X.0kf2
            @Override // X.InterfaceC1330340kiu
            public final void LIZJ() {
                C1327760kek c1327760kek = this.LIZ;
                if (c1327760kek.LJIILIIL()) {
                    c1327760kek.LIZIZ.LIZIZ();
                }
            }
        });
    }
}
