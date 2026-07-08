package X;

import android.content.Context;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: renamed from: X.11z3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19679111z3 extends AbstractC1664490tPr<C19678511yx, C19679011z2> {
    public View LLJJJIL;
    public TuxIconView LLJJJJ;
    public TuxIconView LLJJJJJIL;
    public View LLJJJJLIIL;
    public View LLJJL;
    public TuxIconView LLJJLIIIJLLLLLLLZ;
    public TuxIconView LLJL;
    public TuxIconView LLJLIL;
    public C0FNY LLJLILLLLZIIL;
    public View LLJLL;
    public C388810FMh LLJLLIL;
    public View LLJLLL;
    public Map<EnumC19678411yw, TuxIconView> LLJZ = new LinkedHashMap();

    public final void exit() {
        TuxIconView tuxIconView = this.LLJJJJ;
        if (tuxIconView != null) {
            C1206770hVb.LIZ(tuxIconView);
        }
        TuxIconView tuxIconView2 = this.LLJJJJJIL;
        if (tuxIconView2 != null) {
            C1206770hVb.LIZ(tuxIconView2);
        }
        View view = this.LLJJJIL;
        if (view != null) {
            C12C5.LJ(view, 0L, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(178)), C1619980sG4.LJIILIIL(), AFwS218S0000000_29.get$arr$(45), 9);
        }
    }

    public final boolean LLLLLJIL(EnumC19678411yw enumC19678411yw) {
        C0FNY c0fny;
        if (enumC19678411yw == EnumC19678411yw.ERASER) {
            C0FNY c0fny2 = this.LLJLILLLLZIIL;
            if (c0fny2 != null) {
                c0fny2.setEnabled(false);
            }
            C0FNY c0fny3 = this.LLJLILLLLZIIL;
            if (c0fny3 != null) {
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0fny3);
                c0fny3.setAlpha(0.4f);
            }
        } else if (enumC19678411yw != EnumC19678411yw.CHANGE_COLOR) {
            C0FNY c0fny4 = this.LLJLILLLLZIIL;
            if (c0fny4 != null) {
                c0fny4.setEnabled(true);
            }
            C0FNY c0fny5 = this.LLJLILLLLZIIL;
            if (c0fny5 != null) {
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0fny5);
                c0fny5.setAlpha(1.0f);
            }
        }
        if (enumC19678411yw == EnumC19678411yw.CHANGE_COLOR && (c0fny = this.LLJLILLLLZIIL) != null && !c0fny.isEnabled()) {
            return false;
        }
        for (Map.Entry entry : ((LinkedHashMap) this.LLJZ).entrySet()) {
            Object key = entry.getKey();
            TuxIconView tuxIconView = (TuxIconView) entry.getValue();
            if (key == enumC19678411yw) {
                Context sceneContext = getSceneContext();
                if (sceneContext != null) {
                    if (tuxIconView != null) {
                        tuxIconView.setBackground(C800330VaR.LIZIZ(sceneContext, R.drawable.aff));
                        tuxIconView.setTintColorRes(R.attr.zi);
                    }
                } else if (tuxIconView != null) {
                    tuxIconView.setTintColorRes(R.attr.zi);
                }
            } else if (tuxIconView != null) {
                tuxIconView.setBackground(null);
                tuxIconView.setTintColorRes(R.attr.zk);
            }
        }
        return true;
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        int iIntValue;
        super.onViewCreated(view, bundle);
        this.LLJJJIL = this.mView.findViewById(R.id.cfl);
        this.LLJJJJ = (TuxIconView) this.mView.findViewById(R.id.t1i);
        this.LLJJJJJIL = (TuxIconView) this.mView.findViewById(R.id.undo);
        this.LLJJJJLIIL = this.mView.findViewById(R.id.jz6);
        this.LLJJL = this.mView.findViewById(R.id.k3n);
        this.LLJJLIIIJLLLLLLLZ = (TuxIconView) this.mView.findViewById(R.id.lgb);
        this.LLJL = (TuxIconView) this.mView.findViewById(R.id.lql);
        this.LLJLIL = (TuxIconView) this.mView.findViewById(R.id.lo4);
        this.LLJLILLLLZIIL = (C0FNY) this.mView.findViewById(R.id.e8h);
        this.LLJLL = this.mView.findViewById(R.id.e8c);
        this.LLJLLIL = (C388810FMh) this.mView.findViewById(R.id.e8b);
        this.LLJLLL = this.mView.findViewById(R.id.ey8);
        this.LLJZ = C2097608Jq.LJIIJ(new Pair(EnumC19678411yw.ERASER, this.LLJJLIIIJLLLLLLLZ), new Pair(EnumC19678411yw.NORMAL_BRUSH, this.LLJL), new Pair(EnumC19678411yw.HIGHLIGHT_BRUSH, this.LLJLIL));
        Context sceneContext = getSceneContext();
        if (sceneContext != null) {
            TuxIconView tuxIconView = this.LLJL;
            if (tuxIconView != null) {
                tuxIconView.setBackground(C800330VaR.LIZIZ(sceneContext, R.drawable.aff));
            }
            C0FNY c0fny = this.LLJLILLLLZIIL;
            if (c0fny != null) {
                Integer numLIZ = C1308910kAL.LIZ(R.attr.a1q, sceneContext);
                if (numLIZ != null) {
                    iIntValue = numLIZ.intValue();
                } else {
                    iIntValue = -1;
                }
                c0fny.LLILZIL = iIntValue;
                Paint paint = c0fny.LL;
                if (paint != null) {
                    paint.setColor(iIntValue);
                }
                c0fny.invalidate();
            }
            LLLLLJIL(EnumC19678411yw.NORMAL_BRUSH);
        }
        C0FNY c0fny2 = this.LLJLILLLLZIIL;
        if (c0fny2 != null) {
            C786410Ut5.I7(new C12Y5(this, 6), c0fny2);
        }
        TuxIconView tuxIconView2 = this.LLJLIL;
        if (tuxIconView2 != null) {
            C786410Ut5.I7(new C12Y5(this, 7), tuxIconView2);
        }
        TuxIconView tuxIconView3 = this.LLJJLIIIJLLLLLLLZ;
        if (tuxIconView3 != null) {
            C786410Ut5.I7(new C12Y5(this, 0), tuxIconView3);
        }
        TuxIconView tuxIconView4 = this.LLJL;
        if (tuxIconView4 != null) {
            C786410Ut5.I7(new C12Y5(this, 1), tuxIconView4);
        }
        View view2 = this.LLJJJJLIIL;
        if (view2 != null) {
            C786410Ut5.I7(new C12Y5(this, 2), view2);
        }
        View view3 = this.LLJJL;
        if (view3 != null) {
            C786410Ut5.I7(new C12Y5(this, 3), view3);
        }
        TuxIconView tuxIconView5 = this.LLJJJJ;
        if (tuxIconView5 != null) {
            C786410Ut5.I7(new C12Y5(this, 4), tuxIconView5);
        }
        TuxIconView tuxIconView6 = this.LLJJJJJIL;
        if (tuxIconView6 != null) {
            C786410Ut5.I7(new C12Y5(this, 5), tuxIconView6);
        }
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.11z5
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C19678511yx) obj).LJI;
            }
        }, new AwS608S0100000_29(this, 70));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.11yy
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C19678511yx) obj).LJII;
            }
        }, new AwS608S0100000_29(this, 71));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.11yz
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C19678511yx) obj).LJIIIIZZ;
            }
        }, new AwS608S0100000_29(this, 72));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.11z0
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C19678511yx) obj).LJIIIZ;
            }
        }, new AwS608S0100000_29(this, 73));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.11z1
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C19678511yx) obj).LJIIJ;
            }
        }, new AwS608S0100000_29(this, 69));
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.en4, viewGroup, false);
    }
}
