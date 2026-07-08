package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.10p3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public enum EnumC19362310p3 implements WireEnum {
    CanReply(0),
    Disabled(1),
    NotSub(2),
    Punished(3),
    BulletinClosedCanReopen(4),
    StartNewBulletin(5),
    BulletinClosedCanNotReopen(6),
    NoReplyQuota(7);

    public static final ProtoAdapter<EnumC19362310p3> ADAPTER = new EnumAdapter<EnumC19362310p3>() { // from class: X.10p4
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC19362310p3.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC19362310p3 fromValue(int i) {
        switch (i) {
            case 0:
                return CanReply;
            case 1:
                return Disabled;
            case 2:
                return NotSub;
            case 3:
                return Punished;
            case 4:
                return BulletinClosedCanReopen;
            case 5:
                return StartNewBulletin;
            case 6:
                return BulletinClosedCanNotReopen;
            case 7:
                return NoReplyQuota;
            default:
                return null;
        }
    }

    public static EnumC19362310p3 valueOf(String str) {
        return (EnumC19362310p3) C08FF.LIZ(EnumC19362310p3.class, str);
    }

    EnumC19362310p3(int i) {
        this.LL = i;
    }
}
