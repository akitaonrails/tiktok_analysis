package X;

import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.Regex;
import kotlin.text.u;
import njp.a;

/* JADX INFO: renamed from: X.01R3, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.file.FileCleanKt$cleanCacheFileIfNeed$1$1", f = "FileClean.kt", l = {}, m = "invokeSuspend")
public final class C01R3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ File LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01R3(File file, String str, String str2, boolean z, InterfaceC1364105Vn<? super C01R3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = file;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01R3(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long jCurrentTimeMillis;
        C1C7U.LIZ("FileCleanKt@2866.cleanCacheFileIfNeed$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        File[] fileArrListFiles = this.LL.listFiles();
        if (fileArrListFiles != null) {
            String str = this.LLILLJJLI;
            String str2 = this.LLILLL;
            boolean z = this.LLILZ;
            for (File file : fileArrListFiles) {
                if (file.isFile() && u.LJJIIJZLJL(file.getName(), str, false) && u.LJIIZILJ(file.getName(), str2, true)) {
                    if (z) {
                        try {
                            String str3 = (String) C13LP.LJJJLZIJ(0, C09RB.LJJII(new C08LY(Regex.findAll$default(new Regex("expired(.*?)expired"), file.getName(), 0, 2, null), AnonymousClass0207.get$arr$(58))));
                            if (str3 != null) {
                                jCurrentTimeMillis = CastLongProtector.parseLong(str3);
                            } else {
                                jCurrentTimeMillis = System.currentTimeMillis();
                            }
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                        if (System.currentTimeMillis() >= jCurrentTimeMillis) {
                            file.delete();
                        }
                    } else {
                        file.delete();
                    }
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FileCleanKt@2866.cleanCacheFileIfNeed$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
