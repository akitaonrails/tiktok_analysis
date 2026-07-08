package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.0poJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public enum EnumC1525890poJ implements WireEnum {
    SpecTopic(0),
    GlobalTopic(1),
    CustomTopic(2);

    public static final ProtoAdapter<EnumC1525890poJ> ADAPTER = new EnumAdapter<EnumC1525890poJ>() { // from class: X.0poQ
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC1525890poJ.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC1525890poJ fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return CustomTopic;
            }
            return GlobalTopic;
        }
        return SpecTopic;
    }

    public static EnumC1525890poJ valueOf(String str) {
        return (EnumC1525890poJ) C08FF.LIZ(EnumC1525890poJ.class, str);
    }

    EnumC1525890poJ(int i) {
        this.LL = i;
    }
}
