package X;

import Y.AAListenerS318S0100000_7;
import Y.AUListenerS217S0200000_7;
import Y.AUListenerS257S0100000_7;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.feed.FeedExtra;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.feed.adapter.viewholder.GoLiveViewHolder;
import com.bytedance.android.livesdk.livesetting.skylight.LiveSkylightStyleSetting;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdk.model.message.GuestApplyInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.RoomLinkInfo;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.feed.EventStruct;

/* JADX INFO: renamed from: X.0InV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C477190InV implements InterfaceC473730Ihv, InterfaceC1141530foN {
    public final InterfaceC472640IgA LL;
    public final EnumC471790Ien LLILLJJLI;
    public final LifecycleOwner LLILLL;
    public RecyclerView LLILZ;
    public LinearLayoutManager LLILZIL;
    public ViewGroup LLILZLL;
    public C472450Ifr LLIZ;
    public final C478110Ioz LLJ;
    public C19EG LLJI;
    public final List<FeedItem> LLIZLLLIL = new ArrayList();
    public final C01GW LLJIJIL = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(293));
    public final Keva LLJILJIL = Keva.getRepo("ttlive_preview_repo");

    public final boolean LIZ(List<? extends FeedItem> list) {
        FeedItem feedItem;
        if (this.LLJILJIL.getLong("toplive_golive_bubble_show_time_v2", -1L) == -1 || System.currentTimeMillis() - this.LLJILJIL.getLong("toplive_golive_bubble_show_time_v2", -1L) >= 86400000 || (feedItem = (FeedItem) C13LP.LJJJLZIJ(0, list)) == null || feedItem.type != 101 || LiveSkylightStyleSetting.INSTANCE.enableStyleV2()) {
            return false;
        }
        return true;
    }

    public final void LIZIZ(boolean z) {
        long integer;
        GoLiveViewHolder goLiveViewHolder;
        long j;
        Keyframe[] keyframeArr;
        long j2;
        long j3;
        long j4;
        Resources resources;
        C19EG c19eg = this.LLJI;
        if (c19eg != null && (resources = c19eg.getResources()) != null) {
            integer = resources.getInteger(R.integer.b0);
        } else {
            integer = 300;
        }
        if (z) {
            final int iLIZIZ = (int) C497740JfY.LIZIZ(84.0f);
            RecyclerView recyclerView = this.LLILZ;
            if (recyclerView != null) {
                recyclerView.scrollBy(iLIZIZ, 0);
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.setDuration(360L);
            valueAnimatorOfFloat.setInterpolator(C1619980sG4.LIZLLL());
            valueAnimatorOfFloat.setStartDelay(integer);
            final C817403Hg c817403Hg = new C817403Hg();
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0Ihw
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    RecyclerView recyclerView2;
                    float fFloatValue = iLIZIZ * ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    C817403Hg c817403Hg2 = c817403Hg;
                    int i = (int) (fFloatValue - c817403Hg2.element);
                    c817403Hg2.element = fFloatValue;
                    if (i != 0 && (recyclerView2 = this.LLILZ) != null) {
                        recyclerView2.scrollBy(-i, 0);
                    }
                }
            });
            valueAnimatorOfFloat.start();
        }
        RecyclerView recyclerView2 = this.LLILZ;
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = null;
        if (recyclerView2 != null) {
            viewHolderFindViewHolderForAdapterPosition = recyclerView2.findViewHolderForAdapterPosition(0);
        }
        if ((viewHolderFindViewHolderForAdapterPosition instanceof GoLiveViewHolder) && (goLiveViewHolder = (GoLiveViewHolder) viewHolderFindViewHolderForAdapterPosition) != null) {
            C0GSW c0gsw = goLiveViewHolder.LLJILLL;
            if (c0gsw != null) {
                int visibility = c0gsw.getVisibility();
                c0gsw.setVisibility(0);
                C1602160rnK.LIZIZ(visibility, 0, c0gsw);
            }
            ViewGroup viewGroup = goLiveViewHolder.LLJILJILJ;
            if (viewGroup != null) {
                C786410Ut5.LJLZ(0, viewGroup);
            }
            if (z) {
                ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat2.setDuration(360L);
                valueAnimatorOfFloat2.setInterpolator(C1619980sG4.LIZLLL());
                valueAnimatorOfFloat2.setStartDelay(integer);
                valueAnimatorOfFloat2.addUpdateListener(new AUListenerS257S0100000_7(goLiveViewHolder, 15));
                valueAnimatorOfFloat2.start();
                j = 1400;
            } else {
                j = 1000;
            }
            if (z) {
                float f = j;
                keyframeArr = new Keyframe[]{Keyframe.ofFloat(0.0f / f, 0.0f), Keyframe.ofFloat(600.0f / f, 1.08f), Keyframe.ofFloat(900.0f / f, 1.0f), Keyframe.ofFloat(1150.0f / f, 1.05f), Keyframe.ofFloat(1400.0f / f, 1.0f)};
            } else {
                float f2 = j;
                keyframeArr = new Keyframe[]{Keyframe.ofFloat(0.0f / f2, 1.0f), Keyframe.ofFloat(250.0f / f2, 1.05f), Keyframe.ofFloat(500.0f / f2, 1.0f), Keyframe.ofFloat(750.0f / f2, 1.05f), Keyframe.ofFloat(1000.0f / f2, 1.0f)};
            }
            ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(goLiveViewHolder.LLJILJILJ, PropertyValuesHolder.ofKeyframe(View.SCALE_X, (Keyframe[]) Arrays.copyOf(keyframeArr, keyframeArr.length)), PropertyValuesHolder.ofKeyframe(View.SCALE_Y, (Keyframe[]) Arrays.copyOf(keyframeArr, keyframeArr.length)));
            objectAnimatorOfPropertyValuesHolder.setDuration(j);
            objectAnimatorOfPropertyValuesHolder.setInterpolator(C1619980sG4.LIZLLL());
            long j5 = 0;
            long j6 = 400;
            if (z) {
                j2 = 0;
            } else {
                j2 = 400;
            }
            objectAnimatorOfPropertyValuesHolder.setStartDelay(j2 + integer);
            C786410Ut5.Pd(objectAnimatorOfPropertyValuesHolder);
            C0GSW c0gsw2 = goLiveViewHolder.LLJILLL;
            if (c0gsw2 != null) {
                c0gsw2.setStartPointAngle(45.0f);
            }
            C0GSW c0gsw3 = goLiveViewHolder.LLJILLL;
            if (c0gsw3 != null) {
                c0gsw3.setEndPointAngle(45.0f);
            }
            ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(45.0f, 405.0f);
            if (z) {
                j3 = 900;
            } else {
                j3 = 400;
            }
            valueAnimatorOfFloat3.setDuration(j3);
            valueAnimatorOfFloat3.setInterpolator(C1619980sG4.LIZLLL());
            long j7 = ((long) 250) + integer;
            if (z) {
                j4 = 0;
            } else {
                j4 = 500;
            }
            valueAnimatorOfFloat3.setStartDelay(j7 + j4);
            valueAnimatorOfFloat3.addUpdateListener(new AUListenerS257S0100000_7(goLiveViewHolder, 16));
            valueAnimatorOfFloat3.start();
            ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(45.0f, 405.0f);
            if (z) {
                j6 = 900;
            }
            valueAnimatorOfFloat4.setDuration(j6);
            valueAnimatorOfFloat4.setInterpolator(C1619980sG4.LIZLLL());
            long j8 = integer + ((long) 500);
            if (!z) {
                j5 = 500;
            }
            valueAnimatorOfFloat4.setStartDelay(j8 + j5);
            valueAnimatorOfFloat4.addUpdateListener(new AUListenerS257S0100000_7(goLiveViewHolder, 17));
            valueAnimatorOfFloat4.addListener(new AAListenerS318S0100000_7(goLiveViewHolder, 6));
            valueAnimatorOfFloat4.start();
            goLiveViewHolder.LLJJIJIIJIL = Integer.valueOf(goLiveViewHolder.LLJJIJI.getInt("toplive_golive_anim_style", 0));
            goLiveViewHolder.LLJJIJI.erase("toplive_golive_anim_style");
        }
    }

    public final void LIZJ(boolean z) {
        long integer;
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition;
        GoLiveViewHolder goLiveViewHolder;
        Resources resources;
        C19EG c19eg = this.LLJI;
        if (c19eg != null && (resources = c19eg.getResources()) != null) {
            integer = resources.getInteger(R.integer.b0);
        } else {
            integer = 300;
        }
        RecyclerView recyclerView = this.LLILZ;
        C417200GXm c417200GXm = null;
        if (recyclerView != null) {
            viewHolderFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(0);
        } else {
            viewHolderFindViewHolderForAdapterPosition = null;
        }
        if ((viewHolderFindViewHolderForAdapterPosition instanceof GoLiveViewHolder) && (goLiveViewHolder = (GoLiveViewHolder) viewHolderFindViewHolderForAdapterPosition) != null) {
            long j = integer + 100;
            ViewGroup viewGroup = goLiveViewHolder.LLJILJILJ;
            if (viewGroup != null) {
                C786410Ut5.LJLZ(0, viewGroup);
            }
            C16F5 c16f5 = goLiveViewHolder.LLJJ;
            if (c16f5 != null) {
                C786410Ut5.k5(c16f5, 0.0f);
            }
            C16F5 c16f52 = goLiveViewHolder.LLJJ;
            if (c16f52 instanceof C417200GXm) {
                c417200GXm = (C417200GXm) c16f52;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.setDuration(750L);
            valueAnimatorOfFloat.setInterpolator(C1619980sG4.LIZLLL());
            valueAnimatorOfFloat.setStartDelay(j);
            valueAnimatorOfFloat.addUpdateListener(new AUListenerS217S0200000_7(c417200GXm, goLiveViewHolder, 8));
            valueAnimatorOfFloat.start();
            if (z) {
                C1324720kZq c1324720kZq = goLiveViewHolder.LLJILJIL;
                if (c1324720kZq != null) {
                    C786410Ut5.h5(c1324720kZq, 0.0f);
                }
                ViewGroup viewGroup2 = goLiveViewHolder.LLJJI;
                if (viewGroup2 != null) {
                    C786410Ut5.R4(0.0f, viewGroup2);
                }
                View view = goLiveViewHolder.LLJJIII;
                if (view != null) {
                    C786410Ut5.T4(view, 0.0f);
                }
                float fLIZIZ = (((int) C497740JfY.LIZIZ(56.0f)) / 2.0f) - (((int) C497740JfY.LIZIZ(21.0f)) / 2.0f);
                ViewGroup viewGroup3 = goLiveViewHolder.LLJJI;
                if (viewGroup3 != null) {
                    C786410Ut5.Gc(-fLIZIZ, viewGroup3);
                }
                ViewGroup viewGroup4 = goLiveViewHolder.LLJJI;
                if (viewGroup4 != null) {
                    C786410Ut5.bd(-fLIZIZ, viewGroup4);
                }
                View view2 = goLiveViewHolder.LLJJIII;
                if (view2 != null) {
                    C786410Ut5.Jc(view2, -fLIZIZ);
                }
                View view3 = goLiveViewHolder.LLJJIII;
                if (view3 != null) {
                    C786410Ut5.ed(view3, -fLIZIZ);
                }
                ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat2.setDuration(200L);
                valueAnimatorOfFloat2.setInterpolator(C1619980sG4.LIZLLL());
                valueAnimatorOfFloat2.setStartDelay(j);
                valueAnimatorOfFloat2.addUpdateListener(new AUListenerS257S0100000_7(goLiveViewHolder, 18));
                valueAnimatorOfFloat2.addListener(new AAListenerS318S0100000_7(goLiveViewHolder, 7));
                valueAnimatorOfFloat2.start();
                ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(-fLIZIZ, (int) C497740JfY.LIZIZ(2.5f));
                valueAnimatorOfFloat3.setDuration(230L);
                valueAnimatorOfFloat3.setInterpolator(C1619980sG4.LIZLLL());
                long j2 = ((long) 1170) + j;
                valueAnimatorOfFloat3.setStartDelay(j2);
                valueAnimatorOfFloat3.addUpdateListener(new AUListenerS257S0100000_7(goLiveViewHolder, 19));
                valueAnimatorOfFloat3.start();
                float fLIZIZ2 = (int) C497740JfY.LIZIZ(16.0f);
                float f = 280L;
                float f2 = 0.0f / f;
                float f3 = 200.0f / f;
                float f4 = 280.0f / f;
                Keyframe[] keyframeArr = {Keyframe.ofFloat(f2, ((int) C497740JfY.LIZIZ(32.0f)) / fLIZIZ2), Keyframe.ofFloat(f3, ((int) C497740JfY.LIZIZ(58.0f)) / fLIZIZ2), Keyframe.ofFloat(f4, ((int) C497740JfY.LIZIZ(56.0f)) / fLIZIZ2)};
                ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(goLiveViewHolder.LLJJI, PropertyValuesHolder.ofKeyframe(View.SCALE_X, (Keyframe[]) Arrays.copyOf(keyframeArr, 3)), PropertyValuesHolder.ofKeyframe(View.SCALE_Y, (Keyframe[]) Arrays.copyOf(keyframeArr, 3)));
                objectAnimatorOfPropertyValuesHolder.setDuration(280L);
                objectAnimatorOfPropertyValuesHolder.setInterpolator(C1619980sG4.LIZLLL());
                objectAnimatorOfPropertyValuesHolder.setStartDelay(j);
                C786410Ut5.Pd(objectAnimatorOfPropertyValuesHolder);
                float f5 = 230L;
                float f6 = 0.0f / f5;
                float f7 = 230.0f / f5;
                Keyframe[] keyframeArr2 = {Keyframe.ofFloat(f6, ((int) C497740JfY.LIZIZ(56.0f)) / fLIZIZ2), Keyframe.ofFloat(f7, ((int) C497740JfY.LIZIZ(16.0f)) / fLIZIZ2)};
                ObjectAnimator objectAnimatorOfPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(goLiveViewHolder.LLJJI, PropertyValuesHolder.ofKeyframe(View.SCALE_X, (Keyframe[]) Arrays.copyOf(keyframeArr2, 2)), PropertyValuesHolder.ofKeyframe(View.SCALE_Y, (Keyframe[]) Arrays.copyOf(keyframeArr2, 2)));
                objectAnimatorOfPropertyValuesHolder2.setDuration(230L);
                objectAnimatorOfPropertyValuesHolder2.setInterpolator(C1619980sG4.LIZLLL());
                objectAnimatorOfPropertyValuesHolder2.setStartDelay(j2);
                C786410Ut5.Pd(objectAnimatorOfPropertyValuesHolder2);
                float fLIZIZ3 = (int) C497740JfY.LIZIZ(9.0f);
                Keyframe[] keyframeArr3 = {Keyframe.ofFloat(f2, ((int) C497740JfY.LIZIZ(19.0f)) / fLIZIZ3), Keyframe.ofFloat(f3, ((int) C497740JfY.LIZIZ(35.0f)) / fLIZIZ3), Keyframe.ofFloat(f4, ((int) C497740JfY.LIZIZ(34.0f)) / fLIZIZ3)};
                ObjectAnimator objectAnimatorOfPropertyValuesHolder3 = ObjectAnimator.ofPropertyValuesHolder(goLiveViewHolder.LLJJIII, PropertyValuesHolder.ofKeyframe(View.SCALE_X, (Keyframe[]) Arrays.copyOf(keyframeArr3, 3)), PropertyValuesHolder.ofKeyframe(View.SCALE_Y, (Keyframe[]) Arrays.copyOf(keyframeArr3, 3)));
                objectAnimatorOfPropertyValuesHolder3.setDuration(280L);
                objectAnimatorOfPropertyValuesHolder3.setInterpolator(C1619980sG4.LIZLLL());
                objectAnimatorOfPropertyValuesHolder3.setStartDelay(j);
                C786410Ut5.Pd(objectAnimatorOfPropertyValuesHolder3);
                Keyframe[] keyframeArr4 = {Keyframe.ofFloat(f6, ((int) C497740JfY.LIZIZ(34.0f)) / fLIZIZ3), Keyframe.ofFloat(f7, ((int) C497740JfY.LIZIZ(9.0f)) / fLIZIZ3)};
                ObjectAnimator objectAnimatorOfPropertyValuesHolder4 = ObjectAnimator.ofPropertyValuesHolder(goLiveViewHolder.LLJJIII, PropertyValuesHolder.ofKeyframe(View.SCALE_X, (Keyframe[]) Arrays.copyOf(keyframeArr4, 2)), PropertyValuesHolder.ofKeyframe(View.SCALE_Y, (Keyframe[]) Arrays.copyOf(keyframeArr4, 2)));
                objectAnimatorOfPropertyValuesHolder4.setDuration(230L);
                objectAnimatorOfPropertyValuesHolder4.setInterpolator(C1619980sG4.LIZLLL());
                objectAnimatorOfPropertyValuesHolder4.setStartDelay(j2);
                C786410Ut5.Pd(objectAnimatorOfPropertyValuesHolder4);
                goLiveViewHolder.LLJJIJIIJIL = Integer.valueOf(goLiveViewHolder.LLJJIJI.getInt("toplive_golive_anim_style", 0));
                goLiveViewHolder.LLJJIJI.erase("toplive_golive_anim_style");
            }
        }
    }

    public final void LJ(List<? extends FeedItem> list) {
        if (list == null) {
            return;
        }
        if (!list.isEmpty()) {
            Iterator<? extends FeedItem> it2 = list.iterator();
            while (it2.hasNext()) {
                if (it2.next().type == 21) {
                    RecyclerView recyclerView = this.LLILZ;
                    if (recyclerView != null) {
                        recyclerView.setMinimumHeight((int) C497740JfY.LIZIZ(122.0f));
                        return;
                    }
                    return;
                }
            }
        }
        RecyclerView recyclerView2 = this.LLILZ;
        if (recyclerView2 == null) {
            return;
        }
        recyclerView2.setMinimumHeight((int) C497740JfY.LIZIZ(108.0f));
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0066 A[SYNTHETIC] */
    @Override // X.InterfaceC1141530foN
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mh2(X.C262100zr r10) {
        /*
            r9 = this;
            java.lang.String r1 = r10.LIZ
            java.lang.String r0 = "live_event_update_result"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L6c
            X.0evd r1 = r10.LIZIZ
            if (r1 != 0) goto Lf
            return
        Lf:
            java.lang.String r0 = "live_event"
            X.0evd r2 = X.C1871910yoP.LJ(r1, r0)
            if (r2 != 0) goto L18
            return
        L18:
            java.lang.String r1 = ""
            java.lang.String r0 = "id"
            java.lang.String r7 = X.C1871910yoP.LJFF(r2, r0, r1)
            java.lang.String r1 = "has_subscribed"
            r0 = 0
            boolean r6 = X.C1871910yoP.LIZIZ(r2, r1, r0)
            java.util.List<com.bytedance.android.livesdk.model.FeedItem> r0 = r9.LLIZLLLIL
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r8 = r0.iterator()
            r5 = 0
        L30:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L6c
            java.lang.Object r4 = r8.next()
            int r3 = r5 + 1
            r2 = 0
            if (r5 < 0) goto L68
            com.bytedance.android.livesdk.model.FeedItem r4 = (com.bytedance.android.livesdk.model.FeedItem) r4
            int r1 = r4.type
            r0 = 18
            if (r1 != r0) goto L66
            webcast.api.feed.EventStruct r0 = r4.liveEvent
            if (r0 == 0) goto L4d
            java.lang.String r2 = r0.id
        L4d:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r7)
            if (r0 == 0) goto L66
            webcast.api.feed.EventStruct r1 = r4.liveEvent
            if (r1 == 0) goto L5d
            boolean r0 = r1.hasSubscribed
            if (r0 == r6) goto L66
            r1.hasSubscribed = r6
        L5d:
            X.0Ifr r1 = r9.LLIZ
            if (r1 == 0) goto L66
            java.lang.String r0 = "js_event"
            r1.notifyItemChanged(r5, r0)
        L66:
            r5 = r3
            goto L30
        L68:
            X.C1697810uHb.LJIJI()
            throw r2
        L6c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C477190InV.mh2(X.00zr):void");
    }

    public final void LIZLLL(final List list, FeedExtra feedExtra) {
        Integer numValueOf;
        List list2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateData: forceRefresh=");
        sbLIZ.append(false);
        sbLIZ.append(", dataSize=");
        if (list != null) {
            numValueOf = Integer.valueOf(list.size());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        C2188811AlT.LIZIZ(sbLIZ);
        final List<FeedItem> list3 = this.LLIZLLLIL;
        C21341918fZ c21341918fZLIZ = C21342318fd.LIZ(new AbstractC21342018fa(list3, list) { // from class: X.00oV
            public final List<? extends FeedItem> LIZ;
            public final List<? extends FeedItem> LIZIZ;

            @Override // X.AbstractC21342018fa
            public final int LIZLLL() {
                List<? extends FeedItem> list4 = this.LIZIZ;
                if (list4 != null) {
                    return list4.size();
                }
                return 0;
            }

            @Override // X.AbstractC21342018fa
            public final int LJ() {
                List<? extends FeedItem> list4 = this.LIZ;
                if (list4 != null) {
                    return list4.size();
                }
                return 0;
            }

            {
                this.LIZ = list3;
                this.LIZIZ = list;
            }

            /* JADX WARN: Removed duplicated region for block: B:86:0x00ed A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:87:0x00ee  */
            /* JADX WARN: Removed duplicated region for block: B:89:0x00f2  */
            @Override // X.AbstractC21342018fa
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean LIZ(int r14, int r15) {
                /*
                    Method dump skipped, instruction units count: 328
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C191700oV.LIZ(int, int):boolean");
            }

            @Override // X.AbstractC21342018fa
            public final boolean LIZIZ(int i, int i2) {
                FeedItem feedItem;
                int size;
                int size2;
                List<User> list4;
                List<User> list5;
                boolean z;
                boolean z2;
                List<? extends FeedItem> list6 = this.LIZ;
                FeedItem feedItem2 = null;
                if (list6 != null) {
                    feedItem = (FeedItem) ListProtector.get(list6, i);
                } else {
                    feedItem = null;
                }
                List<? extends FeedItem> list7 = this.LIZIZ;
                if (list7 != null) {
                    feedItem2 = (FeedItem) ListProtector.get(list7, i2);
                }
                if (feedItem != null && feedItem2 != null) {
                    int i3 = feedItem.type;
                    if (i3 != feedItem2.type) {
                        return false;
                    }
                    if (i3 == 22) {
                        if (feedItem.watchLaterInfo == null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (feedItem2.watchLaterInfo == null) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z != z2) {
                            return false;
                        }
                        return true;
                    }
                    GuestApplyInfo guestApplyInfo = feedItem.skylightMultiGuestApplyInfo;
                    GuestApplyInfo guestApplyInfo2 = feedItem2.skylightMultiGuestApplyInfo;
                    if (guestApplyInfo != null && guestApplyInfo2 != null && (guestApplyInfo.applyStatus != guestApplyInfo2.applyStatus || !Intrinsics.LJFF(guestApplyInfo.preLinkmicId, guestApplyInfo2.preLinkmicId))) {
                        return false;
                    }
                    Room room = feedItem.getRoom();
                    Room room2 = feedItem2.getRoom();
                    if (room != null && room2 != null) {
                        RoomLinkInfo linkMicInfo = room.getLinkMicInfo();
                        if (linkMicInfo != null && (list5 = linkMicInfo.showUserList) != null) {
                            size = list5.size();
                        } else {
                            size = 0;
                        }
                        RoomLinkInfo linkMicInfo2 = room2.getLinkMicInfo();
                        if (linkMicInfo2 != null && (list4 = linkMicInfo2.showUserList) != null) {
                            size2 = list4.size();
                        } else {
                            size2 = 0;
                        }
                        if (size2 != size) {
                            return false;
                        }
                        return true;
                    }
                    EventStruct eventStruct = feedItem.liveEvent;
                    EventStruct eventStruct2 = feedItem2.liveEvent;
                    if (eventStruct != null && eventStruct2 != null && eventStruct.style != eventStruct2.style) {
                        return false;
                    }
                    return true;
                }
                return Intrinsics.LJFF(feedItem, feedItem2);
            }

            public static boolean LJFF(int i, Room room, Room room2) {
                long id;
                List<User> list4;
                User user;
                List<User> list5;
                User user2;
                RoomLinkInfo linkMicInfo = room.getLinkMicInfo();
                long id2 = 0;
                if (linkMicInfo != null && (list5 = linkMicInfo.showUserList) != null && (user2 = (User) C13LP.LJJJLZIJ(i, list5)) != null) {
                    id = user2.getId();
                } else {
                    id = 0;
                }
                RoomLinkInfo linkMicInfo2 = room2.getLinkMicInfo();
                if (linkMicInfo2 != null && (list4 = linkMicInfo2.showUserList) != null && (user = (User) C13LP.LJJJLZIJ(i, list4)) != null) {
                    id2 = user.getId();
                }
                if (id == id2) {
                    return true;
                }
                return false;
            }
        }, true);
        ((ArrayList) this.LLIZLLLIL).clear();
        if (list != null) {
            ((ArrayList) this.LLIZLLLIL).addAll(list);
        }
        LJ(list);
        C472450Ifr c472450Ifr = this.LLIZ;
        if (c472450Ifr != null) {
            if (list == null) {
                list2 = C13BV.INSTANCE;
            } else {
                list2 = list;
            }
            c472450Ifr.LLILZIL = list2;
            c472450Ifr.LLILZLL = feedExtra;
            c472450Ifr.LLIZ = "";
            c472450Ifr.LLLFZ();
            c21341918fZLIZ.LIZJ(c472450Ifr);
            this.LLJ.LIZIZ(list);
        }
    }

    public C477190InV(C477010InD c477010InD, EnumC477350Inl enumC477350Inl, EnumC471790Ien enumC471790Ien, LifecycleOwner lifecycleOwner) {
        this.LL = c477010InD;
        this.LLILLJJLI = enumC471790Ien;
        this.LLILLL = lifecycleOwner;
        this.LLJ = new C478110Ioz(enumC477350Inl);
    }
}
