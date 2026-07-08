package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS217S0300000_8;
import kotlin.jvm.internal.AwS374S0200000_8;
import kotlin.jvm.internal.AwS409S0200000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS587S0100000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LAO, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LAO extends AbstractC1664490tPr<C0LAQ, C0LAR> {
    public final Map<String, C0LAX> LLJJJIL = C2097608Jq.LJIIIIZZ(new Pair("draft", new C0LAX() { // from class: X.0L5Y
        @Override // X.C0LAX
        public final void LIZ() {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LIZ), null, null, new C0L5Z(this.LIZ, null), 3);
        }

        @Override // X.C0LAX
        public final void LIZIZ() {
            this.LIZ.LLLLLLL(9);
        }

        @Override // X.C0LAX
        public final void wk() {
            if (!this.LIZ.LLLLLLZ()) {
                this.LIZ.LLLLLJIL();
            } else {
                C0LAO c0lao = this.LIZ;
                c0lao.LLLLLZ(new AwS552S0100000_8(c0lao, 1126), new AwS552S0100000_8(this.LIZ, 1127));
            }
        }
    }), new Pair("push", new C0LAX() { // from class: X.0L5T
        @Override // X.C0LAX
        public final void LIZ() {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LIZ), null, null, new C0L5U(this.LIZ, null), 3);
        }

        @Override // X.C0LAX
        public final void LIZIZ() {
            this.LIZ.LLLLLLL(7);
        }

        @Override // X.C0LAX
        public final void wk() {
            if (!this.LIZ.LLLLLLZ()) {
                LIZ();
            } else {
                C0LAO c0lao = this.LIZ;
                c0lao.LLLLLZ(new AwS552S0100000_8(c0lao, 1128), new AwS552S0100000_8(this.LIZ, 1129));
            }
        }
    }), new Pair("album", new C0LAX() { // from class: X.0L5f
        @Override // X.C0LAX
        public final void LIZ() {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LIZ), null, null, new C0L5W(this.LIZ, null), 3);
        }

        @Override // X.C0LAX
        public final void LIZIZ() {
            VideoPublishEditModel videoPublishEditModel;
            String creationId;
            Activity activityLLLLLLJ = this.LIZ.LLLLLLJ();
            if (activityLLLLLLJ == null || (videoPublishEditModel = this.LIZ.LLLLILI().LIZ.LIZJ) == null || (creationId = videoPublishEditModel.getCreationId()) == null) {
                return;
            }
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LIZ), null, null, new C537230L5d(creationId, this.LIZ, activityLLLLLLJ, null), 3);
        }

        @Override // X.C0LAX
        public final void wk() {
            C1397510mTF c1397510mTF;
            if (this.LIZ.LLLLLLZ()) {
                C0LAO c0lao = this.LIZ;
                c0lao.LLLLLZ(new AwS552S0100000_8(c0lao, 1123), new AwS552S0100000_8(this.LIZ, 1124));
                return;
            }
            C0LAO c0lao2 = this.LIZ;
            AwS552S0100000_8 awS552S0100000_8 = new AwS552S0100000_8(c0lao2, 1125);
            Activity activityLLLLLLJ = c0lao2.LLLLLLJ();
            if (activityLLLLLLJ != null) {
                if (c0lao2.LLJJJJJIL == null) {
                    C013C c013c = new C013C();
                    C1397580mTM c1397580mTM = new C1397580mTM(activityLLLLLLJ);
                    c1397580mTM.LJFF(2131850051);
                    c1397580mTM.LIZ(2131850048);
                    C985403tE.LIZ(c1397580mTM, new AwS217S0300000_8(c013c, awS552S0100000_8, c0lao2, 50));
                    c1397580mTM.LIZLLL(new AwS374S0200000_8(c013c, c0lao2, 220));
                    c0lao2.LLJJJJJIL = new C1397510mTF(c1397580mTM);
                }
                C1397510mTF c1397510mTF2 = c0lao2.LLJJJJJIL;
                if (c1397510mTF2 != null && c1397510mTF2.LJIIIZ() && (c1397510mTF = c0lao2.LLJJJJJIL) != null) {
                    c1397510mTF.LIZIZ(null);
                }
                C1397510mTF c1397510mTF3 = c0lao2.LLJJJJJIL;
                if (c1397510mTF3 != null) {
                    c1397510mTF3.LIZLLL();
                }
                C0LAF c0laf = C0LAF.LIZ;
                VideoPublishEditModel videoPublishEditModel = c0lao2.LLLLILI().LIZ.LIZJ;
                c0laf.getClass();
                C0LAF.LIZJ("exit_template_async_popup_show", C2097608Jq.LJ(), videoPublishEditModel);
            }
        }
    }));
    public final C01GW LLJJJJ = C452501pT.LIZIZ(new AwS552S0100000_8(this, 1130));
    public C1397510mTF LLJJJJJIL;
    public C570010MXf LLJJJJLIIL;

    public final Activity LLLLLLJ() {
        Activity activity = this.mActivity;
        if (activity == null || C545820Lau.LIZLLL(activity, this) || activity.isDestroyed()) {
            return null;
        }
        return activity;
    }

    public final void S() {
        C0LAX c0lax = this.LLJJJIL.get(LLLLILI().LIZ.LIZ);
        if (c0lax != null) {
            c0lax.wk();
        }
        C0LAF c0laf = C0LAF.LIZ;
        String str = LLLLILI().LIZ.LIZ;
        VideoPublishEditModel videoPublishEditModel = LLLLILI().LIZ.LIZJ;
        c0laf.getClass();
        C0LAF.LIZIZ(videoPublishEditModel, str, "click_back");
    }

    @Override // X.AbstractC1664490tPr
    public final void onHide() {
        InterfaceC524950KiL interfaceC524950KiL;
        C128Y c128y = this.mParentScene;
        if (!(c128y instanceof InterfaceC524950KiL) || (interfaceC524950KiL = (InterfaceC524950KiL) c128y) == null) {
            return;
        }
        interfaceC524950KiL.b8((InterfaceC362610EJn) this.LLJJJJ.getValue());
    }

    @Override // X.AbstractC1664490tPr
    public final void onShow() {
        InterfaceC524950KiL interfaceC524950KiL;
        C128Y c128y = this.mParentScene;
        if (!(c128y instanceof InterfaceC524950KiL) || (interfaceC524950KiL = (InterfaceC524950KiL) c128y) == null) {
            return;
        }
        interfaceC524950KiL.kF((InterfaceC362610EJn) this.LLJJJJ.getValue());
    }

    public final void LLLLLJIL() {
        Activity activityLLLLLLJ = LLLLLLJ();
        if (activityLLLLLLJ == null) {
            return;
        }
        Intent intent = new Intent();
        intent.setFlags(536870912);
        C1660680tJi.LIZ().LIZ(activityLLLLLLJ, intent, true, false);
    }

    public final void LLLLLJLJLL() {
        Activity activityLLLLLLJ = LLLLLLJ();
        if (activityLLLLLLJ == null) {
            return;
        }
        Intent intent = new Intent();
        intent.addFlags(335544320);
        ((IAVServiceProxy) ServiceManager.get().getService(IAVServiceProxy.class)).getApplicationService();
        intent.setClass(activityLLLLLLJ, C19221910Hx.LIZJ());
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activityLLLLLLJ, intent, "Context_startActivity_1");
        C1701330uNH.LIZ(intent, activityLLLLLLJ);
        C2204961BRm.LJIILLIIL(activityLLLLLLJ, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6nbJPdkj9dPSVF/XyG/+XDC7UB+vkV6YdwhsPCI7WECh2BLagIJgaKqM3Rq1Oc", null));
    }

    public final void LLLLLLIL() {
        InterfaceC20597015ii interfaceC20597015iiLJ = C20622515mp.LJ(this);
        if (interfaceC20597015iiLJ != null) {
            interfaceC20597015iiLJ.finish();
            return;
        }
        Activity activity = this.mActivity;
        if (activity != null) {
            activity.finish();
        }
    }

    public final void LLLLLLLLL() {
        C0LAU c0lau = LLLLILI().LIZ.LIZIZ;
        if (Intrinsics.LJFF(c0lau, C538500LAa.LIZ)) {
            ((TextView) this.mView.findViewById(R.id.tv_tip)).setText(2131850045);
            ((TextView) this.mView.findViewById(R.id.cp0)).setText(2131850046);
            C0LAP c0lap = (C0LAP) this.mView.findViewById(R.id.xij);
            C786410Ut5.LJLLLLLL(0, c0lap.getVLoadingFromXml());
            C436180H8m.LIZIZ(c0lap.getIcErrorFromXml());
            c0lap.getTvNoticeFromXml().setText(2131850047);
            return;
        }
        if (c0lau instanceof C0LAW) {
            C0LAP c0lap2 = (C0LAP) this.mView.findViewById(R.id.xij);
            int i = ((C0LAW) c0lau).LIZ;
            C786410Ut5.LJLLLLLL(0, c0lap2.getVLoadingFromXml());
            C436180H8m.LIZIZ(c0lap2.getIcErrorFromXml());
            c0lap2.getTvNoticeFromXml().setText(c0lap2.getResources().getQuantityString(2131755753, i, Integer.valueOf(i)));
            return;
        }
        if (Intrinsics.LJFF(c0lau, C538510LAb.LIZ)) {
            C0LAX c0lax = this.LLJJJIL.get(LLLLILI().LIZ.LIZ);
            if (c0lax != null) {
                c0lax.LIZIZ();
                return;
            }
            return;
        }
        if (!(c0lau instanceof C0LAV)) {
            throw new C1954807lC();
        }
        if (LLLLLLJ() == null) {
            return;
        }
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (C036E.LIZ.LIZIZ()) {
            C0LAP c0lap3 = (C0LAP) this.mView.findViewById(R.id.xij);
            C436180H8m.LIZIZ(c0lap3.getVLoadingFromXml());
            C786410Ut5.LJLLLLLL(0, c0lap3.getIcErrorFromXml());
            c0lap3.getTvNoticeFromXml().setText(2131850053);
            ((TextView) this.mView.findViewById(R.id.tv_tip)).setText(2131850052);
        } else {
            C0LAP c0lap4 = (C0LAP) this.mView.findViewById(R.id.xij);
            C436180H8m.LIZIZ(c0lap4.getVLoadingFromXml());
            C786410Ut5.LJLLLLLL(0, c0lap4.getIcErrorFromXml());
            c0lap4.getTvNoticeFromXml().setText(2131850044);
            ((TextView) this.mView.findViewById(R.id.tv_tip)).setText(2131850042);
        }
        ((TextView) this.mView.findViewById(R.id.cp0)).setText(2131850043);
    }

    public final void LLLLLLLLLL() {
        C1397510mTF c1397510mTF;
        C1397510mTF c1397510mTF2;
        if (LLLLLLJ() == null || (c1397510mTF = this.LLJJJJJIL) == null || !c1397510mTF.LJIIIZ() || (c1397510mTF2 = this.LLJJJJJIL) == null) {
            return;
        }
        c1397510mTF2.LIZIZ(null);
    }

    public final void LLLLLLLZIL() {
        C570010MXf c570010MXf;
        C570010MXf c570010MXf2;
        if (LLLLLLJ() == null || (c570010MXf = this.LLJJJJLIIL) == null || !c570010MXf.LIZJ() || (c570010MXf2 = this.LLJJJJLIIL) == null) {
            return;
        }
        c570010MXf2.LIZIZ();
    }

    public final boolean LLLLLLZ() {
        return LLLLILI().LIZ.LIZIZ instanceof C0LAV;
    }

    public final void LLLLLZL() {
        Activity activityLLLLLLJ = LLLLLLJ();
        if (activityLLLLLLJ != null) {
            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
            creativeToastBuilder.messageRes(2131829845);
            creativeToastBuilder.acrossActivities(true);
            C1390380mHk.LIZ(activityLLLLLLJ, 1007, creativeToastBuilder);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LLLLLL(X.InterfaceC1364105Vn<? super kotlin.Unit> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof X.C537220L5c
            if (r0 == 0) goto L67
            r5 = r8
            X.0L5c r5 = (X.C537220L5c) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L67
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r6 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r3 = 3
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L2b
            if (r0 == r1) goto L3f
            if (r0 == r2) goto L53
            if (r0 != r3) goto L6d
            X.C155000ia.LIZIZ(r6)
        L28:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L2b:
            X.C155000ia.LIZIZ(r6)
            java.lang.Object r0 = r7.LLLLIL()
            X.0LAR r0 = (X.C0LAR) r0
            kotlin.jvm.functions.Function1<X.05Vn<? super kotlin.Unit>, java.lang.Object> r0 = r0.LIZJ
            r5.LLILLL = r1
            java.lang.Object r0 = r0.invoke(r5)
            if (r0 != r4) goto L42
            return r4
        L3f:
            X.C155000ia.LIZIZ(r6)
        L42:
            java.lang.Object r0 = r7.LLLLIL()
            X.0LAR r0 = (X.C0LAR) r0
            kotlin.jvm.functions.Function1<X.05Vn<? super kotlin.Unit>, java.lang.Object> r0 = r0.LIZLLL
            r5.LLILLL = r2
            java.lang.Object r0 = r0.invoke(r5)
            if (r0 != r4) goto L56
            return r4
        L53:
            X.C155000ia.LIZIZ(r6)
        L56:
            java.lang.Object r0 = r7.LLLLIL()
            X.0LAR r0 = (X.C0LAR) r0
            kotlin.jvm.functions.Function1<X.05Vn<? super kotlin.Unit>, java.lang.Object> r0 = r0.LIZIZ
            r5.LLILLL = r3
            java.lang.Object r0 = r0.invoke(r5)
            if (r0 != r4) goto L28
            return r4
        L67:
            X.0L5c r5 = new X.0L5c
            r5.<init>(r7, r8)
            goto L12
        L6d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LAO.LLLLLL(X.05Vn):java.lang.Object");
    }

    public final void LLLLLLL(int i) {
        VideoPublishEditModel videoPublishEditModel;
        String creationId;
        Activity activityLLLLLLJ = LLLLLLJ();
        if (activityLLLLLLJ != null && (videoPublishEditModel = LLLLILI().LIZ.LIZJ) != null && (creationId = videoPublishEditModel.getCreationId()) != null) {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C537200L5a(creationId, activityLLLLLLJ, i, this, null), 3);
        }
    }

    public final void LLLLLLZZ(AwemeDraft awemeDraft) {
        NLEModel nleModel;
        VecNLETrackSPtr tracks;
        String creationId;
        String templateId;
        VideoPublishEditModel videoPublishEditModel = LLLLILI().LIZ.LIZJ;
        String str = null;
        if (videoPublishEditModel != null && (nleModel = videoPublishEditModel.getNleModel()) != null && (tracks = nleModel.getTracks()) != null && !tracks.isEmpty()) {
            Iterator<NLETrack> it2 = tracks.iterator();
            while (it2.hasNext()) {
                VecNLETrackSlotSPtr slots = it2.next().getSlots();
                if (slots != null && !slots.isEmpty()) {
                    for (NLETrackSlot nLETrackSlot : slots) {
                        if (C377740ErU.LIZ(nLETrackSlot) != null && nLETrackSlot.getRenderProxy() == null) {
                            VideoPublishEditModel videoPublishEditModel2 = LLLLILI().LIZ.LIZJ;
                            if (videoPublishEditModel2 != null) {
                                creationId = videoPublishEditModel2.getCreationId();
                            } else {
                                creationId = null;
                            }
                            VideoPublishEditModel videoPublishEditModel3 = LLLLILI().LIZ.LIZJ;
                            if (videoPublishEditModel3 != null) {
                                templateId = videoPublishEditModel3.getTemplateId();
                            } else {
                                templateId = null;
                            }
                            if (awemeDraft != null) {
                                str = awemeDraft.LJJJJIZL.shootWay;
                            }
                            C0LAB c0lab = new C0LAB();
                            c0lab.LJ("creation_id", creationId);
                            c0lab.LJ("tt_template_id", templateId);
                            c0lab.LJ("shoot_way", str);
                            C377880Eri.LIZ(c0lab, nleModel);
                            C20684815ws.LJIILLIIL("ai_create_template_apply", c0lab.LIZ);
                            return;
                        }
                    }
                }
            }
        }
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        Window window;
        super.onActivityCreated(bundle);
        Activity activityLLLLLLJ = LLLLLLJ();
        if (activityLLLLLLJ != null && (window = activityLLLLLLJ.getWindow()) != null) {
            window.clearFlags(1024);
        }
        C786410Ut5.a9((TuxIconView) this.mView.findViewById(R.id.cnb), new C580850MqJ(this, 13));
        ((TextView) this.mView.findViewById(R.id.cp0)).setText(2131850046);
        ((TextView) this.mView.findViewById(R.id.cp0)).setTextColor(-1);
        C786410Ut5.h9((TuxTextView) this.mView.findViewById(R.id.cp0), new C580850MqJ(this, 14));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0LAS
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0LAQ) obj).LIZIZ;
            }
        }, Lifecycle.State.STARTED, new AwS587S0100000_8(this, 769));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0LAT
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0LAQ) obj).LIZJ;
            }
        }, Lifecycle.State.STARTED, new AwS587S0100000_8(this, 770));
        LLLLLLLLL();
    }

    public final void LLLLLZ(Function0<Unit> function0, Function0<Unit> function02) {
        C570010MXf c570010MXf;
        Activity activityLLLLLLJ = LLLLLLJ();
        if (activityLLLLLLJ == null) {
            return;
        }
        C570010MXf c570010MXf2 = this.LLJJJJLIIL;
        if (c570010MXf2 != null && c570010MXf2.LIZJ() && (c570010MXf = this.LLJJJJLIIL) != null) {
            c570010MXf.LIZIZ();
        }
        C570010MXf c570010MXf3 = new C570010MXf(activityLLLLLLJ, this.mView.findViewById(R.id.cnb), C1697810uHb.LJIIJJI(new C570020MXg(R.raw.icon_trash_bin, 2131829841, R.attr.a1m, R.attr.a1m, new AwS409S0200000_8(this, function0, 154), 176), new C570020MXg(R.raw.icon_draft, 2131829846, R.attr.a1h, R.attr.a1h, new AwS409S0200000_8(this, function02, 155), 176)), new InterfaceC570030MXh() { // from class: X.0LAY
            @Override // X.InterfaceC570030MXh
            public final void LIZ(int i) {
            }

            @Override // X.InterfaceC570030MXh
            public final void onCancel() {
            }

            @Override // X.InterfaceC570030MXh
            public final void onShow() {
            }
        }, 112);
        this.LLJJJJLIIL = c570010MXf3;
        c570010MXf3.LIZLLL();
        C0LAF c0laf = C0LAF.LIZ;
        VideoPublishEditModel videoPublishEditModel = LLLLILI().LIZ.LIZJ;
        c0laf.getClass();
        if (videoPublishEditModel != null) {
            C1402930mbz.LJII(videoPublishEditModel, "async_fail");
        }
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.en9, viewGroup, false);
    }
}
