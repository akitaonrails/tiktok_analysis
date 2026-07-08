package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.AwS611S0100000_32;

/* JADX INFO: renamed from: X.1942, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class AnonymousClass1942 extends C193N<C05YF, C190Z, C19224710Iz> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJ;
    public static final int LLJJI;
    public final InterfaceC1731706qJ LLIZ;
    public final InterfaceC1731706qJ LLIZLLLIL;
    public final InterfaceC1731706qJ LLJ;
    public final C01GW LLJI;
    public final Function0<C190Z> LLJIJIL;
    public final C19224710Iz LLJILJIL;
    public final InterfaceC1738600vLO LLJILJILJ;
    public final C10J3 LLJILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AnonymousClass1942.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(AnonymousClass1942.class, "permissionOptionApiComponent", "getPermissionOptionApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/permission/PermissionOptionApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(AnonymousClass1942.class, "moreOptionApiComponent", "getMoreOptionApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/option/more/MoreOptionApiComponent;", 0);
        c09r3.getClass();
        LLJJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
        LLJJI = 8;
    }

    private final InterfaceC855150Xgf T4() {
        return (InterfaceC855150Xgf) this.LLIZLLLIL.getValue(this, LLJJ[1]);
    }

    public final VideoPublishEditModel O4() {
        return (VideoPublishEditModel) this.LLIZ.getValue(this, LLJJ[0]);
    }

    public final InterfaceC855180Xgi P4() {
        return (InterfaceC855180Xgi) this.LLJ.getValue(this, LLJJ[2]);
    }

    public final boolean Z4() {
        return ((Boolean) this.LLJI.getValue()).booleanValue();
    }

    @Override // X.C193O
    public void O3() {
        super.O3();
        O4().creativeModel.ugcTemplateData.enablePublishAsTemplate = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00b3  */
    @Override // X.C193N, X.C193O
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Q3() {
        /*
            r6 = this;
            java.lang.Object r0 = r6.T2()
            X.190Z r0 = (X.C190Z) r0
            boolean r3 = r0.LIZIZ
            boolean r0 = r6.Z4()
            r5 = 1
            if (r0 == 0) goto L46
            X.0Xgf r0 = r6.T4()
            com.bytedance.als.ui.state.LiveState r2 = r0.JN2()
            Y.AObjectS249S0100000_32 r1 = new Y.AObjectS249S0100000_32
            r0 = 12
            r1.<init>(r6, r0)
            r2.LIZ(r6, r1)
            if (r3 == 0) goto L44
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r6.O4()
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r0.creativeModel
            com.ss.android.ugc.aweme.creative.model.PhotoModeTemplateData r0 = r0.photoModeTemplateData
            boolean r0 = r0.postAsTemplateCheckedByUser
            if (r0 == 0) goto L44
        L2f:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r6.O4()
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r0.creativeModel
            com.ss.android.ugc.aweme.creative.model.PhotoModeTemplateData r0 = r0.photoModeTemplateData
            r0.enablePublishAsTemplate = r5
            kotlin.jvm.internal.AwS44S0010000_32 r1 = new kotlin.jvm.internal.AwS44S0010000_32
            r0 = 14
            r1.<init>(r5, r0)
            r6.i3(r1)
            return
        L44:
            r5 = 0
            goto L2f
        L46:
            boolean r0 = X.C288140BRc.LIZ()
            if (r0 == 0) goto Laa
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r6.O4()
            boolean r0 = r0.mIsFromDraft
            if (r0 == 0) goto L77
            if (r3 == 0) goto Lb3
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r6.O4()
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r0.creativeModel
            com.ss.android.ugc.aweme.creative.model.UgcTemplateData r0 = r0.ugcTemplateData
            boolean r0 = r0.enablePublishAsTemplate
            if (r0 == 0) goto Lb3
        L62:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r6.O4()
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r0.creativeModel
            com.ss.android.ugc.aweme.creative.model.UgcTemplateData r0 = r0.ugcTemplateData
            r0.enablePublishAsTemplate = r5
            kotlin.jvm.internal.AwS44S0010000_32 r1 = new kotlin.jvm.internal.AwS44S0010000_32
            r0 = 15
            r1.<init>(r5, r0)
            r6.i3(r1)
            return
        L77:
            if (r3 == 0) goto Lb3
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r6.O4()
            java.lang.String r4 = r0.getCreationId()
            java.lang.String r3 = "TOOLS_PUBLISH_REPO_NAME"
            com.bytedance.keva.Keva r1 = com.bytedance.keva.Keva.getRepo(r3)
            java.lang.String r2 = "post_as_ugc_template_checked"
            java.lang.String r0 = ""
            java.lang.String r1 = r1.getString(r2, r0)
            int r0 = r1.length()
            if (r0 == 0) goto La2
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r4)
            if (r0 == 0) goto La2
            boolean r0 = X.C1441320nbu.LIZIZ()
            if (r0 == 0) goto Lb3
            goto L62
        La2:
            com.bytedance.keva.Keva r0 = com.bytedance.keva.Keva.getRepo(r3)
            r0.storeString(r2, r4)
            goto L62
        Laa:
            if (r3 == 0) goto Lb3
            boolean r0 = X.C1441320nbu.LIZIZ()
            if (r0 == 0) goto Lb3
            goto L62
        Lb3:
            r5 = 0
            goto L62
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1942.Q3():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    @Override // X.C193O
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean z4() {
        /*
            r6 = this;
            boolean r0 = r6.Z4()
            r3 = 0
            r5 = 1
            if (r0 == 0) goto L51
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r4 = r6.O4()
            boolean r0 = X.C376930EqB.LIZ()
            if (r0 == 0) goto L50
            X.0C64 r2 = X.C0C64.LJIILLIIL()
            r1 = 31744(0x7c00, float:4.4483E-41)
            java.lang.String r0 = "enable_ugc_photo_template_upload"
            boolean r0 = r2.LJIIIZ(r1, r0, r5, r3)
            if (r0 == 0) goto L50
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r4.creativeModel
            com.ss.android.ugc.aweme.creative.model.PhotoModeTemplateData r0 = r0.photoModeTemplateData
            boolean r0 = r0.isTemplateFromAnchor
            if (r0 == 0) goto L39
            boolean r0 = X.C1451040nra.LIZLLL(r4)
            if (r0 == 0) goto L39
            X.0nra r0 = X.C1451040nra.LIZ
            r0.getClass()
            boolean r0 = X.C1451040nra.LIZ(r4)
            if (r0 != 0) goto L4f
        L39:
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r4.creativeModel
            com.ss.android.ugc.aweme.creative.model.PhotoModeTemplateData r0 = r0.photoModeTemplateData
            boolean r0 = r0.isTemplateFromAnchor
            if (r0 == 0) goto L47
            boolean r0 = X.C1451040nra.LIZLLL(r4)
            if (r0 == 0) goto L4f
        L47:
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r4.creativeModel
            com.ss.android.ugc.aweme.creative.model.PhotoModeTemplateData r0 = r0.photoModeTemplateData
            boolean r0 = r0.isTemplateFromAnchor
            if (r0 != 0) goto L50
        L4f:
            r3 = 1
        L50:
            return r3
        L51:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r2 = r6.O4()
            boolean r0 = X.C856200XiM.LIZ()
            if (r0 == 0) goto L7d
            com.ss.android.ugc.aweme.creative.model.CreativeModel r1 = r2.creativeModel
            com.ss.android.ugc.aweme.creative.model.ChangeAvatarModel r0 = r1.changeAvatarModel
            boolean r0 = r0.isFromChangeAvatar
            if (r0 != 0) goto L7d
            com.ss.android.ugc.aweme.creative.model.UgcTemplateData r1 = r1.ugcTemplateData
            boolean r0 = r1.isPUgcTemplateFromAnchor
            if (r0 != 0) goto L7d
            boolean r0 = r1.isUgcTemplateFromAnchor
            if (r0 != 0) goto L7d
            boolean r0 = X.C1428470nHB.LLIIIZ(r2)
            if (r0 != 0) goto L7d
            java.lang.String r1 = r2.mShootWay
            java.lang.String r0 = "autocut_anchor"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L50
        L7d:
            boolean r0 = X.C859340XnQ.LIZ(r2)
            if (r0 != 0) goto L50
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r6.O4()
            boolean r0 = X.C376910Eq9.LIZLLL(r0)
            if (r0 == 0) goto L50
            goto L4f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1942.z4():boolean");
    }

    @Override // X.C193N, X.C193O
    public /* bridge */ /* synthetic */ Object B3() {
        return this.LLJILJIL;
    }

    @Override // X.C193N, X.C193O
    public InterfaceC1738600vLO E3() {
        return this.LLJILJILJ;
    }

    @Override // X.C193N
    public C10J3 H4() {
        return this.LLJILLL;
    }

    public C19224710Iz K4() {
        return this.LLJILJIL;
    }

    @Override // X.C193N, X.C193O, X.AbstractC1664470tPp
    public Function0<C190Z> o2() {
        return this.LLJIJIL;
    }

    public AnonymousClass1942(C1DRG c1drg) {
        super(c1drg);
        this.LLIZ = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
        this.LLIZLLLIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC855150Xgf.class, null);
        this.LLJ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC855180Xgi.class, null);
        this.LLJI = C452501pT.LIZIZ(new AwS576S0100000_32(this, 315));
        this.LLJIJIL = new AwS576S0100000_32(this, 314);
        this.LLJILJIL = new C19224710Iz(null, null, new C19LY(this, 6), new AwS611S0100000_32(this, 166), 3);
        this.LLJILJILJ = EnumC214771193h.POST_AS_TEMPLATE;
        this.LLJILLL = AnonymousClass1937.LIZ;
    }
}
