package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.music.model.UnlimitedMusicList;
import com.ss.android.ugc.aweme.music.model.UnlimitedMusicListResponse;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.14yC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.ss.android.ugc.aweme.choosemusic.model.CollectUnlimitedMusicDataRepo$loadMoreCollectUnlimitedMusic$1", f = "CollectUnlimitedMusicDataRepo.kt", l = {120, 127, 162, 167}, m = "invokeSuspend")
public final class C20438214yC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ DataCenter LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20438214yC(int i, DataCenter dataCenter, InterfaceC1364105Vn<? super C20438214yC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = i;
        this.LLILLL = dataCenter;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C20438214yC(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i;
        Object objLIZ = obj;
        C1C7U.LIZ("CollectUnlimitedMusicDataRepo@2cb4.loadMoreCollectUnlimitedMusic$1");
        Object objLJFF = C099R.LJFF();
        int i2 = this.LL;
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C695020ROa c695020ROa = new C695020ROa(this.LLILLL, null);
            this.LL = 4;
            if (C23250099c.LJI(this, abstractC2238408pq, c695020ROa) == objLJFF) {
                C1C7U.LIZIZ("CollectUnlimitedMusicDataRepo@2cb4.loadMoreCollectUnlimitedMusic$1");
                return objLJFF;
            }
        }
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 == 4) {
                            C155000ia.LIZIZ(objLIZ);
                            Unit unit = Unit.LIZ;
                            C1C7U.LIZIZ("CollectUnlimitedMusicDataRepo@2cb4.loadMoreCollectUnlimitedMusic$1");
                            return unit;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C155000ia.LIZIZ(objLIZ);
                    Unit unit2 = Unit.LIZ;
                    C1C7U.LIZIZ("CollectUnlimitedMusicDataRepo@2cb4.loadMoreCollectUnlimitedMusic$1");
                    return unit2;
                }
                C155000ia.LIZIZ(objLIZ);
                Unit unit3 = Unit.LIZ;
                C1C7U.LIZIZ("CollectUnlimitedMusicDataRepo@2cb4.loadMoreCollectUnlimitedMusic$1");
                return unit3;
            }
            C155000ia.LIZIZ(objLIZ);
        } else {
            C155000ia.LIZIZ(objLIZ);
            if (C20320114f9.LIZ) {
                Unit unit4 = Unit.LIZ;
                C1C7U.LIZIZ("CollectUnlimitedMusicDataRepo@2cb4.loadMoreCollectUnlimitedMusic$1");
                return unit4;
            }
            C20320114f9.LIZ = true;
            AnonymousClass1544 anonymousClass1544 = AnonymousClass1544.LIZ;
            int i3 = this.LLILLJJLI;
            this.LL = 1;
            objLIZ = anonymousClass1544.LIZ(i3, 20, this);
            if (objLIZ == objLJFF) {
                C1C7U.LIZIZ("CollectUnlimitedMusicDataRepo@2cb4.loadMoreCollectUnlimitedMusic$1");
                return objLJFF;
            }
        }
        UnlimitedMusicListResponse unlimitedMusicListResponse = (UnlimitedMusicListResponse) objLIZ;
        boolean z = false;
        C20320114f9.LIZ = false;
        if (unlimitedMusicListResponse == null) {
            C1DFH c1dfh2 = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq2 = C2107308Nj.LIZ;
            C0ROZ c0roz = new C0ROZ(this.LLILLL, null);
            this.LL = 2;
            if (C23250099c.LJI(this, abstractC2238408pq2, c0roz) == objLJFF) {
                C1C7U.LIZIZ("CollectUnlimitedMusicDataRepo@2cb4.loadMoreCollectUnlimitedMusic$1");
                return objLJFF;
            }
            Unit unit32 = Unit.LIZ;
            C1C7U.LIZIZ("CollectUnlimitedMusicDataRepo@2cb4.loadMoreCollectUnlimitedMusic$1");
            return unit32;
        }
        C20449014zw c20449014zw = (C20449014zw) this.LLILLL.get("user_collected_unlimited_music_list");
        int size = C20448514zr.LIZJ(c20449014zw).size();
        ArrayList arrayList = (ArrayList) C15J0.LIZJ(unlimitedMusicListResponse.getOriginalMusicList(), null, unlimitedMusicListResponse.extra, false);
        int i4 = 0;
        for (Object obj2 : arrayList) {
            int i5 = i4 + 1;
            if (i4 >= 0) {
                MusicModel musicModel = (MusicModel) obj2;
                musicModel.setNeedRecordConsumption(true);
                musicModel.setEventPosition(i4 + size);
                i4 = i5;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        List<C20448614zs> listLIZ = C20448514zr.LIZ(c20449014zw);
        listLIZ.addAll(C20448514zr.LJ(arrayList));
        C20449014zw c20449014zw2 = new C20449014zw();
        c20449014zw2.LIZ.put("list_data", (V) listLIZ);
        c20449014zw2.LIZ.put("loadmore_status_user_collected_music", (V) C2286608xc.LJ(0));
        UnlimitedMusicList unlimitedMusicList = unlimitedMusicListResponse.musicData;
        if (unlimitedMusicList != null) {
            i = unlimitedMusicList.nextCursor;
        } else {
            i = 0;
        }
        c20449014zw2.LIZ.put("list_cursor", (V) C2286608xc.LJ(i));
        UnlimitedMusicList unlimitedMusicList2 = unlimitedMusicListResponse.musicData;
        if (unlimitedMusicList2 != null) {
            z = unlimitedMusicList2.hasMore;
        }
        c20449014zw2.LIZ.put("list_hasmore", (V) Boolean.valueOf(z));
        c20449014zw2.LIZIZ("action_type", C2286608xc.LJ(2));
        C1DFH c1dfh3 = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq3 = C2107308Nj.LIZ;
        C695050ROd c695050ROd = new C695050ROd(this.LLILLL, c20449014zw2, null);
        this.LL = 3;
        objLIZ = C23250099c.LJI(this, abstractC2238408pq3, c695050ROd);
        if (objLIZ == objLJFF) {
            C1C7U.LIZIZ("CollectUnlimitedMusicDataRepo@2cb4.loadMoreCollectUnlimitedMusic$1");
            return objLJFF;
        }
        Unit unit22 = Unit.LIZ;
        C1C7U.LIZIZ("CollectUnlimitedMusicDataRepo@2cb4.loadMoreCollectUnlimitedMusic$1");
        return unit22;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
