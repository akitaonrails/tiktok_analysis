package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.0Exq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC381680Exq extends AbstractC381830Ey5 {
    @Override // X.AbstractC381830Ey5
    public final String LJFF() {
        return "ai_video";
    }

    @Override // X.AbstractC381830Ey5
    public final int LJ() {
        Keva keva = (Keva) C378870EtJ.LIZIZ.getValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("max_video_quota_");
        sbLIZ.append((String) C378870EtJ.LIZ.getValue());
        return keva.getInt(C2188811AlT.LIZIZ(sbLIZ), 5);
    }

    @Override // X.AbstractC381830Ey5
    public final EnumC377820Erc LIZJ() {
        return EnumC377820Erc.EP_AIGC_T2V;
    }

    @Override // X.AbstractC381830Ey5
    public final EnumC377680ErO LIZLLL() {
        return EnumC377680ErO.TEXT_2_VIDEO;
    }

    public AbstractC381680Exq(InterfaceC497601wk interfaceC497601wk, VideoPublishEditModel videoPublishEditModel, InterfaceC381790Ey1 interfaceC381790Ey1) {
        super(interfaceC497601wk, videoPublishEditModel, interfaceC381790Ey1);
    }

    public final void LJIIIIZZ(EnumC378310EsP enumC378310EsP, String str, C381700Exs c381700Exs, InterfaceC382380Eyy interfaceC382380Eyy, C382170Eyd c382170Eyd, EnumC381960EyI enumC381960EyI, boolean z, EnumC381980EyK enumC381980EyK) {
        String str2 = c381700Exs.LIZJ.promptForAlgorithm;
        this.LIZLLL = interfaceC382380Eyy;
        InterfaceC497601wk interfaceC497601wk = this.LIZ;
        if (interfaceC497601wk != null) {
            C23250099c.LIZLLL(interfaceC497601wk, null, null, new C381850Ey7(this, enumC381980EyK, c382170Eyd, enumC381960EyI, str, c381700Exs, str2, enumC378310EsP, z, interfaceC382380Eyy, null), 3);
        }
    }
}
