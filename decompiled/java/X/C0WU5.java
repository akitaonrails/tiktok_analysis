package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.util.Base64;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.launcher.service.shortcut.IShortcutService;
import kotlin.Unit;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0WU5, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WU5 extends C0WU8 {
    public static Bitmap LIZJ(C0WU7 c0wu7) {
        if (C123100dR.LIZ(c0wu7.getShortcutIconPath())) {
            return BitmapFactory.decodeFile(c0wu7.getShortcutIconPath());
        }
        String shortcutIconData = c0wu7.getShortcutIconData();
        if (C123100dR.LIZ(shortcutIconData)) {
            try {
                byte[] bArrDecode = Base64.decode((String) a0.LJJLIIIJILLIZJL(shortcutIconData, new String[]{","}, 0, 6).get(1), 0);
                return BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return null;
            }
        }
        return null;
    }

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Object c098200Yq;
        C0WU7 c0wu7 = (C0WU7) xBaseParamModel;
        IShortcutService iShortcutService = (IShortcutService) ServiceManager.get().getService(IShortcutService.class);
        if (iShortcutService.LIZ() && Build.VERSION.SDK_INT >= 26) {
            try {
                Bitmap bitmapLIZJ = LIZJ(c0wu7);
                if (bitmapLIZJ == null) {
                    C2382909Vj.LIZ(completionBlock, 0, "iconBitmap is null", null, 4);
                } else {
                    iShortcutService.LJIIIIZZ(new C815900VzY(c0wu7.getShortcutLabel(), c0wu7.getShortcutId(), Icon.createWithBitmap(bitmapLIZJ), c0wu7.getRouteUrls(), 0, c0wu7.getShortcutNeedLogin(), null, c0wu7.getShortcutRouteAction()));
                    completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(C0WUF.class, null), "");
                }
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("throw an exception, exception info is ");
                sbLIZ.append(thM5exceptionOrNullimpl.getMessage());
                C2382909Vj.LIZ(completionBlock, 0, C2188811AlT.LIZIZ(sbLIZ), null, 4);
                return;
            }
            return;
        }
        C2382909Vj.LIZ(completionBlock, 0, "shortcut is not supported", null, 4);
    }
}
