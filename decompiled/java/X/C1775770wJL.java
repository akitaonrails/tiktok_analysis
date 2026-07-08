package X;

import android.view.View;
import com.ss.android.ugc.aweme.prop.mobileefffect.EffectEditAssem;
import com.ss.android.ugc.aweme.prop.mobileefffect.edit.EffectEditV2Assem;
import kotlin.jvm.internal.AwS392S0200000_26;

/* JADX INFO: renamed from: X.0wJL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public class C1775770wJL extends C19IN {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.C19IN
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                break;
            case 1:
                LIZ$1(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    public static final void LIZ$0(C1775770wJL c1775770wJL, View view) {
        int i = C1735720vGk.LIZ[((EffectEditAssem) c1775770wJL.l0).ip().mode.ordinal()];
        if (i != 1) {
            if (i == 2) {
                C201955140j.LJIILL(C830690WiJ.LIZIZ, "AmeEffectPublisher", "EffectEditAssem handleSubmit");
                ((EffectEditAssem) c1775770wJL.l0).up().GQ2(C0XF1.LIZLLL((C19EG) c1775770wJL.l1));
                return;
            }
            throw new C1954807lC();
        }
        C19EG c19eg = (C19EG) c1775770wJL.l1;
        C1397580mTM c1397580mTM = new C1397580mTM(c19eg);
        c1397580mTM.LJI(c19eg.getString(2131833778));
        c1397580mTM.LIZ(2131833777);
        C985403tE.LIZ(c1397580mTM, new AwS392S0200000_26((EffectEditAssem) c1775770wJL.l0, (C19EG) c1775770wJL.l1, 67));
        new C1397510mTF(c1397580mTM).LJ();
    }

    public static final void LIZ$1(C1775770wJL c1775770wJL, View view) {
        C19EG c19eg = (C19EG) c1775770wJL.l0;
        C1397580mTM c1397580mTM = new C1397580mTM(c19eg);
        c1397580mTM.LJI(c19eg.getString(2131833778));
        c1397580mTM.LIZ(2131833777);
        C985403tE.LIZ(c1397580mTM, new AwS392S0200000_26((EffectEditV2Assem) c1775770wJL.l1, (C19EG) c1775770wJL.l0, 69));
        new C1397510mTF(c1397580mTM).LJ();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1775770wJL(Object obj, Object obj2, int i) {
        super(800, true);
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
