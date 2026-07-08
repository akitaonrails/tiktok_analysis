package X;

import android.text.Spanned;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.18sW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21422218sW extends C21422618sa {
    public static boolean LJIIL;
    public final C14S0 LJI;
    public final boolean LJII;
    public final C689290R1z LJIIIIZZ;
    public final boolean LJIIIZ;
    public final boolean LJIIJ;
    public final C01GW LJIIJJI;

    @Override // X.AbstractC21425218t0, X.InterfaceC21434318uT
    public final void LIZLLL(C21427518tN c21427518tN) {
        c21427518tN.LIZ(C21440118vP.class, new InterfaceC21427718tP() { // from class: X.18sb
            @Override // X.InterfaceC21427718tP
            public final void LIZ(InterfaceC21427218tK interfaceC21427218tK, AbstractC21430218to abstractC21430218to) {
                String str;
                String string;
                C21440118vP c21440118vP = (C21440118vP) abstractC21430218to;
                C21422218sW c21422218sW = this.LIZ;
                if (c21422218sW.LJII && c21440118vP.LJFF != null) {
                    c21422218sW.LIZJ.LJIIIZ = c21440118vP;
                }
                C689290R1z c689290R1z = c21422218sW.LJIIIIZZ;
                boolean z = false;
                if (c21422218sW.LJIIJ && c689290R1z != null && (str = c21440118vP.LJFF) != null && (string = a0.LJLJJL(str).toString()) != null && u.LJJIIJZLJL(string, "<data-block", false)) {
                    z = true;
                    C21422118sV.LIZJ(interfaceC21427218tK, c21440118vP, c689290R1z, this.LIZ.LJIIIZ);
                }
                this.LIZ.LJIILIIL(interfaceC21427218tK, c21440118vP.LJFF);
                if (z && c689290R1z != null) {
                    C21422118sV.LIZIZ(interfaceC21427218tK, c21440118vP, c689290R1z, this.LIZ.LJIIIZ);
                }
            }
        });
        c21427518tN.LIZ(C21437218uw.class, new InterfaceC21427718tP() { // from class: X.18sc
            @Override // X.InterfaceC21427718tP
            public final void LIZ(InterfaceC21427218tK interfaceC21427218tK, AbstractC21430218to abstractC21430218to) {
                String str;
                String string;
                C21437218uw c21437218uw = (C21437218uw) abstractC21430218to;
                C21422218sW c21422218sW = this.LIZ;
                if (c21422218sW.LJII && c21437218uw.LJFF != null) {
                    c21422218sW.LIZJ.LJIIIZ = c21437218uw;
                }
                C689290R1z c689290R1z = c21422218sW.LJIIIIZZ;
                boolean z = false;
                if (c21422218sW.LJIIJ && c689290R1z != null && (str = c21437218uw.LJFF) != null && (string = a0.LJLJJL(str).toString()) != null && u.LJJIIJZLJL(string, "<data-block", false)) {
                    z = true;
                    C21422118sV.LIZJ(interfaceC21427218tK, c21437218uw, c689290R1z, this.LIZ.LJIIIZ);
                }
                this.LIZ.LJIILIIL(interfaceC21427218tK, c21437218uw.LJFF);
                if (z && c689290R1z != null) {
                    C21422118sV.LIZIZ(interfaceC21427218tK, c21437218uw, c689290R1z, this.LIZ.LJIIIZ);
                }
            }
        });
    }

    @Override // X.AbstractC21425218t0, X.InterfaceC21434318uT
    public final void LJFF(TextView textView, Spanned spanned) {
        Spanned spanned2;
        InterfaceC1859630yUb[] interfaceC1859630yUbArr;
        CharSequence text = textView.getText();
        if (text instanceof Spanned) {
            spanned2 = (Spanned) text;
        } else {
            spanned2 = null;
        }
        if (spanned2 == null || (interfaceC1859630yUbArr = (InterfaceC1859630yUb[]) spanned2.getSpans(0, ((Spanned) text).length(), InterfaceC1859630yUb.class)) == null) {
            interfaceC1859630yUbArr = new InterfaceC1859630yUb[0];
        }
        List listLJLI = C13LQ.LJLI(spanned.getSpans(0, spanned.length(), InterfaceC1859630yUb.class));
        for (InterfaceC1859630yUb interfaceC1859630yUb : interfaceC1859630yUbArr) {
            if (!((ArrayList) listLJLI).remove(interfaceC1859630yUb)) {
                interfaceC1859630yUb.onDetach();
            }
        }
        Iterator it2 = ((ArrayList) listLJLI).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1859630yUb) it2.next()).LIZIZ(textView, spanned);
        }
        for (C21418218rs c21418218rs : (C21418218rs[]) spanned.getSpans(0, spanned.length(), C21418218rs.class)) {
            c21418218rs.LLILLL = textView;
        }
        InterfaceC21419318s3[] interfaceC21419318s3Arr = (InterfaceC21419318s3[]) spanned.getSpans(0, spanned.length(), InterfaceC21419318s3.class);
        if (interfaceC21419318s3Arr != null) {
            for (InterfaceC21419318s3 interfaceC21419318s3 : interfaceC21419318s3Arr) {
                interfaceC21419318s3.LIZ(textView);
            }
        }
    }

    @Override // X.C21432818uE
    public final void LJIILIIL(InterfaceC21427218tK interfaceC21427218tK, String str) {
        if (str != null && !LJIIL) {
            LJIIL = true;
        }
        super.LJIILIIL(interfaceC21427218tK, str);
    }

    public C21422218sW(C14S0 c14s0, final boolean z, boolean z2, C689290R1z c689290R1z, boolean z3, final boolean z4, final boolean z5) {
        this.LJI = c14s0;
        this.LJII = z2;
        this.LJIIIIZZ = c689290R1z;
        this.LJIIIZ = z3;
        this.LJIIJ = z4;
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS576S0100000_32(this, 467));
        this.LJIIJJI = c01gwLIZIZ;
        LJIIL(new AbstractC21434518uV() { // from class: X.18rk
            @Override // X.AbstractC21434218uS
            public final Collection LIZJ() {
                return Collections.singletonList("p");
            }

            @Override // X.AbstractC21434518uV
            public final Object LJ(C21432118u7 c21432118u7, C14S7 c14s7, InterfaceC21435018ua interfaceC21435018ua) {
                return C21352218hE.LIZ(interfaceC21435018ua);
            }
        });
        LJIIL(new AbstractC21434518uV() { // from class: X.18ri
            @Override // X.AbstractC21434218uS
            public final Collection LIZJ() {
                return Collections.singletonList("div");
            }

            @Override // X.AbstractC21434518uV
            public final Object LJ(C21432118u7 c21432118u7, C14S7 c14s7, InterfaceC21435018ua interfaceC21435018ua) {
                return C21352218hE.LIZ(interfaceC21435018ua);
            }
        });
        LJIIL(new C21431718u3() { // from class: X.18lt
            @Override // X.C21431718u3, X.AbstractC21434518uV
            public final Object LJ(C21432118u7 c21432118u7, C14S7 c14s7, InterfaceC21435018ua interfaceC21435018ua) {
                Object objLJ = super.LJ(c21432118u7, c14s7, interfaceC21435018ua);
                Object[] objArrLIZ = C21352218hE.LIZ(interfaceC21435018ua);
                if (objLJ == null && objArrLIZ == null) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                if (objArrLIZ != null) {
                    Iterator it2 = ((ArrayList) C13LQ.LJIJI(objArrLIZ)).iterator();
                    while (it2.hasNext()) {
                        arrayList.add(it2.next());
                    }
                }
                if (objLJ instanceof Object[]) {
                    Iterator it3 = ((ArrayList) C13LQ.LJIJI((Object[]) objLJ)).iterator();
                    while (it3.hasNext()) {
                        arrayList.add(it3.next());
                    }
                } else if (objLJ != null) {
                    arrayList.add(objLJ);
                }
                return arrayList.toArray(new Object[0]);
            }
        });
        LJIIL(new AbstractC21434518uV() { // from class: X.18rj
            @Override // X.AbstractC21434218uS
            public final Collection LIZJ() {
                return Collections.singletonList("span");
            }

            @Override // X.AbstractC21434518uV
            public final Object LJ(C21432118u7 c21432118u7, C14S7 c14s7, InterfaceC21435018ua interfaceC21435018ua) {
                return C21352218hE.LIZ(interfaceC21435018ua);
            }
        });
        LJIIL(new C21433318uJ() { // from class: X.18sg
            @Override // X.C21433318uJ, X.AbstractC21434218uS
            public final void LIZ(InterfaceC21427218tK interfaceC21427218tK, C21433418uK c21433418uK, InterfaceC21435018ua interfaceC21435018ua) {
                super.LIZ(interfaceC21427218tK, c21433418uK, interfaceC21435018ua);
                C21423918sn.LJI(interfaceC21427218tK.builder(), C21352218hE.LIZ(interfaceC21435018ua), interfaceC21435018ua.start(), interfaceC21435018ua.end());
            }
        });
        LJIIL(new AbstractC21434218uS(z, z4, z5) { // from class: X.18sX
            public final boolean LIZ;
            public final boolean LIZIZ;
            public final boolean LIZJ;

            @Override // X.AbstractC21434218uS
            public final Collection LIZJ() {
                return C1697810uHb.LJIIJJI("data-block", "data-block-force-zero-left", "data-inline-force-zero-left", "data-inline", "data-inline-no-margin");
            }

            /* JADX WARN: Removed duplicated region for block: B:8:0x001d A[PHI: r1
              0x001d: PHI (r1v5 java.lang.String) = (r1v3 java.lang.String), (r1v2 java.lang.String) binds: [B:7:0x001b, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // X.AbstractC21434218uS
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.CharSequence LIZIZ(X.AbstractC21434718uX r3, X.C21423618sk r4) {
                /*
                    r2 = this;
                    java.util.Map r1 = r3.LIZLLL()
                    java.lang.String r0 = "alt"
                    java.lang.Object r1 = r1.get(r0)
                    java.lang.String r1 = (java.lang.String) r1
                    if (r1 == 0) goto L14
                    int r0 = r1.length()
                    if (r0 != 0) goto L1d
                L14:
                    r4.getClass()
                    java.lang.String r1 = X.C21423618sk.LIZ(r3)
                    if (r1 == 0) goto L23
                L1d:
                    int r0 = r1.length()
                    if (r0 != 0) goto L25
                L23:
                    java.lang.String r1 = " "
                L25:
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C21422318sX.LIZIZ(X.18uX, X.18sk):java.lang.CharSequence");
            }

            {
                this.LIZ = z;
                this.LIZIZ = z4;
                this.LIZJ = z5;
            }

            /* JADX WARN: Removed duplicated region for block: B:113:0x025a  */
            @Override // X.AbstractC21434218uS
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ(X.InterfaceC21427218tK r30, X.C21433418uK r31, X.InterfaceC21435018ua r32) {
                /*
                    Method dump skipped, instruction units count: 606
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C21422318sX.LIZ(X.18tK, X.18uK, X.18ua):void");
            }
        });
        AbstractC21434218uS abstractC21434218uS = (AbstractC21434218uS) c01gwLIZIZ.getValue();
        if (abstractC21434218uS != null) {
            LJIIL(abstractC21434218uS);
        }
        Set setLJLIIL = C13LQ.LJLIIL(new String[]{"data-block", "data-block-force-zero-left"});
        this.LJFF.addAll(setLJLIIL);
        this.LIZIZ.LIZIZ.addAll(setLJLIIL);
        this.LIZIZ.LIZJ.addAll(C13LQ.LJLIIL(new String[]{"data-inline", "data-inline-no-margin", "data-inline-force-zero-left"}));
    }
}
