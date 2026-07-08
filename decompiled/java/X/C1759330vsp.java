package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS605S0100000_26;
import njp.a;

/* JADX INFO: renamed from: X.0vsp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.jsb.impl.EcPdpShowBottomBarIDL$handle$1", f = "EcPdpShowBottomBarIDL.kt", l = {LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT}, m = "invokeSuspend")
public final class C1759330vsp extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC1759360vss LLILLJJLI;
    public final /* synthetic */ Object LLILLL;
    public final /* synthetic */ C1759340vsq LLILZ;
    public final /* synthetic */ C1759590vtF LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1759330vsp(InterfaceC1759360vss interfaceC1759360vss, Object obj, C1759340vsq c1759340vsq, C1759590vtF c1759590vtF, InterfaceC1364105Vn<? super C1759330vsp> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC1759360vss;
        this.LLILLL = obj;
        this.LLILZ = c1759340vsq;
        this.LLILZIL = c1759590vtF;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1759330vsp(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Long l;
        C1C7U.LIZ("EcPdpShowBottomBarIDL@9d00.handle$1");
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
            Number delayMs = this.LLILLJJLI.getDelayMs();
            if ((delayMs instanceof Long) && (l = (Long) delayMs) != null) {
                l.longValue();
                long jLongValue = l.longValue();
                this.LL = 1;
                if (AnonymousClass0958.LIZIZ(jLongValue, this) == objLJFF) {
                    C1C7U.LIZIZ("EcPdpShowBottomBarIDL@9d00.handle$1");
                    return objLJFF;
                }
            }
        }
        Object obj2 = this.LLILLL;
        if (obj2 instanceof PdpViewModel) {
            C1759340vsq c1759340vsq = this.LLILZ;
            C1759590vtF c1759590vtF = this.LLILZIL;
            c1759340vsq.getClass();
            ((JediViewModel) obj2).setState(new AwS605S0100000_26(c1759590vtF, 19));
        } else if (obj2 instanceof SeaPdpViewModel) {
            C1759340vsq c1759340vsq2 = this.LLILZ;
            C1759590vtF c1759590vtF2 = this.LLILZIL;
            c1759340vsq2.getClass();
            ((JediViewModel) obj2).setState(new AwS605S0100000_26(c1759590vtF2, 20));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EcPdpShowBottomBarIDL@9d00.handle$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
