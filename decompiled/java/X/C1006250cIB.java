package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.minis.feed.instantplay.model.GameCardMaterial;
import com.ss.android.ugc.aweme.minis.feed.instantplay.vm.MiniGameInstantPlayViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS130S1100000_16;
import njp.a;

/* JADX INFO: renamed from: X.0cIB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.minis.feed.instantplay.vm.MiniGameInstantPlayViewModel$bindData$2", f = "MiniGameInstantPlayViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1006250cIB extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ VideoItemParams LLILLJJLI;
    public final /* synthetic */ MiniGameInstantPlayViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1006250cIB(String str, VideoItemParams videoItemParams, MiniGameInstantPlayViewModel miniGameInstantPlayViewModel, InterfaceC1364105Vn<? super C1006250cIB> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = videoItemParams;
        this.LLILLL = miniGameInstantPlayViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1006250cIB(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MiniGameInstantPlayViewModel@32a3.bindData$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            GameCardMaterial gameCardMaterial = (GameCardMaterial) C309390CAv.LIZ(this.LL, GameCardMaterial.class);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("bindData parse ok aid=");
            sbLIZ.append(this.LLILLJJLI.getAweme().getAid());
            C2188811AlT.LIZIZ(sbLIZ);
            C1007120cJa.LIZ();
            this.LLILLL.setState(new AwS130S1100000_16(gameCardMaterial, this.LL, 21));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("bindData parse fail aid=");
            sbLIZ2.append(this.LLILLJJLI.getAweme().getAid());
            sbLIZ2.append(" err=");
            sbLIZ2.append(e.getMessage());
            C2188811AlT.LIZIZ(sbLIZ2);
            C1007120cJa.LIZ();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MiniGameInstantPlayViewModel@32a3.bindData$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
