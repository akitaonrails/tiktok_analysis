package X;

import android.content.Context;
import com.bytedance.tux.icon.TuxIconView;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: renamed from: X.0GXv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C417290GXv implements C1A4X {
    public final Context LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1077));
    public final EnumC429170GsF LIZJ = EnumC429170GsF.FILTER;

    @Override // X.C1A4X
    public final TuxIconView getIcon() {
        return (TuxIconView) this.LIZIZ.getValue();
    }

    @Override // X.C1A4X
    public final EnumC429170GsF getTag() {
        return this.LIZJ;
    }

    public C417290GXv(Context context) {
        this.LIZ = context;
    }
}
