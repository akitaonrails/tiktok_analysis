package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.assem.arch.core.UIAssem;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0DRp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C339230DRp extends C09AY implements Function2<UIAssem, C291001Au<? extends Boolean>, Unit> {
    public C339230DRp() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(UIAssem uIAssem, C291001Au<? extends Boolean> c291001Au) {
        FragmentManager supportFragmentManager;
        UIAssem uIAssem2 = uIAssem;
        C291001Au<? extends Boolean> c291001Au2 = c291001Au;
        Fragment fragmentLJI = C724240Sb0.LJI(uIAssem2);
        if (fragmentLJI != null && c291001Au2 != null) {
            Boolean.valueOf(((Boolean) c291001Au2.LIZ).booleanValue()).booleanValue();
            C19EG c19egLIZ = C724240Sb0.LIZ(uIAssem2);
            if (c19egLIZ != null && (supportFragmentManager = c19egLIZ.getSupportFragmentManager()) != null) {
                if (supportFragmentManager.LJJLIIIJL().size() > 1) {
                    C19EH c19ehLJIIJ = supportFragmentManager.LJIIJ();
                    c19ehLJIIJ.LJIJJ(R.anim.hb, R.anim.hg);
                    c19ehLJIIJ.LJIIZILJ(fragmentLJI);
                    c19ehLJIIJ.LJIIJ();
                } else {
                    C19EG c19egLIZ2 = C724240Sb0.LIZ(uIAssem2);
                    if (c19egLIZ2 != null) {
                        c19egLIZ2.finish();
                    }
                }
            }
        }
        return Unit.LIZ;
    }
}
