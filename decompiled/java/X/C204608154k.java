package X;

import Y.AUListenerS277S0100000_29;
import Y.AfS200S0100000_31;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.OnThisDayData;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.creative.model.music.MusicObject;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.VideoMusicModel;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS168S0101000_31;
import kotlin.jvm.internal.AwS575S0100000_31;

/* JADX INFO: renamed from: X.154k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C204608154k extends C204612154o {
    public final Context LJ;
    public C425240Glu LJI;
    public C1630570sX9 LJII;
    public LinearLayout LJIIIIZZ;
    public C129H LJIIIZ;
    public FrameLayout LJIIJ;
    public TuxTextView LJIIJJI;
    public final C204657156h LJFF = new C204657156h();
    public final C01GW LJIIL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1573));
    public final C01GW LJIILIIL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1576));
    public final C01GW LJIILJJIL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1575));

    @Override // X.AbstractC204610154m, X.InterfaceC204626155c
    public final void LLZ() {
        this.LJIIL.getValue();
        C425240Glu c425240Glu = this.LJI;
        if (c425240Glu == null) {
            c425240Glu = null;
        }
        c425240Glu.scrollToPosition(0);
    }

    @Override // X.InterfaceC204626155c
    public final View getView() {
        return (View) this.LJIIL.getValue();
    }

    @Override // X.InterfaceC204626155c
    public final AbstractC21673619ry<?> LJJLIIIJL() {
        return this.LJIIIZ;
    }

    public C204608154k(C1361400lX0 c1361400lX0) {
        this.LJ = c1361400lX0;
    }

    public final void LJII(final int i) {
        InterfaceC204613154p interfaceC204613154p = (InterfaceC204613154p) this.LJIILIIL.getValue();
        if (interfaceC204613154p != null) {
            if (interfaceC204613154p.VS()) {
                LJIIIZ(false);
                LJIIIIZZ(true);
            }
            LJI().LJIIZILJ().LIZ(interfaceC204613154p.Lk().LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS200S0100000_31(this, 47), new C09JN() { // from class: X.154l
                @Override // X.C09JN
                public final void accept(Object obj) {
                    int i2;
                    C1C7U.LIZ("RecentMusicTabViewV2@fd88.getRecentMusicList$1$2");
                    if (C20510015Ni.LIZ.LJI() != EnumC1641500som.AVAILABLE && (i2 = i) < 3) {
                        C01TT.LIZIZ(1000L, new AwS168S0101000_31(i2, this, 4));
                    } else {
                        C129H c129h = this.LJIIIZ;
                        if (c129h != null) {
                            c129h.setData(new ArrayList());
                        }
                        TuxTextView tuxTextView = this.LJIIJJI;
                        if (tuxTextView == null) {
                            tuxTextView = null;
                        }
                        C786410Ut5.LLLLZLL(tuxTextView, 4);
                        this.LJIIIIZZ(false);
                        this.LJIIIZ(true);
                    }
                    C1C7U.LIZIZ("RecentMusicTabViewV2@fd88.getRecentMusicList$1$2");
                }
            }));
        }
    }

    public final void LJIIIIZZ(boolean z) {
        if (z) {
            LinearLayout linearLayout = this.LJIIIIZZ;
            if (linearLayout != null) {
                C786410Ut5.LJZL(0, linearLayout);
                return;
            }
            return;
        }
        LinearLayout linearLayout2 = this.LJIIIIZZ;
        if (linearLayout2 == null) {
            return;
        }
        C786410Ut5.LJZL(8, linearLayout2);
    }

    public final void LJIIIZ(boolean z) {
        List<MusicModel> data;
        if (!z) {
            C1630570sX9 c1630570sX9 = this.LJII;
            if (c1630570sX9 != null) {
                C786410Ut5.X1(c1630570sX9, 8);
                return;
            }
            return;
        }
        C129H c129h = this.LJIIIZ;
        if (c129h != null && (data = c129h.getData()) != null) {
            data.clear();
        }
        C129H c129h2 = this.LJIIIZ;
        if (c129h2 != null) {
            c129h2.notifyDataSetChanged();
        }
        LJIIIIZZ(false);
        C1630570sX9 c1630570sX92 = this.LJII;
        if (c1630570sX92 == null) {
            return;
        }
        C786410Ut5.X1(c1630570sX92, 0);
        c1630570sX92.LIZ();
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [X.129H] */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.155L] */
    @Override // X.InterfaceC204626155c
    public final void LLZILL(boolean z) {
        CreativeModel creativeModel;
        OnThisDayData onThisDayData;
        if (this.LJIIIZ == null) {
            final C1DRG c1drgLJFF = LJFF();
            final ?? r6 = new C129V() { // from class: X.155L
                @Override // X.AnonymousClass1297
                public final void LJI(VideoMusicModel videoMusicModel, int i) {
                }

                @Override // X.AnonymousClass1297
                public final void LJIIIZ(int i, Aweme aweme) {
                }

                @Override // X.AnonymousClass1297
                public final void LJIIJJI(VideoMusicModel videoMusicModel, int i) {
                }

                @Override // X.AnonymousClass1297
                public final void LJIIL(int i) {
                }

                @Override // X.AnonymousClass1297
                public final void LJIILIIL(int i, View view) {
                }

                @Override // X.AnonymousClass1297
                public final void LJIILJJIL(VideoMusicModel videoMusicModel) {
                }

                @Override // X.AnonymousClass1297
                public final void LJIILL(int i) {
                }

                @Override // X.AnonymousClass1297
                public final boolean LIZIZ() {
                    MusicObject musicObject;
                    String musicId;
                    List<String> list;
                    MusicBuzModel musicBuzModelLIZIZ = ((C155W) this.LIZ.LJIILJJIL.getValue()).zt().LIZIZ();
                    if (musicBuzModelLIZIZ == null || (musicObject = musicBuzModelLIZIZ.music) == null || (musicId = MusicBeanUtilKt.getMusicId(musicObject)) == null || (list = this.LIZ.LIZJ().LIZIZ) == null || !list.contains(musicId)) {
                        return this.LIZ.LIZJ().LJIIL.LIZIZ();
                    }
                    return false;
                }

                @Override // X.AnonymousClass1297
                public final boolean LIZJ() {
                    return this.LIZ.LIZJ().LJIIL.LIZJ();
                }

                @Override // X.AnonymousClass1297
                public final boolean LJ() {
                    return this.LIZ.LIZJ().LJIIL.LJIILIIL();
                }

                @Override // X.AnonymousClass1297
                public final int LJIILLIIL(MusicModel musicModel) {
                    return musicModel.getPresenterDuration();
                }

                @Override // X.AnonymousClass1297
                public final void LIZ(int i, View view) {
                    List<MusicModel> data;
                    MusicModel musicModel;
                    String strEN;
                    Music music;
                    C129H c129h = this.LIZ.LJIIIZ;
                    if (c129h != null && (data = c129h.getData()) != null && (musicModel = (MusicModel) C13LP.LJJJLZIJ(i, data)) != null) {
                        C204608154k c204608154k = this.LIZ;
                        if (musicModel.getMusic() != null && (music = musicModel.getMusic()) != null && music.isCanNotReuse()) {
                            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                            creativeToastBuilder.messageRes(2131830669);
                            C1390380mHk.LIZLLL(view, 3068, creativeToastBuilder);
                            C2344009Gk c2344009Gk = new C2344009Gk();
                            c2344009Gk.LJIIIIZZ("enter_from", "change_music_page");
                            C20684815ws.LJIILLIIL("add_private_music", c2344009Gk.LIZ);
                            return;
                        }
                        C129H c129h2 = c204608154k.LJIIIZ;
                        if (c129h2 != null && c129h2.LLLI(musicModel)) {
                            if (c204608154k.LIZJ().LJIL.invoke().booleanValue()) {
                                C155P c155p = c204608154k.LIZJ().LJIILIIL;
                                String stringValue = EnumC1654750tA9.TAB_RECENT.getStringValue();
                                InterfaceC204613154p interfaceC204613154p = (InterfaceC204613154p) c204608154k.LJIILIIL.getValue();
                                if (interfaceC204613154p != null) {
                                    strEN = interfaceC204613154p.EN(musicModel.getMusicId());
                                } else {
                                    strEN = null;
                                }
                                c155p.LIZJ(musicModel, stringValue, i, strEN);
                                c204608154k.LJI().LJIIL(c204608154k.LJIIIZ, false, true, musicModel, true);
                                return;
                            }
                            return;
                        }
                        C129H c129h3 = c204608154k.LJIIIZ;
                        if (c129h3 != null) {
                            c129h3.LLLIILIL(i);
                        }
                        c204608154k.LJI().LJJIJIIJIL(i, musicModel, EnumC1654750tA9.TAB_RECENT, true, null, false, null, null);
                    }
                }

                @Override // X.AnonymousClass1297
                public final void LIZLLL(MusicModel musicModel, boolean z2) {
                    this.LIZ.LIZIZ(musicModel, z2);
                }

                @Override // X.AnonymousClass1297
                public final void LJFF(MusicModel musicModel, int i) {
                    String strEN;
                    InterfaceC204613154p interfaceC204613154p;
                    AbstractC204621154x abstractC204621154xLJI = this.LIZ.LJI();
                    EnumC1654750tA9 enumC1654750tA9 = EnumC1654750tA9.TAB_RECENT;
                    String musicId = musicModel.getMusicId();
                    if (musicId != null && (interfaceC204613154p = (InterfaceC204613154p) this.LIZ.LJIILIIL.getValue()) != null) {
                        strEN = interfaceC204613154p.EN(musicId);
                    } else {
                        strEN = null;
                    }
                    abstractC204621154xLJI.LJJIIJ(musicModel, enumC1654750tA9, i, "edit_page_recent", strEN, null, null);
                }

                @Override // X.AnonymousClass1297
                public final void LJII(int i, View view) {
                    int size;
                    C129H c129h;
                    List<MusicModel> data;
                    MusicModel musicModel;
                    List<MusicModel> data2;
                    C129H c129h2 = this.LIZ.LJIIIZ;
                    if (c129h2 != null && (data2 = c129h2.getData()) != null) {
                        size = data2.size();
                    } else {
                        size = 0;
                    }
                    if (i >= 0 && i < size && (c129h = this.LIZ.LJIIIZ) != null && (data = c129h.getData()) != null && (musicModel = (MusicModel) ListProtector.get(data, i)) != null) {
                        C204608154k c204608154k = this.LIZ;
                        c204608154k.LJI().LJJIJIIJI(c204608154k.LJIIIZ, musicModel, null);
                    }
                }

                @Override // X.AnonymousClass1297
                public final void LJIIIIZZ(int i, View view) {
                    String strEN;
                    String musicId;
                    InterfaceC204613154p interfaceC204613154p;
                    if (i < 0) {
                        return;
                    }
                    this.LIZ.LJI().LL.LJIIJ(Unit.LIZ);
                    C155Z c155z = this.LIZ.LIZJ().LJIIL;
                    EnumC1654750tA9 enumC1654750tA9 = EnumC1654750tA9.TAB_RECENT;
                    c155z.LIZ(enumC1654750tA9.getStringValue());
                    C155P c155p = this.LIZ.LIZJ().LJIILIIL;
                    MusicModel musicModelLJIL = this.LIZ.LJI().LJIL();
                    String stringValue = enumC1654750tA9.getStringValue();
                    MusicModel musicModelLJIL2 = this.LIZ.LJI().LJIL();
                    if (musicModelLJIL2 != null && (musicId = musicModelLJIL2.getMusicId()) != null && (interfaceC204613154p = (InterfaceC204613154p) this.LIZ.LJIILIIL.getValue()) != null) {
                        strEN = interfaceC204613154p.EN(musicId);
                    } else {
                        strEN = null;
                    }
                    c155p.LJI(musicModelLJIL, stringValue, strEN);
                }

                @Override // X.AnonymousClass1297
                public final void LJIIJ(int i, View view) {
                    this.LIZ.LIZJ().LJIIL.LJFF();
                }
            };
            final InterfaceC1455230nyL interfaceC1455230nyLZt = ((C155W) this.LJIILJJIL.getValue()).zt();
            final C129C c129c = LIZJ().LIZ;
            final AwS575S0100000_31 awS575S0100000_31 = new AwS575S0100000_31(this, 1571);
            this.LJIIIZ = new C129G(c1drgLJFF, r6, interfaceC1455230nyLZt, c129c, awS575S0100000_31) { // from class: X.129H
                public final C129V LLJILJIL;
                public final Function0<Boolean> LLJILJILJ;

                @Override // X.C129G
                public final boolean LLLI(MusicModel musicModel) {
                    if (this.LLJILJILJ.invoke().booleanValue()) {
                        return super.LLLI(musicModel);
                    }
                    AVMusic aVMusicLLLFZ = LLLFZ();
                    if (aVMusicLLLFZ == null || !C1419800n3C.LIZJ(C389120FNm.LIZ(aVMusicLLLFZ), musicModel)) {
                        return false;
                    }
                    return true;
                }

                @Override // X.C129G, X.AbstractC438050HFr
                public final void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                    MusicModel musicModel;
                    boolean z2;
                    boolean z3;
                    boolean z4;
                    List<T> list = this.mmItems;
                    if (list != 0) {
                        musicModel = (MusicModel) C13LP.LJJJLZIJ(i, list);
                    } else {
                        musicModel = null;
                    }
                    if (!this.LLJILJILJ.invoke().booleanValue() || (musicModel != null && musicModel.isUnlimitedMusic())) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (viewHolder instanceof C129K) {
                        AnonymousClass1298 anonymousClass1298 = (AnonymousClass1298) viewHolder;
                        boolean zLLLI = LLLI(musicModel);
                        if (this.LLIZLLLIL == i) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (this.LLJ == i) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        anonymousClass1298.I5(i, musicModel, zLLLI, z3, true, z4);
                        if (z2) {
                            anonymousClass1298.itemView.setClickable(true);
                            anonymousClass1298.itemView.setEnabled(true);
                            TuxTextView tuxTextView = anonymousClass1298.LLJJJIL;
                            if (tuxTextView != null) {
                                C786410Ut5.B5(tuxTextView, 1.0f);
                            }
                            TextView textView = anonymousClass1298.LLJJJJ;
                            if (textView != null) {
                                C786410Ut5.S4(1.0f, textView);
                            }
                            TextView textView2 = anonymousClass1298.LLJJI;
                            if (textView2 != null) {
                                C786410Ut5.S4(1.0f, textView2);
                            }
                            if (z3) {
                                C19470511Fn c19470511Fn = anonymousClass1298.LLJJ;
                                if (c19470511Fn != null) {
                                    c19470511Fn.LIZ(0.66f);
                                }
                            } else {
                                C19470511Fn c19470511Fn2 = anonymousClass1298.LLJJ;
                                if (c19470511Fn2 != null) {
                                    c19470511Fn2.LIZ(1.0f);
                                }
                            }
                        } else {
                            anonymousClass1298.itemView.setClickable(false);
                            anonymousClass1298.itemView.setEnabled(false);
                            TuxTextView tuxTextView2 = anonymousClass1298.LLJJJIL;
                            if (tuxTextView2 != null) {
                                C786410Ut5.B5(tuxTextView2, 0.4f);
                            }
                            TextView textView3 = anonymousClass1298.LLJJJJ;
                            if (textView3 != null) {
                                C786410Ut5.S4(0.4f, textView3);
                            }
                            TextView textView4 = anonymousClass1298.LLJJI;
                            if (textView4 != null) {
                                C786410Ut5.S4(0.4f, textView4);
                            }
                            C19470511Fn c19470511Fn3 = anonymousClass1298.LLJJ;
                            if (c19470511Fn3 != null) {
                                c19470511Fn3.LIZ(0.3f);
                            }
                            C426090GnH c426090GnH = anonymousClass1298.LLIZLLLIL;
                            if (c426090GnH != null) {
                                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c426090GnH);
                                c426090GnH.setAlpha(0.4f);
                            }
                        }
                        if (musicModel != null) {
                            this.LLILLJJLI.LJFF(musicModel, i);
                            return;
                        }
                        return;
                    }
                    if (!(viewHolder instanceof C129M) || musicModel == null) {
                        return;
                    }
                    ((C129M) viewHolder).I5(musicModel);
                }

                @Override // X.C129G, X.AbstractC438050HFr
                public final RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i) {
                    if (i == 6) {
                        return new C129M(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.i65, viewGroup, false));
                    }
                    final C129C c129c2 = this.LLILZ;
                    final View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.i7r, viewGroup, false);
                    final C129V c129v = this.LLJILJIL;
                    return new AnonymousClass1298(c129c2, viewTd, c129v) { // from class: X.129K
                        public final View LLJLL;

                        {
                            ValueAnimator valueAnimatorOfArgb = ValueAnimator.ofArgb(0, C475630Ikz.LIZIZ(R.attr.dz, viewTd.getContext()));
                            valueAnimatorOfArgb.setDuration(ViewConfiguration.getLongPressTimeout());
                            valueAnimatorOfArgb.addUpdateListener(new AUListenerS277S0100000_29(viewTd, 20));
                            this.LLJLL = viewTd.findViewById(R.id.l4c);
                        }
                    };
                }

                {
                    this.LLJILJIL = r6;
                    this.LLJILJILJ = awS575S0100000_31;
                }
            };
            WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager(LIZJ().LJJIIJZLJL, 1);
            C425240Glu c425240Glu = this.LJI;
            if (c425240Glu == null) {
                c425240Glu = null;
            }
            c425240Glu.setLayoutManager(wrapLinearLayoutManager);
            C425240Glu c425240Glu2 = this.LJI;
            if (c425240Glu2 == null) {
                c425240Glu2 = null;
            }
            c425240Glu2.setAdapter(this.LJIIIZ);
            C204657156h c204657156h = this.LJFF;
            C425240Glu c425240Glu3 = this.LJI;
            if (c425240Glu3 == null) {
                c425240Glu3 = null;
            }
            C129H c129h = this.LJIIIZ;
            if (c129h != null) {
                c204657156h.LIZ(c425240Glu3, c129h, new AwS575S0100000_31(this, 1572), false);
                C204614154q c204614154q = (C204614154q) LJFF().LJIIL(null, C204614154q.class);
                if (c204614154q != null) {
                    c204614154q.LIZ.put(EnumC1654750tA9.TAB_RECENT, this.LJFF);
                }
                C01TT.LIZLLL(new AwS575S0100000_31(this, 1574));
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        LIZJ().LIZ.LIZJ = false;
        LIZJ().LJIILIIL.LIZLLL(EnumC1654750tA9.TAB_RECENT.getStringValue(), z, LJ());
        LJII(0);
        VideoPublishEditModel videoPublishEditModel = this.LIZJ;
        if (videoPublishEditModel != null && (creativeModel = videoPublishEditModel.creativeModel) != null && (onThisDayData = creativeModel.onThisDayData) != null && onThisDayData.isInOnThisDayPreviewPage()) {
            onThisDayData.setMusicSelectedFromV2("on_this_day_page_recent");
        }
    }
}
