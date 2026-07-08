package X;

import Y.AcS354S0200000_15;
import android.content.Context;
import com.bytedance.android.live.design.app.LiveDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0avz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C954050avz extends C09AY implements Function0<Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ C954060aw0 LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C954050avz(boolean z, C954060aw0 c954060aw0, Context context, String str, String str2) {
        super(0);
        this.LL = z;
        this.LLILLJJLI = c954060aw0;
        this.LLILLL = context;
        this.LLILZ = str;
        this.LLILZIL = str2;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        if (this.LL) {
            LiveDialog liveDialog = this.LLILLJJLI.LIZIZ;
            if (liveDialog != null) {
                liveDialog.dismiss();
                C785410UrT.LIZ(liveDialog);
            }
            this.LLILLJJLI.LIZIZ = null;
        } else {
            Context context = this.LLILLL;
            if (context != null) {
                C954060aw0 c954060aw0 = this.LLILLJJLI;
                LiveDialog liveDialog2 = c954060aw0.LIZIZ;
                if (liveDialog2 == null) {
                    C782110Um9 c782110Um9 = new C782110Um9(context);
                    c782110Um9.LIZJ = this.LLILZ;
                    c782110Um9.LJIIIZ(this.LLILZIL);
                    c782110Um9.LJIILJJIL("stop", new AcS354S0200000_15(context, this.LLILLJJLI, 24));
                    c782110Um9.LJIILL = false;
                    c954060aw0.LIZIZ = c782110Um9.LIZ();
                } else {
                    liveDialog2.setTitle(this.LLILZ);
                    LiveDialog liveDialog3 = this.LLILLJJLI.LIZIZ;
                    if (liveDialog3 != null) {
                        liveDialog3.LJLLILLLL(this.LLILZIL);
                    }
                }
                LiveDialog liveDialog4 = this.LLILLJJLI.LIZIZ;
                if (liveDialog4 != null) {
                    C786410Ut5.E4(liveDialog4);
                }
            }
        }
        return Unit.LIZ;
    }
}
