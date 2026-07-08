package X;

import Y.ARunnableS106S0100000_6;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.scene.group.UserVisibleHintGroupScene;
import com.ss.android.ugc.aweme.ecommerce.base.selector.model.TikTokMediaModel;
import com.ss.android.ugc.aweme.ecommerce.base.selector.viewholder.ECAlbumVH;
import com.ss.android.ugc.aweme.ecommerce.base.selector.viewmodel.ChooseMediaViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.AwS117S0110000_31;
import kotlin.jvm.internal.AwS610S0100000_31;

/* JADX INFO: renamed from: X.15pa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20639615pa extends UserVisibleHintGroupScene {
    public ViewOnAttachStateChangeListenerC20604515jv LLJJIJIIJIL;
    public ViewGroup LLJJIJIL;
    public C20639715pb LLJJJ;
    public boolean LLJJJJ;
    public String LLJJJJLIIL;
    public String LLJJJIL = "All";
    public final HashMap<String, C2402509bD> LLJJJJJIL = new HashMap<>();

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    public final void LLLLIILL(C2402509bD c2402509bD, boolean z) {
        TextView textView;
        C20639715pb c20639715pb = this.LLJJJ;
        if (c20639715pb != null) {
            if (c2402509bD != null) {
                C20734616Bs c20734616Bs = c20639715pb.LIZ;
                ChooseMediaViewModel chooseMediaViewModel = c20734616Bs.LLJLIL;
                if (chooseMediaViewModel != null) {
                    ArrayList arrayList = new ArrayList(c2402509bD.LLILLJJLI);
                    chooseMediaViewModel.setState(new AwS117S0110000_31(arrayList, 7));
                    chooseMediaViewModel.LLILZIL.clear();
                    chooseMediaViewModel.LLILZIL.addAll(arrayList);
                    chooseMediaViewModel.setState(new AwS610S0100000_31((ArrayList) chooseMediaViewModel.LLILZIL, (ArrayList<TikTokMediaModel>) 419));
                }
                if (!TextUtils.isEmpty(c2402509bD.LL) && (textView = c20734616Bs.LLJJIJI) != null) {
                    textView.setText(c2402509bD.LL);
                }
            }
            if (z) {
                c20639715pb.LIZ.animAlbumTabImg(false);
            }
        }
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv;
        Context context;
        String string;
        ViewGroup viewGroup2;
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.b0b, viewGroup, false);
        if ((viewTd instanceof ViewGroup) && (viewGroup2 = (ViewGroup) viewTd) != null) {
            viewGroup = viewGroup2;
        }
        this.LLJJIJIL = viewGroup;
        Activity activity = this.mActivity;
        if (activity != null && activity.getBaseContext() != null) {
            ViewGroup viewGroup3 = this.LLJJIJIL;
            if (viewGroup3 != null) {
                viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) viewGroup3.findViewById(R.id.kbj);
            } else {
                viewOnAttachStateChangeListenerC20604515jv = null;
            }
            this.LLJJIJIIJIL = viewOnAttachStateChangeListenerC20604515jv;
            if (viewOnAttachStateChangeListenerC20604515jv != null) {
                viewOnAttachStateChangeListenerC20604515jv.setLayoutManager(new LinearLayoutManager(this.mActivity));
            }
            ViewGroup viewGroup4 = this.LLJJIJIL;
            if (viewGroup4 != null) {
                HandlerHook.viewPost(viewGroup4, new ARunnableS106S0100000_6(this, 143));
            }
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.LLJJIJIIJIL;
            if (viewOnAttachStateChangeListenerC20604515jv2 != null && (context = viewOnAttachStateChangeListenerC20604515jv2.getContext()) != null) {
                Resources resources = context.getResources();
                if (resources == null || (string = resources.getString(2131826395)) == null) {
                    string = "All";
                }
                this.LLJJJIL = string;
            }
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv3 = this.LLJJIJIIJIL;
            if (viewOnAttachStateChangeListenerC20604515jv3 != null) {
                viewOnAttachStateChangeListenerC20604515jv3.LJIILJJIL(ECAlbumVH.class);
                viewOnAttachStateChangeListenerC20604515jv3.setItemAnimator(null);
                viewOnAttachStateChangeListenerC20604515jv3.getState().LIZLLL = C0Q4Y.BUFFER;
            }
        }
        Context sceneContext = getSceneContext();
        if (sceneContext != null) {
            C948503nH.LJ(this, C0PEM.LIZJ, new C2401509b3(this, sceneContext, null));
        }
        ViewGroup viewGroup5 = this.LLJJIJIL;
        if (viewGroup5 != null) {
            viewGroup5.setOutlineProvider(new C20748016Gw(0));
        }
        ViewGroup viewGroup6 = this.LLJJIJIL;
        if (viewGroup6 != null) {
            viewGroup6.setElevation(C0H9H.LIZ(17));
        }
        return viewGroup;
    }
}
