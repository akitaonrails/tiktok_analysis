package X;

import com.ss.android.ugc.aweme.inbox.bulletin.assem.BulletinBoardPageHybridAssem;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0OTx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C620110OTx extends C2217421BqW implements Function1<String, Map<String, ? extends Object>> {
    public C620110OTx(Object obj) {
        super(1, obj, BulletinBoardPageHybridAssem.class, "getExtraParamsByTaskName", "getExtraParamsByTaskName$awemenotice_release(Ljava/lang/String;)Ljava/util/Map;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Map<String, ? extends Object> invoke(String str) {
        return ((BulletinBoardPageHybridAssem) this.receiver).No(str);
    }
}
