package X;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import com.bytedance.android.livesdk.chatroom.model.InputAttrs;
import com.bytedance.android.livesdk.chatroom.ui.LiveEmojiInputDialogFragment;
import com.bytedance.android.livesdk.performance.emote.EmoteFixTextHelper;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0f7V, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1114950f7V implements TextWatcher {
    public int LL = -1;
    public int LLILLJJLI = -1;
    public boolean LLILLL;
    public boolean LLILZ;
    public final /* synthetic */ LiveEmojiInputDialogFragment LLILZIL;

    public C1114950f7V(LiveEmojiInputDialogFragment liveEmojiInputDialogFragment) {
        this.LLILZIL = liveEmojiInputDialogFragment;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(final Editable editable) {
        InterfaceC1115130f7n interfaceC1115130f7n;
        LiveEmojiInputDialogFragment liveEmojiInputDialogFragment = this.LLILZIL;
        if (liveEmojiInputDialogFragment.LLILLJJLI && liveEmojiInputDialogFragment.LLJLILLLLZIIL != null) {
            liveEmojiInputDialogFragment.LLJJIJI = editable.toString();
            boolean zIsEmpty = TextUtils.isEmpty(this.LLILZIL.LLJJIJI);
            LiveEmojiInputDialogFragment liveEmojiInputDialogFragment2 = this.LLILZIL;
            InterfaceC1115130f7n interfaceC1115130f7n2 = liveEmojiInputDialogFragment2.LLILZ;
            if (interfaceC1115130f7n2 != null && !liveEmojiInputDialogFragment2.LLLLII) {
                interfaceC1115130f7n2.Mc();
            }
            if (zIsEmpty) {
                C786410Ut5.LLIL(this.LLILZIL.LLJLLIL, 0);
                LiveEmojiInputDialogFragment liveEmojiInputDialogFragment3 = this.LLILZIL;
                C786410Ut5.LLJJJJ(liveEmojiInputDialogFragment3.LLJLL, 8);
                liveEmojiInputDialogFragment3.LLJLL.setText("");
                this.LLILZIL.LLJLIL.setClickable(false);
            } else {
                InputAttrs inputAttrsOR = this.LLILZIL.OR();
                if (inputAttrsOR != null && !TextUtils.isEmpty(inputAttrsOR.replyInfo.replyUserName)) {
                    C19656111vL[] c19656111vLArr = (C19656111vL[]) editable.getSpans(0, editable.length(), C19656111vL.class);
                    if (c19656111vLArr.length == 0) {
                        LiveEmojiInputDialogFragment liveEmojiInputDialogFragment4 = this.LLILZIL;
                        C786410Ut5.LLJJJJ(liveEmojiInputDialogFragment4.LLJLL, 8);
                        liveEmojiInputDialogFragment4.LLJLL.setText("");
                    } else {
                        C19656111vL c19656111vL = c19656111vLArr[0];
                        int spanStart = editable.getSpanStart(c19656111vL);
                        if (spanStart < 0 || editable.charAt(spanStart) != '@') {
                            editable.removeSpan(c19656111vL);
                            LiveEmojiInputDialogFragment liveEmojiInputDialogFragment5 = this.LLILZIL;
                            C786410Ut5.LLJJJJ(liveEmojiInputDialogFragment5.LLJLL, 8);
                            liveEmojiInputDialogFragment5.LLJLL.setText("");
                        }
                    }
                }
                C786410Ut5.LLIL(this.LLILZIL.LLJLLIL, 8);
                LiveEmojiInputDialogFragment liveEmojiInputDialogFragment6 = this.LLILZIL;
                if (!liveEmojiInputDialogFragment6.LLLL && (interfaceC1115130f7n = liveEmojiInputDialogFragment6.LLILZ) != null) {
                    liveEmojiInputDialogFragment6.LLLL = true;
                    interfaceC1115130f7n.Oc();
                }
                this.LLILZIL.LLJLIL.setClickable(true);
            }
            this.LLILZIL.yS(zIsEmpty);
            getClass();
            LiveEmojiInputDialogFragment liveEmojiInputDialogFragment7 = this.LLILZIL;
            if (liveEmojiInputDialogFragment7.LLLLII) {
                return;
            }
            int i = this.LLILLJJLI;
            if (i > 3) {
                String str = liveEmojiInputDialogFragment7.LLJJIJI;
                int i2 = this.LL;
                String strSubstring = str.substring(i2, i + i2);
                C1115360f8A c1115360f8A = C1115380f8C.LIZ;
                C1115380f8C.LIZLLL(new SpannableStringBuilder(strSubstring), this.LLILZIL.LLJLILLLLZIIL.getResources(), this.LLILZIL, new Function2<SpannableStringBuilder, Boolean, Unit>() { // from class: X.0f7a
                    public final int LL;
                    public final int LLILLJJLI;

                    {
                        this.LL = this.LLILZ.LL;
                        this.LLILLJJLI = this.LLILZ.LLILLJJLI;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Unit invoke(SpannableStringBuilder spannableStringBuilder, Boolean bool) {
                        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
                        this.LLILZ.LLILZIL.LLLLII = true;
                        if (bool.booleanValue()) {
                            Editable editable2 = editable;
                            int i3 = this.LL;
                            editable2.replace(i3, this.LLILLJJLI + i3, spannableStringBuilder2);
                        } else if (C2204961BRm.LLLII(this.LLILZ.LLILZIL.LLJLILLLLZIIL, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6CJOQQvvt2bwKJpt48Bsjs7az/ZL2ydhh9gYMnahKWvCbL932kzwGA==", null)) instanceof SpannableStringBuilder) {
                            C1115360f8A c1115360f8A2 = C1115380f8C.LIZ;
                            C1115380f8C.LIZLLL((SpannableStringBuilder) C2204961BRm.LLLII(this.LLILZ.LLILZIL.LLJLILLLLZIIL, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6CJOQQvvt2bwKJpt48Bsjs7az/ZL2ydhh9gYMnahKWvCbL932kzwGA==", null)), this.LLILZ.LLILZIL.LLJLILLLLZIIL.getResources(), this.LLILZ.LLILZIL, null);
                        }
                        this.LLILZ.LLILZIL.LLLLII = false;
                        return Unit.LIZ;
                    }
                });
            }
            int iLJI = this.LLILZIL.LLLI.LJI(editable, new ArrayList());
            this.LLILZIL.getClass();
            if (iLJI > 100 && !this.LLILZIL.LLLILZJ.booleanValue()) {
                this.LLILLL = false;
                C766270U4b.LJIIJJI(this.LLILZIL.getString(2131841268));
                try {
                    EmoteFixTextHelper emoteFixTextHelper = this.LLILZIL.LLLI;
                    int i3 = emoteFixTextHelper.recordInputIndex;
                    C416610GVf[] c416610GVfArr = (C416610GVf[]) editable.getSpans(i3, emoteFixTextHelper.recordLength + i3, C416610GVf.class);
                    this.LLILZIL.getClass();
                    int i4 = iLJI - 100;
                    EmoteFixTextHelper emoteFixTextHelper2 = this.LLILZIL.LLLI;
                    int i5 = emoteFixTextHelper2.recordInputIndex;
                    int i6 = emoteFixTextHelper2.recordLength;
                    int i7 = i5 + i6;
                    if (c416610GVfArr.length == 0) {
                        int i8 = i7 - i4;
                        editable.delete(i8, i7);
                        this.LLILZIL.LLJLILLLLZIIL.setSelection(i8);
                        return;
                    }
                    for (C416610GVf c416610GVf : c416610GVfArr) {
                        i6 += c416610GVf.LLILZIL;
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(editable.subSequence(this.LLILZIL.LLLI.recordInputIndex, i7));
                    if (!this.LLILZ) {
                        this.LLILZ = true;
                        int i9 = this.LLILZIL.LLLI.recordInputIndex;
                        C1115360f8A c1115360f8A2 = C1115380f8C.LIZ;
                        editable.replace(i9, i7, C1115380f8C.LIZ(i6 - i4, spannableStringBuilder));
                        this.LLILZ = false;
                        return;
                    }
                    return;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    HashMap map = new HashMap();
                    map.put("error", e.getMessage());
                    C1CC2.LJII(1, "ttlive_emoji_fragment_error", map);
                    return;
                }
            }
            this.LLILZIL.getClass();
            if (this.LLILLL) {
                this.LLILLL = false;
                int i10 = this.LL;
                if (i10 < this.LLILLJJLI + i10 && this.LLILZIL.LLJJIJI.length() >= this.LL + this.LLILLJJLI) {
                    int length = editable.length();
                    int i11 = this.LL;
                    int i12 = this.LLILLJJLI + i11;
                    if (length >= i12) {
                        String strReplace = this.LLILZIL.LLJJIJI.substring(i11, i12).replace((char) 65532, ' ');
                        int i13 = this.LL;
                        editable.replace(i13, this.LLILLJJLI + i13, strReplace);
                    }
                }
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (this.LLILZIL.LLLLII) {
            return;
        }
        this.LLILLJJLI = 0;
        this.LL = 0;
        this.LLILLL = false;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        LiveEmojiInputDialogFragment liveEmojiInputDialogFragment = this.LLILZIL;
        if (!liveEmojiInputDialogFragment.LLLLII && liveEmojiInputDialogFragment.LLILLJJLI) {
            if (i2 != 0) {
                liveEmojiInputDialogFragment.LLLI.LIZLLL(i, i2 + i);
            }
            if (i3 != 0) {
                EmoteFixTextHelper emoteFixTextHelper = this.LLILZIL.LLLI;
                emoteFixTextHelper.recordInputIndex = i;
                emoteFixTextHelper.recordLength = i3;
                for (int i4 = i; i4 < i + i3; i4++) {
                    if (charSequence.charAt(i4) != 65532 || this.LLILZIL.LLLLIIIILLL) {
                        this.LLILZIL.LLLI.LIZJ(i4, charSequence.subSequence(i4, i4 + 1));
                    }
                }
            }
            this.LLILZIL.getClass();
            if (i3 != 0) {
                int i5 = i;
                while (true) {
                    if (i5 >= i + i3) {
                        break;
                    }
                    if (charSequence.charAt(i5) == 65532) {
                        this.LLILLL = true;
                        break;
                    }
                    i5++;
                }
                this.LL = i;
                this.LLILLJJLI = i3;
            }
            this.LLILZIL.LLLLIIIILLL = true;
        }
    }
}
