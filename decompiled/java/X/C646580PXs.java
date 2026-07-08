package X;

import com.ss.android.ugc.aweme.search.arch.v2.services.signal.impl.SearchContextAbilityImpl;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;

/* JADX INFO: renamed from: X.0PXs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C646580PXs {
    public static void LIZ() {
        if (SearchContextAbilityImpl.LLLI) {
            return;
        }
        SearchContextAbilityImpl.LLLI = true;
        C823050WQl.LIZLLL().execute(new Runnable() { // from class: X.0Q2y
            @Override // java.lang.Runnable
            @C1BCF(distinctId = 20, scene = "boot", taskPriority = EnumC21352718hJ.P2)
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("SearchContextAbilityImpl$Companion@1f70.asyncPrepare$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("SearchContextAbilityImpl$Companion@1f70.asyncPrepare$1");
            }

            public static void LIZ() {
                ISearchContextAbility iSearchContextAbilityLJFF = C0Q3E.LJFF();
                iSearchContextAbilityLJFF.R22().LIZJ();
                iSearchContextAbilityLJFF.Ww1().LIZJ();
                iSearchContextAbilityLJFF.P70().LIZJ();
                iSearchContextAbilityLJFF.ak0().LIZJ();
                iSearchContextAbilityLJFF.Ph1().LIZJ();
                iSearchContextAbilityLJFF.Wg1().LIZJ();
                iSearchContextAbilityLJFF.gX().LIZJ();
                iSearchContextAbilityLJFF.Xf0().LIZJ();
                iSearchContextAbilityLJFF.wO2().LIZJ();
                iSearchContextAbilityLJFF.Y30().LIZJ();
                iSearchContextAbilityLJFF.zJ2().LIZJ();
                iSearchContextAbilityLJFF.FU1().LIZJ();
                iSearchContextAbilityLJFF.uF().LIZJ();
                iSearchContextAbilityLJFF.Y52().LIZJ();
                iSearchContextAbilityLJFF.cp2().LIZJ();
                iSearchContextAbilityLJFF.AX1().LIZJ();
                new C650910Pg1(31, null, null, null, false);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static SearchContextAbilityImpl LIZIZ() {
        return new SearchContextAbilityImpl(127, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0);
    }
}
