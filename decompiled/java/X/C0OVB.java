package X;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.inbox.bulletin.data.BulletinCommentUIOverview;
import com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinImageInfo;
import com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinPhotoItem;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS410S0200000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OVB, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OVB implements InterfaceC619720OSk {
    public final View LIZ;
    public final SmartImageView LIZIZ;
    public final FrameLayout LIZJ;
    public FrameLayout LIZLLL;
    public TuxIconView LJ;
    public ObjectAnimator LJFF;
    public C0OV6 LJI;
    public String LJII;
    public Boolean LJIIIIZZ;
    public Boolean LJIIIZ;
    public float LJIIJ;
    public float LJIIJJI;
    public C0OV6 LJIIL;
    public final C0P46 LJIILIIL;
    public BulletinPhotoItem LJIILJJIL;
    public final C0OVC LJIILL;

    @Override // X.C0OT0
    public final View LJIJI() {
        return this.LIZ;
    }

    @Override // X.InterfaceC619720OSk
    public final ObjectAnimator Rp() {
        return this.LJFF;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [X.0OVC] */
    public C0OVB(ViewStub viewStub) {
        ViewGroup viewGroup;
        View viewLJLLLL;
        ViewParent parent = viewStub.getParent();
        if (parent instanceof ViewGroup) {
            viewGroup = (ViewGroup) parent;
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            viewStub.setLayoutResource(R.layout.a6m);
            viewLJLLLL = C786410Ut5.LJLLLL(viewStub);
        } else {
            int iIndexOfChild = viewGroup.indexOfChild(viewStub);
            ViewGroup.LayoutParams layoutParams = viewStub.getLayoutParams();
            C786410Ut5.LJJLJLI(viewStub, viewGroup);
            Context context = viewStub.getContext();
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setId(R.id.d0c);
            C786410Ut5.a6(frameLayout, layoutParams);
            frameLayout.setClickable(true);
            SmartImageView smartImageView = new SmartImageView(context);
            smartImageView.setId(R.id.d2h);
            C786410Ut5.G6(smartImageView, new FrameLayout.LayoutParams(-1, -1));
            smartImageView.setActualImageScaleType(EnumC1338240kve.CENTER_CROP);
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.br);
            smartImageView.setPlaceholderImage(c384050F3z.LIZ(context));
            frameLayout.addView(smartImageView);
            viewGroup.addView(frameLayout, iIndexOfChild);
            viewLJLLLL = frameLayout;
        }
        this.LIZ = viewLJLLLL;
        this.LIZIZ = (SmartImageView) viewLJLLLL.findViewById(R.id.d2h);
        this.LIZJ = (FrameLayout) viewLJLLLL;
        this.LJIIJ = -1.0f;
        this.LJIIJJI = -1.0f;
        this.LJIILIIL = new C0P46(this, 2);
        this.LJIILL = new AbstractC2350809Ja() { // from class: X.0OVC
            @Override // X.InterfaceC605070NoH
            public final void LIZ(File file) {
                BulletinPhotoItem bulletinPhotoItem;
                if (file == null || (bulletinPhotoItem = this.LIZ.LJIILJJIL) == null) {
                    return;
                }
                C1331670kl3 c1331670kl3LJII = C1331660kl2.LJII(file);
                c1331670kl3LJII.LJJ(this.LIZ.LIZIZ);
                c1331670kl3LJII.LJIL = Bitmap.Config.ARGB_8888;
                c1331670kl3LJII.LIZLLL = true;
                c1331670kl3LJII.LJJI = this.LIZ.LIZLLL(bulletinPhotoItem);
                c1331670kl3LJII.LJIIJJI();
            }

            @Override // X.InterfaceC605070NoH
            public final void onFailed(Throwable th) {
                String message;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("loadRemoteImage onFailed(), throwable.message = ");
                if (th != null) {
                    message = th.getMessage();
                } else {
                    message = null;
                }
                sbLIZ.append(message);
                C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
            }
        };
    }

    @Override // X.InterfaceC619720OSk
    public final void LIZ(C0OV6 c0ov6) {
        this.LJI = c0ov6;
        if (c0ov6 == null) {
            this.LIZ.setClipToOutline(false);
            return;
        }
        this.LIZ.setClipToOutline(true);
        this.LJIIL = c0ov6;
        this.LIZ.setOutlineProvider(this.LJIILIIL);
    }

    @Override // X.InterfaceC619720OSk
    public final void LIZJ(BulletinPhotoItem bulletinPhotoItem) {
        if (Intrinsics.LJFF(Boolean.valueOf(bulletinPhotoItem.LLJ), this.LJIIIIZZ) && Intrinsics.LJFF(Boolean.valueOf(bulletinPhotoItem.LLIZ), this.LJIIIZ)) {
            return;
        }
        this.LJIIIIZZ = Boolean.valueOf(bulletinPhotoItem.LLJ);
        this.LJIIIZ = Boolean.valueOf(bulletinPhotoItem.LLIZ);
        if (bulletinPhotoItem.LLJ && bulletinPhotoItem.LLIZ) {
            if (this.LIZLLL == null) {
                Context context = this.LIZJ.getContext();
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.setId(R.id.d2k);
                C786410Ut5.a6(frameLayout, new FrameLayout.LayoutParams(-1, -1));
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LIZIZ = Integer.valueOf(R.attr.e1);
                frameLayout.setBackground(c384050F3z.LIZ(context));
                C786410Ut5.U4(frameLayout, 0.6f);
                C786410Ut5.LJZ(8, frameLayout);
                TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6, null);
                tuxIconView.setId(R.id.d2j);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48)));
                layoutParams.gravity = 17;
                C786410Ut5.M6(tuxIconView, layoutParams);
                tuxIconView.setImportantForAccessibility(2);
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = R.raw.icon_spinner_normal;
                c419910GdJ.LJ = Integer.valueOf(R.attr.a0o);
                tuxIconView.setTuxIcon(c419910GdJ);
                frameLayout.addView(tuxIconView);
                this.LIZJ.addView(frameLayout);
                this.LIZLLL = frameLayout;
                this.LJ = tuxIconView;
            }
            FrameLayout frameLayout2 = this.LIZLLL;
            if (frameLayout2 != null) {
                C12ES.LJIILL(0, frameLayout2);
            }
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.LJ, "rotation", 0.0f, 359.0f);
            objectAnimatorOfFloat.setRepeatCount(-1);
            objectAnimatorOfFloat.setDuration(1000L);
            objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
            this.LJFF = objectAnimatorOfFloat;
            return;
        }
        FrameLayout frameLayout3 = this.LIZLLL;
        if (frameLayout3 != null) {
            C0DTR.LIZIZ(frameLayout3);
        }
        this.LJFF = null;
    }

    public final C1331730kl9 LIZLLL(BulletinPhotoItem bulletinPhotoItem) {
        List<AbstractC619610ORz> list;
        float f;
        C0OV6 c0ov6 = this.LJI;
        List<AbstractC619610ORz> list2 = null;
        if (c0ov6 == null) {
            return null;
        }
        C1331750klB c1331750klB = new C1331750klB();
        float f2 = c0ov6.LIZ;
        float f3 = c0ov6.LIZIZ;
        BulletinCommentUIOverview bulletinCommentUIOverview = bulletinPhotoItem.LLJLIL;
        if (bulletinCommentUIOverview != null) {
            list = bulletinCommentUIOverview.comments;
        } else {
            list = null;
        }
        float f4 = 0.0f;
        if (C866950Xzh.LIZIZ(list)) {
            f = 0.0f;
        } else {
            f = c0ov6.LIZJ;
        }
        BulletinCommentUIOverview bulletinCommentUIOverview2 = bulletinPhotoItem.LLJLIL;
        if (bulletinCommentUIOverview2 != null) {
            list2 = bulletinCommentUIOverview2.comments;
        }
        if (!C866950Xzh.LIZIZ(list2)) {
            f4 = c0ov6.LIZLLL;
        }
        c1331750klB.LJI = new C1331920klS(f2, f3, f, f4);
        c1331750klB.LIZ = false;
        return c1331750klB.LIZ();
    }

    public final void LJI(BulletinPhotoItem bulletinPhotoItem) {
        float fIntValue;
        Integer num;
        Integer num2;
        BulletinImageInfo bulletinImageInfo = bulletinPhotoItem.LLJI;
        if (bulletinImageInfo == null) {
            return;
        }
        float fIntValue2 = 0.0f;
        Integer num3 = bulletinImageInfo.width;
        if (num3 != null) {
            fIntValue = num3.intValue();
        } else {
            fIntValue = 0.0f;
        }
        BulletinImageInfo bulletinImageInfo2 = bulletinPhotoItem.LLJI;
        if (bulletinImageInfo2 != null && (num2 = bulletinImageInfo2.height) != null) {
            fIntValue2 = num2.intValue();
        }
        BulletinImageInfo bulletinImageInfo3 = bulletinPhotoItem.LLJI;
        if (bulletinImageInfo3 != null) {
            num = bulletinImageInfo3.type;
        } else {
            num = null;
        }
        LJFF(fIntValue, fIntValue2, bulletinPhotoItem.LLIIJI(num), new AwS410S0200000_9(bulletinPhotoItem, this, 85));
    }

    @Override // X.InterfaceC619720OSk
    public final void LJIIIZ(BulletinPhotoItem bulletinPhotoItem) {
        LIZJ(bulletinPhotoItem);
        LJIILIIL(bulletinPhotoItem);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0094  */
    @Override // X.InterfaceC619720OSk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILIIL(com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinPhotoItem r7) {
        /*
            r6 = this;
            boolean r0 = r7.LLJ
            r2 = 0
            if (r0 == 0) goto L14
            com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinImageInfo r0 = r7.LLJI
            if (r0 == 0) goto L42
            java.lang.String r0 = r0.path
        Lb:
            java.lang.String r1 = r6.LJII
            boolean r1 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r1)
            if (r1 == 0) goto L44
            return
        L14:
            java.util.List<com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinImage> r0 = r7.LLJILJIL
            if (r0 == 0) goto L40
            java.lang.Object r1 = X.C13LP.LJJJLL(r0)
            com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinImage r1 = (com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinImage) r1
        L1e:
            boolean r0 = X.C290780BaW.LIZ()
            if (r0 == 0) goto L3b
            if (r1 == 0) goto L42
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r1.cropUrl
            if (r0 != 0) goto L2e
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r1.originUrl
        L2c:
            if (r0 == 0) goto L42
        L2e:
            java.util.List r0 = r0.getUrlList()
            if (r0 == 0) goto L42
            java.lang.Object r0 = X.C13LP.LJJJLL(r0)
            java.lang.String r0 = (java.lang.String) r0
            goto Lb
        L3b:
            if (r1 == 0) goto L42
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r1.originUrl
            goto L2c
        L40:
            r1 = r2
            goto L1e
        L42:
            r0 = r2
            goto Lb
        L44:
            r6.LJII = r0
            com.bytedance.lighten.loader.SmartImageView r0 = r6.LIZIZ
            r0.setController(r2)
            boolean r0 = r7.LLJ
            if (r0 == 0) goto L53
            r6.LJI(r7)
            return
        L53:
            r6.LJI(r7)
            java.util.List<com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinImage> r0 = r7.LLJILJIL
            if (r0 == 0) goto L96
            java.lang.Object r1 = X.C13LP.LJJJLL(r0)
            com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinImage r1 = (com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinImage) r1
        L60:
            boolean r0 = X.C290780BaW.LIZ()
            if (r0 == 0) goto L8f
            if (r1 == 0) goto L94
            com.ss.android.ugc.aweme.base.model.UrlModel r5 = r1.cropUrl
            if (r5 != 0) goto L6e
            com.ss.android.ugc.aweme.base.model.UrlModel r5 = r1.originUrl
        L6e:
            r4 = 0
            if (r5 == 0) goto L8d
            int r0 = r5.getWidth()
            float r3 = (float) r0
            int r0 = r5.getHeight()
            float r4 = (float) r0
        L7b:
            if (r1 == 0) goto L7f
            java.lang.Integer r2 = r1.type
        L7f:
            boolean r2 = r7.LLIIJI(r2)
            kotlin.jvm.internal.AwS253S0300000_9 r1 = new kotlin.jvm.internal.AwS253S0300000_9
            r0 = 4
            r1.<init>(r5, r6, r7, r0)
            r6.LJFF(r3, r4, r2, r1)
            return
        L8d:
            r3 = 0
            goto L7b
        L8f:
            if (r1 == 0) goto L94
            com.ss.android.ugc.aweme.base.model.UrlModel r5 = r1.originUrl
            goto L6e
        L94:
            r5 = r2
            goto L6e
        L96:
            r1 = r2
            goto L60
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0OVB.LJIILIIL(com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinPhotoItem):void");
    }

    public final void LJFF(float f, float f2, boolean z, Function0<Unit> function0) {
        boolean z2;
        float fLIZIZ;
        double dMax;
        if (f == this.LJIIJ && f2 == this.LJIIJJI) {
            function0.invoke();
            return;
        }
        this.LJIIJ = f;
        this.LJIIJJI = f2;
        if (f == 0.0f) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2 && f2 != 0.0f) {
            float f3 = f / f2;
            if (z) {
                fLIZIZ = Math.max(C418440Gaw.LIZIZ(Float.valueOf(f)), C418440Gaw.LIZIZ(150));
                dMax = Math.max(C418440Gaw.LIZIZ(Float.valueOf(f2)), C418440Gaw.LIZIZ(150) / f3);
            } else if (f3 < 1.0f) {
                fLIZIZ = C418440Gaw.LIZIZ(180);
                dMax = Math.max(C418440Gaw.LIZIZ(180), Math.min((((double) fLIZIZ) * 1.0d) / ((double) f3), C418440Gaw.LIZIZ(320)));
            } else {
                double d = f3;
                if (d <= 1.2d) {
                    fLIZIZ = C418440Gaw.LIZIZ(180);
                    dMax = Math.max(C418440Gaw.LIZIZ(140), Math.min((((double) fLIZIZ) * 1.0d) / d, C418440Gaw.LIZIZ(180)));
                } else {
                    fLIZIZ = C418440Gaw.LIZIZ(260);
                    dMax = Math.max(C418440Gaw.LIZIZ(80), Math.min((((double) fLIZIZ) * 1.0d) / d, C418440Gaw.LIZIZ(180)));
                }
            }
            ViewGroup.LayoutParams layoutParams = this.LIZ.getLayoutParams();
            layoutParams.width = (int) fLIZIZ;
            layoutParams.height = (int) dMax;
            C786410Ut5.W5(this.LIZ, layoutParams);
            function0.invoke();
            return;
        }
        ViewGroup.LayoutParams layoutParams2 = this.LIZ.getLayoutParams();
        layoutParams2.width = (int) C418440Gaw.LIZIZ(180);
        layoutParams2.height = (int) C418440Gaw.LIZIZ(320);
        C786410Ut5.W5(this.LIZ, layoutParams2);
    }
}
