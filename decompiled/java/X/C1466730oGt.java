package X;

import com.bytedance.ies.nle.editor_jni.INLEListenerSeek;

/* JADX INFO: renamed from: X.0oGt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public class C1466730oGt implements INLEListenerSeek {
    public final int $t;
    public Object l0;

    @Override // com.bytedance.ies.nle.editor_jni.INLEListenerSeek
    public final void onSeekDone(int i) {
        switch (this.$t) {
            case 0:
                onSeekDone$0(this, i);
                break;
            case 1:
                onSeekDone$1(this, i);
                break;
        }
    }

    public C1466730oGt(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onSeekDone$0(C1466730oGt c1466730oGt, int i) {
        Runnable runnable = ((C1463670oBx) c1466730oGt.l0).LIZLLL;
        if (runnable != null) {
            runnable.run();
        }
        ((C1463670oBx) c1466730oGt.l0).LIZLLL = null;
    }

    public static final void onSeekDone$1(C1466730oGt c1466730oGt, int i) {
        InterfaceC1464180oCm interfaceC1464180oCm = (InterfaceC1464180oCm) c1466730oGt.l0;
        if (interfaceC1464180oCm != null) {
            interfaceC1464180oCm.onSeekDone(i);
        }
    }
}
