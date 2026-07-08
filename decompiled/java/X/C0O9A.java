package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0O9A, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0O9A extends C0O9C {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Object c098200Yq;
        int i;
        C0O9E c0o9e = (C0O9E) xBaseParamModel;
        String awemeId = c0o9e.getAwemeId();
        String containerID = null;
        if (!(!a0.LJJJIL(awemeId))) {
            awemeId = null;
        }
        if (awemeId == null) {
            C2382909Vj.LIZ(completionBlock, 0, "invalid awemeId", null, 4);
            return;
        }
        Integer numValueOf = Integer.valueOf(c0o9e.getTargetUserDigg().intValue());
        int iIntValue = numValueOf.intValue();
        if (iIntValue != 0 && iIntValue != 1) {
            C2382909Vj.LIZ(completionBlock, 0, "invalid targetUserDigg (expect 0 or 1)", null, 4);
            return;
        }
        String enterFrom = c0o9e.getEnterFrom();
        if (enterFrom == null || !(!a0.LJJJIL(enterFrom))) {
            enterFrom = "search_result";
        }
        C651640PhC.LIZIZ.LJIIIZ(numValueOf, awemeId);
        HashMap mapLJI = C2097608Jq.LJI(new Pair("aweme_id", awemeId), new Pair("type", numValueOf.toString()), new Pair("channel_id", CardStruct.IStatusCode.DEFAULT), new Pair("enter_from", enterFrom), new Pair("friends_upvote", "false"));
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        }
        try {
            new C0O99().LLILLJJLI.LLJJJJJIL(mapLJI, new C0O9D(completionBlock, containerID, atomicBoolean), new C0O9B(completionBlock, numValueOf, awemeId, containerID, atomicBoolean));
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) == null) {
            return;
        }
        if (numValueOf.intValue() == 1) {
            i = 0;
        } else {
            i = 1;
        }
        C651640PhC.LIZIZ.LJIIIZ(Integer.valueOf(i), awemeId);
        if (!atomicBoolean.compareAndSet(false, true)) {
            return;
        }
        XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(C0O9F.class, containerID);
        ((C0O9F) xBaseModelLIZJ).setSuccess(Boolean.FALSE);
        completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
    }
}
