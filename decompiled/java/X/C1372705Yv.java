package X;

import com.ss.android.ugc.aweme.socialavatar.api.BatchSocialAvatarService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Yv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.mixstudio.ids.FriendSocialAvatarIdData$1", f = "FriendSocialAvatarIdData.kt", l = {44}, m = "invokeSuspend")
public final class C1372705Yv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ C1372805Yw LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1372705Yv(C1372805Yw c1372805Yw, InterfaceC1364105Vn<? super C1372705Yv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1372805Yw;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1372705Yv(this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        List arrayList;
        C1C7U.LIZ("FriendSocialAvatarIdData@85e6.<init>$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                arrayList = (List) this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            BatchSocialAvatarService batchSocialAvatarService = (BatchSocialAvatarService) this.LLILLL.LIZLLL.getValue();
            if (batchSocialAvatarService == null) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("FriendSocialAvatarIdData@85e6.<init>$1");
                return unit;
            }
            arrayList = new ArrayList();
            List<String> listSingletonList = Collections.singletonList(this.LLILLL.LIZIZ);
            this.LL = arrayList;
            this.LLILLJJLI = 1;
            obj = batchSocialAvatarService.LIZ(listSingletonList, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("FriendSocialAvatarIdData@85e6.<init>$1");
                return objLJFF;
            }
        }
        for (Map.Entry entry : ((Map) obj).entrySet()) {
            String str = (String) entry.getKey();
            InterfaceC439080HJq interfaceC439080HJq = (InterfaceC439080HJq) entry.getValue();
            if (interfaceC439080HJq instanceof C1372105Yp) {
                C1372105Yp c1372105Yp = (C1372105Yp) interfaceC439080HJq;
                arrayList.add(new C440440HOw(c1372105Yp.LIZ, c1372105Yp.LIZIZ, str, c1372105Yp.LIZJ, 0));
            }
        }
        if (arrayList.isEmpty()) {
            this.LLILLL.LIZJ.setValue(C1372505Yt.LIZIZ);
        } else {
            this.LLILLL.LIZJ.setValue(new C1372405Ys(Collections.singletonList(C13LP.LJJJJZI(arrayList))));
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("FriendSocialAvatarIdData@85e6.<init>$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
