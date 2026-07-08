package X;

import android.graphics.RectF;
import com.bytedance.ies.nle.editor_jni.INLEStickerRuntime;
import com.bytedance.ies.nle.editor_jni.NLERectF;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerCompatModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextTemplateModel;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0F4t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C384250F4t {
    public final C0FGA LIZ;
    public TextStickerModel LIZJ;
    public final CopyOnWriteArraySet<Function1<Integer, Unit>> LIZIZ = new CopyOnWriteArraySet<>();
    public C0FHI LIZLLL = C0FHI.CREATED;

    public final int LIZ() {
        TextTemplateModel textTemplateModel;
        TextStickerCompatModel compatModel;
        TextStickerModel textStickerModel = this.LIZJ;
        if (textStickerModel != null && (compatModel = textStickerModel.getCompatModel()) != null) {
            Integer numValueOf = Integer.valueOf(compatModel.getSelectSlotIndex());
            if (numValueOf.intValue() >= 0) {
                return numValueOf.intValue();
            }
        }
        TextStickerModel textStickerModel2 = this.LIZJ;
        if (textStickerModel2 == null || (textTemplateModel = textStickerModel2.getTextTemplateModel()) == null) {
            return 1;
        }
        return textTemplateModel.defaultSelectIndex;
    }

    public C384250F4t(C0FGA c0fga) {
        this.LIZ = c0fga;
    }

    public final RectF LIZIZ(float f, int i, int i2) {
        INLEStickerRuntime stickerApi;
        NLETrackSlot nLETrackSlotLIZLLL;
        RectF rectF;
        TextStickerCompatModel compatModel;
        String str;
        float scale;
        BaseStickerModel baseStickerModel;
        TextTemplateModel textTemplateModel;
        C0FGA c0fga = this.LIZ;
        if (c0fga != null) {
            stickerApi = c0fga.getStickerApi();
        } else {
            stickerApi = null;
        }
        C0FGA c0fga2 = this.LIZ;
        if (c0fga2 == null) {
            C0F8J.LIZ("inspiration", "stickerPlayer is null, cannot get template info");
            nLETrackSlotLIZLLL = null;
        } else {
            nLETrackSlotLIZLLL = c0fga2.LIZLLL();
        }
        if (stickerApi != null && nLETrackSlotLIZLLL != null) {
            try {
                NLERectF newTextTemplateBoundingBox = stickerApi.getNewTextTemplateBoundingBox(nLETrackSlotLIZLLL);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("getMainTemplateBoundsNormalized templateId: ");
                TextStickerModel textStickerModel = this.LIZJ;
                if (textStickerModel != null && (textTemplateModel = textStickerModel.getTextTemplateModel()) != null) {
                    str = textTemplateModel.templateuuid;
                } else {
                    str = null;
                }
                sbLIZ.append(str);
                sbLIZ.append(" normalizedBounds: left");
                sbLIZ.append(newTextTemplateBoundingBox.getLeft());
                sbLIZ.append(" top");
                sbLIZ.append(newTextTemplateBoundingBox.getTop());
                sbLIZ.append(" right");
                sbLIZ.append(newTextTemplateBoundingBox.getRight());
                sbLIZ.append(" bottom");
                sbLIZ.append(newTextTemplateBoundingBox.getBottom());
                C0F8J.LIZ("inspiration", C2188811AlT.LIZIZ(sbLIZ));
                if (newTextTemplateBoundingBox.getLeft() < newTextTemplateBoundingBox.getRight() && newTextTemplateBoundingBox.getTop() > newTextTemplateBoundingBox.getBottom()) {
                    TextStickerModel textStickerModel2 = this.LIZJ;
                    if (textStickerModel2 != null && (baseStickerModel = textStickerModel2.getBaseStickerModel()) != null) {
                        scale = baseStickerModel.getScale();
                    } else {
                        scale = 1.0f;
                    }
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("getMainBoundingBox, left: ");
                    sbLIZ2.append(newTextTemplateBoundingBox.getLeft());
                    sbLIZ2.append(" top: ");
                    sbLIZ2.append(newTextTemplateBoundingBox.getTop());
                    sbLIZ2.append(" right: ");
                    sbLIZ2.append(newTextTemplateBoundingBox.getRight());
                    sbLIZ2.append(" bottom: ");
                    sbLIZ2.append(newTextTemplateBoundingBox.getBottom());
                    C0F8J.LIZ("inspiration-boundingbox", C2188811AlT.LIZIZ(sbLIZ2));
                    rectF = new RectF();
                    rectF.left = ((newTextTemplateBoundingBox.getLeft() / scale) + 1.0f) / 2.0f;
                    rectF.top = (1.0f - (newTextTemplateBoundingBox.getTop() / scale)) / 2.0f;
                    rectF.right = ((newTextTemplateBoundingBox.getRight() / scale) + 1.0f) / 2.0f;
                    rectF.bottom = (1.0f - (newTextTemplateBoundingBox.getBottom() / scale)) / 2.0f;
                } else {
                    rectF = null;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C0F8J.LIZ("inspiration", "getMainTemplateBoundsNormalized return default position");
                rectF = new RectF(0.1f, 0.2f, 0.9f, 0.8f);
            }
        } else {
            C0F8J.LIZ("inspiration", "getMainTemplateBoundsNormalized return default position");
            rectF = new RectF(0.1f, 0.2f, 0.9f, 0.8f);
        }
        if (rectF == null) {
            return null;
        }
        float f2 = i;
        float f3 = i2;
        RectF rectF2 = new RectF(rectF.left * f2 * f, rectF.top * f3 * f, rectF.right * f2 * f, rectF.bottom * f3 * f);
        TextStickerModel textStickerModel3 = this.LIZJ;
        if (textStickerModel3 != null && (compatModel = textStickerModel3.getCompatModel()) != null) {
            compatModel.setGroupTemplatePreviewBoundWidth(rectF2.width());
        }
        return rectF2;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.RectF LIZJ(float r8, int r9, int r10, int r11) {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C384250F4t.LIZJ(float, int, int, int):android.graphics.RectF");
    }
}
