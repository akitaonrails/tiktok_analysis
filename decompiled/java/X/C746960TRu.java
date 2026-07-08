package X;

import android.content.Context;
import android.content.Intent;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.PortraitInputKeyboard;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS245S0000000_12;
import kotlin.jvm.internal.AwS41S0301000_12;

/* JADX INFO: renamed from: X.0TRu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C746960TRu extends C09AY implements Function1<C1397620mTQ, Unit> {
    public final /* synthetic */ Context LL;
    public final /* synthetic */ AbstractC738140SxQ LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ InterfaceC1631620sYq<Integer, Integer, Intent, Unit> LLILZ;
    public final /* synthetic */ Function0<Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C746960TRu(Context context, PortraitInputKeyboard portraitInputKeyboard, int i, InterfaceC1631620sYq interfaceC1631620sYq, Function0 function0) {
        super(1);
        this.LL = context;
        this.LLILLJJLI = portraitInputKeyboard;
        this.LLILLL = i;
        this.LLILZ = interfaceC1631620sYq;
        this.LLILZIL = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1397620mTQ c1397620mTQ) {
        C1397620mTQ c1397620mTQ2 = c1397620mTQ;
        c1397620mTQ2.LIZJ(0, this.LL.getResources().getString(2131829117), new AwS41S0301000_12(this.LLILLJJLI, (AbstractC738140SxQ) this.LLILLL, (int) this.LLILZ, (InterfaceC1631620sYq<? super Integer, ? super Integer, ? super Intent, Unit>) this.LLILZIL, (Function0<Unit>) 3));
        c1397620mTQ2.LIZJ(1, this.LL.getResources().getString(2131829118), AFwS245S0000000_12.get$arr$(269));
        return Unit.LIZ;
    }
}
