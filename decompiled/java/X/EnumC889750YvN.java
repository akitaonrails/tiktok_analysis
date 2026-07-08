package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0YvN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC889750YvN implements WireEnum {
    public static final ProtoAdapter<EnumC889750YvN> ADAPTER;
    public static final /* synthetic */ EnumC889750YvN[] LLILLJJLI;
    public static final EnumC889750YvN SettingTransientExtFieldID_Unused;
    public final int LL = 0;

    static {
        EnumC889750YvN enumC889750YvN = new EnumC889750YvN();
        SettingTransientExtFieldID_Unused = enumC889750YvN;
        LLILLJJLI = new EnumC889750YvN[]{enumC889750YvN};
        ADAPTER = new EnumAdapter<EnumC889750YvN>() { // from class: X.0YvO
            @Override // com.squareup.wire.EnumAdapter
            public final WireEnum LIZ(int i) {
                return EnumC889750YvN.fromValue(i);
            }
        };
    }

    public static EnumC889750YvN[] values() {
        return (EnumC889750YvN[]) LLILLJJLI.clone();
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC889750YvN fromValue(int i) {
        if (i != 0) {
            return null;
        }
        return SettingTransientExtFieldID_Unused;
    }

    public static EnumC889750YvN valueOf(String str) {
        return (EnumC889750YvN) C08FF.LIZ(EnumC889750YvN.class, str);
    }
}
