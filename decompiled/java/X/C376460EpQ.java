package X;

import android.app.Activity;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.editorpro.EditorProDraftModel;
import com.ss.android.ugc.aweme.creative.model.editorpro.EditorProModel;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.creative.model.publish.PostPageModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.services.optimization.ILayoutPreloadServiceForEditPage;
import com.ss.android.ugc.aweme.shortvideo.edit.PublishDataPreload;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editorpro.capabilities.audio.record.logic.AudioRecordActivityViewModel;
import com.ss.android.ugc.gamora.editorpro.framework.datastore.EditModelProvider;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AwS2S0320000_5;
import kotlin.jvm.internal.AwS4S2210000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0EpQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C376460EpQ {
    public final C1DRG LIZ;
    public final C372480Ej0 LIZIZ;
    public final InterfaceC497601wk LIZJ;
    public final C0EMK LIZLLL;
    public final C0E93 LJ;
    public final C0EG1 LJFF;
    public final Function0<Unit> LJI;
    public boolean LJIIJJI;
    public AnonymousClass0956 LJIIL;
    public final C01GW LJII = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1164));
    public final C01GW LJIIIIZZ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1163));
    public final C01GW LJIIIZ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1166));
    public final C01GW LJIIJ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1161));
    public final C01GW LJIILIIL = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(317));
    public final C01GW LJIILJJIL = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(316));

    public final InterfaceC376450EpP LIZLLL() {
        return (InterfaceC376450EpP) this.LIZ.LJIIL(null, InterfaceC376450EpP.class);
    }

    public final VideoPublishEditModel LJ() {
        C0EHJ c0ehj;
        C0EHI value = ((C0EY2) this.LJII.getValue()).zu2().getValue();
        if (value == null || (c0ehj = value.LIZ) == null) {
            return null;
        }
        return c0ehj.LIZ;
    }

    public final C0E48 LJFF() {
        return C349830DnZ.LIZ(this.LIZ);
    }

    public final long LJI() {
        return ((Number) this.LJIILIIL.getValue()).longValue();
    }

    public final boolean LJIIJJI() {
        EditorProModel editorProModel;
        EditModelProvider.Companion.getClass();
        EditModelProvider editModelProviderLIZ = C0E1T.LIZ();
        VideoPublishEditModel videoPublishEditModelLJ = LJ();
        boolean zIsRetakeVideo = videoPublishEditModelLJ != null ? videoPublishEditModelLJ.isRetakeVideo() : false;
        VideoPublishEditModel editModel = editModelProviderLIZ.getEditModel();
        if ((editModel == null || (editorProModel = editModel.getEditorProModel()) == null || !editorProModel.isAdvancedEdit()) && !zIsRetakeVideo) {
            return this.LJIIJJI;
        }
        return true;
    }

    public final EnumC376530EpX LIZ() {
        C0E48 c0e48LJFF = LJFF();
        return c0e48LJFF == null ? EnumC376530EpX.DIRECT : C354090DuR.LJI.isEmpty() ^ true ? EnumC376530EpX.AIMATTING_TOAST : (C350870DpF.LJII(c0e48LJFF) <= LJI() || C363750ENx.LIZ.LIZ("ExceedTimeLimitDialogShown", false)) ? C350870DpF.LJII(c0e48LJFF) < 1000 ? EnumC376530EpX.MIN_LIMIT_TOAST : EnumC376530EpX.DIRECT : EnumC376530EpX.MAX_LIMIT_TOAST;
    }

    public final void LJIJ() {
        C0E48 c0e48LJFF = LJFF();
        if (c0e48LJFF == null) {
            return;
        }
        C350870DpF.LJI(c0e48LJFF);
        C361680EFy.LJLJI("exit_ep_time", String.valueOf(System.currentTimeMillis()));
        C372750EjR.LIZ = System.currentTimeMillis();
        C372750EjR.LIZJ = true;
        Iterator it2 = ((ArrayList) C351220Dpo.LJLJJLL(C350870DpF.LJI(c0e48LJFF))).iterator();
        while (it2.hasNext()) {
            C372750EjR.LIZLLL += ((NLETrack) it2.next()).getSlots().size();
        }
        C372750EjR.LIZIZ = false;
    }

    public final boolean LJIJI() {
        C0EHI value;
        C0ELJ c0elj;
        VideoPublishEditModel editModel;
        EditorProDraftModel editorProDraftModel;
        C0E48 c0e48LJFF = LJFF();
        if (c0e48LJFF == null || (value = ((C0EY2) this.LJII.getValue()).zu2().getValue()) == null || (c0elj = value.LJ) == null) {
            return false;
        }
        return this.LJIIJJI || c0e48LJFF.Bo().LIZ() || (c0elj.isRestoreFromDraft() && (editModel = c0elj.getEditModel()) != null && (editorProDraftModel = editModel.getEditorProDraftModel()) != null && editorProDraftModel.canUndo);
    }

    public final Object LJIIL(AbstractC23140094w abstractC23140094w) {
        MusicBuzModel musicBuzModel;
        CreativeModel creativeModel;
        EditorProModel editorProModel;
        CreativeModel creativeModel2;
        PostPageModel postPageModel;
        C0E48 c0e48LJFF = LJFF();
        if (c0e48LJFF == null) {
            return Unit.LIZ;
        }
        ((InterfaceC376600Epe) this.LJIIJ.getValue()).nq0();
        if (c0e48LJFF.getPlayer().isPlaying()) {
            c0e48LJFF.getPlayer().pause(false);
        }
        boolean zLIZ = c0e48LJFF.Bo().LIZ();
        VideoPublishEditModel videoPublishEditModelLJ = LJ();
        if (videoPublishEditModelLJ != null && (creativeModel2 = videoPublishEditModelLJ.creativeModel) != null && (postPageModel = creativeModel2.postPageModel) != null) {
            postPageModel.isEnterFromEPDirectly = true;
        }
        VideoPublishEditModel videoPublishEditModelLJ2 = LJ();
        if (videoPublishEditModelLJ2 != null && (editorProModel = videoPublishEditModelLJ2.getEditorProModel()) != null) {
            editorProModel.setBackFromPublishTimestamp(0L);
        }
        LJIJ();
        ((ILayoutPreloadServiceForEditPage) ServiceManager.get().getService(ILayoutPreloadServiceForEditPage.class)).preloadLayoutFilesForPublishExtension(C545820Lau.LIZIZ(this.LIZIZ));
        PublishDataPreload.LIZ().startCheckerCache(this.LIZIZ.mActivity);
        AVMusic aVMusicM174clone = null;
        if (C301680Bs6.LIZ()) {
            VideoPublishEditModel videoPublishEditModelLJ3 = LJ();
            if (videoPublishEditModelLJ3 != null) {
                this.LIZIZ.LLLLLL().LJFF(videoPublishEditModelLJ3);
            }
            InterfaceC366350EXx interfaceC366350EXx = (InterfaceC366350EXx) this.LIZ.LJIIL(null, InterfaceC366350EXx.class);
            if (interfaceC366350EXx != null) {
                Object objOA0 = interfaceC366350EXx.OA0(LJIIJJI(), true, new C0EYE(false, zLIZ), abstractC23140094w);
                if (objOA0 == C099R.LJFF()) {
                    return objOA0;
                }
                return Unit.LIZ;
            }
        } else {
            C376570Epb c376570Epb = new C376570Epb(c0e48LJFF);
            c376570Epb.LIZIZ = new C366310EXt(zLIZ, LJIIJJI(), ((C0EC7) this.LJIIIIZZ.getValue()).jU1(C350870DpF.LJI(c0e48LJFF)));
            this.LIZLLL.LIZJ(c376570Epb);
            this.LIZLLL.LIZIZ(c376570Epb, true);
            C363500EMy c363500EMy = C363500EMy.LIZ;
            VideoPublishEditModel videoPublishEditModelLJ4 = LJ();
            if (videoPublishEditModelLJ4 != null && (creativeModel = videoPublishEditModelLJ4.creativeModel) != null) {
                musicBuzModel = creativeModel.musicBuzModel;
            } else {
                musicBuzModel = null;
            }
            AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(musicBuzModel);
            if (aVMusicExtractAVMusic != null) {
                aVMusicM174clone = aVMusicExtractAVMusic.m174clone();
            }
            c363500EMy.getClass();
            C363500EMy.LJFF = aVMusicM174clone;
        }
        return Unit.LIZ;
    }

    public final Object LJIILL(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        AudioRecordActivityViewModel audioRecordActivityViewModelLIZIZ = C350150Do5.LIZIZ(this.LIZIZ.mView);
        VideoPublishEditModel videoPublishEditModelLJ = LJ();
        if (videoPublishEditModelLJ == null) {
            return Unit.LIZ;
        }
        C0E48 c0e48LJFF = LJFF();
        if (c0e48LJFF == null) {
            return Unit.LIZ;
        }
        Object objZQ2 = audioRecordActivityViewModelLIZIZ.zQ2(videoPublishEditModelLJ, c0e48LJFF, new AwS549S0100000_5(this, 1162), interfaceC1364105Vn);
        if (objZQ2 == C099R.LJFF()) {
            return objZQ2;
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0119 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIZILJ(kotlin.jvm.functions.Function0<kotlin.Unit> r12, X.InterfaceC1364105Vn<? super kotlin.Unit> r13) {
        /*
            Method dump skipped, instruction units count: 768
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C376460EpQ.LJIIZILJ(kotlin.jvm.functions.Function0, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILJJIL(kotlin.jvm.functions.Function0<kotlin.Unit> r7, boolean r8, X.InterfaceC1364105Vn<? super kotlin.Unit> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof X.C376520EpW
            if (r0 == 0) goto L3f
            r5 = r9
            X.0EpW r5 = (X.C376520EpW) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3f
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r4 = r5.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r5.LLILLL
            r0 = 2
            r3 = 1
            if (r1 == 0) goto L28
            if (r1 == r3) goto L4d
            if (r1 != r0) goto L45
            X.C155000ia.LIZIZ(r4)
        L25:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L28:
            X.C155000ia.LIZIZ(r4)
            if (r8 == 0) goto L36
            r5.LLILLL = r3
            java.lang.Object r0 = r6.LJIIL(r5)
            if (r0 != r2) goto L50
            return r2
        L36:
            r5.LLILLL = r0
            java.lang.Object r0 = r6.LJIIZILJ(r7, r5)
            if (r0 != r2) goto L25
            return r2
        L3f:
            X.0EpW r5 = new X.0EpW
            r5.<init>(r6, r9)
            goto L12
        L45:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L4d:
            X.C155000ia.LIZIZ(r4)
        L50:
            X.0Ej0 r0 = r6.LIZIZ
            X.0Ej4 r0 = r0.LLLLLLIL()
            r0.getClass()
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r6.LJ()
            boolean r0 = X.C379370Eu7.LIZIZ(r0)
            if (r0 == 0) goto L6d
            X.0EpP r1 = r6.LIZLLL()
            if (r1 == 0) goto L6d
            r0 = 0
            r1.yC1(r0)
        L6d:
            X.1DRG r2 = r6.LIZ
            java.lang.Class<X.0nvQ> r1 = X.InterfaceC1453420nvQ.class
            r0 = 0
            java.lang.Object r2 = r2.LJIIL(r0, r1)
            X.0nvQ r2 = (X.InterfaceC1453420nvQ) r2
            if (r2 == 0) goto L81
            java.lang.String r1 = "clickPopupFromEdit"
            java.lang.String r0 = "video_edit_page"
            r2.vR(r3, r1, r0)
        L81:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C376460EpQ.LJIILJJIL(kotlin.jvm.functions.Function0, boolean, X.05Vn):java.lang.Object");
    }

    public final void LJIIIZ(String str, String str2, Function2<? super Boolean, ? super Boolean, Unit> function2, boolean z) {
        InterfaceC350420DoW interfaceC350420DoWBs;
        InterfaceC559500Lwy interfaceC559500Lwy;
        AnonymousClass0956 anonymousClass0956 = this.LJIIL;
        if (anonymousClass0956 != null && anonymousClass0956.isActive()) {
            return;
        }
        if (C301780BsG.LIZ() && (interfaceC559500Lwy = (InterfaceC559500Lwy) this.LIZ.LJIIL(null, InterfaceC559500Lwy.class)) != null) {
            interfaceC559500Lwy.Rm2();
        }
        ((C0EC7) this.LJIIIIZZ.getValue()).xJ2().LLJJIII = false;
        C0E48 c0e48LJFF = LJFF();
        if (c0e48LJFF != null && (interfaceC350420DoWBs = c0e48LJFF.bs()) != null) {
            C350440DoY.LIZIZ(interfaceC350420DoWBs);
        }
        this.LJIIL = C23250099c.LIZLLL(this.LIZJ, null, null, new C376480EpS(this, str, str2, function2, z, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIJ(X.InterfaceC1364105Vn r11, kotlin.jvm.functions.Function2 r12, boolean r13, boolean r14) {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C376460EpQ.LJIIJ(X.05Vn, kotlin.jvm.functions.Function2, boolean, boolean):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILIIL(java.lang.String r11, java.lang.String r12, X.InterfaceC1364105Vn r13, kotlin.jvm.functions.Function2 r14) {
        /*
            r10 = this;
            r5 = r11
            r7 = r12
            boolean r0 = r13 instanceof X.C376510EpV
            if (r0 == 0) goto L7f
            r4 = r13
            X.0EpV r4 = (X.C376510EpV) r4
            int r2 = r4.LLILZLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L7f
            int r2 = r2 - r1
            r4.LLILZLL = r2
        L14:
            java.lang.Object r3 = r4.LLILZ
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r4.LLILZLL
            r0 = 1
            if (r1 == 0) goto L6d
            if (r1 != r0) goto L85
            kotlin.jvm.functions.Function2 r14 = r4.LLILLL
            java.lang.Object r7 = r4.LLILLJJLI
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r5 = r4.LL
            java.lang.String r5 = (java.lang.String) r5
            X.C155000ia.LIZIZ(r3)
        L2e:
            X.0Ej0 r0 = r10.LIZIZ
            X.0Ej4 r0 = r0.LLLLLLIL()
            r0.getClass()
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r10.LJ()
            boolean r0 = X.C379370Eu7.LIZIZ(r0)
            if (r0 == 0) goto L4b
            X.0EpP r1 = r10.LIZLLL()
            if (r1 == 0) goto L4b
            r0 = 0
            r1.yC1(r0)
        L4b:
            X.1DRG r2 = r10.LIZ
            java.lang.Class<X.0nvQ> r1 = X.InterfaceC1453420nvQ.class
            r0 = 0
            java.lang.Object r4 = r2.LJIIL(r0, r1)
            X.0nvQ r4 = (X.InterfaceC1453420nvQ) r4
            if (r4 == 0) goto L6a
            r6 = 0
            kotlin.jvm.internal.AwS546S0100000_2 r8 = new kotlin.jvm.internal.AwS546S0100000_2
            r0 = 1034(0x40a, float:1.449E-42)
            r8.<init>(r10, r14, r0)
            kotlin.jvm.internal.AwS406S0200000_5 r9 = new kotlin.jvm.internal.AwS406S0200000_5
            r0 = 123(0x7b, float:1.72E-43)
            r9.<init>(r10, r14, r0)
            r4.Za0(r5, r6, r7, r8, r9)
        L6a:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L6d:
            X.C155000ia.LIZIZ(r3)
            r4.LL = r5
            r4.LLILLJJLI = r7
            r4.LLILLL = r14
            r4.LLILZLL = r0
            java.lang.Object r0 = r10.LJIIL(r4)
            if (r0 != r2) goto L2e
            return r2
        L7f:
            X.0EpV r4 = new X.0EpV
            r4.<init>(r10, r13)
            goto L14
        L85:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C376460EpQ.LJIILIIL(java.lang.String, java.lang.String, X.05Vn, kotlin.jvm.functions.Function2):java.lang.Object");
    }

    public final void LJIILLIIL(String str, String str2, Function2<? super Boolean, ? super Boolean, Unit> function2, boolean z) {
        boolean z2;
        VideoPublishEditModel videoPublishEditModelLJ;
        C0E48 c0e48LJFF = LJFF();
        if (c0e48LJFF == null) {
            return;
        }
        this.LJIIJJI = LJIJI();
        EnumC376530EpX enumC376530EpXLIZ = LIZ();
        if (enumC376530EpXLIZ == EnumC376530EpX.AIMATTING_TOAST) {
            C0E48 c0e48LJFF2 = LJFF();
            if (c0e48LJFF2 != null) {
                this.LJ.LIZ(c0e48LJFF2, LJ(), new C376550EpZ(this, str, str2, function2, z), new AwS549S0100000_5(this, 1165));
                return;
            }
            return;
        }
        if (enumC376530EpXLIZ == EnumC376530EpX.MIN_LIMIT_TOAST) {
            Activity activity = this.LIZIZ.mActivity;
            if (activity != null) {
                C372670EjJ.LIZIZ(activity.getString(2131850311));
            }
            InterfaceC559500Lwy interfaceC559500Lwy = (InterfaceC559500Lwy) this.LIZ.LJIIL(null, InterfaceC559500Lwy.class);
            if (interfaceC559500Lwy != null) {
                interfaceC559500Lwy.Bw0();
            }
            Boolean bool = Boolean.FALSE;
            function2.invoke(bool, bool);
            return;
        }
        if (C350870DpF.LJII(c0e48LJFF) > LJI()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (enumC376530EpXLIZ == EnumC376530EpX.MAX_LIMIT_TOAST) {
            VideoPublishEditModel videoPublishEditModelLJ2 = LJ();
            if (videoPublishEditModelLJ2 != null) {
                C361680EFy.LJJLIL(videoPublishEditModelLJ2, c0e48LJFF);
            }
            C372480Ej0 c372480Ej0 = this.LIZIZ;
            Activity activity2 = c372480Ej0.mActivity;
            if (activity2 != null) {
                C1397580mTM c1397580mTM = new C1397580mTM(activity2);
                c1397580mTM.LIZIZ(c372480Ej0.getString(2131833419, Long.valueOf((LJI() / ((long) 60)) / ((long) LSPassThroughRecordSizeConfig.DEFAULT))));
                c1397580mTM.LIZJ(new AwS584S0100000_5(this, 942));
                C985403tE.LIZ(c1397580mTM, new AwS4S2210000_5(this, str, str2, function2, z, 0));
                new C1397510mTF(c1397580mTM).LIZLLL();
            }
            C363750ENx.LIZ.LIZIZ("ExceedTimeLimitDialogShown", true);
            return;
        }
        if (z2 && (videoPublishEditModelLJ = LJ()) != null) {
            C361680EFy.LJJLIL(videoPublishEditModelLJ, c0e48LJFF);
        }
        if (c0e48LJFF.LLLLLLIL() != null) {
            ((C0E5S) this.LJIIIZ.getValue()).w6(null, false, false);
        }
        EditModelProvider.Companion.getClass();
        C0E1T.LIZ().setBgmSoundTrimModel$tools_camera_edit_release(null);
        LJIIIZ(str, str2, function2, z);
    }

    public final boolean LIZIZ(Function0<Unit> function0, Function2<? super Boolean, ? super Boolean, Unit> function2, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        VideoPublishEditModel videoPublishEditModelLJ;
        VideoPublishEditModel videoPublishEditModelLJ2;
        C0E48 c0e48LJFF = LJFF();
        if (c0e48LJFF == null) {
            return false;
        }
        C0E6V.LIZ = c0e48LJFF;
        if (z && (videoPublishEditModelLJ2 = LJ()) != null) {
            videoPublishEditModelLJ2.setClickNextBtnTimeInEditorPro(System.currentTimeMillis());
        }
        this.LJIIJJI = LJIJI();
        if (((Boolean) c0e48LJFF.S7().LIZJ("is_showing_album_page", Boolean.FALSE)).booleanValue()) {
            return false;
        }
        EnumC376530EpX enumC376530EpXLIZ = LIZ();
        if (enumC376530EpXLIZ == EnumC376530EpX.AIMATTING_TOAST) {
            C0E48 c0e48LJFF2 = LJFF();
            if (c0e48LJFF2 != null) {
                this.LJ.LIZ(c0e48LJFF2, LJ(), new C376580Epc(this, function0, function2, z2, z), AFwS191S0000000_5.get$arr$(313));
            }
            return false;
        }
        if (enumC376530EpXLIZ == EnumC376530EpX.MIN_LIMIT_TOAST) {
            Activity activity = this.LIZIZ.mActivity;
            if (activity != null) {
                C372670EjJ.LIZIZ(activity.getString(2131850311));
            }
            return false;
        }
        if (C350870DpF.LJII(c0e48LJFF) > LJI()) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (enumC376530EpXLIZ == EnumC376530EpX.MAX_LIMIT_TOAST) {
            VideoPublishEditModel videoPublishEditModelLJ3 = LJ();
            if (videoPublishEditModelLJ3 != null) {
                C361680EFy.LJJLIL(videoPublishEditModelLJ3, c0e48LJFF);
            }
            C1397580mTM c1397580mTM = new C1397580mTM(this.LIZIZ.requireActivity());
            c1397580mTM.LIZIZ(this.LIZIZ.getString(2131833419, Long.valueOf((LJI() / ((long) 60)) / ((long) LSPassThroughRecordSizeConfig.DEFAULT))));
            C985403tE.LIZ(c1397580mTM, new AwS2S0320000_5(this, function0, function2, z, z2, 1));
            new C1397510mTF(c1397580mTM).LIZLLL();
            C363750ENx.LIZ.LIZIZ("ExceedTimeLimitDialogShown", true);
            return false;
        }
        if (z5 && (videoPublishEditModelLJ = LJ()) != null) {
            C361680EFy.LJJLIL(videoPublishEditModelLJ, c0e48LJFF);
        }
        if (c0e48LJFF.LLLLLLIL() != null) {
            ((C0E5S) this.LJIIIZ.getValue()).w6(null, false, false);
        }
        EditModelProvider.Companion.getClass();
        C0E1T.LIZ().setBgmSoundTrimModel$tools_camera_edit_release(null);
        LJII(function0, function2, z, z2, z3, z4);
        return true;
    }

    public final void LJII(Function0<Unit> function0, Function2<? super Boolean, ? super Boolean, Unit> function2, boolean z, boolean z2, boolean z3, boolean z4) {
        C0EHI value;
        C0ELJ c0elj;
        InterfaceC350420DoW interfaceC350420DoWBs;
        EditorProModel editorProModel;
        AnonymousClass0956 anonymousClass0956 = this.LJIIL;
        if ((anonymousClass0956 == null || !anonymousClass0956.isActive()) && (value = ((C0EY2) this.LJII.getValue()).zu2().getValue()) != null && (c0elj = value.LJ) != null) {
            ((C0EC7) this.LJIIIIZZ.getValue()).xJ2().LLJJIII = false;
            VideoPublishEditModel videoPublishEditModelLJ = LJ();
            if (videoPublishEditModelLJ != null && (editorProModel = videoPublishEditModelLJ.getEditorProModel()) != null) {
                editorProModel.setClickBackSaveTime(System.currentTimeMillis());
            }
            C0E48 c0e48LJFF = LJFF();
            if (c0e48LJFF != null && (interfaceC350420DoWBs = c0e48LJFF.bs()) != null) {
                C350440DoY.LIZIZ(interfaceC350420DoWBs);
            }
            this.LJIIL = C23250099c.LIZLLL(this.LIZJ, null, null, new C376470EpR(this, function0, z, c0elj, z2, function2, z3, z4, null), 3);
        }
    }

    public C376460EpQ(C1DRG c1drg, C372480Ej0 c372480Ej0, InterfaceC497601wk interfaceC497601wk, C0EMK c0emk, C0E93 c0e93, C0EG1 c0eg1, AwS549S0100000_5 awS549S0100000_5) {
        this.LIZ = c1drg;
        this.LIZIZ = c372480Ej0;
        this.LIZJ = interfaceC497601wk;
        this.LIZLLL = c0emk;
        this.LJ = c0e93;
        this.LJFF = c0eg1;
        this.LJI = awS549S0100000_5;
    }
}
