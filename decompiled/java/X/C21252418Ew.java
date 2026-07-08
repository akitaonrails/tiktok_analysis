package X;

import com.bytedance.android.btm.api.model.BufferBtm;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.18Ew, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21252418Ew extends C09AY implements Function0<Map<String, BufferBtm>> {
    public C21252418Ew() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Map<String, BufferBtm> invoke() {
        C18E5 c18e5 = C18E5.LIZ;
        c18e5.getClass();
        return Collections.synchronizedMap((LinkedHashMap) C18E5.LJFF.getValue(c18e5, C18E5.LIZIZ[1]));
    }
}
