package X;

import com.ss.android.ugc.aweme.offlinemode.ui.popup.OfflineModeSwitchComponent;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Ofo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C625300Ofo extends C09AY implements Function0<C625320Ofq> {
    public final /* synthetic */ OfflineModeSwitchComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C625300Ofo(OfflineModeSwitchComponent offlineModeSwitchComponent) {
        super(0);
        this.LL = offlineModeSwitchComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C625320Ofq invoke() {
        return new C625320Ofq(this.LL);
    }
}
