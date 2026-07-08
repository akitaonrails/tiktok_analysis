package X;

import com.ss.android.ugc.aweme.pipo.cashier.cashier.ccdc.CCDCAddCardViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0uaG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final /* synthetic */ class C1709380uaG extends C2217421BqW implements Function1<String, Unit> {
    public C1709380uaG(Object obj) {
        super(1, obj, CCDCAddCardViewModel.class, "showErrorToast", "showErrorToast(Ljava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        ((CCDCAddCardViewModel) this.receiver).HQ2(str);
        return Unit.LIZ;
    }
}
