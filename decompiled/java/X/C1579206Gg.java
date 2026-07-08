package X;

import Y.ACListenerS137S0100000_2;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.im.avatarloader.api.IMAvatarLoaderApi;
import com.ss.android.ugc.aweme.im.streak.api.StreakData;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06Gg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.view.panel.StreakStatusPanel$initView$1$1", f = "StreakStatusPanel.kt", l = {}, m = "invokeSuspend")
public final class C1579206Gg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ View LL;
    public final /* synthetic */ C066V LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ C0Y8T LLILZ;
    public final /* synthetic */ StreakData LLILZIL;
    public final /* synthetic */ TuxSheet LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1579206Gg(View view, C066V c066v, Context context, C0Y8T c0y8t, StreakData streakData, TuxSheet tuxSheet, InterfaceC1364105Vn<? super C1579206Gg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = view;
        this.LLILLJJLI = c066v;
        this.LLILLL = context;
        this.LLILZ = c0y8t;
        this.LLILZIL = streakData;
        this.LLILZLL = tuxSheet;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1579206Gg(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int iIntValue;
        boolean z;
        int i;
        String str;
        EnumC1578706Gb enumC1578706Gb;
        boolean z2;
        String icon;
        C0Y8Y coreInfo;
        C1C7U.LIZ("StreakStatusPanel@541a.initView$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C427870Gq9 c427870Gq9 = (C427870Gq9) this.LL.findViewById(R.id.bik);
        C427870Gq9 c427870Gq92 = (C427870Gq9) this.LL.findViewById(R.id.bhm);
        C066V c066v = this.LLILLJJLI;
        Context context = this.LLILLL;
        C0Y8T c0y8t = this.LLILZ;
        c066v.getClass();
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5));
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5));
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.c3, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        EnumC1579606Gk enumC1579606GkLJIIIIZZ = null;
        C0ZKF c0zkf = new C0ZKF(0, 0, iLIZIZ, iLIZIZ2, iIntValue, (C0ZK1) null, 99);
        if (C1567806Bw.LIZJ(c066v.LIZ) != C06G4.USER) {
            C786410Ut5.Sc(c427870Gq9, 0.0f);
            C786410Ut5.LLLLJI(c427870Gq92, 8);
            IMAvatarLoaderApi.LIZ.getClass();
            C0ZKG c0zkgLIZJ = C04TK.LIZIZ.LIZJ(c427870Gq9, "StreakStatusPanel");
            String str2 = c066v.LIZ;
            if (c0y8t != null && (coreInfo = c0y8t.getCoreInfo()) != null) {
                icon = coreInfo.getIcon();
            } else {
                icon = null;
            }
            c0zkgLIZJ.LIZLLL(str2, icon, null, c0zkf);
        } else {
            String strValueOf = String.valueOf(C0YNP.LJII(c066v.LIZ));
            String curUserId = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId();
            if (curUserId == null) {
                curUserId = "";
            }
            IMAvatarLoaderApi.LIZ.getClass();
            IMAvatarLoaderApi iMAvatarLoaderApi = C04TK.LIZIZ;
            iMAvatarLoaderApi.LIZJ(c427870Gq9, "StreakStatusPanel").LIZIZ(curUserId, null, c0zkf);
            iMAvatarLoaderApi.LIZJ(c427870Gq92, "StreakStatusPanel").LIZIZ(strValueOf, null, c0zkf);
        }
        StreakData streakData = this.LLILZIL;
        if (streakData != null) {
            enumC1579606GkLJIIIIZZ = C1567806Bw.LJIIIIZZ(streakData, false);
        }
        EnumC1579606Gk enumC1579606Gk = EnumC1579606Gk.ACTIVE;
        EnumC1579606Gk enumC1579606Gk2 = EnumC1579606Gk.SECONDARY_ACTIVE;
        if (C13LQ.LJJIJIIJI(enumC1579606GkLJIIIIZZ, new EnumC1579606Gk[]{enumC1579606Gk, enumC1579606Gk2}) >= 0) {
            z = true;
        } else {
            z = false;
        }
        boolean z3 = !z;
        StreakData streakData2 = this.LLILZIL;
        if (streakData2 != null) {
            i = streakData2.streak;
        } else {
            i = 0;
        }
        if (streakData2 != null && !z3) {
            C066V c066v2 = this.LLILLJJLI;
            Context context2 = this.LLILLL;
            View view = this.LL;
            c066v2.getClass();
            TextView textView = (TextView) view.findViewById(R.id.title);
            TextView textView2 = (TextView) view.findViewById(R.id.fo8);
            TextView textView3 = (TextView) view.findViewById(R.id.fmk);
            int i2 = streakData2.streak;
            EnumC1579606Gk enumC1579606GkLJIIIIZZ2 = C1567806Bw.LJIIIIZZ(streakData2, false);
            String quantityString = context2.getResources().getQuantityString(2131755257, i2, "{s_fireIcon}");
            if (enumC1579606GkLJIIIIZZ2 == enumC1579606Gk) {
                enumC1578706Gb = EnumC1578706Gb.ORANGE;
            } else {
                enumC1578706Gb = EnumC1578706Gb.GREY;
            }
            textView.setText(C1579306Gh.LIZ(quantityString, enumC1578706Gb, 0, i2, C06IE.LARGE));
            textView2.setText(context2.getResources().getString(2131832133));
            textView3.setText(C1579306Gh.LIZ(C1579306Gh.LIZJ(context2.getResources().getString(2131832134, "{s_fireIcon}")), EnumC1578706Gb.GREY, 0, 0, C06IE.NORMAL));
            C06FF c06ff = C06FF.LL;
            String str3 = this.LLILLJJLI.LIZ;
            StreakData streakData3 = this.LLILZIL;
            if (enumC1579606GkLJIIIIZZ == enumC1579606Gk2) {
                z2 = true;
            } else {
                z2 = false;
            }
            C06FF.LIZLLL(c06ff, str3, streakData3, z2, C06H2.STREAK_PANEL, true);
            str = "unlock";
        } else {
            C066V c066v3 = this.LLILLJJLI;
            Context context3 = this.LLILLL;
            View view2 = this.LL;
            c066v3.getClass();
            TextView textView4 = (TextView) view2.findViewById(R.id.title);
            TuxTextView tuxTextView = (TuxTextView) view2.findViewById(R.id.fo8);
            TuxTextView tuxTextView2 = (TuxTextView) view2.findViewById(R.id.fo9);
            TuxTextView tuxTextView3 = (TuxTextView) view2.findViewById(R.id.fmn);
            TextView textView5 = (TextView) view2.findViewById(R.id.fmk);
            if (tuxTextView != null) {
                C786410Ut5.LLLLZLL(tuxTextView, 8);
            }
            if (tuxTextView2 != null) {
                C786410Ut5.LLLLZLL(tuxTextView2, 8);
            }
            if (tuxTextView3 != null) {
                C786410Ut5.LLLLZLL(tuxTextView3, 8);
            }
            if (textView5 != null) {
                textView5.setGravity(1);
            }
            String string = context3.getResources().getString(2131832094);
            String string2 = context3.getResources().getString(2131832123);
            if (textView4 != null) {
                textView4.setText(string);
            }
            if (textView5 != null) {
                textView5.setText(string2);
            }
            str = "expire";
        }
        C06FF c06ff2 = C06FF.LL;
        C066V c066v4 = this.LLILLJJLI;
        C06FF.LIZIZ(c06ff2, c066v4.LIZ, i, z3, str, c066v4.LIZIZ);
        C786410Ut5.I7(new ACListenerS137S0100000_2(this.LLILZLL, 7), this.LL.findViewById(R.id.e1v));
        C786410Ut5.I7(new ACListenerS137S0100000_2(this.LLILZLL, 8), this.LL.findViewById(R.id.d6g));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StreakStatusPanel@541a.initView$1$1");
        return unit;
    }
}
