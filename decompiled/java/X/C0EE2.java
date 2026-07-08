package X;

import Y.ACListenerS140S0100000_5;
import Y.ARunnableS105S0100000_5;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.StylePrompt;
import com.ss.android.ugc.aweme.widgetcompat.WrapGridLayoutManager;
import com.ss.ugc.android.editor.base.resource.ResourceItem;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS406S0200000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0EE2, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EE2 extends AbstractC1664490tPr<C0EEA, C0EE9> {
    public final C01GW LLJJJIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 282));
    public final C01GW LLJJJJ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 284));
    public final C01GW LLJJJJJIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 285));
    public final C01GW LLJJJJLIIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 286));
    public final C01GW LLJJL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 283));
    public String LLJJLIIIJLLLLLLLZ;
    public C0EEF LLJL;

    public final View LLLLLJLJLL() {
        return (View) this.LLJJJIL.getValue();
    }

    public final LinearLayout LLLLLL() {
        return (LinearLayout) this.LLJJL.getValue();
    }

    public final C0EDF LLLLLLIL() {
        return (C0EDF) this.LLJJJJ.getValue();
    }

    @Override // X.AbstractC1664490tPr
    public final void onShow() {
        View view = this.mView;
        if (view == null) {
            return;
        }
        LLLLLL().animate().cancel();
        HandlerHook.viewPost(view, new ARunnableS105S0100000_5(this, 37));
    }

    public static final boolean LLLLLLJ() {
        if (!C0E2B.LIZ()) {
            return false;
        }
        C1455910nzR.LIZ.getClass();
        return !C1455910nzR.LIZJ();
    }

    @Override // X.AbstractC1664490tPr
    public final void onHide() {
        LLLLLL().animate().cancel();
        C786410Ut5.LJLLLLLL(8, LLLLLJLJLL());
        C786410Ut5.T4(LLLLLJLJLL(), 0.0f);
        C786410Ut5.LJZL(4, LLLLLL());
        C786410Ut5.hd(LLLLLL(), LLLLLL().getHeight());
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LLLLLJIL(X.C0EE2 r7) {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0EE2.LLLLLJIL(X.0EE2):void");
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        TuxIconDrawable tuxIconDrawableLIZ;
        int iIntValue;
        int iIntValue2;
        float f;
        View view;
        Integer numLIZJ;
        Integer numLIZJ2;
        super.onActivityCreated(bundle);
        C786410Ut5.I7(new ACListenerS140S0100000_5(this, 22), LLLLLJLJLL());
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0EE7
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0EEA) obj).LIZJ;
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 285));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0EE6
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0EEA) obj).LIZIZ;
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 286));
        C786410Ut5.U8((C197039127h) this.LLJJJJJIL.getValue(), new ACListenerS140S0100000_5(this, 23));
        final C0EDF c0edfLLLLLLIL = LLLLLLIL();
        int iLJIILJJIL = C12ES.LJIILJJIL(C12ES.LJIIJ(c0edfLLLLLLIL.getContext()) * 0.217f, c0edfLLLLLLIL.getContext());
        C0ED7 c0ed7 = new C0ED7();
        c0ed7.LIZJ = "editor_pro_aigc";
        c0ed7.LIZ = new WrapGridLayoutManager(4, c0edfLLLLLLIL.getContext());
        c0ed7.LIZIZ = new C0EE5(4, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), false);
        String string = c0edfLLLLLLIL.getContext().getString(2131825345);
        Context sceneContext = getSceneContext();
        if (sceneContext != null) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_block;
            c419910GdJ.LJ = Integer.valueOf(R.attr.ee);
            c419910GdJ.LIZIZ = C390810FTz.LIZ(24.0f);
            c419910GdJ.LIZJ = C390810FTz.LIZ(24.0f);
            tuxIconDrawableLIZ = c419910GdJ.LIZ(sceneContext);
        } else {
            tuxIconDrawableLIZ = null;
        }
        c0ed7.LJIIJ = new C361140EDw(true, R.drawable.bon, true, tuxIconDrawableLIZ, string, R.drawable.boe, 32);
        C0EE1 c0ee1 = C0EE1.DOWN;
        Context context = c0edfLLLLLLIL.getContext();
        Integer numValueOf = Integer.valueOf(R.attr.ee);
        if (numValueOf != null && (numLIZJ2 = C1308910kAL.LIZJ(numValueOf.intValue(), context)) != null) {
            iIntValue = numLIZJ2.intValue();
        } else {
            iIntValue = -1;
        }
        Context context2 = c0edfLLLLLLIL.getContext();
        Integer numValueOf2 = Integer.valueOf(R.attr.ee);
        if (numValueOf2 != null && (numLIZJ = C1308910kAL.LIZJ(numValueOf2.intValue(), context2)) != null) {
            iIntValue2 = numLIZJ.intValue();
        } else {
            iIntValue2 = -1;
        }
        c0ed7.LJIIJJI = new C361120EDu(false, iIntValue, iIntValue2, c0ee1, 6, 0, 0, 0.34f, new AwS406S0200000_5(this, c0edfLLLLLLIL, 38), new AwS584S0100000_5(this, 287), new AwS584S0100000_5(this, 288), 867);
        c0ed7.LJII = false;
        c0ed7.LJIIIIZZ = false;
        c0ed7.LJIIIZ = false;
        c0ed7.LJIJJ = true;
        c0ed7.LJIILIIL = new C0EDB(126);
        c0ed7.LJIILL = new C0EDU(true, iLJIILJJIL, iLJIILJJIL, R.drawable.ana, 0, 0, 240);
        int i = iLJIILJJIL - 2;
        if (C423170GiZ.LIZ(c0edfLLLLLLIL.getContext())) {
            f = -1.0f;
        } else {
            f = 1.0f;
        }
        c0ed7.LJIIL = new C361130EDv(i, i, 8, null, R.drawable.bon, R.drawable.bon, f, null, 2961);
        C0ED8 c0ed8 = new C0ED8(c0ed7);
        final ConstraintLayout constraintLayout = (ConstraintLayout) this.LLJJJJLIIL.getValue();
        final C197039127h c197039127h = (C197039127h) this.LLJJJJJIL.getValue();
        c0edfLLLLLLIL.setResourceListInitListener(new C0EDS() { // from class: X.0EE4
            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.C0EDS
            public final List<ResourceItem> LIZJ(List<? extends ResourceItem> list) {
                return list;
            }

            @Override // X.C0EDS
            public final List<ResourceItem> LIZ() {
                return C13BV.INSTANCE;
            }

            /* JADX WARN: Removed duplicated region for block: B:18:0x004e  */
            @Override // X.C0EDS
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZIZ(boolean r5, boolean r6) {
                /*
                    r4 = this;
                    X.127h r0 = r1
                    r3 = 0
                    if (r0 == 0) goto L8
                    r0.setLoading(r3)
                L8:
                    r2 = 8
                    if (r5 == 0) goto L4e
                    X.0EE2 r1 = r2
                    X.0EDF r0 = r3
                    r1.getClass()
                    r1 = 1
                    if (r0 == 0) goto L4e
                    X.0EDs r0 = r0.getResourceListAdapter()
                    if (r0 == 0) goto L4e
                    java.util.List r0 = r0.LLLFZ()
                    java.util.ArrayList r0 = (java.util.ArrayList) r0
                    int r0 = r0.size()
                    if (r0 <= r1) goto L4e
                    X.0EDF r1 = r3
                    int r0 = r1.getVisibility()
                    r1.setVisibility(r3)
                    X.C1602160rnK.LIZIZ(r0, r3, r1)
                    android.view.View r0 = r4
                    if (r0 == 0) goto L3b
                    X.C786410Ut5.LJLLLLLL(r2, r0)
                L3b:
                    X.0EE2 r0 = r2
                    X.0EDF r3 = r0.LLLLLLIL()
                    Y.ARunnableS105S0100000_5 r2 = new Y.ARunnableS105S0100000_5
                    X.0EE2 r1 = r2
                    r0 = 39
                    r2.<init>(r1, r0)
                    com.bytedance.bpea.transmit.hook.HandlerHook.viewPost(r3, r2)
                    return
                L4e:
                    X.0EDF r1 = r3
                    int r0 = r1.getVisibility()
                    r1.setVisibility(r2)
                    X.C1602160rnK.LIZIZ(r0, r2, r1)
                    android.view.View r0 = r4
                    if (r0 == 0) goto L3b
                    X.C786410Ut5.LJLLLLLL(r3, r0)
                    goto L3b
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C0EE4.LIZIZ(boolean, boolean):void");
            }
        });
        c0edfLLLLLLIL.setOnItemClickListener(new C0E16() { // from class: X.0EE3
            @Override // X.C0EDC
            public final void LIZIZ(int i2, ResourceItem resourceItem, boolean z) {
                boolean z2;
                StylePrompt stylePrompt;
                String name;
                if (i2 == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (resourceItem != null) {
                    C0EE2 c0ee2 = this.LIZ;
                    C0EDF c0edf = c0edfLLLLLLIL;
                    String effectId = resourceItem.getEffectId();
                    if (z2) {
                        stylePrompt = new StylePrompt("", "");
                        name = c0edf.getContext().getString(2131825345);
                    } else {
                        String str = resourceItem.extra;
                        c0ee2.getClass();
                        try {
                            if (str == null) {
                                str = "";
                            }
                            JSONObject jSONObject = new JSONObject(str);
                            stylePrompt = new StylePrompt(JSONObjectProtectorUtils.getString(jSONObject, "style_prompt"), JSONObjectProtectorUtils.getString(jSONObject, "style_prompt_i2i"));
                        } catch (JSONException e) {
                            TryCatchGuardChecker.doCheck(e);
                            stylePrompt = new StylePrompt("", "");
                        }
                        name = resourceItem.getName();
                    }
                    c0ee2.LLJJLIIIJLLLLLLLZ = effectId;
                    c0ee2.LLLLLLL(stylePrompt, effectId, name, null);
                }
                this.LIZ.LLLLIL().LIZ.invoke();
            }
        });
        Scene scene = this.mParentScene;
        if (scene != null) {
            view = scene.mView;
        } else {
            view = null;
        }
        C0EDF.LJFF(c0edfLLLLLLIL, c0ed8, view, null, 4);
        c0edfLLLLLLIL.LJIIZILJ();
        C786410Ut5.LJLLLLLL(8, LLLLLJLJLL());
        C786410Ut5.T4(LLLLLJLJLL(), 0.0f);
        C786410Ut5.LJZL(4, LLLLLL());
        if (LLLLLL().getParent() != null) {
            HandlerHook.viewPost(LLLLLL(), new ARunnableS105S0100000_5(this, 35));
        }
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        setTheme(R.style.y0);
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.c4j, viewGroup, false);
    }

    public final void LLLLLLL(StylePrompt stylePrompt, String str, String str2, Integer num) {
        Context sceneContext = getSceneContext();
        if (sceneContext != null) {
            C0EDF c0edfLLLLLLIL = LLLLLLIL();
            if (str2.length() == 0) {
                str2 = sceneContext.getString(2131825345);
            }
            if (c0edfLLLLLLIL != null) {
                C0EDF.LJIIL(c0edfLLLLLLIL, str, null, 14);
                LLLLIL().LIZIZ.invoke(stylePrompt, str, str2, num);
            }
        }
    }
}
