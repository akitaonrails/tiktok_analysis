package X;

import com.ss.android.ugc.aweme.shortvideo.model.StoryGroupPublishModel;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.ugc.aweme.shortvideo.ui.publishprogress.PublishProgressDialogAddHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0nOj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.scheduler.story.DefaultStoryGroupTaskPublisher$retryGroupTask$1$1", f = "DefaultStoryGroupTaskPublisher.kt", l = {}, m = "invokeSuspend")
public final class C1433150nOj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ List<C1433500nPI> LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ C19EG LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1433150nOj(List<C1433500nPI> list, String str, C19EG c19eg, InterfaceC1364105Vn<? super C1433150nOj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = list;
        this.LLILLJJLI = str;
        this.LLILLL = c19eg;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1433150nOj(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Iterable, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C13BV c13bvSubList;
        C1C7U.LIZ("DefaultStoryGroupTaskPublisher@cdde.retryGroupTask$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Iterator<C1433500nPI> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            String str = it2.next().LLILZIL.LIZIZ;
            C1433240nOs.LIZLLL.remove(str);
            C1433240nOs.LJ.remove(str);
        }
        if (C297680Ble.LIZ()) {
            List<C1433500nPI> list = this.LL;
            c13bvSubList = new ArrayList();
            for (C1433500nPI c1433500nPI : list) {
                C1433500nPI c1433500nPI2 = c1433500nPI;
                if (c1433500nPI2.LLILZIL.LIZLLL.LIZIZ() || c1433500nPI2.LLILZIL.LIZLLL.LIZ()) {
                    c13bvSubList.add(c1433500nPI);
                }
            }
        } else {
            int i = 0;
            for (C1433500nPI c1433500nPI3 : this.LL) {
                if (!c1433500nPI3.LLILZIL.LIZLLL.LIZIZ() && !c1433500nPI3.LLILZIL.LIZLLL.LIZ()) {
                    i++;
                } else if (i >= 0) {
                    List<C1433500nPI> list2 = this.LL;
                    c13bvSubList = list2.subList(i, list2.size());
                } else {
                    c13bvSubList = C13BV.INSTANCE;
                }
            }
            c13bvSubList = C13BV.INSTANCE;
        }
        C201955140j.LJIJJ(C830690WiJ.LIZIZ, "StoryPhotoModePublisher", "retryGroupTask,groupId:" + this.LLILLJJLI + ",firstFailedTaskSize:" + c13bvSubList.size());
        if (!c13bvSubList.isEmpty()) {
            String str2 = this.LLILLJJLI;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(c13bvSubList, 10));
            int i2 = 0;
            for (Object obj2 : c13bvSubList) {
                int i3 = i2 + 1;
                StoryGroupPublishModel storyGroupPublishModelCopy = null;
                if (i2 >= 0) {
                    C1433730nPf c1433730nPf = C1433730nPf.LIZ;
                    PublishModel publishModel = ((C1433500nPI) obj2).LLILZIL.LIZ;
                    StoryGroupPublishModel storyGroupPublishModel = publishModel.storyGroupPublishModel;
                    if (storyGroupPublishModel != null) {
                        storyGroupPublishModelCopy = storyGroupPublishModel.copy(storyGroupPublishModel.groupId, storyGroupPublishModel.childCount, storyGroupPublishModel.childIndex, c13bvSubList.size(), i2, storyGroupPublishModel.failedCount);
                    }
                    publishModel.storyGroupPublishModel = storyGroupPublishModelCopy;
                    c1433730nPf.getClass();
                    C1433500nPI c1433500nPILJI = C1433730nPf.LJI(publishModel);
                    C1433240nOs.LIZ.getClass();
                    c1433500nPILJI.LJZI(new C1433170nOl(c1433500nPILJI));
                    String str3 = c1433500nPILJI.LLILZIL.LIZIZ;
                    C1433240nOs.LIZLLL.add(str3);
                    C1433240nOs.LJ.put(str3, str2);
                    C1433730nPf.LJ(c1433500nPILJI, false);
                    arrayList.add(c1433500nPILJI);
                    i2 = i3;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            C1433240nOs.LIZ.getClass();
            Set<String> set = C1433240nOs.LJII;
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                arrayList2.add(((C1433500nPI) it3.next()).LLILZIL.LIZ.creationId);
            }
            set.addAll(arrayList2);
            C1433240nOs.LIZJ.put(this.LLILLJJLI, arrayList);
            C1433730nPf.LJJII();
            PublishProgressDialogAddHelper.LIZ(PublishProgressDialogAddHelper.LIZ, this.LLILLL, false, 0, 0, false, null, false, false, false, false, 1022);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DefaultStoryGroupTaskPublisher@cdde.retryGroupTask$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
