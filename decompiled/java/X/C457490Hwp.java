package X;

import android.app.Activity;
import android.view.View;
import com.ss.android.ugc.aweme.album.IAlbumUpdateGuideViewModel;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0Hwp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C457490Hwp extends C2217421BqW implements InterfaceC1631620sYq<View, Activity, SessionInfo, Unit> {
    public C457490Hwp(IAlbumUpdateGuideViewModel iAlbumUpdateGuideViewModel) {
        super(3, iAlbumUpdateGuideViewModel, IAlbumUpdateGuideViewModel.class, "openPreview", "openPreview(Landroid/view/View;Landroid/app/Activity;Lcom/ss/android/ugc/aweme/im/chatroom/api/model/SessionInfo;)V", 0);
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(View view, Activity activity, SessionInfo sessionInfo) {
        ((IAlbumUpdateGuideViewModel) this.receiver).zQ2(activity, sessionInfo);
        return Unit.LIZ;
    }
}
