package X;

import android.view.View;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.skeleton.TuxSkeletonLayout;
import com.ss.android.ugc.aweme.inbox.bulletin.assem.preview.BulletinEditPreviewAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;
import njp.a;

/* JADX INFO: renamed from: X.0OTA, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.assem.preview.BulletinEditPreviewAssem$fetchOgMeta$1$1", f = "BulletinEditPreviewAssem.kt", l = {}, m = "invokeSuspend")
public final class C0OTA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ BulletinEditPreviewAssem LLILLJJLI;
    public final /* synthetic */ C0OT8 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0OTA(BulletinEditPreviewAssem bulletinEditPreviewAssem, C0OT8 c0ot8, InterfaceC1364105Vn<? super C0OTA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = bulletinEditPreviewAssem;
        this.LLILLL = c0ot8;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0OTA c0ota = new C0OTA(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        c0ota.LL = obj;
        return c0ota;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C1C7U.LIZ("BulletinEditPreviewAssem@ca16.fetchOgMeta$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (C2296808zG.LJI((InterfaceC497601wk) this.LL)) {
            TuxSkeletonLayout tuxSkeletonLayout = this.LLILLJJLI.LLJJJ;
            if (tuxSkeletonLayout != null) {
                tuxSkeletonLayout.setLoading(false);
            }
            C0OT8 c0ot8 = this.LLILLL;
            if (c0ot8 instanceof C0OT7) {
                BulletinEditPreviewAssem bulletinEditPreviewAssem = this.LLILLJJLI;
                C0OT7 c0ot7 = (C0OT7) c0ot8;
                bulletinEditPreviewAssem.getClass();
                if (c0ot7.LJI && (str = c0ot7.LIZIZ) != null && !a0.LJJJIL(str)) {
                    String str2 = c0ot7.LJ;
                    if (str2 != null && str2.length() != 0) {
                        SmartImageView smartImageView = bulletinEditPreviewAssem.LLJJJJ;
                        if (smartImageView != null) {
                            C12ES.LJIILL(0, smartImageView);
                        }
                        TuxIconView tuxIconView = bulletinEditPreviewAssem.LLJJJIL;
                        if (tuxIconView != null) {
                            C0DTR.LIZIZ(tuxIconView);
                        }
                        SmartImageView smartImageView2 = bulletinEditPreviewAssem.LLJJJJ;
                        if (smartImageView2 != null) {
                            C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str2);
                            c1331670kl3LJIIIZ.LJJ(smartImageView2);
                            c1331670kl3LJIIIZ.LJIIJ(bulletinEditPreviewAssem.LLJLILLLLZIIL);
                        }
                    } else {
                        SmartImageView smartImageView3 = bulletinEditPreviewAssem.LLJJJJ;
                        if (smartImageView3 != null) {
                            C0DTR.LIZIZ(smartImageView3);
                        }
                        TuxIconView tuxIconView2 = bulletinEditPreviewAssem.LLJJJIL;
                        if (tuxIconView2 != null) {
                            C12ES.LJIILL(0, tuxIconView2);
                        }
                    }
                    TuxTextView tuxTextView = bulletinEditPreviewAssem.LLJJJJJIL;
                    if (tuxTextView != null) {
                        tuxTextView.setText(c0ot7.LIZIZ);
                    }
                    String str3 = c0ot7.LIZJ;
                    if (str3 != null && str3.length() != 0) {
                        TuxTextView tuxTextView2 = bulletinEditPreviewAssem.LLJJJJLIIL;
                        if (tuxTextView2 != null) {
                            C12ES.LJIILL(0, tuxTextView2);
                        }
                        TuxTextView tuxTextView3 = bulletinEditPreviewAssem.LLJJJJLIIL;
                        if (tuxTextView3 != null) {
                            tuxTextView3.setText(str3);
                        }
                    } else {
                        TuxTextView tuxTextView4 = bulletinEditPreviewAssem.LLJJJJLIIL;
                        if (tuxTextView4 != null) {
                            C0DTR.LIZIZ(tuxTextView4);
                        }
                    }
                } else {
                    bulletinEditPreviewAssem.LLJLIL = false;
                    C0DTR.LIZIZ(bulletinEditPreviewAssem.LJJIJL());
                }
            } else if (c0ot8 instanceof C0OT6) {
                BulletinEditPreviewAssem bulletinEditPreviewAssem2 = this.LLILLJJLI;
                bulletinEditPreviewAssem2.LLJLIL = false;
                View viewLJJIJL = bulletinEditPreviewAssem2.LJJIJL();
                if (viewLJJIJL != null) {
                    C0DTR.LIZIZ(viewLJJIJL);
                }
            } else {
                throw new C1954807lC();
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BulletinEditPreviewAssem@ca16.fetchOgMeta$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
