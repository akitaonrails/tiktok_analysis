package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.Map;

/* JADX INFO: renamed from: X.0wDh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public abstract class AbstractC1772270wDh extends FrameLayout {
    public InterfaceC1773310wFN LL;

    public abstract C1774640wHW LIZ(String str, String str2, String str3);

    public abstract void LIZIZ(AbstractC1772340wDo abstractC1772340wDo);

    public abstract void LIZJ(AbstractC1772290wDj abstractC1772290wDj);

    public abstract void LIZLLL(String str, String str2, Map map, C1772490wE3 c1772490wE3);

    public abstract void LJ(int i, String str, String str2, Map<String, ? extends Object> map, String str3, boolean z, InterfaceC1772480wE2 interfaceC1772480wE2);

    public abstract View getBodyImage();

    public abstract C18Z6 getBodyList();

    public abstract ViewGroup getBodyView();

    public abstract View getContainerImage();

    public abstract View getHeaderImage();

    public abstract C1773630wFt getHeaderView();

    public abstract int getLayoutId();

    public final InterfaceC1773310wFN getController() {
        return this.LL;
    }

    public final void setController(InterfaceC1773310wFN interfaceC1773310wFN) {
        this.LL = interfaceC1773310wFN;
    }

    public AbstractC1772270wDh(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AbstractC1772270wDh(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C786410Ut5.LJLLJ(context, getLayoutId(), this);
    }
}
