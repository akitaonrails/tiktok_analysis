package X;

import Y.AcS496S0100000_15;
import com.bytedance.android.live.design.app.LiveDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0avx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C954030avx extends C09AY implements Function0<Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ DialogC971210bNf LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C954030avx(boolean z, DialogC971210bNf dialogC971210bNf, String str, String str2) {
        super(0);
        this.LL = z;
        this.LLILLJJLI = dialogC971210bNf;
        this.LLILLL = str;
        this.LLILZ = str2;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        if (this.LL) {
            LiveDialog liveDialog = this.LLILLJJLI.LLJJJ;
            if (liveDialog != null) {
                liveDialog.dismiss();
                C785410UrT.LIZ(liveDialog);
            }
        } else {
            DialogC971210bNf dialogC971210bNf = this.LLILLJJLI;
            LiveDialog liveDialog2 = dialogC971210bNf.LLJJJ;
            if (liveDialog2 == null) {
                C782110Um9 c782110Um9 = new C782110Um9(dialogC971210bNf.getContext());
                c782110Um9.LIZJ = this.LLILLL;
                c782110Um9.LJIIIZ(this.LLILZ);
                c782110Um9.LJIILJJIL("stop", new AcS496S0100000_15(this.LLILLJJLI, 9));
                c782110Um9.LJIILL = false;
                dialogC971210bNf.LLJJJ = c782110Um9.LIZ();
            } else {
                liveDialog2.setTitle(this.LLILLL);
                LiveDialog liveDialog3 = this.LLILLJJLI.LLJJJ;
                if (liveDialog3 != null) {
                    liveDialog3.LJLLILLLL(this.LLILZ);
                }
            }
            LiveDialog liveDialog4 = this.LLILLJJLI.LLJJJ;
            if (liveDialog4 != null) {
                C786410Ut5.E4(liveDialog4);
            }
        }
        return Unit.LIZ;
    }
}
