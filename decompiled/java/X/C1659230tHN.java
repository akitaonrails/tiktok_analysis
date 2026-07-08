package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import iyl.i3;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS604S0100000_25;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tHN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public class C1659230tHN extends C1659140tHE implements InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLFF;
    public final LifecycleOwner LLJJLIIIJLLLLLLLZ;
    public final C1DRG LLJL;
    public final int LLJLIL;
    public final int LLJLILLLLZIIL;
    public final int LLJLL;
    public final boolean LLJLLIL;
    public final C1664750tQH LLJLLL;
    public final C1664750tQH LLJZ;
    public final C1664740tQG LLJZIJLIL;
    public final C1659270tHR LLL;
    public ViewStub LLLF;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1659230tHN.class, "editToolbarApi", "getEditToolbarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/EditToolbarApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1659230tHN.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1659230tHN.class, "imageVideoSeparateModeSwitchApi", "getImageVideoSeparateModeSwitchApi()Lcom/ss/android/ugc/aweme/image/switchmode/ImageVideoSeparateModeSwitchApi;", 0);
        c09r3.getClass();
        LLLFF = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    @Override // X.C1659140tHE, X.AbstractC1659350tHZ
    public final int LJIIIIZZ() {
        return R.layout.d7a;
    }

    @Override // X.C1659140tHE
    public final void LJIIL() {
        LJJIFFI(new C2217381BqS() { // from class: X.0tFv
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((i3) obj).LLJJJJJIL);
            }
        }, Lifecycle.State.STARTED, new AwS604S0100000_25(this, 350));
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLJL;
    }

    @Override // X.C1659140tHE, X.InterfaceC1657880tFC
    public void LIZJ(i3 i3Var) {
        C0FJM c0fjm;
        View viewFindViewById;
        if (i3Var.LLILLL.getType() == 25 || (((Number) C0BWD.LIZ.getValue()).intValue() > 0 && i3Var.LLILLL.getType() == 1200)) {
            ViewStub viewStub = this.LLLF;
            C0FJM c0fjm2 = null;
            if (viewStub == null) {
                viewStub = null;
            }
            if (viewStub.getParent() instanceof ViewGroup) {
                ViewStub viewStub2 = this.LLLF;
                if (viewStub2 == null) {
                    viewStub2 = null;
                }
                C786410Ut5.LJLLLL(viewStub2);
                View view = this.LLILZ;
                if (view != null) {
                    c0fjm2 = (C0FJM) view.findViewById(R.id.tzs);
                }
                this.LLJIJIL = c0fjm2;
                if (C295280Bhm.LIZ() && (c0fjm = this.LLJIJIL) != null) {
                    c0fjm.setBackgroundResource(R.drawable.a9g);
                }
            }
        }
        if (Intrinsics.LJFF(i3Var.LLJLIL, "send_dm") && (viewFindViewById = LJJI().findViewById(R.id.y7l)) != null) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById);
        }
        super.LIZJ(i3Var);
        int type = i3Var.LLILLL.getType();
        if (type != 20) {
            if (type != 1200) {
                if (type != 1300) {
                    if (type == 1900) {
                        C578350MmH c578350MmH = C578350MmH.LIZ;
                        C1664750tQH c1664750tQH = this.LLJZ;
                        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLFF;
                        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) c1664750tQH.getValue(this, interfaceC2217461BqaArr[1]);
                        c578350MmH.getClass();
                        C578350MmH.LIZIZ(videoPublishEditModel);
                        C0CH2.LIZ(this.LLJJLIIIJLLLLLLLZ, (VideoPublishEditModel) this.LLJZ.getValue(this, interfaceC2217461BqaArr[1]), new AwS569S0100000_25(this, 510));
                        return;
                    }
                    return;
                }
                C0EMB.LIZJ((VideoPublishEditModel) this.LLJZ.getValue(this, LLLFF[1]), "video_edit_page");
                return;
            }
            ((InterfaceC1460000o62) this.LLJLLL.getValue(this, LLLFF[0])).Yq2();
            return;
        }
        this.LLL.LIZ((InterfaceC1460000o62) this.LLJLLL.getValue(this, LLLFF[0]));
    }

    @Override // X.C1659140tHE, X.AbstractC1659350tHZ
    public void LJIIJJI(View view) {
        super.LJIIJJI(view);
        ViewStub viewStub = (ViewStub) view.findViewById(R.id.view_stub_progress);
        this.LLLF = viewStub;
        if (viewStub == null) {
            viewStub = null;
        }
        LJJIIZ(viewStub, Integer.valueOf(this.LLJLILLLLZIIL), Integer.valueOf(this.LLJLILLLLZIIL));
        LJJIIZ(view.findViewById(R.id.y74), Integer.valueOf(this.LLJLILLLLZIIL), Integer.valueOf(this.LLJLILLLLZIIL));
        LJJIIZ(view.findViewById(R.id.y7h), Integer.valueOf(this.LLJLILLLLZIIL), Integer.valueOf(this.LLJLILLLLZIIL));
        if (this.LLJLLIL) {
            view.setPadding(0, 0, 0, 0);
            LJJIIZ(view.findViewById(R.id.cw5), -2, -2);
            LJJIIZ(view.findViewById(R.id.cw3), -2, -2);
        } else {
            C369030EdR.LIZJ(view, 0, 0, this.LLJLL, 0);
            LJJIIZ(view.findViewById(R.id.cw5), Integer.valueOf(this.LLJLIL), null);
            view.findViewById(R.id.y7l).setMinimumWidth(this.LLJLIL);
        }
        LJJ().setMaxWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(51)));
        LJJ().getLayoutParams().height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
    }

    @Override // X.AbstractC1659350tHZ, X.InterfaceC1657880tFC
    public final View LIZIZ(int i, ViewGroup viewGroup) {
        View viewLIZIZ = super.LIZIZ(i, viewGroup);
        if (this.LLJLLIL) {
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            layoutParams.width = -2;
            layoutParams.height = -2;
        }
        return viewLIZIZ;
    }

    public static final void LJJIIZ(View view, Integer num, Integer num2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (num != null) {
            layoutParams.width = num.intValue();
        }
        if (num2 != null) {
            layoutParams.height = num2.intValue();
        }
        C786410Ut5.W5(view, layoutParams);
    }

    public C1659230tHN(LifecycleOwner lifecycleOwner, C1DRG c1drg, int i, int i2, int i3, boolean z) {
        final AwS569S0100000_25 awS569S0100000_25 = new AwS569S0100000_25(c1drg, 509);
        super(lifecycleOwner, null, new InterfaceC1659200tHK(awS569S0100000_25) { // from class: X.0tHz
            public final Function0<InterfaceC1460000o62> LIZ;

            @Override // X.InterfaceC1659200tHK
            public final void LIZIZ(C1654400t9a c1654400t9a, boolean z2, i3 i3Var) {
            }

            {
                this.LIZ = awS569S0100000_25;
            }

            @Override // X.InterfaceC1659200tHK
            public final boolean LIZJ(C1654400t9a c1654400t9a, i3 i3Var) {
                if (i3Var.LLILLL == C1EOF.AUTO_ENHANCE) {
                    return C1662060tLw.LIZ(300L, c1654400t9a.LIZ);
                }
                if (C1662060tLw.LIZJ(1000L, C1662060tLw.LIZIZ, "PhotoEditToolbarListViewAdapter")) {
                    return true;
                }
                if (i3Var.LLILLL == C1EOF.SAVE_LOCAL) {
                    if (C1662060tLw.LIZ(300L, c1654400t9a.LIZ)) {
                        return true;
                    }
                    return false;
                }
                if (C1662060tLw.LIZIZ(c1654400t9a.LIZ)) {
                    return true;
                }
                return false;
            }

            @Override // X.InterfaceC1659200tHK
            public final void LIZ(C1654400t9a c1654400t9a, boolean z2, i3 i3Var) {
                this.LIZ.invoke().Ws(i3Var.LLILLL.getType());
            }
        });
        this.LLJJLIIIJLLLLLLLZ = lifecycleOwner;
        this.LLJL = c1drg;
        this.LLJLIL = i;
        this.LLJLILLLLZIIL = i2;
        this.LLJLL = i3;
        this.LLJLLIL = z;
        this.LLJLLL = C1664770tQJ.LIZ(c1drg, InterfaceC1460000o62.class, null);
        this.LLJZ = C1664770tQJ.LIZ(c1drg, VideoPublishEditModel.class, null);
        this.LLJZIJLIL = C1664770tQJ.LIZIZ(c1drg, InterfaceC578500MmW.class, null);
        this.LLL = new C1659270tHR();
    }
}
