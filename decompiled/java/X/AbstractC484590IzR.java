package X;

import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Pair;
import kotlin.jvm.internal.AwS373S0200000_7;
import webcast.api.room.StrategyData;
import webcast.api.room.StrategyFilter;

/* JADX INFO: renamed from: X.0IzR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC484590IzR {
    public final int LIZ;
    public final StrategyFilter LIZIZ;

    public abstract boolean LIZ(DataChannel dataChannel, StrategyData strategyData);

    public abstract void LJ(DataChannel dataChannel, EnterRoomConfig enterRoomConfig, StrategyData strategyData, C484610IzT c484610IzT, long j, long j2, AwS373S0200000_7 awS373S0200000_7);

    public abstract boolean LJFF(DataChannel dataChannel);

    public AbstractC484590IzR(int i, StrategyFilter strategyFilter) {
        this.LIZ = i;
        this.LIZIZ = strategyFilter;
    }

    public final void LIZIZ(int i, long j) {
        C484640IzW.LIZ(C2097608Jq.LJIIIIZZ(new Pair("room_id", String.valueOf(j)), new Pair("event_type", "3"), new Pair("trigger_type", String.valueOf(i)), new Pair("has_error", "true"), new Pair("strategy_scene", String.valueOf(this.LIZ))));
    }

    public final void LIZLLL(int i, long j) {
        C484640IzW.LIZ(C2097608Jq.LJIIIIZZ(new Pair("room_id", String.valueOf(j)), new Pair("event_type", "2"), new Pair("trigger_type", String.valueOf(i)), new Pair("strategy_scene", String.valueOf(this.LIZ))));
    }

    public final void LIZJ(int i, long j, Long l) {
        C484640IzW.LIZ(C2097608Jq.LJIIIIZZ(new Pair("room_id", String.valueOf(j)), new Pair("event_type", "3"), new Pair("trigger_type", String.valueOf(i)), new Pair("has_error", "false"), new Pair("decision", String.valueOf(l)), new Pair("strategy_scene", String.valueOf(this.LIZ))));
    }
}
