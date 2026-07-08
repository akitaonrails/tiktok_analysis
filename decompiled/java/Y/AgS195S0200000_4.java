package Y;

import X.AbstractC316870CbV;
import X.C099R;
import X.C0DVH;
import X.C0DVI;
import X.C0DVK;
import X.C0PEM;
import X.C13LP;
import X.C1863240yaQ;
import X.C1863380yae;
import X.C1863680yb8;
import X.C189200o6;
import X.C2252321DDq;
import X.C2286608xc;
import X.C23250099c;
import X.C259800zU;
import X.C316640Cb8;
import X.C317290CcB;
import X.C318880Cek;
import X.C319020Cey;
import X.C323380Cm0;
import X.C325010Cod;
import X.C325020Coe;
import X.C325030Cof;
import X.C325080Cok;
import X.C328930Cux;
import X.C342190DbF;
import X.C428380Gqy;
import X.C459370Hzr;
import X.C459400Hzu;
import X.C459410Hzv;
import X.EnumC346100DhY;
import X.InterfaceC1364105Vn;
import X.InterfaceC332260D0u;
import X.InterfaceC346701Wf;
import X.RunnableC514501zT;
import X.ViewOnAttachStateChangeListenerC20631115oD;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.effectcreatormobile.infrastructure.ui.widgets.creator.fragment.CommonFetchFragment;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tako.botpage.vm.MessageViewModel;
import com.ss.android.ugc.aweme.tako.network.TakoNetworkGateImpl;
import com.ss.android.ugc.aweme.tako.network.TakoNetworkState;
import com.ss.android.ugc.aweme.tako.network.TakoRecoveryContext;
import com.ss.android.ugc.aweme.tako.nimblecard.flexnimble.vm.LoadMoreResponse;
import com.ss.android.ugc.aweme.tako.vm.TakoChatBotSharedViewModel;
import com.ss.android.ugc.profile.business.ur.school.addschool.SelectSchoolPageAssem;
import com.ss.android.ugc.profile.business.ur.school.findschoolfriends.FindSchoolFriendsPageContainerAssem;
import com.ss.android.ugc.profile.business.ur.school.findschoolfriends.ability.SchoolGroupsAbility;
import com.ss.android.ugc.profile.business.ur.school.findschoolfriends.ability.SchoolPostAbility;
import com.ss.android.ugc.profile.business.ur.school.findschoolfriends.ability.SchoolUsersAbility;
import com.tts.oecverify.BdTuring;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS39S0010000_27;
import kotlin.jvm.internal.AwS548S0100000_4;
import kotlin.jvm.internal.AwS583S0100000_4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public class AgS195S0200000_4 implements InterfaceC346701Wf {
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
            default:
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ$0(X.C318880Cek r11, X.InterfaceC1364105Vn<? super kotlin.Unit> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof X.C318860Cei
            if (r0 == 0) goto Lb8
            r4 = r12
            X.0Cei r4 = (X.C318860Cei) r4
            int r2 = r4.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lb8
            int r2 = r2 - r1
            r4.LLILZIL = r2
        L12:
            java.lang.Object r1 = r4.LLILLL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILZIL
            r2 = 1
            r5 = 2
            if (r0 == 0) goto L30
            if (r0 == r2) goto L9a
            if (r0 != r5) goto Lbf
            X.0Cek r11 = r4.LL
            X.C155000ia.LIZIZ(r1)
        L27:
            java.lang.Object r0 = r10.l1
            X.00zU r0 = (X.C259800zU) r0
            r0.element = r11
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L30:
            X.C155000ia.LIZIZ(r1)
            java.lang.Object r1 = r10.l0
            com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.mvvm.CreateTabBottomBtnViewModel r1 = (com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.mvvm.CreateTabBottomBtnViewModel) r1
            java.lang.Object r0 = r10.l1
            X.00zU r0 = (X.C259800zU) r0
            T r9 = r0.element
            X.0Cek r9 = (X.C318880Cek) r9
            r1.getClass()
            boolean r8 = r11.LIZIZ
            r7 = r8 ^ 1
            r6 = 0
            if (r8 == 0) goto L98
            X.0Cej r1 = r11.LIZ
            X.0Cej r0 = X.EnumC318870Cej.LLILLL
            if (r1 != r0) goto L98
            r1 = 1
        L50:
            if (r9 == 0) goto L56
            boolean r0 = r9.LIZIZ
            if (r0 != r8) goto L57
        L56:
            r6 = 1
        L57:
            X.0Cel r0 = new X.0Cel
            r0.<init>(r1, r6)
            X.0Cef r6 = new X.0Cef
            r6.<init>(r7, r0)
            X.13Rx r8 = X.C20012313Rx.LIZIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "onInit, "
            r1.append(r0)
            r1.append(r11)
            java.lang.String r0 = ", "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "CreateTabBottomBtnViewModel"
            X.C201955140j.LIZLLL(r8, r0, r1)
            java.lang.Object r0 = r10.l0
            com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.mvvm.CreateTabBottomBtnViewModel r0 = (com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.mvvm.CreateTabBottomBtnViewModel) r0
            X.1DDq r1 = r0.LLILLL
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            r4.LL = r11
            r4.LLILLJJLI = r6
            r4.LLILZIL = r2
            r1.setValue(r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            if (r0 != r3) goto La1
            return r3
        L98:
            r1 = 0
            goto L50
        L9a:
            X.0Cef r6 = r4.LLILLJJLI
            X.0Cek r11 = r4.LL
            X.C155000ia.LIZIZ(r1)
        La1:
            java.lang.Object r0 = r10.l0
            com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.mvvm.CreateTabBottomBtnViewModel r0 = (com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.mvvm.CreateTabBottomBtnViewModel) r0
            X.1DDq r2 = r0.LLILZ
            X.0Cel r1 = r6.LIZIZ
            r4.LL = r11
            r0 = 0
            r4.LLILLJJLI = r0
            r4.LLILZIL = r5
            r2.setValue(r1)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            if (r0 != r3) goto L27
            return r3
        Lb8:
            X.0Cei r4 = new X.0Cei
            r4.<init>(r10, r12)
            goto L12
        Lbf:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS195S0200000_4.LIZ$0(X.0Cek, X.05Vn):java.lang.Object");
    }

    public AgS195S0200000_4(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final Object emit$0(AgS195S0200000_4 agS195S0200000_4, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        ((MessageViewModel) agS195S0200000_4.l0).setState(new AwS39S0010000_27(zBooleanValue, 1));
        TakoChatBotSharedViewModel takoChatBotSharedViewModel = (TakoChatBotSharedViewModel) agS195S0200000_4.l1;
        if (takoChatBotSharedViewModel != null) {
            takoChatBotSharedViewModel.setState(new AwS39S0010000_27(zBooleanValue, 28));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1, types: [T, com.ss.android.ugc.aweme.tako.network.TakoNetworkState] */
    public static final Object emit$1(AgS195S0200000_4 agS195S0200000_4, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        ?? r9 = (TakoNetworkState) obj;
        C259800zU c259800zU = (C259800zU) agS195S0200000_4.l0;
        T t = c259800zU.element;
        if (t == r9) {
            return Unit.LIZ;
        }
        c259800zU.element = r9;
        if (((TakoNetworkState) t).isDegraded() && r9.isConnected() && ((MessageViewModel) agS195S0200000_4.l1).LLIZ) {
            MessageViewModel messageViewModel = (MessageViewModel) agS195S0200000_4.l1;
            if (messageViewModel.LLJI.compareAndSet(false, true)) {
                C1863380yae c1863380yae = messageViewModel.LLJJJJ;
                if (c1863380yae == null) {
                    messageViewModel.LLJI.set(false);
                } else {
                    C23250099c.LIZLLL(ViewModelKt.getViewModelScope(messageViewModel), C0PEM.LIZJ, null, new C319020Cey(c1863380yae, messageViewModel, c1863380yae.LJII, c1863380yae.LJIIIIZZ, c1863380yae.LJIILIIL, null), 2);
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object emit$10(AgS195S0200000_4 agS195S0200000_4, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD = ((FindSchoolFriendsPageContainerAssem) agS195S0200000_4.l0).LLJLL;
        boolean z = false;
        if (viewOnAttachStateChangeListenerC20631115oD != null && viewOnAttachStateChangeListenerC20631115oD.getCurrentItem() == ((FindSchoolFriendsPageContainerAssem) agS195S0200000_4.l0).yp()) {
            C2252321DDq c2252321DDq = ((FindSchoolFriendsPageContainerAssem) agS195S0200000_4.l0).LLLLIILL;
            if ((obj instanceof C459400Hzu) || (obj instanceof C459370Hzr)) {
                z = true;
            }
            c2252321DDq.setValue(Boolean.valueOf(z));
            if ((obj instanceof C459370Hzr) || (obj instanceof C459410Hzv)) {
                ((FindSchoolFriendsPageContainerAssem) agS195S0200000_4.l0).hp(new AwS548S0100000_4((SchoolPostAbility) agS195S0200000_4.l1, 345));
                FindSchoolFriendsPageContainerAssem findSchoolFriendsPageContainerAssem = (FindSchoolFriendsPageContainerAssem) agS195S0200000_4.l0;
                if (!findSchoolFriendsPageContainerAssem.LLLJIL) {
                    findSchoolFriendsPageContainerAssem.LLLJIL = true;
                    findSchoolFriendsPageContainerAssem.X11(EnumC346100DhY.SHOW, null);
                }
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [T, com.ss.android.ugc.aweme.tako.network.TakoNetworkState] */
    public static final Object emit$11(AgS195S0200000_4 agS195S0200000_4, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        ?? r3 = (TakoNetworkState) obj;
        C259800zU c259800zU = (C259800zU) agS195S0200000_4.l0;
        T t = c259800zU.element;
        if (t == r3) {
            return Unit.LIZ;
        }
        c259800zU.element = r3;
        if (((TakoNetworkState) t).isDegraded() && r3.isConnected()) {
            C325080Cok.LIZ.getClass();
            if (C325030Cof.LIZJ) {
                ((C1863240yaQ) agS195S0200000_4.l1).LJJII();
            }
        }
        return Unit.LIZ;
    }

    public static final Object emit$2(AgS195S0200000_4 agS195S0200000_4, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        C0DVK c0dvk = (C0DVK) obj;
        if (c0dvk instanceof C0DVI) {
            ((CommonFetchFragment) agS195S0200000_4.l1).getClass();
            C428380Gqy c428380GqyPR = ((CommonFetchFragment) agS195S0200000_4.l1).PR();
            if (c428380GqyPR != null) {
                c428380GqyPR.e0(C2286608xc.LJ(1), null);
            }
        } else if (c0dvk instanceof C0DVH) {
            ((CommonFetchFragment) agS195S0200000_4.l1).getClass();
            C428380Gqy c428380GqyPR2 = ((CommonFetchFragment) agS195S0200000_4.l1).PR();
            if (c428380GqyPR2 != null) {
                c428380GqyPR2.e0(C2286608xc.LJ(3), null);
            }
            ((CommonFetchFragment) agS195S0200000_4.l1).VR(((C0DVH) c0dvk).LIZIZ);
        } else if (c0dvk instanceof C342190DbF) {
            ((CommonFetchFragment) agS195S0200000_4.l1).getClass();
            C428380Gqy c428380GqyPR3 = ((CommonFetchFragment) agS195S0200000_4.l1).PR();
            if (c428380GqyPR3 != null) {
                c428380GqyPR3.e0(C2286608xc.LJ(2), new AwS583S0100000_4((CommonFetchFragment) agS195S0200000_4.l1, 39));
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [T, com.ss.android.ugc.aweme.tako.network.TakoNetworkState] */
    public static final Object emit$3(AgS195S0200000_4 agS195S0200000_4, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        ?? r5 = (TakoNetworkState) obj;
        ((TakoNetworkGateImpl) agS195S0200000_4.l0).getClass();
        if (!C1863680yb8.LIZLLL() && !C1863680yb8.LIZIZ()) {
            return Unit.LIZ;
        }
        C259800zU c259800zU = (C259800zU) agS195S0200000_4.l1;
        T t = c259800zU.element;
        if (t == r5) {
            return Unit.LIZ;
        }
        c259800zU.element = r5;
        if (((TakoNetworkState) t).isDegraded() && r5.isConnected()) {
            C325020Coe c325020Coe = ((TakoNetworkGateImpl) agS195S0200000_4.l0).LIZJ;
            TakoRecoveryContext takoRecoveryContext = new TakoRecoveryContext(1L, null);
            if (c325020Coe.LIZJ.compareAndSet(false, true)) {
                C23250099c.LIZLLL(c325020Coe.LIZ, C0PEM.LIZJ, null, new C325010Cod(C13LP.LJLLLL(new AComparatorS23S0000000_4(2), c325020Coe.LIZIZ.values()), c325020Coe, takoRecoveryContext, null), 2);
            }
            return Unit.LIZ;
        }
        return Unit.LIZ;
    }

    public static final Object emit$4(AgS195S0200000_4 agS195S0200000_4, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        LoadMoreResponse loadMoreResponse = (LoadMoreResponse) obj;
        if (Intrinsics.LJFF(loadMoreResponse.hasMore, true)) {
            InterfaceC1364105Vn interfaceC1364105Vn2 = (InterfaceC1364105Vn) agS195S0200000_4.l0;
            if (interfaceC1364105Vn2 != null) {
                C323380Cm0 c323380Cm0LJ = C317290CcB.LJ(AbstractC316870CbV.LIZ, null, loadMoreResponse.offset, null, 5);
                C189200o6.m2constructorimpl(c323380Cm0LJ);
                interfaceC1364105Vn2.resumeWith(c323380Cm0LJ);
            }
        } else {
            InterfaceC1364105Vn interfaceC1364105Vn3 = (InterfaceC1364105Vn) agS195S0200000_4.l0;
            if (interfaceC1364105Vn3 != null) {
                C316640Cb8 c316640Cb8LIZIZ = C317290CcB.LIZIZ(AbstractC316870CbV.LIZ);
                C189200o6.m2constructorimpl(c316640Cb8LIZIZ);
                interfaceC1364105Vn3.resumeWith(c316640Cb8LIZIZ);
            }
        }
        C328930Cux.LIZ(new RunnableC514501zT((Function1) agS195S0200000_4.l1, loadMoreResponse, 12));
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$5(Y.AgS195S0200000_4 r5, java.lang.Object r6, X.InterfaceC1364105Vn r7) {
        /*
            boolean r0 = r7 instanceof X.C0CY0
            if (r0 == 0) goto L43
            r4 = r7
            X.0CY0 r4 = (X.C0CY0) r4
            int r2 = r4.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L43
            int r2 = r2 - r1
            r4.LLILLJJLI = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLJJLI
            r2 = 1
            if (r0 == 0) goto L25
            if (r0 != r2) goto L49
            X.C155000ia.LIZIZ(r1)
        L22:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L25:
            X.C155000ia.LIZIZ(r1)
            java.lang.Object r1 = r5.l0
            X.01Wf r1 = (X.InterfaceC346701Wf) r1
            java.lang.Object r0 = r5.l1
            java.lang.Class r0 = (java.lang.Class) r0
            X.12Dl r0 = X.C13LE.LIZ(r0)
            boolean r0 = r0.LIZIZ(r6)
            if (r0 == 0) goto L22
            r4.LLILLJJLI = r2
            java.lang.Object r0 = r1.emit(r6, r4)
            if (r0 != r3) goto L22
            return r3
        L43:
            X.0CY0 r4 = new X.0CY0
            r4.<init>(r5, r7)
            goto L12
        L49:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS195S0200000_4.emit$5(Y.AgS195S0200000_4, java.lang.Object, X.05Vn):java.lang.Object");
    }

    public static final /* bridge */ /* synthetic */ Object emit$6(AgS195S0200000_4 agS195S0200000_4, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        return agS195S0200000_4.LIZ$0((C318880Cek) obj, interfaceC1364105Vn);
    }

    public static final Object emit$7(AgS195S0200000_4 agS195S0200000_4, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        if (((SelectSchoolPageAssem) agS195S0200000_4.l0).LLLIIL) {
            Object objEmit = ((InterfaceC332260D0u) agS195S0200000_4.l1).emit(obj, interfaceC1364105Vn);
            if (objEmit != C099R.LJFF()) {
                return Unit.LIZ;
            }
            return objEmit;
        }
        return Unit.LIZ;
    }

    public static final Object emit$8(AgS195S0200000_4 agS195S0200000_4, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD = ((FindSchoolFriendsPageContainerAssem) agS195S0200000_4.l0).LLJLL;
        boolean z = false;
        if (viewOnAttachStateChangeListenerC20631115oD != null && viewOnAttachStateChangeListenerC20631115oD.getCurrentItem() == ((FindSchoolFriendsPageContainerAssem) agS195S0200000_4.l0).up()) {
            C2252321DDq c2252321DDq = ((FindSchoolFriendsPageContainerAssem) agS195S0200000_4.l0).LLLLIILL;
            if ((obj instanceof C459400Hzu) || (obj instanceof C459370Hzr)) {
                z = true;
            }
            c2252321DDq.setValue(Boolean.valueOf(z));
            if ((obj instanceof C459370Hzr) || (obj instanceof C459410Hzv)) {
                ((FindSchoolFriendsPageContainerAssem) agS195S0200000_4.l0).hp(new AwS548S0100000_4((SchoolUsersAbility) agS195S0200000_4.l1, 343));
                FindSchoolFriendsPageContainerAssem findSchoolFriendsPageContainerAssem = (FindSchoolFriendsPageContainerAssem) agS195S0200000_4.l0;
                if (!findSchoolFriendsPageContainerAssem.LLLJIL) {
                    findSchoolFriendsPageContainerAssem.X11(EnumC346100DhY.SHOW, null);
                    ((FindSchoolFriendsPageContainerAssem) agS195S0200000_4.l0).LLLJIL = true;
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object emit$9(AgS195S0200000_4 agS195S0200000_4, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD = ((FindSchoolFriendsPageContainerAssem) agS195S0200000_4.l0).LLJLL;
        boolean z = false;
        if (viewOnAttachStateChangeListenerC20631115oD != null && viewOnAttachStateChangeListenerC20631115oD.getCurrentItem() == ((FindSchoolFriendsPageContainerAssem) agS195S0200000_4.l0).sp()) {
            C2252321DDq c2252321DDq = ((FindSchoolFriendsPageContainerAssem) agS195S0200000_4.l0).LLLLIILL;
            if ((obj instanceof C459400Hzu) || (obj instanceof C459370Hzr)) {
                z = true;
            }
            c2252321DDq.setValue(Boolean.valueOf(z));
            if ((obj instanceof C459370Hzr) || (obj instanceof C459410Hzv)) {
                ((FindSchoolFriendsPageContainerAssem) agS195S0200000_4.l0).hp(new AwS548S0100000_4((SchoolGroupsAbility) agS195S0200000_4.l1, 344));
                FindSchoolFriendsPageContainerAssem findSchoolFriendsPageContainerAssem = (FindSchoolFriendsPageContainerAssem) agS195S0200000_4.l0;
                if (!findSchoolFriendsPageContainerAssem.LLLJIL) {
                    findSchoolFriendsPageContainerAssem.X11(EnumC346100DhY.SHOW, null);
                    ((FindSchoolFriendsPageContainerAssem) agS195S0200000_4.l0).LLLJIL = true;
                }
            }
        }
        return Unit.LIZ;
    }
}
