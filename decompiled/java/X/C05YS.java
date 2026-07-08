package X;

import com.ss.android.ugc.aweme.external.router.AssetInfo;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05YS, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.utils.MediaModelUtils$covert2MediaModels$1", f = "MediaModelUtils.kt", l = {57}, m = "invokeSuspend")
public final class C05YS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ List<AssetInfo> LLILZ;
    public final /* synthetic */ C529400KpW LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ Function1<ArrayList<MediaModel>, Unit> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C05YS(List<AssetInfo> list, C529400KpW c529400KpW, boolean z, Function1<? super ArrayList<MediaModel>, Unit> function1, InterfaceC1364105Vn<? super C05YS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = list;
        this.LLILZIL = c529400KpW;
        this.LLILZLL = z;
        this.LLIZ = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C05YS c05ys = new C05YS(this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
        c05ys.LLILLL = obj;
        return c05ys;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x003b -> B:6:0x001f). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            r4 = r18
            java.lang.String r9 = "MediaModelUtils@eeea.covert2MediaModels$1"
            X.C1C7U.LIZ(r9)
            java.lang.Object r5 = X.C099R.LJFF()
            r6 = r17
            int r1 = r6.LLILLJJLI
            r0 = 1
            if (r1 == 0) goto L41
            if (r1 != r0) goto Lac
            java.lang.Object r3 = r6.LL
            java.util.Iterator r3 = (java.util.Iterator) r3
            java.lang.Object r2 = r6.LLILLL
            java.util.Collection r2 = (java.util.Collection) r2
            X.C155000ia.LIZIZ(r4)
        L1f:
            if (r4 == 0) goto L24
            r2.add(r4)
        L24:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L9c
            java.lang.Object r1 = r3.next()
            X.0957 r1 = (X.AnonymousClass0957) r1
            r6.LLILLL = r2
            r6.LL = r3
            r0 = 1
            r6.LLILLJJLI = r0
            java.lang.Object r4 = r1.LJLIIIL(r6)
            if (r4 != r5) goto L1f
            X.C1C7U.LIZIZ(r9)
            return r5
        L41:
            X.C155000ia.LIZIZ(r4)
            java.lang.Object r4 = r6.LLILLL
            X.01wk r4 = (X.InterfaceC497601wk) r4
            java.util.List<com.ss.android.ugc.aweme.external.router.AssetInfo> r1 = r6.LLILZ
            X.0KpW r14 = r6.LLILZIL
            boolean r15 = r6.LLILZLL
            java.util.ArrayList r3 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r1, r0)
            r3.<init>(r0)
            java.util.Iterator r8 = r1.iterator()
            r2 = 0
            r12 = 0
        L5f:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L92
            java.lang.Object r1 = r8.next()
            int r7 = r12 + 1
            r0 = 0
            if (r12 < 0) goto Lb4
            com.ss.android.ugc.aweme.external.router.AssetInfo r1 = (com.ss.android.ugc.aweme.external.router.AssetInfo) r1
            java.util.List<java.lang.String> r0 = r1.urls
            java.lang.Object r11 = X.C13LP.LJJJLZIJ(r2, r0)
            java.lang.String r11 = (java.lang.String) r11
            java.lang.String r13 = r1.aiGenerateSource
            if (r13 != 0) goto L7e
            java.lang.String r13 = ""
        L7e:
            X.0KpV r10 = new X.0KpV
            r2 = 0
            r1 = r10
            r16 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16)
            r0 = 3
            X.099G r0 = X.C23250099c.LIZIZ(r4, r2, r2, r1, r0)
            r3.add(r0)
            r12 = r7
            r2 = 0
            goto L5f
        L92:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r3 = r3.iterator()
            goto L24
        L9c:
            kotlin.jvm.functions.Function1<java.util.ArrayList<com.ss.android.ugc.aweme.mediachoose.helper.MediaModel>, kotlin.Unit> r1 = r6.LLIZ
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r2)
            r1.invoke(r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r9)
            return r0
        Lac:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        Lb4:
            X.C1697810uHb.LJIJI()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05YS.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
