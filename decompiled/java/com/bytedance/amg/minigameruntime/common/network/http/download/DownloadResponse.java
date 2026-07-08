package com.bytedance.amg.minigameruntime.common.network.http.download;

import X.C1502140pC0;
import java.io.File;

/* JADX INFO: loaded from: classes24.dex */
public final class DownloadResponse {
    public final int code;
    public final long contentLength;
    public final String contentType;
    public final C1502140pC0 headers;
    public final String message;
    public final File targetFile;
    public final Throwable throwable;

    public final boolean isNetSuccessful() {
        int i;
        return this.throwable == null && 200 <= (i = this.code) && i < 300;
    }

    public final boolean isSuccessful() {
        File file;
        return isNetSuccessful() && (file = this.targetFile) != null && file.exists();
    }

    public final int getCode() {
        return this.code;
    }

    public final long getContentLength() {
        return this.contentLength;
    }

    public final String getContentType() {
        return this.contentType;
    }

    public final C1502140pC0 getHeaders() {
        return this.headers;
    }

    public final String getMessage() {
        return this.message;
    }

    public final File getTargetFile() {
        return this.targetFile;
    }

    public final Throwable getThrowable() {
        return this.throwable;
    }

    public DownloadResponse(int i, String str, File file, C1502140pC0 c1502140pC0, String str2, long j, Throwable th) {
        this.code = i;
        this.message = str;
        this.targetFile = file;
        this.headers = c1502140pC0;
        this.contentType = str2;
        this.contentLength = j;
        this.throwable = th;
    }
}
