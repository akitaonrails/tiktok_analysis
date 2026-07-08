package X;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.ss.android.ugc.aweme.creative.model.album.ImportVideoInfo;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0L0J, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.editcut.CutOptimizedVideoChosenHandler$resolveMediaForVideo2Sticker$1$1", f = "CutOptimizedVideoChosenHandler.kt", l = {}, m = "invokeSuspend")
public final class C0L0J extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0L7R LL;
    public final /* synthetic */ Intent LLILLJJLI;
    public final /* synthetic */ ArrayList<VideoSegment> LLILLL;
    public final /* synthetic */ List<ImportVideoInfo> LLILZ;
    public final /* synthetic */ Function0<Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0L0J(C0L7R c0l7r, Intent intent, ArrayList<VideoSegment> arrayList, List<ImportVideoInfo> list, Function0<Unit> function0, InterfaceC1364105Vn<? super C0L0J> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0l7r;
        this.LLILLJJLI = intent;
        this.LLILLL = arrayList;
        this.LLILZ = list;
        this.LLILZIL = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0L0J(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("CutOptimizedVideoChosenHandler@f6e3.resolveMediaForVideo2Sticker$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0L7R c0l7r = this.LL;
        Intent intent = this.LLILLJJLI;
        ArrayList<VideoSegment> arrayList = this.LLILLL;
        ArrayList<ImportVideoInfo> arrayList2 = new ArrayList<>(this.LLILZ);
        Activity activity = c0l7r.LJIIJ.get();
        if (activity != null) {
            Workspace workspaceLIZ = C14D2.LIZ(C537520L6g.LIZ(intent));
            C571550MbJ.LIZ.getClass();
            EditPreviewInfo editPreviewInfoLIZ = C571550MbJ.LIZ(true, workspaceLIZ, arrayList, new long[]{-1, -1});
            intent.putExtra("workspace", workspaceLIZ);
            C0MUK.LIZIZ(intent).editModel.editPreviewInfo = editPreviewInfoLIZ;
            if (!arrayList2.isEmpty()) {
                C0MUK.LIZIZ(intent).albumModel.importInfoList = arrayList2;
            }
            RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity, intent, "Activity_startActivityForResult_2");
            C1701330uNH.LIZ(intent, activity);
            C2204961BRm.LJIIZILJ(10027780, activity, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhmcbMnY8IHbTbwryD02BNDpCgKbY+KUPPjLxRCY9qBtr6p4N1qtQ=", null));
        }
        this.LLILZIL.invoke();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CutOptimizedVideoChosenHandler@f6e3.resolveMediaForVideo2Sticker$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
