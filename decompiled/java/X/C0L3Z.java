package X;

import com.ss.android.ugc.aweme.setting.performance.PhotoPreloadDefaultSizeConfig;
import com.ss.android.ugc.aweme.setting.performance.PhotoPreloadDowngrade;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0L3Z, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.util.MediaDataPrefetcher$prefetchAlbumListAsync$1", f = "MediaDataPrefetcher.kt", l = {}, m = "invokeSuspend")
public final class C0L3Z extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C0L3Z(InterfaceC1364105Vn<? super C0L3Z> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0L3Z(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Pair pair;
        C1C7U.LIZ("MediaDataPrefetcher@a1cd.prefetchAlbumListAsync$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (!C533930Kwp.LIZJ()) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("MediaDataPrefetcher@a1cd.prefetchAlbumListAsync$1");
            return unit;
        }
        C844470XAv.LIZ.getClass();
        C530750Krh.LIZIZ(C844470XAv.LIZ());
        C01GW c01gw = PhotoPreloadDefaultSizeConfig.LIZIZ;
        if (((PhotoPreloadDefaultSizeConfig.Config) c01gw.getValue()).enable) {
            pair = new Pair(C2286608xc.LJ(((PhotoPreloadDefaultSizeConfig.Config) c01gw.getValue()).imageSize), C2286608xc.LJ(((PhotoPreloadDefaultSizeConfig.Config) c01gw.getValue()).videoSize));
        } else {
            C01GW c01gw2 = PhotoPreloadDowngrade.LIZIZ;
            if (((PhotoPreloadDowngrade.PhotoPreloadConfig) c01gw2.getValue()).enable) {
                pair = new Pair(C2286608xc.LJ(((PhotoPreloadDowngrade.PhotoPreloadConfig) c01gw2.getValue()).imageSize), C2286608xc.LJ(((PhotoPreloadDowngrade.PhotoPreloadConfig) c01gw2.getValue()).videoSize));
            } else {
                pair = new Pair(C2286608xc.LJ(30), C2286608xc.LJ(30));
            }
        }
        int iIntValue = ((Number) pair.getFirst()).intValue();
        int iIntValue2 = ((Number) pair.getSecond()).intValue();
        C11JF c11jf = C536720L3e.LIZ;
        if (c11jf != null) {
            c11jf.dispose();
        }
        C0LJ0 c0lj0LIZ = C530760Kri.LIZ();
        C535280Kz0 c535280Kz0 = new C535280Kz0(3, iIntValue, 0, false);
        C530370Kr5 c530370Kr5 = C530370Kr5.LIZ;
        C536720L3e.LIZ = (C11JF) c0lj0LIZ.LJJIJL(c535280Kz0, c530370Kr5).LJJLL(new C09JN() { // from class: X.0L3a
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj2) {
                C1C7U.LIZ("MediaDataPrefetcher@a1cd.prefetchAlbumListAsync$1$1");
                C1C7U.LIZIZ("MediaDataPrefetcher@a1cd.prefetchAlbumListAsync$1$1");
            }
        }, new C09JN() { // from class: X.0L3b
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj2) {
                C1C7U.LIZ("MediaDataPrefetcher@a1cd.prefetchAlbumListAsync$1$2");
                C1C7U.LIZIZ("MediaDataPrefetcher@a1cd.prefetchAlbumListAsync$1$2");
            }
        });
        C11JF c11jf2 = C536720L3e.LIZIZ;
        if (c11jf2 != null) {
            c11jf2.dispose();
        }
        C536720L3e.LIZIZ = (C11JF) C530760Kri.LIZ().LJJIJL(new C535280Kz0(4, iIntValue2, 0, false), c530370Kr5).LJJLL(new C09JN() { // from class: X.0L3c
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj2) {
                C1C7U.LIZ("MediaDataPrefetcher@a1cd.prefetchAlbumListAsync$1$3");
                C1C7U.LIZIZ("MediaDataPrefetcher@a1cd.prefetchAlbumListAsync$1$3");
            }
        }, new C09JN() { // from class: X.0L3d
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj2) {
                C1C7U.LIZ("MediaDataPrefetcher@a1cd.prefetchAlbumListAsync$1$4");
                C1C7U.LIZIZ("MediaDataPrefetcher@a1cd.prefetchAlbumListAsync$1$4");
            }
        });
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("MediaDataPrefetcher@a1cd.prefetchAlbumListAsync$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C0L3Z(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
