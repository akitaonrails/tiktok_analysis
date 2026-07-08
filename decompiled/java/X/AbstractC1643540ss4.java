package X;

import android.content.DialogInterface;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AwS391S0200000_25;

/* JADX INFO: renamed from: X.0ss4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public abstract class AbstractC1643540ss4 implements InterfaceC1630950sXl {
    public final C19EG LIZ;
    public final Scene LIZIZ;
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(67));

    public void LIZIZ(Effect effect) {
    }

    public void LIZJ(Effect effect) {
    }

    public void LJ(Effect effect) {
    }

    public void LJFF(Effect effect) {
    }

    public abstract void LJI(Effect effect);

    public final void LIZLLL(final Effect effect) {
        C1247510iZJ c1247510iZJLIZ;
        if (C545820Lau.LIZLLL(this.LIZ, this.LIZIZ)) {
            return;
        }
        C1390850mIV c1390850mIV = new C1390850mIV();
        C13DV c13dvLIZIZ = C1697820uHc.LIZIZ();
        C1247510iZJ c1247510iZJ = new C1247510iZJ();
        c1247510iZJ.LIZIZ(2131833524);
        c1247510iZJ.LIZ(new AwS391S0200000_25(this, effect, 32));
        c13dvLIZIZ.add(c1247510iZJ);
        C1247510iZJ c1247510iZJ2 = new C1247510iZJ();
        c1247510iZJ2.LIZIZ(2131833528);
        c1247510iZJ2.LIZJ = 1;
        c1247510iZJ2.LIZ(new AwS391S0200000_25(this, effect, 33));
        c13dvLIZIZ.add(c1247510iZJ2);
        InterfaceC1643560ss6 interfaceC1643560ss6 = (InterfaceC1643560ss6) this.LIZJ.getValue();
        if (interfaceC1643560ss6 != null && (c1247510iZJLIZ = interfaceC1643560ss6.LIZ()) != null) {
            c13dvLIZIZ.add(c1247510iZJLIZ);
        }
        c1390850mIV.LJI(C1697820uHc.LIZ(c13dvLIZIZ));
        c1390850mIV.LIZ.LL = new DialogInterface.OnCancelListener() { // from class: X.0ss5
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                this.LL.LIZJ(effect);
            }
        };
        c1390850mIV.LIZJ().show(C20622515mp.LJIILL(this.LIZ, this.LIZIZ), "BlockSticker");
    }

    public AbstractC1643540ss4(C19EG c19eg, Scene scene) {
        this.LIZ = c19eg;
        this.LIZIZ = scene;
    }
}
