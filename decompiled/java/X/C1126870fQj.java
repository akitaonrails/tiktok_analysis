package X;

import android.view.View;
import android.widget.ImageView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0fQj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1126870fQj extends AbstractC1126590fQH {
    public final String LLJJJ;
    public final C520690KbT LLJJJIL;
    public final C1295960jpS LLJJJJ;
    public final C1324720kZq LLJJJJJIL;
    public final C16F5 LLJJJJLIIL;
    public final C520690KbT LLJJL;
    public final C1324720kZq LLJJLIIIJLLLLLLLZ;
    public final C16F5 LLJL;
    public final ImageView LLJLIL;

    public final void e6() {
        AbstractC1126600fQI<?> abstractC1126600fQI = this.LLIZLLLIL;
        boolean z = abstractC1126600fQI != null ? abstractC1126600fQI.LIZJ : false;
        C1126920fQo.LIZLLL(z, this.LLJJJJ, this.LLILZIL, this.LLJJLIIIJLLLLLLLZ, this.LLJJJJJIL);
        C520690KbT c520690KbT = this.LLJJJIL;
        if (c520690KbT != null) {
            C500260Jjc.LJIILIIL(c520690KbT);
        }
        C16F5 c16f5 = this.LLJJJJLIIL;
        if (c16f5 != null) {
            C500260Jjc.LJIILIIL(c16f5);
        }
        C1126920fQo.LJ(this.LLILZ, z);
        C1126920fQo.LIZJ(this.LLJLIL, this.LLJL, z);
        C16F5 c16f52 = this.LLJILJIL;
        if (c16f52 != null) {
            c16f52.setText(C497740JfY.LJIJI(2131841735));
        }
        C1126920fQo.LIZIZ(z, this.LLJJL, this.LLJL);
    }

    @Override // X.AbstractC1126590fQH
    public final void V5() {
        super.V5();
        C20441214yg.LIZIZ(this.LLJJJ, "onSelected landscape");
        e6();
    }

    @Override // X.AbstractC1126590fQH
    public final void W5() {
        super.W5();
        C20441214yg.LIZIZ(this.LLJJJ, "onUnSelected landscape");
        e6();
    }

    public C1126870fQj(View view) {
        super(view);
        this.LLJJJ = "LiveGiftRechargeViewHolder";
        this.LLJJLIIIJLLLLLLLZ = (C1324720kZq) this.LL.findViewById(R.id.iwx);
        C16F5 c16f5 = (C16F5) this.LL.findViewById(R.id.p6n);
        this.LLJL = c16f5;
        this.LLJLIL = (ImageView) this.LL.findViewById(R.id.e3l);
        this.LLJJJIL = (C520690KbT) view.findViewById(R.id.xw8);
        C16F5 c16f52 = (C16F5) view.findViewById(R.id.ycb);
        this.LLJJJJLIIL = c16f52;
        this.LLJJJJ = (C1295960jpS) view.findViewById(R.id.f718i0b);
        this.LLJJJJJIL = (C1324720kZq) view.findViewById(R.id.kgq);
        if (c16f52 != null) {
            c16f52.setTypeface(C1119920fFW.LIZJ(c16f52.getTextSize(), 500, view.getContext()));
        }
        if (c16f5 != null) {
            c16f5.setTypeface(C1119920fFW.LIZJ(c16f5.getTextSize(), 500, this.LL.getContext()));
        }
        this.LLJJL = (C520690KbT) view.findViewById(R.id.chf);
        view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC1151660g4i(this, view, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0014  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0056 A[PHI: r3
      0x0056: PHI (r3v2 com.bytedance.android.live.base.model.ImageModel) = 
      (r3v1 com.bytedance.android.live.base.model.ImageModel)
      (r3v1 com.bytedance.android.live.base.model.ImageModel)
      (r3v3 com.bytedance.android.live.base.model.ImageModel)
     binds: [B:26:0x004c, B:28:0x0050, B:30:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0069  */
    @Override // X.AbstractC1126590fQH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void L5(X.AbstractC1126600fQI<?> r10, com.bytedance.ies.sdk.datachannel.DataChannel r11, int r12, int r13) {
        /*
            r9 = this;
            super.L5(r10, r11, r12, r13)
            X.0fQI<?> r2 = r9.LLIZLLLIL
            r3 = 0
            if (r2 == 0) goto L69
            com.bytedance.android.live.base.model.ImageModel r0 = r2.LJ
            if (r0 != 0) goto L38
            if (r2 == 0) goto L69
            T extends X.0054 r1 = r2.LIZIZ
        L10:
            boolean r0 = r1 instanceof com.bytedance.android.livesdk.model.Gift
            if (r0 == 0) goto L66
            com.bytedance.android.livesdk.model.Gift r1 = (com.bytedance.android.livesdk.model.Gift) r1
            if (r1 == 0) goto L67
            com.bytedance.android.live.base.model.ImageModel r6 = r1.previewImage
        L1a:
            if (r2 == 0) goto L46
            boolean r0 = r2.LJIILJJIL()
            r8 = 1
            if (r0 != r8) goto L46
            if (r6 == 0) goto L38
            if (r1 == 0) goto L43
            long r0 = r1.id
        L29:
            X.0kZq r5 = r9.LLJJLIIIJLLLLLLLZ
            r2 = -1
            r4 = 2130975662(0x7f041bae, float:1.7560182E38)
            X.0fQV r7 = new X.0fQV
            r7.<init>()
            r3 = r2
            X.C0JSS.LIZJ(r2, r3, r4, r5, r6, r7, r8)
        L38:
            java.lang.String r1 = r9.LLJJJ
            java.lang.String r0 = "bindView landscape"
            X.C20441214yg.LIZIZ(r1, r0)
            r9.e6()
            return
        L43:
            r0 = 0
            goto L29
        L46:
            if (r1 == 0) goto L4a
            com.bytedance.android.live.base.model.ImageModel r3 = r1.image
        L4a:
            X.0fQI<?> r1 = r9.LLIZLLLIL
            if (r1 == 0) goto L56
            com.bytedance.android.live.base.model.ImageModel r0 = r1.LJFF
            if (r0 == 0) goto L56
            if (r1 == 0) goto L38
            com.bytedance.android.live.base.model.ImageModel r3 = r1.LJFF
        L56:
            if (r3 == 0) goto L38
            X.0kZq r2 = r9.LLJJLIIIJLLLLLLLZ
            X.0fQY r1 = new X.0fQY
            r1.<init>()
            r0 = 2130975661(0x7f041bad, float:1.756018E38)
            X.C0JSS.LJFF(r2, r3, r0, r1)
            goto L38
        L66:
            r1 = r3
        L67:
            r6 = r3
            goto L1a
        L69:
            r1 = r3
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1126870fQj.L5(X.0fQI, com.bytedance.ies.sdk.datachannel.DataChannel, int, int):void");
    }
}
