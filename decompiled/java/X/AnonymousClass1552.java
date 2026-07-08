package X;

import Y.AfS118S0300000_31;
import Y.AfS195S0100000_26;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.1552, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.music.music.vertical.tab.recommend.RecommendRepo$getMoreMusicList$2", f = "RecommendRepo.kt", l = {}, m = "invokeSuspend")
public final class AnonymousClass1552 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<MusicModel>>, Object> {
    public final /* synthetic */ AnonymousClass1553 LL;
    public final /* synthetic */ Context LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass1552(AnonymousClass1553 anonymousClass1553, Context context, InterfaceC1364105Vn<? super AnonymousClass1552> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = anonymousClass1553;
        this.LLILLJJLI = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new AnonymousClass1552(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RecommendRepo@8c93.getMoreMusicList$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ArrayList arrayList = new ArrayList();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        C1458370o3P c1458370o3P = C1458370o3P.LIZ;
        boolean z = this.LL.LIZLLL().LJIIJ;
        Context context = this.LLILLJJLI;
        c1458370o3P.getClass();
        C1458410o3T.LJ(C1458410o3T.LIZ, this.LL.LLILLJJLI.LIZJ, C1458370o3P.LJIILJJIL(context, z), System.currentTimeMillis(), this.LL.LIZLLL().LIZJ.invoke()).LJJLL(new AfS118S0300000_31(this.LL, arrayList, countDownLatch, 1), new AfS195S0100000_26(countDownLatch, 16));
        try {
            countDownLatch.await(15L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C1C7U.LIZIZ("RecommendRepo@8c93.getMoreMusicList$2");
        return arrayList;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<MusicModel>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
