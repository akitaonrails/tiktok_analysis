package X;

import com.ss.android.ugc.aweme.inbox.bulletin.assem.BulletinBoardPageHybridAssem;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0OJB, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C0OJB extends C2217421BqW implements Function0<C620070OTt> {
    public C0OJB(BulletinBoardPageHybridAssem bulletinBoardPageHybridAssem) {
        super(0, bulletinBoardPageHybridAssem, BulletinBoardPageHybridAssem.class, "provideBulletinEventContext", "provideBulletinEventContext()Lcom/ss/android/ugc/aweme/inbox/bulletin/utils/BulletinEventContext;", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final C620070OTt invoke() {
        String uid;
        BulletinBoardPageHybridAssem bulletinBoardPageHybridAssem = (BulletinBoardPageHybridAssem) this.receiver;
        bulletinBoardPageHybridAssem.getClass();
        User curUser = C0XQ7.LJFF().getCurUser();
        Long l = bulletinBoardPageHybridAssem.Vo().LLILLJJLI;
        String string = l != null ? l.toString() : null;
        String str = "";
        if (string == null) {
            string = "";
        }
        String strValueOf = String.valueOf(bulletinBoardPageHybridAssem.Vo().EQ2());
        String strValueOf2 = String.valueOf(bulletinBoardPageHybridAssem.Vo().HQ2());
        String strValueOf3 = String.valueOf(bulletinBoardPageHybridAssem.Vo().JQ2());
        String strCQ2 = bulletinBoardPageHybridAssem.Vo().CQ2();
        if (curUser != null && (uid = curUser.getUid()) != null) {
            str = uid;
        }
        return new C620070OTt(string, strValueOf, strValueOf2, strValueOf3, strCQ2, str, String.valueOf(bulletinBoardPageHybridAssem.Vo().getState().LLJJIJIL));
    }
}
