package X;

import androidx.lifecycle.LiveData;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import com.ss.android.ugc.aweme.sticker.AddYoursStickerTopicRepo;
import com.ss.android.ugc.aweme.tools.sticker.core.addyours.AddYoursStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.addyours.AddYoursStickerTopicRepoApi;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0sys, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1647760sys implements InterfaceC390170FRn {
    public final /* synthetic */ VideoPublishEditModel LIZ;
    public final /* synthetic */ InterfaceC1647770syt LIZIZ;

    @Override // X.InterfaceC390170FRn
    public final boolean LIZLLL() {
        return false;
    }

    @Override // X.InterfaceC390170FRn
    public final InterfaceC390200FRq LIZ() {
        InterfaceC1647770syt interfaceC1647770syt = this.LIZIZ;
        if (interfaceC1647770syt != null) {
            return interfaceC1647770syt.LIZ();
        }
        return null;
    }

    @Override // X.InterfaceC390170FRn
    public final LiveData<List<AddYoursStickerTopicRepoApi.AddYoursTopicRecommendInfo>> LIZIZ() {
        InterfaceC1647770syt interfaceC1647770syt = this.LIZIZ;
        if (interfaceC1647770syt != null) {
            return interfaceC1647770syt.LIZIZ();
        }
        return null;
    }

    @Override // X.InterfaceC390170FRn
    public final boolean LJ() {
        C01GW c01gw = C299960BpK.LIZ;
        return C299960BpK.LIZIZ;
    }

    @Override // X.InterfaceC390170FRn
    public final void LJFF() {
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C0LAB c0lab = new C0LAB();
        VideoPublishEditModel videoPublishEditModel = this.LIZ;
        C1403900mdY.LIZ.getClass();
        C1403900mdY.LJ(videoPublishEditModel, c0lab);
        c0lab.LJ("add_yours_enter_method", "edit_page_text_entrance");
        C2341909Fp.LIZ("show_text_page_add_yours_icon", c0lab.LIZ);
    }

    @Override // X.InterfaceC390170FRn
    public final boolean LJI() {
        return u4.LJJIJIIJIL(this.LIZ);
    }

    @Override // X.InterfaceC390170FRn
    public final AddYoursStickerTopicRepo LJII() {
        return new AddYoursStickerTopicRepo();
    }

    @Override // X.InterfaceC390170FRn
    public final int LJIIIIZZ() {
        return (!u4.LJJIJIIJIL(this.LIZ) || C299960BpK.LIZIZ) ? 2131825072 : 2131836221;
    }

    @Override // X.InterfaceC390170FRn
    public final boolean LJIIIZ() {
        return ((Number) C0B9Q.LIZ.getValue()).intValue() == 1 && u4.LJII(this.LIZ) && C0CHQ.LIZ().getAccountService().isLogin() && !C568750MSj.LIZIZ(this.LIZ);
    }

    @Override // X.InterfaceC390170FRn
    public final void LJIIL() {
        InterfaceC1647770syt interfaceC1647770syt = this.LIZIZ;
        if (interfaceC1647770syt != null) {
            interfaceC1647770syt.LIZLLL("Closing", true);
        }
    }

    public C1647760sys(VideoPublishEditModel videoPublishEditModel, InterfaceC1647770syt interfaceC1647770syt) {
        this.LIZ = videoPublishEditModel;
        this.LIZIZ = interfaceC1647770syt;
    }

    @Override // X.InterfaceC390170FRn
    public final void LJIIJJI(int i, String str) {
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C0LAB c0lab = new C0LAB();
        VideoPublishEditModel videoPublishEditModel = this.LIZ;
        C1403900mdY.LIZ.getClass();
        C1403900mdY.LJ(videoPublishEditModel, c0lab);
        c0lab.LJ("add_yours_enter_method", "edit_page_text_entrance");
        c0lab.LJ("add_yours_title", str);
        c0lab.LIZ(i, "add_yours_position");
        C2341909Fp.LIZ("click_text_page_add_yours_icon", c0lab.LIZ);
    }

    @Override // X.InterfaceC390170FRn
    public final void LIZJ(String str, String str2, boolean z) {
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C0LAB c0lab = new C0LAB();
        VideoPublishEditModel videoPublishEditModel = this.LIZ;
        C1403900mdY.LIZ.getClass();
        C1403900mdY.LJ(videoPublishEditModel, c0lab);
        c0lab.LJ("add_yours_enter_method", str2);
        c0lab.LJ("from_title", str);
        c0lab.LIZ(z ? 1 : 0, "is_first_enter");
        c0lab.LIZ(videoPublishEditModel.creativeModel.draftInfoModel.isDraft ? 1 : 0, "is_draft");
        C2341909Fp.LIZ("enter_add_yours_edit_page", c0lab.LIZ);
    }

    @Override // X.InterfaceC390170FRn
    public final void LJIIJ(String str, String str2, boolean z, String str3, int i, AddYoursStickerModel addYoursStickerModel) {
        String str4;
        if ((!a0.LJJJIL(str)) && str.length() > 0) {
            List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
            C0LAB c0lab = new C0LAB();
            VideoPublishEditModel videoPublishEditModel = this.LIZ;
            C1403900mdY.LIZ.getClass();
            C1403900mdY.LJ(videoPublishEditModel, c0lab);
            c0lab.LJ("add_yours_enter_method", str3);
            c0lab.LJ("save_title", str);
            c0lab.LJ("input_mode", str2);
            c0lab.LIZ(z ? 1 : 0, "is_first_enter");
            c0lab.LIZ(videoPublishEditModel.creativeModel.draftInfoModel.isDraft ? 1 : 0, "is_draft");
            String initialRecommendTopicByContent = addYoursStickerModel.getInitialRecommendTopicByContent();
            if (initialRecommendTopicByContent != null) {
                if (Intrinsics.LJFF(str, initialRecommendTopicByContent)) {
                    str4 = CardStruct.IStatusCode.DEFAULT;
                } else {
                    str4 = "1";
                }
                c0lab.LJ("is_creation_add_yours_card_edit", str4);
            }
            c0lab.LIZ(i, "is_operation_set");
            C1403900mdY.LJIIIIZZ(addYoursStickerModel, c0lab);
            C2341909Fp.LIZ("complete_add_yours_edit_page", c0lab.LIZ);
        }
    }

    @Override // X.InterfaceC390170FRn
    public final void LJIILIIL(int i, String str, String str2, String str3, String str4, boolean z) {
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C0LAB c0lab = new C0LAB();
        VideoPublishEditModel videoPublishEditModel = this.LIZ;
        C1403900mdY.LIZ.getClass();
        C1403900mdY.LJ(videoPublishEditModel, c0lab);
        c0lab.LJ("add_yours_enter_method", str4);
        c0lab.LJ("from_title", str);
        c0lab.LJ("to_title", str2);
        c0lab.LJ("click_method", str3);
        c0lab.LIZ(z ? 1 : 0, "is_first_enter");
        c0lab.LIZ(videoPublishEditModel.creativeModel.draftInfoModel.isDraft ? 1 : 0, "is_draft");
        c0lab.LIZ(i, "is_operation_set");
        C2341909Fp.LIZ("click_add_yours_edit_page_icon", c0lab.LIZ);
    }
}
