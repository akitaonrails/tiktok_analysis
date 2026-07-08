package com.bytedance.amg.minigameruntime.api;

import android.app.Activity;
import android.view.SurfaceView;

/* JADX INFO: loaded from: classes21.dex */
public final class RefreshParams {
    public Activity LIZ;
    public SurfaceView LIZIZ;
    public IClientAdapterService LIZJ;

    public final Activity getActivity() {
        return this.LIZ;
    }

    public final IClientAdapterService getClientAdapter() {
        return this.LIZJ;
    }

    public final SurfaceView getSurfaceView() {
        return this.LIZIZ;
    }

    public final void setActivity(Activity activity) {
        this.LIZ = activity;
    }

    public final void setClientAdapter(IClientAdapterService iClientAdapterService) {
        this.LIZJ = iClientAdapterService;
    }

    public final void setSurfaceView(SurfaceView surfaceView) {
        this.LIZIZ = surfaceView;
    }
}
