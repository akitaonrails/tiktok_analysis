package com.bytedance.android.live.liveinteract.api;

import X.C006A;

/* JADX INFO: loaded from: classes13.dex */
public interface IMatchViolationEventHelper extends C006A {
    void clearSceneType();

    String getSceneType();

    boolean isMatchOnViolation();

    /* bridge */ /* synthetic */ void onInit();

    void resetMatchOnViolation();

    void setMatchOnViolation();
}
