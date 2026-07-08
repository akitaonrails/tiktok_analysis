package X;

import com.ss.android.ugc.aweme.im.sdk.chat.ui.adapter.MessageListLongPressAssem$setupLongPressListener$1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0ZL5, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZL5 implements C0ZL8 {
    public final /* synthetic */ C0ZL8 LL;
    public final /* synthetic */ C0ZL8 LLILLJJLI;
    public final /* synthetic */ C893630Z3x LLILLL;

    @Override // X.C0ZL8
    public final void LIZJ() {
        this.LL.LIZJ();
    }

    @Override // X.C0ZL8
    public final C0ZL9 LIZLLL() {
        return this.LL.LIZLLL();
    }

    @Override // X.C0ZL8
    public final void LIZ(C0ZL0 c0zl0) {
        Function0<Unit> function0;
        this.LLILLL.LLJJI.setValue(C0OBW.HIDDEN);
        this.LLILLL.LLJJIJIL = null;
        this.LLILLJJLI.LIZ(c0zl0);
        C893630Z3x c893630Z3x = this.LLILLL;
        C0ZL0 c0zl02 = c893630Z3x.LLJJIJI;
        if (c0zl02 != null && (function0 = c893630Z3x.LLJJIJIIJIL) != null) {
            c893630Z3x.LLJJIJI = null;
            c893630Z3x.LLJJIJIIJIL = null;
            if (c0zl02 == c0zl0) {
                function0.invoke();
            }
        }
    }

    @Override // X.C0ZL8
    public final void onShow(boolean z) {
        this.LLILLL.LLJJI.setValue(C0OBW.SHOWN);
        this.LLILLJJLI.onShow(false);
    }

    public C0ZL5(MessageListLongPressAssem$setupLongPressListener$1 messageListLongPressAssem$setupLongPressListener$1, C893630Z3x c893630Z3x) {
        this.LLILLJJLI = messageListLongPressAssem$setupLongPressListener$1;
        this.LLILLL = c893630Z3x;
        this.LL = messageListLongPressAssem$setupLongPressListener$1;
    }
}
