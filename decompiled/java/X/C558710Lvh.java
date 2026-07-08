package X;

import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LiveData;
import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager;
import com.ss.android.ugc.aweme.creative.model.ailive.ProgressModel;
import com.ss.android.ugc.aweme.creative.model.ailive.UsageStatus;
import com.ss.android.ugc.aweme.services.external.RefreshQuotaScene;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.mediaselector.aicontentprotocol.AlbumAiContentService;
import com.ss.android.ugc.tiktok.tools.performance.api.settings.LazyLoadEditLazyGroupPhase1;
import java.util.Date;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS587S0100000_8;
import kotlin.jvm.internal.AwS59S1000000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Lvh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C558710Lvh extends AbstractC2255721DQs<InterfaceC564940MDs> implements InterfaceC564940MDs, InterfaceC379610EuV {
    public static final C558780Lvo LLJJ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJI;
    public static final int LLJJIII;
    public final C1DRG LL;
    public InterfaceC1455610nyx LLJ;
    public C09AE LLJILJILJ;
    public InterfaceC558770Lvn LLJILLL;
    public final InterfaceC564940MDs LLILLJJLI = this;
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1446740nke.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC558740Lvk.class, null);
    public final C01GW LLILZLL = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(246));
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZIZ(getDiContainer(), C0MEH.class, null);
    public final InterfaceC1731706qJ LLIZLLLIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1460000o62.class, null);
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS552S0100000_8(this, 521));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 520));
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 522));

    /* JADX WARN: Type inference failed for: r0v11, types: [X.0Lvo] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C558710Lvh.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C13LE.LIZ.getClass();
        LLJJI = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C558710Lvh.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/gamora/editor/preview/TiktokEditPreviewApi;", 0), new C2217381BqS(C558710Lvh.class, "aiLiveDataManager", "getAiLiveDataManager()Lcom/ss/android/ugc/gamora/editor/ailive/data/AILiveStatusDataApi;", 0), new C2217381BqS(C558710Lvh.class, "aiLiveQuotaApi", "getAiLiveQuotaApi()Lcom/ss/android/ugc/gamora/editor/ailive/quota/AILiveQuotaLogicApi;", 0), new C2217381BqS(C558710Lvh.class, "editToolbarApi", "getEditToolbarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/EditToolbarApi;", 0)};
        LLJJ = new Object() { // from class: X.0Lvo
        };
        LLJJIII = 8;
    }

    private final C0MEH X1() {
        return (C0MEH) this.LLIZ.getValue(this, LLJJI[3]);
    }

    private final INLEMediaSession f1() {
        return (INLEMediaSession) this.LLJILJIL.getValue();
    }

    private final InterfaceC1460000o62 w2() {
        return (InterfaceC1460000o62) this.LLIZLLLIL.getValue(this, LLJJI[4]);
    }

    public final NLEEditor G2() {
        return (NLEEditor) this.LLJIJIL.getValue();
    }

    public final C348100Dkm H2() {
        return (C348100Dkm) this.LLJI.getValue();
    }

    public final InterfaceC1446740nke JY0() {
        return (InterfaceC1446740nke) this.LLILZ.getValue(this, LLJJI[1]);
    }

    public final InterfaceC558740Lvk W1() {
        return (InterfaceC558740Lvk) this.LLILZIL.getValue(this, LLJJI[2]);
    }

    public final VideoPublishEditModel getEditModel() {
        return (VideoPublishEditModel) this.LLILLL.getValue(this, LLJJI[0]);
    }

    @Override // X.InterfaceC564940MDs
    public void kj2() {
        C09AE c09ae = this.LLJILJILJ;
        if (c09ae == null || c09ae.isCancelled()) {
            C559010LwB.LIZIZ("AILiveTaskHandler", "cancelObserver return");
            return;
        }
        C09AE c09ae2 = this.LLJILJILJ;
        if (c09ae2 != null) {
            c09ae2.LIZIZ(null);
        }
        this.LLJILJILJ = null;
        C559010LwB.LIZIZ("AILiveTaskHandler", "cancelObserver");
    }

    @Override // X.InterfaceC564940MDs
    public void kq() {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ.plus(C2296908zH.LIZ())), null, null, new C545700Lai(this, null), 3);
    }

    public final ICreationAsyncTaskManager o2() {
        return (ICreationAsyncTaskManager) this.LLILZLL.getValue();
    }

    public final void T2() {
        ICreationAsyncTaskManager iCreationAsyncTaskManagerO2 = o2();
        if (iCreationAsyncTaskManagerO2 == null) {
            return;
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C545730Lal(this, iCreationAsyncTaskManagerO2, null), 3);
    }

    @Override // X.InterfaceC564940MDs
    public void Xi() {
        LiveData<Boolean> liveDataPy1;
        InterfaceC1455610nyx interfaceC1455610nyxW2 = LazyLoadEditLazyGroupPhase1.LIZ().enableLazySafeComponent ? this.LLJ : w2();
        if (!(LazyLoadEditLazyGroupPhase1.LIZ().enableLazySafeComponent && interfaceC1455610nyxW2 == null) && this.LLJILJILJ == null) {
            if ((interfaceC1455610nyxW2 == null || (liveDataPy1 = interfaceC1455610nyxW2.Py1()) == null || !Intrinsics.LJFF(liveDataPy1.getValue(), Boolean.FALSE)) && !getEditModel().getAILivePhotoModel().pageDataCache.publishDialogShowing) {
                this.LLJILJILJ = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C558720Lvi(this, null), 3);
            }
        }
    }

    @Override // X.InterfaceC564940MDs
    public void gf1() {
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C545710Laj(this, null), 3);
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        if (LazyLoadEditLazyGroupPhase1.LIZ().enableLazySafeComponent) {
            ((C0ETY) getDiContainer().LJII(C0ETY.class, null)).Sd(InterfaceC1455610nyx.class, new AwS587S0100000_8(this, 339));
        }
        T2();
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        ICreationAsyncTaskManager iCreationAsyncTaskManagerO2 = o2();
        if (iCreationAsyncTaskManagerO2 != null) {
            iCreationAsyncTaskManagerO2.LJI("AILiveTaskHandler", AFwS189S0000000_3.get$arr$(377), false);
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onStart() {
        super.onStart();
        Xi();
    }

    @Override // X.AbstractC2255721DQs
    public void onStop() {
        super.onStop();
        kj2();
    }

    public InterfaceC564940MDs Z1() {
        return this.LLILLJJLI;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C558710Lvh(C1DRG c1drg) {
        this.LL = c1drg;
    }

    @Override // X.InterfaceC564940MDs
    public void Lp2(C558760Lvm c558760Lvm) {
        if (c558760Lvm.LIZJ) {
            ICreationAsyncTaskManager iCreationAsyncTaskManagerO2 = o2();
            if (iCreationAsyncTaskManagerO2 != null) {
                iCreationAsyncTaskManagerO2.LJIIIIZZ(getEditModel().getCreationId());
            }
        } else {
            ICreationAsyncTaskManager iCreationAsyncTaskManagerO22 = o2();
            if (iCreationAsyncTaskManagerO22 != null) {
                iCreationAsyncTaskManagerO22.LJJIL(getEditModel().getCreationId());
            }
        }
        W1().ec2(getEditModel(), c558760Lvm.LIZ);
        InterfaceC558770Lvn interfaceC558770Lvn = this.LLJILLL;
        if (interfaceC558770Lvn != null) {
            interfaceC558770Lvn.LJFF();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object W2(X.InterfaceC1364105Vn<? super java.lang.Boolean> r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof X.C545740Lam
            if (r0 == 0) goto L9c
            r5 = r13
            X.0Lam r5 = (X.C545740Lam) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L9c
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r1 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r11 = 0
            r3 = 1
            if (r0 == 0) goto L4e
            if (r0 != r3) goto La8
            X.C155000ia.LIZIZ(r1)
        L23:
            kotlin.Pair r1 = (kotlin.Pair) r1
        L25:
            kotlin.coroutines.CoroutineContext r0 = r5.getContext()
            X.C23118094a.LJI(r0)
            if (r1 == 0) goto La3
            X.0Lvn r4 = r12.LLJILLL
            if (r4 == 0) goto L48
            X.0ME5 r3 = new X.0ME5
            java.lang.Object r2 = r1.getFirst()
            java.lang.Integer r2 = (java.lang.Integer) r2
            java.lang.Object r1 = r1.getSecond()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = "quota"
            r3.<init>(r0, r2, r1, r11)
            r4.LJI(r3)
        L48:
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L4e:
            X.C155000ia.LIZIZ(r1)
            boolean r0 = X.C560970LzL.LIZIZ()
            if (r0 != 0) goto L74
            X.0Lvn r4 = r12.LLJILLL
            if (r4 == 0) goto L6e
            X.0ME5 r3 = new X.0ME5
            r0 = -47364(0xffffffffffff46fc, float:NaN)
            java.lang.Integer r2 = X.C2286608xc.LJ(r0)
            java.lang.String r1 = "network"
            java.lang.String r0 = "network unavailable"
            r3.<init>(r1, r2, r0, r11)
            r4.LJI(r3)
        L6e:
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L74:
            java.lang.Class<com.ss.android.ugc.aweme.services.IExternalService> r6 = com.ss.android.ugc.aweme.services.IExternalService.class
            r7 = 0
            r10 = 14
            r8 = r7
            r9 = r7
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r6, r7, r8, r9, r10, r11)
            com.ss.android.ugc.aweme.services.IExternalService r0 = (com.ss.android.ugc.aweme.services.IExternalService) r0
            if (r0 == 0) goto L9a
            com.ss.android.ugc.aweme.services.external.IAIGCQuotaService r2 = r0.getAIGCQuotaService()
            if (r2 == 0) goto L9a
            com.ss.android.ugc.aweme.aigc.asynctask.Source r0 = com.ss.android.ugc.aweme.aigc.asynctask.Source.EDIT_AI_LIVE_PHOTO
            java.lang.String r1 = r0.getSource()
            com.ss.android.ugc.aweme.services.external.RefreshQuotaScene r0 = com.ss.android.ugc.aweme.services.external.RefreshQuotaScene.GENERATE
            r5.LLILLL = r3
            java.lang.Object r1 = r2.checkQuotaBeforeGenerate(r1, r0, r5)
            if (r1 != r4) goto L23
            return r4
        L9a:
            r1 = r11
            goto L25
        L9c:
            X.0Lam r5 = new X.0Lam
            r5.<init>(r12, r13)
            goto L12
        La3:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            return r0
        La8:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C558710Lvh.W2(X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC564940MDs
    public void hu1(C558760Lvm c558760Lvm) {
        NLETrackSlot nLETrackSlot = c558760Lvm.LIZ;
        INLEMediaSession iNLEMediaSessionF1 = f1();
        if (iNLEMediaSessionF1 == null) {
            return;
        }
        String str = c558760Lvm.LIZIZ.promptForAlgorithm;
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C545720Lak(c558760Lvm, this, nLETrackSlot, new Date().getTime(), iNLEMediaSessionF1, str, null), 3);
    }

    @Override // X.InterfaceC564940MDs
    public void wu2(InterfaceC558770Lvn interfaceC558770Lvn) {
        this.LLJILLL = interfaceC558770Lvn;
    }

    @Override // X.InterfaceC564940MDs
    public void xz1(C558760Lvm c558760Lvm) {
        ICreationAsyncTaskManager iCreationAsyncTaskManagerO2;
        ICreationAsyncTaskManager iCreationAsyncTaskManagerO22;
        String taskId = getEditModel().getAILivePhotoModel().getTaskId();
        if (taskId == null) {
            return;
        }
        if (!c558760Lvm.LIZJ && (iCreationAsyncTaskManagerO22 = o2()) != null) {
            iCreationAsyncTaskManagerO22.LJJIII(taskId);
        }
        W1().qO(getEditModel(), taskId);
        if (getEditModel().getAILivePhotoModel().LJIIZILJ() && (iCreationAsyncTaskManagerO2 = o2()) != null && iCreationAsyncTaskManagerO2.LJIILIIL() != null) {
            C0LCT.LIZLLL(getEditModel().getCreationId(), true);
        }
        C0MEH c0mehX1 = X1();
        if (c0mehX1 != null) {
            c0mehX1.refreshQuotaCache(RefreshQuotaScene.TASK_STATUS_CHANGE);
        }
        InterfaceC558770Lvn interfaceC558770Lvn = this.LLJILLL;
        if (interfaceC558770Lvn != null) {
            interfaceC558770Lvn.onStop();
        }
    }

    public static final void i3(C558710Lvh c558710Lvh, C0LSZ c0lsz) {
        c558710Lvh.getEditModel().getAILivePhotoModel().LJIILL(AFwS239S0000000_8.get$arr$(173));
        InterfaceC558770Lvn interfaceC558770Lvn = c558710Lvh.LLJILLL;
        if (interfaceC558770Lvn != null) {
            interfaceC558770Lvn.onSuccess();
        }
        ICreationAsyncTaskManager iCreationAsyncTaskManagerO2 = c558710Lvh.o2();
        if (iCreationAsyncTaskManagerO2 != null && iCreationAsyncTaskManagerO2.LJIILIIL() != null) {
            C0LCT.LIZLLL(c558710Lvh.getEditModel().getCreationId(), true);
        }
        AlbumAiContentService.LIZ.getClass();
        AlbumAiContentService albumAiContentServiceLIZ = C523440Kfu.LIZ();
        if (albumAiContentServiceLIZ != null) {
            albumAiContentServiceLIZ.LIZ(c0lsz.LIZ, null);
        }
        AnonymousClass0913.LIZJ("AILiveTaskHandler");
    }

    public final void c3(final C0LSZ c0lsz, boolean z) {
        int i;
        ICreationAsyncTaskManager iCreationAsyncTaskManagerO2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NLE + EditModel, curState=");
        sbLIZ.append(getEditModel().getAILivePhotoModel().LIZIZ());
        sbLIZ.append(", processByTaskInfo: ");
        sbLIZ.append(c0lsz);
        C559010LwB.LIZIZ("AILiveTaskHandler", C2188811AlT.LIZIZ(sbLIZ));
        ProgressModel progressModelLIZIZ = getEditModel().getAILivePhotoModel().LIZIZ();
        String str = c0lsz.LJ;
        int iHashCode = str.hashCode();
        if (iHashCode != -1179202463) {
            if (iHashCode != 108966002) {
                if (iHashCode == 2066319421 && str.equals("FAILED")) {
                    if (progressModelLIZIZ.status == UsageStatus.FAIL && Intrinsics.LJFF(progressModelLIZIZ.taskId, c0lsz.LIZ)) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("same return, ");
                        sbLIZ2.append(getEditModel().getAILivePhotoModel().LIZIZ());
                        C559010LwB.LIZ("AILiveTaskHandler", C2188811AlT.LIZIZ(sbLIZ2));
                        return;
                    }
                    W1().Fx(getEditModel().creativeModel, c0lsz);
                    InterfaceC558770Lvn interfaceC558770Lvn = this.LLJILLL;
                    if (interfaceC558770Lvn != null) {
                        interfaceC558770Lvn.LJI(new C0ME5(c0lsz.LJI, Integer.valueOf(c0lsz.LJIILL), c0lsz.LJIILLIIL, c0lsz.LJIJ));
                    }
                    if (getEditModel().getAILivePhotoModel().LJII() && (iCreationAsyncTaskManagerO2 = o2()) != null && iCreationAsyncTaskManagerO2.LJIILIIL() != null) {
                        C0LCT.LIZLLL(getEditModel().getCreationId(), true);
                    }
                    AnonymousClass0913.LIZJ("AILiveTaskHandler");
                    return;
                }
                return;
            }
            if (str.equals("FINISHED")) {
                UsageStatus usageStatus = progressModelLIZIZ.status;
                if ((usageStatus == UsageStatus.SUCCESS_APPLY || (usageStatus == UsageStatus.SUCCESS_CANCEL && !z)) && Intrinsics.LJFF(progressModelLIZIZ.taskId, c0lsz.LIZ)) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("same return, ");
                    sbLIZ3.append(getEditModel().getAILivePhotoModel().LIZIZ());
                    C559010LwB.LIZ("AILiveTaskHandler", C2188811AlT.LIZIZ(sbLIZ3));
                    return;
                }
                String str2 = getEditModel().getAILivePhotoModel().LIZIZ().taskId;
                if (str2 != null) {
                    new AwS59S1000000_8(str2, 11).invoke(getEditModel().getAILivePhotoModel().mobParam);
                }
                W1().k72(getEditModel(), c0lsz, new C0MCA(this) { // from class: X.0Lvl
                    public final /* synthetic */ C558710Lvh LIZIZ;

                    @Override // X.C0MCA
                    public final void onFail() {
                        C559010LwB.LIZ("AILiveTaskHandler", "AILiveDataApplyCallback onFail");
                        C558710Lvh.i3(this.LIZIZ, c0lsz);
                    }

                    @Override // X.C0MCA
                    public final void onSuccess() {
                        C559010LwB.LIZIZ("AILiveTaskHandler", "AILiveDataApplyCallback onSuccess");
                        C558710Lvh.i3(this.LIZIZ, c0lsz);
                    }

                    {
                        this.LIZIZ = this;
                    }
                });
                return;
            }
            return;
        }
        if (str.equals("STARTED")) {
            if (progressModelLIZIZ.status == UsageStatus.LOADING && (i = c0lsz.LJII) != 0 && progressModelLIZIZ.progress == i) {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("same return, ");
                sbLIZ4.append(getEditModel().getAILivePhotoModel().LIZIZ());
                C559010LwB.LIZIZ("AILiveTaskHandler", C2188811AlT.LIZIZ(sbLIZ4));
                return;
            }
            W1().jA0(getEditModel().creativeModel, c0lsz);
            InterfaceC558770Lvn interfaceC558770Lvn2 = this.LLJILLL;
            if (interfaceC558770Lvn2 != null) {
                interfaceC558770Lvn2.LIZ();
            }
        }
    }
}
