package X;

import android.graphics.Bitmap;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0mQ1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.minis.report.report.MinisReportInstance$takeScreenshot$2", f = "MinisReportInstance.kt", l = {}, m = "invokeSuspend")
public final class C1395510mQ1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super String>, Object> {
    public final /* synthetic */ C1395560mQ6 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1395510mQ1(C1395560mQ6 c1395560mQ6, InterfaceC1364105Vn<? super C1395510mQ1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1395560mQ6;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1395510mQ1(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException, IOException {
        boolean zCt;
        String absolutePath;
        C1C7U.LIZ("MinisReportInstance@2783.takeScreenshot$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC1395520mQ2 interfaceC1395520mQ2 = this.LL.LIZLLL;
        if (interfaceC1395520mQ2 != null) {
            zCt = interfaceC1395520mQ2.ct();
        } else {
            zCt = false;
        }
        InterfaceC1395520mQ2 interfaceC1395520mQ22 = this.LL.LIZLLL;
        if (interfaceC1395520mQ22 != null) {
            interfaceC1395520mQ22.LE(false);
        }
        View rootView = this.LL.LIZJ.getWindow().getDecorView().getRootView();
        rootView.setDrawingCacheEnabled(true);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(C2204961BRm.LLILLL(rootView, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOehbZbdkiBqhkYQib4ZjT0/d5VCXm4ICyh/JX5Bk+Kf6ePfmTnIKQ==", null)));
        rootView.setDrawingCacheEnabled(false);
        InterfaceC1395520mQ2 interfaceC1395520mQ23 = this.LL.LIZLLL;
        if (interfaceC1395520mQ23 != null) {
            interfaceC1395520mQ23.LE(zCt);
        }
        C1395560mQ6 c1395560mQ6 = this.LL;
        File fileCreateTempFile = File.createTempFile("minis_report_screenshot_", ".jpeg", C786410Ut5.w2(c1395560mQ6.LIZJ));
        try {
            C0VSV c0vsv = new C0VSV(fileCreateTempFile);
            bitmapCreateBitmap.compress(Bitmap.CompressFormat.JPEG, 100, c0vsv);
            c0vsv.flush();
            c0vsv.close();
            absolutePath = fileCreateTempFile.getAbsolutePath();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Writing report screenshot to cache failed: ");
            sbLIZ.append(e.getMessage());
            C1720106oR.LIZ("MinisReportInstance", C2188811AlT.LIZIZ(sbLIZ));
            c1395560mQ6.LJIIIIZZ = e;
            absolutePath = null;
        }
        if (absolutePath == null) {
            this.LL.LJIIIZ.LIZ(EnumC1395590mQ9.SCREENSHOT, EnumC1381400m3G.FAIL, null, null);
        } else {
            this.LL.LJIIIZ.LIZ(EnumC1395590mQ9.SCREENSHOT, EnumC1381400m3G.SUCCESS, null, null);
        }
        C1C7U.LIZIZ("MinisReportInstance@2783.takeScreenshot$2");
        return absolutePath;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
