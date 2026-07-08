package X;

import android.view.View;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.AwS600S0100000_21;

/* JADX INFO: renamed from: X.0mM1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1393030mM1 implements InterfaceC1247150iYj {
    public final User LIZ;
    public final View LIZIZ;
    public final TuxIconView LIZJ;

    @Override // X.InterfaceC1247150iYj
    public final C1247510iZJ get() {
        C1247510iZJ c1247510iZJ = new C1247510iZJ();
        c1247510iZJ.LIZIZ(C1393100mM8.LIZ(this.LIZ));
        c1247510iZJ.LIZ(new AwS600S0100000_21(this, 308));
        return c1247510iZJ;
    }

    public C1393030mM1(User user, View view, TuxIconView tuxIconView) {
        this.LIZ = user;
        this.LIZIZ = view;
        this.LIZJ = tuxIconView;
    }
}
