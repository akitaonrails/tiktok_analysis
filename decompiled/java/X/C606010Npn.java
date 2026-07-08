package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.inbox.bulletin.assem.BulletinPageBarAssem;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinBoardInfo;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Npn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.assem.BulletinPageBarAssem$initData$1", f = "BulletinPageBarAssem.kt", l = {347}, m = "invokeSuspend")
public final class C606010Npn extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ BulletinPageBarAssem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C606010Npn(BulletinPageBarAssem bulletinPageBarAssem, InterfaceC1364105Vn<? super C606010Npn> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = bulletinPageBarAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C606010Npn(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        List<String> urlList;
        String str;
        C0OLO c0olo;
        C1C7U.LIZ("BulletinPageBarAssem@cc58.initData$1");
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
            C1DFB c1dfb = C0PEM.LIZJ;
            C606000Npm c606000Npm = new C606000Npm(this.LLILLJJLI, null);
            this.LL = 1;
            obj = C23250099c.LJI(this, c1dfb, c606000Npm);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("BulletinPageBarAssem@cc58.initData$1");
                return objLJFF;
            }
        }
        BulletinBoardInfo bulletinBoardInfo = (BulletinBoardInfo) obj;
        BulletinPageBarAssem bulletinPageBarAssem = this.LLILLJJLI;
        if (!bulletinPageBarAssem.LLL && bulletinBoardInfo != null) {
            UrlModel urlModel = bulletinBoardInfo.avatarUrl;
            if (urlModel != null && (urlList = urlModel.getUrlList()) != null && (str = (String) C13LP.LJJJLL(urlList)) != null && (c0olo = bulletinPageBarAssem.LLJZIJLIL) != null) {
                c0olo.setAvatar(str);
            }
            C0OLO c0olo2 = bulletinPageBarAssem.LLJZIJLIL;
            if (c0olo2 != null) {
                c0olo2.setName(bulletinBoardInfo.name);
            }
            C0OLO c0olo3 = bulletinPageBarAssem.LLJZIJLIL;
            if (c0olo3 != null) {
                c0olo3.setAccountNameAndIcon(bulletinBoardInfo);
            }
            C0OLO c0olo4 = bulletinPageBarAssem.LLJZIJLIL;
            if (c0olo4 != null) {
                c0olo4.setMembers(bulletinBoardInfo.subscriberCount);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BulletinPageBarAssem@cc58.initData$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
