package X;

import Y.ACListenerS165S0100000_31;
import Y.AObserverS233S0100000_31;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LiveData;
import com.bytedance.scene.navigation.NavigationScene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.choosemusic.fragment.BaseChooseMusicFragment;
import com.ss.android.ugc.aweme.choosemusic.fragment.BaseNewMusicTabFragment;
import com.ss.android.ugc.aweme.choosemusic.fragment.ChooseMusicFragment;
import com.ss.android.ugc.aweme.choosemusic.fragment.NewMusicTabFragment;
import com.ss.android.ugc.aweme.choosemusic.model.ChooseMusicWithSceneViewModel;
import com.ss.android.ugc.aweme.choosemusic.model.MusicConsumptionInfo;
import com.ss.android.ugc.aweme.commerce.tools.mission.Mission;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.performance.OpenMusicPanelPerformanceMonitor;
import com.ss.android.ugc.aweme.services.ICreativeSAAService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.performance.IAVPerformance;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AwS0S6541000_31;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15Ie, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20496615Ie extends C19A3 implements InterfaceC484050IyZ, InterfaceC362610EJn {
    public final C01GW LLJILLL = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(354));
    public final C01GW LLJJ = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1344));
    public boolean LLJJI;
    public int LLJJIII;
    public boolean LLJJIJI;
    public RelativeLayout LLJJIJIIJIL;
    public RelativeLayout LLJJIJIL;
    public TuxTextView LLJJJ;
    public TuxTextView LLJJJIL;
    public C1911760zqg LLJJJJ;
    public ViewPagerBottomSheetBehavior<View> LLJJJJJIL;

    public final ChooseMusicWithSceneViewModel LLLLIL() {
        return (ChooseMusicWithSceneViewModel) this.LLJJ.getValue();
    }

    public final void LLLLIIIILLL() {
        if (LLLLIL().LLILLJJLI) {
            ChooseMusicWithSceneViewModel chooseMusicWithSceneViewModelLLLLIL = LLLLIL();
            Intent intent = new Intent();
            ((IExternalService) ServiceManager.get().getService(IExternalService.class)).publishService().setCurMusic(null, 0);
            intent.putExtra("is_cancel_current_choose_music", true);
            ((LiveData) chooseMusicWithSceneViewModelLLLLIL.LLILZLL.getValue()).setValue(new C20496915Ih(-1, intent));
        }
    }

    public final void LLLLIILL() {
        NavigationScene navigationSceneLIZ;
        if (Intrinsics.LJFF(LLLLIL().vQ2().getValue(), C20497715Ip.LIZ)) {
            ChooseMusicWithSceneViewModel chooseMusicWithSceneViewModelLLLLIL = LLLLIL();
            C20497415Im c20497415Im = C20497415Im.LIZ;
            chooseMusicWithSceneViewModelLLLLIL.vQ2().setValue(c20497415Im);
            TuxTextView tuxTextView = this.LLJJJIL;
            if (tuxTextView == null || tuxTextView.getVisibility() != 0) {
                TuxTextView tuxTextView2 = this.LLJJJ;
                if (tuxTextView2 == null) {
                    tuxTextView2 = null;
                }
                KeyboardUtils.LIZIZ(tuxTextView2);
            } else {
                KeyboardUtils.LIZIZ(this.LLJJJIL);
            }
            View view = this.mView;
            if (view != null) {
                view.setEnabled(false);
            }
            if (!Intrinsics.LJFF(LLLLIL().vQ2().getValue(), c20497415Im) || (navigationSceneLIZ = C1447800nmM.LIZ(this)) == null) {
                return;
            }
            navigationSceneLIZ.remove(this);
        }
    }

    @Override // com.bytedance.scene.Scene
    public final void onDestroy() {
        super.onDestroy();
        InterfaceC524950KiL interfaceC524950KiLLIZ = C0MWZ.LIZ(this);
        if (interfaceC524950KiLLIZ != null) {
            interfaceC524950KiLLIZ.T4(this);
            interfaceC524950KiLLIZ.b8(this);
        }
        ((IAVPerformance) this.LLJILLL.getValue()).leave(requireActivity(), "music_select");
    }

    @Override // com.bytedance.scene.Scene
    public final void onDestroyView() {
        BaseChooseMusicFragment baseChooseMusicFragment;
        BaseChooseMusicFragment baseChooseMusicFragment2;
        super.onDestroyView();
        FragmentManager supportFragmentManager = C1388190mED.LIZIZ(requireActivity()).getSupportFragmentManager();
        Fragment fragmentLJJJJZ = supportFragmentManager.LJJJJZ(R.id.iix);
        if ((fragmentLJJJJZ instanceof ChooseMusicFragment) && (baseChooseMusicFragment2 = (BaseChooseMusicFragment) fragmentLJJJJZ) != null) {
            NewMusicTabFragment newMusicTabFragment = baseChooseMusicFragment2.LLILZIL;
            FragmentManager childFragmentManager = newMusicTabFragment.getChildFragmentManager();
            C19EH c19ehLJIIJ = childFragmentManager.LJIIJ();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            String str = BaseNewMusicTabFragment.LLLILZLLLI;
            sbLIZ.append(str);
            sbLIZ.append('0');
            Fragment fragmentLJJJJZI = childFragmentManager.LJJJJZI(C2188811AlT.LIZIZ(sbLIZ));
            if (fragmentLJJJJZI != null) {
                c19ehLJIIJ.LJIIZILJ(fragmentLJJJJZI);
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str);
            sbLIZ2.append('1');
            Fragment fragmentLJJJJZI2 = childFragmentManager.LJJJJZI(C2188811AlT.LIZIZ(sbLIZ2));
            if (fragmentLJJJJZI2 != null) {
                c19ehLJIIJ.LJIIZILJ(fragmentLJJJJZI2);
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(str);
            sbLIZ3.append('2');
            Fragment fragmentLJJJJZI3 = childFragmentManager.LJJJJZI(C2188811AlT.LIZIZ(sbLIZ3));
            if (fragmentLJJJJZI3 != null) {
                c19ehLJIIJ.LJIIZILJ(fragmentLJJJJZI3);
            }
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append(str);
            sbLIZ4.append('3');
            Fragment fragmentLJJJJZI4 = childFragmentManager.LJJJJZI(C2188811AlT.LIZIZ(sbLIZ4));
            if (fragmentLJJJJZI4 != null) {
                c19ehLJIIJ.LJIIZILJ(fragmentLJJJJZI4);
            }
            c19ehLJIIJ.LJIIJ();
            C19EH c19ehLJIIJ2 = baseChooseMusicFragment2.getChildFragmentManager().LJIIJ();
            c19ehLJIIJ2.LJIIZILJ(newMusicTabFragment);
            c19ehLJIIJ2.LJIIJ();
            C19EH c19ehLJIIJ3 = supportFragmentManager.LJIIJ();
            c19ehLJIIJ3.LJIIZILJ(baseChooseMusicFragment2);
            c19ehLJIIJ3.LJIIJ();
            Fragment fragmentLJJJJZI5 = supportFragmentManager.LJJJJZI("voice_search_contaienr");
            if (fragmentLJJJJZI5 != null) {
                C19EH c19ehLJIIJ4 = supportFragmentManager.LJIIJ();
                c19ehLJIIJ4.LJIIZILJ(fragmentLJJJJZI5);
                c19ehLJIIJ4.LJIIJ();
            }
        }
        Mission mission = LLLLIL().LLILZ;
        String musicId = mission != null ? mission.getMusicId() : null;
        Fragment fragmentLJJJJZ2 = C1388190mED.LIZIZ(requireActivity()).getSupportFragmentManager().LJJJJZ(R.id.iix);
        MusicModel musicModel = (!(fragmentLJJJJZ2 instanceof ChooseMusicFragment) || (baseChooseMusicFragment = (BaseChooseMusicFragment) fragmentLJJJJZ2) == null) ? null : baseChooseMusicFragment.LLJJIII;
        if (!TextUtils.isEmpty(musicId)) {
            if (!TextUtils.equals(String.valueOf(musicModel != null ? Long.valueOf(musicModel.getId()) : null), musicId)) {
                new C11BY().LJIILLIIL(LLLLIL().LLILZ, 1);
                LLLLIL().LLILZ = null;
            }
        }
        ViewPagerBottomSheetBehavior<View> viewPagerBottomSheetBehavior = this.LLJJJJJIL;
        if (viewPagerBottomSheetBehavior == null) {
            viewPagerBottomSheetBehavior = null;
        }
        viewPagerBottomSheetBehavior.LJIILLIIL = null;
        C20496415Ic.LIZ.getClass();
        Type type = new TypeToken<ArrayList<MusicConsumptionInfo>>() { // from class: X.15Id
        }.getType();
        Object arrayList = new ArrayList();
        String strLJIILL = "";
        String string = C20496415Ic.LIZ().getString("music_pick_discover", "");
        if (!Intrinsics.LJFF(string, "")) {
            try {
                arrayList = C7740030o.LIZ().getGson().LJIIIIZZ(string, type);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C20496415Ic.LIZ().erase("music_pick_discover");
            }
        }
        ArrayList arrayList2 = (ArrayList) arrayList;
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
        }
        for (MusicConsumptionInfo musicConsumptionInfo : C20496415Ic.LIZIZ) {
            Iterator it2 = arrayList2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    arrayList2.add(musicConsumptionInfo);
                    break;
                }
                MusicConsumptionInfo musicConsumptionInfo2 = (MusicConsumptionInfo) it2.next();
                if (musicConsumptionInfo2.musicId == musicConsumptionInfo.musicId) {
                    musicConsumptionInfo2.consumptionTime = musicConsumptionInfo.consumptionTime;
                    break;
                }
            }
        }
        C20496415Ic.LIZIZ.clear();
        try {
            strLJIILL = C7740030o.LIZ().getGson().LJIILL(arrayList2);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        C20496415Ic.LIZ().storeString("music_pick_discover", strLJIILL);
    }

    @Override // com.bytedance.scene.Scene
    public final void onPause() {
        super.onPause();
        IAVPerformance iAVPerformance = (IAVPerformance) this.LLJILLL.getValue();
        Activity activityRequireActivity = requireActivity();
        Bundle bundle = this.mArguments;
        String string = bundle != null ? bundle.getString("creation_id") : null;
        Bundle bundle2 = this.mArguments;
        iAVPerformance.pause(activityRequireActivity, "music_select", string, bundle2 != null ? bundle2.getString("shoot_way") : null);
    }

    @Override // com.bytedance.scene.Scene
    public final void onResume() {
        super.onResume();
        if (this.LLJJIII == 2) {
            C15IK.LJIJI("video_shoot_page");
        } else {
            C15IK.LJIJI("video_edit_page");
        }
    }

    @Override // com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        Bundle bundle2;
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        boolean z;
        boolean z2;
        ViewTreeObserver viewTreeObserver;
        Bundle bundle3;
        final C20496615Ie c20496615Ie = this;
        super.onActivityCreated(bundle);
        Bundle bundle4 = c20496615Ie.mArguments;
        C1911760zqg c1911760zqg = null;
        if (bundle4 != null) {
            bundle2 = bundle4.getBundle("arguments");
        } else {
            bundle2 = null;
        }
        ((IAVPerformance) c20496615Ie.LLJILLL.getValue()).step(OpenMusicPanelPerformanceMonitor.INSTANCE, "choose_music_created");
        ((IAVPerformance) c20496615Ie.LLJILLL.getValue()).enter(c20496615Ie.requireActivity(), "music_select");
        TuxTextView tuxTextView = (TuxTextView) c20496615Ie.requireViewById(R.id.tv_title);
        Bundle bundle5 = c20496615Ie.mArguments;
        if (bundle5 != null) {
            string = bundle5.getString("title");
        } else {
            string = null;
        }
        tuxTextView.setText(string);
        tuxTextView.setTuxFont(33);
        c20496615Ie.LLJJJ = tuxTextView;
        TuxTextView tuxTextView2 = (TuxTextView) c20496615Ie.requireViewById(R.id.epx);
        Bundle bundle6 = c20496615Ie.mArguments;
        if (bundle6 != null) {
            string2 = bundle6.getString("title");
        } else {
            string2 = null;
        }
        tuxTextView2.setText(string2);
        tuxTextView2.setTuxFont(33);
        c20496615Ie.LLJJJIL = tuxTextView2;
        c20496615Ie.LLJJIJIIJIL = (RelativeLayout) c20496615Ie.requireViewById(R.id.y0_);
        c20496615Ie.LLJJIJIL = (RelativeLayout) c20496615Ie.requireViewById(R.id.epu);
        RelativeLayout relativeLayout = c20496615Ie.LLJJIJIIJIL;
        if (relativeLayout != null) {
            relativeLayout.setBackgroundResource(R.drawable.axs);
        }
        RelativeLayout relativeLayout2 = c20496615Ie.LLJJIJIL;
        if (relativeLayout2 != null) {
            relativeLayout2.setBackgroundResource(R.drawable.axs);
        }
        RelativeLayout relativeLayout3 = c20496615Ie.LLJJIJIL;
        if (relativeLayout3 != null) {
            C786410Ut5.LLIIL(relativeLayout3, 8);
        }
        RelativeLayout relativeLayout4 = c20496615Ie.LLJJIJIIJIL;
        if (relativeLayout4 != null) {
            C786410Ut5.LLIIL(relativeLayout4, 0);
        }
        ChooseMusicWithSceneViewModel chooseMusicWithSceneViewModelLLLLIL = c20496615Ie.LLLLIL();
        C19459111Bd c19459111Bd = Mission.Companion;
        if (bundle2 != null) {
            string3 = bundle2.getString("mission_music_id");
            string4 = bundle2.getString("enter_from");
            string5 = bundle2.getString("mission_id");
        } else {
            string3 = null;
            string4 = null;
            string5 = null;
        }
        c19459111Bd.getClass();
        chooseMusicWithSceneViewModelLLLLIL.LLILZ = C19459111Bd.LIZ(string3, string4, string5);
        c20496615Ie.LLJJJJ = new C1911760zqg(c20496615Ie.requireActivity(), c20496615Ie.mView, false);
        Bundle bundle7 = c20496615Ie.mArguments;
        if (bundle7 != null && bundle7.getBoolean("hide_local_music", false)) {
            z = true;
        } else {
            z = false;
        }
        c20496615Ie.LLJJI = z;
        Bundle bundle8 = c20496615Ie.mArguments;
        if (bundle8 != null && bundle8.getBoolean("long_video", false)) {
            z2 = true;
        } else {
            z2 = false;
        }
        c20496615Ie.LLJJIJI = z2;
        TextView textView = (TextView) c20496615Ie.requireViewById(R.id.tv_right_title);
        TextView textView2 = (TextView) c20496615Ie.requireViewById(R.id.epw);
        C786410Ut5.LLIL(textView, 8);
        C786410Ut5.LLIL(textView2, 8);
        C786410Ut5.I7(new ACListenerS165S0100000_31(c20496615Ie, 132), c20496615Ie.requireViewById(R.id.y6_));
        C786410Ut5.I7(new ACListenerS165S0100000_31(c20496615Ie, 133), c20496615Ie.requireViewById(R.id.epv));
        View viewRequireViewById = c20496615Ie.requireViewById(R.id.vr6);
        viewRequireViewById.setMinimumHeight(C497820Jfg.LIZJ(viewRequireViewById.getContext()));
        ViewPagerBottomSheetBehavior<View> viewPagerBottomSheetBehaviorLIZ = ViewPagerBottomSheetBehavior.LIZ(c20496615Ie.requireViewById(R.id.fpl));
        viewPagerBottomSheetBehaviorLIZ.LJIILLIIL = new AbstractC20497215Ik() { // from class: X.15If
            @Override // X.AbstractC20497215Ik
            public final void LIZ(float f) {
                C1911760zqg c1911760zqg2 = this.LIZ.LLJJJJ;
                if (c1911760zqg2 == null) {
                    c1911760zqg2 = null;
                }
                c1911760zqg2.LIZIZ(f);
            }

            @Override // X.AbstractC20497215Ik
            public final void LIZIZ(int i) {
                if (i == 5) {
                    TuxTextView tuxTextView3 = this.LIZ.LLJJJIL;
                    if (tuxTextView3 != null && tuxTextView3.getVisibility() == 0) {
                        KeyboardUtils.LIZIZ(this.LIZ.LLJJJIL);
                    } else {
                        TuxTextView tuxTextView4 = this.LIZ.LLJJJ;
                        if (tuxTextView4 == null) {
                            tuxTextView4 = null;
                        }
                        KeyboardUtils.LIZIZ(tuxTextView4);
                    }
                    this.LIZ.LLLLIIIILLL();
                    if (Intrinsics.LJFF(this.LIZ.LLLLIL().vQ2().getValue(), C20497715Ip.LIZ)) {
                        C20496615Ie c20496615Ie2 = this.LIZ;
                        c20496615Ie2.getClass();
                        NavigationScene navigationSceneLIZ = C1447800nmM.LIZ(c20496615Ie2);
                        if (navigationSceneLIZ != null) {
                            C560320LyI c560320LyI = new C560320LyI();
                            c560320LyI.LIZ = new C214798194i();
                            navigationSceneLIZ.LLLLLLIL(c560320LyI.LIZ());
                        }
                        ChooseMusicWithSceneViewModel chooseMusicWithSceneViewModelLLLLIL2 = this.LIZ.LLLLIL();
                        chooseMusicWithSceneViewModelLLLLIL2.vQ2().setValue(C20497615Io.LIZ);
                    }
                }
            }
        };
        viewPagerBottomSheetBehaviorLIZ.LJI = true;
        viewPagerBottomSheetBehaviorLIZ.setPeekHeight(C14KQ.LJ(c20496615Ie.requireActivity()) + C14KQ.LIZLLL(c20496615Ie.requireActivity()));
        c20496615Ie.LLJJJJJIL = viewPagerBottomSheetBehaviorLIZ;
        ChooseMusicWithSceneViewModel chooseMusicWithSceneViewModelLLLLIL2 = c20496615Ie.LLLLIL();
        ViewPagerBottomSheetBehavior<View> viewPagerBottomSheetBehavior = c20496615Ie.LLJJJJJIL;
        if (viewPagerBottomSheetBehavior == null) {
            viewPagerBottomSheetBehavior = null;
        }
        chooseMusicWithSceneViewModelLLLLIL2.LLILLL = viewPagerBottomSheetBehavior;
        FragmentManager supportFragmentManager = C1388190mED.LIZIZ(c20496615Ie.requireActivity()).getSupportFragmentManager();
        if (supportFragmentManager.LJJJJZ(R.id.iix) == null && (bundle3 = c20496615Ie.mArguments) != null) {
            int i = bundle3.getInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", 1);
            c20496615Ie.LLJJIII = i;
            if (i == 2) {
                C15IK.LJIJI("video_shoot_page");
            } else {
                C15IK.LJIJI("video_edit_page");
            }
            C15IK.LIZIZ = bundle3.getString("shoot_tab_name");
            C15IK.LJIILLIIL = bundle3.getBoolean("is_carousel");
            ((IExternalService) ServiceManager.get().getService(IExternalService.class)).publishService().setMusicChooseType(c20496615Ie.LLJJIII);
            String string6 = bundle3.getString("challenge");
            String string7 = bundle3.getString("creation_id");
            String string8 = bundle3.getString("shoot_way");
            String string9 = bundle3.getString("content_source");
            String string10 = bundle3.getString("content_type");
            MusicModel musicModel = (MusicModel) bundle3.getSerializable("music_model");
            boolean z3 = bundle3.getBoolean("music_allow_clear", false);
            boolean z4 = bundle3.getBoolean("music_allow_cut", false);
            boolean z5 = bundle3.getBoolean("music_is_photomv", false);
            String string11 = bundle3.getString("reuse_original_sound_id");
            UrlModel urlModel = (UrlModel) bundle3.getSerializable("reuse_original_sound_url");
            int i2 = bundle3.getInt("reuse_original_sound_length");
            boolean z6 = bundle3.getBoolean("is_mv_theme_music");
            Object objPluggableSpi$default = PluggableExtentionKt.pluggableSpi$default(ICreativeSAAService.class, false, false, false, 14, null);
            if (objPluggableSpi$default != null) {
                Bundle bundle9 = bundle2;
                ((ICreativeSAAService) objPluggableSpi$default).invokeMethodsSafely(c20496615Ie.requireActivity(), new AwS0S6541000_31(i2, bundle9, supportFragmentManager, urlModel, c20496615Ie, musicModel, string6, string8, string7, string11, string9, string10, z3, z5, z4, z6, 0));
                C1911760zqg c1911760zqg2 = c20496615Ie.LLJJJJ;
                if (c1911760zqg2 != null) {
                    c1911760zqg = c1911760zqg2;
                }
                c20496615Ie = c20496615Ie;
                c1911760zqg.LJIILL = new AwS0S6541000_31(i2, bundle9, supportFragmentManager, urlModel, c20496615Ie, musicModel, string6, string8, string7, string11, string9, string10, z3, z5, z4, z6, 1);
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        C1457560o26 c1457560o26 = C1457560o26.LIZ;
        int i3 = c20496615Ie.LLJJIII;
        c1457560o26.getClass();
        C1457560o26.LIZJ(i3, "music_choose_page");
        c20496615Ie.LLLLIL().LL = true;
        ((LiveData) c20496615Ie.LLLLIL().LLILZLL.getValue()).observe(c20496615Ie, new AObserverS233S0100000_31(c20496615Ie, 29));
        c20496615Ie.LLLLIL().wQ2().observe(c20496615Ie, new AObserverS233S0100000_31(c20496615Ie, 30));
        ((LiveData) c20496615Ie.LLLLIL().LLJ.getValue()).observe(c20496615Ie, new AObserverS233S0100000_31(c20496615Ie, 28));
        C16HL c16hl = new C16HL(c20496615Ie, 2);
        View view = c20496615Ie.mView;
        if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnPreDrawListener(c16hl);
            C2187701Ajg.LIZ(viewTreeObserver, c16hl, ViewTreeObserver.OnPreDrawListener.class);
        }
    }

    @Override // X.InterfaceC362610EJn
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        C19EG c19egLIZIZ;
        FragmentManager supportFragmentManager;
        List<Fragment> listLJJLIIIJL;
        Activity activity = this.mActivity;
        if (activity != null && (c19egLIZIZ = C1388190mED.LIZIZ(activity)) != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null && (listLJJLIIIJL = supportFragmentManager.LJJLIIIJL()) != null) {
            for (C128Y c128y : listLJJLIIIJL) {
                if (i == 24 || i == 25) {
                    C1457560o26.LIZIZ(this.LLJJIII, i, "music_choose_page");
                }
                if ((c128y instanceof InterfaceC362610EJn) && ((InterfaceC362610EJn) c128y).onKeyDown(i, keyEvent)) {
                    return true;
                }
            }
        }
        if (i == 4) {
            LLLLIIIILLL();
            if (Intrinsics.LJFF(LLLLIL().vQ2().getValue(), C20497715Ip.LIZ)) {
                LLLLIILL();
            }
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC484050IyZ
    public final boolean onActivityResult(int i, int i2, Intent intent) {
        C19EG c19egLIZIZ;
        FragmentManager supportFragmentManager;
        Fragment fragmentLJJJJZ;
        if (i2 != -1) {
            if (i2 == 101 && (c19egLIZIZ = C1388190mED.LIZIZ(requireActivity())) != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null && (fragmentLJJJJZ = supportFragmentManager.LJJJJZ(R.id.iix)) != null) {
                fragmentLJJJJZ.onActivityResult(i, i2, intent);
            }
        } else {
            View view = this.mView;
            if (view != null) {
                C786410Ut5.LJLLLLLL(8, view);
            }
            C20497015Ii c20497015Ii = (C20497015Ii) ((LiveData) LLLLIL().LLILZIL.getValue()).getValue();
            if (c20497015Ii != null) {
                NavigationScene navigationSceneLIZ = C1447800nmM.LIZ(this);
                if (navigationSceneLIZ != null) {
                    C560320LyI c560320LyI = new C560320LyI();
                    c560320LyI.LIZ = new C214798194i();
                    navigationSceneLIZ.LLLLLLIL(c560320LyI.LIZ());
                }
                c20497015Ii.LIZIZ.invoke(new C20496915Ih(i2, intent));
                c20497015Ii.LIZ.invoke();
                return true;
            }
        }
        return true;
    }

    @Override // X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        InterfaceC524950KiL interfaceC524950KiLLIZ = C0MWZ.LIZ(this);
        if (interfaceC524950KiLLIZ != null) {
            interfaceC524950KiLLIZ.Qh(this);
            interfaceC524950KiLLIZ.kF(this);
        }
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.en2, viewGroup, false);
    }

    @Override // X.C19A3, com.bytedance.scene.Scene
    public final /* bridge */ /* synthetic */ View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return onCreateView(layoutInflater, viewGroup, bundle);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.ss.android.ugc.aweme.choosemusic.fragment.ChooseMusicFragment LLLLILI(X.C20496615Ie r22, java.lang.String r23, com.ss.android.ugc.aweme.shortvideo.model.MusicModel r24, boolean r25, boolean r26, android.os.Bundle r27, java.lang.String r28, java.lang.String r29, boolean r30, java.lang.String r31, com.ss.android.ugc.aweme.base.model.UrlModel r32, int r33, boolean r34, java.lang.String r35, java.lang.String r36, boolean r37) {
        /*
            r2 = r22
            int r3 = r2.LLJJIII
            X.0CJ0 r6 = X.C0CJ0.BtnConfirm
            boolean r12 = r2.LLJJIJI
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.IAccountService> r0 = com.ss.android.ugc.aweme.IAccountService.class
            java.lang.Object r0 = r1.getService(r0)
            com.ss.android.ugc.aweme.IAccountService r0 = (com.ss.android.ugc.aweme.IAccountService) r0
            com.ss.android.ugc.aweme.AccountUserService r0 = r0.LJIIJ()
            boolean r0 = r0.LIZ()
            if (r0 != 0) goto L60
            boolean r0 = r2.LLJJI
            if (r0 != 0) goto L60
            X.0zqg r2 = r2.LLJJJJ
            if (r2 != 0) goto L27
            r2 = 0
        L27:
            com.bytedance.tux.icon.TuxIconView r0 = r2.LJIIJJI
            int r0 = r0.getVisibility()
            r1 = 8
            if (r0 != r1) goto L60
            com.bytedance.tux.icon.TuxIconView r0 = r2.LJIIL
            int r0 = r0.getVisibility()
            if (r0 != r1) goto L60
            r18 = 1
        L3b:
            java.lang.String r19 = ""
            r20 = r37
            r22 = r36
            r21 = r35
            r17 = r34
            r16 = r33
            r15 = r32
            r14 = r31
            r13 = r30
            r11 = r29
            r10 = r28
            r9 = r27
            r8 = r26
            r7 = r25
            r5 = r24
            r4 = r23
            com.ss.android.ugc.aweme.choosemusic.fragment.ChooseMusicFragment r0 = X.C15ID.LIZ(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return r0
        L60:
            r18 = 0
            goto L3b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20496615Ie.LLLLILI(X.15Ie, java.lang.String, com.ss.android.ugc.aweme.shortvideo.model.MusicModel, boolean, boolean, android.os.Bundle, java.lang.String, java.lang.String, boolean, java.lang.String, com.ss.android.ugc.aweme.base.model.UrlModel, int, boolean, java.lang.String, java.lang.String, boolean):com.ss.android.ugc.aweme.choosemusic.fragment.ChooseMusicFragment");
    }
}
