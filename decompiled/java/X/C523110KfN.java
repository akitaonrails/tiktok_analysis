package X;

import Y.ACListenerS75S0300000_8;
import android.view.View;
import com.ss.android.ugc.aweme.creative.model.album.AlbumOpenApiModel;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;

/* JADX INFO: renamed from: X.0KfN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C523110KfN extends C524250KhD {
    public final ACListenerS75S0300000_8 LL;

    @Override // X.C524250KhD, X.InterfaceC529800KqA
    public View.OnClickListener getClickListener() {
        return this.LL;
    }

    public C523110KfN(RecordConfig recordConfig, MvChoosePhotoScene mvChoosePhotoScene, AlbumOpenApiModel albumOpenApiModel) {
        super(recordConfig);
        this.LL = new ACListenerS75S0300000_8(mvChoosePhotoScene, albumOpenApiModel, this, 0);
    }
}
