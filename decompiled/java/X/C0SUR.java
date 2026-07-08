package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: renamed from: X.0SUR, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SUR extends RelativeLayout implements InterfaceC1594350raj {
    public final Set<C0SUS> LL;

    @Override // X.InterfaceC1594350raj
    public final void LIZ(C0SUS c0sus) {
        this.LL.remove(c0sus);
    }

    @Override // X.InterfaceC1594350raj
    public final void LIZIZ(C0SUS c0sus) {
        this.LL.add(c0sus);
    }

    @Override // android.view.View
    public final boolean onSetAlpha(int i) {
        Iterator<C0SUS> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            it2.next().LIZIZ(i / 255.0f);
        }
        return super.onSetAlpha(i);
    }

    @Override // android.view.View
    public void setAlpha(float f) {
        super.setAlpha(f);
        Iterator<C0SUS> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            it2.next().LIZIZ(f);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        Iterator<C0SUS> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ(i);
        }
    }

    public C0SUR(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LL = new LinkedHashSet();
    }
}
