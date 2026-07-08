package X;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinListViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinCommonAbility;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinInteractionAbility;
import com.zhiliaoapp.musically.R;
import irm.AkS81S0100000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OSb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C619630OSb implements C0OT0 {
    public final ViewStub LIZ;
    public final BulletinListViewModel LIZIZ;
    public final BulletinCommonAbility LIZJ;
    public final InterfaceC497601wk LIZLLL;
    public final boolean LJ;
    public View LJFF;
    public C21568919b5 LJI;
    public SmartImageView LJII;
    public TuxTextView LJIIIIZZ;
    public TuxTextView LJIIIZ;
    public TuxTextView LJIIJ;
    public FrameLayout LJIIJJI;
    public View LJIIL;
    public C0OVA LJIILIIL;
    public String LJIILJJIL;
    public AnonymousClass0956 LJIILL;
    public C0OOP LJIILLIIL;
    public boolean LJIIZILJ;
    public C11JF LJIJ;
    public DialogC1389620mGW LJIJI;

    public final void LJFF() {
        this.LJIIZILJ = false;
        FrameLayout frameLayout = this.LJIIJJI;
        if (frameLayout != null) {
            C0DTR.LIZIZ(frameLayout);
        }
        View view = this.LJFF;
        if (view != null) {
            C0DTR.LIZIZ(view);
        }
        this.LJIILJJIL = null;
        AnonymousClass0956 anonymousClass0956 = this.LJIILL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        C11JF c11jf = this.LJIJ;
        if (c11jf != null) {
            c11jf.dispose();
        }
        DialogC1389620mGW dialogC1389620mGW = this.LJIJI;
        if (dialogC1389620mGW != null) {
            dialogC1389620mGW.dismiss();
            C785410UrT.LIZ(dialogC1389620mGW);
        }
    }

    public final void LIZLLL(String str, C0OOP c0oop) {
        C0OVA c0ova;
        C0OV6 c0ov6;
        C21568919b5 c21568919b5;
        SmartImageView smartImageView;
        TuxTextView tuxTextView;
        TuxTextView tuxTextView2;
        TuxTextView tuxTextView3;
        FrameLayout frameLayout;
        View viewFindViewById;
        Context context;
        if (str != null && str.length() != 0) {
            if (this.LJFF == null) {
                ViewStub viewStub = this.LIZ;
                viewStub.setLayoutResource(R.layout.a6q);
                View viewLJLLLL = C786410Ut5.LJLLLL(viewStub);
                this.LJFF = viewLJLLLL;
                if (viewLJLLLL != null && (context = viewLJLLLL.getContext()) != null) {
                    DialogC1389620mGW dialogC1389620mGW = new DialogC1389620mGW(context);
                    dialogC1389620mGW.LJJLIIJ(false);
                    dialogC1389620mGW.LJJLL(false);
                    dialogC1389620mGW.setCancelable(false);
                    this.LJIJI = dialogC1389620mGW;
                }
                View view = this.LJFF;
                if (view != null) {
                    C786410Ut5.I7(new AkS81S0100000_9(this, 13), view);
                }
                View view2 = this.LJFF;
                if (view2 != null) {
                    c21568919b5 = (C21568919b5) view2.findViewById(R.id.rpx);
                } else {
                    c21568919b5 = null;
                }
                this.LJI = c21568919b5;
                View view3 = this.LJFF;
                if (view3 != null) {
                    smartImageView = (SmartImageView) view3.findViewById(R.id.rqu);
                } else {
                    smartImageView = null;
                }
                this.LJII = smartImageView;
                View view4 = this.LJFF;
                if (view4 != null) {
                    tuxTextView = (TuxTextView) view4.findViewById(R.id.rsg);
                } else {
                    tuxTextView = null;
                }
                this.LJIIIIZZ = tuxTextView;
                View view5 = this.LJFF;
                if (view5 != null) {
                    tuxTextView2 = (TuxTextView) view5.findViewById(R.id.rs_);
                } else {
                    tuxTextView2 = null;
                }
                this.LJIIIZ = tuxTextView2;
                View view6 = this.LJFF;
                if (view6 != null) {
                    tuxTextView3 = (TuxTextView) view6.findViewById(R.id.rqs);
                } else {
                    tuxTextView3 = null;
                }
                this.LJIIJ = tuxTextView3;
                View view7 = this.LJFF;
                if (view7 != null) {
                    view7.findViewById(R.id.rs8);
                }
                View view8 = this.LJFF;
                if (view8 != null) {
                    frameLayout = (FrameLayout) view8.findViewById(R.id.rs9);
                } else {
                    frameLayout = null;
                }
                this.LJIIJJI = frameLayout;
                View view9 = this.LJFF;
                if (view9 != null) {
                    viewFindViewById = view9.findViewById(R.id.rq3);
                } else {
                    viewFindViewById = null;
                }
                this.LJIIL = viewFindViewById;
            }
            this.LJIILLIIL = c0oop;
            if (this.LJ) {
                View view10 = this.LJFF;
                if (view10 != null) {
                    C0DTR.LIZIZ(view10);
                    return;
                }
                return;
            }
            C21568919b5 c21568919b52 = this.LJI;
            if (c21568919b52 != null && (c0ova = this.LJIILIIL) != null && (c0ov6 = c0ova.LIZ) != null) {
                c21568919b52.setRoundingParams(c0ov6);
            }
            View view11 = this.LJFF;
            if (view11 != null) {
                C12ES.LJIILL(0, view11);
            }
            if (!this.LJIIZILJ || !Intrinsics.LJFF(str, this.LJIILJJIL)) {
                this.LJIILJJIL = str;
                AnonymousClass0956 anonymousClass0956 = this.LJIILL;
                if (anonymousClass0956 != null) {
                    anonymousClass0956.LIZIZ(null);
                }
                this.LJIIZILJ = true;
                FrameLayout frameLayout2 = this.LJIIJJI;
                if (frameLayout2 != null) {
                    C12ES.LJIILL(0, frameLayout2);
                }
                SmartImageView smartImageView2 = this.LJII;
                if (smartImageView2 != null) {
                    C12ES.LJIILL(4, smartImageView2);
                }
                TuxTextView tuxTextView4 = this.LJIIIIZZ;
                if (tuxTextView4 != null) {
                    C12ES.LJIILL(4, tuxTextView4);
                }
                TuxTextView tuxTextView5 = this.LJIIIZ;
                if (tuxTextView5 != null) {
                    C12ES.LJIILL(4, tuxTextView5);
                }
                View view12 = this.LJIIL;
                if (view12 != null) {
                    C12ES.LJIILL(4, view12);
                }
                TuxTextView tuxTextView6 = this.LJIIJ;
                if (tuxTextView6 != null) {
                    C12ES.LJIILL(4, tuxTextView6);
                }
                this.LJIILL = C23250099c.LIZLLL(this.LIZLLL, C0PEM.LIZJ, null, new C0OT5(str, this, null), 2);
                return;
            }
            return;
        }
        LJFF();
    }

    public C619630OSb(ViewStub viewStub, BulletinListViewModel bulletinListViewModel, BulletinInteractionAbility bulletinInteractionAbility, BulletinCommonAbility bulletinCommonAbility, InterfaceC497601wk interfaceC497601wk) {
        boolean zV20;
        this.LIZ = viewStub;
        this.LIZIZ = bulletinListViewModel;
        this.LIZJ = bulletinCommonAbility;
        this.LIZLLL = interfaceC497601wk;
        if (bulletinInteractionAbility != null) {
            zV20 = bulletinInteractionAbility.v20();
        } else {
            zV20 = false;
        }
        this.LJ = zV20;
    }
}
