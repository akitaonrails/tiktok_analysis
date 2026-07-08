package X;

import com.google.gson.Gson;
import com.google.gson.e;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.ecommercebase.utils.BooleanTypeAdapter;
import com.ss.android.ugc.aweme.ecommercebase.utils.MapTypeAdapter;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.051J, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C051J extends C09AY implements Function0<Gson> {
    public C051J() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Gson invoke() {
        BooleanTypeAdapter booleanTypeAdapter = new BooleanTypeAdapter();
        MapTypeAdapter mapTypeAdapter = new MapTypeAdapter();
        e eVar = new e();
        eVar.LIZJ(booleanTypeAdapter, Boolean.TYPE);
        eVar.LIZJ(booleanTypeAdapter, Boolean.class);
        eVar.LIZJ(mapTypeAdapter, new TypeToken<Map<String, Object>>() { // from class: X.04Xd
        }.getType());
        eVar.LIZJ(mapTypeAdapter, new TypeToken<Map<String, ? extends Object>>() { // from class: X.00W3
        }.getType());
        eVar.LIZJ(mapTypeAdapter, new TypeToken<HashMap<String, Object>>() { // from class: X.04Xe
        }.getType());
        return eVar.LIZ();
    }
}
