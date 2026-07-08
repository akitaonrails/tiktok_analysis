package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.0jTQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public enum EnumC1282300jTQ implements WireEnum {
    VAR_LINK_MIC_AUX_STREAM_SUBSCRIBE_TYPE_ALL(0),
    VAR_LINK_MIC_AUX_STREAM_SUBSCRIBE_TYPE_ONLY_VIDEO(1),
    VAR_LINK_MIC_AUX_STREAM_SUBSCRIBE_TYPE_ONLY_AUDIO(2);

    public static final ProtoAdapter<EnumC1282300jTQ> ADAPTER = new EnumAdapter<EnumC1282300jTQ>() { // from class: X.0jTR
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC1282300jTQ.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC1282300jTQ fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return VAR_LINK_MIC_AUX_STREAM_SUBSCRIBE_TYPE_ONLY_AUDIO;
            }
            return VAR_LINK_MIC_AUX_STREAM_SUBSCRIBE_TYPE_ONLY_VIDEO;
        }
        return VAR_LINK_MIC_AUX_STREAM_SUBSCRIBE_TYPE_ALL;
    }

    public static EnumC1282300jTQ valueOf(String str) {
        return (EnumC1282300jTQ) C08FF.LIZ(EnumC1282300jTQ.class, str);
    }

    EnumC1282300jTQ(int i) {
        this.LL = i;
    }
}
