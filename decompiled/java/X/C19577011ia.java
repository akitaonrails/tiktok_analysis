package X;

import android.app.Dialog;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialogBuilder;
import com.ss.android.ugc.tools.view.uikit.factory.CreativeDialogWrapper;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.11ia, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19577011ia extends C09AY implements Function1<Dialog, Unit> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ C0LD3 LLILLJJLI;
    public final /* synthetic */ C0LEP LLILLL;
    public final /* synthetic */ CreativeLoadingDialogBuilder LLILZ;
    public final /* synthetic */ CreativeDialogWrapper LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19577011ia(int i, C0LD3 c0ld3, C0LEP c0lep, CreativeLoadingDialogBuilder creativeLoadingDialogBuilder, CreativeDialogWrapper creativeDialogWrapper) {
        super(1);
        this.LL = i;
        this.LLILLJJLI = c0ld3;
        this.LLILLL = c0lep;
        this.LLILZ = creativeLoadingDialogBuilder;
        this.LLILZIL = creativeDialogWrapper;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Dialog dialog) {
        C194353111z.LIZ.LIZLLL(this.LL, C0MVY.CLICK_CLOSE, this.LLILLJJLI, this.LLILLL, this.LLILZ.getConfig().message, this.LLILZIL);
        this.LLILZ.getConfig().clickCancelListener.invoke(dialog);
        return Unit.LIZ;
    }
}
