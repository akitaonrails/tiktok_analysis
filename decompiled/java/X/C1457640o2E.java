package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModelKt;

/* JADX INFO: renamed from: X.0o2E, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1457640o2E extends AbstractC1462960oAo {
    public static final int LLJJIJIIJIL = 8;
    public final C1DRG LLJJ;
    public final C19A3 LLJJI;
    public final int LLJJIII;
    public final int LLJJIJI;

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        C19A3 parentScene = getParentScene();
        if (C1416310mxZ.LJJJJZI((VideoPublishEditModel) getDiContainer().LJII(VideoPublishEditModel.class, null))) {
            C1658150tFd.LIZ(parentScene, this.LLJJIII, new C1457580o28(getDiContainer()), "SideToolbarScene");
            C1658150tFd.LIZ(parentScene, this.LLJJIJI, new C1459630o5R(getDiContainer()), "EditBottomBarScene");
        } else if (TextUtils.equals(((VideoPublishEditModelKt) getDiContainer().LJII(VideoPublishEditModel.class, null)).getEnterFrom(), "effect_qr_scan")) {
            parentScene.add(this.LLJJIII, new C1168780gWK(getDiContainer()), "TTEPEditTitleBarScene");
            parentScene.add(this.LLJJIJI, new C1457720o2M(getDiContainer()), "TTEPEditBottomBarScene");
        } else {
            parentScene.add(this.LLJJIII, new C1457580o28(getDiContainer()), "SideToolbarScene");
            parentScene.add(this.LLJJIJI, new C1459630o5R(getDiContainer()), "EditBottomBarScene");
        }
    }

    @Override // X.AbstractC1462960oAo, X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJJ;
    }

    @Override // X.AbstractC1462960oAo
    public C19A3 getParentScene() {
        return this.LLJJI;
    }

    public C1457640o2E(C1DRG c1drg, C19A3 c19a3, int i, int i2) {
        super(c1drg, c19a3);
        this.LLJJ = c1drg;
        this.LLJJI = c19a3;
        this.LLJJIII = i;
        this.LLJJIJI = i2;
    }
}
