package X;

import Y.AgS200S0200000_9;
import com.ss.android.ugc.aweme.mix.model.MixStruct;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0O3K, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.mix.repo.PlaylistManageRepo$requestUserPlaylist$1", f = "PlaylistManageRepo.kt", l = {104}, m = "invokeSuspend")
public final class C0O3K extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1165050gQJ LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ long LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ Boolean LLIZ;
    public final /* synthetic */ InterfaceC1631620sYq<List<MixStruct>, Boolean, Long, Unit> LLIZLLLIL;
    public final /* synthetic */ Function1<Exception, Unit> LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0O3K(C1165050gQJ c1165050gQJ, String str, String str2, long j, String str3, Boolean bool, InterfaceC1631620sYq<? super List<MixStruct>, ? super Boolean, ? super Long, Unit> interfaceC1631620sYq, Function1<? super Exception, Unit> function1, InterfaceC1364105Vn<? super C0O3K> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1165050gQJ;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = j;
        this.LLILZLL = str3;
        this.LLIZ = bool;
        this.LLIZLLLIL = interfaceC1631620sYq;
        this.LLJ = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0O3K(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C0O3P c0o3p;
        C1C7U.LIZ("PlaylistManageRepo@fa57.requestUserPlaylist$1");
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
            this.LLILLJJLI.getClass();
            String str = this.LLILLL;
            String str2 = this.LLILZ;
            long j = this.LLILZIL;
            String str3 = this.LLILZLL;
            Boolean bool = this.LLIZ;
            C613960O6g c613960O6gLIZIZ = C613940O6e.LIZ().LIZIZ(new C613160O3e(j, str, str2, str3));
            C0O4P<C0O3L> value = C613200O3i.LL.getValue();
            if (Intrinsics.LJFF(C0O3L.class, C0O3L.class)) {
                c613960O6gLIZIZ.LIZ(new C0O8D(new C0O70(value, null, null, C0O3L.class, C0O3L.class)));
                if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
                    c0o3p = C0O3P.NetWhenCacheMiss;
                } else {
                    c0o3p = C0O3P.NetworkOnly;
                }
                C0O7F.LIZIZ(c613960O6gLIZIZ, c0o3p);
                InterfaceC346201Wa interfaceC346201WaLIZIZ = c613960O6gLIZIZ.LIZIZ();
                AgS200S0200000_9 agS200S0200000_9 = new AgS200S0200000_9(this.LLIZLLLIL, this.LLJ, 9);
                this.LL = 1;
                if (interfaceC346201WaLIZIZ.collect(agS200S0200000_9, this) == objLJFF) {
                    C1C7U.LIZIZ("PlaylistManageRepo@fa57.requestUserPlaylist$1");
                    return objLJFF;
                }
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("po is ");
                sbLIZ.append(C0O3L.class);
                sbLIZ.append(", do is ");
                sbLIZ.append(C0O3L.class);
                sbLIZ.append(", please pass the onFetchCache and onQueryNet param to map cache");
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                strLIZIZ.toString();
                throw new IllegalStateException(strLIZIZ);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PlaylistManageRepo@fa57.requestUserPlaylist$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
