package X;

import Y.ACListenerS155S0100000_21;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0lC3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1348410lC3 {
    public C0P0T LIZ;
    public String LIZIZ = "";
    public boolean LIZJ;
    public boolean LIZLLL;

    public final void LIZIZ(View view) {
        View viewFindViewById;
        if (view != null && (viewFindViewById = view.findViewById(R.id.aev)) != null && !this.LIZLLL && viewFindViewById.isEnabled()) {
            C1350920lG6.LJJJLIIL(null, "check_box", C294390BgL.LIZIZ());
            this.LIZLLL = true;
        }
    }

    public static void LIZJ(View view, boolean z) {
        C0HZQ c0hzq;
        TuxTextView tuxTextView;
        float f;
        if (view == null || (c0hzq = (C0HZQ) view.findViewById(R.id.aev)) == null || (tuxTextView = (TuxTextView) view.findViewById(R.id.dq5)) == null) {
            return;
        }
        c0hzq.setEnabled(z);
        if (z) {
            f = 1.0f;
        } else {
            f = 0.34f;
        }
        C786410Ut5.B5(tuxTextView, f);
        if (c0hzq.isChecked() && !z) {
            c0hzq.performClick();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(android.view.View r6, java.lang.String r7, X.InterfaceC1348430lC5 r8) {
        /*
            r5 = this;
            if (r6 != 0) goto L3
            return
        L3:
            r0 = 2131362542(0x7f0a02ee, float:1.8344868E38)
            android.view.View r2 = r6.findViewById(r0)
            X.0HZQ r2 = (X.C0HZQ) r2
            if (r2 != 0) goto Lf
            return
        Lf:
            r0 = 2131367064(0x7f0a1498, float:1.835404E38)
            android.view.View r4 = r6.findViewById(r0)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r3 = 0
            r2.setSize(r3)
            if (r4 == 0) goto L34
            boolean r0 = X.C294390BgL.LIZ()
            if (r0 == 0) goto L59
            android.content.Context r1 = r6.getContext()
            if (r1 == 0) goto L67
            r0 = 2131824815(0x7f1110af, float:1.9282469E38)
            java.lang.String r0 = r1.getString(r0)
        L31:
            r4.setText(r0)
        L34:
            Y.ACListenerS124S0200000_21 r1 = new Y.ACListenerS124S0200000_21
            r0 = 12
            r1.<init>(r2, r5, r0)
            X.C786410Ut5.I7(r1, r6)
            X.0maU r1 = new X.0maU
            r0 = 1
            r1.<init>(r5, r8, r2, r0)
            X.C786410Ut5.D7(r2, r1)
            java.lang.String r0 = r5.LIZIZ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r7, r0)
            if (r0 != 0) goto L53
            r5.LIZJ = r3
            r5.LIZIZ = r7
        L53:
            boolean r0 = r5.LIZJ
            r2.setChecked(r0)
            return
        L59:
            android.content.Context r1 = r6.getContext()
            if (r1 == 0) goto L67
            r0 = 2131824794(0x7f11109a, float:1.9282426E38)
            java.lang.String r0 = r1.getString(r0)
            goto L31
        L67:
            r0 = 0
            goto L31
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1348410lC3.LIZ(android.view.View, java.lang.String, X.0lC5):void");
    }

    public final C0P0T LIZLLL(View view, C1353500lKG c1353500lKG, Aweme aweme) {
        int i;
        User curUser;
        C0P0T c0p0tLIZIZ = null;
        if (!C1341590l13.LIZIZ() || !C1346390l8n.LIZLLL(aweme)) {
            return null;
        }
        IAccountUserService iAccountUserServiceLJFF = C0XQ7.LJFF();
        if (iAccountUserServiceLJFF != null && (curUser = ((AbstractC848400XPy) iAccountUserServiceLJFF).getCurUser()) != null && curUser.getAccountType() == 3) {
            return null;
        }
        if (c1353500lKG != null && TextUtils.isEmpty(C2204961BRm.LLJILLL(c1353500lKG, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLL0iZaIbzJZzQyw/u1jXjLslvWOE3BNFxoi6gLMXz3RE4klub9dUFkIjQ=", null)))) {
            String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("key_comment_input_also_comment_post_checkbox_first_show_");
            sbLIZ.append(curUserId);
            if (C0TSK.LIZIZ(C2188811AlT.LIZIZ(sbLIZ))) {
                return this.LIZ;
            }
            Context context = c1353500lKG.getContext();
            if (context == null) {
                return this.LIZ;
            }
            if (C294390BgL.LIZ()) {
                i = 2131824816;
            } else {
                i = 2131824803;
            }
            if (view != null) {
                C450720Hlu c450720Hlu = new C450720Hlu(context);
                View viewFindViewById = view.findViewById(R.id.dq5);
                if (viewFindViewById != null) {
                    view = viewFindViewById;
                }
                C1391600mJi c1391600mJi = c450720Hlu.LLILLJJLI;
                c1391600mJi.LIZIZ = view;
                c1391600mJi.LIZLLL = EnumC1235690iGF.TOP;
                c450720Hlu.LJIIJ(i);
                c450720Hlu.LLILLJJLI.LJJIFFI = new InterfaceC1391650mJn() { // from class: X.0lC4
                    @Override // X.InterfaceC1391650mJn
                    public final void onShow() {
                        this.LIZ.getClass();
                        String curUserId2 = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("key_comment_input_also_comment_post_checkbox_first_show_");
                        sbLIZ2.append(curUserId2);
                        C0TSK.LJFF(C2188811AlT.LIZIZ(sbLIZ2), Boolean.TRUE);
                    }
                };
                c450720Hlu.LJIIIZ(true, new ACListenerS155S0100000_21(this, 183));
                c450720Hlu.LLILLJJLI.LJIJJ = false;
                c0p0tLIZIZ = c450720Hlu.LIZIZ();
            }
            this.LIZ = c0p0tLIZIZ;
            if (c0p0tLIZIZ != null) {
                c0p0tLIZIZ.show();
            }
            return this.LIZ;
        }
        return this.LIZ;
    }
}
