package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.Layout;
import kotlin.Unit;
import org.json.JSONException;

/* JADX INFO: renamed from: X.1AXr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2181091AXr extends C09AY implements InterfaceC1631630sYr<Layout, String, Boolean, Boolean, Unit> {
    public final /* synthetic */ C1AXM LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2181091AXr(C1AXM c1axm) {
        super(4);
        this.LL = c1axm;
    }

    @Override // X.InterfaceC1631630sYr
    public final Unit invoke(Layout layout, String str, Boolean bool, Boolean bool2) throws JSONException {
        boolean zBooleanValue = bool.booleanValue();
        boolean zBooleanValue2 = bool2.booleanValue();
        this.LL.LJJJI();
        C1AXM.LLIZLLLIL(this.LL, layout, str, zBooleanValue, zBooleanValue2, false, false, false, null, 240);
        return Unit.LIZ;
    }
}
