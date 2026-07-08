package X;

import com.ss.android.ugc.aweme.aigc.graph.net.ImageInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.AwS124S1200000_8;
import kotlin.jvm.internal.AwS374S0200000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS587S0100000_8;
import kotlin.jvm.internal.AwS59S1000000_8;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0LjJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C551030LjJ {
    /* JADX WARN: Removed duplicated region for block: B:7:0x000d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String LIZLLL(java.lang.String r5, java.lang.String r6) {
        /*
            java.lang.String r4 = "resource_key"
            X.01sO r3 = X.C470601sO.LIZ
            if (r5 == 0) goto Ld
            int r0 = r5.length()     // Catch: java.lang.Throwable -> L29
            if (r0 == 0) goto Ld
            goto Lf
        Ld:
            r0 = 1
            goto L10
        Lf:
            r0 = 0
        L10:
            if (r0 == 0) goto L13
            goto L19
        L13:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L29
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L29
            goto L1e
        L19:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L29
            r0.<init>()     // Catch: java.lang.Throwable -> L29
        L1e:
            r0.put(r4, r6)     // Catch: java.lang.Throwable -> L29
            java.lang.String r2 = X.C786410Ut5.J3(r0)     // Catch: java.lang.Throwable -> L29
            X.C189200o6.m2constructorimpl(r2)     // Catch: java.lang.Throwable -> L29
            goto L3f
        L29:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            boolean r0 = r1 instanceof java.util.concurrent.CancellationException
            if (r0 != 0) goto L56
            r3.getClass()
            X.C470601sO.LIZ(r1)
            X.00Yq r2 = new X.00Yq
            r2.<init>(r1)
            X.C189200o6.m2constructorimpl(r2)
        L3f:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            org.json.JSONObject r0 = r0.put(r4, r6)
            java.lang.String r1 = X.C786410Ut5.J3(r0)
            boolean r0 = X.C189200o6.m7isFailureimpl(r2)
            if (r0 == 0) goto L53
            r2 = r1
        L53:
            java.lang.String r2 = (java.lang.String) r2
            return r2
        L56:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C551030LjJ.LIZLLL(java.lang.String, java.lang.String):java.lang.String");
    }

    public static final <T> void LIZ(C551080LjO c551080LjO, AbstractC551020LjI<C550580Lia<T>> abstractC551020LjI, String str, Function1<? super JSONObject, Unit> function1) {
        c551080LjO.LIZ(C552750Lm5.INSTANCE, new AwS552S0100000_8(abstractC551020LjI.LIZ().LIZ, 1021));
        c551080LjO.LIZ(C552550Lll.INSTANCE, new AwS552S0100000_8(abstractC551020LjI, 1022));
        c551080LjO.LIZ(C552560Llm.INSTANCE, new AwS552S0100000_8(abstractC551020LjI, 1023));
        c551080LjO.LIZ(C552540Llk.INSTANCE, new AwS124S1200000_8((AbstractC551020LjI) abstractC551020LjI, str, (String) function1, (Function1<? super JSONObject, Unit>) 7));
    }

    public static final <T> void LIZJ(C551080LjO c551080LjO, C545510LaP<C550580Lia<T>> c545510LaP, String str, Function1<? super JSONObject, Unit> function1) {
        LIZ(c551080LjO, c545510LaP, str, new AwS374S0200000_8(c545510LaP, function1, (Function1<? super JSONObject, Unit>) 200));
        c551080LjO.LIZ(C552580Llo.INSTANCE, new AwS552S0100000_8((C545510LaP) c545510LaP, 1024));
        c551080LjO.LIZ(C552600Llq.INSTANCE, new AwS552S0100000_8((C545510LaP) c545510LaP, 1025));
        c551080LjO.LIZ(C552590Llp.INSTANCE, new AwS552S0100000_8((C545510LaP) c545510LaP, 1026));
        c551080LjO.LIZ(C552460Llc.INSTANCE, new AwS552S0100000_8((C545510LaP) c545510LaP, 1027));
        c551080LjO.LIZ(C552470Lld.INSTANCE, new AwS552S0100000_8((C545510LaP) c545510LaP, 1028));
        List<C544530LXf> list = c545510LaP.LIZIZ;
        ArrayList arrayList = new ArrayList();
        for (C544530LXf c544530LXf : list) {
            if (c544530LXf.LIZIZ == 2) {
                arrayList.add(c544530LXf);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C544540LXg c544540LXg = ((C544530LXf) it2.next()).LJ;
            if (c544540LXg != null) {
                arrayList2.add(new ImageInfo("", c544540LXg.LIZ, c544540LXg.LIZIZ, c544540LXg.LIZJ, c544540LXg.LIZLLL));
            }
        }
        if (!arrayList2.isEmpty()) {
            c551080LjO.LIZ(C552490Llf.INSTANCE, new AwS552S0100000_8(arrayList2, (List<String>) 1029));
        }
    }

    public static final C551100LjQ LIZIZ(C552770Lm7 c552770Lm7, CreativeInfo creativeInfo, boolean z, boolean z2, C550560LiY c550560LiY, Function1<? super C552770Lm7, C551120LjS> function1) {
        C551120LjS c551120LjSLIZ;
        C551120LjS c551120LjSLIZ2 = null;
        String strLJ = C2298208zU.LJ(C0CHQ.LIZ().LJJIIJZLJL().getPathService(), creativeInfo, C0MI0.OFFLINE_PROCESSING, null, 12);
        if (!z) {
            c551120LjSLIZ = c552770Lm7.LIZ(new C552000Lks(), new AwS587S0100000_8(c550560LiY, 634));
        } else {
            c551120LjSLIZ = null;
        }
        if (!z2) {
            c551120LjSLIZ2 = c552770Lm7.LIZ(new C551780LkW(), AFwS239S0000000_8.get$arr$(281));
        }
        return new C551100LjQ(c551120LjSLIZ, c551120LjSLIZ2, function1.invoke(c552770Lm7), c552770Lm7.LIZ(new C551760LkU(), new AwS587S0100000_8(c550560LiY, 633)), c552770Lm7.LIZ(new C552040Lkw(), new AwS59S1000000_8(strLJ, 16)));
    }
}
