package X;

import android.content.Context;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0lQg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.share.core.ui.SkeletonShareManager$initShareChannelListener$channelListener$1$onChannelRealClicked$1$preShareJob$1", f = "SkeletonShareManager.kt", l = {195}, m = "invokeSuspend")
public final class C1357480lQg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1371590lnR LLILLJJLI;
    public final /* synthetic */ InterfaceC1369790lkX LLILLL;
    public final /* synthetic */ Context LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1357480lQg(C1371590lnR c1371590lnR, InterfaceC1369790lkX interfaceC1369790lkX, Context context, InterfaceC1364105Vn<? super C1357480lQg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1371590lnR;
        this.LLILLL = interfaceC1369790lkX;
        this.LLILZ = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1357480lQg(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Unit unit;
        C1C7U.LIZ("SkeletonShareManager@3a5b.initShareChannelListener$channelListener$1$onChannelRealClicked$1$preShareJob$1");
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
            C1371590lnR c1371590lnR = this.LLILLJJLI;
            InterfaceC1366490lfD interfaceC1366490lfD = c1371590lnR.LJJIFFI;
            if (interfaceC1366490lfD != null) {
                InterfaceC1369790lkX interfaceC1369790lkX = this.LLILLL;
                BaseSharePackage baseSharePackage = c1371590lnR.LJIJJ;
                Context context = this.LLILZ;
                this.LL = 1;
                if (interfaceC1366490lfD.LJII(context, baseSharePackage, interfaceC1369790lkX, this) == objLJFF) {
                    C1C7U.LIZIZ("SkeletonShareManager@3a5b.initShareChannelListener$channelListener$1$onChannelRealClicked$1$preShareJob$1");
                    return objLJFF;
                }
            } else {
                unit = null;
                C1C7U.LIZIZ("SkeletonShareManager@3a5b.initShareChannelListener$channelListener$1$onChannelRealClicked$1$preShareJob$1");
                return unit;
            }
        }
        unit = Unit.LIZ;
        C1C7U.LIZIZ("SkeletonShareManager@3a5b.initShareChannelListener$channelListener$1$onChannelRealClicked$1$preShareJob$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
