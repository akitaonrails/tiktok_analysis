package X;

import Y.AComparatorS43S0000000_24;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.configuration.models.NUAbilityNode;
import com.ss.android.ugc.aweme.plugin.IPluginService;
import defpackage.f9;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.10QF, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10QF {
    public boolean LIZ;
    public NUAbilityNode LIZIZ;

    public final NUAbilityNode LIZ() {
        NUAbilityNode nUAbilityNode;
        NUAbilityNode nUAbilityNode2 = this.LIZIZ;
        if (nUAbilityNode2 != null) {
            return nUAbilityNode2;
        }
        f9.LIZ.getClass();
        List<IPluginService.NUStrategy> list = f9.LIZLLL;
        if (list == null) {
            return new NUAbilityNode(null, null, null, null, Collections.singletonList(""), Collections.singletonList(""), null, 79, null);
        }
        List<IPluginService.NUStrategy> listLJLLLL = C13LP.LJLLLL(new AComparatorS43S0000000_24(19), list);
        if (listLJLLLL != null) {
            for (IPluginService.NUStrategy nUStrategy : listLJLLLL) {
                C10QG c10qg = C10QG.LIZ;
                String str = nUStrategy.strategyData;
                c10qg.getClass();
                if (str != null) {
                    try {
                        nUAbilityNode = (NUAbilityNode) C7740030o.LIZ().getGson().LJII(str, NUAbilityNode.class);
                        if (nUAbilityNode == null) {
                            continue;
                        } else {
                            List<String> list2 = nUAbilityNode.targetLink;
                            if (list2 != null) {
                                Iterator<String> it2 = list2.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        break;
                                    }
                                    String next = it2.next();
                                    C10SW c10sw = C10SW.LIZ;
                                    String strValueOf = String.valueOf(C010O.LIZ);
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("tiktok://");
                                    sbLIZ.append(next);
                                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                                    c10sw.getClass();
                                    Uri uriLJIIZILJ = C10SW.LJIIZILJ(UriProtector.parse(strValueOf));
                                    Uri uriLJIIZILJ2 = C10SW.LJIIZILJ(UriProtector.parse(strLIZIZ));
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append(uriLJIIZILJ.getHost());
                                    sbLIZ2.append(uriLJIIZILJ.getPath());
                                    String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                    sbLIZ3.append(uriLJIIZILJ2.getHost());
                                    sbLIZ3.append(uriLJIIZILJ2.getPath());
                                    if (Intrinsics.LJFF(strLIZIZ2, C2188811AlT.LIZIZ(sbLIZ3))) {
                                        Set<String> queryParameterNames = UriProtector.getQueryParameterNames(uriLJIIZILJ);
                                        Set<String> queryParameterNames2 = UriProtector.getQueryParameterNames(uriLJIIZILJ2);
                                        if (queryParameterNames.size() >= queryParameterNames2.size()) {
                                            for (String str2 : queryParameterNames2) {
                                                if (!Intrinsics.LJFF(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uriLJIIZILJ, str2), UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uriLJIIZILJ2, str2))) {
                                                    break;
                                                }
                                            }
                                            if (next != null) {
                                                if (!nUAbilityNode.functions.isEmpty()) {
                                                    C10OE.LIZIZ = true;
                                                }
                                                C10OE.LIZ = true;
                                                C0C5P c0c5pLIZJ = C0C5P.LIZJ();
                                                String str3 = nUStrategy.abExposeVid;
                                                c0c5pLIZJ.getClass();
                                                C0C5P.LIZ(str3);
                                            }
                                        } else {
                                            continue;
                                        }
                                    }
                                }
                            }
                            List<String> list3 = nUAbilityNode.targetLink;
                            if (list3 != null && list3.isEmpty()) {
                                if (!nUAbilityNode.functions.isEmpty()) {
                                    C10OE.LIZIZ = true;
                                }
                                C10OE.LIZ = true;
                                C0C5P c0c5pLIZJ2 = C0C5P.LIZJ();
                                String str4 = nUStrategy.abExposeVid;
                                c0c5pLIZJ2.getClass();
                                C0C5P.LIZ(str4);
                            }
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
            }
            nUAbilityNode = new NUAbilityNode(null, null, null, null, Collections.singletonList(""), Collections.singletonList(""), null, 79, null);
        } else {
            nUAbilityNode = new NUAbilityNode(null, null, null, null, Collections.singletonList(""), Collections.singletonList(""), null, 79, null);
        }
        if (nUAbilityNode.id.length() != 0) {
            this.LIZIZ = nUAbilityNode;
        }
        return nUAbilityNode;
    }
}
