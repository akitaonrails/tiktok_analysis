package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.1CXG, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public enum C1CXG implements WireEnum {
    VAR_LINK_MIC_LIVE_ROOM_PERMISSION_V2_FRIENDS_OFF_FOLLOWERS_OFF_OTHERS_OFF(0),
    VAR_LINK_MIC_LIVE_ROOM_PERMISSION_V2_FRIENDS_OFF_FOLLOWERS_OFF_OTHERS_ON(1),
    VAR_LINK_MIC_LIVE_ROOM_PERMISSION_V2_FRIENDS_OFF_FOLLOWERS_ON_OTHERS_OFF(2),
    VAR_LINK_MIC_LIVE_ROOM_PERMISSION_V2_FRIENDS_OFF_FOLLOWERS_ON_OTHERS_ON(3),
    VAR_LINK_MIC_LIVE_ROOM_PERMISSION_V2_FRIENDS_ON_FOLLOWERS_OFF_OTHERS_OFF(4),
    VAR_LINK_MIC_LIVE_ROOM_PERMISSION_V2_FRIENDS_ON_FOLLOWERS_OFF_OTHERS_ON(5),
    VAR_LINK_MIC_LIVE_ROOM_PERMISSION_V2_FRIENDS_ON_FOLLOWERS_ON_OTHERS_OFF(6),
    VAR_LINK_MIC_LIVE_ROOM_PERMISSION_V2_FRIENDS_ON_FOLLOWERS_ON_OTHERS_ON(7),
    VAR_LINK_MIC_LIVE_ROOM_PERMISSION_V2_NONE(8);

    public static final ProtoAdapter<C1CXG> ADAPTER = new EnumAdapter<C1CXG>() { // from class: X.1CYc
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return C1CXG.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static C1CXG fromValue(int i) {
        switch (i) {
            case 0:
                return VAR_LINK_MIC_LIVE_ROOM_PERMISSION_V2_FRIENDS_OFF_FOLLOWERS_OFF_OTHERS_OFF;
            case 1:
                return VAR_LINK_MIC_LIVE_ROOM_PERMISSION_V2_FRIENDS_OFF_FOLLOWERS_OFF_OTHERS_ON;
            case 2:
                return VAR_LINK_MIC_LIVE_ROOM_PERMISSION_V2_FRIENDS_OFF_FOLLOWERS_ON_OTHERS_OFF;
            case 3:
                return VAR_LINK_MIC_LIVE_ROOM_PERMISSION_V2_FRIENDS_OFF_FOLLOWERS_ON_OTHERS_ON;
            case 4:
                return VAR_LINK_MIC_LIVE_ROOM_PERMISSION_V2_FRIENDS_ON_FOLLOWERS_OFF_OTHERS_OFF;
            case 5:
                return VAR_LINK_MIC_LIVE_ROOM_PERMISSION_V2_FRIENDS_ON_FOLLOWERS_OFF_OTHERS_ON;
            case 6:
                return VAR_LINK_MIC_LIVE_ROOM_PERMISSION_V2_FRIENDS_ON_FOLLOWERS_ON_OTHERS_OFF;
            case 7:
                return VAR_LINK_MIC_LIVE_ROOM_PERMISSION_V2_FRIENDS_ON_FOLLOWERS_ON_OTHERS_ON;
            case 8:
                return VAR_LINK_MIC_LIVE_ROOM_PERMISSION_V2_NONE;
            default:
                return null;
        }
    }

    public static C1CXG valueOf(String str) {
        return (C1CXG) C08FF.LIZ(C1CXG.class, str);
    }

    C1CXG(int i) {
        this.LL = i;
    }
}
