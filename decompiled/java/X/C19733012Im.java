package X;

import X.C830490Whz;
import com.ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.ss.android.ugc.aweme.tools.beauty.BeautyCategoryExtra;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS604S0100000_25;
import ln3.a;

/* JADX INFO: renamed from: X.12Im, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19733012Im {
    public final InterfaceC1650230t2r LIZ;
    public final a LIZIZ;
    public final Function1<Boolean, Unit> LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public long LJII;
    public final C830490Whz<String, Boolean> LJI = new C830490Whz<>();
    public final C19732912Il LJIIIIZZ = new InterfaceC19731812Ia() { // from class: X.12Il
        @Override // X.InterfaceC19731812Ia
        public final void LIZIZ() {
        }

        @Override // X.InterfaceC19731812Ia
        public final void LIZJ() {
        }

        @Override // X.InterfaceC19731812Ia
        public final void LJ() {
        }

        @Override // X.InterfaceC19731812Ia
        public final void LJI() {
        }

        @Override // X.InterfaceC19731812Ia
        public final void LJII() {
        }

        @Override // X.InterfaceC19731812Ia
        public final void LJIIJJI() {
        }

        @Override // X.InterfaceC19731812Ia
        public final void r3() {
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
        @Override // X.InterfaceC19731812Ia
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void LIZ(com.ss.android.ugc.aweme.tools.beauty.BeautyCategory r4) {
            /*
                r3 = this;
                X.12Im r2 = r3.LIZ
                com.ss.android.ugc.aweme.tools.beauty.BeautyCategoryExtra r0 = r4.getBeautyCategoryExtra()
                if (r0 == 0) goto L1f
                boolean r1 = r0.showTips
                r0 = 1
                if (r1 != r0) goto L1f
            Ld:
                r2.LJFF = r0
                X.12Im r2 = r3.LIZ
                r2.getClass()
                kotlin.jvm.internal.AwS573S0100000_29 r1 = new kotlin.jvm.internal.AwS573S0100000_29
                r0 = 38
                r1.<init>(r2, r0)
                X.C01TT.LIZLLL(r1)
                return
            L1f:
                r0 = 0
                goto Ld
            */
            throw new UnsupportedOperationException("Method not decompiled: X.C19732912Il.LIZ(com.ss.android.ugc.aweme.tools.beauty.BeautyCategory):void");
        }

        @Override // X.InterfaceC19731812Ia
        public final void LIZLLL(ComposerBeauty composerBeauty) {
            if (!C12HP.LIZLLL(composerBeauty) && !composerBeauty.getCategoryExclusive() && composerBeauty.getExtra().isNone()) {
                C19733012Im c19733012Im = this.LIZ;
                c19733012Im.LJI.clear();
                c19733012Im.LIZ();
            }
        }

        @Override // X.InterfaceC19731812Ia
        public final void LJFF(ComposerBeauty composerBeauty, int i) {
            boolean z;
            BeautyCategoryExtra categoryExtra = composerBeauty.getCategoryExtra();
            if (categoryExtra != null) {
                C19733012Im c19733012Im = this.LIZ;
                if (categoryExtra.showTips) {
                    C830490Whz<String, Boolean> c830490Whz = c19733012Im.LJI;
                    String resourceId = composerBeauty.getEffect().getResourceId();
                    if (i != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    c830490Whz.put(resourceId, Boolean.valueOf(z));
                    c19733012Im.LIZ();
                }
            }
        }
    };

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ() {
        boolean z;
        Iterator it2 = ((C830490Whz.a) this.LJI.entrySet()).iterator();
        while (true) {
            C830520Wi2 c830520Wi2 = (C830520Wi2) it2;
            if (!c830520Wi2.hasNext()) {
                z = false;
                break;
            }
            c830520Wi2.next();
            if (((Boolean) c830520Wi2.getValue()).booleanValue()) {
                z = true;
                break;
            }
        }
        if (this.LIZLLL != z) {
            this.LIZLLL = z;
            C01TT.LIZLLL(new AwS573S0100000_29(this, 38));
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.12Il] */
    public C19733012Im(InterfaceC1650230t2r interfaceC1650230t2r, a aVar, AwS604S0100000_25 awS604S0100000_25) {
        this.LIZ = interfaceC1650230t2r;
        this.LIZIZ = aVar;
        this.LIZJ = awS604S0100000_25;
    }
}
