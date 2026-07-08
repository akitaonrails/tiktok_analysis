package X;

import com.ss.android.ugc.aweme.compliance.privacy.checkup.privacy.CheckupPrivacyInteractionFragment;
import com.ss.android.ugc.aweme.ecommerce.fyp.affiliate.button.EcProductAddButtonAssem;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingsDepService;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.10ku, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public class C19336610ku extends C09AY implements InterfaceC1631630sYr {
    public static final /* synthetic */ AtomicReferenceArray arr$ = new AtomicReferenceArray(4);
    public final int $t;

    public static C19336610ku get$arr$(int i) {
        C19336610ku c19336610ku = (C19336610ku) arr$.get(i);
        if (c19336610ku != null) {
            return c19336610ku;
        }
        arr$.compareAndSet(i, null, new C19336610ku(i));
        return (C19336610ku) arr$.get(i);
    }

    @Override // X.InterfaceC1631630sYr
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3, obj4);
            case 1:
                return invoke$1(this, obj, obj2, obj3, obj4);
            case 2:
                return invoke$2(this, obj, obj2, obj3, obj4);
            case 3:
                return invoke$3(this, obj, obj2, obj3, obj4);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19336610ku(int i) {
        super(4);
        this.$t = i;
    }

    public static final Object invoke$0(C19336610ku c19336610ku, Object obj, Object obj2, Object obj3, Object obj4) {
        String str;
        String strLJIILLIIL;
        int iIntValue = ((Number) obj3).intValue();
        Pair[] pairArr = new Pair[5];
        pairArr[0] = new Pair("enter_from", "privacy_checkup");
        pairArr[1] = new Pair("updated_permission", "potential_connections");
        pairArr[2] = new Pair("updated_result", String.valueOf(iIntValue));
        if (Intrinsics.LJFF(CheckupPrivacyInteractionFragment.LLIZ, Boolean.TRUE)) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[3] = new Pair("permission_type", str);
        IPrivacySettingsDepService iPrivacySettingsDepService = (IPrivacySettingsDepService) PluggableExtentionKt.pluggableSpi$default(IPrivacySettingsDepService.class, false, false, false, 14, null);
        if (iPrivacySettingsDepService != null) {
            strLJIILLIIL = iPrivacySettingsDepService.LJIILLIIL();
        } else {
            strLJIILLIIL = null;
        }
        pairArr[4] = new Pair("user_account_type", strLJIILLIIL);
        C20684815ws.LJIILLIIL("dm_permission_settings_updated", C2097608Jq.LJIIIIZZ(pairArr));
        return Unit.LIZ;
    }

    public static final Object invoke$1(C19336610ku c19336610ku, Object obj, Object obj2, Object obj3, Object obj4) {
        String str;
        String strLJIILLIIL;
        int iIntValue = ((Number) obj3).intValue();
        Pair[] pairArr = new Pair[5];
        pairArr[0] = new Pair("enter_from", "privacy_checkup");
        pairArr[1] = new Pair("updated_permission", "others_on_tiktok");
        pairArr[2] = new Pair("updated_result", String.valueOf(iIntValue));
        if (Intrinsics.LJFF(CheckupPrivacyInteractionFragment.LLIZ, Boolean.TRUE)) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[3] = new Pair("permission_type", str);
        IPrivacySettingsDepService iPrivacySettingsDepService = (IPrivacySettingsDepService) PluggableExtentionKt.pluggableSpi$default(IPrivacySettingsDepService.class, false, false, false, 14, null);
        if (iPrivacySettingsDepService != null) {
            strLJIILLIIL = iPrivacySettingsDepService.LJIILLIIL();
        } else {
            strLJIILLIIL = null;
        }
        pairArr[4] = new Pair("user_account_type", strLJIILLIIL);
        C20684815ws.LJIILLIIL("dm_permission_settings_updated", C2097608Jq.LJIIIIZZ(pairArr));
        return Unit.LIZ;
    }

    public static final Object invoke$2(C19336610ku c19336610ku, Object obj, Object obj2, Object obj3, Object obj4) {
        String str;
        String strLJIILLIIL;
        int iIntValue = ((Number) obj3).intValue();
        Pair[] pairArr = new Pair[5];
        pairArr[0] = new Pair("enter_from", "privacy_checkup");
        pairArr[1] = new Pair("updated_permission", "friends");
        pairArr[2] = new Pair("updated_result", String.valueOf(iIntValue));
        if (Intrinsics.LJFF(CheckupPrivacyInteractionFragment.LLIZ, Boolean.TRUE)) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[3] = new Pair("permission_type", str);
        IPrivacySettingsDepService iPrivacySettingsDepService = (IPrivacySettingsDepService) PluggableExtentionKt.pluggableSpi$default(IPrivacySettingsDepService.class, false, false, false, 14, null);
        if (iPrivacySettingsDepService != null) {
            strLJIILLIIL = iPrivacySettingsDepService.LJIILLIIL();
        } else {
            strLJIILLIIL = null;
        }
        pairArr[4] = new Pair("user_account_type", strLJIILLIIL);
        C20684815ws.LJIILLIIL("dm_permission_settings_updated", C2097608Jq.LJIIIIZZ(pairArr));
        return Unit.LIZ;
    }

    public static final Object invoke$3(C19336610ku c19336610ku, Object obj, Object obj2, Object obj3, Object obj4) {
        EcProductAddButtonAssem ecProductAddButtonAssem = (EcProductAddButtonAssem) obj;
        if (obj2 != null || obj3 != null || obj4 != null) {
            ecProductAddButtonAssem.Bp(new AwS572S0100000_28(ecProductAddButtonAssem, 206));
        }
        return Unit.LIZ;
    }
}
