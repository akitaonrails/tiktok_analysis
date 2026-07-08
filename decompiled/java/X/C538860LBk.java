package X;

import com.ss.android.ugc.aweme.aigc.asynctask.AIGCPushMessage;
import com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0LBk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C538860LBk extends C2217421BqW implements Function1<InnerPushMessage, Boolean> {
    public C538860LBk(C538870LBl c538870LBl) {
        super(1, c538870LBl, C538870LBl.class, "shouldBlock", "shouldBlock(Lcom/ss/android/ugc/aweme/innerpush/api/model/InnerPushMessage;)Z", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(InnerPushMessage innerPushMessage) {
        boolean z;
        InnerPushMessage innerPushMessage2 = innerPushMessage;
        C538870LBl c538870LBl = (C538870LBl) this.receiver;
        c538870LBl.getClass();
        AIGCPushMessage aIGCPushMessageLIZ = C538880LBm.LIZ(innerPushMessage2.getBizExtraJsonStr());
        if (aIGCPushMessageLIZ != null) {
            String str = aIGCPushMessageLIZ.creationId;
            EnumC545550LaT enumC545550LaT = null;
            if (((LinkedHashMap) c538870LBl.LLILLJJLI).get(str) == null) {
                c538870LBl.LLILLJJLI.put(str, new C538890LBn(null, null, null, 31));
                ICreationAsyncTaskManager iCreationAsyncTaskManagerLIZ = C09BV.LIZ();
                if (iCreationAsyncTaskManagerLIZ != null && iCreationAsyncTaskManagerLIZ.LJIILIIL() != null) {
                    C0LCT.LIZJ(aIGCPushMessageLIZ);
                }
                C538950LBt c538950LBt = C538950LBt.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("push handler is blocked message type: ");
                sbLIZ.append(innerPushMessage2.getType());
                sbLIZ.append(", biz_extra: ");
                sbLIZ.append(innerPushMessage2.getBizExtraJsonStr());
                C201955140j.LIZLLL(c538950LBt, "EditorProAIGCServiceImpl", C2188811AlT.LIZIZ(sbLIZ));
            } else {
                C538890LBn c538890LBn = (C538890LBn) ((LinkedHashMap) c538870LBl.LLILLJJLI).get(str);
                if (c538890LBn != null) {
                    enumC545550LaT = c538890LBn.LIZ;
                }
                if (enumC545550LaT != EnumC545550LaT.PROCESSING) {
                    z = false;
                }
            }
            z = true;
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
