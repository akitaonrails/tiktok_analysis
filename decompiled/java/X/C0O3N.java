package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.mix.api.response.MixVideosResponse;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0O3N, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.mix.repo.PlaylistManageRepo$getPlaylistVideos$1", f = "PlaylistManageRepo.kt", l = {142}, m = "invokeSuspend")
public final class C0O3N extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Function1<Integer, Unit> LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ InterfaceC1631620sYq<List<? extends Aweme>, Boolean, Long, Unit> LLILZ;
    public final /* synthetic */ Function1<Exception, Unit> LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ long LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ String LLJI;
    public final /* synthetic */ boolean LLJIJIL;
    public final /* synthetic */ int LLJILJIL;
    public final /* synthetic */ int LLJILJILJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0O3N(Function1<? super Integer, Unit> function1, int i, InterfaceC1631620sYq<? super List<? extends Aweme>, ? super Boolean, ? super Long, Unit> interfaceC1631620sYq, Function1<? super Exception, Unit> function12, String str, String str2, long j, String str3, String str4, boolean z, int i2, int i3, InterfaceC1364105Vn<? super C0O3N> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = function1;
        this.LLILLL = i;
        this.LLILZ = interfaceC1631620sYq;
        this.LLILZIL = function12;
        this.LLILZLL = str;
        this.LLIZ = str2;
        this.LLIZLLLIL = j;
        this.LLJ = str3;
        this.LLJI = str4;
        this.LLJIJIL = z;
        this.LLJILJIL = i2;
        this.LLJILJILJ = i3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0O3N(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objLJI = obj;
        C1C7U.LIZ("PlaylistManageRepo@fa57.getPlaylistVideos$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLJI);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLJI);
            C1DFB c1dfb = C0PEM.LIZJ;
            C0O3M c0o3m = new C0O3M(this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLILLL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, null);
            this.LL = 1;
            objLJI = C23250099c.LJI(this, c1dfb, c0o3m);
            if (objLJI == objLJFF) {
                C1C7U.LIZIZ("PlaylistManageRepo@fa57.getPlaylistVideos$1");
                return objLJFF;
            }
        }
        C0O7A c0o7a = (C0O7A) objLJI;
        if (c0o7a instanceof C0O79) {
            MixVideosResponse mixVideosResponse = ((C0O3O) ((C0O79) c0o7a).LJ).LIZ;
            Function1<Integer, Unit> function1 = this.LLILLJJLI;
            if (function1 != null) {
                function1.invoke(C2286608xc.LJ(mixVideosResponse.mixLabel));
            }
            List<? extends Aweme> arrayList = mixVideosResponse.mixVideos;
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            if (this.LLILLL == 2) {
                InterfaceC1631620sYq<List<? extends Aweme>, Boolean, Long, Unit> interfaceC1631620sYq = this.LLILZ;
                if (interfaceC1631620sYq != null) {
                    interfaceC1631620sYq.invoke(arrayList, Boolean.valueOf(mixVideosResponse.hasMore), C2286608xc.LJFF(mixVideosResponse.minCursor));
                }
            } else {
                InterfaceC1631620sYq<List<? extends Aweme>, Boolean, Long, Unit> interfaceC1631620sYq2 = this.LLILZ;
                if (interfaceC1631620sYq2 != null) {
                    interfaceC1631620sYq2.invoke(arrayList, Boolean.valueOf(mixVideosResponse.hasMore), C2286608xc.LJFF(mixVideosResponse.maxCursor));
                }
            }
        } else if (c0o7a instanceof C0O78) {
            Function1<Exception, Unit> function12 = this.LLILZIL;
            if (function12 != null) {
                function12.invoke(((C0O78) c0o7a).LJFF);
            }
        } else {
            Function1<Exception, Unit> function13 = this.LLILZIL;
            if (function13 != null) {
                function13.invoke(new Exception("Unknown Error"));
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PlaylistManageRepo@fa57.getPlaylistVideos$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
