package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight.viewmodel.LiveHighlightViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import tikcast.api.anchor.RevertLiveFragmentResponse;

/* JADX INFO: renamed from: X.0Cmk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight.viewmodel.LiveHighlightViewModel$revertTargetVideo$1", f = "LiveHighlightViewModel.kt", l = {710}, m = "invokeSuspend")
public final class C323840Cmk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ LiveHighlightViewModel LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ boolean LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C323840Cmk(LiveHighlightViewModel liveHighlightViewModel, long j, int i, int i2, boolean z, InterfaceC1364105Vn<? super C323840Cmk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = liveHighlightViewModel;
        this.LLILLL = j;
        this.LLILZ = i;
        this.LLILZIL = i2;
        this.LLILZLL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C323840Cmk(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int i;
        boolean z;
        C1C7U.LIZ("LiveHighlightViewModel@9d4.revertTargetVideo$1");
        Object objLJFF = C099R.LJFF();
        int i2 = this.LL;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                C323990Cmz c323990Cmz = this.LLILLJJLI.LL.LLILLJJLI;
                String strValueOf = String.valueOf(this.LLILLL);
                int i3 = this.LLILZ;
                this.LL = 1;
                obj = c323990Cmz.LL.LIZ().revertLiveFragmentInfo(strValueOf, i3, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("LiveHighlightViewModel@9d4.revertTargetVideo$1");
                    return objLJFF;
                }
            }
            RevertLiveFragmentResponse.ResponseData responseData = (RevertLiveFragmentResponse.ResponseData) ((C470590Icr) obj).data;
            if (responseData != null) {
                LiveHighlightViewModel liveHighlightViewModel = this.LLILLJJLI;
                long j = this.LLILLL;
                int i4 = this.LLILZ;
                int i5 = this.LLILZIL;
                boolean z2 = this.LLILZLL;
                if (i4 == 1) {
                    i5 = responseData.revertStatus;
                }
                if (z2) {
                    z = true;
                } else {
                    z = false;
                }
                LiveHighlightViewModel.EQ2(liveHighlightViewModel, j, i5, z, null, true, 8);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            LiveHighlightViewModel liveHighlightViewModel2 = this.LLILLJJLI;
            long j2 = this.LLILLL;
            if (this.LLILZ == 1) {
                i = 3;
            } else {
                i = this.LLILZIL;
            }
            LiveHighlightViewModel.EQ2(liveHighlightViewModel2, j2, i, this.LLILZLL, null, null, 24);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveHighlightViewModel@9d4.revertTargetVideo$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
