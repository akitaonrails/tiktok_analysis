package X;

import Y.AfS150S0200000_14;
import android.app.Activity;
import com.ss.android.ugc.aweme.shortvideo.CheckTitleSensitivityResult;
import com.ss.android.ugc.aweme.shortvideo.PostPrompts;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS223S0300000_14;
import kotlin.jvm.internal.AwS415S0200000_14;
import kotlin.jvm.internal.Intrinsics;
import lth.o;

/* JADX INFO: renamed from: X.0Xia, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C856340Xia extends AbstractC857240Xk2<Unit> {
    public final Activity LLILZ;
    public final VideoPublishEditModel LLILZIL;
    public final Function0<Unit> LLILZLL;
    public final Function0<Unit> LLIZ;
    public final /* synthetic */ C856350Xib LLIZLLLIL;

    @Override // X.AbstractC857240Xk2
    public final void LIZIZ() {
    }

    @Override // X.AbstractC857240Xk2
    public final void LIZLLL() {
    }

    @Override // X.AbstractC857240Xk2
    public final String LIZJ() {
        return EnumC856470Xin.SENSITIVE_TITLE_CHECK.getValue().getSecond();
    }

    @Override // X.AbstractC857240Xk2
    public final void LIZ(final C857220Xk0 c857220Xk0) {
        InterfaceC420801kM interfaceC420801kMLJJLL;
        if (!this.LLIZLLLIL.LIZ) {
            c857220Xk0.LIZ(this);
            return;
        }
        C201955140j.LIZ("TitleSensitivity start synchronize data with 2 different response");
        C856350Xib c856350Xib = this.LLIZLLLIL;
        if (!c856350Xib.LJ && c856350Xib.LIZJ == null && c856350Xib.LIZIZ == null && c856350Xib.LIZLLL != null) {
            this.LLILZLL.invoke();
            C201955140j.LIZ("TitleSensitivity showloding when sync data");
            C856350Xib c856350Xib2 = this.LLIZLLLIL;
            C19501211Ri c19501211Ri = c856350Xib2.LJFF;
            if (c19501211Ri != null) {
                C11O8 c11o8LJJJLZIJ = c19501211Ri.LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ());
                final C856350Xib c856350Xib3 = this.LLIZLLLIL;
                interfaceC420801kMLJJLL = c11o8LJJJLZIJ.LJJLL(new C09JN() { // from class: X.0XiZ
                    @Override // X.C09JN
                    public final void accept(Object obj) {
                        C1C7U.LIZ("TitleSensitivityChecker$SensitiveTitleCheck@eb5b.check$1");
                        C201955140j.LIZ("TitleSensitivity finish request in time");
                        C856350Xib c856350Xib4 = c856350Xib3;
                        c856350Xib4.LIZJ = (CheckTitleSensitivityResult) obj;
                        c856350Xib4.LIZ();
                        this.LLIZ.invoke();
                        this.LJ(c857220Xk0);
                        C1C7U.LIZIZ("TitleSensitivityChecker$SensitiveTitleCheck@eb5b.check$1");
                    }
                }, new AfS150S0200000_14(c857220Xk0, this, 3));
            } else {
                interfaceC420801kMLJJLL = null;
            }
            c856350Xib2.LJIIIIZZ = (C11JF) interfaceC420801kMLJJLL;
            return;
        }
        LJ(c857220Xk0);
    }

    public final void LJ(InterfaceC856160XiI interfaceC856160XiI) {
        String creationId;
        String uid;
        PostPrompts postPrompts;
        String goBack;
        PostPrompts postPrompts2;
        String text;
        PostPrompts postPrompts3;
        String postAnyway;
        String text2;
        String dialogTitle;
        Boolean bool = this.LLIZLLLIL.LIZIZ;
        Boolean bool2 = Boolean.TRUE;
        if (Intrinsics.LJFF(bool, bool2)) {
            C0LAB c0lab = new C0LAB();
            VideoPublishEditModel videoPublishEditModel = this.LLILZIL;
            if (videoPublishEditModel != null) {
                creationId = videoPublishEditModel.getCreationId();
            } else {
                creationId = "mModel is null";
            }
            c0lab.LJ("creation_id", creationId);
            C19292410dm currentUser = o.LJIIZILJ.getCurrentUser();
            if (currentUser == null || (uid = currentUser.getUid()) == null) {
                uid = "";
            }
            c0lab.LJ("user_id", uid);
            C20684815ws.LJIILLIIL("tns_video_push_words_sh", c0lab.LIZ);
            C856220XiO c856220XiO = C856220XiO.LIZ;
            Activity activity = this.LLILZ;
            C856350Xib c856350Xib = this.LLIZLLLIL;
            AwS415S0200000_14 awS415S0200000_14 = new AwS415S0200000_14(interfaceC856160XiI, this, 95);
            AwS415S0200000_14 awS415S0200000_142 = new AwS415S0200000_14(interfaceC856160XiI, this, 96);
            c856220XiO.getClass();
            if (activity != null && C856220XiO.LIZIZ != EnumC1998107sB.PRIVACY_DIALOG && C856220XiO.LIZIZ != EnumC1998107sB.POST_FREQUENCY_LIMIT_DIALOG && Intrinsics.LJFF(c856350Xib.LIZIZ, bool2)) {
                CheckTitleSensitivityResult checkTitleSensitivityResult = c856350Xib.LIZJ;
                String dialogTitle2 = null;
                if (checkTitleSensitivityResult != null && checkTitleSensitivityResult.getPostPrompts() != null && (postPrompts = checkTitleSensitivityResult.getPostPrompts()) != null && (goBack = postPrompts.getGoBack()) != null && goBack.length() != 0 && (postPrompts2 = checkTitleSensitivityResult.getPostPrompts()) != null && (text = postPrompts2.getText()) != null && text.length() != 0 && (postPrompts3 = checkTitleSensitivityResult.getPostPrompts()) != null && (postAnyway = postPrompts3.getPostAnyway()) != null && postAnyway.length() != 0 && !o.LJIIZILJ.LIZ()) {
                    CheckTitleSensitivityResult checkTitleSensitivityResult2 = c856350Xib.LIZJ;
                    if (checkTitleSensitivityResult2 != null) {
                        PostPrompts postPrompts4 = checkTitleSensitivityResult2.getPostPrompts();
                        C1397580mTM c1397580mTM = new C1397580mTM(activity);
                        if (postPrompts4 != null) {
                            text2 = postPrompts4.getText();
                        } else {
                            text2 = null;
                        }
                        c1397580mTM.LIZIZ(text2);
                        if (postPrompts4 != null && (dialogTitle = postPrompts4.getDialogTitle()) != null && dialogTitle.length() != 0 && postPrompts4 != null) {
                            dialogTitle2 = postPrompts4.getDialogTitle();
                        }
                        c1397580mTM.LJI(dialogTitle2);
                        C985403tE.LIZ(c1397580mTM, new AwS223S0300000_14(postPrompts4, awS415S0200000_14, awS415S0200000_142, 17));
                        c1397580mTM.LJII = false;
                        new C1397510mTF(c1397580mTM).LIZLLL();
                    }
                    C856220XiO.LIZIZ = EnumC1998107sB.SENSITIVE_TITLE_DIALOG;
                    return;
                }
                return;
            }
            return;
        }
        interfaceC856160XiI.LIZ(this);
    }

    public C856340Xia(C856350Xib c856350Xib, C19EG c19eg, VideoPublishEditModel videoPublishEditModel, Function0 function0, Function0 function02) {
        this.LLIZLLLIL = c856350Xib;
        this.LLILZ = c19eg;
        this.LLILZIL = videoPublishEditModel;
        this.LLILZLL = function0;
        this.LLIZ = function02;
    }
}
