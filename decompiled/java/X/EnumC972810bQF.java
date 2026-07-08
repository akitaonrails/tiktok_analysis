package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.0bQF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public enum EnumC972810bQF implements WireEnum {
    VAR_LINK_MIC_LAYOUT_STYLE_UNKNOWN(0),
    VAR_LINK_MIC_LAYOUT_STYLE_OVERLAPPING_FLOW(1),
    VAR_LINK_MIC_LAYOUT_STYLE_OVERLAPPING_FIXED(2),
    VAR_LINK_MIC_LAYOUT_STYLE_GRID_FLOW(3),
    VAR_LINK_MIC_LAYOUT_STYLE_GRID_FIXED(4);

    public static final ProtoAdapter<EnumC972810bQF> ADAPTER = new EnumAdapter<EnumC972810bQF>() { // from class: X.0bQG
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC972810bQF.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC972810bQF fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        return VAR_LINK_MIC_LAYOUT_STYLE_GRID_FIXED;
                    }
                    return VAR_LINK_MIC_LAYOUT_STYLE_GRID_FLOW;
                }
                return VAR_LINK_MIC_LAYOUT_STYLE_OVERLAPPING_FIXED;
            }
            return VAR_LINK_MIC_LAYOUT_STYLE_OVERLAPPING_FLOW;
        }
        return VAR_LINK_MIC_LAYOUT_STYLE_UNKNOWN;
    }

    public static EnumC972810bQF valueOf(String str) {
        return (EnumC972810bQF) C08FF.LIZ(EnumC972810bQF.class, str);
    }

    EnumC972810bQF(int i) {
        this.LL = i;
    }
}
