package X;

import Y.ACallableS250S0200000_22;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.ss.android.vesdk.VEUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0nO7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1432770nO7 extends AbstractC1432780nO8 {
    public final List<C1432730nO3> LIZLLL;
    public final VideoPublishEditModel LJ;

    @Override // X.InterfaceC1432810nOB
    public final String LIZ() {
        return "extract_upload";
    }

    @Override // X.AbstractC1432780nO8
    public final List<C1429800nJK> LIZIZ() {
        return C1432640nNu.LIZIZ(this.LIZLLL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, com.ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel] */
    /* JADX WARN: Type inference failed for: r1v4, types: [T, com.ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel] */
    @Override // X.AbstractC1432780nO8
    public final void LJFF(InterfaceC1432820nOC interfaceC1432820nOC) {
        super.LJFF(interfaceC1432820nOC);
        if (!AbstractC1432780nO8.LIZJ()) {
            return;
        }
        C259800zU c259800zU = new C259800zU();
        ?? extractFramesModel = this.LJ.getExtractFramesModel();
        c259800zU.element = extractFramesModel;
        if (extractFramesModel == 0) {
            ?? extractFramesModel2 = new ExtractFramesModel("extract_upload");
            c259800zU.element = extractFramesModel2;
            extractFramesModel2.setExtractFramesDir(this.LIZIZ.LIZIZ);
            this.LJ.setExtractFramesModel((ExtractFramesModel) c259800zU.element);
        }
        if (((ExtractFramesModel) c259800zU.element).getExtractFramesDir().length() == 0) {
            ((ExtractFramesModel) c259800zU.element).setExtractFramesDir(this.LIZIZ.LIZIZ);
        }
        C15O7.LIZJ(new ACallableS250S0200000_22(this, c259800zU, 11)).LIZLLL(new C1466860oH6(this, (C1432870nOH) interfaceC1432820nOC, 4));
    }

    public final void LJI(List<C1432800nOA> list, HashSet<String> hashSet) {
        String strLIZIZ;
        String strLIZIZ2 = this.LIZIZ.LIZIZ;
        String str = File.separator;
        if (!u.LJIIZILJ(strLIZIZ2, str, false)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strLIZIZ2);
            sbLIZ.append(str);
            strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ);
        }
        ArrayList<C1432800nOA> arrayList = (ArrayList) list;
        if (arrayList.isEmpty()) {
            return;
        }
        int i = 0;
        for (C1432800nOA c1432800nOA : arrayList) {
            String str2 = c1432800nOA.LIZJ;
            long j = c1432800nOA.LIZ;
            long j2 = c1432800nOA.LIZIZ;
            int i2 = ((int) (j2 - j)) / 500;
            int[] iArr = new int[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                iArr[i3] = ((int) j) + (500 * i3);
            }
            if (i2 == 0 && j2 > 0) {
                iArr = new int[]{0};
            }
            int i4 = C2224308nZ.LIZ[0];
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(i);
            sbLIZ2.append("_gsv_extract_frame");
            VEUtils.saveVideoFrames(str2, iArr, i4, -1, false, strLIZIZ2, C2188811AlT.LIZIZ(sbLIZ2), 1);
            i++;
        }
        ExtractFramesModel extractFramesModel = this.LJ.getExtractFramesModel();
        if (extractFramesModel == null || (strLIZIZ = extractFramesModel.getExtractFramesDir()) == null) {
            strLIZIZ = "";
        }
        String str3 = File.separator;
        if (!u.LJIIZILJ(strLIZIZ, str3, false)) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(strLIZIZ);
            sbLIZ3.append(str3);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
        }
        File[] fileArrListFiles = new C0VSJ(strLIZIZ2).listFiles();
        if (fileArrListFiles != null && fileArrListFiles.length != 0) {
            C089E c089e = new C089E(fileArrListFiles);
            while (c089e.hasNext()) {
                File file = (File) c089e.next();
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append(strLIZIZ);
                sbLIZ4.append(file.getName());
                String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ4);
                C2354709Kn.LIZLLL(file.getAbsolutePath(), strLIZIZ3);
                C2354709Kn.LJIJJLI(file.getAbsolutePath());
                hashSet.add(strLIZIZ3);
            }
        }
    }

    public C1432770nO7(CreativeInfo creativeInfo, List<C1432730nO3> list, VideoPublishEditModel videoPublishEditModel) {
        super(creativeInfo);
        this.LIZLLL = list;
        this.LJ = videoPublishEditModel;
    }
}
