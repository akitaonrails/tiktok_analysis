package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.1Cqa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public enum EnumC2242941Cqa implements WireEnum {
    TYPE_TEXT(1),
    TYPE_STICKER(2),
    TYPE_PICTURE(3);

    public static final ProtoAdapter<EnumC2242941Cqa> ADAPTER = new EnumAdapter<EnumC2242941Cqa>() { // from class: X.1Cqf
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC2242941Cqa.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC2242941Cqa fromValue(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return null;
                }
                return TYPE_PICTURE;
            }
            return TYPE_STICKER;
        }
        return TYPE_TEXT;
    }

    public static EnumC2242941Cqa valueOf(String str) {
        return (EnumC2242941Cqa) C08FF.LIZ(EnumC2242941Cqa.class, str);
    }

    EnumC2242941Cqa(int i) {
        this.LL = i;
    }
}
