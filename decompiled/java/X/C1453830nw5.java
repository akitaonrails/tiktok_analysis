package X;

import android.content.Context;
import com.bytedance.als.h0;
import com.ss.android.ugc.aweme.creative.model.ChangeAvatarModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0nw5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1453830nw5 {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(Context context, VideoPublishEditModel videoPublishEditModel) {
        C01GW c01gw = C287080BNa.LIZIZ;
        if (((Boolean) c01gw.getValue()).booleanValue() && u4.LJIIZILJ(videoPublishEditModel) && videoPublishEditModel.isPrivate == 2) {
            return context.getString(2131826731);
        }
        if (C298680BnG.LIZ() && u4.LJIIZILJ(videoPublishEditModel) && videoPublishEditModel.isPrivate == 4) {
            return context.getString(2131839704);
        }
        if (((Boolean) c01gw.getValue()).booleanValue() && u4.LJIIZILJ(videoPublishEditModel) && videoPublishEditModel.isPrivate == 0) {
            return context.getString(2131826732);
        }
        if (C1444940nhk.LJFF(videoPublishEditModel.getCanvasVideoData())) {
            return context.getString(2131847917);
        }
        ChangeAvatarModel changeAvatarModel = videoPublishEditModel.creativeModel.changeAvatarModel;
        if (changeAvatarModel.isFromChangeAvatar) {
            if (changeAvatarModel.isFromSocialAvatar) {
                return context.getString(2131849137);
            }
            if (!videoPublishEditModel.mIsFromDraft || changeAvatarModel.isSingletonRecover) {
                return context.getString(2131845017);
            }
        }
        if (!u4.LJIIJ(videoPublishEditModel) && !C1428520nHG.LJJLL(videoPublishEditModel)) {
            return context.getString(2131849137);
        }
        return context.getString(2131845588);
    }

    public static h0 LIZIZ(C385680FAg c385680FAg, C1453870nw9 c1453870nw9, C1453870nw9 c1453870nw92, EnumC1453930nwF enumC1453930nwF, C1455250nyN c1455250nyN) {
        int i = C1453920nwE.LIZ[enumC1453930nwF.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return c1453870nw92.LIZLLL(EnumC1453850nw7.BACK_TO_EDIT_END);
                    }
                    throw new C1954807lC();
                }
                return c385680FAg.LIZ(new Pair(EnumC1453860nw8.EDIT_VIDEO_FRAME_AVAILABLE, c1453870nw9), new Pair(EnumC1453850nw7.UI_FIRST_FRAME, c1453870nw92), 1000L, c1455250nyN);
            }
            return c385680FAg.LIZ(new Pair(EnumC1453860nw8.EDIT_VIDEO_FRAME_AVAILABLE, c1453870nw9), new Pair(EnumC1453850nw7.UI_FIRST_FRAME, c1453870nw92), 500L, c1455250nyN);
        }
        if (((Number) C263520AUk.LIZ.getValue()).intValue() == 0) {
            return c1453870nw9.LIZLLL(EnumC1453860nw8.EDIT_VIDEO_FRAME_AVAILABLE);
        }
        return c385680FAg.LIZ(new Pair(EnumC1453860nw8.EDIT_VIDEO_FRAME_AVAILABLE, c1453870nw9), new Pair(EnumC1453850nw7.UI_FIRST_FRAME, c1453870nw92), 0L, c1455250nyN);
    }
}
