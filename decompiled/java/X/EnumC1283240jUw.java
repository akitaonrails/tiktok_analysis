package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.0jUw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public enum EnumC1283240jUw implements WireEnum {
    VAR_LINK_MIC_POS_IDENTITY_TYPE_EMPTY_SLOT(0),
    VAR_LINK_MIC_POS_IDENTITY_TYPE_RTC_USER_ID(1),
    VAR_LINK_MIC_POS_IDENTITY_TYPE_RTC_STREAM_ID(2),
    VAR_LINK_MIC_POS_IDENTITY_TYPE_LIVE_USER_ID(3);

    public static final ProtoAdapter<EnumC1283240jUw> ADAPTER = new EnumAdapter<EnumC1283240jUw>() { // from class: X.0jUx
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC1283240jUw.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC1283240jUw fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return VAR_LINK_MIC_POS_IDENTITY_TYPE_LIVE_USER_ID;
                }
                return VAR_LINK_MIC_POS_IDENTITY_TYPE_RTC_STREAM_ID;
            }
            return VAR_LINK_MIC_POS_IDENTITY_TYPE_RTC_USER_ID;
        }
        return VAR_LINK_MIC_POS_IDENTITY_TYPE_EMPTY_SLOT;
    }

    public static EnumC1283240jUw valueOf(String str) {
        return (EnumC1283240jUw) C08FF.LIZ(EnumC1283240jUw.class, str);
    }

    EnumC1283240jUw(int i) {
        this.LL = i;
    }
}
