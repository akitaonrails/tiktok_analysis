package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: X.0oPL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1471970oPL {
    public int LIZ;
    public Object LIZIZ;
    public String[] LIZJ;
    public int LIZLLL;
    public String LJ;
    public int LJFF;
    public float LJI;
    public float LJII;
    public String LJIIIIZZ;
    public String LJIIIZ;
    public String LJIIJ;
    public boolean LJIIJJI;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProcessAudioUrlData{mediaType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", url=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", bitRate=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", languageCode='");
        sbLIZ.append(this.LJ);
        sbLIZ.append('\'');
        sbLIZ.append(", infoId=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", loudness='");
        sbLIZ.append(this.LJI);
        sbLIZ.append('\'');
        sbLIZ.append(", peak='");
        sbLIZ.append(this.LJII);
        sbLIZ.append('\'');
        sbLIZ.append(", fileKey='");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append('\'');
        sbLIZ.append(", format='");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append('\'');
        sbLIZ.append(", volumeInfo='");
        sbLIZ.append(this.LJIIJ);
        sbLIZ.append('\'');
        sbLIZ.append(", forceSoftwareDecode=");
        sbLIZ.append(this.LJIIJJI);
        sbLIZ.append(", playUrls=");
        sbLIZ.append(Arrays.toString(this.LIZJ));
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static List<C1471890oPD> LIZ(List<C1471970oPL> list) {
        String string;
        List listAsList;
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (C1471970oPL c1471970oPL : list) {
                if (c1471970oPL != null) {
                    C1481110oe5.LIZIZ("Ryan1", c1471970oPL.toString());
                    int i = c1471970oPL.LIZ;
                    Object obj = c1471970oPL.LIZIZ;
                    if (obj == null) {
                        string = "";
                    } else {
                        string = obj.toString();
                    }
                    String[] strArr = c1471970oPL.LIZJ;
                    if (strArr == null) {
                        listAsList = Arrays.asList(new String[0]);
                    } else {
                        listAsList = Arrays.asList(strArr);
                    }
                    arrayList.add(new C1471890oPD(i, string, listAsList, Integer.valueOf(c1471970oPL.LIZLLL), c1471970oPL.LJ, c1471970oPL.LJFF, Float.valueOf(c1471970oPL.LJI), Float.valueOf(c1471970oPL.LJII), c1471970oPL.LJIIIIZZ, c1471970oPL.LJIIIZ, c1471970oPL.LJIIJ, Boolean.TRUE));
                }
            }
            return arrayList;
        }
        return null;
    }
}
