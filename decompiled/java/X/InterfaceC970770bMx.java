package X;

import com.bytedance.android.live.liveinteract.competition.model.CompetitionInfo;
import com.bytedance.android.livesdk.model.message.CompetitionMessage;
import com.bytedance.android.livesdk.model.message.LinkMicBattleArmiesMessage;
import com.bytedance.android.livesdk.model.message.LinkMicBattleMessage;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleInfoResponse;

/* JADX INFO: renamed from: X.0bMx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public interface InterfaceC970770bMx extends InterfaceC919320a1y {
    boolean CB0(BattleInfoResponse battleInfoResponse);

    void J32(CompetitionMessage competitionMessage);

    void Sa0(LinkMicBattleArmiesMessage linkMicBattleArmiesMessage);

    void d1();

    C969470bKr getViewModel();

    void se(LinkMicBattleMessage linkMicBattleMessage);

    void zf2(CompetitionInfo competitionInfo);
}
