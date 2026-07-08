package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.1CXv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public enum EnumC2232091CXv implements WireEnum {
    VAR_LINK_MIC_ENCODE_TYPE_JSON(0),
    VAR_LINK_MIC_ENCODE_TYPE_PROTOBUF(1);

    public static final ProtoAdapter<EnumC2232091CXv> ADAPTER = new EnumAdapter<EnumC2232091CXv>() { // from class: X.1CYK
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC2232091CXv.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC2232091CXv fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return VAR_LINK_MIC_ENCODE_TYPE_PROTOBUF;
        }
        return VAR_LINK_MIC_ENCODE_TYPE_JSON;
    }

    public static EnumC2232091CXv valueOf(String str) {
        return (EnumC2232091CXv) C08FF.LIZ(EnumC2232091CXv.class, str);
    }

    EnumC2232091CXv(int i) {
        this.LL = i;
    }
}
