package X;

import com.ss.android.ugc.aweme.music.v2.assem.MusicDraftAssem;
import com.ss.android.ugc.aweme.services.external.IAVDraftService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0mnm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.music.v2.assem.MusicDraftAssem$initData$1$1$1$countDeferred$1", f = "MusicDraftAssem.kt", l = {282, 288}, m = "invokeSuspend")
public final class C1410240mnm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ MusicDraftAssem LLILLJJLI;
    public final /* synthetic */ C0M4M LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1410240mnm(MusicDraftAssem musicDraftAssem, C0M4M c0m4m, InterfaceC1364105Vn<? super C1410240mnm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = musicDraftAssem;
        this.LLILLL = c0m4m;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1410240mnm(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int iQueryDraftCount;
        C1C7U.LIZ("MusicDraftAssem@abb.initData$1$1$1$countDeferred$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            IAVDraftService iAVDraftService = (IAVDraftService) this.LLILLJJLI.LLJJIJIL.getValue();
            if (iAVDraftService != null) {
                iQueryDraftCount = iAVDraftService.queryDraftCount(this.LLILLL);
            } else {
                iQueryDraftCount = 0;
            }
            if (iQueryDraftCount > 0) {
                C1DFH c1dfh = C0PEM.LIZ;
                AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
                C1415870mwr c1415870mwr = new C1415870mwr(this.LLILLJJLI, iQueryDraftCount, null);
                this.LL = 1;
                if (C23250099c.LJI(this, abstractC2238408pq, c1415870mwr) == objLJFF) {
                    C1C7U.LIZIZ("MusicDraftAssem@abb.initData$1$1$1$countDeferred$1");
                    return objLJFF;
                }
            } else {
                C1DFH c1dfh2 = C0PEM.LIZ;
                AbstractC2238408pq abstractC2238408pq2 = C2107308Nj.LIZ;
                C1410260mno c1410260mno = new C1410260mno(this.LLILLJJLI, null);
                this.LL = 2;
                if (C23250099c.LJI(this, abstractC2238408pq2, c1410260mno) == objLJFF) {
                    C1C7U.LIZIZ("MusicDraftAssem@abb.initData$1$1$1$countDeferred$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MusicDraftAssem@abb.initData$1$1$1$countDeferred$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
