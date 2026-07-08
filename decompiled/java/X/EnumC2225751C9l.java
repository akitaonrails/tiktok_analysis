package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.1C9l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public enum EnumC2225751C9l implements WireEnum {
    VAR_LINK_MIC_TASK_SCENE_JOIN_RTC_CHANNEL(0),
    VAR_LINK_MIC_TASK_SCENE_PRE_JOIN_RTC_CHANNEL(1);

    public static final ProtoAdapter<EnumC2225751C9l> ADAPTER = new EnumAdapter<EnumC2225751C9l>() { // from class: X.1C9m
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC2225751C9l.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC2225751C9l fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return VAR_LINK_MIC_TASK_SCENE_PRE_JOIN_RTC_CHANNEL;
        }
        return VAR_LINK_MIC_TASK_SCENE_JOIN_RTC_CHANNEL;
    }

    public static EnumC2225751C9l valueOf(String str) {
        return (EnumC2225751C9l) C08FF.LIZ(EnumC2225751C9l.class, str);
    }

    EnumC2225751C9l(int i) {
        this.LL = i;
    }
}
