package X;

import android.content.Context;
import com.ss.android.ugc.aweme.minis.common.SchemaParserData;
import com.ss.android.ugc.aweme.minis.model.MinisPkgConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08ak, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.minis.performance.nativegame.MinisNativeGameDownloadManager$dealNativeRemoteDebugDependencyPkg$2", f = "MinisNativeGameDownloadManager.kt", l = {370}, m = "invokeSuspend")
public final class C2144808ak extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ MinisPkgConfig LLILLL;
    public final /* synthetic */ Context LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ SchemaParserData LLILZLL;
    public final /* synthetic */ boolean LLIZ;
    public final /* synthetic */ boolean LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2144808ak(Context context, SchemaParserData schemaParserData, MinisPkgConfig minisPkgConfig, String str, InterfaceC1364105Vn interfaceC1364105Vn, boolean z, boolean z2) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = minisPkgConfig;
        this.LLILZ = context;
        this.LLILZIL = str;
        this.LLILZLL = schemaParserData;
        this.LLIZ = z;
        this.LLIZLLLIL = z2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        MinisPkgConfig minisPkgConfig = this.LLILLL;
        return new C2144808ak(this.LLILZ, this.LLILZLL, minisPkgConfig, this.LLILZIL, interfaceC1364105Vn, this.LLIZ, this.LLIZLLLIL);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0077 -> B:6:0x0017). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.lang.Throwable {
        /*
            r14 = this;
            java.lang.String r5 = "MinisNativeGameDownloadManager@99.dealNativeRemoteDebugDependencyPkg$2"
            X.C1C7U.LIZ(r5)
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r14.LLILLJJLI
            r2 = 1
            if (r0 == 0) goto L28
            if (r0 != r2) goto L7d
            java.lang.Object r4 = r14.LL
            java.util.Iterator r4 = (java.util.Iterator) r4
            X.C155000ia.LIZIZ(r15)
        L17:
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r0 = r15.booleanValue()
            if (r0 != 0) goto L41
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            X.C1C7U.LIZIZ(r5)
            return r0
        L28:
            X.C155000ia.LIZIZ(r15)
            com.ss.android.ugc.aweme.minis.model.MinisPkgConfig r0 = r14.LLILLL
            java.util.Map<java.lang.String, com.ss.android.ugc.aweme.minis.model.MinisPkg> r0 = r0.packages
            if (r0 != 0) goto L39
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            X.C1C7U.LIZIZ(r5)
            return r0
        L39:
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r4 = r0.iterator()
        L41:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L85
            java.lang.Object r1 = r4.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r0 = r1.getKey()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r10 = r1.getValue()
            com.ss.android.ugc.aweme.minis.model.MinisPkg r10 = (com.ss.android.ugc.aweme.minis.model.MinisPkg) r10
            if (r0 == 0) goto L41
            int r0 = r0.length()
            if (r0 == 0) goto L41
            X.09Yh r6 = X.C2390509Yh.LIZ
            android.content.Context r7 = r14.LLILZ
            java.lang.String r8 = r14.LLILZIL
            com.ss.android.ugc.aweme.minis.model.MinisPkgConfig r9 = r14.LLILLL
            com.ss.android.ugc.aweme.minis.common.SchemaParserData r11 = r14.LLILZLL
            boolean r12 = r14.LLIZ
            boolean r13 = r14.LLIZLLLIL
            r14.LL = r4
            r14.LLILLJJLI = r2
            java.lang.Object r15 = r6.LIZ(r7, r8, r9, r10, r11, r12, r13, r14)
            if (r15 != r3) goto L17
            X.C1C7U.LIZIZ(r5)
            return r3
        L7d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L85:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            X.C1C7U.LIZIZ(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2144808ak.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
