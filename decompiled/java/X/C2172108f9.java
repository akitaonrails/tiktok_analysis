package X;

import android.content.Context;
import com.ss.android.ugc.aweme.minis.common.SchemaParserData;
import com.ss.android.ugc.aweme.minis.model.MinisPkg;
import com.ss.android.ugc.aweme.minis.model.MinisPkgConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08f9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.minis.performance.nativegame.MinisNativeGameDownloadManager$downloadNativePkgSync$1", f = "MinisNativeGameDownloadManager.kt", l = {447, 451}, m = "invokeSuspend")
public final class C2172108f9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public int LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ MinisPkgConfig LLILZIL;
    public final /* synthetic */ MinisPkg LLILZLL;
    public final /* synthetic */ SchemaParserData LLIZ;
    public final /* synthetic */ boolean LLIZLLLIL;
    public final /* synthetic */ boolean LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2172108f9(Context context, String str, String str2, MinisPkgConfig minisPkgConfig, MinisPkg minisPkg, SchemaParserData schemaParserData, boolean z, boolean z2, InterfaceC1364105Vn<? super C2172108f9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = context;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = minisPkgConfig;
        this.LLILZLL = minisPkg;
        this.LLIZ = schemaParserData;
        this.LLIZLLLIL = z;
        this.LLJ = z2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2172108f9(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00a7 A[Catch: Exception -> 0x0107, TryCatch #0 {Exception -> 0x0107, blocks: (B:25:0x009c, B:26:0x009f, B:28:0x00a7, B:30:0x00b6, B:33:0x00ec, B:37:0x00f6, B:39:0x00fe, B:14:0x0041, B:15:0x0044, B:17:0x004c, B:19:0x0055, B:21:0x0093, B:10:0x0024), top: B:44:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00fe A[Catch: Exception -> 0x0107, TryCatch #0 {Exception -> 0x0107, blocks: (B:25:0x009c, B:26:0x009f, B:28:0x00a7, B:30:0x00b6, B:33:0x00ec, B:37:0x00f6, B:39:0x00fe, B:14:0x0041, B:15:0x0044, B:17:0x004c, B:19:0x0055, B:21:0x0093, B:10:0x0024), top: B:44:0x0011 }] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2172108f9.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
