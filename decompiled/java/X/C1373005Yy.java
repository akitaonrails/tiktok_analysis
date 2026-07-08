package X;

import com.ss.android.ugc.aweme.socialavatar.api.BatchSocialAvatarService;
import com.ss.android.ugc.aweme.socialavatar.api.SocialAvatarFastFlowService;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Yy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.mixstudio.ids.CoCreationSocialAvatarIdData$1", f = "CoCreationSocialAvatarIdData.kt", l = {75}, m = "invokeSuspend")
public final class C1373005Yy extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ C1373105Yz LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1373005Yy(C1373105Yz c1373105Yz, InterfaceC1364105Vn<? super C1373005Yy> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1373105Yz;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1373005Yy(this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        SocialAvatarFastFlowService socialAvatarFastFlowService;
        InterfaceC439080HJq value;
        List list;
        Object objLIZ = obj;
        C1C7U.LIZ("CoCreationSocialAvatarIdData@3701.<init>$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                List list2 = (List) this.LL;
                C155000ia.LIZIZ(objLIZ);
                list = list2;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLIZ);
            BatchSocialAvatarService batchSocialAvatarService = (BatchSocialAvatarService) this.LLILLL.LIZLLL.getValue();
            if (batchSocialAvatarService == null) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("CoCreationSocialAvatarIdData@3701.<init>$1");
                return unit;
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList(this.LLILLL.LIZIZ);
            this.LLILLL.getClass();
            if (arrayList2.remove(C461720I8s.LIZIZ()) && (socialAvatarFastFlowService = (SocialAvatarFastFlowService) this.LLILLL.LJ.getValue()) != null) {
                this.LLILLL.getClass();
                C05YD<InterfaceC439080HJq> c05ydLIZIZ = socialAvatarFastFlowService.LIZIZ(C461720I8s.LIZIZ());
                if (c05ydLIZIZ != null && (value = c05ydLIZIZ.getValue()) != null) {
                    C1373105Yz c1373105Yz = this.LLILLL;
                    if (value instanceof C1372105Yp) {
                        C1372105Yp c1372105Yp = (C1372105Yp) value;
                        String str = c1372105Yp.LIZ;
                        String str2 = c1372105Yp.LIZIZ;
                        c1373105Yz.getClass();
                        arrayList.add(new C440440HOw(str, str2, C461720I8s.LIZIZ(), c1372105Yp.LIZJ, 0));
                    }
                }
            }
            this.LL = arrayList;
            this.LLILLJJLI = 1;
            objLIZ = batchSocialAvatarService.LIZ(arrayList2, this);
            list = arrayList;
            if (objLIZ == objLJFF) {
                C1C7U.LIZIZ("CoCreationSocialAvatarIdData@3701.<init>$1");
                return objLJFF;
            }
        }
        for (Map.Entry entry : ((Map) objLIZ).entrySet()) {
            String str3 = (String) entry.getKey();
            InterfaceC439080HJq interfaceC439080HJq = (InterfaceC439080HJq) entry.getValue();
            if (interfaceC439080HJq instanceof C1372105Yp) {
                C1372105Yp c1372105Yp2 = (C1372105Yp) interfaceC439080HJq;
                list.add(new C440440HOw(c1372105Yp2.LIZ, c1372105Yp2.LIZIZ, str3, c1372105Yp2.LIZJ, 0));
            }
        }
        if (list.isEmpty()) {
            this.LLILLL.LIZJ.setValue(C1372505Yt.LIZIZ);
        } else {
            this.LLILLL.LIZJ.setValue(new C1372405Ys(list));
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("CoCreationSocialAvatarIdData@3701.<init>$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
