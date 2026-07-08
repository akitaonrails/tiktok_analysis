package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.im.core.proto.ReferenceInfo;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.common.model.ReferenceInfoHint;
import com.ss.android.ugc.aweme.im.lightinteract.api.platform.service.ILightInteractionPlatformService;
import com.ss.android.ugc.aweme.im.message.content.BaseContent;
import com.ss.android.ugc.aweme.im.message.content.CommentContent;
import com.ss.android.ugc.aweme.im.message.content.ShareAwemeContent;
import com.ss.android.ugc.aweme.im.message.content.ShareLiveContent;
import com.ss.android.ugc.aweme.im.message.content.adapter.BaseContentParserKt;
import com.ss.android.ugc.aweme.im.message.template.card.AwemeCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.BusinessNativeCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.ShareRepostCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.StickerTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.AttachmentComponent;
import com.ss.android.ugc.aweme.im.message.template.component.IconTypeComponent;
import com.ss.android.ugc.aweme.im.message.template.component.MixStudioComponent;
import com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent;
import com.ss.android.ugc.aweme.im.message.template.component.RepostCardStatusComponent;
import com.ss.android.ugc.aweme.im.message.template.component.TextComponent;
import com.ss.android.ugc.aweme.im.messagelist.api.IAwemeStatusViewModel;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListQuotedMessageClickAbility;
import com.ss.android.ugc.aweme.im.sdk.chat.controller.utils.QuotedMessageViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.data.dto.QuotedMessageInfo;
import com.ss.android.ugc.aweme.im.strategy.commonresource.LightInteractionCommonResource;
import com.ss.android.ugc.aweme.im.strategy.commonresource.LightInteractionGiphyMessage;
import com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioUseFriendsIDExpConfig;
import com.ss.android.ugc.aweme.viewmodel.GreetingCardViewModel;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS43S0100100_6;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS585S0100000_6;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0I4Q, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0I4Q implements C0I4X {
    public final Context LIZ;
    public final SessionInfo LIZIZ;
    public final C01GW<IAwemeStatusViewModel> LIZJ;
    public final C01GW LIZLLL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 12));
    public final List<InterfaceC460500I4a> LJ;

    @Override // X.C0I4X
    public final List<InterfaceC460500I4a> LIZ() {
        return this.LJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0119  */
    @Override // X.C0I4X
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C460810I5f LIZIZ(X.C869590Y9l r17) {
        /*
            Method dump skipped, instruction units count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0I4Q.LIZIZ(X.0Y9l):X.0I5f");
    }

    public C0I4Q(final Context context, final Fragment fragment, final SessionInfo sessionInfo, final AssemVMLazy assemVMLazy) {
        this.LIZ = context;
        this.LIZIZ = sessionInfo;
        this.LIZJ = assemVMLazy;
        C13DV c13dvLIZIZ = C1697820uHc.LIZIZ();
        c13dvLIZIZ.add(new InterfaceC460500I4a() { // from class: X.0I5W
            /* JADX WARN: Removed duplicated region for block: B:41:0x00ad  */
            /* JADX WARN: Removed duplicated region for block: B:48:0x00bd  */
            /* JADX WARN: Removed duplicated region for block: B:58:0x00e9  */
            @Override // X.C0I4V
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final X.C0I3K<X.C460810I5f> LIZ(X.C869590Y9l r10) {
                /*
                    Method dump skipped, instruction units count: 236
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C0I5W.LIZ(X.0Y9l):X.0I3K");
            }
        });
        c13dvLIZIZ.add(new InterfaceC460500I4a() { // from class: X.0I5d
            public static String LIZIZ(C869590Y9l c869590Y9l) {
                if (c869590Y9l == null) {
                    return null;
                }
                ShareAwemeContent.Companion companion = ShareAwemeContent.Companion;
                if (companion.isEncourageMufRepostMsg(c869590Y9l)) {
                    if (C0W8I.LIZLLL(Long.valueOf(c869590Y9l.getSender()))) {
                        return C1383370m6R.LJIIJ(2131833928);
                    }
                    return C1383370m6R.LJIIJ(2131833927);
                }
                if (!companion.isEncourageMufFavouriteMsg(c869590Y9l)) {
                    return null;
                }
                if (C0W8I.LIZLLL(Long.valueOf(c869590Y9l.getSender()))) {
                    return C1383370m6R.LJIIJ(2131833926);
                }
                return C1383370m6R.LJIIJ(2131833925);
            }

            public static C0I3O LIZJ(InterfaceC460300I3g interfaceC460300I3g) {
                return new C0I3O(new C460810I5f(new C0I3V(interfaceC460300I3g), C460530I4d.LIZ, null, 51));
            }

            @Override // X.C0I4V
            public final C0I3K<C460810I5f> LIZ(C869590Y9l c869590Y9l) {
                AwemeCardTemplate awemeCardTemplate;
                String str;
                C1233704sB c1233704sB;
                InterfaceC460300I3g c1233704sB2;
                if (c869590Y9l.getMsgType() != 1809) {
                    return C0I3M.LIZ;
                }
                BaseTemplate baseTemplateLIZ = C0Z2Z.LIZ(c869590Y9l, BaseTemplate.class);
                if ((baseTemplateLIZ instanceof AwemeCardTemplate) && (awemeCardTemplate = (AwemeCardTemplate) baseTemplateLIZ) != null) {
                    if (awemeCardTemplate.fallbackInfo.image.iconType == IconTypeComponent.DEFAULT && (C0ZDX.LJIL(c869590Y9l) || ShareAwemeContent.Companion.isEncourageMufInteractionMsg(c869590Y9l))) {
                        if (C0ZDX.LJJJJIZL(c869590Y9l)) {
                            String strLIZIZ = LIZIZ(c869590Y9l);
                            if (strLIZIZ != null) {
                                c1233704sB2 = new C1258904wF(strLIZIZ);
                            } else {
                                c1233704sB2 = new C1233704sB(2131830945, (List<String>) null);
                            }
                        } else {
                            String strLIZIZ2 = LIZIZ(c869590Y9l);
                            if (strLIZIZ2 != null) {
                                c1233704sB2 = new C1258904wF(strLIZIZ2);
                            } else {
                                c1233704sB2 = new C1233704sB(2131830946, (List<String>) null);
                            }
                        }
                        return LIZJ(c1233704sB2);
                    }
                    ShareAwemeContent.Companion companion = ShareAwemeContent.Companion;
                    if (companion.isEncourageMufInteractionMsg(c869590Y9l)) {
                        return C0I3M.LIZ;
                    }
                    TextComponent textComponent = awemeCardTemplate.topInlineTextComponent;
                    if (textComponent != null) {
                        str = textComponent.text;
                    } else {
                        str = null;
                    }
                    if (C123100dR.LIZ(str) && str != null) {
                        return LIZJ(new C1258904wF(str));
                    }
                    if (C0ZDX.LJJJJIZL(c869590Y9l)) {
                        if (companion.isVideoTag(c869590Y9l)) {
                            c1233704sB = new C1233704sB(2131831611, (List<String>) null);
                        } else if (companion.isVideoMention(c869590Y9l)) {
                            c1233704sB = new C1233704sB(2131831609, (List<String>) null);
                        } else if (companion.isVideoMentionAndTag(c869590Y9l)) {
                            c1233704sB = new C1233704sB(2131831610, (List<String>) null);
                        } else {
                            if (companion.isStoryToStoryBackwardsMention(c869590Y9l) || companion.isPostToStoryBackwardsMention(c869590Y9l)) {
                                c1233704sB = new C1233704sB(2131832075, (List<String>) null);
                            }
                            return C0I3M.LIZ;
                        }
                        return LIZJ(c1233704sB);
                    }
                    if (companion.isVideoTag(c869590Y9l)) {
                        c1233704sB = new C1233704sB(2131831614, (List<String>) null);
                    } else if (companion.isVideoMention(c869590Y9l)) {
                        c1233704sB = new C1233704sB(2131831612, (List<String>) null);
                    } else if (companion.isVideoMentionAndTag(c869590Y9l)) {
                        c1233704sB = new C1233704sB(2131831613, (List<String>) null);
                    } else {
                        if (companion.isStoryToStoryBackwardsMention(c869590Y9l) || companion.isPostToStoryBackwardsMention(c869590Y9l)) {
                            c1233704sB = new C1233704sB(2131831612, (List<String>) null);
                        }
                        return C0I3M.LIZ;
                    }
                    return LIZJ(c1233704sB);
                }
                return C0I3M.LIZ;
            }
        });
        c13dvLIZIZ.add(new InterfaceC460500I4a() { // from class: X.0I4p
            /* JADX WARN: Removed duplicated region for block: B:24:0x003d  */
            @Override // X.C0I4V
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final X.C0I3K<X.C460810I5f> LIZ(X.C869590Y9l r7) {
                /*
                    r6 = this;
                    int r1 = r7.getMsgType()
                    r0 = 7
                    if (r1 == r0) goto L11
                    int r1 = r7.getMsgType()
                    r0 = 5
                    if (r1 == r0) goto L11
                    X.0I3M r0 = X.C0I3M.LIZ
                    return r0
                L11:
                    java.lang.Class<com.ss.android.ugc.aweme.im.message.content.BaseContent> r0 = com.ss.android.ugc.aweme.im.message.content.BaseContent.class
                    com.ss.android.ugc.aweme.im.message.content.BaseContent r1 = com.ss.android.ugc.aweme.im.message.content.adapter.BaseContentParserKt.getOrParseJsonContent(r7, r0)
                    if (r1 != 0) goto L1c
                    X.0I3M r0 = X.C0I3M.LIZ
                    return r0
                L1c:
                    com.ss.android.ugc.aweme.im.message.content.BaseContent$ReferenceVideo r0 = r1.getRefVideo()
                    if (r0 != 0) goto L6c
                    com.bytedance.im.core.proto.ReferenceInfo r0 = r7.getReferenceInfo()
                    if (r0 != 0) goto L6c
                    boolean r0 = r1 instanceof com.ss.android.ugc.aweme.im.message.content.TextContent
                    r5 = 0
                    if (r0 == 0) goto L56
                    com.ss.android.ugc.aweme.im.message.content.TextContent r1 = (com.ss.android.ugc.aweme.im.message.content.TextContent) r1
                    com.ss.android.ugc.aweme.im.message.content.BaseHeader r0 = r1.getHeader()
                    if (r0 == 0) goto L69
                    com.ss.android.ugc.aweme.im.message.content.BaseText r0 = r0.text
                    if (r0 == 0) goto L69
                    java.lang.String r1 = r0.text
                L3b:
                    if (r1 == 0) goto L69
                    X.0I3O r4 = new X.0I3O
                    X.0I5f r3 = new X.0I5f
                    X.0I3V r2 = new X.0I3V
                    X.04wF r0 = new X.04wF
                    r0.<init>(r1)
                    r2.<init>(r0)
                    X.0I4d r1 = X.C460530I4d.LIZ
                    r0 = 51
                    r3.<init>(r2, r1, r5, r0)
                    r4.<init>(r3)
                    return r4
                L56:
                    boolean r0 = r1 instanceof com.ss.android.ugc.aweme.im.message.content.GifContent
                    if (r0 == 0) goto L69
                    com.ss.android.ugc.aweme.im.message.content.GifContent r1 = (com.ss.android.ugc.aweme.im.message.content.GifContent) r1
                    com.ss.android.ugc.aweme.im.message.content.BaseHeader r0 = r1.getHeader()
                    if (r0 == 0) goto L69
                    com.ss.android.ugc.aweme.im.message.content.BaseText r0 = r0.text
                    if (r0 == 0) goto L69
                    java.lang.String r1 = r0.text
                    goto L3b
                L69:
                    X.0I3M r0 = X.C0I3M.LIZ
                    return r0
                L6c:
                    X.0I3M r0 = X.C0I3M.LIZ
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C460650I4p.LIZ(X.0Y9l):X.0I3K");
            }
        });
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        MixStudioUseFriendsIDExpConfig mixStudioUseFriendsIDExpConfig = C0HSE.LIZ;
        MixStudioUseFriendsIDExpConfig mixStudioUseFriendsIDExpConfig2 = (MixStudioUseFriendsIDExpConfig) c0c64LJIILLIIL.LJJII(MixStudioUseFriendsIDExpConfig.class, mixStudioUseFriendsIDExpConfig, "mix_studio_use_friends_id", true);
        if ((mixStudioUseFriendsIDExpConfig2 != null ? mixStudioUseFriendsIDExpConfig2 : mixStudioUseFriendsIDExpConfig).enabled != 0) {
            c13dvLIZIZ.add(new InterfaceC460500I4a() { // from class: X.0I3I
                @Override // X.C0I4V
                public final C0I3K<C460810I5f> LIZ(C869590Y9l c869590Y9l) {
                    StickerTemplate stickerTemplate;
                    Long l;
                    String str;
                    String str2;
                    if (c869590Y9l.getMsgType() != 1805) {
                        return C0I3M.LIZ;
                    }
                    BaseTemplate baseTemplateLIZ = C0Z2Z.LIZ(c869590Y9l, BaseTemplate.class);
                    if ((baseTemplateLIZ instanceof StickerTemplate) && (stickerTemplate = (StickerTemplate) baseTemplateLIZ) != null) {
                        MixStudioComponent mixStudioComponent = stickerTemplate.mixStudioInfoComponent;
                        if (mixStudioComponent != null && (l = mixStudioComponent.remixerUid) != null) {
                            long jLongValue = l.longValue();
                            MixStudioComponent mixStudioComponent2 = stickerTemplate.mixStudioInfoComponent;
                            if (mixStudioComponent2 != null && (str = mixStudioComponent2.remixerNickname) != null) {
                                Long l2 = mixStudioComponent2.remixeeUid;
                                if (l2 != null) {
                                    long jLongValue2 = l2.longValue();
                                    MixStudioComponent mixStudioComponent3 = stickerTemplate.mixStudioInfoComponent;
                                    if (mixStudioComponent3 != null && (str2 = mixStudioComponent3.remixeeNickname) != null) {
                                        C454770HsR c454770HsR = new C454770HsR(jLongValue, str, jLongValue2, str2);
                                        return new C0I3O(new C460810I5f(new C0I3V(new C1233604sA(c454770HsR.toString(), new AwS43S0100100_6(c454770HsR, C461720I8s.LIZJ(), 1))), null, null, 59));
                                    }
                                    return C0I3M.LIZ;
                                }
                                return C0I3M.LIZ;
                            }
                            return C0I3M.LIZ;
                        }
                        return C0I3M.LIZ;
                    }
                    return C0I3M.LIZ;
                }
            });
        }
        c13dvLIZIZ.add(new InterfaceC460500I4a() { // from class: X.0I4i
            @Override // X.C0I4V
            public final C0I3K<C460810I5f> LIZ(C869590Y9l c869590Y9l) {
                if (c869590Y9l.getMsgType() != 1809) {
                    return C0I3M.LIZ;
                }
                String scene = c869590Y9l.getScene();
                if (!Intrinsics.LJFF(scene, "share_highlight_story") && !Intrinsics.LJFF(scene, "share_highlight_story_collection")) {
                    return C0I3M.LIZ;
                }
                return new C0I3O(new C460810I5f(null, C460530I4d.LIZ, null, 55));
            }
        });
        c13dvLIZIZ.add(new InterfaceC460500I4a() { // from class: X.0I4t
            @Override // X.C0I4V
            public final C0I3K<C460810I5f> LIZ(C869590Y9l c869590Y9l) {
                String refVideoId;
                BaseContent.ReferenceVideo refVideo;
                ReferenceInfo referenceInfo = c869590Y9l.getReferenceInfo();
                if (referenceInfo != null && referenceInfo.referenced_message_id != null) {
                    return C0I3M.LIZ;
                }
                BaseTemplate baseTemplateLIZ = C0Z2Z.LIZ(c869590Y9l, BaseTemplate.class);
                if (baseTemplateLIZ != null) {
                    AttachmentComponent attachmentComponentHs = baseTemplateLIZ.Hs();
                    if (attachmentComponentHs != null && C123100dR.LIZ(attachmentComponentHs.id)) {
                        return C0I3M.LIZ;
                    }
                    if (baseTemplateLIZ != null && baseTemplateLIZ.og() != null && C2242351Cpd.LIZ(baseTemplateLIZ.og())) {
                        return C0I3M.LIZ;
                    }
                }
                BaseContent orParseJsonContent = BaseContentParserKt.getOrParseJsonContent(c869590Y9l, BaseContent.class);
                if (orParseJsonContent != null && (refVideo = orParseJsonContent.getRefVideo()) != null) {
                    refVideoId = refVideo.getRefVideoId();
                } else {
                    refVideoId = null;
                }
                if (C123100dR.LIZ(refVideoId)) {
                    return C0I3M.LIZ;
                }
                if (C0ZDX.LJJJJI(c869590Y9l)) {
                    return C0I3M.LIZ;
                }
                return new C0I3O(new C460810I5f(null, C460520I4c.LIZ, null, 55));
            }
        });
        c13dvLIZIZ.add(new InterfaceC460500I4a() { // from class: X.0I3S
            @Override // X.C0I4V
            public final C0I3K<C460810I5f> LIZ(C869590Y9l c869590Y9l) {
                C0YUT c0yut;
                Long l;
                Long l2;
                Long l3;
                ReferenceInfo referenceInfo = c869590Y9l.getReferenceInfo();
                if (referenceInfo != null && (c0yut = referenceInfo.referenced_message_status) != null) {
                    int i = C0I3T.LIZ[c0yut.ordinal()];
                    if (i != 1) {
                        if (i != 2 && i != 3) {
                            if (i == 4) {
                                AbstractC1236404sc abstractC1236404sc = new AbstractC1236404sc(new C1233704sB(2131831101, (List<String>) null)) { // from class: X.04sO
                                    public final InterfaceC460300I3g LIZIZ;

                                    public final boolean equals(Object obj) {
                                        if (this == obj) {
                                            return true;
                                        }
                                        return (obj instanceof C1235004sO) && Intrinsics.LJFF(this.LIZIZ, ((C1235004sO) obj).LIZIZ);
                                    }

                                    public final int hashCode() {
                                        return this.LIZIZ.hashCode();
                                    }

                                    public final String toString() {
                                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                                        sbLIZ.append("MsgStatusQCText(data=");
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
                                    l3 = referenceInfo2.ref_message_type;
                                } else {
                                    l3 = null;
                                }
                                return new C0I3O(new C460810I5f(null, abstractC1236404sc, new C0I3R(refMsgId, l3), 39));
                            }
                        } else {
                            AbstractC1236404sc abstractC1236404sc2 = new AbstractC1236404sc(new C1233704sB(2131835779, (List<String>) null)) { // from class: X.04sO
                                public final InterfaceC460300I3g LIZIZ;

                                public final boolean equals(Object obj) {
                                    if (this == obj) {
                                        return true;
                                    }
                                    return (obj instanceof C1235004sO) && Intrinsics.LJFF(this.LIZIZ, ((C1235004sO) obj).LIZIZ);
                                }

                                public final int hashCode() {
                                    return this.LIZIZ.hashCode();
                                }

                                public final String toString() {
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("MsgStatusQCText(data=");
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
                                l2 = referenceInfo3.ref_message_type;
                            } else {
                                l2 = null;
                            }
                            return new C0I3O(new C460810I5f(null, abstractC1236404sc2, new C0I3R(refMsgId2, l2), 39));
                        }
                    } else {
                        AbstractC1236404sc abstractC1236404sc3 = new AbstractC1236404sc(new C1233704sB(2131831114, (List<String>) null)) { // from class: X.04sO
                            public final InterfaceC460300I3g LIZIZ;

                            public final boolean equals(Object obj) {
                                if (this == obj) {
                                    return true;
                                }
                                return (obj instanceof C1235004sO) && Intrinsics.LJFF(this.LIZIZ, ((C1235004sO) obj).LIZIZ);
                            }

                            public final int hashCode() {
                                return this.LIZIZ.hashCode();
                            }

                            public final String toString() {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("MsgStatusQCText(data=");
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
                        long refMsgId3 = c869590Y9l.getRefMsgId();
                        ReferenceInfo referenceInfo4 = c869590Y9l.getReferenceInfo();
                        if (referenceInfo4 != null) {
                            l = referenceInfo4.ref_message_type;
                        } else {
                            l = null;
                        }
                        return new C0I3O(new C460810I5f(null, abstractC1236404sc3, new C0I3R(refMsgId3, l), 39));
                    }
                }
                return C0I3M.LIZ;
            }
        });
        c13dvLIZIZ.add(new C0I5Q(assemVMLazy));
        final boolean zIsHighRiskConversation = sessionInfo.isHighRiskConversation();
        c13dvLIZIZ.add(new InterfaceC460500I4a(zIsHighRiskConversation) { // from class: X.0I5C
            public final boolean LL;

            {
                this.LL = zIsHighRiskConversation;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:40:0x0098  */
            /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.String] */
            /* JADX WARN: Type inference failed for: r10v12 */
            @Override // X.C0I4V
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final X.C0I3K<X.C460810I5f> LIZ(X.C869590Y9l r15) {
                /*
                    Method dump skipped, instruction units count: 522
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C0I5C.LIZ(X.0Y9l):X.0I3K");
            }
        });
        if (((Number) C270240AiU.LIZ.getValue()).intValue() == 1) {
            c13dvLIZIZ.add(new C0I5P(context, assemVMLazy, sessionInfo.isHighRiskConversation()));
            final boolean zIsHighRiskConversation2 = sessionInfo.isHighRiskConversation();
            c13dvLIZIZ.add(new InterfaceC460500I4a(context, assemVMLazy, zIsHighRiskConversation2) { // from class: X.0I5M
                public final Context LL;
                public final boolean LLILLJJLI;
                public final C01GW<IAwemeStatusViewModel> LLILLL;
                public final Function0<Integer> LLILZ;

                @Override // X.C0I4V
                public final C0I3K<C460810I5f> LIZ(C869590Y9l c869590Y9l) {
                    boolean z;
                    String string;
                    C0I40 c0i4a;
                    C0I40 c0i4a2;
                    BaseContent.ReferenceVideo referenceVideoLIZ = C0I5Y.LIZ(c869590Y9l);
                    if (referenceVideoLIZ == null) {
                        return C0I3M.LIZ;
                    }
                    String refVideoId = referenceVideoLIZ.getRefVideoId();
                    if (refVideoId == null) {
                        return C0I3M.LIZ;
                    }
                    IAwemeStatusViewModel value = this.LLILLL.getValue();
                    Long lValueOf = Long.valueOf(c869590Y9l.getMsgId());
                    Long lValueOf2 = Long.valueOf(referenceVideoLIZ.getOriginAuthorId());
                    if (lValueOf2.longValue() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        string = lValueOf2.toString();
                    } else {
                        string = null;
                    }
                    value.xQ2(lValueOf, refVideoId, string);
                    C0I5R c0i5r = new C0I5R(refVideoId, String.valueOf(c869590Y9l.getSender()), Boolean.valueOf(referenceVideoLIZ.getRefVideoIsStory()));
                    UrlModel refVideoCoverUrl = referenceVideoLIZ.getRefVideoCoverUrl();
                    if (refVideoCoverUrl == null) {
                        C0I4Y<InterfaceC460300I3g> c0i4yLIZJ = C460710I4v.LIZJ(referenceVideoLIZ.getRefVideoIsStory(), C460710I4v.LIZ(c869590Y9l), c869590Y9l, this.LL);
                        C460460I3w mediaUIState = EnumC460370I3n.VIDEO.toMediaUIState();
                        if (C0I5Y.LIZIZ(c869590Y9l)) {
                            c0i4a2 = new C0I41(refVideoId, c869590Y9l.getRefMsgId(), C0ZDX.LJ(c869590Y9l));
                        } else {
                            c0i4a2 = new C0I4A(c0i5r, referenceVideoLIZ.getRefVideoAwemeType(), c869590Y9l.getRefMsgId());
                        }
                        return new C0I3O(new C460810I5f(c0i4yLIZJ, mediaUIState, c0i4a2, 35));
                    }
                    int i = C0IAZ.LIZ[referenceVideoLIZ.getFallbackStatusComponent().ordinal()];
                    if (i != 1 && i != 2) {
                        if (i != 3) {
                            if (i == 4) {
                                if (referenceVideoLIZ.getExpireAt() > 0 && referenceVideoLIZ.getExpireAt() <= this.LLILZ.invoke().intValue()) {
                                    return new C0I3O(LIZIZ(c869590Y9l, referenceVideoLIZ));
                                }
                                C0I4Y<InterfaceC460300I3g> c0i4yLIZJ2 = C460710I4v.LIZJ(referenceVideoLIZ.getRefVideoIsStory(), C460710I4v.LIZ(c869590Y9l), c869590Y9l, this.LL);
                                C460380I3o c460380I3o = new C460380I3o(refVideoCoverUrl, this.LLILLJJLI, new C1233704sB(2131831883, (List<String>) null)) { // from class: X.0I3r
                                    public final UrlModel LJIJ;
                                    public final boolean LJIJI;
                                    public final InterfaceC460300I3g LJIJJ;

                                    public final boolean equals(Object obj) {
                                        if (this == obj) {
                                            return true;
                                        }
                                        if (!(obj instanceof C460410I3r)) {
                                            return false;
                                        }
                                        C460410I3r c460410I3r = (C460410I3r) obj;
                                        return Intrinsics.LJFF(this.LJIJ, c460410I3r.LJIJ) && this.LJIJI == c460410I3r.LJIJI && Intrinsics.LJFF(this.LJIJJ, c460410I3r.LJIJJ);
                                    }

                                    public final int hashCode() {
                                        return (((this.LJIJ.hashCode() * 31) + C786410Ut5.Z2(this.LJIJI)) * 31) + this.LJIJJ.hashCode();
                                    }

                                    public final String toString() {
                                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                                        sbLIZ.append("RefVideoWithServerRepackThumbnail(url=");
                                        sbLIZ.append(this.LJIJ);
                                        sbLIZ.append(", isBlur=");
                                        sbLIZ.append(this.LJIJI);
                                        sbLIZ.append(", title=");
                                        sbLIZ.append(this.LJIJJ);
                                        sbLIZ.append(')');
                                        return C2188811AlT.LIZIZ(sbLIZ);
                                    }

                                    @Override // X.C0I5K
                                    public final InterfaceC460300I3g LIZJ() {
                                        return this.LJIJJ;
                                    }

                                    @Override // X.C0I5K
                                    public final boolean LJ() {
                                        return this.LJIJI;
                                    }

                                    {
                                        super(refVideoCoverUrl, z, c1233704sB, null, 8);
                                        this.LJIJ = refVideoCoverUrl;
                                        this.LJIJI = z;
                                        this.LJIJJ = c1233704sB;
                                    }
                                };
                                if (C0I5Y.LIZIZ(c869590Y9l)) {
                                    c0i4a = new C0I41(refVideoId, c869590Y9l.getRefMsgId(), C0ZDX.LJ(c869590Y9l));
                                } else {
                                    c0i4a = new C0I4A(new C0I5R(refVideoId, String.valueOf(c869590Y9l.getSender()), Boolean.valueOf(referenceVideoLIZ.getRefVideoIsStory())), referenceVideoLIZ.getRefVideoAwemeType(), c869590Y9l.getRefMsgId());
                                }
                                return new C0I3O(new C460810I5f(c0i4yLIZJ2, c460380I3o, c0i4a, 35));
                            }
                            throw new C1954807lC();
                        }
                        return new C0I3O(LIZIZ(c869590Y9l, referenceVideoLIZ));
                    }
                    return new C0I3O(LIZIZ(c869590Y9l, referenceVideoLIZ));
                }

                public final C460810I5f LIZIZ(C869590Y9l c869590Y9l, BaseContent.ReferenceVideo referenceVideo) {
                    int i;
                    if (referenceVideo.getRefVideoIsStory()) {
                        i = 2131831103;
                    } else {
                        i = 2131831104;
                    }
                    return new C460810I5f(C460710I4v.LIZJ(referenceVideo.getRefVideoIsStory(), C460710I4v.LIZ(c869590Y9l), c869590Y9l, this.LL), new AbstractC1236404sc(new C1233704sB(i, (List<String>) null)) { // from class: X.04sG
                        public final InterfaceC460300I3g LIZIZ;

                        public final boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            return (obj instanceof C1234204sG) && Intrinsics.LJFF(this.LIZIZ, ((C1234204sG) obj).LIZIZ);
                        }

                        public final int hashCode() {
                            return this.LIZIZ.hashCode();
                        }

                        public final String toString() {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("RefVideoWithServerRepackText(data=");
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
                    }, new C0I3R(c869590Y9l.getRefMsgId(), Long.valueOf(1809)), 35);
                }

                {
                    AFwS187S0000000_2 aFwS187S0000000_2 = AFwS187S0000000_2.get$arr$(800);
                    this.LL = context;
                    this.LLILLJJLI = zIsHighRiskConversation2;
                    this.LLILLL = assemVMLazy;
                    this.LLILZ = aFwS187S0000000_2;
                }
            });
        } else {
            c13dvLIZIZ.add(new InterfaceC460500I4a() { // from class: X.0I4x
                @Override // X.C0I4V
                public final C0I3K<C460810I5f> LIZ(C869590Y9l c869590Y9l) {
                    ShareRepostCardTemplate shareRepostCardTemplate;
                    AttachmentComponent attachmentComponentHs;
                    if (c869590Y9l.getMsgType() != 1817) {
                        return C0I3M.LIZ;
                    }
                    BaseTemplate baseTemplateLIZ = C0Z2Z.LIZ(c869590Y9l, ShareRepostCardTemplate.class);
                    if ((baseTemplateLIZ instanceof ShareRepostCardTemplate) && (shareRepostCardTemplate = (ShareRepostCardTemplate) baseTemplateLIZ) != null) {
                        if (shareRepostCardTemplate.shareRepost.status == RepostCardStatusComponent.REPOST_CARD_STATUS_REPOST_SUCCESS) {
                            return C0I3M.LIZ;
                        }
                        BaseTemplate baseTemplateLIZ2 = C0Z2Z.LIZ(c869590Y9l, BaseTemplate.class);
                        if (baseTemplateLIZ2 != null && (attachmentComponentHs = baseTemplateLIZ2.Hs()) != null && attachmentComponentHs.id.length() != 0) {
                            return new C0I3O(new C460810I5f(null, null, null, 63));
                        }
                        return C0I3M.LIZ;
                    }
                    return C0I3M.LIZ;
                }
            });
            c13dvLIZIZ.add(new C0I5O(context, assemVMLazy, sessionInfo.isHighRiskConversation()));
            c13dvLIZIZ.add(new C0I5N(context, assemVMLazy, sessionInfo.isHighRiskConversation()));
        }
        sessionInfo.isHighRiskConversation();
        c13dvLIZIZ.add(new InterfaceC460500I4a(fragment) { // from class: X.0I43
            public final LifecycleOwner LL;

            {
                this.LL = fragment;
            }

            @Override // X.C0I4V
            public final C0I3K<C460810I5f> LIZ(C869590Y9l c869590Y9l) {
                Long l;
                BaseContent baseContentLJIIJ = C0ZDX.LJIIJ(c869590Y9l);
                if ((baseContentLJIIJ instanceof ShareAwemeContent) && baseContentLJIIJ != null) {
                    AbstractC1236404sc abstractC1236404sc = new AbstractC1236404sc(new C1233704sB(2131831104, (List<String>) null)) { // from class: X.04sK
                        public final InterfaceC460300I3g LIZIZ;

                        public final boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            return (obj instanceof C1234604sK) && Intrinsics.LJFF(this.LIZIZ, ((C1234604sK) obj).LIZIZ);
                        }

                        public final int hashCode() {
                            return this.LIZIZ.hashCode();
                        }

                        public final String toString() {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("QuoteContentFromShareAwemeText(data=");
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
                    ReferenceInfo referenceInfo = c869590Y9l.getReferenceInfo();
                    if (referenceInfo != null) {
                        l = referenceInfo.ref_message_type;
                    } else {
                        l = null;
                    }
                    return new C0I3O(new C460810I5f(null, abstractC1236404sc, new C0I3R(refMsgId, l), 39));
                }
                return C0I3M.LIZ;
            }
        });
        c13dvLIZIZ.add(new InterfaceC460500I4a(context, fragment) { // from class: X.0I42
            public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILLL;
            public final Context LL;
            public final AssemVMLazy LLILLJJLI;

            static {
                C2217381BqS c2217381BqS = new C2217381BqS(C0I42.class, "quotedMessageViewModel", "getQuotedMessageViewModel()Lcom/ss/android/ugc/aweme/im/sdk/chat/controller/utils/QuotedMessageViewModel;", 0);
                C13LE.LIZ.getClass();
                LLILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
            }

            @Override // X.C0I4V
            public final C0I3K<C460810I5f> LIZ(C869590Y9l c869590Y9l) {
                Long l;
                Long l2;
                Long l3;
                BaseContent baseContentLJIIJ = C0ZDX.LJIIJ(c869590Y9l);
                if (!(baseContentLJIIJ instanceof CommentContent)) {
                    return C0I3M.LIZ;
                }
                AssemVMLazy assemVMLazy2 = this.LLILLJJLI;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILLL;
                boolean z = false;
                QuotedMessageInfo.QuotedCommentTemplateInfo quotedCommentTemplateInfo = (QuotedMessageInfo.QuotedCommentTemplateInfo) ((QuotedMessageViewModel) assemVMLazy2.getValue()).wQ2(c869590Y9l, QuotedMessageInfo.QuotedCommentTemplateInfo.class);
                if (quotedCommentTemplateInfo != null && quotedCommentTemplateInfo.isCommentAvailable) {
                    z = true;
                }
                if (!z) {
                    AbstractC1236404sc abstractC1236404sc = new AbstractC1236404sc(new C1258904wF(this.LL.getString(2131831091))) { // from class: X.04sV
                        public final InterfaceC460300I3g LIZIZ;

                        public final boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            return (obj instanceof C1235704sV) && Intrinsics.LJFF(this.LIZIZ, ((C1235704sV) obj).LIZIZ);
                        }

                        public final int hashCode() {
                            return this.LIZIZ.hashCode();
                        }

                        public final String toString() {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("QuoteContentFromCommentContentText(data=");
                            sbLIZ.append(this.LIZIZ);
                            sbLIZ.append(')');
                            return C2188811AlT.LIZIZ(sbLIZ);
                        }

                        @Override // X.AbstractC1236404sc
                        public final InterfaceC460300I3g LIZ() {
                            return this.LIZIZ;
                        }

                        {
                            super(interfaceC460300I3g);
                            this.LIZIZ = interfaceC460300I3g;
                        }
                    };
                    long refMsgId = c869590Y9l.getRefMsgId();
                    ReferenceInfo referenceInfo = c869590Y9l.getReferenceInfo();
                    if (referenceInfo != null) {
                        l3 = referenceInfo.ref_message_type;
                    } else {
                        l3 = null;
                    }
                    return new C0I3O(new C460810I5f(null, abstractC1236404sc, new C0I3R(refMsgId, l3), 39));
                }
                if (C0I5Z.LIZ(c869590Y9l)) {
                    CommentContent commentContent = (CommentContent) baseContentLJIIJ;
                    UrlModel coverUrl = commentContent.getCoverUrl();
                    if (coverUrl == null) {
                        coverUrl = new UrlModel();
                    }
                    String comment = commentContent.getComment();
                    if (comment == null) {
                        comment = "";
                    }
                    C0I5K c0i5k = new C0I5K(coverUrl, new C1233604sA(comment, new AwS585S0100000_6(baseContentLJIIJ, 241))) { // from class: X.0Hte
                        public final UrlModel LJIILLIIL;
                        public final InterfaceC460300I3g LJIIZILJ;

                        public final boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            if (!(obj instanceof C455520Hte)) {
                                return false;
                            }
                            C455520Hte c455520Hte = (C455520Hte) obj;
                            return Intrinsics.LJFF(this.LJIILLIIL, c455520Hte.LJIILLIIL) && Intrinsics.LJFF(this.LJIIZILJ, c455520Hte.LJIIZILJ);
                        }

                        public final int hashCode() {
                            return (this.LJIILLIIL.hashCode() * 31) + this.LJIIZILJ.hashCode();
                        }

                        public final String toString() {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("QuoteComment(urlModel=");
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
                            super(coverUrl, null, null, InterfaceC1320380kSq.LIZ, null, false, null, c1233604sA, null, null, null, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(42)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)), 0, null, 50036);
                            this.LJIILLIIL = coverUrl;
                            this.LJIIZILJ = c1233604sA;
                        }
                    };
                    ReferenceInfo referenceInfo2 = c869590Y9l.getReferenceInfo();
                    if (referenceInfo2 != null) {
                        l2 = referenceInfo2.ref_message_type;
                    } else {
                        l2 = null;
                    }
                    return new C0I3O(new C460810I5f(null, c0i5k, new C0I45(c869590Y9l, commentContent, l2), 39));
                }
                CommentContent commentContent2 = (CommentContent) baseContentLJIIJ;
                String authorName = commentContent2.getAuthorName();
                String comment2 = commentContent2.getComment();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(authorName);
                sbLIZ.append(comment2);
                AbstractC1236404sc abstractC1236404sc2 = new AbstractC1236404sc(new C460250I3b(C2188811AlT.LIZIZ(sbLIZ), new C460260I3c(authorName, comment2))) { // from class: X.04sV
                    public final InterfaceC460300I3g LIZIZ;

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof C1235704sV) && Intrinsics.LJFF(this.LIZIZ, ((C1235704sV) obj).LIZIZ);
                    }

                    public final int hashCode() {
                        return this.LIZIZ.hashCode();
                    }

                    public final String toString() {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("QuoteContentFromCommentContentText(data=");
                        sbLIZ2.append(this.LIZIZ);
                        sbLIZ2.append(')');
                        return C2188811AlT.LIZIZ(sbLIZ2);
                    }

                    @Override // X.AbstractC1236404sc
                    public final InterfaceC460300I3g LIZ() {
                        return this.LIZIZ;
                    }

                    {
                        super(interfaceC460300I3g);
                        this.LIZIZ = interfaceC460300I3g;
                    }
                };
                long refMsgId2 = c869590Y9l.getRefMsgId();
                ReferenceInfo referenceInfo3 = c869590Y9l.getReferenceInfo();
                if (referenceInfo3 != null) {
                    l = referenceInfo3.ref_message_type;
                } else {
                    l = null;
                }
                return new C0I3O(new C460810I5f(null, abstractC1236404sc2, new C0I3R(refMsgId2, l), 39));
            }

            {
                this.LL = context;
                C19719912Dl c19719912DlLIZ = C13LE.LIZ(QuotedMessageViewModel.class);
                this.LLILLJJLI = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ), new AwS550S0100000_6(c19719912DlLIZ, 1011), new C452070Ho5(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS550S0100000_6((HasDefaultViewModelProviderFactory) fragment, 1012), AFwS236S0000000_6.get$arr$(396));
            }
        });
        c13dvLIZIZ.add(new C0I3Z(fragment));
        c13dvLIZIZ.add(new InterfaceC460500I4a() { // from class: X.0I53
            public final C01GW LL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(409));

            @Override // X.C0I4V
            public final C0I3K<C460810I5f> LIZ(C869590Y9l c869590Y9l) {
                Long l;
                C869590Y9l c869590Y9lLJJJJZI;
                LightInteractionCommonResource lightInteractionCommonResourceLJJJLZIJ;
                LightInteractionGiphyMessage giphyMessage;
                boolean zBooleanValue;
                int iIntValue;
                C0I5T c0i51;
                Long l2;
                if (this.LL.getValue() == null) {
                    return C0I3M.LIZ;
                }
                ReferenceInfo referenceInfo = c869590Y9l.getReferenceInfo();
                int iIntValue2 = 0;
                if (referenceInfo != null && (l = referenceInfo.ref_message_type) != null && ((int) l.longValue()) == 5) {
                    ReferenceInfoHint referenceInfoHintLJIIIZ = C0ZDX.LJIIIZ(c869590Y9l);
                    if (referenceInfoHintLJIIIZ != null) {
                        c869590Y9lLJJJJZI = C0ZDX.LJJJJZI(referenceInfoHintLJIIIZ);
                    } else {
                        c869590Y9lLJJJJZI = null;
                    }
                    ILightInteractionPlatformService iLightInteractionPlatformService = (ILightInteractionPlatformService) this.LL.getValue();
                    if (iLightInteractionPlatformService != null && (lightInteractionCommonResourceLJJJLZIJ = iLightInteractionPlatformService.LJJJLZIJ(c869590Y9lLJJJJZI)) != null && (giphyMessage = lightInteractionCommonResourceLJJJLZIJ.getGiphyMessage()) != null) {
                        Boolean needImageFlip = lightInteractionCommonResourceLJJJLZIJ.getNeedImageFlip();
                        if (needImageFlip != null) {
                            zBooleanValue = needImageFlip.booleanValue();
                        } else {
                            zBooleanValue = false;
                        }
                        UrlModel urlModelLJIILIIL = C0I98.LJIILIIL(giphyMessage.staticUrl);
                        Integer num = giphyMessage.width;
                        if (num != null) {
                            iIntValue = num.intValue();
                        } else {
                            iIntValue = 0;
                        }
                        Integer num2 = giphyMessage.height;
                        if (num2 != null) {
                            iIntValue2 = num2.intValue();
                        }
                        Pair pairLIZ = C0I59.LIZ(iIntValue, iIntValue2, null);
                        int iIntValue3 = ((Number) pairLIZ.getFirst()).intValue();
                        int iIntValue4 = ((Number) pairLIZ.getSecond()).intValue();
                        if (urlModelLJIILIIL == null) {
                            c0i51 = EnumC460370I3n.STICKER.toMediaUIState();
                        } else {
                            c0i51 = new C0I51(urlModelLJIILIIL, false, iIntValue4, iIntValue3, false, zBooleanValue);
                        }
                        long refMsgId = c869590Y9l.getRefMsgId();
                        ReferenceInfo referenceInfo2 = c869590Y9l.getReferenceInfo();
                        if (referenceInfo2 != null) {
                            l2 = referenceInfo2.ref_message_type;
                        } else {
                            l2 = null;
                        }
                        return new C0I3O(new C460810I5f(null, c0i51, new C0I3R(refMsgId, l2), 39));
                    }
                    return C0I3M.LIZ;
                }
                return C0I3M.LIZ;
            }
        });
        c13dvLIZIZ.add(new InterfaceC460500I4a() { // from class: X.0I52
            /* JADX WARN: Removed duplicated region for block: B:28:0x0087  */
            /* JADX WARN: Removed duplicated region for block: B:35:0x00a3  */
            /* JADX WARN: Removed duplicated region for block: B:45:0x00ca  */
            @Override // X.C0I4V
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final X.C0I3K<X.C460810I5f> LIZ(X.C869590Y9l r16) {
                /*
                    Method dump skipped, instruction units count: 220
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C0I52.LIZ(X.0Y9l):X.0I3K");
            }
        });
        c13dvLIZIZ.add(new InterfaceC460500I4a() { // from class: X.0I3y
            @Override // X.C0I4V
            public final C0I3K<C460810I5f> LIZ(C869590Y9l c869590Y9l) {
                final ShareLiveContent shareLiveContent;
                final Long l;
                Long l2;
                BaseContent orParseJsonContentOfRefMsg = BaseContentParserKt.getOrParseJsonContentOfRefMsg(c869590Y9l, 1021);
                if ((orParseJsonContentOfRefMsg instanceof ShareLiveContent) && (shareLiveContent = (ShareLiveContent) orParseJsonContentOfRefMsg) != null) {
                    UrlModel roomCover = shareLiveContent.getRoomCover();
                    if (roomCover == null) {
                        C460460I3w mediaUIState = EnumC460370I3n.VIDEO.toMediaUIState();
                        long refMsgId = c869590Y9l.getRefMsgId();
                        ReferenceInfo referenceInfo = c869590Y9l.getReferenceInfo();
                        if (referenceInfo != null) {
                            l2 = referenceInfo.ref_message_type;
                        } else {
                            l2 = null;
                        }
                        return new C0I3O(new C460810I5f(null, mediaUIState, new C0I3R(refMsgId, l2), 39));
                    }
                    C460380I3o c460380I3o = new C460380I3o(roomCover, new C1233704sB(2131831880, (List<String>) null)) { // from class: X.0I3u
                        public final UrlModel LJIJ;
                        public final InterfaceC460300I3g LJIJI;
                        public final InterfaceC1320380kSq LJIJJ;

                        public final boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            if (!(obj instanceof C460440I3u)) {
                                return false;
                            }
                            C460440I3u c460440I3u = (C460440I3u) obj;
                            return Intrinsics.LJFF(this.LJIJ, c460440I3u.LJIJ) && Intrinsics.LJFF(this.LJIJI, c460440I3u.LJIJI) && Intrinsics.LJFF(this.LJIJJ, c460440I3u.LJIJJ);
                        }

                        public final int hashCode() {
                            return (((this.LJIJ.hashCode() * 31) + this.LJIJI.hashCode()) * 31) + this.LJIJJ.hashCode();
                        }

                        public final String toString() {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("LiveQuotedContentLogicHandlerThumbnail(url=");
                            sbLIZ.append(this.LJIJ);
                            sbLIZ.append(", title=");
                            sbLIZ.append(this.LJIJI);
                            sbLIZ.append(", scaleType=");
                            sbLIZ.append(this.LJIJJ);
                            sbLIZ.append(')');
                            return C2188811AlT.LIZIZ(sbLIZ);
                        }

                        @Override // X.C460380I3o, X.C0I5K
                        public final InterfaceC1320380kSq LIZIZ() {
                            return this.LJIJJ;
                        }

                        @Override // X.C0I5K
                        public final InterfaceC460300I3g LIZJ() {
                            return this.LJIJI;
                        }

                        /* JADX WARN: Illegal instructions before constructor call */
                        {
                            C1320340kSm c1320340kSm = InterfaceC1320380kSq.LJI;
                            super(roomCover, false, c1233704sB, c1320340kSm, 2);
                            this.LJIJ = roomCover;
                            this.LJIJI = c1233704sB;
                            this.LJIJJ = c1320340kSm;
                        }
                    };
                    final long refMsgId2 = c869590Y9l.getRefMsgId();
                    ReferenceInfo referenceInfo2 = c869590Y9l.getReferenceInfo();
                    if (referenceInfo2 != null) {
                        l = referenceInfo2.ref_message_type;
                    } else {
                        l = null;
                    }
                    return new C0I3O(new C460810I5f(null, c460380I3o, new AbstractC455680Htu(shareLiveContent, refMsgId2, l) { // from class: X.0I3z
                        public final ShareLiveContent LIZJ;
                        public final long LIZLLL;
                        public final Long LJ;

                        public final boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            if (!(obj instanceof C460490I3z)) {
                                return false;
                            }
                            C460490I3z c460490I3z = (C460490I3z) obj;
                            return Intrinsics.LJFF(this.LIZJ, c460490I3z.LIZJ) && this.LIZLLL == c460490I3z.LIZLLL && Intrinsics.LJFF(this.LJ, c460490I3z.LJ);
                        }

                        public final int hashCode() {
                            int iHashCode = ((this.LIZJ.hashCode() * 31) + C786410Ut5.Y2(this.LIZLLL)) * 31;
                            Long l3 = this.LJ;
                            return iHashCode + (l3 == null ? 0 : l3.hashCode());
                        }

                        public final String toString() {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("LiveCardClick(shareLiveContent=");
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
                            messageListQuotedMessageClickAbility.W32(view, this.LIZLLL, this.LJ, this.LIZJ);
                        }

                        {
                            super(refMsgId2, l);
                            this.LIZJ = shareLiveContent;
                            this.LIZLLL = refMsgId2;
                            this.LJ = l;
                        }
                    }, 39));
                }
                return C0I3M.LIZ;
            }
        });
        c13dvLIZIZ.add(new InterfaceC460500I4a(fragment, sessionInfo) { // from class: X.0I4O
            public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILLL;
            public final SessionInfo LL;
            public final AssemVMLazy LLILLJJLI;

            static {
                C2217381BqS c2217381BqS = new C2217381BqS(C0I4O.class, "quotedMessageViewModel", "getQuotedMessageViewModel()Lcom/ss/android/ugc/aweme/im/sdk/chat/controller/utils/QuotedMessageViewModel;", 0);
                C13LE.LIZ.getClass();
                LLILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
            }

            @Override // X.C0I4V
            public final C0I3K<C460810I5f> LIZ(C869590Y9l c869590Y9l) {
                Long l;
                C0YUT c0yut;
                Long l2;
                C0I4N c0i4n;
                Long l3;
                Long l4;
                ReferenceInfo referenceInfo = c869590Y9l.getReferenceInfo();
                if (referenceInfo != null && (l = referenceInfo.ref_message_type) != null && ((int) l.longValue()) == 1812 && (((c0yut = referenceInfo.referenced_message_status) != C0YUT.DELETED || c0yut != C0YUT.NOT_EXIST) && (l2 = referenceInfo.referenced_message_id) != null)) {
                    long jLongValue = l2.longValue();
                    AssemVMLazy assemVMLazy2 = this.LLILLJJLI;
                    InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILLL;
                    QuotedMessageInfo.QuotedAIGroupPhotoTemplateInfo quotedAIGroupPhotoTemplateInfo = (QuotedMessageInfo.QuotedAIGroupPhotoTemplateInfo) ((QuotedMessageViewModel) assemVMLazy2.getValue()).wQ2(c869590Y9l, QuotedMessageInfo.QuotedAIGroupPhotoTemplateInfo.class);
                    if (quotedAIGroupPhotoTemplateInfo == null) {
                        return C0I3M.LIZ;
                    }
                    if (quotedAIGroupPhotoTemplateInfo.isHidden) {
                        AbstractC1236404sc abstractC1236404sc = new AbstractC1236404sc(new C1233704sB(2131831101, (List<String>) null)) { // from class: X.04sF
                            public final InterfaceC460300I3g LIZIZ;

                            public final boolean equals(Object obj) {
                                if (this == obj) {
                                    return true;
                                }
                                return (obj instanceof C1234104sF) && Intrinsics.LJFF(this.LIZIZ, ((C1234104sF) obj).LIZIZ);
                            }

                            public final int hashCode() {
                                return this.LIZIZ.hashCode();
                            }

                            public final String toString() {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("AIGroupShotText(data=");
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
                        ReferenceInfo referenceInfo2 = c869590Y9l.getReferenceInfo();
                        if (referenceInfo2 != null) {
                            l4 = referenceInfo2.ref_message_type;
                        } else {
                            l4 = null;
                        }
                        return new C0I3O(new C460810I5f(null, abstractC1236404sc, new C0I3R(jLongValue, l4), 39));
                    }
                    UrlModel urlModelLIZ = C0I3J.LIZ(quotedAIGroupPhotoTemplateInfo.urlList);
                    int i = quotedAIGroupPhotoTemplateInfo.height;
                    int i2 = quotedAIGroupPhotoTemplateInfo.width;
                    if (C1ED0.LIZ(quotedAIGroupPhotoTemplateInfo.photoMsgCreateAt, false, quotedAIGroupPhotoTemplateInfo.isSendBySelf, this.LL.isMediaMsgMasking())) {
                        c0i4n = C0I4N.BLUR;
                    } else {
                        c0i4n = C0I4N.NONE;
                    }
                    C0I4K c0i4k = new C0I4K(urlModelLIZ, i2, i, c0i4n, null);
                    String str = quotedAIGroupPhotoTemplateInfo.photoId;
                    ReferenceInfo referenceInfo3 = c869590Y9l.getReferenceInfo();
                    if (referenceInfo3 != null) {
                        l3 = referenceInfo3.ref_message_type;
                    } else {
                        l3 = null;
                    }
                    return new C0I3O(new C460810I5f(null, c0i4k, new C455610Htn(jLongValue, str, l3), 39));
                }
                return C0I3M.LIZ;
            }

            {
                this.LL = sessionInfo;
                C19719912Dl c19719912DlLIZ = C13LE.LIZ(QuotedMessageViewModel.class);
                this.LLILLJJLI = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ), new AwS550S0100000_6(c19719912DlLIZ, 1003), new C452070Ho5(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS550S0100000_6((HasDefaultViewModelProviderFactory) fragment, 1004), AFwS236S0000000_6.get$arr$(389));
            }
        });
        c13dvLIZIZ.add(new C0I4J(fragment, sessionInfo));
        c13dvLIZIZ.add(new C460330I3j(fragment, sessionInfo));
        c13dvLIZIZ.add(new C460310I3h(fragment));
        c13dvLIZIZ.add(new InterfaceC460500I4a(fragment) { // from class: X.0I4l
            public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILLJJLI;
            public final AssemVMLazy LL;

            static {
                C2217381BqS c2217381BqS = new C2217381BqS(C460610I4l.class, "quotedMessageViewModel", "getQuotedMessageViewModel()Lcom/ss/android/ugc/aweme/im/sdk/chat/controller/utils/QuotedMessageViewModel;", 0);
                C13LE.LIZ.getClass();
                LLILLJJLI = new InterfaceC2217461Bqa[]{c2217381BqS};
            }

            {
                C19719912Dl c19719912DlLIZ = C13LE.LIZ(QuotedMessageViewModel.class);
                this.LL = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ), new AwS550S0100000_6(c19719912DlLIZ, 1016), new C452070Ho5(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS550S0100000_6((HasDefaultViewModelProviderFactory) fragment, 1017), AFwS236S0000000_6.get$arr$(399));
            }

            @Override // X.C0I4V
            public final C0I3K<C460810I5f> LIZ(C869590Y9l c869590Y9l) {
                Long l;
                Long l2;
                String str;
                Long l3;
                String refMsg_template_quote;
                List listLJJLIIIJILLIZJL;
                Long l4;
                ReferenceInfo referenceInfo = c869590Y9l.getReferenceInfo();
                if (referenceInfo != null && (l = referenceInfo.ref_message_type) != null && ((int) l.longValue()) == 1813 && (l2 = referenceInfo.referenced_message_id) != null) {
                    long jLongValue = l2.longValue();
                    AssemVMLazy assemVMLazy2 = this.LL;
                    InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILLJJLI;
                    QuotedMessageInfo.QuotedVoiceMessageTemplateInfo quotedVoiceMessageTemplateInfo = (QuotedMessageInfo.QuotedVoiceMessageTemplateInfo) ((QuotedMessageViewModel) assemVMLazy2.getValue()).wQ2(c869590Y9l, QuotedMessageInfo.QuotedVoiceMessageTemplateInfo.class);
                    ReferenceInfoHint referenceInfoHintLJIIIZ = C0ZDX.LJIIIZ(c869590Y9l);
                    if (referenceInfoHintLJIIIZ != null) {
                        referenceInfoHintLJIIIZ.getContent();
                    }
                    if (c869590Y9l.getMsgStatus() == 1 || (quotedVoiceMessageTemplateInfo != null && quotedVoiceMessageTemplateInfo.available)) {
                        if (C0I5Z.LIZ(c869590Y9l)) {
                            if (referenceInfoHintLJIIIZ == null || (refMsg_template_quote = referenceInfoHintLJIIIZ.getRefMsg_template_quote()) == null || (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(refMsg_template_quote, new String[]{" "}, 0, 6)) == null || (str = (String) C13LP.LJJLIIIJL(listLJJLIIIJILLIZJL)) == null) {
                                str = "";
                            }
                            C460620I4m c460620I4m = new C460620I4m(str);
                            ReferenceInfo referenceInfo2 = c869590Y9l.getReferenceInfo();
                            if (referenceInfo2 != null) {
                                l3 = referenceInfo2.ref_message_type;
                            } else {
                                l3 = null;
                            }
                            return new C0I3O(new C460810I5f(null, c460620I4m, new C455650Htr(jLongValue, l3), 39));
                        }
                        return C0I3M.LIZ;
                    }
                    AbstractC1236404sc abstractC1236404sc = new AbstractC1236404sc(new C1233704sB(2131831101, (List<String>) null)) { // from class: X.04sP
                        public final InterfaceC460300I3g LIZIZ;

                        public final boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            return (obj instanceof C1235104sP) && Intrinsics.LJFF(this.LIZIZ, ((C1235104sP) obj).LIZIZ);
                        }

                        public final int hashCode() {
                            return this.LIZIZ.hashCode();
                        }

                        public final String toString() {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("VoiceText(data=");
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
                        l4 = referenceInfo3.ref_message_type;
                    } else {
                        l4 = null;
                    }
                    return new C0I3O(new C460810I5f(null, abstractC1236404sc, new C0I3R(jLongValue, l4), 39));
                }
                return C0I3M.LIZ;
            }
        });
        c13dvLIZIZ.add(new InterfaceC460500I4a(fragment) { // from class: X.0I4k
            public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILLJJLI;
            public final AssemVMLazy LL;

            static {
                C2217381BqS c2217381BqS = new C2217381BqS(C460600I4k.class, "quotedMessageViewModel", "getQuotedMessageViewModel()Lcom/ss/android/ugc/aweme/im/sdk/chat/controller/utils/QuotedMessageViewModel;", 0);
                C13LE.LIZ.getClass();
                LLILLJJLI = new InterfaceC2217461Bqa[]{c2217381BqS};
            }

            {
                C19719912Dl c19719912DlLIZ = C13LE.LIZ(QuotedMessageViewModel.class);
                this.LL = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ), new AwS550S0100000_6(c19719912DlLIZ, 1008), new C452070Ho5(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS550S0100000_6((HasDefaultViewModelProviderFactory) fragment, 1009), AFwS236S0000000_6.get$arr$(392));
            }

            @Override // X.C0I4V
            public final C0I3K<C460810I5f> LIZ(C869590Y9l c869590Y9l) {
                Long l;
                Long l2;
                Long l3;
                ReferenceInfo referenceInfo = c869590Y9l.getReferenceInfo();
                if (referenceInfo != null && (l = referenceInfo.ref_message_type) != null && ((int) l.longValue()) == 1823 && 1 != 0 && (l2 = referenceInfo.referenced_message_id) != null) {
                    long jLongValue = l2.longValue();
                    AssemVMLazy assemVMLazy2 = this.LL;
                    InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILLJJLI;
                    QuotedMessageInfo.QuotedCallLogTemplateInfo quotedCallLogTemplateInfo = (QuotedMessageInfo.QuotedCallLogTemplateInfo) ((QuotedMessageViewModel) assemVMLazy2.getValue()).wQ2(c869590Y9l, QuotedMessageInfo.QuotedCallLogTemplateInfo.class);
                    if (quotedCallLogTemplateInfo == null) {
                        return C0I3M.LIZ;
                    }
                    C1236504sd c1236504sd = new C1236504sd(quotedCallLogTemplateInfo.status);
                    ReferenceInfo referenceInfo2 = c869590Y9l.getReferenceInfo();
                    if (referenceInfo2 != null) {
                        l3 = referenceInfo2.ref_message_type;
                    } else {
                        l3 = null;
                    }
                    return new C0I3O(new C460810I5f(null, c1236504sd, new C455650Htr(jLongValue, l3), 39));
                }
                return C0I3M.LIZ;
            }
        });
        c13dvLIZIZ.add(new C0I3H(fragment));
        c13dvLIZIZ.add(new InterfaceC460500I4a() { // from class: X.0I4S
            @Override // X.C0I4V
            public final C0I3K<C460810I5f> LIZ(C869590Y9l c869590Y9l) {
                if (C0ZDX.LJJJJI(c869590Y9l)) {
                    return new C0I3O(new C460810I5f(new C0I3V(new C1233704sB(2131827468, (List<String>) null)), C460530I4d.LIZ, null, 51));
                }
                return C0I3M.LIZ;
            }
        });
        c13dvLIZIZ.add(new C460630I4n(fragment));
        c13dvLIZIZ.add(new C0I4G(fragment));
        c13dvLIZIZ.add(new InterfaceC460500I4a(fragment) { // from class: X.0I4y
            public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILLL;
            public final AssemVMLazy LL;
            public final AssemVMLazy LLILLJJLI;

            static {
                C2217381BqS c2217381BqS = new C2217381BqS(C460740I4y.class, "quotedMessageViewModel", "getQuotedMessageViewModel()Lcom/ss/android/ugc/aweme/im/sdk/chat/controller/utils/QuotedMessageViewModel;", 0);
                C09R3 c09r3 = C13LE.LIZ;
                c09r3.getClass();
                C2217381BqS c2217381BqS2 = new C2217381BqS(C460740I4y.class, "greetingCardVM", "getGreetingCardVM()Lcom/ss/android/ugc/aweme/viewmodel/GreetingCardViewModel;", 0);
                c09r3.getClass();
                LLILLL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
            }

            {
                C19719912Dl c19719912DlLIZ = C13LE.LIZ(QuotedMessageViewModel.class);
                AwS546S0100000_2 awS546S0100000_2 = new AwS546S0100000_2(c19719912DlLIZ, 949);
                AFwS236S0000000_6 aFwS236S0000000_6 = AFwS236S0000000_6.get$arr$(394);
                Function0 function0LJIIJ = C724750Sbp.LJIIJ(fragment, c19719912DlLIZ);
                C452070Ho5 c452070Ho5 = new C452070Ho5();
                this.LL = new AssemVMLazy(function0LJIIJ, awS546S0100000_2, c452070Ho5, C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS546S0100000_2((HasDefaultViewModelProviderFactory) fragment, 950), aFwS236S0000000_6);
                C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(GreetingCardViewModel.class);
                this.LLILLJJLI = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ2), new AwS546S0100000_2(c19719912DlLIZ2, 951), c452070Ho5, C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS546S0100000_2((HasDefaultViewModelProviderFactory) fragment, 952), AFwS236S0000000_6.get$arr$(395));
            }

            @Override // X.C0I4V
            public final C0I3K<C460810I5f> LIZ(C869590Y9l c869590Y9l) {
                Long l;
                C0YUT c0yut;
                C0YUT c0yut2;
                Long l2;
                int i;
                Long l3;
                ReferenceInfo referenceInfo = c869590Y9l.getReferenceInfo();
                if (referenceInfo != null && (l = referenceInfo.ref_message_type) != null && l.longValue() == 1814) {
                    ReferenceInfo referenceInfo2 = c869590Y9l.getReferenceInfo();
                    if (referenceInfo2 != null) {
                        c0yut = referenceInfo2.referenced_message_status;
                    } else {
                        c0yut = null;
                    }
                    if (c0yut != C0YUT.DELETED) {
                        ReferenceInfo referenceInfo3 = c869590Y9l.getReferenceInfo();
                        if (referenceInfo3 != null) {
                            c0yut2 = referenceInfo3.referenced_message_status;
                        } else {
                            c0yut2 = null;
                        }
                        if (c0yut2 != C0YUT.NOT_EXIST) {
                            AssemVMLazy assemVMLazy2 = this.LL;
                            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILLL;
                            QuotedMessageInfo.QuotedGreetingCardTemplateInfo quotedGreetingCardTemplateInfo = (QuotedMessageInfo.QuotedGreetingCardTemplateInfo) ((QuotedMessageViewModel) assemVMLazy2.getValue()).wQ2(c869590Y9l, QuotedMessageInfo.QuotedGreetingCardTemplateInfo.class);
                            if (quotedGreetingCardTemplateInfo == null) {
                                return C0I3M.LIZ;
                            }
                            if (quotedGreetingCardTemplateInfo.isViolated) {
                                if (C0ZDX.LJJIJIIJIL(c869590Y9l)) {
                                    i = 2131831105;
                                } else {
                                    i = 2131831102;
                                }
                                AbstractC1236404sc abstractC1236404sc = new AbstractC1236404sc(new C1233704sB(i, (List<String>) null)) { // from class: X.04sY
                                    public final InterfaceC460300I3g LIZIZ;

                                    public final boolean equals(Object obj) {
                                        if (this == obj) {
                                            return true;
                                        }
                                        return (obj instanceof C1236004sY) && Intrinsics.LJFF(this.LIZIZ, ((C1236004sY) obj).LIZIZ);
                                    }

                                    public final int hashCode() {
                                        return this.LIZIZ.hashCode();
                                    }

                                    public final String toString() {
                                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                                        sbLIZ.append("FilteredKeywordText(data=");
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
                                ReferenceInfo referenceInfo4 = c869590Y9l.getReferenceInfo();
                                if (referenceInfo4 != null) {
                                    l3 = referenceInfo4.ref_message_type;
                                } else {
                                    l3 = null;
                                }
                                return new C0I3O(new C460810I5f(null, abstractC1236404sc, new C0I3R(refMsgId, l3), 39));
                            }
                            C0IBH c0ibh = quotedGreetingCardTemplateInfo.status;
                            if (c0ibh == null) {
                                c0ibh = C0IBH.GREETING_CARD_STATUS_UNKNOWN;
                            }
                            final UrlModel urlModelXQ2 = ((GreetingCardViewModel) this.LLILLJJLI.getValue()).xQ2(quotedGreetingCardTemplateInfo.festiveId, C461300I7c.LIZIZ(c869590Y9l, c0ibh));
                            if (urlModelXQ2 == null) {
                                return C0I3M.LIZ;
                            }
                            C0I5J c0i5j = new C0I5J(urlModelXQ2) { // from class: X.0I50
                                public final UrlModel LJIILIIL;

                                public final boolean equals(Object obj) {
                                    if (this == obj) {
                                        return true;
                                    }
                                    return (obj instanceof C0I50) && Intrinsics.LJFF(this.LJIILIIL, ((C0I50) obj).LJIILIIL);
                                }

                                public final int hashCode() {
                                    return this.LJIILIIL.hashCode();
                                }

                                public final String toString() {
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("QuotedGreetingCard(url=");
                                    sbLIZ.append(this.LJIILIIL);
                                    sbLIZ.append(')');
                                    return C2188811AlT.LIZIZ(sbLIZ);
                                }

                                {
                                    C1233704sB c1233704sB = new C1233704sB(2131831889, (List<String>) null);
                                    C0I5E c0i5e = C0I5E.NONE;
                                    int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(42));
                                    super(urlModelXQ2, null, InterfaceC1320380kSq.LIZ, AFwS236S0000000_6.get$arr$(432), c1233704sB, c0i5e, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(42)), iLIZIZ, 8, false);
                                    this.LJIILIIL = urlModelXQ2;
                                }
                            };
                            long refMsgId2 = c869590Y9l.getRefMsgId();
                            ReferenceInfo referenceInfo5 = c869590Y9l.getReferenceInfo();
                            if (referenceInfo5 != null) {
                                l2 = referenceInfo5.ref_message_type;
                            } else {
                                l2 = null;
                            }
                            return new C0I3O(new C460810I5f(null, c0i5j, new AbstractC455680Htu(refMsgId2, l2) { // from class: X.0Hts
                                public final long LIZJ;
                                public final Long LIZLLL;

                                public final boolean equals(Object obj) {
                                    if (this == obj) {
                                        return true;
                                    }
                                    if (!(obj instanceof C455660Hts)) {
                                        return false;
                                    }
                                    C455660Hts c455660Hts = (C455660Hts) obj;
                                    return this.LIZJ == c455660Hts.LIZJ && Intrinsics.LJFF(this.LIZLLL, c455660Hts.LIZLLL);
                                }

                                public final int hashCode() {
                                    int iY2 = C786410Ut5.Y2(this.LIZJ) * 31;
                                    Long l4 = this.LIZLLL;
                                    return iY2 + (l4 == null ? 0 : l4.hashCode());
                                }

                                public final String toString() {
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("GreetingCardClick(targetMsgId=");
                                    sbLIZ.append(this.LIZJ);
                                    sbLIZ.append(", messageType=");
                                    sbLIZ.append(this.LIZLLL);
                                    sbLIZ.append(')');
                                    return C2188811AlT.LIZIZ(sbLIZ);
                                }

                                {
                                    super(refMsgId2, l2);
                                    this.LIZJ = refMsgId2;
                                    this.LIZLLL = l2;
                                }

                                @Override // X.AbstractC455680Htu
                                public final void LIZ(View view, MessageListQuotedMessageClickAbility messageListQuotedMessageClickAbility) {
                                    messageListQuotedMessageClickAbility.lU1(this.LIZJ);
                                }
                            }, 39));
                        }
                    }
                    return C0I3M.LIZ;
                }
                return C0I3M.LIZ;
            }
        });
        c13dvLIZIZ.add(new C0I3W(fragment));
        c13dvLIZIZ.add(new InterfaceC460500I4a(fragment) { // from class: X.0I4j
            public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILLJJLI;
            public final AssemVMLazy LL;

            static {
                C2217381BqS c2217381BqS = new C2217381BqS(C460590I4j.class, "quotedMessageViewModel", "getQuotedMessageViewModel()Lcom/ss/android/ugc/aweme/im/sdk/chat/controller/utils/QuotedMessageViewModel;", 0);
                C13LE.LIZ.getClass();
                LLILLJJLI = new InterfaceC2217461Bqa[]{c2217381BqS};
            }

            {
                C19719912Dl c19719912DlLIZ = C13LE.LIZ(QuotedMessageViewModel.class);
                this.LL = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ), new AwS550S0100000_6(c19719912DlLIZ, 1005), new C452070Ho5(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS550S0100000_6((HasDefaultViewModelProviderFactory) fragment, 1006), AFwS236S0000000_6.get$arr$(390));
            }

            @Override // X.C0I4V
            public final C0I3K<C460810I5f> LIZ(C869590Y9l c869590Y9l) {
                Long l;
                Long l2;
                C869590Y9l c869590Y9lLJJJ;
                String refMsg_template_quote;
                BusinessNativeCardTemplate businessNativeCardTemplate;
                PreviewHintComponent previewHintComponent;
                TextComponent textComponent;
                InterfaceC460300I3g c1233704sB;
                Long l3;
                ReferenceInfo referenceInfo = c869590Y9l.getReferenceInfo();
                if (referenceInfo != null && (l = referenceInfo.referenced_message_id) != null) {
                    long jLongValue = l.longValue();
                    ReferenceInfo referenceInfo2 = c869590Y9l.getReferenceInfo();
                    if (referenceInfo2 != null && (l2 = referenceInfo2.ref_message_type) != null && ((int) l2.longValue()) == 2001) {
                        AssemVMLazy assemVMLazy2 = this.LL;
                        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILLJJLI;
                        QuotedMessageInfo.QuotedBusinessNativeCardTemplateInfo quotedBusinessNativeCardTemplateInfo = (QuotedMessageInfo.QuotedBusinessNativeCardTemplateInfo) ((QuotedMessageViewModel) assemVMLazy2.getValue()).wQ2(c869590Y9l, QuotedMessageInfo.QuotedBusinessNativeCardTemplateInfo.class);
                        ReferenceInfoHint referenceInfoHintLJIIIZ = C0ZDX.LJIIIZ(c869590Y9l);
                        if ((referenceInfoHintLJIIIZ == null || (refMsg_template_quote = referenceInfoHintLJIIIZ.getRefMsg_template_quote()) == null || refMsg_template_quote.length() <= 0) && ((quotedBusinessNativeCardTemplateInfo == null || (refMsg_template_quote = quotedBusinessNativeCardTemplateInfo.quotePreviewText) == null || refMsg_template_quote.length() <= 0 || refMsg_template_quote == null) && ((c869590Y9lLJJJ = C0YNY.LIZ(InterfaceC874680YTa.LIZ).LJJJ(jLongValue)) == null || (businessNativeCardTemplate = (BusinessNativeCardTemplate) C0Z2Z.LIZ(c869590Y9lLJJJ, BusinessNativeCardTemplate.class)) == null || (previewHintComponent = businessNativeCardTemplate.previewHintComponent) == null || (textComponent = previewHintComponent.quotePreviewText) == null || (refMsg_template_quote = textComponent.text) == null || refMsg_template_quote.length() <= 0))) {
                            refMsg_template_quote = null;
                        }
                        if (refMsg_template_quote != null && refMsg_template_quote.length() != 0) {
                            c1233704sB = new C1258904wF(refMsg_template_quote);
                        } else {
                            c1233704sB = new C1233704sB(2131835770, (List<String>) null);
                        }
                        AbstractC1236404sc abstractC1236404sc = new AbstractC1236404sc(c1233704sB) { // from class: X.04sT
                            public final InterfaceC460300I3g LIZIZ;

                            public final boolean equals(Object obj) {
                                if (this == obj) {
                                    return true;
                                }
                                return (obj instanceof C1235504sT) && Intrinsics.LJFF(this.LIZIZ, ((C1235504sT) obj).LIZIZ);
                            }

                            public final int hashCode() {
                                return this.LIZIZ.hashCode();
                            }

                            public final String toString() {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("BusinessNativeCardText(data=");
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
                        ReferenceInfo referenceInfo3 = c869590Y9l.getReferenceInfo();
                        if (referenceInfo3 != null) {
                            l3 = referenceInfo3.ref_message_type;
                        } else {
                            l3 = null;
                        }
                        return new C0I3O(new C460810I5f(null, abstractC1236404sc, new C455650Htr(refMsgId, l3), 39));
                    }
                    return C0I3M.LIZ;
                }
                return C0I3M.LIZ;
            }
        });
        if (C300750Bqb.LIZ()) {
            c13dvLIZIZ.add(new C0I3P(fragment));
        }
        c13dvLIZIZ.add(new InterfaceC460500I4a() { // from class: X.0I4w
            public final C01GW LL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(410));

            @Override // X.C0I4V
            public final C0I3K<C460810I5f> LIZ(C869590Y9l c869590Y9l) {
                String refmsg_light_interaction_name;
                C0ICM c0icmLJJJIL;
                Long l;
                if (this.LL.getValue() == null) {
                    return C0I3M.LIZ;
                }
                ReferenceInfoHint referenceInfoHintLJIIIZ = C0ZDX.LJIIIZ(c869590Y9l);
                if (referenceInfoHintLJIIIZ != null && (refmsg_light_interaction_name = referenceInfoHintLJIIIZ.getRefmsg_light_interaction_name()) != null) {
                    C0Z9Y c0z9y = (C0Z9Y) this.LL.getValue();
                    if (c0z9y != null && (c0icmLJJJIL = c0z9y.LJJJIL()) != null) {
                        String strLIZIZ = c0icmLJJJIL.LIZIZ(refmsg_light_interaction_name);
                        boolean z = false;
                        if (strLIZIZ != null && strLIZIZ.length() != 0) {
                            if (referenceInfoHintLJIIIZ.getRefmsg_type() == 7) {
                                z = true;
                            }
                            AbstractC1236404sc abstractC1236404sc = new AbstractC1236404sc(new C1258904wF(strLIZIZ)) { // from class: X.04sa
                                public final InterfaceC460300I3g LIZIZ;

                                public final boolean equals(Object obj) {
                                    if (this == obj) {
                                        return true;
                                    }
                                    return (obj instanceof C1236204sa) && Intrinsics.LJFF(this.LIZIZ, ((C1236204sa) obj).LIZIZ);
                                }

                                public final int hashCode() {
                                    return this.LIZIZ.hashCode();
                                }

                                public final String toString() {
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("LightInteractionText(data=");
                                    sbLIZ.append(this.LIZIZ);
                                    sbLIZ.append(')');
                                    return C2188811AlT.LIZIZ(sbLIZ);
                                }

                                @Override // X.AbstractC1236404sc
                                public final InterfaceC460300I3g LIZ() {
                                    return this.LIZIZ;
                                }

                                {
                                    super(c1258904wF);
                                    this.LIZIZ = c1258904wF;
                                }
                            };
                            Long lValueOf = Long.valueOf(c869590Y9l.getRefMsgId());
                            long msgId = c869590Y9l.getMsgId();
                            ReferenceInfo referenceInfo = c869590Y9l.getReferenceInfo();
                            if (referenceInfo != null) {
                                l = referenceInfo.ref_message_type;
                            } else {
                                l = null;
                            }
                            return new C0I3O(new C460810I5f(null, abstractC1236404sc, C460710I4v.LIZLLL(z, lValueOf, msgId, l), 39));
                        }
                    }
                    return C0I3M.LIZ;
                }
                return C0I3M.LIZ;
            }
        });
        c13dvLIZIZ.add(new InterfaceC460500I4a() { // from class: X.0I3X
            @Override // X.C0I4V
            public final C0I3K<C460810I5f> LIZ(C869590Y9l c869590Y9l) {
                Long l;
                ReferenceInfoHint referenceInfoHintLJIIIZ = C0ZDX.LJIIIZ(c869590Y9l);
                if (referenceInfoHintLJIIIZ != null) {
                    String refMsg_template_quote = referenceInfoHintLJIIIZ.getRefMsg_template_quote();
                    boolean z = false;
                    if (refMsg_template_quote != null && refMsg_template_quote.length() != 0) {
                        if (referenceInfoHintLJIIIZ.getRefmsg_type() == 7 || referenceInfoHintLJIIIZ.getRefmsg_type() == 1813) {
                            z = true;
                        }
                        AbstractC1236404sc abstractC1236404sc = new AbstractC1236404sc(new C1258904wF(refMsg_template_quote)) { // from class: X.04sb
                            public final InterfaceC460300I3g LIZIZ;

                            public final boolean equals(Object obj) {
                                if (this == obj) {
                                    return true;
                                }
                                return (obj instanceof C1236304sb) && Intrinsics.LJFF(this.LIZIZ, ((C1236304sb) obj).LIZIZ);
                            }

                            public final int hashCode() {
                                return this.LIZIZ.hashCode();
                            }

                            public final String toString() {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("TextFromTemplate(data=");
                                sbLIZ.append(this.LIZIZ);
                                sbLIZ.append(')');
                                return C2188811AlT.LIZIZ(sbLIZ);
                            }

                            @Override // X.AbstractC1236404sc
                            public final InterfaceC460300I3g LIZ() {
                                return this.LIZIZ;
                            }

                            {
                                super(c1258904wF);
                                this.LIZIZ = c1258904wF;
                            }
                        };
                        Long lValueOf = Long.valueOf(c869590Y9l.getRefMsgId());
                        long msgId = c869590Y9l.getMsgId();
                        ReferenceInfo referenceInfo = c869590Y9l.getReferenceInfo();
                        if (referenceInfo != null) {
                            l = referenceInfo.ref_message_type;
                        } else {
                            l = null;
                        }
                        return new C0I3O(new C460810I5f(null, abstractC1236404sc, C460710I4v.LIZLLL(z, lValueOf, msgId, l), 39));
                    }
                }
                return C0I3M.LIZ;
            }
        });
        c13dvLIZIZ.add(new InterfaceC460500I4a() { // from class: X.0I4E
            /* JADX WARN: Removed duplicated region for block: B:174:0x0334  */
            /* JADX WARN: Removed duplicated region for block: B:23:0x0076 A[RETURN] */
            @Override // X.C0I4V
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final X.C0I3K<X.C460810I5f> LIZ(X.C869590Y9l r17) {
                /*
                    Method dump skipped, instruction units count: 828
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C0I4E.LIZ(X.0Y9l):X.0I3K");
            }
        });
        c13dvLIZIZ.add(new C0I44(context));
        this.LJ = C1697820uHc.LIZ(c13dvLIZIZ);
    }
}
