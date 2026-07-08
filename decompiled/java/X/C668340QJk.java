package X;

import Y.ACListenerS145S0100000_10;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.search.model.SearchHistory;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS196S0000000_10;

/* JADX INFO: renamed from: X.0QJk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C668340QJk extends RecyclerView.ViewHolder {
    public static final /* synthetic */ int LLJJ = 0;
    public String LL;
    public String LLILLJJLI;
    public String LLILLL;
    public boolean LLILZ;
    public final TuxIconView LLILZIL;
    public final LinearLayout LLILZLL;
    public final LinearLayout LLIZ;
    public final FrameLayout LLIZLLLIL;
    public final C01GW LLJ;
    public final C0QF6 LLJI;
    public SearchHistory LLJIJIL;
    public boolean LLJILJIL;
    public String LLJILJILJ;
    public long LLJILLL;

    /* JADX WARN: Removed duplicated region for block: B:52:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ac A[PHI: r15
      0x00ac: PHI (r15v1 java.lang.String) = (r15v0 java.lang.String), (r15v3 java.lang.String) binds: [B:53:0x00a9, B:43:0x0087] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I5() {
        /*
            r22 = this;
            com.ss.android.ugc.aweme.search.model.SearchHistory r3 = new com.ss.android.ugc.aweme.search.model.SearchHistory
            r3.<init>()
            r2 = r22
            com.ss.android.ugc.aweme.search.model.SearchHistory r1 = r2.LLJIJIL
            java.lang.String r15 = ""
            if (r1 == 0) goto L11
            java.lang.String r0 = r1.keyword
            if (r0 != 0) goto L12
        L11:
            r0 = r15
        L12:
            r3.keyword = r0
            r0 = 0
            r3.type = r0
            r4 = 0
            if (r1 == 0) goto Lb9
            java.lang.String r0 = r1.musicId
        L1c:
            r3.musicId = r0
            X.0QF6 r1 = r2.LLJI
            java.lang.String r0 = "del_his_native"
            r1.LJIIJ(r3, r0)
            com.ss.android.ugc.aweme.search.model.SearchHistory r0 = r2.LLJIJIL
            if (r0 == 0) goto Lb6
            java.lang.String r0 = r0.musicId
        L2b:
            boolean r0 = X.C123100dR.LIZ(r0)
            if (r0 == 0) goto L40
            boolean r0 = r2.LLJILJIL
            if (r0 == 0) goto L40
            boolean r0 = X.C0QPQ.LIZIZ()
            if (r0 == 0) goto L40
            X.0QF6 r0 = r2.LLJI
            r0.LJIIIZ()
        L40:
            X.0QGk r0 = new X.0QGk
            r0.<init>(r3)
            X.C1440005kM.LIZ(r0)
            java.lang.String r5 = r2.LL
            java.lang.String r6 = r2.LLILLJJLI
            java.lang.String r7 = "clear"
            com.ss.android.ugc.aweme.search.model.SearchHistory r0 = r2.LLJIJIL
            if (r0 == 0) goto L56
            java.lang.String r8 = r0.keyword
            if (r8 != 0) goto L57
        L56:
            r8 = r15
        L57:
            int r0 = r2.getLayoutPosition()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
            r10 = 0
            com.ss.android.ugc.aweme.search.model.SearchHistory r1 = r2.LLJIJIL
            if (r1 == 0) goto Lb4
            java.lang.String r0 = r1.musicId
            if (r0 == 0) goto Lb4
            java.lang.String r11 = "Sound"
        L6a:
            if (r1 == 0) goto Lb1
            java.lang.String r12 = r1.enterMethod
            long r0 = r1.timestamp
            java.lang.Long r13 = java.lang.Long.valueOf(r0)
        L74:
            com.ss.android.ugc.aweme.search.model.SearchHistory r1 = r2.LLJIJIL
            if (r1 == 0) goto L7a
            java.lang.String r4 = r1.musicId
        L7a:
            r3 = 1
            if (r4 == 0) goto Laf
            r14 = 1
        L7e:
            if (r1 == 0) goto La9
            java.lang.String r0 = r1.musicId
            if (r0 == 0) goto La9
            r15 = r0
        L85:
            boolean r0 = r1.isOriginalMusic
            if (r0 != r3) goto Lac
            java.lang.String r16 = "1"
        L8b:
            boolean r0 = r2.LLJILJIL
            if (r1 == 0) goto La6
            boolean r1 = r1.LIZIZ()
            if (r1 != 0) goto La6
            r18 = 1
        L97:
            java.lang.String r1 = r2.LLJILJILJ
            r21 = 66592(0x10420, float:9.3315E-41)
            r17 = r0
            r19 = r1
            r20 = r10
            X.C668020QIe.LIZIZ(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return
        La6:
            r18 = 0
            goto L97
        La9:
            if (r1 == 0) goto Lac
            goto L85
        Lac:
            java.lang.String r16 = "0"
            goto L8b
        Laf:
            r14 = 0
            goto L7e
        Lb1:
            r12 = r4
            r13 = r4
            goto L74
        Lb4:
            r11 = r15
            goto L6a
        Lb6:
            r0 = r4
            goto L2b
        Lb9:
            r0 = r4
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C668340QJk.I5():void");
    }

    public C668340QJk(View view) {
        super(view);
        C12ES.LJIIJ(view.getContext());
        C814420VxA.LIZIZ(C418440Gaw.LIZIZ(88));
        this.LL = "";
        this.LLILLJJLI = "";
        this.LLILLL = "";
        this.LLJ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(564));
        this.LLJI = C0QPJ.LJIJI(null);
        this.LLIZLLLIL = (FrameLayout) view.findViewById(R.id.ua4);
        ViewStub viewStub = (ViewStub) view.findViewById(R.id.vs_his_start_icon);
        if (!C0BQB.LIZ()) {
            this.LLILZIL = (TuxIconView) C786410Ut5.LJLLLL(viewStub).findViewById(R.id.uai);
        }
        ((TuxTextView) view.findViewById(R.id.zpl)).setTuxFont(C301210BrL.LIZ());
        ((TuxTextView) view.findViewById(R.id.zyb)).setTuxFont(C301210BrL.LIZ());
        this.LLILZLL = (LinearLayout) view.findViewById(R.id.nfu);
        this.LLIZ = (LinearLayout) view.findViewById(R.id.nfd);
        C786410Ut5.O7((FrameLayout) view.findViewById(R.id.fld), new View.OnClickListener() { // from class: X.0QKE
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
            }
        });
        C427690Gpr.LJ(view, 0.0f);
        C786410Ut5.a9((TuxIconView) view.findViewById(R.id.lea), new ACListenerS145S0100000_10(this, 68));
        view.addOnAttachStateChangeListener(new C0R45(this, 34));
    }
}
