package X;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0luj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1376110luj extends AbstractC1376120luk {
    @Override // X.InterfaceC1369790lkX
    public final boolean LJIIL(C1371420lnA c1371420lnA, Context context, C0M7Y c0m7y) {
        return false;
    }

    @Override // X.InterfaceC1369790lkX
    public final String key() {
        return "instagram_story";
    }

    @Override // X.InterfaceC1369790lkX
    public final String label() {
        return "Stories";
    }

    @Override // X.AbstractC1376120luk, X.InterfaceC1369790lkX
    public final boolean LJIIZILJ(Context context) {
        C1371420lnA c1371420lnA = new C1371420lnA("", null);
        if (C516560KNq.LIZ(context, "com.instagram.android") && LJIILLIIL(context, c1371420lnA)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1369790lkX
    public final boolean LJIILLIIL(Context context, AbstractC1375550ltp abstractC1375550ltp) {
        Intent intent = new Intent("com.instagram.share.ADD_TO_STORY");
        intent.setType("image/*");
        if (context.getPackageManager().resolveActivity(intent, 0) == null) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1369790lkX
    public final Drawable LJJII(Context context, boolean z) {
        C1361400lX0 c1361400lX0LIZIZ;
        int i;
        int iIntValue;
        if (context != null && (c1361400lX0LIZIZ = C1369540lk8.LIZIZ(context)) != null) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            if (z) {
                i = R.attr.ql;
            } else {
                i = R.attr.qk;
            }
            Integer numLIZ = C1369540lk8.LIZ(i, c1361400lX0LIZIZ);
            if (numLIZ != null) {
                iIntValue = numLIZ.intValue();
            } else {
                iIntValue = 0;
            }
            c419910GdJ.LIZ = iIntValue;
            return c419910GdJ.LIZ(c1361400lX0LIZIZ);
        }
        return null;
    }

    public final boolean LJFF(AbstractC1375550ltp abstractC1375550ltp, Context context, Uri uri) {
        Intent intent = new Intent("com.instagram.share.ADD_TO_STORY");
        String strLIZ = abstractC1375550ltp.LIZ("media_type", "video/*");
        String strLIZ2 = abstractC1375550ltp.LIZ("content_url", "");
        if (!TextUtils.isEmpty(strLIZ)) {
            intent.setType(strLIZ);
        }
        if (!TextUtils.isEmpty(strLIZ2)) {
            intent.putExtra("content_url", strLIZ2);
        }
        intent.setDataAndType(uri, strLIZ);
        intent.setFlags(1);
        return LJ(context, intent);
    }

    @Override // X.InterfaceC1369790lkX
    public final boolean LJIJ(C1374270lrl c1374270lrl, Context context, C0M7Y c0m7y) {
        return LJFF(c1374270lrl, context, c1374270lrl.LIZIZ);
    }

    @Override // X.InterfaceC1369790lkX
    public final boolean LJJJIL(C1375540lto c1375540lto, Context context, C0M7Y c0m7y) {
        return LJFF(c1375540lto, context, c1375540lto.LIZIZ);
    }
}
