package X;

import android.app.Activity;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.share.ClientScopeResponse;
import com.ss.android.ugc.aweme.share.Scope;
import com.ss.android.ugc.aweme.share.ScopeData;
import com.ss.android.ugc.aweme.share.linkshare.model.LinkShareIntentModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.1B4Y, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
@C09DV(c = "com.ss.android.ugc.aweme.share.linkshare.OpenShareAdapter$getShareDestinations$1", f = "OpenShareAdapter.kt", l = {151}, m = "invokeSuspend")
public final class C1B4Y extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C2198861B4a LLILLJJLI;
    public final /* synthetic */ LinkShareIntentModel LLILLL;
    public final /* synthetic */ Function2<List<? extends EnumC1850560yFy>, Exception, Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1B4Y(C2198861B4a c2198861B4a, LinkShareIntentModel linkShareIntentModel, Function2<? super List<? extends EnumC1850560yFy>, ? super Exception, Unit> function2, InterfaceC1364105Vn<? super C1B4Y> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c2198861B4a;
        this.LLILLL = linkShareIntentModel;
        this.LLILZ = function2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1B4Y(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        List<Scope> list;
        EnumC2198891B4d enumC2198891B4d;
        String str3;
        C1C7U.LIZ("OpenShareAdapter@5a6b.getShareDestinations$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        boolean z = true;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                C2198861B4a c2198861B4a = this.LLILLJJLI;
                C1B4B c1b4b = c2198861B4a.LJII;
                Activity activity = c2198861B4a.LIZ;
                C1402840mbq c1402840mbq = c2198861B4a.LIZLLL;
                LinkShareIntentModel linkShareIntentModel = this.LLILLL;
                String str4 = linkShareIntentModel.link;
                int i2 = C2198901B4e.LIZIZ[linkShareIntentModel.option.ordinal()];
                if (i2 != 1) {
                    if (i2 != 2 && i2 != 3 && i2 != 4) {
                        str = null;
                    } else {
                        str = "music";
                    }
                } else {
                    str = "link";
                }
                this.LL = 1;
                obj = c1b4b.LIZ(activity, c1402840mbq, str4, str, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("OpenShareAdapter@5a6b.getShareDestinations$1");
                    return objLJFF;
                }
            }
            ClientScopeResponse clientScopeResponse = (ClientScopeResponse) obj;
            int i3 = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("scopesResponse ");
            sbLIZ.append(clientScopeResponse);
            C2188811AlT.LIZIZ(sbLIZ);
            ScopeData scopeData = clientScopeResponse.data;
            if (scopeData != null && (str3 = scopeData.appName) != null) {
                LinkShareIntentModel linkShareIntentModel2 = this.LLILLL;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("scopesResponse.data?.appName? ");
                sbLIZ2.append(str3);
                C2188811AlT.LIZIZ(sbLIZ2);
                String str5 = linkShareIntentModel2.title;
                if (str5 != null && str5.length() != 0) {
                    z = false;
                }
                if (z) {
                    linkShareIntentModel2.title = str3;
                }
            }
            ArrayList arrayList = new ArrayList();
            ScopeData scopeData2 = clientScopeResponse.data;
            if (scopeData2 != null && (list = scopeData2.scopes) != null) {
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator<Scope> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(it2.next().name);
                }
                LinkShareIntentModel linkShareIntentModel3 = this.LLILLL;
                int i4 = C2187451AjH.LIZ;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("scopes ");
                sbLIZ3.append(arrayList2);
                C2188811AlT.LIZIZ(sbLIZ3);
                if (arrayList2.contains("share.channel.greenscreen")) {
                    arrayList.add(EnumC1850560yFy.GREEN_SCREEN);
                }
                if (arrayList2.contains("share.channel.photo")) {
                    arrayList.add(EnumC1850560yFy.PHOTO);
                }
                if (arrayList2.contains("share.channel.dm") && (((enumC2198891B4d = linkShareIntentModel3.option) == EnumC2198891B4d.MUSIC || enumC2198891B4d == EnumC2198891B4d.MUSIC_MESSAGE) && C123100dR.LIZ(linkShareIntentModel3.link))) {
                    arrayList.add(EnumC1850560yFy.DM);
                }
            }
            C1402840mbq c1402840mbq2 = this.LLILLJJLI.LIZLLL;
            ScopeData scopeData3 = clientScopeResponse.data;
            if (scopeData3 != null) {
                str2 = scopeData3.appName;
            } else {
                str2 = null;
            }
            c1402840mbq2.mAppName = str2;
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C1346805Ow(arrayList, null, this.LLILZ), 3);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            int i5 = C2187451AjH.LIZ;
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("getShareDestinations exception: ");
            sbLIZ4.append(e.getMessage());
            sbLIZ4.append(" client: ");
            sbLIZ4.append(this.LLILLL.clientKey);
            sbLIZ4.append(" link: ");
            sbLIZ4.append(this.LLILLL.link);
            C1720106oR.LIZ("OpenShareAdapter", C2188811AlT.LIZIZ(sbLIZ4));
            this.LLILZ.invoke(C13BV.INSTANCE, e);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("OpenShareAdapter@5a6b.getShareDestinations$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
