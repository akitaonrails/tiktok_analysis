package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.ss.android.ugc.aweme.story.model.streaks.StoryStreakEnterEditParam;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS198S0000000_11;

/* JADX INFO: renamed from: X.0J9I, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0J9I {
    public static final C0J9I LIZ = new C0J9I();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(322));

    public static final void LIZ(C126P c126p, Context context, String str, StoryStreakEnterEditParam storyStreakEnterEditParam, int i) {
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C485380J1s(c126p, context, str, storyStreakEnterEditParam, i, null), 3);
    }

    public static final void LIZIZ(C118300cf c118300cf, final C1295960jpS c1295960jpS, final C259800zU<Bitmap> c259800zU, final C259800zU<Bitmap> c259800zU2, final C259800zU<Bitmap> c259800zU3, final C259800zU<Bitmap> c259800zU4, final Context context, final String str, final StoryStreakEnterEditParam storyStreakEnterEditParam, final String str2, final InterfaceC1685430txd<? super Context, ? super String, ? super StoryStreakEnterEditParam, ? super String, ? super String, ? super Integer, Unit> interfaceC1685430txd) {
        int i = c118300cf.element + 1;
        c118300cf.element = i;
        if (i == 2) {
            c1295960jpS.addLottieOnCompositionLoadedListener(new InterfaceC1296230jpt() { // from class: X.0J9J
                @Override // X.InterfaceC1296230jpt
                public final void LIZ(C1294720jnS c1294720jnS) {
                    C1295950jpR c1295950jpR;
                    C1295960jpS c1295960jpS2 = c1295960jpS;
                    C259800zU<Bitmap> c259800zU5 = c259800zU;
                    C259800zU<Bitmap> c259800zU6 = c259800zU2;
                    C259800zU<Bitmap> c259800zU7 = c259800zU3;
                    C259800zU<Bitmap> c259800zU8 = c259800zU4;
                    c1295960jpS2.updateBitmap("storystreak_fire.png", c259800zU5.element);
                    c1295960jpS2.updateBitmap("storystreak_shadow.png", c259800zU6.element);
                    c1295960jpS2.updateBitmap("storystreak_avatar01.png", c259800zU7.element);
                    c1295960jpS2.updateBitmap("storystreak_avatar02.png", c259800zU8.element);
                    Drawable drawable = c1295960jpS.getDrawable();
                    if (drawable instanceof C1295950jpR) {
                        c1295950jpR = (C1295950jpR) drawable;
                        if (c1295950jpR != null) {
                            c1295950jpR.setCallback(c1295960jpS);
                        }
                    } else {
                        c1295950jpR = null;
                    }
                    C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C126Z(context, str, c1295950jpR, storyStreakEnterEditParam, str2, interfaceC1685430txd, null), 3);
                }
            });
        }
    }
}
