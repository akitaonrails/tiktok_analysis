package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.im.core.proto.ReferenceInfo;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.message.template.component.RepostCardStatusComponent;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.repost.RepostFeature;
import com.ss.android.ugc.aweme.im.sdk.chat.controller.utils.QuotedMessageViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.data.dto.QuotedMessageInfo;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS372S0200000_6;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0I4n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C460630I4n implements InterfaceC460500I4a, InterfaceC724530SbT {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILLL;
    public final AssemVMLazy LL;
    public final Lifecycle LLILLJJLI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C460630I4n.class, "quotedMessageViewModel", "getQuotedMessageViewModel()Lcom/ss/android/ugc/aweme/im/sdk/chat/controller/utils/QuotedMessageViewModel;", 0);
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

    public C460630I4n(Fragment fragment) {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(QuotedMessageViewModel.class);
        this.LL = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ), new AwS550S0100000_6(c19719912DlLIZ, 1054), new C452070Ho5(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS550S0100000_6((HasDefaultViewModelProviderFactory) fragment, 1055), AFwS236S0000000_6.get$arr$(406));
        this.LLILLJJLI = fragment.getLifecycle();
    }

    public static boolean LIZIZ(String str) {
        boolean z = false;
        if (str == null || str.length() == 0) {
            return false;
        }
        C06QX c06qx = RepostFeature.LIZ;
        c06qx.getClass();
        RepostFeature value = C06QX.LIZJ.getValue(c06qx, C06QX.LIZIZ[0]);
        if (value != null && !value.LIZ()) {
            z = true;
        }
        return !z;
    }

    @Override // X.C0I4V
    public final C0I3K<C460810I5f> LIZ(C869590Y9l c869590Y9l) {
        Long l;
        RepostCardStatusComponent repostCardStatusComponent;
        int i;
        Long l2;
        final UrlModel urlModel;
        String str;
        Long l3;
        C460810I5f c460810I5f;
        final C1233704sB c1233704sB;
        Long l4;
        ReferenceInfo referenceInfo = c869590Y9l.getReferenceInfo();
        if (referenceInfo != null && (l = referenceInfo.ref_message_type) != null && ((int) l.longValue()) == 1817) {
            AssemVMLazy assemVMLazy = this.LL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILLL;
            QuotedMessageInfo.QuotedRepostTemplateInfo quotedRepostTemplateInfo = (QuotedMessageInfo.QuotedRepostTemplateInfo) ((QuotedMessageViewModel) assemVMLazy.getValue()).wQ2(c869590Y9l, QuotedMessageInfo.QuotedRepostTemplateInfo.class);
            if (quotedRepostTemplateInfo != null) {
                if (quotedRepostTemplateInfo.repostStatus != RepostCardStatusComponent.REPOST_CARD_STATUS_REPOST_SUCCESS) {
                    repostCardStatusComponent = quotedRepostTemplateInfo.repostStatus;
                } else {
                    if (C0I5Z.LIZ(c869590Y9l)) {
                        try {
                            List<String> list = quotedRepostTemplateInfo.repostCover;
                            urlModel = new UrlModel();
                            urlModel.setUrlList(list);
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            urlModel = new UrlModel();
                        }
                        if (!LIZIZ(quotedRepostTemplateInfo.repostText) || (str = quotedRepostTemplateInfo.repostText) == null) {
                            str = "";
                        }
                        final C1233604sA c1233604sA = new C1233604sA(str, new AwS372S0200000_6(this, quotedRepostTemplateInfo, 41));
                        C0I5K c0i5k = new C0I5K(urlModel, c1233604sA) { // from class: X.0Htg
                            public final UrlModel LJIILLIIL;
                            public final InterfaceC460300I3g LJIIZILJ;

                            public final boolean equals(Object obj) {
                                if (this == obj) {
                                    return true;
                                }
                                if (!(obj instanceof C455540Htg)) {
                                    return false;
                                }
                                C455540Htg c455540Htg = (C455540Htg) obj;
                                return Intrinsics.LJFF(this.LJIILLIIL, c455540Htg.LJIILLIIL) && Intrinsics.LJFF(this.LJIIZILJ, c455540Htg.LJIIZILJ);
                            }

                            public final int hashCode() {
                                return (this.LJIILLIIL.hashCode() * 31) + this.LJIIZILJ.hashCode();
                            }

                            public final String toString() {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("RepostTemplateMedia(urlModel=");
                                sbLIZ.append(this.LJIILLIIL);
                                sbLIZ.append(", title=");
                                sbLIZ.append(this.LJIIZILJ);
                                sbLIZ.append(')');
                                return C2188811AlT.LIZIZ(sbLIZ);
                            }

                            @Override // X.C0I5K
                            public final InterfaceC460300I3g LIZJ() {
                                return this.LJIIZILJ;
                            }

                            @Override // X.C0I5K
                            public final UrlModel LIZLLL() {
                                return this.LJIILLIIL;
                            }

                            {
                                super(urlModel, null, null, InterfaceC1320380kSq.LIZ, null, false, null, c1233604sA, null, null, null, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(120)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(90)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), null, 50036);
                                this.LJIILLIIL = urlModel;
                                this.LJIIZILJ = c1233604sA;
                            }
                        };
                        String str2 = quotedRepostTemplateInfo.awemeId;
                        String str3 = quotedRepostTemplateInfo.repostUid;
                        long refMsgId = c869590Y9l.getRefMsgId();
                        ReferenceInfo referenceInfo2 = c869590Y9l.getReferenceInfo();
                        if (referenceInfo2 != null) {
                            l3 = referenceInfo2.ref_message_type;
                        } else {
                            l3 = null;
                        }
                        c460810I5f = new C460810I5f(null, c0i5k, new C0I46(str2, str3, c869590Y9l, refMsgId, l3), 39);
                    } else {
                        if (!LIZIZ(quotedRepostTemplateInfo.repostText)) {
                            c1233704sB = new C1233704sB(2131847846, quotedRepostTemplateInfo.reposterName);
                        } else {
                            c1233704sB = new C1233704sB(2131847847, (List<String>) C1697810uHb.LJIIJJI(quotedRepostTemplateInfo.reposterName, quotedRepostTemplateInfo.repostText));
                        }
                        AbstractC1236404sc abstractC1236404sc = new AbstractC1236404sc(c1233704sB) { // from class: X.04sS
                            public final InterfaceC460300I3g LIZIZ;

                            public final boolean equals(Object obj) {
                                if (this == obj) {
                                    return true;
                                }
                                return (obj instanceof C1235404sS) && Intrinsics.LJFF(this.LIZIZ, ((C1235404sS) obj).LIZIZ);
                            }

                            public final int hashCode() {
                                return this.LIZIZ.hashCode();
                            }

                            public final String toString() {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("RepostTemplateText(data=");
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
                        long refMsgId2 = c869590Y9l.getRefMsgId();
                        ReferenceInfo referenceInfo3 = c869590Y9l.getReferenceInfo();
                        if (referenceInfo3 != null) {
                            l4 = referenceInfo3.ref_message_type;
                        } else {
                            l4 = null;
                        }
                        c460810I5f = new C460810I5f(null, abstractC1236404sc, new C455650Htr(refMsgId2, l4), 39);
                    }
                    return new C0I3O(c460810I5f);
                }
            } else {
                repostCardStatusComponent = null;
            }
            if (repostCardStatusComponent == RepostCardStatusComponent.REPOST_CARD_STATUS_POST_INVISIBLE) {
                i = 2131847845;
            } else {
                i = 2131847844;
            }
            final C1233704sB c1233704sB2 = new C1233704sB(i, (List<String>) null);
            AbstractC1236404sc abstractC1236404sc2 = new AbstractC1236404sc(c1233704sB2) { // from class: X.04sS
                public final InterfaceC460300I3g LIZIZ;

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C1235404sS) && Intrinsics.LJFF(this.LIZIZ, ((C1235404sS) obj).LIZIZ);
                }

                public final int hashCode() {
                    return this.LIZIZ.hashCode();
                }

                public final String toString() {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("RepostTemplateText(data=");
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
            long refMsgId3 = c869590Y9l.getRefMsgId();
            ReferenceInfo referenceInfo4 = c869590Y9l.getReferenceInfo();
            if (referenceInfo4 != null) {
                l2 = referenceInfo4.ref_message_type;
            } else {
                l2 = null;
            }
            return new C0I3O(new C460810I5f(null, abstractC1236404sc2, new C0I3R(refMsgId3, l2), 39));
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
