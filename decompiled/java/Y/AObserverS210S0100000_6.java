package Y;

import X.AbstractC21342018fa;
import X.C03AD;
import X.C089E;
import X.C09OD;
import X.C0AXU;
import X.C0H39;
import X.C0HCK;
import X.C0HCP;
import X.C0HF2;
import X.C0HN1;
import X.C0HYG;
import X.C0I7D;
import X.C0IDZ;
import X.C0S1K;
import X.C0VWN;
import X.C0WZX;
import X.C123100dR;
import X.C1256560inu;
import X.C1295960jpS;
import X.C1308910kAL;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1356610lPH;
import X.C1362650lZ1;
import X.C1369580lkC;
import X.C1388190mED;
import X.C1389890mGx;
import X.C1390410mHn;
import X.C1390920mIc;
import X.C13LP;
import X.C14LC;
import X.C1524805y2;
import X.C1602160rnK;
import X.C1619980sG4;
import X.C1697810uHb;
import X.C1720106oR;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C1893080zMY;
import X.C1954807lC;
import X.C19549411e8;
import X.C197039127h;
import X.C19EG;
import X.C19EH;
import X.C20684815ws;
import X.C20746816Gk;
import X.C21341918fZ;
import X.C21342318fd;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C2252331DDr;
import X.C2277881EDy;
import X.C23250099c;
import X.C2344009Gk;
import X.C298610Bn9;
import X.C298840BnW;
import X.C418440Gaw;
import X.C420980Gf2;
import X.C424470Gkf;
import X.C426750GoL;
import X.C427450GpT;
import X.C428080GqU;
import X.C431260Gvc;
import X.C435330H5f;
import X.C437160HCg;
import X.C437880HFa;
import X.C439850HMp;
import X.C442400HWk;
import X.C442910HYj;
import X.C444940Hca;
import X.C455230HtB;
import X.C455290HtH;
import X.C455740Hu0;
import X.C456220Hum;
import X.C461840I9e;
import X.C736680Sv4;
import X.C785410UrT;
import X.C786410Ut5;
import X.C814420VxA;
import X.C960203pA;
import X.DialogC1389620mGW;
import X.EnumC1256590inx;
import X.EnumC444370Hbf;
import X.EnumC455750Hu1;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.text.style.ClickableSpan;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelKt;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.intro.TuxPanel;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.compliance.privacy.phl.PhlFragment;
import com.ss.android.ugc.aweme.favorites.business.video.FavoriteVideoTabRootFragment;
import com.ss.android.ugc.aweme.favorites.profile.FavoriteSearchViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMConversation;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.lemon.postmode.ui.photo.model.PostModeFullPageViewModel;
import com.ss.android.ugc.aweme.music.ui.reuseaudio.ReuseAudioDetailFragment;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.fragment.ShareInviteContentFragment;
import com.ss.android.ugc.aweme.search.pages.core.ui.fragment.SearchContainerFragment;
import com.ss.android.ugc.aweme.share.systemshare.SystemShareFragment;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.story.feed.guidecard.component.StoryGuideCardComponent;
import com.ss.android.ugc.aweme.story.note.StoryThoughtAvatarCreationFragment;
import com.ss.android.ugc.aweme.story.note.StoryThoughtAvatarSheetFragment;
import com.ss.android.ugc.aweme.story.note.panel.StoryNotePanelUserFragment;
import com.ss.android.ugc.aweme.story.note.panel.StoryNotePanelUserVM;
import com.ss.android.ugc.profile.business.profile.background.ProfileBgVideoListActivity;
import com.ss.android.ugc.profile.business.ur.ui.MusProfileEditFragment;
import com.ss.android.ugc.tiktok.privacy.api.phl.model.PrivacyHighlightsForTeensDescription;
import com.ss.android.ugc.tiktok.privacy.api.phl.model.PrivacyHighlightsForTeensVideo;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS372S0200000_6;
import kotlin.jvm.internal.AwS407S0200000_6;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes7.dex */
public class AObserverS210S0100000_6 implements Observer {
    public final int $t;
    public Object l0;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                break;
            case 1:
                onChanged$1(this, obj);
                break;
            case 2:
                onChanged$2(this, obj);
                break;
            case 3:
                onChanged$3(this, obj);
                break;
            case 4:
                onChanged$4(this, obj);
                break;
            case 5:
                onChanged$5(this, obj);
                break;
            case 6:
                onChanged$6(this, obj);
                break;
            case 7:
                onChanged$7(this, obj);
                break;
            case 8:
                onChanged$8(this, obj);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onChanged$9(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onChanged$10(this, obj);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onChanged$11(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onChanged$12(this, obj);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                onChanged$13(this, obj);
                break;
            case 14:
                onChanged$14(this, obj);
                break;
            case 15:
                onChanged$15(this, obj);
                break;
            case 16:
                onChanged$16(this, obj);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                onChanged$17(this, obj);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                onChanged$18(this, obj);
                break;
            case 19:
                onChanged$19(this, obj);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                onChanged$20(this, obj);
                break;
            case 21:
                onChanged$21(this, obj);
                break;
            case 22:
                onChanged$22(this, obj);
                break;
            case 23:
                onChanged$23(this, obj);
                break;
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                onChanged$24(this, obj);
                break;
            case 25:
                onChanged$25(this, obj);
                break;
            case 26:
                onChanged$26(this, obj);
                break;
            case 27:
                onChanged$27(this, obj);
                break;
            case 28:
                onChanged$28(this, obj);
                break;
            case 29:
                onChanged$29(this, obj);
                break;
            case 30:
                onChanged$30(this, obj);
                break;
            case 31:
                onChanged$31(this, obj);
                break;
            case 32:
                onChanged$32(this, obj);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                onChanged$33(this, obj);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                onChanged$34(this, obj);
                break;
            case 35:
                onChanged$35(this, obj);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                onChanged$36(this, obj);
                break;
            case 37:
                onChanged$37(this, obj);
                break;
            case 38:
                onChanged$38(this, obj);
                break;
            case 39:
                onChanged$39(this, obj);
                break;
            case 40:
                onChanged$40(this, obj);
                break;
            case 41:
                onChanged$41(this, obj);
                break;
            case 42:
                onChanged$42(this, obj);
                break;
            case 43:
                onChanged$43(this, obj);
                break;
            case 44:
                onChanged$44(this, obj);
                break;
            case 45:
                onChanged$45(this, obj);
                break;
            case 46:
                onChanged$46(this, obj);
                break;
            case 47:
                onChanged$47(this, obj);
                break;
            case 48:
                onChanged$48(this, obj);
                break;
            case 49:
                onChanged$49(this, obj);
                break;
            case BaseNotice.RECOMMEND_LIVE /* 50 */:
                onChanged$50(this, obj);
                break;
            case 51:
                onChanged$51(this, obj);
                break;
            case 52:
                onChanged$52(this, obj);
                break;
            case 53:
                onChanged$53(this, obj);
                break;
            case 54:
                onChanged$54(this, obj);
                break;
            case 55:
                onChanged$55(this, obj);
                break;
            case 56:
                onChanged$56(this, obj);
                break;
            case 57:
                onChanged$57(this, obj);
                break;
        }
    }

