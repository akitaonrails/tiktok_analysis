package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00Co, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC040800Co {
    public static final EnumC040800Co DEFAULT;
    public static final EnumC040800Co DELETE_SLOT_ASYNC_HIDE_PANEL;
    public static final EnumC040800Co DELETE_TASK_ASYNC_REFRESH_PANEL;
    public static final /* synthetic */ EnumC040800Co[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC040800Co RETRY_FAI;

    public static InterfaceC2044707zh<EnumC040800Co> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC040800Co enumC040800Co = new EnumC040800Co(LivePreviewCTASmartDisplayManager.DEFAULT, 0);
        DEFAULT = enumC040800Co;
        EnumC040800Co enumC040800Co2 = new EnumC040800Co("DELETE_TASK_ASYNC_REFRESH_PANEL", 1);
        DELETE_TASK_ASYNC_REFRESH_PANEL = enumC040800Co2;
        EnumC040800Co enumC040800Co3 = new EnumC040800Co("DELETE_SLOT_ASYNC_HIDE_PANEL", 2);
        DELETE_SLOT_ASYNC_HIDE_PANEL = enumC040800Co3;
        EnumC040800Co enumC040800Co4 = new EnumC040800Co("RETRY_FAI", 3);
        RETRY_FAI = enumC040800Co4;
        EnumC040800Co[] enumC040800CoArr = {enumC040800Co, enumC040800Co2, enumC040800Co3, enumC040800Co4};
        LL = enumC040800CoArr;
        LLILLJJLI = new C2254308sP(enumC040800CoArr);
    }

    public static EnumC040800Co[] values() {
        return (EnumC040800Co[]) LL.clone();
    }

    public static EnumC040800Co valueOf(String str) {
        return (EnumC040800Co) C08FF.LIZ(EnumC040800Co.class, str);
    }

    public EnumC040800Co(String str, int i) {
    }
}
