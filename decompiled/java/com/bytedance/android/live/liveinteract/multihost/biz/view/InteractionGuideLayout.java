package com.bytedance.android.live.liveinteract.multihost.biz.view;

import X.C09JN;
import X.C0QSJ;
import X.C1099430eiT;
import X.C1146260fw0;
import X.C1155220gAS;
import X.C14KS;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1559260qg8;
import X.C16F5;
import X.C1701940uOG;
import X.C19MB;
import X.C20441214yg;
import X.C427330GpH;
import X.C497740JfY;
import X.C498540Jgq;
import X.C500300Jjg;
import X.C673150Qan;
import X.C687700QyG;
import X.C723590SZx;
import X.C724240Sb0;
import X.C786410Ut5;
import X.C930940aKi;
import X.C954460awe;
import X.C986800bmo;
import X.InterfaceC1146704e9;
import X.InterfaceC1554640qYg;
import X.InterfaceC494301wD;
import X.InterfaceC500940Jki;
import X.InterfaceC687730QyJ;
import X.InterpolatorC1121730fIR;
import Y.ACListenerS59S0400000_27;
import Y.ACListenerS91S0300000_27;
import Y.ALAdapterS12S0300000_27;
import Y.ALAdapterS21S0200000_27;
import Y.ALAdapterS22S0100000_27;
import Y.AUListenerS275S0100000_27;
import Y.AfS176S0100000_7;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.liveinteract.api.MultiCoHostFollowGuideEvent;
import com.bytedance.android.live.liveinteract.multihost.biz.helper.InteractionGuideScope;
import com.bytedance.android.livesdk.model.message.LinkMicAnchorGuideMessage;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public final class InteractionGuideLayout extends UISlotAssem implements IInteractGuideAbility, InterfaceC1554640qYg, C0QSJ, InterfaceC1146704e9 {
    public ConstraintLayout LLJJI;
    public C498540Jgq LLJJIII;
    public C16F5 LLJJIJI;
    public LiveIconView LLJJIJIIJIL;
    public C16F5 LLJJIJIL;
    public ConstraintLayout LLJJJ;
    public C498540Jgq LLJJJIL;
    public C427330GpH LLJJJJ;
    public C16F5 LLJJJJJIL;
    public AnimatorSet LLJJJJLIIL;
    public final Room LLJJL = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
    public final C1559260qg8 LLJJLIIIJLLLLLLLZ = new C1559260qg8(new C723590SZx(this, C1155220gAS.class, null), checkSupervisorPrepared());
    public DataChannel LLJL;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.h07;
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{InteractionGuideScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(InteractionGuideScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(InteractionGuideScope.class);
        return arrayList;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 1400173381) {
            return null;
        }
        return this;
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        C1558520qew.LJII(fragmentLJI != null ? C1558360qeg.LJFF(fragmentLJI, null) : C1558520qew.LJIIL(this), this, IInteractGuideAbility.class, null, this);
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() {
        super.onParentSet();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        C1558520qew.LJII(fragmentLJI != null ? C1558360qeg.LJFF(fragmentLJI, null) : C1558520qew.LJIIL(this), this, IInteractGuideAbility.class, null, this);
    }

    public final void hp(C954460awe c954460awe) {
        long j;
        InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
        C1099430eiT c1099430eiT = new C1099430eiT();
        long id = 0;
        if (c954460awe != null) {
            j = c954460awe.LJ;
        } else {
            j = 0;
        }
        c1099430eiT.LIZIZ(j);
        Room room = this.LLJJL;
        if (room != null) {
            id = room.getId();
        }
        c1099430eiT.LJ(id);
        interfaceC500940JkiUser.LIZ(c1099430eiT.LIZJ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS176S0100000_7(this, 19), new C09JN() { // from class: X.0Jjh
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("InteractionGuideLayout@3016.follow$dispose$2");
                Throwable th = (Throwable) obj;
                if (th instanceof C501470JlZ) {
                    C766270U4b.LJIIJJI(((C501470JlZ) th).getPrompt());
                } else {
                    C766270U4b.LIZLLL(2131853482);
                }
                C1C7U.LIZIZ("InteractionGuideLayout@3016.follow$dispose$2");
            }
        });
    }

    @Override // com.bytedance.android.live.liveinteract.multihost.biz.view.IInteractGuideAbility
    public final void i12(ViewGroup viewGroup) {
        DataChannel dataChannel = this.LLJL;
        ConstraintLayout constraintLayout = null;
        if (dataChannel == null) {
            dataChannel = null;
        }
        dataChannel.LC0(MultiCoHostFollowGuideEvent.class, Boolean.FALSE);
        ConstraintLayout constraintLayout2 = this.LLJJJ;
        if (constraintLayout2 == null) {
            constraintLayout2 = null;
        }
        C786410Ut5.LL(8, constraintLayout2);
        ConstraintLayout constraintLayout3 = this.LLJJI;
        if (constraintLayout3 != null) {
            constraintLayout = constraintLayout3;
        }
        C786410Ut5.LL(8, constraintLayout);
        AnimatorSet animatorSet = this.LLJJJJLIIL;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (viewGroup != null) {
            C786410Ut5.R4(1.0f, viewGroup);
        }
    }

    public final void ip(int i) {
        ConstraintLayout constraintLayout = this.LLJJI;
        C16F5 c16f5 = null;
        if (constraintLayout == null) {
            constraintLayout = null;
        }
        C786410Ut5.LL(i, constraintLayout);
        LiveIconView liveIconView = this.LLJJIJIIJIL;
        if (liveIconView == null) {
            liveIconView = null;
        }
        C786410Ut5.LLJJIJIL(liveIconView, i);
        C16F5 c16f52 = this.LLJJIJI;
        if (c16f52 != null) {
            c16f5 = c16f52;
        }
        C786410Ut5.LLJJJJ(c16f5, i);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLJJIJIIJIL = (LiveIconView) view.findViewById(R.id.lhe);
        this.LLJJIII = (C498540Jgq) view.findViewById(R.id.idz);
        this.LLJJIJI = (C16F5) view.findViewById(R.id.zme);
        this.LLJJI = (ConstraintLayout) view.findViewById(R.id.mb1);
        this.LLJJIJIL = (C16F5) view.findViewById(R.id.ie0);
        this.LLJJJ = (ConstraintLayout) view.findViewById(R.id.mcw);
        this.LLJJJIL = (C498540Jgq) view.findViewById(R.id.ony);
        this.LLJJJJ = (C427330GpH) view.findViewById(R.id.onz);
        this.LLJJJJJIL = (C16F5) view.findViewById(R.id.oo0);
        DataChannel dataChannel = ((C1155220gAS) this.LLJJLIIIJLLLLLLLZ.getValue()).LLILLJJLI;
        if (dataChannel == null) {
            dataChannel = new DataChannel();
        }
        this.LLJL = dataChannel;
    }

    public static void lp(int i, LiveIconView liveIconView) {
        ViewParent parent = liveIconView.getParent();
        if (parent instanceof FrameLayout) {
            ViewGroup.LayoutParams layoutParams = liveIconView.getLayoutParams();
            layoutParams.width = i;
            C786410Ut5.W5(liveIconView, layoutParams);
        } else {
            if (!(parent instanceof ConstraintLayout)) {
                return;
            }
            C19MB c19mb = new C19MB();
            ConstraintLayout constraintLayout = (ConstraintLayout) parent;
            c19mb.LJII(constraintLayout);
            c19mb.LJIILL(liveIconView.getId(), i);
            c19mb.LIZIZ(constraintLayout);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multihost.biz.view.IInteractGuideAbility
    public final void b01(LinkMicAnchorGuideMessage linkMicAnchorGuideMessage, C1146260fw0 c1146260fw0) {
        ImageModel avatarThumb;
        String idStr;
        boolean zIsFollowing;
        boolean z;
        AnimatorSet animatorSet = this.LLJJJJLIIL;
        if (animatorSet != null && animatorSet.isRunning()) {
            return;
        }
        DataChannel dataChannel = this.LLJL;
        if (dataChannel == null) {
            dataChannel = null;
        }
        dataChannel.LC0(MultiCoHostFollowGuideEvent.class, Boolean.TRUE);
        C20441214yg.LJIIIZ("InteractionGuideLayout", "start buildMultiHostBubbleGuideAnimation");
        C427330GpH c427330GpH = this.LLJJJJ;
        if (c427330GpH == null) {
            c427330GpH = null;
        }
        c427330GpH.setText(linkMicAnchorGuideMessage.guideContent);
        C16F5 c16f5 = this.LLJJJJJIL;
        if (c16f5 == null) {
            c16f5 = null;
        }
        c16f5.setText(linkMicAnchorGuideMessage.buttonContent);
        C498540Jgq c498540Jgq = this.LLJJJIL;
        if (c498540Jgq == null) {
            c498540Jgq = null;
        }
        User user = linkMicAnchorGuideMessage.user;
        if (user != null) {
            avatarThumb = user.getAvatarThumb();
        } else {
            avatarThumb = null;
        }
        c498540Jgq.setAvatar(avatarThumb);
        DataChannel dataChannel2 = this.LLJL;
        if (dataChannel2 == null) {
            dataChannel2 = null;
        }
        User user2 = linkMicAnchorGuideMessage.user;
        if (user2 == null || (idStr = user2.getIdStr()) == null) {
            idStr = "";
        }
        User user3 = linkMicAnchorGuideMessage.user;
        if (user3 != null) {
            zIsFollowing = user3.isFollowing();
        } else {
            zIsFollowing = false;
        }
        C500300Jjg.LIZJ(dataChannel2, idStr, zIsFollowing);
        C16F5 c16f52 = this.LLJJJJJIL;
        if (c16f52 == null) {
            c16f52 = null;
        }
        C786410Ut5.l8(c16f52, new ACListenerS91S0300000_27(linkMicAnchorGuideMessage, this, c1146260fw0, 12));
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, (int) C497740JfY.LIZIZ(36.0f));
        valueAnimatorOfFloat.setDuration(333L);
        valueAnimatorOfFloat.setInterpolator(new InterpolatorC1121730fIR(0.33f, 0.0f, 0.67f));
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS275S0100000_27(this, 95));
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(c1146260fw0, (Property<C1146260fw0, Float>) View.ALPHA, 1.0f, 0.0f);
        objectAnimatorOfFloat.setDuration(150L);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(c1146260fw0, (Property<C1146260fw0, Float>) View.ALPHA, 0.0f, 1.0f);
        objectAnimatorOfFloat2.setDuration(150L);
        ConstraintLayout constraintLayout = this.LLJJJ;
        if (constraintLayout == null) {
            constraintLayout = null;
        }
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(constraintLayout, (Property<ConstraintLayout, Float>) View.ALPHA, 0.0f, 1.0f);
        objectAnimatorOfFloat3.setDuration(333L);
        String str = linkMicAnchorGuideMessage.guideContent;
        C427330GpH c427330GpH2 = this.LLJJJJ;
        if (c427330GpH2 == null) {
            c427330GpH2 = null;
        }
        if (c427330GpH2.getPaint().measureText(str) > C14KS.LJFF() - ((int) C497740JfY.LIZIZ(126.0f))) {
            z = true;
        } else {
            z = false;
        }
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat2.setDuration(1000L);
        if (z) {
            valueAnimatorOfFloat2.addListener(new ALAdapterS22S0100000_27(this, 7));
        }
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat3.setDuration(4000L);
        valueAnimatorOfFloat3.addListener(new ALAdapterS21S0200000_27(objectAnimatorOfFloat2, this, 6));
        ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat((int) C497740JfY.LIZIZ(36.0f), 0.0f);
        valueAnimatorOfFloat4.setDuration(333L);
        valueAnimatorOfFloat4.setInterpolator(new InterpolatorC1121730fIR(0.33f, 0.0f, 0.67f));
        valueAnimatorOfFloat4.addUpdateListener(new AUListenerS275S0100000_27(this, 96));
        ConstraintLayout constraintLayout2 = this.LLJJJ;
        if (constraintLayout2 == null) {
            constraintLayout2 = null;
        }
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(constraintLayout2, (Property<ConstraintLayout, Float>) View.ALPHA, 1.0f, 0.0f);
        objectAnimatorOfFloat4.setDuration(333L);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.play(valueAnimatorOfFloat).with(objectAnimatorOfFloat3).before(valueAnimatorOfFloat2);
        animatorSet2.play(valueAnimatorOfFloat3).after(valueAnimatorOfFloat2).before(valueAnimatorOfFloat4);
        animatorSet2.play(valueAnimatorOfFloat4).with(objectAnimatorOfFloat4);
        animatorSet2.addListener(new ALAdapterS21S0200000_27(objectAnimatorOfFloat, this, 5));
        animatorSet2.start();
        this.LLJJJJLIIL = animatorSet2;
    }

    public final void kp(int i, View view) {
        ViewParent parent = view.getParent();
        if (parent instanceof FrameLayout) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = i;
            C786410Ut5.W5(view, layoutParams);
        } else {
            if (!(parent instanceof ConstraintLayout)) {
                return;
            }
            C19MB c19mb = new C19MB();
            ConstraintLayout constraintLayout = (ConstraintLayout) parent;
            c19mb.LJII(constraintLayout);
            c19mb.LJIIJJI(view.getId(), i);
            c19mb.LIZIZ(constraintLayout);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multihost.biz.view.IInteractGuideAbility
    public final void RG0(LinkMicAnchorGuideMessage linkMicAnchorGuideMessage, C1146260fw0 c1146260fw0, C986800bmo c986800bmo) {
        ImageModel avatarThumb;
        String idStr;
        boolean zIsFollowing;
        AnimatorSet animatorSet = this.LLJJJJLIIL;
        if (animatorSet != null && animatorSet.isRunning()) {
            return;
        }
        C16F5 c16f5 = this.LLJJIJI;
        if (c16f5 == null) {
            c16f5 = null;
        }
        c16f5.setText(linkMicAnchorGuideMessage.buttonContent);
        C16F5 c16f52 = this.LLJJIJIL;
        if (c16f52 == null) {
            c16f52 = null;
        }
        c16f52.setText(linkMicAnchorGuideMessage.guideContent);
        C498540Jgq c498540Jgq = this.LLJJIII;
        if (c498540Jgq == null) {
            c498540Jgq = null;
        }
        User user = linkMicAnchorGuideMessage.user;
        if (user != null) {
            avatarThumb = user.getAvatarThumb();
        } else {
            avatarThumb = null;
        }
        c498540Jgq.setAvatar(avatarThumb);
        LiveIconView liveIconView = this.LLJJIJIIJIL;
        if (liveIconView == null) {
            liveIconView = null;
        }
        C786410Ut5.g8(liveIconView, new ACListenerS59S0400000_27(linkMicAnchorGuideMessage, this, c986800bmo, c1146260fw0, 1));
        DataChannel dataChannel = this.LLJL;
        if (dataChannel == null) {
            dataChannel = null;
        }
        User user2 = linkMicAnchorGuideMessage.user;
        if (user2 == null || (idStr = user2.getIdStr()) == null) {
            idStr = "";
        }
        User user3 = linkMicAnchorGuideMessage.user;
        if (user3 != null) {
            zIsFollowing = user3.isFollowing();
        } else {
            zIsFollowing = false;
        }
        C500300Jjg.LIZJ(dataChannel, idStr, zIsFollowing);
        C20441214yg.LJIIIZ("InteractionGuideLayout", "start buildCoHostBubbleGuideAnimation");
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, -((int) C497740JfY.LIZIZ(48.0f)));
        valueAnimatorOfFloat.setDuration(350L);
        valueAnimatorOfFloat.setInterpolator(new InterpolatorC1121730fIR(0.0f, 0.0f, 0.58f));
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS275S0100000_27(this, 89));
        C16F5 c16f53 = this.LLJJIJI;
        if (c16f53 == null) {
            c16f53 = null;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(c16f53, (Property<C16F5, Float>) View.ALPHA, 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(350L);
        LiveIconView liveIconView2 = this.LLJJIJIIJIL;
        if (liveIconView2 == null) {
            liveIconView2 = null;
        }
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(liveIconView2, (Property<LiveIconView, Float>) View.ALPHA, 0.0f, 1.0f);
        objectAnimatorOfFloat2.setDuration(350L);
        LiveIconView liveIconView3 = this.LLJJIJIIJIL;
        if (liveIconView3 == null) {
            liveIconView3 = null;
        }
        liveIconView3.setPivotX(1.0f);
        LiveIconView liveIconView4 = this.LLJJIJIIJIL;
        if (liveIconView4 == null) {
            liveIconView4 = null;
        }
        liveIconView4.setPivotY(1.0f);
        float[] fArr = new float[2];
        LiveIconView liveIconView5 = this.LLJJIJIIJIL;
        if (liveIconView5 == null) {
            liveIconView5 = null;
        }
        fArr[0] = liveIconView5.getMeasuredWidth();
        fArr[1] = (int) C497740JfY.LIZIZ(64.0f);
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat2.setDuration(350L);
        valueAnimatorOfFloat2.addUpdateListener(new AUListenerS275S0100000_27(this, 91));
        float[] fArr2 = new float[2];
        LiveIconView liveIconView6 = this.LLJJIJIIJIL;
        if (liveIconView6 == null) {
            liveIconView6 = null;
        }
        fArr2[0] = liveIconView6.getMeasuredHeight();
        fArr2[1] = (int) C497740JfY.LIZIZ(24.0f);
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(fArr2);
        valueAnimatorOfFloat3.setDuration(350L);
        valueAnimatorOfFloat3.addUpdateListener(new AUListenerS275S0100000_27(this, 92));
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(c1146260fw0, (Property<C1146260fw0, Float>) View.ALPHA, 1.0f, 0.0f);
        objectAnimatorOfFloat3.setDuration(150L);
        ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat4.setDuration(Mp4ScreenVideoLoadTimeout.CONTROL);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(c1146260fw0, (Property<C1146260fw0, Float>) View.ALPHA, 0.0f, 1.0f);
        objectAnimatorOfFloat4.setDuration(150L);
        ValueAnimator valueAnimatorOfFloat5 = ValueAnimator.ofFloat(-((int) C497740JfY.LIZIZ(48.0f)), 0.0f);
        valueAnimatorOfFloat5.setDuration(350L);
        valueAnimatorOfFloat5.setInterpolator(new InterpolatorC1121730fIR(0.0f, 0.0f, 0.58f));
        valueAnimatorOfFloat5.addUpdateListener(new AUListenerS275S0100000_27(this, 90));
        valueAnimatorOfFloat5.addListener(new ALAdapterS21S0200000_27(c986800bmo, objectAnimatorOfFloat4, 4));
        ConstraintLayout constraintLayout = this.LLJJI;
        if (constraintLayout == null) {
            constraintLayout = null;
        }
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(constraintLayout, (Property<ConstraintLayout, Float>) View.ALPHA, 1.0f, 0.0f);
        objectAnimatorOfFloat5.setDuration(350L);
        C16F5 c16f54 = this.LLJJIJI;
        if (c16f54 == null) {
            c16f54 = null;
        }
        ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(c16f54, (Property<C16F5, Float>) View.ALPHA, 1.0f, 0.0f);
        objectAnimatorOfFloat6.setDuration(350L);
        LiveIconView liveIconView7 = this.LLJJIJIIJIL;
        if (liveIconView7 == null) {
            liveIconView7 = null;
        }
        ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(liveIconView7, (Property<LiveIconView, Float>) View.ALPHA, 1.0f, 0.0f);
        objectAnimatorOfFloat7.setDuration(350L);
        float[] fArr3 = new float[2];
        LiveIconView liveIconView8 = this.LLJJIJIIJIL;
        if (liveIconView8 == null) {
            liveIconView8 = null;
        }
        fArr3[0] = liveIconView8.getMeasuredWidth();
        fArr3[1] = (int) C497740JfY.LIZIZ(14.0f);
        ValueAnimator valueAnimatorOfFloat6 = ValueAnimator.ofFloat(fArr3);
        valueAnimatorOfFloat6.setDuration(350L);
        valueAnimatorOfFloat6.addUpdateListener(new AUListenerS275S0100000_27(this, 93));
        float[] fArr4 = new float[2];
        LiveIconView liveIconView9 = this.LLJJIJIIJIL;
        if (liveIconView9 == null) {
            liveIconView9 = null;
        }
        fArr4[0] = liveIconView9.getMeasuredHeight();
        fArr4[1] = (int) C497740JfY.LIZIZ(14.0f);
        ValueAnimator valueAnimatorOfFloat7 = ValueAnimator.ofFloat(fArr4);
        valueAnimatorOfFloat7.setDuration(350L);
        valueAnimatorOfFloat7.addUpdateListener(new AUListenerS275S0100000_27(this, 94));
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.play(valueAnimatorOfFloat).with(objectAnimatorOfFloat).with(objectAnimatorOfFloat2).with(valueAnimatorOfFloat2).with(valueAnimatorOfFloat3);
        animatorSet2.play(valueAnimatorOfFloat4).after(valueAnimatorOfFloat2).before(valueAnimatorOfFloat5);
        animatorSet2.play(valueAnimatorOfFloat5).with(objectAnimatorOfFloat5).with(objectAnimatorOfFloat6).with(objectAnimatorOfFloat7).with(valueAnimatorOfFloat6).with(valueAnimatorOfFloat7);
        animatorSet2.addListener(new ALAdapterS12S0300000_27(this, c986800bmo, objectAnimatorOfFloat3, 2));
        animatorSet2.start();
        this.LLJJJJLIIL = animatorSet2;
    }
}
