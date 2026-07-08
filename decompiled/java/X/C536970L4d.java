package X;

import com.ss.android.ugc.gamora.recorder.sticker.l0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0L4d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.sticker.RecordStickerLogicComponent$setCurGreenScreenMaterial$2", f = "RecordStickerLogicComponent.kt", l = {3400}, m = "invokeSuspend")
public final class C536970L4d extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public l0 LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public int LLILZ;
    public final /* synthetic */ l0 LLILZIL;
    public final /* synthetic */ C1621190sI1[] LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C536970L4d(l0 l0Var, C1621190sI1[] c1621190sI1Arr, InterfaceC1364105Vn<? super C536970L4d> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = l0Var;
        this.LLILZLL = c1621190sI1Arr;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C536970L4d(this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0057 -> B:6:0x001d). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.String r7 = "RecordStickerLogicComponent@6428.setCurGreenScreenMaterial$2"
            X.C1C7U.LIZ(r7)
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r14.LLILZ
            r3 = 1
            if (r0 == 0) goto L5d
            if (r0 != r3) goto La7
            java.lang.Object r6 = r14.LLILLL
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            java.lang.Object r5 = r14.LLILLJJLI
            java.util.Iterator r5 = (java.util.Iterator) r5
            com.ss.android.ugc.gamora.recorder.sticker.l0 r0 = r14.LL
            X.C155000ia.LIZIZ(r15)
        L1d:
            r6.add(r15)
        L20:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto La1
            java.lang.Object r2 = r5.next()
            X.0sI1 r2 = (X.C1621190sI1) r2
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r1 = r0.getShortVideoContext()
            com.ss.android.ugc.aweme.shortvideo.CameraComponentModel r1 = r1.cameraComponentModel
            java.util.ArrayList<com.ss.android.ugc.aweme.mediachoose.helper.AIGCInfo> r6 = r1.greenScreenSourceInfos
            X.140D r8 = X.C140D.LIZ
            com.ss.android.ugc.aweme.mediachoose.helper.MediaModel r9 = new com.ss.android.ugc.aweme.mediachoose.helper.MediaModel
            java.lang.String r1 = r2.LIZJ
            r9.<init>(r1)
            java.lang.String r1 = r2.LIZ
            r9.LJIILL(r1)
            r10 = 0
            r14.LL = r0
            r14.LLILLJJLI = r5
            r14.LLILLL = r6
            r14.LLILZ = r3
            r8.getClass()
            long r11 = X.C140D.LJIIZILJ()
            r13 = r10
            java.lang.Object r15 = r8.LJIILJJIL(r9, r10, r11, r13, r14)
            if (r15 != r4) goto L1d
            X.C1C7U.LIZIZ(r7)
            return r4
        L5d:
            X.C155000ia.LIZIZ(r15)
            com.ss.android.ugc.gamora.recorder.sticker.l0 r0 = r14.LLILZIL
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r0.getShortVideoContext()
            com.ss.android.ugc.aweme.shortvideo.CameraComponentModel r0 = r0.cameraComponentModel
            java.util.ArrayList<com.ss.android.ugc.aweme.mediachoose.helper.AIGCInfo> r0 = r0.greenScreenSourceInfos
            r0.clear()
            java.util.ArrayList r1 = new java.util.ArrayList
            X.0sI1[] r0 = r14.LLILZLL
            java.util.List r0 = X.C13LQ.LJJLL(r0)
            r1.<init>(r0)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r2 = r1.iterator()
        L81:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L9a
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.0sI1 r0 = (X.C1621190sI1) r0
            java.lang.String r0 = r0.LIZ
            boolean r0 = X.C123100dR.LIZ(r0)
            if (r0 == 0) goto L81
            r5.add(r1)
            goto L81
        L9a:
            com.ss.android.ugc.gamora.recorder.sticker.l0 r0 = r14.LLILZIL
            java.util.Iterator r5 = r5.iterator()
            goto L20
        La1:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r7)
            return r0
        La7:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C536970L4d.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
