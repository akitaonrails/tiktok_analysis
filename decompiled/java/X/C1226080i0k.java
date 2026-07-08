package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: renamed from: X.0i0k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1226080i0k extends C1225970i0Z {
    public final AbstractC1225770i0F LLILLL;
    public final C1225620i00 LLILZ;
    public List<? extends IMUser> LLILZIL;
    public boolean LLILZLL;
    public final C01GW LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;

    @Override // X.C1225970i0Z, X.InterfaceC1223360hwM
    public final View LJ() {
        C1749280vcc c1749280vcc = new C1749280vcc(this.LLILLL.LJJJJLL().LIZIZ(), null, 6);
        C1722300uv6 c1722300uv6 = new C1722300uv6();
        C0HTI c0hti = new C0HTI();
        c0hti.LIZ = R.drawable.ng;
        Drawable drawableLIZ = c0hti.LIZ(this.LLILLL.LJJJJLL().LIZIZ());
        c1722300uv6.LIZJ = 2;
        c1722300uv6.LIZ = drawableLIZ;
        c1722300uv6.LJFF = 2131847956;
        c1722300uv6.LJII = 2131847955;
        c1749280vcc.setStatus(c1722300uv6);
        return c1749280vcc;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d7  */
    @Override // X.C1225970i0Z, X.InterfaceC1224180hxg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJIL(X.InterfaceC1364105Vn<? super X.AbstractC1223670hwr> r19) {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1226080i0k.LJJIL(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.List] */
    public final List<AbstractC1223800hx4> LJJJJIZL(List<? extends IMContact> list) {
        ?? arrayList;
        C1224780hye c1224780hyeLJIILLIIL;
        List<C1224840hyk> list2;
        if (this.LLILZLL) {
            arrayList = (List) this.LLIZ.getValue();
        } else {
            InterfaceC1226510i1R interfaceC1226510i1R = this.LL.LIZ;
            if (interfaceC1226510i1R != null && (c1224780hyeLJIILLIIL = interfaceC1226510i1R.LJIILLIIL()) != null && (list2 = c1224780hyeLJIILLIIL.LIZIZ) != null) {
                arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
                Iterator<C1224840hyk> it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList.add(it2.next().LLILZ);
                }
            } else {
                arrayList = 0;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (IMContact iMContact : list) {
            if (iMContact instanceof IMUser) {
                arrayList2.add(iMContact);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            IMUser iMUser = (IMUser) obj;
            if (C703302op.LIZ(iMUser.getUid()) && iMUser.getFollowStatus() == 2) {
                arrayList3.add(obj);
            }
        }
        List<AbstractC1223800hx4> listLIZ = C1226100i0m.LIZ(this.LLILLL.LJJJJLL().LIZIZ(), arrayList, arrayList3);
        if (this.LLILZLL) {
            this.LLILZIL = arrayList3;
            this.LLILZLL = false;
        }
        return listLIZ;
    }

    public C1226080i0k(AbstractC1225770i0F abstractC1225770i0F, C1225620i00 c1225620i00) {
        super(c1225620i00);
        this.LLILLL = abstractC1225770i0F;
        this.LLILZ = c1225620i00;
        this.LLILZIL = C13BV.INSTANCE;
        this.LLILZLL = true;
        this.LLIZ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 3203));
        this.LLIZLLLIL = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(1227));
        this.LLJ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(1226));
    }
}
