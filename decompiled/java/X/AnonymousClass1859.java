package X;

import android.util.SparseArray;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.AtmosphereTag;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.settings.PinCardRefactorSettings;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.1859, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class AnonymousClass1859 extends C185J<ViewGroup, List<? extends AtmosphereTag>> implements C185Z {
    public final boolean LIZLLL;
    public AtmosphereTag LJ;
    public int LJFF;
    public InterfaceC212331187l LJI;
    public final C19994313Kz<C187K> LJII;
    public final SparseArray<C187K> LJIIIIZZ;
    public boolean LJIIIZ;
    public float LJIIJ;

    @Override // X.C185Z
    public final Map<String, String> LIZ() {
        return null;
    }

    @Override // X.C185Z
    public final Map<String, String> LIZIZ() {
        return LJIIJ(true);
    }

    @Override // X.C185Z
    public final void LIZJ() {
    }

    public final void LJIIL() {
        SparseArray<C187K> sparseArray = this.LJIIIIZZ;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            sparseArray.keyAt(i);
            sparseArray.valueAt(i).LJIJ(false);
        }
        this.LJ = null;
    }

    public AnonymousClass1859(ViewGroup viewGroup) {
        super(viewGroup);
        this.LIZLLL = true;
        this.LJI = new C19343610m2();
        this.LJII = new C19994313Kz<>(new LinkedList());
        this.LJIIIIZZ = new SparseArray<>();
        this.LJIIJ = C418440Gaw.LIZIZ(82);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map<java.lang.String, java.lang.String> LJIIJ(boolean r11) {
        /*
            r10 = this;
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            r6.<init>()
            com.ss.android.ugc.aweme.ecommercelive.common.infra.data.AtmosphereTag r0 = r10.LJ
            if (r0 == 0) goto L69
            r9 = 0
            int r0 = r0.tagType
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r5 = 0
            r7 = 0
            if (r3 == 0) goto Lbf
            int r1 = r3.intValue()
            r0 = 4
            if (r1 != r0) goto L6d
            java.lang.String r1 = "xxx_sold"
        L1e:
            java.lang.String r0 = "label_type"
            r6.put(r0, r1)
            if (r9 != 0) goto L2f
            com.ss.android.ugc.aweme.ecommercelive.common.infra.data.AtmosphereTag r0 = r10.LJ
            if (r0 == 0) goto L6a
            long r0 = r0.count
        L2b:
            java.lang.Long r9 = java.lang.Long.valueOf(r0)
        L2f:
            java.lang.String r1 = r9.toString()
            java.lang.String r0 = "label_number"
            r6.put(r0, r1)
            if (r11 == 0) goto L45
            int r0 = r10.LJFF
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "label_order"
            r6.put(r0, r1)
        L45:
            com.ss.android.ugc.aweme.ecommercelive.common.infra.data.AtmosphereTag r0 = r10.LJ
            if (r0 == 0) goto L4b
            int r5 = r0.LIZJ
        L4b:
            java.lang.String r1 = java.lang.String.valueOf(r5)
            java.lang.String r0 = "creator_limit_type"
            r6.put(r0, r1)
            com.ss.android.ugc.aweme.ecommercelive.common.infra.data.AtmosphereTag r0 = r10.LJ
            if (r0 == 0) goto L60
            java.lang.Long r0 = r0.LJFF
            if (r0 == 0) goto L60
            long r7 = r0.longValue()
        L60:
            java.lang.String r1 = java.lang.String.valueOf(r7)
            java.lang.String r0 = "activity_id"
            r6.put(r0, r1)
        L69:
            return r6
        L6a:
            r0 = 0
            goto L2b
        L6d:
            r2 = 1
            if (r3 == 0) goto Lbf
            int r0 = r3.intValue()
            if (r0 != r2) goto L79
            java.lang.String r1 = "hot"
            goto L1e
        L79:
            int r1 = r3.intValue()
            r0 = 2
            if (r1 != r0) goto L83
            java.lang.String r1 = "onlyleft"
            goto L1e
        L83:
            int r1 = r3.intValue()
            r0 = 3
            if (r1 != r0) goto L8d
            java.lang.String r1 = "top_sales"
            goto L1e
        L8d:
            int r1 = r3.intValue()
            r0 = 5
            if (r1 != r0) goto Lbf
            r0 = -1
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
            com.ss.android.ugc.aweme.ecommercelive.common.infra.data.AtmosphereTag r0 = r10.LJ
            if (r0 == 0) goto Lab
            com.ss.android.ugc.aweme.ecommercelive.common.infra.data.FlashSaleAtmosphereStock r0 = r0.LIZLLL
            if (r0 == 0) goto Lab
            boolean r0 = r0.LIZ()
            if (r0 != r2) goto Lab
            java.lang.String r1 = "live_flash_sale_only_left_tag"
            goto L1e
        Lab:
            com.ss.android.ugc.aweme.ecommercelive.common.infra.data.AtmosphereTag r0 = r10.LJ
            if (r0 == 0) goto Lbb
            long r3 = r0.count
            long r1 = r0.LIZIZ
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto Lbb
            java.lang.String r1 = "live_flash_sale_tag"
            goto L1e
        Lbb:
            java.lang.String r1 = "live_flash_sale"
            goto L1e
        Lbf:
            java.lang.String r1 = ""
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1859.LJIIJ(boolean):java.util.Map");
    }

    public final C187K LJIIJJI(int i) {
        C187K c212328187i;
        C187K c212327187h;
        C187K c212325187f;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return null;
                        }
                        C187T c187t = new C187T(i, (ViewGroup) this.LIZ);
                        this.LJIIIIZZ.put(5, c187t);
                        this.LJII.add(c187t);
                        c187t.LJI = this.LJI;
                        return c187t;
                    }
                    C212329187j c212329187j = new C212329187j(i, (ViewGroup) this.LIZ);
                    c212329187j.LJFF = this.LJIIJ;
                    this.LJIIIIZZ.put(4, c212329187j);
                    this.LJII.add(c212329187j);
                    c212329187j.LJI = this.LJI;
                    return c212329187j;
                }
                if (this.LIZLLL && 1 == ((Number) C0AA1.LIZ.getValue()).intValue()) {
                    c212325187f = new C212324187e(i, (ViewGroup) this.LIZ);
                } else {
                    c212325187f = new C212325187f(i, (ViewGroup) this.LIZ);
                }
                c212325187f.LJFF = this.LJIIJ;
                this.LJIIIIZZ.put(3, c212325187f);
                this.LJII.add(c212325187f);
                c212325187f.LJI = this.LJI;
                return c212325187f;
            }
            if (this.LIZLLL && 1 == ((Number) C0AA1.LIZ.getValue()).intValue()) {
                c212327187h = new C212326187g(i, (ViewGroup) this.LIZ);
            } else {
                c212327187h = new C212327187h(i, (ViewGroup) this.LIZ);
            }
            c212327187h.LJFF = this.LJIIJ;
            this.LJIIIIZZ.put(2, c212327187h);
            this.LJII.add(c212327187h);
            c212327187h.LJI = this.LJI;
            return c212327187h;
        }
        if (this.LIZLLL && 1 == ((Number) C0AA1.LIZ.getValue()).intValue()) {
            c212328187i = new C212330187k(i, (ViewGroup) this.LIZ);
        } else {
            c212328187i = new C212328187i(i, (ViewGroup) this.LIZ);
        }
        c212328187i.LJFF = this.LJIIJ;
        this.LJIIIIZZ.put(1, c212328187i);
        this.LJII.add(c212328187i);
        c212328187i.LJI = this.LJI;
        return c212328187i;
    }

    public final void LJIILJJIL(List<? extends AtmosphereTag> list) {
        C187K c187kLJIIJJI;
        if (!PinCardRefactorSettings.LIZ().atmosphereEnable) {
            return;
        }
        LJIIL();
        this.LJII.clear();
        this.LJIIIIZZ.clear();
        for (AtmosphereTag atmosphereTag : list) {
            if (this.LJIIIIZZ.get(atmosphereTag.tagType) == null && (c187kLJIIJJI = LJIIJJI(atmosphereTag.tagType)) != null) {
                c187kLJIIJJI.LJ = atmosphereTag;
            }
        }
        this.LJFF = 0;
        this.LJ = null;
        this.LJIIIZ = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x018c A[PHI: r2
      0x018c: PHI (r2v8 X.187K) = (r2v20 X.187K), (r2v21 X.187K) binds: [B:14:0x0032, B:16:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0109 A[EDGE_INSN: B:81:0x0109->B:50:0x0109 BREAK  A[LOOP:0: B:35:0x0074->B:88:0x0074], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C212269185b LJIILIIL(X.AnonymousClass1859 r14, int r15, com.ss.android.ugc.aweme.ecommercelive.common.infra.data.AtmosphereTag r16, boolean r17, long r18, boolean r20, java.util.List r21, int r22) {
        /*
            Method dump skipped, instruction units count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1859.LJIILIIL(X.1859, int, com.ss.android.ugc.aweme.ecommercelive.common.infra.data.AtmosphereTag, boolean, long, boolean, java.util.List, int):X.185b");
    }
}
