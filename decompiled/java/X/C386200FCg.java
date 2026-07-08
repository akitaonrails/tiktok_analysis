package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0FCg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C386200FCg extends C0FC9<C0FCZ, InterfaceC386220FCi> {
    public final Activity LLJJJJJIL;
    public final C1DRG LLJJJJLIIL;
    public C0ED1 LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public final float LLJL;
    public final int LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public final C194341111n LLJLL;
    public final C01GW LLJLLIL;
    public ViewGroup LLJLLL;
    public final C01GW LLJZ;
    public final C01GW LLJZIJLIL;

    public final C0FPW LLLLLJLJLL() {
        return (C0FPW) this.LLJLILLLLZIIL.getValue();
    }

    public final C0ED1 LLLLLL() {
        View viewRequireView = requireView();
        KeyEvent.Callback callbackFindViewById = this.LLJJL;
        if (callbackFindViewById == null) {
            callbackFindViewById = viewRequireView.findViewById(R.id.vc_loading);
            this.LLJJL = (C0ED1) callbackFindViewById;
        }
        return (C0ED1) callbackFindViewById;
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onDestroyView() {
        LLLLLJLJLL().onDestroy();
        C194341111n c194341111n = this.LLJLL;
        if (c194341111n.LIZ != 0) {
            c194341111n.LJIIIIZZ();
        }
        super.onDestroyView();
    }

    @Override // com.bytedance.scene.Scene
    public final void LLJJL(boolean z) {
        C194341111n c194341111n = this.LLJLL;
        T t = c194341111n.LIZ;
        if (t != 0) {
            c194341111n.LJFF(t, z);
        }
    }

    public C386200FCg(C1DRG c1drg, Activity activity) {
        super(c1drg);
        this.LLJJJJJIL = activity;
        this.LLJJJJLIIL = c1drg;
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 429));
        this.LLJL = 4.0f;
        this.LLJLIL = C0FU0.LIZ(16.0f);
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(131));
        this.LLJLL = new C194341111n();
        this.LLJLLIL = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(132));
        this.LLJZ = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(130));
        this.LLJZIJLIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 428));
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        ViewGroup viewGroup;
        ViewGroup.LayoutParams layoutParams;
        super.onViewCreated(view, bundle);
        if (view instanceof ViewGroup) {
            viewGroup = (ViewGroup) view;
        } else {
            viewGroup = null;
        }
        this.LLJLLL = viewGroup;
        RecyclerView recyclerViewLIZLLL = LLLLLJLJLL().LIZLLL(requireSceneContext(), new LinearLayoutManager(requireSceneContext(), 0, false), new C391460FWm(1));
        recyclerViewLIZLLL.setClipToPadding(false);
        int i = this.LLJLIL;
        recyclerViewLIZLLL.setPadding(i, 0, i, 0);
        if (this.LLJLLL instanceof FrameLayout) {
            layoutParams = new FrameLayout.LayoutParams(-1, -1);
        } else {
            layoutParams = new ViewGroup.LayoutParams(-1, -1);
        }
        ViewGroup viewGroup2 = this.LLJLLL;
        if (viewGroup2 != null) {
            viewGroup2.addView(recyclerViewLIZLLL, layoutParams);
        }
        LLLLLJLJLL().LJFF(new C1664220tPQ(((Boolean) this.LLJZ.getValue()).booleanValue()));
        LLLLLJLJLL().LJII((InterfaceC1664180tPM) this.LLJZIJLIL.getValue());
        C194341111n c194341111n = this.LLJLL;
        c194341111n.LJ.LJ = true;
        c194341111n.LJFF = false;
        this.LLJLL.LJII(recyclerViewLIZLLL, new C0FGH() { // from class: X.0FCh
            @Override // X.C0FGH
            public final void LIZ(int i2, List<Integer> list) {
                this.LIZ.LLLLIL().LIZJ(i2, list);
            }
        });
        C386250FCl c386250FCl = (C386250FCl) this.LLJLLIL.getValue();
        Context contextRequireSceneContext = requireSceneContext();
        AwS549S0100000_5 awS549S0100000_5 = new AwS549S0100000_5(this, 422);
        c386250FCl.getClass();
        C386240FCk c386240FCk = new C386240FCk(contextRequireSceneContext);
        c386240FCk.LIZJ = awS549S0100000_5;
        c386250FCl.LIZ = c386240FCk;
        C0ED1 c0ed1LLLLLL = LLLLLL();
        if (c0ed1LLLLLL != null) {
            c0ed1LLLLLL.setLoadingTip(getString(2131858358));
        }
        C0ED1 c0ed1LLLLLL2 = LLLLLL();
        if (c0ed1LLLLLL2 != null) {
            c0ed1LLLLLL2.setErrorTip(getString(2131858357));
        }
        C0ED1 c0ed1LLLLLL3 = LLLLLL();
        if (c0ed1LLLLLL3 != null) {
            c0ed1LLLLLL3.setOnRetryClick(new AwS584S0100000_5(this, 357));
        }
        if (C0E2B.LIZ()) {
            C0E2R c0e2r = (C0E2R) this.LLJJLIIIJLLLLLLLZ.getValue();
            if (c0e2r != null) {
                c0e2r.ob1(true);
            }
            ViewGroup viewGroup3 = this.LLJLLL;
            if (viewGroup3 != null) {
                C0EBI.LIZ(viewGroup3, this.LLJL);
            }
        }
        VideoPublishEditModel videoPublishEditModelLLLLLJIL = C0FC9.LLLLLJIL();
        if (videoPublishEditModelLLLLLJIL != null) {
            C0LAB c0lab = new C0LAB();
            c0lab.LJ("creation_id", videoPublishEditModelLLLLLJIL.getCreationId());
            c0lab.LJ("scene_from", "editor_pro");
            c0lab.LIZ(videoPublishEditModelLLLLLJIL.creativeModel.pugcTemplateData.isFromCreateTemplate ? 1 : 0, "is_from_create_template");
            C20684815ws.LJIILLIIL("click_voice_effect", c0lab.LIZ);
        }
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0FCd
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0FCZ) obj).LIZ;
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 360));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0FCb
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C0FCZ) obj).LIZIZ);
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 361));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0FCc
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C0FCZ) obj).LIZJ);
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 362));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0FCa
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C0FCZ) obj).LIZLLL);
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 356));
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        if (((Boolean) this.LLJZ.getValue()).booleanValue()) {
            i = R.layout.t6;
        } else {
            i = R.layout.f863t5;
        }
        return (ViewGroup) C786410Ut5.Td(layoutInflater, i, viewGroup, false);
    }
}
