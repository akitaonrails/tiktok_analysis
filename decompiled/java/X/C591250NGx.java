package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.Message;
import com.ss.android.ugc.aweme.feed.ghouse.CacheEntry;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.io.File;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.u;
import njp.a;

/* JADX INFO: renamed from: X.0NGx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.ghouse.GHouseCachePool$saveCacheEntry$2", f = "GHouseCachePool.kt", l = {}, m = "invokeSuspend")
public final class C591250NGx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ CacheEntry LL;
    public final /* synthetic */ CacheEntry LLILLJJLI;
    public final /* synthetic */ C0NGO LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C591250NGx(CacheEntry cacheEntry, CacheEntry cacheEntry2, C0NGO c0ngo, InterfaceC1364105Vn<? super C591250NGx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = cacheEntry;
        this.LLILLJJLI = cacheEntry2;
        this.LLILLL = c0ngo;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C591250NGx(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        boolean z;
        boolean z2;
        boolean z3;
        File first;
        C1C7U.LIZ("GHouseCachePool@3638.saveCacheEntry$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        CacheEntry cacheEntry = this.LL;
        if (cacheEntry != null) {
            C591420NHo c591420NHo = this.LLILLL.LJIIL;
            c591420NHo.getClass();
            Aweme aweme = cacheEntry.value;
            Message message = null;
            if (aweme != null) {
                message = (Message) C0OBE.LIZ(aweme, "g_cache_pb");
            }
            try {
                c591420NHo.LIZIZ();
                Pair<File, EnumC591430NHp> pairLIZJ = c591420NHo.LIZJ(cacheEntry.key);
                if (pairLIZJ != null && (first = pairLIZJ.getFirst()) != null && first.exists()) {
                    first.delete();
                }
                if (message != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(c591420NHo.LIZ.getPath());
                    sbLIZ.append(File.separator);
                    sbLIZ.append(cacheEntry.key);
                    sbLIZ.append(".pb");
                    C0VSJ c0vsj = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ));
                    c0vsj.createNewFile();
                    message.encode(new C0VSV(c0vsj));
                } else {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(c591420NHo.LIZ.getPath());
                    sbLIZ2.append(File.separator);
                    sbLIZ2.append(cacheEntry.key);
                    C0VSJ c0vsj2 = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ2));
                    c0vsj2.createNewFile();
                    C1227904rF.LIZ.getClass();
                    C09BH.LJIIIIZZ(c0vsj2, u.LJIILLIIL(C1227904rF.LJ().LJIILL(cacheEntry)));
                }
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m8isSuccessimpl(c098200Yq)) {
                C0S4J c0s4j = C0NH6.LJIILLIIL;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("saveCache key ");
                sbLIZ3.append(cacheEntry.key);
                sbLIZ3.append(" success, use PB: ");
                if (message != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                sbLIZ3.append(z3);
                c0s4j.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ3));
                z = true;
            } else {
                Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                if (thM5exceptionOrNullimpl != null) {
                    C0S4J c0s4j2 = C0NH6.LJIILLIIL;
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("saveCache key ");
                    sbLIZ4.append(cacheEntry.key);
                    sbLIZ4.append(" fail, use PB: ");
                    if (message != null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    sbLIZ4.append(z2);
                    sbLIZ4.append(", err: ");
                    sbLIZ4.append(thM5exceptionOrNullimpl);
                    c0s4j2.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ4));
                }
                z = false;
            }
            Boolean.valueOf(z);
        }
        CacheEntry cacheEntry2 = this.LLILLJJLI;
        if (cacheEntry2 != null) {
            this.LLILLL.LJIIL.LIZ(cacheEntry2.key);
            C591050NGd c591050NGd = C591050NGd.LIZ;
            String str = cacheEntry2.videoFilePath;
            c591050NGd.getClass();
            C591050NGd.LIZ(str);
            if (cacheEntry2.LIZ) {
                C0NH1.LIZ.getClass();
                C0NH1.LIZ("cache_video_expired", C591500NHw.LIZ(new Pair("cache_type", 2), new Pair("cache_shelf_life", Long.valueOf(C0NH4.LIZIZ(cacheEntry2) / 3600000)), new Pair("cache_keep_time", Long.valueOf((System.currentTimeMillis() - cacheEntry2.creationDate) / 3600000))));
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GHouseCachePool@3638.saveCacheEntry$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
