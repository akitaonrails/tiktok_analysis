package X;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0z2x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1880930z2x extends C09AY implements Function1<JSONObject, Unit> {
    public final /* synthetic */ C1880920z2w LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1880930z2x(C1880920z2w c1880920z2w) {
        super(1);
        this.LL = c1880920z2w;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = jSONObject;
        C1880920z2w c1880920z2w = this.LL;
        c1880920z2w.getClass();
        Iterator<String> itKeys = jSONObject2.keys();
        boolean z = false;
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objOpt = jSONObject2.opt(next);
            if (objOpt != null) {
                C1882380z5I.LJIIIZ(c1880920z2w.LJIIIZ(), next, objOpt);
                c1880920z2w.LLJJIJIIJIL.put(next, objOpt);
                if (Intrinsics.LJFF(next, "game_info")) {
                    c1880920z2w.LJJ();
                }
                z = true;
            }
        }
        if (z) {
            c1880920z2w.LJIIIZ().LJIIIIZZ();
        }
        return Unit.LIZ;
    }
}
