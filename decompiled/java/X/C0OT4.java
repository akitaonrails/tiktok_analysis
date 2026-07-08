package X;

import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;
import njp.a;

/* JADX INFO: renamed from: X.0OT4, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.view.widget.BulletinPreviewWidget$fetchOgMeta$1$1", f = "BulletinPreviewWidget.kt", l = {}, m = "invokeSuspend")
public final class C0OT4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C619630OSb LLILLJJLI;
    public final /* synthetic */ C0OT8 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0OT4(C619630OSb c619630OSb, C0OT8 c0ot8, InterfaceC1364105Vn<? super C0OT4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c619630OSb;
        this.LLILLL = c0ot8;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0OT4 c0ot4 = new C0OT4(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        c0ot4.LL = obj;
        return c0ot4;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C1C7U.LIZ("BulletinPreviewWidget@96d1.fetchOgMeta$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (C2296808zG.LJI((InterfaceC497601wk) this.LL)) {
            C619630OSb c619630OSb = this.LLILLJJLI;
            c619630OSb.LJIIZILJ = false;
            FrameLayout frameLayout = c619630OSb.LJIIJJI;
            if (frameLayout != null) {
                C0DTR.LIZIZ(frameLayout);
            }
            C0OT8 c0ot8 = this.LLILLL;
            if (c0ot8 instanceof C0OT7) {
                C619630OSb c619630OSb2 = this.LLILLJJLI;
                C0OT7 c0ot7 = (C0OT7) c0ot8;
                c619630OSb2.getClass();
                if (c0ot7.LJI && (str = c0ot7.LIZIZ) != null && !a0.LJJJIL(str)) {
                    String str2 = c0ot7.LJ;
                    if (str2 != null && str2.length() != 0) {
                        SmartImageView smartImageView = c619630OSb2.LJII;
                        if (smartImageView != null) {
                            C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str2);
                            c1331670kl3LJIIIZ.LJJ(smartImageView);
                            if (C0OS8.LJ()) {
                                c1331670kl3LJIIIZ.LJIIJJI();
                            } else {
                                C786410Ut5.h3(c1331670kl3LJIIIZ);
                            }
                        }
                        SmartImageView smartImageView2 = c619630OSb2.LJII;
                        if (smartImageView2 != null) {
                            C12ES.LJIILL(0, smartImageView2);
                        }
                    } else {
                        SmartImageView smartImageView3 = c619630OSb2.LJII;
                        if (smartImageView3 != null) {
                            C0DTR.LIZIZ(smartImageView3);
                        }
                    }
                    String str3 = c0ot7.LIZIZ;
                    if (str3 != null && str3.length() != 0) {
                        TuxTextView tuxTextView = c619630OSb2.LJIIIIZZ;
                        if (tuxTextView != null) {
                            tuxTextView.setText(str3);
                        }
                        TuxTextView tuxTextView2 = c619630OSb2.LJIIIIZZ;
                        if (tuxTextView2 != null) {
                            C12ES.LJIILL(0, tuxTextView2);
                        }
                    } else {
                        TuxTextView tuxTextView3 = c619630OSb2.LJIIIIZZ;
                        if (tuxTextView3 != null) {
                            C0DTR.LIZIZ(tuxTextView3);
                        }
                    }
                    String str4 = c0ot7.LIZJ;
                    if (str4 != null && str4.length() != 0) {
                        TuxTextView tuxTextView4 = c619630OSb2.LJIIIZ;
                        if (tuxTextView4 != null) {
                            tuxTextView4.setText(str4);
                        }
                        TuxTextView tuxTextView5 = c619630OSb2.LJIIIZ;
                        if (tuxTextView5 != null) {
                            C12ES.LJIILL(0, tuxTextView5);
                        }
                    } else {
                        TuxTextView tuxTextView6 = c619630OSb2.LJIIIZ;
                        if (tuxTextView6 != null) {
                            C0DTR.LIZIZ(tuxTextView6);
                        }
                    }
                    View view = c619630OSb2.LJIIL;
                    if (view != null) {
                        C12ES.LJIILL(0, view);
                    }
                    TuxTextView tuxTextView7 = c619630OSb2.LJIIJ;
                    if (tuxTextView7 != null) {
                        tuxTextView7.setText(c0ot7.LJFF);
                    }
                    TuxTextView tuxTextView8 = c619630OSb2.LJIIJ;
                    if (tuxTextView8 != null) {
                        C12ES.LJIILL(0, tuxTextView8);
                    }
                } else {
                    View view2 = c619630OSb2.LJFF;
                    if (view2 != null) {
                        C0DTR.LIZIZ(view2);
                    }
                }
            } else if (c0ot8 instanceof C0OT6) {
                View view3 = this.LLILLJJLI.LJFF;
                if (view3 != null) {
                    C0DTR.LIZIZ(view3);
                }
            } else {
                throw new C1954807lC();
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BulletinPreviewWidget@96d1.fetchOgMeta$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
