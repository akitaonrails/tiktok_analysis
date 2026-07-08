package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.0bQD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public enum EnumC972790bQD implements WireEnum {
    VAR_LINK_MIC_LIST_CHANGE_TYPE_NONE(0),
    VAR_LINK_MIC_LIST_CHANGE_TYPE_LINKED_LIST(1),
    VAR_LINK_MIC_LIST_CHANGE_TYPE_APPLIED_LIST(2),
    VAR_LINK_MIC_LIST_CHANGE_TYPE_INVITED_LIST(3),
    VAR_LINK_MIC_LIST_CHANGE_TYPE_CONTENT_POSITION_LIST(4);

    public static final ProtoAdapter<EnumC972790bQD> ADAPTER = new EnumAdapter<EnumC972790bQD>() { // from class: X.0bQE
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC972790bQD.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC972790bQD fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        return VAR_LINK_MIC_LIST_CHANGE_TYPE_CONTENT_POSITION_LIST;
                    }
                    return VAR_LINK_MIC_LIST_CHANGE_TYPE_INVITED_LIST;
                }
                return VAR_LINK_MIC_LIST_CHANGE_TYPE_APPLIED_LIST;
            }
            return VAR_LINK_MIC_LIST_CHANGE_TYPE_LINKED_LIST;
        }
        return VAR_LINK_MIC_LIST_CHANGE_TYPE_NONE;
    }

    public static EnumC972790bQD valueOf(String str) {
        return (EnumC972790bQD) C08FF.LIZ(EnumC972790bQD.class, str);
    }

    EnumC972790bQD(int i) {
        this.LL = i;
    }
}
