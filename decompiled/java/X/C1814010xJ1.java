package X;

import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardsdisplay.intelligent.LiveIntelligentBoardUpsertViewModel;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.LiveBoardsPageDialogFragment;
import com.bytedance.android.livesdk.dataChannel.PreviewBulletinEditVisibilityChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0xJ1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardsdisplay.intelligent.LiveIntelligentBoardUpsertViewModel$upsertReally$3$4$1", f = "IntelligentBoardUpsertViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1814010xJ1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ LiveIntelligentBoardUpsertViewModel LL;
    public final /* synthetic */ C1814370xJb LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ Throwable LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1814010xJ1(LiveIntelligentBoardUpsertViewModel liveIntelligentBoardUpsertViewModel, C1814370xJb c1814370xJb, int i, Throwable th, InterfaceC1364105Vn<? super C1814010xJ1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = liveIntelligentBoardUpsertViewModel;
        this.LLILLJJLI = c1814370xJb;
        this.LLILLL = i;
        this.LLILZ = th;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1814010xJ1(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        DataChannel dataChannel;
        FragmentManager fragmentManager;
        String str;
        DataChannel dataChannel2;
        C1C7U.LIZ("LiveIntelligentBoardUpsertViewModel@22dd.upsertReally$3$4$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.setState(new C1814020xJ2(this.LLILZ));
        this.LL.wQ2(this.LLILLJJLI.LIZ, false, false, this.LLILLL);
        if (this.LLILLL == 3) {
            LiveIntelligentBoardUpsertViewModel liveIntelligentBoardUpsertViewModel = this.LL;
            C291301Ax c291301AxVQ2 = liveIntelligentBoardUpsertViewModel.vQ2();
            if (c291301AxVQ2 != null && (dataChannel = c291301AxVQ2.LLILLJJLI) != null && (fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class)) != null) {
                C0TND c0tnd = LiveBoardsPageDialogFragment.LLJILJILJ;
                C291301Ax c291301AxVQ22 = liveIntelligentBoardUpsertViewModel.vQ2();
                if (c291301AxVQ22 == null || (str = c291301AxVQ22.LL) == null) {
                    str = "live_take_page";
                }
                C291301Ax c291301AxVQ23 = liveIntelligentBoardUpsertViewModel.vQ2();
                if (c291301AxVQ23 != null) {
                    dataChannel2 = c291301AxVQ23.LLILLJJLI;
                } else {
                    dataChannel2 = null;
                }
                C0TND.LIZ(c0tnd, str, null, dataChannel2, null, null, 8).show(fragmentManager, "LiveBoardsPageDialogFragment");
            }
            C770220UJg c770220UJg = C770220UJg.LIZ;
            C770220UJg.LIZLLL(C13LE.LIZ(PreviewBulletinEditVisibilityChannel.class));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveIntelligentBoardUpsertViewModel@22dd.upsertReally$3$4$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
