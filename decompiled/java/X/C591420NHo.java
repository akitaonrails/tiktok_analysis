package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.e;
import com.ss.android.ugc.aweme.feed.ghouse.CacheEntry;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizFieldDeserializer;
import com.ss.android.ugc.tiktok.ConvertHelper;
import java.io.File;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS158S1100000_9;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0NHo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C591420NHo {
    public final File LIZ;

    public final void LIZIZ() {
        if (this.LIZ.exists() && !this.LIZ.isDirectory()) {
            this.LIZ.delete();
        }
        if (this.LIZ.exists()) {
            return;
        }
        this.LIZ.mkdirs();
    }

    public C591420NHo(C0VSJ c0vsj) {
        this.LIZ = c0vsj;
    }

    public final void LIZ(String str) {
        Pair<File, EnumC591430NHp> pairLIZJ = LIZJ(str);
        if (pairLIZJ != null) {
            try {
                pairLIZJ.getFirst().delete();
                C0S4J c0s4j = C0NH6.LJIILLIIL;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("deleteCacheByAid ");
                sbLIZ.append(str);
                c0s4j.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C098200Yq c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
                Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                if (thM5exceptionOrNullimpl != null) {
                    C0NH6.LJIILLIIL.LJII(new AwS158S1100000_9(str, thM5exceptionOrNullimpl, 28));
                }
                C189200o6.m1boximpl(c098200Yq);
            }
        }
    }

    public final Pair<File, EnumC591430NHp> LIZJ(String str) {
        boolean z;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        try {
            LIZIZ();
            String[] list = this.LIZ.list();
            if (list != null) {
                for (String str2 : list) {
                    if (str2 != null && u.LJJIIJZLJL(str2, str, false)) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(this.LIZ.getPath());
                        sbLIZ.append(File.separator);
                        sbLIZ.append(str2);
                        C0VSJ c0vsj = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ));
                        if (!c0vsj.exists()) {
                            return null;
                        }
                        if (Intrinsics.LJFF(C08QA.LJIJ(c0vsj), "pb")) {
                            return new Pair<>(c0vsj, EnumC591430NHp.LLILLJJLI);
                        }
                        return new Pair<>(c0vsj, EnumC591430NHp.LL);
                    }
                }
            }
            return null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                C0NH6.LJIILLIIL.LJII(new AwS158S1100000_9(str, thM5exceptionOrNullimpl, 26));
            }
            return null;
        }
    }

    public final Aweme LIZLLL(String str) {
        Object c098200Yq;
        int iOrdinal;
        Pair<File, EnumC591430NHp> pairLIZJ = LIZJ(str);
        if (pairLIZJ == null) {
            return null;
        }
        File first = pairLIZJ.getFirst();
        try {
            iOrdinal = pairLIZJ.getSecond().ordinal();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                C5186020i c5186020iDecode = C5186020i.ADAPTER.decode(new C0VSP(first));
                if (c5186020iDecode != null) {
                    Aweme awemeCom$ss$ugc$tiktok$proto$AwemeStructV2$$com$ss$android$ugc$aweme$feed$model$Aweme = ConvertHelper.com$ss$ugc$tiktok$proto$AwemeStructV2$$com$ss$android$ugc$aweme$feed$model$Aweme(c5186020iDecode, null);
                    C0OBE.LIZIZ(awemeCom$ss$ugc$tiktok$proto$AwemeStructV2$$com$ss$android$ugc$aweme$feed$model$Aweme, "g_cache_pb", c5186020iDecode);
                    return awemeCom$ss$ugc$tiktok$proto$AwemeStructV2$$com$ss$android$ugc$aweme$feed$model$Aweme;
                }
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
                Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                if (thM5exceptionOrNullimpl != null) {
                    C0NH6.LJIILLIIL.LJII(new AwS158S1100000_9(str, thM5exceptionOrNullimpl, 27));
                }
                return null;
            }
            throw new C1954807lC();
        }
        byte[] bArrLJ = C09BH.LJ(first);
        if (bArrLJ.length == 0) {
            return null;
        }
        C1227904rF.LIZ.getClass();
        Gson gsonLJ = C1227904rF.LJ();
        gsonLJ.getClass();
        e eVar = new e(gsonLJ);
        eVar.LIZJ(new AwemeBizFieldDeserializer(), Aweme.class);
        return ((CacheEntry) eVar.LIZ().LJII(u.LJIILL(bArrLJ), CacheEntry.class)).value;
    }
}
