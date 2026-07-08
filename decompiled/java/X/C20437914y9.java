package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.music.model.UnlimitedMusicList;
import com.ss.android.ugc.aweme.music.model.UnlimitedMusicListResponse;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.14y9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.ss.android.ugc.aweme.choosemusic.model.UnlimitedMusicDataRepo$initUnlimitedMusic$1", f = "UnlimitedMusicDataRepo.kt", l = {40, 43, 75, 83}, m = "invokeSuspend")
public final class C20437914y9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C20320214fA LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20437914y9(C20320214fA c20320214fA, InterfaceC1364105Vn<? super C20437914y9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c20320214fA;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C20437914y9(this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("UnlimitedMusicDataRepo@eb87.initUnlimitedMusic$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C20437414y4 c20437414y4 = new C20437414y4(this.LLILLJJLI, null);
            this.LL = 4;
            if (C23250099c.LJI(this, abstractC2238408pq, c20437414y4) == objLJFF) {
                C1C7U.LIZIZ("UnlimitedMusicDataRepo@eb87.initUnlimitedMusic$1");
                return objLJFF;
            }
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            C155000ia.LIZIZ(obj);
                            Unit unit = Unit.LIZ;
                            C1C7U.LIZIZ("UnlimitedMusicDataRepo@eb87.initUnlimitedMusic$1");
                            return unit;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C155000ia.LIZIZ(obj);
                    Unit unit2 = Unit.LIZ;
                    C1C7U.LIZIZ("UnlimitedMusicDataRepo@eb87.initUnlimitedMusic$1");
                    return unit2;
                }
                C155000ia.LIZIZ(obj);
                Unit unit3 = Unit.LIZ;
                C1C7U.LIZIZ("UnlimitedMusicDataRepo@eb87.initUnlimitedMusic$1");
                return unit3;
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            AnonymousClass1544 anonymousClass1544 = AnonymousClass1544.LIZ;
            this.LL = 1;
            anonymousClass1544.getClass();
            AnonymousClass1548 anonymousClass1548 = (AnonymousClass1548) AnonymousClass1544.LIZIZ.getValue();
            if (anonymousClass1548 != null) {
                obj = anonymousClass1548.LIZIZ(1, 24, 2, this);
            } else {
                obj = null;
            }
            if (obj == objLJFF) {
                C1C7U.LIZIZ("UnlimitedMusicDataRepo@eb87.initUnlimitedMusic$1");
                return objLJFF;
            }
        }
        UnlimitedMusicListResponse unlimitedMusicListResponse = (UnlimitedMusicListResponse) obj;
        if (unlimitedMusicListResponse == null) {
            C1DFH c1dfh2 = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq2 = C2107308Nj.LIZ;
            C20437314y3 c20437314y3 = new C20437314y3(this.LLILLJJLI, null);
            this.LL = 2;
            if (C23250099c.LJI(this, abstractC2238408pq2, c20437314y3) == objLJFF) {
                C1C7U.LIZIZ("UnlimitedMusicDataRepo@eb87.initUnlimitedMusic$1");
                return objLJFF;
            }
            Unit unit32 = Unit.LIZ;
            C1C7U.LIZIZ("UnlimitedMusicDataRepo@eb87.initUnlimitedMusic$1");
            return unit32;
        }
        List<C20448614zs> listLIZ = C20438314yD.LIZ(unlimitedMusicListResponse);
        boolean z = false;
        if (C1411810mqJ.LIZJ()) {
            ((ArrayList) listLIZ).add(0, new C20448614zs(1001, null, null, null));
        }
        C20449014zw c20449014zw = new C20449014zw();
        c20449014zw.LIZ.put("list_data", (V) listLIZ);
        c20449014zw.LIZ.put("unlimited_music_tab_list_refresh_status", (V) C2286608xc.LJ(0));
        c20449014zw.LIZ.put("list_cursor", (V) C2286608xc.LJ(1));
        UnlimitedMusicList unlimitedMusicList = unlimitedMusicListResponse.musicData;
        if (unlimitedMusicList != null) {
            z = unlimitedMusicList.hasMore;
        }
        c20449014zw.LIZ.put("list_hasmore", (V) Boolean.valueOf(z));
        c20449014zw.LIZIZ("action_type", C2286608xc.LJ(1));
        C1DFH c1dfh3 = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq3 = C2107308Nj.LIZ;
        C20437514y5 c20437514y5 = new C20437514y5(this.LLILLJJLI, c20449014zw, null);
        this.LL = 3;
        obj = C23250099c.LJI(this, abstractC2238408pq3, c20437514y5);
        if (obj == objLJFF) {
            C1C7U.LIZIZ("UnlimitedMusicDataRepo@eb87.initUnlimitedMusic$1");
            return objLJFF;
        }
        Unit unit22 = Unit.LIZ;
        C1C7U.LIZIZ("UnlimitedMusicDataRepo@eb87.initUnlimitedMusic$1");
        return unit22;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
