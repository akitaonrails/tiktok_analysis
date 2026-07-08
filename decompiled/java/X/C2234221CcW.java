package X;

import com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicCrossLinker;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1CcW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2234221CcW extends C09AY implements Function1<LinkMicCrossLinker, Unit> {
    public final /* synthetic */ C2234371Ccl LL;
    public final /* synthetic */ List<C967180bHA> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2234221CcW(C2234371Ccl c2234371Ccl, List<C967180bHA> list) {
        super(1);
        this.LL = c2234371Ccl;
        this.LLILLJJLI = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LinkMicCrossLinker linkMicCrossLinker) {
        this.LL.LIZ.LLLF(this.LLILLJJLI);
        return Unit.LIZ;
    }
}
