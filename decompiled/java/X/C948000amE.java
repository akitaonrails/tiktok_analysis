package X;

import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.LayoutMarketFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.previewlive.MultiGuestPreviewLiveSettingViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.previewlive.MultiGuestPreviewLiveSettingViewModel$openLayoutMarketPanel$1$multiGuestLayoutMarketItemClickListener$2$1;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS559S0100000_15;
import njp.a;

/* JADX INFO: renamed from: X.0amE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
@C09DV(c = "com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.previewlive.MultiGuestPreviewLiveSettingViewModel$openLayoutMarketPanel$1", f = "MultiGuestPreviewLiveSettingViewModel.kt", l = {108}, m = "invokeSuspend")
public final class C948000amE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ MultiGuestPreviewLiveSettingViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C948000amE(MultiGuestPreviewLiveSettingViewModel multiGuestPreviewLiveSettingViewModel, InterfaceC1364105Vn<? super C948000amE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = multiGuestPreviewLiveSettingViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C948000amE(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        FragmentManager fragmentManager;
        String str;
        Integer num;
        String str2;
        C1C7U.LIZ("MultiGuestPreviewLiveSettingViewModel@4186.openLayoutMarketPanel$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        int iIntValue = 1;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            MultiGuestPreviewLiveSettingViewModel multiGuestPreviewLiveSettingViewModel = this.LLILLJJLI;
            multiGuestPreviewLiveSettingViewModel.LLILLL = "open_layout_market_fragment";
            C2252331DDr c2252331DDr = multiGuestPreviewLiveSettingViewModel.LLILZLL;
            C948220ama c948220ama = C948220ama.LIZ;
            this.LL = 1;
            if (c2252331DDr.emit(c948220ama, this) == objLJFF) {
                C1C7U.LIZIZ("MultiGuestPreviewLiveSettingViewModel@4186.openLayoutMarketPanel$1");
                return objLJFF;
            }
        }
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS559S0100000_15(this.LLILLJJLI, 211));
        DataChannel dataChannel = this.LLILLJJLI.LLILLJJLI;
        if (dataChannel != null && (fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class)) != null) {
            final MultiGuestPreviewLiveSettingViewModel multiGuestPreviewLiveSettingViewModel2 = this.LLILLJJLI;
            String str3 = LayoutMarketFragment._pnsPageId;
            C942220acu.LIZ(fragmentManager, (MultiGuestPreviewLiveSettingViewModel$openLayoutMarketPanel$1$multiGuestLayoutMarketItemClickListener$2$1) c01gwLIZIZ.getValue(), multiGuestPreviewLiveSettingViewModel2.LL, new InterfaceC930220aJY() { // from class: X.0amF
                @Override // X.InterfaceC930220aJY
                public final void LIZLLL(int i2) {
                }

                @Override // X.InterfaceC930220aJY
                public final void LJ(int i2, int i3) {
                }

                @Override // X.InterfaceC930220aJY
                public final Integer LJFF() {
                    return null;
                }

                @Override // X.InterfaceC930220aJY
                public final void LJI() {
                }

                @Override // X.InterfaceC930220aJY
                public final void LJIIIIZZ() {
                }

                @Override // X.InterfaceC930220aJY
                public final void LJIIIZ(int i2) {
                }

                @Override // X.InterfaceC930220aJY
                public final int getPanelLayoutType() {
                    return 1;
                }

                @Override // X.InterfaceC930220aJY
                public final int LIZJ() {
                    return ((C948130amR) multiGuestPreviewLiveSettingViewModel2.LLILZ.getValue()).LIZ.LIZLLL + 1;
                }

                @Override // X.InterfaceC930220aJY
                public final int LJII(int i2) {
                    return multiGuestPreviewLiveSettingViewModel2.LLIZLLLIL.LIZ(i2).maxPosition;
                }
            }, null, null, 48);
            C948100amO c948100amOLIZ = C0H79.LIZ();
            String str4 = "";
            if (c948100amOLIZ == null || (str = c948100amOLIZ.LIZLLL) == null) {
                str = "";
            }
            C948100amO c948100amOLIZ2 = C0H79.LIZ();
            if (c948100amOLIZ2 != null && (str2 = c948100amOLIZ2.LJ) != null) {
                str4 = str2;
            }
            C948100amO c948100amOLIZ3 = C0H79.LIZ();
            if (c948100amOLIZ3 != null && (num = c948100amOLIZ3.LIZIZ) != null) {
                iIntValue = num.intValue();
            }
            String strValueOf = String.valueOf(iIntValue);
            List listLJII = C942210act.LIZ.LJII(null, false);
            ArrayList arrayList = new ArrayList();
            Iterator it2 = listLJII.iterator();
            while (it2.hasNext()) {
                String strValueOf2 = String.valueOf(((C948400ams) it2.next()).LIZIZ);
                if (strValueOf2 != null) {
                    arrayList.add(strValueOf2);
                }
            }
            C931740aM0.LJIIJJI(new C931750aM1("show_all", str, str4, strValueOf, null, arrayList, "origin_panel", multiGuestPreviewLiveSettingViewModel2.LL, 240));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MultiGuestPreviewLiveSettingViewModel@4186.openLayoutMarketPanel$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
