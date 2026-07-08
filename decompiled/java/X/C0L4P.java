package X;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.ies.nle.editor_jni.LogLevel;
import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.n;
import com.ss.android.ugc.aweme.creative.model.AutoCutAnchorModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutMediaModel;
import com.ss.android.ugc.aweme.creative.model.publish.FollowUpPublishTrackerModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.interfaces.ITemplateMobService;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialog;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialogBuilder;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.tools.view.uikit.factory.CreativeDialogWrapper;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AwS148S0101000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS582S0100000_3;
import kotlin.jvm.internal.AwS587S0100000_8;

/* JADX INFO: renamed from: X.0L4P, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0L4P implements InterfaceC522520KeQ {
    public static final C054G LLILZLL = C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), C0PEM.LIZJ));
    public final Activity LL;
    public final C1DRG LLILLJJLI;
    public CreativeDialogWrapper LLILLL;
    public final Set<C09AE> LLILZ = new LinkedHashSet();
    public long LLILZIL = -1;

    @Override // X.InterfaceC522520KeQ
    public final void LIZIZ(AwS582S0100000_3 awS582S0100000_3) {
    }

    @Override // X.InterfaceC522520KeQ
    public final void LJJLIIIJJIZ() {
    }

    public final void LIZJ() {
        CreativeDialogWrapper creativeDialogWrapper = this.LLILLL;
        if (creativeDialogWrapper != null) {
            creativeDialogWrapper.dismiss();
        }
    }

    public final void LIZLLL() {
        C0CNO.LIZLLL(0L, new AwS552S0100000_8(this, 805));
    }

    public C0L4P(C1DRG c1drg, Activity activity) {
        this.LL = activity;
        this.LLILLJJLI = c1drg;
    }

    @Override // X.InterfaceC522520KeQ
    public final void LIZ(int i, int i2, Intent intent) {
        String stringExtra;
        Object c098200Yq;
        C0L7H c0l7h;
        CreativeDialogWrapper creativeDialogWrapper;
        C1417710mzp.LIZ(LogLevel.LEVEL_INFO, "AutoCutAnchorMediaProcessImpl#onChosenResult");
        if (!this.LL.isFinishing() && ((creativeDialogWrapper = this.LLILLL) == null || !creativeDialogWrapper.isShowing())) {
            C19576911iZ c19576911iZ = C19576911iZ.LIZ;
            Activity activity = this.LL;
            CreativeLoadingDialogBuilder creativeLoadingDialogBuilder = new CreativeLoadingDialogBuilder();
            creativeLoadingDialogBuilder.showProgress(true);
            creativeLoadingDialogBuilder.backCanCancel(false);
            creativeLoadingDialogBuilder.cancelViewVisibleType(CreativeLoadingDialogBuilder.CancelType.VISIBLE_AFTER_5S);
            creativeLoadingDialogBuilder.loadingMessage(this.LL.getString(R.string.txr));
            creativeLoadingDialogBuilder.clickCancelListener(new AwS587S0100000_8(this, 523));
            CreativeDialogWrapper creativeDialogWrapper2 = (CreativeDialogWrapper) c19576911iZ.createLoadingDialog(activity, 1019, creativeLoadingDialogBuilder);
            this.LLILLL = creativeDialogWrapper2;
            creativeDialogWrapper2.show();
            CreativeDialogWrapper creativeDialogWrapper3 = this.LLILLL;
            if (creativeDialogWrapper3 != null && creativeDialogWrapper3.isShowing()) {
                CreativeLoadingDialog.DefaultImpls.updateProgress$default(creativeDialogWrapper3, Math.min(0, 100), false, 2, null);
            }
        }
        this.LLILZIL = System.currentTimeMillis();
        final ShortVideoContext shortVideoContext = (ShortVideoContext) intent.getParcelableExtra("key_short_video_context");
        if (shortVideoContext == null) {
            return;
        }
        AutoCutAnchorModel autoCutAnchorModel = shortVideoContext.creativeModel.autoCutAnchorModel;
        final List<? extends MediaModel> parcelableArrayListExtra = intent.getParcelableArrayListExtra("key_choose_media_data");
        try {
            stringExtra = intent.getStringExtra("key_ugc_template_url");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            stringExtra = null;
        }
        ((ITemplateMobService) ServiceManager.get().getService(ITemplateMobService.class)).LIZJ(autoCutAnchorModel.templateId, Integer.valueOf(autoCutAnchorModel.templateTypeValue), stringExtra, C0L95.ANCHOR.getValue());
        FollowUpPublishTrackerModel followUpPublishTrackerModel = shortVideoContext.creativeModel.followUpPublishTrackerModel;
        followUpPublishTrackerModel.followUpFirstItemId = C1443560nfW.LJI;
        followUpPublishTrackerModel.followUpItemIdGroups = C1443560nfW.LJII;
        followUpPublishTrackerModel.enterRecordFromFeed = true;
        followUpPublishTrackerModel.followUpPromoId = C1443560nfW.LJIIJJI;
        int intExtra = intent.getIntExtra("key_designated_material_count", 0);
        try {
            C1227904rF c1227904rF = C1227904rF.LIZ;
            String str = autoCutAnchorModel.extra;
            c1227904rF.getClass();
            k kVarLJJIIZ = ((n) C1227904rF.LIZIZ(str, n.class)).LJJIIZ("music_url");
            if (kVarLJJIIZ != null) {
                c098200Yq = kVarLJJIIZ.LJIL();
            } else {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m7isFailureimpl(c098200Yq);
        C0L4U.LIZ.getClass();
        final String strLIZLLL = C0L4U.LIZLLL(autoCutAnchorModel);
        final String strLJ = C0L4U.LJ(autoCutAnchorModel);
        C1DRG c1drg = this.LLILLJJLI;
        final Activity activity2 = this.LL;
        final String str2 = autoCutAnchorModel.templateId;
        EnumC1412640mre enumC1412640mreLIZJ = C1412660mrg.LIZJ(autoCutAnchorModel.templateTypeValue);
        if (enumC1412640mreLIZJ == null) {
            enumC1412640mreLIZJ = EnumC1412640mre.CUT_SAME;
        }
        final C528230Knd c528230KndLIZ = C523870Kgb.LIZ(intent);
        C1417710mzp.LIZ(LogLevel.LEVEL_INFO, "AutoCutAnchorMediaProcessImpl#startUseTemplate");
        if (parcelableArrayListExtra == null) {
            parcelableArrayListExtra = C13BV.INSTANCE;
        }
        if (str2 != null && str2.length() != 0) {
            if ((!parcelableArrayListExtra.isEmpty() || C533090KvT.LIZIZ.LJFF()) && activity2 != null) {
                final C0L4X c0l4x = new C0L4X(intExtra, shortVideoContext.getCreationId(), str2, strLIZLLL, false);
                if (c1drg != null && (c0l7h = (C0L7H) c1drg.LJIIL(null, C0L7H.class)) != null) {
                    final EnumC1412640mre enumC1412640mre = enumC1412640mreLIZJ;
                    c0l7h.gd2(str2, enumC1412640mreLIZJ, strLIZLLL, strLJ, parcelableArrayListExtra, shortVideoContext.creativeInfo, intExtra, new C1418100n0S("autocut_anchor", str2, enumC1412640mreLIZJ), new C0L7M() { // from class: X.0L7A
                        @Override // X.C0L7K
                        public final void onPreSuccess(NLETemplateModel nLETemplateModel) {
                        }

                        @Override // X.C0L7M
                        public final void onExit() {
                            c0l4x.onExit();
                        }

                        @Override // X.C0L7M
                        public final void LIZ(List<? extends MediaModel> list) {
                            c0l4x.LIZ(list);
                        }

                        @Override // X.C0L7M
                        public final void LIZIZ(List<C23179096j> list) {
                            c0l4x.LIZIZ(list);
                            List<AutoCutMediaModel> list2 = shortVideoContext.creativeModel.autoCutAnchorModel.mediaList;
                            list2.clear();
                            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                            for (C23179096j c23179096j : list) {
                                arrayList.add(new AutoCutMediaModel(c23179096j.LIZIZ, null, null, 0, 0, c23179096j.LIZJ, 0L, 0L, 0L, 0.0f, false, null, null, 8158, null));
                            }
                            list2.addAll(arrayList);
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Removed duplicated region for block: B:158:0x0700  */
                        /* JADX WARN: Removed duplicated region for block: B:230:0x0865  */
                        @Override // X.C0L7K
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final void LIZLLL(X.C0L7B r81, boolean r82) {
                            /*
                                Method dump skipped, instruction units count: 2152
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C0L7A.LIZLLL(X.0L7B, boolean):void");
                        }

                        @Override // X.C0L7K
                        public final void LJFF(C0L7F c0l7f, boolean z) {
                            c0l4x.getClass();
                            if (c0l7f != null) {
                                C0CNO.LIZLLL(0L, new AwS148S0101000_8(this, (int) c0l7f.LIZIZ, 7));
                            }
                        }

                        @Override // X.C0L7K
                        public final void LIZJ(int i3, String str3, boolean z) {
                            c0l4x.LIZJ(i3, str3, z);
                            this.LIZLLL();
                            this.LJ(enumC1412640mre.getValue(), i3, str2, "", str3);
                        }

                        @Override // X.C0L7K
                        public final void LJ(String str3, String str4, boolean z) {
                            c0l4x.LJ(str3, str4, z);
                        }
                    });
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(java.util.List r48, java.lang.String r49, java.lang.String r50, X.InterfaceC1364105Vn r51) {
        /*
            Method dump skipped, instruction units count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0L4P.LJFF(java.util.List, java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJI(com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager r6, java.lang.String r7, java.lang.String r8, X.InterfaceC1364105Vn<? super java.lang.Boolean> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof X.C0L4N
            if (r0 == 0) goto L41
            r4 = r9
            X.0L4N r4 = (X.C0L4N) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L41
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r2 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L2c
            if (r0 != r1) goto L54
            X.C155000ia.LIZIZ(r2)
        L22:
            X.0LSZ r2 = (X.C0LSZ) r2
            if (r2 != 0) goto L47
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L2c:
            X.C155000ia.LIZIZ(r2)
            X.0F2Q r2 = new X.0F2Q
            r0 = 0
            r2.<init>(r6, r7, r8, r0)
            r4.LLILLL = r1
            r0 = 600000(0x927c0, double:2.964394E-318)
            java.lang.Object r2 = X.C099A.LIZJ(r0, r2, r4)
            if (r2 != r3) goto L22
            return r3
        L41:
            X.0L4N r4 = new X.0L4N
            r4.<init>(r5, r9)
            goto L12
        L47:
            java.lang.String r1 = r2.LJ
            java.lang.String r0 = "FINISHED"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L54:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0L4P.LJI(com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager, java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }

    public final void LJ(int i, int i2, String str, String str2, String str3) {
        ((ITemplateMobService) ServiceManager.get().getService(ITemplateMobService.class)).LJIIIZ(str, Integer.valueOf(i), str2, C0L95.ANCHOR.getValue(), Long.valueOf(System.currentTimeMillis() - this.LLILZIL), Integer.valueOf(i2), str3, null, false);
        this.LLILZIL = -1L;
    }
}
