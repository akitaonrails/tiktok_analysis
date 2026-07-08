package X;

import com.ss.android.ugc.aweme.album.AlbumUpdateGuideViewModel;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.message.template.data.QuoteMode;

/* JADX INFO: renamed from: X.09MU, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.album.AlbumUpdateGuideViewModel", f = "AlbumUpdateGuideViewModel.kt", l = {137, 139, 142}, m = "openPreviewForUri")
public final class C09MU extends AbstractC23140094w {
    public Object LL;
    public SessionInfo LLILLJJLI;
    public QuoteMode LLILLL;
    public C07WI LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ AlbumUpdateGuideViewModel LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C09MU(AlbumUpdateGuideViewModel albumUpdateGuideViewModel, InterfaceC1364105Vn<? super C09MU> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = albumUpdateGuideViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AlbumUpdateGuideViewModel@c21.openPreviewForUri$1");
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        Object objAQ2 = this.LLILZLL.AQ2(null, null, null, null, this);
        C1C7U.LIZIZ("AlbumUpdateGuideViewModel@c21.openPreviewForUri$1");
        return objAQ2;
    }
}
