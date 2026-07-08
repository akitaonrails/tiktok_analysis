package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.music.vm.OriginMusicListViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Nd5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.music.vm.OriginMusicListViewModel$undoRemoveFanSpotlightAt$1$3", f = "OriginMusicListViewModel.kt", l = {693, 693}, m = "invokeSuspend")
public final class C598130Nd5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ OriginMusicListViewModel LLILLJJLI;
    public final /* synthetic */ List<Aweme> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C598130Nd5(OriginMusicListViewModel originMusicListViewModel, List<Aweme> list, InterfaceC1364105Vn<? super C598130Nd5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = originMusicListViewModel;
        this.LLILLL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C598130Nd5(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001a  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.String r7 = "OriginMusicListViewModel@f6d8.undoRemoveFanSpotlightAt$1$3"
            X.C1C7U.LIZ(r7)
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r8.LL
            r5 = 2
            r4 = 1
            if (r0 == 0) goto L22
            if (r0 == r4) goto L6a
            if (r0 != r5) goto L7f
            X.C155000ia.LIZIZ(r9)
        L16:
            boolean r0 = r9 instanceof X.C0O79
            if (r0 != 0) goto L1c
            boolean r0 = r9 instanceof X.C0O77
        L1c:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r7)
            return r0
        L22:
            X.C155000ia.LIZIZ(r9)
            com.ss.android.ugc.aweme.music.vm.OriginMusicListViewModel r0 = r8.LLILLJJLI
            X.01GW r0 = r0.LLILZLL
            java.lang.Object r0 = r0.getValue()
            X.0SvR r0 = (X.InterfaceC736910SvR) r0
            if (r0 == 0) goto L7d
            X.00hg r3 = r0.getOperator()
            X.0Nd6 r3 = (X.InterfaceC598140Nd6) r3
            if (r3 == 0) goto L7d
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r1 = r8.LLILLL
            java.util.ArrayList r2 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r1, r0)
            r2.<init>(r0)
            java.util.Iterator r1 = r1.iterator()
        L4a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L5e
            java.lang.Object r0 = r1.next()
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = (com.ss.android.ugc.aweme.feed.model.Aweme) r0
            java.lang.String r0 = r0.getAid()
            r2.add(r0)
            goto L4a
        L5e:
            r8.LL = r4
            X.01Wa r9 = r3.LLJJL(r4, r2)
            if (r9 != r6) goto L6d
            X.C1C7U.LIZIZ(r7)
            return r6
        L6a:
            X.C155000ia.LIZIZ(r9)
        L6d:
            X.01Wa r9 = (X.InterfaceC346201Wa) r9
            if (r9 == 0) goto L7d
            r8.LL = r5
            java.lang.Object r9 = X.C09IC.LJJIJ(r9, r8)
            if (r9 != r6) goto L16
            X.C1C7U.LIZIZ(r7)
            return r6
        L7d:
            r9 = 0
            goto L16
        L7f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C598130Nd5.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
