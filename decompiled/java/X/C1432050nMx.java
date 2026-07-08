package X;

import com.ss.android.ugc.aweme.services.IFoundationAVService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import v7.o;

/* JADX INFO: renamed from: X.0nMx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1432050nMx implements IFoundationAVService.IFetchResourcesListener {
    public final /* synthetic */ o<Unit> LIZ;
    public final /* synthetic */ VideoPublishEditModel LIZIZ;

    @Override // com.ss.android.ugc.aweme.services.IFoundationAVService.IFetchResourcesListener
    public final void onFailed(Exception exc) {
        C201955140j.LIZ("fetchMusicSyncModelTask: fetch effect for music sync failed and disable editMusicSyncMode");
        this.LIZIZ.setEditMusicSyncMode(false);
    }

    @Override // com.ss.android.ugc.aweme.services.IFoundationAVService.IFetchResourcesListener
    public final void onSuccess(String[] strArr) {
        C201955140j.LIZ("fetchMusicSyncModelTask: fetch effect for music sync successfully");
        this.LIZ.LJ(Unit.LIZ);
    }

    public C1432050nMx(o<Unit> oVar, VideoPublishEditModel videoPublishEditModel) {
        this.LIZ = oVar;
        this.LIZIZ = videoPublishEditModel;
    }
}
