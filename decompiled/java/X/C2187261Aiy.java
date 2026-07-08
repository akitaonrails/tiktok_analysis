package X;

import com.ss.android.ugc.aweme.ad.feed.task.detect.AppAdsDetectAppConfig;
import com.ss.android.ugc.aweme.ad.feed.task.detect.AppInfo;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1Aiy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2187261Aiy extends C09AY implements Function0<List<? extends AppInfo>> {
    public C2187261Aiy() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<? extends AppInfo> invoke() {
        List<AppInfo> list = ((AppAdsDetectAppConfig) C2187271Aiz.LIZIZ.getValue())._appList;
        ArrayList arrayList = new ArrayList(list != null ? C13LP.LJJJJLI(list) : C13BV.INSTANCE);
        if (arrayList.size() > 1) {
            C08XD.LJJ(arrayList, new Comparator() { // from class: X.09DH
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return C20085613iQ.LIZIZ(((AppInfo) t).index, ((AppInfo) t2).index);
                }
            });
        }
        return arrayList;
    }
}
