package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.music.model.UnlimitedMusicList;
import com.ss.android.ugc.aweme.music.model.UnlimitedMusicListResponse;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.14yA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.ss.android.ugc.aweme.choosemusic.model.UnlimitedMusicDataRepo$loadMoreUnlimitedMusic$1", f = "UnlimitedMusicDataRepo.kt", l = {98, 101, 137, 142}, m = "invokeSuspend")
public final class C20438014yA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ C20320214fA LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20438014yA(int i, C20320214fA c20320214fA, InterfaceC1364105Vn<? super C20438014yA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = i;
        this.LLILLL = c20320214fA;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C20438014yA(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objLIZIZ = obj;
        C1C7U.LIZ("UnlimitedMusicDataRepo@eb87.loadMoreUnlimitedMusic$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C20437814y8 c20437814y8 = new C20437814y8(this.LLILLL, null);
            this.LL = 4;
            if (C23250099c.LJI(this, abstractC2238408pq, c20437814y8) == objLJFF) {
                C1C7U.LIZIZ("UnlimitedMusicDataRepo@eb87.loadMoreUnlimitedMusic$1");
                return objLJFF;
            }
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            C155000ia.LIZIZ(objLIZIZ);
                            Unit unit = Unit.LIZ;
                            C1C7U.LIZIZ("UnlimitedMusicDataRepo@eb87.loadMoreUnlimitedMusic$1");
                            return unit;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C155000ia.LIZIZ(objLIZIZ);
                    Unit unit2 = Unit.LIZ;
                    C1C7U.LIZIZ("UnlimitedMusicDataRepo@eb87.loadMoreUnlimitedMusic$1");
                    return unit2;
                }
                C155000ia.LIZIZ(objLIZIZ);
                Unit unit3 = Unit.LIZ;
                C1C7U.LIZIZ("UnlimitedMusicDataRepo@eb87.loadMoreUnlimitedMusic$1");
                return unit3;
            }
            C155000ia.LIZIZ(objLIZIZ);
        } else {
            C155000ia.LIZIZ(objLIZIZ);
            AnonymousClass1544 anonymousClass1544 = AnonymousClass1544.LIZ;
            int i2 = this.LLILLJJLI;
            this.LL = 1;
            anonymousClass1544.getClass();
            AnonymousClass1548 anonymousClass1548 = (AnonymousClass1548) AnonymousClass1544.LIZIZ.getValue();
            if (anonymousClass1548 != null) {
                objLIZIZ = anonymousClass1548.LIZIZ(i2, 24, 2, this);
            } else {
                objLIZIZ = null;
            }
            if (objLIZIZ == objLJFF) {
                C1C7U.LIZIZ("UnlimitedMusicDataRepo@eb87.loadMoreUnlimitedMusic$1");
                return objLJFF;
            }
        }
        UnlimitedMusicListResponse unlimitedMusicListResponse = (UnlimitedMusicListResponse) objLIZIZ;
        if (unlimitedMusicListResponse == null) {
            C1DFH c1dfh2 = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq2 = C2107308Nj.LIZ;
            C20437714y7 c20437714y7 = new C20437714y7(this.LLILLL, null);
            this.LL = 2;
            if (C23250099c.LJI(this, abstractC2238408pq2, c20437714y7) == objLJFF) {
                C1C7U.LIZIZ("UnlimitedMusicDataRepo@eb87.loadMoreUnlimitedMusic$1");
                return objLJFF;
            }
            Unit unit32 = Unit.LIZ;
            C1C7U.LIZIZ("UnlimitedMusicDataRepo@eb87.loadMoreUnlimitedMusic$1");
            return unit32;
        }
        C20449014zw c20449014zw = (C20449014zw) this.LLILLL.LIZ.get("unlimited_music_tab_list_data");
        List<C20448614zs> listLIZ = C20448514zr.LIZ(c20449014zw);
        List<MusicModel> listLIZJ = C20448514zr.LIZJ(c20449014zw);
        boolean z = false;
        List<MusicModel> listLIZJ2 = C15J0.LIZJ(unlimitedMusicListResponse.getOriginalMusicList(), null, unlimitedMusicListResponse.extra, false);
        int size = listLIZJ.size();
        ArrayList arrayList = (ArrayList) listLIZJ2;
        int i3 = 0;
        for (Object obj2 : arrayList) {
            int i4 = i3 + 1;
            if (i3 >= 0) {
                MusicModel musicModel = (MusicModel) obj2;
                musicModel.setNeedRecordConsumption(true);
                musicModel.setEventPosition(i3 + size);
                i3 = i4;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        listLIZ.addAll(C20448514zr.LJ(arrayList));
        C20449014zw c20449014zw2 = new C20449014zw();
        c20449014zw2.LIZ.put("list_data", (V) listLIZ);
        c20449014zw2.LIZ.put("unlimited_music_tab_list_load_more_status", (V) C2286608xc.LJ(0));
        c20449014zw2.LIZ.put("list_cursor", (V) C2286608xc.LJ(this.LLILLJJLI));
        UnlimitedMusicList unlimitedMusicList = unlimitedMusicListResponse.musicData;
        if (unlimitedMusicList != null) {
            z = unlimitedMusicList.hasMore;
        }
        c20449014zw2.LIZ.put("list_hasmore", (V) Boolean.valueOf(z));
        c20449014zw2.LIZIZ("action_type", C2286608xc.LJ(2));
        C1DFH c1dfh3 = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq3 = C2107308Nj.LIZ;
        C20437614y6 c20437614y6 = new C20437614y6(this.LLILLL, c20449014zw2, null);
        this.LL = 3;
        objLIZIZ = C23250099c.LJI(this, abstractC2238408pq3, c20437614y6);
        if (objLIZIZ == objLJFF) {
            C1C7U.LIZIZ("UnlimitedMusicDataRepo@eb87.loadMoreUnlimitedMusic$1");
            return objLJFF;
        }
        Unit unit22 = Unit.LIZ;
        C1C7U.LIZIZ("UnlimitedMusicDataRepo@eb87.loadMoreUnlimitedMusic$1");
        return unit22;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
