package X;

import Y.ACListenerS143S0100000_8;
import Y.AObjectS240S0100000_5;
import Y.AObjectS241S0100000_8;
import Y.AObserverS209S0100000_5;
import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.als.LiveEvent;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.keva.Keva;
import com.bytedance.scene.Scene;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.ImageEditModel;
import com.ss.android.ugc.aweme.creative.model.publish.EditDescMobModel;
import com.ss.android.ugc.aweme.image.switchmode.payload.SwitchModePayload;
import com.ss.android.ugc.aweme.image.switchmode.payload.SwitchModePayloadType;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialogBuilder;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.tools.view.uikit.factory.CreativeDialogWrapper;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.Pair;
import nv7.c0;

/* JADX INFO: renamed from: X.0MmJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C578370MmJ extends Scene implements InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJJIL;
    public final C1DRG LLJI;
    public final C1664750tQH LLJIJIL;
    public final C1664750tQH LLJILJIL;
    public final C1664750tQH LLJILJILJ;
    public final C1664750tQH LLJILLL;
    public final C1664750tQH LLJJ;
    public final C1664740tQG LLJJI;
    public final C1664740tQG LLJJIII;
    public NLENode LLJJIJI;
    public final C1664740tQG LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public CreativeDialogWrapper LLJJJ;
    public View LLJJJIL;
    public View LLJJJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C578370MmJ.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C578370MmJ.class, "imageEditPageData", "getImageEditPageData()Lcom/ss/android/ugc/aweme/image/switchmode/ImageEditPageData;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C578370MmJ.class, "previewApi", "getPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C578370MmJ.class, "imageModeSwitchApi", "getImageModeSwitchApi()Lcom/ss/android/ugc/aweme/image/switchmode/ImageModeSwitchApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C578370MmJ.class, "rootScene", "getRootScene()Lcom/ss/android/ugc/aweme/adaptation/TikTokSAARootGroupScene;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C578370MmJ.class, "editExitHelper", "getEditExitHelper()Lcom/ss/android/ugc/gamora/editor/exit/IEditExitHelper;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(C578370MmJ.class, "editAutoSaveDraftApi", "getEditAutoSaveDraftApi()Lcom/ss/android/ugc/gamora/editor/draft/EditAutoSaveDraftApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS8 = new C2217381BqS(C578370MmJ.class, "editorProApi", "getEditorProApi()Lcom/ss/android/ugc/gamora/editorpro/EditorProApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS9 = new C2217381BqS(C578370MmJ.class, "reuseSurfaceApi", "getReuseSurfaceApi()Lcom/bytedance/uicomponent/ReuseSurfaceApiComponent;", 0);
        c09r3.getClass();
        LLJJJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7, c2217381BqS8, c2217381BqS9};
    }

    public final void LJ() {
        Activity activity = this.mActivity;
        if (activity == null) {
            return;
        }
        C19576911iZ c19576911iZ = C19576911iZ.LIZ;
        CreativeLoadingDialogBuilder creativeLoadingDialogBuilder = new CreativeLoadingDialogBuilder();
        creativeLoadingDialogBuilder.backCanCancel(false);
        creativeLoadingDialogBuilder.showProgress(false);
        creativeLoadingDialogBuilder.loadingMessage("");
        CreativeDialogWrapper creativeDialogWrapper = (CreativeDialogWrapper) c19576911iZ.createLoadingDialog(activity, 1114, creativeLoadingDialogBuilder);
        creativeDialogWrapper.show();
        this.LLJJJ = creativeDialogWrapper;
        C194353111z.LIZ.LIZIZ(1114, C0MVY.SHOW, C0LD3.DUAL_BALL, C0LEP.CLOSE_VISIBLE);
    }

    public final C1439810nZT LLLIIIIL() {
        return (C1439810nZT) this.LLJILJIL.getValue(this, LLJJJJJIL[1]);
    }

    public final InterfaceC578430MmP LLLIILIL() {
        return (InterfaceC578430MmP) this.LLJILLL.getValue(this, LLJJJJJIL[3]);
    }

    public final AbstractC214814194y LLLIL() {
        return (AbstractC214814194y) this.LLJJ.getValue(this, LLJJJJJIL[4]);
    }

    public final VideoPublishEditModel getEditModel() {
        return (VideoPublishEditModel) this.LLJIJIL.getValue(this, LLJJJJJIL[0]);
    }

    public final void LLLILZ() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        View viewFindViewById = C289140BUy.LIZIZ() ? this.mView : this.mView.findViewById(R.id.wue);
        ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) == null) {
            return;
        }
        c0 c0Var = c0.LIZ;
        c0Var.getClass();
        C1660590tJZ c1660590tJZ = c0.LJFF;
        if (c1660590tJZ != null) {
            if (c1660590tJZ.LJII()) {
                marginLayoutParams.bottomMargin = (c0Var.LLJJJJLIIL() + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(68))) - c0Var.o2();
            } else {
                marginLayoutParams.bottomMargin = (c0Var.LLJJJJLIIL() + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20))) - c0Var.o2();
            }
            C786410Ut5.W5(viewFindViewById, marginLayoutParams);
        }
    }

    @Override // com.bytedance.scene.Scene
    public final void onResume() {
        super.onResume();
        boolean zLJJZZI = C1428470nHB.LJJZZI(getEditModel());
        View view = this.LLJJJIL;
        if (view != null) {
            view.setSelected(zLJJZZI);
        }
        View view2 = this.LLJJJJ;
        if (view2 != null) {
            view2.setSelected(!zLJJZZI);
        }
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLJI;
    }

    public C578370MmJ(C1DRG c1drg) {
        this.LLJI = c1drg;
        this.LLJIJIL = C1664770tQJ.LIZ(c1drg, VideoPublishEditModel.class, null);
        this.LLJILJIL = C1664770tQJ.LIZ(c1drg, C1439810nZT.class, null);
        this.LLJILJILJ = C1664770tQJ.LIZ(c1drg, InterfaceC1455860nzM.class, null);
        this.LLJILLL = C1664770tQJ.LIZ(c1drg, InterfaceC578430MmP.class, null);
        this.LLJJ = C1664770tQJ.LIZ(c1drg, AbstractC214814194y.class, null);
        this.LLJJI = C1664770tQJ.LIZIZ(c1drg, InterfaceC578380MmK.class, null);
        this.LLJJIII = C1664770tQJ.LIZIZ(c1drg, InterfaceC559500Lwy.class, null);
        this.LLJJIJIIJIL = C1664770tQJ.LIZIZ(c1drg, InterfaceC377540ErA.class, null);
        C1664770tQJ.LIZIZ(c1drg, InterfaceC1452360nti.class, null);
    }

    public final void LLLIZZ(boolean z) {
        int size;
        Bundle argumentsSafely;
        ArrayList parcelableArrayList;
        this.LLJJIJIL = true;
        C571380Mb2 c571380Mb2 = C571380Mb2.LIZ;
        VideoPublishEditModel editModel = getEditModel();
        AbstractC214814194y abstractC214814194yLIZ = C372650EjH.LIZ(this);
        if (abstractC214814194yLIZ != null && (argumentsSafely = abstractC214814194yLIZ.getArgumentsSafely()) != null && (parcelableArrayList = argumentsSafely.getParcelableArrayList("extra_image_model_media_list")) != null) {
            size = parcelableArrayList.size();
        } else {
            size = 0;
        }
        c571380Mb2.getClass();
        C571380Mb2.LIZ(size, editModel, "switch_button");
        C1632480saE c1632480saE = C1632480saE.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RecentUsedStickerDataRepo -> updateNeedClearStatus: needClear = ");
        sbLIZ.append(false);
        C201955140j.LIZJ(c1632480saE, C2188811AlT.LIZIZ(sbLIZ));
        C578400MmM.LIZ = false;
        LLLIILIL().Gc0().setValue(Boolean.TRUE);
        View view = this.LLJJJIL;
        if (view != null) {
            view.setSelected(z);
        }
        View view2 = this.LLJJJJ;
        if (view2 != null) {
            view2.setSelected(!z);
        }
        this.LLJJIJIL = false;
    }

    @Override // com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        int i;
        LiveEvent<Pair<EnumC377550ErB, Float>> liveEventOn0;
        super.onActivityCreated(bundle);
        if (C289140BUy.LIZIZ()) {
            View viewRequireViewById = requireViewById(R.id.qcs);
            TuxTextView tuxTextView = (TuxTextView) viewRequireViewById;
            tuxTextView.setSelected(C1428470nHB.LJJZZI(getEditModel()));
            C786410Ut5.h9(tuxTextView, new ACListenerS143S0100000_8(this, 21));
            this.LLJJJIL = viewRequireViewById;
            View viewRequireViewById2 = requireViewById(R.id.video_mode_btn);
            TuxTextView tuxTextView2 = (TuxTextView) viewRequireViewById2;
            tuxTextView2.setSelected(!C1428470nHB.LJJZZI(getEditModel()));
            C786410Ut5.h9(tuxTextView2, new ACListenerS143S0100000_8(this, 22));
            this.LLJJJJ = viewRequireViewById2;
            if (C0C64.LJIILLIIL().LJIJ(31744, 0, "photo_autocut_remove_video_photo_toggle", true) == 1) {
                View view = this.LLJJJJ;
                if (view != null) {
                    C786410Ut5.LJLLLLLL(8, view);
                }
                View view2 = this.LLJJJIL;
                if (view2 != null) {
                    C786410Ut5.LJLLLLLL(8, view2);
                }
            }
        } else {
            TextView textView = (TextView) requireViewById(R.id.xqx);
            if (C1428470nHB.LJJZZI(getEditModel())) {
                i = 2131833274;
            } else {
                i = 2131833273;
            }
            textView.setText(i);
            C786410Ut5.I7(new ACListenerS143S0100000_8(this, 23), requireViewById(R.id.wue));
        }
        C1664750tQH c1664750tQH = this.LLJILJILJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJJIL;
        ((InterfaceC1455860nzM) c1664750tQH.getValue(this, interfaceC2217461BqaArr[2])).Yh().observe(this, new AObserverS209S0100000_5(this, 1));
        LLLIILIL().Yv0().LIZ(this, new AObjectS241S0100000_8(this, 10));
        InterfaceC1452170ntP value = ((InterfaceC1455860nzM) this.LLJILJILJ.getValue(this, interfaceC2217461BqaArr[2])).g().getValue();
        if (value != null) {
            this.LLJJIJI = ((C1463670oBx) value).LIZJ().deepClone();
        }
        InterfaceC377540ErA interfaceC377540ErA = (InterfaceC377540ErA) this.LLJJIJIIJIL.getValue(this, interfaceC2217461BqaArr[7]);
        if (interfaceC377540ErA != null && (liveEventOn0 = interfaceC377540ErA.on0()) != null) {
            liveEventOn0.LIZ(this, new AObjectS240S0100000_5(this, 8));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0072  */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLII(android.os.Bundle r46, kotlin.jvm.functions.Function1<? super android.os.Bundle, kotlin.Unit> r47) {
        /*
            Method dump skipped, instruction units count: 1433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C578370MmJ.LLLII(android.os.Bundle, kotlin.jvm.functions.Function1):void");
    }

    public final void LLLILZLLLI(SwitchModePayload switchModePayload, Bundle bundle) {
        VideoPublishEditModel videoPublishEditModel;
        CreativeModel creativeModel;
        ImageEditModel imageEditModel;
        VideoPublishEditModel videoPublishEditModel2;
        VideoPublishEditModel videoPublishEditModel3;
        ImageAlbumData imageAlbumData;
        VideoPublishEditModel videoPublishEditModel4;
        C0FQX.LIZ = LLLIIIIL();
        C0FQX.LIZIZ = true;
        int iLJIIJ = 0;
        getEditModel().creativeModel.commonMobModel.editDescMobModel = new EditDescMobModel(0);
        if (C1428470nHB.LJJZZI(getEditModel())) {
            ((Keva) C578410MmN.LIZ.getValue()).storeBoolean("enter_image_edit_page", false);
            if (!C1216510hlJ.LIZ().getBoolean("image_collage_expand_keva", false)) {
                getEditModel().creativeModel.imageEditModel.needRestoreCollageShowState = true;
            }
            C1439820nZU c1439820nZULIZ = LLLIIIIL().LIZ();
            if (c1439820nZULIZ != null && (videoPublishEditModel4 = c1439820nZULIZ.LIZ) != null) {
                videoPublishEditModel4.setEnterFromImageSwitch(true);
                AudioRecorderParam veAudioRecorderParam = videoPublishEditModel4.getVeAudioRecorderParam();
                if (veAudioRecorderParam != null) {
                    veAudioRecorderParam.setAudioRecordIndex(-1);
                    veAudioRecorderParam.setNeedDel(false);
                }
            }
            if (switchModePayload != null) {
                C1439820nZU c1439820nZU = LLLIIIIL().LIZIZ;
                if (c1439820nZU != null && (videoPublishEditModel3 = c1439820nZU.LIZ) != null && (imageAlbumData = videoPublishEditModel3.getImageAlbumData()) != null) {
                    iLJIIJ = C1413430msv.LJIIJ(imageAlbumData);
                }
                switchModePayload.LIZJ(iLJIIJ);
                C786410Ut5.LJJIJL(bundle, "switch_mode_payload", switchModePayload);
                if (switchModePayload.LIZ()) {
                    bundle.putBoolean("switch_mode_hide_intermediate", true);
                }
                if (switchModePayload.type == SwitchModePayloadType.AUTO_CUT_SELECTED) {
                    bundle.putBoolean("auto_cut_open", true);
                }
            } else {
                bundle.remove("switch_mode_payload");
                bundle.remove("switch_mode_hide_intermediate");
                bundle.remove("auto_cut_open");
            }
            bundle.putBoolean("from_image_mode", true);
            C565310MFd.LIZJ(LLLIL(), bundle, true);
            return;
        }
        getEditModel().creativeModel.imageEditModel.isVideoChildPageFromImage = false;
        C1439820nZU c1439820nZU2 = LLLIIIIL().LIZIZ;
        if (c1439820nZU2 != null && (videoPublishEditModel2 = c1439820nZU2.LIZ) != null) {
            videoPublishEditModel2.setEnterFromImageSwitch(true);
        }
        C1439820nZU c1439820nZU3 = LLLIIIIL().LIZIZ;
        if (c1439820nZU3 != null && (videoPublishEditModel = c1439820nZU3.LIZ) != null && (creativeModel = videoPublishEditModel.creativeModel) != null && (imageEditModel = creativeModel.imageEditModel) != null) {
            imageEditModel.isVideoChildPageFromImage = false;
        }
        ((Keva) C578410MmN.LIZ.getValue()).storeBoolean("enter_image_edit_page", true);
        if (getEditModel().creativeModel.imageEditModel.needRestoreCollageShowState) {
            C1216510hlJ.LIZ().storeBoolean("image_collage_expand_keva", false);
        }
        if (switchModePayload != null) {
            C786410Ut5.LJJIJL(bundle, "switch_mode_payload", switchModePayload);
            if (switchModePayload.LIZ()) {
                bundle.putBoolean("switch_mode_hide_intermediate", true);
            }
        } else {
            bundle.remove("switch_mode_payload");
            bundle.remove("switch_mode_hide_intermediate");
        }
        bundle.putBoolean("switch_mode_from_video_to_image", true);
        C565310MFd.LIZIZ(LLLIL(), bundle, true);
    }

    @Override // com.bytedance.scene.Scene
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (C289140BUy.LIZIZ()) {
            return C786410Ut5.Td(layoutInflater, R.layout.eqo, viewGroup, false);
        }
        return C786410Ut5.Td(layoutInflater, R.layout.eqn, viewGroup, false);
    }
}
