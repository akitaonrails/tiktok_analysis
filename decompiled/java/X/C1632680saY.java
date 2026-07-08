package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.AwS391S0200000_25;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0saY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1632680saY implements InterfaceC1446830nkn {
    public final InterfaceC1624480sNK LIZ;
    public final InterfaceC1625220sOW LIZIZ;
    public final CreativeModel LIZJ;
    public final Map<String, HashSet<String>> LIZLLL = new LinkedHashMap();
    public final ExecutorService LJ;

    @Override // X.InterfaceC1446830nkn
    public final void LIZ(String str) {
        HashSet hashSet = (HashSet) ((LinkedHashMap) this.LIZLLL).get(str);
        if (hashSet != null) {
            hashSet.clear();
        }
    }

    @Override // X.InterfaceC1446830nkn
    public final void LJ(int i) {
        if ((i != 0 || !Intrinsics.LJFF(this.LIZ.LJJLIIIJJIZ().LIZ, "xssticker")) && this.LIZ.LJJIII() != -1) {
            this.LIZIZ.LJ(i, System.currentTimeMillis() - this.LIZ.LJJIII());
            this.LIZ.LJJLIIJ(-1L);
            this.LIZIZ.LJIIIZ().LIZ("shown_sticker");
        }
    }

    public C1632680saY(InterfaceC1624480sNK interfaceC1624480sNK, InterfaceC1625220sOW interfaceC1625220sOW, CreativeModel creativeModel) {
        this.LIZ = interfaceC1624480sNK;
        this.LIZIZ = interfaceC1625220sOW;
        this.LIZJ = creativeModel;
        C2123408To c2123408ToLIZ = C2123508Tp.LIZ(C0WQX.SERIAL);
        c2123408ToLIZ.LIZIZ = "default_sticker_view_mob";
        this.LJ = C823050WQl.LIZ(c2123408ToLIZ.LIZ());
    }

    @Override // X.InterfaceC1446830nkn
    public final void LIZJ(List<? extends Effect> list, List<String> list2, List<Integer> list3) {
        this.LIZIZ.LJIIIIZZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x011f  */
    @Override // X.InterfaceC1446830nkn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(int r13, java.lang.String r14, java.lang.String r15, android.os.Bundle r16, kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends com.ss.android.ugc.effectmanager.effect.model.Effect> r17) {
        /*
            Method dump skipped, instruction units count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1632680saY.LIZIZ(int, java.lang.String, java.lang.String, android.os.Bundle, kotlin.jvm.functions.Function1):void");
    }

    @Override // X.InterfaceC1446830nkn
    public final void LIZLLL(int i, int i2, String str, String str2, Bundle bundle, AwS391S0200000_25 awS391S0200000_25) {
        int i3 = i;
        if (i3 < 1) {
            i3 = 1;
        }
        int i4 = i2 + 1;
        while (i3 < i4) {
            LIZIZ(i3, str, str2, bundle, awS391S0200000_25);
            i3++;
        }
    }
}
