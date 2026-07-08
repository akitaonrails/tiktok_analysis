package X;

import Y.AfS139S0200000_3;
import Y.AfS172S0100000_3;
import android.content.Context;
import android.graphics.drawable.Drawable;
import com.bytedance.android.live.base.model.ImageModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.09Oa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2363809Oa {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(C1324720kZq c1324720kZq, String str, boolean z, C11NJ c11nj) {
        if (!z) {
            c11nj.LIZ(C11NZ.LJIJJLI(new C2365109On("tiktok_live_interaction_guest_showdown", str)).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJL(C11S5.LIZ()).LJJLL(new AfS172S0100000_3(c1324720kZq, 73), new C09JN() { // from class: X.00JZ
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("ImageUtilsForScreenShot@c8a.loadGeckoImage$2");
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("loadAvatarPlaceholderImage fail, ");
                    sbLIZ.append(((Throwable) obj).getMessage());
                    C20441214yg.LJ("ImageUtilsForScreenShot", C2188811AlT.LIZIZ(sbLIZ));
                    C1C7U.LIZIZ("ImageUtilsForScreenShot@c8a.loadGeckoImage$2");
                }
            }));
        } else {
            C1143680frq.LIZLLL(c1324720kZq, "tiktok_live_interaction_guest_showdown", str);
        }
    }

    public static void LIZ(Context context, ImageModel imageModel, Function1 function1, Function1 function12, C11NJ c11nj) {
        c11nj.LIZ(C1121670fIL.LJ(imageModel).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS139S0200000_3((Object) context, (Context) function1, (Function1<? super Drawable, Unit>) 8), new AfS172S0100000_3(function12, 72)));
    }
}
