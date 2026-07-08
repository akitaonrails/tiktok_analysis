package X;

import android.content.Context;
import android.content.DialogInterface;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.intro.TuxPanel;
import com.ss.android.ugc.aweme.audio.copyrightdetect.PreCheckResult;
import com.ss.android.ugc.aweme.creative.model.audio.MatchDetailsV1;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editor.audio.copyrightdetect.base.AudioCopyrightLearnMoreFragment;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS3S1211000_14;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0Xlj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C858290Xlj {
    public static final C858290Xlj LIZ = new C858290Xlj();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v18, types: [T, androidx.fragment.app.DialogFragment, com.bytedance.tux.sheet.intro.TuxPanel] */
    /* JADX WARN: Type inference failed for: r7v9, types: [T, androidx.fragment.app.DialogFragment, com.bytedance.tux.sheet.intro.TuxPanel] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v5 */
    public static final TuxPanel LIZ(final FragmentManager fragmentManager, final Context context, final PreCheckResult preCheckResult, final VideoPublishEditModel videoPublishEditModel, final String str, String str2, final int i, Integer num, Function1<? super Integer, Unit> function1) {
        boolean z;
        final int size;
        ?? r9;
        String string;
        int i2;
        String string2;
        int i3;
        final int size2;
        final int size3;
        String string3;
        if (!C362370EIp.LIZJ(videoPublishEditModel) && C306450Bzn.LIZ()) {
            z = false;
        } else {
            z = true;
        }
        String str3 = "";
        if (i == C0FPS.ECOMMERCE.getScene()) {
            LIZ.getClass();
            String string4 = context.getString(2131850541);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(context.getResources().getString(2131848216));
            sbLIZ.append(' ');
            sbLIZ.append(string4);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C2188811AlT.LIZIZ(sbLIZ));
            int iLJJJ = a0.LJJJ(spannableStringBuilder, string4, 0, false, 6);
            ArrayList<MatchDetailsV1> arrayList = preCheckResult.matchDetailsV1;
            if (arrayList != null) {
                size3 = arrayList.size();
            } else {
                size3 = 0;
            }
            final boolean zLIZ = C384190F4n.LIZ(videoPublishEditModel);
            C786410Ut5.q2(spannableStringBuilder, new ClickableSpan() { // from class: X.0ZBn
                @Override // android.text.style.ClickableSpan
                public final void onClick(View view) {
                    String str4 = AudioCopyrightLearnMoreFragment._pnsPageId;
                    C895590ZBl.LIZ(fragmentManager, context, preCheckResult, zLIZ, size3, false);
                    C856790XjJ c856790XjJ = C856790XjJ.LIZ;
                    String creationId = videoPublishEditModel.getCreationId();
                    VideoPublishEditModel videoPublishEditModel2 = videoPublishEditModel;
                    String str5 = videoPublishEditModel2.mShootWay;
                    if (str5 == null) {
                        str5 = "";
                    }
                    String str6 = str;
                    String strLJIILL = C1428470nHB.LJIILL(videoPublishEditModel2);
                    String strLJIILIIL = C1428470nHB.LJIILIIL(videoPublishEditModel);
                    int i4 = i;
                    int videoLength = videoPublishEditModel.getVideoLength();
                    boolean zLIZIZ = C857680Xkk.LIZIZ(videoPublishEditModel);
                    c856790XjJ.getClass();
                    C856790XjJ.LIZJ(creationId, str5, str6, strLJIILL, i4, videoLength, zLIZIZ ? 1 : 0, strLJIILIIL);
                }

                @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                public final void updateDrawState(TextPaint textPaint) {
                    C444890HcV c444890HcV = new C444890HcV();
                    c444890HcV.LIZ(42);
                    textPaint.setTypeface(c444890HcV.getTypeface());
                }
            }, iLJJJ, string4.length() + iLJJJ, 34);
            C1391960mKI c1391960mKI = new C1391960mKI();
            c1391960mKI.LIZ = true;
            c1391960mKI.LJI = 0;
            C0HTI c0hti = new C0HTI();
            c0hti.LIZ = R.drawable.c5s;
            c1391960mKI.LIZLLL = c0hti.LIZ(context);
            c1391960mKI.LJII = context.getResources().getString(2131848217);
            c1391960mKI.LJIIIIZZ = spannableStringBuilder;
            if (z) {
                string3 = context.getResources().getString(2131837708);
            } else {
                string3 = context.getResources().getString(2131837700);
            }
            c1391960mKI.LIZIZ(string3, new AwS3S1211000_14(i, videoPublishEditModel, str, function1, z, 0));
            c1391960mKI.LJIILJJIL = true;
            c1391960mKI.LIZ().LIZ.show(fragmentManager, "showCopyRightResultDialog");
            C856790XjJ c856790XjJ = C856790XjJ.LIZ;
            String creationId = videoPublishEditModel.getCreationId();
            String str4 = videoPublishEditModel.mShootWay;
            if (str4 != null) {
                str3 = str4;
            }
            String strValueOf = String.valueOf(videoPublishEditModel.getDraftId());
            String strLJIILL = C1428470nHB.LJIILL(videoPublishEditModel);
            String strLJIILIIL = C1428470nHB.LJIILIIL(videoPublishEditModel);
            String musicId = videoPublishEditModel.getMusicId();
            int videoLength = videoPublishEditModel.getVideoLength();
            boolean zLIZIZ = C857680Xkk.LIZIZ(videoPublishEditModel);
            c856790XjJ.getClass();
            C856790XjJ.LJIIJ(i, videoLength, creationId, str3, zLIZIZ ? 1 : 0, strValueOf, str, "", strLJIILL, strLJIILIIL, musicId);
            return null;
        }
        if (i != C0FPS.LONG_VIDEO.getScene() && i != C0FPS.SHORT_VIDEO.getScene()) {
            LIZ.getClass();
            C259800zU c259800zU = new C259800zU();
            String string5 = context.getString(2131837699);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(context.getResources().getString(2131822161));
            sbLIZ2.append(' ');
            sbLIZ2.append(string5);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(C2188811AlT.LIZIZ(sbLIZ2));
            int iLJJJ2 = a0.LJJJ(spannableStringBuilder2, string5, 0, false, 6);
            ArrayList<MatchDetailsV1> arrayList2 = preCheckResult.matchDetailsV1;
            if (arrayList2 != null) {
                size2 = arrayList2.size();
            } else {
                size2 = 0;
            }
            final boolean zLIZ2 = C384190F4n.LIZ(videoPublishEditModel);
            C786410Ut5.q2(spannableStringBuilder2, new ClickableSpan() { // from class: X.0ZBm
                @Override // android.text.style.ClickableSpan
                public final void onClick(View view) {
                    String str5 = AudioCopyrightLearnMoreFragment._pnsPageId;
                    C895590ZBl.LIZ(fragmentManager, context, preCheckResult, zLIZ2, size2, true);
                    C856790XjJ c856790XjJ2 = C856790XjJ.LIZ;
                    String creationId2 = videoPublishEditModel.getCreationId();
                    VideoPublishEditModel videoPublishEditModel2 = videoPublishEditModel;
                    String str6 = videoPublishEditModel2.mShootWay;
                    if (str6 == null) {
                        str6 = "";
                    }
                    String str7 = str;
                    String strLJIILL2 = C1428470nHB.LJIILL(videoPublishEditModel2);
                    String strLJIILIIL2 = C1428470nHB.LJIILIIL(videoPublishEditModel);
                    int i4 = i;
                    int videoLength2 = videoPublishEditModel.getVideoLength();
                    boolean zLIZIZ2 = C857680Xkk.LIZIZ(videoPublishEditModel);
                    c856790XjJ2.getClass();
                    C856790XjJ.LIZJ(creationId2, str6, str7, strLJIILL2, i4, videoLength2, zLIZIZ2 ? 1 : 0, strLJIILIIL2);
                }

                @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                public final void updateDrawState(TextPaint textPaint) {
                    C444890HcV c444890HcV = new C444890HcV();
                    c444890HcV.LIZ(42);
                    textPaint.setTypeface(c444890HcV.getTypeface());
                }
            }, iLJJJ2, string5.length() + iLJJJ2, 34);
            C1391960mKI c1391960mKI2 = new C1391960mKI();
            c1391960mKI2.LIZ = true;
            c1391960mKI2.LJI = 0;
            C0HTI c0hti2 = new C0HTI();
            c0hti2.LIZ = R.drawable.c5s;
            c1391960mKI2.LIZLLL = c0hti2.LIZ(context);
            c1391960mKI2.LJII = context.getResources().getString(2131822160);
            c1391960mKI2.LJIIIIZZ = spannableStringBuilder2;
            c1391960mKI2.LIZIZ(context.getResources().getString(2131822164), new C856840XjO(c259800zU, function1, videoPublishEditModel, str, i));
            c1391960mKI2.LJIILJJIL = true;
            ?? r3 = c1391960mKI2.LIZ().LIZ;
            r3.LLJILJIL = false;
            r3.LLJI = true;
            r3.LLIZLLLIL = true;
            r3.LLILZLL = new C0IDQ(c259800zU, function1, 1);
            r3.LLILZIL = new DialogInterface.OnDismissListener() { // from class: X.0Xi9
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    C856790XjJ c856790XjJ2 = C856790XjJ.LIZ;
                    String creationId2 = videoPublishEditModel.getCreationId();
                    VideoPublishEditModel videoPublishEditModel2 = videoPublishEditModel;
                    String str5 = videoPublishEditModel2.mShootWay;
                    if (str5 == null) {
                        str5 = "";
                    }
                    String str6 = str;
                    String strLJIILL2 = C1428470nHB.LJIILL(videoPublishEditModel2);
                    String strLJIILIIL2 = C1428470nHB.LJIILIIL(videoPublishEditModel);
                    int i4 = i;
                    int videoLength2 = videoPublishEditModel.getVideoLength();
                    boolean zLIZIZ2 = C857680Xkk.LIZIZ(videoPublishEditModel);
                    c856790XjJ2.getClass();
                    C856790XjJ.LIZIZ(creationId2, str5, str6, strLJIILL2, i4, videoLength2, zLIZIZ2 ? 1 : 0, strLJIILIIL2);
                }
            };
            c259800zU.element = r3;
            r3.show(fragmentManager, "showCopyRightResultDialog");
            C856790XjJ c856790XjJ2 = C856790XjJ.LIZ;
            String creationId2 = videoPublishEditModel.getCreationId();
            String str5 = videoPublishEditModel.mShootWay;
            if (str5 != null) {
                str3 = str5;
            }
            String strValueOf2 = String.valueOf(videoPublishEditModel.getDraftId());
            String strLJIILL2 = C1428470nHB.LJIILL(videoPublishEditModel);
            String strLJIILIIL2 = C1428470nHB.LJIILIIL(videoPublishEditModel);
            String musicId2 = videoPublishEditModel.getMusicId();
            int videoLength2 = videoPublishEditModel.getVideoLength();
            boolean zLIZIZ2 = C857680Xkk.LIZIZ(videoPublishEditModel);
            c856790XjJ2.getClass();
            C856790XjJ.LJIIJ(i, videoLength2, creationId2, str3, zLIZIZ2 ? 1 : 0, strValueOf2, str, "", strLJIILL2, strLJIILIIL2, musicId2);
            return null;
        }
        LIZ.getClass();
        C259800zU c259800zU2 = new C259800zU();
        final boolean zLIZ3 = C384190F4n.LIZ(videoPublishEditModel);
        ArrayList<MatchDetailsV1> arrayList3 = preCheckResult.matchDetailsV1;
        if (arrayList3 != null) {
            size = arrayList3.size();
        } else {
            size = 0;
        }
        String string6 = context.getString(2131837699);
        if (z) {
            r9 = 0;
            string = context.getString(2131837701, string6);
        } else {
            r9 = 0;
            string = context.getString(2131837704, string6);
        }
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(string);
        int iLJJJ3 = a0.LJJJ(spannableStringBuilder3, string6, r9, r9, 6);
        C786410Ut5.q2(spannableStringBuilder3, new ClickableSpan() { // from class: X.0ZBo
            @Override // android.text.style.ClickableSpan
            public final void onClick(View view) {
                String str6 = AudioCopyrightLearnMoreFragment._pnsPageId;
                C895590ZBl.LIZ(fragmentManager, context, preCheckResult, zLIZ3, size, true);
                C856790XjJ c856790XjJ3 = C856790XjJ.LIZ;
                String creationId3 = videoPublishEditModel.getCreationId();
                VideoPublishEditModel videoPublishEditModel2 = videoPublishEditModel;
                String str7 = videoPublishEditModel2.mShootWay;
                if (str7 == null) {
                    str7 = "";
                }
                String str8 = str;
                String strLJIILL3 = C1428470nHB.LJIILL(videoPublishEditModel2);
                String strLJIILIIL3 = C1428470nHB.LJIILIIL(videoPublishEditModel);
                int i4 = i;
                int videoLength3 = videoPublishEditModel.getVideoLength();
                boolean zLIZIZ3 = C857680Xkk.LIZIZ(videoPublishEditModel);
                c856790XjJ3.getClass();
                C856790XjJ.LIZJ(creationId3, str7, str8, strLJIILL3, i4, videoLength3, zLIZIZ3 ? 1 : 0, strLJIILIIL3);
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public final void updateDrawState(TextPaint textPaint) {
                C444890HcV c444890HcV = new C444890HcV();
                c444890HcV.LIZ(42);
                textPaint.setTypeface(c444890HcV.getTypeface());
            }
        }, iLJJJ3, iLJJJ3 + string6.length(), 34);
        C1391960mKI c1391960mKI3 = new C1391960mKI();
        c1391960mKI3.LIZ = true;
        c1391960mKI3.LJI = 2;
        C0HTI c0hti3 = new C0HTI();
        if (C0C1H.LIZ() != 1 && C0C1H.LIZ() != 2) {
            i2 = R.raw.icon_color_warning_red;
        } else {
            i2 = R.drawable.qw;
        }
        c0hti3.LIZ = i2;
        c1391960mKI3.LIZLLL = c0hti3.LIZ(context);
        c1391960mKI3.LJII = context.getResources().getString(2131837706);
        c1391960mKI3.LJIIIIZZ = spannableStringBuilder3;
        if (z) {
            string2 = context.getResources().getString(2131837708);
        } else {
            string2 = context.getResources().getString(2131837700);
        }
        c1391960mKI3.LIZIZ(string2, new AwS3S1211000_14(i, videoPublishEditModel, str, function1, z, 1));
        if (!Intrinsics.LJFF(str2, "click_add_sound")) {
            if (Intrinsics.LJFF(str, "video_edit_page")) {
                i3 = 2131837698;
            } else {
                i3 = 2131837712;
            }
            c1391960mKI3.LIZJ(context.getString(i3), new C856110XiD(i, videoPublishEditModel, str, function1));
        }
        c1391960mKI3.LJIILJJIL = true;
        ?? r7 = c1391960mKI3.LIZ().LIZ;
        r7.LLJILJIL = false;
        r7.LLJI = true;
        r7.LLIZLLLIL = true;
        r7.LLILZLL = new C0IDQ(c259800zU2, function1, 2);
        r7.LLILZIL = new DialogInterface.OnDismissListener() { // from class: X.0XiA
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                C856790XjJ c856790XjJ3 = C856790XjJ.LIZ;
                String creationId3 = videoPublishEditModel.getCreationId();
                VideoPublishEditModel videoPublishEditModel2 = videoPublishEditModel;
                String str6 = videoPublishEditModel2.mShootWay;
                if (str6 == null) {
                    str6 = "";
                }
                String str7 = str;
                String strLJIILL3 = C1428470nHB.LJIILL(videoPublishEditModel2);
                String strLJIILIIL3 = C1428470nHB.LJIILIIL(videoPublishEditModel);
                int i4 = i;
                int videoLength3 = videoPublishEditModel.getVideoLength();
                boolean zLIZIZ3 = C857680Xkk.LIZIZ(videoPublishEditModel);
                c856790XjJ3.getClass();
                C856790XjJ.LIZIZ(creationId3, str6, str7, strLJIILL3, i4, videoLength3, zLIZIZ3 ? 1 : 0, strLJIILIIL3);
            }
        };
        c259800zU2.element = r7;
        r7.show(fragmentManager, "showCopyRightResultDialog");
        C856790XjJ c856790XjJ3 = C856790XjJ.LIZ;
        String creationId3 = videoPublishEditModel.getCreationId();
        String str6 = videoPublishEditModel.mShootWay;
        if (str6 != null) {
            str3 = str6;
        }
        String strValueOf3 = String.valueOf(videoPublishEditModel.getDraftId());
        String strLJIILL3 = C1428470nHB.LJIILL(videoPublishEditModel);
        String strLJIILIIL3 = C1428470nHB.LJIILIIL(videoPublishEditModel);
        String musicId3 = videoPublishEditModel.getMusicId();
        int videoLength3 = videoPublishEditModel.getVideoLength();
        boolean zLIZIZ3 = C857680Xkk.LIZIZ(videoPublishEditModel);
        c856790XjJ3.getClass();
        C856790XjJ.LJIIJ(i, videoLength3, creationId3, str3, zLIZIZ3 ? 1 : 0, strValueOf3, str, str2, strLJIILL3, strLJIILIIL3, musicId3);
        if (num != null) {
            function1.invoke(Integer.valueOf(num.intValue()));
        }
        return (TuxPanel) c259800zU2.element;
    }
}
