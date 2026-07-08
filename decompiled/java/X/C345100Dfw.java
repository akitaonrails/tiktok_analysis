package X;

import android.app.Dialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Dfw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C345100Dfw extends C09AY implements Function1<Dialog, Unit> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C345100Dfw(long j, long j2, long j3) {
        super(1);
        this.LL = j;
        this.LLILLJJLI = j2;
        this.LLILLL = j3;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Dialog dialog) {
        Dialog dialog2 = dialog;
        dialog2.dismiss();
        C785410UrT.LIZ(dialog2);
        C344950Dfh.LIZ = false;
        C344950Dfh.LIZJ(EnumC344990Dfl.CLICK_CANCEL_CLEAN_LOADING, this.LL, this.LLILLJJLI, this.LLILLL, 0L, 0L, false, false, false, 768);
        return Unit.LIZ;
    }
}
