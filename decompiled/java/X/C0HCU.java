package X;

import android.content.Context;
import android.view.View;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.zhiliaoapp.musically.R;
import java.util.Collection;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0HCU, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HCU extends AbstractC21434518uV {
    public final View LIZ;

    @Override // X.AbstractC21434218uS
    public final Collection<String> LIZJ() {
        return C1697810uHb.LJIILJJIL("src-desc");
    }

    public C0HCU(View view) {
        this.LIZ = view;
    }

    @Override // X.AbstractC21434518uV
    public final Object LJ(C21432118u7 c21432118u7, C14S7 c14s7, InterfaceC21435018ua interfaceC21435018ua) {
        List listLJJLIIIJILLIZJL;
        int iIntValue;
        Context context = this.LIZ.getContext();
        String str = interfaceC21435018ua.LIZLLL().get("sup");
        if (str == null || (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{","}, 0, 6)) == null) {
            listLJJLIIIJILLIZJL = C13BV.INSTANCE;
        }
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1n, this.LIZ.getContext());
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_chevron_right_ltr;
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1n);
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(this.LIZ.getContext());
        tuxIconDrawableLIZ.setBounds(0, 0, tuxIconDrawableLIZ.LIZJ(), tuxIconDrawableLIZ.LIZIZ());
        return new C417180GXk(context, listLJJLIIIJILLIZJL, iIntValue, tuxIconDrawableLIZ);
    }
}
