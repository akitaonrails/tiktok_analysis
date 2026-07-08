package X;

import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;
import java.util.Stack;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Tyy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C764580Tyy {
    public final C097O LIZ;
    public final KaraokeViewModel LIZIZ;
    public final Stack<EnumC764590Tyz> LIZJ = new Stack<>();
    public long LIZLLL = -1;

    public final EnumC764770TzH LIZJ() {
        if (this.LIZJ.isEmpty()) {
            return EnumC764770TzH.OTHER;
        }
        EnumC764590Tyz enumC764590TyzPeek = this.LIZJ.peek();
        if (enumC764590TyzPeek != null) {
            int i = C764550Tyv.LIZ[enumC764590TyzPeek.ordinal()];
            if (i == 1) {
                KaraokeViewModel karaokeViewModel = this.LIZIZ;
                return Intrinsics.LJFF(karaokeViewModel.LLJILJILJ.get(Integer.valueOf(karaokeViewModel.LLJILLL)), Boolean.TRUE) ? EnumC764770TzH.SEARCH : EnumC764770TzH.NORMAL;
            }
            if (i == 2) {
                return this.LIZLLL == -999 ? EnumC764770TzH.QUEUE : EnumC764770TzH.REQUESTS;
            }
        }
        return EnumC764770TzH.OTHER;
    }

    public C764580Tyy(C097O c097o, KaraokeViewModel karaokeViewModel) {
        this.LIZ = c097o;
        this.LIZIZ = karaokeViewModel;
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.C764750TzF r8, X.InterfaceC1364105Vn<? super kotlin.Unit> r9) {
        /*
            Method dump skipped, instruction units count: 695
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C764580Tyy.LIZ(X.0TzF, X.05Vn):java.lang.Object");
    }

    public final Object LIZIZ(EnumC764520Tys enumC764520Tys, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        C20441214yg.LIZIZ("KLazy#openLib", String.valueOf(C13LQ.LJJJ(this.LIZJ.toArray(), null, null, null, null, 63)));
        Stack<EnumC764590Tyz> stack = this.LIZJ;
        EnumC764590Tyz enumC764590Tyz = EnumC764590Tyz.LL;
        if (!stack.contains(enumC764590Tyz)) {
            this.LIZJ.push(enumC764590Tyz);
            Object objLIZ = this.LIZ.LIZ(new C764600Tz0(enumC764520Tys), interfaceC1364105Vn);
            if (objLIZ == C099R.LJFF()) {
                return objLIZ;
            }
            return Unit.LIZ;
        }
        return Unit.LIZ;
    }
}
