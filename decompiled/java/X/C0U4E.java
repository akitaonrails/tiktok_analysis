package X;

import com.bytedance.android.live.base.model.UrlModel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import java.util.List;

/* JADX INFO: renamed from: X.0U4E, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0U4E extends C0IYA {
    public long LIZ;
    public boolean LIZIZ;
    public final /* synthetic */ LiveEffect LIZJ;
    public final /* synthetic */ C0U9B LIZLLL;

    @Override // X.C0IYA, X.InterfaceC1142670fqD
    public final void LIZ() {
        this.LIZ = System.currentTimeMillis();
    }

    public C0U4E(LiveEffect liveEffect, C0U9B c0u9b) {
        String str;
        List<String> list;
        this.LIZJ = liveEffect;
        this.LIZLLL = c0u9b;
        UrlModel icon = liveEffect.getIcon();
        if (icon != null && (list = icon.urlList) != null) {
            str = (String) C13LP.LJJJLL(list);
        } else {
            str = null;
        }
        this.LIZIZ = C1819620xS4.LIZJ(str);
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0U4D(liveEffect, this, null), 3);
    }

    @Override // X.C0IYA, X.InterfaceC1142670fqD
    public final void LIZLLL(String str, Exception exc) {
        this.LIZLLL.LLLZLZ(System.currentTimeMillis() - this.LIZ, this.LIZJ, false);
    }

    @Override // X.C0IYA, X.InterfaceC1142670fqD
    public final void LIZJ(int i, int i2, String str) {
        if (this.LIZIZ) {
            return;
        }
        this.LIZLLL.LLLZLZ(System.currentTimeMillis() - this.LIZ, this.LIZJ, true);
    }
}
