package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.MobileEffect;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Dbo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C342540Dbo {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2188));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2189));
    public static WeakReference<Drawable> LIZJ = new WeakReference<>(null);

    public static final Drawable LIZ(Context context) {
        Drawable drawable = LIZJ.get();
        if (drawable != null) {
            return drawable;
        }
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        c419910GdJ.LIZ = R.raw.icon_clock_fill;
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1x);
        TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(context);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.ee);
        c384050F3z.LIZJ = Float.valueOf(Float.MAX_VALUE);
        LayerDrawable layerDrawableLJIILIIL = C426750GoL.LJIILIIL(tuxIconDrawableLIZ, c384050F3z.LIZ(context));
        LIZJ = new WeakReference<>(layerDrawableLJIILIIL);
        return layerDrawableLJIILIIL;
    }

    public static final boolean LIZIZ(Effect effect) {
        boolean zLIZ;
        MobileEffect mobileEffect;
        if (effect == null) {
            return false;
        }
        if (((Boolean) LIZ.getValue()).booleanValue()) {
            zLIZ = ((Boolean) LIZIZ.getValue()).booleanValue();
        } else {
            zLIZ = C1656550tD3.LIZ();
        }
        if (!zLIZ) {
            return false;
        }
        if (effect instanceof MobileEffect) {
            mobileEffect = (MobileEffect) effect;
        } else {
            mobileEffect = null;
        }
        if (mobileEffect != null) {
            if (mobileEffect.getFromType() != 3) {
                return false;
            }
            return true;
        }
        String extra = effect.getExtra();
        if (extra != null && extra.length() != 0) {
            try {
                if (a0.LJJIIZI(extra, "extra_from_type", false)) {
                    C1446130njf.LIZ.getClass();
                    JSONObject jSONObjectLJII = C1446130njf.LJII(effect);
                    if (jSONObjectLJII != null) {
                        if (jSONObjectLJII.optInt("extra_from_type", -1) == 3) {
                            return true;
                        }
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        return false;
    }
}
