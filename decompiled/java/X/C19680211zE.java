package X;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.creative.model.story.StoryStreakTextStickerModel;
import com.ss.android.ugc.aweme.creative.model.story.StoryStreakUser;
import com.ss.android.ugc.aweme.creative.model.story.StreaksData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.StoryStreakTextStickerStyleModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextFontModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextMentionModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStyleModel;
import com.ss.android.vesdk.VESize;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AwS573S0100000_29;

/* JADX INFO: renamed from: X.11zE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19680211zE extends AbstractC2255721DQs<InterfaceC1462300o9k> implements InterfaceC1462300o9k, InterfaceC379610EuV {
    public static final C19680411zG LLJ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public static final int LLJIJIL;
    public final C1DRG LL;
    public final InterfaceC1731706qJ LLILLJJLI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC391240FVq.class, null);
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1461650o8h.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1446740nke.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 313));
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 314));
    public final int LLIZLLLIL;

    /* JADX WARN: Type inference failed for: r0v9, types: [X.11zG] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C19680211zE.class, "infiniStickerApi", "getInfiniStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/core/newengine/EditorInfiniStickerApi;", 0);
        C13LE.LIZ.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C19680211zE.class, "infoStickerApi", "getInfoStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/info/EditInfoStickerApi;", 0), new C2217381BqS(C19680211zE.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/gamora/editor/preview/TiktokEditPreviewApi;", 0), new C2217381BqS(C19680211zE.class, "publishEditModel", "getPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0)};
        LLJ = new Object() { // from class: X.11zG
        };
        LLJIJIL = 8;
    }

    public InterfaceC1462300o9k W2() {
        return this;
    }

    private final VideoPublishEditModel LJJJLIIL() {
        return (VideoPublishEditModel) this.LLILZIL.getValue(this, LLJI[3]);
    }

    private final InterfaceC391240FVq i3() {
        return (InterfaceC391240FVq) this.LLILLJJLI.getValue(this, LLJI[0]);
    }

    private final InterfaceC1461650o8h m3() {
        return (InterfaceC1461650o8h) this.LLILLL.getValue(this, LLJI[1]);
    }

    private final VESize v3() {
        return (VESize) this.LLIZ.getValue();
    }

    public final InterfaceC1446740nke JY0() {
        return (InterfaceC1446740nke) this.LLILZ.getValue(this, LLJI[2]);
    }

    public final InterfaceC1452170ntP q3() {
        return (InterfaceC1452170ntP) this.LLILZLL.getValue();
    }

    private final Context c3() {
        return C1664590tQ1.LJIIIZ(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0074  */
    @Override // X.InterfaceC1462300o9k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void lP1() {
        /*
            r10 = this;
            long r0 = java.lang.System.currentTimeMillis()
            X.C352001Yg.LIZ = r0
            X.0saE r2 = X.C1632480saE.LIZIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "StoryStreaksCreation, veSize = "
            r1.append(r0)
            com.ss.android.vesdk.VESize r0 = r10.v3()
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C201955140j.LJIILJJIL(r2, r0)
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r10.LJJJLIIL()
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r0.creativeModel
            com.ss.android.ugc.aweme.creative.model.story.StreaksData r5 = r0.streaksData
            r10.G2(r5)
            int r2 = r5.mufDaysCount
            int r1 = r5.messageSentCount
            int r0 = r5.streaksLevel
            boolean r8 = X.C1663300tNw.LIZ(r2, r1, r0)
            int r4 = r5.mufDaysCount
            int r3 = r5.messageSentCount
            int r1 = r5.streaksLevel
            X.01GW r0 = X.C298570Bn5.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r5 = 1
            if (r0 != r5) goto L76
            r0 = 1
        L4a:
            r2 = 3
            if (r0 == 0) goto L74
            if (r4 == 0) goto L53
            r0 = -1
            if (r3 != r0) goto L6a
            r5 = 2
        L53:
            long r6 = java.lang.System.currentTimeMillis()
            long r0 = X.C352001Yg.LIZ
            long r6 = r6 - r0
            X.1DFB r0 = X.C0PEM.LIZJ
            X.054G r0 = X.C2296808zG.LIZ(r0)
            X.01Yf r4 = new X.01Yf
            r9 = 0
            r4.<init>(r5, r6, r8, r9)
            X.C23250099c.LIZLLL(r0, r9, r9, r4, r2)
            return
        L6a:
            int r0 = r1 * 2
            if (r3 >= r0) goto L70
            r5 = 3
            goto L53
        L70:
            if (r4 >= r1) goto L74
            r5 = 4
            goto L53
        L74:
            r5 = 0
            goto L53
        L76:
            r0 = 0
            goto L4a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19680211zE.lP1():void");
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        W2();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C19680211zE(C1DRG c1drg) {
        int i;
        this.LL = c1drg;
        if (C426750GoL.LIZLLL(C1664590tQ1.LJIIIZ(this))) {
            i = 3;
        } else {
            i = 1;
        }
        this.LLIZLLLIL = i;
    }

    private final TextFontModel B3(C19680311zF c19680311zF) {
        return new TextFontModel(null, null, "textfont", null, null, null, c19680311zF.LIZJ, 1, null, null, false, false, false, 0, 16187, null);
    }

    private final void G2(StreaksData streaksData) {
        InterfaceC391240FVq interfaceC391240FVqI3;
        long jCurrentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        if (!streaksData.stickerAddState.isTextDescStickerAdded()) {
            TextStickerModel textStickerModelH2 = H2(C1664590tQ1.LJIIIZ(this), streaksData.streaksLevel);
            arrayList.add(textStickerModelH2);
            streaksData.stickerAddState.setTextDescStickerModel(new StoryStreakTextStickerModel(textStickerModelH2.getBaseStickerModel().getTranslateY(), textStickerModelH2.getStreakTextStyleModel().stickerHeight));
            streaksData.stickerAddState.setTextDescStickerAdded(true);
        }
        if (!streaksData.stickerAddState.isTextMentionStickerAdded()) {
            TextStickerModel textStickerModelT2 = T2(C1664590tQ1.LJIIIZ(this), streaksData.streakUser, streaksData);
            arrayList.add(textStickerModelT2);
            streaksData.stickerAddState.setTextMentionStickerModel(new StoryStreakTextStickerModel(textStickerModelT2.getBaseStickerModel().getTranslateY(), textStickerModelT2.getStreakTextStyleModel().stickerHeight));
            streaksData.stickerAddState.setTextMentionStickerAdded(true);
        }
        if ((!arrayList.isEmpty()) && (interfaceC391240FVqI3 = i3()) != null) {
            interfaceC391240FVqI3.w3(arrayList, EnumC356070Dxd.COMMIT);
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        C1632480saE c1632480saE = C1632480saE.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("generateAndAddTopTextStickers(): duration=");
        sbLIZ.append(jCurrentTimeMillis2);
        C201955140j.LJIIIIZZ(c1632480saE, "StoryStreaksCreation", C2188811AlT.LIZIZ(sbLIZ));
        C352001Yg.LIZIZ = jCurrentTimeMillis2;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x018a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel H2(android.content.Context r64, int r65) {
        /*
            Method dump skipped, instruction units count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19680211zE.H2(android.content.Context, int):com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel");
    }

    public static final float Z1(Paint paint, int i) {
        paint.setTextSize(C418440Gaw.LIZIZ(Integer.valueOf(i)));
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        return (fontMetrics.bottom - fontMetrics.top) + fontMetrics.leading;
    }

    private final TextStickerModel T2(Context context, StoryStreakUser storyStreakUser, StreaksData streaksData) {
        float f;
        int iIntValue;
        if (storyStreakUser == null) {
            return new TextStickerModel(null, null, null, null, null, 0, 0, 0, 0.0f, null, false, false, false, false, false, null, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, false, null, null, false, false, null, null, null, null, null, null, false, false, null, false, false, false, null, -1, 65535, null);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i = v3().width;
        String str = storyStreakUser.nickname;
        if ((str == null || str.length() == 0) && (str = storyStreakUser.username) == null) {
            str = "";
        }
        Typeface typefaceLIZIZ = C1697580uHE.LIZIZ(0.0f, 900, 0.0f, 0.0f, null, 0.0f, 0, null, 253);
        StoryStreakTextStickerModel storyStreakTextStickerModel = streaksData.stickerAddState.textDescStickerModel;
        if (storyStreakTextStickerModel == null) {
            f = 0.0f;
        } else {
            f = storyStreakTextStickerModel.translateY + (storyStreakTextStickerModel.height / 2.0f);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('@');
        sbLIZ.append(str);
        C19680311zF c19680311zFW1 = W1(C2188811AlT.LIZIZ(sbLIZ), i, typefaceLIZIZ, true, f);
        C1632480saE c1632480saE = C1632480saE.LIZIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("generateStreakTopMentionTextModel(): duration=");
        sbLIZ2.append(System.currentTimeMillis() - jCurrentTimeMillis);
        C201955140j.LJIIIIZZ(c1632480saE, "StoryStreaksCreation", C2188811AlT.LIZIZ(sbLIZ2));
        int i2 = 0;
        int i3 = 0;
        BaseStickerModel baseStickerModel = new BaseStickerModel(0, 0, EnumC1466150oFx.TEXT, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, c19680311zFW1.LIZ, c19680311zFW1.LIZIZ, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -6291461, 15, null);
        String str2 = c19680311zFW1.LIZLLL;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.e1, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = -16777216;
        }
        int i4 = this.LLIZLLLIL;
        TextFontModel textFontModelB3 = B3(c19680311zFW1);
        TextMentionModel[] textMentionModelArr = new TextMentionModel[1];
        String str3 = storyStreakUser.uid;
        String str4 = storyStreakUser.secUid;
        String str5 = storyStreakUser.username;
        UrlModel urlModel = storyStreakUser.avatarModel;
        C19680511zH c19680511zH = c19680311zFW1.LJI;
        if (c19680511zH != null) {
            i2 = c19680511zH.LIZ;
            i3 = c19680511zH.LIZIZ;
        }
        textMentionModelArr[0] = new TextMentionModel(str3, str4, str5, str, urlModel, 0, 0, i2, i3, 0, c19680311zFW1.LIZLLL.length() - 1, str, true, 0, 0);
        return new TextStickerModel(baseStickerModel, null, null, str2, null, 0, iIntValue, i4, 0.0f, textFontModelB3, false, false, false, false, false, null, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, false, C1697810uHb.LJIILJJIL(textMentionModelArr), null, false, false, null, new TextStyleModel("", "", "", "", "#FFFFFFFF", null, null, null, false, "", ""), null, null, null, new StoryStreakTextStickerStyleModel(c19680311zFW1.LJ, 900, 0), false, false, null, false, false, false, null, 2147478838, 65263, null);
    }

    public static final float o2(Paint paint, int i, String str) {
        paint.setTextSize(C418440Gaw.LIZIZ(Integer.valueOf(i)));
        return paint.measureText(str);
    }

    public static final String w2(Typeface typeface, int i, int i2, String str) {
        TextPaint textPaint = new TextPaint(1);
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        textPaint.setTextSize(C418440Gaw.LIZIZ(Integer.valueOf(i)));
        return TextUtils.ellipsize(str, textPaint, i2, TextUtils.TruncateAt.END).toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final X.C19680311zF W1(java.lang.String r23, int r24, android.graphics.Typeface r25, boolean r26, float r27) {
        /*
            Method dump skipped, instruction units count: 554
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19680211zE.W1(java.lang.String, int, android.graphics.Typeface, boolean, float):X.11zF");
    }
}
