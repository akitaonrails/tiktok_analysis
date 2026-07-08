package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;
import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.0pom, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public enum EnumC1526180pom implements WireEnum {
    Def(0),
    Init(1),
    Ping(2),
    Switch(3),
    ReConnect(4),
    DataAck(5),
    DataLost(6),
    HttpPollCtrl(7),
    HttpPollBiz(8),
    BackgroundPing(9);

    public static final ProtoAdapter<EnumC1526180pom> ADAPTER = new EnumAdapter<EnumC1526180pom>() { // from class: X.0pon
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC1526180pom.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC1526180pom fromValue(int i) {
        switch (i) {
            case 0:
                return Def;
            case 1:
                return Init;
            case 2:
                return Ping;
            case 3:
                return Switch;
            case 4:
                return ReConnect;
            case 5:
                return DataAck;
            case 6:
                return DataLost;
            case 7:
                return HttpPollCtrl;
            case 8:
                return HttpPollBiz;
            case BdTuring.TYPE_ECAF /* 9 */:
                return BackgroundPing;
            default:
                return null;
        }
    }

    public static EnumC1526180pom valueOf(String str) {
        return (EnumC1526180pom) C08FF.LIZ(EnumC1526180pom.class, str);
    }

    EnumC1526180pom(int i) {
        this.LL = i;
    }
}
