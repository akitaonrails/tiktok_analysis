package X;

import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingAPIService;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AwS177S1100000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.10kY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public class C19334410kY implements InterfaceC1141530foN {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        switch (this.$t) {
            case 0:
                mh2$0(this, c262100zr);
                break;
            case 1:
                mh2$1(this, c262100zr);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C19334410kY(Object obj, WeakReference<LifecycleOwner> weakReference) {
        this.$t = weakReference;
        this.l0 = obj;
    }

    public static final void mh2$0(C19334410kY c19334410kY, C262100zr c262100zr) {
        String str = c262100zr.LIZ;
        if (Intrinsics.LJFF(str, "referral_popup_show")) {
            C1899920zXa c1899920zXa = C1899920zXa.LIZ;
            String str2 = ((C1899950zXd) c19334410kY.l0).LIZIZ;
            c1899920zXa.getClass();
            C01U6.LIZIZ(new AwS177S1100000_28(c262100zr, str2, 21));
            return;
        }
        if (!Intrinsics.LJFF(str, "referral_popup_resource_load_failed")) {
            return;
        }
        C1899920zXa c1899920zXa2 = C1899920zXa.LIZ;
        String str3 = ((C1899950zXd) c19334410kY.l0).LIZIZ;
        c1899920zXa2.getClass();
        C01U6.LIZIZ(new AwS177S1100000_28(c262100zr, str3, 20));
    }

    public static final void mh2$1(C19334410kY c19334410kY, C262100zr c262100zr) {
        IPrivacySettingAPIService iPrivacySettingAPIService;
        if (Intrinsics.LJFF(c262100zr.LIZ, "privacy-settings-refresh") && (iPrivacySettingAPIService = (IPrivacySettingAPIService) PluggableExtentionKt.pluggableSpi$default(IPrivacySettingAPIService.class, false, false, false, 14, null)) != null) {
            iPrivacySettingAPIService.LJIIJJI((LifecycleOwner) ((WeakReference) c19334410kY.l0).get(), "refresh_after_fe_change");
        }
    }
}
