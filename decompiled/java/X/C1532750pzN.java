package X;

import com.bytedance.retrofit2.client.Request;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.google.gson.k;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.0pzN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1532750pzN implements InterfaceC1541060qCm {
    public final C1532720pzK LIZ;
    public final String LIZIZ;
    public final Class<?> LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final LinkedHashMap<String, String> LJFF;
    public final String LJI;
    public final boolean LJII;
    public final k LJIIIIZZ;
    public final InterfaceC841770X0l LJIIIZ;
    public final Request LJIIJ;
    public final boolean LJIIJJI;
    public final String LJIIL;
    public final boolean LJIILIIL;

    public C1532750pzN() {
        throw null;
    }

    @Override // X.InterfaceC1541060qCm
    public final int hashCode() {
        String str = this.LJIIL;
        return str != null ? str.hashCode() : this.LIZ.hashCode();
    }

    @Override // X.InterfaceC1541060qCm
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(": ");
        sbLIZ.append(this.LIZ.LIZIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.LJFF(r4.LJIIL, r2.LJIIL) != false) goto L14;
     */
    @Override // X.InterfaceC1541060qCm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1535940q4W LIZ(X.InterfaceC1541060qCm r5, X.C1535940q4W r6) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof X.C1532750pzN
            r3 = 0
            if (r0 != 0) goto L6
            return r3
        L6:
            if (r5 == r4) goto L2d
            java.lang.String r0 = r4.LJIIL
            if (r0 == 0) goto L2e
            java.lang.Class<?> r1 = r4.LIZJ
            r2 = r5
            X.0pzN r2 = (X.C1532750pzN) r2
            java.lang.Class<?> r0 = r2.LIZJ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L2e
            java.lang.Class<?> r1 = r4.LIZJ
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L2e
            java.lang.String r1 = r4.LJIIL
            java.lang.String r0 = r2.LJIIL
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L2e
        L2d:
            return r6
        L2e:
            X.0pzN r5 = (X.C1532750pzN) r5
            java.lang.Class<?> r1 = r5.LIZJ
            java.lang.Class<?> r0 = r4.LIZJ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L4f
            java.lang.String r1 = r5.LIZIZ
            java.lang.String r0 = r4.LIZIZ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L4f
            X.0pzK r1 = r5.LIZ
            X.0pzK r0 = r4.LIZ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L4f
            return r6
        L4f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1532750pzN.LIZ(X.0qCm, X.0q4W):X.0q4W");
    }

    public C1532750pzN(C1532720pzK c1532720pzK, String str, Class cls, boolean z, boolean z2, LinkedHashMap linkedHashMap, String str2, boolean z3, k kVar, C1494590ozp c1494590ozp, Request request, boolean z4, int i) {
        boolean z5 = z3;
        k kVar2 = kVar;
        C1494590ozp c1494590ozp2 = c1494590ozp;
        Request request2 = request;
        boolean z6 = z4;
        String str3 = (i & 64) != 0 ? null : str2;
        z5 = (i & 128) != 0 ? false : z5;
        kVar2 = (i & 256) != 0 ? null : kVar2;
        c1494590ozp2 = (i & 512) != 0 ? null : c1494590ozp2;
        request2 = (i & 1024) != 0 ? null : request2;
        z6 = (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? true : z6;
        this.LIZ = c1532720pzK;
        this.LIZIZ = str;
        this.LIZJ = cls;
        this.LIZLLL = z;
        this.LJ = z2;
        this.LJFF = linkedHashMap;
        this.LJI = str3;
        this.LJII = z5;
        this.LJIIIIZZ = kVar2;
        this.LJIIIZ = c1494590ozp2;
        this.LJIIJ = request2;
        this.LJIIJJI = z6;
        this.LJIIL = null;
        this.LJIILIIL = false;
    }
}
