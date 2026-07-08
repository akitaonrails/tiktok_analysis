package X;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.analysis.CrashlyticsWrapperService;

/* JADX INFO: renamed from: X.0uAn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1693590uAn implements InterfaceC1693970uBP {
    public final ClipboardManager LIZ;

    public final boolean LIZJ() {
        ClipDescription primaryClipDescription = this.LIZ.getPrimaryClipDescription();
        if (primaryClipDescription != null) {
            return primaryClipDescription.hasMimeType("text/*");
        }
        return false;
    }

    public C1693590uAn(Context context) {
        this.LIZ = (ClipboardManager) C786410Ut5.H2(context, "clipboard");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0171  */
    /* JADX WARN: Type inference failed for: r9v0, types: [android.text.SpannableString] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.String] */
    @Override // X.InterfaceC1693970uBP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(X.C1692220u8a r18) {
        /*
            Method dump skipped, instruction units count: 375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1693590uAn.LIZ(X.0u8a):void");
    }

    public static void LIZIZ(ClipboardManager clipboardManager, ClipData clipData) {
        try {
            clipboardManager.setPrimaryClip(clipData);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            CrashlyticsWrapperService.LIZLLL().log("ClipboardLancet", e.getLocalizedMessage());
        }
    }
}
