package X;

import android.text.SpannableStringBuilder;
import java.util.List;

/* JADX INFO: renamed from: X.18eo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21337218eo {
    public final SpannableStringBuilder LIZ;
    public final long LIZIZ;
    public final boolean LIZJ;
    public final InterfaceC21337118en LIZLLL;
    public final Float LJ;
    public final List<InterfaceC21337118en> LJFF;

    public C21337218eo(SpannableStringBuilder spannableStringBuilder, long j, boolean z, InterfaceC21337118en interfaceC21337118en, Float f, List list, int i) {
        spannableStringBuilder = (i & 1) != 0 ? null : spannableStringBuilder;
        j = (i & 2) != 0 ? 0L : j;
        z = (i & 4) != 0 ? false : z;
        interfaceC21337118en = (i & 8) != 0 ? null : interfaceC21337118en;
        f = (i & 16) != 0 ? null : f;
        list = (i & 32) != 0 ? null : list;
        this.LIZ = spannableStringBuilder;
        this.LIZIZ = j;
        this.LIZJ = z;
        this.LIZLLL = interfaceC21337118en;
        this.LJ = f;
        this.LJFF = list;
    }
}
