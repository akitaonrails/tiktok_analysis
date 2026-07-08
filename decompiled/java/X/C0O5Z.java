package X;

import com.bytedance.mota.storage.motacache.IMotaCache;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.0O5Z, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C0O5Z extends C2217421BqW implements InterfaceC1631620sYq<String, C0O3E, Boolean, List<? extends IMotaCache>> {
    public C0O5Z(Object obj) {
        super(3, obj, C0O5V.class, "convertMutationToMotaCache", "convertMutationToMotaCache(Ljava/lang/String;Lcom/bytedance/mota/Mutation$Data;Z)Ljava/util/List;", 0);
    }

    @Override // X.InterfaceC1631620sYq
    public final List<? extends IMotaCache> invoke(String str, C0O3E c0o3e, Boolean bool) {
        Object objCurrentState;
        String str2 = str;
        boolean zBooleanValue = bool.booleanValue();
        C0O5V c0o5v = (C0O5V) this.receiver;
        c0o5v.getClass();
        if (zBooleanValue) {
            objCurrentState = c0o5v.LJ(c0o5v.currentState(str2, c0o5v.defaultState()));
        } else {
            objCurrentState = c0o5v.currentState(str2, c0o5v.defaultState());
        }
        IMotaCache iMotaCacheLIZIZ = c0o5v.LIZIZ(objCurrentState, str2);
        if (iMotaCacheLIZIZ != null) {
            return Collections.singletonList(iMotaCacheLIZIZ);
        }
        return C13BV.INSTANCE;
    }
}
