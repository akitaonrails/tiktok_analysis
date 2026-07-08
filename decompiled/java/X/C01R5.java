package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;
import njp.a;

/* JADX INFO: renamed from: X.01R5, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.video.VideoSaveKt$clearVideoCacheFiles$2", f = "VideoSave.kt", l = {}, m = "invokeSuspend")
public final class C01R5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01R5(Context context, String str, InterfaceC1364105Vn<? super C01R5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = context;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C01R5 c01r5 = new C01R5(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        c01r5.LL = obj;
        return c01r5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Unit unit;
        C1C7U.LIZ("VideoSaveKt@32a8.clearVideoCacheFiles$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        File[] fileArrListFiles = C786410Ut5.w2(this.LLILLJJLI).listFiles();
        if (fileArrListFiles != null) {
            String str = this.LLILLL;
            for (File file : fileArrListFiles) {
                if (file.isFile() && a0.LJJIIZI(file.getName(), str, false)) {
                    try {
                        C189200o6.m2constructorimpl(Boolean.valueOf(file.delete()));
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C189200o6.m2constructorimpl(new C098200Yq(th));
                    }
                }
            }
            unit = Unit.LIZ;
        } else {
            unit = null;
        }
        C1C7U.LIZIZ("VideoSaveKt@32a8.clearVideoCacheFiles$2");
        return unit;
    }
}
