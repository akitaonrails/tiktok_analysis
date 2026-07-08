package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.im.core.proto.ReferenceInfo;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.message.template.component.AvatarDuoInfoComponent;
import com.ss.android.ugc.aweme.im.message.template.component.MixStudioComponent;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListQuotedMessageClickAbility;
import com.ss.android.ugc.aweme.im.sdk.chat.controller.utils.QuotedMessageViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.data.dto.QuotedMessageInfo;
import com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS2S1010000_6;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0I3H, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0I3H implements InterfaceC460500I4a, InterfaceC724530SbT {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILLL;
    public final AssemVMLazy LL;
    public final Lifecycle LLILLJJLI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0I3H.class, "quotedMessageViewModel", "getQuotedMessageViewModel()Lcom/ss/android/ugc/aweme/im/sdk/chat/controller/utils/QuotedMessageViewModel;", 0);
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

    public C0I3H(Fragment fragment) {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(QuotedMessageViewModel.class);
        this.LL = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ), new AwS550S0100000_6(c19719912DlLIZ, 1013), new C452070Ho5(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS550S0100000_6((HasDefaultViewModelProviderFactory) fragment, 1014), AFwS236S0000000_6.get$arr$(397));
        this.LLILLJJLI = fragment.getLifecycle();
    }

    @Override // X.C0I4V
    public final C0I3K<C460810I5f> LIZ(C869590Y9l c869590Y9l) {
        Long l;
        C0YUT c0yut;
        Long l2;
        final boolean z;
        C0I40 c0i40;
        final Long l3;
        final Long l4;
        final Long l5;
        Long l6;
        Long l7;
        ReferenceInfo referenceInfo = c869590Y9l.getReferenceInfo();
        if (referenceInfo != null && (l = referenceInfo.ref_message_type) != null && ((int) l.longValue()) == 1805 && (((c0yut = referenceInfo.referenced_message_status) != C0YUT.DELETED || c0yut != C0YUT.NOT_EXIST) && (l2 = referenceInfo.referenced_message_id) != null)) {
            final long jLongValue = l2.longValue();
            AssemVMLazy assemVMLazy = this.LL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILLL;
            QuotedMessageInfo.QuotedStickerSetTemplateInfo quotedStickerSetTemplateInfo = (QuotedMessageInfo.QuotedStickerSetTemplateInfo) ((QuotedMessageViewModel) assemVMLazy.getValue()).wQ2(c869590Y9l, QuotedMessageInfo.QuotedStickerSetTemplateInfo.class);
            if (quotedStickerSetTemplateInfo == null) {
                C460460I3w mediaUIState = EnumC460370I3n.STICKER.toMediaUIState();
                long refMsgId = c869590Y9l.getRefMsgId();
                ReferenceInfo referenceInfo2 = c869590Y9l.getReferenceInfo();
                if (referenceInfo2 != null) {
                    l7 = referenceInfo2.ref_message_type;
                } else {
                    l7 = null;
                }
                return new C0I3O(new C460810I5f(null, mediaUIState, new C0I3R(refMsgId, l7), 39));
            }
            final UrlModel urlModelLIZ = C0I3J.LIZ(quotedStickerSetTemplateInfo.urlList);
            final String str = quotedStickerSetTemplateInfo.stickerType;
            final int i = quotedStickerSetTemplateInfo.stickerWidth;
            final int i2 = quotedStickerSetTemplateInfo.stickerHeight;
            final boolean z2 = quotedStickerSetTemplateInfo.isFlip;
            if (C300780Bqe.LIZ() > 0 && ((List) C1231504rp.LIZIZ.getValue()).contains(quotedStickerSetTemplateInfo.setId)) {
                z = true;
            } else {
                z = false;
            }
            C0I5K c0i5k = new C0I5K(urlModelLIZ, str, i, i2, z2, z) { // from class: X.0Htd
                public final UrlModel LJIILLIIL;
                public final String LJIIZILJ;
                public final int LJIJ;
                public final int LJIJI;
                public final boolean LJIJJ;
                public final boolean LJIJJLI;

                public final String toString() {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("QuotedSticker(stickerUrlModel=");
                    sbLIZ.append(this.LJIILLIIL);
                    sbLIZ.append(", stickerType=");
                    sbLIZ.append(this.LJIIZILJ);
                    sbLIZ.append(", stickerWidth=");
                    sbLIZ.append(this.LJIJ);
                    sbLIZ.append(", stickerHeight=");
                    sbLIZ.append(this.LJIJI);
                    sbLIZ.append(", isFlip=");
                    sbLIZ.append(this.LJIJJ);
                    sbLIZ.append(", forceNoAnim=");
                    sbLIZ.append(this.LJIJJLI);
                    sbLIZ.append(')');
                    return C2188811AlT.LIZIZ(sbLIZ);
                }

                public final int hashCode() {
                    return this.LJIILLIIL.getUrlList().hashCode();
                }

                @Override // X.C0I5K, X.InterfaceC460950I5t
                public final boolean LJIILIIL() {
                    return this.LJIJJ;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C455510Htd)) {
                        return false;
                    }
                    return Intrinsics.LJFF(this.LJIILLIIL.getUrlList(), ((C455510Htd) obj).LJIILLIIL.getUrlList());
                }

                {
                    int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                    C1233704sB c1233704sB = new C1233704sB(2131831887, (List<String>) null);
                    super(urlModelLIZ, Integer.valueOf(R.drawable.c_l), null, InterfaceC1320380kSq.LIZJ, new AwS2S1010000_6(str, z, 0), false, null, c1233704sB, null, null, null, i2, i, iLIZIZ, null, 50020);
                    this.LJIILLIIL = urlModelLIZ;
                    this.LJIIZILJ = str;
                    this.LJIJ = i;
                    this.LJIJI = i2;
                    this.LJIJJ = z2;
                    this.LJIJJLI = z;
                }
            };
            String str2 = quotedStickerSetTemplateInfo.stickerType;
            if (Intrinsics.LJFF(str2, String.valueOf(EnumC451180Hme.AIMOJI_STICKER_STATIC.getType()))) {
                if (IMStickerApi.LIZ.LIZIZ().getImSocialAvatarService().isEnabled()) {
                    final UrlModel urlModelLIZ2 = C0I3J.LIZ(quotedStickerSetTemplateInfo.urlList);
                    final String str3 = quotedStickerSetTemplateInfo.stickerId;
                    final String str4 = quotedStickerSetTemplateInfo.typingRecommendationStickerId;
                    final Long l8 = quotedStickerSetTemplateInfo.originalStickerId;
                    final String str5 = quotedStickerSetTemplateInfo.ownerUid;
                    final Integer num = quotedStickerSetTemplateInfo.stickerVariant;
                    final String str6 = quotedStickerSetTemplateInfo.expression;
                    final long refMsgId2 = c869590Y9l.getRefMsgId();
                    ReferenceInfo referenceInfo3 = c869590Y9l.getReferenceInfo();
                    if (referenceInfo3 != null) {
                        l6 = referenceInfo3.ref_message_type;
                    } else {
                        l6 = null;
                    }
                    final Long lLJIILIIL = C2095008Iq.LJIILIIL(quotedStickerSetTemplateInfo.setId);
                    final Integer num2 = quotedStickerSetTemplateInfo.creationScene;
                    final MixStudioComponent mixStudioComponent = quotedStickerSetTemplateInfo.mixStudioInfo;
                    final AvatarDuoInfoComponent avatarDuoInfoComponent = quotedStickerSetTemplateInfo.avatarDuoComponent;
                    final Long l9 = l6;
                    c0i40 = new AbstractC455680Htu(urlModelLIZ2, str3, str5, str6, lLJIILIIL, l8, num, str4, num2, mixStudioComponent, avatarDuoInfoComponent, refMsgId2, l9) { // from class: X.0Htb
                        public final UrlModel LIZJ;
                        public final String LIZLLL;
                        public final String LJ;
                        public final String LJFF;
                        public final Long LJI;
                        public final Long LJII;
                        public final Integer LJIIIIZZ;
                        public final String LJIIIZ;
                        public final Integer LJIIJ;
                        public final MixStudioComponent LJIIJJI;
                        public final AvatarDuoInfoComponent LJIIL;
                        public final long LJIILIIL;
                        public final Long LJIILJJIL;

                        public final boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            if (!(obj instanceof C455490Htb)) {
                                return false;
                            }
                            C455490Htb c455490Htb = (C455490Htb) obj;
                            return Intrinsics.LJFF(this.LIZJ, c455490Htb.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c455490Htb.LIZLLL) && Intrinsics.LJFF(this.LJ, c455490Htb.LJ) && Intrinsics.LJFF(this.LJFF, c455490Htb.LJFF) && Intrinsics.LJFF(this.LJI, c455490Htb.LJI) && Intrinsics.LJFF(this.LJII, c455490Htb.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c455490Htb.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c455490Htb.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c455490Htb.LJIIJ) && Intrinsics.LJFF(this.LJIIJJI, c455490Htb.LJIIJJI) && Intrinsics.LJFF(this.LJIIL, c455490Htb.LJIIL) && this.LJIILIIL == c455490Htb.LJIILIIL && Intrinsics.LJFF(this.LJIILJJIL, c455490Htb.LJIILJJIL);
                        }

                        public final int hashCode() {
                            int iHashCode = ((((this.LIZJ.hashCode() * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31;
                            String str7 = this.LJFF;
                            int iHashCode2 = (iHashCode + (str7 == null ? 0 : str7.hashCode())) * 31;
                            Long l10 = this.LJI;
                            int iHashCode3 = (iHashCode2 + (l10 == null ? 0 : l10.hashCode())) * 31;
                            Long l11 = this.LJII;
                            int iHashCode4 = (iHashCode3 + (l11 == null ? 0 : l11.hashCode())) * 31;
                            Integer num3 = this.LJIIIIZZ;
                            int iHashCode5 = (iHashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
                            String str8 = this.LJIIIZ;
                            int iHashCode6 = (iHashCode5 + (str8 == null ? 0 : str8.hashCode())) * 31;
                            Integer num4 = this.LJIIJ;
                            int iHashCode7 = (iHashCode6 + (num4 == null ? 0 : num4.hashCode())) * 31;
                            MixStudioComponent mixStudioComponent2 = this.LJIIJJI;
                            int iHashCode8 = (iHashCode7 + (mixStudioComponent2 == null ? 0 : mixStudioComponent2.hashCode())) * 31;
                            AvatarDuoInfoComponent avatarDuoInfoComponent2 = this.LJIIL;
                            int iHashCode9 = (((iHashCode8 + (avatarDuoInfoComponent2 == null ? 0 : avatarDuoInfoComponent2.hashCode())) * 31) + C786410Ut5.Y2(this.LJIILIIL)) * 31;
                            Long l12 = this.LJIILJJIL;
                            return iHashCode9 + (l12 != null ? l12.hashCode() : 0);
                        }

                        public final String toString() {
                            return "AiMojiClick(urlModel=" + this.LIZJ + ", stickerId=" + this.LIZLLL + ", ownerUid=" + this.LJ + ", expression=" + this.LJFF + ", setId=" + this.LJI + ", originalStickerId=" + this.LJII + ", stickerVariant=" + this.LJIIIIZZ + ", typingRecommendationId=" + this.LJIIIZ + ", creationScene=" + this.LJIIJ + ", mixStudioInfo=" + this.LJIIJJI + ", avatarDuoComponent=" + this.LJIIL + ", refMsgId=" + this.LJIILIIL + ", messageType=" + this.LJIILJJIL + ')';
                        }

                        @Override // X.AbstractC455680Htu
                        public final void LIZ(View view, MessageListQuotedMessageClickAbility messageListQuotedMessageClickAbility) {
                            long jLongValue2;
                            long j = this.LJIILIIL;
                            Long l10 = this.LJIILJJIL;
                            UrlModel urlModel = this.LIZJ;
                            String str7 = this.LIZLLL;
                            Long l11 = this.LJI;
                            Long l12 = this.LJII;
                            String str8 = this.LJIIIZ;
                            Long lLJIILIIL2 = C2095008Iq.LJIILIIL(this.LJ);
                            if (lLJIILIIL2 != null) {
                                jLongValue2 = lLJIILIIL2.longValue();
                            } else {
                                jLongValue2 = -1;
                            }
                            messageListQuotedMessageClickAbility.v10(view, j, l10, new C06NM(urlModel, str7, l11, l12, str8, jLongValue2, this.LJFF, this.LJIIJ, this.LJIIIIZZ, this.LJIIJJI, this.LJIIL));
                        }

                        {
                            super(refMsgId2, l9);
                            this.LIZJ = urlModelLIZ2;
                            this.LIZLLL = str3;
                            this.LJ = str5;
                            this.LJFF = str6;
                            this.LJI = lLJIILIIL;
                            this.LJII = l8;
                            this.LJIIIIZZ = num;
                            this.LJIIIZ = str4;
                            this.LJIIJ = num2;
                            this.LJIIJJI = mixStudioComponent;
                            this.LJIIL = avatarDuoInfoComponent;
                            this.LJIILIIL = refMsgId2;
                            this.LJIILJJIL = l9;
                        }
                    };
                } else {
                    c0i40 = C0I3L.LIZ;
                }
            } else if (!Intrinsics.LJFF(str2, String.valueOf(EnumC451180Hme.VIDEO_STICKER_STATIC.getType())) && !Intrinsics.LJFF(str2, String.valueOf(EnumC451180Hme.VIDEO_STICKER_ANIMATED.getType()))) {
                if (!Intrinsics.LJFF(str2, String.valueOf(EnumC451180Hme.STATIC.getType())) && !Intrinsics.LJFF(str2, String.valueOf(EnumC451180Hme.ANIMATED.getType()))) {
                    final long refMsgId3 = c869590Y9l.getRefMsgId();
                    ReferenceInfo referenceInfo4 = c869590Y9l.getReferenceInfo();
                    if (referenceInfo4 != null) {
                        l5 = referenceInfo4.ref_message_type;
                    } else {
                        l5 = null;
                    }
                    c0i40 = new AbstractC455680Htu(refMsgId3, l5) { // from class: X.0I3N
                        public final long LIZJ;
                        public final Long LIZLLL;

                        public final boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            if (!(obj instanceof C0I3N)) {
                                return false;
                            }
                            C0I3N c0i3n = (C0I3N) obj;
                            return this.LIZJ == c0i3n.LIZJ && Intrinsics.LJFF(this.LIZLLL, c0i3n.LIZLLL);
                        }

                        public final int hashCode() {
                            int iY2 = C786410Ut5.Y2(this.LIZJ) * 31;
                            Long l10 = this.LIZLLL;
                            return iY2 + (l10 == null ? 0 : l10.hashCode());
                        }

                        public final String toString() {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("UnknownStickerTypeClick(refMsgId=");
                            sbLIZ.append(this.LIZJ);
                            sbLIZ.append(", messageType=");
                            sbLIZ.append(this.LIZLLL);
                            sbLIZ.append(')');
                            return C2188811AlT.LIZIZ(sbLIZ);
                        }

                        {
                            super(refMsgId3, l5);
                            this.LIZJ = refMsgId3;
                            this.LIZLLL = l5;
                        }

                        @Override // X.AbstractC455680Htu
                        public final void LIZ(View view, MessageListQuotedMessageClickAbility messageListQuotedMessageClickAbility) {
                            messageListQuotedMessageClickAbility.kn0(view, this.LIZJ, this.LIZLLL);
                        }
                    };
                } else {
                    final String str7 = quotedStickerSetTemplateInfo.setId;
                    final long refMsgId4 = c869590Y9l.getRefMsgId();
                    ReferenceInfo referenceInfo5 = c869590Y9l.getReferenceInfo();
                    if (referenceInfo5 != null) {
                        l4 = referenceInfo5.ref_message_type;
                    } else {
                        l4 = null;
                    }
                    c0i40 = new AbstractC455680Htu(refMsgId4, str7, l4) { // from class: X.0Htm
                        public final String LIZJ;
                        public final long LIZLLL;
                        public final Long LJ;

                        public final boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            if (!(obj instanceof C455600Htm)) {
                                return false;
                            }
                            C455600Htm c455600Htm = (C455600Htm) obj;
                            return Intrinsics.LJFF(this.LIZJ, c455600Htm.LIZJ) && this.LIZLLL == c455600Htm.LIZLLL && Intrinsics.LJFF(this.LJ, c455600Htm.LJ);
                        }

                        public final int hashCode() {
                            int iHashCode = ((this.LIZJ.hashCode() * 31) + C786410Ut5.Y2(this.LIZLLL)) * 31;
                            Long l10 = this.LJ;
                            return iHashCode + (l10 == null ? 0 : l10.hashCode());
                        }

                        public final String toString() {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("StickerSetClick(setId=");
                            sbLIZ.append(this.LIZJ);
                            sbLIZ.append(", refMsgId=");
                            sbLIZ.append(this.LIZLLL);
                            sbLIZ.append(", messageType=");
                            sbLIZ.append(this.LJ);
                            sbLIZ.append(')');
                            return C2188811AlT.LIZIZ(sbLIZ);
                        }

                        @Override // X.AbstractC455680Htu
                        public final void LIZ(View view, MessageListQuotedMessageClickAbility messageListQuotedMessageClickAbility) {
                            messageListQuotedMessageClickAbility.UZ0(view, this.LIZLLL, this.LJ, this.LIZJ);
                        }

                        {
                            super(refMsgId4, l4);
                            this.LIZJ = str7;
                            this.LIZLLL = refMsgId4;
                            this.LJ = l4;
                        }
                    };
                }
            } else {
                ReferenceInfo referenceInfo6 = c869590Y9l.getReferenceInfo();
                if (referenceInfo6 != null) {
                    l3 = referenceInfo6.ref_message_type;
                } else {
                    l3 = null;
                }
                c0i40 = new AbstractC455680Htu(jLongValue, l3) { // from class: X.0Hto
                    public final long LIZJ;
                    public final Long LIZLLL;

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof C455620Hto)) {
                            return false;
                        }
                        C455620Hto c455620Hto = (C455620Hto) obj;
                        return this.LIZJ == c455620Hto.LIZJ && Intrinsics.LJFF(this.LIZLLL, c455620Hto.LIZLLL);
                    }

                    public final int hashCode() {
                        int iY2 = C786410Ut5.Y2(this.LIZJ) * 31;
                        Long l10 = this.LIZLLL;
                        return iY2 + (l10 == null ? 0 : l10.hashCode());
                    }

                    public final String toString() {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("VideoStickerClick(videoStickerMsgId=");
                        sbLIZ.append(this.LIZJ);
                        sbLIZ.append(", messageType=");
                        sbLIZ.append(this.LIZLLL);
                        sbLIZ.append(')');
                        return C2188811AlT.LIZIZ(sbLIZ);
                    }

                    {
                        super(jLongValue, l3);
                        this.LIZJ = jLongValue;
                        this.LIZLLL = l3;
                    }

                    @Override // X.AbstractC455680Htu
                    public final void LIZ(View view, MessageListQuotedMessageClickAbility messageListQuotedMessageClickAbility) {
                        messageListQuotedMessageClickAbility.ED1(view, this.LIZ, this.LIZLLL);
                    }
                };
            }
            return new C0I3O(new C460810I5f(null, c0i5k, c0i40, 39));
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
