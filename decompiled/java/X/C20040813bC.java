package X;

import com.ss.android.ugc.aweme.tako.otherpage.settings.vm.TakoSettingsVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.13bC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20040813bC extends C09AY implements Function1<C1155400gAk, Unit> {
    public final /* synthetic */ TakoSettingsVM LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20040813bC(TakoSettingsVM takoSettingsVM, String str, boolean z, boolean z2) {
        super(1);
        this.LL = takoSettingsVM;
        this.LLILLJJLI = str;
        this.LLILLL = z;
        this.LLILZ = z2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1155400gAk c1155400gAk) {
        C23250099c.LIZLLL(this.LL.getAssemVMScope(), null, null, new C20040713bB(this.LL, c1155400gAk, this.LLILLJJLI, this.LLILLL, this.LLILZ, null), 3);
        return Unit.LIZ;
    }
}
