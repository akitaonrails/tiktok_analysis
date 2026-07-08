package X;

import Y.ARunnableS131S0100000_31;
import Y.ARunnableS49S0110000_31;
import android.content.Context;
import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.choosemusic.fragment.ForYouMusicFragment;
import com.ss.android.ugc.aweme.choosemusic.fragment.HotMusicListFragment;
import com.ss.android.ugc.aweme.choosemusic.fragment.MusicClassDetailFragment;
import com.ss.android.ugc.aweme.choosemusic.fragment.UnlimitedMusicFragment;
import com.ss.android.ugc.aweme.choosemusic.view.ChooseMusicSelectView;
import com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.model.MusicCollectionItem;
import com.ss.android.ugc.aweme.performance.PerformanceMonitor;
import com.ss.android.ugc.aweme.performance.SelectMusicFromSelectCollectPageMonitor;
import com.ss.android.ugc.aweme.performance.SelectMusicFromSelectForYouPageMonitor;
import com.ss.android.ugc.aweme.performance.SelectMusicFromSelectLocalPageMonitor;
import com.ss.android.ugc.aweme.performance.SelectMusicFromSelectSecondPageMonitor;
import com.ss.android.ugc.aweme.performance.SelectMusicFromSelectUnlimitedPageMonitor;
import com.ss.android.ugc.aweme.services.ICreativeSAAService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: X.15Hl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20494715Hl extends AbstractC683590Qrd<C20448614zs> {
    public static final List<String> LLJLLIL = Arrays.asList("search_result_list_tag", "local_music_list", "local_music_list_edit", "local_music_list_shoot");
    public Fragment LL;
    public C15H0 LLILLJJLI;
    public final InterfaceC20494515Hj<C15HP> LLILLL;
    public Pair<Long, Long> LLILZ;
    public RecyclerView LLILZIL;
    public int LLILZLL;
    public String LLIZ;
    public C15HO LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public int LLJILJILJ;
    public boolean LLJILLL;
    public int LLJJ;
    public String LLJJI;
    public String LLJJIII;
    public C15HO LLJJIJI;
    public final EnumC20491915Gj LLJJIJIIJIL;
    public final int LLJJIJIL;
    public boolean LLJJJ;
    public final Set<Integer> LLJJJIL;
    public final Set<String> LLJJJJ;
    public C20491215Gc LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public boolean LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public final C20491415Ge LLJL;
    public final C20494815Hm LLJLIL;
    public final C20494015He LLJLILLLLZIIL;
    public final C15I1 LLJLL;

    public final void LLLIIIIL() {
        if (this.LLILZLL < 0) {
            this.LLIZ = null;
            return;
        }
        MediaPlayer mediaPlayerLIZ = C15I0.LIZ();
        int i = this.LLILZLL;
        if (i != -1) {
            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = this.LLILZIL.findViewHolderForAdapterPosition(i);
            if (viewHolderFindViewHolderForAdapterPosition instanceof C15IP) {
                ((C15IP) viewHolderFindViewHolderForAdapterPosition).a6(false, false, false);
            }
            int i2 = this.LLILZLL;
            this.LLILZLL = -1;
            this.LLIZ = null;
            if (viewHolderFindViewHolderForAdapterPosition == null) {
                notifyItemChanged(i2);
            }
        }
        if (mediaPlayerLIZ != null && mediaPlayerLIZ.isPlaying()) {
            mediaPlayerLIZ.pause();
        }
        C15H0 c15h0 = this.LLILLJJLI;
        if (c15h0 != null) {
            c15h0.p8(null);
        }
    }

    public final void LLLILZLLLI() {
        MusicModel musicModel;
        int i = -1;
        if (TextUtils.isEmpty(this.LLIZ) || C086I.LIZIZ(getData())) {
            this.LLILZLL = -1;
            return;
        }
        for (C20448614zs c20448614zs : getData()) {
            i++;
            if (c20448614zs != null && (musicModel = c20448614zs.LIZIZ) != null && TextUtils.equals(musicModel.getMusicId(), this.LLIZ)) {
                this.LLILZLL = i;
                return;
            }
        }
        this.LLILZLL = i;
    }

    @Override // X.AbstractC683510QrV
    public final void showLoadMoreEmpty() {
        super.showLoadMoreEmpty();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "video_shoot_page");
        C20684815ws.LJIILLIIL("music_search_feedback_show", c2344009Gk.LIZ);
    }

    public final C15HO LLLFZ(MusicModel musicModel) {
        boolean isPropOrChallenge;
        String str;
        String str2;
        if (musicModel != null) {
            isPropOrChallenge = musicModel.getIsPropOrChallenge();
        } else {
            isPropOrChallenge = false;
        }
        C15HO c15ho = this.LLIZLLLIL;
        if (this.LLJJIJI == null && (str2 = this.LLJJIII) != null && !str2.isEmpty()) {
            C15HO c15hoClone = this.LLIZLLLIL.clone();
            this.LLJJIJI = c15hoClone;
            c15hoClone.LJI = this.LLJJIII;
            c15hoClone.LIZIZ = "attached_song";
        }
        if (this.LLJJIJI == null && (str = this.LLJJI) != null && !str.isEmpty()) {
            C15HO c15hoClone2 = this.LLIZLLLIL.clone();
            this.LLJJIJI = c15hoClone2;
            c15hoClone2.LJFF = this.LLJJI;
            c15hoClone2.LIZIZ = "prop";
        }
        C15HO c15ho2 = this.LLJJIJI;
        if (c15ho2 != null && isPropOrChallenge) {
            return c15ho2;
        }
        return c15ho;
    }

    public final void LLLII(boolean z) {
        if (this.LLILZLL < 0) {
            return;
        }
        HandlerHook.viewPost(this.LLILZIL, new ARunnableS49S0110000_31(this, z, 3));
    }

    public final void LLLILZ(Pair<Integer, Float> pair) {
        if (pair != null) {
            int iIntValue = ((Integer) pair.first).intValue();
            float fFloatValue = ((Float) pair.second).floatValue();
            if (this.LLILZLL >= 0) {
                HandlerHook.viewPost(this.LLILZIL, new ARunnableS131S0100000_31(this, iIntValue, fFloatValue, 124));
            }
        }
    }

    @Override // X.AbstractC438050HFr
    public final int getBasicItemViewType(int i) {
        MusicModel musicModel;
        int i2 = ((C20448614zs) ListProtector.get(this.mmItems, i)).LIZ;
        if (i2 != -1) {
            if (i2 == 0) {
                List<T> list = this.mmItems;
                if (list != 0 && (musicModel = ((C20448614zs) ListProtector.get(list, i)).LIZIZ) != null) {
                    if (this.LLJJIJIIJIL == EnumC20491915Gj.COLLECT_MUSIC && musicModel.isOffline()) {
                        return 1102;
                    }
                    return 0;
                }
                return -100;
            }
            return i2;
        }
        return -100;
    }

    @Override // X.AbstractC683510QrV, X.AbstractC21673619ry
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.LLILZIL = recyclerView;
        registerAdapterDataObserver(this.LLJLL);
    }

    @Override // X.AbstractC683510QrV, X.AbstractC438050HFr
    public final RecyclerView.ViewHolder onCreateFooterViewHolder(ViewGroup viewGroup) {
        if (((ICommerceMediaService) ServiceManager.get().getService(ICommerceMediaService.class)).LJIIJ()) {
            this.mmLoadMoreState.LIZIZ = viewGroup.getContext().getText(2131829274);
            if (this.LLJJLIIIJLLLLLLLZ) {
                final View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.cxa, viewGroup, false);
                return new RecyclerView.ViewHolder(viewTd) { // from class: X.15I6
                };
            }
        }
        return super.onCreateFooterViewHolder(viewGroup);
    }

    @Override // X.AbstractC683510QrV, X.AbstractC21673619ry
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        unregisterAdapterDataObserver(this.LLJLL);
        this.LLILZIL = null;
    }

    @Override // X.AbstractC683510QrV, X.AbstractC21673619ry
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewAttachedToWindow(viewHolder);
        if ((viewHolder instanceof C15I3) && !this.LLJJL) {
            Fragment fragment = this.LL;
            if ((fragment instanceof UnlimitedMusicFragment) && ((UnlimitedMusicFragment) fragment).VR()) {
                C1411810mqJ.LIZIZ();
            } else {
                C1411810mqJ.LIZIZ.set(true);
            }
            this.LLJJL = true;
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [X.15I1] */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.15Ge] */
    public C20494715Hl(InterfaceC20494515Hj<C15HP> interfaceC20494515Hj, EnumC20491915Gj enumC20491915Gj) {
        this.LLILZ = new Pair<>(0, 0);
        this.LLILZLL = -1;
        this.LLJILJIL = true;
        this.LLJILLL = false;
        this.LLJJ = 0;
        this.LLJJIJI = null;
        this.LLJJIJIIJIL = EnumC20491915Gj.UNSET;
        this.LLJJIJIL = 0;
        this.LLJJJ = false;
        this.LLJJJIL = new HashSet();
        this.LLJJJJ = new HashSet();
        this.LLJJLIIIJLLLLLLLZ = false;
        this.LLJL = new InterfaceC1888280zEo() { // from class: X.15Ge
            @Override // X.InterfaceC1888280zEo
            public final void D4(MusicCollectionItem musicCollectionItem) {
                C20494715Hl c20494715Hl = this.LL;
                if (c20494715Hl.LLIZLLLIL != null && c20494715Hl.LLJJJJJIL != null) {
                    Fragment fragment = c20494715Hl.LL;
                    if ((fragment instanceof ForYouMusicFragment) && !((ForYouMusicFragment) fragment).VR()) {
                        this.LL.LLJJJJJIL.LIZLLL.add(musicCollectionItem);
                        return;
                    }
                    C20491215Gc c20491215Gc = this.LL.LLJJJJJIL;
                    String str = musicCollectionItem.mcId;
                    if (!c20491215Gc.LIZ.contains(str)) {
                        c20491215Gc.LIZ.add(str);
                        C15HO c15ho = this.LL.LLIZLLLIL;
                        C15IK.LJIILL(c15ho.LIZ, "", musicCollectionItem.mcId, musicCollectionItem.mcName, c15ho.LJIILIIL, c15ho.LJIILLIIL, "playlist");
                    }
                }
            }
        };
        this.LLJLIL = new C20494815Hm(this);
        this.LLJLILLLLZIIL = new C20494015He(this);
        this.LLJLL = new AbstractC471570IeR() { // from class: X.15I1
            @Override // X.AbstractC471570IeR
            public final void LIZ() {
                this.LIZ.LLLILZLLLI();
            }

            @Override // X.AbstractC471570IeR
            public final void LIZIZ(int i, int i2) {
                this.LIZ.LLLILZLLLI();
            }

            @Override // X.AbstractC471570IeR
            public final void LIZLLL(int i, int i2) {
                this.LIZ.LLLILZLLLI();
            }

            @Override // X.AbstractC471570IeR
            public final void LJ(int i, int i2) {
                this.LIZ.LLLILZLLLI();
            }

            @Override // X.AbstractC471570IeR
            public final void LJFF(int i, int i2) {
                this.LIZ.LLLILZLLLI();
            }
        };
        this.LLILLL = interfaceC20494515Hj;
        this.LLJJIJIIJIL = enumC20491915Gj;
    }

    public final void LLLI(final C15IP c15ip, MusicModel musicModel) {
        boolean z;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("mOldPlayingPosition == itemView.getPosition: ");
        if (this.LLILZLL == c15ip.getPosition()) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        ChooseMusicSelectView chooseMusicSelectView = C20494415Hi.LIZ;
        if (chooseMusicSelectView != null) {
            chooseMusicSelectView.LIZIZ();
        }
        if (musicModel.isUnreadableMusic()) {
            if (this.LLILLJJLI != null) {
                LLLIIIIL();
            }
            this.LLJILLL = false;
            return;
        }
        if (this.LLILZLL == c15ip.getPosition()) {
            if (this.LLILLJJLI != null) {
                LLLIIIIL();
            }
            this.LLJILLL = !this.LLJILLL;
            return;
        }
        if (this.LLILLJJLI == null) {
            return;
        }
        LLLIIIIL();
        this.LLILZLL = c15ip.getPosition();
        this.LLIZ = musicModel.getMusicId();
        if (musicModel.isLocalMusic()) {
            MediaPlayer mediaPlayerLIZ = C15I0.LIZ();
            try {
                C15IK.LJIIJ(this.LLIZLLLIL, musicModel, ((HashSet) this.LLJJJIL).contains(Integer.valueOf(c15ip.LLJLLIL)));
                mediaPlayerLIZ.reset();
                if (musicModel.getLocalPath().startsWith(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI.toString())) {
                    mediaPlayerLIZ.setDataSource(this.LLILZIL.getContext(), UriProtector.parse(musicModel.getLocalPath()));
                } else {
                    mediaPlayerLIZ.setDataSource(musicModel.getLocalPath());
                }
                mediaPlayerLIZ.setAudioStreamType(3);
                mediaPlayerLIZ.prepareAsync();
                mediaPlayerLIZ.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: X.15Hv
                    @Override // android.media.MediaPlayer.OnPreparedListener
                    public final void onPrepared(MediaPlayer mediaPlayer) {
                        C20494715Hl c20494715Hl = this.LL;
                        C15IP c15ip2 = c15ip;
                        c20494715Hl.getClass();
                        mediaPlayer.start();
                        c15ip2.a6(false, true, !c20494715Hl.LLJJJ);
                    }
                });
                mediaPlayerLIZ.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: X.15Hy
                    @Override // android.media.MediaPlayer.OnCompletionListener
                    public final void onCompletion(MediaPlayer mediaPlayer) {
                        this.LL.LLLIIIIL();
                    }
                });
                mediaPlayerLIZ.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: X.15Hz
                    @Override // android.media.MediaPlayer.OnErrorListener
                    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
                        if (C15I0.LIZ != null) {
                            C15I0.LIZ.release();
                            C15I0.LIZ = null;
                            return false;
                        }
                        return false;
                    }
                });
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        } else {
            this.LLILLJJLI.Dl0(new C15IZ() { // from class: X.15I5
                @Override // X.C15IZ
                public final void LIZ() {
                    this.LIZ.LLLII(false);
                }
            });
            this.LLILLJJLI.cJ(musicModel, LLLFZ(musicModel));
            C15IK.LIZLLL = c15ip.getPosition();
        }
        this.LLJILLL = true;
    }

    public final void LLLIILIL(C15IP c15ip, MusicModel musicModel) {
        PerformanceMonitor performanceMonitor;
        C15HO c15hoLLLFZ = LLLFZ(musicModel);
        if (musicModel == null && this.LL != null && c15hoLLLFZ != null) {
            return;
        }
        boolean z = true;
        if (this.LLJJIJIIJIL != EnumC20491915Gj.UNSET) {
            String musicId = musicModel.getMusicId();
            int i = C20492015Gk.LIZ[this.LLJJIJIIJIL.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                performanceMonitor = SelectMusicFromSelectUnlimitedPageMonitor.INSTANCE;
                            }
                        } else {
                            performanceMonitor = SelectMusicFromSelectForYouPageMonitor.INSTANCE;
                        }
                    } else {
                        performanceMonitor = SelectMusicFromSelectSecondPageMonitor.INSTANCE;
                    }
                } else {
                    performanceMonitor = SelectMusicFromSelectLocalPageMonitor.INSTANCE;
                    musicId = CardStruct.IStatusCode.DEFAULT;
                }
            } else {
                performanceMonitor = SelectMusicFromSelectCollectPageMonitor.INSTANCE;
            }
            ((IExternalService) ServiceManager.get().getService(IExternalService.class)).provideAVPerformance().start(performanceMonitor, "click music use");
            if (musicId != null) {
                HashMap<String, PerformanceMonitor> map = C0EM1.LIZ;
                map.clear();
                map.put(musicId, performanceMonitor);
            }
        }
        ICommerceMediaService iCommerceMediaService = (ICommerceMediaService) ServiceManager.get().getService(ICommerceMediaService.class);
        Fragment fragment = this.LL;
        boolean z2 = fragment instanceof HotMusicListFragment;
        if (!(fragment instanceof MusicClassDetailFragment) || !"click_more".equals(((MusicClassDetailFragment) fragment).LLJJJ)) {
            z = false;
        }
        musicModel.setFromSection(iCommerceMediaService.LJIIZILJ(musicModel, z2, z));
        MusicModel musicModelM317clone = musicModel.m317clone();
        C19EG activity = this.LL.getActivity();
        if (activity != null) {
            Scene currentScene = ((ICreativeSAAService) PluggableExtentionKt.pluggableSpi(ICreativeSAAService.class)).getCurrentScene(activity);
            if (currentScene != null) {
                ((ICommerceMediaService) PluggableExtentionKt.pluggableSpi(ICommerceMediaService.class)).LJIJJ(C1659670tI5.LIZ(currentScene), currentScene).mM2(this.LLILZLL);
            } else {
                ((ICommerceMediaService) PluggableExtentionKt.pluggableSpi(ICommerceMediaService.class)).LJIIIIZZ(activity).mM2(this.LLILZLL);
            }
        }
        if (this.LLILLJJLI != null) {
            musicModelM317clone.setEditFrom("");
            musicModelM317clone.setFromCollectionType(this.LLJJIJIL);
            this.LLILLJJLI.ru(musicModelM317clone);
            C15IK.LJIJ(c15hoLLLFZ, musicModelM317clone, c15ip.getLayoutPosition(), musicModelM317clone.getLogPb());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLIL(com.ss.android.ugc.aweme.shortvideo.model.MusicModel r13, int r14) {
        /*
            r12 = this;
            r4 = r13
            X.15HO r3 = r12.LLLFZ(r4)
            if (r4 == 0) goto L3f
            androidx.fragment.app.Fragment r1 = r12.LL
            boolean r0 = r1 instanceof com.ss.android.ugc.aweme.choosemusic.fragment.ForYouMusicFragment
            r5 = r14
            if (r0 == 0) goto L16
            com.ss.android.ugc.aweme.choosemusic.fragment.ForYouMusicFragment r1 = (com.ss.android.ugc.aweme.choosemusic.fragment.ForYouMusicFragment) r1
            boolean r0 = r1.VR()
            if (r0 == 0) goto L24
        L16:
            androidx.fragment.app.Fragment r1 = r12.LL
            boolean r0 = r1 instanceof com.ss.android.ugc.aweme.choosemusic.fragment.UnlimitedMusicFragment
            if (r0 == 0) goto L40
            com.ss.android.ugc.aweme.choosemusic.fragment.UnlimitedMusicFragment r1 = (com.ss.android.ugc.aweme.choosemusic.fragment.UnlimitedMusicFragment) r1
            boolean r0 = r1.VR()
            if (r0 != 0) goto L40
        L24:
            X.15Gc r0 = r12.LLJJJJJIL
            if (r0 == 0) goto L40
            java.util.Map<com.ss.android.ugc.aweme.shortvideo.model.MusicModel, java.lang.Integer> r1 = r0.LIZJ
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r1.put(r4, r0)
        L31:
            boolean r0 = r4.getNeedRecordConsumption()
            if (r0 == 0) goto L3f
            X.15Ic r0 = X.C20496415Ic.LIZ
            r0.getClass()
            X.C20496415Ic.LIZIZ(r4)
        L3f:
            return
        L40:
            X.15HY r1 = new X.15HY
            androidx.recyclerview.widget.RecyclerView r7 = r12.LLILZIL
            r10 = 0
            r6 = r1
            r8 = r4
            r9 = r5
            r11 = r3
            r6.<init>(r7, r8, r9, r10, r11)
            androidx.fragment.app.Fragment r2 = r12.LL
            boolean r6 = r12.LLJILJIL
            com.ss.android.ugc.aweme.music.model.MatchedPGCSoundInfo r0 = r4.getMatchedPGCSoundInfo()
            if (r0 == 0) goto L5d
            r7 = 1
        L57:
            X.15Gc r8 = r12.LLJJJJJIL
            X.C15IK.LJIIL(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L31
        L5d:
            r7 = 0
            goto L57
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20494715Hl.LLLIL(com.ss.android.ugc.aweme.shortvideo.model.MusicModel, int):void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:325:0x061a. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:212:0x03fa  */
    @Override // X.AbstractC438050HFr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindBasicViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r32, int r33) {
        /*
            Method dump skipped, instruction units count: 1748
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20494715Hl.onBindBasicViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    @Override // X.AbstractC438050HFr
    public final RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i) {
        boolean zLIZ;
        if (this.LLJI) {
            zLIZ = C1402480mbG.LIZ();
        } else {
            zLIZ = false;
        }
        if (i != 0) {
            if (i != 1001) {
                if (i != 1101) {
                    if (i != 1102) {
                        switch (i) {
                            case 861:
                                final View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.cwt, viewGroup, false);
                                return new RecyclerView.ViewHolder(viewTd) { // from class: X.15I8
                                };
                            case 862:
                                return new C20495615Hu(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.cwp, viewGroup, false));
                            case 863:
                                return new C15I4(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.cwq, viewGroup, false));
                            case 864:
                                return new C15I2(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.cxl, viewGroup, false));
                            case 865:
                                final View viewTd2 = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.cws, viewGroup, false);
                                RecyclerView.ViewHolder viewHolder = new RecyclerView.ViewHolder(viewTd2) { // from class: X.15I7
                                };
                                if (!C297750Bll.LIZ()) {
                                    return viewHolder;
                                }
                                ((TextView) viewHolder.itemView.findViewById(R.id.nny)).setText(2131825022);
                                return viewHolder;
                            case 866:
                                return new C20495915Hx(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.cwr, viewGroup, false));
                            default:
                                switch (i) {
                                    case 900:
                                        C15IP c15ip = new C15IP(this.LLJILJILJ, C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.cx5, viewGroup, false), zLIZ);
                                        c15ip.LLJJI.setPadding(0, C341940Daq.LIZ(8.0d), 0, 0);
                                        C20494015He c20494015He = this.LLJLILLLLZIIL;
                                        InterfaceC20494515Hj<C15HP> interfaceC20494515Hj = this.LLILLL;
                                        c15ip.LLLI = c20494015He;
                                        c15ip.LLLIL = interfaceC20494515Hj;
                                        c15ip.LLLL = this.LLJJJJLIIL;
                                        return c15ip;
                                    case 901:
                                        return new C20495015Ho(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.cxd, viewGroup, false));
                                    case 902:
                                        C1216200hko c1216200hko = new C1216200hko(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.cw3, viewGroup, false));
                                        c1216200hko.I5();
                                        return c1216200hko;
                                    case 903:
                                    case 905:
                                        C15IP c15ip2 = new C15IP(this.LLJILJILJ, C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.cx5, viewGroup, false), zLIZ);
                                        Context context = c15ip2.itemView.getContext();
                                        if (context != null) {
                                            ViewGroup viewGroup2 = c15ip2.LLJJI;
                                            C384050F3z c384050F3z = new C384050F3z();
                                            c384050F3z.LIZIZ = Integer.valueOf(R.attr.bs);
                                            viewGroup2.setBackground(c384050F3z.LIZ(context));
                                        }
                                        C20494015He c20494015He2 = this.LLJLILLLLZIIL;
                                        InterfaceC20494515Hj<C15HP> interfaceC20494515Hj2 = this.LLILLL;
                                        c15ip2.LLLI = c20494015He2;
                                        c15ip2.LLLIL = interfaceC20494515Hj2;
                                        c15ip2.LLLL = this.LLJJJJLIIL;
                                        return c15ip2;
                                    case 904:
                                        C1216200hko c1216200hko2 = new C1216200hko(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.cuy, viewGroup, false));
                                        c1216200hko2.I5();
                                        return c1216200hko2;
                                    default:
                                        return new C20495115Hp(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.cxb, viewGroup, false));
                                }
                        }
                    }
                    return new C20494915Hn(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.cxc, viewGroup, false));
                }
                final View viewTd3 = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.cv0, viewGroup, false);
                return new RecyclerView.ViewHolder(viewTd3) { // from class: X.15I8
                };
            }
            return new C15I3(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.cyx, viewGroup, false));
        }
        C15IP c15ip3 = new C15IP(this.LLJILJILJ, C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.cx5, viewGroup, false), zLIZ);
        C20494015He c20494015He3 = this.LLJLILLLLZIIL;
        InterfaceC20494515Hj<C15HP> interfaceC20494515Hj3 = this.LLILLL;
        c15ip3.LLLI = c20494015He3;
        c15ip3.LLLIL = interfaceC20494515Hj3;
        c15ip3.LLLL = this.LLJJJJLIIL;
        return c15ip3;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [X.15I1] */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.15Ge] */
    public C20494715Hl(InterfaceC20494515Hj interfaceC20494515Hj, int i, EnumC20491915Gj enumC20491915Gj) {
        this.LLILZ = new Pair<>(0, 0);
        this.LLILZLL = -1;
        this.LLJILJIL = true;
        this.LLJILLL = false;
        this.LLJJ = 0;
        this.LLJJIJI = null;
        this.LLJJIJIIJIL = EnumC20491915Gj.UNSET;
        this.LLJJIJIL = 0;
        this.LLJJJ = false;
        this.LLJJJIL = new HashSet();
        this.LLJJJJ = new HashSet();
        this.LLJJLIIIJLLLLLLLZ = false;
        this.LLJL = new InterfaceC1888280zEo() { // from class: X.15Ge
            @Override // X.InterfaceC1888280zEo
            public final void D4(MusicCollectionItem musicCollectionItem) {
                C20494715Hl c20494715Hl = this.LL;
                if (c20494715Hl.LLIZLLLIL != null && c20494715Hl.LLJJJJJIL != null) {
                    Fragment fragment = c20494715Hl.LL;
                    if ((fragment instanceof ForYouMusicFragment) && !((ForYouMusicFragment) fragment).VR()) {
                        this.LL.LLJJJJJIL.LIZLLL.add(musicCollectionItem);
                        return;
                    }
                    C20491215Gc c20491215Gc = this.LL.LLJJJJJIL;
                    String str = musicCollectionItem.mcId;
                    if (!c20491215Gc.LIZ.contains(str)) {
                        c20491215Gc.LIZ.add(str);
                        C15HO c15ho = this.LL.LLIZLLLIL;
                        C15IK.LJIILL(c15ho.LIZ, "", musicCollectionItem.mcId, musicCollectionItem.mcName, c15ho.LJIILIIL, c15ho.LJIILLIIL, "playlist");
                    }
                }
            }
        };
        this.LLJLIL = new C20494815Hm(this);
        this.LLJLILLLLZIIL = new C20494015He(this);
        this.LLJLL = new AbstractC471570IeR() { // from class: X.15I1
            @Override // X.AbstractC471570IeR
            public final void LIZ() {
                this.LIZ.LLLILZLLLI();
            }

            @Override // X.AbstractC471570IeR
            public final void LIZIZ(int i2, int i22) {
                this.LIZ.LLLILZLLLI();
            }

            @Override // X.AbstractC471570IeR
            public final void LIZLLL(int i2, int i22) {
                this.LIZ.LLLILZLLLI();
            }

            @Override // X.AbstractC471570IeR
            public final void LJ(int i2, int i22) {
                this.LIZ.LLLILZLLLI();
            }

            @Override // X.AbstractC471570IeR
            public final void LJFF(int i2, int i22) {
                this.LIZ.LLLILZLLLI();
            }
        };
        this.LLILLL = interfaceC20494515Hj;
        this.LLJJIJIL = i;
        this.LLJJIJIIJIL = enumC20491915Gj;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List list) {
        int i2;
        if (list.isEmpty()) {
            onBindBasicViewHolder(viewHolder, i);
            return;
        }
        MusicModel musicModel = ((C20448614zs) ListProtector.get(getData(), i)).LIZIZ;
        boolean zIsCollected = false;
        if (musicModel == null) {
            return;
        }
        if (musicModel.isRealMusicItem().booleanValue() && (viewHolder instanceof C15IP)) {
            if (!(ListProtector.get(list, 0) instanceof MusicModel.CollectionType)) {
                return;
            }
            C15IO c15io = (C15IO) viewHolder;
            if (ListProtector.get(list, 0) != null) {
                c15io.LLJJLIIIJLLLLLLLZ = c15io.LLJLILLLLZIIL.isCollected();
            }
            c15io.R5();
            return;
        }
        if (!musicModel.isRealMusicItem().booleanValue() || !(viewHolder instanceof C20494915Hn)) {
            return;
        }
        if (ListProtector.get(list, 0) instanceof MusicModel.CollectionType) {
            C20494915Hn c20494915Hn = (C20494915Hn) viewHolder;
            if (ListProtector.get(list, 0) != null) {
                MusicModel musicModel2 = c20494915Hn.LLJIJIL;
                if (musicModel2 != null) {
                    zIsCollected = musicModel2.isCollected();
                }
                c20494915Hn.LL = zIsCollected;
            }
            c20494915Hn.I5();
            return;
        }
        if (!(ListProtector.get(list, 0) instanceof MusicModel.SimilarMusicStatus)) {
            return;
        }
        Object obj = ListProtector.get(list, 0);
        TuxIconView tuxIconView = ((C20494915Hn) viewHolder).LLJI;
        if (tuxIconView == null) {
            return;
        }
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        if (obj == MusicModel.SimilarMusicStatus.UNFOLD) {
            i2 = R.raw.icon_chevron_up_fill;
        } else {
            i2 = R.raw.icon_chevron_down_fill;
        }
        c419910GdJ.LIZ = i2;
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1k);
        tuxIconView.setTuxIcon(c419910GdJ);
    }
}
