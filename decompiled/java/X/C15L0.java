package X;

import android.app.Activity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.15L0, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15L0 extends C09AY implements Function1<C1397660mTU, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ C20592915i3 LLILLJJLI;
    public final /* synthetic */ Activity LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15L0(String str, C20592915i3 c20592915i3, Activity activity, boolean z) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = c20592915i3;
        this.LLILLL = activity;
        this.LLILZ = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1397660mTU c1397660mTU) {
        String str;
        String str2 = this.LL;
        C20592915i3 c20592915i3 = this.LLILLJJLI;
        Activity activity = this.LLILLL;
        c20592915i3.getClass();
        if (C20592915i3.LIZ(activity)) {
            str = "live_take_popup_in_room";
        } else {
            str = "live_take_popup_out_room";
        }
        C1075710e6D.LIZ(str2, "cancel", str, this.LLILZ);
        return Unit.LIZ;
    }
}
