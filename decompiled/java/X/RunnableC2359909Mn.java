package X;

import android.app.Activity;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.poi.commonalbum.model.AlbumTrackParams;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.09Mn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC2359909Mn implements Runnable {
    public final Activity LL;
    public final List<String> LLILLJJLI;
    public final C442110HVh LLILLL;
    public final Function1<List<C2360009Mo>, Unit> LLILZ;

    public final void LIZ() {
        Object c098200Yq;
        AlbumTrackParams albumTrackParams;
        try {
            this.LLILZ.invoke(LIZIZ(this.LLILLJJLI, this.LLILLL));
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            PageFinder pageFinderVia = PageFinder.via(this.LL);
            C442110HVh c442110HVh = this.LLILLL;
            C442090HVf.LIZJ(pageFinderVia, "compress image error", (c442110HVh == null || (albumTrackParams = c442110HVh.LJFF) == null) ? null : albumTrackParams.generalMobParams);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("LocalServiceAlbumVM$GenerateMultiResponseTask@d954.run");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LocalServiceAlbumVM$GenerateMultiResponseTask@d954.run");
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01d7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0009 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<X.C2360009Mo> LIZIZ(java.util.List<java.lang.String> r23, X.C442110HVh r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 839
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC2359909Mn.LIZIZ(java.util.List, X.0HVh):java.util.List");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RunnableC2359909Mn(Activity activity, List<String> list, C442110HVh c442110HVh, Function1<? super List<C2360009Mo>, Unit> function1) {
        this.LL = activity;
        this.LLILLJJLI = list;
        this.LLILLL = c442110HVh;
        this.LLILZ = function1;
    }
}
