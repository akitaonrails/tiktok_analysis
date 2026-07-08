package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import org.json.JSONArray;

/* JADX INFO: renamed from: X.00o4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C189000o4 {
    public static final <T> List<T> LIZ(JSONArray jSONArray, Function1<Object, ? extends T> function1) {
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            arrayList.add(function1.invoke(jSONArray.opt(i)));
        }
        return arrayList;
    }
}
