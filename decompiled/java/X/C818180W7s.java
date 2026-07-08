package X;

import android.content.Context;
import android.content.SharedPreferences;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0W7s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C818180W7s extends C09AY implements Function1<C818170W7r, Unit> {
    public final /* synthetic */ Context LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C818180W7s(Context context) {
        super(1);
        this.LL = context;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C818170W7r c818170W7r) {
        SharedPreferences sharedPreferences = C818130W7n.LIZ;
        C818130W7n.LIZ = C810670Vr7.LIZJ(this.LL, 0, "string_patch_manager");
        C818130W7n.LIZJ(NxRewordManager.LIZIZ(), c818170W7r, false);
        return Unit.LIZ;
    }
}
