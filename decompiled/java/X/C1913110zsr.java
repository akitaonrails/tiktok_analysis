package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Looper;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.livesdk.tunnel.BroadcastTunnelVM;
import com.ss.android.ugc.aweme.commercialize.promote.interfaces.ICommercePromoteService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.zhiliaoapp.musically.R;
import java.util.Map;

/* JADX INFO: renamed from: X.0zsr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1913110zsr extends AbstractC757700Tns<IIconSlot, IIconSlot.SlotViewModel, EnumC756810TmR> {
    public final Context LLILZ;
    public IIconSlot.SlotViewModel LLILZIL;
    public boolean LLILZLL;
    public C0SCM LLIZLLLIL;
    public final C1913170zsx LLJI;
    public InterfaceC21213717zz LLJIJIL;
    public String LLIZ = "";
    public Integer LLJ = 0;

    @Override // X.InterfaceC1124060fMC
    public final String LIZ() {
        return "promote";
    }

    @Override // X.InterfaceC1124060fMC
    public final Object LLILZLL() {
        return this.LLJI;
    }

    @Override // X.InterfaceC1124060fMC
    public final Enum LLJ() {
        return EnumC756810TmR.SLOT_BROADCAST_PREVIEW_PROMOTE;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0zss] */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.0zsx] */
    public C1913110zsr(Context context) {
        this.LLILZ = context;
        final ?? r0 = new InterfaceC752610Tff() { // from class: X.0zss
            @Override // X.InterfaceC752610Tff
            public final void LIZ(View view, String str) {
                BroadcastTunnelVM broadcastTunnelVMLIZ;
                InterfaceC20673515v3 interfaceC20673515v3K4;
                MutableLiveData<EnumC517850KSp> mutableLiveData;
                if (C0OBG.LIZIZ(view)) {
                    return;
                }
                IIconSlot.SlotViewModel slotViewModel = this.LIZ.LLILZIL;
                if (slotViewModel != null) {
                    C351501Yb.LIZ(slotViewModel.LLIZ, false);
                }
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("enter_from", "before_live");
                c2344009Gk.LJIIIIZZ("user_id", C1911570zqN.LJI());
                c2344009Gk.LIZJ(C1911570zqN.LJ(), "promote_version");
                c2344009Gk.LIZJ(C1911570zqN.LJFF(), "user_account_type");
                c2344009Gk.LJIIIIZZ("enter_from", "before_live");
                C20684815ws.LJIILLIIL("Promote_entrance_click", c2344009Gk.LIZ);
                if (C290160BYw.LIZ()) {
                    broadcastTunnelVMLIZ = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).K3().LIZIZ(this.LIZ.LLILZ);
                } else {
                    InterfaceC757210Tn5 interfaceC757210Tn5K3 = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).K3();
                    C1913110zsr c1913110zsr = this.LIZ;
                    broadcastTunnelVMLIZ = interfaceC757210Tn5K3.LIZ(c1913110zsr.LJJ(c1913110zsr.LLILZ));
                }
                if (broadcastTunnelVMLIZ != null && (mutableLiveData = broadcastTunnelVMLIZ.LL) != null) {
                    mutableLiveData.setValue(EnumC517850KSp.STREAM_ON);
                }
                C0SCM c0scm = this.LIZ.LLIZLLLIL;
                if (c0scm != null) {
                    c0scm.open();
                }
                Activity activityLIZ = C1388190mED.LIZ(this.LIZ.LLILZ);
                if (activityLIZ != null) {
                    C786410Ut5.ae(0, activityLIZ, 0);
                }
                ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
                if (iLiveOuterService != null && (interfaceC20673515v3K4 = iLiveOuterService.k4()) != null) {
                    interfaceC20673515v3K4.LLILL("promote");
                }
            }
        };
        this.LLJI = new IIconSlot(r0) { // from class: X.0zsx
            public final InterfaceC752610Tff LIZ;

            @Override // com.bytedance.android.live.slot.IIconSlot
            public final void getScheme() {
            }

            @Override // com.bytedance.android.live.slot.IIconSlot
            public final Animator.AnimatorListener LIZ() {
                return new AnimatorListenerAdapter() { // from class: X.0zsy
                };
            }

            @Override // com.bytedance.android.live.slot.IIconSlot
            public final InterfaceC752610Tff LIZJ() {
                return this.LIZ;
            }

            {
                this.LIZ = r0;
            }
        };
    }

    public final C19EG LJJ(Context context) {
        if (context instanceof C19EG) {
            return (C19EG) context;
        }
        if (context instanceof ContextWrapper) {
            return LJJ(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void LLIZ(ViewModel viewModel, InterfaceC21213717zz interfaceC21213717zz) {
        int i;
        IIconSlot.SlotViewModel slotViewModel = (IIconSlot.SlotViewModel) viewModel;
        this.LLILZIL = slotViewModel;
        this.LLJIJIL = interfaceC21213717zz;
        if (slotViewModel != null) {
            C351501Yb.LIZ(slotViewModel.LLILZ, true);
            Integer num = this.LLJ;
            if (num != null && num.intValue() == 0) {
                i = R.drawable.c7d;
            } else {
                i = R.drawable.cqz;
            }
            slotViewModel.LLJ.setValue(C800330VaR.LIZIZ(this.LLILZ, i));
            slotViewModel.LLJILJILJ.setValue(((ICommercePromoteService) ServiceManager.get().getService(ICommercePromoteService.class)).LJIJJ(this.LLILZ, null));
            String str = this.LLIZ;
            MutableLiveData<String> mutableLiveData = slotViewModel.LLIZLLLIL;
            if (Looper.getMainLooper().getThread() == C786410Ut5.u3()) {
                mutableLiveData.setValue(str);
            } else {
                mutableLiveData.postValue(str);
            }
            C351501Yb.LIZ(slotViewModel.LLIZ, this.LLILZLL);
        }
        C1891540zK4 c1891540zK4LJJIJ = ((ICommercePromoteService) ServiceManager.get().getService(ICommercePromoteService.class)).LJJIJ(new InterfaceC1891550zK5() { // from class: X.0zst
            @Override // X.InterfaceC1891550zK5
            public final String LIZ() {
                return null;
            }

            @Override // X.InterfaceC1891550zK5
            public final String LIZIZ() {
                return "myself";
            }

            @Override // X.InterfaceC1891550zK5
            public final Aweme getAweme() {
                return null;
            }

            @Override // X.InterfaceC1891550zK5
            public final String getEnterFrom() {
                return "before_live";
            }

            @Override // X.InterfaceC1891550zK5
            public final Map<String, Object> getExtra() {
                return null;
            }

            @Override // X.InterfaceC1891550zK5
            public final String getItemId() {
                return null;
            }

            @Override // X.InterfaceC1891550zK5
            public final String getPageType() {
                return null;
            }

            @Override // X.InterfaceC1891550zK5
            public final String getSchema() {
                return null;
            }

            @Override // X.InterfaceC1891550zK5
            public final Context getContext() {
                return this.LIZ.LLILZ;
            }
        });
        this.LLIZLLLIL = c1891540zK4LJJIJ;
        if (c1891540zK4LJJIJ != null) {
            c1891540zK4LJJIJ.preload();
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "before_live");
        c2344009Gk.LJIIIIZZ("user_id", C1911570zqN.LJI());
        c2344009Gk.LIZJ(C1911570zqN.LJ(), "promote_version");
        c2344009Gk.LIZJ(C1911570zqN.LJFF(), "user_account_type");
        c2344009Gk.LJIIIIZZ("enter_from", "before_live");
        C20684815ws.LJIILLIIL("Promote_entrance_show", c2344009Gk.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0067  */
    @Override // X.InterfaceC1124060fMC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void prepareToShow(java.util.Map<java.lang.String, ? extends java.lang.Object> r7, X.InterfaceC756140TlM r8) {
        /*
            r6 = this;
            java.lang.String r0 = "param_broadcast_preview_promote_bool"
            java.lang.Object r1 = r7.get(r0)
            boolean r0 = r1 instanceof java.lang.Boolean
            r3 = 0
            if (r0 == 0) goto L69
            java.lang.Boolean r1 = (java.lang.Boolean) r1
        Ld:
            r5 = 0
            if (r1 == 0) goto L67
            boolean r0 = r1.booleanValue()
            if (r0 == 0) goto L67
            com.bytedance.ies.abmock.SettingsManager r4 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()
            java.lang.Class<com.ss.android.ugc.aweme.commercialize.promote.settings.PromoteLiveSetting$PromoteLiveSwitch> r2 = com.ss.android.ugc.aweme.commercialize.promote.settings.PromoteLiveSetting.PromoteLiveSwitch.class
            com.ss.android.ugc.aweme.commercialize.promote.settings.PromoteLiveSetting$PromoteLiveSwitch r1 = com.ss.android.ugc.aweme.commercialize.promote.settings.PromoteLiveSetting.LIZ
            java.lang.String r0 = "promote_for_live_switch"
            java.lang.Object r0 = r4.LJIIIIZZ(r0, r2, r1)
            com.ss.android.ugc.aweme.commercialize.promote.settings.PromoteLiveSetting$PromoteLiveSwitch r0 = (com.ss.android.ugc.aweme.commercialize.promote.settings.PromoteLiveSetting.PromoteLiveSwitch) r0
            if (r0 == 0) goto L29
            r1 = r0
        L29:
            boolean r0 = r1.promoteBeforeLive
            if (r0 == 0) goto L67
            r2 = 1
        L2e:
            java.lang.String r0 = "param_broadcast_preview_promote_dot_badge_bool"
            java.lang.Object r1 = r7.get(r0)
            boolean r0 = r1 instanceof java.lang.Boolean
            if (r0 == 0) goto L40
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            if (r1 == 0) goto L40
            boolean r5 = r1.booleanValue()
        L40:
            r6.LLILZLL = r5
            java.lang.String r0 = "param_broadcast_preview_promote_dot_badge_version_string"
            java.lang.Object r1 = r7.get(r0)
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L50
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L52
        L50:
            java.lang.String r1 = ""
        L52:
            r6.LLIZ = r1
            java.lang.String r0 = "param_live_revision_lib"
            java.lang.Object r1 = r7.get(r0)
            boolean r0 = r1 instanceof java.lang.Integer
            if (r0 == 0) goto L61
            r3 = r1
            java.lang.Integer r3 = (java.lang.Integer) r3
        L61:
            r6.LLJ = r3
            r8.LIZ(r2)
            return
        L67:
            r2 = 0
            goto L2e
        L69:
            r1 = r3
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1913110zsr.prepareToShow(java.util.Map, X.0TlM):void");
    }
}
