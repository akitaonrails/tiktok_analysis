package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.1CsH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public enum EnumC2243991CsH implements WireEnum {
    NoIcon(0),
    PlayIcon(1);

    public static final ProtoAdapter<EnumC2243991CsH> ADAPTER = new EnumAdapter<EnumC2243991CsH>() { // from class: X.1CsK
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC2243991CsH.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC2243991CsH fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return PlayIcon;
        }
        return NoIcon;
    }

    public static EnumC2243991CsH valueOf(String str) {
        return (EnumC2243991CsH) C08FF.LIZ(EnumC2243991CsH.class, str);
    }

    EnumC2243991CsH(int i) {
        this.LL = i;
    }
}