    public AObserverS210S0100000_6(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onChanged$0(AObserverS210S0100000_6 aObserverS210S0100000_6, Object obj) {
        Integer num = (Integer) obj;
        LinearLayout linearLayout = ((StoryNotePanelUserFragment) aObserverS210S0100000_6.l0).LLJJI;
        if (linearLayout != null) {
            C786410Ut5.LJZL(num.intValue(), linearLayout);
        }
    }

    public static final void onChanged$1(AObserverS210S0100000_6 aObserverS210S0100000_6, Object obj) {
        List<String> list = (List) obj;
        StoryNotePanelUserFragment storyNotePanelUserFragment = (StoryNotePanelUserFragment) aObserverS210S0100000_6.l0;
        storyNotePanelUserFragment.getClass();
        if (C298610Bn9.LIZ()) {
            int i = 0;
            for (String str : list) {
                int i2 = i + 1;
                Context context = null;
                if (i >= 0) {
                    String str2 = str;
                    if (i < list.size()) {
                        LinearLayout linearLayout = storyNotePanelUserFragment.LLJJI;
                        if (linearLayout != null) {
                            context = linearLayout.getContext();
                        }
                        ImageView imageView = new ImageView(context);
                        imageView.setImageBitmap(storyNotePanelUserFragment.SR(i, list));
                        imageView.setContentDescription(str2);
                        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(25)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(25)));
                        marginLayoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
                        C786410Ut5.c6(imageView, marginLayoutParams);
                        C786410Ut5.Q7(imageView, new ACListenerS20S0301000_6(storyNotePanelUserFragment, imageView, i, list, 0));
                        LinearLayout linearLayout2 = storyNotePanelUserFragment.LLJJI;
                        if (linearLayout2 != null) {
                            linearLayout2.addView(imageView);
                        }
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
    }

    public static final void onChanged$10(AObserverS210S0100000_6 aObserverS210S0100000_6, Object obj) {
        Integer num = (Integer) obj;
        FrameLayout frameLayout = ((StoryNotePanelUserFragment) aObserverS210S0100000_6.l0).LLJILLL;
        if (frameLayout != null) {
            C786410Ut5.LJZ(num.intValue(), frameLayout);
        }
    }

    public static final void onChanged$11(AObserverS210S0100000_6 aObserverS210S0100000_6, Object obj) {
        TuxTextView tuxTextView = null;
        if (((Boolean) obj).booleanValue()) {
            View view = ((C19549411e8) aObserverS210S0100000_6.l0).LLJJI;
            if (view == null) {
                view = null;
            }
            C786410Ut5.LJLLLLLL(0, view);
            C19549411e8 c19549411e8 = (C19549411e8) aObserverS210S0100000_6.l0;
            TuxTextView tuxTextView2 = c19549411e8.LLJJIII;
            if (tuxTextView2 != null) {
                tuxTextView = tuxTextView2;
            }
            tuxTextView.setText(c19549411e8.getContext().getString(2131820762));
            return;
        }
        View view2 = ((C19549411e8) aObserverS210S0100000_6.l0).LLJJI;
        if (view2 == null) {
            view2 = null;
        }
        C786410Ut5.LJLLLLLL(8, view2);
        C19549411e8 c19549411e82 = (C19549411e8) aObserverS210S0100000_6.l0;
        TuxTextView tuxTextView3 = c19549411e82.LLJJIII;
        if (tuxTextView3 != null) {
            tuxTextView = tuxTextView3;
        }
        tuxTextView.setText(c19549411e82.getContext().getString(2131820753));
    }

    public static final void onChanged$12(AObserverS210S0100000_6 aObserverS210S0100000_6, Object obj) {
        View view = null;
        if (((Boolean) obj).booleanValue()) {
            View view2 = ((C19549411e8) aObserverS210S0100000_6.l0).LLJ;
            if (view2 != null) {
                view = view2;
            }
            C786410Ut5.LJLLLLLL(0, view);
            return;
        }
        View view3 = ((C19549411e8) aObserverS210S0100000_6.l0).LLJ;
        if (view3 != null) {
            view = view3;
        }
        C786410Ut5.LJLLLLLL(8, view);
    }

    public static final void onChanged$13(AObserverS210S0100000_6 aObserverS210S0100000_6, Object obj) {
        View view;
        Integer num = (Integer) obj;
        View view2 = ((C19549411e8) aObserverS210S0100000_6.l0).LLJ;
        View view3 = null;
        if (view2 == null) {
            view = null;
            view2 = null;
        } else {
            view = view2;
        }
        int paddingLeft = view2.getPaddingLeft();
        View view4 = ((C19549411e8) aObserverS210S0100000_6.l0).LLJ;
        if (view4 == null) {
            view4 = null;
        }
        int paddingTop = view4.getPaddingTop();
        View view5 = ((C19549411e8) aObserverS210S0100000_6.l0).LLJ;
        if (view5 != null) {
            view3 = view5;
        }
        view.setPadding(paddingLeft, paddingTop, view3.getPaddingRight(), num.intValue());
    }

    public static final void onChanged$14(AObserverS210S0100000_6 aObserverS210S0100000_6, Object obj) {
        String str = (String) obj;
        if (str != null) {
            C0I7D c0i7d = ((C19549411e8) aObserverS210S0100000_6.l0).LLJI;
            if (c0i7d == null) {
                c0i7d = null;
            }
            c0i7d.setText(str);
            if (C123100dR.LIZ(str)) {
                C0I7D c0i7d2 = ((C19549411e8) aObserverS210S0100000_6.l0).LLJI;
                if (c0i7d2 == null) {
                    c0i7d2 = null;
                }
                c0i7d2.setSelection(String.valueOf(C2204961BRm.LLLLJI(c0i7d2, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF384cWghZ6StZ5ba0yD0HYIYeX3XvhRxH5OKB2ruboWof/TrsELK23u/SjpmUQr1yM06gUEbNE8pVBqyCUpxEA==", null))).length());
            }
        }
    }

    public static final void onChanged$15(AObserverS210S0100000_6 aObserverS210S0100000_6, Object obj) {
        C0I7D c0i7d = null;
        if (((Boolean) obj).booleanValue()) {
            C0I7D c0i7d2 = ((C19549411e8) aObserverS210S0100000_6.l0).LLJI;
            if (c0i7d2 != null) {
                c0i7d = c0i7d2;
            }
            c0i7d.setLineSpacing(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), 1.0f);
            return;
        }
        C0I7D c0i7d3 = ((C19549411e8) aObserverS210S0100000_6.l0).LLJI;
        if (c0i7d3 != null) {
            c0i7d = c0i7d3;
        }
        c0i7d.setLineSpacing(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), 1.0f);
    }

    public static final void onChanged$16(AObserverS210S0100000_6 aObserverS210S0100000_6, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        C427450GpT c427450GpT = null;
        if (zBooleanValue) {
            C427450GpT c427450GpT2 = ((C19549411e8) aObserverS210S0100000_6.l0).LLIZ;
            if (c427450GpT2 != null) {
                c427450GpT = c427450GpT2;
            }
            int visibility = c427450GpT.getVisibility();
            c427450GpT.setVisibility(0);
            C1602160rnK.LIZIZ(visibility, 0, c427450GpT);
            return;
        }
        C427450GpT c427450GpT3 = ((C19549411e8) aObserverS210S0100000_6.l0).LLIZ;
        if (c427450GpT3 != null) {
            c427450GpT = c427450GpT3;
        }
        int visibility2 = c427450GpT.getVisibility();
        c427450GpT.setVisibility(8);
        C1602160rnK.LIZIZ(visibility2, 8, c427450GpT);
    }

    public static final void onChanged$17(AObserverS210S0100000_6 aObserverS210S0100000_6, Object obj) {
        Integer num = (Integer) obj;
        C427450GpT c427450GpT = ((C19549411e8) aObserverS210S0100000_6.l0).LLIZ;
        if (c427450GpT == null) {
            c427450GpT = null;
        }
        c427450GpT.setProgress(num.intValue());
    }

    public static final void onChanged$18(AObserverS210S0100000_6 aObserverS210S0100000_6, Object obj) {
        TuxTextView tuxTextView = null;
        if (((Boolean) obj).booleanValue()) {
            TuxTextView tuxTextView2 = ((C19549411e8) aObserverS210S0100000_6.l0).LLILZIL;
            if (tuxTextView2 != null) {
                tuxTextView = tuxTextView2;
            }
            C786410Ut5.LLLLZLL(tuxTextView, 0);
            return;
        }
        TuxTextView tuxTextView3 = ((C19549411e8) aObserverS210S0100000_6.l0).LLILZIL;
        if (tuxTextView3 != null) {
            tuxTextView = tuxTextView3;
        }
        C786410Ut5.LLLLZLL(tuxTextView, 8);
    }

    public static final void onChanged$19(AObserverS210S0100000_6 aObserverS210S0100000_6, Object obj) {
        TuxTextView tuxTextView = null;
        if (((Boolean) obj).booleanValue()) {
            TuxTextView tuxTextView2 = ((C19549411e8) aObserverS210S0100000_6.l0).LLILZIL;
            if (tuxTextView2 != null) {
                tuxTextView = tuxTextView2;
            }
            C786410Ut5.B5(tuxTextView, 1.0f);
            return;
        }
        TuxTextView tuxTextView3 = ((C19549411e8) aObserverS210S0100000_6.l0).LLILZIL;
        if (tuxTextView3 != null) {
            tuxTextView = tuxTextView3;
        }
        C786410Ut5.B5(tuxTextView, 0.4f);
    }

    public static final void onChanged$2(AObserverS210S0100000_6 aObserverS210S0100000_6, Object obj) {
        Integer numLIZJ;
        StoryNotePanelUserFragment storyNotePanelUserFragment = (StoryNotePanelUserFragment) aObserverS210S0100000_6.l0;
        if (!((Boolean) obj).booleanValue()) {
            C0I7D c0i7d = storyNotePanelUserFragment.LLJILJIL;
            if (c0i7d != null) {
                c0i7d.setText(c0i7d.getContext().getText(2131849036));
                c0i7d.setTextColor(c0i7d.getCurrentHintTextColor());
                c0i7d.setEnabled(false);
                c0i7d.setFocusable(false);
                c0i7d.setFocusableInTouchMode(false);
                c0i7d.setClickable(false);
                c0i7d.setLongClickable(false);
                return;
            }
            return;
        }
        C0I7D c0i7d2 = storyNotePanelUserFragment.LLJILJIL;
        if (c0i7d2 != null) {
            c0i7d2.setEnabled(true);
            c0i7d2.setFocusable(true);
            c0i7d2.setFocusableInTouchMode(true);
            c0i7d2.setClickable(true);
            c0i7d2.setLongClickable(true);
            c0i7d2.setText("");
            Context context = c0i7d2.getContext();
            if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, context)) != null) {
                c0i7d2.setTextColor(numLIZJ.intValue());
            }
        }
        C0I7D c0i7d3 = storyNotePanelUserFragment.LLJILJIL;
        if (c0i7d3 == null) {
            return;
        }
        final StoryNotePanelUserVM storyNotePanelUserVMUR = storyNotePanelUserFragment.UR();
        c0i7d3.addTextChangedListener(new TextWatcher(storyNotePanelUserVMUR) { // from class: X.0Gwu
            public final StoryNotePanelUserVM LL;

            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            {
                this.LL = storyNotePanelUserVMUR;
            }

            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                boolean z;
                String string = a0.LJLIIIL(String.valueOf(editable)).toString();
                StoryNotePanelUserVM storyNotePanelUserVM = this.LL;
                storyNotePanelUserVM.LLJILJILJ.setValue(string);
                MutableLiveData<Boolean> mutableLiveData = storyNotePanelUserVM.LLJILLL;
                String value = storyNotePanelUserVM.LLJILJILJ.getValue();
                if (value != null && value.length() != 0) {
                    z = false;
                } else {
                    z = true;
                }
                mutableLiveData.setValue(Boolean.valueOf(!z));
            }
        });
    }

