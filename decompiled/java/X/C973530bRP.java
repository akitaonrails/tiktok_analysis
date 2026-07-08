package X;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.Spannable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.chatroom.model.interact.ActivityBadgeInfo;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkmicDisplayText;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkmicDisplayTextPieces;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.CohostActivityBadgeDebugSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.CohostActivityBadgeEnableSetting;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common.TextPiece;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0bRP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C973530bRP {
    public static final C973530bRP LIZ = new C973530bRP();

    public static C973550bRR LIZIZ(ActivityBadgeInfo activityBadgeInfo) {
        String str;
        Map<String, String> map;
        String str2;
        String str3 = null;
        if (!CohostActivityBadgeEnableSetting.INSTANCE.isEnabled()) {
            return null;
        }
        boolean z = true;
        if (C958370b2x.LIZIZ() || C958370b2x.LIZJ()) {
            try {
                CohostActivityBadgeDebugSetting cohostActivityBadgeDebugSetting = CohostActivityBadgeDebugSetting.INSTANCE;
                if (cohostActivityBadgeDebugSetting.isEnabled()) {
                    String debugBadgeText = cohostActivityBadgeDebugSetting.getDebugBadgeText();
                    if (debugBadgeText.length() != 0) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("getDebugBadge: using debug badge, text=");
                        sbLIZ.append(debugBadgeText);
                        C20441214yg.LJIIIZ("CohostActivityBadgeProvider", C2188811AlT.LIZIZ(sbLIZ));
                        return new C973550bRR(new C973540bRQ(debugBadgeText, 6), new C973540bRQ(null, 7));
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C20441214yg.LJFF("CohostActivityBadgeProvider", "getDebugBadge failed", th);
            }
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("parseBadge: activityBadgeInfo=");
        if (activityBadgeInfo == null) {
            z = false;
        }
        sbLIZ2.append(z);
        sbLIZ2.append(", bgColor=");
        if (activityBadgeInfo != null) {
            str = activityBadgeInfo.backgroundColor;
        } else {
            str = null;
        }
        sbLIZ2.append(str);
        sbLIZ2.append(", eventTrace=");
        if (activityBadgeInfo != null) {
            map = activityBadgeInfo.eventTrace;
        } else {
            map = null;
        }
        sbLIZ2.append(map);
        C20441214yg.LJIIIZ("CohostActivityBadgeProvider", C2188811AlT.LIZIZ(sbLIZ2));
        if (activityBadgeInfo == null) {
            return null;
        }
        CharSequence charSequenceLIZJ = LIZJ(activityBadgeInfo.badgeText);
        if (TextUtils.isEmpty(charSequenceLIZJ)) {
            return null;
        }
        CharSequence charSequenceLIZJ2 = LIZJ(activityBadgeInfo.badgeTextDark);
        LinkmicDisplayText linkmicDisplayText = activityBadgeInfo.badgeText;
        if (linkmicDisplayText != null) {
            str3 = linkmicDisplayText.color;
        }
        String str4 = "";
        if (str3 == null) {
            str3 = "";
        }
        C973540bRQ c973540bRQ = new C973540bRQ(charSequenceLIZJ, str3, activityBadgeInfo.backgroundColor);
        LinkmicDisplayText linkmicDisplayText2 = activityBadgeInfo.badgeTextDark;
        if (linkmicDisplayText2 != null && (str2 = linkmicDisplayText2.color) != null) {
            str4 = str2;
        }
        return new C973550bRR(c973540bRQ, new C973540bRQ(charSequenceLIZJ2, str4, activityBadgeInfo.backgroundColorDark));
    }

    public static CharSequence LIZJ(LinkmicDisplayText linkmicDisplayText) {
        if (linkmicDisplayText == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder("resolveDisplayText: key=");
        sb.append(linkmicDisplayText.key);
        sb.append(", defaultPattern=");
        sb.append(linkmicDisplayText.defaultPattern);
        sb.append(", pieces=");
        List<LinkmicDisplayTextPieces> list = linkmicDisplayText.pieces;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        int i = 0;
        for (LinkmicDisplayTextPieces linkmicDisplayTextPieces : list) {
            int i2 = i + 1;
            if (i >= 0) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(i);
                sbLIZ.append(':');
                sbLIZ.append(linkmicDisplayTextPieces.stringPiece);
                arrayList.add(C2188811AlT.LIZIZ(sbLIZ));
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        sb.append(arrayList);
        C20441214yg.LJIIIZ("CohostActivityBadgeProvider", sb.toString());
        Text text = new Text();
        text.key = linkmicDisplayText.key;
        text.defaultPattern = linkmicDisplayText.defaultPattern;
        List<LinkmicDisplayTextPieces> list2 = linkmicDisplayText.pieces;
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
        for (LinkmicDisplayTextPieces linkmicDisplayTextPieces2 : list2) {
            TextPiece textPiece = new TextPiece();
            textPiece.type = EnumC1133850fbz.STRING.getPieceType();
            textPiece.stringValue = linkmicDisplayTextPieces2.stringPiece;
            arrayList2.add(textPiece);
        }
        text.pieces = arrayList2;
        Spannable spannableLJIILIIL = C1133830fbx.LJIILIIL(text, "");
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("resolveDisplayText: resolved=");
        sbLIZ2.append((Object) spannableLJIILIIL);
        C20441214yg.LJIIIZ("CohostActivityBadgeProvider", C2188811AlT.LIZIZ(sbLIZ2));
        return spannableLJIILIIL;
    }

    public static void LIZLLL(ViewGroup viewGroup) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i;
        if (viewGroup == null) {
            C20441214yg.LJ("CohostActivityBadgeProvider", "updateBadgeSpacing: badgesLayout is null");
            return;
        }
        int iLIZ = C439101nJ.LIZ(4);
        int childCount = viewGroup.getChildCount();
        boolean z = true;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                    if (z) {
                        i = 0;
                    } else {
                        i = iLIZ;
                    }
                    marginLayoutParams.setMarginStart(i);
                    C786410Ut5.W5(childAt, marginLayoutParams);
                }
                z = false;
            }
        }
    }

    public static void LIZ(C16F5 c16f5, C973550bRR c973550bRR) {
        C973540bRQ c973540bRQ;
        C973540bRQ c973540bRQ2;
        C973540bRQ c973540bRQ3;
        int iLIZLLL;
        GradientDrawable gradientDrawable;
        int iLIZLLL2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("bindActivityBadge: view=");
        sbLIZ.append(c16f5);
        sbLIZ.append(", badge=");
        sbLIZ.append(c973550bRR);
        C20441214yg.LJIIIZ("CohostActivityBadgeProvider", C2188811AlT.LIZIZ(sbLIZ));
        if (c16f5 == null) {
            return;
        }
        if (c973550bRR == null) {
            C786410Ut5.LLJJJJ(c16f5, 8);
            return;
        }
        Context context = c16f5.getContext();
        if (C973550bRR.LIZ(context) && c973550bRR.LIZIZ.LIZ.length() > 0) {
            c973540bRQ = c973550bRR.LIZIZ;
        } else {
            c973540bRQ = c973550bRR.LIZ;
        }
        CharSequence charSequence = c973540bRQ.LIZ;
        if (TextUtils.isEmpty(charSequence)) {
            C786410Ut5.LLJJJJ(c16f5, 8);
            return;
        }
        if (C973550bRR.LIZ(context) && c973550bRR.LIZIZ.LIZIZ.length() > 0) {
            c973540bRQ2 = c973550bRR.LIZIZ;
        } else {
            c973540bRQ2 = c973550bRR.LIZ;
        }
        String str = c973540bRQ2.LIZIZ;
        if (C973550bRR.LIZ(context) && c973550bRR.LIZIZ.LIZJ.length() > 0) {
            c973540bRQ3 = c973550bRR.LIZIZ;
        } else {
            c973540bRQ3 = c973550bRR.LIZ;
        }
        String str2 = c973540bRQ3.LIZJ;
        c16f5.setText(charSequence);
        c16f5.setBackgroundTintList(null);
        try {
            if (str.length() > 0) {
                iLIZLLL = Color.parseColor(str);
            } else {
                iLIZLLL = C497740JfY.LIZLLL(R.attr.ex7, context);
            }
            c16f5.setTextColor(iLIZLLL);
            Drawable background = c16f5.getBackground();
            if ((background instanceof GradientDrawable) && (gradientDrawable = (GradientDrawable) background) != null) {
                if (str2.length() > 0) {
                    iLIZLLL2 = Color.parseColor(str2);
                } else {
                    iLIZLLL2 = C497740JfY.LIZLLL(R.attr.c60, context);
                }
                gradientDrawable.setColor(iLIZLLL2);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("bindActivityBadge: failed to apply colors, text=");
            sbLIZ2.append(str);
            sbLIZ2.append(", bg=");
            sbLIZ2.append(str2);
            C20441214yg.LJFF("CohostActivityBadgeProvider", C2188811AlT.LIZIZ(sbLIZ2), th);
            C1AF0.LJFF(th, "bindActivityBadge_invalid_color");
        }
        C786410Ut5.LLJJJJ(c16f5, 0);
    }
}
