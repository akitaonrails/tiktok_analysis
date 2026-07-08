package X;

import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.tako.botpage.vm.MessageViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0yXd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1861510yXd extends C09AY implements Function0<Unit> {
    public final /* synthetic */ MessageViewModel LL;
    public final /* synthetic */ C1863340yaa LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1861510yXd(MessageViewModel messageViewModel, C1863340yaa c1863340yaa, String str, boolean z, String str2) {
        super(0);
        this.LL = messageViewModel;
        this.LLILLJJLI = c1863340yaa;
        this.LLILLL = str;
        this.LLILZ = z;
        this.LLILZIL = str2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MessageViewModel messageViewModel = this.LL;
        C1863340yaa c1863340yaa = this.LLILLJJLI;
        String str = this.LLILLL;
        boolean z = this.LLILZ;
        String str2 = this.LLILZIL;
        messageViewModel.getClass();
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(messageViewModel), C0PEM.LIZJ, null, new C1861500yXc(c1863340yaa, messageViewModel, str, str2, z, null), 2);
        return Unit.LIZ;
    }
}
