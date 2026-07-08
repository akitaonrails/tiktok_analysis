package X;

import com.bytedance.ies.im.core.api.proxy.IIMCoreProxyService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0YQz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C874150YQz {
    public static final C874150YQz LIZ = new C874150YQz();
    public static final ConcurrentHashMap<String, C0YR4> LIZIZ = new ConcurrentHashMap<>();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v24, types: [X.0YE6] */
    /* JADX WARN: Type inference failed for: r0v29, types: [X.0YDh] */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.0Yaj] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    public static List LIZ(C0Y8T c0y8t, EnumC880090Yfn enumC880090Yfn) {
        boolean z;
        C0Y8T c0y8tLIZ;
        ?? r6;
        List listLLILII;
        C0YHX c0yhxLIZ;
        ?? LJIILIIL;
        if (c0y8t.isGroupChat()) {
            ?? conversationId = c0y8t.getConversationId();
            boolean z2 = true;
            if (conversationId.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z || (c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(conversationId)) == null) {
                listLLILII = C13BV.INSTANCE;
            } else {
                if (!c0y8tLIZ.isGroupChat()) {
                    z2 = false;
                }
                if (!z2 || c0y8tLIZ.getUnreadCount() <= 0) {
                    listLLILII = C13BV.INSTANCE;
                } else {
                    long jMax = Math.max(c0y8tLIZ.getMinIndex(), c0y8tLIZ.getReadIndex());
                    ConcurrentHashMap<String, C0YR4> concurrentHashMap = LIZIZ;
                    C0YR4 c0yr4 = concurrentHashMap.get(c0y8tLIZ.getConversationId());
                    if (c0yr4 == null) {
                        c0yr4 = new C0YR4(3);
                    }
                    if (!c0yr4.LIZ) {
                        C0YR4 c0yr42 = concurrentHashMap.get(c0y8tLIZ.getConversationId());
                        if (c0yr42 == null) {
                            c0yr42 = new C0YR4(3);
                        }
                        listLLILII = c0yr42.LIZIZ;
                        if (listLLILII == null) {
                            listLLILII = C13BV.INSTANCE;
                        }
                    } else {
                        C054G c054g = C0YR3.LIZ;
                        try {
                            C0YNQ c0ynq = InterfaceC1755906uD.LIZ;
                            C0YM2 c0ym2 = C0YM2.TIKTOK_SOCIAL_IM;
                            c0ynq.getClass();
                            conversationId = ((C0YNW) C0YUC.LIZ(c0ym2)).LIZ.LJIIJ().LLILZ(conversationId);
                            r6 = conversationId;
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            ?? LIZ2 = C2188811AlT.LIZ();
                            LIZ2.append("ImportantMsgKvOperator.getImportantMsgUUidListByConvId - error for conversationId: ");
                            LIZ2.append(conversationId);
                            C2188811AlT.LIZIZ(LIZ2);
                            r6 = C13BV.INSTANCE;
                        }
                        IIMCoreProxyService iIMCoreProxyService = (IIMCoreProxyService) PluggableExtentionKt.pluggableSpiForReal(IIMCoreProxyService.class);
                        if (iIMCoreProxyService != null && (c0yhxLIZ = iIMCoreProxyService.LIZ(C0YM2.TIKTOK_SOCIAL_IM)) != null && (LJIILIIL = c0yhxLIZ.LJIILIIL()) != 0) {
                            listLLILII = LJIILIIL.LLILII(jMax, r6);
                        } else {
                            listLLILII = null;
                        }
                        ConcurrentHashMap<String, C0YR4> concurrentHashMap2 = LIZIZ;
                        if (concurrentHashMap2.get(c0y8tLIZ.getConversationId()) == null) {
                            new C0YR4(3);
                        }
                        concurrentHashMap2.put(c0y8tLIZ.getConversationId(), new C0YR4(false, listLLILII));
                        if (listLLILII == null) {
                            listLLILII = C13BV.INSTANCE;
                        }
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : listLLILII) {
                if (Intrinsics.LJFF(((C869590Y9l) obj).getExt().get("a:group_important_type"), enumC880090Yfn.getValue())) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
        return C13BV.INSTANCE;
    }
}
