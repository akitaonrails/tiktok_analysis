package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.aigc.asynctask.AIGCPushMessage;
import com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager;
import com.ss.android.ugc.aweme.aigc.asynctask.TaskDetail;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import java.util.Collections;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LCB, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C0LCB extends C2217421BqW implements Function1<InnerPushMessage, Boolean> {
    public C0LCB(C0LC5 c0lc5) {
        super(1, c0lc5, C0LC5.class, "shouldAcceptMessage", "shouldAcceptMessage(Lcom/ss/android/ugc/aweme/innerpush/api/model/InnerPushMessage;)Z", 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(InnerPushMessage innerPushMessage) throws Throwable {
        boolean z;
        this.receiver.getClass();
        C0L76 c0l76 = C0L76.LIZIZ;
        C201955140j.LIZLLL(c0l76, "AILivePhotoInnerPush", "shouldAcceptMessage call");
        C0LCA c0lcaLJIILIIL = C0LC5.LJIILIIL(innerPushMessage);
        if (c0lcaLJIILIIL != null) {
            if (C1906580ziK.LJI()) {
                C201955140j.LIZLLL(c0l76, "AILivePhotoInnerPush", "shouldAcceptMessage, isAppBackground");
            } else if (!Intrinsics.LJFF(c0lcaLJIILIIL.LIZ, "ai_live_photo")) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("shouldAcceptMessage, businessType error=");
                sbLIZ.append(c0lcaLJIILIIL.LIZ);
                C201955140j.LIZLLL(c0l76, "AILivePhotoInnerPush", C2188811AlT.LIZIZ(sbLIZ));
            } else if (C0LCK.LIZ()) {
                C201955140j.LIZLLL(c0l76, "AILivePhotoInnerPush", "shouldAcceptMessage, isInShootPage");
            } else {
                String str = c0lcaLJIILIIL.LIZIZ;
                if (str == null) {
                    C201955140j.LIZLLL(c0l76, "AILivePhotoInnerPush", "shouldAcceptMessage, serverTaskId=null");
                } else {
                    C259800zU c259800zU = new C259800zU();
                    try {
                        C23250099c.LJ(C23271099x.INSTANCE, new C09BZ(str, null, c259800zU));
                        T t = c259800zU.element;
                        if (t == 0) {
                            C201955140j.LIZLLL(c0l76, "AILivePhotoInnerPush", "shouldAcceptMessage, creationId=null");
                        } else if (C0CHQ.LIZ().LJI().LJIILJJIL().LJI(new C558570LvT(new CreativeInfo((String) t, 0, null, 6, null), false, true, true, 2)) == null) {
                            C201955140j.LIZLLL(c0l76, "AILivePhotoInnerPush", "shouldAcceptMessage, draft=null");
                        } else {
                            String str2 = (String) c259800zU.element;
                            if (str2 != null) {
                                AIGCPushMessage aIGCPushMessage = new AIGCPushMessage(str2, 0, Collections.singletonList(new TaskDetail(str, 0, null, 0L, 0L, 0L, null, 0.0f, 0L, null, 1022, null)), 2, null);
                                ICreationAsyncTaskManager iCreationAsyncTaskManagerLIZ = C09BV.LIZ();
                                if (iCreationAsyncTaskManagerLIZ != null && iCreationAsyncTaskManagerLIZ.LJIILIIL() != null) {
                                    C0LCT.LIZJ(aIGCPushMessage);
                                }
                                C201955140j.LIZLLL(c0l76, "AILivePhotoInnerPush", "restoreAsyncTask");
                            }
                            z = true;
                        }
                    } catch (InterruptedException e) {
                        TryCatchGuardChecker.doCheck(e);
                        C201955140j.LJIIIIZZ(C0L76.LIZIZ, "AILivePhotoInnerPush", String.valueOf(e));
                    }
                }
            }
            z = false;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
