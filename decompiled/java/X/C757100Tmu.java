package X;

import Y.ALAdapterS0S0000000_12;
import android.animation.Animator;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.livesdk.model.message.PaidContentLiveShoppingMessage;
import com.bytedance.android.livesdkapi.depend.model.live.PaidContentInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.paidseries.consumer.fragment.PaidSeriesShopPanelFragment;
import com.ss.android.ugc.aweme.paidseries.consumer.model.PaidContentInitData;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.0Tmu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C757100Tmu extends AbstractC21213317zv<IIconSlot, IIconSlot.SlotViewModel, EnumC756810TmR> {
    public InterfaceC21213717zz LLILZIL;
    public IIconSlot.SlotViewModel LLILZLL;
    public Room LLIZ;
    public TuxSheet LLIZLLLIL;
    public PaidSeriesShopPanelFragment LLJ;

    @Override // X.InterfaceC1124060fMC
    public final String LIZ() {
        return "live_paid_series";
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final String LLILZIL() {
        return "AudienceLeftSeries";
    }

    @Override // X.AbstractC21213317zv
    public final TuxIconDrawable LJJ() {
        Context context;
        InterfaceC21213717zz interfaceC21213717zz = this.LLILLJJLI;
        if (interfaceC21213717zz == null || (context = interfaceC21213717zz.getContext()) == null) {
            return null;
        }
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_color_series_fill;
        return c419910GdJ.LIZ(context);
    }

    @Override // X.AbstractC21213317zv
    public final TuxIconDrawable LJJIFFI() {
        Context context;
        InterfaceC21213717zz interfaceC21213717zz = this.LLILLJJLI;
        if (interfaceC21213717zz == null || (context = interfaceC21213717zz.getContext()) == null) {
            return null;
        }
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_series_fill;
        c419910GdJ.LIZLLL = C1308910kAL.LIZJ(R.attr.exs, context);
        return c419910GdJ.LIZ(context);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0Tmv] */
    @Override // X.InterfaceC1124060fMC
    public final Object LLILZLL() {
        final ?? r0 = new AbstractC757140Tmy() { // from class: X.0Tmv
            @Override // X.AbstractC757140Tmy
            public final void LIZIZ() {
                Context context;
                C19EG c19egLIZIZ;
                C757100Tmu c757100Tmu = this.LJ;
                c757100Tmu.getClass();
                C757130Tmx c757130Tmx = PaidSeriesShopPanelFragment.LLJI;
                Room room = c757100Tmu.LLIZ;
                long id = room != null ? room.getId() : 0L;
                c757130Tmx.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("room_id", id);
                PaidSeriesShopPanelFragment paidSeriesShopPanelFragment = new PaidSeriesShopPanelFragment();
                paidSeriesShopPanelFragment.setArguments(bundle);
                c757100Tmu.LLJ = paidSeriesShopPanelFragment;
                InterfaceC21213717zz interfaceC21213717zz = c757100Tmu.LLILZIL;
                if (interfaceC21213717zz == null || (context = interfaceC21213717zz.getContext()) == null || (c19egLIZIZ = C1388190mED.LIZIZ(context)) == null) {
                    return;
                }
                C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
                c1390920mIc.LJIIIIZZ(1);
                int iLIZ = (int) (((double) C497820Jfg.LIZ(c19egLIZIZ)) * 0.73d);
                TuxSheet tuxSheet = c1390920mIc.LIZ;
                tuxSheet.LLJJL = iLIZ;
                tuxSheet.LLJJIJI = paidSeriesShopPanelFragment;
                tuxSheet.LLJLILLLLZIIL = false;
                tuxSheet.LLJJIJIIJIL = true;
                tuxSheet.LLJLL = true;
                tuxSheet.showNow(c19egLIZIZ.getSupportFragmentManager(), null);
                c757100Tmu.LLIZLLLIL = tuxSheet;
            }

            {
                super(300L);
            }
        };
        return new IIconSlot(r0) { // from class: X.0Tmw
            public final InterfaceC752610Tff LIZ;

            @Override // com.bytedance.android.live.slot.IIconSlot
            public final void getScheme() {
            }

            @Override // com.bytedance.android.live.slot.IIconSlot
            public final Animator.AnimatorListener LIZ() {
                return new ALAdapterS0S0000000_12(2);
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
    public final List<Integer> getMessageType() {
        return Collections.singletonList(Integer.valueOf(C001A.PAID_CONTENT_LIVE_SHOPPING_MESSAGE.getIntType()));
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void onDestroy() {
        TuxSheet tuxSheet = this.LLIZLLLIL;
        if (tuxSheet != null) {
            tuxSheet.dismissAllowingStateLoss();
        }
    }

    @Override // X.InterfaceC1124060fMC
    public final Enum LLJ() {
        return EnumC756810TmR.SLOT_LIVE_WATCHER_TOOLBAR;
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void onMessage(IMessage iMessage) {
        MutableLiveData<String> mutableLiveData;
        MutableLiveData<Boolean> mutableLiveData2;
        boolean z;
        PaidSeriesShopPanelFragment paidSeriesShopPanelFragment;
        if (iMessage instanceof PaidContentLiveShoppingMessage) {
            PaidContentLiveShoppingMessage paidContentLiveShoppingMessage = (PaidContentLiveShoppingMessage) iMessage;
            int i = paidContentLiveShoppingMessage.actionType;
            if (i != 0) {
                if (i == 3 && (paidSeriesShopPanelFragment = this.LLJ) != null) {
                    paidSeriesShopPanelFragment.MR().vQ2(paidSeriesShopPanelFragment.getRoomId());
                    return;
                }
                return;
            }
            IIconSlot.SlotViewModel slotViewModel = this.LLILZLL;
            if (slotViewModel != null && (mutableLiveData2 = slotViewModel.LLILZ) != null) {
                if (paidContentLiveShoppingMessage.liveSeriesNumber > 0) {
                    z = true;
                } else {
                    z = false;
                }
                mutableLiveData2.setValue(Boolean.valueOf(z));
            }
            IIconSlot.SlotViewModel slotViewModel2 = this.LLILZLL;
            if (slotViewModel2 != null && (mutableLiveData = slotViewModel2.LLILZLL) != null) {
                mutableLiveData.setValue(String.valueOf(paidContentLiveShoppingMessage.liveSeriesNumber));
            }
            PaidSeriesShopPanelFragment paidSeriesShopPanelFragment2 = this.LLJ;
            if (paidSeriesShopPanelFragment2 == null) {
                return;
            }
            paidSeriesShopPanelFragment2.MR().vQ2(paidSeriesShopPanelFragment2.getRoomId());
        }
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void LLIZ(ViewModel viewModel, InterfaceC21213717zz interfaceC21213717zz) {
        String string;
        Boolean boolValueOf;
        boolean z;
        PaidContentInfo paidContentInfo;
        String str;
        IIconSlot.SlotViewModel slotViewModel = (IIconSlot.SlotViewModel) viewModel;
        this.LL = slotViewModel;
        this.LLILLJJLI = interfaceC21213717zz;
        this.LLILZIL = interfaceC21213717zz;
        this.LLILZLL = slotViewModel;
        Room room = this.LLIZ;
        PaidContentInitData paidContentInitData = null;
        if (room != null && (paidContentInfo = room.paidContentInfo) != null && (str = paidContentInfo.paidContentLiveData) != null) {
            paidContentInitData = (PaidContentInitData) GsonProtectorUtils.fromJson(C7740030o.LIZ().getGson(), str, PaidContentInitData.class);
        }
        slotViewModel.LLILZ.setValue(Boolean.TRUE);
        slotViewModel.LLJ.setValue(LJJI(C800330VaR.LIZIZ(interfaceC21213717zz.getContext(), R.drawable.c2b)));
        slotViewModel.LLJI.setValue(LJJI(C800330VaR.LIZIZ(interfaceC21213717zz.getContext(), R.drawable.c2_)));
        slotViewModel.LLJILJILJ.setValue(interfaceC21213717zz.getContext().getString(2131847359));
        MutableLiveData<String> mutableLiveData = slotViewModel.LLILZLL;
        if (paidContentInitData == null || (string = Integer.valueOf(paidContentInitData.numSeries).toString()) == null) {
            string = "";
        }
        mutableLiveData.setValue(string);
        MutableLiveData<Boolean> mutableLiveData2 = slotViewModel.LLILZ;
        if (mutableLiveData2 != null) {
            if (paidContentInitData != null) {
                if (paidContentInitData.numSeries > 0) {
                    z = true;
                } else {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(Boolean.valueOf(z).booleanValue());
            } else {
                boolValueOf = Boolean.FALSE;
            }
            mutableLiveData2.setValue(boolValueOf);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001d  */
    @Override // X.InterfaceC1124060fMC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void prepareToShow(java.util.Map<java.lang.String, java.lang.Object> r3, X.InterfaceC756140TlM r4) {
        /*
            r2 = this;
            java.lang.String r0 = "param_room"
            java.lang.Object r1 = r3.get(r0)
            boolean r0 = r1 instanceof com.bytedance.android.livesdkapi.depend.model.live.Room
            if (r0 == 0) goto L1f
            com.bytedance.android.livesdkapi.depend.model.live.Room r1 = (com.bytedance.android.livesdkapi.depend.model.live.Room) r1
        Lc:
            r2.LLIZ = r1
            if (r1 == 0) goto L1d
            com.bytedance.android.livesdkapi.depend.model.live.PaidContentInfo r0 = r1.paidContentInfo
            if (r0 == 0) goto L1d
            boolean r1 = r0.paidContentPermission
            r0 = 1
            if (r1 != r0) goto L1d
        L19:
            r4.LIZ(r0)
            return
        L1d:
            r0 = 0
            goto L19
        L1f:
            r1 = 0
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C757100Tmu.prepareToShow(java.util.Map, X.0TlM):void");
    }
}
