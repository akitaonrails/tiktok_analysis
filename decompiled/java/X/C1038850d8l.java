package X;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS81S1300000_16;

/* JADX INFO: renamed from: X.0d8l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1038850d8l extends C09AY implements Function1<C197039127h, Unit> {
    public final /* synthetic */ C1038840d8k LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;
    public final /* synthetic */ Function0<Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1038850d8l(C1038840d8k c1038840d8k, int i, boolean z, AwS81S1300000_16 awS81S1300000_16, AwS81S1300000_16 awS81S1300000_162) {
        super(1);
        this.LL = c1038840d8k;
        this.LLILLJJLI = i;
        this.LLILLL = z;
        this.LLILZ = awS81S1300000_16;
        this.LLILZIL = awS81S1300000_162;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C197039127h c197039127h) {
        C197039127h c197039127h2 = c197039127h;
        c197039127h2.setText(this.LL.getContext().getString(this.LLILLJJLI));
        c197039127h2.setButtonVariant(1);
        c197039127h2.setButtonSize(2);
        final C1038840d8k c1038840d8k = this.LL;
        final boolean z = this.LLILLL;
        final Function0<Unit> function0 = this.LLILZ;
        final Function0<Unit> function02 = this.LLILZIL;
        C786410Ut5.U8(c197039127h2, new View.OnClickListener() { // from class: X.0d8m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                c1038840d8k.LIZIZ();
                if (z) {
                    function0.invoke();
                } else {
                    function02.invoke();
                }
            }
        });
        return Unit.LIZ;
    }
}
