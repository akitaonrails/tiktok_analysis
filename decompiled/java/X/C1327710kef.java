package X;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0kef, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1327710kef implements InterfaceC1327390ke9<C1328480kfu> {
    public final C1326950kdR LIZ;
    public final C1326950kdR LIZIZ;
    public final Map<String, C1326950kdR> LIZJ;
    public final InterfaceC1325590kbF LIZLLL;
    public final InterfaceC1327390ke9<C1328480kfu> LJ;
    public final InterfaceC1327440keE LJFF;

    public boolean LJ(InterfaceC1327930kf1 interfaceC1327930kf1) {
        return interfaceC1327930kf1.LJFF().LJIIZILJ;
    }

    @Override // X.InterfaceC1327390ke9
    public final void LIZIZ(final InterfaceC1328020kfA<C1328480kfu> interfaceC1328020kfA, final InterfaceC1327930kf1 interfaceC1327930kf1) {
        boolean z;
        C1326950kdR c1326950kdR;
        C1325710kbR c1325710kbRLJFF = interfaceC1327930kf1.LJFF();
        if (!LJ(interfaceC1327930kf1)) {
            if (interfaceC1327930kf1.LIZIZ().getValue() >= EnumC1320950kTl.DISK_CACHE.getValue()) {
                interfaceC1328020kfA.LIZJ(1, null);
                return;
            } else {
                this.LJ.LIZIZ(interfaceC1328020kfA, interfaceC1327930kf1);
                return;
            }
        }
        interfaceC1327930kf1.LIZ().LJI(interfaceC1327930kf1.getId(), "DiskCacheProducer");
        InterfaceC1324680kZm interfaceC1324680kZmLIZLLL = LIZLLL(this.LIZLLL, interfaceC1327930kf1);
        EnumC1325560kbC enumC1325560kbC = c1325710kbRLJFF.LIZ;
        if (enumC1325560kbC == EnumC1325560kbC.SMALL) {
            z = true;
        } else {
            z = false;
        }
        if (enumC1325560kbC != EnumC1325560kbC.CUSTOM || TextUtils.isEmpty(c1325710kbRLJFF.LJIL) || (c1326950kdR = this.LIZJ.get(c1325710kbRLJFF.LJIL)) == null) {
            if (z) {
                c1326950kdR = this.LIZIZ;
            } else {
                c1326950kdR = this.LIZ;
            }
        }
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        C15O7<C1328480kfu> c15o7LJI = c1326950kdR.LJI(interfaceC1324680kZmLIZLLL, atomicBoolean);
        final String id = interfaceC1327930kf1.getId();
        final InterfaceC1325690kbP interfaceC1325690kbPLIZ = interfaceC1327930kf1.LIZ();
        c15o7LJI.LIZLLL(new InterfaceC2385309Wh<C1328480kfu, Void>() { // from class: X.0keg
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:35:0x00c0  */
            /* JADX WARN: Removed duplicated region for block: B:44:0x00ea  */
            /* JADX WARN: Type inference failed for: r3v0 */
            /* JADX WARN: Type inference failed for: r3v1 */
            /* JADX WARN: Type inference failed for: r3v2, types: [X.0kX9] */
            /* JADX WARN: Type inference failed for: r3v3 */
            @Override // X.InterfaceC2385309Wh
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Void then(X.C15O7<X.C1328480kfu> r11) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 328
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1327720keg.then(X.15O7):java.lang.Object");
            }
        });
        interfaceC1327930kf1.LJ(new C1330860kjk() { // from class: X.0kfC
            @Override // X.InterfaceC1330340kiu
            public final void LIZJ() {
                atomicBoolean.set(true);
            }
        });
    }

    public InterfaceC1324680kZm LIZLLL(InterfaceC1325590kbF interfaceC1325590kbF, InterfaceC1327930kf1 interfaceC1327930kf1) {
        return interfaceC1325590kbF.LIZ(interfaceC1327930kf1.LJFF(), interfaceC1327930kf1.LIZJ());
    }

    public static Map<String, String> LIZJ(InterfaceC1325690kbP interfaceC1325690kbP, String str, boolean z, int i) {
        if (!interfaceC1325690kbP.LJIIJ(str)) {
            return null;
        }
        if (z) {
            return C19871212ow.of("cached_value_found", String.valueOf(z), "encodedImageSize", String.valueOf(i));
        }
        return C19871212ow.of("cached_value_found", String.valueOf(z));
    }

    public C1327710kef(C1326950kdR c1326950kdR, C1326950kdR c1326950kdR2, Map<String, C1326950kdR> map, InterfaceC1325590kbF interfaceC1325590kbF, InterfaceC1327390ke9<C1328480kfu> interfaceC1327390ke9, InterfaceC1327440keE interfaceC1327440keE) {
        this.LIZ = c1326950kdR;
        this.LIZIZ = c1326950kdR2;
        this.LIZJ = map;
        this.LIZLLL = interfaceC1325590kbF;
        this.LJ = interfaceC1327390ke9;
        this.LJFF = interfaceC1327440keE;
    }
}
