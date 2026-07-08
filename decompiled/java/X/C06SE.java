package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.streak.api.IStreakService;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.06SE, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.jsb.SelectConversationMethodIDL$handle$config$1$1", f = "SelectConversationMethodIDL.kt", l = {}, m = "invokeSuspend")
public final class C06SE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C06SJ LL;
    public final /* synthetic */ List<C1224840hyk> LLILLJJLI;
    public final /* synthetic */ CompletionBlock<C06SG> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06SE(C06SJ c06sj, List<C1224840hyk> list, CompletionBlock<C06SG> completionBlock, InterfaceC1364105Vn<? super C06SE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c06sj;
        this.LLILLJJLI = list;
        this.LLILLL = completionBlock;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C06SE(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String containerID;
        String strLJ;
        Integer numValueOf;
        String str;
        List<String> urlList;
        C1C7U.LIZ("SelectConversationMethodIDL@a126.handle$config$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC634840OvC interfaceC634840OvC = this.LL.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        } else {
            containerID = null;
        }
        List<C1224840hyk> list = this.LLILLJJLI;
        C06SJ c06sj = this.LL;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (C1224840hyk c1224840hyk : list) {
            c06sj.getClass();
            if (Intrinsics.LJFF("group", c1224840hyk.LLILLL)) {
                strLJ = c1224840hyk.LLILZ;
            } else {
                strLJ = C0YNP.LJ(c1224840hyk.LLILZ);
            }
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1500805uA(strLJ, null), 3);
            C06SF c06sf = (C06SF) C1549500qQO.LIZJ(containerID, C13LE.LIZ(C06SF.class));
            c06sf.setConversationId(strLJ);
            if (Intrinsics.LJFF("group", c1224840hyk.LLILLL)) {
                numValueOf = Integer.valueOf(AbstractC1711506n3.LIZIZ);
            } else {
                numValueOf = Integer.valueOf(AbstractC1711506n3.LIZ);
            }
            c06sf.setConversationType(numValueOf);
            c06sf.setConversationName(c1224840hyk.LLILZLL);
            UrlModel urlModel = c1224840hyk.LLILZIL;
            if (urlModel == null || (urlList = urlModel.getUrlList()) == null || (str = (String) C13LP.LJJJLZIJ(0, urlList)) == null) {
                str = "";
            }
            c06sf.setAvatarUrl(str);
            if (Intrinsics.LJFF("private", c1224840hyk.LLILLL)) {
                c06sf.setUserId(c1224840hyk.LLILZ);
                c06sf.setUserUniqueId(c1224840hyk.LLIZ);
            }
            if (strLJ == null) {
                strLJ = "";
            }
            IStreakService.LJJIIZ.getClass();
            c06sf.setExtra(C06LY.LIZ().v(strLJ));
            arrayList.add(c06sf);
        }
        C06SG c06sg = (C06SG) C1549500qQO.LIZJ(containerID, C13LE.LIZ(C06SG.class));
        c06sg.setSelectedConversationList(arrayList);
        this.LLILLL.onSuccess(c06sg, "");
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SelectConversationMethodIDL@a126.handle$config$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
