package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0O3M, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.mix.repo.PlaylistManageRepo$getPlaylistVideos$1$resp$1", f = "PlaylistManageRepo.kt", l = {157}, m = "invokeSuspend")
public final class C0O3M extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C0O7A<C0O3O>>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ boolean LLIZLLLIL;
    public final /* synthetic */ int LLJ;
    public final /* synthetic */ int LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0O3M(String str, String str2, long j, int i, String str3, String str4, boolean z, int i2, int i3, InterfaceC1364105Vn<? super C0O3M> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = j;
        this.LLILZIL = i;
        this.LLILZLL = str3;
        this.LLIZ = str4;
        this.LLIZLLLIL = z;
        this.LLJ = i2;
        this.LLJI = i3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0O3M(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLJIIZILJ = obj;
        C1C7U.LIZ("PlaylistManageRepo@fa57.getPlaylistVideos$1$resp$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLJIIZILJ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLJIIZILJ);
            C613950O6f c613950O6fLIZ = C613940O6e.LIZ();
            String str = this.LLILLJJLI;
            String str2 = this.LLILLL;
            long j = this.LLILZ;
            int i2 = this.LLILZIL;
            String str3 = this.LLILZLL;
            String str4 = this.LLIZ;
            boolean z = this.LLIZLLLIL;
            InterfaceC346201Wa interfaceC346201WaLIZIZ = c613950O6fLIZ.LIZIZ(new C613180O3g(i2, this.LLJI, j, C2286608xc.LJ(this.LLJ), str, str2, str3, str4, z)).LIZIZ();
            this.LL = 1;
            objLJIIZILJ = C09IC.LJIIZILJ(interfaceC346201WaLIZIZ, this);
            if (objLJIIZILJ == objLJFF) {
                C1C7U.LIZIZ("PlaylistManageRepo@fa57.getPlaylistVideos$1$resp$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("PlaylistManageRepo@fa57.getPlaylistVideos$1$resp$1");
        return objLJIIZILJ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C0O7A<C0O3O>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
