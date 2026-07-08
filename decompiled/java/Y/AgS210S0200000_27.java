package Y;

import X.AbstractC1557040qcY;
import X.AbstractC1839080xxS;
import X.C1006040cHq;
import X.C13LP;
import X.C15438062q;
import X.C1557020qcW;
import X.C1557030qcX;
import X.C1557050qcZ;
import X.C15M8;
import X.C1838950xxF;
import X.C1839060xxQ;
import X.C1839090xxT;
import X.C1839100xxU;
import X.C1839110xxV;
import X.C1839120xxW;
import X.C1839140xxY;
import X.C1954807lC;
import X.C1A5L;
import X.C2252321DDq;
import X.C2271381DvM;
import X.C2271391DvN;
import X.C786410Ut5;
import X.EnumC1839040xxO;
import X.InterfaceC1364105Vn;
import X.InterfaceC346701Wf;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.tag.TuxTag;
import com.ss.android.ugc.aweme.IMAiGroupShotConfig;
import com.ss.android.ugc.aweme.commercialize.media.impl.handler.detail.substitutemusic.v1.CommerceMusicSubstituteMusicVideoFragment;
import com.ss.android.ugc.aweme.commercialize.media.impl.viewmodel.RecommendMusicV2ViewModel;
import com.ss.android.ugc.aweme.contactselect.ContactSelectViewModel;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.u;

