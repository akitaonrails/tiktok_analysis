package X;

import com.bytedance.mt.protector.impl.UriProtector;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0kct, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1326610kct extends C09AY implements Function0<InterfaceC1320200kSY<Object>> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1326610kct(String str, boolean z, String str2, String str3) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = z;
        this.LLILLL = str2;
        this.LLILZ = str3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC1320200kSY<Object> invoke() {
        C1325700kbQ c1325700kbQLIZLLL = C1325700kbQ.LIZLLL(UriProtector.parse(this.LL));
        C1326590kcr.LIZIZ(c1325700kbQLIZLLL, this.LLILZ);
        AbstractC1321260kUG abstractC1321260kUGLJIJ = C1322200kVm.LIZ().LJIJ(c1325700kbQLIZLLL.LIZ(), "preload_diskContext");
        if (this.LLILLJJLI) {
            C1326660kcy.LIZ.LIZ(this.LLILLL, abstractC1321260kUGLJIJ);
        }
        return abstractC1321260kUGLJIJ;
    }
}
