package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0miW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.audiometrics.AudioMetricsHelper$checkAndDetectOriginVideoAudioMetrics$1", f = "AudioMetricsHelper.kt", l = {80, 97}, m = "invokeSuspend")
public final class C1406980miW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public VideoPublishEditModel LLILLJJLI;
    public Object LLILLL;
    public long LLILZ;
    public int LLILZIL;
    public final /* synthetic */ VideoPublishEditModel LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1406980miW(VideoPublishEditModel videoPublishEditModel, InterfaceC1364105Vn<? super C1406980miW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZLL = videoPublishEditModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1406980miW(this.LLILZLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00a1 -> B:7:0x0022). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.String r10 = "AudioMetricsHelper@eff5.checkAndDetectOriginVideoAudioMetrics$1"
            X.C1C7U.LIZ(r10)
            java.lang.Object r9 = X.C099R.LJFF()
            int r0 = r11.LLILZIL
            r8 = 2
            r7 = 1
            if (r0 == 0) goto L39
            if (r0 == r7) goto L51
            if (r0 != r8) goto Lb8
            long r2 = r11.LLILZ
            java.lang.Object r6 = r11.LLILLL
            java.util.Iterator r6 = (java.util.Iterator) r6
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r4 = r11.LLILLJJLI
            java.lang.Object r5 = r11.LL
            java.lang.String r5 = (java.lang.String) r5
            X.C155000ia.LIZIZ(r12)
        L22:
            java.lang.String r12 = (java.lang.String) r12
            int r0 = r12.length()
            if (r0 != 0) goto L30
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r10)
            return r0
        L30:
            X.0mid r0 = X.C1407050mid.LIZ
            r0.getClass()
            X.C1407050mid.LJ(r7, r2, r4, r12)
            goto L73
        L39:
            X.C155000ia.LIZIZ(r12)
            X.05X0 r0 = X.C05X0.LIZ
            r11.LLILZIL = r7
            r0.getClass()
            java.lang.String r1 = ""
            java.lang.String r0 = "audio_metrics"
            java.lang.Object r12 = X.C05X0.LIZ(r1, r0, r11)
            if (r12 != r9) goto L54
            X.C1C7U.LIZIZ(r10)
            return r9
        L51:
            X.C155000ia.LIZIZ(r12)
        L54:
            java.lang.String r12 = (java.lang.String) r12
            int r0 = r12.length()
            if (r0 != 0) goto L62
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r10)
            return r0
        L62:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r11.LLILZLL
            com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo r0 = r0.getPreviewInfo()
            java.util.List r0 = r0.getVideoList()
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r4 = r11.LLILZLL
            java.util.Iterator r6 = r0.iterator()
            r5 = r12
        L73:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto Lc0
            java.lang.Object r1 = r6.next()
            com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment r1 = (com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment) r1
            boolean r0 = r4.realHasOriginalSound()
            if (r0 == 0) goto La7
            java.lang.String r1 = r1.getAudioPath()
        L89:
            if (r1 == 0) goto L73
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.String r0 = X.C1404630mej.LIZJ()
            r11.LL = r5
            r11.LLILLJJLI = r4
            r11.LLILLL = r6
            r11.LLILZ = r2
            r11.LLILZIL = r8
            java.lang.Object r12 = X.C1407310mj3.LIZIZ(r1, r5, r0, r11)
            if (r12 != r9) goto L22
            X.C1C7U.LIZIZ(r10)
            return r9
        La7:
            boolean r0 = r4.isFastImport()
            if (r0 != 0) goto Lb3
            boolean r0 = r4.isCutSameVideoType()
            if (r0 == 0) goto L73
        Lb3:
            java.lang.String r1 = r1.getVideoPath()
            goto L89
        Lb8:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        Lc0:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1406980miW.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
