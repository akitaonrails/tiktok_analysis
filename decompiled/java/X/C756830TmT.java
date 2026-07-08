package X;

import Y.AComparatorS31S0000000_12;
import Y.AObjectS355S0100000_12;
import Y.AObserverS216S0100000_12;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.live.slot.AbsSlotWidget;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.live.slot.LiveShopAddPermissionBusinessSetting;
import com.bytedance.android.livesdk.dataChannel.ECPreviewIndependentHasProduct;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostCommerce;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.slot.SlotsBottomSheetDialog;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0TmT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C756830TmT extends AbstractC756740TmK<IIconSlot, IIconSlot.SlotViewModel, EnumC756810TmR> implements InterfaceC1124130fMJ {
    public IIconSlot.SlotViewModel LLILLL;
    public InterfaceC21213717zz LLILZ;
    public Drawable LLILZIL;
    public C20743516Fd LLILZLL;
    public boolean LLIZ;
    public final EnumC756810TmR LLIZLLLIL;
    public InterfaceC1124060fMC<IIconSlot, IIconSlot.SlotViewModel, EnumC756810TmR> LLJ;
    public final C756100TlI LLJI;
    public final C756060TlE LL = new C756060TlE();
    public final C756850TmV LLILLJJLI = new C756850TmV(this);
    public final HashMap<InterfaceC1124060fMC, IIconSlot.SlotViewModel> LLJIJIL = new HashMap<>();
    public String LLJILJIL = "homepage";
    public final String LLJILJILJ = "notify_kyc_status_refresh";
    public final String LLJILLL = "notify_kyc_id_verification_popup";
    public int LLJJ = 0;
    public Set<InterfaceC1124060fMC> LLJJI = new HashSet();
    public final Set<String> LLJJIII = new HashSet();
    public EnumC21266718Kj LLJJIJI = EnumC21266718Kj.NONE;
    public final Set<InterfaceC1124060fMC> LLJJIJIIJIL = new HashSet();

    @Override // X.InterfaceC1124060fMC
    public final String LIZ() {
        return "LIVE_SDK_GroupBusiness";
    }

    @Override // X.InterfaceC1124060fMC
    public final List<Integer> getMessageType() {
        return null;
    }

    @Override // X.InterfaceC1124060fMC
    public final void onCreate(Bundle bundle) {
    }

    @Override // X.InterfaceC1124060fMC
    public final void onDispose() {
    }

    @Override // X.AbstractC756740TmK, X.InterfaceC756750TmL, X.InterfaceC1124060fMC
    public void onEvent(Boolean bool) {
    }

    @Override // X.InterfaceC1124060fMC
    public final void onMessage(IMessage iMessage) {
    }

    @Override // X.InterfaceC1124060fMC
    public final void onPause() {
    }

    @Override // X.InterfaceC1124060fMC
    public final void onResume() {
    }

    @Override // X.InterfaceC1124060fMC
    public final void onStart() {
    }

    @Override // X.InterfaceC1124060fMC
    public final void onStop() {
    }

    public final void LIZJ() {
        if (this.LLJIJIL.size() == 0) {
            LIZIZ(false);
            InterfaceC21213717zz interfaceC21213717zz = this.LLILZ;
            if (interfaceC21213717zz != null) {
                interfaceC21213717zz.LJII(this, this.LLILLL);
            }
            this.LLJJIJI = EnumC21266718Kj.NONE;
            return;
        }
        if (this.LLJIJIL.size() != 1) {
            LIZIZ(true);
            InterfaceC21213717zz interfaceC21213717zz2 = this.LLILZ;
            if (interfaceC21213717zz2 != null) {
                interfaceC21213717zz2.LJII(this, this.LLILLL);
            }
            this.LLJJIJI = EnumC21266718Kj.BUSINESS;
            return;
        }
        Map.Entry<InterfaceC1124060fMC, IIconSlot.SlotViewModel> next = this.LLJIJIL.entrySet().iterator().next();
        InterfaceC21213717zz interfaceC21213717zz3 = this.LLILZ;
        if (interfaceC21213717zz3 != null) {
            interfaceC21213717zz3.LJII(next.getKey(), next.getValue());
        }
        C21266818Kk c21266818Kk = EnumC21266618Ki.Companion;
        String strLIZ = next.getKey().LIZ();
        c21266818Kk.getClass();
        this.LLJJIJI = C21266818Kk.LIZJ(strLIZ);
    }

    public final String LJI() {
        return this.LLILLL.LLIZ.getValue() != null ? this.LLILLL.LLIZ.getValue().booleanValue() ? "1" : CardStruct.IStatusCode.DEFAULT : ((IHostCommerce) C1161920gLG.LIZJ(IHostCommerce.class)).Xh(this.LLILZ.LJI());
    }

    @Override // X.InterfaceC1124060fMC
    public final void onDestroy() {
        if (LiveShopAddPermissionBusinessSetting.INSTANCE.isEnabled()) {
            ((HashSet) this.LLJJIII).clear();
            ((HashSet) this.LLJJI).clear();
            ((HashSet) this.LLJJIJIIJIL).clear();
        }
        DataChannelGlobal.LLILZ.zQ2(this);
        C756850TmV c756850TmV = this.LLILLJJLI;
        SlotsBottomSheetDialog slotsBottomSheetDialog = c756850TmV.LIZ;
        if (slotsBottomSheetDialog != null && slotsBottomSheetDialog.isShowing()) {
            c756850TmV.LIZ.dismissAllowingStateLoss();
        }
        C622680Oba.LIZLLL(this);
    }

    @Override // X.InterfaceC1124060fMC
    public final /* bridge */ /* synthetic */ Object LLILZLL() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC1124060fMC
    public final Enum LLJ() {
        return EnumC756810TmR.SLOT_BROADCAST_PREVIEW_TOOLBAR;
    }

    public C756830TmT(EnumC756810TmR enumC756810TmR) {
        this.LLIZLLLIL = enumC756810TmR;
        this.LLJI = new C756100TlI(enumC756810TmR);
    }

    public final void LIZIZ(boolean z) {
        String string;
        C20743516Fd c20743516FdLIZLLL;
        Drawable drawableLIZIZ;
        IIconSlot.SlotViewModel slotViewModel = this.LLILLL;
        if (slotViewModel == null) {
            return;
        }
        Boolean value = slotViewModel.LLILZ.getValue();
        if (value == null || z != value.booleanValue()) {
            this.LLILLL.LLILZ.setValue(Boolean.valueOf(z));
        }
        String value2 = null;
        if (this.LLILZIL == null) {
            EnumC756810TmR enumC756810TmR = this.LLIZLLLIL;
            EnumC756810TmR enumC756810TmR2 = EnumC756810TmR.SLOT_BROADCAST_PREVIEW_TOOLBAR;
            int i = R.drawable.ebm;
            if (enumC756810TmR == enumC756810TmR2) {
                if (this.LLJJ != 0) {
                    i = R.drawable.cqy;
                }
                drawableLIZIZ = C800330VaR.LIZIZ(this.LLILZ.getContext(), i);
            } else if (enumC756810TmR == EnumC756810TmR.SLOT_LIVE_ANCHOR_TOOLBAR) {
                drawableLIZIZ = C20736316Cj.LIZLLL(R.attr.eg1, this.LLILZ.getContext());
            } else if (enumC756810TmR == EnumC756810TmR.SLOT_LIVE_WATCHER_TOOLBAR) {
                if (LiveShopAddPermissionBusinessSetting.INSTANCE.isEnabled()) {
                    C20743516Fd c20743516FdLIZLLL2 = C20736316Cj.LIZLLL(R.attr.eg1, this.LLILZ.getContext());
                    c20743516FdLIZLLL2.setTint(C446980Hfs.LIZ(this.LLILZ.getContext(), R.color.aaj));
                    int iLIZ = C446980Hfs.LIZ(this.LLILZ.getContext(), R.color.a6j);
                    if (iLIZ == 0) {
                        c20743516FdLIZLLL2.LIZLLL(null);
                        drawableLIZIZ = c20743516FdLIZLLL2;
                    } else {
                        c20743516FdLIZLLL2.LIZLLL(new ColorDrawable(iLIZ));
                        drawableLIZIZ = c20743516FdLIZLLL2;
                    }
                } else {
                    drawableLIZIZ = C20736316Cj.LIZLLL(R.attr.eg1, this.LLILZ.getContext());
                }
            } else {
                drawableLIZIZ = C800330VaR.LIZIZ(this.LLILZ.getContext(), R.drawable.ebm);
            }
            this.LLILZIL = drawableLIZIZ;
        }
        this.LLILLL.LLJ.setValue(this.LLILZIL);
        if (this.LLILZLL == null) {
            EnumC756810TmR enumC756810TmR3 = this.LLIZLLLIL;
            if (enumC756810TmR3 != EnumC756810TmR.SLOT_BROADCAST_PREVIEW_TOOLBAR && (enumC756810TmR3 == EnumC756810TmR.SLOT_LIVE_ANCHOR_TOOLBAR || enumC756810TmR3 == EnumC756810TmR.SLOT_LIVE_WATCHER_TOOLBAR)) {
                c20743516FdLIZLLL = C20736316Cj.LIZLLL(R.attr.eg1, this.LLILZ.getContext());
            } else {
                c20743516FdLIZLLL = null;
            }
            this.LLILZLL = c20743516FdLIZLLL;
        }
        C20743516Fd c20743516Fd = this.LLILZLL;
        if (c20743516Fd != null) {
            this.LLILLL.LLJI.setValue(c20743516Fd);
        }
        MutableLiveData<String> mutableLiveData = this.LLILLL.LLJILJILJ;
        Context context = this.LLILZ.getContext();
        EnumC756810TmR enumC756810TmR4 = this.LLIZLLLIL;
        if (enumC756810TmR4 != EnumC756810TmR.SLOT_BROADCAST_PREVIEW_TOOLBAR && enumC756810TmR4 != EnumC756810TmR.SLOT_LIVE_ANCHOR_TOOLBAR && enumC756810TmR4 == EnumC756810TmR.SLOT_LIVE_WATCHER_TOOLBAR) {
            string = context.getString(2131821346);
        } else {
            string = context.getString(2131821346);
        }
        mutableLiveData.setValue(string);
        C756060TlE c756060TlE = this.LL;
        if (c756060TlE != null) {
            int i2 = Integer.MAX_VALUE;
            for (InterfaceC1124060fMC interfaceC1124060fMC : (ArrayList) c756060TlE.LIZIZ) {
                IIconSlot.SlotViewModel slotViewModel2 = (IIconSlot.SlotViewModel) ((HashMap) this.LL.LIZJ).get(interfaceC1124060fMC);
                if (slotViewModel2.LLILZLL.getValue() != null) {
                    this.LLILLL.LLILZLL.setValue(slotViewModel2.LLILZLL.getValue());
                }
                slotViewModel2.LLILZLL.observe((LifecycleOwner) this.LLILZ.getContext(), new AObserverS216S0100000_12(this, 47));
                int iLIZIZ = C756800TmQ.LIZIZ(interfaceC1124060fMC.LIZ());
                if (slotViewModel2.LLJLIL != 0 && !C199499133x.LIZ(slotViewModel2.LLJJ.getValue()) && iLIZIZ < i2) {
                    this.LLILLL.LLJLIL = slotViewModel2.LLJLIL;
                    value2 = slotViewModel2.LLJJ.getValue();
                    i2 = iLIZIZ;
                }
            }
            if (value2 != null) {
                this.LLILLL.LLJJ.postValue(value2);
            }
            if (this.LLILLL.LLILZLL.getValue() == null) {
                EnumC756810TmR enumC756810TmR5 = this.LLIZLLLIL;
                EnumC756810TmR enumC756810TmR6 = EnumC756810TmR.SLOT_BROADCAST_PREVIEW_TOOLBAR;
                if (enumC756810TmR5 == enumC756810TmR6) {
                    int iLJFF = C1305440k4k.LIZIZ(this.LLILZ.getContext()).LJFF("ttlive_broadcast_preview_business_icon_guide_count", 0);
                    if (iLJFF < 5) {
                        this.LLILLL.LLIZ.postValue(Boolean.TRUE);
                        this.LLIZ = true;
                        C1305440k4k c1305440k4kLIZIZ = C1305440k4k.LIZIZ(this.LLILZ.getContext());
                        c1305440k4kLIZIZ.LJII(Integer.valueOf(iLJFF + 1), "ttlive_broadcast_preview_business_icon_guide_count");
                        c1305440k4kLIZIZ.LIZ();
                        return;
                    }
                    if (this.LLIZLLLIL != enumC756810TmR6 || this.LLILZ.LJI() == null || this.LLILZ.LJI().isOldRedDotLogic || !this.LLILZ.LJI().displayEcIcon || this.LLILZ.LJI().independentDisplayEcIcon || !this.LLILZ.LJI().displayRedDot) {
                        return;
                    }
                    this.LLILLL.LLIZ.postValue(Boolean.TRUE);
                    this.LLIZ = true;
                }
            }
        }
    }

    @Override // X.InterfaceC756750TmL
    public final boolean LJ(InterfaceC1124060fMC interfaceC1124060fMC) {
        C756060TlE c756060TlE = this.LL;
        synchronized (c756060TlE) {
            for (int i = 0; i < ((ArrayList) c756060TlE.LIZIZ).size(); i++) {
                if (ListProtector.get(c756060TlE.LIZIZ, i) == interfaceC1124060fMC) {
                    return true;
                }
            }
            return false;
        }
    }

    public final void LJFF(C2344009Gk c2344009Gk) {
        String str;
        if (this.LLILZ.LJI() != null && this.LLILZ.LJI().bubbleMetadata != null) {
            String str2 = this.LLILZ.LJI().bubbleMetadata.liveTaskId;
            int i = this.LLILZ.LJI().bubbleMetadata.liveTaskStatus;
            if (!C2093608Ic.LJ(str2)) {
                c2344009Gk.LJFF("live_task_id", str2);
                InterfaceC756880TmY.LIZJ.getClass();
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            str = "unknown";
                        } else {
                            str = "completed";
                        }
                    } else {
                        str = "ongoing";
                    }
                } else {
                    str = "not_accepted";
                }
                c2344009Gk.LJFF("live_task_status", str);
            }
        }
    }

    @Override // X.InterfaceC1124130fMJ
    public final void LJIIJ(String str) {
        EnumC21266618Ki.Companion.getClass();
        if (C21266818Kk.LIZIZ(str)) {
            ((HashSet) this.LLJJIII).add(str);
        }
    }

    @Override // X.InterfaceC212387189p
    public final void LJIILIIL(final Function1<? super C1892750zM1, Unit> function1) {
        if (!LiveShopAddPermissionBusinessSetting.INSTANCE.isEnabled()) {
            return;
        }
        for (Map.Entry entry : ((HashMap) this.LL.LIZJ).entrySet()) {
            InterfaceC1124060fMC interfaceC1124060fMC = (InterfaceC1124060fMC) entry.getKey();
            Object value = entry.getValue();
            if (((HashSet) this.LLJJIII).contains(interfaceC1124060fMC.LIZ()) && value != null && (interfaceC1124060fMC instanceof InterfaceC756370Tlj) && !((HashSet) this.LLJJIJIIJIL).contains(interfaceC1124060fMC)) {
                ((InterfaceC756370Tlj) interfaceC1124060fMC).LJIIIZ(new InterfaceC1892740zM0() { // from class: X.0TmW
                    @Override // X.InterfaceC1892740zM0
                    public final void LIZ(C1892750zM1 c1892750zM1) {
                        function1.invoke(c1892750zM1);
                    }
                });
                ((HashSet) this.LLJJIJIIJIL).add(interfaceC1124060fMC);
            }
        }
    }

    @Override // X.InterfaceC212387189p
    public final void LJIJI(C756930Tmd c756930Tmd) {
        boolean z;
        if (LiveShopAddPermissionBusinessSetting.INSTANCE.isEnabled() && this.LLJIJIL != null && this.LLJJIJI != c756930Tmd.LIZ) {
            HashSet hashSet = new HashSet();
            for (Map.Entry entry : ((HashMap) this.LL.LIZJ).entrySet()) {
                InterfaceC1124060fMC interfaceC1124060fMC = (InterfaceC1124060fMC) entry.getKey();
                IIconSlot.SlotViewModel slotViewModel = (IIconSlot.SlotViewModel) entry.getValue();
                String strLIZ = interfaceC1124060fMC.LIZ();
                if (slotViewModel != null && ((HashSet) this.LLJJIII).contains(strLIZ)) {
                    if ((!c756930Tmd.LIZIZ || !C2093608Ic.LIZJ(strLIZ, c756930Tmd.LIZJ)) && c756930Tmd.LIZ != EnumC21266718Kj.BUSINESS) {
                        z = false;
                        this.LLJIJIL.remove(interfaceC1124060fMC);
                    } else {
                        z = true;
                        this.LLJIJIL.put(interfaceC1124060fMC, slotViewModel);
                        hashSet.add(entry.getKey());
                    }
                    slotViewModel.LLILZ.setValue(Boolean.valueOf(z));
                }
            }
            if (!this.LLJJI.equals(hashSet)) {
                LIZJ();
            }
            this.LLJJI = new HashSet(hashSet);
        }
    }

    @Override // X.InterfaceC1124060fMC
    public final void onExposure(String str) {
        String str2;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("anchor_id", ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID());
        c2344009Gk.LJIIIIZZ("room_id", this.LLJI.LIZ());
        c2344009Gk.LJIIIIZZ("live_status", this.LLJI.LIZLLL);
        c2344009Gk.LJIIIIZZ("enter_from_merge", this.LLJI.LIZ);
        c2344009Gk.LJIIIIZZ("enter_method", this.LLJI.LIZIZ);
        C20684815ws.LJIILLIIL("livesdk_business_icon_show_notify", c2344009Gk.LIZ);
        C2344009Gk c2344009Gk2 = new C2344009Gk();
        c2344009Gk2.LJIIIIZZ("author_id", ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID());
        c2344009Gk2.LJIIIIZZ("room_id", this.LLJI.LIZ());
        c2344009Gk2.LJIIIIZZ("EVENT_ORIGIN_FEATURE", "TEMAI");
        c2344009Gk2.LJIIIIZZ("live_status", this.LLJI.LIZLLL);
        if (this.LLILZ.LJI() != null && this.LLILZ.LJI().hasEcLivePermission) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk2.LJIIIIZZ("has_ec_permission", str2);
        c2344009Gk2.LJIIIIZZ("is_red_dot", LJI());
        c2344009Gk2.LJIIIIZZ("ec_icon_show_position", ((IHostCommerce) C1161920gLG.LIZJ(IHostCommerce.class)).Tv(this.LLJIJIL.size(), this.LLILZ.LJI()));
        c2344009Gk2.LJIIIIZZ("previous_page", this.LLJILJIL);
        c2344009Gk2.LIZJ(((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUser().getFansCount(), "fans_cnt");
        LJFF(c2344009Gk2);
        C20684815ws.LJIILLIIL("livesdk_tiktokec_business_icon_show", c2344009Gk2.LIZ);
        ((IHostCommerce) C1161920gLG.LIZJ(IHostCommerce.class)).ld("business_icon_show");
        for (InterfaceC1124060fMC interfaceC1124060fMC : this.LLJIJIL.keySet()) {
            if (interfaceC1124060fMC instanceof AbsSlotWidget) {
                ((AbsSlotWidget) interfaceC1124060fMC).onAggregateExposure(str);
            }
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public void onJsBroadCastEvent(C484220Iyq c484220Iyq) {
        if (c484220Iyq != null) {
            try {
                JSONObject jSONObject = c484220Iyq.LIZ;
                if (jSONObject != null) {
                    String string = JSONObjectProtectorUtils.getString(jSONObject, "eventName");
                    if (TextUtils.equals(this.LLJILJILJ, string) || TextUtils.equals(this.LLJILLL, string)) {
                        this.LLJILJIL = ((IHostCommerce) C1161920gLG.LIZJ(IHostCommerce.class)).Bb(string, JSONObjectProtectorUtils.getJSONObject(c484220Iyq.LIZ, "data"));
                    }
                }
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public static void LJII(C756830TmT c756830TmT, Boolean bool) {
        if (bool != null) {
            if (c756830TmT.LLJIJIL != null) {
                if (LiveShopAddPermissionBusinessSetting.INSTANCE.isEnabled()) {
                    ((HashSet) c756830TmT.LLJJI).clear();
                }
                for (Map.Entry entry : ((HashMap) c756830TmT.LL.LIZJ).entrySet()) {
                    IIconSlot.SlotViewModel slotViewModel = (IIconSlot.SlotViewModel) entry.getValue();
                    if (Boolean.TRUE.equals(slotViewModel.LLLFFI)) {
                        slotViewModel.LLILZ.setValue(bool);
                        if (bool.booleanValue()) {
                            c756830TmT.LLJIJIL.put((InterfaceC1124060fMC) entry.getKey(), slotViewModel);
                            if (LiveShopAddPermissionBusinessSetting.INSTANCE.isEnabled()) {
                                ((HashSet) c756830TmT.LLJJI).add(entry.getKey());
                            }
                        } else {
                            c756830TmT.LLJIJIL.remove(entry.getKey());
                        }
                        c756830TmT.LIZJ();
                    }
                }
                return;
            }
            return;
        }
        c756830TmT.getClass();
    }

    @Override // X.InterfaceC756750TmL
    public final void LIZLLL(InterfaceC1124060fMC interfaceC1124060fMC, IIconSlot.SlotViewModel slotViewModel) {
        C756060TlE c756060TlE = this.LL;
        synchronized (c756060TlE) {
            Integer numValueOf = Integer.valueOf(C756800TmQ.LIZIZ(interfaceC1124060fMC.LIZ()));
            int size = ((ArrayList) c756060TlE.LIZIZ).size();
            int i = 0;
            while (true) {
                if (i >= ((ArrayList) c756060TlE.LIZIZ).size()) {
                    break;
                }
                if (numValueOf.intValue() >= Integer.valueOf(C756800TmQ.LIZIZ(((InterfaceC1124060fMC) ListProtector.get(c756060TlE.LIZIZ, i)).LIZ())).intValue()) {
                    i++;
                } else {
                    size = i;
                    break;
                }
            }
            ListProtector.add(c756060TlE.LIZIZ, size, interfaceC1124060fMC);
            ((HashMap) c756060TlE.LIZJ).put(interfaceC1124060fMC, slotViewModel);
        }
    }

    @Override // X.InterfaceC1124060fMC
    public final void LLIZ(ViewModel viewModel, InterfaceC21213717zz interfaceC21213717zz) {
        IIconSlot.SlotViewModel slotViewModel = (IIconSlot.SlotViewModel) viewModel;
        IIconSlot.SlotViewModel slotViewModel2 = this.LLILLL;
        this.LLILLL = slotViewModel;
        this.LLILZ = interfaceC21213717zz;
        PriorityBlockingQueue priorityBlockingQueue = new PriorityBlockingQueue(3, new AComparatorS31S0000000_12(13));
        for (Map.Entry entry : ((HashMap) this.LL.LIZJ).entrySet()) {
            if (((IIconSlot.SlotViewModel) entry.getValue()).LLJZIJLIL != null && ((IIconSlot.SlotViewModel) entry.getValue()).LLJZIJLIL.intValue() != 0) {
                priorityBlockingQueue.add(new C1123980fM4((InterfaceC1124060fMC) entry.getKey(), C756800TmQ.LIZJ(this.LLIZLLLIL, ((InterfaceC1124060fMC) entry.getKey()).LIZ())));
            }
        }
        boolean z = false;
        if (priorityBlockingQueue.size() > 0) {
            InterfaceC1124060fMC<IIconSlot, IIconSlot.SlotViewModel, EnumC756810TmR> interfaceC1124060fMC = ((C1123980fM4) priorityBlockingQueue.peek()).LIZIZ;
            if (this.LLJ != interfaceC1124060fMC) {
                InterfaceC21213717zz interfaceC21213717zz2 = this.LLILZ;
                if (interfaceC21213717zz2 != null) {
                    interfaceC21213717zz2.LJII(interfaceC1124060fMC, (IIconSlot.SlotViewModel) ((HashMap) this.LL.LIZJ).get(interfaceC1124060fMC));
                }
                this.LLJ = interfaceC1124060fMC;
                return;
            }
            return;
        }
        if (slotViewModel2 != slotViewModel) {
            for (Map.Entry entry2 : ((HashMap) this.LL.LIZJ).entrySet()) {
                IIconSlot.SlotViewModel slotViewModel3 = (IIconSlot.SlotViewModel) entry2.getValue();
                if (Boolean.TRUE.equals(slotViewModel3.LLILZ.getValue())) {
                    this.LLJIJIL.put((InterfaceC1124060fMC) entry2.getKey(), slotViewModel3);
                }
            }
            LIZJ();
            slotViewModel.LLJJJIL.observe(this.LLILZ.getLifecycleOwner(), new AObserverS216S0100000_12(this, 102));
            Iterator it2 = ((HashMap) this.LL.LIZJ).entrySet().iterator();
            boolean z2 = false;
            while (it2.hasNext()) {
                IIconSlot.SlotViewModel slotViewModel4 = (IIconSlot.SlotViewModel) ((Map.Entry) it2.next()).getValue();
                if (Boolean.TRUE.equals(slotViewModel4.LLLFFI)) {
                    z = true;
                } else {
                    z2 = true;
                }
                slotViewModel4.LLJJJIL.observe(this.LLILZ.getLifecycleOwner(), new AObserverS216S0100000_12(this, 102));
                if (z && z2) {
                    break;
                }
            }
            DataChannelGlobal.LLILZ.CQ2(ECPreviewIndependentHasProduct.class, this, new AObjectS355S0100000_12(this, 58));
        }
        C622680Oba.LIZJ(this);
    }

    @Override // X.InterfaceC1124060fMC
    public final void prepareToShow(Map<String, Object> map, InterfaceC756140TlM interfaceC756140TlM) {
        this.LLJI.LIZ = (String) map.get("param_live_enter_from_merge");
        try {
            this.LLJJ = ((Integer) map.get("param_live_revision_lib")).intValue();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        this.LLJI.LIZIZ = (String) map.get("param_live_enter_method_merge");
        this.LLJI.LIZJ = (Room) map.get("param_room");
        interfaceC756140TlM.LIZ(true);
    }
}
