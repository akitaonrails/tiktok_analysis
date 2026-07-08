package X;

import Y.ATListenerS457S0100000_25;
import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.mediaselector.aicontentprotocol.AlbumAiContentService;
import com.zhiliaoapp.musically.R;
import iyl.i3;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS604S0100000_25;

/* JADX INFO: renamed from: X.0tHm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1659480tHm extends C1659140tHE implements InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLFZ;
    public final C1DRG LLJJLIIIJLLLLLLLZ;
    public final C1664750tQH LLJL;
    public final C1664750tQH LLJLIL;
    public final C1664750tQH LLJLILLLLZIIL;
    public ViewStub LLJLL;
    public FrameLayout LLJLLIL;
    public C416490GUt LLJLLL;
    public C19713012Au LLJZ;
    public View LLJZIJLIL;
    public View LLL;
    public EnumC1462540oA8 LLLF;
    public boolean LLLFF;
    public final C01GW LLLFFI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1659480tHm.class, "editToolbarApi", "getEditToolbarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/EditToolbarApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1659480tHm.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1659480tHm.class, "aILivePhotoApi", "getAILivePhotoApi()Lcom/ss/android/ugc/gamora/editor/ailive/AILivePhotoApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C1659480tHm.class, "activity", "getActivity()Landroidx/fragment/app/FragmentActivity;", 0);
        c09r3.getClass();
        LLLFZ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4};
    }

    @Override // X.C1659140tHE, X.InterfaceC1657880tFC
    public final C1654400t9a LIZLLL() {
        View viewLJJI = LJJI();
        SmartImageView smartImageViewLJIJI = LJIJI();
        FrameLayout frameLayout = this.LLJILJIL;
        if (frameLayout != null) {
            return new C1654400t9a(viewLJJI, smartImageViewLJIJI, frameLayout, LJIJJ(), LJJ(), this.LLJLLIL);
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // X.C1659140tHE
    public final void LJIIL() {
        LJJIFFI(new C2217381BqS() { // from class: X.0tHH
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((i3) obj).LLJIJIL);
            }
        }, Lifecycle.State.CREATED, new AwS604S0100000_25(this, 822));
    }

    public final VideoPublishEditModel LJJIIZ() {
        return (VideoPublishEditModel) this.LLJLIL.getValue(this, LLLFZ[1]);
    }

    public final void LJJIIZI() {
        View view = this.LLJZIJLIL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        this.LLJZIJLIL = null;
        if (this.LLJJJJ.LIZ.LLJJIJI == EnumC1462540oA8.DEFAULT) {
            LJJIJIIJIL();
        }
        i3 i3Var = this.LLJJJJ.LIZ;
        C786410Ut5.LLLLZLL(LJJ(), i3Var.LLJIJIL ? 0 : 8);
        C786410Ut5.B5(LJJ(), i3Var.LLIZLLLIL ? 1.0f : 0.5f);
    }

    public final void LJJIJ() {
        Animator animator;
        if (this.LLJZIJLIL == null) {
            return;
        }
        Object tag = LJJ().getTag();
        if ((tag instanceof Animator) && (animator = (Animator) tag) != null) {
            animator.cancel();
        }
        C786410Ut5.LLLLZLL(LJJ(), 8);
    }

    @Override // X.C1659140tHE, X.AbstractC1659350tHZ, X.InterfaceC1657880tFC
    public final void LJ() {
        super.LJ();
        C416490GUt c416490GUt = this.LLJLLL;
        if (c416490GUt != null) {
            c416490GUt.clearAnimation();
        }
        C19713012Au c19713012Au = this.LLJZ;
        if (c19713012Au != null) {
            c19713012Au.clearAnimation();
        }
    }

    public final void LJJIJIIJIL() {
        if (C0MDL.LIZ()) {
            if (this.LLJZIJLIL != null) {
                LJJ().setText("");
            } else {
                LJJ().setText(2131820718);
            }
            if (this.LLJZIJLIL != null) {
                SmartImageView smartImageViewLJIJI = LJIJI();
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = R.raw.icon_live_photo_ai;
                c419910GdJ.LJ = Integer.valueOf(R.attr.a1t);
                c419910GdJ.LIZIZ = this.LLJJJ - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
                c419910GdJ.LIZJ = this.LLJJJ - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
                smartImageViewLJIJI.setImageDrawable(c419910GdJ.LIZ(LJIJI().getContext()));
                int iLIZIZ = this.LLJJIJIIJIL + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
                C426750GoL.LJIIL(LJIJI(), Integer.valueOf(iLIZIZ), Integer.valueOf(iLIZIZ), Integer.valueOf(iLIZIZ), Integer.valueOf(iLIZIZ), 16);
                LJJIJIIJI(false);
                return;
            }
            if (this.LLL == null || C0C64.LJIILLIIL().LJIIIZ(31744, "studio_ai_alive_icon_default_white", true, false)) {
                SmartImageView smartImageViewLJIJI2 = LJIJI();
                C419910GdJ c419910GdJ2 = new C419910GdJ();
                c419910GdJ2.LIZ = R.raw.icon_color_live_photo_ai;
                int i = this.LLJJJ;
                c419910GdJ2.LIZIZ = i;
                c419910GdJ2.LIZJ = i;
                smartImageViewLJIJI2.setImageDrawable(c419910GdJ2.LIZ(LJIJI().getContext()));
                C426750GoL.LJIIL(LJIJI(), Integer.valueOf(this.LLJJIJIIJIL), Integer.valueOf(this.LLJJIJIIJIL), Integer.valueOf(this.LLJJIJIIJIL), Integer.valueOf(this.LLJJIJIIJIL), 16);
                LJJIJIIJI(false);
                return;
            }
            SmartImageView smartImageViewLJIJI3 = LJIJI();
            C419910GdJ c419910GdJ3 = new C419910GdJ();
            c419910GdJ3.LIZ = R.raw.icon_color_live_photo_gradient;
            int i2 = this.LLJJJ;
            c419910GdJ3.LIZIZ = i2;
            c419910GdJ3.LIZJ = i2;
            smartImageViewLJIJI3.setImageDrawable(c419910GdJ3.LIZ(LJIJI().getContext()));
            C426750GoL.LJIIL(LJIJI(), Integer.valueOf(this.LLJJIJIIJIL), Integer.valueOf(this.LLJJIJIIJIL), Integer.valueOf(this.LLJJIJIIJIL), Integer.valueOf(this.LLJJIJIIJIL), 16);
            LJJIJIIJI(true);
        }
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    @Override // X.C1659140tHE, X.InterfaceC1657880tFC
    public final void LIZJ(i3 i3Var) {
        ViewParent parent;
        boolean z;
        FrameLayout frameLayout;
        View viewFindViewById;
        C416490GUt c416490GUt;
        ViewGroup viewGroup;
        super.LIZJ(i3Var);
        if (i3Var.LLILLL.getType() == 1800) {
            ViewStub viewStub = this.LLJLL;
            if (viewStub != null) {
                parent = viewStub.getParent();
            } else {
                parent = null;
            }
            if (parent instanceof ViewGroup) {
                ViewStub viewStub2 = this.LLJLL;
                if (viewStub2 != null) {
                    C786410Ut5.LJLLLL(viewStub2);
                }
                View view = this.LLILZ;
                if (view != null) {
                    frameLayout = (FrameLayout) view.findViewById(R.id.aov);
                } else {
                    frameLayout = null;
                }
                this.LLJLLIL = frameLayout;
                View view2 = this.LLILZ;
                if (view2 != null) {
                    viewFindViewById = view2.findViewById(R.id.aoo);
                } else {
                    viewFindViewById = null;
                }
                this.LLL = viewFindViewById;
                if (!C0MDL.LIZ()) {
                    LJJIJIIJI(false);
                    this.LLL = null;
                }
                View view3 = this.LLILZ;
                if (view3 != null) {
                    c416490GUt = (C416490GUt) view3.findViewById(R.id.s_4);
                } else {
                    c416490GUt = null;
                }
                this.LLJLLL = c416490GUt;
                if (this.LLJZ == null) {
                    this.LLJZ = new C19713012Au(LJIJI(), this.LLJLLIL, LJIJI().getContext());
                }
                C19713012Au c19713012Au = this.LLJZ;
                if (c19713012Au == null || c19713012Au.getParent() == null) {
                    View viewLJJI = LJJI();
                    if ((viewLJJI instanceof ViewGroup) && (viewGroup = (ViewGroup) viewLJJI) != null) {
                        viewGroup.addView(this.LLJZ, 0);
                    }
                    LJJI().setOnTouchListener(new ATListenerS457S0100000_25(this, 7));
                }
            }
            if (i3Var.LLJJIJI == EnumC1462540oA8.PROGRESS) {
                z = true;
            } else {
                z = false;
            }
            this.LLLFF = z;
            LJJIJIL(i3Var.LLJJIJIIJIL);
            LJJIJLIJ(i3Var.LLJJIJI, i3Var.LLJJIJIIJIL, true);
            C1659310tHV c1659310tHV = new C2217381BqS() { // from class: X.0tHV
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((i3) obj).LLJJIJI;
                }
            };
            Lifecycle.State state = Lifecycle.State.CREATED;
            LJJIFFI(c1659310tHV, state, new AwS604S0100000_25(this, 826));
            LJJIFFI(new C2217381BqS() { // from class: X.0tHp
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((i3) obj).LLJJIJIIJIL;
                }
            }, state, new AwS604S0100000_25(this, 827));
            LJJIFFI(new C2217381BqS() { // from class: X.0tHo
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Boolean.valueOf(((i3) obj).LLJJIJIL);
                }
            }, state, new AwS604S0100000_25(this, 828));
            LJJIFFI(new C2217381BqS() { // from class: X.0tHq
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((i3) obj).LLJL;
                }
            }, state, new AwS604S0100000_25(this, 829));
            LJJIFFI(new C2217381BqS() { // from class: X.0tFR
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((i3) obj).LLJJJ;
                }
            }, state, new AwS604S0100000_25(this, 823));
            LJJIFFI(new C2217381BqS() { // from class: X.0tHT
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Boolean.valueOf(((i3) obj).LLJJJJ);
                }
            }, state, new AwS604S0100000_25(this, 824));
            LJJIFFI(new C2217381BqS() { // from class: X.0tHl
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Boolean.valueOf(((i3) obj).LLIZLLLIL);
                }
            }, state, new AwS604S0100000_25(this, 825));
            if (!(!C0MDL.LJ(LJJIIZ()))) {
                LJJIIZI();
            }
            if (!C1428470nHB.LLILLIZIL(LJJIIZ()) && !C1428470nHB.LLILL(LJJIIZ())) {
                C564410MBr c564410MBr = C564410MBr.LIZ;
                VideoPublishEditModel videoPublishEditModelLJJIIZ = LJJIIZ();
                c564410MBr.getClass();
                C564410MBr.LJIIIZ(videoPublishEditModelLJJIIZ);
            }
            if (LJJIIZ().getAILivePhotoModel().LJI()) {
                C564410MBr.LJIILJJIL(C564410MBr.LIZ, LJJIIZ(), false, false, 4);
                String taskId = LJJIIZ().getAILivePhotoModel().getTaskId();
                if (taskId != null) {
                    AlbumAiContentService.LIZ.getClass();
                    AlbumAiContentService albumAiContentServiceLIZ = C523440Kfu.LIZ();
                    if (albumAiContentServiceLIZ != null) {
                        albumAiContentServiceLIZ.LIZ(taskId, null);
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005f  */
    @Override // X.C1659140tHE, X.AbstractC1659350tHZ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJJI(android.view.View r14) {
        /*
            Method dump skipped, instruction units count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1659480tHm.LJIIJJI(android.view.View):void");
    }

    @Override // X.C1659140tHE
    public final void LJIILIIL(int i) {
        if (this.LLJZIJLIL != null) {
            return;
        }
        if (C290620BaG.LIZ() && LJJIIZ().getAILivePhotoModel().shootGuideType == 2) {
            return;
        }
        super.LJIILIIL(i);
    }

    public final void LJJIJIIJI(boolean z) {
        View view;
        if (z) {
            if (this.LLJJJJ.LIZ.LLJJIJI == EnumC1462540oA8.DEFAULT && this.LLJZIJLIL == null && (view = this.LLL) != null) {
                C786410Ut5.LJLLLLLL(0, view);
                return;
            }
            return;
        }
        View view2 = this.LLL;
        if (view2 == null) {
            return;
        }
        C786410Ut5.LJLLLLLL(8, view2);
    }

    public final void LJJIJIL(C1659490tHn c1659490tHn) {
        int iIntValue;
        Long l;
        if (c1659490tHn == null) {
            return;
        }
        Integer num = c1659490tHn.LIZ;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        C416490GUt c416490GUt = this.LLJLLL;
        if (c416490GUt != null) {
            c416490GUt.setProgress(iIntValue);
        }
        Integer num2 = c1659490tHn.LIZ;
        if ((num2 == null || num2.intValue() != 100) && (l = c1659490tHn.LIZJ) != null) {
            long jLongValue = l.longValue();
            C19713012Au c19713012Au = this.LLJZ;
            if (c19713012Au != null) {
                c19713012Au.LLLLLILLIL(jLongValue);
            }
            C19713012Au c19713012Au2 = this.LLJZ;
            if (c19713012Au2 != null) {
                String str = c1659490tHn.LIZIZ;
                if (str == null) {
                    str = "";
                }
                c19713012Au2.setDesc(str);
                return;
            }
            return;
        }
        C19713012Au c19713012Au3 = this.LLJZ;
        if (c19713012Au3 == null) {
            return;
        }
        c19713012Au3.l0();
    }

    public C1659480tHm(LifecycleOwner lifecycleOwner, C1DRG c1drg) {
        super(lifecycleOwner, null, new C1659620tI0(new AwS569S0100000_25(c1drg, 1081)));
        this.LLJJLIIIJLLLLLLLZ = c1drg;
        this.LLJL = C1664770tQJ.LIZ(c1drg, InterfaceC1460000o62.class, null);
        this.LLJLIL = C1664770tQJ.LIZ(c1drg, VideoPublishEditModel.class, null);
        C1664770tQJ.LIZIZ(c1drg, InterfaceC1455680nz4.class, null);
        this.LLJLILLLLZIIL = C1664770tQJ.LIZ(c1drg, C19EG.class, null);
        this.LLLFFI = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(552));
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIJLIJ(X.EnumC1462540oA8 r8, X.C1659490tHn r9, boolean r10) {
        /*
            Method dump skipped, instruction units count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1659480tHm.LJJIJLIJ(X.0oA8, X.0tHn, boolean):void");
    }
}
