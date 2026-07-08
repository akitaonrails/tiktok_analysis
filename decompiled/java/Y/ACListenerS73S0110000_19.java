package Y;

import X.C0HZQ;
import X.C0OBG;
import X.C1054540dY4;
import X.C1232140iAW;
import X.C1365110lcz;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C786410Ut5;
import X.C985403tE;
import X.EnumC1242700iRY;
import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.liveevent.ILiveEventOuterService;
import com.ss.android.ugc.profile.business.ur.ui.MusProfileEditFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS71S0210000_19;

/* JADX INFO: loaded from: classes20.dex */
public class ACListenerS73S0110000_19 implements View.OnClickListener {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
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
        }
    }

    public static final void onClick$0(ACListenerS73S0110000_19 aCListenerS73S0110000_19, View view) {
        if (C0OBG.LIZIZ(view)) {
            return;
        }
        C1232140iAW c1232140iAW = C1232140iAW.LIZ;
        Boolean boolValueOf = Boolean.valueOf(aCListenerS73S0110000_19.z1);
        c1232140iAW.getClass();
        C1232140iAW.LJFF(boolValueOf);
        C1232140iAW.LJI(EnumC1242700iRY.EDIT_PHOTO_OR_AVATAR.getValue());
        ((MusProfileEditFragment) aCListenerS73S0110000_19.l0).KT();
    }

    public static final void onClick$1(ACListenerS73S0110000_19 aCListenerS73S0110000_19, View view) {
        if (C0OBG.LIZIZ(view)) {
            return;
        }
        C1232140iAW c1232140iAW = C1232140iAW.LIZ;
        Boolean boolValueOf = Boolean.valueOf(aCListenerS73S0110000_19.z1);
        c1232140iAW.getClass();
        C1232140iAW.LJFF(boolValueOf);
        ((MusProfileEditFragment) aCListenerS73S0110000_19.l0).KT();
        C1232140iAW.LJI(EnumC1242700iRY.EDIT_PHOTO_OR_AVATAR.getValue());
    }

    public static final void onClick$2(ACListenerS73S0110000_19 aCListenerS73S0110000_19, View view) {
        if (C0OBG.LIZIZ(view)) {
            return;
        }
        C1232140iAW c1232140iAW = C1232140iAW.LIZ;
        Boolean boolValueOf = Boolean.valueOf(aCListenerS73S0110000_19.z1);
        c1232140iAW.getClass();
        C1232140iAW.LJFF(boolValueOf);
        ((MusProfileEditFragment) aCListenerS73S0110000_19.l0).KT();
        C1232140iAW.LJI(EnumC1242700iRY.EDIT_PHOTO_OR_AVATAR.getValue());
    }

    public static final void onClick$3(ACListenerS73S0110000_19 aCListenerS73S0110000_19, View view) throws Throwable {
        ILiveEventOuterService iLiveEventOuterServiceK5;
        if (C0OBG.LIZ(500L, view)) {
            return;
        }
        if (!((C1365110lcz) aCListenerS73S0110000_19.l0).LIZJ.extras.getBoolean("key_is_from_multi_guest_live_event", false)) {
            ((C1365110lcz) aCListenerS73S0110000_19.l0).LIZJ(aCListenerS73S0110000_19.z1);
            return;
        }
        C1365110lcz c1365110lcz = (C1365110lcz) aCListenerS73S0110000_19.l0;
        boolean z = aCListenerS73S0110000_19.z1;
        c1365110lcz.getClass();
        ILiveOuterService iLiveOuterService = (ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class);
        if (iLiveOuterService != null && (iLiveEventOuterServiceK5 = iLiveOuterService.K5()) != null && iLiveEventOuterServiceK5.getLiveEventShieldConfirmValue()) {
            c1365110lcz.LIZJ(z);
            return;
        }
        View viewSd = C786410Ut5.Sd(R.layout.cox, C786410Ut5.ne(c1365110lcz.LIZ), null);
        C0HZQ c0hzq = (C0HZQ) viewSd.findViewById(R.id.dqk);
        if (c0hzq != null) {
            c0hzq.setChecked(c1365110lcz.LJIJ);
        }
        Context context = c1365110lcz.LIZ;
        C1397580mTM c1397580mTM = new C1397580mTM(context);
        c1397580mTM.LJI(context.getString(2131852242));
        c1397580mTM.LIZIZ(c1365110lcz.LIZ.getString(2131852240));
        c1397580mTM.LJIIJJI = new C1054540dY4(viewSd);
        C985403tE.LIZ(c1397580mTM, new AwS71S0210000_19(c1365110lcz, z, c0hzq, 14));
        c1397580mTM.LIZLLL(AFwS257S0000000_19.get$arr$(809));
        c1397580mTM.LJII = false;
        new C1397510mTF(c1397580mTM).LJ();
    }

    public ACListenerS73S0110000_19(Object obj, boolean z, int i) {
        this.$t = i;
        this.l0 = obj;
        this.z1 = z;
    }
}
