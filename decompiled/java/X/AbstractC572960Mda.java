package X;

import android.graphics.PointF;
import android.graphics.Typeface;
import android.provider.Settings;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.editSticker.text.font.TextFontStyleData;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextFontModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Mda, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC572960Mda implements C0MOH {
    public String LIZIZ = "";
    public String LIZJ = "";
    public int LIZLLL = -1;

    public abstract TextStickerModel LJ();

    public abstract TextStickerModel LJFF();

    public abstract PointF LJI();

    public abstract PointF LJII();

    public abstract PointF LJIIIIZZ();

    @Override // X.C0MOH
    public final PointF LIZ(int i, int i2) {
        if (i == i2) {
            return LJI();
        }
        if (i > i2) {
            return LJII();
        }
        return LJIIIIZZ();
    }

    @Override // X.C0MOH
    public final List<TextStickerModel> LIZIZ(int i, int i2, String str, String str2) {
        String str3;
        Object c098200Yq;
        Object c098200Yq2;
        String effectId;
        String resource_id;
        String panel;
        String str4;
        String str5;
        String str6;
        String str7;
        String effectId2;
        String resource_id2;
        String panel2;
        String str8;
        String str9;
        String str10;
        String str11;
        Effect effect;
        Effect effect2;
        Effect effect3;
        Effect effect4;
        Effect effect5;
        Effect effect6;
        int i3;
        C576290Mix c576290Mix = C576290Mix.LIZ;
        int iLIZLLL = LIZLLL();
        c576290Mix.getClass();
        String str12 = (String) C576290Mix.LIZIZ().get(Integer.valueOf(iLIZLLL));
        if (str12 == null) {
            str12 = "Proxima-Nova-Semibold.otf";
        }
        TextFontStyleData textFontStyleDataLJIILL = C0FI2.LJIILL(str12);
        if (textFontStyleDataLJIILL == null) {
            textFontStyleDataLJIILL = C0FI2.LJIILL("Proxima-Nova-Semibold.otf");
        }
        PointF pointFLIZ = LIZ(i, i2);
        float f = i;
        float f2 = f / 2.0f;
        float f3 = i2;
        float f4 = f3 / 2.0f;
        TextStickerModel textStickerModelLJFF = LJFF();
        double dAbs = ((double) Math.abs((1 - pointFLIZ.x) * f)) / Math.cos(Math.toRadians(textStickerModelLJFF.getBaseStickerModel().getRotation()));
        BaseStickerModel baseStickerModel = textStickerModelLJFF.getBaseStickerModel();
        EnumC1466150oFx enumC1466150oFx = EnumC1466150oFx.TEXT;
        C0MOI c0moi = C0MOH.LIZ;
        float f5 = pointFLIZ.x * f;
        c0moi.getClass();
        if (C426750GoL.LJFF()) {
            f5 = -f5;
        }
        BaseStickerModel baseStickerModelCopy$default = BaseStickerModel.copy$default(baseStickerModel, 1, 0, enumC1466150oFx, 0, 0, f2, f4, 0, 0, 0, 0, i, i2, i, i2, false, null, 0.0f, 0.0f, 0.0f, 0.0f, f5, f3 * pointFLIZ.y, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -6322278, 15, null);
        TextFontModel fontModel = textStickerModelLJFF.getFontModel();
        int iMin = textStickerModelLJFF.getFontModel().fontSize;
        int i4 = (int) dAbs;
        if (textFontStyleDataLJIILL != null) {
            str3 = textFontStyleDataLJIILL.LIZ;
        } else {
            str3 = null;
        }
        String str13 = "";
        if (Intrinsics.LJFF(this.LIZJ, str3) && Intrinsics.LJFF(str, this.LIZIZ) && (i3 = this.LIZLLL) > 0) {
            iMin = Math.min(i3, iMin);
        } else {
            C0MOG c0mog = C576250Mit.LLJJIJIIJIL;
            String str14 = (String) C576290Mix.LIZIZ().get(Integer.valueOf(LIZLLL()));
            if (str14 == null) {
                str14 = "Proxima-Nova-Semibold.otf";
            }
            c0mog.getClass();
            Typeface typefaceLJJI = C0FI2.LJJI(str14);
            if (typefaceLJJI == null) {
                typefaceLJJI = C0FI2.LJJI("Proxima-Nova-Semibold.otf");
            }
            C572970Mdb.LIZ().setTextSize(C418440Gaw.LIZIZ(Integer.valueOf(iMin)));
            C572970Mdb.LIZ().setTypeface(typefaceLJJI);
            if (str3 != null) {
                try {
                    C572970Mdb.LIZ().setTypeface(C786410Ut5.x4(str3));
                    c098200Yq = Unit.LIZ;
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                if (thM5exceptionOrNullimpl != null) {
                    C554890LpX c554890LpX = C554890LpX.LIZIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("TextStickerAdjust, create typeface fail = ");
                    sbLIZ.append(thM5exceptionOrNullimpl);
                    C201955140j.LIZJ(c554890LpX, C2188811AlT.LIZIZ(sbLIZ));
                }
                C189200o6.m1boximpl(c098200Yq);
            }
            float fMeasureText = C572970Mdb.LIZ().measureText(str);
            float f6 = 1.0f;
            try {
                float f7 = Settings.System.getFloat(C0CHQ.LIZ.getContentResolver(), "font_scale", 1.0f);
                if (f7 >= 1.0f) {
                    f6 = f7;
                }
                c098200Yq2 = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq2);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                c098200Yq2 = new C098200Yq(th2);
                C189200o6.m2constructorimpl(c098200Yq2);
            }
            if (C189200o6.m5exceptionOrNullimpl(c098200Yq2) != null) {
                C201955140j.LIZLLL(C1429810nJL.LIZIZ, "TextStickerAdjust", "failed to read font_scale");
            }
            int i5 = iMin;
            while (fMeasureText > i4 - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(55)) && i5 > 0) {
                i5--;
                C572970Mdb.LIZ().setTextSize(C418440Gaw.LIZIZ(Integer.valueOf(i5)));
                fMeasureText = C572970Mdb.LIZ().measureText(str);
                C554890LpX c554890LpX2 = C554890LpX.LIZIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("TextStickerAdjust, textWidth = ");
                sbLIZ2.append(fMeasureText);
                C201955140j.LIZJ(c554890LpX2, C2188811AlT.LIZIZ(sbLIZ2));
            }
            C554890LpX c554890LpX3 = C554890LpX.LIZIZ;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("TextStickerAdjust, getTargetFontForOneLine: targetTextSize = ");
            sbLIZ3.append(i5);
            sbLIZ3.append(", textString = ");
            sbLIZ3.append(str);
            sbLIZ3.append(", width = ");
            sbLIZ3.append(i4);
            C201955140j.LIZJ(c554890LpX3, C2188811AlT.LIZIZ(sbLIZ3));
            int i6 = (int) (i5 / f6);
            this.LIZLLL = i6;
            if (str3 == null) {
                str3 = "";
            }
            this.LIZJ = str3;
            this.LIZIZ = str;
            if (i6 > 0) {
                iMin = Math.min(i6, iMin);
            }
        }
        if (textFontStyleDataLJIILL == null || (effect6 = textFontStyleDataLJIILL.LJ) == null || (effectId = effect6.getEffectId()) == null) {
            effectId = "";
        }
        if (textFontStyleDataLJIILL == null || (effect5 = textFontStyleDataLJIILL.LJ) == null || (resource_id = effect5.getResource_id()) == null) {
            resource_id = "";
        }
        if (textFontStyleDataLJIILL == null || (effect4 = textFontStyleDataLJIILL.LJ) == null || (panel = effect4.getPanel()) == null) {
            panel = "";
        }
        if (textFontStyleDataLJIILL == null || (str4 = textFontStyleDataLJIILL.fontName) == null) {
            str4 = "";
        }
        if (textFontStyleDataLJIILL == null || (str5 = textFontStyleDataLJIILL.title) == null) {
            str5 = "";
        }
        if (textFontStyleDataLJIILL == null || (str6 = textFontStyleDataLJIILL.fileName) == null) {
            str6 = "";
        }
        if (textFontStyleDataLJIILL == null || (str7 = textFontStyleDataLJIILL.LIZ) == null) {
            str7 = "";
        }
        TextStickerModel textStickerModelCopy$default = TextStickerModel.copy$default(textStickerModelLJFF, baseStickerModelCopy$default, null, null, str, null, 0, 0, 0, 0.0f, TextFontModel.LIZ(fontModel, effectId, resource_id, panel, null, str4, str5, iMin, 1, str6, str7, false, false, 0, 15368), false, false, false, false, false, null, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, false, null, null, false, false, null, null, null, null, C0F7T.ON_THIS_DAY_TITLE, null, false, false, null, false, false, false, null, -522, 65407, null);
        TextStickerModel textStickerModelLJ = LJ();
        BaseStickerModel baseStickerModel2 = textStickerModelLJ.getBaseStickerModel();
        EnumC1466150oFx enumC1466150oFx2 = EnumC1466150oFx.TEXT;
        C0MOI c0moi2 = C0MOH.LIZ;
        float f8 = (pointFLIZ.x * f) + LIZJ().x;
        c0moi2.getClass();
        if (C426750GoL.LJFF()) {
            f8 = -f8;
        }
        BaseStickerModel baseStickerModelCopy$default2 = BaseStickerModel.copy$default(baseStickerModel2, 2, 0, enumC1466150oFx2, 0, 0, f2, f4, 0, 0, 0, 0, i, i2, i, i2, false, null, 0.0f, 0.0f, 0.0f, 0.0f, f8, (f3 * pointFLIZ.y) + LIZJ().y, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -6322278, 15, null);
        TextFontModel fontModel2 = textStickerModelLJ.getFontModel();
        if (textFontStyleDataLJIILL == null || (effect3 = textFontStyleDataLJIILL.LJ) == null || (effectId2 = effect3.getEffectId()) == null) {
            effectId2 = "";
        }
        if (textFontStyleDataLJIILL == null || (effect2 = textFontStyleDataLJIILL.LJ) == null || (resource_id2 = effect2.getResource_id()) == null) {
            resource_id2 = "";
        }
        if (textFontStyleDataLJIILL == null || (effect = textFontStyleDataLJIILL.LJ) == null || (panel2 = effect.getPanel()) == null) {
            panel2 = "";
        }
        if (textFontStyleDataLJIILL == null || (str8 = textFontStyleDataLJIILL.fontName) == null) {
            str8 = "";
        }
        if (textFontStyleDataLJIILL == null || (str9 = textFontStyleDataLJIILL.title) == null) {
            str9 = "";
        }
        if (textFontStyleDataLJIILL == null || (str10 = textFontStyleDataLJIILL.fileName) == null) {
            str10 = "";
        }
        if (textFontStyleDataLJIILL != null && (str11 = textFontStyleDataLJIILL.LIZ) != null) {
            str13 = str11;
        }
        return C1697810uHb.LJIILJJIL(textStickerModelCopy$default, TextStickerModel.copy$default(textStickerModelLJ, baseStickerModelCopy$default2, null, null, str2, null, 0, 0, 0, 0.0f, TextFontModel.LIZ(fontModel2, effectId2, resource_id2, panel2, null, str8, str9, 0, 1, str10, str13, false, false, 0, 15432), false, false, false, false, false, null, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, false, null, null, false, false, null, null, null, null, C0F7T.ON_THIS_DAY_TIME, null, false, false, null, false, false, false, null, -522, 65407, null));
    }
}
