package X;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.ugc.android.editor.base.resource.ResourceItem;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ECx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C360890ECx extends C0FC9<C357930E1n, InterfaceC360910ECz> {
    public final boolean LLJJJJJIL;
    public final Activity LLJJJJLIIL;
    public final C1DRG LLJJL;
    public C0EDF LLJJLIIIJLLLLLLLZ;
    public C0EJZ LLJL;
    public ConstraintLayout LLJLIL;
    public TuxIconView LLJLILLLLZIIL;
    public C0FX1 LLJLL;
    public final C01GW LLJLLIL;
    public C0EJZ LLJLLL;
    public LinearLayout LLJZ;
    public TuxIconView LLJZIJLIL;
    public View LLL;
    public TuxIconView LLLF;
    public TuxIconView LLLFF;
    public TuxTextView LLLFFI;
    public C1295960jpS LLLFZ;
    public View LLLI;
    public FrameLayout LLLII;
    public View LLLIIII;
    public C197039127h LLLIIIIL;
    public final float LLLIIIL;
    public final int LLLIIL;
    public boolean LLLIILIL;
    public final C01GW LLLIL;
    public final C01GW LLLILZ;
    public final C01GW LLLILZJ;
    public C0EDF LLLILZLLLI;
    public boolean LLLIZZ;
    public List<? extends ResourceItem> LLLJ;

    public final String LLLLLLIL() {
        C361100EDs resourceListAdapter;
        ResourceItem resourceItem;
        C357590E0f category;
        String str;
        C0EDF c0edf = this.LLLILZLLLI;
        return (c0edf == null || (resourceListAdapter = c0edf.getResourceListAdapter()) == null || (resourceItem = (ResourceItem) C13LP.LJJJLL(resourceListAdapter.LLLFZ())) == null || (category = resourceItem.getCategory()) == null || (str = category.LIZIZ) == null) ? "" : str;
    }

    public final C0EDF LLLLLLL() {
        if (this.mView == null) {
            return null;
        }
        View viewRequireView = requireView();
        KeyEvent.Callback callbackFindViewById = this.LLJJLIIIJLLLLLLLZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = viewRequireView.findViewById(R.id.nvs);
            this.LLJJLIIIJLLLLLLLZ = (C0EDF) callbackFindViewById;
        }
        return (C0EDF) callbackFindViewById;
    }

    public final void LLLLLZL() {
        C0EDF c0edfLLLLLLL;
        C361100EDs resourceListAdapter;
        C362490EJb c362490EJb;
        if (!this.LLJJJJJIL || (c0edfLLLLLLL = LLLLLLL()) == null || (resourceListAdapter = c0edfLLLLLLL.getResourceListAdapter()) == null) {
            return;
        }
        List<ResourceItem> listLLLFZ = resourceListAdapter.LLLFZ();
        C0EJZ c0ejzLLLLLLLLL = LLLLLLLLL();
        if (c0ejzLLLLLLLLL != null) {
            C786410Ut5.L1(c0ejzLLLLLLLLL, 0);
            C353560Dta c353560Dta = C353560Dta.LIZ;
            VideoPublishEditModel videoPublishEditModelLLLLLJIL = C0FC9.LLLLLJIL();
            c353560Dta.getClass();
            if (C353560Dta.LIZIZ(videoPublishEditModelLLLLLJIL) && C353560Dta.LIZJ(C0FC9.LLLLLJIL())) {
                c362490EJb = new C362490EJb(null, false, 40, new AwS549S0100000_5(this, 365), 0, C357780E0y.LIZ() ? 20 : 4, 36, Integer.valueOf(LLLLLL(requireSceneContext(), Integer.valueOf(R.attr.a1h))), LLLLLL(requireSceneContext(), Integer.valueOf(R.attr.a1k)), 42, LLLLLL(requireSceneContext(), Integer.valueOf(R.attr.a1h)), false, false, false, null, true, false, false, false, null, 1065247105);
            } else {
                c362490EJb = new C362490EJb(null, false, 52, new AwS549S0100000_5(this, 366), 0, C293810BfP.LIZ() ? 4 : 16, 0, Integer.valueOf(LLLLLL(requireSceneContext(), Integer.valueOf(R.attr.a1h))), LLLLLL(requireSceneContext(), Integer.valueOf(R.attr.a1k)), null, LLLLLL(requireSceneContext(), Integer.valueOf(R.attr.a1h)), true, true, false, null, false, false, false, false, null, 1073637843);
            }
            c0ejzLLLLLLLLL.LIZ(c362490EJb);
            C0EDF c0edfLLLLLLL2 = LLLLLLL();
            if (c0edfLLLLLLL2 != null) {
                C365360EUc.LIZ.getClass();
                c0ejzLLLLLLLLL.LJI(c0edfLLLLLLL2, C365360EUc.LIZJ(listLLLFZ), Boolean.TRUE);
            }
            C0EJZ c0ejzLLLLLLLLL2 = LLLLLLLLL();
            if (c0ejzLLLLLLLLL2 != null) {
                c0ejzLLLLLLLLL2.setOnTabSelected(new AwS584S0100000_5(this, 324));
            }
        }
    }

    public static final boolean LLLLLLZ() {
        if (!C0E2B.LIZ()) {
            return false;
        }
        C1455910nzR.LIZ.getClass();
        return !C1455910nzR.LIZJ();
    }

    public final LinearLayout LLLLLLJ() {
        View viewRequireView = requireView();
        KeyEvent.Callback callbackFindViewById = this.LLJZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = viewRequireView.findViewById(R.id.nvm);
            this.LLJZ = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final C0EJZ LLLLLLLLL() {
        View viewRequireView = requireView();
        KeyEvent.Callback callbackFindViewById = this.LLJLLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = viewRequireView.findViewById(R.id.nvt);
            this.LLJLLL = (C0EJZ) callbackFindViewById;
        }
        return (C0EJZ) callbackFindViewById;
    }

    public final C0EJZ LLLLLLLLLL() {
        View viewRequireView = requireView();
        KeyEvent.Callback callbackFindViewById = this.LLJL;
        if (callbackFindViewById == null) {
            callbackFindViewById = viewRequireView.findViewById(R.id.td7);
            this.LLJL = (C0EJZ) callbackFindViewById;
        }
        return (C0EJZ) callbackFindViewById;
    }

    public final void LLLLLZ() {
        View viewRequireView = requireView();
        if (this.LLJLILLLLZIIL == null) {
            View viewFindViewById = viewRequireView.findViewById(R.id.nvj);
            this.LLJLILLLLZIIL = (TuxIconView) viewFindViewById;
            if (viewFindViewById == null) {
                return;
            }
        }
        View viewRequireView2 = requireView();
        Object objFindViewById = this.LLJLILLLLZIIL;
        if (objFindViewById == null) {
            objFindViewById = viewRequireView2.findViewById(R.id.nvj);
            this.LLJLILLLLZIIL = (TuxIconView) objFindViewById;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(objFindViewById, "rotation", 0.0f, 360.0f);
        objectAnimatorOfFloat.setDuration(1000L);
        objectAnimatorOfFloat.setRepeatCount(-1);
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        C786410Ut5.Pd(objectAnimatorOfFloat);
    }

    public final void LLLLLJLJLL(NLETrackSlot nLETrackSlot) {
        C361100EDs resourceListAdapter;
        boolean z;
        C0EDF c0edfLLLLLLL = LLLLLLL();
        if (c0edfLLLLLLL != null && (resourceListAdapter = c0edfLLLLLLL.getResourceListAdapter()) != null) {
            List<ResourceItem> listLLLFZ = resourceListAdapter.LLLFZ();
            C354260Dui.LIZ.getClass();
            String strLIZJ = C0E0F.LIZJ(C354260Dui.LJIIJ(nLETrackSlot));
            NLEResType nLEResTypeLJIIJ = C354260Dui.LJIIJ(nLETrackSlot);
            int i = 0;
            for (Object obj : (ArrayList) listLLLFZ) {
                int i2 = i + 1;
                if (i >= 0) {
                    ResourceItem resourceItem = (ResourceItem) obj;
                    if (!C357750E0v.LIZ(resourceItem, this.LLJJJJLIIL)) {
                        C353560Dta c353560Dta = C353560Dta.LIZ;
                        VideoPublishEditModel videoPublishEditModelLLLLLJIL = C0FC9.LLLLLJIL();
                        c353560Dta.getClass();
                        boolean z2 = true;
                        if (C353560Dta.LIZLLL(videoPublishEditModelLLLLLJIL) && nLEResTypeLJIIJ == NLEResType.VIDEO && resourceItem.magicResourceTypeList.contains("photo")) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!resourceItem.magicResourceTypeList.contains(strLIZJ) && !z) {
                            z2 = false;
                        }
                        c0edfLLLLLLL.LIZIZ(i, z2);
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
    }

    public final void LLLLLLZZ(String str) {
        if (LLLLLLLLLL() == null) {
            return;
        }
        int i = !Intrinsics.LJFF(str, "video") ? 1 : 0;
        C0EJZ c0ejzLLLLLLLLLL = LLLLLLLLLL();
        if (c0ejzLLLLLLLLLL != null) {
            c0ejzLLLLLLLLLL.LJ(str, true);
        }
        LLLLLLLZIL(i, false);
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    public static int LLLLLL(Context context, Integer num) {
        Integer numLIZJ;
        if (num == null || (numLIZJ = C1308910kAL.LIZJ(num.intValue(), context)) == null) {
            return -1;
        }
        return numLIZJ.intValue();
    }

    public final void LLLLLLLZIL(int i, boolean z) {
        String str;
        VideoPublishEditModel videoPublishEditModelLLLLLJIL;
        ConstraintLayout constraintLayout;
        List listLLLFZ;
        boolean zContains;
        if (i == 0) {
            str = "video";
        } else {
            str = "photo";
        }
        C0EDF c0edfLLLLLLL = LLLLLLL();
        if (c0edfLLLLLLL != null) {
            if (!this.LLLJ.isEmpty()) {
                listLLLFZ = this.LLLJ;
            } else {
                C361100EDs resourceListAdapter = c0edfLLLLLLL.getResourceListAdapter();
                if (resourceListAdapter != null) {
                    listLLLFZ = resourceListAdapter.LLLFZ();
                }
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : listLLLFZ) {
                ResourceItem resourceItem = (ResourceItem) obj;
                if (Intrinsics.LJFF(str, "video")) {
                    zContains = resourceItem.magicResourceTypeList.contains("video");
                } else if (!Intrinsics.LJFF(str, "photo")) {
                    arrayList.add(obj);
                } else {
                    zContains = resourceItem.magicResourceTypeList.contains("photo");
                }
                if (zContains) {
                    arrayList.add(obj);
                }
            }
            c0edfLLLLLLL.LJIILLIIL(arrayList);
            LLLLLZL();
        }
        C0EDF c0edfLLLLLLL2 = LLLLLLL();
        if (c0edfLLLLLLL2 != null) {
            ViewParent parent = c0edfLLLLLLL2.getParent();
            if ((parent instanceof ConstraintLayout) && (constraintLayout = (ConstraintLayout) parent) != null) {
                C19MB c19mb = new C19MB();
                c19mb.LJII(constraintLayout);
                if (i == 0) {
                    c19mb.LJJIIJZLJL(R.id.nvs, 3, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)));
                    c19mb.LIZIZ(constraintLayout);
                    C0EJZ c0ejzLLLLLLLLL = LLLLLLLLL();
                    if (c0ejzLLLLLLLLL != null) {
                        C786410Ut5.L1(c0ejzLLLLLLLLL, 8);
                    }
                } else {
                    C0EJZ c0ejzLLLLLLLLL2 = LLLLLLLLL();
                    if (c0ejzLLLLLLLLL2 != null) {
                        C786410Ut5.L1(c0ejzLLLLLLLLL2, 0);
                    }
                    c19mb.LJJIIJZLJL(R.id.nvs, 3, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
                    c19mb.LJIIIIZZ(R.id.nvs, 3, R.id.nvt, 4);
                    c19mb.LIZIZ(constraintLayout);
                }
            }
        }
        if (z && (videoPublishEditModelLLLLLJIL = C0FC9.LLLLLJIL()) != null) {
            C0LAB c0labLJFF = C361680EFy.LJFF(-1L, videoPublishEditModelLLLLLJIL, LIZIZ(), new Pair(-1, -1));
            c0labLJFF.LJ("is_editor_pro", "1");
            c0labLJFF.LJ("magic_tab_tier_1", str);
            c0labLJFF.LJ("enter_from", "video_edit_page");
            C20684815ws.LJIILLIIL("magic_tab_tier1_click", c0labLJFF.LIZ);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x051c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a0 A[PHI: r2
      0x00a0: PHI (r2v47 android.view.View) = (r2v46 android.view.View), (r2v48 android.view.View) binds: [B:15:0x0093, B:17:0x009e] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.bytedance.scene.Scene
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r40, android.os.Bundle r41) {
        /*
            Method dump skipped, instruction units count: 1397
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C360890ECx.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public C360890ECx(boolean z, Activity activity, C1DRG c1drg) {
        super(c1drg);
        this.LLJJJJJIL = z;
        this.LLJJJJLIIL = activity;
        this.LLJJL = c1drg;
        this.LLJLLIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 361));
        this.LLLIIIL = 64.0f;
        this.LLLIIL = C0FU0.LIZ(4.0f);
        this.LLLIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 363));
        this.LLLILZ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 364));
        this.LLLILZJ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 362));
        this.LLLJ = C13BV.INSTANCE;
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        C353560Dta c353560Dta = C353560Dta.LIZ;
        VideoPublishEditModel videoPublishEditModelLLLLLJIL = C0FC9.LLLLLJIL();
        c353560Dta.getClass();
        if (C353560Dta.LIZIZ(videoPublishEditModelLLLLLJIL) && C353560Dta.LIZJ(C0FC9.LLLLLJIL())) {
            i = R.layout.c1e;
        } else if (C353560Dta.LIZIZ(C0FC9.LLLLLJIL()) && !C353560Dta.LIZJ(C0FC9.LLLLLJIL())) {
            i = R.layout.c1f;
        } else {
            i = R.layout.c1d;
        }
        return (ViewGroup) C786410Ut5.Td(layoutInflater, i, viewGroup, false);
    }
}
