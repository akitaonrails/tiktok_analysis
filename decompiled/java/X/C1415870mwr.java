package X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.music.v2.assem.MusicDraftAssem;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS24S0010000_9;
import njp.a;

/* JADX INFO: renamed from: X.0mwr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.music.v2.assem.MusicDraftAssem$initData$1$1$1$countDeferred$1$1", f = "MusicDraftAssem.kt", l = {}, m = "invokeSuspend")
public final class C1415870mwr extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ MusicDraftAssem LL;
    public final /* synthetic */ int LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1415870mwr(MusicDraftAssem musicDraftAssem, int i, InterfaceC1364105Vn<? super C1415870mwr> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = musicDraftAssem;
        this.LLILLJJLI = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1415870mwr(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        ViewGroup.LayoutParams layoutParams3;
        ViewGroup.LayoutParams layoutParams4;
        ViewGroup.LayoutParams layoutParams5;
        ViewGroup.LayoutParams layoutParams6;
        C1C7U.LIZ("MusicDraftAssem@abb.initData$1$1$1$countDeferred$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.mp().setState(new AwS24S0010000_9(true, 21));
        MusicDraftAssem musicDraftAssem = this.LL;
        int i = this.LLILLJJLI;
        Context context = musicDraftAssem.getContext();
        if (context != null) {
            musicDraftAssem.LLJLLIL = new C1415860mwq(i, context);
            AbstractC20628015ni abstractC20628015ni = (AbstractC20628015ni) musicDraftAssem.LLJLIL.getValue();
            if (abstractC20628015ni != null) {
                abstractC20628015ni.setLoading(false);
            }
            TextView textView = (TextView) musicDraftAssem.LLJJJIL.getValue();
            if (textView != null) {
                textView.setText(context.getResources().getQuantityString(2131755716, i, Integer.valueOf(i)));
            }
            FrameLayout frameLayoutLp = musicDraftAssem.lp();
            if (frameLayoutLp != null) {
                C786410Ut5.LJZ(0, frameLayoutLp);
            }
            C1415860mwq c1415860mwq = musicDraftAssem.LLJLLIL;
            if (c1415860mwq != null) {
                int i2 = C1415890mwt.LIZ[c1415860mwq.LIZ().ordinal()];
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            FrameLayout frameLayoutLp2 = musicDraftAssem.lp();
                            if (frameLayoutLp2 != null && (layoutParams6 = frameLayoutLp2.getLayoutParams()) != null) {
                                layoutParams6.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36));
                            }
                            FrameLayout frameLayoutLp3 = musicDraftAssem.lp();
                            if (frameLayoutLp3 != null && (layoutParams5 = frameLayoutLp3.getLayoutParams()) != null) {
                                layoutParams5.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36));
                            }
                            FrameLayout frameLayoutLp4 = musicDraftAssem.lp();
                            if (frameLayoutLp4 != null) {
                                C384050F3z c384050F3z = new C384050F3z();
                                c384050F3z.LIZIZ = Integer.valueOf(R.attr.a03);
                                c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(18));
                                frameLayoutLp4.setBackground(c384050F3z.LIZ(context));
                            }
                            TuxIconView tuxIconView = (TuxIconView) musicDraftAssem.LLJLL.getValue();
                            if (tuxIconView != null) {
                                C419910GdJ c419910GdJ = new C419910GdJ();
                                c419910GdJ.LIZ = R.raw.icon_pen;
                                c419910GdJ.LIZLLL = C1308910kAL.LIZJ(R.attr.a1h, context);
                                c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                                c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                                tuxIconView.setTuxIcon(c419910GdJ);
                            }
                        } else {
                            throw new C1954807lC();
                        }
                    } else {
                        FrameLayout frameLayoutLp5 = musicDraftAssem.lp();
                        if (frameLayoutLp5 != null && (layoutParams4 = frameLayoutLp5.getLayoutParams()) != null) {
                            layoutParams4.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
                        }
                        FrameLayout frameLayoutLp6 = musicDraftAssem.lp();
                        if (frameLayoutLp6 != null && (layoutParams3 = frameLayoutLp6.getLayoutParams()) != null) {
                            layoutParams3.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
                        }
                        FrameLayout frameLayoutLp7 = musicDraftAssem.lp();
                        if (frameLayoutLp7 != null) {
                            frameLayoutLp7.setBackground(null);
                        }
                        TuxIconView tuxIconView2 = (TuxIconView) musicDraftAssem.LLJLL.getValue();
                        if (tuxIconView2 != null) {
                            C419910GdJ c419910GdJ2 = new C419910GdJ();
                            c419910GdJ2.LIZ = R.raw.icon_chevron_right_offset_small_ltr;
                            c419910GdJ2.LIZLLL = C1308910kAL.LIZJ(R.attr.a1k, context);
                            c419910GdJ2.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
                            c419910GdJ2.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
                            tuxIconView2.setTuxIcon(c419910GdJ2);
                        }
                    }
                } else {
                    FrameLayout frameLayoutLp8 = musicDraftAssem.lp();
                    if (frameLayoutLp8 != null && (layoutParams2 = frameLayoutLp8.getLayoutParams()) != null) {
                        layoutParams2.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
                    }
                    FrameLayout frameLayoutLp9 = musicDraftAssem.lp();
                    if (frameLayoutLp9 != null && (layoutParams = frameLayoutLp9.getLayoutParams()) != null) {
                        layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
                    }
                    FrameLayout frameLayoutLp10 = musicDraftAssem.lp();
                    if (frameLayoutLp10 != null) {
                        frameLayoutLp10.setBackground(null);
                    }
                    TuxIconView tuxIconView3 = (TuxIconView) musicDraftAssem.LLJLL.getValue();
                    if (tuxIconView3 != null) {
                        C419910GdJ c419910GdJ3 = new C419910GdJ();
                        c419910GdJ3.LIZ = R.raw.icon_pen;
                        c419910GdJ3.LIZLLL = C1308910kAL.LIZJ(R.attr.a1h, context);
                        c419910GdJ3.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
                        c419910GdJ3.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
                        tuxIconView3.setTuxIcon(c419910GdJ3);
                    }
                }
            }
        }
        MusicDraftAssem musicDraftAssem2 = this.LL;
        int i3 = this.LLILLJJLI;
        musicDraftAssem2.getClass();
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", "music_detail_page");
        c0lab.LJ("entrance_type", "cell");
        c0lab.LIZ(i3, "draft_cnt");
        C20684815ws.LJIILLIIL("recall_drafts_entrance_show", c0lab.LIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MusicDraftAssem@abb.initData$1$1$1$countDeferred$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
