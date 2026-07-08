package X;

import com.ss.android.ugc.aweme.prop.mobileefffect.EditImage;
import com.ss.android.ugc.aweme.prop.mobileefffect.EditImageEffectImgCreatorData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0vJz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.prop.mobileefffect.preupload.task.prepare.CropIconTask$run$2", f = "CropIconTask.kt", l = {51}, m = "invokeSuspend")
public final class C1737730vJz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ List<EditImage> LLILLL;
    public final /* synthetic */ C1737760vK2 LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1737730vJz(List<EditImage> list, C1737760vK2 c1737760vK2, InterfaceC1364105Vn<? super C1737730vJz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = list;
        this.LLILZ = c1737760vK2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1737730vJz c1737730vJz = new C1737730vJz(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c1737730vJz.LLILLJJLI = obj;
        return c1737730vJz;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        EnumC1736950vIj enumC1736950vIj;
        EnumC1736950vIj enumC1736950vIj2;
        C1C7U.LIZ("CropIconTask@eb99.run$2");
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
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            List<EditImage> list = this.LLILLL;
            if (list != null && !list.isEmpty()) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                C201955140j.LJIIIIZZ(C830690WiJ.LIZIZ, "AmeEffectPublisher", "CropIconTask, empty iconPath");
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("CropIconTask@eb99.run$2");
                return unit;
            }
            List<EditImage> list2 = this.LLILLL;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator<EditImage> it2 = list2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (new C0VSJ(it2.next().url.getPath()).exists()) {
                        List<EditImage> list3 = this.LLILLL;
                        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                            Iterator<EditImage> it3 = list3.iterator();
                            while (it3.hasNext()) {
                                if (new C0VSJ(it3.next().url.getPath()).isDirectory()) {
                                }
                            }
                        }
                        ArrayList arrayList = new ArrayList();
                        List<EditImage> list4 = this.LLILLL;
                        C1737760vK2 c1737760vK2 = this.LLILZ;
                        ArrayList<EditImage> arrayList2 = new ArrayList();
                        Iterator<EditImage> it4 = list4.iterator();
                        while (true) {
                            C1737770vK3 c1737770vK3 = null;
                            if (!it4.hasNext()) {
                                break;
                            }
                            EditImage next = it4.next();
                            EditImage editImage = next;
                            EditImageEffectImgCreatorData editImageEffectImgCreatorData = editImage.effectImgCreatorData;
                            if (editImageEffectImgCreatorData != null && (enumC1736950vIj2 = editImageEffectImgCreatorData.iconCategoryType) != null) {
                                Iterator<C1737770vK3> it5 = c1737760vK2.LIZIZ.LIZLLL.iterator();
                                while (true) {
                                    if (!it5.hasNext()) {
                                        break;
                                    }
                                    C1737770vK3 next2 = it5.next();
                                    if (next2.LIZJ == enumC1736950vIj2) {
                                        c1737770vK3 = next2;
                                        break;
                                    }
                                }
                                C1737770vK3 c1737770vK32 = c1737770vK3;
                                if (c1737770vK32 == null || !Intrinsics.LJFF(c1737770vK32.LIZ, editImage.url.getPath())) {
                                    arrayList2.add(next);
                                }
                            }
                        }
                        C1737760vK2 c1737760vK22 = this.LLILZ;
                        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
                        for (EditImage editImage2 : arrayList2) {
                            EditImageEffectImgCreatorData editImageEffectImgCreatorData2 = editImage2.effectImgCreatorData;
                            if (editImageEffectImgCreatorData2 != null && (enumC1736950vIj = editImageEffectImgCreatorData2.iconCategoryType) != null) {
                                arrayList.add(C23250099c.LIZIZ(interfaceC497601wk, null, null, new C1737740vK0(c1737760vK22, enumC1736950vIj, editImage2, editImageEffectImgCreatorData2, null), 3));
                            }
                            arrayList3.add(Unit.LIZ);
                        }
                        this.LL = 1;
                        if (C1D9F.LIZ(arrayList, this) == objLJFF) {
                            C1C7U.LIZIZ("CropIconTask@eb99.run$2");
                            return objLJFF;
                        }
                    }
                }
            }
            C201955140j.LJIIIIZZ(C830690WiJ.LIZIZ, "AmeEffectPublisher", "CropIconTask, iconPath file not exits or it's a dir");
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("CropIconTask@eb99.run$2");
            return unit2;
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("CropIconTask@eb99.run$2");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
