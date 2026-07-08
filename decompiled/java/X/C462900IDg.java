package X;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.text.style.CharacterStyle;
import android.text.style.ForegroundColorSpan;
import android.widget.EditText;
import android.widget.ImageView;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.chatroom.GroupChatroomInputAssem;
import com.ss.android.ugc.aweme.favorites.business.video.FavoriteVideoTabRootFragment;
import com.ss.android.ugc.aweme.im.ai.impl.bot.chat.BotChatroomInputAssem;
import com.ss.android.ugc.aweme.im.b2c.input.BusinessSingleChatroomInputAssem;
import com.ss.android.ugc.aweme.im.chatroom.input.components.inputfield.InputFieldAssem;
import com.ss.android.ugc.aweme.im.messagelist.api.select.IMSelectTextAbility;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.sendmsg.SendMessageVM;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.singlechat.SingleChatroomInputAssem;
import com.ss.android.ugc.aweme.internalshare.impl.refactor.assem.MentionEditDelegate;
import com.ss.android.ugc.aweme.internalshare.impl.refactor.assem.SharePanelEditRootAssem;
import com.ss.android.ugc.aweme.internalshare.impl.refactor.vm.ShareContactListViewModel;
import com.ss.android.ugc.aweme.mention.ui.assem.VideoCaptionMentionHeaderAssem;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS57S1000000_6;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0IDg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C462900IDg implements TextWatcher {
    public final int $t;
    public Object l0;

    public static final void afterTextChanged$0(C462900IDg c462900IDg, Editable editable) {
    }

    public static final void afterTextChanged$3(C462900IDg c462900IDg, Editable editable) {
    }

    public static final void afterTextChanged$8(C462900IDg c462900IDg, Editable editable) {
    }

    public static final void beforeTextChanged$0(C462900IDg c462900IDg, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$1(C462900IDg c462900IDg, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$10(C462900IDg c462900IDg, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$11(C462900IDg c462900IDg, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$12(C462900IDg c462900IDg, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$2(C462900IDg c462900IDg, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$3(C462900IDg c462900IDg, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$5(C462900IDg c462900IDg, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$6(C462900IDg c462900IDg, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$7(C462900IDg c462900IDg, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$8(C462900IDg c462900IDg, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$9(C462900IDg c462900IDg, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$1(C462900IDg c462900IDg, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$10(C462900IDg c462900IDg, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$11(C462900IDg c462900IDg, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$12(C462900IDg c462900IDg, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$2(C462900IDg c462900IDg, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$5(C462900IDg c462900IDg, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$6(C462900IDg c462900IDg, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$7(C462900IDg c462900IDg, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$9(C462900IDg c462900IDg, CharSequence charSequence, int i, int i2, int i3) {
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
        }
    }

    public C462900IDg(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void afterTextChanged$1(C462900IDg c462900IDg, Editable editable) {
        Editable editableLLJILLL;
        String string;
        String string2;
        if (editable != null && editable.length() > 0 && C1244080iTm.LJ(editable.charAt(0))) {
            int i = 0;
            while (i < editable.length() && C1244080iTm.LJ(editable.charAt(i))) {
                i++;
            }
            editable.delete(0, i);
            ((FavoriteVideoTabRootFragment) c462900IDg.l0).nS();
            ((FavoriteVideoTabRootFragment) c462900IDg.l0).oS();
            return;
        }
        ((FavoriteVideoTabRootFragment) c462900IDg.l0).nS();
        ((FavoriteVideoTabRootFragment) c462900IDg.l0).oS();
        if (((FavoriteVideoTabRootFragment) c462900IDg.l0).RR() == EnumC444370Hbf.LLILLL) {
            EditText editText = ((FavoriteVideoTabRootFragment) c462900IDg.l0).LLJJ;
            if (editText == null || (editableLLJILLL = C2204961BRm.LLJILLL(editText, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOypdZDc1SYJh7FSwtQaJ5OuoLljF4g5HQ2LdpTNkqjr60Yj3qWMNNfUm2yxSpbMLdHABFv8", null))) == null || (string = editableLLJILLL.toString()) == null || (string2 = a0.LJLIIIL(string).toString()) == null || string2.length() == 0) {
                ((FavoriteVideoTabRootFragment) c462900IDg.l0).getChildFragmentManager().LJLLILLLL();
            }
        }
    }

    public static final void afterTextChanged$10(C462900IDg c462900IDg, Editable editable) {
        ImageView imageView = ((C430780Guq) c462900IDg.l0).LLILLJJLI;
        int i = 0;
        if (String.valueOf(editable).length() <= 0) {
            i = 8;
        }
        C786410Ut5.LJZI(i, imageView);
    }

    public static final void afterTextChanged$11(C462900IDg c462900IDg, Editable editable) {
        if (editable != null) {
            AssemVMLazy assemVMLazy = ((GroupChatroomInputAssem) c462900IDg.l0).LLLFF;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = GroupChatroomInputAssem.LLLILZ;
            ((SendMessageVM) assemVMLazy.getValue()).vQ2(editable);
        }
    }

    public static final void afterTextChanged$12(C462900IDg c462900IDg, Editable editable) {
        if (editable != null) {
            AssemVMLazy assemVMLazy = ((BotChatroomInputAssem) c462900IDg.l0).LLL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = BotChatroomInputAssem.LLLI;
            ((SendMessageVM) assemVMLazy.getValue()).vQ2(editable);
        }
    }

    public static final void afterTextChanged$2(C462900IDg c462900IDg, Editable editable) {
        ((InputFieldAssem) c462900IDg.l0).hp(editable);
        IMSelectTextAbility iMSelectTextAbility = (IMSelectTextAbility) C1558520qew.LIZ(C1558520qew.LJIIL((InputFieldAssem) c462900IDg.l0), IMSelectTextAbility.class, null);
        if (iMSelectTextAbility != null) {
            iMSelectTextAbility.dl0(C0ZLS.INPUT_TEXT_CHANGED);
        }
    }

    public static final void afterTextChanged$4(C462900IDg c462900IDg, Editable editable) throws Throwable {
        Editable editableLLZLLLL = C2204961BRm.LLZLLLL(((MentionEditDelegate) c462900IDg.l0).LL, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOOmd5rc0jMHFXdoZ37v3DmEameeeqwtSByH8R1mZSA2maOLSyns0fjRIASfyJejEtOiVigs", null));
        if (editableLLZLLLL == null) {
            return;
        }
        ((MentionEditDelegate) c462900IDg.l0).LLILLJJLI.wQ2(new C0I1A(C0I1I.LIZ(((MentionEditDelegate) c462900IDg.l0).LL.getSelectionStart(), editableLLZLLLL)));
    }

    public static final void afterTextChanged$5(C462900IDg c462900IDg, Editable editable) {
        String string = a0.LJLIIIL(editable.toString()).toString();
        AssemVMLazy assemVMLazy = ((VideoCaptionMentionHeaderAssem) c462900IDg.l0).LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = VideoCaptionMentionHeaderAssem.LLJIJIL;
        assemVMLazy.getValue().setState(new AwS57S1000000_6(string, 5));
    }

    public static final void afterTextChanged$6(C462900IDg c462900IDg, Editable editable) {
        String string;
        ShareContactListViewModel shareContactListViewModelHo = ((SharePanelEditRootAssem) c462900IDg.l0).Ho();
        if (editable == null || (string = editable.toString()) == null) {
            string = "";
        }
        shareContactListViewModelHo.setState(new AwS57S1000000_6(string, 9));
    }

    public static final void afterTextChanged$7(C462900IDg c462900IDg, Editable editable) {
        if (editable != null) {
            AssemVMLazy assemVMLazy = ((SingleChatroomInputAssem) c462900IDg.l0).LLL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = SingleChatroomInputAssem.LLLILZLLLI;
            ((SendMessageVM) assemVMLazy.getValue()).vQ2(editable);
        }
    }

    public static final void afterTextChanged$9(C462900IDg c462900IDg, Editable editable) {
        if (editable != null) {
            AssemVMLazy assemVMLazy = ((BusinessSingleChatroomInputAssem) c462900IDg.l0).LLLFFI;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = BusinessSingleChatroomInputAssem.LLLILZJ;
            ((SendMessageVM) assemVMLazy.getValue()).vQ2(editable);
        }
    }

    public static final void beforeTextChanged$4(C462900IDg c462900IDg, CharSequence charSequence, int i, int i2, int i3) {
        if (i2 > 0 && i3 >= 0 && (charSequence instanceof SpannableStringBuilder)) {
            int i4 = i2 + i;
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            int length = spannableStringBuilder.length();
            if (i4 > length) {
                i4 = length;
            }
            if (i >= 0 && i < i4) {
                C0I1K[] c0i1kArr = (C0I1K[]) spannableStringBuilder.getSpans(i, i4, C0I1K.class);
                if (c0i1kArr != null && c0i1kArr.length != 0) {
                    MentionEditDelegate mentionEditDelegate = (MentionEditDelegate) c462900IDg.l0;
                    for (C0I1K c0i1k : c0i1kArr) {
                        String str = c0i1k.LIZIZ;
                        if (str != null) {
                            mentionEditDelegate.LLILLJJLI.wQ2(new C0I1C(str));
                        }
                        spannableStringBuilder.removeSpan(c0i1k);
                    }
                }
                CharacterStyle[] characterStyleArr = (CharacterStyle[]) spannableStringBuilder.getSpans(i, i4, CharacterStyle.class);
                if (characterStyleArr != null) {
                    for (CharacterStyle characterStyle : characterStyleArr) {
                        spannableStringBuilder.removeSpan(characterStyle);
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0008  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onTextChanged$0(X.C462900IDg r4, java.lang.CharSequence r5, int r6, int r7, int r8) {
        /*
            if (r5 == 0) goto L8
            java.lang.String r3 = r5.toString()     // Catch: java.lang.Exception -> L3e
            if (r3 != 0) goto La
        L8:
            java.lang.String r3 = ""
        La:
            java.lang.Object r0 = r4.l0     // Catch: java.lang.Exception -> L3e
            com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.TypingStickerRecommendAssem r0 = (com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.TypingStickerRecommendAssem) r0     // Catch: java.lang.Exception -> L3e
            X.01GW r0 = r0.LLJJJIL     // Catch: java.lang.Exception -> L3e
            java.lang.Object r2 = r0.getValue()     // Catch: java.lang.Exception -> L3e
            com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.KeyboardVMV2 r2 = (com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.KeyboardVMV2) r2     // Catch: java.lang.Exception -> L3e
            boolean r0 = r2.LLJJI     // Catch: java.lang.Exception -> L3e
            r1 = 0
            if (r0 == 0) goto L32
            r0 = 1
            r2.LLJJ = r0     // Catch: java.lang.Exception -> L3e
            r2.LLJJI = r1     // Catch: java.lang.Exception -> L3e
        L20:
            r2.LLJJIII = r3     // Catch: java.lang.Exception -> L3e
            java.lang.Object r0 = r4.l0     // Catch: java.lang.Exception -> L3e
            com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.TypingStickerRecommendAssem r0 = (com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.TypingStickerRecommendAssem) r0     // Catch: java.lang.Exception -> L3e
            X.01GW r0 = r0.LLJJJJJIL     // Catch: java.lang.Exception -> L3e
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Exception -> L3e
            X.0HoQ r0 = (X.C452280HoQ) r0     // Catch: java.lang.Exception -> L3e
            r0.LIZLLL(r3)     // Catch: java.lang.Exception -> L3e
            goto L3d
        L32:
            java.lang.String r0 = r2.LLJJIII     // Catch: java.lang.Exception -> L3e
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r3, r0)     // Catch: java.lang.Exception -> L3e
            if (r0 != 0) goto L20
            r2.LLJJ = r1     // Catch: java.lang.Exception -> L3e
            goto L20
        L3d:
            return
        L3e:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            java.lang.String r0 = "crash from typing recommendation flow"
            X.C1AF0.LJFF(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C462900IDg.onTextChanged$0(X.0IDg, java.lang.CharSequence, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0081 A[Catch: Exception -> 0x00f2, TryCatch #0 {Exception -> 0x00f2, blocks: (B:2:0x0000, B:8:0x0016, B:10:0x0024, B:12:0x002c, B:22:0x007b, B:24:0x0081, B:26:0x0089, B:28:0x0095, B:30:0x0099, B:33:0x00a1, B:37:0x00c8, B:39:0x00ce, B:41:0x00d8, B:13:0x0035, B:15:0x003e, B:17:0x0044, B:19:0x005a, B:21:0x0074, B:44:0x00de, B:46:0x00e4, B:48:0x00ee), top: B:53:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onTextChanged$3(X.C462900IDg r5, java.lang.CharSequence r6, int r7, int r8, int r9) {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C462900IDg.onTextChanged$3(X.0IDg, java.lang.CharSequence, int, int, int):void");
    }

    public static final void onTextChanged$4(C462900IDg c462900IDg, CharSequence charSequence, int i, int i2, int i3) {
        int i4;
        if (charSequence != null && charSequence.length() != 0 && i3 > 0 && (i4 = (i + i3) - 1) >= 0 && i4 < charSequence.length() && charSequence.charAt(i4) == '@') {
            ((MentionEditDelegate) c462900IDg.l0).LLILLJJLI.wQ2(C0I1H.LIZ);
        }
    }

    public static final void onTextChanged$8(C462900IDg c462900IDg, CharSequence charSequence, int i, int i2, int i3) {
        boolean z;
        ForegroundColorSpan foregroundColorSpan;
        int length = String.valueOf(charSequence).length();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(length);
        sbLIZ.append("/200");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        boolean z2 = false;
        if (length > 200) {
            int length2 = String.valueOf(length).length();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strLIZIZ);
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zs, ((C0J9N) c462900IDg.l0).LLJILJIL);
            if (numLIZJ != null) {
                foregroundColorSpan = new ForegroundColorSpan(numLIZJ.intValue());
            } else {
                foregroundColorSpan = null;
            }
            C786410Ut5.q2(spannableStringBuilder, foregroundColorSpan, 0, length2, 33);
            C16F5 c16f5 = ((C0J9N) c462900IDg.l0).LLJJIII;
            if (c16f5 != null) {
                c16f5.setText(spannableStringBuilder);
            }
            C16FS c16fs = ((C0J9N) c462900IDg.l0).LLJJIJI;
            if (c16fs != null) {
                c16fs.setEnabled(false);
                c16fs.setClickable(false);
                return;
            }
            return;
        }
        C16F5 c16f52 = ((C0J9N) c462900IDg.l0).LLJJIII;
        if (c16f52 != null) {
            c16f52.setText(strLIZIZ);
        }
        C16FS c16fs2 = ((C0J9N) c462900IDg.l0).LLJJIJI;
        if (c16fs2 == null) {
            return;
        }
        if (length > 0) {
            z = true;
        } else {
            z = false;
        }
        c16fs2.setEnabled(z);
        if (length > 0) {
            z2 = true;
        }
        c16fs2.setClickable(z2);
    }
}
