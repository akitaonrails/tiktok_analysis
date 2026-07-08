package X;

import android.content.Context;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.inbox.bulletin.comment.vm.BulletinCommentActionViewModel;
import com.ss.android.ugc.aweme.profile.model.User;
import java.io.FileInputStream;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS588S0100000_9;
import njp.a;

/* JADX INFO: renamed from: X.0OTO, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.comment.vm.BulletinCommentActionViewModel$updateCommentDigg$2", f = "BulletinCommentActionViewModel.kt", l = {144, 202}, m = "invokeSuspend")
public final class C0OTO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public AbstractC1623806Xk LL;
    public int LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ BulletinCommentActionViewModel LLILZ;
    public final /* synthetic */ C0OTS LLILZIL;
    public final /* synthetic */ Context LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0OTO(int i, BulletinCommentActionViewModel bulletinCommentActionViewModel, C0OTS c0ots, Context context, InterfaceC1364105Vn<? super C0OTO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = i;
        this.LLILZ = bulletinCommentActionViewModel;
        this.LLILZIL = c0ots;
        this.LLILZLL = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0OTO(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String uid;
        AbstractC1623806Xk abstractC1623806Xk;
        boolean z;
        int i;
        String uid2;
        boolean z2;
        int i2;
        String uid3;
        Object objUpdateCommentDigg = obj;
        C1C7U.LIZ("BulletinCommentActionViewModel@c42c.updateCommentDigg$2");
        Object objLJFF = C099R.LJFF();
        int i3 = this.LLILLJJLI;
        String str = "";
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    abstractC1623806Xk = this.LL;
                    C155000ia.LIZIZ(objUpdateCommentDigg);
                    this.LLILZ.setState(new AwS588S0100000_9(abstractC1623806Xk, (AbstractC1623806Xk<? extends Pair<? extends FileInputStream, String>>) 651));
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("BulletinCommentActionViewModel@c42c.updateCommentDigg$2");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(objUpdateCommentDigg);
        } else {
            C155000ia.LIZIZ(objUpdateCommentDigg);
            if (this.LLILLL == 1) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("CommentDigg dispatch comment_like (pre-network) bbId=");
                sbLIZ.append(this.LLILZ.LLILLJJLI);
                sbLIZ.append(", bulletinItemId=");
                sbLIZ.append(this.LLILZ.LLILLL);
                sbLIZ.append(", commentId=");
                sbLIZ.append(this.LLILZIL.LL.getCid());
                C0OPX.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
                C620050OTr c620050OTr = C620050OTr.LIZ;
                String strValueOf = String.valueOf(this.LLILZ.LLILLJJLI);
                Pair[] pairArr = new Pair[3];
                String cid = this.LLILZIL.LL.getCid();
                if (cid == null) {
                    cid = "";
                }
                pairArr[0] = new Pair("comment_id", cid);
                pairArr[1] = new Pair("bulletin_item_id", String.valueOf(this.LLILZ.LLILLL));
                User user = this.LLILZIL.LL.getUser();
                if (user == null || (uid = user.getUid()) == null) {
                    uid = "";
                }
                pairArr[2] = new Pair("to_user_id", uid);
                C620050OTr.LIZIZ(c620050OTr, strValueOf, "comment_like", C2097608Jq.LJIIIIZZ(pairArr));
            }
            C0OTP c0otp = (C0OTP) this.LLILZ.LLJIJIL.getValue().getOperator();
            String cid2 = this.LLILZIL.LL.getCid();
            int i4 = this.LLILLL;
            this.LLILLJJLI = 1;
            objUpdateCommentDigg = c0otp.updateCommentDigg(cid2, i4, this);
            if (objUpdateCommentDigg == objLJFF) {
                C1C7U.LIZIZ("BulletinCommentActionViewModel@c42c.updateCommentDigg$2");
                return objLJFF;
            }
        }
        abstractC1623806Xk = (AbstractC1623806Xk) objUpdateCommentDigg;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("CommentDigg done diggType=");
        sbLIZ2.append(this.LLILLL);
        sbLIZ2.append(", success=");
        boolean z3 = abstractC1623806Xk instanceof C1623606Xi;
        sbLIZ2.append(z3);
        sbLIZ2.append(", bbId=");
        sbLIZ2.append(this.LLILZIL.LLILLJJLI);
        sbLIZ2.append(", bbItemId=");
        sbLIZ2.append(this.LLILZIL.LLILLL);
        sbLIZ2.append(", cid=");
        sbLIZ2.append(this.LLILZIL.LL.getCid());
        sbLIZ2.append(", userDigged=");
        sbLIZ2.append(this.LLILZIL.LL.getUserDigged());
        sbLIZ2.append(", isUserDigged=");
        sbLIZ2.append(this.LLILZIL.LL.isUserDigged());
        C0OPX.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ2));
        if (z3) {
            Comment commentM169clone = this.LLILZIL.LL.m169clone();
            String str2 = "bulletin_board_page";
            if (this.LLILLL == 1) {
                commentM169clone.setUserDigged(1);
                commentM169clone.setDiggCount(commentM169clone.getDiggCount() + 1);
                C0OTS c0ots = this.LLILZIL;
                if (c0ots.LLILZ) {
                    z2 = true;
                } else {
                    z2 = c0ots.LL.isAuthorDigged;
                }
                commentM169clone.isAuthorDigged = z2;
                C0OPQ c0opq = C0OPQ.LIZ;
                String str3 = c0ots.LLJIJIL;
                if (str3 != null) {
                    str2 = str3;
                }
                String strValueOf2 = String.valueOf(c0ots.LLILLJJLI);
                C0HWW c0hww = C0HWW.LIZ;
                boolean z4 = this.LLILZIL.LLILZ;
                c0hww.getClass();
                String strValueOf3 = String.valueOf(this.LLILZIL.LLILLL);
                C0OTS c0ots2 = this.LLILZIL;
                String str4 = c0ots2.LLJ;
                if (str4 == null) {
                    str4 = "";
                }
                String cid3 = c0ots2.LL.getCid();
                if (cid3 == null) {
                    cid3 = "";
                }
                if (this.LLILZIL.LL.getStatus() == 11) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                C0OTS c0ots3 = this.LLILZIL;
                int i5 = c0ots3.LLJI;
                String commentLanguage = c0ots3.LL.getCommentLanguage();
                if (commentLanguage == null) {
                    commentLanguage = "";
                }
                User user2 = this.LLILZIL.LL.getUser();
                if (user2 != null && (uid3 = user2.getUid()) != null) {
                    str = uid3;
                }
                c0opq.getClass();
                C0OPQ.LJJII(str2, "comment_panel", strValueOf2, z4 ? 1 : 0, 1, strValueOf3, str4, cid3, i2, i5, commentLanguage, str, "click", "like");
            } else {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("CommentDigg skip comment_like (undigg branch) diggType=");
                sbLIZ3.append(this.LLILLL);
                sbLIZ3.append(" bbId=");
                sbLIZ3.append(this.LLILZIL.LLILLJJLI);
                sbLIZ3.append(", cid=");
                sbLIZ3.append(this.LLILZIL.LL.getCid());
                C0OPX.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ3));
                commentM169clone.setUserDigged(0);
                commentM169clone.setDiggCount(commentM169clone.getDiggCount() - 1);
                C0OTS c0ots4 = this.LLILZIL;
                if (c0ots4.LLILZ) {
                    z = false;
                } else {
                    z = c0ots4.LL.isAuthorDigged;
                }
                commentM169clone.isAuthorDigged = z;
                if (C0C64.LJIILLIIL().LJIIIZ(31744, "bulletin_fix_comment_cancel_like_event_setting", true, true)) {
                    C0OPQ c0opq2 = C0OPQ.LIZ;
                    C0OTS c0ots5 = this.LLILZIL;
                    String str5 = c0ots5.LLJIJIL;
                    if (str5 != null) {
                        str2 = str5;
                    }
                    String strValueOf4 = String.valueOf(c0ots5.LLILLJJLI);
                    C0HWW c0hww2 = C0HWW.LIZ;
                    boolean z5 = this.LLILZIL.LLILZ;
                    c0hww2.getClass();
                    String strValueOf5 = String.valueOf(this.LLILZIL.LLILLL);
                    C0OTS c0ots6 = this.LLILZIL;
                    String str6 = c0ots6.LLJ;
                    if (str6 == null) {
                        str6 = "";
                    }
                    String cid4 = c0ots6.LL.getCid();
                    if (cid4 == null) {
                        cid4 = "";
                    }
                    if (this.LLILZIL.LL.getStatus() == 11) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    C0OTS c0ots7 = this.LLILZIL;
                    int i6 = c0ots7.LLJI;
                    String commentLanguage2 = c0ots7.LL.getCommentLanguage();
                    if (commentLanguage2 == null) {
                        commentLanguage2 = "";
                    }
                    User user3 = this.LLILZIL.LL.getUser();
                    if (user3 != null && (uid2 = user3.getUid()) != null) {
                        str = uid2;
                    }
                    c0opq2.getClass();
                    C0OPQ.LJJII(str2, "comment_panel", strValueOf4, z5 ? 1 : 0, 1, strValueOf5, str6, cid4, i, i6, commentLanguage2, str, "click", "cancel_like");
                }
            }
            C0OTS c0ots8 = this.LLILZIL;
            this.LLILZ.LL.bs0(c0ots8, new C0OTS(commentM169clone, c0ots8.LLILLJJLI, c0ots8.LLILLL, c0ots8.LLILZ, c0ots8.LLILZIL, c0ots8.LLILZLL, c0ots8.LLIZ, c0ots8.LLIZLLLIL, c0ots8.LLJ, c0ots8.LLJI, c0ots8.LLJIJIL, c0ots8.LLJILJIL, c0ots8.LLJILJILJ), EnumC620940OXc.UPDATE);
        } else if (abstractC1623806Xk instanceof C491001vg) {
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C0OAC c0oac = new C0OAC(this.LLILLL, this.LLILZLL, abstractC1623806Xk, null);
            this.LL = abstractC1623806Xk;
            this.LLILLJJLI = 2;
            if (C23250099c.LJI(this, abstractC2238408pq, c0oac) == objLJFF) {
                C1C7U.LIZIZ("BulletinCommentActionViewModel@c42c.updateCommentDigg$2");
                return objLJFF;
            }
        }
        this.LLILZ.setState(new AwS588S0100000_9(abstractC1623806Xk, (AbstractC1623806Xk<? extends Pair<? extends FileInputStream, String>>) 651));
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("BulletinCommentActionViewModel@c42c.updateCommentDigg$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
