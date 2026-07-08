package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.services.external.ability.IPageToFinish;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09mI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.external.ability.OpenPhotoNextServiceImpl$gotoNextPage$1$1$2", f = "OpenPhotoNextServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C2471209mI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C259800zU<List<MediaModel>> LL;
    public final /* synthetic */ C573020Mdg LLILLJJLI;
    public final /* synthetic */ ShortVideoContext LLILLL;
    public final /* synthetic */ IPageToFinish LLILZ;
    public final /* synthetic */ Bundle LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2471209mI(C259800zU<List<MediaModel>> c259800zU, C573020Mdg c573020Mdg, ShortVideoContext shortVideoContext, IPageToFinish iPageToFinish, Bundle bundle, InterfaceC1364105Vn<? super C2471209mI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c259800zU;
        this.LLILLJJLI = c573020Mdg;
        this.LLILLL = shortVideoContext;
        this.LLILZ = iPageToFinish;
        this.LLILZIL = bundle;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2471209mI(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OpenPhotoNextServiceImpl@40cd.gotoNextPage$1$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List<MediaModel> list = this.LL.element;
        if (list != null && !list.isEmpty()) {
            C573020Mdg c573020Mdg = this.LLILLJJLI;
            ShortVideoContext shortVideoContext = this.LLILLL;
            List<MediaModel> list2 = this.LL.element;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList.add(((MediaModel) it2.next()).LJFF());
            }
            C573020Mdg.LJIIIIZZ(c573020Mdg, shortVideoContext, arrayList, new C2471309mJ(this.LLILZ), true, null, C2286608xc.LJFF(System.currentTimeMillis()), true, this.LL.element, this.LLILZIL.getString(FollowStatusChangeMethod.PARAM_UID), null, null, null, 15360);
        } else {
            this.LLILZ.onFinish(false);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("OpenPhotoNextServiceImpl@40cd.gotoNextPage$1$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
