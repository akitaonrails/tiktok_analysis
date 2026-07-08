package X;

import android.content.Context;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.im.core.proto.ReferenceInfo;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.contacts.api.service.IIMContactUtilService;
import com.ss.android.ugc.aweme.im.message.content.BaseContent;
import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.ShareRepostCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.AttachmentComponent;
import com.ss.android.ugc.aweme.im.message.template.component.AttachmentTypeComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseUserComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ShareRepostComponent;
import com.ss.android.ugc.aweme.im.messagelist.api.IAwemeStatusViewModel;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0I5O, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0I5O implements InterfaceC460500I4a, InterfaceC497601wk {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZLL;
    public final Context LL;
    public final C01GW<IAwemeStatusViewModel> LLILLJJLI;
    public final boolean LLILLL;
    public final AbstractC2252651DEx LLILZ;
    public volatile C1598406Nq LLILZIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0I5O.class, "ttDispatcher", "getTtDispatcher()Lcom/ss/android/ugc/aweme/im/saas/host/api/utils/IMDispatchers;", 0);
        C13LE.LIZ.getClass();
        LLILZLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC497601wk
    public final CoroutineContext getCoroutineContext() {
        return this.LLILZ;
    }

    @Override // X.C0I4V
    public final C0I3K<C460810I5f> LIZ(C869590Y9l c869590Y9l) {
        AttachmentComponent attachmentComponentHs;
        final UrlModel refVideoCoverUrl;
        C460810I5f c460810I5fLIZLLL;
        BaseTemplate baseTemplateLIZ = C0Z2Z.LIZ(c869590Y9l, BaseTemplate.class);
        Long l = null;
        if (baseTemplateLIZ != null && (attachmentComponentHs = baseTemplateLIZ.Hs()) != null && attachmentComponentHs.id.length() != 0) {
            BaseContent.ReferenceVideo referenceVideoLIZIZ = C0ZDR.LIZIZ(attachmentComponentHs);
            String refVideoId = referenceVideoLIZIZ.getRefVideoId();
            if (refVideoId == null || (refVideoCoverUrl = C1336205Ku.LIZ(false).getAwemeFetchManager().LJ(refVideoId)) == null) {
                refVideoCoverUrl = referenceVideoLIZIZ.getRefVideoCoverUrl();
            }
            IAwemeStatusViewModel value = this.LLILLJJLI.getValue();
            if (refVideoId != null && refVideoCoverUrl != null) {
                Object value2 = value.vQ2(refVideoId).getValue();
                String str = "available";
                if (value2 instanceof C327270CsH) {
                    LJ(c869590Y9l, "available");
                    C0I4Y<InterfaceC460300I3g> c0i4yLIZJ = LIZJ(c869590Y9l, referenceVideoLIZIZ, attachmentComponentHs.type);
                    final boolean z = this.LLILLL;
                    final C1233704sB c1233704sB = new C1233704sB(2131831883, (List<String>) null);
                    c460810I5fLIZLLL = new C460810I5f(c0i4yLIZJ, new C460380I3o(refVideoCoverUrl, z, c1233704sB) { // from class: X.0I3s
                        public final UrlModel LJIJ;
                        public final boolean LJIJI;
                        public final InterfaceC460300I3g LJIJJ;

                        public final boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            if (!(obj instanceof C460420I3s)) {
                                return false;
                            }
                            C460420I3s c460420I3s = (C460420I3s) obj;
                            return Intrinsics.LJFF(this.LJIJ, c460420I3s.LJIJ) && this.LJIJI == c460420I3s.LJIJI && Intrinsics.LJFF(this.LJIJJ, c460420I3s.LJIJJ);
                        }

                        public final int hashCode() {
                            return (((this.LJIJ.hashCode() * 31) + C786410Ut5.Z2(this.LJIJI)) * 31) + this.LJIJJ.hashCode();
                        }

                        public final String toString() {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("QuoteContentFromAttachmentThumbnail(url=");
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
                    }, LIZIZ(c869590Y9l, referenceVideoLIZIZ, attachmentComponentHs.type), 35);
                } else if (Intrinsics.LJFF(value2, C327260CsG.LIZ)) {
                    String str2 = c869590Y9l.getLocalExt().get("ref_attachment_state");
                    if (str2 != null) {
                        str = str2;
                    }
                    if (Intrinsics.LJFF(str, "unavailable")) {
                        c460810I5fLIZLLL = LIZLLL(c869590Y9l, referenceVideoLIZIZ, attachmentComponentHs);
                    } else {
                        C0I4Y<InterfaceC460300I3g> c0i4yLIZJ2 = LIZJ(c869590Y9l, referenceVideoLIZIZ, attachmentComponentHs.type);
                        final boolean z2 = this.LLILLL;
                        final C1233704sB c1233704sB2 = new C1233704sB(2131831883, (List<String>) null);
                        c460810I5fLIZLLL = new C460810I5f(c0i4yLIZJ2, new C460380I3o(refVideoCoverUrl, z2, c1233704sB2) { // from class: X.0I3s
                            public final UrlModel LJIJ;
                            public final boolean LJIJI;
                            public final InterfaceC460300I3g LJIJJ;

                            public final boolean equals(Object obj) {
                                if (this == obj) {
                                    return true;
                                }
                                if (!(obj instanceof C460420I3s)) {
                                    return false;
                                }
                                C460420I3s c460420I3s = (C460420I3s) obj;
                                return Intrinsics.LJFF(this.LJIJ, c460420I3s.LJIJ) && this.LJIJI == c460420I3s.LJIJI && Intrinsics.LJFF(this.LJIJJ, c460420I3s.LJIJJ);
                            }

                            public final int hashCode() {
                                return (((this.LJIJ.hashCode() * 31) + C786410Ut5.Z2(this.LJIJI)) * 31) + this.LJIJJ.hashCode();
                            }

                            public final String toString() {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("QuoteContentFromAttachmentThumbnail(url=");
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
                                super(refVideoCoverUrl, z2, c1233704sB2, null, 8);
                                this.LJIJ = refVideoCoverUrl;
                                this.LJIJI = z2;
                                this.LJIJJ = c1233704sB2;
                            }
                        }, LIZIZ(c869590Y9l, referenceVideoLIZIZ, attachmentComponentHs.type), 35);
                    }
                } else if (value2 instanceof C327240CsE) {
                    LJ(c869590Y9l, "unavailable");
                    c460810I5fLIZLLL = LIZLLL(c869590Y9l, referenceVideoLIZIZ, attachmentComponentHs);
                } else {
                    throw new C1954807lC();
                }
                return new C0I3O(c460810I5fLIZLLL);
            }
            C0I4Y<InterfaceC460300I3g> c0i4yLIZJ3 = LIZJ(c869590Y9l, referenceVideoLIZIZ, attachmentComponentHs.type);
            C460460I3w mediaUIState = EnumC460370I3n.VIDEO.toMediaUIState();
            long refMsgId = c869590Y9l.getRefMsgId();
            ReferenceInfo referenceInfo = c869590Y9l.getReferenceInfo();
            if (referenceInfo != null) {
                l = referenceInfo.ref_message_type;
            }
            return new C0I3O(new C460810I5f(c0i4yLIZJ3, mediaUIState, new C0I3R(refMsgId, l), 35));
        }
        return C0I3M.LIZ;
    }

    public static final void LJ(C869590Y9l c869590Y9l, String str) {
        if (Intrinsics.LJFF(c869590Y9l.getLocalExt().get("ref_attachment_state"), str)) {
            return;
        }
        c869590Y9l.getLocalExt().put("ref_attachment_state", str);
        C0YNY.LIZ(InterfaceC874680YTa.LIZ).LIZIZ().LJFF(Collections.singletonList(new Pair(c869590Y9l, C2097908Jt.LIZJ(new Pair("ref_attachment_state", new C0Y3R(str))))), false, new C0Y3I("Update latest flag for QuoteContentFromAttachmentLogicHandler"));
    }

    public C0I5O(Context context, AssemVMLazy assemVMLazy, boolean z) {
        this.LL = context;
        this.LLILLJJLI = assemVMLazy;
        this.LLILLL = z;
        C1598406Nq c1598406Nq = this.LLILZIL;
        if (c1598406Nq == null) {
            synchronized (this) {
                c1598406Nq = this.LLILZIL;
                if (c1598406Nq == null) {
                    c1598406Nq = (C1598406Nq) C1807670x8n.LLLLLJIL();
                    this.LLILZIL = c1598406Nq;
                }
            }
        }
        this.LLILZ = c1598406Nq.LIZ;
    }

    public static AbstractC455680Htu LIZIZ(C869590Y9l c869590Y9l, BaseContent.ReferenceVideo referenceVideo, AttachmentTypeComponent attachmentTypeComponent) {
        String str;
        String string;
        ShareRepostComponent shareRepostComponent;
        BaseUserComponent baseUserComponent;
        Long l;
        AttachmentComponent attachmentComponent;
        if (attachmentTypeComponent == AttachmentTypeComponent.ATTACHMENT_TYPE_SHARE_COMMENT_MENTION) {
            return new C0I4F(new C0I5R(Boolean.valueOf(referenceVideo.getRefVideoIsStory()), referenceVideo.getRefVideoId(), String.valueOf(c869590Y9l.getSender()), c869590Y9l.getScene(), false), c869590Y9l.getMsgId(), Long.valueOf(c869590Y9l.getMsgType()));
        }
        if (c869590Y9l.getMsgType() == 1817) {
            ShareRepostCardTemplate shareRepostCardTemplate = (ShareRepostCardTemplate) C0Z2Z.LIZ(c869590Y9l, ShareRepostCardTemplate.class);
            if (shareRepostCardTemplate != null && (attachmentComponent = shareRepostCardTemplate.attachment) != null) {
                str = attachmentComponent.id;
            } else {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            if (shareRepostCardTemplate == null || (shareRepostComponent = shareRepostCardTemplate.shareRepost) == null || (baseUserComponent = shareRepostComponent.repostUserInfo) == null || (l = baseUserComponent.userId) == null || (string = l.toString()) == null) {
                string = "";
            }
            return new C0I46(str, string, c869590Y9l, c869590Y9l.getMsgId(), Long.valueOf(c869590Y9l.getMsgType()));
        }
        if (C0I5Y.LIZIZ(c869590Y9l)) {
            return new C0I41(referenceVideo.getRefVideoId(), c869590Y9l.getRefMsgId(), C0ZDX.LJ(c869590Y9l));
        }
        return new C0I4A(new C0I5R(referenceVideo.getRefVideoId(), String.valueOf(c869590Y9l.getSender()), Boolean.valueOf(referenceVideo.getRefVideoIsStory())), referenceVideo.getRefVideoAwemeType(), c869590Y9l.getRefMsgId());
    }

    public final C0I4Y<InterfaceC460300I3g> LIZJ(C869590Y9l c869590Y9l, BaseContent.ReferenceVideo referenceVideo, AttachmentTypeComponent attachmentTypeComponent) {
        String strLJIIJ;
        if (attachmentTypeComponent == AttachmentTypeComponent.ATTACHMENT_TYPE_SHARE_COMMENT_MENTION) {
            return C460510I4b.LIZ;
        }
        if (attachmentTypeComponent == AttachmentTypeComponent.ATTACHMENT_TYPE_REPLY_REPOST) {
            String nickName = null;
            if (C0ZDX.LJJJJIZL(c869590Y9l)) {
                long jLJII = C0YNP.LJII(c869590Y9l.getConversationId());
                IMContactApi.LIZ.getClass();
                C1BGS c1bgsLJ = C069P.LIZ().LJ();
                String strValueOf = String.valueOf(jLJII);
                IIMContactUtilService.LIZ.getClass();
                IIMContactUtilService iIMContactUtilServiceLIZ = C913380ZsO.LIZ();
                if (iIMContactUtilServiceLIZ != null) {
                    strLJIIJ = iIMContactUtilServiceLIZ.LJIIJ(c869590Y9l.getConversationId());
                } else {
                    strLJIIJ = null;
                }
                IMUser iMUserLIZLLL = c1bgsLJ.LIZLLL(strValueOf, strLJIIJ, "im_chat_repost_msg");
                if (iMUserLIZLLL != null) {
                    nickName = iMUserLIZLLL.getNickName();
                }
                String strLIZ = C454780HsS.LIZ(nickName);
                if (strLIZ == null) {
                    strLIZ = "";
                }
                return new C0I3V(new C1233704sB(2131831991, (List<String>) Collections.singletonList(strLIZ)));
            }
            return new C0I3V(new C1233704sB(2131831992, (List<String>) null));
        }
        return C460710I4v.LIZJ(referenceVideo.getRefVideoIsStory(), C460710I4v.LIZ(c869590Y9l), c869590Y9l, this.LL);
    }

    public final C460810I5f LIZLLL(C869590Y9l c869590Y9l, BaseContent.ReferenceVideo referenceVideo, AttachmentComponent attachmentComponent) {
        int i;
        if (referenceVideo.getRefVideoIsStory()) {
            i = 2131831103;
        } else {
            i = 2131831104;
        }
        C0I4Y<InterfaceC460300I3g> c0i4yLIZJ = LIZJ(c869590Y9l, referenceVideo, attachmentComponent.type);
        Long l = null;
        final C1233704sB c1233704sB = new C1233704sB(i, (List<String>) null);
        AbstractC1236404sc abstractC1236404sc = new AbstractC1236404sc(c1233704sB) { // from class: X.04sI
            public final InterfaceC460300I3g LIZIZ;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1234404sI) && Intrinsics.LJFF(this.LIZIZ, ((C1234404sI) obj).LIZIZ);
            }

            public final int hashCode() {
                return this.LIZIZ.hashCode();
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("QuoteContentFromAttachmentText(data=");
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
        }
        return new C460810I5f(c0i4yLIZJ, abstractC1236404sc, new C0I3R(refMsgId, l), 35);
    }
}
