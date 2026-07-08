package Y;

import X.AbstractC1335900krs;
import X.AbstractC1604130rqV;
import X.C013C;
import X.C03IT;
import X.C0IDB;
import X.C0IJT;
import X.C0JBN;
import X.C1161920gLG;
import X.C11QJ;
import X.C1239520iMQ;
import X.C1324720kZq;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1390410mHn;
import X.C1441880nco;
import X.C1701940uOG;
import X.C1819620xS4;
import X.C19383610sU;
import X.C19385010si;
import X.C19385710sp;
import X.C19386210su;
import X.C19417410xw;
import X.C19417510xx;
import X.C19591211ks;
import X.C19625211qM;
import X.C19722512El;
import X.C19745112Nd;
import X.C19755412Rc;
import X.C1AEZ;
import X.C20280014Ww;
import X.C20441214yg;
import X.C2188811AlT;
import X.C337180DJs;
import X.C474500IjA;
import X.C497740JfY;
import X.C705930RmZ;
import X.C786410Ut5;
import X.C844470XAv;
import X.EnumC19384410sc;
import X.EnumC19385810sq;
import X.InterfaceC177000m8;
import X.InterfaceC19755712Rf;
import X.InterfaceC781210Ukh;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.bytedance.als.extensions.LifecycleOwnerExtensionsKt;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.RoomStats;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostFrescoHelper;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.NewLiveRoomStruct;
import com.ss.android.ugc.aweme.live.liveshare.LiveShareStickerViewModel;
import com.ss.android.ugc.aweme.pipfeed.vm.PipFeedWindowVM;
import com.ss.android.ugc.aweme.shortvideo.model.AnchorPublishStruct;
import com.ss.android.ugc.aweme.story.note.StoryThoughtAvatarCreationVM;
import com.ss.android.ugc.aweme.story.note.StoryThoughtAvatarGeneratedFragment;
import com.ss.android.ugc.aweme.tools.sticker.core.chatroom.DMGroupChatStickerModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS430S0200000_29;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public class AObserverS189S0200000_29 implements Observer {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                break;
            case 1:
                onChanged$1(this, obj);
                break;
            case 2:
                onChanged$2(this, obj);
                break;
            case 3:
                onChanged$3(this, obj);
                break;
            case 4:
                onChanged$4(this, obj);
                break;
            case 5:
                onChanged$5(this, obj);
                break;
            case 6:
                onChanged$6(this, obj);
                break;
            case 7:
                onChanged$7(this, obj);
                break;
            case 8:
                onChanged$8(this, obj);
                break;
        }
    }

    public static final void onChanged$0(AObserverS189S0200000_29 aObserverS189S0200000_29, Object obj) {
        List list = (List) obj;
        if (list != null && !list.isEmpty()) {
            C1331670kl3 c1331670kl3LJIIJ = C1331660kl2.LJIIJ(new C03IT(list));
            c1331670kl3LJIIJ.LJJ(((C19745112Nd) aObserverS189S0200000_29.l0).LLILLJJLI);
            final StoryThoughtAvatarGeneratedFragment storyThoughtAvatarGeneratedFragment = (StoryThoughtAvatarGeneratedFragment) aObserverS189S0200000_29.l1;
            c1331670kl3LJIIJ.LJIIJ(new AbstractC1335900krs() { // from class: X.12Ne
                @Override // X.InterfaceC427850Gq7
                public final void cm(Uri uri, View view, Throwable th) {
                }

                @Override // X.AbstractC1335900krs, X.InterfaceC427850Gq7
                public final void Bh(Uri uri, View view) {
                    super.Bh(uri, view);
                }

                @Override // X.InterfaceC427850Gq7
                public final void Ad(Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
                    C21647019ng c21647019ngSR;
                    MediaPlayer mediaPlayer;
                    C21647019ng c21647019ngSR2;
                    StoryThoughtAvatarGeneratedFragment storyThoughtAvatarGeneratedFragment2 = storyThoughtAvatarGeneratedFragment;
                    C19745112Nd c19745112Nd = storyThoughtAvatarGeneratedFragment2.LLIZLLLIL;
                    if (c19745112Nd != null) {
                        T value = ((StoryThoughtAvatarCreationVM) storyThoughtAvatarGeneratedFragment2.LLIZ.getValue()).LLJZ.getValue();
                        Boolean bool = Boolean.TRUE;
                        if (Intrinsics.LJFF(value, bool) && Intrinsics.LJFF(((StoryThoughtAvatarCreationVM) storyThoughtAvatarGeneratedFragment2.LLIZ.getValue()).LLLLLJLJLL.getValue(), bool)) {
                            c19745112Nd.LLILZ.cancelAnimation();
                            C786410Ut5.LJLLLLLL(8, c19745112Nd.LLILZ);
                            SmartImageView smartImageView = c19745112Nd.LLILLJJLI;
                            C786410Ut5.LJLLLLLL(0, smartImageView);
                            C786410Ut5.u5(smartImageView, 1.0f);
                            C786410Ut5.fc(smartImageView, 1.0f);
                            C786410Ut5.Bc(smartImageView, 1.0f);
                            return;
                        }
                        Context context = storyThoughtAvatarGeneratedFragment2.getContext();
                        C21647019ng c21647019ngSR3 = null;
                        if (context != null) {
                            C786410Ut5.LJLLLLLL(0, c19745112Nd.LLILLJJLI);
                            c21647019ngSR = storyThoughtAvatarGeneratedFragment2.SR(context, c19745112Nd.LLILLJJLI, StoryThoughtAvatarGeneratedFragment.UR(new Pair(Float.valueOf(0.0f), Float.valueOf(1.0f)), new Pair(Float.valueOf(0.8f), Float.valueOf(1.0f))));
                        } else {
                            c21647019ngSR = null;
                        }
                        Context context2 = storyThoughtAvatarGeneratedFragment2.getContext();
                        if (context2 != null) {
                            c21647019ngSR3 = storyThoughtAvatarGeneratedFragment2.SR(context2, c19745112Nd.LLILZ, StoryThoughtAvatarGeneratedFragment.UR(new Pair(Float.valueOf(1.0f), Float.valueOf(0.0f)), new Pair(Float.valueOf(1.0f), Float.valueOf(1.0f))));
                        }
                        if (c21647019ngSR != null) {
                            final AwS573S0100000_29 awS573S0100000_29 = new AwS573S0100000_29(c19745112Nd, 1124);
                            c21647019ngSR.LIZJ("alpha", new InterfaceC21641019mi() { // from class: X.12Nf
                                @Override // X.InterfaceC21641019mi
                                public final void LIZIZ(InterfaceC1844880y6o interfaceC1844880y6o) {
                                }

                                @Override // X.InterfaceC21641019mi
                                public final void LIZ(InterfaceC1844880y6o interfaceC1844880y6o) {
                                    awS573S0100000_29.invoke();
                                }
                            });
                        }
                        if (c21647019ngSR3 != null) {
                            final AwS573S0100000_29 awS573S0100000_292 = new AwS573S0100000_29(c19745112Nd, 1125);
                            c21647019ngSR3.LIZJ("alpha", new InterfaceC21641019mi() { // from class: X.12Nf
                                @Override // X.InterfaceC21641019mi
                                public final void LIZIZ(InterfaceC1844880y6o interfaceC1844880y6o) {
                                }

                                @Override // X.InterfaceC21641019mi
                                public final void LIZ(InterfaceC1844880y6o interfaceC1844880y6o) {
                                    awS573S0100000_292.invoke();
                                }
                            });
                        }
                        if (c21647019ngSR3 != null) {
                            c21647019ngSR3.LJI(true);
                        }
                        if (c21647019ngSR != null) {
                            c21647019ngSR.LIZLLL(240L);
                            c21647019ngSR.LJI(true);
                        }
                        if (!C298600Bn8.LIZ()) {
                            return;
                        }
                        Context context3 = storyThoughtAvatarGeneratedFragment2.getContext();
                        if (context3 != null && (c21647019ngSR2 = storyThoughtAvatarGeneratedFragment2.SR(context3, c19745112Nd.LLILLL, StoryThoughtAvatarGeneratedFragment.UR(new Pair(Float.valueOf(1.0f), Float.valueOf(0.0f)), new Pair(Float.valueOf(1.0f), Float.valueOf(0.0f))))) != null) {
                            final AwS430S0200000_29 awS430S0200000_29 = new AwS430S0200000_29(c21647019ngSR2, c19745112Nd, 132);
                            c21647019ngSR2.LIZJ("alpha", new InterfaceC21641019mi() { // from class: X.12Nf
                                @Override // X.InterfaceC21641019mi
                                public final void LIZIZ(InterfaceC1844880y6o interfaceC1844880y6o) {
                                }

                                @Override // X.InterfaceC21641019mi
                                public final void LIZ(InterfaceC1844880y6o interfaceC1844880y6o) {
                                    awS430S0200000_29.invoke();
                                }
                            });
                            c21647019ngSR2.LJI(true);
                        }
                        Context context4 = storyThoughtAvatarGeneratedFragment2.getContext();
                        if (context4 != null) {
                            new C0ZDN(context4).LIZ(2);
                        }
                        if (!storyThoughtAvatarGeneratedFragment2.LLJILLL || (mediaPlayer = storyThoughtAvatarGeneratedFragment2.LLJILJILJ) == null) {
                            return;
                        }
                        try {
                            if (mediaPlayer.isPlaying()) {
                                MediaPlayer mediaPlayer2 = storyThoughtAvatarGeneratedFragment2.LLJILJILJ;
                                if (mediaPlayer2 == null) {
                                    return;
                                }
                                mediaPlayer2.seekTo(0);
                                return;
                            }
                            MediaPlayer mediaPlayer3 = storyThoughtAvatarGeneratedFragment2.LLJILJILJ;
                            if (mediaPlayer3 == null) {
                                return;
                            }
                            mediaPlayer3.start();
                        } catch (IllegalStateException e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                }
            });
        }
    }

    public static final void onChanged$1(AObserverS189S0200000_29 aObserverS189S0200000_29, Object obj) {
        C19722512El c19722512El = (C19722512El) aObserverS189S0200000_29.l0;
        LifecycleOwnerExtensionsKt.LIZJ(c19722512El, new ARunnableS98S0200000_29((C1441880nco) aObserverS189S0200000_29.l1, c19722512El, 37));
    }

    public static final void onChanged$2(AObserverS189S0200000_29 aObserverS189S0200000_29, Object obj) {
        float f;
        Boolean bool = (Boolean) obj;
        if (bool != null) {
            AnchorPublishStruct anchorPublishStruct = (AnchorPublishStruct) aObserverS189S0200000_29.l0;
            C19417510xx c19417510xx = (C19417510xx) aObserverS189S0200000_29.l1;
            boolean zBooleanValue = bool.booleanValue();
            if (!anchorPublishStruct.extensionMisc.isImageMode()) {
                ConstraintLayout constraintLayout = c19417510xx.LLILZ;
                if (zBooleanValue) {
                    f = 1.0f;
                } else {
                    f = 0.34f;
                }
                C786410Ut5.c5(constraintLayout, f);
                if (!zBooleanValue) {
                    C337180DJs.LIZ(c19417510xx.LLJI);
                }
            }
        }
    }

    public static final void onChanged$3(AObserverS189S0200000_29 aObserverS189S0200000_29, Object obj) {
        float f;
        Boolean bool = (Boolean) obj;
        if (bool != null) {
            AnchorPublishStruct anchorPublishStruct = (AnchorPublishStruct) aObserverS189S0200000_29.l0;
            C19417410xw c19417410xw = (C19417410xw) aObserverS189S0200000_29.l1;
            boolean zBooleanValue = bool.booleanValue();
            if (!anchorPublishStruct.extensionMisc.isImageMode()) {
                View view = c19417410xw.LLJILJIL;
                if (zBooleanValue) {
                    f = 1.0f;
                } else {
                    f = 0.34f;
                }
                C786410Ut5.T4(view, f);
            }
        }
    }

    public static final void onChanged$4(AObserverS189S0200000_29 aObserverS189S0200000_29, Object obj) {
        EnumC19384410sc enumC19384410sc = (EnumC19384410sc) obj;
        if (enumC19384410sc != null) {
            HandlerHook.viewPostDelay((View) aObserverS189S0200000_29.l0, new ARunnableS98S0200000_29((C19383610sU) aObserverS189S0200000_29.l1, enumC19384410sc, 61), 400L);
        }
    }

    public static final void onChanged$5(AObserverS189S0200000_29 aObserverS189S0200000_29, Object obj) {
        int i;
        ColorDrawable colorDrawable;
        EnumC19385810sq enumC19385810sq = (EnumC19385810sq) obj;
        if (enumC19385810sq != null) {
            ViewGroup viewGroup = null;
            View view = null;
            TuxTextView tuxTextView = null;
            C1390410mHn c1390410mHn = null;
            ViewGroup viewGroup2 = null;
            switch (C19385710sp.LIZ[enumC19385810sq.ordinal()]) {
                case 1:
                    View view2 = ((C19385010si) aObserverS189S0200000_29.l0).LLJI;
                    if (view2 == null) {
                        view2 = null;
                    }
                    C786410Ut5.LJLLLLLL(4, view2);
                    ViewGroup viewGroup3 = ((C19385010si) aObserverS189S0200000_29.l0).LLILZLL;
                    if (viewGroup3 != null) {
                        viewGroup = viewGroup3;
                    }
                    C786410Ut5.LJLZ(8, viewGroup);
                    break;
                case 2:
                    C19385010si c19385010si = (C19385010si) aObserverS189S0200000_29.l0;
                    C1390410mHn c1390410mHn2 = c19385010si.LLJ;
                    if (c1390410mHn2 == null) {
                        c1390410mHn2 = null;
                    }
                    C786410Ut5.LLLZZIL(c1390410mHn2, 8);
                    TuxIconView tuxIconView = c19385010si.LLIZ;
                    if (tuxIconView == null) {
                        tuxIconView = null;
                    }
                    C786410Ut5.LLLLLLZZ(tuxIconView, 0);
                    tuxIconView.setIconRes(R.raw.icon_large_refresh);
                    tuxIconView.setTintColorRes(R.attr.eg);
                    TuxTextView tuxTextView2 = c19385010si.LLIZLLLIL;
                    if (tuxTextView2 == null) {
                        tuxTextView2 = null;
                    }
                    C786410Ut5.LLLLZLL(tuxTextView2, 0);
                    C19386210su value = ((PipFeedWindowVM) c19385010si.LLJILJIL.getValue()).LL.getValue();
                    if (value != null && value.LIZIZ) {
                        i = R.string.m25;
                    } else {
                        i = 2131829444;
                    }
                    Resources resources = c19385010si.LLILZ;
                    if (resources == null) {
                        C844470XAv.LIZ.getClass();
                        resources = C844470XAv.LIZ().getResources();
                    }
                    tuxTextView2.setText(resources.getString(i));
                    tuxTextView2.setTextColorRes(R.attr.ef);
                    ViewGroup viewGroup4 = c19385010si.LLILZLL;
                    if (viewGroup4 != null) {
                        viewGroup2 = viewGroup4;
                    }
                    viewGroup2.setBackground(new ColorDrawable(c19385010si.LJII(R.attr.e1)));
                    c19385010si.LJIILLIIL();
                    c19385010si.LJIILL();
                    break;
                case 3:
                case 4:
                    C786410Ut5.LJLLLLLL(0, (View) aObserverS189S0200000_29.l1);
                    ViewGroup viewGroup5 = ((C19385010si) aObserverS189S0200000_29.l0).LLILZLL;
                    if (viewGroup5 == null) {
                        viewGroup5 = null;
                    }
                    C786410Ut5.LJLZ(0, viewGroup5);
                    C1390410mHn c1390410mHn3 = ((C19385010si) aObserverS189S0200000_29.l0).LLJ;
                    if (c1390410mHn3 == null) {
                        c1390410mHn3 = null;
                    }
                    C786410Ut5.LLLZZIL(c1390410mHn3, 0);
                    TuxIconView tuxIconView2 = ((C19385010si) aObserverS189S0200000_29.l0).LLIZ;
                    if (tuxIconView2 == null) {
                        tuxIconView2 = null;
                    }
                    C786410Ut5.LLLLLLZZ(tuxIconView2, 8);
                    TuxTextView tuxTextView3 = ((C19385010si) aObserverS189S0200000_29.l0).LLIZLLLIL;
                    if (tuxTextView3 == null) {
                        tuxTextView3 = null;
                    }
                    C786410Ut5.LLLLZLL(tuxTextView3, 8);
                    ViewGroup viewGroup6 = ((C19385010si) aObserverS189S0200000_29.l0).LLILZLL;
                    if (viewGroup6 == null) {
                        viewGroup6 = null;
                    }
                    if (enumC19385810sq == EnumC19385810sq.LOADING_BLACKOUT) {
                        colorDrawable = new ColorDrawable(((C19385010si) aObserverS189S0200000_29.l0).LJII(R.attr.e1));
                    } else {
                        colorDrawable = null;
                    }
                    viewGroup6.setBackground(colorDrawable);
                    C1390410mHn c1390410mHn4 = ((C19385010si) aObserverS189S0200000_29.l0).LLJ;
                    if (c1390410mHn4 != null) {
                        c1390410mHn = c1390410mHn4;
                    }
                    c1390410mHn.LIZJ();
                    break;
                case 5:
                    C19385010si c19385010si2 = (C19385010si) aObserverS189S0200000_29.l0;
                    C1390410mHn c1390410mHn5 = c19385010si2.LLJ;
                    if (c1390410mHn5 == null) {
                        c1390410mHn5 = null;
                    }
                    C786410Ut5.LLLZZIL(c1390410mHn5, 8);
                    TuxIconView tuxIconView3 = c19385010si2.LLIZ;
                    if (tuxIconView3 == null) {
                        tuxIconView3 = null;
                    }
                    C786410Ut5.LLLLLLZZ(tuxIconView3, 0);
                    tuxIconView3.setIconRes(R.raw.icon_2pt_hourglass);
                    tuxIconView3.setTintColorRes(R.attr.a1j);
                    ViewGroup viewGroup7 = c19385010si2.LLILZLL;
                    if (viewGroup7 == null) {
                        viewGroup7 = null;
                    }
                    viewGroup7.setBackground(new ColorDrawable(c19385010si2.LJII(R.attr.bx)));
                    TuxTextView tuxTextView4 = c19385010si2.LLIZLLLIL;
                    if (tuxTextView4 != null) {
                        tuxTextView = tuxTextView4;
                    }
                    C786410Ut5.LLLLZLL(tuxTextView, 0);
                    Resources resources2 = c19385010si2.LLILZ;
                    if (resources2 == null) {
                        C844470XAv.LIZ.getClass();
                        resources2 = C844470XAv.LIZ().getResources();
                    }
                    tuxTextView.setText(resources2.getString(2131840069));
                    tuxTextView.setTextColorRes(R.attr.a1h);
                    c19385010si2.LJIILLIIL();
                    c19385010si2.LJIILL();
                    break;
                case 6:
                    C19385010si c19385010si3 = (C19385010si) aObserverS189S0200000_29.l0;
                    View view3 = c19385010si3.LLJI;
                    if (view3 == null) {
                        view3 = null;
                    }
                    C786410Ut5.LJLLLLLL(0, view3);
                    ViewGroup viewGroup8 = c19385010si3.LLILZLL;
                    if (viewGroup8 == null) {
                        viewGroup8 = null;
                    }
                    C786410Ut5.LJLZ(8, viewGroup8);
                    View view4 = c19385010si3.LLJI;
                    if (view4 != null) {
                        view = view4;
                    }
                    C786410Ut5.T4(view, 0.0f);
                    AnimatorSet animatorSet = new AnimatorSet();
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    valueAnimatorOfFloat.setDuration(100L);
                    valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
                    valueAnimatorOfFloat.addUpdateListener(new AUListenerS277S0100000_29(c19385010si3, 22));
                    AnimatorSet.Builder builderPlay = animatorSet.play(valueAnimatorOfFloat);
                    ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
                    valueAnimatorOfFloat2.setDuration(100L);
                    valueAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
                    valueAnimatorOfFloat2.addUpdateListener(new AUListenerS277S0100000_29(c19385010si3, 23));
                    valueAnimatorOfFloat2.addListener(new ALAdapterS24S0100000_29(c19385010si3, 23));
                    builderPlay.before(valueAnimatorOfFloat2);
                    animatorSet.start();
                    break;
            }
        }
        ((C19385010si) aObserverS189S0200000_29.l0).getClass();
        ((AbstractC1604130rqV) ((C19385010si) aObserverS189S0200000_29.l0).LLJILLL.getValue()).LJIIJJI(new AwS568S0100000_24(enumC19385810sq, 1725));
    }

    public static final void onChanged$6(AObserverS189S0200000_29 aObserverS189S0200000_29, Object obj) {
        Long l = (Long) obj;
        if (l != null) {
            l.longValue();
            InterfaceC19755712Rf interfaceC19755712Rf = ((C19755412Rc) aObserverS189S0200000_29.l0).LJIIIIZZ;
            if (interfaceC19755712Rf != null && -1 == interfaceC19755712Rf.LIZJ((int) l.longValue())) {
                ((Function1) aObserverS189S0200000_29.l1).invoke(Boolean.TRUE);
            } else {
                ((Function1) aObserverS189S0200000_29.l1).invoke(Boolean.FALSE);
            }
        }
    }

    public static final void onChanged$7(AObserverS189S0200000_29 aObserverS189S0200000_29, Object obj) {
        C705930RmZ c705930RmZ;
        if (((Boolean) obj).booleanValue()) {
            C20280014Ww c20280014Ww = (C20280014Ww) aObserverS189S0200000_29.l0;
            DMGroupChatStickerModel dMGroupChatStickerModel = (DMGroupChatStickerModel) aObserverS189S0200000_29.l1;
            if (!c20280014Ww.LLILZIL) {
                c20280014Ww.LLILZIL = true;
                C19591211ks interactStickerContainerCommonParam = c20280014Ww.getInteractStickerContainerCommonParam();
                if (interactStickerContainerCommonParam != null) {
                    c705930RmZ = interactStickerContainerCommonParam.LJFF;
                } else {
                    c705930RmZ = null;
                }
                C1239520iMQ.LIZ("group_chat_sticker_show", dMGroupChatStickerModel, c705930RmZ);
            }
        }
    }

    public static final void onChanged$8(AObserverS189S0200000_29 aObserverS189S0200000_29, Object obj) {
        MutableLiveData<Room> mutableLiveData;
        Room value;
        LiveRoomStruct liveRoomStructRoomStructConstructor;
        View viewFindViewById;
        View viewFindViewById2;
        TextView textView;
        TextView textView2;
        final C1324720kZq c1324720kZq;
        ImageModel avatarThumb;
        int totalUser;
        int totalUser2;
        CharSequence text;
        MutableLiveData<Boolean> mutableLiveData2;
        String string;
        String string2;
        LiveRoomStruct liveRoomStruct;
        Long lValueOf;
        Long lValueOf2;
        NewLiveRoomStruct newLiveRoomStruct;
        final Boolean bool = (Boolean) obj;
        LiveShareStickerViewModel liveShareStickerViewModel = ((C19625211qM) aObserverS189S0200000_29.l0).LLJILLL;
        if (liveShareStickerViewModel != null && (mutableLiveData = liveShareStickerViewModel.LLILLJJLI) != null && (value = mutableLiveData.getValue()) != null) {
            final C19625211qM c19625211qM = (C19625211qM) aObserverS189S0200000_29.l0;
            C013C c013c = (C013C) aObserverS189S0200000_29.l1;
            NewLiveRoomStruct newLiveRoomStructLIZIZ = C1AEZ.LIZIZ(value);
            c19625211qM.LLJJJJLIIL = newLiveRoomStructLIZIZ;
            ImageModel avatarLarge = null;
            if (newLiveRoomStructLIZIZ != null) {
                liveRoomStructRoomStructConstructor = newLiveRoomStructLIZIZ.roomStructConstructor();
            } else {
                liveRoomStructRoomStructConstructor = null;
            }
            c19625211qM.LLJJJJJIL = liveRoomStructRoomStructConstructor;
            if (!c013c.element) {
                c013c.element = true;
                if (!c19625211qM.LLJJ || (newLiveRoomStruct = c19625211qM.LLJJJJLIIL) == null || newLiveRoomStruct.ownerUserId != UserService.getInstance().user().getCurrentUserId()) {
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_show");
                    LiveRoomStruct liveRoomStruct2 = c19625211qM.LLJJJJJIL;
                    if (liveRoomStruct2 != null) {
                        lValueOf = Long.valueOf(liveRoomStruct2.getAnchorId());
                    } else {
                        lValueOf = null;
                    }
                    c474500IjALIZ.LJJII(String.valueOf(lValueOf), "anchor_id");
                    LiveRoomStruct liveRoomStruct3 = c19625211qM.LLJJJJJIL;
                    if (liveRoomStruct3 != null) {
                        lValueOf2 = Long.valueOf(liveRoomStruct3.id);
                    } else {
                        lValueOf2 = null;
                    }
                    c474500IjALIZ.LJJII(String.valueOf(lValueOf2), "room_id");
                    c474500IjALIZ.LJJII(c19625211qM.getEnterMethod(), "enter_method");
                    c474500IjALIZ.LJJII("story_live", "enter_from_merge");
                    c474500IjALIZ.LIZ();
                }
            }
            if (bool.booleanValue()) {
                c19625211qM.LJIIIIZZ(value, null);
            } else {
                C20441214yg.LIZIZ("LiveShareSticker", "showLiveEndView");
                c19625211qM.LLJJLIIIJLLLLLLLZ = true;
                C19591211ks interactStickerContainerCommonParam = c19625211qM.getInteractStickerContainerCommonParam();
                if (interactStickerContainerCommonParam != null && (mutableLiveData2 = interactStickerContainerCommonParam.LJIILIIL) != null && Intrinsics.LJFF(mutableLiveData2.getValue(), Boolean.TRUE)) {
                    Long l = c19625211qM.LLJJIII;
                    String str = CardStruct.IStatusCode.DEFAULT;
                    if (l == null || (string = l.toString()) == null) {
                        string = CardStruct.IStatusCode.DEFAULT;
                    }
                    LiveRoomStruct liveRoomStruct4 = c19625211qM.LLJJJJJIL;
                    if (liveRoomStruct4 != null && (string2 = Long.valueOf(liveRoomStruct4.getAnchorId()).toString()) != null) {
                        str = string2;
                    }
                    c19625211qM.LJI(System.currentTimeMillis() - c19625211qM.LLJLIL, string, str);
                }
                C1390410mHn c1390410mHn = c19625211qM.LLJLL;
                if (c1390410mHn != null) {
                    c1390410mHn.LIZLLL();
                }
                C1390410mHn c1390410mHn2 = c19625211qM.LLJLL;
                if (c1390410mHn2 != null) {
                    C786410Ut5.LLLZZIL(c1390410mHn2, 8);
                }
                FrameLayout frameLayout = c19625211qM.LLIZLLLIL;
                if (frameLayout != null) {
                    C786410Ut5.LJZ(4, frameLayout);
                }
                View view = c19625211qM.LLILZIL;
                if (view != null) {
                    viewFindViewById = view.findViewById(R.id.n7q);
                } else {
                    viewFindViewById = null;
                }
                View view2 = c19625211qM.LLILZIL;
                if (view2 != null) {
                    viewFindViewById2 = view2.findViewById(R.id.n7o);
                } else {
                    viewFindViewById2 = null;
                }
                View view3 = c19625211qM.LLILZIL;
                if (view3 != null) {
                    textView = (TextView) view3.findViewById(R.id.n7s);
                } else {
                    textView = null;
                }
                View view4 = c19625211qM.LLILZIL;
                if (view4 != null) {
                    textView2 = (TextView) view4.findViewById(R.id.n7r);
                } else {
                    textView2 = null;
                }
                View view5 = c19625211qM.LLILZIL;
                if (view5 != null) {
                    c1324720kZq = (C1324720kZq) view5.findViewById(R.id.n7p);
                } else {
                    c1324720kZq = null;
                }
                if (viewFindViewById != null) {
                    viewFindViewById.setOutlineProvider(new C0IDB(viewFindViewById, 13));
                    viewFindViewById.setClipToOutline(true);
                    C786410Ut5.LJLLLLLL(0, viewFindViewById);
                }
                View view6 = c19625211qM.LLJIJIL;
                if (view6 != null) {
                    C786410Ut5.LJLLLLLL(0, view6);
                }
                View view7 = c19625211qM.LLJI;
                if (view7 != null) {
                    C786410Ut5.LJLLLLLL(8, view7);
                }
                TuxTextView tuxTextView = c19625211qM.LLJILJIL;
                if (tuxTextView != null) {
                    tuxTextView.setText(C497740JfY.LJIJI(2131851149));
                }
                if (textView != null) {
                    User owner = value.getOwner();
                    if (owner == null || (text = owner.getNickName()) == null) {
                        TuxTextView tuxTextView2 = c19625211qM.LLJ;
                        if (tuxTextView2 != null) {
                            text = tuxTextView2.getText();
                        } else {
                            text = null;
                        }
                    }
                    textView.setText(text);
                }
                if (textView2 != null) {
                    RoomStats stats = value.getStats();
                    if (stats != null) {
                        totalUser = stats.getTotalUser();
                    } else {
                        totalUser = 0;
                    }
                    Object[] objArr = new Object[1];
                    RoomStats stats2 = value.getStats();
                    if (stats2 != null) {
                        totalUser2 = stats2.getTotalUser();
                    } else {
                        totalUser2 = 0;
                    }
                    objArr[0] = Integer.valueOf(totalUser2);
                    textView2.setText(C497740JfY.LJIIL(2131755792, totalUser, objArr));
                }
                C0JBN c0jbnLIZ = C1819620xS4.LIZ();
                User owner2 = value.getOwner();
                if (owner2 != null) {
                    avatarThumb = owner2.getAvatarThumb();
                } else {
                    avatarThumb = null;
                }
                c0jbnLIZ.LJIIIZ(avatarThumb).LJJI(viewFindViewById2);
                IHostFrescoHelper iHostFrescoHelper = (IHostFrescoHelper) C1161920gLG.LIZJ(IHostFrescoHelper.class);
                if (iHostFrescoHelper != null) {
                    User owner3 = value.getOwner();
                    if (owner3 != null) {
                        avatarLarge = owner3.getAvatarLarge();
                    }
                    iHostFrescoHelper.xW1(avatarLarge, new InterfaceC177000m8() { // from class: X.09oS
                        @Override // X.InterfaceC177000m8
                        public final void LIZ(Bitmap bitmap) {
                            C20441214yg.LIZIZ("LiveShareSticker", "load avatar success");
                            if (bitmap != null) {
                                try {
                                    Bitmap bitmapCopy = bitmap.copy(Bitmap.Config.ARGB_8888, false);
                                    if (bitmapCopy != null && c1324720kZq != null) {
                                        C1DFH c1dfh = C0PEM.LIZ;
                                        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C2484509oR(bitmapCopy, c1324720kZq, c19625211qM, null), 3);
                                    }
                                } catch (Exception e) {
                                    TryCatchGuardChecker.doCheck(e);
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("load avatar failed ");
                                    sbLIZ.append(e);
                                    C20441214yg.LJ("LiveShareSticker", C2188811AlT.LIZIZ(sbLIZ));
                                }
                            }
                        }
                    });
                }
                c19625211qM.LIZLLL();
            }
            if ((!c19625211qM.LLJJ || (liveRoomStruct = c19625211qM.LLJJJJJIL) == null || liveRoomStruct.getAnchorId() != UserService.getInstance().user().getCurrentUserId()) && c19625211qM.LLJJJIL == null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("authorId:");
                sbLIZ.append(c19625211qM.LLJJIJIIJIL);
                C20441214yg.LIZIZ("LiveShareSticker", C2188811AlT.LIZIZ(sbLIZ));
                c19625211qM.LLJJIJIL = C11QJ.LL.LJ(Mp4ScreenVideoLoadTimeout.CONTROL, TimeUnit.MILLISECONDS).LJIILJJIL(C1701940uOG.LIZIZ()).LJIJI(new AfS198S0100000_29(c19625211qM, 72), new InterfaceC781210Ukh() { // from class: X.11pR
                    @Override // X.InterfaceC781210Ukh
                    public final void run() {
                        InterfaceC2175461ACa interfaceC2175461ACaLJIJJ;
                        C19625211qM c19625211qM2 = c19625211qM;
                        c19625211qM2.LLJJIJIL = null;
                        Long l2 = c19625211qM2.LLJJIII;
                        String string3 = l2 != null ? l2.toString() : null;
                        LiveRoomStruct liveRoomStruct5 = c19625211qM.LLJJJJJIL;
                        String string4 = liveRoomStruct5 != null ? Long.valueOf(liveRoomStruct5.getAnchorId()).toString() : null;
                        String str2 = c19625211qM.LLJJIJIIJIL;
                        boolean zBooleanValue = bool.booleanValue();
                        C1ACD c1acd = c19625211qM.LLJJI;
                        C486660J6q.LJIILIIL((c1acd == null || (interfaceC2175461ACaLJIJJ = c1acd.LJIJJ()) == null) ? 0 : interfaceC2175461ACaLJIJJ.LJJII(), string3, string4, str2, "page_show", zBooleanValue);
                    }
                });
            }
            c19625211qM.LLJJJIL = bool;
        }
    }

    public AObserverS189S0200000_29(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
