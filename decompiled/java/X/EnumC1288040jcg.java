package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.0jcg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public enum EnumC1288040jcg implements WireEnum {
    VAR_LINK_MIC_INTERACT_FORWARD_STREAM_STATE_IDLE(0),
    VAR_LINK_MIC_INTERACT_FORWARD_STREAM_STATE_SUCCESS(1),
    VAR_LINK_MIC_INTERACT_FORWARD_STREAM_STATE_FAILURE(2);

    public static final ProtoAdapter<EnumC1288040jcg> ADAPTER = new EnumAdapter<EnumC1288040jcg>() { // from class: X.0jch
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC1288040jcg.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC1288040jcg fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return VAR_LINK_MIC_INTERACT_FORWARD_STREAM_STATE_FAILURE;
            }
            return VAR_LINK_MIC_INTERACT_FORWARD_STREAM_STATE_SUCCESS;
        }
        return VAR_LINK_MIC_INTERACT_FORWARD_STREAM_STATE_IDLE;
    }

    public static EnumC1288040jcg valueOf(String str) {
        return (EnumC1288040jcg) C08FF.LIZ(EnumC1288040jcg.class, str);
    }

    EnumC1288040jcg(int i) {
        this.LL = i;
    }
}
