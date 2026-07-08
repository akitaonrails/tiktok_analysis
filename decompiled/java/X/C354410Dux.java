package X;

import androidx.lifecycle.LifecycleCoroutineScope;
import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0Dux, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C354410Dux extends AbstractC354420Duy implements InterfaceC354440Dv0 {
    public final InterfaceC497601wk LL;
    public final CreativeInfo LLILLJJLI;
    public final NLEEditor LLILLL;
    public final INLEMediaSession LLILZ;
    public C354540DvA LLILZIL;
    public InterfaceC354020DuK LLILZLL;
    public AnonymousClass0956 LLIZ;
    public AnonymousClass0956 LLIZLLLIL;
    public AnonymousClass0956 LLJ;

    @Override // X.InterfaceC354440Dv0
    public final void LIZIZ() {
        String strLJII;
        ICreationAsyncTaskManager iCreationAsyncTaskManagerLIZ;
        C354540DvA c354540DvA = this.LLILZIL;
        if (c354540DvA == null || (strLJII = C352250DrT.LJII(c354540DvA.LIZIZ.LIZIZ)) == null || (iCreationAsyncTaskManagerLIZ = C09BV.LIZ()) == null) {
            return;
        }
        iCreationAsyncTaskManagerLIZ.LJJIII(strLJII);
    }

    public final void LJ() {
        AnonymousClass0956 anonymousClass0956 = this.LLJ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        AnonymousClass0956 anonymousClass09562 = this.LLIZ;
        if (anonymousClass09562 != null) {
            anonymousClass09562.LIZIZ(null);
        }
        AnonymousClass0956 anonymousClass09563 = this.LLIZLLLIL;
        if (anonymousClass09563 != null) {
            anonymousClass09563.LIZIZ(null);
        }
    }

    @Override // X.AbstractC354420Duy
    public final void LIZLLL(C354540DvA c354540DvA, C354550DvB c354550DvB) throws Throwable {
        NLETrackSlot nLETrackSlot = c354540DvA.LIZIZ.LIZIZ;
        C354260Dui.LIZ.getClass();
        if (C354260Dui.LJI(nLETrackSlot) != null) {
            C23250099c.LJ(C23271099x.INSTANCE, new C354250Duh(c354540DvA, this, nLETrackSlot, null));
        }
    }

    @Override // X.AbstractC354420Duy
    public final void LIZJ(C354540DvA c354540DvA, C354550DvB c354550DvB, C354570DvD c354570DvD) {
        Map linkedHashMap;
        C354510Dv7 c354510Dv7 = c354540DvA.LIZIZ.LIZ;
        if (!C357030DzB.LIZ(c354510Dv7)) {
            if (c354570DvD == null || (linkedHashMap = c354570DvD.LIZJ) == null) {
                linkedHashMap = new LinkedHashMap();
            }
            c354550DvB.LIZ(new C354570DvD(true, null, linkedHashMap, 2));
            return;
        }
        this.LLILZIL = c354540DvA;
        this.LLILZLL = c354550DvB;
        C23250099c.LIZLLL(this.LL, null, null, new C354450Dv1(this, c354510Dv7, c354550DvB, c354540DvA, null), 3);
    }

    public C354410Dux(LifecycleCoroutineScope lifecycleCoroutineScope, CreativeInfo creativeInfo, NLEEditor nLEEditor, INLEMediaSession iNLEMediaSession) {
        this.LL = lifecycleCoroutineScope;
        this.LLILLJJLI = creativeInfo;
        this.LLILLL = nLEEditor;
        this.LLILZ = iNLEMediaSession;
    }
}
