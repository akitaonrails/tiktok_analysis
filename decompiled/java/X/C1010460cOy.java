package X;

import android.content.Context;
import android.view.ViewGroup;
import com.google.gson.n;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: renamed from: X.0cOy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1010460cOy {
    public final Aweme LIZ;
    public final Context LIZIZ;
    public final InterfaceC1009890cO3 LIZJ;
    public final InterfaceC1003440cDe LIZLLL;
    public final ViewGroup LJ;
    public final n LJFF;

    public C1010460cOy(Aweme aweme, Context context, InterfaceC1009890cO3 interfaceC1009890cO3, InterfaceC1003440cDe interfaceC1003440cDe, ViewGroup viewGroup, n nVar, int i) {
        aweme = (i & 1) != 0 ? null : aweme;
        context = (i & 2) != 0 ? null : context;
        interfaceC1009890cO3 = (i & 4) != 0 ? null : interfaceC1009890cO3;
        interfaceC1003440cDe = (i & 8) != 0 ? null : interfaceC1003440cDe;
        viewGroup = (i & 16) != 0 ? null : viewGroup;
        nVar = (i & 32) != 0 ? null : nVar;
        this.LIZ = aweme;
        this.LIZIZ = context;
        this.LIZJ = interfaceC1009890cO3;
        this.LIZLLL = interfaceC1003440cDe;
        this.LJ = viewGroup;
        this.LJFF = nVar;
    }
}
