package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.im.core.proto.ReferenceInfo;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.message.template.card.dynamic.DynamicCardClientInfoComponent;
import com.ss.android.ugc.aweme.im.sdk.chat.controller.utils.QuotedMessageViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.data.dto.QuotedMessageInfo;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0I4G, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0I4G implements InterfaceC460500I4a, InterfaceC724530SbT {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILLL;
    public final AssemVMLazy LL;
    public final Lifecycle LLILLJJLI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0I4G.class, "quotedMessageViewModel", "getQuotedMessageViewModel()Lcom/ss/android/ugc/aweme/im/sdk/chat/controller/utils/QuotedMessageViewModel;", 0);
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

    public C0I4G(Fragment fragment) {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(QuotedMessageViewModel.class);
        this.LL = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ), new AwS550S0100000_6(c19719912DlLIZ, 1020), new C452070Ho5(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS550S0100000_6((HasDefaultViewModelProviderFactory) fragment, 1021), AFwS236S0000000_6.get$arr$(401));
        this.LLILLJJLI = fragment.getLifecycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v6 */
    @Override // X.C0I4V
    public final C0I3K<C460810I5f> LIZ(C869590Y9l c869590Y9l) {
        UrlModel urlModel;
        Long l;
        ReferenceInfo referenceInfo = c869590Y9l.getReferenceInfo();
        if (referenceInfo == null) {
            return C0I3M.LIZ;
        }
        Long l2 = referenceInfo.ref_message_type;
        if (l2 != null && ((int) l2.longValue()) == 2000) {
            AssemVMLazy assemVMLazy = this.LL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILLL;
            QuotedMessageInfo.QuotedDynamicCardTemplateInfo quotedDynamicCardTemplateInfo = (QuotedMessageInfo.QuotedDynamicCardTemplateInfo) ((QuotedMessageViewModel) assemVMLazy.getValue()).wQ2(c869590Y9l, QuotedMessageInfo.QuotedDynamicCardTemplateInfo.class);
            Long l3 = 0;
            Long l4 = null;
            if (quotedDynamicCardTemplateInfo == null) {
                C0I4H c0i4h = C0I4H.LIZ;
                final C1233704sB c1233704sB = new C1233704sB(2131831104, (List<String>) null);
                AbstractC1236404sc abstractC1236404sc = new AbstractC1236404sc(c1233704sB) { // from class: X.04sH
                    public final InterfaceC460300I3g LIZIZ;

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof C1234304sH) && Intrinsics.LJFF(this.LIZIZ, ((C1234304sH) obj).LIZIZ);
                    }

                    public final int hashCode() {
                        return this.LIZIZ.hashCode();
                    }

                    public final String toString() {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("DynamicCardText(data=");
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
                long refMsgId = c869590Y9l.getRefMsgId();
                ReferenceInfo referenceInfo2 = c869590Y9l.getReferenceInfo();
                if (referenceInfo2 != null) {
                    l4 = referenceInfo2.ref_message_type;
                }
                return new C0I3O(new C460810I5f(c0i4h, abstractC1236404sc, new C0I3R(refMsgId, l4), 35));
            }
            DynamicCardClientInfoComponent dynamicCardClientInfoComponent = quotedDynamicCardTemplateInfo.clientInfo;
            if (dynamicCardClientInfoComponent == null) {
                return C0I3M.LIZ;
            }
            Integer num = dynamicCardClientInfoComponent.resourceType;
            if (num != null && num.intValue() == 1) {
                if (quotedDynamicCardTemplateInfo.isUnavailable) {
                    C0I4H c0i4h2 = C0I4H.LIZ;
                    final C1233704sB c1233704sB2 = new C1233704sB(2131831104, (List<String>) null);
                    AbstractC1236404sc abstractC1236404sc2 = new AbstractC1236404sc(c1233704sB2) { // from class: X.04sH
                        public final InterfaceC460300I3g LIZIZ;

                        public final boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            return (obj instanceof C1234304sH) && Intrinsics.LJFF(this.LIZIZ, ((C1234304sH) obj).LIZIZ);
                        }

                        public final int hashCode() {
                            return this.LIZIZ.hashCode();
                        }

                        public final String toString() {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("DynamicCardText(data=");
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
                    ReferenceInfo referenceInfo3 = c869590Y9l.getReferenceInfo();
                    if (referenceInfo3 != null) {
                        l3 = referenceInfo3.ref_message_type;
                    }
                    return new C0I3O(new C460810I5f(c0i4h2, abstractC1236404sc2, new C0I3R(refMsgId2, l3), 35));
                }
                String str = dynamicCardClientInfoComponent.resourceCoverUrl;
                if (str == null || (urlModel = C0I98.LJIILIIL(str)) == null) {
                    urlModel = new UrlModel();
                }
                C460360I3m c460360I3m = new C460360I3m(urlModel, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(90)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(120)), false, true);
                C0I5R c0i5r = new C0I5R(dynamicCardClientInfoComponent.resourceId, l3, Boolean.FALSE);
                long refMsgId3 = c869590Y9l.getRefMsgId();
                ReferenceInfo referenceInfo4 = c869590Y9l.getReferenceInfo();
                if (referenceInfo4 != null) {
                    l = referenceInfo4.ref_message_type;
                } else {
                    l = null;
                }
                return new C0I3O(new C460810I5f(null, c460360I3m, new C0I4F(c0i5r, refMsgId3, l), 39));
            }
            return C0I3M.LIZ;
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
