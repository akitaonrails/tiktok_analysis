package X;

import android.view.View;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.AwS600S0100000_21;

/* JADX INFO: renamed from: X.0lXI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1361580lXI extends AbstractC2211791BhR implements InterfaceC1368380liG {
    public WeakReference<IMContact> LJ;
    public Function0<Unit> LJFF;
    public String LJI;
    public Function0<String> LJII = new AwS565S0100000_21(this, 613);
    public final C1402200mao LJIIIIZZ = new C1402200mao(this, 2);

    @Override // X.AbstractC2211791BhR
    public final int LIZJ() {
        return DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL;
    }

    @Override // X.AbstractC2211791BhR
    public final Function1<View, Boolean> LJIIJJI() {
        return new AwS600S0100000_21(this, 138);
    }

    @Override // X.AbstractC2211791BhR
    public final Function0<String> LIZLLL() {
        return this.LJII;
    }

    @Override // X.AbstractC2211791BhR
    public final InterfaceC2211931Bhf LJFF() {
        return this.LJIIIIZZ;
    }

    @Override // X.AbstractC2211791BhR
    public final EnumC2211841BhW LJIIJ() {
        return EnumC2211841BhW.CUSTOMIZE;
    }

    @Override // X.AbstractC2211791BhR
    public final void LJIILL(Function0<String> function0) {
        this.LJII = function0;
    }

    @Override // X.InterfaceC1368380liG
    public final void LIZ(IMContact iMContact, String str, Function0<Unit> function0) {
        this.LJ = new WeakReference<>(iMContact);
        this.LJFF = function0;
        this.LJI = str;
    }
}
