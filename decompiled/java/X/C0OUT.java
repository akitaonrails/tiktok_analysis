package X;

import Y.ACListenerS144S0100000_9;
import Y.AObjectS352S0100000_9;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinHybridAbility;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinCardInfo;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinHybridCardConfigStruct;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: renamed from: X.0OUT, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OUT implements C0OT0, InterfaceC619690OSh {
    public static final /* synthetic */ int LJIILLIIL = 0;
    public final BulletinHybridAbility LIZ;
    public final BulletinProfileViewModel LIZIZ;
    public final C0OTY LIZJ;
    public final boolean LIZLLL;
    public final View LJ;
    public final C0OUU LJFF;
    public C1537720q7O LJI;
    public String LJII;
    public C0OOV LJIIIIZZ;
    public C679540Ql6 LJIIIZ;
    public Map<String, Object> LJIIJ;
    public BulletinHybridCardConfigStruct LJIIJJI;
    public long LJIIL;
    public boolean LJIILIIL;
    public final C0OUW LJIILJJIL;
    public final AObjectS352S0100000_9 LJIILL;

    @Override // X.InterfaceC619690OSh
    public final void LJIIJ() {
        this.LJIILIIL = true;
        this.LJII = null;
        this.LJIIJJI = null;
        this.LJIIIZ = null;
        this.LJIIJ = null;
        this.LJIIIIZZ = null;
        this.LJFF.LIZIZ();
        BulletinHybridAbility bulletinHybridAbility = this.LIZ;
        if (bulletinHybridAbility != null) {
            bulletinHybridAbility.Aw1(this.LJI);
        }
        this.LJI = null;
    }

    @Override // X.C0OT0
    public final View LJIJI() {
        throw null;
    }

    public final void LJIILL() {
        C1537720q7O c1537720q7O = this.LJI;
        if (c1537720q7O != null && c1537720q7O.LLJJ == EnumC1538460q8a.FAIL) {
            C0OOV c0oov = this.LJIIIIZZ;
            if (c0oov != null) {
                this.LIZJ.LIZ(c0oov, false);
            }
            C786410Ut5.m2(c1537720q7O, 8);
            LJIIZILJ();
        }
    }

    public final void LJIIZILJ() {
        BulletinCardInfo bulletinCardInfo;
        BulletinHybridCardConfigStruct bulletinHybridCardConfigStruct;
        ViewGroup viewGroup;
        C0OOV c0oov = this.LJIIIIZZ;
        if (c0oov == null || (bulletinCardInfo = c0oov.LLJJL) == null || (bulletinHybridCardConfigStruct = bulletinCardInfo.hybridConfigInfo) == null) {
            return;
        }
        C0OUU c0ouu = this.LJFF;
        int iLIZIZ = C0OTD.LIZIZ(bulletinHybridCardConfigStruct);
        int iLIZ = C0OTD.LIZ(bulletinHybridCardConfigStruct);
        AwS553S0100000_9 awS553S0100000_9 = new AwS553S0100000_9(this, 1727);
        HandlerHook.viewRemoveCallbacks(c0ouu.LIZ, c0ouu.LJFF);
        C1390410mHn c1390410mHn = c0ouu.LIZJ;
        if (c1390410mHn != null) {
            c1390410mHn.LIZLLL();
        }
        FrameLayout frameLayoutLIZ = c0ouu.LIZ(iLIZIZ, iLIZ);
        C1390410mHn c1390410mHn2 = c0ouu.LIZJ;
        if (c1390410mHn2 != null && c1390410mHn2.getParent() == frameLayoutLIZ) {
            C786410Ut5.LJJJZ(c1390410mHn2, frameLayoutLIZ);
        }
        View view = c0ouu.LIZLLL;
        View view2 = view;
        if (view == null) {
            Context context = c0ouu.LIZ.getContext();
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            linearLayout.setGravity(1);
            TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6, null);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(76)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56)));
            layoutParams.gravity = 1;
            C786410Ut5.M6(tuxIconView, layoutParams);
            tuxIconView.setImportantForAccessibility(2);
            C0HTI c0hti = new C0HTI();
            c0hti.LIZ = R.drawable.nj;
            tuxIconView.setImageDrawable(c0hti.LIZ(context));
            linearLayout.addView(tuxIconView);
            TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams2.gravity = 1;
            layoutParams2.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
            C786410Ut5.R6(tuxTextView, layoutParams2);
            tuxTextView.setTuxFont(61);
            tuxTextView.setText(2131828143);
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1j, context);
            if (numLIZJ != null) {
                tuxTextView.setTextColor(numLIZJ.intValue());
            }
            linearLayout.addView(tuxTextView);
            C197039127h c197039127h = new C197039127h(context, null, 6, 0);
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams3.gravity = 1;
            layoutParams3.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            C786410Ut5.J6(c197039127h, layoutParams3);
            c197039127h.setText(2131828142);
            linearLayout.addView(c197039127h);
            c0ouu.LIZLLL = linearLayout;
            c0ouu.LJ = c197039127h;
            view2 = linearLayout;
        }
        if (view2.getParent() != frameLayoutLIZ) {
            ViewParent parent = view2.getParent();
            if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                C786410Ut5.LJJJLZIJ(view2, viewGroup);
            }
            frameLayoutLIZ.addView(view2, new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(220)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(173)), 17));
        }
        C786410Ut5.LJLLLLLL(0, view2);
        C197039127h c197039127h2 = c0ouu.LJ;
        if (c197039127h2 != null) {
            c197039127h2.setEnabled(true);
        }
        C197039127h c197039127h3 = c0ouu.LJ;
        if (c197039127h3 != null) {
            C786410Ut5.U8(c197039127h3, new ACListenerS144S0100000_9(awS553S0100000_9, 111));
        }
    }

    @Override // X.InterfaceC619690OSh
    public final C1537720q7O LIZLLL() {
        return this.LJI;
    }

    @Override // X.InterfaceC619690OSh
    public final View getContentContainer() {
        return this.LJ;
    }

    @Override // X.InterfaceC619690OSh
    public final void LJFF(Map<String, Object> map) {
        C1537720q7O c1537720q7O = this.LJI;
        if (c1537720q7O != null) {
            c1537720q7O.updateGlobalProps(map);
        }
    }

    @Override // X.InterfaceC619690OSh
    public final void LJI(C0OOV c0oov) {
        BulletinCardInfo bulletinCardInfo = c0oov.LLJJL;
        if (bulletinCardInfo != null && bulletinCardInfo.hybridCardUIInfo != null) {
            c0oov.LLJLL = null;
            C679540Ql6 c679540Ql6LLIIJI = c0oov.LLIIJI();
            LJIILLIIL(c679540Ql6LLIIJI, c0oov);
            this.LJIIIZ = c679540Ql6LLIIJI;
            C1537720q7O c1537720q7O = this.LJI;
            if (c1537720q7O != null) {
                c1537720q7O.updateData(c679540Ql6LLIIJI.LJIIL);
            }
        }
    }

    public final void LJIJ(BulletinHybridCardConfigStruct bulletinHybridCardConfigStruct) {
        ViewGroup viewGroup = (ViewGroup) this.LJ;
        if (viewGroup.getChildCount() > 0) {
            C786410Ut5.LJJJJI(viewGroup);
        }
        this.LJI = null;
        C0OUU c0ouu = this.LJFF;
        int iLIZIZ = C0OTD.LIZIZ(bulletinHybridCardConfigStruct);
        int iLIZ = C0OTD.LIZ(bulletinHybridCardConfigStruct);
        HandlerHook.viewRemoveCallbacks(c0ouu.LIZ, c0ouu.LJFF);
        c0ouu.LJI = iLIZIZ;
        c0ouu.LJII = iLIZ;
        HandlerHook.viewPostDelay(c0ouu.LIZ, c0ouu.LJFF, 500L);
    }

    @Override // X.InterfaceC619690OSh
    public final void LJIIL(C0OOV c0oov, long j) {
        BulletinHybridCardConfigStruct bulletinHybridCardConfigStruct;
        C1537720q7O c1537720q7OYs1;
        C1537720q7O c1537720q7OYs12;
        C0OOV c0oov2;
        BulletinCardInfo bulletinCardInfo = c0oov.LLJJL;
        if (bulletinCardInfo != null && (bulletinHybridCardConfigStruct = bulletinCardInfo.hybridConfigInfo) != null) {
            boolean z = false;
            this.LJIILIIL = false;
            this.LJIIIIZZ = c0oov;
            this.LJ.setMinimumHeight(C0OTD.LIZ(bulletinHybridCardConfigStruct));
            C679540Ql6 c679540Ql6LLIIJI = c0oov.LLIIJI();
            C1537720q7O c1537720q7O = this.LJI;
            if (c1537720q7O != null && c1537720q7O.getParent() == this.LJ) {
                z = true;
            }
            C1537720q7O c1537720q7O2 = this.LJI;
            EnumC1538460q8a enumC1538460q8a = null;
            if (c1537720q7O2 != null && z) {
                if (this.LJIIIZ == c679540Ql6LLIIJI) {
                    c1537720q7O2.LJJIL(Long.valueOf(j), "customInitTime");
                    this.LJFF.LIZIZ();
                    return;
                }
                LJIILLIIL(c679540Ql6LLIIJI, c0oov);
                BulletinHybridAbility bulletinHybridAbility = this.LIZ;
                if (bulletinHybridAbility != null && (c1537720q7OYs12 = bulletinHybridAbility.ys1(c679540Ql6LLIIJI, this.LJI)) != null && c1537720q7OYs12 != this.LJI) {
                    this.LJI = c1537720q7OYs12;
                    LJIILJJIL(c1537720q7OYs12, j);
                    C1537720q7O c1537720q7O3 = this.LJI;
                    if (c1537720q7O3 != null) {
                        enumC1538460q8a = c1537720q7O3.LLJJ;
                    }
                    if (enumC1538460q8a == EnumC1538460q8a.SUCCESS && (c0oov2 = this.LJIIIIZZ) != null) {
                        this.LIZJ.LIZ(c0oov2, true);
                    }
                    LJIILL();
                } else {
                    this.LJFF.LIZIZ();
                    C1537720q7O c1537720q7O4 = this.LJI;
                    if (c1537720q7O4 != null) {
                        c1537720q7O4.LJJIL(Long.valueOf(j), "customInitTime");
                    }
                    LJIILL();
                }
            } else {
                LJIILLIIL(c679540Ql6LLIIJI, c0oov);
                if (this.LIZLLL) {
                    this.LJ.setMinimumWidth(C0OTD.LIZIZ(bulletinHybridCardConfigStruct));
                    this.LJ.setMinimumHeight(C0OTD.LIZ(bulletinHybridCardConfigStruct));
                    BulletinHybridAbility bulletinHybridAbility2 = this.LIZ;
                    if (bulletinHybridAbility2 != null && (c1537720q7OYs1 = bulletinHybridAbility2.ys1(c679540Ql6LLIIJI, null)) != null) {
                        LJIILJJIL(c1537720q7OYs1, j);
                        if (c1537720q7OYs1.LLJJ == EnumC1538460q8a.SUCCESS && this.LJIIIIZZ != null) {
                            this.LIZJ.LIZ(c0oov, true);
                        }
                    } else {
                        String strValueOf = String.valueOf(c0oov.LLJI);
                        this.LJII = strValueOf;
                        this.LJIIJJI = bulletinHybridCardConfigStruct;
                        this.LJIIL = j;
                        LJIJ(bulletinHybridCardConfigStruct);
                        BulletinHybridAbility bulletinHybridAbility3 = this.LIZ;
                        if (bulletinHybridAbility3 != null) {
                            bulletinHybridAbility3.Sk1(c679540Ql6LLIIJI, new C0OUV(this, strValueOf));
                        }
                    }
                } else {
                    String strValueOf2 = String.valueOf(c0oov.LLJI);
                    this.LJII = strValueOf2;
                    this.LJIIJJI = bulletinHybridCardConfigStruct;
                    this.LJIIL = j;
                    LJIJ(bulletinHybridCardConfigStruct);
                    BulletinHybridAbility bulletinHybridAbility4 = this.LIZ;
                    if (bulletinHybridAbility4 != null) {
                        bulletinHybridAbility4.Sk1(c679540Ql6LLIIJI, new C0OUV(this, strValueOf2));
                    }
                }
            }
            this.LJIIIZ = c679540Ql6LLIIJI;
        }
    }

    public final void LJIILJJIL(C1537720q7O c1537720q7O, long j) {
        EnumC1538460q8a enumC1538460q8a;
        ViewParent parent;
        this.LJI = c1537720q7O;
        if (c1537720q7O != null && (parent = c1537720q7O.getParent()) != null && (parent instanceof ViewGroup)) {
            C786410Ut5.LJJJLZIJ(c1537720q7O, (ViewGroup) parent);
        }
        this.LJFF.LIZIZ();
        if (c1537720q7O != null) {
            enumC1538460q8a = c1537720q7O.LLJJ;
        } else {
            enumC1538460q8a = null;
        }
        if (enumC1538460q8a != EnumC1538460q8a.FAIL && c1537720q7O != null && c1537720q7O.getVisibility() != 0) {
            C786410Ut5.m2(c1537720q7O, 0);
        }
        ((ViewGroup) this.LJ).addView(c1537720q7O, new ViewGroup.LayoutParams(-2, -2));
        if (c1537720q7O != null) {
            c1537720q7O.LJJIL(Long.valueOf(j), "customInitTime");
        }
        LJIILL();
    }

    public final void LJIILLIIL(C679540Ql6 c679540Ql6, C0OOV c0oov) {
        c679540Ql6.LIZLLL = this.LJIILJJIL;
        c679540Ql6.LJJ = this.LJIILL;
        Map<String, ? extends Object> map = this.LJIIJ;
        if (map != null) {
            map.put("bulletin_item_id", String.valueOf(c0oov.LLJI));
            map.put("bulletin_subscribe_status", Integer.valueOf(this.LIZIZ.JQ2()));
            map.put("bulletin_quota", Long.valueOf(this.LIZIZ.getState().LLJJIJIL));
            map.put("bulletin_channel_status", Integer.valueOf(this.LIZIZ.EQ2()));
            c679540Ql6.LJIILL = map;
            return;
        }
        Map<String, ? extends Object> mapLJIIJ = C2097608Jq.LJIIJ(new Pair("bulletin_identity", Integer.valueOf(this.LIZIZ.HQ2())), new Pair("bulletin_item_id", String.valueOf(c0oov.LLJI)), new Pair("bulletin_subscribe_status", Integer.valueOf(this.LIZIZ.JQ2())), new Pair("bulletin_quota", Long.valueOf(this.LIZIZ.getState().LLJJIJIL)), new Pair("bulletin_channel_status", Integer.valueOf(this.LIZIZ.EQ2())), new Pair("bulletin_creator_id", this.LIZIZ.CQ2()));
        this.LJIIJ = mapLJIIJ;
        c679540Ql6.LJIILL = mapLJIIJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x006e  */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.0OUW] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0OUT(android.view.ViewStub r9, com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinHybridAbility r10, com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel r11, X.C0OTY r12, boolean r13) {
        /*
            r8 = this;
            r8.<init>()
            r8.LIZ = r10
            r8.LIZIZ = r11
            r8.LIZJ = r12
            r8.LIZLLL = r13
            boolean r0 = X.C0OS8.LJI()
            r7 = 0
            r6 = -2
            if (r0 == 0) goto L6e
            android.view.ViewParent r5 = r9.getParent()
            boolean r0 = r5 instanceof android.view.ViewGroup
            if (r0 == 0) goto L6e
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            if (r5 == 0) goto L6e
            int r4 = r5.indexOfChild(r9)
            android.view.ViewGroup$LayoutParams r3 = r9.getLayoutParams()
            X.C786410Ut5.LJJLJLI(r9, r5)
            X.0OZj r2 = new X.0OZj
            android.content.Context r1 = r9.getContext()
            r0 = 6
            r2.<init>(r1, r7, r0)
            r0 = 2131366073(0x7f0a10b9, float:1.835203E38)
            r2.setId(r0)
            r0 = 1
            r2.setClickable(r0)
            if (r3 == 0) goto L68
            r3.width = r6
            r3.height = r6
        L44:
            X.ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(r2)
            r2.setLayoutParams(r3)
            r5.addView(r2, r4)
        L4d:
            r8.LJ = r2
            X.0OUU r0 = new X.0OUU
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.<init>(r2)
            r8.LJFF = r0
            X.0OUW r0 = new X.0OUW
            r0.<init>()
            r8.LJIILJJIL = r0
            Y.AObjectS352S0100000_9 r1 = new Y.AObjectS352S0100000_9
            r0 = 3
            r1.<init>(r8, r0)
            r8.LJIILL = r1
            return
        L68:
            android.view.ViewGroup$LayoutParams r3 = new android.view.ViewGroup$LayoutParams
            r3.<init>(r6, r6)
            goto L44
        L6e:
            r0 = 2131559411(0x7f0d03f3, float:1.8744165E38)
            r9.setLayoutResource(r0)
            android.view.View r2 = X.C786410Ut5.LJLLLL(r9)
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            if (r0 == 0) goto L83
            r0.width = r6
            r0.height = r6
            r7 = r0
        L83:
            X.C786410Ut5.W5(r2, r7)
            goto L4d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0OUT.<init>(android.view.ViewStub, com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinHybridAbility, com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel, X.0OTY, boolean):void");
    }
}
