package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import iyl.i3;
import java.util.List;
import kotlin.jvm.internal.AwS569S0100000_25;

/* JADX INFO: renamed from: X.0tHM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1659220tHM extends C1659140tHE implements InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLLIL;
    public final C1DRG LLJJLIIIJLLLLLLLZ;
    public final C1664750tQH LLJL;
    public final C1664750tQH LLJLIL;
    public final C1659270tHR LLJLILLLLZIIL;
    public ViewStub LLJLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1659220tHM.class, "editToolbarApi", "getEditToolbarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/EditToolbarApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1659220tHM.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        c09r3.getClass();
        LLJLLIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    @Override // X.C1659140tHE, X.InterfaceC1657880tFC
    public final void LIZJ(i3 i3Var) {
        C0FJM c0fjm;
        C0FJM c0fjm2;
        if (i3Var.LLILLL.getType() == 25 || (((Number) C0BWD.LIZ.getValue()).intValue() > 0 && i3Var.LLILLL.getType() == 1200)) {
            if (this.LLJIJIL != null) {
                if (C295280Bhm.LIZ() && (c0fjm2 = this.LLJIJIL) != null) {
                    c0fjm2.setBackgroundResource(R.drawable.a9g);
                }
            } else {
                ViewStub viewStub = this.LLJLL;
                C0FJM c0fjm3 = null;
                if (viewStub == null) {
                    viewStub = null;
                }
                if (viewStub.getParent() instanceof ViewGroup) {
                    ViewStub viewStub2 = this.LLJLL;
                    if (viewStub2 == null) {
                        viewStub2 = null;
                    }
                    C786410Ut5.LJLLLL(viewStub2);
                    View view = this.LLILZ;
                    if (view != null) {
                        c0fjm3 = (C0FJM) view.findViewById(R.id.tzs);
                    }
                    this.LLJIJIL = c0fjm3;
                    if (C295280Bhm.LIZ() && (c0fjm = this.LLJIJIL) != null) {
                        c0fjm.setBackgroundResource(R.drawable.a9g);
                    }
                }
            }
        }
        super.LIZJ(i3Var);
        int type = i3Var.LLILLL.getType();
        if (type != 20) {
            if (type != 1200) {
                if (type != 1300) {
                    if (type != 8000 && type != 8001) {
                        return;
                    }
                    C0EAE c0eae = C0EAE.LIZ;
                    VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) this.LLJLIL.getValue(this, LLJLLIL[1]);
                    c0eae.getClass();
                    C0EAE.LJIIL(videoPublishEditModel, false);
                    return;
                }
                C0EMB.LIZJ((VideoPublishEditModel) this.LLJLIL.getValue(this, LLJLLIL[1]), "video_edit_page");
                return;
            }
            ((InterfaceC1460000o62) this.LLJL.getValue(this, LLJLLIL[0])).Yq2();
            return;
        }
        if (!i3Var.LLJ) {
            return;
        }
        this.LLJLILLLLZIIL.LIZ((InterfaceC1460000o62) this.LLJL.getValue(this, LLJLLIL[0]));
    }

    @Override // X.C1659140tHE, X.AbstractC1659350tHZ
    public final void LJIIJJI(View view) {
        super.LJIIJJI(view);
        ViewStub viewStub = (ViewStub) view.findViewById(R.id.view_stub_progress);
        if (viewStub != null) {
            this.LLJLL = viewStub;
        } else {
            this.LLJIJIL = (C0FJM) view.findViewById(R.id.tzs);
        }
    }

    public C1659220tHM(LifecycleOwner lifecycleOwner, C1DRG c1drg, List<View> list) {
        super(lifecycleOwner, list, new C1659620tI0(new AwS569S0100000_25(c1drg, 508)));
        this.LLJJLIIIJLLLLLLLZ = c1drg;
        this.LLJL = C1664770tQJ.LIZ(c1drg, InterfaceC1460000o62.class, null);
        this.LLJLIL = C1664770tQJ.LIZ(c1drg, VideoPublishEditModel.class, null);
        this.LLJLILLLLZIIL = new C1659270tHR();
    }
}
