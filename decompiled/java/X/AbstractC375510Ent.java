package X;

import X.C360050E9r;
import Y.ARunnableS74S0200000_5;
import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.scene.Scene;
import com.bytedance.scene.navigation.NavigationScene;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0Ent, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC375510Ent<I extends C360050E9r, O> extends C19A3 {
    public I LLJILLL;
    public C214799194j LLJJ;
    public Scene LLJJI;
    public NavigationScene LLJJIII;
    public C19A3 LLJJIJI;

    public abstract Function1<C539960LFq, Unit> LLLLIIIILLL();

    public abstract Function1<C1DRF, Unit> LLLLIILL();

    public Integer LLLLIL() {
        return null;
    }

    public abstract void LLLLJI(C18YA c18ya, Activity activity);

    public AbstractC375510Ent() {
        disableSceneRestore();
    }

    public final String LLLLJ() {
        return getClass().getSimpleName();
    }

    public I LLLLILI(I i) {
        this.LLJILLL = i;
        i.LIZIZ();
        return i;
    }

    @Override // com.bytedance.scene.Scene
    public void onActivityCreated(Bundle bundle) {
        NavigationScene navigationScene;
        C19A3 c19a3;
        NavigationScene navigationSceneLIZ;
        super.onActivityCreated(bundle);
        if (C20622515mp.LJ(this) == null && (c19a3 = this.LLJJIJI) != null && (navigationSceneLIZ = C1447800nmM.LIZ(c19a3)) != null) {
            navigationSceneLIZ.LLLIILIL(this, new C0FXH(this, 11));
        }
        if (C0E47.LIZ()) {
            C1654320t9S.LIZIZ(this, AFwS234S0000000_5.get$arr$(420));
            C1664590tQ1.LIZ(this, LLLLJ(), true, new AwS584S0100000_5(this, (AbstractC375510Ent<C360050E9r, Object>) 881));
            C1664600tQ2.LIZ(this, LLLLJ(), new AwS584S0100000_5(this, (AbstractC375510Ent<C360050E9r, Object>) 882));
        } else {
            C01TT.LIZJ(new AwS549S0100000_5(this, 1045));
            Scene scene = this.LLJJI;
            if (!(scene instanceof NavigationScene) || (navigationScene = (NavigationScene) scene) == null) {
                return;
            }
            navigationScene.LLLLLL();
        }
    }

    @Override // com.bytedance.scene.Scene
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ViewTreeObserverOnPreDrawListenerC337150DJp.LIZ(view, new ARunnableS74S0200000_5(view, this, 43));
    }

    @Override // X.C19A3, com.bytedance.scene.Scene
    public /* bridge */ /* synthetic */ View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return onCreateView(layoutInflater, viewGroup, bundle);
    }
}
