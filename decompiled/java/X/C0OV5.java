package X;

import android.animation.ObjectAnimator;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.LinearInterpolator;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.inbox.bulletin.data.BulletinCommentUIOverview;
import com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinImageInfo;
import com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinPhotoItem;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS410S0200000_9;

/* JADX INFO: renamed from: X.0OV5, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OV5 implements InterfaceC619720OSk {
    public final View LIZ;
    public ObjectAnimator LIZIZ;
    public C0OV6 LIZJ;

    @Override // X.C0OT0
    public final View LJIJI() {
        return this.LIZ;
    }

    @Override // X.InterfaceC619720OSk
    public final ObjectAnimator Rp() {
        return this.LIZIZ;
    }

    public C0OV5(ViewStub viewStub) {
        viewStub.setLayoutResource(R.layout.a6m);
        this.LIZ = C786410Ut5.LJLLLL(viewStub);
    }

    @Override // X.InterfaceC619720OSk
    public final void LIZ(C0OV6 c0ov6) {
        this.LIZJ = c0ov6;
    }

    @Override // X.InterfaceC619720OSk
    public final void LIZJ(BulletinPhotoItem bulletinPhotoItem) {
        if (bulletinPhotoItem.LLJ && bulletinPhotoItem.LLIZ) {
            C12ES.LJIILL(0, this.LIZ.findViewById(R.id.d2k));
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.LIZ.findViewById(R.id.d2j), "rotation", 0.0f, 359.0f);
            this.LIZIZ = objectAnimatorOfFloat;
            if (objectAnimatorOfFloat != null) {
                objectAnimatorOfFloat.setRepeatCount(-1);
            }
            ObjectAnimator objectAnimator = this.LIZIZ;
            if (objectAnimator != null) {
                objectAnimator.setDuration(1000L);
            }
            ObjectAnimator objectAnimator2 = this.LIZIZ;
            if (objectAnimator2 != null) {
                objectAnimator2.setInterpolator(new LinearInterpolator());
                return;
            }
            return;
        }
        C0DTR.LIZIZ(this.LIZ.findViewById(R.id.d2k));
        this.LIZIZ = null;
    }

    public final C1331730kl9 LIZLLL(BulletinPhotoItem bulletinPhotoItem) {
        List<AbstractC619610ORz> list;
        float f;
        C0OV6 c0ov6 = this.LIZJ;
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
        LJFF(fIntValue, fIntValue2, bulletinPhotoItem.LLIIJI(num), new AwS410S0200000_9(bulletinPhotoItem, this, 83));
    }

    @Override // X.InterfaceC619720OSk
    public final void LJIIIZ(BulletinPhotoItem bulletinPhotoItem) {
        ((SmartImageView) this.LIZ.findViewById(R.id.d2h)).setPlaceholderImage(new ColorDrawable(C1618770sE7.LIZ(R.attr.br)));
        LIZJ(bulletinPhotoItem);
        LJIILIIL(bulletinPhotoItem);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005f  */
    @Override // X.InterfaceC619720OSk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILIIL(com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinPhotoItem r8) {
        /*
            r7 = this;
            r6 = 0
            X.0kl3 r2 = X.C1331660kl2.LJIIIIZZ(r6)
            android.view.View r1 = r7.LIZ
            r0 = 2131366152(0x7f0a1108, float:1.835219E38)
            android.view.View r0 = r1.findViewById(r0)
            X.0kpH r0 = (X.InterfaceC1334290kpH) r0
            r2.LJJ(r0)
            X.C786410Ut5.h3(r2)
            boolean r0 = r8.LLJ
            if (r0 == 0) goto L1e
            r7.LJI(r8)
            return
        L1e:
            r7.LJI(r8)
            java.util.List<com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinImage> r0 = r8.LLJILJIL
            if (r0 == 0) goto L61
            java.lang.Object r1 = X.C13LP.LJJJLL(r0)
            com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinImage r1 = (com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinImage) r1
        L2b:
            boolean r0 = X.C290780BaW.LIZ()
            if (r0 == 0) goto L5a
            if (r1 == 0) goto L5f
            com.ss.android.ugc.aweme.base.model.UrlModel r5 = r1.cropUrl
            if (r5 != 0) goto L39
            com.ss.android.ugc.aweme.base.model.UrlModel r5 = r1.originUrl
        L39:
            r4 = 0
            if (r5 == 0) goto L58
            int r0 = r5.getWidth()
            float r3 = (float) r0
            int r0 = r5.getHeight()
            float r4 = (float) r0
        L46:
            if (r1 == 0) goto L4a
            java.lang.Integer r6 = r1.type
        L4a:
            boolean r2 = r8.LLIIJI(r6)
            kotlin.jvm.internal.AwS253S0300000_9 r1 = new kotlin.jvm.internal.AwS253S0300000_9
            r0 = 3
            r1.<init>(r5, r7, r8, r0)
            r7.LJFF(r3, r4, r2, r1)
            return
        L58:
            r3 = 0
            goto L46
        L5a:
            if (r1 == 0) goto L5f
            com.ss.android.ugc.aweme.base.model.UrlModel r5 = r1.originUrl
            goto L39
        L5f:
            r5 = r6
            goto L39
        L61:
            r1 = r6
            goto L2b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0OV5.LJIILIIL(com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinPhotoItem):void");
    }

    public final void LJFF(float f, float f2, boolean z, Function0<Unit> function0) {
        boolean z2;
        float fLIZIZ;
        double dMax;
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
