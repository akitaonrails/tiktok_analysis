package X;

import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tts.pigeon.paas.detailpage.container.PigeonConversationDetailContainer;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0YYh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C876050YYh {
    public static final int LJ(int i) {
        if (i == 0 || i == 1) {
            return 100;
        }
        if (i == 2 || i == 5) {
            return 200;
        }
        return DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL;
    }

    public static final String LJFF(long j) {
        if (j == 0) {
            return "";
        }
        return String.valueOf(j);
    }

    public static final Object LIZLLL(PigeonConversationDetailContainer pigeonConversationDetailContainer, C19719912Dl c19719912Dl) {
        Object c098200Yq;
        try {
            c098200Yq = pigeonConversationDetailContainer.LJJJJL(c19719912Dl);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            return null;
        }
        return c098200Yq;
    }

    public static final <T extends XBaseResultModel> void LIZ(final AbstractC1549150qPp<?, ?> abstractC1549150qPp, final CompletionBlock<T> completionBlock, final String str, final String str2, final String str3, InterfaceC1631630sYr<? super String, ? super PigeonConversationDetailContainer, ? super C0YXO, ? super CompletionBlock<T>, Unit> interfaceC1631630sYr) {
        boolean z;
        String containerID;
        C1018703yb.LIZIZ("pigeon_jsb_invoke_start", C2097608Jq.LJIIIIZZ(new Pair("client", str), new Pair("container_id", str2), new Pair("name", abstractC1549150qPp.getName()), new Pair("conversation_id", str3)));
        final long jCurrentTimeMillis = System.currentTimeMillis();
        CompletionBlock completionBlock2 = new CompletionBlock<T>() { // from class: X.0YXz
            /* JADX WARN: Incorrect types in method signature: (TT;)V */
            @Override // com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock
            public final void onRawSuccess(XBaseResultModel xBaseResultModel) {
                completionBlock.onRawSuccess(xBaseResultModel);
            }

            /* JADX WARN: Incorrect types in method signature: (TT;Ljava/lang/String;)V */
            @Override // com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock
            public final void onSuccess(XBaseResultModel xBaseResultModel, String str4) {
                Integer numValueOf;
                C0YYC msg;
                List<InterfaceC875850YXn> msgList;
                String uuid = null;
                if ((xBaseResultModel instanceof InterfaceC875860YXo) && (msgList = ((InterfaceC875860YXo) xBaseResultModel).getMsgList()) != null) {
                    numValueOf = Integer.valueOf(msgList.size());
                } else {
                    numValueOf = null;
                }
                if ((xBaseResultModel instanceof InterfaceC875780YXg) && (msg = ((InterfaceC875780YXg) xBaseResultModel).getMsg()) != null) {
                    uuid = msg.getMsgId();
                }
                if (xBaseResultModel instanceof InterfaceC875870YXp) {
                    uuid = ((InterfaceC875870YXp) xBaseResultModel).getUuid();
                }
                C876050YYh.LIZJ(abstractC1549150qPp, str, str2, jCurrentTimeMillis, str3, 1, uuid, numValueOf);
                completionBlock.onSuccess(xBaseResultModel, str4);
            }

            /* JADX WARN: Incorrect types in method signature: (ILjava/lang/String;TT;)V */
            @Override // com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock
            public final void onFailure(int i, String str4, XBaseResultModel xBaseResultModel) {
                C876050YYh.LIZJ(abstractC1549150qPp, str, str2, jCurrentTimeMillis, str3, i, null, null);
                completionBlock.onFailure(i, str4, xBaseResultModel);
            }
        };
        if (str2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C2382909Vj.LIZ(completionBlock2, 1002, "pigeonBizContainerId is empty", null, 4);
            return;
        }
        if (str.length() == 0) {
            C2382909Vj.LIZ(completionBlock2, 1011, "tenantID is empty", null, 4);
            return;
        }
        InterfaceC634840OvC interfaceC634840OvC = abstractC1549150qPp.IBridgeSdkContext;
        if (interfaceC634840OvC != null && (containerID = interfaceC634840OvC.getContainerID()) != null) {
            C01GW<C1537410q6t> c01gw = C1537410q6t.LJIIIZ;
            Object objLIZLLL = C1161970gLL.LIZIZ().LIZLLL(PigeonConversationDetailContainer.class, containerID);
            if (objLIZLLL == null) {
                C2382909Vj.LIZ(completionBlock2, 1004, "conversation detail container not found", null, 4);
                return;
            }
            Object objLIZLLL2 = C1161970gLL.LIZIZ().LIZLLL(C0YXO.class, containerID);
            if (objLIZLLL2 == null) {
                C2382909Vj.LIZ(completionBlock2, 1003, "pigeon tenant not found", null, 4);
                return;
            } else {
                interfaceC1631630sYr.invoke(containerID, objLIZLLL, objLIZLLL2, completionBlock2);
                return;
            }
        }
        C2382909Vj.LIZ(completionBlock2, 1009, "containerID is null", null, 4);
    }

    public static final void LIZJ(AbstractC1549150qPp<?, ?> abstractC1549150qPp, String str, String str2, long j, String str3, int i, String str4, Integer num) {
        Pair[] pairArr = new Pair[8];
        int iIntValue = 0;
        pairArr[0] = new Pair("client", str);
        pairArr[1] = new Pair("container_id", str2);
        pairArr[2] = new Pair("name", abstractC1549150qPp.getName());
        pairArr[3] = new Pair("duration", Long.valueOf(System.currentTimeMillis() - j));
        if (str3 == null) {
            str3 = "";
        }
        pairArr[4] = new Pair("conversation_id", str3);
        if (str4 == null) {
            str4 = "";
        }
        pairArr[5] = new Pair("msg_id", str4);
        pairArr[6] = new Pair("status_code", Integer.valueOf(i));
        if (num != null) {
            iIntValue = num.intValue();
        }
        pairArr[7] = new Pair("msg_list_count", Integer.valueOf(iIntValue));
        C1018703yb.LIZIZ("pigeon_jsb_invoke_end", C2097608Jq.LJIIIIZZ(pairArr));
    }
}
