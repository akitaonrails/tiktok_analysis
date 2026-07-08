package X;

import android.content.Context;
import android.os.Bundle;
import android.widget.ImageView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0o2C, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1457620o2C extends AbstractC1462960oAo {
    public static final int LLJJIJI = 8;
    public final C1DRG LLJJ;
    public final C19A3 LLJJI;
    public final int LLJJIII;

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        C19A3 parentScene = getParentScene();
        int i = this.LLJJIII;
        final C1DRG diContainer = getDiContainer();
        parentScene.add(i, new C1457580o28(diContainer) { // from class: X.0o29
            @Override // com.bytedance.scene.Scene
            public final void onActivityCreated(Bundle bundle) {
                Context sceneContext;
                super.onActivityCreated(bundle);
                if (LLLILZ().mDraftToEditFrom != 7 && LLLILZ().mDraftToEditFrom != 8) {
                    if (!C571290Mat.LIZJ(LLLILZ()) && !C571290Mat.LIZLLL(LLLILZ()) && !LLLILZ().isDirectToPublishByNewExp() && LLLILZ().mIsFromDraft && LLLILZ().getOrigin() == 0) {
                        LLLII().setImageResource(R.drawable.c2e);
                    } else {
                        LLLII().setImageResource(R.drawable.bx6);
                    }
                } else {
                    LLLII().setImageResource(R.drawable.bx9);
                }
                if (C301590Brx.LIZ()) {
                    LLLII().setImageResource(R.drawable.bx6);
                }
                if ((LLLIIIIL() instanceof InterfaceC572860MdQ) && (sceneContext = getSceneContext()) != null) {
                    ImageView imageViewLLLII = LLLII();
                    C419910GdJ c419910GdJ = new C419910GdJ();
                    c419910GdJ.LIZ = R.raw.icon_chevron_left_offset_ltr;
                    imageViewLLLII.setImageDrawable(c419910GdJ.LIZ(sceneContext));
                }
            }
        }, "SideToolbarScene");
    }

    @Override // X.AbstractC1462960oAo, X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJJ;
    }

    @Override // X.AbstractC1462960oAo
    public C19A3 getParentScene() {
        return this.LLJJI;
    }

    public C1457620o2C(C1DRG c1drg, C19A3 c19a3, int i) {
        super(c1drg, c19a3);
        this.LLJJ = c1drg;
        this.LLJJI = c19a3;
        this.LLJJIII = i;
    }
}
