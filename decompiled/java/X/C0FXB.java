package X;

import android.graphics.Bitmap;
import android.view.View;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.editSticker.compile.TextStickerCompileResult;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import java.io.File;
import java.util.List;
import kotlin.Unit;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0FXB, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public class C0FXB implements InterfaceC2385309Wh {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC2385309Wh
    public final Object then(C15O7 c15o7) {
        switch (this.$t) {
            case 0:
                return then$0(this, c15o7);
            case 1:
                return then$1(this, c15o7);
            case 2:
                return then$2(this, c15o7);
            case 3:
                return then$3(this, c15o7);
            default:
                return null;
        }
    }

    public static final Object then$0(C0FXB c0fxb, C15O7 c15o7) {
        String strLIZIZ;
        C0FT3 c0ft3;
        C1C7U.LIZ("StickerCompilerManager@f6a9.getCompileStickerTask$2");
        Bitmap bitmap = (Bitmap) c15o7.LJIIL();
        if (bitmap == null) {
            c0ft3 = new C0FT3(0);
        } else {
            String str = ((C0FT4) c0fxb.l0).LIZ;
            String str2 = File.separator;
            if (u.LJIIZILJ(str, str2, false)) {
                strLIZIZ = ((C0FT4) c0fxb.l0).LIZ;
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(((C0FT4) c0fxb.l0).LIZ);
                sbLIZ.append(str2);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(strLIZIZ);
            sbLIZ2.append(((BaseStickerModel) c0fxb.l1).getId());
            sbLIZ2.append(".png");
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            C0VSJ c0vsj = new C0VSJ(strLIZIZ2);
            try {
                if (c0vsj.exists()) {
                    if (c0vsj.isDirectory()) {
                        C2286708xd.LJIIZILJ(strLIZIZ2);
                    } else {
                        c0vsj.delete();
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            C2286708xd.LJIIIIZZ(strLIZIZ2, true);
            boolean zLJFF = C2475009mu.LJFF(100, Bitmap.CompressFormat.PNG, bitmap, new C0VSJ(strLIZIZ2));
            C2475009mu.LJ(bitmap);
            c0ft3 = new C0FT3(strLIZIZ2, zLJFF);
        }
        C1C7U.LIZIZ("StickerCompilerManager@f6a9.getCompileStickerTask$2");
        return c0ft3;
    }

    public static final Object then$1(C0FXB c0fxb, C15O7 c15o7) {
        int startTime;
        int duration;
        C1C7U.LIZ("FTCEditStickerScene@9f08.getTextStickerCompileTask$1");
        for (TextStickerCompileResult textStickerCompileResult : (List) c15o7.LJIIL()) {
            TextStickerData textStickerData = textStickerCompileResult.textStickerData;
            String json = GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), textStickerData);
            if (textStickerData.hasTimeData()) {
                startTime = textStickerData.getStartTime();
            } else {
                startTime = 0;
            }
            if (textStickerData.hasTimeData()) {
                duration = textStickerData.getEndTime();
            } else {
                duration = ((InterfaceC1452170ntP) c0fxb.l0).getDuration();
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("text_sticker_");
            sbLIZ.append(textStickerCompileResult.index);
            StickerItemModel stickerItemModel = new StickerItemModel(C2188811AlT.LIZIZ(sbLIZ), textStickerCompileResult.stickerPath, json, textStickerCompileResult.index, false, startTime, duration, 2);
            stickerItemModel.isImageStickerLayer = true;
            stickerItemModel.viewHash = textStickerCompileResult.viewHash;
            ((InterfaceC384890F7f) c0fxb.l1).LLZILL(stickerItemModel);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FTCEditStickerScene@9f08.getTextStickerCompileTask$1");
        return unit;
    }

    public static final Object then$2(C0FXB c0fxb, C15O7 c15o7) {
        C1C7U.LIZ("EditorProStickPointNLEHandler@b1b1.updateAlgorithmFromNormal$2");
        if (c15o7 != null && c15o7.LJIIL() != null) {
            ((C357990E1t) c0fxb.l0).LJ((InterfaceC358010E1v) c0fxb.l1, ((Number) c15o7.LJIIL()).intValue());
        } else {
            ((C357990E1t) c0fxb.l0).LIZLLL((InterfaceC358010E1v) c0fxb.l1);
        }
        C1C7U.LIZIZ("EditorProStickPointNLEHandler@b1b1.updateAlgorithmFromNormal$2");
        return null;
    }

    public static final Object then$3(C0FXB c0fxb, C15O7 c15o7) {
        InterfaceC2257101DWa interfaceC2257101DWa;
        View view;
        C1C7U.LIZ("EPInitLegacyBizController@227b.updateEditorEffectInfoTitle$3");
        if (!c15o7.LJIILIIL() && !c15o7.LJIILL()) {
            interfaceC2257101DWa = (InterfaceC2257101DWa) c15o7.LJIIL();
        } else {
            interfaceC2257101DWa = ((C0EK4) c0fxb.l0).LIZ.LLLFF.get(((C0EGS) c0fxb.l1).LIZ);
        }
        if (interfaceC2257101DWa == null) {
            C0EGE c0ege = ((C0EK4) c0fxb.l0).LIZ.LLILZ.LLLILZ;
            if (c0ege != null && (view = c0ege.LJII) != null) {
                C786410Ut5.LJLLLLLL(8, view);
            }
        } else {
            ((C0EK4) c0fxb.l0).LJFF(interfaceC2257101DWa);
            ((C0EK4) c0fxb.l0).LIZ.LLLFF.put(((C0EGS) c0fxb.l1).LIZ, interfaceC2257101DWa);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EPInitLegacyBizController@227b.updateEditorEffectInfoTitle$3");
        return unit;
    }

    public C0FXB(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
