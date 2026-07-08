package X;

import android.content.Context;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editor.ailive.util.AILiveDialogConfigList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0MEA, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public class C0MEA extends AbstractC1664470tPp<C0MEG, Unit, Unit> implements C0MEG, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public static final int LLJIJIL;
    public final C1DRG LLILLL;
    public final C0MEG LLILZ = this;
    public final Function0<Unit> LLILZIL = AFwS194S0000000_8.get$arr$(241);
    public final Function0<Unit> LLILZLL = AFwS194S0000000_8.get$arr$(242);
    public final String LLIZ = "AILiveResultTipComponent";
    public final InterfaceC1731706qJ LLIZLLLIL = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final InterfaceC1731706qJ LLJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC564950MDt.class, null);

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0MEA.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C0MEA.class, "editAiLiveToolbarApi", "getEditAiLiveToolbarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/EditAIAliveToolbarApi;", 0);
        c09r3.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
        LLJIJIL = 8;
    }

    public final VideoPublishEditModel getEditModel() {
        return (VideoPublishEditModel) this.LLIZLLLIL.getValue(this, LLJI[0]);
    }

    public final InterfaceC564950MDt v3() {
        return (InterfaceC564950MDt) this.LLJ.getValue(this, LLJI[1]);
    }

    private final void E3() {
        InterfaceC564950MDt interfaceC564950MDtV3 = v3();
        if (interfaceC564950MDtV3 != null) {
            interfaceC564950MDtV3.GB2(true);
        }
    }

    @Override // X.C0MEG
    public void pu1() {
        Context contextLJIIIZ = C1664590tQ1.LJIIIZ(this);
        CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
        creativeToastBuilder.messageRes(2131820697);
        creativeToastBuilder.isCenterToast(true);
        creativeToastBuilder.duration(3000L);
        C1390380mHk.LIZJ(contextLJIIIZ, 8004, creativeToastBuilder);
    }

    @Override // X.AbstractC1664470tPp, X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLILLL;
    }

    public final String getTag() {
        return this.LLIZ;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<Unit> o2() {
        return this.LLILZIL;
    }

    public C0MEG q3() {
        return this.LLILZ;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<Unit> w2() {
        return this.LLILZLL;
    }

    public C0MEA(C1DRG c1drg) {
        this.LLILLL = c1drg;
    }

    public final String B3(Integer num, String str, String str2) {
        String str3;
        C0MES.LIZ.getClass();
        AILiveDialogConfigList.AILiveDialogConfig aILiveDialogConfigLIZJ = C0MES.LIZJ(num, str, str2);
        if (aILiveDialogConfigLIZJ != null) {
            str3 = aILiveDialogConfigLIZJ.action;
        } else {
            str3 = null;
        }
        if (Intrinsics.LJFF(str3, C0MEC.FAIL_CHANGE_IMAGE.getValue())) {
            return "image";
        }
        if (Intrinsics.LJFF(str3, C0MEC.FAIL_CHANGE_PROMPT.getValue())) {
            return "prompt";
        }
        return "fail";
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Od2(java.lang.Integer r10, java.lang.String r11, java.lang.String r12) {
        /*
            Method dump skipped, instruction units count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0MEA.Od2(java.lang.Integer, java.lang.String, java.lang.String):void");
    }
}
