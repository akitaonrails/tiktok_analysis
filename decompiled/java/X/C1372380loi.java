package X;

import Y.AComparatorS40S0000000_21;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.model.live.RepostInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.model.AboutAdInfo;
import com.ss.android.ugc.aweme.experiment.LiveSharePanelChannelSortOptExperiment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.model.LiveShareSortModel;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.base.model.ShareContentType;
import com.ss.android.ugc.aweme.share.base.model.ShareModel;
import com.ss.android.ugc.aweme.share.improve.channel.CopyLinkChannel;
import com.ss.android.ugc.aweme.share.improve.channel.LiveRepostAddNoteChannel;
import com.ss.android.ugc.aweme.share.improve.channel.LiveRepostChannel;
import com.ss.android.ugc.aweme.share.improve.pkg.LiveSharePackage;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0loi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1372380loi {
    public static UrlModel LIZ(ImageModel imageModel) {
        if (imageModel == null) {
            return null;
        }
        UrlModel urlModel = new UrlModel();
        urlModel.setUri(imageModel.getUri());
        urlModel.setUrlList(imageModel.getUrls());
        urlModel.setUrlKey(imageModel.getUri());
        urlModel.setWidth(imageModel.width);
        urlModel.setHeight(imageModel.height);
        return urlModel;
    }

    public static IMUser LIZIZ(User user) {
        String string;
        InterfaceC20673515v3 interfaceC20673515v3K4;
        CharSequence charSequenceLJLJJI;
        IMUser iMUser = new IMUser();
        iMUser.setUid(String.valueOf(user.getId()));
        iMUser.setSecUid(user.getSecUid());
        ILiveOuterService iLiveOuterService = (ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class);
        if (iLiveOuterService != null && (interfaceC20673515v3K4 = iLiveOuterService.k4()) != null && (charSequenceLJLJJI = interfaceC20673515v3K4.LJLJJI(user)) != null) {
            string = charSequenceLJLJJI.toString();
        } else {
            string = null;
        }
        iMUser.setNickName(string);
        C1372380loi c1372380loi = LiveSharePackage.Companion;
        ImageModel avatarThumb = user.getAvatarThumb();
        c1372380loi.getClass();
        iMUser.setAvatarThumb(LIZ(avatarThumb));
        boolean z = true;
        if (user.getSecret() != 1) {
            z = false;
        }
        iMUser.setSecret(z);
        return iMUser;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List LIZLLL(final C1106210etP c1106210etP) {
        int i;
        boolean z;
        final int i2;
        final int i3;
        final int i4;
        String string;
        Bundle bundle = c1106210etP.LJJJJIZL;
        if (bundle != null && (string = bundle.getString("dislike_version", CardStruct.IStatusCode.DEFAULT)) != null) {
            i = CastIntegerProtector.parseInt(string);
        } else {
            i = 0;
        }
        Bundle bundle2 = c1106210etP.LJJJJIZL;
        if (bundle2 != null) {
            z = bundle2.getBoolean("is_preview", false);
        } else {
            z = false;
        }
        if (i > 0) {
            final int i5 = 3;
            final int i6 = 2;
            final int i7 = 1;
            if (i != 1) {
                if (i != 2 && i != 3) {
                    i2 = 0;
                    i3 = 0;
                    i4 = 0;
                } else {
                    i2 = 2131844030;
                    i3 = 2131844031;
                    i4 = 2131844032;
                }
            } else {
                i2 = 2131844027;
                i3 = 2131844028;
                i4 = 2131844029;
            }
            final int i8 = R.raw.icon_emoji_dislike;
            C1210330hbL c1210330hbL = new C1210330hbL(c1106210etP, i8, i2, i7) { // from class: X.0hbM
                public final C1106210etP LLILLJJLI;
                public final int LLILLL;
                public final int LLILZ;
                public final int LLILZIL;

                @Override // X.C1210330hbL, X.InterfaceC1370310llN
                public final String LJJIZ() {
                    return String.valueOf(this.LLILZIL);
                }

                @Override // X.C1210330hbL, X.InterfaceC1370310llN
                public final int LJIIIIZZ() {
                    return this.LLILLL;
                }

                @Override // X.C1210330hbL, X.InterfaceC1370310llN
                public final EnumC1216710hld LJJJZ() {
                    return EnumC1216710hld.SECONDDISLIKEREASON;
                }

                @Override // X.C1210330hbL, X.InterfaceC1370310llN
                public final int LJJLIIIJJIZ() {
                    return this.LLILZ;
                }

                @Override // X.C1210330hbL, X.InterfaceC1370310llN
                public final void LJIILIIL(Context context, BaseSharePackage baseSharePackage) {
                    C0J84 c0j84 = this.LLILLJJLI.LJJJJL;
                    if (c0j84 != null) {
                        c0j84.LIZ(this.LLILZIL);
                    } else {
                        super.LJIILIIL(context, baseSharePackage);
                    }
                }

                {
                    super(c1106210etP);
                    this.LLILLJJLI = c1106210etP;
                    this.LLILLL = i8;
                    this.LLILZ = i2;
                    this.LLILZIL = i7;
                }
            };
            final int i9 = R.raw.icon_eye_slash;
            C1210330hbL c1210330hbL2 = new C1210330hbL(c1106210etP, i9, i3, i6) { // from class: X.0hbM
                public final C1106210etP LLILLJJLI;
                public final int LLILLL;
                public final int LLILZ;
                public final int LLILZIL;

                @Override // X.C1210330hbL, X.InterfaceC1370310llN
                public final String LJJIZ() {
                    return String.valueOf(this.LLILZIL);
                }

                @Override // X.C1210330hbL, X.InterfaceC1370310llN
                public final int LJIIIIZZ() {
                    return this.LLILLL;
                }

                @Override // X.C1210330hbL, X.InterfaceC1370310llN
                public final EnumC1216710hld LJJJZ() {
                    return EnumC1216710hld.SECONDDISLIKEREASON;
                }

                @Override // X.C1210330hbL, X.InterfaceC1370310llN
                public final int LJJLIIIJJIZ() {
                    return this.LLILZ;
                }

                @Override // X.C1210330hbL, X.InterfaceC1370310llN
                public final void LJIILIIL(Context context, BaseSharePackage baseSharePackage) {
                    C0J84 c0j84 = this.LLILLJJLI.LJJJJL;
                    if (c0j84 != null) {
                        c0j84.LIZ(this.LLILZIL);
                    } else {
                        super.LJIILIIL(context, baseSharePackage);
                    }
                }

                {
                    super(c1106210etP);
                    this.LLILLJJLI = c1106210etP;
                    this.LLILLL = i9;
                    this.LLILZ = i3;
                    this.LLILZIL = i6;
                }
            };
            if (z) {
                final int i10 = R.raw.icon_live_dislike;
                return C1697810uHb.LJIIJJI(c1210330hbL, c1210330hbL2, new C1210330hbL(c1106210etP, i10, i4, i5) { // from class: X.0hbM
                    public final C1106210etP LLILLJJLI;
                    public final int LLILLL;
                    public final int LLILZ;
                    public final int LLILZIL;

                    @Override // X.C1210330hbL, X.InterfaceC1370310llN
                    public final String LJJIZ() {
                        return String.valueOf(this.LLILZIL);
                    }

                    @Override // X.C1210330hbL, X.InterfaceC1370310llN
                    public final int LJIIIIZZ() {
                        return this.LLILLL;
                    }

                    @Override // X.C1210330hbL, X.InterfaceC1370310llN
                    public final EnumC1216710hld LJJJZ() {
                        return EnumC1216710hld.SECONDDISLIKEREASON;
                    }

                    @Override // X.C1210330hbL, X.InterfaceC1370310llN
                    public final int LJJLIIIJJIZ() {
                        return this.LLILZ;
                    }

                    @Override // X.C1210330hbL, X.InterfaceC1370310llN
                    public final void LJIILIIL(Context context, BaseSharePackage baseSharePackage) {
                        C0J84 c0j84 = this.LLILLJJLI.LJJJJL;
                        if (c0j84 != null) {
                            c0j84.LIZ(this.LLILZIL);
                        } else {
                            super.LJIILIIL(context, baseSharePackage);
                        }
                    }

                    {
                        super(c1106210etP);
                        this.LLILLJJLI = c1106210etP;
                        this.LLILLL = i10;
                        this.LLILZ = i4;
                        this.LLILZIL = i5;
                    }
                });
            }
            return C1697810uHb.LJIIJJI(c1210330hbL, c1210330hbL2);
        }
        return C13BV.INSTANCE;
    }

    public static int LJII(Activity activity) {
        Object c098200Yq;
        int safeInsetTop;
        View decorView;
        WindowInsets rootWindowInsets;
        DisplayCutout displayCutout;
        int statusBarHeight = ScreenUtils.getStatusBarHeight(activity);
        int iIntValue = 0;
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                Window window = activity.getWindow();
                if (window != null && (decorView = window.getDecorView()) != null && (rootWindowInsets = decorView.getRootWindowInsets()) != null && (displayCutout = rootWindowInsets.getDisplayCutout()) != null) {
                    safeInsetTop = displayCutout.getSafeInsetTop();
                } else {
                    safeInsetTop = 0;
                }
                c098200Yq = Integer.valueOf(safeInsetTop);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = 0;
            }
            iIntValue = ((Number) c098200Yq).intValue();
        }
        if (statusBarHeight < iIntValue) {
            return iIntValue;
        }
        return statusBarHeight;
    }

    public static boolean LJIIIZ(C1106210etP c1106210etP) {
        if (c1106210etP.LJJJ && c1106210etP.LJJIL != null) {
            return true;
        }
        return false;
    }

    public static List LIZJ(Context context, C1106210etP c1106210etP) {
        ArrayList arrayList = new ArrayList();
        List<User> listUnmodifiableList = Collections.unmodifiableList(c1106210etP.LJJIJL);
        if (!(!listUnmodifiableList.isEmpty())) {
            listUnmodifiableList = null;
        }
        if (listUnmodifiableList != null) {
            UrlModel urlModel = new UrlModel();
            String string = context.getResources().getString(2131847897, Integer.valueOf(listUnmodifiableList.size()));
            String string2 = context.getResources().getString(2131847898);
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(listUnmodifiableList, 10));
            for (User user : listUnmodifiableList) {
                LiveSharePackage.Companion.getClass();
                arrayList2.add(LIZIZ(user));
            }
            arrayList.add(new C1365460ldY(urlModel, string, string2, arrayList2, "top_supporters"));
        }
        List<User> listUnmodifiableList2 = Collections.unmodifiableList(c1106210etP.LJJIJLIJ);
        if (!listUnmodifiableList2.isEmpty()) {
            UrlModel urlModel2 = new UrlModel();
            String string3 = context.getResources().getString(2131847895, Integer.valueOf(listUnmodifiableList2.size()));
            String string4 = context.getResources().getString(2131847896);
            ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(listUnmodifiableList2, 10));
            for (User user2 : listUnmodifiableList2) {
                LiveSharePackage.Companion.getClass();
                arrayList3.add(LIZIZ(user2));
            }
            arrayList.add(new C1365460ldY(urlModel2, string3, string4, arrayList3, "recently_shared"));
        }
        return arrayList;
    }

    public static List LJ(final Activity activity, final C1106210etP c1106210etP) {
        AwemeRawAd awemeRawAd;
        AwemeRawAd awemeRawAd2;
        AboutAdInfo aboutThisAd;
        Integer contentType;
        ArrayList arrayList = new ArrayList();
        Aweme awemeLLILZ = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).LLILZ(c1106210etP.LJJIL);
        AwemeRawAd awemeRawAd3 = null;
        if (awemeLLILZ != null) {
            awemeRawAd3 = awemeLLILZ.getAwemeRawAd();
        }
        C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "otherclick", awemeRawAd3);
        c1022820ciuLIZLLL.LIZJ("press", "refer");
        c1022820ciuLIZLLL.LJII();
        if (awemeLLILZ != null && awemeLLILZ.isAd() && awemeLLILZ.getAwemeRawAd() != null && (awemeRawAd = awemeLLILZ.getAwemeRawAd()) != null && awemeRawAd.getAboutThisAd() != null && (((awemeRawAd2 = awemeLLILZ.getAwemeRawAd()) == null || (aboutThisAd = awemeRawAd2.getAboutThisAd()) == null || (contentType = aboutThisAd.getContentType()) == null || contentType.intValue() != 0) && !c1106210etP.LJJIJIIJI)) {
            arrayList.add(new C1372800lpO(new C686090Qvf(c1106210etP) { // from class: X.0Qvg
                public final C1106210etP LLILLJJLI;

                @Override // X.InterfaceC1370310llN
                public final int LJIIIIZZ() {
                    return this.LLILLJJLI.LJJJ ? R.raw.icon_2pt_question_mark_circle_ltr : R.raw.icon_question_mark_circle_ltr;
                }

                {
                    new InterfaceC1370310llN(c1106210etP) { // from class: X.0Qvf
                        public final C1106210etP LL;

                        @Override // X.InterfaceC1370310llN
                        public final float LIZLLL() {
                            return -1.0f;
                        }

                        @Override // X.InterfaceC1370310llN
                        public final void LJI() {
                        }

                        @Override // X.InterfaceC1370310llN
                        public final int LJII() {
                            return R.raw.icon_question_mark_circle_fill_ltr;
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
                        public final void LJJJJI(BaseSharePackage baseSharePackage) {
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
                        public final boolean enable() {
                            return true;
                        }

                        @Override // X.InterfaceC1370310llN
                        public final String key() {
                            return "ad_personalization_new";
                        }

                        @Override // X.InterfaceC1370310llN
                        public final String label() {
                            return "";
                        }

                        @Override // X.InterfaceC1370310llN
                        public final int LJIIJJI() {
                            return !enable() ? 1 : 0;
                        }

                        @Override // X.InterfaceC1370310llN
                        public final int LJJLIIIJJIZ() {
                            AwemeRawAd awemeRawAd4;
                            AboutAdInfo aboutThisAd2;
                            Integer contentType2;
                            Aweme awemeLLILZ2 = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).LLILZ(this.LL.LJJIL);
                            return (awemeLLILZ2 == null || !awemeLLILZ2.isAd() || awemeLLILZ2.getAwemeRawAd() == null || (awemeRawAd4 = awemeLLILZ2.getAwemeRawAd()) == null || (aboutThisAd2 = awemeRawAd4.getAboutThisAd()) == null || (contentType2 = aboutThisAd2.getContentType()) == null || contentType2.intValue() != 1) ? 2131823010 : 2131834542;
                        }

                        @Override // X.InterfaceC1370310llN
                        public final C0M7Z LJIIJ() {
                            return C0M7Z.ShareButton;
                        }

                        @Override // X.InterfaceC1370310llN
                        public final EnumC1216710hld LJJJZ() {
                            return EnumC1216710hld.NORMAL;
                        }

                        {
                            this.LL = c1106210etP;
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
                    };
                    this.LLILLJJLI = c1106210etP;
                }

                @Override // X.InterfaceC1370310llN
                public final void LJIILIIL(Context context, BaseSharePackage baseSharePackage) {
                    AwemeRawAd awemeRawAd4;
                    AboutAdInfo aboutThisAd2;
                    Integer contentType2;
                    AwemeRawAd awemeRawAd5;
                    AboutAdInfo aboutThisAd3;
                    Integer contentType3;
                    AboutAdInfo aboutThisAd4;
                    Integer contentType4;
                    Aweme awemeLLILZ2 = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).LLILZ(this.LLILLJJLI.LJJIL);
                    if (awemeLLILZ2 != null && awemeLLILZ2.isAd() && awemeLLILZ2.getAwemeRawAd() != null && (awemeRawAd4 = awemeLLILZ2.getAwemeRawAd()) != null && awemeRawAd4.getAboutThisAd() != null) {
                        AwemeRawAd awemeRawAd6 = awemeLLILZ2.getAwemeRawAd();
                        if (awemeRawAd6 != null && (aboutThisAd4 = awemeRawAd6.getAboutThisAd()) != null && (contentType4 = aboutThisAd4.getContentType()) != null && contentType4.intValue() == 0) {
                            return;
                        }
                        Activity activityLJII = C1375500ltk.LJII(context);
                        if (!(activityLJII instanceof C19EG)) {
                            return;
                        }
                        C1022820ciu c1022820ciuLIZLLL2 = C2184171Adz.LIZLLL("draw_ad", "otherclick", awemeLLILZ2.getAwemeRawAd());
                        c1022820ciuLIZLLL2.LIZJ("about_tiktok_ads", "refer");
                        c1022820ciuLIZLLL2.LIZIZ("long_press", "enter_from");
                        c1022820ciuLIZLLL2.LJII();
                        AwemeRawAd awemeRawAd7 = awemeLLILZ2.getAwemeRawAd();
                        if (awemeRawAd7 != null && (aboutThisAd3 = awemeRawAd7.getAboutThisAd()) != null && (contentType3 = aboutThisAd3.getContentType()) != null && contentType3.intValue() == 1) {
                            ((IComplianceService) ServiceManager.get().getService(IComplianceService.class)).LJIIJ((C19EG) activityLJII, awemeLLILZ2.getAwemeRawAd(), "long_press");
                            return;
                        }
                        AwemeRawAd awemeRawAd8 = awemeLLILZ2.getAwemeRawAd();
                        if (awemeRawAd8 == null || (aboutThisAd2 = awemeRawAd8.getAboutThisAd()) == null || (contentType2 = aboutThisAd2.getContentType()) == null || contentType2.intValue() != 2 || (awemeRawAd5 = awemeLLILZ2.getAwemeRawAd()) == null) {
                            return;
                        }
                        ((IComplianceService) ServiceManager.get().getService(IComplianceService.class)).LJJIFFI((C19EG) activityLJII, awemeRawAd5, "long_press");
                    }
                }
            }, 21));
        }
        if (c1106210etP.LJJIIZI) {
            if (LJIIIZ(c1106210etP)) {
                arrayList.add(new C1372800lpO(new C1210410hbT(activity, c1106210etP), 11));
            } else {
                arrayList.add(new C1372800lpO(new C1210320hbK(activity, c1106210etP) { // from class: X.0hbV
                    public final C1106210etP LLILLL;

                    @Override // X.C1210320hbK, X.InterfaceC1370310llN
                    public final int LJIIIIZZ() {
                        return R.raw.icon_flag;
                    }

                    {
                        this.LLILLL = c1106210etP;
                    }

                    @Override // X.C1210320hbK, X.InterfaceC1370310llN
                    public final void LJIILIIL(Context context, BaseSharePackage baseSharePackage) {
                        String str = this.LLILLL.LJJIL;
                        if (str != null) {
                            C1440005kM.LIZ(new C1210440hbW(str));
                        }
                        InterfaceC1106740euG interfaceC1106740euG = this.LLILLL.LJJJJJ;
                        if (interfaceC1106740euG != null) {
                            interfaceC1106740euG.LIZ();
                        } else {
                            super.LJIILIIL(context, baseSharePackage);
                        }
                    }
                }, 11));
            }
        }
        if (c1106210etP.LJJIJ) {
            if (LJIIIZ(c1106210etP)) {
                arrayList.add(new C1372800lpO(new C1210400hbS(c1106210etP), 15));
            } else {
                arrayList.add(new C1372800lpO(new C1210390hbR(c1106210etP), 15));
            }
        }
        if (c1106210etP.LJJIJIL) {
            arrayList.add(new C1372800lpO(new InterfaceC1370310llN(c1106210etP) { // from class: X.0haA
                public final C1106210etP LL;

                @Override // X.InterfaceC1370310llN
                public final float LIZLLL() {
                    return -1.0f;
                }

                @Override // X.InterfaceC1370310llN
                public final void LJI() {
                }

                @Override // X.InterfaceC1370310llN
                public final int LJII() {
                    return R.raw.icon_personalization;
                }

                @Override // X.InterfaceC1370310llN
                public final int LJIIIIZZ() {
                    return R.raw.icon_personalization;
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
                public final void LJJJJI(BaseSharePackage baseSharePackage) {
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
                public final int LJJLIIIJJIZ() {
                    return 2131838211;
                }

                @Override // X.InterfaceC1370310llN
                public final boolean LJJLIIIJL() {
                    return false;
                }

                @Override // X.InterfaceC1370310llN
                public final boolean enable() {
                    return true;
                }

                @Override // X.InterfaceC1370310llN
                public final String key() {
                    return "manage_feed";
                }

                @Override // X.InterfaceC1370310llN
                public final String label() {
                    return "";
                }

                @Override // X.InterfaceC1370310llN
                public final boolean LJIIIZ() {
                    return this.LL.LJJIJIL;
                }

                @Override // X.InterfaceC1370310llN
                public final int LJIIJJI() {
                    return !enable() ? 1 : 0;
                }

                @Override // X.InterfaceC1370310llN
                public final C0M7Z LJIIJ() {
                    return C0M7Z.ShareButton;
                }

                @Override // X.InterfaceC1370310llN
                public final EnumC1216710hld LJJJZ() {
                    return EnumC1216710hld.NORMAL;
                }

                {
                    this.LL = c1106210etP;
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
                public final void LJIILIIL(Context context, BaseSharePackage baseSharePackage) {
                    InterfaceC470410IcZ interfaceC470410IcZ = this.LL.LJJJJLI;
                    if (interfaceC470410IcZ != null) {
                        interfaceC470410IcZ.LIZ();
                    }
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
            }, 16));
        }
        if (c1106210etP.LJJLI) {
            arrayList.add(new C1372800lpO(new InterfaceC1370310llN(c1106210etP) { // from class: X.0e6I
                public final C1106210etP LL;

                @Override // X.InterfaceC1370310llN
                public final float LIZLLL() {
                    return -1.0f;
                }

                @Override // X.InterfaceC1370310llN
                public final void LJI() {
                }

                @Override // X.InterfaceC1370310llN
                public final int LJII() {
                    return R.raw.icon_question_mark_circle_fill_ltr;
                }

                @Override // X.InterfaceC1370310llN
                public final int LJIIIIZZ() {
                    return R.raw.icon_question_mark_circle_ltr;
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
                public final void LJJJJI(BaseSharePackage baseSharePackage) {
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
                public final int LJJLIIIJJIZ() {
                    return 2131858525;
                }

                @Override // X.InterfaceC1370310llN
                public final boolean LJJLIIIJL() {
                    return false;
                }

                @Override // X.InterfaceC1370310llN
                public final boolean enable() {
                    return true;
                }

                @Override // X.InterfaceC1370310llN
                public final String key() {
                    return "why_this_live";
                }

                @Override // X.InterfaceC1370310llN
                public final String label() {
                    return "";
                }

                @Override // X.InterfaceC1370310llN
                public final int LJIIJJI() {
                    return !enable() ? 1 : 0;
                }

                @Override // X.InterfaceC1370310llN
                public final C0M7Z LJIIJ() {
                    return C0M7Z.ShareButton;
                }

                @Override // X.InterfaceC1370310llN
                public final EnumC1216710hld LJJJZ() {
                    return EnumC1216710hld.NORMAL;
                }

                {
                    this.LL = c1106210etP;
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
                public final void LJIILIIL(Context context, BaseSharePackage baseSharePackage) {
                    InterfaceC751850TeR interfaceC751850TeR = this.LL.LJJLIIIIJ;
                    if (interfaceC751850TeR != null) {
                        interfaceC751850TeR.LIZ();
                    }
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
            }, 14));
        }
        if (c1106210etP.LJJLIIIJ >= 0) {
            arrayList.add(new C1372800lpO(new C1209590ha9(c1106210etP, true), 7));
        }
        return arrayList;
    }

    public static LiveSharePackage LJIIIIZZ(Context context, C1106210etP c1106210etP) {
        UrlModel urlModelLIZ;
        boolean z;
        String str;
        List<String> listLIZ;
        String str2;
        boolean z2;
        long j;
        User owner;
        FollowInfo followInfo;
        RepostInfo repostInfo;
        ILiveOuterService iLiveOuterService;
        List<IMContact> listQ3;
        C1370940lmO c1370940lmO = new C1370940lmO();
        c1370940lmO.LIZ = "live";
        boolean z3 = false;
        if (c1106210etP.LJJIJIIJI) {
            c1370940lmO.LJ = C786410Ut5.j4(context.getResources().getString(2131849225), Arrays.copyOf(new Object[]{String.valueOf(c1106210etP.LJIIIIZZ)}, 1));
        } else {
            c1370940lmO.LJ = context.getResources().getString(2131842751);
        }
        if (c1106210etP.LJJLIIIJL == 1 && C123100dR.LIZ(c1106210etP.LJIIJJI)) {
            if (c1106210etP.LJJIJIIJI) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(c1370940lmO.LJ);
                sbLIZ.append(c1106210etP.LJIIJJI);
                c1370940lmO.LJ = C2188811AlT.LIZIZ(sbLIZ);
            } else {
                c1370940lmO.LJ = c1106210etP.LJIIJJI;
            }
        }
        String strLJFF = C1375500ltk.LJFF(c1106210etP.LJIIIZ);
        String str3 = null;
        if (strLJFF != null) {
            if (c1106210etP.LJJIJIIJI) {
                C2089008Gi c2089008Gi = new C2089008Gi(strLJFF);
                c2089008Gi.LIZLLL("sec_anchor_id", c1106210etP.LJIJJ);
                c2089008Gi.LIZIZ(1, "is_sub_only_live");
                strLJFF = c2089008Gi.LJ();
            }
        } else {
            strLJFF = null;
        }
        String str4 = "";
        if (strLJFF == null) {
            strLJFF = "";
        }
        c1370940lmO.LJFF = strLJFF;
        String str5 = c1106210etP.LJIIJ;
        if (str5 == null) {
            str5 = "";
        }
        c1370940lmO.LIZLLL = str5;
        c1370940lmO.LIZIZ = String.valueOf(c1106210etP.LIZIZ);
        if (((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).i5() && TextUtils.equals("screenshot_popup", c1106210etP.LJJIII)) {
            c1370940lmO.LIZJ = new ShareContentType[]{ShareContentType.LINK_PLUS_PHOTO, ShareContentType.PHOTO, ShareContentType.LINK};
        } else {
            c1370940lmO.LIZJ = new ShareContentType[]{ShareContentType.LINK};
        }
        if (c1106210etP.LJIILIIL && (iLiveOuterService = (ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)) != null && (listQ3 = iLiveOuterService.q3()) != null) {
            c1370940lmO.LJI = new ShareModel(new LiveShareSortModel(listQ3));
        } else if (c1106210etP.LJJZZIII != null) {
            C1372380loi c1372380loi = LiveSharePackage.Companion;
            User user = c1106210etP.LJJZZIII;
            c1372380loi.getClass();
            c1370940lmO.LJI = new ShareModel(new LiveShareSortModel(Collections.singletonList(LIZIZ(user))));
        }
        LiveSharePackage liveSharePackage = new LiveSharePackage(c1370940lmO);
        Bundle bundle = liveSharePackage.extras;
        if (!TextUtils.isEmpty(c1106210etP.LJJIL)) {
            C786410Ut5.LJJJI("aid", c1106210etP.LJJIL, bundle);
        }
        long followStatus = 0;
        if (c1106210etP.LJJIJIIJI) {
            bundle.putBoolean("is_sub_only_live", true);
            bundle.putInt("share_im_limit_tip_type", 4);
        } else if (c1106210etP.LJIILIIL) {
            long j2 = c1106210etP.LJJIJIIJIL;
            if (j2 != 0) {
                bundle.putLong("live_visible_scope_type", j2);
                bundle.putInt("share_im_limit_tip_type", 6);
            }
        }
        C1372380loi c1372380loi2 = LiveSharePackage.Companion;
        ImageModel imageModel = c1106210etP.LJ;
        c1372380loi2.getClass();
        C786410Ut5.LJJIZ(bundle, "thumb_for_share", LIZ(imageModel));
        ImageModel imageModel2 = c1106210etP.LJII;
        if (imageModel2 == null) {
            urlModelLIZ = LIZ(c1106210etP.LJI);
        } else {
            urlModelLIZ = LIZ(imageModel2);
        }
        C786410Ut5.LJJIZ(bundle, "video_cover", urlModelLIZ);
        C786410Ut5.LJJJI("author_name", c1106210etP.LJIIIIZZ, bundle);
        String str6 = c1106210etP.LIZLLL;
        if (str6 == null) {
            C786410Ut5.LJJJI("author_id", null, bundle);
        } else {
            C786410Ut5.LJJJI("author_id", str6, bundle);
        }
        C786410Ut5.LJJJI("author_user_name", c1106210etP.LJIIIIZZ, bundle);
        C786410Ut5.LJJJI("panel_source", c1106210etP.LJJIII, bundle);
        C786410Ut5.LJJJI("enter_method", c1106210etP.LJJ, bundle);
        C786410Ut5.LJJJI("app_name", context.getString(R.string.drg), bundle);
        String str7 = c1106210etP.LJIIL;
        if (str7 != null && !a0.LJJJIL(str7)) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            C786410Ut5.LJJJI("thumb_url", c1106210etP.LJIIL, bundle);
        } else {
            ImageModel imageModel3 = c1106210etP.LJFF;
            if (imageModel3 == null || (listLIZ = C842240X2g.LIZ(imageModel3)) == null || (str = (String) C13LP.LJJJLL(listLIZ)) == null) {
                str = "";
            }
            C786410Ut5.LJJJI("thumb_url", str, bundle);
        }
        C786410Ut5.LJJJI("uid_for_share", String.valueOf(c1106210etP.LIZJ), bundle);
        C786410Ut5.LJJJI("sec_user_id", c1106210etP.LJIJJ, bundle);
        String str8 = c1106210etP.LJIL;
        if (str8 == null) {
            str8 = "";
        }
        C786410Ut5.LJJJI("enter_from", str8, bundle);
        String str9 = c1106210etP.LJJJJZ;
        if (str9 == null) {
            str9 = "";
        }
        C786410Ut5.LJJJI("share_live_intent", str9, bundle);
        C786410Ut5.LJJJI("share_live_trace_id", c1106210etP.LJLI, bundle);
        bundle.putLong("item_id", c1106210etP.LIZIZ);
        C786410Ut5.LJJJI("share_text", liveSharePackage.description, bundle);
        C786410Ut5.LJJJI("live_id", String.valueOf(c1106210etP.LIZJ), bundle);
        C786410Ut5.LJJJI("room_title", c1106210etP.LJIIJ, bundle);
        C786410Ut5.LJJJI("request_id", c1106210etP.LJIJ, bundle);
        if (c1106210etP.LJIILIIL) {
            str2 = "anchor";
        } else {
            str2 = "user";
        }
        C786410Ut5.LJJJI("user_type", str2, bundle);
        C786410Ut5.LJJJI("request_page", c1106210etP.LJJI, bundle);
        C786410Ut5.LJJJI("previous_page", "live", bundle);
        bundle.putBoolean("is_share_live", true);
        bundle.putBoolean("is_portrait", c1106210etP.LJJJIL);
        bundle.putBoolean("is_land_style_libra", c1106210etP.LJJJJ);
        String str10 = c1106210etP.LJJ;
        if (str10 != null) {
            str4 = str10;
        }
        C786410Ut5.LJJJI("enter_method_live", str4, bundle);
        String str11 = c1106210etP.LJJLIIJ;
        if (str11 != null && !a0.LJJJIL(str11)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z2) {
            bundle.putBoolean("show_edit_send_direct_im_share", true);
            bundle.putBoolean("key_filter_group_chat", !C0ZNY.LIZJ());
            bundle.putBoolean("key_filter_group_camera_permission", true);
            bundle.putBoolean("key_filter_no_camera_permission", true);
            bundle.putBoolean("key_show_checkbox_directly_when_select", true);
            bundle.putInt("key_share_checkbox_direct_show_text", 2131855983);
            bundle.putFloat("key_share_send_to_dialog_height_ratio", 0.73f);
            C786410Ut5.LJJJI("screenshot_image_path", c1106210etP.LJJLIIJ, bundle);
            bundle.putBoolean("key_record_checkbox_status", true);
            bundle.putBoolean("key_screenshot_share", true);
        }
        String str12 = c1106210etP.LJJLIIIJLLLLLLLZ;
        if (str12 != null && !a0.LJJJIL(str12)) {
            C786410Ut5.LJJJI("key_default_select_id", c1106210etP.LJJLIIIJLLLLLLLZ, bundle);
            bundle.putBoolean("show_edit_send_direct_im_share", true);
        }
        Room room = c1106210etP.LJJIIZ;
        if (room != null && room.reposted) {
            z3 = true;
        }
        bundle.putBoolean("is_reposted_live", z3);
        Room room2 = c1106210etP.LJJIIZ;
        if (room2 != null) {
            str3 = room2.repostNote;
        }
        C786410Ut5.LJJJI("reposted_live_note", str3, bundle);
        Room room3 = c1106210etP.LJJIIZ;
        if (room3 != null && (repostInfo = room3.repostInfo) != null) {
            j = repostInfo.repostersCnt;
        } else {
            j = 0;
        }
        bundle.putLong("reposted_live_cnt", j);
        Room room4 = c1106210etP.LJJIIZ;
        if (room4 != null && (owner = room4.getOwner()) != null && (followInfo = owner.getFollowInfo()) != null) {
            followStatus = followInfo.getFollowStatus();
        }
        bundle.putLong("follow_status", followStatus);
        C786410Ut5.LJJJI("live_action_type", c1106210etP.LJIJI, bundle);
        Bundle bundle2 = c1106210etP.LJJJJIZL;
        if (bundle2 != null) {
            C786410Ut5.LJJIIJZLJL(bundle, bundle2);
        }
        bundle.putBoolean("live_optimized_style", c1106210etP.LJJLIIIJJIZ);
        return liveSharePackage;
    }

    /* JADX WARN: Removed duplicated region for block: B:142:0x033f A[PHI: r4
      0x033f: PHI (r4v14 boolean) = (r4v13 boolean), (r4v17 boolean) binds: [B:140:0x033c, B:119:0x02c2] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List LJI(final android.app.Activity r20, final X.C1106210etP r21, com.ss.android.ugc.aweme.profile.model.User r22) {
        /*
            Method dump skipped, instruction units count: 925
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1372380loi.LJI(android.app.Activity, X.0etP, com.ss.android.ugc.aweme.profile.model.User):java.util.List");
    }

    public static C1371590lnR LJFF(Activity activity, final C1106210etP c1106210etP, List list, final InterfaceC1372610lp5 interfaceC1372610lp5, final LiveSharePackage liveSharePackage) {
        boolean z;
        Room room;
        ILiveOuterService iLiveOuterService;
        InterfaceC1363540laS interfaceC1363540laSE4;
        InterfaceC1363540laS interfaceC1363540laSE42;
        Room room2;
        String str;
        User owner;
        C1371600lnS c1371600lnS = new C1371600lnS();
        C621180OYa.LIZ.LJJLIIIJILLIZJL(c1371600lnS, activity, false);
        c1371600lnS.LJJIIJZLJL = !c1106210etP.LJJJLIIL;
        boolean z2 = c1106210etP.LJJJLL;
        c1371600lnS.LJIILLIIL = z2;
        if (!z2) {
            if (!c1106210etP.LJIILIIL && (((room = c1106210etP.LJJIIZ) == null || (owner = room.getOwner()) == null || owner.getSecret() != 1) && (iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null)) != null && (interfaceC1363540laSE4 = iLiveOuterService.E4()) != null && interfaceC1363540laSE4.LJIIIZ() && !Intrinsics.LJFF(c1106210etP.LJJZZI, "friends_v3_feeds"))) {
                c1371600lnS.LIZIZ(new LiveRepostChannel(activity, c1106210etP));
                ILiveOuterService iLiveOuterService2 = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
                if (iLiveOuterService2 != null && (interfaceC1363540laSE42 = iLiveOuterService2.E4()) != null && interfaceC1363540laSE42.LIZJ() && (room2 = c1106210etP.LJJIIZ) != null && room2.reposted && ((str = room2.repostNote) == null || str.length() == 0)) {
                    c1371600lnS.LIZIZ(new LiveRepostAddNoteChannel(activity, c1106210etP));
                }
            }
            c1371600lnS.LIZIZ(new CopyLinkChannel(false));
        }
        int i = c1106210etP.LJJJZ;
        if (i != 0) {
            c1371600lnS.LJJI = i;
        }
        boolean z3 = c1106210etP.LJJJLZIJ;
        if (z3) {
            c1371600lnS.LJJLI = z3;
            c1371600lnS.LJJLIIIIJ = c1106210etP.LJJL;
        }
        if (c1106210etP.LJJLJ) {
            final float f = c1106210etP.LJJLJLI;
            final float f2 = c1106210etP.LJJLL;
            c1371600lnS.LJJLIIIJLLLLLLLZ = new C1370170ll9(f, f2) { // from class: X.0ll6
                public final float LIZJ;
                public final float LIZLLL;

                @Override // X.C1370170ll9, X.InterfaceC1370040lkw
                public final void LIZIZ(Dialog dialog) {
                    LJI(dialog);
                }

                @Override // X.C1370170ll9, X.InterfaceC1370040lkw
                public final void LJFF(Dialog dialog) {
                    LJI(dialog);
                }

                public final void LJI(Dialog dialog) {
                    FrameLayout.LayoutParams layoutParams;
                    View viewFindViewById = dialog.findViewById(R.id.nhw);
                    ViewGroup.LayoutParams layoutParams2 = null;
                    if (viewFindViewById != null) {
                        layoutParams2 = viewFindViewById.getLayoutParams();
                    }
                    if ((layoutParams2 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams2) != null) {
                        layoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(this.LIZJ))));
                        layoutParams.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(this.LIZLLL)));
                    }
                }

                {
                    this.LIZJ = f;
                    this.LIZLLL = f2;
                }

                @Override // X.C1370170ll9, X.InterfaceC1370040lkw
                public final View LIZLLL(Dialog dialog, int i2, View view, ViewGroup.LayoutParams layoutParams, C1361400lX0 c1361400lX0) {
                    View viewLIZLLL = super.LIZLLL(dialog, i2, view, layoutParams, c1361400lX0);
                    Window window = dialog.getWindow();
                    if (window != null) {
                        window.setFlags(1024, 1024);
                    }
                    return viewLIZLLL;
                }
            };
            liveSharePackage.extras.putBoolean("use_small_style_on_large_screen", true);
            C786410Ut5.LJJJI("enter_method", "share_panel", liveSharePackage.extras);
        }
        c1371600lnS.LJL = c1106210etP.LJJII;
        c1371600lnS.LJJLIIJ = c1106210etP.LJJLIL;
        C1370200llC c1370200llC = new C1370200llC();
        c1370200llC.LIZJ = true;
        c1371600lnS.LJJLIIIJJI = c1370200llC;
        c1371600lnS.LJJJJJL = false;
        boolean z4 = c1106210etP.LJJZ;
        if (z4) {
            c1371600lnS.LJJJJJL = z4;
        }
        c1371600lnS.LIZLLL("instagram");
        c1371600lnS.LIZLLL("instagram_story");
        Bundle bundle = c1106210etP.LJJJJIZL;
        if (bundle != null && bundle.getBoolean("show_cancel")) {
            z = true;
        } else {
            z = false;
        }
        c1371600lnS.LJJJJ = z;
        List<AbstractC1210780hc4> list2 = c1106210etP.LJIJJLI;
        if (list2 != null) {
            for (final AbstractC1210780hc4 abstractC1210780hc4 : (ArrayList) list2) {
                ((ArrayList) list).add(new C1372800lpO(new InterfaceC1370310llN(abstractC1210780hc4, c1106210etP) { // from class: X.0hc3
                    public final AbstractC1210780hc4 LL;
                    public final C1106210etP LLILLJJLI;

                    @Override // X.InterfaceC1370310llN
                    public final float LIZLLL() {
                        return -1.0f;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJI() {
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
                    public final void LJJJJI(BaseSharePackage baseSharePackage) {
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
                    public final String label() {
                        return "";
                    }

                    @Override // X.InterfaceC1370310llN
                    public final int LJIIIIZZ() {
                        return this.LL.LIZLLL();
                    }

                    @Override // X.InterfaceC1370310llN
                    public final boolean LJIIIZ() {
                        return this.LL.LIZ();
                    }

                    @Override // X.InterfaceC1370310llN
                    public final int LJJLIIIJJIZ() {
                        return this.LL.LJFF();
                    }

                    @Override // X.InterfaceC1370310llN
                    public final boolean enable() {
                        return this.LL.LIZIZ();
                    }

                    @Override // X.InterfaceC1370310llN
                    public final String key() {
                        return this.LL.LJ();
                    }

                    @Override // X.InterfaceC1370310llN
                    public final int LJII() {
                        return LJIIIIZZ();
                    }

                    @Override // X.InterfaceC1370310llN
                    public final int LJIIJJI() {
                        return !enable() ? 1 : 0;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final C0M7Z LJIIJ() {
                        return C0M7Z.ShareButton;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final EnumC1216710hld LJJJZ() {
                        return EnumC1216710hld.NORMAL;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJIJJ(TextView textView) {
                        C1370320llO.LJ(this, textView);
                    }

                    @Override // X.InterfaceC1370310llN
                    public final int LJJJJ(EnumC1369720lkQ enumC1369720lkQ) {
                        return C1370320llO.LIZJ(enumC1369720lkQ);
                    }

                    {
                        this.LL = abstractC1210780hc4;
                        this.LLILLJJLI = c1106210etP;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJIILIIL(Context context, BaseSharePackage baseSharePackage) {
                        this.LL.LIZJ(context, this.LLILLJJLI);
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

                    @Override // X.InterfaceC1370310llN
                    public final void LJJIJ(ImageView imageView, View view, int i2) {
                        this.LL.LJI(i2);
                    }
                }, abstractC1210780hc4.LJII()));
            }
        }
        final HashMap map = new HashMap();
        ArrayList<C1372800lpO> arrayList = (ArrayList) list;
        for (C1372800lpO c1372800lpO : arrayList) {
            map.put(c1372800lpO.LIZ.key(), Integer.valueOf(c1372800lpO.LIZIZ));
        }
        c1371600lnS.LIZ(new Comparator<InterfaceC1370310llN>(map) { // from class: X.0Uxa
            public final HashMap<String, Integer> LL;

            {
                this.LL = map;
            }

            @Override // java.util.Comparator
            public final int compare(InterfaceC1370310llN interfaceC1370310llN, InterfaceC1370310llN interfaceC1370310llN2) {
                int iIntValue;
                String strKey;
                Integer num;
                String strKey2;
                Integer num2;
                InterfaceC1370310llN interfaceC1370310llN3 = interfaceC1370310llN;
                InterfaceC1370310llN interfaceC1370310llN4 = interfaceC1370310llN2;
                int iIntValue2 = 0;
                if (interfaceC1370310llN3 != null && (strKey2 = interfaceC1370310llN3.key()) != null && (num2 = this.LL.get(strKey2)) != null) {
                    iIntValue = num2.intValue();
                } else {
                    iIntValue = 0;
                }
                if (interfaceC1370310llN4 != null && (strKey = interfaceC1370310llN4.key()) != null && (num = this.LL.get(strKey)) != null) {
                    iIntValue2 = num.intValue();
                }
                return iIntValue - iIntValue2;
            }
        });
        C1362230lYL c1362230lYL = new C1362230lYL();
        c1362230lYL.LJIILL = Integer.valueOf(R.attr.fx2);
        c1362230lYL.LIZLLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        c1362230lYL.LJIILJJIL = false;
        c1362230lYL.LJIIJJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(62));
        c1371600lnS.LJJLIIIJL = c1362230lYL;
        if (arrayList.size() > 1) {
            C08XD.LJJ(list, new AComparatorS40S0000000_21(11));
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            c1371600lnS.LIZJ(((C1372800lpO) it2.next()).LIZ);
        }
        if (LiveSharePanelChannelSortOptExperiment.INSTANCE.enable() && !c1106210etP.LJIILIIL) {
            c1371600lnS.LIZLLL = EnumC1371620lnU.USE_CACHE;
        }
        if (!c1106210etP.LJJJIL) {
            c1371600lnS.LJJIFFI = R.attr.a1h;
        }
        c1371600lnS.LJJIIJ = liveSharePackage;
        LiveSharePackage.Companion.getClass();
        String string = liveSharePackage.extras.getString("live_share_custom_panel_image_url");
        if (string == null) {
            string = "";
        }
        int i2 = liveSharePackage.extras.getInt("live_share_custom_panel_height_dp", 0);
        if (!a0.LJJJIL(string) && i2 > 0) {
            c1371600lnS.LJJJJLL = true;
            c1371600lnS.LJJJJZ = new C0H9M(i2, activity, string);
        }
        c1371600lnS.LJJIL = new InterfaceC1366490lfD() { // from class: X.0loz
            @Override // X.InterfaceC1366490lfD
            public final void LIZLLL(Context context, BaseSharePackage baseSharePackage) {
            }

            @Override // X.InterfaceC1366490lfD
            public final void LJ(Context context, BaseSharePackage baseSharePackage) {
            }

            @Override // X.InterfaceC1366490lfD
            public final void LJFF(Context context, BaseSharePackage baseSharePackage, List list3) {
            }

            @Override // X.InterfaceC1366490lfD
            public final void LJI(Context context, BaseSharePackage baseSharePackage) {
                interfaceC1372610lp5.onDismiss();
            }

            @Override // X.InterfaceC1366490lfD
            public final void LIZIZ(Context context, BaseSharePackage baseSharePackage, InterfaceC1370310llN interfaceC1370310llN) {
                if (interfaceC1370310llN instanceof C1377850lxX) {
                    InterfaceC1372610lp5 interfaceC1372610lp52 = interfaceC1372610lp5;
                    interfaceC1370310llN.getClass();
                    interfaceC1372610lp52.LIZJ("copy", "link", baseSharePackage.extras);
                }
            }

            @Override // X.InterfaceC1366490lfD
            public final void LIZJ(View view, C1371590lnR c1371590lnR, C1370190llB c1370190llB) {
                interfaceC1372610lp5.onShow(c1370190llB.LIZ);
            }

            @Override // X.InterfaceC1361850lXj
            public final void LIZ(InterfaceC1369790lkX interfaceC1369790lkX, boolean z5, BaseSharePackage baseSharePackage, Context context) {
                Bundle bundle2;
                if (z5) {
                    InterfaceC1372610lp5 interfaceC1372610lp52 = interfaceC1372610lp5;
                    String strKey = interfaceC1369790lkX.key();
                    LiveSharePackage.Companion.getClass();
                    if (baseSharePackage != null) {
                        bundle2 = baseSharePackage.extras;
                    } else {
                        bundle2 = null;
                    }
                    interfaceC1372610lp52.LIZJ(strKey, "qr_code", bundle2);
                    return;
                }
                interfaceC1372610lp5.LIZ(new Throwable());
            }

            @Override // X.InterfaceC1361850lXj
            public final Object LJII(Context context, BaseSharePackage baseSharePackage, InterfaceC1369790lkX interfaceC1369790lkX, InterfaceC1364105Vn interfaceC1364105Vn) {
                Unit unit = Unit.LIZ;
                C099R.LJFF();
                return unit;
            }
        };
        c1371600lnS.LJJIZ = new InterfaceC1364520lc2() { // from class: X.0loy
            @Override // X.InterfaceC1364520lc2
            public final void LJIIJ() {
            }

            @Override // X.InterfaceC1364520lc2
            public final void LJIIJJI(BaseSharePackage baseSharePackage, String str2) {
            }

            @Override // X.InterfaceC1364520lc2
            public final void LJIIL(BaseSharePackage baseSharePackage) {
            }

            @Override // X.InterfaceC1364520lc2
            public final void LJIILIIL(BaseSharePackage baseSharePackage) {
            }

            @Override // X.InterfaceC1364520lc2
            public final void LJIIIZ() {
                interfaceC1372610lp5.LIZ(new Exception("im share cancel"));
            }

            @Override // X.InterfaceC1364520lc2
            public final void LIZIZ(HashMap<String, String> map2) {
                interfaceC1372610lp5.LIZIZ(map2);
            }

            @Override // X.InterfaceC1364520lc2
            public final void LIZLLL(HashMap<String, String> map2) {
                String string2 = liveSharePackage.extras.getString("bizTrackParams");
                if (string2 != null && (!a0.LJJJIL(string2))) {
                    map2.put("biz_track_params", string2);
                }
                interfaceC1372610lp5.LIZLLL(map2);
            }

            @Override // X.InterfaceC1364520lc2
            public final void LJ(HashMap<String, String> map2) {
                interfaceC1372610lp5.LJ(map2);
            }

            @Override // X.InterfaceC1364520lc2
            public final void LJFF(Dialog dialog) {
                interfaceC1372610lp5.LJFF(dialog);
            }

            @Override // X.InterfaceC1364520lc2
            public final void LJI(Dialog dialog) {
                interfaceC1372610lp5.LJI(dialog);
            }

            @Override // X.InterfaceC1364520lc2
            public final void LJII(BaseSharePackage baseSharePackage) {
                interfaceC1372610lp5.LIZ(new Exception("im share fail"));
            }

            @Override // X.InterfaceC1364520lc2
            public final void LJIIIIZZ(BaseSharePackage baseSharePackage) {
                interfaceC1372610lp5.LIZJ("chat_merge", "link", baseSharePackage.extras);
            }
        };
        return new C1371590lnR(c1371600lnS);
    }
}
