package X;

import Y.ALAdapterS0S0000000_12;
import Y.ARunnableS112S0100000_12;
import Y.AfS56S0110000_12;
import android.animation.Animator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.live.slot.AbsSlotWidget;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.ss.android.ugc.aweme.commercialize.live.leadgen.BALeadsGenEvent;
import com.ss.android.ugc.aweme.commercialize.live.leadgen.OpenBAPolicyWebViewEvent;
import com.ss.android.ugc.aweme.commercialize.live.leadgen.api.BALeadsGenLiveApi;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0TlJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C756110TlJ extends AbsSlotWidget<IIconSlot, IIconSlot.SlotViewModel, EnumC756810TmR> implements C01SH {
    public InterfaceC21213717zz LLILLL;
    public IIconSlot.SlotViewModel LLILZ;
    public final Keva LLILZIL = Keva.getRepo("commercialize_live_leads_gen_keva_name");
    public final C11NJ LLILZLL = new C11NJ();
    public final BPEAHandler LLIZ = new BPEAHandler(Looper.getMainLooper());
    public final User LLIZLLLIL = ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUser();
    public boolean LLJ;

    @Override // X.InterfaceC1124060fMC
    public final String LIZ() {
        return "ba_leads_gen";
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0TlK] */
    @Override // X.InterfaceC1124060fMC
    public final Object LLILZLL() {
        final ?? r0 = new InterfaceC752610Tff() { // from class: X.0TlK
            @Override // X.InterfaceC752610Tff
            public final void LIZ(View view, String str) {
                String uid;
                MutableLiveData<Boolean> mutableLiveData;
                String uid2;
                Context context;
                InterfaceC21213717zz interfaceC21213717zz = this.LIZ.LLILLL;
                C19EG c19egLIZIZ = null;
                if (interfaceC21213717zz != null && (context = interfaceC21213717zz.getContext()) != null) {
                    c19egLIZIZ = C1388190mED.LIZIZ(context);
                }
                C756110TlJ c756110TlJ = this.LIZ;
                if (c19egLIZIZ == null) {
                    C1AF0.LIZJ("slotGate's context is not FragmentActivity before live");
                    return;
                }
                SettingsManager.LIZLLL().getClass();
                String str2 = "";
                String strLJI = SettingsManager.LJI("live_ba_leads_gen_schema", "");
                if (strLJI != null && strLJI.length() != 0) {
                    Uri.Builder builderAppendQueryParameter = UriProtector.parse(strLJI).buildUpon().appendQueryParameter("room_id", CardStruct.IStatusCode.DEFAULT).appendQueryParameter("enter_from", "before_live");
                    User user = c756110TlJ.LLIZLLLIL;
                    if (user == null || (uid = user.getUid()) == null) {
                        uid = "";
                    }
                    String string = builderAppendQueryParameter.appendQueryParameter("ba_uid", uid).toString();
                    C1537900q7g c1537900q7g = C1541950qED.LIZJ;
                    SparkContext sparkContext = new SparkContext();
                    sparkContext.LJJLIIJ(string);
                    sparkContext.LJJJZ("container_bg_color", "00000000");
                    c1537900q7g.getClass();
                    new C1541950qED(c19egLIZIZ, sparkContext).LIZIZ();
                    int i = c756110TlJ.LLILZIL.getInt("before_report_click_event_times", 0);
                    C756190TlR c756190TlR = C756190TlR.LIZ;
                    User user2 = c756110TlJ.LLIZLLLIL;
                    if (user2 != null && (uid2 = user2.getUid()) != null) {
                        str2 = uid2;
                    }
                    int i2 = !c756110TlJ.LLJ ? 1 : 0;
                    c756190TlR.getClass();
                    C756190TlR.LIZIZ(i, i2, CardStruct.IStatusCode.DEFAULT, str2, str);
                    c756110TlJ.LLILZIL.storeInt("before_report_click_event_times", i + 1);
                    if (i != 0) {
                        return;
                    }
                    c756110TlJ.LLILZIL.storeInt("leads_gen_before_live_icon_display_times", 6);
                    IIconSlot.SlotViewModel slotViewModel = c756110TlJ.LLILZ;
                    if (slotViewModel == null || (mutableLiveData = slotViewModel.LLIZ) == null) {
                        return;
                    }
                    mutableLiveData.setValue(Boolean.FALSE);
                    return;
                }
                C1AF0.LIZJ("Leads gen's schema is null before live");
            }
        };
        return new IIconSlot(r0) { // from class: X.0TlL
            public final InterfaceC752610Tff LIZ;

            @Override // com.bytedance.android.live.slot.IIconSlot
            public final void getScheme() {
            }

            @Override // com.bytedance.android.live.slot.IIconSlot
            public final Animator.AnimatorListener LIZ() {
                return new ALAdapterS0S0000000_12(6);
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

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void onDestroy() {
        this.LLILZLL.dispose();
        this.LLILZIL.storeInt("before_report_show_event_times", 0);
        this.LLILZIL.storeInt("before_report_click_event_times", 0);
        C622680Oba.LIZLLL(this);
    }

    @Override // X.InterfaceC1124060fMC
    public final Enum LLJ() {
        return EnumC756810TmR.SLOT_BROADCAST_PREVIEW_TOOLBAR;
    }

    public final void LJJ(boolean z) {
        C0TPP.LIZ.getClass();
        this.LLILZLL.LIZ(((BALeadsGenLiveApi) C0TPP.LIZ(BALeadsGenLiveApi.class)).getLeadsGenAddCount(0L).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS56S0110000_12(this, z, 2), new C09JN() { // from class: X.0TIi
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("BALeadsGenBeforeLiveWidget@8d6a.updateIconAlertNum$2");
                C1C7U.LIZIZ("BALeadsGenBeforeLiveWidget@8d6a.updateIconAlertNum$2");
            }
        }));
    }

    @C14EU
    public final void listenToAddLeadGenLiveEvent(BALeadsGenEvent bALeadsGenEvent) {
        MutableLiveData<String> mutableLiveData;
        C756190TlR c756190TlR = C756190TlR.LIZ;
        String str = bALeadsGenEvent.actionType;
        IIconSlot.SlotViewModel slotViewModel = this.LLILZ;
        c756190TlR.getClass();
        if (Intrinsics.LJFF(str, EnumC756150TlN.ADDED.getValue())) {
            if (slotViewModel != null) {
                MutableLiveData<Boolean> mutableLiveData2 = slotViewModel.LLIZ;
                if (mutableLiveData2 != null) {
                    mutableLiveData2.setValue(Boolean.FALSE);
                }
                MutableLiveData<String> mutableLiveData3 = slotViewModel.LLILZLL;
                if (mutableLiveData3 != null) {
                    mutableLiveData3.setValue("1");
                    return;
                }
                return;
            }
            return;
        }
        if (!Intrinsics.LJFF(str, EnumC756150TlN.REMOVE.getValue()) || slotViewModel == null || (mutableLiveData = slotViewModel.LLILZLL) == null) {
            return;
        }
        mutableLiveData.setValue("");
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void onCreate(Bundle bundle) {
        C622680Oba.LIZJ(this);
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public void onEvent(Boolean bool) {
        if (bool != null) {
            bool.booleanValue();
            IIconSlot.SlotViewModel slotViewModel = this.LLILZ;
            if (slotViewModel != null) {
                slotViewModel.LLILZ.setValue(bool);
                if (bool.booleanValue() && this.LLJ) {
                    MutableLiveData<Boolean> mutableLiveData = slotViewModel.LLIZ;
                    if (mutableLiveData != null) {
                        mutableLiveData.setValue(Boolean.FALSE);
                    }
                    MutableLiveData<String> mutableLiveData2 = slotViewModel.LLILZLL;
                    if (mutableLiveData2 != null) {
                        mutableLiveData2.setValue("1");
                        return;
                    }
                    return;
                }
                MutableLiveData<String> mutableLiveData3 = slotViewModel.LLILZLL;
                if (mutableLiveData3 == null) {
                    return;
                }
                mutableLiveData3.setValue("");
            }
        }
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void onExposure(String str) {
        String uid;
        int i = this.LLILZIL.getInt("before_report_show_event_times", 0);
        C756190TlR c756190TlR = C756190TlR.LIZ;
        User user = this.LLIZLLLIL;
        if (user == null || (uid = user.getUid()) == null) {
            uid = "";
        }
        c756190TlR.getClass();
        C756190TlR.LIZJ(i, CardStruct.IStatusCode.DEFAULT, uid, str);
        this.LLILZIL.storeInt("before_report_show_event_times", i + 1);
    }

    @C14EU
    public final void openPolicyWebView(OpenBAPolicyWebViewEvent openBAPolicyWebViewEvent) {
        Context context;
        InterfaceC21213717zz interfaceC21213717zz = this.LLILLL;
        if (interfaceC21213717zz != null && (context = interfaceC21213717zz.getContext()) != null) {
            C756190TlR.LIZ.getClass();
            C756190TlR.LIZ(context, openBAPolicyWebViewEvent);
        }
    }

    @Override // X.C01SH
    public final Object LJIILLIIL(String str, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        try {
            C0TPP.LIZ.getClass();
            if (((BALeadsGenLiveApi) C0TPP.LIZ(BALeadsGenLiveApi.class)).clearLeadsGen().LJ().status_code == 0) {
                C786410Ut5.LJJZZIII(this.LLIZ, new ARunnableS112S0100000_12(this, 380));
                return true;
            }
            return false;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
            return false;
        }
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void LLIZ(ViewModel viewModel, InterfaceC21213717zz interfaceC21213717zz) {
        TuxIconDrawable tuxIconDrawableLIZ;
        IIconSlot.SlotViewModel slotViewModel = (IIconSlot.SlotViewModel) viewModel;
        this.LL = slotViewModel;
        this.LLILLJJLI = interfaceC21213717zz;
        this.LLILLL = interfaceC21213717zz;
        this.LLILZ = slotViewModel;
        slotViewModel.LLILZ.setValue(Boolean.TRUE);
        slotViewModel.LLJ.setValue(C800330VaR.LIZIZ(interfaceC21213717zz.getContext(), R.drawable.c6q));
        slotViewModel.LLJILJILJ.setValue(C20642515q3.LJI(2131836435));
        MutableLiveData<Drawable> mutableLiveData = slotViewModel.LLJIJIL;
        Context context = interfaceC21213717zz.getContext();
        if (context != null) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_clipboard_two_bars_ltr;
            tuxIconDrawableLIZ = c419910GdJ.LIZ(context);
        } else {
            tuxIconDrawableLIZ = null;
        }
        mutableLiveData.setValue(tuxIconDrawableLIZ);
        slotViewModel.LLJILLL.setValue(C20642515q3.LJI(2131836434));
        int i = this.LLILZIL.getInt("leads_gen_before_live_icon_display_times", 0);
        if (i >= 5) {
            LJJ(true);
        } else {
            LJJ(false);
        }
        this.LLILZIL.storeInt("leads_gen_before_live_icon_display_times", i + 1);
    }

    @Override // X.InterfaceC1124060fMC
    public final void prepareToShow(Map<String, Object> map, InterfaceC756140TlM interfaceC756140TlM) {
        Object obj = map.get("param_live_ba_leads_gen");
        if (!(obj instanceof Boolean)) {
            obj = null;
        }
        interfaceC756140TlM.LIZ(Intrinsics.LJFF(obj, Boolean.TRUE));
    }
}
