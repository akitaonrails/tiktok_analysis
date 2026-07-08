package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common.BooleanTypeAdapter;
import com.google.gson.Gson;
import com.google.gson.c;
import com.google.gson.e;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.09EA, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09EA extends C09AY implements Function0<Gson> {
    public C09EA() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Gson invoke() {
        e eVar = new e();
        eVar.LIZJ = c.LOWER_CASE_WITH_UNDERSCORES;
        eVar.LIZJ(new BooleanTypeAdapter(), Boolean.TYPE);
        return eVar.LIZ();
    }
}
