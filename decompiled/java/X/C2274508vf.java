package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.util.zip.ZipOutputStream;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08vf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.music.aichoosemusic.task.LocalVideoUploadFrameTask$createFramePackageNew$zipOutPutStream$1", f = "LocalVideoUploadFrameTask.kt", l = {}, m = "invokeSuspend")
public final class C2274508vf extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super ZipOutputStream>, Object> {
    public final /* synthetic */ C259800zU<String> LL;
    public final /* synthetic */ C2274008va LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2274508vf(C259800zU<String> c259800zU, C2274008va c2274008va, InterfaceC1364105Vn<? super C2274508vf> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c259800zU;
        this.LLILLJJLI = c2274008va;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2274508vf(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        ZipOutputStream zipOutputStream;
        C1C7U.LIZ("LocalVideoUploadFrameTask@4ac4.createFramePackageNew$zipOutPutStream$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new C0VSV(this.LL.element)));
        } catch (FileNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            C2274008va c2274008va = this.LLILLJJLI;
            String message = e.getMessage();
            if (message == null) {
                message = "finalZipFile FileNotFoundException";
            }
            c2274008va.LJIILL(-2, message, "");
            if (C301630Bs1.LIZ()) {
                C2290108yB c2290108yB = this.LLILLJJLI.LJIIJ;
                String value = EnumC1458590o3l.ZIP.getValue();
                value.toString();
                c2290108yB.LJIIIZ = value;
            }
            zipOutputStream = null;
        }
        C1C7U.LIZIZ("LocalVideoUploadFrameTask@4ac4.createFramePackageNew$zipOutPutStream$1");
        return zipOutputStream;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super ZipOutputStream> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
