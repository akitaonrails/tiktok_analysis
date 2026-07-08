package com.bytedance.android.live.rank.impl.sticker.base;

import X.C09CT;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;

/* JADX INFO: loaded from: classes28.dex */
public final class RankStickerExtra {

    @C09CT("rank_type")
    public int rankType;

    @C09CT("show_type")
    public String showType;

    public RankStickerExtra() {
        RankTypeV2 rankTypeV2 = RankTypeV2.LIZ;
        this.rankType = RankTypeV2.LJJIJIIJI.type;
        this.showType = "";
    }
}
