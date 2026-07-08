package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.1CXT, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public enum C1CXT implements WireEnum {
    VAR_LINK_MIC_INTERACT_FORWARD_STREAM_ERROR_OK(0),
    VAR_LINK_MIC_INTERACT_FORWARD_STREAM_ERROR_INVALID_ARGUMENT(1),
    VAR_LINK_MIC_INTERACT_FORWARD_STREAM_ERROR_INVALID_TOKEN(2),
    VAR_LINK_MIC_INTERACT_FORWARD_STREAM_ERROR_RESPONSE(3),
    VAR_LINK_MIC_INTERACT_FORWARD_STREAM_ERROR_REMOTE_KICKED(4),
    VAR_LINK_MIC_INTERACT_FORWARD_STREAM_ERROR_NOT_SUPPORT(5);

    public static final ProtoAdapter<C1CXT> ADAPTER = new EnumAdapter<C1CXT>() { // from class: X.1CYV
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return C1CXT.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static C1CXT fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return null;
                            }
                            return VAR_LINK_MIC_INTERACT_FORWARD_STREAM_ERROR_NOT_SUPPORT;
                        }
                        return VAR_LINK_MIC_INTERACT_FORWARD_STREAM_ERROR_REMOTE_KICKED;
                    }
                    return VAR_LINK_MIC_INTERACT_FORWARD_STREAM_ERROR_RESPONSE;
                }
                return VAR_LINK_MIC_INTERACT_FORWARD_STREAM_ERROR_INVALID_TOKEN;
            }
            return VAR_LINK_MIC_INTERACT_FORWARD_STREAM_ERROR_INVALID_ARGUMENT;
        }
        return VAR_LINK_MIC_INTERACT_FORWARD_STREAM_ERROR_OK;
    }

    public static C1CXT valueOf(String str) {
        return (C1CXT) C08FF.LIZ(C1CXT.class, str);
    }

    C1CXT(int i) {
        this.LL = i;
    }
}
