package Y;

import X.C094D;
import X.C0O1N;
import X.C0O78;
import X.C0O79;
import X.C0O7A;
import X.C0O7B;
import X.C0OR6;
import X.C1256104vn;
import X.C1256204vo;
import X.C1256304vp;
import X.C1485060okS;
import X.C1882807Za;
import X.C194434115c;
import X.C1954807lC;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2227808o8;
import X.C2344009Gk;
import X.C619560ORu;
import X.C621210OYd;
import X.C621300OYm;
import X.C621310OYn;
import X.C621320OYo;
import X.C621330OYp;
import X.C624370OeJ;
import X.C631740OqC;
import X.C632050Oqh;
import X.C637290Oz9;
import X.EnumC637310OzB;
import X.InterfaceC1256404vq;
import X.InterfaceC1364105Vn;
import X.InterfaceC346701Wf;
import X.InterfaceC621290OYl;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinVoiceItem;
import com.ss.android.ugc.aweme.music.dsp.dm.audio.LifecycleAwareMusicPlayer;
import com.ss.android.ugc.aweme.music.highlight.HighlightSelectListViewModel;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import com.ss.android.ugc.aweme.notification.banner.InboxBannerViewModel;
import com.ss.android.ugc.aweme.notification.banner.InboxBannerWidget;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public class AgS101S1100000_9 implements InterfaceC346701Wf {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // X.InterfaceC346701Wf
    public final Object emit(Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        switch (this.$t) {
            case 0:
                return emit$0(this, obj, interfaceC1364105Vn);
            case 1:
                return emit$1(this, obj, interfaceC1364105Vn);
            case 2:
                return emit$2(this, obj, interfaceC1364105Vn);
            case 3:
                return emit$3(this, obj, interfaceC1364105Vn);
            case 4:
                return emit$4(this, obj, interfaceC1364105Vn);
            case 5:
                return emit$5(this, obj, interfaceC1364105Vn);
            case 6:
                return emit$6(this, obj, interfaceC1364105Vn);
            case 7:
                return emit$7(this, obj, interfaceC1364105Vn);
            default:
                return null;
        }
    }

    public AgS101S1100000_9(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }

    public static final Object emit$0(AgS101S1100000_9 agS101S1100000_9, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        String str;
        if (obj instanceof C0O79) {
            ((HighlightSelectListViewModel) agS101S1100000_9.l1).setState(new AwS588S0100000_9(C632050Oqh.LIZIZ(agS101S1100000_9.s0, ((HighlightSelectListViewModel) agS101S1100000_9.l1).LLILLL), 437));
            HighlightSelectListViewModel highlightSelectListViewModel = (HighlightSelectListViewModel) agS101S1100000_9.l1;
            String str2 = agS101S1100000_9.s0;
            C631740OqC c631740OqC = (C631740OqC) highlightSelectListViewModel.LLILZ.getValue();
            if (c631740OqC != null) {
                str = c631740OqC.LL;
            } else {
                str = null;
            }
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("music_id", str2);
            c2344009Gk.LJIIIIZZ("shoot_from", str);
            C20684815ws.LJIILLIIL("highlight_song_done", c2344009Gk.LIZ);
        } else if (obj instanceof C0O7B) {
            ((HighlightSelectListViewModel) agS101S1100000_9.l1).setState(AFwS240S0000000_9.get$arr$(711));
        } else {
            throw new C1954807lC();
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$1(Y.AgS101S1100000_9 r6, java.lang.Object r7, X.InterfaceC1364105Vn r8) {
        /*
            boolean r0 = r8 instanceof X.C598880NeI
            if (r0 == 0) goto L44
            r5 = r8
            X.0NeI r5 = (X.C598880NeI) r5
            int r2 = r5.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L44
            int r2 = r2 - r1
            r5.LLILLJJLI = r2
        L12:
            java.lang.Object r1 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLJJLI
            r3 = 1
            if (r0 == 0) goto L25
            if (r0 != r3) goto L4a
            X.C155000ia.LIZIZ(r1)
        L22:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L25:
            X.C155000ia.LIZIZ(r1)
            java.lang.Object r2 = r6.l1
            X.01Wf r2 = (X.InterfaceC346701Wf) r2
            r0 = r7
            X.0NeJ r0 = (X.InterfaceC598890NeJ) r0
            java.lang.String r1 = r0.getName()
            java.lang.String r0 = r6.s0
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L22
            r5.LLILLJJLI = r3
            java.lang.Object r0 = r2.emit(r7, r5)
            if (r0 != r4) goto L22
            return r4
        L44:
            X.0NeI r5 = new X.0NeI
            r5.<init>(r6, r8)
            goto L12
        L4a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS101S1100000_9.emit$1(Y.AgS101S1100000_9, java.lang.Object, X.05Vn):java.lang.Object");
    }

    public static final Object emit$2(AgS101S1100000_9 agS101S1100000_9, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        Music music;
        Music music2;
        C0O7A c0o7a = (C0O7A) obj;
        String urlKey = null;
        if (c0o7a instanceof C0O79) {
            C0O79 c0o79 = (C0O79) c0o7a;
            MusicDetail musicDetail = ((C0O1N) c0o79.LJ).LIZ;
            if (musicDetail != null) {
                music = musicDetail.music;
            } else {
                music = null;
            }
            if (C619560ORu.LIZ(music)) {
                LifecycleAwareMusicPlayer lifecycleAwareMusicPlayer = (LifecycleAwareMusicPlayer) agS101S1100000_9.l1;
                lifecycleAwareMusicPlayer.LLILZLL = false;
                C0OR6 c0or6 = C0OR6.ERROR_CODE_NO_COPYRIGHT;
                lifecycleAwareMusicPlayer.LLIZ = c0or6;
                lifecycleAwareMusicPlayer.LLILLJJLI.LJ(agS101S1100000_9.s0, c0or6);
                return Unit.LIZ;
            }
            MusicDetail musicDetail2 = ((C0O1N) c0o79.LJ).LIZ;
            if (musicDetail2 != null && (music2 = musicDetail2.music) != null) {
                LifecycleAwareMusicPlayer lifecycleAwareMusicPlayer2 = (LifecycleAwareMusicPlayer) agS101S1100000_9.l1;
                MusicModel musicModelConvertToMusicModel = music2.convertToMusicModel();
                C1485060okS c1485060okS = new C1485060okS();
                c1485060okS.LJFF = musicModelConvertToMusicModel.getMusicId();
                if (musicModelConvertToMusicModel.getMusicType() == 1 || musicModelConvertToMusicModel.getMusicType() == 2) {
                    c1485060okS.LIZJ = 4;
                }
                c1485060okS.LIZLLL = musicModelConvertToMusicModel.getPreciseAuditionDuration();
                c1485060okS.LJIIIZ = 0;
                if (musicModelConvertToMusicModel.isPlayUrlValid()) {
                    c1485060okS.LIZIZ = musicModelConvertToMusicModel.getUrl().getUrlList();
                    UrlModel url = musicModelConvertToMusicModel.getUrl();
                    if (url != null) {
                        urlKey = url.getUrlKey();
                    }
                    c1485060okS.LJIIJ = urlKey;
                }
                lifecycleAwareMusicPlayer2.LIZ().LIZIZ(c1485060okS);
            }
        } else if (c0o7a instanceof C0O78) {
            LifecycleAwareMusicPlayer lifecycleAwareMusicPlayer3 = (LifecycleAwareMusicPlayer) agS101S1100000_9.l1;
            lifecycleAwareMusicPlayer3.LLILZLL = false;
            lifecycleAwareMusicPlayer3.LLIZ = C0OR6.ERROR_CODE_UNKNOWN;
            lifecycleAwareMusicPlayer3.LLILLJJLI.LJ(agS101S1100000_9.s0, null);
        }
        return Unit.LIZ;
    }

    public static final Object emit$3(AgS101S1100000_9 agS101S1100000_9, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        String string;
        Long l;
        String string2;
        Long l2;
        InterfaceC1256404vq interfaceC1256404vq = (InterfaceC1256404vq) obj;
        boolean zLJIIL = ((C621210OYd) agS101S1100000_9.l1).LJIIL(agS101S1100000_9.s0);
        if (interfaceC1256404vq instanceof C1256104vn) {
            ((C621210OYd) agS101S1100000_9.l1).LIZLLL(agS101S1100000_9.s0, zLJIIL, false);
            ((C621210OYd) agS101S1100000_9.l1).LJJIIJ(null, true);
        } else if (interfaceC1256404vq instanceof C1256304vp) {
            ((C621210OYd) agS101S1100000_9.l1).LIZLLL(agS101S1100000_9.s0, zLJIIL, false);
            ((C621210OYd) agS101S1100000_9.l1).LJJIIJ(null, false);
            ((C621210OYd) agS101S1100000_9.l1).LJIJJ(agS101S1100000_9.s0);
        } else if (interfaceC1256404vq instanceof InterfaceC621290OYl) {
            if (!Intrinsics.LJFF(interfaceC1256404vq, C621330OYp.LIZ)) {
                if (Intrinsics.LJFF(interfaceC1256404vq, C621310OYn.LIZ)) {
                    BulletinVoiceItem bulletinVoiceItem = ((C621210OYd) agS101S1100000_9.l1).LJIILIIL;
                    if (bulletinVoiceItem != null && (l2 = bulletinVoiceItem.LLJJIJI) != null) {
                        string2 = l2.toString();
                    } else {
                        string2 = null;
                    }
                    if (Intrinsics.LJFF(string2, agS101S1100000_9.s0)) {
                        ((C621210OYd) agS101S1100000_9.l1).LIZLLL(agS101S1100000_9.s0, zLJIIL, false);
                        ((C621210OYd) agS101S1100000_9.l1).LJJIIJ(null, false);
                        C621210OYd c621210OYd = (C621210OYd) agS101S1100000_9.l1;
                        BulletinVoiceItem bulletinVoiceItem2 = c621210OYd.LJIILIIL;
                        if (bulletinVoiceItem2 != null) {
                            TuxTextView tuxTextView = c621210OYd.LJIIL;
                            if (tuxTextView != null) {
                                tuxTextView.setText(C621210OYd.LJI(bulletinVoiceItem2.LLJI));
                            }
                            C194434115c c194434115c = c621210OYd.LJIIJJI;
                            if (c194434115c != null) {
                                c194434115c.setProgress(0.0f);
                            }
                        }
                    }
                } else {
                    if (!Intrinsics.LJFF(interfaceC1256404vq, C621300OYm.LIZ) && !Intrinsics.LJFF(interfaceC1256404vq, C621320OYo.LIZ)) {
                        throw new C1954807lC();
                    }
                    ((C621210OYd) agS101S1100000_9.l1).LJIJJLI(agS101S1100000_9.s0);
                    BulletinVoiceItem bulletinVoiceItem3 = ((C621210OYd) agS101S1100000_9.l1).LJIILIIL;
                    if (bulletinVoiceItem3 != null && (l = bulletinVoiceItem3.LLJJIJI) != null) {
                        string = l.toString();
                    } else {
                        string = null;
                    }
                    if (Intrinsics.LJFF(string, agS101S1100000_9.s0)) {
                        ((C621210OYd) agS101S1100000_9.l1).LIZLLL(agS101S1100000_9.s0, zLJIIL, false);
                        ((C621210OYd) agS101S1100000_9.l1).LJJIIJ(null, false);
                    }
                }
            }
        } else if (interfaceC1256404vq instanceof C1256204vo) {
            ((C621210OYd) agS101S1100000_9.l1).LJIJJLI(agS101S1100000_9.s0);
            ((C621210OYd) agS101S1100000_9.l1).LIZLLL(agS101S1100000_9.s0, zLJIIL, false);
            ((C621210OYd) agS101S1100000_9.l1).LJJIIJ(null, false);
        } else {
            throw new C1954807lC();
        }
        return Unit.LIZ;
    }

    public static final Object emit$4(AgS101S1100000_9 agS101S1100000_9, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        String string;
        float f;
        Long l;
        C2227808o8 c2227808o8 = (C2227808o8) obj;
        BulletinVoiceItem bulletinVoiceItem = ((C621210OYd) agS101S1100000_9.l1).LJIILIIL;
        if (bulletinVoiceItem != null && (l = bulletinVoiceItem.LLJJIJI) != null) {
            string = l.toString();
        } else {
            string = null;
        }
        if (!Intrinsics.LJFF(string, agS101S1100000_9.s0)) {
            return Unit.LIZ;
        }
        int i = c2227808o8.LIZ;
        if (i == 0 && c2227808o8.LIZIZ == 0) {
            return Unit.LIZ;
        }
        C621210OYd c621210OYd = (C621210OYd) agS101S1100000_9.l1;
        c621210OYd.LJJIII = c2227808o8;
        C194434115c c194434115c = c621210OYd.LJIIJJI;
        if (c194434115c != null) {
            int i2 = c2227808o8.LIZIZ;
            if (i2 > 0) {
                f = i / i2;
            } else {
                f = 0.0f;
            }
            c194434115c.setProgress(f);
        }
        int i3 = c2227808o8.LIZIZ - c2227808o8.LIZ;
        if (i3 < 0) {
            i3 = 0;
        }
        long j = i3;
        TuxTextView tuxTextView = ((C621210OYd) agS101S1100000_9.l1).LJIIL;
        if (tuxTextView != null) {
            tuxTextView.setText(C621210OYd.LJI(j));
        }
        return Unit.LIZ;
    }

    public static final Object emit$5(AgS101S1100000_9 agS101S1100000_9, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        Object second;
        Pair pair = (Pair) obj;
        EnumC637310OzB enumC637310OzB = (EnumC637310OzB) pair.getFirst();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("observerBannerItem flow, bannerName: ");
        sbLIZ.append(agS101S1100000_9.s0);
        sbLIZ.append(", bannerState = ");
        sbLIZ.append(pair);
        C624370OeJ.LIZ("InboxBannerWidget", C2188811AlT.LIZIZ(sbLIZ));
        if (enumC637310OzB != EnumC637310OzB.BOTTOM_SHOW && enumC637310OzB != EnumC637310OzB.TOP_SHOW) {
            second = null;
        } else {
            second = pair.getSecond();
        }
        InboxBannerViewModel inboxBannerViewModelNo = ((InboxBannerWidget) agS101S1100000_9.l1).No();
        String str = agS101S1100000_9.s0;
        synchronized (inboxBannerViewModelNo) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onBannerRefresh, bannerTag = ");
            sbLIZ2.append(str);
            sbLIZ2.append(", bannerState = ");
            sbLIZ2.append(enumC637310OzB);
            sbLIZ2.append(", bannerItem = ");
            sbLIZ2.append(second);
            sbLIZ2.append(',');
            C624370OeJ.LIZ("InboxBannerViewModel", C2188811AlT.LIZIZ(sbLIZ2));
            inboxBannerViewModelNo.LL.put(str, new Pair<>(enumC637310OzB, second));
            int i = C637290Oz9.LIZ[enumC637310OzB.ordinal()];
            if (i != 1 && i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        throw new C1954807lC();
                    }
                } else {
                    inboxBannerViewModelNo.wQ2(str);
                }
            } else {
                inboxBannerViewModelNo.xQ2();
            }
        }
        return Unit.LIZ;
    }

    public static final Object emit$6(AgS101S1100000_9 agS101S1100000_9, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        C1882807Za c1882807Za = (C1882807Za) obj;
        if (Intrinsics.LJFF(c1882807Za.LIZ, agS101S1100000_9.s0)) {
            ((C094D) agS101S1100000_9.l1).LJIIIIZZ(c1882807Za);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$7(Y.AgS101S1100000_9 r6, java.lang.Object r7, X.InterfaceC1364105Vn r8) {
        /*
            boolean r0 = r8 instanceof X.C599260Neu
            if (r0 == 0) goto L44
            r5 = r8
            X.0Neu r5 = (X.C599260Neu) r5
            int r2 = r5.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L44
            int r2 = r2 - r1
            r5.LLILLJJLI = r2
        L12:
            java.lang.Object r1 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLJJLI
            r3 = 1
            if (r0 == 0) goto L25
            if (r0 != r3) goto L4a
            X.C155000ia.LIZIZ(r1)
        L22:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L25:
            X.C155000ia.LIZIZ(r1)
            java.lang.Object r2 = r6.l1
            X.01Wf r2 = (X.InterfaceC346701Wf) r2
            r0 = r7
            X.0Nev r0 = (X.InterfaceC599270Nev) r0
            java.lang.String r1 = r0.getName()
            java.lang.String r0 = r6.s0
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L22
            r5.LLILLJJLI = r3
            java.lang.Object r0 = r2.emit(r7, r5)
            if (r0 != r4) goto L22
            return r4
        L44:
            X.0Neu r5 = new X.0Neu
            r5.<init>(r6, r8)
            goto L12
        L4a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS101S1100000_9.emit$7(Y.AgS101S1100000_9, java.lang.Object, X.05Vn):java.lang.Object");
    }
}
