package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.poplayer.core.PopupManager;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS403S0200000_2;
import kotlin.jvm.internal.AwS581S0100000_2;
import njp.a;

/* JADX INFO: renamed from: X.06I9, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.pet.flow.StreakInviteDialogUtil$popupStreakInviteDialog$1", f = "StreakInviteDialogUtil.kt", l = {}, m = "invokeSuspend")
public final class C06I9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C19EG LL;
    public final /* synthetic */ AbstractC1569806Cq LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06I9(C19EG c19eg, AbstractC1569806Cq abstractC1569806Cq, InterfaceC1364105Vn<? super C06I9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c19eg;
        this.LLILLJJLI = abstractC1569806Cq;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C06I9(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C1397510mTF c1397510mTF;
        C1C7U.LIZ("StreakInviteDialogUtil@f02.popupStreakInviteDialog$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1569406Cm c1569406Cm = C1569406Cm.LIZIZ;
        C19EG c19eg = this.LL;
        AbstractC1569806Cq abstractC1569806Cq = this.LLILLJJLI;
        c1569406Cm.getClass();
        if (abstractC1569806Cq instanceof C1569606Co) {
            final Context baseContext = c19eg.getBaseContext();
            ConstraintLayout constraintLayout = new ConstraintLayout(baseContext) { // from class: X.06IA
            };
            C786410Ut5.Sd(R.layout.cpz, C786410Ut5.ne(constraintLayout.getContext()), constraintLayout);
            C1397580mTM c1397580mTM = new C1397580mTM(c19eg);
            C340180DVg.LIZ(c1397580mTM, constraintLayout, 0, 6);
            c1397580mTM.LJI(abstractC1569806Cq.LIZ());
            c1397580mTM.LIZIZ(abstractC1569806Cq.LIZIZ);
            C1238130iKB.LIZ(c1397580mTM, new AwS581S0100000_2(abstractC1569806Cq, 472));
            c1397580mTM.LIZLLL(AFwS229S0000000_2.get$arr$(681));
            c1397510mTF = new C1397510mTF(c1397580mTM);
        } else if (abstractC1569806Cq instanceof C1569506Cn) {
            C1569506Cn c1569506Cn = (C1569506Cn) abstractC1569806Cq;
            if (c1569506Cn.LJI.length() != 0 && (str = c1569506Cn.LJIIIIZZ) != null && str.length() != 0 && c1569506Cn.LJ.length() != 0) {
                final Context baseContext2 = c19eg.getBaseContext();
                ConstraintLayout constraintLayout2 = new ConstraintLayout(baseContext2) { // from class: X.06IB
                };
                String str2 = c1569506Cn.LJIIIIZZ;
                String str3 = c1569506Cn.LJIIIZ;
                if (str3 == null) {
                    str3 = "";
                }
                View viewSd = C786410Ut5.Sd(R.layout.cq0, C786410Ut5.ne(constraintLayout2.getContext()), constraintLayout2);
                ImageView imageView = (ImageView) viewSd.findViewById(R.id.wa7);
                ImageView imageView2 = (ImageView) viewSd.findViewById(R.id.wa8);
                C1331750klB c1331750klB = new C1331750klB();
                c1331750klB.LIZ = true;
                C0I0B.LJFF.LIZJ();
                c1331750klB.LIZIZ = C12ES.LIZJ(0.5f, C894660Z7w.LIZ());
                c1331750klB.LJ = C418440Gaw.LIZIZ(4);
                C1331730kl9 c1331730kl9 = new C1331730kl9(c1331750klB);
                C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str2);
                EnumC1338240kve enumC1338240kve = EnumC1338240kve.FIT_CENTER;
                c1331670kl3LJIIIZ.LJJ = enumC1338240kve;
                c1331670kl3LJIIIZ.LJJI(imageView);
                c1331670kl3LJIIIZ.LJJI = c1331730kl9;
                C786410Ut5.h3(c1331670kl3LJIIIZ);
                C1331670kl3 c1331670kl3LJIIIZ2 = C1331660kl2.LJIIIZ(str3);
                c1331670kl3LJIIIZ2.LJJ = enumC1338240kve;
                c1331670kl3LJIIIZ2.LJJI(imageView2);
                C786410Ut5.h3(c1331670kl3LJIIIZ2);
                C1397580mTM c1397580mTM2 = new C1397580mTM(c19eg);
                C340180DVg.LIZ(c1397580mTM2, constraintLayout2, 0, 6);
                c1397580mTM2.LJI(c1569506Cn.LJ);
                c1397580mTM2.LIZIZ(abstractC1569806Cq.LIZIZ);
                C1238130iKB.LIZ(c1397580mTM2, new AwS581S0100000_2(abstractC1569806Cq, 473));
                c1397580mTM2.LJII = true;
                c1397580mTM2.LJ(new AwS581S0100000_2(abstractC1569806Cq, 474));
                c1397580mTM2.LJIIIIZZ = true;
                c1397580mTM2.LIZLLL(AFwS229S0000000_2.get$arr$(682));
                c1397510mTF = new C1397510mTF(c1397580mTM2);
            } else {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("StreakInviteDialogUtil@f02.popupStreakInviteDialog$1");
                return unit;
            }
        } else {
            throw new C1954807lC();
        }
        final C19EG c19eg2 = this.LL;
        final AwS403S0200000_2 awS403S0200000_2 = new AwS403S0200000_2(this.LLILLJJLI, c1397510mTF, 62);
        PopupManager.LJIIZILJ(new C10GR(c19eg2, awS403S0200000_2) { // from class: X.0Deq
            public final C19EG LL;
            public final Function0<Unit> LLILLJJLI;
            public final int LLILLL = 3;

            @Override // X.InterfaceC20660415sw
            public final C688120Qyw i2() {
                C19EG c19eg3 = this.LL;
                return new C688120Qyw(c19eg3, c19eg3, null);
            }

            @Override // X.InterfaceC20660515sx
            public final int getPriority() {
                return this.LLILLL;
            }

            {
                this.LL = c19eg2;
                this.LLILLJJLI = awS403S0200000_2;
            }

            @Override // X.InterfaceC20659015si
            public final void LJFF(C688120Qyw c688120Qyw, C20656615sK c20656615sK) {
                this.LLILLJJLI.invoke();
            }
        }, new C06IC("im_streak_invite_dialog_flow"));
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("StreakInviteDialogUtil@f02.popupStreakInviteDialog$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
