package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0WJ5, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WJ5 implements InterfaceC821090WIx {
    @Override // X.InterfaceC821090WIx
    public final boolean LIZIZ() {
        return true;
    }

    @Override // X.InterfaceC821090WIx
    public final String LIZJ() {
        return "player_group_recorder.json";
    }

    @Override // X.InterfaceC821090WIx
    public final String LIZ(Context context, C821110WIz c821110WIz) {
        C821050WIt c821050WIt = C821050WIt.LIZ;
        String str = c821110WIz.LIZ;
        c821050WIt.getClass();
        String strLIZ = C821050WIt.LIZ(context, str);
        try {
            C0VSJ c0vsj = new C0VSJ(strLIZ);
            if (!c0vsj.exists()) {
                c0vsj.mkdirs();
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        return strLIZ + File.separator + "player_group_recorder.json";
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    @Override // X.InterfaceC821090WIx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(android.content.Context r9, X.C821110WIz r10, X.InterfaceC1364105Vn<? super X.C821100WIy> r11) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0WJ5.LIZLLL(android.content.Context, X.0WIz, X.05Vn):java.lang.Object");
    }
}
