package com.bytedance.amg.minigameruntime.api;

/* JADX INFO: loaded from: classes21.dex */
public final class GameDirectoryConfig {
    public int maxSize;
    public String path;

    public final GameDirectoryConfig copy(String str, int i) {
        return new GameDirectoryConfig(str, i);
    }

    public GameDirectoryConfig() {
        this("", -1);
    }

    public final void setMaxSize(int i) {
        this.maxSize = i;
    }

    public final void setPath(String str) {
        this.path = str;
    }

    public GameDirectoryConfig(String str, int i) {
        this.path = str;
        this.maxSize = i;
    }
}
