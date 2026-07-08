package X;

import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffectModel;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0sed, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1635210sed extends C1635250seh implements InterfaceC1634480sdS<ProviderEffect, ProviderEffectModel> {
    public final int LJFF;

    @Override // X.InterfaceC1634480sdS
    public final C19482011Jy LIZ() {
        return LJFF(this.LJFF);
    }

    @Override // X.InterfaceC1634480sdS
    public final C19482011Jy next() {
        return LIZ().LJIL(C312820COa.LL);
    }

    public /* synthetic */ C1635210sed(Function0 function0, String str, String str2, int i) {
        this(function0, str, str2, i, C1635240seg.LIZ);
    }

    public C1635210sed(Function0<? extends InterfaceC1635390sev> function0, String str, String str2, int i, C1634860se4 c1634860se4) {
        super(function0, str, str2, c1634860se4);
        this.LJFF = i;
    }
}
