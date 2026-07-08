package X;

import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.onthisday.OnThisDayTiktokMediaModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0MHx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.lightening.canvas.forward.onthisday.celebration.request.repo.CelebrationMaterialRepo$downloadSelectedAweme$2", f = "CelebrationMaterialRepo.kt", l = {71}, m = "invokeSuspend")
public final class C566030MHx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ ArrayList<OnThisDayTiktokMediaModel> LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ CreativeInfo LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C566030MHx(int i, CreativeInfo creativeInfo, String str, ArrayList arrayList, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = arrayList;
        this.LLILZ = i;
        this.LLILZIL = str;
        this.LLILZLL = creativeInfo;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        ArrayList<OnThisDayTiktokMediaModel> arrayList = this.LLILLL;
        return new C566030MHx(this.LLILZ, this.LLILZLL, this.LLILZIL, arrayList, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        List<ForwardMedia> list;
        C1C7U.LIZ("CelebrationMaterialRepo@27f7.downloadSelectedAweme$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                List list2 = (List) this.LL;
                C155000ia.LIZIZ(obj);
                list = list2;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            ArrayList<OnThisDayTiktokMediaModel> arrayList = this.LLILLL;
            if (arrayList != null) {
                ArrayList arrayList2 = new ArrayList();
                Iterator<OnThisDayTiktokMediaModel> it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ForwardMedia forwardMedia = it2.next().forwardMedia;
                    if (forwardMedia != null) {
                        arrayList2.add(forwardMedia);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : arrayList2) {
                    if (!new C0VSJ(((ForwardMedia) obj2).creationPath).exists()) {
                        arrayList3.add(obj2);
                    }
                }
                C554890LpX c554890LpX = C554890LpX.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("[downloadSelectedAweme] selectedMedia size is ");
                sbLIZ.append(arrayList3.size());
                C201955140j.LIZLLL(c554890LpX, "CeleMaterialRepo", C2188811AlT.LIZIZ(sbLIZ));
                C566620MKe c566620MKe = C566620MKe.LIZ;
                int i2 = this.LLILZ;
                String str = this.LLILZIL;
                this.LL = arrayList3;
                this.LLILLJJLI = 1;
                c566620MKe.getClass();
                Object objLJI = C23250099c.LJI(this, C0PEM.LIZJ, new C317590Ccf(arrayList3, i2, str, null));
                list = arrayList3;
                if (objLJI == objLJFF) {
                    C1C7U.LIZIZ("CelebrationMaterialRepo@27f7.downloadSelectedAweme$2");
                    return objLJFF;
                }
            } else {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("CelebrationMaterialRepo@27f7.downloadSelectedAweme$2");
                return unit;
            }
        }
        CreativeInfo creativeInfo = this.LLILZLL;
        for (ForwardMedia forwardMedia2 : list) {
            C566040MHy.LIZ.getClass();
            String strLIZJ = C570490MZb.LIZJ(C566040MHy.LIZIZ(creativeInfo).getAbsolutePath());
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(strLIZJ);
            sbLIZ2.append(forwardMedia2.localFile);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            if (!C2354709Kn.LIZIZ(strLIZIZ)) {
                C2286708xd.LJFF(forwardMedia2.localPath, strLIZIZ);
            }
            forwardMedia2.setCreationPath(strLIZIZ);
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("CelebrationMaterialRepo@27f7.downloadSelectedAweme$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
