package X;

import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bw5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC992550bw5 {
    public static final /* synthetic */ EnumC992550bw5[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC992550bw5 ORDER_STATUS_AVAILABLE;
    public static final EnumC992550bw5 ORDER_STATUS_CLOSED;
    public static final EnumC992550bw5 ORDER_STATUS_FINISH;
    public static final EnumC992550bw5 ORDER_STATUS_FULFILL_SUCCESS;
    public static final EnumC992550bw5 ORDER_STATUS_INIT;
    public static final EnumC992550bw5 ORDER_STATUS_ORDER_RECEIVE;
    public static final EnumC992550bw5 ORDER_STATUS_PAY_SUCCESS;
    public static final EnumC992550bw5 ORDER_STATUS_WAIT_PAY;
    public static final EnumC992550bw5 ORDER_STATUS_WAIT_TAKING_ORDER;
    public final int LL;

    public static InterfaceC2044707zh<EnumC992550bw5> getEntries() {
        return LLILLL;
    }

    static {
        EnumC992550bw5 enumC992550bw5 = new EnumC992550bw5("ORDER_STATUS_INIT", 0, 0);
        ORDER_STATUS_INIT = enumC992550bw5;
        EnumC992550bw5 enumC992550bw52 = new EnumC992550bw5("ORDER_STATUS_FINISH", 1, 1);
        ORDER_STATUS_FINISH = enumC992550bw52;
        EnumC992550bw5 enumC992550bw53 = new EnumC992550bw5("ORDER_STATUS_CLOSED", 2, 2);
        ORDER_STATUS_CLOSED = enumC992550bw53;
        EnumC992550bw5 enumC992550bw54 = new EnumC992550bw5("ORDER_STATUS_WAIT_PAY", 3, 100);
        ORDER_STATUS_WAIT_PAY = enumC992550bw54;
        EnumC992550bw5 enumC992550bw55 = new EnumC992550bw5("ORDER_STATUS_PAY_SUCCESS", 4, 110);
        ORDER_STATUS_PAY_SUCCESS = enumC992550bw55;
        EnumC992550bw5 enumC992550bw56 = new EnumC992550bw5("ORDER_STATUS_WAIT_TAKING_ORDER", 5, 200);
        ORDER_STATUS_WAIT_TAKING_ORDER = enumC992550bw56;
        EnumC992550bw5 enumC992550bw57 = new EnumC992550bw5("ORDER_STATUS_ORDER_RECEIVE", 6, 210);
        ORDER_STATUS_ORDER_RECEIVE = enumC992550bw57;
        EnumC992550bw5 enumC992550bw58 = new EnumC992550bw5("ORDER_STATUS_AVAILABLE", 7, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL);
        ORDER_STATUS_AVAILABLE = enumC992550bw58;
        EnumC992550bw5 enumC992550bw59 = new EnumC992550bw5("ORDER_STATUS_FULFILL_SUCCESS", 8, 310);
        ORDER_STATUS_FULFILL_SUCCESS = enumC992550bw59;
        EnumC992550bw5[] enumC992550bw5Arr = {enumC992550bw5, enumC992550bw52, enumC992550bw53, enumC992550bw54, enumC992550bw55, enumC992550bw56, enumC992550bw57, enumC992550bw58, enumC992550bw59};
        LLILLJJLI = enumC992550bw5Arr;
        LLILLL = new C2254308sP(enumC992550bw5Arr);
    }

    public static EnumC992550bw5[] values() {
        return (EnumC992550bw5[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC992550bw5 valueOf(String str) {
        return (EnumC992550bw5) C08FF.LIZ(EnumC992550bw5.class, str);
    }

    public EnumC992550bw5(String str, int i, int i2) {
        this.LL = i2;
    }
}
