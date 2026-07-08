package X;

import com.bytedance.hox.Hox;
import com.ss.android.ugc.feed.platform.panel.earphone.EarphonePlayerControlComponent;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0SXZ, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SXZ extends C09AY implements Function0<Hox> {
    public final /* synthetic */ EarphonePlayerControlComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0SXZ(EarphonePlayerControlComponent earphonePlayerControlComponent) {
        super(0);
        this.LL = earphonePlayerControlComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Hox invoke() {
        C19EG c19egLIZ = C724240Sb0.LIZ(this.LL);
        if (c19egLIZ != null) {
            return Hox.LLJILJIL.LIZ(c19egLIZ);
        }
        return null;
    }
}
