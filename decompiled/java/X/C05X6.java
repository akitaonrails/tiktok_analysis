package X;

import com.ss.android.ugc.aweme.mediachoose.helper.AIGCInfo;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05X6, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.choosemusic.fragment.ImportDeviceSoundsFragment$batchReadC2PALocalSounds$2$2", f = "ImportDeviceSoundsFragment.kt", l = {176}, m = "invokeSuspend")
public final class C05X6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends AIGCInfo>>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public int LLILZ;
    public final /* synthetic */ List<AnonymousClass0957<AIGCInfo>> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05X6(List<AnonymousClass0957<AIGCInfo>> list, InterfaceC1364105Vn<? super C05X6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05X6(this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0040 -> B:6:0x001f). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.String r5 = "ImportDeviceSoundsFragment@5e82.batchReadC2PALocalSounds$2$2"
            X.C1C7U.LIZ(r5)
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r6.LLILZ
            r3 = 1
            if (r0 == 0) goto L43
            if (r0 != r3) goto L5c
            java.lang.Object r0 = r6.LLILLL
            java.util.Collection r0 = (java.util.Collection) r0
            java.lang.Object r1 = r6.LLILLJJLI
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r2 = r6.LL
            java.util.Collection r2 = (java.util.Collection) r2
            X.C155000ia.LIZIZ(r7)
        L1f:
            r0.add(r7)
        L22:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L58
            java.lang.Object r0 = r1.next()
            X.0957 r0 = (X.AnonymousClass0957) r0
            r6.LL = r2
            r6.LLILLJJLI = r1
            r6.LLILLL = r2
            r6.LLILZ = r3
            java.lang.Object r7 = r0.LJLIIIL(r6)
            if (r7 != r4) goto L40
            X.C1C7U.LIZIZ(r5)
            return r4
        L40:
            r0 = r2
            r2 = r0
            goto L1f
        L43:
            X.C155000ia.LIZIZ(r7)
            java.util.List<X.0957<com.ss.android.ugc.aweme.mediachoose.helper.AIGCInfo>> r1 = r6.LLILZIL
            java.util.ArrayList r2 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r1, r0)
            r2.<init>(r0)
            java.util.Iterator r1 = r1.iterator()
            goto L22
        L58:
            X.C1C7U.LIZIZ(r5)
            return r2
        L5c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05X6.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends AIGCInfo>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
