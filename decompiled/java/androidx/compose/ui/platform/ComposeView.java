package androidx.compose.ui.platform;

import X.AbstractC20085213iM;
import X.C05P0;
import X.C13FE;
import X.C20028913Yh;
import X.InterfaceC1680500tpg;
import android.content.Context;
import android.util.AttributeSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes20.dex */
public final class ComposeView extends AbstractC20085213iM {
    public static final /* synthetic */ int LLJIJIL = 0;
    public final C05P0<Function2<InterfaceC1680500tpg, Integer, Unit>> LLJ;
    public boolean LLJI;

    public ComposeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.compose.ui.platform.ComposeView";
    }

    @Override // X.AbstractC20085213iM
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.LLJI;
    }

    public final void setContent(Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function2) {
        this.LLJI = true;
        ((C13FE) this.LLJ).setValue(function2);
        if (isAttachedToWindow()) {
            LIZJ();
        }
    }

    @Override // X.AbstractC20085213iM
    public final void LIZ(InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        interfaceC1680500tpg.LJJIIJZLJL(420213850);
        Function2 function2 = (Function2) ((C13FE) this.LLJ).getValue();
        if (function2 == null) {
            interfaceC1680500tpg.LJJIIJZLJL(358356153);
        } else {
            interfaceC1680500tpg.LJJIIJZLJL(150107208);
            function2.invoke(interfaceC1680500tpg, 0);
        }
        interfaceC1680500tpg.LJ();
        interfaceC1680500tpg.LJ();
    }

    public ComposeView(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        this.LLJ = C20028913Yh.LJI(null);
    }
}
