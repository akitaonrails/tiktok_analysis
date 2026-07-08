package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.SAFFragmentRootScene;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AwS118S0110000_32;
import kotlin.jvm.internal.AwS398S0200000_32;
import kotlin.jvm.internal.AwS576S0100000_32;

/* JADX INFO: renamed from: X.198h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C214901198h extends C214932199m implements InterfaceC20630715o9 {
    public final C01GW LLJJ = C452501pT.LIZIZ(new AwS576S0100000_32(this, 600));
    public SAFFragmentRootScene LLJJI;
    public boolean LLJJIII;

    public final void LLLILZ() {
        SAFFragmentRootScene sAFFragmentRootScene = this.LLJJI;
        if (sAFFragmentRootScene == null) {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        LLLII(sAFFragmentRootScene);
        InterfaceC214902198i interfaceC214902198iF0 = F0();
        if (interfaceC214902198iF0 != null) {
            interfaceC214902198iF0.uB();
        } else {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    @Override // X.C198H
    /* JADX INFO: renamed from: LLLILZLLLI, reason: merged with bridge method [inline-methods] */
    public final SAFFragmentRootScene getScene() {
        return (SAFFragmentRootScene) this.LLJJ.getValue();
    }

    public final boolean LLLIZZ() {
        return (this.LLJI == null && this.LLJJI == null) ? false : true;
    }

    @Override // X.InterfaceC20630715o9
    public final InterfaceC214902198i F0() {
        if (LLLIZZ()) {
            return getScene().LLJJ;
        }
        return null;
    }

    @Override // X.InterfaceC20630815oA
    public final boolean LJJJ() {
        return LLLIZZ() ? getScene().LJJJ() : this.LLJJIII;
    }

    @Override // X.InterfaceC214942199w
    public final boolean W1() {
        if (LLLIZZ()) {
            return getScene().W1();
        }
        return false;
    }

    @Override // X.C198H
    public final C19BM buildPopOptions() {
        return getScene().buildPopOptions();
    }

    @Override // X.InterfaceC20630715o9
    public final FragmentManager getFragmentManager() {
        return getScene().getFragmentManager();
    }

    @Override // X.C198H
    public final boolean onBackPressed() {
        return getScene().onBackPressed();
    }

    @Override // X.InterfaceC214942199w
    public final void onRelease() {
        getScene().onRelease();
    }

    @Override // X.C198H
    public final void finish() {
        C20630415o6.LIZ(this);
    }

    @Override // X.C214932199m
    public final void LLLII(SAFFragmentRootScene sAFFragmentRootScene) {
        SAFFragmentRootScene sAFFragmentRootScene2 = this.LLJJI;
        if (sAFFragmentRootScene2 != null) {
            if (sAFFragmentRootScene == sAFFragmentRootScene2) {
                Bundle bundle = this.mArguments;
                if (bundle != null) {
                    Bundle bundle2 = bundle.getBundle("child_scene_class_arguments");
                    if (bundle2 != null) {
                        sAFFragmentRootScene.mArguments = bundle2;
                        Object objF0 = F0();
                        if (objF0 != null) {
                            ((Fragment) objF0).setArguments(bundle2);
                        } else {
                            "Required value was null.".toString();
                            throw new IllegalArgumentException("Required value was null.");
                        }
                    }
                    super.LLLII(sAFFragmentRootScene);
                    return;
                }
                throw new IllegalStateException("no argument crash");
            }
            "the scene need attached should equal to preloadScene".toString();
            throw new IllegalArgumentException("the scene need attached should equal to preloadScene");
        }
        "need set preload scene first".toString();
        throw new IllegalArgumentException("need set preload scene first");
    }

    @Override // X.AnonymousClass1995
    public final void LLLLIILLL(Bundle bundle) {
        getScene().LLLLIILLL(bundle);
    }

    @Override // X.InterfaceC20630715o9
    public final void Rj(AbstractC813200VvC abstractC813200VvC) {
        getScene().Rj(abstractC813200VvC);
    }

    @Override // X.InterfaceC214942199w
    public final void U1(Bundle bundle) {
        View view;
        ViewGroup viewGroup = (ViewGroup) requireView();
        SAFFragmentRootScene sAFFragmentRootScene = this.LLJI;
        if (sAFFragmentRootScene != null) {
            view = sAFFragmentRootScene.mView;
        } else {
            view = null;
        }
        viewGroup.addView(view);
        getScene().U1(bundle);
    }

    @Override // X.AnonymousClass1995
    public final void onConfigurationChanged(Configuration configuration) {
        SAFFragmentRootScene scene = getScene();
        scene.getClass();
        String str = "onConfigurationChanged Start (" + scene + ')';
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogE("SAFFragmentRootScene", str);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SAFFragmentRootScene");
        sbLIZ.append(": ");
        sbLIZ.append(str);
        System.out.println((Object) C2188811AlT.LIZIZ(sbLIZ));
        scene.LLLIILIL().LIZJ();
        scene.LLLIILIL().LIZ.LLILZ.LJIJI(true, configuration);
    }

    @Override // X.AnonymousClass1995
    public final void onWindowFocusChanged(boolean z) {
        getScene().onWindowFocusChanged(z);
    }

    @Override // X.InterfaceC20630715o9
    public final void ze(Bundle bundle) {
        getScene().mArguments = bundle;
    }

    @Override // X.InterfaceC20630715o9
    public final void d5(AbstractC813200VvC abstractC813200VvC, boolean z) {
        if (LLLIIIIL()) {
            if (LLLIZZ()) {
                getScene().d5(abstractC813200VvC, z);
                return;
            } else {
                ((CopyOnWriteArrayList) this.LLJILJILJ).add(new AwS118S0110000_32(abstractC813200VvC, z, 12));
                return;
            }
        }
        getScene().d5(abstractC813200VvC, z);
    }

    @Override // X.C214932199m, com.bytedance.scene.Scene
    public final void dispatchCreateView(Bundle bundle, ViewGroup viewGroup) {
        super.dispatchCreateView(bundle, viewGroup);
        if (LLLIIIIL() && bundle != null) {
            return;
        }
        LLLILZ();
        if (LLLIZZ()) {
            this.LLJJIII = getScene().LJJJ();
        }
    }

    @Override // X.C198H
    public final Boolean onActivityKeyDown(int i, KeyEvent keyEvent) {
        return getScene().onActivityKeyDown(i, keyEvent);
    }

    @Override // X.C198H
    public final Boolean onActivityKeyLongPress(int i, KeyEvent keyEvent) {
        return getScene().onActivityKeyLongPress(i, keyEvent);
    }

    @Override // X.C198H
    public final Boolean onActivityKeyUp(int i, KeyEvent keyEvent) {
        return getScene().onActivityKeyUp(i, keyEvent);
    }

    @Override // X.InterfaceC20630715o9
    public final void oo(C2214291BlT c2214291BlT, Bundle bundle) {
        if (LLLIIIIL()) {
            if (LLLIZZ()) {
                InterfaceC214902198i interfaceC214902198i = getScene().LLJJ;
                if (interfaceC214902198i != null) {
                    interfaceC214902198i.uG(c2214291BlT);
                    return;
                }
                return;
            }
            ((CopyOnWriteArrayList) this.LLJILJILJ).add(new AwS398S0200000_32(c2214291BlT, bundle, 81));
            return;
        }
        InterfaceC214902198i interfaceC214902198i2 = getScene().LLJJ;
        if (interfaceC214902198i2 != null) {
            interfaceC214902198i2.uG(c2214291BlT);
        } else {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    @Override // X.C198H
    public final void setResult(int i, Intent intent) {
        C20630415o6.LIZIZ(this, i, intent);
    }

    @Override // X.C198H
    public final boolean onResult(int i, int i2, Intent intent) {
        return getScene().onResult(i, i2, intent);
    }
}
