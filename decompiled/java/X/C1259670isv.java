package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.p;
import com.google.gson.q;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0isv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1259670isv {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Aweme aweme, boolean z, boolean z2) {
        boolean z3;
        AnchorCommonStruct next;
        boolean zBooleanValue;
        n nVar;
        Object obj;
        Object c098200Yq;
        List<AnchorCommonStruct> anchors = aweme.getAnchors();
        if (anchors != null) {
            Iterator<AnchorCommonStruct> it2 = anchors.iterator();
            do {
                z3 = true;
                next = null;
                zBooleanValue = false;
                if (!it2.hasNext()) {
                    break;
                } else {
                    next = it2.next();
                }
            } while (next.getType() != EnumC1430380nKG.SHORT_DRAMA_RESERVE.getTYPE());
            AnchorCommonStruct anchorCommonStruct = next;
            if (anchorCommonStruct != null) {
                try {
                    new p();
                    nVar = p.LIZJ(anchorCommonStruct.getExtra()).LJIILIIL();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    nVar = new n();
                }
                k kVarLJJIIZ = nVar.LJJIIZ("is_reserved");
                if (kVarLJJIIZ != null && (kVarLJJIIZ instanceof q)) {
                    try {
                        if (kVarLJJIIZ.LJIIJJI() == 0) {
                            z3 = false;
                        }
                        Boolean boolValueOf = Boolean.valueOf(z3);
                        C189200o6.m2constructorimpl(boolValueOf);
                        obj = boolValueOf;
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        C098200Yq c098200Yq2 = new C098200Yq(th2);
                        C189200o6.m2constructorimpl(c098200Yq2);
                        obj = c098200Yq2;
                    }
                    Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(obj);
                    Object objValueOf = obj;
                    if (thM5exceptionOrNullimpl != null) {
                        try {
                            c098200Yq = Boolean.valueOf(kVarLJJIIZ.LJ());
                            C189200o6.m2constructorimpl(c098200Yq);
                        } catch (Throwable th3) {
                            TryCatchGuardChecker.doCheck(th3);
                            c098200Yq = new C098200Yq(th3);
                            C189200o6.m2constructorimpl(c098200Yq);
                        }
                        Boolean bool = Boolean.FALSE;
                        if (C189200o6.m7isFailureimpl(c098200Yq)) {
                            c098200Yq = bool;
                        }
                        objValueOf = Boolean.valueOf(((Boolean) c098200Yq).booleanValue());
                    }
                    zBooleanValue = ((Boolean) objValueOf).booleanValue();
                }
                if (zBooleanValue == z) {
                    return;
                }
                nVar.LJJIII(Integer.valueOf(z ? 1 : 0), "is_reserved");
                anchorCommonStruct.setExtra(nVar.toString());
                if (z2) {
                    C1440005kM.LIZ(new C2038007yc("fallback", Collections.singletonList("sync_state_action_timing"), C0RY8.LIZ(aweme.getAid())));
                }
            }
        }
    }
}
