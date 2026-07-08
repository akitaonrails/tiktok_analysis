package X;

import com.bytedance.android.starship.strategy.CppAllowMapConfig;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.04bA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1128204bA extends C09AY implements Function0<String> {
    public final /* synthetic */ CppAllowMapConfig LL;
    public final /* synthetic */ Map<String, Object> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1128204bA(CppAllowMapConfig cppAllowMapConfig, Map<String, ? extends Object> map) {
        super(0);
        this.LL = cppAllowMapConfig;
        this.LLILLJJLI = map;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("C++ allowMap: ");
        sbLIZ.append(this.LL);
        sbLIZ.append(", sdkConfig: ");
        sbLIZ.append(this.LLILLJJLI);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
