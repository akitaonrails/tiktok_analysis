package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.social.sticker.editcomponent.EditStickerSceneSocialStickerRegisterImpl;
import com.ss.android.ugc.aweme.social.sticker.service.IEditStickerSceneSocialStickerRegister;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0oDp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1464830oDp implements IEditStickerSceneSocialStickerRegister {
    public static final C1464830oDp LIZIZ = new C1464830oDp();
    public final /* synthetic */ IEditStickerSceneSocialStickerRegister LIZ;

    @Override // com.ss.android.ugc.aweme.social.sticker.service.IEditStickerSceneSocialStickerRegister
    public final void LIZ(C539960LFq c539960LFq, C1DRG c1drg, C19A3 c19a3, VideoPublishEditModel videoPublishEditModel) {
        this.LIZ.LIZ(c539960LFq, c1drg, c19a3, videoPublishEditModel);
    }

    @Override // com.ss.android.ugc.aweme.social.sticker.service.IEditStickerSceneSocialStickerRegister
    public final void LIZIZ(C539960LFq c539960LFq) {
        this.LIZ.LIZIZ(c539960LFq);
    }

    @Override // com.ss.android.ugc.aweme.social.sticker.service.IEditStickerSceneSocialStickerRegister
    public final void LIZJ(C539960LFq c539960LFq, Function2<? super C0FQ0, ? super InterfaceC1452170ntP, Unit> function2) {
        this.LIZ.LIZJ(c539960LFq, function2);
    }

    @Override // com.ss.android.ugc.aweme.social.sticker.service.IEditStickerSceneSocialStickerRegister
    public final void LIZLLL(C539960LFq c539960LFq) {
        this.LIZ.LIZLLL(c539960LFq);
    }

    public C1464830oDp() {
        IEditStickerSceneSocialStickerRegister iEditStickerSceneSocialStickerRegister;
        Object objLIZ = C04TD.LIZ(IEditStickerSceneSocialStickerRegister.class, false);
        if (objLIZ != null) {
            iEditStickerSceneSocialStickerRegister = (IEditStickerSceneSocialStickerRegister) objLIZ;
        } else {
            if (C04TD.q5 == null) {
                synchronized (IEditStickerSceneSocialStickerRegister.class) {
                    if (C04TD.q5 == null) {
                        C04TD.q5 = new EditStickerSceneSocialStickerRegisterImpl();
                    }
                }
            }
            iEditStickerSceneSocialStickerRegister = C04TD.q5;
        }
        this.LIZ = iEditStickerSceneSocialStickerRegister;
    }
}
