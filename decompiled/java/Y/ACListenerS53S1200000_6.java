package Y;

import X.C0HFL;
import X.C0HHA;
import X.C0HWW;
import X.C0P0T;
import X.C1350920lG6;
import X.C1391190mJ3;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C20684815ws;
import X.C2344009Gk;
import X.C259800zU;
import X.C440370HOp;
import X.C454210HrX;
import X.C454220HrY;
import X.C454310Hrh;
import X.C454320Hri;
import X.C985403tE;
import X.EnumC437540HDs;
import android.view.View;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.profile.business.ur.ui.SocialAvatarBottomSheetActionFragment;
import com.ss.android.ugc.ur.socialavatar.ISocialAvatarService;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS372S0200000_6;

/* JADX INFO: loaded from: classes7.dex */
public class ACListenerS53S1200000_6 implements View.OnClickListener {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
            case 2:
                onClick$2(this, view);
                break;
            case 3:
                onClick$3(this, view);
                break;
            case 4:
                onClick$4(this, view);
                break;
            case 5:
                onClick$5(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS53S1200000_6 aCListenerS53S1200000_6, View view) {
        C0P0T c0p0t;
        ((Function0) aCListenerS53S1200000_6.l1).invoke();
        C440370HOp c440370HOp = C440370HOp.LIZ;
        String str = aCListenerS53S1200000_6.s0;
        c440370HOp.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("action_type", "click");
        c2344009Gk.LJIIIIZZ("sticker_id", str);
        C20684815ws.LJIILLIIL("imagine_studio_generated_sticker_popup", c2344009Gk.LIZ);
        C0P0T c0p0t2 = (C0P0T) ((C259800zU) aCListenerS53S1200000_6.l2).element;
        if (c0p0t2 != null && c0p0t2.isShowing() && (c0p0t = (C0P0T) ((C259800zU) aCListenerS53S1200000_6.l2).element) != null) {
            c0p0t.dismiss();
        }
    }

    public static final void onClick$1(ACListenerS53S1200000_6 aCListenerS53S1200000_6, View view) {
        Function0<Unit> function0;
        C0HWW c0hww = C0HWW.LIZ;
        String str = aCListenerS53S1200000_6.s0;
        c0hww.getClass();
        C0HWW.LIZLLL(str, "edit_avatar");
        ((ISocialAvatarService) ((SocialAvatarBottomSheetActionFragment) aCListenerS53S1200000_6.l1).LLJI.getValue()).LJIILLIIL(new C0HHA(((View) aCListenerS53S1200000_6.l2).getContext(), "click_edit_profile", "personal_homepage", null, null, 4, false, false, null, false, null, 4024), EnumC437540HDs.SUCCESSFUL, null);
        C0HFL c0hfl = ((SocialAvatarBottomSheetActionFragment) aCListenerS53S1200000_6.l1).LLILLL;
        if (c0hfl != null && (function0 = c0hfl.LIZLLL) != null) {
            function0.invoke();
        }
    }

    public static final void onClick$2(ACListenerS53S1200000_6 aCListenerS53S1200000_6, View view) {
        C0HWW c0hww = C0HWW.LIZ;
        String str = aCListenerS53S1200000_6.s0;
        c0hww.getClass();
        C0HWW.LIZLLL(str, "re_create_avatar");
        C0HWW.LJ("show", null, null);
        C1397580mTM c1397580mTM = new C1397580mTM(((View) aCListenerS53S1200000_6.l1).getContext());
        c1397580mTM.LJFF(2131827108);
        c1397580mTM.LIZ(2131827106);
        C985403tE.LIZ(c1397580mTM, new AwS372S0200000_6((View) aCListenerS53S1200000_6.l1, (SocialAvatarBottomSheetActionFragment) aCListenerS53S1200000_6.l2, 45));
        new C1397510mTF(c1397580mTM).LIZLLL();
    }

    public static final void onClick$3(ACListenerS53S1200000_6 aCListenerS53S1200000_6, View view) {
        C1350920lG6.LJJII("close", aCListenerS53S1200000_6.s0, (Map) aCListenerS53S1200000_6.l1);
        String str = TuxSheet._pnsPageId;
        C1391190mJ3.LJ((C454220HrY) aCListenerS53S1200000_6.l2, C454310Hrh.LIZ);
    }

    public static final void onClick$4(ACListenerS53S1200000_6 aCListenerS53S1200000_6, View view) {
        C1350920lG6.LJJII("report", aCListenerS53S1200000_6.s0, (Map) aCListenerS53S1200000_6.l1);
        String str = TuxSheet._pnsPageId;
        C1391190mJ3.LJ((C454220HrY) aCListenerS53S1200000_6.l2, C454320Hri.LIZ);
    }

    public static final void onClick$5(ACListenerS53S1200000_6 aCListenerS53S1200000_6, View view) {
        C1350920lG6.LJJII("sticker_set_name", aCListenerS53S1200000_6.s0, (Map) aCListenerS53S1200000_6.l1);
        ((C454210HrX) aCListenerS53S1200000_6.l2).LIZLLL.LIZJ.invoke();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ACListenerS53S1200000_6(android.view.View r2, com.ss.android.ugc.profile.business.ur.ui.SocialAvatarBottomSheetActionFragment r3, java.lang.String r4, int r5) {
        /*
            r1 = this;
            r1.$t = r5
            int r5 = 1 - r5
            if (r5 == 0) goto L11
            r0 = r1
            r0.s0 = r4
            r0.l1 = r2
            r0.l2 = r3
        Ld:
            r0.<init>()
            return
        L11:
            r0 = r1
            r0.s0 = r4
            r0.l1 = r3
            r0.l2 = r2
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACListenerS53S1200000_6.<init>(android.view.View, com.ss.android.ugc.profile.business.ur.ui.SocialAvatarBottomSheetActionFragment, java.lang.String, int):void");
    }

    public ACListenerS53S1200000_6(String str, Object obj, Object obj2, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
        this.l2 = obj2;
    }
}
