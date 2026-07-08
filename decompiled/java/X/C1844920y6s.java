package X;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattlePrompt;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattlePromptElem;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import java.util.List;
import kotlin.Unit;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0y6s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1844920y6s {
    public static final SpannableStringBuilder LIZIZ(BattlePrompt battlePrompt) {
        if (battlePrompt != null && !TextUtils.isEmpty(battlePrompt.promptKey)) {
            String str = battlePrompt.promptKey;
            List<BattlePromptElem> list = battlePrompt.promptElements;
            if (list == null) {
                list = C13BV.INSTANCE;
            }
            C1124870fNV.LIZJ().getClass();
            String strLIZIZ = C1124870fNV.LIZIZ(str);
            if (strLIZIZ == null) {
                strLIZIZ = "";
            }
            if (a0.LJJIIZI(strLIZIZ, "<", false) && a0.LJJIIZI(strLIZIZ, ">", false)) {
                for (BattlePromptElem battlePromptElem : list) {
                    if (!TextUtils.isEmpty(battlePromptElem.promptFieldKey)) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append('<');
                        sbLIZ.append(battlePromptElem.promptFieldKey);
                        sbLIZ.append('>');
                        if (!a0.LJJIIZI(strLIZIZ, C2188811AlT.LIZIZ(sbLIZ), false)) {
                            continue;
                        } else if (battlePromptElem.promptFieldKey != null) {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append('<');
                            sbLIZ2.append(battlePromptElem.promptFieldKey);
                            sbLIZ2.append('>');
                            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                            String str2 = battlePromptElem.promptFieldValue;
                            if (str2 == null) {
                                str2 = "";
                            }
                            strLIZIZ = u.LJJIFFI(strLIZIZ, strLIZIZ2, str2, false);
                        } else {
                            Unit.LIZ.getClass();
                            throw new IllegalArgumentException("kotlin.Unit");
                        }
                    }
                }
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (!TextUtils.isEmpty(strLIZIZ)) {
                int iLJJJ = a0.LJJJ(strLIZIZ, "{", 0, false, 6);
                int iLJJJ2 = a0.LJJJ(strLIZIZ, "}", 0, false, 6);
                if (a0.LJJIIZI(strLIZIZ, "{", false) && a0.LJJIIZI(strLIZIZ, "}", false)) {
                    strLIZIZ = u.LJJIFFI(u.LJJIFFI(strLIZIZ, "{", "", false), "}", "", false);
                }
                spannableStringBuilder.append((CharSequence) strLIZIZ);
                if (iLJJJ >= 0 && iLJJJ < iLJJJ2) {
                    C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(ColorProtector.parseColor("#FACE15")), iLJJJ, iLJJJ2 - 1, 34);
                }
            }
            return spannableStringBuilder;
        }
        return new SpannableStringBuilder("");
    }

    public static final SpannableStringBuilder LIZ(C427330GpH c427330GpH, SpannableStringBuilder spannableStringBuilder, boolean z) {
        int i;
        if (TextUtils.isEmpty(spannableStringBuilder)) {
            return new SpannableStringBuilder("");
        }
        if (z) {
            C786410Ut5.q2(spannableStringBuilder, new AbsoluteSizeSpan(11, true), 0, spannableStringBuilder.length(), 34);
            if (C497740JfY.LJJ()) {
                i = 21;
            } else {
                i = 19;
            }
            c427330GpH.setGravity(i);
            c427330GpH.LJJJJI();
            return spannableStringBuilder;
        }
        C786410Ut5.q2(spannableStringBuilder, new AbsoluteSizeSpan(13, true), 0, spannableStringBuilder.length(), 34);
        c427330GpH.setGravity(17);
        c427330GpH.LJJJJIZL();
        return spannableStringBuilder;
    }
}
