package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.im.core.proto.ReferenceInfo;
import com.ss.android.ugc.aweme.im.sdk.chat.controller.utils.QuotedMessageViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.data.dto.QuotedMessageInfo;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS620S0100000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0I3Z, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0I3Z implements InterfaceC460500I4a, InterfaceC724530SbT {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILLL;
    public final AssemVMLazy LL;
    public final Lifecycle LLILLJJLI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0I3Z.class, "quotedMessageViewModel", "getQuotedMessageViewModel()Lcom/ss/android/ugc/aweme/im/sdk/chat/controller/utils/QuotedMessageViewModel;", 0);
        C13LE.LIZ.getClass();
        LLILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
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

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.LLILLJJLI;
    }

    public C0I3Z(Fragment fragment) {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(QuotedMessageViewModel.class);
        this.LL = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ), new AwS550S0100000_6(c19719912DlLIZ, 1018), new C452070Ho5(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS550S0100000_6((HasDefaultViewModelProviderFactory) fragment, 1019), AFwS236S0000000_6.get$arr$(400));
        this.LLILLJJLI = fragment.getLifecycle();
    }

    @Override // X.C0I4V
    public final C0I3K<C460810I5f> LIZ(C869590Y9l c869590Y9l) {
        Long l;
        Long l2;
        ReferenceInfo referenceInfo = c869590Y9l.getReferenceInfo();
        if (referenceInfo != null && (l = referenceInfo.ref_message_type) != null && ((int) l.longValue()) == 1811) {
            AssemVMLazy assemVMLazy = this.LL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILLL;
            QuotedMessageInfo.QuotedCommentTemplateInfo quotedCommentTemplateInfo = (QuotedMessageInfo.QuotedCommentTemplateInfo) ((QuotedMessageViewModel) assemVMLazy.getValue()).wQ2(c869590Y9l, QuotedMessageInfo.QuotedCommentTemplateInfo.class);
            if (quotedCommentTemplateInfo != null && quotedCommentTemplateInfo.isCommentAvailable) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(quotedCommentTemplateInfo.commentAuthorUsername);
                sbLIZ.append(',');
                sbLIZ.append(quotedCommentTemplateInfo.commentText);
                final C460250I3b c460250I3b = new C460250I3b(C2188811AlT.LIZIZ(sbLIZ), new AwS620S0100000_6(quotedCommentTemplateInfo, 103));
                return new C0I3O(new C460810I5f(null, new AbstractC1236404sc(c460250I3b) { // from class: X.04sU
                    public final InterfaceC460300I3g LIZIZ;

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof C1235604sU) && Intrinsics.LJFF(this.LIZIZ, ((C1235604sU) obj).LIZIZ);
                    }

                    public final int hashCode() {
                        return this.LIZIZ.hashCode();
                    }

                    public final String toString() {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("CommentTemplateText(data=");
                        sbLIZ2.append(this.LIZIZ);
                        sbLIZ2.append(')');
                        return C2188811AlT.LIZIZ(sbLIZ2);
                    }

                    @Override // X.AbstractC1236404sc
                    public final InterfaceC460300I3g LIZ() {
                        return this.LIZIZ;
                    }

                    {
                        super(c460250I3b);
                        this.LIZIZ = c460250I3b;
                    }
                }, null, 55));
            }
            final C1233704sB c1233704sB = new C1233704sB(2131831549, (List<String>) null);
            AbstractC1236404sc abstractC1236404sc = new AbstractC1236404sc(c1233704sB) { // from class: X.04sU
                public final InterfaceC460300I3g LIZIZ;

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C1235604sU) && Intrinsics.LJFF(this.LIZIZ, ((C1235604sU) obj).LIZIZ);
                }

                public final int hashCode() {
                    return this.LIZIZ.hashCode();
                }

                public final String toString() {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("CommentTemplateText(data=");
                    sbLIZ2.append(this.LIZIZ);
                    sbLIZ2.append(')');
                    return C2188811AlT.LIZIZ(sbLIZ2);
                }

                @Override // X.AbstractC1236404sc
                public final InterfaceC460300I3g LIZ() {
                    return this.LIZIZ;
                }

                {
                    super(c1233704sB);
                    this.LIZIZ = c1233704sB;
                }
            };
            long refMsgId = c869590Y9l.getRefMsgId();
            ReferenceInfo referenceInfo2 = c869590Y9l.getReferenceInfo();
            if (referenceInfo2 != null) {
                l2 = referenceInfo2.ref_message_type;
            } else {
                l2 = null;
            }
            return new C0I3O(new C460810I5f(null, abstractC1236404sc, new C0I3R(refMsgId, l2), 39));
        }
        return C0I3M.LIZ;
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
