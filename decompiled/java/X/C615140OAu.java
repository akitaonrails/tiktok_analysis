package X;

import com.ss.android.ugc.tiktok.addyours.ui.vm.AddYoursDetailViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0OAu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C615140OAu extends C09AY implements Function1<C615110OAr, Unit> {
    public final /* synthetic */ AddYoursDetailViewModel LL;
    public final /* synthetic */ float LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C615140OAu(AddYoursDetailViewModel addYoursDetailViewModel, float f) {
        super(1);
        this.LL = addYoursDetailViewModel;
        this.LLILLJJLI = f;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C615110OAr c615110OAr) {
        this.LL.setState(new C615130OAt(this.LLILLJJLI));
        return Unit.LIZ;
    }
}
