package X;

import Y.AObjectS364S0100000_21;
import Y.ARunnableS112S0100000_12;
import Y.ARunnableS121S0100000_21;
import android.content.Context;
import android.text.Editable;
import android.text.Layout;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.NowKeyboardVM;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.BaseFakeInput;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.CommentGroupChatPasteAssem;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.KeyboardVMV2;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.PortraitInputKeyboard;
import com.ss.android.ugc.aweme.comment.keyboard.ui.KeyboardDialogFragment;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt;
import com.ss.android.ugc.aweme.comment.model.CommentKeyboardModel;
import com.ss.android.ugc.aweme.comment.poll.CommentPollCreateViewModel;
import com.ss.android.ugc.aweme.comment.poll.PollCreateFragment;
import com.ss.android.ugc.aweme.comment.widgets.MentionSpan;
import com.ss.android.ugc.aweme.feed.adapter.widget.repost.RepostAddNoteInputFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.im.sharepanel.impl.relations.ui.fragment.RelationSelectFragment;
import com.ss.android.ugc.aweme.im.sharepanel.impl.share.viewmodel.ShareDialogViewModel;
import com.ss.android.ugc.aweme.input.DanmakuInputAssem;
import com.ss.android.ugc.aweme.internalshare.impl.viewmodel.SharePanelImHeadViewModel;
import com.ss.android.ugc.aweme.internalshare.impl.viewmodel.SharePanelViewModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.upvote.detail.input.RepostInputFragment;
import com.ss.android.ugc.aweme.upvote.detail.input.RepostMentionAssem;
import com.ss.android.ugc.aweme.upvote.detail.replypanel.assem.RepostReplyKeyboard;
import com.ss.android.ugc.now.interaction.assem.NowKeyboardInputAssem;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS10S1001000_21;
import kotlin.jvm.internal.AwS34S0010000_21;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.AwS600S0100000_21;
import kotlin.jvm.internal.AwS71S1000000_21;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0mag, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C1402120mag implements TextWatcher {
    public final int $t;
    public Object l0;

    public static final void afterTextChanged$6(C1402120mag c1402120mag, Editable editable) {
    }

    public static final void beforeTextChanged$0(C1402120mag c1402120mag, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$1(C1402120mag c1402120mag, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$10(C1402120mag c1402120mag, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$11(C1402120mag c1402120mag, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$12(C1402120mag c1402120mag, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$13(C1402120mag c1402120mag, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$14(C1402120mag c1402120mag, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$15(C1402120mag c1402120mag, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$16(C1402120mag c1402120mag, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$17(C1402120mag c1402120mag, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$18(C1402120mag c1402120mag, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$19(C1402120mag c1402120mag, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$2(C1402120mag c1402120mag, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$4(C1402120mag c1402120mag, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$5(C1402120mag c1402120mag, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$6(C1402120mag c1402120mag, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$7(C1402120mag c1402120mag, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$8(C1402120mag c1402120mag, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$10(C1402120mag c1402120mag, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$12(C1402120mag c1402120mag, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$13(C1402120mag c1402120mag, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$14(C1402120mag c1402120mag, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$15(C1402120mag c1402120mag, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$16(C1402120mag c1402120mag, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$17(C1402120mag c1402120mag, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$4(C1402120mag c1402120mag, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$8(C1402120mag c1402120mag, CharSequence charSequence, int i, int i2, int i3) {
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
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) throws Throwable {
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
        }
    }

    public C1402120mag(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void afterTextChanged$0(X.C1402120mag r6, android.text.Editable r7) {
        /*
            boolean r0 = X.C0CNA.LIZ()
            java.lang.String r2 = ""
            r5 = 0
            if (r0 == 0) goto L4d
            if (r7 == 0) goto L5c
            java.lang.String r4 = r7.toString()
        Lf:
            r3 = 1
            if (r4 == 0) goto L5c
            boolean r0 = kotlin.text.a0.LJJJIL(r4)
            if (r0 != 0) goto L5c
            java.lang.Object r0 = r6.l0
            X.0lix r0 = (X.C1368810lix) r0
            com.ss.android.ugc.aweme.internalshare.impl.more.ShareMoreViewModel r0 = r0.LIZLLL()
            androidx.lifecycle.MutableLiveData<java.lang.Integer> r1 = r0.LLJJJIL
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r1.setValue(r0)
            java.lang.Object r0 = r6.l0
            X.0lix r0 = (X.C1368810lix) r0
            com.ss.android.ugc.aweme.internalshare.impl.more.ShareMoreViewModel r0 = r0.LIZLLL()
            java.lang.String r0 = r0.xQ2()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r4, r0)
            if (r0 != 0) goto L46
            java.lang.Object r0 = r6.l0
            X.0lix r0 = (X.C1368810lix) r0
            com.ss.android.ugc.aweme.internalshare.impl.more.ShareMoreViewModel r0 = r0.LIZLLL()
            r0.LJJZZIII(r4)
        L46:
            java.lang.Object r0 = r6.l0
            X.0lix r0 = (X.C1368810lix) r0
            r0.LLJJIII = r3
        L4c:
            return
        L4d:
            if (r7 == 0) goto L5c
            java.lang.String r1 = r7.toString()
            if (r1 == 0) goto L5c
            java.lang.String r0 = " "
            java.lang.String r4 = kotlin.text.u.LJJIFFI(r1, r0, r2, r5)
            goto Lf
        L5c:
            java.lang.Object r0 = r6.l0
            X.0lix r0 = (X.C1368810lix) r0
            com.ss.android.ugc.aweme.internalshare.impl.more.ShareMoreViewModel r0 = r0.LIZLLL()
            boolean r0 = r0.AQ2()
            if (r0 != 0) goto L6b
            return
        L6b:
            java.lang.Object r0 = r6.l0
            X.0lix r0 = (X.C1368810lix) r0
            com.ss.android.ugc.aweme.internalshare.impl.more.ShareMoreViewModel r0 = r0.LIZLLL()
            androidx.lifecycle.MutableLiveData<java.lang.Integer> r1 = r0.LLJJJIL
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r1.setValue(r0)
            java.lang.Object r0 = r6.l0
            X.0lix r0 = (X.C1368810lix) r0
            com.ss.android.ugc.aweme.internalshare.impl.more.ShareMoreViewModel r0 = r0.LIZLLL()
            r0.refresh()
            boolean r0 = X.C1368750lir.LIZJ()
            if (r0 != 0) goto L93
            boolean r0 = X.C0CNA.LIZ()
            if (r0 == 0) goto L4c
        L93:
            java.lang.Object r0 = r6.l0
            X.0lix r0 = (X.C1368810lix) r0
            com.ss.android.ugc.aweme.internalshare.impl.more.ShareMoreViewModel r0 = r0.LIZLLL()
            r0.LJJZZIII(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1402120mag.afterTextChanged$0(X.0mag, android.text.Editable):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0101  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void afterTextChanged$1(X.C1402120mag r8, android.text.Editable r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1402120mag.afterTextChanged$1(X.0mag, android.text.Editable):void");
    }

    public static final void afterTextChanged$10(C1402120mag c1402120mag, Editable editable) {
        User userLIZ;
        if (a0.LJLIIIL(String.valueOf(editable)).toString().length() > 0) {
            C1355330lND c1355330lND = ((RepostReplyKeyboard) c1402120mag.l0).LLIZLLLIL;
            if (c1355330lND != null) {
                c1355330lND.setHint("");
                c1355330lND.setMaxLines(5);
            }
        } else {
            RepostReplyKeyboard repostReplyKeyboard = (RepostReplyKeyboard) c1402120mag.l0;
            C1355330lND c1355330lND2 = repostReplyKeyboard.LLIZLLLIL;
            if (c1355330lND2 != null) {
                Context context = c1355330lND2.getContext();
                String string = null;
                if (context != null) {
                    Object[] objArr = new Object[1];
                    C1356730lPT c1356730lPT = repostReplyKeyboard.LLJILJILJ;
                    if (c1356730lPT != null && (userLIZ = c1356730lPT.LIZ()) != null) {
                        C1243240iSQ.LIZ.getClass();
                        string = C1243240iSQ.LIZ(userLIZ, true);
                    }
                    objArr[0] = string;
                    string = context.getString(2131835456, objArr);
                }
                c1355330lND2.setHint(string);
                c1355330lND2.setMaxLines(1);
            }
        }
        ((RepostReplyKeyboard) c1402120mag.l0).RR(editable);
    }

    public static final void afterTextChanged$11(C1402120mag c1402120mag, Editable editable) {
        String string = editable.toString();
        RelationSelectFragment relationSelectFragment = ((ViewOnTouchListenerC1367610lh1) c1402120mag.l0).LLJJIJI;
        if (relationSelectFragment != null) {
            relationSelectFragment.LJJZZIII(string);
        }
    }

    public static final void afterTextChanged$12(C1402120mag c1402120mag, Editable editable) {
        Function0<Unit> onEditCallback = ((C1360570lVf) c1402120mag.l0).getOnEditCallback();
        if (onEditCallback != null) {
            onEditCallback.invoke();
        }
    }

    public static final void afterTextChanged$13(C1402120mag c1402120mag, Editable editable) {
        int i;
        if (editable.length() == 0) {
            i = 8;
        } else {
            i = 0;
        }
        if (((DialogC1396120mR0) c1402120mag.l0).findViewById(R.id.e00).getVisibility() != i) {
            ImageView imageView = (ImageView) ((DialogC1396120mR0) c1402120mag.l0).findViewById(R.id.e00);
            int visibility = imageView.getVisibility();
            imageView.setVisibility(i);
            C1602160rnK.LIZIZ(visibility, i, imageView);
        }
        String string = a0.LJLIIIL(editable.toString()).toString();
        if (string.length() == 0) {
            C2385709Wl c2385709WlLJLIIIL = ((DialogC1396120mR0) c1402120mag.l0).LJLIIIL();
            c2385709WlLJLIIIL.getClass();
            List<C2386409Ws> list = C13BV.INSTANCE;
            c2385709WlLJLIIIL.LIZIZ.setValue(list);
            C1396150mR3 c1396150mR3LJLI = ((DialogC1396120mR0) c1402120mag.l0).LJLI();
            List<C2386409Ws> value = ((DialogC1396120mR0) c1402120mag.l0).LJLIIIL().LIZ.getValue();
            if (value != null) {
                list = value;
            }
            c1396150mR3LJLI.setData(list);
            return;
        }
        if (((DialogC1396120mR0) c1402120mag.l0).LJLI().getItemCount() == 0) {
            ((C1749280vcc) ((DialogC1396120mR0) c1402120mag.l0).findViewById(R.id.w28)).LJ();
            C786410Ut5.LLLZLZ((C1749280vcc) ((DialogC1396120mR0) c1402120mag.l0).findViewById(R.id.w28), 0);
        }
        ((DialogC1396120mR0) c1402120mag.l0).LJLIIIL().LIZJ(string, false);
    }

    public static final void afterTextChanged$14(C1402120mag c1402120mag, Editable editable) {
        DanmakuInputAssem danmakuInputAssem;
        C1354840lMQ c1354840lMQ;
        String string;
        boolean z = true;
        if (editable != null && a0.LJLIIIL(editable.toString()).toString().length() != 0) {
            z = false;
        }
        ((DanmakuInputAssem) c1402120mag.l0).hp().setState(new AwS34S0010000_21(!z, 9));
        if (z && (c1354840lMQ = (danmakuInputAssem = (DanmakuInputAssem) c1402120mag.l0).LLJJIJI) != null) {
            Context context = danmakuInputAssem.getContext();
            if (context != null) {
                string = context.getString(2131827579);
            } else {
                string = null;
            }
            c1354840lMQ.setHint(string);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void afterTextChanged$15(X.C1402120mag r9, android.text.Editable r10) throws java.lang.Throwable {
        /*
            r4 = 0
            r3 = 1
            if (r10 == 0) goto L97
            java.lang.String r0 = r10.toString()
            java.lang.CharSequence r0 = kotlin.text.a0.LJLIIIL(r0)
            java.lang.String r0 = r0.toString()
            int r0 = r0.length()
            if (r0 == 0) goto L97
            r8 = 0
        L17:
            java.lang.Object r0 = r9.l0
            com.ss.android.ugc.now.interaction.assem.NowFakeCommentInputAssem r0 = (com.ss.android.ugc.now.interaction.assem.NowFakeCommentInputAssem) r0
            X.01GW r0 = r0.LLJJJJJIL
            java.lang.Object r0 = r0.getValue()
            android.view.View r0 = (android.view.View) r0
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L95
            r0 = 1
        L2a:
            r5 = 0
            if (r8 == 0) goto L50
            if (r0 != 0) goto L52
        L2f:
            java.lang.Object r1 = r9.l0
            com.ss.android.ugc.now.interaction.assem.NowFakeCommentInputAssem r1 = (com.ss.android.ugc.now.interaction.assem.NowFakeCommentInputAssem) r1
            java.lang.String r0 = r1.LLJJLIIIJLLLLLLLZ
            if (r0 != 0) goto L9a
            X.0lKH r2 = r1.hp()
            java.lang.Object r0 = r9.l0
            com.ss.android.ugc.now.interaction.assem.NowFakeCommentInputAssem r0 = (com.ss.android.ugc.now.interaction.assem.NowFakeCommentInputAssem) r0
            android.content.Context r1 = r0.getContext()
            if (r1 == 0) goto L4c
            r0 = 2131838349(0x7f11458d, float:1.9309919E38)
            java.lang.String r5 = r1.getString(r0)
        L4c:
            r2.setHint(r5)
        L4f:
            return
        L50:
            if (r0 != 0) goto L4f
        L52:
            java.lang.Object r7 = r9.l0
            com.ss.android.ugc.now.interaction.assem.NowFakeCommentInputAssem r7 = (com.ss.android.ugc.now.interaction.assem.NowFakeCommentInputAssem) r7
            r6 = r0 ^ 1
            X.0lKH r2 = r7.hp()
            X.0WZX r1 = new X.0WZX
            java.lang.String r0 = "dzBzEhEpEcvSUUUuTBbKc9NnF3Y2ayk6aP6tcZ7NyDus9jTyrBoGO/cwE6YTV5n/OmDjrvAAoCjN3YtMHsVnRMY="
            r1.<init>(r0, r5)
            android.text.Editable r0 = X.C2204961BRm.M(r2, r1)
            if (r0 == 0) goto L89
            java.lang.String r0 = r0.toString()
            java.lang.CharSequence r0 = kotlin.text.a0.LJLIIIL(r0)
            java.lang.String r0 = r0.toString()
            int r0 = r0.length()
            if (r0 <= 0) goto L89
            X.01GW r0 = r7.LLJJJIL
            java.lang.Object r0 = r0.getValue()
            X.0Gcd r0 = (X.C419490Gcd) r0
            r0.LIZJ(r3, r6)
        L86:
            if (r8 == 0) goto L4f
            goto L2f
        L89:
            X.01GW r0 = r7.LLJJJIL
            java.lang.Object r0 = r0.getValue()
            X.0Gcd r0 = (X.C419490Gcd) r0
            r0.LIZJ(r4, r3)
            goto L86
        L95:
            r0 = 0
            goto L2a
        L97:
            r8 = 1
            goto L17
        L9a:
            X.0lKH r6 = r1.hp()
            java.lang.Object r0 = r9.l0
            com.ss.android.ugc.now.interaction.assem.NowFakeCommentInputAssem r0 = (com.ss.android.ugc.now.interaction.assem.NowFakeCommentInputAssem) r0
            android.content.Context r2 = r0.getContext()
            if (r2 == 0) goto Lb9
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.Object r0 = r9.l0
            com.ss.android.ugc.now.interaction.assem.NowFakeCommentInputAssem r0 = (com.ss.android.ugc.now.interaction.assem.NowFakeCommentInputAssem) r0
            java.lang.String r0 = r0.LLJLILLLLZIIL
            r1[r4] = r0
            r0 = 2131838358(0x7f114596, float:1.9309937E38)
            java.lang.String r5 = r2.getString(r0, r1)
        Lb9:
            r6.setHint(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1402120mag.afterTextChanged$15(X.0mag, android.text.Editable):void");
    }

    public static final void afterTextChanged$16(C1402120mag c1402120mag, Editable editable) {
        boolean z;
        boolean z2;
        if (editable != null && a0.LJLIIIL(editable.toString()).toString().length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (((View) ((NowKeyboardInputAssem) c1402120mag.l0).LLJJJJ.getValue()).getVisibility() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("content:");
        sbLIZ.append((Object) editable);
        sbLIZ.append("   isContentEmpty ");
        sbLIZ.append(z);
        sbLIZ.append(" isSendBtnVisible ");
        sbLIZ.append(z2);
        sbLIZ.append("  ");
        C2188811AlT.LIZIZ(sbLIZ);
        if (!z ? !z2 : z2) {
            NowKeyboardVM nowKeyboardVMKp = ((NowKeyboardInputAssem) c1402120mag.l0).kp();
            boolean z3 = !z;
            nowKeyboardVMKp.getClass();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("updateSendButtonStatus in VM ");
            sbLIZ2.append(z3);
            C2188811AlT.LIZIZ(sbLIZ2);
            nowKeyboardVMKp.setStateImmediate(new AwS34S0010000_21(z3, 20));
        }
        NowKeyboardVM nowKeyboardVMKp2 = ((NowKeyboardInputAssem) c1402120mag.l0).kp();
        nowKeyboardVMKp2.getClass();
        nowKeyboardVMKp2.setStateImmediate(new AwS600S0100000_21(editable, 393));
        if (z) {
            NowKeyboardInputAssem nowKeyboardInputAssem = (NowKeyboardInputAssem) c1402120mag.l0;
            String string = null;
            if (nowKeyboardInputAssem.LLJJLIIIJLLLLLLLZ == null) {
                C1353510lKH c1353510lKHHp = nowKeyboardInputAssem.hp();
                Context context = ((NowKeyboardInputAssem) c1402120mag.l0).getContext();
                if (context != null) {
                    string = context.getString(2131838349);
                }
                c1353510lKHHp.setHint(string);
                return;
            }
            C1353510lKH c1353510lKHHp2 = nowKeyboardInputAssem.hp();
            Context context2 = ((NowKeyboardInputAssem) c1402120mag.l0).getContext();
            if (context2 != null) {
                string = context2.getString(2131838358, ((NowKeyboardInputAssem) c1402120mag.l0).LLJLIL);
            }
            c1353510lKHHp2.setHint(string);
        }
    }

    public static final void afterTextChanged$17(C1402120mag c1402120mag, Editable editable) {
        String strValueOf = String.valueOf(editable);
        SharePanelImHeadViewModel sharePanelImHeadViewModel = ((C1362990lZZ) c1402120mag.l0).LLILZ;
        if (sharePanelImHeadViewModel != null) {
            sharePanelImHeadViewModel.LLJJJ = strValueOf;
            SharePanelViewModel sharePanelViewModel = sharePanelImHeadViewModel.LLJJIJIL;
            if (sharePanelViewModel != null) {
                sharePanelViewModel.LLJZIJLIL = strValueOf;
            }
        }
    }

    public static final void afterTextChanged$18(C1402120mag c1402120mag, Editable editable) {
        if (editable == null || editable.toString().trim().isEmpty()) {
            ((C1348730lCZ) c1402120mag.l0).LLJILJILJ = false;
        }
    }

    public static final void afterTextChanged$19(C1402120mag c1402120mag, Editable editable) throws Throwable {
        boolean z;
        boolean z2;
        Aweme aweme;
        C439870HMr.LIZJ(((BaseFakeInput) c1402120mag.l0).LLJJIJI, c1402120mag);
        if (editable != null && a0.LJLIIIL(editable.toString()).toString().length() != 0) {
            z = false;
        } else {
            z = true;
        }
        View view = ((BaseFakeInput) c1402120mag.l0).LLJJLIIIJLLLLLLLZ;
        if (view != null && view.getVisibility() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("content:");
        sbLIZ.append((Object) editable);
        sbLIZ.append("   isContentEmpty ");
        sbLIZ.append(z);
        sbLIZ.append(" isSendBtnVisible ");
        sbLIZ.append(z2);
        sbLIZ.append("  ");
        C2188811AlT.LIZIZ(sbLIZ);
        ((BaseFakeInput) c1402120mag.l0).Ip(true, false, false);
        BaseFakeInput baseFakeInput = (BaseFakeInput) c1402120mag.l0;
        boolean z3 = !z;
        if (baseFakeInput.LLJJIJI != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("updateEditMaxLines hasContent = ");
            sbLIZ2.append(z3);
            C2188811AlT.LIZIZ(sbLIZ2);
            C1353500lKG c1353500lKG = baseFakeInput.LLJJIJI;
            if (c1353500lKG != null) {
                if (z3) {
                    c1353500lKG.setHint("");
                    if (!baseFakeInput.hp() && baseFakeInput.isLandscapeMode()) {
                        c1353500lKG.setMaxLines(4);
                    } else {
                        c1353500lKG.setMaxLines(1);
                    }
                } else {
                    baseFakeInput.Bp(null, false);
                    c1353500lKG.setMaxLines(1);
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("editText maxLines = ");
                sbLIZ3.append(c1353500lKG.getMaxLines());
                sbLIZ3.append(" maxHeight = ");
                sbLIZ3.append(c1353500lKG.getMaxHeight());
                C2188811AlT.LIZIZ(sbLIZ3);
            }
        }
        KeyboardVMV2 keyboardVMV2Sp = ((BaseFakeInput) c1402120mag.l0).sp();
        CommentContextSource commentContextSourceKp = ((BaseFakeInput) c1402120mag.l0).kp();
        if (commentContextSourceKp != null) {
            aweme = CommentContextSourceKt.aweme(commentContextSourceKp);
        } else {
            aweme = null;
        }
        keyboardVMV2Sp.WQ2(aweme, editable, ((BaseFakeInput) c1402120mag.l0).getInputServiceType());
    }

    public static final void afterTextChanged$2(C1402120mag c1402120mag, Editable editable) throws Throwable {
        boolean z;
        Aweme aweme;
        EnumC1346360l8k inputServiceType;
        CommentKeyboardModel keyboardModel;
        C439870HMr.LIZJ(((PortraitInputKeyboard) c1402120mag.l0).LLJJIJI, c1402120mag);
        boolean z2 = true;
        if (editable != null && !C1346830l9V.LIZ(editable)) {
            z = false;
        } else {
            z = true;
        }
        View view = ((PortraitInputKeyboard) c1402120mag.l0).LLJJLIIIJLLLLLLLZ;
        if (view == null || view.getVisibility() != 0) {
            z2 = false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("content:");
        sbLIZ.append((Object) editable);
        sbLIZ.append("   isContentEmpty ");
        sbLIZ.append(z);
        sbLIZ.append(" isSendBtnVisible ");
        sbLIZ.append(z2);
        sbLIZ.append("  ");
        C2188811AlT.LIZIZ(sbLIZ);
        KeyboardVMV2 keyboardVMV2Sp = ((PortraitInputKeyboard) c1402120mag.l0).sp();
        boolean z3 = !z;
        keyboardVMV2Sp.getClass();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("updateSendButtonStatus in VM ");
        sbLIZ2.append(z3);
        C2188811AlT.LIZIZ(sbLIZ2);
        keyboardVMV2Sp.setState(new AwS34S0010000_21(z3, 26));
        Aweme aweme2 = null;
        if (C1347610lAl.LIZIZ() && editable != null) {
            PortraitInputKeyboard portraitInputKeyboard = (PortraitInputKeyboard) c1402120mag.l0;
            C1341800l1O c1341800l1O = KeyboardVMV2.LLJJIJIL;
            CommentContextSource commentContextSourceKp = portraitInputKeyboard.kp();
            if (commentContextSourceKp != null) {
                aweme = CommentContextSourceKt.aweme(commentContextSourceKp);
            } else {
                aweme = null;
            }
            CommentContextSource commentContextSourceKp2 = portraitInputKeyboard.kp();
            if (commentContextSourceKp2 == null || (keyboardModel = commentContextSourceKp2.getKeyboardModel()) == null || (inputServiceType = keyboardModel.getInputServiceType()) == null) {
                inputServiceType = EnumC1346360l8k.COMMENT_PANEL;
            }
            c1341800l1O.getClass();
            String strLIZIZ = C1341800l1O.LIZIZ(aweme, inputServiceType);
            KeyboardVMV2 keyboardVMV2Sp2 = portraitInputKeyboard.sp();
            int length = editable.length();
            keyboardVMV2Sp2.getClass();
            keyboardVMV2Sp2.setState(new AwS10S1001000_21(strLIZIZ, length, 1));
        }
        ((PortraitInputKeyboard) c1402120mag.l0).zq();
        KeyboardVMV2 keyboardVMV2Sp3 = ((PortraitInputKeyboard) c1402120mag.l0).sp();
        CommentContextSource commentContextSourceKp3 = ((PortraitInputKeyboard) c1402120mag.l0).kp();
        if (commentContextSourceKp3 != null) {
            aweme2 = CommentContextSourceKt.aweme(commentContextSourceKp3);
        }
        keyboardVMV2Sp3.WQ2(aweme2, editable, ((PortraitInputKeyboard) c1402120mag.l0).getInputServiceType());
        if (z) {
            KeyboardVMV2 keyboardVMV2Sp4 = ((PortraitInputKeyboard) c1402120mag.l0).sp();
            keyboardVMV2Sp4.getClass();
            keyboardVMV2Sp4.setState(new AwS34S0010000_21(false, 22));
            ((PortraitInputKeyboard) c1402120mag.l0).Bp(null, false);
        }
        PortraitInputKeyboard portraitInputKeyboard2 = (PortraitInputKeyboard) c1402120mag.l0;
        C1353500lKG c1353500lKG = portraitInputKeyboard2.LLJJIJI;
        if (c1353500lKG != null) {
            HandlerHook.viewPost(c1353500lKG, new ARunnableS112S0100000_12(portraitInputKeyboard2, 153));
        }
    }

    public static final void afterTextChanged$3(C1402120mag c1402120mag, Editable editable) throws Throwable {
        boolean z;
        int length;
        KeyboardDialogFragment keyboardDialogFragment;
        InterfaceC1348870lCn interfaceC1348870lCn;
        C439870HMr.LIZJ(((KeyboardDialogFragment) c1402120mag.l0).LLIZ, c1402120mag);
        if (!TextUtils.isEmpty(editable)) {
            ((KeyboardDialogFragment) c1402120mag.l0).LLIZ.setHint("");
        }
        int length2 = editable.length();
        KeyboardDialogFragment keyboardDialogFragment2 = (KeyboardDialogFragment) c1402120mag.l0;
        if (length2 < keyboardDialogFragment2.LLLLZ) {
            z = true;
        } else {
            z = false;
        }
        if (keyboardDialogFragment2.LLIZ.getMentionSpan() == null) {
            length = 0;
        } else {
            length = ((KeyboardDialogFragment) c1402120mag.l0).LLIZ.getMentionSpan().length;
        }
        if (z) {
            int selectionEnd = ((KeyboardDialogFragment) c1402120mag.l0).LLIZ.getSelectionEnd();
            if ((editable.length() > 0 && selectionEnd > 0 && editable.charAt(selectionEnd - 1) != '@' && !((KeyboardDialogFragment) c1402120mag.l0).LLLLLZL && length == 0) || (editable.length() == 0 && !((KeyboardDialogFragment) c1402120mag.l0).LLLLLZL)) {
                InterfaceC1348870lCn interfaceC1348870lCn2 = ((KeyboardDialogFragment) c1402120mag.l0).LLLLZIL;
                if (interfaceC1348870lCn2 != null) {
                    interfaceC1348870lCn2.Ym(true);
                    ((KeyboardDialogFragment) c1402120mag.l0).il2();
                }
                ((KeyboardDialogFragment) c1402120mag.l0).LLLLLZ = false;
                return;
            }
            if (editable.length() > 0 && selectionEnd > 0 && editable.charAt(selectionEnd - 1) == '@') {
                KeyboardDialogFragment keyboardDialogFragment3 = (KeyboardDialogFragment) c1402120mag.l0;
                keyboardDialogFragment3.LLLLZI = keyboardDialogFragment3.LLIZ.getSelectionEnd();
            }
        }
        Aweme aweme = ((KeyboardDialogFragment) c1402120mag.l0).LLLIZZ;
        if (aweme != null) {
            AwemeExtKt.getAuthorUid(aweme);
        }
        C0I1T c0i1t = C0I1T.LIZ;
        int selectionStart = ((KeyboardDialogFragment) c1402120mag.l0).LLIZ.getSelectionStart();
        c0i1t.getClass();
        String strLIZJ = C0I1T.LIZJ(selectionStart, editable, true);
        if (C1348920lCs.LIZ(((KeyboardDialogFragment) c1402120mag.l0).LLIZ) && !((KeyboardDialogFragment) c1402120mag.l0).VR() && !z && strLIZJ != null && !C1351950lHl.LJIILJJIL(((KeyboardDialogFragment) c1402120mag.l0).LLIZ) && (interfaceC1348870lCn = (keyboardDialogFragment = (KeyboardDialogFragment) c1402120mag.l0).LLLLZIL) != null) {
            interfaceC1348870lCn.Vf(strLIZJ, keyboardDialogFragment.SR());
        }
        ((KeyboardDialogFragment) c1402120mag.l0).ZR();
    }

    public static final void afterTextChanged$4(C1402120mag c1402120mag, Editable editable) {
        String string;
        if (editable == null || (string = editable.toString()) == null) {
            string = "";
        }
        if (Intrinsics.LJFF(string, ((PollCreateFragment) c1402120mag.l0).VR().vQ2().LIZ)) {
            return;
        }
        CommentPollCreateViewModel commentPollCreateViewModelVR = ((PollCreateFragment) c1402120mag.l0).VR();
        commentPollCreateViewModelVR.getClass();
        commentPollCreateViewModelVR.wQ2(new AwS71S1000000_21(string, 0));
        ((PollCreateFragment) c1402120mag.l0).mS();
    }

    public static final void afterTextChanged$5(C1402120mag c1402120mag, Editable editable) {
        int lineCount;
        int iLIZIZ;
        int iLIZIZ2;
        Layout layout;
        ((RepostAddNoteInputFragment) c1402120mag.l0).OR(editable);
        RepostAddNoteInputFragment repostAddNoteInputFragment = (RepostAddNoteInputFragment) c1402120mag.l0;
        C0I7D c0i7d = repostAddNoteInputFragment.LLJILJILJ;
        if (c0i7d != null && (layout = c0i7d.getLayout()) != null) {
            lineCount = layout.getLineCount();
        } else {
            lineCount = 0;
        }
        if (repostAddNoteInputFragment.LLJILJIL != lineCount) {
            if (lineCount < 2) {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(21));
                iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(29));
            } else {
                if (lineCount < 4) {
                    iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                } else {
                    iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
                }
                iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            }
            C0I7D c0i7d2 = repostAddNoteInputFragment.LLJILJILJ;
            if (c0i7d2 != null) {
                C426750GoL.LJIIIZ(c0i7d2, null, Integer.valueOf(iLIZIZ), null, Integer.valueOf(iLIZIZ2), false, 21);
            }
            repostAddNoteInputFragment.LLJILJIL = lineCount;
        }
    }

    public static final void afterTextChanged$7(C1402120mag c1402120mag, Editable editable) {
        String string;
        if (editable != null) {
            string = editable.toString();
        } else {
            string = null;
        }
        if (string != null && string.length() != 0) {
            ShareDialogViewModel shareDialogViewModel = ((C1368970ljD) c1402120mag.l0).LLILZLL;
            if (shareDialogViewModel != null) {
                shareDialogViewModel.LLJJI.setValue(1);
            }
            ShareDialogViewModel shareDialogViewModel2 = ((C1368970ljD) c1402120mag.l0).LLILZLL;
            if (shareDialogViewModel2 != null) {
                shareDialogViewModel2.LLILLJJLI.LJJZZIII(string);
                return;
            }
            return;
        }
        ShareDialogViewModel shareDialogViewModel3 = ((C1368970ljD) c1402120mag.l0).LLILZLL;
        if (shareDialogViewModel3 != null) {
            shareDialogViewModel3.LLJJI.setValue(0);
        }
        ShareDialogViewModel shareDialogViewModel4 = ((C1368970ljD) c1402120mag.l0).LLILZLL;
        if (shareDialogViewModel4 == null) {
            return;
        }
        shareDialogViewModel4.refresh();
    }

    public static final void afterTextChanged$8(C1402120mag c1402120mag, Editable editable) {
        ((RepostInputFragment) c1402120mag.l0).em0(editable, null);
        RepostInputFragment repostInputFragment = (RepostInputFragment) c1402120mag.l0;
        C0I7D c0i7d = repostInputFragment.LLJJLIIIJLLLLLLLZ;
        if (c0i7d != null) {
            HandlerHook.viewPost(c0i7d, new ARunnableS121S0100000_21(repostInputFragment, 85));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void afterTextChanged$9(X.C1402120mag r8, android.text.Editable r9) {
        /*
            Method dump skipped, instruction units count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1402120mag.afterTextChanged$9(X.0mag, android.text.Editable):void");
    }

    public static final void beforeTextChanged$3(C1402120mag c1402120mag, CharSequence charSequence, int i, int i2, int i3) throws Throwable {
        boolean z;
        if (i3 < i2) {
            z = true;
        } else {
            z = false;
        }
        ((KeyboardDialogFragment) c1402120mag.l0).LLLLZ = charSequence.length();
        if (z) {
            KeyboardDialogFragment keyboardDialogFragment = (KeyboardDialogFragment) c1402120mag.l0;
            C1353500lKG c1353500lKG = keyboardDialogFragment.LLIZ;
            boolean z2 = keyboardDialogFragment.LLLLLZL;
            boolean z3 = keyboardDialogFragment.LLLLLZIL;
            if (c1353500lKG != null && !z2 && !z3) {
                Editable editableLLLZZ = C2204961BRm.LLLZZ(c1353500lKG, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLL0iZaKbbdaD49xe/0lmmJgVHJdzXA2WFrRFmb4Yht4PEk0SmQaDs9k/8=", null));
                if ((c1353500lKG.getSelectionEnd() == c1353500lKG.getSelectionStart() && c1353500lKG.getSelectionEnd() > 0 && editableLLLZZ.charAt(c1353500lKG.getSelectionEnd() - 1) != ' ') || c1353500lKG.getSelectionEnd() != c1353500lKG.getPrevMentionSpanEndPosition() + 1 || (c1353500lKG.getSelectionEnd() > 0 && editableLLLZZ.charAt(c1353500lKG.getSelectionEnd() - 1) != ' ')) {
                    C1353500lKG c1353500lKG2 = ((KeyboardDialogFragment) c1402120mag.l0).LLIZ;
                    String string = charSequence.subSequence(i, i2 + i).toString();
                    MentionSpan[] mentionSpan = c1353500lKG2.getMentionSpan();
                    if (mentionSpan != null) {
                        for (MentionSpan mentionSpan2 : mentionSpan) {
                            if (Intrinsics.LJFF(string, mentionSpan2.LIZIZ())) {
                                return;
                            }
                        }
                    }
                    InterfaceC1348870lCn interfaceC1348870lCn = ((KeyboardDialogFragment) c1402120mag.l0).LLLLZIL;
                    if (interfaceC1348870lCn != null) {
                        interfaceC1348870lCn.Ym(true);
                        ((KeyboardDialogFragment) c1402120mag.l0).il2();
                    }
                    KeyboardDialogFragment keyboardDialogFragment2 = (KeyboardDialogFragment) c1402120mag.l0;
                    keyboardDialogFragment2.LLLLLZ = false;
                    keyboardDialogFragment2.LLLLLZIL = false;
                    keyboardDialogFragment2.LLLLLZL = false;
                }
            }
        }
    }

    public static final void beforeTextChanged$9(C1402120mag c1402120mag, CharSequence charSequence, int i, int i2, int i3) {
        RepostMentionAssem repostMentionAssem = (RepostMentionAssem) c1402120mag.l0;
        if (repostMentionAssem.LLJILJIL) {
            return;
        }
        repostMentionAssem.LLJILLL = charSequence.length();
        if (i2 > 0) {
            ((RepostMentionAssem) c1402120mag.l0).LLJJ = charSequence.subSequence(i, i2 + i).toString();
        }
    }

    public static final void onTextChanged$0(C1402120mag c1402120mag, CharSequence charSequence, int i, int i2, int i3) {
        ImageView imageView;
        ImageView imageView2;
        ImageView imageView3;
        if (!TextUtils.isEmpty(charSequence) && (imageView3 = ((C1368810lix) c1402120mag.l0).LLJILLL) != null && imageView3.getVisibility() == 8) {
            ImageView imageView4 = ((C1368810lix) c1402120mag.l0).LLJILLL;
            if (imageView4 != null) {
                C786410Ut5.LJZI(0, imageView4);
                return;
            }
            return;
        }
        if (!TextUtils.isEmpty(charSequence) || (imageView = ((C1368810lix) c1402120mag.l0).LLJILLL) == null || imageView.getVisibility() != 0 || (imageView2 = ((C1368810lix) c1402120mag.l0).LLJILLL) == null) {
            return;
        }
        C786410Ut5.LJZI(8, imageView2);
    }

    public static final void onTextChanged$1(C1402120mag c1402120mag, CharSequence charSequence, int i, int i2, int i3) {
        CommentGroupChatPasteAssem commentGroupChatPasteAssem = (CommentGroupChatPasteAssem) c1402120mag.l0;
        commentGroupChatPasteAssem.LLJIJIL = i;
        commentGroupChatPasteAssem.LLJILJIL = i3;
    }

    public static final void onTextChanged$11(C1402120mag c1402120mag, CharSequence charSequence, int i, int i2, int i3) {
        ImageView imageView = ((ViewOnTouchListenerC1367610lh1) c1402120mag.l0).LLIZLLLIL;
        if (imageView != null) {
            if (!TextUtils.isEmpty(charSequence) && imageView.getVisibility() == 8) {
                C786410Ut5.LJZI(0, imageView);
            } else {
                if (!TextUtils.isEmpty(charSequence) || imageView.getVisibility() != 0) {
                    return;
                }
                C786410Ut5.LJZI(8, imageView);
            }
        }
    }

    public static final void onTextChanged$18(C1402120mag c1402120mag, CharSequence charSequence, int i, int i2, int i3) {
        if (i3 > 0) {
            C462450IBn.LIZIZ(charSequence, i, i3, null);
        }
    }

    public static final void onTextChanged$19(C1402120mag c1402120mag, CharSequence charSequence, int i, int i2, int i3) {
        if (i3 > 0) {
            C1353550lKL.LIZ(i, i3, charSequence);
            Pattern pattern = C462450IBn.LIZ;
            C462450IBn.LIZIZ(charSequence, i, i3, ((BaseFakeInput) c1402120mag.l0).kp());
        }
    }

    public static final void onTextChanged$2(C1402120mag c1402120mag, CharSequence charSequence, int i, int i2, int i3) {
        KeyboardVMV2 keyboardVMV2Sp = ((PortraitInputKeyboard) c1402120mag.l0).sp();
        ((PortraitInputKeyboard) c1402120mag.l0).getClass();
        keyboardVMV2Sp.getClass();
        keyboardVMV2Sp.setState(new AwS34S0010000_21(28));
        if (i3 > 0) {
            C1353550lKL.LIZ(i, i3, charSequence);
            Pattern pattern = C462450IBn.LIZ;
            C462450IBn.LIZIZ(charSequence, i, i3, ((PortraitInputKeyboard) c1402120mag.l0).kp());
        }
    }

    public static final void onTextChanged$3(C1402120mag c1402120mag, CharSequence charSequence, int i, int i2, int i3) {
        C786410Ut5.x5(((KeyboardDialogFragment) c1402120mag.l0).LLJIJIL, 1.0f);
        View view = ((KeyboardDialogFragment) c1402120mag.l0).LLLLII.LLJJJJ;
        if (view != null) {
            C786410Ut5.T4(view, 1.0f);
        }
        if (!TextUtils.isEmpty(charSequence) && i3 > 0) {
            char cCharAt = charSequence.toString().charAt((i + i3) - 1);
            Aweme aweme = ((KeyboardDialogFragment) c1402120mag.l0).LLLIZZ;
            if (aweme != null) {
                AwemeExtKt.getAuthorUid(aweme);
            }
            if (cCharAt == '@' && !((KeyboardDialogFragment) c1402120mag.l0).LLLLZLL.LJFF(new AObjectS364S0100000_21(c1402120mag, 3))) {
                if (C1348920lCs.LIZ(((KeyboardDialogFragment) c1402120mag.l0).LLIZ) && !C1351950lHl.LJIILJJIL(((KeyboardDialogFragment) c1402120mag.l0).LLIZ)) {
                    KeyboardDialogFragment keyboardDialogFragment = (KeyboardDialogFragment) c1402120mag.l0;
                    keyboardDialogFragment.LLLLLZ = true;
                    InterfaceC1348870lCn interfaceC1348870lCn = keyboardDialogFragment.LLLLZIL;
                    if (interfaceC1348870lCn != null) {
                        interfaceC1348870lCn.Sg();
                        ((KeyboardDialogFragment) c1402120mag.l0).il2();
                    }
                    KeyboardDialogFragment keyboardDialogFragment2 = (KeyboardDialogFragment) c1402120mag.l0;
                    InterfaceC1349150lDF interfaceC1349150lDF = keyboardDialogFragment2.LLLIIII;
                    if (interfaceC1349150lDF != null) {
                        if (keyboardDialogFragment2.LLLJL) {
                            ((C1348730lCZ) interfaceC1349150lDF).LJJIII("button");
                        } else {
                            ((C1348730lCZ) interfaceC1349150lDF).LJJIII("input");
                        }
                        if (((KeyboardDialogFragment) c1402120mag.l0).VR()) {
                            InterfaceC1348780lCe interfaceC1348780lCe = ((C1348730lCZ) ((KeyboardDialogFragment) c1402120mag.l0).LLLIIII).LLILZIL;
                            if (interfaceC1348780lCe != null) {
                                interfaceC1348780lCe.onEmojiToKeyboard("icon");
                            }
                            ((KeyboardDialogFragment) c1402120mag.l0).bS(0);
                            ((KeyboardDialogFragment) c1402120mag.l0).NR();
                        }
                    }
                    KeyboardDialogFragment keyboardDialogFragment3 = (KeyboardDialogFragment) c1402120mag.l0;
                    keyboardDialogFragment3.LLLJL = false;
                    keyboardDialogFragment3.LLLLZI = keyboardDialogFragment3.LLIZ.getSelectionEnd();
                } else {
                    C786410Ut5.x5(((KeyboardDialogFragment) c1402120mag.l0).LLJIJIL, 0.34f);
                    View view2 = ((KeyboardDialogFragment) c1402120mag.l0).LLLLII.LLJJJJ;
                    if (view2 != null) {
                        C786410Ut5.T4(view2, 0.34f);
                        return;
                    }
                    return;
                }
            } else {
                KeyboardDialogFragment keyboardDialogFragment4 = (KeyboardDialogFragment) c1402120mag.l0;
                C1353500lKG c1353500lKG = keyboardDialogFragment4.LLIZ;
                if (!keyboardDialogFragment4.LLLLLZ || c1353500lKG == null || c1353500lKG.getSelectionEnd() == 1 || ((KeyboardDialogFragment) c1402120mag.l0).LLIZ.getSelectionEnd() <= ((KeyboardDialogFragment) c1402120mag.l0).LLLLZI) {
                    InterfaceC1348870lCn interfaceC1348870lCn2 = ((KeyboardDialogFragment) c1402120mag.l0).LLLLZIL;
                    if (interfaceC1348870lCn2 != null) {
                        interfaceC1348870lCn2.Ym(true);
                        ((KeyboardDialogFragment) c1402120mag.l0).il2();
                    }
                    KeyboardDialogFragment keyboardDialogFragment5 = (KeyboardDialogFragment) c1402120mag.l0;
                    keyboardDialogFragment5.LLLLLZ = false;
                    keyboardDialogFragment5.LLLLLZL = false;
                    keyboardDialogFragment5.LLLLZI = -1;
                }
            }
        }
        C1353550lKL.LIZ(i, i3, charSequence);
    }

    public static final void onTextChanged$5(C1402120mag c1402120mag, CharSequence charSequence, int i, int i2, int i3) {
        if (C041J.LIZ(charSequence)) {
            RepostAddNoteInputFragment repostAddNoteInputFragment = (RepostAddNoteInputFragment) c1402120mag.l0;
            if (!repostAddNoteInputFragment.LLJJIII) {
                repostAddNoteInputFragment.LLJJIII = true;
                C20684815ws.LJIILLIIL("livesdk_repost_notes_edit", repostAddNoteInputFragment.MR(String.valueOf(charSequence)));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onTextChanged$6(X.C1402120mag r9, java.lang.CharSequence r10, int r11, int r12, int r13) {
        /*
            Method dump skipped, instruction units count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1402120mag.onTextChanged$6(X.0mag, java.lang.CharSequence, int, int, int):void");
    }

    public static final void onTextChanged$7(C1402120mag c1402120mag, CharSequence charSequence, int i, int i2, int i3) {
        if (!TextUtils.isEmpty(charSequence) && ((C1368970ljD) c1402120mag.l0).LLILZIL.getVisibility() == 8) {
            C786410Ut5.LJZI(0, ((C1368970ljD) c1402120mag.l0).LLILZIL);
        } else {
            if (!TextUtils.isEmpty(charSequence) || ((C1368970ljD) c1402120mag.l0).LLILZIL.getVisibility() != 0) {
                return;
            }
            C786410Ut5.LJZI(8, ((C1368970ljD) c1402120mag.l0).LLILZIL);
        }
    }

    public static final void onTextChanged$9(C1402120mag c1402120mag, CharSequence charSequence, int i, int i2, int i3) {
        boolean z;
        if (((RepostMentionAssem) c1402120mag.l0).LLJILJIL) {
            return;
        }
        if (i3 >= i2 && charSequence.length() > 0 && i3 > 0) {
            int i4 = i3 + i;
            int i5 = i4 - 1;
            if (charSequence.toString().charAt(i5) == '@' && !C20612915lH.LIZIZ.LJIIIIZZ().LJFF(new AwS591S0100000_12((RepostMentionAssem) c1402120mag.l0, 650))) {
                z = true;
            } else {
                z = false;
            }
            String strSubstring = "";
            if (z) {
                ((RepostMentionAssem) c1402120mag.l0).Lo(i5);
                InterfaceC1356670lPN interfaceC1356670lPN = ((RepostMentionAssem) c1402120mag.l0).LLJIJIL;
                if (interfaceC1356670lPN != null) {
                    interfaceC1356670lPN.Ml("", null, false);
                    return;
                }
                return;
            }
            ((RepostMentionAssem) c1402120mag.l0).getClass();
            if (i4 >= 2) {
                boolean zLJFF = Intrinsics.LJFF(charSequence.toString().substring(i4 - 2, i4), "  ");
                boolean zLJFF2 = Intrinsics.LJFF(charSequence.toString().substring(i5, i4), "\n");
                if (zLJFF || zLJFF2) {
                    ((RepostMentionAssem) c1402120mag.l0).Ym(true);
                    return;
                }
            }
            RepostMentionAssem repostMentionAssem = (RepostMentionAssem) c1402120mag.l0;
            int i6 = repostMentionAssem.LLJILJILJ;
            if (i > i6 && i6 != -1) {
                if (i6 >= 0) {
                    strSubstring = charSequence.toString().substring(repostMentionAssem.LLJILJILJ + 1, i4);
                }
                if (a0.LJLIIIL(strSubstring).toString().length() <= 0) {
                    return;
                }
                RepostMentionAssem repostMentionAssem2 = (RepostMentionAssem) c1402120mag.l0;
                repostMentionAssem2.Lo(repostMentionAssem2.LLJILJILJ);
                InterfaceC1356670lPN interfaceC1356670lPN2 = ((RepostMentionAssem) c1402120mag.l0).LLJIJIL;
                if (interfaceC1356670lPN2 == null) {
                    return;
                }
                interfaceC1356670lPN2.Ml(strSubstring, null, false);
                return;
            }
            repostMentionAssem.Ym(true);
            return;
        }
        if (charSequence.length() != 0) {
            return;
        }
        ((RepostMentionAssem) c1402120mag.l0).Ym(true);
    }
}
