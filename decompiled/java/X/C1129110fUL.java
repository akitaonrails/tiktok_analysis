package X;

import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.livesdk.gift.base.platform.business.giftbasic.presentation.viewmodel.GiftPanelCoordinatorViewModel;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftPanelFetchListWhenCloseSetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS254S0000000_17;
import kotlin.jvm.internal.AwS596S0100000_17;
import njp.a;

/* JADX INFO: renamed from: X.0fUL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.gift.base.platform.business.giftbasic.presentation.viewmodel.GiftPanelCoordinatorViewModel$requestOpenPanel$1", f = "GiftPanelCoordinatorViewModel.kt", l = {203}, m = "invokeSuspend")
public final class C1129110fUL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ GiftPanelCoordinatorViewModel LLILLL;
    public final /* synthetic */ C1129080fUI LLILZ;
    public final /* synthetic */ long LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1129110fUL(GiftPanelCoordinatorViewModel giftPanelCoordinatorViewModel, C1129080fUI c1129080fUI, long j, InterfaceC1364105Vn<? super C1129110fUL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = giftPanelCoordinatorViewModel;
        this.LLILZ = c1129080fUI;
        this.LLILZIL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1129110fUL c1129110fUL = new C1129110fUL(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c1129110fUL.LLILLJJLI = obj;
        return c1129110fUL;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC497601wk interfaceC497601wk;
        C1C7U.LIZ("GiftPanelCoordinatorViewModel@b358.requestOpenPanel$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i == 1) {
                    interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
                this.LLILLL.zQ2(AFwS254S0000000_17.get$arr$(268));
                C1128850fTv c1128850fTv = (C1128850fTv) ((C1130060fVs) this.LLILLL.LLILZ.getValue()).LJII.getValue();
                C1129080fUI c1129080fUI = this.LLILZ;
                EnumC1129670fVF enumC1129670fVF = EnumC1129670fVF.CACHE_FIRST;
                this.LLILLJJLI = interfaceC497601wk;
                this.LL = 1;
                obj = c1128850fTv.LIZIZ(c1129080fUI, enumC1129670fVF, null, null, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("GiftPanelCoordinatorViewModel@b358.requestOpenPanel$1");
                    return objLJFF;
                }
            }
            AbstractC991550buT abstractC991550buT = (AbstractC991550buT) obj;
            C23118094a.LJI(interfaceC497601wk.getCoroutineContext());
            if (!this.LLILLL.xQ2(this.LLILZIL, "open")) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("GiftPanelCoordinatorViewModel@b358.requestOpenPanel$1");
                return unit;
            }
            if (abstractC991550buT instanceof C1129140fUO) {
                this.LLILLL.vQ2((C1129140fUO) abstractC991550buT, EnumC1129600fV8.OPEN);
                if (((C1129140fUO) abstractC991550buT).LIZLLL && !LiveGiftPanelFetchListWhenCloseSetting.INSTANCE.getValue()) {
                    GiftPanelCoordinatorViewModel giftPanelCoordinatorViewModel = this.LLILLL;
                    C1129080fUI c1129080fUI2 = this.LLILZ;
                    AnonymousClass0956 anonymousClass0956 = giftPanelCoordinatorViewModel.LLIZ;
                    if (anonymousClass0956 != null) {
                        anonymousClass0956.LIZIZ(null);
                    }
                    giftPanelCoordinatorViewModel.LLIZ = C23250099c.LIZLLL(ViewModelKt.getViewModelScope(giftPanelCoordinatorViewModel), giftPanelCoordinatorViewModel.LLJI, null, new C1118460fDA(c1129080fUI2, null), 2);
                }
            } else if (abstractC991550buT instanceof C991540buS) {
                this.LLILLL.zQ2(new AwS596S0100000_17(abstractC991550buT, 640));
            } else {
                throw new C1954807lC();
            }
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("GiftPanelCoordinatorViewModel@b358.requestOpenPanel$1");
            return unit2;
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[Coordinator] requestOpenPanel cancelled - roomId=");
            sbLIZ.append(this.LLILZ.LIZ);
            C20441214yg.LJFF("GiftPanel.Coord", C2188811AlT.LIZIZ(sbLIZ), e);
            Unit unit3 = Unit.LIZ;
            C1C7U.LIZIZ("GiftPanelCoordinatorViewModel@b358.requestOpenPanel$1");
            return unit3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
