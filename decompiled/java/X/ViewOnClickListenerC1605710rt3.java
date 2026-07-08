package X;

import X.C2146108ax;
import X.ViewOnClickListenerC1605710rt3;
import Y.ARunnableS13S0310000_24;
import Y.ARunnableS28S1200000_24;
import android.app.Activity;
import android.os.Looper;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.IDetailFeedSafService;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.ss.android.ugc.aweme.avatar.SocialAvatarEntry$observeLifecycleOwner$1;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.IProfileService;
import com.ss.android.ugc.aweme.profile.model.StoryLiteMetadata;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.model.UserAllStoryMetadata;
import com.ss.android.ugc.aweme.story.reveal.IStoryRevealService;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: renamed from: X.0rt3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class ViewOnClickListenerC1605710rt3 implements InterfaceC1398730mVD, InterfaceC1575850r6t, View.OnClickListener, InterfaceC727810Sgl, InterfaceC903910Zd7, InterfaceC1398760mVG {
    public final EnumC1615506Uf LL;
    public final InterfaceC1605750rt7 LLILLJJLI;
    public final LifecycleOwner LLILLL;
    public final EnumC1606080rte LLILZ;
    public String LLILZIL;
    public String LLILZLL;
    public String LLIZ;
    public Function1<? super EnumC1605470rsf, Unit> LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public Function0<Boolean> LLJILJILJ;
    public User LLJILLL;
    public String LLJJ;
    public float LLJJI;
    public boolean LLJJIII;
    public boolean LLJJIJI;
    public String LLJJIJIIJIL;
    public Function2<? super SmartRoute, ? super String, Unit> LLJJIJIL;
    public Function2<? super String, ? super HashMap<String, String>, Boolean> LLJJJ;
    public boolean LLJJJIL;
    public Integer LLJJJJ;
    public Integer LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public SocialAvatarEntry$observeLifecycleOwner$1 LLJLILLLLZIIL;
    public Function0<Boolean> LLIZLLLIL = AFwS213S0000000_24.get$arr$(478);
    public boolean LLJILJIL = true;
    public final C01GW LLJJJJJIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1677));
    public final C01GW LLJJJJLIIL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(479));
    public final String LLJJL = String.valueOf(hashCode());
    public final C01GW LLJLIL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(477));

    @Override // X.InterfaceC727810Sgl
    public final void LIZ() {
    }

    @Override // X.InterfaceC727810Sgl
    public final void LJ() {
        this.LLJL = false;
        LJJIIJZLJL(Boolean.TRUE, "onStoryAvatarPublishAnimEnd");
    }

    @Override // X.InterfaceC1398730mVD
    public final void release() {
        this.LLJJJIL = false;
        LJIJJ().LJ(this.LLJJL);
        if (EventBus.LIZLLL().LJIIJ(this)) {
            EventBus.LIZLLL().LJJI(this);
        }
        SocialAvatarEntry$observeLifecycleOwner$1 socialAvatarEntry$observeLifecycleOwner$1 = this.LLJLILLLLZIIL;
        if (socialAvatarEntry$observeLifecycleOwner$1 != null) {
            this.LLILLL.getLifecycle().removeObserver(socialAvatarEntry$observeLifecycleOwner$1);
        }
    }

    @Override // X.InterfaceC1398730mVD
    public final void reset() {
        LIZLLL(null);
    }

    @Override // X.InterfaceC727810Sgl
    public final void LJFF() {
        LJJIIJZLJL(Boolean.TRUE, "onTotalFinish");
    }

    @Override // X.InterfaceC1398730mVD
    public final boolean LJIIJ() {
        String uid;
        User user;
        UserAllStoryMetadata allStoryMetadata;
        List<StoryLiteMetadata> list;
        StoryLiteMetadata storyLiteMetadata;
        User author;
        UserAllStoryMetadata allStoryMetadata2;
        List<StoryLiteMetadata> list2;
        StoryLiteMetadata storyLiteMetadata2;
        User user2 = this.LLJILLL;
        if (user2 == null || (uid = user2.getUid()) == null) {
            return false;
        }
        Aweme awemeLJIIIZ = C1618440sDa.LIZIZ.LJJLIIIJLJLI().LJIIIZ(uid);
        return ((awemeLJIIIZ == null || (author = awemeLJIIIZ.getAuthor()) == null || (allStoryMetadata2 = author.getAllStoryMetadata()) == null || (list2 = allStoryMetadata2.storyLiteMetadata) == null || (storyLiteMetadata2 = (StoryLiteMetadata) C13LP.LJJLIIIJL(list2)) == null || !storyLiteMetadata2.isSubOnly()) && ((user = this.LLJILLL) == null || (allStoryMetadata = user.getAllStoryMetadata()) == null || (list = allStoryMetadata.storyLiteMetadata) == null || (storyLiteMetadata = (StoryLiteMetadata) C13LP.LJJLIIIJL(list)) == null || !storyLiteMetadata.isSubOnly())) ? false : true;
    }

    @Override // X.InterfaceC727810Sgl
    public final void LJIILIIL() {
        LJJIIJZLJL(Boolean.TRUE, "onDelete");
    }

    public final InterfaceC1605730rt5 LJIJJ() {
        return (InterfaceC1605730rt5) this.LLJJJJJIL.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [androidx.lifecycle.LifecycleObserver, com.ss.android.ugc.aweme.avatar.SocialAvatarEntry$observeLifecycleOwner$1] */
    public final boolean LJIL() {
        InterfaceC1605750rt7 interfaceC1605750rt7;
        if (this.LLJJJIL) {
            return false;
        }
        this.LLJJJIL = true;
        ?? r1 = new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.avatar.SocialAvatarEntry$observeLifecycleOwner$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                int i = C2146108ax.LIZ[event.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i == 4) {
                                this.LL.LLJIJIL = true;
                                return;
                            }
                            return;
                        }
                        this.LL.LLJIJIL = false;
                        return;
                    }
                    ViewOnClickListenerC1605710rt3 viewOnClickListenerC1605710rt3 = this.LL;
                    viewOnClickListenerC1605710rt3.getClass();
                    if (!EventBus.LIZLLL().LJIIJ(viewOnClickListenerC1605710rt3)) {
                        EventBus.LIZLLL().LJIJJ(viewOnClickListenerC1605710rt3);
                    }
                    this.LL.LLJIJIL = true;
                    return;
                }
                ViewOnClickListenerC1605710rt3 viewOnClickListenerC1605710rt32 = this.LL;
                viewOnClickListenerC1605710rt32.LJIJJ().LJ(viewOnClickListenerC1605710rt32.LLJJL);
                if (EventBus.LIZLLL().LJIIJ(viewOnClickListenerC1605710rt32)) {
                    EventBus.LIZLLL().LJJI(viewOnClickListenerC1605710rt32);
                }
                this.LL.LLILLL.getLifecycle().removeObserver(this);
            }
        };
        this.LLJLILLLLZIIL = r1;
        this.LLILLL.getLifecycle().addObserver(r1);
        if (this.LLJILJIL && (interfaceC1605750rt7 = this.LLILLJJLI) != 0) {
            C2211631BhB.LIZLLL((View) interfaceC1605750rt7, new C1621010sHj(this, interfaceC1605750rt7, 1));
        }
        return true;
    }

    @Override // X.InterfaceC727810Sgl
    public final void onFailed() {
        LJJII(this, EnumC1605470rsf.FAIL, false, false, null, false, null, false, 126);
    }

    @Override // X.InterfaceC1398730mVD
    public final void LJIIL() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LL.getTagName());
        sbLIZ.append("_show");
        LJJI(C2188811AlT.LIZIZ(sbLIZ), this.LLILLJJLI.getMode());
    }

    @Override // X.InterfaceC1398730mVD
    public final void LJIIZILJ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LL.getTagName());
        sbLIZ.append("_click");
        LJJI(C2188811AlT.LIZIZ(sbLIZ), this.LLILLJJLI.getMode());
    }

    @Override // X.InterfaceC1398730mVD
    public final EnumC1606080rte LJII() {
        return this.LLILZ;
    }

    public static boolean LJJ(User user) {
        if (user == null) {
            return true;
        }
        boolean zLJIILL = C10EU.LJIILL(user, C10EU.LJIILLIIL(user));
        if (user.isBlock() || user.isBlocked() || zLJIILL) {
            return true;
        }
        user.getUid();
        return false;
    }

    @Override // X.InterfaceC1398730mVD
    public final void LIZIZ(String str) {
        LJIL();
        LJJIII(str);
        LifecycleOwner lifecycleOwner = this.LLILLL;
        if (lifecycleOwner != null) {
            C1605650rsx.LIZIZ.LJI(lifecycleOwner, this.LL, this.LLJJ, str, this);
        }
    }

    @Override // X.InterfaceC727810Sgl
    public final void LIZJ(float f) {
        this.LLJJI = f;
        this.LLJL = false;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.InterfaceC1398730mVD
    public final boolean LIZLLL(User user) {
        String uid;
        String uid2;
        LifecycleOwner lifecycleOwner;
        C727780Sgi c727780SgiLIZLLL = null;
        String uid3 = null;
        if (this.LLILLL.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
            LifecycleOwner lifecycleOwner2 = this.LLILLL;
            if (lifecycleOwner2 != null) {
                C1605650rsx c1605650rsx = C1605650rsx.LIZIZ;
                EnumC1615506Uf enumC1615506Uf = this.LL;
                User user2 = this.LLJILLL;
                if (user2 != null) {
                    uid3 = user2.getUid();
                }
                c1605650rsx.LJI(lifecycleOwner2, enumC1615506Uf, uid3, null, this);
            }
            return false;
        }
        if (user != null) {
            uid = user.getUid();
        } else {
            uid = null;
        }
        User user3 = this.LLJILLL;
        if (user3 != null) {
            uid2 = user3.getUid();
        } else {
            uid2 = null;
        }
        this.LLJJ = uid2;
        this.LLJILLL = user;
        if (user != null && uid != null && !LJJ(user)) {
            LJJIII(uid);
            this.LLILLJJLI.setMine(C10EU.LJIILLIIL(user));
            C01GW c01gw = C1605690rt1.LIZ;
            C1605720rt4 c1605720rt4 = (C1605720rt4) C1605690rt1.LIZIZ().get(EnumC1615506Uf.STORY);
            if (c1605720rt4 != null) {
                c727780SgiLIZLLL = c1605720rt4.LIZJ().get(uid);
            }
            if (this.LLILLJJLI.q1() || c727780SgiLIZLLL == null) {
                C727780Sgi c727780SgiLJII = LJIJJ().LJII(user);
                if (this.LLILLJJLI.q1()) {
                    c727780SgiLJII = LJIJJ().LJIILLIIL("bindUser");
                }
                this.LLJJJJ = Integer.valueOf(c727780SgiLJII.LIZ);
                EnumC1615506Uf enumC1615506Uf2 = this.LL;
                String uid4 = user.getUid();
                EnumC1605740rt6 enumC1605740rt6 = EnumC1605740rt6.BIND_USER;
                enumC1605740rt6.setScene(this.LLILZ);
                c727780SgiLIZLLL = C1605690rt1.LIZLLL(enumC1615506Uf2, uid4, c727780SgiLJII, enumC1605740rt6);
            }
            int i = c727780SgiLIZLLL.LIZ;
            Integer num = c727780SgiLIZLLL.LIZIZ;
            this.LLILZ.name();
            LJIJJLI(uid, num, false, i);
            if (!Intrinsics.LJFF(this.LLJJ, uid) && (lifecycleOwner = this.LLILLL) != null) {
                C1605650rsx.LIZIZ.LJI(lifecycleOwner, this.LL, this.LLJJ, uid, this);
            }
            InterfaceC1597000rf0 interfaceC1597000rf0LJJLIIIJILLIZJL = C1618440sDa.LIZIZ.LJJLIIIJILLIZJL();
            if (interfaceC1597000rf0LJJLIIIJILLIZJL != null) {
                interfaceC1597000rf0LJJLIIIJILLIZJL.LIZ(uid, this.LLILZ, LJIJI(c727780SgiLIZLLL.LIZ, false));
            }
            return true;
        }
        LJJIIJ(true);
        return false;
    }

    @Override // X.InterfaceC1398730mVD
    public final void LJI(boolean z) {
        this.LLJJIJI = z;
    }

    @Override // X.InterfaceC1398730mVD
    public final void LJIIIIZZ(EnumC1605470rsf enumC1605470rsf) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LL.getTagName());
        sbLIZ.append("_show");
        LJJI(C2188811AlT.LIZIZ(sbLIZ), enumC1605470rsf);
    }

    @Override // X.InterfaceC1398730mVD
    public final void LJIIJJI(String str) {
        this.LLJJIJIIJIL = str;
    }

    @Override // X.InterfaceC1398730mVD
    public final EnumC1605470rsf LJIJ(User user) {
        String uid;
        String uid2;
        if (user != null) {
            uid = user.getUid();
        } else {
            uid = null;
        }
        User user2 = this.LLJILLL;
        if (user2 != null) {
            uid2 = user2.getUid();
        } else {
            uid2 = null;
        }
        this.LLJJ = uid2;
        this.LLJILLL = user;
        if (user != null && uid != null && !LJJ(user)) {
            this.LLILLJJLI.setMine(C10EU.LJIILLIIL(user));
            if (this.LLILLJJLI.q1()) {
                LJIJJ().LJIIIZ(this.LLILZ).onMineAvatarShown(uid);
            }
            C727780Sgi c727780SgiLJII = LJIJJ().LJII(user);
            if (((IProfileService) ServiceManager.get().getService(IProfileService.class)).shouldHideThoughtBubbleAndPlus(user) && c727780SgiLJII.LIZ == 0 && this.LLILZ == EnumC1606080rte.MY_PROFILE) {
                c727780SgiLJII = new C727780Sgi(3, null, null, null, null, 62);
            }
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("computeAndSetAvatarMode: ");
            sbLIZ.append(user.getNickname());
            sbLIZ.append(' ');
            sbLIZ.append(c727780SgiLJII.LIZ);
            C2188811AlT.LIZIZ(sbLIZ);
            EnumC1605470rsf enumC1605470rsfLJIJI = LJIJI(c727780SgiLJII.LIZ, true);
            EnumC1605470rsf mode = this.LLILLJJLI.getMode();
            this.LLILLJJLI.setMode(enumC1605470rsfLJIJI);
            this.LLILLJJLI.setUnReadNum(c727780SgiLJII.LIZIZ);
            this.LLJJLIIIJLLLLLLLZ = c727780SgiLJII.LIZIZ;
            User user3 = this.LLJILLL;
            if (user3 != null) {
                C727450SgB.LIZ(user3);
            }
            if (mode != enumC1605470rsfLJIJI) {
                C2487409ou.LIZJ(new ARunnableS28S1200000_24(enumC1605470rsfLJIJI, uid, this, 4));
            }
            InterfaceC1597000rf0 interfaceC1597000rf0LJJLIIIJILLIZJL = C1618440sDa.LIZIZ.LJJLIIIJILLIZJL();
            if (interfaceC1597000rf0LJJLIIIJILLIZJL != null) {
                String uid3 = user.getUid();
                if (uid3 == null) {
                    uid3 = "";
                }
                interfaceC1597000rf0LJJLIIIJILLIZJL.LIZ(uid3, this.LLILZ, enumC1605470rsfLJIJI);
            }
            return enumC1605470rsfLJIJI;
        }
        LJJIIJ(false);
        return null;
    }

    public final void LJJIII(String str) {
        if (!this.LLJI) {
            return;
        }
        if (C729510SjV.LJIILJJIL(str)) {
            LJIJJ().LIZIZ(this.LLJJL, this);
        } else {
            LJIJJ().LJ(this.LLJJL);
        }
    }

    public final void LJJIIJ(boolean z) {
        LifecycleOwner lifecycleOwner = this.LLILLL;
        if (lifecycleOwner != null) {
            C1605650rsx.LIZIZ.LJI(lifecycleOwner, this.LL, this.LLJJ, null, this);
        }
        LJIJJ().LJ(this.LLJJL);
        this.LLJJ = null;
        this.LLJILLL = null;
        LJJII(this, EnumC1605470rsf.NONE, z, true, null, false, null, true, 56);
    }

    @C14EU
    public final void onBlockUserEvent(C888460YtI c888460YtI) {
        String uid;
        User user = c888460YtI.LIZ;
        String uid2 = null;
        if (user != null) {
            uid = user.getUid();
        } else {
            uid = null;
        }
        User user2 = this.LLJILLL;
        if (user2 != null) {
            uid2 = user2.getUid();
        }
        if (Intrinsics.LJFF(uid, uid2)) {
            LJJII(this, EnumC1605470rsf.NONE, false, false, null, false, null, false, 126);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Function0<Boolean> function0 = this.LLJILJILJ;
        if (function0 != null && function0.invoke().booleanValue()) {
            return;
        }
        LJIILL(view, false, null);
    }

    @Override // X.InterfaceC727810Sgl
    public final void LJIILJJIL(int i, String str) {
        if (i == EnumC729410SjL.RESTORE_SCHEDULE.getValue()) {
            return;
        }
        this.LLJJI = 0.0f;
        LJJII(this, EnumC1605470rsf.PROGRESS, false, false, null, false, str, false, 94);
        this.LLJL = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
    
        if (r3.LLJIJIL != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        if (r3.LLILLJJLI.getScheduleId() != null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003c, code lost:
    
        r3.LLILLJJLI.setScheduleId(LJIJJ().LJI().LIZIZ());
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004f, code lost:
    
        return X.EnumC1605470rsf.PROGRESS;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0052, code lost:
    
        if (r3.LLJL != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.EnumC1605470rsf LJIJI(int r4, boolean r5) {
        /*
            r3 = this;
            kotlin.jvm.functions.Function0<java.lang.Boolean> r0 = r3.LLIZLLLIL
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L11
            X.0rsf r0 = X.EnumC1605470rsf.NONE
            return r0
        L11:
            com.ss.android.ugc.aweme.profile.model.User r0 = r3.LLJILLL
            boolean r0 = X.C10EU.LJIILLIIL(r0)
            r2 = 1
            if (r0 == 0) goto L55
            if (r5 == 0) goto L50
            X.0rt5 r0 = r3.LJIJJ()
            X.0rtH r1 = r0.LJI()
            boolean r0 = r1.LIZ()
            if (r0 == 0) goto L55
            boolean r0 = r1.LIZJ()
            if (r0 == 0) goto L55
            boolean r0 = r3.LLJIJIL
            if (r0 == 0) goto L55
        L34:
            X.0rt7 r0 = r3.LLILLJJLI
            java.lang.String r0 = r0.getScheduleId()
            if (r0 != 0) goto L4d
            X.0rt7 r1 = r3.LLILLJJLI
            X.0rt5 r0 = r3.LJIJJ()
            X.0rtH r0 = r0.LJI()
            java.lang.String r0 = r0.LIZIZ()
            r1.setScheduleId(r0)
        L4d:
            X.0rsf r0 = X.EnumC1605470rsf.PROGRESS
            return r0
        L50:
            boolean r0 = r3.LLJL
            if (r0 == 0) goto L55
            goto L34
        L55:
            boolean r0 = r3.LLJI
            if (r0 == 0) goto L72
            X.0rt5 r0 = r3.LJIJJ()
            X.0rtH r0 = r0.LJI()
            boolean r0 = r0.LIZLLL()
            if (r0 == 0) goto L72
            com.ss.android.ugc.aweme.profile.model.User r0 = r3.LLJILLL
            boolean r0 = X.C10EU.LJIILLIIL(r0)
            if (r0 == 0) goto L72
            X.0rsf r0 = X.EnumC1605470rsf.FAIL
            return r0
        L72:
            if (r4 != r2) goto L77
            X.0rsf r0 = X.EnumC1605470rsf.ON
            return r0
        L77:
            r0 = 2
            if (r4 != r0) goto L8d
            X.0rt5 r1 = r3.LJIJJ()
            X.0rte r0 = r3.LLILZ
            X.0rtG r0 = r1.LJIIIZ(r0)
            boolean r0 = r0.skipGray()
            if (r0 != 0) goto L93
            X.0rsf r0 = X.EnumC1605470rsf.OFF
            return r0
        L8d:
            r0 = 3
            if (r4 != r0) goto L93
            X.0rsf r0 = X.EnumC1605470rsf.HIDE_PROFILE_BADGE
            return r0
        L93:
            X.0rsf r0 = X.EnumC1605470rsf.NONE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnClickListenerC1605710rt3.LJIJI(int, boolean):X.0rsf");
    }

    public final void LJJI(String str, EnumC1605470rsf enumC1605470rsf) {
        boolean z;
        int i;
        String uid;
        AbstractC1569120qw2 abstractC1569120qw2;
        C712120RwY c712120RwY;
        if (enumC1605470rsf == EnumC1605470rsf.ON || enumC1605470rsf == EnumC1605470rsf.OFF) {
            C1618440sDa c1618440sDa = (C1618440sDa) this.LLJLIL.getValue();
            User user = this.LLJILLL;
            String str2 = this.LLILZIL;
            String str3 = this.LLILZLL;
            EnumC1606080rte enumC1606080rte = this.LLILZ;
            if (enumC1606080rte != EnumC1606080rte.FOLLOW_SKYLIGHT && enumC1606080rte != EnumC1606080rte.FRIENDS_SKYLIGHT) {
                z = false;
            } else {
                z = true;
            }
            if (enumC1605470rsf == EnumC1605470rsf.OFF) {
                i = 0;
            } else {
                i = 1;
            }
            c1618440sDa.LJIIL(str, user, str2, str3, z, i, this.LLJJLIIIJLLLLLLLZ, this.LLJJJ, !(this.LLILLJJLI instanceof C1609500rzA));
        }
        User user2 = this.LLJILLL;
        if (user2 != null && (uid = user2.getUid()) != null) {
            int i2 = C1604790rrZ.LIZ[this.LLILZ.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            if (i2 == 5) {
                                abstractC1569120qw2 = C1569170qw7.LIZIZ;
                            } else {
                                return;
                            }
                        } else {
                            abstractC1569120qw2 = C1569130qw3.LIZIZ;
                        }
                    } else {
                        abstractC1569120qw2 = C1569160qw6.LIZIZ;
                    }
                } else {
                    abstractC1569120qw2 = C1569150qw5.LIZIZ;
                }
            } else {
                abstractC1569120qw2 = C1569140qw4.LIZIZ;
            }
            if (abstractC1569120qw2 != null && !Intrinsics.LJFF(abstractC1569120qw2, C1569170qw7.LIZIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(this.LL.getTagName());
                sbLIZ.append("_click");
                if (Intrinsics.LJFF(str, C2188811AlT.LIZIZ(sbLIZ)) && (c712120RwY = C712120RwY.LIZIZ) != null) {
                    ((InterfaceC1569000qvq) this.LLJJJJLIIL.getValue()).LJFF(c712120RwY, abstractC1569120qw2, uid, null);
                }
            }
        }
    }

    public final void LJJIIJZLJL(Boolean bool, String str) {
        String uid;
        String uid2;
        String uid3;
        UserAllStoryMetadata userAllStoryMetadata;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateMineStatusFromLocal, source: ");
        sbLIZ.append(str);
        sbLIZ.append(", isfromPublishCallback: ");
        sbLIZ.append(bool);
        C727780Sgi c727780SgiLJIILLIIL = LJIJJ().LJIILLIIL(C2188811AlT.LIZIZ(sbLIZ));
        Boolean bool2 = Boolean.TRUE;
        Long lValueOf = Long.valueOf(System.currentTimeMillis());
        if (bool2 != null) {
            c727780SgiLJIILLIIL.LIZJ = bool2;
        }
        if (lValueOf != null) {
            c727780SgiLJIILLIIL.getClass();
        }
        if (Intrinsics.LJFF(bool, bool2)) {
            int i = c727780SgiLJIILLIIL.LIZ;
            C01GW c01gw = C1605690rt1.LIZ;
            EnumC1615506Uf enumC1615506Uf = EnumC1615506Uf.STORY;
            User user = this.LLJILLL;
            if (user == null || (uid3 = user.getUid()) == null) {
                uid3 = "";
            }
            if (i != C1605690rt1.LIZJ(enumC1615506Uf, uid3) && (userAllStoryMetadata = c727780SgiLJIILLIIL.LIZLLL) != null) {
                userAllStoryMetadata.updateStoryChangeTime(System.currentTimeMillis());
            }
        }
        User user2 = this.LLJILLL;
        if (user2 != null && (uid2 = user2.getUid()) != null) {
            C01GW c01gw2 = C1605690rt1.LIZ;
            C1605690rt1.LIZLLL(EnumC1615506Uf.STORY, uid2, c727780SgiLJIILLIIL, EnumC1605740rt6.UPDATE_MINE);
        }
        User user3 = this.LLJILLL;
        if (user3 != null) {
            uid = user3.getUid();
        } else {
            uid = null;
        }
        LJIJJLI(uid, c727780SgiLJIILLIIL.LIZIZ, true, c727780SgiLJIILLIIL.LIZ);
    }

    public static final void LJJIFFI(Long l, String str, String str2) {
        if (l != null) {
            C336601Si.LIZ(str, l.longValue(), null, str2, null, null, 48);
        }
    }

    @Override // X.InterfaceC903910Zd7
    public final void LJIIIZ(int i, String str, String str2) {
        LJJII(this, LJIJI(i, false), false, false, null, false, null, true, 38);
        this.LLJJJJ = Integer.valueOf(i);
    }

    @Override // X.InterfaceC1398730mVD
    public final void LJIILL(View view, boolean z, Long l) {
        String uid;
        C128Y c128yLIZ;
        String accurateRecType;
        EnumC1260920iuw enumC1260920iuw;
        Function2<? super SmartRoute, ? super String, Unit> function2;
        InterfaceC214902198i interfaceC214902198i;
        String scheduleId;
        C0SPF next;
        String scheduleId2;
        IStoryRevealService iStoryRevealServiceLJJJJ;
        User user = this.LLJILLL;
        if (user != null) {
            uid = user.getUid();
        } else {
            uid = null;
        }
        if (!this.LLJJIII && this.LLILZ != EnumC1606080rte.GROUP_CHAT && uid == null) {
            LJJIFFI(l, "nav_skip", "uid_null");
            return;
        }
        User user2 = this.LLJILLL;
        if (user2 != null && C727450SgB.LIZ(user2) && (iStoryRevealServiceLJJJJ = C1618440sDa.LIZIZ.LJJJJ()) != null) {
            iStoryRevealServiceLJJJJ.LJIIJJI();
        }
        if (!z) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LL.getTagName());
            sbLIZ.append("_click");
            LJJI(C2188811AlT.LIZIZ(sbLIZ), this.LLILLJJLI.getMode());
        }
        if (this.LLILLJJLI.q1() && this.LLJI && (scheduleId = this.LLILLJJLI.getScheduleId()) != null) {
            C735840Sti.LIZ.getClass();
            List<C0SPF> listLIZ = C1618440sDa.LIZIZ.LJJIFFI().LIZ();
            if (listLIZ != null) {
                Iterator<C0SPF> it2 = listLIZ.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        C729450SjP c729450SjP = next.LIZIZ;
                        EnumC696090RSd enumC696090RSd = c729450SjP.LIZIZ;
                        if (enumC696090RSd == EnumC696090RSd.UPLOADING || enumC696090RSd == EnumC696090RSd.FAILED) {
                            Aweme aweme = c729450SjP.LJ;
                            if (aweme != null) {
                                scheduleId2 = AwemeBizExtKt.getScheduleId(aweme);
                            } else {
                                scheduleId2 = null;
                            }
                            if (Intrinsics.LJFF(scheduleId2, scheduleId)) {
                                break;
                            }
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                C0SPF c0spf = next;
                if (c0spf != null) {
                    C0LAB c0lab = new C0LAB();
                    C1609930rzr.LIZJ(c0lab, c0spf.LIZIZ, "head_status");
                    C20684815ws.LJIILLIIL("publish_landing_status_click", c0lab.LIZ);
                }
            }
        }
        System.currentTimeMillis();
        IDetailFeedSafService iDetailFeedSafService = (IDetailFeedSafService) PluggableExtentionKt.pluggableSpi$default(IDetailFeedSafService.class, false, false, false, 14, null);
        if (iDetailFeedSafService != null) {
            c128yLIZ = iDetailFeedSafService.LIZ(view);
        } else {
            c128yLIZ = null;
        }
        Activity validTopActivity = ActivityStack.getValidTopActivity();
        if ((validTopActivity instanceof C19GS) && validTopActivity != null) {
            if (c128yLIZ != null) {
                if (!(c128yLIZ instanceof InterfaceC214902198i) || (interfaceC214902198i = (InterfaceC214902198i) c128yLIZ) == null || SAFExtensionKt.LJIIZILJ(interfaceC214902198i)) {
                    LJJIFFI(l, "nav_skip", "saf_destroyed");
                    return;
                }
            } else if (validTopActivity.isFinishing()) {
                LJJIFFI(l, "nav_skip", "activity_finishing");
                return;
            }
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(validTopActivity, LJIJJ().LJIIJ());
            LJIJJ().LJIIIZ(this.LLILZ).onEnterPlayer(smartRouteBuildRoute, this.LLILZIL, this.LLIZ);
            if (this.LLILZ != EnumC1606080rte.GROUP_CHAT && !this.LLJJIII) {
                if (uid != null && (function2 = this.LLJJIJIL) != null) {
                    function2.invoke(smartRouteBuildRoute, uid);
                }
            } else {
                Function2<? super SmartRoute, ? super String, Unit> function22 = this.LLJJIJIL;
                if (function22 != null) {
                    function22.invoke(smartRouteBuildRoute, "");
                }
            }
            if (C296550Bjp.LIZ()) {
                User user3 = this.LLJILLL;
                if (user3 != null) {
                    accurateRecType = user3.getAccurateRecType();
                } else {
                    accurateRecType = null;
                }
                if (C123100dR.LIZ(accurateRecType)) {
                    boolean zLJFF = Intrinsics.LJFF(this.LLILZLL, "top_cell");
                    C1260910iuv c1260910iuv = new C1260910iuv(0);
                    c1260910iuv.LJJIJLIJ(this.LLILZIL);
                    c1260910iuv.LJJIL(this.LLILZLL);
                    if (zLJFF) {
                        enumC1260920iuw = EnumC1260920iuw.STORY;
                    } else if (!this.LLJJIJI && this.LLILZ != EnumC1606080rte.FEED) {
                        enumC1260920iuw = EnumC1260920iuw.CARD;
                    } else {
                        enumC1260920iuw = EnumC1260920iuw.ITEM;
                    }
                    c1260910iuv.LJJLIIIJILLIZJL = enumC1260920iuw;
                    c1260910iuv.LJJJJLL();
                    c1260910iuv.LJJLIIIJJI = EnumC1260930iux.ENTER_STORY;
                    c1260910iuv.LJJJJZI(this.LLJILLL);
                    String requestId = this.LLJJIJIIJIL;
                    if (requestId == null) {
                        User user4 = this.LLJILLL;
                        if (user4 != null) {
                            requestId = user4.getRequestId();
                        } else {
                            requestId = null;
                        }
                    }
                    c1260910iuv.LJJJJLI(requestId);
                    c1260910iuv.LJIILJJIL();
                    String requestId2 = this.LLJJIJIIJIL;
                    if (requestId2 == null) {
                        User user5 = this.LLJILLL;
                        if (user5 != null) {
                            requestId2 = user5.getRequestId();
                        } else {
                            requestId2 = null;
                        }
                    }
                    smartRouteBuildRoute.withParam("follow_recommend_nav_param", new C07WV(requestId2, this.LLJJIJI));
                }
            }
            if (l != null && uid != null) {
                smartRouteBuildRoute.withParam("story_preload_already_done", true);
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("enter_from", this.LLILZIL);
            linkedHashMap.put("story_click_user", this.LLJILLL);
            if (uid != null) {
                LJIJJ().LJIIJJI(uid, linkedHashMap);
            }
            LJJIFFI(l, "nav_open", null);
            smartRouteBuildRoute.open();
            return;
        }
        LJJIFFI(l, "nav_skip", "activity_invalid");
    }

    @Override // X.InterfaceC1398760mVG
    public final void LJIILLIIL(int i, String str, String str2) {
        LJJII(this, LJIJI(i, false), false, false, null, false, null, true, 38);
        this.LLJJJJ = Integer.valueOf(i);
    }

    public ViewOnClickListenerC1605710rt3(EnumC1615506Uf enumC1615506Uf, InterfaceC1605750rt7 interfaceC1605750rt7, LifecycleOwner lifecycleOwner, EnumC1606080rte enumC1606080rte) {
        int[] iArr;
        this.LL = enumC1615506Uf;
        this.LLILLJJLI = interfaceC1605750rt7;
        this.LLILLL = lifecycleOwner;
        this.LLILZ = enumC1606080rte;
        View view = interfaceC1605750rt7.getView();
        if (view != null) {
            C694200RKw c694200RKwLIZLLL = LJIJJ().LIZLLL(view.getContext());
            if (c694200RKwLIZLLL != null) {
                iArr = c694200RKwLIZLLL.LIZ;
            } else {
                iArr = null;
            }
            interfaceC1605750rt7.setColorList(iArr);
            C694200RKw c694200RKwLIZLLL2 = LJIJJ().LIZLLL(view.getContext());
            interfaceC1605750rt7.setPositionList(c694200RKwLIZLLL2 != null ? c694200RKwLIZLLL2.LIZIZ : null);
        }
        interfaceC1605750rt7.setProgressMode(LJIJJ().LJIILL().LIZ());
    }

    public final void LJIJJLI(String str, Integer num, boolean z, int i) {
        String uid;
        User user = this.LLJILLL;
        if (user != null) {
            uid = user.getUid();
        } else {
            uid = null;
        }
        if (!Intrinsics.LJFF(str, uid)) {
            return;
        }
        if (((IProfileService) ServiceManager.get().getService(IProfileService.class)).shouldHideThoughtBubbleAndPlus(this.LLJILLL) && i == 0 && this.LLILZ == EnumC1606080rte.MY_PROFILE) {
            i = 3;
        }
        LJJII(this, LJIJI(i, false), false, false, num, z, null, false, 102);
    }

    @Override // X.InterfaceC1575850r6t
    public final void Wn(String str, int i, Integer num, EnumC1576350r7h enumC1576350r7h) {
        String uid;
        String uid2;
        int iIntValue = 0;
        LJIJJLI(str, num, false, i);
        User user = this.LLJILLL;
        String nickname = null;
        if (user != null) {
            uid = user.getUid();
        } else {
            uid = null;
        }
        if (!Intrinsics.LJFF(str, uid)) {
            return;
        }
        Integer num2 = this.LLJJJJ;
        if ((num2 == null || num2.intValue() != i) && this.LLJJJJ != null) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", this.LLILZIL);
            User user2 = this.LLJILLL;
            if (user2 != null) {
                uid2 = user2.getUid();
            } else {
                uid2 = null;
            }
            c2344009Gk.LJIIIIZZ("author_id", uid2);
            User user3 = this.LLJILLL;
            if (user3 != null) {
                nickname = user3.getNickname();
            }
            c2344009Gk.LJIIIIZZ("nickname", nickname);
            C735840Sti c735840Sti = C735840Sti.LIZ;
            User user4 = this.LLJILLL;
            c735840Sti.getClass();
            c2344009Gk.LIZJ(C735840Sti.LJIIIIZZ(user4), "follow_status");
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LL.getTagName());
            sbLIZ.append("_state_before");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            Integer num3 = this.LLJJJJ;
            if (num3 != null) {
                iIntValue = num3.intValue();
            }
            c2344009Gk.LIZJ(iIntValue, strLIZIZ);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(this.LL.getTagName());
            sbLIZ2.append("_state_after");
            c2344009Gk.LIZJ(i, C2188811AlT.LIZIZ(sbLIZ2));
            c2344009Gk.LJIIIIZZ("change_reason", enumC1576350r7h.getString());
            C20684815ws.LJIILLIIL("story_change_unconsistent", c2344009Gk.LIZ);
        }
        this.LLJJJJ = Integer.valueOf(i);
    }

    public static void LJJII(ViewOnClickListenerC1605710rt3 viewOnClickListenerC1605710rt3, EnumC1605470rsf enumC1605470rsf, boolean z, boolean z2, Integer num, boolean z3, String str, boolean z4, int i) {
        String uid;
        boolean zLJIL;
        int iIntValue;
        boolean z5 = z4;
        String str2 = str;
        boolean z6 = z3;
        Integer num2 = num;
        boolean z7 = z2;
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            z7 = false;
        }
        String nickname = null;
        if ((i & 8) != 0) {
            num2 = null;
        }
        if ((i & 16) != 0) {
            z6 = false;
        }
        if ((i & 32) != 0) {
            str2 = null;
        }
        if ((i & 64) != 0) {
            z5 = false;
        }
        viewOnClickListenerC1605710rt3.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("operateAvatarView: user: ");
        User user = viewOnClickListenerC1605710rt3.LLJILLL;
        if (user != null) {
            uid = user.getUid();
        } else {
            uid = null;
        }
        sbLIZ.append(uid);
        sbLIZ.append(" mode ");
        sbLIZ.append(enumC1605470rsf);
        C2188811AlT.LIZIZ(sbLIZ);
        if (!Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread())) {
            C2487409ou.LIZJ(new ARunnableS13S0310000_24(viewOnClickListenerC1605710rt3, enumC1605470rsf, num2, z7, 2));
            return;
        }
        if (viewOnClickListenerC1605710rt3.LLILLL.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
            return;
        }
        if (enumC1605470rsf == EnumC1605470rsf.NONE) {
            View view = viewOnClickListenerC1605710rt3.LLILLJJLI.getView();
            if (view != null) {
                C786410Ut5.I7(null, view);
            }
            View view2 = viewOnClickListenerC1605710rt3.LLILLJJLI.getView();
            if (view2 != null) {
                view2.setClickable(false);
            }
            if (viewOnClickListenerC1605710rt3.LLJI) {
                zLJIL = viewOnClickListenerC1605710rt3.LJIL();
            } else {
                zLJIL = false;
            }
        } else {
            View view3 = viewOnClickListenerC1605710rt3.LLILLJJLI.getView();
            if (view3 != null) {
                C786410Ut5.I7(viewOnClickListenerC1605710rt3, view3);
            }
            zLJIL = viewOnClickListenerC1605710rt3.LJIL();
        }
        EnumC1605470rsf mode = viewOnClickListenerC1605710rt3.LLILLJJLI.getMode();
        if (z) {
            InterfaceC1605750rt7 interfaceC1605750rt7 = viewOnClickListenerC1605710rt3.LLILLJJLI;
            if (num2 != null) {
                iIntValue = num2.intValue();
            } else {
                iIntValue = 0;
            }
            interfaceC1605750rt7.LJI(mode, enumC1605470rsf, iIntValue, z6, z5);
        }
        viewOnClickListenerC1605710rt3.LLILLJJLI.setMode(enumC1605470rsf);
        viewOnClickListenerC1605710rt3.LLILLJJLI.setUnReadNum(num2);
        EnumC1605470rsf enumC1605470rsf2 = EnumC1605470rsf.PROGRESS;
        if (enumC1605470rsf == enumC1605470rsf2) {
            viewOnClickListenerC1605710rt3.LLILLJJLI.setProgress(viewOnClickListenerC1605710rt3.LLJJI);
            if (str2 != null) {
                viewOnClickListenerC1605710rt3.LLILLJJLI.setScheduleId(str2);
            }
        } else {
            viewOnClickListenerC1605710rt3.LLILLJJLI.setScheduleId(null);
        }
        if (mode == enumC1605470rsf && !zLJIL && enumC1605470rsf != enumC1605470rsf2) {
            return;
        }
        User user2 = viewOnClickListenerC1605710rt3.LLJILLL;
        if (user2 != null && C727450SgB.LIZ(user2)) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("operateAvatarView: ");
            User user3 = viewOnClickListenerC1605710rt3.LLJILLL;
            if (user3 != null) {
                nickname = user3.getNickname();
            }
            sbLIZ2.append(nickname);
            sbLIZ2.append(' ');
            sbLIZ2.append(enumC1605470rsf);
            C2188811AlT.LIZIZ(sbLIZ2);
        }
        Function1<? super EnumC1605470rsf, Unit> function1 = viewOnClickListenerC1605710rt3.LLJ;
        if (function1 == null) {
            return;
        }
        function1.invoke(enumC1605470rsf);
    }
}
