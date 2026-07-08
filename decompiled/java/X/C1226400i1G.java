package X;

import android.content.res.Resources;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMConversation;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS257S0000000_19;

/* JADX INFO: renamed from: X.0i1G, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1226400i1G extends C0Y17<List<? extends C0Y8T>> {
    public final /* synthetic */ AbstractC1226410i1H LIZ;
    public final /* synthetic */ InterfaceC20236714Gf<AbstractC1223670hwr> LIZIZ;

    @Override // X.InterfaceC863600XuI
    public final void LIZIZ(final C0YMW c0ymw) {
        this.LIZ.LLILZ.getTag();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fetchGroupList onFailure: ");
        sbLIZ.append(c0ymw);
        C2188811AlT.LIZIZ(sbLIZ);
        if (!this.LIZIZ.isActive()) {
            return;
        }
        InterfaceC20236714Gf<AbstractC1223670hwr> interfaceC20236714Gf = this.LIZIZ;
        C098200Yq c098200Yq = new C098200Yq(new RuntimeException(c0ymw) { // from class: X.0i19
            /* JADX WARN: Illegal instructions before constructor call */
            {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("IM request failed: ");
                sbLIZ2.append(c0ymw);
                super(C2188811AlT.LIZIZ(sbLIZ2));
            }
        });
        C189200o6.m2constructorimpl(c098200Yq);
        interfaceC20236714Gf.resumeWith(c098200Yq);
    }

    public C1226400i1G(AbstractC1226410i1H abstractC1226410i1H, C2252611DEt c2252611DEt) {
        this.LIZ = abstractC1226410i1H;
        this.LIZIZ = c2252611DEt;
    }

    @Override // X.C0Y17
    public final void LJII(long j, Object obj, boolean z) {
        Integer numValueOf;
        List<IMConversation> listLJJII;
        boolean z2;
        String quantityString;
        List list = (List) obj;
        this.LIZ.LLILZ.getTag();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onResult, size=");
        if (list != null) {
            numValueOf = Integer.valueOf(list.size());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(", nextCursor=");
        sbLIZ.append(j);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        if (this.LIZIZ.isActive()) {
            if (list == null || (listLJJII = C09RB.LJJII(C09RB.LJIJI(C09RB.LJIIJJI(new C1939607ik(list)), AFwS257S0000000_19.get$arr$(773)))) == null) {
                listLJJII = C13BV.INSTANCE;
            }
            InterfaceC20236714Gf<AbstractC1223670hwr> interfaceC20236714Gf = this.LIZIZ;
            AbstractC1226410i1H abstractC1226410i1H = this.LIZ;
            int i = 1;
            if (abstractC1226410i1H.LLILZ.LJJJJLL().LIZJ().LIZJ() != EnumC1224390hy1.DISABLE) {
                z2 = true;
            } else {
                z2 = false;
            }
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJJII, 10));
            for (IMConversation iMConversation : listLJJII) {
                C1224850hyl c1224850hyl = new C1224850hyl(EnumC992630bwD.TYPE_CONTENT_PAGE, abstractC1226410i1H.LLILLL.getValue());
                EnumC1224830hyj enumC1224830hyj = EnumC1224830hyj.NORMAL;
                UrlModel displayAvatar = iMConversation.getDisplayAvatar();
                String strLIZ = C1226140i0q.LIZ(iMConversation);
                String conversationId = iMConversation.getConversationId();
                if (conversationId == null) {
                    conversationId = "";
                }
                Resources resources = abstractC1226410i1H.LLILZ.LJJJJLL().LIZIZ().getResources();
                if (resources != null) {
                    int conversationMemberCount = iMConversation.getConversationMemberCount();
                    Object[] objArr = new Object[i];
                    objArr[0] = Integer.valueOf(iMConversation.getConversationMemberCount());
                    quantityString = resources.getQuantityString(2131755366, conversationMemberCount, objArr);
                } else {
                    quantityString = null;
                }
                arrayList.add(new C1224840hyk(c1224850hyl, enumC1224830hyj, "group", conversationId, displayAvatar, strLIZ, quantityString, true, z2, C2097608Jq.LJIIIIZZ(new Pair("contact", iMConversation), new Pair("template_key", abstractC1226410i1H.LLILZ.LJJJJLL().LJIIJ()), new Pair("ext_enter_from", abstractC1226410i1H.LLILZ.LJJJJLL().LJIIIZ().LIZJ()), new Pair("ext_enter_method", abstractC1226410i1H.LLILZ.LJJJJLL().LJIIIZ().LIZLLL())), false, false, false, !z2, false, 1024));
                i = 1;
            }
            C1223660hwq c1223660hwq = new C1223660hwq(arrayList, z, Long.valueOf(j));
            C189200o6.m2constructorimpl(c1223660hwq);
            interfaceC20236714Gf.resumeWith(c1223660hwq);
        }
    }
}
