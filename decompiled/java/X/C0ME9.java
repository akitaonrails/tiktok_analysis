package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editor.ailive.util.AILiveDialogConfigList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS124S1200000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ME9, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0ME9 extends C0MEA {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJ;
    public static final int LLJJI;
    public final InterfaceC1731706qJ LLJILJIL;
    public final InterfaceC1731706qJ LLJILJILJ;
    public final InterfaceC1731706qJ LLJILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0ME9.class, "innerRootApi", "getInnerRootApi()Lcom/ss/android/ugc/gamora/editor/ailive/AILiveInnerRootApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C0ME9.class, "editChooseMediaApi", "getEditChooseMediaApi()Lcom/ss/android/ugc/gamora/editor/album/EditChooseMediaApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C0ME9.class, "taskHandler", "getTaskHandler()Lcom/ss/android/ugc/gamora/editor/ailive/AILiveTaskApi;", 0);
        c09r3.getClass();
        LLJJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
        LLJJI = 8;
    }

    public final C0MEQ O3() {
        return (C0MEQ) this.LLJILJILJ.getValue(this, LLJJ[1]);
    }

    public final InterfaceC564900MDo Q3() {
        return (InterfaceC564900MDo) this.LLJILJIL.getValue(this, LLJJ[0]);
    }

    public final InterfaceC564940MDs e4() {
        return (InterfaceC564940MDs) this.LLJILLL.getValue(this, LLJJ[2]);
    }

    public C0ME9(C1DRG c1drg) {
        super(c1drg);
        this.LLJILJIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC564900MDo.class, null);
        this.LLJILJILJ = C1664770tQJ.LIZIZ(getDiContainer(), C0MEQ.class, null);
        this.LLJILLL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC564940MDs.class, null);
    }

    public final Function0<Unit> H3(String str) {
        if (Intrinsics.LJFF(str, C0MEC.FAIL_QUOTA.getValue())) {
            return new AwS552S0100000_8(this, 505);
        }
        if (Intrinsics.LJFF(str, C0MEC.FAIL_CHANGE_PROMPT.getValue())) {
            return new AwS552S0100000_8(this, 506);
        }
        if (Intrinsics.LJFF(str, C0MEC.FAIL_CHANGE_IMAGE.getValue())) {
            return new AwS552S0100000_8(this, 507);
        }
        return null;
    }

    @Override // X.C0MEA, X.C0MEG
    public void Od2(Integer num, String str, String str2) {
        C0MES.LIZ.getClass();
        AILiveDialogConfigList.AILiveDialogConfig aILiveDialogConfigLIZJ = C0MES.LIZJ(num, str, str2);
        if (aILiveDialogConfigLIZJ == null) {
            super.Od2(num, str, str2);
            return;
        }
        String strB3 = B3(num, str, str2);
        C0MES.LJ(new C0MET(C1664590tQ1.LJIIIZ(this), aILiveDialogConfigLIZJ.topIcon, aILiveDialogConfigLIZJ.title, aILiveDialogConfigLIZJ.subtitle, aILiveDialogConfigLIZJ.confirmBtn, aILiveDialogConfigLIZJ.cancelBtn, new AwS124S1200000_8(this, aILiveDialogConfigLIZJ, strB3, 2), new AwS124S1200000_8(this, aILiveDialogConfigLIZJ, strB3, 3)));
        if (Intrinsics.LJFF(aILiveDialogConfigLIZJ.action, C0MEC.FAIL_QUOTA.getValue())) {
            C564410MBr c564410MBr = C564410MBr.LIZ;
            VideoPublishEditModel editModel = getEditModel();
            c564410MBr.getClass();
            C564410MBr.LJIIZILJ(editModel, "show");
        } else {
            C564410MBr c564410MBr2 = C564410MBr.LIZ;
            VideoPublishEditModel editModel2 = getEditModel();
            c564410MBr2.getClass();
            C564410MBr.LJIILIIL(editModel2, strB3);
        }
        String str3 = this.LLIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("processFail, errorCode=");
        sbLIZ.append(num);
        sbLIZ.append(", step=");
        sbLIZ.append(str);
        sbLIZ.append(", failReasonMsg=");
        sbLIZ.append(str2);
        C559010LwB.LIZ(str3, C2188811AlT.LIZIZ(sbLIZ));
    }
}
