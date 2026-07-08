package X;

import Y.AObserverS207S0100000_3;
import Y.AObserverS209S0100000_5;
import android.content.Context;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import com.bytedance.ies.nle.editor_jni.INLEPlayer;
import com.bytedance.ies.nle.editor_jni.NLEBranch;
import com.bytedance.ies.nle.editor_jni.NLECommit;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.cktemplate.download.WuZhuiDownloader;
import com.ss.android.ugc.aweme.cktemplate.resource.ITemplateResourceDownloaderService;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editorpro.components.asyncedit.logic.AsyncTasksPanelViewModel;
import com.ss.android.ugc.gamora.editorpro.framework.datastore.EditModelProvider;
import com.ss.ugc.android.davinciresource.DavinciResourceLibraryLoader;
import com.ss.ugc.android.davinciresource.jni.AlgorithmResourceFinder;
import com.ss.ugc.android.davinciresource.jni.DAVUnZipFunc;
import com.ss.ugc.android.editor.components.base.api.IMagicProcessorService;
import com.ss.ugc.android.editor.core.tracklinkage.TrackLinkageManagerProvider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AwS406S0200000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0Dyg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C356720Dyg extends AbstractC2255721DQs<C0E0G> implements C0E0G, InterfaceC379610EuV {
    public static final C356780Dym LLJJI;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIII;
    public static final int LLJJIJI;
    public final C19A3 LL;
    public final C1DRG LLILLJJLI;
    public final C372830EjZ LLILLL;
    public boolean LLILZ;
    public Context LLILZIL;
    public LifecycleOwner LLILZLL;
    public boolean LLJILJIL;
    public C09AE LLJILLL;
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 350));
    public final InterfaceC1731706qJ LLIZLLLIL = C1664770tQJ.LIZ(getDiContainer(), C0EGY.class, null);
    public final InterfaceC1731706qJ LLJ = C1664770tQJ.LIZIZ(getDiContainer(), C0E5S.class, null);
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS549S0100000_5(this, 349));
    public boolean LLJIJIL = true;
    public final Set<String> LLJILJILJ = new LinkedHashSet();
    public final Map<String, Pair<String, String>> LLJJ = new LinkedHashMap();

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0Dym] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C356720Dyg.class, "bottomBarApiComponent", "getBottomBarApiComponent()Lcom/ss/android/ugc/gamora/editorpro/framework/bottombar/ui/BottomBarApiComponent;", 0);
        C13LE.LIZ.getClass();
        LLJJIII = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C356720Dyg.class, "trackApi", "getTrackApi()Lcom/ss/android/ugc/gamora/editorpro/framework/track/api/TrackPanelApi;", 0)};
        LLJJI = new Object() { // from class: X.0Dym
        };
        LLJJIJI = 8;
    }

    public C0E0G G2() {
        return this;
    }

    @Override // X.C0E0G
    public void yg1() {
        long[] jArr = new long[2];
        C0E48 c0e48C3 = c3();
        if (c0e48C3 != null) {
            c0e48C3.Bq(jArr);
        }
        C01TT.LIZJ(new AwS406S0200000_5(this, jArr, 46));
    }

    private final AsyncTasksPanelViewModel H2() {
        return (AsyncTasksPanelViewModel) this.LLJI.getValue();
    }

    private final LifecycleOwner i3() {
        LifecycleOwner lifecycleOwner = this.LLILZLL;
        if (lifecycleOwner != null) {
            return lifecycleOwner;
        }
        Context context = this.LLILZIL;
        if (context instanceof C19EG) {
            return (C19FO) context;
        }
        return null;
    }

    @Override // X.C0E0G
    public void Hs() {
        EditModelProvider.Companion.getClass();
        InterfaceC356750Dyj magicProcessorManager$tools_camera_edit_release = C0E1T.LIZ().getMagicProcessorManager$tools_camera_edit_release();
        if (magicProcessorManager$tools_camera_edit_release != null) {
            magicProcessorManager$tools_camera_edit_release.Hs();
        }
    }

    public final C0EGY T2() {
        return (C0EGY) this.LLIZLLLIL.getValue(this, LLJJIII[0]);
    }

    public final void W1() {
        C201955140j.LIZLLL(C563650M8t.LIZIZ, "MagicDataLogicComponent", "cancelObserveTaskStatus");
        C09AE c09ae = this.LLJILLL;
        if (c09ae != null) {
            c09ae.LIZIZ(null);
        }
        this.LLJILLL = null;
    }

    public final void Z1() {
        C0E48 c0e48C3;
        if (((Boolean) C0E5G.LIZIZ(EnumC357850E1f.ENABLE_OPERATE_CAUSE_BLACK_SLOT, Boolean.TRUE)).booleanValue() || (c0e48C3 = c3()) == null) {
            return;
        }
        C351510DqH.LJIIIZ(C351510DqH.LIZ, c0e48C3);
    }

    public final C0E48 c3() {
        return (C0E48) this.LLIZ.getValue();
    }

    public final VideoPublishEditModel getEditModel() {
        EditModelProvider.Companion.getClass();
        EditModelProvider editModelProviderLIZIZ = C0E1T.LIZIZ();
        if (editModelProviderLIZIZ != null) {
            return editModelProviderLIZIZ.getEditModel();
        }
        return null;
    }

    public final C0E5S q3() {
        return (C0E5S) this.LLJ.getValue(this, LLJJIII[1]);
    }

    @Override // X.C0E0G
    public void qn0() {
        EditModelProvider.Companion.getClass();
        InterfaceC356750Dyj magicProcessorManager$tools_camera_edit_release = C0E1T.LIZ().getMagicProcessorManager$tools_camera_edit_release();
        if (magicProcessorManager$tools_camera_edit_release != null) {
            magicProcessorManager$tools_camera_edit_release.clear();
        }
    }

    private final void E3() {
        C0E48 c0e48C3;
        MutableLiveData mutableLiveDataLIZ;
        if (i3() == null || (c0e48C3 = c3()) == null || (mutableLiveDataLIZ = c0e48C3.S7().LIZ("video_drag")) == null) {
            return;
        }
        mutableLiveDataLIZ.observe(this.LL, new AObserverS207S0100000_3(this, 5));
    }

    private final C0E55 getPlayer() {
        C0E48 c0e48C3 = c3();
        if (c0e48C3 != null) {
            return c0e48C3.getPlayer();
        }
        return null;
    }

    private final void v3() {
        AsyncTasksPanelViewModel asyncTasksPanelViewModelH2;
        MutableLiveData<C377380Equ> mutableLiveData;
        LifecycleOwner lifecycleOwnerI3 = i3();
        if (lifecycleOwnerI3 == null || (asyncTasksPanelViewModelH2 = H2()) == null || (mutableLiveData = asyncTasksPanelViewModelH2.LLJJJ) == null) {
            return;
        }
        mutableLiveData.observe(lifecycleOwnerI3, new AObserverS209S0100000_5(this, 37));
    }

    public final void B3() {
        if (getCreationId().length() == 0) {
            return;
        }
        W1();
        C201955140j.LIZLLL(C563650M8t.LIZIZ, "MagicDataLogicComponent", "observeTaskStatus");
        this.LLJILLL = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C2330909Bj(this, null), 3);
    }

    public final NLEModel LLZ() {
        C0E48 c0e48C3 = c3();
        if (c0e48C3 != null) {
            return C350870DpF.LJI(c0e48C3);
        }
        return null;
    }

    public final String getCreationId() {
        String creationId;
        VideoPublishEditModel editModel = getEditModel();
        return (editModel == null || (creationId = editModel.getCreationId()) == null) ? "" : creationId;
    }

    public final NLEEditor m3() {
        C0E48 c0e48C3 = c3();
        if (c0e48C3 != null) {
            return c0e48C3.LLFII().LJI();
        }
        return null;
    }

    @Override // X.C0E0G
    public boolean NB1() {
        return this.LLILZ;
    }

    @Override // X.C0E0G
    public boolean g61() {
        return this.LLJILJIL;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        G2();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLILLJJLI;
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
    }

    @Override // X.C0E0G
    public C372830EjZ xj() {
        return this.LLILLL;
    }

    private final void Q3(NLETrackSlot nLETrackSlot) {
        NLESegmentVideo nLESegmentVideoDynamicCast;
        if (nLETrackSlot.hasExtra("ep_magic_pre_magic_clip_end") || (nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment())) == null) {
            return;
        }
        nLETrackSlot.setExtra("ep_magic_pre_magic_clip_end", String.valueOf(nLESegmentVideoDynamicCast.getTimeClipEnd()));
    }

    private final C357530Dzz W2(Context context) {
        WuZhuiDownloader wuZhuiDownloaderLIZ;
        EditModelProvider.Companion.getClass();
        VideoPublishEditModel editModel = C0E1T.LIZ().getEditModel();
        CreativeInfo creativeInfo = null;
        if (editModel != null) {
            creativeInfo = editModel.getCreativeInfo();
        }
        C13W0 c13w0 = new C13W0(context, creativeInfo);
        C356740Dyi c356740Dyi = new C356740Dyi();
        c356740Dyi.LIZ = c13w0;
        ITemplateResourceDownloaderService iTemplateResourceDownloaderService = AnonymousClass0962.LIZ;
        if (iTemplateResourceDownloaderService != null && (wuZhuiDownloaderLIZ = iTemplateResourceDownloaderService.LIZ()) != null) {
            c356740Dyi.LJFF = wuZhuiDownloaderLIZ;
        }
        c356740Dyi.LIZIZ = c13w0;
        c356740Dyi.LIZJ = c13w0;
        c356740Dyi.LIZLLL = c13w0;
        c356740Dyi.LJ = c13w0;
        return c356740Dyi.LIZ();
    }

    private final void X1(NLETrackSlot nLETrackSlot) {
        nLETrackSlot.removeExtraWithKey("ep_magic_pre_magic_clip_end");
    }

    private final void w2(long j) {
        C0E48 c0e48C3 = c3();
        if (c0e48C3 == null) {
            return;
        }
        long maxEnd = c0e48C3.Rn().getMaxEnd();
        C563650M8t c563650M8t = C563650M8t.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fixBgmTracks: ");
        sbLIZ.append(j);
        sbLIZ.append(' ');
        sbLIZ.append(maxEnd);
        C201955140j.LIZLLL(c563650M8t, "MagicDataLogicComponent", C2188811AlT.LIZIZ(sbLIZ));
        if (maxEnd > j) {
            C351510DqH.LIZ.getClass();
            C351510DqH.LIZIZ(j, c0e48C3);
        }
    }

    @Override // X.C0E0G
    public void Ax0(boolean z) {
        this.LLILZ = z;
    }

    @Override // X.C0E0G
    public void H32(C354510Dv7 c354510Dv7) {
        String uuid;
        NLETrackSlot nLETrackSlotLLLLLLIL;
        String uuid2;
        NLEBranch branch;
        NLECommit head;
        String uuid3;
        C0E48 c0e48C3;
        NLETrackSlot nLETrackSlotLLLLLLIL2;
        NLEBranch branch2;
        NLECommit head2;
        C0E1X c0e1x = new C0E1X(C0E1V.ASYNC_TASK.getNameId(), null, null, c354510Dv7.LIZ, null, 22);
        NLEEditor nLEEditorM3 = m3();
        String str = "";
        if (nLEEditorM3 == null || (branch2 = nLEEditorM3.getBranch()) == null || (head2 = branch2.getHead()) == null || (uuid = head2.getUUID()) == null) {
            uuid = "";
        }
        if (c354510Dv7.LJIIJJI != null && !C357030DzB.LIZ(c354510Dv7) && (c0e48C3 = c3()) != null && (nLETrackSlotLLLLLLIL2 = c0e48C3.LLLLLLIL()) != null) {
            nLETrackSlotLLLLLLIL2.setExtra("is_video_apply_photo_magic", "true");
            NLEEditor nLEEditorM32 = m3();
            if (nLEEditorM32 != null) {
                nLEEditorM32.commit();
            }
        }
        NLEEditor nLEEditorM33 = m3();
        if (nLEEditorM33 != null) {
            C350410DoV.LIZLLL(nLEEditorM33, true, C051R.LIZIZ(c0e1x), false, true);
        }
        NLEEditor nLEEditorM34 = m3();
        if (nLEEditorM34 != null && (branch = nLEEditorM34.getBranch()) != null && (head = branch.getHead()) != null && (uuid3 = head.getUUID()) != null) {
            str = uuid3;
        }
        C0E48 c0e48C32 = c3();
        if (c0e48C32 != null && (nLETrackSlotLLLLLLIL = c0e48C32.LLLLLLIL()) != null && (uuid2 = nLETrackSlotLLLLLLIL.getUUID()) != null) {
            this.LLJJ.put(uuid2, new Pair<>(uuid, str));
            C563650M8t c563650M8t = C563650M8t.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("doneMagicAsync ");
            sbLIZ.append(uuid);
            sbLIZ.append(' ');
            sbLIZ.append(str);
            C201955140j.LIZLLL(c563650M8t, "MagicDataLogicComponent", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    @Override // X.C0E0G
    public void WS0(boolean z) {
        this.LLJILJIL = z;
    }

    @Override // X.C0E0G
    public String fw1(NLETrackSlot nLETrackSlot) {
        String extra;
        if (nLETrackSlot == null) {
            C0E48 c0e48C3 = c3();
            if (c0e48C3 != null) {
                nLETrackSlot = c0e48C3.LLLLLLIL();
            } else {
                nLETrackSlot = null;
            }
        }
        if (nLETrackSlot == null || !nLETrackSlot.hasExtra("ep_magic_resource_id") || (extra = nLETrackSlot.getExtra("ep_magic_resource_id")) == null) {
            return "";
        }
        return extra;
    }

    @Override // X.C0E0G
    public String jo2(NLETrackSlot nLETrackSlot) {
        String extra;
        if (nLETrackSlot == null) {
            C0E48 c0e48C3 = c3();
            if (c0e48C3 != null) {
                nLETrackSlot = c0e48C3.LLLLLLIL();
            } else {
                nLETrackSlot = null;
            }
        }
        if (nLETrackSlot == null || !nLETrackSlot.hasExtra("ep_magic_effect_id") || (extra = nLETrackSlot.getExtra("ep_magic_effect_id")) == null) {
            return "";
        }
        return extra;
    }

    public final void z4(NLETrackSlot nLETrackSlot) {
        String uuid;
        InterfaceC359850E8x interfaceC359850E8xB20;
        NLETrackSlot nLETrackSlotLLLLLLIL;
        String uuid2 = nLETrackSlot.getUUID();
        C0E48 c0e48C3 = c3();
        if (c0e48C3 != null && (nLETrackSlotLLLLLLIL = c0e48C3.LLLLLLIL()) != null) {
            uuid = nLETrackSlotLLLLLLIL.getUUID();
        } else {
            uuid = null;
        }
        if (Intrinsics.LJFF(uuid2, uuid) && (interfaceC359850E8xB20 = T2().B20()) != null) {
            interfaceC359850E8xB20.LIZLLL(new String[]{"bottom_item_edit_split", "bottom_item_edit_replace", "bottom_item_edit_speed", "bottom_item_edit_crop", "bottom_item_edit_video_anim", "bottom_item_edit_rotate", "bottom_item_edit_filter", "bottom_item_edit_adjust_filter", "bottom_item_edit_voice_effect"});
        }
    }

    @Override // X.C0E0G
    public String zF1(NLETrackSlot nLETrackSlot) {
        String extra;
        C0E48 c0e48C3;
        if ((nLETrackSlot != null || ((c0e48C3 = c3()) != null && (nLETrackSlot = c0e48C3.LLLLLLIL()) != null)) && (extra = nLETrackSlot.getExtra("ep_magic_category_id")) != null) {
            return extra;
        }
        return "";
    }

    private final void e4(C0E48 c0e48, NLEModel nLEModel) {
        NLETrack nLETrackRn;
        boolean z;
        boolean z2;
        boolean z3;
        NLETrack mainTrack = nLEModel.getMainTrack();
        if (mainTrack == null) {
            return;
        }
        long measuredEndTime = mainTrack.getMeasuredEndTime() - mainTrack.getMeasuredStartTime();
        if (measuredEndTime <= 0 || (nLETrackRn = c0e48.Rn()) == null) {
            return;
        }
        long measuredStartTime = nLETrackRn.getMeasuredStartTime();
        long measuredEndTime2 = nLETrackRn.getMeasuredEndTime();
        NLEModel nLEModelLJI = C350870DpF.LJI(c0e48);
        VecNLETrackSPtr tracks = nLEModelLJI.getTracks();
        ArrayList arrayList = new ArrayList();
        for (NLETrack nLETrack : tracks) {
            NLETrack nLETrack2 = nLETrack;
            if (nLETrack2.getEnable() && C351220Dpo.LLIILZL(nLETrack2)) {
                arrayList.add(nLETrack);
            }
        }
        Iterator it2 = arrayList.iterator();
        boolean z4 = false;
        while (it2.hasNext()) {
            for (NLETrackSlot nLETrackSlot : ((NLETrack) it2.next()).getSlots()) {
                if (Math.abs(nLETrackSlot.getDuration() - measuredEndTime) <= 50000) {
                    z = true;
                } else {
                    z = false;
                }
                if (nLETrackSlot.getEndTime() > measuredEndTime2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (Math.abs(nLETrackSlot.getStartTime() - measuredStartTime) <= 100000) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z || (z2 && z3)) {
                    nLETrackSlot.setStartTime(measuredStartTime);
                    nLETrackSlot.setEndTime(measuredEndTime2);
                    Iterator it3 = C351220Dpo.LJIIIIZZ(nLEModelLJI, nLETrackSlot).iterator();
                    while (it3.hasNext()) {
                        for (NLETrackSlot nLETrackSlot2 : ((NLETrack) it3.next()).getSlots()) {
                            nLETrackSlot2.setStartTime(measuredStartTime);
                            nLETrackSlot2.setEndTime(measuredEndTime2);
                        }
                    }
                    z4 = true;
                }
            }
        }
        if (z4) {
            C350870DpF.LIZ(c0e48, false);
        }
    }

    @Override // X.C0E0G
    public void X91(C0E1V c0e1v, String str) {
        NLETrackSlot nLETrackSlotLLLLLLIL;
        C0E48 c0e48C3 = c3();
        if (c0e48C3 != null && (nLETrackSlotLLLLLLIL = c0e48C3.LLLLLLIL()) != null) {
            C353560Dta.LIZ.getClass();
            C353560Dta.LJIIJJI(c0e48C3);
            X1(nLETrackSlotLLLLLLIL);
            C350410DoV.LIZLLL(c0e48C3.LLFII().LJI(), true, C051R.LIZIZ(new C0E1X(c0e1v.getNameId(), null, null, str, null, 22)), false, true);
            c0e48C3.getPlayer().pause(false);
        }
    }

    @Override // X.C0E0G
    public void hY0(Context context, LifecycleOwner lifecycleOwner) {
        AbstractC354420Duy c354410Dux;
        CreativeInfo creativeInfo;
        VideoPublishEditModel editModel;
        INLEPlayer playerApi;
        CreativeInfo creativeInfo2;
        VideoPublishEditModel editModel2;
        this.LLILZIL = context;
        this.LLILZLL = lifecycleOwner;
        IMagicProcessorService iMagicProcessorService = (IMagicProcessorService) C792600V7i.LIZ(IMagicProcessorService.class);
        if (iMagicProcessorService != null) {
            DavinciResourceLibraryLoader.INSTANCE.loadLibrary();
            InterfaceC356750Dyj magicProcessorManager = iMagicProcessorService.getMagicProcessorManager();
            C0E48 c0e48C3 = c3();
            if (c0e48C3 != null) {
                magicProcessorManager.LIZLLL(context, W2(context), new DAVUnZipFunc() { // from class: X.08ni
                    public final boolean renameFile(String str, String str2) {
                        if (new C0VSJ(str2).exists()) {
                            C08QA.LJIIZILJ(new C0VSJ(str2));
                        }
                        C0VSJ c0vsj = new C0VSJ(str);
                        C0VSJ c0vsj2 = new C0VSJ(str2);
                        if (!c0vsj.exists()) {
                            return false;
                        }
                        return c0vsj.renameTo(c0vsj2);
                    }

                    @Override // com.ss.ugc.android.davinciresource.jni.DAVUnZipFunc
                    public final boolean unZip(String str, String str2, boolean z) {
                        String str3 = "";
                        boolean zRenameFile = false;
                        if (str != null && !a0.LJJJIL(str) && str2 != null && !a0.LJJJIL(str2)) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(str2);
                            sbLIZ.append("_temp");
                            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                            C0VSJ c0vsj = new C0VSJ(strLIZIZ);
                            if (c0vsj.exists()) {
                                c0vsj.delete();
                            }
                            try {
                                C13SB.LJIJJLI(str, strLIZIZ);
                                zRenameFile = renameFile(c0vsj.getAbsolutePath(), str2);
                                if (z) {
                                    new C0VSJ(str).delete();
                                    return zRenameFile;
                                }
                            } catch (C2225308nj e) {
                                TryCatchGuardChecker.doCheck(e);
                                C563650M8t c563650M8t = C563650M8t.LIZIZ;
                                String message = e.getMessage();
                                if (message != null) {
                                    str3 = message;
                                }
                                C201955140j.LJIIIIZZ(c563650M8t, "MagicDataLogicComponent", str3);
                            } catch (RuntimeException e2) {
                                TryCatchGuardChecker.doCheck(e2);
                                C563650M8t c563650M8t2 = C563650M8t.LIZIZ;
                                String message2 = e2.getMessage();
                                if (message2 != null) {
                                    str3 = message2;
                                }
                                C201955140j.LJIIIIZZ(c563650M8t2, "MagicDataLogicComponent", str3);
                                return zRenameFile;
                            }
                        }
                        return zRenameFile;
                    }
                });
                INLEPlayer playerApi2 = null;
                String path = C0CHQ.LIZ().LJJIIJZLJL().getPathService().LJIIJ(EnumC20227914Cv.MAGIC_PROCESSOR, "", true).getPath();
                C0E48 c0e48C32 = c3();
                if (c0e48C32 == null) {
                    return;
                }
                if (C356770Dyl.LIZ()) {
                    LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this.LL);
                    EditModelProvider.Companion.getClass();
                    EditModelProvider editModelProviderLIZIZ = C0E1T.LIZIZ();
                    if (editModelProviderLIZIZ == null || (editModel2 = editModelProviderLIZIZ.getEditModel()) == null || (creativeInfo2 = editModel2.getCreativeInfo()) == null) {
                        creativeInfo2 = new CreativeInfo(null, 0, null, 7, null);
                    }
                    c354410Dux = new C354390Duv(lifecycleScope, creativeInfo2, c0e48C32.LLFII().LJI(), c0e48C32.f1());
                } else {
                    LifecycleCoroutineScope lifecycleScope2 = LifecycleOwnerKt.getLifecycleScope(this.LL);
                    EditModelProvider.Companion.getClass();
                    EditModelProvider editModelProviderLIZIZ2 = C0E1T.LIZIZ();
                    if (editModelProviderLIZIZ2 == null || (editModel = editModelProviderLIZIZ2.getEditModel()) == null || (creativeInfo = editModel.getCreativeInfo()) == null) {
                        creativeInfo = new CreativeInfo(null, 0, null, 7, null);
                    }
                    c354410Dux = new C354410Dux(lifecycleScope2, creativeInfo, c0e48C32.LLFII().LJI(), c0e48C32.f1());
                }
                AbstractC354420Duy[] abstractC354420DuyArr = new AbstractC354420Duy[5];
                abstractC354420DuyArr[0] = new C354210Dud();
                abstractC354420DuyArr[1] = new C354220Due();
                NLEEditor nLEEditorLJI = c0e48C32.LLFII().LJI();
                INLEMediaSession iNLEMediaSessionF1 = c0e48C32.f1();
                if (iNLEMediaSessionF1 != null) {
                    playerApi = iNLEMediaSessionF1.getPlayerApi();
                } else {
                    playerApi = null;
                }
                abstractC354420DuyArr[2] = new C354470Dv3(nLEEditorLJI, playerApi, path);
                NLEEditor nLEEditorLJI2 = c0e48C32.LLFII().LJI();
                INLEMediaSession iNLEMediaSessionF12 = c0e48C32.f1();
                if (iNLEMediaSessionF12 != null) {
                    playerApi2 = iNLEMediaSessionF12.getPlayerApi();
                }
                abstractC354420DuyArr[3] = new C354160DuY(nLEEditorLJI2, playerApi2, c0e48C3, context);
                abstractC354420DuyArr[4] = c354410Dux;
                magicProcessorManager.LIZ(C1697810uHb.LJ(abstractC354420DuyArr));
            }
            C20005413Pg c20005413PgLIZ = C13Q5.LIZ();
            InterfaceC20008113Qh interfaceC20008113Qh = new InterfaceC20008113Qh() { // from class: X.0Dyk
                @Override // X.InterfaceC20008113Qh
                public final String LIZ(String str) {
                    return AlgorithmResourceFinder.resourceFinder(null, "", str);
                }
            };
            synchronized (c20005413PgLIZ) {
                try {
                    c20005413PgLIZ.LJI = interfaceC20008113Qh;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            EditModelProvider.Companion.getClass();
            C0E1T.LIZ().setMagicProcessorManager$tools_camera_edit_release(magicProcessorManager);
        }
    }

    @Override // X.C0E0G
    public void jb0(Context context, LifecycleOwner lifecycleOwner) {
        hY0(context, lifecycleOwner);
        B3();
        v3();
        E3();
    }

    public final void o2(NLETrackSlot nLETrackSlot, C0LSZ c0lsz) {
        String str;
        String second;
        C0E55 player;
        NLEEditor nLEEditorM3;
        NLEBranch branch;
        C0E48 c0e48C3 = c3();
        if (c0e48C3 == null) {
            return;
        }
        C201955140j.LIZLLL(C563650M8t.LIZIZ, "MagicDataLogicComponent", "doneFinishAsyncTask");
        String nameId = C0E1V.MAGIC.getNameId();
        if (c0lsz == null || (str = c0lsz.LIZIZ) == null) {
            str = "";
        }
        String first = null;
        C350410DoV.LIZLLL(c0e48C3.LLFII().LJI(), true, C051R.LIZIZ(new C0E1X(nameId, null, null, str, null, 22)), false, true);
        Pair<String, String> pair = this.LLJJ.get(nLETrackSlot.getUUID());
        String uuid = null;
        if (pair != null) {
            first = pair.getFirst();
            second = pair.getSecond();
        } else {
            second = null;
        }
        if (C123100dR.LIZ(first) && C123100dR.LIZ(second) && (nLEEditorM3 = m3()) != null && (branch = nLEEditorM3.getBranch()) != null) {
            branch.trimRange(first, second, true);
        }
        String uuid2 = nLETrackSlot.getUUID();
        NLETrackSlot nLETrackSlotLLLLLLIL = c0e48C3.LLLLLLIL();
        if (nLETrackSlotLLLLLLIL != null) {
            uuid = nLETrackSlotLLLLLLIL.getUUID();
        }
        if (Intrinsics.LJFF(uuid2, uuid) && (player = getPlayer()) != null) {
            player.pause(false);
            player.LJIJI(nLETrackSlot.getStartTime(), new C0FX2(player, nLETrackSlot, 2));
        }
    }

    public final void o4(C0E48 c0e48, NLETrackSlot nLETrackSlot) {
        NLEResourceNode resource;
        boolean z;
        float fFloatValue;
        NLEModel nLEModelLJI = C350870DpF.LJI(c0e48);
        NLETrackSlot nLETrackSlotLJL = C351220Dpo.LJL(nLEModelLJI, nLETrackSlot.getUUID());
        if (nLETrackSlotLJL != null) {
            nLETrackSlot = nLETrackSlotLJL;
        }
        NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment());
        if (nLESegmentVideoDynamicCast == null) {
            return;
        }
        if ((nLESegmentVideoDynamicCast.getSeqCurveSpeedPoints() != null && (!r0.isEmpty())) || (resource = nLESegmentVideoDynamicCast.getResource()) == null) {
            return;
        }
        if (resource.getResourceType() != NLEResType.VIDEO && resource.getResourceType() != NLEResType.IMAGE) {
            return;
        }
        Long lValueOf = Long.valueOf(resource.getDuration());
        if (lValueOf.longValue() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            NLEResourceAV aVFile = nLESegmentVideoDynamicCast.getAVFile();
            if (aVFile != null) {
                lValueOf = Long.valueOf(aVFile.getDuration());
                if (lValueOf.longValue() <= 0) {
                    return;
                }
            } else {
                return;
            }
        }
        long jLongValue = lValueOf.longValue();
        if (nLESegmentVideoDynamicCast.getTimeClipStart() > 100000 || nLESegmentVideoDynamicCast.getTimeClipEnd() <= nLESegmentVideoDynamicCast.getTimeClipStart()) {
            return;
        }
        if (resource.getResourceType() == NLEResType.IMAGE) {
            if (nLESegmentVideoDynamicCast.getTimeClipEnd() >= jLongValue) {
                return;
            }
            long timeClipEnd = nLESegmentVideoDynamicCast.getTimeClipEnd();
            resource.setDuration(timeClipEnd);
            NLEResourceAV aVFile2 = nLESegmentVideoDynamicCast.getAVFile();
            if (aVFile2 != null) {
                aVFile2.setDuration(timeClipEnd);
            }
            C350870DpF.LIZ(c0e48, false);
            return;
        }
        Float fValueOf = Float.valueOf(C351220Dpo.LIZ(nLESegmentVideoDynamicCast));
        if (fValueOf.floatValue() > 0.0f) {
            fFloatValue = fValueOf.floatValue();
        } else {
            fFloatValue = 1.0f;
        }
        if (nLESegmentVideoDynamicCast.getTimeClipEnd() >= jLongValue) {
            return;
        }
        C363420EMq.LIZ.getClass();
        Long lLJFF = C363420EMq.LJFF("ep_magic_pre_magic_clip_end", nLETrackSlot);
        if (lLJFF != null && lLJFF.longValue() > nLESegmentVideoDynamicCast.getTimeClipStart()) {
            long jLongValue2 = lLJFF.longValue();
            if (jLongValue2 <= jLongValue) {
                jLongValue = jLongValue2;
            }
        }
        nLESegmentVideoDynamicCast.setTimeClipEnd(jLongValue);
        long timeClipStart = (long) ((jLongValue - nLESegmentVideoDynamicCast.getTimeClipStart()) / fFloatValue);
        if (timeClipStart < 1) {
            timeClipStart = 1;
        }
        nLETrackSlot.setEndTime(nLETrackSlot.getStartTime() + timeClipStart);
        if (C351220Dpo.LLIIJLIL(nLEModelLJI, nLETrackSlot)) {
            NLETrack nLETrackRn = c0e48.Rn();
            if (nLETrackRn != null) {
                nLETrackRn.timeSort();
            }
        } else {
            NLETrack trackBySlot = nLEModelLJI.getTrackBySlot(nLETrackSlot);
            if (trackBySlot != null) {
                trackBySlot.timeSort();
            }
        }
        C350870DpF.LIZ(c0e48, false);
    }

    @Override // X.C0E0G
    public void vG2(NLETrackSlot nLETrackSlot, InterfaceC356750Dyj interfaceC356750Dyj) {
        C0E48 c0e48C3;
        C0E48 c0e48C32;
        NLETrackSlot nLETrackSlotLLLLLLIL = nLETrackSlot;
        if (nLETrackSlotLLLLLLIL == null && ((c0e48C32 = c3()) == null || (nLETrackSlotLLLLLLIL = c0e48C32.LLLLLLIL()) == null)) {
            return;
        }
        String strFw1 = fw1(nLETrackSlotLLLLLLIL);
        String strJo2 = jo2(nLETrackSlotLLLLLLIL);
        if (!(!a0.LJJJIL(strFw1)) || (c0e48C3 = c3()) == null) {
            return;
        }
        NLEModel nLEModelLJI = C350870DpF.LJI(c0e48C3);
        int i = 0;
        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(strJo2, new String[]{","}, 0, 6);
        for (Object obj : a0.LJJLIIIJILLIZJL(strFw1, new String[]{","}, 0, 6)) {
            int i2 = i + 1;
            if (i >= 0) {
                String str = (String) obj;
                if (!a0.LJJJIL(str)) {
                    String str2 = (String) C13LP.LJJJLZIJ(i, listLJJLIIIJILLIZJL);
                    if (str2 == null) {
                        str2 = "";
                    }
                    interfaceC356750Dyj.LIZJ(new C354240Dug(new C354510Dv7(null, str, str2, null, null, null, null, null, null, 0, false, 4089), nLETrackSlotLLLLLLIL, nLEModelLJI));
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }

    private final boolean O3(C354510Dv7 c354510Dv7, NLETrackSlot nLETrackSlot, NLETrackSlot nLETrackSlot2) {
        if (C357030DzB.LIZ(c354510Dv7) || c354510Dv7.LJIIJJI == null || Intrinsics.LJFF(nLETrackSlot.getUUID(), nLETrackSlot2.getUUID()) || !C123100dR.LIZ(nLETrackSlot.getExtra("freeze_from_uuid"))) {
            return false;
        }
        return true;
    }

    @Override // X.C0E0G
    public void hG1(long j, NLEModel nLEModel, NLETrackSlot nLETrackSlot) {
        C0E5S c0e5sQ3;
        C0E48 c0e48C3 = c3();
        if (c0e48C3 == null) {
            return;
        }
        TrackLinkageManagerProvider.Companion.getClass();
        AbstractC349500Dn2 businessTrackLinkageManager = C356700Dye.LIZ().getBusinessTrackLinkageManager();
        if (businessTrackLinkageManager != null) {
            businessTrackLinkageManager.LIZJ(new C349510Dn3("clip_video", C1697810uHb.LJ(new C349470Dmz(nLETrackSlot, c0e48C3.LLLLLLIL(), null, 1, 20)), nLEModel));
        }
        if (C284610BDn.LIZ()) {
            e4(c0e48C3, nLEModel);
        }
        Z1();
        w2(j);
        if (C284610BDn.LIZ() && (c0e5sQ3 = q3()) != null) {
            c0e5sQ3.I61(C350870DpF.LJI(c0e48C3), true, true);
        }
    }

    public C356720Dyg(C19A3 c19a3, C1DRG c1drg, C372830EjZ c372830EjZ, boolean z) {
        this.LL = c19a3;
        this.LLILLJJLI = c1drg;
        this.LLILLL = c372830EjZ;
        this.LLILZ = z;
    }

    @Override // X.C0E0G
    public void pr1(C354510Dv7 c354510Dv7, NLETrackSlot nLETrackSlot, NLETrackSlot nLETrackSlot2, final InterfaceC356810Dyp interfaceC356810Dyp) {
        final NLETrackSlot nLETrackSlotLLLLLLIL;
        boolean z;
        InterfaceC356810Dyp interfaceC356810Dyp2;
        C0E5S c0e5sQ3;
        NLETrackSlot nLETrackSlot3 = nLETrackSlot;
        final C0E48 c0e48C3 = c3();
        if (c0e48C3 != null && (nLETrackSlotLLLLLLIL = c0e48C3.LLLLLLIL()) != null) {
            if (nLETrackSlot3 == null) {
                nLETrackSlot3 = nLETrackSlotLLLLLLIL;
            }
            long maxEnd = c0e48C3.Rn().getMaxEnd();
            NLEModel nLEModelDynamicCast = NLEModel.dynamicCast(C350870DpF.LJI(c0e48C3).deepClone());
            NLETrackSlot nLETrackSlotDynamicCast = NLETrackSlot.dynamicCast(nLETrackSlotLLLLLLIL.deepClone());
            C354240Dug c354240Dug = new C354240Dug(c354510Dv7, nLETrackSlot3, C350870DpF.LJI(c0e48C3));
            EditModelProvider.Companion.getClass();
            InterfaceC356750Dyj magicProcessorManager$tools_camera_edit_release = C0E1T.LIZ().getMagicProcessorManager$tools_camera_edit_release();
            if (magicProcessorManager$tools_camera_edit_release != null) {
                Ax0(false);
                Q3(nLETrackSlotLLLLLLIL);
                if (!Intrinsics.LJFF(nLETrackSlot3.getUUID(), nLETrackSlotLLLLLLIL.getUUID())) {
                    Q3(nLETrackSlot3);
                }
                vG2(nLETrackSlotLLLLLLIL, magicProcessorManager$tools_camera_edit_release);
                final boolean zO3 = O3(c354510Dv7, nLETrackSlot3, nLETrackSlotLLLLLLIL);
                if (C284610BDn.LIZ()) {
                    z = false;
                    H3(c0e48C3, c354510Dv7, nLETrackSlotLLLLLLIL, nLETrackSlot3, maxEnd, nLEModelDynamicCast, nLETrackSlotDynamicCast);
                } else {
                    z = false;
                }
                if (c354510Dv7.LJIIJJI != null && (c0e5sQ3 = q3()) != null) {
                    c0e5sQ3.QD2(z, z);
                }
                if (C284610BDn.LIZ()) {
                    final NLETrackSlot nLETrackSlot4 = nLETrackSlot3;
                    interfaceC356810Dyp2 = new InterfaceC356810Dyp() { // from class: X.0Dyo
                        @Override // X.InterfaceC356810Dyp
                        public final void onStart() {
                            interfaceC356810Dyp.onStart();
                            if (zO3) {
                                return;
                            }
                            this.o4(c0e48C3, nLETrackSlot4);
                            if (Intrinsics.LJFF(nLETrackSlot4.getUUID(), nLETrackSlotLLLLLLIL.getUUID())) {
                                return;
                            }
                            this.o4(c0e48C3, nLETrackSlotLLLLLLIL);
                        }

                        @Override // X.InterfaceC356810Dyp
                        public final void LIZ(C356900Dyy c356900Dyy) {
                            interfaceC356810Dyp.LIZ(c356900Dyy);
                        }

                        @Override // X.InterfaceC356810Dyp
                        public final void LIZIZ(C354570DvD c354570DvD) {
                            interfaceC356810Dyp.LIZIZ(c354570DvD);
                        }

                        @Override // X.InterfaceC356810Dyp
                        public final void onProgress(int i) {
                            interfaceC356810Dyp.onProgress(i);
                        }
                    };
                } else {
                    interfaceC356810Dyp2 = interfaceC356810Dyp;
                }
                magicProcessorManager$tools_camera_edit_release.LIZIZ(c354240Dug, interfaceC356810Dyp2);
            }
        }
    }

    private final void H3(C0E48 c0e48, C354510Dv7 c354510Dv7, NLETrackSlot nLETrackSlot, NLETrackSlot nLETrackSlot2, long j, NLEModel nLEModel, NLETrackSlot nLETrackSlot3) {
        if (O3(c354510Dv7, nLETrackSlot2, nLETrackSlot)) {
            return;
        }
        o4(c0e48, nLETrackSlot);
        if (!Intrinsics.LJFF(nLETrackSlot2.getUUID(), nLETrackSlot.getUUID())) {
            o4(c0e48, nLETrackSlot2);
        }
        c0e48.Rn().timeSort();
        hG1(j, nLEModel, nLETrackSlot3);
    }
}
