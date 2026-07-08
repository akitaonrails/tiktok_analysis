package X;

import android.graphics.Typeface;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import com.lynx.tasm.behavior.shadow.text.BaseTextShadowNode;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0kIQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1313920kIQ implements InterfaceC1301080jxi {
    public final WeakReference<ShadowNode> LIZ;

    public C1313920kIQ(ShadowNode shadowNode) {
        this.LIZ = new WeakReference<>(shadowNode);
    }

    @Override // X.InterfaceC1301080jxi
    public final void LIZIZ(Typeface typeface, int i) {
        ShadowNode shadowNode = this.LIZ.get();
        if (shadowNode != null && !shadowNode.LJIILJJIL) {
            if (shadowNode instanceof BaseTextShadowNode) {
                ((BaseTextShadowNode) shadowNode).LJIJJLI.LJJIII = true;
            }
            shadowNode.LJIILLIIL();
        }
    }
}
