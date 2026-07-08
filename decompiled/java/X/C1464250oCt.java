package X;

import com.bytedance.ies.nle.editor_jni.INLEEffectRuntime;
import com.bytedance.ies.nle.editor_jni.INLEListenerDoAction;
import com.bytedance.ies.nle.editor_jni.INLEListenerEffectMsg;
import com.bytedance.ies.nle.editor_jni.MapStrStr;
import com.bytedance.ies.nle.editor_jni.NLEDoActionListenerWrapper;
import com.bytedance.ies.nle.editor_jni.NLEEffectMsgListenerWrapper;
import com.bytedance.ies.nle.editor_jni.NLEEffectRuntimeController;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0oCt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1464250oCt extends C0FRA implements INLEEffectRuntime {
    public C1464270oCv LJ;

    public final NLEEffectRuntimeController LIZJ() {
        C1464240oCs c1464240oCs = this.LIZ;
        if (c1464240oCs.LIZ == null || c1464240oCs.LIZLLL.get()) {
            return null;
        }
        return (NLEEffectRuntimeController) c1464240oCs.LJIIJJI.getValue();
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEEffectRuntime
    public final int removeEffectMessageCenterCallback() {
        int iRemoveEffectMessageCenterCallback;
        synchronized (this.LIZ) {
            try {
                NLEEffectRuntimeController nLEEffectRuntimeControllerLIZJ = LIZJ();
                iRemoveEffectMessageCenterCallback = nLEEffectRuntimeControllerLIZJ != null ? nLEEffectRuntimeControllerLIZJ.removeEffectMessageCenterCallback() : -1;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return iRemoveEffectMessageCenterCallback;
    }

    public C1464250oCt(C1464240oCs c1464240oCs) {
        super(c1464240oCs);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0oCv] */
    @Override // com.bytedance.ies.nle.editor_jni.INLEEffectRuntime
    public final int setEffectMessageCenterCallback(final INLEListenerEffectMsg iNLEListenerEffectMsg) {
        if (LIZJ() == null) {
            return -1;
        }
        if (iNLEListenerEffectMsg != null) {
            this.LJ = new NLEEffectMsgListenerWrapper() { // from class: X.0oCv
                @Override // com.bytedance.ies.nle.editor_jni.NLEEffectMsgListenerWrapper
                public final void onMessageReceived(int i, int i2, int i3, String str) {
                    iNLEListenerEffectMsg.onMessageReceived(i, i2, i3, str);
                }
            };
        }
        NLEEffectRuntimeController nLEEffectRuntimeControllerLIZJ = LIZJ();
        if (nLEEffectRuntimeControllerLIZJ == null) {
            return -1;
        }
        return nLEEffectRuntimeControllerLIZJ.setEffectMessageCenterCallback(this.LJ);
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEEffectRuntime
    public final int doAction(Boolean bool, String str, int i, MapStrStr mapStrStr, final INLEListenerDoAction iNLEListenerDoAction) {
        boolean zBooleanValue = bool.booleanValue();
        NLEDoActionListenerWrapper nLEDoActionListenerWrapper = new NLEDoActionListenerWrapper() { // from class: X.0oCu
            @Override // com.bytedance.ies.nle.editor_jni.NLEDoActionListenerWrapper
            public final void onDoActionCompleted(MapStrStr mapStrStr2) {
                iNLEListenerDoAction.onDoActionCompleted(mapStrStr2);
            }
        };
        NLEEffectRuntimeController nLEEffectRuntimeControllerLIZJ = LIZJ();
        if (nLEEffectRuntimeControllerLIZJ != null) {
            return nLEEffectRuntimeControllerLIZJ.doAction(zBooleanValue, str, i, mapStrStr, nLEDoActionListenerWrapper);
        }
        return -1;
    }
}
