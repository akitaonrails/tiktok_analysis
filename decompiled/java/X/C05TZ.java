package X;

import com.ss.android.ugc.aweme.exp.DMInboxChangeRightZoneClickableSizeExp;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05TZ, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.music.assem.list.compose.FanSpotlightBlockContentKt$FanSpotlightBlockContent$2$1$1", f = "FanSpotlightBlockContent.kt", l = {71, DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE}, m = "invokeSuspend")
public final class C05TZ extends C09AX implements Function2<Unit, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1690080u58 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05TZ(C1690080u58 c1690080u58, InterfaceC1364105Vn<? super C05TZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1690080u58;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05TZ(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FanSpotlightBlockContentKt@432.FanSpotlightBlockContent$2$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("FanSpotlightBlockContentKt@432.FanSpotlightBlockContent$2$1$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(100L, this) == objLJFF) {
                C1C7U.LIZIZ("FanSpotlightBlockContentKt@432.FanSpotlightBlockContent$2$1$1");
                return objLJFF;
            }
        }
        C1690080u58 c1690080u58 = this.LLILLJJLI;
        this.LL = 2;
        if (c1690080u58.LJFF(0, 0, this) == objLJFF) {
            C1C7U.LIZIZ("FanSpotlightBlockContentKt@432.FanSpotlightBlockContent$2$1$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("FanSpotlightBlockContentKt@432.FanSpotlightBlockContent$2$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(unit, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
