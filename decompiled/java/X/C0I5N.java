package X;

import android.content.Context;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.message.content.BaseContent;
import com.ss.android.ugc.aweme.im.message.content.CommentContent;
import com.ss.android.ugc.aweme.im.message.content.adapter.BaseContentParserKt;
import com.ss.android.ugc.aweme.im.messagelist.api.IAwemeStatusViewModel;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0I5N, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0I5N implements InterfaceC460500I4a, InterfaceC497601wk {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZLL;
    public final Context LL;
    public final C01GW<IAwemeStatusViewModel> LLILLJJLI;
    public final boolean LLILLL;
    public final AbstractC2252651DEx LLILZ;
    public volatile C1598406Nq LLILZIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0I5N.class, "ttDispatcher", "getTtDispatcher()Lcom/ss/android/ugc/aweme/im/saas/host/api/utils/IMDispatchers;", 0);
        C13LE.LIZ.getClass();
        LLILZLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC497601wk
    public final CoroutineContext getCoroutineContext() {
        return this.LLILZ;
    }

    @Override // X.C0I4V
    public final C0I3K<C460810I5f> LIZ(C869590Y9l c869590Y9l) {
        C460810I5f c460810I5fLIZIZ;
        C0I40 c0i4a;
        C0I40 c0i4a2;
        C0I40 c0i4a3;
        BaseContent.ReferenceVideo referenceVideo = BaseContentParserKt.getReferenceVideo(c869590Y9l);
        if (referenceVideo == null) {
            return C0I3M.LIZ;
        }
        String refVideoId = referenceVideo.getRefVideoId();
        if (refVideoId == null) {
            return C0I3M.LIZ;
        }
        C0I5R c0i5r = new C0I5R(refVideoId, String.valueOf(c869590Y9l.getSender()), Boolean.valueOf(referenceVideo.getRefVideoIsStory()));
        final UrlModel urlModelLJ = C1336205Ku.LIZ(false).getAwemeFetchManager().LJ(refVideoId);
        if (urlModelLJ == null) {
            urlModelLJ = referenceVideo.getRefVideoCoverUrl();
        }
        if (urlModelLJ == null) {
            C0I4Y<InterfaceC460300I3g> c0i4yLIZJ = C460710I4v.LIZJ(referenceVideo.getRefVideoIsStory(), C460710I4v.LIZ(c869590Y9l), c869590Y9l, this.LL);
            C460460I3w mediaUIState = EnumC460370I3n.VIDEO.toMediaUIState();
            if (C0I5Y.LIZIZ(c869590Y9l)) {
                c0i4a3 = new C0I41(refVideoId, c869590Y9l.getRefMsgId(), C0ZDX.LJ(c869590Y9l));
            } else if (c869590Y9l.getMsgType() == 40) {
                CommentContent commentContent = (CommentContent) BaseContentParserKt.getOrParseJsonContent(c869590Y9l, CommentContent.class);
                if (commentContent == null) {
                    return C0I3M.LIZ;
                }
                c0i4a3 = new C0I45(c869590Y9l, commentContent, Long.valueOf(c869590Y9l.getMsgType()));
            } else {
                c0i4a3 = new C0I4A(c0i5r, referenceVideo.getRefVideoAwemeType(), c869590Y9l.getRefMsgId());
            }
            return new C0I3O(new C460810I5f(c0i4yLIZJ, mediaUIState, c0i4a3, 35));
        }
        Object value = this.LLILLJJLI.getValue().vQ2(refVideoId).getValue();
        String str = "available";
        if (value instanceof C327270CsH) {
            LIZJ(c869590Y9l, "available");
            C0I4Y<InterfaceC460300I3g> c0i4yLIZJ2 = C460710I4v.LIZJ(referenceVideo.getRefVideoIsStory(), C460710I4v.LIZ(c869590Y9l), c869590Y9l, this.LL);
            final boolean z = this.LLILLL;
            final C1233704sB c1233704sB = new C1233704sB(2131831883, (List<String>) null);
            C460380I3o c460380I3o = new C460380I3o(urlModelLJ, z, c1233704sB) { // from class: X.0I3q
                public final UrlModel LJIJ;
                public final boolean LJIJI;
                public final InterfaceC460300I3g LJIJJ;

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C460400I3q)) {
                        return false;
                    }
                    C460400I3q c460400I3q = (C460400I3q) obj;
                    return Intrinsics.LJFF(this.LJIJ, c460400I3q.LJIJ) && this.LJIJI == c460400I3q.LJIJI && Intrinsics.LJFF(this.LJIJJ, c460400I3q.LJIJJ);
                }

                public final int hashCode() {
                    return (((this.LJIJ.hashCode() * 31) + C786410Ut5.Z2(this.LJIJI)) * 31) + this.LJIJJ.hashCode();
                }

                public final String toString() {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("RefVideoQCThumbnail(url=");
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
                    super(urlModelLJ, z, c1233704sB, null, 8);
                    this.LJIJ = urlModelLJ;
                    this.LJIJI = z;
                    this.LJIJJ = c1233704sB;
                }
            };
            if (C0I5Y.LIZIZ(c869590Y9l)) {
                c0i4a2 = new C0I41(refVideoId, c869590Y9l.getRefMsgId(), C0ZDX.LJ(c869590Y9l));
            } else if (c869590Y9l.getMsgType() == 40) {
                CommentContent commentContent2 = (CommentContent) BaseContentParserKt.getOrParseJsonContent(c869590Y9l, CommentContent.class);
                if (commentContent2 == null) {
                    return C0I3M.LIZ;
                }
                c0i4a2 = new C0I45(c869590Y9l, commentContent2, Long.valueOf(c869590Y9l.getMsgType()));
            } else {
                c0i4a2 = new C0I4A(new C0I5R(refVideoId, String.valueOf(c869590Y9l.getSender()), Boolean.valueOf(referenceVideo.getRefVideoIsStory())), referenceVideo.getRefVideoAwemeType(), c869590Y9l.getRefMsgId());
            }
            c460810I5fLIZIZ = new C460810I5f(c0i4yLIZJ2, c460380I3o, c0i4a2, 35);
        } else if (Intrinsics.LJFF(value, C327260CsG.LIZ)) {
            String str2 = c869590Y9l.getLocalExt().get("ref_video_state");
            if (str2 != null) {
                str = str2;
            }
            if (Intrinsics.LJFF(str, "unavailable")) {
                c460810I5fLIZIZ = LIZIZ(c869590Y9l, referenceVideo);
            } else {
                C0I4Y<InterfaceC460300I3g> c0i4yLIZJ3 = C460710I4v.LIZJ(referenceVideo.getRefVideoIsStory(), C460710I4v.LIZ(c869590Y9l), c869590Y9l, this.LL);
                final boolean z2 = this.LLILLL;
                final C1233704sB c1233704sB2 = new C1233704sB(2131831883, (List<String>) null);
                C460380I3o c460380I3o2 = new C460380I3o(urlModelLJ, z2, c1233704sB2) { // from class: X.0I3q
                    public final UrlModel LJIJ;
                    public final boolean LJIJI;
                    public final InterfaceC460300I3g LJIJJ;

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof C460400I3q)) {
                            return false;
                        }
                        C460400I3q c460400I3q = (C460400I3q) obj;
                        return Intrinsics.LJFF(this.LJIJ, c460400I3q.LJIJ) && this.LJIJI == c460400I3q.LJIJI && Intrinsics.LJFF(this.LJIJJ, c460400I3q.LJIJJ);
                    }

                    public final int hashCode() {
                        return (((this.LJIJ.hashCode() * 31) + C786410Ut5.Z2(this.LJIJI)) * 31) + this.LJIJJ.hashCode();
                    }

                    public final String toString() {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("RefVideoQCThumbnail(url=");
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
                        super(urlModelLJ, z2, c1233704sB2, null, 8);
                        this.LJIJ = urlModelLJ;
                        this.LJIJI = z2;
                        this.LJIJJ = c1233704sB2;
                    }
                };
                if (C0I5Y.LIZIZ(c869590Y9l)) {
                    c0i4a = new C0I41(refVideoId, c869590Y9l.getRefMsgId(), C0ZDX.LJ(c869590Y9l));
                } else if (c869590Y9l.getMsgType() == 40) {
                    CommentContent commentContent3 = (CommentContent) BaseContentParserKt.getOrParseJsonContent(c869590Y9l, CommentContent.class);
                    if (commentContent3 == null) {
                        return C0I3M.LIZ;
                    }
                    c0i4a = new C0I45(c869590Y9l, commentContent3, Long.valueOf(c869590Y9l.getMsgType()));
                } else {
                    c0i4a = new C0I4A(new C0I5R(refVideoId, String.valueOf(c869590Y9l.getSender()), Boolean.valueOf(referenceVideo.getRefVideoIsStory())), referenceVideo.getRefVideoAwemeType(), c869590Y9l.getRefMsgId());
                }
                c460810I5fLIZIZ = new C460810I5f(c0i4yLIZJ3, c460380I3o2, c0i4a, 35);
            }
        } else if (value instanceof C327240CsE) {
            LIZJ(c869590Y9l, "unavailable");
            c460810I5fLIZIZ = LIZIZ(c869590Y9l, referenceVideo);
        } else {
            throw new C1954807lC();
        }
        return new C0I3O(c460810I5fLIZIZ);
    }

    public static final void LIZJ(C869590Y9l c869590Y9l, String str) {
        if (Intrinsics.LJFF(c869590Y9l.getLocalExt().get("ref_video_state"), str)) {
            return;
        }
        c869590Y9l.getLocalExt().put("ref_video_state", str);
        C0YNY.LIZ(InterfaceC874680YTa.LIZ).LIZIZ().LJFF(Collections.singletonList(new Pair(c869590Y9l, C2097908Jt.LIZJ(new Pair("ref_video_state", new C0Y3R(str))))), false, new C0Y3I("Update latest flag for RefVideoQCLogicHandler"));
    }

    public final C460810I5f LIZIZ(C869590Y9l c869590Y9l, BaseContent.ReferenceVideo referenceVideo) {
        int i;
        if (referenceVideo.getRefVideoIsStory()) {
            i = 2131831103;
        } else {
            i = 2131831104;
        }
        if (c869590Y9l.getMsgType() != 40) {
            C0I4Y<InterfaceC460300I3g> c0i4yLIZJ = C460710I4v.LIZJ(referenceVideo.getRefVideoIsStory(), C460710I4v.LIZ(c869590Y9l), c869590Y9l, this.LL);
            final C1233704sB c1233704sB = new C1233704sB(i, (List<String>) null);
            return new C460810I5f(c0i4yLIZJ, new AbstractC1236404sc(c1233704sB) { // from class: X.04sE
                public final InterfaceC460300I3g LIZIZ;

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C1234004sE) && Intrinsics.LJFF(this.LIZIZ, ((C1234004sE) obj).LIZIZ);
                }

                public final int hashCode() {
                    return this.LIZIZ.hashCode();
                }

                public final String toString() {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("RefVideoQCText(data=");
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
        return new C460810I5f(null, null, null, 63);
    }

    public C0I5N(Context context, AssemVMLazy assemVMLazy, boolean z) {
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
}
