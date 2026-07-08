package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import eha.a0;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vWR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1745450vWR extends C09AY implements Function1<LaneParams, Unit> {
    public final /* synthetic */ a0 LL;
    public final /* synthetic */ C1745680vWo LLILLJJLI;
    public final /* synthetic */ C1745340vWG LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1745450vWR(a0 a0Var, C1745680vWo c1745680vWo, C1745340vWG c1745340vWG, boolean z, boolean z2, String str) {
        super(1);
        this.LL = a0Var;
        this.LLILLJJLI = c1745680vWo;
        this.LLILLL = c1745340vWG;
        this.LLILZ = z;
        this.LLILZIL = z2;
        this.LLILZLL = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LaneParams laneParams) {
        Object obj;
        Object obj2;
        Object obj3;
        String str;
        String str2;
        HashMap<String, Object> mapLJIIJ;
        LaneParams laneParams2 = laneParams;
        HashMap<String, Object> map = this.LL.LLILLL.LLJJIJIIJIL;
        Object obj4 = null;
        if (map != null) {
            obj = map.get("previous_page");
        } else {
            obj = null;
        }
        laneParams2.plusAssign("previous_page", obj);
        laneParams2.plusAssign("is_fullscreen", Integer.valueOf(this.LL.LLILLL.LLLLLIL ? 1 : 0));
        laneParams2.plusAssign("fill_type", this.LL.LLILLL.LLLLL.type());
        laneParams2.plusAssign("page_name", this.LL.LLILLL.getPageName());
        HashMap<String, Object> map2 = this.LL.LLILLL.LLJJIJIIJIL;
        if (map2 != null) {
            obj4 = map2.get("entrance_info");
        }
        laneParams2.plusAssign("entrance_info", obj4);
        String str3 = this.LLILLJJLI.LIZ.key;
        if (str3 == null) {
            str3 = "";
        }
        laneParams2.plusAssign("input_box_name", str3);
        laneParams2.plusAssign("stay_time", String.valueOf(SystemClock.elapsedRealtime() - this.LL.LLIZ));
        if (!Intrinsics.LJFF(this.LLILLJJLI.LIZ.key, "address_searchbar")) {
            C1745340vWG c1745340vWG = this.LLILLL;
            if (c1745340vWG != null && (str2 = c1745340vWG.LJFF) != null && (mapLJIIJ = C1741890vQh.LJIIJ(str2)) != null) {
                laneParams2.putAll(mapLJIIJ);
            }
            laneParams2.plusAssign("input_method", this.LL.LLILZLL.LJIIJ);
            String str4 = "1";
            if (this.LL.LLJ) {
                obj2 = "1";
            } else {
                obj2 = CardStruct.IStatusCode.DEFAULT;
            }
            laneParams2.plusAssign("has_normal_input", obj2);
            laneParams2.plusAssign("has_auto_input", C893803eS.LIZ(this.LLILZ));
            laneParams2.plusAssign("has_sug_input", C893803eS.LIZ(this.LLILZIL));
            if (C1745310vWD.LIZ(this.LLILLL)) {
                obj3 = "1";
            } else {
                obj3 = CardStruct.IStatusCode.DEFAULT;
            }
            laneParams2.plusAssign("is_valid", obj3);
            C1745340vWG c1745340vWG2 = this.LLILLL;
            if (c1745340vWG2 != null && (str = c1745340vWG2.LIZLLL) != null) {
                laneParams2.plusAssign("strong_fail_reason", str);
            }
            if (!C770702zh.LIZIZ(this.LL.LLILLL.LLLI) || !Intrinsics.LJFF(this.LLILZLL, this.LL.LLILLL.LLLI)) {
                str4 = CardStruct.IStatusCode.DEFAULT;
            }
            laneParams2.plusAssign("is_same_auto", str4);
            C1746460vY4 c1746460vY4 = C1746460vY4.LIZ;
            C1745680vWo c1745680vWo = this.LLILLJJLI;
            String str5 = c1745680vWo.LIZ.key;
            Object obj5 = c1745680vWo.LIZIZ;
            c1746460vY4.getClass();
            C1746460vY4.LJIIIZ(str5, obj5, null, false);
            Map<String, ? extends Object> mapLIZLLL = C1746460vY4.LIZLLL(this.LLILLJJLI.LIZ.key);
            if (mapLIZLLL != null) {
                laneParams2.withNotCheckParams(mapLIZLLL);
            }
        }
        return Unit.LIZ;
    }
}
