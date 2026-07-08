package X;

import Y.ARunnableS15S0310000_31;
import android.content.Context;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.io.File;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.15VJ, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15VJ {
    public static final /* synthetic */ int LIZ = 0;

    public static Pair LIZ(Aweme aweme) {
        if (!C20530215Vc.LIZIZ() || aweme == null) {
            return null;
        }
        int i = (C1389340mG4.LIZJ(null, null).LIZIZ - (C15UB.LLILZ * 3)) / 2;
        C15UU.LIZ.getClass();
        return new Pair(Integer.valueOf(i), Integer.valueOf((int) (i * C15UU.LIZIZ(aweme))));
    }

    public static boolean LIZIZ(String str, String str2) {
        InterfaceC1326920kdO interfaceC1326920kdO;
        C1325710kbR c1325710kbRLIZ;
        boolean zLJII = false;
        try {
            if (!C1328130kfL.LJIJJLI()) {
                return false;
            }
            Class<?> cls = C1322200kVm.LIZ;
            C1333180knU c1333180knULJIIIZ = C1328130kfL.LJIILIIL().LJIIIZ();
            if (c1333180knULJIIIZ == null || (interfaceC1326920kdO = (InterfaceC1326920kdO) c1333180knULJIIIZ.get(str2)) == null || (c1325710kbRLIZ = C1325710kbR.LIZ(UriProtector.parse(str))) == null) {
                return false;
            }
            C1324810kZz c1324810kZzLJI = C1324810kZz.LJI();
            c1324810kZzLJI.getClass();
            zLJII = interfaceC1326920kdO.LJII(c1324810kZzLJI.LJ(c1325710kbRLIZ.LIZIZ));
            return zLJII;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return zLJII;
        }
    }

    public static InterfaceC469401sC LIZJ(Context context, final C20530015Va c20530015Va, EnumC1334360kpO enumC1334360kpO, final Function1 function1) {
        ImageUrlModel imageUrlModel = c20530015Va.LIZIZ;
        if (imageUrlModel == null) {
            function1.invoke(Boolean.FALSE);
            return null;
        }
        if (!C1328130kfL.LJIJJLI()) {
            function1.invoke(Boolean.FALSE);
            return null;
        }
        if (C0SNG.LIZ().enable && C0SNG.LIZ().exploreFirstScreenPriority && enumC1334360kpO == EnumC1334360kpO.IMMEDIATE) {
            C1EE2.LIZIZ.LJLI(enumC1334360kpO, (String) C13LP.LJJJLL(imageUrlModel.getUrls()));
        }
        C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(c20530015Va.LIZIZ);
        c1331670kl3LJIIIIZZ.LJJIIJZLJL = C823050WQl.LIZLLL();
        c1331670kl3LJIIIIZZ.LJJIJL(context);
        c1331670kl3LJIIIIZZ.LJJIII = enumC1334360kpO;
        Pair pairLIZ = LIZ(c20530015Va.LIZJ);
        if (pairLIZ != null) {
            int iIntValue = ((Number) pairLIZ.getFirst()).intValue();
            int iIntValue2 = ((Number) pairLIZ.getSecond()).intValue();
            c1331670kl3LJIIIIZZ.LJIIIIZZ = iIntValue;
            c1331670kl3LJIIIIZZ.LJIIIZ = iIntValue2;
        }
        if (C1335180kqi.LIZLLL()) {
            c1331670kl3LJIIIIZZ.LJJIIZ = EnumC714850S2h.CUSTOM;
            c1331670kl3LJIIIIZZ.LJJJJJ = "explore_feed_image_cache";
        } else if (C1335190kqj.LIZJ()) {
            c1331670kl3LJIIIIZZ.LJJIIZ = EnumC714850S2h.CUSTOM;
            c1331670kl3LJIIIIZZ.LJJJJJ = "photomode_image_cache_v2";
        }
        if (C20530215Vc.LIZJ()) {
            return c1331670kl3LJIIIIZZ.LJJIIJZLJL(new C20749916Hp(function1, c20530015Va, 0));
        }
        return c1331670kl3LJIIIIZZ.LJIJ(new InterfaceC605070NoH() { // from class: X.15VL
            @Override // X.InterfaceC605070NoH
            public final void onCanceled() {
                Function1<Boolean, Unit> function12 = function1;
                if (function12 != null) {
                    function12.invoke(Boolean.FALSE);
                }
                C15VC.LIZ(C2296808zG.LIZ(C0PEM.LIZJ), c20530015Va);
            }

            @Override // X.InterfaceC605070NoH
            public final void LIZ(File file) {
                Aweme aweme;
                String aid;
                Function1<Boolean, Unit> function12 = function1;
                if (function12 != null) {
                    function12.invoke(Boolean.TRUE);
                }
                if (C1335180kqi.LIZ() && (aweme = c20530015Va.LIZJ) != null && (aid = aweme.getAid()) != null) {
                    C15VC.LIZIZ.add(aid);
                }
                C15VC.LIZ(C2296808zG.LIZ(C0PEM.LIZJ), c20530015Va);
            }

            @Override // X.InterfaceC605070NoH
            public final void onFailed(Throwable th) {
                Function1<Boolean, Unit> function12 = function1;
                if (function12 != null) {
                    function12.invoke(Boolean.FALSE);
                }
                C15VC.LIZ(C2296808zG.LIZ(C0PEM.LIZJ), c20530015Va);
            }
        });
    }

    public static void LIZLLL(Context context, EnumC1334360kpO enumC1334360kpO, List list, boolean z) {
        C823050WQl.LIZLLL().execute(new ARunnableS15S0310000_31(context, enumC1334360kpO, list, z, 1));
    }
}
