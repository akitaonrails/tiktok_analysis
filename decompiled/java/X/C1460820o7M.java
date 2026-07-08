package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.image.adjust.ImageAdjustViewModel;
import com.ss.android.ugc.aweme.image.ui.ImageEditRootScene;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AwS566S0100000_22;

/* JADX INFO: renamed from: X.0o7M, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1460820o7M extends AbstractC1643610ssB<ImageAdjustViewModel> {
    public final C19A3 LLIZ;
    public final C1DRG LLJ;
    public final int LLIZLLLIL = R.id.m87;
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS566S0100000_22(this, 862));

    public final C1453280nvC G2() {
        return (C1453280nvC) this.LLJI.getValue();
    }

    @Override // X.AbstractC1643600ssA
    public final Function0<ImageAdjustViewModel> W1() {
        return AFwS210S0000000_22.get$arr$(344);
    }

    @Override // X.AbstractC1643600ssA
    public final void o2() {
        C1460830o7N.LIZ.getClass();
        if (!C1460830o7N.LIZJ()) {
            w2(true);
        }
        G2().LLLLII(true);
    }

    @Override // X.AbstractC1643600ssA
    public final void Z1() {
        G2().LLLLII(false);
    }

    @Override // X.AbstractC1643600ssA, X.AbstractC2255721DQs
    public final void onCreate() {
        super.onCreate();
        this.LLIZ.add(this.LLIZLLLIL, G2(), "ImageAdjustScene");
        this.LLIZ.hide(G2());
        w2(false);
    }

    @Override // X.AbstractC1643600ssA
    public final C19A3 getParentScene() {
        return this.LLIZ;
    }

    public final void w2(boolean z) {
        String str;
        C1460830o7N.LIZ.getClass();
        if (C1460830o7N.LIZJ()) {
            Iterator<? extends Effect> it2 = C1460830o7N.LIZIZ.iterator();
            while (it2.hasNext()) {
                List<String> tags = it2.next().getTags();
                if (tags != null && (str = (String) C13LP.LJJJLZIJ(0, tags)) != null) {
                    G2().LLLLIILL(str);
                }
            }
        }
        this.LLIZ.requireSceneContext();
        try {
            if (C036E.LIZ.LIZIZ()) {
                C1460830o7N c1460830o7N = C1460830o7N.LIZ;
                InterfaceC1460950o7Z interfaceC1460950o7Z = new InterfaceC1460950o7Z() { // from class: X.0o7R
                    @Override // X.InterfaceC1460950o7Z
                    public final void onSuccess(String str2) {
                        this.LIZ.G2().LLLLIILL(str2);
                    }
                };
                c1460830o7N.getClass();
                C1633850scR.LIZ(C0CHQ.LIZ, null).LJI("photo_editing_effects", false, new C1466760oGw(interfaceC1460950o7Z, 0));
                return;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (z) {
            C1389890mGx c1389890mGx = new C1389890mGx(this.LLIZ.requireActivity());
            c1389890mGx.LJIIIZ(2131857904);
            c1389890mGx.LJIIJJI();
        }
    }

    public C1460820o7M(ImageEditRootScene imageEditRootScene, C1DRG c1drg) {
        this.LLIZ = imageEditRootScene;
        this.LLJ = c1drg;
    }
}
