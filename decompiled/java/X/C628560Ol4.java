package X;

import android.content.Context;
import com.ss.android.ugc.aweme.music.v2.viewmodel.MusicDetailViewModel;
import java.util.TreeMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ol4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.music.v2.viewmodel.MusicDetailViewModel$fetchMusicDetail$3$1", f = "MusicDetailViewModel.kt", l = {}, m = "invokeSuspend")
public final class C628560Ol4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ MusicDetailViewModel LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ TreeMap<String, String> LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ Context LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C628560Ol4(MusicDetailViewModel musicDetailViewModel, boolean z, int i, TreeMap<String, String> treeMap, boolean z2, Context context, InterfaceC1364105Vn<? super C628560Ol4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = musicDetailViewModel;
        this.LLILLJJLI = z;
        this.LLILLL = i;
        this.LLILZ = treeMap;
        this.LLILZIL = z2;
        this.LLILZLL = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C628560Ol4(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0088 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.String r9 = "MusicDetailViewModel@92b7.fetchMusicDetail$3$1"
            X.C1C7U.LIZ(r9)
            X.C099R.LJFF()
            X.C155000ia.LIZIZ(r11)
            X.0Oqp r0 = X.C632130Oqp.LIZ
            r0.getClass()
            java.lang.String r0 = X.C632130Oqp.LIZIZ
            int r0 = r0.length()
            r6 = 1
            if (r0 == 0) goto La3
            r0 = 0
            r3 = 0
            if (r0 != 0) goto La3
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = X.C632130Oqp.LIZJ
            r1.append(r0)
            java.lang.String r0 = "_detail"
            r1.append(r0)
            java.lang.String r8 = X.C2188811AlT.LIZIZ(r1)
            long r4 = X.C306590C0b.LIZ()
            r1 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 <= 0) goto L88
            X.0Ol5 r0 = new X.0Ol5
            r0.<init>()
            java.lang.reflect.Type r7 = r0.getType()
            com.ss.android.ugc.aweme.music.cache.CacheManager r2 = com.ss.android.ugc.aweme.music.cache.CacheManager.LIZ
            long r4 = X.C306590C0b.LIZ()
            r0 = 1000(0x3e8, float:1.401E-42)
            long r0 = (long) r0
            long r4 = r4 * r0
            java.lang.Long r1 = java.lang.Long.valueOf(r4)
            r0 = 250(0xfa, float:3.5E-43)
            kotlin.jvm.internal.AFwS195S0000000_9 r0 = kotlin.jvm.internal.AFwS195S0000000_9.get$arr$(r0)
            java.lang.Object r0 = com.ss.android.ugc.aweme.music.cache.CacheManager.LIZIZ(r2, r8, r1, r7, r0)
            com.ss.android.ugc.aweme.music.model.MusicDetail r0 = (com.ss.android.ugc.aweme.music.model.MusicDetail) r0
            if (r0 == 0) goto L88
            r3 = r0
        L5f:
            boolean r0 = X.C297090Bkh.LIZ()
            if (r0 == 0) goto L70
            kotlin.jvm.internal.AwS10S1010000_9 r2 = new kotlin.jvm.internal.AwS10S1010000_9
            java.lang.String r1 = "mdp_detail"
            r0 = 1
            r2.<init>(r1, r6, r0)
            X.C0CNO.LIZIZ(r2)
        L70:
            if (r3 == 0) goto La3
            com.ss.android.ugc.aweme.music.v2.viewmodel.MusicDetailViewModel r2 = r10.LL
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r2.LLILLJJLI
            r3.localCoverUrl = r0
            kotlin.jvm.internal.AwS588S0100000_9 r1 = new kotlin.jvm.internal.AwS588S0100000_9
            r0 = 580(0x244, float:8.13E-43)
            r1.<init>(r3, r0)
            r2.setState(r1)
        L82:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r9)
            return r0
        L88:
            com.ss.android.ugc.aweme.music.model.MusicDetail r0 = X.C632130Oqp.LIZLLL     // Catch: java.lang.Exception -> L9d
            if (r0 != 0) goto L9b
            java.util.concurrent.Future<com.ss.android.ugc.aweme.music.model.MusicDetail> r0 = X.C632130Oqp.LJ     // Catch: java.lang.Exception -> L9d
            if (r0 == 0) goto L99
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Exception -> L9d
            com.ss.android.ugc.aweme.music.model.MusicDetail r0 = (com.ss.android.ugc.aweme.music.model.MusicDetail) r0     // Catch: java.lang.Exception -> L9d
        L96:
            X.C632130Oqp.LIZLLL = r0     // Catch: java.lang.Exception -> L9d
            goto L9b
        L99:
            r0 = r3
            goto L96
        L9b:
            r3 = r0
            goto La1
        L9d:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        La1:
            r6 = 0
            goto L5f
        La3:
            com.ss.android.ugc.aweme.music.v2.viewmodel.MusicDetailViewModel r0 = r10.LL
            java.lang.String r1 = r0.LLILLL
            boolean r2 = r10.LLILLJJLI
            int r3 = r10.LLILLL
            java.util.TreeMap<java.lang.String, java.lang.String> r4 = r10.LLILZ
            boolean r5 = r10.LLILZIL
            android.content.Context r6 = r10.LLILZLL
            r0.wQ2(r1, r2, r3, r4, r5, r6)
            goto L82
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C628560Ol4.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
