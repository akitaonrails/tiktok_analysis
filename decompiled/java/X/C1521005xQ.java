package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.footnote.detail.ui.FootNoteSensorConfigProvider;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.05xQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1521005xQ implements InterfaceC1631620sYq<VideoItemParams, Map<String, ? extends Object>, InterfaceC1364105Vn<? super AbstractC1387105bp>, Object>, InterfaceC842703Qz {
    public final /* synthetic */ FootNoteSensorConfigProvider LL;
    public final /* synthetic */ WeakReference<C704830Rkn> LLILLJJLI;

    public C1521005xQ(FootNoteSensorConfigProvider footNoteSensorConfigProvider, WeakReference<C704830Rkn> weakReference) {
        this.LL = footNoteSensorConfigProvider;
        this.LLILLJJLI = weakReference;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(VideoItemParams videoItemParams, Map<String, ? extends Object> map, InterfaceC1364105Vn<? super AbstractC1387105bp> interfaceC1364105Vn) {
        Object obj;
        String string;
        C704830Rkn c704830Rkn;
        Function0<C690870R8b> function0;
        C690870R8b c690870R8bInvoke;
        C0RJN c0rjnLIZIZ;
        Map<String, ? extends Object> map2 = map;
        InterfaceC1364105Vn<? super AbstractC1387105bp> interfaceC1364105Vn2 = interfaceC1364105Vn;
        if (map2 != null) {
            obj = map2.get("schema");
        } else {
            obj = null;
        }
        if (obj instanceof String) {
            string = (String) obj;
        } else {
            string = null;
        }
        if (string == null) {
            return new C1387205bq(null);
        }
        FootNoteSensorConfigProvider footNoteSensorConfigProvider = this.LL;
        WeakReference<C704830Rkn> weakReference = this.LLILLJJLI;
        footNoteSensorConfigProvider.getClass();
        try {
            Uri.Builder builderBuildUpon = UriProtector.parse(string).buildUpon();
            if (weakReference != null && (c704830Rkn = weakReference.get()) != null && (function0 = c704830Rkn.LIZ) != null && (c690870R8bInvoke = function0.invoke()) != null && (c0rjnLIZIZ = c690870R8bInvoke.LIZIZ()) != null) {
                builderBuildUpon.appendQueryParameter("enter_from", C1389300mG0.LIZ(c0rjnLIZIZ));
            }
            string = builderBuildUpon.build().toString();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        C1DFH c1dfh = C0PEM.LIZ;
        return C23250099c.LJI(interfaceC1364105Vn2, C2107308Nj.LIZ, new C1507305vD(this.LL, string, null));
    }
}
