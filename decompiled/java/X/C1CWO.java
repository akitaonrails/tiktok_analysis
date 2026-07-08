package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.1CWO, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public enum C1CWO implements WireEnum {
    VAR_LAYOUT_RENDER_WINDOW_STATE_INIT_STATE(0),
    VAR_LAYOUT_RENDER_WINDOW_STATE_PREPARING_STATE(1),
    VAR_LAYOUT_RENDER_WINDOW_STATE_LINKED_STATE(2);

    public static final ProtoAdapter<C1CWO> ADAPTER = new EnumAdapter<C1CWO>() { // from class: X.1CWP
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return C1CWO.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static C1CWO fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return VAR_LAYOUT_RENDER_WINDOW_STATE_LINKED_STATE;
            }
            return VAR_LAYOUT_RENDER_WINDOW_STATE_PREPARING_STATE;
        }
        return VAR_LAYOUT_RENDER_WINDOW_STATE_INIT_STATE;
    }

    public static C1CWO valueOf(String str) {
        return (C1CWO) C08FF.LIZ(C1CWO.class, str);
    }

    C1CWO(int i) {
        this.LL = i;
    }
}
