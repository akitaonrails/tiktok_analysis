package X;

import android.content.Context;
import com.bytedance.scene.Scene;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.autocut.s;
import com.ss.android.ugc.aweme.creative.model.AutoCutMediaModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutThemeData;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import java.util.List;
import kotlin.jvm.internal.AwS161S0101000_22;
import kotlin.jvm.internal.AwS423S0200000_22;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.AwS636S0100000_22;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0n0e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1418220n0e implements InterfaceC1418260n0i {
    public final Scene LIZ;
    public final C1418230n0f LIZIZ;
    public final C1418430n0z LIZJ;
    public final Context LIZLLL;
    public final C1418270n0j LJ;
    public TuxSheet LJFF;
    public int LJI;
    public String LJII;

    @Override // X.InterfaceC1418260n0i
    public final void LIZLLL(String str) {
    }

    @Override // X.InterfaceC1418260n0i
    public final void LJII(List<AutoCutThemeData> list, String str, Scene scene, boolean z) {
    }

    @Override // X.InterfaceC1418260n0i
    public final void LJIILLIIL(String str) {
    }

    public final void LJJ() {
        if (C2471909mP.LJJIIZI(this.LIZIZ.LIZLLL)) {
            String str = this.LIZIZ.LIZLLL;
            if (C123100dR.LIZ(str) && C2286708xd.LIZJ(str)) {
                this.LJ.setMediaCover(C2471909mP.LJIILIIL(this.LIZIZ.LIZLLL));
                return;
            }
        }
        String str2 = this.LJII;
        if (C123100dR.LIZ(str2) && C2286708xd.LIZJ(str2)) {
            this.LJ.setMediaCover(C2471909mP.LJIILIIL(this.LJII));
            return;
        }
        this.LJ.setMediaCover(null);
        AutoCutMediaModel autoCutMediaModel = (AutoCutMediaModel) C13LP.LJJJLL(this.LIZIZ.LIZ.LJII);
        if (autoCutMediaModel == null) {
            return;
        }
        CreativeInfo creativeInfo = this.LIZIZ.LIZ.LJIIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(s.LJIIL(creativeInfo));
        sbLIZ.append("tempCoverDir_");
        sbLIZ.append(System.currentTimeMillis());
        sbLIZ.append('_');
        sbLIZ.append(this.LJI);
        sbLIZ.append(".png");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        this.LJI++;
        AwS636S0100000_22 awS636S0100000_22 = new AwS636S0100000_22(this, 55);
        if (!autoCutMediaModel.isVideoType) {
            awS636S0100000_22.invoke(autoCutMediaModel.filePath, Boolean.FALSE);
            return;
        }
        if (u.LJIIZILJ(autoCutMediaModel.filePath, ".mp3", false) || u.LJIIZILJ(autoCutMediaModel.filePath, ".mp4", false)) {
            awS636S0100000_22.invoke(autoCutMediaModel.filePath, Boolean.FALSE);
            return;
        }
        if (strLIZIZ != null) {
            AwS591S0100000_12 awS591S0100000_12 = new AwS591S0100000_12(awS636S0100000_22, 1066);
            if (autoCutMediaModel.isVideoType) {
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C534760KyA(autoCutMediaModel, strLIZIZ, 0, awS591S0100000_12, null), 3);
            } else {
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C534750Ky9(autoCutMediaModel, strLIZIZ, awS591S0100000_12, null), 3);
            }
        }
    }

    @Override // X.InterfaceC1418260n0i
    public final void LJIIJJI(C1417310mzB c1417310mzB) {
        C01TT.LIZLLL(new AwS566S0100000_22(this, 994));
    }

    public final void LJJI(int i) {
        if (i == 100) {
            return;
        }
        C01TT.LIZLLL(new AwS161S0101000_22(this, i, 6));
    }

    public C1418220n0e(Scene scene, C1418230n0f c1418230n0f, C1418430n0z c1418430n0z) {
        this.LIZ = scene;
        this.LIZIZ = c1418230n0f;
        this.LIZJ = c1418430n0z;
        Context contextLIZJ = C545820Lau.LIZJ(scene);
        this.LIZLLL = contextLIZJ;
        this.LJ = new C1418270n0j(contextLIZJ);
    }

    @Override // X.InterfaceC1418260n0i
    public final void LJIJJ(int i, Integer num, String str, EnumC1418300n0m enumC1418300n0m) {
        C01TT.LIZLLL(new AwS423S0200000_22(this, enumC1418300n0m, 95));
    }
}
