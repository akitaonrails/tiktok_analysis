package X;

import com.zhiliaoapp.musically.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0YtU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC888580YtU {
    public static final EnumC888580YtU GROUP_CHAT;
    public static final /* synthetic */ EnumC888580YtU[] LLILZIL;
    public static final /* synthetic */ C2254308sP LLILZLL;
    public static final EnumC888580YtU MESSAGE_REQUEST_CELL;
    public static final EnumC888580YtU SINGLE_CHAT;
    public final int LL;
    public final int LLILLJJLI;
    public final String LLILLL;
    public final int LLILZ;

    public static InterfaceC2044707zh<EnumC888580YtU> getEntries() {
        return LLILZLL;
    }

    static {
        EnumC888580YtU enumC888580YtU = new EnumC888580YtU(0, 104, R.layout.cmz, 4, "SINGLE_CHAT", "im_item_session_inbox_single_chat_cell");
        SINGLE_CHAT = enumC888580YtU;
        EnumC888580YtU enumC888580YtU2 = new EnumC888580YtU(1, 105, R.layout.cmv, 4, "GROUP_CHAT", "im_item_session_inbox_group_chat_cell");
        GROUP_CHAT = enumC888580YtU2;
        EnumC888580YtU enumC888580YtU3 = new EnumC888580YtU(2, 107, R.layout.cmy, 1, "MESSAGE_REQUEST_CELL", "im_item_session_inbox_message_request_cell");
        MESSAGE_REQUEST_CELL = enumC888580YtU3;
        EnumC888580YtU[] enumC888580YtUArr = {enumC888580YtU, enumC888580YtU2, enumC888580YtU3};
        LLILZIL = enumC888580YtUArr;
        LLILZLL = new C2254308sP(enumC888580YtUArr);
    }

    public static EnumC888580YtU[] values() {
        return (EnumC888580YtU[]) LLILZIL.clone();
    }

    public final int getCacheSize() {
        return this.LLILZ;
    }

    public final int getResId() {
        return this.LLILLJJLI;
    }

    public final String getResName() {
        return this.LLILLL;
    }

    public final int getVhType() {
        return this.LL;
    }

    public static EnumC888580YtU valueOf(String str) {
        return (EnumC888580YtU) C08FF.LIZ(EnumC888580YtU.class, str);
    }

    public EnumC888580YtU(int i, int i2, int i3, int i4, String str, String str2) {
        this.LL = i2;
        this.LLILLJJLI = i3;
        this.LLILLL = str2;
        this.LLILZ = i4;
    }
}
