package X;

import Y.ARunnableS125S0100000_25;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.lifecycle.Lifecycle;
import com.bef.effectsdk.message.MessageCenter;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.jvm.internal.AwS604S0100000_25;
import kotlin.jvm.internal.AwS630S0100000_16;

/* JADX INFO: renamed from: X.0tE1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1657150tE1 extends AbstractC1664490tPr<C1657020tDo, C1657190tE5> {
    public View LLJJJJ;
    public C425230Glt LLJJJJJIL;
    public View LLJJJJLIIL;
    public C1749280vcc LLJJL;
    public View LLJJLIIIJLLLLLLLZ;
    public C19518211Xw LLJL;
    public TuxTextView LLJLIL;
    public View LLJLILLLLZIIL;
    public ImageView LLJLL;
    public C1657180tE4 LLJZIJLIL;
    public C991760buo LLL;
    public int LLLF;
    public int LLJJJIL = 1;
    public final SafeHandler LLJLLIL = new SafeHandler(this);
    public final int LLJLLL = C366700EZg.LIZ(128.0d);
    public final int LLJZ = C366700EZg.LIZ(70.0d);
    public final AwS630S0100000_16 LLLFF = new AwS630S0100000_16(this, 37);
    public final AwS560S0100000_16 LLLFFI = new AwS560S0100000_16(this, 577);
    public boolean LLLFZ = true;
    public final C1657160tE2 LLLI = new MessageCenter.Listener() { // from class: X.0tE2
        @Override // com.bef.effectsdk.message.MessageCenter.Listener
        public final void onMessageReceived(int i, int i2, int i3, String str) {
            if (i == 20482) {
                this.LL.LLLLIL().LIZ.invoke().cameraComponentModel.duetContext.duetLayoutInfoJson = str;
            }
        }
    };
    public boolean LLLII = true;
    public final ARunnableS125S0100000_25 LLLIIII = new ARunnableS125S0100000_25(this, 19);

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onDestroyView() {
        super.onDestroyView();
        MessageCenter.removeListener(this.LLLI);
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        View view = this.LLJJJJ;
        C425230Glt c425230Glt = null;
        if (view == null) {
            view = null;
        }
        this.LLJJJJJIL = (C425230Glt) view.findViewById(R.id.gbq);
        View view2 = this.LLJJJJ;
        if (view2 == null) {
            view2 = null;
        }
        this.LLJJJJLIIL = view2.findViewById(R.id.gbo);
        View view3 = this.LLJJJJ;
        if (view3 == null) {
            view3 = null;
        }
        this.LLJJL = (C1749280vcc) view3.findViewById(R.id.gbp);
        View view4 = this.LLJJJJ;
        if (view4 == null) {
            view4 = null;
        }
        this.LLJLIL = (TuxTextView) view4.findViewById(R.id.gbs);
        View view5 = this.LLJJJJ;
        if (view5 == null) {
            view5 = null;
        }
        this.LLJLILLLLZIIL = view5.findViewById(R.id.gbr);
        View view6 = this.LLJJJJ;
        if (view6 == null) {
            view6 = null;
        }
        ImageView imageView = (ImageView) view6.findViewById(R.id.gbn);
        this.LLJLL = imageView;
        if (imageView == null) {
            imageView = null;
        }
        imageView.setImageResource(R.drawable.byg);
        TuxTextView tuxTextView = this.LLJLIL;
        if (tuxTextView == null) {
            tuxTextView = null;
        }
        C786410Ut5.LLLLZLL(tuxTextView, 8);
        ImageView imageView2 = this.LLJLL;
        if (imageView2 == null) {
            imageView2 = null;
        }
        C786410Ut5.LJZI(8, imageView2);
        this.LLLF = DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL;
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0tDu
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1657020tDo) obj).LJII;
            }
        }, new AwS604S0100000_25(this, 142));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0tDr
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1657020tDo) obj).LJFF);
            }
        }, Lifecycle.State.STARTED, new AwS595S0100000_16(this, 146));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0tDy
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1657020tDo) obj).LJIIL;
            }
        }, new AwS604S0100000_25(this, 143));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0tDz
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1657020tDo) obj).LJIILIIL;
            }
        }, new AwS595S0100000_16(this, 147));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0tDq
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1657020tDo) obj).LJI;
            }
        }, Lifecycle.State.STARTED, new AwS595S0100000_16(this, 142));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0tE0
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1657020tDo) obj).LIZLLL;
            }
        }, Lifecycle.State.STARTED, new AwS604S0100000_25(this, 128));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0tDg
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C1657020tDo) obj).LIZJ);
            }
        }, Lifecycle.State.STARTED, new AwS595S0100000_16(this, 143));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0tDp
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1657020tDo) obj).LIZ;
            }
        }, Lifecycle.State.STARTED, new AwS604S0100000_25(this, 135));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0tDs
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1657020tDo) obj).LJ;
            }
        }, Lifecycle.State.STARTED, new AwS604S0100000_25(this, 137));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0tDt
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1657020tDo) obj).LJIIIIZZ;
            }
        }, new AwS595S0100000_16(this, 144));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0tDv
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1657020tDo) obj).LJIIIZ;
            }
        }, new AwS595S0100000_16(this, 145));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0tDw
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1657020tDo) obj).LJIIJ;
            }
        }, new AwS604S0100000_25(this, 140));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0tDx
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1657020tDo) obj).LJIIJJI;
            }
        }, new AwS604S0100000_25(this, 141));
        C1657180tE4 c1657180tE4 = new C1657180tE4(LLLLIL().LIZ.invoke(), LLLLIL().LIZIZ.invoke(), LLLLIL());
        this.LLJZIJLIL = c1657180tE4;
        C425230Glt c425230Glt2 = this.LLJJJJJIL;
        if (c425230Glt2 == null) {
            c425230Glt2 = null;
        }
        c425230Glt2.setAdapter(c1657180tE4);
        C425230Glt c425230Glt3 = this.LLJJJJJIL;
        if (c425230Glt3 == null) {
            c425230Glt3 = null;
        }
        c425230Glt3.setClipToPadding(false);
        LLLLIL().LJIIIZ.invoke();
        C425230Glt c425230Glt4 = this.LLJJJJJIL;
        if (c425230Glt4 != null) {
            c425230Glt = c425230Glt4;
        }
        HandlerHook.viewPost(c425230Glt, new ARunnableS125S0100000_25(this, 18));
        MessageCenter.addListener(this.LLLI);
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.LLJJJJ = requireView().findViewById(R.id.gbt);
        this.LLJJLIIIJLLLLLLLZ = requireView().findViewById(R.id.y62);
        this.LLJL = (C19518211Xw) requireView().findViewById(R.id.w6v);
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.us, viewGroup, false);
    }
}
