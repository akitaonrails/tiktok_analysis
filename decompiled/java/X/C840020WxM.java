package X;

import java.io.UnsupportedEncodingException;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0WxM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C840020WxM extends C09AY implements Function0<Object> {
    public final /* synthetic */ Object LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C840020WxM(Object obj) {
        super(0);
        this.LL = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws UnsupportedEncodingException {
        String str;
        C840640WyM c840640WyM = C840640WyM.LIZ;
        C2086108Ff c2086108Ff = C2086108Ff.LIZ;
        Object obj = this.LL;
        if (!(obj instanceof String) || (str = (String) obj) == null) {
            str = "";
        }
        c2086108Ff.getClass();
        Map mapLIZ = C2086108Ff.LIZ(str);
        c840640WyM.getClass();
        return C840640WyM.LIZLLL(mapLIZ);
    }
}
