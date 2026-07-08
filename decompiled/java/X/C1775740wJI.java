package X;

import Y.AObjectS400S0100000_26;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.commentv2.commentlist.powercell.BaseCommentCell;
import com.ss.android.ugc.aweme.prop.activity.EffectMobileTemplateEditActivity;
import com.ss.android.ugc.aweme.prop.fragment.StickerPropDetailFragment;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.MobileEffectData;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS605S0100000_26;

/* JADX INFO: renamed from: X.0wJI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public class C1775740wJI extends AbstractViewOnClickListenerC372950Ejl {
    public final int $t;
    public Object l0;

    @Override // X.AbstractViewOnClickListenerC372950Ejl
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                break;
            case 1:
                LIZ$1(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1775740wJI(BaseCommentCell baseCommentCell, int i) {
        super(700L);
        this.$t = i;
        this.l0 = baseCommentCell;
    }

    public static final void LIZ$0(C1775740wJI c1775740wJI, View view) {
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("ame_edit_effect_with_two_icons", true)) {
            StickerPropDetailFragment stickerPropDetailFragment = (StickerPropDetailFragment) c1775740wJI.l0;
            C323780Cme.LIZ(stickerPropDetailFragment, stickerPropDetailFragment.cS(), stickerPropDetailFragment.LLLLLZ, new AObjectS400S0100000_26(c1775740wJI, 8));
            return;
        }
        StickerPropDetailFragment stickerPropDetailFragment2 = (StickerPropDetailFragment) c1775740wJI.l0;
        NewFaceStickerBean newFaceStickerBean = stickerPropDetailFragment2.LLLLLZ;
        C1776030wJl c1776030wJl = new C1776030wJl(c1775740wJI, 0);
        String str = EffectMobileTemplateEditActivity._pnsPageId;
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(stickerPropDetailFragment2, "//effect-mobile-template/edit");
        smartRouteBuildRoute.withParam("effect_init_data", new MobileEffectData(EnumC1733870vDl.EDIT, null, null, null, newFaceStickerBean, null, null, null, null, false, null, null, 4078));
        smartRouteBuildRoute.withParam("ENTER_FROM", "prop_page");
        smartRouteBuildRoute.open(0, c1776030wJl);
    }

    public static final void LIZ$1(C1775740wJI c1775740wJI, View view) {
        C19EG activity;
        FragmentManager supportFragmentManager;
        if (view != null) {
            BaseCommentCell baseCommentCell = (BaseCommentCell) c1775740wJI.l0;
            Context context = baseCommentCell.itemView.getContext();
            C770750ULh c770750ULh = new C770750ULh();
            c770750ULh.LJ = context.getString(2131822435);
            c770750ULh.LIZJ(context.getString(2131822434));
            c770750ULh.LJI(context.getString(2131827840), AFwS268S0000000_26.get$arr$(695));
            c770750ULh.LJII(context.getString(2131858223), new AwS605S0100000_26(context, 767));
            c770750ULh.LJIJ = true;
            c770750ULh.LJIILLIIL = true;
            TuxSheet tuxSheet = c770750ULh.LIZIZ().LIZ;
            Fragment fragment = baseCommentCell.getFragment();
            if (fragment != null && (activity = fragment.getActivity()) != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null) {
                tuxSheet.show(supportFragmentManager, "tako_intro");
            }
        }
    }

    public C1775740wJI(StickerPropDetailFragment stickerPropDetailFragment, int i) {
        this.$t = i;
        this.l0 = stickerPropDetailFragment;
    }
}
