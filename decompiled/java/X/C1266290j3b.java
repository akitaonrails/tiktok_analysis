package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.ecommerce.base.messagecenter.FragmentSwitchAssem;
import com.ss.android.ugc.profile.business.profile.popup.BaseMyProfileGuideWidget;
import com.ss.android.ugc.profile.business.ur.editprofileassem.EditProfileNicknameCellAssem;
import com.ss.android.ugc.profile.platform.framework.aweme.profile.viewmodel.MyProfileGuideState;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS614S0100000_35;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0j3b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public class C1266290j3b extends C09AY implements InterfaceC1685420txc {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1685420txc
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3, obj4, obj5);
            case 1:
                return invoke$1(this, obj, obj2, obj3, obj4, obj5);
            case 2:
                return invoke$2(this, obj, obj2, obj3, obj4, obj5);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1266290j3b(FragmentSwitchAssem fragmentSwitchAssem, int i) {
        super(5);
        this.$t = i;
        this.l0 = fragmentSwitchAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1266290j3b(BaseMyProfileGuideWidget baseMyProfileGuideWidget, int i) {
        super(5);
        this.$t = i;
        this.l0 = baseMyProfileGuideWidget;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1266290j3b(EditProfileNicknameCellAssem editProfileNicknameCellAssem, int i) {
        super(5);
        this.$t = i;
        this.l0 = editProfileNicknameCellAssem;
    }

    public static final Object invoke$0(C1266290j3b c1266290j3b, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        Boolean bool = (Boolean) obj2;
        AbstractC1252750ihl abstractC1252750ihl = (AbstractC1252750ihl) obj3;
        Integer num = (Integer) obj5;
        if (!((MyProfileGuideState) ((C11E9) obj).withState(((BaseMyProfileGuideWidget) c1266290j3b.l0).LJIILIIL(), C1ECZ.LL)).getHasGuideShowed() && Intrinsics.LJFF(obj4, Boolean.TRUE)) {
            ((BaseMyProfileGuideWidget) c1266290j3b.l0).LJIILIIL().setState(new AwS614S0100000_35(bool, 119));
            ((BaseMyProfileGuideWidget) c1266290j3b.l0).LJIILIIL().setState(new AwS614S0100000_35(abstractC1252750ihl, (AbstractC1252750ihl<? extends Pair<? extends UrlModel, ? extends C428600GrK>>) 120));
            ((BaseMyProfileGuideWidget) c1266290j3b.l0).LJIILIIL().setState(new AwS614S0100000_35(num, 121));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(C1266290j3b c1266290j3b, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i;
        String str = (String) obj2;
        int iIntValue = ((Number) obj3).intValue();
        ((Boolean) obj4).booleanValue();
        boolean zBooleanValue = ((Boolean) obj5).booleanValue();
        EditProfileNicknameCellAssem editProfileNicknameCellAssem = (EditProfileNicknameCellAssem) c1266290j3b.l0;
        editProfileNicknameCellAssem.getClass();
        if (iIntValue == 0) {
            i = 1;
        } else {
            i = 0;
        }
        if (C1EDI.LJ()) {
            if (str.length() == 0) {
                C127K c127k = editProfileNicknameCellAssem.LLJ;
                if (c127k != null) {
                    C1215970hkR.LIZJ(c127k, C1216270hkv.LIZJ(2131833197), false);
                }
            } else {
                C127K c127k2 = editProfileNicknameCellAssem.LLJ;
                if (c127k2 != null) {
                    C1215970hkR.LIZLLL(c127k2, str);
                }
            }
        } else {
            C127K c127k3 = editProfileNicknameCellAssem.LLJ;
            if (c127k3 != null) {
                C1215970hkR.LJ(c127k3, str, zBooleanValue);
            }
        }
        C1232140iAW.LIZ.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(i ^ 1, "complete_status");
        C20684815ws.LJIILLIIL("show_profile_name", c2344009Gk.LIZ);
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x0191  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$2(X.C1266290j3b r11, java.lang.Object r12, java.lang.Object r13, java.lang.Object r14, java.lang.Object r15, java.lang.Object r16) {
        /*
            Method dump skipped, instruction units count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1266290j3b.invoke$2(X.0j3b, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
