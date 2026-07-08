package X;

import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.message.content.BaseContent;
import com.ss.android.ugc.aweme.im.message.content.adapter.BaseContentParserKt;
import com.ss.android.ugc.aweme.im.messagelist.api.IAwemeStatusViewModel;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListQuotedMessageClickAbility;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.data.factory.handler.QuotedTikTokLinkPreview;
import com.ss.android.ugc.aweme.im.service.risky.IDMRiskyKeywordsService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.List;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0I5Q, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0I5Q implements InterfaceC460500I4a, InterfaceC497601wk {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZ;
    public final C01GW<IAwemeStatusViewModel> LL;
    public final AbstractC2252651DEx LLILLJJLI;
    public volatile C1598406Nq LLILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0I5Q.class, "ttDispatcher", "getTtDispatcher()Lcom/ss/android/ugc/aweme/im/saas/host/api/utils/IMDispatchers;", 0);
        C13LE.LIZ.getClass();
        LLILZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public static C460810I5f LIZJ() {
        C460510I4b c460510I4b = C460510I4b.LIZ;
        final C1233704sB c1233704sB = new C1233704sB(2131831104, (List<String>) null);
        return new C460810I5f(c460510I4b, new AbstractC1236404sc(c1233704sB) { // from class: X.04sM
            public final InterfaceC460300I3g LIZIZ;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1234804sM) && Intrinsics.LJFF(this.LIZIZ, ((C1234804sM) obj).LIZIZ);
            }

            public final int hashCode() {
                return this.LIZIZ.hashCode();
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("QuotePreviewFromRedSceneText(data=");
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
        }, null, 51);
    }

    @Override // X.InterfaceC497601wk
    public final CoroutineContext getCoroutineContext() {
        return this.LLILLJJLI;
    }

    public C0I5Q(AssemVMLazy assemVMLazy) {
        this.LL = assemVMLazy;
        C1598406Nq c1598406Nq = this.LLILLL;
        if (c1598406Nq == null) {
            synchronized (this) {
                c1598406Nq = this.LLILLL;
                if (c1598406Nq == null) {
                    c1598406Nq = (C1598406Nq) C1807670x8n.LLLLLJIL();
                    this.LLILLL = c1598406Nq;
                }
            }
        }
        this.LLILLJJLI = c1598406Nq.LIZ;
    }

    @Override // X.C0I4V
    public final C0I3K<C460810I5f> LIZ(C869590Y9l c869590Y9l) {
        Integer referenceScene;
        BaseContent.ReferenceVideo refVideo;
        String refVideoId;
        C460810I5f c460810I5fLIZJ;
        String str;
        String str2;
        String nickname;
        UrlModel avatarThumb;
        List<String> urlList;
        UrlModel cover;
        List<String> urlList2;
        IDMRiskyKeywordsService iDMRiskyKeywordsService;
        BaseContent orParseJsonContent = BaseContentParserKt.getOrParseJsonContent(c869590Y9l, BaseContent.class);
        if (orParseJsonContent != null && (referenceScene = orParseJsonContent.getReferenceScene()) != null && referenceScene.intValue() == BaseContent.ReferenceSceneType.QUOTED_PREVIEW.ordinal() && 1 != 0) {
            referenceScene.intValue();
            if (C300750Bqb.LIZ() && (iDMRiskyKeywordsService = (IDMRiskyKeywordsService) PluggableExtentionKt.pluggableSpiForReal(IDMRiskyKeywordsService.class)) != null && iDMRiskyKeywordsService.LIZ(c869590Y9l, false)) {
                return new C0I3O(new C460810I5f(C460510I4b.LIZ, C460530I4d.LIZ, null, 51));
            }
            BaseContent orParseJsonContent2 = BaseContentParserKt.getOrParseJsonContent(c869590Y9l, BaseContent.class);
            if (orParseJsonContent2 != null && (refVideo = orParseJsonContent2.getRefVideo()) != null && (refVideoId = refVideo.getRefVideoId()) != null) {
                InterfaceC327250CsF interfaceC327250CsF = (InterfaceC327250CsF) this.LL.getValue().vQ2(refVideoId).getValue();
                String str3 = "available";
                if (interfaceC327250CsF instanceof C327270CsH) {
                    Aweme aweme = ((C327270CsH) interfaceC327250CsF).LIZIZ;
                    QuotedTikTokLinkPreview.Companion.getClass();
                    String aid = aweme.getAid();
                    Video video = aweme.getVideo();
                    String str4 = "";
                    if (video == null || (cover = video.getCover()) == null || (urlList2 = cover.getUrlList()) == null || (str = (String) C13LP.LJJJLL(urlList2)) == null) {
                        str = "";
                    }
                    User author = aweme.getAuthor();
                    if (author == null || (avatarThumb = author.getAvatarThumb()) == null || (urlList = avatarThumb.getUrlList()) == null || (str2 = (String) C13LP.LJJJLL(urlList)) == null) {
                        str2 = "";
                    }
                    String authorUid = AwemeExtKt.getAuthorUid(aweme);
                    User author2 = aweme.getAuthor();
                    if (author2 != null && (nickname = author2.getNickname()) != null) {
                        str4 = nickname;
                    }
                    QuotedTikTokLinkPreview quotedTikTokLinkPreview = new QuotedTikTokLinkPreview(aid, str, str2, authorUid, str4, aweme.getIsTikTokStory());
                    C23250099c.LIZLLL(this, null, null, new C06ZZ(c869590Y9l, "available", quotedTikTokLinkPreview, null), 3);
                    c460810I5fLIZJ = LIZIZ(quotedTikTokLinkPreview, String.valueOf(c869590Y9l.getSender()));
                } else if (Intrinsics.LJFF(interfaceC327250CsF, C327260CsG.LIZ)) {
                    String str5 = c869590Y9l.getLocalExt().get("ref_attachment_state");
                    if (str5 != null) {
                        str3 = str5;
                    }
                    if (Intrinsics.LJFF(str3, "unavailable")) {
                        c460810I5fLIZJ = LIZJ();
                    } else {
                        try {
                            String str6 = c869590Y9l.getLocalExt().get("ref_preview_info");
                            if (str6 != null) {
                                QuotedTikTokLinkPreview quotedTikTokLinkPreview2 = (QuotedTikTokLinkPreview) C051M.LIZ(QuotedTikTokLinkPreview.class, str6);
                                if (quotedTikTokLinkPreview2 != null && quotedTikTokLinkPreview2.refVideoId != null) {
                                    return new C0I3O(LIZIZ(quotedTikTokLinkPreview2, String.valueOf(c869590Y9l.getSender())));
                                }
                            }
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                        return new C0I3O(new C460810I5f(null, C460530I4d.LIZ, null, 55));
                    }
                } else if (interfaceC327250CsF instanceof C327240CsE) {
                    C23250099c.LIZLLL(this, null, null, new C06ZZ(c869590Y9l, "unavailable", null, null), 3);
                    c460810I5fLIZJ = LIZJ();
                } else {
                    throw new C1954807lC();
                }
                return new C0I3O(c460810I5fLIZJ);
            }
            return C0I3M.LIZ;
        }
        return C0I3M.LIZ;
    }

    public static C460810I5f LIZIZ(QuotedTikTokLinkPreview quotedTikTokLinkPreview, String str) {
        EnumC460760I5a enumC460760I5a;
        C460510I4b c460510I4b = C460510I4b.LIZ;
        UrlModel urlModelLIZ = C0I3J.LIZ(Collections.singletonList(quotedTikTokLinkPreview.refVideoUrl));
        Integer numValueOf = Integer.valueOf(R.drawable.c_l);
        String str2 = quotedTikTokLinkPreview.refAvatarUid;
        UrlModel urlModelLIZ2 = C0I3J.LIZ(Collections.singletonList(quotedTikTokLinkPreview.refAvatarUrl));
        String str3 = quotedTikTokLinkPreview.refAuthorUserName;
        if (quotedTikTokLinkPreview.isStory) {
            enumC460760I5a = EnumC460760I5a.STORY;
        } else {
            enumC460760I5a = EnumC460760I5a.NONE;
        }
        C460970I5v c460970I5v = new C460970I5v(urlModelLIZ, numValueOf, str2, urlModelLIZ2, str3, enumC460760I5a);
        final C0I5R c0i5r = new C0I5R(quotedTikTokLinkPreview.refVideoId, str, Boolean.FALSE);
        return new C460810I5f(c460510I4b, c460970I5v, new AbstractC455680Htu(c0i5r) { // from class: X.0I49
            public final C0I5R LIZJ;
            public final int LIZLLL;
            public final long LJ;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0I49)) {
                    return false;
                }
                C0I49 c0i49 = (C0I49) obj;
                return Intrinsics.LJFF(this.LIZJ, c0i49.LIZJ) && this.LIZLLL == c0i49.LIZLLL && this.LJ == c0i49.LJ;
            }

            public final int hashCode() {
                return (((this.LIZJ.hashCode() * 31) + this.LIZLLL) * 31) + C786410Ut5.Y2(this.LJ);
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("QuotedPreviewClick(quotedVideoData=");
                sbLIZ.append(this.LIZJ);
                sbLIZ.append(", refVideoAwemeType=");
                sbLIZ.append(this.LIZLLL);
                sbLIZ.append(", refMsgId=");
                sbLIZ.append(this.LJ);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            {
                super(-1L, Long.valueOf(1809));
                this.LIZJ = c0i5r;
                this.LIZLLL = 1809;
                this.LJ = -1L;
            }

            @Override // X.AbstractC455680Htu
            public final void LIZ(View view, MessageListQuotedMessageClickAbility messageListQuotedMessageClickAbility) {
                messageListQuotedMessageClickAbility.wz0(this.LJ, this.LIZIZ, view.getContext(), this.LIZLLL, this.LIZJ);
            }
        }, 35);
    }
}
