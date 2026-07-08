package com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.editor.cover;

import X.C00UK;
import X.C00UL;
import X.C01GW;
import X.C01NB;
import X.C0UO0;
import X.C1119170fEJ;
import X.C1161920gLG;
import X.C11NJ;
import X.C13BV;
import X.C168Q;
import X.C1697810uHb;
import X.C16H0;
import X.C19487311Lz;
import X.C19F0;
import X.C202139147l;
import X.C20370114nD;
import X.C20370714nJ;
import X.C20371414nQ;
import X.C20417114un;
import X.C20441214yg;
import X.C20632315oP;
import X.C20736316Cj;
import X.C21505619Eg;
import X.C2188811AlT;
import X.C410901il;
import X.C452501pT;
import X.C473410IhP;
import X.C480460Ism;
import X.C497740JfY;
import X.C500260Jjc;
import X.C516201zk;
import X.C915190ZvJ;
import X.C951190arN;
import X.C978360bZC;
import X.InterfaceC1631620sYq;
import X.InterfaceC170900l9;
import X.InterfaceC202141147n;
import X.InterfaceC20420614vM;
import X.InterfaceC773010UTz;
import X.RunnableC514501zT;
import Y.ARunnableS131S0100000_31;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.activity.result.ActivityResult;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookSheetFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.IPlaybookApi;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.editor.BasePlaybookEditorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.editor.cover.PlaybookEditorCoverDialogV2;
import com.bytedance.android.live.liveinteract.multilive.model.MaterialsGetImagesParams;
import com.bytedance.android.live.liveinteract.multilive.model.PlaybookImageAIGenParams;
import com.bytedance.android.livesdkapi.host.IHostCreativeTool;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AwS137S0101000_31;
import kotlin.jvm.internal.AwS610S0100000_31;
import kotlin.jvm.internal.AwS680S0100000_31;
import kotlin.jvm.internal.Intrinsics;
import webcast.data.multi_guest_play.PlayImage;
import webcast.data.multi_guest_play.PublishPlaybookContent;

