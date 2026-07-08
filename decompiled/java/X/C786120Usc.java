package X;

import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.broadcast.api.blockword.model.BlockWord;
import com.bytedance.android.live.design.widget.LiveEditText;
import com.bytedance.android.live.effect.input.EffectTextInputFragment;
import com.bytedance.android.live.effect.karaoke.view.library.KaraokePageFragment;
import com.bytedance.android.livesdk.broadcast.PreviewLiveModeTitleChannel;
import com.bytedance.android.livesdk.broadcast.PreviewTitleChannel;
import com.bytedance.android.livesdk.broadcast.interaction.toolbar.LiveTitleEditDialogFragment;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewLiveDetailWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewTitleWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.PreviewLiveDetailSheet;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.PreviewTitleCoverFragment;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.PreviewTitleCoverFragmentSheet;
import com.bytedance.android.livesdk.giftlimitnotification.LiveGiftReminderAmountKeyboardFragment;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.markviewer.AddMarkedViewerFragmentSheet;
import com.bytedance.android.livesdk.moderator.AddModeratorFragment;
import com.bytedance.android.livesdk.moderator.AddModeratorFragmentSheet;
import com.bytedance.android.livesdk.moderator.AddModeratorFragmentSheetNew;
import com.bytedance.android.livesdk.moderator.ModeratorListChannel;
import com.bytedance.android.livesdk.settings.customtab.KevaDebugFragment;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.account.login.email.EmailPopUpFragment;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.quickpost.LiveQuickPostFragment;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0Usc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C786120Usc implements TextWatcher {
    public final int $t;
    public Object l0;

    public static final void afterTextChanged$1(C786120Usc c786120Usc, Editable editable) {
    }

    public static final void afterTextChanged$21(C786120Usc c786120Usc, Editable editable) {
    }

    public static final void beforeTextChanged$0(C786120Usc c786120Usc, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$1(C786120Usc c786120Usc, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$11(C786120Usc c786120Usc, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$12(C786120Usc c786120Usc, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$13(C786120Usc c786120Usc, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$14(C786120Usc c786120Usc, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$15(C786120Usc c786120Usc, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$16(C786120Usc c786120Usc, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$17(C786120Usc c786120Usc, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$18(C786120Usc c786120Usc, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$19(C786120Usc c786120Usc, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$2(C786120Usc c786120Usc, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$20(C786120Usc c786120Usc, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$21(C786120Usc c786120Usc, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$22(C786120Usc c786120Usc, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$3(C786120Usc c786120Usc, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$4(C786120Usc c786120Usc, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$5(C786120Usc c786120Usc, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$6(C786120Usc c786120Usc, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$7(C786120Usc c786120Usc, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$8(C786120Usc c786120Usc, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$9(C786120Usc c786120Usc, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$0(C786120Usc c786120Usc, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$11(C786120Usc c786120Usc, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$13(C786120Usc c786120Usc, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$14(C786120Usc c786120Usc, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$15(C786120Usc c786120Usc, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$17(C786120Usc c786120Usc, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$18(C786120Usc c786120Usc, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$19(C786120Usc c786120Usc, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$2(C786120Usc c786120Usc, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$20(C786120Usc c786120Usc, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$22(C786120Usc c786120Usc, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$3(C786120Usc c786120Usc, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$4(C786120Usc c786120Usc, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$5(C786120Usc c786120Usc, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$6(C786120Usc c786120Usc, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$7(C786120Usc c786120Usc, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$8(C786120Usc c786120Usc, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$9(C786120Usc c786120Usc, CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) throws Throwable {
        switch (this.$t) {
            case 0:
                afterTextChanged$0(this, editable);
                break;
            case 1:
                afterTextChanged$1(this, editable);
                break;
            case 2:
                afterTextChanged$2(this, editable);
                break;
            case 3:
                afterTextChanged$3(this, editable);
                break;
            case 4:
                afterTextChanged$4(this, editable);
                break;
            case 5:
                afterTextChanged$5(this, editable);
                break;
            case 6:
                afterTextChanged$6(this, editable);
                break;
            case 7:
                afterTextChanged$7(this, editable);
                break;
            case 8:
                afterTextChanged$8(this, editable);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                afterTextChanged$9(this, editable);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                afterTextChanged$10(this, editable);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                afterTextChanged$11(this, editable);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                afterTextChanged$12(this, editable);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                afterTextChanged$13(this, editable);
                break;
            case 14:
                afterTextChanged$14(this, editable);
                break;
            case 15:
                afterTextChanged$15(this, editable);
                break;
            case 16:
                afterTextChanged$16(this, editable);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                afterTextChanged$17(this, editable);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                afterTextChanged$18(this, editable);
                break;
            case 19:
                afterTextChanged$19(this, editable);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                afterTextChanged$20(this, editable);
                break;
            case 21:
                afterTextChanged$21(this, editable);
                break;
            case 22:
                afterTextChanged$22(this, editable);
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.$t) {
            case 0:
                beforeTextChanged$0(this, charSequence, i, i2, i3);
                break;
            case 1:
                beforeTextChanged$1(this, charSequence, i, i2, i3);
                break;
            case 2:
                beforeTextChanged$2(this, charSequence, i, i2, i3);
                break;
            case 3:
                beforeTextChanged$3(this, charSequence, i, i2, i3);
                break;
            case 4:
                beforeTextChanged$4(this, charSequence, i, i2, i3);
                break;
            case 5:
                beforeTextChanged$5(this, charSequence, i, i2, i3);
                break;
            case 6:
                beforeTextChanged$6(this, charSequence, i, i2, i3);
                break;
            case 7:
                beforeTextChanged$7(this, charSequence, i, i2, i3);
                break;
            case 8:
                beforeTextChanged$8(this, charSequence, i, i2, i3);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                beforeTextChanged$9(this, charSequence, i, i2, i3);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                beforeTextChanged$10(this, charSequence, i, i2, i3);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                beforeTextChanged$11(this, charSequence, i, i2, i3);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                beforeTextChanged$12(this, charSequence, i, i2, i3);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                beforeTextChanged$13(this, charSequence, i, i2, i3);
                break;
            case 14:
                beforeTextChanged$14(this, charSequence, i, i2, i3);
                break;
            case 15:
                beforeTextChanged$15(this, charSequence, i, i2, i3);
                break;
            case 16:
                beforeTextChanged$16(this, charSequence, i, i2, i3);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                beforeTextChanged$17(this, charSequence, i, i2, i3);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                beforeTextChanged$18(this, charSequence, i, i2, i3);
                break;
            case 19:
                beforeTextChanged$19(this, charSequence, i, i2, i3);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                beforeTextChanged$20(this, charSequence, i, i2, i3);
                break;
            case 21:
                beforeTextChanged$21(this, charSequence, i, i2, i3);
                break;
            case 22:
                beforeTextChanged$22(this, charSequence, i, i2, i3);
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.$t) {
            case 0:
                onTextChanged$0(this, charSequence, i, i2, i3);
                break;
            case 1:
                onTextChanged$1(this, charSequence, i, i2, i3);
                break;
            case 2:
                onTextChanged$2(this, charSequence, i, i2, i3);
                break;
            case 3:
                onTextChanged$3(this, charSequence, i, i2, i3);
                break;
            case 4:
                onTextChanged$4(this, charSequence, i, i2, i3);
                break;
            case 5:
                onTextChanged$5(this, charSequence, i, i2, i3);
                break;
            case 6:
                onTextChanged$6(this, charSequence, i, i2, i3);
                break;
            case 7:
                onTextChanged$7(this, charSequence, i, i2, i3);
                break;
            case 8:
                onTextChanged$8(this, charSequence, i, i2, i3);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onTextChanged$9(this, charSequence, i, i2, i3);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onTextChanged$10(this, charSequence, i, i2, i3);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onTextChanged$11(this, charSequence, i, i2, i3);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onTextChanged$12(this, charSequence, i, i2, i3);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                onTextChanged$13(this, charSequence, i, i2, i3);
                break;
            case 14:
                onTextChanged$14(this, charSequence, i, i2, i3);
                break;
            case 15:
                onTextChanged$15(this, charSequence, i, i2, i3);
                break;
            case 16:
                onTextChanged$16(this, charSequence, i, i2, i3);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                onTextChanged$17(this, charSequence, i, i2, i3);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                onTextChanged$18(this, charSequence, i, i2, i3);
                break;
            case 19:
                onTextChanged$19(this, charSequence, i, i2, i3);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                onTextChanged$20(this, charSequence, i, i2, i3);
                break;
            case 21:
                onTextChanged$21(this, charSequence, i, i2, i3);
                break;
            case 22:
                onTextChanged$22(this, charSequence, i, i2, i3);
                break;
        }
    }

    public C786120Usc(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void afterTextChanged$0(C786120Usc c786120Usc, Editable editable) throws Throwable {
        if (((AddMarkedViewerFragmentSheet) c786120Usc.l0).getView() == null) {
            return;
        }
        ((AddMarkedViewerFragmentSheet) c786120Usc.l0).wS();
        EditText editText = (EditText) ((AddMarkedViewerFragmentSheet) c786120Usc.l0).LLJLLL.getValue();
        Editable editableLLJILLL = null;
        if (editText != null) {
            editableLLJILLL = C2204961BRm.LLJILLL(editText, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl5ith3F5psQjtNhRnQxoOQddzuK5wgiax6klEamkyiMH1POOO2LIW", null));
        }
        if (C500260Jjc.LJJIIZ(editableLLJILLL)) {
            C500260Jjc.LLFFF((View) ((AddMarkedViewerFragmentSheet) c786120Usc.l0).LLJZ.getValue());
        } else {
            C500260Jjc.LJIILIIL((View) ((AddMarkedViewerFragmentSheet) c786120Usc.l0).LLJZ.getValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.ArrayList] */
    public static final void afterTextChanged$10(C786120Usc c786120Usc, Editable editable) {
        boolean z;
        ?? arrayList;
        List list;
        Object objValueOf;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onTextChanged: ");
        sbLIZ.append((Object) editable);
        sbLIZ.append(", ");
        sbLIZ.append(((AddModeratorFragmentSheetNew) c786120Usc.l0).getView());
        C20441214yg.LIZIZ("Admin#input", C2188811AlT.LIZIZ(sbLIZ));
        if (((AddModeratorFragmentSheetNew) c786120Usc.l0).getView() == null) {
            return;
        }
        AddModeratorFragmentSheetNew addModeratorFragmentSheetNew = (AddModeratorFragmentSheetNew) c786120Usc.l0;
        if (addModeratorFragmentSheetNew.LLLIIIL) {
            addModeratorFragmentSheetNew.LLLIIIL = false;
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_moderator_manage_search");
            c474500IjALIZ.LJIJJLI(C475510Ikn.LJ((AddModeratorFragmentSheetNew) c786120Usc.l0));
            c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "anchor_id");
            if (C500260Jjc.LJJLIIIJ(C475510Ikn.LJ((AddModeratorFragmentSheetNew) c786120Usc.l0)) > 0) {
                objValueOf = Long.valueOf(C500260Jjc.LJJLIIIJ(C475510Ikn.LJ((AddModeratorFragmentSheetNew) c786120Usc.l0)));
            } else {
                objValueOf = "";
            }
            c474500IjALIZ.LJJII(objValueOf, "room_id");
            c474500IjALIZ.LJJII("typing", "action_type");
            c474500IjALIZ.LIZ();
        }
        if (editable != null && editable.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            AddModeratorFragmentSheetNew addModeratorFragmentSheetNew2 = (AddModeratorFragmentSheetNew) c786120Usc.l0;
            addModeratorFragmentSheetNew2.LLLIIL = false;
            DataChannel dataChannelLJ = C475510Ikn.LJ(addModeratorFragmentSheetNew2);
            if (dataChannelLJ != null && (list = (List) dataChannelLJ.gg0(ModeratorListChannel.class)) != null) {
                arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(Long.valueOf(((C750740Tce) it2.next()).LIZ));
                }
            } else {
                arrayList = C13BV.INSTANCE;
            }
            for (C750740Tce c750740Tce : (ArrayList) addModeratorFragmentSheetNew2.LLLIIIIL) {
                c750740Tce.LJII = arrayList.contains(Long.valueOf(c750740Tce.LIZ));
            }
            AddModeratorFragmentSheetNew addModeratorFragmentSheetNew3 = (AddModeratorFragmentSheetNew) c786120Usc.l0;
            C749610Tap c749610Tap = addModeratorFragmentSheetNew3.LLLFZ;
            if (c749610Tap != null) {
                c749610Tap.LLLFZ(addModeratorFragmentSheetNew3.LLLIIIIL, null, true);
            }
        } else {
            AddModeratorFragmentSheetNew addModeratorFragmentSheetNew4 = (AddModeratorFragmentSheetNew) c786120Usc.l0;
            addModeratorFragmentSheetNew4.LLLIIL = true;
            addModeratorFragmentSheetNew4.GS();
        }
        if (C500260Jjc.LJJIIZ(C2204961BRm.LLLFZ(((AddModeratorFragmentSheetNew) c786120Usc.l0).zS(), new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl5iURFHzSXse3dUU2daRzRYNtXZvQfwBY6qRPf/KxjZKKwgXKxWs=", null)))) {
            C500260Jjc.LLFFF(((AddModeratorFragmentSheetNew) c786120Usc.l0).BS());
        } else {
            C500260Jjc.LJIILIIL(((AddModeratorFragmentSheetNew) c786120Usc.l0).BS());
        }
    }

    public static final void afterTextChanged$11(C786120Usc c786120Usc, Editable editable) {
        KevaDebugFragment kevaDebugFragment = (KevaDebugFragment) c786120Usc.l0;
        kevaDebugFragment.getClass();
        if (editable != null) {
            String string = a0.LJLIIIL(String.valueOf(editable)).toString();
            List<C745370TLr> list = kevaDebugFragment.LLIZLLLIL;
            ArrayList arrayList = new ArrayList();
            for (Object obj : (ArrayList) list) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("(?i)");
                sbLIZ.append(Pattern.quote(string));
                Pattern patternCompile = PatternProtector.compile(C2188811AlT.LIZIZ(sbLIZ));
                String str = ((C745370TLr) obj).LIZ;
                if (str == null) {
                    str = "";
                }
                if (patternCompile.matcher(str).find()) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.isEmpty()) {
                RecyclerView recyclerView = kevaDebugFragment.LL;
                if (recyclerView != null) {
                    C500260Jjc.LJIILIIL(recyclerView);
                }
                C16F5 c16f5 = kevaDebugFragment.LLILLJJLI;
                if (c16f5 != null) {
                    C500260Jjc.LLFFF(c16f5);
                    return;
                }
                return;
            }
            RecyclerView recyclerView2 = kevaDebugFragment.LL;
            if (recyclerView2 != null) {
                C500260Jjc.LLFFF(recyclerView2);
            }
            C16F5 c16f52 = kevaDebugFragment.LLILLJJLI;
            if (c16f52 != null) {
                C500260Jjc.LJIILIIL(c16f52);
            }
            C745350TLp c745350TLp = kevaDebugFragment.LLILZIL;
            if (c745350TLp != null) {
                c745350TLp.LL = arrayList;
                c745350TLp.notifyDataSetChanged();
            }
        }
    }

    public static final void afterTextChanged$12(C786120Usc c786120Usc, Editable editable) {
        EmailPopUpFragment emailPopUpFragment = (EmailPopUpFragment) c786120Usc.l0;
        View viewFindViewById = emailPopUpFragment.LLLIZZ;
        if (viewFindViewById == null) {
            View view = emailPopUpFragment.getView();
            if (view != null) {
                viewFindViewById = view.findViewById(R.id.kpp);
            } else {
                viewFindViewById = null;
            }
            emailPopUpFragment.LLLIZZ = (RecyclerView) viewFindViewById;
        }
        C426750GoL.LJIIIZ(viewFindViewById, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(30))), null, null, false, 29);
    }

    public static final void afterTextChanged$13(C786120Usc c786120Usc, Editable editable) {
        C767850UAd c767850UAd = (C767850UAd) c786120Usc.l0;
        if (editable != null) {
            c767850UAd.getClass();
            if (editable.length() != 0) {
                C500260Jjc.LLFFF(c767850UAd.LJIJI);
                return;
            }
        }
        C500260Jjc.LJIILIIL(c767850UAd.LJIJI);
    }

    public static final void afterTextChanged$14(C786120Usc c786120Usc, Editable editable) {
        String string;
        C0HZQ c0hzq = ((LiveTitleEditDialogFragment) c786120Usc.l0).LLILZLL;
        if (c0hzq != null) {
            if (editable != null) {
                string = editable.toString();
            } else {
                string = null;
            }
            c0hzq.setChecked(Intrinsics.LJFF(string, ((LiveTitleEditDialogFragment) c786120Usc.l0).NR()));
        }
    }

    public static final void afterTextChanged$15(C786120Usc c786120Usc, Editable editable) {
        C767880UAg c767880UAg = (C767880UAg) c786120Usc.l0;
        c767880UAg.getClass();
        if (editable != null) {
            if (editable.length() == 0) {
                C500260Jjc.LJIILIIL(c767880UAg.LLIZ);
            } else {
                C500260Jjc.LLFFF(c767880UAg.LLIZ);
            }
            c767880UAg.LJI();
        }
    }

    public static final void afterTextChanged$16(C786120Usc c786120Usc, Editable editable) {
        int length;
        LiveEditText editViewFromXml = ((EffectTextInputFragment) c786120Usc.l0).getEditViewFromXml();
        if (editable != null && editViewFromXml != null) {
            int selectionStart = editViewFromXml.getSelectionStart();
            int selectionEnd = editViewFromXml.getSelectionEnd();
            int length2 = editable.toString().length();
            EffectTextInputFragment effectTextInputFragment = (EffectTextInputFragment) c786120Usc.l0;
            int i = effectTextInputFragment.LLILLL;
            if (length2 > i && i > 0) {
                String string = editable.toString();
                int i2 = selectionStart - 1;
                if (i2 >= 0 && selectionEnd >= 0 && selectionEnd >= i2 && i2 <= (length = string.length()) && selectionEnd <= length) {
                    editable.delete(i2, selectionEnd);
                } else {
                    editable.delete(((EffectTextInputFragment) c786120Usc.l0).LLILLL, editable.toString().length());
                }
                editViewFromXml.setText(editable);
                editViewFromXml.setSelection(editable.toString().length());
                return;
            }
            String string2 = editable.toString();
            C762040Tus c762040Tus = effectTextInputFragment.LLILZLL;
            if (c762040Tus == null) {
                return;
            }
            C0UA1.LIZ().LIZJ(c762040Tus.LIZ, c762040Tus.LIZIZ, string2, c762040Tus.LIZJ);
        }
    }

    public static final void afterTextChanged$17(C786120Usc c786120Usc, Editable editable) throws Throwable {
        C748760TYs c748760TYs;
        String string;
        Boolean boolValueOf;
        Editable editableLLLFZ = C2204961BRm.LLLFZ(((C748790TYv) c786120Usc.l0).getSearchEditFromXml(), new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yeeYHolk6i4pACa1t8DwyJN/jPIU8grk3wujEiCsamTfWhaqN4GxWOxvyQ==", null));
        if (editableLLLFZ != null && editableLLLFZ.toString() != null) {
            C748790TYv c748790TYv = (C748790TYv) c786120Usc.l0;
            if (c748790TYv.LLJJIJIIJIL && (c748760TYs = c748790TYv.LLJILJILJ) != null) {
                Editable editableLLLFZ2 = C2204961BRm.LLLFZ(c748790TYv.getSearchEditFromXml(), new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yeeYHolk6i4pACa1t8DwyJN/jPIU8grk3wujEiCsamTfWhaqN4GxWOxvyQ==", null));
                if (editableLLLFZ2 == null || (string = editableLLLFZ2.toString()) == null) {
                    string = "";
                }
                List<BlockWord> list = c748760TYs.LLILLL;
                ArrayList arrayList = new ArrayList();
                for (Object obj : (ArrayList) list) {
                    String str = ((BlockWord) obj).content;
                    if (str != null) {
                        boolValueOf = Boolean.valueOf(a0.LJJIIZI(str, string, true));
                    } else {
                        boolValueOf = null;
                    }
                    if (C500260Jjc.LJJJI(boolValueOf)) {
                        arrayList.add(obj);
                    }
                }
                c748760TYs.LLILLJJLI = new ArrayList(arrayList);
                c748760TYs.notifyDataSetChanged();
            }
            if (C500260Jjc.LJJIIZ(C2204961BRm.LLLFZ(((C748790TYv) c786120Usc.l0).getSearchEditFromXml(), new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yeeYHolk6i4pACa1t8DwyJN/jPIU8grk3wujEiCsamTfWhaqN4GxWOxvyQ==", null)))) {
                C500260Jjc.LLFFF(((C748790TYv) c786120Usc.l0).getSearchIvCancelFromXml());
            } else {
                C500260Jjc.LJIILIIL(((C748790TYv) c786120Usc.l0).getSearchIvCancelFromXml());
            }
        }
    }

    public static final void afterTextChanged$18(C786120Usc c786120Usc, Editable editable) {
        boolean z;
        C16F5 c16f5UR;
        C16F5 c16f5UR2;
        LiveEditText liveEditTextRR;
        if (editable == null) {
            return;
        }
        LiveGiftReminderAmountKeyboardFragment liveGiftReminderAmountKeyboardFragment = (LiveGiftReminderAmountKeyboardFragment) c786120Usc.l0;
        liveGiftReminderAmountKeyboardFragment.getClass();
        String string = editable.toString();
        boolean z2 = true;
        if (editable.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && editable.length() != 1) {
            string = new Regex("^0*").replaceFirst(string, "");
            if (string.length() == 0) {
                string = CardStruct.IStatusCode.DEFAULT;
            }
            if (!Intrinsics.LJFF(string, editable.toString()) && (liveEditTextRR = liveGiftReminderAmountKeyboardFragment.RR()) != null) {
                liveEditTextRR.setText(string);
            }
        }
        ((LiveGiftReminderAmountKeyboardFragment) c786120Usc.l0).WR(string);
        C16FV c16fvPR = ((LiveGiftReminderAmountKeyboardFragment) c786120Usc.l0).PR();
        if (string.length() == 0) {
            C500260Jjc.LJIILIIL(c16fvPR);
        } else {
            C500260Jjc.LLFFF(c16fvPR);
        }
        ((LiveGiftReminderAmountKeyboardFragment) c786120Usc.l0).getClass();
        if (LiveGiftReminderAmountKeyboardFragment.VR(string).length() <= 9) {
            LinearLayout linearLayoutSR = ((LiveGiftReminderAmountKeyboardFragment) c786120Usc.l0).SR();
            if (linearLayoutSR != null) {
                C500260Jjc.LJIILIIL(linearLayoutSR);
            }
            LiveGiftReminderAmountKeyboardFragment liveGiftReminderAmountKeyboardFragment2 = (LiveGiftReminderAmountKeyboardFragment) c786120Usc.l0;
            if (liveGiftReminderAmountKeyboardFragment2.LLJILJIL && (c16f5UR2 = liveGiftReminderAmountKeyboardFragment2.UR()) != null) {
                C500260Jjc.LLFFF(c16f5UR2);
            }
            LiveGiftReminderAmountKeyboardFragment liveGiftReminderAmountKeyboardFragment3 = (LiveGiftReminderAmountKeyboardFragment) c786120Usc.l0;
            View viewFindViewById = liveGiftReminderAmountKeyboardFragment3.LLJIJIL;
            if (viewFindViewById == null) {
                View view = liveGiftReminderAmountKeyboardFragment3.getView();
                if (view != null) {
                    viewFindViewById = view.findViewById(R.id.m2e);
                } else {
                    viewFindViewById = null;
                }
                liveGiftReminderAmountKeyboardFragment3.LLJIJIL = (FrameLayout) viewFindViewById;
            }
            viewFindViewById.setBackgroundResource(R.drawable.cej);
            C16FS c16fsNR = ((LiveGiftReminderAmountKeyboardFragment) c786120Usc.l0).NR();
            if (string.length() == 0 || Intrinsics.LJFF(string, CardStruct.IStatusCode.DEFAULT)) {
                z2 = false;
            }
            c16fsNR.setEnabled(z2);
        } else {
            if (((LiveGiftReminderAmountKeyboardFragment) c786120Usc.l0).SR().getVisibility() == 8) {
                if (((LiveGiftReminderAmountKeyboardFragment) c786120Usc.l0).UR().getVisibility() == 0 && (c16f5UR = ((LiveGiftReminderAmountKeyboardFragment) c786120Usc.l0).UR()) != null) {
                    C500260Jjc.LJIILIIL(c16f5UR);
                }
                LinearLayout linearLayoutSR2 = ((LiveGiftReminderAmountKeyboardFragment) c786120Usc.l0).SR();
                if (linearLayoutSR2 != null) {
                    C500260Jjc.LLFFF(linearLayoutSR2);
                }
            }
            LiveGiftReminderAmountKeyboardFragment liveGiftReminderAmountKeyboardFragment4 = (LiveGiftReminderAmountKeyboardFragment) c786120Usc.l0;
            View viewFindViewById2 = liveGiftReminderAmountKeyboardFragment4.LLJIJIL;
            if (viewFindViewById2 == null) {
                View view2 = liveGiftReminderAmountKeyboardFragment4.getView();
                if (view2 != null) {
                    viewFindViewById2 = view2.findViewById(R.id.m2e);
                } else {
                    viewFindViewById2 = null;
                }
                liveGiftReminderAmountKeyboardFragment4.LLJIJIL = (FrameLayout) viewFindViewById2;
            }
            viewFindViewById2.setBackgroundResource(R.drawable.cek);
            ((LiveGiftReminderAmountKeyboardFragment) c786120Usc.l0).NR().setEnabled(false);
        }
        ((LiveGiftReminderAmountKeyboardFragment) c786120Usc.l0).RR().removeTextChangedListener(c786120Usc);
        String strLIZ = C251000y4.LIZ(LiveGiftReminderAmountKeyboardFragment.VR(String.valueOf(C2204961BRm.LLLFZ(((LiveGiftReminderAmountKeyboardFragment) c786120Usc.l0).RR(), new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl7CPIYfMl2jAEDSGlvzdH7nD8kcpaY7U4Kg+6h+byNkt0EzEvzgv7JhJ+5nnJ3GglkqE7Et3tX4qATxAj", null)))));
        LiveGiftReminderAmountKeyboardFragment liveGiftReminderAmountKeyboardFragment5 = (LiveGiftReminderAmountKeyboardFragment) c786120Usc.l0;
        liveGiftReminderAmountKeyboardFragment5.RR().setText(strLIZ);
        liveGiftReminderAmountKeyboardFragment5.WR(strLIZ);
        liveGiftReminderAmountKeyboardFragment5.RR().setSelection(strLIZ.length());
        ((LiveGiftReminderAmountKeyboardFragment) c786120Usc.l0).RR().addTextChangedListener(c786120Usc);
    }

    public static final void afterTextChanged$19(C786120Usc c786120Usc, Editable editable) throws Throwable {
        String string;
        AddModeratorFragment addModeratorFragment = (AddModeratorFragment) c786120Usc.l0;
        if (!addModeratorFragment.mStatusViewValid) {
            return;
        }
        C749600Tao c749600Tao = addModeratorFragment.LLJ;
        if (c749600Tao != null) {
            Editable editableLLLFZ = C2204961BRm.LLLFZ(addModeratorFragment.OR(), new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl5iURFHzSXse3dUU2daRzRYNtXZvQfwBY6qRPf/Kx", null));
            if (editableLLLFZ == null || (string = editableLLLFZ.toString()) == null) {
                string = "";
            }
            c749600Tao.LLLFZ(string);
        }
        if (C500260Jjc.LJJIIZ(C2204961BRm.LLLFZ(((AddModeratorFragment) c786120Usc.l0).OR(), new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl5iURFHzSXse3dUU2daRzRYNtXZvQfwBY6qRPf/Kx", null)))) {
            C500260Jjc.LLFFF(((AddModeratorFragment) c786120Usc.l0).PR());
        } else {
            C500260Jjc.LJIILIIL(((AddModeratorFragment) c786120Usc.l0).PR());
        }
    }

    public static final void afterTextChanged$2(C786120Usc c786120Usc, Editable editable) {
        TuxIconView tuxIconView = (TuxIconView) c786120Usc.l0;
        int i = 0;
        if (editable == null || editable.length() == 0) {
            i = 8;
        }
        C786410Ut5.LLLLLLZZ(tuxIconView, i);
    }

    public static final void afterTextChanged$20(C786120Usc c786120Usc, Editable editable) {
        if (((AddModeratorFragmentSheet) c786120Usc.l0).getView() == null) {
            return;
        }
        ((AddModeratorFragmentSheet) c786120Usc.l0).ES();
        if (C500260Jjc.LJJIIZ(C2204961BRm.LLLFZ(((AddModeratorFragmentSheet) c786120Usc.l0).yS(), new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl5iURFHzSXse3dUU2daRzRYNtXZvQfwBY6qRPf/KxjZKKwgU=", null)))) {
            C500260Jjc.LLFFF(((AddModeratorFragmentSheet) c786120Usc.l0).zS());
        } else {
            C500260Jjc.LJIILIIL(((AddModeratorFragmentSheet) c786120Usc.l0).zS());
        }
    }

    public static final void afterTextChanged$22(C786120Usc c786120Usc, Editable editable) {
        boolean z;
        KaraokePageFragment karaokePageFragment = (KaraokePageFragment) c786120Usc.l0;
        karaokePageFragment.getClass();
        if (editable != null) {
            if (editable.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                View view = karaokePageFragment.LLILLL;
                if (view == null) {
                    view = null;
                }
                C500260Jjc.LJIILIIL(view);
            } else {
                View view2 = karaokePageFragment.LLILLL;
                if (view2 == null) {
                    view2 = null;
                }
                C500260Jjc.LLFFF(view2);
            }
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(karaokePageFragment), null, null, new C763630TxR(karaokePageFragment, editable, null), 3);
        }
    }

    public static final void afterTextChanged$3(C786120Usc c786120Usc, Editable editable) throws Throwable {
        String string;
        boolean z;
        Editable editableLLLFZ = C2204961BRm.LLLFZ(((C0TZ0) c786120Usc.l0).getBlockWordEditEtFromXml(), new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yeeYHolk6i4pACa1t8DwyJN/jPIU8grk3wujESinS2PnVg+ZF4OhQYHW+FCvlw==", null));
        if (editableLLLFZ != null && (string = editableLLLFZ.toString()) != null) {
            if (C500260Jjc.LJJIIZ(C2204961BRm.LLLFZ(((C0TZ0) c786120Usc.l0).getBlockWordEditEtFromXml(), new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yeeYHolk6i4pACa1t8DwyJN/jPIU8grk3wujESinS2PnVg+ZF4OhQYHW+FCvlw==", null)))) {
                C500260Jjc.LLFFF(((C0TZ0) c786120Usc.l0).getEditIvCancelFromXml());
            } else {
                C500260Jjc.LJIILIIL(((C0TZ0) c786120Usc.l0).getEditIvCancelFromXml());
            }
            InterfaceC748700TYm interfaceC748700TYm = ((C0TZ0) c786120Usc.l0).LLJIJIL;
            if (interfaceC748700TYm != null) {
                if (string.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                interfaceC748700TYm.LIZJ(z);
            }
            int length = string.length();
            C0TZ0 c0tz0 = (C0TZ0) c786120Usc.l0;
            if (length > c0tz0.LLJ) {
                C766270U4b.LIZLLL(2131842765);
                C0TZ0 c0tz02 = (C0TZ0) c786120Usc.l0;
                LiveEditText blockWordEditEtFromXml = c0tz02.getBlockWordEditEtFromXml();
                int length2 = string.length();
                c0tz02.getClass();
                InputFilter.LengthFilter lengthFilter = new InputFilter.LengthFilter(length2);
                c0tz02.LLIZLLLIL = lengthFilter;
                blockWordEditEtFromXml.setFilters(new InputFilter.LengthFilter[]{lengthFilter});
                String strSubstring = string.substring(0, ((C0TZ0) c786120Usc.l0).LLJ);
                ((C0TZ0) c786120Usc.l0).getBlockWordEditEtFromXml().setText(strSubstring);
                ((C0TZ0) c786120Usc.l0).getBlockWordEditEtFromXml().setSelection(strSubstring.length());
                return;
            }
            LiveEditText blockWordEditEtFromXml2 = c0tz0.getBlockWordEditEtFromXml();
            if (c0tz0.LLIZLLLIL == null) {
                return;
            }
            blockWordEditEtFromXml2.setFilters(new InputFilter[0]);
            c0tz0.LLIZLLLIL = null;
        }
    }

    public static final void afterTextChanged$4(C786120Usc c786120Usc, Editable editable) throws Throwable {
        String string;
        int i;
        Editable editableLLLFZ = C2204961BRm.LLLFZ(((AbstractC748830TYz) c786120Usc.l0).getBlockWordEditTextFromXml(), new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yeeYHolk6i4pACa1t8DwyJN/jPIU8grk3wujEi2wbE3kWgelL563atc/d8XY", null));
        if (editableLLLFZ != null && (string = editableLLLFZ.toString()) != null) {
            C418350Gan blockWordEditTextHintFromXml = ((AbstractC748830TYz) c786120Usc.l0).getBlockWordEditTextHintFromXml();
            if (string.length() == 0) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LLJJ(blockWordEditTextHintFromXml, i);
            if (string.length() > ((AbstractC748830TYz) c786120Usc.l0).getMaxSingleWordLength$livebroadcast_api_release()) {
                C766270U4b.LIZLLL(2131842765);
                AbstractC748830TYz abstractC748830TYz = (AbstractC748830TYz) c786120Usc.l0;
                LiveEditText blockWordEditTextFromXml = abstractC748830TYz.getBlockWordEditTextFromXml();
                int length = string.length();
                abstractC748830TYz.getClass();
                InputFilter.LengthFilter lengthFilter = new InputFilter.LengthFilter(length);
                abstractC748830TYz.LLILZIL = lengthFilter;
                blockWordEditTextFromXml.setFilters(new InputFilter.LengthFilter[]{lengthFilter});
                String strSubstring = string.substring(0, ((AbstractC748830TYz) c786120Usc.l0).getMaxSingleWordLength$livebroadcast_api_release());
                ((AbstractC748830TYz) c786120Usc.l0).getBlockWordEditTextFromXml().setText(strSubstring);
                ((AbstractC748830TYz) c786120Usc.l0).getBlockWordEditTextFromXml().setSelection(strSubstring.length());
                return;
            }
            AbstractC748830TYz abstractC748830TYz2 = (AbstractC748830TYz) c786120Usc.l0;
            LiveEditText blockWordEditTextFromXml2 = abstractC748830TYz2.getBlockWordEditTextFromXml();
            if (abstractC748830TYz2.LLILZIL == null) {
                return;
            }
            blockWordEditTextFromXml2.setFilters(new InputFilter[0]);
            abstractC748830TYz2.LLILZIL = null;
        }
    }

    public static final void afterTextChanged$5(C786120Usc c786120Usc, Editable editable) throws Throwable {
        String string;
        PreviewLiveDetailWidget previewLiveDetailWidget = (PreviewLiveDetailWidget) c786120Usc.l0;
        LiveEditText liveEditText = previewLiveDetailWidget.LLILZIL;
        LiveEditText liveEditText2 = null;
        if (liveEditText == null) {
            liveEditText = null;
        }
        Editable editableLLLFZ = C2204961BRm.LLLFZ(liveEditText, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6Thf6sjOPGmeD+wUluZhfAftz+7ymtvHQo+Qr413fkoXPrRM20YF4DTC149RpKzZ", null));
        if (editableLLLFZ == null || (string = editableLLLFZ.toString()) == null) {
            string = "";
        }
        if (TextUtils.getTrimmedLength(string) > 32) {
            LiveEditText liveEditText3 = previewLiveDetailWidget.LLILZIL;
            if (liveEditText3 == null) {
                liveEditText3 = null;
            }
            liveEditText3.setFilters(new InputFilter[]{new InputFilter.LengthFilter(string.length())});
            C766270U4b.LJIIJJI(C497740JfY.LJIJJ(2131851989, 32));
            String strSubstring = string.substring(0, 32);
            previewLiveDetailWidget.H1(strSubstring);
            LiveEditText liveEditText4 = previewLiveDetailWidget.LLILZIL;
            if (liveEditText4 != null) {
                liveEditText2 = liveEditText4;
            }
            liveEditText2.setSelection(strSubstring.length());
            return;
        }
        LiveEditText liveEditText5 = previewLiveDetailWidget.LLILZIL;
        if (liveEditText5 != null) {
            liveEditText2 = liveEditText5;
        }
        liveEditText2.setFilters(new InputFilter[0]);
    }

    public static final void afterTextChanged$6(C786120Usc c786120Usc, Editable editable) throws Throwable {
        String string;
        LiveMode liveModeLIZJ;
        Map map;
        PreviewTitleWidget previewTitleWidget = (PreviewTitleWidget) c786120Usc.l0;
        LiveEditText liveEditText = previewTitleWidget.LLILZLL;
        if (liveEditText == null) {
            liveEditText = null;
        }
        Editable editableLLLFZ = C2204961BRm.LLLFZ(liveEditText, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6Thf6sjOPGmeD+wUluZhfAftz+7ymtvHQo+Qr413fkoPPgfwZtEL4XEOjQ==", null));
        if (editableLLLFZ == null || (string = editableLLLFZ.toString()) == null) {
            string = "";
        }
        if (TextUtils.getTrimmedLength(string) > 32) {
            LiveEditText liveEditText2 = previewTitleWidget.LLILZLL;
            if (liveEditText2 == null) {
                liveEditText2 = null;
            }
            liveEditText2.setFilters(new InputFilter[]{new InputFilter.LengthFilter(string.length())});
            C766270U4b.LJIIJJI(C497740JfY.LJIJJ(2131851989, 32));
            String strSubstring = string.substring(0, 32);
            previewTitleWidget.I1(strSubstring);
            LiveEditText liveEditText3 = previewTitleWidget.LLILZLL;
            if (liveEditText3 == null) {
                liveEditText3 = null;
            }
            liveEditText3.setSelection(strSubstring.length());
        } else {
            LiveEditText liveEditText4 = previewTitleWidget.LLILZLL;
            if (liveEditText4 == null) {
                liveEditText4 = null;
            }
            liveEditText4.setFilters(new InputFilter[0]);
        }
        DataChannel dataChannel = ((PreviewTitleWidget) c786120Usc.l0).dataChannel;
        if (dataChannel == null || (liveModeLIZJ = C751980Tee.LIZJ(dataChannel)) == null) {
            liveModeLIZJ = LiveMode.VIDEO;
        }
        DataChannel dataChannel2 = ((PreviewTitleWidget) c786120Usc.l0).dataChannel;
        if (dataChannel2 != null && (map = (Map) dataChannel2.gg0(PreviewLiveModeTitleChannel.class)) != null) {
            LiveEditText liveEditText5 = ((PreviewTitleWidget) c786120Usc.l0).LLILZLL;
            if (liveEditText5 == null) {
                liveEditText5 = null;
            }
            map.put(liveModeLIZJ, a0.LJJJLL(" ", String.valueOf(C2204961BRm.LLLFZ(liveEditText5, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6Thf6sjOPGmeD+wUluZhfAftz+7ymtvHQo+Qr413fkoPPgfwZtEL4XEOjQ==", null)))));
        }
        PreviewTitleWidget previewTitleWidget2 = (PreviewTitleWidget) c786120Usc.l0;
        DataChannel dataChannel3 = previewTitleWidget2.dataChannel;
        if (dataChannel3 != null) {
            LiveEditText liveEditText6 = previewTitleWidget2.LLILZLL;
            if (liveEditText6 == null) {
                liveEditText6 = null;
            }
            dataChannel3.zW(PreviewTitleChannel.class, a0.LJJJLL(" ", String.valueOf(C2204961BRm.LLLFZ(liveEditText6, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6Thf6sjOPGmeD+wUluZhfAftz+7ymtvHQo+Qr413fkoPPgfwZtEL4XEOjQ==", null)))));
        }
    }

    public static final void afterTextChanged$7(C786120Usc c786120Usc, Editable editable) {
        String string;
        Editable editableLLLFZ;
        PreviewLiveDetailSheet previewLiveDetailSheet = (PreviewLiveDetailSheet) c786120Usc.l0;
        LiveEditText liveEditText = previewLiveDetailSheet.LLLFF;
        if (liveEditText == null || (editableLLLFZ = C2204961BRm.LLLFZ(liveEditText, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6Thf6sjOPGmeD+wUluZhfAftz+7ymtvHQqyHvo93dVp1B8DMJolxCqBTNZOxQEDp8F7nrSJv4g==", null))) == null || (string = editableLLLFZ.toString()) == null) {
            string = "";
        }
        if (TextUtils.getTrimmedLength(string) > 32) {
            LiveEditText liveEditText2 = previewLiveDetailSheet.LLLFF;
            if (liveEditText2 != null) {
                liveEditText2.setFilters(new InputFilter[]{new InputFilter.LengthFilter(string.length())});
            }
            C766270U4b.LJIIJJI(C497740JfY.LJIJJ(2131851989, 32));
            String strSubstring = string.substring(0, 32);
            previewLiveDetailSheet.wS(strSubstring);
            LiveEditText liveEditText3 = previewLiveDetailSheet.LLLFF;
            if (liveEditText3 != null) {
                liveEditText3.setSelection(strSubstring.length());
                return;
            }
            return;
        }
        LiveEditText liveEditText4 = previewLiveDetailSheet.LLLFF;
        if (liveEditText4 == null) {
            return;
        }
        liveEditText4.setFilters(new InputFilter[0]);
    }

    public static final void afterTextChanged$8(C786120Usc c786120Usc, Editable editable) throws Throwable {
        String string;
        PreviewTitleCoverFragment previewTitleCoverFragment = (PreviewTitleCoverFragment) c786120Usc.l0;
        LiveEditText liveEditText = previewTitleCoverFragment.LLILZLL;
        if (liveEditText == null) {
            liveEditText = null;
        }
        Editable editableLLLFZ = C2204961BRm.LLLFZ(liveEditText, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6Thf6sjOPGmeD+wUluZhfAftz+7ymtvHQqyHvo93dVp1B8DMJolxCrhTN5qQZlv+/EDD/ubh0w2Epg==", null));
        if (editableLLLFZ == null || (string = editableLLLFZ.toString()) == null) {
            string = "";
        }
        if (TextUtils.getTrimmedLength(string) > 32) {
            LiveEditText liveEditText2 = previewTitleCoverFragment.LLILZLL;
            if (liveEditText2 == null) {
                liveEditText2 = null;
            }
            liveEditText2.setFilters(new InputFilter[]{new InputFilter.LengthFilter(string.length())});
            C766270U4b.LJIIJJI(C497740JfY.LJIJJ(2131851989, 32));
            String strSubstring = string.substring(0, 32);
            previewTitleCoverFragment.NR(strSubstring);
            LiveEditText liveEditText3 = previewTitleCoverFragment.LLILZLL;
            if (liveEditText3 == null) {
                liveEditText3 = null;
            }
            liveEditText3.setSelection(strSubstring.length());
        } else {
            LiveEditText liveEditText4 = previewTitleCoverFragment.LLILZLL;
            if (liveEditText4 == null) {
                liveEditText4 = null;
            }
            liveEditText4.setFilters(new InputFilter[0]);
            DataChannel dataChannelLJ = C475510Ikn.LJ(previewTitleCoverFragment);
            if (dataChannelLJ != null) {
                dataChannelLJ.SX0(C753090TgR.class, string);
            }
        }
        DataChannel dataChannelLJ2 = C475510Ikn.LJ((PreviewTitleCoverFragment) c786120Usc.l0);
        if (dataChannelLJ2 != null) {
            LiveEditText liveEditText5 = ((PreviewTitleCoverFragment) c786120Usc.l0).LLILZLL;
            if (liveEditText5 == null) {
                liveEditText5 = null;
            }
            dataChannelLJ2.zW(PreviewTitleChannel.class, a0.LJJJLL(" ", String.valueOf(C2204961BRm.LLLFZ(liveEditText5, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6Thf6sjOPGmeD+wUluZhfAftz+7ymtvHQqyHvo93dVp1B8DMJolxCrhTN5qQZlv+/EDD/ubh0w2Epg==", null)))));
        }
    }

    public static final void afterTextChanged$9(C786120Usc c786120Usc, Editable editable) throws Throwable {
        String string;
        PreviewTitleCoverFragmentSheet previewTitleCoverFragmentSheet = (PreviewTitleCoverFragmentSheet) c786120Usc.l0;
        LiveEditText liveEditText = previewTitleCoverFragmentSheet.LLL;
        if (liveEditText == null) {
            liveEditText = null;
        }
        Editable editableLLLFZ = C2204961BRm.LLLFZ(liveEditText, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6Thf6sjOPGmeD+wUluZhfAftz+7ymtvHQqyHvo93dVp1B8DMJolxCrhTN5qQZlv+/EDD/ubh0w2EptGjZhFZ", null));
        if (editableLLLFZ == null || (string = editableLLLFZ.toString()) == null) {
            string = "";
        }
        if (TextUtils.getTrimmedLength(string) > 32) {
            LiveEditText liveEditText2 = previewTitleCoverFragmentSheet.LLL;
            if (liveEditText2 == null) {
                liveEditText2 = null;
            }
            liveEditText2.setFilters(new InputFilter[]{new InputFilter.LengthFilter(string.length())});
            C766270U4b.LJIIJJI(C497740JfY.LJIJJ(2131851989, 32));
            String strSubstring = string.substring(0, 32);
            previewTitleCoverFragmentSheet.uS(strSubstring);
            LiveEditText liveEditText3 = previewTitleCoverFragmentSheet.LLL;
            if (liveEditText3 == null) {
                liveEditText3 = null;
            }
            liveEditText3.setSelection(strSubstring.length());
        } else {
            LiveEditText liveEditText4 = previewTitleCoverFragmentSheet.LLL;
            if (liveEditText4 == null) {
                liveEditText4 = null;
            }
            liveEditText4.setFilters(new InputFilter[0]);
        }
        DataChannel dataChannelLJ = C475510Ikn.LJ((PreviewTitleCoverFragmentSheet) c786120Usc.l0);
        if (dataChannelLJ != null) {
            LiveEditText liveEditText5 = ((PreviewTitleCoverFragmentSheet) c786120Usc.l0).LLL;
            if (liveEditText5 == null) {
                liveEditText5 = null;
            }
            dataChannelLJ.zW(PreviewTitleChannel.class, a0.LJJJLL(" ", String.valueOf(C2204961BRm.LLLFZ(liveEditText5, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6Thf6sjOPGmeD+wUluZhfAftz+7ymtvHQqyHvo93dVp1B8DMJolxCrhTN5qQZlv+/EDD/ubh0w2EptGjZhFZ", null)))));
        }
    }

    public static final void beforeTextChanged$10(C786120Usc c786120Usc, CharSequence charSequence, int i, int i2, int i3) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("beforeTextChanged: ");
        sbLIZ.append((Object) charSequence);
        C20441214yg.LIZIZ("Admin#input", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void onTextChanged$1(C786120Usc c786120Usc, CharSequence charSequence, int i, int i2, int i3) {
        int length;
        ((C11GD) c786120Usc.l0).LLJJJJLIIL = String.valueOf(charSequence);
        if (charSequence != null) {
            length = charSequence.length();
        } else {
            length = 0;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(length);
        sbLIZ.append("/200");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (length > 200) {
            C11GD c11gd = (C11GD) c786120Usc.l0;
            if (c11gd.LLJILJIL) {
                TuxTextView tuxTextView = c11gd.LLJJJIL;
                if (tuxTextView != null) {
                    tuxTextView.setText("200/200");
                    return;
                }
                return;
            }
            int length2 = String.valueOf(length).length();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strLIZIZ);
            C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(C960203pA.LIZ(R.attr.zs, ((C11GD) c786120Usc.l0).getContext())), 0, length2, 33);
            TuxTextView tuxTextView2 = ((C11GD) c786120Usc.l0).LLJJJIL;
            if (tuxTextView2 != null) {
                tuxTextView2.setText(spannableStringBuilder);
            }
            C197039127h c197039127h = ((C11GD) c786120Usc.l0).LLJJJJ;
            if (c197039127h == null) {
                return;
            }
            c197039127h.setEnabled(false);
            c197039127h.setClickable(false);
            return;
        }
        TuxTextView tuxTextView3 = ((C11GD) c786120Usc.l0).LLJJJIL;
        if (tuxTextView3 != null) {
            tuxTextView3.setText(strLIZIZ);
        }
        if (length > 0) {
            C197039127h c197039127h2 = ((C11GD) c786120Usc.l0).LLJJJJ;
            if (c197039127h2 == null) {
                return;
            }
            c197039127h2.setEnabled(true);
            c197039127h2.setClickable(true);
            return;
        }
        C197039127h c197039127h3 = ((C11GD) c786120Usc.l0).LLJJJJ;
        if (c197039127h3 == null) {
            return;
        }
        c197039127h3.setEnabled(false);
        c197039127h3.setClickable(false);
    }

    public static final void onTextChanged$10(C786120Usc c786120Usc, CharSequence charSequence, int i, int i2, int i3) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onTextChanged: ");
        sbLIZ.append((Object) charSequence);
        C20441214yg.LIZIZ("Admin#input", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void onTextChanged$12(C786120Usc c786120Usc, CharSequence charSequence, int i, int i2, int i3) {
        if (TextUtils.isEmpty(charSequence)) {
            RecyclerView recyclerView = ((EmailPopUpFragment) c786120Usc.l0).LLLLIILL;
            if (recyclerView != null) {
                C786410Ut5.LLIZLLLIL(recyclerView, 8);
                return;
            }
            return;
        }
        RecyclerView recyclerView2 = ((EmailPopUpFragment) c786120Usc.l0).LLLLIILL;
        if (recyclerView2 == null) {
            return;
        }
        C786410Ut5.LLIZLLLIL(recyclerView2, 0);
    }

    public static final void onTextChanged$16(C786120Usc c786120Usc, CharSequence charSequence, int i, int i2, int i3) {
        EffectTextInputFragment effectTextInputFragment = (EffectTextInputFragment) c786120Usc.l0;
        charSequence.toString();
        effectTextInputFragment.getClass();
    }

    public static final void onTextChanged$21(C786120Usc c786120Usc, CharSequence charSequence, int i, int i2, int i3) {
        if (String.valueOf(charSequence).length() >= 400) {
            C1389890mGx c1389890mGx = new C1389890mGx((LiveQuickPostFragment) c786120Usc.l0);
            c1389890mGx.LJIIJ(C497740JfY.LJIIL(2131755946, 400, 400));
            c1389890mGx.LJIIJJI();
        }
    }
}
