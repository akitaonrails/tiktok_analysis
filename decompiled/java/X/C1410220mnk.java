package X;

import com.ss.android.ugc.aweme.music.v2.assem.MusicDraftAssem;
import com.ss.android.ugc.aweme.services.external.IAVDraftService;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0mnk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.music.v2.assem.MusicDraftAssem$initData$1$1$1$itemsDeferred$1", f = "MusicDraftAssem.kt", l = {296}, m = "invokeSuspend")
public final class C1410220mnk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ MusicDraftAssem LLILLJJLI;
    public final /* synthetic */ C0M4M LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1410220mnk(MusicDraftAssem musicDraftAssem, C0M4M c0m4m, boolean z, InterfaceC1364105Vn<? super C1410220mnk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = musicDraftAssem;
        this.LLILLL = c0m4m;
        this.LLILZ = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1410220mnk(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        List listQueryDraftsInfoWithLimited$default;
        C1C7U.LIZ("MusicDraftAssem@abb.initData$1$1$1$itemsDeferred$1");
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
            IAVDraftService iAVDraftService = (IAVDraftService) this.LLILLJJLI.LLJJIJIL.getValue();
            if (iAVDraftService != null) {
                listQueryDraftsInfoWithLimited$default = IAVDraftService.DefaultImpls.queryDraftsInfoWithLimited$default(iAVDraftService, this.LLILLL, 0, 2, null);
            } else {
                listQueryDraftsInfoWithLimited$default = null;
            }
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C1415850mwp c1415850mwp = new C1415850mwp(listQueryDraftsInfoWithLimited$default, this.LLILLJJLI, this.LLILZ, null);
            this.LL = 1;
            if (C23250099c.LJI(this, abstractC2238408pq, c1415850mwp) == objLJFF) {
                C1C7U.LIZIZ("MusicDraftAssem@abb.initData$1$1$1$itemsDeferred$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MusicDraftAssem@abb.initData$1$1$1$itemsDeferred$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
