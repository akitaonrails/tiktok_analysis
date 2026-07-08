package X;

import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.UploadImageParam;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01WC, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.aiplayground.panel.helper.DownloadUtils$downloadImages$1", f = "DownloadUtils.kt", l = {BaseNotice.RECOMMEND_LIVE}, m = "invokeSuspend")
public final class C01WC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public UploadImageParam[] LL;
    public C013C LLILLJJLI;
    public CreativeInfo LLILLL;
    public Object LLILZ;
    public Object LLILZIL;
    public UploadImageParam[] LLILZLL;
    public UploadImageParam[] LLIZ;
    public int LLIZLLLIL;
    public int LLJ;
    public int LLJI;
    public int LLJIJIL;
    public int LLJILJIL;
    public final /* synthetic */ List<String> LLJILJILJ;
    public final /* synthetic */ Function1<List<UploadImageParam>, Unit> LLJILLL;
    public final /* synthetic */ Function0<Unit> LLJJ;
    public final /* synthetic */ CreativeInfo LLJJI;
    public final /* synthetic */ List<Pair<String, Boolean>> LLJJIII;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C01WC(List<String> list, Function1<? super List<UploadImageParam>, Unit> function1, Function0<Unit> function0, CreativeInfo creativeInfo, List<Pair<String, Boolean>> list2, InterfaceC1364105Vn<? super C01WC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLJILJILJ = list;
        this.LLJILLL = function1;
        this.LLJJ = function0;
        this.LLJJI = creativeInfo;
        this.LLJJIII = list2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01WC(this.LLJILJILJ, this.LLJILLL, this.LLJJ, this.LLJJI, this.LLJJIII, interfaceC1364105Vn);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:21|(1:61)|22|59|23|(3:25|39|40)(11:26|64|27|66|35|(0)|38|70|17|74|(4:45|(1:47)(1:48)|57|58)(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00bc, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00bd, code lost:
    
        r1 = r8;
        r13 = r11;
        r12 = r11;
        r2 = r8;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0074 A[Catch: Exception -> 0x00f4, TryCatch #6 {Exception -> 0x00f4, blocks: (B:17:0x006e, B:19:0x0074, B:21:0x007c), top: B:70:0x006e }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cd A[Catch: Exception -> 0x00d7, TryCatch #4 {Exception -> 0x00d7, blocks: (B:35:0x00c7, B:37:0x00cd), top: B:66:0x00c7 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00de A[Catch: Exception -> 0x00f2, TryCatch #8 {Exception -> 0x00f2, blocks: (B:43:0x00d9, B:44:0x00dd, B:45:0x00de, B:47:0x00e2, B:48:0x00e8), top: B:74:0x0072 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00b1 -> B:64:0x00b5). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C01WC.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
