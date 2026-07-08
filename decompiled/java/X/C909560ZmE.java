package X;

import com.google.gson.Gson;
import com.google.gson.e;
import com.ss.android.ugc.aweme.im.strategy.storage.StrategyConfigDataTypeAdapterFactory;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0ZmE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C909560ZmE extends C09AY implements Function0<Gson> {
    public C909560ZmE() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Gson invoke() {
        e eVar = new e();
        ((ArrayList) eVar.LJ).add(StrategyConfigDataTypeAdapterFactory.LL);
        return eVar.LIZ();
    }
}
