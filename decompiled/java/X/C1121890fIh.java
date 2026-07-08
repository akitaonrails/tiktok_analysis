package X;

import com.bytedance.android.livesdk.comp.api.pcs.data.setting.PcsServicePlusALogEnableSetting;

/* JADX INFO: renamed from: X.0fIh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1121890fIh {
    public static final void LIZ(String str) {
        if (PcsServicePlusALogEnableSetting.INSTANCE.getValue()) {
            C20441214yg.LIZIZ("PCS", str);
        }
    }

    public static final void LIZIZ(String str, Throwable th) {
        if (PcsServicePlusALogEnableSetting.INSTANCE.getValue()) {
            C20441214yg.LJI(str, th);
        }
    }
}
