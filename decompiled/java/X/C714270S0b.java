package X;

import com.ss.android.ugc.aweme.detail.lynxcard.DetailLynxCard;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0S0b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C714270S0b extends C09AY implements Function1<C0RF0, C0SZ8> {
    public C714270S0b() {
        super(1);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0RAt] */
    @Override // kotlin.jvm.functions.Function1
    public final C0SZ8 invoke(C0RF0 c0rf0) {
        C0RF0 c0rf02 = c0rf0;
        return new DetailLynxCard(c0rf02, new C0SZR<DetailLynxCard, C691580RAu>(c0rf02) { // from class: X.0RAt
            {
                super(((C0SZR) c0rf02.LJIILL).LIZ);
            }

            @Override // X.C0SZR
            public final String LIZLLL(C0OB8 c0ob8, C0RGF c0rgf, int i) {
                C691580RAu c691580RAu = (C691580RAu) c0ob8;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(c691580RAu);
                sbLIZ.append(", position: ");
                sbLIZ.append(i);
                sbLIZ.append(", aweme: ");
                sbLIZ.append(c691580RAu.LL);
                sbLIZ.append('.');
                return C2188811AlT.LIZIZ(sbLIZ);
            }
        });
    }
}
