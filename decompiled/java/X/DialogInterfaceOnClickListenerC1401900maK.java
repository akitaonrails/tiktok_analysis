package X;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.comment.commentlist.managementv2.CommentManagementAssemVM;
import com.ss.android.ugc.aweme.comment.commentlist.managementv2.CommentManagementBottomBarAssem;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS2S0602000_21;

/* JADX INFO: renamed from: X.0maK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class DialogInterfaceOnClickListenerC1401900maK implements DialogInterface.OnClickListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.$t) {
            case 0:
                onClick$0(this, dialogInterface, i);
                break;
            case 1:
                onClick$1(this, dialogInterface, i);
                break;
            case 2:
                onClick$2(this, dialogInterface, i);
                break;
            case 3:
                onClick$3(this, dialogInterface, i);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DialogInterfaceOnClickListenerC1401900maK(Object obj, CommentManagementBottomBarAssem commentManagementBottomBarAssem, Map<String, ? extends Comment> map) {
        this.$t = map;
        this.l0 = obj;
        this.l1 = commentManagementBottomBarAssem;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x017e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onClick$0(X.DialogInterfaceOnClickListenerC1401900maK r4, android.content.DialogInterface r5, int r6) {
        /*
            Method dump skipped, instruction units count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DialogInterfaceOnClickListenerC1401900maK.onClick$0(X.0maK, android.content.DialogInterface, int):void");
    }

    public static final void onClick$1(DialogInterfaceOnClickListenerC1401900maK dialogInterfaceOnClickListenerC1401900maK, DialogInterface dialogInterface, int i) {
        InterfaceC1381470m3N interfaceC1381470m3N = (InterfaceC1381470m3N) dialogInterfaceOnClickListenerC1401900maK.l0;
        if (interfaceC1381470m3N != null) {
            interfaceC1381470m3N.LIZ(false);
        }
        C0W79.LIZLLL((Activity) dialogInterfaceOnClickListenerC1401900maK.l1);
    }

    public static final void onClick$2(DialogInterfaceOnClickListenerC1401900maK dialogInterfaceOnClickListenerC1401900maK, DialogInterface dialogInterface, int i) {
        InterfaceC1381470m3N interfaceC1381470m3N = (InterfaceC1381470m3N) dialogInterfaceOnClickListenerC1401900maK.l0;
        if (interfaceC1381470m3N != null) {
            interfaceC1381470m3N.LIZ(true);
        }
        if (C1076010e6h.LIZJ.LJIIJJI((Activity) dialogInterfaceOnClickListenerC1401900maK.l1)) {
            ((Activity) dialogInterfaceOnClickListenerC1401900maK.l1).finish();
        }
    }

    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v8 */
    public static final void onClick$3(DialogInterfaceOnClickListenerC1401900maK dialogInterfaceOnClickListenerC1401900maK, DialogInterface dialogInterface, int i) {
        int i2;
        ?? r3;
        String quantityString;
        String quantityString2;
        char c;
        String quantityString3;
        String quantityString4;
        String strEnterFrom;
        String uid;
        int i3;
        int i4;
        ?? r4;
        String quantityString5;
        String quantityString6;
        char c2;
        String quantityString7;
        String quantityString8;
        String strEnterFrom2;
        String uid2;
        dialogInterface.dismiss();
        String str = "";
        if (i == 0) {
            CommentManagementBottomBarAssem commentManagementBottomBarAssem = (CommentManagementBottomBarAssem) dialogInterfaceOnClickListenerC1401900maK.l0;
            if (commentManagementBottomBarAssem.getContext() != null) {
                CommentManagementAssemVM commentManagementAssemVMHp = commentManagementBottomBarAssem.hp();
                C19EG c19egLJIILLIIL = C1345700l7g.LJIILLIIL(commentManagementBottomBarAssem);
                commentManagementAssemVMHp.getClass();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                HashSet hashSet = new HashSet();
                String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
                Map<String, Comment> map = commentManagementAssemVMHp.LLILLJJLI;
                Map<String, Comment> map2 = commentManagementAssemVMHp.LL;
                HashMap map3 = (HashMap) map;
                map3.clear();
                Iterator it2 = ((HashMap) map2).entrySet().iterator();
                int i5 = 0;
                while (it2.hasNext()) {
                    Comment comment = (Comment) ((Map.Entry) it2.next()).getValue();
                    if (comment.getUser() == null) {
                        uid2 = "";
                    } else {
                        uid2 = comment.getUser().getUid();
                    }
                    String cid = comment.getCid();
                    if (!TextUtils.equals(curUserId, uid2)) {
                        arrayList.add(cid);
                        arrayList2.add(uid2);
                        hashSet.add(uid2);
                        map3.put(cid, comment);
                    }
                    if (comment.getAliasAweme() != null) {
                        i5++;
                    }
                }
                if (map3.isEmpty()) {
                    C1389890mGx c1389890mGx = new C1389890mGx(c19egLJIILLIIL);
                    c1389890mGx.LJIIJ(c19egLJIILLIIL.getString(2131829151));
                    c1389890mGx.LJIIJJI();
                    return;
                }
                int size = arrayList.size();
                int size2 = hashSet.size();
                CommentContextSource commentContextSourceWQ2 = commentManagementAssemVMHp.wQ2();
                if (commentContextSourceWQ2 != null && (strEnterFrom2 = CommentContextSourceKt.enterFrom(commentContextSourceWQ2)) != null) {
                    str = strEnterFrom2;
                }
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LIZJ(size, "c_number");
                c2344009Gk.LIZJ(size2, "u_number");
                c2344009Gk.LIZJ(i5, "video_reply_number");
                c2344009Gk.LJIIIIZZ("enter_from", str);
                C1350920lG6.LJJJ(c2344009Gk, "comment_batch_management_report_ck");
                if (C308890C8x.LIZ().length == 3) {
                    i3 = 1;
                    i4 = C308890C8x.LIZ()[1];
                } else {
                    i3 = 1;
                    i4 = 100;
                }
                if (size > i4) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    Resources resources = c19egLJIILLIIL.getResources();
                    if (resources != null) {
                        Object[] objArr = new Object[i3];
                        c2 = 0;
                        objArr[0] = Integer.valueOf(size);
                        quantityString7 = resources.getQuantityString(2131755163, size, objArr);
                    } else {
                        c2 = 0;
                        quantityString7 = null;
                    }
                    sbLIZ.append(quantityString7);
                    Resources resources2 = c19egLJIILLIIL.getResources();
                    if (resources2 != null) {
                        Object[] objArr2 = new Object[i3];
                        objArr2[c2] = Integer.valueOf(i4);
                        quantityString8 = resources2.getQuantityString(2131755164, i4, objArr2);
                    } else {
                        quantityString8 = null;
                    }
                    sbLIZ.append(quantityString8);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    C1389890mGx c1389890mGx2 = new C1389890mGx(c19egLJIILLIIL);
                    c1389890mGx2.LJIIJ(strLIZIZ);
                    c1389890mGx2.LJIIJJI();
                    return;
                }
                if (size > 0) {
                    HashSet hashSet2 = new HashSet();
                    HashMap map4 = new HashMap();
                    int replyCommentTotal = 0;
                    for (Map.Entry entry : map3.entrySet()) {
                        Object key = entry.getKey();
                        Comment comment2 = (Comment) entry.getValue();
                        if (comment2.getCommentType() == 1) {
                            hashSet2.add(key);
                            replyCommentTotal += (int) (comment2.getReplyCommentTotal() + 1);
                        } else if (comment2.getCommentType() == 2) {
                            map4.put(key, comment2.getRootCommentId());
                        }
                    }
                    Iterator it3 = map4.entrySet().iterator();
                    while (it3.hasNext()) {
                        if (!hashSet2.contains(((Map.Entry) it3.next()).getValue())) {
                            replyCommentTotal++;
                        }
                    }
                    commentManagementAssemVMHp.LLILLL = replyCommentTotal;
                    C1397620mTQ c1397620mTQ = new C1397620mTQ(c19egLJIILLIIL);
                    c1397620mTQ.LJFF(2131829152, new AwS2S0602000_21(commentManagementAssemVMHp, (CommentManagementAssemVM) c19egLJIILLIIL, (C19EG) arrayList, (List<String>) arrayList2, (List<String>) size, (int) hashSet, (Set<String>) i5, (int) map3, (Map<String, Comment>) 1));
                    c1397620mTQ.LJII(2131829139, AFwS259S0000000_21.get$arr$(465));
                    C1397580mTM c1397580mTM = new C1397580mTM(c19egLJIILLIIL);
                    Resources resources3 = c19egLJIILLIIL.getResources();
                    if (resources3 != null) {
                        r4 = 0;
                        quantityString5 = resources3.getQuantityString(2131755166, size, Integer.valueOf(size));
                    } else {
                        r4 = 0;
                        quantityString5 = null;
                    }
                    c1397580mTM.LJI(quantityString5);
                    Resources resources4 = c19egLJIILLIIL.getResources();
                    if (resources4 != null) {
                        Object[] objArr3 = new Object[1];
                        objArr3[r4] = Integer.valueOf(size);
                        quantityString6 = resources4.getQuantityString(2131755165, size, objArr3);
                    } else {
                        quantityString6 = null;
                    }
                    c1397580mTM.LIZIZ(quantityString6);
                    c1397580mTM.LJIIL = c1397620mTQ;
                    c1397580mTM.LJII = r4;
                    new C1397510mTF(c1397580mTM).LIZLLL();
                    C1350920lG6.LJJIL("comment_batch_management_report_confirm_sw");
                    return;
                }
                return;
            }
            return;
        }
        CommentManagementBottomBarAssem commentManagementBottomBarAssem2 = (CommentManagementBottomBarAssem) dialogInterfaceOnClickListenerC1401900maK.l0;
        if (commentManagementBottomBarAssem2.getContext() != null) {
            CommentManagementAssemVM commentManagementAssemVMHp2 = commentManagementBottomBarAssem2.hp();
            C19EG c19egLJIILLIIL2 = C1345700l7g.LJIILLIIL(commentManagementBottomBarAssem2);
            Map<String, Comment> map5 = commentManagementAssemVMHp2.LL;
            HashSet hashSet3 = new HashSet();
            String curUserId2 = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
            HashMap map6 = (HashMap) commentManagementAssemVMHp2.LLILLJJLI;
            map6.clear();
            Iterator it4 = ((HashMap) map5).entrySet().iterator();
            int i6 = 0;
            while (it4.hasNext()) {
                Comment comment3 = (Comment) ((Map.Entry) it4.next()).getValue();
                if (comment3.getUser() == null) {
                    uid = "";
                } else {
                    uid = comment3.getUser().getUid();
                }
                if (!TextUtils.equals(curUserId2, uid)) {
                    hashSet3.add(uid);
                    map6.put(comment3.getCid(), comment3);
                }
                if (comment3.getAliasAweme() != null) {
                    i6++;
                }
            }
            if (map6.isEmpty()) {
                C1389890mGx c1389890mGx3 = new C1389890mGx(c19egLJIILLIIL2);
                c1389890mGx3.LJIIJ(c19egLJIILLIIL2.getString(2131829137));
                c1389890mGx3.LJIIJJI();
                return;
            }
            int size3 = hashSet3.size();
            int size4 = hashSet3.size();
            CommentContextSource commentContextSourceWQ22 = commentManagementAssemVMHp2.wQ2();
            if (commentContextSourceWQ22 != null && (strEnterFrom = CommentContextSourceKt.enterFrom(commentContextSourceWQ22)) != null) {
                str = strEnterFrom;
            }
            C2344009Gk c2344009Gk2 = new C2344009Gk();
            c2344009Gk2.LIZJ(size3, "c_number");
            c2344009Gk2.LIZJ(size4, "u_number");
            c2344009Gk2.LIZJ(i6, "video_reply_number");
            c2344009Gk2.LJIIIIZZ("enter_from", str);
            C1350920lG6.LJJJ(c2344009Gk2, "comment_batch_management_block_ck");
            if (C308890C8x.LIZ().length == 3) {
                i2 = C308890C8x.LIZ()[2];
            } else {
                i2 = 100;
            }
            if (size3 > i2) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                Resources resources5 = c19egLJIILLIIL2.getResources();
                if (resources5 != null) {
                    c = 0;
                    quantityString3 = resources5.getQuantityString(2131755157, size3, Integer.valueOf(size3));
                } else {
                    c = 0;
                    quantityString3 = null;
                }
                sbLIZ2.append(quantityString3);
                Resources resources6 = c19egLJIILLIIL2.getResources();
                if (resources6 != null) {
                    Object[] objArr4 = new Object[1];
                    objArr4[c] = Integer.valueOf(i2);
                    quantityString4 = resources6.getQuantityString(2131755158, i2, objArr4);
                } else {
                    quantityString4 = null;
                }
                sbLIZ2.append(quantityString4);
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                C1389890mGx c1389890mGx4 = new C1389890mGx(c19egLJIILLIIL2);
                c1389890mGx4.LJIIJ(strLIZIZ2);
                c1389890mGx4.LJIIJJI();
                return;
            }
            if (hashSet3.size() > 0) {
                C1397620mTQ c1397620mTQ2 = new C1397620mTQ(c19egLJIILLIIL2);
                c1397620mTQ2.LJFF(2131829135, new C1343800l4c(commentManagementAssemVMHp2, hashSet3, c19egLJIILLIIL2, size3, i6));
                c1397620mTQ2.LJII(2131829139, AFwS259S0000000_21.get$arr$(464));
                int size5 = hashSet3.size();
                C1397580mTM c1397580mTM2 = new C1397580mTM(c19egLJIILLIIL2);
                Resources resources7 = c19egLJIILLIIL2.getResources();
                if (resources7 != null) {
                    r3 = 0;
                    quantityString = resources7.getQuantityString(2131755160, size5, Integer.valueOf(size5));
                } else {
                    r3 = 0;
                    quantityString = null;
                }
                c1397580mTM2.LJI(quantityString);
                Resources resources8 = c19egLJIILLIIL2.getResources();
                if (resources8 != null) {
                    Object[] objArr5 = new Object[1];
                    objArr5[r3] = Integer.valueOf(size5);
                    quantityString2 = resources8.getQuantityString(2131755159, size5, objArr5);
                } else {
                    quantityString2 = null;
                }
                c1397580mTM2.LIZIZ(quantityString2);
                c1397580mTM2.LJIIL = c1397620mTQ2;
                c1397580mTM2.LJII = r3;
                new C1397510mTF(c1397580mTM2).LIZLLL();
                C1350920lG6.LJJIL("comment_batch_management_block_confirm_sw");
            }
        }
    }
}
