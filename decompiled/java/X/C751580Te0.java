package X;

import com.ss.android.ugc.aweme.api.IAnchorBusinessApi;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Te0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.assem.capcut.CapCutAnchorView$startPreloadVideoTask$2", f = "CapCutAnchorView.kt", l = {126}, m = "invokeSuspend")
public final class C751580Te0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ C1393840mNK LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C751580Te0(long j, C1393840mNK c1393840mNK, int i, InterfaceC1364105Vn<? super C751580Te0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = j;
        this.LLILLL = c1393840mNK;
        this.LLILZ = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C751580Te0(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        List<AnchorCommonStruct> anchors;
        Aweme awemeLJJLIIIJJIZ;
        C1C7U.LIZ("CapCutAnchorView@a85c.startPreloadVideoTask$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            long j = this.LLILLJJLI;
            if (j > 0) {
                this.LL = 1;
                if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                    C1C7U.LIZIZ("CapCutAnchorView@a85c.startPreloadVideoTask$2");
                    return objLJFF;
                }
            }
        }
        IAnchorBusinessApi anchorBusinessApi = this.LLILLL.getAnchorBusinessApi();
        int i2 = this.LLILZ;
        InterfaceC1392640mLO interfaceC1392640mLO = this.LLILLL.LLJI;
        if (interfaceC1392640mLO != null && (awemeLJJLIIIJJIZ = interfaceC1392640mLO.LJJLIIIJJIZ()) != null) {
            anchors = awemeLJJLIIIJJIZ.getAnchors();
        } else {
            anchors = null;
        }
        anchorBusinessApi.LJIIIZ(i2, anchors);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CapCutAnchorView@a85c.startPreloadVideoTask$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
