package X;

import java.io.File;
import kotlin.jvm.functions.Function0;
import kotlin.text.Regex;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.13Vs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20022213Vs extends C09AY implements Function0<Regex> {
    public C20022213Vs() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Regex invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        C01GW c01gw = C20021913Vp.LIZ;
        String creativeRoot = C287580BOy.LIZ() ? (String) C20021913Vp.LIZIZ.getValue() : C0CHQ.LIZ().LJJIIJZLJL().getPathService().getCreativeRoot();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(creativeRoot);
        sbLIZ2.append(C20021913Vp.LJFF);
        sbLIZ2.append("([0-9]+)");
        sbLIZ2.append(File.separator);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        StringBuilder sb = new StringBuilder(e3.h);
        sb.append(strLIZIZ);
        sb.append(e3.h);
        EnumC20228214Cy[] enumC20228214CyArrValues = EnumC20228214Cy.values();
        int length = enumC20228214CyArrValues.length;
        for (int i = 0; i < length; i++) {
            if (i != enumC20228214CyArrValues.length - 1) {
                sb.append(enumC20228214CyArrValues[i].getNameSpace());
                sb.append("|");
            } else {
                sb.append(enumC20228214CyArrValues[i].getNameSpace());
            }
        }
        sb.append(")");
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(File.separator);
        sbLIZ3.append("(.*)");
        sb.append(C2188811AlT.LIZIZ(sbLIZ3));
        sb.append(")");
        sbLIZ.append(sb.toString());
        sbLIZ.append('|');
        String strLJFF = C287580BOy.LIZ() ? (String) C20021913Vp.LIZJ.getValue() : C0CHQ.LIZ().LJJIIJZLJL().getPathService().LJFF();
        StringBuilder sb2 = new StringBuilder(e3.h);
        sb2.append(strLJFF);
        sb2.append(e3.h);
        EnumC20227914Cv[] enumC20227914CvArrValues = EnumC20227914Cv.values();
        int length2 = enumC20227914CvArrValues.length;
        for (int i2 = 0; i2 < length2; i2++) {
            if (i2 != enumC20227914CvArrValues.length - 1) {
                sb2.append(enumC20227914CvArrValues[i2].getNameSpace());
                sb2.append("|");
            } else {
                sb2.append(enumC20227914CvArrValues[i2].getNameSpace());
            }
        }
        sb2.append(")");
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        String str = File.separator;
        sbLIZ4.append(str);
        sbLIZ4.append("(.*)");
        sb2.append(C2188811AlT.LIZIZ(sbLIZ4));
        sb2.append(")");
        sbLIZ.append(sb2.toString());
        sbLIZ.append('|');
        String persistentRoot = C287580BOy.LIZ() ? (String) C20021913Vp.LIZLLL.getValue() : C0CHQ.LIZ().LJJIIJZLJL().getPathService().getPersistentRoot();
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append(persistentRoot);
        sbLIZ5.append("((");
        sbLIZ5.append(C20021913Vp.LJFF);
        sbLIZ5.append(")|(");
        sbLIZ5.append(C1445850njD.LIZ.getCreationId());
        sbLIZ5.append(str);
        sbLIZ5.append(")|(");
        sbLIZ5.append(C1445850njD.LIZIZ.getCreationId());
        sbLIZ5.append(str);
        sbLIZ5.append(")|(");
        sbLIZ5.append(C1445850njD.LIZLLL.getCreationId());
        sbLIZ5.append("))");
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ5);
        StringBuilder sb3 = new StringBuilder(e3.h);
        sb3.append(strLIZIZ2);
        sb3.append(e3.h);
        C0MI0[] c0mi0ArrValues = C0MI0.values();
        int length3 = c0mi0ArrValues.length;
        for (int i3 = 0; i3 < length3; i3++) {
            if (i3 != c0mi0ArrValues.length - 1) {
                sb3.append(c0mi0ArrValues[i3].getNameSpace());
                sb3.append("|");
            } else {
                sb3.append(c0mi0ArrValues[i3].getNameSpace());
            }
        }
        sb3.append(")");
        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
        sbLIZ6.append(File.separator);
        sbLIZ6.append("(.*)");
        sb3.append(C2188811AlT.LIZIZ(sbLIZ6));
        sb3.append(")");
        sbLIZ.append(sb3.toString());
        sbLIZ.append('|');
        String cacheRoot = C287580BOy.LIZ() ? (String) C20021913Vp.LJ.getValue() : C0CHQ.LIZ().LJJIIJZLJL().getPathService().getCacheRoot();
        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
        sbLIZ7.append(cacheRoot);
        sbLIZ7.append(C20021913Vp.LJFF);
        String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ7);
        StringBuilder sb4 = new StringBuilder(e3.h);
        sb4.append(strLIZIZ3);
        sb4.append(e3.h);
        EnumC20228014Cw[] enumC20228014CwArrValues = EnumC20228014Cw.values();
        int length4 = enumC20228014CwArrValues.length;
        for (int i4 = 0; i4 < length4; i4++) {
            if (i4 != enumC20228014CwArrValues.length - 1) {
                sb4.append(enumC20228014CwArrValues[i4].getNameSpace());
                sb4.append("|");
            } else {
                sb4.append(enumC20228014CwArrValues[i4].getNameSpace());
            }
        }
        sb4.append(")");
        StringBuilder sbLIZ8 = C2188811AlT.LIZ();
        sbLIZ8.append(File.separator);
        sbLIZ8.append("(.*)");
        sb4.append(C2188811AlT.LIZIZ(sbLIZ8));
        sb4.append(")");
        sbLIZ.append(sb4.toString());
        return new Regex(C2188811AlT.LIZIZ(sbLIZ));
    }
}
