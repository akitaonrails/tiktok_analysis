package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.1CqY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public enum EnumC2242921CqY implements WireEnum {
    STATUS_COMMENT_VISIBLE(1),
    STATUS_VIDEO_SELF_VISIBLE(2),
    STATUS_VIDEO_FRIEND_VISIBLE(3),
    STATUS_VIDEO_FOLLOWER_VISIBLE(4),
    STATUS_VIDEO_NO_VISIBLE(5),
    STATUS_COMMENT_DELETED(6),
    STATUS_COMMENT_NO_VISIBLE(7);

    public static final ProtoAdapter<EnumC2242921CqY> ADAPTER = new EnumAdapter<EnumC2242921CqY>() { // from class: X.1Cqe
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC2242921CqY.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC2242921CqY fromValue(int i) {
        switch (i) {
            case 1:
                return STATUS_COMMENT_VISIBLE;
            case 2:
                return STATUS_VIDEO_SELF_VISIBLE;
            case 3:
                return STATUS_VIDEO_FRIEND_VISIBLE;
            case 4:
                return STATUS_VIDEO_FOLLOWER_VISIBLE;
            case 5:
                return STATUS_VIDEO_NO_VISIBLE;
            case 6:
                return STATUS_COMMENT_DELETED;
            case 7:
                return STATUS_COMMENT_NO_VISIBLE;
            default:
                return null;
        }
    }

    public static EnumC2242921CqY valueOf(String str) {
        return (EnumC2242921CqY) C08FF.LIZ(EnumC2242921CqY.class, str);
    }

    EnumC2242921CqY(int i) {
        this.LL = i;
    }
}
