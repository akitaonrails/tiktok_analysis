package X;

import com.ss.android.ugc.aweme.profile.tab.profiletab.base.basebusiness.ITabBusinessListener;

/* JADX INFO: renamed from: X.0iq9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public class C1257950iq9 {
    public final int LIZ;
    public final ITabBusinessListener LIZIZ;
    public final boolean LIZJ;

    public ITabBusinessListener LIZ() {
        return this.LIZIZ;
    }

    public boolean LIZIZ() {
        return this.LIZJ;
    }

    public /* synthetic */ C1257950iq9(int i, ITabBusinessListener iTabBusinessListener, int i2) {
        this(i, (i2 & 2) != 0 ? null : iTabBusinessListener, false);
    }

    public C1257950iq9(int i, ITabBusinessListener iTabBusinessListener, boolean z) {
        this.LIZ = i;
        this.LIZIZ = iTabBusinessListener;
        this.LIZJ = z;
    }
}
