package X;

import android.text.TextUtils;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0eqr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1104630eqr {
    public static final /* synthetic */ int LIZLLL = 0;
    public final String LIZ;
    public final WeakReference<InterfaceC978780bZs> LIZIZ;
    public String LIZJ = "more";

    public C1104630eqr(String str, WeakReference<InterfaceC978780bZs> weakReference) {
        this.LIZ = str;
        this.LIZIZ = weakReference;
        if (!TextUtils.equals(str, "start_goody_bag") && !TextUtils.equals(str, "start_treasure_box")) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(EnumC1303240k1C.BIZ.getValue());
            sbLIZ.append('_');
            sbLIZ.append("InteractionFeaturesEvent");
            sbLIZ.append('_');
            sbLIZ.append(17);
            C1AZW.LJFF(C2188811AlT.LIZIZ(sbLIZ), "type error", null, null);
        }
    }
}
