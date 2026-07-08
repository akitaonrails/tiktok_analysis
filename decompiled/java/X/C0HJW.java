package X;

import com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi;
import kotlin.jvm.internal.AFwS192S0000000_6;

/* JADX INFO: renamed from: X.0HJW, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HJW {
    public final String LIZ;
    public final C2252321DDq LIZIZ;
    public final AnonymousClass0951 LIZJ;
    public final C054G LIZLLL;
    public final C01GW LJ;
    public final C01GW LJFF;
    public AnonymousClass0956 LJI;
    public final C01GW LJII;
    public final C01GW LJIIIIZZ;
    public final C01GW LJIIIZ;

    public final C1910890zpH LIZ() {
        return (C1910890zpH) this.LJII.getValue();
    }

    public final C438950HJd LIZIZ() {
        return (C438950HJd) this.LJFF.getValue();
    }

    public final void LIZJ() {
        C437570HDv c437570HDv = ((C437560HDu) this.LIZIZ.getValue()).LIZJ;
        C2252321DDq c2252321DDq = this.LIZIZ;
        c2252321DDq.setValue(C437560HDu.LIZ((C437560HDu) c2252321DDq.getValue(), null, null, c437570HDv, null, false, false, false, null, null, null, 1019));
    }

    public final void LJ() {
        if (this.LJI != null) {
            return;
        }
        C1910890zpH c1910890zpHLIZ = LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("startListeningToProgress, this has hashcode as ");
        sbLIZ.append(hashCode());
        c1910890zpHLIZ.LIZ("SocialAvatarCreationStatusDataSource", C2188811AlT.LIZIZ(sbLIZ));
        this.LJI = C23250099c.LIZLLL(this.LIZLLL, null, null, new C0HJU(this, null), 3);
    }

    public final void LIZLLL() {
        C1910890zpH c1910890zpHLIZ = LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("showFailurePushForUploadingBreak, SocialAvatarKeva.checkUploadingFlowEnded() is ");
        C0HYP.LIZ.getClass();
        sbLIZ.append(!C0HYP.LJ().getBoolean("uploading_flow_started", false));
        c1910890zpHLIZ.LIZ("SocialAvatarCreationStatusDataSource", C2188811AlT.LIZIZ(sbLIZ));
        if (!(!C0HYP.LJ().getBoolean("uploading_flow_started", false)) && (!C0HYP.LJ().getBoolean("has_shown_failure_push", false))) {
            C054G c054g = this.LIZLLL;
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(c054g, C2107308Nj.LIZ, null, new C0HJZ(this, null), 2);
        }
    }

    public C0HJW(String str) {
        this.LIZ = str;
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(new C437560HDu(null, 1023));
        this.LIZIZ = c2252321DDqLIZ;
        this.LIZJ = C09IC.LIZIZ(c2252321DDqLIZ);
        C054G c054gLIZ = C2296808zG.LIZ(C0PEM.LIZJ);
        this.LIZLLL = c054gLIZ;
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(602));
        this.LJ = c01gwLIZIZ;
        this.LJFF = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(603));
        this.LJII = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(601));
        this.LJIIIIZZ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(599));
        this.LJIIIZ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(600));
        C1910890zpH c1910890zpHLIZ = LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("init, hashcode is ");
        sbLIZ.append(hashCode());
        sbLIZ.append(", progressStateflow has hashcode as ");
        sbLIZ.append(c01gwLIZIZ.getValue().hashCode());
        sbLIZ.append(", statusStateflow has hashcode as ");
        sbLIZ.append(LIZIZ().hashCode());
        c1910890zpHLIZ.LIZ("SocialAvatarCreationStatusDataSource", C2188811AlT.LIZIZ(sbLIZ));
        C23250099c.LIZLLL(c054gLIZ, null, null, new C0HJV(this, null), 3);
    }

    public final void LJFF(EnumC437540HDs enumC437540HDs) {
        C1910890zpH c1910890zpHLIZ = LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateGenerationStatus newStatus as ");
        sbLIZ.append(enumC437540HDs);
        sbLIZ.append(", this has hashcode as ");
        sbLIZ.append(hashCode());
        c1910890zpHLIZ.LIZ("SocialAvatarCreationStatusDataSource", C2188811AlT.LIZIZ(sbLIZ));
        C2252321DDq c2252321DDq = this.LIZIZ;
        c2252321DDq.setValue(C437560HDu.LIZ((C437560HDu) c2252321DDq.getValue(), enumC437540HDs, null, null, null, false, false, false, null, null, null, 508));
        if (C1697810uHb.LJIIJJI(EnumC437540HDs.IN_QUEUE, EnumC437540HDs.GENERATING, EnumC437540HDs.REGENERATING).contains(enumC437540HDs)) {
            LIZ().LIZ("SocialAvatarCreationStatusDataSource", "updateGenerationStatus and setUploadingFlowStarted as false");
            C0HYP.LIZ.getClass();
            C0HYP.LJ().storeBoolean("has_shown_failure_push", false);
            C0HYP.LJ().storeBoolean("has_clicked_failure_push_profile_edit", false);
        }
    }

    public final void LJI(int i) {
        IMStickerApi.LIZ.LIZIZ().getImSocialAvatarService().LJ(i, this.LIZ);
    }
}
