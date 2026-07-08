package X;

import android.content.Context;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0v9c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1731300v9c extends AbstractC1731310v9d {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Context context;
        InterfaceC1731320v9e interfaceC1731320v9e = (InterfaceC1731320v9e) xBaseParamModel;
        long jCurrentTimeMillis = System.currentTimeMillis();
        C1729570v6p.LJFF("start", interfaceC1731320v9e.getTrackParams().getEnterFrom(), interfaceC1731320v9e.getActivityId(), null, null, null, 56);
        interfaceC1731320v9e.getTrackParams().getRoomId();
        interfaceC1731320v9e.getTrackParams().getAuthorId();
        Intrinsics.LJFF(interfaceC1731320v9e.getTrackParams().isNewUser(), 1);
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null && (context = interfaceC634840OvC.getContext()) != null) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C2126308Ur.LIZ), null, null, new C1731290v9b(interfaceC1731320v9e, this, completionBlock, context, jCurrentTimeMillis, null), 3);
        } else {
            LIZJ(interfaceC1731320v9e.getTrackParams().getEnterFrom(), interfaceC1731320v9e.getActivityId(), null, completionBlock, "context is null");
        }
    }

    public final void LIZJ(String str, String str2, Integer num, CompletionBlock<InterfaceC1731340v9g> completionBlock, String str3) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C2126308Ur.LJFF), null, null, new C1474005pq(this, null), 3);
        C2382909Vj.LIZ(completionBlock, 0, str3, null, 4);
        C1729570v6p.LJFF("fail", str, str2, num, null, str3, 16);
    }
}
