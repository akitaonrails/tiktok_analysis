package X;

import androidx.compose.ui.platform.ComposeView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0S8T, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0S8T implements InterfaceC716320S7y {
    public final /* synthetic */ C0S8V LIZ;
    public final /* synthetic */ ComposeView LIZIZ;

    public final C0SBU LIZ() {
        return this.LIZ.LIZIZ();
    }

    public final void LIZJ() {
        C0S8V c0s8v = this.LIZ;
        ((C13FE) c0s8v.LIZ).setValue(EnumC716470S8n.LOADING);
    }

    public final void LIZLLL() {
        C0S8V c0s8v = this.LIZ;
        ((C13FE) c0s8v.LIZ).setValue(EnumC716470S8n.LOADED);
    }

    public final void LIZIZ(Function0<Unit> function0) {
        C0S8V c0s8v = this.LIZ;
        ((C13FE) c0s8v.LIZ).setValue(EnumC716470S8n.ERROR_FULL_FETCH);
        this.LIZ.LIZIZ = function0;
    }

    public C0S8T(C0S8V c0s8v, ComposeView composeView) {
        this.LIZ = c0s8v;
        this.LIZIZ = composeView;
    }
}
