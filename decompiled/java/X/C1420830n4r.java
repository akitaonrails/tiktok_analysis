package X;

import android.content.Context;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0n4r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.download.StickPointDownloadHelper$downloadMusicInfoV2$1", f = "StickPointDownloadHelper.kt", l = {224, 226}, m = "invokeSuspend")
public final class C1420830n4r extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ InterfaceC1420890n4x LLILLL;
    public final /* synthetic */ Context LLILZ;
    public final /* synthetic */ AVMusic LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1420830n4r(InterfaceC1420890n4x interfaceC1420890n4x, Context context, AVMusic aVMusic, InterfaceC1364105Vn<? super C1420830n4r> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = interfaceC1420890n4x;
        this.LLILZ = context;
        this.LLILZIL = aVMusic;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1420830n4r c1420830n4r = new C1420830n4r(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c1420830n4r.LLILLJJLI = obj;
        return c1420830n4r;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.String r10 = "StickPointDownloadHelper@e94d.downloadMusicInfoV2$1"
            X.C1C7U.LIZ(r10)
            java.lang.Object r8 = X.C099R.LJFF()
            int r0 = r11.LL
            r7 = 2
            r6 = 0
            r5 = 1
            if (r0 == 0) goto L38
            if (r0 == r5) goto L68
            if (r0 != r7) goto Lab
            X.C155000ia.LIZIZ(r12)
        L17:
            kotlin.Pair r12 = (kotlin.Pair) r12
            java.lang.Object r0 = r12.getFirst()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            java.lang.Object r3 = r12.getSecond()
            com.ss.android.ugc.aweme.creative.model.music.AVMusic r3 = (com.ss.android.ugc.aweme.creative.model.music.AVMusic) r3
            if (r0 == 0) goto L96
            X.0n4x r0 = r11.LLILLL
            if (r0 == 0) goto L32
            r0.LIZLLL(r3, r5)
        L32:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r10)
            return r0
        L38:
            X.C155000ia.LIZIZ(r12)
            java.lang.Object r9 = r11.LLILLJJLI
            X.01wk r9 = (X.InterfaceC497601wk) r9
            X.0n53 r2 = new X.0n53
            android.content.Context r1 = r11.LLILZ
            com.ss.android.ugc.aweme.creative.model.music.AVMusic r0 = r11.LLILZIL
            r2.<init>(r1, r0, r6)
            r3 = 3
            X.099G r4 = X.C23250099c.LIZIZ(r9, r6, r6, r2, r3)
            X.0n4t r2 = new X.0n4t
            android.content.Context r1 = r11.LLILZ
            com.ss.android.ugc.aweme.creative.model.music.AVMusic r0 = r11.LLILZIL
            r2.<init>(r1, r0, r6)
            X.099G r3 = X.C23250099c.LIZIZ(r9, r6, r6, r2, r3)
            r11.LLILLJJLI = r3
            r11.LL = r5
            java.lang.Object r12 = r4.LJLIIIL(r11)
            if (r12 != r8) goto L6f
            X.C1C7U.LIZIZ(r10)
            return r8
        L68:
            java.lang.Object r3 = r11.LLILLJJLI
            X.0957 r3 = (X.AnonymousClass0957) r3
            X.C155000ia.LIZIZ(r12)
        L6f:
            kotlin.Pair r12 = (kotlin.Pair) r12
            X.0n4x r2 = r11.LLILLL
            if (r2 == 0) goto L88
            java.lang.Object r1 = r12.getSecond()
            com.ss.android.ugc.aweme.creative.model.music.AVMusic r1 = (com.ss.android.ugc.aweme.creative.model.music.AVMusic) r1
            java.lang.Object r0 = r12.getFirst()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r2.LIZJ(r1, r0)
        L88:
            r11.LLILLJJLI = r6
            r11.LL = r7
            java.lang.Object r12 = r3.LJLIIIL(r11)
            if (r12 != r8) goto L17
            X.C1C7U.LIZIZ(r10)
            return r8
        L96:
            X.0n54 r2 = X.C1420960n54.LIZ
            X.0n4s r1 = new X.0n4s
            X.0n4x r0 = r11.LLILLL
            r1.<init>()
            r2.getClass()
            X.C1420960n54.LJ(r3, r1)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r10)
            return r0
        Lab:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1420830n4r.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
