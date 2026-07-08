package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.im.core.proto.ReferenceInfo;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListQuotedMessageClickAbility;
import com.ss.android.ugc.aweme.im.sdk.chat.controller.utils.QuotedMessageViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.data.dto.QuotedMessageInfo;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0I3j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C460330I3j implements InterfaceC460500I4a, InterfaceC724530SbT {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZ;
    public final SessionInfo LL;
    public final AssemVMLazy LLILLJJLI;
    public final Lifecycle LLILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C460330I3j.class, "quotedMessageViewModel", "getQuotedMessageViewModel()Lcom/ss/android/ugc/aweme/im/sdk/chat/controller/utils/QuotedMessageViewModel;", 0);
        C13LE.LIZ.getClass();
        LLILZ = new InterfaceC2217461Bqa[]{c2217381BqS};
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
        return this.LLILLL;
    }

    @Override // X.C0I4V
    public final C0I3K<C460810I5f> LIZ(C869590Y9l c869590Y9l) {
        Long l;
        C0YUT c0yut;
        Long l2;
        final Long l3;
        Long l4;
        Long l5;
        Long l6;
        ReferenceInfo referenceInfo = c869590Y9l.getReferenceInfo();
        if (referenceInfo != null && (l = referenceInfo.ref_message_type) != null && ((int) l.longValue()) == 1803 && (((c0yut = referenceInfo.referenced_message_status) != C0YUT.DELETED || c0yut != C0YUT.NOT_EXIST) && (l2 = referenceInfo.referenced_message_id) != null)) {
            final long jLongValue = l2.longValue();
            AssemVMLazy assemVMLazy = this.LLILLJJLI;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZ;
            QuotedMessageInfo.QuotedVideoTemplateInfo quotedVideoTemplateInfo = (QuotedMessageInfo.QuotedVideoTemplateInfo) ((QuotedMessageViewModel) assemVMLazy.getValue()).wQ2(c869590Y9l, QuotedMessageInfo.QuotedVideoTemplateInfo.class);
            if (quotedVideoTemplateInfo == null) {
                C460460I3w mediaUIState = EnumC460370I3n.VIDEO.toMediaUIState();
                long refMsgId = c869590Y9l.getRefMsgId();
                ReferenceInfo referenceInfo2 = c869590Y9l.getReferenceInfo();
                if (referenceInfo2 != null) {
                    l6 = referenceInfo2.ref_message_type;
                } else {
                    l6 = null;
                }
                return new C0I3O(new C460810I5f(null, mediaUIState, new C0I3R(refMsgId, l6), 39));
            }
            if (quotedVideoTemplateInfo.shouldShowAsUnavailable) {
                final C1233704sB c1233704sB = new C1233704sB(2131831101, (List<String>) null);
                AbstractC1236404sc abstractC1236404sc = new AbstractC1236404sc(c1233704sB) { // from class: X.04sN
                    public final InterfaceC460300I3g LIZIZ;

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof C1234904sN) && Intrinsics.LJFF(this.LIZIZ, ((C1234904sN) obj).LIZIZ);
                    }

                    public final int hashCode() {
                        return this.LIZIZ.hashCode();
                    }

                    public final String toString() {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("VideoFromRefInfoText(data=");
                        sbLIZ.append(this.LIZIZ);
                        sbLIZ.append(')');
                        return C2188811AlT.LIZIZ(sbLIZ);
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
                ReferenceInfo referenceInfo3 = c869590Y9l.getReferenceInfo();
                if (referenceInfo3 != null) {
                    l5 = referenceInfo3.ref_message_type;
                } else {
                    l5 = null;
                }
                return new C0I3O(new C460810I5f(null, abstractC1236404sc, new C0I3R(jLongValue, l5), 39));
            }
            if (quotedVideoTemplateInfo.isNudeMask) {
                final C1233704sB c1233704sB2 = new C1233704sB(2131831102, (List<String>) null);
                AbstractC1236404sc abstractC1236404sc2 = new AbstractC1236404sc(c1233704sB2) { // from class: X.04sN
                    public final InterfaceC460300I3g LIZIZ;

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof C1234904sN) && Intrinsics.LJFF(this.LIZIZ, ((C1234904sN) obj).LIZIZ);
                    }

                    public final int hashCode() {
                        return this.LIZIZ.hashCode();
                    }

                    public final String toString() {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("VideoFromRefInfoText(data=");
                        sbLIZ.append(this.LIZIZ);
                        sbLIZ.append(')');
                        return C2188811AlT.LIZIZ(sbLIZ);
                    }

                    @Override // X.AbstractC1236404sc
                    public final InterfaceC460300I3g LIZ() {
                        return this.LIZIZ;
                    }

                    {
                        super(c1233704sB2);
                        this.LIZIZ = c1233704sB2;
                    }
                };
                long refMsgId2 = c869590Y9l.getRefMsgId();
                ReferenceInfo referenceInfo4 = c869590Y9l.getReferenceInfo();
                if (referenceInfo4 != null) {
                    l4 = referenceInfo4.ref_message_type;
                } else {
                    l4 = null;
                }
                return new C0I3O(new C460810I5f(null, abstractC1236404sc2, new C0I3R(refMsgId2, l4), 39));
            }
            C460360I3m c460360I3m = new C460360I3m(C0I3J.LIZ(quotedVideoTemplateInfo.urlList), quotedVideoTemplateInfo.width, quotedVideoTemplateInfo.height, C1ED0.LIZ(quotedVideoTemplateInfo.photoMsgCreateAt, quotedVideoTemplateInfo.isForceMask, quotedVideoTemplateInfo.isSendBySelf, this.LL.isMediaMsgMasking()), false);
            final String str = quotedVideoTemplateInfo.videoId;
            ReferenceInfo referenceInfo5 = c869590Y9l.getReferenceInfo();
            if (referenceInfo5 != null) {
                l3 = referenceInfo5.ref_message_type;
            } else {
                l3 = null;
            }
            return new C0I3O(new C460810I5f(null, c460360I3m, new AbstractC455680Htu(jLongValue, str, l3) { // from class: X.0Htp
                public final String LIZJ;
                public final long LIZLLL;
                public final Long LJ;

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C455630Htp)) {
                        return false;
                    }
                    C455630Htp c455630Htp = (C455630Htp) obj;
                    return Intrinsics.LJFF(this.LIZJ, c455630Htp.LIZJ) && this.LIZLLL == c455630Htp.LIZLLL && Intrinsics.LJFF(this.LJ, c455630Htp.LJ);
                }

                public final int hashCode() {
                    int iHashCode = ((this.LIZJ.hashCode() * 31) + C786410Ut5.Y2(this.LIZLLL)) * 31;
                    Long l7 = this.LJ;
                    return iHashCode + (l7 == null ? 0 : l7.hashCode());
                }

                public final String toString() {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("VideoClick(videoId=");
                    sbLIZ.append(this.LIZJ);
                    sbLIZ.append(", videoMsgId=");
                    sbLIZ.append(this.LIZLLL);
                    sbLIZ.append(", messageType=");
                    sbLIZ.append(this.LJ);
                    sbLIZ.append(')');
                    return C2188811AlT.LIZIZ(sbLIZ);
                }

                @Override // X.AbstractC455680Htu
                public final void LIZ(View view, MessageListQuotedMessageClickAbility messageListQuotedMessageClickAbility) {
                    messageListQuotedMessageClickAbility.RK(view, this.LIZ, this.LJ, this.LIZJ);
                }

                {
                    super(jLongValue, l3);
                    this.LIZJ = str;
                    this.LIZLLL = jLongValue;
                    this.LJ = l3;
                }
            }, 39));
        }
        return C0I3M.LIZ;
    }

    public C460330I3j(Fragment fragment, SessionInfo sessionInfo) {
        this.LL = sessionInfo;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(QuotedMessageViewModel.class);
        this.LLILLJJLI = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ), new C5182020e((C13IQ) c19719912DlLIZ, 181), new C452070Ho5(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS550S0100000_6((HasDefaultViewModelProviderFactory) fragment, 1015), AFwS236S0000000_6.get$arr$(398));
        this.LLILLL = fragment.getLifecycle();
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
