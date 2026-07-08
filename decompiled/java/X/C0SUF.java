package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.text.SpannableString;
import androidx.fragment.app.Fragment;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.aigc.label.IAIGCLabelService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.ModerationAigcInfo;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.banner.BannerCommonKey;
import com.ss.android.ugc.aweme.feed.model.banner.BannerCommonStruct;
import com.ss.android.ugc.aweme.feed.model.banner.BannerCommonTailAction;
import com.ss.android.ugc.aweme.feed.param.DetailNavArgModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.aigc.CreatorOverLabelEducation;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.aigc.CreatorOverLabelEducationMaxShow;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS231S0000000_3;
import kotlin.jvm.internal.AwS377S0200000_11;
import kotlin.jvm.internal.AwS447S0200000_11;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.AwS625S0100000_11;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0SUF, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SUF extends C0SGE {
    public final int LIZJ;
    public AwS377S0200000_11 LIZLLL;
    public String LJ;
    public Fragment LJFF;

    public final void LJFF() {
        Aweme aweme = this.LIZ.LIZJ;
        String aid = aweme != null ? aweme.getAid() : null;
        this.LJ = aid;
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0H5N(aid, null), 3);
    }

    public final C19EG LJI() {
        Fragment fragment = this.LJFF;
        C19EG activity = fragment != null ? fragment.getActivity() : null;
        if (activity instanceof C19EG) {
            return activity;
        }
        return null;
    }

    public final boolean LJ() {
        C19EG c19egLJI = LJI();
        Fragment fragment = this.LJFF;
        return (fragment != null ? fragment.getView() : null) != null && (c19egLJI == null || !c19egLJI.isDestroyed());
    }

    public C0SUF(C718360SFu c718360SFu) {
        super(c718360SFu);
        this.LIZJ = CreatorOverLabelEducationMaxShow.INSTANCE.count();
    }

    @Override // X.C0SGE, X.C0SH2
    public final boolean LIZJ(VideoItemParams videoItemParams) {
        Fragment fragment;
        String str;
        String uid;
        int i;
        String aid;
        List<BannerCommonStruct> banners;
        String str2;
        String aigcOverlabelNotice;
        C2189821An6 c2189821An6;
        DetailNavArgModel navArgModel;
        ModerationAigcInfo moderationAigcInfo;
        Aweme aweme;
        User author;
        if (videoItemParams != null) {
            fragment = videoItemParams.fragment;
        } else {
            fragment = null;
        }
        this.LJFF = fragment;
        if (!CreatorOverLabelEducation.INSTANCE.isEnabled() || Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            return false;
        }
        if (videoItemParams != null) {
            str = videoItemParams.mFrom;
        } else {
            str = null;
        }
        if (!Intrinsics.LJFF(str, "from_notification_page") && !Intrinsics.LJFF(str, "from_profile_self")) {
            return false;
        }
        if (videoItemParams != null && (aweme = videoItemParams.getAweme()) != null && (author = aweme.getAuthor()) != null) {
            uid = author.getUid();
        } else {
            uid = null;
        }
        if (Intrinsics.LJFF(uid, ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().getUid()) && videoItemParams != null) {
            Aweme aweme2 = videoItemParams.getAweme();
            if (aweme2 != null && (moderationAigcInfo = aweme2.getModerationAigcInfo()) != null) {
                i = moderationAigcInfo.moderationOverLabelWarning;
            } else {
                i = -1;
                if (videoItemParams != null) {
                }
            }
            Aweme aweme3 = videoItemParams.getAweme();
            if (aweme3 != null && (aid = aweme3.getAid()) != null) {
                if (Intrinsics.LJFF(str, "from_notification_page")) {
                    BaseFeedPageParams baseFeedPageParams = videoItemParams.baseFeedPageParams;
                    if (baseFeedPageParams != null && (c2189821An6 = baseFeedPageParams.param) != null && (navArgModel = c2189821An6.getNavArgModel()) != null) {
                        aigcOverlabelNotice = navArgModel.getAigcOverlabelNotice();
                    } else {
                        aigcOverlabelNotice = null;
                    }
                    if (!Intrinsics.LJFF(aigcOverlabelNotice, "1")) {
                        return false;
                    }
                }
                if (Intrinsics.LJFF(this.LJ, aid) || i != 100) {
                    return false;
                }
                C0H5M.LIZ.getClass();
                if (aid.length() != 0 && ((Keva) C0H5M.LIZIZ.getValue()).getBoolean(C0H5M.LIZIZ("suppressed", aid), false)) {
                    return false;
                }
                if (C0H5M.LIZ(aid) >= this.LIZJ) {
                    C0H5M.LIZJ(aid);
                    LJIIIZ("1", null, AFwS231S0000000_3.get$arr$(168));
                    return false;
                }
                Aweme aweme4 = videoItemParams.getAweme();
                if (aweme4 != null && (banners = aweme4.getBanners()) != null && !banners.isEmpty()) {
                    Iterator<BannerCommonStruct> it2 = banners.iterator();
                    while (it2.hasNext()) {
                        BannerCommonKey bannerCommonKey = it2.next().bannerKey;
                        if (bannerCommonKey != null) {
                            str2 = bannerCommonKey.componentKey;
                        } else {
                            str2 = null;
                        }
                        if (Intrinsics.LJFF(str2, "bottom_banner_aigc_overlabel")) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void LJII(String str) {
        ModerationAigcInfo moderationAigcInfo;
        String str2;
        User author;
        Aweme aweme = this.LIZ.LIZJ;
        String uid = null;
        if (aweme != null && (author = aweme.getAuthor()) != null) {
            uid = author.getUid();
        }
        String str3 = "";
        if (uid == null) {
            uid = "";
        }
        if (aweme != null && (moderationAigcInfo = aweme.getModerationAigcInfo()) != null && (str2 = moderationAigcInfo.moderationCreatorSegment) != null) {
            str3 = str2;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("author_id", uid);
        c2344009Gk.LJIIIIZZ("creator_segment", str3);
        c2344009Gk.LJIIIIZZ("action_type", str);
        C20684815ws.LJIILLIIL("aigc_overlabel_warning_action", c2344009Gk.LIZ);
    }

    public final void LJIIIIZZ(C19EG c19eg) {
        ModerationAigcInfo moderationAigcInfo;
        String str;
        User author;
        C1391960mKI c1391960mKI = new C1391960mKI();
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56));
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56));
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_ai_self;
        c419910GdJ.LIZIZ = iLIZIZ;
        c419910GdJ.LIZJ = iLIZIZ2;
        Drawable drawableMutate = c419910GdJ.LIZ(c19eg).mutate();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iLIZIZ, iLIZIZ2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(1);
        float f = iLIZIZ;
        float f2 = iLIZIZ2;
        String uid = null;
        paint.setShader(new LinearGradient(0.0f, 0.0f, f, f2, new int[]{-10712065, -6591489, -41551}, (float[]) null, Shader.TileMode.CLAMP));
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, f, f2, null);
        drawableMutate.setBounds(0, 0, iLIZIZ, iLIZIZ2);
        drawableMutate.draw(canvas);
        canvas.drawRect(0.0f, 0.0f, f, f2, paint);
        canvas.restoreToCount(iSaveLayer);
        c1391960mKI.LIZLLL = new BitmapDrawable(c19eg.getResources(), bitmapCreateBitmap);
        c1391960mKI.LJII = c19eg.getString(2131826269);
        String string = c19eg.getString(2131826267);
        String string2 = c19eg.getString(2131826268);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(string);
        sbLIZ.append(' ');
        sbLIZ.append(string2);
        CharSequence charSequenceLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        int iLJJJ = a0.LJJJ(charSequenceLIZIZ, string2, 0, false, 6);
        if (iLJJJ >= 0) {
            int length = string2.length() + iLJJJ;
            SpannableString spannableString = new SpannableString(charSequenceLIZIZ);
            C786410Ut5.p2(spannableString, new C738660SyG(this, c19eg, 3), iLJJJ, length, 17);
            C786410Ut5.p2(spannableString, new C444920HcY(42, false), iLJJJ, length, 17);
            charSequenceLIZIZ = spannableString;
        }
        c1391960mKI.LJIIIIZZ = charSequenceLIZIZ;
        c1391960mKI.LJIIL = false;
        c1391960mKI.LIZJ(c19eg.getString(2131826265), new AwS625S0100000_11(this, 110));
        c1391960mKI.LIZIZ(c19eg.getString(2131826266), new AwS447S0200000_11(this, c19eg, 17));
        c1391960mKI.LIZ().LIZ.show(c19eg.getSupportFragmentManager(), "aigc_overlabel_intro_panel");
        Aweme aweme = this.LIZ.LIZJ;
        if (aweme != null && (author = aweme.getAuthor()) != null) {
            uid = author.getUid();
        }
        String str2 = "";
        if (uid == null) {
            uid = "";
        }
        if (aweme != null && (moderationAigcInfo = aweme.getModerationAigcInfo()) != null && (str = moderationAigcInfo.moderationCreatorSegment) != null) {
            str2 = str;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("author_id", uid);
        c2344009Gk.LJIIIIZZ("creator_segment", str2);
        c2344009Gk.LJIIIIZZ("region", C2222691Bz1.LIZ());
        C844470XAv.LIZ.getClass();
        c2344009Gk.LJIIIIZZ("client_version", C844470XAv.LJFF());
        C20684815ws.LJIILLIIL("aigc_overlabel_warning_show", c2344009Gk.LIZ);
    }

    @Override // X.C0SGE, X.C0SH2
    public final void LIZ(int i, String str) {
        C19EG c19egLJI = LJI();
        if (c19egLJI != null) {
            LJIIIIZZ(c19egLJI);
        }
    }

    @Override // X.C0SGE, X.C0SH2
    public final void LIZIZ(BannerCommonTailAction.BannerActionType bannerActionType, C0SH1 c0sh1) {
        C19EG c19egLJI;
        if (bannerActionType == BannerCommonTailAction.BannerActionType.BANNER_ACTION_TYPE_ARROW_JUMP && (c19egLJI = LJI()) != null) {
            LJIIIIZZ(c19egLJI);
        }
    }

    public final void LJIIIZ(String str, String str2, Function1<? super Boolean, Unit> function1) {
        String aid;
        User author;
        Aweme aweme = this.LIZ.LIZJ;
        String uid = null;
        if (aweme != null && (author = aweme.getAuthor()) != null) {
            uid = author.getUid();
        }
        String str3 = "";
        if (uid == null) {
            uid = "";
        }
        if (aweme != null && (aid = aweme.getAid()) != null) {
            str3 = aid;
        }
        if (uid.length() != 0 && str3.length() != 0) {
            IAIGCLabelService iAIGCLabelService = (IAIGCLabelService) PluggableExtentionKt.pluggableSpi$default(IAIGCLabelService.class, false, false, false, 14, null);
            if (iAIGCLabelService != null) {
                iAIGCLabelService.LIZ(uid, str3, str, str2, new AwS581S0100000_2((Function1) function1, (Function1<Object, String>) 488), new AwS581S0100000_2((Function1) function1, (Function1<Object, String>) 489));
                return;
            } else {
                function1.invoke(Boolean.FALSE);
                return;
            }
        }
        function1.invoke(Boolean.FALSE);
    }
}
