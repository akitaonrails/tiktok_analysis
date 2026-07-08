package com.aweme.storage.experiments;

import X.C09CT;

/* JADX INFO: loaded from: classes36.dex */
public final class M2DraftCleanConfig {

    @C09CT("available_storage")
    public final long availableStorage;

    @C09CT("clean_draft_count")
    public final int cleanDraftCount;

    @C09CT("download_count")
    public final int downloadCount;

    @C09CT("draft_count")
    public final int draftCount;

    @C09CT("draft_storage_size")
    public final long draftStorageSize;

    public M2DraftCleanConfig() {
        this(1500L, 0, 1500L, 3, 3);
    }

    public M2DraftCleanConfig(long j, int i, long j2, int i2, int i3) {
        this.availableStorage = j;
        this.draftCount = i;
        this.draftStorageSize = j2;
        this.downloadCount = i2;
        this.cleanDraftCount = i3;
    }
}
