package X;

import Y.ACallableS426S0100000_21;
import Y.AfS12S2200000_21;
import Y.AkS468S0100000_3;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.comment.model.CmtAudioStruct;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.translation.model.MultiTranslationResult;
import com.ss.android.ugc.aweme.translation.model.TranslationResult;
import com.ss.android.ugc.aweme.translation.repo.ExtraCommentInfo;
import com.ss.android.ugc.aweme.translation.repo.TranslationContent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lX1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1361410lX1 extends C163A<Comment, C1361470lX7, C1361440lX4> {
    public static final C1361410lX1 LJ = new C1361410lX1();
    public static final C01GW LJFF = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(337));
    public static final CommentService LJI;
    public static Aweme LJII;

    @Override // X.C163A
    public final /* bridge */ /* synthetic */ AbstractC1361510lXB LIZJ() {
        return (AbstractC1361510lXB) LJFF.getValue();
    }

    @Override // X.C163A
    public final String LJFF() {
        return "CommentTranslationRepo";
    }

    static {
        CommentService.LIZ.getClass();
        LJI = C523420Kfs.LIZ();
    }

    public static int LJIILLIIL(Comment comment) {
        if (comment.getCommentType() != 0) {
            return comment.getCommentType();
        }
        String rootCommentId = comment.getRootCommentId();
        if (rootCommentId == null || rootCommentId.length() == 0 || Intrinsics.LJFF(comment.getRootCommentId(), CardStruct.IStatusCode.DEFAULT)) {
            return 1;
        }
        return 2;
    }

    @Override // X.C163A
    public final EnumC207100162g LIZLLL(Comment comment) {
        return EnumC207100162g.COMMENT;
    }

    public static final void LJIJ(String str, List list) {
        for (Object obj : list) {
            C1361410lX1 c1361410lX1 = LJ;
            c1361410lX1.getClass();
            String strLIZIZ = ((AbstractC1361510lXB) LJFF.getValue()).LIZIZ(obj, str);
            c1361410lX1.LIZJ.remove(strLIZIZ);
            C11RK<Boolean> c11rkRemove = c1361410lX1.LIZLLL.remove(strLIZIZ);
            if (c11rkRemove != null) {
                c11rkRemove.onNext(Boolean.FALSE);
                c11rkRemove.onComplete();
            }
        }
    }

    @Override // X.C163A
    public final C11NZ LJII(final String str, final boolean z, final List list) {
        int i;
        String awemeId;
        C11NZ<MultiTranslationResult> c11nzLJFF;
        TranslationContent translationContent;
        boolean z2;
        String desc;
        String descLanguage;
        final String strLLIIZ = C161N.LIZIZ.LLIIZ();
        ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        Iterator it2 = ((ArrayList) list).iterator();
        while (true) {
            i = 0;
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            LJ.getClass();
            if (((AbstractC1361510lXB) LJFF.getValue()).LIZLLL(next, strLLIIZ) == null) {
                arrayList2.add(next);
            }
        }
        List listSubList = arrayList2;
        while (!listSubList.isEmpty()) {
            int iMin = Math.min(listSubList.size(), 100);
            List listSubList2 = listSubList.subList(i, iMin);
            ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(listSubList2, 10));
            Iterator it3 = listSubList2.iterator();
            while (true) {
                awemeId = null;
                List<TextExtraStruct> contentDescExtra = null;
                if (!it3.hasNext()) {
                    break;
                }
                Comment comment = (Comment) it3.next();
                String str2 = "";
                if (C1339540kxk.LIZ(comment)) {
                    Aweme aliasAweme = comment.getAliasAweme();
                    if (aliasAweme != null) {
                        desc = aliasAweme.getDesc();
                    } else {
                        desc = null;
                    }
                    Aweme aliasAweme2 = comment.getAliasAweme();
                    if (aliasAweme2 != null && (descLanguage = aliasAweme2.getDescLanguage()) != null) {
                        str2 = descLanguage;
                    }
                    String cid = comment.getCid();
                    Aweme aliasAweme3 = comment.getAliasAweme();
                    if (aliasAweme3 != null) {
                        contentDescExtra = aliasAweme3.getContentDescExtra();
                    }
                    Long lValueOf = Long.valueOf(comment.getDiggCount());
                    LJ.getClass();
                    int iLJIILLIIL = LJIILLIIL(comment);
                    boolean z3 = true;
                    if (iLJIILLIIL != 1) {
                        z3 = false;
                    }
                    translationContent = new TranslationContent(desc, str2, cid, contentDescExtra, new ExtraCommentInfo(lValueOf, Boolean.valueOf(z3)));
                } else {
                    String text = comment.getText();
                    String commentLanguage = comment.getCommentLanguage();
                    if (commentLanguage != null) {
                        str2 = commentLanguage;
                    }
                    String cid2 = comment.getCid();
                    List<TextExtraStruct> textExtra = comment.getTextExtra();
                    Long lValueOf2 = Long.valueOf(comment.getDiggCount());
                    LJ.getClass();
                    if (LJIILLIIL(comment) == 1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    translationContent = new TranslationContent(text, str2, cid2, textExtra, new ExtraCommentInfo(lValueOf2, Boolean.valueOf(z2)));
                }
                arrayList3.add(translationContent);
            }
            String json = GsonProtectorUtils.toJson(C7740030o.LIZ().getGson(), arrayList3);
            Comment comment2 = (Comment) C13LP.LJJJLL(list);
            if (comment2 != null) {
                awemeId = comment2.getAwemeId();
            }
            try {
                C161O c161oLIZ = C1236630iHl.LIZ();
                if (c161oLIZ == null || (c11nzLJFF = c161oLIZ.LJFF(strLLIIZ, json, awemeId, 2)) == null) {
                    c11nzLJFF = C11IR.LL;
                }
            } catch (ExecutionException e) {
                TryCatchGuardChecker.doCheck(e);
                AbstractC2126608Uu.getCompatibleException(e);
                c11nzLJFF = C11IR.LL;
            }
            arrayList.add(c11nzLJFF.LJL(C11S5.LIZ()).LJJJJZI(new AkS468S0100000_3(listSubList2, 6)));
            listSubList = listSubList.subList(iMin, listSubList.size());
            i = 0;
        }
        final int i2 = 0;
        C11JN c11jnLJJIJIIJI = C11NZ.LJIILJJIL(arrayList).LJJJI(new InterfaceC1487280oo2() { // from class: X.08Le
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                Pair pair = (Pair) obj;
                List list2 = (List) pair.getFirst();
                List<TranslationResult> list3 = ((MultiTranslationResult) pair.getSecond()).results;
                if (list3.size() == list2.size()) {
                    ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(list2, 10));
                    int i3 = 0;
                    for (Object obj2 : list2) {
                        int i4 = i3 + 1;
                        if (i3 >= 0) {
                            arrayList4.add(new Pair(obj2, ListProtector.get(list3, i3)));
                            i3 = i4;
                        } else {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                    }
                    return arrayList4;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Translation Results size ");
                sbLIZ.append(list3.size());
                sbLIZ.append(" and Comment size size ");
                sbLIZ.append(list2.size());
                sbLIZ.append(" does not match");
                throw new IndexOutOfBoundsException(C2188811AlT.LIZIZ(sbLIZ));
            }
        }).LJLJLLL().LJJIJLIJ().LJJJJZI(new InterfaceC1487280oo2() { // from class: X.0lX2
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                Object next2;
                int i3;
                BaseResponse baseResponse;
                boolean z4;
                String text2;
                List<Pair> list2 = (List) obj;
                String str3 = strLLIIZ;
                boolean z5 = z;
                for (Pair pair : list2) {
                    Comment comment3 = (Comment) pair.getFirst();
                    TranslationResult translationResult = (TranslationResult) pair.getSecond();
                    C1361410lX1 c1361410lX1 = C1361410lX1.LJ;
                    c1361410lX1.getClass();
                    String strLIZIZ = ((AbstractC1361510lXB) C1361410lX1.LJFF.getValue()).LIZIZ(comment3, str3);
                    String str4 = translationResult.translatedContent;
                    if (str4 != null) {
                        AbstractC1361510lXB abstractC1361510lXB = (AbstractC1361510lXB) C1361410lX1.LJFF.getValue();
                        if (C1339540kxk.LIZ(comment3)) {
                            Aweme aliasAweme4 = comment3.getAliasAweme();
                            if (aliasAweme4 == null || (text2 = aliasAweme4.getDesc()) == null) {
                                text2 = "";
                            }
                        } else {
                            text2 = comment3.getText();
                        }
                        List list3 = translationResult.textExtra;
                        if (list3 == null) {
                            list3 = C13BV.INSTANCE;
                        }
                        String strLLIIZ2 = C161N.LIZIZ.LLIIZ();
                        String str5 = translationResult.variant;
                        abstractC1361510lXB.getClass();
                        z4 = z5;
                        C1361470lX7 c1361470lX7 = new C1361470lX7(text2, str4, strLLIIZ2, str5, z4, list3);
                        abstractC1361510lXB.LJFF(c1361470lX7, comment3, strLLIIZ2);
                        C01GW<AbstractC1604130rqV> c01gw = C207128163i.LJ;
                        AbstractC1604130rqV abstractC1604130rqVLIZ = C0SZC.LIZ();
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("CommentTranslationRepo");
                        sbLIZ.append(", setCache, aid=");
                        sbLIZ.append(comment3.getAwemeId());
                        sbLIZ.append(", cid=");
                        sbLIZ.append(comment3.getCid());
                        sbLIZ.append(", targetLang=");
                        sbLIZ.append(str3);
                        sbLIZ.append(", key=");
                        sbLIZ.append(((AbstractC1361510lXB) C1361410lX1.LJFF.getValue()).LIZIZ(comment3, str3));
                        sbLIZ.append(", cacheValue=");
                        sbLIZ.append(c1361470lX7);
                        sbLIZ.append('}');
                        abstractC1604130rqVLIZ.LJ(C2188811AlT.LIZIZ(sbLIZ));
                        C11RK<Boolean> c11rkRemove = c1361410lX1.LIZLLL.remove(strLIZIZ);
                        if (c11rkRemove != null) {
                            c11rkRemove.onNext(Boolean.TRUE);
                            c11rkRemove.onComplete();
                            if (Unit.LIZ == null) {
                            }
                        }
                        z5 = z4;
                    } else {
                        z4 = z5;
                    }
                    C11RK<Boolean> c11rkRemove2 = c1361410lX1.LIZLLL.remove(strLIZIZ);
                    if (c11rkRemove2 != null) {
                        c11rkRemove2.onNext(Boolean.FALSE);
                        c11rkRemove2.onComplete();
                    }
                    z5 = z4;
                }
                C1361410lX1 c1361410lX12 = C1361410lX1.LJ;
                Comment comment4 = (Comment) C13LP.LJJJLL(list);
                String str6 = str;
                Iterator it4 = list2.iterator();
                while (true) {
                    if (it4.hasNext()) {
                        next2 = it4.next();
                        if (((Pair) next2).getSecond() != null) {
                            break;
                        }
                    } else {
                        next2 = null;
                        break;
                    }
                }
                Pair pair2 = (Pair) next2;
                if (pair2 != null && (baseResponse = (BaseResponse) pair2.getSecond()) != null) {
                    i3 = baseResponse.status_code;
                } else {
                    i3 = 1;
                }
                c1361410lX12.getClass();
                C1361410lX1.LJIJI(i3, comment4, str6, true);
                return Boolean.TRUE;
            }
        }).LJJIIZ(new InterfaceC781210Ukh(arrayList2, strLLIIZ, i2) { // from class: X.0man
            public final int $t;
            public Object l1;
            public String s0;

            @Override // X.InterfaceC781210Ukh
            public final void run() {
                switch (this.$t) {
                    case 0:
                        run$0(this);
                        break;
                    case 1:
                        run$1(this);
                        break;
                }
            }

            public static final void run$0(C1402190man c1402190man) {
                C1361410lX1.LJIJ(c1402190man.s0, (List) c1402190man.l1);
            }

            public static final void run$1(C1402190man c1402190man) {
                C1361410lX1.LJIJ(c1402190man.s0, (List) c1402190man.l1);
            }

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.$t = i2;
                this.l1 = arrayList2;
                this.s0 = strLLIIZ;
            }
        }).LJJIJIIJI(new AfS12S2200000_21(list, str, arrayList2, strLLIIZ, 0));
        final int i3 = 1;
        AnonymousClass0983 anonymousClass0983LJLLLL = c11jnLJJIJIIJI.LJJIIJZLJL(new InterfaceC781210Ukh(arrayList2, strLLIIZ, i3) { // from class: X.0man
            public final int $t;
            public Object l1;
            public String s0;

            @Override // X.InterfaceC781210Ukh
            public final void run() {
                switch (this.$t) {
                    case 0:
                        run$0(this);
                        break;
                    case 1:
                        run$1(this);
                        break;
                }
            }

            public static final void run$0(C1402190man c1402190man) {
                C1361410lX1.LJIJ(c1402190man.s0, (List) c1402190man.l1);
            }

            public static final void run$1(C1402190man c1402190man) {
                C1361410lX1.LJIJ(c1402190man.s0, (List) c1402190man.l1);
            }

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.$t = i3;
                this.l1 = arrayList2;
                this.s0 = strLLIIZ;
            }
        }).LJJLIIIJJI().LJLLLL();
        for (Object obj : arrayList2) {
            C1361410lX1 c1361410lX1 = LJ;
            c1361410lX1.getClass();
            c1361410lX1.LIZJ.put(((AbstractC1361510lXB) LJFF.getValue()).LIZIZ(obj, strLLIIZ), anonymousClass0983LJLLLL);
        }
        return anonymousClass0983LJLLLL;
    }

    public static void LJIJI(int i, Comment comment, String str, boolean z) {
        int i2;
        int i3;
        String authorUid;
        String asrLang;
        String str2;
        if (comment == null) {
            return;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("group_id", comment.getAwemeId());
        c2344009Gk.LJIIIIZZ("enter_from", str);
        C161N c161n = C161N.LIZIZ;
        c2344009Gk.LJIIIIZZ("target_lang", c161n.LLIIZ());
        int i4 = 1;
        if (C161T.LIZ().LIZ() && c161n.LJIILLIIL(comment, EnumC715680S5m.NOT_OVERWRITTEN)) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        c2344009Gk.LIZJ(i2, "is_auto_translated");
        c2344009Gk.LJIIIIZZ("llm_variant", c161n.LJJLIIIJ().LIZJ(comment));
        if (z) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        c2344009Gk.LIZJ(i3, "is_success");
        Aweme aweme = LJII;
        if (aweme != null) {
            authorUid = AwemeExtKt.getAuthorUid(aweme);
        } else {
            authorUid = null;
        }
        c2344009Gk.LIZJ(C10EU.LJIIZILJ(authorUid) ? 1 : 0, "is_video_author");
        if (!z) {
            c2344009Gk.LIZJ(i, "error_code");
        }
        c2344009Gk.LJFF("translation_element", "text");
        CmtAudioStruct audioStruct = comment.getAudioStruct();
        if (audioStruct == null || (asrLang = audioStruct.getAsrLang()) == null) {
            asrLang = "";
        }
        c2344009Gk.LJFF("subtitle_source_lang", asrLang);
        String strLJJLIIIJJIZ = LJI.LJJLIIIJJIZ(comment);
        if (C123100dR.LIZ(strLJJLIIIJJIZ)) {
            str2 = strLJJLIIIJJIZ;
        } else {
            str2 = "text_comment";
        }
        c2344009Gk.LJFF("message_type", str2);
        if (Intrinsics.LJFF(strLJJLIIIJJIZ, "audio")) {
            c2344009Gk.LJFF("comment_source_lang", "");
        }
        if (comment.getTransBtnStyle() != 2) {
            i4 = 0;
        }
        c2344009Gk.LIZJ(i4, "is_translation_icon_clicked");
        C11NZ.LJJJJI(new ACallableS426S0100000_21(c2344009Gk, 2)).LJL(C11S5.LIZ()).LJJLJ();
    }

    public static void LJIJJ(int i, Comment comment, String str, boolean z) {
        String str2;
        String uid;
        int i2;
        int i3;
        String asrLang;
        String str3;
        if (comment == null) {
            return;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("group_id", comment.getAwemeId());
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("comment_id", comment.getCid());
        int i4 = 1;
        if (LJIILLIIL(comment) == 1) {
            str2 = "original";
        } else if (LJIILLIIL(comment) != 2) {
            str2 = "";
        } else if (C123100dR.LIZ(comment.getReplyToReplyCommentId()) && !Intrinsics.LJFF(comment.getReplyToReplyCommentId(), CardStruct.IStatusCode.DEFAULT)) {
            str2 = "reply_to_reply";
        } else {
            str2 = "reply";
        }
        c2344009Gk.LJIIIIZZ("comment_category", str2);
        User user = comment.getUser();
        String authorUid = null;
        if (user != null) {
            uid = user.getUid();
        } else {
            uid = null;
        }
        c2344009Gk.LJIIIIZZ("comment_author_uid", uid);
        c2344009Gk.LJIIIIZZ("comment_source_lang", comment.getCommentLanguage());
        C161N c161n = C161N.LIZIZ;
        c2344009Gk.LJIIIIZZ("target_lang", c161n.LLIIZ());
        if (C161T.LIZ().LIZ() && c161n.LJIILLIIL(comment, EnumC715680S5m.NOT_OVERWRITTEN)) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        c2344009Gk.LIZJ(i2, "is_auto_translated");
        c2344009Gk.LJIIIIZZ("llm_variant", c161n.LJJLIIIJ().LIZJ(comment));
        if (z) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        c2344009Gk.LIZJ(i3, "is_success");
        Aweme aweme = LJII;
        if (aweme != null) {
            authorUid = AwemeExtKt.getAuthorUid(aweme);
        }
        c2344009Gk.LIZJ(C10EU.LJIIZILJ(authorUid) ? 1 : 0, "is_video_author");
        if (!z) {
            c2344009Gk.LIZJ(i, "error_code");
        }
        c2344009Gk.LJFF("translation_element", "text");
        CmtAudioStruct audioStruct = comment.getAudioStruct();
        if (audioStruct == null || (asrLang = audioStruct.getAsrLang()) == null) {
            asrLang = "";
        }
        c2344009Gk.LJFF("subtitle_source_lang", asrLang);
        String strLJJLIIIJJIZ = LJI.LJJLIIIJJIZ(comment);
        if (C123100dR.LIZ(strLJJLIIIJJIZ)) {
            str3 = strLJJLIIIJJIZ;
        } else {
            str3 = "text_comment";
        }
        c2344009Gk.LJFF("message_type", str3);
        if (Intrinsics.LJFF(strLJJLIIIJJIZ, "audio")) {
            c2344009Gk.LJFF("comment_source_lang", "");
        }
        if (comment.getTransBtnStyle() != 2) {
            i4 = 0;
        }
        c2344009Gk.LIZJ(i4, "is_translation_icon_clicked");
        C11NZ.LJJJJI(new ACallableS426S0100000_21(c2344009Gk, 3)).LJL(C11S5.LIZ()).LJJLJ();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00aa A[Catch: ExecutionException -> 0x00af, TRY_LEAVE, TryCatch #1 {ExecutionException -> 0x00af, blocks: (B:31:0x00a4, B:33:0x00aa), top: B:42:0x00a4 }] */
    @Override // X.C163A
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C11NZ LJIILJJIL(com.ss.android.ugc.aweme.comment.model.Comment r16, final X.C162U r17, final java.lang.String r18, final X.InterfaceC1389740mGi r19, final java.lang.String r20) {
        /*
            r15 = this;
            r10 = r16
            com.ss.android.ugc.aweme.comment.model.Comment r10 = (com.ss.android.ugc.aweme.comment.model.Comment) r10
            boolean r0 = X.C1339540kxk.LIZ(r10)
            r3 = 0
            java.lang.String r6 = ""
            r2 = 1
            if (r0 == 0) goto L69
            com.ss.android.ugc.aweme.translation.repo.TranslationContent r4 = new com.ss.android.ugc.aweme.translation.repo.TranslationContent
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r10.getAliasAweme()
            r8 = 0
            if (r0 == 0) goto L67
            java.lang.String r5 = r0.getDesc()
        L1b:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r10.getAliasAweme()
            if (r0 == 0) goto L28
            java.lang.String r0 = r0.getDescLanguage()
            if (r0 == 0) goto L28
            r6 = r0
        L28:
            java.lang.String r7 = r10.getCid()
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r10.getAliasAweme()
            if (r0 == 0) goto L36
            java.util.List r8 = r0.getContentDescExtra()
        L36:
            com.ss.android.ugc.aweme.translation.repo.ExtraCommentInfo r9 = new com.ss.android.ugc.aweme.translation.repo.ExtraCommentInfo
            int r0 = r10.getDiggCount()
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            int r0 = LJIILLIIL(r10)
            if (r0 != r2) goto L48
            r3 = 1
        L48:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            r9.<init>(r1, r0)
            r4.<init>(r5, r6, r7, r8, r9)
        L52:
            java.util.List r1 = java.util.Collections.singletonList(r4)
            com.ss.android.ugc.aweme.utils.GsonProvider r0 = X.C7740030o.LIZ()
            com.google.gson.Gson r0 = r0.getGson()
            java.lang.String r3 = com.bytedance.mt.protector.impl.GsonProtectorUtils.toJson(r0, r1)
            java.lang.String r2 = r10.getAwemeId()
            goto L9b
        L67:
            r5 = r8
            goto L1b
        L69:
            com.ss.android.ugc.aweme.translation.repo.TranslationContent r4 = new com.ss.android.ugc.aweme.translation.repo.TranslationContent
            java.lang.String r5 = r10.getText()
            java.lang.String r0 = r10.getCommentLanguage()
            if (r0 == 0) goto L76
            r6 = r0
        L76:
            java.lang.String r7 = r10.getCid()
            java.util.List r8 = r10.getTextExtra()
            com.ss.android.ugc.aweme.translation.repo.ExtraCommentInfo r9 = new com.ss.android.ugc.aweme.translation.repo.ExtraCommentInfo
            int r0 = r10.getDiggCount()
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            int r0 = LJIILLIIL(r10)
            if (r0 != r2) goto L90
            r3 = 1
        L90:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            r9.<init>(r1, r0)
            r4.<init>(r5, r6, r7, r8, r9)
            goto L52
        L9b:
            r14 = r18
            X.161O r1 = X.C1236630iHl.LIZ()     // Catch: java.util.concurrent.ExecutionException -> Lad
            if (r1 == 0) goto Laa
            r0 = 2
            X.11NZ r0 = r1.LJFF(r14, r3, r2, r0)     // Catch: java.util.concurrent.ExecutionException -> Laf
            if (r0 != 0) goto Lb8
        Laa:
            X.11IR r0 = X.C11IR.LL     // Catch: java.util.concurrent.ExecutionException -> Laf
            goto Lb8
        Lad:
            r0 = move-exception
            goto Lb0
        Laf:
            r0 = move-exception
        Lb0:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.AbstractC2126608Uu.getCompatibleException(r0)
            X.11IR r0 = X.C11IR.LL
        Lb8:
            X.0lX3 r9 = new X.0lX3
            r13 = r20
            r11 = r19
            r12 = r17
            r9.<init>()
            X.11ON r0 = r0.LJJJJZI(r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1361410lX1.LJIILJJIL(java.lang.Object, X.162U, java.lang.String, X.0mGi, java.lang.String):X.11NZ");
    }
}
