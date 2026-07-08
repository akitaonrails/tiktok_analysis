package X;

import com.bef.effectsdk.message.MessageCenter;
import com.bytedance.ies.nle.editor_jni.INLEPlayer;
import com.bytedance.ies.nle.editor_jni.NLEAllowListOperationType;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEMediaUtil;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecString;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0ExT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C381450ExT extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C381430ExR LL;
    public final /* synthetic */ InterfaceC381500ExY<C381330ExH> LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ C381480ExW LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C381450ExT(C381430ExR c381430ExR, InterfaceC381500ExY<C381330ExH> interfaceC381500ExY, String str, String str2, C381480ExW c381480ExW) {
        super(0);
        this.LL = c381430ExR;
        this.LLILLJJLI = interfaceC381500ExY;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = c381480ExW;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.0ExX] */
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        final C118300cf c118300cf = new C118300cf();
        C381430ExR c381430ExR = this.LL;
        InterfaceC381500ExY<C381330ExH> interfaceC381500ExY = this.LLILLJJLI;
        c381430ExR.LIZJ = interfaceC381500ExY;
        interfaceC381500ExY.LIZ(this.LLILLL);
        final C381430ExR c381430ExR2 = this.LL;
        final InterfaceC381500ExY<C381330ExH> interfaceC381500ExY2 = this.LLILLJJLI;
        final C381480ExW c381480ExW = this.LLILZIL;
        final String str = this.LLILLL;
        c381430ExR2.LIZIZ = new MessageCenter.Listener() { // from class: X.0ExX
            @Override // com.bef.effectsdk.message.MessageCenter.Listener
            public final void onMessageReceived(int i, int i2, int i3, String str2) {
                C383980F3s.LIZIZ(new C381440ExS(c381430ExR2, i, i2, i3, str2, interfaceC381500ExY2, c381480ExW, str));
            }
        };
        MessageCenter.init();
        MessageCenter.addListener(this.LL.LIZIZ);
        C381430ExR c381430ExR3 = this.LL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('[');
        sbLIZ.append(this.LL.LJ);
        sbLIZ.append("] seek time and addListener: cacheUrl=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", operatedPath=");
        sbLIZ.append(this.LLILZ);
        C381530Exb.LIZJ(c381430ExR3, C2188811AlT.LIZIZ(sbLIZ));
        NLEMediaUtil.operateGlobalAllowedPaths(new VecString(new String[]{this.LLILLL}), NLEAllowListOperationType.NLE_ALLOWLISTOPERATION_TYPE_ADD);
        NLEEditor nLEEditor = this.LLILZIL.LJ;
        if (nLEEditor != null) {
            nLEEditor.commit();
        }
        C381480ExW c381480ExW2 = this.LLILZIL;
        final boolean z = !c381480ExW2.LJI;
        if (z) {
            this.LL.getClass();
            INLEPlayer iNLEPlayer = c381480ExW2.LJFF;
            if (iNLEPlayer != null) {
                NLETrackSlot nLETrackSlot = c381480ExW2.LIZ;
                long currentPosition = iNLEPlayer.getCurrentPosition();
                if (currentPosition < nLETrackSlot.getStartTime() || currentPosition >= nLETrackSlot.getEndTime()) {
                    long startTime = nLETrackSlot.getStartTime() + (nLETrackSlot.getDuration() / ((long) 2));
                    INLEPlayer iNLEPlayer2 = c381480ExW2.LJFF;
                    if (iNLEPlayer2 != null) {
                        iNLEPlayer2.seekTime(startTime);
                        iNLEPlayer2.refreshCurrentFrame();
                    }
                }
            }
        }
        final float fLJIJ = this.LLILZIL.LJI ? C0C64.LJIILLIIL().LJIJ(31744, 120, "studio_template_magic_timeout_secs", true) * 10.0f : 1200.0f;
        C381430ExR c381430ExR4 = this.LL;
        PthreadTimer pthreadTimer = new PthreadTimer("CombineEffectTask$execute$5");
        final C381430ExR c381430ExR5 = this.LL;
        final C381480ExW c381480ExW3 = this.LLILZIL;
        final InterfaceC381500ExY<C381330ExH> interfaceC381500ExY3 = this.LLILLJJLI;
        pthreadTimer.schedule(new C0W9W() { // from class: X.0ExV
            @Override // java.util.TimerTask, java.lang.Runnable
            public final void run() {
                C1C7U.LIZ("CombineEffectTask@caec.execute$5$2$1");
                boolean zLJ = C0W9U.LJ(this.bpeaTraceContext);
                try {
                    C383980F3s.LIZIZ(new C381460ExU(z, c381430ExR5, c381480ExW3, c118300cf, fLJIJ, interfaceC381500ExY3));
                } finally {
                }
                if (zLJ) {
                    C0W9U.LJFF();
                }
                C1C7U.LIZIZ("CombineEffectTask@caec.execute$5$2$1");
            }
        }, 0L, 100L);
        c381430ExR4.LIZ = pthreadTimer;
        return Unit.LIZ;
    }
}
