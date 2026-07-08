package X;

import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.livesdk.model.message.battle.BattleUserArmies;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleFeatureFlags;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleTeamUserArmies;
import com.bytedance.android.livesdkapi.depend.model.live.match.MatchPunishEffectInfo;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0bSv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public interface InterfaceC974470bSv {
    boolean LIZ();

    BattleFeatureFlags LIZJ();

    void LJI(Map<Long, BattleUserArmies> map);

    EnumC919170a1j LJIIIZ();

    long LJIIJ();

    void LJIIJJI();

    boolean LJIJJLI();

    void LJJII();

    String LJJIIZI();

    EnumC919170a1j LJJIJ();

    boolean LJJIJIIJIL();

    MatchPunishEffectInfo.EffectStruct LJJIZ();

    boolean LJJJI();

    boolean LJJJJI();

    MutableLiveData<List<C976480bWA>> LJJJJIZL();

    long LJJJJJL();

    void LJJJZ(boolean z);

    long LJJL();

    List<BattleTeamUserArmies> LJJLI();

    void LJJLIL(long j);

    Map<Long, Long> LJJLJLI();

    Map<Long, BattleUserArmies> LJJLL();

    void LJJZZIII(List<BattleTeamUserArmies> list);
}
