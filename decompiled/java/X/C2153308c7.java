package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.util.zip.ZipOutputStream;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08c7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.music.aichoosemusic.task.MultiMediaUploadFrameTask$createFramePackage$zipOutputStream$1", f = "MultiMediaUploadFrameTask.kt", l = {}, m = "invokeSuspend")
public final class C2153308c7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super ZipOutputStream>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ C2256008sg LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2153308c7(String str, C2256008sg c2256008sg, InterfaceC1364105Vn<? super C2153308c7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = c2256008sg;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2153308c7(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        ZipOutputStream zipOutputStream;
        C1C7U.LIZ("MultiMediaUploadFrameTask@fd89.createFramePackage$zipOutputStream$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new C0VSV(this.LL)));
        } catch (FileNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            C2256008sg c2256008sg = this.LLILLJJLI;
            String message = e.getMessage();
            if (message == null) {
                message = "finalZipFile FileNotFoundException";
            }
            c2256008sg.LJIILL(-2, message, "");
            zipOutputStream = null;
        }
        C1C7U.LIZIZ("MultiMediaUploadFrameTask@fd89.createFramePackage$zipOutputStream$1");
        return zipOutputStream;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super ZipOutputStream> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
