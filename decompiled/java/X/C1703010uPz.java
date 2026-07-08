package X;

import com.ss.android.ugc.aweme.services.audio.AudioWatermarkInfo;
import com.ss.android.ugc.gamora.editor.audioservice.service.watermark.AudioWatermarkServiceImpl;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0uPz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.audioservice.service.watermark.AudioWatermarkServiceImpl$fetchAudioWatermarkInfo$1", f = "AudioWatermarkServiceImpl.kt", l = {53, 54, 55}, m = "invokeSuspend")
public final class C1703010uPz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ AudioWatermarkServiceImpl LLILLL;
    public final /* synthetic */ List<String> LLILZ;
    public final /* synthetic */ List<String> LLILZIL;
    public final /* synthetic */ C013C LLILZLL;
    public final /* synthetic */ C259800zU<List<String>> LLIZ;
    public final /* synthetic */ C259800zU<List<String>> LLIZLLLIL;
    public final /* synthetic */ C259800zU<String> LLJ;
    public final /* synthetic */ Function1<AudioWatermarkInfo, Unit> LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1703010uPz(AudioWatermarkServiceImpl audioWatermarkServiceImpl, List<String> list, List<String> list2, C013C c013c, C259800zU<List<String>> c259800zU, C259800zU<List<String>> c259800zU2, C259800zU<String> c259800zU3, Function1<? super AudioWatermarkInfo, Unit> function1, InterfaceC1364105Vn<? super C1703010uPz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = audioWatermarkServiceImpl;
        this.LLILZ = list;
        this.LLILZIL = list2;
        this.LLILZLL = c013c;
        this.LLIZ = c259800zU;
        this.LLIZLLLIL = c259800zU2;
        this.LLJ = c259800zU3;
        this.LLJI = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1703010uPz c1703010uPz = new C1703010uPz(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn);
        c1703010uPz.LLILLJJLI = obj;
        return c1703010uPz;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x009d  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            r21 = this;
            r1 = r22
            java.lang.String r11 = "AudioWatermarkServiceImpl@9fc7.fetchAudioWatermarkInfo$1"
            X.C1C7U.LIZ(r11)
            java.lang.Object r7 = X.C099R.LJFF()
            r8 = r21
            int r0 = r8.LL
            r6 = 3
            r10 = 2
            r9 = 1
            r5 = 0
            if (r0 == 0) goto L24
            if (r0 == r9) goto L53
            if (r0 == r10) goto L6c
            if (r0 != r6) goto La1
            X.C155000ia.LIZIZ(r1)
        L1e:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r11)
            return r0
        L24:
            X.C155000ia.LIZIZ(r1)
            java.lang.Object r4 = r8.LLILLJJLI
            X.01wk r4 = (X.InterfaceC497601wk) r4
            X.0uPx r2 = new X.0uPx
            com.ss.android.ugc.gamora.editor.audioservice.service.watermark.AudioWatermarkServiceImpl r1 = r8.LLILLL
            java.util.List<java.lang.String> r0 = r8.LLILZ
            r2.<init>(r1, r0, r5)
            X.099G r3 = X.C23250099c.LIZIZ(r4, r5, r5, r2, r6)
            X.0uPy r2 = new X.0uPy
            com.ss.android.ugc.gamora.editor.audioservice.service.watermark.AudioWatermarkServiceImpl r1 = r8.LLILLL
            java.util.List<java.lang.String> r0 = r8.LLILZIL
            r2.<init>(r1, r0, r5)
            X.099G r0 = X.C23250099c.LIZIZ(r4, r5, r5, r2, r6)
            r8.LLILLJJLI = r0
            r8.LL = r9
            java.lang.Object r1 = r3.LJLIIIL(r8)
            if (r1 != r7) goto L5a
            X.C1C7U.LIZIZ(r11)
            return r7
        L53:
            java.lang.Object r0 = r8.LLILLJJLI
            X.0957 r0 = (X.AnonymousClass0957) r0
            X.C155000ia.LIZIZ(r1)
        L5a:
            com.ss.android.ugc.aweme.services.audio.TtsCreatorInfo r1 = (com.ss.android.ugc.aweme.services.audio.TtsCreatorInfo) r1
            r8.LLILLJJLI = r1
            r8.LL = r10
            java.lang.Object r14 = r0.LJLIIIL(r8)
            if (r14 != r7) goto L6a
            X.C1C7U.LIZIZ(r11)
            return r7
        L6a:
            r13 = r1
            goto L74
        L6c:
            java.lang.Object r13 = r8.LLILLJJLI
            com.ss.android.ugc.aweme.services.audio.TtsCreatorInfo r13 = (com.ss.android.ugc.aweme.services.audio.TtsCreatorInfo) r13
            X.C155000ia.LIZIZ(r1)
            r14 = r1
        L74:
            com.ss.android.ugc.aweme.services.audio.VcCreatorInfo r14 = (com.ss.android.ugc.aweme.services.audio.VcCreatorInfo) r14
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r4 = X.C2107308Nj.LIZ
            X.0uQ0 r12 = new X.0uQ0
            X.013C r15 = r8.LLILZLL
            X.00zU<java.util.List<java.lang.String>> r3 = r8.LLIZ
            X.00zU<java.util.List<java.lang.String>> r2 = r8.LLIZLLLIL
            X.00zU<java.lang.String> r1 = r8.LLJ
            kotlin.jvm.functions.Function1<com.ss.android.ugc.aweme.services.audio.AudioWatermarkInfo, kotlin.Unit> r0 = r8.LLJI
            r18 = r1
            r19 = r0
            r20 = r5
            r16 = r3
            r17 = r2
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20)
            r8.LLILLJJLI = r5
            r8.LL = r6
            java.lang.Object r0 = X.C23250099c.LJI(r8, r4, r12)
            if (r0 != r7) goto L1e
            X.C1C7U.LIZIZ(r11)
            return r7
        La1:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1703010uPz.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
