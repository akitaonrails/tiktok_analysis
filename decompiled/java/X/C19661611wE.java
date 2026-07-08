package X;

import android.content.Context;
import android.content.DialogInterface;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.11wE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19661611wE extends C09AY implements Function0<Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ C14XN LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Function1<String, Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C19661611wE(boolean z, C14XN c14xn, String str, Function1<? super String, Unit> function1) {
        super(0);
        this.LL = z;
        this.LLILLJJLI = c14xn;
        this.LLILLL = str;
        this.LLILZ = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (!this.LL) {
            this.LLILLJJLI.LJJIJIIJI();
            C14XN c14xn = this.LLILLJJLI;
            String str = this.LLILLL;
            final Function1<String, Unit> function1 = this.LLILZ;
            Context context = c14xn.LLJIJIL;
            if (context != null) {
                C11GD c11gd = new C11GD(context, false, str, new C11GG() { // from class: X.11GH
                    @Override // X.C11GG
                    public final void LIZIZ(String str2) {
                        Function1<String, Unit> function12 = function1;
                        if (str2 == null) {
                            str2 = "";
                        }
                        function12.invoke(str2);
                    }
                }, null, null, null);
                c11gd.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: X.11wF
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                    }
                });
                c11gd.show();
                C785410UrT.LIZIZ(c11gd);
                PopupMonitorServiceImpl.LIZ.getClass();
                PopupMonitorServiceImpl.LJJJ(c11gd);
                C816490W1f.LIZ(c11gd);
            }
        }
        return Unit.LIZ;
    }
}
