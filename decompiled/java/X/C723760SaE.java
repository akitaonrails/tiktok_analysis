package X;

import X.InterfaceC0148002o;
import androidx.compose.ui.platform.ComposeView;
import java.util.Map;
import tiktok.compose.assem.UiComposableAssem;

/* JADX INFO: renamed from: X.0SaE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C723760SaE<T extends UiComposableAssem<S>, S extends InterfaceC0148002o> extends C0RUT<T> {
    public transient ComposeView LLIZLLLIL;
    public transient C19719912Dl LLJ;
    public transient InterfaceC724760Sbq LLJI;

    @Override // X.C0RUT
    /* JADX INFO: renamed from: LJII, reason: merged with bridge method [inline-methods] */
    public final void LIZLLL(T t, Map<AbstractC1155604fa<?>, ? extends C0RTG<?>> map) {
        super.LIZLLL(t, map);
        ComposeView composeView = this.LLIZLLLIL;
        if (composeView != null) {
            t.Ao(composeView);
            C19719912Dl c19719912Dl = this.LLJ;
            if (c19719912Dl != null) {
                t.LLIZ = c19719912Dl;
                t.LLIZLLLIL = this.LLJI;
                return;
            }
            throw new IllegalStateException("vmClass cannot be null");
        }
        throw new IllegalStateException("ComposeView cannot be null");
    }
}
