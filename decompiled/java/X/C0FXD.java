package X;

import android.widget.FrameLayout;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.editSticker.compile.TextStickerCompileResult;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0FXD, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public class C0FXD implements InterfaceC2385309Wh {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC2385309Wh
    public final Object then(C15O7 c15o7) {
        switch (this.$t) {
            case 0:
                return then$0(this, c15o7);
            case 1:
                return then$1(this, c15o7);
            default:
                return null;
        }
    }

    public static final Object then$0(C0FXD c0fxd, C15O7 c15o7) {
        C1C7U.LIZ("ReverseEffectHelper@538f.prepareVideoReverseGenerator$1");
        C0EPV c0epv = (C0EPV) c0fxd.l0;
        ProgressDialogC1397790mTh progressDialogC1397790mTh = c0epv.LJFF;
        if (progressDialogC1397790mTh != null && progressDialogC1397790mTh.isShowing()) {
            C0FNU.LIZ(c0epv.LJFF);
        }
        c0epv.LJI = 0;
        if (c15o7.LJIILJJIL() && ((Boolean) c15o7.LJIIL()).booleanValue()) {
            ((Function0) c0fxd.l1).invoke();
        } else {
            ((Function0) c0fxd.l2).invoke();
        }
        C1C7U.LIZIZ("ReverseEffectHelper@538f.prepareVideoReverseGenerator$1");
        return null;
    }

    public static final Object then$1(C0FXD c0fxd, C15O7 c15o7) {
        int duration;
        C1C7U.LIZ("EditStickerScene@bf5d.getTextStickerCompileTask$1");
        C201955140j.LIZJ(C1632480saE.LIZIZ, "EditStickerScene -> getTextStickerCompileTask success");
        for (TextStickerCompileResult textStickerCompileResult : (List) c15o7.LJIIL()) {
            TextStickerData textStickerData = textStickerCompileResult.textStickerData;
            textStickerData.setCanvasWidth(((InterfaceC384890F7f) c0fxd.l0).LLJIJIL().LJFF());
            textStickerData.setCanvasHeight(((InterfaceC384890F7f) c0fxd.l0).LLJIJIL().LIZJ());
            textStickerData.setVideoWidth(((InterfaceC1452170ntP) c0fxd.l1).getInitSize().width);
            textStickerData.setVideoHeight(((InterfaceC1452170ntP) c0fxd.l1).getInitSize().height);
            int startTime = 0;
            textStickerData.setAddToLayoutInPreviewOrCover(false);
            if (textStickerData.getLayoutWidth() == 0.0f || textStickerData.getLayoutHeight() == 0.0f) {
                FrameLayout frameLayout = ((C1462070o9N) c0fxd.l2).LLLFZ;
                FrameLayout frameLayout2 = null;
                if (frameLayout == null) {
                    frameLayout = null;
                }
                textStickerData.setLayoutWidth(frameLayout.getWidth());
                FrameLayout frameLayout3 = ((C1462070o9N) c0fxd.l2).LLLFZ;
                if (frameLayout3 != null) {
                    frameLayout2 = frameLayout3;
                }
                textStickerData.setLayoutHeight(frameLayout2.getHeight());
            }
            String json = GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), textStickerData);
            if (textStickerData.hasTimeData()) {
                startTime = textStickerData.getStartTime();
            }
            if (textStickerData.hasTimeData()) {
                duration = textStickerData.getEndTime();
            } else {
                duration = ((InterfaceC1452170ntP) c0fxd.l1).getDuration();
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("text_sticker_");
            sbLIZ.append(textStickerCompileResult.index);
            StickerItemModel stickerItemModel = new StickerItemModel(C2188811AlT.LIZIZ(sbLIZ), textStickerCompileResult.stickerPath, json, textStickerCompileResult.index, false, startTime, duration, 2);
            stickerItemModel.isImageStickerLayer = true;
            stickerItemModel.viewHash = textStickerCompileResult.viewHash;
            stickerItemModel.adjustTextParagraph = textStickerData.getAdjustTextParagraph();
            stickerItemModel.adjustTextStyleInEditorPro = textStickerData.getAdjustTextStyleInEditorPro();
            stickerItemModel.adjustTextColorInEditorPro = textStickerData.getAdjustTextColorInEditorPro();
            stickerItemModel.adjustTextFontInEditorPro = textStickerData.getAdjustTextFontInEditorPro();
            stickerItemModel.adjustTextPositionInEditorPro = textStickerData.getAdjustTextPositionInEditorPro();
            stickerItemModel.isEditorProTrimLength = textStickerData.isEditorProTrimLength();
            stickerItemModel.isEditorProText = textStickerData.isEditorProText();
            stickerItemModel.isEditorProCopyText = textStickerData.isEditorProCopyText();
            stickerItemModel.isEditorProTTS = textStickerData.isEditorProTTS();
            stickerItemModel.editorProTTSID = textStickerData.getEditorProTTSID();
            stickerItemModel.isEditorProCaption = textStickerData.isEditorProCaption();
            ((InterfaceC384890F7f) c0fxd.l0).LLZILL(stickerItemModel);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EditStickerScene@bf5d.getTextStickerCompileTask$1");
        return unit;
    }

    public C0FXD(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
