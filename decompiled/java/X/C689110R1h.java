package X;

import android.util.ArrayMap;
import com.bytedance.scene.Scene;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0R1h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.messagelist.perf.SubmitListBreakdownClock$logEvent$1", f = "SubmitListBreakdownClockImpl.kt", l = {}, m = "invokeSuspend")
public final class C689110R1h extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C689120R1i LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ Map<String, String> LLILZIL;
    public final /* synthetic */ InterfaceC1493105sv LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C689110R1h(C689120R1i c689120R1i, String str, boolean z, int i, Map<String, String> map, InterfaceC1493105sv interfaceC1493105sv, InterfaceC1364105Vn<? super C689110R1h> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c689120R1i;
        this.LLILLJJLI = str;
        this.LLILLL = z;
        this.LLILZ = i;
        this.LLILZIL = map;
        this.LLILZLL = interfaceC1493105sv;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C689110R1h(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SubmitListBreakdownClock@cea9.logEvent$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        for (Map.Entry entry : C2097608Jq.LJIIZILJ(this.LL.LIZIZ).entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            ArrayMap arrayMap = new ArrayMap();
            arrayMap.put("biz_tag", this.LLILLJJLI);
            arrayMap.put(Scene.SCENE_SERVICE, key);
            arrayMap.put("load_time", value);
            arrayMap.put("is_onquery", String.valueOf(this.LLILLL));
            arrayMap.put("list_size", String.valueOf(this.LLILZ));
            Map<String, String> map = this.LLILZIL;
            if (map != null) {
                arrayMap.putAll(map);
            }
            this.LLILZLL.sendEvent("im_submitlist_breakdown", arrayMap);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SubmitListBreakdownClock@cea9.logEvent$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
