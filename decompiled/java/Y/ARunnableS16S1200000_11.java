package Y;

import X.C09JN;
import X.C0SB0;
import X.C0SB1;
import X.C0SB2;
import X.C0SXC;
import X.C11JF;
import X.C11S5;
import X.C1246100iX2;
import X.C13LE;
import X.C13LP;
import X.C15438062q;
import X.C15TA;
import X.C1701940uOG;
import X.C19719912Dl;
import X.C1ACY;
import X.C1C7U;
import X.C20684815ws;
import X.C21146717pB;
import X.C2177241AIw;
import X.C2177251AIx;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C298450Bmt;
import X.C337180DJs;
import X.C418440Gaw;
import X.C426750GoL;
import X.C512350K7l;
import X.C699370Rbz;
import X.C709410RsB;
import X.C727150Sfh;
import X.C727160Sfi;
import X.C727170Sfj;
import X.C727280Sfu;
import X.C730150SkX;
import X.C735370Ssx;
import X.C755980Tl6;
import X.C814420VxA;
import X.EnumC1235690iGF;
import X.InterfaceC19483011Ki;
import X.InterfaceC2217241BqE;
import X.InterfaceC703980RjQ;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.adapter.BaseFeedLiveViewHolder;
import com.ss.android.ugc.aweme.feed.adapter.FeedLiveViewHolderNewV2;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewCell;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.ui.FeedRecommendFragment;
import com.ss.android.ugc.aweme.friends.model.MutualStruct;
import com.ss.android.ugc.aweme.friends.model.MutualUser;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.service.IPostModeService;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerViewModel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.story.base.distribution.dispatcher.StoryReceiver;
import com.ss.android.ugc.aweme.story.friends.detail.component.FriendsDetailViewerEntranceUIAssem;
import com.ss.android.ugc.feed.platform.cell.interact.mob.InteractAreaSizeMobComponent;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public class ARunnableS16S1200000_11 implements Runnable {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
            case 6:
                run$6(this);
                break;
            case 7:
                run$7(this);
                break;
            case 8:
                run$8(this);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                run$9(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                run$10(this);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                run$11(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                run$12(this);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                run$13(this);
                break;
            case 14:
                run$14(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        int width;
        C11JF c11jf;
        int width2 = ((FriendsDetailViewerEntranceUIAssem) this.l1).LJJIJL().getWidth();
        if (width2 == 0) {
            return;
        }
        TuxTextView tuxTextView = ((FriendsDetailViewerEntranceUIAssem) this.l1).LLJJIII;
        int width3 = (tuxTextView != null ? tuxTextView.getWidth() : 0) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
        TuxIconView tuxIconView = ((FriendsDetailViewerEntranceUIAssem) this.l1).LLJJIJI;
        if (tuxIconView == null || tuxIconView.getVisibility() != 0) {
            width = 0;
        } else {
            TuxIconView tuxIconView2 = ((FriendsDetailViewerEntranceUIAssem) this.l1).LLJJIJI;
            width = (tuxIconView2 != null ? tuxIconView2.getWidth() : 0) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1));
        }
        int iLIZIZ = ((width2 - width3) - width) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
        ((FriendsDetailViewerEntranceUIAssem) this.l1).getClass();
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(19));
        if (iLIZIZ < iLIZIZ2) {
            C337180DJs.LIZ(((FriendsDetailViewerEntranceUIAssem) this.l1).LLJJIJIIJIL);
            return;
        }
        int i = ((iLIZIZ - iLIZIZ2) / iLIZIZ3) + 1;
        if (i < 1) {
            i = 1;
        }
        ((FriendsDetailViewerEntranceUIAssem) this.l1).getClass();
        int iMin = Math.min(i, Math.min(3, ((List) this.l2).size()));
        FriendsDetailViewerEntranceUIAssem friendsDetailViewerEntranceUIAssem = (FriendsDetailViewerEntranceUIAssem) this.l1;
        String str = this.s0;
        List<User> listLL = C13LP.LL((List) this.l2, iMin);
        Aweme aweme = friendsDetailViewerEntranceUIAssem.LLJJI;
        if (Intrinsics.LJFF(str, aweme != null ? aweme.getAid() : null)) {
            if (listLL != null && !listLL.isEmpty()) {
                int size = listLL.size();
                Aweme aweme2 = friendsDetailViewerEntranceUIAssem.LLJJI;
                if (aweme2 == null || !C298450Bmt.LIZ() || !C730150SkX.LIZIZ(aweme2) || size >= 3) {
                    Context context = friendsDetailViewerEntranceUIAssem.getContext();
                    if (context != null) {
                        C11JF c11jf2 = friendsDetailViewerEntranceUIAssem.LLJJIJIL;
                        if (c11jf2 != null && !c11jf2.isDisposed() && (c11jf = friendsDetailViewerEntranceUIAssem.LLJJIJIL) != null) {
                            c11jf.dispose();
                        }
                        int size2 = listLL.size();
                        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLL, 10));
                        for (User user : listLL) {
                            arrayList.add(new MutualUser(user.getSecUid(), user.getNickname(), user.getAvatarMedium(), user.getAvatarThumb(), user.getUid(), null));
                        }
                        friendsDetailViewerEntranceUIAssem.LLJJIJIL = (C11JF) new C2177241AIw(context, C1246100iX2.LIZ(new MutualStruct(0, size2, arrayList, 0)), new C2177251AIx(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)), null, 0, 3, 0.8f, 0.0f, 0, 0, Boolean.valueOf(C426750GoL.LIZLLL(context)), null, true, true, false, null, 104252)).LIZLLL().LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS147S0200000_11((Object) null, friendsDetailViewerEntranceUIAssem, 1));
                        return;
                    }
                    return;
                }
            }
            SmartImageView smartImageView = friendsDetailViewerEntranceUIAssem.LLJJIJIIJIL;
            if (smartImageView != null) {
                C337180DJs.LIZ(smartImageView);
            }
            friendsDetailViewerEntranceUIAssem.hp();
        }
    }

    public final void LIZ$1() {
        int i;
        int i2;
        int i3;
        Object objValueOf;
        C0SB2 c0sb2 = ((C0SB1) this.l1).LIZLLL.get(this.s0);
        ConcurrentHashMap<String, C0SB0> concurrentHashMap = ((C0SB1) this.l1).LJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.s0);
        sbLIZ.append('-');
        sbLIZ.append((Integer) this.l2);
        C0SB0 c0sb0 = concurrentHashMap.get(C2188811AlT.LIZIZ(sbLIZ));
        ConcurrentHashMap<String, C0SB0> concurrentHashMap2 = ((C0SB1) this.l1).LJFF;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(this.s0);
        sbLIZ2.append('-');
        sbLIZ2.append((Integer) this.l2);
        C0SB0 c0sb02 = concurrentHashMap2.get(C2188811AlT.LIZIZ(sbLIZ2));
        if (c0sb2 == null || c0sb0 == null) {
            return;
        }
        Rect rect = c0sb2.LIZ;
        Rect rect2 = c0sb2.LIZIZ;
        Rect rect3 = c0sb2.LIZJ;
        Rect rect4 = c0sb2.LJ;
        if (rect == null || rect2 == null || rect4 == null) {
            return;
        }
        int i4 = rect.bottom;
        int i5 = rect.top;
        int i6 = i4 - i5;
        int i7 = rect4.bottom;
        int i8 = rect4.top;
        int i9 = i7 - i8;
        int i10 = rect3 != null ? rect3.bottom : 0;
        int i11 = rect2.top;
        int i12 = rect2.bottom;
        int i13 = i11 + ((i12 - i11) / 2);
        int i14 = c0sb0.LIZIZ;
        int iHeight = rect2.height();
        if (i14 > iHeight) {
            i14 = iHeight;
        }
        int i15 = i14 / 2;
        int i16 = i13 - i15;
        int i17 = i13 + i15;
        if (i17 <= i12) {
            i12 = i17;
        }
        if (i12 > i5) {
            i = 1;
            i2 = i12 - i5;
        } else {
            i = 0;
            i2 = 0;
        }
        int iMax = Math.max(i12 - i8, 0);
        int iMax2 = Math.max(i8 - i12, 0);
        int iAbs = Math.abs(i10 - i12);
        int i18 = i7 - i5;
        int i19 = i7 - i4;
        int iMax3 = Math.max(c0sb2.LJFF - iAbs, 0);
        float f = i14;
        float fIntValue = ((Number) ((C0SB1) this.l1).LJIIIIZZ.getValue()).intValue();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", ((C0SB1) this.l1).LIZIZ);
        Aweme aweme = ((C0SB1) this.l1).LIZJ;
        c2344009Gk.LJ(aweme != null ? Integer.valueOf(aweme.getAwemeType()) : null, "aweme_type");
        Aweme aweme2 = ((C0SB1) this.l1).LIZJ;
        c2344009Gk.LJIIIIZZ("group_id", aweme2 != null ? aweme2.getAid() : null);
        Aweme aweme3 = ((C0SB1) this.l1).LIZJ;
        c2344009Gk.LJIIIIZZ("author_id", aweme3 != null ? AwemeExtKt.getAuthorUid(aweme3) : null);
        c2344009Gk.LIZJ(C735370Ssx.LJIILL(((C0SB1) this.l1).LIZJ), "pic_cnt");
        c2344009Gk.LIZJ(((Number) ((C0SB1) this.l1).LJIIIIZZ.getValue()).intValue(), "screen_height");
        c2344009Gk.LIZJ(i6, "desc_height");
        c2344009Gk.LJ(((C0SB1) this.l1).LJI.getValue(), "top_tab_height");
        c2344009Gk.LJ(((C0SB1) this.l1).LJII.getValue(), "bottom_tab_height");
        c2344009Gk.LIZJ(c0sb2.LIZLLL, "bottom_component_height");
        c2344009Gk.LIZJ(i16, "image_top_y");
        c2344009Gk.LIZJ(i12, "image_bottom_y");
        c2344009Gk.LIZJ(i14, "image_height");
        c2344009Gk.LIZJ(i, "text_overlap");
        c2344009Gk.LIZIZ(((Number) ((C0SB1) this.l1).LJIIJ.getValue()).floatValue(), "screen_dpi");
        c2344009Gk.LIZJ(((Number) ((C0SB1) this.l1).LJIIIIZZ.getValue()).intValue(), "device_height");
        c2344009Gk.LIZJ(((Number) ((C0SB1) this.l1).LJIIIZ.getValue()).intValue(), "device_width");
        c2344009Gk.LJ(c0sb02 != null ? Integer.valueOf(c0sb02.LIZIZ) : null, "original_image_height");
        c2344009Gk.LJ(c0sb02 != null ? Integer.valueOf(c0sb02.LIZ) : null, "original_image_width");
        c2344009Gk.LIZJ(i14, "image_display_height");
        c2344009Gk.LIZJ(iAbs, "image_bottomup_offsetY");
        c2344009Gk.LIZJ(i9, "feed_component_height");
        c2344009Gk.LIZJ(i18, "text_height");
        c2344009Gk.LIZJ(c0sb2.LJFF, "estimated_text_height");
        c2344009Gk.LIZJ(i19, "below_text_height");
        c2344009Gk.LIZJ(c0sb2.LJI, "estimated_below_text_height");
        c2344009Gk.LIZJ(iMax, "feed_overlap_height");
        c2344009Gk.LIZJ(iMax2, "feed_blank_height");
        c2344009Gk.LIZJ(i2, "text_overlap_height");
        c2344009Gk.LIZJ(iMax3, "estimated_text_overlap_height");
        c2344009Gk.LJ(Boolean.valueOf(iAbs <= 5), "is_fullscreen");
        c2344009Gk.LJ((Integer) this.l2, "image_index");
        if (f > 0.0f) {
            objValueOf = Float.valueOf(iMax / f);
            i3 = 1;
        } else {
            i3 = 1;
            objValueOf = 1;
        }
        c2344009Gk.LJ(objValueOf, "feed_overlap_ratio_image");
        c2344009Gk.LJ(f > 0.0f ? Float.valueOf(iMax2 / f) : Integer.valueOf(i3), "feed_blank_ratio_image");
        c2344009Gk.LJ(fIntValue > 0.0f ? Float.valueOf(iMax / fIntValue) : Integer.valueOf(i3), "feed_overlap_ratio_screen");
        c2344009Gk.LJ(fIntValue > 0.0f ? Float.valueOf(iMax2 / fIntValue) : Integer.valueOf(i3), "feed_blank_ratio_screen");
        c2344009Gk.LJ(f > 0.0f ? Float.valueOf(i2 / f) : Integer.valueOf(i3), "text_overlap_rate_image");
        c2344009Gk.LJ(fIntValue > 0.0f ? Float.valueOf(i2 / fIntValue) : Integer.valueOf(i3), "text_overlap_rate_screen");
        C20684815ws.LJIILLIIL("image_position", c2344009Gk.LIZ);
    }

    public final void LIZ$2() {
        try {
            if (C1ACY.LJIIJJI) {
                return;
            }
            if (C1ACY.LJJIJ == null) {
                C1ACY.LJJIJ = new HashMap<>();
            }
            C512350K7l c512350K7l = C512350K7l.LIZ;
            View view = (View) this.l1;
            String str = this.s0;
            Fragment fragment = (Fragment) this.l2;
            c512350K7l.getClass();
            FeedLiveViewHolderNewV2 feedLiveViewHolderNewV2LIZ = C512350K7l.LIZ(view, fragment, str);
            HashMap<String, BaseFeedLiveViewHolder> map = C1ACY.LJJIJ;
            if (map != null) {
                map.put(this.s0, feedLiveViewHolderNewV2LIZ);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void LIZ$3() {
        Integer num;
        String str = this.s0;
        if (str != null) {
            Function0 function0 = (Function0) this.l1;
            Context context = (Context) this.l2;
            C1ACY.LIZ.getClass();
            C755980Tl6 c755980Tl6LIZ = C755980Tl6.LIZ();
            c755980Tl6LIZ.getClass();
            if ((TextUtils.isEmpty(str) ? -1 : (c755980Tl6LIZ.LJIIIIZZ == null || (num = (Integer) ((ConcurrentHashMap) c755980Tl6LIZ.LJIIIIZZ).get(str)) == null) ? 0 : num.intValue()) <= 0) {
                LinkedList<View> linkedList = C1ACY.LJJIFFI;
                if ((linkedList == null || linkedList.isEmpty() || linkedList.size() == 1) && ((Boolean) function0.invoke()).booleanValue()) {
                    C1ACY.LJJII = str;
                    C512350K7l.LIZ.getClass();
                    C21146717pB.LIZJ(context, R.layout.dbz);
                    C1ACY.LJJIII.incrementAndGet();
                }
            }
        }
    }

    public final void LIZ$4() {
        if (((TextView) this.l1).getParent() == null) {
            return;
        }
        C0SXC.LJIIIIZZ = false;
        if (C0SXC.LJFF != null) {
            return;
        }
        C0SXC c0sxc = C0SXC.LIZ;
        TextView textView = (TextView) this.l1;
        c0sxc.getClass();
        TextView textView2 = (TextView) textView.getRootView().findViewById(R.id.rkk);
        TextView textView3 = null;
        if (textView2 != null) {
            if (!textView2.isShown()) {
                textView2 = null;
            }
            textView3 = textView2;
        }
        TextView textView4 = (TextView) ((View) this.l2).getRootView().findViewById(R.id.rli);
        if (C0SXC.LJFF(textView3)) {
            EnumC1235690iGF enumC1235690iGF = EnumC1235690iGF.TOP;
            String str = this.s0;
            c0sxc.getClass();
            C0SXC.LJII(textView3, enumC1235690iGF, str);
            return;
        }
        if (textView4 != null) {
            textView3 = textView4;
        }
        EnumC1235690iGF enumC1235690iGF2 = EnumC1235690iGF.BOTTOM;
        String str2 = this.s0;
        c0sxc.getClass();
        C0SXC.LJII(textView3, enumC1235690iGF2, str2);
    }

    public final void LIZ$5() {
        C727280Sfu c727280Sfu = (C727280Sfu) this.l1;
        final String str = this.s0;
        InterfaceC2217241BqE[] interfaceC2217241BqEArr = new InterfaceC2217241BqE[0];
        Function1 function1 = (Function1) this.l2;
        final C727150Sfh c727150Sfh = C727150Sfh.LIZLLL;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(C727170Sfj.class == C727170Sfj.class ? C727170Sfj.class : C727160Sfi.class);
        StoryReceiver storyReceiver = new StoryReceiver(str, c727280Sfu, c727150Sfh);
        if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C727170Sfj.class))) {
            c727150Sfh.LJ(c727280Sfu, storyReceiver);
        }
        storyReceiver.LLILZ = c727150Sfh.LIZLLL().LJJIL(new InterfaceC19483011Ki() { // from class: X.0Sfs
            @Override // X.InterfaceC19483011Ki
            public final boolean test(Object obj) {
                C727230Sfp c727230Sfp = (C727230Sfp) obj;
                if (Intrinsics.LJFF(c727150Sfh.LIZJ(c727230Sfp.LIZIZ, c727230Sfp.LIZJ), str) && (!c727230Sfp.LIZ.isEmpty())) {
                    return true;
                }
                return false;
            }
        }).LJJJJZI(new AkS474S0100000_11(interfaceC2217241BqEArr, 4)).LJJII(c727150Sfh.LIZJ).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS180S0100000_11(function1, 17), new C09JN() { // from class: X.0Sft
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("StoryAvatarBizConfig@8b09.observeMineAwemeCache$1$run$$inlined$subscribeUserStoryChanged$4");
                C1C7U.LIZIZ("StoryAvatarBizConfig@8b09.observeMineAwemeCache$1$run$$inlined$subscribeUserStoryChanged$4");
            }
        });
    }

    public final void LIZ$6() {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "homepage_explore");
        c2344009Gk.LJ((Long) this.l1, "explore_topic_id");
        C15TA c15ta = C15TA.LIZ;
        String strValueOf = String.valueOf((Long) this.l1);
        String str = this.s0;
        c15ta.getClass();
        c2344009Gk.LJIIIIZZ("explore_topic", C15TA.LIZIZ(strValueOf, str));
        c2344009Gk.LJ((Integer) this.l2, "subtab_position");
        C20684815ws.LJIILLIIL("ttexp_subtab_red_dot_show", c2344009Gk.LIZ);
    }

    public static final void run$0(ARunnableS16S1200000_11 aRunnableS16S1200000_11) {
        boolean zLIZ;
        C1C7U.LIZ("FriendsDetailViewerEntranceUIAssem@ec07.computeMaxAvatarCountAndUpdate$1");
        try {
            aRunnableS16S1200000_11.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FriendsDetailViewerEntranceUIAssem@ec07.computeMaxAvatarCountAndUpdate$1");
    }

    public static final void run$1(ARunnableS16S1200000_11 aRunnableS16S1200000_11) {
        boolean zLIZ;
        C1C7U.LIZ("ImageFeedComponentsCollisionEventTracker@6c8a.report$1");
        try {
            aRunnableS16S1200000_11.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ImageFeedComponentsCollisionEventTracker@6c8a.report$1");
    }

    public static final void run$10(ARunnableS16S1200000_11 aRunnableS16S1200000_11) {
        VideoViewCell videoViewCell = (VideoViewCell) aRunnableS16S1200000_11.l1;
        IPostModeService iPostModeService = (IPostModeService) aRunnableS16S1200000_11.l2;
        String str = aRunnableS16S1200000_11.s0;
        GradientDrawable gradientDrawable = VideoViewCell.R0;
        videoViewCell.getClass();
        C1C7U.LIZ("VideoViewCell@c979.updatePhotoPostLastSeenIndex$1L");
        iPostModeService.LJJLIIIJJI(0, videoViewCell.t, 0L, str, videoViewCell.u, false);
        C1C7U.LIZIZ("VideoViewCell@c979.updatePhotoPostLastSeenIndex$1L");
    }

    public static final void run$11(ARunnableS16S1200000_11 aRunnableS16S1200000_11) {
        boolean zLIZ;
        C1C7U.LIZ("PostModeTextSelectionOnboardingHelper@2326.tryShowOnboarding$run$1");
        try {
            aRunnableS16S1200000_11.LIZ$4();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PostModeTextSelectionOnboardingHelper@2326.tryShowOnboarding$run$1");
    }

    public static final void run$12(ARunnableS16S1200000_11 aRunnableS16S1200000_11) {
        boolean zLIZ;
        C1C7U.LIZ("StoryAvatarBizConfig@8b09.observeMineAwemeCache$1");
        try {
            aRunnableS16S1200000_11.LIZ$5();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("StoryAvatarBizConfig@8b09.observeMineAwemeCache$1");
    }

    public static final void run$13(ARunnableS16S1200000_11 aRunnableS16S1200000_11) {
        boolean zLIZ;
        C1C7U.LIZ("InteractStickerViewModel@5e79.put$1");
        try {
            ((InteractStickerViewModel) aRunnableS16S1200000_11.l1).wQ2(aRunnableS16S1200000_11.l2, aRunnableS16S1200000_11.s0);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("InteractStickerViewModel@5e79.put$1");
    }

    public static final void run$14(ARunnableS16S1200000_11 aRunnableS16S1200000_11) {
        boolean zLIZ;
        C1C7U.LIZ("ExploreMobUtils@18af.logSubtabRedDotShow$1");
        try {
            aRunnableS16S1200000_11.LIZ$6();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ExploreMobUtils@18af.logSubtabRedDotShow$1");
    }

    public static final void run$2(ARunnableS16S1200000_11 aRunnableS16S1200000_11) {
        boolean zLIZ;
        C1C7U.LIZ("InteractAreaSizeMobComponent@5b1e.specialViewRegister$1");
        try {
            InteractAreaSizeMobComponent interactAreaSizeMobComponent = (InteractAreaSizeMobComponent) aRunnableS16S1200000_11.l1;
            InterfaceC703980RjQ interfaceC703980RjQ = (InterfaceC703980RjQ) aRunnableS16S1200000_11.l2;
            String str = aRunnableS16S1200000_11.s0;
            interactAreaSizeMobComponent.getClass();
            if (str != null && str.length() != 0) {
                interfaceC703980RjQ.LJ(new C709410RsB(interactAreaSizeMobComponent, str));
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("InteractAreaSizeMobComponent@5b1e.specialViewRegister$1");
    }

    public static final void run$3(ARunnableS16S1200000_11 aRunnableS16S1200000_11) {
        boolean zLIZ;
        C1C7U.LIZ("InteractAreaSizeMobComponent@5b1e.getListenerById$1$onViewLayoutParamChange$1");
        try {
            ((InteractAreaSizeMobComponent) aRunnableS16S1200000_11.l1).lp(aRunnableS16S1200000_11.s0, (ViewGroup) aRunnableS16S1200000_11.l2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("InteractAreaSizeMobComponent@5b1e.getListenerById$1$onViewLayoutParamChange$1");
    }

    public static final void run$4(ARunnableS16S1200000_11 aRunnableS16S1200000_11) {
        boolean zLIZ;
        C1C7U.LIZ("InteractAreaSizeMobComponent@5b1e.getListenerById$1$onViewSizeChange$1");
        try {
            ((InteractAreaSizeMobComponent) aRunnableS16S1200000_11.l1).lp(aRunnableS16S1200000_11.s0, (ViewGroup) aRunnableS16S1200000_11.l2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("InteractAreaSizeMobComponent@5b1e.getListenerById$1$onViewSizeChange$1");
    }

    public static final void run$5(ARunnableS16S1200000_11 aRunnableS16S1200000_11) {
        boolean zLIZ;
        C1C7U.LIZ("InteractAreaSizeMobComponent@5b1e.getListenerById$1$onViewVisibilityChange$1");
        try {
            ((InteractAreaSizeMobComponent) aRunnableS16S1200000_11.l1).lp(aRunnableS16S1200000_11.s0, (ViewGroup) aRunnableS16S1200000_11.l2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("InteractAreaSizeMobComponent@5b1e.getListenerById$1$onViewVisibilityChange$1");
    }

    public static final void run$6(ARunnableS16S1200000_11 aRunnableS16S1200000_11) {
        boolean zLIZ;
        C1C7U.LIZ("InteractAreaSizeMobComponent@5b1e.initViewWithId$1");
        try {
            ((InteractAreaSizeMobComponent) aRunnableS16S1200000_11.l1).lp(aRunnableS16S1200000_11.s0, (ViewGroup) aRunnableS16S1200000_11.l2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("InteractAreaSizeMobComponent@5b1e.initViewWithId$1");
    }

    public static final void run$7(ARunnableS16S1200000_11 aRunnableS16S1200000_11) {
        boolean zLIZ;
        C1C7U.LIZ("SlotRuntimeManager@76cd.resetSlotDisplayState$$inlined$runOnMain$1");
        try {
            ((C699370Rbz) aRunnableS16S1200000_11.l1).LIZIZ.remove(aRunnableS16S1200000_11.s0);
            ((C699370Rbz) aRunnableS16S1200000_11.l1).LIZIZ(aRunnableS16S1200000_11.s0);
            C699370Rbz c699370Rbz = (C699370Rbz) aRunnableS16S1200000_11.l1;
            View view = (View) aRunnableS16S1200000_11.l2;
            c699370Rbz.getClass();
            C699370Rbz.LJFF(view);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SlotRuntimeManager@76cd.resetSlotDisplayState$$inlined$runOnMain$1");
    }

    public static final void run$8(ARunnableS16S1200000_11 aRunnableS16S1200000_11) {
        boolean zLIZ;
        C1C7U.LIZ("LiveCardHelperForColdBoot@43f7.prepareLiveViewHolder$1");
        try {
            aRunnableS16S1200000_11.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveCardHelperForColdBoot@43f7.prepareLiveViewHolder$1");
    }

    public static final void run$9(ARunnableS16S1200000_11 aRunnableS16S1200000_11) {
        boolean zLIZ;
        C1C7U.LIZ("LiveCardHelperForColdBoot@43f7.tryToInflateView$1");
        try {
            aRunnableS16S1200000_11.LIZ$3();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveCardHelperForColdBoot@43f7.tryToInflateView$1");
    }

    public ARunnableS16S1200000_11(View view, FeedRecommendFragment feedRecommendFragment, int i) {
        this.$t = i;
        this.l1 = view;
        this.s0 = "homepage_hot";
        this.l2 = feedRecommendFragment;
    }

    public ARunnableS16S1200000_11(Object obj, String str, Object obj2, int i) {
        this.$t = i;
        this.s0 = str;
        this.l1 = obj2;
        this.l2 = obj;
    }
}
