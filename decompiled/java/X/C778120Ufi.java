package X;

import Y.AfS181S0100000_12;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.livesetting.broadcast.GameFloatTipsOptimize;
import kotlin.jvm.internal.AFwS199S0000000_12;

/* JADX INFO: renamed from: X.0Ufi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C778120Ufi implements InterfaceC777850UfH {
    public final Fragment LL;
    public final InterfaceC778270Ufx LLILLJJLI;
    public final Context LLILLL;
    public DialogC778400UgA LLILZ;
    public boolean LLILZIL;
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(376));
    public C11JF LLILZLL = (C11JF) C784440Upu.LIZ().LJ(C775150Uav.class).LJJLJLI(new AfS181S0100000_12(this, 226));
    public C11JF LLIZ = (C11JF) C784440Upu.LIZ().LJ(C775160Uaw.class).LJJLJLI(new AfS181S0100000_12(this, 227));

    @Override // X.InterfaceC777850UfH
    public final void LJI(AbstractC777950UfR abstractC777950UfR) {
    }

    public final InterfaceC777420Uea LIZ() {
        return this.LLILLJJLI.LIZIZ();
    }

    public final void LIZIZ() {
        DialogC778400UgA dialogC778400UgA;
        DialogC778400UgA dialogC778400UgA2 = this.LLILZ;
        if (dialogC778400UgA2 != null && dialogC778400UgA2.isShowing() && (dialogC778400UgA = this.LLILZ) != null) {
            dialogC778400UgA.dismiss();
            C785410UrT.LIZ(dialogC778400UgA);
        }
        LIZ().UO0(7);
    }

    public C778120Ufi(Fragment fragment, InterfaceC778270Ufx interfaceC778270Ufx) {
        this.LL = fragment;
        this.LLILLJJLI = interfaceC778270Ufx;
        this.LLILLL = fragment.requireContext();
        if (GameFloatTipsOptimize.INSTANCE.isExperimentGroup()) {
            C777840UfG.LIZ(EnumC777480Ueg.VOLUME, this);
        }
    }

    public final void LIZJ(String str, boolean z) {
        if (GameFloatTipsOptimize.INSTANCE.isExperimentGroup()) {
            if (z) {
                C777840UfG.LJII(new AbstractC777950UfR() { // from class: X.0Ug8
                    public final EnumC777930UfP LJ = EnumC777930UfP.PRIORITY_TYPE_P2;
                    public final EnumC777480Ueg LJFF = EnumC777480Ueg.VOLUME;
                    public final CharSequence LJI = C497740JfY.LJIJI(2131844023);

                    {
                        this.LIZIZ = new AbstractC777790UfB() { // from class: X.0UgQ
                            public final EnumC777770Uf9 LIZ = EnumC777770Uf9.CLOSE;

                            @Override // X.AbstractC777790UfB
                            public final EnumC777770Uf9 LIZ() {
                                return this.LIZ;
                            }
                        };
                    }

                    @Override // X.AbstractC777950UfR
                    public final EnumC777930UfP LIZJ() {
                        return this.LJ;
                    }

                    @Override // X.AbstractC777950UfR
                    public final CharSequence LIZLLL() {
                        return this.LJI;
                    }

                    @Override // X.AbstractC777950UfR
                    public final EnumC777480Ueg LJ() {
                        return this.LJFF;
                    }
                });
                return;
            } else {
                C777840UfG.LIZIZ(EnumC777480Ueg.HEADPHONE);
                return;
            }
        }
        this.LLILLJJLI.LJIIIZ(EnumC778100Ufg.LIVE_TIP_MESSAGE_VOLUME.ordinal(), null, str, null, z);
    }

    @Override // X.InterfaceC777850UfH
    public final void LJII(AbstractC777950UfR abstractC777950UfR, EnumC778130Ufj enumC778130Ufj) {
        LIZIZ();
    }
}
