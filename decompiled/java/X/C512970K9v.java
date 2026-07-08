package X;

import com.bytedance.android.livesdk.comp.impl.event.widget.LivePaidEventMaskWidget;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0K9v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C512970K9v extends C09AY implements Function1<EnumC464630IJx, Unit> {
    public final /* synthetic */ LivePaidEventMaskWidget LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C512970K9v(LivePaidEventMaskWidget livePaidEventMaskWidget) {
        super(1);
        this.LL = livePaidEventMaskWidget;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(EnumC464630IJx enumC464630IJx) {
        if (enumC464630IJx == EnumC464630IJx.PAY_SUCCESS) {
            C1324720kZq c1324720kZq = this.LL.LLILLJJLI;
            if (c1324720kZq != null) {
                C786410Ut5.e8(c1324720kZq, null);
            }
            C1324720kZq c1324720kZq2 = this.LL.LLILLJJLI;
            if (c1324720kZq2 != null) {
                C786410Ut5.LLJJIII(c1324720kZq2, 8);
            }
            this.LL.hide();
        }
        return Unit.LIZ;
    }
}
