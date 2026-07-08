package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.AwS560S0100000_16;

/* JADX INFO: renamed from: X.0cOs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1010400cOs implements InterfaceC1010420cOu {
    public final Context LIZ;
    public final Aweme LIZIZ;
    public final View LIZJ;
    public final AwS560S0100000_16 LIZLLL;
    public final /* synthetic */ C1010510cP3 LJ;

    @Override // X.InterfaceC1010420cOu
    public final C1010580cPA LIZIZ() {
        return this.LJ.LL;
    }

    @Override // X.InterfaceC1010420cOu
    public final AwS560S0100000_16 LIZ() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC1010420cOu
    public final Aweme getAweme() {
        return this.LIZIZ;
    }

    public C1010400cOs(C1010510cP3 c1010510cP3) {
        this.LJ = c1010510cP3;
        this.LIZ = c1010510cP3.LLILZ;
        this.LIZIZ = c1010510cP3.LLILLJJLI;
        this.LIZJ = c1010510cP3.LL.LIZ;
        this.LIZLLL = new AwS560S0100000_16(c1010510cP3, 764);
    }
}
