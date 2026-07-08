package X;

import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0LC7, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C0LC7 extends C2217421BqW implements Function1<InnerPushMessage, Boolean> {
    public C0LC7(C0LC5 c0lc5) {
        super(1, c0lc5, C0LC5.class, "shouldBlockShow", "shouldBlockShow(Lcom/ss/android/ugc/aweme/innerpush/api/model/InnerPushMessage;)Z", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(InnerPushMessage innerPushMessage) {
        String str;
        EnumC545550LaT enumC545550LaT;
        C0LC5 c0lc5 = (C0LC5) this.receiver;
        c0lc5.getClass();
        C0L76 c0l76 = C0L76.LIZIZ;
        C201955140j.LIZLLL(c0l76, "AILivePhotoInnerPush", "shouldBlockShow call");
        C0LCA c0lcaLJIILIIL = C0LC5.LJIILIIL(innerPushMessage);
        boolean z = true;
        if (c0lcaLJIILIIL != null && (str = c0lcaLJIILIIL.LIZIZ) != null) {
            C538810LBf c538810LBf = (C538810LBf) ((LinkedHashMap) c0lc5.LL).get(str);
            if (c538810LBf != null) {
                enumC545550LaT = c538810LBf.LIZ;
            } else {
                enumC545550LaT = null;
            }
            if (enumC545550LaT == EnumC545550LaT.COMPLETE && c538810LBf.LIZIZ != null) {
                z = false;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("shouldBlockShow=");
            sbLIZ.append(z);
            C201955140j.LIZLLL(c0l76, "AILivePhotoInnerPush", C2188811AlT.LIZIZ(sbLIZ));
        }
        return Boolean.valueOf(z);
    }
}
