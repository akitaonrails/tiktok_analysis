package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import m14.m;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0org, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public abstract class AbstractC1489540org extends AbstractC1489560ori {
    public boolean LJIILJJIL;

    public abstract EnumC1489530orf LJI(m mVar, String str, List<String> list);

    public abstract int LJII();

    public int LJIIIIZZ() {
        return -555;
    }

    public abstract boolean LJIIIZ(JSONObject jSONObject, List list);

    @Override // X.AbstractC1489560ori
    public final boolean LIZIZ(String str, long j, JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        ListProtector.add(arrayList, 0, Boolean.FALSE);
        boolean zLJIIIZ = LJIIIZ(jSONObject, arrayList);
        this.LJIILJJIL = ((Boolean) ListProtector.get(arrayList, 0)).booleanValue();
        return zLJIIIZ;
    }
}
