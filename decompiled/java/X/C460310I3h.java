package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.im.core.proto.ReferenceInfo;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.sdk.chat.controller.utils.QuotedMessageViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.data.dto.QuotedMessageInfo;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS21S0010000_6;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0I3h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C460310I3h implements InterfaceC460500I4a, InterfaceC724530SbT {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILLL;
    public final AssemVMLazy LL;
    public final Lifecycle LLILLJJLI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C460310I3h.class, "quotedMessageViewModel", "getQuotedMessageViewModel()Lcom/ss/android/ugc/aweme/im/sdk/chat/controller/utils/QuotedMessageViewModel;", 0);
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

    public C460310I3h(Fragment fragment) {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(QuotedMessageViewModel.class);
        this.LL = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ), new C5182020e((C13IQ) c19719912DlLIZ, 179), new C452070Ho5(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS550S0100000_6((HasDefaultViewModelProviderFactory) fragment, 1007), AFwS236S0000000_6.get$arr$(391));
        this.LLILLJJLI = fragment.getLifecycle();
    }

    @Override // X.C0I4V
    public final C0I3K<C460810I5f> LIZ(C869590Y9l c869590Y9l) {
        Long l;
        C0YUT c0yut;
        Long l2;
        Long l3;
        Long l4;
        Long l5;
        Long l6;
        ReferenceInfo referenceInfo = c869590Y9l.getReferenceInfo();
        if (referenceInfo != null && (l = referenceInfo.ref_message_type) != null && ((int) l.longValue()) == 1818 && (((c0yut = referenceInfo.referenced_message_status) != C0YUT.DELETED || c0yut != C0YUT.NOT_EXIST) && (l2 = referenceInfo.referenced_message_id) != null)) {
            long jLongValue = l2.longValue();
            AssemVMLazy assemVMLazy = this.LL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILLL;
            QuotedMessageInfo.QuotedQuickLiveReactionVideoTemplateInfo quotedQuickLiveReactionVideoTemplateInfo = (QuotedMessageInfo.QuotedQuickLiveReactionVideoTemplateInfo) ((QuotedMessageViewModel) assemVMLazy.getValue()).wQ2(c869590Y9l, QuotedMessageInfo.QuotedQuickLiveReactionVideoTemplateInfo.class);
            if (quotedQuickLiveReactionVideoTemplateInfo == null) {
                C460460I3w mediaUIState = EnumC460370I3n.QUICK_LIVE_REACTION.toMediaUIState();
                long refMsgId = c869590Y9l.getRefMsgId();
                ReferenceInfo referenceInfo2 = c869590Y9l.getReferenceInfo();
                if (referenceInfo2 != null) {
                    l6 = referenceInfo2.ref_message_type;
                } else {
                    l6 = null;
                }
                return new C0I3O(new C460810I5f(null, mediaUIState, new C0I3R(refMsgId, l6), 39));
            }
            if (quotedQuickLiveReactionVideoTemplateInfo.shouldShowAsUnavailable) {
                final C1233704sB c1233704sB = new C1233704sB(2131831101, (List<String>) null);
                AbstractC1236404sc abstractC1236404sc = new AbstractC1236404sc(c1233704sB) { // from class: X.04sD
                    public final InterfaceC460300I3g LIZIZ;

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof C1233904sD) && Intrinsics.LJFF(this.LIZIZ, ((C1233904sD) obj).LIZIZ);
                    }

                    public final int hashCode() {
                        return this.LIZIZ.hashCode();
                    }

                    public final String toString() {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("QuickLiveVideoFromRefInfo(data=");
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
            if (quotedQuickLiveReactionVideoTemplateInfo.isNudeMask) {
                final C1233704sB c1233704sB2 = new C1233704sB(2131831102, (List<String>) null);
                AbstractC1236404sc abstractC1236404sc2 = new AbstractC1236404sc(c1233704sB2) { // from class: X.04sD
                    public final InterfaceC460300I3g LIZIZ;

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof C1233904sD) && Intrinsics.LJFF(this.LIZIZ, ((C1233904sD) obj).LIZIZ);
                    }

                    public final int hashCode() {
                        return this.LIZIZ.hashCode();
                    }

                    public final String toString() {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("QuickLiveVideoFromRefInfo(data=");
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
            final UrlModel urlModelLIZ = C0I3J.LIZ(quotedQuickLiveReactionVideoTemplateInfo.urlList);
            final int i = quotedQuickLiveReactionVideoTemplateInfo.height;
            final int i2 = quotedQuickLiveReactionVideoTemplateInfo.width;
            final boolean zLIZ = C1ED0.LIZ(quotedQuickLiveReactionVideoTemplateInfo.photoMsgCreateAt, quotedQuickLiveReactionVideoTemplateInfo.isForceMask, quotedQuickLiveReactionVideoTemplateInfo.isSendBySelf, false);
            C0I5K c0i5k = new C0I5K(urlModelLIZ, i2, i, zLIZ) { // from class: X.0I3l
                public final UrlModel LJIILLIIL;
                public final int LJIIZILJ;
                public final int LJIJ;
                public final boolean LJIJI;

                public final String toString() {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("QuotedQuickLiveVideo(videoUrlModel=");
                    sbLIZ.append(this.LJIILLIIL);
                    sbLIZ.append(", videoWidth=");
                    sbLIZ.append(this.LJIIZILJ);
                    sbLIZ.append(", videoHeight=");
                    sbLIZ.append(this.LJIJ);
                    sbLIZ.append(", isMasked=");
                    sbLIZ.append(this.LJIJI);
                    sbLIZ.append(')');
                    return C2188811AlT.LIZIZ(sbLIZ);
                }

                public final int hashCode() {
                    return (this.LJIILLIIL.getUrlList().hashCode() * 31) + C786410Ut5.Z2(this.LJIJI);
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C460350I3l)) {
                        return false;
                    }
                    C460350I3l c460350I3l = (C460350I3l) obj;
                    if (Intrinsics.LJFF(this.LJIILLIIL.getUrlList(), c460350I3l.LJIILLIIL.getUrlList()) && this.LJIJI == c460350I3l.LJIJI) {
                        return true;
                    }
                    return false;
                }

                {
                    C460450I3v c460450I3v;
                    Integer numValueOf;
                    int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(200));
                    if (zLIZ) {
                        c460450I3v = new C460450I3v(R.raw.icon_eye_slash, Integer.valueOf(R.attr.zi));
                        numValueOf = Integer.valueOf(R.drawable.c_m);
                    } else {
                        c460450I3v = null;
                        numValueOf = null;
                    }
                    super(urlModelLIZ, Integer.valueOf(R.drawable.c_n), null, InterfaceC1320380kSq.LJI, new AwS21S0010000_6(zLIZ, 15), false, null, new C1233704sB(2131831881, (List<String>) null), null, EnumC460470I3x.CIRCLE, c460450I3v, i, i2, iLIZIZ, numValueOf, 16740);
                    this.LJIILLIIL = urlModelLIZ;
                    this.LJIIZILJ = i2;
                    this.LJIJ = i;
                    this.LJIJI = zLIZ;
                }
            };
            long refMsgId3 = c869590Y9l.getRefMsgId();
            ReferenceInfo referenceInfo5 = c869590Y9l.getReferenceInfo();
            if (referenceInfo5 != null) {
                l3 = referenceInfo5.ref_message_type;
            } else {
                l3 = null;
            }
            return new C0I3O(new C460810I5f(null, c0i5k, new C455650Htr(refMsgId3, l3), 39));
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