/* JADX INFO: loaded from: classes28.dex */
public class AgS210S0200000_27 implements InterfaceC346701Wf {
    public final int $t;
    public Object l0;
    public Object l1;

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
            case 8:
                return emit$8(this, obj, interfaceC1364105Vn);
            case BdTuring.TYPE_ECAF /* 9 */:
                return emit$9(this, obj, interfaceC1364105Vn);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return emit$10(this, obj, interfaceC1364105Vn);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return emit$11(this, obj, interfaceC1364105Vn);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return emit$12(this, obj, interfaceC1364105Vn);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return emit$13(this, obj, interfaceC1364105Vn);
            case 14:
                return emit$14(this, obj, interfaceC1364105Vn);
            case 15:
                return emit$15(this, obj, interfaceC1364105Vn);
            case 16:
                return emit$16(this, obj, interfaceC1364105Vn);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return emit$17(this, obj, interfaceC1364105Vn);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return emit$18(this, obj, interfaceC1364105Vn);
            case 19:
                return emit$19(this, obj, interfaceC1364105Vn);
            default:
                return null;
        }
    }

    public AgS210S0200000_27(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final Object emit$0(AgS210S0200000_27 agS210S0200000_27, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        int i;
        int i2;
        int i3;
        TextUtils.TruncateAt truncateAt;
        C1839120xxW c1839120xxW = (C1839120xxW) obj;
        ((C1839140xxY) agS210S0200000_27.l0).LLILZ.setText(c1839120xxW.LIZ);
        ((C1839140xxY) agS210S0200000_27.l0).LLILZIL.setText(c1839120xxW.LIZIZ);
        ((C1839140xxY) agS210S0200000_27.l0).LLILZLL.setText(c1839120xxW.LIZ());
        View view = ((C1839140xxY) agS210S0200000_27.l0).LLJIJIL;
        int i4 = 8;
        boolean z = false;
        if (c1839120xxW.LIZLLL > 0) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, view);
        TuxTextView tuxTextView = ((C1839140xxY) agS210S0200000_27.l0).LLIZ;
        if (c1839120xxW.LIZLLL > 0) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        C786410Ut5.LLLLZLL(tuxTextView, i2);
        C1839140xxY c1839140xxY = (C1839140xxY) agS210S0200000_27.l0;
        c1839140xxY.LLIZ.setText(new Regex("\\[num]").replaceFirst(c1839140xxY.LL.getContext().getResources().getQuantityText(2131755110, c1839120xxW.LIZLLL), c1839120xxW.LIZIZ()));
        TuxTag tuxTag = ((C1839140xxY) agS210S0200000_27.l0).LLIZLLLIL;
        if (!TextUtils.isEmpty(c1839120xxW.LJ)) {
            i4 = 0;
        }
        C786410Ut5.LLZLLIL(tuxTag, i4);
        ((C1839140xxY) agS210S0200000_27.l0).LLIZLLLIL.setText(c1839120xxW.LJ);
        C1839140xxY c1839140xxY2 = (C1839140xxY) agS210S0200000_27.l0;
        C786410Ut5.U8(c1839140xxY2.LLJ, new ACListenerS129S0200000_27(c1839140xxY2, (RecommendMusicV2ViewModel) agS210S0200000_27.l1, 0));
        C1839140xxY c1839140xxY3 = (C1839140xxY) agS210S0200000_27.l0;
        C786410Ut5.a9(c1839140xxY3.LLJI, new ACListenerS129S0200000_27(c1839140xxY3, (RecommendMusicV2ViewModel) agS210S0200000_27.l1, 1));
        C1839140xxY c1839140xxY4 = (C1839140xxY) agS210S0200000_27.l0;
        C786410Ut5.Q8(c1839140xxY4.LLILLL, new ACListenerS129S0200000_27(c1839140xxY4, (RecommendMusicV2ViewModel) agS210S0200000_27.l1, 2));
        C2271391DvN.LIZ(((C1839140xxY) agS210S0200000_27.l0).LLJI, (C1A5L) C2271381DvM.t0.getValue());
        C2271391DvN.LIZ(((C1839140xxY) agS210S0200000_27.l0).LLILLL, (C1A5L) C2271381DvM.s0.getValue());
        C1839140xxY c1839140xxY5 = (C1839140xxY) agS210S0200000_27.l0;
        C786410Ut5.I7(new ACListenerS129S0200000_27(c1839140xxY5, (RecommendMusicV2ViewModel) agS210S0200000_27.l1, 3), c1839140xxY5.LL);
        TuxIconView tuxIconView = ((C1839140xxY) agS210S0200000_27.l0).LLJI;
        EnumC1839040xxO enumC1839040xxO = c1839120xxW.LJI;
        int[] iArr = C1839060xxQ.LIZ;
        int i5 = iArr[enumC1839040xxO.ordinal()];
        if (i5 != 1) {
            if (i5 != 2) {
                if (i5 == 3) {
                    i3 = R.drawable.c1a;
                } else {
                    throw new C1954807lC();
                }
            } else {
                i3 = R.raw.icon_spinner_normal;
            }
        } else {
            i3 = R.drawable.c0w;
        }
        tuxIconView.setIconRes(i3);
        if (iArr[c1839120xxW.LJI.ordinal()] == 2) {
            C1839140xxY c1839140xxY6 = (C1839140xxY) agS210S0200000_27.l0;
            c1839140xxY6.LLJI.startAnimation(c1839140xxY6.LLJILJILJ);
        } else {
            ((C1839140xxY) agS210S0200000_27.l0).LLJI.clearAnimation();
        }
        TuxTextView tuxTextView2 = ((C1839140xxY) agS210S0200000_27.l0).LLILZ;
        if (iArr[c1839120xxW.LJI.ordinal()] == 1) {
            truncateAt = TextUtils.TruncateAt.MARQUEE;
        } else {
            truncateAt = TextUtils.TruncateAt.END;
        }
        tuxTextView2.setEllipsize(truncateAt);
        TuxTextView tuxTextView3 = ((C1839140xxY) agS210S0200000_27.l0).LLILZ;
        if (c1839120xxW.LJI == EnumC1839040xxO.PLAYING) {
            z = true;
        }
        tuxTextView3.setSelected(z);
        return Unit.LIZ;
    }

    public static final Object emit$1(AgS210S0200000_27 agS210S0200000_27, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        EnumC1839040xxO enumC1839040xxO;
        AbstractC1839080xxS abstractC1839080xxS = (AbstractC1839080xxS) obj;
        C2252321DDq c2252321DDq = ((RecommendMusicV2ViewModel) agS210S0200000_27.l0).LLILZIL;
        List<Music> list = ((MusicDetail) agS210S0200000_27.l1).recommendMusicList;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (Music music : list) {
            String musicName = music.getMusicName();
            String authorName = music.getAuthorName();
            int duration = music.getDuration();
            int userCount = music.getUserCount();
            String recommendTag = music.getRecommendTag();
            String strLIZ = C1838950xxF.LIZ(music.getCoverMedium());
            if (strLIZ == null && (strLIZ = C1838950xxF.LIZ(music.getCoverLarge())) == null) {
                strLIZ = C1838950xxF.LIZ(music.getCoverThumb());
            }
            if (abstractC1839080xxS instanceof C1839100xxU) {
                if (music.getId() == ((C1839100xxU) abstractC1839080xxS).LIZ.getId()) {
                    enumC1839040xxO = EnumC1839040xxO.PLAYING;
                } else {
                    enumC1839040xxO = EnumC1839040xxO.PAUSED;
                }
            } else if (abstractC1839080xxS instanceof C1839090xxT) {
                if (music.getId() == ((C1839090xxT) abstractC1839080xxS).LIZ.getId()) {
                    enumC1839040xxO = EnumC1839040xxO.LOADING;
                } else {
                    enumC1839040xxO = EnumC1839040xxO.PAUSED;
                }
            } else if (abstractC1839080xxS instanceof C1839110xxV) {
                enumC1839040xxO = EnumC1839040xxO.PAUSED;
            } else {
                throw new C1954807lC();
            }
            arrayList.add(new C1839120xxW(musicName, authorName, duration, userCount, recommendTag, strLIZ, enumC1839040xxO));
        }
        c2252321DDq.setValue(new C1006040cHq(arrayList, ((MusicDetail) agS210S0200000_27.l1).music.getMusicName(), true));
        if (abstractC1839080xxS instanceof C1839100xxU) {
            C15M8 c15m8 = new C15M8();
            MusicModel musicModel = ((C1839100xxU) abstractC1839080xxS).LIZ;
            if (musicModel != null) {
                c15m8.LJIIIIZZ(musicModel);
                c15m8.LJII("ttelite_BA_music_rec_select_play", "meta_song_id");
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$10(Y.AgS210S0200000_27 r7, java.lang.Object r8, X.InterfaceC1364105Vn r9) {
        /*
            boolean r0 = r9 instanceof X.C1787360wc2
            if (r0 == 0) goto L4e
            r6 = r9
            X.0wc2 r6 = (X.C1787360wc2) r6
            int r2 = r6.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4e
            int r2 = r2 - r1
            r6.LLILLJJLI = r2
        L12:
            java.lang.Object r1 = r6.LL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILLJJLI
            r4 = 1
            if (r0 == 0) goto L25
            if (r0 != r4) goto L54
            X.C155000ia.LIZIZ(r1)
        L22:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L25:
            X.C155000ia.LIZIZ(r1)
            java.lang.Object r3 = r7.l0
            X.01Wf r3 = (X.InterfaceC346701Wf) r3
            r2 = r8
            X.0V0f r2 = (X.C790750V0f) r2
            java.lang.Object r0 = r7.l1
            X.0wc1 r0 = (X.C1787350wc1) r0
            X.0wc5 r0 = r0.LIZJ
            java.util.Set r1 = r0.LIZ()
            X.0wdA r0 = r2.LIZLLL
            java.lang.String r0 = r0.LIZLLL
            boolean r0 = r1.contains(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L22
            r6.LLILLJJLI = r4
            java.lang.Object r0 = r3.emit(r8, r6)
            if (r0 != r5) goto L22
            return r5
        L4e:
            X.0wc2 r6 = new X.0wc2
            r6.<init>(r7, r9)
            goto L12
        L54:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS210S0200000_27.emit$10(Y.AgS210S0200000_27, java.lang.Object, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$11(Y.AgS210S0200000_27 r8, java.lang.Object r9, X.InterfaceC1364105Vn r10) {
        /*
            boolean r0 = r10 instanceof X.C1787340wc0
            if (r0 == 0) goto L6c
            r6 = r10
            X.0wc0 r6 = (X.C1787340wc0) r6
            int r2 = r6.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6c
            int r2 = r2 - r1
            r6.LLILLJJLI = r2
        L12:
            java.lang.Object r1 = r6.LL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILLJJLI
            r7 = 1
            if (r0 == 0) goto L25
            if (r0 != r7) goto L72
            X.C155000ia.LIZIZ(r1)
        L22:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L25:
            X.C155000ia.LIZIZ(r1)
            java.lang.Object r4 = r8.l0
            X.01Wf r4 = (X.InterfaceC346701Wf) r4
            r3 = r9
            X.0V0f r3 = (X.C790750V0f) r3
            java.lang.Object r0 = r8.l1
            X.0wc1 r0 = (X.C1787350wc1) r0
            X.0wc5 r0 = r0.LIZJ
            java.util.Set r1 = r0.LIZJ()
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L4f
            r0 = r1
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L4f
        L46:
            r6.LLILLJJLI = r7
            java.lang.Object r0 = r4.emit(r9, r6)
            if (r0 != r5) goto L22
            return r5
        L4f:
            java.util.Iterator r2 = r1.iterator()
        L53:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L46
            java.lang.Object r0 = r2.next()
            X.0qbT r0 = (X.C1556370qbT) r0
            java.lang.String r1 = r0.LIZ
            X.0wdA r0 = r3.LIZLLL
            java.lang.String r0 = r0.LIZLLL
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L53
            goto L22
        L6c:
            X.0wc0 r6 = new X.0wc0
            r6.<init>(r8, r10)
            goto L12
        L72:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS210S0200000_27.emit$11(Y.AgS210S0200000_27, java.lang.Object, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$12(Y.AgS210S0200000_27 r8, java.lang.Object r9, X.InterfaceC1364105Vn r10) {
        /*
            boolean r0 = r10 instanceof X.C1838590xwf
            if (r0 == 0) goto L43
            r7 = r10
            X.0xwf r7 = (X.C1838590xwf) r7
            int r2 = r7.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L43
            int r2 = r2 - r1
            r7.LLILLJJLI = r2
        L12:
            java.lang.Object r1 = r7.LL
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r7.LLILLJJLI
            r5 = 1
            if (r0 == 0) goto L25
            if (r0 != r5) goto L49
            X.C155000ia.LIZIZ(r1)
        L22:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L25:
            X.C155000ia.LIZIZ(r1)
            java.lang.Object r4 = r8.l0
            X.01Wf r4 = (X.InterfaceC346701Wf) r4
            X.01P0 r9 = (X.C01P0) r9
            java.lang.Object r3 = r8.l1
            X.0xwe r3 = (X.C1838580xwe) r3
            long r1 = r9.LIZ
            com.bytedance.android.livesdk.model.message.common.Text r0 = r9.LIZIZ
            X.0b87 r0 = r3.LIZIZ(r1, r0)
            r7.LLILLJJLI = r5
            java.lang.Object r0 = r4.emit(r0, r7)
            if (r0 != r6) goto L22
            return r6
        L43:
            X.0xwf r7 = new X.0xwf
            r7.<init>(r8, r10)
            goto L12
        L49:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS210S0200000_27.emit$12(Y.AgS210S0200000_27, java.lang.Object, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0160  */
    /* JADX WARN: Type inference failed for: r9v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$13(Y.AgS210S0200000_27 r23, java.lang.Object r24, X.InterfaceC1364105Vn r25) {
        /*
            Method dump skipped, instruction units count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS210S0200000_27.emit$13(Y.AgS210S0200000_27, java.lang.Object, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x011f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$14(Y.AgS210S0200000_27 r12, java.lang.Object r13, X.InterfaceC1364105Vn r14) {
        /*
            Method dump skipped, instruction units count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS210S0200000_27.emit$14(Y.AgS210S0200000_27, java.lang.Object, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0195  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$15(Y.AgS210S0200000_27 r9, java.lang.Object r10, X.InterfaceC1364105Vn r11) {
        /*
            Method dump skipped, instruction units count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS210S0200000_27.emit$15(Y.AgS210S0200000_27, java.lang.Object, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$16(Y.AgS210S0200000_27 r7, java.lang.Object r8, X.InterfaceC1364105Vn r9) {
        /*
            boolean r0 = r9 instanceof X.C1787280wbu
            if (r0 == 0) goto L5c
            r4 = r9
            X.0wbu r4 = (X.C1787280wbu) r4
            int r2 = r4.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5c
            int r2 = r2 - r1
            r4.LLILLJJLI = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLJJLI
            r5 = 1
            if (r0 == 0) goto L25
            if (r0 != r5) goto L62
            X.C155000ia.LIZIZ(r1)
        L22:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L25:
            X.C155000ia.LIZIZ(r1)
            java.lang.Object r2 = r7.l0
            X.01Wf r2 = (X.InterfaceC346701Wf) r2
            r6 = r8
            X.07Za r6 = (X.C1882807Za) r6
            java.lang.String r1 = r6.LIZ
            java.lang.String r0 = "web_cashier_mobile_event_payment_completed"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L22
            java.util.Map<java.lang.String, java.lang.Object> r1 = r6.LIZIZ
            if (r1 == 0) goto L5a
            java.lang.String r0 = "order_id"
            java.lang.Object r1 = r1.get(r0)
        L43:
            java.lang.Object r0 = r7.l1
            X.0wcn r0 = (X.C1787830wcn) r0
            X.0byM r0 = r0.LJFF
            java.lang.String r0 = r0.LIZIZ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L22
            r4.LLILLJJLI = r5
            java.lang.Object r0 = r2.emit(r8, r4)
            if (r0 != r3) goto L22
            return r3
        L5a:
            r1 = 0
            goto L43
        L5c:
            X.0wbu r4 = new X.0wbu
            r4.<init>(r7, r9)
            goto L12
        L62:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS210S0200000_27.emit$16(Y.AgS210S0200000_27, java.lang.Object, X.05Vn):java.lang.Object");
    }

    public static final Object emit$17(AgS210S0200000_27 agS210S0200000_27, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        Object value;
        AbstractC1557040qcY c1557020qcW;
        AbstractC1557040qcY abstractC1557040qcY = (AbstractC1557040qcY) obj;
        C2252321DDq c2252321DDq = ((ContactSelectViewModel) agS210S0200000_27.l0).LLILZ;
        IMAiGroupShotConfig.ContactSelectConfig.Selecting selecting = (IMAiGroupShotConfig.ContactSelectConfig.Selecting) agS210S0200000_27.l1;
        do {
            value = c2252321DDq.getValue();
            if (!Intrinsics.LJFF(abstractC1557040qcY, C1557030qcX.LIZIZ) && !Intrinsics.LJFF(abstractC1557040qcY, C1557050qcZ.LIZIZ)) {
                if (abstractC1557040qcY instanceof C1557020qcW) {
                    List<IMContact> list = ((C1557020qcW) abstractC1557040qcY).LIZIZ;
                    ArrayList arrayList = new ArrayList();
                    for (IMContact iMContact : list) {
                        if (selecting.contactFilter.getFilter().invoke(iMContact).booleanValue()) {
                            arrayList.add(iMContact);
                        }
                    }
                    c1557020qcW = new C1557020qcW(C13LP.LLIIII(arrayList));
                } else {
                    throw new C1954807lC();
                }
            } else {
                c1557020qcW = abstractC1557040qcY;
            }
        } while (!c2252321DDq.compareAndSet(value, c1557020qcW));
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$18(Y.AgS210S0200000_27 r7, java.lang.Object r8, X.InterfaceC1364105Vn r9) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS210S0200000_27.emit$18(Y.AgS210S0200000_27, java.lang.Object, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0141  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$19(Y.AgS210S0200000_27 r13, java.lang.Object r14, X.InterfaceC1364105Vn r15) {
        /*
            Method dump skipped, instruction units count: 514
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS210S0200000_27.emit$19(Y.AgS210S0200000_27, java.lang.Object, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$2(Y.AgS210S0200000_27 r5, java.lang.Object r6, X.InterfaceC1364105Vn r7) {
        /*
            boolean r0 = r7 instanceof X.C1813510xID
            if (r0 == 0) goto L3d
            r4 = r7
            X.0xID r4 = (X.C1813510xID) r4
            int r2 = r4.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3d
            int r2 = r2 - r1
            r4.LLILLJJLI = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLJJLI
            r2 = 1
            if (r0 == 0) goto L25
            if (r0 != r2) goto L43
            X.C155000ia.LIZIZ(r1)
        L22:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L25:
            X.C155000ia.LIZIZ(r1)
            java.lang.Object r1 = r5.l0
            X.01Wf r1 = (X.InterfaceC346701Wf) r1
            java.lang.Object r0 = r5.l1
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            java.lang.Object r0 = r0.invoke(r6)
            r4.LLILLJJLI = r2
            java.lang.Object r0 = r1.emit(r0, r4)
            if (r0 != r3) goto L22
            return r3
        L3d:
            X.0xID r4 = new X.0xID
            r4.<init>(r5, r7)
            goto L12
        L43:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS210S0200000_27.emit$2(Y.AgS210S0200000_27, java.lang.Object, X.05Vn):java.lang.Object");
    }

    public static final Object emit$3(AgS210S0200000_27 agS210S0200000_27, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        ((TextView) agS210S0200000_27.l0).setText(u.LJJIFFI(((CommerceMusicSubstituteMusicVideoFragment) agS210S0200000_27.l1).requireContext().getString(2131837752), "{sound_name}", (String) obj, false));
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$4(Y.AgS210S0200000_27 r7, java.lang.Object r8, X.InterfaceC1364105Vn r9) {
        /*
            boolean r0 = r9 instanceof X.C1790010wgJ
            if (r0 == 0) goto L4f
            r6 = r9
            X.0wgJ r6 = (X.C1790010wgJ) r6
            int r2 = r6.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4f
            int r2 = r2 - r1
            r6.LLILLJJLI = r2
        L12:
            java.lang.Object r1 = r6.LL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILLJJLI
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L28
            if (r0 == r3) goto L3e
            if (r0 != r4) goto L55
            X.C155000ia.LIZIZ(r1)
        L25:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L28:
            X.C155000ia.LIZIZ(r1)
            java.lang.Object r2 = r7.l0
            X.01Wf r2 = (X.InterfaceC346701Wf) r2
            java.lang.Object r0 = r7.l1
            X.0LzM r0 = (X.InterfaceC560980LzM) r0
            r6.LLILLL = r2
            r6.LLILLJJLI = r3
            java.lang.Object r1 = r0.LIZ(r8, r6)
            if (r1 != r5) goto L43
            return r5
        L3e:
            X.01Wf r2 = r6.LLILLL
            X.C155000ia.LIZIZ(r1)
        L43:
            r0 = 0
            r6.LLILLL = r0
            r6.LLILLJJLI = r4
            java.lang.Object r0 = r2.emit(r1, r6)
            if (r0 != r5) goto L25
            return r5
        L4f:
            X.0wgJ r6 = new X.0wgJ
            r6.<init>(r7, r9)
            goto L12
        L55:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS210S0200000_27.emit$4(Y.AgS210S0200000_27, java.lang.Object, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$5(Y.AgS210S0200000_27 r5, java.lang.Object r6, X.InterfaceC1364105Vn r7) {
        /*
            boolean r0 = r7 instanceof X.C1790840whe
            if (r0 == 0) goto L3d
            r4 = r7
            X.0whe r4 = (X.C1790840whe) r4
            int r2 = r4.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3d
            int r2 = r2 - r1
            r4.LLILLJJLI = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLJJLI
            r2 = 1
            if (r0 == 0) goto L25
            if (r0 != r2) goto L43
            X.C155000ia.LIZIZ(r1)
        L22:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L25:
            X.C155000ia.LIZIZ(r1)
            java.lang.Object r1 = r5.l0
            X.01Wf r1 = (X.InterfaceC346701Wf) r1
            java.lang.Object r0 = r5.l1
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            java.lang.Object r0 = r0.invoke(r6)
            r4.LLILLJJLI = r2
            java.lang.Object r0 = r1.emit(r0, r4)
            if (r0 != r3) goto L22
            return r3
        L3d:
            X.0whe r4 = new X.0whe
            r4.<init>(r5, r7)
            goto L12
        L43:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS210S0200000_27.emit$5(Y.AgS210S0200000_27, java.lang.Object, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$6(Y.AgS210S0200000_27 r5, java.lang.Object r6, X.InterfaceC1364105Vn r7) {
        /*
            boolean r0 = r7 instanceof X.C1787490wcF
            if (r0 == 0) goto L47
            r4 = r7
            X.0wcF r4 = (X.C1787490wcF) r4
            int r2 = r4.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L47
            int r2 = r2 - r1
            r4.LLILLJJLI = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLJJLI
            r2 = 1
            if (r0 == 0) goto L25
            if (r0 != r2) goto L4d
            X.C155000ia.LIZIZ(r1)
        L22:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L25:
            X.C155000ia.LIZIZ(r1)
            java.lang.Object r1 = r5.l0
            X.01Wf r1 = (X.InterfaceC346701Wf) r1
            java.lang.Object r0 = r5.l1
            X.0wcD r0 = (X.C1787470wcD) r0
            X.0wc5 r0 = r0.LIZIZ
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.LIZIZ()
            boolean r0 = r0.get()
            r0 = r0 ^ 1
            if (r0 == 0) goto L22
            r4.LLILLJJLI = r2
            java.lang.Object r0 = r1.emit(r6, r4)
            if (r0 != r3) goto L22
            return r3
        L47:
            X.0wcF r4 = new X.0wcF
            r4.<init>(r5, r7)
            goto L12
        L4d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS210S0200000_27.emit$6(Y.AgS210S0200000_27, java.lang.Object, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$7(Y.AgS210S0200000_27 r8, java.lang.Object r9, X.InterfaceC1364105Vn r10) {
        /*
            boolean r0 = r10 instanceof X.C1787460wcC
            if (r0 == 0) goto L6c
            r6 = r10
            X.0wcC r6 = (X.C1787460wcC) r6
            int r2 = r6.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6c
            int r2 = r2 - r1
            r6.LLILLJJLI = r2
        L12:
            java.lang.Object r1 = r6.LL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILLJJLI
            r7 = 1
            if (r0 == 0) goto L25
            if (r0 != r7) goto L72
            X.C155000ia.LIZIZ(r1)
        L22:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L25:
            X.C155000ia.LIZIZ(r1)
            java.lang.Object r4 = r8.l0
            X.01Wf r4 = (X.InterfaceC346701Wf) r4
            r3 = r9
            X.0V0f r3 = (X.C790750V0f) r3
            java.lang.Object r0 = r8.l1
            X.0wcD r0 = (X.C1787470wcD) r0
            X.0wc5 r0 = r0.LIZIZ
            java.util.Set r1 = r0.LIZJ()
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L47
            r0 = r1
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L47
            goto L22
        L47:
            java.util.Iterator r2 = r1.iterator()
        L4b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L22
            java.lang.Object r0 = r2.next()
            X.0qbT r0 = (X.C1556370qbT) r0
            java.lang.String r1 = r0.LIZ
            X.0wdA r0 = r3.LIZLLL
            java.lang.String r0 = r0.LIZLLL
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L4b
            r6.LLILLJJLI = r7
            java.lang.Object r0 = r4.emit(r9, r6)
            if (r0 != r5) goto L22
            return r5
        L6c:
            X.0wcC r6 = new X.0wcC
            r6.<init>(r8, r10)
            goto L12
        L72:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS210S0200000_27.emit$7(Y.AgS210S0200000_27, java.lang.Object, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$8(Y.AgS210S0200000_27 r9, java.lang.Object r10, X.InterfaceC1364105Vn r11) {
        /*
            boolean r0 = r11 instanceof X.C1787480wcE
            if (r0 == 0) goto L86
            r5 = r11
            X.0wcE r5 = (X.C1787480wcE) r5
            int r2 = r5.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L86
            int r2 = r2 - r1
            r5.LLILLJJLI = r2
        L12:
            java.lang.Object r1 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLJJLI
            r6 = 1
            if (r0 == 0) goto L25
            if (r0 != r6) goto L8c
            X.C155000ia.LIZIZ(r1)
        L22:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L25:
            X.C155000ia.LIZIZ(r1)
            java.lang.Object r3 = r9.l0
            X.01Wf r3 = (X.InterfaceC346701Wf) r3
            X.0V0f r10 = (X.C790750V0f) r10
            java.lang.Object r0 = r9.l1
            X.0wcD r0 = (X.C1787470wcD) r0
            X.0wc5 r0 = r0.LIZIZ
            java.util.Set r0 = r0.LIZJ()
            java.util.Iterator r2 = r0.iterator()
        L3c:
            boolean r0 = r2.hasNext()
            r8 = 0
            if (r0 == 0) goto L84
            java.lang.Object r7 = r2.next()
            r0 = r7
            X.0qbT r0 = (X.C1556370qbT) r0
            java.lang.String r1 = r0.LIZ
            X.0wdA r0 = r10.LIZLLL
            java.lang.String r0 = r0.LIZLLL
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L3c
        L56:
            X.0qbT r7 = (X.C1556370qbT) r7
            if (r7 == 0) goto L7b
            java.lang.Object r0 = r9.l1
            X.0wcD r0 = (X.C1787470wcD) r0
            X.0wc5 r0 = r0.LIZIZ
            java.util.Set r0 = r0.LIZJ()
            r0.remove(r7)
            X.0wdC r8 = new X.0wdC
            X.0wcH r2 = X.EnumC1787510wcH.PENDING_RESTORE
            X.0wU8 r1 = X.EnumC1782450wU7.Companion
            java.lang.String r0 = r7.LIZIZ
            r1.getClass()
            X.0wU7 r1 = X.C1782460wU8.LIZ(r0)
            X.0wdA r0 = r10.LIZLLL
            r8.<init>(r2, r1, r0)
        L7b:
            r5.LLILLJJLI = r6
            java.lang.Object r0 = r3.emit(r8, r5)
            if (r0 != r4) goto L22
            return r4
        L84:
            r7 = r8
            goto L56
        L86:
            X.0wcE r5 = new X.0wcE
            r5.<init>(r9, r11)
            goto L12
        L8c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS210S0200000_27.emit$8(Y.AgS210S0200000_27, java.lang.Object, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$9(Y.AgS210S0200000_27 r5, java.lang.Object r6, X.InterfaceC1364105Vn r7) {
        /*
            boolean r0 = r7 instanceof X.C1787380wc4
            if (r0 == 0) goto L47
            r4 = r7
            X.0wc4 r4 = (X.C1787380wc4) r4
            int r2 = r4.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L47
            int r2 = r2 - r1
            r4.LLILLJJLI = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLJJLI
            r2 = 1
            if (r0 == 0) goto L25
            if (r0 != r2) goto L4d
            X.C155000ia.LIZIZ(r1)
        L22:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L25:
            X.C155000ia.LIZIZ(r1)
            java.lang.Object r1 = r5.l0
            X.01Wf r1 = (X.InterfaceC346701Wf) r1
            java.lang.Object r0 = r5.l1
            X.0wc1 r0 = (X.C1787350wc1) r0
            X.0wc5 r0 = r0.LIZJ
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.LIZIZ()
            boolean r0 = r0.get()
            r0 = r0 ^ 1
            if (r0 == 0) goto L22
            r4.LLILLJJLI = r2
            java.lang.Object r0 = r1.emit(r6, r4)
            if (r0 != r3) goto L22
            return r3
        L47:
            X.0wc4 r4 = new X.0wc4
            r4.<init>(r5, r7)
            goto L12
        L4d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS210S0200000_27.emit$9(Y.AgS210S0200000_27, java.lang.Object, X.05Vn):java.lang.Object");
    }
}
