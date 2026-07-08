package X;

import Y.AfS178S0100000_9;
import android.content.Context;
import com.ss.android.ugc.aweme.addyours.model.AddYoursAvatar;
import com.ss.android.ugc.aweme.addyours.model.AddYoursTopic;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.tiktok.addyours.hub.assem.AddYoursHubItemCellAssem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0OD2, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.tiktok.addyours.hub.assem.AddYoursHubItemCellAssem$bindInviteInfoContainer$2$4", f = "AddYoursHubItemCellAssem.kt", l = {}, m = "invokeSuspend")
public final class C0OD2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AddYoursHubItemCellAssem LL;
    public final /* synthetic */ AddYoursTopic LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0OD2(AddYoursHubItemCellAssem addYoursHubItemCellAssem, AddYoursTopic addYoursTopic, InterfaceC1364105Vn<? super C0OD2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = addYoursHubItemCellAssem;
        this.LLILLJJLI = addYoursTopic;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0OD2(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.ArrayList] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        ?? arrayList;
        C11JF c11jf;
        C1C7U.LIZ("AddYoursHubItemCellAssem@45fd.bindInviteInfoContainer$2$4");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Context context = this.LL.getContentView().getContext();
        List<AddYoursAvatar> inviterAvatars = this.LLILLJJLI.getInviterAvatars();
        if (inviterAvatars != null) {
            arrayList = new ArrayList();
            Iterator<AddYoursAvatar> it2 = inviterAvatars.iterator();
            while (it2.hasNext()) {
                UrlModel userAvatar = it2.next().getUserAvatar();
                if (userAvatar != null) {
                    arrayList.add(userAvatar);
                }
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        C2177241AIw c2177241AIw = new C2177241AIw(context, new C1246110iX3(arrayList, 3), new C2177251AIx(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(C2286608xc.LJ(16))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(C2286608xc.LJ(1))), null, 0, 0, 0.0f, 0.0f, 0, 0, null, null, true, false, false, null, 106492));
        C11JF c11jf2 = this.LL.LLLFF;
        if (c11jf2 != null && !c11jf2.isDisposed() && (c11jf = this.LL.LLLFF) != null) {
            c11jf.dispose();
        }
        this.LL.LLLFF = (C11JF) c2177241AIw.LIZLLL().LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS178S0100000_9(this.LL, 61));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AddYoursHubItemCellAssem@45fd.bindInviteInfoContainer$2$4");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
