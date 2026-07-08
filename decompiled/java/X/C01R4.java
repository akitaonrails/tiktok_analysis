package X;

import android.content.Context;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;
import njp.a;

/* JADX INFO: renamed from: X.01R4, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.video.VideoGenerationHelperKt$getCacheFilePath$2", f = "VideoGenerationHelper.kt", l = {}, m = "invokeSuspend")
public final class C01R4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super String>, Object> {
    public final /* synthetic */ Context LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01R4(Context context, String str, InterfaceC1364105Vn<? super C01R4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = context;
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01R4(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("VideoGenerationHelperKt@5534.getCacheFilePath$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        File[] fileArrListFiles = C786410Ut5.w2(this.LL).listFiles();
        if (fileArrListFiles != null) {
            String str = this.LLILLJJLI;
            for (File file : fileArrListFiles) {
                if (file.isFile() && a0.LJJIIZI(file.getName(), str, false)) {
                    String path = file.getPath();
                    C1C7U.LIZIZ("VideoGenerationHelperKt@5534.getCacheFilePath$2");
                    return path;
                }
            }
        }
        C1C7U.LIZIZ("VideoGenerationHelperKt@5534.getCacheFilePath$2");
        return null;
    }
}
