package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.08co, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.texttoimage.choose.Text2ImageAIGCAnimationComponent$initialize$1$file$1", f = "Text2ImageAIGCAnimationComponent.kt", l = {}, m = "invokeSuspend")
public final class C2157608co extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super File>, Object> {
    public C2157608co(InterfaceC1364105Vn<? super C2157608co> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2157608co(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("Text2ImageAIGCAnimationComponent@edeb.initialize$1$file$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C572540Mcu.LIZ.getClass();
        File file = null;
        File[] fileArrListFiles = new C0VSJ(C572540Mcu.LIZJ(null)).listFiles();
        if (fileArrListFiles != null) {
            try {
                int length = fileArrListFiles.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    File file2 = fileArrListFiles[i];
                    if (a0.LJJIIZI(file2.getAbsolutePath(), "phototext_downgrade_background.png", false)) {
                        file = file2;
                        break;
                    }
                    i++;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C098200Yq c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
                C189200o6.m5exceptionOrNullimpl(c098200Yq);
                C189200o6.m1boximpl(c098200Yq);
            }
        }
        C1C7U.LIZIZ("Text2ImageAIGCAnimationComponent@edeb.initialize$1$file$1");
        return file;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super File> interfaceC1364105Vn) {
        return new C2157608co(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
