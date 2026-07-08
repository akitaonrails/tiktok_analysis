package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0I3o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C460380I3o extends C0I5K {
    public final InterfaceC460300I3g LJIILLIIL;
    public final InterfaceC1320380kSq LJIIZILJ;

    @Override // X.C0I5K
    public InterfaceC1320380kSq LIZIZ() {
        return this.LJIIZILJ;
    }

    public C460380I3o(UrlModel urlModel, boolean z, C1233704sB c1233704sB, InterfaceC1320380kSq interfaceC1320380kSq) {
        Integer numValueOf;
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
        C0I5E c0i5e = C0I5E.PLAY;
        C460450I3v c460450I3v = new C460450I3v(R.raw.icon_play_fill, Integer.valueOf(R.attr.ef));
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(90));
        int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(120));
        if (z) {
            numValueOf = Integer.valueOf(R.drawable.c_k);
        } else {
            numValueOf = null;
        }
        super(urlModel, Integer.valueOf(R.drawable.c_l), Integer.valueOf(R.drawable.c_l), interfaceC1320380kSq, null, z, null, c1233704sB, c0i5e, null, c460450I3v, iLIZIZ3, iLIZIZ2, iLIZIZ, numValueOf, 16976);
        this.LJIILLIIL = c1233704sB;
        this.LJIIZILJ = interfaceC1320380kSq;
    }

    public /* synthetic */ C460380I3o(UrlModel urlModel, boolean z, C1233704sB c1233704sB, InterfaceC1320380kSq interfaceC1320380kSq, int i) {
        this(urlModel, (i & 2) != 0 ? false : z, c1233704sB, (i & 8) != 0 ? InterfaceC1320380kSq.LIZ : interfaceC1320380kSq);
    }
}
