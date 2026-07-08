package X;

import Y.ACListenerS158S0100000_24;
import android.graphics.Bitmap;
import android.view.View;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS213S0000000_24;

/* JADX INFO: renamed from: X.0sGV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1620250sGV extends AbstractC1260080ita {
    public static final C01GW<Boolean> LLJILJILJ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(486));
    public static final C01GW<Boolean> LLJILLL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(487));
    public InterfaceC1260110itd LLIZ;
    public int LLIZLLLIL;
    public int LLJ;
    public final View LLJI;
    public final View LLJIJIL;
    public final InterfaceC1620270sGX LLJILJIL;

    @Override // X.InterfaceC1259900itI
    public final void M0() {
        Video video;
        Aweme aweme = this.LL;
        if (aweme == null || (video = aweme.getVideo()) == null) {
            return;
        }
        if (C294660Bgm.LIZ()) {
            if (U5(video, "CoverViewHolder", Bitmap.Config.ARGB_8888)) {
                this.LLILLL = true;
                return;
            } else {
                S5(video.getCover(), "CoverViewHolder", Bitmap.Config.ARGB_8888, null);
                return;
            }
        }
        if (T5(video, "CoverViewHolder")) {
            this.LLILLL = true;
        } else {
            S5(video.getCover(), "CoverViewHolder", null, null);
        }
    }

    @Override // X.AbstractC1260080ita
    public final int[] R5() {
        return C422830Gi1.LIZ(200);
    }

    public final void X5() {
        Pair pairLLLLII = C19252910Tv.LIZIZ.LIZLLL().LJII().LLLLII();
        float fFloatValue = ((Number) pairLLLLII.getFirst()).floatValue();
        float fFloatValue2 = ((Number) pairLLLLII.getSecond()).floatValue();
        this.LLJ = C0HCL.LIZ(fFloatValue, this.itemView.getContext());
        this.LLIZLLLIL = C0HCL.LIZ(fFloatValue2, this.itemView.getContext());
    }

    public C1620250sGV(InterfaceC1620270sGX interfaceC1620270sGX, View view, InterfaceC1260110itd interfaceC1260110itd) {
        super(view);
        this.LLIZ = interfaceC1260110itd;
        this.LLJILJIL = interfaceC1620270sGX;
        X5();
        this.LLJI = view.findViewById(R.id.tsc);
        SmartImageView smartImageView = (SmartImageView) view.findViewById(R.id.az5);
        this.LLILLJJLI = smartImageView;
        C786410Ut5.Q8(smartImageView, new ACListenerS158S0100000_24(this, 75));
        SmartImageView smartImageView2 = this.LLILLJJLI;
        smartImageView2.setForeground(smartImageView2.getContext().getDrawable(R.drawable.bhy));
        View viewFindViewById = view.findViewById(R.id.video_cover_mask);
        this.LLJIJIL = viewFindViewById;
        C786410Ut5.LJLLLLLL(8, viewFindViewById);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0087 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    @Override // X.AbstractC1260080ita
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean U5(com.ss.android.ugc.aweme.feed.model.Video r19, java.lang.String r20, android.graphics.Bitmap.Config r21) {
        /*
            r18 = this;
            java.lang.String r8 = "CoverViewHolder"
            X.01GW r0 = com.ss.android.ugc.aweme.discover.experiment.DiscoveryFpsOptExperiment.LIZIZ
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.discover.experiment.DiscoveryFpsOptExperiment$Config r0 = (com.ss.android.ugc.aweme.discover.experiment.DiscoveryFpsOptExperiment.Config) r0
            boolean r0 = r0.enable1
            r13 = r21
            r7 = r19
            r4 = r18
            if (r0 == 0) goto Lae
            X.01GW<java.lang.Boolean> r0 = X.C1620250sGV.LLJILJILJ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r15 = 0
            r6 = 1
            if (r0 != 0) goto Lb2
            android.view.View r0 = r4.itemView
            r0.getContext()
            X.0Vh4 r0 = X.C036E.LIZ     // Catch: java.lang.Exception -> L32
            boolean r0 = r0.LIZIZ()     // Catch: java.lang.Exception -> L32
            if (r0 == 0) goto L43
            goto L37
        L32:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            goto L43
        L37:
            android.view.View r0 = r4.itemView
            android.content.Context r0 = r0.getContext()
            boolean r0 = X.C0XJA.LIZ(r0)
            if (r0 == 0) goto Lb2
        L43:
            java.lang.String r5 = "use_dynamic_cover"
            boolean r0 = X.C0VO3.LIZ(r5)
            if (r0 != 0) goto La1
            java.util.HashMap<java.lang.String, java.lang.Boolean> r1 = X.C0VO3.LIZ
            java.lang.String r0 = X.C0VO3.LIZJ(r5)
            boolean r0 = r1.containsKey(r0)
            if (r0 == 0) goto La1
            boolean r0 = X.C0VO3.LIZ(r5)
            if (r0 != 0) goto L75
            java.lang.String r3 = X.C0VO3.LIZJ(r5)
            java.util.HashMap<java.lang.String, java.lang.Boolean> r2 = X.C0VO3.LIZ
            boolean r0 = r2.containsKey(r3)
            if (r0 == 0) goto L89
            java.lang.Object r0 = r2.get(r3)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r1 = r0.booleanValue()
        L73:
            if (r1 == 0) goto Lb2
        L75:
            com.bytedance.lighten.loader.SmartImageView r6 = r4.LLILLJJLI
            X.0OeO r10 = r4.LLILZIL
            r11 = 0
            r9 = 1
            r12 = r9
            r14 = r9
            r16 = r15
            r17 = r15
            boolean r0 = X.C1620160sGM.LIZIZ(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            if (r0 == 0) goto Lb2
            r15 = 1
            return r15
        L89:
            X.1Bky r0 = X.C2213981Bky.LIZIZ
            android.content.Context r1 = r0.getApplicationContext()
            java.lang.String r0 = "aweme_app"
            android.content.SharedPreferences r0 = X.C810670Vr7.LIZJ(r1, r15, r0)
            boolean r1 = r0.getBoolean(r5, r6)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r2.put(r3, r0)
            goto L73
        La1:
            X.01GW<java.lang.Boolean> r0 = X.C1620250sGV.LLJILLL
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r1 = r0.booleanValue()
            goto L73
        Lae:
            boolean r15 = super.U5(r7, r8, r13)
        Lb2:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1620250sGV.U5(com.ss.android.ugc.aweme.feed.model.Video, java.lang.String, android.graphics.Bitmap$Config):boolean");
    }
}
