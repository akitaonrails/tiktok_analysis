package X;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager;
import com.ss.android.ugc.aweme.creative.model.edit.TextImageTaskInfo;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AwS148S0101000_8;
import l5a.a;

/* JADX INFO: renamed from: X.0LIL, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LIL implements InterfaceC572020Mc4 {
    public final AbstractC214814194y LIZ;
    public final VideoPublishEditModel LIZIZ;
    public final String LIZJ;
    public final C0CSH LIZLLL;
    public final InterfaceC1455860nzM LJ;
    public View LJFF;
    public final ArrayList<C570020MXg> LJI;
    public final C19GS LJII;
    public final C01GW LJIIIIZZ;
    public final C0LIN LJIIIZ;
    public final C0LIM LJIIJ;
    public final C569180MUa LJIIJJI;
    public C570010MXf LJIIL;

    @Override // X.InterfaceC572020Mc4
    public final boolean LIZLLL() {
        C570010MXf c570010MXf = this.LJIIL;
        return c570010MXf != null && c570010MXf.LIZJ();
    }

    @Override // X.InterfaceC572020Mc4
    public final void LJ() {
        final C0LIG c0lig = new C0LIG(this);
        if (C0CHQ.LIZ().getAccountService().isLogin()) {
            c0lig.invoke();
        } else {
            C1655820tBs.LIZ(this.LJII, "video_edit_page", "click_save_draft_popup", new InterfaceC1655960tC6() { // from class: X.0LIS
                @Override // X.InterfaceC1655960tC6
                public final void LIZ() {
                }

                @Override // X.InterfaceC1655960tC6
                public final void onSuccess() {
                    c0lig.invoke();
                }
            });
        }
    }

    public final void LJI() {
        Intent intent = new Intent();
        intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_DRAFT", true);
        intent.putExtra("shoot_from", this.LIZIZ.mShootWay);
        intent.putExtra("shoot_way", this.LIZIZ.mShootWay);
        intent.putExtra("creation_id", this.LIZIZ.getCreationId());
        intent.addFlags(335544320);
        C19GS c19gs = this.LJII;
        ((IAVServiceProxy) ServiceManager.get().getService(IAVServiceProxy.class)).getApplicationService();
        intent.setClass(c19gs, C19221910Hx.LIZJ());
        C201955140j.LIZJ(C1662160tM6.LIZIZ, "SaveDraft to Feed page");
        C19GS c19gs2 = this.LJII;
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(c19gs2, intent, "Context_startActivity_1");
        C1701330uNH.LIZ(intent, c19gs2);
        C2204961BRm.LLJJI(c19gs2, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF384cWghZ6StZ5ba0yD0GY8VZDzwvh5zIp+mRGn8Xy1+xu5nu81Yr8j+J+nM", null));
    }

    public final void LJII() {
        TextImageTaskInfo textImageTaskInfoLIZJ = C572250McR.LIZJ(this.LIZIZ.creativeModel.text2ImageModel);
        if (textImageTaskInfoLIZJ != null) {
            String uri = textImageTaskInfoLIZJ.getUri();
            if ((uri == null || uri.length() == 0) && 1 != 0) {
                ICreationAsyncTaskManager iCreationAsyncTaskManagerLIZ = C09BV.LIZ();
                if (iCreationAsyncTaskManagerLIZ != null && iCreationAsyncTaskManagerLIZ.LJIILIIL() != null) {
                    C0LCT.LIZLLL(this.LIZIZ.getCreationId(), false);
                }
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0LIP(textImageTaskInfoLIZJ, null), 3);
            }
        }
    }

    @Override // X.InterfaceC572020Mc4
    public final void dismissDialog() {
        C570010MXf c570010MXf = this.LJIIL;
        if (c570010MXf != null) {
            c570010MXf.LIZIZ();
        }
    }

    @Override // X.InterfaceC572020Mc4
    public final void LIZ(boolean z) {
        String asyncTaskId;
        ICreationAsyncTaskManager iCreationAsyncTaskManagerLIZ;
        if (!z) {
            ICreationAsyncTaskManager iCreationAsyncTaskManagerLIZ2 = C09BV.LIZ();
            if (iCreationAsyncTaskManagerLIZ2 != null) {
                iCreationAsyncTaskManagerLIZ2.LJJIL(this.LIZIZ.getCreationId());
                return;
            }
            return;
        }
        for (TextImageTaskInfo textImageTaskInfo : this.LIZIZ.creativeModel.text2ImageModel.imageTaskList) {
            if (!this.LIZIZ.creativeModel.text2ImageModel.tempImageTaskList.contains(textImageTaskInfo) && (asyncTaskId = textImageTaskInfo.getAsyncTaskId()) != null && C1533950q1J.LJ(asyncTaskId) && (iCreationAsyncTaskManagerLIZ = C09BV.LIZ()) != null) {
                iCreationAsyncTaskManagerLIZ.LJJIII(asyncTaskId);
            }
        }
    }

    @Override // X.InterfaceC572020Mc4
    public final void LIZJ(View view) {
        this.LJFF = view;
    }

    public final void LJFF(boolean z) {
        a.LIZIZ.LIZ(this.LIZIZ.getCreationId());
        VideoPublishEditModel videoPublishEditModel = this.LIZIZ;
        if (videoPublishEditModel.mDraftToEditFrom != 3 || videoPublishEditModel.isPostDraftPrompt()) {
            C1660680tJi.LIZ().LIZ(this.LJII, new Intent(), z, this.LIZIZ.creativeModel.draftInfoModel.isConvertToNormalDraft);
        }
        this.LJII.finish();
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIIZZ(boolean r10, X.InterfaceC1364105Vn<? super kotlin.Unit> r11) {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LIL.LJIIIIZZ(boolean, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f9 A[Catch: all -> 0x0165, Exception -> 0x0167, TRY_LEAVE, TryCatch #7 {Exception -> 0x0167, all -> 0x0165, blocks: (B:24:0x00e8, B:26:0x00f9), top: B:63:0x00e8 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0126 A[Catch: Exception -> 0x0163, all -> 0x01af, TryCatch #8 {Exception -> 0x0163, blocks: (B:27:0x0116, B:28:0x0126, B:30:0x012c, B:31:0x012f), top: B:55:0x00f7 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0177 A[Catch: all -> 0x01af, TRY_LEAVE, TryCatch #9 {all -> 0x01af, blocks: (B:27:0x0116, B:45:0x0170, B:47:0x0177, B:50:0x01ae, B:52:0x01b0, B:28:0x0126, B:30:0x012c, B:31:0x012f), top: B:56:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01ae A[Catch: all -> 0x01af, TRY_ENTER, TRY_LEAVE, TryCatch #9 {all -> 0x01af, blocks: (B:27:0x0116, B:45:0x0170, B:47:0x0177, B:50:0x01ae, B:52:0x01b0, B:28:0x0126, B:30:0x012c, B:31:0x012f), top: B:56:0x0023 }] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialog] */
    /* JADX WARN: Type inference failed for: r3v14, types: [com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialog] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16, types: [com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialog] */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18, types: [com.ss.android.ugc.tools.view.uikit.factory.CreativeDialogWrapper] */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIZ(boolean r22, X.InterfaceC1364105Vn<? super kotlin.Unit> r23) {
        /*
            Method dump skipped, instruction units count: 439
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LIL.LJIIIZ(boolean, X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC572020Mc4
    public final void LIZIZ(List<Integer> list, List<Integer> list2, List<? extends Function0<Unit>> list3) {
        Context contextLIZIZ;
        C570010MXf c570010MXf;
        C570010MXf c570010MXf2 = this.LJIIL;
        int i = 0;
        if (c570010MXf2 != null && c570010MXf2.LIZJ() && (c570010MXf = this.LJIIL) != null) {
            c570010MXf.LIZIZ();
        }
        this.LJI.clear();
        Iterator<Integer> it2 = list.iterator();
        while (true) {
            C570010MXf c570010MXf3 = null;
            if (it2.hasNext()) {
                Integer next = it2.next();
                int i2 = i + 1;
                if (i >= 0) {
                    int iIntValue = next.intValue();
                    if (i == 0) {
                        this.LJI.add(new C570020MXg(iIntValue, ((Number) ListProtector.get(list2, i)).intValue(), R.attr.a1m, R.attr.a1m, new AwS148S0101000_8(list3, (List<? extends Function0<Unit>>) i, 2), 176));
                    } else {
                        this.LJI.add(new C570020MXg(iIntValue, ((Number) ListProtector.get(list2, i)).intValue(), 0, 0, new AwS148S0101000_8(list3, (List<? extends Function0<Unit>>) i, 3), 188));
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            } else {
                if (C545820Lau.LIZIZ(this.LIZ) != null) {
                    View view = this.LJFF;
                    if (view != null && (contextLIZIZ = C545820Lau.LIZIZ(this.LIZ)) != null) {
                        c570010MXf3 = new C570010MXf(contextLIZIZ, view, this.LJI, this.LJIIJJI, 48);
                    }
                    this.LJIIL = c570010MXf3;
                }
                C570010MXf c570010MXf4 = this.LJIIL;
                if (c570010MXf4 != null) {
                    c570010MXf4.LIZLLL();
                    return;
                }
                return;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [X.0LIM] */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.0MUa, X.0MXh] */
    public C0LIL(AbstractC214814194y abstractC214814194y, VideoPublishEditModel videoPublishEditModel, String str, C0CSH c0csh, C0CSK c0csk, int i) {
        Context sceneContext;
        str = (i & 4) != 0 ? "" : str;
        C570010MXf c570010MXf = null;
        c0csh = (i & 8) != 0 ? null : c0csh;
        c0csk = (i & 16) != 0 ? null : c0csk;
        this.LIZ = abstractC214814194y;
        this.LIZIZ = videoPublishEditModel;
        this.LIZJ = str;
        this.LIZLLL = c0csh;
        this.LJ = c0csk;
        this.LJFF = null;
        ArrayList<C570020MXg> arrayList = new ArrayList<>();
        this.LJI = arrayList;
        this.LJII = abstractC214814194y.requireAppCompatActivity();
        this.LJIIIIZZ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(287));
        this.LJIIIZ = new C0LIN(this);
        this.LJIIJ = new InterfaceC540360LHe() { // from class: X.0LIM
            @Override // X.InterfaceC540360LHe
            public final Function1<AwemeDraft, Unit> LIZ() {
                return null;
            }

            @Override // X.InterfaceC540360LHe
            public final void LIZIZ(C540340LHc c540340LHc) {
                C19GS c19gs = this.LIZ.LJII;
                if (c19gs != null && !c19gs.isFinishing()) {
                    this.LIZ.LJFF(false);
                    C201955140j.LIZ("zyc draft save failed");
                }
            }

            @Override // X.InterfaceC540360LHe
            public final void LIZJ(C540340LHc c540340LHc) {
                C19GS c19gs = this.LIZ.LJII;
                if (c19gs != null && !c19gs.isFinishing()) {
                    C0CHQ.LIZ().LJIIJ().LJFF();
                    this.LIZ.LJII();
                    String string = this.LIZ.LJII.getString(2131844962);
                    C19GS c19gs2 = this.LIZ.LJII;
                    CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                    creativeToastBuilder.message(string);
                    creativeToastBuilder.acrossActivities(true);
                    C1390380mHk.LIZ(c19gs2, 1007, creativeToastBuilder);
                    this.LIZ.LJFF(true);
                    C201955140j.LIZ("zyc draft save success");
                }
            }
        };
        ?? r5 = new InterfaceC570030MXh() { // from class: X.0MUa
            @Override // X.InterfaceC570030MXh
            public final void onCancel() {
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x009c  */
            @Override // X.InterfaceC570030MXh
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onShow() {
                /*
                    r6 = this;
                    X.0LIL r0 = r6.LIZ
                    com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r3 = r0.LIZIZ
                    java.lang.String r5 = r0.LIZJ
                    X.0LAB r2 = new X.0LAB
                    r2.<init>()
                    java.lang.String r1 = r3.getEnterFrom()
                    java.lang.String r0 = "enter_from"
                    r2.LJ(r0, r1)
                    java.lang.String r1 = "content_type"
                    java.lang.String r0 = X.C1428470nHB.LJIILL(r3)
                    r2.LJ(r1, r0)
                    java.lang.String r1 = X.C1428470nHB.LJIILIIL(r3)
                    java.lang.String r0 = "content_source"
                    r2.LJ(r0, r1)
                    java.lang.String r1 = "shoot_way"
                    java.lang.String r0 = r3.mShootWay
                    r2.LJ(r1, r0)
                    java.lang.String r1 = "creation_id"
                    java.lang.String r0 = r3.getCreationId()
                    r2.LJ(r1, r0)
                    java.lang.String r0 = "is_text_mode"
                    r4 = 1
                    r2.LIZ(r4, r0)
                    java.lang.String r0 = "from_page"
                    r2.LJ(r0, r5)
                    java.lang.String r0 = "is_text_trans_pic"
                    r2.LIZ(r4, r0)
                    com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r3.creativeModel
                    com.ss.android.ugc.aweme.creative.model.edit.Text2ImageModel r0 = r0.text2ImageModel
                    java.lang.String r1 = r0.text
                    java.lang.String r0 = "text_description"
                    r2.LJ(r0, r1)
                    com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r3.creativeModel
                    com.ss.android.ugc.aweme.creative.model.edit.Text2ImageModel r0 = r0.text2ImageModel
                    java.lang.String r0 = r0.text
                    if (r0 == 0) goto L9e
                    int r0 = r0.length()
                    java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
                L61:
                    java.lang.String r0 = "text_length"
                    r2.LIZLLL(r1, r0)
                    X.C572310McX.LJFF(r3, r2)
                    com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r3.creativeModel
                    com.ss.android.ugc.aweme.creative.model.edit.Text2ImageModel r0 = r0.text2ImageModel
                    java.lang.String r0 = r0.commentText
                    boolean r0 = X.C123100dR.LIZ(r0)
                    if (r0 == 0) goto L9c
                    com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r3.creativeModel
                    com.ss.android.ugc.aweme.creative.model.edit.Text2ImageModel r0 = r0.text2ImageModel
                    java.lang.String r1 = r0.text
                    java.lang.String r0 = r0.commentText
                    boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
                    if (r0 != 0) goto L9c
                L83:
                    java.lang.String r0 = "is_edit_original_comment"
                    r2.LIZ(r4, r0)
                    java.lang.String r1 = "entrance"
                    java.lang.String r0 = X.C572310McX.LJI(r3)
                    r2.LJ(r1, r0)
                    X.C572310McX.LIZ(r3, r2)
                    java.util.Map<java.lang.String, java.lang.String> r1 = r2.LIZ
                    java.lang.String r0 = "show_text_retain_dialog"
                    X.C20684815ws.LJIILLIIL(r0, r1)
                    return
                L9c:
                    r4 = 0
                    goto L83
                L9e:
                    r1 = 0
                    goto L61
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C569180MUa.onShow():void");
            }

            /* JADX WARN: Removed duplicated region for block: B:28:0x00f3  */
            /* JADX WARN: Removed duplicated region for block: B:32:0x0107  */
            @Override // X.InterfaceC570030MXh
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ(int r10) {
                /*
                    Method dump skipped, instruction units count: 268
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C569180MUa.LIZ(int):void");
            }
        };
        this.LJIIJJI = r5;
        View view = this.LJFF;
        if (view != null && (sceneContext = abstractC214814194y.getSceneContext()) != null) {
            c570010MXf = new C570010MXf(sceneContext, view, arrayList, r5, 48);
        }
        this.LJIIL = c570010MXf;
    }
}
