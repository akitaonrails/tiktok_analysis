package X;

import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.consume.FollowingFeedConsumeMonitorConfigModel;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Vi3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.consume.FollowingFeedConsumeMonitorService$initService$1$1$tasks$1$1", f = "FollowingFeedConsumeMonitorService.kt", l = {}, m = "invokeSuspend")
public final class C805050Vi3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Integer>, Object> {
    public final /* synthetic */ int LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C805050Vi3(int i, InterfaceC1364105Vn<? super C805050Vi3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C805050Vi3(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC805040Vi2 interfaceC805040Vi2LIZ;
        List listLJFF;
        C1C7U.LIZ("FollowingFeedConsumeMonitorService@d6f6.initService$1$1$tasks$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C805030Vi1 c805030Vi1 = C805030Vi1.LIZ;
        int i = this.LL;
        c805030Vi1.getClass();
        Pair pairLIZIZ = C805030Vi1.LIZIZ(i);
        C805070Vi5.LIZ.getClass();
        long jLongValue = ((Number) pairLIZIZ.getFirst()).longValue();
        long jLongValue2 = ((Number) pairLIZIZ.getSecond()).longValue();
        if (!((FollowingFeedConsumeMonitorConfigModel) C805030Vi1.LIZJ.getValue()).enable || (interfaceC805040Vi2LIZ = C805030Vi1.LIZ()) == null || (listLJFF = interfaceC805040Vi2LIZ.LJFF(jLongValue, jLongValue2, ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId())) == null) {
            listLJFF = C13BV.INSTANCE;
        }
        Iterator<Integer> it2 = ((FollowingFeedConsumeMonitorConfigModel) C805070Vi5.LIZIZ.getValue()).topLevels.iterator();
        double d = -1.0d;
        int i2 = 0;
        while (it2.hasNext()) {
            int iIntValue = it2.next().intValue();
            List listLL = C13LP.LL(listLJFF, iIntValue);
            if (!listLL.isEmpty() && listLL.size() > i2) {
                double d2 = ((C0VLX) C13LP.LJJJJZI(listLL)).LJ;
                double d3 = ((C0VLX) C13LP.LJJLIIIJJI(listLL)).LJ;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : listLL) {
                    boolean z = true;
                    if (((C0VLX) obj2).LIZLLL != 1) {
                        z = false;
                    }
                    if (z) {
                        arrayList.add(obj2);
                    }
                }
                int size = arrayList.size();
                C805070Vi5 c805070Vi5 = C805070Vi5.LIZ;
                int size2 = listLL.size();
                c805070Vi5.getClass();
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("top_x", iIntValue);
                    jSONObject.put("max_score", d2);
                    jSONObject.put("min_score", d3);
                    jSONObject.put("read_count", size);
                    jSONObject.put("total_count", size2);
                    jSONObject.put("read_ratio", Float.valueOf(size / size2));
                    if (d > 0.0d) {
                        jSONObject.put("diff_ratio", (d - d3) / d);
                    }
                    C20684815ws.LJIJ("follow_feed_video_consume", jSONObject);
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
                i2 = iIntValue;
                d = d3;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("monitor data of ");
        sbLIZ.append(this.LL);
        sbLIZ.append(" day before toady, date is [");
        C805030Vi1 c805030Vi12 = C805030Vi1.LIZ;
        long jLongValue3 = ((Number) pairLIZIZ.getFirst()).longValue();
        c805030Vi12.getClass();
        sbLIZ.append(new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date(jLongValue3)));
        sbLIZ.append(']');
        Integer numLJ = C2286608xc.LJ(Log.d("FollowingFeedConsumeMonitor", C2188811AlT.LIZIZ(sbLIZ)));
        C1C7U.LIZIZ("FollowingFeedConsumeMonitorService@d6f6.initService$1$1$tasks$1$1");
        return numLJ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Integer> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
