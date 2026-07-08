package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.ss.android.ugc.aweme.effectcreator.models.CKEDraftIconAsset;
import com.ss.android.ugc.aweme.prop.mobileefffect.EditImageEffectImgCreatorData;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0vI1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1736510vI1 {
    public static final C419910GdJ LIZIZ() {
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_pen_fill;
        c419910GdJ.LJ = Integer.valueOf(R.attr.zi);
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        return c419910GdJ;
    }

    public static final Drawable LIZJ(Context context) {
        if (context == null) {
            return null;
        }
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(31));
        c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(31));
        c384050F3z.LJFF = Integer.valueOf(R.attr.zi);
        c384050F3z.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3)));
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a04);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(999));
        return c384050F3z.LIZ(context);
    }

    public static final EditImageEffectImgCreatorData LIZ(CKEDraftIconAsset cKEDraftIconAsset, EnumC1736950vIj enumC1736950vIj) {
        boolean zBooleanValue;
        String iconAssetId = cKEDraftIconAsset.getIconAssetId();
        Boolean boolIsIconEffectApplied = cKEDraftIconAsset.isIconEffectApplied();
        if (boolIsIconEffectApplied != null) {
            zBooleanValue = boolIsIconEffectApplied.booleanValue();
        } else {
            zBooleanValue = false;
        }
        C1737320vJK c1737320vJK = EnumC1737340vJM.Companion;
        Integer iconSelectTypeValue = cKEDraftIconAsset.getIconSelectTypeValue();
        c1737320vJK.getClass();
        return new EditImageEffectImgCreatorData(iconAssetId, zBooleanValue, C1737320vJK.LIZ(iconSelectTypeValue), enumC1736950vIj, false, cKEDraftIconAsset.getIconEdit());
    }
}
