package X;

import com.ss.android.ugc.aweme.publish.model.UploadImageConfig;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08y6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.music.aichoosemusic.task.BaseAIMusicUploadFrameTask$start$2$uploadRes$1", f = "BaseAIMusicUploadFrameTask.kt", l = {401}, m = "invokeSuspend")
public final class C2289608y6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends String, ? extends String>>, Object> {
    public int LL;
    public final /* synthetic */ AbstractC2289508y5 LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ C259800zU<Pair<UploadImageConfig, String>> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2289608y6(AbstractC2289508y5 abstractC2289508y5, String str, C259800zU<Pair<UploadImageConfig, String>> c259800zU, InterfaceC1364105Vn<? super C2289608y6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = abstractC2289508y5;
        this.LLILLL = str;
        this.LLILZ = c259800zU;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2289608y6(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0204  */
    /* JADX WARN: Type inference failed for: r0v67, types: [T, X.1Bb1] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            Method dump skipped, instruction units count: 650
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2289608y6.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends String, ? extends String>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
