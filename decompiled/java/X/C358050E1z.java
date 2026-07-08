package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0E1z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.capabilities.audio.stickpoint.EditorProStickPointNLEHandler$startDefaultStickPointNew$1$2", f = "EditorProStickPointNLEHandler.kt", l = {}, m = "invokeSuspend")
public final class C358050E1z extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ InterfaceC358010E1v LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ C357990E1t LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ List<Integer> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C358050E1z(int i, InterfaceC358010E1v interfaceC358010E1v, String str, C357990E1t c357990E1t, int i2, List<Integer> list, InterfaceC1364105Vn<? super C358050E1z> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = i;
        this.LLILLJJLI = interfaceC358010E1v;
        this.LLILLL = str;
        this.LLILZ = c357990E1t;
        this.LLILZIL = i2;
        this.LLILZLL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C358050E1z(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00b8  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.String r7 = "EditorProStickPointNLEHandler@b1b1.startDefaultStickPointNew$1$2"
            X.C1C7U.LIZ(r7)
            X.C099R.LJFF()
            X.C155000ia.LIZIZ(r9)
            int r1 = r8.LL
            r0 = -1
            if (r1 != r0) goto L1d
            X.0E1v r0 = r8.LLILLJJLI
            if (r0 == 0) goto Lb8
            r0.onFailed()
            kotlin.Unit r0 = kotlin.Unit.LIZ
        L19:
            X.C1C7U.LIZIZ(r7)
            return r0
        L1d:
            java.lang.String r5 = r8.LLILLL
            if (r5 == 0) goto La2
            X.0E1t r4 = r8.LLILZ
            com.ss.android.ugc.aweme.creative.model.music.AVMusic r0 = r4.LJ
            r4.LIZIZ(r0, r5)
            X.0E48 r0 = r4.LIZJ
            if (r0 == 0) goto L9a
            com.bytedance.ies.nle.editor_jni.NLETrack r2 = X.C350890DpH.LIZLLL(r0)
            if (r2 == 0) goto L9a
            java.lang.String r1 = "AudioTrackType"
            java.lang.String r0 = "BGM"
            r2.setExtra(r1, r0)
            com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr r0 = r2.getSortedSlots()
            if (r0 == 0) goto L9a
            java.util.Iterator r6 = r0.iterator()
        L43:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L9a
            java.lang.Object r3 = r6.next()
            com.bytedance.ies.nle.editor_jni.NLETrackSlot r3 = (com.bytedance.ies.nle.editor_jni.NLETrackSlot) r3
            com.bytedance.ies.nle.editor_jni.NLESegment r0 = r3.getMainSegment()
            X.C351220Dpo.LLLLLJLJLL(r0)
            com.bytedance.ies.nle.editor_jni.NLESegment r0 = r3.getMainSegment()
            com.bytedance.ies.nle.editor_jni.NLESegmentAudio r0 = com.bytedance.ies.nle.editor_jni.NLESegmentAudio.dynamicCast(r0)
            if (r0 == 0) goto L77
            com.bytedance.ies.nle.editor_jni.NLEResourceNode r2 = r0.getResource()
            if (r2 == 0) goto L77
            com.ss.android.ugc.aweme.creative.model.music.AVMusic r1 = r4.LJ
            if (r1 == 0) goto L72
            X.19EG r0 = r4.LIZ
            java.lang.String r0 = X.C1419800n3C.LIZIZ(r0, r1)
            if (r0 != 0) goto L74
        L72:
            java.lang.String r0 = ""
        L74:
            r2.setResourceName(r0)
        L77:
            com.bytedance.ies.nle.editor_jni.NLESegment r0 = r3.getMainSegment()
            com.bytedance.ies.nle.editor_jni.NLESegmentAudio r0 = com.bytedance.ies.nle.editor_jni.NLESegmentAudio.dynamicCast(r0)
            if (r0 == 0) goto L43
            com.bytedance.ies.nle.editor_jni.NLEResourceNode r3 = r0.getResource()
            if (r3 == 0) goto L43
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            X.13qo r0 = X.C20137613qo.LIZ
            X.0E21 r0 = X.C20137613qo.LIZJ(r5)
            int r0 = r0.LIZ
            long r0 = (long) r0
            long r0 = r2.toMicros(r0)
            r3.setDuration(r0)
            goto L43
        L9a:
            X.0E48 r1 = r4.LIZJ
            if (r1 == 0) goto La2
            r0 = 0
            X.C350870DpF.LIZ(r1, r0)
        La2:
            X.0E1t r2 = r8.LLILZ
            int r1 = r8.LLILZIL
            java.util.List<java.lang.Integer> r0 = r8.LLILZLL
            r2.LJI(r1, r0)
            X.0E1v r1 = r8.LLILLJJLI
            if (r1 == 0) goto Lb8
            int r0 = r8.LL
            r1.LIZ(r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            goto L19
        Lb8:
            r0 = 0
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C358050E1z.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
