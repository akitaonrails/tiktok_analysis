package X;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.util.Size;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.social.creation.api.mediapicker.EnterStoryParam;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS252S0300000_8;
import kotlin.jvm.internal.AwS9S0300100_8;

/* JADX INFO: renamed from: X.0L6L, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0L6L extends C09AY implements Function2<Boolean, C0L9U, Unit> {
    public final /* synthetic */ C563770M9f LL;
    public final /* synthetic */ Activity LLILLJJLI;
    public final /* synthetic */ EnterStoryParam LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ Function0<Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0L6L(C563770M9f c563770M9f, Activity activity, EnterStoryParam enterStoryParam, long j, AwS252S0300000_8 awS252S0300000_8) {
        super(2);
        this.LL = c563770M9f;
        this.LLILLJJLI = activity;
        this.LLILLL = enterStoryParam;
        this.LLILZ = j;
        this.LLILZIL = awS252S0300000_8;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Boolean bool, C0L9U c0l9u) {
        boolean z;
        C0L9U c0l9u2 = c0l9u;
        if (bool.booleanValue()) {
            C563770M9f c563770M9f = this.LL;
            Activity activity = this.LLILLJJLI;
            EnterStoryParam enterStoryParam = this.LLILLL;
            long j = this.LLILZ;
            c563770M9f.getClass();
            if (C0LJ5.LIZIZ() && C0LJ5.LIZ().enableAsyncAllAlbumKey) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                Context contextN3 = C786410Ut5.N3(activity);
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C05M7(SystemClock.elapsedRealtime(), contextN3, null), 3);
            }
            if (C0LJ5.LIZJ()) {
                C0L9L c0l9l = C0L9L.WIDTH_HEIGHT_9_16;
                Size sizeLIZ = C0L2L.LIZ(activity, c0l9l, 3);
                int height = C0L2L.LIZ(activity, c0l9l, 3).getHeight();
                if (height < 1) {
                    height = 1;
                }
                int iLJ = C13LZ.LJ((((activity.getResources().getDisplayMetrics().heightPixels + height) - 1) / height) * 3, 1, 9);
                C540820LIy c540820LIy = c563770M9f.LIZLLL;
                int i = C540820LIy.LJI;
                c540820LIy.LIZLLL.set(null);
                c540820LIy.LJ.set(false);
                C23213097r c23213097r = C23212097q.LIZ;
                synchronized (c23213097r) {
                    try {
                        c23213097r.evictAll();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                C099F c099fLIZIZ = C090F.LIZIZ();
                c540820LIy.LJFF = c099fLIZIZ;
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1418005go(c099fLIZIZ, c540820LIy, activity, false, false, sizeLIZ, iLJ, null), 3);
            } else {
                c563770M9f.warmUpMediaResources();
            }
            c563770M9f.LIZ(enterStoryParam, new AwS9S0300100_8(activity, enterStoryParam, j, c0l9u2, 1));
        } else {
            this.LLILZIL.invoke();
        }
        return Unit.LIZ;
    }
}
