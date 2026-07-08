package X;

import Y.ALAdapterS0S0000000_12;
import android.animation.Animator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.slot.AbsSlotWidget;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.livesdk.model.BaLeadsGenInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.ss.android.ugc.aweme.commercialize.live.leadgen.BALeadsGenEvent;
import com.ss.android.ugc.aweme.commercialize.live.leadgen.OpenBAPolicyWebViewEvent;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Tlm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C756400Tlm extends AbsSlotWidget<IIconSlot, IIconSlot.SlotViewModel, EnumC756810TmR> {
    public Room LLILLL;
    public InterfaceC21213717zz LLILZ;
    public final Keva LLILZIL = Keva.getRepo("commercialize_live_leads_gen_keva_name");
    public final C01GW LLILZLL = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(486));

    @Override // X.InterfaceC1124060fMC
    public final String LIZ() {
        return "ba_leads_gen";
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final List<Integer> getMessageType() {
        return C1697810uHb.LJIILJJIL(Integer.valueOf(C001A.BA_LEAD_GEN.getIntType()));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0TlO] */
    @Override // X.InterfaceC1124060fMC
    public final Object LLILZLL() {
        final ?? r0 = new InterfaceC752610Tff() { // from class: X.0TlO
            @Override // X.InterfaceC752610Tff
            public final void LIZ(View view, String str) {
                C19EG c19egLIZIZ;
                Long lValueOf;
                Long lValueOf2;
                Long lValueOf3;
                User owner;
                Context context;
                InterfaceC21213717zz interfaceC21213717zz = this.LIZ.LLILZ;
                Long lValueOf4 = null;
                if (interfaceC21213717zz != null && (context = interfaceC21213717zz.getContext()) != null) {
                    c19egLIZIZ = C1388190mED.LIZIZ(context);
                } else {
                    c19egLIZIZ = null;
                }
                C756400Tlm c756400Tlm = this.LIZ;
                if (c19egLIZIZ == null) {
                    C1AF0.LIZJ("slotGate's context is not FragmentActivity during live");
                    return;
                }
                SettingsManager.LIZLLL().getClass();
                String strLJI = SettingsManager.LJI("live_ba_leads_gen_schema", "");
                if (strLJI != null && strLJI.length() != 0) {
                    Uri.Builder builderBuildUpon = UriProtector.parse(strLJI).buildUpon();
                    Room room = c756400Tlm.LLILLL;
                    if (room != null) {
                        lValueOf = Long.valueOf(room.getId());
                    } else {
                        lValueOf = null;
                    }
                    Uri.Builder builderAppendQueryParameter = builderBuildUpon.appendQueryParameter("room_id", String.valueOf(lValueOf)).appendQueryParameter("enter_from", "during_live");
                    Room room2 = c756400Tlm.LLILLL;
                    if (room2 != null) {
                        lValueOf2 = Long.valueOf(room2.getOwnerUserId());
                    } else {
                        lValueOf2 = null;
                    }
                    String string = builderAppendQueryParameter.appendQueryParameter("ba_uid", String.valueOf(lValueOf2)).toString();
                    C1537900q7g c1537900q7g = C1541950qED.LIZJ;
                    SparkContext sparkContext = new SparkContext();
                    sparkContext.LJJLIIJ(string);
                    sparkContext.LJJJZ("container_bg_color", "00000000");
                    c1537900q7g.getClass();
                    new C1541950qED(c19egLIZIZ, sparkContext).LIZIZ();
                    C756190TlR c756190TlR = C756190TlR.LIZ;
                    Room room3 = c756400Tlm.LLILLL;
                    if (room3 != null) {
                        lValueOf3 = Long.valueOf(room3.getId());
                    } else {
                        lValueOf3 = null;
                    }
                    String strValueOf = String.valueOf(lValueOf3);
                    Room room4 = c756400Tlm.LLILLL;
                    if (room4 != null && (owner = room4.getOwner()) != null) {
                        lValueOf4 = Long.valueOf(owner.getId());
                    }
                    String strValueOf2 = String.valueOf(lValueOf4);
                    c756190TlR.getClass();
                    C756190TlR.LIZIZ(0, 1, strValueOf, strValueOf2, str);
                    return;
                }
                C1AF0.LIZJ("Leads gen's schema is null during live");
            }
        };
        return new IIconSlot(r0) { // from class: X.0Tln
            public final InterfaceC752610Tff LIZ;

            @Override // com.bytedance.android.live.slot.IIconSlot
            public final void getScheme() {
            }

            @Override // com.bytedance.android.live.slot.IIconSlot
            public final Animator.AnimatorListener LIZ() {
                return new ALAdapterS0S0000000_12(7);
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
        this.LLILZIL.storeInt("during_live_report_show_event_times", 0);
        C622680Oba.LIZLLL(this);
    }

    @Override // X.InterfaceC1124060fMC
    public final Enum LLJ() {
        return EnumC756810TmR.SLOT_LIVE_ANCHOR_TOOLBAR;
    }

    @C14EU
    public final void onBALeadsGenEvent(BALeadsGenEvent bALeadsGenEvent) {
        if (Intrinsics.LJFF(bALeadsGenEvent.actionType, EnumC756150TlN.REMOVE.getValue())) {
            ((C756420Tlo) this.LLILZLL.getValue()).LIZIZ(EnumC1108010ewJ.MANUALLY_CLOSE);
        }
    }

    @C14EU
    public final void onBALiveLeadsGenPinActionEvent(C0N09 c0n09) {
        int i = c0n09.LIZ;
        if (i != 0) {
            if (i == 1) {
                ((C756420Tlo) this.LLILZLL.getValue()).LIZ(C756490Tlv.LIZ(new C756500Tlw(EnumC756450Tlr.LEADS_GEN_BA_DURING_LIVE, c0n09.LIZIZ, c0n09.LIZJ, c0n09.LIZLLL, "", new C1107970ewF(-2L))), null);
                return;
            }
            return;
        }
        ((C756420Tlo) this.LLILZLL.getValue()).LIZIZ(EnumC1108010ewJ.MANUALLY_CLOSE);
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void onCreate(Bundle bundle) {
        ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).o3().LIZIZ(EnumC1107860ew4.LIVE_LEADS_GEN, new C756540Tm0());
        C622680Oba.LIZJ(this);
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void onExposure(String str) {
        Long lValueOf;
        User owner;
        int i = this.LLILZIL.getInt("during_live_report_show_event_times", 0);
        C756190TlR c756190TlR = C756190TlR.LIZ;
        Room room = this.LLILLL;
        Long lValueOf2 = null;
        if (room != null) {
            lValueOf = Long.valueOf(room.getId());
        } else {
            lValueOf = null;
        }
        String strValueOf = String.valueOf(lValueOf);
        Room room2 = this.LLILLL;
        if (room2 != null && (owner = room2.getOwner()) != null) {
            lValueOf2 = Long.valueOf(owner.getId());
        }
        String strValueOf2 = String.valueOf(lValueOf2);
        c756190TlR.getClass();
        C756190TlR.LIZJ(i, strValueOf, strValueOf2, str);
        this.LLILZIL.storeInt("during_live_report_show_event_times", i + 1);
    }

    @C14EU
    public final void openPolicyWebView(OpenBAPolicyWebViewEvent openBAPolicyWebViewEvent) {
        Context context;
        InterfaceC21213717zz interfaceC21213717zz = this.LLILZ;
        if (interfaceC21213717zz != null && (context = interfaceC21213717zz.getContext()) != null) {
            C756190TlR.LIZ.getClass();
            C756190TlR.LIZ(context, openBAPolicyWebViewEvent);
        }
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void LLIZ(ViewModel viewModel, InterfaceC21213717zz interfaceC21213717zz) {
        String strLJI;
        TuxIconDrawable tuxIconDrawableLIZ;
        int i;
        InterfaceC1012330cRz interfaceC1012330cRzF4;
        BaLeadsGenInfo baLeadsGenInfo;
        IIconSlot.SlotViewModel slotViewModel = (IIconSlot.SlotViewModel) viewModel;
        this.LL = slotViewModel;
        this.LLILLJJLI = interfaceC21213717zz;
        this.LLILZ = interfaceC21213717zz;
        slotViewModel.LLILZ.setValue(Boolean.TRUE);
        slotViewModel.LLJ.setValue(C800330VaR.LIZIZ(interfaceC21213717zz.getContext(), R.drawable.c6p));
        MutableLiveData<String> mutableLiveData = slotViewModel.LLJILJILJ;
        String str = null;
        if (interfaceC21213717zz.getContext() != null) {
            strLJI = C20642515q3.LJI(2131836435);
        } else {
            strLJI = null;
        }
        mutableLiveData.setValue(strLJI);
        MutableLiveData<Drawable> mutableLiveData2 = slotViewModel.LLJIJIL;
        Context context = interfaceC21213717zz.getContext();
        if (context != null) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_clipboard_two_bars_ltr;
            tuxIconDrawableLIZ = c419910GdJ.LIZ(context);
        } else {
            tuxIconDrawableLIZ = null;
        }
        mutableLiveData2.setValue(tuxIconDrawableLIZ);
        slotViewModel.LLJILLL.setValue(C20642515q3.LJI(2131836434));
        Room room = this.LLILLL;
        if (room != null && (baLeadsGenInfo = room.baLeadsGenInfo) != null) {
            str = baLeadsGenInfo.leadsGenModel;
        }
        if (str != null && str.length() != 0) {
            i = 1;
        } else {
            i = 0;
        }
        slotViewModel.LLJZIJLIL = i;
        ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
        if (iLiveOuterService != null && (interfaceC1012330cRzF4 = iLiveOuterService.F4()) != null) {
            interfaceC1012330cRzF4.LJII(interfaceC21213717zz.getLifecycleOwner(), slotViewModel);
        }
    }

    @Override // X.InterfaceC1124060fMC
    public final void prepareToShow(Map<String, Object> map, InterfaceC756140TlM interfaceC756140TlM) {
        Room room;
        BaLeadsGenInfo baLeadsGenInfo;
        Object obj = map.get("param_room");
        Boolean boolValueOf = null;
        if (obj instanceof Room) {
            room = (Room) obj;
        } else {
            room = null;
        }
        this.LLILLL = room;
        if (room != null && (baLeadsGenInfo = room.baLeadsGenInfo) != null) {
            boolValueOf = Boolean.valueOf(baLeadsGenInfo.leadsGenPermission);
        }
        interfaceC756140TlM.LIZ(Intrinsics.LJFF(boolValueOf, Boolean.TRUE));
    }
}
