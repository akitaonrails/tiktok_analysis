package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS384S0200000_18;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0h3a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1189400h3a {
    public static C1331670kl3 LIZ(C1331670kl3 c1331670kl3, String str, String str2) {
        LIZJ(c1331670kl3, str, str2, null, null, null);
        return c1331670kl3;
    }

    public static C1331670kl3 LIZIZ(C1331670kl3 c1331670kl3, String str, String str2, Map map) {
        String string;
        Object obj = ((LinkedHashMap) map).get("poi_id");
        if (obj != null) {
            string = obj.toString();
        } else {
            string = null;
        }
        LIZJ(c1331670kl3, str, str2, null, new C1202680hP0(string, null, null, null, null, 30), null);
        return c1331670kl3;
    }

    public static final C1331670kl3 LIZJ(final C1331670kl3 c1331670kl3, final String str, final String str2, final String str3, final C1202680hP0 c1202680hP0, final InterfaceC658750Psf interfaceC658750Psf) {
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "ls_image_monitor_enable", true) != 1) {
            return c1331670kl3;
        }
        c1331670kl3.LIZLLL(str2);
        final int iHashCode = c1331670kl3.hashCode();
        final long jCurrentTimeMillis = System.currentTimeMillis();
        final C013C c013c = new C013C();
        c1331670kl3.LJJJIL = new InterfaceC658750Psf() { // from class: X.0hOv
            /* JADX WARN: Removed duplicated region for block: B:16:0x0062  */
            /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
            @Override // X.InterfaceC658750Psf
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void Ck(org.json.JSONObject r15) {
                /*
                    r14 = this;
                    X.013C r0 = r1
                    boolean r0 = r0.element
                    if (r0 == 0) goto L7
                    return
                L7:
                    X.0kl3 r0 = r6
                    android.content.Context r3 = r0.LIZJ
                    boolean r0 = r3 instanceof android.app.Activity
                    r13 = 0
                    if (r0 == 0) goto L66
                    android.app.Activity r3 = (android.app.Activity) r3
                    r1 = 1
                    if (r3 == 0) goto L67
                    boolean r0 = r3.isFinishing()
                    if (r0 == r1) goto L21
                    boolean r0 = r3.isDestroyed()
                    if (r0 != r1) goto L67
                L21:
                    java.lang.String r9 = "0"
                L23:
                    kotlin.jvm.internal.AwS419S0200000_18 r2 = new kotlin.jvm.internal.AwS419S0200000_18
                    X.0kl3 r1 = r6
                    r0 = 118(0x76, float:1.65E-43)
                    r2.<init>(r1, r3, r0)
                    X.C1186030gy9.LIZ(r2)
                    X.0ksY r2 = X.C1336320ksY.LIZ
                    int r10 = r2
                    java.lang.String r3 = r7
                    java.lang.String r4 = r8
                    long r6 = java.lang.System.currentTimeMillis()
                    long r0 = r9
                    long r6 = r6 - r0
                    java.lang.String r11 = r3
                    X.0hP0 r8 = r4
                    kotlin.jvm.internal.AwS384S0200000_18 r12 = new kotlin.jvm.internal.AwS384S0200000_18
                    X.013C r1 = r1
                    r0 = 195(0xc3, float:2.73E-43)
                    r12.<init>(r14, r1, r0)
                    r2.getClass()
                    X.1DFB r0 = X.C0PEM.LIZJ
                    X.054G r1 = X.C2296808zG.LIZ(r0)
                    X.0hOz r2 = new X.0hOz
                    r5 = r15
                    r2.<init>(r3, r4, r5, r6, r8, r9, r10, r11, r12, r13)
                    r0 = 3
                    X.C23250099c.LIZLLL(r1, r13, r13, r2, r0)
                    X.0Psf r0 = r5
                    if (r0 == 0) goto L65
                    r0.Ck(r5)
                L65:
                    return
                L66:
                    r3 = r13
                L67:
                    java.lang.String r9 = "1"
                    goto L23
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1202630hOv.Ck(org.json.JSONObject):void");
            }

            @Override // X.InterfaceC658750Psf
            public final void onImageLoaded(boolean z, String str4, JSONObject jSONObject) {
                C013C c013c2 = c013c;
                if (c013c2.element) {
                    return;
                }
                C1336320ksY c1336320ksY = C1336320ksY.LIZ;
                int i = iHashCode;
                String str5 = str3;
                C1202680hP0 c1202680hP02 = c1202680hP0;
                AwS384S0200000_18 awS384S0200000_18 = new AwS384S0200000_18(this, c013c2, 194);
                c1336320ksY.getClass();
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1202660hOy(jSONObject, z, c1202680hP02, i, str5, awS384S0200000_18, null), 3);
                InterfaceC658750Psf interfaceC658750Psf2 = interfaceC658750Psf;
                if (interfaceC658750Psf2 != null) {
                    interfaceC658750Psf2.onImageLoaded(z, str4, jSONObject);
                }
            }
        };
        return c1331670kl3;
    }
}
