package X;

import android.app.Activity;
import android.os.Bundle;
import com.bytedance.als.FeatureAlsLogicContainer;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.EditorProAIGCMediaItemModel;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.EditorProAIGCMediaItemModelStatus;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialog;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialogBuilder;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.RetakeVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editorpro.capabilities.video.adjust.VideoAdjustRootScene;
import com.ss.android.ugc.gamora.editorpro.capabilities.video.smarttrim.SmartTrimFragment;
import com.ss.android.ugc.tools.view.uikit.factory.CreativeDialogWrapper;
import com.ss.ugc.android.editor.base.viewmodel.CutViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AwS214S0300000_5;
import kotlin.jvm.internal.AwS441S0200000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.AwS66S0301000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0E6P, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0E6P extends C0E94 {
    public final C19A3 LLJJIJI;
    public final boolean LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public long LLJJJ;
    public CreativeDialogWrapper LLJJJIL;
    public long LLJJJJ;
    public final C01GW LLJJJJJIL;
    public final List<String> LLJJJJLIIL;
    public final C01GW LLJJL;
    public final C1DRG LLJJLIIIJLLLLLLLZ;

    @Override // X.C0E96, X.C0EHG
    public final void LIZLLL() {
    }

    public final void LJJIIJ() {
        C351510DqH.LJIIIZ(C351510DqH.LIZ, LJIIJ());
        C0E1X c0e1x = new C0E1X(C0E1V.DELETE.getNameId(), null, null, null, null, 30);
        C0E48 c0e48LJIIJ = LJIIJ();
        if (c0e48LJIIJ != null) {
            C350870DpF.LIZJ(c0e48LJIIJ, C051R.LIZIZ(c0e1x));
        }
        C0E48 c0e48LJIIJ2 = LJIIJ();
        if (c0e48LJIIJ2 != null) {
            NLETrackType nLETrackType = NLETrackType.NONE;
            c0e48LJIIJ2.S7().LIZIZ(new C0EB9(null, null), "delete_slot_event", false);
        }
    }

    public final void LJJIIJZLJL() {
        InterfaceC351350Dq1 interfaceC351350Dq1LLFII;
        C19576911iZ c19576911iZ = C19576911iZ.LIZ;
        Activity activityLJIIIZ = LJIIIZ();
        CreativeLoadingDialogBuilder creativeLoadingDialogBuilder = new CreativeLoadingDialogBuilder();
        creativeLoadingDialogBuilder.showProgress(true);
        creativeLoadingDialogBuilder.cancelViewVisibleType(CreativeLoadingDialogBuilder.CancelType.VISIBLE);
        creativeLoadingDialogBuilder.loadingMessage(LJIIIZ().getString(2131834180));
        creativeLoadingDialogBuilder.clickCancelListener(new AwS584S0100000_5(this, 1095));
        this.LLJJJIL = (CreativeDialogWrapper) c19576911iZ.createLoadingDialog(activityLJIIIZ, 1202, creativeLoadingDialogBuilder);
        this.LLJJJJ = System.currentTimeMillis();
        C0E48 c0e48LJIIJ = LJIIJ();
        if (c0e48LJIIJ == null || (interfaceC351350Dq1LLFII = c0e48LJIIJ.LLFII()) == null) {
            return;
        }
        interfaceC351350Dq1LLFII.LJJLI(new InterfaceC351200Dpm() { // from class: X.0E6Q
            @Override // X.InterfaceC351200Dpm
            public final void LIZJ() {
                CreativeDialogWrapper creativeDialogWrapper = this.LIZ.LLJJJIL;
                if (creativeDialogWrapper != null) {
                    creativeDialogWrapper.dismiss();
                }
            }

            @Override // X.InterfaceC351200Dpm
            public final void LIZLLL() {
                CreativeDialogWrapper creativeDialogWrapper = this.LIZ.LLJJJIL;
                if (creativeDialogWrapper != null) {
                    CreativeLoadingDialog.DefaultImpls.updateProgress$default(creativeDialogWrapper, 0, false, 2, null);
                }
                CreativeDialogWrapper creativeDialogWrapper2 = this.LIZ.LLJJJIL;
                if (creativeDialogWrapper2 != null) {
                    creativeDialogWrapper2.show();
                }
            }

            @Override // X.InterfaceC351200Dpm
            public final void LIZ(double d) {
                CreativeDialogWrapper creativeDialogWrapper = this.LIZ.LLJJJIL;
                if (creativeDialogWrapper != null) {
                    CreativeLoadingDialog.DefaultImpls.updateProgress$default(creativeDialogWrapper, (int) (d * ((double) 100)), false, 2, null);
                }
            }

            @Override // X.InterfaceC351200Dpm
            public final void LIZIZ(int i) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                C0E6P c0e6p = this.LIZ;
                long j = jCurrentTimeMillis - c0e6p.LLJJJJ;
                VideoPublishEditModel videoPublishEditModelLJIILLIIL = c0e6p.LJIILLIIL();
                if (videoPublishEditModelLJIILLIIL != null) {
                    C361680EFy.LJLI(videoPublishEditModelLJIILLIIL, this.LIZ.LJIIJ(), j, false, i, 8);
                }
            }

            @Override // X.InterfaceC351200Dpm
            public final void LJ(boolean z) {
                int i;
                if (z) {
                    i = 2131834182;
                } else {
                    i = 2131834179;
                }
                Activity activityLJIIIZ2 = this.LIZ.LJIIIZ();
                CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                creativeToastBuilder.messageRes(i);
                C1390380mHk.LIZ(activityLJIIIZ2, 1082, creativeToastBuilder);
                long jCurrentTimeMillis = System.currentTimeMillis();
                C0E6P c0e6p = this.LIZ;
                long j = jCurrentTimeMillis - c0e6p.LLJJJJ;
                VideoPublishEditModel videoPublishEditModelLJIILLIIL = c0e6p.LJIILLIIL();
                if (videoPublishEditModelLJIILLIIL != null) {
                    C361680EFy.LJLI(videoPublishEditModelLJIILLIIL, this.LIZ.LJIIJ(), j, false, 0, 24);
                }
            }
        });
    }

    public final boolean LJJ() {
        List listLJJLIIIJLJLI;
        C0E48 c0e48LJIIJ;
        String extra;
        C0E48 c0e48LJIIJ2 = LJIIJ();
        if (c0e48LJIIJ2 == null || (listLJJLIIIJLJLI = C351220Dpo.LJJLIIIJLJLI(C350870DpF.LJI(c0e48LJIIJ2))) == null) {
            listLJJLIIIJLJLI = C13BV.INSTANCE;
        }
        int size = listLJJLIIIJLJLI.size();
        NLETimeSpaceNode nLETimeSpaceNode = (NLETimeSpaceNode) C13LP.LJJLIIIJL(listLJJLIIIJLJLI);
        int layer = nLETimeSpaceNode != null ? nLETimeSpaceNode.getLayer() + 1 : 0;
        int iIntValue = ((Number) C0E5G.LIZIZ(EnumC357850E1f.MAX_PIP_TRACK_COUNT, Integer.MAX_VALUE)).intValue();
        C0E48 c0e48LJIIJ3 = LJIIJ();
        boolean z = (c0e48LJIIJ3 == null || (extra = C350870DpF.LJI(c0e48LJIIJ3).getExtra("model_extra_is_pip_count_limit_remind_toasted")) == null) ? false : Boolean.parseBoolean(extra);
        C0E6O c0e6o = C0E6O.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("maxPipTrackLayer=");
        sbLIZ.append(layer);
        C356530DyN.LJ(c0e6o, C2188811AlT.LIZIZ(sbLIZ));
        if (layer > iIntValue) {
            Activity activityLJIIIZ = LJIIIZ();
            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
            creativeToastBuilder.messageRes(2131834142);
            C1390380mHk.LIZ(activityLJIIIZ, 1061, creativeToastBuilder);
            return false;
        }
        if (size == 2 && !z) {
            Activity activityLJIIIZ2 = LJIIIZ();
            CreativeToastBuilder creativeToastBuilder2 = new CreativeToastBuilder();
            creativeToastBuilder2.messageRes(2131850357);
            creativeToastBuilder2.acrossActivities(true);
            C1390380mHk.LIZ(activityLJIIIZ2, 1061, creativeToastBuilder2);
            if (C289180BVc.LIZ(LJIILLIIL()) && (c0e48LJIIJ = LJIIJ()) != null) {
                C350870DpF.LJI(c0e48LJIIJ).setExtra("model_extra_is_pip_count_limit_remind_toasted", "true");
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00a3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIJIIJIL() {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0E6P.LJJIJIIJIL():void");
    }

    public final void LJJIJIL() {
        VideoPublishEditModel videoPublishEditModelLJIILLIIL = LJIILLIIL();
        if (videoPublishEditModelLJIILLIIL != null) {
            C362710EJx c362710EJx = C362710EJx.LIZ;
            C0E48 c0e48LJIIJ = LJIIJ();
            c362710EJx.getClass();
            C362710EJx.LIZ(videoPublishEditModelLJIILLIIL, c0e48LJIIJ, "editorpro_edit");
        }
        C355530Dwl c355530Dwl = new C355530Dwl((EnumC356350Dy5) null, (NLETrack) null, 0L, "editorpro_edit", 15);
        C0E48 c0e48LJIIJ2 = LJIIJ();
        if (c0e48LJIIJ2 == null) {
            return;
        }
        C375820EoO.LIZ(this.LL, c0e48LJIIJ2, C364870ESf.class, new C360010E9n(c355530Dwl, c0e48LJIIJ2), 16);
    }

    public final void LJJIJL() {
        C0E48 c0e48LJIIJ;
        C0E55 player;
        C0E48 c0e48LJIIJ2 = LJIIJ();
        if (c0e48LJIIJ2 != null && (player = c0e48LJIIJ2.getPlayer()) != null) {
            player.pause(false);
        }
        if (this.LLJJIJI == null || (c0e48LJIIJ = LJIIJ()) == null) {
            return;
        }
        C375820EoO.LIZ(this.LLJJIJI, c0e48LJIIJ, VideoAdjustRootScene.class, null, 24);
    }

    @Override // X.C0EHG
    public final boolean LJ(C361980EHc c361980EHc) {
        return this.LLJJJJLIIL.contains(c361980EHc.LJI);
    }

    public final void LJJI(AwS214S0300000_5 awS214S0300000_5) {
        Integer numValueOf;
        C0EGC c0egcLJIILL;
        NLETrack nLETrackPt;
        VecNLETrackSlotSPtr sortedSlots;
        int iIndexOf;
        NLETrack nLETrackRn;
        VecNLETrackSlotSPtr slots;
        NLETrack nLETrackPt2;
        C0E48 c0e48LJIIJ = LJIIJ();
        if (c0e48LJIIJ != null && (nLETrackPt2 = c0e48LJIIJ.Pt()) != null && !nLETrackPt2.getMainTrack()) {
            return;
        }
        C0E48 c0e48LJIIJ2 = LJIIJ();
        NLETrackSlot nLETrackSlotLLLLLLIL = null;
        if (c0e48LJIIJ2 != null && (nLETrackRn = c0e48LJIIJ2.Rn()) != null && (slots = nLETrackRn.getSlots()) != null) {
            numValueOf = Integer.valueOf(slots.size());
            if (numValueOf != null && numValueOf.intValue() == 1) {
                VideoPublishEditModel videoPublishEditModelLJIILLIIL = LJIILLIIL();
                if (videoPublishEditModelLJIILLIIL != null) {
                    C361680EFy.LJJJJL(videoPublishEditModelLJIILLIIL, LJIIJ());
                }
                Activity activityLJIIIZ = LJIIIZ();
                CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                creativeToastBuilder.messageRes(2131834141);
                C1390380mHk.LIZ(activityLJIIIZ, 1039, creativeToastBuilder);
                return;
            }
        } else {
            numValueOf = null;
        }
        C0E48 c0e48LJIIJ3 = LJIIJ();
        if (c0e48LJIIJ3 != null && c0e48LJIIJ3.LLLLLLIL() != null) {
            if (numValueOf != null && numValueOf.intValue() == 2 && (c0egcLJIILL = LJIILL()) != null && c0egcLJIILL.a1()) {
                C0E48 c0e48LJIIJ4 = LJIIJ();
                if (c0e48LJIIJ4 != null) {
                    nLETrackPt = c0e48LJIIJ4.Pt();
                } else {
                    nLETrackPt = null;
                }
                C0E48 c0e48LJIIJ5 = LJIIJ();
                if (c0e48LJIIJ5 != null) {
                    nLETrackSlotLLLLLLIL = c0e48LJIIJ5.LLLLLLIL();
                }
                if (nLETrackPt != null && (sortedSlots = nLETrackPt.getSortedSlots()) != null && (iIndexOf = sortedSlots.indexOf(nLETrackSlotLLLLLLIL)) != -1 && LJJ()) {
                    AwS66S0301000_5 awS66S0301000_5 = new AwS66S0301000_5(iIndexOf, nLETrackPt, this, awS214S0300000_5, 4);
                    C1397580mTM c1397580mTM = new C1397580mTM(LJIIIZ());
                    c1397580mTM.LJII = false;
                    c1397580mTM.LIZ(2131850353);
                    C985403tE.LIZ(c1397580mTM, new AwS584S0100000_5(awS66S0301000_5, 1097));
                    new C1397510mTF(c1397580mTM).LIZLLL();
                    return;
                }
                return;
            }
            if (LJJ()) {
                awS214S0300000_5.invoke(null);
            }
        }
    }

    public final void LJJII(NLETrackSlot nLETrackSlot) {
        InterfaceC377650ErL interfaceC377650ErL;
        String strLIZIZ;
        EnumC356070Dxd enumC356070Dxd;
        ICreationAsyncTaskManager iCreationAsyncTaskManagerLIZ;
        C1DRG c1drg = this.LLJJLIIIJLLLLLLLZ;
        if (c1drg != null && (interfaceC377650ErL = (InterfaceC377650ErL) c1drg.LJIIL(null, InterfaceC377650ErL.class)) != null) {
            if (nLETrackSlot == null || (strLIZIZ = C377740ErU.LIZIZ(nLETrackSlot)) == null) {
                strLIZIZ = "";
            }
            boolean zLJJIJIIJI = LJJIJIIJI(strLIZIZ);
            String strMd0 = interfaceC377650ErL.md0(strLIZIZ, null);
            if (zLJJIJIIJI && strMd0.length() > 0 && (iCreationAsyncTaskManagerLIZ = C09BV.LIZ()) != null) {
                iCreationAsyncTaskManagerLIZ.LJII(strMd0);
            }
            CutViewModel cutViewModelLJIILJJIL = LJIILJJIL();
            if (cutViewModelLJIILJJIL != null) {
                if (zLJJIJIIJI) {
                    enumC356070Dxd = EnumC356070Dxd.DONE;
                } else {
                    enumC356070Dxd = EnumC356070Dxd.COMMIT;
                }
                cutViewModelLJIILJJIL.deleteClip(null, enumC356070Dxd);
            }
            interfaceC377650ErL.et1(strMd0, new C377390Eqv(false, false, true, false, 11));
            interfaceC377650ErL.rX0(strLIZIZ, null, new C377390Eqv(false, false, true, false, 11));
            C377150EqX c377150EqX = C377150EqX.LIZ;
            List listLIZLLL = C377150EqX.LIZLLL(LJIILLIIL(), strLIZIZ, null, C1697810uHb.LJIIJJI(EditorProAIGCMediaItemModelStatus.LOADING, EditorProAIGCMediaItemModelStatus.ERROR));
            ArrayList<EditorProAIGCMediaItemModel> arrayList = new ArrayList();
            for (Object obj : listLIZLLL) {
                if (((EditorProAIGCMediaItemModel) obj).status != EditorProAIGCMediaItemModelStatus.CANCEL) {
                    arrayList.add(obj);
                }
            }
            for (EditorProAIGCMediaItemModel editorProAIGCMediaItemModel : arrayList) {
                editorProAIGCMediaItemModel.previousStatus = editorProAIGCMediaItemModel.status;
                editorProAIGCMediaItemModel.status = EditorProAIGCMediaItemModelStatus.CANCEL;
            }
        }
    }

    public final void LJJIII(boolean z) {
        NLETrackSlot nLETrackSlotLLLLLLIL;
        NLEModel nLEModelLJI;
        C0F1Z c0f1z = C0F1Z.LIZ;
        C0E48 c0e48LJIIJ = LJIIJ();
        c0f1z.getClass();
        RetakeVideoContext retakeVideoContextLIZJ = C0F1Z.LIZJ(c0e48LJIIJ, z, false);
        if (retakeVideoContextLIZJ != null) {
            VideoPublishEditModel videoPublishEditModelLJIILLIIL = LJIILLIIL();
            if (videoPublishEditModelLJIILLIIL == null) {
                return;
            }
            C0E48 c0e48LJIIJ2 = LJIIJ();
            c0f1z.getClass();
            C0F1Z.LJ(c0e48LJIIJ2, retakeVideoContextLIZJ);
            C0E48 c0e48LJIIJ3 = LJIIJ();
            if (c0e48LJIIJ3 != null) {
                C350870DpF.LJI(c0e48LJIIJ3);
                C361680EFy.LJLJI("enter_reshoot_video_time", String.valueOf(System.currentTimeMillis()));
            }
            C1438840nXu c1438840nXu = C1438840nXu.LIZ;
            C19EG c19egLJ = C12WG.LJ(this.LL);
            C0E48 c0e48LJIIJ4 = LJIIJ();
            if (c0e48LJIIJ4 != null) {
                nLEModelLJI = C350870DpF.LJI(c0e48LJIIJ4);
            } else {
                nLEModelLJI = null;
            }
            C1438900nY0 c1438900nY0 = new C1438900nY0(c19egLJ, retakeVideoContextLIZJ, videoPublishEditModelLJIILLIIL, true, nLEModelLJI);
            c1438840nXu.getClass();
            C1438840nXu.LIZ(c1438900nY0);
        }
        C0E48 c0e48LJIIJ5 = LJIIJ();
        if (c0e48LJIIJ5 != null && (nLETrackSlotLLLLLLIL = c0e48LJIIJ5.LLLLLLIL()) != null) {
            nLETrackSlotLLLLLLIL.setAIMatting(null);
            CopyOnWriteArraySet<InterfaceC354120DuU> copyOnWriteArraySet = C354090DuR.LIZ;
            C354090DuR.LJIILL(LJIIJ());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIIZ(X.C1DRG r6) {
        /*
            r5 = this;
            X.19A3 r0 = r5.LL
            if (r0 != 0) goto L5
            return
        L5:
            X.0EI4 r4 = X.C0EI4.LIZ
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r3 = r5.LJIILLIIL()
            X.0E48 r0 = r5.LJIIJ()
            r2 = 0
            if (r0 == 0) goto L45
            com.bytedance.ies.nle.editor_jni.NLETrack r0 = r0.Pt()
            if (r0 == 0) goto L45
            boolean r1 = r0.getMainTrack()
            r0 = 1
            if (r1 != r0) goto L45
        L1f:
            r4.getClass()
            X.C0EI4.LJII(r3, r0)
            X.0E5S r0 = r5.LJIIZILJ()
            if (r0 == 0) goto L2e
            r0.QD2(r2, r2)
        L2e:
            X.0E48 r4 = r5.LJIIJ()
            if (r4 == 0) goto L44
            X.19A3 r3 = r5.LL
            java.lang.Class<com.ss.android.ugc.gamora.editorpro.capabilities.portrait.cutout.CutoutRootScene> r2 = com.ss.android.ugc.gamora.editorpro.capabilities.portrait.cutout.CutoutRootScene.class
            X.0DzZ r1 = new X.0DzZ
            X.19A3 r0 = r5.LL
            r1.<init>(r0, r6, r4)
            r0 = 16
            X.C375820EoO.LIZ(r3, r4, r2, r1, r0)
        L44:
            return
        L45:
            r0 = 0
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0E6P.LJJIIZ(X.1DRG):void");
    }

    public final void LJJIIZI(C361980EHc c361980EHc) {
        NLETrackSlot nLETrackSlotLLLLLLIL;
        if (!c361980EHc.LJII || C0OBG.LIZIZ(C12WG.LJ(this.LL).findViewById(this.LLILLL))) {
            return;
        }
        VideoPublishEditModel videoPublishEditModelLJIILLIIL = LJIILLIIL();
        if (videoPublishEditModelLJIILLIIL != null) {
            C361680EFy.LJJJI("cutout", videoPublishEditModelLJIILLIIL, LJIIJ(), null, false, false, null, null, 1016);
        }
        C0E48 c0e48LJIIJ = LJIIJ();
        if (c0e48LJIIJ != null && (nLETrackSlotLLLLLLIL = c0e48LJIIJ.LLLLLLIL()) != null) {
            C0E0S c0e0s = C0E0S.LIZ;
            VideoPublishEditModel videoPublishEditModelLJIILLIIL2 = LJIILLIIL();
            C19EG c19egLJIIJJI = LJIIJJI();
            AwS441S0200000_5 awS441S0200000_5 = new AwS441S0200000_5(this, nLETrackSlotLLLLLLIL, 12);
            c0e0s.getClass();
            C0E0S.LIZLLL(videoPublishEditModelLJIILLIIL2, c19egLJIIJJI, nLETrackSlotLLLLLLIL, awS441S0200000_5);
        }
    }

    public final void LJJIJ(boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("is_main_menu_smart_trim", z);
        SmartTrimFragment smartTrimFragment = new SmartTrimFragment();
        smartTrimFragment.setArguments(bundle);
        LJIIL(smartTrimFragment);
    }

    public final boolean LJJIJIIJI(String str) {
        EditorProAIGCMediaItemModel next;
        C377150EqX c377150EqX = C377150EqX.LIZ;
        VideoPublishEditModel videoPublishEditModelLJIILLIIL = LJIILLIIL();
        if (videoPublishEditModelLJIILLIIL == null || str.length() == 0) {
            return true;
        }
        Iterator<EditorProAIGCMediaItemModel> it2 = videoPublishEditModelLJIILLIIL.creativeModel.editorProAIGCInfoModel.editorProAIGCMediaItemModelList.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                EditorProAIGCMediaItemModel editorProAIGCMediaItemModel = next;
                if (Intrinsics.LJFF(editorProAIGCMediaItemModel.epAIGCId, str) && editorProAIGCMediaItemModel.status == EditorProAIGCMediaItemModelStatus.LOADING) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        EditorProAIGCMediaItemModel editorProAIGCMediaItemModel2 = next;
        if (editorProAIGCMediaItemModel2 == null || ((int) editorProAIGCMediaItemModel2.progress) <= 5) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x020a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIFFI(com.bytedance.ies.nle.editor_jni.NLETrackSlot r18, boolean r19) {
        /*
            Method dump skipped, instruction units count: 634
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0E6P.LJJIFFI(com.bytedance.ies.nle.editor_jni.NLETrackSlot, boolean):void");
    }

    public C0E6P(C1DRG c1drg, C19A3 c19a3, boolean z) {
        super(c19a3, c1drg);
        this.LLJJIJI = c19a3;
        this.LLJJIJIIJIL = z;
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1537));
        this.LLJJJJ = -1L;
        this.LLJJJJJIL = C452501pT.LIZIZ(new AwS549S0100000_5(c1drg, 1543));
        this.LLJJJJLIIL = C1697810uHb.LJIILJJIL("bottom_item_root_edit", "bottom_item_edit_adjust", "bottom_item_edit_switch_to_pip", "bottom_item_edit_split", "bottom_item_edit_copy", "bottom_item_edit_speed", "bottom_item_edit_volume", "bottom_item_edit_reduce_noise", "bottom_item_edit_replace", "bottom_item_edit_segment_effect", "bottom_item_edit_crop", "bottom_item_edit_rotate", "bottom_item_edit_delete", "bottom_item_edit_start_over", "bottom_item_edit_black_slot_delete", "bottom_item_edit_voice_effect", "bottom_item_edit_cutout", "bottom_item_edit_background", "bottom_item_video_transition", "bottom_item_edit_smart_trim", "bottom_item_root_smart_trim", "bottom_item_edit_video_anim", "bottom_item_edit_adjust_filter", "bottom_item_edit_retouch", "bottom_item_edit_filter", "bottom_item_edit_freeze", "bottom_item_edit_reverse_video", "bottom_item_edit_mask", "bottom_item_free_layer");
        this.LLJJL = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(389));
        this.LLJJLIIIJLLLLLLLZ = ((FeatureAlsLogicContainer) C1664600tQ2.LJ(c19a3)).LLJJI;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:308:0x05f3  */
    @Override // X.C0EHG
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(X.C361980EHc r24, android.view.View r25, java.util.Map<java.lang.String, java.lang.String> r26) {
        /*
            Method dump skipped, instruction units count: 2442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0E6P.LIZJ(X.0EHc, android.view.View, java.util.Map):void");
    }
}
