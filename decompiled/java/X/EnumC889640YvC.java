package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.0YvC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public enum EnumC889640YvC implements WireEnum {
    SettingPersistentExtFieldID_Unused(0),
    SettingPersistentExtFieldID_AlertTone(1),
    SettingPersistentExtFieldID_VoipNotification(2);

    public static final ProtoAdapter<EnumC889640YvC> ADAPTER = new EnumAdapter<EnumC889640YvC>() { // from class: X.0YvI
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC889640YvC.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC889640YvC fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return SettingPersistentExtFieldID_VoipNotification;
            }
            return SettingPersistentExtFieldID_AlertTone;
        }
        return SettingPersistentExtFieldID_Unused;
    }

    public static EnumC889640YvC valueOf(String str) {
        return (EnumC889640YvC) C08FF.LIZ(EnumC889640YvC.class, str);
    }

    EnumC889640YvC(int i) {
        this.LL = i;
    }
}
