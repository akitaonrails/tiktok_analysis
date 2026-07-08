package X;

/* JADX INFO: renamed from: X.1CyD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2247671CyD {
    public final EnumC0297008h LIZ;
    public final EnumC0297008h LIZIZ;
    public final C00CL LIZJ;
    public final boolean LIZLLL;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CameraRenderData(renderMode=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", lastRenderMode=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", widgetMode=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", updateRenderMode=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static C2247671CyD LIZ(C2247671CyD c2247671CyD, C00CL c00cl, int i) {
        EnumC0297008h enumC0297008h;
        boolean z;
        EnumC0297008h enumC0297008h2 = null;
        if ((i & 1) != 0) {
            enumC0297008h = c2247671CyD.LIZ;
        } else {
            enumC0297008h = null;
        }
        if ((i & 2) != 0) {
            enumC0297008h2 = c2247671CyD.LIZIZ;
        }
        if ((i & 4) != 0) {
            c00cl = c2247671CyD.LIZJ;
        }
        if ((i & 8) != 0) {
            z = c2247671CyD.LIZLLL;
        } else {
            z = false;
        }
        c2247671CyD.getClass();
        return new C2247671CyD(enumC0297008h, enumC0297008h2, c00cl, z);
    }

    public C2247671CyD(EnumC0297008h enumC0297008h, EnumC0297008h enumC0297008h2, C00CL c00cl, boolean z) {
        this.LIZ = enumC0297008h;
        this.LIZIZ = enumC0297008h2;
        this.LIZJ = c00cl;
        this.LIZLLL = z;
    }
}
