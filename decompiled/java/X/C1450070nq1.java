package X;

/* JADX INFO: renamed from: X.0nq1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1450070nq1 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str) {
        LIZIZ("ImageEdit#ImageCompileLog", str);
    }

    public static void LIZLLL(String str) {
        LIZIZ("ImageEdit#ImageLivePhotoLog", str);
    }

    public static void LJI(String str) {
        LIZIZ("ImageEdit#ImagePublishTask", str);
    }

    public static void LJII(String str) {
        LIZIZ("ImageEdit#ImageUserTrace", str);
    }

    public static void LIZIZ(String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[stage-");
        sbLIZ.append(str);
        sbLIZ.append("][thread-");
        sbLIZ.append(C786410Ut5.u3().getName());
        sbLIZ.append("] ");
        sbLIZ.append(str2);
        C2344809Gs.LIZLLL(3, "imageEdit", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static void LIZJ(String str, String str2) {
        C1450080nq2 c1450080nq2 = C1450080nq2.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ImageEdit#");
        sbLIZ.append(str);
        C201955140j.LIZLLL(c1450080nq2, C2188811AlT.LIZIZ(sbLIZ), str2);
    }

    public static void LJFF(int i, int i2, int i3, int i4, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("no_downgrade: index=");
        sbLIZ.append(i);
        sbLIZ.append(", source=");
        sbLIZ.append(str);
        sbLIZ.append(", ");
        sbLIZ.append(i2);
        sbLIZ.append('x');
        sbLIZ.append(i3);
        sbLIZ.append(", maxSide=");
        sbLIZ.append(i4);
        LIZIZ("ImageEdit#CompileResolution", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static void LJ(int i, int i2, int i3, int i4, String str, int i5, int i6) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("downgrade: index=");
        sbLIZ.append(i);
        sbLIZ.append(", source=");
        sbLIZ.append(str);
        sbLIZ.append(", ");
        sbLIZ.append(i2);
        sbLIZ.append('x');
        sbLIZ.append(i3);
        sbLIZ.append(" -> ");
        sbLIZ.append(i4);
        sbLIZ.append('x');
        sbLIZ.append(i5);
        sbLIZ.append(", maxSide=");
        sbLIZ.append(i6);
        LIZIZ("ImageEdit#CompileResolution", C2188811AlT.LIZIZ(sbLIZ));
    }
}
