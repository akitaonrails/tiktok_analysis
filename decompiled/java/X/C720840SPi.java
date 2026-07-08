package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.challenge.service.ICommerceChallengeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS660S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0SPi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C720840SPi extends C1355730lNr {
    public boolean LLJJJJ;
    public Aweme LLJJJJJIL;
    public C0SQ1 LLJJJJLIIL;
    public Integer LLJJL;
    public Integer LLJJLIIIJLLLLLLLZ;
    public int LLJL;
    public Function0<Unit> LLJLIL;

    public static boolean LJJJJL(char c) {
        if (c != 0 && c != '\t' && c != '\n' && c != '\r') {
            if (' ' > c) {
                return true;
            }
            if (c >= 55296) {
                if (57344 > c) {
                    return true;
                }
                if (c >= 65534 && (0 > c || c >= 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final SpannableStringBuilder getEndText() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "...");
        Aweme aweme = this.LLJJJJJIL;
        if (aweme != null) {
            spannableStringBuilder.append((CharSequence) LJJJJJ(aweme));
        }
        return spannableStringBuilder;
    }

    public final Integer getExtraBackgroundSpanColor() {
        return this.LLJJL;
    }

    public final int getMaxLinesWhenFold() {
        return this.LLJL;
    }

    public final boolean getShowingEllipsize() {
        return this.LLJJJJ;
    }

    public final Function0<Unit> getSpanClickInterceptor() {
        return this.LLJLIL;
    }

    public final Integer getTextColor() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    private final void setBoldText(List<? extends TextExtraStruct> list) {
        SpannableString spannableString = new SpannableString(getText());
        if (list != null && !list.isEmpty() && !TextUtils.isEmpty(spannableString.toString())) {
            int length = spannableString.length();
            for (TextExtraStruct textExtraStruct : list) {
                if (textExtraStruct.getStart() <= textExtraStruct.getEnd() && textExtraStruct.getStart() <= length && textExtraStruct.getEnd() >= 0) {
                    int start = textExtraStruct.getStart();
                    if (start < 0) {
                        start = 0;
                    }
                    int end = textExtraStruct.getEnd();
                    if (end > length) {
                        end = length;
                    }
                    if (end > start && (textExtraStruct.getType() == 0 || textExtraStruct.getType() == 1)) {
                        C786410Ut5.p2(spannableString, new C444920HcY(12, true), start, end, 33);
                    }
                }
            }
            setText(spannableString);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.text.SpannableStringBuilder LJJJJJ(com.ss.android.ugc.aweme.feed.model.Aweme r9) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C720840SPi.LJJJJJ(com.ss.android.ugc.aweme.feed.model.Aweme):android.text.SpannableStringBuilder");
    }

    public final void setExtraBackgroundSpanColor(Integer num) {
        this.LLJJL = num;
    }

    public final void setMaxLinesWhenFold(int i) {
        this.LLJL = i;
    }

    public final void setShowingEllipsize(boolean z) {
        this.LLJJJJ = z;
    }

    public final void setSpanClickInterceptor(Function0<Unit> function0) {
        this.LLJLIL = function0;
    }

    public final void setTextColor(Integer num) {
        this.LLJJLIIIJLLLLLLLZ = num;
    }

    public C720840SPi(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLJL = 2;
    }

    public final void LJJJJLI(int i, CharSequence charSequence, boolean z) {
        String descLanguage;
        try {
            Aweme aweme = this.LLJJJJJIL;
            if (aweme != null) {
                descLanguage = aweme.getDescLanguage();
            } else {
                descLanguage = null;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setDescSafely desc: ");
            sbLIZ.append((Object) charSequence);
            C2188811AlT.LIZIZ(sbLIZ);
            LJJJJ(charSequence, descLanguage);
            LJJJJLL(i, this.LLJJJJJIL, Boolean.valueOf(z));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2344809Gs.LIZ(e);
        }
    }

    public final void LJJJJLL(final int i, Aweme aweme, final Boolean bool) {
        String str;
        int iIntValue;
        int length;
        int length2;
        int iIntValue2;
        float f;
        String str2;
        String aid;
        String authorUid;
        String desc;
        String desc2;
        if (aweme == null) {
            return;
        }
        if (!AwemeExtKt.isScheduleVideo(aweme)) {
            LJJJJIZL(aweme.getTextExtra(), new C0SQF() { // from class: X.0SPj
                @Override // X.C0SQF
                public final boolean LIZ(TextExtraStruct textExtraStruct) {
                    if (textExtraStruct == null) {
                        return false;
                    }
                    if (textExtraStruct.getType() != 0 && textExtraStruct.getType() != 1 && textExtraStruct.getType() != 3) {
                        return false;
                    }
                    return true;
                }
            }, new C0SQF() { // from class: X.0SPh
                @Override // X.C0SQF
                public final boolean LIZ(TextExtraStruct textExtraStruct) {
                    if (!C11VF.LIZIZ.LIZLLL(textExtraStruct)) {
                        if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
                            if (textExtraStruct.getStart() > i || textExtraStruct.getEnd() > i) {
                                return true;
                            }
                            return false;
                        }
                        return false;
                    }
                    return true;
                }
            });
        }
        ICommerceChallengeService iCommerceChallengeService = (ICommerceChallengeService) ServiceManager.get().getService(ICommerceChallengeService.class);
        int textSize = (int) getTextSize();
        C0SQ1 c0sq1 = this.LLJJJJLIIL;
        if (c0sq1 != null) {
            str = c0sq1.LIZIZ;
        } else {
            str = null;
        }
        iCommerceChallengeService.LJIIJJI(textSize, aweme, str, new AwS660S0100000_11(this, 6));
        if (aweme.getTextExtra() != null && !TextUtils.isEmpty(aweme.getDesc())) {
            for (TextExtraStruct textExtraStruct : aweme.getTextExtra()) {
                int end = textExtraStruct.getEnd();
                Boolean bool2 = Boolean.TRUE;
                if (!Intrinsics.LJFF(bool, bool2) || textExtraStruct.getStart() < i) {
                    if (Intrinsics.LJFF(bool, bool2) && textExtraStruct.getStart() < i && textExtraStruct.getEnd() > i) {
                        end = i;
                    }
                    if (textExtraStruct.getStart() >= 0 && textExtraStruct.getEnd() >= 0) {
                        int end2 = textExtraStruct.getEnd();
                        Aweme aweme2 = this.LLJJJJJIL;
                        if (aweme2 != null && (desc2 = aweme2.getDesc()) != null) {
                            length = desc2.length();
                        } else {
                            length = 0;
                        }
                        if (end2 <= length) {
                            int start = textExtraStruct.getStart();
                            Aweme aweme3 = this.LLJJJJJIL;
                            if (aweme3 != null && (desc = aweme3.getDesc()) != null) {
                                length2 = desc.length();
                            } else {
                                length2 = 0;
                            }
                            if (start < length2 && textExtraStruct.getStart() < textExtraStruct.getEnd() && ((textExtraStruct.getType() == 0 && ((!TextUtils.isEmpty(textExtraStruct.getAwemeId()) || 2 == textExtraStruct.getSubtype()) && aweme.getDesc().charAt(textExtraStruct.getStart()) == '@')) || C11VF.LIZIZ.LJ(textExtraStruct))) {
                                Integer num = this.LLJJL;
                                if (num != null) {
                                    iIntValue2 = num.intValue();
                                } else {
                                    iIntValue2 = 0;
                                }
                                C428830Grh c428830Grh = new C428830Grh(getContext(), C814420VxA.LIZIZ(C12ES.LJIIJ(getContext()) - (C12ES.LIZJ(100.0f, getContext()) + getContext().getResources().getDimension(R.dimen.p8))), iIntValue2, C960203pA.LIZ(R.attr.ee, getContext()), textExtraStruct, false, null, true, C722510SVt.LIZJ(), null, 1632);
                                Context context = getContext();
                                if (C722510SVt.LIZJ()) {
                                    f = 4.0f;
                                } else {
                                    f = 12.0f;
                                }
                                c428830Grh.LLJILLL = C12ES.LIZJ(f, context);
                                c428830Grh.LLJJ = C12ES.LIZJ(2.0f, getContext());
                                c428830Grh.LLJILJIL = C12ES.LIZJ(14.0f, getContext());
                                LJJJJI(textExtraStruct.getStart(), end, c428830Grh);
                                if (4 == textExtraStruct.getSubtype()) {
                                    C2344009Gk c2344009Gk = new C2344009Gk();
                                    C0SQ1 c0sq12 = this.LLJJJJLIIL;
                                    if (c0sq12 != null) {
                                        str2 = c0sq12.LIZIZ;
                                    } else {
                                        str2 = null;
                                    }
                                    c2344009Gk.LJIIIIZZ("enter_from", str2);
                                    Aweme aweme4 = this.LLJJJJJIL;
                                    if (aweme4 != null) {
                                        aid = aweme4.getAid();
                                    } else {
                                        aid = null;
                                    }
                                    c2344009Gk.LJIIIIZZ("group_id", aid);
                                    Aweme aweme5 = this.LLJJJJJIL;
                                    if (aweme5 != null) {
                                        authorUid = AwemeExtKt.getAuthorUid(aweme5);
                                    } else {
                                        authorUid = null;
                                    }
                                    c2344009Gk.LJIIIIZZ("author_id", authorUid);
                                    c2344009Gk.LJIIIIZZ("music_id", C735370Ssx.LJIILIIL(this.LLJJJJJIL));
                                    C20684815ws.LJIILLIIL("duet_with_show", c2344009Gk.LIZ);
                                }
                            }
                        }
                    }
                    if (textExtraStruct.getType() == 1 && textExtraStruct.getSubtype() == 15) {
                        int start2 = textExtraStruct.getStart();
                        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.eh, getContext());
                        if (numLIZJ != null) {
                            iIntValue = numLIZJ.intValue();
                        } else {
                            iIntValue = -1;
                        }
                        LJJJJI(start2, end, new ForegroundColorSpan(iIntValue));
                    }
                }
            }
        }
        setAdHashTag(aweme);
        setBoldText(aweme.getTextExtra());
    }
}
