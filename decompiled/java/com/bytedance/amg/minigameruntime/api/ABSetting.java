package com.bytedance.amg.minigameruntime.api;

import X.C09CT;

/* JADX INFO: loaded from: classes21.dex */
public final class ABSetting {

    @C09CT("use_pref_frame_rate")
    public final boolean UsePrefFrameRate;

    @C09CT("emit_event_lock_free")
    public final boolean emitEventLockFree;

    @C09CT("file_multithread")
    public final boolean fileMultithreadSwitch;

    @C09CT("keva_storage")
    public final boolean kevaStorageSwitch;

    @C09CT("network")
    public final int network;

    @C09CT("network_untrusted_zone")
    public final int networkUntrustedZone;

    @C09CT("reduce_render_dpr_at_view_init")
    public final float reduceRenderDprAtViewInit;

    @C09CT("send_buffer_event")
    public final boolean sendBufferEvent;

    @C09CT("setup_gl_graphics_backend_when_surface_created")
    public final boolean setupGLGraphicsBackendWhenSurfaceCreated;

    @C09CT("storage_migration_v2")
    public final boolean storageMigrationV2;

    public ABSetting() {
        this(false, false, 1.0f, 1, true, true, true, false, 1, true);
    }

    public final ABSetting copy(boolean z, boolean z2, float f, int i, boolean z3, boolean z4, boolean z5, boolean z6, int i2, boolean z7) {
        return new ABSetting(z, z2, f, i, z3, z4, z5, z6, i2, z7);
    }

    public final boolean getUsePrefFrameRate() {
        return this.UsePrefFrameRate;
    }

    public ABSetting(boolean z, boolean z2, float f, int i, boolean z3, boolean z4, boolean z5, boolean z6, int i2, boolean z7) {
        this.UsePrefFrameRate = z;
        this.setupGLGraphicsBackendWhenSurfaceCreated = z2;
        this.reduceRenderDprAtViewInit = f;
        this.network = i;
        this.kevaStorageSwitch = z3;
        this.storageMigrationV2 = z4;
        this.fileMultithreadSwitch = z5;
        this.sendBufferEvent = z6;
        this.networkUntrustedZone = i2;
        this.emitEventLockFree = z7;
    }
}
