package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.1Abx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public enum EnumC2182911Abx implements WireEnum {
    VAR_LINK_MIC_LIVE_ROOM_PERMISSION_ALL_VIEWERS(0),
    VAR_LINK_MIC_LIVE_ROOM_PERMISSION_ONLY_FOLLOWERS(1),
    VAR_LINK_MIC_LIVE_ROOM_PERMISSION_NONE(2);

    public static final ProtoAdapter<EnumC2182911Abx> ADAPTER = new EnumAdapter<EnumC2182911Abx>() { // from class: X.1Aby
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC2182911Abx.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC2182911Abx fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return VAR_LINK_MIC_LIVE_ROOM_PERMISSION_NONE;
            }
            return VAR_LINK_MIC_LIVE_ROOM_PERMISSION_ONLY_FOLLOWERS;
        }
        return VAR_LINK_MIC_LIVE_ROOM_PERMISSION_ALL_VIEWERS;
    }

    public static EnumC2182911Abx valueOf(String str) {
        return (EnumC2182911Abx) C08FF.LIZ(EnumC2182911Abx.class, str);
    }

    EnumC2182911Abx(int i) {
        this.LL = i;
    }
}
