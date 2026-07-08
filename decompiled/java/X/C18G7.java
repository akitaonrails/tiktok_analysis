package X;

import com.bytedance.android.btm.api.BtmSDK;

/* JADX INFO: renamed from: X.18G7, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18G7 {
    public static final int LIZ() {
        return ((C18BV.LIZ.getInitPrerequisites() & 6) << 2) + BtmSDK.INSTANCE.getService().getInitPrerequisites();
    }

    public static final int LIZIZ() {
        return (C18BV.LIZ.getInitStatus() << 2) + BtmSDK.INSTANCE.getService().getInitStatus();
    }
}
