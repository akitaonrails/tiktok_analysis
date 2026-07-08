package X;

import com.bytedance.hox.Hox;
import com.ss.android.ugc.aweme.main.assems.tabs.TabAbilityAssem;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0qon, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1564630qon extends C09AY implements Function0<Hox> {
    public final /* synthetic */ TabAbilityAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1564630qon(TabAbilityAssem tabAbilityAssem) {
        super(0);
        this.LL = tabAbilityAssem;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Hox invoke() {
        C446900Hfk c446900Hfk = Hox.LLJILJIL;
        C19EG c19egLIZ = C724240Sb0.LIZ(this.LL);
        if (c19egLIZ != null) {
            return c446900Hfk.LIZ(c19egLIZ);
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}
