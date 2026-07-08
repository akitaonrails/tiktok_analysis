package X;

import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdk.model.message.GuestApplyInfo;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0KdN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C521870KdN implements InterfaceC781210Ukh {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC781210Ukh
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
        }
    }

    public static final void run$0(C521870KdN c521870KdN) {
        C0KLH c0klh = (C0KLH) c521870KdN.l0;
        int i = c0klh.LIZ;
        if (i != 1) {
            String strLIZ = C0KNJ.LIZ(i, c0klh.LIZLLL);
            C0KLH c0klh2 = (C0KLH) c521870KdN.l0;
            int i2 = c0klh2.LIZ;
            if (i2 == -1 || i2 == -2) {
                ((C0KL2) c521870KdN.l1).LIZ.LJIIJ.LIZ(c0klh2.LIZJ, strLIZ);
            }
            ((C0KL2) c521870KdN.l1).LIZ.LJIIJ.LJ(-1, ((C0KLH) c521870KdN.l0).LIZIZ, strLIZ, (C0KCK) c521870KdN.l2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void run$1(C521870KdN c521870KdN) {
        EnumC477310Inh enumC477310Inh = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        ((Function1) c521870KdN.l0).invoke(null);
        GuestApplyInfo guestApplyInfo = ((FeedItem) c521870KdN.l1).skylightMultiGuestApplyInfo;
        if (guestApplyInfo != null) {
            C477290Inf c477290Inf = (C477290Inf) c521870KdN.l2;
            c477290Inf.getClass();
            GuestApplyInfo guestApplyInfoLIZIZ = C477290Inf.LIZIZ(guestApplyInfo);
            guestApplyInfoLIZIZ.applyStatus = 2;
            c477290Inf.LJIIIZ(guestApplyInfoLIZIZ, true);
        }
        ((C477290Inf) c521870KdN.l2).LIZJ.setValue(new C477280Ine(false, enumC477310Inh, (Long) (objArr2 == true ? 1 : 0), (String) (objArr == true ? 1 : 0), 30));
        C20441214yg.LJIIIZ("SkylightMultiGuestApplyController", "tryStartCountdownBanner: hide banner at countdown complete");
        ((C477290Inf) c521870KdN.l2).LJ = null;
    }

    public static final void run$2(C521870KdN c521870KdN) {
        String str;
        InterfaceC420801kM interfaceC420801kM = (InterfaceC420801kM) c521870KdN.l0;
        if (interfaceC420801kM != null) {
            interfaceC420801kM.dispose();
        }
        boolean zLJFF = C0W78.LJFF(((C500730JkN) c521870KdN.l1).LL.getActivity());
        C500730JkN c500730JkN = (C500730JkN) c521870KdN.l1;
        c500730JkN.getClass();
        if (zLJFF) {
            str = "setting_success";
        } else {
            str = "cancel_setting";
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_overlay_permission_banner_left");
        c474500IjALIZ.LJJII(c500730JkN.LLIZLLLIL.getValue(), "anchor_id");
        c474500IjALIZ.LJJII(c500730JkN.LLILZ, "enter_from");
        c474500IjALIZ.LJJII(str, "action_type");
        c474500IjALIZ.LJJII(Integer.valueOf(zLJFF ? 1 : 0), "is_success");
        c474500IjALIZ.LJJII("in_live", "scene_type");
        c474500IjALIZ.LIZ();
        Boolean boolValueOf = Boolean.valueOf(zLJFF);
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) c521870KdN.l2;
        C189200o6.m2constructorimpl(boolValueOf);
        interfaceC1364105Vn.resumeWith(boolValueOf);
    }

    public C521870KdN(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
