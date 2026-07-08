package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS257S0000000_19;
import njp.a;

/* JADX INFO: renamed from: X.0hzR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.newselector.template.selectstar.LocalConvSearchDataSourceProtocol$onSearch$2", f = "LocalConvSearchDataSourceProtocol.kt", l = {40}, m = "invokeSuspend")
public final class C1225270hzR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C1223660hwq>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public int LLILZ;
    public final /* synthetic */ C1225250hzP LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1225270hzR(C1225250hzP c1225250hzP, String str, String str2, InterfaceC1364105Vn<? super C1225270hzR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = c1225250hzP;
        this.LLILZLL = str;
        this.LLIZ = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1225270hzR(this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        List<C1224840hyk> list;
        Map mapLJIILLIIL;
        C1224780hye c1224780hyeLJIILLIIL;
        Map<String, List<C1224840hyk>> map;
        Set<Map.Entry<String, List<C1224840hyk>>> setEntrySet;
        Map.Entry entry;
        String str;
        C1224840hyk c1224840hykLIZ;
        Object objLIZ = obj;
        C1C7U.LIZ("LocalConvSearchDataSourceProtocol@9a34.onSearch$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILZ;
        if (i != 0) {
            if (i == 1) {
                mapLJIILLIIL = (Map) this.LLILLJJLI;
                C155000ia.LIZIZ(objLIZ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLIZ);
            InterfaceC1226510i1R interfaceC1226510i1R = this.LLILZIL.LL.LIZ;
            if (interfaceC1226510i1R == null || (c1224780hyeLJIILLIIL = interfaceC1226510i1R.LJIILLIIL()) == null || (map = c1224780hyeLJIILLIIL.LIZ) == null || (setEntrySet = map.entrySet()) == null || (entry = (Map.Entry) C13LP.LJJJLIIL(setEntrySet)) == null || (list = (List) entry.getValue()) == null) {
                list = C13BV.INSTANCE;
            }
            ArrayList arrayList = new ArrayList();
            for (C1224840hyk c1224840hyk : list) {
                Object obj2 = c1224840hyk.LLJI.get("contact");
                if ((obj2 instanceof IMContact) && obj2 != null) {
                    arrayList.add(new Pair(obj2, c1224840hyk));
                }
            }
            mapLJIILLIIL = C2097608Jq.LJIILLIIL(arrayList);
            String str2 = this.LLILZLL;
            C1225250hzP c1225250hzP = this.LLILZIL;
            this.LL = list;
            this.LLILLJJLI = mapLJIILLIIL;
            this.LLILLL = str2;
            this.LLILZ = 1;
            C23260099m c23260099m = new C23260099m(C099M.LIZLLL(this));
            C1231530i9X.LIZ(str2, c23260099m, list, (C11NJ) c1225250hzP.LLILZ.getValue(), AFwS257S0000000_19.get$arr$(1));
            objLIZ = c23260099m.LIZ();
            if (objLIZ == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (objLIZ == objLJFF) {
                C1C7U.LIZIZ("LocalConvSearchDataSourceProtocol@9a34.onSearch$2");
                return objLJFF;
            }
        }
        String str3 = this.LLIZ;
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = ((List) objLIZ).iterator();
        while (it2.hasNext()) {
            C1224840hyk c1224840hyk2 = (C1224840hyk) mapLJIILLIIL.get(it2.next());
            if (c1224840hyk2 != null) {
                str = str3;
                c1224840hykLIZ = C1224840hyk.LIZ(c1224840hyk2, new C1224850hyl(EnumC992630bwD.TYPE_SEARCH_PAGE, ""), null, false, null, str3, false, false, false, false, false, 64510);
            } else {
                str = str3;
                c1224840hykLIZ = null;
            }
            if (c1224840hykLIZ != null) {
                arrayList2.add(c1224840hykLIZ);
            }
            str3 = str;
        }
        boolean zIsEmpty = arrayList2.isEmpty();
        List listSingletonList = arrayList2;
        if (zIsEmpty) {
            listSingletonList = Collections.singletonList(new C1223810hx5(C1383370m6R.LIZ.getString(R.string.kgn)));
        }
        C1223660hwq c1223660hwq = new C1223660hwq(listSingletonList);
        C1C7U.LIZIZ("LocalConvSearchDataSourceProtocol@9a34.onSearch$2");
        return c1223660hwq;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C1223660hwq> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
