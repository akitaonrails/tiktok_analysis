package X;

import com.ss.android.ugc.aweme.relation.auth.dialogcenter.RelationFreqControlData;
import java.util.List;

/* JADX INFO: renamed from: X.0e22, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1073120e22 {
    public final boolean LIZ;
    public final EnumC1070340dxY LIZIZ;
    public final EnumC1070340dxY LIZJ;
    public final List<EnumC1070340dxY> LIZLLL;
    public final boolean LJ;
    public final RelationFreqControlData LJFF;
    public final EnumC1073290e2J LJI;
    public final boolean LJII;

    public C1073120e22() {
        this(0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RelationAuthDialogOutput(isSuccess=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", firstShowPlatform=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", lastShowPlatform=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", showPlatformList=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", isSecondPhase=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", freqControlData=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", authDialogStep=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", didBlockPopup=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1073120e22(int i) {
        EnumC1070340dxY enumC1070340dxY = EnumC1070340dxY.CONTACT;
        this(false, enumC1070340dxY, enumC1070340dxY, C13BV.INSTANCE, false, new RelationFreqControlData(0), EnumC1073290e2J.BEFORE_AUTH_PIPELINE, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1073120e22(boolean z, EnumC1070340dxY enumC1070340dxY, EnumC1070340dxY enumC1070340dxY2, List<? extends EnumC1070340dxY> list, boolean z2, RelationFreqControlData relationFreqControlData, EnumC1073290e2J enumC1073290e2J, boolean z3) {
        this.LIZ = z;
        this.LIZIZ = enumC1070340dxY;
        this.LIZJ = enumC1070340dxY2;
        this.LIZLLL = list;
        this.LJ = z2;
        this.LJFF = relationFreqControlData;
        this.LJI = enumC1073290e2J;
        this.LJII = z3;
    }

    public static C1073120e22 LIZ(C1073120e22 c1073120e22, boolean z, EnumC1070340dxY enumC1070340dxY, EnumC1070340dxY enumC1070340dxY2, List list, boolean z2, RelationFreqControlData relationFreqControlData, EnumC1073290e2J enumC1073290e2J, boolean z3, int i) {
        boolean z4 = z3;
        EnumC1073290e2J enumC1073290e2J2 = enumC1073290e2J;
        RelationFreqControlData relationFreqControlData2 = relationFreqControlData;
        boolean z5 = z2;
        List list2 = list;
        EnumC1070340dxY enumC1070340dxY3 = enumC1070340dxY2;
        EnumC1070340dxY enumC1070340dxY4 = enumC1070340dxY;
        boolean z6 = z;
        if ((i & 1) != 0) {
            z6 = c1073120e22.LIZ;
        }
        if ((i & 2) != 0) {
            enumC1070340dxY4 = c1073120e22.LIZIZ;
        }
        if ((i & 4) != 0) {
            enumC1070340dxY3 = c1073120e22.LIZJ;
        }
        if ((i & 8) != 0) {
            list2 = c1073120e22.LIZLLL;
        }
        if ((i & 16) != 0) {
            z5 = c1073120e22.LJ;
        }
        if ((i & 32) != 0) {
            relationFreqControlData2 = c1073120e22.LJFF;
        }
        if ((i & 64) != 0) {
            enumC1073290e2J2 = c1073120e22.LJI;
        }
        if ((i & 128) != 0) {
            z4 = c1073120e22.LJII;
        }
        c1073120e22.getClass();
        return new C1073120e22(z6, enumC1070340dxY4, enumC1070340dxY3, list2, z5, relationFreqControlData2, enumC1073290e2J2, z4);
    }
}
