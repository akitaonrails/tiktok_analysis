package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Size;
import android.widget.ImageView;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.services.story.forward.ICreativeForwardService;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1E2W, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1E2W implements ICreativeForwardService {
    public static final C1E2W LIZIZ = new C1E2W();
    public final /* synthetic */ ICreativeForwardService LIZ = (ICreativeForwardService) ServiceManager.get().getService(ICreativeForwardService.class);

    @Override // com.ss.android.ugc.aweme.services.story.forward.ICreativeForwardService
    public final void forwardOnThisDay(Context context, ForwardMedia forwardMedia, C0MMK c0mmk, Function0<Unit> function0) {
        this.LIZ.forwardOnThisDay(context, forwardMedia, c0mmk, function0);
    }

    @Override // com.ss.android.ugc.aweme.services.story.forward.ICreativeForwardService
    public final void forwardOnThisDay(Context context, String str, C0MMK c0mmk, int i, String str2, String str3, String str4, String str5, String str6) {
        this.LIZ.forwardOnThisDay(context, str, c0mmk, i, str2, str3, str4, str5, str6);
    }

    @Override // com.ss.android.ugc.aweme.services.story.forward.ICreativeForwardService
    public final void forwardOnThisDay(Context context, List<ForwardMedia> list, C0MMK c0mmk, int i, String str, String str2, boolean z, String str3, String str4, Function0<Unit> function0) {
        this.LIZ.forwardOnThisDay(context, list, c0mmk, i, str, str2, z, str3, str4, function0);
    }

    @Override // com.ss.android.ugc.aweme.services.story.forward.ICreativeForwardService
    public final Object generateCommentNoticePreviewCover(Context context, Comment comment, ForwardMedia forwardMedia, boolean z, InterfaceC1364105Vn<? super Bitmap> interfaceC1364105Vn) {
        return this.LIZ.generateCommentNoticePreviewCover(context, comment, forwardMedia, z, interfaceC1364105Vn);
    }

    @Override // com.ss.android.ugc.aweme.services.story.forward.ICreativeForwardService
    public final int getAlbumSkylightMinDisplayIntervalDays() {
        return this.LIZ.getAlbumSkylightMinDisplayIntervalDays();
    }

    @Override // com.ss.android.ugc.aweme.services.story.forward.ICreativeForwardService
    public final List<MediaModel> getOnThisDayLocalMedias(boolean z, String str) {
        return this.LIZ.getOnThisDayLocalMedias(z, str);
    }

    @Override // com.ss.android.ugc.aweme.services.story.forward.ICreativeForwardService
    public final boolean isOnThisDayPublishedToday() {
        return this.LIZ.isOnThisDayPublishedToday();
    }

    @Override // com.ss.android.ugc.aweme.services.story.forward.ICreativeForwardService
    public final void loadThumbnail(ImageView imageView, MediaModel mediaModel, Size size, Function1<? super Bitmap, Unit> function1) {
        this.LIZ.loadThumbnail(imageView, mediaModel, size, function1);
    }

    @Override // com.ss.android.ugc.aweme.services.story.forward.ICreativeForwardService
    public final boolean needJumpToOnThisDayPreviewPage() {
        return this.LIZ.needJumpToOnThisDayPreviewPage();
    }

    @Override // com.ss.android.ugc.aweme.services.story.forward.ICreativeForwardService
    public final boolean onThisDayCanScanAlbum() {
        return this.LIZ.onThisDayCanScanAlbum();
    }

    @Override // com.ss.android.ugc.aweme.services.story.forward.ICreativeForwardService
    public final boolean onThisDaySupportLowActivity() {
        return this.LIZ.onThisDaySupportLowActivity();
    }

    @Override // com.ss.android.ugc.aweme.services.story.forward.ICreativeForwardService
    public final boolean onThisDaySupportNonLowActivity() {
        return this.LIZ.onThisDaySupportNonLowActivity();
    }

    @Override // com.ss.android.ugc.aweme.services.story.forward.ICreativeForwardService
    public final boolean onThisDaySupportRecallLocalMedias() {
        return this.LIZ.onThisDaySupportRecallLocalMedias();
    }

    @Override // com.ss.android.ugc.aweme.services.story.forward.ICreativeForwardService
    public final boolean onThisDaySupportRecallMultiPost() {
        return this.LIZ.onThisDaySupportRecallMultiPost();
    }

    @Override // com.ss.android.ugc.aweme.services.story.forward.ICreativeForwardService
    public final boolean onThisDaySupportRecallMultiStory() {
        return this.LIZ.onThisDaySupportRecallMultiStory();
    }

    @Override // com.ss.android.ugc.aweme.services.story.forward.ICreativeForwardService
    public final void preDownloadOnThisDayFontList() {
        this.LIZ.preDownloadOnThisDayFontList();
    }

    @Override // com.ss.android.ugc.aweme.services.story.forward.ICreativeForwardService
    public final boolean shouldAddOnThisDayLocalMediaEntry() {
        return this.LIZ.shouldAddOnThisDayLocalMediaEntry();
    }

    @Override // com.ss.android.ugc.aweme.services.story.forward.ICreativeForwardService
    public final C0ML2 startForward(Context context, ForwardMedia forwardMedia, C0MMK c0mmk, Function1<? super C0ML2, Unit> function1) {
        return this.LIZ.startForward(context, forwardMedia, c0mmk, function1);
    }
}
