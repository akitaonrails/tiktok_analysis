package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.10pc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public enum EnumC19365810pc implements WireEnum {
    StickerBlockedAction_Unknown(0),
    StickerBlockedAction_Send(1),
    StickerBlockedAction_Favorite(2),
    StickerBlockedAction_Report(3);

    public static final ProtoAdapter<EnumC19365810pc> ADAPTER = new EnumAdapter<EnumC19365810pc>() { // from class: X.10pd
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC19365810pc.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC19365810pc fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return StickerBlockedAction_Report;
                }
                return StickerBlockedAction_Favorite;
            }
            return StickerBlockedAction_Send;
        }
        return StickerBlockedAction_Unknown;
    }

    public static EnumC19365810pc valueOf(String str) {
        return (EnumC19365810pc) C08FF.LIZ(EnumC19365810pc.class, str);
    }

    EnumC19365810pc(int i) {
        this.LL = i;
    }
}
