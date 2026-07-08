package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.livesdk.tunnel.BroadcastTunnelVM;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import java.util.List;

/* JADX INFO: renamed from: X.0zsu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1913140zsu extends AbstractC1123970fM3 {
    public C0SCM LL;

    @Override // X.InterfaceC1123960fM2
    public final String LIZ() {
        return "PromoteLiveBroadcastSlotProvider";
    }

    @Override // X.InterfaceC1123960fM2
    public final List<EnumC756810TmR> LIZIZ() {
        return C1697810uHb.LJIILJJIL(EnumC756810TmR.SLOT_BROADCAST_SHARE, EnumC756810TmR.SLOT_AUDIENCE_SHARE);
    }

    @Override // X.InterfaceC1123960fM2
    public final List<EnumC1124020fM8> LIZJ() {
        return null;
    }

    @Override // X.InterfaceC1123960fM2
    public final void LIZLLL() {
    }

    @Override // X.InterfaceC1123960fM2
    public final InterfaceC1124060fMC<IIconSlot, IIconSlot.SlotViewModel, EnumC756810TmR> LJ(Context context, EnumC756810TmR enumC756810TmR) {
        return null;
    }

    @Override // X.InterfaceC1123960fM2
    public final InterfaceC1124060fMC<IFrameSlot, IFrameSlot.SlotViewModel, EnumC1124020fM8> LJFF(Context context, EnumC1124020fM8 enumC1124020fM8) {
        return null;
    }

    public static void LJIIIIZZ(String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "during_live");
        c2344009Gk.LJIIIIZZ("user_id", C1911570zqN.LJI());
        c2344009Gk.LIZJ(C1911570zqN.LJ(), "promote_version");
        c2344009Gk.LIZJ(C1911570zqN.LJFF(), "user_account_type");
        c2344009Gk.LJIIIIZZ("enter_from", "during_live");
        c2344009Gk.LJIIIIZZ("promote_by", str);
        C20684815ws.LJIILLIIL("Promote_entrance_click", c2344009Gk.LIZ);
    }

    public static void LJIIIZ(String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "during_live");
        c2344009Gk.LJIIIIZZ("user_id", C1911570zqN.LJI());
        c2344009Gk.LIZJ(C1911570zqN.LJ(), "promote_version");
        c2344009Gk.LIZJ(C1911570zqN.LJFF(), "user_account_type");
        c2344009Gk.LJIIIIZZ("enter_from", "during_live");
        c2344009Gk.LJIIIIZZ("promote_by", str);
        C20684815ws.LJIILLIIL("Promote_entrance_show", c2344009Gk.LIZ);
    }

    public final C19EG LJII(Context context) {
        if (context instanceof C19EG) {
            return (C19EG) context;
        }
        if (context instanceof ContextWrapper) {
            return LJII(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0123  */
    @Override // X.AbstractC1123970fM3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map<java.lang.String, java.lang.Object> LJI(java.util.Map<java.lang.String, ? extends java.lang.Object> r14, X.EnumC756810TmR r15) {
        /*
            Method dump skipped, instruction units count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1913140zsu.LJI(java.util.Map, X.0TmR):java.util.Map");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [X.0zsz] */
    public final void LJIIJ(Context context, String str) {
        BroadcastTunnelVM broadcastTunnelVMLIZ;
        MutableLiveData<EnumC517850KSp> mutableLiveData;
        if (context == null) {
            return;
        }
        LJIIIIZZ(str);
        if (C290160BYw.LIZ()) {
            broadcastTunnelVMLIZ = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).K3().LIZIZ(context);
        } else {
            broadcastTunnelVMLIZ = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).K3().LIZ(LJII(context));
        }
        if (broadcastTunnelVMLIZ != null && (mutableLiveData = broadcastTunnelVMLIZ.LL) != null) {
            mutableLiveData.setValue(EnumC517850KSp.STREAM_ON);
        }
        if (context.getResources().getConfiguration().orientation == 2) {
            ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4().LJLLL(new InterfaceC1913220zt2() { // from class: X.0zsz
                @Override // X.InterfaceC1913220zt2
                public final void onSuccess() {
                    C0SCM c0scm = this.LIZ.LL;
                    if (c0scm == null) {
                        c0scm = null;
                    }
                    c0scm.open();
                }
            });
        } else {
            C0SCM c0scm = this.LL;
            if (c0scm == null) {
                c0scm = null;
            }
            c0scm.open();
        }
        Activity activityLIZ = C1388190mED.LIZ(context);
        if (activityLIZ != null) {
            C786410Ut5.ae(0, activityLIZ, 0);
        }
    }
}
