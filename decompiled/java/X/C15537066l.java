package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.service.IMusicService;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.066l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.compliance.protection.amberalert.v2.manager.AmberAlertMusicManager$initMusic$1", f = "AmberAlertMusicManager.kt", l = {104}, m = "invokeSuspend")
public final class C15537066l extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ C15542066q LLILZ;
    public final /* synthetic */ float LLILZIL;
    public final /* synthetic */ Function1<MusicModel, Unit> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C15537066l(String str, C15542066q c15542066q, float f, Function1<? super MusicModel, Unit> function1, InterfaceC1364105Vn<? super C15537066l> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = str;
        this.LLILZ = c15542066q;
        this.LLILZIL = f;
        this.LLILZLL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C15537066l c15537066l = new C15537066l(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c15537066l.LLILLJJLI = obj;
        return c15537066l;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        Music musicLJII;
        MusicModel musicModelConvertToMusicModel;
        C1C7U.LIZ("AmberAlertMusicManager@7d2b.initMusic$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            String str = this.LLILLL;
            C15542066q c15542066q = this.LLILZ;
            float f = this.LLILZIL;
            Function1<MusicModel, Unit> function1 = this.LLILZLL;
            IMusicService iMusicService = (IMusicService) PluggableExtentionKt.pluggableSpi$default(IMusicService.class, false, false, false, 14, null);
            c098200Yq = null;
            if (iMusicService != null) {
                musicLJII = iMusicService.LJII(str);
            } else {
                musicLJII = null;
            }
            if (musicLJII != null) {
                musicModelConvertToMusicModel = musicLJII.convertToMusicModel();
            } else {
                musicModelConvertToMusicModel = null;
            }
            if (musicModelConvertToMusicModel != null) {
                C1485060okS c1485060okS = new C1485060okS();
                c1485060okS.LJI = true;
                c1485060okS.LIZIZ = musicModelConvertToMusicModel.getUrl().getUrlList();
                c1485060okS.LJIIL = f;
                c1485060okS.LJIIIZ = 0;
                c1485060okS.LJII = 0;
                c1485060okS.LJIIIIZZ = musicModelConvertToMusicModel.getDuration();
                c1485060okS.LIZJ = 4;
                c15542066q.LIZLLL = c1485060okS;
                C1DFH c1dfh = C0PEM.LIZ;
                AbstractC2238408pq abstractC2238408pqLLIILII = C2107308Nj.LIZ.LLIILII();
                C1523805xs c1523805xs = new C1523805xs(function1, musicModelConvertToMusicModel, null);
                this.LL = 1;
                if (C23250099c.LJI(this, abstractC2238408pqLLIILII, c1523805xs) == objLJFF) {
                    C1C7U.LIZIZ("AmberAlertMusicManager@7d2b.initMusic$1");
                    return objLJFF;
                }
            }
            C189200o6.m2constructorimpl(c098200Yq);
            C189200o6.m5exceptionOrNullimpl(c098200Yq);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("AmberAlertMusicManager@7d2b.initMusic$1");
            return unit;
        }
        c098200Yq = Unit.LIZ;
        C189200o6.m2constructorimpl(c098200Yq);
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("AmberAlertMusicManager@7d2b.initMusic$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
