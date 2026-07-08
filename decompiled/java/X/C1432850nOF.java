package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.io.File;
import java.util.List;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0nOF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1432850nOF extends AbstractC1432780nO8 {
    public final VideoPublishEditModel LIZLLL;
    public final String LJ;

    @Override // X.InterfaceC1432810nOB
    public final String LIZ() {
        return "extract_custom_sticker";
    }

    @Override // X.AbstractC1432780nO8
    public final List<C1429800nJK> LIZIZ() {
        return null;
    }

    public C1432850nOF(VideoPublishEditModel videoPublishEditModel) {
        super(videoPublishEditModel.getCreativeInfo());
        this.LIZLLL = videoPublishEditModel;
        String str = this.LIZIZ.LIZIZ;
        this.LJ = str;
        String str2 = File.separator;
        if (!u.LJIIZILJ(str, str2, false)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(str2);
            this.LJ = C2188811AlT.LIZIZ(sbLIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(this.LJ);
        sbLIZ2.append("custom_sticker");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        this.LJ = strLIZIZ;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(strLIZIZ);
        sbLIZ3.append(str2);
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
        this.LJ = strLIZIZ2;
        new C0VSJ(strLIZIZ2).mkdirs();
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a8, code lost:
    
        if (r1 != null) goto L12;
     */
    @Override // X.AbstractC1432780nO8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(final X.InterfaceC1432820nOC r6) {
        /*
            Method dump skipped, instruction units count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1432850nOF.LJFF(X.0nOC):void");
    }
}
