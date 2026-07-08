package X;

import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0643, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.edit.VideoEditContainerSceneKotlinAdapterKt$videoEdit$1$1", f = "VideoEditContainerSceneKotlinAdapter.kt", l = {383}, m = "invokeSuspend")
public final class AnonymousClass0643 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public MediaModel LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ List<MediaModel> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AnonymousClass0643(List<? extends MediaModel> list, InterfaceC1364105Vn<? super AnonymousClass0643> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new AnonymousClass0643(this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x003e -> B:6:0x0019). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.String r6 = "VideoEditContainerSceneKotlinAdapterKt@e554.videoEdit$1$1"
            X.C1C7U.LIZ(r6)
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r13.LLILLL
            r4 = 1
            if (r0 == 0) goto L44
            if (r0 != r4) goto L72
            com.ss.android.ugc.aweme.mediachoose.helper.MediaModel r8 = r13.LLILLJJLI
            java.lang.Object r1 = r13.LL
            java.util.Iterator r1 = (java.util.Iterator) r1
            X.C155000ia.LIZIZ(r14)
        L19:
            com.ss.android.ugc.aweme.mediachoose.helper.AIGCInfo r14 = (com.ss.android.ugc.aweme.mediachoose.helper.AIGCInfo) r14
            r8.aigcInfo = r14
        L1d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L6c
            java.lang.Object r8 = r1.next()
            com.ss.android.ugc.aweme.mediachoose.helper.MediaModel r8 = (com.ss.android.ugc.aweme.mediachoose.helper.MediaModel) r8
            X.140D r7 = X.C140D.LIZ
            r9 = 0
            r13.LL = r1
            r13.LLILLJJLI = r8
            r13.LLILLL = r4
            r7.getClass()
            long r10 = X.C140D.LJIIZILJ()
            r12 = r9
            java.lang.Object r14 = r7.LJIILJJIL(r8, r9, r10, r12, r13)
            if (r14 != r5) goto L19
            X.C1C7U.LIZIZ(r6)
            return r5
        L44:
            X.C155000ia.LIZIZ(r14)
            java.util.List<com.ss.android.ugc.aweme.mediachoose.helper.MediaModel> r0 = r13.LLILZ
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r0.iterator()
        L52:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L67
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.ss.android.ugc.aweme.mediachoose.helper.MediaModel r0 = (com.ss.android.ugc.aweme.mediachoose.helper.MediaModel) r0
            com.ss.android.ugc.aweme.mediachoose.helper.AIGCInfo r0 = r0.aigcInfo
            if (r0 != 0) goto L52
            r3.add(r1)
            goto L52
        L67:
            java.util.Iterator r1 = r3.iterator()
            goto L1d
        L6c:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r6)
            return r0
        L72:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0643.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
