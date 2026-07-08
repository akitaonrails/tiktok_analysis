package X;

import Y.AObserverS218S0100000_14;
import android.content.Context;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.scene.Scene;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.ui.viewmodel.VideoPublishViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS258S0300000_14;
import kotlin.jvm.internal.AwS415S0200000_14;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: renamed from: X.0Xkg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C857640Xkg extends AbstractC855890Xhr {
    public final VideoPublishEditModel LJIIJ;
    public final Scene LJIIJJI;
    public final Function0<Boolean> LJIIL;
    public final MutableLiveData<Boolean> LJIILIIL;
    public final AwS558S0100000_14 LJIILJJIL;

    @Override // X.AbstractC855890Xhr
    public final int LIZIZ() {
        return C0FPS.ECOMMERCE.getScene();
    }

    @Override // X.AbstractC855890Xhr
    public final boolean LJFF() {
        return (this.LJIIL.invoke().booleanValue() && LJ()) || C857680Xkk.LIZIZ(this.LJIIJ);
    }

    @Override // X.AbstractC855890Xhr
    public final boolean LJ() {
        return ((IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class)).LJJZZIII();
    }

    @Override // X.AbstractC855890Xhr
    public final VideoPublishEditModel LIZJ() {
        return this.LJIIJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v30, types: [T, com.bytedance.tux.sheet.BaseSheet, com.bytedance.tux.sheet.sheet.TuxSheet] */
    @Override // X.AbstractC855890Xhr
    public final void LIZLLL(C857220Xk0 c857220Xk0, AbstractC857240Xk2 abstractC857240Xk2) {
        if (!this.LJIIL.invoke().booleanValue() && !C857680Xkk.LIZIZ(this.LJIIJ)) {
            c857220Xk0.LIZ(abstractC857240Xk2);
            return;
        }
        C856790XjJ c856790XjJ = C856790XjJ.LIZ;
        String creationId = this.LJIIJ.getCreationId();
        VideoPublishEditModel videoPublishEditModel = this.LJIIJ;
        String str = videoPublishEditModel.mShootWay;
        if (str == null) {
            str = "";
        }
        String strValueOf = String.valueOf(videoPublishEditModel.getDraftId());
        String strLJIILL = C1428470nHB.LJIILL(this.LJIIJ);
        String strLJIILIIL = C1428470nHB.LJIILIIL(this.LJIIJ);
        String musicId = this.LJIIJ.getMusicId();
        boolean zLIZIZ = C857680Xkk.LIZIZ(this.LJIIJ);
        c856790XjJ.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("creation_id", creationId);
        c2344009Gk.LJIIIIZZ("shoot_way", str);
        c2344009Gk.LJIIIIZZ("draft_id", strValueOf);
        c2344009Gk.LJIIIIZZ("enter_from", "video_edit_page");
        c2344009Gk.LJIIIIZZ("content_type", strLJIILL);
        c2344009Gk.LJIIIIZZ("content_source", strLJIILIIL);
        c2344009Gk.LJIIIIZZ("music_id", musicId);
        c2344009Gk.LIZJ(zLIZIZ ? 1 : 0, "is_sub_only_video");
        C20684815ws.LJIILLIIL("sound_copyright_check_post_notice_show", c2344009Gk.LIZ);
        C118300cf c118300cf = new C118300cf();
        c118300cf.element = 102;
        FragmentManager fragmentManagerLJIILL = C20622515mp.LJIILL(this.LIZLLL, this.LJIIJJI);
        Context contextL3 = C786410Ut5.L3(this.LJ);
        C857630Xkf c857630Xkf = new C857630Xkf(c857220Xk0, abstractC857240Xk2, this, c118300cf);
        AwS258S0300000_14 awS258S0300000_14 = new AwS258S0300000_14(this, c857220Xk0, abstractC857240Xk2, 20);
        AwS415S0200000_14 awS415S0200000_14 = new AwS415S0200000_14(c857220Xk0, abstractC857240Xk2, 125);
        C259800zU c259800zU = new C259800zU();
        C0OM1 c0om1 = new C0OM1();
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
        c1251150ifB.LIZLLL = true;
        c1251150ifB.LIZJ(new AwS415S0200000_14(awS415S0200000_14, c259800zU, 62));
        c0om1.LIZIZ(c1251150ifB);
        C425550GmP c425550GmP = new C425550GmP(contextL3);
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJJIJIL = c0om1;
        tuxSheet.LLJJJ = null;
        tuxSheet.LLJJIII = c425550GmP;
        c1390920mIc.LJIIIIZZ(1);
        DialogInterfaceOnCancelListenerC913890ZtD dialogInterfaceOnCancelListenerC913890ZtD = new DialogInterfaceOnCancelListenerC913890ZtD(awS415S0200000_14, 1);
        ?? r0 = c1390920mIc.LIZ;
        r0.LL = dialogInterfaceOnCancelListenerC913890ZtD;
        r0.LLJJIJIIJIL = true;
        c259800zU.element = r0;
        c425550GmP.setCallback(new AwS415S0200000_14(awS258S0300000_14, c259800zU, 61));
        c857630Xkf.invoke(c425550GmP, c259800zU.element);
        ((DialogFragment) c259800zU.element).show(fragmentManagerLJIILL, "showCopyRightLoadingDialog");
    }

    public C857640Xkg(VideoPublishEditModel videoPublishEditModel, Scene scene, VideoPublishViewModel videoPublishViewModel, Function0<Boolean> function0) {
        super(videoPublishEditModel, scene, videoPublishViewModel);
        this.LJIIJ = videoPublishEditModel;
        this.LJIIJJI = scene;
        this.LJIIL = function0;
        this.LJIILIIL = new MutableLiveData<>(Boolean.FALSE);
        this.LJIILJJIL = new AwS558S0100000_14(this, 1603);
        this.LJIILIIL.observe(this.LJIIJJI, new AObserverS218S0100000_14(this, 37));
    }
}
