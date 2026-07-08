package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.Layout;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkUpdateLayoutSwitchLayoutSuccessSetting;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1AXv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2181131AXv extends C09AY implements Function1<String, C1AYF> {
    public final /* synthetic */ C1AXM LL;
    public final /* synthetic */ Layout LLILLJJLI;
    public final /* synthetic */ Function1<String, C1AYF> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2181131AXv(C1AXM c1axm, Layout layout, Function1<? super String, C1AYF> function1) {
        super(1);
        this.LL = c1axm;
        this.LLILLJJLI = layout;
        this.LLILLL = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C1AYF invoke(String str) {
        if (LiveSdkUpdateLayoutSwitchLayoutSuccessSetting.INSTANCE.isEnable()) {
            this.LL.LJJLIIJ().LJIILJJIL(this.LLILLJJLI, false);
        }
        Function1<String, C1AYF> function1 = this.LLILLL;
        if (function1 != null) {
            return function1.invoke(str);
        }
        return null;
    }
}
