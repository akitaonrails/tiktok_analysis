package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.1CXV, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public enum C1CXV implements WireEnum {
    VAR_USER_LINK_RTC_EVENT_ON_REMOTE_USER_JOINED(0),
    VAR_USER_LINK_RTC_EVENT_ON_FIRST_AUDIO_DATA(1),
    VAR_USER_LINK_RTC_EVENT_ON_FIRST_VIDEO_DATA(2),
    VAR_USER_LINK_RTC_EVENT_ON_FIRST_VIDEO_FRAME_RENDER(3),
    VAR_USER_LINK_RTC_EVENT_ON_REMOTE_USER_LEFT(4);

    public static final ProtoAdapter<C1CXV> ADAPTER = new EnumAdapter<C1CXV>() { // from class: X.1CYW
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return C1CXV.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static C1CXV fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        return VAR_USER_LINK_RTC_EVENT_ON_REMOTE_USER_LEFT;
                    }
                    return VAR_USER_LINK_RTC_EVENT_ON_FIRST_VIDEO_FRAME_RENDER;
                }
                return VAR_USER_LINK_RTC_EVENT_ON_FIRST_VIDEO_DATA;
            }
            return VAR_USER_LINK_RTC_EVENT_ON_FIRST_AUDIO_DATA;
        }
        return VAR_USER_LINK_RTC_EVENT_ON_REMOTE_USER_JOINED;
    }

    public static C1CXV valueOf(String str) {
        return (C1CXV) C08FF.LIZ(C1CXV.class, str);
    }

    C1CXV(int i) {
        this.LL = i;
    }
}
