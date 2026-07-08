package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.1Ab5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public enum EnumC2182371Ab5 implements WireEnum {
    VAR_LINK_MIC_STREAM_VENDOR_VERSION_UNKNOWN(0),
    VAR_LINK_MIC_STREAM_VENDOR_VERSION_PK(1),
    VAR_LINK_MIC_STREAM_VENDOR_VERSION_BIG_PARTY(2),
    VAR_LINK_MIC_STREAM_VENDOR_VERSION_AUDIO_CHAT(3),
    VAR_LINK_MIC_STREAM_VENDOR_VERSION_GAME_LINK(4);

    public static final ProtoAdapter<EnumC2182371Ab5> ADAPTER = new EnumAdapter<EnumC2182371Ab5>() { // from class: X.1Ab6
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC2182371Ab5.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC2182371Ab5 fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        return VAR_LINK_MIC_STREAM_VENDOR_VERSION_GAME_LINK;
                    }
                    return VAR_LINK_MIC_STREAM_VENDOR_VERSION_AUDIO_CHAT;
                }
                return VAR_LINK_MIC_STREAM_VENDOR_VERSION_BIG_PARTY;
            }
            return VAR_LINK_MIC_STREAM_VENDOR_VERSION_PK;
        }
        return VAR_LINK_MIC_STREAM_VENDOR_VERSION_UNKNOWN;
    }

    public static EnumC2182371Ab5 valueOf(String str) {
        return (EnumC2182371Ab5) C08FF.LIZ(EnumC2182371Ab5.class, str);
    }

    EnumC2182371Ab5(int i) {
        this.LL = i;
    }
}
