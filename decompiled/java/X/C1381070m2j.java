package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.actionsheet.TuxActionSheet;
import com.ss.android.ugc.aweme.cla.et.newet.CaptionsAndTranslationEntranceShowEvent;
import com.ss.android.ugc.aweme.cla.et.newet.ManageCaptionsShowEvent;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CaptionItemModel;
import com.ss.android.ugc.aweme.feed.model.CaptionModel;
import com.ss.android.ugc.aweme.feed.model.CaptionModelKt;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.service.ICLACaptionService;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AwS387S0200000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0m2j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1381070m2j implements InterfaceC1370310llN {
    public static final /* synthetic */ int LLILZIL = 0;
    public final Activity LL;
    public final Aweme LLILLJJLI;
    public final String LLILLL;
    public boolean LLILZ;

    @Override // X.InterfaceC1370310llN
    public final float LIZLLL() {
        return -1.0f;
    }

    @Override // X.InterfaceC1370310llN
    public final void LJI() {
    }

    @Override // X.InterfaceC1370310llN
    public final boolean LJIIIZ() {
        return false;
    }

    @Override // X.InterfaceC1370310llN
    public final Integer LJIILJJIL() {
        return null;
    }

    @Override // X.InterfaceC1370310llN
    public final void LJIILL(InterfaceC1362720lZ8 interfaceC1362720lZ8) {
    }

    @Override // X.InterfaceC1370310llN
    public final int LJIJJLI() {
        return 0;
    }

    @Override // X.InterfaceC1370310llN
    public final void LJJIIZI(View view, BaseSharePackage baseSharePackage) {
    }

    @Override // X.InterfaceC1370310llN
    public final void LJJIJ(ImageView imageView, View view, int i) {
    }

    @Override // X.InterfaceC1370310llN
    public final Integer LJJIJIIJIL() {
        return null;
    }

    @Override // X.InterfaceC1370310llN
    public final boolean LJJIL() {
        return true;
    }

    @Override // X.InterfaceC1370310llN
    public final String LJJIZ() {
        return "";
    }

    @Override // X.InterfaceC1370310llN
    public final void LJJJI(Context context, BaseSharePackage baseSharePackage) {
    }

    @Override // X.InterfaceC1370310llN
    public final Integer LJJJJIZL() {
        return null;
    }

    @Override // X.InterfaceC1370310llN
    public final boolean LJJJJL() {
        return false;
    }

    @Override // X.InterfaceC1370450llb
    public final int LJJJJLI() {
        return 100;
    }

    @Override // X.InterfaceC1370310llN
    public final boolean LJJJLZIJ() {
        return false;
    }

    @Override // X.InterfaceC1370310llN
    public final boolean LJJLIIIJL() {
        return false;
    }

    @Override // X.InterfaceC1370310llN
    public final String key() {
        return "captions";
    }

    @Override // X.InterfaceC1370310llN
    public final String label() {
        return "";
    }

    public final boolean LIZIZ() {
        return C20703515zt.LJJIJIIJI(this.LLILLJJLI) && !C0SXF.LJIJJ(this.LLILLJJLI);
    }

    public final boolean LJ() {
        Aweme aweme = this.LLILLJJLI;
        C20703515zt c20703515zt = C20703515zt.LIZ;
        return C20703515zt.LJJIJIL(aweme, Boolean.FALSE) && !C0SXF.LJIL(this.LL);
    }

    @Override // X.InterfaceC1370310llN
    public final int LJII() {
        return (LIZIZ() || LJ()) ? LJ() ? R.raw.icon_closed_captions_pen_fill : R.raw.icon_closed_captions_fill : R.raw.icon_text_latin;
    }

    @Override // X.InterfaceC1370310llN
    public final int LJIIIIZZ() {
        return (LIZIZ() || LJ()) ? LJ() ? R.raw.icon_closed_captions_pen_fill : R.raw.icon_closed_captions_fill : R.raw.icon_text_latin;
    }

    @Override // X.InterfaceC1370310llN
    public final int LJIIJJI() {
        return !enable() ? 1 : 0;
    }

    @Override // X.InterfaceC1370310llN
    public final int LJJLIIIJJIZ() {
        return (LJ() || LIZIZ()) ? LJ() ? 2131828788 : 2131833213 : C161N.LIZIZ.LJIJI(this.LLILLJJLI) ? 2131828833 : 2131828821;
    }

    @Override // X.InterfaceC1370310llN
    public final boolean enable() {
        return C293260BeW.LIZ();
    }

    @Override // X.InterfaceC1370310llN
    public final C0M7Z LJIIJ() {
        return C0M7Z.ShareButton;
    }

    @Override // X.InterfaceC1370310llN
    public final EnumC1216710hld LJJJZ() {
        return EnumC1216710hld.NORMAL;
    }

    public final void LIZ(EnumC1381090m2l enumC1381090m2l) {
        int i;
        if (this.LLILLJJLI == null) {
            return;
        }
        CaptionsAndTranslationEntranceShowEvent captionsAndTranslationEntranceShowEvent = new CaptionsAndTranslationEntranceShowEvent();
        captionsAndTranslationEntranceShowEvent.LIZ().add(C161N.LIZIZ.LJJIJIIJIL(new WeakReference<>(this.LL), this.LLILLJJLI, this.LLILLL));
        int iOrdinal = enumC1381090m2l.ordinal();
        if (iOrdinal != 0) {
            i = 1;
            if (iOrdinal != 1) {
                i = 2;
                if (iOrdinal != 2) {
                    throw new C1954807lC();
                }
            }
        } else {
            i = 0;
        }
        captionsAndTranslationEntranceShowEvent.LJI(Integer.valueOf(i), "is_edit_available");
        captionsAndTranslationEntranceShowEvent.LJI("share_panel", "enter_method");
        captionsAndTranslationEntranceShowEvent.LJIIIIZZ();
    }

    @Override // X.InterfaceC1370310llN
    public final void LJIJJ(TextView textView) {
        C1370320llO.LJ(this, textView);
    }

    @Override // X.InterfaceC1370310llN
    public final int LJJJJ(EnumC1369720lkQ enumC1369720lkQ) {
        return C1370320llO.LIZJ(enumC1369720lkQ);
    }

    @Override // X.InterfaceC1370310llN
    public final void LJJJJI(BaseSharePackage baseSharePackage) {
        if (!this.LLILZ) {
            if (!LIZIZ() && !LJ()) {
                LIZ(EnumC1381090m2l.LL);
            } else if (this.LLILLJJLI != null) {
                ManageCaptionsShowEvent manageCaptionsShowEvent = new ManageCaptionsShowEvent();
                manageCaptionsShowEvent.LIZ().add(C161N.LIZIZ.LJJIJIIJIL(new WeakReference<>(this.LL), this.LLILLJJLI, this.LLILLL));
                manageCaptionsShowEvent.LJIIIIZZ();
            }
            this.LLILZ = true;
        }
    }

    @Override // X.InterfaceC1370310llN
    public final void LJIILIIL(Context context, BaseSharePackage baseSharePackage) {
        C19EG c19eg;
        Long lValueOf;
        CaptionItemModel captionItemModelLJIIIIZZ;
        Long lLJIIJ;
        String authorUid;
        String groupId;
        String authorUid2;
        C19EG c19eg2;
        FragmentManager supportFragmentManager;
        Video video;
        Video video2;
        CaptionModel captionModel;
        if (!enable()) {
            return;
        }
        String aid = null;
        if (LIZIZ()) {
            Aweme aweme = this.LLILLJJLI;
            if (aweme == null || (video2 = aweme.getVideo()) == null || (captionModel = video2.getCaptionModel()) == null || (lLJIIJ = CaptionModelKt.getCreatorEditedCaptionIdIfExists(captionModel)) == null) {
                Aweme aweme2 = this.LLILLJJLI;
                if (aweme2 != null) {
                    lLJIIJ = C20703515zt.LJIIJ(aweme2);
                } else {
                    lLJIIJ = null;
                }
            }
            String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
            Aweme aweme3 = this.LLILLJJLI;
            Object objValueOf = "";
            if (aweme3 == null || (authorUid = AwemeExtKt.getAuthorUid(aweme3)) == null) {
                authorUid = "";
            }
            EnumC1390800mIQ enumC1390800mIQ = EnumC1390800mIQ.MANAGE_CAPTIONS;
            boolean zLJFF = Intrinsics.LJFF(curUserId, authorUid);
            C2344009Gk c2344009Gk = new C2344009Gk();
            Aweme aweme4 = this.LLILLJJLI;
            if (aweme4 == null || (groupId = aweme4.getGroupId()) == null) {
                groupId = "";
            }
            c2344009Gk.LJIIIIZZ("group_id", groupId);
            Aweme aweme5 = this.LLILLJJLI;
            if (aweme5 == null || (authorUid2 = AwemeExtKt.getAuthorUid(aweme5)) == null) {
                authorUid2 = "";
            }
            c2344009Gk.LJIIIIZZ("author_id", authorUid2);
            c2344009Gk.LJIIIIZZ("enter_from", this.LLILLL);
            c2344009Gk.LIZJ(0, "use_transl");
            c2344009Gk.LJIIIIZZ("enter_method", EnumC1390800mIQ.SHARE_PANEL.getValue());
            Aweme aweme6 = this.LLILLJJLI;
            if (aweme6 != null && (video = aweme6.getVideo()) != null) {
                objValueOf = Integer.valueOf(video.getDuration());
            }
            c2344009Gk.LJ(objValueOf, "item_duration");
            c2344009Gk.LJIIIIZZ("user_id", ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID());
            c2344009Gk.LJIIIIZZ("subtitle_type", C20703515zt.LJIIJJI(this.LLILLJJLI));
            c2344009Gk.LIZJ(0, "subtitle_lang");
            c2344009Gk.LIZJ(0, "subtitle_source_lang");
            c2344009Gk.LIZJ(0, "has_subtitle");
            c2344009Gk.LJIIIIZZ("target_lang", C161N.LIZIZ.LLIIZ());
            c2344009Gk.LIZJ(0, "is_to_turn_on");
            c2344009Gk.LJIIIIZZ("enter_method", enumC1390800mIQ.getValue());
            c2344009Gk.LJIIIIZZ("author_options", "add");
            c2344009Gk.LIZJ(zLJFF ? 1 : 0, "is_author");
            Aweme aweme7 = this.LLILLJJLI;
            C1390830mIT.LIZ(c2344009Gk, aweme7, null, C20703515zt.LIZ(aweme7, null, null));
            C20684815ws.LJIILLIIL("show_subtitle_options", c2344009Gk.LIZ);
            if (lLJIIJ != null) {
                long jLongValue = lLJIIJ.longValue();
                C1247510iZJ c1247510iZJ = new C1247510iZJ();
                c1247510iZJ.LIZIZ(2131833204);
                c1247510iZJ.LIZJ = 0;
                c1247510iZJ.LIZ(new C1381080m2k(this, context, jLongValue));
                C1247510iZJ c1247510iZJ2 = new C1247510iZJ();
                c1247510iZJ2.LIZIZ(2131828778);
                c1247510iZJ2.LIZJ = 0;
                c1247510iZJ2.LIZ(new AwS387S0200000_21(this, context, 60));
                LIZ(EnumC1381090m2l.LLILLJJLI);
                C1390850mIV c1390850mIV = new C1390850mIV();
                c1390850mIV.LIZIZ(c1247510iZJ2, c1247510iZJ);
                TuxActionSheet tuxActionSheetLIZJ = c1390850mIV.LIZJ();
                Activity activity = this.LL;
                if ((activity instanceof C19EG) && (c19eg2 = (C19EG) activity) != null && (supportFragmentManager = c19eg2.getSupportFragmentManager()) != null) {
                    tuxActionSheetLIZJ.show(supportFragmentManager, "Manage captions");
                    return;
                }
                C1389890mGx c1389890mGx = new C1389890mGx(this.LL);
                c1389890mGx.LJIIIZ(2131848597);
                c1389890mGx.LJIIJJI();
                return;
            }
            C1389890mGx c1389890mGx2 = new C1389890mGx(this.LL);
            c1389890mGx2.LJIIIZ(2131848597);
            c1389890mGx2.LJIIJJI();
            return;
        }
        if (LJ()) {
            ICLACaptionService iCLACaptionService = (ICLACaptionService) ServiceManager.get().getService(ICLACaptionService.class);
            String str = this.LLILLL;
            EnumC1390800mIQ enumC1390800mIQ2 = EnumC1390800mIQ.SHARE_PANEL;
            Aweme aweme8 = this.LLILLJJLI;
            if (aweme8 != null && (captionItemModelLJIIIIZZ = C20703515zt.LJIIIIZZ(aweme8)) != null) {
                lValueOf = Long.valueOf(captionItemModelLJIIIIZZ.claSubtitleId);
            } else {
                lValueOf = null;
            }
            iCLACaptionService.LJI(context, str, enumC1390800mIQ2, aweme8, false, lValueOf);
            return;
        }
        Activity activity2 = this.LL;
        if (activity2 instanceof C19EG) {
            c19eg = (C19EG) activity2;
        } else {
            c19eg = null;
        }
        if (baseSharePackage.extras.getBoolean("is_from_long_press_panel", false) && c19eg != null) {
            ICLACaptionService iCLACaptionService2 = (ICLACaptionService) PluggableExtentionKt.pluggableSpi$default(ICLACaptionService.class, false, false, false, 14, null);
            if (iCLACaptionService2 == null) {
                return;
            }
            iCLACaptionService2.LIZIZ(c19eg, this.LLILLJJLI, this.LLILLL, EnumC1390800mIQ.SHARE_PANEL);
            return;
        }
        Aweme aweme9 = this.LLILLJJLI;
        if (aweme9 != null) {
            aid = aweme9.getAid();
        }
        C1440005kM.LIZ(new C715480S4s(aid, this.LLILLL, EnumC1390800mIQ.SHARE_PANEL, System.identityHashCode(C1388190mED.LIZ(context))));
    }

    @Override // X.InterfaceC1370310llN
    public final void LJJJJLL(View view, BaseSharePackage baseSharePackage) {
        C1370320llO.LIZ(this, view, baseSharePackage);
    }

    @Override // X.InterfaceC1370310llN
    public final void LJJLIIIIJ(View view, BaseSharePackage baseSharePackage) {
        C1370320llO.LIZIZ(this, view, baseSharePackage);
    }

    @Override // X.InterfaceC1370310llN
    public final void LJJLIIIJILLIZJL(Context context, BaseSharePackage baseSharePackage) {
        C1370320llO.LIZLLL(context, baseSharePackage, this);
    }

    public C1381070m2j(Activity activity, Aweme aweme, String str) {
        this.LL = activity;
        this.LLILLJJLI = aweme;
        this.LLILLL = str;
    }
}