    public static final void onChanged$20(AObserverS210S0100000_6 aObserverS210S0100000_6, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        C0HN1 c0hn1 = null;
        if (zBooleanValue) {
            C0HN1 c0hn12 = ((C19549411e8) aObserverS210S0100000_6.l0).LLJIJIL;
            if (c0hn12 != null) {
                c0hn1 = c0hn12;
            }
            int visibility = c0hn1.getVisibility();
            c0hn1.setVisibility(0);
            C1602160rnK.LIZIZ(visibility, 0, c0hn1);
            return;
        }
        C0HN1 c0hn13 = ((C19549411e8) aObserverS210S0100000_6.l0).LLJIJIL;
        if (c0hn13 != null) {
            c0hn1 = c0hn13;
        }
        int visibility2 = c0hn1.getVisibility();
        c0hn1.setVisibility(8);
        C1602160rnK.LIZIZ(visibility2, 8, c0hn1);
    }

    public static final void onChanged$21(AObserverS210S0100000_6 aObserverS210S0100000_6, Object obj) {
        C1331670kl3 c1331670kl3LJI = C1331660kl2.LJI(UriProtector.parse((String) obj));
        SmartImageView smartImageView = ((C19549411e8) aObserverS210S0100000_6.l0).LLILLL;
        if (smartImageView == null) {
            smartImageView = null;
        }
        c1331670kl3LJI.LJJ(smartImageView);
        C786410Ut5.h3(c1331670kl3LJI);
    }

    public static final void onChanged$22(AObserverS210S0100000_6 aObserverS210S0100000_6, Object obj) {
        String string = (String) obj;
        PhlFragment phlFragment = (PhlFragment) aObserverS210S0100000_6.l0;
        C197039127h c197039127h = phlFragment.LLJJI;
        if (c197039127h == null) {
            c197039127h = null;
        }
        if (string.length() == 0) {
            string = phlFragment.getString(2131845142);
        }
        c197039127h.setText(string);
    }