/* JADX INFO: loaded from: classes32.dex */
public final class PlaybookEditorCoverDialogV2 extends BasePlaybookSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyImJDElLjo2OzE6emE+KSwiZz8/HELIOSKTxiOSMyMScjJiR9KyohJCA9ZiAoIDs8OmsvJjk2OmscJS4qKiojIgo3ITEjOww8PiA+DSYyJCorH30=";
    public final BasePlaybookEditorViewModel LLJZIJLIL;
    public final PublishPlaybookContent LLL;
    public final Function0<Long> LLLF;
    public final Function0<String> LLLFF;
    public final Function0<Boolean> LLLFFI;
    public final InterfaceC1631620sYq<String, String, Boolean, Unit> LLLFZ;
    public final Function1<Integer, Unit> LLLI;
    public final Function1<String, Unit> LLLII;
    public final Function1<String, Unit> LLLIIII;
    public List<C00UL> LLLIIIIL;
    public C20632315oP LLLIIIL;
    public FrameLayout LLLIIL;
    public LinearLayout LLLIILIL;
    public LinearLayout LLLIL;
    public FrameLayout LLLILZ;
    public FrameLayout LLLILZJ;
    public ViewGroup LLLILZLLLI;
    public List<? extends View> LLLIZZ;
    public C951190arN LLLJ;
    public RunnableC514501zT LLLJL;
    public InterfaceC773010UTz LLLL;
    public boolean LLLLIIL;
    public boolean LLLLIILL;
    public final C01GW LLLJIL = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(471));
    public boolean LLLLII = true;
    public final C16H0 LLLLIIIILLL = new C16H0(this, 6);
    public final C01GW LLLLIILLL = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(472));
    public final C01GW LLLLIL = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(473));
    public final C19F0<Intent> LLLLILI = registerForActivityResult(new C21505619Eg(), new C168Q() { // from class: X.14uo
        /* JADX WARN: Multi-variable type inference failed */
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
        @Override // X.C168Q
        public final void LIZ(Object obj) {
            Object objLJJJJZI;
            ActivityResult activityResult = (ActivityResult) obj;
            if (activityResult.resultCode == -1) {
                List<String> listHandleGalleryResult = this.LIZ.ES().handleGalleryResult(activityResult.data);
                Function1<String, Unit> function1 = this.LIZ.LLLIIII;
                if (listHandleGalleryResult == null || (objLJJJJZI = C13LP.LJJJJZI(listHandleGalleryResult)) == null) {
                    objLJJJJZI = "";
                }
                function1.invoke(objLJJJJZI);
            }
        }
    });
    public final C20417114un LLLLJ = new InterfaceC20420614vM() { // from class: X.14un
        @Override // X.InterfaceC20420614vM
        public final void LIZ(PlayImage playImage) {
            boolean z;
            InterfaceC1631620sYq<String, String, Boolean, Unit> interfaceC1631620sYq = this.LIZ.LLLFZ;
            String str = playImage.uri;
            String str2 = playImage.url;
            if (playImage.type == 1) {
                z = true;
            } else {
                z = false;
            }
            interfaceC1631620sYq.invoke(str, str2, Boolean.valueOf(z));
            this.LIZ.close(1);
            if (playImage.type == 1) {
                C915190ZvJ c915190ZvJ = C978360bZC.LIZJ;
                C978360bZC.LJIJ("change_cover", "ai_cover", this.LIZ.LLLF.invoke(), this.LIZ.LLLFF.invoke(), this.LIZ.LLLFFI.invoke().booleanValue(), null, null);
            } else {
                C915190ZvJ c915190ZvJ2 = C978360bZC.LIZJ;
                C978360bZC.LJIJ("change_cover", "choose_cover", this.LIZ.LLLF.invoke(), this.LIZ.LLLFF.invoke(), this.LIZ.LLLFFI.invoke().booleanValue(), null, null);
            }
        }

        @Override // X.InterfaceC20420614vM
        public final void LIZIZ(PlayImage playImage) {
            this.LIZ.HS(playImage);
            this.LIZ.BS(playImage, 2, "onAISuccessRetry");
            C915190ZvJ c915190ZvJ = C978360bZC.LIZJ;
            C978360bZC.LJIJ("change_cover", "ai_cover_refresh", this.LIZ.LLLF.invoke(), this.LIZ.LLLFF.invoke(), this.LIZ.LLLFFI.invoke().booleanValue(), null, null);
        }

        @Override // X.InterfaceC20420614vM
        public final void LIZJ(PlayImage playImage) {
            this.LIZ.HS(playImage);
            this.LIZ.BS(playImage, 2, "onAIErrorRetry");
            C915190ZvJ c915190ZvJ = C978360bZC.LIZJ;
            C978360bZC.LJIJ("change_cover", "ai_cover_retry", this.LIZ.LLLF.invoke(), this.LIZ.LLLFF.invoke(), this.LIZ.LLLFFI.invoke().booleanValue(), null, null);
        }
    };

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookSheetFragment
    public final int getLayoutId() {
        return R.layout.har;
    }

    public final IHostCreativeTool ES() {
        return (IHostCreativeTool) this.LLLLIL.getValue();
    }

    public final void FS() {
        if (!this.LLLLIIL || !this.LLLLIILL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("refreshCovers return isImageSizeDetermined=");
            sbLIZ.append(this.LLLLIIL);
            sbLIZ.append(", hasRequestCoverSuccess=");
            sbLIZ.append(this.LLLLIILL);
            C20441214yg.LJIIIZ("PlaybookEditorCoverDialogV2", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        C951190arN c951190arN = this.LLLJ;
        if (c951190arN != null) {
            C410901il c410901il = new C410901il();
            Collection collection = this.LLLIIIIL;
            if (collection == null) {
                collection = C13BV.INSTANCE;
            }
            c410901il.addAll(collection);
            c951190arN.LLLII(c410901il);
        }
        LinearLayout linearLayout = this.LLLIL;
        if (linearLayout != null) {
            C500260Jjc.LLFFF(linearLayout);
        }
    }

    public final void GS() {
        PlayImage next;
        List<C00UL> list = this.LLLIIIIL;
        List<C00UL> listLIZ = list != null ? C00UK.LIZ(list) : null;
        this.LLLIIIIL = listLIZ;
        if (listLIZ != null) {
            Iterator<C00UL> it2 = listLIZ.iterator();
            while (it2.hasNext()) {
                Iterator<PlayImage> it3 = it2.next().LIZ.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it3.next();
                        if (next.type == 1) {
                            break;
                        }
                    }
                }
                PlayImage playImage = next;
                if (playImage != null) {
                    playImage.status = 3;
                }
            }
        }
        FS();
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C1119170fEJ gS() {
        C1119170fEJ c1119170fEJ = new C1119170fEJ();
        c1119170fEJ.LIZ(C497740JfY.LJIJI(2131854032));
        c1119170fEJ.LJI = false;
        return c1119170fEJ;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookSheetFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        ((C11NJ) this.LLLJIL.getValue()).LJ();
        RunnableC514501zT runnableC514501zT = this.LLLJL;
        if (runnableC514501zT != null) {
            C473410IhP.LIZ().removeCallbacks(runnableC514501zT);
        }
        C20632315oP c20632315oP = this.LLLIIIL;
        if (c20632315oP != null) {
            c20632315oP.LJI(this.LLLLIIIILLL);
        }
        InterfaceC773010UTz interfaceC773010UTz = this.LLLL;
        if (interfaceC773010UTz != null) {
            ((C202139147l) interfaceC773010UTz).LIZ();
        }
        this.LLLL = null;
        ES().releaseGalleryModule();
    }

    public final void HS(PlayImage playImage) {
        List<C00UL> listLIZ;
        List<C00UL> list = this.LLLIIIIL;
        if (list != null) {
            listLIZ = C00UK.LIZ(list);
        } else {
            listLIZ = null;
        }
        this.LLLIIIIL = listLIZ;
        if (listLIZ != null) {
            Iterator<C00UL> it2 = listLIZ.iterator();
            while (it2.hasNext()) {
                Iterator<PlayImage> it3 = it2.next().LIZ.iterator();
                int i = 0;
                while (true) {
                    if (it3.hasNext()) {
                        PlayImage next = it3.next();
                        int i2 = i + 1;
                        if (i >= 0) {
                            PlayImage playImage2 = next;
                            if (Intrinsics.LJFF(playImage2, playImage)) {
                                playImage2.status = 1;
                                break;
                            }
                            i = i2;
                        } else {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                    }
                }
            }
        }
        FS();
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final int QM(Context context) {
        return C20736316Cj.LIZIZ(R.attr.ezn, context);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookSheetFragment, com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptionsIS = super.iS(context);
        sheetOptionsIS.canceledOnTouchOutside = true;
        sheetOptionsIS.LIZ(1, null);
        return sheetOptionsIS;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final void x1(int i) {
        this.LLLI.invoke(Integer.valueOf(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        View childAt;
        RecyclerView recyclerView;
        super.onViewCreated(view, bundle);
        View viewFindViewById = view.findViewById(R.id.f4v);
        if (viewFindViewById != null) {
            C500260Jjc.LJLIIIL(500L, viewFindViewById, new AwS610S0100000_31(this, 36));
        }
        this.LLLILZLLLI = (ViewGroup) view.findViewById(R.id.f52);
        this.LLLIL = (LinearLayout) view.findViewById(R.id.qpo);
        this.LLLIIL = (FrameLayout) view.findViewById(R.id.y_i);
        this.LLLIILIL = (LinearLayout) view.findViewById(R.id.f50);
        this.LLLL = ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).createImagePicker(getActivity(), this, "playbook_cover", 3, 4, 750, LSPassThroughRecordSizeConfig.DEFAULT, new InterfaceC202141147n() { // from class: X.14um
            @Override // X.InterfaceC202141147n
            public final /* synthetic */ void onCanceled() {
            }

            @Override // X.InterfaceC202141147n
            public final void LIZ(String str, String str2) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("filePath=");
                sbLIZ.append(str);
                sbLIZ.append(", originDate=");
                sbLIZ.append(str2);
                C20441214yg.LJIIIZ("PlaybookEditorCoverDialogV2", C2188811AlT.LIZIZ(sbLIZ));
                if (str != null) {
                    PlaybookEditorCoverDialogV2 playbookEditorCoverDialogV2 = this.LIZ;
                    C915190ZvJ c915190ZvJ = C978360bZC.LIZJ;
                    C978360bZC.LJIJ("shoot_cover", "use_photo", playbookEditorCoverDialogV2.LLLF.invoke(), playbookEditorCoverDialogV2.LLLFF.invoke(), playbookEditorCoverDialogV2.LLLFFI.invoke().booleanValue(), null, null);
                    playbookEditorCoverDialogV2.LLLII.invoke(str);
                } else {
                    C766270U4b.LIZLLL(2131851936);
                }
                InterfaceC773010UTz interfaceC773010UTz = this.LIZ.LLLL;
                if (interfaceC773010UTz != null) {
                    ((C202139147l) interfaceC773010UTz).LIZ();
                }
                this.LIZ.close(1);
            }
        }, true, false, true);
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.f4w);
        this.LLLILZ = frameLayout;
        if (frameLayout != null) {
            C500260Jjc.LJLIIIL(500L, frameLayout, new AwS610S0100000_31(this, 37));
        }
        FrameLayout frameLayout2 = (FrameLayout) view.findViewById(R.id.x2w);
        this.LLLILZJ = frameLayout2;
        if (frameLayout2 != null) {
            C500260Jjc.LJLIIIL(500L, frameLayout2, new AwS610S0100000_31(this, 38));
        }
        C20632315oP c20632315oP = (C20632315oP) view.findViewById(R.id.qpq);
        this.LLLIIIL = c20632315oP;
        int i = 0;
        if (c20632315oP != null) {
            childAt = c20632315oP.getChildAt(0);
        } else {
            childAt = null;
        }
        if ((childAt instanceof RecyclerView) && (recyclerView = (RecyclerView) childAt) != null) {
            recyclerView.setItemAnimator(null);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(view.findViewById(R.id.qpl));
        arrayList.add(view.findViewById(R.id.qpm));
        arrayList.add(view.findViewById(R.id.qpn));
        this.LLLIZZ = arrayList;
        for (Object obj : arrayList) {
            int i2 = i + 1;
            if (i >= 0) {
                C500260Jjc.LJLIIIL(500L, (View) obj, new AwS137S0101000_31(i, this, 10));
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        FrameLayout frameLayout3 = this.LLLIIL;
        if (frameLayout3 != null) {
            HandlerHook.viewPost(frameLayout3, new ARunnableS131S0100000_31(this, 159));
        }
        BasePlaybookEditorViewModel basePlaybookEditorViewModel = this.LLJZIJLIL;
        MaterialsGetImagesParams materialsGetImagesParams = new MaterialsGetImagesParams();
        materialsGetImagesParams.getType = 2;
        materialsGetImagesParams.count = 18;
        materialsGetImagesParams.publishPlaybookContent = this.LLL;
        basePlaybookEditorViewModel.wQ2(materialsGetImagesParams, new InterfaceC170900l9<List<? extends PlayImage>>() { // from class: X.00l5
            @Override // X.InterfaceC170900l9
            public final void LIZ(List<? extends PlayImage> list) {
                PlayImage next;
                List<? extends PlayImage> list2 = list;
                PlaybookEditorCoverDialogV2 playbookEditorCoverDialogV2 = this.LIZ;
                playbookEditorCoverDialogV2.LLLLIILL = true;
                List listLJJJIL = C13LP.LJJJIL(list2, 6);
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(listLJJJIL, 10));
                Iterator it2 = listLJJJIL.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new C00UL(new ArrayList((Collection) it2.next())));
                }
                playbookEditorCoverDialogV2.LLLIIIIL = arrayList2;
                this.LIZ.FS();
                PlaybookEditorCoverDialogV2 playbookEditorCoverDialogV22 = this.LIZ;
                playbookEditorCoverDialogV22.getClass();
                Iterator<? extends PlayImage> it3 = list2.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        next = it3.next();
                        PlayImage playImage = next;
                        if (playImage.type == 1 && playImage.status == 1) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                PlayImage playImage2 = next;
                if (playImage2 != null) {
                    playbookEditorCoverDialogV22.BS(playImage2, 1, "checkAIImageStatusAndFetchAIImage");
                }
            }

            @Override // X.InterfaceC170900l9
            public final void onFailed(Throwable th) {
                String message;
                if (th != null) {
                    message = th.getMessage();
                } else {
                    message = null;
                }
                C20441214yg.LJ("PlaybookEditorCoverDialogV2", String.valueOf(message));
            }
        });
        C915190ZvJ c915190ZvJ = C978360bZC.LIZJ;
        C978360bZC.LJIJJLI(this.LLLF.invoke(), "change_cover", this.LLLFF.invoke(), null, this.LLLFFI.invoke().booleanValue());
    }

    public final void BS(PlayImage playImage, int i, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fetchAIPlaybookImage, playImage=");
        sbLIZ.append(playImage);
        sbLIZ.append(", aiGenType=");
        sbLIZ.append(i);
        sbLIZ.append(", source=");
        sbLIZ.append(str);
        C20441214yg.LIZIZ("PlaybookEditorCoverDialogV2", C2188811AlT.LIZIZ(sbLIZ));
        C480460Ism.LIZ().getClass();
        IPlaybookApi iPlaybookApi = (IPlaybookApi) C480460Ism.LIZLLL(IPlaybookApi.class);
        PlaybookImageAIGenParams playbookImageAIGenParams = new PlaybookImageAIGenParams();
        playbookImageAIGenParams.aiGenType = i;
        playbookImageAIGenParams.imageId = playImage.imageId;
        playbookImageAIGenParams.publishPlaybookContent = this.LLL;
        C19487311Lz.LIZJ(C01NB.LIZIZ(iPlaybookApi.genPlaybookAIImage(playbookImageAIGenParams), "PlaybookEditorCoverDialogV2", "genPlaybookAIImage").LJFF(new C0UO0()), (C11NJ) this.LLLJIL.getValue(), new C516201zk(this, 46), new C516201zk(this, 47), 24);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) throws Throwable {
        InterfaceC773010UTz interfaceC773010UTz = this.LLLL;
        boolean zLJII = false;
        if (interfaceC773010UTz != null) {
            zLJII = ((C202139147l) interfaceC773010UTz).LJII(i, i2, intent);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("hasHandleResult=");
        sbLIZ.append(zLJII);
        C20441214yg.LJIIIZ("PlaybookEditorCoverDialogV2", C2188811AlT.LIZIZ(sbLIZ));
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [X.14un] */
    public PlaybookEditorCoverDialogV2(BasePlaybookEditorViewModel basePlaybookEditorViewModel, PublishPlaybookContent publishPlaybookContent, C20371414nQ c20371414nQ, C20370714nJ c20370714nJ, C20370114nD c20370114nD, AwS680S0100000_31 awS680S0100000_31, AwS610S0100000_31 awS610S0100000_31, AwS610S0100000_31 awS610S0100000_312, AwS610S0100000_31 awS610S0100000_313) {
        this.LLJZIJLIL = basePlaybookEditorViewModel;
        this.LLL = publishPlaybookContent;
        this.LLLF = c20371414nQ;
        this.LLLFF = c20370714nJ;
        this.LLLFFI = c20370114nD;
        this.LLLFZ = awS680S0100000_31;
        this.LLLI = awS610S0100000_31;
        this.LLLII = awS610S0100000_312;
        this.LLLIIII = awS610S0100000_313;
    }
}
