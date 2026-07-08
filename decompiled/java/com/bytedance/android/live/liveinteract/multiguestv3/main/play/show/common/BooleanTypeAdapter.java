package com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common;

import X.C09CU;
import X.C09D6;
import X.C09EB;

/* JADX INFO: loaded from: classes4.dex */
public final class BooleanTypeAdapter extends com.bytedance.android.livesdk.model.utils.adapter.BooleanTypeAdapter {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.android.livesdk.model.utils.adapter.BooleanTypeAdapter, com.google.gson.TypeAdapter
    public final Boolean read(C09CU c09cu) {
        C09D6 c09d6LJJLIIIJ;
        Boolean boolValueOf;
        if (c09cu != null && (c09d6LJJLIIIJ = c09cu.LJJLIIIJ()) != null && C09EB.LIZ[c09d6LJJLIIIJ.ordinal()] == 1 && (boolValueOf = Boolean.valueOf(Boolean.parseBoolean(c09cu.LJJJZ()))) != null) {
            return boolValueOf;
        }
        return super.read(c09cu);
    }

    @Override // com.bytedance.android.livesdk.model.utils.adapter.BooleanTypeAdapter, com.google.gson.TypeAdapter
    public final /* bridge */ /* synthetic */ Boolean read(C09CU c09cu) {
        return read(c09cu);
    }
}
