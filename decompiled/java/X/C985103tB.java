package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.h;
import com.google.gson.k;
import com.google.gson.n;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03tB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C985103tB extends C2217421BqW implements Function1<n, n> {
    public C985103tB(AbstractC677500Qho abstractC677500Qho) {
        super(1, abstractC677500Qho, AbstractC677500Qho.class, "trimChunkDataForFilterCache", "trimChunkDataForFilterCache(Lcom/google/gson/JsonObject;)Lcom/google/gson/JsonObject;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final n invoke(n nVar) {
        Object c098200Yq;
        Object c098200Yq2;
        Object c098200Yq3;
        Object c098200Yq4;
        Object c098200Yq5;
        String strLJIL;
        this.receiver.getClass();
        n nVarLIZJ = nVar.LIZJ();
        try {
            c098200Yq = nVarLIZJ.LJJIJ("body");
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        n nVar2 = (n) c098200Yq;
        if (nVar2 != null) {
            try {
                c098200Yq2 = nVar2.LJJIIZI("sections");
                C189200o6.m2constructorimpl(c098200Yq2);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                c098200Yq2 = new C098200Yq(th2);
                C189200o6.m2constructorimpl(c098200Yq2);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq2)) {
                c098200Yq2 = null;
            }
            h hVar = (h) c098200Yq2;
            if (hVar != null) {
                h hVar2 = new h();
                Iterator<k> it2 = hVar.iterator();
                while (it2.hasNext()) {
                    try {
                        c098200Yq3 = it2.next().LJIILIIL();
                        C189200o6.m2constructorimpl(c098200Yq3);
                    } catch (Throwable th3) {
                        TryCatchGuardChecker.doCheck(th3);
                        c098200Yq3 = new C098200Yq(th3);
                        C189200o6.m2constructorimpl(c098200Yq3);
                    }
                    if (C189200o6.m7isFailureimpl(c098200Yq3)) {
                        c098200Yq3 = null;
                    }
                    n nVar3 = (n) c098200Yq3;
                    if (nVar3 != null) {
                        try {
                            c098200Yq4 = nVar3.LJJIIZI("items");
                            C189200o6.m2constructorimpl(c098200Yq4);
                        } catch (Throwable th4) {
                            TryCatchGuardChecker.doCheck(th4);
                            c098200Yq4 = new C098200Yq(th4);
                            C189200o6.m2constructorimpl(c098200Yq4);
                        }
                        if (C189200o6.m7isFailureimpl(c098200Yq4)) {
                            c098200Yq4 = null;
                        }
                        Iterable iterable = (h) c098200Yq4;
                        if (iterable != null && (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty())) {
                            Iterator<k> it3 = iterable.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    try {
                                        k kVarLJJIIZ = it3.next().LJIILIIL().LJJIIZ("item_id");
                                        if (kVarLJJIIZ != null) {
                                            strLJIL = kVarLJJIIZ.LJIL();
                                        } else {
                                            strLJIL = null;
                                        }
                                        c098200Yq5 = Boolean.valueOf(Intrinsics.LJFF(strLJIL, "BFF_BIZ_TYPE_FILTER"));
                                        C189200o6.m2constructorimpl(c098200Yq5);
                                    } catch (Throwable th5) {
                                        TryCatchGuardChecker.doCheck(th5);
                                        c098200Yq5 = new C098200Yq(th5);
                                        C189200o6.m2constructorimpl(c098200Yq5);
                                    }
                                    Boolean bool = Boolean.FALSE;
                                    if (C189200o6.m7isFailureimpl(c098200Yq5)) {
                                        c098200Yq5 = bool;
                                    }
                                    if (((Boolean) c098200Yq5).booleanValue()) {
                                        hVar2.LJJIFFI(nVar3);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
                nVar2.LJJIFFI("sections", hVar2);
            }
        }
        return nVarLIZJ;
    }
}
