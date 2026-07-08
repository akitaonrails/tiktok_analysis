package X;

import android.content.Context;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.inbox.bulletin.comment.vm.BulletinCommentActionViewModel;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS60S1000000_9;
import njp.a;

/* JADX INFO: renamed from: X.0OXb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.comment.vm.BulletinCommentActionViewModel$publishComment$2", f = "BulletinCommentActionViewModel.kt", l = {290}, m = "invokeSuspend")
public final class C620930OXb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0OTS LLILLJJLI;
    public final /* synthetic */ BulletinCommentActionViewModel LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ Context LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ String LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C620930OXb(C0OTS c0ots, BulletinCommentActionViewModel bulletinCommentActionViewModel, String str, Context context, boolean z, String str2, InterfaceC1364105Vn<? super C620930OXb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0ots;
        this.LLILLL = bulletinCommentActionViewModel;
        this.LLILZ = str;
        this.LLILZIL = context;
        this.LLILZLL = z;
        this.LLIZ = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C620930OXb(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String text;
        Comment comment;
        User curUser;
        String cid;
        boolean z;
        C0OTS c0otsLJFF;
        String rootCommentId;
        String cid2;
        String uid;
        String nickname;
        User user;
        User user2;
        AccountUserService accountUserServiceLJIIJ;
        boolean z2;
        C1C7U.LIZ("BulletinCommentActionViewModel@c42c.publishComment$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C0OTS c0ots = this.LLILLJJLI;
            if (c0ots != null) {
                text = c0ots.LL.getText();
            } else {
                text = this.LLILLL.getState().LLILZLL;
            }
            C0OTS c0ots2 = this.LLILLL.getState().LLIZ;
            if (c0ots2 != null) {
                comment = c0ots2.LL;
            } else {
                comment = null;
            }
            C0OTS c0ots3 = this.LLILLJJLI;
            if (c0ots3 != null) {
                Comment comment2 = c0ots3.LL;
                Comment commentM169clone = comment2.m169clone();
                commentM169clone.setFakeId(comment2.getFakeId());
                BulletinCommentActionViewModel bulletinCommentActionViewModel = this.LLILLL;
                long j = bulletinCommentActionViewModel.LLILLJJLI;
                long j2 = bulletinCommentActionViewModel.LLILLL;
                boolean z3 = bulletinCommentActionViewModel.LLILZ;
                UrlModel urlModel = bulletinCommentActionViewModel.LLILZIL;
                boolean z4 = bulletinCommentActionViewModel.LLILZLL;
                boolean z5 = bulletinCommentActionViewModel.LLIZ;
                boolean z6 = bulletinCommentActionViewModel.LLIZLLLIL;
                String str = bulletinCommentActionViewModel.LLJ;
                String str2 = this.LLILZ;
                EnumC620990OXh enumC620990OXh = EnumC620990OXh.START;
                if (comment == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                c0otsLJFF = C619000OPq.LJFF(commentM169clone, j, j2, z3, urlModel, z4, z5, z6, str, str2, enumC620990OXh, z2);
            } else {
                BulletinCommentActionViewModel bulletinCommentActionViewModel2 = this.LLILLL;
                Context context = this.LLILZIL;
                bulletinCommentActionViewModel2.getClass();
                Comment comment3 = new Comment();
                IAccountService iAccountService = (IAccountService) PluggableExtentionKt.pluggableSpi$default(IAccountService.class, false, false, false, 14, null);
                if (iAccountService != null && (accountUserServiceLJIIJ = iAccountService.LJIIJ()) != null) {
                    curUser = accountUserServiceLJIIJ.getCurUser();
                } else {
                    curUser = null;
                }
                comment3.setUser(curUser);
                comment3.setText(text);
                comment3.setCommentType(1);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(System.currentTimeMillis());
                sbLIZ.append(UUID.randomUUID());
                comment3.setFakeId(C2188811AlT.LIZIZ(sbLIZ));
                if (C619000OPq.LJ(comment)) {
                    if (comment != null) {
                        rootCommentId = comment.getRootCommentId();
                    } else {
                        rootCommentId = null;
                    }
                    comment3.setRootCommentId(rootCommentId);
                    if (comment != null) {
                        cid2 = comment.getCid();
                    } else {
                        cid2 = null;
                    }
                    comment3.setReplyToReplyId(cid2);
                    if (comment != null && (user2 = comment.getUser()) != null) {
                        uid = user2.getUid();
                    } else {
                        uid = null;
                    }
                    comment3.setReplyToUserId(uid);
                    if (comment != null && (user = comment.getUser()) != null) {
                        nickname = user.getNickname();
                    } else {
                        nickname = null;
                    }
                    comment3.setReplyToNickName(nickname);
                } else {
                    if (comment != null) {
                        cid = comment.getCid();
                    } else {
                        cid = null;
                    }
                    comment3.setRootCommentId(cid);
                }
                if (bulletinCommentActionViewModel2.LLILZ) {
                    comment3.setLabelText(context.getString(2131826820));
                    comment3.setLabelType(1);
                }
                BulletinCommentActionViewModel bulletinCommentActionViewModel3 = this.LLILLL;
                long j3 = bulletinCommentActionViewModel3.LLILLJJLI;
                long j4 = bulletinCommentActionViewModel3.LLILLL;
                boolean z7 = bulletinCommentActionViewModel3.LLILZ;
                UrlModel urlModel2 = bulletinCommentActionViewModel3.LLILZIL;
                boolean z8 = bulletinCommentActionViewModel3.LLILZLL;
                boolean z9 = bulletinCommentActionViewModel3.LLIZ;
                boolean z10 = bulletinCommentActionViewModel3.LLIZLLLIL;
                String str3 = bulletinCommentActionViewModel3.LLJ;
                String str4 = this.LLILZ;
                EnumC620990OXh enumC620990OXh2 = EnumC620990OXh.START;
                if (comment == null) {
                    z = true;
                } else {
                    z = false;
                }
                c0otsLJFF = C619000OPq.LJFF(comment3, j3, j4, z7, urlModel2, z8, z9, z10, str3, str4, enumC620990OXh2, z);
            }
            if (text.length() == 0) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("BulletinCommentActionViewModel@c42c.publishComment$2");
                return unit;
            }
            BulletinCommentActionViewModel bulletinCommentActionViewModel4 = this.LLILLL;
            bulletinCommentActionViewModel4.getClass();
            bulletinCommentActionViewModel4.setState(new AwS60S1000000_9("", 17));
            C0OTS c0ots4 = this.LLILLJJLI;
            if (c0ots4 != null) {
                this.LLILLL.LL.bs0(c0ots4, c0otsLJFF, EnumC620940OXc.UPDATE);
            } else if (comment == null) {
                this.LLILLL.LL.bs0(null, c0otsLJFF, EnumC620940OXc.ADD_FIRSTLY_COMMENT);
            } else {
                this.LLILLL.LL.bs0(null, c0otsLJFF, EnumC620940OXc.ADD_SECONDLY_COMMENT);
            }
            C1DFB c1dfb = C0PEM.LIZJ;
            C620920OXa c620920OXa = new C620920OXa(this.LLILLL, text, comment, this.LLILZLL, c0otsLJFF, this.LLILZ, this.LLIZ, this.LLILZIL, c0ots2, this.LLILLJJLI, null);
            this.LL = 1;
            if (C23250099c.LJI(this, c1dfb, c620920OXa) == objLJFF) {
                C1C7U.LIZIZ("BulletinCommentActionViewModel@c42c.publishComment$2");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("BulletinCommentActionViewModel@c42c.publishComment$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
