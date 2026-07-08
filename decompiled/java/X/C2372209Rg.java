package X;

import android.content.Context;
import android.net.Uri;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: renamed from: X.09Rg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2372209Rg {
    public static CompletionBlock<InterfaceC1801700wzA> LIZIZ;
    public static final C2372209Rg LIZ = new C2372209Rg();
    public static String LIZJ = "";

    public static Uri LIZ(Context context) {
        C2215208m6 c2215208m6;
        String str = new SimpleDateFormat("yyyy-MMdd_HHmmss", Locale.ENGLISH).format(new Date());
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Dou_fsm_");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        try {
            c2215208m6 = new C2215208m6(EnumC2358709Mb.CACHE.getToken());
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            c2215208m6 = null;
        }
        File fileCreateTempFile = File.createTempFile(strLIZIZ, ".jpg", c2215208m6);
        LIZJ = fileCreateTempFile.getAbsolutePath();
        return C2431009fo.LIZIZ(context, fileCreateTempFile);
    }
}
