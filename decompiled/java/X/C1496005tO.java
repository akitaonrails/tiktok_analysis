package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.common.model.BaseContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.service.analytics.IIMGroupLiveAnalytics;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05tO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.selector.uitls.LiveTemplateHelper$startChatWithCheckFollowStatus$3$onSuccessWithInfo$1", f = "LiveTemplateHelper.kt", l = {}, m = "invokeSuspend")
public final class C1496005tO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1227860i3c LL;
    public final /* synthetic */ C0Y8T LLILLJJLI;
    public final /* synthetic */ List<IMUser> LLILLL;
    public final /* synthetic */ HashMap<String, String> LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ long LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1496005tO(C1227860i3c c1227860i3c, C0Y8T c0y8t, List<? extends IMUser> list, HashMap<String, String> map, String str, long j, InterfaceC1364105Vn<? super C1496005tO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1227860i3c;
        this.LLILLJJLI = c0y8t;
        this.LLILLL = list;
        this.LLILZ = map;
        this.LLILZIL = str;
        this.LLILZLL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1496005tO(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveTemplateHelper@ba38.startChatWithCheckFollowStatus$3$onSuccessWithInfo$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL != null) {
            C0Y8T c0y8t = this.LLILLJJLI;
            List<IMUser> list = this.LLILLL;
            ArrayList arrayList = new ArrayList();
            for (IMUser iMUser : list) {
                if (iMUser.getFollowStatus() == 2) {
                    arrayList.add(iMUser);
                }
            }
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                String uid = ((BaseContact) it2.next()).getUid();
                if (uid == null) {
                    uid = "";
                }
                arrayList2.add(uid);
            }
            HashMap<String, String> map = this.LLILZ;
            IIMGroupLiveAnalytics iIMGroupLiveAnalytics = (IIMGroupLiveAnalytics) PluggableExtentionKt.pluggableSpiForReal(IIMGroupLiveAnalytics.class);
            if (iIMGroupLiveAnalytics != null) {
                iIMGroupLiveAnalytics.LJIIIIZZ(c0y8t, arrayList2, null, null, map, C0I0B.LJFF.LIZIZ());
            }
        }
        List<IMUser> list2 = this.LLILLL;
        ArrayList arrayList3 = new ArrayList();
        for (IMUser iMUser2 : list2) {
            if (iMUser2.getFollowStatus() == 2) {
                arrayList3.add(iMUser2);
            }
        }
        ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(arrayList3, 10));
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            arrayList4.add(((BaseContact) it3.next()).getUid());
        }
        C1227860i3c c1227860i3c = this.LL;
        String str = this.LLILZIL;
        long j = this.LLILZLL;
        HashMap<String, String> map2 = this.LLILZ;
        for (Object obj2 : arrayList4) {
            if (c1227860i3c != null) {
                C1227860i3c.LIZ(str, String.valueOf(j), String.valueOf(obj2), map2);
            }
        }
        if (this.LL != null) {
            C1227860i3c.LIZ(this.LLILZIL, String.valueOf(this.LLILZLL), C461720I8s.LIZIZ(), this.LLILZ);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveTemplateHelper@ba38.startChatWithCheckFollowStatus$3$onSuccessWithInfo$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
