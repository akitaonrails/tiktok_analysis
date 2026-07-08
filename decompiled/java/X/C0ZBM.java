package X;

import android.widget.LinearLayout;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.refactor.assem.ChatDetailContainerAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS585S0100000_6;

/* JADX INFO: renamed from: X.0ZBM, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZBM extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ ChatDetailContainerAssem LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ C893950Z5d LLILLL;
    public final /* synthetic */ InterfaceC893080Z1u LLILZ;
    public final /* synthetic */ C13IQ<? extends UISlotAssem> LLILZIL;
    public final /* synthetic */ LinearLayout LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0ZBM(ChatDetailContainerAssem chatDetailContainerAssem, int i, C893950Z5d c893950Z5d, InterfaceC893080Z1u interfaceC893080Z1u, C19719912Dl c19719912Dl, LinearLayout linearLayout) {
        super(1);
        this.LL = chatDetailContainerAssem;
        this.LLILLJJLI = i;
        this.LLILLL = c893950Z5d;
        this.LLILZ = interfaceC893080Z1u;
        this.LLILZIL = c19719912Dl;
        this.LLILZLL = linearLayout;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        Assembler assembler2 = assembler;
        assembler2.EQ2(this.LL, new AwS585S0100000_6(this.LLILZ, 267));
        assembler2.RQ2(this.LL, new C0ZBN(this.LLILZIL, this.LLILLJJLI, this.LLILLL, this.LLILZLL));
        return Unit.LIZ;
    }
}
