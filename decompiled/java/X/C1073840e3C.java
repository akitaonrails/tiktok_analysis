package X;

import Y.AAListenerS327S0100000_16;
import Y.AObserverS220S0100000_16;
import Y.AUListenerS265S0100000_16;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Looper;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.hox.Hox;
import com.ss.android.ugc.aweme.friendstab.tab.StateOwner;
import com.ss.android.ugc.aweme.friendstab.ui.FriendsEmptyPageMainSectionVM;
import com.ss.android.ugc.aweme.friendstab.ui.FriendsEmptyPageRootVM;
import com.ss.android.ugc.aweme.friendstab.ui.FriendsFeedEmptyPageCell;
import com.ss.android.ugc.aweme.relation.monitor.RecUserBehaviorMonImpl;
import com.ss.android.ugc.aweme.relation.usercard.IRelationUserCardInternalService;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS385S0200000_19;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0e3C, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1073840e3C extends FrameLayout implements C0N06 {
    public static final /* synthetic */ int LLJILJIL = 0;
    public C1074010e3T LL;
    public C1390410mHn LLILLJJLI;
    public InterfaceC1073860e3E LLILLL;
    public final BPEAHandler LLILZ;
    public Fragment LLILZIL;
    public C1073850e3D LLILZLL;
    public FriendsEmptyPageRootVM LLIZ;
    public AbstractC1263550izB LLIZLLLIL;
    public final float LLJ;
    public Animator LLJI;
    public Function1<? super Boolean, Unit> LLJIJIL;

    @Override // X.C0N06
    public final void LIZLLL() {
        this.LLJIJIL = null;
    }

    public static boolean LJFF() {
        InterfaceC1587410rPX interfaceC1587410rPX;
        C19EG c19egLIZIZ = StateOwner.LL.LIZIZ();
        if (c19egLIZIZ == null) {
            return false;
        }
        C128Y c128yKi = Hox.LLJILJIL.LIZ(c19egLIZIZ).Ki("FRIENDS_FEED");
        if (!(c128yKi instanceof InterfaceC1587410rPX) || (interfaceC1587410rPX = (InterfaceC1587410rPX) c128yKi) == null) {
            return false;
        }
        return interfaceC1587410rPX.LJIIJJI();
    }

    public final C1074010e3T getEmptyPagePowerListFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.h31);
            this.LL = (C1074010e3T) callbackFindViewById;
        }
        return (C1074010e3T) callbackFindViewById;
    }

    public final C1390410mHn getLoadingViewFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.nnp);
            this.LLILLJJLI = (C1390410mHn) callbackFindViewById;
        }
        return (C1390410mHn) callbackFindViewById;
    }

    @Override // X.C0N06
    public final void LIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("unbind, mode:");
        FriendsEmptyPageRootVM friendsEmptyPageRootVM = this.LLIZ;
        if (friendsEmptyPageRootVM == null) {
            friendsEmptyPageRootVM = null;
        }
        sbLIZ.append(friendsEmptyPageRootVM.LLILLL);
        C2188811AlT.LIZIZ(sbLIZ);
        FriendsEmptyPageRootVM friendsEmptyPageRootVM2 = this.LLIZ;
        if (friendsEmptyPageRootVM2 == null) {
            friendsEmptyPageRootVM2 = null;
        }
        if (friendsEmptyPageRootVM2.LLILLL == C0N07.LAST_ITEM) {
            InterfaceC1073860e3E interfaceC1073860e3E = this.LLILLL;
            if (interfaceC1073860e3E != null) {
                interfaceC1073860e3E.m6();
            }
            FriendsEmptyPageRootVM friendsEmptyPageRootVM3 = this.LLIZ;
            if (friendsEmptyPageRootVM3 == null) {
                friendsEmptyPageRootVM3 = null;
            }
            FriendsEmptyPageMainSectionVM friendsEmptyPageMainSectionVM = friendsEmptyPageRootVM3.LLILLJJLI;
            if (friendsEmptyPageMainSectionVM != null) {
                friendsEmptyPageMainSectionVM.LLJI.postValue(new C1073880e3G(false, null));
            }
        }
    }

    @Override // X.C0N06
    public final void onBind() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onBind, mode:");
        FriendsEmptyPageRootVM friendsEmptyPageRootVM = this.LLIZ;
        if (friendsEmptyPageRootVM == null) {
            friendsEmptyPageRootVM = null;
        }
        sbLIZ.append(friendsEmptyPageRootVM.LLILLL);
        C2188811AlT.LIZIZ(sbLIZ);
        FriendsEmptyPageRootVM friendsEmptyPageRootVM2 = this.LLIZ;
        if (friendsEmptyPageRootVM2 == null) {
            friendsEmptyPageRootVM2 = null;
        }
        if (friendsEmptyPageRootVM2.LLILLL == C0N07.LAST_ITEM) {
            InterfaceC1073860e3E interfaceC1073860e3E = this.LLILLL;
            if (interfaceC1073860e3E != null) {
                interfaceC1073860e3E.av("FRIENDS_FEED");
            }
            InterfaceC1073860e3E interfaceC1073860e3E2 = this.LLILLL;
            if (interfaceC1073860e3E2 != null) {
                FriendsEmptyPageRootVM friendsEmptyPageRootVM3 = this.LLIZ;
                if (friendsEmptyPageRootVM3 == null) {
                    friendsEmptyPageRootVM3 = null;
                }
                interfaceC1073860e3E2.setExtra(String.valueOf(friendsEmptyPageRootVM3.LLILLL.getValue()));
            }
            FriendsEmptyPageRootVM friendsEmptyPageRootVM4 = this.LLIZ;
            FriendsEmptyPageRootVM friendsEmptyPageRootVM5 = friendsEmptyPageRootVM4 == null ? null : friendsEmptyPageRootVM4;
            C1073870e3F c1073870e3F = new C1073870e3F((friendsEmptyPageRootVM4 != null ? friendsEmptyPageRootVM4 : null).LLILLL);
            friendsEmptyPageRootVM5.vQ2();
            FriendsEmptyPageMainSectionVM friendsEmptyPageMainSectionVM = friendsEmptyPageRootVM5.LLILLJJLI;
            if (friendsEmptyPageMainSectionVM != null) {
                friendsEmptyPageMainSectionVM.LLJI.postValue(new C1073880e3G(true, c1073870e3F));
            }
            C1400330mXn c1400330mXn = C1400330mXn.LIZ;
            boolean zLJFF = LJFF();
            c1400330mXn.getClass();
            C1400330mXn.LJIIIIZZ(0, "homepage_friends", zLJFF);
        }
    }

    public C1073840e3C(Context context) {
        C1074010e3T emptyPagePowerListFromXml;
        C1074010e3T emptyPagePowerListFromXml2;
        super(context, null, 0);
        this.LLILZ = new BPEAHandler(Looper.getMainLooper());
        this.LLJ = -1.0f;
        C818480W8w.LIZ("friends_tab_empty");
        C786410Ut5.Sd(R.layout.cab, C786410Ut5.ne(context), this);
        C1074010e3T emptyPagePowerListFromXml3 = getEmptyPagePowerListFromXml();
        if (emptyPagePowerListFromXml3 != null) {
            C2271391DvN.LIZ(emptyPagePowerListFromXml3, (C1A5L) C2271381DvM.K.getValue());
        }
        if (C14LC.LJIIIZ && !C319860CgK.LIZ() && (emptyPagePowerListFromXml2 = getEmptyPagePowerListFromXml()) != null) {
            C0TT6.LIZIZ(C0TT6.LIZ(47), emptyPagePowerListFromXml2);
        }
        float fLIZJ = C497820Jfg.LIZJ(context);
        this.LLJ = fLIZJ;
        if (!C319860CgK.LIZ() && (emptyPagePowerListFromXml = getEmptyPagePowerListFromXml()) != null) {
            C0TT6.LIZLLL(((int) fLIZJ) + C0TT6.LIZ(56), emptyPagePowerListFromXml);
        }
        if (C319860CgK.LIZ()) {
            findViewById(R.id.im6).setBackground(null);
        }
    }

    @Override // X.C0N06
    public final void LIZIZ(boolean z) {
        C1400330mXn.LIZ.getClass();
        C1400330mXn.LJIIIIZZ(1, "homepage_friends", z);
    }

    @Override // X.C0N06
    public final void LIZJ(AwS603S0100000_24 awS603S0100000_24) {
        this.LLJIJIL = awS603S0100000_24;
    }

    public final void setEmptyPagePowerListFromXml(C1074010e3T c1074010e3T) {
        this.LL = c1074010e3T;
    }

    public final void setLoadingViewFromXml(C1390410mHn c1390410mHn) {
        this.LLILLJJLI = c1390410mHn;
    }

    public final void setPageLoading(boolean z) {
        if (C319860CgK.LIZ()) {
            return;
        }
        Animator animator = this.LLJI;
        if (animator != null) {
            animator.cancel();
        }
        if (z) {
            if (getLoadingViewFromXml().getVisibility() != 0) {
                getLoadingViewFromXml().LIZJ();
                C786410Ut5.LJLLLLLL(0, getLoadingViewFromXml());
                return;
            }
            return;
        }
        if (getLoadingViewFromXml().getVisibility() != 0) {
            return;
        }
        getLoadingViewFromXml().LIZLLL();
        C786410Ut5.LJLLLLLL(8, getLoadingViewFromXml());
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.setInterpolator(C1619980sG4.LJ());
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS265S0100000_16(this, 61));
        valueAnimatorOfFloat.addListener(new AAListenerS327S0100000_16(this, 22));
        valueAnimatorOfFloat.start();
        this.LLJI = valueAnimatorOfFloat;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [X.0e3D] */
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
    @Override // X.C0N06
    public final void LJ(Fragment fragment, C0N07 c0n07) {
        Object objLJ;
        AbstractC1263550izB abstractC1263550izB;
        int i;
        Object objLJ2;
        int iLIZ;
        String str = null;
        RecUserBehaviorMonImpl recUserBehaviorMonImplOK = C2277891EDz.LIZIZ.LJIIJ().oK(fragment.getLifecycle(), new C1261270ivV("homepage_friends", str, str, str, false, str, str, str, false ? 1 : 0, 33554430), -1);
        this.LLILLL = recUserBehaviorMonImplOK;
        C0N07 c0n072 = C0N07.EMPTY_STATE;
        if (c0n07 == c0n072) {
            if (recUserBehaviorMonImplOK != null) {
                recUserBehaviorMonImplOK.av("FRIENDS_FEED");
            }
            InterfaceC1073860e3E interfaceC1073860e3E = this.LLILLL;
            if (interfaceC1073860e3E != null) {
                interfaceC1073860e3E.setExtra(String.valueOf(c0n07.getValue()));
            }
        }
        this.LLILZIL = fragment;
        FriendsEmptyPageRootVM friendsEmptyPageRootVM = (FriendsEmptyPageRootVM) ViewModelProviders.of(fragment).get(FriendsEmptyPageRootVM.class);
        this.LLIZ = friendsEmptyPageRootVM;
        Fragment fragment2 = null;
        if (friendsEmptyPageRootVM == null) {
            friendsEmptyPageRootVM = null;
        }
        friendsEmptyPageRootVM.LLILLL = c0n07;
        int i2 = 1;
        if (c0n07 == c0n072) {
            if (!C319860CgK.LIZ()) {
                C1074010e3T emptyPagePowerListFromXml = getEmptyPagePowerListFromXml();
                if (emptyPagePowerListFromXml != null) {
                    if (C1587360rPS.LJFF) {
                        iLIZ = C0TT6.LIZ(100);
                    } else {
                        iLIZ = ((int) this.LLJ) + C0TT6.LIZ(56);
                    }
                    C0TT6.LIZLLL(iLIZ, emptyPagePowerListFromXml);
                }
                C1074010e3T emptyPagePowerListFromXml2 = getEmptyPagePowerListFromXml();
                if (emptyPagePowerListFromXml2 != null) {
                    C0TT6.LIZIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(58)), emptyPagePowerListFromXml2);
                }
            }
            if (!C319860CgK.LIZ()) {
                C1400330mXn c1400330mXn = C1400330mXn.LIZ;
                boolean zLJFF = LJFF();
                c1400330mXn.getClass();
                C1400330mXn.LJIIIIZZ(1, "homepage_friends", zLJFF);
            }
        }
        C1074010e3T emptyPagePowerListFromXml3 = getEmptyPagePowerListFromXml();
        if (emptyPagePowerListFromXml3 != null) {
            emptyPagePowerListFromXml3.setMode(c0n07);
        }
        FriendsEmptyPageRootVM friendsEmptyPageRootVM2 = this.LLIZ;
        if (friendsEmptyPageRootVM2 == null) {
            friendsEmptyPageRootVM2 = null;
        }
        final C0N07 c0n073 = friendsEmptyPageRootVM2.LLILLL;
        this.LLILZLL = new AbstractC1906720ziY(c0n073) { // from class: X.0e3D
            public final C0N07 LLIZLLLIL;

            @Override // X.AbstractC1906720ziY, X.InterfaceC1906750zib
            public final void onCreate() {
                LJIILIIL(FriendsFeedEmptyPageCell.class);
                C20600815jK.LIZJ(this.LLILZLL, new C1073870e3F(this.LLIZLLLIL));
            }

            {
                this.LLIZLLLIL = c0n073;
            }
        };
        C1074010e3T emptyPagePowerListFromXml4 = getEmptyPagePowerListFromXml();
        if (emptyPagePowerListFromXml4 != null) {
            C1073850e3D c1073850e3D = this.LLILZLL;
            if (c1073850e3D == null) {
                c1073850e3D = null;
            }
            emptyPagePowerListFromXml4.LIZJ(c1073850e3D);
        }
        FriendsEmptyPageRootVM friendsEmptyPageRootVM3 = this.LLIZ;
        if (friendsEmptyPageRootVM3 == null) {
            friendsEmptyPageRootVM3 = null;
        }
        Fragment fragment3 = this.LLILZIL;
        if (fragment3 == null) {
            fragment3 = null;
        }
        friendsEmptyPageRootVM3.getClass();
        int i3 = 5;
        if (C319860CgK.LIZ()) {
            C1262310ixB c1262310ixB = new C1262310ixB(false ? 1 : 0, fragment3, i2);
            c1262310ixB.LIZJ(AFwS252S0000000_16.get$arr$(665));
            c1262310ixB.LIZ(AFwS252S0000000_16.get$arr$(666));
            c1262310ixB.LIZLLL(AFwS257S0000000_19.get$arr$(798));
            c1262310ixB.LIZIZ(AFwS252S0000000_16.get$arr$(667));
            c1262310ixB.LJI = AFwS204S0000000_16.get$arr$(535);
            IRelationUserCardInternalService.LIZ.getClass();
            IRelationUserCardInternalService iRelationUserCardInternalServiceLIZ = C1073940e3M.LIZ();
            C1262320ixC c1262320ixC = c1262310ixB.LIZLLL;
            if (c1262320ixC.LIZLLL == -1) {
                int i4 = c1262310ixB.LJFF.LIZJ - 10;
                if (i4 >= 5) {
                    i3 = i4;
                }
                c1262320ixC.LIZLLL = i3;
            }
            C19719912Dl c19719912DlLIZ = C13LE.LIZ(AbstractC1263550izB.class);
            if (!Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C1262790ixx.class)) && !Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C1262780ixw.class)) && (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(AbstractC1263550izB.class)) || Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(AbstractC1890380zIC.class)))) {
                C1262590ixd c1262590ixd = c1262310ixB.LJFF;
                if (c1262590ixd.LJIILJJIL == null) {
                    c1262590ixd.LJIILJJIL = Boolean.TRUE;
                }
            }
            C1262300ixA c1262300ixA = new C1262300ixA(c1262310ixB.LIZ, c1262310ixB.LIZIZ, c1262310ixB.LIZJ, c1262310ixB.LIZLLL, c1262310ixB.LJ, c1262310ixB.LJFF, null, c1262310ixB.LJI);
            C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(AbstractC1263550izB.class);
            if (Intrinsics.LJFF(c19719912DlLIZ2, C13LE.LIZ(C1262790ixx.class))) {
                objLJ2 = iRelationUserCardInternalServiceLIZ.LIZ(c1262300ixA, 1).getLayout();
            } else if (Intrinsics.LJFF(c19719912DlLIZ2, C13LE.LIZ(C1262780ixw.class))) {
                objLJ2 = iRelationUserCardInternalServiceLIZ.LIZ(c1262300ixA, 0).getLayout();
            } else if (Intrinsics.LJFF(c19719912DlLIZ2, C13LE.LIZ(AbstractC1263550izB.class))) {
                objLJ2 = iRelationUserCardInternalServiceLIZ.LIZIZ(c1262300ixA);
            } else if (Intrinsics.LJFF(c19719912DlLIZ2, C13LE.LIZ(AbstractC1890380zIC.class))) {
                objLJ2 = iRelationUserCardInternalServiceLIZ.LIZJ(c1262300ixA);
            } else if (Intrinsics.LJFF(c19719912DlLIZ2, C13LE.LIZ(AbstractC1903730zdj.class))) {
                objLJ2 = iRelationUserCardInternalServiceLIZ.LIZLLL(c1262300ixA);
            } else if (Intrinsics.LJFF(c19719912DlLIZ2, C13LE.LIZ(AbstractC1263540izA.class))) {
                objLJ2 = iRelationUserCardInternalServiceLIZ.LJ(c1262300ixA);
            } else {
                "type is error!".toString();
                throw new IllegalStateException("type is error!");
            }
            if (objLJ2 != null) {
                abstractC1263550izB = (AbstractC1263550izB) objLJ2;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.relation.usercard.controller.AbsRelationUserCardChunk");
            }
        } else {
            C1262310ixB c1262310ixB2 = new C1262310ixB(false ? 1 : 0, fragment3, 1);
            c1262310ixB2.LIZJ(AFwS252S0000000_16.get$arr$(662));
            c1262310ixB2.LIZ(AFwS252S0000000_16.get$arr$(663));
            new AwS385S0200000_19(friendsEmptyPageRootVM3, fragment3, 156).invoke(c1262310ixB2.LIZJ);
            c1262310ixB2.LIZIZ(AFwS252S0000000_16.get$arr$(664));
            c1262310ixB2.LJI = AFwS204S0000000_16.get$arr$(534);
            IRelationUserCardInternalService.LIZ.getClass();
            IRelationUserCardInternalService iRelationUserCardInternalServiceLIZ2 = C1073940e3M.LIZ();
            C1262320ixC c1262320ixC2 = c1262310ixB2.LIZLLL;
            if (c1262320ixC2.LIZLLL == -1) {
                int i5 = c1262310ixB2.LJFF.LIZJ - 10;
                if (i5 >= 5) {
                    i3 = i5;
                }
                c1262320ixC2.LIZLLL = i3;
            }
            C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(AbstractC1263550izB.class);
            if (!Intrinsics.LJFF(c19719912DlLIZ3, C13LE.LIZ(C1262790ixx.class)) && !Intrinsics.LJFF(c19719912DlLIZ3, C13LE.LIZ(C1262780ixw.class)) && (Intrinsics.LJFF(c19719912DlLIZ3, C13LE.LIZ(AbstractC1263550izB.class)) || Intrinsics.LJFF(c19719912DlLIZ3, C13LE.LIZ(AbstractC1890380zIC.class)))) {
                C1262590ixd c1262590ixd2 = c1262310ixB2.LJFF;
                if (c1262590ixd2.LJIILJJIL == null) {
                    c1262590ixd2.LJIILJJIL = Boolean.TRUE;
                }
            }
            C1262300ixA c1262300ixA2 = new C1262300ixA(c1262310ixB2.LIZ, c1262310ixB2.LIZIZ, c1262310ixB2.LIZJ, c1262310ixB2.LIZLLL, c1262310ixB2.LJ, c1262310ixB2.LJFF, null, c1262310ixB2.LJI);
            C19719912Dl c19719912DlLIZ4 = C13LE.LIZ(AbstractC1263550izB.class);
            if (Intrinsics.LJFF(c19719912DlLIZ4, C13LE.LIZ(C1262790ixx.class))) {
                objLJ = iRelationUserCardInternalServiceLIZ2.LIZ(c1262300ixA2, 1).getLayout();
            } else if (Intrinsics.LJFF(c19719912DlLIZ4, C13LE.LIZ(C1262780ixw.class))) {
                objLJ = iRelationUserCardInternalServiceLIZ2.LIZ(c1262300ixA2, 0).getLayout();
            } else if (Intrinsics.LJFF(c19719912DlLIZ4, C13LE.LIZ(AbstractC1263550izB.class))) {
                objLJ = iRelationUserCardInternalServiceLIZ2.LIZIZ(c1262300ixA2);
            } else if (Intrinsics.LJFF(c19719912DlLIZ4, C13LE.LIZ(AbstractC1890380zIC.class))) {
                objLJ = iRelationUserCardInternalServiceLIZ2.LIZJ(c1262300ixA2);
            } else if (Intrinsics.LJFF(c19719912DlLIZ4, C13LE.LIZ(AbstractC1903730zdj.class))) {
                objLJ = iRelationUserCardInternalServiceLIZ2.LIZLLL(c1262300ixA2);
            } else if (Intrinsics.LJFF(c19719912DlLIZ4, C13LE.LIZ(AbstractC1263540izA.class))) {
                objLJ = iRelationUserCardInternalServiceLIZ2.LJ(c1262300ixA2);
            } else {
                "type is error!".toString();
                throw new IllegalStateException("type is error!");
            }
            if (objLJ != null) {
                abstractC1263550izB = (AbstractC1263550izB) objLJ;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.relation.usercard.controller.AbsRelationUserCardChunk");
            }
        }
        ((C1262970iyF) abstractC1263550izB).LJI(null);
        C1262970iyF c1262970iyF = (C1262970iyF) abstractC1263550izB;
        c1262970iyF.LLIIZ(emptyPagePowerListFromXml4);
        emptyPagePowerListFromXml4.LIZJ(abstractC1263550izB);
        emptyPagePowerListFromXml4.setItemAnimator(c1262970iyF.getItemAnimator());
        c1262970iyF.Eg(new InterfaceC1261750iwH() { // from class: X.0e2s
            @Override // X.InterfaceC1261750iwH
            public final void Kk0(AbstractC1261460ivo<?> abstractC1261460ivo) {
            }

            @Override // X.InterfaceC1261750iwH
            public final void LLF(RecyclerView recyclerView, int i6) {
            }

            @Override // X.InterfaceC1261750iwH
            public final void nO0(C1075800e6M c1075800e6M) {
                FriendsEmptyPageRootVM friendsEmptyPageRootVM4 = this.LL.LLIZ;
                if (friendsEmptyPageRootVM4 == null) {
                    friendsEmptyPageRootVM4 = null;
                }
                friendsEmptyPageRootVM4.getClass();
                if (c1075800e6M.LIZ instanceof C1623606Xi) {
                    if (C319860CgK.LIZ()) {
                        C1587740rQ4 c1587740rQ4 = C1587740rQ4.LIZ;
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        c1587740rQ4.getClass();
                        C1587740rQ4.LJIILIIL = jElapsedRealtime - C1587740rQ4.LIZJ;
                        C1587740rQ4.LJI(c1587740rQ4, C0SDP.EMPTY_PAGE, true, null, 4);
                    } else {
                        C1587740rQ4.LIZ.getClass();
                        C1587740rQ4.LJ(true);
                    }
                }
                if (c1075800e6M.LIZIZ() == 0 && c1075800e6M.LIZLLL != 0) {
                    friendsEmptyPageRootVM4.wQ2(AFwS252S0000000_16.get$arr$(668));
                } else {
                    EnumC1070410dxf enumC1070410dxf = friendsEmptyPageRootVM4.LLJ;
                    if (enumC1070410dxf != null) {
                        AbstractC1623806Xk<C626160OhC> abstractC1623806Xk = c1075800e6M.LIZ;
                        AbstractC1623806Xk<List<InterfaceC1891350zJl>> abstractC1623806Xk2 = c1075800e6M.LIZJ;
                        if ((abstractC1623806Xk instanceof C1623606Xi) && (abstractC1623806Xk2 instanceof C1623606Xi)) {
                            friendsEmptyPageRootVM4.LLJ = null;
                            if (c1075800e6M.LIZLLL()) {
                                friendsEmptyPageRootVM4.wQ2(new AwS595S0100000_16(enumC1070410dxf, 450));
                            }
                        }
                    }
                    friendsEmptyPageRootVM4.LLIZ = c1075800e6M;
                    FriendsEmptyPageMainSectionVM friendsEmptyPageMainSectionVM = friendsEmptyPageRootVM4.LLILLJJLI;
                    if (friendsEmptyPageMainSectionVM != null) {
                        C23250099c.LIZLLL(friendsEmptyPageMainSectionVM.LL, null, null, new C1073700e2y(c1075800e6M, friendsEmptyPageMainSectionVM, null), 3);
                    }
                    friendsEmptyPageRootVM4.wQ2(new AwS595S0100000_16(c1075800e6M, 451));
                }
                C1073840e3C c1073840e3C = this.LL;
                c1073840e3C.getClass();
                AbstractC1623806Xk<C626160OhC> abstractC1623806Xk3 = c1075800e6M.LIZ;
                if (!(abstractC1623806Xk3 instanceof C491101vh) && !(abstractC1623806Xk3 instanceof C1623706Xj)) {
                    if (abstractC1623806Xk3 instanceof C491001vg) {
                        Function1<? super Boolean, Unit> function1 = c1073840e3C.LLJIJIL;
                        if (function1 != null) {
                            function1.invoke(Boolean.TRUE);
                            return;
                        }
                        return;
                    }
                    if (abstractC1623806Xk3 instanceof C1623606Xi) {
                        if (c1075800e6M.LJ()) {
                            if (c1075800e6M.LIZIZ() <= 0) {
                                Function1<? super Boolean, Unit> function12 = c1073840e3C.LLJIJIL;
                                if (function12 == null) {
                                    return;
                                }
                                function12.invoke(Boolean.TRUE);
                                return;
                            }
                            Function1<? super Boolean, Unit> function13 = c1073840e3C.LLJIJIL;
                            if (function13 == null) {
                                return;
                            }
                            function13.invoke(Boolean.FALSE);
                            return;
                        }
                        Function1<? super Boolean, Unit> function14 = c1073840e3C.LLJIJIL;
                        if (function14 == null) {
                            return;
                        }
                        function14.invoke(Boolean.FALSE);
                        return;
                    }
                    Function1<? super Boolean, Unit> function15 = c1073840e3C.LLJIJIL;
                    if (function15 == null) {
                        return;
                    }
                    function15.invoke(Boolean.FALSE);
                    return;
                }
                Function1<? super Boolean, Unit> function16 = c1073840e3C.LLJIJIL;
                if (function16 == null) {
                    return;
                }
                function16.invoke(Boolean.FALSE);
            }
        });
        InterfaceC1073860e3E interfaceC1073860e3E2 = this.LLILLL;
        if (interfaceC1073860e3E2 != null) {
            c1262970iyF.Eg(interfaceC1073860e3E2);
        }
        c1262970iyF.LLFZ(false);
        this.LLIZLLLIL = abstractC1263550izB;
        if (C319860CgK.LIZ()) {
            i = 1;
        } else {
            i = 114;
        }
        C426750GoL.LJIIL(emptyPagePowerListFromXml4, null, null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i)))), 23);
        emptyPagePowerListFromXml4.setClipToPadding(false);
        FriendsEmptyPageRootVM friendsEmptyPageRootVM4 = this.LLIZ;
        if (friendsEmptyPageRootVM4 == null) {
            friendsEmptyPageRootVM4 = null;
        }
        MutableLiveData mutableLiveData = friendsEmptyPageRootVM4.LLILZLL;
        Fragment fragment4 = this.LLILZIL;
        if (fragment4 != null) {
            fragment2 = fragment4;
        }
        mutableLiveData.observe(fragment2, new AObserverS220S0100000_16(this, 45));
        if (C319860CgK.LIZ()) {
            findViewById(R.id.im6).getLayoutParams().height = -2;
            findViewById(R.id.h31).getLayoutParams().height = -2;
        } else {
            findViewById(R.id.im6).getLayoutParams().height = -1;
            findViewById(R.id.h31).getLayoutParams().height = -1;
        }
    }
}
