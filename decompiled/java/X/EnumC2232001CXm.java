package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.1CXm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public enum EnumC2232001CXm implements WireEnum {
    VAR_LINK_MIC_OUTSIDE_UPDATE_SOURCE_UNKNOWN(0),
    VAR_LINK_MIC_OUTSIDE_UPDATE_SOURCE_ROOM_MODEL(1),
    VAR_LINK_MIC_OUTSIDE_UPDATE_SOURCE_SEI(2);

    public static final ProtoAdapter<EnumC2232001CXm> ADAPTER = new EnumAdapter<EnumC2232001CXm>() { // from class: X.1CYQ
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC2232001CXm.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC2232001CXm fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return VAR_LINK_MIC_OUTSIDE_UPDATE_SOURCE_SEI;
            }
            return VAR_LINK_MIC_OUTSIDE_UPDATE_SOURCE_ROOM_MODEL;
        }
        return VAR_LINK_MIC_OUTSIDE_UPDATE_SOURCE_UNKNOWN;
    }

    public static EnumC2232001CXm valueOf(String str) {
        return (EnumC2232001CXm) C08FF.LIZ(EnumC2232001CXm.class, str);
    }

    EnumC2232001CXm(int i) {
        this.LL = i;
    }
}
