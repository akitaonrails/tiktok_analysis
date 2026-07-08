package Y;

import X.C08E7;
import X.C09AJ;
import X.C09JN;
import X.C0O8X;
import X.C1344030l4z;
import X.C1350920lG6;
import X.C1356840lPe;
import X.C1357010lPv;
import X.C1371430lnB;
import X.C1375980luW;
import X.C1387490mD5;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C1498560p6E;
import X.C1606010rtX;
import X.C189200o6;
import X.C1C7U;
import X.C2188811AlT;
import X.C729980SkG;
import X.C736360SuY;
import X.C844470XAv;
import X.C985403tE;
import X.EnumC1606080rte;
import X.EnumC1615506Uf;
import X.InterfaceC1369790lkX;
import X.InterfaceC20236714Gf;
import android.content.Context;
import android.util.LruCache;
import com.ss.android.ugc.aweme.base.share.ShareInfo;
import com.ss.android.ugc.aweme.comment.likelist.model.LikeListResponse;
import com.ss.android.ugc.aweme.comment.likelist.viewmodel.LikeListVM;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.share.business.tcm.CheckTCMOrderDeleteStatusResp;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS210S0300000_1;
import kotlin.jvm.internal.AwS52S1300000_12;
import kotlin.jvm.internal.AwS600S0100000_21;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: loaded from: classes22.dex */
public class AfS37S1300000_21 implements C09JN {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

    @Override // X.C09JN
    public final void accept(Object obj) throws JSONException {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
            case 3:
                accept$3(this, obj);
                break;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void accept$0(AfS37S1300000_21 afS37S1300000_21, Object obj) throws JSONException {
        LikeListResponse likeListResponseCopy;
        long size;
        C1C7U.LIZ("LikeListVM@4800.request$2");
        LikeListResponse likeListResponse = (LikeListResponse) obj;
        LikeListVM likeListVM = (LikeListVM) afS37S1300000_21.l1;
        likeListVM.LLJIJIL.LIZ();
        likeListVM.LLJIJIL.LIZLLL(likeListResponse);
        likeListVM.LLJIJIL.LJFF();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("request success: req:");
        sbLIZ.append((C1357010lPv) afS37S1300000_21.l2);
        sbLIZ.append(", resp:");
        sbLIZ.append(likeListResponse);
        C1344030l4z.LIZJ("LikeListVM", C2188811AlT.LIZIZ(sbLIZ));
        ((LruCache) ((LikeListVM) afS37S1300000_21.l1).LLILLL.getValue()).put(afS37S1300000_21.s0, Boolean.FALSE);
        C1606010rtX.LIZIZ.LIZJ(EnumC1615506Uf.STORY, EnumC1606080rte.COMMENT, likeListResponse.getLikeList(), AFwS259S0000000_21.get$arr$(318));
        C1350920lG6.LJIJI("normal_video", "like_list", likeListResponse.getLikeList(), (Set) ((LikeListVM) afS37S1300000_21.l1).LLJILJILJ.getValue());
        C09AJ c09aj = (C09AJ) afS37S1300000_21.l3;
        if (c09aj != null) {
            LikeListVM likeListVM2 = (LikeListVM) afS37S1300000_21.l1;
            C1357010lPv c1357010lPv = (C1357010lPv) afS37S1300000_21.l2;
            LikeListResponse likeListResponse2 = (LikeListResponse) ((LruCache) likeListVM2.LLILZ.getValue()).get(c1357010lPv.LIZ);
            if (likeListResponse2 != null && !c1357010lPv.LIZIZ) {
                ArrayList arrayList = new ArrayList();
                List<User> likeList = likeListResponse2.getLikeList();
                if (likeList != null) {
                    arrayList.addAll(likeList);
                }
                List<User> likeList2 = likeListResponse.getLikeList();
                if (likeList2 != null) {
                    arrayList.addAll(likeList2);
                }
                likeListResponseCopy = likeListResponse.copy(likeListResponse.hasMore, likeListResponse.cursor, likeListResponse.offset, arrayList, likeListResponse.isShowLimit, likeListResponse.LL);
            } else {
                likeListResponseCopy = likeListResponse.copy(likeListResponse.hasMore, likeListResponse.cursor, likeListResponse.offset, C1356840lPe.LIZJ(c1357010lPv.LIZ, likeListResponse.getLikeList()), likeListResponse.isShowLimit, likeListResponse.LL);
            }
            ((LruCache) likeListVM2.LLILZ.getValue()).put(c1357010lPv.LIZ, likeListResponseCopy);
            if (c1357010lPv.LIZIZ && !likeListResponse.getHasMore()) {
                List<User> likeList3 = likeListResponse.getLikeList();
                if (likeList3 != null) {
                    size = likeList3.size();
                } else {
                    size = 0;
                }
                Long l = likeListVM2.wQ2().get(c1357010lPv.LIZ);
                if (l == null || size != l.longValue()) {
                    likeListVM2.wQ2().put(c1357010lPv.LIZ, Long.valueOf(size));
                    C1356840lPe.LIZIZ(c1357010lPv.LIZ, size, likeListResponse);
                }
            }
            C08E7.LIZ(c09aj, likeListResponseCopy);
        }
        C1C7U.LIZIZ("LikeListVM@4800.request$2");
    }

    public static final void accept$1(AfS37S1300000_21 afS37S1300000_21, Object obj) {
        C1C7U.LIZ("LikeListVM@4800.request$3");
        Throwable th = (Throwable) obj;
        ((LruCache) ((LikeListVM) afS37S1300000_21.l1).LLILLL.getValue()).put(afS37S1300000_21.s0, Boolean.FALSE);
        C09AJ c09aj = (C09AJ) afS37S1300000_21.l2;
        if (c09aj != null && !c09aj.isDisposed()) {
            c09aj.onError(th);
        }
        C0O8X c0o8x = ((LikeListVM) afS37S1300000_21.l1).LLJIJIL;
        C844470XAv.LIZ.getClass();
        c0o8x.LJI(C1498560p6E.LIZ(C844470XAv.LIZ(), th));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("request error, req:");
        sbLIZ.append((C1357010lPv) afS37S1300000_21.l3);
        C1344030l4z.LIZIZ("LikeListVM", C2188811AlT.LIZIZ(sbLIZ), th);
        C1C7U.LIZIZ("LikeListVM@4800.request$3");
    }

    public static final void accept$2(AfS37S1300000_21 afS37S1300000_21, Object obj) {
        C1371430lnB c1371430lnB;
        String shareTitle;
        C1C7U.LIZ("ShareLinkServiceImpl@e626.getPersonalLink$2$disposable$1");
        String str = (String) obj;
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) afS37S1300000_21.l1;
        if (Intrinsics.LJFF(((InterfaceC1369790lkX) afS37S1300000_21.l2).key(), "email")) {
            ShareInfo shareInfo = ((User) afS37S1300000_21.l3).getShareInfo();
            if (shareInfo != null) {
                shareTitle = shareInfo.getShareTitle();
            } else {
                shareTitle = null;
            }
            c1371430lnB = new C1371430lnB(str, shareTitle, afS37S1300000_21.s0);
        } else {
            c1371430lnB = new C1371430lnB(str, afS37S1300000_21.s0, 4);
        }
        C189200o6.m2constructorimpl(c1371430lnB);
        interfaceC20236714Gf.resumeWith(c1371430lnB);
        C1C7U.LIZIZ("ShareLinkServiceImpl@e626.getPersonalLink$2$disposable$1");
    }

