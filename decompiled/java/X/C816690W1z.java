package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0W1z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.storage.perf.FullUpdateMonitor$trace$1", f = "FullUpdateMonitor.kt", l = {}, m = "invokeSuspend")
public final class C816690W1z extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0W2P LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ long LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C816690W1z(C0W2P c0w2p, long j, long j2, long j3, InterfaceC1364105Vn<? super C816690W1z> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0w2p;
        this.LLILLJJLI = j;
        this.LLILLL = j2;
        this.LLILZ = j3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C816690W1z(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        C816680W1y c816680W1y;
        C816680W1y c816680W1y2;
        C816640W1u c816640W1u;
        C816640W1u c816640W1u2;
        C816650W1v c816650W1v;
        C816650W1v c816650W1v2;
        C1C7U.LIZ("FullUpdateMonitor@67c.trace$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LJFF.put("sum_cost", this.LLILLJJLI);
        this.LL.LJFF.put("sum_db_cost", this.LLILLL);
        this.LL.LJFF.put("full_update_interval", this.LLILZ);
        C0W2M c0w2m = (C0W2M) this.LL.LIZJ.getValue();
        if (c0w2m != null) {
            int size = ((ArrayList) c0w2m.LIZJ).size();
            int size2 = ((ArrayList) c0w2m.LIZLLL).size();
            JSONObject jSONObjectPut = c0w2m.LJ.put("origin_size", size).put("new_size", size2);
            int i = size - size2;
            if (i < 0) {
                i = 0;
            }
            JSONObject jSONObjectPut2 = jSONObjectPut.put("new_missing_count", i);
            int i2 = size2 - size;
            if (i2 < 0) {
                i2 = 0;
            }
            jSONObjectPut2.put("origin_missing_count", i2);
            if (size2 != size) {
                c0w2m.LJ.put("is_same", CardStruct.IStatusCode.DEFAULT);
            } else {
                List<C816670W1x> list = c0w2m.LIZJ;
                int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(list, 10));
                if (iLIZIZ < 16) {
                    iLIZIZ = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
                for (Object obj2 : (ArrayList) list) {
                    linkedHashMap.put(C0W2M.LIZJ((C816670W1x) obj2), obj2);
                }
                int i3 = 0;
                for (C816670W1x c816670W1x : (ArrayList) c0w2m.LIZLLL) {
                    C816670W1x c816670W1x2 = (C816670W1x) linkedHashMap.get(C0W2M.LIZJ(c816670W1x));
                    if (c816670W1x2 == null || (c816680W1y = c816670W1x2.LIZJ) == null || (c816680W1y2 = c816670W1x.LIZJ) == null || !Intrinsics.LJFF(c816680W1y.LIZ, c816680W1y2.LIZ) || !Intrinsics.LJFF(c816680W1y.LIZIZ, c816680W1y2.LIZIZ) || !Intrinsics.LJFF(c816680W1y.LIZJ, c816680W1y2.LIZJ) || !Intrinsics.LJFF(c816680W1y.LIZLLL, c816680W1y2.LIZLLL) || !Intrinsics.LJFF(c816680W1y.LJ, c816680W1y2.LJ) || !Intrinsics.LJFF(c816680W1y.LJFF, c816680W1y2.LJFF) || !Intrinsics.LJFF(c816680W1y.LJI, c816680W1y2.LJI) || (c816640W1u = c816670W1x2.LIZIZ) == null || (c816640W1u2 = c816670W1x.LIZIZ) == null || !Intrinsics.LJFF(c816640W1u2.LIZ, c816640W1u.LIZ) || !Intrinsics.LJFF(c816640W1u2.LIZJ, c816640W1u.LIZJ) || !Intrinsics.LJFF(c816640W1u2.LIZLLL, c816640W1u.LIZLLL) || !Intrinsics.LJFF(c816640W1u2.LJ, c816640W1u.LJ) || !Intrinsics.LJFF(c816640W1u2.LJFF, c816640W1u.LJFF) || (c816650W1v = c816670W1x2.LIZLLL) == null || (c816650W1v2 = c816670W1x.LIZLLL) == null || !Intrinsics.LJFF(c816650W1v.LIZ, c816650W1v2.LIZ) || !Intrinsics.LJFF(c816650W1v.LIZIZ, c816650W1v2.LIZIZ) || !Intrinsics.LJFF(c816650W1v.LIZJ, c816650W1v2.LIZJ) || !Intrinsics.LJFF(c816650W1v.LIZLLL, c816650W1v2.LIZLLL)) {
                        i3++;
                    }
                }
                c0w2m.LJ.put("inconsistent_count", i3);
                if (i3 == 0) {
                    c0w2m.LJ.put("is_same", "1");
                }
            }
            C065A.LIZIZ("relation_user_entire_diff_result", c0w2m.LJ);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FullUpdateMonitor@67c.trace$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
