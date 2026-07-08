package X;

import android.content.Context;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import com.ss.android.ugc.aweme.legoImp.task.TrackComputedTask;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0WVO, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WVO extends C09AY implements Function0<Unit> {
    public final /* synthetic */ TrackComputedTask LL;
    public final /* synthetic */ Context LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0WVO(TrackComputedTask trackComputedTask, Context context) {
        super(0);
        this.LL = trackComputedTask;
        this.LLILLJJLI = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        TrackComputedTask trackComputedTask = this.LL;
        Context context = this.LLILLJJLI;
        if (context != null) {
            trackComputedTask.getClass();
            String strLIZ = C0W9I.LIZIZ(context).LIZ("release_build", "default_version");
            Keva repo = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME);
            String string = repo.getString("reported_version", "-1");
            String strLJFF = C813020Vuu.LJIIL().LJFF(context, "aot_release_build_version");
            boolean z = repo.getBoolean("has_reported_aot_compile_status", false);
            if (!Intrinsics.LJFF(strLIZ, string)) {
                repo.storeString("reported_version", strLIZ);
                C1150504el.LIZ().LJ(1L, "version_has_updated");
            }
            if (Intrinsics.LJFF(strLIZ, strLJFF) && !z) {
                repo.storeBoolean("has_reported_aot_compile_status", true);
                C1150504el.LIZ().LJ(1L, "dex2oat_has_triggered");
            }
        }
        return Unit.LIZ;
    }
}
