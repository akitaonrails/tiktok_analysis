package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.1CXP, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public enum C1CXP implements WireEnum {
    VAR_LINK_MIC_CONTENT_TYPE_UNDEFINED(0),
    VAR_LINK_MIC_CONTENT_TYPE_STREAM(1),
    VAR_LINK_MIC_CONTENT_TYPE_LIVE_STUDIO_STREAM_PORTRAIT(2),
    VAR_LINK_MIC_CONTENT_TYPE_LIVE_STUDIO_STREAM_LANDSCAPE(3),
    VAR_LINK_MIC_CONTENT_TYPE_COHOST_QUICK_INVITE_SLOT(4),
    VAR_LINK_MIC_CONTENT_TYPE_JUST_DANCE(5);

    public static final ProtoAdapter<C1CXP> ADAPTER = new EnumAdapter<C1CXP>() { // from class: X.1CY9
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return C1CXP.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static C1CXP fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return null;
                            }
                            return VAR_LINK_MIC_CONTENT_TYPE_JUST_DANCE;
                        }
                        return VAR_LINK_MIC_CONTENT_TYPE_COHOST_QUICK_INVITE_SLOT;
                    }
                    return VAR_LINK_MIC_CONTENT_TYPE_LIVE_STUDIO_STREAM_LANDSCAPE;
                }
                return VAR_LINK_MIC_CONTENT_TYPE_LIVE_STUDIO_STREAM_PORTRAIT;
            }
            return VAR_LINK_MIC_CONTENT_TYPE_STREAM;
        }
        return VAR_LINK_MIC_CONTENT_TYPE_UNDEFINED;
    }

    public static C1CXP valueOf(String str) {
        return (C1CXP) C08FF.LIZ(C1CXP.class, str);
    }

    C1CXP(int i) {
        this.LL = i;
    }
}