    public static final void onChanged$23(AObserverS210S0100000_6 aObserverS210S0100000_6, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            C1749280vcc c1749280vcc = ((PhlFragment) aObserverS210S0100000_6.l0).LLIZ;
            if (c1749280vcc != null) {
                C786410Ut5.LLLZLZ(c1749280vcc, 8);
                return;
            }
            return;
        }
        C1749280vcc c1749280vcc2 = ((PhlFragment) aObserverS210S0100000_6.l0).LLIZ;
        if (c1749280vcc2 == null) {
            return;
        }
        C1722300uv6 c1722300uv6 = new C1722300uv6();
        C1893080zMY.LIZ(c1722300uv6, new AwS550S0100000_6((PhlFragment) aObserverS210S0100000_6.l0, 63));
        c1749280vcc2.setStatus(c1722300uv6);
    }

    public static final void onChanged$24(AObserverS210S0100000_6 aObserverS210S0100000_6, Object obj) {
        PrivacyHighlightsForTeensDescription privacyHighlightsForTeensDescription = (PrivacyHighlightsForTeensDescription) obj;
        PhlFragment phlFragment = (PhlFragment) aObserverS210S0100000_6.l0;
        phlFragment.getClass();
        String str = privacyHighlightsForTeensDescription.linkName;
        String strJ4 = C786410Ut5.j4(privacyHighlightsForTeensDescription.name, Arrays.copyOf(new Object[]{str}, 1));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strJ4);
        int iLJJJ = a0.LJJJ(strJ4, str, 0, false, 6);
        int length = str.length() + iLJJJ;
        if (iLJJJ >= 0 && length < strJ4.length()) {
            C444940Hca c444940Hca = new C444940Hca();
            c444940Hca.LIZIZ(53);
            c444940Hca.LIZLLL(1);
            c444940Hca.LJIIIIZZ = new AwS407S0200000_6(phlFragment, privacyHighlightsForTeensDescription, 3);
            SpannableStringBuilder spannableStringBuilder2 = (SpannableStringBuilder) c444940Hca.LIZ(phlFragment.getContext());
            C089E c089e = new C089E(spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), ClickableSpan.class));
            while (c089e.hasNext()) {
                C786410Ut5.q2(spannableStringBuilder, c089e.next(), iLJJJ, length, 33);
            }
        }
        TuxTextView tuxTextView = phlFragment.LLJILJIL;
        if (tuxTextView != null) {
            tuxTextView.setText(spannableStringBuilder);
            tuxTextView.setMovementMethod(C431260Gvc.LIZ);
        }
    }

    public static final void onChanged$25(AObserverS210S0100000_6 aObserverS210S0100000_6, Object obj) {
        Integer numValueOf;
        C0H39 c0h39 = (C0H39) ((PhlFragment) aObserverS210S0100000_6.l0).LLJJIJI.getValue();
        ((ArrayList) c0h39.LLILLJJLI).clear();
        ((ArrayList) c0h39.LLILLJJLI).addAll((Collection) obj);
        c0h39.notifyDataSetChanged();
        PhlFragment phlFragment = (PhlFragment) aObserverS210S0100000_6.l0;
        phlFragment.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", phlFragment.LLJJIJIL);
        List<PrivacyHighlightsForTeensVideo> value = phlFragment.SR().LLILZ.getValue();
        if (value != null) {
            numValueOf = Integer.valueOf(value.size());
        } else {
            numValueOf = null;
        }
        c2344009Gk.LJ(numValueOf, "video_cnt");
        C20684815ws.LJIILLIIL("show_privacy_highlights_teens_page", c2344009Gk.LIZ);
    }

    public static final void onChanged$26(AObserverS210S0100000_6 aObserverS210S0100000_6, Object obj) {
        String str;
        Fragment favoriteVideoSearchResultFragment;
        FavoriteSearchViewModel favoriteSearchViewModelUR = ((FavoriteVideoTabRootFragment) aObserverS210S0100000_6.l0).UR();
        if (favoriteSearchViewModelUR != null && (str = favoriteSearchViewModelUR.LLJILJILJ) != null) {
            EditText editText = ((FavoriteVideoTabRootFragment) aObserverS210S0100000_6.l0).LLJJ;
            if (editText != null) {
                editText.setText(str);
                editText.setSelection(C2204961BRm.LLJILLL(editText, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOypdZDc1SYJh7FSwtQaJ5OuoLljF4g5HQ2LdpTNkqjr60Yj3qWMNNfUm2yxSpbMLdHABFv8", null)).length());
            }
            EditText editText2 = ((FavoriteVideoTabRootFragment) aObserverS210S0100000_6.l0).LLJJ;
            if (editText2 != null) {
                editText2.clearFocus();
            }
            EditText editText3 = ((FavoriteVideoTabRootFragment) aObserverS210S0100000_6.l0).LLJJ;
            if (editText3 != null) {
                KeyboardUtils.LIZIZ(editText3);
            }
            if (((FavoriteVideoTabRootFragment) aObserverS210S0100000_6.l0).RR() != EnumC444370Hbf.LLILLL) {
                FavoriteVideoTabRootFragment favoriteVideoTabRootFragment = (FavoriteVideoTabRootFragment) aObserverS210S0100000_6.l0;
                Fragment fragmentLJJJJZI = favoriteVideoTabRootFragment.getChildFragmentManager().LJJJJZI("favorite_video_tab_search_input");
                if (fragmentLJJJJZI != null && (favoriteVideoSearchResultFragment = C2277881EDy.LIZIZ.getFavoriteVideoSearchResultFragment()) != null) {
                    C19EH c19ehLJIIJ = favoriteVideoTabRootFragment.getChildFragmentManager().LJIIJ();
                    c19ehLJIIJ.LJIL(fragmentLJJJJZI, Lifecycle.State.STARTED);
                    c19ehLJIIJ.LIZJ(R.id.hqv, favoriteVideoSearchResultFragment, "favorite_video_tab_search_result");
                    c19ehLJIIJ.LJII("favorite_video_tab_search_result");
                    c19ehLJIIJ.LJIIIZ();
                }
            }
        }
    }

    public static final void onChanged$27(AObserverS210S0100000_6 aObserverS210S0100000_6, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            C456220Hum c456220Hum = (C456220Hum) aObserverS210S0100000_6.l0;
            if (!c456220Hum.LLJJJJJIL) {
                C786410Ut5.Pd(C455290HtH.LIZ(c456220Hum));
            }
        }
    }

    public static final void onChanged$28(AObserverS210S0100000_6 aObserverS210S0100000_6, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            C1362650lZ1 c1362650lZ1 = (C1362650lZ1) aObserverS210S0100000_6.l0;
            String quantityString = c1362650lZ1.getContext().getResources().getQuantityString(2131755276, c1362650lZ1.getViewModel().wQ2(), Integer.valueOf(c1362650lZ1.getViewModel().wQ2()));
            Fragment fragment = c1362650lZ1.LLJILLL;
            if (fragment != null) {
                C1389890mGx c1389890mGx = new C1389890mGx(fragment);
                c1389890mGx.LJIIJ(quantityString);
                c1389890mGx.LJIIJJI();
            }
        }
    }

    public static final void onChanged$29(AObserverS210S0100000_6 aObserverS210S0100000_6, Object obj) {
        List listLL;
        Pair pair = (Pair) obj;
        C786410Ut5.LJLLLLLL(8, ((C461840I9e) aObserverS210S0100000_6.l0).getRecyclerView());
        if (!((Boolean) pair.getSecond()).booleanValue()) {
            C2252331DDr c2252331DDr = ((C461840I9e) aObserverS210S0100000_6.l0).LLJLIL;
            Iterable iterable = (Iterable) pair.getFirst();
            if (iterable != null) {
                listLL = C13LP.LL(iterable, 3);
            } else {
                listLL = null;
            }
            c2252331DDr.LIZJ(listLL);
        }
    }

    public static final void onChanged$3(AObserverS210S0100000_6 aObserverS210S0100000_6, Object obj) {
        C19EG c19egLIZIZ;
        String str = (String) obj;
        if (str != null) {
            C0S1K c0s1k = C0S1K.LIZIZ;
            Context context = ((StoryNotePanelUserFragment) aObserverS210S0100000_6.l0).getContext();
            if (context != null) {
                c19egLIZIZ = C1388190mED.LIZIZ(context);
            } else {
                c19egLIZIZ = null;
            }
            C1389890mGx c1389890mGxLJIIIZ = c0s1k.LJIIIZ(c19egLIZIZ, str);
            if (c1389890mGxLJIIIZ != null) {
                c1389890mGxLJIIIZ.LJIIJJI();
            }
        }
    }

    public static final void onChanged$30(AObserverS210S0100000_6 aObserverS210S0100000_6, Object obj) {
        Integer numValueOf;
        View view;
        Integer num = (Integer) obj;
        View view2 = (View) aObserverS210S0100000_6.l0;
        if (view2 != null) {
            numValueOf = Integer.valueOf(view2.getHeight());
        } else {
            numValueOf = null;
        }
        if (!Intrinsics.LJFF(num, numValueOf) && (view = (View) aObserverS210S0100000_6.l0) != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = num.intValue();
                C786410Ut5.W5(view, layoutParams);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
    }

    public static final void onChanged$31(AObserverS210S0100000_6 aObserverS210S0100000_6, Object obj) {
        Integer num = (Integer) obj;
        if (num != null) {
            num.intValue();
            if (num.intValue() <= 0) {
                View view = (View) ((StoryGuideCardComponent) aObserverS210S0100000_6.l0).LLL.getValue();
                if (view != null) {
                    C426750GoL.LJIIIZ(view, null, null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(C14LC.LJIILIIL)))), false, 23);
                    return;
                }
                return;
            }
            View view2 = (View) ((StoryGuideCardComponent) aObserverS210S0100000_6.l0).LLL.getValue();
            if (view2 == null) {
                return;
            }
            C426750GoL.LJIIIZ(view2, null, null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), false, 23);
        }
    }

    public static final void onChanged$32(AObserverS210S0100000_6 aObserverS210S0100000_6, Object obj) {
        EnumC455750Hu1 enumC455750Hu1 = (EnumC455750Hu1) obj;
        if (enumC455750Hu1 != null) {
            int i = C455740Hu0.LIZ[enumC455750Hu1.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                C1390410mHn c1390410mHn = ((ProfileBgVideoListActivity) aObserverS210S0100000_6.l0).LLILZ;
                                if (c1390410mHn != null) {
                                    c1390410mHn.LIZLLL();
                                }
                                C1390410mHn c1390410mHn2 = ((ProfileBgVideoListActivity) aObserverS210S0100000_6.l0).LLILZ;
                                if (c1390410mHn2 != null) {
                                    C786410Ut5.LLLZZIL(c1390410mHn2, 8);
                                }
                                ((ProfileBgVideoListActivity) aObserverS210S0100000_6.l0).LLLLLZL().LLLFZ();
                                View view = ((ProfileBgVideoListActivity) aObserverS210S0100000_6.l0).LLILZLL;
                                if (view != null) {
                                    C786410Ut5.LJLLLLLL(8, view);
                                }
                                if (((ProfileBgVideoListActivity) aObserverS210S0100000_6.l0).LLLLLZL().getItemCount() == 0) {
                                    C1749280vcc c1749280vcc = ((ProfileBgVideoListActivity) aObserverS210S0100000_6.l0).LLILZIL;
                                    if (c1749280vcc != null) {
                                        c1749280vcc.setTopMargin(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40)));
                                    }
                                    C1749280vcc c1749280vcc2 = ((ProfileBgVideoListActivity) aObserverS210S0100000_6.l0).LLILZIL;
                                    if (c1749280vcc2 != null) {
                                        C786410Ut5.LLLZLZ(c1749280vcc2, 0);
                                    }
                                    RecyclerView recyclerView = ((ProfileBgVideoListActivity) aObserverS210S0100000_6.l0).LLILLL;
                                    if (recyclerView != null) {
                                        C786410Ut5.LLIZLLLIL(recyclerView, 8);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                        } else {
                            ((ProfileBgVideoListActivity) aObserverS210S0100000_6.l0).LLLLLZL().LLLFZ();
                            return;
                        }
                    } else {
                        C0HF2 c0hf2LLLLLZL = ((ProfileBgVideoListActivity) aObserverS210S0100000_6.l0).LLLLLZL();
                        if (c0hf2LLLLLZL.LLILZ) {
                            return;
                        }
                        c0hf2LLLLLZL.LLILZ = true;
                        c0hf2LLLLLZL.notifyItemInserted(((ArrayList) c0hf2LLLLLZL.LLILLJJLI).size());
                        return;
                    }
                } else {
                    C1390410mHn c1390410mHn3 = ((ProfileBgVideoListActivity) aObserverS210S0100000_6.l0).LLILZ;
                    if (c1390410mHn3 != null) {
                        c1390410mHn3.LIZLLL();
                    }
                    C1390410mHn c1390410mHn4 = ((ProfileBgVideoListActivity) aObserverS210S0100000_6.l0).LLILZ;
                    if (c1390410mHn4 != null) {
                        C786410Ut5.LLLZZIL(c1390410mHn4, 8);
                    }
                    C1749280vcc c1749280vcc3 = ((ProfileBgVideoListActivity) aObserverS210S0100000_6.l0).LLILZIL;
                    if (c1749280vcc3 != null) {
                        C786410Ut5.LLLZLZ(c1749280vcc3, 8);
                    }
                    ProfileBgVideoListActivity profileBgVideoListActivity = (ProfileBgVideoListActivity) aObserverS210S0100000_6.l0;
                    profileBgVideoListActivity.LLLLZIL(Intrinsics.LJFF(profileBgVideoListActivity.LLLLZI().LLILZLL.getValue(), Boolean.TRUE));
                    ((ProfileBgVideoListActivity) aObserverS210S0100000_6.l0).LLLLLZL().LLLFZ();
                    return;
                }
            } else {
                C1749280vcc c1749280vcc4 = ((ProfileBgVideoListActivity) aObserverS210S0100000_6.l0).LLILZIL;
                if (c1749280vcc4 != null) {
                    c1749280vcc4.setTopMargin(0.0f);
                }
                C1749280vcc c1749280vcc5 = ((ProfileBgVideoListActivity) aObserverS210S0100000_6.l0).LLILZIL;
                if (c1749280vcc5 != null) {
                    C786410Ut5.LLLZLZ(c1749280vcc5, 0);
                }
                C1749280vcc c1749280vcc6 = ((ProfileBgVideoListActivity) aObserverS210S0100000_6.l0).LLILZIL;
                if (c1749280vcc6 != null) {
                    c1749280vcc6.LJ();
                }
                RecyclerView recyclerView2 = ((ProfileBgVideoListActivity) aObserverS210S0100000_6.l0).LLILLL;
                if (recyclerView2 != null) {
                    C786410Ut5.LLIZLLLIL(recyclerView2, 8);
                }
                View view2 = ((ProfileBgVideoListActivity) aObserverS210S0100000_6.l0).LLILZLL;
                if (view2 == null) {
                    return;
                }
                C786410Ut5.LJLLLLLL(8, view2);
                return;
            }
        }
        throw new C1954807lC();
    }

    public static final void onChanged$33(AObserverS210S0100000_6 aObserverS210S0100000_6, Object obj) {
        Boolean bool = (Boolean) obj;
        if (((ProfileBgVideoListActivity) aObserverS210S0100000_6.l0).LLLLZI().LLILZ.getValue() == EnumC455750Hu1.ERROR) {
            int i = C2187451AjH.LIZ;
            C1720106oR.LIZ("ProfileBgVideoListActivity", "loadState is ERROR, cannot updateEmptyState");
        } else {
            ((ProfileBgVideoListActivity) aObserverS210S0100000_6.l0).LLLLZIL(bool.booleanValue());
        }
    }

    public static final void onChanged$34(AObserverS210S0100000_6 aObserverS210S0100000_6, Object obj) {
        if (obj != null) {
            MusProfileEditFragment musProfileEditFragment = (MusProfileEditFragment) aObserverS210S0100000_6.l0;
            DialogC1389620mGW dialogC1389620mGW = musProfileEditFragment.l;
            if (dialogC1389620mGW != null) {
                dialogC1389620mGW.dismiss();
                C785410UrT.LIZ(dialogC1389620mGW);
            }
            AObserverS210S0100000_6 aObserverS210S0100000_62 = musProfileEditFragment.m;
            int i = C2187451AjH.LIZ;
            C442910HYj.LIZ.removeObserver(aObserverS210S0100000_62);
            ((MusProfileEditFragment) aObserverS210S0100000_6.l0).KT();
        }
    }

    public static final void onChanged$35(AObserverS210S0100000_6 aObserverS210S0100000_6, Object obj) {
        SearchContainerFragment searchContainerFragment = (SearchContainerFragment) aObserverS210S0100000_6.l0;
        searchContainerFragment.getClass();
        if (((Boolean) obj).booleanValue()) {
            searchContainerFragment.LLLIZZ.LIZ();
        }
    }

    public static final void onChanged$36(AObserverS210S0100000_6 aObserverS210S0100000_6, Object obj) {
        SearchContainerFragment searchContainerFragment = (SearchContainerFragment) aObserverS210S0100000_6.l0;
        searchContainerFragment.getClass();
        if (((Integer) obj).intValue() == 2) {
            C428080GqU c428080GqU = searchContainerFragment.LLLIZZ;
            if (c428080GqU.LLILZLL) {
                c428080GqU.LLILZLL = false;
                if (C298840BnW.LIZ() == 2) {
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c428080GqU);
                    c428080GqU.setAlpha(1.0f);
                } else if (C298840BnW.LIZ() == 3) {
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c428080GqU);
                    c428080GqU.setTranslationX(0.0f);
                }
            }
            C428080GqU c428080GqU2 = searchContainerFragment.LLLIZZ;
            View view = c428080GqU2.LL;
            if (view != null) {
                HandlerHook.viewPost(view, new ARunnableS106S0100000_6((Object) c428080GqU2, 223));
            }
            View view2 = c428080GqU2.LL;
            if (view2 != null) {
                HandlerHook.viewPostDelay(view2, new ARunnableS106S0100000_6((Object) c428080GqU2, 224), ((Number) C0AXU.LIZ.getValue()).intValue());
            }
        }
    }

    public static final void onChanged$37(AObserverS210S0100000_6 aObserverS210S0100000_6, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            ((C1295960jpS) aObserverS210S0100000_6.l0).setSpeed(1.0f);
            ((C1295960jpS) aObserverS210S0100000_6.l0).setProgress(0.0f);
        } else {
            ((C1295960jpS) aObserverS210S0100000_6.l0).setSpeed(-1.0f);
            ((C1295960jpS) aObserverS210S0100000_6.l0).setProgress(1.0f);
        }
        ((C1295960jpS) aObserverS210S0100000_6.l0).playAnimation();
    }

    public static final void onChanged$38(AObserverS210S0100000_6 aObserverS210S0100000_6, Object obj) {
        final List list = (List) obj;
        C0HF2 c0hf2LLLLLZL = ((ProfileBgVideoListActivity) aObserverS210S0100000_6.l0).LLLLLZL();
        c0hf2LLLLLZL.getClass();
        final List<Aweme> list2 = c0hf2LLLLLZL.LLILLJJLI;
        C21341918fZ c21341918fZLIZ = C21342318fd.LIZ(new AbstractC21342018fa(list2, list) { // from class: X.0Hem
            public final List<Aweme> LIZ;
            public final List<Aweme> LIZIZ;

            @Override // X.AbstractC21342018fa
            public final int LIZLLL() {
                return this.LIZIZ.size();
            }

            @Override // X.AbstractC21342018fa
            public final int LJ() {
                return this.LIZ.size();
            }

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.LIZ = list2;
                this.LIZIZ = list;
            }

            @Override // X.AbstractC21342018fa
            public final boolean LIZ(int i, int i2) {
                return Intrinsics.LJFF(((Aweme) ListProtector.get(this.LIZ, i)).getAid(), ((Aweme) ListProtector.get(this.LIZIZ, i2)).getAid());
            }

            @Override // X.AbstractC21342018fa
            public final boolean LIZIZ(int i, int i2) {
                return Intrinsics.LJFF(((Aweme) ListProtector.get(this.LIZ, i)).getAid(), ((Aweme) ListProtector.get(this.LIZIZ, i2)).getAid());
            }
        }, true);
        ((ArrayList) c0hf2LLLLLZL.LLILLJJLI).clear();
        ((ArrayList) c0hf2LLLLLZL.LLILLJJLI).addAll(list);
        c21341918fZLIZ.LIZJ(c0hf2LLLLLZL);
        ((ProfileBgVideoListActivity) aObserverS210S0100000_6.l0).LLLLZIL(list.isEmpty());
    }

    public static final void onChanged$39(AObserverS210S0100000_6 aObserverS210S0100000_6, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            C455230HtB c455230HtB = (C455230HtB) aObserverS210S0100000_6.l0;
            if (!c455230HtB.LLJ) {
                C786410Ut5.Pd(C455290HtH.LIZ(c455230HtB));
            }
        }
    }

    public static final void onChanged$4(AObserverS210S0100000_6 aObserverS210S0100000_6, Object obj) {
        StoryNotePanelUserFragment storyNotePanelUserFragment;
        TuxTextView tuxTextView;
        String string;
        Pair pair = (Pair) obj;
        User user = (User) pair.getFirst();
        Long l = (Long) pair.getSecond();
        if (user != null && l != null && (tuxTextView = (storyNotePanelUserFragment = (StoryNotePanelUserFragment) aObserverS210S0100000_6.l0).LLJI) != null) {
            long jLongValue = l.longValue();
            String strLIZ = C0HCK.LIZ(user);
            String strLJI = C1356610lPH.LJI(jLongValue * 1000, storyNotePanelUserFragment.getContext());
            Context context = storyNotePanelUserFragment.getContext();
            if (context != null) {
                string = context.getString(2131849046, strLIZ);
            } else {
                string = null;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(string);
            sbLIZ.append(" · ");
            sbLIZ.append(strLJI);
            tuxTextView.setText(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static final void onChanged$40(AObserverS210S0100000_6 aObserverS210S0100000_6, Object obj) {
        int i;
        C424470Gkf c424470Gkf = (C424470Gkf) aObserverS210S0100000_6.l0;
        if (Intrinsics.LJFF(obj, Boolean.TRUE)) {
            i = 0;
        } else {
            i = 8;
        }
        int visibility = c424470Gkf.getVisibility();
        c424470Gkf.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c424470Gkf);
    }

    public static final void onChanged$41(AObserverS210S0100000_6 aObserverS210S0100000_6, Object obj) {
        ((C424470Gkf) aObserverS210S0100000_6.l0).getConfirmUsageCheckBoxFromXml().setChecked(Intrinsics.LJFF(obj, Boolean.TRUE));
    }

    public static final void onChanged$42(AObserverS210S0100000_6 aObserverS210S0100000_6, Object obj) {
        ShareInviteContentFragment shareInviteContentFragment = (ShareInviteContentFragment) aObserverS210S0100000_6.l0;
        shareInviteContentFragment.getClass();
        ARunnableS106S0100000_6 aRunnableS106S0100000_6 = new ARunnableS106S0100000_6(shareInviteContentFragment, 220);
        C1369580lkC c1369580lkC = shareInviteContentFragment.LLIZ;
        if (c1369580lkC == null) {
            c1369580lkC = null;
        }
        c1369580lkC.animate().translationX(C418440Gaw.LIZIZ(-10)).setDuration(200L).withEndAction(aRunnableS106S0100000_6).start();
    }

    public static final void onChanged$43(AObserverS210S0100000_6 aObserverS210S0100000_6, Object obj) {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = null;
        if (((Boolean) obj).booleanValue()) {
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = ((C437880HFa) aObserverS210S0100000_6.l0).LJFF;
            if (viewOnAttachStateChangeListenerC20604515jv2 != null) {
                viewOnAttachStateChangeListenerC20604515jv = viewOnAttachStateChangeListenerC20604515jv2;
            }
            C786410Ut5.LLF(0, viewOnAttachStateChangeListenerC20604515jv);
            return;
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv3 = ((C437880HFa) aObserverS210S0100000_6.l0).LJFF;
        if (viewOnAttachStateChangeListenerC20604515jv3 != null) {
            viewOnAttachStateChangeListenerC20604515jv = viewOnAttachStateChangeListenerC20604515jv3;
        }
        C786410Ut5.LLF(8, viewOnAttachStateChangeListenerC20604515jv);
    }

    public static final void onChanged$44(AObserverS210S0100000_6 aObserverS210S0100000_6, Object obj) {
        if (obj != null) {
            ((Function1) aObserverS210S0100000_6.l0).invoke(obj);
        }
    }

    public static final void onChanged$45(AObserverS210S0100000_6 aObserverS210S0100000_6, Object obj) {
        C0HYG c0hyg = (C0HYG) obj;
        C0VWN.LIZ("lemon8_photomode_exit", false).start();
        C442400HWk c442400HWk = (C442400HWk) aObserverS210S0100000_6.l0;
        PostModeFullPageViewModel postModeFullPageViewModel = c442400HWk.LL.LJIIIIZZ;
        if (postModeFullPageViewModel != null) {
            C736680Sv4.LJIJJLI(postModeFullPageViewModel, new AwS372S0200000_6(c442400HWk, c0hyg, 96));
        }
    }

    public static final void onChanged$46(AObserverS210S0100000_6 aObserverS210S0100000_6, Object obj) {
        float fLIZIZ;
        View viewFindViewById;
        LinearLayout linearLayout;
        FrameLayout frameLayout;
        View viewFindViewById2;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        Integer num;
        View viewFindViewById3;
        Integer numLIZJ;
        C442400HWk c442400HWk = (C442400HWk) aObserverS210S0100000_6.l0;
        C19EG c19eg = c442400HWk.LL.LIZIZ;
        try {
            fLIZIZ = c19eg.getResources().getDimension(R.dimen.a3s);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            fLIZIZ = C418440Gaw.LIZIZ(44);
        }
        c442400HWk.LL.LJII.LLIZ.setValue(Boolean.TRUE);
        ViewGroup viewGroup = c442400HWk.LL.LJFF;
        if (viewGroup != null) {
            viewFindViewById = viewGroup.findViewById(R.id.s0w);
        } else {
            viewFindViewById = null;
        }
        if (viewFindViewById != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.bx, c19eg)) != null) {
            viewFindViewById.setBackgroundColor(numLIZJ.intValue());
        }
        if (!C960203pA.LIZIZ(c19eg) && (num = (Integer) c442400HWk.LLILLL.getValue()) != null) {
            int iIntValue = num.intValue();
            ViewGroup viewGroup2 = c442400HWk.LL.LJ;
            if (viewGroup2 != null && (viewFindViewById3 = viewGroup2.findViewById(R.id.qex)) != null) {
                viewFindViewById3.setBackgroundColor(iIntValue);
            }
        }
        LinearLayout linearLayout2 = (LinearLayout) c442400HWk.LLILZ.getValue();
        if (linearLayout2 != null) {
            C786410Ut5.W4(linearLayout2, 1.0f);
        }
        ViewGroup viewGroup3 = c442400HWk.LL.LJFF;
        if (viewGroup3 != null && (viewFindViewById2 = viewGroup3.findViewById(R.id.sea)) != null) {
            ViewGroup.LayoutParams layoutParams = viewFindViewById2.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                if (marginLayoutParams != null) {
                    marginLayoutParams.height = (int) fLIZIZ;
                }
            } else {
                marginLayoutParams = null;
            }
            C786410Ut5.W5(viewFindViewById2, marginLayoutParams);
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.bx, c19eg);
            if (numLIZJ2 != null) {
                viewFindViewById2.setBackgroundColor(numLIZJ2.intValue());
            }
        }
        ViewGroup viewGroup4 = c442400HWk.LL.LIZLLL;
        if (viewGroup4 != null && (frameLayout = (FrameLayout) viewGroup4.findViewById(R.id.e_t)) != null) {
            C786410Ut5.U4(frameLayout, 1.0f);
        }
        ViewGroup viewGroup5 = c442400HWk.LL.LIZLLL;
        if (viewGroup5 != null && (linearLayout = (LinearLayout) viewGroup5.findViewById(R.id.ccd)) != null) {
            C786410Ut5.W4(linearLayout, 1.0f);
        }
        C786410Ut5.LJLIIL(100L, new BPEAHandler(Looper.getMainLooper()), new ARunnableS106S0100000_6(c442400HWk, 285));
        c442400HWk.LL.LJII.LLIZ.setValue(Boolean.FALSE);
    }

    public static final void onChanged$47(AObserverS210S0100000_6 aObserverS210S0100000_6, Object obj) {
        ((View) aObserverS210S0100000_6.l0).setEnabled(((Boolean) obj).booleanValue());
    }

    public static final void onChanged$48(AObserverS210S0100000_6 aObserverS210S0100000_6, Object obj) {
        ((View) aObserverS210S0100000_6.l0).setClickable(((Boolean) obj).booleanValue());
    }

    public static final void onChanged$49(AObserverS210S0100000_6 aObserverS210S0100000_6, Object obj) {
        ((View) aObserverS210S0100000_6.l0).setBackground((Drawable) obj);
    }

    public static final void onChanged$5(AObserverS210S0100000_6 aObserverS210S0100000_6, Object obj) {
        C0I7D c0i7d = ((StoryNotePanelUserFragment) aObserverS210S0100000_6.l0).LLJILJIL;
        if (c0i7d != null) {
            c0i7d.requestFocus();
        }
    }

    public static final void onChanged$50(AObserverS210S0100000_6 aObserverS210S0100000_6, Object obj) {
        ((View) aObserverS210S0100000_6.l0).setBackground((Drawable) obj);
    }

    public static final void onChanged$51(AObserverS210S0100000_6 aObserverS210S0100000_6, Object obj) {
        ReuseAudioDetailFragment reuseAudioDetailFragment = (ReuseAudioDetailFragment) aObserverS210S0100000_6.l0;
        reuseAudioDetailFragment.getClass();
        C1524805y2.LIZIZ(0L, new AwS407S0200000_6((Aweme) obj, reuseAudioDetailFragment, 111));
    }

    public static final void onChanged$52(AObserverS210S0100000_6 aObserverS210S0100000_6, Object obj) {
        C1389890mGx c1389890mGx = new C1389890mGx((ReuseAudioDetailFragment) aObserverS210S0100000_6.l0);
        c1389890mGx.LJIIIZ(2131857904);
        c1389890mGx.LJIIJJI();
    }

    public static final void onChanged$53(AObserverS210S0100000_6 aObserverS210S0100000_6, Object obj) {
        if (C435330H5f.LIZ()) {
            StoryThoughtAvatarCreationFragment storyThoughtAvatarCreationFragment = (StoryThoughtAvatarCreationFragment) aObserverS210S0100000_6.l0;
            if (storyThoughtAvatarCreationFragment.LLJILJILJ == null) {
                C439850HMp c439850HMp = new C439850HMp();
                c439850HMp.LIZ.LLJ = true;
                c439850HMp.LIZ.LL = Integer.valueOf(R.style.xm);
                StoryThoughtAvatarSheetFragment storyThoughtAvatarSheetFragment = new StoryThoughtAvatarSheetFragment();
                TuxPanel tuxPanel = c439850HMp.LIZ;
                tuxPanel.LLILLJJLI = storyThoughtAvatarSheetFragment;
                tuxPanel.LLILZIL = new C0IDZ((StoryThoughtAvatarCreationFragment) aObserverS210S0100000_6.l0, 3);
                Integer numValueOf = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(600)));
                TuxPanel tuxPanel2 = c439850HMp.LIZ;
                tuxPanel2.LLIZ = numValueOf;
                storyThoughtAvatarCreationFragment.LLJILJILJ = tuxPanel2;
            }
            StoryThoughtAvatarCreationFragment storyThoughtAvatarCreationFragment2 = (StoryThoughtAvatarCreationFragment) aObserverS210S0100000_6.l0;
            TuxPanel tuxPanel3 = storyThoughtAvatarCreationFragment2.LLJILJILJ;
            if (tuxPanel3 != null) {
                tuxPanel3.show(storyThoughtAvatarCreationFragment2.getParentFragmentManager(), "ThoughtAvatarCreateFrag");
                return;
            }
            return;
        }
        StoryThoughtAvatarCreationFragment storyThoughtAvatarCreationFragment3 = (StoryThoughtAvatarCreationFragment) aObserverS210S0100000_6.l0;
        if (storyThoughtAvatarCreationFragment3.LLJILJIL == null) {
            C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
            c1390920mIc.LIZ.LLJJIJI = new StoryThoughtAvatarSheetFragment();
            c1390920mIc.LJIIIIZZ(1);
            TuxSheet tuxSheet = c1390920mIc.LIZ;
            tuxSheet.LLJJIJIIJIL = true;
            tuxSheet.LLILLJJLI = new C0IDZ((StoryThoughtAvatarCreationFragment) aObserverS210S0100000_6.l0, 4);
            TuxSheet tuxSheet2 = c1390920mIc.LIZ;
            tuxSheet2.LLJI = -1;
            storyThoughtAvatarCreationFragment3.LLJILJIL = tuxSheet2;
        }
        StoryThoughtAvatarCreationFragment storyThoughtAvatarCreationFragment4 = (StoryThoughtAvatarCreationFragment) aObserverS210S0100000_6.l0;
        TuxSheet tuxSheet3 = storyThoughtAvatarCreationFragment4.LLJILJIL;
        if (tuxSheet3 == null) {
            return;
        }
        tuxSheet3.show(storyThoughtAvatarCreationFragment4.getParentFragmentManager(), "ThoughtAvatarCreateFrag");
    }

    public static final void onChanged$54(AObserverS210S0100000_6 aObserverS210S0100000_6, Object obj) {
        TuxSheet tuxSheet = ((StoryThoughtAvatarCreationFragment) aObserverS210S0100000_6.l0).LLJILJIL;
        if (tuxSheet != null) {
            tuxSheet.dismiss();
        }
    }

    public static final void onChanged$55(AObserverS210S0100000_6 aObserverS210S0100000_6, Object obj) {
        List list = (List) obj;
        if (list != null) {
            SystemShareFragment systemShareFragment = (SystemShareFragment) aObserverS210S0100000_6.l0;
            HashSet hashSet = new HashSet();
            ArrayList arrayList = new ArrayList();
            Iterator it2 = list.iterator();
            while (true) {
                String conversationId = null;
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                IMContact iMContact = (IMContact) next;
                if (iMContact instanceof IMUser) {
                    conversationId = iMContact.getUid();
                } else if (iMContact instanceof IMConversation) {
                    conversationId = ((IMConversation) iMContact).getConversationId();
                }
                if (hashSet.add(conversationId)) {
                    arrayList.add(next);
                }
            }
            systemShareFragment.WR(null, arrayList);
            if (systemShareFragment.LLJIJIL.isEmpty()) {
                systemShareFragment.LLJIJIL = arrayList;
            }
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static final void onChanged$56(AObserverS210S0100000_6 aObserverS210S0100000_6, Object obj) {
        Object objLJJJLL;
        C03AD c03ad;
        C09OD c09od = (C09OD) obj;
        Object obj2 = ((SystemShareFragment) aObserverS210S0100000_6.l0).LLJILJILJ;
        if (obj2 == null) {
            obj2 = null;
        }
        if ((obj2 instanceof C03AD) && (c03ad = (C03AD) obj2) != null) {
            boolean z = true;
            if (c09od.LIZ.size() <= 1) {
                z = false;
            }
            C420980Gf2 c420980Gf2 = c03ad.LL;
            if (c420980Gf2 != null) {
                c420980Gf2.I5(z);
            }
        }
        SystemShareFragment systemShareFragment = (SystemShareFragment) aObserverS210S0100000_6.l0;
        systemShareFragment.getClass();
        if (!c09od.LIZ.isEmpty() && (objLJJJLL = C13LP.LJJJLL(c09od.LIZ)) != null) {
            systemShareFragment.LLJJ.postValue((Bitmap) objLJJJLL);
        }
    }

    public static final void onChanged$57(AObserverS210S0100000_6 aObserverS210S0100000_6, Object obj) {
        C20746816Gk c20746816Gk;
        if (((Boolean) obj).booleanValue() && (c20746816Gk = (C20746816Gk) aObserverS210S0100000_6.l0) != null) {
            HandlerHook.viewPostDelay(c20746816Gk, new ARunnableS106S0100000_6((Object) c20746816Gk, 335), 200L);
        }
    }

    public static final void onChanged$6(AObserverS210S0100000_6 aObserverS210S0100000_6, Object obj) {
        int i;
        Boolean bool = (Boolean) obj;
        View view = ((StoryNotePanelUserFragment) aObserverS210S0100000_6.l0).LLJIJIL;
        if (view != null) {
            if (bool.booleanValue()) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, view);
        }
        if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
            StoryNotePanelUserVM storyNotePanelUserVMUR = ((StoryNotePanelUserFragment) aObserverS210S0100000_6.l0).UR();
            storyNotePanelUserVMUR.getClass();
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(storyNotePanelUserVMUR), null, null, new C0HCP(storyNotePanelUserVMUR, null), 3);
        }
    }

    public static final void onChanged$7(AObserverS210S0100000_6 aObserverS210S0100000_6, Object obj) {
        User user = (User) obj;
        StoryNotePanelUserFragment storyNotePanelUserFragment = (StoryNotePanelUserFragment) aObserverS210S0100000_6.l0;
        AvatarComponentView avatarComponentView = storyNotePanelUserFragment.LLJ;
        if (avatarComponentView != null) {
            new AwS603S0100000_24(storyNotePanelUserFragment, 0).invoke(avatarComponentView.getConfig().LIZ);
            avatarComponentView.LJFF(avatarComponentView.getConfig());
        }
        AvatarComponentView avatarComponentView2 = storyNotePanelUserFragment.LLJ;
        if (avatarComponentView2 != null) {
            C1256560inu.LIZ(C1256560inu.LIZ, avatarComponentView2, storyNotePanelUserFragment.LLIZLLLIL, storyNotePanelUserFragment.getViewLifecycleOwner(), false, null, storyNotePanelUserFragment.UR().LL, false, user, EnumC1256590inx.PANEL, null, null, null, 14824);
        }
    }

    public static final void onChanged$8(AObserverS210S0100000_6 aObserverS210S0100000_6, Object obj) {
        Boolean bool = (Boolean) obj;
        C437160HCg c437160HCg = ((StoryNotePanelUserFragment) aObserverS210S0100000_6.l0).LLJJ;
        if (c437160HCg != null) {
            c437160HCg.setSelected(bool.booleanValue());
        }
    }

    public static final void onChanged$9(AObserverS210S0100000_6 aObserverS210S0100000_6, Object obj) {
        TuxIconView tuxIconView;
        StoryNotePanelUserFragment storyNotePanelUserFragment = (StoryNotePanelUserFragment) aObserverS210S0100000_6.l0;
        if (((Boolean) obj).booleanValue()) {
            TuxIconView tuxIconView2 = storyNotePanelUserFragment.LLJILJILJ;
            if (tuxIconView2 != null && tuxIconView2.getVisibility() == 4 && (tuxIconView = storyNotePanelUserFragment.LLJILJILJ) != null) {
                ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(tuxIconView, PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, 0.0f, 1.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, 0.0f, 1.0f));
                objectAnimatorOfPropertyValuesHolder.setDuration(200L);
                objectAnimatorOfPropertyValuesHolder.setInterpolator(C1619980sG4.LIZLLL());
                objectAnimatorOfPropertyValuesHolder.addListener(new ALAdapterS3S0100000_6(tuxIconView, 1));
                if (!objectAnimatorOfPropertyValuesHolder.isRunning()) {
                    C786410Ut5.Pd(objectAnimatorOfPropertyValuesHolder);
                    return;
                }
                return;
            }
            return;
        }
        TuxIconView tuxIconView3 = storyNotePanelUserFragment.LLJILJILJ;
        if (tuxIconView3 == null) {
            return;
        }
        C786410Ut5.LLLLLLZZ(tuxIconView3, 4);
    }
}
