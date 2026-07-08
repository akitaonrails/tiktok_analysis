package com.bytedance.android.live.liveinteract.competition.game.event;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes13.dex */
public final class GameCrossScreenSeiInfo {

    @C09CT("battle_id")
    public final long battleId;

    @C09CT("create_time")
    public final long createTime;

    @C09CT("linkmic_id")
    public final String linkMicId;

    @C09CT("max_combo")
    public final long maxCombo;

    @C09CT("score")
    public final long score;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GameCrossScreenSeiInfo(linkMicId=");
        sbLIZ.append(this.linkMicId);
        sbLIZ.append(", battleId=");
        sbLIZ.append(this.battleId);
        sbLIZ.append(", score=");
        sbLIZ.append(this.score);
        sbLIZ.append(", createTime=");
        sbLIZ.append(this.createTime);
        sbLIZ.append(", maxCombo=");
        sbLIZ.append(this.maxCombo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public GameCrossScreenSeiInfo() {
        this("", 0L, 0L, 0L, 0L);
    }

    public GameCrossScreenSeiInfo(String str, long j, long j2, long j3, long j4) {
        this.linkMicId = str;
        this.battleId = j;
        this.score = j2;
        this.createTime = j3;
        this.maxCombo = j4;
    }
}
