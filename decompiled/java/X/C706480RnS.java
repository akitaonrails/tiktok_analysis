package X;

import Y.ARunnableS16S1100000_11;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.IDetailFeedSafService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS160S1100000_11;

/* JADX INFO: renamed from: X.0RnS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C706480RnS implements C0ROW {
    public static final C706480RnS LIZ = new C706480RnS();

    @Override // X.C0ROW
    public final void LIZIZ() {
        C20673215v0.LJIIIZ(C710330Rtf.LIZIZ());
    }

    public static void LJIIIZ(Context context, String str) {
        C786410Ut5.LJJZZIII(C799570VYd.LIZIZ(), new ARunnableS16S1100000_11(context, str, 8));
    }

    @Override // X.C0ROW
    public final void LIZ(Fragment fragment, C19EG c19eg) {
        Fragment fragmentLIZLLL;
        Context context;
        IDetailFeedSafService iDetailFeedSafService = (IDetailFeedSafService) PluggableExtentionKt.pluggableSpi$default(IDetailFeedSafService.class, false, false, false, 14, null);
        if (iDetailFeedSafService != null && (fragmentLIZLLL = iDetailFeedSafService.LIZLLL(fragment)) != null && (context = fragmentLIZLLL.getContext()) != null) {
            LJIIIZ(context, C710330Rtf.LIZIZ());
        } else {
            LJIIIZ(c19eg, C710330Rtf.LIZIZ());
        }
    }

    public static void LJIIJ(C19EG c19eg, Fragment fragment, List list) {
        Context context;
        Fragment fragmentLIZLLL;
        IDetailFeedSafService iDetailFeedSafService = (IDetailFeedSafService) PluggableExtentionKt.pluggableSpi$default(IDetailFeedSafService.class, false, false, false, 14, null);
        if (iDetailFeedSafService != null && (fragmentLIZLLL = iDetailFeedSafService.LIZLLL(fragment)) != null) {
            context = fragmentLIZLLL.getContext();
        } else {
            context = null;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            for (String str : ((AbstractC706530RnX) it2.next()).LIZ()) {
                if (context != null) {
                    LIZ.getClass();
                    LJIIIZ(context, str);
                } else {
                    LIZ.getClass();
                    LJIIIZ(c19eg, str);
                }
            }
        }
    }

    @Override // X.C0ROW
    public final void LJ(Context context, Fragment fragment, String str) {
        Activity activityLIZ;
        Context context2;
        Fragment fragmentLIZLLL;
        if (context != null && (activityLIZ = C1388190mED.LIZ(context)) != null) {
            IDetailFeedSafService iDetailFeedSafService = (IDetailFeedSafService) PluggableExtentionKt.pluggableSpi$default(IDetailFeedSafService.class, false, false, false, 14, null);
            if (iDetailFeedSafService != null && (fragmentLIZLLL = iDetailFeedSafService.LIZLLL(fragment)) != null) {
                context2 = fragmentLIZLLL.getContext();
            } else {
                context2 = null;
            }
            C1618440sDa c1618440sDa = C1618440sDa.LIZIZ;
            boolean zLJJIIJZLJL = c1618440sDa.LJJIIJ().LJJIIJZLJL(fragment);
            boolean zLJIILLIIL = c1618440sDa.LJJIIJ().LJIILLIIL(str);
            ArrayList<String> arrayList = new ArrayList();
            if (zLJJIIJZLJL) {
                if (zLJIILLIIL) {
                    arrayList.addAll(new AbstractC706530RnX() { // from class: X.0Rnc
                        @Override // X.AbstractC706530RnX
                        public final void LIZJ() {
                            LIZIZ().add("story_layout_immersive_user_feed");
                        }
                    }.LIZ());
                }
                arrayList.addAll(new AbstractC706530RnX() { // from class: X.0RnT
                    @Override // X.AbstractC706530RnX
                    public final void LIZJ() {
                        LIZIZ().add("story_item_immersive_collection");
                        LIZIZ().add("story_quick_dm_bottom_bar_dark_mode");
                        LIZIZ().add("story_layout_self_bottom_bar");
                        LIZIZ().add("story_layout_over_length_sliding_progress_bar");
                        LIZIZ().add("story_layout_live_photo_label");
                        if (C298540Bn2.LIZ()) {
                            LIZIZ().add("story_relation_label_info");
                        }
                        LIZIZ().add("common_feed_layout_prohibited_tip");
                        LIZIZ().add("story_layout_user_avatar");
                        LIZIZ().add("common_feed_layout_video_title");
                        LIZIZ().add("story_music_cover");
                        LIZIZ().add("story_ab_roll_button");
                        LIZIZ().add("story_layout_immersive_quit");
                        LIZIZ().add("story_layout_loading");
                        LIZIZ().add("common_feed_layout_add_to_story_button_immersive_feed");
                        LIZIZ().add("story_layout_viewer_entrance");
                        LIZIZ().add("story_layout_standard_button");
                        LIZIZ().add("story_video_digg");
                        LIZIZ().add("story_ad_setting");
                        LIZIZ().add("story_aigc_label");
                        if (((Number) C1245204u2.LIZ.getValue()).intValue() > 0) {
                            LIZIZ().add("story_layout_two_btn_bottom");
                        }
                        if (C562450M4d.LIZ()) {
                            LIZIZ().add("story_ai_theater_bottom_button");
                        }
                        if (C298520Bn0.LIZ()) {
                            LIZIZ().add("story_highlights_theme_tag");
                        }
                        if (C298510Bmz.LIZ()) {
                            LIZIZ().add("story_layout_use_sound_component");
                        }
                        if (C0BWW.LIZ()) {
                            LIZIZ().add("story_video_dislike");
                            LIZIZ().add("story_video_follow");
                            LIZIZ().add("story_video_dislike_undo_toast");
                            LIZIZ().add("story_layout_unfollow_other_bottom_bar");
                        }
                        LIZIZ().add("story_layout_share");
                        LIZIZ().add("story_layout_other_bottom_bar");
                        LIZIZ().add("story_layout_ab_roll_try_it_view");
                        LIZIZ().add("story_layout_audience_tag_view");
                        LIZIZ().add("story_layout_external_link_view");
                        LIZIZ().add("story_layout_secret_reply_tag_view");
                        LIZIZ().add("common_feed_emoji_anim_layout");
                        LIZIZ().add("story_layout_immersive_relation_button");
                        LIZIZ().add("story_layout_immersive_bottom_info");
                        LIZIZ().add("layout_video_multi_tag");
                        C728040Sh8.LIZ.getClass();
                        if (C728040Sh8.LIZ()) {
                            LIZIZ().add("story_layout_highlights");
                        }
                        C728030Sh7.LIZ.getClass();
                        if (C728030Sh7.LIZ()) {
                            LIZIZ().add("story_layout_highlights_cover");
                            LIZIZ().add("story_immersive_feed_highlights_anchor");
                            LIZIZ().add("story_layout_highlights_overlay");
                            LIZIZ().add("story_layout_highlights_share");
                        }
                        if ((((Number) C1238304sv.LIZ.getValue()).intValue() & 1) != 0 || C1238304sv.LIZ()) {
                            LIZIZ().add("story_share_reshare_subtitle");
                        }
                        C728010Sh5.LIZ.getClass();
                        if (C728010Sh5.LIZIZ()) {
                            LIZIZ().add("story_reveal_tag");
                            LIZIZ().add("story_layout_reveal_opt_out");
                            LIZIZ().add("story_reveal_unlock_button");
                        }
                        LIZIZ().add("story_whee_tag");
                    }
                }.LIZ());
            } else {
                arrayList.addAll(C706540RnY.LIZJ.LIZ());
            }
            arrayList.addAll(C706620Rng.LIZJ.LIZ());
            arrayList.addAll(C706630Rnh.LIZJ.LIZ());
            arrayList.addAll(C706600Rne.LIZJ.LIZ());
            arrayList.addAll(new AbstractC706530RnX() { // from class: X.0Rnb
                @Override // X.AbstractC706530RnX
                public final void LIZJ() {
                    LIZIZ().add("story_item_immersive_guide_upload_card");
                }
            }.LIZ());
            C728010Sh5.LIZ.getClass();
            if (C728010Sh5.LIZIZ()) {
                arrayList.addAll(new AbstractC706530RnX() { // from class: X.0Rnf
                    @Override // X.AbstractC706530RnX
                    public final void LIZJ() {
                        LIZIZ().add("story_item_immersive_reveal_promo_card");
                    }
                }.LIZ());
            }
            arrayList.addAll(C706590Rnd.LIZJ.LIZ());
            for (String str2 : arrayList) {
                if (context2 != null) {
                    LIZ.getClass();
                    LJIIIZ(context2, str2);
                } else {
                    LIZ.getClass();
                    LJIIIZ(activityLIZ, str2);
                }
            }
            if (context2 != null) {
                LJIIIZ(context2, "story_uploading_progress_bar");
            } else {
                LJIIIZ(activityLIZ, "story_uploading_progress_bar");
            }
        }
    }

    public static void LJII(ReusedUISlotAssem reusedUISlotAssem, String str, boolean z, Function0 function0) {
        AwS160S1100000_11 awS160S1100000_11;
        C1163440gNi c1163440gNi;
        Fragment fragmentLIZLLL;
        Context context;
        System.currentTimeMillis();
        IDetailFeedSafService iDetailFeedSafService = (IDetailFeedSafService) PluggableExtentionKt.pluggableSpi$default(IDetailFeedSafService.class, false, false, false, 14, null);
        if (iDetailFeedSafService != null && (fragmentLIZLLL = iDetailFeedSafService.LIZLLL(C724240Sb0.LJI(reusedUISlotAssem))) != null && (context = fragmentLIZLLL.getContext()) != null) {
            awS160S1100000_11 = new AwS160S1100000_11(context, str, 17);
        } else {
            awS160S1100000_11 = new AwS160S1100000_11(reusedUISlotAssem, (ReusedUISlotAssem<Object>) str, (String) 18);
        }
        if (z) {
            c1163440gNi = C706460RnQ.LIZ;
        } else {
            c1163440gNi = C1163440gNi.LIZLLL;
        }
        reusedUISlotAssem.mp(c1163440gNi);
        function0.invoke();
        awS160S1100000_11.invoke();
    }

    @Override // X.C0ROW
    public final void LJFF(Context context, EnumC706640Rni enumC706640Rni, Fragment fragment, String str) {
        Activity activityLIZ;
        Context context2;
        C0RJN c0rjnLIZIZ;
        Fragment fragmentLIZLLL;
        if (context != null && (activityLIZ = C1388190mED.LIZ(context)) != null) {
            IDetailFeedSafService iDetailFeedSafService = (IDetailFeedSafService) PluggableExtentionKt.pluggableSpi$default(IDetailFeedSafService.class, false, false, false, 14, null);
            if (iDetailFeedSafService != null && (fragmentLIZLLL = iDetailFeedSafService.LIZLLL(fragment)) != null) {
                context2 = fragmentLIZLLL.getContext();
            } else {
                context2 = null;
            }
            ArrayList<String> arrayList = new ArrayList();
            boolean zLIZLLL = C1600750rl3.LIZLLL(str);
            int i = C0RU1.LIZ[enumC706640Rni.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    if (zLIZLLL) {
                        return;
                    }
                    arrayList.add("common_feed_layout_video_title");
                    arrayList.add("common_feed_layout_prohibited_tip");
                    arrayList.add("common_feed_emoji_anim_layout");
                }
            } else {
                if (zLIZLLL) {
                    return;
                }
                if (fragment != null && (c0rjnLIZIZ = C1578630rBN.LIZIZ(fragment)) != null && C1389300mG0.LJIJJ(c0rjnLIZIZ)) {
                    arrayList.addAll(C706540RnY.LIZJ.LIZ());
                    arrayList.addAll(C706620Rng.LIZJ.LIZ());
                    arrayList.addAll(C706630Rnh.LIZJ.LIZ());
                    arrayList.addAll(C706600Rne.LIZJ.LIZ());
                    arrayList.addAll(C706590Rnd.LIZJ.LIZ());
                    arrayList.add("story_uploading_progress_bar");
                }
            }
            for (String str2 : arrayList) {
                if (context2 != null) {
                    LIZ.getClass();
                    LJIIIZ(context2, str2);
                } else {
                    LIZ.getClass();
                    LJIIIZ(activityLIZ, str2);
                }
            }
        }
    }

    @Override // X.C0ROW
    public final <RECEIVER extends C03H5> void LJI(ReusedUISlotAssem<RECEIVER> reusedUISlotAssem, String str, boolean z, Function0<Unit> function0) {
        LJII(reusedUISlotAssem, str, z, function0);
    }

    @Override // X.C0ROW
    public final View LIZLLL(Context context, LayoutInflater layoutInflater, int i, ViewGroup viewGroup, boolean z) {
        System.currentTimeMillis();
        if (context != null) {
            return C21146717pB.LIZIZ(context, i, viewGroup, z);
        }
        if (layoutInflater == null) {
            layoutInflater = C786410Ut5.ne(context);
        }
        return C786410Ut5.Td(layoutInflater, i, viewGroup, z);
    }

    @Override // X.C0ROW
    public final View LIZJ(String str, Context context, Fragment fragment, int i, LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, boolean z2) {
        Activity activityLIZ;
        View viewTd;
        Fragment fragmentLIZLLL;
        System.currentTimeMillis();
        Context context2 = null;
        if (context != null) {
            activityLIZ = C1388190mED.LIZ(context);
        } else {
            activityLIZ = null;
        }
        IDetailFeedSafService iDetailFeedSafService = (IDetailFeedSafService) PluggableExtentionKt.pluggableSpi$default(IDetailFeedSafService.class, false, false, false, 14, null);
        if (iDetailFeedSafService != null && (fragmentLIZLLL = iDetailFeedSafService.LIZLLL(fragment)) != null && (context2 = fragmentLIZLLL.getContext()) != null) {
            viewTd = C20673215v0.LJFF(context2, context2, i, viewGroup, z);
        } else if (activityLIZ != null) {
            if (viewGroup != null) {
                viewTd = C20673215v0.LIZLLL(i, activityLIZ, viewGroup, z);
            } else {
                viewTd = C20673215v0.LIZJ(i, activityLIZ);
            }
        } else {
            if (layoutInflater == null) {
                layoutInflater = C786410Ut5.ne(context);
            }
            viewTd = C786410Ut5.Td(layoutInflater, i, viewGroup, z);
        }
        if (z2) {
            if (context2 != null) {
                LJIIIZ(context2, str);
            } else if (activityLIZ != null) {
                LIZ.getClass();
                LJIIIZ(activityLIZ, str);
                return viewTd;
            }
        }
        return viewTd;
    }
}
