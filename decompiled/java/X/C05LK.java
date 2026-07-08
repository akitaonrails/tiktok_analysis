package X;

import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUserB2CAccountInfo;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUserBizInfo;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.05LK, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.groupchat.CommentGroupChatUtils$preloadAccountOwnerType$1", f = "CommentGroupChatUtils.kt", l = {268}, m = "invokeSuspend")
public final class C05LK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;

    public C05LK(InterfaceC1364105Vn<? super C05LK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05LK(interfaceC1364105Vn);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        Object obj2;
        IMUserBizInfo imUserBizInfo;
        IMUserB2CAccountInfo userB2CAccountInfo;
        String str;
        C1C7U.LIZ("CommentGroupChatUtils@ce9c.preloadAccountOwnerType$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                Object obj3 = this.LL;
                C155000ia.LIZIZ(obj);
                obj2 = obj3;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            String strLIZIZ = C461720I8s.LIZIZ();
            if (((LinkedHashMap) C1231430i9N.LIZJ).get(strLIZIZ) != null) {
                z = true;
            } else {
                z = false;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("preloadAccountOwnerType onCall, hitCache:");
            sbLIZ.append(z);
            C2188811AlT.LIZIZ(sbLIZ);
            if (z) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("CommentGroupChatUtils@ce9c.preloadAccountOwnerType$1");
                return unit;
            }
            IMContactApi.LIZ.getClass();
            C1BGS c1bgsLJ = C069P.LIZ().LJ();
            this.LL = strLIZIZ;
            this.LLILLJJLI = 1;
            obj = c1bgsLJ.LJIJ(strLIZIZ, null, this);
            obj2 = strLIZIZ;
            if (obj == objLJFF) {
                C1C7U.LIZIZ("CommentGroupChatUtils@ce9c.preloadAccountOwnerType$1");
                return objLJFF;
            }
        }
        IMUser iMUser = (IMUser) obj;
        if (iMUser != null && (imUserBizInfo = iMUser.getImUserBizInfo()) != null && (userB2CAccountInfo = imUserBizInfo.getUserB2CAccountInfo()) != null && (str = userB2CAccountInfo.userTags) != null) {
            C1231430i9N.LIZJ.put((String) obj2, str);
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("CommentGroupChatUtils@ce9c.preloadAccountOwnerType$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C05LK(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