    public static final void accept$3(AfS37S1300000_21 afS37S1300000_21, Object obj) {
        C1C7U.LIZ("DeleteAction@98c.tryCheckTCMOrderDeleteStatus$result$1");
        CheckTCMOrderDeleteStatusResp checkTCMOrderDeleteStatusResp = (CheckTCMOrderDeleteStatusResp) obj;
        int i = checkTCMOrderDeleteStatusResp.deleteStatus;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        C1397580mTM c1397580mTM = new C1397580mTM((Context) afS37S1300000_21.l2);
                        c1397580mTM.LIZ(2131830550);
                        C985403tE.LIZ(c1397580mTM, new AwS600S0100000_21(checkTCMOrderDeleteStatusResp, 271));
                        new C1397510mTF(c1397580mTM).LIZLLL();
                    }
                } else {
                    C1397580mTM c1397580mTM2 = new C1397580mTM((Context) afS37S1300000_21.l2);
                    c1397580mTM2.LIZ(2131830544);
                    C985403tE.LIZ(c1397580mTM2, new AwS600S0100000_21(checkTCMOrderDeleteStatusResp, 269));
                    new C1397510mTF(c1397580mTM2).LIZLLL();
                }
            } else {
                C1397580mTM c1397580mTM3 = new C1397580mTM((Context) afS37S1300000_21.l2);
                c1397580mTM3.LIZ(2131830551);
                C1375980luW c1375980luW = (C1375980luW) afS37S1300000_21.l3;
                C985403tE.LIZ(c1397580mTM3, new AwS210S0300000_1((Context) afS37S1300000_21.l2, (Aweme) afS37S1300000_21.l1, c1375980luW, 63));
                new C1397510mTF(c1397580mTM3).LIZLLL();
            }
        } else if (C736360SuY.LIZ((Aweme) afS37S1300000_21.l1) && C729980SkG.LJIIIIZZ((Aweme) afS37S1300000_21.l1)) {
            IComplianceBusinessService iComplianceBusinessServiceLJI = ComplianceServiceProvider.LJI();
            Aweme aweme = (Aweme) afS37S1300000_21.l1;
            iComplianceBusinessServiceLJI.LJJJJLL(aweme, new AwS52S1300000_12((Context) afS37S1300000_21.l2, aweme, (C1375980luW) afS37S1300000_21.l3, afS37S1300000_21.s0, 3));
        } else {
            C1387490mD5.LJI((Aweme) afS37S1300000_21.l1);
        }
        C1C7U.LIZIZ("DeleteAction@98c.tryCheckTCMOrderDeleteStatus$result$1");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AfS37S1300000_21(X.C1357010lPv r2, com.ss.android.ugc.aweme.comment.likelist.viewmodel.LikeListVM r3, X.C19482611Ke r4, java.lang.String r5, int r6) {
        /*
            r1 = this;
            r1.$t = r6
            if (r6 == 0) goto L11
            r0 = r1
            r0.l1 = r3
            r0.s0 = r5
            r0.l2 = r4
            r0.l3 = r2
        Ld:
            r0.<init>()
            return
        L11:
            r0 = r1
            r0.l1 = r3
            r0.l2 = r2
            r0.s0 = r5
            r0.l3 = r4
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS37S1300000_21.<init>(X.0lPv, com.ss.android.ugc.aweme.comment.likelist.viewmodel.LikeListVM, X.11Ke, java.lang.String, int):void");
    }

    public AfS37S1300000_21(Object obj, Object obj2, Object obj3, String str, int i) {
        this.$t = i;
        this.l1 = obj2;
        this.l2 = obj;
        this.l3 = obj3;
        this.s0 = str;
    }
}
