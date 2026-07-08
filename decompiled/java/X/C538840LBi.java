package X;

import com.ss.android.ugc.aweme.aigc.asynctask.AIGCPushMessage;
import com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0LBi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C538840LBi extends C2217421BqW implements Function1<InnerPushMessage, Boolean> {
    public C538840LBi(C538790LBd c538790LBd) {
        super(1, c538790LBd, C538790LBd.class, "shouldBlock", "shouldBlock(Lcom/ss/android/ugc/aweme/innerpush/api/model/InnerPushMessage;)Z", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(InnerPushMessage innerPushMessage) {
        EnumC545550LaT enumC545550LaT;
        InnerPushMessage innerPushMessage2 = innerPushMessage;
        C538790LBd c538790LBd = (C538790LBd) this.receiver;
        c538790LBd.getClass();
        AIGCPushMessage aIGCPushMessageLIZ = C538800LBe.LIZ(innerPushMessage2.getBizExtraJsonStr());
        boolean z = true;
        if (aIGCPushMessageLIZ != null) {
            String str = aIGCPushMessageLIZ.creationId;
            EnumC545550LaT enumC545550LaT2 = null;
            if (((LinkedHashMap) c538790LBd.LLILLJJLI).get(str) == null) {
                c538790LBd.LLILLJJLI.put(str, new C538810LBf(null, null, null, 31));
                ICreationAsyncTaskManager iCreationAsyncTaskManagerLIZ = C09BV.LIZ();
                if (iCreationAsyncTaskManagerLIZ != null && iCreationAsyncTaskManagerLIZ.LJIILIIL() != null) {
                    C0LCT.LIZJ(aIGCPushMessageLIZ);
                }
                C563650M8t c563650M8t = C563650M8t.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("push handler blocked (first message), type: ");
                sbLIZ.append(innerPushMessage2.getType());
                sbLIZ.append(", creationId: ");
                sbLIZ.append(str);
                C201955140j.LIZLLL(c563650M8t, "CreationAsyncTask", C2188811AlT.LIZIZ(sbLIZ));
            } else {
                C538810LBf c538810LBf = (C538810LBf) ((LinkedHashMap) c538790LBd.LLILLJJLI).get(str);
                if (c538810LBf != null) {
                    enumC545550LaT = c538810LBf.LIZ;
                } else {
                    enumC545550LaT = null;
                }
                if (enumC545550LaT != EnumC545550LaT.PROCESSING) {
                    z = false;
                }
                C563650M8t c563650M8t2 = C563650M8t.LIZIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("push handler check, creationId: ");
                sbLIZ2.append(str);
                sbLIZ2.append(", status: ");
                C538810LBf c538810LBf2 = (C538810LBf) ((LinkedHashMap) c538790LBd.LLILLJJLI).get(str);
                if (c538810LBf2 != null) {
                    enumC545550LaT2 = c538810LBf2.LIZ;
                }
                sbLIZ2.append(enumC545550LaT2);
                sbLIZ2.append(", blocked: ");
                sbLIZ2.append(z);
                C201955140j.LIZLLL(c563650M8t2, "CreationAsyncTask", C2188811AlT.LIZIZ(sbLIZ2));
            }
        }
        return Boolean.valueOf(z);
    }
}
