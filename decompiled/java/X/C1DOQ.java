package X;

import com.ss.android.vesdk.VEEditor;

/* JADX INFO: renamed from: X.1DOQ, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public class C1DOQ implements InterfaceC2185751AgX {
    public final /* synthetic */ VEEditor LIZ;

    public C1DOQ(VEEditor vEEditor) {
        this.LIZ = vEEditor;
    }

    @Override // X.InterfaceC2185751AgX
    public final void onCallback(final int i, final int i2, final float f, final String str) {
        VEEditor.VEEditorMessageHandler vEEditorMessageHandler;
        this.LIZ.getClass();
        InterfaceC1464200oCo interfaceC1464200oCo = this.LIZ.LLJJIII;
        if (interfaceC1464200oCo != null) {
            interfaceC1464200oCo.onCallback(i, i2, f, str);
        }
        if (this.LIZ.LLJIJIL != null && (vEEditorMessageHandler = this.LIZ.LLJ) != null) {
            vEEditorMessageHandler.post(new Runnable() { // from class: X.1DOR
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("VEEditor@7fe9.<field>$4$onCallback$1");
                    try {
                        if (this.LLILZIL.LIZ.LLJIJIL != null) {
                            this.LLILZIL.LIZ.LLJIJIL.onCompileError(i, i2, f, str);
                        }
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("VEEditor@7fe9.<field>$4$onCallback$1");
                }
            });
        }
    }
}
