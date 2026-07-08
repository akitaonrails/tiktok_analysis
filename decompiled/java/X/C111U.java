package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bef.effectsdk.message.MessageCenter;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.NaviContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.navi.core.EffectDependencyLoader;
import com.ss.android.ugc.gamora.recorder.navi.model.ProfileNaviCandidate;
import com.ss.android.ugc.gamora.recorder.navi.model.ProfileNaviCandidatesResponse;
import com.ss.android.ugc.gamora.recorder.navi.model.ProfileNaviCustom;
import com.ss.android.ugc.gamora.recorder.navi.model.ProfileNaviFeature;
import com.ss.android.ugc.gamora.recorder.navi.model.ProfileNaviListResponse;
import com.ss.android.ugc.gamora.recorder.navi.model.ProfileNaviStaticImage;
import com.ss.android.ugc.gamora.recorder.navi.service.NaviVideoCreationService;
import com.ss.android.ugc.gamora.recorder.navi.view.NaviAvatarListViewModel;
import com.ss.android.ugc.gamora.recorder.navi.view.NaviAvatarListViewState;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.jvm.internal.AwS80S0210000_29;

/* JADX INFO: renamed from: X.111U, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C111U extends AbstractC21363818j6 {
    public final C19EG LLILLL;
    public final InterfaceC2254081DKk LLILZ;
    public final InterfaceC1635390sev LLILZIL;
    public final Function0<Unit> LLILZLL;
    public LinearLayout LLIZ;
    public final C111R LLIZLLLIL;
    public C1833080xnm LLJ;

    @Override // X.InterfaceC1159800gHq
    public final void LIZLLL(EnumC1155090gAF enumC1155090gAF) {
    }

    @Override // X.InterfaceC1159800gHq
    public final void LJI() {
    }

    @Override // X.InterfaceC1159800gHq
    public final void LJIIZILJ(EnumC1155090gAF enumC1155090gAF) {
    }

    @Override // X.InterfaceC21367218je
    public final void LIZJ() {
        C1295960jpS c1295960jpS;
        View view = this.LLILLJJLI;
        if ((view instanceof C1295960jpS) && (c1295960jpS = (C1295960jpS) view) != null) {
            c1295960jpS.cancelAnimation();
        }
        C111R c111r = this.LLIZLLLIL;
        int avatarCountSelf = ((NaviAvatarListViewState) c111r.LJI.hR2()).getAvatarCountSelf();
        int avatarCountCandidate = ((NaviAvatarListViewState) c111r.LJI.hR2()).getAvatarCountCandidate();
        String creationId = c111r.LIZLLL.getCreationId();
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", "tiktok_avatar_effect_intro_show");
        c0lab.LJ("enter_method", "click");
        c0lab.LJ("creation_id", creationId);
        c0lab.LJ("tiktok_avatar_flag", avatarCountSelf != 0 ? "1" : CardStruct.IStatusCode.DEFAULT);
        c0lab.LIZ(avatarCountSelf, "user_avatar_count");
        c0lab.LIZ(avatarCountCandidate, "candidate_avatar_count");
        C2341909Fp.LIZ("click_avatar_thumbnail", c0lab.LIZ);
    }

    @Override // X.InterfaceC1635880sfi
    public final void LJFF() {
        C1833080xnm c1833080xnm = this.LLJ;
        if (c1833080xnm != null) {
            C786410Ut5.f2(c1833080xnm, 8);
        }
    }

    @Override // X.InterfaceC1635880sfi
    public final void LJIIJ() {
        C1833080xnm c1833080xnm = this.LLJ;
        if (c1833080xnm != null) {
            C786410Ut5.f2(c1833080xnm, 0);
        }
    }

    @Override // X.InterfaceC21367218je
    public final void LJIIJJI() {
        C1295960jpS c1295960jpS;
        View view = this.LLILLJJLI;
        if (!(view instanceof C1295960jpS) || (c1295960jpS = (C1295960jpS) view) == null) {
            return;
        }
        c1295960jpS.playAnimation();
    }

    @Override // X.InterfaceC21367218je
    public final View LJIIL() {
        View view = this.LLILLJJLI;
        if (view != null) {
            return view;
        }
        C1295960jpS c1295960jpS = new C1295960jpS(this.LLILLL, null, 0);
        C786410Ut5.s6(c1295960jpS, new ViewGroup.LayoutParams(-1, -1));
        c1295960jpS.setAnimationFromUrl("https://p16-amd-va.tiktokcdn.com/obj/musically-maliva-obj/avatar_rotation.json");
        c1295960jpS.setRepeatCount(-1);
        this.LLILLJJLI = c1295960jpS;
        return c1295960jpS;
    }

    @Override // X.AbstractC1622390sJx
    public final void LJJIFFI() {
        C1833080xnm c1833080xnm = this.LLJ;
        if (c1833080xnm != null) {
            C786410Ut5.f2(c1833080xnm, 8);
        }
        C111R c111r = this.LLIZLLLIL;
        c111r.LJIIIZ = false;
        c111r.LIZLLL.naviContext = new NaviContext(0);
        C19426510zP c19426510zP = c111r.LJII;
        if (c19426510zP != null && !c19426510zP.LJI) {
            C11JF c11jf = c19426510zP.LJIIIZ;
            if (c11jf != null) {
                c11jf.dispose();
            }
            c19426510zP.LJIIIZ = null;
            EffectDependencyLoader effectDependencyLoader = c19426510zP.LJFF;
            if (effectDependencyLoader != null) {
                effectDependencyLoader.LLILZIL = true;
                MessageCenter.removeListener(effectDependencyLoader);
                ((LinkedHashMap) effectDependencyLoader.LLILZ).clear();
                effectDependencyLoader.LLILLL.clear();
            }
            c19426510zP.LJI = true;
        }
        c111r.LJII = null;
        InterfaceC420801kM interfaceC420801kM = c111r.LJIIIIZZ;
        if (interfaceC420801kM != null) {
            interfaceC420801kM.dispose();
        }
        c111r.LJIIIIZZ = null;
        C20672087y c20672087y = c111r.LJIILJJIL;
        if (c20672087y != null) {
            MessageCenter.removeListener(c20672087y);
        }
    }

    @Override // X.InterfaceC1635880sfi
    public final boolean LJJII() {
        C1833080xnm c1833080xnm = this.LLJ;
        return c1833080xnm != null && c1833080xnm.getVisibility() == 0;
    }

    public final C1833080xnm LJJIIJ() {
        if (this.LLJ == null) {
            C1833080xnm c1833080xnm = new C1833080xnm(this.LLILLL);
            c1833080xnm.LLIZ = this.LLIZLLLIL;
            C786410Ut5.f2(c1833080xnm, 8);
            this.LLJ = c1833080xnm;
        }
        return this.LLJ;
    }

    @Override // X.InterfaceC21367218je
    public final View LJIJ() {
        return this.LLJ;
    }

    @Override // X.InterfaceC1159800gHq
    public final void LJIIIZ(View view) {
        this.LLIZ = (LinearLayout) view.findViewById(R.id.f760net);
        view.findViewById(R.id.w4h);
        LinearLayout linearLayout = this.LLIZ;
        if (linearLayout != null) {
            linearLayout.addView(LJJIIJ());
        }
    }

    @Override // X.AbstractC1622390sJx
    public final boolean LJJI(C1627370sRz c1627370sRz) {
        return C1624570sNT.LJIIIZ(c1627370sRz.LIZ);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [X.10zh] */
    @Override // X.AbstractC1622390sJx
    public final void LJJIII(C1623370sLX c1623370sLX, C1627370sRz c1627370sRz) {
        C786410Ut5.f2(LJJIIJ(), 0);
        C111R c111r = this.LLIZLLLIL;
        Effect effect = c1627370sRz.LIZ;
        c111r.getClass();
        C1446130njf.LIZ.getClass();
        c111r.LJIIJ = C1446130njf.LJIILJJIL(effect, "has_avatar_head", true);
        final NaviAvatarListViewModel naviAvatarListViewModel = c111r.LJI;
        final NaviAvatarListViewState naviAvatarListViewState = (NaviAvatarListViewState) naviAvatarListViewModel.hR2();
        final List<C111S> avatarList = naviAvatarListViewState.getAvatarList();
        final boolean zIsEditDone = naviAvatarListViewState.isEditDone();
        naviAvatarListViewModel.setStateImmediate(AFwS273S0000000_29.get$arr$(375));
        final C087L c087l = naviAvatarListViewModel.LLILZIL;
        NaviVideoCreationService naviVideoCreationService = c087l.LIZ;
        int iLIZ = C306800C0w.LIZ();
        String str = C087K.LIZ;
        C11NZ.LJLLILLLL(naviVideoCreationService.getNaviList(0, iLIZ, str), c087l.LIZ.getCandidateList(true, 1, str), new InterfaceC500500Jk0() { // from class: X.111T
            @Override // X.InterfaceC500500Jk0
            public final Object apply(Object obj, Object obj2) {
                ProfileNaviStaticImage profileNaviStaticImage;
                ProfileNaviCandidatesResponse profileNaviCandidatesResponse = (ProfileNaviCandidatesResponse) obj2;
                List<ProfileNaviCustom> list = ((ProfileNaviListResponse) obj).naviList;
                if (list == null) {
                    list = C13BV.INSTANCE;
                }
                C087L c087l2 = c087l;
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                for (ProfileNaviCustom profileNaviCustom : list) {
                    c087l2.getClass();
                    String str2 = profileNaviCustom.naviId;
                    List<ProfileNaviFeature> list2 = profileNaviCustom.features;
                    List<ProfileNaviStaticImage> list3 = profileNaviCustom.staticImage;
                    if (list3 != null) {
                        profileNaviStaticImage = (ProfileNaviStaticImage) ListProtector.get(list3, 0);
                    } else {
                        profileNaviStaticImage = null;
                    }
                    arrayList.add(new C111S(str2, null, list2, profileNaviStaticImage, 2));
                }
                List<ProfileNaviCandidate> list4 = profileNaviCandidatesResponse.initialNavis;
                if (list4 == null) {
                    list4 = C13BV.INSTANCE;
                }
                C087L c087l3 = c087l;
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list4, 10));
                for (ProfileNaviCandidate profileNaviCandidate : list4) {
                    c087l3.getClass();
                    arrayList2.add(new C111S(null, profileNaviCandidate.starterNaviId, profileNaviCandidate.features, profileNaviCandidate.staticImage, 1));
                }
                return C13LP.LJLIL(arrayList2, arrayList);
            }
        }).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C09JN() { // from class: X.111V
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("NaviAvatarListViewModel@3c63.fetchAvatars$disposable$1");
                List list = (List) obj;
                if (avatarList == null || list.size() != avatarList.size() || zIsEditDone) {
                    naviAvatarListViewModel.setState(new AwS80S0210000_29(zIsEditDone, (boolean) naviAvatarListViewState, (NaviAvatarListViewState) list, (List<C111S>) 4));
                }
                C1C7U.LIZIZ("NaviAvatarListViewModel@3c63.fetchAvatars$disposable$1");
            }
        }, new C09JN() { // from class: X.00PZ
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("NaviAvatarListViewModel@3c63.fetchAvatars$disposable$2");
                C1C7U.LIZIZ("NaviAvatarListViewModel@3c63.fetchAvatars$disposable$2");
            }
        });
        if (c111r.LJIIIIZZ == null) {
            c111r.LJIIIIZZ = c111r.LJI.jR2(c111r.LJFF, new C2217381BqS() { // from class: X.0xnq
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((NaviAvatarListViewState) obj).getAvatarList();
                }
            }, new C1765020w20(), new AwS608S0100000_29(c111r, 733));
        }
        C20672087y c20672087y = new C20672087y();
        c111r.LJIILJJIL = c20672087y;
        MessageCenter.addListener(c20672087y);
        final InterfaceC2254081DKk interfaceC2254081DKk = c111r.LIZIZ;
        C087I c087i = new C087I(c111r.LIZJ, new InterfaceC2032907xn(interfaceC2254081DKk) { // from class: X.10zh
            public final InterfaceC2254081DKk LIZ;

            {
                this.LIZ = interfaceC2254081DKk;
            }

            @Override // X.InterfaceC2032907xn
            public final void LIZ(int i, long j, long j2, String str2) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("sendMessage msgID=");
                sbLIZ.append(i);
                sbLIZ.append(", arg1=");
                sbLIZ.append(j);
                sbLIZ.append(", arg2=");
                sbLIZ.append(j2);
                sbLIZ.append(", msg=");
                sbLIZ.append(str2);
                C201955140j.LIZIZ("JEFF", C2188811AlT.LIZIZ(sbLIZ));
                this.LIZ.sendEffectMsg(i, j, j2, str2);
            }
        }, c111r.LJIILJJIL);
        c087i.LLILLL.Kq(c087i);
        c087i.LLILZIL = new C11NJ();
    }

    public C111U(C19GS c19gs, InterfaceC2254081DKk interfaceC2254081DKk, InterfaceC1635390sev interfaceC1635390sev, ShortVideoContext shortVideoContext, Function0 function0, LifecycleOwner lifecycleOwner) {
        this.LLILLL = c19gs;
        this.LLILZ = interfaceC2254081DKk;
        this.LLILZIL = interfaceC1635390sev;
        this.LLILZLL = function0;
        this.LLIZLLLIL = new C111R(c19gs, interfaceC2254081DKk, interfaceC1635390sev, shortVideoContext, function0, lifecycleOwner);
    }
}
