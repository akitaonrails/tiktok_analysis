package X;

import android.content.Context;
import android.content.Intent;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.composer.model.CreationConfigModelCompat;
import com.ss.android.ugc.aweme.composer.model.MixStudioShareStoryInputData;
import com.ss.android.ugc.aweme.creative.compileconfig.CompileConfigResolution;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.event.EventData;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.feed.model.im.MixStickerInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import com.ss.android.ugc.aweme.socialavatar.api.mixstudio.MixStudioShareSettings;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerCompatModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStyleModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStyleShadow;
import com.ss.ugc.aweme.creation.base.BasicModel;
import com.ss.ugc.aweme.creation.base.TrackModel;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0MiJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C575890MiJ {
    public final CreationConfigModelCompat LIZ;
    public DialogC1389620mGW LIZIZ;

    public C575890MiJ(CreationConfigModelCompat creationConfigModelCompat) {
        this.LIZ = creationConfigModelCompat;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(android.content.Context r21, X.InterfaceC1364105Vn<? super kotlin.Unit> r22) {
        /*
            Method dump skipped, instruction units count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C575890MiJ.LIZ(android.content.Context, X.05Vn):java.lang.Object");
    }

    public final Intent LIZJ(CreativeInfo creativeInfo, CanvasVideoData canvasVideoData, TextStickerData textStickerData) {
        String shootWay;
        MixStickerInfo mixStickerInfo;
        String enterFrom;
        String enterMethod;
        TrackModel track;
        TrackModel track2;
        TrackModel track3;
        Intent intent = new Intent();
        C0MUK.LJIIIZ(intent, C0MUK.LJIIIIZZ());
        intent.putExtra("creation_id", creativeInfo.getCreationId());
        BasicModel basic = this.LIZ.getBasic();
        if (basic != null && (track3 = basic.getTrack()) != null) {
            shootWay = track3.getShootWay();
        } else {
            shootWay = null;
        }
        intent.putExtra("shoot_way", shootWay);
        C0MUK.LIZIZ(intent).canvasVideoData = canvasVideoData;
        CreativeModel creativeModelLIZIZ = C0MUK.LIZIZ(intent);
        MixStudioShareStoryInputData mixStudioData = this.LIZ.getMixStudioData();
        if (mixStudioData != null) {
            mixStickerInfo = mixStudioData.getMixStickerInfo();
        } else {
            mixStickerInfo = null;
        }
        creativeModelLIZIZ.mixStickerInfo = mixStickerInfo;
        C0MUK.LIZIZ(intent).stickerModel.textStickerModels.add(C0F7U.LJ(textStickerData, null, 3));
        EventData eventData = C0MUK.LIZIZ(intent).eventData;
        BasicModel basic2 = this.LIZ.getBasic();
        if (basic2 != null && (track2 = basic2.getTrack()) != null) {
            enterFrom = track2.getEnterFrom();
        } else {
            enterFrom = null;
        }
        eventData.enterFrom = enterFrom;
        EventData eventData2 = C0MUK.LIZIZ(intent).eventData;
        BasicModel basic3 = this.LIZ.getBasic();
        if (basic3 != null && (track = basic3.getTrack()) != null) {
            enterMethod = track.getEnterMethod();
        } else {
            enterMethod = null;
        }
        eventData2.shootEnterMethod = enterMethod;
        intent.putExtra("workspace", C14D2.LIZ(creativeInfo));
        CompileConfigResolution compileConfigResolution = new CompileConfigResolution(1080, 1920, null, null, 12, null);
        CompileConfigResolution compileConfigResolution2 = new CompileConfigResolution(compileConfigResolution.width, compileConfigResolution.height, null, null, 12, null);
        int i = compileConfigResolution2.width;
        int i2 = compileConfigResolution2.height;
        C577660MlA.LIZ.getClass();
        VideoFileInfo videoFileInfo = new VideoFileInfo(i, i2, C577660MlA.LIZ().defaultDuration, 30, 0, 0, 0, 0, 0.0f, 496, null);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C0MPK.LIZ(creativeInfo));
        sbLIZ.append(C0MPK.LIZJ(".mp4"));
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C570490MZb.LJI(new C0VSJ(strLIZIZ));
        C0MUK.LIZIZ(intent).editModel.editPreviewInfo = new C538330L9j(compileConfigResolution2.width, compileConfigResolution2.height, 12).LIZ(new EditVideoSegment(strLIZIZ, null, videoFileInfo));
        return intent;
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [X.0MiM] */
    public static Object LIZLLL(Context context, MixStickerInfo mixStickerInfo, int i, C575900MiK c575900MiK) {
        String string;
        float f;
        Object obj;
        final C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(c575900MiK));
        c2252611DEt.LJIJJ();
        Integer type = mixStickerInfo.getType();
        if (type != null && type.intValue() == 3) {
            Object[] objArr = new Object[1];
            String data = mixStickerInfo.getData();
            if (data == null) {
                data = "";
            }
            objArr[0] = data;
            string = context.getString(2131825040, objArr);
        } else {
            string = context.getString(2131825041);
        }
        Pair pairLIZ = C0HBT.LIZ();
        int iIntValue = ((Number) pairLIZ.getFirst()).intValue();
        int iIntValue2 = ((Number) pairLIZ.getSecond()).intValue();
        int i2 = (int) (iIntValue * 0.8f);
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(C2286608xc.LJ(356)));
        if (i2 > iLIZIZ) {
            i2 = iLIZIZ;
        }
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(C2286608xc.LJ(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL)));
        if (i2 < iLIZIZ2) {
            i2 = iLIZIZ2;
        }
        int i3 = 24;
        int iLIZIZ3 = i2 + (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(C2286608xc.LJ(24))) * 2);
        if (string.length() > 50) {
            i3 = 22;
        }
        if (C426750GoL.LIZLLL(context)) {
            f = 6.0f;
        } else {
            f = -6.0f;
        }
        float f2 = iIntValue2 * (-0.24f);
        List<String> list = MixStudioShareSettings.LIZ().fontShadowColors;
        if (i >= 0 && i < list.size()) {
            obj = ListProtector.get(list, i);
        } else {
            obj = "#1A000000";
        }
        final TextStickerData textStickerData = new TextStickerData(string, 0, -1, 2, null, null, 0, 0, 0, 0, null, null, false, null, 0L, 0L, 0.0f, f2, 0L, false, false, false, null, null, f, 0.0f, false, false, false, 0, null, null, null, null, 0, null, null, i3, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, null, new TextStyleModel("", "", "", "", "#FFFFFF", new TextStyleShadow((String) obj, 0.0f, 0.125f, 0.75f), null, null, false, "", ""), null, null, false, false, null, null, false, false, false, false, new TextStickerCompatModel(false, false, null, null, null, null, null, null, C2286608xc.LJ(iLIZIZ3), false, null, null, null, 0, null, 0.0f, null, null, null, null, null, 2096895, null), -16908302, -33, -1, 2046, null);
        C19565911gn.LIZ();
        C122T.LIZ();
        C122T.LIZIZ();
        C0FI2 c0fi2LJIJJ = C0FI2.LJIJJ();
        String str = MixStudioShareSettings.LIZ().fontEffectId;
        String str2 = MixStudioShareSettings.LIZ().fontFileName;
        C056O c056o = C056O.MIX_STUDIO;
        ?? r5 = new C0FI9() { // from class: X.0MiM
            @Override // X.C0FI9
            public final void onFail() {
                InterfaceC20236714Gf<TextStickerData> interfaceC20236714Gf = c2252611DEt;
                TextStickerData textStickerData2 = textStickerData;
                C189200o6.m2constructorimpl(textStickerData2);
                interfaceC20236714Gf.resumeWith(textStickerData2);
                C201955140j.LIZLLL(C1465490oEt.LIZIZ, "MixStudioShareParser", "Get font Black fail");
            }

            @Override // X.C0FI9
            public final void onSuccess() {
                textStickerData.setFontType(MixStudioShareSettings.LIZ().fontFileName);
                InterfaceC20236714Gf<TextStickerData> interfaceC20236714Gf = c2252611DEt;
                TextStickerData textStickerData2 = textStickerData;
                C189200o6.m2constructorimpl(textStickerData2);
                interfaceC20236714Gf.resumeWith(textStickerData2);
            }

            @Override // X.C0FI9
            public final /* bridge */ /* synthetic */ void LIZ(Boolean bool) {
                bool.booleanValue();
            }
        };
        if (((ConcurrentHashMap) c0fi2LJIJJ.LIZJ).get(str2) == null && C0FI2.LJJIII(str2) == null) {
            C196909122h.LIZ().LJIIZILJ(str, new HashMap(), new C0FX6(c0fi2LJIJJ, r5, c056o, 0));
        } else {
            r5.onSuccess();
        }
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(c575900MiK);
        }
        return objLJIJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(android.content.Context r19, com.ss.android.ugc.aweme.feed.model.im.MixStickerInfo r20, com.ss.android.ugc.aweme.creative.model.CreativeInfo r21, int r22, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.canvas.CanvasVideoData> r23) {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C575890MiJ.LIZIZ(android.content.Context, com.ss.android.ugc.aweme.feed.model.im.MixStickerInfo, com.ss.android.ugc.aweme.creative.model.CreativeInfo, int, X.05Vn):java.lang.Object");
    }
}
