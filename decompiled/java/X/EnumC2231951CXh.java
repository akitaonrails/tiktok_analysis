package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.1CXh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public enum EnumC2231951CXh implements WireEnum {
    VAR_LINK_MIC_CONSUMER_TYPE_NONE(0),
    VAR_LINK_MIC_CONSUMER_TYPE_RENDER(1),
    VAR_LINK_MIC_CONSUMER_TYPE_SEI(2),
    VAR_LINK_MIC_CONSUMER_TYPE_STREAMER(3);

    public static final ProtoAdapter<EnumC2231951CXh> ADAPTER = new EnumAdapter<EnumC2231951CXh>() { // from class: X.1CYi
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC2231951CXh.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC2231951CXh fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return VAR_LINK_MIC_CONSUMER_TYPE_STREAMER;
                }
                return VAR_LINK_MIC_CONSUMER_TYPE_SEI;
            }
            return VAR_LINK_MIC_CONSUMER_TYPE_RENDER;
        }
        return VAR_LINK_MIC_CONSUMER_TYPE_NONE;
    }

    public static EnumC2231951CXh valueOf(String str) {
        return (EnumC2231951CXh) C08FF.LIZ(EnumC2231951CXh.class, str);
    }

    EnumC2231951CXh(int i) {
        this.LL = i;
    }
}
