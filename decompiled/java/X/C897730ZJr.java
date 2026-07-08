package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.common.model.BaseContact;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ZJr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.avatarloader.impl.core.DMAvatarResManager$refreshFixedAvatar$1", f = "DMAvatarResManager.kt", l = {}, m = "invokeSuspend")
public final class C897730ZJr extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C897710ZJp LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ BaseContact LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C897730ZJr(C897710ZJp c897710ZJp, String str, BaseContact baseContact, InterfaceC1364105Vn<? super C897730ZJr> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c897710ZJp;
        this.LLILLL = str;
        this.LLILZ = baseContact;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C897730ZJr c897730ZJr = new C897730ZJr(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c897730ZJr.LL = obj;
        return c897730ZJr;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DMAvatarResManager@fa0.refreshFixedAvatar$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        UrlModel urlModel = this.LLILLJJLI.LIZIZ.get(this.LLILLL);
        if (urlModel == null) {
            BaseContact baseContact = this.LLILZ;
            String str = this.LLILLL;
            C897710ZJp c897710ZJp = this.LLILLJJLI;
            if (!C897770ZJv.LIZLLL(baseContact.getAvatarThumb(), false)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("refreshFixedUser: avatar from net is not valid for uid=");
                sbLIZ.append(str);
                sbLIZ.append(", marking as invalid");
                C2188811AlT.LIZIZ(sbLIZ);
                C897770ZJv.LIZ();
                c897710ZJp.LJ.put(str, true);
            } else {
                c897710ZJp.LJ.remove(str);
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("DMAvatarResManager@fa0.refreshFixedAvatar$1");
            return unit;
        }
        if (C897780ZJw.LIZ(urlModel, this.LLILZ.getAvatarThumb())) {
            this.LLILLJJLI.LIZIZ.remove(this.LLILLL);
        } else if (C897770ZJv.LIZLLL(this.LLILZ.getAvatarThumb(), false)) {
            this.LLILLJJLI.LJ.remove(this.LLILLL);
            this.LLILLJJLI.LIZLLL(false, this.LLILLL, this.LLILZ.getAvatarThumb());
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("refreshFixedUser: avatar from net is not valid for uid=");
            sbLIZ2.append(this.LLILLL);
            sbLIZ2.append(", marking as invalid");
            C2188811AlT.LIZIZ(sbLIZ2);
            C897770ZJv.LIZ();
            this.LLILLJJLI.LJ.put(this.LLILLL, true);
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("DMAvatarResManager@fa0.refreshFixedAvatar$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
