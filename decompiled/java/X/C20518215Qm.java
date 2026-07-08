package X;

import android.graphics.Bitmap;
import android.graphics.Color;
import com.bytedance.fly_main_color.FlyMainColor;
import com.ss.android.ugc.aweme.creative.model.MusicShareStoryData;
import com.ss.android.ugc.aweme.social.sharestory.BlackMusicCardParam;
import com.ss.android.ugc.aweme.social.sharestory.NonBlackMusicCardParam;

/* JADX INFO: renamed from: X.15Qm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20518215Qm {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v0, types: [com.ss.android.ugc.effectmanager.effect.model.Effect] */
    /* JADX WARN: Type inference failed for: r26v1, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r27v1, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r28v1, types: [com.ss.android.ugc.aweme.music.model.LyricStickerStruct] */
    public static MusicShareStoryData LIZ(Bitmap bitmap) {
        String str;
        int iIntValue;
        Integer numLIZIZ;
        Integer num = -1;
        Integer num2 = null;
        int iIntValue2 = -16777216;
        if (C0C64.LJIILLIIL().LJIJ(31744, 1, "music_share_story_music_card_style", true) == 1) {
            str = null;
            BlackMusicCardParam blackMusicCardParam = new BlackMusicCardParam(8.0f, 0.0f, 0.12f, 0.3f, 0.6f, 8.0f, 0.85f, 50.0f, 0.0f, 0.1f, 0.8f, 1.0f);
            C204674156y c204674156yLIZ = FlyMainColor.LIZ.LIZ(new C2439109h7(bitmap, null));
            c204674156yLIZ.LJFF(blackMusicCardParam.getBgTolerance());
            c204674156yLIZ.LJ(blackMusicCardParam.getBgChromaMin(), blackMusicCardParam.getBgChromaMax(), blackMusicCardParam.getBgLMin(), blackMusicCardParam.getBgLMax(), 0.0f);
            c204674156yLIZ.LJI(blackMusicCardParam.getBgLAddition());
            Integer numLIZIZ2 = c204674156yLIZ.LIZIZ();
            if (numLIZIZ2 != null) {
                iIntValue = numLIZIZ2.intValue();
            } else {
                iIntValue = -16777216;
            }
            Integer numLIZJ = c204674156yLIZ.LIZJ();
            if (numLIZJ != null) {
                iIntValue2 = numLIZJ.intValue();
            }
            c204674156yLIZ.LJFF(blackMusicCardParam.getAudioTolerance());
            c204674156yLIZ.LJ(blackMusicCardParam.getAudioChromaMin(), blackMusicCardParam.getAudioChromaMax(), blackMusicCardParam.getAudioLMin(), blackMusicCardParam.getAudioLMax(), 0.0f);
            Integer numLIZIZ3 = c204674156yLIZ.LIZIZ();
            if (numLIZIZ3 != null) {
                num = numLIZIZ3;
            }
            numLIZIZ = num;
        } else {
            str = null;
            NonBlackMusicCardParam nonBlackMusicCardParam = new NonBlackMusicCardParam(8.0f, 0.0f, 0.12f, 0.3f, 0.6f, 8.0f, 0.3f, 50.0f, 0.0f, 0.1f, 0.8f, 1.0f);
            FlyMainColor flyMainColor = FlyMainColor.LIZ;
            C204674156y c204674156yLIZ2 = flyMainColor.LIZ(new C2439109h7(bitmap, null));
            c204674156yLIZ2.LJFF(nonBlackMusicCardParam.getBgTolerance());
            c204674156yLIZ2.LJ(nonBlackMusicCardParam.getBgChromaMin(), nonBlackMusicCardParam.getBgChromaMax(), nonBlackMusicCardParam.getBgLMin(), nonBlackMusicCardParam.getBgLMax(), 0.0f);
            c204674156yLIZ2.LJI(nonBlackMusicCardParam.getBgLAddition());
            Integer numLIZIZ4 = c204674156yLIZ2.LIZIZ();
            if (numLIZIZ4 != null) {
                iIntValue = numLIZIZ4.intValue();
            } else {
                iIntValue = -16777216;
            }
            Integer numLIZJ2 = c204674156yLIZ2.LIZJ();
            if (numLIZJ2 != null) {
                iIntValue2 = numLIZJ2.intValue();
            }
            float[] fArr = new float[3];
            Color.colorToHSV(iIntValue, fArr);
            Integer numValueOf = Integer.valueOf(Color.HSVToColor(new float[]{fArr[0], fArr[1], nonBlackMusicCardParam.getCardL()}));
            C204674156y c204674156yLIZ3 = flyMainColor.LIZ(new C2439109h7(bitmap, null));
            c204674156yLIZ3.LJFF(nonBlackMusicCardParam.getAudioTolerance());
            c204674156yLIZ3.LJ(nonBlackMusicCardParam.getAudioChromaMin(), nonBlackMusicCardParam.getAudioChromaMax(), nonBlackMusicCardParam.getAudioLMin(), nonBlackMusicCardParam.getAudioLMax(), 0.0f);
            numLIZIZ = c204674156yLIZ3.LIZIZ();
            if (numLIZIZ == null) {
                numLIZIZ = numValueOf;
            }
            num2 = numValueOf;
        }
        return new MusicShareStoryData(str, str, iIntValue, iIntValue2, num2, num, numLIZIZ, str, str, str, str, str);
    }
}
