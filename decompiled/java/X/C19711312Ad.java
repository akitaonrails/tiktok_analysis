package X;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.shortvideo.model.TemplateSlot;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.12Ad, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19711312Ad {
    public final /* synthetic */ C19712012Ak LIZ;

    public C19711312Ad(C19712012Ak c19712012Ak) {
        this.LIZ = c19712012Ak;
    }

    public final void LIZ(int i) {
        Integer numLIZIZ = C534180KxE.LIZIZ(this.LIZ.LIZIZ, i);
        if (numLIZIZ != null) {
            int iIntValue = numLIZIZ.intValue();
            if (i != iIntValue) {
                ((RecyclerView) this.LIZ.LIZ.findViewById(R.id.vkt)).smoothScrollToPosition(iIntValue);
            }
            Integer value = this.LIZ.LIZIZ.LJIILIIL.getValue();
            if (value != null && value.intValue() == iIntValue) {
                return;
            }
            this.LIZ.LIZIZ.LJII(iIntValue);
            C580710Mq5 c580710Mq5 = this.LIZ.LIZIZ;
            if (((ArrayList) c580710Mq5.LJIIIZ).size() != C534180KxE.LIZ(c580710Mq5).size()) {
                InterfaceC19711512Af interfaceC19711512Af = (InterfaceC19711512Af) this.LIZ.LIZIZ.LJFF(InterfaceC19711512Af.class);
                if (interfaceC19711512Af != null) {
                    C580710Mq5 c580710Mq52 = this.LIZ.LIZIZ;
                    interfaceC19711512Af.WA0(((double) iIntValue) * ((c580710Mq52.LJIJJ * ((double) 1.0f)) / ((double) C534180KxE.LIZ(c580710Mq52).size())));
                    return;
                }
                return;
            }
            InterfaceC19711512Af interfaceC19711512Af2 = (InterfaceC19711512Af) this.LIZ.LIZIZ.LJFF(InterfaceC19711512Af.class);
            if (interfaceC19711512Af2 == null) {
                return;
            }
            interfaceC19711512Af2.WA0(((TemplateSlot) ListProtector.get(C534180KxE.LIZ(this.LIZ.LIZIZ), iIntValue)).getSlotStartTime());
        }
    }
}
