package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.062L, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public enum C062L implements WireEnum {
    BOT_SCENE_UNKNOWN(0),
    BOT_SCENE_SMART_REPLY(1);

    public static final ProtoAdapter<C062L> ADAPTER = new EnumAdapter<C062L>() { // from class: X.062M
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return C062L.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static C062L fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return BOT_SCENE_SMART_REPLY;
        }
        return BOT_SCENE_UNKNOWN;
    }

    public static C062L valueOf(String str) {
        return (C062L) C08FF.LIZ(C062L.class, str);
    }

    C062L(int i) {
        this.LL = i;
    }
}
