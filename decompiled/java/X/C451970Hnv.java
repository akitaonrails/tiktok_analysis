package X;

import android.content.Context;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AwS51S0010000_6;

/* JADX INFO: renamed from: X.0Hnv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C451970Hnv {
    public final Context LIZ;
    public final String LIZIZ;
    public final List<Integer> LIZJ;
    public final String LIZLLL;
    public final InterfaceC2257101DWa LJ;
    public final Function0<Boolean> LJFF;
    public final boolean LJI;
    public final C01GW LJII;
    public final C1DFK LJIIIIZZ;
    public boolean LJIIIZ;

    public final String LIZ() {
        String uniqueId = this.LJ.getUniqueId();
        String shortId = (uniqueId == null || uniqueId.length() == 0) ? this.LJ.getShortId() : this.LJ.getUniqueId();
        return shortId == null ? "" : shortId;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x026a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x026f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.InterfaceC1364105Vn<? super java.lang.String> r16) {
        /*
            Method dump skipped, instruction units count: 638
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C451970Hnv.LIZIZ(X.05Vn):java.lang.Object");
    }

    public C451970Hnv(Context context, String str, List list, String str2, InterfaceC2257101DWa interfaceC2257101DWa, AwS51S0010000_6 awS51S0010000_6, boolean z) {
        this.LIZ = context;
        this.LIZIZ = str;
        this.LIZJ = list;
        this.LIZLLL = str2;
        this.LJ = interfaceC2257101DWa;
        this.LJFF = awS51S0010000_6;
        this.LJI = z;
        if (list.size() == 2) {
            this.LJII = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(497));
            this.LJIIIIZZ = C23118094a.LIZ();
            return;
        }
        throw new IllegalArgumentException("video width or video height not available.");
    }
}
