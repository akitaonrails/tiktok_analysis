package X;

import com.ss.android.ugc.aweme.offlinemode.ui.popup.OfflineModeSwitchComponent;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Ofm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C625280Ofm extends C09AY implements Function0<C625290Ofn> {
    public final /* synthetic */ OfflineModeSwitchComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C625280Ofm(OfflineModeSwitchComponent offlineModeSwitchComponent) {
        super(0);
        this.LL = offlineModeSwitchComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C625290Ofn invoke() {
        return new C625290Ofn(this.LL);
    }
}
