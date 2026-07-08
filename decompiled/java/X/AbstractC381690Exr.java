package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.0Exr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC381690Exr extends AbstractC381830Ey5 {
    @Override // X.AbstractC381830Ey5
    public final String LJFF() {
        return "ai_image";
    }

    @Override // X.AbstractC381830Ey5
    public final int LJ() {
        return C378870EtJ.LIZ();
    }

    @Override // X.AbstractC381830Ey5
    public final EnumC377820Erc LIZJ() {
        return EnumC377820Erc.EP_AIGC_T2I;
    }

    @Override // X.AbstractC381830Ey5
    public final EnumC377680ErO LIZLLL() {
        return EnumC377680ErO.TEXT_2_IMAGE;
    }

    public AbstractC381690Exr(InterfaceC497601wk interfaceC497601wk, VideoPublishEditModel videoPublishEditModel, InterfaceC381790Ey1 interfaceC381790Ey1) {
        super(interfaceC497601wk, videoPublishEditModel, interfaceC381790Ey1);
    }

    public final void LJIIIIZZ(String str, InterfaceC382380Eyy interfaceC382380Eyy, C382170Eyd c382170Eyd, boolean z, EnumC381960EyI enumC381960EyI, EnumC381980EyK enumC381980EyK) {
        this.LIZLLL = interfaceC382380Eyy;
        InterfaceC497601wk interfaceC497601wk = this.LIZ;
        if (interfaceC497601wk != null) {
            C23250099c.LIZLLL(interfaceC497601wk, null, null, new C381870Ey9(this, enumC381980EyK, c382170Eyd, enumC381960EyI, str, z, interfaceC382380Eyy, null), 3);
        }
    }
}
