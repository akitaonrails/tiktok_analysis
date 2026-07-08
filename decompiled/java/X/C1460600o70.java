package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0o70, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1460600o70 implements InterfaceC1436400nTy {
    public final VideoPublishEditModel LL;
    public final int LLILLJJLI;
    public final InterfaceC1652140t5w LLILLL;
    public final View LLILZ;
    public final TextView LLILZIL;
    public final C0FJM LLILZLL;
    public final View LLIZ = null;
    public final ImageView LLIZLLLIL;

    @Override // X.InterfaceC1436400nTy
    public final void LJIIJ(String str) {
        z8(0, str);
    }

    @Override // X.InterfaceC1436400nTy
    public final void LJJJLIIL(String str) {
        String string;
        ImageView imageView;
        Context context;
        if (!C1428520nHG.LJIIZILJ(this.LL) && !C1428520nHG.LJIILJJIL(this.LL) && !C1428580nHM.LIZ(this.LL.isEnterFromDM())) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SaveLocalWithWatermark -> onFinish -> flowId = ");
        sbLIZ.append(str);
        sbLIZ.append("; model.creativeModel.editSaveLocalModel.flowId = ");
        sbLIZ.append(this.LL.creativeModel.editSaveLocalModel.flowId);
        C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        C786410Ut5.LJLLLLLL(0, this.LLILZ);
        TextView textView = this.LLILZIL;
        View view = this.LLILZ;
        EnumC1651310t4b section = null;
        if (view != null && (context = view.getContext()) != null) {
            string = context.getString(this.LLILLJJLI);
        } else {
            string = null;
        }
        textView.setText(string);
        View view2 = this.LLIZ;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(8, view2);
        }
        C0FJM c0fjm = this.LLILZLL;
        if (c0fjm != null) {
            C786410Ut5.w0(c0fjm, 8);
        }
        InterfaceC1652140t5w interfaceC1652140t5w = this.LLILLL;
        if (interfaceC1652140t5w != null) {
            section = interfaceC1652140t5w.getSection();
        }
        if (section == EnumC1651310t4b.FIXED) {
            C786410Ut5.LLIL(this.LLILZIL, 8);
            if (C295280Bhm.LIZ() && (imageView = this.LLIZLLLIL) != null) {
                C786410Ut5.LJZI(8, imageView);
            }
        }
    }

    @Override // X.InterfaceC1436400nTy
    public final void e4(Integer num, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SaveLocalWithWatermark -> showCurrentProgress -> flowId = ");
        sbLIZ.append(str);
        sbLIZ.append("; model.creativeModel.editSaveLocalModel.flowId = ");
        sbLIZ.append(this.LL.creativeModel.editSaveLocalModel.flowId);
        C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        int i = this.LL.creativeModel.editSaveLocalModel.saveLocalProgress;
        if (i < 0) {
            return;
        }
        z8(i, str);
    }

    @Override // X.InterfaceC1436400nTy
    public final void z8(int i, String str) {
        String string;
        ImageView imageView;
        ImageView imageView2;
        if (!C1428520nHG.LJIIZILJ(this.LL) && !C1428520nHG.LJIILJJIL(this.LL) && !C1428580nHM.LIZ(this.LL.isEnterFromDM())) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SaveLocalWithWatermark -> onProgress -> flowId = ");
        sbLIZ.append(str);
        sbLIZ.append("; model.creativeModel.editSaveLocalModel.flowId = ");
        sbLIZ.append(this.LL.creativeModel.editSaveLocalModel.flowId);
        C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        EnumC1651310t4b section = null;
        if (Intrinsics.LJFF(this.LL.creativeModel.editSaveLocalModel.flowId, str)) {
            InterfaceC1652140t5w interfaceC1652140t5w = this.LLILLL;
            if (interfaceC1652140t5w != null) {
                section = interfaceC1652140t5w.getSection();
            }
            if (section == EnumC1651310t4b.FIXED) {
                C786410Ut5.LLIL(this.LLILZIL, 0);
                if (C295280Bhm.LIZ() && (imageView2 = this.LLIZLLLIL) != null) {
                    C786410Ut5.LJZI(0, imageView2);
                }
            }
            C786410Ut5.LJLLLLLL(8, this.LLILZ);
            View view = this.LLIZ;
            if (view != null) {
                C786410Ut5.LJLLLLLL(0, view);
            }
            C0FJM c0fjm = this.LLILZLL;
            if (c0fjm != null) {
                C786410Ut5.w0(c0fjm, 0);
            }
            C0FJM c0fjm2 = this.LLILZLL;
            if (c0fjm2 != null) {
                c0fjm2.setProgress(i / 100.0f);
            }
            TextView textView = this.LLILZIL;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(i);
            sbLIZ2.append('%');
            textView.setText(C2188811AlT.LIZIZ(sbLIZ2));
            this.LL.creativeModel.editSaveLocalModel.saveLocalProgress = i;
            return;
        }
        C786410Ut5.LJLLLLLL(0, this.LLILZ);
        TextView textView2 = this.LLILZIL;
        Context context = this.LLILZ.getContext();
        if (context != null) {
            string = context.getString(this.LLILLJJLI);
        } else {
            string = null;
        }
        textView2.setText(string);
        View view2 = this.LLIZ;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(8, view2);
        }
        C0FJM c0fjm3 = this.LLILZLL;
        if (c0fjm3 != null) {
            C786410Ut5.w0(c0fjm3, 8);
        }
        InterfaceC1652140t5w interfaceC1652140t5w2 = this.LLILLL;
        if (interfaceC1652140t5w2 != null) {
            section = interfaceC1652140t5w2.getSection();
        }
        if (section != EnumC1651310t4b.FIXED) {
            return;
        }
        C786410Ut5.LLIL(this.LLILZIL, 8);
        if (!C295280Bhm.LIZ() || (imageView = this.LLIZLLLIL) == null) {
            return;
        }
        C786410Ut5.LJZI(8, imageView);
    }

    public C1460600o70(C1460650o75 c1460650o75, VideoPublishEditModel videoPublishEditModel, int i, InterfaceC1652140t5w interfaceC1652140t5w) {
        this.LL = videoPublishEditModel;
        this.LLILLJJLI = i;
        this.LLILLL = interfaceC1652140t5w;
        this.LLILZ = c1460650o75.LIZ;
        this.LLILZIL = c1460650o75.LIZIZ;
        this.LLILZLL = c1460650o75.LIZJ;
        this.LLIZLLLIL = c1460650o75.LIZLLL;
    }
}
