package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.0jTF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public enum EnumC1282190jTF implements WireEnum {
    VAR_RTC_LINK_MIC_TYPE_NONE(0),
    VAR_RTC_LINK_MIC_TYPE_CO_HOST(1),
    VAR_RTC_LINK_MIC_TYPE_MULTI_GUEST(2),
    VAR_RTC_LINK_MIC_TYPE_GAME_LINK(3);

    public static final ProtoAdapter<EnumC1282190jTF> ADAPTER = new EnumAdapter<EnumC1282190jTF>() { // from class: X.0jTG
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC1282190jTF.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC1282190jTF fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return VAR_RTC_LINK_MIC_TYPE_GAME_LINK;
                }
                return VAR_RTC_LINK_MIC_TYPE_MULTI_GUEST;
            }
            return VAR_RTC_LINK_MIC_TYPE_CO_HOST;
        }
        return VAR_RTC_LINK_MIC_TYPE_NONE;
    }

    public static EnumC1282190jTF valueOf(String str) {
        return (EnumC1282190jTF) C08FF.LIZ(EnumC1282190jTF.class, str);
    }

    EnumC1282190jTF(int i) {
        this.LL = i;
    }
}
