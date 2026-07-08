package X;

import android.text.TextUtils;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.comment.model.CommentCommonModel;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt;
import com.ss.android.ugc.aweme.comment.model.CommentEventModel;
import com.ss.android.ugc.aweme.commentv2.commentlist.powercell.DescCell;
import com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentListAssemVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS422S0200000_21;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lHS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1351760lHS extends AbstractC1906720ziY implements InterfaceC724530SbT {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public final AssemVMLazy LLIZLLLIL;
    public CommentContextSource LLJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1351760lHS.class, "listVm", "getListVm()Lcom/ss/android/ugc/aweme/commentv2/commentlist/viewmodel/CommentListAssemVM;", 0);
        C13LE.LIZ.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC724530SbT, X.InterfaceC736810SvH
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC736810SvH getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC725050ScJ
    public final C03H5 getActualReceiver() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC725050ScJ<C03H5> getActualReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // X.AbstractC1906720ziY, X.InterfaceC1906750zib
    public final void onCreate() {
        LJIILIIL(DescCell.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1351760lHS() {
        AssemVMLazy assemVMLazy;
        HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory;
        HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory2;
        HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory3;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(CommentListAssemVM.class);
        AwS565S0100000_21 awS565S0100000_21 = new AwS565S0100000_21(c19719912DlLIZ, 1652);
        AFwS259S0000000_21 aFwS259S0000000_21 = AFwS259S0000000_21.get$arr$(458);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS565S0100000_21(c19719912DlLIZ, 1663), awS565S0100000_21, AFwS209S0000000_21.get$arr$(667), new AwS565S0100000_21(this, 1638), new AwS565S0100000_21(this, 1640), (!(this instanceof HasDefaultViewModelProviderFactory) || (hasDefaultViewModelProviderFactory3 = (HasDefaultViewModelProviderFactory) this) == null) ? C1143000fqk.LIZ : new AwS565S0100000_21(hasDefaultViewModelProviderFactory3, 1642), aFwS259S0000000_21, new AwS565S0100000_21(this, 1644), null, new AwS565S0100000_21(this, 1645));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS565S0100000_21 awS565S0100000_212 = new AwS565S0100000_21(this, 1639);
            Function0 awS565S0100000_213 = (!(this instanceof HasDefaultViewModelProviderFactory) || (hasDefaultViewModelProviderFactory2 = (HasDefaultViewModelProviderFactory) this) == null) ? C1143000fqk.LIZ : new AwS565S0100000_21(hasDefaultViewModelProviderFactory2, 1641);
            AwS565S0100000_21 awS565S0100000_214 = new AwS565S0100000_21(c19719912DlLIZ, 1643);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS422S0200000_21((InterfaceC451590HnJ) obj, awS565S0100000_212, 136));
            AwS565S0100000_21 awS565S0100000_215 = new AwS565S0100000_21(c01gwLIZIZ, 1646);
            AwS565S0100000_21 awS565S0100000_216 = new AwS565S0100000_21(c01gwLIZIZ, 1647);
            AwS565S0100000_21 awS565S0100000_217 = new AwS565S0100000_21(c01gwLIZIZ, 1648);
            AwS565S0100000_21 awS565S0100000_218 = new AwS565S0100000_21(c01gwLIZIZ, 1649);
            AwS565S0100000_21 awS565S0100000_219 = new AwS565S0100000_21(c01gwLIZIZ, 1650);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS565S0100000_214, awS565S0100000_21, new C452080Ho6(), awS565S0100000_215, awS565S0100000_216, awS565S0100000_213, aFwS259S0000000_21, awS565S0100000_217, awS565S0100000_218, awS565S0100000_219);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS565S0100000_21(c19719912DlLIZ, 1651), awS565S0100000_21, AFwS209S0000000_21.get$arr$(665), new AwS565S0100000_21(this, 1653), new AwS565S0100000_21(this, 1654), (!(this instanceof HasDefaultViewModelProviderFactory) || (hasDefaultViewModelProviderFactory = (HasDefaultViewModelProviderFactory) this) == null) ? C1143000fqk.LIZ : new AwS565S0100000_21(hasDefaultViewModelProviderFactory, 1655), aFwS259S0000000_21, new AwS565S0100000_21(this, 1656), null, new AwS565S0100000_21(this, 1657));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS565S0100000_21(c19719912DlLIZ, 1658), awS565S0100000_21, AFwS209S0000000_21.get$arr$(666), new AwS565S0100000_21(this, 1659), new AwS565S0100000_21(this, 1660), new AwS565S0100000_21(this, 1661), aFwS259S0000000_21, null, null, new AwS565S0100000_21(this, 1662));
        }
        this.LLIZLLLIL = assemVMLazy;
    }

    public final void LJJ(Aweme aweme) {
        Boolean boolValueOf;
        CommentContextSource commentContextSource;
        String authorUid;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        int i;
        String str7;
        Boolean boolIsMyProfile;
        CommentCommonModel commonModel;
        CommentCommonModel commonModel2;
        CommentCommonModel commonModel3;
        CommentEventModel eventModel;
        CommentEventModel eventModel2;
        CommentEventModel eventModel3;
        CommentEventModel eventModel4;
        CommentCommonModel commonModel4;
        CommentCommonModel commonModel5;
        Aweme aweme2;
        CommentCommonModel commonModel6;
        if (aweme == null) {
            return;
        }
        CommentContextSource commentContextSource2 = this.LLJ;
        if (commentContextSource2 != null && (commonModel6 = commentContextSource2.getCommonModel()) != null) {
            boolValueOf = Boolean.valueOf(commonModel6.shouldShowVideoDesc);
        } else {
            boolValueOf = null;
        }
        if (!C1346420l8q.LIZ(boolValueOf) || ((commentContextSource = this.LLJ) != null && CommentContextSourceKt.isFromTitlePanel(commentContextSource))) {
            AssemVMLazy assemVMLazy = this.LLIZLLLIL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJI;
            ((CommentListAssemVM) assemVMLazy.getValue()).LLIZ = false;
            if (this.LLILZLL.LJIIIIZZ() > 0) {
                this.LLILZLL.LJIIJJI(C13BV.INSTANCE, null);
                return;
            }
            return;
        }
        C0SPY c0spy = new C0SPY();
        CommentContextSource commentContextSource3 = this.LLJ;
        if (commentContextSource3 == null || (aweme2 = CommentContextSourceKt.aweme(commentContextSource3)) == null || (authorUid = AwemeExtKt.getAuthorUid(aweme2)) == null) {
            authorUid = "";
        }
        c0spy.authorUid = authorUid;
        c0spy.awemeId = aweme.getAid();
        CommentContextSource commentContextSource4 = this.LLJ;
        if (commentContextSource4 == null || (commonModel5 = commentContextSource4.getCommonModel()) == null || (str = commonModel5.enterFrom) == null) {
            str = "";
        }
        c0spy.enterFrom = str;
        CommentContextSource commentContextSource5 = this.LLJ;
        if (commentContextSource5 == null || (commonModel4 = commentContextSource5.getCommonModel()) == null || (str2 = commonModel4.eventType) == null) {
            str2 = "";
        }
        c0spy.eventType = str2;
        CommentContextSource commentContextSource6 = this.LLJ;
        if (commentContextSource6 == null || (eventModel4 = commentContextSource6.getEventModel()) == null || (str3 = eventModel4.playListId) == null) {
            str3 = "";
        }
        c0spy.mPlayListId = str3;
        CommentContextSource commentContextSource7 = this.LLJ;
        if (commentContextSource7 == null || (eventModel3 = commentContextSource7.getEventModel()) == null || (str4 = eventModel3.playListType) == null) {
            str4 = "";
        }
        c0spy.mPlayListType = str4;
        CommentContextSource commentContextSource8 = this.LLJ;
        if (commentContextSource8 == null || (eventModel2 = commentContextSource8.getEventModel()) == null || (str5 = eventModel2.requestId) == null) {
            str5 = "";
        }
        c0spy.requestId = str5;
        CommentContextSource commentContextSource9 = this.LLJ;
        if (commentContextSource9 == null || (eventModel = commentContextSource9.getEventModel()) == null || (str6 = eventModel.playListIdKey) == null) {
            str6 = "";
        }
        c0spy.mPlayListIdKey = str6;
        CommentContextSource commentContextSource10 = this.LLJ;
        if (commentContextSource10 != null && (commonModel3 = commentContextSource10.getCommonModel()) != null) {
            i = commonModel3.pageType;
        } else {
            i = 0;
        }
        c0spy.pageType = i;
        CommentContextSource commentContextSource11 = this.LLJ;
        if (commentContextSource11 == null || (commonModel2 = commentContextSource11.getCommonModel()) == null || (str7 = commonModel2.tabName) == null) {
            str7 = "";
        }
        c0spy.tabName = str7;
        CommentContextSource commentContextSource12 = this.LLJ;
        if (commentContextSource12 == null || (commonModel = commentContextSource12.getCommonModel()) == null || (boolIsMyProfile = commonModel.isMyProfile()) == null) {
            boolIsMyProfile = Boolean.FALSE;
        }
        c0spy.isProfile = boolIsMyProfile;
        c0spy.aweme = aweme;
        C0SWK c0swk = new C0SWK(aweme, c0spy);
        c0swk.setAwemeId(aweme.getAid());
        if (TextUtils.isEmpty(aweme.getDesc())) {
            c0swk.setText("");
        } else {
            c0swk.setText(aweme.getDesc());
        }
        c0swk.setTextExtra(aweme.getTextExtra());
        c0swk.setCreateTime((int) aweme.getCreateTime());
        c0swk.setUser(aweme.getAuthor());
        List listSingletonList = Collections.singletonList(new C0SWS(c0swk));
        AssemVMLazy assemVMLazy2 = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = LLJI;
        ((CommentListAssemVM) assemVMLazy2.getValue()).LLIZ = true;
        this.LLILZLL.LJIILL(listSingletonList, null);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o> C0ZP4 subscribe(AssemViewModel<S> assemViewModel, C1770850wBP<S> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super S, Unit> function2) {
        return C736680Sv4.LJIILLIIL(this, assemViewModel, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJ(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJIILJJIL(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1770850wBP<C19474211Gy<A, B>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631620sYq<? super C03H5, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C736680Sv4.LIZLLL(assemViewModel, this, c1770850wBP, function1, interfaceC1631620sYq, interfaceC2217241BqE, interfaceC2217241BqE2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1770850wBP<C11H7<A, B, C>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631630sYr<? super C03H5, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C736680Sv4.LJFF(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1770850wBP, function1, interfaceC1631630sYr);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1770850wBP<C11H6<A, B, C, D>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685420txc<? super C03H5, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C736680Sv4.LJI(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1770850wBP, function1, interfaceC1685420txc);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D, E> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends E> interfaceC2217241BqE5, C1770850wBP<C11H2<A, B, C, D, E>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685430txd<? super C03H5, ? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685430txd) {
        return C736680Sv4.LJII(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, c1770850wBP, function1, interfaceC1685430txd);
    }
}
