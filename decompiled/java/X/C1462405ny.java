package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05ny, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialgame.impl.jsb.GetConversationUserInfoMethodIDL$handle$2$1", f = "GetConversationUserInfoMethodIDL.kt", l = {}, m = "invokeSuspend")
public final class C1462405ny extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ List<IMUser> LL;
    public final /* synthetic */ CompletionBlock<InterfaceC1463905oD> LLILLJJLI;
    public final /* synthetic */ C1462605o0 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1462405ny(List<? extends IMUser> list, CompletionBlock<InterfaceC1463905oD> completionBlock, C1462605o0 c1462605o0, InterfaceC1364105Vn<? super C1462405ny> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = list;
        this.LLILLJJLI = completionBlock;
        this.LLILLL = c1462605o0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1462405ny(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String containerID;
        UrlModel avatarThumb;
        List<String> urlList;
        Object objLJJJLL;
        C1C7U.LIZ("GetConversationUserInfoMethodIDL@995f.handle$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List<IMUser> list = this.LL;
        ArrayList arrayList = null;
        if (list != null) {
            arrayList = new ArrayList();
            for (IMUser iMUser : list) {
                if (iMUser != null && (avatarThumb = iMUser.getAvatarThumb()) != null && (urlList = avatarThumb.getUrlList()) != null && (objLJJJLL = C13LP.LJJJLL(urlList)) != null) {
                    arrayList.add(objLJJJLL);
                }
            }
        }
        CompletionBlock<InterfaceC1463905oD> completionBlock = this.LLILLJJLI;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(InterfaceC1463905oD.class);
        InterfaceC634840OvC interfaceC634840OvC = this.LLILLL.IBridgeSdkContext;
        if (interfaceC634840OvC == null || (containerID = interfaceC634840OvC.getContainerID()) == null) {
            containerID = "";
        }
        XBaseModel xBaseModelLIZJ = C1549500qQO.LIZJ(containerID, c19719912DlLIZ);
        ((InterfaceC1463905oD) xBaseModelLIZJ).setAvatarList(arrayList);
        completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GetConversationUserInfoMethodIDL@995f.handle$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
