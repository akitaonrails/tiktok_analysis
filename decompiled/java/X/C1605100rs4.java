package X;

import android.os.Message;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0rs4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.school.findschoolfriends.schoolposts.SchoolPostInnerListModel$loadMoreList$1", f = "SchoolPostInnerListModel.kt", l = {67}, m = "invokeSuspend")
public final class C1605100rs4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1605090rs3 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1605100rs4(C1605090rs3 c1605090rs3, InterfaceC1364105Vn<? super C1605100rs4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1605090rs3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1605100rs4(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        List<Aweme> list;
        C1C7U.LIZ("SchoolPostInnerListModel@25fb.loadMoreList$1");
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
            C1605120rs6 c1605120rs6 = C1605120rs6.LIZ;
            String aid = this.LLILLJJLI.LL.getAid();
            if (aid != null && aid.length() != 0 && !C1605120rs6.LIZJ && (list = C1605120rs6.LIZIZ.get(aid)) != null && (!list.isEmpty())) {
                C1605090rs3 c1605090rs3 = this.LLILLJJLI;
                List<? extends Aweme> listLIZ = C1605120rs6.LIZ(c1605090rs3.LL, c1605090rs3.LLILLJJLI);
                if (!listLIZ.isEmpty()) {
                    C1605160rsA c1605160rsALJIIJJI = this.LLILLJJLI.LJIIJJI(listLIZ);
                    C1605090rs3 c1605090rs32 = this.LLILLJJLI;
                    Message messageObtain = Message.obtain();
                    messageObtain.obj = c1605160rsALJIIJJI;
                    c1605090rs32.handleMsg(messageObtain);
                }
            } else if (C1605120rs6.LIZJ) {
                String aid2 = this.LLILLJJLI.LL.getAid();
                this.LL = 1;
                obj = c1605120rs6.LIZIZ(aid2, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("SchoolPostInnerListModel@25fb.loadMoreList$1");
                    return objLJFF;
                }
            } else {
                this.LLILLJJLI.LJIIL();
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("SchoolPostInnerListModel@25fb.loadMoreList$1");
            return unit;
        }
        if (((Boolean) obj).booleanValue()) {
            C1605090rs3 c1605090rs33 = this.LLILLJJLI;
            List<? extends Aweme> listLIZ2 = C1605120rs6.LIZ(c1605090rs33.LL, c1605090rs33.LLILLJJLI);
            if (!listLIZ2.isEmpty()) {
                C1605160rsA c1605160rsALJIIJJI2 = this.LLILLJJLI.LJIIJJI(listLIZ2);
                C1605090rs3 c1605090rs34 = this.LLILLJJLI;
                Message messageObtain2 = Message.obtain();
                messageObtain2.obj = c1605160rsALJIIJJI2;
                c1605090rs34.handleMsg(messageObtain2);
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("SchoolPostInnerListModel@25fb.loadMoreList$1");
                return unit2;
            }
        }
        this.LLILLJJLI.LJIIL();
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("SchoolPostInnerListModel@25fb.loadMoreList$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
