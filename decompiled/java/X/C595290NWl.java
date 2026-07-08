package X;

import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0NWl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.activity.status.sdk.core.ActivityStatusDataSource$fetchHandler$2$1", f = "ActivityStatusDataSource.kt", l = {73}, m = "invokeSuspend")
public final class C595290NWl extends C09AX implements InterfaceC1631630sYr<Boolean, List<? extends String>, Boolean, InterfaceC1364105Vn<? super C595260NWi>, Object> {
    public int LL;
    public /* synthetic */ boolean LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public /* synthetic */ boolean LLILZ;
    public final /* synthetic */ C0NX1 LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C595290NWl(C0NX1 c0nx1, InterfaceC1364105Vn<? super C595290NWl> interfaceC1364105Vn) {
        super(4, interfaceC1364105Vn);
        this.LLILZIL = c0nx1;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C0NX1 c0nx1;
        C1C7U.LIZ("ActivityStatusDataSource@11bf.fetchHandler$2$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                c0nx1 = (C0NX1) this.LLILLL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            boolean z = this.LLILLJJLI;
            List<String> list = (List) this.LLILLL;
            boolean z2 = this.LLILZ;
            C0NX1 c0nx12 = this.LLILZIL;
            C0NXT c0nxt = c0nx12.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("fetch activity status, size=");
            sbLIZ.append(list.size());
            sbLIZ.append(" fetchAsReport=");
            sbLIZ.append(z2);
            sbLIZ.append(" uidList=");
            sbLIZ.append(list);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c0nx12.getClass();
            C0NXR.LIZLLL(c0nx12, c0nxt, strLIZIZ);
            c0nx1 = this.LLILZIL;
            C0NK1 c0nk1 = (C0NK1) c0nx1.LJIILL.getValue();
            this.LLILLL = c0nx1;
            this.LL = 1;
            obj = c0nk1.LIZ(z, list, z2, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("ActivityStatusDataSource@11bf.fetchHandler$2$1");
                return objLJFF;
            }
        }
        C595260NWi c595260NWi = (C595260NWi) obj;
        c0nx1.getClass();
        List<C595220NWe> list2 = c595260NWi.LIZIZ;
        if (list2 != null && C595320NWo.LIZ(c0nx1.LIZJ).LJIIJJI) {
            Iterator<C595220NWe> it2 = list2.iterator();
            while (it2.hasNext()) {
                c0nx1.LJ.offer(it2.next());
            }
        }
        C1C7U.LIZIZ("ActivityStatusDataSource@11bf.fetchHandler$2$1");
        return c595260NWi;
    }

    @Override // X.InterfaceC1631630sYr
    public final Object invoke(Boolean bool, List<? extends String> list, Boolean bool2, InterfaceC1364105Vn<? super C595260NWi> interfaceC1364105Vn) {
        boolean zBooleanValue = bool.booleanValue();
        boolean zBooleanValue2 = bool2.booleanValue();
        C595290NWl c595290NWl = new C595290NWl(this.LLILZIL, interfaceC1364105Vn);
        c595290NWl.LLILLJJLI = zBooleanValue;
        c595290NWl.LLILLL = list;
        c595290NWl.LLILZ = zBooleanValue2;
        return c595290NWl.invokeSuspend(Unit.LIZ);
    }
}
