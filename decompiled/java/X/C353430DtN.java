package X;

import com.ss.android.ugc.gamora.editorpro.capabilities.audio.beats.ui.AudioBeatsPanelFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0DtN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.capabilities.audio.beats.ui.AudioBeatsPanelFragment$flowTrackMoveTime$1", f = "AudioBeatsPanelFragment.kt", l = {610, 613}, m = "invokeSuspend")
public final class C353430DtN extends C09AX implements Function2<InterfaceC346701Wf<? super Integer>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ AudioBeatsPanelFragment LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C353430DtN(AudioBeatsPanelFragment audioBeatsPanelFragment, InterfaceC1364105Vn<? super C353430DtN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = audioBeatsPanelFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C353430DtN c353430DtN = new C353430DtN(this.LLILLL, interfaceC1364105Vn);
        c353430DtN.LLILLJJLI = obj;
        return c353430DtN;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0055 -> B:7:0x001a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.String r6 = "AudioBeatsPanelFragment@8e62.flowTrackMoveTime$1"
            X.C1C7U.LIZ(r6)
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r7.LL
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L5b
            if (r0 == r3) goto L44
            if (r0 != r4) goto L63
            java.lang.Object r0 = r7.LLILLJJLI
            X.01Wf r0 = (X.InterfaceC346701Wf) r0
            X.C155000ia.LIZIZ(r8)
        L1a:
            com.ss.android.ugc.gamora.editorpro.capabilities.audio.beats.ui.AudioBeatsPanelFragment r1 = r7.LLILLL
            X.0E48 r1 = r1.LL
            if (r1 == 0) goto L4b
            X.0E55 r1 = r1.getPlayer()
            if (r1 == 0) goto L4b
            boolean r1 = r1.isPlaying()
            if (r1 != r3) goto L4b
            com.ss.android.ugc.gamora.editorpro.capabilities.audio.beats.ui.AudioBeatsPanelFragment r1 = r7.LLILLL
            int r1 = r1.uT()
            java.lang.Integer r1 = X.C2286608xc.LJ(r1)
            r7.LLILLJJLI = r0
            r7.LL = r3
            java.lang.Object r1 = r0.emit(r1, r7)
            if (r1 != r5) goto L4b
            X.C1C7U.LIZIZ(r6)
            return r5
        L44:
            java.lang.Object r0 = r7.LLILLJJLI
            X.01Wf r0 = (X.InterfaceC346701Wf) r0
            X.C155000ia.LIZIZ(r8)
        L4b:
            r7.LLILLJJLI = r0
            r7.LL = r4
            r1 = 20
            java.lang.Object r1 = X.AnonymousClass0958.LIZIZ(r1, r7)
            if (r1 != r5) goto L1a
            X.C1C7U.LIZIZ(r6)
            return r5
        L5b:
            X.C155000ia.LIZIZ(r8)
            java.lang.Object r0 = r7.LLILLJJLI
            X.01Wf r0 = (X.InterfaceC346701Wf) r0
            goto L1a
        L63:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C353430DtN.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC346701Wf<? super Integer> interfaceC346701Wf, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC346701Wf, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
