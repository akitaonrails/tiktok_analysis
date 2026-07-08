package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.1CXt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public enum EnumC2232071CXt implements WireEnum {
    VAR_LINK_MIC_MULTI_BIZ_JOIN_DIRECT_LINK_TYPE_VIDEO(0),
    VAR_LINK_MIC_MULTI_BIZ_JOIN_DIRECT_LINK_TYPE_AUDIO(1);

    public static final ProtoAdapter<EnumC2232071CXt> ADAPTER = new EnumAdapter<EnumC2232071CXt>() { // from class: X.1CYA
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC2232071CXt.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC2232071CXt fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return VAR_LINK_MIC_MULTI_BIZ_JOIN_DIRECT_LINK_TYPE_AUDIO;
        }
        return VAR_LINK_MIC_MULTI_BIZ_JOIN_DIRECT_LINK_TYPE_VIDEO;
    }

    public static EnumC2232071CXt valueOf(String str) {
        return (EnumC2232071CXt) C08FF.LIZ(EnumC2232071CXt.class, str);
    }

    EnumC2232071CXt(int i) {
        this.LL = i;
    }
}
