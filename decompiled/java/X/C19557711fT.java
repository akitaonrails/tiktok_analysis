package X;

import Y.AObjectS372S0100000_29;
import Y.AObjectS403S0100000_29;
import Y.AObserverS231S0100000_29;
import Y.ATListenerS166S0000000_29;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.effect.EffectModel;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.ftc.components.effect.FTCEditEffectState;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.cover.VEVideoCoverGeneratorImpl;
import com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.ss.android.vesdk.VEEditor;
import com.zhiliaoapp.musically.R;
import dmt.av.video.ReplayLiveData;
import dmt.av.video.StoredLiveData;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS643S0100000_29;

/* JADX INFO: renamed from: X.11fT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19557711fT extends Scene implements InterfaceC1166920gTK {
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS573S0100000_29(this, 22));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(13));

    @Override // X.InterfaceC960503pD, X.C11E6
    public final LifecycleOwner getLifecycleOwner() {
        return this;
    }

    @Override // X.C11E9
    public final C11E6 getLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.C11DL
    public final InterfaceC874803bO getReceiver() {
        return this;
    }

    @Override // X.C11E9
    public final C11DL<InterfaceC960503pD> getReceiverHolder() {
        return this;
    }

    @Override // X.C11E9
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    public final C19557811fU LLLII() {
        return (C19557811fU) this.LLJIJIL.getValue();
    }

    @Override // com.bytedance.scene.Scene
    public final void onDestroyView() {
        C19559211fi c19559211fi;
        super.onDestroyView();
        C19557811fU c19557811fULLLII = LLLII();
        InterfaceC1452170ntP interfaceC1452170ntP = c19557811fULLLII.LJJI;
        if (interfaceC1452170ntP != null && (c19559211fi = c19557811fULLLII.LJJIII) != null) {
            interfaceC1452170ntP.Gf(c19559211fi);
        }
        C194363112j c194363112j = c19557811fULLLII.LJJIJ;
        if (c194363112j != null) {
            c194363112j.LLJILJILJ.LJI();
        }
    }

    @Override // com.bytedance.scene.Scene
    public final void onStart() {
        super.onStart();
        C19557811fU c19557811fULLLII = LLLII();
        RunnableC19558411fa runnableC19558411fa = c19557811fULLLII.LJJIIJZLJL;
        if (runnableC19558411fa != null) {
            c19557811fULLLII.LJI.post(runnableC19558411fa);
        }
        RunnableC19558811fe runnableC19558811fe = c19557811fULLLII.LJJIIZ;
        if (runnableC19558811fe != null) {
            c19557811fULLLII.LJI.post(runnableC19558811fe);
        }
    }

    @Override // com.bytedance.scene.Scene
    public final void onStop() {
        super.onStop();
        LLLII().LJI.removeCallbacksAndMessages(null);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        VEEditor.GET_FRAMES_FLAGS get_frames_flags;
        super.onActivityCreated(bundle);
        C19557811fU c19557811fULLLII = LLLII();
        c19557811fULLLII.getClass();
        c19557811fULLLII.LJJIJIIJIL = (C19EG) this.mActivity;
        c19557811fULLLII.LJII = this;
        c19557811fULLLII.LJJJJLL = C0MWZ.LIZ(this);
        c19557811fULLLII.LJJJJ = new SafeHandler(this);
        c19557811fULLLII.LJI = new SafeHandler(c19557811fULLLII.LJII);
        c19557811fULLLII.LIZ = c19557811fULLLII.LJJJJIZL.LJJJLIIL();
        c19557811fULLLII.LJJJJIZL.Ps();
        c19557811fULLLII.LJJJJIZL.lk();
        c19557811fULLLII.LJJI = c19557811fULLLII.LJJJJIZL.LIZIZ().getValue();
        final C19557811fU c19557811fULLLII2 = LLLII();
        View viewFindViewById = findViewById(R.id.u17);
        c19557811fULLLII2.LJJIIZI = viewFindViewById;
        c19557811fULLLII2.LJIIIIZZ = (C19557911fV) viewFindViewById.findViewById(R.id.gxr);
        c19557811fULLLII2.LJIIIZ = (LinearLayout) c19557811fULLLII2.LJJIIZI.findViewById(R.id.ujt);
        c19557811fULLLII2.LJIIJ = (FrameLayout) c19557811fULLLII2.LJJIIZI.findViewById(R.id.ex8);
        c19557811fULLLII2.LJIIJJI = (ImageView) c19557811fULLLII2.LJJIIZI.findViewById(R.id.lr1);
        c19557811fULLLII2.LJIIL = (RelativeLayout) c19557811fULLLII2.LJJIIZI.findViewById(R.id.to9);
        c19557811fULLLII2.LJIILIIL = (TextView) c19557811fULLLII2.LJJIIZI.findViewById(R.id.zjo);
        c19557811fULLLII2.LJIILJJIL = (RelativeLayout) c19557811fULLLII2.LJJIIZI.findViewById(R.id.gxn);
        RelativeLayout relativeLayout = (RelativeLayout) c19557811fULLLII2.LJJIIZI.findViewById(R.id.videolayout);
        c19557811fULLLII2.LJIILL = (LinearLayout) c19557811fULLLII2.LJJIIZI.findViewById(R.id.f762nla);
        c19557811fULLLII2.LJIILLIIL = (C19412810xC) c19557811fULLLII2.LJJIIZI.findViewById(R.id.nne);
        c19557811fULLLII2.LJIIZILJ = (TextView) c19557811fULLLII2.LJJIIZI.findViewById(R.id.tv_save);
        c19557811fULLLII2.LJIJ = (TextView) c19557811fULLLII2.LJJIIZI.findViewById(R.id.zbv);
        c19557811fULLLII2.LJIJI = (C0MS4) c19557811fULLLII2.LJJIIZI.findViewById(R.id.viewpager);
        c19557811fULLLII2.LJIJJ = (C19561511g5) c19557811fULLLII2.LJJIIZI.findViewById(R.id.wya);
        c19557811fULLLII2.LJIJJLI = (C12UW) c19557811fULLLII2.LJJIIZI.findViewById(R.id.video_edit_view);
        c19557811fULLLII2.LJJIIZI.setOnTouchListener(new ATListenerS166S0000000_29(0));
        C12Y7 c12y7 = new C12Y7(c19557811fULLLII2, 0);
        C786410Ut5.Q7(c19557811fULLLII2.LJIIJJI, c12y7);
        C786410Ut5.S7(relativeLayout, c12y7);
        C786410Ut5.T7(c19557811fULLLII2.LJIJ, c12y7);
        C786410Ut5.T7(c19557811fULLLII2.LJIIZILJ, c12y7);
        c19557811fULLLII2.LJJIIJ = C2441009hQ.LJIIL(C960203pA.LIZ(R.attr.a1r, c19557811fULLLII2.LJJIJIIJIL), 204);
        c19557811fULLLII2.LJIIIIZZ.setVideoDuration(c19557811fULLLII2.LJJI.mo51if());
        c19557811fULLLII2.LJIL(0, false);
        c19557811fULLLII2.LJIIIIZZ.setNormalColor(0);
        c19557811fULLLII2.LJIIIIZZ.setOverlayColor(c19557811fULLLII2.LJJIIJ);
        C19412810xC c19412810xC = c19557811fULLLII2.LJIILLIIL;
        int i = 1;
        if (c19412810xC != null) {
            C19412710xB c19412710xBLIZ = C19412710xB.LIZ(c19557811fULLLII2.LJJIJIIJIL);
            c19412710xBLIZ.LJ = 1;
            c19412810xC.setBuilder(c19412710xBLIZ);
        }
        C194363112j c194363112j = new C194363112j(c19557811fULLLII2.LJJIJIIJIL, c19557811fULLLII2.LJJIJIIJIL.getSupportFragmentManager());
        c19557811fULLLII2.LJJIJ = c194363112j;
        c194363112j.LLJILLL = !c19557811fULLLII2.LJIJJLI();
        c19557811fULLLII2.LJIJI.setOffscreenPageLimit(1);
        c19557811fULLLII2.LJIJI.setNoScroll(true);
        C19561511g5 c19561511g5 = c19557811fULLLII2.LJIJJ;
        c19561511g5.getClass();
        c19561511g5.setTabMargin(C12VA.LIZ().LJ);
        c19557811fULLLII2.LJIJJ.setDefaultAddTab(false);
        c19557811fULLLII2.LJIJJ.setupWithViewPager(c19557811fULLLII2.LJIJI);
        c19557811fULLLII2.LJIJI.clearOnPageChangeListeners();
        c19557811fULLLII2.LJIJI.addOnPageChangeListener(new C19562411gE(c19557811fULLLII2.LJIJJ));
        C19774712Yn c19774712Yn = new C19774712Yn(c19557811fULLLII2, 0);
        c19557811fULLLII2.LJJJJJL = c19774712Yn;
        c19557811fULLLII2.LJIJI.addOnPageChangeListener(c19774712Yn);
        C0F4X.LJFF();
        c19557811fULLLII2.LJIJI(true);
        if (c19557811fULLLII2.LJJJJJ == null) {
            c19557811fULLLII2.LJJJJJ = new C565780MGy();
        }
        ((InterfaceC1635410sex) c19557811fULLLII2.LJJJJJ.LIZ.getValue()).LJI("editingeffect", false, new C19773612Yc(c19557811fULLLII2, 0));
        c19557811fULLLII2.LJII();
        C786410Ut5.LJZI(0, c19557811fULLLII2.LJIIJJI);
        int iLIZJ = (int) C12ES.LIZJ(28.0f, c19557811fULLLII2.LJJIJIIJIL);
        int iLIZJ2 = (int) C12ES.LIZJ(28.0f, c19557811fULLLII2.LJJIJIIJIL);
        int iCeil = (int) Math.ceil((C12ES.LJIIJ(c19557811fULLLII2.LJJIJIIJIL) - (Math.round(C12ES.LIZJ(24.0f, c19557811fULLLII2.LJJIJIIJIL)) * 2)) / (iLIZJ2 * 1.0f));
        if (C1446620nkS.LIZ()) {
            get_frames_flags = VEEditor.GET_FRAMES_FLAGS.GET_FRAMES_MODE_NORMAL;
        } else {
            get_frames_flags = VEEditor.GET_FRAMES_FLAGS.GET_FRAMES_MODE_NOEFFECT;
        }
        c19557811fULLLII2.LJJ = new VEVideoCoverGeneratorImpl(c19557811fULLLII2.LJJI, C535690Kzf.LIZIZ(c19557811fULLLII2.LJJIIZI), iCeil, get_frames_flags, "special_effects");
        c19557811fULLLII2.LJJII = new C19560811fy(c19557811fULLLII2.LJJ, iLIZJ2, iLIZJ, iCeil);
        InterfaceC1452170ntP interfaceC1452170ntP = c19557811fULLLII2.LJJI;
        if (interfaceC1452170ntP == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("VEEffectHelper activity is finishing ");
            sbLIZ.append(c19557811fULLLII2.LJJIJIIJIL.isFinishing());
            C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ));
        } else {
            int iMo51if = interfaceC1452170ntP.mo51if();
            c19557811fULLLII2.LJIL = (CutMultiVideoViewModel) C1659630tI1.LIZLLL(c19557811fULLLII2.LJJIIZI).get(CutMultiVideoViewModel.class);
            c19557811fULLLII2.LJIJJLI.setCanEdit(false);
            c19557811fULLLII2.LJIJJLI.setMinVideoLength(1000L);
            c19557811fULLLII2.LJIJJLI.setMaxVideoLength(iMo51if);
            c19557811fULLLII2.LJIL.LLJILJIL = c19557811fULLLII2.LIZ.isMvThemeVideoType();
            c19557811fULLLII2.LJIL.LLJILJILJ = iMo51if;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("initCutTimeView video duration is ");
            sbLIZ2.append(c19557811fULLLII2.LJJI.getDuration());
            C201955140j.LJIIZILJ(C2188811AlT.LIZIZ(sbLIZ2));
            c19557811fULLLII2.LJIJJLI.setVeEditor(c19557811fULLLII2.LJJI);
            List<MediaModel> mediaModelList = c19557811fULLLII2.LIZ.getMediaModelList();
            C19560311ft c19560311ft = new C19560311ft();
            c19560311ft.LIZIZ = false;
            ((ArrayList) c19560311ft.LIZ).add(new C1420600n4U(c19557811fULLLII2.LJJIJIIJIL, new AObjectS403S0100000_29(c19557811fULLLII2, 0), new AObjectS372S0100000_29(c19557811fULLLII2, 1), new InterfaceC1685420txc() { // from class: X.11ff
                @Override // X.InterfaceC1685420txc
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                    C19557811fU c19557811fU = c19557811fULLLII2;
                    return Float.valueOf(C19558011fW.LIZ(c19557811fU.LJJIJIL, c19557811fU.LJJI.mo51if(), ((Boolean) obj).booleanValue(), ((Float) obj2).floatValue(), ((Float) obj3).floatValue(), ((Integer) obj4).intValue(), ((Float) obj5).floatValue()));
                }
            }));
            c19557811fULLLII2.LJIJJLI.setViewConfig(c19560311ft);
            c19557811fULLLII2.LJIJJLI.setOptimizeEffect(true);
            C12UW c12uw = c19557811fULLLII2.LJIJJLI;
            AbstractC214814194y abstractC214814194yLIZIZ = C372650EjH.LIZIZ(c19557811fULLLII2.LJII);
            ViewModelProvider viewModelProviderLJFF = C1659630tI1.LJFF(c19557811fULLLII2.LJII);
            CutMultiVideoViewModel cutMultiVideoViewModel = c19557811fULLLII2.LJIL;
            c12uw.LLLFZ = c19557811fULLLII2.LJJII;
            c12uw.LLLI = true;
            c12uw.LJII(abstractC214814194yLIZIZ, viewModelProviderLJFF, cutMultiVideoViewModel, mediaModelList);
            c19557811fULLLII2.LJIJJLI.setPointerType(2);
            c19557811fULLLII2.LJIJJLI.getVideoEditViewModel().LLILZLL.observe(c19557811fULLLII2.LJII, new AObserverS231S0100000_29(c19557811fULLLII2, 18));
            c19557811fULLLII2.LJIJJLI.getVideoEditViewModel().LLJIJIL.observe(c19557811fULLLII2.LJII, new AObserverS231S0100000_29(c19557811fULLLII2, 19));
            c19557811fULLLII2.LJIJJLI.getVideoEditViewModel().LLJ.observe(c19557811fULLLII2.LJII, new AObserverS231S0100000_29(c19557811fULLLII2, 20));
            c19557811fULLLII2.LJIJJLI.getVideoEditViewModel().LLJI.observe(c19557811fULLLII2.LJII, new AObserverS231S0100000_29(c19557811fULLLII2, 21));
            c19557811fULLLII2.LJIJJLI.getVideoEditViewModel().LLIZ.observe(c19557811fULLLII2.LJII, new AObserverS231S0100000_29(c19557811fULLLII2, 22));
            c19557811fULLLII2.LJIJJLI.getVideoEditViewModel().LLIZLLLIL.observe(c19557811fULLLII2.LJII, new AObserverS231S0100000_29(c19557811fULLLII2, 23));
            c19557811fULLLII2.LJIJJLI.getVideoEditViewModel().LLILLL.observe(c19557811fULLLII2.LJII, new AObserverS231S0100000_29(c19557811fULLLII2, 24));
            c19557811fULLLII2.LJIJJLI.getVideoEditViewModel().LLILZIL.observe(c19557811fULLLII2.LJII, new AObserverS231S0100000_29(c19557811fULLLII2, 25));
            c19557811fULLLII2.LJJIL.LIZIZ(iMo51if);
        }
        c19557811fULLLII2.LJIIIIZZ.setOnCursorSeekListener(new InterfaceC19560711fx() { // from class: X.11fd
            public VEEditor.VEState LIZ;

            @Override // X.InterfaceC19560711fx
            public final void LIZ(int i2, int i3, int i4) {
                C1452730nuJ c1452730nuJLIZLLL;
                C19557811fU c19557811fU = c19557811fULLLII2;
                if (c19557811fU.LJJI != null && i3 == 1) {
                    C19559511fl c19559511fl = c19557811fU.LJJIFFI;
                    long j = i2;
                    long jLIZ = c19559511fl.LIZ(j);
                    if (i4 == 1) {
                        this.LIZ = c19557811fULLLII2.LJJI.getState();
                        c1452730nuJLIZLLL = C1452730nuJ.LIZIZ(jLIZ);
                    } else if (i4 == 3) {
                        c1452730nuJLIZLLL = C1452730nuJ.LIZIZ(jLIZ);
                    } else if (i4 == 2) {
                        c1452730nuJLIZLLL = C1452730nuJ.LIZLLL(jLIZ);
                    } else {
                        throw new AssertionError();
                    }
                    c19557811fULLLII2.LIZLLL.setValue(c1452730nuJLIZLLL);
                    C19557811fU c19557811fU2 = c19557811fULLLII2;
                    C19559311fj c19559311fj = c19557811fU2.LJJIL;
                    c19559311fj.LIZIZ = jLIZ;
                    c19559311fj.LIZJ = j;
                    if (i4 == 2 && this.LIZ == VEEditor.VEState.STARTED) {
                        c19557811fU2.LJIIIZ();
                        this.LIZ = null;
                    }
                }
            }
        });
        c19557811fULLLII2.LJJIFFI = new C19559511fl(c19557811fULLLII2);
        ReplayLiveData<C0EYM> replayLiveDataLIZLLL = c19557811fULLLII2.LJJJJIZL.LIZLLL();
        c19557811fULLLII2.LIZJ = replayLiveDataLIZLLL;
        replayLiveDataLIZLLL.observe(c19557811fULLLII2.LJII, new AObserverS231S0100000_29(c19557811fULLLII2, 17));
        c19557811fULLLII2.LJFF = c19557811fULLLII2.LJJJJIZL.LJIIIZ();
        c19557811fULLLII2.LIZLLL = c19557811fULLLII2.LJJJJIZL.LJFF();
        c19557811fULLLII2.LIZLLL.observe(c19557811fULLLII2.LJII, new AObserverS231S0100000_29(c19557811fULLLII2, 16));
        StoredLiveData<C1452720nuI> storedLiveDataLJII = c19557811fULLLII2.LJJJJIZL.LJII();
        c19557811fULLLII2.LJ = storedLiveDataLJII;
        C1452720nuI value = storedLiveDataLJII.getValue();
        if (value != null) {
            String str = value.LL;
            str.getClass();
            switch (str.hashCode()) {
                case 49:
                    if (str.equals("1")) {
                        EffectPointModel effectPointModel = new EffectPointModel();
                        c19557811fULLLII2.LJJIJIL = effectPointModel;
                        effectPointModel.setType(2);
                        c19557811fULLLII2.LJJIJIL.setCategory("time");
                        c19557811fULLLII2.LJJIJIL.setStartPoint((int) value.LLILLJJLI);
                        c19557811fULLLII2.LJJIJIL.setEndPoint((int) value.LLILLL);
                        c19557811fULLLII2.LJJIJIL.setUiStartPoint((int) value.LLILLJJLI);
                        c19557811fULLLII2.LJJIJIL.setUiEndPoint((int) value.LLILLL);
                        c19557811fULLLII2.LJJIJIL.setKey(((EffectModel) ListProtector.get(C0F4X.LJ(), i)).key);
                        c19557811fULLLII2.LJJIJIL.setName(((EffectModel) ListProtector.get(C0F4X.LJ(), i)).name);
                    }
                    break;
                case BaseNotice.RECOMMEND_LIVE /* 50 */:
                    if (str.equals("2")) {
                        i = 2;
                        EffectPointModel effectPointModel2 = new EffectPointModel();
                        c19557811fULLLII2.LJJIJIL = effectPointModel2;
                        effectPointModel2.setType(2);
                        c19557811fULLLII2.LJJIJIL.setCategory("time");
                        c19557811fULLLII2.LJJIJIL.setStartPoint((int) value.LLILLJJLI);
                        c19557811fULLLII2.LJJIJIL.setEndPoint((int) value.LLILLL);
                        c19557811fULLLII2.LJJIJIL.setUiStartPoint((int) value.LLILLJJLI);
                        c19557811fULLLII2.LJJIJIL.setUiEndPoint((int) value.LLILLL);
                        c19557811fULLLII2.LJJIJIL.setKey(((EffectModel) ListProtector.get(C0F4X.LJ(), i)).key);
                        c19557811fULLLII2.LJJIJIL.setName(((EffectModel) ListProtector.get(C0F4X.LJ(), i)).name);
                    }
                    break;
                case 51:
                    if (str.equals("3")) {
                        i = 3;
                        EffectPointModel effectPointModel22 = new EffectPointModel();
                        c19557811fULLLII2.LJJIJIL = effectPointModel22;
                        effectPointModel22.setType(2);
                        c19557811fULLLII2.LJJIJIL.setCategory("time");
                        c19557811fULLLII2.LJJIJIL.setStartPoint((int) value.LLILLJJLI);
                        c19557811fULLLII2.LJJIJIL.setEndPoint((int) value.LLILLL);
                        c19557811fULLLII2.LJJIJIL.setUiStartPoint((int) value.LLILLJJLI);
                        c19557811fULLLII2.LJJIJIL.setUiEndPoint((int) value.LLILLL);
                        c19557811fULLLII2.LJJIJIL.setKey(((EffectModel) ListProtector.get(C0F4X.LJ(), i)).key);
                        c19557811fULLLII2.LJJIJIL.setName(((EffectModel) ListProtector.get(C0F4X.LJ(), i)).name);
                    }
                    break;
            }
        }
        c19557811fULLLII2.LJJJJI.xQ2().observe(c19557811fULLLII2.LJII, new AObserverS231S0100000_29(c19557811fULLLII2, 26));
        ((LiveData) c19557811fULLLII2.LJJJJI.LLJILLL.getValue()).observe(c19557811fULLLII2.LJII, new AObserverS231S0100000_29(c19557811fULLLII2, 13));
        c19557811fULLLII2.LJJJJIZL.LJIIIIZZ().observe(c19557811fULLLII2.LJII, new AObserverS231S0100000_29(c19557811fULLLII2, 15));
        c19557811fULLLII2.LJJJ = c19557811fULLLII2.LJJJJIZL.dt();
        c19557811fULLLII2.LJJJJI.zQ2().observe(c19557811fULLLII2.LJII, new AObserverS231S0100000_29(c19557811fULLLII2, 14));
        c19557811fULLLII2.LJIIIZ();
        LLLII().LJJJJI.DQ2().observe(this, new AObserverS231S0100000_29(this, 11));
        ((LiveData) LLLII().LJJJJI.LLJJ.getValue()).observe(this, new AObserverS231S0100000_29(this, 12));
        selectNonNullSubscribe((JediViewModel) this.LLJI.getValue(), new C2217381BqS() { // from class: X.11fn
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((FTCEditEffectState) obj).getSetVideoLength();
            }
        }, new C1765020w20(), new AwS643S0100000_29(this, 3));
        selectNonNullSubscribe((JediViewModel) this.LLJI.getValue(), new C2217381BqS() { // from class: X.11fo
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((FTCEditEffectState) obj).getRegenerateReverseVideo();
            }
        }, new C1765020w20(), new AwS643S0100000_29(this, 4));
        selectNonNullSubscribe((JediViewModel) this.LLJI.getValue(), new C2217381BqS() { // from class: X.11fp
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((FTCEditEffectState) obj).getRefreshCoverEvent();
            }
        }, new C1765020w20(), new AwS643S0100000_29(this, 5));
        selectNonNullSubscribe((JediViewModel) this.LLJI.getValue(), new C2217381BqS() { // from class: X.11fs
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((FTCEditEffectState) obj).getUpdateEffectTime();
            }
        }, new C1765020w20(), new AwS643S0100000_29(this, 2));
    }

    @Override // X.C11E9
    public final <VM1 extends JediViewModel<S1>, S1 extends C004I, R> R withState(VM1 vm1, Function1<? super S1, ? extends R> function1) {
        return function1.invoke(vm1.FQ2());
    }

    @Override // com.bytedance.scene.Scene
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.epy, viewGroup, false);
    }

    @Override // X.C11E9
    public final <S extends C004I> InterfaceC420801kM subscribe(JediViewModel<S> jediViewModel, C1765020w20<S> c1765020w20, Function2<? super InterfaceC960503pD, ? super S, Unit> function2) {
        return C11EA.LJIIJJI(this, jediViewModel, c1765020w20, function2);
    }

    @Override // X.InterfaceC1166920gTK
    public final <S extends C004I, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1765020w20<C11EC<A>> c1765020w20, Function2<? super InterfaceC1166920gTK, ? super A, Unit> function2) {
        C1170060gYO.LIZIZ(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }

    @Override // X.C11E9
    public final <S extends C004I, A> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1765020w20<C11EC<A>> c1765020w20, Function2<? super InterfaceC960503pD, ? super A, Unit> function2) {
        return C11EA.LJI(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }

    @Override // X.InterfaceC1166920gTK
    public final <S extends C004I, A> void subscribeEvent(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends C0LCS<? extends A>> interfaceC2217241BqE, C1765020w20<C11EC<C0LCS<A>>> c1765020w20, Function2<? super InterfaceC1166920gTK, ? super A, Unit> function2) {
        C1170060gYO.LIZLLL(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1765020w20<C11EF<A, B>> c1765020w20, InterfaceC1631620sYq<? super InterfaceC960503pD, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C11EA.LJFF(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, c1765020w20, interfaceC1631620sYq);
    }

    @Override // X.C11E9
    public final <S extends C004I, T> InterfaceC420801kM asyncSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends AbstractC1252750ihl<? extends T>> interfaceC2217241BqE, C1765020w20<C11EC<AbstractC1252750ihl<T>>> c1765020w20, Function2<? super InterfaceC960503pD, ? super Throwable, Unit> function2, Function1<? super InterfaceC960503pD, Unit> function1, Function2<? super InterfaceC960503pD, ? super T, Unit> function22) {
        return C11EA.LIZ(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2, function1, function22);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B, C> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1765020w20<C1634100scq<A, B, C>> c1765020w20, InterfaceC1631630sYr<? super InterfaceC960503pD, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C11EA.LJ(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1765020w20, interfaceC1631630sYr);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B, C, D> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1765020w20<C1644460stY<A, B, C, D>> c1765020w20, InterfaceC1685420txc<? super InterfaceC960503pD, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C11EA.LIZLLL(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1765020w20, interfaceC1685420txc);
    }
}
