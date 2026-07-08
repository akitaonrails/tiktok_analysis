package X;

import com.ss.android.ugc.aweme.aigc.asynctask.models.AutoPickTaskResponse;
import com.ss.android.ugc.aweme.aigc.asynctask.models.MusicInfo;
import com.ss.android.ugc.aweme.aigc.asynctask.models.TaskProgressInfo;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0L02, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.AutoCut2MAETask$buildAutoPickTemplateInfosWithAVMusic$2", f = "AutoCut2MAETask.kt", l = {877}, m = "invokeSuspend")
public final class C0L02 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends AutoPickTaskResponse>>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ List<TaskProgressInfo> LLILLL;
    public final /* synthetic */ C541110LKb LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0L02(List<TaskProgressInfo> list, C541110LKb c541110LKb, InterfaceC1364105Vn<? super C0L02> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = list;
        this.LLILZ = c541110LKb;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0L02 c0l02 = new C0L02(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c0l02.LLILLJJLI = obj;
        return c0l02;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        TaskProgressInfo next;
        boolean z;
        boolean zAdd;
        AVMusic aVMusic;
        List list;
        List list2;
        Object objLIZ = obj;
        C1C7U.LIZ("AutoCut2MAETask@5514.buildAutoPickTemplateInfosWithAVMusic$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                List list3 = (List) this.LLILLJJLI;
                C155000ia.LIZIZ(objLIZ);
                list2 = list3;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLIZ);
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            if (this.LLILLL.isEmpty()) {
                this.LLILZ.LJJJJIZL("buildAutoPickTemplateInfosWithAVMusic: no successful tasks");
                C13BV c13bv = C13BV.INSTANCE;
                C1C7U.LIZIZ("AutoCut2MAETask@5514.buildAutoPickTemplateInfosWithAVMusic$2");
                return c13bv;
            }
            List<TaskProgressInfo> list4 = this.LLILLL;
            C541110LKb c541110LKb = this.LLILZ;
            Iterator<TaskProgressInfo> it2 = list4.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(next.taskId, c541110LKb.LJIILL)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            TaskProgressInfo taskProgressInfo = next;
            if (taskProgressInfo == null) {
                taskProgressInfo = (TaskProgressInfo) C13LP.LJJJLL(this.LLILLL);
            }
            List<TaskProgressInfo> list5 = this.LLILLL;
            C541110LKb c541110LKb2 = this.LLILZ;
            ArrayList arrayList = new ArrayList();
            for (TaskProgressInfo taskProgressInfo2 : list5) {
                if (!Intrinsics.LJFF(taskProgressInfo2.taskId, c541110LKb2.LJIILL)) {
                    arrayList.add(taskProgressInfo2);
                }
            }
            C541110LKb c541110LKb3 = this.LLILZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("buildAutoPickTemplateInfosWithAVMusic: primary=");
            if (taskProgressInfo != null) {
                z = true;
            } else {
                z = false;
            }
            sbLIZ.append(z);
            sbLIZ.append(", secondary=");
            sbLIZ.append(arrayList.size());
            c541110LKb3.LJJJJIZL(C2188811AlT.LIZIZ(sbLIZ));
            ArrayList arrayList2 = new ArrayList();
            if (taskProgressInfo != null) {
                C541110LKb c541110LKb4 = this.LLILZ;
                MusicInfo musicInfo = c541110LKb4.LJIIL;
                if (musicInfo != null && (aVMusic = musicInfo.avMusic) != null) {
                    c541110LKb4.LJJJJIZL("buildAutoPickTemplateInfosWithAVMusic: reusing musicInfo.avMusic for primary task (handleMusicPhaseCompleted ran first)");
                    zAdd = arrayList2.add(new AutoPickTaskResponse(taskProgressInfo.taskId, taskProgressInfo.nleDraft, taskProgressInfo.musicId, aVMusic, taskProgressInfo.title));
                } else {
                    c541110LKb4.LJJJJIZL("buildAutoPickTemplateInfosWithAVMusic: adding primary task without AVMusic (will be set in handleMusicPhaseCompleted)");
                    zAdd = arrayList2.add(new AutoPickTaskResponse(taskProgressInfo.taskId, taskProgressInfo.nleDraft, taskProgressInfo.musicId, null, taskProgressInfo.title));
                }
                Boolean.valueOf(zAdd);
            }
            list = arrayList2;
            if (!arrayList.isEmpty()) {
                this.LLILZ.LJJJJIZL("buildAutoPickTemplateInfosWithAVMusic: requesting " + arrayList.size() + " secondary AVMusics in parallel");
                C541110LKb c541110LKb5 = this.LLILZ;
                ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(C23250099c.LIZIZ(interfaceC497601wk, null, null, new C0L03(c541110LKb5, (TaskProgressInfo) it3.next(), null), 3));
                }
                this.LLILLJJLI = arrayList2;
                this.LL = 1;
                objLIZ = C1D9F.LIZ(arrayList3, this);
                list2 = arrayList2;
                if (objLIZ == objLJFF) {
                    C1C7U.LIZIZ("AutoCut2MAETask@5514.buildAutoPickTemplateInfosWithAVMusic$2");
                    return objLJFF;
                }
            }
            this.LLILZ.LJJJJIZL("buildAutoPickTemplateInfosWithAVMusic: completed with " + list.size() + '/' + this.LLILLL.size() + " infos");
            C1C7U.LIZIZ("AutoCut2MAETask@5514.buildAutoPickTemplateInfosWithAVMusic$2");
            return list;
        }
        list2.addAll(C13LP.LJJJJLI((Iterable) objLIZ));
        list = list2;
        this.LLILZ.LJJJJIZL("buildAutoPickTemplateInfosWithAVMusic: completed with " + list.size() + '/' + this.LLILLL.size() + " infos");
        C1C7U.LIZIZ("AutoCut2MAETask@5514.buildAutoPickTemplateInfosWithAVMusic$2");
        return list;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends AutoPickTaskResponse>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
