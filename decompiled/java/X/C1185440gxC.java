package X;

import Y.AfS187S0100000_18;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiCommonMobParams;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS632S0100000_18;

/* JADX INFO: renamed from: X.0gxC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1185440gxC {
    public final Function2<Long, Boolean, Unit> LIZ;
    public final boolean LIZIZ;
    public final C1185050gwZ LIZJ;
    public long LIZLLL;
    public long LJ;
    public PoiCommonMobParams LJFF;

    public final void LIZLLL() {
        Long lValueOf = Long.valueOf(this.LJ);
        if (C08A4.LIZIZ(Long.valueOf(lValueOf.longValue()))) {
            lValueOf.longValue();
            this.LIZLLL += System.currentTimeMillis() - this.LJ;
        }
    }

    public final void LJ() {
        this.LJ = System.currentTimeMillis();
    }

    public final void LIZ(boolean z) {
        String str;
        Long lValueOf = Long.valueOf(this.LIZLLL);
        if (C08A4.LIZIZ(Long.valueOf(lValueOf.longValue()))) {
            lValueOf.longValue();
            if (this.LIZIZ) {
                Function2<Long, Boolean, Unit> function2 = this.LIZ;
                if (function2 != null) {
                    function2.invoke(Long.valueOf(this.LIZLLL), Boolean.valueOf(z));
                    return;
                }
                return;
            }
            C1185040gwY c1185040gwY = C1185040gwY.LIZ;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            C1182380gsG.LIZIZ(this.LJFF, linkedHashMap);
            linkedHashMap.put("duration", String.valueOf(this.LIZLLL));
            if (z) {
                str = "page_enter_background";
            } else {
                str = "page_leave";
            }
            linkedHashMap.put("stay_time_source", str);
            C1185050gwZ c1185050gwZ = this.LIZJ;
            c1185040gwY.getClass();
            C1185040gwY.LIZIZ("ttls_poi_page_stay_time", linkedHashMap, c1185050gwZ);
        }
    }

    public final void LIZIZ(Bundle bundle) {
        Long lValueOf;
        Unit unit = null;
        if (bundle == null) {
            lValueOf = null;
        } else {
            try {
                lValueOf = Long.valueOf(bundle.getLong("play_time_in_current_page"));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return;
            }
        }
        if (C08A4.LIZIZ(lValueOf) && lValueOf != null) {
            this.LIZLLL = lValueOf.longValue();
            unit = Unit.LIZ;
        }
        C189200o6.m2constructorimpl(unit);
    }

    public final void LIZJ(Context context, Fragment fragment) {
        C19EG c19egLIZIZ;
        boolean zIsFinishing;
        int iHashCode;
        if (fragment != null) {
            AbstractC1387200mCc abstractC1387200mCcLIZIZ = C520040KaQ.LIZIZ(fragment);
            if (abstractC1387200mCcLIZIZ != null) {
                if (abstractC1387200mCcLIZIZ instanceof C1397950mTx) {
                    zIsFinishing = ((C1397950mTx) abstractC1387200mCcLIZIZ).LIZLLL.isFinishing();
                } else {
                    if (abstractC1387200mCcLIZIZ instanceof C1844400y62) {
                        C1844400y62 c1844400y62 = (C1844400y62) abstractC1387200mCcLIZIZ;
                        C19EG activity = c1844400y62.LIZLLL.getActivity();
                        if ((activity == null || !activity.isFinishing()) && !c1844400y62.LIZLLL.SL()) {
                            Object obj = c1844400y62.LIZLLL;
                            if (!(obj instanceof InterfaceC214902198i)) {
                                obj = null;
                            }
                            Set<String> set = C1185800gxm.LIZ;
                            if (obj != null) {
                                iHashCode = obj.hashCode();
                            } else {
                                iHashCode = 0;
                            }
                            if (!set.contains(String.valueOf(iHashCode))) {
                                return;
                            }
                        }
                        LIZ(false);
                        return;
                    }
                    if (abstractC1387200mCcLIZIZ instanceof C198S) {
                        zIsFinishing = ((C198S) abstractC1387200mCcLIZIZ).LIZLLL.mViewDestroyed;
                    } else {
                        throw new C1954807lC();
                    }
                }
                if (!zIsFinishing) {
                    return;
                }
                LIZ(false);
                return;
            }
            return;
        }
        if (context == null || (c19egLIZIZ = C1388190mED.LIZIZ(context)) == null || !c19egLIZIZ.isFinishing()) {
            return;
        }
        LIZ(false);
    }

    public C1185440gxC(Lifecycle lifecycle, AwS632S0100000_18 awS632S0100000_18, boolean z, C1185050gwZ c1185050gwZ) {
        this.LIZ = awS632S0100000_18;
        this.LIZIZ = z;
        this.LIZJ = c1185050gwZ;
        C1906580ziK.LIZJ().LIZ().LJLLLL(lifecycle, new AfS187S0100000_18(this, 86));
    }
}
