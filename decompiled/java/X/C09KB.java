package X;

import com.ss.android.ugc.aweme.creation.config.DMUploadImageResult;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09KB, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.send.service.VisualPoetImageUploadStepImpl$transform$2$1", f = "VisualPoetImageUploadStepImpl.kt", l = {46}, m = "invokeSuspend")
public final class C09KB extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends DMUploadImageResult>>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public int LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ List<MediaModel> LLILZIL;
    public final /* synthetic */ C09KL LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C09KB(List<? extends MediaModel> list, C09KL c09kl, InterfaceC1364105Vn<? super C09KB> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = list;
        this.LLILZLL = c09kl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C09KB c09kb = new C09KB(this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c09kb.LLILZ = obj;
        return c09kb;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0040 -> B:6:0x001f). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.String r9 = "VisualPoetImageUploadStepImpl@591.transform$2$1"
            X.C1C7U.LIZ(r9)
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r10.LLILLL
            r6 = 1
            if (r0 == 0) goto L43
            if (r0 != r6) goto L86
            java.lang.Object r0 = r10.LLILLJJLI
            java.util.Collection r0 = (java.util.Collection) r0
            java.lang.Object r2 = r10.LL
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r1 = r10.LLILZ
            java.util.Collection r1 = (java.util.Collection) r1
            X.C155000ia.LIZIZ(r11)
        L1f:
            r0.add(r11)
        L22:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L82
            java.lang.Object r0 = r2.next()
            X.0957 r0 = (X.AnonymousClass0957) r0
            r10.LLILZ = r1
            r10.LL = r2
            r10.LLILLJJLI = r1
            r10.LLILLL = r6
            java.lang.Object r11 = r0.LJLIIIL(r10)
            if (r11 != r7) goto L40
            X.C1C7U.LIZIZ(r9)
            return r7
        L40:
            r0 = r1
            r1 = r0
            goto L1f
        L43:
            X.C155000ia.LIZIZ(r11)
            java.lang.Object r8 = r10.LLILZ
            X.01wk r8 = (X.InterfaceC497601wk) r8
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.List<com.ss.android.ugc.aweme.mediachoose.helper.MediaModel> r0 = r10.LLILZIL
            X.09KL r4 = r10.LLILZLL
            java.util.Iterator r3 = r0.iterator()
        L57:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L72
            java.lang.Object r0 = r3.next()
            com.ss.android.ugc.aweme.mediachoose.helper.MediaModel r0 = (com.ss.android.ugc.aweme.mediachoose.helper.MediaModel) r0
            X.09KO r2 = new X.09KO
            r1 = 0
            r2.<init>(r4, r0, r1)
            r0 = 3
            X.099G r0 = X.C23250099c.LIZIZ(r8, r1, r1, r2, r0)
            r5.add(r0)
            goto L57
        L72:
            java.util.ArrayList r1 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r5, r0)
            r1.<init>(r0)
            java.util.Iterator r2 = r5.iterator()
            goto L22
        L82:
            X.C1C7U.LIZIZ(r9)
            return r1
        L86:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09KB.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends DMUploadImageResult>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
