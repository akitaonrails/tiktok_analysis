package X;

import android.graphics.drawable.Animatable;
import android.widget.ImageView;
import com.facebook.fresco.animation.drawable.AnimatedDrawable2;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0g5E, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1151980g5E extends C1320700kTM {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.C1320700kTM, X.InterfaceC1320650kTH
    public final void LIZLLL(String str, Throwable th) {
        if (this.$t != 0) {
            super.LIZLLL(str, th);
        } else {
            LIZLLL$0(this, str, th);
        }
    }

    @Override // X.C1320700kTM, X.InterfaceC1320650kTH
    public final void LJ(String str, Object obj, Animatable animatable) {
        switch (this.$t) {
            case 0:
                LJ$0(this, str, obj, animatable);
                break;
            case 1:
                LJ$1(this, str, obj, animatable);
                break;
            default:
                super.LJ(str, obj, animatable);
                break;
        }
    }

    public C1151980g5E(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj;
    }

    public static final void LIZLLL$0(C1151980g5E c1151980g5E, String str, Throwable th) {
        C20441214yg.LJFF("LiveFlyMicGiftHelper", "load image failed，", th);
        ((Function2) c1151980g5E.l1).invoke(str, th);
    }

    public static final void LJ$0(C1151980g5E c1151980g5E, String str, Object obj, Animatable animatable) {
        if (!(animatable instanceof AnimatedDrawable2)) {
            C20441214yg.LJ("LiveFlyMicGiftHelper", "animatable is not AnimatedDrawable2, so return");
            return;
        }
        AnimatedDrawable2 animatedDrawable2 = (AnimatedDrawable2) animatable;
        animatedDrawable2.LL = 1;
        animatedDrawable2.LLILLJJLI = true;
        animatedDrawable2.LJI(new C946370ajb(animatedDrawable2.LLILLL, 1));
        ((InterfaceC1631620sYq) c1151980g5E.l0).invoke(str, obj, animatable);
    }

    public static final void LJ$1(C1151980g5E c1151980g5E, String str, Object obj, Animatable animatable) {
        ImageView imageView = ((C1120950fHB) c1151980g5E.l0).LLILZ;
        if (imageView != null) {
            C500260Jjc.LJLJLJ(imageView, false);
        }
        AnimatedDrawable2 animatedDrawable2 = (AnimatedDrawable2) animatable;
        final int iLIZJ = animatedDrawable2.LIZJ();
        final C1120950fHB c1120950fHB = (C1120950fHB) c1151980g5E.l0;
        final EnumC1120990fHF enumC1120990fHF = (EnumC1120990fHF) c1151980g5E.l1;
        animatedDrawable2.LJII(new C0I9J() { // from class: X.0fHU
            public int LIZ;

            @Override // X.C0I9J, X.InterfaceC1331000kjy
            public final void LIZJ(AnimatedDrawable2 animatedDrawable22) {
            }

            @Override // X.C0I9J, X.InterfaceC1331000kjy
            public final void LIZ(AnimatedDrawable2 animatedDrawable22) {
                this.LIZ = -1;
                C1128760fTm c1128760fTm = C1128760fTm.LJIIJ;
                String value = enumC1120990fHF.getValue();
                c1128760fTm.getClass();
                C1128760fTm.LJJIIJZLJL(value);
            }

            @Override // X.C0I9J, X.InterfaceC1331000kjy
            public final void LIZLLL(AnimatedDrawable2 animatedDrawable22, int i) {
                int i2 = this.LIZ;
                if ((i2 != 0 || iLIZJ > 1) && i2 <= i) {
                    this.LIZ = i;
                    return;
                }
                animatedDrawable22.stop();
                ImageView imageView2 = c1120950fHB.LLILZ;
                if (imageView2 != null) {
                    C500260Jjc.LJLJLJ(imageView2, true);
                }
                C1324720kZq c1324720kZq = c1120950fHB.LLILZIL;
                if (c1324720kZq == null) {
                    return;
                }
                C500260Jjc.LJLJLJ(c1324720kZq, false);
            }
        });
    }
}
