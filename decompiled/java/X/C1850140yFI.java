package X;

import Y.ARunnableS60S0300000_27;
import Y.AsS19S0300000_27;
import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.commercialize.media.impl.handler.detail.substitutemusic.v1.CommerceMusicSubstituteMusicVideoFragment;
import com.ss.android.ugc.aweme.commercialize.media.impl.handler.detail.substitutemusic.v2.CommerceMusicSubstituteMusicListFragment;
import com.ss.android.ugc.aweme.commercialize.media.impl.logging.CommerceMusicLogger;
import com.ss.android.ugc.aweme.commercialize.media.impl.utils.ScopedMusicPlayer;
import com.ss.android.ugc.aweme.commercialize.media.impl.viewmodel.RecommendMusicV2ViewModel;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS462S0200000_27;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS606S0100000_27;

/* JADX INFO: renamed from: X.0yFI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1850140yFI extends AbstractC1850220yFQ implements InterfaceC631090Op9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LJIILL;
    public C1850150yFJ LJIIL;
    public Long LJIILIIL;
    public final C1850250yFT LJ = new C1850250yFT(this.LIZ, Activity.class);
    public final C1850250yFT LJFF = new C1850250yFT(this.LIZ, InterfaceC1839000xxK.class);
    public final C1850290yFX LJI = new C1850290yFX(this.LIZ);
    public final C1850210yFP LJII = new C1850210yFP(LJ(), "from_banner_id");
    public final C1850210yFP LJIIIIZZ = new C1850210yFP(LJ(), "music_from");
    public final C1850210yFP LJIIIZ = new C1850210yFP(LJ(), "aweme_id");
    public final C1850210yFP LJIIJ = new C1850210yFP(LJ(), "commercial_music_section_view_stub");
    public final C1850300yFY LJIIJJI = new C1850300yFY(RecommendMusicV2ViewModel.class, new AwS571S0100000_27((AbstractC1850220yFQ) this, 1328));
    public final CommerceMusicLogger LJIILJJIL = new CommerceMusicLogger();

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1850140yFI.class, "activity", "getActivity()Landroid/app/Activity;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1850140yFI.class, "callback", "getCallback()Lcom/ss/android/ugc/aweme/commercialize/media/api/handler/detail/ICommerceMusicDetailCallback;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1850140yFI.class, "banUseMusicToastView", "getBanUseMusicToastView()Landroid/view/View;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C1850140yFI.class, "musicDetail", "getMusicDetail()Lcom/ss/android/ugc/aweme/music/model/MusicDetail;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C1850140yFI.class, "fromBannerId", "getFromBannerId()Ljava/lang/String;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C1850140yFI.class, "musicFrom", "getMusicFrom()Ljava/lang/String;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(C1850140yFI.class, "awemeId", "getAwemeId()Ljava/lang/String;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS8 = new C2217381BqS(C1850140yFI.class, "recommendMusicViewStub", "getRecommendMusicViewStub()Landroid/view/View;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS9 = new C2217381BqS(C1850140yFI.class, "recommendViewModelV2", "getRecommendViewModelV2()Lcom/ss/android/ugc/aweme/commercialize/media/impl/viewmodel/RecommendMusicV2ViewModel;", 0);
        c09r3.getClass();
        LJIILL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7, c2217381BqS8, c2217381BqS9};
    }

    @Override // X.InterfaceC631090Op9
    public final void LIZJ() {
        InterfaceC19744412Mw interfaceC19744412MwLIZ;
        String str = (String) this.LJIIIZ.LIZ(LJIILL[6]);
        if (str != null && (interfaceC19744412MwLIZ = C04PP.LIZ()) != null) {
            interfaceC19744412MwLIZ.LIZJ(str);
        }
        CommerceMusicLogger commerceMusicLogger = this.LJIILJJIL;
        C1850180yFM.LIZ.getClass();
        commerceMusicLogger.log(C1850180yFM.LJFF, new AwS606S0100000_27(this, 583));
    }

    @Override // X.InterfaceC631090Op9
    public final void LIZLLL() {
        C1850150yFJ c1850150yFJ = this.LJIIL;
        if (c1850150yFJ != null) {
            c1850150yFJ.LIZ();
        }
    }

    @Override // X.AbstractC1850220yFQ
    public final void LJII() {
        new AwS606S0100000_27(this, 584).invoke(this.LIZ);
        C15MA.LL.getClass();
        List<C15MF> list = C15MA.LLJILJIL;
        C1850210yFP c1850210yFP = this.LJII;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LJIILL;
        ((ArrayList) list).add(new C15MI((String) c1850210yFP.LIZ(interfaceC2217461BqaArr[4])));
        RecommendMusicV2ViewModel recommendMusicV2ViewModelLJIIJJI = LJIIJJI();
        Context context = (Context) this.LJ.LIZ(interfaceC2217461BqaArr[0]);
        LifecycleOwner lifecycleOwner = this.LIZIZ;
        if (lifecycleOwner == null) {
            lifecycleOwner = null;
        }
        InterfaceC1839000xxK interfaceC1839000xxKLJIIJ = LJIIJ();
        recommendMusicV2ViewModelLJIIJJI.LLILLL.setValue(new ScopedMusicPlayer(context, lifecycleOwner));
        recommendMusicV2ViewModelLJIIJJI.LL = interfaceC1839000xxKLJIIJ;
    }

    @Override // X.AbstractC1850220yFQ
    public final void LJIIIIZZ() {
        C15MA.LL.getClass();
        C19719612Di.LJJIJIIJI(C15MA.LLJILJIL);
        C15MA.LJI(null);
        C15MA.LJFF(null);
    }

    @Override // X.AbstractC1850220yFQ
    public final void LJIIIZ() {
        C1850150yFJ c1850150yFJ = this.LJIIL;
        if (c1850150yFJ != null) {
            c1850150yFJ.LIZ();
        }
    }

    public final InterfaceC1839000xxK LJIIJ() {
        return (InterfaceC1839000xxK) this.LJFF.LIZ(LJIILL[1]);
    }

    public final RecommendMusicV2ViewModel LJIIJJI() {
        C1850300yFY c1850300yFY = this.LJIIJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LJIILL;
        c1850300yFY.getClass();
        return (RecommendMusicV2ViewModel) new ViewModelProvider(c1850300yFY.LIZIZ.invoke()).get((Class) c1850300yFY.LIZ);
    }

    @Override // X.InterfaceC631090Op9
    public final void LIZIZ() {
        this.LJIILIIL = Long.valueOf(SystemClock.elapsedRealtime());
    }

    @Override // X.InterfaceC631090Op9
    public final Map<String, Object> LJFF(MusicModel musicModel) {
        if (!C19744212Mu.LIZLLL()) {
            return C2097608Jq.LJ();
        }
        CommerceMusicLogger commerceMusicLogger = this.LJIILJJIL;
        C1850180yFM.LIZ.getClass();
        return commerceMusicLogger.getParams(C1850180yFM.LJIILIIL.LIZIZ, new AwS606S0100000_27(musicModel, 582));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [V, java.lang.Object] */
    @Override // X.InterfaceC631090Op9
    public final void onLoadMusicDetailSuccess(MusicDetail musicDetail) throws C1850310yFZ {
        int i;
        int i2;
        List<Music> list;
        long jElapsedRealtime;
        if (musicDetail.isFromCache) {
            return;
        }
        EnumC1850160yFK enumC1850160yFKLIZ = C630880Ooo.LIZ(musicDetail);
        this.LJIILJJIL.withContext(musicDetail);
        CommerceMusicLogger commerceMusicLogger = this.LJIILJJIL;
        C1850190yFN.LIZ.getClass();
        commerceMusicLogger.withParam(C1850190yFN.LJIIJJI, enumC1850160yFKLIZ.getVersion());
        if (C19744212Mu.LIZLLL()) {
            CommerceMusicLogger commerceMusicLogger2 = this.LJIILJJIL;
            C1850180yFM.LIZ.getClass();
            commerceMusicLogger2.log(C1850180yFM.LIZIZ);
        }
        int i3 = C1850170yFL.LIZ[enumC1850160yFKLIZ.ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3 && i3 != 4 && i3 != 5) {
                    throw new C1954807lC();
                }
            } else {
                C15MA c15ma = C15MA.LL;
                C15MA.LJI(String.valueOf(musicDetail.suggestionId));
                C15M8 c15m8 = new C15M8();
                Long l = this.LJIILIIL;
                List<Music> list2 = musicDetail.recommendMusicList;
                if (list2 != null && !list2.isEmpty()) {
                    Pair<String, ? extends Object>[] pairArr = new Pair[1];
                    if (l != null) {
                        jElapsedRealtime = SystemClock.elapsedRealtime() - l.longValue();
                    } else {
                        jElapsedRealtime = -1;
                    }
                    pairArr[0] = new Pair<>("ttelite_BA_music_rec_module_load_time", Long.valueOf(jElapsedRealtime));
                    c15m8.LJI("ttelite_BA_music_rec_module_load_time", pairArr);
                }
                Long lValueOf = null;
                this.LJIILIIL = null;
                RecommendMusicV2ViewModel recommendMusicV2ViewModelLJIIJJI = LJIIJJI();
                recommendMusicV2ViewModelLJIIJJI.LLILLJJLI = musicDetail;
                if (musicDetail.showRecommendMusic && (list = musicDetail.recommendMusicList) != null && (!list.isEmpty())) {
                    C23250099c.LIZLLL(ViewModelKt.getViewModelScope(recommendMusicV2ViewModelLJIIJJI), null, null, new C1783770wWF(recommendMusicV2ViewModelLJIIJJI, musicDetail, null), 3);
                } else {
                    recommendMusicV2ViewModelLJIIJJI.LLILZIL.setValue(new C1006040cHq(C13BV.INSTANCE, "", false));
                }
                C1850150yFJ c1850150yFJ = new C1850150yFJ(this.LIZ);
                C1850210yFP c1850210yFP = this.LJIIJ;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LJIILL;
                View view = (View) c1850210yFP.LIZ(interfaceC2217461BqaArr[7]);
                final RecommendMusicV2ViewModel recommendMusicV2ViewModelLJIIJJI2 = LJIIJJI();
                if (view instanceof ViewStub) {
                    ViewStub viewStub = (ViewStub) view;
                    if (viewStub.getParent() != null) {
                        viewStub.setInflatedId(R.id.eil);
                        C1850240yFS c1850240yFS = c1850150yFJ.LIZJ;
                        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = C1850150yFJ.LJI;
                        if (c1850240yFS.LIZ(interfaceC2217461BqaArr2[1]) == null) {
                            i2 = 0;
                        } else {
                            viewStub.setLayoutResource(R.layout.aur);
                            View viewLJLLLL = C786410Ut5.LJLLLL(viewStub);
                            RecyclerView recyclerView = (RecyclerView) viewLJLLLL.findViewById(R.id.sxh);
                            final LifecycleOwner lifecycleOwner = (LifecycleOwner) c1850150yFJ.LIZLLL.LIZ(interfaceC2217461BqaArr2[2]);
                            recyclerView.setAdapter(new AbstractC21673619ry<C1839140xxY>(recommendMusicV2ViewModelLJIIJJI2, lifecycleOwner) { // from class: X.0iF4
                                public final RecommendMusicV2ViewModel LL;
                                public final LifecycleOwner LLILLJJLI;

                                @Override // X.AbstractC21673619ry
                                public final int getItemCount() {
                                    return ((C1006040cHq) C09IC.LIZIZ(this.LL.LLILZIL).getValue()).LIZ.size();
                                }

                                {
                                    this.LL = recommendMusicV2ViewModelLJIIJJI2;
                                    this.LLILLJJLI = lifecycleOwner;
                                }

                                @Override // X.AbstractC21673619ry
                                public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i4) {
                                    ((C1839140xxY) viewHolder).LLJILJIL.setValue(Integer.valueOf(i4));
                                }

                                @Override // X.AbstractC21673619ry
                                public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i4) {
                                    C1839140xxY c1839140xxY = new C1839140xxY(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.auq, viewGroup, false), this.LLILLJJLI);
                                    LifecycleOwnerKt.getLifecycleScope(c1839140xxY.LLILLJJLI).launchWhenStarted(new C1006010cHn(this.LL, c1839140xxY, null));
                                    try {
                                        View view2 = c1839140xxY.itemView;
                                        if (view2 != null) {
                                            view2.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
                                        }
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                    }
                                    c1839140xxY.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
                                    try {
                                        if (c1839140xxY.itemView.getParent() != null) {
                                            try {
                                                SettingsManager.LIZLLL().getClass();
                                            } catch (Exception e) {
                                                TryCatchGuardChecker.doCheck(e);
                                            }
                                            if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                                                StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                                                stringBuffer.append(C1839140xxY.class.getName());
                                                stringBuffer.append(" parent ");
                                                stringBuffer.append(viewGroup.getClass().getName());
                                                stringBuffer.append(" viewType ");
                                                stringBuffer.append(i4);
                                                C1AF0.LIZJ(stringBuffer.toString());
                                                ViewGroup viewGroup2 = (ViewGroup) c1839140xxY.itemView.getParent();
                                                if (viewGroup2 != null) {
                                                    C786410Ut5.LJJJLZIJ(c1839140xxY.itemView, viewGroup2);
                                                }
                                            }
                                        }
                                    } catch (Exception e2) {
                                        TryCatchGuardChecker.doCheck(e2);
                                        C2081408Dk.LIZ(e2);
                                        C2344809Gs.LIZ(e2);
                                    }
                                    C20612085q.LIZ = C1839140xxY.class.getName();
                                    return c1839140xxY;
                                }
                            });
                            recyclerView.setLayoutManager(new LinearLayoutManager(viewStub.getContext(), 0, false));
                            C19744212Mu c19744212Mu = C19744212Mu.LIZ;
                            C0DX2 c0dx2 = new C0DX2(10.0f, C786410Ut5.L3((Activity) c1850150yFJ.LIZIZ.LIZ(interfaceC2217461BqaArr2[0])));
                            c19744212Mu.getClass();
                            C19744212Mu.LJFF(recyclerView, c0dx2);
                            C786410Ut5.LLIZLLLIL(recyclerView, 0);
                            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
                            AwS462S0200000_27 awS462S0200000_27 = new AwS462S0200000_27(c1850150yFJ, recyclerView, 28);
                            ArrayList arrayList = new ArrayList();
                            C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS60S0300000_27(linearLayoutManager, arrayList, awS462S0200000_27, 17));
                            recyclerView.addOnScrollListener(new AsS19S0300000_27(linearLayoutManager, arrayList, awS462S0200000_27, 1));
                            new C20635915oz().LIZIZ(recyclerView);
                            lValueOf = null;
                            LifecycleOwnerKt.getLifecycleScope((LifecycleOwner) c1850150yFJ.LIZLLL.LIZ(interfaceC2217461BqaArr2[2])).launchWhenStarted(new C1006020cHo(recommendMusicV2ViewModelLJIIJJI2, (TextView) viewLJLLLL.findViewById(R.id.sy3), viewStub, null));
                            i2 = 0;
                        }
                        C786410Ut5.LLIIIJ(viewStub, i2);
                    }
                }
                this.LJIIL = c1850150yFJ;
                C15M8 c15m82 = new C15M8();
                Object objLIZ = this.LJIIIIZZ.LIZ(interfaceC2217461BqaArr[5]);
                c15m82.LJIIIIZZ(musicDetail);
                Pair<String, ? extends Object>[] pairArr2 = new Pair[3];
                Music music = musicDetail.music;
                if (music != null) {
                    lValueOf = Long.valueOf(music.getId());
                }
                pairArr2[0] = new Pair<>("meta_song_id", lValueOf);
                pairArr2[1] = new Pair<>("rec_candidate_clip_id", C1839150xxZ.LIZ);
                pairArr2[2] = new Pair<>("enter_from", objLIZ);
                c15m82.LJI("ttelite_BA_music_rec_show", pairArr2);
            }
        }
        if (!enumC1850160yFKLIZ.getEnableNormalUiElements()) {
            LJIIJ().u1();
        }
        C1850290yFX c1850290yFX = this.LJI;
        InterfaceC2217461Bqa<Object> interfaceC2217461Bqa = LJIILL[2];
        if (!c1850290yFX.LIZJ.getAndSet(true)) {
            Function0 function0 = (Function0) ((LinkedHashMap) c1850290yFX.LIZ.LIZIZ).get("cant_use_music_toast");
            if (function0 != null) {
                c1850290yFX.LIZIZ = function0.invoke();
            } else {
                throw new C1850310yFZ("cant_use_music_toast", interfaceC2217461Bqa.getName());
            }
        }
        View view2 = (View) c1850290yFX.LIZIZ;
        if (view2 != null) {
            if (enumC1850160yFKLIZ == EnumC1850160yFK.ONLY_COMMERCIAL_MUSIC_TEXT_VIEW) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, view2);
        }
    }

    @Override // X.InterfaceC631090Op9
    public final boolean LIZ(MusicDetail musicDetail, FragmentManager fragmentManager) {
        int i = C1850170yFL.LIZIZ[C630880Ooo.LIZ(musicDetail).getShootAction().ordinal()];
        if (i == 1) {
            return false;
        }
        if (i != 2) {
            if (i != 3) {
                if (i == 4) {
                    C1839010xxL c1839010xxL = CommerceMusicSubstituteMusicListFragment.LLILZIL;
                    C1838980xxI c1838980xxI = new C1838980xxI(musicDetail, this.LJIILJJIL, new C1850280yFW(LJIIJ()));
                    c1839010xxL.getClass();
                    C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
                    CommerceMusicSubstituteMusicListFragment commerceMusicSubstituteMusicListFragment = new CommerceMusicSubstituteMusicListFragment();
                    commerceMusicSubstituteMusicListFragment.LL = c1838980xxI;
                    TuxSheet tuxSheet = c1390920mIc.LIZ;
                    tuxSheet.LLJJIJI = commerceMusicSubstituteMusicListFragment;
                    tuxSheet.LLJLILLLLZIIL = false;
                    tuxSheet.show(fragmentManager, "substitute_music_list_sheet");
                } else {
                    throw new C1954807lC();
                }
            } else {
                C1838990xxJ c1838990xxJ = CommerceMusicSubstituteMusicVideoFragment.LLILZIL;
                C1838980xxI c1838980xxI2 = new C1838980xxI(musicDetail, this.LJIILJJIL, new C1850270yFV(LJIIJ()));
                c1838990xxJ.getClass();
                CommerceMusicSubstituteMusicVideoFragment commerceMusicSubstituteMusicVideoFragment = new CommerceMusicSubstituteMusicVideoFragment();
                commerceMusicSubstituteMusicVideoFragment.LL = c1838980xxI2;
                C1390920mIc c1390920mIc2 = new C1390920mIc(false, 0);
                c1390920mIc2.LIZ.LLJJIJI = commerceMusicSubstituteMusicVideoFragment;
                C0OM1 c0om1 = new C0OM1();
                C1251150ifB c1251150ifB = new C1251150ifB();
                c1251150ifB.LIZLLL();
                c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
                c1251150ifB.LIZJ(new AwS571S0100000_27(commerceMusicSubstituteMusicVideoFragment, 218));
                c0om1.LIZIZ(c1251150ifB);
                TuxSheet tuxSheet2 = c1390920mIc2.LIZ;
                tuxSheet2.LLJJIJIL = c0om1;
                tuxSheet2.LLJJJ = null;
                tuxSheet2.show(fragmentManager, "substitute_music_video_sheet");
            }
        }
        return true;
    }
}
