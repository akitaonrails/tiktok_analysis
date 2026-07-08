package X;

import com.ss.android.ugc.aweme.socialavatar.mixstudio.framework.MixStudioBaseViewModel;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HPb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.mixstudio.framework.MixStudioBaseViewModel$startObservingTaskStatus$1$2", f = "MixStudioBaseViewModel.kt", l = {}, m = "invokeSuspend")
public final class C440490HPb extends C09AX implements Function2<Pair<? extends AbstractC440540HPg, ? extends List<? extends C440830HQj>>, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C013C LLILLJJLI;
    public final /* synthetic */ MixStudioBaseViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C440490HPb(C013C c013c, MixStudioBaseViewModel mixStudioBaseViewModel, InterfaceC1364105Vn<? super C440490HPb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c013c;
        this.LLILLL = mixStudioBaseViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C440490HPb c440490HPb = new C440490HPb(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        c440490HPb.LL = obj;
        return c440490HPb;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0079  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.String r3 = "MixStudioBaseViewModel@9c39.startObservingTaskStatus$1$2"
            X.C1C7U.LIZ(r3)
            X.C099R.LJFF()
            X.C155000ia.LIZIZ(r5)
            java.lang.Object r0 = r4.LL
            kotlin.Pair r0 = (kotlin.Pair) r0
            java.lang.Object r2 = r0.getFirst()
            java.lang.Object r1 = r0.getSecond()
            java.util.List r1 = (java.util.List) r1
            X.013C r0 = r4.LLILLJJLI
            boolean r0 = r0.element
            if (r0 != 0) goto L29
            boolean r0 = r2 instanceof X.C440600HPm
            if (r0 == 0) goto L29
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r3)
            return r0
        L29:
            int r1 = r1.size()
            boolean r0 = r2 instanceof X.C441130HRn
            if (r0 != 0) goto L79
            boolean r0 = r2 instanceof X.C441120HRm
            if (r0 == 0) goto L49
            if (r1 > 0) goto L79
            com.ss.android.ugc.aweme.socialavatar.mixstudio.framework.MixStudioBaseViewModel r1 = r4.LLILLL
            X.0HQp r0 = X.EnumC440890HQp.GENERATING
            r1.xQ2(r0)
        L3e:
            X.013C r1 = r4.LLILLJJLI
            r0 = 0
            r1.element = r0
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r3)
            return r0
        L49:
            X.0HPk r0 = X.C440580HPk.LIZ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r0)
            if (r0 == 0) goto L59
            com.ss.android.ugc.aweme.socialavatar.mixstudio.framework.MixStudioBaseViewModel r1 = r4.LLILLL
            X.0HQp r0 = X.EnumC440890HQp.HOME_ERROR
            r1.xQ2(r0)
            goto L3e
        L59:
            X.0HPh r0 = X.C440550HPh.LIZ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r0)
            if (r0 != 0) goto L71
            X.0HPe r0 = X.C440520HPe.LIZ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r0)
            if (r0 != 0) goto L71
            com.ss.android.ugc.aweme.socialavatar.mixstudio.framework.MixStudioBaseViewModel r1 = r4.LLILLL
            X.0HQp r0 = X.EnumC440890HQp.HOME
            r1.xQ2(r0)
            goto L3e
        L71:
            com.ss.android.ugc.aweme.socialavatar.mixstudio.framework.MixStudioBaseViewModel r1 = r4.LLILLL
            X.0HQp r0 = X.EnumC440890HQp.GENERATING_ERROR
            r1.xQ2(r0)
            goto L3e
        L79:
            com.ss.android.ugc.aweme.socialavatar.mixstudio.framework.MixStudioBaseViewModel r1 = r4.LLILLL
            X.0HQp r0 = X.EnumC440890HQp.RESULTS
            r1.xQ2(r0)
            goto L3e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C440490HPb.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Pair<? extends AbstractC440540HPg, ? extends List<? extends C440830HQj>> pair, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(pair, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
