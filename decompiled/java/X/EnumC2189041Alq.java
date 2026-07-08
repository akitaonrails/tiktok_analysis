package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.1Alq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public enum EnumC2189041Alq implements WireEnum {
    VAR_LINK_MIC_LAYOUT_DRIVE_STEP_MEDIA_TRANS(0),
    VAR_LINK_MIC_LAYOUT_DRIVE_STEP_PARSE_SEI(1),
    VAR_LINK_MIC_LAYOUT_DRIVE_STEP_CALCU_LAYOUT(2),
    VAR_LINK_MIC_LAYOUT_DRIVE_STEP_RENDER_LAYOUT(3),
    VAR_LINK_MIC_LAYOUT_DRIVE_STEP_PARSE_LAYOUT_INFO(4),
    VAR_LINK_MIC_LAYOUT_DRIVE_STEP_QUERY_LAYOUT_MODEL(5);

    public static final ProtoAdapter<EnumC2189041Alq> ADAPTER = new EnumAdapter<EnumC2189041Alq>() { // from class: X.1Alr
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC2189041Alq.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC2189041Alq fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return null;
                            }
                            return VAR_LINK_MIC_LAYOUT_DRIVE_STEP_QUERY_LAYOUT_MODEL;
                        }
                        return VAR_LINK_MIC_LAYOUT_DRIVE_STEP_PARSE_LAYOUT_INFO;
                    }
                    return VAR_LINK_MIC_LAYOUT_DRIVE_STEP_RENDER_LAYOUT;
                }
                return VAR_LINK_MIC_LAYOUT_DRIVE_STEP_CALCU_LAYOUT;
            }
            return VAR_LINK_MIC_LAYOUT_DRIVE_STEP_PARSE_SEI;
        }
        return VAR_LINK_MIC_LAYOUT_DRIVE_STEP_MEDIA_TRANS;
    }

    public static EnumC2189041Alq valueOf(String str) {
        return (EnumC2189041Alq) C08FF.LIZ(EnumC2189041Alq.class, str);
    }

    EnumC2189041Alq(int i) {
        this.LL = i;
    }
}
