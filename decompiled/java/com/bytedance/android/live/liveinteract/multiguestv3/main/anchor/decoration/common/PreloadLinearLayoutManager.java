package com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.decoration.common;

import X.C21673919s1;
import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;

/* JADX INFO: loaded from: classes16.dex */
public final class PreloadLinearLayoutManager extends LinearLayoutManager {
    public final int LL;

    public PreloadLinearLayoutManager(Context context) {
        super(context, 1, false);
        this.LL = 500;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final int getExtraLayoutSpace(C21673919s1 c21673919s1) {
        return this.LL;
    }
}
