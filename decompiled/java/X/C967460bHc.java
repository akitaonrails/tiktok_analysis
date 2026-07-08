package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.OnLineMicInfo;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0bHc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C967460bHc extends C09AY implements Function1<Map<String, ? extends OnLineMicInfo>, Unit> {
    public final /* synthetic */ C966020bFI LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C967460bHc(C966020bFI c966020bFI) {
        super(1);
        this.LL = c966020bFI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Map<String, ? extends OnLineMicInfo> map) {
        Map<String, ? extends OnLineMicInfo> map2 = map;
        InterfaceC965990bFF interfaceC965990bFF = this.LL.LJIIZILJ;
        if (interfaceC965990bFF != 0) {
            interfaceC965990bFF.LJJZ(map2);
        }
        return Unit.LIZ;
    }
}
