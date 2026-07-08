package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.1CMv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public enum EnumC2229231CMv implements WireEnum {
    VAR_LINK_MIC_INTERACT_AUDIO_CODEC_TYPE_HE(0),
    VAR_LINK_MIC_INTERACT_AUDIO_CODEC_TYPE_LC(1);

    public static final ProtoAdapter<EnumC2229231CMv> ADAPTER = new EnumAdapter<EnumC2229231CMv>() { // from class: X.1CMw
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC2229231CMv.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC2229231CMv fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return VAR_LINK_MIC_INTERACT_AUDIO_CODEC_TYPE_LC;
        }
        return VAR_LINK_MIC_INTERACT_AUDIO_CODEC_TYPE_HE;
    }

    public static EnumC2229231CMv valueOf(String str) {
        return (EnumC2229231CMv) C08FF.LIZ(EnumC2229231CMv.class, str);
    }

    EnumC2229231CMv(int i) {
        this.LL = i;
    }
}
