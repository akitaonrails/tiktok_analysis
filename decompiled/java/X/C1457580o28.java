package X;

import Y.AObjectS245S0100000_22;
import Y.AObserverS225S0100000_22;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.services.optimization.ILayoutPreloadServiceForEditPage;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import com.ss.android.ugc.aweme.shortvideo.edit.videolength.IVideoLengthChecker;
import com.ss.android.ugc.tiktok.tools.performance.api.settings.LazyLoadEditLazyGroupPhase1;
import com.zhiliaoapp.musically.R;
import irm.AkS90S0100000_22;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS601S0100000_22;

/* JADX INFO: renamed from: X.0o28, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public class C1457580o28 extends Scene implements InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJL;
    public final C1DRG LLJI;
    public ConstraintLayout LLJIJIL;
    public final C1664750tQH LLJILJIL;
    public final C1664740tQG LLJILJILJ;
    public final C1664740tQG LLJILLL;
    public final C1664750tQH LLJJ;
    public final C1664740tQG LLJJI;
    public ImageView LLJJIII;
    public TextView LLJJIJI;
    public boolean LLJJIJIL;
    public InterfaceC1414530muh LLJJJ;
    public final C1664740tQG LLJJJIL;
    public final C1664740tQG LLJJJJ;
    public final C01GW LLJJIJIIJIL = C1449630npJ.LIZ(this, InterfaceC1455860nzM.class);
    public final C01GW LLJJJJJIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 760));
    public final C01GW LLJJJJLIIL = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(266));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1457580o28.class, "editToolbarApi", "getEditToolbarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/TitlebarApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1457580o28.class, "editorProApi", "getEditorProApi()Lcom/ss/android/ugc/gamora/editorpro/EditorProApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1457580o28.class, "changeAvatarComponent", "getChangeAvatarComponent()Lcom/ss/android/ugc/aweme/shortvideo/edit/changeavatar/ChangeAvatarApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C1457580o28.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C1457580o28.class, "legacyEditStickerScene", "getLegacyEditStickerScene()Lcom/ss/android/ugc/gamora/editor/sticker/IEditStickerScene;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C1457580o28.class, "editExitApi", "getEditExitApi()Lcom/ss/android/ugc/gamora/editor/exit/EditExitApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(C1457580o28.class, "aiLivePhotoApi", "getAiLivePhotoApi()Lcom/ss/android/ugc/gamora/editor/ailive/AILivePhotoApi;", 0);
        c09r3.getClass();
        LLJJL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7};
    }

    public final ImageView LLLII() {
        ImageView imageView = this.LLJJIII;
        if (imageView != null) {
            return imageView;
        }
        return null;
    }

    public final InterfaceC1455860nzM LLLIIIIL() {
        return (InterfaceC1455860nzM) this.LLJJIJIIJIL.getValue();
    }

    public final InterfaceC1457600o2A LLLIL() {
        return (InterfaceC1457600o2A) this.LLJILJIL.getValue(this, LLJJL[0]);
    }

    public final VideoPublishEditModel LLLILZ() {
        return (VideoPublishEditModel) this.LLJJ.getValue(this, LLJJL[3]);
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLJ() {
        /*
            Method dump skipped, instruction units count: 548
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1457580o28.LLLJ():void");
    }

    public final InterfaceC1444170ngV LLLIILIL() {
        Object c098200Yq;
        if (!LazyLoadEditLazyGroupPhase1.LIZ().enableLazySafeComponent) {
            return (InterfaceC1444170ngV) this.LLJJI.getValue(this, LLJJL[4]);
        }
        if (((C0ETY) this.LLJI.LJII(C0ETY.class, null)).MY1(InterfaceC1461350o8D.class) == null) {
            return null;
        }
        try {
            c098200Yq = (InterfaceC1444170ngV) this.LLJI.LJIIL(null, InterfaceC1444170ngV.class);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        return (InterfaceC1444170ngV) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq);
    }

    public final void LLLILZLLLI() {
        LLLIL().WP(this, new AwS601S0100000_22(this, 555));
        LLLIL().FW(this, new AwS601S0100000_22(this, 556));
        LLLIL().zq0(this, new AwS601S0100000_22(this, 557));
        LLLIL().In0(this, new AwS601S0100000_22(this, 558));
        LLLIIIIL().ww2().observe(this, new AObserverS225S0100000_22(this, 124));
        LLLIL().ak().LIZ(this, new AObjectS245S0100000_22(this, 232));
        ((IVideoLengthChecker) ServiceManager.get().getService(IVideoLengthChecker.class)).LIZLLL(this, LLLILZ(), LLLIIIIL());
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLJI;
    }

    public C1457580o28(C1DRG c1drg) {
        this.LLJI = c1drg;
        this.LLJILJIL = C1664770tQJ.LIZ(c1drg, InterfaceC1457600o2A.class, null);
        this.LLJILJILJ = C1664770tQJ.LIZIZ(c1drg, InterfaceC377540ErA.class, null);
        this.LLJILLL = C1664770tQJ.LIZIZ(c1drg, InterfaceC1457660o2G.class, null);
        this.LLJJ = C1664770tQJ.LIZ(c1drg, VideoPublishEditModel.class, null);
        this.LLJJI = C1664770tQJ.LIZIZ(c1drg, InterfaceC1444170ngV.class, null);
        this.LLJJJIL = C1664770tQJ.LIZIZ(c1drg, InterfaceC1453420nvQ.class, null);
        this.LLJJJJ = C1664770tQJ.LIZIZ(c1drg, InterfaceC1455680nz4.class, null);
    }

    public static void LLLIZZ(C1457580o28 c1457580o28) {
        c1457580o28.LLJJIJIL = true;
        if (!((IAVServiceProxy) ServiceManager.get().getService(IAVServiceProxy.class)).getStoryService().LIZ()) {
            if (c1457580o28.LLLILZ().mIsFromDraft) {
                c1457580o28.LLLIL().zz0(false);
            }
            if (c1457580o28.LLLILZ().getDraftFromShoot()) {
                c1457580o28.LLLIL().zz0(true);
                return;
            }
            return;
        }
        c1457580o28.LLLIL().zz0(false);
    }

    public final void LLLJL(int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ConstraintLayout constraintLayout = this.LLJIJIL;
        ConstraintLayout constraintLayout2 = null;
        if (constraintLayout == null) {
            constraintLayout = null;
        }
        ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            marginLayoutParams.topMargin = i;
            ConstraintLayout constraintLayout3 = this.LLJIJIL;
            if (constraintLayout3 == null) {
                constraintLayout3 = null;
            }
            C786410Ut5.m6(constraintLayout3, marginLayoutParams);
            if (C1462920oAk.LIZLLL() && !(LLLIIIIL() instanceof InterfaceC572860MdQ)) {
                ConstraintLayout constraintLayout4 = this.LLJIJIL;
                if (constraintLayout4 == null) {
                    constraintLayout4 = null;
                }
                int paddingLeft = constraintLayout4.getPaddingLeft();
                ConstraintLayout constraintLayout5 = this.LLJIJIL;
                if (constraintLayout5 == null) {
                    constraintLayout5 = null;
                }
                int paddingRight = constraintLayout5.getPaddingRight();
                ConstraintLayout constraintLayout6 = this.LLJIJIL;
                if (constraintLayout6 == null) {
                    constraintLayout6 = null;
                }
                constraintLayout4.setPadding(paddingLeft, 0, paddingRight, constraintLayout6.getPaddingBottom());
                ConstraintLayout constraintLayout7 = this.LLJIJIL;
                if (constraintLayout7 == null) {
                    constraintLayout7 = null;
                }
                C1462920oAk.LIZJ(constraintLayout7, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), 0);
            }
            if (LLLIIIIL() instanceof InterfaceC572860MdQ) {
                ConstraintLayout constraintLayout8 = this.LLJIJIL;
                if (constraintLayout8 == null) {
                    constraintLayout8 = null;
                }
                int paddingLeft2 = constraintLayout8.getPaddingLeft();
                int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                ConstraintLayout constraintLayout9 = this.LLJIJIL;
                if (constraintLayout9 == null) {
                    constraintLayout9 = null;
                }
                constraintLayout8.setPadding(paddingLeft2, iLIZIZ, constraintLayout9.getPaddingRight(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
                ConstraintLayout constraintLayout10 = this.LLJIJIL;
                if (constraintLayout10 != null) {
                    constraintLayout2 = constraintLayout10;
                }
                C786410Ut5.m6(constraintLayout2, marginLayoutParams);
            }
        }
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.LLJJIII = (ImageView) requireViewById(R.id.bmy);
        if (C1428470nHB.LLIIIJ(LLLILZ()) && !LLLILZ().isFromCrash() && !LLLILZ().mIsFromDraft && !u4.LJIILIIL(LLLILZ())) {
            C786410Ut5.LJZI(8, LLLII());
        }
        if (LLLILZ().mDraftToEditFrom != 7 && LLLILZ().mDraftToEditFrom != 8) {
            if (!C571290Mat.LIZJ(LLLILZ()) && !C571290Mat.LIZLLL(LLLILZ()) && !LLLILZ().isDirectToPublishByNewExp() && LLLILZ().mIsFromDraft && (LLLILZ().getOrigin() == 0 || LLLILZ().getRecordMode() == 1)) {
                LLLII().setImageResource(R.drawable.bx9);
            } else {
                LLLII().setImageResource(R.drawable.bx6);
            }
        } else {
            LLLII().setImageResource(R.drawable.bx9);
        }
        if (C301590Brx.LIZ()) {
            LLLII().setImageResource(R.drawable.bx6);
        }
        C786410Ut5.Q7(LLLII(), new AkS90S0100000_22(this, 18));
        TextView textView = (TextView) requireViewById(R.id.z_y);
        this.LLJJIJI = textView;
        if (textView == null) {
            textView = null;
        }
        C786410Ut5.T7(textView, new AkS90S0100000_22(this, 19));
        Integer num = C1450870nrJ.LJI;
        if (num != null) {
            LLLJL(num.intValue());
        }
        if (LazyLoadEditLazyGroupPhase1.LIZ().enableLazySafeComponent) {
            LLLILZLLLI();
            ((C0ETY) this.LLJI.LJII(C0ETY.class, null)).Sd(InterfaceC1414530muh.class, new AwS601S0100000_22(this, 561));
            if (!(!C1411560mpu.LIZIZ)) {
                LLLIIIIL().ww2().observe(this, new AObserverS225S0100000_22(this, 126));
                return;
            }
            return;
        }
        LLLILZLLLI();
        if (!(!C1411560mpu.LIZIZ)) {
            LLLIZZ(this);
        }
        ((C0ETY) this.LLJI.LJII(C0ETY.class, null)).Sd(InterfaceC1414530muh.class, new AwS601S0100000_22(this, 561));
    }

    @Override // com.bytedance.scene.Scene
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ConstraintLayout constraintLayout = (ConstraintLayout) ((ILayoutPreloadServiceForEditPage) ServiceManager.get().getService(ILayoutPreloadServiceForEditPage.class)).loadLayoutFiles("scene_edit_titlebar", getSceneContext(), layoutInflater, R.layout.eov, viewGroup, false);
        this.LLJIJIL = constraintLayout;
        return constraintLayout;
    }
}
