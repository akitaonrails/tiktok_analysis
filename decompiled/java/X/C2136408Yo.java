package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.assem.tikbot.TakoAssem;
import java.io.File;
import java.io.FileFilter;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08Yo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.assem.tikbot.TakoAssem$onBind$2", f = "TakoAssem.kt", l = {}, m = "invokeSuspend")
public final class C2136408Yo extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ TakoAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2136408Yo(TakoAssem takoAssem, InterfaceC1364105Vn<? super C2136408Yo> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = takoAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2136408Yo(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        File fileW2;
        File[] fileArrListFiles;
        C1C7U.LIZ("TakoAssem@6e4b.onBind$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        TakoAssem takoAssem = this.LL;
        takoAssem.getClass();
        try {
            Context context = takoAssem.getContext();
            if (context != null && (fileW2 = C786410Ut5.w2(context)) != null) {
                C0VSJ c0vsj = new C0VSJ(fileW2, "tako_feed_bubble");
                if (c0vsj.exists() && (fileArrListFiles = c0vsj.listFiles(new FileFilter() { // from class: X.08Yp
                    @Override // java.io.FileFilter
                    public final boolean accept(File file) {
                        return file.isFile();
                    }
                })) != null) {
                    for (File file : fileArrListFiles) {
                        file.delete();
                    }
                }
                C189200o6.m2constructorimpl(Unit.LIZ);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoAssem@6e4b.onBind$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
