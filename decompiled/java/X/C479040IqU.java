package X;

import Y.AAListenerS169S0000000_7;
import Y.AfS143S0200000_7;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.livesetting.linkmic.TiktokLiveTopLiveArchitectureOptSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.hangout.component.interact.view.MultiTopLiveInteractModuleAssem;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS216S0300000_7;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.AwS586S0100000_7;
import kotlin.text.u;
import webcast.api.feed.MGModuleInteraction;

/* JADX INFO: renamed from: X.0IqU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C479040IqU extends C0J8P<MGModuleInteraction, C479050IqV> {
    public static final Interpolator LJII = new OvershootInterpolator(1.0f);
    public static final Interpolator LJIIIIZZ = new AccelerateDecelerateInterpolator();
    public final LifecycleOwner LIZIZ;
    public final Function1<MGModuleInteraction, Unit> LIZJ;
    public final Function0<Unit> LIZLLL;
    public C11JF LJ;
    public Long LJFF;
    public C1295960jpS LJI;

    @Override // X.C0J8P
    public final void LJFF(RecyclerView.ViewHolder viewHolder) {
        MGModuleInteraction mGModuleInteraction;
        C1117360fBO c1117360fBO;
        List<?> list;
        if (!TiktokLiveTopLiveArchitectureOptSetting.INSTANCE.isArchOpt()) {
            AbstractC21673619ry<? extends RecyclerView.ViewHolder> bindingAdapter = viewHolder.getBindingAdapter();
            int layoutPosition = viewHolder.getLayoutPosition();
            if (layoutPosition != -1) {
                Object obj = null;
                if ((bindingAdapter instanceof C1117360fBO) && (c1117360fBO = (C1117360fBO) bindingAdapter) != null && (list = c1117360fBO.LL) != null) {
                    obj = ListProtector.get(list, layoutPosition);
                }
                if ((obj instanceof MGModuleInteraction) && (mGModuleInteraction = (MGModuleInteraction) obj) != null) {
                    String strLJJIFFI = u.LJJIFFI(mGModuleInteraction.name, "hangout_mg_agg_playlabel_", "", false);
                    C477860Ioa.LJIIJ(new C477870Iob("interact_module", "playlabel", strLJJIFFI, null, Integer.valueOf((int) mGModuleInteraction.count), null, null, null, null, strLJJIFFI, strLJJIFFI, mGModuleInteraction.title, Integer.valueOf(viewHolder.getLayoutPosition() + 1), "InteractModuleViewBinder#onViewAttachedToWindow", null, 16384), null);
                }
            }
        }
    }

    @Override // X.C0J8P
    public final /* bridge */ /* synthetic */ void LJI(RecyclerView.ViewHolder viewHolder) {
    }

    @Override // X.C0J8P
    public final void LIZJ(RecyclerView.ViewHolder viewHolder, MGModuleInteraction mGModuleInteraction) {
        C479050IqV c479050IqV = (C479050IqV) viewHolder;
        MGModuleInteraction mGModuleInteraction2 = mGModuleInteraction;
        c479050IqV.L5(mGModuleInteraction2);
        ((TextView) c479050IqV.LLILLL.getValue()).setText(mGModuleInteraction2.title);
        ((TextView) c479050IqV.LLILZ.getValue()).setText(mGModuleInteraction2.btnTitle);
        LJIIJ(c479050IqV, mGModuleInteraction2);
        C500260Jjc.LJLIIIL(500L, c479050IqV.itemView, new AwS216S0300000_7(this, c479050IqV, mGModuleInteraction2, 6));
    }

    @Override // X.C0J8P
    /* JADX INFO: renamed from: LJ */
    public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return new C479050IqV(this, viewGroup);
    }

    public final void LJIIJ(C479050IqV c479050IqV, MGModuleInteraction mGModuleInteraction) {
        int i;
        int i2 = mGModuleInteraction.type;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4 && i2 != 5) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("unknown type:");
                        sbLIZ.append(mGModuleInteraction.type);
                        C20441214yg.LJ("InteractModuleViewBinder", C2188811AlT.LIZIZ(sbLIZ));
                        i = R.layout.dij;
                    } else {
                        i = R.layout.dik;
                    }
                } else {
                    i = R.layout.dij;
                }
            } else {
                i = R.layout.dil;
            }
        } else {
            i = R.layout.dii;
        }
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(c479050IqV.itemView.getContext()), i, (ViewGroup) c479050IqV.LLILLJJLI.getValue(), false);
        int i3 = mGModuleInteraction.type;
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 != 4 && i3 != 5) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("unknown type:");
                        sbLIZ2.append(mGModuleInteraction.type);
                        C20441214yg.LJ("InteractModuleViewBinder", C2188811AlT.LIZIZ(sbLIZ2));
                    } else {
                        View viewFindViewById = viewTd.findViewById(R.id.k21);
                        if (mGModuleInteraction.icon != null) {
                            C1819620xS4.LIZ().LJIIIZ(mGModuleInteraction.icon).LJJI(viewFindViewById);
                        }
                        List<ImageModel> list = mGModuleInteraction.avatars;
                        if (list.size() < 3) {
                            C20441214yg.LJ("InteractModuleViewBinder", "avatars list size < 3 in study room item");
                        } else {
                            View viewFindViewById2 = viewTd.findViewById(R.id.bjb);
                            View viewFindViewById3 = viewTd.findViewById(R.id.bjx);
                            View viewFindViewById4 = viewTd.findViewById(R.id.bjw);
                            C1324610kZf c1324610kZfLJIIIZ = C1819620xS4.LIZ().LJIIIZ((ImageModel) ListProtector.get(list, 0));
                            Boolean bool = Boolean.TRUE;
                            c1324610kZfLJIIIZ.LJIILIIL = bool;
                            c1324610kZfLJIIIZ.LJJI(viewFindViewById2);
                            C1324610kZf c1324610kZfLJIIIZ2 = C1819620xS4.LIZ().LJIIIZ((ImageModel) ListProtector.get(list, 1));
                            c1324610kZfLJIIIZ2.LJIILIIL = bool;
                            c1324610kZfLJIIIZ2.LJJI(viewFindViewById3);
                            C1324610kZf c1324610kZfLJIIIZ3 = C1819620xS4.LIZ().LJIIIZ((ImageModel) ListProtector.get(list, 2));
                            c1324610kZfLJIIIZ3.LJIILIIL = bool;
                            c1324610kZfLJIIIZ3.LJJI(viewFindViewById4);
                        }
                    }
                } else {
                    List<ImageModel> list2 = mGModuleInteraction.avatars;
                    if (list2.size() < 6) {
                        C20441214yg.LJ("InteractModuleViewBinder", "avatars list size < 6, show default lottie bitmap");
                        if (!TiktokLiveTopLiveArchitectureOptSetting.INSTANCE.isArchOpt() || (!list2.isEmpty())) {
                            LJIIIIZZ(viewTd, null, null, null, null, null, null);
                        }
                    } else {
                        C19482711Kf c19482711KfLJ = C1121670fIL.LJ((ImageModel) ListProtector.get(list2, 0));
                        C19482711Kf c19482711KfLJ2 = C1121670fIL.LJ((ImageModel) ListProtector.get(list2, 1));
                        C19482711Kf c19482711KfLJ3 = C1121670fIL.LJ((ImageModel) ListProtector.get(list2, 2));
                        C19482711Kf c19482711KfLJ4 = C1121670fIL.LJ((ImageModel) ListProtector.get(list2, 3));
                        C19482711Kf c19482711KfLJ5 = C1121670fIL.LJ((ImageModel) ListProtector.get(list2, 4));
                        C19482711Kf c19482711KfLJ6 = C1121670fIL.LJ((ImageModel) ListProtector.get(list2, 5));
                        C11JF c11jf = this.LJ;
                        if (c11jf != null) {
                            c11jf.dispose();
                        }
                        C11O8 c11o8LJJJLZIJ = C11NZ.LJLLJ(new InterfaceC1487280oo2<Object[], R>() { // from class: X.0sVs
                            public final InterfaceC1629800sVu<T1, T2, T3, T4, T5, T6, R> LL = new InterfaceC1629800sVu() { // from class: X.0sVt
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // X.InterfaceC1629800sVu
                                public final Object LIZ(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
                                    return C1697810uHb.LJIIJJI(obj, obj2, obj3, obj4, obj5, obj6);
                                }
                            };

                            @Override // X.InterfaceC1487280oo2
                            public final Object apply(Object[] objArr) {
                                Object[] objArr2 = objArr;
                                if (objArr2.length == 6) {
                                    return this.LL.LIZ((T1) objArr2[0], (T2) objArr2[1], (T3) objArr2[2], (T4) objArr2[3], (T5) objArr2[4], (T6) objArr2[5]);
                                }
                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                sbLIZ3.append("Array of size 6 expected but got ");
                                sbLIZ3.append(objArr2.length);
                                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ3));
                            }
                        }, C11NN.LL, c19482711KfLJ, c19482711KfLJ2, c19482711KfLJ3, c19482711KfLJ4, c19482711KfLJ5, c19482711KfLJ6).LJJJJZI(new InterfaceC1487280oo2() { // from class: X.01BT
                            @Override // X.InterfaceC1487280oo2
                            public final Object apply(Object obj) {
                                List list3 = (List) obj;
                                return C1697810uHb.LJIIJJI(C2476009n4.LIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(17)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(17)), (Bitmap) ListProtector.get(list3, 0)), C2476009n4.LIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(17)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(17)), (Bitmap) ListProtector.get(list3, 1)), C2476009n4.LIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28)), (Bitmap) ListProtector.get(list3, 2)), C2476009n4.LIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28)), (Bitmap) ListProtector.get(list3, 3)), C2476009n4.LIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)), (Bitmap) ListProtector.get(list3, 4)), C2476009n4.LIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)), (Bitmap) ListProtector.get(list3, 5)));
                            }
                        }).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ());
                        c11o8LJJJLZIJ.LIZJ(C11RD.LJ(this.LIZIZ));
                        this.LJ = (C11JF) c11o8LJJJLZIJ.LJJLL(new AfS143S0200000_7((Object) this, (EmoteModel) viewTd, (InterfaceC1631620sYq<? super EmoteModel, ? super String, ? super Integer, Unit>) 17), new AfS143S0200000_7((Object) this, (EmoteModel) viewTd, (InterfaceC1631620sYq<? super EmoteModel, ? super String, ? super Integer, Unit>) 18));
                    }
                }
            } else {
                ImageModel avatarThumb = UserService.getInstance().user().getCurrentUser().getAvatarThumb();
                View viewFindViewById5 = viewTd.findViewById(R.id.mje);
                C1324610kZf c1324610kZfLJIIIZ4 = C1819620xS4.LIZ().LJIIIZ(avatarThumb);
                Boolean bool2 = Boolean.TRUE;
                c1324610kZfLJIIIZ4.LJIILIIL = bool2;
                c1324610kZfLJIIIZ4.LJJI(viewFindViewById5);
                final FrameLayout frameLayout = (FrameLayout) viewTd.findViewById(R.id.i65);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(1);
                gradientDrawable.setColor(ColorProtector.parseColor(mGModuleInteraction.backgroundColor));
                frameLayout.setBackground(gradientDrawable);
                final TuxIconView tuxIconView = (TuxIconView) viewTd.findViewById(R.id.ili);
                final TuxIconView tuxIconView2 = (TuxIconView) viewTd.findViewById(R.id.pmx);
                final LiveIconView liveIconView = (LiveIconView) viewTd.findViewById(R.id.k2v);
                Long l = this.LJFF;
                if (l != null && mGModuleInteraction.friendUid != l.longValue()) {
                    final ImageModel imageModel = mGModuleInteraction.friendAvatar;
                    ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(frameLayout, "scaleX", 1.0f, 0.0f);
                    ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(frameLayout, "scaleY", 1.0f, 0.0f);
                    ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(frameLayout, "alpha", 1.0f, 0.0f);
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3);
                    animatorSet.setDuration(300L);
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    animatorSet2.play(animatorSet);
                    animatorSet2.addListener(new AnimatorListenerAdapter() { // from class: X.0HeH
                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public final void onAnimationEnd(Animator animator) {
                            if (imageModel == null) {
                                tuxIconView.setImageResource(R.drawable.cjv);
                                C786410Ut5.LLJJIJIL(liveIconView, 0);
                                C786410Ut5.LLLLLLZZ(tuxIconView2, 4);
                            } else {
                                C1324610kZf c1324610kZfLJIIIZ5 = C1819620xS4.LIZ().LJIIIZ(imageModel);
                                c1324610kZfLJIIIZ5.LJIILIIL = Boolean.TRUE;
                                c1324610kZfLJIIIZ5.LJJI(tuxIconView);
                                C786410Ut5.LLLLLLZZ(tuxIconView2, 0);
                                C786410Ut5.LLJJIJIL(liveIconView, 8);
                            }
                            C479040IqU c479040IqU = this;
                            FrameLayout frameLayout2 = frameLayout;
                            c479040IqU.getClass();
                            ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(frameLayout2, "scaleX", 0.0f, 1.0f);
                            ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(frameLayout2, "scaleY", 0.0f, 1.0f);
                            ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(frameLayout2, "alpha", 0.0f, 1.0f);
                            AnimatorSet animatorSet3 = new AnimatorSet();
                            animatorSet3.playTogether(objectAnimatorOfFloat4, objectAnimatorOfFloat5, objectAnimatorOfFloat6);
                            animatorSet3.setDuration(300L);
                            AnimatorSet animatorSet4 = new AnimatorSet();
                            animatorSet4.play(animatorSet3);
                            animatorSet4.start();
                        }
                    });
                    animatorSet2.start();
                } else if (mGModuleInteraction.friendUid > 0) {
                    C786410Ut5.LLLLLLZZ(tuxIconView2, 0);
                    C786410Ut5.LLJJIJIL(liveIconView, 8);
                    C1324610kZf c1324610kZfLJIIIZ5 = C1819620xS4.LIZ().LJIIIZ(mGModuleInteraction.friendAvatar);
                    c1324610kZfLJIIIZ5.LJIILIIL = bool2;
                    c1324610kZfLJIIIZ5.LJJI(tuxIconView);
                } else {
                    tuxIconView.setImageResource(R.drawable.cjv);
                    C786410Ut5.LLJJIJIL(liveIconView, 0);
                    C786410Ut5.LLLLLLZZ(tuxIconView2, 4);
                }
                this.LJFF = Long.valueOf(mGModuleInteraction.friendUid);
            }
        } else {
            ImageModel avatarThumb2 = UserService.getInstance().user().getCurrentUser().getAvatarThumb();
            View viewFindViewById6 = viewTd.findViewById(R.id.uo0);
            C1324610kZf c1324610kZfLJIIIZ6 = C1819620xS4.LIZ().LJIIIZ(avatarThumb2);
            c1324610kZfLJIIIZ6.LJIILIIL = Boolean.TRUE;
            c1324610kZfLJIIIZ6.LJJI(viewFindViewById6);
            C1143680frq.LIZLLL(viewTd.findViewById(R.id.k21), "tiktok_live_interaction_normal_1", "multi_guest_interaction_dating_middle.png");
            View viewFindViewById7 = viewTd.findViewById(R.id.i3c);
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setShape(1);
            gradientDrawable2.setColor(ColorProtector.parseColor(mGModuleInteraction.backgroundColor));
            viewFindViewById7.setBackground(gradientDrawable2);
        }
        C786410Ut5.LJJJJIZL((FrameLayout) c479050IqV.LLILLJJLI.getValue());
        ((ViewGroup) c479050IqV.LLILLJJLI.getValue()).addView(viewTd);
    }

    public C479040IqU(MultiTopLiveInteractModuleAssem multiTopLiveInteractModuleAssem, AwS586S0100000_7 awS586S0100000_7, AwS551S0100000_7 awS551S0100000_7) {
        this.LIZIZ = multiTopLiveInteractModuleAssem;
        this.LIZJ = awS586S0100000_7;
        this.LIZLLL = awS551S0100000_7;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // X.C0J8P
    public final void LIZLLL(RecyclerView.ViewHolder viewHolder, MGModuleInteraction mGModuleInteraction, List list) {
        C479050IqV c479050IqV = (C479050IqV) viewHolder;
        MGModuleInteraction mGModuleInteraction2 = mGModuleInteraction;
        if (list.isEmpty()) {
            c479050IqV.L5(mGModuleInteraction2);
            ((TextView) c479050IqV.LLILLL.getValue()).setText(mGModuleInteraction2.title);
            ((TextView) c479050IqV.LLILZ.getValue()).setText(mGModuleInteraction2.btnTitle);
            LJIIJ(c479050IqV, mGModuleInteraction2);
            C500260Jjc.LJLIIIL(500L, c479050IqV.itemView, new AwS216S0300000_7(this, c479050IqV, mGModuleInteraction2, 6));
            return;
        }
        for (Object obj : list) {
            if (!(obj instanceof List) || obj == null) {
                return;
            }
            for (String str : (List) obj) {
                switch (str.hashCode()) {
                    case -1981198531:
                        if (str.equals("refresh_avatar")) {
                            c479050IqV.LLILZLL.LJIIJ(c479050IqV, mGModuleInteraction2);
                        }
                        break;
                    case -1432205324:
                        if (str.equals("refresh_title")) {
                            ((TextView) c479050IqV.LLILLL.getValue()).setText(mGModuleInteraction2.title);
                        }
                        break;
                    case -1386980616:
                        if (str.equals("refresh_btn")) {
                            ((TextView) c479050IqV.LLILZ.getValue()).setText(mGModuleInteraction2.btnTitle);
                        }
                        break;
                    case -321835991:
                        if (str.equals("refresh_bg")) {
                            c479050IqV.L5(mGModuleInteraction2);
                        }
                        break;
                }
            }
        }
    }

    public final void LJIIIIZZ(View view, final Bitmap bitmap, final Bitmap bitmap2, final Bitmap bitmap3, final Bitmap bitmap4, final Bitmap bitmap5, final Bitmap bitmap6) {
        final C1295960jpS c1295960jpS = (C1295960jpS) view.findViewById(R.id.spr);
        this.LJI = c1295960jpS;
        if (c1295960jpS != null) {
            c1295960jpS.cancelAnimation();
            c1295960jpS.setImageDrawable(null);
            c1295960jpS.removeAllAnimatorListeners();
            C500260Jjc.LJIILLIIL(c1295960jpS);
            c1295960jpS.addLottieOnCompositionLoadedListener(new InterfaceC1296230jpt() { // from class: X.0IqX
                @Override // X.InterfaceC1296230jpt
                public final void LIZ(C1294720jnS c1294720jnS) {
                    C500260Jjc.LLFFF(c1295960jpS);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("updateBitmap avatar0:");
                    sbLIZ.append(bitmap);
                    sbLIZ.append(", avatar1:");
                    sbLIZ.append(bitmap2);
                    sbLIZ.append(", avatar2:");
                    sbLIZ.append(bitmap3);
                    sbLIZ.append(", avatar3:");
                    sbLIZ.append(bitmap4);
                    sbLIZ.append(", avatar4:");
                    sbLIZ.append(bitmap5);
                    sbLIZ.append(", avatar5:");
                    sbLIZ.append(bitmap6);
                    C20441214yg.LIZIZ("InteractModuleViewBinder", C2188811AlT.LIZIZ(sbLIZ));
                    Bitmap bitmap7 = bitmap;
                    if (bitmap7 != null) {
                        c1295960jpS.updateBitmap("image_0", bitmap7);
                    }
                    Bitmap bitmap8 = bitmap2;
                    if (bitmap8 != null) {
                        c1295960jpS.updateBitmap("image_1", bitmap8);
                    }
                    Bitmap bitmap9 = bitmap3;
                    if (bitmap9 != null) {
                        c1295960jpS.updateBitmap("image_2", bitmap9);
                    }
                    Bitmap bitmap10 = bitmap4;
                    if (bitmap10 != null) {
                        c1295960jpS.updateBitmap("image_3", bitmap10);
                    }
                    Bitmap bitmap11 = bitmap5;
                    if (bitmap11 != null) {
                        c1295960jpS.updateBitmap("image_4", bitmap11);
                    }
                    Bitmap bitmap12 = bitmap6;
                    if (bitmap12 != null) {
                        c1295960jpS.updateBitmap("image_5", bitmap12);
                    }
                }
            });
            c1295960jpS.addAnimatorListener(new AAListenerS169S0000000_7(0));
            C1143680frq.LJIIL(this.LJI, "tiktok_live_interaction_normal_1", "random_chat_lottie.zip", "images", true, null, Boolean.FALSE, null);
        }
    }
}
