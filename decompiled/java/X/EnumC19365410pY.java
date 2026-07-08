package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;
import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.10pY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public enum EnumC19365410pY implements WireEnum {
    NOT_USE(0),
    MSG_RECEIVE_BY_WS(1),
    MSG_RECEIVE_BY_USER(2),
    MSG_RECEIVE_BY_INIT(3),
    MSG_RECEIVE_BY_LOAD_HISTORY(4),
    MSG_RECEIVE_BY_LOAD_NEWER(5),
    MSG_RECEIVE_BY_CHECK_MSG_V1(6),
    MSG_RECEIVE_BY_CHECK_MSG_V2(7),
    MSG_RECEIVE_BY_STRANGER(8),
    MSG_SHOW(9);

    public static final ProtoAdapter<EnumC19365410pY> ADAPTER = new EnumAdapter<EnumC19365410pY>() { // from class: X.10pZ
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC19365410pY.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC19365410pY fromValue(int i) {
        switch (i) {
            case 0:
                return NOT_USE;
            case 1:
                return MSG_RECEIVE_BY_WS;
            case 2:
                return MSG_RECEIVE_BY_USER;
            case 3:
                return MSG_RECEIVE_BY_INIT;
            case 4:
                return MSG_RECEIVE_BY_LOAD_HISTORY;
            case 5:
                return MSG_RECEIVE_BY_LOAD_NEWER;
            case 6:
                return MSG_RECEIVE_BY_CHECK_MSG_V1;
            case 7:
                return MSG_RECEIVE_BY_CHECK_MSG_V2;
            case 8:
                return MSG_RECEIVE_BY_STRANGER;
            case BdTuring.TYPE_ECAF /* 9 */:
                return MSG_SHOW;
            default:
                return null;
        }
    }

    public static EnumC19365410pY valueOf(String str) {
        return (EnumC19365410pY) C08FF.LIZ(EnumC19365410pY.class, str);
    }

    EnumC19365410pY(int i) {
        this.LL = i;
    }
}
