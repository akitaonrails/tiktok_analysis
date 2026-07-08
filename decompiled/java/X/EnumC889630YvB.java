package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.0YvB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public enum EnumC889630YvB implements WireEnum {
    CorePersistentExtFieldID_Unused(0),
    CorePersistentExtFieldID_HistoryVisibility(1),
    CorePersistentExtFieldID_B2CMessageRequest(2);

    public static final ProtoAdapter<EnumC889630YvB> ADAPTER = new EnumAdapter<EnumC889630YvB>() { // from class: X.0YvH
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC889630YvB.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC889630YvB fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return CorePersistentExtFieldID_B2CMessageRequest;
            }
            return CorePersistentExtFieldID_HistoryVisibility;
        }
        return CorePersistentExtFieldID_Unused;
    }

    public static EnumC889630YvB valueOf(String str) {
        return (EnumC889630YvB) C08FF.LIZ(EnumC889630YvB.class, str);
    }

    EnumC889630YvB(int i) {
        this.LL = i;
    }
}
