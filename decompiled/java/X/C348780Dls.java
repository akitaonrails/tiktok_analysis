package X;

import com.bytedance.ies.nle.editor_jni.NLENode;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AFwS288S0000000_5;

/* JADX INFO: renamed from: X.0Dls, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C348780Dls extends AbstractC350210DoB implements InterfaceC350250DoF {
    public final C348760Dlq LLILLJJLI = C350200DoA.LIZ(this, AFwS288S0000000_5.get$arr$(11));

    @Override // X.InterfaceC350250DoF
    public final void LJFF(C348820Dlw c348820Dlw) {
        Iterator it2 = ((ArrayList) this.LLILLJJLI.LIZIZ).iterator();
        while (it2.hasNext()) {
            ((NLENode) it2.next()).setEnable(true);
        }
    }
}
