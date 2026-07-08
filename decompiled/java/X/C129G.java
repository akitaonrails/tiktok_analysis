package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.VideoMusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.VideoSectionModel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tools.music.music.vertical.player.VideoPlayerComponent;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.129G, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public class C129G extends AbstractC683590Qrd<MusicModel> implements InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public final C1DRG LL;
    public final AnonymousClass1297 LLILLJJLI;
    public final InterfaceC1455230nyL LLILLL;
    public final C129C LLILZ;
    public final boolean LLILZIL;
    public final boolean LLILZLL;
    public final C1664740tQG LLIZ;
    public int LLIZLLLIL;
    public final int LLJ;
    public boolean LLJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C129G.class, "videoPlayerComponent", "getVideoPlayerComponent()Lcom/ss/android/ugc/aweme/tools/music/music/vertical/player/VideoPlayerComponent;", 0);
        C13LE.LIZ.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public final AVMusic LLLFZ() {
        Function0<AVMusic> function0 = this.LLILZ.LIZIZ;
        return function0 != null ? function0.invoke() : MusicBeanUtilKt.extractAVMusic(this.LLILLL.LIZIZ());
    }

    public final void LLLILZ() {
        Object next;
        List<T> list;
        Integer numValueOf;
        Integer numValueOf2;
        AVMusic aVMusicLLLFZ = LLLFZ();
        if (aVMusicLLLFZ != null) {
            MusicModel musicModelLIZ = C389120FNm.LIZ(aVMusicLLLFZ);
            List<T> list2 = this.mmItems;
            if (list2 != 0) {
                Iterator it2 = list2.iterator();
                do {
                    next = null;
                    if (!it2.hasNext()) {
                        break;
                    } else {
                        next = it2.next();
                    }
                } while (!Intrinsics.LJFF(((MusicModel) next).getMusicId(), musicModelLIZ.getMusicId()));
                MusicModel musicModel = (MusicModel) next;
                if (musicModel != null) {
                    if (!C1419800n3C.LIZJ(musicModel, musicModelLIZ)) {
                        List<MusicModel> smartExtendMusicList = musicModelLIZ.getSmartExtendMusicList();
                        if (smartExtendMusicList != null && !smartExtendMusicList.isEmpty()) {
                            musicModel.setSmartExtendMusicList(musicModelLIZ.getSmartExtendMusicList());
                        }
                        musicModel.setSmartExtended(musicModelLIZ.isSmartExtended());
                        List<T> list3 = this.mmItems;
                        if (list3 != 0 && (numValueOf2 = Integer.valueOf(list3.indexOf(musicModel))) != null && numValueOf2.intValue() >= 0) {
                            notifyItemChanged(numValueOf2.intValue());
                        }
                    }
                    C129C c129c = this.LLILZ;
                    if (!c129c.LIZLLL || c129c.LJFF || !musicModel.hasLyricsCopyRight() || (list = this.mmItems) == 0 || (numValueOf = Integer.valueOf(list.indexOf(musicModel))) == null || numValueOf.intValue() < 0) {
                        return;
                    }
                    notifyItemChanged(numValueOf.intValue());
                }
            }
        }
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LL;
    }

    public boolean LLLI(MusicModel musicModel) {
        return LLLII(musicModel, LLLFZ());
    }

    public final void LLLIIIIL(String str) {
        List<MusicModel> data;
        if (str != null && (data = getData()) != null) {
            Iterator<MusicModel> it2 = data.iterator();
            int i = 0;
            while (it2.hasNext()) {
                if (Intrinsics.LJFF(str, it2.next().getMusicId())) {
                    if (i >= 0) {
                        notifyItemChanged(i);
                        return;
                    }
                    return;
                }
                i++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLIILIL(int r2) {
        /*
            r1 = this;
            boolean r0 = r1.LLILZLL
            if (r0 == 0) goto L24
            int r0 = r1.LLIZLLLIL
            r1.LLIZLLLIL = r2
            if (r0 < 0) goto Lf
            if (r0 == r2) goto L20
            r1.notifyItemChanged(r0)
        Lf:
            if (r2 >= 0) goto L20
            java.util.List r0 = r1.getData()
            if (r0 != 0) goto L1c
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L1c:
            X.C129I.LIZ(r1, r0)
            return
        L20:
            r1.notifyItemChanged(r2)
            return
        L24:
            r1.LLIZLLLIL = r2
            java.util.List<T> r0 = r1.mmItems
            boolean r0 = X.C2401009ay.LIZ(r0)
            if (r0 != 0) goto L31
            r1.notifyDataSetChanged()
        L31:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C129G.LLLIILIL(int):void");
    }

    public final void LLLIL(InterfaceC19413110xF interfaceC19413110xF) {
        setLoadMoreListener(new AwS573S0100000_29(interfaceC19413110xF, 899));
    }

    @Override // X.AbstractC438050HFr
    public final int getBasicItemViewType(int i) {
        MusicModel musicModel;
        List<MusicModel> smartExtendMusicList;
        List<T> list = this.mmItems;
        if (list != 0) {
            musicModel = (MusicModel) C13LP.LJJJLZIJ(i, list);
        } else {
            musicModel = null;
        }
        if (musicModel instanceof VideoSectionModel) {
            return 12;
        }
        if (musicModel instanceof VideoMusicModel) {
            return 11;
        }
        if (musicModel instanceof C129P) {
            return 6;
        }
        if (musicModel != null) {
            if (this.LLJI && (smartExtendMusicList = musicModel.getSmartExtendMusicList()) != null && !smartExtendMusicList.isEmpty()) {
                return 4;
            }
            if (musicModel != null) {
                if (musicModel.getMusicType() == 7) {
                    return 5;
                }
                if (musicModel.getUiType() == 1) {
                    return 7;
                }
            }
        }
        if (this.LLILZIL && musicModel != null && musicModel.isOffline()) {
            return 9;
        }
        if (this.LLILZIL && musicModel != null && musicModel.isSimilarMusic()) {
            return 10;
        }
        return 0;
    }

    @Override // X.AbstractC21673619ry
    public final long getItemId(int i) {
        MusicModel musicModel;
        List<T> list = this.mmItems;
        if (list != 0 && (musicModel = (MusicModel) C13LP.LJJJLZIJ(i, list)) != null) {
            return musicModel.getId();
        }
        return super.getItemId(i);
    }

    @Override // X.AbstractC683510QrV, X.AbstractC21673619ry
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    public static boolean LLLII(MusicModel musicModel, AVMusic aVMusic) {
        if (musicModel == null || aVMusic == null || aVMusic.isMultiMusicFromTemplate() != musicModel.isMultiMusicFromTemplate()) {
            return false;
        }
        return Intrinsics.LJFF(aVMusic.getMusicId(), musicModel.getMusicId());
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x051d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0103  */
    @Override // X.AbstractC438050HFr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onBindBasicViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r21, int r22) {
        /*
            Method dump skipped, instruction units count: 1508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C129G.onBindBasicViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    @Override // X.AbstractC438050HFr
    public RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i) {
        switch (i) {
            case 4:
                return new AnonymousClass1295(this.LLILZ, C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.i7v, viewGroup, false), this.LLILLJJLI, C1402480mbG.LIZ());
            case 5:
            case 8:
            default:
                return new AnonymousClass1298(this.LLILZ, C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.i7p, viewGroup, false), this.LLILLJJLI, C1402480mbG.LIZ(), 0, 32);
            case 6:
                return new C129M(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.i65, viewGroup, false));
            case 7:
                final C129C c129c = this.LLILZ;
                final View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.i7u, viewGroup, false);
                final AnonymousClass1297 anonymousClass1297 = this.LLILLJJLI;
                final boolean zLIZ = C1402480mbG.LIZ();
                return new AnonymousClass1298(c129c, viewTd, anonymousClass1297, zLIZ) { // from class: X.1292
                    public final TuxTextView LLJLL;
                    public final TuxIconView LLJLLIL;

                    @Override // X.AnonymousClass1298
                    public final float P5() {
                        return 100.0f;
                    }

                    {
                        TuxTextView tuxTextView = (TuxTextView) AnonymousClass1293.LIZ(R.id.tv_rank, viewTd);
                        this.LLJLL = tuxTextView;
                        this.LLJLLIL = (TuxIconView) AnonymousClass1293.LIZ(R.id.lp3, viewTd);
                        tuxTextView.setTypeface(C1697580uHE.LIZIZ(0.0f, 900, 16.0f, 0.4f, Float.valueOf(-6.0f), 0.0f, 0, null, 224));
                    }

                    @Override // X.AnonymousClass1298
                    public final void I5(int i2, MusicModel musicModel, boolean z, boolean z2, boolean z3, boolean z4) {
                        int rank;
                        Integer numValueOf;
                        super.I5(i2, musicModel, z, z2, z3, z4);
                        if (musicModel != null) {
                            rank = musicModel.getRank();
                        } else {
                            rank = 0;
                        }
                        if (rank > 0) {
                            C786410Ut5.LLLLZLL(this.LLJLL, 0);
                            TuxTextView tuxTextView = this.LLJLL;
                            if (musicModel != null) {
                                numValueOf = Integer.valueOf(musicModel.getRank());
                            } else {
                                numValueOf = null;
                            }
                            tuxTextView.setText(String.valueOf(numValueOf));
                            C786410Ut5.LLLLLLZZ(this.LLJLLIL, 8);
                            if (z && C12DO.LIZ()) {
                                this.LLJLL.setTextColorRes(R.attr.a1r);
                                return;
                            } else {
                                this.LLJLL.setTextColorRes(R.attr.a1k);
                                return;
                            }
                        }
                        C786410Ut5.LLLLZLL(this.LLJLL, 8);
                        C786410Ut5.LLLLLLZZ(this.LLJLLIL, 0);
                        if (z && C12DO.LIZ()) {
                            this.LLJLLIL.setTintColorRes(R.attr.a1r);
                        } else {
                            this.LLJLLIL.setTintColorRes(R.attr.a1k);
                        }
                    }
                };
            case BdTuring.TYPE_ECAF /* 9 */:
                return new AnonymousClass1290(this.LLILZ, C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.i7q, viewGroup, false), this.LLILLJJLI);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return new AnonymousClass1291(this.LLILZ, C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.i7s, viewGroup, false), this.LLILLJJLI);
            case BdTuring.TYPE_EMAIL /* 11 */:
                C1DRG c1drg = this.LL;
                C129T c129t = C129X.LLJJIJI;
                LayoutInflater layoutInflaterNe = C786410Ut5.ne(viewGroup.getContext());
                c129t.getClass();
                return new C129X(c1drg, C786410Ut5.Td(layoutInflaterNe, R.layout.i7w, viewGroup, false), this.LLILLJJLI);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return new C129O(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.i7y, viewGroup, false));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C129G(C1DRG c1drg, AnonymousClass1297 anonymousClass1297, InterfaceC1455230nyL interfaceC1455230nyL, C129C c129c, boolean z, boolean z2, int i) {
        super(true);
        z = (i & 16) != 0 ? false : z;
        z2 = (i & 32) != 0 ? false : z2;
        this.LL = c1drg;
        this.LLILLJJLI = anonymousClass1297;
        this.LLILLL = interfaceC1455230nyL;
        this.LLILZ = c129c;
        this.LLILZIL = z;
        this.LLILZLL = z2;
        this.LLIZ = C1664770tQJ.LIZIZ(c1drg, VideoPlayerComponent.class, null);
        this.LLIZLLLIL = -1;
        this.LLJ = -1;
    }
}
