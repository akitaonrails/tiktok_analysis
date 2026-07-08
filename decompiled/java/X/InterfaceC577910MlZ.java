package X;

import android.app.Activity;
import android.content.Intent;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.mediachoose.helper.AIGCInfo;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.beauty.BeautifySegmentInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import dmt.av.video.SingleImageCoverBitmapData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0MlZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public interface InterfaceC577910MlZ {
    ShortVideoContext createShortVideoContext(Intent intent);

    boolean enable3MinRecord();

    Activity findActivityInstance(Class<? extends C19EG> cls);

    InterfaceC578020Mlk getABService();

    InterfaceC533840Kwg getAlbumService();

    String getBottomTabTag(int i, ShortVideoContext shortVideoContext);

    String getDefaultShootTabTag(ShortVideoContext shortVideoContext);

    InterfaceC537150L4v getMaxDurationResolver();

    InterfaceC1675320thK getNowUIService();

    int getTabNameResId(int i, ShortVideoContext shortVideoContext);

    void goToEditForCanvasPhoto(C19EG c19eg, String str, ShortVideoContext shortVideoContext, FaceStickerBean faceStickerBean, BeautifySegmentInfo beautifySegmentInfo, int i, AIGCInfo aIGCInfo, boolean z, Function1<? super Boolean, Unit> function1);

    void goToPhotoEditInImageMode(C19EG c19eg, String str, ShortVideoContext shortVideoContext, FaceStickerBean faceStickerBean, BeautifySegmentInfo beautifySegmentInfo, int i, AIGCInfo aIGCInfo, Function1<? super Boolean, Unit> function1);

    void isAiVideoPhotoModeBackPressed(ShortVideoContext shortVideoContext, Activity activity);

    boolean isRecordingOrEditing();

    void photoCanvasGoEditPage(C577710MlF c577710MlF, CanvasVideoData canvasVideoData, SingleImageCoverBitmapData singleImageCoverBitmapData);

    void photoCanvasGoNext(C19EG c19eg, String str, ShortVideoContext shortVideoContext, FaceStickerBean faceStickerBean, boolean z, MediaModel mediaModel, Long l, Function1<? super Boolean, Unit> function1);

    void preloadEffectModel();

    void preloadVESoAsync();

    void preloadVESoAsync(long j);

    boolean shouldDisable10MinDraftRecord(VideoPublishEditModel videoPublishEditModel);

    boolean shouldDropCurrentMusicFor3min(Object obj, ShortVideoContext shortVideoContext);
}
