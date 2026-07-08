package X;

import android.content.Context;
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

/* JADX INFO: renamed from: X.14yB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.ss.android.ugc.aweme.choosemusic.model.CollectUnlimitedMusicDataRepo$refreshCollectUnlimitedMusic$1", f = "CollectUnlimitedMusicDataRepo.kt", l = {48, 52, 93, 101}, m = "invokeSuspend")
public final class C20438114yB extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ DataCenter LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20438114yB(boolean z, Context context, DataCenter dataCenter, InterfaceC1364105Vn<? super C20438114yB> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = z;
        this.LLILLL = context;
        this.LLILZ = dataCenter;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C20438114yB(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i;
        C1C7U.LIZ("CollectUnlimitedMusicDataRepo@2cb4.refreshCollectUnlimitedMusic$1");
        Object objLJFF = C099R.LJFF();
        int i2 = this.LL;
        boolean z = false;
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C695040ROc c695040ROc = new C695040ROc(this.LLILZ, null);
            this.LL = 4;
            if (C23250099c.LJI(this, abstractC2238408pq, c695040ROc) == objLJFF) {
                C1C7U.LIZIZ("CollectUnlimitedMusicDataRepo@2cb4.refreshCollectUnlimitedMusic$1");
                return objLJFF;
            }
        }
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 == 4) {
                            C155000ia.LIZIZ(obj);
                            Unit unit = Unit.LIZ;
                            C1C7U.LIZIZ("CollectUnlimitedMusicDataRepo@2cb4.refreshCollectUnlimitedMusic$1");
                            return unit;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C155000ia.LIZIZ(obj);
                    Unit unit2 = Unit.LIZ;
                    C1C7U.LIZIZ("CollectUnlimitedMusicDataRepo@2cb4.refreshCollectUnlimitedMusic$1");
                    return unit2;
                }
                C155000ia.LIZIZ(obj);
                Unit unit3 = Unit.LIZ;
                C1C7U.LIZIZ("CollectUnlimitedMusicDataRepo@2cb4.refreshCollectUnlimitedMusic$1");
                return unit3;
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            if (C20320114f9.LIZ) {
                Unit unit4 = Unit.LIZ;
                C1C7U.LIZIZ("CollectUnlimitedMusicDataRepo@2cb4.refreshCollectUnlimitedMusic$1");
                return unit4;
            }
            C20320114f9.LIZ = true;
            AnonymousClass1544 anonymousClass1544 = AnonymousClass1544.LIZ;
            this.LL = 1;
            obj = anonymousClass1544.LIZ(0, 20, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("CollectUnlimitedMusicDataRepo@2cb4.refreshCollectUnlimitedMusic$1");
                return objLJFF;
            }
        }
        UnlimitedMusicListResponse unlimitedMusicListResponse = (UnlimitedMusicListResponse) obj;
        C20320114f9.LIZ = false;
        if (unlimitedMusicListResponse == null) {
            C1DFH c1dfh2 = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq2 = C2107308Nj.LIZ;
            C695030ROb c695030ROb = new C695030ROb(this.LLILZ, null);
            this.LL = 2;
            if (C23250099c.LJI(this, abstractC2238408pq2, c695030ROb) == objLJFF) {
                C1C7U.LIZIZ("CollectUnlimitedMusicDataRepo@2cb4.refreshCollectUnlimitedMusic$1");
                return objLJFF;
            }
            Unit unit32 = Unit.LIZ;
            C1C7U.LIZIZ("CollectUnlimitedMusicDataRepo@2cb4.refreshCollectUnlimitedMusic$1");
            return unit32;
        }
        List<C20448614zs> listLIZ = C20438314yD.LIZ(unlimitedMusicListResponse);
        if (this.LLILLJJLI && this.LLILLL != null) {
            List<MusicModel> listLIZJ = C15J0.LIZJ(unlimitedMusicListResponse.getOriginalMusicList(), null, unlimitedMusicListResponse.extra, false);
            Context context = this.LLILLL;
            C20499015Jc c20499015Jc = C20320114f9.LIZIZ;
            if (c20499015Jc != null) {
                c20499015Jc.cancel();
            }
            C20499015Jc c20499015Jc2 = new C20499015Jc(10, context, listLIZJ);
            C20320114f9.LIZIZ = c20499015Jc2;
            c20499015Jc2.load();
        }
        ArrayList arrayList = (ArrayList) listLIZ;
        if (arrayList.size() > 0) {
            arrayList.add(0, new C20448614zs(1101, null, null, null));
        }
        C20449014zw c20449014zw = new C20449014zw();
        c20449014zw.LIZ.put("list_data", (V) listLIZ);
        c20449014zw.LIZ.put("refresh_status_user_collected_music", (V) C2286608xc.LJ(0));
        UnlimitedMusicList unlimitedMusicList = unlimitedMusicListResponse.musicData;
        if (unlimitedMusicList != null) {
            i = unlimitedMusicList.nextCursor;
        } else {
            i = 0;
        }
        c20449014zw.LIZ.put("list_cursor", (V) C2286608xc.LJ(i));
        UnlimitedMusicList unlimitedMusicList2 = unlimitedMusicListResponse.musicData;
        if (unlimitedMusicList2 != null) {
            z = unlimitedMusicList2.hasMore;
        }
        c20449014zw.LIZ.put("list_hasmore", (V) Boolean.valueOf(z));
        c20449014zw.LIZIZ("action_type", C2286608xc.LJ(1));
        C1DFH c1dfh3 = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq3 = C2107308Nj.LIZ;
        C695060ROe c695060ROe = new C695060ROe(this.LLILZ, c20449014zw, null);
        this.LL = 3;
        obj = C23250099c.LJI(this, abstractC2238408pq3, c695060ROe);
        if (obj == objLJFF) {
            C1C7U.LIZIZ("CollectUnlimitedMusicDataRepo@2cb4.refreshCollectUnlimitedMusic$1");
            return objLJFF;
        }
        Unit unit22 = Unit.LIZ;
        C1C7U.LIZIZ("CollectUnlimitedMusicDataRepo@2cb4.refreshCollectUnlimitedMusic$1");
        return unit22;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
