package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0WHI, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WHI implements C0WHT {
    public static final C0WHI LIZ = new C0WHI();

    @Override // X.C0WHT
    public final Intent LIZ(Context context) {
        Intent intent = new Intent();
        intent.putExtra("packagename", context.getPackageName());
        intent.setComponent(new ComponentName("com.vivo.permissionmanager", "com.vivo.permissionmanager.activity.SoftPermissionDetailActivity"));
        if (C0WHG.LIZ(context, intent)) {
            return intent;
        }
        intent.setComponent(new ComponentName("com.iqoo.secure", "com.iqoo.secure.safeguard.SoftPermissionDetailActivity"));
        if (!C0WHG.LIZ(context, intent)) {
            return C0WHF.LIZ.LIZ(context);
        }
        return intent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C0WHT
    public final C0WGR LIZIZ(Context context) {
        Object c098200Yq;
        C259800zU c259800zU = new C259800zU();
        try {
            T t = 0;
            Cursor cursorLJJJ = C2204961BRm.LJJJ(context.getContentResolver(), UriProtector.parse("content://com.bbk.launcher2.settings/favorites"), null, null, null, null, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOapdpHN2SCuatS6ZH8trdI32AqEX51eSFyWJYNvzk8e1BSZ2wqCQM1Cg8LU", null));
            if (cursorLJJJ != null) {
                while (cursorLJJJ.moveToNext()) {
                    int columnIndex = cursorLJJJ.getColumnIndex("intent");
                    int columnIndex2 = cursorLJJJ.getColumnIndex("shortcutPermission");
                    String string = cursorLJJJ.getString(columnIndex);
                    if (!TextUtils.isEmpty(string) && a0.LJJIIZI(string, C786410Ut5.N3(context).getPackageName(), false) && Intrinsics.LJFF(a0.LJJLIIIJILLIZJL(string, new String[]{"/"}, 0, 6).get(0), C786410Ut5.N3(context).getPackageName())) {
                        int i = cursorLJJJ.getInt(columnIndex2);
                        if (i != 16) {
                            if (i != 17) {
                                return C0WGR.DENIED;
                            }
                            return C0WGR.ASK;
                        }
                        return C0WGR.GRANTED;
                    }
                }
                t = cursorLJJJ;
            }
            c259800zU.element = t;
            c098200Yq = C0WGR.UNKNOWN;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C01GW<AbstractC1604130rqV> c01gw = C165G.LJ;
            C0WHH.LIZ().LJ("FuntouchOsPerChecker checkPermission error, " + thM5exceptionOrNullimpl.getMessage());
            C1AF0.LJFF(thM5exceptionOrNullimpl, "IPermissionChecker error");
            c098200Yq = C0WGR.UNKNOWN;
        }
        C0WGR c0wgr = (C0WGR) c098200Yq;
        Cursor cursor = (Cursor) c259800zU.element;
        if (cursor != null) {
            cursor.close();
        }
        return c0wgr;
    }
}
