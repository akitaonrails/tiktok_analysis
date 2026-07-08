package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.List;

/* JADX INFO: renamed from: X.0ncQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1441640ncQ {
    public static final C1441620ncO LIZ(VideoPublishEditModel videoPublishEditModel) {
        List<StickerItemModel> list;
        C1441630ncP c1441630ncP = new C1441630ncP();
        if (videoPublishEditModel.isMvThemeVideoType()) {
            c1441630ncP.LIZ = EnumC1441650ncR.MV_THEME.getTag() | c1441630ncP.LIZ;
        }
        if (!TextUtils.isEmpty(videoPublishEditModel.getStickerID())) {
            c1441630ncP.LIZ = EnumC1441650ncR.RECORD_PROP.getTag() | c1441630ncP.LIZ;
        }
        if (videoPublishEditModel.getEffectList() != null && (!r0.isEmpty())) {
            c1441630ncP.LIZ = EnumC1441650ncR.EDIT_EFFECT.getTag() | c1441630ncP.LIZ;
        }
        InfoStickerModel infoStickerModel = videoPublishEditModel.getInfoStickerModel();
        if (infoStickerModel != null && (list = infoStickerModel.stickers) != null && (!list.isEmpty())) {
            c1441630ncP.LIZ = EnumC1441650ncR.EDIT_STICKER.getTag() | c1441630ncP.LIZ;
        }
        if (videoPublishEditModel.getOrigin() == 2) {
            c1441630ncP.LIZ = EnumC1441650ncR.RECORD_UPLOAD_VIDEO_SOUND.getTag() | c1441630ncP.LIZ;
        }
        return new C1441620ncO(c1441630ncP.LIZ);
    }
}
