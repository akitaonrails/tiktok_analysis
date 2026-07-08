package X;

import android.os.Bundle;
import android.text.TextUtils;
import co5.g;
import com.bytedance.pipo.ocr.view.CardOcrActivity;
import com.bytedance.pipo.ocr.view.OcrResultFragment;
import com.bytedance.pipo.ocr.view.component.IOcrComponent;
import eo5.b;
import kotlin.jvm.internal.AwS577S0100000_33;

/* JADX INFO: renamed from: X.1Ahd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class RunnableC2186431Ahd implements Runnable {
    public final /* synthetic */ CardOcrActivity LL;
    public final /* synthetic */ g LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ b LLILZIL;

    public RunnableC2186431Ahd(CardOcrActivity cardOcrActivity, g gVar, boolean z, String str, b bVar) {
        this.LL = cardOcrActivity;
        this.LLILLJJLI = gVar;
        this.LLILLL = z;
        this.LLILZ = str;
        this.LLILZIL = bVar;
    }

    public final void LIZ() {
        InterfaceC2186401Aha sheet;
        g gVar = this.LLILLJJLI;
        boolean z = this.LLILLL;
        boolean zEquals = TextUtils.equals(this.LL.LLJL, "1");
        String str = this.LLILZ;
        b bVar = this.LLILZIL;
        Bundle bundle = new Bundle();
        bundle.putBoolean("ocr_manually_input", z);
        bundle.putBoolean("showSecurityTips", zEquals);
        C786410Ut5.LJJJI("ocr_source_type", str, bundle);
        OcrResultFragment ocrResultFragment = new OcrResultFragment();
        ocrResultFragment.setArguments(bundle);
        ocrResultFragment.LL = bVar;
        ocrResultFragment.LLJILJIL = gVar;
        IOcrComponent iOcrComponentLIZ = C826780Wc0.LIZ();
        if (iOcrComponentLIZ != null) {
            sheet = iOcrComponentLIZ.getSheet(this.LL);
            if (sheet != null) {
                sheet.LIZ(this.LL.getSupportFragmentManager(), ocrResultFragment, new AwS577S0100000_33(this, 4069), new AwS577S0100000_33(this, 4070));
            }
        } else {
            sheet = null;
        }
        ocrResultFragment.LLILLJJLI = new AwS577S0100000_33(sheet, 4071);
        this.LL.LLZ();
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("CardOcrActivity@bb9e.showConfirmSheet$1");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CardOcrActivity@bb9e.showConfirmSheet$1");
    }
}
